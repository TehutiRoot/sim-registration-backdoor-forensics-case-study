package p000;

import io.realm.BaseRealm;
import io.realm.internal.OsList;
import java.util.Locale;

/* renamed from: RN1 */
/* loaded from: classes5.dex */
public final class RN1 extends AbstractC18038Ln0 {
    public RN1(BaseRealm baseRealm, OsList osList, Class cls) {
        super(baseRealm, osList, cls);
    }

    @Override // p000.AbstractC18038Ln0
    /* renamed from: c */
    public void mo26196c(Object obj) {
        this.f3692b.addString((String) obj);
    }

    @Override // p000.AbstractC18038Ln0
    /* renamed from: e */
    public void mo26195e(Object obj) {
        if (obj == null || (obj instanceof String)) {
            return;
        }
        throw new IllegalArgumentException(String.format(Locale.ENGLISH, "Unacceptable value type. Acceptable: %1$s, actual: %2$s .", "java.lang.String", obj.getClass().getName()));
    }

    @Override // p000.AbstractC18038Ln0
    /* renamed from: i */
    public boolean mo26194i() {
        return false;
    }

    @Override // p000.AbstractC18038Ln0
    /* renamed from: n */
    public void mo26191n(int i, Object obj) {
        this.f3692b.insertString(i, (String) obj);
    }

    @Override // p000.AbstractC18038Ln0
    /* renamed from: v */
    public void mo26189v(int i, Object obj) {
        this.f3692b.setString(i, (String) obj);
    }

    @Override // p000.AbstractC18038Ln0
    /* renamed from: x */
    public String mo26193j(int i) {
        return (String) this.f3692b.getValue(i);
    }
}