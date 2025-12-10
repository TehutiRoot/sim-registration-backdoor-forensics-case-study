package com.google.zxing.client.result;

/* loaded from: classes5.dex */
public final class AddressBookParsedResult extends ParsedResult {

    /* renamed from: b */
    public final String[] f57645b;

    /* renamed from: c */
    public final String[] f57646c;

    /* renamed from: d */
    public final String f57647d;

    /* renamed from: e */
    public final String[] f57648e;

    /* renamed from: f */
    public final String[] f57649f;

    /* renamed from: g */
    public final String[] f57650g;

    /* renamed from: h */
    public final String[] f57651h;

    /* renamed from: i */
    public final String f57652i;

    /* renamed from: j */
    public final String f57653j;

    /* renamed from: k */
    public final String[] f57654k;

    /* renamed from: l */
    public final String[] f57655l;

    /* renamed from: m */
    public final String f57656m;

    /* renamed from: n */
    public final String f57657n;

    /* renamed from: o */
    public final String f57658o;

    /* renamed from: p */
    public final String[] f57659p;

    /* renamed from: q */
    public final String[] f57660q;

    public AddressBookParsedResult(String[] strArr, String[] strArr2, String[] strArr3, String[] strArr4, String[] strArr5, String[] strArr6, String[] strArr7) {
        this(strArr, null, null, strArr2, strArr3, strArr4, strArr5, null, null, strArr6, strArr7, null, null, null, null, null);
    }

    public String[] getAddressTypes() {
        return this.f57655l;
    }

    public String[] getAddresses() {
        return this.f57654k;
    }

    public String getBirthday() {
        return this.f57657n;
    }

    @Override // com.google.zxing.client.result.ParsedResult
    public String getDisplayResult() {
        StringBuilder sb = new StringBuilder(100);
        ParsedResult.maybeAppend(this.f57645b, sb);
        ParsedResult.maybeAppend(this.f57646c, sb);
        ParsedResult.maybeAppend(this.f57647d, sb);
        ParsedResult.maybeAppend(this.f57658o, sb);
        ParsedResult.maybeAppend(this.f57656m, sb);
        ParsedResult.maybeAppend(this.f57654k, sb);
        ParsedResult.maybeAppend(this.f57648e, sb);
        ParsedResult.maybeAppend(this.f57650g, sb);
        ParsedResult.maybeAppend(this.f57652i, sb);
        ParsedResult.maybeAppend(this.f57659p, sb);
        ParsedResult.maybeAppend(this.f57657n, sb);
        ParsedResult.maybeAppend(this.f57660q, sb);
        ParsedResult.maybeAppend(this.f57653j, sb);
        return sb.toString();
    }

    public String[] getEmailTypes() {
        return this.f57651h;
    }

    public String[] getEmails() {
        return this.f57650g;
    }

    public String[] getGeo() {
        return this.f57660q;
    }

    public String getInstantMessenger() {
        return this.f57652i;
    }

    public String[] getNames() {
        return this.f57645b;
    }

    public String[] getNicknames() {
        return this.f57646c;
    }

    public String getNote() {
        return this.f57653j;
    }

    public String getOrg() {
        return this.f57656m;
    }

    public String[] getPhoneNumbers() {
        return this.f57648e;
    }

    public String[] getPhoneTypes() {
        return this.f57649f;
    }

    public String getPronunciation() {
        return this.f57647d;
    }

    public String getTitle() {
        return this.f57658o;
    }

    public String[] getURLs() {
        return this.f57659p;
    }

    public AddressBookParsedResult(String[] strArr, String[] strArr2, String str, String[] strArr3, String[] strArr4, String[] strArr5, String[] strArr6, String str2, String str3, String[] strArr7, String[] strArr8, String str4, String str5, String str6, String[] strArr9, String[] strArr10) {
        super(ParsedResultType.ADDRESSBOOK);
        this.f57645b = strArr;
        this.f57646c = strArr2;
        this.f57647d = str;
        this.f57648e = strArr3;
        this.f57649f = strArr4;
        this.f57650g = strArr5;
        this.f57651h = strArr6;
        this.f57652i = str2;
        this.f57653j = str3;
        this.f57654k = strArr7;
        this.f57655l = strArr8;
        this.f57656m = str4;
        this.f57657n = str5;
        this.f57658o = str6;
        this.f57659p = strArr9;
        this.f57660q = strArr10;
    }
}