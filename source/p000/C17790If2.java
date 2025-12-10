package p000;

import dalvik.system.PathClassLoader;

/* renamed from: If2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C17790If2 extends PathClassLoader {
    public C17790If2(String str, ClassLoader classLoader) {
        super(str, classLoader);
    }

    @Override // java.lang.ClassLoader
    public final Class loadClass(String str, boolean z) {
        if (!str.startsWith("java.") && !str.startsWith("android.")) {
            try {
                return findClass(str);
            } catch (ClassNotFoundException unused) {
            }
        }
        return super.loadClass(str, z);
    }
}
