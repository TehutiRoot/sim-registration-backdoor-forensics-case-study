package com.google.zxing.client.result;

/* loaded from: classes5.dex */
public final class WifiParsedResult extends ParsedResult {

    /* renamed from: b */
    public final String f57745b;

    /* renamed from: c */
    public final String f57746c;

    /* renamed from: d */
    public final String f57747d;

    /* renamed from: e */
    public final boolean f57748e;

    public WifiParsedResult(String str, String str2, String str3) {
        this(str, str2, str3, false);
    }

    @Override // com.google.zxing.client.result.ParsedResult
    public String getDisplayResult() {
        StringBuilder sb = new StringBuilder(80);
        ParsedResult.maybeAppend(this.f57745b, sb);
        ParsedResult.maybeAppend(this.f57746c, sb);
        ParsedResult.maybeAppend(this.f57747d, sb);
        ParsedResult.maybeAppend(Boolean.toString(this.f57748e), sb);
        return sb.toString();
    }

    public String getNetworkEncryption() {
        return this.f57746c;
    }

    public String getPassword() {
        return this.f57747d;
    }

    public String getSsid() {
        return this.f57745b;
    }

    public boolean isHidden() {
        return this.f57748e;
    }

    public WifiParsedResult(String str, String str2, String str3, boolean z) {
        super(ParsedResultType.WIFI);
        this.f57745b = str2;
        this.f57746c = str;
        this.f57747d = str3;
        this.f57748e = z;
    }
}