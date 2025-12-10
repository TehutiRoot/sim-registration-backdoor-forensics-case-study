package p000;

import androidx.compose.foundation.shape.CornerSize;
import androidx.compose.p003ui.platform.InspectableValue;
import androidx.compose.p003ui.unit.Density;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;

/* renamed from: dq1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C19640dq1 implements CornerSize, InspectableValue {

    /* renamed from: a */
    public final float f61386a;

    public C19640dq1(float f) {
        this.f61386a = f;
    }

    @Override // androidx.compose.p003ui.platform.InspectableValue
    /* renamed from: a */
    public String getValueOverride() {
        return this.f61386a + "px";
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C19640dq1) && Float.compare(this.f61386a, ((C19640dq1) obj).f61386a) == 0) {
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

    public int hashCode() {
        return Float.floatToIntBits(this.f61386a);
    }

    @Override // androidx.compose.foundation.shape.CornerSize
    /* renamed from: toPx-TmRCtEA */
    public float mo69368toPxTmRCtEA(long j, Density density) {
        Intrinsics.checkNotNullParameter(density, "density");
        return this.f61386a;
    }

    public String toString() {
        return "CornerSize(size = " + this.f61386a + ".px)";
    }
}