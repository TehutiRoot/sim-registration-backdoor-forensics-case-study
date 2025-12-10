package p000;

import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;

/* renamed from: VG2 */
/* loaded from: classes4.dex */
public final class VG2 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ Task f6870a;

    /* renamed from: b */
    public final /* synthetic */ DI2 f6871b;

    public VG2(DI2 di2, Task task) {
        this.f6871b = di2;
        this.f6870a = task;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        OnSuccessListener onSuccessListener;
        OnSuccessListener onSuccessListener2;
        obj = this.f6871b.f982b;
        synchronized (obj) {
            try {
                DI2 di2 = this.f6871b;
                onSuccessListener = di2.f983c;
                if (onSuccessListener != null) {
                    onSuccessListener2 = di2.f983c;
                    onSuccessListener2.onSuccess(this.f6870a.getResult());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}