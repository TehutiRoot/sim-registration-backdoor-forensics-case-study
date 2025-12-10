package p000;

import java.security.PrivilegedAction;
import org.apache.commons.logging.impl.SimpleLog;

/* renamed from: xJ1  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C22945xJ1 implements PrivilegedAction {

    /* renamed from: a */
    public final /* synthetic */ String f108313a;

    public C22945xJ1(String str) {
        this.f108313a = str;
    }

    @Override // java.security.PrivilegedAction
    public Object run() {
        ClassLoader contextClassLoader;
        contextClassLoader = SimpleLog.getContextClassLoader();
        if (contextClassLoader != null) {
            return contextClassLoader.getResourceAsStream(this.f108313a);
        }
        return ClassLoader.getSystemResourceAsStream(this.f108313a);
    }
}
