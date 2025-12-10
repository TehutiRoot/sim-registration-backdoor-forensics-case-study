package com.tom_roush.fontbox.cff;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* loaded from: classes5.dex */
public class DataOutput {

    /* renamed from: a */
    public ByteArrayOutputStream f59312a;

    /* renamed from: b */
    public String f59313b;

    public DataOutput() {
        this("ISO-8859-1");
    }

    public byte[] getBytes() {
        return this.f59312a.toByteArray();
    }

    public void print(String str) throws IOException {
        write(str.getBytes(this.f59313b));
    }

    public void println(String str) throws IOException {
        write(str.getBytes(this.f59313b));
        write(10);
    }

    public void write(int i) {
        this.f59312a.write(i);
    }

    public DataOutput(String str) {
        this.f59312a = new ByteArrayOutputStream();
        this.f59313b = str;
    }

    public void write(byte[] bArr) {
        this.f59312a.write(bArr, 0, bArr.length);
    }

    public void println() {
        write(10);
    }

    public void write(byte[] bArr, int i, int i2) {
        this.f59312a.write(bArr, i, i2);
    }
}
