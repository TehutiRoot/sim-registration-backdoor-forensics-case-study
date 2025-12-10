package p000;

import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.Executor;

/* renamed from: GH2 */
/* loaded from: classes4.dex */
public final class GH2 implements QI2 {

    /* renamed from: a */
    public final Executor f1874a;

    /* renamed from: b */
    public final Object f1875b = new Object();

    /* renamed from: c */
    public OnSuccessListener f1876c;

    public GH2(Executor executor, OnSuccessListener onSuccessListener) {
        this.f1874a = executor;
        this.f1876c = onSuccessListener;
    }

    @Override // p000.QI2
    /* renamed from: a */
    public final void mo22537a(Task task) {
        if (task.isSuccessful()) {
            synchronized (this.f1875b) {
                try {
                    if (this.f1876c == null) {
                        return;
                    }
                    this.f1874a.execute(new YF2(this, task));
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    @Override // p000.QI2
    public final void zzc() {
        synchronized (this.f1875b) {
            this.f1876c = null;
        }
    }
}
