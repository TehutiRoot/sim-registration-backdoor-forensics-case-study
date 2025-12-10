package p000;

import com.google.android.gms.tasks.RuntimeExecutionException;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskExecutors;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

/* renamed from: oI2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC21395oI2 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ Task f72664a;

    /* renamed from: b */
    public final /* synthetic */ FI2 f72665b;

    public RunnableC21395oI2(FI2 fi2, Task task) {
        this.f72665b = fi2;
        this.f72664a = task;
    }

    @Override // java.lang.Runnable
    public final void run() {
        SuccessContinuation successContinuation;
        try {
            successContinuation = this.f72665b.f1577b;
            Task then = successContinuation.then(this.f72664a.getResult());
            if (then == null) {
                this.f72665b.onFailure(new NullPointerException("Continuation returned null"));
                return;
            }
            FI2 fi2 = this.f72665b;
            Executor executor = TaskExecutors.f48591a;
            then.addOnSuccessListener(executor, fi2);
            then.addOnFailureListener(executor, this.f72665b);
            then.addOnCanceledListener(executor, this.f72665b);
        } catch (RuntimeExecutionException e) {
            if (e.getCause() instanceof Exception) {
                this.f72665b.onFailure((Exception) e.getCause());
            } else {
                this.f72665b.onFailure(e);
            }
        } catch (CancellationException unused) {
            this.f72665b.onCanceled();
        } catch (Exception e2) {
            this.f72665b.onFailure(e2);
        }
    }
}
