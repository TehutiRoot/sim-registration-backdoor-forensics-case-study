package com.google.api.client.util;

import java.io.IOException;
import java.io.OutputStream;

@Deprecated
/* loaded from: classes4.dex */
public class ByteArrayStreamingContent implements StreamingContent {

    /* renamed from: a */
    public final byte[] f52301a;

    /* renamed from: b */
    public final int f52302b;

    /* renamed from: c */
    public final int f52303c;

    public ByteArrayStreamingContent(byte[] bArr) {
        this(bArr, 0, bArr.length);
    }

    @Override // com.google.api.client.util.StreamingContent
    public void writeTo(OutputStream outputStream) throws IOException {
        outputStream.write(this.f52301a, this.f52302b, this.f52303c);
        outputStream.flush();
    }

    public ByteArrayStreamingContent(byte[] bArr, int i, int i2) {
        this.f52301a = (byte[]) Preconditions.checkNotNull(bArr);
        Preconditions.checkArgument(i >= 0 && i2 >= 0 && i + i2 <= bArr.length);
        this.f52302b = i;
        this.f52303c = i2;
    }
}