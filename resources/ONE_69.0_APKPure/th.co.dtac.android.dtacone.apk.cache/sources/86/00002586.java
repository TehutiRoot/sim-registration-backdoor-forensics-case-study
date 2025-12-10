package androidx.compose.foundation.layout;

import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.layout.IntrinsicMeasurable;
import androidx.compose.p003ui.layout.IntrinsicMeasureScope;
import androidx.compose.p003ui.layout.LayoutModifier;
import androidx.compose.p003ui.layout.Measurable;
import androidx.compose.p003ui.layout.MeasureResult;
import androidx.compose.p003ui.layout.MeasureScope;
import androidx.compose.p003ui.layout.Placeable;
import androidx.compose.p003ui.modifier.ModifierLocalConsumer;
import androidx.compose.p003ui.modifier.ModifierLocalReadScope;
import androidx.compose.p003ui.platform.InspectorValueInfo;
import androidx.compose.p003ui.unit.Constraints;
import androidx.compose.runtime.MutableState;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class DerivedWidthModifier extends InspectorValueInfo implements LayoutModifier, ModifierLocalConsumer {

    /* renamed from: c */
    public final WindowInsets f13216c;

    /* renamed from: d */
    public final Function3 f13217d;

    /* renamed from: e */
    public final MutableState f13218e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DerivedWidthModifier(WindowInsets insets, Function1 inspectorInfo, Function3 widthCalc) {
        super(inspectorInfo);
        MutableState m65148g;
        Intrinsics.checkNotNullParameter(insets, "insets");
        Intrinsics.checkNotNullParameter(inspectorInfo, "inspectorInfo");
        Intrinsics.checkNotNullParameter(widthCalc, "widthCalc");
        this.f13216c = insets;
        this.f13217d = widthCalc;
        m65148g = AbstractC19036aL1.m65148g(insets, null, 2, null);
        this.f13218e = m65148g;
    }

    /* renamed from: d */
    private final WindowInsets m61356d() {
        return (WindowInsets) this.f13218e.getValue();
    }

    /* renamed from: e */
    private final void m61355e(WindowInsets windowInsets) {
        this.f13218e.setValue(windowInsets);
    }

    @Override // androidx.compose.p003ui.Modifier.Element, androidx.compose.p003ui.Modifier
    public /* synthetic */ boolean all(Function1 function1) {
        return AbstractC21205mt0.m26489a(this, function1);
    }

    @Override // androidx.compose.p003ui.Modifier.Element, androidx.compose.p003ui.Modifier
    public /* synthetic */ boolean any(Function1 function1) {
        return AbstractC21205mt0.m26488b(this, function1);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DerivedWidthModifier)) {
            return false;
        }
        DerivedWidthModifier derivedWidthModifier = (DerivedWidthModifier) obj;
        if (Intrinsics.areEqual(this.f13216c, derivedWidthModifier.f13216c) && Intrinsics.areEqual(this.f13217d, derivedWidthModifier.f13217d)) {
            return true;
        }
        return false;
    }

    @Override // androidx.compose.p003ui.Modifier.Element, androidx.compose.p003ui.Modifier
    public /* synthetic */ Object foldIn(Object obj, Function2 function2) {
        return AbstractC21205mt0.m26487c(this, obj, function2);
    }

    @Override // androidx.compose.p003ui.Modifier.Element, androidx.compose.p003ui.Modifier
    public /* synthetic */ Object foldOut(Object obj, Function2 function2) {
        return AbstractC21205mt0.m26486d(this, obj, function2);
    }

    public int hashCode() {
        return (this.f13216c.hashCode() * 31) + this.f13217d.hashCode();
    }

    @Override // androidx.compose.p003ui.layout.LayoutModifier
    public /* synthetic */ int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        return AbstractC21518oi0.m26084a(this, intrinsicMeasureScope, intrinsicMeasurable, i);
    }

    @Override // androidx.compose.p003ui.layout.LayoutModifier
    public /* synthetic */ int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        return AbstractC21518oi0.m26083b(this, intrinsicMeasureScope, intrinsicMeasurable, i);
    }

    @Override // androidx.compose.p003ui.layout.LayoutModifier
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo69364measure3p2s80s(MeasureScope measure, Measurable measurable, long j) {
        Intrinsics.checkNotNullParameter(measure, "$this$measure");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        int intValue = ((Number) this.f13217d.invoke(m61356d(), measure.getLayoutDirection(), measure)).intValue();
        if (intValue == 0) {
            return MeasureScope.CC.m59482q(measure, 0, 0, null, DerivedWidthModifier$measure$1.INSTANCE, 4, null);
        }
        Placeable mo72995measureBRTryo0 = measurable.mo72995measureBRTryo0(Constraints.m73802copyZbe2FdA$default(j, intValue, intValue, 0, 0, 12, null));
        return MeasureScope.CC.m59482q(measure, intValue, mo72995measureBRTryo0.getHeight(), null, new DerivedWidthModifier$measure$2(mo72995measureBRTryo0), 4, null);
    }

    @Override // androidx.compose.p003ui.layout.LayoutModifier
    public /* synthetic */ int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        return AbstractC21518oi0.m26082c(this, intrinsicMeasureScope, intrinsicMeasurable, i);
    }

    @Override // androidx.compose.p003ui.layout.LayoutModifier
    public /* synthetic */ int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        return AbstractC21518oi0.m26081d(this, intrinsicMeasureScope, intrinsicMeasurable, i);
    }

    @Override // androidx.compose.p003ui.modifier.ModifierLocalConsumer
    public void onModifierLocalsUpdated(ModifierLocalReadScope scope) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        m61355e(WindowInsetsKt.exclude(this.f13216c, (WindowInsets) scope.getCurrent(WindowInsetsPaddingKt.getModifierLocalConsumedWindowInsets())));
    }

    @Override // androidx.compose.p003ui.Modifier
    public /* synthetic */ Modifier then(Modifier modifier) {
        return AbstractC21032lt0.m26768a(this, modifier);
    }
}