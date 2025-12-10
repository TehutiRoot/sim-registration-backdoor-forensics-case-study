package p000;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.Volatile;
import kotlinx.coroutines.ExecutorCoroutineDispatcher;
import kotlinx.coroutines.scheduling.ExperimentalCoroutineDispatcher;
import kotlinx.coroutines.scheduling.TaskContext;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* renamed from: bj0  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class ExecutorC19272bj0 extends ExecutorCoroutineDispatcher implements TaskContext, Executor {

    /* renamed from: f */
    public static final AtomicIntegerFieldUpdater f39204f = AtomicIntegerFieldUpdater.newUpdater(ExecutorC19272bj0.class, "inFlightTasks");

    /* renamed from: a */
    public final ExperimentalCoroutineDispatcher f39205a;

    /* renamed from: b */
    public final int f39206b;

    /* renamed from: c */
    public final String f39207c;

    /* renamed from: d */
    public final int f39208d;

    /* renamed from: e */
    public final ConcurrentLinkedQueue f39209e = new ConcurrentLinkedQueue();
    @Volatile
    private volatile int inFlightTasks;

    public ExecutorC19272bj0(ExperimentalCoroutineDispatcher experimentalCoroutineDispatcher, int i, String str, int i2) {
        this.f39205a = experimentalCoroutineDispatcher;
        this.f39206b = i;
        this.f39207c = str;
        this.f39208d = i2;
    }

    @Override // kotlinx.coroutines.scheduling.TaskContext
    public void afterTask() {
        Runnable runnable = (Runnable) this.f39209e.poll();
        if (runnable != null) {
            this.f39205a.dispatchWithContext$kotlinx_coroutines_core(runnable, this, true);
            return;
        }
        f39204f.decrementAndGet(this);
        Runnable runnable2 = (Runnable) this.f39209e.poll();
        if (runnable2 == null) {
            return;
        }
        m51887d(runnable2, true);
    }

    @Override // kotlinx.coroutines.ExecutorCoroutineDispatcher, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        throw new IllegalStateException("Close cannot be invoked on LimitingBlockingDispatcher".toString());
    }

    /* renamed from: d */
    public final void m51887d(Runnable runnable, boolean z) {
        do {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f39204f;
            if (atomicIntegerFieldUpdater.incrementAndGet(this) <= this.f39206b) {
                this.f39205a.dispatchWithContext$kotlinx_coroutines_core(runnable, this, z);
                return;
            }
            this.f39209e.add(runnable);
            if (atomicIntegerFieldUpdater.decrementAndGet(this) >= this.f39206b) {
                return;
            }
            runnable = (Runnable) this.f39209e.poll();
        } while (runnable != null);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public void dispatch(CoroutineContext coroutineContext, Runnable runnable) {
        m51887d(runnable, false);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public void dispatchYield(CoroutineContext coroutineContext, Runnable runnable) {
        m51887d(runnable, true);
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        m51887d(runnable, false);
    }

    @Override // kotlinx.coroutines.scheduling.TaskContext
    public int getTaskMode() {
        return this.f39208d;
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public String toString() {
        String str = this.f39207c;
        if (str == null) {
            return super.toString() + "[dispatcher = " + this.f39205a + AbstractJsonLexerKt.END_LIST;
        }
        return str;
    }

    @Override // kotlinx.coroutines.ExecutorCoroutineDispatcher
    public Executor getExecutor() {
        return this;
    }
}