package ch.qos.logback.core.joran.action;

import ch.qos.logback.core.joran.action.ActionUtil;
import ch.qos.logback.core.joran.spi.ActionException;
import ch.qos.logback.core.joran.spi.InterpretationContext;
import ch.qos.logback.core.util.CachingDateFormatter;
import ch.qos.logback.core.util.OptionHelper;
import org.xml.sax.Attributes;

/* loaded from: classes.dex */
public class TimestampAction extends Action {

    /* renamed from: d */
    public static String f39792d = "datePattern";

    /* renamed from: e */
    public static String f39793e = "timeReference";

    /* renamed from: f */
    public static String f39794f = "contextBirth";

    /* renamed from: c */
    public boolean f39795c = false;

    @Override // ch.qos.logback.core.joran.action.Action
    public void begin(InterpretationContext interpretationContext, String str, Attributes attributes) throws ActionException {
        long currentTimeMillis;
        String value = attributes.getValue(Action.KEY_ATTRIBUTE);
        if (OptionHelper.isEmpty(value)) {
            addError("Attribute named [key] cannot be empty");
            this.f39795c = true;
        }
        String value2 = attributes.getValue(f39792d);
        if (OptionHelper.isEmpty(value2)) {
            addError("Attribute named [" + f39792d + "] cannot be empty");
            this.f39795c = true;
        }
        if (f39794f.equalsIgnoreCase(attributes.getValue(f39793e))) {
            addInfo("Using context birth as time reference.");
            currentTimeMillis = this.context.getBirthTime();
        } else {
            currentTimeMillis = System.currentTimeMillis();
            addInfo("Using current interpretation time, i.e. now, as time reference.");
        }
        if (this.f39795c) {
            return;
        }
        ActionUtil.Scope stringToScope = ActionUtil.stringToScope(attributes.getValue(Action.SCOPE_ATTRIBUTE));
        String format = new CachingDateFormatter(value2).format(currentTimeMillis);
        addInfo("Adding property to the context with key=\"" + value + "\" and value=\"" + format + "\" to the " + stringToScope + " scope");
        ActionUtil.setProperty(interpretationContext, value, format, stringToScope);
    }

    @Override // ch.qos.logback.core.joran.action.Action
    public void end(InterpretationContext interpretationContext, String str) throws ActionException {
    }
}
