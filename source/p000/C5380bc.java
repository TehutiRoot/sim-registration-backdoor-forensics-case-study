package p000;

import io.realm.BaseRealm;
import io.realm.internal.OsList;
import java.util.Locale;

/* renamed from: bc */
/* loaded from: classes5.dex */
public final class C5380bc extends AbstractC17619Fn0 {
    public C5380bc(BaseRealm baseRealm, OsList osList, Class cls) {
        super(baseRealm, osList, cls);
    }

    @Override // p000.AbstractC17619Fn0
    /* renamed from: c */
    public void mo23407c(Object obj) {
        this.f1694b.addBoolean(((Boolean) obj).booleanValue());
    }

    @Override // p000.AbstractC17619Fn0
    /* renamed from: e */
    public void mo23406e(Object obj) {
        if (obj == null || (obj instanceof Boolean)) {
            return;
        }
        throw new IllegalArgumentException(String.format(Locale.ENGLISH, "Unacceptable value type. Acceptable: %1$s, actual: %2$s .", "java.lang.Boolean", obj.getClass().getName()));
    }

    @Override // p000.AbstractC17619Fn0
    /* renamed from: i */
    public boolean mo23405i() {
        return false;
    }

    @Override // p000.AbstractC17619Fn0
    /* renamed from: n */
    public void mo23402n(int i, Object obj) {
        this.f1694b.insertBoolean(i, ((Boolean) obj).booleanValue());
    }

    @Override // p000.AbstractC17619Fn0
    /* renamed from: v */
    public void mo23400v(int i, Object obj) {
        this.f1694b.setBoolean(i, ((Boolean) obj).booleanValue());
    }

    @Override // p000.AbstractC17619Fn0
    /* renamed from: x */
    public Boolean mo23404j(int i) {
        return (Boolean) this.f1694b.getValue(i);
    }
}
