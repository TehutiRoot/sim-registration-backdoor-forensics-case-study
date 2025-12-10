package p000;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;

/* renamed from: GC2 */
/* loaded from: classes4.dex */
public final class GC2 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ Task f1906a;

    /* renamed from: b */
    public final /* synthetic */ QE2 f1907b;

    public GC2(QE2 qe2, Task task) {
        this.f1907b = qe2;
        this.f1906a = task;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        OnFailureListener onFailureListener;
        OnFailureListener onFailureListener2;
        obj = this.f1907b.f5168b;
        synchronized (obj) {
            try {
                QE2 qe2 = this.f1907b;
                onFailureListener = qe2.f5169c;
                if (onFailureListener != null) {
                    onFailureListener2 = qe2.f5169c;
                    onFailureListener2.onFailure((Exception) Preconditions.checkNotNull(this.f1906a.getException()));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}