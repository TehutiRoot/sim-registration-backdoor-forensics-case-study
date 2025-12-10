package p000;

import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.Executor;

/* renamed from: DI2 */
/* loaded from: classes4.dex */
public final class DI2 implements NJ2 {

    /* renamed from: a */
    public final Executor f981a;

    /* renamed from: b */
    public final Object f982b = new Object();

    /* renamed from: c */
    public OnSuccessListener f983c;

    public DI2(Executor executor, OnSuccessListener onSuccessListener) {
        this.f981a = executor;
        this.f983c = onSuccessListener;
    }

    @Override // p000.NJ2
    /* renamed from: a */
    public final void mo23918a(Task task) {
        if (task.isSuccessful()) {
            synchronized (this.f982b) {
                try {
                    if (this.f983c == null) {
                        return;
                    }
                    this.f981a.execute(new VG2(this, task));
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    @Override // p000.NJ2
    public final void zzc() {
        synchronized (this.f982b) {
            this.f983c = null;
        }
    }
}