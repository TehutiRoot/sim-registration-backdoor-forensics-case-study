package io.fotoapparat.result;

import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import io.fotoapparat.concurrent.EnsureBgThreadKt;
import io.fotoapparat.exception.UnableToDecodeBitmapException;
import io.fotoapparat.hardware.ExecutorKt;
import io.fotoapparat.log.Logger;
import io.fotoapparat.result.PendingResult;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0016\u0018\u0000 #*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001#B'\b\u0000\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ-\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00010\u0000\"\u0004\b\u0001\u0010\u000b2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00028\u0000¢\u0006\u0004\b\u0010\u0010\u0011J-\u0010\u0013\u001a\u00028\u0001\"\u0004\b\u0001\u0010\u000b2\u0018\u0010\u0012\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0004\u0012\u00028\u00010\f¢\u0006\u0004\b\u0013\u0010\u0014J#\u0010\u0017\u001a\u00020\u00152\u0014\u0010\u0016\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0012\u0004\u0012\u00020\u00150\f¢\u0006\u0004\b\u0017\u0010\u0018J\u001b\u0010\u001a\u001a\u00020\u00152\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u0019¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\"\u001a\u00028\u00008BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b \u0010\u0011¨\u0006$"}, m28850d2 = {"Lio/fotoapparat/result/PendingResult;", "T", "", "Ljava/util/concurrent/Future;", "future", "Lio/fotoapparat/log/Logger;", "logger", "Ljava/util/concurrent/Executor;", "executor", "<init>", "(Ljava/util/concurrent/Future;Lio/fotoapparat/log/Logger;Ljava/util/concurrent/Executor;)V", "R", "Lkotlin/Function1;", "transformer", "transform", "(Lkotlin/jvm/functions/Function1;)Lio/fotoapparat/result/PendingResult;", "await", "()Ljava/lang/Object;", "adapter", "adapt", "(Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "", "callback", "whenAvailable", "(Lkotlin/jvm/functions/Function1;)V", "Lio/fotoapparat/result/WhenDoneListener;", "whenDone", "(Lio/fotoapparat/result/WhenDoneListener;)V", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/util/concurrent/Future;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Lio/fotoapparat/log/Logger;", OperatorName.CURVE_TO, "Ljava/util/concurrent/Executor;", "resultUnsafe", "Companion", "fotoapparat_release"}, m28849k = 1, m28848mv = {1, 8, 0})
/* loaded from: classes5.dex */
public class PendingResult<T> {
    @NotNull
    public static final Companion Companion = new Companion(null);

    /* renamed from: a */
    public final Future f63036a;

    /* renamed from: b */
    public final Logger f63037b;

    /* renamed from: c */
    public final Executor f63038c;

    @Metadata(m28851d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J/\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0001\u0010\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00050\u00072\u0006\u0010\b\u001a\u00020\tH\u0000¢\u0006\u0002\b\n¨\u0006\u000b"}, m28850d2 = {"Lio/fotoapparat/result/PendingResult$Companion;", "", "()V", "fromFuture", "Lio/fotoapparat/result/PendingResult;", "T", "future", "Ljava/util/concurrent/Future;", "logger", "Lio/fotoapparat/log/Logger;", "fromFuture$fotoapparat_release", "fotoapparat_release"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* loaded from: classes5.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final <T> PendingResult<T> fromFuture$fotoapparat_release(@NotNull Future<T> future, @NotNull Logger logger) {
            Intrinsics.checkNotNullParameter(future, "future");
            Intrinsics.checkNotNullParameter(logger, "logger");
            ExecutorService pendingResultExecutor = ExecutorKt.getPendingResultExecutor();
            Intrinsics.checkNotNullExpressionValue(pendingResultExecutor, "pendingResultExecutor");
            return new PendingResult<>(future, logger, pendingResultExecutor);
        }

        public Companion() {
        }
    }

    public PendingResult(@NotNull Future<T> future, @NotNull Logger logger, @NotNull Executor executor) {
        Intrinsics.checkNotNullParameter(future, "future");
        Intrinsics.checkNotNullParameter(logger, "logger");
        Intrinsics.checkNotNullParameter(executor, "executor");
        this.f63036a = future;
        this.f63037b = logger;
        this.f63038c = executor;
    }

    /* renamed from: a */
    public static /* synthetic */ Object m30491a(Function1 function1, PendingResult pendingResult) {
        return m30488d(function1, pendingResult);
    }

    /* renamed from: b */
    public static /* synthetic */ void m30490b(PendingResult pendingResult, Function1 function1) {
        m30487e(pendingResult, function1);
    }

    /* renamed from: d */
    public static final Object m30488d(Function1 transformer, PendingResult this$0) {
        Intrinsics.checkNotNullParameter(transformer, "$transformer");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return transformer.invoke(this$0.f63036a.get());
    }

    /* renamed from: e */
    public static final void m30487e(PendingResult this$0, Function1 callback) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(callback, "$callback");
        try {
            PendingResultKt.m30486a(new PendingResult$whenAvailable$1$1(callback, this$0.m30489c()));
        } catch (UnableToDecodeBitmapException unused) {
            this$0.f63037b.log("Couldn't decode bitmap from byte array");
            PendingResultKt.m30486a(new PendingResult$whenAvailable$1$2(callback));
        } catch (InterruptedException unused2) {
            this$0.f63037b.log("Couldn't deliver pending result: Camera stopped before delivering result.");
        } catch (CancellationException unused3) {
            this$0.f63037b.log("Couldn't deliver pending result: Camera operation was cancelled.");
        } catch (ExecutionException unused4) {
            this$0.f63037b.log("Couldn't deliver pending result: Operation failed internally.");
            PendingResultKt.m30486a(new PendingResult$whenAvailable$1$3(callback));
        }
    }

    public final <R> R adapt(@NotNull Function1<? super Future<T>, ? extends R> adapter) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        return adapter.invoke(this.f63036a);
    }

    public final T await() throws ExecutionException, InterruptedException {
        return (T) this.f63036a.get();
    }

    /* renamed from: c */
    public final Object m30489c() {
        EnsureBgThreadKt.ensureBackgroundThread();
        return this.f63036a.get();
    }

    @NotNull
    public final <R> PendingResult<R> transform(@NotNull final Function1<? super T, ? extends R> transformer) {
        Intrinsics.checkNotNullParameter(transformer, "transformer");
        FutureTask futureTask = new FutureTask(new Callable() { // from class: Mj1
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return PendingResult.m30491a(transformer, this);
            }
        });
        this.f63038c.execute(futureTask);
        return new PendingResult<>(futureTask, this.f63037b, this.f63038c);
    }

    public final void whenAvailable(@NotNull final Function1<? super T, Unit> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.f63038c.execute(new Runnable() { // from class: Lj1
            {
                PendingResult.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                PendingResult.m30490b(PendingResult.this, callback);
            }
        });
    }

    public final void whenDone(@NotNull WhenDoneListener<? super T> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        whenAvailable(new PendingResult$whenDone$1(callback));
    }
}
