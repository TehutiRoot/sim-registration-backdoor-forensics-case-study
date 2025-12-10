package kotlinx.coroutines.channels;

import androidx.appcompat.app.AppCompatDelegate;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
@DebugMetadata(m29093c = "kotlinx.coroutines.channels.TickerChannelsKt", m29092f = "TickerChannels.kt", m29091i = {0, 0, 1, 1, 2, 2}, m29090l = {106, AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR, 109}, m29089m = "fixedDelayTicker", m29088n = {"channel", "delayMillis", "channel", "delayMillis", "channel", "delayMillis"}, m29087s = {"L$0", "J$0", "L$0", "J$0", "L$0", "J$0"})
/* loaded from: classes6.dex */
public final class TickerChannelsKt$fixedDelayTicker$1 extends ContinuationImpl {
    long J$0;
    Object L$0;
    int label;
    /* synthetic */ Object result;

    public TickerChannelsKt$fixedDelayTicker$1(Continuation<? super TickerChannelsKt$fixedDelayTicker$1> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object m27419a;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        m27419a = TickerChannelsKt.m27419a(0L, 0L, null, this);
        return m27419a;
    }
}