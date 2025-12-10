package kotlinx.coroutines.channels;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Collection;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
@DebugMetadata(m28801c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", m28800f = "Deprecated.kt", m28799i = {0, 0}, m28798l = {487}, m28797m = "filterNotNullTo", m28796n = {FirebaseAnalytics.Param.DESTINATION, "$this$consume$iv$iv"}, m28795s = {"L$0", "L$1"})
/* loaded from: classes6.dex */
public final class ChannelsKt__DeprecatedKt$filterNotNullTo$1<E, C extends Collection<? super E>> extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;

    public ChannelsKt__DeprecatedKt$filterNotNullTo$1(Continuation<? super ChannelsKt__DeprecatedKt$filterNotNullTo$1> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object m27140u;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        m27140u = ChannelsKt__DeprecatedKt.m27140u(null, null, this);
        return m27140u;
    }
}
