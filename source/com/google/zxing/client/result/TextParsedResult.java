package com.google.zxing.client.result;

/* loaded from: classes5.dex */
public final class TextParsedResult extends ParsedResult {

    /* renamed from: b */
    public final String f57705b;

    /* renamed from: c */
    public final String f57706c;

    public TextParsedResult(String str, String str2) {
        super(ParsedResultType.TEXT);
        this.f57705b = str;
        this.f57706c = str2;
    }

    @Override // com.google.zxing.client.result.ParsedResult
    public String getDisplayResult() {
        return this.f57705b;
    }

    public String getLanguage() {
        return this.f57706c;
    }

    public String getText() {
        return this.f57705b;
    }
}
