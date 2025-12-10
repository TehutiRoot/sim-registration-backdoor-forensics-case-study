package io.realm;

import io.realm.RealmMapEntrySet;
import io.realm.internal.OsMap;
import io.realm.internal.core.NativeRealmAny;
import java.util.Set;

/* renamed from: io.realm.t */
/* loaded from: classes5.dex */
public class C11468t extends AbstractC11404l {
    public C11468t(BaseRealm baseRealm, OsMap osMap, AbstractC19240bX1 abstractC19240bX1) {
        super(RealmAny.class, baseRealm, osMap, abstractC19240bX1, RealmMapEntrySet.IteratorType.MIXED);
    }

    @Override // io.realm.AbstractC11404l
    /* renamed from: d */
    public boolean mo29659d(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof RealmAny) {
            return this.f66969c.containsRealmAnyValue(((RealmAny) obj).m30047b());
        }
        throw new IllegalArgumentException("This dictionary can only contain 'RealmAny' values.");
    }

    @Override // io.realm.AbstractC11404l
    /* renamed from: e */
    public Set mo29658e() {
        return new RealmMapEntrySet(this.f66968b, this.f66969c, RealmMapEntrySet.IteratorType.MIXED, null);
    }

    @Override // io.realm.AbstractC11404l
    /* renamed from: s */
    public RealmAny mo29657g(Object obj) {
        long realmAnyPtr = this.f66969c.getRealmAnyPtr(obj);
        if (realmAnyPtr == -1) {
            return null;
        }
        return new RealmAny(RealmAnyOperator.m30044b(this.f66968b, new NativeRealmAny(realmAnyPtr)));
    }

    @Override // io.realm.AbstractC11404l
    /* renamed from: t */
    public RealmAny mo29656l(Object obj, RealmAny realmAny) {
        RealmAny mo29657g = mo29657g(obj);
        if (realmAny == null) {
            this.f66969c.put(obj, null);
        } else {
            this.f66969c.putRealmAny(obj, CollectionUtils.m30090b(this.f66968b, realmAny).m30047b());
        }
        return mo29657g;
    }
}