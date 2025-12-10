package com.google.zxing.client.result;

import org.apache.http.message.TokenParser;

/* loaded from: classes5.dex */
public final class VINParsedResult extends ParsedResult {

    /* renamed from: b */
    public final String f57734b;

    /* renamed from: c */
    public final String f57735c;

    /* renamed from: d */
    public final String f57736d;

    /* renamed from: e */
    public final String f57737e;

    /* renamed from: f */
    public final String f57738f;

    /* renamed from: g */
    public final String f57739g;

    /* renamed from: h */
    public final int f57740h;

    /* renamed from: i */
    public final char f57741i;

    /* renamed from: j */
    public final String f57742j;

    public VINParsedResult(String str, String str2, String str3, String str4, String str5, String str6, int i, char c, String str7) {
        super(ParsedResultType.VIN);
        this.f57734b = str;
        this.f57735c = str2;
        this.f57736d = str3;
        this.f57737e = str4;
        this.f57738f = str5;
        this.f57739g = str6;
        this.f57740h = i;
        this.f57741i = c;
        this.f57742j = str7;
    }

    public String getCountryCode() {
        return this.f57738f;
    }

    @Override // com.google.zxing.client.result.ParsedResult
    public String getDisplayResult() {
        StringBuilder sb = new StringBuilder(50);
        sb.append(this.f57735c);
        sb.append(TokenParser.f74644SP);
        sb.append(this.f57736d);
        sb.append(TokenParser.f74644SP);
        sb.append(this.f57737e);
        sb.append('\n');
        String str = this.f57738f;
        if (str != null) {
            sb.append(str);
            sb.append(TokenParser.f74644SP);
        }
        sb.append(this.f57740h);
        sb.append(TokenParser.f74644SP);
        sb.append(this.f57741i);
        sb.append(TokenParser.f74644SP);
        sb.append(this.f57742j);
        sb.append('\n');
        return sb.toString();
    }

    public int getModelYear() {
        return this.f57740h;
    }

    public char getPlantCode() {
        return this.f57741i;
    }

    public String getSequentialNumber() {
        return this.f57742j;
    }

    public String getVIN() {
        return this.f57734b;
    }

    public String getVehicleAttributes() {
        return this.f57739g;
    }

    public String getVehicleDescriptorSection() {
        return this.f57736d;
    }

    public String getVehicleIdentifierSection() {
        return this.f57737e;
    }

    public String getWorldManufacturerID() {
        return this.f57735c;
    }
}