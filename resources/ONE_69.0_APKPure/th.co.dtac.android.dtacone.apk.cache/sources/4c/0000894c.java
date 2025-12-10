package com.google.android.cameraview;

import android.view.View;
import java.util.Set;

/* renamed from: com.google.android.cameraview.d */
/* loaded from: classes3.dex */
public abstract class AbstractC6196d {

    /* renamed from: a */
    public final InterfaceC6197a f43872a;

    /* renamed from: b */
    public final AbstractC6198e f43873b;

    /* renamed from: com.google.android.cameraview.d$a */
    /* loaded from: classes3.dex */
    public interface InterfaceC6197a {
        /* renamed from: a */
        void mo49184a();

        /* renamed from: b */
        void mo49183b();

        void onPictureTaken(byte[] bArr);
    }

    public AbstractC6196d(InterfaceC6197a interfaceC6197a, AbstractC6198e abstractC6198e) {
        this.f43872a = interfaceC6197a;
        this.f43873b = abstractC6198e;
    }

    /* renamed from: a */
    public abstract AspectRatio mo49199a();

    /* renamed from: b */
    public abstract boolean mo49198b();

    /* renamed from: c */
    public abstract int mo49197c();

    /* renamed from: d */
    public abstract int mo49196d();

    /* renamed from: e */
    public abstract Set mo49195e();

    /* renamed from: f */
    public View m49194f() {
        return this.f43873b.mo49172g();
    }

    /* renamed from: g */
    public abstract boolean mo49193g();

    /* renamed from: h */
    public abstract boolean mo49192h(AspectRatio aspectRatio);

    /* renamed from: i */
    public abstract void mo49191i(boolean z);

    /* renamed from: j */
    public abstract void mo49190j(int i);

    /* renamed from: k */
    public abstract void mo49189k(int i);

    /* renamed from: l */
    public abstract void mo49188l(int i);

    /* renamed from: m */
    public abstract boolean mo49187m();

    /* renamed from: n */
    public abstract void mo49186n();

    /* renamed from: o */
    public abstract void mo49185o();
}