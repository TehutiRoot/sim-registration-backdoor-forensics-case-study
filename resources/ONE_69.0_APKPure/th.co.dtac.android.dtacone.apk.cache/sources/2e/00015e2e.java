package p000;

import java.security.PrivilegedAction;
import org.apache.commons.logging.impl.SimpleLog;

/* renamed from: uK1  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C22498uK1 implements PrivilegedAction {

    /* renamed from: a */
    public final /* synthetic */ String f107701a;

    public C22498uK1(String str) {
        this.f107701a = str;
    }

    @Override // java.security.PrivilegedAction
    public Object run() {
        ClassLoader contextClassLoader;
        contextClassLoader = SimpleLog.getContextClassLoader();
        if (contextClassLoader != null) {
            return contextClassLoader.getResourceAsStream(this.f107701a);
        }
        return ClassLoader.getSystemResourceAsStream(this.f107701a);
    }
}