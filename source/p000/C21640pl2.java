package p000;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: pl2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C21640pl2 implements Iterator {

    /* renamed from: a */
    public int f76751a;

    /* renamed from: b */
    public Iterator f76752b;

    /* renamed from: c */
    public final /* synthetic */ AbstractC20264hl2 f76753c;

    public C21640pl2(AbstractC20264hl2 abstractC20264hl2) {
        List list;
        this.f76753c = abstractC20264hl2;
        list = abstractC20264hl2.f62586b;
        this.f76751a = list.size();
    }

    /* renamed from: a */
    public final Iterator m23596a() {
        Map map;
        if (this.f76752b == null) {
            map = this.f76753c.f62590f;
            this.f76752b = map.entrySet().iterator();
        }
        return this.f76752b;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        List list;
        int i = this.f76751a;
        if (i > 0) {
            list = this.f76753c.f62586b;
            if (i <= list.size()) {
                return true;
            }
        }
        if (m23596a().hasNext()) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        List list;
        Object obj;
        if (!m23596a().hasNext()) {
            list = this.f76753c.f62586b;
            int i = this.f76751a - 1;
            this.f76751a = i;
            obj = list.get(i);
        } else {
            obj = m23596a().next();
        }
        return (Map.Entry) obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    public /* synthetic */ C21640pl2(AbstractC20264hl2 abstractC20264hl2, C20952ll2 c20952ll2) {
        this(abstractC20264hl2);
    }
}
