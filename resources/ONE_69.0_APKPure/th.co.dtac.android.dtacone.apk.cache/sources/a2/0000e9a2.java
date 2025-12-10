package p000;

import java.util.Iterator;
import java.util.Map;

/* renamed from: lj2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC21004lj2 extends AbstractC23429zk2 {

    /* renamed from: a */
    public final Map f71786a;

    public AbstractC21004lj2(Map map) {
        this.f71786a = map;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f71786a.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f71786a.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public abstract Iterator iterator();

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f71786a.size();
    }
}