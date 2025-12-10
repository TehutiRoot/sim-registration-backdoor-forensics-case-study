package p000;

import java.security.PrivilegedAction;

/* renamed from: Mk0  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C18059Mk0 implements PrivilegedAction {

    /* renamed from: a */
    public final /* synthetic */ ClassLoader f3863a;

    /* renamed from: b */
    public final /* synthetic */ String f3864b;

    public C18059Mk0(ClassLoader classLoader, String str) {
        this.f3863a = classLoader;
        this.f3864b = str;
    }

    @Override // java.security.PrivilegedAction
    public Object run() {
        ClassLoader classLoader = this.f3863a;
        if (classLoader != null) {
            return classLoader.getResourceAsStream(this.f3864b);
        }
        return ClassLoader.getSystemResourceAsStream(this.f3864b);
    }
}
