package p000;

import androidx.arch.core.util.Function;
import androidx.camera.core.impl.utils.Threads;
import androidx.camera.core.impl.utils.futures.Futures;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.core.util.Pair;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Objects;

/* renamed from: Lk1 */
/* loaded from: classes.dex */
public class C18030Lk1 {

    /* renamed from: a */
    public Pair f3676a;

    /* renamed from: a */
    public static /* synthetic */ Object m67514a(C18030Lk1 c18030Lk1, Object obj, CallbackToFutureAdapter.Completer completer) {
        return c18030Lk1.m67513b(obj, completer);
    }

    /* renamed from: b */
    public final /* synthetic */ Object m67513b(Object obj, CallbackToFutureAdapter.Completer completer) {
        Pair pair = this.f3676a;
        if (pair != null) {
            CallbackToFutureAdapter.Completer completer2 = (CallbackToFutureAdapter.Completer) pair.first;
            Objects.requireNonNull(completer2);
            completer2.setCancelled();
        }
        this.f3676a = new Pair(completer, obj);
        return "PendingValue " + obj;
    }

    /* renamed from: c */
    public void m67512c(Function function) {
        Threads.checkMainThread();
        Pair pair = this.f3676a;
        if (pair != null) {
            CallbackToFutureAdapter.Completer completer = (CallbackToFutureAdapter.Completer) this.f3676a.first;
            Objects.requireNonNull(completer);
            Futures.propagate((ListenableFuture) function.apply(pair.second), completer);
            this.f3676a = null;
        }
    }

    /* renamed from: d */
    public ListenableFuture m67511d(final Object obj) {
        Threads.checkMainThread();
        return CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver() { // from class: Kk1
            @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
            public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
                return C18030Lk1.m67514a(C18030Lk1.this, obj, completer);
            }
        });
    }
}