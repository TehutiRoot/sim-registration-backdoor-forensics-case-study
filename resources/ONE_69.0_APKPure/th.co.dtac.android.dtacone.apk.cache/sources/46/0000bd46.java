package com.netcetera.threeds.sdk.infrastructure;

import java.io.Serializable;
import java.io.Writer;

/* renamed from: com.netcetera.threeds.sdk.infrastructure.oe */
/* loaded from: classes5.dex */
public class C9650oe extends Writer implements Serializable {
    private final StringBuilder get;

    public C9650oe() {
        this.get = new StringBuilder();
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // java.io.Writer, java.io.Flushable
    public void flush() {
    }

    public String toString() {
        return this.get.toString();
    }

    @Override // java.io.Writer
    public void write(String str) {
        if (str != null) {
            this.get.append(str);
        }
    }

    @Override // java.io.Writer
    public void write(char[] cArr, int i, int i2) {
        if (cArr != null) {
            this.get.append(cArr, i, i2);
        }
    }

    public C9650oe(int i) {
        this.get = new StringBuilder(i);
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Writer append(char c) {
        this.get.append(c);
        return this;
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Writer append(CharSequence charSequence) {
        this.get.append(charSequence);
        return this;
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Writer append(CharSequence charSequence, int i, int i2) {
        this.get.append(charSequence, i, i2);
        return this;
    }
}