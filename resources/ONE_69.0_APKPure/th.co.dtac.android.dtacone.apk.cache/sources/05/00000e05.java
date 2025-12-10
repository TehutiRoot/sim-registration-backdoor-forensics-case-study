package p000;

import com.google.android.odml.image.ImageProperties;
import java.nio.ByteBuffer;

/* renamed from: On2 */
/* loaded from: classes4.dex */
public final class On2 implements Pq2 {

    /* renamed from: a */
    public final ByteBuffer f4538a;

    /* renamed from: b */
    public final ImageProperties f4539b;

    public On2(ByteBuffer byteBuffer, int i) {
        this.f4538a = byteBuffer;
        C20989le2 c20989le2 = new C20989le2();
        c20989le2.mo26792b(2);
        c20989le2.mo26793a(i);
        this.f4539b = c20989le2.mo26791c();
    }

    /* renamed from: a */
    public final ByteBuffer m67076a() {
        return this.f4538a;
    }

    @Override // p000.Pq2
    public final ImageProperties zzb() {
        return this.f4539b;
    }

    @Override // p000.Pq2
    public final void zzc() {
    }
}