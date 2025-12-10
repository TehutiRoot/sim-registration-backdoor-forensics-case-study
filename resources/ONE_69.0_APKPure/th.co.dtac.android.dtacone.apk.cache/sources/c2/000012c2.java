package p000;

import java.io.IOException;
import java.security.PrivilegedAction;
import org.apache.commons.logging.LogFactory;

/* renamed from: Tk0  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C18549Tk0 implements PrivilegedAction {

    /* renamed from: a */
    public final /* synthetic */ ClassLoader f6407a;

    /* renamed from: b */
    public final /* synthetic */ String f6408b;

    public C18549Tk0(ClassLoader classLoader, String str) {
        this.f6407a = classLoader;
        this.f6408b = str;
    }

    @Override // java.security.PrivilegedAction
    public Object run() {
        try {
            ClassLoader classLoader = this.f6407a;
            if (classLoader != null) {
                return classLoader.getResources(this.f6408b);
            }
            return ClassLoader.getSystemResources(this.f6408b);
        } catch (IOException e) {
            if (LogFactory.isDiagnosticsEnabled()) {
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append("Exception while trying to find configuration file ");
                stringBuffer.append(this.f6408b);
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