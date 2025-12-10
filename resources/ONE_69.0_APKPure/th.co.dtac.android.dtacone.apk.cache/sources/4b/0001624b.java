package p000;

import java.util.concurrent.ExecutionException;

/* renamed from: yc2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23232yc2 implements InterfaceC22021rc2 {

    /* renamed from: a */
    public final Object f109084a = new Object();

    /* renamed from: b */
    public final int f109085b;

    /* renamed from: c */
    public final C22675vL2 f109086c;

    /* renamed from: d */
    public int f109087d;

    /* renamed from: e */
    public int f109088e;

    /* renamed from: f */
    public int f109089f;

    /* renamed from: g */
    public Exception f109090g;

    /* renamed from: h */
    public boolean f109091h;

    public C23232yc2(int i, C22675vL2 c22675vL2) {
        this.f109085b = i;
        this.f109086c = c22675vL2;
    }

    /* renamed from: a */
    private final void m270a() {
        if (this.f109087d + this.f109088e + this.f109089f == this.f109085b) {
            if (this.f109090g != null) {
                C22675vL2 c22675vL2 = this.f109086c;
                int i = this.f109088e;
                int i2 = this.f109085b;
                c22675vL2.m919a(new ExecutionException(i + " out of " + i2 + " underlying tasks failed", this.f109090g));
            } else if (this.f109091h) {
                this.f109086c.m917c();
            } else {
                this.f109086c.m918b(null);
            }
        }
    }

    @Override // com.google.android.gms.tasks.OnCanceledListener
    public final void onCanceled() {
        synchronized (this.f109084a) {
            this.f109089f++;
            this.f109091h = true;
            m270a();
        }
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public final void onFailure(Exception exc) {
        synchronized (this.f109084a) {
            this.f109088e++;
            this.f109090g = exc;
            m270a();
        }
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public final void onSuccess(Object obj) {
        synchronized (this.f109084a) {
            this.f109087d++;
            m270a();
        }
    }
}