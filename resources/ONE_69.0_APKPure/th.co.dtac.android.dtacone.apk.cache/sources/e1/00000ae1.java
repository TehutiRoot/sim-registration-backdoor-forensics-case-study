package p000;

import com.fasterxml.jackson.core.util.BufferRecycler;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: LT1 */
/* loaded from: classes3.dex */
public class LT1 {

    /* renamed from: a */
    public final Object f3619a = new Object();

    /* renamed from: b */
    public final Map f3620b = new ConcurrentHashMap();

    /* renamed from: c */
    public final ReferenceQueue f3621c = new ReferenceQueue();

    /* renamed from: LT1$a */
    /* loaded from: classes3.dex */
    public static final class C0800a {

        /* renamed from: a */
        public static final LT1 f3622a = new LT1();
    }

    /* renamed from: a */
    public static LT1 m67554a() {
        return C0800a.f3622a;
    }

    /* renamed from: b */
    public int m67553b() {
        int i;
        synchronized (this.f3619a) {
            try {
                m67552c();
                i = 0;
                for (SoftReference softReference : this.f3620b.keySet()) {
                    softReference.clear();
                    i++;
                }
                this.f3620b.clear();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return i;
    }

    /* renamed from: c */
    public final void m67552c() {
        while (true) {
            SoftReference softReference = (SoftReference) this.f3621c.poll();
            if (softReference != null) {
                this.f3620b.remove(softReference);
            } else {
                return;
            }
        }
    }

    /* renamed from: d */
    public SoftReference m67551d(BufferRecycler bufferRecycler) {
        SoftReference softReference = new SoftReference(bufferRecycler, this.f3621c);
        this.f3620b.put(softReference, Boolean.TRUE);
        m67552c();
        return softReference;
    }
}