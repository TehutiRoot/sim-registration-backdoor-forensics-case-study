package com.bumptech.glide.util;

import androidx.annotation.NonNull;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes3.dex */
public class MarkEnforcingInputStream extends FilterInputStream {

    /* renamed from: a */
    public int f42747a;

    public MarkEnforcingInputStream(@NonNull InputStream inputStream) {
        super(inputStream);
        this.f42747a = Integer.MIN_VALUE;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int available() throws IOException {
        int i = this.f42747a;
        if (i == Integer.MIN_VALUE) {
            return super.available();
        }
        return Math.min(i, super.available());
    }

    /* renamed from: b */
    public final long m49981b(long j) {
        int i = this.f42747a;
        if (i == 0) {
            return -1L;
        }
        if (i != Integer.MIN_VALUE && j > i) {
            return i;
        }
        return j;
    }

    /* renamed from: d */
    public final void m49980d(long j) {
        int i = this.f42747a;
        if (i != Integer.MIN_VALUE && j != -1) {
            this.f42747a = (int) (i - j);
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void mark(int i) {
        super.mark(i);
        this.f42747a = i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        if (m49981b(1L) == -1) {
            return -1;
        }
        int read = super.read();
        m49980d(1L);
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void reset() throws IOException {
        super.reset();
        this.f42747a = Integer.MIN_VALUE;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j) throws IOException {
        long m49981b = m49981b(j);
        if (m49981b == -1) {
            return 0L;
        }
        long skip = super.skip(m49981b);
        m49980d(skip);
        return skip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(@NonNull byte[] bArr, int i, int i2) throws IOException {
        int m49981b = (int) m49981b(i2);
        if (m49981b == -1) {
            return -1;
        }
        int read = super.read(bArr, i, m49981b);
        m49980d(read);
        return read;
    }
}