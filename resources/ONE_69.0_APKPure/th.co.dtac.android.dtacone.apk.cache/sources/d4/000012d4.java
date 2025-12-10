package p000;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: To2 */
/* loaded from: classes3.dex */
public final class To2 {

    /* renamed from: a */
    public final ConcurrentHashMap f6426a = new ConcurrentHashMap(16, 0.75f, 10);

    /* renamed from: b */
    public final ReferenceQueue f6427b = new ReferenceQueue();

    /* renamed from: a */
    public final List m66307a(Throwable th2, boolean z) {
        Reference poll = this.f6427b.poll();
        while (poll != null) {
            this.f6426a.remove(poll);
            poll = this.f6427b.poll();
        }
        List list = (List) this.f6426a.get(new No2(th2, null));
        if (!z) {
            return list;
        }
        if (list != null) {
            return list;
        }
        Vector vector = new Vector(2);
        List list2 = (List) this.f6426a.putIfAbsent(new No2(th2, this.f6427b), vector);
        if (list2 == null) {
            return vector;
        }
        return list2;
    }
}