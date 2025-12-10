package com.google.api.client.util;

import java.io.IOException;
import java.io.OutputStream;

@Deprecated
/* loaded from: classes4.dex */
public class ByteArrayStreamingContent implements StreamingContent {

    /* renamed from: a */
    public final byte[] f52289a;

    /* renamed from: b */
    public final int f52290b;

    /* renamed from: c */
    public final int f52291c;

    public ByteArrayStreamingContent(byte[] bArr) {
        this(bArr, 0, bArr.length);
    }

    @Override // com.google.api.client.util.StreamingContent
    public void writeTo(OutputStream outputStream) throws IOException {
        outputStream.write(this.f52289a, this.f52290b, this.f52291c);
        outputStream.flush();
    }

    public ByteArrayStreamingContent(byte[] bArr, int i, int i2) {
        this.f52289a = (byte[]) Preconditions.checkNotNull(bArr);
        Preconditions.checkArgument(i >= 0 && i2 >= 0 && i + i2 <= bArr.length);
        this.f52290b = i;
        this.f52291c = i2;
    }
}
