package p000;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.Set;

/* renamed from: Of2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC18174Of2 extends AbstractMap {

    /* renamed from: a */
    public transient Set f4456a;

    /* renamed from: b */
    public transient Collection f4457b;

    /* renamed from: a */
    public abstract Set mo46724a();

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        Set set = this.f4456a;
        if (set == null) {
            Set mo46724a = mo46724a();
            this.f4456a = mo46724a;
            return mo46724a;
        }
        return set;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        Collection collection = this.f4457b;
        if (collection == null) {
            C21450of2 c21450of2 = new C21450of2(this);
            this.f4457b = c21450of2;
            return c21450of2;
        }
        return collection;
    }
}
