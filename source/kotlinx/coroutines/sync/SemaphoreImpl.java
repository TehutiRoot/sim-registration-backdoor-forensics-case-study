package kotlinx.coroutines.sync;

import com.tom_roush.fontbox.ttf.HeaderTable;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.DebugProbes;
import kotlin.jvm.Volatile;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CancellableContinuationKt;
import kotlinx.coroutines.Waiter;
import kotlinx.coroutines.internal.ConcurrentLinkedListKt;
import kotlinx.coroutines.internal.Segment;
import kotlinx.coroutines.internal.SegmentOrClosed;
import kotlinx.coroutines.internal.Symbol;
import kotlinx.coroutines.selects.SelectInstance;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0010\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\u000b\u001a\u00020\nH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u000b\u001a\u00020\n2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\rH\u0005¢\u0006\u0004\b\u000b\u0010\u000fJ%\u0010\u0014\u001a\u00020\n2\n\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0004¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0013\u0010\u0018\u001a\u00020\nH\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\fJ\u000f\u0010\u0019\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001b\u0010\u0017J\u0017\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u001f\u0010\tJ\u0013\u0010 \u001a\u00020\u0007*\u00020\u0012H\u0002¢\u0006\u0004\b \u0010!R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R \u0010'\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\n0$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010&R\u0014\u0010)\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b(\u0010\u001aR\u000b\u0010+\u001a\u00020*8\u0002X\u0082\u0004R\u000b\u0010-\u001a\u00020,8\u0002X\u0082\u0004R\u000b\u0010.\u001a\u00020,8\u0002X\u0082\u0004R\u0011\u00101\u001a\b\u0012\u0004\u0012\u0002000/8\u0002X\u0082\u0004R\u0011\u00102\u001a\b\u0012\u0004\u0012\u0002000/8\u0002X\u0082\u0004\u0082\u0002\u0004\n\u0002\b\u0019¨\u00063"}, m28850d2 = {"Lkotlinx/coroutines/sync/SemaphoreImpl;", "Lkotlinx/coroutines/sync/Semaphore;", "", "permits", "acquiredPermits", "<init>", "(II)V", "", "tryAcquire", "()Z", "", "acquire", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlinx/coroutines/CancellableContinuation;", "waiter", "(Lkotlinx/coroutines/CancellableContinuation;)V", "Lkotlinx/coroutines/selects/SelectInstance;", "select", "", "ignoredParam", "onAcquireRegFunction", "(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", "release", "()V", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "e", "()I", "d", "Lkotlinx/coroutines/Waiter;", OperatorName.CURVE_TO, "(Lkotlinx/coroutines/Waiter;)Z", OperatorName.NON_STROKING_GRAY, OperatorName.FILL_NON_ZERO, "(Ljava/lang/Object;)Z", PDPageLabelRange.STYLE_LETTERS_LOWER, "I", "Lkotlin/Function1;", "", "Lkotlin/jvm/functions/Function1;", "onCancellationRelease", "getAvailablePermits", "availablePermits", "Lkotlinx/atomicfu/AtomicInt;", "_availablePermits", "Lkotlinx/atomicfu/AtomicLong;", "deqIdx", "enqIdx", "Lkotlinx/atomicfu/AtomicRef;", "LGF1;", HeaderTable.TAG, "tail", "kotlinx-coroutines-core"}, m28849k = 1, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSemaphore.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Semaphore.kt\nkotlinx/coroutines/sync/SemaphoreImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n+ 4 ConcurrentLinkedList.kt\nkotlinx/coroutines/internal/ConcurrentLinkedListKt\n+ 5 Semaphore.kt\nkotlinx/coroutines/sync/SemaphoreSegment\n*L\n1#1,397:1\n205#1,10:411\n205#1,10:421\n1#2:398\n332#3,12:399\n72#4,3:431\n46#4,8:434\n72#4,3:445\n46#4,8:448\n375#5:442\n375#5:443\n367#5:444\n378#5:456\n367#5:457\n375#5:458\n*S KotlinDebug\n*F\n+ 1 Semaphore.kt\nkotlinx/coroutines/sync/SemaphoreImpl\n*L\n197#1:411,10\n221#1:421,10\n187#1:399,12\n289#1:431,3\n289#1:434,8\n322#1:445,3\n322#1:448,8\n293#1:442\n299#1:443\n313#1:444\n328#1:456\n334#1:457\n337#1:458\n*E\n"})
/* loaded from: classes6.dex */
public class SemaphoreImpl implements Semaphore {

    /* renamed from: c */
    public static final AtomicReferenceFieldUpdater f71105c = AtomicReferenceFieldUpdater.newUpdater(SemaphoreImpl.class, Object.class, HeaderTable.TAG);

    /* renamed from: d */
    public static final AtomicLongFieldUpdater f71106d = AtomicLongFieldUpdater.newUpdater(SemaphoreImpl.class, "deqIdx");

    /* renamed from: e */
    public static final AtomicReferenceFieldUpdater f71107e = AtomicReferenceFieldUpdater.newUpdater(SemaphoreImpl.class, Object.class, "tail");

    /* renamed from: f */
    public static final AtomicLongFieldUpdater f71108f = AtomicLongFieldUpdater.newUpdater(SemaphoreImpl.class, "enqIdx");

    /* renamed from: g */
    public static final AtomicIntegerFieldUpdater f71109g = AtomicIntegerFieldUpdater.newUpdater(SemaphoreImpl.class, "_availablePermits");
    @Volatile
    private volatile int _availablePermits;

    /* renamed from: a */
    public final int f71110a;

    /* renamed from: b */
    public final Function1 f71111b;
    @Volatile
    private volatile long deqIdx;
    @Volatile
    private volatile long enqIdx;
    @Volatile
    @Nullable
    private volatile Object head;
    @Volatile
    @Nullable
    private volatile Object tail;

    public SemaphoreImpl(int i, int i2) {
        this.f71110a = i;
        if (i > 0) {
            if (i2 >= 0 && i2 <= i) {
                GF1 gf1 = new GF1(0L, null, 2);
                this.head = gf1;
                this.tail = gf1;
                this._availablePermits = i - i2;
                this.f71111b = new SemaphoreImpl$onCancellationRelease$1(this);
                return;
            }
            throw new IllegalArgumentException(("The number of acquired permits should be in 0.." + i).toString());
        }
        throw new IllegalArgumentException(("Semaphore should have at least 1 permit, but had " + i).toString());
    }

    /* renamed from: a */
    public static /* synthetic */ Object m26751a(SemaphoreImpl semaphoreImpl, Continuation continuation) {
        if (semaphoreImpl.m26747e() > 0) {
            return Unit.INSTANCE;
        }
        Object m26750b = semaphoreImpl.m26750b(continuation);
        if (m26750b == AbstractC18812Yf0.getCOROUTINE_SUSPENDED()) {
            return m26750b;
        }
        return Unit.INSTANCE;
    }

    @Override // kotlinx.coroutines.sync.Semaphore
    @Nullable
    public Object acquire(@NotNull Continuation<? super Unit> continuation) {
        return m26751a(this, continuation);
    }

    /* renamed from: b */
    public final Object m26750b(Continuation continuation) {
        CancellableContinuationImpl orCreateCancellableContinuation = CancellableContinuationKt.getOrCreateCancellableContinuation(IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation));
        try {
            if (!m26749c(orCreateCancellableContinuation)) {
                acquire((CancellableContinuation<? super Unit>) orCreateCancellableContinuation);
            }
            Object result = orCreateCancellableContinuation.getResult();
            if (result == AbstractC18812Yf0.getCOROUTINE_SUSPENDED()) {
                DebugProbes.probeCoroutineSuspended(continuation);
            }
            if (result == AbstractC18812Yf0.getCOROUTINE_SUSPENDED()) {
                return result;
            }
            return Unit.INSTANCE;
        } catch (Throwable th2) {
            orCreateCancellableContinuation.releaseClaimedReusableContinuation$kotlinx_coroutines_core();
            throw th2;
        }
    }

    /* renamed from: c */
    public final boolean m26749c(Waiter waiter) {
        int i;
        Object findSegmentInternal;
        int i2;
        Symbol symbol;
        Symbol symbol2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f71107e;
        GF1 gf1 = (GF1) atomicReferenceFieldUpdater.get(this);
        long andIncrement = f71108f.getAndIncrement(this);
        SemaphoreImpl$addAcquireToQueue$createNewSegment$1 semaphoreImpl$addAcquireToQueue$createNewSegment$1 = SemaphoreImpl$addAcquireToQueue$createNewSegment$1.INSTANCE;
        i = SemaphoreKt.f71117f;
        long j = andIncrement / i;
        loop0: while (true) {
            findSegmentInternal = ConcurrentLinkedListKt.findSegmentInternal(gf1, j, semaphoreImpl$addAcquireToQueue$createNewSegment$1);
            if (!SegmentOrClosed.m74716isClosedimpl(findSegmentInternal)) {
                Segment m74714getSegmentimpl = SegmentOrClosed.m74714getSegmentimpl(findSegmentInternal);
                while (true) {
                    Segment segment = (Segment) atomicReferenceFieldUpdater.get(this);
                    if (segment.f71019id >= m74714getSegmentimpl.f71019id) {
                        break loop0;
                    } else if (!m74714getSegmentimpl.tryIncPointers$kotlinx_coroutines_core()) {
                        break;
                    } else if (AbstractC13055p0.m23740a(atomicReferenceFieldUpdater, this, segment, m74714getSegmentimpl)) {
                        if (segment.decPointers$kotlinx_coroutines_core()) {
                            segment.remove();
                        }
                    } else if (m74714getSegmentimpl.decPointers$kotlinx_coroutines_core()) {
                        m74714getSegmentimpl.remove();
                    }
                }
            } else {
                break;
            }
        }
        GF1 gf12 = (GF1) SegmentOrClosed.m74714getSegmentimpl(findSegmentInternal);
        i2 = SemaphoreKt.f71117f;
        int i3 = (int) (andIncrement % i2);
        if (!AbstractC21408oN1.m25928a(gf12.m68280d(), i3, null, waiter)) {
            symbol = SemaphoreKt.f71113b;
            symbol2 = SemaphoreKt.f71114c;
            if (AbstractC21408oN1.m25928a(gf12.m68280d(), i3, symbol, symbol2)) {
                if (waiter instanceof CancellableContinuation) {
                    Intrinsics.checkNotNull(waiter, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
                    ((CancellableContinuation) waiter).resume(Unit.INSTANCE, this.f71111b);
                } else if (waiter instanceof SelectInstance) {
                    ((SelectInstance) waiter).selectInRegistrationPhase(Unit.INSTANCE);
                } else {
                    throw new IllegalStateException(("unexpected: " + waiter).toString());
                }
                return true;
            }
            return false;
        }
        waiter.invokeOnCancellation(gf12, i3);
        return true;
    }

    /* renamed from: d */
    public final void m26748d() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i;
        int i2;
        do {
            atomicIntegerFieldUpdater = f71109g;
            i = atomicIntegerFieldUpdater.get(this);
            i2 = this.f71110a;
            if (i <= i2) {
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, i2));
    }

    /* renamed from: e */
    public final int m26747e() {
        int andDecrement;
        do {
            andDecrement = f71109g.getAndDecrement(this);
        } while (andDecrement > this.f71110a);
        return andDecrement;
    }

    /* renamed from: f */
    public final boolean m26746f(Object obj) {
        if (obj instanceof CancellableContinuation) {
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
            CancellableContinuation cancellableContinuation = (CancellableContinuation) obj;
            Object tryResume = cancellableContinuation.tryResume(Unit.INSTANCE, null, this.f71111b);
            if (tryResume != null) {
                cancellableContinuation.completeResume(tryResume);
                return true;
            }
            return false;
        } else if (obj instanceof SelectInstance) {
            return ((SelectInstance) obj).trySelect(this, Unit.INSTANCE);
        } else {
            throw new IllegalStateException(("unexpected: " + obj).toString());
        }
    }

    /* renamed from: g */
    public final boolean m26745g() {
        int i;
        Object findSegmentInternal;
        int i2;
        Symbol symbol;
        Symbol symbol2;
        int i3;
        Symbol symbol3;
        Symbol symbol4;
        Symbol symbol5;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f71105c;
        GF1 gf1 = (GF1) atomicReferenceFieldUpdater.get(this);
        long andIncrement = f71106d.getAndIncrement(this);
        i = SemaphoreKt.f71117f;
        long j = andIncrement / i;
        SemaphoreImpl$tryResumeNextFromQueue$createNewSegment$1 semaphoreImpl$tryResumeNextFromQueue$createNewSegment$1 = SemaphoreImpl$tryResumeNextFromQueue$createNewSegment$1.INSTANCE;
        loop0: while (true) {
            findSegmentInternal = ConcurrentLinkedListKt.findSegmentInternal(gf1, j, semaphoreImpl$tryResumeNextFromQueue$createNewSegment$1);
            if (SegmentOrClosed.m74716isClosedimpl(findSegmentInternal)) {
                break;
            }
            Segment m74714getSegmentimpl = SegmentOrClosed.m74714getSegmentimpl(findSegmentInternal);
            while (true) {
                Segment segment = (Segment) atomicReferenceFieldUpdater.get(this);
                if (segment.f71019id >= m74714getSegmentimpl.f71019id) {
                    break loop0;
                } else if (!m74714getSegmentimpl.tryIncPointers$kotlinx_coroutines_core()) {
                    break;
                } else if (AbstractC13055p0.m23740a(atomicReferenceFieldUpdater, this, segment, m74714getSegmentimpl)) {
                    if (segment.decPointers$kotlinx_coroutines_core()) {
                        segment.remove();
                    }
                } else if (m74714getSegmentimpl.decPointers$kotlinx_coroutines_core()) {
                    m74714getSegmentimpl.remove();
                }
            }
        }
        GF1 gf12 = (GF1) SegmentOrClosed.m74714getSegmentimpl(findSegmentInternal);
        gf12.cleanPrev();
        if (gf12.f71019id <= j) {
            i2 = SemaphoreKt.f71117f;
            int i4 = (int) (andIncrement % i2);
            symbol = SemaphoreKt.f71113b;
            Object andSet = gf12.m68280d().getAndSet(i4, symbol);
            if (andSet == null) {
                i3 = SemaphoreKt.f71112a;
                for (int i5 = 0; i5 < i3; i5++) {
                    Object obj = gf12.m68280d().get(i4);
                    symbol5 = SemaphoreKt.f71114c;
                    if (obj == symbol5) {
                        return true;
                    }
                }
                symbol3 = SemaphoreKt.f71113b;
                symbol4 = SemaphoreKt.f71115d;
                return !AbstractC21408oN1.m25928a(gf12.m68280d(), i4, symbol3, symbol4);
            }
            symbol2 = SemaphoreKt.f71116e;
            if (andSet == symbol2) {
                return false;
            }
            return m26746f(andSet);
        }
        return false;
    }

    @Override // kotlinx.coroutines.sync.Semaphore
    public int getAvailablePermits() {
        return Math.max(f71109g.get(this), 0);
    }

    public final void onAcquireRegFunction(@NotNull SelectInstance<?> selectInstance, @Nullable Object obj) {
        while (m26747e() <= 0) {
            Intrinsics.checkNotNull(selectInstance, "null cannot be cast to non-null type kotlinx.coroutines.Waiter");
            if (m26749c((Waiter) selectInstance)) {
                return;
            }
        }
        selectInstance.selectInRegistrationPhase(Unit.INSTANCE);
    }

    @Override // kotlinx.coroutines.sync.Semaphore
    public void release() {
        do {
            int andIncrement = f71109g.getAndIncrement(this);
            if (andIncrement < this.f71110a) {
                if (andIncrement >= 0) {
                    return;
                }
            } else {
                m26748d();
                throw new IllegalStateException(("The number of released permits cannot be greater than " + this.f71110a).toString());
            }
        } while (!m26745g());
    }

    @Override // kotlinx.coroutines.sync.Semaphore
    public boolean tryAcquire() {
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f71109g;
            int i = atomicIntegerFieldUpdater.get(this);
            if (i > this.f71110a) {
                m26748d();
            } else if (i <= 0) {
                return false;
            } else {
                if (atomicIntegerFieldUpdater.compareAndSet(this, i, i - 1)) {
                    return true;
                }
            }
        }
    }

    public final void acquire(@NotNull CancellableContinuation<? super Unit> cancellableContinuation) {
        while (m26747e() <= 0) {
            Intrinsics.checkNotNull(cancellableContinuation, "null cannot be cast to non-null type kotlinx.coroutines.Waiter");
            if (m26749c((Waiter) cancellableContinuation)) {
                return;
            }
        }
        cancellableContinuation.resume(Unit.INSTANCE, this.f71111b);
    }
}
