package p000;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.RuntimeExecutionException;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskExecutors;
import java.util.concurrent.Executor;

/* renamed from: kl2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC20837kl2 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ Task f68056a;

    /* renamed from: b */
    public final /* synthetic */ Mn2 f68057b;

    public RunnableC20837kl2(Mn2 mn2, Task task) {
        this.f68057b = mn2;
        this.f68056a = task;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C22675vL2 c22675vL2;
        C22675vL2 c22675vL22;
        C22675vL2 c22675vL23;
        Continuation continuation;
        try {
            continuation = this.f68057b.f3974b;
            Task task = (Task) continuation.then(this.f68056a);
            if (task == null) {
                this.f68057b.onFailure(new NullPointerException("Continuation returned null"));
                return;
            }
            Mn2 mn2 = this.f68057b;
            Executor executor = TaskExecutors.f48603a;
            task.addOnSuccessListener(executor, mn2);
            task.addOnFailureListener(executor, this.f68057b);
            task.addOnCanceledListener(executor, this.f68057b);
        } catch (RuntimeExecutionException e) {
            if (e.getCause() instanceof Exception) {
                c22675vL23 = this.f68057b.f3975c;
                c22675vL23.m919a((Exception) e.getCause());
                return;
            }
            c22675vL22 = this.f68057b.f3975c;
            c22675vL22.m919a(e);
        } catch (Exception e2) {
            c22675vL2 = this.f68057b.f3975c;
            c22675vL2.m919a(e2);
        }
    }
}