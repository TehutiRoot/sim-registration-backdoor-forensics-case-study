package ch.qos.logback.core.joran.action;

import ch.qos.logback.core.joran.spi.ActionException;
import ch.qos.logback.core.joran.spi.InterpretationContext;
import ch.qos.logback.core.spi.ContextAware;
import ch.qos.logback.core.spi.LifeCycle;
import ch.qos.logback.core.status.StatusListener;
import ch.qos.logback.core.util.OptionHelper;
import org.xml.sax.Attributes;

/* loaded from: classes.dex */
public class StatusListenerAction extends Action {

    /* renamed from: c */
    public boolean f39787c = false;

    /* renamed from: d */
    public Boolean f39788d = null;

    /* renamed from: e */
    public StatusListener f39789e = null;

    /* renamed from: b */
    public final boolean m51510b() {
        Boolean bool = this.f39788d;
        if (bool == null) {
            return false;
        }
        return bool.booleanValue();
    }

    @Override // ch.qos.logback.core.joran.action.Action
    public void begin(InterpretationContext interpretationContext, String str, Attributes attributes) throws ActionException {
        this.f39787c = false;
        this.f39788d = null;
        String value = attributes.getValue(Action.CLASS_ATTRIBUTE);
        if (OptionHelper.isEmpty(value)) {
            addError("Missing class name for statusListener. Near [" + str + "] line " + getLineNumber(interpretationContext));
            this.f39787c = true;
            return;
        }
        try {
            this.f39789e = (StatusListener) OptionHelper.instantiateByClassName(value, StatusListener.class, this.context);
            this.f39788d = Boolean.valueOf(interpretationContext.getContext().getStatusManager().add(this.f39789e));
            StatusListener statusListener = this.f39789e;
            if (statusListener instanceof ContextAware) {
                ((ContextAware) statusListener).setContext(this.context);
            }
            addInfo("Added status listener of type [" + value + "]");
            interpretationContext.pushObject(this.f39789e);
        } catch (Exception e) {
            this.f39787c = true;
            addError("Could not create an StatusListener of type [" + value + "].", e);
            throw new ActionException(e);
        }
    }

    @Override // ch.qos.logback.core.joran.action.Action
    public void end(InterpretationContext interpretationContext, String str) {
        if (this.f39787c) {
            return;
        }
        if (m51510b()) {
            StatusListener statusListener = this.f39789e;
            if (statusListener instanceof LifeCycle) {
                ((LifeCycle) statusListener).start();
            }
        }
        if (interpretationContext.peekObject() != this.f39789e) {
            addWarn("The object at the of the stack is not the statusListener pushed earlier.");
        } else {
            interpretationContext.popObject();
        }
    }

    public void finish(InterpretationContext interpretationContext) {
    }
}