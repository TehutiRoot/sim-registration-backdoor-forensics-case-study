package androidx.compose.p003ui.tooling;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000f\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m28850d2 = {"<anonymous>", "", "it", "Landroidx/compose/ui/tooling/ViewInfo;", "invoke"}, m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: androidx.compose.ui.tooling.ViewInfoUtilKt$toDebugString$2 */
/* loaded from: classes2.dex */
public final class ViewInfoUtilKt$toDebugString$2 extends Lambda implements Function1<ViewInfo, Comparable<?>> {
    public static final ViewInfoUtilKt$toDebugString$2 INSTANCE = new ViewInfoUtilKt$toDebugString$2();

    public ViewInfoUtilKt$toDebugString$2() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    @Nullable
    public final Comparable<?> invoke(@NotNull ViewInfo it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.getFileName();
    }
}
