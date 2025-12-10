package com.google.android.cameraview;

import android.view.View;
import java.util.Set;

/* renamed from: com.google.android.cameraview.d */
/* loaded from: classes3.dex */
public abstract class AbstractC6207d {

    /* renamed from: a */
    public final InterfaceC6208a f43860a;

    /* renamed from: b */
    public final AbstractC6209e f43861b;

    /* renamed from: com.google.android.cameraview.d$a */
    /* loaded from: classes3.dex */
    public interface InterfaceC6208a {
        /* renamed from: a */
        void mo49187a();

        /* renamed from: b */
        void mo49186b();

        void onPictureTaken(byte[] bArr);
    }

    public AbstractC6207d(InterfaceC6208a interfaceC6208a, AbstractC6209e abstractC6209e) {
        this.f43860a = interfaceC6208a;
        this.f43861b = abstractC6209e;
    }

    /* renamed from: a */
    public abstract AspectRatio mo49202a();

    /* renamed from: b */
    public abstract boolean mo49201b();

    /* renamed from: c */
    public abstract int mo49200c();

    /* renamed from: d */
    public abstract int mo49199d();

    /* renamed from: e */
    public abstract Set mo49198e();

    /* renamed from: f */
    public View m49197f() {
        return this.f43861b.mo49175g();
    }

    /* renamed from: g */
    public abstract boolean mo49196g();

    /* renamed from: h */
    public abstract boolean mo49195h(AspectRatio aspectRatio);

    /* renamed from: i */
    public abstract void mo49194i(boolean z);

    /* renamed from: j */
    public abstract void mo49193j(int i);

    /* renamed from: k */
    public abstract void mo49192k(int i);

    /* renamed from: l */
    public abstract void mo49191l(int i);

    /* renamed from: m */
    public abstract boolean mo49190m();

    /* renamed from: n */
    public abstract void mo49189n();

    /* renamed from: o */
    public abstract void mo49188o();
}
