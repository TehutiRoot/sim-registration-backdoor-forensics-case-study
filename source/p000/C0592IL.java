package p000;

import io.realm.BaseRealm;
import io.realm.CollectionUtils;
import io.realm.DynamicRealmObject;
import io.realm.RealmModel;
import io.realm.RealmObject;
import io.realm.RealmQuery;
import io.realm.internal.OsSet;
import io.realm.internal.RealmObjectProxy;
import io.realm.internal.core.NativeRealmAnyCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: IL */
/* loaded from: classes5.dex */
public class C0592IL extends BG1 {
    public C0592IL(BaseRealm baseRealm, OsSet osSet, String str) {
        super(baseRealm, osSet, DynamicRealmObject.class, str);
    }

    @Override // p000.BG1
    /* renamed from: C */
    public boolean mo589C(Collection collection) {
        m67917L(collection);
        return this.f340b.collectionFunnel(NativeRealmAnyCollection.newRealmModelCollection(collection), OsSet.ExternalCollectionOperation.REMOVE_ALL);
    }

    @Override // p000.BG1
    /* renamed from: F */
    public boolean mo588F(Object obj) {
        m67916M((RealmModel) obj);
        return this.f340b.removeRow(((RealmObjectProxy) obj).realmGet$proxyState().getRow$realm().getObjectKey());
    }

    @Override // p000.BG1
    /* renamed from: H */
    public boolean mo587H(Collection collection) {
        m67917L(collection);
        return this.f340b.collectionFunnel(NativeRealmAnyCollection.newRealmModelCollection(collection), OsSet.ExternalCollectionOperation.RETAIN_ALL);
    }

    @Override // p000.BG1
    /* renamed from: J */
    public RealmQuery mo22545J() {
        return new RealmQuery(this.f339a, this.f340b, this.f341c);
    }

    @Override // p000.BG1
    /* renamed from: K */
    public boolean mo585a(DynamicRealmObject dynamicRealmObject) {
        return this.f340b.addRow(m67915N(dynamicRealmObject).realmGet$proxyState().getRow$realm().getObjectKey());
    }

    /* renamed from: L */
    public final void m67917L(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            m67916M((DynamicRealmObject) it.next());
        }
    }

    /* renamed from: M */
    public final void m67916M(RealmModel realmModel) {
        if (realmModel != null) {
            if (RealmObject.isValid(realmModel) && RealmObject.isManaged(realmModel)) {
                if (((RealmObjectProxy) realmModel).realmGet$proxyState().getRealm$realm() == this.f339a) {
                    return;
                }
                throw new IllegalArgumentException("'value' belongs to a different Realm.");
            }
            throw new IllegalArgumentException("'value' is not a valid managed object.");
        }
        throw new NullPointerException("This set does not permit null values.");
    }

    /* renamed from: N */
    public final DynamicRealmObject m67915N(DynamicRealmObject dynamicRealmObject) {
        if (dynamicRealmObject != null) {
            boolean m29751a = CollectionUtils.m29751a(this.f339a, dynamicRealmObject, this.f342d, "set");
            Object obj = dynamicRealmObject;
            if (m29751a) {
                obj = CollectionUtils.copyToRealm(this.f339a, dynamicRealmObject);
            }
            return (DynamicRealmObject) obj;
        }
        throw new NullPointerException("This set does not permit null values.");
    }

    @Override // p000.BG1
    /* renamed from: c */
    public boolean mo584c(Collection collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(m67915N((DynamicRealmObject) it.next()));
        }
        return this.f340b.collectionFunnel(NativeRealmAnyCollection.newRealmModelCollection(arrayList), OsSet.ExternalCollectionOperation.ADD_ALL);
    }

    @Override // p000.BG1
    /* renamed from: i */
    public boolean mo583i(Collection collection) {
        m67917L(collection);
        return this.f340b.collectionFunnel(NativeRealmAnyCollection.newRealmModelCollection(collection), OsSet.ExternalCollectionOperation.CONTAINS_ALL);
    }

    @Override // p000.BG1
    /* renamed from: j */
    public boolean mo582j(Object obj) {
        m67916M((RealmModel) obj);
        return this.f340b.containsRow(((RealmObjectProxy) obj).realmGet$proxyState().getRow$realm().getObjectKey());
    }
}
