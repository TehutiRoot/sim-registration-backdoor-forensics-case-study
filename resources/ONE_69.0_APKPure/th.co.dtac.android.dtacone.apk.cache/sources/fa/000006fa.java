package p000;

import io.realm.BaseRealm;
import io.realm.CollectionUtils;
import io.realm.DynamicRealmObject;
import io.realm.Realm;
import io.realm.RealmDictionary;
import io.realm.RealmResults;
import io.realm.internal.OsMap;
import io.realm.internal.OsResults;
import io.realm.internal.util.Pair;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: HL */
/* loaded from: classes5.dex */
public class C0512HL extends AbstractC19240bX1 {

    /* renamed from: c */
    public final String f2365c;

    public C0512HL(BaseRealm baseRealm, OsMap osMap, String str) {
        super(baseRealm, osMap);
        this.f2365c = str;
    }

    @Override // p000.AbstractC19240bX1
    /* renamed from: a */
    public RealmDictionary mo22718a(BaseRealm baseRealm) {
        return new RealmDictionary(baseRealm, this.f39127b, this.f2365c);
    }

    @Override // p000.AbstractC19240bX1
    /* renamed from: b */
    public Map.Entry mo29476b(BaseRealm baseRealm, long j, Object obj) {
        return new AbstractMap.SimpleImmutableEntry(obj, (DynamicRealmObject) baseRealm.m30097k(DynamicRealmObject.class, this.f2365c, j));
    }

    @Override // p000.AbstractC19240bX1
    /* renamed from: d */
    public Class mo22717d() {
        return DynamicRealmObject.class;
    }

    @Override // p000.AbstractC19240bX1
    /* renamed from: e */
    public String mo22716e() {
        return this.f2365c;
    }

    @Override // p000.AbstractC19240bX1
    /* renamed from: f */
    public Collection mo22715f() {
        return m68119j(this.f39126a, this.f39127b.tableAndValuePtrs(), this.f2365c);
    }

    @Override // p000.AbstractC19240bX1
    /* renamed from: g */
    public Set mo22714g() {
        return new HashSet(m68119j(this.f39126a, this.f39127b.tableAndKeyPtrs(), this.f2365c));
    }

    @Override // p000.AbstractC19240bX1
    /* renamed from: i */
    public DynamicRealmObject mo29475c(BaseRealm baseRealm, long j) {
        return (DynamicRealmObject) baseRealm.m30097k(DynamicRealmObject.class, this.f2365c, j);
    }

    /* renamed from: j */
    public final RealmResults m68119j(BaseRealm baseRealm, Pair pair, String str) {
        return new RealmResults(baseRealm, OsResults.createFromMap(baseRealm.sharedRealm, ((Long) pair.second).longValue()), str, false);
    }

    @Override // p000.AbstractC19240bX1
    /* renamed from: k */
    public DynamicRealmObject mo29474h(BaseRealm baseRealm, OsMap osMap, Object obj, DynamicRealmObject dynamicRealmObject) {
        long modelRowKey = osMap.getModelRowKey(obj);
        if (dynamicRealmObject == null) {
            osMap.put(obj, null);
        } else if (baseRealm.getSchema().m29921g(this.f2365c).isEmbedded()) {
            CollectionUtils.m30087e((Realm) baseRealm, dynamicRealmObject, osMap.createAndPutEmbeddedObject(obj));
        } else {
            if (CollectionUtils.m30091a(baseRealm, dynamicRealmObject, this.f2365c, CollectionUtils.DICTIONARY_TYPE)) {
                dynamicRealmObject = (DynamicRealmObject) CollectionUtils.copyToRealm(baseRealm, dynamicRealmObject);
            }
            osMap.putRow(obj, dynamicRealmObject.realmGet$proxyState().getRow$realm().getObjectKey());
        }
        if (modelRowKey == -1) {
            return null;
        }
        return (DynamicRealmObject) baseRealm.m30097k(DynamicRealmObject.class, this.f2365c, modelRowKey);
    }
}