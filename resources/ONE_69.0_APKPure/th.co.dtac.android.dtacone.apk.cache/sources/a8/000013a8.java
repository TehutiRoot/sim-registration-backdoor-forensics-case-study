package p000;

import java.util.Iterator;
import java.util.Map;

/* renamed from: Uf2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC18601Uf2 extends AbstractC19268bh2 {

    /* renamed from: a */
    public final Map f6683a;

    public AbstractC18601Uf2(Map map) {
        map.getClass();
        this.f6683a = map;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f6683a.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f6683a.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public abstract Iterator iterator();

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f6683a.size();
    }
}