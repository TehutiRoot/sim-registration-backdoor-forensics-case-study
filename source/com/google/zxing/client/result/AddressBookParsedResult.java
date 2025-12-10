package com.google.zxing.client.result;

/* loaded from: classes5.dex */
public final class AddressBookParsedResult extends ParsedResult {

    /* renamed from: b */
    public final String[] f57633b;

    /* renamed from: c */
    public final String[] f57634c;

    /* renamed from: d */
    public final String f57635d;

    /* renamed from: e */
    public final String[] f57636e;

    /* renamed from: f */
    public final String[] f57637f;

    /* renamed from: g */
    public final String[] f57638g;

    /* renamed from: h */
    public final String[] f57639h;

    /* renamed from: i */
    public final String f57640i;

    /* renamed from: j */
    public final String f57641j;

    /* renamed from: k */
    public final String[] f57642k;

    /* renamed from: l */
    public final String[] f57643l;

    /* renamed from: m */
    public final String f57644m;

    /* renamed from: n */
    public final String f57645n;

    /* renamed from: o */
    public final String f57646o;

    /* renamed from: p */
    public final String[] f57647p;

    /* renamed from: q */
    public final String[] f57648q;

    public AddressBookParsedResult(String[] strArr, String[] strArr2, String[] strArr3, String[] strArr4, String[] strArr5, String[] strArr6, String[] strArr7) {
        this(strArr, null, null, strArr2, strArr3, strArr4, strArr5, null, null, strArr6, strArr7, null, null, null, null, null);
    }

    public String[] getAddressTypes() {
        return this.f57643l;
    }

    public String[] getAddresses() {
        return this.f57642k;
    }

    public String getBirthday() {
        return this.f57645n;
    }

    @Override // com.google.zxing.client.result.ParsedResult
    public String getDisplayResult() {
        StringBuilder sb = new StringBuilder(100);
        ParsedResult.maybeAppend(this.f57633b, sb);
        ParsedResult.maybeAppend(this.f57634c, sb);
        ParsedResult.maybeAppend(this.f57635d, sb);
        ParsedResult.maybeAppend(this.f57646o, sb);
        ParsedResult.maybeAppend(this.f57644m, sb);
        ParsedResult.maybeAppend(this.f57642k, sb);
        ParsedResult.maybeAppend(this.f57636e, sb);
        ParsedResult.maybeAppend(this.f57638g, sb);
        ParsedResult.maybeAppend(this.f57640i, sb);
        ParsedResult.maybeAppend(this.f57647p, sb);
        ParsedResult.maybeAppend(this.f57645n, sb);
        ParsedResult.maybeAppend(this.f57648q, sb);
        ParsedResult.maybeAppend(this.f57641j, sb);
        return sb.toString();
    }

    public String[] getEmailTypes() {
        return this.f57639h;
    }

    public String[] getEmails() {
        return this.f57638g;
    }

    public String[] getGeo() {
        return this.f57648q;
    }

    public String getInstantMessenger() {
        return this.f57640i;
    }

    public String[] getNames() {
        return this.f57633b;
    }

    public String[] getNicknames() {
        return this.f57634c;
    }

    public String getNote() {
        return this.f57641j;
    }

    public String getOrg() {
        return this.f57644m;
    }

    public String[] getPhoneNumbers() {
        return this.f57636e;
    }

    public String[] getPhoneTypes() {
        return this.f57637f;
    }

    public String getPronunciation() {
        return this.f57635d;
    }

    public String getTitle() {
        return this.f57646o;
    }

    public String[] getURLs() {
        return this.f57647p;
    }

    public AddressBookParsedResult(String[] strArr, String[] strArr2, String str, String[] strArr3, String[] strArr4, String[] strArr5, String[] strArr6, String str2, String str3, String[] strArr7, String[] strArr8, String str4, String str5, String str6, String[] strArr9, String[] strArr10) {
        super(ParsedResultType.ADDRESSBOOK);
        this.f57633b = strArr;
        this.f57634c = strArr2;
        this.f57635d = str;
        this.f57636e = strArr3;
        this.f57637f = strArr4;
        this.f57638g = strArr5;
        this.f57639h = strArr6;
        this.f57640i = str2;
        this.f57641j = str3;
        this.f57642k = strArr7;
        this.f57643l = strArr8;
        this.f57644m = str4;
        this.f57645n = str5;
        this.f57646o = str6;
        this.f57647p = strArr9;
        this.f57648q = strArr10;
    }
}
