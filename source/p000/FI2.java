package p000;

import com.google.android.gms.tasks.OnCanceledListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.Executor;

/* renamed from: FI2 */
/* loaded from: classes4.dex */
public final class FI2 implements OnSuccessListener, OnFailureListener, OnCanceledListener, QI2 {

    /* renamed from: a */
    public final Executor f1576a;

    /* renamed from: b */
    public final SuccessContinuation f1577b;

    /* renamed from: c */
    public final C23121yK2 f1578c;

    public FI2(Executor executor, SuccessContinuation successContinuation, C23121yK2 c23121yK2) {
        this.f1576a = executor;
        this.f1577b = successContinuation;
        this.f1578c = c23121yK2;
    }

    @Override // p000.QI2
    /* renamed from: a */
    public final void mo22537a(Task task) {
        this.f1576a.execute(new RunnableC21395oI2(this, task));
    }

    @Override // com.google.android.gms.tasks.OnCanceledListener
    public final void onCanceled() {
        this.f1578c.m285c();
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public final void onFailure(Exception exc) {
        this.f1578c.m287a(exc);
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public final void onSuccess(Object obj) {
        this.f1578c.m286b(obj);
    }

    @Override // p000.QI2
    public final void zzc() {
        throw new UnsupportedOperationException();
    }
}
