package p000;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: UL2 */
/* loaded from: classes3.dex */
public final class UL2 implements Iterator {

    /* renamed from: a */
    public int f6292a;

    /* renamed from: b */
    public Iterator f6293b;

    /* renamed from: c */
    public final /* synthetic */ SL2 f6294c;

    public UL2(SL2 sl2) {
        List list;
        this.f6294c = sl2;
        list = sl2.f5597b;
        this.f6292a = list.size();
    }

    /* renamed from: a */
    public final Iterator m66064a() {
        Map map;
        if (this.f6293b == null) {
            map = this.f6294c.f5601f;
            this.f6293b = map.entrySet().iterator();
        }
        return this.f6293b;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        List list;
        int i = this.f6292a;
        if (i > 0) {
            list = this.f6294c.f5597b;
            if (i <= list.size()) {
                return true;
            }
        }
        if (m66064a().hasNext()) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        List list;
        if (!m66064a().hasNext()) {
            list = this.f6294c.f5597b;
            int i = this.f6292a - 1;
            this.f6292a = i;
            return (Map.Entry) list.get(i);
        }
        return (Map.Entry) m66064a().next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    public /* synthetic */ UL2(SL2 sl2, RL2 rl2) {
        this(sl2);
    }
}
