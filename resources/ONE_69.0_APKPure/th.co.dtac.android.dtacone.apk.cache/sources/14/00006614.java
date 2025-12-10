package androidx.compose.p003ui.tooling;

import androidx.compose.p003ui.layout.LayoutInfo;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(m29143d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u00020\u00040\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0006"}, m29142d2 = {"<anonymous>", "", "Lkotlin/Pair;", "Landroidx/compose/ui/layout/LayoutInfo;", "Landroidx/compose/ui/tooling/ShadowViewInfo;", "candidate", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: androidx.compose.ui.tooling.ShadowViewInfoKt$stitchTrees$1$1 */
/* loaded from: classes2.dex */
public final class ShadowViewInfoKt$stitchTrees$1$1 extends Lambda implements Function1<ShadowViewInfo, List<? extends Pair<? extends LayoutInfo, ? extends ShadowViewInfo>>> {
    final /* synthetic */ Map<LayoutInfo, List<Pair<LayoutInfo, ShadowViewInfo>>> $shadowNodesWithLayoutInfo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ShadowViewInfoKt$stitchTrees$1$1(Map<LayoutInfo, ? extends List<? extends Pair<? extends LayoutInfo, ShadowViewInfo>>> map) {
        super(1);
        this.$shadowNodesWithLayoutInfo = map;
    }

    @Override // kotlin.jvm.functions.Function1
    @NotNull
    public final List<Pair<LayoutInfo, ShadowViewInfo>> invoke(@NotNull ShadowViewInfo candidate) {
        Intrinsics.checkNotNullParameter(candidate, "candidate");
        Map<LayoutInfo, List<Pair<LayoutInfo, ShadowViewInfo>>> map = this.$shadowNodesWithLayoutInfo;
        LayoutInfo m58885d = candidate.m58885d();
        List<Pair<LayoutInfo, ShadowViewInfo>> list = map.get(m58885d != null ? m58885d.getParentInfo() : null);
        return list == null ? CollectionsKt__CollectionsKt.emptyList() : list;
    }
}