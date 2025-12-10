package com.google.zxing.client.result;

import org.apache.http.message.TokenParser;

/* loaded from: classes5.dex */
public final class VINParsedResult extends ParsedResult {

    /* renamed from: b */
    public final String f57722b;

    /* renamed from: c */
    public final String f57723c;

    /* renamed from: d */
    public final String f57724d;

    /* renamed from: e */
    public final String f57725e;

    /* renamed from: f */
    public final String f57726f;

    /* renamed from: g */
    public final String f57727g;

    /* renamed from: h */
    public final int f57728h;

    /* renamed from: i */
    public final char f57729i;

    /* renamed from: j */
    public final String f57730j;

    public VINParsedResult(String str, String str2, String str3, String str4, String str5, String str6, int i, char c, String str7) {
        super(ParsedResultType.VIN);
        this.f57722b = str;
        this.f57723c = str2;
        this.f57724d = str3;
        this.f57725e = str4;
        this.f57726f = str5;
        this.f57727g = str6;
        this.f57728h = i;
        this.f57729i = c;
        this.f57730j = str7;
    }

    public String getCountryCode() {
        return this.f57726f;
    }

    @Override // com.google.zxing.client.result.ParsedResult
    public String getDisplayResult() {
        StringBuilder sb = new StringBuilder(50);
        sb.append(this.f57723c);
        sb.append(TokenParser.f74560SP);
        sb.append(this.f57724d);
        sb.append(TokenParser.f74560SP);
        sb.append(this.f57725e);
        sb.append('\n');
        String str = this.f57726f;
        if (str != null) {
            sb.append(str);
            sb.append(TokenParser.f74560SP);
        }
        sb.append(this.f57728h);
        sb.append(TokenParser.f74560SP);
        sb.append(this.f57729i);
        sb.append(TokenParser.f74560SP);
        sb.append(this.f57730j);
        sb.append('\n');
        return sb.toString();
    }

    public int getModelYear() {
        return this.f57728h;
    }

    public char getPlantCode() {
        return this.f57729i;
    }

    public String getSequentialNumber() {
        return this.f57730j;
    }

    public String getVIN() {
        return this.f57722b;
    }

    public String getVehicleAttributes() {
        return this.f57727g;
    }

    public String getVehicleDescriptorSection() {
        return this.f57724d;
    }

    public String getVehicleIdentifierSection() {
        return this.f57725e;
    }

    public String getWorldManufacturerID() {
        return this.f57723c;
    }
}
