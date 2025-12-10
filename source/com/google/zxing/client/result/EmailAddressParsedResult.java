package com.google.zxing.client.result;

import androidx.core.net.MailTo;

/* loaded from: classes5.dex */
public final class EmailAddressParsedResult extends ParsedResult {

    /* renamed from: b */
    public final String[] f57663b;

    /* renamed from: c */
    public final String[] f57664c;

    /* renamed from: d */
    public final String[] f57665d;

    /* renamed from: e */
    public final String f57666e;

    /* renamed from: f */
    public final String f57667f;

    public EmailAddressParsedResult(String str) {
        this(new String[]{str}, null, null, null, null);
    }

    public String[] getBCCs() {
        return this.f57665d;
    }

    public String getBody() {
        return this.f57667f;
    }

    public String[] getCCs() {
        return this.f57664c;
    }

    @Override // com.google.zxing.client.result.ParsedResult
    public String getDisplayResult() {
        StringBuilder sb = new StringBuilder(30);
        ParsedResult.maybeAppend(this.f57663b, sb);
        ParsedResult.maybeAppend(this.f57664c, sb);
        ParsedResult.maybeAppend(this.f57665d, sb);
        ParsedResult.maybeAppend(this.f57666e, sb);
        ParsedResult.maybeAppend(this.f57667f, sb);
        return sb.toString();
    }

    @Deprecated
    public String getEmailAddress() {
        String[] strArr = this.f57663b;
        if (strArr != null && strArr.length != 0) {
            return strArr[0];
        }
        return null;
    }

    @Deprecated
    public String getMailtoURI() {
        return MailTo.MAILTO_SCHEME;
    }

    public String getSubject() {
        return this.f57666e;
    }

    public String[] getTos() {
        return this.f57663b;
    }

    public EmailAddressParsedResult(String[] strArr, String[] strArr2, String[] strArr3, String str, String str2) {
        super(ParsedResultType.EMAIL_ADDRESS);
        this.f57663b = strArr;
        this.f57664c = strArr2;
        this.f57665d = strArr3;
        this.f57666e = str;
        this.f57667f = str2;
    }
}
