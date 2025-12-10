package org.apache.http.impl.client;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.apache.http.annotation.Contract;
import org.apache.http.annotation.ThreadingBehavior;
import org.apache.http.auth.AuthScope;
import org.apache.http.auth.Credentials;
import org.apache.http.client.CredentialsProvider;
import org.apache.http.util.Args;

@Contract(threading = ThreadingBehavior.SAFE)
/* loaded from: classes6.dex */
public class BasicCredentialsProvider implements CredentialsProvider {

    /* renamed from: a */
    public final ConcurrentHashMap f74146a = new ConcurrentHashMap();

    /* renamed from: a */
    public static Credentials m24870a(Map map, AuthScope authScope) {
        Credentials credentials = (Credentials) map.get(authScope);
        if (credentials == null) {
            int i = -1;
            AuthScope authScope2 = null;
            for (AuthScope authScope3 : map.keySet()) {
                int match = authScope.match(authScope3);
                if (match > i) {
                    authScope2 = authScope3;
                    i = match;
                }
            }
            if (authScope2 != null) {
                return (Credentials) map.get(authScope2);
            }
            return credentials;
        }
        return credentials;
    }

    @Override // org.apache.http.client.CredentialsProvider
    public void clear() {
        this.f74146a.clear();
    }

    @Override // org.apache.http.client.CredentialsProvider
    public Credentials getCredentials(AuthScope authScope) {
        Args.notNull(authScope, "Authentication scope");
        return m24870a(this.f74146a, authScope);
    }

    @Override // org.apache.http.client.CredentialsProvider
    public void setCredentials(AuthScope authScope, Credentials credentials) {
        Args.notNull(authScope, "Authentication scope");
        this.f74146a.put(authScope, credentials);
    }

    public String toString() {
        return this.f74146a.toString();
    }
}