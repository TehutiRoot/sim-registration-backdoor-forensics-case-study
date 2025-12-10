package androidx.compose.p003ui.node;

import androidx.compose.p003ui.graphics.GraphicsLayerScope;
import androidx.compose.p003ui.layout.Placeable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata(m29143d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m29142d2 = {"<anonymous>", "", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: androidx.compose.ui.node.LayoutNodeLayoutDelegate$MeasurePassDelegate$placeOuterCoordinator$1 */
/* loaded from: classes2.dex */
public final class C3502x14fd4410 extends Lambda implements Function0<Unit> {
    final /* synthetic */ Function1<GraphicsLayerScope, Unit> $layerBlock;
    final /* synthetic */ long $position;
    final /* synthetic */ float $zIndex;
    final /* synthetic */ LayoutNodeLayoutDelegate this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C3502x14fd4410(Function1<? super GraphicsLayerScope, Unit> function1, LayoutNodeLayoutDelegate layoutNodeLayoutDelegate, long j, float f) {
        super(0);
        this.$layerBlock = function1;
        this.this$0 = layoutNodeLayoutDelegate;
        this.$position = j;
        this.$zIndex = f;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        Placeable.PlacementScope.Companion companion = Placeable.PlacementScope.Companion;
        Function1<GraphicsLayerScope, Unit> function1 = this.$layerBlock;
        LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = this.this$0;
        long j = this.$position;
        float f = this.$zIndex;
        if (function1 == null) {
            companion.m73038place70tqf50(layoutNodeLayoutDelegate.getOuterCoordinator(), j, f);
        } else {
            companion.m73043placeWithLayeraW9wM(layoutNodeLayoutDelegate.getOuterCoordinator(), j, f, function1);
        }
    }
}