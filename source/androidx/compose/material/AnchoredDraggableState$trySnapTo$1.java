package androidx.compose.material;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata(m28851d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002H\n¢\u0006\u0002\b\u0003"}, m28850d2 = {"<anonymous>", "", "T", "invoke"}, m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
/* loaded from: classes.dex */
public final class AnchoredDraggableState$trySnapTo$1 extends Lambda implements Function0<Unit> {
    final /* synthetic */ T $targetValue;
    final /* synthetic */ AnchoredDraggableState<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnchoredDraggableState$trySnapTo$1(AnchoredDraggableState<T> anchoredDraggableState, T t) {
        super(0);
        this.this$0 = anchoredDraggableState;
        this.$targetValue = t;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        AnchoredDragScope anchoredDragScope;
        anchoredDragScope = this.this$0.f14342q;
        AnchoredDraggableState<T> anchoredDraggableState = this.this$0;
        Object obj = this.$targetValue;
        Float f = (Float) anchoredDraggableState.getAnchors$material_release().get(obj);
        if (f != null) {
            AbstractC0779L2.m67568a(anchoredDragScope, f.floatValue(), 0.0f, 2, null);
            anchoredDraggableState.m60958e(null);
        }
        anchoredDraggableState.m60957f(obj);
    }
}
