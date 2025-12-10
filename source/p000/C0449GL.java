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

/* renamed from: GL */
/* loaded from: classes5.dex */
public class C0449GL extends AbstractC19706eW1 {

    /* renamed from: c */
    public final String f1907c;

    public C0449GL(BaseRealm baseRealm, OsMap osMap, String str) {
        super(baseRealm, osMap);
        this.f1907c = str;
    }

    @Override // p000.AbstractC19706eW1
    /* renamed from: a */
    public RealmDictionary mo892a(BaseRealm baseRealm) {
        return new RealmDictionary(baseRealm, this.f61523b, this.f1907c);
    }

    @Override // p000.AbstractC19706eW1
    /* renamed from: b */
    public Map.Entry mo31533b(BaseRealm baseRealm, long j, Object obj) {
        return new AbstractMap.SimpleImmutableEntry(obj, (DynamicRealmObject) baseRealm.m29757k(DynamicRealmObject.class, this.f1907c, j));
    }

    @Override // p000.AbstractC19706eW1
    /* renamed from: d */
    public Class mo891d() {
        return DynamicRealmObject.class;
    }

    @Override // p000.AbstractC19706eW1
    /* renamed from: e */
    public String mo890e() {
        return this.f1907c;
    }

    @Override // p000.AbstractC19706eW1
    /* renamed from: f */
    public Collection mo889f() {
        return m68249j(this.f61522a, this.f61523b.tableAndValuePtrs(), this.f1907c);
    }

    @Override // p000.AbstractC19706eW1
    /* renamed from: g */
    public Set mo888g() {
        return new HashSet(m68249j(this.f61522a, this.f61523b.tableAndKeyPtrs(), this.f1907c));
    }

    @Override // p000.AbstractC19706eW1
    /* renamed from: i */
    public DynamicRealmObject mo31532c(BaseRealm baseRealm, long j) {
        return (DynamicRealmObject) baseRealm.m29757k(DynamicRealmObject.class, this.f1907c, j);
    }

    /* renamed from: j */
    public final RealmResults m68249j(BaseRealm baseRealm, Pair pair, String str) {
        return new RealmResults(baseRealm, OsResults.createFromMap(baseRealm.sharedRealm, ((Long) pair.second).longValue()), str, false);
    }

    @Override // p000.AbstractC19706eW1
    /* renamed from: k */
    public DynamicRealmObject mo31531h(BaseRealm baseRealm, OsMap osMap, Object obj, DynamicRealmObject dynamicRealmObject) {
        long modelRowKey = osMap.getModelRowKey(obj);
        if (dynamicRealmObject == null) {
            osMap.put(obj, null);
        } else if (baseRealm.getSchema().m29581g(this.f1907c).isEmbedded()) {
            CollectionUtils.m29747e((Realm) baseRealm, dynamicRealmObject, osMap.createAndPutEmbeddedObject(obj));
        } else {
            if (CollectionUtils.m29751a(baseRealm, dynamicRealmObject, this.f1907c, CollectionUtils.DICTIONARY_TYPE)) {
                dynamicRealmObject = (DynamicRealmObject) CollectionUtils.copyToRealm(baseRealm, dynamicRealmObject);
            }
            osMap.putRow(obj, dynamicRealmObject.realmGet$proxyState().getRow$realm().getObjectKey());
        }
        if (modelRowKey == -1) {
            return null;
        }
        return (DynamicRealmObject) baseRealm.m29757k(DynamicRealmObject.class, this.f1907c, modelRowKey);
    }
}
