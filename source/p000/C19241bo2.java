package p000;

import ch.qos.logback.core.CoreConstants;
import java.util.List;

/* renamed from: bo2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C19241bo2 extends Dn2 {

    /* renamed from: b */
    public final Wn2 f39225b = new Wn2();

    @Override // p000.Dn2
    /* renamed from: a */
    public final void mo26047a(Throwable th2) {
        th2.printStackTrace();
        List<Throwable> m65565a = this.f39225b.m65565a(th2, false);
        if (m65565a == null) {
            return;
        }
        synchronized (m65565a) {
            try {
                for (Throwable th3 : m65565a) {
                    System.err.print(CoreConstants.SUPPRESSED);
                    th3.printStackTrace();
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    @Override // p000.Dn2
    /* renamed from: b */
    public final void mo26046b(Throwable th2, Throwable th3) {
        if (th3 != th2) {
            if (th3 != null) {
                this.f39225b.m65565a(th2, true).add(th3);
                return;
            }
            throw new NullPointerException("The suppressed exception cannot be null.");
        }
        throw new IllegalArgumentException("Self suppression is not allowed.", th3);
    }
}
