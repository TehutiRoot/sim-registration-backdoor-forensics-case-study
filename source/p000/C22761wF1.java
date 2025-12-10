package p000;

import io.realm.BaseRealm;
import io.realm.CollectionUtils;
import io.realm.RealmDictionary;
import io.realm.RealmResults;
import io.realm.internal.OsMap;
import io.realm.internal.OsResults;
import io.realm.internal.util.Pair;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

/* renamed from: wF1  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C22761wF1 extends AbstractC19706eW1 {

    /* renamed from: c */
    public final Class f107954c;

    /* renamed from: d */
    public final Class f107955d;

    public C22761wF1(BaseRealm baseRealm, OsMap osMap, Class cls, Class cls2) {
        super(baseRealm, osMap);
        this.f107954c = cls;
        this.f107955d = cls2;
    }

    @Override // p000.AbstractC19706eW1
    /* renamed from: a */
    public RealmDictionary mo892a(BaseRealm baseRealm) {
        return new RealmDictionary(baseRealm, this.f61523b, this.f107955d);
    }

    @Override // p000.AbstractC19706eW1
    /* renamed from: d */
    public Class mo891d() {
        return this.f107955d;
    }

    @Override // p000.AbstractC19706eW1
    /* renamed from: e */
    public String mo890e() {
        return this.f107955d.getSimpleName();
    }

    @Override // p000.AbstractC19706eW1
    /* renamed from: f */
    public Collection mo889f() {
        return m887i(this.f61522a, this.f61523b.tableAndValuePtrs(), !CollectionUtils.m29749c(this.f107955d), this.f107955d);
    }

    @Override // p000.AbstractC19706eW1
    /* renamed from: g */
    public Set mo888g() {
        return new HashSet(m887i(this.f61522a, this.f61523b.tableAndKeyPtrs(), true, this.f107954c));
    }

    /* renamed from: i */
    public final RealmResults m887i(BaseRealm baseRealm, Pair pair, boolean z, Class cls) {
        return new RealmResults(baseRealm, OsResults.createFromMap(baseRealm.sharedRealm, ((Long) pair.second).longValue()), cls, z);
    }
}
