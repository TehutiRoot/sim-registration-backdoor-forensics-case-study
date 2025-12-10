package p000;

import java.util.Iterator;
import java.util.Map;

/* renamed from: kf2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC20762kf2 extends AbstractC20421ig2 {

    /* renamed from: a */
    public final Map f67972a;

    public AbstractC20762kf2(Map map) {
        map.getClass();
        this.f67972a = map;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f67972a.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f67972a.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public abstract Iterator iterator();

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f67972a.size();
    }
}
