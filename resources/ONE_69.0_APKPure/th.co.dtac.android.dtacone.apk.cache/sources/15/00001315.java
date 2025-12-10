package p000;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewOverlay;
import com.google.android.material.internal.ViewOverlayImpl;

/* renamed from: U32 */
/* loaded from: classes4.dex */
public class U32 implements ViewOverlayImpl {

    /* renamed from: a */
    public final ViewOverlay f6509a;

    public U32(View view) {
        this.f6509a = view.getOverlay();
    }

    @Override // com.google.android.material.internal.ViewOverlayImpl
    public void add(Drawable drawable) {
        this.f6509a.add(drawable);
    }

    @Override // com.google.android.material.internal.ViewOverlayImpl
    public void remove(Drawable drawable) {
        this.f6509a.remove(drawable);
    }
}