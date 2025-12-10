package p000;

import androidx.compose.p003ui.geometry.Rect;
import androidx.compose.p003ui.unit.Density;
import androidx.compose.p003ui.unit.DpRect;
import ch.qos.logback.core.CoreConstants;

/* renamed from: lG */
/* loaded from: classes2.dex */
public final class C12183lG implements Density {

    /* renamed from: a */
    public final float f71639a;

    /* renamed from: b */
    public final float f71640b;

    public C12183lG(float f, float f2) {
        this.f71639a = f;
        this.f71640b = f2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C12183lG)) {
            return false;
        }
        C12183lG c12183lG = (C12183lG) obj;
        if (Float.compare(this.f71639a, c12183lG.f71639a) == 0 && Float.compare(this.f71640b, c12183lG.f71640b) == 0) {
            return true;
        }
        return false;
    }

    @Override // androidx.compose.p003ui.unit.Density
    public float getDensity() {
        return this.f71639a;
    }

    @Override // androidx.compose.p003ui.unit.Density
    public float getFontScale() {
        return this.f71640b;
    }

    public int hashCode() {
        return (Float.floatToIntBits(this.f71639a) * 31) + Float.floatToIntBits(this.f71640b);
    }

    @Override // androidx.compose.p003ui.unit.Density
    /* renamed from: roundToPx--R2X_6o */
    public /* synthetic */ int mo69615roundToPxR2X_6o(long j) {
        return AbstractC11619kG.m29259a(this, j);
    }

    @Override // androidx.compose.p003ui.unit.Density
    /* renamed from: roundToPx-0680j_4 */
    public /* synthetic */ int mo69616roundToPx0680j_4(float f) {
        return AbstractC11619kG.m29258b(this, f);
    }

    @Override // androidx.compose.p003ui.unit.Density
    /* renamed from: toDp-GaN1DYA */
    public /* synthetic */ float mo69617toDpGaN1DYA(long j) {
        return AbstractC11619kG.m29257c(this, j);
    }

    @Override // androidx.compose.p003ui.unit.Density
    /* renamed from: toDp-u2uoSUM */
    public /* synthetic */ float mo69618toDpu2uoSUM(float f) {
        return AbstractC11619kG.m29256d(this, f);
    }

    @Override // androidx.compose.p003ui.unit.Density
    /* renamed from: toDpSize-k-rfVVM */
    public /* synthetic */ long mo69620toDpSizekrfVVM(long j) {
        return AbstractC11619kG.m29254f(this, j);
    }

    @Override // androidx.compose.p003ui.unit.Density
    /* renamed from: toPx--R2X_6o */
    public /* synthetic */ float mo69621toPxR2X_6o(long j) {
        return AbstractC11619kG.m29253g(this, j);
    }

    @Override // androidx.compose.p003ui.unit.Density
    /* renamed from: toPx-0680j_4 */
    public /* synthetic */ float mo69622toPx0680j_4(float f) {
        return AbstractC11619kG.m29252h(this, f);
    }

    @Override // androidx.compose.p003ui.unit.Density
    public /* synthetic */ Rect toRect(DpRect dpRect) {
        return AbstractC11619kG.m29251i(this, dpRect);
    }

    @Override // androidx.compose.p003ui.unit.Density
    /* renamed from: toSize-XkaWNTQ */
    public /* synthetic */ long mo69623toSizeXkaWNTQ(long j) {
        return AbstractC11619kG.m29250j(this, j);
    }

    @Override // androidx.compose.p003ui.unit.Density
    /* renamed from: toSp-0xMU5do */
    public /* synthetic */ long mo69624toSp0xMU5do(float f) {
        return AbstractC11619kG.m29249k(this, f);
    }

    @Override // androidx.compose.p003ui.unit.Density
    /* renamed from: toSp-kPz2Gy4 */
    public /* synthetic */ long mo69625toSpkPz2Gy4(float f) {
        return AbstractC11619kG.m29248l(this, f);
    }

    public String toString() {
        return "DensityImpl(density=" + this.f71639a + ", fontScale=" + this.f71640b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    @Override // androidx.compose.p003ui.unit.Density
    /* renamed from: toDp-u2uoSUM */
    public /* synthetic */ float mo69619toDpu2uoSUM(int i) {
        return AbstractC11619kG.m29255e(this, i);
    }

    @Override // androidx.compose.p003ui.unit.Density
    /* renamed from: toSp-kPz2Gy4 */
    public /* synthetic */ long mo69626toSpkPz2Gy4(int i) {
        return AbstractC11619kG.m29247m(this, i);
    }
}