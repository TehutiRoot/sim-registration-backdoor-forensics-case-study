package p000;

import java.security.PrivilegedAction;

/* renamed from: Sk0  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C18484Sk0 implements PrivilegedAction {

    /* renamed from: a */
    public final /* synthetic */ ClassLoader f5915a;

    /* renamed from: b */
    public final /* synthetic */ String f5916b;

    public C18484Sk0(ClassLoader classLoader, String str) {
        this.f5915a = classLoader;
        this.f5916b = str;
    }

    @Override // java.security.PrivilegedAction
    public Object run() {
        ClassLoader classLoader = this.f5915a;
        if (classLoader != null) {
            return classLoader.getResourceAsStream(this.f5916b);
        }
        return ClassLoader.getSystemResourceAsStream(this.f5916b);
    }
}