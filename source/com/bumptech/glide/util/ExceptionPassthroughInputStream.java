package com.bumptech.glide.util;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.io.InputStream;
import java.util.Queue;

/* loaded from: classes3.dex */
public final class ExceptionPassthroughInputStream extends InputStream {

    /* renamed from: c */
    public static final Queue f42720c = Util.createQueue(0);

    /* renamed from: a */
    public InputStream f42721a;

    /* renamed from: b */
    public IOException f42722b;

    @NonNull
    public static ExceptionPassthroughInputStream obtain(@NonNull InputStream inputStream) {
        ExceptionPassthroughInputStream exceptionPassthroughInputStream;
        Queue queue = f42720c;
        synchronized (queue) {
            exceptionPassthroughInputStream = (ExceptionPassthroughInputStream) queue.poll();
        }
        if (exceptionPassthroughInputStream == null) {
            exceptionPassthroughInputStream = new ExceptionPassthroughInputStream();
        }
        exceptionPassthroughInputStream.m49986b(inputStream);
        return exceptionPassthroughInputStream;
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        return this.f42721a.available();
    }

    /* renamed from: b */
    public void m49986b(InputStream inputStream) {
        this.f42721a = inputStream;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f42721a.close();
    }

    @Nullable
    public IOException getException() {
        return this.f42722b;
    }

    @Override // java.io.InputStream
    public void mark(int i) {
        this.f42721a.mark(i);
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return this.f42721a.markSupported();
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        try {
            return this.f42721a.read();
        } catch (IOException e) {
            this.f42722b = e;
            throw e;
        }
    }

    public void release() {
        this.f42722b = null;
        this.f42721a = null;
        Queue queue = f42720c;
        synchronized (queue) {
            queue.offer(this);
        }
    }

    @Override // java.io.InputStream
    public synchronized void reset() throws IOException {
        this.f42721a.reset();
    }

    @Override // java.io.InputStream
    public long skip(long j) throws IOException {
        try {
            return this.f42721a.skip(j);
        } catch (IOException e) {
            this.f42722b = e;
            throw e;
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        try {
            return this.f42721a.read(bArr);
        } catch (IOException e) {
            this.f42722b = e;
            throw e;
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        try {
            return this.f42721a.read(bArr, i, i2);
        } catch (IOException e) {
            this.f42722b = e;
            throw e;
        }
    }
}
