package p000;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.RuntimeExecutionException;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskExecutors;
import java.util.concurrent.Executor;

/* renamed from: nk2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC21293nk2 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ Task f72441a;

    /* renamed from: b */
    public final /* synthetic */ Pm2 f72442b;

    public RunnableC21293nk2(Pm2 pm2, Task task) {
        this.f72442b = pm2;
        this.f72441a = task;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C23121yK2 c23121yK2;
        C23121yK2 c23121yK22;
        C23121yK2 c23121yK23;
        Continuation continuation;
        try {
            continuation = this.f72442b.f4843b;
            Task task = (Task) continuation.then(this.f72441a);
            if (task == null) {
                this.f72442b.onFailure(new NullPointerException("Continuation returned null"));
                return;
            }
            Pm2 pm2 = this.f72442b;
            Executor executor = TaskExecutors.f48591a;
            task.addOnSuccessListener(executor, pm2);
            task.addOnFailureListener(executor, this.f72442b);
            task.addOnCanceledListener(executor, this.f72442b);
        } catch (RuntimeExecutionException e) {
            if (e.getCause() instanceof Exception) {
                c23121yK23 = this.f72442b.f4844c;
                c23121yK23.m287a((Exception) e.getCause());
                return;
            }
            c23121yK22 = this.f72442b.f4844c;
            c23121yK22.m287a(e);
        } catch (Exception e2) {
            c23121yK2 = this.f72442b.f4844c;
            c23121yK2.m287a(e2);
        }
    }
}
