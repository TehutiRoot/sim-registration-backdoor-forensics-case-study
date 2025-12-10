package p000;

import com.google.android.gms.tasks.OnCanceledListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.Executor;

/* renamed from: CJ2 */
/* loaded from: classes4.dex */
public final class CJ2 implements OnSuccessListener, OnFailureListener, OnCanceledListener, NJ2 {

    /* renamed from: a */
    public final Executor f716a;

    /* renamed from: b */
    public final SuccessContinuation f717b;

    /* renamed from: c */
    public final C22675vL2 f718c;

    public CJ2(Executor executor, SuccessContinuation successContinuation, C22675vL2 c22675vL2) {
        this.f716a = executor;
        this.f717b = successContinuation;
        this.f718c = c22675vL2;
    }

    @Override // p000.NJ2
    /* renamed from: a */
    public final void mo23918a(Task task) {
        this.f716a.execute(new RunnableC20939lJ2(this, task));
    }

    @Override // com.google.android.gms.tasks.OnCanceledListener
    public final void onCanceled() {
        this.f718c.m917c();
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public final void onFailure(Exception exc) {
        this.f718c.m919a(exc);
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public final void onSuccess(Object obj) {
        this.f718c.m918b(obj);
    }

    @Override // p000.NJ2
    public final void zzc() {
        throw new UnsupportedOperationException();
    }
}