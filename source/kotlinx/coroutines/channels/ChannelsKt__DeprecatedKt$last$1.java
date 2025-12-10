package kotlinx.coroutines.channels;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
@DebugMetadata(m28801c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", m28800f = "Deprecated.kt", m28799i = {0, 0, 1, 1, 1}, m28798l = {97, 100}, m28797m = "last", m28796n = {"$this$consume$iv", "iterator", "$this$consume$iv", "iterator", "last"}, m28795s = {"L$0", "L$1", "L$0", "L$1", "L$2"})
/* loaded from: classes6.dex */
public final class ChannelsKt__DeprecatedKt$last$1<E> extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;

    public ChannelsKt__DeprecatedKt$last$1(Continuation<? super ChannelsKt__DeprecatedKt$last$1> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object m27193B;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        m27193B = ChannelsKt__DeprecatedKt.m27193B(null, this);
        return m27193B;
    }
}
