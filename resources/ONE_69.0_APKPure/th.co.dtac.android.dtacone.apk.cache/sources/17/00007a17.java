package ch.qos.logback.core.joran.action;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.boolex.EventEvaluator;
import ch.qos.logback.core.joran.spi.InterpretationContext;
import ch.qos.logback.core.spi.LifeCycle;
import ch.qos.logback.core.util.OptionHelper;
import java.util.Map;
import org.xml.sax.Attributes;

/* loaded from: classes.dex */
public abstract class AbstractEventEvaluatorAction extends Action {

    /* renamed from: c */
    public EventEvaluator f39755c;

    /* renamed from: d */
    public boolean f39756d = false;

    @Override // ch.qos.logback.core.joran.action.Action
    public void begin(InterpretationContext interpretationContext, String str, Attributes attributes) {
        String str2;
        this.f39756d = false;
        this.f39755c = null;
        String value = attributes.getValue(Action.CLASS_ATTRIBUTE);
        if (OptionHelper.isEmpty(value)) {
            value = defaultClassName();
            addInfo("Assuming default evaluator class [" + value + "]");
        }
        if (OptionHelper.isEmpty(value)) {
            defaultClassName();
            this.f39756d = true;
            str2 = "Mandatory \"class\" attribute not set for <evaluator>";
        } else {
            String value2 = attributes.getValue("name");
            if (!OptionHelper.isEmpty(value2)) {
                try {
                    EventEvaluator eventEvaluator = (EventEvaluator) OptionHelper.instantiateByClassName(value, EventEvaluator.class, this.context);
                    this.f39755c = eventEvaluator;
                    eventEvaluator.setContext(this.context);
                    this.f39755c.setName(value2);
                    interpretationContext.pushObject(this.f39755c);
                    addInfo("Adding evaluator named [" + value2 + "] to the object stack");
                    return;
                } catch (Exception e) {
                    this.f39756d = true;
                    addError("Could not create evaluator of type " + value + "].", e);
                    return;
                }
            }
            this.f39756d = true;
            str2 = "Mandatory \"name\" attribute not set for <evaluator>";
        }
        addError(str2);
    }

    public abstract String defaultClassName();

    @Override // ch.qos.logback.core.joran.action.Action
    public void end(InterpretationContext interpretationContext, String str) {
        if (this.f39756d) {
            return;
        }
        EventEvaluator eventEvaluator = this.f39755c;
        if (eventEvaluator instanceof LifeCycle) {
            eventEvaluator.start();
            addInfo("Starting evaluator named [" + this.f39755c.getName() + "]");
        }
        if (interpretationContext.peekObject() != this.f39755c) {
            addWarn("The object on the top the of the stack is not the evaluator pushed earlier.");
            return;
        }
        interpretationContext.popObject();
        try {
            Map map = (Map) this.context.getObject(CoreConstants.EVALUATOR_MAP);
            if (map == null) {
                addError("Could not find EvaluatorMap");
            } else {
                map.put(this.f39755c.getName(), this.f39755c);
            }
        } catch (Exception e) {
            addError("Could not set evaluator named [" + this.f39755c + "].", e);
        }
    }

    public void finish(InterpretationContext interpretationContext) {
    }
}