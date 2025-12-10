package kotlinx.coroutines.internal;

import ch.qos.logback.core.CoreConstants;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.Volatile;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineExceptionHandlerKt;
import kotlinx.coroutines.DefaultExecutorKt;
import kotlinx.coroutines.Delay;
import kotlinx.coroutines.DisposableHandle;
import kotlinx.coroutines.ExperimentalCoroutinesApi;
import kotlinx.coroutines.InternalCoroutinesApi;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002:\u0001$B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0001\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0097Aø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ,\u0010\u0014\u001a\u00020\u00132\u0006\u0010\r\u001a\u00020\b2\n\u0010\u0010\u001a\u00060\u000ej\u0002`\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0096\u0001¢\u0006\u0004\b\u0014\u0010\u0015J&\u0010\u0018\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\b2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\n0\u0016H\u0096\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0004H\u0017¢\u0006\u0004\b\u001a\u0010\u001bJ#\u0010\u001c\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u00112\n\u0010\u0010\u001a\u00060\u000ej\u0002`\u000fH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ#\u0010\u001e\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u00112\n\u0010\u0010\u001a\u00060\u000ej\u0002`\u000fH\u0017¢\u0006\u0004\b\u001e\u0010\u001dJ\u000f\u0010 \u001a\u00020\u001fH\u0002¢\u0006\u0004\b \u0010!J\u0017\u0010\"\u001a\n\u0018\u00010\u000ej\u0004\u0018\u0001`\u000fH\u0002¢\u0006\u0004\b\"\u0010#R\u0014\u0010\u0003\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u001e\u0010*\u001a\f\u0012\b\u0012\u00060\u000ej\u0002`\u000f0(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010)R\u0018\u0010/\u001a\u00060+j\u0002`,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u000b\u00101\u001a\u0002008\u0002X\u0082\u0004\u0082\u0002\u0004\n\u0002\b\u0019¨\u00062"}, m28850d2 = {"Lkotlinx/coroutines/internal/LimitedDispatcher;", "Lkotlinx/coroutines/CoroutineDispatcher;", "Lkotlinx/coroutines/Delay;", "dispatcher", "", "parallelism", "<init>", "(Lkotlinx/coroutines/CoroutineDispatcher;I)V", "", "time", "", "delay", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "timeMillis", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "Lkotlin/coroutines/CoroutineContext;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lkotlinx/coroutines/DisposableHandle;", "invokeOnTimeout", "(JLjava/lang/Runnable;Lkotlin/coroutines/CoroutineContext;)Lkotlinx/coroutines/DisposableHandle;", "Lkotlinx/coroutines/CancellableContinuation;", "continuation", "scheduleResumeAfterDelay", "(JLkotlinx/coroutines/CancellableContinuation;)V", "limitedParallelism", "(I)Lkotlinx/coroutines/CoroutineDispatcher;", "dispatch", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Runnable;)V", "dispatchYield", "", "i", "()Z", "d", "()Ljava/lang/Runnable;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Lkotlinx/coroutines/CoroutineDispatcher;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "I", "Lkotlinx/coroutines/internal/LockFreeTaskQueue;", "Lkotlinx/coroutines/internal/LockFreeTaskQueue;", "queue", "", "Lkotlinx/coroutines/internal/SynchronizedObject;", "e", "Ljava/lang/Object;", "workerAllocationLock", "Lkotlinx/atomicfu/AtomicInt;", "runningWorkers", "kotlinx-coroutines-core"}, m28849k = 1, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nLimitedDispatcher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LimitedDispatcher.kt\nkotlinx/coroutines/internal/LimitedDispatcher\n+ 2 Synchronized.common.kt\nkotlinx/coroutines/internal/Synchronized_commonKt\n+ 3 Synchronized.kt\nkotlinx/coroutines/internal/SynchronizedKt\n*L\n1#1,134:1\n66#1,8:135\n66#1,8:143\n28#2,4:151\n28#2,4:156\n20#3:155\n20#3:160\n*S KotlinDebug\n*F\n+ 1 LimitedDispatcher.kt\nkotlinx/coroutines/internal/LimitedDispatcher\n*L\n48#1:135,8\n55#1:143,8\n79#1:151,4\n92#1:156,4\n79#1:155\n92#1:160\n*E\n"})
/* loaded from: classes6.dex */
public final class LimitedDispatcher extends CoroutineDispatcher implements Delay {

    /* renamed from: f */
    public static final AtomicIntegerFieldUpdater f70994f = AtomicIntegerFieldUpdater.newUpdater(LimitedDispatcher.class, "runningWorkers");

    /* renamed from: a */
    public final CoroutineDispatcher f70995a;

    /* renamed from: b */
    public final int f70996b;

    /* renamed from: c */
    public final /* synthetic */ Delay f70997c;

    /* renamed from: d */
    public final LockFreeTaskQueue f70998d;

    /* renamed from: e */
    public final Object f70999e;
    @Volatile
    private volatile int runningWorkers;

    /* renamed from: kotlinx.coroutines.internal.LimitedDispatcher$a */
    /* loaded from: classes6.dex */
    public final class RunnableC12151a implements Runnable {

        /* renamed from: a */
        public Runnable f71000a;

        public RunnableC12151a(Runnable runnable) {
            this.f71000a = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            int i = 0;
            while (true) {
                try {
                    this.f71000a.run();
                } catch (Throwable th2) {
                    CoroutineExceptionHandlerKt.handleCoroutineException(EmptyCoroutineContext.INSTANCE, th2);
                }
                Runnable m26844d = LimitedDispatcher.this.m26844d();
                if (m26844d == null) {
                    return;
                }
                this.f71000a = m26844d;
                i++;
                if (i >= 16 && LimitedDispatcher.this.f70995a.isDispatchNeeded(LimitedDispatcher.this)) {
                    LimitedDispatcher.this.f70995a.dispatch(LimitedDispatcher.this, this);
                    return;
                }
            }
        }
    }

    public LimitedDispatcher(@NotNull CoroutineDispatcher coroutineDispatcher, int i) {
        Delay delay;
        this.f70995a = coroutineDispatcher;
        this.f70996b = i;
        if (coroutineDispatcher instanceof Delay) {
            delay = (Delay) coroutineDispatcher;
        } else {
            delay = null;
        }
        this.f70997c = delay == null ? DefaultExecutorKt.getDefaultDelay() : delay;
        this.f70998d = new LockFreeTaskQueue(false);
        this.f70999e = new Object();
    }

    /* renamed from: d */
    public final Runnable m26844d() {
        while (true) {
            Runnable runnable = (Runnable) this.f70998d.removeFirstOrNull();
            if (runnable == null) {
                synchronized (this.f70999e) {
                    AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f70994f;
                    atomicIntegerFieldUpdater.decrementAndGet(this);
                    if (this.f70998d.getSize() == 0) {
                        return null;
                    }
                    atomicIntegerFieldUpdater.incrementAndGet(this);
                }
            } else {
                return runnable;
            }
        }
    }

    @Override // kotlinx.coroutines.Delay
    @Deprecated(level = DeprecationLevel.ERROR, message = "Deprecated without replacement as an internal method never intended for public use")
    @Nullable
    public Object delay(long j, @NotNull Continuation<? super Unit> continuation) {
        return this.f70997c.delay(j, continuation);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public void dispatch(@NotNull CoroutineContext coroutineContext, @NotNull Runnable runnable) {
        Runnable m26844d;
        this.f70998d.addLast(runnable);
        if (f70994f.get(this) < this.f70996b && m26843i() && (m26844d = m26844d()) != null) {
            this.f70995a.dispatch(this, new RunnableC12151a(m26844d));
        }
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    @InternalCoroutinesApi
    public void dispatchYield(@NotNull CoroutineContext coroutineContext, @NotNull Runnable runnable) {
        Runnable m26844d;
        this.f70998d.addLast(runnable);
        if (f70994f.get(this) < this.f70996b && m26843i() && (m26844d = m26844d()) != null) {
            this.f70995a.dispatchYield(this, new RunnableC12151a(m26844d));
        }
    }

    /* renamed from: i */
    public final boolean m26843i() {
        synchronized (this.f70999e) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f70994f;
            if (atomicIntegerFieldUpdater.get(this) >= this.f70996b) {
                return false;
            }
            atomicIntegerFieldUpdater.incrementAndGet(this);
            return true;
        }
    }

    @Override // kotlinx.coroutines.Delay
    @NotNull
    public DisposableHandle invokeOnTimeout(long j, @NotNull Runnable runnable, @NotNull CoroutineContext coroutineContext) {
        return this.f70997c.invokeOnTimeout(j, runnable, coroutineContext);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    @ExperimentalCoroutinesApi
    @NotNull
    public CoroutineDispatcher limitedParallelism(int i) {
        LimitedDispatcherKt.checkParallelism(i);
        if (i >= this.f70996b) {
            return this;
        }
        return super.limitedParallelism(i);
    }

    @Override // kotlinx.coroutines.Delay
    public void scheduleResumeAfterDelay(long j, @NotNull CancellableContinuation<? super Unit> cancellableContinuation) {
        this.f70997c.scheduleResumeAfterDelay(j, cancellableContinuation);
    }
}
