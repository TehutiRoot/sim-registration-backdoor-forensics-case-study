package p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.View;

/* renamed from: mm */
/* loaded from: classes.dex */
public class C12313mm implements InterfaceC12472om {
    @Override // p000.InterfaceC12472om
    /* renamed from: a */
    public void mo25794a(InterfaceC12395nm interfaceC12395nm) {
        mo25792c(interfaceC12395nm, mo25781n(interfaceC12395nm));
    }

    @Override // p000.InterfaceC12472om
    /* renamed from: b */
    public float mo25793b(InterfaceC12395nm interfaceC12395nm) {
        return interfaceC12395nm.mo26048e().getElevation();
    }

    @Override // p000.InterfaceC12472om
    /* renamed from: c */
    public void mo25792c(InterfaceC12395nm interfaceC12395nm, float f) {
        m26205p(interfaceC12395nm).m68559g(f, interfaceC12395nm.mo26052a(), interfaceC12395nm.mo26049d());
        mo25788g(interfaceC12395nm);
    }

    @Override // p000.InterfaceC12472om
    /* renamed from: d */
    public void mo25791d(InterfaceC12395nm interfaceC12395nm, float f) {
        m26205p(interfaceC12395nm).m68558h(f);
    }

    @Override // p000.InterfaceC12472om
    /* renamed from: e */
    public float mo25790e(InterfaceC12395nm interfaceC12395nm) {
        return mo25784k(interfaceC12395nm) * 2.0f;
    }

    @Override // p000.InterfaceC12472om
    /* renamed from: f */
    public void mo25789f(InterfaceC12395nm interfaceC12395nm) {
        mo25792c(interfaceC12395nm, mo25781n(interfaceC12395nm));
    }

    @Override // p000.InterfaceC12472om
    /* renamed from: g */
    public void mo25788g(InterfaceC12395nm interfaceC12395nm) {
        if (!interfaceC12395nm.mo26052a()) {
            interfaceC12395nm.setShadowPadding(0, 0, 0, 0);
            return;
        }
        float mo25781n = mo25781n(interfaceC12395nm);
        float mo25784k = mo25784k(interfaceC12395nm);
        int ceil = (int) Math.ceil(AbstractC17578Ey1.m68435a(mo25781n, mo25784k, interfaceC12395nm.mo26049d()));
        int ceil2 = (int) Math.ceil(AbstractC17578Ey1.m68434b(mo25781n, mo25784k, interfaceC12395nm.mo26049d()));
        interfaceC12395nm.setShadowPadding(ceil, ceil2, ceil, ceil2);
    }

    @Override // p000.InterfaceC12472om
    /* renamed from: h */
    public float mo25787h(InterfaceC12395nm interfaceC12395nm) {
        return mo25784k(interfaceC12395nm) * 2.0f;
    }

    @Override // p000.InterfaceC12472om
    /* renamed from: i */
    public void mo25786i(InterfaceC12395nm interfaceC12395nm, Context context, ColorStateList colorStateList, float f, float f2, float f3) {
        interfaceC12395nm.mo26051b(new C17514Dy1(colorStateList, f));
        View mo26048e = interfaceC12395nm.mo26048e();
        mo26048e.setClipToOutline(true);
        mo26048e.setElevation(f2);
        mo25792c(interfaceC12395nm, f3);
    }

    @Override // p000.InterfaceC12472om
    /* renamed from: j */
    public void mo25785j(InterfaceC12395nm interfaceC12395nm, ColorStateList colorStateList) {
        m26205p(interfaceC12395nm).m68560f(colorStateList);
    }

    @Override // p000.InterfaceC12472om
    /* renamed from: k */
    public float mo25784k(InterfaceC12395nm interfaceC12395nm) {
        return m26205p(interfaceC12395nm).m68562d();
    }

    @Override // p000.InterfaceC12472om
    /* renamed from: l */
    public ColorStateList mo25783l(InterfaceC12395nm interfaceC12395nm) {
        return m26205p(interfaceC12395nm).m68564b();
    }

    @Override // p000.InterfaceC12472om
    /* renamed from: m */
    public void mo25782m(InterfaceC12395nm interfaceC12395nm, float f) {
        interfaceC12395nm.mo26048e().setElevation(f);
    }

    @Override // p000.InterfaceC12472om
    /* renamed from: n */
    public float mo25781n(InterfaceC12395nm interfaceC12395nm) {
        return m26205p(interfaceC12395nm).m68563c();
    }

    /* renamed from: p */
    public final C17514Dy1 m26205p(InterfaceC12395nm interfaceC12395nm) {
        return (C17514Dy1) interfaceC12395nm.mo26050c();
    }

    @Override // p000.InterfaceC12472om
    /* renamed from: o */
    public void mo25780o() {
    }
}
