package org.apache.http.client.utils;

import ch.qos.logback.classic.spi.CallerData;
import com.google.firebase.sessions.settings.RemoteSettings;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.apache.http.Consts;
import org.apache.http.NameValuePair;
import org.apache.http.conn.util.InetAddressUtils;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.TextUtils;

/* loaded from: classes6.dex */
public class URIBuilder {

    /* renamed from: a */
    public String f73736a;

    /* renamed from: b */
    public String f73737b;

    /* renamed from: c */
    public String f73738c;

    /* renamed from: d */
    public String f73739d;

    /* renamed from: e */
    public String f73740e;

    /* renamed from: f */
    public String f73741f;

    /* renamed from: g */
    public int f73742g;

    /* renamed from: h */
    public String f73743h;

    /* renamed from: i */
    public List f73744i;

    /* renamed from: j */
    public String f73745j;

    /* renamed from: k */
    public List f73746k;

    /* renamed from: l */
    public String f73747l;

    /* renamed from: m */
    public Charset f73748m;

    /* renamed from: n */
    public String f73749n;

    /* renamed from: o */
    public String f73750o;

    public URIBuilder() {
        this.f73742g = -1;
    }

    /* renamed from: g */
    public static String m24812g(String str, boolean z) {
        if (TextUtils.isBlank(str)) {
            return "";
        }
        if (!z && !str.startsWith(RemoteSettings.FORWARD_SLASH_STRING)) {
            return RemoteSettings.FORWARD_SLASH_STRING + str;
        }
        return str;
    }

    /* renamed from: a */
    public final String m24818a() {
        boolean z;
        StringBuilder sb = new StringBuilder();
        String str = this.f73736a;
        if (str != null) {
            sb.append(str);
            sb.append(':');
        }
        String str2 = this.f73737b;
        if (str2 != null) {
            sb.append(str2);
        } else {
            if (this.f73738c != null) {
                sb.append("//");
                sb.append(this.f73738c);
            } else if (this.f73741f != null) {
                sb.append("//");
                String str3 = this.f73740e;
                if (str3 != null) {
                    sb.append(str3);
                    sb.append("@");
                } else {
                    String str4 = this.f73739d;
                    if (str4 != null) {
                        sb.append(m24813f(str4));
                        sb.append("@");
                    }
                }
                if (InetAddressUtils.isIPv6Address(this.f73741f)) {
                    sb.append("[");
                    sb.append(this.f73741f);
                    sb.append("]");
                } else {
                    sb.append(this.f73741f);
                }
                if (this.f73742g >= 0) {
                    sb.append(":");
                    sb.append(this.f73742g);
                }
            }
            String str5 = this.f73743h;
            if (str5 != null) {
                if (sb.length() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                sb.append(m24812g(str5, z));
            } else {
                List list = this.f73744i;
                if (list != null) {
                    sb.append(m24816c(list));
                }
            }
            if (this.f73745j != null) {
                sb.append(CallerData.f39639NA);
                sb.append(this.f73745j);
            } else {
                List list2 = this.f73746k;
                if (list2 != null && !list2.isEmpty()) {
                    sb.append(CallerData.f39639NA);
                    sb.append(m24814e(this.f73746k));
                } else if (this.f73747l != null) {
                    sb.append(CallerData.f39639NA);
                    sb.append(m24815d(this.f73747l));
                }
            }
        }
        if (this.f73750o != null) {
            sb.append("#");
            sb.append(this.f73750o);
        } else if (this.f73749n != null) {
            sb.append("#");
            sb.append(m24815d(this.f73749n));
        }
        return sb.toString();
    }

    public URIBuilder addParameter(String str, String str2) {
        if (this.f73746k == null) {
            this.f73746k = new ArrayList();
        }
        this.f73746k.add(new BasicNameValuePair(str, str2));
        this.f73745j = null;
        this.f73737b = null;
        this.f73747l = null;
        return this;
    }

    public URIBuilder addParameters(List<NameValuePair> list) {
        if (this.f73746k == null) {
            this.f73746k = new ArrayList();
        }
        this.f73746k.addAll(list);
        this.f73745j = null;
        this.f73737b = null;
        this.f73747l = null;
        return this;
    }

    /* renamed from: b */
    public final void m24817b(URI uri) {
        this.f73736a = uri.getScheme();
        this.f73737b = uri.getRawSchemeSpecificPart();
        this.f73738c = uri.getRawAuthority();
        this.f73741f = uri.getHost();
        this.f73742g = uri.getPort();
        this.f73740e = uri.getRawUserInfo();
        this.f73739d = uri.getUserInfo();
        this.f73743h = uri.getRawPath();
        String rawPath = uri.getRawPath();
        Charset charset = this.f73748m;
        if (charset == null) {
            charset = Consts.UTF_8;
        }
        this.f73744i = m24811h(rawPath, charset);
        this.f73745j = uri.getRawQuery();
        String rawQuery = uri.getRawQuery();
        Charset charset2 = this.f73748m;
        if (charset2 == null) {
            charset2 = Consts.UTF_8;
        }
        this.f73746k = m24810i(rawQuery, charset2);
        this.f73750o = uri.getRawFragment();
        this.f73749n = uri.getFragment();
    }

    public URI build() throws URISyntaxException {
        return new URI(m24818a());
    }

    /* renamed from: c */
    public final String m24816c(List list) {
        Charset charset = this.f73748m;
        if (charset == null) {
            charset = Consts.UTF_8;
        }
        return URLEncodedUtils.formatSegments(list, charset);
    }

    public URIBuilder clearParameters() {
        this.f73746k = null;
        this.f73745j = null;
        this.f73737b = null;
        return this;
    }

    /* renamed from: d */
    public final String m24815d(String str) {
        Charset charset = this.f73748m;
        if (charset == null) {
            charset = Consts.UTF_8;
        }
        return URLEncodedUtils.m24806d(str, charset);
    }

    /* renamed from: e */
    public final String m24814e(List list) {
        Charset charset = this.f73748m;
        if (charset == null) {
            charset = Consts.UTF_8;
        }
        return URLEncodedUtils.format(list, charset);
    }

    /* renamed from: f */
    public final String m24813f(String str) {
        Charset charset = this.f73748m;
        if (charset == null) {
            charset = Consts.UTF_8;
        }
        return URLEncodedUtils.m24805e(str, charset);
    }

    public Charset getCharset() {
        return this.f73748m;
    }

    public String getFragment() {
        return this.f73749n;
    }

    public String getHost() {
        return this.f73741f;
    }

    public String getPath() {
        if (this.f73744i == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (String str : this.f73744i) {
            sb.append('/');
            sb.append(str);
        }
        return sb.toString();
    }

    public List<String> getPathSegments() {
        if (this.f73744i != null) {
            return new ArrayList(this.f73744i);
        }
        return new ArrayList();
    }

    public int getPort() {
        return this.f73742g;
    }

    public List<NameValuePair> getQueryParams() {
        if (this.f73746k != null) {
            return new ArrayList(this.f73746k);
        }
        return new ArrayList();
    }

    public String getScheme() {
        return this.f73736a;
    }

    public String getUserInfo() {
        return this.f73739d;
    }

    /* renamed from: h */
    public final List m24811h(String str, Charset charset) {
        if (str != null && !str.isEmpty()) {
            return URLEncodedUtils.parsePathSegments(str, charset);
        }
        return null;
    }

    /* renamed from: i */
    public final List m24810i(String str, Charset charset) {
        if (str != null && !str.isEmpty()) {
            return URLEncodedUtils.parse(str, charset);
        }
        return null;
    }

    public boolean isAbsolute() {
        if (this.f73736a != null) {
            return true;
        }
        return false;
    }

    public boolean isOpaque() {
        if (this.f73744i == null && this.f73743h == null) {
            return true;
        }
        return false;
    }

    public boolean isPathEmpty() {
        String str;
        List list = this.f73744i;
        if ((list != null && !list.isEmpty()) || ((str = this.f73743h) != null && !str.isEmpty())) {
            return false;
        }
        return true;
    }

    public boolean isQueryEmpty() {
        List list = this.f73746k;
        if ((list == null || list.isEmpty()) && this.f73745j == null) {
            return true;
        }
        return false;
    }

    public URIBuilder removeQuery() {
        this.f73746k = null;
        this.f73747l = null;
        this.f73745j = null;
        this.f73737b = null;
        return this;
    }

    public URIBuilder setCharset(Charset charset) {
        this.f73748m = charset;
        return this;
    }

    public URIBuilder setCustomQuery(String str) {
        this.f73747l = str;
        this.f73745j = null;
        this.f73737b = null;
        this.f73746k = null;
        return this;
    }

    public URIBuilder setFragment(String str) {
        this.f73749n = str;
        this.f73750o = null;
        return this;
    }

    public URIBuilder setHost(String str) {
        this.f73741f = str;
        this.f73737b = null;
        this.f73738c = null;
        return this;
    }

    public URIBuilder setParameter(String str, String str2) {
        if (this.f73746k == null) {
            this.f73746k = new ArrayList();
        }
        if (!this.f73746k.isEmpty()) {
            Iterator it = this.f73746k.iterator();
            while (it.hasNext()) {
                if (((NameValuePair) it.next()).getName().equals(str)) {
                    it.remove();
                }
            }
        }
        this.f73746k.add(new BasicNameValuePair(str, str2));
        this.f73745j = null;
        this.f73737b = null;
        this.f73747l = null;
        return this;
    }

    public URIBuilder setParameters(List<NameValuePair> list) {
        List list2 = this.f73746k;
        if (list2 == null) {
            this.f73746k = new ArrayList();
        } else {
            list2.clear();
        }
        this.f73746k.addAll(list);
        this.f73745j = null;
        this.f73737b = null;
        this.f73747l = null;
        return this;
    }

    public URIBuilder setPath(String str) {
        List<String> list;
        if (str != null) {
            list = URLEncodedUtils.m24802h(str);
        } else {
            list = null;
        }
        return setPathSegments(list);
    }

    public URIBuilder setPathSegments(String... strArr) {
        this.f73744i = strArr.length > 0 ? Arrays.asList(strArr) : null;
        this.f73737b = null;
        this.f73743h = null;
        return this;
    }

    public URIBuilder setPort(int i) {
        if (i < 0) {
            i = -1;
        }
        this.f73742g = i;
        this.f73737b = null;
        this.f73738c = null;
        return this;
    }

    @Deprecated
    public URIBuilder setQuery(String str) {
        Charset charset = this.f73748m;
        if (charset == null) {
            charset = Consts.UTF_8;
        }
        this.f73746k = m24810i(str, charset);
        this.f73747l = null;
        this.f73745j = null;
        this.f73737b = null;
        return this;
    }

    public URIBuilder setScheme(String str) {
        this.f73736a = str;
        return this;
    }

    public URIBuilder setUserInfo(String str) {
        this.f73739d = str;
        this.f73737b = null;
        this.f73738c = null;
        this.f73740e = null;
        return this;
    }

    public String toString() {
        return m24818a();
    }

    public URIBuilder(String str) throws URISyntaxException {
        this(new URI(str), (Charset) null);
    }

    public URIBuilder(URI uri) {
        this(uri, (Charset) null);
    }

    public URIBuilder setPathSegments(List<String> list) {
        this.f73744i = (list == null || list.size() <= 0) ? null : new ArrayList(list);
        this.f73737b = null;
        this.f73743h = null;
        return this;
    }

    public URIBuilder(String str, Charset charset) throws URISyntaxException {
        this(new URI(str), charset);
    }

    public URIBuilder setUserInfo(String str, String str2) {
        return setUserInfo(str + ':' + str2);
    }

    public URIBuilder(URI uri, Charset charset) {
        setCharset(charset);
        m24817b(uri);
    }

    public URIBuilder setParameters(NameValuePair... nameValuePairArr) {
        List list = this.f73746k;
        if (list == null) {
            this.f73746k = new ArrayList();
        } else {
            list.clear();
        }
        Collections.addAll(this.f73746k, nameValuePairArr);
        this.f73745j = null;
        this.f73737b = null;
        this.f73747l = null;
        return this;
    }
}
