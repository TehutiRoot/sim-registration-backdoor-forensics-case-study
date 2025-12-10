package p000;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroupOverlay;

/* renamed from: w32  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C22794w32 implements InterfaceC22967x32 {

    /* renamed from: a */
    public final ViewGroupOverlay f108303a;

    public C22794w32(ViewGroup viewGroup) {
        this.f108303a = viewGroup.getOverlay();
    }

    @Override // p000.InterfaceC22967x32
    /* renamed from: a */
    public void mo612a(View view) {
        this.f108303a.add(view);
    }

    @Override // p000.W32
    public void add(Drawable drawable) {
        this.f108303a.add(drawable);
    }

    @Override // p000.InterfaceC22967x32
    /* renamed from: b */
    public void mo611b(View view) {
        this.f108303a.remove(view);
    }

    @Override // p000.W32
    public void remove(Drawable drawable) {
        this.f108303a.remove(drawable);
    }
}