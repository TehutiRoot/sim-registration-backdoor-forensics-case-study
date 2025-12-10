package p000;

import io.realm.BaseRealm;
import io.realm.CollectionUtils;
import io.realm.Realm;
import io.realm.RealmModel;
import io.realm.internal.OsMap;
import io.realm.internal.RealmObjectProxy;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Map;

/* renamed from: dj0  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C19568dj0 extends C22761wF1 {
    public C19568dj0(BaseRealm baseRealm, OsMap osMap, Class cls, Class cls2) {
        super(baseRealm, osMap, cls, cls2);
    }

    @Override // p000.AbstractC19706eW1
    /* renamed from: b */
    public Map.Entry mo31533b(BaseRealm baseRealm, long j, Object obj) {
        return new AbstractMap.SimpleImmutableEntry(obj, baseRealm.m29757k(this.f107955d, null, j));
    }

    @Override // p000.AbstractC19706eW1
    /* renamed from: j */
    public RealmModel mo31532c(BaseRealm baseRealm, long j) {
        return baseRealm.m29757k(this.f107955d, null, j);
    }

    @Override // p000.AbstractC19706eW1
    /* renamed from: k */
    public RealmModel mo31531h(BaseRealm baseRealm, OsMap osMap, Object obj, RealmModel realmModel) {
        long modelRowKey = osMap.getModelRowKey(obj);
        if (realmModel == null) {
            osMap.put(obj, null);
        } else if (baseRealm.getSchema().m29582f(this.f107955d).isEmbedded()) {
            CollectionUtils.m29747e((Realm) baseRealm, realmModel, osMap.createAndPutEmbeddedObject(obj));
        } else {
            if (CollectionUtils.m29751a(baseRealm, realmModel, this.f107955d.getSimpleName(), CollectionUtils.DICTIONARY_TYPE)) {
                realmModel = CollectionUtils.copyToRealm(baseRealm, realmModel);
            }
            osMap.putRow(obj, ((RealmObjectProxy) realmModel).realmGet$proxyState().getRow$realm().getObjectKey());
        }
        if (modelRowKey == -1) {
            return null;
        }
        return baseRealm.m29758j(this.f107955d, modelRowKey, false, new ArrayList());
    }
}
