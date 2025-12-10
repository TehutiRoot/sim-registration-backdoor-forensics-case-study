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

/* renamed from: jj0  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C20656jj0 extends C22313tG1 {
    public C20656jj0(BaseRealm baseRealm, OsMap osMap, Class cls, Class cls2) {
        super(baseRealm, osMap, cls, cls2);
    }

    @Override // p000.AbstractC19240bX1
    /* renamed from: b */
    public Map.Entry mo29476b(BaseRealm baseRealm, long j, Object obj) {
        return new AbstractMap.SimpleImmutableEntry(obj, baseRealm.m30097k(this.f80133d, null, j));
    }

    @Override // p000.AbstractC19240bX1
    /* renamed from: j */
    public RealmModel mo29475c(BaseRealm baseRealm, long j) {
        return baseRealm.m30097k(this.f80133d, null, j);
    }

    @Override // p000.AbstractC19240bX1
    /* renamed from: k */
    public RealmModel mo29474h(BaseRealm baseRealm, OsMap osMap, Object obj, RealmModel realmModel) {
        long modelRowKey = osMap.getModelRowKey(obj);
        if (realmModel == null) {
            osMap.put(obj, null);
        } else if (baseRealm.getSchema().m29922f(this.f80133d).isEmbedded()) {
            CollectionUtils.m30087e((Realm) baseRealm, realmModel, osMap.createAndPutEmbeddedObject(obj));
        } else {
            if (CollectionUtils.m30091a(baseRealm, realmModel, this.f80133d.getSimpleName(), CollectionUtils.DICTIONARY_TYPE)) {
                realmModel = CollectionUtils.copyToRealm(baseRealm, realmModel);
            }
            osMap.putRow(obj, ((RealmObjectProxy) realmModel).realmGet$proxyState().getRow$realm().getObjectKey());
        }
        if (modelRowKey == -1) {
            return null;
        }
        return baseRealm.m30098j(this.f80133d, modelRowKey, false, new ArrayList());
    }
}