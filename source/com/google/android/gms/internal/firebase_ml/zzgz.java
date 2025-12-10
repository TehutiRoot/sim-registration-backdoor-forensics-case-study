package com.google.android.gms.internal.firebase_ml;

import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import java.nio.charset.Charset;
import java.util.Locale;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes3.dex */
public final class zzgz {

    /* renamed from: e */
    public static final Pattern f45794e = Pattern.compile("[\\w!#$&.+\\-\\^_]+|[*]");

    /* renamed from: f */
    public static final Pattern f45795f = Pattern.compile("[\\p{ASCII}&&[^\\p{Cntrl} ;/=\\[\\]\\(\\)\\<\\>\\@\\,\\:\\\"\\?\\=]]+");

    /* renamed from: g */
    public static final Pattern f45796g;

    /* renamed from: h */
    public static final Pattern f45797h;

    /* renamed from: a */
    public String f45798a;

    /* renamed from: b */
    public String f45799b;

    /* renamed from: c */
    public final SortedMap f45800c = new TreeMap();

    /* renamed from: d */
    public String f45801d;

    static {
        StringBuilder sb = new StringBuilder("[^\\s/=;\"]+".length() + 14 + "[^\\s/=;\"]+".length() + ";.*".length());
        sb.append("\\s*(");
        sb.append("[^\\s/=;\"]+");
        sb.append(")/(");
        sb.append("[^\\s/=;\"]+");
        sb.append(")\\s*(");
        sb.append(";.*");
        sb.append(")?");
        f45796g = Pattern.compile(sb.toString(), 32);
        StringBuilder sb2 = new StringBuilder("\"([^\"]*)\"".length() + 1 + "[^\\s;\"]*".length());
        sb2.append("\"([^\"]*)\"");
        sb2.append("|");
        sb2.append("[^\\s;\"]*");
        String sb3 = sb2.toString();
        StringBuilder sb4 = new StringBuilder("[^\\s/=;\"]+".length() + 12 + String.valueOf(sb3).length());
        sb4.append("\\s*;\\s*(");
        sb4.append("[^\\s/=;\"]+");
        sb4.append(")=(");
        sb4.append(sb3);
        sb4.append(")");
        f45797h = Pattern.compile(sb4.toString());
    }

    public zzgz(String str) {
        this.f45798a = "application";
        this.f45799b = "octet-stream";
        Matcher matcher = f45796g.matcher(str);
        zzml.checkArgument(matcher.matches(), "Type must be in the 'maintype/subtype; parameter=value' format");
        String group = matcher.group(1);
        Pattern pattern = f45794e;
        zzml.checkArgument(pattern.matcher(group).matches(), "Type contains reserved characters");
        this.f45798a = group;
        this.f45801d = null;
        String group2 = matcher.group(2);
        zzml.checkArgument(pattern.matcher(group2).matches(), "Subtype contains reserved characters");
        this.f45799b = group2;
        this.f45801d = null;
        String group3 = matcher.group(3);
        if (group3 != null) {
            Matcher matcher2 = f45797h.matcher(group3);
            while (matcher2.find()) {
                String group4 = matcher2.group(1);
                String group5 = matcher2.group(3);
                if (group5 == null) {
                    group5 = matcher2.group(2);
                }
                m47912a(group4, group5);
            }
        }
    }

    /* renamed from: c */
    public static boolean m47910c(String str) {
        return f45795f.matcher(str).matches();
    }

    public static boolean zzb(String str, String str2) {
        if (str2 != null && new zzgz(str).m47911b(new zzgz(str2))) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final zzgz m47912a(String str, String str2) {
        if (str2 == null) {
            this.f45801d = null;
            this.f45800c.remove(str.toLowerCase(Locale.US));
            return this;
        }
        zzml.checkArgument(f45795f.matcher(str).matches(), "Name contains reserved characters");
        this.f45801d = null;
        this.f45800c.put(str.toLowerCase(Locale.US), str2);
        return this;
    }

    /* renamed from: b */
    public final boolean m47911b(zzgz zzgzVar) {
        if (zzgzVar != null && this.f45798a.equalsIgnoreCase(zzgzVar.f45798a) && this.f45799b.equalsIgnoreCase(zzgzVar.f45799b)) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzgz)) {
            return false;
        }
        zzgz zzgzVar = (zzgz) obj;
        if (!m47911b(zzgzVar) || !this.f45800c.equals(zzgzVar.f45800c)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return zzfz().hashCode();
    }

    public final String toString() {
        return zzfz();
    }

    public final zzgz zza(Charset charset) {
        String name;
        if (charset == null) {
            name = null;
        } else {
            name = charset.name();
        }
        m47912a("charset", name);
        return this;
    }

    public final String zzfz() {
        String str = this.f45801d;
        if (str != null) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.f45798a);
        sb.append('/');
        sb.append(this.f45799b);
        SortedMap sortedMap = this.f45800c;
        if (sortedMap != null) {
            for (Map.Entry entry : sortedMap.entrySet()) {
                String str2 = (String) entry.getValue();
                sb.append("; ");
                sb.append((String) entry.getKey());
                sb.append("=");
                if (!m47910c(str2)) {
                    String replace = str2.replace("\\", "\\\\").replace(OperatorName.SHOW_TEXT_LINE_AND_SPACE, "\\\"");
                    StringBuilder sb2 = new StringBuilder(String.valueOf(replace).length() + 2);
                    sb2.append(OperatorName.SHOW_TEXT_LINE_AND_SPACE);
                    sb2.append(replace);
                    sb2.append(OperatorName.SHOW_TEXT_LINE_AND_SPACE);
                    str2 = sb2.toString();
                }
                sb.append(str2);
            }
        }
        String sb3 = sb.toString();
        this.f45801d = sb3;
        return sb3;
    }

    public final Charset zzga() {
        String str = (String) this.f45800c.get("charset".toLowerCase(Locale.US));
        if (str == null) {
            return null;
        }
        return Charset.forName(str);
    }
}
