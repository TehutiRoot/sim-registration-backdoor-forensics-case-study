package p000;

import android.graphics.Bitmap;
import com.google.android.odml.image.ImageProperties;

/* renamed from: Yk2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C18876Yk2 implements Pq2 {

    /* renamed from: a */
    public final Bitmap f7966a;

    /* renamed from: b */
    public final ImageProperties f7967b;

    public C18876Yk2(Bitmap bitmap) {
        int i;
        this.f7966a = bitmap;
        C20989le2 c20989le2 = new C20989le2();
        int i2 = AbstractC21520oi2.f72862a[bitmap.getConfig().ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                i = 0;
            } else {
                i = 1;
            }
        } else {
            i = 8;
        }
        c20989le2.mo26793a(i);
        c20989le2.mo26792b(1);
        this.f7967b = c20989le2.mo26791c();
    }

    /* renamed from: a */
    public final Bitmap m65362a() {
        return this.f7966a;
    }

    @Override // p000.Pq2
    public final ImageProperties zzb() {
        return this.f7967b;
    }

    @Override // p000.Pq2
    public final void zzc() {
        this.f7966a.recycle();
    }
}