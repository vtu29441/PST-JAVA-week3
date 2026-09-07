import java.util.*;

enum Color {
    RED, GREEN
}

abstract class Tree {
    private int value;
    private Color color;
    private int depth;

    public Tree(int value, Color color, int depth) {
        this.value = value;
        this.color = color;
        this.depth = depth;
    }

    public int getValue() {
        return value;
    }

    public Color getColor() {
        return color;
    }

    public int getDepth() {
        return depth;
    }

    public abstract void accept(TreeVis visitor);
}

class TreeNode extends Tree {
    private ArrayList<Tree> children = new ArrayList<>();

    public TreeNode(int value, Color color, int depth) {
        super(value, color, depth);
    }

    public void addChild(Tree child) {
        children.add(child);
    }

    public void accept(TreeVis visitor) {
        visitor.visitNode(this);

        for (Tree child : children) {
            child.accept(visitor);
        }
    }
}

class TreeLeaf extends Tree {

    public TreeLeaf(int value, Color color, int depth) {
        super(value, color, depth);
    }

    public void accept(TreeVis visitor) {
        visitor.visitLeaf(this);
    }
}

abstract class TreeVis {
    public abstract int getResult();
    public abstract void visitNode(TreeNode node);
    public abstract void visitLeaf(TreeLeaf leaf);
}


class SumInLeavesVisitor extends TreeVis {
    private int sum = 0;

    public int getResult() {
        return sum;
    }

    public void visitNode(TreeNode node) {
    }

    public void visitLeaf(TreeLeaf leaf) {
        sum += leaf.getValue();
    }
}


class ProductOfRedNodesVisitor extends TreeVis {
    private static final int MOD = 1_000_000_007;
    private long product = 1;

    public int getResult() {
        return (int) product;
    }

    public void visitNode(TreeNode node) {
        if (node.getColor() == Color.RED) {
            product = (product * node.getValue()) % MOD;
        }
    }

    public void visitLeaf(TreeLeaf leaf) {
        if (leaf.getColor() == Color.RED) {
            product = (product * leaf.getValue()) % MOD;
        }
    }
}


class FancyVisitor extends TreeVis {
    private int evenDepthSum = 0;
    private int greenLeafSum = 0;

    public int getResult() {
        return Math.abs(evenDepthSum - greenLeafSum);
    }

    public void visitNode(TreeNode node) {
        if (node.getDepth() % 2 == 0) {
            evenDepthSum += node.getValue();
        }
    }

    public void visitLeaf(TreeLeaf leaf) {
        if (leaf.getColor() == Color.GREEN) {
            greenLeafSum += leaf.getValue();
        }
    }
}


public class Solution {

    static int[] values;
    static Color[] colors;
    static List<List<Integer>> graph;

    public static void main(String[] args) {

        Tree root = solve();

        SumInLeavesVisitor sumVisitor = new SumInLeavesVisitor();
        ProductOfRedNodesVisitor productVisitor =
                new ProductOfRedNodesVisitor();
        FancyVisitor fancyVisitor = new FancyVisitor();

        root.accept(sumVisitor);
        root.accept(productVisitor);
        root.accept(fancyVisitor);

        System.out.println(sumVisitor.getResult());
        System.out.println(productVisitor.getResult());
        System.out.println(fancyVisitor.getResult());
    }


    public static Tree solve() {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        values = new int[n + 1];
        colors = new Color[n + 1];

        // Read values
        for (int i = 1; i <= n; i++) {
            values[i] = sc.nextInt();
        }

        // Read colors
        for (int i = 1; i <= n; i++) {
            int color = sc.nextInt();
            colors[i] = (color == 0)
                    ? Color.RED
                    : Color.GREEN;
        }

        // Create adjacency list
        graph = new ArrayList<>();

        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<>());
        }

        // Read edges
        for (int i = 0; i < n - 1; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();

            graph.get(u).add(v);
            graph.get(v).add(u);
        }

        // Single node tree
        if (n == 1) {
            return new TreeLeaf(values[1], colors[1], 0);
        }

        return buildTree(1, 0, 0);
    }


    static Tree buildTree(int current, int parent, int depth) {

        boolean isLeaf = true;

        for (int next : graph.get(current)) {
            if (next != parent) {
                isLeaf = false;
                break;
            }
        }

        if (isLeaf) {
            return new TreeLeaf(
                    values[current],
                    colors[current],
                    depth
            );
        }

        TreeNode node = new TreeNode(
                values[current],
                colors[current],
                depth
        );

        for (int next : graph.get(current)) {
            if (next != parent) {
                node.addChild(
                        buildTree(next, current, depth + 1)
                );
            }
        }

        return node;
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna