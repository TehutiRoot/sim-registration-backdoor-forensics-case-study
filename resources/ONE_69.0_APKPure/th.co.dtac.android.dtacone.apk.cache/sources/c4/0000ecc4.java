package p000;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.RuntimeExecutionException;
import com.google.android.gms.tasks.Task;

/* renamed from: og2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC21514og2 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ Task f72848a;

    /* renamed from: b */
    public final /* synthetic */ C21001li2 f72849b;

    public RunnableC21514og2(C21001li2 c21001li2, Task task) {
        this.f72849b = c21001li2;
        this.f72848a = task;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C22675vL2 c22675vL2;
        C22675vL2 c22675vL22;
        C22675vL2 c22675vL23;
        Continuation continuation;
        C22675vL2 c22675vL24;
        C22675vL2 c22675vL25;
        if (this.f72848a.isCanceled()) {
            c22675vL25 = this.f72849b.f71785c;
            c22675vL25.m917c();
            return;
        }
        try {
            continuation = this.f72849b.f71784b;
            Object then = continuation.then(this.f72848a);
            c22675vL24 = this.f72849b.f71785c;
            c22675vL24.m918b(then);
        } catch (RuntimeExecutionException e) {
            if (e.getCause() instanceof Exception) {
                c22675vL23 = this.f72849b.f71785c;
                c22675vL23.m919a((Exception) e.getCause());
                return;
            }
            c22675vL22 = this.f72849b.f71785c;
            c22675vL22.m919a(e);
        } catch (Exception e2) {
            c22675vL2 = this.f72849b.f71785c;
            c22675vL2.m919a(e2);
        }
    }
}