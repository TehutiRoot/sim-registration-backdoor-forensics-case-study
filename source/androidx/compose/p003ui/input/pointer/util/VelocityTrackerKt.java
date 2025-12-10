package androidx.compose.p003ui.input.pointer.util;

import androidx.compose.p003ui.geometry.Offset;
import androidx.compose.p003ui.input.pointer.HistoricalChange;
import androidx.compose.p003ui.input.pointer.PointerEventKt;
import androidx.compose.p003ui.input.pointer.PointerInputChange;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.AbstractC11719c;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u0000>\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0014\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\b\u001a3\u0010\t\u001a\u00020\b*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\n\u001a\u0019\u0010\u000e\u001a\u00020\b*\u00020\u000b2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000f\u001a9\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00022\b\b\u0002\u0010\u0015\u001a\u00020\u0010H\u0000¢\u0006\u0004\b\u0016\u0010\u0017\u001a/\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u001b\u0010\u001d\u001a\u00020\u0006*\u00020\u00102\u0006\u0010\u001b\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u001d\u0010\u001e*\u0018\b\u0002\u0010\u001f\"\b\u0012\u0004\u0012\u00020\u00100\u00002\b\u0012\u0004\u0012\u00020\u00100\u0000*\f\b\u0002\u0010 \"\u00020\u00102\u00020\u0010¨\u0006!"}, m28850d2 = {"", "Landroidx/compose/ui/input/pointer/util/DataPointAtTime;", "", FirebaseAnalytics.Param.INDEX, "", "time", "", "dataPoint", "", OperatorName.CURVE_TO, "([Landroidx/compose/ui/input/pointer/util/DataPointAtTime;IJF)V", "Landroidx/compose/ui/input/pointer/util/VelocityTracker;", "Landroidx/compose/ui/input/pointer/PointerInputChange;", "event", "addPointerInputChange", "(Landroidx/compose/ui/input/pointer/util/VelocityTracker;Landroidx/compose/ui/input/pointer/PointerInputChange;)V", "", "x", OperatorName.CURVE_TO_REPLICATE_FINAL_POINT, "sampleCount", "degree", "coefficients", "polyFitLeastSquares", "([F[FII[F)[F", "dataPoints", "", "isDataDifferential", PDPageLabelRange.STYLE_LETTERS_LOWER, "([F[FIZ)F", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "([F[F)F", "Matrix", "Vector", "ui_release"}, m28849k = 2, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nVelocityTracker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VelocityTracker.kt\nandroidx/compose/ui/input/pointer/util/VelocityTrackerKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,618:1\n609#1:625\n616#1,2:626\n612#1,6:628\n609#1:634\n609#1:635\n604#1:636\n612#1:637\n612#1:638\n590#1:639\n590#1:640\n33#2,6:619\n*S KotlinDebug\n*F\n+ 1 VelocityTracker.kt\nandroidx/compose/ui/input/pointer/util/VelocityTrackerKt\n*L\n390#1:625\n392#1:626,2\n394#1:628,6\n401#1:634\n403#1:635\n418#1:636\n460#1:637\n462#1:638\n570#1:639\n580#1:640\n315#1:619,6\n*E\n"})
/* renamed from: androidx.compose.ui.input.pointer.util.VelocityTrackerKt */
/* loaded from: classes2.dex */
public final class VelocityTrackerKt {
    /* renamed from: a */
    public static final float m59592a(float[] fArr, float[] fArr2, int i, boolean z) {
        float f;
        float f2;
        float f3 = 0.0f;
        if (i < 2) {
            return 0.0f;
        }
        if (i == 2) {
            float f4 = fArr2[0];
            float f5 = fArr2[1];
            if (f4 == f5) {
                return 0.0f;
            }
            if (z) {
                f2 = fArr[0];
            } else {
                f2 = fArr[0] - fArr[1];
            }
            return f2 / (f4 - f5);
        }
        int i2 = i - 1;
        for (int i3 = i2; i3 > 0; i3--) {
            int i4 = i3 - 1;
            if (fArr2[i3] != fArr2[i4]) {
                float signum = Math.signum(f3) * ((float) Math.sqrt(2 * Math.abs(f3)));
                if (z) {
                    f = -fArr[i4];
                } else {
                    f = fArr[i3] - fArr[i4];
                }
                float f6 = f / (fArr2[i3] - fArr2[i4]);
                f3 += (f6 - signum) * Math.abs(f6);
                if (i3 == i2) {
                    f3 *= 0.5f;
                }
            }
        }
        return Math.signum(f3) * ((float) Math.sqrt(2 * Math.abs(f3)));
    }

    public static final void addPointerInputChange(@NotNull VelocityTracker velocityTracker, @NotNull PointerInputChange event) {
        Intrinsics.checkNotNullParameter(velocityTracker, "<this>");
        Intrinsics.checkNotNullParameter(event, "event");
        if (PointerEventKt.changedToDownIgnoreConsumed(event)) {
            velocityTracker.m72791setCurrentPointerPositionAccumulatork4lQ0M$ui_release(event.m72714getPositionF1C5BW0());
            velocityTracker.resetTracking();
        }
        long m72715getPreviousPositionF1C5BW0 = event.m72715getPreviousPositionF1C5BW0();
        List<HistoricalChange> historical = event.getHistorical();
        int size = historical.size();
        int i = 0;
        while (i < size) {
            HistoricalChange historicalChange = historical.get(i);
            long m71506minusMKHz9U = Offset.m71506minusMKHz9U(historicalChange.m72646getPositionF1C5BW0(), m72715getPreviousPositionF1C5BW0);
            long m72646getPositionF1C5BW0 = historicalChange.m72646getPositionF1C5BW0();
            velocityTracker.m72791setCurrentPointerPositionAccumulatork4lQ0M$ui_release(Offset.m71507plusMKHz9U(velocityTracker.m72790getCurrentPointerPositionAccumulatorF1C5BW0$ui_release(), m71506minusMKHz9U));
            velocityTracker.m72788addPositionUv8p0NA(historicalChange.getUptimeMillis(), velocityTracker.m72790getCurrentPointerPositionAccumulatorF1C5BW0$ui_release());
            i++;
            m72715getPreviousPositionF1C5BW0 = m72646getPositionF1C5BW0;
        }
        velocityTracker.m72791setCurrentPointerPositionAccumulatork4lQ0M$ui_release(Offset.m71507plusMKHz9U(velocityTracker.m72790getCurrentPointerPositionAccumulatorF1C5BW0$ui_release(), Offset.m71506minusMKHz9U(event.m72714getPositionF1C5BW0(), m72715getPreviousPositionF1C5BW0)));
        velocityTracker.m72788addPositionUv8p0NA(event.getUptimeMillis(), velocityTracker.m72790getCurrentPointerPositionAccumulatorF1C5BW0$ui_release());
    }

    /* renamed from: b */
    public static final float m59591b(float[] fArr, float[] fArr2) {
        int length = fArr.length;
        float f = 0.0f;
        for (int i = 0; i < length; i++) {
            f += fArr[i] * fArr2[i];
        }
        return f;
    }

    /* renamed from: c */
    public static final void m59590c(DataPointAtTime[] dataPointAtTimeArr, int i, long j, float f) {
        DataPointAtTime dataPointAtTime = dataPointAtTimeArr[i];
        if (dataPointAtTime == null) {
            dataPointAtTimeArr[i] = new DataPointAtTime(j, f);
            return;
        }
        dataPointAtTime.setTime(j);
        dataPointAtTime.setDataPoint(f);
    }

    @NotNull
    public static final float[] polyFitLeastSquares(@NotNull float[] x, @NotNull float[] y, int i, int i2, @NotNull float[] coefficients) {
        float m59591b;
        int i3 = i2;
        Intrinsics.checkNotNullParameter(x, "x");
        Intrinsics.checkNotNullParameter(y, "y");
        Intrinsics.checkNotNullParameter(coefficients, "coefficients");
        if (i3 >= 1) {
            if (i != 0) {
                if (i3 >= i) {
                    i3 = i - 1;
                }
                int i4 = i3 + 1;
                float[][] fArr = new float[i4];
                for (int i5 = 0; i5 < i4; i5++) {
                    fArr[i5] = new float[i];
                }
                for (int i6 = 0; i6 < i; i6++) {
                    fArr[0][i6] = 1.0f;
                    for (int i7 = 1; i7 < i4; i7++) {
                        fArr[i7][i6] = fArr[i7 - 1][i6] * x[i6];
                    }
                }
                float[][] fArr2 = new float[i4];
                for (int i8 = 0; i8 < i4; i8++) {
                    fArr2[i8] = new float[i];
                }
                float[][] fArr3 = new float[i4];
                for (int i9 = 0; i9 < i4; i9++) {
                    fArr3[i9] = new float[i4];
                }
                for (int i10 = 0; i10 < i4; i10++) {
                    float[] fArr4 = fArr2[i10];
                    float[] fArr5 = fArr[i10];
                    for (int i11 = 0; i11 < i; i11++) {
                        fArr4[i11] = fArr5[i11];
                    }
                    for (int i12 = 0; i12 < i10; i12++) {
                        float[] fArr6 = fArr2[i12];
                        float m59591b2 = m59591b(fArr4, fArr6);
                        for (int i13 = 0; i13 < i; i13++) {
                            fArr4[i13] = fArr4[i13] - (fArr6[i13] * m59591b2);
                        }
                    }
                    float sqrt = (float) Math.sqrt(m59591b(fArr4, fArr4));
                    if (sqrt >= 1.0E-6f) {
                        float f = 1.0f / sqrt;
                        for (int i14 = 0; i14 < i; i14++) {
                            fArr4[i14] = fArr4[i14] * f;
                        }
                        float[] fArr7 = fArr3[i10];
                        for (int i15 = 0; i15 < i4; i15++) {
                            if (i15 < i10) {
                                m59591b = 0.0f;
                            } else {
                                m59591b = m59591b(fArr4, fArr[i15]);
                            }
                            fArr7[i15] = m59591b;
                        }
                    } else {
                        throw new IllegalArgumentException("Vectors are linearly dependent or zero so no solution. TODO(shepshapard), actually determine what this means");
                    }
                }
                for (int i16 = i3; -1 < i16; i16--) {
                    coefficients[i16] = m59591b(fArr2[i16], y);
                    int i17 = i16 + 1;
                    if (i17 <= i3) {
                        int i18 = i3;
                        while (true) {
                            coefficients[i16] = coefficients[i16] - (fArr3[i16][i18] * coefficients[i18]);
                            if (i18 != i17) {
                                i18--;
                            }
                        }
                    }
                    coefficients[i16] = coefficients[i16] / fArr3[i16][i16];
                }
                return coefficients;
            }
            throw new IllegalArgumentException("At least one point must be provided");
        }
        throw new IllegalArgumentException("The degree must be at positive integer");
    }

    public static /* synthetic */ float[] polyFitLeastSquares$default(float[] fArr, float[] fArr2, int i, int i2, float[] fArr3, int i3, Object obj) {
        if ((i3 & 16) != 0) {
            fArr3 = new float[AbstractC11719c.coerceAtLeast(i2 + 1, 0)];
        }
        return polyFitLeastSquares(fArr, fArr2, i, i2, fArr3);
    }
}
