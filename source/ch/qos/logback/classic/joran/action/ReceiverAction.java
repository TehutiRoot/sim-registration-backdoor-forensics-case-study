package ch.qos.logback.classic.joran.action;

import ch.qos.logback.classic.net.ReceiverBase;
import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.joran.spi.ActionException;
import ch.qos.logback.core.joran.spi.InterpretationContext;
import ch.qos.logback.core.util.OptionHelper;
import org.xml.sax.Attributes;

/* loaded from: classes.dex */
public class ReceiverAction extends Action {

    /* renamed from: c */
    public ReceiverBase f39552c;

    /* renamed from: d */
    public boolean f39553d;

    @Override // ch.qos.logback.core.joran.action.Action
    public void begin(InterpretationContext interpretationContext, String str, Attributes attributes) throws ActionException {
        String value = attributes.getValue(Action.CLASS_ATTRIBUTE);
        if (OptionHelper.isEmpty(value)) {
            addError("Missing class name for receiver. Near [" + str + "] line " + getLineNumber(interpretationContext));
            this.f39553d = true;
            return;
        }
        try {
            addInfo("About to instantiate receiver of type [" + value + "]");
            ReceiverBase receiverBase = (ReceiverBase) OptionHelper.instantiateByClassName(value, ReceiverBase.class, this.context);
            this.f39552c = receiverBase;
            receiverBase.setContext(this.context);
            interpretationContext.pushObject(this.f39552c);
        } catch (Exception e) {
            this.f39553d = true;
            addError("Could not create a receiver of type [" + value + "].", e);
            throw new ActionException(e);
        }
    }

    @Override // ch.qos.logback.core.joran.action.Action
    public void end(InterpretationContext interpretationContext, String str) throws ActionException {
        if (this.f39553d) {
            return;
        }
        interpretationContext.getContext().register(this.f39552c);
        this.f39552c.start();
        if (interpretationContext.peekObject() != this.f39552c) {
            addWarn("The object at the of the stack is not the remote pushed earlier.");
        } else {
            interpretationContext.popObject();
        }
    }
}
