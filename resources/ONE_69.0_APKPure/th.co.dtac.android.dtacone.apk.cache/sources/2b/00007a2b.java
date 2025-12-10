package ch.qos.logback.core.joran.action;

import ch.qos.logback.core.joran.spi.InterpretationContext;
import ch.qos.logback.core.joran.util.PropertySetter;
import org.xml.sax.Attributes;

/* loaded from: classes.dex */
public class ParamAction extends Action {

    /* renamed from: d */
    public static String f39781d = "No name attribute in <param> element";

    /* renamed from: e */
    public static String f39782e = "No value attribute in <param> element";

    /* renamed from: c */
    public boolean f39783c = false;

    @Override // ch.qos.logback.core.joran.action.Action
    public void begin(InterpretationContext interpretationContext, String str, Attributes attributes) {
        String value = attributes.getValue("name");
        String value2 = attributes.getValue("value");
        if (value == null) {
            this.f39783c = true;
            addError(f39781d);
        } else if (value2 == null) {
            this.f39783c = true;
            addError(f39782e);
        } else {
            String trim = value2.trim();
            PropertySetter propertySetter = new PropertySetter(interpretationContext.peekObject());
            propertySetter.setContext(this.context);
            propertySetter.setProperty(interpretationContext.subst(value), interpretationContext.subst(trim));
        }
    }

    @Override // ch.qos.logback.core.joran.action.Action
    public void end(InterpretationContext interpretationContext, String str) {
    }

    public void finish(InterpretationContext interpretationContext) {
    }
}