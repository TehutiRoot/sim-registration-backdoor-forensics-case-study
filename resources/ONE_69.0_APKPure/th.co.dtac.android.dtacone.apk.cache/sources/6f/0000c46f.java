package p000;

import androidx.compose.foundation.shape.CornerSize;
import androidx.compose.p003ui.platform.InspectableValue;
import androidx.compose.p003ui.unit.C3623Dp;
import androidx.compose.p003ui.unit.Density;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;

/* renamed from: dK */
/* loaded from: classes.dex */
public final class C10060dK implements CornerSize, InspectableValue {

    /* renamed from: a */
    public final float f61205a;

    public /* synthetic */ C10060dK(float f, DefaultConstructorMarker defaultConstructorMarker) {
        this(f);
    }

    /* renamed from: a */
    public float m31847a() {
        return this.f61205a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C10060dK) && C3623Dp.m73847equalsimpl0(this.f61205a, ((C10060dK) obj).f61205a)) {
            return true;
        }
        return false;
    }

    @Override // androidx.compose.p003ui.platform.InspectableValue
    public /* synthetic */ Sequence getInspectableElements() {
        return AbstractC19606df0.m31788a(this);
    }

    @Override // androidx.compose.p003ui.platform.InspectableValue
    public /* synthetic */ String getNameFallback() {
        return AbstractC19606df0.m31787b(this);
    }

    @Override // androidx.compose.p003ui.platform.InspectableValue
    public /* bridge */ /* synthetic */ Object getValueOverride() {
        return C3623Dp.m73840boximpl(m31847a());
    }

    public int hashCode() {
        return C3623Dp.m73848hashCodeimpl(this.f61205a);
    }

    @Override // androidx.compose.foundation.shape.CornerSize
    /* renamed from: toPx-TmRCtEA */
    public float mo69368toPxTmRCtEA(long j, Density density) {
        Intrinsics.checkNotNullParameter(density, "density");
        return density.mo69622toPx0680j_4(this.f61205a);
    }

    public String toString() {
        return "CornerSize(size = " + this.f61205a + ".dp)";
    }

    public C10060dK(float f) {
        this.f61205a = f;
    }
}