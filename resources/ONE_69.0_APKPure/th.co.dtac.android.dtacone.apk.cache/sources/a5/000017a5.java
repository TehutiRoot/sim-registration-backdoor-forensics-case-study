package p000;

import ch.qos.logback.core.CoreConstants;
import java.util.List;

/* renamed from: Yo2 */
/* loaded from: classes3.dex */
public final class Yo2 extends Ao2 {

    /* renamed from: b */
    public final To2 f7992b = new To2();

    @Override // p000.Ao2
    /* renamed from: a */
    public final void mo26893a(Throwable th2) {
        th2.printStackTrace();
        List<Throwable> m66307a = this.f7992b.m66307a(th2, false);
        if (m66307a == null) {
            return;
        }
        synchronized (m66307a) {
            try {
                for (Throwable th3 : m66307a) {
                    System.err.print(CoreConstants.SUPPRESSED);
                    th3.printStackTrace();
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    @Override // p000.Ao2
    /* renamed from: b */
    public final void mo26892b(Throwable th2, Throwable th3) {
        if (th3 != th2) {
            if (th3 != null) {
                this.f7992b.m66307a(th2, true).add(th3);
                return;
            }
            throw new NullPointerException("The suppressed exception cannot be null.");
        }
        throw new IllegalArgumentException("Self suppression is not allowed.", th3);
    }
}