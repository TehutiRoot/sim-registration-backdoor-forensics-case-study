package io.realm;

import io.realm.RealmAny;
import io.realm.internal.OsSet;
import io.realm.internal.RealmObjectProxy;
import io.realm.internal.core.NativeRealmAnyCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: io.realm.s */
/* loaded from: classes5.dex */
public class C11480s extends BG1 {
    public C11480s(BaseRealm baseRealm, OsSet osSet, Class cls) {
        super(baseRealm, osSet, cls);
    }

    @Override // p000.BG1
    /* renamed from: C */
    public boolean mo589C(Collection collection) {
        return this.f340b.collectionFunnel(m29332N(collection), OsSet.ExternalCollectionOperation.REMOVE_ALL);
    }

    @Override // p000.BG1
    /* renamed from: F */
    public boolean mo588F(Object obj) {
        RealmAny realmAny;
        if (obj == null) {
            realmAny = RealmAny.nullValue();
        } else {
            realmAny = (RealmAny) obj;
        }
        m29334L(realmAny);
        return this.f340b.removeRealmAny(realmAny.m29707b());
    }

    @Override // p000.BG1
    /* renamed from: H */
    public boolean mo587H(Collection collection) {
        return this.f340b.collectionFunnel(m29332N(collection), OsSet.ExternalCollectionOperation.RETAIN_ALL);
    }

    @Override // p000.BG1
    /* renamed from: K */
    public boolean mo585a(RealmAny realmAny) {
        return this.f340b.addRealmAny(m29333M(realmAny).m29707b());
    }

    /* renamed from: L */
    public final void m29334L(RealmAny realmAny) {
        try {
            realmAny.m29708a(this.f339a);
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException("RealmAny collection contains unmanaged objects.", e);
        }
    }

    /* renamed from: M */
    public final RealmAny m29333M(RealmAny realmAny) {
        if (realmAny == null) {
            return RealmAny.nullValue();
        }
        if (realmAny.getType() == RealmAny.Type.OBJECT) {
            RealmModel asRealmModel = realmAny.asRealmModel(RealmModel.class);
            if (CollectionUtils.m29751a(this.f339a, asRealmModel, this.f341c.getName(), "set")) {
                asRealmModel = CollectionUtils.copyToRealm(this.f339a, asRealmModel);
            }
            return RealmAny.valueOf((RealmObjectProxy) asRealmModel);
        }
        return realmAny;
    }

    /* renamed from: N */
    public final NativeRealmAnyCollection m29332N(Collection collection) {
        long[] jArr = new long[collection.size()];
        boolean[] zArr = new boolean[collection.size()];
        Iterator it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            RealmAny realmAny = (RealmAny) it.next();
            if (realmAny != null) {
                m29334L(realmAny);
                jArr[i] = realmAny.m29707b();
                zArr[i] = true;
            }
            i++;
        }
        return NativeRealmAnyCollection.newRealmAnyCollection(jArr, zArr);
    }

    @Override // p000.BG1
    /* renamed from: c */
    public boolean mo584c(Collection collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(m29333M((RealmAny) it.next()));
        }
        return this.f340b.collectionFunnel(m29332N(arrayList), OsSet.ExternalCollectionOperation.ADD_ALL);
    }

    @Override // p000.BG1
    /* renamed from: i */
    public boolean mo583i(Collection collection) {
        return this.f340b.collectionFunnel(m29332N(collection), OsSet.ExternalCollectionOperation.CONTAINS_ALL);
    }

    @Override // p000.BG1
    /* renamed from: j */
    public boolean mo582j(Object obj) {
        RealmAny realmAny;
        if (obj == null) {
            realmAny = RealmAny.nullValue();
        } else {
            realmAny = (RealmAny) obj;
        }
        m29334L(realmAny);
        return this.f340b.containsRealmAny(realmAny.m29707b());
    }
}
