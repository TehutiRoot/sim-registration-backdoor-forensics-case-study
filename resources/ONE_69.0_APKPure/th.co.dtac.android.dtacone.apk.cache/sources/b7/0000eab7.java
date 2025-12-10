package p000;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: mm2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C21186mm2 implements Iterator {

    /* renamed from: a */
    public int f72129a;

    /* renamed from: b */
    public Iterator f72130b;

    /* renamed from: c */
    public final /* synthetic */ AbstractC19802em2 f72131c;

    public C21186mm2(AbstractC19802em2 abstractC19802em2) {
        List list;
        this.f72131c = abstractC19802em2;
        list = abstractC19802em2.f61658b;
        this.f72129a = list.size();
    }

    /* renamed from: a */
    public final Iterator m26572a() {
        Map map;
        if (this.f72130b == null) {
            map = this.f72131c.f61662f;
            this.f72130b = map.entrySet().iterator();
        }
        return this.f72130b;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        List list;
        int i = this.f72129a;
        if (i > 0) {
            list = this.f72131c.f61658b;
            if (i <= list.size()) {
                return true;
            }
        }
        if (m26572a().hasNext()) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        List list;
        Object obj;
        if (!m26572a().hasNext()) {
            list = this.f72131c.f61658b;
            int i = this.f72129a - 1;
            this.f72129a = i;
            obj = list.get(i);
        } else {
            obj = m26572a().next();
        }
        return (Map.Entry) obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    public /* synthetic */ C21186mm2(AbstractC19802em2 abstractC19802em2, C20494im2 c20494im2) {
        this(abstractC19802em2);
    }
}