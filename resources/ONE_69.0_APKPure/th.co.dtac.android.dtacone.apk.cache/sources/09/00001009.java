package p000;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: Qs2 */
/* loaded from: classes3.dex */
public final class Qs2 implements Iterator {

    /* renamed from: a */
    public int f5342a = -1;

    /* renamed from: b */
    public boolean f5343b;

    /* renamed from: c */
    public Iterator f5344c;

    /* renamed from: d */
    public final /* synthetic */ AbstractC21207mt2 f5345d;

    /* renamed from: a */
    public final Iterator m66722a() {
        Map map;
        if (this.f5344c == null) {
            map = this.f5345d.f72196c;
            this.f5344c = map.entrySet().iterator();
        }
        return this.f5344c;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        List list;
        Map map;
        int i = this.f5342a + 1;
        list = this.f5345d.f72195b;
        if (i >= list.size()) {
            map = this.f5345d.f72196c;
            if (!map.isEmpty() && m66722a().hasNext()) {
                return true;
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        List list;
        List list2;
        this.f5343b = true;
        int i = this.f5342a + 1;
        this.f5342a = i;
        list = this.f5345d.f72195b;
        if (i < list.size()) {
            list2 = this.f5345d.f72195b;
            return (Map.Entry) list2.get(this.f5342a);
        }
        return (Map.Entry) m66722a().next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        List list;
        if (this.f5343b) {
            this.f5343b = false;
            this.f5345d.m26466o();
            int i = this.f5342a;
            list = this.f5345d.f72195b;
            if (i < list.size()) {
                AbstractC21207mt2 abstractC21207mt2 = this.f5345d;
                int i2 = this.f5342a;
                this.f5342a = i2 - 1;
                abstractC21207mt2.m26468m(i2);
                return;
            }
            m66722a().remove();
            return;
        }
        throw new IllegalStateException("remove() was called before next()");
    }
}