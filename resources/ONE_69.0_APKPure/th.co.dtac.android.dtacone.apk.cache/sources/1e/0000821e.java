package com.bumptech.glide.util;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.io.InputStream;
import java.util.Queue;

@Deprecated
/* loaded from: classes3.dex */
public class ExceptionCatchingInputStream extends InputStream {

    /* renamed from: c */
    public static final Queue f42729c = Util.createQueue(0);

    /* renamed from: a */
    public InputStream f42730a;

    /* renamed from: b */
    public IOException f42731b;

    @NonNull
    public static ExceptionCatchingInputStream obtain(@NonNull InputStream inputStream) {
        ExceptionCatchingInputStream exceptionCatchingInputStream;
        Queue queue = f42729c;
        synchronized (queue) {
            exceptionCatchingInputStream = (ExceptionCatchingInputStream) queue.poll();
        }
        if (exceptionCatchingInputStream == null) {
            exceptionCatchingInputStream = new ExceptionCatchingInputStream();
        }
        exceptionCatchingInputStream.m49984b(inputStream);
        return exceptionCatchingInputStream;
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        return this.f42730a.available();
    }

    /* renamed from: b */
    public void m49984b(InputStream inputStream) {
        this.f42730a = inputStream;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f42730a.close();
    }

    @Nullable
    public IOException getException() {
        return this.f42731b;
    }

    @Override // java.io.InputStream
    public void mark(int i) {
        this.f42730a.mark(i);
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return this.f42730a.markSupported();
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) {
        try {
            return this.f42730a.read(bArr);
        } catch (IOException e) {
            this.f42731b = e;
            return -1;
        }
    }

    public void release() {
        this.f42731b = null;
        this.f42730a = null;
        Queue queue = f42729c;
        synchronized (queue) {
            queue.offer(this);
        }
    }

    @Override // java.io.InputStream
    public synchronized void reset() throws IOException {
        this.f42730a.reset();
    }

    @Override // java.io.InputStream
    public long skip(long j) {
        try {
            return this.f42730a.skip(j);
        } catch (IOException e) {
            this.f42731b = e;
            return 0L;
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) {
        try {
            return this.f42730a.read(bArr, i, i2);
        } catch (IOException e) {
            this.f42731b = e;
            return -1;
        }
    }

    @Override // java.io.InputStream
    public int read() {
        try {
            return this.f42730a.read();
        } catch (IOException e) {
            this.f42731b = e;
            return -1;
        }
    }
}