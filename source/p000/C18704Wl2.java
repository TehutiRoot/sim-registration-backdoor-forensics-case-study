package p000;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: Wl2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C18704Wl2 implements Iterator {

    /* renamed from: a */
    public int f7285a;

    /* renamed from: b */
    public boolean f7286b;

    /* renamed from: c */
    public Iterator f7287c;

    /* renamed from: d */
    public final /* synthetic */ AbstractC20264hl2 f7288d;

    public C18704Wl2(AbstractC20264hl2 abstractC20264hl2) {
        this.f7288d = abstractC20264hl2;
        this.f7285a = -1;
    }

    /* renamed from: a */
    public final Iterator m65566a() {
        Map map;
        if (this.f7287c == null) {
            map = this.f7288d.f62587c;
            this.f7287c = map.entrySet().iterator();
        }
        return this.f7287c;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        List list;
        Map map;
        int i = this.f7285a + 1;
        list = this.f7288d.f62586b;
        if (i >= list.size()) {
            map = this.f7288d.f62587c;
            if (map.isEmpty() || !m65566a().hasNext()) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        List list;
        Object next;
        List list2;
        this.f7286b = true;
        int i = this.f7285a + 1;
        this.f7285a = i;
        list = this.f7288d.f62586b;
        if (i < list.size()) {
            list2 = this.f7288d.f62586b;
            next = list2.get(this.f7285a);
        } else {
            next = m65566a().next();
        }
        return (Map.Entry) next;
    }

    @Override // java.util.Iterator
    public final void remove() {
        List list;
        if (this.f7286b) {
            this.f7286b = false;
            this.f7288d.m30752p();
            int i = this.f7285a;
            list = this.f7288d.f62586b;
            if (i < list.size()) {
                AbstractC20264hl2 abstractC20264hl2 = this.f7288d;
                int i2 = this.f7285a;
                this.f7285a = i2 - 1;
                abstractC20264hl2.m30759i(i2);
                return;
            }
            m65566a().remove();
            return;
        }
        throw new IllegalStateException("remove() was called before next()");
    }

    public /* synthetic */ C18704Wl2(AbstractC20264hl2 abstractC20264hl2, C20952ll2 c20952ll2) {
        this(abstractC20264hl2);
    }
}
