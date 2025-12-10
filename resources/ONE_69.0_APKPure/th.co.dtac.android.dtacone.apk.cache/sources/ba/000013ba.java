package p000;

import java.net.URL;
import java.security.PrivilegedAction;

/* renamed from: Uk0  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C18614Uk0 implements PrivilegedAction {

    /* renamed from: a */
    public final /* synthetic */ URL f6711a;

    public C18614Uk0(URL url) {
        this.f6711a = url;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0079 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // java.security.PrivilegedAction
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object run() {
        /*
            r6 = this;
            java.lang.String r0 = "Unable to close stream for URL "
            r1 = 0
            java.net.URL r2 = r6.f6711a     // Catch: java.lang.Throwable -> L42 java.io.IOException -> L47
            java.net.URLConnection r2 = r2.openConnection()     // Catch: java.lang.Throwable -> L42 java.io.IOException -> L47
            r3 = 0
            r2.setUseCaches(r3)     // Catch: java.lang.Throwable -> L42 java.io.IOException -> L47
            java.io.InputStream r2 = r2.getInputStream()     // Catch: java.lang.Throwable -> L42 java.io.IOException -> L47
            if (r2 == 0) goto L21
            java.util.Properties r3 = new java.util.Properties     // Catch: java.lang.Throwable -> L1f java.io.IOException -> L48
            r3.<init>()     // Catch: java.lang.Throwable -> L1f java.io.IOException -> L48
            r3.load(r2)     // Catch: java.lang.Throwable -> L1f java.io.IOException -> L48
            r2.close()     // Catch: java.lang.Throwable -> L1f java.io.IOException -> L48
            return r3
        L1f:
            r1 = move-exception
            goto L77
        L21:
            if (r2 == 0) goto L76
            r2.close()     // Catch: java.io.IOException -> L27
            goto L76
        L27:
            boolean r2 = org.apache.commons.logging.LogFactory.isDiagnosticsEnabled()
            if (r2 == 0) goto L76
            java.lang.StringBuffer r2 = new java.lang.StringBuffer
            r2.<init>()
        L32:
            r2.append(r0)
            java.net.URL r0 = r6.f6711a
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            org.apache.commons.logging.LogFactory.m25059a(r0)
            goto L76
        L42:
            r2 = move-exception
            r5 = r2
            r2 = r1
            r1 = r5
            goto L77
        L47:
            r2 = r1
        L48:
            boolean r3 = org.apache.commons.logging.LogFactory.isDiagnosticsEnabled()     // Catch: java.lang.Throwable -> L1f
            if (r3 == 0) goto L64
            java.lang.StringBuffer r3 = new java.lang.StringBuffer     // Catch: java.lang.Throwable -> L1f
            r3.<init>()     // Catch: java.lang.Throwable -> L1f
            java.lang.String r4 = "Unable to read URL "
            r3.append(r4)     // Catch: java.lang.Throwable -> L1f
            java.net.URL r4 = r6.f6711a     // Catch: java.lang.Throwable -> L1f
            r3.append(r4)     // Catch: java.lang.Throwable -> L1f
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L1f
            org.apache.commons.logging.LogFactory.m25059a(r3)     // Catch: java.lang.Throwable -> L1f
        L64:
            if (r2 == 0) goto L76
            r2.close()     // Catch: java.io.IOException -> L6a
            goto L76
        L6a:
            boolean r2 = org.apache.commons.logging.LogFactory.isDiagnosticsEnabled()
            if (r2 == 0) goto L76
            java.lang.StringBuffer r2 = new java.lang.StringBuffer
            r2.<init>()
            goto L32
        L76:
            return r1
        L77:
            if (r2 == 0) goto L97
            r2.close()     // Catch: java.io.IOException -> L7d
            goto L97
        L7d:
            boolean r2 = org.apache.commons.logging.LogFactory.isDiagnosticsEnabled()
            if (r2 == 0) goto L97
            java.lang.StringBuffer r2 = new java.lang.StringBuffer
            r2.<init>()
            r2.append(r0)
            java.net.URL r0 = r6.f6711a
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            org.apache.commons.logging.LogFactory.m25059a(r0)
        L97:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C18614Uk0.run():java.lang.Object");
    }
}