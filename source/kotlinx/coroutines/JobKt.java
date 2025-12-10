package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import java.util.concurrent.Future;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"Rg0", "kotlinx/coroutines/a"}, m28850d2 = {}, m28849k = 4, m28848mv = {1, 8, 0})
/* loaded from: classes6.dex */
public final class JobKt {
    @NotNull
    public static final CompletableJob Job(@Nullable Job job) {
        return AbstractC12039a.m27318a(job);
    }

    public static /* synthetic */ CompletableJob Job$default(Job job, int i, Object obj) {
        return AbstractC12039a.m27316c(job, i, obj);
    }

    @Nullable
    public static final Object cancelAndJoin(@NotNull Job job, @NotNull Continuation<? super Unit> continuation) {
        return AbstractC12039a.m27307l(job, continuation);
    }

    public static final void cancelFutureOnCancellation(@NotNull CancellableContinuation<?> cancellableContinuation, @NotNull Future<?> future) {
        AbstractC18367Rg0.m66434a(cancellableContinuation, future);
    }

    @InternalCoroutinesApi
    @NotNull
    public static final DisposableHandle cancelFutureOnCompletion(@NotNull Job job, @NotNull Future<?> future) {
        return AbstractC18367Rg0.m66433b(job, future);
    }

    @NotNull
    public static final DisposableHandle disposeOnCompletion(@NotNull Job job, @NotNull DisposableHandle disposableHandle) {
        return AbstractC12039a.m27296w(job, disposableHandle);
    }

    public static final void ensureActive(@NotNull CoroutineContext coroutineContext) {
        AbstractC12039a.m27295x(coroutineContext);
    }

    @NotNull
    public static final Job getJob(@NotNull CoroutineContext coroutineContext) {
        return AbstractC12039a.m27293z(coroutineContext);
    }

    public static final boolean isActive(@NotNull CoroutineContext coroutineContext) {
        return AbstractC12039a.m27320A(coroutineContext);
    }

    public static final void cancel(@NotNull CoroutineContext coroutineContext, @Nullable CancellationException cancellationException) {
        AbstractC12039a.m27313f(coroutineContext, cancellationException);
    }

    public static final void ensureActive(@NotNull Job job) {
        AbstractC12039a.m27294y(job);
    }

    public static final void cancel(@NotNull Job job, @NotNull String str, @Nullable Throwable th2) {
        AbstractC12039a.m27312g(job, str, th2);
    }

    public static final void cancelChildren(@NotNull CoroutineContext coroutineContext, @Nullable CancellationException cancellationException) {
        AbstractC12039a.m27304o(coroutineContext, cancellationException);
    }

    public static final void cancelChildren(@NotNull Job job, @Nullable CancellationException cancellationException) {
        AbstractC12039a.m27301r(job, cancellationException);
    }
}
