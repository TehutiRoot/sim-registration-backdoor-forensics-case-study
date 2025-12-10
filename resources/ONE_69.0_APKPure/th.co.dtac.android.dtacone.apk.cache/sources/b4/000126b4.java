package th.p047co.dtac.android.dtacone.util;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;

/* renamed from: th.co.dtac.android.dtacone.util.RecyclingBitmapDrawable */
/* loaded from: classes8.dex */
public class RecyclingBitmapDrawable extends BitmapDrawable {

    /* renamed from: a */
    public int f87078a;

    /* renamed from: b */
    public int f87079b;

    /* renamed from: c */
    public boolean f87080c;

    public RecyclingBitmapDrawable(Resources resources, Bitmap bitmap) {
        super(resources, bitmap);
        this.f87078a = 0;
        this.f87079b = 0;
    }

    /* renamed from: a */
    public final void m16792a() {
        synchronized (this) {
            try {
                if (this.f87078a >= 0 && this.f87079b >= 0 && this.f87080c && m16791b()) {
                    getBitmap().recycle();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: b */
    public final synchronized boolean m16791b() {
        boolean z;
        Bitmap bitmap = getBitmap();
        if (bitmap != null) {
            if (!bitmap.isRecycled()) {
                z = true;
            }
        }
        z = false;
        return z;
    }

    public void isDisplayed(boolean z) {
        synchronized (this) {
            try {
                if (z) {
                    this.f87079b++;
                    this.f87080c = true;
                } else {
                    this.f87079b--;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        m16792a();
    }
}