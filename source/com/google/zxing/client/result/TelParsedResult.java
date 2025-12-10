package com.google.zxing.client.result;

/* loaded from: classes5.dex */
public final class TelParsedResult extends ParsedResult {

    /* renamed from: b */
    public final String f57702b;

    /* renamed from: c */
    public final String f57703c;

    /* renamed from: d */
    public final String f57704d;

    public TelParsedResult(String str, String str2, String str3) {
        super(ParsedResultType.TEL);
        this.f57702b = str;
        this.f57703c = str2;
        this.f57704d = str3;
    }

    @Override // com.google.zxing.client.result.ParsedResult
    public String getDisplayResult() {
        StringBuilder sb = new StringBuilder(20);
        ParsedResult.maybeAppend(this.f57702b, sb);
        ParsedResult.maybeAppend(this.f57704d, sb);
        return sb.toString();
    }

    public String getNumber() {
        return this.f57702b;
    }

    public String getTelURI() {
        return this.f57703c;
    }

    public String getTitle() {
        return this.f57704d;
    }
}
