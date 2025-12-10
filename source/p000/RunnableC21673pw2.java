package p000;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

/* renamed from: pw2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC21673pw2 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ Task f76817a;

    /* renamed from: b */
    public final /* synthetic */ C22198sz2 f76818b;

    public RunnableC21673pw2(C22198sz2 c22198sz2, Task task) {
        this.f76818b = c22198sz2;
        this.f76817a = task;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        OnCompleteListener onCompleteListener;
        OnCompleteListener onCompleteListener2;
        obj = this.f76818b.f79962b;
        synchronized (obj) {
            try {
                C22198sz2 c22198sz2 = this.f76818b;
                onCompleteListener = c22198sz2.f79963c;
                if (onCompleteListener != null) {
                    onCompleteListener2 = c22198sz2.f79963c;
                    onCompleteListener2.onComplete(this.f76817a);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
