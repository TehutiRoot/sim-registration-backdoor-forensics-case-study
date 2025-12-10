package com.google.zxing.client.result;

import androidx.core.net.MailTo;

/* loaded from: classes5.dex */
public final class EmailAddressParsedResult extends ParsedResult {

    /* renamed from: b */
    public final String[] f57675b;

    /* renamed from: c */
    public final String[] f57676c;

    /* renamed from: d */
    public final String[] f57677d;

    /* renamed from: e */
    public final String f57678e;

    /* renamed from: f */
    public final String f57679f;

    public EmailAddressParsedResult(String str) {
        this(new String[]{str}, null, null, null, null);
    }

    public String[] getBCCs() {
        return this.f57677d;
    }

    public String getBody() {
        return this.f57679f;
    }

    public String[] getCCs() {
        return this.f57676c;
    }

    @Override // com.google.zxing.client.result.ParsedResult
    public String getDisplayResult() {
        StringBuilder sb = new StringBuilder(30);
        ParsedResult.maybeAppend(this.f57675b, sb);
        ParsedResult.maybeAppend(this.f57676c, sb);
        ParsedResult.maybeAppend(this.f57677d, sb);
        ParsedResult.maybeAppend(this.f57678e, sb);
        ParsedResult.maybeAppend(this.f57679f, sb);
        return sb.toString();
    }

    @Deprecated
    public String getEmailAddress() {
        String[] strArr = this.f57675b;
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
        return this.f57678e;
    }

    public String[] getTos() {
        return this.f57675b;
    }

    public EmailAddressParsedResult(String[] strArr, String[] strArr2, String[] strArr3, String str, String str2) {
        super(ParsedResultType.EMAIL_ADDRESS);
        this.f57675b = strArr;
        this.f57676c = strArr2;
        this.f57677d = strArr3;
        this.f57678e = str;
        this.f57679f = str2;
    }
}