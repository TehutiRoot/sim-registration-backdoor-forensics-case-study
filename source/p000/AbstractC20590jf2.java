package p000;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.Set;

/* renamed from: jf2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC20590jf2 extends AbstractMap {

    /* renamed from: a */
    public transient Set f67328a;

    /* renamed from: b */
    public transient Collection f67329b;

    /* renamed from: a */
    public abstract Set mo29161a();

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        Set set = this.f67328a;
        if (set == null) {
            Set mo29161a = mo29161a();
            this.f67328a = mo29161a;
            return mo29161a;
        }
        return set;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        Collection collection = this.f67329b;
        if (collection == null) {
            C19386cf2 c19386cf2 = new C19386cf2(this);
            this.f67329b = c19386cf2;
            return c19386cf2;
        }
        return collection;
    }
}
