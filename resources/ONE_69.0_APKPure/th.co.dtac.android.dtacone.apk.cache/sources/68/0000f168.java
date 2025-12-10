package org.apache.http.conn.ssl;

import java.io.IOException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.http.conn.util.InetAddressUtils;
import org.apache.http.util.Args;
import org.slf4j.Marker;

@Deprecated
/* loaded from: classes6.dex */
public abstract class AbstractVerifier implements X509HostnameVerifier {

    /* renamed from: b */
    public static final String[] f73909b;

    /* renamed from: a */
    public final Log f73910a = LogFactory.getLog(getClass());

    static {
        String[] strArr = {"ac", "co", "com", "ed", "edu", "go", "gouv", "gov", "info", "lg", "ne", "net", "or", "org"};
        f73909b = strArr;
        Arrays.sort(strArr);
    }

    /* renamed from: a */
    public static boolean m24984a(String str, String str2, boolean z) {
        boolean endsWith;
        if (str == null) {
            return false;
        }
        Locale locale = Locale.ROOT;
        String lowerCase = str.toLowerCase(locale);
        String lowerCase2 = str2.toLowerCase(locale);
        String[] split = lowerCase2.split("\\.");
        if (split.length >= 3 && split[0].endsWith(Marker.ANY_MARKER) && (!z || m24983b(split))) {
            String str3 = split[0];
            if (str3.length() > 1) {
                String substring = str3.substring(0, str3.length() - 1);
                String substring2 = lowerCase2.substring(str3.length());
                String substring3 = lowerCase.substring(substring.length());
                if (lowerCase.startsWith(substring) && substring3.endsWith(substring2)) {
                    endsWith = true;
                } else {
                    endsWith = false;
                }
            } else {
                endsWith = lowerCase.endsWith(lowerCase2.substring(1));
            }
            if (!endsWith) {
                return false;
            }
            if (z && countDots(lowerCase) != countDots(lowerCase2)) {
                return false;
            }
            return true;
        }
        return lowerCase.equals(lowerCase2);
    }

    public static boolean acceptableCountryWildcard(String str) {
        return m24983b(str.split("\\."));
    }

    /* renamed from: b */
    public static boolean m24983b(String[] strArr) {
        if (strArr.length != 3 || strArr[2].length() != 2 || Arrays.binarySearch(f73909b, strArr[1]) < 0) {
            return true;
        }
        return false;
    }

    public static int countDots(String str) {
        int i = 0;
        for (int i2 = 0; i2 < str.length(); i2++) {
            if (str.charAt(i2) == '.') {
                i++;
            }
        }
        return i;
    }

    public static String[] getCNs(X509Certificate x509Certificate) {
        try {
            String m24981b = DefaultHostnameVerifier.m24981b(x509Certificate.getSubjectX500Principal().toString());
            if (m24981b == null) {
                return null;
            }
            return new String[]{m24981b};
        } catch (SSLException unused) {
            return null;
        }
    }

    public static String[] getDNSSubjectAlts(X509Certificate x509Certificate) {
        List<C20954lP1> m24980c = DefaultHostnameVerifier.m24980c(x509Certificate);
        if (m24980c == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (C20954lP1 c20954lP1 : m24980c) {
            if (c20954lP1.m26813a() == 2) {
                arrayList.add(c20954lP1.m26812b());
            }
        }
        if (!arrayList.isEmpty()) {
            return null;
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    @Override // org.apache.http.conn.ssl.X509HostnameVerifier
    public final void verify(String str, SSLSocket sSLSocket) throws IOException {
        Args.notNull(str, "Host");
        SSLSession session = sSLSocket.getSession();
        if (session == null) {
            sSLSocket.getInputStream().available();
            session = sSLSocket.getSession();
            if (session == null) {
                sSLSocket.startHandshake();
                session = sSLSocket.getSession();
            }
        }
        verify(str, (X509Certificate) session.getPeerCertificates()[0]);
    }

    @Override // javax.net.ssl.HostnameVerifier
    public final boolean verify(String str, SSLSession sSLSession) {
        try {
            verify(str, (X509Certificate) sSLSession.getPeerCertificates()[0]);
            return true;
        } catch (SSLException e) {
            if (this.f73910a.isDebugEnabled()) {
                this.f73910a.debug(e.getMessage(), e);
            }
            return false;
        }
    }

    @Override // org.apache.http.conn.ssl.X509HostnameVerifier
    public final void verify(String str, X509Certificate x509Certificate) throws SSLException {
        List<C20954lP1> m24980c = DefaultHostnameVerifier.m24980c(x509Certificate);
        ArrayList arrayList = new ArrayList();
        if (!InetAddressUtils.isIPv4Address(str) && !InetAddressUtils.isIPv6Address(str)) {
            for (C20954lP1 c20954lP1 : m24980c) {
                if (c20954lP1.m26813a() == 2) {
                    arrayList.add(c20954lP1.m26812b());
                }
            }
        } else {
            for (C20954lP1 c20954lP12 : m24980c) {
                if (c20954lP12.m26813a() == 7) {
                    arrayList.add(c20954lP12.m26812b());
                }
            }
        }
        String m24981b = DefaultHostnameVerifier.m24981b(x509Certificate.getSubjectX500Principal().getName("RFC2253"));
        verify(str, m24981b != null ? new String[]{m24981b} : null, arrayList.isEmpty() ? null : (String[]) arrayList.toArray(new String[arrayList.size()]));
    }

    public final void verify(String str, String[] strArr, String[] strArr2, boolean z) throws SSLException {
        List<String> list = null;
        String str2 = (strArr == null || strArr.length <= 0) ? null : strArr[0];
        if (strArr2 != null && strArr2.length > 0) {
            list = Arrays.asList(strArr2);
        }
        String m24972k = InetAddressUtils.isIPv6Address(str) ? DefaultHostnameVerifier.m24972k(str.toLowerCase(Locale.ROOT)) : str;
        if (list == null) {
            if (str2 != null) {
                if (m24984a(m24972k, InetAddressUtils.isIPv6Address(str2) ? DefaultHostnameVerifier.m24972k(str2) : str2, z)) {
                    return;
                }
                throw new SSLException("Certificate for <" + str + "> doesn't match common name of the certificate subject: " + str2);
            } else {
                throw new SSLException("Certificate subject for <" + str + "> doesn't contain a common name and does not have alternative names");
            }
        }
        for (String str3 : list) {
            if (InetAddressUtils.isIPv6Address(str3)) {
                str3 = DefaultHostnameVerifier.m24972k(str3);
            }
            if (m24984a(m24972k, str3, z)) {
                return;
            }
        }
        throw new SSLException("Certificate for <" + str + "> doesn't match any of the subject alternative names: " + list);
    }
}