package com.google.zxing.client.result;

import java.util.Map;

/* loaded from: classes5.dex */
public final class ExpandedProductParsedResult extends ParsedResult {
    public static final String KILOGRAM = "KG";
    public static final String POUND = "LB";

    /* renamed from: b */
    public final String f57670b;

    /* renamed from: c */
    public final String f57671c;

    /* renamed from: d */
    public final String f57672d;

    /* renamed from: e */
    public final String f57673e;

    /* renamed from: f */
    public final String f57674f;

    /* renamed from: g */
    public final String f57675g;

    /* renamed from: h */
    public final String f57676h;

    /* renamed from: i */
    public final String f57677i;

    /* renamed from: j */
    public final String f57678j;

    /* renamed from: k */
    public final String f57679k;

    /* renamed from: l */
    public final String f57680l;

    /* renamed from: m */
    public final String f57681m;

    /* renamed from: n */
    public final String f57682n;

    /* renamed from: o */
    public final String f57683o;

    /* renamed from: p */
    public final Map f57684p;

    public ExpandedProductParsedResult(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, Map<String, String> map) {
        super(ParsedResultType.PRODUCT);
        this.f57670b = str;
        this.f57671c = str2;
        this.f57672d = str3;
        this.f57673e = str4;
        this.f57674f = str5;
        this.f57675g = str6;
        this.f57676h = str7;
        this.f57677i = str8;
        this.f57678j = str9;
        this.f57679k = str10;
        this.f57680l = str11;
        this.f57681m = str12;
        this.f57682n = str13;
        this.f57683o = str14;
        this.f57684p = map;
    }

    /* renamed from: a */
    public static boolean m34196a(Object obj, Object obj2) {
        if (obj == null) {
            if (obj2 == null) {
                return true;
            }
            return false;
        }
        return obj.equals(obj2);
    }

    /* renamed from: b */
    public static int m34195b(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof ExpandedProductParsedResult)) {
            return false;
        }
        ExpandedProductParsedResult expandedProductParsedResult = (ExpandedProductParsedResult) obj;
        if (!m34196a(this.f57671c, expandedProductParsedResult.f57671c) || !m34196a(this.f57672d, expandedProductParsedResult.f57672d) || !m34196a(this.f57673e, expandedProductParsedResult.f57673e) || !m34196a(this.f57674f, expandedProductParsedResult.f57674f) || !m34196a(this.f57676h, expandedProductParsedResult.f57676h) || !m34196a(this.f57677i, expandedProductParsedResult.f57677i) || !m34196a(this.f57678j, expandedProductParsedResult.f57678j) || !m34196a(this.f57679k, expandedProductParsedResult.f57679k) || !m34196a(this.f57680l, expandedProductParsedResult.f57680l) || !m34196a(this.f57681m, expandedProductParsedResult.f57681m) || !m34196a(this.f57682n, expandedProductParsedResult.f57682n) || !m34196a(this.f57683o, expandedProductParsedResult.f57683o) || !m34196a(this.f57684p, expandedProductParsedResult.f57684p)) {
            return false;
        }
        return true;
    }

    public String getBestBeforeDate() {
        return this.f57676h;
    }

    @Override // com.google.zxing.client.result.ParsedResult
    public String getDisplayResult() {
        return String.valueOf(this.f57670b);
    }

    public String getExpirationDate() {
        return this.f57677i;
    }

    public String getLotNumber() {
        return this.f57673e;
    }

    public String getPackagingDate() {
        return this.f57675g;
    }

    public String getPrice() {
        return this.f57681m;
    }

    public String getPriceCurrency() {
        return this.f57683o;
    }

    public String getPriceIncrement() {
        return this.f57682n;
    }

    public String getProductID() {
        return this.f57671c;
    }

    public String getProductionDate() {
        return this.f57674f;
    }

    public String getRawText() {
        return this.f57670b;
    }

    public String getSscc() {
        return this.f57672d;
    }

    public Map<String, String> getUncommonAIs() {
        return this.f57684p;
    }

    public String getWeight() {
        return this.f57678j;
    }

    public String getWeightIncrement() {
        return this.f57680l;
    }

    public String getWeightType() {
        return this.f57679k;
    }

    public int hashCode() {
        return (((((((((((m34195b(this.f57671c) ^ m34195b(this.f57672d)) ^ m34195b(this.f57673e)) ^ m34195b(this.f57674f)) ^ m34195b(this.f57676h)) ^ m34195b(this.f57677i)) ^ m34195b(this.f57678j)) ^ m34195b(this.f57679k)) ^ m34195b(this.f57680l)) ^ m34195b(this.f57681m)) ^ m34195b(this.f57682n)) ^ m34195b(this.f57683o)) ^ m34195b(this.f57684p);
    }
}
