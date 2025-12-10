package ch.qos.logback.core.joran.action;

import ch.qos.logback.core.joran.spi.ElementPath;
import ch.qos.logback.core.joran.spi.InterpretationContext;
import ch.qos.logback.core.joran.util.PropertySetter;
import ch.qos.logback.core.util.AggregationType;
import java.util.Stack;
import org.xml.sax.Attributes;

/* loaded from: classes.dex */
public class NestedBasicPropertyIA extends ImplicitAction {

    /* renamed from: c */
    public Stack f39776c = new Stack();

    /* renamed from: ch.qos.logback.core.joran.action.NestedBasicPropertyIA$a */
    /* loaded from: classes.dex */
    public static /* synthetic */ class C5457a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f39777a;

        static {
            int[] iArr = new int[AggregationType.values().length];
            f39777a = iArr;
            try {
                iArr[AggregationType.NOT_FOUND.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f39777a[AggregationType.AS_COMPLEX_PROPERTY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f39777a[AggregationType.AS_COMPLEX_PROPERTY_COLLECTION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f39777a[AggregationType.AS_BASIC_PROPERTY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f39777a[AggregationType.AS_BASIC_PROPERTY_COLLECTION.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    @Override // ch.qos.logback.core.joran.action.Action
    public void begin(InterpretationContext interpretationContext, String str, Attributes attributes) {
    }

    @Override // ch.qos.logback.core.joran.action.Action
    public void body(InterpretationContext interpretationContext, String str) {
        String subst = interpretationContext.subst(str);
        C21253n90 c21253n90 = (C21253n90) this.f39776c.peek();
        int i = C5457a.f39777a[c21253n90.f72268b.ordinal()];
        if (i == 4) {
            c21253n90.f72267a.setProperty(c21253n90.f72269c, subst);
        } else if (i == 5) {
            c21253n90.f72267a.addBasicProperty(c21253n90.f72269c, subst);
        } else {
            addError("Unexpected aggregationType " + c21253n90.f72268b);
        }
    }

    @Override // ch.qos.logback.core.joran.action.Action
    public void end(InterpretationContext interpretationContext, String str) {
        this.f39776c.pop();
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
        int i = C5457a.f39777a[computeAggregationType.ordinal()];
        if (i == 1 || i == 2 || i == 3) {
            return false;
        }
        if (i == 4 || i == 5) {
            this.f39776c.push(new C21253n90(propertySetter, computeAggregationType, peekLast));
            return true;
        }
        addError("PropertySetter.canContainComponent returned " + computeAggregationType);
        return false;
    }
}