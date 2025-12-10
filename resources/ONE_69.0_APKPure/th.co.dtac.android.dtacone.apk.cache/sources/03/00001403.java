package p000;

import io.realm.BaseRealm;
import io.realm.internal.OsList;
import java.util.Locale;

/* renamed from: V20 */
/* loaded from: classes5.dex */
public final class V20 extends AbstractC18038Ln0 {
    public V20(BaseRealm baseRealm, OsList osList, Class cls) {
        super(baseRealm, osList, cls);
    }

    @Override // p000.AbstractC18038Ln0
    /* renamed from: c */
    public void mo26196c(Object obj) {
        this.f3692b.addFloat(((Number) obj).floatValue());
    }

    @Override // p000.AbstractC18038Ln0
    /* renamed from: e */
    public void mo26195e(Object obj) {
        if (obj == null || (obj instanceof Number)) {
            return;
        }
        throw new IllegalArgumentException(String.format(Locale.ENGLISH, "Unacceptable value type. Acceptable: %1$s, actual: %2$s .", "java.lang.Number", obj.getClass().getName()));
    }

    @Override // p000.AbstractC18038Ln0
    /* renamed from: i */
    public boolean mo26194i() {
        return false;
    }

    @Override // p000.AbstractC18038Ln0
    /* renamed from: n */
    public void mo26191n(int i, Object obj) {
        this.f3692b.insertFloat(i, ((Number) obj).floatValue());
    }

    @Override // p000.AbstractC18038Ln0
    /* renamed from: v */
    public void mo26189v(int i, Object obj) {
        this.f3692b.setFloat(i, ((Number) obj).floatValue());
    }

    @Override // p000.AbstractC18038Ln0
    /* renamed from: x */
    public Float mo26193j(int i) {
        return (Float) this.f3692b.getValue(i);
    }
}