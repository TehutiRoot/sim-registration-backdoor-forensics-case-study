package androidx.compose.foundation.text;

import androidx.compose.foundation.text.selection.SelectionRegistrar;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.input.pointer.PointerIconKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0016\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u0000¨\u0006\u0004"}, m28850d2 = {"textPointerHoverIcon", "Landroidx/compose/ui/Modifier;", "selectionRegistrar", "Landroidx/compose/foundation/text/selection/SelectionRegistrar;", "foundation_release"}, m28849k = 2, m28848mv = {1, 8, 0}, m28846xi = 48)
/* loaded from: classes.dex */
public final class BasicText_androidKt {
    @NotNull
    public static final Modifier textPointerHoverIcon(@NotNull Modifier modifier, @Nullable SelectionRegistrar selectionRegistrar) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        if (selectionRegistrar != null) {
            return PointerIconKt.pointerHoverIcon$default(modifier, TextPointerIcon_androidKt.getTextPointerIcon(), false, 2, null);
        }
        return modifier;
    }
}
