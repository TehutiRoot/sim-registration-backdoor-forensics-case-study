package p000;

import io.realm.BaseRealm;
import io.realm.CollectionUtils;
import io.realm.DynamicRealmObject;
import io.realm.Realm;
import io.realm.RealmModel;
import io.realm.internal.OsList;
import io.realm.internal.RealmObjectProxy;
import java.util.Locale;

/* renamed from: qs1  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C21832qs1 extends AbstractC17619Fn0 {

    /* renamed from: d */
    public final String f77095d;

    public C21832qs1(BaseRealm baseRealm, OsList osList, Class cls, String str) {
        super(baseRealm, osList, cls);
        this.f77095d = str;
    }

    @Override // p000.AbstractC17619Fn0
    /* renamed from: c */
    public void mo23407c(Object obj) {
        RealmModel realmModel = (RealmModel) obj;
        boolean m29751a = CollectionUtils.m29751a(this.f1693a, realmModel, this.f77095d, CollectionUtils.LIST_TYPE);
        if (CollectionUtils.m29748d(this.f1693a, realmModel)) {
            if (!(obj instanceof DynamicRealmObject)) {
                CollectionUtils.m29747e((Realm) this.f1693a, realmModel, this.f1694b.createAndAddEmbeddedObject());
                return;
            }
            throw new IllegalArgumentException("Embedded objects are not supported by RealmLists of DynamicRealmObjects yet.");
        }
        if (m29751a) {
            realmModel = CollectionUtils.copyToRealm(this.f1693a, realmModel);
        }
        this.f1694b.addRow(((RealmObjectProxy) realmModel).realmGet$proxyState().getRow$realm().getObjectKey());
    }

    @Override // p000.AbstractC17619Fn0
    /* renamed from: e */
    public void mo23406e(Object obj) {
        if (obj != null) {
            if (obj instanceof RealmModel) {
                return;
            }
            throw new IllegalArgumentException(String.format(Locale.ENGLISH, "Unacceptable value type. Acceptable: %1$s, actual: %2$s .", "java.lang.String", obj.getClass().getName()));
        }
        throw new IllegalArgumentException("RealmList does not accept null values.");
    }

    @Override // p000.AbstractC17619Fn0
    /* renamed from: i */
    public boolean mo23405i() {
        return true;
    }

    @Override // p000.AbstractC17619Fn0
    /* renamed from: j */
    public Object mo23404j(int i) {
        return this.f1693a.m29756l(this.f1695c, this.f77095d, this.f1694b.getUncheckedRow(i));
    }

    @Override // p000.AbstractC17619Fn0
    /* renamed from: m */
    public void mo23403m(int i) {
        throw new RuntimeException("Should not reach here.");
    }

    @Override // p000.AbstractC17619Fn0
    /* renamed from: n */
    public void mo23402n(int i, Object obj) {
        m68362d(i);
        RealmModel realmModel = (RealmModel) obj;
        boolean m29751a = CollectionUtils.m29751a(this.f1693a, realmModel, this.f77095d, CollectionUtils.LIST_TYPE);
        if (CollectionUtils.m29748d(this.f1693a, realmModel)) {
            if (!(obj instanceof DynamicRealmObject)) {
                CollectionUtils.m29747e((Realm) this.f1693a, realmModel, this.f1694b.createAndAddEmbeddedObject(i));
                return;
            }
            throw new IllegalArgumentException("Embedded objects are not supported by RealmLists of DynamicRealmObjects yet.");
        }
        if (m29751a) {
            realmModel = CollectionUtils.copyToRealm(this.f1693a, realmModel);
        }
        this.f1694b.insertRow(i, ((RealmObjectProxy) realmModel).realmGet$proxyState().getRow$realm().getObjectKey());
    }

    @Override // p000.AbstractC17619Fn0
    /* renamed from: u */
    public void mo23401u(int i) {
        throw new RuntimeException("Should not reach here.");
    }

    @Override // p000.AbstractC17619Fn0
    /* renamed from: v */
    public void mo23400v(int i, Object obj) {
        RealmModel realmModel = (RealmModel) obj;
        boolean m29751a = CollectionUtils.m29751a(this.f1693a, realmModel, this.f77095d, CollectionUtils.LIST_TYPE);
        if (CollectionUtils.m29748d(this.f1693a, realmModel)) {
            if (!(obj instanceof DynamicRealmObject)) {
                CollectionUtils.m29747e((Realm) this.f1693a, realmModel, this.f1694b.createAndSetEmbeddedObject(i));
                return;
            }
            throw new IllegalArgumentException("Embedded objects are not supported by RealmLists of DynamicRealmObjects yet.");
        }
        if (m29751a) {
            realmModel = CollectionUtils.copyToRealm(this.f1693a, realmModel);
        }
        this.f1694b.setRow(i, ((RealmObjectProxy) realmModel).realmGet$proxyState().getRow$realm().getObjectKey());
    }
}
