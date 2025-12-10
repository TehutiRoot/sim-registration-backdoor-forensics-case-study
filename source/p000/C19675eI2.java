package p000;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: eI2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C19675eI2 {

    /* renamed from: a */
    public final ConcurrentHashMap f61462a = new ConcurrentHashMap(16, 0.75f, 10);

    /* renamed from: b */
    public final ReferenceQueue f61463b = new ReferenceQueue();

    /* renamed from: a */
    public final List m31581a(Throwable th2, boolean z) {
        Reference poll = this.f61463b.poll();
        while (poll != null) {
            this.f61462a.remove(poll);
            poll = this.f61463b.poll();
        }
        List list = (List) this.f61462a.get(new C19331cI2(th2, null));
        if (!z) {
            return list;
        }
        if (list != null) {
            return list;
        }
        Vector vector = new Vector(2);
        List list2 = (List) this.f61462a.putIfAbsent(new C19331cI2(th2, this.f61463b), vector);
        if (list2 == null) {
            return vector;
        }
        return list2;
    }
}
