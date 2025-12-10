package p000;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;

/* renamed from: JB2 */
/* loaded from: classes4.dex */
public final class JB2 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ Task f2727a;

    /* renamed from: b */
    public final /* synthetic */ TD2 f2728b;

    public JB2(TD2 td2, Task task) {
        this.f2728b = td2;
        this.f2727a = task;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        OnFailureListener onFailureListener;
        OnFailureListener onFailureListener2;
        obj = this.f2728b.f5964b;
        synchronized (obj) {
            try {
                TD2 td2 = this.f2728b;
                onFailureListener = td2.f5965c;
                if (onFailureListener != null) {
                    onFailureListener2 = td2.f5965c;
                    onFailureListener2.onFailure((Exception) Preconditions.checkNotNull(this.f2727a.getException()));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
