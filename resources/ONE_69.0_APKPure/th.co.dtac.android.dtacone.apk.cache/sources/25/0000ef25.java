package org.apache.commons.p028io;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* renamed from: org.apache.commons.io.EndianUtils */
/* loaded from: classes6.dex */
public class EndianUtils {
    /* renamed from: a */
    public static int m25618a(InputStream inputStream) {
        int read = inputStream.read();
        if (-1 != read) {
            return read;
        }
        throw new EOFException("Unexpected EOF reached");
    }

    /* renamed from: b */
    public static void m25617b(byte[] bArr, int i, int i2) {
        int i3 = i + i2;
        if (bArr.length >= i3) {
            return;
        }
        throw new IllegalArgumentException("Data only has " + bArr.length + "bytes, needed " + i3 + "bytes.");
    }

    public static double readSwappedDouble(byte[] bArr, int i) {
        return Double.longBitsToDouble(readSwappedLong(bArr, i));
    }

    public static float readSwappedFloat(byte[] bArr, int i) {
        return Float.intBitsToFloat(readSwappedInteger(bArr, i));
    }

    public static int readSwappedInteger(byte[] bArr, int i) {
        m25617b(bArr, i, 4);
        return (bArr[i] & 255) + ((bArr[i + 1] & 255) << 8) + ((bArr[i + 2] & 255) << 16) + ((bArr[i + 3] & 255) << 24);
    }

    public static long readSwappedLong(byte[] bArr, int i) {
        m25617b(bArr, i, 8);
        return (readSwappedInteger(bArr, i + 4) << 32) + (readSwappedInteger(bArr, i) & BodyPartID.bodyIdMax);
    }

    public static short readSwappedShort(byte[] bArr, int i) {
        m25617b(bArr, i, 2);
        return (short) ((bArr[i] & 255) + ((bArr[i + 1] & 255) << 8));
    }

    public static long readSwappedUnsignedInteger(byte[] bArr, int i) {
        m25617b(bArr, i, 4);
        return ((bArr[i + 3] & 255) << 24) + (((bArr[i] & 255) + ((bArr[i + 1] & 255) << 8) + ((bArr[i + 2] & 255) << 16)) & BodyPartID.bodyIdMax);
    }

    public static int readSwappedUnsignedShort(byte[] bArr, int i) {
        m25617b(bArr, i, 2);
        return (bArr[i] & 255) + ((bArr[i + 1] & 255) << 8);
    }

    public static double swapDouble(double d) {
        return Double.longBitsToDouble(swapLong(Double.doubleToLongBits(d)));
    }

    public static float swapFloat(float f) {
        return Float.intBitsToFloat(swapInteger(Float.floatToIntBits(f)));
    }

    public static int swapInteger(int i) {
        return ((i & 255) << 24) + (((i >> 8) & 255) << 16) + (((i >> 16) & 255) << 8) + ((i >> 24) & 255);
    }

    public static long swapLong(long j) {
        return ((j & 255) << 56) + (((j >> 8) & 255) << 48) + (((j >> 16) & 255) << 40) + (((j >> 24) & 255) << 32) + (((j >> 32) & 255) << 24) + (((j >> 40) & 255) << 16) + (((j >> 48) & 255) << 8) + ((j >> 56) & 255);
    }

    public static short swapShort(short s) {
        return (short) (((s & 255) << 8) + ((s >> 8) & 255));
    }

    public static void writeSwappedDouble(byte[] bArr, int i, double d) {
        writeSwappedLong(bArr, i, Double.doubleToLongBits(d));
    }

    public static void writeSwappedFloat(byte[] bArr, int i, float f) {
        writeSwappedInteger(bArr, i, Float.floatToIntBits(f));
    }

    public static void writeSwappedInteger(byte[] bArr, int i, int i2) {
        m25617b(bArr, i, 4);
        bArr[i] = (byte) (i2 & 255);
        bArr[i + 1] = (byte) ((i2 >> 8) & 255);
        bArr[i + 2] = (byte) ((i2 >> 16) & 255);
        bArr[i + 3] = (byte) ((i2 >> 24) & 255);
    }

    public static void writeSwappedLong(byte[] bArr, int i, long j) {
        m25617b(bArr, i, 8);
        bArr[i] = (byte) (j & 255);
        bArr[i + 1] = (byte) ((j >> 8) & 255);
        bArr[i + 2] = (byte) ((j >> 16) & 255);
        bArr[i + 3] = (byte) ((j >> 24) & 255);
        bArr[i + 4] = (byte) ((j >> 32) & 255);
        bArr[i + 5] = (byte) ((j >> 40) & 255);
        bArr[i + 6] = (byte) ((j >> 48) & 255);
        bArr[i + 7] = (byte) ((j >> 56) & 255);
    }

    public static void writeSwappedShort(byte[] bArr, int i, short s) {
        m25617b(bArr, i, 2);
        bArr[i] = (byte) (s & 255);
        bArr[i + 1] = (byte) ((s >> 8) & 255);
    }

    public static double readSwappedDouble(InputStream inputStream) throws IOException {
        return Double.longBitsToDouble(readSwappedLong(inputStream));
    }

    public static float readSwappedFloat(InputStream inputStream) throws IOException {
        return Float.intBitsToFloat(readSwappedInteger(inputStream));
    }

    public static void writeSwappedDouble(OutputStream outputStream, double d) throws IOException {
        writeSwappedLong(outputStream, Double.doubleToLongBits(d));
    }

    public static void writeSwappedFloat(OutputStream outputStream, float f) throws IOException {
        writeSwappedInteger(outputStream, Float.floatToIntBits(f));
    }

    public static int readSwappedInteger(InputStream inputStream) throws IOException {
        return (m25618a(inputStream) & 255) + ((m25618a(inputStream) & 255) << 8) + ((m25618a(inputStream) & 255) << 16) + ((m25618a(inputStream) & 255) << 24);
    }

    public static short readSwappedShort(InputStream inputStream) throws IOException {
        return (short) ((m25618a(inputStream) & 255) + ((m25618a(inputStream) & 255) << 8));
    }

    public static int readSwappedUnsignedShort(InputStream inputStream) throws IOException {
        return (m25618a(inputStream) & 255) + ((m25618a(inputStream) & 255) << 8);
    }

    public static long readSwappedLong(InputStream inputStream) throws IOException {
        byte[] bArr = new byte[8];
        for (int i = 0; i < 8; i++) {
            bArr[i] = (byte) m25618a(inputStream);
        }
        return readSwappedLong(bArr, 0);
    }

    public static long readSwappedUnsignedInteger(InputStream inputStream) throws IOException {
        return ((m25618a(inputStream) & 255) << 24) + (((m25618a(inputStream) & 255) + ((m25618a(inputStream) & 255) << 8) + ((m25618a(inputStream) & 255) << 16)) & BodyPartID.bodyIdMax);
    }

    public static void writeSwappedShort(OutputStream outputStream, short s) throws IOException {
        outputStream.write((byte) (s & 255));
        outputStream.write((byte) ((s >> 8) & 255));
    }

    public static void writeSwappedInteger(OutputStream outputStream, int i) throws IOException {
        outputStream.write((byte) (i & 255));
        outputStream.write((byte) ((i >> 8) & 255));
        outputStream.write((byte) ((i >> 16) & 255));
        outputStream.write((byte) ((i >> 24) & 255));
    }

    public static void writeSwappedLong(OutputStream outputStream, long j) throws IOException {
        outputStream.write((byte) (j & 255));
        outputStream.write((byte) ((j >> 8) & 255));
        outputStream.write((byte) ((j >> 16) & 255));
        outputStream.write((byte) ((j >> 24) & 255));
        outputStream.write((byte) ((j >> 32) & 255));
        outputStream.write((byte) ((j >> 40) & 255));
        outputStream.write((byte) ((j >> 48) & 255));
        outputStream.write((byte) ((j >> 56) & 255));
    }
}