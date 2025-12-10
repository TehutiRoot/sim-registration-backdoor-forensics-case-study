package com.google.zxing.client.result;

/* loaded from: classes5.dex */
public final class ProductParsedResult extends ParsedResult {

    /* renamed from: b */
    public final String f57704b;

    /* renamed from: c */
    public final String f57705c;

    public ProductParsedResult(String str, String str2) {
        super(ParsedResultType.PRODUCT);
        this.f57704b = str;
        this.f57705c = str2;
    }

    @Override // com.google.zxing.client.result.ParsedResult
    public String getDisplayResult() {
        return this.f57704b;
    }

    public String getNormalizedProductID() {
        return this.f57705c;
    }

    public String getProductID() {
        return this.f57704b;
    }
}