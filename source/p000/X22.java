package p000;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewOverlay;
import com.google.android.material.internal.ViewOverlayImpl;

/* renamed from: X22 */
/* loaded from: classes4.dex */
public class X22 implements ViewOverlayImpl {

    /* renamed from: a */
    public final ViewOverlay f7372a;

    public X22(View view) {
        this.f7372a = view.getOverlay();
    }

    @Override // com.google.android.material.internal.ViewOverlayImpl
    public void add(Drawable drawable) {
        this.f7372a.add(drawable);
    }

    @Override // com.google.android.material.internal.ViewOverlayImpl
    public void remove(Drawable drawable) {
        this.f7372a.remove(drawable);
    }
}
