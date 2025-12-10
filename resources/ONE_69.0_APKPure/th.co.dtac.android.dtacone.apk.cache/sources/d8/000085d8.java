package com.fasterxml.jackson.core.p011io;

import com.fasterxml.jackson.core.util.BufferRecycler;
import com.fasterxml.jackson.core.util.TextBuffer;
import java.io.Writer;

/* renamed from: com.fasterxml.jackson.core.io.SegmentedStringWriter */
/* loaded from: classes3.dex */
public final class SegmentedStringWriter extends Writer {

    /* renamed from: a */
    public final TextBuffer f43145a;

    public SegmentedStringWriter(BufferRecycler bufferRecycler) {
        this.f43145a = new TextBuffer(bufferRecycler);
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // java.io.Writer, java.io.Flushable
    public void flush() {
    }

    public String getAndClear() {
        String contentsAsString = this.f43145a.contentsAsString();
        this.f43145a.releaseBuffers();
        return contentsAsString;
    }

    @Override // java.io.Writer
    public void write(char[] cArr) {
        this.f43145a.append(cArr, 0, cArr.length);
    }

    @Override // java.io.Writer
    public void write(char[] cArr, int i, int i2) {
        this.f43145a.append(cArr, i, i2);
    }

    @Override // java.io.Writer
    public void write(int i) {
        this.f43145a.append((char) i);
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Writer append(char c) {
        write(c);
        return this;
    }

    @Override // java.io.Writer
    public void write(String str) {
        this.f43145a.append(str, 0, str.length());
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Writer append(CharSequence charSequence) {
        String charSequence2 = charSequence.toString();
        this.f43145a.append(charSequence2, 0, charSequence2.length());
        return this;
    }

    @Override // java.io.Writer
    public void write(String str, int i, int i2) {
        this.f43145a.append(str, i, i2);
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Writer append(CharSequence charSequence, int i, int i2) {
        String charSequence2 = charSequence.subSequence(i, i2).toString();
        this.f43145a.append(charSequence2, 0, charSequence2.length());
        return this;
    }
}