package p000;

import com.google.android.gms.internal.measurement.zzme;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: BG2 */
/* loaded from: classes3.dex */
public final class BG2 implements Iterator {

    /* renamed from: a */
    public int f349a = -1;

    /* renamed from: b */
    public boolean f350b;

    /* renamed from: c */
    public Iterator f351c;

    /* renamed from: d */
    public final /* synthetic */ MG2 f352d;

    public /* synthetic */ BG2(MG2 mg2, zzme zzmeVar) {
        this.f352d = mg2;
    }

    /* renamed from: a */
    public final Iterator m68956a() {
        Map map;
        if (this.f351c == null) {
            map = this.f352d.f3729c;
            this.f351c = map.entrySet().iterator();
        }
        return this.f351c;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        List list;
        Map map;
        int i = this.f349a + 1;
        list = this.f352d.f3728b;
        if (i >= list.size()) {
            map = this.f352d.f3729c;
            if (!map.isEmpty() && m68956a().hasNext()) {
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
        this.f350b = true;
        int i = this.f349a + 1;
        this.f349a = i;
        list = this.f352d.f3728b;
        if (i < list.size()) {
            list2 = this.f352d.f3728b;
            return (Map.Entry) list2.get(this.f349a);
        }
        return (Map.Entry) m68956a().next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        List list;
        if (this.f350b) {
            this.f350b = false;
            this.f352d.m67406o();
            int i = this.f349a;
            list = this.f352d.f3728b;
            if (i < list.size()) {
                MG2 mg2 = this.f352d;
                int i2 = this.f349a;
                this.f349a = i2 - 1;
                mg2.m67408m(i2);
                return;
            }
            m68956a().remove();
            return;
        }
        throw new IllegalStateException("remove() was called before next()");
    }
}
