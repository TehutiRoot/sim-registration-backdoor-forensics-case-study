package androidx.compose.foundation.selection;

import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.semantics.SemanticsModifierKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(m29143d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0001¨\u0006\u0002"}, m29142d2 = {"selectableGroup", "Landroidx/compose/ui/Modifier;", "foundation_release"}, m29141k = 2, m29140mv = {1, 8, 0}, m29138xi = 48)
/* loaded from: classes.dex */
public final class SelectableGroupKt {
    @NotNull
    public static final Modifier selectableGroup(@NotNull Modifier modifier) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        return SemanticsModifierKt.semantics$default(modifier, false, SelectableGroupKt$selectableGroup$1.INSTANCE, 1, null);
    }
}