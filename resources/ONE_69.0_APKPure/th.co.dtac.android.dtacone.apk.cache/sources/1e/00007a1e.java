package ch.qos.logback.core.joran.action;

import ch.qos.logback.core.Appender;
import ch.qos.logback.core.joran.spi.ActionException;
import ch.qos.logback.core.joran.spi.InterpretationContext;
import ch.qos.logback.core.spi.LifeCycle;
import ch.qos.logback.core.util.OptionHelper;
import java.util.HashMap;
import org.xml.sax.Attributes;

/* loaded from: classes.dex */
public class AppenderAction<E> extends Action {

    /* renamed from: c */
    public Appender f39761c;

    /* renamed from: d */
    public boolean f39762d = false;

    /* renamed from: b */
    public final void m51518b(String str) {
        if (str.equals("ch.qos.logback.core.ConsoleAppender")) {
            addWarn("ConsoleAppender is deprecated for LogcatAppender");
        }
    }

    @Override // ch.qos.logback.core.joran.action.Action
    public void begin(InterpretationContext interpretationContext, String str, Attributes attributes) throws ActionException {
        this.f39761c = null;
        this.f39762d = false;
        String value = attributes.getValue(Action.CLASS_ATTRIBUTE);
        if (OptionHelper.isEmpty(value)) {
            addError("Missing class name for appender. Near [" + str + "] line " + getLineNumber(interpretationContext));
            this.f39762d = true;
            return;
        }
        try {
            addInfo("About to instantiate appender of type [" + value + "]");
            m51518b(value);
            Appender appender = (Appender) OptionHelper.instantiateByClassName(value, Appender.class, this.context);
            this.f39761c = appender;
            appender.setContext(this.context);
            String subst = interpretationContext.subst(attributes.getValue("name"));
            if (OptionHelper.isEmpty(subst)) {
                addWarn("No appender name given for appender of type " + value + "].");
            } else {
                this.f39761c.setName(subst);
                addInfo("Naming appender as [" + subst + "]");
            }
            ((HashMap) interpretationContext.getObjectMap().get(ActionConst.APPENDER_BAG)).put(subst, this.f39761c);
            interpretationContext.pushObject(this.f39761c);
        } catch (Exception e) {
            this.f39762d = true;
            addError("Could not create an Appender of type [" + value + "].", e);
            throw new ActionException(e);
        }
    }

    @Override // ch.qos.logback.core.joran.action.Action
    public void end(InterpretationContext interpretationContext, String str) {
        if (this.f39762d) {
            return;
        }
        Appender appender = this.f39761c;
        if (appender instanceof LifeCycle) {
            appender.start();
        }
        if (interpretationContext.peekObject() == this.f39761c) {
            interpretationContext.popObject();
            return;
        }
        addWarn("The object at the of the stack is not the appender named [" + this.f39761c.getName() + "] pushed earlier.");
    }
}