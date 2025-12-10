package p000;

import com.google.android.gms.tasks.OnCanceledListener;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.Executor;

/* renamed from: ct2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C19428ct2 implements QI2 {

    /* renamed from: a */
    public final Executor f60996a;

    /* renamed from: b */
    public final Object f60997b = new Object();

    /* renamed from: c */
    public OnCanceledListener f60998c;

    public C19428ct2(Executor executor, OnCanceledListener onCanceledListener) {
        this.f60996a = executor;
        this.f60998c = onCanceledListener;
    }

    @Override // p000.QI2
    /* renamed from: a */
    public final void mo22537a(Task task) {
        if (task.isCanceled()) {
            synchronized (this.f60997b) {
                try {
                    if (this.f60998c == null) {
                        return;
                    }
                    this.f60996a.execute(new Rp2(this));
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    @Override // p000.QI2
    public final void zzc() {
        synchronized (this.f60997b) {
            this.f60998c = null;
        }
    }
}
