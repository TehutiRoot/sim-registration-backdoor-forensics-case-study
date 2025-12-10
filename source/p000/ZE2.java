package p000;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: ZE2 */
/* loaded from: classes3.dex */
public final class ZE2 implements Iterator {

    /* renamed from: a */
    public int f7991a;

    /* renamed from: b */
    public boolean f7992b;

    /* renamed from: c */
    public Iterator f7993c;

    /* renamed from: d */
    public final /* synthetic */ AbstractC23275zE2 f7994d;

    public ZE2(AbstractC23275zE2 abstractC23275zE2) {
        this.f7994d = abstractC23275zE2;
        this.f7991a = -1;
    }

    /* renamed from: a */
    public final Iterator m65257a() {
        Map map;
        if (this.f7993c == null) {
            map = this.f7994d.f109010c;
            this.f7993c = map.entrySet().iterator();
        }
        return this.f7993c;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        List list;
        Map map;
        int i = this.f7991a + 1;
        list = this.f7994d.f109009b;
        if (i >= list.size()) {
            map = this.f7994d.f109010c;
            if (map.isEmpty() || !m65257a().hasNext()) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        List list;
        List list2;
        this.f7992b = true;
        int i = this.f7991a + 1;
        this.f7991a = i;
        list = this.f7994d.f109009b;
        if (i < list.size()) {
            list2 = this.f7994d.f109009b;
            return (Map.Entry) list2.get(this.f7991a);
        }
        return (Map.Entry) m65257a().next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        List list;
        if (this.f7992b) {
            this.f7992b = false;
            this.f7994d.m102q();
            int i = this.f7991a;
            list = this.f7994d.f109009b;
            if (i < list.size()) {
                AbstractC23275zE2 abstractC23275zE2 = this.f7994d;
                int i2 = this.f7991a;
                this.f7991a = i2 - 1;
                abstractC23275zE2.m107l(i2);
                return;
            }
            m65257a().remove();
            return;
        }
        throw new IllegalStateException("remove() was called before next()");
    }

    public /* synthetic */ ZE2(AbstractC23275zE2 abstractC23275zE2, C22415uE2 c22415uE2) {
        this(abstractC23275zE2);
    }
}
