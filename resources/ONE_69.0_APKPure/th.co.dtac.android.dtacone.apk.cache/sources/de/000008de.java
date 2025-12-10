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

/* renamed from: JL */
/* loaded from: classes5.dex */
public class C0650JL extends AbstractC23181yH1 {
    public C0650JL(BaseRealm baseRealm, OsSet osSet, String str) {
        super(baseRealm, osSet, DynamicRealmObject.class, str);
    }

    @Override // p000.AbstractC23181yH1
    /* renamed from: C */
    public boolean mo327C(Collection collection) {
        m67895L(collection);
        return this.f108991b.collectionFunnel(NativeRealmAnyCollection.newRealmModelCollection(collection), OsSet.ExternalCollectionOperation.REMOVE_ALL);
    }

    @Override // p000.AbstractC23181yH1
    /* renamed from: F */
    public boolean mo326F(Object obj) {
        m67894M((RealmModel) obj);
        return this.f108991b.removeRow(((RealmObjectProxy) obj).realmGet$proxyState().getRow$realm().getObjectKey());
    }

    @Override // p000.AbstractC23181yH1
    /* renamed from: H */
    public boolean mo325H(Collection collection) {
        m67895L(collection);
        return this.f108991b.collectionFunnel(NativeRealmAnyCollection.newRealmModelCollection(collection), OsSet.ExternalCollectionOperation.RETAIN_ALL);
    }

    @Override // p000.AbstractC23181yH1
    /* renamed from: J */
    public RealmQuery mo400J() {
        return new RealmQuery(this.f108990a, this.f108991b, this.f108992c);
    }

    @Override // p000.AbstractC23181yH1
    /* renamed from: K */
    public boolean mo323a(DynamicRealmObject dynamicRealmObject) {
        return this.f108991b.addRow(m67893N(dynamicRealmObject).realmGet$proxyState().getRow$realm().getObjectKey());
    }

    /* renamed from: L */
    public final void m67895L(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            m67894M((DynamicRealmObject) it.next());
        }
    }

    /* renamed from: M */
    public final void m67894M(RealmModel realmModel) {
        if (realmModel != null) {
            if (RealmObject.isValid(realmModel) && RealmObject.isManaged(realmModel)) {
                if (((RealmObjectProxy) realmModel).realmGet$proxyState().getRealm$realm() == this.f108990a) {
                    return;
                }
                throw new IllegalArgumentException("'value' belongs to a different Realm.");
            }
            throw new IllegalArgumentException("'value' is not a valid managed object.");
        }
        throw new NullPointerException("This set does not permit null values.");
    }

    /* renamed from: N */
    public final DynamicRealmObject m67893N(DynamicRealmObject dynamicRealmObject) {
        if (dynamicRealmObject != null) {
            boolean m30091a = CollectionUtils.m30091a(this.f108990a, dynamicRealmObject, this.f108993d, "set");
            Object obj = dynamicRealmObject;
            if (m30091a) {
                obj = CollectionUtils.copyToRealm(this.f108990a, dynamicRealmObject);
            }
            return (DynamicRealmObject) obj;
        }
        throw new NullPointerException("This set does not permit null values.");
    }

    @Override // p000.AbstractC23181yH1
    /* renamed from: c */
    public boolean mo322c(Collection collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(m67893N((DynamicRealmObject) it.next()));
        }
        return this.f108991b.collectionFunnel(NativeRealmAnyCollection.newRealmModelCollection(arrayList), OsSet.ExternalCollectionOperation.ADD_ALL);
    }

    @Override // p000.AbstractC23181yH1
    /* renamed from: i */
    public boolean mo321i(Collection collection) {
        m67895L(collection);
        return this.f108991b.collectionFunnel(NativeRealmAnyCollection.newRealmModelCollection(collection), OsSet.ExternalCollectionOperation.CONTAINS_ALL);
    }

    @Override // p000.AbstractC23181yH1
    /* renamed from: j */
    public boolean mo320j(Object obj) {
        m67894M((RealmModel) obj);
        return this.f108991b.containsRow(((RealmObjectProxy) obj).realmGet$proxyState().getRow$realm().getObjectKey());
    }
}