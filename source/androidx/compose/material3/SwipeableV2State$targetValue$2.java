package androidx.compose.material3;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata(m28851d1 = {"\u0000\u0004\n\u0002\b\u0004\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28850d2 = {"<anonymous>", "T", "invoke", "()Ljava/lang/Object;"}, m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
/* loaded from: classes2.dex */
public final class SwipeableV2State$targetValue$2 extends Lambda implements Function0<T> {
    final /* synthetic */ SwipeableV2State<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SwipeableV2State$targetValue$2(SwipeableV2State<T> swipeableV2State) {
        super(0);
        this.this$0 = swipeableV2State;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4, types: [T, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final T invoke() {
        ?? m60492b;
        ?? m60493a;
        m60492b = this.this$0.m60492b();
        if (m60492b == 0) {
            SwipeableV2State<T> swipeableV2State = this.this$0;
            Float offset = swipeableV2State.getOffset();
            if (offset != null) {
                m60493a = swipeableV2State.m60493a(offset.floatValue(), swipeableV2State.getCurrentValue(), 0.0f);
                return m60493a;
            }
            return swipeableV2State.getCurrentValue();
        }
        return m60492b;
    }
}
