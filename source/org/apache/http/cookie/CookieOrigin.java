package org.apache.http.cookie;

import com.google.firebase.sessions.settings.RemoteSettings;
import java.util.Locale;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.apache.http.annotation.Contract;
import org.apache.http.annotation.ThreadingBehavior;
import org.apache.http.util.Args;
import org.apache.http.util.TextUtils;

@Contract(threading = ThreadingBehavior.IMMUTABLE)
/* loaded from: classes6.dex */
public final class CookieOrigin {

    /* renamed from: a */
    public final String f73861a;

    /* renamed from: b */
    public final int f73862b;

    /* renamed from: c */
    public final String f73863c;

    /* renamed from: d */
    public final boolean f73864d;

    public CookieOrigin(String str, int i, String str2, boolean z) {
        Args.notBlank(str, "Host");
        Args.notNegative(i, "Port");
        Args.notNull(str2, "Path");
        this.f73861a = str.toLowerCase(Locale.ROOT);
        this.f73862b = i;
        if (!TextUtils.isBlank(str2)) {
            this.f73863c = str2;
        } else {
            this.f73863c = RemoteSettings.FORWARD_SLASH_STRING;
        }
        this.f73864d = z;
    }

    public String getHost() {
        return this.f73861a;
    }

    public String getPath() {
        return this.f73863c;
    }

    public int getPort() {
        return this.f73862b;
    }

    public boolean isSecure() {
        return this.f73864d;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AbstractJsonLexerKt.BEGIN_LIST);
        if (this.f73864d) {
            sb.append("(secure)");
        }
        sb.append(this.f73861a);
        sb.append(':');
        sb.append(Integer.toString(this.f73862b));
        sb.append(this.f73863c);
        sb.append(AbstractJsonLexerKt.END_LIST);
        return sb.toString();
    }
}
