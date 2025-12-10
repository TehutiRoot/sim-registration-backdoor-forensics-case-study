package p000;

import java.io.IOException;
import java.security.PrivilegedAction;
import org.apache.commons.logging.LogFactory;

/* renamed from: Nk0  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C18123Nk0 implements PrivilegedAction {

    /* renamed from: a */
    public final /* synthetic */ ClassLoader f4181a;

    /* renamed from: b */
    public final /* synthetic */ String f4182b;

    public C18123Nk0(ClassLoader classLoader, String str) {
        this.f4181a = classLoader;
        this.f4182b = str;
    }

    @Override // java.security.PrivilegedAction
    public Object run() {
        try {
            ClassLoader classLoader = this.f4181a;
            if (classLoader != null) {
                return classLoader.getResources(this.f4182b);
            }
            return ClassLoader.getSystemResources(this.f4182b);
        } catch (IOException e) {
            if (LogFactory.isDiagnosticsEnabled()) {
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append("Exception while trying to find configuration file ");
                stringBuffer.append(this.f4182b);
                stringBuffer.append(":");
                stringBuffer.append(e.getMessage());
                LogFactory.logDiagnostic(stringBuffer.toString());
            }
            return null;
        } catch (NoSuchMethodError unused) {
            return null;
        }
    }
}
