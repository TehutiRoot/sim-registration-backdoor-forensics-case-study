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
    public final String f73945a;

    /* renamed from: b */
    public final int f73946b;

    /* renamed from: c */
    public final String f73947c;

    /* renamed from: d */
    public final boolean f73948d;

    public CookieOrigin(String str, int i, String str2, boolean z) {
        Args.notBlank(str, "Host");
        Args.notNegative(i, "Port");
        Args.notNull(str2, "Path");
        this.f73945a = str.toLowerCase(Locale.ROOT);
        this.f73946b = i;
        if (!TextUtils.isBlank(str2)) {
            this.f73947c = str2;
        } else {
            this.f73947c = RemoteSettings.FORWARD_SLASH_STRING;
        }
        this.f73948d = z;
    }

    public String getHost() {
        return this.f73945a;
    }

    public String getPath() {
        return this.f73947c;
    }

    public int getPort() {
        return this.f73946b;
    }

    public boolean isSecure() {
        return this.f73948d;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AbstractJsonLexerKt.BEGIN_LIST);
        if (this.f73948d) {
            sb.append("(secure)");
        }
        sb.append(this.f73945a);
        sb.append(':');
        sb.append(Integer.toString(this.f73946b));
        sb.append(this.f73947c);
        sb.append(AbstractJsonLexerKt.END_LIST);
        return sb.toString();
    }
}