package kotlinx.coroutines.channels;

import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.AbstractCoroutine;
import kotlinx.coroutines.CoroutineExceptionHandlerKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobCancellationException;
import kotlinx.coroutines.JobSupport;
import kotlinx.coroutines.channels.SendChannel;
import kotlinx.coroutines.selects.SelectClause2;

/* renamed from: kotlinx.coroutines.channels.a */
/* loaded from: classes6.dex */
public class C12047a extends AbstractCoroutine implements ProducerScope, BroadcastChannel {

    /* renamed from: d */
    public final BroadcastChannel f70703d;

    public C12047a(CoroutineContext coroutineContext, BroadcastChannel broadcastChannel, boolean z) {
        super(coroutineContext, false, z);
        this.f70703d = broadcastChannel;
        initParentJob((Job) coroutineContext.get(Job.Key));
    }

    /* renamed from: I */
    public final BroadcastChannel m27125I() {
        return this.f70703d;
    }

    @Override // kotlinx.coroutines.AbstractCoroutine
    /* renamed from: J */
    public void onCompleted(Unit unit) {
        SendChannel.DefaultImpls.close$default(this.f70703d, null, 1, null);
    }

    @Override // kotlinx.coroutines.JobSupport, kotlinx.coroutines.Job
    public final /* synthetic */ boolean cancel(Throwable th2) {
        if (th2 == null) {
            th2 = new JobCancellationException(cancellationExceptionMessage(), null, this);
        }
        cancelInternal(th2);
        return true;
    }

    @Override // kotlinx.coroutines.JobSupport
    public void cancelInternal(Throwable th2) {
        CancellationException cancellationException$default = JobSupport.toCancellationException$default(this, th2, null, 1, null);
        this.f70703d.cancel(cancellationException$default);
        cancelCoroutine(cancellationException$default);
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    public boolean close(Throwable th2) {
        boolean close = this.f70703d.close(th2);
        start();
        return close;
    }

    @Override // kotlinx.coroutines.channels.ProducerScope
    public SendChannel getChannel() {
        return this;
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    public SelectClause2 getOnSend() {
        return this.f70703d.getOnSend();
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    public void invokeOnClose(Function1 function1) {
        this.f70703d.invokeOnClose(function1);
    }

    @Override // kotlinx.coroutines.AbstractCoroutine, kotlinx.coroutines.JobSupport, kotlinx.coroutines.Job
    public boolean isActive() {
        return super.isActive();
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    public boolean isClosedForSend() {
        return this.f70703d.isClosedForSend();
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    public boolean offer(Object obj) {
        return this.f70703d.offer(obj);
    }

    @Override // kotlinx.coroutines.AbstractCoroutine
    public void onCancelled(Throwable th2, boolean z) {
        if (!this.f70703d.close(th2) && !z) {
            CoroutineExceptionHandlerKt.handleCoroutineException(getContext(), th2);
        }
    }

    public ReceiveChannel openSubscription() {
        return this.f70703d.openSubscription();
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    public Object send(Object obj, Continuation continuation) {
        return this.f70703d.send(obj, continuation);
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    /* renamed from: trySend-JP2dKIU */
    public Object mo74066trySendJP2dKIU(Object obj) {
        return this.f70703d.mo74066trySendJP2dKIU(obj);
    }

    @Override // kotlinx.coroutines.JobSupport, kotlinx.coroutines.Job
    public final void cancel(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new JobCancellationException(cancellationExceptionMessage(), null, this);
        }
        cancelInternal(cancellationException);
    }
}
