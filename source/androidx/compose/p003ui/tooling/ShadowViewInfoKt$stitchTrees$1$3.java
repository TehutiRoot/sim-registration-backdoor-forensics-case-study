package androidx.compose.p003ui.tooling;

import androidx.compose.p003ui.layout.LayoutInfo;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0014\u0010\u0002\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020\u00010\u0003H\n¢\u0006\u0002\b\u0005"}, m28850d2 = {"<anonymous>", "Landroidx/compose/ui/tooling/ShadowViewInfo;", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "Landroidx/compose/ui/layout/LayoutInfo;", "invoke"}, m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: androidx.compose.ui.tooling.ShadowViewInfoKt$stitchTrees$1$3 */
/* loaded from: classes2.dex */
public final class ShadowViewInfoKt$stitchTrees$1$3 extends Lambda implements Function1<Pair<? extends LayoutInfo, ? extends ShadowViewInfo>, ShadowViewInfo> {
    public static final ShadowViewInfoKt$stitchTrees$1$3 INSTANCE = new ShadowViewInfoKt$stitchTrees$1$3();

    public ShadowViewInfoKt$stitchTrees$1$3() {
        super(1);
    }

    @NotNull
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final ShadowViewInfo invoke2(@NotNull Pair<? extends LayoutInfo, ShadowViewInfo> pair) {
        Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
        return pair.component2();
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ ShadowViewInfo invoke(Pair<? extends LayoutInfo, ? extends ShadowViewInfo> pair) {
        return invoke2((Pair<? extends LayoutInfo, ShadowViewInfo>) pair);
    }
}
