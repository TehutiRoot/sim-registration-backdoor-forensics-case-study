package p000;

import java.util.concurrent.ExecutionException;

/* renamed from: Bb2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C17330Bb2 implements InterfaceC22470ub2 {

    /* renamed from: a */
    public final Object f435a = new Object();

    /* renamed from: b */
    public final int f436b;

    /* renamed from: c */
    public final C23121yK2 f437c;

    /* renamed from: d */
    public int f438d;

    /* renamed from: e */
    public int f439e;

    /* renamed from: f */
    public int f440f;

    /* renamed from: g */
    public Exception f441g;

    /* renamed from: h */
    public boolean f442h;

    public C17330Bb2(int i, C23121yK2 c23121yK2) {
        this.f436b = i;
        this.f437c = c23121yK2;
    }

    /* renamed from: a */
    private final void m68895a() {
        if (this.f438d + this.f439e + this.f440f == this.f436b) {
            if (this.f441g != null) {
                C23121yK2 c23121yK2 = this.f437c;
                int i = this.f439e;
                int i2 = this.f436b;
                c23121yK2.m287a(new ExecutionException(i + " out of " + i2 + " underlying tasks failed", this.f441g));
            } else if (this.f442h) {
                this.f437c.m285c();
            } else {
                this.f437c.m286b(null);
            }
        }
    }

    @Override // com.google.android.gms.tasks.OnCanceledListener
    public final void onCanceled() {
        synchronized (this.f435a) {
            this.f440f++;
            this.f442h = true;
            m68895a();
        }
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public final void onFailure(Exception exc) {
        synchronized (this.f435a) {
            this.f439e++;
            this.f441g = exc;
            m68895a();
        }
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public final void onSuccess(Object obj) {
        synchronized (this.f435a) {
            this.f438d++;
            m68895a();
        }
    }
}
