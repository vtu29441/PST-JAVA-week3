# [Java Factory Pattern](https://www.hackerrank.com/challenges/java-factory/problem)
## Easy
<div class="challenge-body-html"><div class="challenge_problem_statement"><div class="msB challenge_problem_statement_body"><div class="hackdown-content"><svg style="display: none;"><defs id="MathJax_SVG_glyphs"></defs></svg><p>According to Wikipedia, a factory is simply an object that returns another object from some other method call, which is assumed to be "new".</p>

<p>In this problem, you are given an interface <em>Food</em>. There are two classes <em>Pizza</em> and <em>Cake</em> which implement the <em>Food</em> interface, and they both contain a method <em>getType</em>().</p>

<p>The main function in the <em>Main</em> class creates an instance of the <em>FoodFactory</em> class. The <em>FoodFactory</em> class contains a method <em>getFood(String)</em> that returns a new instance of <em>Pizza</em> or <em>Cake</em> according to its parameter.</p>

<p>You are given the partially completed code in the editor. Please complete the <em>FoodFactory</em> class.</p>

<p><strong>Sample Input 1</strong></p>

<pre><code>cake
</code></pre>

<p><strong>Sample Output 1</strong></p>

<pre><code>The factory returned class Cake
Someone ordered a Dessert!
</code></pre>

<p><strong>Sample Input 2</strong></p>

<pre><code>pizza
</code></pre>

<p><strong>Sample Output 2</strong></p>

<pre><code>The factory returned class Pizza
Someone ordered Fast Food!
</code></pre></div></div></div></div>