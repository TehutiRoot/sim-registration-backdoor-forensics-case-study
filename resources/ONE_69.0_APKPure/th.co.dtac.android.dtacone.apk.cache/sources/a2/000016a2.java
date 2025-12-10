package p000;

import java.security.PrivilegedAction;

/* renamed from: Xk0  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C18809Xk0 implements PrivilegedAction {

    /* renamed from: a */
    public final /* synthetic */ String f7643a;

    /* renamed from: b */
    public final /* synthetic */ String f7644b;

    public C18809Xk0(String str, String str2) {
        this.f7643a = str;
        this.f7644b = str2;
    }

    @Override // java.security.PrivilegedAction
    public Object run() {
        return System.getProperty(this.f7643a, this.f7644b);
    }
}