package com.bumptech.glide.util;

import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes3.dex */
public final class ContentLengthInputStream extends FilterInputStream {

    /* renamed from: a */
    public final long f42727a;

    /* renamed from: b */
    public int f42728b;

    public ContentLengthInputStream(InputStream inputStream, long j) {
        super(inputStream);
        this.f42727a = j;
    }

    /* renamed from: d */
    public static int m49985d(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                return Integer.parseInt(str);
            } catch (NumberFormatException unused) {
                if (Log.isLoggable("ContentLengthStream", 3)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("failed to parse content length header: ");
                    sb.append(str);
                }
            }
        }
        return -1;
    }

    @NonNull
    public static InputStream obtain(@NonNull InputStream inputStream, @Nullable String str) {
        return obtain(inputStream, m49985d(str));
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int available() throws IOException {
        return (int) Math.max(this.f42727a - this.f42728b, ((FilterInputStream) this).in.available());
    }

    /* renamed from: b */
    public final int m49986b(int i) {
        if (i >= 0) {
            this.f42728b += i;
        } else if (this.f42727a - this.f42728b > 0) {
            throw new IOException("Failed to read all expected data, expected: " + this.f42727a + ", but read: " + this.f42728b);
        }
        return i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read() throws IOException {
        int read;
        read = super.read();
        m49986b(read >= 0 ? 1 : -1);
        return read;
    }

    @NonNull
    public static InputStream obtain(@NonNull InputStream inputStream, long j) {
        return new ContentLengthInputStream(inputStream, j);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read(byte[] bArr, int i, int i2) throws IOException {
        return m49986b(super.read(bArr, i, i2));
    }
}