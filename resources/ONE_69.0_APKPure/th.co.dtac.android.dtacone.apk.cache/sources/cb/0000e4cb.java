package kotlinx.coroutines.channels;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
@DebugMetadata(m29093c = "kotlinx.coroutines.channels.BufferedChannel", m29092f = "BufferedChannel.kt", m29091i = {0, 0, 0, 0}, m29090l = {3056}, m29089m = "receiveCatchingOnNoWaiterSuspend-GKJJFZk", m29088n = {"this", "segment", FirebaseAnalytics.Param.INDEX, PDPageLabelRange.STYLE_ROMAN_LOWER}, m29087s = {"L$0", "L$1", "I$0", "J$0"})
/* loaded from: classes6.dex */
public final class BufferedChannel$receiveCatchingOnNoWaiterSuspend$1 extends ContinuationImpl {
    int I$0;
    long J$0;
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ BufferedChannel<E> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BufferedChannel$receiveCatchingOnNoWaiterSuspend$1(BufferedChannel<E> bufferedChannel, Continuation<? super BufferedChannel$receiveCatchingOnNoWaiterSuspend$1> continuation) {
        super(continuation);
        this.this$0 = bufferedChannel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object m27559N;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        m27559N = this.this$0.m27559N(null, 0, 0L, this);
        return m27559N == AbstractC19782eg0.getCOROUTINE_SUSPENDED() ? m27559N : ChannelResult.m74858boximpl(m27559N);
    }
}