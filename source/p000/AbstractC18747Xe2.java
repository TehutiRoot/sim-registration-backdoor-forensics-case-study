package p000;

import java.util.Iterator;
import java.util.Map;

/* renamed from: Xe2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC18747Xe2 extends AbstractC19733eg2 {

    /* renamed from: a */
    public final Map f7539a;

    public AbstractC18747Xe2(Map map) {
        map.getClass();
        this.f7539a = map;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f7539a.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f7539a.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public abstract Iterator iterator();

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f7539a.size();
    }
}
