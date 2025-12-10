package org.apache.http.impl.client;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.http.HttpHost;
import org.apache.http.annotation.Contract;
import org.apache.http.annotation.ThreadingBehavior;
import org.apache.http.auth.AuthScheme;
import org.apache.http.client.AuthCache;
import org.apache.http.conn.SchemePortResolver;
import org.apache.http.conn.UnsupportedSchemeException;
import org.apache.http.impl.conn.DefaultSchemePortResolver;
import org.apache.http.util.Args;

@Contract(threading = ThreadingBehavior.SAFE)
/* loaded from: classes6.dex */
public class BasicAuthCache implements AuthCache {

    /* renamed from: a */
    public final Log f74059a;

    /* renamed from: b */
    public final Map f74060b;

    /* renamed from: c */
    public final SchemePortResolver f74061c;

    public BasicAuthCache(SchemePortResolver schemePortResolver) {
        this.f74059a = LogFactory.getLog(getClass());
        this.f74060b = new ConcurrentHashMap();
        this.f74061c = schemePortResolver == null ? DefaultSchemePortResolver.INSTANCE : schemePortResolver;
    }

    @Override // org.apache.http.client.AuthCache
    public void clear() {
        this.f74060b.clear();
    }

    @Override // org.apache.http.client.AuthCache
    public AuthScheme get(HttpHost httpHost) {
        Args.notNull(httpHost, "HTTP host");
        byte[] bArr = (byte[]) this.f74060b.get(getKey(httpHost));
        if (bArr != null) {
            try {
                ObjectInputStream objectInputStream = new ObjectInputStream(new ByteArrayInputStream(bArr));
                AuthScheme authScheme = (AuthScheme) objectInputStream.readObject();
                objectInputStream.close();
                return authScheme;
            } catch (IOException e) {
                if (this.f74059a.isWarnEnabled()) {
                    this.f74059a.warn("Unexpected I/O error while de-serializing auth scheme", e);
                    return null;
                }
                return null;
            } catch (ClassNotFoundException e2) {
                if (this.f74059a.isWarnEnabled()) {
                    this.f74059a.warn("Unexpected error while de-serializing auth scheme", e2);
                    return null;
                }
                return null;
            }
        }
        return null;
    }

    public HttpHost getKey(HttpHost httpHost) {
        if (httpHost.getPort() <= 0) {
            try {
                return new HttpHost(httpHost.getHostName(), this.f74061c.resolve(httpHost), httpHost.getSchemeName());
            } catch (UnsupportedSchemeException unused) {
            }
        }
        return httpHost;
    }

    @Override // org.apache.http.client.AuthCache
    public void put(HttpHost httpHost, AuthScheme authScheme) {
        Args.notNull(httpHost, "HTTP host");
        if (authScheme == null) {
            return;
        }
        if (authScheme instanceof Serializable) {
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
                objectOutputStream.writeObject(authScheme);
                objectOutputStream.close();
                this.f74060b.put(getKey(httpHost), byteArrayOutputStream.toByteArray());
            } catch (IOException e) {
                if (this.f74059a.isWarnEnabled()) {
                    this.f74059a.warn("Unexpected I/O error while serializing auth scheme", e);
                }
            }
        } else if (this.f74059a.isDebugEnabled()) {
            Log log = this.f74059a;
            log.debug("Auth scheme " + authScheme.getClass() + " is not serializable");
        }
    }

    @Override // org.apache.http.client.AuthCache
    public void remove(HttpHost httpHost) {
        Args.notNull(httpHost, "HTTP host");
        this.f74060b.remove(getKey(httpHost));
    }

    public String toString() {
        return this.f74060b.toString();
    }

    public BasicAuthCache() {
        this(null);
    }
}
