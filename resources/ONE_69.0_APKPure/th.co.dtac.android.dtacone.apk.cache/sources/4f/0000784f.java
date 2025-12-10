package p000;

import io.realm.BaseRealm;
import io.realm.internal.OsList;
import java.util.Locale;

/* renamed from: bc */
/* loaded from: classes5.dex */
public final class C5364bc extends AbstractC18038Ln0 {
    public C5364bc(BaseRealm baseRealm, OsList osList, Class cls) {
        super(baseRealm, osList, cls);
    }

    @Override // p000.AbstractC18038Ln0
    /* renamed from: c */
    public void mo26196c(Object obj) {
        this.f3692b.addBoolean(((Boolean) obj).booleanValue());
    }

    @Override // p000.AbstractC18038Ln0
    /* renamed from: e */
    public void mo26195e(Object obj) {
        if (obj == null || (obj instanceof Boolean)) {
            return;
        }
        throw new IllegalArgumentException(String.format(Locale.ENGLISH, "Unacceptable value type. Acceptable: %1$s, actual: %2$s .", "java.lang.Boolean", obj.getClass().getName()));
    }

    @Override // p000.AbstractC18038Ln0
    /* renamed from: i */
    public boolean mo26194i() {
        return false;
    }

    @Override // p000.AbstractC18038Ln0
    /* renamed from: n */
    public void mo26191n(int i, Object obj) {
        this.f3692b.insertBoolean(i, ((Boolean) obj).booleanValue());
    }

    @Override // p000.AbstractC18038Ln0
    /* renamed from: v */
    public void mo26189v(int i, Object obj) {
        this.f3692b.setBoolean(i, ((Boolean) obj).booleanValue());
    }

    @Override // p000.AbstractC18038Ln0
    /* renamed from: x */
    public Boolean mo26193j(int i) {
        return (Boolean) this.f3692b.getValue(i);
    }
}