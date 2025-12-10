package com.tom_roush.fontbox.cff;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* loaded from: classes5.dex */
public class DataOutput {

    /* renamed from: a */
    public ByteArrayOutputStream f59324a;

    /* renamed from: b */
    public String f59325b;

    public DataOutput() {
        this("ISO-8859-1");
    }

    public byte[] getBytes() {
        return this.f59324a.toByteArray();
    }

    public void print(String str) throws IOException {
        write(str.getBytes(this.f59325b));
    }

    public void println(String str) throws IOException {
        write(str.getBytes(this.f59325b));
        write(10);
    }

    public void write(int i) {
        this.f59324a.write(i);
    }

    public DataOutput(String str) {
        this.f59324a = new ByteArrayOutputStream();
        this.f59325b = str;
    }

    public void write(byte[] bArr) {
        this.f59324a.write(bArr, 0, bArr.length);
    }

    public void println() {
        write(10);
    }

    public void write(byte[] bArr, int i, int i2) {
        this.f59324a.write(bArr, i, i2);
    }
}