package p000;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.KotlinNothingValueException;
import kotlin.Unit;
import kotlin.jvm.Volatile;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.DisposableHandle;
import kotlinx.coroutines.Job;

/* renamed from: RS1 */
/* loaded from: classes6.dex */
public final class RS1 implements Function1 {

    /* renamed from: d */
    public static final AtomicIntegerFieldUpdater f5345d = AtomicIntegerFieldUpdater.newUpdater(RS1.class, "_state");
    @Volatile
    private volatile int _state;

    /* renamed from: a */
    public final Job f5346a;

    /* renamed from: b */
    public final Thread f5347b = Thread.currentThread();

    /* renamed from: c */
    public DisposableHandle f5348c;

    public RS1(Job job) {
        this.f5346a = job;
    }

    /* renamed from: a */
    public final void m66453a() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f5345d;
        while (true) {
            int i = atomicIntegerFieldUpdater.get(this);
            if (i != 0) {
                if (i != 2) {
                    if (i == 3) {
                        Thread.interrupted();
                        return;
                    } else {
                        m66452b(i);
                        throw new KotlinNothingValueException();
                    }
                }
            } else if (f5345d.compareAndSet(this, i, 1)) {
                DisposableHandle disposableHandle = this.f5348c;
                if (disposableHandle != null) {
                    disposableHandle.dispose();
                    return;
                }
                return;
            }
        }
    }

    /* renamed from: b */
    public final Void m66452b(int i) {
        throw new IllegalStateException(("Illegal state " + i).toString());
    }

    /* renamed from: c */
    public void m66451c(Throwable th2) {
        int i;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater2 = f5345d;
        do {
            i = atomicIntegerFieldUpdater2.get(this);
            if (i != 0) {
                if (i != 1 && i != 2 && i != 3) {
                    m66452b(i);
                    throw new KotlinNothingValueException();
                }
                return;
            }
            atomicIntegerFieldUpdater = f5345d;
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, 2));
        this.f5347b.interrupt();
        atomicIntegerFieldUpdater.set(this, 3);
    }

    /* renamed from: d */
    public final void m66450d() {
        int i;
        this.f5348c = this.f5346a.invokeOnCompletion(true, true, this);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f5345d;
        do {
            i = atomicIntegerFieldUpdater.get(this);
            if (i != 0) {
                if (i != 2 && i != 3) {
                    m66452b(i);
                    throw new KotlinNothingValueException();
                }
                return;
            }
        } while (!f5345d.compareAndSet(this, i, 0));
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        m66451c((Throwable) obj);
        return Unit.INSTANCE;
    }
}
