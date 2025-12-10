package androidx.compose.p003ui.input.pointer;

import android.view.PointerIcon;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0011\u001a\u0015\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0015\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0003\u0010\u0007\"\u001a\u0010\f\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u001a\u0010\u000f\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\r\u0010\t\u001a\u0004\b\u000e\u0010\u000b\"\u001a\u0010\u0012\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0010\u0010\t\u001a\u0004\b\u0011\u0010\u000b\"\u001a\u0010\u0015\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0013\u0010\t\u001a\u0004\b\u0014\u0010\u000b¨\u0006\u0016"}, m28850d2 = {"Landroid/view/PointerIcon;", "pointerIcon", "Landroidx/compose/ui/input/pointer/PointerIcon;", "PointerIcon", "(Landroid/view/PointerIcon;)Landroidx/compose/ui/input/pointer/PointerIcon;", "", "pointerIconType", "(I)Landroidx/compose/ui/input/pointer/PointerIcon;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroidx/compose/ui/input/pointer/PointerIcon;", "getPointerIconDefault", "()Landroidx/compose/ui/input/pointer/PointerIcon;", "pointerIconDefault", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "getPointerIconCrosshair", "pointerIconCrosshair", OperatorName.CURVE_TO, "getPointerIconText", "pointerIconText", "d", "getPointerIconHand", "pointerIconHand", "ui_release"}, m28849k = 2, m28848mv = {1, 8, 0})
/* renamed from: androidx.compose.ui.input.pointer.PointerIcon_androidKt */
/* loaded from: classes2.dex */
public final class PointerIcon_androidKt {

    /* renamed from: a */
    public static final PointerIcon f29951a = new AndroidPointerIconType(1000);

    /* renamed from: b */
    public static final PointerIcon f29952b = new AndroidPointerIconType(1007);

    /* renamed from: c */
    public static final PointerIcon f29953c = new AndroidPointerIconType(1008);

    /* renamed from: d */
    public static final PointerIcon f29954d = new AndroidPointerIconType(1002);

    @NotNull
    public static final PointerIcon PointerIcon(@NotNull PointerIcon pointerIcon) {
        Intrinsics.checkNotNullParameter(pointerIcon, "pointerIcon");
        return new AndroidPointerIcon(pointerIcon);
    }

    @NotNull
    public static final PointerIcon getPointerIconCrosshair() {
        return f29952b;
    }

    @NotNull
    public static final PointerIcon getPointerIconDefault() {
        return f29951a;
    }

    @NotNull
    public static final PointerIcon getPointerIconHand() {
        return f29954d;
    }

    @NotNull
    public static final PointerIcon getPointerIconText() {
        return f29953c;
    }

    @NotNull
    public static final PointerIcon PointerIcon(int i) {
        return new AndroidPointerIconType(i);
    }
}
