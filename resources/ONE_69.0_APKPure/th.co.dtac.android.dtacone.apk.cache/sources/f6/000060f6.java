package androidx.compose.p003ui.input.nestedscroll;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
@DebugMetadata(m29093c = "androidx.compose.ui.input.nestedscroll.NestedScrollNode", m29092f = "NestedScrollNode.kt", m29091i = {0, 0, 0, 1}, m29090l = {105, 106}, m29089m = "onPostFling-RZ2iAVY", m29088n = {"this", "consumed", "available", "selfConsumed"}, m29087s = {"L$0", "J$0", "J$1", "J$0"})
/* renamed from: androidx.compose.ui.input.nestedscroll.NestedScrollNode$onPostFling$1 */
/* loaded from: classes2.dex */
public final class NestedScrollNode$onPostFling$1 extends ContinuationImpl {
    long J$0;
    long J$1;
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ NestedScrollNode this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NestedScrollNode$onPostFling$1(NestedScrollNode nestedScrollNode, Continuation<? super NestedScrollNode$onPostFling$1> continuation) {
        super(continuation);
        this.this$0 = nestedScrollNode;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo69629onPostFlingRZ2iAVY(0L, 0L, this);
    }
}