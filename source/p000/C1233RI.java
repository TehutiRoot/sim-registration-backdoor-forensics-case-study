package p000;

import io.realm.AbstractC11417l;
import io.realm.BaseRealm;
import io.realm.MapChangeSet;
import io.realm.RealmDictionary;
import io.realm.internal.util.Pair;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* renamed from: RI */
/* loaded from: classes5.dex */
public class C1233RI extends AbstractC17683Gn0 {
    public C1233RI(BaseRealm baseRealm, AbstractC11417l abstractC11417l, AbstractC19706eW1 abstractC19706eW1) {
        super(baseRealm, abstractC11417l, abstractC19706eW1);
    }

    @Override // p000.AbstractC17683Gn0
    /* renamed from: c */
    public MapChangeSet mo66466c(long j) {
        return new VM1(j);
    }

    @Override // p000.AbstractC17683Gn0
    /* renamed from: e */
    public boolean mo66465e(Object obj) {
        if (obj != null) {
            if (m68182j(obj, String.class)) {
                return this.f2006b.m29401b(obj);
            }
            throw new ClassCastException("Only String keys can be used with 'containsKey'.");
        }
        throw new NullPointerException("Null keys are not allowed when calling 'containsKey'.");
    }

    @Override // p000.AbstractC17683Gn0, java.util.Map
    public Set entrySet() {
        return this.f2006b.mo29318e();
    }

    @Override // java.util.Map
    public Object get(Object obj) {
        if (obj != null) {
            if (m68182j(obj, String.class)) {
                return this.f2006b.mo29317g((String) obj);
            }
            throw new ClassCastException("Only String keys can be used with 'containsKey'.");
        }
        throw new NullPointerException("Null keys are not allowed when calling 'get'.");
    }

    @Override // p000.AbstractC17683Gn0
    /* renamed from: n */
    public void mo66463n(Map map) {
        for (Map.Entry entry : map.entrySet()) {
            if (((String) entry.getKey()) == null) {
                throw new NullPointerException("Null keys are not allowed.");
            }
        }
    }

    @Override // p000.AbstractC17683Gn0
    /* renamed from: o */
    public RealmDictionary mo66464g(Pair pair) {
        return this.f2007c.mo892a((BaseRealm) pair.first);
    }

    @Override // p000.AbstractC17683Gn0, java.util.Map
    /* renamed from: p */
    public Object put(String str, Object obj) {
        if (str != null) {
            try {
                return this.f2006b.mo29316l(str, obj);
            } catch (IllegalStateException e) {
                String message = e.getMessage();
                Objects.requireNonNull(message);
                if (message.contains("Data type mismatch")) {
                    throw new NullPointerException("Cannot insert null values in a dictionary marked with '@Required'.");
                }
                throw e;
            }
        }
        throw new NullPointerException("Null keys are not allowed.");
    }
}
