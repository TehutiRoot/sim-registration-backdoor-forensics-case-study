package androidx.compose.animation;

import androidx.compose.runtime.internal.StabilityInferred;
import ch.qos.logback.core.CoreConstants;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m29143d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\b\u0007\bÀ\u0002\u0018\u00002\u00020\u0001:\u0001\u0014B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0010¨\u0006\u0015"}, m29142d2 = {"Landroidx/compose/animation/AndroidFlingSpline;", "", "<init>", "()V", "", "time", "Landroidx/compose/animation/AndroidFlingSpline$FlingResult;", "flingPosition", "(F)Landroidx/compose/animation/AndroidFlingSpline$FlingResult;", "velocity", "friction", "", "deceleration", "(FF)D", "", PDPageLabelRange.STYLE_LETTERS_LOWER, "[F", "SplinePositions", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "SplineTimes", "FlingResult", "animation_release"}, m29141k = 1, m29140mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class AndroidFlingSpline {
    @NotNull
    public static final AndroidFlingSpline INSTANCE = new AndroidFlingSpline();

    /* renamed from: a */
    public static final float[] f12412a;

    /* renamed from: b */
    public static final float[] f12413b;

    @StabilityInferred(parameters = 0)
    @Metadata(m29143d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0017\u001a\u0004\b\u001a\u0010\b¨\u0006\u001b"}, m29142d2 = {"Landroidx/compose/animation/AndroidFlingSpline$FlingResult;", "", "", "distanceCoefficient", "velocityCoefficient", "<init>", "(FF)V", "component1", "()F", "component2", "copy", "(FF)Landroidx/compose/animation/AndroidFlingSpline$FlingResult;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", PDPageLabelRange.STYLE_LETTERS_LOWER, "F", "getDistanceCoefficient", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "getVelocityCoefficient", "animation_release"}, m29141k = 1, m29140mv = {1, 8, 0})
    /* loaded from: classes.dex */
    public static final class FlingResult {
        public static final int $stable = 0;

        /* renamed from: a */
        public final float f12414a;

        /* renamed from: b */
        public final float f12415b;

        public FlingResult(float f, float f2) {
            this.f12414a = f;
            this.f12415b = f2;
        }

        public static /* synthetic */ FlingResult copy$default(FlingResult flingResult, float f, float f2, int i, Object obj) {
            if ((i & 1) != 0) {
                f = flingResult.f12414a;
            }
            if ((i & 2) != 0) {
                f2 = flingResult.f12415b;
            }
            return flingResult.copy(f, f2);
        }

        public final float component1() {
            return this.f12414a;
        }

        public final float component2() {
            return this.f12415b;
        }

        @NotNull
        public final FlingResult copy(float f, float f2) {
            return new FlingResult(f, f2);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof FlingResult) {
                FlingResult flingResult = (FlingResult) obj;
                return Float.compare(this.f12414a, flingResult.f12414a) == 0 && Float.compare(this.f12415b, flingResult.f12415b) == 0;
            }
            return false;
        }

        public final float getDistanceCoefficient() {
            return this.f12414a;
        }

        public final float getVelocityCoefficient() {
            return this.f12415b;
        }

        public int hashCode() {
            return (Float.floatToIntBits(this.f12414a) * 31) + Float.floatToIntBits(this.f12415b);
        }

        @NotNull
        public String toString() {
            return "FlingResult(distanceCoefficient=" + this.f12414a + ", velocityCoefficient=" + this.f12415b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    static {
        float[] fArr = new float[101];
        f12412a = fArr;
        float[] fArr2 = new float[101];
        f12413b = fArr2;
        SplineBasedDecayKt.m61662a(fArr, fArr2, 100);
    }

    public final double deceleration(float f, float f2) {
        return Math.log((Math.abs(f) * 0.35f) / f2);
    }

    @NotNull
    public final FlingResult flingPosition(float f) {
        float f2;
        float f3;
        float f4 = 100;
        int i = (int) (f4 * f);
        if (i < 100) {
            float f5 = i / f4;
            int i2 = i + 1;
            float f6 = i2 / f4;
            float[] fArr = f12412a;
            float f7 = fArr[i];
            f3 = (fArr[i2] - f7) / (f6 - f5);
            f2 = f7 + ((f - f5) * f3);
        } else {
            f2 = 1.0f;
            f3 = 0.0f;
        }
        return new FlingResult(f2, f3);
    }
}