package com.google.api.client.http;

import com.google.api.client.util.Preconditions;
import com.google.api.client.util.StringUtils;
import java.io.ByteArrayInputStream;
import java.io.InputStream;

/* loaded from: classes4.dex */
public final class ByteArrayContent extends AbstractInputStreamContent {

    /* renamed from: c */
    public final byte[] f52040c;

    /* renamed from: d */
    public final int f52041d;

    /* renamed from: e */
    public final int f52042e;

    public ByteArrayContent(String str, byte[] bArr) {
        this(str, bArr, 0, bArr.length);
    }

    public static ByteArrayContent fromString(String str, String str2) {
        return new ByteArrayContent(str, StringUtils.getBytesUtf8(str2));
    }

    @Override // com.google.api.client.http.AbstractInputStreamContent
    public InputStream getInputStream() {
        return new ByteArrayInputStream(this.f52040c, this.f52041d, this.f52042e);
    }

    @Override // com.google.api.client.http.HttpContent
    public long getLength() {
        return this.f52042e;
    }

    @Override // com.google.api.client.http.HttpContent
    public boolean retrySupported() {
        return true;
    }

    public ByteArrayContent(String str, byte[] bArr, int i, int i2) {
        super(str);
        this.f52040c = (byte[]) Preconditions.checkNotNull(bArr);
        Preconditions.checkArgument(i >= 0 && i2 >= 0 && i + i2 <= bArr.length, "offset %s, length %s, array length %s", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(bArr.length));
        this.f52041d = i;
        this.f52042e = i2;
    }

    @Override // com.google.api.client.http.AbstractInputStreamContent
    public ByteArrayContent setCloseInputStream(boolean z) {
        return (ByteArrayContent) super.setCloseInputStream(z);
    }

    @Override // com.google.api.client.http.AbstractInputStreamContent
    public ByteArrayContent setType(String str) {
        return (ByteArrayContent) super.setType(str);
    }
}