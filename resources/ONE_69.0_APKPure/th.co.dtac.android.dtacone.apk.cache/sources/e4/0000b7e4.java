package com.google.zxing.client.result;

import kotlin.text.Typography;

/* loaded from: classes5.dex */
public final class SMSParsedResult extends ParsedResult {

    /* renamed from: b */
    public final String[] f57710b;

    /* renamed from: c */
    public final String[] f57711c;

    /* renamed from: d */
    public final String f57712d;

    /* renamed from: e */
    public final String f57713e;

    public SMSParsedResult(String str, String str2, String str3, String str4) {
        super(ParsedResultType.SMS);
        this.f57710b = new String[]{str};
        this.f57711c = new String[]{str2};
        this.f57712d = str3;
        this.f57713e = str4;
    }

    public String getBody() {
        return this.f57713e;
    }

    @Override // com.google.zxing.client.result.ParsedResult
    public String getDisplayResult() {
        StringBuilder sb = new StringBuilder(100);
        ParsedResult.maybeAppend(this.f57710b, sb);
        ParsedResult.maybeAppend(this.f57712d, sb);
        ParsedResult.maybeAppend(this.f57713e, sb);
        return sb.toString();
    }

    public String[] getNumbers() {
        return this.f57710b;
    }

    public String getSMSURI() {
        boolean z;
        StringBuilder sb = new StringBuilder();
        sb.append("sms:");
        boolean z2 = true;
        boolean z3 = true;
        for (int i = 0; i < this.f57710b.length; i++) {
            if (z3) {
                z3 = false;
            } else {
                sb.append(',');
            }
            sb.append(this.f57710b[i]);
            String[] strArr = this.f57711c;
            if (strArr != null && strArr[i] != null) {
                sb.append(";via=");
                sb.append(this.f57711c[i]);
            }
        }
        if (this.f57713e != null) {
            z = true;
        } else {
            z = false;
        }
        if (this.f57712d == null) {
            z2 = false;
        }
        if (z || z2) {
            sb.append('?');
            if (z) {
                sb.append("body=");
                sb.append(this.f57713e);
            }
            if (z2) {
                if (z) {
                    sb.append(Typography.amp);
                }
                sb.append("subject=");
                sb.append(this.f57712d);
            }
        }
        return sb.toString();
    }

    public String getSubject() {
        return this.f57712d;
    }

    public String[] getVias() {
        return this.f57711c;
    }

    public SMSParsedResult(String[] strArr, String[] strArr2, String str, String str2) {
        super(ParsedResultType.SMS);
        this.f57710b = strArr;
        this.f57711c = strArr2;
        this.f57712d = str;
        this.f57713e = str2;
    }
}