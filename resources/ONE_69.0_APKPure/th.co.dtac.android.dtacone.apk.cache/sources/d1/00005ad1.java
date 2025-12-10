package androidx.compose.material3;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
@DebugMetadata(m29093c = "androidx.compose.material3.SnapFlingBehavior", m29092f = "SnapFlingBehavior.kt", m29091i = {}, m29090l = {95}, m29089m = "fling", m29088n = {}, m29087s = {})
/* loaded from: classes2.dex */
public final class SnapFlingBehavior$fling$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SnapFlingBehavior this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SnapFlingBehavior$fling$1(SnapFlingBehavior snapFlingBehavior, Continuation<? super SnapFlingBehavior$fling$1> continuation) {
        super(continuation);
        this.this$0 = snapFlingBehavior;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object m60471k;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        m60471k = this.this$0.m60471k(null, 0.0f, this);
        return m60471k;
    }
}