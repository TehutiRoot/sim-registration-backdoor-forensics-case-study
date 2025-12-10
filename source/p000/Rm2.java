package p000;

import com.google.android.odml.image.ImageProperties;
import java.nio.ByteBuffer;

/* renamed from: Rm2 */
/* loaded from: classes4.dex */
public final class Rm2 implements Sp2 {

    /* renamed from: a */
    public final ByteBuffer f5425a;

    /* renamed from: b */
    public final ImageProperties f5426b;

    public Rm2(ByteBuffer byteBuffer, int i) {
        this.f5425a = byteBuffer;
        C21444od2 c21444od2 = new C21444od2();
        c21444od2.mo25895b(2);
        c21444od2.mo25896a(i);
        this.f5426b = c21444od2.mo25894c();
    }

    /* renamed from: a */
    public final ByteBuffer m66416a() {
        return this.f5425a;
    }

    @Override // p000.Sp2
    public final ImageProperties zzb() {
        return this.f5426b;
    }

    @Override // p000.Sp2
    public final void zzc() {
    }
}
