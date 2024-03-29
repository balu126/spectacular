package minderupt.spectacular.spike;

import org.junit.Test;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertEquals;

import javax.script.ScriptEngineManager;
import javax.script.ScriptEngine;
import javax.script.ScriptContext;
import javax.script.Invocable;
import java.io.FileReader;

/**
 * Created by IntelliJ IDEA.
 * User: michaeldowling
 * Date: Nov 13, 2009
 * Time: 11:06:19 PM
 * To change this template use File | Settings | File Templates.
 */
public class JRubySpikeTest {

    @Test
    public void testGeneralEmbeddedRuby() throws Exception {

        ScriptEngineManager manager = new ScriptEngineManager();
        ScriptEngine engine = manager.getEngineByName("jruby");
        assertNotNull(engine);

        FileReader script = new FileReader("src/test/ruby/JRubySpike.rb");
        ScriptContext vars = engine.getContext();

        vars.setAttribute("yourmom", "yourmomma", ScriptContext.ENGINE_SCOPE);
        engine.eval(script, vars);
        String what = (String) engine.getContext().getAttribute("what");

        assertNotNull(what);
        assertEquals("OMG WHAT", what);

    }


    @Test
    public void testJRubyCallbackToJavaObject() throws Exception {

        ScriptEngineManager manager = new ScriptEngineManager();
        ScriptEngine engine = manager.getEngineByName("jruby");
        assertNotNull(engine);

        FileReader script = new FileReader("src/test/ruby/JRubyCallback.rb");

        Object stepLoader = engine.eval(script);

        // set reference to self
        SampleIndexer indexer = new SampleIndexer();
        Invocable invoke = (Invocable) engine;
        invoke.invokeMethod(stepLoader, "setJavaCallback", indexer);
        invoke.invokeMethod(stepLoader, "loadSteps", "src/test/ruby/JRubyUserScriptCallback.rb");


    }


}
