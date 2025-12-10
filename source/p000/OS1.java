package p000;

import com.fasterxml.jackson.core.util.BufferRecycler;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: OS1 */
/* loaded from: classes3.dex */
public class OS1 {

    /* renamed from: a */
    public final Object f4413a = new Object();

    /* renamed from: b */
    public final Map f4414b = new ConcurrentHashMap();

    /* renamed from: c */
    public final ReferenceQueue f4415c = new ReferenceQueue();

    /* renamed from: OS1$a */
    /* loaded from: classes3.dex */
    public static final class C1015a {

        /* renamed from: a */
        public static final OS1 f4416a = new OS1();
    }

    /* renamed from: a */
    public static OS1 m67039a() {
        return C1015a.f4416a;
    }

    /* renamed from: b */
    public int m67038b() {
        int i;
        synchronized (this.f4413a) {
            try {
                m67037c();
                i = 0;
                for (SoftReference softReference : this.f4414b.keySet()) {
                    softReference.clear();
                    i++;
                }
                this.f4414b.clear();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return i;
    }

    /* renamed from: c */
    public final void m67037c() {
        while (true) {
            SoftReference softReference = (SoftReference) this.f4415c.poll();
            if (softReference != null) {
                this.f4414b.remove(softReference);
            } else {
                return;
            }
        }
    }

    /* renamed from: d */
    public SoftReference m67036d(BufferRecycler bufferRecycler) {
        SoftReference softReference = new SoftReference(bufferRecycler, this.f4415c);
        this.f4414b.put(softReference, Boolean.TRUE);
        m67037c();
        return softReference;
    }
}
