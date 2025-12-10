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
    public final Function1 f26292c;

    /* renamed from: d */
    public final Function1 f26293d;

    /* renamed from: e */
    public float f26294e;

    /* renamed from: f */
    public float f26295f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SwipeAnchorsModifier(Function1 onDensityChanged, Function1 onSizeChanged, Function1 inspectorInfo) {
        super(inspectorInfo);
        Intrinsics.checkNotNullParameter(onDensityChanged, "onDensityChanged");
        Intrinsics.checkNotNullParameter(onSizeChanged, "onSizeChanged");
        Intrinsics.checkNotNullParameter(inspectorInfo, "inspectorInfo");
        this.f26292c = onDensityChanged;
        this.f26293d = onSizeChanged;
        this.f26294e = -1.0f;
        this.f26295f = -1.0f;
    }

    @Override // androidx.compose.p003ui.Modifier.Element, androidx.compose.p003ui.Modifier
    public /* synthetic */ boolean all(Function1 function1) {
        return AbstractC21205mt0.m26489a(this, function1);
    }

    @Override // androidx.compose.p003ui.Modifier.Element, androidx.compose.p003ui.Modifier
    public /* synthetic */ boolean any(Function1 function1) {
        return AbstractC21205mt0.m26488b(this, function1);
    }

    @Override // androidx.compose.p003ui.Modifier.Element, androidx.compose.p003ui.Modifier
    public /* synthetic */ Object foldIn(Object obj, Function2 function2) {
        return AbstractC21205mt0.m26487c(this, obj, function2);
    }

    @Override // androidx.compose.p003ui.Modifier.Element, androidx.compose.p003ui.Modifier
    public /* synthetic */ Object foldOut(Object obj, Function2 function2) {
        return AbstractC21205mt0.m26486d(this, obj, function2);
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
        if (measure.getDensity() != this.f26294e || measure.getFontScale() != this.f26295f) {
            this.f26292c.invoke(DensityKt.Density(measure.getDensity(), measure.getFontScale()));
            this.f26294e = measure.getDensity();
            this.f26295f = measure.getFontScale();
        }
        Placeable mo72995measureBRTryo0 = measurable.mo72995measureBRTryo0(j);
        return MeasureScope.CC.m59482q(measure, mo72995measureBRTryo0.getWidth(), mo72995measureBRTryo0.getHeight(), null, new SwipeAnchorsModifier$measure$1(mo72995measureBRTryo0), 4, null);
    }

    @Override // androidx.compose.p003ui.layout.LayoutModifier
    public /* synthetic */ int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        return AbstractC21518oi0.m26082c(this, intrinsicMeasureScope, intrinsicMeasurable, i);
    }

    @Override // androidx.compose.p003ui.layout.LayoutModifier
    public /* synthetic */ int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        return AbstractC21518oi0.m26081d(this, intrinsicMeasureScope, intrinsicMeasurable, i);
    }

    @Override // androidx.compose.p003ui.layout.OnRemeasuredModifier
    /* renamed from: onRemeasured-ozmzZPI */
    public void mo69340onRemeasuredozmzZPI(long j) {
        this.f26293d.invoke(IntSize.m73994boximpl(j));
    }

    @Override // androidx.compose.p003ui.Modifier
    public /* synthetic */ Modifier then(Modifier modifier) {
        return AbstractC21032lt0.m26768a(this, modifier);
    }

    public String toString() {
        return "SwipeAnchorsModifierImpl(updateDensity=" + this.f26292c + ", onSizeChanged=" + this.f26293d + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}