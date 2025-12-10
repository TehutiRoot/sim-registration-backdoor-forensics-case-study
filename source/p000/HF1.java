package p000;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.jvm.internal.DebugProbes;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlin.sequences.SequenceScope;

/* renamed from: HF1 */
/* loaded from: classes6.dex */
public final class HF1 extends SequenceScope implements Iterator, Continuation, KMappedMarker {

    /* renamed from: a */
    public int f2158a;

    /* renamed from: b */
    public Object f2159b;

    /* renamed from: c */
    public Iterator f2160c;

    /* renamed from: d */
    public Continuation f2161d;

    /* renamed from: a */
    public final Throwable m68113a() {
        int i = this.f2158a;
        if (i != 4) {
            if (i != 5) {
                return new IllegalStateException("Unexpected state of the iterator: " + this.f2158a);
            }
            return new IllegalStateException("Iterator has failed.");
        }
        return new NoSuchElementException();
    }

    /* renamed from: b */
    public final Object m68112b() {
        if (hasNext()) {
            return next();
        }
        throw new NoSuchElementException();
    }

    /* renamed from: c */
    public final void m68111c(Continuation continuation) {
        this.f2161d = continuation;
    }

    @Override // kotlin.coroutines.Continuation
    public CoroutineContext getContext() {
        return EmptyCoroutineContext.INSTANCE;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        while (true) {
            int i = this.f2158a;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2 || i == 3) {
                        return true;
                    }
                    if (i == 4) {
                        return false;
                    }
                    throw m68113a();
                }
                Iterator it = this.f2160c;
                Intrinsics.checkNotNull(it);
                if (it.hasNext()) {
                    this.f2158a = 2;
                    return true;
                }
                this.f2160c = null;
            }
            this.f2158a = 5;
            Continuation continuation = this.f2161d;
            Intrinsics.checkNotNull(continuation);
            this.f2161d = null;
            Result.Companion companion = Result.Companion;
            continuation.resumeWith(Result.m74087constructorimpl(Unit.INSTANCE));
        }
    }

    @Override // java.util.Iterator
    public Object next() {
        int i = this.f2158a;
        if (i != 0 && i != 1) {
            if (i != 2) {
                if (i == 3) {
                    this.f2158a = 0;
                    Object obj = this.f2159b;
                    this.f2159b = null;
                    return obj;
                }
                throw m68113a();
            }
            this.f2158a = 1;
            Iterator it = this.f2160c;
            Intrinsics.checkNotNull(it);
            return it.next();
        }
        return m68112b();
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // kotlin.coroutines.Continuation
    public void resumeWith(Object obj) {
        ResultKt.throwOnFailure(obj);
        this.f2158a = 4;
    }

    @Override // kotlin.sequences.SequenceScope
    public Object yield(Object obj, Continuation continuation) {
        this.f2159b = obj;
        this.f2158a = 3;
        this.f2161d = continuation;
        Object coroutine_suspended = AbstractC18812Yf0.getCOROUTINE_SUSPENDED();
        if (coroutine_suspended == AbstractC18812Yf0.getCOROUTINE_SUSPENDED()) {
            DebugProbes.probeCoroutineSuspended(continuation);
        }
        if (coroutine_suspended == AbstractC18812Yf0.getCOROUTINE_SUSPENDED()) {
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }

    @Override // kotlin.sequences.SequenceScope
    public Object yieldAll(Iterator it, Continuation continuation) {
        if (!it.hasNext()) {
            return Unit.INSTANCE;
        }
        this.f2160c = it;
        this.f2158a = 2;
        this.f2161d = continuation;
        Object coroutine_suspended = AbstractC18812Yf0.getCOROUTINE_SUSPENDED();
        if (coroutine_suspended == AbstractC18812Yf0.getCOROUTINE_SUSPENDED()) {
            DebugProbes.probeCoroutineSuspended(continuation);
        }
        if (coroutine_suspended == AbstractC18812Yf0.getCOROUTINE_SUSPENDED()) {
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }
}
