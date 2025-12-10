package com.bumptech.glide.util;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.io.InputStream;
import java.util.Queue;

/* loaded from: classes3.dex */
public final class ExceptionPassthroughInputStream extends InputStream {

    /* renamed from: c */
    public static final Queue f42732c = Util.createQueue(0);

    /* renamed from: a */
    public InputStream f42733a;

    /* renamed from: b */
    public IOException f42734b;

    @NonNull
    public static ExceptionPassthroughInputStream obtain(@NonNull InputStream inputStream) {
        ExceptionPassthroughInputStream exceptionPassthroughInputStream;
        Queue queue = f42732c;
        synchronized (queue) {
            exceptionPassthroughInputStream = (ExceptionPassthroughInputStream) queue.poll();
        }
        if (exceptionPassthroughInputStream == null) {
            exceptionPassthroughInputStream = new ExceptionPassthroughInputStream();
        }
        exceptionPassthroughInputStream.m49983b(inputStream);
        return exceptionPassthroughInputStream;
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        return this.f42733a.available();
    }

    /* renamed from: b */
    public void m49983b(InputStream inputStream) {
        this.f42733a = inputStream;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f42733a.close();
    }

    @Nullable
    public IOException getException() {
        return this.f42734b;
    }

    @Override // java.io.InputStream
    public void mark(int i) {
        this.f42733a.mark(i);
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return this.f42733a.markSupported();
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        try {
            return this.f42733a.read();
        } catch (IOException e) {
            this.f42734b = e;
            throw e;
        }
    }

    public void release() {
        this.f42734b = null;
        this.f42733a = null;
        Queue queue = f42732c;
        synchronized (queue) {
            queue.offer(this);
        }
    }

    @Override // java.io.InputStream
    public synchronized void reset() throws IOException {
        this.f42733a.reset();
    }

    @Override // java.io.InputStream
    public long skip(long j) throws IOException {
        try {
            return this.f42733a.skip(j);
        } catch (IOException e) {
            this.f42734b = e;
            throw e;
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        try {
            return this.f42733a.read(bArr);
        } catch (IOException e) {
            this.f42734b = e;
            throw e;
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        try {
            return this.f42733a.read(bArr, i, i2);
        } catch (IOException e) {
            this.f42734b = e;
            throw e;
        }
    }
}