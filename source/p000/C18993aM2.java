package p000;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: aM2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C18993aM2 implements Iterator {

    /* renamed from: a */
    public int f8315a;

    /* renamed from: b */
    public boolean f8316b;

    /* renamed from: c */
    public Iterator f8317c;

    /* renamed from: d */
    public final /* synthetic */ SL2 f8318d;

    public C18993aM2(SL2 sl2) {
        this.f8318d = sl2;
        this.f8315a = -1;
    }

    /* renamed from: a */
    public final Iterator m65106a() {
        Map map;
        if (this.f8317c == null) {
            map = this.f8318d.f5598c;
            this.f8317c = map.entrySet().iterator();
        }
        return this.f8317c;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        List list;
        Map map;
        int i = this.f8315a + 1;
        list = this.f8318d.f5597b;
        if (i >= list.size()) {
            map = this.f8318d.f5598c;
            if (map.isEmpty() || !m65106a().hasNext()) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        List list;
        List list2;
        this.f8316b = true;
        int i = this.f8315a + 1;
        this.f8315a = i;
        list = this.f8318d.f5597b;
        if (i < list.size()) {
            list2 = this.f8318d.f5597b;
            return (Map.Entry) list2.get(this.f8315a);
        }
        return (Map.Entry) m65106a().next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        List list;
        if (this.f8316b) {
            this.f8316b = false;
            this.f8318d.m66336q();
            int i = this.f8315a;
            list = this.f8318d.f5597b;
            if (i < list.size()) {
                SL2 sl2 = this.f8318d;
                int i2 = this.f8315a;
                this.f8315a = i2 - 1;
                sl2.m66341l(i2);
                return;
            }
            m65106a().remove();
            return;
        }
        throw new IllegalStateException("remove() was called before next()");
    }

    public /* synthetic */ C18993aM2(SL2 sl2, RL2 rl2) {
        this(sl2);
    }
}
