package p000;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.RuntimeExecutionException;
import com.google.android.gms.tasks.Task;

/* renamed from: rf2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC21966rf2 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ Task f77360a;

    /* renamed from: b */
    public final /* synthetic */ C21456oh2 f77361b;

    public RunnableC21966rf2(C21456oh2 c21456oh2, Task task) {
        this.f77361b = c21456oh2;
        this.f77360a = task;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C23121yK2 c23121yK2;
        C23121yK2 c23121yK22;
        C23121yK2 c23121yK23;
        Continuation continuation;
        C23121yK2 c23121yK24;
        C23121yK2 c23121yK25;
        if (this.f77360a.isCanceled()) {
            c23121yK25 = this.f77361b.f72772c;
            c23121yK25.m285c();
            return;
        }
        try {
            continuation = this.f77361b.f72771b;
            Object then = continuation.then(this.f77360a);
            c23121yK24 = this.f77361b.f72772c;
            c23121yK24.m286b(then);
        } catch (RuntimeExecutionException e) {
            if (e.getCause() instanceof Exception) {
                c23121yK23 = this.f77361b.f72772c;
                c23121yK23.m287a((Exception) e.getCause());
                return;
            }
            c23121yK22 = this.f77361b.f72772c;
            c23121yK22.m287a(e);
        } catch (Exception e2) {
            c23121yK2 = this.f77361b.f72772c;
            c23121yK2.m287a(e2);
        }
    }
}
