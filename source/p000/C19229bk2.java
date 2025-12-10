package p000;

import android.graphics.Bitmap;
import com.google.android.odml.image.ImageProperties;

/* renamed from: bk2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C19229bk2 implements Sp2 {

    /* renamed from: a */
    public final Bitmap f39197a;

    /* renamed from: b */
    public final ImageProperties f39198b;

    public C19229bk2(Bitmap bitmap) {
        int i;
        this.f39197a = bitmap;
        C21444od2 c21444od2 = new C21444od2();
        int i2 = AbstractC21972rh2.f77381a[bitmap.getConfig().ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                i = 0;
            } else {
                i = 1;
            }
        } else {
            i = 8;
        }
        c21444od2.mo25896a(i);
        c21444od2.mo25895b(1);
        this.f39198b = c21444od2.mo25894c();
    }

    /* renamed from: a */
    public final Bitmap m51817a() {
        return this.f39197a;
    }

    @Override // p000.Sp2
    public final ImageProperties zzb() {
        return this.f39198b;
    }

    @Override // p000.Sp2
    public final void zzc() {
        this.f39197a.recycle();
    }
}
