package androidx.compose.foundation.gestures.snapping;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
@DebugMetadata(m29093c = "androidx.compose.foundation.gestures.snapping.SnapFlingBehavior", m29092f = "SnapFlingBehavior.kt", m29091i = {0}, m29090l = {131}, m29089m = "fling", m29088n = {"onRemainingScrollOffsetUpdate"}, m29087s = {"L$0"})
/* loaded from: classes.dex */
public final class SnapFlingBehavior$fling$1 extends ContinuationImpl {
    Object L$0;
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
        Object m61400a;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        m61400a = this.this$0.m61400a(null, 0.0f, null, this);
        return m61400a;
    }
}