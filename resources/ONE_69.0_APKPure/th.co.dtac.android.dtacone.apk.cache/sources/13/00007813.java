package p000;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: bJ2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C19209bJ2 {

    /* renamed from: a */
    public final ConcurrentHashMap f39063a = new ConcurrentHashMap(16, 0.75f, 10);

    /* renamed from: b */
    public final ReferenceQueue f39064b = new ReferenceQueue();

    /* renamed from: a */
    public final List m51960a(Throwable th2, boolean z) {
        Reference poll = this.f39064b.poll();
        while (poll != null) {
            this.f39063a.remove(poll);
            poll = this.f39064b.poll();
        }
        List list = (List) this.f39063a.get(new ZI2(th2, null));
        if (!z) {
            return list;
        }
        if (list != null) {
            return list;
        }
        Vector vector = new Vector(2);
        List list2 = (List) this.f39063a.putIfAbsent(new ZI2(th2, this.f39064b), vector);
        if (list2 == null) {
            return vector;
        }
        return list2;
    }
}