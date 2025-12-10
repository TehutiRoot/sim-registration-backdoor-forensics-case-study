package com.google.android.cameraview;

import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.View;

/* renamed from: com.google.android.cameraview.e */
/* loaded from: classes3.dex */
public abstract class AbstractC6209e {

    /* renamed from: a */
    public InterfaceC6210a f43862a;

    /* renamed from: b */
    public int f43863b;

    /* renamed from: c */
    public int f43864c;

    /* renamed from: com.google.android.cameraview.e$a */
    /* loaded from: classes3.dex */
    public interface InterfaceC6210a {
        /* renamed from: a */
        void mo49179a();
    }

    /* renamed from: a */
    public void m49185a() {
        this.f43862a.mo49179a();
    }

    /* renamed from: b */
    public int m49184b() {
        return this.f43864c;
    }

    /* renamed from: c */
    public abstract Class mo49178c();

    /* renamed from: d */
    public abstract Surface mo49177d();

    /* renamed from: e */
    public SurfaceHolder m49183e() {
        return null;
    }

    /* renamed from: f */
    public abstract Object mo49176f();

    /* renamed from: g */
    public abstract View mo49175g();

    /* renamed from: h */
    public int m49182h() {
        return this.f43863b;
    }

    /* renamed from: i */
    public abstract boolean mo49174i();

    /* renamed from: j */
    public abstract void mo49173j(int i, int i2);

    /* renamed from: k */
    public void m49181k(InterfaceC6210a interfaceC6210a) {
        this.f43862a = interfaceC6210a;
    }

    /* renamed from: l */
    public abstract void mo49172l(int i);

    /* renamed from: m */
    public void m49180m(int i, int i2) {
        this.f43863b = i;
        this.f43864c = i2;
    }
}
