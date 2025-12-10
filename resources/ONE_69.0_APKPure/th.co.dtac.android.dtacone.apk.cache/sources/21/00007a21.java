package ch.qos.logback.core.joran.action;

import ch.qos.logback.core.joran.action.ActionUtil;
import ch.qos.logback.core.joran.spi.ActionException;
import ch.qos.logback.core.joran.spi.InterpretationContext;
import ch.qos.logback.core.spi.LifeCycle;
import ch.qos.logback.core.spi.PropertyDefiner;
import ch.qos.logback.core.util.OptionHelper;
import org.xml.sax.Attributes;

/* loaded from: classes.dex */
public class DefinePropertyAction extends Action {

    /* renamed from: c */
    public String f39765c;

    /* renamed from: d */
    public ActionUtil.Scope f39766d;

    /* renamed from: e */
    public String f39767e;

    /* renamed from: f */
    public PropertyDefiner f39768f;

    /* renamed from: g */
    public boolean f39769g;

    @Override // ch.qos.logback.core.joran.action.Action
    public void begin(InterpretationContext interpretationContext, String str, Attributes attributes) throws ActionException {
        StringBuilder sb;
        String str2;
        this.f39765c = null;
        this.f39766d = null;
        this.f39767e = null;
        this.f39768f = null;
        this.f39769g = false;
        this.f39767e = attributes.getValue("name");
        String value = attributes.getValue(Action.SCOPE_ATTRIBUTE);
        this.f39765c = value;
        this.f39766d = ActionUtil.stringToScope(value);
        if (OptionHelper.isEmpty(this.f39767e)) {
            sb = new StringBuilder();
            str2 = "Missing property name for property definer. Near [";
        } else {
            String value2 = attributes.getValue(Action.CLASS_ATTRIBUTE);
            if (!OptionHelper.isEmpty(value2)) {
                try {
                    addInfo("About to instantiate property definer of type [" + value2 + "]");
                    PropertyDefiner propertyDefiner = (PropertyDefiner) OptionHelper.instantiateByClassName(value2, PropertyDefiner.class, this.context);
                    this.f39768f = propertyDefiner;
                    propertyDefiner.setContext(this.context);
                    PropertyDefiner propertyDefiner2 = this.f39768f;
                    if (propertyDefiner2 instanceof LifeCycle) {
                        ((LifeCycle) propertyDefiner2).start();
                    }
                    interpretationContext.pushObject(this.f39768f);
                    return;
                } catch (Exception e) {
                    this.f39769g = true;
                    addError("Could not create an PropertyDefiner of type [" + value2 + "].", e);
                    throw new ActionException(e);
                }
            }
            sb = new StringBuilder();
            str2 = "Missing class name for property definer. Near [";
        }
        sb.append(str2);
        sb.append(str);
        sb.append("] line ");
        sb.append(getLineNumber(interpretationContext));
        addError(sb.toString());
        this.f39769g = true;
    }

    @Override // ch.qos.logback.core.joran.action.Action
    public void end(InterpretationContext interpretationContext, String str) {
        if (this.f39769g) {
            return;
        }
        if (interpretationContext.peekObject() != this.f39768f) {
            addWarn("The object at the of the stack is not the property definer for property named [" + this.f39767e + "] pushed earlier.");
            return;
        }
        addInfo("Popping property definer for property named [" + this.f39767e + "] from the object stack");
        interpretationContext.popObject();
        String propertyValue = this.f39768f.getPropertyValue();
        if (propertyValue != null) {
            ActionUtil.setProperty(interpretationContext, this.f39767e, propertyValue, this.f39766d);
        }
    }
}