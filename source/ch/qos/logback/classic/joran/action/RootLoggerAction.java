package ch.qos.logback.classic.joran.action;

import ch.qos.logback.classic.Level;
import ch.qos.logback.classic.Logger;
import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.joran.spi.InterpretationContext;
import ch.qos.logback.core.util.OptionHelper;
import org.xml.sax.Attributes;

/* loaded from: classes.dex */
public class RootLoggerAction extends Action {

    /* renamed from: c */
    public Logger f39554c;

    /* renamed from: d */
    public boolean f39555d = false;

    @Override // ch.qos.logback.core.joran.action.Action
    public void begin(InterpretationContext interpretationContext, String str, Attributes attributes) {
        this.f39555d = false;
        this.f39554c = ((LoggerContext) this.context).getLogger(org.slf4j.Logger.ROOT_LOGGER_NAME);
        String subst = interpretationContext.subst(attributes.getValue("level"));
        if (!OptionHelper.isEmpty(subst)) {
            Level level = Level.toLevel(subst);
            addInfo("Setting level of ROOT logger to " + level);
            this.f39554c.setLevel(level);
        }
        interpretationContext.pushObject(this.f39554c);
    }

    @Override // ch.qos.logback.core.joran.action.Action
    public void end(InterpretationContext interpretationContext, String str) {
        if (this.f39555d) {
            return;
        }
        Object peekObject = interpretationContext.peekObject();
        if (peekObject == this.f39554c) {
            interpretationContext.popObject();
            return;
        }
        addWarn("The object on the top the of the stack is not the root logger");
        addWarn("It is: " + peekObject);
    }

    public void finish(InterpretationContext interpretationContext) {
    }
}
