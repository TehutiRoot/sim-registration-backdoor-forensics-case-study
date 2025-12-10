package io.realm;

import io.realm.RealmMapEntrySet;
import io.realm.internal.OsMap;
import io.realm.internal.RealmObjectProxy;
import io.realm.internal.Row;
import java.util.Set;

/* renamed from: io.realm.v */
/* loaded from: classes5.dex */
public class C11474v extends AbstractC11404l {
    public C11474v(BaseRealm baseRealm, OsMap osMap, AbstractC19240bX1 abstractC19240bX1) {
        super(RealmModel.class, baseRealm, osMap, abstractC19240bX1, RealmMapEntrySet.IteratorType.OBJECT);
    }

    @Override // io.realm.AbstractC11404l
    /* renamed from: c */
    public boolean mo29660c(Object obj) {
        if (obj != null && !RealmModel.class.isAssignableFrom(obj.getClass())) {
            throw new ClassCastException("Only RealmModel values can be used with 'containsValue'.");
        }
        return mo29659d(obj);
    }

    @Override // io.realm.AbstractC11404l
    /* renamed from: d */
    public boolean mo29659d(Object obj) {
        if (obj == null) {
            return this.f66969c.containsPrimitiveValue(null);
        }
        if (obj instanceof RealmObjectProxy) {
            Row row$realm = ((RealmObjectProxy) obj).realmGet$proxyState().getRow$realm();
            return this.f66969c.containsRealmModel(row$realm.getObjectKey(), row$realm.getTable().getNativePtr());
        }
        throw new IllegalArgumentException("Only managed models can be contained in this dictionary.");
    }

    @Override // io.realm.AbstractC11404l
    /* renamed from: e */
    public Set mo29658e() {
        return new RealmMapEntrySet(this.f66968b, this.f66969c, RealmMapEntrySet.IteratorType.OBJECT, this.f66970d);
    }

    @Override // io.realm.AbstractC11404l
    /* renamed from: g */
    public Object mo29657g(Object obj) {
        long modelRowKey = this.f66969c.getModelRowKey(obj);
        if (modelRowKey == -1) {
            return null;
        }
        return this.f66970d.mo29475c(this.f66968b, modelRowKey);
    }

    @Override // io.realm.AbstractC11404l
    /* renamed from: l */
    public Object mo29656l(Object obj, Object obj2) {
        return this.f66970d.mo29474h(this.f66968b, this.f66969c, obj, obj2);
    }
}