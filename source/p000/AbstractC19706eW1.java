package p000;

import io.realm.BaseRealm;
import io.realm.RealmDictionary;
import io.realm.internal.OsMap;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* renamed from: eW1  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC19706eW1 {

    /* renamed from: a */
    public final BaseRealm f61522a;

    /* renamed from: b */
    public final OsMap f61523b;

    public AbstractC19706eW1(BaseRealm baseRealm, OsMap osMap) {
        this.f61522a = baseRealm;
        this.f61523b = osMap;
    }

    /* renamed from: a */
    public abstract RealmDictionary mo892a(BaseRealm baseRealm);

    /* renamed from: b */
    public Map.Entry mo31533b(BaseRealm baseRealm, long j, Object obj) {
        throw new UnsupportedOperationException("Function 'getModelEntry' can only be called from 'LinkSelectorForMap' instances.");
    }

    /* renamed from: c */
    public Object mo31532c(BaseRealm baseRealm, long j) {
        throw new UnsupportedOperationException("Function 'getRealmModel' can only be called from 'LinkSelectorForMap' instances.");
    }

    /* renamed from: d */
    public abstract Class mo891d();

    /* renamed from: e */
    public abstract String mo890e();

    /* renamed from: f */
    public abstract Collection mo889f();

    /* renamed from: g */
    public abstract Set mo888g();

    /* renamed from: h */
    public Object mo31531h(BaseRealm baseRealm, OsMap osMap, Object obj, Object obj2) {
        throw new UnsupportedOperationException("Function 'putRealmModel' can only be called from 'LinkSelectorForMap' instances.");
    }
}
