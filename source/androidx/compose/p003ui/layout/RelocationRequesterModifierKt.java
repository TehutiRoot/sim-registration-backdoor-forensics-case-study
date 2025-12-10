package androidx.compose.p003ui.layout;

import androidx.compose.p003ui.ExperimentalComposeUiApi;
import androidx.compose.p003ui.Modifier;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0000\u001a\u00020\u0002H\u0007¨\u0006\u0003"}, m28850d2 = {"relocationRequester", "Landroidx/compose/ui/Modifier;", "", "ui_release"}, m28849k = 2, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: androidx.compose.ui.layout.RelocationRequesterModifierKt */
/* loaded from: classes2.dex */
public final class RelocationRequesterModifierKt {
    @Deprecated(level = DeprecationLevel.ERROR, message = "Please use bringIntoViewRequester instead.", replaceWith = @ReplaceWith(expression = "bringIntoViewRequester", imports = {"androidx.compose.foundation.relocation.bringIntoViewRequester"}))
    @ExperimentalComposeUiApi
    @NotNull
    public static final Modifier relocationRequester(@NotNull Modifier modifier, @NotNull Object relocationRequester) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(relocationRequester, "relocationRequester");
        return modifier;
    }
}
