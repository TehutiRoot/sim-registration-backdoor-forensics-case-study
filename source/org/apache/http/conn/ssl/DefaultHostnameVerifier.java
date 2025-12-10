package org.apache.http.conn.ssl;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;
import javax.naming.InvalidNameException;
import javax.naming.NamingException;
import javax.naming.directory.Attribute;
import javax.naming.ldap.LdapName;
import javax.naming.ldap.Rdn;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.http.annotation.Contract;
import org.apache.http.annotation.ThreadingBehavior;
import org.apache.http.conn.util.DnsUtils;
import org.apache.http.conn.util.DomainType;
import org.apache.http.conn.util.InetAddressUtils;
import org.apache.http.conn.util.PublicSuffixMatcher;

@Contract(threading = ThreadingBehavior.IMMUTABLE_CONDITIONAL)
/* loaded from: classes6.dex */
public final class DefaultHostnameVerifier implements HostnameVerifier {

    /* renamed from: a */
    public final Log f73827a;

    /* renamed from: b */
    public final PublicSuffixMatcher f73828b;

    /* loaded from: classes6.dex */
    public enum HostNameType {
        IPv4(7),
        IPv6(7),
        DNS(2);
        
        final int subjectType;

        HostNameType(int i) {
            this.subjectType = i;
        }
    }

    /* renamed from: org.apache.http.conn.ssl.DefaultHostnameVerifier$a */
    /* loaded from: classes6.dex */
    public static /* synthetic */ class C12568a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f73829a;

        static {
            int[] iArr = new int[HostNameType.values().length];
            f73829a = iArr;
            try {
                iArr[HostNameType.IPv4.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f73829a[HostNameType.IPv6.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public DefaultHostnameVerifier(PublicSuffixMatcher publicSuffixMatcher) {
        this.f73827a = LogFactory.getLog(DefaultHostnameVerifier.class);
        this.f73828b = publicSuffixMatcher;
    }

    /* renamed from: a */
    public static HostNameType m24792a(String str) {
        if (InetAddressUtils.isIPv4Address(str)) {
            return HostNameType.IPv4;
        }
        if (str.startsWith("[") && str.endsWith("]")) {
            str = str.substring(1, str.length() - 1);
        }
        if (InetAddressUtils.isIPv6Address(str)) {
            return HostNameType.IPv6;
        }
        return HostNameType.DNS;
    }

    /* renamed from: b */
    public static String m24791b(String str) {
        if (str == null) {
            return null;
        }
        try {
            List rdns = new LdapName(str).getRdns();
            for (int size = rdns.size() - 1; size >= 0; size--) {
                Attribute attribute = ((Rdn) rdns.get(size)).toAttributes().get("cn");
                if (attribute != null) {
                    try {
                        Object obj = attribute.get();
                        if (obj != null) {
                            return obj.toString();
                        }
                        continue;
                    } catch (NoSuchElementException | NamingException unused) {
                        continue;
                    }
                }
            }
            return null;
        } catch (InvalidNameException unused2) {
            throw new SSLException(str + " is not a valid X500 distinguished name");
        }
    }

    /* renamed from: c */
    public static List m24790c(X509Certificate x509Certificate) {
        Integer num;
        try {
            Collection<List<?>> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames == null) {
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            for (List<?> list : subjectAlternativeNames) {
                if (list.size() >= 2) {
                    num = (Integer) list.get(0);
                } else {
                    num = null;
                }
                if (num != null && (num.intValue() == 2 || num.intValue() == 7)) {
                    Object obj = list.get(1);
                    if (obj instanceof String) {
                        arrayList.add(new C21410oO1((String) obj, num.intValue()));
                    } else {
                        boolean z = obj instanceof byte[];
                    }
                }
            }
            return arrayList;
        } catch (CertificateParsingException unused) {
            return Collections.emptyList();
        }
    }

    /* renamed from: d */
    public static void m24789d(String str, String str2, PublicSuffixMatcher publicSuffixMatcher) {
        if (m24783j(DnsUtils.normalize(str), DnsUtils.normalize(str2), publicSuffixMatcher)) {
            return;
        }
        throw new SSLPeerUnverifiedException("Certificate for <" + str + "> doesn't match common name of the certificate subject: " + str2);
    }

    /* renamed from: e */
    public static void m24788e(String str, List list, PublicSuffixMatcher publicSuffixMatcher) {
        String normalize = DnsUtils.normalize(str);
        for (int i = 0; i < list.size(); i++) {
            C21410oO1 c21410oO1 = (C21410oO1) list.get(i);
            if (c21410oO1.m25927a() == 2 && m24783j(normalize, DnsUtils.normalize(c21410oO1.m25926b()), publicSuffixMatcher)) {
                return;
            }
        }
        throw new SSLPeerUnverifiedException("Certificate for <" + str + "> doesn't match any of the subject alternative names: " + list);
    }

    /* renamed from: f */
    public static boolean m24787f(String str, String str2) {
        if (str2 == null || !str.endsWith(str2)) {
            return false;
        }
        if (str.length() != str2.length() && str.charAt((str.length() - str2.length()) - 1) != '.') {
            return false;
        }
        return true;
    }

    /* renamed from: g */
    public static void m24786g(String str, List list) {
        for (int i = 0; i < list.size(); i++) {
            C21410oO1 c21410oO1 = (C21410oO1) list.get(i);
            if (c21410oO1.m25927a() == 7 && str.equals(c21410oO1.m25926b())) {
                return;
            }
        }
        throw new SSLPeerUnverifiedException("Certificate for <" + str + "> doesn't match any of the subject alternative names: " + list);
    }

    /* renamed from: h */
    public static void m24785h(String str, List list) {
        String m24782k = m24782k(str);
        for (int i = 0; i < list.size(); i++) {
            C21410oO1 c21410oO1 = (C21410oO1) list.get(i);
            if (c21410oO1.m25927a() == 7 && m24782k.equals(m24782k(c21410oO1.m25926b()))) {
                return;
            }
        }
        throw new SSLPeerUnverifiedException("Certificate for <" + str + "> doesn't match any of the subject alternative names: " + list);
    }

    /* renamed from: i */
    public static boolean m24784i(String str, String str2, PublicSuffixMatcher publicSuffixMatcher, DomainType domainType, boolean z) {
        if (publicSuffixMatcher != null && str.contains(".") && !m24787f(str, publicSuffixMatcher.getDomainRoot(str2, domainType))) {
            return false;
        }
        int indexOf = str2.indexOf(42);
        if (indexOf != -1) {
            String substring = str2.substring(0, indexOf);
            String substring2 = str2.substring(indexOf + 1);
            if (!substring.isEmpty() && !str.startsWith(substring)) {
                return false;
            }
            if (!substring2.isEmpty() && !str.endsWith(substring2)) {
                return false;
            }
            if (z && str.substring(substring.length(), str.length() - substring2.length()).contains(".")) {
                return false;
            }
            return true;
        }
        return str.equalsIgnoreCase(str2);
    }

    /* renamed from: j */
    public static boolean m24783j(String str, String str2, PublicSuffixMatcher publicSuffixMatcher) {
        return m24784i(str, str2, publicSuffixMatcher, null, true);
    }

    /* renamed from: k */
    public static String m24782k(String str) {
        if (str == null) {
            return str;
        }
        try {
            return InetAddress.getByName(str).getHostAddress();
        } catch (UnknownHostException unused) {
            return str;
        }
    }

    @Override // javax.net.ssl.HostnameVerifier
    public boolean verify(String str, SSLSession sSLSession) {
        try {
            verify(str, (X509Certificate) sSLSession.getPeerCertificates()[0]);
            return true;
        } catch (SSLException e) {
            if (this.f73827a.isDebugEnabled()) {
                this.f73827a.debug(e.getMessage(), e);
            }
            return false;
        }
    }

    public DefaultHostnameVerifier() {
        this(null);
    }

    public void verify(String str, X509Certificate x509Certificate) throws SSLException {
        HostNameType m24792a = m24792a(str);
        List m24790c = m24790c(x509Certificate);
        if (m24790c != null && !m24790c.isEmpty()) {
            int i = C12568a.f73829a[m24792a.ordinal()];
            if (i == 1) {
                m24786g(str, m24790c);
                return;
            } else if (i != 2) {
                m24788e(str, m24790c, this.f73828b);
                return;
            } else {
                m24785h(str, m24790c);
                return;
            }
        }
        String m24791b = m24791b(x509Certificate.getSubjectX500Principal().getName("RFC2253"));
        if (m24791b != null) {
            m24789d(str, m24791b, this.f73828b);
            return;
        }
        throw new SSLException("Certificate subject for <" + str + "> doesn't contain a common name and does not have alternative names");
    }
}
