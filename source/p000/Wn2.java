package p000;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: Wn2 */
/* loaded from: classes3.dex */
public final class Wn2 {

    /* renamed from: a */
    public final ConcurrentHashMap f7299a = new ConcurrentHashMap(16, 0.75f, 10);

    /* renamed from: b */
    public final ReferenceQueue f7300b = new ReferenceQueue();

    /* renamed from: a */
    public final List m65565a(Throwable th2, boolean z) {
        Reference poll = this.f7300b.poll();
        while (poll != null) {
            this.f7299a.remove(poll);
            poll = this.f7300b.poll();
        }
        List list = (List) this.f7299a.get(new Qn2(th2, null));
        if (!z) {
            return list;
        }
        if (list != null) {
            return list;
        }
        Vector vector = new Vector(2);
        List list2 = (List) this.f7299a.putIfAbsent(new Qn2(th2, this.f7300b), vector);
        if (list2 == null) {
            return vector;
        }
        return list2;
    }
}
