package p000;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: XM2 */
/* loaded from: classes3.dex */
public final class XM2 implements Iterator {

    /* renamed from: a */
    public int f7541a;

    /* renamed from: b */
    public boolean f7542b;

    /* renamed from: c */
    public Iterator f7543c;

    /* renamed from: d */
    public final /* synthetic */ PM2 f7544d;

    public XM2(PM2 pm2) {
        this.f7544d = pm2;
        this.f7541a = -1;
    }

    /* renamed from: a */
    public final Iterator m65612a() {
        Map map;
        if (this.f7543c == null) {
            map = this.f7544d.f4778c;
            this.f7543c = map.entrySet().iterator();
        }
        return this.f7543c;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        List list;
        Map map;
        int i = this.f7541a + 1;
        list = this.f7544d.f4777b;
        if (i >= list.size()) {
            map = this.f7544d.f4778c;
            if (map.isEmpty() || !m65612a().hasNext()) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        List list;
        List list2;
        this.f7542b = true;
        int i = this.f7541a + 1;
        this.f7541a = i;
        list = this.f7544d.f4777b;
        if (i < list.size()) {
            list2 = this.f7544d.f4777b;
            return (Map.Entry) list2.get(this.f7541a);
        }
        return (Map.Entry) m65612a().next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        List list;
        if (this.f7542b) {
            this.f7542b = false;
            this.f7544d.m66972q();
            int i = this.f7541a;
            list = this.f7544d.f4777b;
            if (i < list.size()) {
                PM2 pm2 = this.f7544d;
                int i2 = this.f7541a;
                this.f7541a = i2 - 1;
                pm2.m66977l(i2);
                return;
            }
            m65612a().remove();
            return;
        }
        throw new IllegalStateException("remove() was called before next()");
    }

    public /* synthetic */ XM2(PM2 pm2, OM2 om2) {
        this(pm2);
    }
}