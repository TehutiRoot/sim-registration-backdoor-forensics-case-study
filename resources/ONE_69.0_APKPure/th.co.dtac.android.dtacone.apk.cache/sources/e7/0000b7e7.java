package com.google.zxing.client.result;

/* loaded from: classes5.dex */
public final class TelParsedResult extends ParsedResult {

    /* renamed from: b */
    public final String f57714b;

    /* renamed from: c */
    public final String f57715c;

    /* renamed from: d */
    public final String f57716d;

    public TelParsedResult(String str, String str2, String str3) {
        super(ParsedResultType.TEL);
        this.f57714b = str;
        this.f57715c = str2;
        this.f57716d = str3;
    }

    @Override // com.google.zxing.client.result.ParsedResult
    public String getDisplayResult() {
        StringBuilder sb = new StringBuilder(20);
        ParsedResult.maybeAppend(this.f57714b, sb);
        ParsedResult.maybeAppend(this.f57716d, sb);
        return sb.toString();
    }

    public String getNumber() {
        return this.f57714b;
    }

    public String getTelURI() {
        return this.f57715c;
    }

    public String getTitle() {
        return this.f57716d;
    }
}