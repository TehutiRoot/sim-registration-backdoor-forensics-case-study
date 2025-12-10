package androidx.compose.foundation.text;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.p003ui.geometry.Rect;
import androidx.compose.p003ui.text.TextRange;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.saveable.ListSaverKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.AbstractC11719c;
import org.jetbrains.annotations.NotNull;

@Stable
@Metadata(m28851d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b!\b\u0001\u0018\u0000 72\u00020\u0001:\u00017B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\t\b\u0016¢\u0006\u0004\b\u0006\u0010\bJ-\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f¢\u0006\u0004\b\u0010\u0010\u0011J'\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\fH\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u001b\u0010\u001b\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u0017ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0019\u0010\u001aR+\u0010#\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u00048F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R+\u0010&\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u00048F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b$\u0010\u001e\u001a\u0004\b%\u0010 \"\u0004\b\u001d\u0010\"R\u0016\u0010)\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(R+\u00100\u001a\u00020\u00178\u0006@\u0006X\u0086\u000eø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R+\u0010\t\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u00028F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b1\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u00068"}, m28850d2 = {"Landroidx/compose/foundation/text/TextFieldScrollerPosition;", "", "Landroidx/compose/foundation/gestures/Orientation;", "initialOrientation", "", "initial", "<init>", "(Landroidx/compose/foundation/gestures/Orientation;F)V", "()V", "orientation", "Landroidx/compose/ui/geometry/Rect;", "cursorRect", "", "containerSize", "textFieldSize", "", "update", "(Landroidx/compose/foundation/gestures/Orientation;Landroidx/compose/ui/geometry/Rect;II)V", "cursorStart", "cursorEnd", "coerceOffset$foundation_release", "(FFI)V", "coerceOffset", "Landroidx/compose/ui/text/TextRange;", "selection", "getOffsetToFollow-5zc-tL8", "(J)I", "getOffsetToFollow", "<set-?>", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroidx/compose/runtime/MutableFloatState;", "getOffset", "()F", "setOffset", "(F)V", TypedValues.CycleType.S_WAVE_OFFSET, OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "getMaximum", "maximum", OperatorName.CURVE_TO, "Landroidx/compose/ui/geometry/Rect;", "previousCursorRect", "d", OperatorName.SET_LINE_CAPSTYLE, "getPreviousSelection-d9O1mEE", "()J", "setPreviousSelection-5zc-tL8", "(J)V", "previousSelection", "e", "Landroidx/compose/runtime/MutableState;", "getOrientation", "()Landroidx/compose/foundation/gestures/Orientation;", "setOrientation", "(Landroidx/compose/foundation/gestures/Orientation;)V", "Companion", "foundation_release"}, m28849k = 1, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nTextFieldScroll.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldScroll.kt\nandroidx/compose/foundation/text/TextFieldScrollerPosition\n+ 2 SnapshotFloatState.kt\nandroidx/compose/runtime/PrimitiveSnapshotStateKt__SnapshotFloatStateKt\n+ 3 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,370:1\n75#2:371\n108#2,2:372\n75#2:374\n108#2,2:375\n81#3:377\n107#3,2:378\n*S KotlinDebug\n*F\n+ 1 TextFieldScroll.kt\nandroidx/compose/foundation/text/TextFieldScrollerPosition\n*L\n254#1:371\n254#1:372,2\n260#1:374\n260#1:375,2\n275#1:377\n275#1:378,2\n*E\n"})
/* loaded from: classes.dex */
public final class TextFieldScrollerPosition {
    @NotNull
    public static final Companion Companion = new Companion(null);

    /* renamed from: f */
    public static final Saver f14044f = ListSaverKt.listSaver(TextFieldScrollerPosition$Companion$Saver$1.INSTANCE, TextFieldScrollerPosition$Companion$Saver$2.INSTANCE);

    /* renamed from: a */
    public final MutableFloatState f14045a;

    /* renamed from: b */
    public final MutableFloatState f14046b;

    /* renamed from: c */
    public Rect f14047c;

    /* renamed from: d */
    public long f14048d;

    /* renamed from: e */
    public final MutableState f14049e;

    @Metadata(m28851d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001d\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m28850d2 = {"Landroidx/compose/foundation/text/TextFieldScrollerPosition$Companion;", "", "()V", "Saver", "Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/foundation/text/TextFieldScrollerPosition;", "getSaver", "()Landroidx/compose/runtime/saveable/Saver;", "foundation_release"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Saver<TextFieldScrollerPosition, Object> getSaver() {
            return TextFieldScrollerPosition.f14044f;
        }

        public Companion() {
        }
    }

    public TextFieldScrollerPosition(@NotNull Orientation initialOrientation, float f) {
        Intrinsics.checkNotNullParameter(initialOrientation, "initialOrientation");
        this.f14045a = PrimitiveSnapshotStateKt.mutableFloatStateOf(f);
        this.f14046b = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
        this.f14047c = Rect.Companion.getZero();
        this.f14048d = TextRange.Companion.m73221getZerod9O1mEE();
        this.f14049e = SnapshotStateKt.mutableStateOf(initialOrientation, SnapshotStateKt.structuralEqualityPolicy());
    }

    /* renamed from: a */
    public final void m61054a(float f) {
        this.f14046b.setFloatValue(f);
    }

    public final void coerceOffset$foundation_release(float f, float f2, int i) {
        int i2;
        float f3;
        float offset = getOffset();
        float f4 = i;
        float f5 = offset + f4;
        if (f2 > f5 || (f < offset && f2 - f > f4)) {
            f3 = f2 - f5;
        } else if (i2 < 0 && f2 - f <= f4) {
            f3 = f - offset;
        } else {
            f3 = 0.0f;
        }
        setOffset(getOffset() + f3);
    }

    public final float getMaximum() {
        return this.f14046b.getFloatValue();
    }

    public final float getOffset() {
        return this.f14045a.getFloatValue();
    }

    /* renamed from: getOffsetToFollow-5zc-tL8  reason: not valid java name */
    public final int m69794getOffsetToFollow5zctL8(long j) {
        if (TextRange.m73216getStartimpl(j) != TextRange.m73216getStartimpl(this.f14048d)) {
            return TextRange.m73216getStartimpl(j);
        }
        if (TextRange.m73211getEndimpl(j) != TextRange.m73211getEndimpl(this.f14048d)) {
            return TextRange.m73211getEndimpl(j);
        }
        return TextRange.m73214getMinimpl(j);
    }

    @NotNull
    public final Orientation getOrientation() {
        return (Orientation) this.f14049e.getValue();
    }

    /* renamed from: getPreviousSelection-d9O1mEE  reason: not valid java name */
    public final long m69795getPreviousSelectiond9O1mEE() {
        return this.f14048d;
    }

    public final void setOffset(float f) {
        this.f14045a.setFloatValue(f);
    }

    public final void setOrientation(@NotNull Orientation orientation) {
        Intrinsics.checkNotNullParameter(orientation, "<set-?>");
        this.f14049e.setValue(orientation);
    }

    /* renamed from: setPreviousSelection-5zc-tL8  reason: not valid java name */
    public final void m69796setPreviousSelection5zctL8(long j) {
        this.f14048d = j;
    }

    public final void update(@NotNull Orientation orientation, @NotNull Rect cursorRect, int i, int i2) {
        boolean z;
        float left;
        float right;
        Intrinsics.checkNotNullParameter(orientation, "orientation");
        Intrinsics.checkNotNullParameter(cursorRect, "cursorRect");
        float f = i2 - i;
        m61054a(f);
        if (cursorRect.getLeft() != this.f14047c.getLeft() || cursorRect.getTop() != this.f14047c.getTop()) {
            if (orientation == Orientation.Vertical) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                left = cursorRect.getTop();
            } else {
                left = cursorRect.getLeft();
            }
            if (z) {
                right = cursorRect.getBottom();
            } else {
                right = cursorRect.getRight();
            }
            coerceOffset$foundation_release(left, right, i);
            this.f14047c = cursorRect;
        }
        setOffset(AbstractC11719c.coerceIn(getOffset(), 0.0f, f));
    }

    public /* synthetic */ TextFieldScrollerPosition(Orientation orientation, float f, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(orientation, (i & 2) != 0 ? 0.0f : f);
    }

    public TextFieldScrollerPosition() {
        this(Orientation.Vertical, 0.0f, 2, null);
    }
}
