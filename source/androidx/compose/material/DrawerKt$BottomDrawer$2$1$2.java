package androidx.compose.material;

import androidx.compose.material.AnchoredDraggableState;
import androidx.compose.p003ui.unit.IntSize;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata(m28851d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28850d2 = {"<anonymous>", "", "drawerSize", "Landroidx/compose/ui/unit/IntSize;", "invoke-ozmzZPI", "(J)V"}, m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
/* loaded from: classes.dex */
public final class DrawerKt$BottomDrawer$2$1$2 extends Lambda implements Function1<IntSize, Unit> {
    final /* synthetic */ AnchoredDraggableState.AnchorChangedCallback<BottomDrawerValue> $anchorChangeCallback;
    final /* synthetic */ BottomDrawerState $drawerState;
    final /* synthetic */ float $fullHeight;
    final /* synthetic */ boolean $isLandscape;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DrawerKt$BottomDrawer$2$1$2(BottomDrawerState bottomDrawerState, AnchoredDraggableState.AnchorChangedCallback<BottomDrawerValue> anchorChangedCallback, float f, boolean z) {
        super(1);
        this.$drawerState = bottomDrawerState;
        this.$anchorChangeCallback = anchorChangedCallback;
        this.$fullHeight = f;
        this.$isLandscape = z;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(IntSize intSize) {
        m70012invokeozmzZPI(intSize.m73822unboximpl());
        return Unit.INSTANCE;
    }

    /* renamed from: invoke-ozmzZPI  reason: not valid java name */
    public final void m70012invokeozmzZPI(long j) {
        float m73817getHeightimpl = IntSize.m73817getHeightimpl(j);
        float f = this.$fullHeight;
        boolean z = this.$isLandscape;
        Map createMapBuilder = AbstractC18515Tn0.createMapBuilder();
        createMapBuilder.put(BottomDrawerValue.Closed, Float.valueOf(f));
        float f2 = 0.5f * f;
        if (m73817getHeightimpl > f2 || z) {
            createMapBuilder.put(BottomDrawerValue.Open, Float.valueOf(f2));
        }
        if (m73817getHeightimpl > 0.0f) {
            createMapBuilder.put(BottomDrawerValue.Expanded, Float.valueOf(Math.max(0.0f, f - m73817getHeightimpl)));
        }
        this.$drawerState.getAnchoredDraggableState$material_release().updateAnchors$material_release(AbstractC18515Tn0.build(createMapBuilder), this.$anchorChangeCallback);
    }
}
