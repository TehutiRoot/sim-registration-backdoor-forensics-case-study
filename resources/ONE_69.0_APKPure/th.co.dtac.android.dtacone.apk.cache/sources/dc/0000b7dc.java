package com.google.zxing.client.result;

/* loaded from: classes5.dex */
public final class ISBNParsedResult extends ParsedResult {

    /* renamed from: b */
    public final String f57702b;

    public ISBNParsedResult(String str) {
        super(ParsedResultType.ISBN);
        this.f57702b = str;
    }

    @Override // com.google.zxing.client.result.ParsedResult
    public String getDisplayResult() {
        return this.f57702b;
    }

    public String getISBN() {
        return this.f57702b;
    }
}