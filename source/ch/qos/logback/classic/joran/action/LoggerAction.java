package ch.qos.logback.classic.joran.action;

import ch.qos.logback.classic.Level;
import ch.qos.logback.classic.Logger;
import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.joran.action.ActionConst;
import ch.qos.logback.core.joran.spi.InterpretationContext;
import ch.qos.logback.core.util.OptionHelper;
import org.xml.sax.Attributes;

/* loaded from: classes.dex */
public class LoggerAction extends Action {
    public static final String LEVEL_ATTRIBUTE = "level";

    /* renamed from: c */
    public boolean f39548c = false;

    /* renamed from: d */
    public Logger f39549d;

    @Override // ch.qos.logback.core.joran.action.Action
    public void begin(InterpretationContext interpretationContext, String str, Attributes attributes) {
        this.f39548c = false;
        this.f39549d = null;
        LoggerContext loggerContext = (LoggerContext) this.context;
        String subst = interpretationContext.subst(attributes.getValue("name"));
        if (OptionHelper.isEmpty(subst)) {
            this.f39548c = true;
            String lineColStr = getLineColStr(interpretationContext);
            addError("No 'name' attribute in element " + str + ", around " + lineColStr);
            return;
        }
        this.f39549d = loggerContext.getLogger(subst);
        String subst2 = interpretationContext.subst(attributes.getValue("level"));
        if (!OptionHelper.isEmpty(subst2)) {
            if (ActionConst.INHERITED.equalsIgnoreCase(subst2) || ActionConst.NULL.equalsIgnoreCase(subst2)) {
                addInfo("Setting level of logger [" + subst + "] to null, i.e. INHERITED");
                this.f39549d.setLevel(null);
            } else {
                Level level = Level.toLevel(subst2);
                addInfo("Setting level of logger [" + subst + "] to " + level);
                this.f39549d.setLevel(level);
            }
        }
        String subst3 = interpretationContext.subst(attributes.getValue(ActionConst.ADDITIVITY_ATTRIBUTE));
        if (!OptionHelper.isEmpty(subst3)) {
            boolean booleanValue = Boolean.valueOf(subst3).booleanValue();
            addInfo("Setting additivity of logger [" + subst + "] to " + booleanValue);
            this.f39549d.setAdditive(booleanValue);
        }
        interpretationContext.pushObject(this.f39549d);
    }

    @Override // ch.qos.logback.core.joran.action.Action
    public void end(InterpretationContext interpretationContext, String str) {
        if (this.f39548c) {
            return;
        }
        Object peekObject = interpretationContext.peekObject();
        if (peekObject == this.f39549d) {
            interpretationContext.popObject();
            return;
        }
        addWarn("The object on the top the of the stack is not " + this.f39549d + " pushed earlier");
        StringBuilder sb = new StringBuilder();
        sb.append("It is: ");
        sb.append(peekObject);
        addWarn(sb.toString());
    }

    public void finish(InterpretationContext interpretationContext) {
    }
}
