package p000;

import java.util.concurrent.CancellationException;
import java.util.concurrent.CompletableFuture;
import java.util.function.BiFunction;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.AbstractCoroutine;
import kotlinx.coroutines.Job;

/* renamed from: Du */
/* loaded from: classes6.dex */
public final class C0284Du extends AbstractCoroutine implements BiFunction {

    /* renamed from: d */
    public final CompletableFuture f1138d;

    public C0284Du(CoroutineContext coroutineContext, CompletableFuture completableFuture) {
        super(coroutineContext, true, true);
        this.f1138d = completableFuture;
    }

    /* renamed from: I */
    public void m68581I(Object obj, Throwable th2) {
        Job.DefaultImpls.cancel$default((Job) this, (CancellationException) null, 1, (Object) null);
    }

    @Override // java.util.function.BiFunction
    public /* bridge */ /* synthetic */ Object apply(Object obj, Object obj2) {
        m68581I(obj, (Throwable) obj2);
        return Unit.INSTANCE;
    }

    @Override // kotlinx.coroutines.AbstractCoroutine
    public void onCancelled(Throwable th2, boolean z) {
        this.f1138d.completeExceptionally(th2);
    }

    @Override // kotlinx.coroutines.AbstractCoroutine
    public void onCompleted(Object obj) {
        this.f1138d.complete(obj);
    }
}
