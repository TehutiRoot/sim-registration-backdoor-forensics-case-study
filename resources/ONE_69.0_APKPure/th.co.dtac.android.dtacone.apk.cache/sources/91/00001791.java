package p000;

import java.security.PrivilegedAction;
import org.apache.commons.logging.impl.LogFactoryImpl;

/* renamed from: Yk0  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C18874Yk0 implements PrivilegedAction {

    /* renamed from: a */
    public final /* synthetic */ ClassLoader f7947a;

    /* renamed from: b */
    public final /* synthetic */ LogFactoryImpl f7948b;

    public C18874Yk0(LogFactoryImpl logFactoryImpl, ClassLoader classLoader) {
        this.f7948b = logFactoryImpl;
        this.f7947a = classLoader;
    }

    @Override // java.security.PrivilegedAction
    public Object run() {
        return this.f7947a.getParent();
    }
}