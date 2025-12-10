package p000;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.Set;

/* renamed from: uj2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC22561uj2 extends AbstractMap {

    /* renamed from: a */
    public transient Set f107861a;

    /* renamed from: b */
    public transient Collection f107862b;

    /* renamed from: a */
    public abstract Set mo1069a();

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        Set set = this.f107861a;
        if (set == null) {
            Set mo1069a = mo1069a();
            this.f107861a = mo1069a;
            return mo1069a;
        }
        return set;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        Collection collection = this.f107862b;
        if (collection == null) {
            C21696pj2 c21696pj2 = new C21696pj2(this);
            this.f107862b = c21696pj2;
            return c21696pj2;
        }
        return collection;
    }
}