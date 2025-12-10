package p000;

import java.util.concurrent.Callable;

/* renamed from: CM2 */
/* loaded from: classes4.dex */
public final class CM2 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C22675vL2 f730a;

    /* renamed from: b */
    public final /* synthetic */ Callable f731b;

    public CM2(C22675vL2 c22675vL2, Callable callable) {
        this.f730a = c22675vL2;
        this.f731b = callable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f730a.m918b(this.f731b.call());
        } catch (Exception e) {
            this.f730a.m919a(e);
        } catch (Throwable th2) {
            this.f730a.m919a(new RuntimeException(th2));
        }
    }
}