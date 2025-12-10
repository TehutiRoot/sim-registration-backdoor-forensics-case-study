package com.google.zxing.client.result;

/* loaded from: classes5.dex */
public final class ISBNParsedResult extends ParsedResult {

    /* renamed from: b */
    public final String f57690b;

    public ISBNParsedResult(String str) {
        super(ParsedResultType.ISBN);
        this.f57690b = str;
    }

    @Override // com.google.zxing.client.result.ParsedResult
    public String getDisplayResult() {
        return this.f57690b;
    }

    public String getISBN() {
        return this.f57690b;
    }
}
