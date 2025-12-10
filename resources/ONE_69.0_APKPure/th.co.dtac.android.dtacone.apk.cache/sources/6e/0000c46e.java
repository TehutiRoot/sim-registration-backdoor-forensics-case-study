package p000;

import ch.qos.logback.core.CoreConstants;
import java.util.List;

/* renamed from: dJ2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C19555dJ2 extends VI2 {

    /* renamed from: b */
    public final C19209bJ2 f61204b = new C19209bJ2();

    @Override // p000.VI2
    /* renamed from: a */
    public final void mo31724a(Throwable th2, Throwable th3) {
        if (th3 != th2) {
            if (th3 != null) {
                this.f61204b.m51960a(th2, true).add(th3);
                return;
            }
            throw new NullPointerException("The suppressed exception cannot be null.");
        }
        throw new IllegalArgumentException("Self suppression is not allowed.", th3);
    }

    @Override // p000.VI2
    /* renamed from: b */
    public final void mo31723b(Throwable th2) {
        th2.printStackTrace();
        List<Throwable> m51960a = this.f61204b.m51960a(th2, false);
        if (m51960a == null) {
            return;
        }
        synchronized (m51960a) {
            try {
                for (Throwable th3 : m51960a) {
                    System.err.print(CoreConstants.SUPPRESSED);
                    th3.printStackTrace();
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }
}