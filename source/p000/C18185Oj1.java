package p000;

import androidx.arch.core.util.Function;
import androidx.camera.core.impl.utils.Threads;
import androidx.camera.core.impl.utils.futures.Futures;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.core.util.Pair;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Objects;

/* renamed from: Oj1 */
/* loaded from: classes.dex */
public class C18185Oj1 {

    /* renamed from: a */
    public Pair f4478a;

    /* renamed from: a */
    public static /* synthetic */ Object m66991a(C18185Oj1 c18185Oj1, Object obj, CallbackToFutureAdapter.Completer completer) {
        return c18185Oj1.m66990b(obj, completer);
    }

    /* renamed from: b */
    public final /* synthetic */ Object m66990b(Object obj, CallbackToFutureAdapter.Completer completer) {
        Pair pair = this.f4478a;
        if (pair != null) {
            CallbackToFutureAdapter.Completer completer2 = (CallbackToFutureAdapter.Completer) pair.first;
            Objects.requireNonNull(completer2);
            completer2.setCancelled();
        }
        this.f4478a = new Pair(completer, obj);
        return "PendingValue " + obj;
    }

    /* renamed from: c */
    public void m66989c(Function function) {
        Threads.checkMainThread();
        Pair pair = this.f4478a;
        if (pair != null) {
            CallbackToFutureAdapter.Completer completer = (CallbackToFutureAdapter.Completer) this.f4478a.first;
            Objects.requireNonNull(completer);
            Futures.propagate((ListenableFuture) function.apply(pair.second), completer);
            this.f4478a = null;
        }
    }

    /* renamed from: d */
    public ListenableFuture m66988d(final Object obj) {
        Threads.checkMainThread();
        return CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver() { // from class: Nj1
            {
                C18185Oj1.this = this;
            }

            @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
            public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
                return C18185Oj1.m66991a(C18185Oj1.this, obj, completer);
            }
        });
    }
}
