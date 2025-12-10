package androidx.compose.p003ui.input.pointer.util;

import androidx.compose.p003ui.geometry.Offset;
import androidx.compose.p003ui.unit.VelocityKt;
import androidx.compose.runtime.internal.StabilityInferred;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\u000f\u001a\u00020\fø\u0001\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u0010\u001a\u00020\b¢\u0006\u0004\b\u0010\u0010\u0003R\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0013R+\u0010\u001c\u001a\u00020\u00068\u0000@\u0000X\u0080\u000eø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u000e\"\u0004\b\u001a\u0010\u001b\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006\u001d"}, m28850d2 = {"Landroidx/compose/ui/input/pointer/util/VelocityTracker;", "", "<init>", "()V", "", "timeMillis", "Landroidx/compose/ui/geometry/Offset;", "position", "", "addPosition-Uv8p0NA", "(JJ)V", "addPosition", "Landroidx/compose/ui/unit/Velocity;", "calculateVelocity-9UxMQ8M", "()J", "calculateVelocity", "resetTracking", "Landroidx/compose/ui/input/pointer/util/VelocityTracker1D;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroidx/compose/ui/input/pointer/util/VelocityTracker1D;", "xVelocityTracker", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "yVelocityTracker", OperatorName.CURVE_TO, OperatorName.SET_LINE_CAPSTYLE, "getCurrentPointerPositionAccumulator-F1C5BW0$ui_release", "setCurrentPointerPositionAccumulator-k-4lQ0M$ui_release", "(J)V", "currentPointerPositionAccumulator", "ui_release"}, m28849k = 1, m28848mv = {1, 8, 0})
/* renamed from: androidx.compose.ui.input.pointer.util.VelocityTracker */
/* loaded from: classes2.dex */
public final class VelocityTracker {
    public static final int $stable = 8;

    /* renamed from: a */
    public final VelocityTracker1D f30023a = new VelocityTracker1D(false, null, 3, null);

    /* renamed from: b */
    public final VelocityTracker1D f30024b = new VelocityTracker1D(false, null, 3, null);

    /* renamed from: c */
    public long f30025c = Offset.Companion.m71518getZeroF1C5BW0();

    /* renamed from: addPosition-Uv8p0NA  reason: not valid java name */
    public final void m72788addPositionUv8p0NA(long j, long j2) {
        this.f30023a.addDataPoint(j, Offset.m71502getXimpl(j2));
        this.f30024b.addDataPoint(j, Offset.m71503getYimpl(j2));
    }

    /* renamed from: calculateVelocity-9UxMQ8M  reason: not valid java name */
    public final long m72789calculateVelocity9UxMQ8M() {
        return VelocityKt.Velocity(this.f30023a.calculateVelocity(), this.f30024b.calculateVelocity());
    }

    /* renamed from: getCurrentPointerPositionAccumulator-F1C5BW0$ui_release  reason: not valid java name */
    public final long m72790getCurrentPointerPositionAccumulatorF1C5BW0$ui_release() {
        return this.f30025c;
    }

    public final void resetTracking() {
        this.f30023a.resetTracking();
        this.f30024b.resetTracking();
    }

    /* renamed from: setCurrentPointerPositionAccumulator-k-4lQ0M$ui_release  reason: not valid java name */
    public final void m72791setCurrentPointerPositionAccumulatork4lQ0M$ui_release(long j) {
        this.f30025c = j;
    }
}
