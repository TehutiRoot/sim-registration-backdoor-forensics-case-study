package com.google.zxing.client.result;

import java.util.regex.Pattern;

/* loaded from: classes5.dex */
public final class URIParsedResult extends ParsedResult {

    /* renamed from: d */
    public static final Pattern f57707d = Pattern.compile(":/*([^/@]+)@[^/]+");

    /* renamed from: b */
    public final String f57708b;

    /* renamed from: c */
    public final String f57709c;

    public URIParsedResult(String str, String str2) {
        super(ParsedResultType.URI);
        this.f57708b = m34184b(str);
        this.f57709c = str2;
    }

    /* renamed from: a */
    public static boolean m34185a(String str, int i) {
        int i2 = i + 1;
        int indexOf = str.indexOf(47, i2);
        if (indexOf < 0) {
            indexOf = str.length();
        }
        return ResultParser.isSubstringOfDigits(str, i2, indexOf - i2);
    }

    /* renamed from: b */
    public static String m34184b(String str) {
        String trim = str.trim();
        int indexOf = trim.indexOf(58);
        if (indexOf < 0 || m34185a(trim, indexOf)) {
            return "http://" + trim;
        }
        return trim;
    }

    @Override // com.google.zxing.client.result.ParsedResult
    public String getDisplayResult() {
        StringBuilder sb = new StringBuilder(30);
        ParsedResult.maybeAppend(this.f57709c, sb);
        ParsedResult.maybeAppend(this.f57708b, sb);
        return sb.toString();
    }

    public String getTitle() {
        return this.f57709c;
    }

    public String getURI() {
        return this.f57708b;
    }

    public boolean isPossiblyMaliciousURI() {
        return f57707d.matcher(this.f57708b).find();
    }
}
