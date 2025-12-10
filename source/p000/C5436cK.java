package p000;

import androidx.compose.foundation.shape.CornerSize;
import androidx.compose.p003ui.platform.InspectableValue;
import androidx.compose.p003ui.unit.C3641Dp;
import androidx.compose.p003ui.unit.Density;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;

/* renamed from: cK */
/* loaded from: classes.dex */
public final class C5436cK implements CornerSize, InspectableValue {

    /* renamed from: a */
    public final float f39394a;

    public /* synthetic */ C5436cK(float f, DefaultConstructorMarker defaultConstructorMarker) {
        this(f);
    }

    /* renamed from: a */
    public float m51696a() {
        return this.f39394a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C5436cK) && C3641Dp.m73663equalsimpl0(this.f39394a, ((C5436cK) obj).f39394a)) {
            return true;
        }
        return false;
    }

    @Override // androidx.compose.p003ui.platform.InspectableValue
    public /* synthetic */ Sequence getInspectableElements() {
        return AbstractC18745Xe0.m65470a(this);
    }

    @Override // androidx.compose.p003ui.platform.InspectableValue
    public /* synthetic */ String getNameFallback() {
        return AbstractC18745Xe0.m65469b(this);
    }

    @Override // androidx.compose.p003ui.platform.InspectableValue
    public /* bridge */ /* synthetic */ Object getValueOverride() {
        return C3641Dp.m73656boximpl(m51696a());
    }

    public int hashCode() {
        return C3641Dp.m73664hashCodeimpl(this.f39394a);
    }

    @Override // androidx.compose.foundation.shape.CornerSize
    /* renamed from: toPx-TmRCtEA */
    public float mo69184toPxTmRCtEA(long j, Density density) {
        Intrinsics.checkNotNullParameter(density, "density");
        return density.mo69438toPx0680j_4(this.f39394a);
    }

    public String toString() {
        return "CornerSize(size = " + this.f39394a + ".dp)";
    }

    public C5436cK(float f) {
        this.f39394a = f;
    }
}
