package p000;

import io.realm.BaseRealm;
import io.realm.internal.OsList;
import java.util.Locale;

/* renamed from: UM1 */
/* loaded from: classes5.dex */
public final class UM1 extends AbstractC17619Fn0 {
    public UM1(BaseRealm baseRealm, OsList osList, Class cls) {
        super(baseRealm, osList, cls);
    }

    @Override // p000.AbstractC17619Fn0
    /* renamed from: c */
    public void mo23407c(Object obj) {
        this.f1694b.addString((String) obj);
    }

    @Override // p000.AbstractC17619Fn0
    /* renamed from: e */
    public void mo23406e(Object obj) {
        if (obj == null || (obj instanceof String)) {
            return;
        }
        throw new IllegalArgumentException(String.format(Locale.ENGLISH, "Unacceptable value type. Acceptable: %1$s, actual: %2$s .", "java.lang.String", obj.getClass().getName()));
    }

    @Override // p000.AbstractC17619Fn0
    /* renamed from: i */
    public boolean mo23405i() {
        return false;
    }

    @Override // p000.AbstractC17619Fn0
    /* renamed from: n */
    public void mo23402n(int i, Object obj) {
        this.f1694b.insertString(i, (String) obj);
    }

    @Override // p000.AbstractC17619Fn0
    /* renamed from: v */
    public void mo23400v(int i, Object obj) {
        this.f1694b.setString(i, (String) obj);
    }

    @Override // p000.AbstractC17619Fn0
    /* renamed from: x */
    public String mo23404j(int i) {
        return (String) this.f1694b.getValue(i);
    }
}
