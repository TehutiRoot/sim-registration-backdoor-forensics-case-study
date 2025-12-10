package kotlinx.coroutines.internal;

import com.google.android.gms.analytics.ecommerce.ProductAction;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.jvm.Volatile;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.internal.ConcurrentLinkedListNode;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0003\b \u0018\u0000*\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00002\u00020\u0002B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u0004\u0010\u0005J \u0010\t\u001a\u0004\u0018\u00018\u00002\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0086\b¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00028\u0000¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\f¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\u000f¢\u0006\u0004\b\u0014\u0010\u0011R\u0013\u0010\u0017\u001a\u0004\u0018\u00018\u00008F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0018\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0013R\u0013\u0010\u0003\u001a\u0004\u0018\u00018\u00008F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0016R\u0014\u0010\u001a\u001a\u00020\f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0013R\u0016\u0010\u001d\u001a\u0004\u0018\u00010\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0016\u0010\u001f\u001a\u0004\u0018\u00018\u00008BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u0016R\u0014\u0010!\u001a\u00028\u00008BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b \u0010\u0016R\u0013\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\"8\u0002X\u0082\u0004R\u0013\u0010$\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\"8\u0002X\u0082\u0004¨\u0006%"}, m28850d2 = {"Lkotlinx/coroutines/internal/ConcurrentLinkedListNode;", "N", "", "prev", "<init>", "(Lkotlinx/coroutines/internal/ConcurrentLinkedListNode;)V", "Lkotlin/Function0;", "", "onClosedAction", "nextOrIfClosed", "(Lkotlin/jvm/functions/Function0;)Lkotlinx/coroutines/internal/ConcurrentLinkedListNode;", "value", "", "trySetNext", "(Lkotlinx/coroutines/internal/ConcurrentLinkedListNode;)Z", "", "cleanPrev", "()V", "markAsClosed", "()Z", ProductAction.ACTION_REMOVE, "getNext", "()Lkotlinx/coroutines/internal/ConcurrentLinkedListNode;", "next", "isTail", "getPrev", "isRemoved", OperatorName.CURVE_TO, "()Ljava/lang/Object;", "nextOrClosed", PDPageLabelRange.STYLE_LETTERS_LOWER, "aliveSegmentLeft", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "aliveSegmentRight", "Lkotlinx/atomicfu/AtomicRef;", "_next", "_prev", "kotlinx-coroutines-core"}, m28849k = 1, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nConcurrentLinkedList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConcurrentLinkedList.kt\nkotlinx/coroutines/internal/ConcurrentLinkedListNode\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,269:1\n107#1,7:270\n1#2:277\n*S KotlinDebug\n*F\n+ 1 ConcurrentLinkedList.kt\nkotlinx/coroutines/internal/ConcurrentLinkedListNode\n*L\n115#1:270,7\n*E\n"})
/* loaded from: classes6.dex */
public abstract class ConcurrentLinkedListNode<N extends ConcurrentLinkedListNode<N>> {

    /* renamed from: a */
    public static final AtomicReferenceFieldUpdater f70985a = AtomicReferenceFieldUpdater.newUpdater(ConcurrentLinkedListNode.class, Object.class, "_next");

    /* renamed from: b */
    public static final AtomicReferenceFieldUpdater f70986b = AtomicReferenceFieldUpdater.newUpdater(ConcurrentLinkedListNode.class, Object.class, "_prev");
    @Volatile
    @Nullable
    private volatile Object _next;
    @Volatile
    @Nullable
    private volatile Object _prev;

    public ConcurrentLinkedListNode(@Nullable N n) {
        this._prev = n;
    }

    /* renamed from: a */
    public final ConcurrentLinkedListNode m26857a() {
        ConcurrentLinkedListNode prev = getPrev();
        while (prev != null && prev.isRemoved()) {
            prev = (ConcurrentLinkedListNode) f70986b.get(prev);
        }
        return prev;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [kotlinx.coroutines.internal.ConcurrentLinkedListNode] */
    /* renamed from: b */
    public final ConcurrentLinkedListNode m26856b() {
        N next = getNext();
        Intrinsics.checkNotNull(next);
        while (next.isRemoved()) {
            ?? next2 = next.getNext();
            if (next2 == 0) {
                return next;
            }
            next = next2;
        }
        return next;
    }

    /* renamed from: c */
    public final Object m26855c() {
        return f70985a.get(this);
    }

    public final void cleanPrev() {
        f70986b.lazySet(this, null);
    }

    @Nullable
    public final N getNext() {
        Object m26855c = m26855c();
        if (m26855c == ConcurrentLinkedListKt.access$getCLOSED$p()) {
            return null;
        }
        return (N) m26855c;
    }

    @Nullable
    public final N getPrev() {
        return (N) f70986b.get(this);
    }

    public abstract boolean isRemoved();

    public final boolean isTail() {
        if (getNext() == null) {
            return true;
        }
        return false;
    }

    public final boolean markAsClosed() {
        return AbstractC13055p0.m23740a(f70985a, this, null, ConcurrentLinkedListKt.access$getCLOSED$p());
    }

    @Nullable
    public final N nextOrIfClosed(@NotNull Function0 function0) {
        Object m26855c = m26855c();
        if (m26855c != ConcurrentLinkedListKt.access$getCLOSED$p()) {
            return (N) m26855c;
        }
        function0.invoke();
        throw new KotlinNothingValueException();
    }

    public final void remove() {
        Object obj;
        ConcurrentLinkedListNode concurrentLinkedListNode;
        if (isTail()) {
            return;
        }
        while (true) {
            ConcurrentLinkedListNode m26857a = m26857a();
            ConcurrentLinkedListNode m26856b = m26856b();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f70986b;
            do {
                obj = atomicReferenceFieldUpdater.get(m26856b);
                if (((ConcurrentLinkedListNode) obj) == null) {
                    concurrentLinkedListNode = null;
                } else {
                    concurrentLinkedListNode = m26857a;
                }
            } while (!AbstractC13055p0.m23740a(atomicReferenceFieldUpdater, m26856b, obj, concurrentLinkedListNode));
            if (m26857a != null) {
                f70985a.set(m26857a, m26856b);
            }
            if (!m26856b.isRemoved() || m26856b.isTail()) {
                if (m26857a == null || !m26857a.isRemoved()) {
                    return;
                }
            }
        }
    }

    public final boolean trySetNext(@NotNull N n) {
        return AbstractC13055p0.m23740a(f70985a, this, null, n);
    }
}
