package com.google.zxing.client.result;

/* loaded from: classes5.dex */
public final class WifiParsedResult extends ParsedResult {

    /* renamed from: b */
    public final String f57733b;

    /* renamed from: c */
    public final String f57734c;

    /* renamed from: d */
    public final String f57735d;

    /* renamed from: e */
    public final boolean f57736e;

    public WifiParsedResult(String str, String str2, String str3) {
        this(str, str2, str3, false);
    }

    @Override // com.google.zxing.client.result.ParsedResult
    public String getDisplayResult() {
        StringBuilder sb = new StringBuilder(80);
        ParsedResult.maybeAppend(this.f57733b, sb);
        ParsedResult.maybeAppend(this.f57734c, sb);
        ParsedResult.maybeAppend(this.f57735d, sb);
        ParsedResult.maybeAppend(Boolean.toString(this.f57736e), sb);
        return sb.toString();
    }

    public String getNetworkEncryption() {
        return this.f57734c;
    }

    public String getPassword() {
        return this.f57735d;
    }

    public String getSsid() {
        return this.f57733b;
    }

    public boolean isHidden() {
        return this.f57736e;
    }

    public WifiParsedResult(String str, String str2, String str3, boolean z) {
        super(ParsedResultType.WIFI);
        this.f57733b = str2;
        this.f57734c = str;
        this.f57735d = str3;
        this.f57736e = z;
    }
}
