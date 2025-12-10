package p000;

import java.util.Iterator;
import java.util.Map;

/* renamed from: oi2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC21459oi2 extends AbstractC17418Cj2 {

    /* renamed from: a */
    public final Map f72774a;

    public AbstractC21459oi2(Map map) {
        this.f72774a = map;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f72774a.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f72774a.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public abstract Iterator iterator();

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f72774a.size();
    }
}
