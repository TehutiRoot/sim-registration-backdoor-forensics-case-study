package p000;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: HE2 */
/* loaded from: classes3.dex */
public final class HE2 implements Iterator {

    /* renamed from: a */
    public int f2149a;

    /* renamed from: b */
    public Iterator f2150b;

    /* renamed from: c */
    public final /* synthetic */ AbstractC23275zE2 f2151c;

    public HE2(AbstractC23275zE2 abstractC23275zE2) {
        List list;
        this.f2151c = abstractC23275zE2;
        list = abstractC23275zE2.f109009b;
        this.f2149a = list.size();
    }

    /* renamed from: a */
    public final Iterator m68114a() {
        Map map;
        if (this.f2150b == null) {
            map = this.f2151c.f109013f;
            this.f2150b = map.entrySet().iterator();
        }
        return this.f2150b;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        List list;
        int i = this.f2149a;
        if (i > 0) {
            list = this.f2151c.f109009b;
            if (i <= list.size()) {
                return true;
            }
        }
        if (m68114a().hasNext()) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        List list;
        if (!m68114a().hasNext()) {
            list = this.f2151c.f109009b;
            int i = this.f2149a - 1;
            this.f2149a = i;
            return (Map.Entry) list.get(i);
        }
        return (Map.Entry) m68114a().next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    public /* synthetic */ HE2(AbstractC23275zE2 abstractC23275zE2, C22415uE2 c22415uE2) {
        this(abstractC23275zE2);
    }
}
