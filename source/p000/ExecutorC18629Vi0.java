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

/* renamed from: Vi0  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class ExecutorC18629Vi0 extends ExecutorCoroutineDispatcher implements TaskContext, Executor {

    /* renamed from: f */
    public static final AtomicIntegerFieldUpdater f6788f = AtomicIntegerFieldUpdater.newUpdater(ExecutorC18629Vi0.class, "inFlightTasks");

    /* renamed from: a */
    public final ExperimentalCoroutineDispatcher f6789a;

    /* renamed from: b */
    public final int f6790b;

    /* renamed from: c */
    public final String f6791c;

    /* renamed from: d */
    public final int f6792d;

    /* renamed from: e */
    public final ConcurrentLinkedQueue f6793e = new ConcurrentLinkedQueue();
    @Volatile
    private volatile int inFlightTasks;

    public ExecutorC18629Vi0(ExperimentalCoroutineDispatcher experimentalCoroutineDispatcher, int i, String str, int i2) {
        this.f6789a = experimentalCoroutineDispatcher;
        this.f6790b = i;
        this.f6791c = str;
        this.f6792d = i2;
    }

    @Override // kotlinx.coroutines.scheduling.TaskContext
    public void afterTask() {
        Runnable runnable = (Runnable) this.f6793e.poll();
        if (runnable != null) {
            this.f6789a.dispatchWithContext$kotlinx_coroutines_core(runnable, this, true);
            return;
        }
        f6788f.decrementAndGet(this);
        Runnable runnable2 = (Runnable) this.f6793e.poll();
        if (runnable2 == null) {
            return;
        }
        m65744d(runnable2, true);
    }

    @Override // kotlinx.coroutines.ExecutorCoroutineDispatcher, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        throw new IllegalStateException("Close cannot be invoked on LimitingBlockingDispatcher".toString());
    }

    /* renamed from: d */
    public final void m65744d(Runnable runnable, boolean z) {
        do {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f6788f;
            if (atomicIntegerFieldUpdater.incrementAndGet(this) <= this.f6790b) {
                this.f6789a.dispatchWithContext$kotlinx_coroutines_core(runnable, this, z);
                return;
            }
            this.f6793e.add(runnable);
            if (atomicIntegerFieldUpdater.decrementAndGet(this) >= this.f6790b) {
                return;
            }
            runnable = (Runnable) this.f6793e.poll();
        } while (runnable != null);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public void dispatch(CoroutineContext coroutineContext, Runnable runnable) {
        m65744d(runnable, false);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public void dispatchYield(CoroutineContext coroutineContext, Runnable runnable) {
        m65744d(runnable, true);
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        m65744d(runnable, false);
    }

    @Override // kotlinx.coroutines.scheduling.TaskContext
    public int getTaskMode() {
        return this.f6792d;
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public String toString() {
        String str = this.f6791c;
        if (str == null) {
            return super.toString() + "[dispatcher = " + this.f6789a + AbstractJsonLexerKt.END_LIST;
        }
        return str;
    }

    @Override // kotlinx.coroutines.ExecutorCoroutineDispatcher
    public Executor getExecutor() {
        return this;
    }
}
