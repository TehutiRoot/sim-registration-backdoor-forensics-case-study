package p000;

import java.util.Iterator;
import java.util.Map;

/* renamed from: hg2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC20303hg2 extends AbstractC19960fh2 {

    /* renamed from: a */
    public final Map f62577a;

    public AbstractC20303hg2(Map map) {
        map.getClass();
        this.f62577a = map;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f62577a.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f62577a.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public abstract Iterator iterator();

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f62577a.size();
    }
}