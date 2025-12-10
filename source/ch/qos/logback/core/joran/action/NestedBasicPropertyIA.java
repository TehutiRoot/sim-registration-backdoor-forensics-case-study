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
    public Stack f39778c = new Stack();

    /* renamed from: ch.qos.logback.core.joran.action.NestedBasicPropertyIA$a */
    /* loaded from: classes.dex */
    public static /* synthetic */ class C5468a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f39779a;

        static {
            int[] iArr = new int[AggregationType.values().length];
            f39779a = iArr;
            try {
                iArr[AggregationType.NOT_FOUND.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f39779a[AggregationType.AS_COMPLEX_PROPERTY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f39779a[AggregationType.AS_COMPLEX_PROPERTY_COLLECTION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f39779a[AggregationType.AS_BASIC_PROPERTY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f39779a[AggregationType.AS_BASIC_PROPERTY_COLLECTION.ordinal()] = 5;
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
        C20162h90 c20162h90 = (C20162h90) this.f39778c.peek();
        int i = C5468a.f39779a[c20162h90.f62424b.ordinal()];
        if (i == 4) {
            c20162h90.f62423a.setProperty(c20162h90.f62425c, subst);
        } else if (i == 5) {
            c20162h90.f62423a.addBasicProperty(c20162h90.f62425c, subst);
        } else {
            addError("Unexpected aggregationType " + c20162h90.f62424b);
        }
    }

    @Override // ch.qos.logback.core.joran.action.Action
    public void end(InterpretationContext interpretationContext, String str) {
        this.f39778c.pop();
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
        int i = C5468a.f39779a[computeAggregationType.ordinal()];
        if (i == 1 || i == 2 || i == 3) {
            return false;
        }
        if (i == 4 || i == 5) {
            this.f39778c.push(new C20162h90(propertySetter, computeAggregationType, peekLast));
            return true;
        }
        addError("PropertySetter.canContainComponent returned " + computeAggregationType);
        return false;
    }
}
