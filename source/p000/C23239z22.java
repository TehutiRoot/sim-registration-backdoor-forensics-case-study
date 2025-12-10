package p000;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroupOverlay;

/* renamed from: z22  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C23239z22 implements A22 {

    /* renamed from: a */
    public final ViewGroupOverlay f108964a;

    public C23239z22(ViewGroup viewGroup) {
        this.f108964a = viewGroup.getOverlay();
    }

    @Override // p000.A22
    /* renamed from: a */
    public void mo148a(View view) {
        this.f108964a.add(view);
    }

    @Override // p000.Z22
    public void add(Drawable drawable) {
        this.f108964a.add(drawable);
    }

    @Override // p000.A22
    /* renamed from: b */
    public void mo147b(View view) {
        this.f108964a.remove(view);
    }

    @Override // p000.Z22
    public void remove(Drawable drawable) {
        this.f108964a.remove(drawable);
    }
}
