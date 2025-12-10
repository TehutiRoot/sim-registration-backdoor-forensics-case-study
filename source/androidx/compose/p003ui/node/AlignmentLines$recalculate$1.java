package androidx.compose.p003ui.node;

import androidx.compose.p003ui.layout.AlignmentLine;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m28850d2 = {"<anonymous>", "", "childOwner", "Landroidx/compose/ui/node/AlignmentLinesOwner;", "invoke"}, m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
@SourceDebugExtension({"SMAP\nLayoutNodeAlignmentLines.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LayoutNodeAlignmentLines.kt\nandroidx/compose/ui/node/AlignmentLines$recalculate$1\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,246:1\n215#2,2:247\n1855#3,2:249\n*S KotlinDebug\n*F\n+ 1 LayoutNodeAlignmentLines.kt\nandroidx/compose/ui/node/AlignmentLines$recalculate$1\n*L\n163#1:247,2\n170#1:249,2\n*E\n"})
/* renamed from: androidx.compose.ui.node.AlignmentLines$recalculate$1 */
/* loaded from: classes2.dex */
public final class AlignmentLines$recalculate$1 extends Lambda implements Function1<AlignmentLinesOwner, Unit> {
    final /* synthetic */ AlignmentLines this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AlignmentLines$recalculate$1(AlignmentLines alignmentLines) {
        super(1);
        this.this$0 = alignmentLines;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(AlignmentLinesOwner alignmentLinesOwner) {
        invoke2(alignmentLinesOwner);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull AlignmentLinesOwner childOwner) {
        Map map;
        Intrinsics.checkNotNullParameter(childOwner, "childOwner");
        if (childOwner.isPlaced()) {
            if (childOwner.getAlignmentLines().getDirty$ui_release()) {
                childOwner.layoutChildren();
            }
            map = childOwner.getAlignmentLines().f30192i;
            AlignmentLines alignmentLines = this.this$0;
            for (Map.Entry entry : map.entrySet()) {
                alignmentLines.m59516a((AlignmentLine) entry.getKey(), ((Number) entry.getValue()).intValue(), childOwner.getInnerCoordinator());
            }
            NodeCoordinator wrappedBy$ui_release = childOwner.getInnerCoordinator().getWrappedBy$ui_release();
            Intrinsics.checkNotNull(wrappedBy$ui_release);
            while (!Intrinsics.areEqual(wrappedBy$ui_release, this.this$0.getAlignmentLinesOwner().getInnerCoordinator())) {
                AlignmentLines alignmentLines2 = this.this$0;
                for (AlignmentLine alignmentLine : this.this$0.getAlignmentLinesMap(wrappedBy$ui_release).keySet()) {
                    alignmentLines2.m59516a(alignmentLine, alignmentLines2.getPositionFor(wrappedBy$ui_release, alignmentLine), wrappedBy$ui_release);
                }
                wrappedBy$ui_release = wrappedBy$ui_release.getWrappedBy$ui_release();
                Intrinsics.checkNotNull(wrappedBy$ui_release);
            }
        }
    }
}
