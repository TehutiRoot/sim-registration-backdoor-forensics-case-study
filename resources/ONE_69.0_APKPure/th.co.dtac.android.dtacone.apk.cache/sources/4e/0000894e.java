package com.google.android.cameraview;

import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.View;

/* renamed from: com.google.android.cameraview.e */
/* loaded from: classes3.dex */
public abstract class AbstractC6198e {

    /* renamed from: a */
    public InterfaceC6199a f43874a;

    /* renamed from: b */
    public int f43875b;

    /* renamed from: c */
    public int f43876c;

    /* renamed from: com.google.android.cameraview.e$a */
    /* loaded from: classes3.dex */
    public interface InterfaceC6199a {
        /* renamed from: a */
        void mo49176a();
    }

    /* renamed from: a */
    public void m49182a() {
        this.f43874a.mo49176a();
    }

    /* renamed from: b */
    public int m49181b() {
        return this.f43876c;
    }

    /* renamed from: c */
    public abstract Class mo49175c();

    /* renamed from: d */
    public abstract Surface mo49174d();

    /* renamed from: e */
    public SurfaceHolder m49180e() {
        return null;
    }

    /* renamed from: f */
    public abstract Object mo49173f();

    /* renamed from: g */
    public abstract View mo49172g();

    /* renamed from: h */
    public int m49179h() {
        return this.f43875b;
    }

    /* renamed from: i */
    public abstract boolean mo49171i();

    /* renamed from: j */
    public abstract void mo49170j(int i, int i2);

    /* renamed from: k */
    public void m49178k(InterfaceC6199a interfaceC6199a) {
        this.f43874a = interfaceC6199a;
    }

    /* renamed from: l */
    public abstract void mo49169l(int i);

    /* renamed from: m */
    public void m49177m(int i, int i2) {
        this.f43875b = i;
        this.f43876c = i2;
    }
}