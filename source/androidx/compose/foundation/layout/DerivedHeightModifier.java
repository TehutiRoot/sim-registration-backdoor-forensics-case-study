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
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class DerivedHeightModifier extends InspectorValueInfo implements LayoutModifier, ModifierLocalConsumer {

    /* renamed from: c */
    public final WindowInsets f13125c;

    /* renamed from: d */
    public final Function2 f13126d;

    /* renamed from: e */
    public final MutableState f13127e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DerivedHeightModifier(WindowInsets insets, Function1 inspectorInfo, Function2 heightCalc) {
        super(inspectorInfo);
        MutableState m31891g;
        Intrinsics.checkNotNullParameter(insets, "insets");
        Intrinsics.checkNotNullParameter(inspectorInfo, "inspectorInfo");
        Intrinsics.checkNotNullParameter(heightCalc, "heightCalc");
        this.f13125c = insets;
        this.f13126d = heightCalc;
        m31891g = AbstractC19508dK1.m31891g(insets, null, 2, null);
        this.f13127e = m31891g;
    }

    @Override // androidx.compose.p003ui.Modifier.Element, androidx.compose.p003ui.Modifier
    public /* synthetic */ boolean all(Function1 function1) {
        return AbstractC20114gt0.m30962a(this, function1);
    }

    @Override // androidx.compose.p003ui.Modifier.Element, androidx.compose.p003ui.Modifier
    public /* synthetic */ boolean any(Function1 function1) {
        return AbstractC20114gt0.m30961b(this, function1);
    }

    /* renamed from: d */
    public final WindowInsets m61408d() {
        return (WindowInsets) this.f13127e.getValue();
    }

    /* renamed from: e */
    public final void m61407e(WindowInsets windowInsets) {
        this.f13127e.setValue(windowInsets);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DerivedHeightModifier)) {
            return false;
        }
        DerivedHeightModifier derivedHeightModifier = (DerivedHeightModifier) obj;
        if (Intrinsics.areEqual(this.f13125c, derivedHeightModifier.f13125c) && Intrinsics.areEqual(this.f13126d, derivedHeightModifier.f13126d)) {
            return true;
        }
        return false;
    }

    @Override // androidx.compose.p003ui.Modifier.Element, androidx.compose.p003ui.Modifier
    public /* synthetic */ Object foldIn(Object obj, Function2 function2) {
        return AbstractC20114gt0.m30960c(this, obj, function2);
    }

    @Override // androidx.compose.p003ui.Modifier.Element, androidx.compose.p003ui.Modifier
    public /* synthetic */ Object foldOut(Object obj, Function2 function2) {
        return AbstractC20114gt0.m30959d(this, obj, function2);
    }

    public int hashCode() {
        return (this.f13125c.hashCode() * 31) + this.f13126d.hashCode();
    }

    @Override // androidx.compose.p003ui.layout.LayoutModifier
    public /* synthetic */ int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        return AbstractC20425ii0.m30600a(this, intrinsicMeasureScope, intrinsicMeasurable, i);
    }

    @Override // androidx.compose.p003ui.layout.LayoutModifier
    public /* synthetic */ int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        return AbstractC20425ii0.m30599b(this, intrinsicMeasureScope, intrinsicMeasurable, i);
    }

    @Override // androidx.compose.p003ui.layout.LayoutModifier
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo69160measure3p2s80s(MeasureScope measure, Measurable measurable, long j) {
        Intrinsics.checkNotNullParameter(measure, "$this$measure");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        int intValue = ((Number) this.f13126d.invoke(m61408d(), measure)).intValue();
        if (intValue == 0) {
            return MeasureScope.CC.m59532q(measure, 0, 0, null, DerivedHeightModifier$measure$1.INSTANCE, 4, null);
        }
        Placeable mo72811measureBRTryo0 = measurable.mo72811measureBRTryo0(Constraints.m73618copyZbe2FdA$default(j, 0, 0, intValue, intValue, 3, null));
        return MeasureScope.CC.m59532q(measure, mo72811measureBRTryo0.getWidth(), intValue, null, new DerivedHeightModifier$measure$2(mo72811measureBRTryo0), 4, null);
    }

    @Override // androidx.compose.p003ui.layout.LayoutModifier
    public /* synthetic */ int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        return AbstractC20425ii0.m30598c(this, intrinsicMeasureScope, intrinsicMeasurable, i);
    }

    @Override // androidx.compose.p003ui.layout.LayoutModifier
    public /* synthetic */ int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        return AbstractC20425ii0.m30597d(this, intrinsicMeasureScope, intrinsicMeasurable, i);
    }

    @Override // androidx.compose.p003ui.modifier.ModifierLocalConsumer
    public void onModifierLocalsUpdated(ModifierLocalReadScope scope) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        m61407e(WindowInsetsKt.exclude(this.f13125c, (WindowInsets) scope.getCurrent(WindowInsetsPaddingKt.getModifierLocalConsumedWindowInsets())));
    }

    @Override // androidx.compose.p003ui.Modifier
    public /* synthetic */ Modifier then(Modifier modifier) {
        return AbstractC19942ft0.m31254a(this, modifier);
    }
}
