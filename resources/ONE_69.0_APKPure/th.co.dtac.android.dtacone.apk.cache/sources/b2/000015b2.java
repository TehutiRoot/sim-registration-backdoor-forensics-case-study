package p000;

import java.security.PrivilegedAction;
import org.apache.commons.logging.LogFactory;

/* renamed from: Wk0  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C18744Wk0 implements PrivilegedAction {
    @Override // java.security.PrivilegedAction
    public Object run() {
        ClassLoader directGetContextClassLoader;
        directGetContextClassLoader = LogFactory.directGetContextClassLoader();
        return directGetContextClassLoader;
    }
}