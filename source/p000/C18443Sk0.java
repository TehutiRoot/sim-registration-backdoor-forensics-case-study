package p000;

import java.security.PrivilegedAction;
import org.apache.commons.logging.impl.LogFactoryImpl;

/* renamed from: Sk0  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C18443Sk0 implements PrivilegedAction {

    /* renamed from: a */
    public final /* synthetic */ ClassLoader f5688a;

    /* renamed from: b */
    public final /* synthetic */ LogFactoryImpl f5689b;

    public C18443Sk0(LogFactoryImpl logFactoryImpl, ClassLoader classLoader) {
        this.f5689b = logFactoryImpl;
        this.f5688a = classLoader;
    }

    @Override // java.security.PrivilegedAction
    public Object run() {
        return this.f5688a.getParent();
    }
}
