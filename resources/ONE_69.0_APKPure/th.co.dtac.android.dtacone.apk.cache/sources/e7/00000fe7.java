package p000;

import java.security.PrivilegedAction;
import org.apache.commons.logging.LogFactory;

/* renamed from: Qk0  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C18354Qk0 implements PrivilegedAction {
    @Override // java.security.PrivilegedAction
    public Object run() {
        return LogFactory.directGetContextClassLoader();
    }
}