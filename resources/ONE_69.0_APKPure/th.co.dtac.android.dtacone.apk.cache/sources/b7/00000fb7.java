package p000;

import io.realm.BaseRealm;
import io.realm.internal.OsList;
import java.util.Locale;
import java.util.UUID;

/* renamed from: QX1 */
/* loaded from: classes5.dex */
public final class QX1 extends AbstractC18038Ln0 {
    public QX1(BaseRealm baseRealm, OsList osList, Class cls) {
        super(baseRealm, osList, cls);
    }

    @Override // p000.AbstractC18038Ln0
    /* renamed from: c */
    public void mo26196c(Object obj) {
        this.f3692b.addUUID((UUID) obj);
    }

    @Override // p000.AbstractC18038Ln0
    /* renamed from: e */
    public void mo26195e(Object obj) {
        if (obj == null || (obj instanceof UUID)) {
            return;
        }
        throw new IllegalArgumentException(String.format(Locale.ENGLISH, "Unacceptable value type. Acceptable: %1$s, actual: %2$s .", "java.util.UUID", obj.getClass().getName()));
    }

    @Override // p000.AbstractC18038Ln0
    /* renamed from: i */
    public boolean mo26194i() {
        return false;
    }

    @Override // p000.AbstractC18038Ln0
    /* renamed from: n */
    public void mo26191n(int i, Object obj) {
        this.f3692b.insertUUID(i, (UUID) obj);
    }

    @Override // p000.AbstractC18038Ln0
    /* renamed from: v */
    public void mo26189v(int i, Object obj) {
        this.f3692b.setUUID(i, (UUID) obj);
    }

    @Override // p000.AbstractC18038Ln0
    /* renamed from: x */
    public UUID mo26193j(int i) {
        return (UUID) this.f3692b.getValue(i);
    }
}