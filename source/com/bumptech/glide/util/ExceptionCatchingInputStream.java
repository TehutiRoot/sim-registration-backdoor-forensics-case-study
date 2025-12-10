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
    public static final Queue f42717c = Util.createQueue(0);

    /* renamed from: a */
    public InputStream f42718a;

    /* renamed from: b */
    public IOException f42719b;

    @NonNull
    public static ExceptionCatchingInputStream obtain(@NonNull InputStream inputStream) {
        ExceptionCatchingInputStream exceptionCatchingInputStream;
        Queue queue = f42717c;
        synchronized (queue) {
            exceptionCatchingInputStream = (ExceptionCatchingInputStream) queue.poll();
        }
        if (exceptionCatchingInputStream == null) {
            exceptionCatchingInputStream = new ExceptionCatchingInputStream();
        }
        exceptionCatchingInputStream.m49987b(inputStream);
        return exceptionCatchingInputStream;
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        return this.f42718a.available();
    }

    /* renamed from: b */
    public void m49987b(InputStream inputStream) {
        this.f42718a = inputStream;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f42718a.close();
    }

    @Nullable
    public IOException getException() {
        return this.f42719b;
    }

    @Override // java.io.InputStream
    public void mark(int i) {
        this.f42718a.mark(i);
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return this.f42718a.markSupported();
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) {
        try {
            return this.f42718a.read(bArr);
        } catch (IOException e) {
            this.f42719b = e;
            return -1;
        }
    }

    public void release() {
        this.f42719b = null;
        this.f42718a = null;
        Queue queue = f42717c;
        synchronized (queue) {
            queue.offer(this);
        }
    }

    @Override // java.io.InputStream
    public synchronized void reset() throws IOException {
        this.f42718a.reset();
    }

    @Override // java.io.InputStream
    public long skip(long j) {
        try {
            return this.f42718a.skip(j);
        } catch (IOException e) {
            this.f42719b = e;
            return 0L;
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) {
        try {
            return this.f42718a.read(bArr, i, i2);
        } catch (IOException e) {
            this.f42719b = e;
            return -1;
        }
    }

    @Override // java.io.InputStream
    public int read() {
        try {
            return this.f42718a.read();
        } catch (IOException e) {
            this.f42719b = e;
            return -1;
        }
    }
}
