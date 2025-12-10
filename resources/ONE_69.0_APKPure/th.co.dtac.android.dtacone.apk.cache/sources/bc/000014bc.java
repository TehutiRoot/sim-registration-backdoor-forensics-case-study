package p000;

import java.security.PrivilegedAction;

/* renamed from: Vk0  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C18679Vk0 implements PrivilegedAction {

    /* renamed from: a */
    public final /* synthetic */ String f7071a;

    /* renamed from: b */
    public final /* synthetic */ String f7072b;

    public C18679Vk0(String str, String str2) {
        this.f7071a = str;
        this.f7072b = str2;
    }

    @Override // java.security.PrivilegedAction
    public Object run() {
        return System.getProperty(this.f7071a, this.f7072b);
    }
}