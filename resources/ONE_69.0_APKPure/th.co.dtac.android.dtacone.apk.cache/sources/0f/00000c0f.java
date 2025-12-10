package p000;

import androidx.compose.foundation.shape.CornerSize;
import androidx.compose.p003ui.geometry.Size;
import androidx.compose.p003ui.platform.InspectableValue;
import androidx.compose.p003ui.unit.Density;
import ch.qos.logback.core.CoreConstants;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;

/* renamed from: Mk1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C18095Mk1 implements CornerSize, InspectableValue {

    /* renamed from: a */
    public final float f3950a;

    public C18095Mk1(float f) {
        this.f3950a = f;
        if (f >= 0.0f && f <= 100.0f) {
            return;
        }
        throw new IllegalArgumentException("The percent should be in the range of [0, 100]");
    }

    @Override // androidx.compose.p003ui.platform.InspectableValue
    /* renamed from: a */
    public String getValueOverride() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f3950a);
        sb.append(CoreConstants.PERCENT_CHAR);
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C18095Mk1) && Float.compare(this.f3950a, ((C18095Mk1) obj).f3950a) == 0) {
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
        return Float.floatToIntBits(this.f3950a);
    }

    @Override // androidx.compose.foundation.shape.CornerSize
    /* renamed from: toPx-TmRCtEA  reason: not valid java name */
    public float mo69368toPxTmRCtEA(long j, Density density) {
        Intrinsics.checkNotNullParameter(density, "density");
        return Size.m71754getMinDimensionimpl(j) * (this.f3950a / 100.0f);
    }

    public String toString() {
        return "CornerSize(size = " + this.f3950a + "%)";
    }
}