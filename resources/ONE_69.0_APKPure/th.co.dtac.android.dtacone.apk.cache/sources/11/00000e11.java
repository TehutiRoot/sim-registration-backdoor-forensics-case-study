package p000;

import com.google.android.gms.tasks.OnCanceledListener;

/* renamed from: Oq2 */
/* loaded from: classes4.dex */
public final class Oq2 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ Zt2 f4550a;

    public Oq2(Zt2 zt2) {
        this.f4550a = zt2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        OnCanceledListener onCanceledListener;
        OnCanceledListener onCanceledListener2;
        obj = this.f4550a.f8294b;
        synchronized (obj) {
            try {
                Zt2 zt2 = this.f4550a;
                onCanceledListener = zt2.f8295c;
                if (onCanceledListener != null) {
                    onCanceledListener2 = zt2.f8295c;
                    onCanceledListener2.onCanceled();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}