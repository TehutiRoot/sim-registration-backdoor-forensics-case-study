package io.realm;

import io.realm.RealmMapEntrySet;
import io.realm.internal.OsMap;
import io.realm.internal.RealmObjectProxy;
import io.realm.internal.Row;
import java.util.Set;

/* renamed from: io.realm.v */
/* loaded from: classes5.dex */
public class C11487v extends AbstractC11417l {
    public C11487v(BaseRealm baseRealm, OsMap osMap, AbstractC19706eW1 abstractC19706eW1) {
        super(RealmModel.class, baseRealm, osMap, abstractC19706eW1, RealmMapEntrySet.IteratorType.OBJECT);
    }

    @Override // io.realm.AbstractC11417l
    /* renamed from: c */
    public boolean mo29320c(Object obj) {
        if (obj != null && !RealmModel.class.isAssignableFrom(obj.getClass())) {
            throw new ClassCastException("Only RealmModel values can be used with 'containsValue'.");
        }
        return mo29319d(obj);
    }

    @Override // io.realm.AbstractC11417l
    /* renamed from: d */
    public boolean mo29319d(Object obj) {
        if (obj == null) {
            return this.f66906c.containsPrimitiveValue(null);
        }
        if (obj instanceof RealmObjectProxy) {
            Row row$realm = ((RealmObjectProxy) obj).realmGet$proxyState().getRow$realm();
            return this.f66906c.containsRealmModel(row$realm.getObjectKey(), row$realm.getTable().getNativePtr());
        }
        throw new IllegalArgumentException("Only managed models can be contained in this dictionary.");
    }

    @Override // io.realm.AbstractC11417l
    /* renamed from: e */
    public Set mo29318e() {
        return new RealmMapEntrySet(this.f66905b, this.f66906c, RealmMapEntrySet.IteratorType.OBJECT, this.f66907d);
    }

    @Override // io.realm.AbstractC11417l
    /* renamed from: g */
    public Object mo29317g(Object obj) {
        long modelRowKey = this.f66906c.getModelRowKey(obj);
        if (modelRowKey == -1) {
            return null;
        }
        return this.f66907d.mo31532c(this.f66905b, modelRowKey);
    }

    @Override // io.realm.AbstractC11417l
    /* renamed from: l */
    public Object mo29316l(Object obj, Object obj2) {
        return this.f66907d.mo31531h(this.f66905b, this.f66906c, obj, obj2);
    }
}
