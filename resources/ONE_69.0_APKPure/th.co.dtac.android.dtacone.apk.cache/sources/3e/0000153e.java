package p000;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: WF2 */
/* loaded from: classes3.dex */
public final class WF2 implements Iterator {

    /* renamed from: a */
    public int f7234a;

    /* renamed from: b */
    public boolean f7235b;

    /* renamed from: c */
    public Iterator f7236c;

    /* renamed from: d */
    public final /* synthetic */ AbstractC22830wF2 f7237d;

    public WF2(AbstractC22830wF2 abstractC22830wF2) {
        this.f7237d = abstractC22830wF2;
        this.f7234a = -1;
    }

    /* renamed from: a */
    public final Iterator m65776a() {
        Map map;
        if (this.f7236c == null) {
            map = this.f7237d.f108380c;
            this.f7236c = map.entrySet().iterator();
        }
        return this.f7236c;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        List list;
        Map map;
        int i = this.f7234a + 1;
        list = this.f7237d.f108379b;
        if (i >= list.size()) {
            map = this.f7237d.f108380c;
            if (map.isEmpty() || !m65776a().hasNext()) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        List list;
        List list2;
        this.f7235b = true;
        int i = this.f7234a + 1;
        this.f7234a = i;
        list = this.f7237d.f108379b;
        if (i < list.size()) {
            list2 = this.f7237d.f108379b;
            return (Map.Entry) list2.get(this.f7234a);
        }
        return (Map.Entry) m65776a().next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        List list;
        if (this.f7235b) {
            this.f7235b = false;
            this.f7237d.m774q();
            int i = this.f7234a;
            list = this.f7237d.f108379b;
            if (i < list.size()) {
                AbstractC22830wF2 abstractC22830wF2 = this.f7237d;
                int i2 = this.f7234a;
                this.f7234a = i2 - 1;
                abstractC22830wF2.m779l(i2);
                return;
            }
            m65776a().remove();
            return;
        }
        throw new IllegalStateException("remove() was called before next()");
    }

    public /* synthetic */ WF2(AbstractC22830wF2 abstractC22830wF2, C21965rF2 c21965rF2) {
        this(abstractC22830wF2);
    }
}