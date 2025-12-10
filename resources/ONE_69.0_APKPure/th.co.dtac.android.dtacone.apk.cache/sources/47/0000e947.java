package p000;

import com.google.android.gms.tasks.RuntimeExecutionException;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskExecutors;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

/* renamed from: lJ2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC20939lJ2 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ Task f71689a;

    /* renamed from: b */
    public final /* synthetic */ CJ2 f71690b;

    public RunnableC20939lJ2(CJ2 cj2, Task task) {
        this.f71690b = cj2;
        this.f71689a = task;
    }

    @Override // java.lang.Runnable
    public final void run() {
        SuccessContinuation successContinuation;
        try {
            successContinuation = this.f71690b.f717b;
            Task then = successContinuation.then(this.f71689a.getResult());
            if (then == null) {
                this.f71690b.onFailure(new NullPointerException("Continuation returned null"));
                return;
            }
            CJ2 cj2 = this.f71690b;
            Executor executor = TaskExecutors.f48603a;
            then.addOnSuccessListener(executor, cj2);
            then.addOnFailureListener(executor, this.f71690b);
            then.addOnCanceledListener(executor, this.f71690b);
        } catch (RuntimeExecutionException e) {
            if (e.getCause() instanceof Exception) {
                this.f71690b.onFailure((Exception) e.getCause());
            } else {
                this.f71690b.onFailure(e);
            }
        } catch (CancellationException unused) {
            this.f71690b.onCanceled();
        } catch (Exception e2) {
            this.f71690b.onFailure(e2);
        }
    }
}