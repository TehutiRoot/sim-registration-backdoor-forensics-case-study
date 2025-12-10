package p000;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCanceledListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.Executor;

/* renamed from: Mn2 */
/* loaded from: classes4.dex */
public final class Mn2 implements OnSuccessListener, OnFailureListener, OnCanceledListener, NJ2 {

    /* renamed from: a */
    public final Executor f3973a;

    /* renamed from: b */
    public final Continuation f3974b;

    /* renamed from: c */
    public final C22675vL2 f3975c;

    public Mn2(Executor executor, Continuation continuation, C22675vL2 c22675vL2) {
        this.f3973a = executor;
        this.f3974b = continuation;
        this.f3975c = c22675vL2;
    }

    @Override // p000.NJ2
    /* renamed from: a */
    public final void mo23918a(Task task) {
        this.f3973a.execute(new RunnableC20837kl2(this, task));
    }

    @Override // com.google.android.gms.tasks.OnCanceledListener
    public final void onCanceled() {
        this.f3975c.m917c();
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public final void onFailure(Exception exc) {
        this.f3975c.m919a(exc);
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public final void onSuccess(Object obj) {
        this.f3975c.m918b(obj);
    }

    @Override // p000.NJ2
    public final void zzc() {
        throw new UnsupportedOperationException();
    }
}