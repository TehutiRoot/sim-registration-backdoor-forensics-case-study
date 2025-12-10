package androidx.compose.foundation.gestures;

import androidx.compose.runtime.internal.StabilityInferred;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public abstract class TransformEvent {

    @StabilityInferred(parameters = 0)
    @Metadata(m29143d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0007\u0018\u00002\u00020\u0001B\"\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR \u0010\u0005\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\n\u001a\u0004\b\u0012\u0010\f\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0013"}, m29142d2 = {"Landroidx/compose/foundation/gestures/TransformEvent$TransformDelta;", "Landroidx/compose/foundation/gestures/TransformEvent;", "", "zoomChange", "Landroidx/compose/ui/geometry/Offset;", "panChange", "rotationChange", "<init>", "(FJFLkotlin/jvm/internal/DefaultConstructorMarker;)V", PDPageLabelRange.STYLE_LETTERS_LOWER, "F", "getZoomChange", "()F", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, OperatorName.SET_LINE_CAPSTYLE, "getPanChange-F1C5BW0", "()J", OperatorName.CURVE_TO, "getRotationChange", "foundation_release"}, m29141k = 1, m29140mv = {1, 8, 0})
    /* loaded from: classes.dex */
    public static final class TransformDelta extends TransformEvent {
        public static final int $stable = 0;

        /* renamed from: a */
        public final float f13109a;

        /* renamed from: b */
        public final long f13110b;

        /* renamed from: c */
        public final float f13111c;

        public /* synthetic */ TransformDelta(float f, long j, float f2, DefaultConstructorMarker defaultConstructorMarker) {
            this(f, j, f2);
        }

        /* renamed from: getPanChange-F1C5BW0  reason: not valid java name */
        public final long m69637getPanChangeF1C5BW0() {
            return this.f13110b;
        }

        public final float getRotationChange() {
            return this.f13111c;
        }

        public final float getZoomChange() {
            return this.f13109a;
        }

        public TransformDelta(float f, long j, float f2) {
            super(null);
            this.f13109a = f;
            this.f13110b = j;
            this.f13111c = f2;
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(m29143d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m29142d2 = {"Landroidx/compose/foundation/gestures/TransformEvent$TransformStarted;", "Landroidx/compose/foundation/gestures/TransformEvent;", "()V", "foundation_release"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* loaded from: classes.dex */
    public static final class TransformStarted extends TransformEvent {
        public static final int $stable = 0;
        @NotNull
        public static final TransformStarted INSTANCE = new TransformStarted();

        public TransformStarted() {
            super(null);
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(m29143d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m29142d2 = {"Landroidx/compose/foundation/gestures/TransformEvent$TransformStopped;", "Landroidx/compose/foundation/gestures/TransformEvent;", "()V", "foundation_release"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* loaded from: classes.dex */
    public static final class TransformStopped extends TransformEvent {
        public static final int $stable = 0;
        @NotNull
        public static final TransformStopped INSTANCE = new TransformStopped();

        public TransformStopped() {
            super(null);
        }
    }

    public /* synthetic */ TransformEvent(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public TransformEvent() {
    }
}