package p000;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.Set;

/* renamed from: gg2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC20130gg2 extends AbstractMap {

    /* renamed from: a */
    public transient Set f62242a;

    /* renamed from: b */
    public transient Collection f62243b;

    /* renamed from: a */
    public abstract Set mo31358a();

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        Set set = this.f62242a;
        if (set == null) {
            Set mo31358a = mo31358a();
            this.f62242a = mo31358a;
            return mo31358a;
        }
        return set;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        Collection collection = this.f62243b;
        if (collection == null) {
            C18925Zf2 c18925Zf2 = new C18925Zf2(this);
            this.f62243b = c18925Zf2;
            return c18925Zf2;
        }
        return collection;
    }
}