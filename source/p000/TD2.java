package p000;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.Executor;

/* renamed from: TD2 */
/* loaded from: classes4.dex */
public final class TD2 implements QI2 {

    /* renamed from: a */
    public final Executor f5963a;

    /* renamed from: b */
    public final Object f5964b = new Object();

    /* renamed from: c */
    public OnFailureListener f5965c;

    public TD2(Executor executor, OnFailureListener onFailureListener) {
        this.f5963a = executor;
        this.f5965c = onFailureListener;
    }

    @Override // p000.QI2
    /* renamed from: a */
    public final void mo22537a(Task task) {
        if (!task.isSuccessful() && !task.isCanceled()) {
            synchronized (this.f5964b) {
                try {
                    if (this.f5965c == null) {
                        return;
                    }
                    this.f5963a.execute(new JB2(this, task));
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    @Override // p000.QI2
    public final void zzc() {
        synchronized (this.f5964b) {
            this.f5965c = null;
        }
    }
}
