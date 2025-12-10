package com.google.zxing.client.result;

import java.util.Map;

/* loaded from: classes5.dex */
public final class ExpandedProductParsedResult extends ParsedResult {
    public static final String KILOGRAM = "KG";
    public static final String POUND = "LB";

    /* renamed from: b */
    public final String f57682b;

    /* renamed from: c */
    public final String f57683c;

    /* renamed from: d */
    public final String f57684d;

    /* renamed from: e */
    public final String f57685e;

    /* renamed from: f */
    public final String f57686f;

    /* renamed from: g */
    public final String f57687g;

    /* renamed from: h */
    public final String f57688h;

    /* renamed from: i */
    public final String f57689i;

    /* renamed from: j */
    public final String f57690j;

    /* renamed from: k */
    public final String f57691k;

    /* renamed from: l */
    public final String f57692l;

    /* renamed from: m */
    public final String f57693m;

    /* renamed from: n */
    public final String f57694n;

    /* renamed from: o */
    public final String f57695o;

    /* renamed from: p */
    public final Map f57696p;

    public ExpandedProductParsedResult(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, Map<String, String> map) {
        super(ParsedResultType.PRODUCT);
        this.f57682b = str;
        this.f57683c = str2;
        this.f57684d = str3;
        this.f57685e = str4;
        this.f57686f = str5;
        this.f57687g = str6;
        this.f57688h = str7;
        this.f57689i = str8;
        this.f57690j = str9;
        this.f57691k = str10;
        this.f57692l = str11;
        this.f57693m = str12;
        this.f57694n = str13;
        this.f57695o = str14;
        this.f57696p = map;
    }

    /* renamed from: a */
    public static boolean m34188a(Object obj, Object obj2) {
        if (obj == null) {
            if (obj2 == null) {
                return true;
            }
            return false;
        }
        return obj.equals(obj2);
    }

    /* renamed from: b */
    public static int m34187b(Object obj) {
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
        if (!m34188a(this.f57683c, expandedProductParsedResult.f57683c) || !m34188a(this.f57684d, expandedProductParsedResult.f57684d) || !m34188a(this.f57685e, expandedProductParsedResult.f57685e) || !m34188a(this.f57686f, expandedProductParsedResult.f57686f) || !m34188a(this.f57688h, expandedProductParsedResult.f57688h) || !m34188a(this.f57689i, expandedProductParsedResult.f57689i) || !m34188a(this.f57690j, expandedProductParsedResult.f57690j) || !m34188a(this.f57691k, expandedProductParsedResult.f57691k) || !m34188a(this.f57692l, expandedProductParsedResult.f57692l) || !m34188a(this.f57693m, expandedProductParsedResult.f57693m) || !m34188a(this.f57694n, expandedProductParsedResult.f57694n) || !m34188a(this.f57695o, expandedProductParsedResult.f57695o) || !m34188a(this.f57696p, expandedProductParsedResult.f57696p)) {
            return false;
        }
        return true;
    }

    public String getBestBeforeDate() {
        return this.f57688h;
    }

    @Override // com.google.zxing.client.result.ParsedResult
    public String getDisplayResult() {
        return String.valueOf(this.f57682b);
    }

    public String getExpirationDate() {
        return this.f57689i;
    }

    public String getLotNumber() {
        return this.f57685e;
    }

    public String getPackagingDate() {
        return this.f57687g;
    }

    public String getPrice() {
        return this.f57693m;
    }

    public String getPriceCurrency() {
        return this.f57695o;
    }

    public String getPriceIncrement() {
        return this.f57694n;
    }

    public String getProductID() {
        return this.f57683c;
    }

    public String getProductionDate() {
        return this.f57686f;
    }

    public String getRawText() {
        return this.f57682b;
    }

    public String getSscc() {
        return this.f57684d;
    }

    public Map<String, String> getUncommonAIs() {
        return this.f57696p;
    }

    public String getWeight() {
        return this.f57690j;
    }

    public String getWeightIncrement() {
        return this.f57692l;
    }

    public String getWeightType() {
        return this.f57691k;
    }

    public int hashCode() {
        return (((((((((((m34187b(this.f57683c) ^ m34187b(this.f57684d)) ^ m34187b(this.f57685e)) ^ m34187b(this.f57686f)) ^ m34187b(this.f57688h)) ^ m34187b(this.f57689i)) ^ m34187b(this.f57690j)) ^ m34187b(this.f57691k)) ^ m34187b(this.f57692l)) ^ m34187b(this.f57693m)) ^ m34187b(this.f57694n)) ^ m34187b(this.f57695o)) ^ m34187b(this.f57696p);
    }
}