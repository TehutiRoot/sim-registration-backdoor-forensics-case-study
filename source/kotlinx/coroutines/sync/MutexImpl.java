package kotlinx.coroutines.sync;

import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.DebugProbes;
import kotlin.jvm.Volatile;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CancellableContinuationKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.DebugStringsKt;
import kotlinx.coroutines.DisposableHandle;
import kotlinx.coroutines.Waiter;
import kotlinx.coroutines.internal.Segment;
import kotlinx.coroutines.internal.Symbol;
import kotlinx.coroutines.selects.SelectClause2;
import kotlinx.coroutines.selects.SelectClause2Impl;
import kotlinx.coroutines.selects.SelectInstance;
import kotlinx.coroutines.selects.SelectInstanceInternal;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.util.Constant;

@Metadata(m28851d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0010\u0018\u00002\u00020\u00012\u00020\u0002:\u000234B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\f\u001a\u00020\u000b2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0096@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u000e\u001a\u00020\u00032\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\u000e\u0010\nJ\u0019\u0010\u000f\u001a\u00020\u000b2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J%\u0010\u0013\u001a\u00020\u000b2\n\u0010\u0012\u001a\u0006\u0012\u0002\b\u00030\u00112\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0014¢\u0006\u0004\b\u0013\u0010\u0014J%\u0010\u0016\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\u0015\u001a\u0004\u0018\u00010\u0007H\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u001d\u0010\u001b\u001a\u00020\u000b2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\rJ\u0019\u0010\u001d\u001a\u00020\u001c2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\u001d\u0010\u001eRq\u0010)\u001a_\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030\u0011¢\u0006\f\b \u0012\b\b!\u0012\u0004\b\b(\u0012\u0012\u0015\u0012\u0013\u0018\u00010\u0007¢\u0006\f\b \u0012\b\b!\u0012\u0004\b\b(\"\u0012\u0015\u0012\u0013\u0018\u00010\u0007¢\u0006\f\b \u0012\b\b!\u0012\u0004\b\b(#\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\u000b0$0\u001fj\u0002`&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R(\u0010/\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0004\u0012\u00020\u00020*8VX\u0096\u0004¢\u0006\f\u0012\u0004\b-\u0010.\u001a\u0004\b+\u0010,R\u0014\u00100\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b0\u00101R\u0013\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u0007028\u0002X\u0082\u0004\u0082\u0002\u0004\n\u0002\b\u0019¨\u00065"}, m28850d2 = {"Lkotlinx/coroutines/sync/MutexImpl;", "Lkotlinx/coroutines/sync/SemaphoreImpl;", "Lkotlinx/coroutines/sync/Mutex;", "", "locked", "<init>", "(Z)V", "", Constant.REGISTER_LEVEL_OWNER, "holdsLock", "(Ljava/lang/Object;)Z", "", "lock", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "tryLock", "unlock", "(Ljava/lang/Object;)V", "Lkotlinx/coroutines/selects/SelectInstance;", "select", "onLockRegFunction", "(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", "result", "onLockProcessResult", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "", "toString", "()Ljava/lang/String;", "i", "", OperatorName.SET_LINE_JOINSTYLE, "(Ljava/lang/Object;)I", "Lkotlin/Function3;", "Lkotlin/ParameterName;", "name", "param", "internalResult", "Lkotlin/Function1;", "", "Lkotlinx/coroutines/selects/OnCancellationConstructor;", OperatorName.CLOSE_PATH, "Lkotlin/jvm/functions/Function3;", "onSelectCancellationUnlockConstructor", "Lkotlinx/coroutines/selects/SelectClause2;", "getOnLock", "()Lkotlinx/coroutines/selects/SelectClause2;", "getOnLock$annotations", "()V", "onLock", "isLocked", "()Z", "Lkotlinx/atomicfu/AtomicRef;", "CancellableContinuationWithOwner", PDPageLabelRange.STYLE_LETTERS_LOWER, "kotlinx-coroutines-core"}, m28849k = 1, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nMutex.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Mutex.kt\nkotlinx/coroutines/sync/MutexImpl\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,300:1\n332#2,12:301\n1#3:313\n*S KotlinDebug\n*F\n+ 1 Mutex.kt\nkotlinx/coroutines/sync/MutexImpl\n*L\n168#1:301,12\n*E\n"})
/* loaded from: classes6.dex */
public class MutexImpl extends SemaphoreImpl implements Mutex {

    /* renamed from: i */
    public static final AtomicReferenceFieldUpdater f71095i = AtomicReferenceFieldUpdater.newUpdater(MutexImpl.class, Object.class, Constant.REGISTER_LEVEL_OWNER);

    /* renamed from: h */
    public final Function3 f71096h;
    @Volatile
    @Nullable
    private volatile Object owner;

    /* loaded from: classes6.dex */
    public final class CancellableContinuationWithOwner implements CancellableContinuation, Waiter {

        /* renamed from: a */
        public final CancellableContinuationImpl f71097a;

        /* renamed from: b */
        public final Object f71098b;

        public CancellableContinuationWithOwner(CancellableContinuationImpl cancellableContinuationImpl, Object obj) {
            this.f71097a = cancellableContinuationImpl;
            this.f71098b = obj;
        }

        @Override // kotlinx.coroutines.CancellableContinuation
        /* renamed from: a */
        public void resume(Unit unit, Function1 function1) {
            MutexImpl.f71095i.set(MutexImpl.this, this.f71098b);
            this.f71097a.resume(unit, new MutexImpl$CancellableContinuationWithOwner$resume$2(MutexImpl.this, this));
        }

        @Override // kotlinx.coroutines.CancellableContinuation
        /* renamed from: b */
        public void resumeUndispatched(CoroutineDispatcher coroutineDispatcher, Unit unit) {
            this.f71097a.resumeUndispatched(coroutineDispatcher, unit);
        }

        @Override // kotlinx.coroutines.CancellableContinuation
        /* renamed from: c */
        public Object tryResume(Unit unit, Object obj) {
            return this.f71097a.tryResume(unit, obj);
        }

        @Override // kotlinx.coroutines.CancellableContinuation
        public boolean cancel(Throwable th2) {
            return this.f71097a.cancel(th2);
        }

        @Override // kotlinx.coroutines.CancellableContinuation
        public void completeResume(Object obj) {
            this.f71097a.completeResume(obj);
        }

        @Override // kotlinx.coroutines.CancellableContinuation
        /* renamed from: d */
        public Object tryResume(Unit unit, Object obj, Function1 function1) {
            Object tryResume = this.f71097a.tryResume(unit, obj, new MutexImpl$CancellableContinuationWithOwner$tryResume$token$1(MutexImpl.this, this));
            if (tryResume != null) {
                MutexImpl.f71095i.set(MutexImpl.this, this.f71098b);
            }
            return tryResume;
        }

        @Override // kotlin.coroutines.Continuation
        public CoroutineContext getContext() {
            return this.f71097a.getContext();
        }

        @Override // kotlinx.coroutines.CancellableContinuation
        public void initCancellability() {
            this.f71097a.initCancellability();
        }

        @Override // kotlinx.coroutines.CancellableContinuation
        public void invokeOnCancellation(Function1 function1) {
            this.f71097a.invokeOnCancellation(function1);
        }

        @Override // kotlinx.coroutines.CancellableContinuation
        public boolean isActive() {
            return this.f71097a.isActive();
        }

        @Override // kotlinx.coroutines.CancellableContinuation
        public boolean isCancelled() {
            return this.f71097a.isCancelled();
        }

        @Override // kotlinx.coroutines.CancellableContinuation
        public boolean isCompleted() {
            return this.f71097a.isCompleted();
        }

        @Override // kotlinx.coroutines.CancellableContinuation
        public void resumeUndispatchedWithException(CoroutineDispatcher coroutineDispatcher, Throwable th2) {
            this.f71097a.resumeUndispatchedWithException(coroutineDispatcher, th2);
        }

        @Override // kotlin.coroutines.Continuation
        public void resumeWith(Object obj) {
            this.f71097a.resumeWith(obj);
        }

        @Override // kotlinx.coroutines.CancellableContinuation
        public Object tryResumeWithException(Throwable th2) {
            return this.f71097a.tryResumeWithException(th2);
        }

        @Override // kotlinx.coroutines.Waiter
        public void invokeOnCancellation(Segment segment, int i) {
            this.f71097a.invokeOnCancellation(segment, i);
        }
    }

    /* renamed from: kotlinx.coroutines.sync.MutexImpl$a */
    /* loaded from: classes6.dex */
    public final class C12153a implements SelectInstanceInternal {

        /* renamed from: a */
        public final SelectInstanceInternal f71100a;

        /* renamed from: b */
        public final Object f71101b;

        public C12153a(SelectInstanceInternal selectInstanceInternal, Object obj) {
            this.f71100a = selectInstanceInternal;
            this.f71101b = obj;
        }

        @Override // kotlinx.coroutines.selects.SelectInstance
        public void disposeOnCompletion(DisposableHandle disposableHandle) {
            this.f71100a.disposeOnCompletion(disposableHandle);
        }

        @Override // kotlinx.coroutines.selects.SelectInstance
        public CoroutineContext getContext() {
            return this.f71100a.getContext();
        }

        @Override // kotlinx.coroutines.Waiter
        public void invokeOnCancellation(Segment segment, int i) {
            this.f71100a.invokeOnCancellation(segment, i);
        }

        @Override // kotlinx.coroutines.selects.SelectInstance
        public void selectInRegistrationPhase(Object obj) {
            MutexImpl.f71095i.set(MutexImpl.this, this.f71101b);
            this.f71100a.selectInRegistrationPhase(obj);
        }

        @Override // kotlinx.coroutines.selects.SelectInstance
        public boolean trySelect(Object obj, Object obj2) {
            boolean trySelect = this.f71100a.trySelect(obj, obj2);
            MutexImpl mutexImpl = MutexImpl.this;
            if (trySelect) {
                MutexImpl.f71095i.set(mutexImpl, this.f71101b);
            }
            return trySelect;
        }
    }

    public MutexImpl(boolean z) {
        super(1, z ? 1 : 0);
        Symbol symbol;
        if (!z) {
            symbol = MutexKt.f71103a;
        } else {
            symbol = null;
        }
        this.owner = symbol;
        this.f71096h = new MutexImpl$onSelectCancellationUnlockConstructor$1(this);
    }

    public static /* synthetic */ void getOnLock$annotations() {
    }

    /* renamed from: h */
    public static /* synthetic */ Object m26758h(MutexImpl mutexImpl, Object obj, Continuation continuation) {
        if (mutexImpl.tryLock(obj)) {
            return Unit.INSTANCE;
        }
        Object m26757i = mutexImpl.m26757i(obj, continuation);
        if (m26757i == AbstractC18812Yf0.getCOROUTINE_SUSPENDED()) {
            return m26757i;
        }
        return Unit.INSTANCE;
    }

    @Override // kotlinx.coroutines.sync.Mutex
    @NotNull
    public SelectClause2<Object, Mutex> getOnLock() {
        MutexImpl$onLock$1 mutexImpl$onLock$1 = MutexImpl$onLock$1.INSTANCE;
        Intrinsics.checkNotNull(mutexImpl$onLock$1, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = 'clauseObject')] kotlin.Any, @[ParameterName(name = 'select')] kotlinx.coroutines.selects.SelectInstance<*>, @[ParameterName(name = 'param')] kotlin.Any?, kotlin.Unit>{ kotlinx.coroutines.selects.SelectKt.RegistrationFunction }");
        MutexImpl$onLock$2 mutexImpl$onLock$2 = MutexImpl$onLock$2.INSTANCE;
        Intrinsics.checkNotNull(mutexImpl$onLock$2, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = 'clauseObject')] kotlin.Any, @[ParameterName(name = 'param')] kotlin.Any?, @[ParameterName(name = 'clauseResult')] kotlin.Any?, kotlin.Any?>{ kotlinx.coroutines.selects.SelectKt.ProcessResultFunction }");
        return new SelectClause2Impl(this, (Function3) TypeIntrinsics.beforeCheckcastToFunctionOfArity(mutexImpl$onLock$1, 3), (Function3) TypeIntrinsics.beforeCheckcastToFunctionOfArity(mutexImpl$onLock$2, 3), this.f71096h);
    }

    @Override // kotlinx.coroutines.sync.Mutex
    public boolean holdsLock(@NotNull Object obj) {
        Symbol symbol;
        while (isLocked()) {
            Object obj2 = f71095i.get(this);
            symbol = MutexKt.f71103a;
            if (obj2 != symbol) {
                if (obj2 != obj) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    /* renamed from: i */
    public final Object m26757i(Object obj, Continuation continuation) {
        CancellableContinuationImpl orCreateCancellableContinuation = CancellableContinuationKt.getOrCreateCancellableContinuation(IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation));
        try {
            acquire((CancellableContinuation<? super Unit>) new CancellableContinuationWithOwner(orCreateCancellableContinuation, obj));
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

    @Override // kotlinx.coroutines.sync.Mutex
    public boolean isLocked() {
        if (getAvailablePermits() == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: j */
    public final int m26756j(Object obj) {
        while (!tryAcquire()) {
            if (obj != null) {
                if (holdsLock(obj)) {
                    return 2;
                }
                if (isLocked()) {
                    return 1;
                }
            } else {
                return 1;
            }
        }
        f71095i.set(this, obj);
        return 0;
    }

    @Override // kotlinx.coroutines.sync.Mutex
    @Nullable
    public Object lock(@Nullable Object obj, @NotNull Continuation<? super Unit> continuation) {
        return m26758h(this, obj, continuation);
    }

    @Nullable
    public Object onLockProcessResult(@Nullable Object obj, @Nullable Object obj2) {
        Symbol symbol;
        symbol = MutexKt.f71104b;
        if (!Intrinsics.areEqual(obj2, symbol)) {
            return this;
        }
        throw new IllegalStateException(("This mutex is already locked by the specified owner: " + obj).toString());
    }

    public void onLockRegFunction(@NotNull SelectInstance<?> selectInstance, @Nullable Object obj) {
        Symbol symbol;
        if (obj != null && holdsLock(obj)) {
            symbol = MutexKt.f71104b;
            selectInstance.selectInRegistrationPhase(symbol);
            return;
        }
        Intrinsics.checkNotNull(selectInstance, "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectInstanceInternal<*>");
        onAcquireRegFunction(new C12153a((SelectInstanceInternal) selectInstance, obj), obj);
    }

    @NotNull
    public String toString() {
        return "Mutex@" + DebugStringsKt.getHexAddress(this) + "[isLocked=" + isLocked() + ",owner=" + f71095i.get(this) + AbstractJsonLexerKt.END_LIST;
    }

    @Override // kotlinx.coroutines.sync.Mutex
    public boolean tryLock(@Nullable Object obj) {
        int m26756j = m26756j(obj);
        if (m26756j == 0) {
            return true;
        }
        if (m26756j != 1) {
            if (m26756j != 2) {
                throw new IllegalStateException("unexpected".toString());
            }
            throw new IllegalStateException(("This mutex is already locked by the specified owner: " + obj).toString());
        }
        return false;
    }

    @Override // kotlinx.coroutines.sync.Mutex
    public void unlock(@Nullable Object obj) {
        Symbol symbol;
        Symbol symbol2;
        while (isLocked()) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f71095i;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            symbol = MutexKt.f71103a;
            if (obj2 != symbol) {
                if (obj2 == obj || obj == null) {
                    symbol2 = MutexKt.f71103a;
                    if (AbstractC13055p0.m23740a(atomicReferenceFieldUpdater, this, obj2, symbol2)) {
                        release();
                        return;
                    }
                } else {
                    throw new IllegalStateException(("This mutex is locked by " + obj2 + ", but " + obj + " is expected").toString());
                }
            }
        }
        throw new IllegalStateException("This mutex is not locked".toString());
    }
}
