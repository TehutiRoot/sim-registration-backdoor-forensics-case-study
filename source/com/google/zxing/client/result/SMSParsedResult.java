package com.google.zxing.client.result;

import kotlin.text.Typography;

/* loaded from: classes5.dex */
public final class SMSParsedResult extends ParsedResult {

    /* renamed from: b */
    public final String[] f57698b;

    /* renamed from: c */
    public final String[] f57699c;

    /* renamed from: d */
    public final String f57700d;

    /* renamed from: e */
    public final String f57701e;

    public SMSParsedResult(String str, String str2, String str3, String str4) {
        super(ParsedResultType.SMS);
        this.f57698b = new String[]{str};
        this.f57699c = new String[]{str2};
        this.f57700d = str3;
        this.f57701e = str4;
    }

    public String getBody() {
        return this.f57701e;
    }

    @Override // com.google.zxing.client.result.ParsedResult
    public String getDisplayResult() {
        StringBuilder sb = new StringBuilder(100);
        ParsedResult.maybeAppend(this.f57698b, sb);
        ParsedResult.maybeAppend(this.f57700d, sb);
        ParsedResult.maybeAppend(this.f57701e, sb);
        return sb.toString();
    }

    public String[] getNumbers() {
        return this.f57698b;
    }

    public String getSMSURI() {
        boolean z;
        StringBuilder sb = new StringBuilder();
        sb.append("sms:");
        boolean z2 = true;
        boolean z3 = true;
        for (int i = 0; i < this.f57698b.length; i++) {
            if (z3) {
                z3 = false;
            } else {
                sb.append(',');
            }
            sb.append(this.f57698b[i]);
            String[] strArr = this.f57699c;
            if (strArr != null && strArr[i] != null) {
                sb.append(";via=");
                sb.append(this.f57699c[i]);
            }
        }
        if (this.f57701e != null) {
            z = true;
        } else {
            z = false;
        }
        if (this.f57700d == null) {
            z2 = false;
        }
        if (z || z2) {
            sb.append('?');
            if (z) {
                sb.append("body=");
                sb.append(this.f57701e);
            }
            if (z2) {
                if (z) {
                    sb.append(Typography.amp);
                }
                sb.append("subject=");
                sb.append(this.f57700d);
            }
        }
        return sb.toString();
    }

    public String getSubject() {
        return this.f57700d;
    }

    public String[] getVias() {
        return this.f57699c;
    }

    public SMSParsedResult(String[] strArr, String[] strArr2, String str, String str2) {
        super(ParsedResultType.SMS);
        this.f57698b = strArr;
        this.f57699c = strArr2;
        this.f57700d = str;
        this.f57701e = str2;
    }
}
