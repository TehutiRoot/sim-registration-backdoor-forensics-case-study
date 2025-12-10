package com.tom_roush.pdfbox.pdfwriter;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* loaded from: classes5.dex */
public class COSStandardOutputStream extends FilterOutputStream {

    /* renamed from: a */
    public long f60064a;

    /* renamed from: b */
    public boolean f60065b;
    public static final byte[] CRLF = {13, 10};

    /* renamed from: LF */
    public static final byte[] f60063LF = {10};
    public static final byte[] EOL = {10};

    public COSStandardOutputStream(OutputStream outputStream) {
        super(outputStream);
        this.f60064a = 0L;
        this.f60065b = false;
    }

    public long getPos() {
        return this.f60064a;
    }

    public boolean isOnNewLine() {
        return this.f60065b;
    }

    public void setOnNewLine(boolean z) {
        this.f60065b = z;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) throws IOException {
        setOnNewLine(false);
        ((FilterOutputStream) this).out.write(bArr, i, i2);
        this.f60064a += i2;
    }

    public void writeCRLF() throws IOException {
        write(CRLF);
    }

    public void writeEOL() throws IOException {
        if (!isOnNewLine()) {
            write(EOL);
            setOnNewLine(true);
        }
    }

    public void writeLF() throws IOException {
        write(f60063LF);
    }

    @Deprecated
    public COSStandardOutputStream(OutputStream outputStream, int i) {
        super(outputStream);
        this.f60065b = false;
        this.f60064a = i;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(int i) throws IOException {
        setOnNewLine(false);
        ((FilterOutputStream) this).out.write(i);
        this.f60064a++;
    }

    public COSStandardOutputStream(OutputStream outputStream, long j) {
        super(outputStream);
        this.f60065b = false;
        this.f60064a = j;
    }
}