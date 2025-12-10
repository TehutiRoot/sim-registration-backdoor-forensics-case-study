package androidx.compose.material;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata(m29143d1 = {"\u0000\u0004\n\u0002\b\u0004\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m29142d2 = {"<anonymous>", "T", "invoke", "()Ljava/lang/Object;"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* loaded from: classes.dex */
public final class AnchoredDraggableState$closestValue$2 extends Lambda implements Function0<T> {
    final /* synthetic */ AnchoredDraggableState<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnchoredDraggableState$closestValue$2(AnchoredDraggableState<T> anchoredDraggableState) {
        super(0);
        this.this$0 = anchoredDraggableState;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4, types: [T, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final T invoke() {
        ?? m60909d;
        ?? m60911b;
        m60909d = this.this$0.m60909d();
        if (m60909d == 0) {
            AnchoredDraggableState<T> anchoredDraggableState = this.this$0;
            float offset = anchoredDraggableState.getOffset();
            if (!Float.isNaN(offset)) {
                m60911b = anchoredDraggableState.m60911b(offset, anchoredDraggableState.getCurrentValue());
                return m60911b;
            }
            return anchoredDraggableState.getCurrentValue();
        }
        return m60909d;
    }
}