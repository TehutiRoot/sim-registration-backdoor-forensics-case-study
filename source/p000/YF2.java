package p000;

import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;

/* renamed from: YF2 */
/* loaded from: classes4.dex */
public final class YF2 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ Task f7724a;

    /* renamed from: b */
    public final /* synthetic */ GH2 f7725b;

    public YF2(GH2 gh2, Task task) {
        this.f7725b = gh2;
        this.f7724a = task;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        OnSuccessListener onSuccessListener;
        OnSuccessListener onSuccessListener2;
        obj = this.f7725b.f1875b;
        synchronized (obj) {
            try {
                GH2 gh2 = this.f7725b;
                onSuccessListener = gh2.f1876c;
                if (onSuccessListener != null) {
                    onSuccessListener2 = gh2.f1876c;
                    onSuccessListener2.onSuccess(this.f7724a.getResult());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
