package p000;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineExceptionHandlerKt;
import kotlinx.coroutines.DebugStringsKt;
import kotlinx.coroutines.ExceptionsKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.channels.ActorScope;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelCoroutine;

/* renamed from: Z1 */
/* loaded from: classes6.dex */
public class C1795Z1 extends ChannelCoroutine implements ActorScope {
    public C1795Z1(CoroutineContext coroutineContext, Channel channel, boolean z) {
        super(coroutineContext, channel, false, z);
        initParentJob((Job) coroutineContext.get(Job.Key));
    }

    @Override // kotlinx.coroutines.JobSupport
    public boolean handleJobException(Throwable th2) {
        CoroutineExceptionHandlerKt.handleCoroutineException(getContext(), th2);
        return true;
    }

    @Override // kotlinx.coroutines.JobSupport
    public void onCancelling(Throwable th2) {
        Channel channel = get_channel();
        CancellationException cancellationException = null;
        if (th2 != null) {
            if (th2 instanceof CancellationException) {
                cancellationException = (CancellationException) th2;
            }
            if (cancellationException == null) {
                cancellationException = ExceptionsKt.CancellationException(DebugStringsKt.getClassSimpleName(this) + " was cancelled", th2);
            }
        }
        channel.cancel(cancellationException);
    }
}
