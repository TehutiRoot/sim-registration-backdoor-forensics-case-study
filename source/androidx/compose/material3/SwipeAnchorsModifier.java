package androidx.compose.material3;

import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.layout.IntrinsicMeasurable;
import androidx.compose.p003ui.layout.IntrinsicMeasureScope;
import androidx.compose.p003ui.layout.LayoutModifier;
import androidx.compose.p003ui.layout.Measurable;
import androidx.compose.p003ui.layout.MeasureResult;
import androidx.compose.p003ui.layout.MeasureScope;
import androidx.compose.p003ui.layout.OnRemeasuredModifier;
import androidx.compose.p003ui.layout.Placeable;
import androidx.compose.p003ui.platform.InspectorValueInfo;
import androidx.compose.p003ui.unit.DensityKt;
import androidx.compose.p003ui.unit.IntSize;
import ch.qos.logback.core.CoreConstants;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class SwipeAnchorsModifier extends InspectorValueInfo implements LayoutModifier, OnRemeasuredModifier {

    /* renamed from: c */
    public final Function1 f26204c;

    /* renamed from: d */
    public final Function1 f26205d;

    /* renamed from: e */
    public float f26206e;

    /* renamed from: f */
    public float f26207f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SwipeAnchorsModifier(Function1 onDensityChanged, Function1 onSizeChanged, Function1 inspectorInfo) {
        super(inspectorInfo);
        Intrinsics.checkNotNullParameter(onDensityChanged, "onDensityChanged");
        Intrinsics.checkNotNullParameter(onSizeChanged, "onSizeChanged");
        Intrinsics.checkNotNullParameter(inspectorInfo, "inspectorInfo");
        this.f26204c = onDensityChanged;
        this.f26205d = onSizeChanged;
        this.f26206e = -1.0f;
        this.f26207f = -1.0f;
    }

    @Override // androidx.compose.p003ui.Modifier.Element, androidx.compose.p003ui.Modifier
    public /* synthetic */ boolean all(Function1 function1) {
        return AbstractC20114gt0.m30962a(this, function1);
    }

    @Override // androidx.compose.p003ui.Modifier.Element, androidx.compose.p003ui.Modifier
    public /* synthetic */ boolean any(Function1 function1) {
        return AbstractC20114gt0.m30961b(this, function1);
    }

    @Override // androidx.compose.p003ui.Modifier.Element, androidx.compose.p003ui.Modifier
    public /* synthetic */ Object foldIn(Object obj, Function2 function2) {
        return AbstractC20114gt0.m30960c(this, obj, function2);
    }

    @Override // androidx.compose.p003ui.Modifier.Element, androidx.compose.p003ui.Modifier
    public /* synthetic */ Object foldOut(Object obj, Function2 function2) {
        return AbstractC20114gt0.m30959d(this, obj, function2);
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
        if (measure.getDensity() != this.f26206e || measure.getFontScale() != this.f26207f) {
            this.f26204c.invoke(DensityKt.Density(measure.getDensity(), measure.getFontScale()));
            this.f26206e = measure.getDensity();
            this.f26207f = measure.getFontScale();
        }
        Placeable mo72811measureBRTryo0 = measurable.mo72811measureBRTryo0(j);
        return MeasureScope.CC.m59532q(measure, mo72811measureBRTryo0.getWidth(), mo72811measureBRTryo0.getHeight(), null, new SwipeAnchorsModifier$measure$1(mo72811measureBRTryo0), 4, null);
    }

    @Override // androidx.compose.p003ui.layout.LayoutModifier
    public /* synthetic */ int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        return AbstractC20425ii0.m30598c(this, intrinsicMeasureScope, intrinsicMeasurable, i);
    }

    @Override // androidx.compose.p003ui.layout.LayoutModifier
    public /* synthetic */ int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        return AbstractC20425ii0.m30597d(this, intrinsicMeasureScope, intrinsicMeasurable, i);
    }

    @Override // androidx.compose.p003ui.layout.OnRemeasuredModifier
    /* renamed from: onRemeasured-ozmzZPI */
    public void mo69383onRemeasuredozmzZPI(long j) {
        this.f26205d.invoke(IntSize.m73810boximpl(j));
    }

    @Override // androidx.compose.p003ui.Modifier
    public /* synthetic */ Modifier then(Modifier modifier) {
        return AbstractC19942ft0.m31254a(this, modifier);
    }

    public String toString() {
        return "SwipeAnchorsModifierImpl(updateDensity=" + this.f26204c + ", onSizeChanged=" + this.f26205d + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
