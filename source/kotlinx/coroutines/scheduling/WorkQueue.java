package kotlinx.coroutines.scheduling;

import com.google.android.gms.analytics.ecommerce.ProductAction;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.jvm.Volatile;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\n\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ)\u0010\u0012\u001a\u00020\u00112\n\u0010\u000e\u001a\u00060\fj\u0002`\r2\u000e\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0014\u0010\u0006J\u000f\u0010\u0015\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0015\u0010\u0006J\u0015\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u001d\u0010\u001d\u001a\u0004\u0018\u00010\u00042\n\u0010\u000e\u001a\u00060\fj\u0002`\rH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0019\u0010 \u001a\u0004\u0018\u00010\u00042\u0006\u0010\u001f\u001a\u00020\bH\u0002¢\u0006\u0004\b \u0010!J!\u0010#\u001a\u0004\u0018\u00010\u00042\u0006\u0010\"\u001a\u00020\f2\u0006\u0010\u001f\u001a\u00020\bH\u0002¢\u0006\u0004\b#\u0010$J+\u0010%\u001a\u00020\u00112\n\u0010\u000e\u001a\u00060\fj\u0002`\r2\u000e\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u000fH\u0002¢\u0006\u0004\b%\u0010\u0013J\u0017\u0010'\u001a\u00020\b2\u0006\u0010&\u001a\u00020\u0016H\u0002¢\u0006\u0004\b'\u0010(J\u0011\u0010)\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b)\u0010\u0006J\u0015\u0010*\u001a\u00020\u0018*\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b*\u0010+R\u001c\u0010.\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010-R\u0014\u00101\u001a\u00020\f8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b/\u00100R\u0014\u00103\u001a\u00020\f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b2\u00100R\u000b\u00105\u001a\u0002048\u0002X\u0082\u0004R\u000b\u00106\u001a\u0002048\u0002X\u0082\u0004R\u0013\u00108\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u0004078\u0002X\u0082\u0004R\u000b\u00109\u001a\u0002048\u0002X\u0082\u0004¨\u0006:"}, m28850d2 = {"Lkotlinx/coroutines/scheduling/WorkQueue;", "", "<init>", "()V", "Lkotlinx/coroutines/scheduling/Task;", "poll", "()Lkotlinx/coroutines/scheduling/Task;", "task", "", "fair", ProductAction.ACTION_ADD, "(Lkotlinx/coroutines/scheduling/Task;Z)Lkotlinx/coroutines/scheduling/Task;", "", "Lkotlinx/coroutines/scheduling/StealingMode;", "stealingMode", "Lkotlin/jvm/internal/Ref$ObjectRef;", "stolenTaskRef", "", "trySteal", "(ILkotlin/jvm/internal/Ref$ObjectRef;)J", "pollBlocking", "pollCpu", "Lkotlinx/coroutines/scheduling/GlobalQueue;", "globalQueue", "", "offloadAllWorkTo", "(Lkotlinx/coroutines/scheduling/GlobalQueue;)V", PDPageLabelRange.STYLE_LETTERS_LOWER, "(Lkotlinx/coroutines/scheduling/Task;)Lkotlinx/coroutines/scheduling/Task;", OperatorName.NON_STROKING_GRAY, "(I)Lkotlinx/coroutines/scheduling/Task;", "onlyBlocking", OperatorName.FILL_NON_ZERO, "(Z)Lkotlinx/coroutines/scheduling/Task;", FirebaseAnalytics.Param.INDEX, OperatorName.CLOSE_PATH, "(IZ)Lkotlinx/coroutines/scheduling/Task;", "i", "queue", "e", "(Lkotlinx/coroutines/scheduling/GlobalQueue;)Z", "d", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "(Lkotlinx/coroutines/scheduling/Task;)V", "Ljava/util/concurrent/atomic/AtomicReferenceArray;", "Ljava/util/concurrent/atomic/AtomicReferenceArray;", "buffer", "getSize$kotlinx_coroutines_core", "()I", "size", OperatorName.CURVE_TO, "bufferSize", "Lkotlinx/atomicfu/AtomicInt;", "blockingTasksInBuffer", "consumerIndex", "Lkotlinx/atomicfu/AtomicRef;", "lastScheduledTask", "producerIndex", "kotlinx-coroutines-core"}, m28849k = 1, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nWorkQueue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WorkQueue.kt\nkotlinx/coroutines/scheduling/WorkQueue\n+ 2 Tasks.kt\nkotlinx/coroutines/scheduling/TasksKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 WorkQueue.kt\nkotlinx/coroutines/scheduling/WorkQueueKt\n*L\n1#1,255:1\n90#2:256\n90#2:257\n90#2:258\n90#2:261\n90#2:262\n1#3:259\n25#4:260\n*S KotlinDebug\n*F\n+ 1 WorkQueue.kt\nkotlinx/coroutines/scheduling/WorkQueue\n*L\n95#1:256\n162#1:257\n185#1:258\n205#1:261\n249#1:262\n205#1:260\n*E\n"})
/* loaded from: classes6.dex */
public final class WorkQueue {

    /* renamed from: b */
    public static final AtomicReferenceFieldUpdater f71053b = AtomicReferenceFieldUpdater.newUpdater(WorkQueue.class, Object.class, "lastScheduledTask");

    /* renamed from: c */
    public static final AtomicIntegerFieldUpdater f71054c = AtomicIntegerFieldUpdater.newUpdater(WorkQueue.class, "producerIndex");

    /* renamed from: d */
    public static final AtomicIntegerFieldUpdater f71055d = AtomicIntegerFieldUpdater.newUpdater(WorkQueue.class, "consumerIndex");

    /* renamed from: e */
    public static final AtomicIntegerFieldUpdater f71056e = AtomicIntegerFieldUpdater.newUpdater(WorkQueue.class, "blockingTasksInBuffer");

    /* renamed from: a */
    public final AtomicReferenceArray f71057a = new AtomicReferenceArray(128);
    @Volatile
    private volatile int blockingTasksInBuffer;
    @Volatile
    private volatile int consumerIndex;
    @Volatile
    @Nullable
    private volatile Object lastScheduledTask;
    @Volatile
    private volatile int producerIndex;

    public static /* synthetic */ Task add$default(WorkQueue workQueue, Task task, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return workQueue.add(task, z);
    }

    /* renamed from: a */
    public final Task m26789a(Task task) {
        if (m26787c() == 127) {
            return task;
        }
        if (task.taskContext.getTaskMode() == 1) {
            f71056e.incrementAndGet(this);
        }
        int i = f71054c.get(this) & 127;
        while (this.f71057a.get(i) != null) {
            Thread.yield();
        }
        this.f71057a.lazySet(i, task);
        f71054c.incrementAndGet(this);
        return null;
    }

    @Nullable
    public final Task add(@NotNull Task task, boolean z) {
        if (z) {
            return m26789a(task);
        }
        Task task2 = (Task) f71053b.getAndSet(this, task);
        if (task2 == null) {
            return null;
        }
        return m26789a(task2);
    }

    /* renamed from: b */
    public final void m26788b(Task task) {
        if (task != null && task.taskContext.getTaskMode() == 1) {
            f71056e.decrementAndGet(this);
        }
    }

    /* renamed from: c */
    public final int m26787c() {
        return f71054c.get(this) - f71055d.get(this);
    }

    /* renamed from: d */
    public final Task m26786d() {
        Task task;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f71055d;
            int i = atomicIntegerFieldUpdater.get(this);
            if (i - f71054c.get(this) == 0) {
                return null;
            }
            int i2 = i & 127;
            if (atomicIntegerFieldUpdater.compareAndSet(this, i, i + 1) && (task = (Task) this.f71057a.getAndSet(i2, null)) != null) {
                m26788b(task);
                return task;
            }
        }
    }

    /* renamed from: e */
    public final boolean m26785e(GlobalQueue globalQueue) {
        Task m26786d = m26786d();
        if (m26786d == null) {
            return false;
        }
        globalQueue.addLast(m26786d);
        return true;
    }

    /* renamed from: f */
    public final Task m26784f(boolean z) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        Task task;
        do {
            atomicReferenceFieldUpdater = f71053b;
            task = (Task) atomicReferenceFieldUpdater.get(this);
            if (task != null) {
                boolean z2 = true;
                if (task.taskContext.getTaskMode() != 1) {
                    z2 = false;
                }
                if (z2 == z) {
                }
            }
            int i = f71055d.get(this);
            int i2 = f71054c.get(this);
            while (i != i2) {
                if (z && f71056e.get(this) == 0) {
                    return null;
                }
                i2--;
                Task m26782h = m26782h(i2, z);
                if (m26782h != null) {
                    return m26782h;
                }
            }
            return null;
        } while (!AbstractC13055p0.m23740a(atomicReferenceFieldUpdater, this, task, null));
        return task;
    }

    /* renamed from: g */
    public final Task m26783g(int i) {
        int i2 = f71055d.get(this);
        int i3 = f71054c.get(this);
        boolean z = true;
        if (i != 1) {
            z = false;
        }
        while (i2 != i3) {
            if (z && f71056e.get(this) == 0) {
                return null;
            }
            int i4 = i2 + 1;
            Task m26782h = m26782h(i2, z);
            if (m26782h == null) {
                i2 = i4;
            } else {
                return m26782h;
            }
        }
        return null;
    }

    public final int getSize$kotlinx_coroutines_core() {
        if (f71053b.get(this) != null) {
            return m26787c() + 1;
        }
        return m26787c();
    }

    /* renamed from: h */
    public final Task m26782h(int i, boolean z) {
        int i2 = i & 127;
        Task task = (Task) this.f71057a.get(i2);
        if (task != null) {
            boolean z2 = true;
            if (task.taskContext.getTaskMode() != 1) {
                z2 = false;
            }
            if (z2 == z && AbstractC21408oN1.m25928a(this.f71057a, i2, task, null)) {
                if (z) {
                    f71056e.decrementAndGet(this);
                }
                return task;
            }
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [T, kotlinx.coroutines.scheduling.Task, java.lang.Object] */
    /* renamed from: i */
    public final long m26781i(int i, Ref.ObjectRef objectRef) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        ?? r1;
        do {
            atomicReferenceFieldUpdater = f71053b;
            r1 = (Task) atomicReferenceFieldUpdater.get(this);
            if (r1 == 0) {
                return -2L;
            }
            int i2 = 1;
            if (r1.taskContext.getTaskMode() != 1) {
                i2 = 2;
            }
            if ((i2 & i) == 0) {
                return -2L;
            }
            long nanoTime = TasksKt.schedulerTimeSource.nanoTime() - r1.submissionTime;
            long j = TasksKt.WORK_STEALING_TIME_RESOLUTION_NS;
            if (nanoTime < j) {
                return j - nanoTime;
            }
        } while (!AbstractC13055p0.m23740a(atomicReferenceFieldUpdater, this, r1, null));
        objectRef.element = r1;
        return -1L;
    }

    public final void offloadAllWorkTo(@NotNull GlobalQueue globalQueue) {
        Task task = (Task) f71053b.getAndSet(this, null);
        if (task != null) {
            globalQueue.addLast(task);
        }
        do {
        } while (m26785e(globalQueue));
    }

    @Nullable
    public final Task poll() {
        Task task = (Task) f71053b.getAndSet(this, null);
        if (task == null) {
            return m26786d();
        }
        return task;
    }

    @Nullable
    public final Task pollBlocking() {
        return m26784f(true);
    }

    @Nullable
    public final Task pollCpu() {
        return m26784f(false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long trySteal(int i, @NotNull Ref.ObjectRef<Task> objectRef) {
        T t;
        if (i == 3) {
            t = m26786d();
        } else {
            t = m26783g(i);
        }
        if (t != 0) {
            objectRef.element = t;
            return -1L;
        }
        return m26781i(i, objectRef);
    }
}
