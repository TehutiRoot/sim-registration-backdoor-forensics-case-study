package p000;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

/* renamed from: mx2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC21219mx2 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ Task f72215a;

    /* renamed from: b */
    public final /* synthetic */ C21604pA2 f72216b;

    public RunnableC21219mx2(C21604pA2 c21604pA2, Task task) {
        this.f72216b = c21604pA2;
        this.f72215a = task;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        OnCompleteListener onCompleteListener;
        OnCompleteListener onCompleteListener2;
        obj = this.f72216b.f76610b;
        synchronized (obj) {
            try {
                C21604pA2 c21604pA2 = this.f72216b;
                onCompleteListener = c21604pA2.f76611c;
                if (onCompleteListener != null) {
                    onCompleteListener2 = c21604pA2.f76611c;
                    onCompleteListener2.onComplete(this.f72215a);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}