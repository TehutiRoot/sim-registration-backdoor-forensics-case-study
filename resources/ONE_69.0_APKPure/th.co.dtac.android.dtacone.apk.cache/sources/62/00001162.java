package p000;

import io.realm.AbstractC11404l;
import io.realm.BaseRealm;
import io.realm.MapChangeSet;
import io.realm.RealmDictionary;
import io.realm.internal.util.Pair;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* renamed from: SI */
/* loaded from: classes5.dex */
public class C1282SI extends AbstractC18103Mn0 {
    public C1282SI(BaseRealm baseRealm, AbstractC11404l abstractC11404l, AbstractC19240bX1 abstractC19240bX1) {
        super(baseRealm, abstractC11404l, abstractC19240bX1);
    }

    @Override // p000.AbstractC18103Mn0
    /* renamed from: c */
    public MapChangeSet mo66529c(long j) {
        return new SN1(j);
    }

    @Override // p000.AbstractC18103Mn0
    /* renamed from: e */
    public boolean mo66528e(Object obj) {
        if (obj != null) {
            if (m67315j(obj, String.class)) {
                return this.f3969b.m29741b(obj);
            }
            throw new ClassCastException("Only String keys can be used with 'containsKey'.");
        }
        throw new NullPointerException("Null keys are not allowed when calling 'containsKey'.");
    }

    @Override // p000.AbstractC18103Mn0, java.util.Map
    public Set entrySet() {
        return this.f3969b.mo29658e();
    }

    @Override // java.util.Map
    public Object get(Object obj) {
        if (obj != null) {
            if (m67315j(obj, String.class)) {
                return this.f3969b.mo29657g((String) obj);
            }
            throw new ClassCastException("Only String keys can be used with 'containsKey'.");
        }
        throw new NullPointerException("Null keys are not allowed when calling 'get'.");
    }

    @Override // p000.AbstractC18103Mn0
    /* renamed from: n */
    public void mo66526n(Map map) {
        for (Map.Entry entry : map.entrySet()) {
            if (((String) entry.getKey()) == null) {
                throw new NullPointerException("Null keys are not allowed.");
            }
        }
    }

    @Override // p000.AbstractC18103Mn0
    /* renamed from: o */
    public RealmDictionary mo66527g(Pair pair) {
        return this.f3970c.mo22718a((BaseRealm) pair.first);
    }

    @Override // p000.AbstractC18103Mn0, java.util.Map
    /* renamed from: p */
    public Object put(String str, Object obj) {
        if (str != null) {
            try {
                return this.f3969b.mo29656l(str, obj);
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