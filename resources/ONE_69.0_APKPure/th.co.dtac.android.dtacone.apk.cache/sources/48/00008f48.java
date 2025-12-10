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
    public static final Pattern f45806e = Pattern.compile("[\\w!#$&.+\\-\\^_]+|[*]");

    /* renamed from: f */
    public static final Pattern f45807f = Pattern.compile("[\\p{ASCII}&&[^\\p{Cntrl} ;/=\\[\\]\\(\\)\\<\\>\\@\\,\\:\\\"\\?\\=]]+");

    /* renamed from: g */
    public static final Pattern f45808g;

    /* renamed from: h */
    public static final Pattern f45809h;

    /* renamed from: a */
    public String f45810a;

    /* renamed from: b */
    public String f45811b;

    /* renamed from: c */
    public final SortedMap f45812c = new TreeMap();

    /* renamed from: d */
    public String f45813d;

    static {
        StringBuilder sb = new StringBuilder("[^\\s/=;\"]+".length() + 14 + "[^\\s/=;\"]+".length() + ";.*".length());
        sb.append("\\s*(");
        sb.append("[^\\s/=;\"]+");
        sb.append(")/(");
        sb.append("[^\\s/=;\"]+");
        sb.append(")\\s*(");
        sb.append(";.*");
        sb.append(")?");
        f45808g = Pattern.compile(sb.toString(), 32);
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
        f45809h = Pattern.compile(sb4.toString());
    }

    public zzgz(String str) {
        this.f45810a = "application";
        this.f45811b = "octet-stream";
        Matcher matcher = f45808g.matcher(str);
        zzml.checkArgument(matcher.matches(), "Type must be in the 'maintype/subtype; parameter=value' format");
        String group = matcher.group(1);
        Pattern pattern = f45806e;
        zzml.checkArgument(pattern.matcher(group).matches(), "Type contains reserved characters");
        this.f45810a = group;
        this.f45813d = null;
        String group2 = matcher.group(2);
        zzml.checkArgument(pattern.matcher(group2).matches(), "Subtype contains reserved characters");
        this.f45811b = group2;
        this.f45813d = null;
        String group3 = matcher.group(3);
        if (group3 != null) {
            Matcher matcher2 = f45809h.matcher(group3);
            while (matcher2.find()) {
                String group4 = matcher2.group(1);
                String group5 = matcher2.group(3);
                if (group5 == null) {
                    group5 = matcher2.group(2);
                }
                m47921a(group4, group5);
            }
        }
    }

    /* renamed from: c */
    public static boolean m47919c(String str) {
        return f45807f.matcher(str).matches();
    }

    public static boolean zzb(String str, String str2) {
        if (str2 != null && new zzgz(str).m47920b(new zzgz(str2))) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final zzgz m47921a(String str, String str2) {
        if (str2 == null) {
            this.f45813d = null;
            this.f45812c.remove(str.toLowerCase(Locale.US));
            return this;
        }
        zzml.checkArgument(f45807f.matcher(str).matches(), "Name contains reserved characters");
        this.f45813d = null;
        this.f45812c.put(str.toLowerCase(Locale.US), str2);
        return this;
    }

    /* renamed from: b */
    public final boolean m47920b(zzgz zzgzVar) {
        if (zzgzVar != null && this.f45810a.equalsIgnoreCase(zzgzVar.f45810a) && this.f45811b.equalsIgnoreCase(zzgzVar.f45811b)) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzgz)) {
            return false;
        }
        zzgz zzgzVar = (zzgz) obj;
        if (!m47920b(zzgzVar) || !this.f45812c.equals(zzgzVar.f45812c)) {
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
        m47921a("charset", name);
        return this;
    }

    public final String zzfz() {
        String str = this.f45813d;
        if (str != null) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.f45810a);
        sb.append('/');
        sb.append(this.f45811b);
        SortedMap sortedMap = this.f45812c;
        if (sortedMap != null) {
            for (Map.Entry entry : sortedMap.entrySet()) {
                String str2 = (String) entry.getValue();
                sb.append("; ");
                sb.append((String) entry.getKey());
                sb.append("=");
                if (!m47919c(str2)) {
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
        this.f45813d = sb3;
        return sb3;
    }

    public final Charset zzga() {
        String str = (String) this.f45812c.get("charset".toLowerCase(Locale.US));
        if (str == null) {
            return null;
        }
        return Charset.forName(str);
    }
}