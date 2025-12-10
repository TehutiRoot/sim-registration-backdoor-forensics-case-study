package p000;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewOverlay;

/* renamed from: Y22 */
/* loaded from: classes2.dex */
public class Y22 implements Z22 {

    /* renamed from: a */
    public final ViewOverlay f7639a;

    public Y22(View view) {
        this.f7639a = view.getOverlay();
    }

    @Override // p000.Z22
    public void add(Drawable drawable) {
        this.f7639a.add(drawable);
    }

    @Override // p000.Z22
    public void remove(Drawable drawable) {
        this.f7639a.remove(drawable);
    }
}
