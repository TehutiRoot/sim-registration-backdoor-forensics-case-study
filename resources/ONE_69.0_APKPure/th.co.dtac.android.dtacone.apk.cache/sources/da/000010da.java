package p000;

import java.security.PrivilegedAction;
import org.apache.commons.logging.LogFactory;

/* renamed from: Rk0  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C18419Rk0 implements PrivilegedAction {

    /* renamed from: a */
    public final /* synthetic */ String f5618a;

    /* renamed from: b */
    public final /* synthetic */ ClassLoader f5619b;

    public C18419Rk0(String str, ClassLoader classLoader) {
        this.f5618a = str;
        this.f5619b = classLoader;
    }

    @Override // java.security.PrivilegedAction
    public Object run() {
        return LogFactory.createFactory(this.f5618a, this.f5619b);
    }
}