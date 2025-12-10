package p000;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: Tr2 */
/* loaded from: classes3.dex */
public final class Tr2 implements Iterator {

    /* renamed from: a */
    public int f6134a = -1;

    /* renamed from: b */
    public boolean f6135b;

    /* renamed from: c */
    public Iterator f6136c;

    /* renamed from: d */
    public final /* synthetic */ AbstractC21661ps2 f6137d;

    /* renamed from: a */
    public final Iterator m66164a() {
        Map map;
        if (this.f6136c == null) {
            map = this.f6137d.f76790c;
            this.f6136c = map.entrySet().iterator();
        }
        return this.f6136c;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        List list;
        Map map;
        int i = this.f6134a + 1;
        list = this.f6137d.f76789b;
        if (i >= list.size()) {
            map = this.f6137d.f76790c;
            if (!map.isEmpty() && m66164a().hasNext()) {
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
        this.f6135b = true;
        int i = this.f6134a + 1;
        this.f6134a = i;
        list = this.f6137d.f76789b;
        if (i < list.size()) {
            list2 = this.f6137d.f76789b;
            return (Map.Entry) list2.get(this.f6134a);
        }
        return (Map.Entry) m66164a().next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        List list;
        if (this.f6135b) {
            this.f6135b = false;
            this.f6137d.m23569o();
            int i = this.f6134a;
            list = this.f6137d.f76789b;
            if (i < list.size()) {
                AbstractC21661ps2 abstractC21661ps2 = this.f6137d;
                int i2 = this.f6134a;
                this.f6134a = i2 - 1;
                abstractC21661ps2.m23571m(i2);
                return;
            }
            m66164a().remove();
            return;
        }
        throw new IllegalStateException("remove() was called before next()");
    }
}
