package p000;

import io.realm.BaseRealm;
import io.realm.internal.OsList;
import java.util.Date;
import java.util.Locale;

/* renamed from: OD */
/* loaded from: classes5.dex */
public final class C0999OD extends AbstractC17619Fn0 {
    public C0999OD(BaseRealm baseRealm, OsList osList, Class cls) {
        super(baseRealm, osList, cls);
    }

    @Override // p000.AbstractC17619Fn0
    /* renamed from: c */
    public void mo23407c(Object obj) {
        this.f1694b.addDate((Date) obj);
    }

    @Override // p000.AbstractC17619Fn0
    /* renamed from: e */
    public void mo23406e(Object obj) {
        if (obj == null || (obj instanceof Date)) {
            return;
        }
        throw new IllegalArgumentException(String.format(Locale.ENGLISH, "Unacceptable value type. Acceptable: %1$s, actual: %2$s .", "java.util.Date", obj.getClass().getName()));
    }

    @Override // p000.AbstractC17619Fn0
    /* renamed from: i */
    public boolean mo23405i() {
        return false;
    }

    @Override // p000.AbstractC17619Fn0
    /* renamed from: n */
    public void mo23402n(int i, Object obj) {
        this.f1694b.insertDate(i, (Date) obj);
    }

    @Override // p000.AbstractC17619Fn0
    /* renamed from: v */
    public void mo23400v(int i, Object obj) {
        this.f1694b.setDate(i, (Date) obj);
    }

    @Override // p000.AbstractC17619Fn0
    /* renamed from: x */
    public Date mo23404j(int i) {
        return (Date) this.f1694b.getValue(i);
    }
}
