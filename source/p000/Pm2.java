package p000;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCanceledListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.Executor;

/* renamed from: Pm2 */
/* loaded from: classes4.dex */
public final class Pm2 implements OnSuccessListener, OnFailureListener, OnCanceledListener, QI2 {

    /* renamed from: a */
    public final Executor f4842a;

    /* renamed from: b */
    public final Continuation f4843b;

    /* renamed from: c */
    public final C23121yK2 f4844c;

    public Pm2(Executor executor, Continuation continuation, C23121yK2 c23121yK2) {
        this.f4842a = executor;
        this.f4843b = continuation;
        this.f4844c = c23121yK2;
    }

    @Override // p000.QI2
    /* renamed from: a */
    public final void mo22537a(Task task) {
        this.f4842a.execute(new RunnableC21293nk2(this, task));
    }

    @Override // com.google.android.gms.tasks.OnCanceledListener
    public final void onCanceled() {
        this.f4844c.m285c();
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public final void onFailure(Exception exc) {
        this.f4844c.m287a(exc);
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public final void onSuccess(Object obj) {
        this.f4844c.m286b(obj);
    }

    @Override // p000.QI2
    public final void zzc() {
        throw new UnsupportedOperationException();
    }
}
