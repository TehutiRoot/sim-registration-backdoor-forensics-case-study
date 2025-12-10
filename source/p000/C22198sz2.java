package p000;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.Executor;

/* renamed from: sz2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C22198sz2 implements QI2 {

    /* renamed from: a */
    public final Executor f79961a;

    /* renamed from: b */
    public final Object f79962b = new Object();

    /* renamed from: c */
    public OnCompleteListener f79963c;

    public C22198sz2(Executor executor, OnCompleteListener onCompleteListener) {
        this.f79961a = executor;
        this.f79963c = onCompleteListener;
    }

    @Override // p000.QI2
    /* renamed from: a */
    public final void mo22537a(Task task) {
        synchronized (this.f79962b) {
            try {
                if (this.f79963c == null) {
                    return;
                }
                this.f79961a.execute(new RunnableC21673pw2(this, task));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // p000.QI2
    public final void zzc() {
        synchronized (this.f79962b) {
            this.f79963c = null;
        }
    }
}
