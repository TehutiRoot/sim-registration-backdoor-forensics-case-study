package androidx.compose.p003ui.focus;

import androidx.compose.runtime.internal.StabilityInferred;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 0)
@Deprecated(message = "Use FocusProperties instead")
@Metadata(m28851d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u001b\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\t\b\u0016¢\u0006\u0004\b\u0004\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR$\u0010\n\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR$\u0010\u000f\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\t8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000eR$\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\t8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0013\u0010\f\"\u0004\b\u0014\u0010\u000eR$\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\t8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0016\u0010\f\"\u0004\b\u0017\u0010\u000eR$\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\t8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0019\u0010\f\"\u0004\b\u001a\u0010\u000eR$\u0010\u001b\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\t8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001c\u0010\f\"\u0004\b\u001d\u0010\u000eR$\u0010\u001e\u001a\u00020\t2\u0006\u0010\u001e\u001a\u00020\t8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001f\u0010\f\"\u0004\b \u0010\u000eR$\u0010!\u001a\u00020\t2\u0006\u0010!\u001a\u00020\t8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\"\u0010\f\"\u0004\b#\u0010\u000e¨\u0006$"}, m28850d2 = {"Landroidx/compose/ui/focus/FocusOrder;", "", "Landroidx/compose/ui/focus/FocusProperties;", "focusProperties", "<init>", "(Landroidx/compose/ui/focus/FocusProperties;)V", "()V", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroidx/compose/ui/focus/FocusProperties;", "Landroidx/compose/ui/focus/FocusRequester;", "next", "getNext", "()Landroidx/compose/ui/focus/FocusRequester;", "setNext", "(Landroidx/compose/ui/focus/FocusRequester;)V", "previous", "getPrevious", "setPrevious", "up", "getUp", "setUp", "down", "getDown", "setDown", "left", "getLeft", "setLeft", "right", "getRight", "setRight", "start", "getStart", "setStart", "end", "getEnd", "setEnd", "ui_release"}, m28849k = 1, m28848mv = {1, 8, 0})
/* renamed from: androidx.compose.ui.focus.FocusOrder */
/* loaded from: classes2.dex */
public final class FocusOrder {
    public static final int $stable = 8;

    /* renamed from: a */
    public final FocusProperties f28916a;

    public FocusOrder(@NotNull FocusProperties focusProperties) {
        Intrinsics.checkNotNullParameter(focusProperties, "focusProperties");
        this.f28916a = focusProperties;
    }

    @NotNull
    public final FocusRequester getDown() {
        return this.f28916a.getDown();
    }

    @NotNull
    public final FocusRequester getEnd() {
        return this.f28916a.getEnd();
    }

    @NotNull
    public final FocusRequester getLeft() {
        return this.f28916a.getLeft();
    }

    @NotNull
    public final FocusRequester getNext() {
        return this.f28916a.getNext();
    }

    @NotNull
    public final FocusRequester getPrevious() {
        return this.f28916a.getPrevious();
    }

    @NotNull
    public final FocusRequester getRight() {
        return this.f28916a.getRight();
    }

    @NotNull
    public final FocusRequester getStart() {
        return this.f28916a.getStart();
    }

    @NotNull
    public final FocusRequester getUp() {
        return this.f28916a.getUp();
    }

    public final void setDown(@NotNull FocusRequester down) {
        Intrinsics.checkNotNullParameter(down, "down");
        this.f28916a.setDown(down);
    }

    public final void setEnd(@NotNull FocusRequester end) {
        Intrinsics.checkNotNullParameter(end, "end");
        this.f28916a.setEnd(end);
    }

    public final void setLeft(@NotNull FocusRequester left) {
        Intrinsics.checkNotNullParameter(left, "left");
        this.f28916a.setLeft(left);
    }

    public final void setNext(@NotNull FocusRequester next) {
        Intrinsics.checkNotNullParameter(next, "next");
        this.f28916a.setNext(next);
    }

    public final void setPrevious(@NotNull FocusRequester previous) {
        Intrinsics.checkNotNullParameter(previous, "previous");
        this.f28916a.setPrevious(previous);
    }

    public final void setRight(@NotNull FocusRequester right) {
        Intrinsics.checkNotNullParameter(right, "right");
        this.f28916a.setRight(right);
    }

    public final void setStart(@NotNull FocusRequester start) {
        Intrinsics.checkNotNullParameter(start, "start");
        this.f28916a.setStart(start);
    }

    public final void setUp(@NotNull FocusRequester up) {
        Intrinsics.checkNotNullParameter(up, "up");
        this.f28916a.setUp(up);
    }

    public FocusOrder() {
        this(new FocusPropertiesImpl());
    }
}
