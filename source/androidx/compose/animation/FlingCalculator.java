package androidx.compose.animation;

import androidx.compose.p003ui.unit.Density;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import ch.qos.logback.core.CoreConstants;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001:\u0001\u001cB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\f\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0016¨\u0006\u001d"}, m28850d2 = {"Landroidx/compose/animation/FlingCalculator;", "", "", "friction", "Landroidx/compose/ui/unit/Density;", "density", "<init>", "(FLandroidx/compose/ui/unit/Density;)V", "velocity", "", "flingDuration", "(F)J", "flingDistance", "(F)F", "Landroidx/compose/animation/FlingCalculator$FlingInfo;", "flingInfo", "(F)Landroidx/compose/animation/FlingCalculator$FlingInfo;", PDPageLabelRange.STYLE_LETTERS_LOWER, "(Landroidx/compose/ui/unit/Density;)F", "", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "(F)D", "F", "Landroidx/compose/ui/unit/Density;", "getDensity", "()Landroidx/compose/ui/unit/Density;", OperatorName.CURVE_TO, "magicPhysicalCoefficient", "FlingInfo", "animation_release"}, m28849k = 1, m28848mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class FlingCalculator {

    /* renamed from: a */
    public final float f12378a;

    /* renamed from: b */
    public final Density f12379b;

    /* renamed from: c */
    public final float f12380c;

    @StabilityInferred(parameters = 0)
    @Metadata(m28851d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u000e\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\n\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\f\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\f\u0010\u000bJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J.\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010\u000eR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\u001f\u001a\u0004\b\"\u0010\u000eR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010\u0011¨\u0006&"}, m28850d2 = {"Landroidx/compose/animation/FlingCalculator$FlingInfo;", "", "", "initialVelocity", "distance", "", TypedValues.TransitionType.S_DURATION, "<init>", "(FFJ)V", "time", "position", "(J)F", "velocity", "component1", "()F", "component2", "component3", "()J", "copy", "(FFJ)Landroidx/compose/animation/FlingCalculator$FlingInfo;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", PDPageLabelRange.STYLE_LETTERS_LOWER, "F", "getInitialVelocity", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "getDistance", OperatorName.CURVE_TO, OperatorName.SET_LINE_CAPSTYLE, "getDuration", "animation_release"}, m28849k = 1, m28848mv = {1, 8, 0})
    /* loaded from: classes.dex */
    public static final class FlingInfo {
        public static final int $stable = 0;

        /* renamed from: a */
        public final float f12381a;

        /* renamed from: b */
        public final float f12382b;

        /* renamed from: c */
        public final long f12383c;

        public FlingInfo(float f, float f2, long j) {
            this.f12381a = f;
            this.f12382b = f2;
            this.f12383c = j;
        }

        public static /* synthetic */ FlingInfo copy$default(FlingInfo flingInfo, float f, float f2, long j, int i, Object obj) {
            if ((i & 1) != 0) {
                f = flingInfo.f12381a;
            }
            if ((i & 2) != 0) {
                f2 = flingInfo.f12382b;
            }
            if ((i & 4) != 0) {
                j = flingInfo.f12383c;
            }
            return flingInfo.copy(f, f2, j);
        }

        public final float component1() {
            return this.f12381a;
        }

        public final float component2() {
            return this.f12382b;
        }

        public final long component3() {
            return this.f12383c;
        }

        @NotNull
        public final FlingInfo copy(float f, float f2, long j) {
            return new FlingInfo(f, f2, j);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof FlingInfo) {
                FlingInfo flingInfo = (FlingInfo) obj;
                return Float.compare(this.f12381a, flingInfo.f12381a) == 0 && Float.compare(this.f12382b, flingInfo.f12382b) == 0 && this.f12383c == flingInfo.f12383c;
            }
            return false;
        }

        public final float getDistance() {
            return this.f12382b;
        }

        public final long getDuration() {
            return this.f12383c;
        }

        public final float getInitialVelocity() {
            return this.f12381a;
        }

        public int hashCode() {
            return (((Float.floatToIntBits(this.f12381a) * 31) + Float.floatToIntBits(this.f12382b)) * 31) + AbstractC17792Ig1.m67882a(this.f12383c);
        }

        public final float position(long j) {
            float f;
            long j2 = this.f12383c;
            if (j2 > 0) {
                f = ((float) j) / ((float) j2);
            } else {
                f = 1.0f;
            }
            return this.f12382b * Math.signum(this.f12381a) * AndroidFlingSpline.INSTANCE.flingPosition(f).getDistanceCoefficient();
        }

        @NotNull
        public String toString() {
            return "FlingInfo(initialVelocity=" + this.f12381a + ", distance=" + this.f12382b + ", duration=" + this.f12383c + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }

        public final float velocity(long j) {
            float f;
            long j2 = this.f12383c;
            if (j2 > 0) {
                f = ((float) j) / ((float) j2);
            } else {
                f = 1.0f;
            }
            return (((AndroidFlingSpline.INSTANCE.flingPosition(f).getVelocityCoefficient() * Math.signum(this.f12381a)) * this.f12382b) / ((float) this.f12383c)) * 1000.0f;
        }
    }

    public FlingCalculator(float f, @NotNull Density density) {
        Intrinsics.checkNotNullParameter(density, "density");
        this.f12378a = f;
        this.f12379b = density;
        this.f12380c = m61726a(density);
    }

    /* renamed from: a */
    public final float m61726a(Density density) {
        float m61724a;
        m61724a = FlingCalculatorKt.m61724a(0.84f, density.getDensity());
        return m61724a;
    }

    /* renamed from: b */
    public final double m61725b(float f) {
        return AndroidFlingSpline.INSTANCE.deceleration(f, this.f12378a * this.f12380c);
    }

    public final float flingDistance(float f) {
        float f2;
        float f3;
        double m61725b = m61725b(f);
        f2 = FlingCalculatorKt.f12384a;
        double d = this.f12378a * this.f12380c;
        f3 = FlingCalculatorKt.f12384a;
        return (float) (d * Math.exp((f3 / (f2 - 1.0d)) * m61725b));
    }

    public final long flingDuration(float f) {
        float f2;
        double m61725b = m61725b(f);
        f2 = FlingCalculatorKt.f12384a;
        return (long) (Math.exp(m61725b / (f2 - 1.0d)) * 1000.0d);
    }

    @NotNull
    public final FlingInfo flingInfo(float f) {
        float f2;
        float f3;
        double m61725b = m61725b(f);
        f2 = FlingCalculatorKt.f12384a;
        double d = f2 - 1.0d;
        f3 = FlingCalculatorKt.f12384a;
        return new FlingInfo(f, (float) (this.f12378a * this.f12380c * Math.exp((f3 / d) * m61725b)), (long) (Math.exp(m61725b / d) * 1000.0d));
    }

    @NotNull
    public final Density getDensity() {
        return this.f12379b;
    }
}
