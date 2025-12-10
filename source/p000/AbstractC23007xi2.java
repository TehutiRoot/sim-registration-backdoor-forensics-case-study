package p000;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.Set;

/* renamed from: xi2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC23007xi2 extends AbstractMap {

    /* renamed from: a */
    public transient Set f108474a;

    /* renamed from: b */
    public transient Collection f108475b;

    /* renamed from: a */
    public abstract Set mo403a();

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        Set set = this.f108474a;
        if (set == null) {
            Set mo403a = mo403a();
            this.f108474a = mo403a;
            return mo403a;
        }
        return set;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        Collection collection = this.f108475b;
        if (collection == null) {
            C22147si2 c22147si2 = new C22147si2(this);
            this.f108475b = c22147si2;
            return c22147si2;
        }
        return collection;
    }
}
