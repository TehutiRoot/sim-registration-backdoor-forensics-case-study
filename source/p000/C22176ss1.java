package p000;

import io.realm.BaseRealm;
import io.realm.CollectionUtils;
import io.realm.RealmModel;
import io.realm.RealmObject;
import io.realm.RealmQuery;
import io.realm.internal.OsSet;
import io.realm.internal.RealmObjectProxy;
import io.realm.internal.core.NativeRealmAnyCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: ss1  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C22176ss1 extends BG1 {
    public C22176ss1(BaseRealm baseRealm, OsSet osSet, Class cls) {
        super(baseRealm, osSet, cls);
    }

    /* renamed from: L */
    private void m22543L(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            m22542M((RealmModel) it.next());
        }
    }

    /* renamed from: M */
    private void m22542M(RealmModel realmModel) {
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

    @Override // p000.BG1
    /* renamed from: C */
    public boolean mo589C(Collection collection) {
        m22543L(collection);
        return this.f340b.collectionFunnel(NativeRealmAnyCollection.newRealmModelCollection(collection), OsSet.ExternalCollectionOperation.REMOVE_ALL);
    }

    @Override // p000.BG1
    /* renamed from: F */
    public boolean mo588F(Object obj) {
        m22542M((RealmModel) obj);
        return this.f340b.removeRow(((RealmObjectProxy) obj).realmGet$proxyState().getRow$realm().getObjectKey());
    }

    @Override // p000.BG1
    /* renamed from: H */
    public boolean mo587H(Collection collection) {
        m22543L(collection);
        return this.f340b.collectionFunnel(NativeRealmAnyCollection.newRealmModelCollection(collection), OsSet.ExternalCollectionOperation.RETAIN_ALL);
    }

    @Override // p000.BG1
    /* renamed from: J */
    public RealmQuery mo22545J() {
        return new RealmQuery(this.f339a, this.f340b, this.f341c);
    }

    @Override // p000.BG1
    /* renamed from: K */
    public boolean mo585a(RealmModel realmModel) {
        return this.f340b.addRow(((RealmObjectProxy) m22541N(realmModel)).realmGet$proxyState().getRow$realm().getObjectKey());
    }

    /* renamed from: N */
    public final RealmModel m22541N(RealmModel realmModel) {
        if (realmModel != null) {
            if (CollectionUtils.m29751a(this.f339a, realmModel, this.f341c.getName(), "set")) {
                return CollectionUtils.copyToRealm(this.f339a, realmModel);
            }
            return realmModel;
        }
        throw new NullPointerException("This set does not permit null values.");
    }

    @Override // p000.BG1
    /* renamed from: c */
    public boolean mo584c(Collection collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(m22541N((RealmModel) it.next()));
        }
        return this.f340b.collectionFunnel(NativeRealmAnyCollection.newRealmModelCollection(arrayList), OsSet.ExternalCollectionOperation.ADD_ALL);
    }

    @Override // p000.BG1
    /* renamed from: i */
    public boolean mo583i(Collection collection) {
        m22543L(collection);
        return this.f340b.collectionFunnel(NativeRealmAnyCollection.newRealmModelCollection(collection), OsSet.ExternalCollectionOperation.CONTAINS_ALL);
    }

    @Override // p000.BG1
    /* renamed from: j */
    public boolean mo582j(Object obj) {
        m22542M((RealmModel) obj);
        return this.f340b.containsRow(((RealmObjectProxy) obj).realmGet$proxyState().getRow$realm().getObjectKey());
    }
}
