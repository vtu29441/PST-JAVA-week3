# [Java Iterator](https://www.hackerrank.com/challenges/java-iterator/problem)
## Easy
<div class="challenge-body-html"><div class="challenge_problem_statement"><div class="msB challenge_problem_statement_body"><div class="hackdown-content"><svg style="display: none;"><defs id="MathJax_SVG_glyphs"></defs></svg><p>Java Iterator class can help you to iterate through every element in a collection. Here is a simple example:</p>

<div class="highlight"><pre><span class="kn">import</span> <span class="nn">java.util.*</span><span class="o">;</span>
<span class="kd">public</span> <span class="kd">class</span> <span class="nc">Example</span><span class="o">{</span>

    <span class="kd">public</span> <span class="kd">static</span> <span class="kt">void</span> <span class="nf">main</span><span class="o">(</span><span class="n">String</span> <span class="o">[]</span><span class="n">args</span><span class="o">){</span>
        <span class="n">ArrayList</span> <span class="n">mylist</span> <span class="o">=</span> <span class="k">new</span> <span class="n">ArrayList</span><span class="o">();</span>
        <span class="n">mylist</span><span class="o">.</span><span class="na">add</span><span class="o">(</span><span class="s">"Hello"</span><span class="o">);</span>
        <span class="n">mylist</span><span class="o">.</span><span class="na">add</span><span class="o">(</span><span class="s">"Java"</span><span class="o">);</span>
        <span class="n">mylist</span><span class="o">.</span><span class="na">add</span><span class="o">(</span><span class="s">"4"</span><span class="o">);</span>
        <span class="n">Iterator</span> <span class="n">it</span> <span class="o">=</span> <span class="n">mylist</span><span class="o">.</span><span class="na">iterator</span><span class="o">();</span>
        <span class="k">while</span><span class="o">(</span><span class="n">it</span><span class="o">.</span><span class="na">hasNext</span><span class="o">()){</span>
            <span class="n">Object</span> <span class="n">element</span> <span class="o">=</span> <span class="n">it</span><span class="o">.</span><span class="na">next</span><span class="o">();</span>
            <span class="n">System</span><span class="o">.</span><span class="na">out</span><span class="o">.</span><span class="na">println</span><span class="o">((</span><span class="n">String</span><span class="o">)</span><span class="n">element</span><span class="o">);</span>
        <span class="o">}</span>
    <span class="o">}</span>
<span class="o">}</span>
</pre></div>


<p>In this problem you need to complete a method <em>func</em>. The method takes an <em>ArrayList</em> as input. In that <em>ArrayList</em> there is one or more integer numbers, then there is a special string "###", after that there are one or more other strings. A sample <em>ArrayList</em> may look like this:</p>

<pre><code>element[0]=&gt;42
element[1]=&gt;10
element[2]=&gt;"###"
element[3]=&gt;"Hello"
element[4]=&gt;"Java"
</code></pre>

<p>You have to modify the <em>func</em> method by editing <code>at most 2 lines</code> so that the code only prints the elements after the special string "###". For the sample above the output will be:</p>

<pre><code>Hello
Java
</code></pre>

<p><em>Note:</em> The stdin doesn't contain the string <em>"###"</em>, it is added in the <em>main</em> method.  </p>

<p>To restore the original code in the editor, click the top left icon on the editor and create a new buffer.</p></div></div></div></div>