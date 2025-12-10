package ch.qos.logback.core.joran.spi;

import ch.qos.logback.core.Context;
import ch.qos.logback.core.joran.event.InPlayListener;
import ch.qos.logback.core.joran.event.SaxEvent;
import ch.qos.logback.core.spi.ContextAwareBase;
import ch.qos.logback.core.spi.PropertyContainer;
import ch.qos.logback.core.util.OptionHelper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Stack;
import org.xml.sax.Locator;

/* loaded from: classes.dex */
public class InterpretationContext extends ContextAwareBase implements PropertyContainer {

    /* renamed from: c */
    public Stack f39811c;

    /* renamed from: d */
    public Map f39812d;

    /* renamed from: e */
    public Map f39813e;

    /* renamed from: f */
    public Interpreter f39814f;

    /* renamed from: g */
    public final List f39815g = new ArrayList();

    /* renamed from: h */
    public DefaultNestedComponentRegistry f39816h = new DefaultNestedComponentRegistry();

    public InterpretationContext(Context context, Interpreter interpreter) {
        this.context = context;
        this.f39814f = interpreter;
        this.f39811c = new Stack();
        this.f39812d = new HashMap(5);
        this.f39813e = new HashMap(5);
    }

    public void addInPlayListener(InPlayListener inPlayListener) {
        if (!this.f39815g.contains(inPlayListener)) {
            this.f39815g.add(inPlayListener);
            return;
        }
        addWarn("InPlayListener " + inPlayListener + " has been already registered");
    }

    public void addSubstitutionProperties(Properties properties) {
        if (properties == null) {
            return;
        }
        for (String str : properties.keySet()) {
            addSubstitutionProperty(str, properties.getProperty(str));
        }
    }

    public void addSubstitutionProperty(String str, String str2) {
        if (str == null || str2 == null) {
            return;
        }
        this.f39813e.put(str, str2.trim());
    }

    /* renamed from: b */
    public void m51504b(SaxEvent saxEvent) {
        for (InPlayListener inPlayListener : this.f39815g) {
            inPlayListener.inPlay(saxEvent);
        }
    }

    /* renamed from: d */
    public void m51503d(Map map) {
        this.f39813e = map;
    }

    @Override // ch.qos.logback.core.spi.PropertyContainer
    public Map<String, String> getCopyOfPropertyMap() {
        return new HashMap(this.f39813e);
    }

    public DefaultNestedComponentRegistry getDefaultNestedComponentRegistry() {
        return this.f39816h;
    }

    public Interpreter getJoranInterpreter() {
        return this.f39814f;
    }

    public Locator getLocator() {
        return this.f39814f.getLocator();
    }

    public Object getObject(int i) {
        return this.f39811c.get(i);
    }

    public Map<String, Object> getObjectMap() {
        return this.f39812d;
    }

    public Stack<Object> getObjectStack() {
        return this.f39811c;
    }

    @Override // ch.qos.logback.core.spi.PropertyContainer
    public String getProperty(String str) {
        String str2 = (String) this.f39813e.get(str);
        return str2 != null ? str2 : this.context.getProperty(str);
    }

    public boolean isEmpty() {
        return this.f39811c.isEmpty();
    }

    public boolean isListenerListEmpty() {
        return this.f39815g.isEmpty();
    }

    public Object peekObject() {
        return this.f39811c.peek();
    }

    public Object popObject() {
        return this.f39811c.pop();
    }

    public void pushObject(Object obj) {
        this.f39811c.push(obj);
    }

    public boolean removeInPlayListener(InPlayListener inPlayListener) {
        return this.f39815g.remove(inPlayListener);
    }

    public String subst(String str) {
        if (str == null) {
            return null;
        }
        return OptionHelper.substVars(str, this, this.context);
    }
}
