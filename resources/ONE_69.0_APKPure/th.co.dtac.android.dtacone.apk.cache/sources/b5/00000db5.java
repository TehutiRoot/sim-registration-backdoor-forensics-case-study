package p000;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.KotlinNothingValueException;
import kotlin.Unit;
import kotlin.jvm.Volatile;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.DisposableHandle;
import kotlinx.coroutines.Job;

/* renamed from: OT1 */
/* loaded from: classes6.dex */
public final class OT1 implements Function1 {

    /* renamed from: d */
    public static final AtomicIntegerFieldUpdater f4463d = AtomicIntegerFieldUpdater.newUpdater(OT1.class, "_state");
    @Volatile
    private volatile int _state;

    /* renamed from: a */
    public final Job f4464a;

    /* renamed from: b */
    public final Thread f4465b = Thread.currentThread();

    /* renamed from: c */
    public DisposableHandle f4466c;

    public OT1(Job job) {
        this.f4464a = job;
    }

    /* renamed from: a */
    public final void m67114a() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f4463d;
        while (true) {
            int i = atomicIntegerFieldUpdater.get(this);
            if (i != 0) {
                if (i != 2) {
                    if (i == 3) {
                        Thread.interrupted();
                        return;
                    } else {
                        m67113b(i);
                        throw new KotlinNothingValueException();
                    }
                }
            } else if (f4463d.compareAndSet(this, i, 1)) {
                DisposableHandle disposableHandle = this.f4466c;
                if (disposableHandle != null) {
                    disposableHandle.dispose();
                    return;
                }
                return;
            }
        }
    }

    /* renamed from: b */
    public final Void m67113b(int i) {
        throw new IllegalStateException(("Illegal state " + i).toString());
    }

    /* renamed from: c */
    public void m67112c(Throwable th2) {
        int i;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater2 = f4463d;
        do {
            i = atomicIntegerFieldUpdater2.get(this);
            if (i != 0) {
                if (i != 1 && i != 2 && i != 3) {
                    m67113b(i);
                    throw new KotlinNothingValueException();
                }
                return;
            }
            atomicIntegerFieldUpdater = f4463d;
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, 2));
        this.f4465b.interrupt();
        atomicIntegerFieldUpdater.set(this, 3);
    }

    /* renamed from: d */
    public final void m67111d() {
        int i;
        this.f4466c = this.f4464a.invokeOnCompletion(true, true, this);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f4463d;
        do {
            i = atomicIntegerFieldUpdater.get(this);
            if (i != 0) {
                if (i != 2 && i != 3) {
                    m67113b(i);
                    throw new KotlinNothingValueException();
                }
                return;
            }
        } while (!f4463d.compareAndSet(this, i, 0));
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        m67112c((Throwable) obj);
        return Unit.INSTANCE;
    }
}