package com.google.zxing.client.result;

/* loaded from: classes5.dex */
public final class ProductParsedResult extends ParsedResult {

    /* renamed from: b */
    public final String f57692b;

    /* renamed from: c */
    public final String f57693c;

    public ProductParsedResult(String str, String str2) {
        super(ParsedResultType.PRODUCT);
        this.f57692b = str;
        this.f57693c = str2;
    }

    @Override // com.google.zxing.client.result.ParsedResult
    public String getDisplayResult() {
        return this.f57692b;
    }

    public String getNormalizedProductID() {
        return this.f57693c;
    }

    public String getProductID() {
        return this.f57692b;
    }
}
