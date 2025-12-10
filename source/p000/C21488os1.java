package p000;

import io.realm.BaseRealm;
import io.realm.CollectionUtils;
import io.realm.RealmAny;
import io.realm.RealmAnyOperator;
import io.realm.internal.OsList;
import io.realm.internal.core.NativeRealmAny;
import java.util.Locale;

/* renamed from: os1  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C21488os1 extends AbstractC17619Fn0 {
    public C21488os1(BaseRealm baseRealm, OsList osList, Class cls) {
        super(baseRealm, osList, cls);
    }

    @Override // p000.AbstractC17619Fn0
    /* renamed from: c */
    public void mo23407c(Object obj) {
        this.f1694b.addRealmAny(CollectionUtils.m29750b(this.f1693a, (RealmAny) obj).m29707b());
    }

    @Override // p000.AbstractC17619Fn0
    /* renamed from: e */
    public void mo23406e(Object obj) {
        if (obj == null || (obj instanceof RealmAny)) {
            return;
        }
        throw new IllegalArgumentException(String.format(Locale.ENGLISH, "Unacceptable value type. Acceptable: %1$s, actual: %2$s .", "java.util.RealmAny", obj.getClass().getName()));
    }

    @Override // p000.AbstractC17619Fn0
    /* renamed from: i */
    public boolean mo23405i() {
        return false;
    }

    @Override // p000.AbstractC17619Fn0
    /* renamed from: n */
    public void mo23402n(int i, Object obj) {
        m68362d(i);
        this.f1694b.insertRealmAny(i, CollectionUtils.m29750b(this.f1693a, (RealmAny) obj).m29707b());
    }

    @Override // p000.AbstractC17619Fn0
    /* renamed from: v */
    public void mo23400v(int i, Object obj) {
        this.f1694b.setRealmAny(i, CollectionUtils.m29750b(this.f1693a, (RealmAny) obj).m29707b());
    }

    @Override // p000.AbstractC17619Fn0
    /* renamed from: x */
    public RealmAny mo23404j(int i) {
        NativeRealmAny nativeRealmAny = (NativeRealmAny) this.f1694b.getValue(i);
        if (nativeRealmAny == null) {
            nativeRealmAny = new NativeRealmAny();
        }
        return new RealmAny(RealmAnyOperator.m29704b(this.f1693a, nativeRealmAny));
    }
}
