package ch.qos.logback.classic.joran.action;

import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.classic.spi.LoggerContextListener;
import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.joran.spi.ActionException;
import ch.qos.logback.core.joran.spi.InterpretationContext;
import ch.qos.logback.core.spi.ContextAware;
import ch.qos.logback.core.spi.LifeCycle;
import ch.qos.logback.core.util.OptionHelper;
import org.xml.sax.Attributes;

/* loaded from: classes.dex */
public class LoggerContextListenerAction extends Action {

    /* renamed from: c */
    public boolean f39550c = false;

    /* renamed from: d */
    public LoggerContextListener f39551d;

    @Override // ch.qos.logback.core.joran.action.Action
    public void begin(InterpretationContext interpretationContext, String str, Attributes attributes) throws ActionException {
        this.f39550c = false;
        String value = attributes.getValue(Action.CLASS_ATTRIBUTE);
        if (OptionHelper.isEmpty(value)) {
            addError("Mandatory \"class\" attribute not set for <loggerContextListener> element");
            this.f39550c = true;
            return;
        }
        try {
            LoggerContextListener loggerContextListener = (LoggerContextListener) OptionHelper.instantiateByClassName(value, LoggerContextListener.class, this.context);
            this.f39551d = loggerContextListener;
            if (loggerContextListener instanceof ContextAware) {
                ((ContextAware) loggerContextListener).setContext(this.context);
            }
            interpretationContext.pushObject(this.f39551d);
            addInfo("Adding LoggerContextListener of type [" + value + "] to the object stack");
        } catch (Exception e) {
            this.f39550c = true;
            addError("Could not create LoggerContextListener of type " + value + "].", e);
        }
    }

    @Override // ch.qos.logback.core.joran.action.Action
    public void end(InterpretationContext interpretationContext, String str) throws ActionException {
        if (this.f39550c) {
            return;
        }
        Object peekObject = interpretationContext.peekObject();
        LoggerContextListener loggerContextListener = this.f39551d;
        if (peekObject != loggerContextListener) {
            addWarn("The object on the top the of the stack is not the LoggerContextListener pushed earlier.");
            return;
        }
        if (loggerContextListener instanceof LifeCycle) {
            ((LifeCycle) loggerContextListener).start();
            addInfo("Starting LoggerContextListener");
        }
        ((LoggerContext) this.context).addListener(this.f39551d);
        interpretationContext.popObject();
    }
}
