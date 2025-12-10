package androidx.compose.p003ui.input.pointer;

import androidx.compose.runtime.Stable;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.util.Constant;

@Stable
@Metadata(m28851d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bg\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0003À\u0006\u0001"}, m28850d2 = {"Landroidx/compose/ui/input/pointer/PointerIcon;", "", "Companion", "ui_release"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: androidx.compose.ui.input.pointer.PointerIcon */
/* loaded from: classes2.dex */
public interface PointerIcon {
    @NotNull
    public static final Companion Companion = Companion.f29937a;

    @Metadata(m28851d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u000b\u0010\bR\u0017\u0010\u000f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u000e\u0010\bR\u0017\u0010\u0012\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0006\u001a\u0004\b\u0011\u0010\b¨\u0006\u0013"}, m28850d2 = {"Landroidx/compose/ui/input/pointer/PointerIcon$Companion;", "", "<init>", "()V", "Landroidx/compose/ui/input/pointer/PointerIcon;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Landroidx/compose/ui/input/pointer/PointerIcon;", "getDefault", "()Landroidx/compose/ui/input/pointer/PointerIcon;", Constant.OnePostpaidVerifyKey.Default, OperatorName.CURVE_TO, "getCrosshair", "Crosshair", "d", "getText", "Text", "e", "getHand", "Hand", "ui_release"}, m28849k = 1, m28848mv = {1, 8, 0})
    /* renamed from: androidx.compose.ui.input.pointer.PointerIcon$Companion */
    /* loaded from: classes2.dex */
    public static final class Companion {

        /* renamed from: a */
        public static final /* synthetic */ Companion f29937a = new Companion();

        /* renamed from: b */
        public static final PointerIcon f29938b = PointerIcon_androidKt.getPointerIconDefault();

        /* renamed from: c */
        public static final PointerIcon f29939c = PointerIcon_androidKt.getPointerIconCrosshair();

        /* renamed from: d */
        public static final PointerIcon f29940d = PointerIcon_androidKt.getPointerIconText();

        /* renamed from: e */
        public static final PointerIcon f29941e = PointerIcon_androidKt.getPointerIconHand();

        @NotNull
        public final PointerIcon getCrosshair() {
            return f29939c;
        }

        @NotNull
        public final PointerIcon getDefault() {
            return f29938b;
        }

        @NotNull
        public final PointerIcon getHand() {
            return f29941e;
        }

        @NotNull
        public final PointerIcon getText() {
            return f29940d;
        }
    }
}
