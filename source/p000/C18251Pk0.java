package p000;

import java.security.PrivilegedAction;

/* renamed from: Pk0  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C18251Pk0 implements PrivilegedAction {

    /* renamed from: a */
    public final /* synthetic */ String f4825a;

    /* renamed from: b */
    public final /* synthetic */ String f4826b;

    public C18251Pk0(String str, String str2) {
        this.f4825a = str;
        this.f4826b = str2;
    }

    @Override // java.security.PrivilegedAction
    public Object run() {
        return System.getProperty(this.f4825a, this.f4826b);
    }
}
