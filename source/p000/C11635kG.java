package p000;

import androidx.compose.p003ui.geometry.Rect;
import androidx.compose.p003ui.unit.Density;
import androidx.compose.p003ui.unit.DpRect;
import ch.qos.logback.core.CoreConstants;

/* renamed from: kG */
/* loaded from: classes2.dex */
public final class C11635kG implements Density {

    /* renamed from: a */
    public final float f67856a;

    /* renamed from: b */
    public final float f67857b;

    public C11635kG(float f, float f2) {
        this.f67856a = f;
        this.f67857b = f2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11635kG)) {
            return false;
        }
        C11635kG c11635kG = (C11635kG) obj;
        if (Float.compare(this.f67856a, c11635kG.f67856a) == 0 && Float.compare(this.f67857b, c11635kG.f67857b) == 0) {
            return true;
        }
        return false;
    }

    @Override // androidx.compose.p003ui.unit.Density
    public float getDensity() {
        return this.f67856a;
    }

    @Override // androidx.compose.p003ui.unit.Density
    public float getFontScale() {
        return this.f67857b;
    }

    public int hashCode() {
        return (Float.floatToIntBits(this.f67856a) * 31) + Float.floatToIntBits(this.f67857b);
    }

    @Override // androidx.compose.p003ui.unit.Density
    /* renamed from: roundToPx--R2X_6o */
    public /* synthetic */ int mo69431roundToPxR2X_6o(long j) {
        return AbstractC11522jG.m29253a(this, j);
    }

    @Override // androidx.compose.p003ui.unit.Density
    /* renamed from: roundToPx-0680j_4 */
    public /* synthetic */ int mo69432roundToPx0680j_4(float f) {
        return AbstractC11522jG.m29252b(this, f);
    }

    @Override // androidx.compose.p003ui.unit.Density
    /* renamed from: toDp-GaN1DYA */
    public /* synthetic */ float mo69433toDpGaN1DYA(long j) {
        return AbstractC11522jG.m29251c(this, j);
    }

    @Override // androidx.compose.p003ui.unit.Density
    /* renamed from: toDp-u2uoSUM */
    public /* synthetic */ float mo69434toDpu2uoSUM(float f) {
        return AbstractC11522jG.m29250d(this, f);
    }

    @Override // androidx.compose.p003ui.unit.Density
    /* renamed from: toDpSize-k-rfVVM */
    public /* synthetic */ long mo69436toDpSizekrfVVM(long j) {
        return AbstractC11522jG.m29248f(this, j);
    }

    @Override // androidx.compose.p003ui.unit.Density
    /* renamed from: toPx--R2X_6o */
    public /* synthetic */ float mo69437toPxR2X_6o(long j) {
        return AbstractC11522jG.m29247g(this, j);
    }

    @Override // androidx.compose.p003ui.unit.Density
    /* renamed from: toPx-0680j_4 */
    public /* synthetic */ float mo69438toPx0680j_4(float f) {
        return AbstractC11522jG.m29246h(this, f);
    }

    @Override // androidx.compose.p003ui.unit.Density
    public /* synthetic */ Rect toRect(DpRect dpRect) {
        return AbstractC11522jG.m29245i(this, dpRect);
    }

    @Override // androidx.compose.p003ui.unit.Density
    /* renamed from: toSize-XkaWNTQ */
    public /* synthetic */ long mo69439toSizeXkaWNTQ(long j) {
        return AbstractC11522jG.m29244j(this, j);
    }

    @Override // androidx.compose.p003ui.unit.Density
    /* renamed from: toSp-0xMU5do */
    public /* synthetic */ long mo69440toSp0xMU5do(float f) {
        return AbstractC11522jG.m29243k(this, f);
    }

    @Override // androidx.compose.p003ui.unit.Density
    /* renamed from: toSp-kPz2Gy4 */
    public /* synthetic */ long mo69441toSpkPz2Gy4(float f) {
        return AbstractC11522jG.m29242l(this, f);
    }

    public String toString() {
        return "DensityImpl(density=" + this.f67856a + ", fontScale=" + this.f67857b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    @Override // androidx.compose.p003ui.unit.Density
    /* renamed from: toDp-u2uoSUM */
    public /* synthetic */ float mo69435toDpu2uoSUM(int i) {
        return AbstractC11522jG.m29249e(this, i);
    }

    @Override // androidx.compose.p003ui.unit.Density
    /* renamed from: toSp-kPz2Gy4 */
    public /* synthetic */ long mo69442toSpkPz2Gy4(int i) {
        return AbstractC11522jG.m29241m(this, i);
    }
}
