package ch.qos.logback.core.joran.action;

import ch.qos.logback.core.joran.spi.ElementPath;
import ch.qos.logback.core.joran.spi.InterpretationContext;
import ch.qos.logback.core.joran.spi.NoAutoStartUtil;
import ch.qos.logback.core.joran.util.PropertySetter;
import ch.qos.logback.core.spi.ContextAware;
import ch.qos.logback.core.spi.LifeCycle;
import ch.qos.logback.core.util.AggregationType;
import ch.qos.logback.core.util.Loader;
import ch.qos.logback.core.util.OptionHelper;
import java.util.Stack;
import org.xml.sax.Attributes;

/* loaded from: classes.dex */
public class NestedComplexPropertyIA extends ImplicitAction {

    /* renamed from: c */
    public Stack f39780c = new Stack();

    /* renamed from: ch.qos.logback.core.joran.action.NestedComplexPropertyIA$a */
    /* loaded from: classes.dex */
    public static /* synthetic */ class C5469a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f39781a;

        static {
            int[] iArr = new int[AggregationType.values().length];
            f39781a = iArr;
            try {
                iArr[AggregationType.NOT_FOUND.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f39781a[AggregationType.AS_BASIC_PROPERTY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f39781a[AggregationType.AS_BASIC_PROPERTY_COLLECTION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f39781a[AggregationType.AS_COMPLEX_PROPERTY_COLLECTION.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f39781a[AggregationType.AS_COMPLEX_PROPERTY.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    @Override // ch.qos.logback.core.joran.action.Action
    public void begin(InterpretationContext interpretationContext, String str, Attributes attributes) {
        IADataForComplexProperty iADataForComplexProperty = (IADataForComplexProperty) this.f39780c.peek();
        String subst = interpretationContext.subst(attributes.getValue(Action.CLASS_ATTRIBUTE));
        try {
            Class<?> loadClass = !OptionHelper.isEmpty(subst) ? Loader.loadClass(subst, this.context) : iADataForComplexProperty.f39772a.getClassNameViaImplicitRules(iADataForComplexProperty.getComplexPropertyName(), iADataForComplexProperty.getAggregationType(), interpretationContext.getDefaultNestedComponentRegistry());
            if (loadClass == null) {
                iADataForComplexProperty.f39776e = true;
                addError("Could not find an appropriate class for property [" + str + "]");
                return;
            }
            if (OptionHelper.isEmpty(subst)) {
                addInfo("Assuming default type [" + loadClass.getName() + "] for [" + str + "] property");
            }
            iADataForComplexProperty.setNestedComplexProperty(loadClass.getConstructor(null).newInstance(null));
            if (iADataForComplexProperty.getNestedComplexProperty() instanceof ContextAware) {
                ((ContextAware) iADataForComplexProperty.getNestedComplexProperty()).setContext(this.context);
            }
            interpretationContext.pushObject(iADataForComplexProperty.getNestedComplexProperty());
        } catch (Exception e) {
            iADataForComplexProperty.f39776e = true;
            addError("Could not create component [" + str + "] of type [" + subst + "]", e);
        }
    }

    @Override // ch.qos.logback.core.joran.action.Action
    public void end(InterpretationContext interpretationContext, String str) {
        String str2;
        IADataForComplexProperty iADataForComplexProperty = (IADataForComplexProperty) this.f39780c.pop();
        if (iADataForComplexProperty.f39776e) {
            return;
        }
        PropertySetter propertySetter = new PropertySetter(iADataForComplexProperty.getNestedComplexProperty());
        propertySetter.setContext(this.context);
        if (propertySetter.computeAggregationType("parent") == AggregationType.AS_COMPLEX_PROPERTY) {
            propertySetter.setComplexProperty("parent", iADataForComplexProperty.f39772a.getObj());
        }
        Object nestedComplexProperty = iADataForComplexProperty.getNestedComplexProperty();
        if ((nestedComplexProperty instanceof LifeCycle) && NoAutoStartUtil.notMarkedWithNoAutoStart(nestedComplexProperty)) {
            ((LifeCycle) nestedComplexProperty).start();
        }
        if (interpretationContext.peekObject() != iADataForComplexProperty.getNestedComplexProperty()) {
            str2 = "The object on the top the of the stack is not the component pushed earlier.";
        } else {
            interpretationContext.popObject();
            int i = C5469a.f39781a[iADataForComplexProperty.f39773b.ordinal()];
            if (i == 4) {
                iADataForComplexProperty.f39772a.addComplexProperty(str, iADataForComplexProperty.getNestedComplexProperty());
                return;
            } else if (i == 5) {
                iADataForComplexProperty.f39772a.setComplexProperty(str, iADataForComplexProperty.getNestedComplexProperty());
                return;
            } else {
                str2 = "Unexpected aggregationType " + iADataForComplexProperty.f39773b;
            }
        }
        addError(str2);
    }

    @Override // ch.qos.logback.core.joran.action.ImplicitAction
    public boolean isApplicable(ElementPath elementPath, Attributes attributes, InterpretationContext interpretationContext) {
        String peekLast = elementPath.peekLast();
        if (interpretationContext.isEmpty()) {
            return false;
        }
        PropertySetter propertySetter = new PropertySetter(interpretationContext.peekObject());
        propertySetter.setContext(this.context);
        AggregationType computeAggregationType = propertySetter.computeAggregationType(peekLast);
        int i = C5469a.f39781a[computeAggregationType.ordinal()];
        if (i == 1 || i == 2 || i == 3) {
            return false;
        }
        if (i == 4 || i == 5) {
            this.f39780c.push(new IADataForComplexProperty(propertySetter, computeAggregationType, peekLast));
            return true;
        }
        addError("PropertySetter.computeAggregationType returned " + computeAggregationType);
        return false;
    }
}
