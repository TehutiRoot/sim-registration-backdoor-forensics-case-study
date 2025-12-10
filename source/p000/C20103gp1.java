package p000;

import androidx.compose.foundation.shape.CornerSize;
import androidx.compose.p003ui.platform.InspectableValue;
import androidx.compose.p003ui.unit.Density;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;

/* renamed from: gp1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C20103gp1 implements CornerSize, InspectableValue {

    /* renamed from: a */
    public final float f62311a;

    public C20103gp1(float f) {
        this.f62311a = f;
    }

    @Override // androidx.compose.p003ui.platform.InspectableValue
    /* renamed from: a */
    public String getValueOverride() {
        return this.f62311a + "px";
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C20103gp1) && Float.compare(this.f62311a, ((C20103gp1) obj).f62311a) == 0) {
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

    public int hashCode() {
        return Float.floatToIntBits(this.f62311a);
    }

    @Override // androidx.compose.foundation.shape.CornerSize
    /* renamed from: toPx-TmRCtEA */
    public float mo69184toPxTmRCtEA(long j, Density density) {
        Intrinsics.checkNotNullParameter(density, "density");
        return this.f62311a;
    }

    public String toString() {
        return "CornerSize(size = " + this.f62311a + ".px)";
    }
}
