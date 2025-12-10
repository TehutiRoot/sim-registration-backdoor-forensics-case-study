package p000;

import java.security.PrivilegedAction;

/* renamed from: Rk0  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C18379Rk0 implements PrivilegedAction {

    /* renamed from: a */
    public final /* synthetic */ String f5413a;

    /* renamed from: b */
    public final /* synthetic */ String f5414b;

    public C18379Rk0(String str, String str2) {
        this.f5413a = str;
        this.f5414b = str2;
    }

    @Override // java.security.PrivilegedAction
    public Object run() {
        return System.getProperty(this.f5413a, this.f5414b);
    }
}
