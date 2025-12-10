package org.apache.http.conn.scheme;

import java.util.Locale;
import org.apache.http.annotation.Contract;
import org.apache.http.annotation.ThreadingBehavior;
import org.apache.http.util.Args;
import org.apache.http.util.LangUtils;

@Contract(threading = ThreadingBehavior.IMMUTABLE)
@Deprecated
/* loaded from: classes6.dex */
public final class Scheme {

    /* renamed from: a */
    public final String f73819a;

    /* renamed from: b */
    public final SchemeSocketFactory f73820b;

    /* renamed from: c */
    public final int f73821c;

    /* renamed from: d */
    public final boolean f73822d;

    /* renamed from: e */
    public String f73823e;

    public Scheme(String str, int i, SchemeSocketFactory schemeSocketFactory) {
        Args.notNull(str, "Scheme name");
        Args.check(i > 0 && i <= 65535, "Port is invalid");
        Args.notNull(schemeSocketFactory, "Socket factory");
        this.f73819a = str.toLowerCase(Locale.ENGLISH);
        this.f73821c = i;
        if (schemeSocketFactory instanceof SchemeLayeredSocketFactory) {
            this.f73822d = true;
            this.f73820b = schemeSocketFactory;
        } else if (schemeSocketFactory instanceof LayeredSchemeSocketFactory) {
            this.f73822d = true;
            this.f73820b = new EE1((LayeredSchemeSocketFactory) schemeSocketFactory);
        } else {
            this.f73822d = false;
            this.f73820b = schemeSocketFactory;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Scheme)) {
            return false;
        }
        Scheme scheme = (Scheme) obj;
        if (this.f73819a.equals(scheme.f73819a) && this.f73821c == scheme.f73821c && this.f73822d == scheme.f73822d) {
            return true;
        }
        return false;
    }

    public int getDefaultPort() {
        return this.f73821c;
    }

    public String getName() {
        return this.f73819a;
    }

    public SchemeSocketFactory getSchemeSocketFactory() {
        return this.f73820b;
    }

    @Deprecated
    public SocketFactory getSocketFactory() {
        SchemeSocketFactory schemeSocketFactory = this.f73820b;
        if (schemeSocketFactory instanceof GE1) {
            return ((GE1) schemeSocketFactory).m68281a();
        }
        if (this.f73822d) {
            return new C19565di0((LayeredSchemeSocketFactory) schemeSocketFactory);
        }
        return new C19852fK1(schemeSocketFactory);
    }

    public int hashCode() {
        return LangUtils.hashCode(LangUtils.hashCode(LangUtils.hashCode(17, this.f73821c), this.f73819a), this.f73822d);
    }

    public boolean isLayered() {
        return this.f73822d;
    }

    public int resolvePort(int i) {
        if (i <= 0) {
            return this.f73821c;
        }
        return i;
    }

    public String toString() {
        if (this.f73823e == null) {
            this.f73823e = this.f73819a + ':' + Integer.toString(this.f73821c);
        }
        return this.f73823e;
    }

    @Deprecated
    public Scheme(String str, SocketFactory socketFactory, int i) {
        Args.notNull(str, "Scheme name");
        Args.notNull(socketFactory, "Socket factory");
        Args.check(i > 0 && i <= 65535, "Port is invalid");
        this.f73819a = str.toLowerCase(Locale.ENGLISH);
        if (socketFactory instanceof LayeredSocketFactory) {
            this.f73820b = new FE1((LayeredSocketFactory) socketFactory);
            this.f73822d = true;
        } else {
            this.f73820b = new GE1(socketFactory);
            this.f73822d = false;
        }
        this.f73821c = i;
    }
}
