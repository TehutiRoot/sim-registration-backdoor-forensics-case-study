package kotlinx.coroutines.channels;

import io.reactivex.annotations.SchedulerSupport;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
@DebugMetadata(m28801c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", m28800f = "Deprecated.kt", m28799i = {0}, m28798l = {447}, m28797m = SchedulerSupport.NONE, m28796n = {"$this$consume$iv"}, m28795s = {"L$0"})
/* loaded from: classes6.dex */
public final class ChannelsKt__DeprecatedKt$none$1<E> extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;

    public ChannelsKt__DeprecatedKt$none$1(Continuation<? super ChannelsKt__DeprecatedKt$none$1> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object m27180O;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        m27180O = ChannelsKt__DeprecatedKt.m27180O(null, this);
        return m27180O;
    }
}
