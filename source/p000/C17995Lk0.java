package p000;

import java.security.PrivilegedAction;
import org.apache.commons.logging.LogFactory;

/* renamed from: Lk0  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C17995Lk0 implements PrivilegedAction {

    /* renamed from: a */
    public final /* synthetic */ String f3547a;

    /* renamed from: b */
    public final /* synthetic */ ClassLoader f3548b;

    public C17995Lk0(String str, ClassLoader classLoader) {
        this.f3547a = str;
        this.f3548b = classLoader;
    }

    @Override // java.security.PrivilegedAction
    public Object run() {
        return LogFactory.createFactory(this.f3547a, this.f3548b);
    }
}
