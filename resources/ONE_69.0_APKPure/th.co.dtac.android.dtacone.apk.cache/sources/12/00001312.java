package p000;

import android.view.View;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.compose.p003ui.input.pointer.AndroidPointerIcon;
import androidx.compose.p003ui.input.pointer.AndroidPointerIconType;
import androidx.compose.p003ui.input.pointer.PointerIcon;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: U3 */
/* loaded from: classes2.dex */
public final class C1412U3 {

    /* renamed from: a */
    public static final C1412U3 f6506a = new C1412U3();

    @DoNotInline
    @RequiresApi(24)
    /* renamed from: a */
    public final void m66274a(@NotNull View view, @Nullable PointerIcon pointerIcon) {
        android.view.PointerIcon systemIcon;
        android.view.PointerIcon pointerIcon2;
        Intrinsics.checkNotNullParameter(view, "view");
        if (pointerIcon instanceof AndroidPointerIcon) {
            systemIcon = ((AndroidPointerIcon) pointerIcon).getPointerIcon();
        } else if (pointerIcon instanceof AndroidPointerIconType) {
            systemIcon = android.view.PointerIcon.getSystemIcon(view.getContext(), ((AndroidPointerIconType) pointerIcon).getType());
            Intrinsics.checkNotNullExpressionValue(systemIcon, "getSystemIcon(view.context, icon.type)");
        } else {
            systemIcon = android.view.PointerIcon.getSystemIcon(view.getContext(), 1000);
            Intrinsics.checkNotNullExpressionValue(systemIcon, "getSystemIcon(\n         …DEFAULT\n                )");
        }
        pointerIcon2 = view.getPointerIcon();
        if (!Intrinsics.areEqual(pointerIcon2, systemIcon)) {
            view.setPointerIcon(systemIcon);
        }
    }
}