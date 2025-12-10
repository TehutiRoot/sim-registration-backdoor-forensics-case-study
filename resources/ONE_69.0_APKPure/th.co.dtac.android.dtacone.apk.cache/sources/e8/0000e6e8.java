package kotlinx.coroutines.internal;

import com.google.android.gms.analytics.ecommerce.ProductAction;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.lang.Comparable;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.jvm.Volatile;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.InternalCoroutinesApi;
import kotlinx.coroutines.internal.ThreadSafeHeapNode;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@InternalCoroutinesApi
@Metadata(m29143d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0011\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0017\u0018\u0000*\u0012\b\u0000\u0010\u0003*\u00020\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u00060\u0004j\u0002`\u0005B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\u0007J2\u0010\u0010\u001a\u0004\u0018\u00018\u00002!\u0010\u000f\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u000e0\n¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u0014\u0010\u0013J&\u0010\u0015\u001a\u0004\u0018\u00018\u00002\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000e0\nH\u0086\b¢\u0006\u0004\b\u0015\u0010\u0011J\u0015\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00028\u0000¢\u0006\u0004\b\u0017\u0010\u0018J.\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00028\u00002\u0014\u0010\u0019\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0012\u0004\u0012\u00020\u000e0\nH\u0086\b¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00028\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ\u0011\u0010\u001e\u001a\u0004\u0018\u00018\u0000H\u0001¢\u0006\u0004\b\u001e\u0010\u0013J\u0017\u0010!\u001a\u00028\u00002\u0006\u0010 \u001a\u00020\u001fH\u0001¢\u0006\u0004\b!\u0010\"J\u0017\u0010#\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00028\u0000H\u0001¢\u0006\u0004\b#\u0010\u0018J\u0018\u0010%\u001a\u00020\b2\u0006\u0010$\u001a\u00020\u001fH\u0082\u0010¢\u0006\u0004\b%\u0010&J\u0018\u0010'\u001a\u00020\b2\u0006\u0010$\u001a\u00020\u001fH\u0082\u0010¢\u0006\u0004\b'\u0010&J\u0017\u0010)\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000(H\u0002¢\u0006\u0004\b)\u0010*J\u001f\u0010,\u001a\u00020\b2\u0006\u0010$\u001a\u00020\u001f2\u0006\u0010+\u001a\u00020\u001fH\u0002¢\u0006\u0004\b,\u0010-R \u0010)\u001a\f\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010.R$\u00102\u001a\u00020\u001f2\u0006\u0010\r\u001a\u00020\u001f8F@BX\u0086\u000e¢\u0006\f\u001a\u0004\b/\u00100\"\u0004\b1\u0010&R\u0011\u00103\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b3\u00104R\u000b\u00106\u001a\u0002058\u0002X\u0082\u0004¨\u00067"}, m29142d2 = {"Lkotlinx/coroutines/internal/ThreadSafeHeap;", "Lkotlinx/coroutines/internal/ThreadSafeHeapNode;", "", "T", "", "Lkotlinx/coroutines/internal/SynchronizedObject;", "<init>", "()V", "", "clear", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "value", "", "predicate", "find", "(Lkotlin/jvm/functions/Function1;)Lkotlinx/coroutines/internal/ThreadSafeHeapNode;", "peek", "()Lkotlinx/coroutines/internal/ThreadSafeHeapNode;", "removeFirstOrNull", "removeFirstIf", "node", "addLast", "(Lkotlinx/coroutines/internal/ThreadSafeHeapNode;)V", "cond", "addLastIf", "(Lkotlinx/coroutines/internal/ThreadSafeHeapNode;Lkotlin/jvm/functions/Function1;)Z", ProductAction.ACTION_REMOVE, "(Lkotlinx/coroutines/internal/ThreadSafeHeapNode;)Z", "firstImpl", "", FirebaseAnalytics.Param.INDEX, "removeAtImpl", "(I)Lkotlinx/coroutines/internal/ThreadSafeHeapNode;", "addImpl", "i", "d", "(I)V", OperatorName.CURVE_TO, "", PDPageLabelRange.STYLE_LETTERS_LOWER, "()[Lkotlinx/coroutines/internal/ThreadSafeHeapNode;", OperatorName.SET_LINE_JOINSTYLE, "e", "(II)V", "[Lkotlinx/coroutines/internal/ThreadSafeHeapNode;", "getSize", "()I", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "size", "isEmpty", "()Z", "Lkotlinx/atomicfu/AtomicInt;", "_size", "kotlinx-coroutines-core"}, m29141k = 1, m29140mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nThreadSafeHeap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThreadSafeHeap.kt\nkotlinx/coroutines/internal/ThreadSafeHeap\n+ 2 Synchronized.common.kt\nkotlinx/coroutines/internal/Synchronized_commonKt\n+ 3 Synchronized.kt\nkotlinx/coroutines/internal/SynchronizedKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,168:1\n28#2,4:169\n28#2,4:174\n28#2,4:179\n28#2,4:184\n28#2,4:189\n28#2,4:194\n28#2,4:199\n28#2,4:204\n20#3:173\n20#3:178\n20#3:183\n20#3:188\n20#3:193\n20#3:198\n20#3:203\n20#3:208\n1#4:209\n*S KotlinDebug\n*F\n+ 1 ThreadSafeHeap.kt\nkotlinx/coroutines/internal/ThreadSafeHeap\n*L\n35#1:169,4\n42#1:174,4\n50#1:179,4\n52#1:184,4\n60#1:189,4\n69#1:194,4\n72#1:199,4\n81#1:204,4\n35#1:173\n42#1:178\n50#1:183\n52#1:188\n60#1:193\n69#1:198\n72#1:203\n81#1:208\n*E\n"})
/* loaded from: classes6.dex */
public class ThreadSafeHeap<T extends ThreadSafeHeapNode & Comparable<? super T>> {

    /* renamed from: b */
    public static final AtomicIntegerFieldUpdater f71065b = AtomicIntegerFieldUpdater.newUpdater(ThreadSafeHeap.class, "_size");
    @Volatile
    private volatile int _size;

    /* renamed from: a */
    public ThreadSafeHeapNode[] f71066a;

    /* renamed from: a */
    public final ThreadSafeHeapNode[] m27114a() {
        ThreadSafeHeapNode[] threadSafeHeapNodeArr = this.f71066a;
        if (threadSafeHeapNodeArr == null) {
            ThreadSafeHeapNode[] threadSafeHeapNodeArr2 = new ThreadSafeHeapNode[4];
            this.f71066a = threadSafeHeapNodeArr2;
            return threadSafeHeapNodeArr2;
        } else if (getSize() >= threadSafeHeapNodeArr.length) {
            Object[] copyOf = Arrays.copyOf(threadSafeHeapNodeArr, getSize() * 2);
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
            ThreadSafeHeapNode[] threadSafeHeapNodeArr3 = (ThreadSafeHeapNode[]) copyOf;
            this.f71066a = threadSafeHeapNodeArr3;
            return threadSafeHeapNodeArr3;
        } else {
            return threadSafeHeapNodeArr;
        }
    }

    @PublishedApi
    public final void addImpl(@NotNull T t) {
        t.setHeap(this);
        ThreadSafeHeapNode[] m27114a = m27114a();
        int size = getSize();
        m27113b(size + 1);
        m27114a[size] = t;
        t.setIndex(size);
        m27111d(size);
    }

    public final void addLast(@NotNull T t) {
        synchronized (this) {
            addImpl(t);
            Unit unit = Unit.INSTANCE;
        }
    }

    public final boolean addLastIf(@NotNull T t, @NotNull Function1<? super T, Boolean> function1) {
        boolean z;
        synchronized (this) {
            try {
                if (function1.invoke(firstImpl()).booleanValue()) {
                    addImpl(t);
                    z = true;
                } else {
                    z = false;
                }
                InlineMarker.finallyStart(1);
            } catch (Throwable th2) {
                InlineMarker.finallyStart(1);
                InlineMarker.finallyEnd(1);
                throw th2;
            }
        }
        InlineMarker.finallyEnd(1);
        return z;
    }

    /* renamed from: b */
    public final void m27113b(int i) {
        f71065b.set(this, i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0028, code lost:
        if (((java.lang.Comparable) r3).compareTo(r4) < 0) goto L7;
     */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m27112c(int r6) {
        /*
            r5 = this;
        L0:
            int r0 = r6 * 2
            int r1 = r0 + 1
            int r2 = r5.getSize()
            if (r1 < r2) goto Lb
            return
        Lb:
            kotlinx.coroutines.internal.ThreadSafeHeapNode[] r2 = r5.f71066a
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2)
            int r0 = r0 + 2
            int r3 = r5.getSize()
            if (r0 >= r3) goto L2b
            r3 = r2[r0]
            kotlin.jvm.internal.Intrinsics.checkNotNull(r3)
            java.lang.Comparable r3 = (java.lang.Comparable) r3
            r4 = r2[r1]
            kotlin.jvm.internal.Intrinsics.checkNotNull(r4)
            int r3 = r3.compareTo(r4)
            if (r3 >= 0) goto L2b
            goto L2c
        L2b:
            r0 = r1
        L2c:
            r1 = r2[r6]
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1)
            java.lang.Comparable r1 = (java.lang.Comparable) r1
            r2 = r2[r0]
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2)
            int r1 = r1.compareTo(r2)
            if (r1 > 0) goto L3f
            return
        L3f:
            r5.m27110e(r6, r0)
            r6 = r0
            goto L0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.internal.ThreadSafeHeap.m27112c(int):void");
    }

    public final void clear() {
        synchronized (this) {
            try {
                ThreadSafeHeapNode[] threadSafeHeapNodeArr = this.f71066a;
                if (threadSafeHeapNodeArr != null) {
                    ArraysKt___ArraysJvmKt.fill$default(threadSafeHeapNodeArr, (Object) null, 0, 0, 6, (Object) null);
                }
                f71065b.set(this, 0);
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: d */
    public final void m27111d(int i) {
        while (i > 0) {
            ThreadSafeHeapNode[] threadSafeHeapNodeArr = this.f71066a;
            Intrinsics.checkNotNull(threadSafeHeapNodeArr);
            int i2 = (i - 1) / 2;
            ThreadSafeHeapNode threadSafeHeapNode = threadSafeHeapNodeArr[i2];
            Intrinsics.checkNotNull(threadSafeHeapNode);
            ThreadSafeHeapNode threadSafeHeapNode2 = threadSafeHeapNodeArr[i];
            Intrinsics.checkNotNull(threadSafeHeapNode2);
            if (((Comparable) threadSafeHeapNode).compareTo(threadSafeHeapNode2) <= 0) {
                return;
            }
            m27110e(i, i2);
            i = i2;
        }
    }

    /* renamed from: e */
    public final void m27110e(int i, int i2) {
        ThreadSafeHeapNode[] threadSafeHeapNodeArr = this.f71066a;
        Intrinsics.checkNotNull(threadSafeHeapNodeArr);
        ThreadSafeHeapNode threadSafeHeapNode = threadSafeHeapNodeArr[i2];
        Intrinsics.checkNotNull(threadSafeHeapNode);
        ThreadSafeHeapNode threadSafeHeapNode2 = threadSafeHeapNodeArr[i];
        Intrinsics.checkNotNull(threadSafeHeapNode2);
        threadSafeHeapNodeArr[i] = threadSafeHeapNode;
        threadSafeHeapNodeArr[i2] = threadSafeHeapNode2;
        threadSafeHeapNode.setIndex(i);
        threadSafeHeapNode2.setIndex(i2);
    }

    @Nullable
    public final T find(@NotNull Function1<? super T, Boolean> function1) {
        ThreadSafeHeapNode threadSafeHeapNode;
        synchronized (this) {
            try {
                int size = getSize();
                int i = 0;
                while (true) {
                    threadSafeHeapNode = (T) null;
                    if (i >= size) {
                        break;
                    }
                    ThreadSafeHeapNode[] threadSafeHeapNodeArr = this.f71066a;
                    if (threadSafeHeapNodeArr != null) {
                        threadSafeHeapNode = threadSafeHeapNodeArr[i];
                    }
                    Intrinsics.checkNotNull(threadSafeHeapNode);
                    if (function1.invoke(threadSafeHeapNode).booleanValue()) {
                        break;
                    }
                    i++;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return (T) threadSafeHeapNode;
    }

    @PublishedApi
    @Nullable
    public final T firstImpl() {
        ThreadSafeHeapNode[] threadSafeHeapNodeArr = this.f71066a;
        if (threadSafeHeapNodeArr != null) {
            return (T) threadSafeHeapNodeArr[0];
        }
        return null;
    }

    public final int getSize() {
        return f71065b.get(this);
    }

    public final boolean isEmpty() {
        if (getSize() == 0) {
            return true;
        }
        return false;
    }

    @Nullable
    public final T peek() {
        T firstImpl;
        synchronized (this) {
            firstImpl = firstImpl();
        }
        return firstImpl;
    }

    public final boolean remove(@NotNull T t) {
        boolean z;
        synchronized (this) {
            if (t.getHeap() == null) {
                z = false;
            } else {
                removeAtImpl(t.getIndex());
                z = true;
            }
        }
        return z;
    }

    @PublishedApi
    @NotNull
    public final T removeAtImpl(int i) {
        ThreadSafeHeapNode[] threadSafeHeapNodeArr = this.f71066a;
        Intrinsics.checkNotNull(threadSafeHeapNodeArr);
        m27113b(getSize() - 1);
        if (i < getSize()) {
            m27110e(i, getSize());
            int i2 = (i - 1) / 2;
            if (i > 0) {
                ThreadSafeHeapNode threadSafeHeapNode = threadSafeHeapNodeArr[i];
                Intrinsics.checkNotNull(threadSafeHeapNode);
                ThreadSafeHeapNode threadSafeHeapNode2 = threadSafeHeapNodeArr[i2];
                Intrinsics.checkNotNull(threadSafeHeapNode2);
                if (((Comparable) threadSafeHeapNode).compareTo(threadSafeHeapNode2) < 0) {
                    m27110e(i, i2);
                    m27111d(i2);
                }
            }
            m27112c(i);
        }
        T t = (T) threadSafeHeapNodeArr[getSize()];
        Intrinsics.checkNotNull(t);
        t.setHeap(null);
        t.setIndex(-1);
        threadSafeHeapNodeArr[getSize()] = null;
        return t;
    }

    @Nullable
    public final T removeFirstIf(@NotNull Function1<? super T, Boolean> function1) {
        synchronized (this) {
            try {
                T firstImpl = firstImpl();
                T t = null;
                if (firstImpl == null) {
                    InlineMarker.finallyStart(2);
                    InlineMarker.finallyEnd(2);
                    return null;
                }
                if (function1.invoke(firstImpl).booleanValue()) {
                    t = removeAtImpl(0);
                }
                InlineMarker.finallyStart(1);
                InlineMarker.finallyEnd(1);
                return t;
            } catch (Throwable th2) {
                InlineMarker.finallyStart(1);
                InlineMarker.finallyEnd(1);
                throw th2;
            }
        }
    }

    @Nullable
    public final T removeFirstOrNull() {
        T t;
        synchronized (this) {
            if (getSize() > 0) {
                t = removeAtImpl(0);
            } else {
                t = null;
            }
        }
        return t;
    }
}