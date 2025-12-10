package p000;

import com.google.android.gms.tasks.OnCanceledListener;

/* renamed from: Rp2 */
/* loaded from: classes4.dex */
public final class Rp2 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C19428ct2 f5440a;

    public Rp2(C19428ct2 c19428ct2) {
        this.f5440a = c19428ct2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        OnCanceledListener onCanceledListener;
        OnCanceledListener onCanceledListener2;
        obj = this.f5440a.f60997b;
        synchronized (obj) {
            try {
                C19428ct2 c19428ct2 = this.f5440a;
                onCanceledListener = c19428ct2.f60998c;
                if (onCanceledListener != null) {
                    onCanceledListener2 = c19428ct2.f60998c;
                    onCanceledListener2.onCanceled();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
