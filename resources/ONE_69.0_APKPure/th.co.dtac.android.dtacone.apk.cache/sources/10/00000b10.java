package p000;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.Set;

/* renamed from: Lg2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC18019Lg2 extends AbstractMap {

    /* renamed from: a */
    public transient Set f3657a;

    /* renamed from: b */
    public transient Collection f3658b;

    /* renamed from: a */
    public abstract Set mo46715a();

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        Set set = this.f3657a;
        if (set == null) {
            Set mo46715a = mo46715a();
            this.f3657a = mo46715a;
            return mo46715a;
        }
        return set;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        Collection collection = this.f3658b;
        if (collection == null) {
            C20995lg2 c20995lg2 = new C20995lg2(this);
            this.f3658b = c20995lg2;
            return c20995lg2;
        }
        return collection;
    }
}