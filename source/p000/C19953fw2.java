package p000;

import android.media.Image;
import android.os.Build;
import com.google.android.odml.image.ImageProperties;

/* renamed from: fw2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C19953fw2 implements Sp2 {

    /* renamed from: a */
    public final Image f61994a;

    /* renamed from: b */
    public final ImageProperties f61995b;

    public C19953fw2(Image image) {
        int i;
        this.f61994a = image;
        C21444od2 c21444od2 = new C21444od2();
        c21444od2.mo25895b(3);
        int format = image.getFormat();
        if (Build.VERSION.SDK_INT >= 23) {
            if (format == 42) {
                i = 1;
            } else if (format == 41) {
                i = 2;
            }
            c21444od2.mo25896a(i);
            this.f61995b = c21444od2.mo25894c();
        }
        if (format != 35) {
            if (format != 256) {
                i = 0;
            } else {
                i = 9;
            }
        } else {
            i = 7;
        }
        c21444od2.mo25896a(i);
        this.f61995b = c21444od2.mo25894c();
    }

    /* renamed from: a */
    public final Image m31251a() {
        return this.f61994a;
    }

    @Override // p000.Sp2
    public final ImageProperties zzb() {
        return this.f61995b;
    }

    @Override // p000.Sp2
    public final void zzc() {
        this.f61994a.close();
    }
}
