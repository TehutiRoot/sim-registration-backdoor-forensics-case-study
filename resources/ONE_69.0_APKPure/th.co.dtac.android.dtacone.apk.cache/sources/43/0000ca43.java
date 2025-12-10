package io.fotoapparat.coroutines;

import androidx.exifinterface.media.ExifInterface;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.action.Action;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.concurrent.CancellationException;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import kotlinx.coroutines.ChildHandle;
import kotlinx.coroutines.ChildJob;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CompletableDeferredKt;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.DisposableHandle;
import kotlinx.coroutines.ExperimentalCoroutinesApi;
import kotlinx.coroutines.InternalCoroutinesApi;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.channels.BroadcastChannel;
import kotlinx.coroutines.channels.ChannelResult;
import kotlinx.coroutines.channels.ConflatedBroadcastChannel;
import kotlinx.coroutines.channels.ReceiveChannel;
import kotlinx.coroutines.channels.SendChannel;
import kotlinx.coroutines.selects.SelectClause0;
import kotlinx.coroutines.selects.SelectClause1;
import kotlinx.coroutines.selects.SelectClause2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m29143d1 = {"\u0000¸\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00020\u00040\u0003B'\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0007¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\u00042\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0096\u0001¢\u0006\u0004\b\r\u0010\u000eJ5\u0010\u0014\u001a\u00020\u00122#\u0010\u0013\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\u000b¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\u00120\u000fH\u0097\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0016\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u0016H\u0096\u0001¢\u0006\u0004\b\u0017\u0010\u0018J'\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00120\u001a2\u0006\u0010\u0019\u001a\u00028\u0000H\u0096\u0001ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0018\u0010!\u001a\u00020 2\u0006\u0010\u001f\u001a\u00020\u001eH\u0097\u0001¢\u0006\u0004\b!\u0010\"J\u0013\u0010#\u001a\u00020\u0004H\u0096Aø\u0001\u0002¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0012H\u0097\u0001¢\u0006\u0004\b%\u0010&J8\u0010,\u001a\u00028\u0001\"\u0004\b\u0001\u0010'2\u0006\u0010(\u001a\u00028\u00012\u0018\u0010+\u001a\u0014\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00028\u00010)H\u0096\u0001¢\u0006\u0004\b,\u0010-J*\u00101\u001a\u0004\u0018\u00018\u0001\"\b\b\u0001\u0010.*\u00020*2\f\u00100\u001a\b\u0012\u0004\u0012\u00028\u00010/H\u0096\u0003¢\u0006\u0004\b1\u00102J\u0014\u00105\u001a\u000603j\u0002`4H\u0097\u0001¢\u0006\u0004\b5\u00106J\u0010\u00107\u001a\u00020\u0004H\u0097\u0001¢\u0006\u0004\b7\u00108J\u0012\u00109\u001a\u0004\u0018\u00010\u000bH\u0097\u0001¢\u0006\u0004\b9\u0010:JI\u0010?\u001a\u00020>2\u0006\u0010;\u001a\u00020\u00042\u0006\u0010<\u001a\u00020\u00042'\u0010\u0013\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\u000b¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\u00120\u000fj\u0002`=H\u0097\u0001¢\u0006\u0004\b?\u0010@J9\u0010?\u001a\u00020>2'\u0010\u0013\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\u000b¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\u00120\u000fj\u0002`=H\u0096\u0001¢\u0006\u0004\b?\u0010AJ\u0013\u0010B\u001a\u00020\u0012H\u0096Aø\u0001\u0002¢\u0006\u0004\bB\u0010$J\u001c\u0010D\u001a\u00020C2\n\u00100\u001a\u0006\u0012\u0002\b\u00030/H\u0096\u0001¢\u0006\u0004\bD\u0010EJ\u0018\u0010G\u001a\u00020C2\u0006\u0010F\u001a\u00020CH\u0096\u0003¢\u0006\u0004\bG\u0010HJ\u0018\u0010G\u001a\u00020I2\u0006\u0010J\u001a\u00020IH\u0097\u0003¢\u0006\u0004\bG\u0010KJ\u0010\u0010L\u001a\u00020\u0004H\u0096\u0001¢\u0006\u0004\bL\u0010MJ\u0013\u0010N\u001a\u00028\u0000H\u0086@ø\u0001\u0002¢\u0006\u0004\bN\u0010$J\u0017\u0010O\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00028\u0000H\u0016¢\u0006\u0004\bO\u0010PJ\u001b\u0010Q\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00028\u0000H\u0096@ø\u0001\u0002¢\u0006\u0004\bQ\u0010RJ\u001f\u0010%\u001a\u00020\u00122\u000e\u0010\f\u001a\n\u0018\u000103j\u0004\u0018\u0001`4H\u0016¢\u0006\u0004\b%\u0010SJ\u0019\u0010%\u001a\u00020\u00042\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b%\u0010\u000eR\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bT\u0010UR\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bV\u0010WR\u0014\u0010X\u001a\u00020\u00048\u0016X\u0097\u0005¢\u0006\u0006\u001a\u0004\bX\u0010MR&\u0010]\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000Z0Y8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b[\u0010\\R\u001a\u0010a\u001a\b\u0012\u0004\u0012\u00020I0^8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b_\u0010`R\u0014\u0010b\u001a\u00020\u00048\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bb\u0010MR\u0014\u0010c\u001a\u00020\u00048\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bc\u0010MR\u0014\u0010d\u001a\u00020\u00048\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bd\u0010MR\u0018\u00100\u001a\u0006\u0012\u0002\b\u00030/8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\be\u0010fR\u001a\u0010j\u001a\b\u0012\u0004\u0012\u00020\u00040g8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bh\u0010iR\u0014\u0010n\u001a\u00020k8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bl\u0010m\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006o"}, m29142d2 = {"Lio/fotoapparat/coroutines/AwaitBroadcastChannel;", "T", "Lkotlinx/coroutines/channels/BroadcastChannel;", "Lkotlinx/coroutines/Deferred;", "", "Lkotlinx/coroutines/channels/ConflatedBroadcastChannel;", "channel", "Lkotlinx/coroutines/CompletableDeferred;", "deferred", "<init>", "(Lkotlinx/coroutines/channels/ConflatedBroadcastChannel;Lkotlinx/coroutines/CompletableDeferred;)V", "", "cause", "close", "(Ljava/lang/Throwable;)Z", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "", "handler", "invokeOnClose", "(Lkotlin/jvm/functions/Function1;)V", "Lkotlinx/coroutines/channels/ReceiveChannel;", "openSubscription", "()Lkotlinx/coroutines/channels/ReceiveChannel;", "element", "Lkotlinx/coroutines/channels/ChannelResult;", "trySend-JP2dKIU", "(Ljava/lang/Object;)Ljava/lang/Object;", "trySend", "Lkotlinx/coroutines/ChildJob;", "child", "Lkotlinx/coroutines/ChildHandle;", "attachChild", "(Lkotlinx/coroutines/ChildJob;)Lkotlinx/coroutines/ChildHandle;", "await", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "cancel", "()V", "R", "initial", "Lkotlin/Function2;", "Lkotlin/coroutines/CoroutineContext$Element;", "operation", "fold", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", ExifInterface.LONGITUDE_EAST, "Lkotlin/coroutines/CoroutineContext$Key;", Action.KEY_ATTRIBUTE, "get", "(Lkotlin/coroutines/CoroutineContext$Key;)Lkotlin/coroutines/CoroutineContext$Element;", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "getCancellationException", "()Ljava/util/concurrent/CancellationException;", "getCompleted", "()Ljava/lang/Boolean;", "getCompletionExceptionOrNull", "()Ljava/lang/Throwable;", "onCancelling", "invokeImmediately", "Lkotlinx/coroutines/CompletionHandler;", "Lkotlinx/coroutines/DisposableHandle;", "invokeOnCompletion", "(ZZLkotlin/jvm/functions/Function1;)Lkotlinx/coroutines/DisposableHandle;", "(Lkotlin/jvm/functions/Function1;)Lkotlinx/coroutines/DisposableHandle;", "join", "Lkotlin/coroutines/CoroutineContext;", "minusKey", "(Lkotlin/coroutines/CoroutineContext$Key;)Lkotlin/coroutines/CoroutineContext;", CoreConstants.CONTEXT_SCOPE_VALUE, "plus", "(Lkotlin/coroutines/CoroutineContext;)Lkotlin/coroutines/CoroutineContext;", "Lkotlinx/coroutines/Job;", "other", "(Lkotlinx/coroutines/Job;)Lkotlinx/coroutines/Job;", "start", "()Z", "getValue", "offer", "(Ljava/lang/Object;)Z", "send", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "(Ljava/util/concurrent/CancellationException;)V", PDPageLabelRange.STYLE_LETTERS_LOWER, "Lkotlinx/coroutines/channels/ConflatedBroadcastChannel;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Lkotlinx/coroutines/CompletableDeferred;", "isClosedForSend", "Lkotlinx/coroutines/selects/SelectClause2;", "Lkotlinx/coroutines/channels/SendChannel;", "getOnSend", "()Lkotlinx/coroutines/selects/SelectClause2;", "onSend", "Lkotlin/sequences/Sequence;", "getChildren", "()Lkotlin/sequences/Sequence;", "children", "isActive", "isCancelled", "isCompleted", "getKey", "()Lkotlin/coroutines/CoroutineContext$Key;", "Lkotlinx/coroutines/selects/SelectClause1;", "getOnAwait", "()Lkotlinx/coroutines/selects/SelectClause1;", "onAwait", "Lkotlinx/coroutines/selects/SelectClause0;", "getOnJoin", "()Lkotlinx/coroutines/selects/SelectClause0;", "onJoin", "fotoapparat_release"}, m29141k = 1, m29140mv = {1, 8, 0})
@ExperimentalCoroutinesApi
/* loaded from: classes5.dex */
public final class AwaitBroadcastChannel<T> implements BroadcastChannel<T>, Deferred<Boolean> {

    /* renamed from: a */
    public final ConflatedBroadcastChannel f63018a;

    /* renamed from: b */
    public final CompletableDeferred f63019b;

    public AwaitBroadcastChannel() {
        this(null, null, 3, null);
    }

    @Override // kotlinx.coroutines.Job
    @InternalCoroutinesApi
    @NotNull
    public ChildHandle attachChild(@NotNull ChildJob child) {
        Intrinsics.checkNotNullParameter(child, "child");
        return this.f63019b.attachChild(child);
    }

    @Override // kotlinx.coroutines.Deferred
    @Nullable
    public Object await(@NotNull Continuation<? super Boolean> continuation) {
        return this.f63019b.await(continuation);
    }

    @Override // kotlinx.coroutines.Job
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    public /* synthetic */ void cancel() {
        this.f63019b.cancel();
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    public boolean close(@Nullable Throwable th2) {
        return this.f63018a.close(th2);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public <R> R fold(R r, @NotNull Function2<? super R, ? super CoroutineContext.Element, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(operation, "operation");
        return (R) this.f63019b.fold(r, operation);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    @Nullable
    public <E extends CoroutineContext.Element> E get(@NotNull CoroutineContext.Key<E> key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return (E) this.f63019b.get(key);
    }

    @Override // kotlinx.coroutines.Job
    @InternalCoroutinesApi
    @NotNull
    public CancellationException getCancellationException() {
        return this.f63019b.getCancellationException();
    }

    @Override // kotlinx.coroutines.Job
    @NotNull
    public Sequence<Job> getChildren() {
        return this.f63019b.getChildren();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlinx.coroutines.Deferred
    @ExperimentalCoroutinesApi
    @NotNull
    public Boolean getCompleted() {
        return (Boolean) this.f63019b.getCompleted();
    }

    @Override // kotlinx.coroutines.Deferred
    @ExperimentalCoroutinesApi
    @Nullable
    public Throwable getCompletionExceptionOrNull() {
        return this.f63019b.getCompletionExceptionOrNull();
    }

    @Override // kotlin.coroutines.CoroutineContext.Element
    @NotNull
    public CoroutineContext.Key<?> getKey() {
        return this.f63019b.getKey();
    }

    @Override // kotlinx.coroutines.Deferred
    @NotNull
    public SelectClause1<Boolean> getOnAwait() {
        return (SelectClause1<T>) this.f63019b.getOnAwait();
    }

    @Override // kotlinx.coroutines.Job
    @NotNull
    public SelectClause0 getOnJoin() {
        return this.f63019b.getOnJoin();
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    @NotNull
    public SelectClause2<T, SendChannel<T>> getOnSend() {
        return this.f63018a.getOnSend();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object getValue(@org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super T> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof io.fotoapparat.coroutines.AwaitBroadcastChannel$getValue$1
            if (r0 == 0) goto L13
            r0 = r5
            io.fotoapparat.coroutines.AwaitBroadcastChannel$getValue$1 r0 = (io.fotoapparat.coroutines.AwaitBroadcastChannel$getValue$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.fotoapparat.coroutines.AwaitBroadcastChannel$getValue$1 r0 = new io.fotoapparat.coroutines.AwaitBroadcastChannel$getValue$1
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = p000.AbstractC19782eg0.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r0 = r0.L$0
            io.fotoapparat.coroutines.AwaitBroadcastChannel r0 = (io.fotoapparat.coroutines.AwaitBroadcastChannel) r0
            kotlin.ResultKt.throwOnFailure(r5)
            goto L46
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L35:
            kotlin.ResultKt.throwOnFailure(r5)
            kotlinx.coroutines.CompletableDeferred r5 = r4.f63019b
            r0.L$0 = r4
            r0.label = r3
            java.lang.Object r5 = r5.await(r0)
            if (r5 != r1) goto L45
            return r1
        L45:
            r0 = r4
        L46:
            kotlinx.coroutines.channels.ConflatedBroadcastChannel r5 = r0.f63018a
            java.lang.Object r5 = r5.getValue()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: io.fotoapparat.coroutines.AwaitBroadcastChannel.getValue(kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    @ExperimentalCoroutinesApi
    public void invokeOnClose(@NotNull Function1<? super Throwable, Unit> handler) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        this.f63018a.invokeOnClose(handler);
    }

    @Override // kotlinx.coroutines.Job
    @NotNull
    public DisposableHandle invokeOnCompletion(@NotNull Function1<? super Throwable, Unit> handler) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        return this.f63019b.invokeOnCompletion(handler);
    }

    @Override // kotlinx.coroutines.Job
    public boolean isActive() {
        return this.f63019b.isActive();
    }

    @Override // kotlinx.coroutines.Job
    public boolean isCancelled() {
        return this.f63019b.isCancelled();
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    public boolean isClosedForSend() {
        return this.f63018a.isClosedForSend();
    }

    @Override // kotlinx.coroutines.Job
    public boolean isCompleted() {
        return this.f63019b.isCompleted();
    }

    @Override // kotlinx.coroutines.Job
    @Nullable
    public Object join(@NotNull Continuation<? super Unit> continuation) {
        return this.f63019b.join(continuation);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    @NotNull
    public CoroutineContext minusKey(@NotNull CoroutineContext.Key<?> key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.f63019b.minusKey(key);
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    public boolean offer(T t) {
        this.f63019b.complete(Boolean.TRUE);
        return ChannelResult.m74868isSuccessimpl(this.f63018a.mo74250trySendJP2dKIU(t));
    }

    @Override // kotlinx.coroutines.channels.BroadcastChannel
    @NotNull
    public ReceiveChannel<T> openSubscription() {
        return this.f63018a.openSubscription();
    }

    @Override // kotlin.coroutines.CoroutineContext
    @NotNull
    public CoroutineContext plus(@NotNull CoroutineContext context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return this.f63019b.plus(context);
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    @Nullable
    public Object send(T t, @NotNull Continuation<? super Unit> continuation) {
        this.f63019b.complete(Boxing.boxBoolean(true));
        Object send = this.f63018a.send(t, continuation);
        if (send == AbstractC19782eg0.getCOROUTINE_SUSPENDED()) {
            return send;
        }
        return Unit.INSTANCE;
    }

    @Override // kotlinx.coroutines.Job
    public boolean start() {
        return this.f63019b.start();
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    @NotNull
    /* renamed from: trySend-JP2dKIU  reason: not valid java name */
    public Object mo74250trySendJP2dKIU(T t) {
        return this.f63018a.mo74250trySendJP2dKIU(t);
    }

    public AwaitBroadcastChannel(@NotNull ConflatedBroadcastChannel<T> channel, @NotNull CompletableDeferred<Boolean> deferred) {
        Intrinsics.checkNotNullParameter(channel, "channel");
        Intrinsics.checkNotNullParameter(deferred, "deferred");
        this.f63018a = channel;
        this.f63019b = deferred;
    }

    @Override // kotlinx.coroutines.channels.BroadcastChannel, kotlinx.coroutines.Job
    public void cancel(@Nullable CancellationException cancellationException) {
        this.f63018a.cancel(cancellationException);
        this.f63019b.cancel(cancellationException);
    }

    @Override // kotlinx.coroutines.Job
    @InternalCoroutinesApi
    @NotNull
    public DisposableHandle invokeOnCompletion(boolean z, boolean z2, @NotNull Function1<? super Throwable, Unit> handler) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        return this.f63019b.invokeOnCompletion(z, z2, handler);
    }

    @Override // kotlinx.coroutines.Job
    @Deprecated(level = DeprecationLevel.ERROR, message = "Operator '+' on two Job objects is meaningless. Job is a coroutine context element and `+` is a set-sum operator for coroutine contexts. The job to the right of `+` just replaces the job the left of `+`.")
    @NotNull
    public Job plus(@NotNull Job other) {
        Intrinsics.checkNotNullParameter(other, "other");
        return this.f63019b.plus(other);
    }

    @Override // kotlinx.coroutines.channels.BroadcastChannel, kotlinx.coroutines.Job
    public /* synthetic */ boolean cancel(Throwable th2) {
        JobKt.cancel(this.f63019b, (th2 == null || (r1 = th2.getMessage()) == null) ? "" : "", th2);
        return this.f63018a.close(th2);
    }

    public /* synthetic */ AwaitBroadcastChannel(ConflatedBroadcastChannel conflatedBroadcastChannel, CompletableDeferred completableDeferred, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new ConflatedBroadcastChannel() : conflatedBroadcastChannel, (i & 2) != 0 ? CompletableDeferredKt.CompletableDeferred$default(null, 1, null) : completableDeferred);
    }
}