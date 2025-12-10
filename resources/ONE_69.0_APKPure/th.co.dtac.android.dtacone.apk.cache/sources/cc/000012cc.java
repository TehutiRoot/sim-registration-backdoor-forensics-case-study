package p000;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: Tm2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C18557Tm2 implements Iterator {

    /* renamed from: a */
    public int f6415a;

    /* renamed from: b */
    public boolean f6416b;

    /* renamed from: c */
    public Iterator f6417c;

    /* renamed from: d */
    public final /* synthetic */ AbstractC19802em2 f6418d;

    public C18557Tm2(AbstractC19802em2 abstractC19802em2) {
        this.f6418d = abstractC19802em2;
        this.f6415a = -1;
    }

    /* renamed from: a */
    public final Iterator m66309a() {
        Map map;
        if (this.f6417c == null) {
            map = this.f6418d.f61659c;
            this.f6417c = map.entrySet().iterator();
        }
        return this.f6417c;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        List list;
        Map map;
        int i = this.f6415a + 1;
        list = this.f6418d.f61658b;
        if (i >= list.size()) {
            map = this.f6418d.f61659c;
            if (map.isEmpty() || !m66309a().hasNext()) {
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
        this.f6416b = true;
        int i = this.f6415a + 1;
        this.f6415a = i;
        list = this.f6418d.f61658b;
        if (i < list.size()) {
            list2 = this.f6418d.f61658b;
            next = list2.get(this.f6415a);
        } else {
            next = m66309a().next();
        }
        return (Map.Entry) next;
    }

    @Override // java.util.Iterator
    public final void remove() {
        List list;
        if (this.f6416b) {
            this.f6416b = false;
            this.f6418d.m31621p();
            int i = this.f6415a;
            list = this.f6418d.f61658b;
            if (i < list.size()) {
                AbstractC19802em2 abstractC19802em2 = this.f6418d;
                int i2 = this.f6415a;
                this.f6415a = i2 - 1;
                abstractC19802em2.m31628i(i2);
                return;
            }
            m66309a().remove();
            return;
        }
        throw new IllegalStateException("remove() was called before next()");
    }

    public /* synthetic */ C18557Tm2(AbstractC19802em2 abstractC19802em2, C20494im2 c20494im2) {
        this(abstractC19802em2);
    }
}