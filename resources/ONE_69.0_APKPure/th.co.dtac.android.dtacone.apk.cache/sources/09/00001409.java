package p000;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewOverlay;

/* renamed from: V32 */
/* loaded from: classes2.dex */
public class V32 implements W32 {

    /* renamed from: a */
    public final ViewOverlay f6785a;

    public V32(View view) {
        this.f6785a = view.getOverlay();
    }

    @Override // p000.W32
    public void add(Drawable drawable) {
        this.f6785a.add(drawable);
    }

    @Override // p000.W32
    public void remove(Drawable drawable) {
        this.f6785a.remove(drawable);
    }
}