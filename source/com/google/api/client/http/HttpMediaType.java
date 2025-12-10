package com.google.api.client.http;

import com.google.api.client.util.Preconditions;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.Locale;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes4.dex */
public final class HttpMediaType {

    /* renamed from: e */
    public static final Pattern f52083e = Pattern.compile("[\\w!#$&.+\\-\\^_]+|[*]");

    /* renamed from: f */
    public static final Pattern f52084f = Pattern.compile("[\\p{ASCII}&&[^\\p{Cntrl} ;/=\\[\\]\\(\\)\\<\\>\\@\\,\\:\\\"\\?\\=]]+");

    /* renamed from: g */
    public static final Pattern f52085g = Pattern.compile("\\s*([^\\s/=;\"]+)/([^\\s/=;\"]+)\\s*(;.*)?", 32);

    /* renamed from: h */
    public static final Pattern f52086h;

    /* renamed from: a */
    public String f52087a = "application";

    /* renamed from: b */
    public String f52088b = "octet-stream";

    /* renamed from: c */
    public final SortedMap f52089c = new TreeMap();

    /* renamed from: d */
    public String f52090d;

    static {
        StringBuilder sb = new StringBuilder();
        sb.append("\"([^\"]*)\"");
        sb.append("|");
        sb.append("[^\\s;\"]*");
        f52086h = Pattern.compile("\\s*;\\s*([^\\s/=;\"]+)=(" + sb.toString() + ")");
    }

    public HttpMediaType(String str, String str2) {
        setType(str);
        setSubType(str2);
    }

    /* renamed from: b */
    public static boolean m41756b(String str) {
        return f52084f.matcher(str).matches();
    }

    /* renamed from: c */
    public static String m41755c(String str) {
        String replace = str.replace("\\", "\\\\").replace(OperatorName.SHOW_TEXT_LINE_AND_SPACE, "\\\"");
        return OperatorName.SHOW_TEXT_LINE_AND_SPACE + replace + OperatorName.SHOW_TEXT_LINE_AND_SPACE;
    }

    /* renamed from: a */
    public final HttpMediaType m41757a(String str) {
        Matcher matcher = f52085g.matcher(str);
        Preconditions.checkArgument(matcher.matches(), "Type must be in the 'maintype/subtype; parameter=value' format");
        setType(matcher.group(1));
        setSubType(matcher.group(2));
        String group = matcher.group(3);
        if (group != null) {
            Matcher matcher2 = f52086h.matcher(group);
            while (matcher2.find()) {
                String group2 = matcher2.group(1);
                String group3 = matcher2.group(3);
                if (group3 == null) {
                    group3 = matcher2.group(2);
                }
                setParameter(group2, group3);
            }
        }
        return this;
    }

    public String build() {
        String str = this.f52090d;
        if (str != null) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.f52087a);
        sb.append('/');
        sb.append(this.f52088b);
        SortedMap sortedMap = this.f52089c;
        if (sortedMap != null) {
            for (Map.Entry entry : sortedMap.entrySet()) {
                String str2 = (String) entry.getValue();
                sb.append("; ");
                sb.append((String) entry.getKey());
                sb.append("=");
                if (!m41756b(str2)) {
                    str2 = m41755c(str2);
                }
                sb.append(str2);
            }
        }
        String sb2 = sb.toString();
        this.f52090d = sb2;
        return sb2;
    }

    public void clearParameters() {
        this.f52090d = null;
        this.f52089c.clear();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof HttpMediaType)) {
            return false;
        }
        HttpMediaType httpMediaType = (HttpMediaType) obj;
        if (!equalsIgnoreParameters(httpMediaType) || !this.f52089c.equals(httpMediaType.f52089c)) {
            return false;
        }
        return true;
    }

    public boolean equalsIgnoreParameters(HttpMediaType httpMediaType) {
        return httpMediaType != null && getType().equalsIgnoreCase(httpMediaType.getType()) && getSubType().equalsIgnoreCase(httpMediaType.getSubType());
    }

    public Charset getCharsetParameter() {
        String parameter = getParameter("charset");
        if (parameter == null) {
            return null;
        }
        return Charset.forName(parameter);
    }

    public String getParameter(String str) {
        return (String) this.f52089c.get(str.toLowerCase(Locale.US));
    }

    public Map<String, String> getParameters() {
        return Collections.unmodifiableMap(this.f52089c);
    }

    public String getSubType() {
        return this.f52088b;
    }

    public String getType() {
        return this.f52087a;
    }

    public int hashCode() {
        return build().hashCode();
    }

    public HttpMediaType removeParameter(String str) {
        this.f52090d = null;
        this.f52089c.remove(str.toLowerCase(Locale.US));
        return this;
    }

    public HttpMediaType setCharsetParameter(Charset charset) {
        String name;
        if (charset == null) {
            name = null;
        } else {
            name = charset.name();
        }
        setParameter("charset", name);
        return this;
    }

    public HttpMediaType setParameter(String str, String str2) {
        if (str2 == null) {
            removeParameter(str);
            return this;
        }
        Preconditions.checkArgument(f52084f.matcher(str).matches(), "Name contains reserved characters");
        this.f52090d = null;
        this.f52089c.put(str.toLowerCase(Locale.US), str2);
        return this;
    }

    public HttpMediaType setSubType(String str) {
        Preconditions.checkArgument(f52083e.matcher(str).matches(), "Subtype contains reserved characters");
        this.f52088b = str;
        this.f52090d = null;
        return this;
    }

    public HttpMediaType setType(String str) {
        Preconditions.checkArgument(f52083e.matcher(str).matches(), "Type contains reserved characters");
        this.f52087a = str;
        this.f52090d = null;
        return this;
    }

    public String toString() {
        return build();
    }

    public static boolean equalsIgnoreParameters(String str, String str2) {
        return (str == null && str2 == null) || !(str == null || str2 == null || !new HttpMediaType(str).equalsIgnoreParameters(new HttpMediaType(str2)));
    }

    public HttpMediaType(String str) {
        m41757a(str);
    }
}
