package androidx.compose.p003ui.input.pointer;

import android.view.MotionEvent;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0000\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, m28850d2 = {"Landroidx/compose/ui/input/pointer/PointerInputEvent;", "", "", "uptime", "", "Landroidx/compose/ui/input/pointer/PointerInputEventData;", "pointers", "Landroid/view/MotionEvent;", "motionEvent", "<init>", "(JLjava/util/List;Landroid/view/MotionEvent;)V", PDPageLabelRange.STYLE_LETTERS_LOWER, OperatorName.SET_LINE_CAPSTYLE, "getUptime", "()J", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Ljava/util/List;", "getPointers", "()Ljava/util/List;", OperatorName.CURVE_TO, "Landroid/view/MotionEvent;", "getMotionEvent", "()Landroid/view/MotionEvent;", "ui_release"}, m28849k = 1, m28848mv = {1, 8, 0})
/* renamed from: androidx.compose.ui.input.pointer.PointerInputEvent */
/* loaded from: classes2.dex */
public final class PointerInputEvent {

    /* renamed from: a */
    public final long f29968a;

    /* renamed from: b */
    public final List f29969b;

    /* renamed from: c */
    public final MotionEvent f29970c;

    public PointerInputEvent(long j, @NotNull List<PointerInputEventData> pointers, @NotNull MotionEvent motionEvent) {
        Intrinsics.checkNotNullParameter(pointers, "pointers");
        Intrinsics.checkNotNullParameter(motionEvent, "motionEvent");
        this.f29968a = j;
        this.f29969b = pointers;
        this.f29970c = motionEvent;
    }

    @NotNull
    public final MotionEvent getMotionEvent() {
        return this.f29970c;
    }

    @NotNull
    public final List<PointerInputEventData> getPointers() {
        return this.f29969b;
    }

    public final long getUptime() {
        return this.f29968a;
    }
}
