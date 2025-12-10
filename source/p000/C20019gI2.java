package p000;

import ch.qos.logback.core.CoreConstants;
import java.util.List;

/* renamed from: gI2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C20019gI2 extends YH2 {

    /* renamed from: b */
    public final C19675eI2 f62137b = new C19675eI2();

    @Override // p000.YH2
    /* renamed from: a */
    public final void mo30900a(Throwable th2, Throwable th3) {
        if (th3 != th2) {
            if (th3 != null) {
                this.f62137b.m31581a(th2, true).add(th3);
                return;
            }
            throw new NullPointerException("The suppressed exception cannot be null.");
        }
        throw new IllegalArgumentException("Self suppression is not allowed.", th3);
    }

    @Override // p000.YH2
    /* renamed from: b */
    public final void mo30899b(Throwable th2) {
        th2.printStackTrace();
        List<Throwable> m31581a = this.f62137b.m31581a(th2, false);
        if (m31581a == null) {
            return;
        }
        synchronized (m31581a) {
            try {
                for (Throwable th3 : m31581a) {
                    System.err.print(CoreConstants.SUPPRESSED);
                    th3.printStackTrace();
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }
}
