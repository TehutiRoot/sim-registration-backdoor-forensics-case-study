package org.apache.http.impl.client;

import com.zxy.tiny.common.UriUtil;
import java.net.Authenticator;
import java.net.PasswordAuthentication;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.apache.http.HttpHost;
import org.apache.http.annotation.Contract;
import org.apache.http.annotation.ThreadingBehavior;
import org.apache.http.auth.AuthScope;
import org.apache.http.auth.Credentials;
import org.apache.http.auth.NTCredentials;
import org.apache.http.auth.UsernamePasswordCredentials;
import org.apache.http.client.CredentialsProvider;
import org.apache.http.util.Args;

@Contract(threading = ThreadingBehavior.SAFE)
/* loaded from: classes6.dex */
public class SystemDefaultCredentialsProvider implements CredentialsProvider {

    /* renamed from: b */
    public static final Map f74181b;

    /* renamed from: a */
    public final BasicCredentialsProvider f74182a = new BasicCredentialsProvider();

    static {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        f74181b = concurrentHashMap;
        Locale locale = Locale.ROOT;
        concurrentHashMap.put("Basic".toUpperCase(locale), "Basic");
        concurrentHashMap.put("Digest".toUpperCase(locale), "Digest");
        concurrentHashMap.put("NTLM".toUpperCase(locale), "NTLM");
        concurrentHashMap.put("Negotiate".toUpperCase(locale), "SPNEGO");
        concurrentHashMap.put("Kerberos".toUpperCase(locale), "Kerberos");
    }

    /* renamed from: a */
    public static PasswordAuthentication m24658a(String str, AuthScope authScope) {
        char[] cArr;
        String property = System.getProperty(str + ".proxyHost");
        if (property == null) {
            return null;
        }
        String property2 = System.getProperty(str + ".proxyPort");
        if (property2 == null) {
            return null;
        }
        try {
            if (authScope.match(new AuthScope(property, Integer.parseInt(property2))) >= 0) {
                String property3 = System.getProperty(str + ".proxyUser");
                if (property3 == null) {
                    return null;
                }
                String property4 = System.getProperty(str + ".proxyPassword");
                if (property4 != null) {
                    cArr = property4.toCharArray();
                } else {
                    cArr = new char[0];
                }
                return new PasswordAuthentication(property3, cArr);
            }
        } catch (NumberFormatException unused) {
        }
        return null;
    }

    /* renamed from: b */
    public static PasswordAuthentication m24657b(String str, AuthScope authScope, Authenticator.RequestorType requestorType) {
        return Authenticator.requestPasswordAuthentication(authScope.getHost(), null, authScope.getPort(), str, null, m24656c(authScope.getScheme()), null, requestorType);
    }

    /* renamed from: c */
    public static String m24656c(String str) {
        if (str == null) {
            return null;
        }
        String str2 = (String) f74181b.get(str);
        if (str2 != null) {
            return str2;
        }
        return str;
    }

    @Override // org.apache.http.client.CredentialsProvider
    public void clear() {
        this.f74182a.clear();
    }

    @Override // org.apache.http.client.CredentialsProvider
    public Credentials getCredentials(AuthScope authScope) {
        String str;
        Args.notNull(authScope, "Auth scope");
        Credentials credentials = this.f74182a.getCredentials(authScope);
        if (credentials != null) {
            return credentials;
        }
        if (authScope.getHost() != null) {
            HttpHost origin = authScope.getOrigin();
            if (origin != null) {
                str = origin.getSchemeName();
            } else if (authScope.getPort() != 443) {
                str = "http";
            } else {
                str = UriUtil.HTTPS_SCHEME;
            }
            PasswordAuthentication m24657b = m24657b(str, authScope, Authenticator.RequestorType.SERVER);
            if (m24657b == null) {
                m24657b = m24657b(str, authScope, Authenticator.RequestorType.PROXY);
            }
            if (m24657b == null && (m24657b = m24658a("http", authScope)) == null) {
                m24657b = m24658a(UriUtil.HTTPS_SCHEME, authScope);
            }
            if (m24657b != null) {
                String property = System.getProperty("http.auth.ntlm.domain");
                if (property != null) {
                    return new NTCredentials(m24657b.getUserName(), new String(m24657b.getPassword()), null, property);
                }
                if ("NTLM".equalsIgnoreCase(authScope.getScheme())) {
                    return new NTCredentials(m24657b.getUserName(), new String(m24657b.getPassword()), null, null);
                }
                return new UsernamePasswordCredentials(m24657b.getUserName(), new String(m24657b.getPassword()));
            }
        }
        return null;
    }

    @Override // org.apache.http.client.CredentialsProvider
    public void setCredentials(AuthScope authScope, Credentials credentials) {
        this.f74182a.setCredentials(authScope, credentials);
    }
}
