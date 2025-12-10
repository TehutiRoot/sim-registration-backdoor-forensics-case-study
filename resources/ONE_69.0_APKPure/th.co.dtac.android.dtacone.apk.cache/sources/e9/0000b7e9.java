package com.google.zxing.client.result;

/* loaded from: classes5.dex */
public final class TextParsedResult extends ParsedResult {

    /* renamed from: b */
    public final String f57717b;

    /* renamed from: c */
    public final String f57718c;

    public TextParsedResult(String str, String str2) {
        super(ParsedResultType.TEXT);
        this.f57717b = str;
        this.f57718c = str2;
    }

    @Override // com.google.zxing.client.result.ParsedResult
    public String getDisplayResult() {
        return this.f57717b;
    }

    public String getLanguage() {
        return this.f57718c;
    }

    public String getText() {
        return this.f57717b;
    }
}