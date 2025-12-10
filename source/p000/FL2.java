package p000;

import java.util.concurrent.Callable;

/* renamed from: FL2 */
/* loaded from: classes4.dex */
public final class FL2 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C23121yK2 f1591a;

    /* renamed from: b */
    public final /* synthetic */ Callable f1592b;

    public FL2(C23121yK2 c23121yK2, Callable callable) {
        this.f1591a = c23121yK2;
        this.f1592b = callable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f1591a.m286b(this.f1592b.call());
        } catch (Exception e) {
            this.f1591a.m287a(e);
        } catch (Throwable th2) {
            this.f1591a.m287a(new RuntimeException(th2));
        }
    }
}
