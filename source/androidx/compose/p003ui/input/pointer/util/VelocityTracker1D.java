package androidx.compose.p003ui.input.pointer.util;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001:\u00010B\u001d\b\u0000\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\bJ\u001d\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\u000b¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\r¢\u0006\u0004\b\u0012\u0010\u0013J'\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001b\u001a\u0004\b\u0003\u0010\u001cR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010!\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u001c\u0010&\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010#0\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0016\u0010(\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010 R\u0014\u0010+\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010-\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010*R\u0014\u0010/\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010*¨\u00061"}, m28850d2 = {"Landroidx/compose/ui/input/pointer/util/VelocityTracker1D;", "", "", "isDataDifferential", "Landroidx/compose/ui/input/pointer/util/VelocityTracker1D$Strategy;", "strategy", "<init>", "(ZLandroidx/compose/ui/input/pointer/util/VelocityTracker1D$Strategy;)V", "(Z)V", "", "timeMillis", "", "dataPoint", "", "addDataPoint", "(JF)V", "calculateVelocity", "()F", "resetTracking", "()V", "", "dataPoints", "time", "", "sampleCount", PDPageLabelRange.STYLE_LETTERS_LOWER, "([F[FI)F", "Z", "()Z", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Landroidx/compose/ui/input/pointer/util/VelocityTracker1D$Strategy;", OperatorName.CURVE_TO, "I", "minSampleSize", "", "Landroidx/compose/ui/input/pointer/util/DataPointAtTime;", "d", "[Landroidx/compose/ui/input/pointer/util/DataPointAtTime;", "samples", "e", FirebaseAnalytics.Param.INDEX, OperatorName.FILL_NON_ZERO, "[F", "reusableDataPointsArray", OperatorName.NON_STROKING_GRAY, "reusableTimeArray", OperatorName.CLOSE_PATH, "reusableVelocityCoefficients", "Strategy", "ui_release"}, m28849k = 1, m28848mv = {1, 8, 0})
/* renamed from: androidx.compose.ui.input.pointer.util.VelocityTracker1D */
/* loaded from: classes2.dex */
public final class VelocityTracker1D {
    public static final int $stable = 8;

    /* renamed from: a */
    public final boolean f30026a;

    /* renamed from: b */
    public final Strategy f30027b;

    /* renamed from: c */
    public final int f30028c;

    /* renamed from: d */
    public final DataPointAtTime[] f30029d;

    /* renamed from: e */
    public int f30030e;

    /* renamed from: f */
    public final float[] f30031f;

    /* renamed from: g */
    public final float[] f30032g;

    /* renamed from: h */
    public final float[] f30033h;

    @Metadata(m28851d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, m28850d2 = {"Landroidx/compose/ui/input/pointer/util/VelocityTracker1D$Strategy;", "", "(Ljava/lang/String;I)V", "Lsq2", "Impulse", "ui_release"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* renamed from: androidx.compose.ui.input.pointer.util.VelocityTracker1D$Strategy */
    /* loaded from: classes2.dex */
    public enum Strategy {
        Lsq2,
        Impulse
    }

    @Metadata(m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* renamed from: androidx.compose.ui.input.pointer.util.VelocityTracker1D$WhenMappings */
    /* loaded from: classes2.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Strategy.values().length];
            try {
                iArr[Strategy.Impulse.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Strategy.Lsq2.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public VelocityTracker1D() {
        this(false, null, 3, null);
    }

    /* renamed from: a */
    public final float m59593a(float[] fArr, float[] fArr2, int i) {
        try {
            return VelocityTrackerKt.polyFitLeastSquares(fArr2, fArr, i, 2, this.f30033h)[1];
        } catch (IllegalArgumentException unused) {
            return 0.0f;
        }
    }

    public final void addDataPoint(long j, float f) {
        int i = (this.f30030e + 1) % 20;
        this.f30030e = i;
        VelocityTrackerKt.m59590c(this.f30029d, i, j, f);
    }

    public final float calculateVelocity() {
        float m59592a;
        float[] fArr = this.f30031f;
        float[] fArr2 = this.f30032g;
        int i = this.f30030e;
        DataPointAtTime dataPointAtTime = this.f30029d[i];
        if (dataPointAtTime == null) {
            return 0.0f;
        }
        int i2 = 0;
        DataPointAtTime dataPointAtTime2 = dataPointAtTime;
        while (true) {
            DataPointAtTime dataPointAtTime3 = this.f30029d[i];
            if (dataPointAtTime3 != null) {
                float time = (float) (dataPointAtTime.getTime() - dataPointAtTime3.getTime());
                float abs = (float) Math.abs(dataPointAtTime3.getTime() - dataPointAtTime2.getTime());
                if (time > 100.0f || abs > 40.0f) {
                    break;
                }
                fArr[i2] = dataPointAtTime3.getDataPoint();
                fArr2[i2] = -time;
                if (i == 0) {
                    i = 20;
                }
                i--;
                i2++;
                if (i2 >= 20) {
                    break;
                }
                dataPointAtTime2 = dataPointAtTime3;
            } else {
                break;
            }
        }
        if (i2 < this.f30028c) {
            return 0.0f;
        }
        int i3 = WhenMappings.$EnumSwitchMapping$0[this.f30027b.ordinal()];
        if (i3 == 1) {
            m59592a = VelocityTrackerKt.m59592a(fArr, fArr2, i2, this.f30026a);
        } else if (i3 == 2) {
            m59592a = m59593a(fArr, fArr2, i2);
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return m59592a * 1000;
    }

    public final boolean isDataDifferential() {
        return this.f30026a;
    }

    public final void resetTracking() {
        ArraysKt___ArraysJvmKt.fill$default(this.f30029d, (Object) null, 0, 0, 6, (Object) null);
        this.f30030e = 0;
    }

    public VelocityTracker1D(boolean z, @NotNull Strategy strategy) {
        Intrinsics.checkNotNullParameter(strategy, "strategy");
        this.f30026a = z;
        this.f30027b = strategy;
        if (z && strategy.equals(Strategy.Lsq2)) {
            throw new IllegalStateException("Lsq2 not (yet) supported for differential axes");
        }
        int i = WhenMappings.$EnumSwitchMapping$0[strategy.ordinal()];
        int i2 = 2;
        if (i != 1) {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i2 = 3;
        }
        this.f30028c = i2;
        this.f30029d = new DataPointAtTime[20];
        this.f30031f = new float[20];
        this.f30032g = new float[20];
        this.f30033h = new float[3];
    }

    public /* synthetic */ VelocityTracker1D(boolean z, Strategy strategy, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? Strategy.Lsq2 : strategy);
    }

    public VelocityTracker1D(boolean z) {
        this(z, Strategy.Impulse);
    }
}
