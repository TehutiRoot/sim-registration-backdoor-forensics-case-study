package com.mixpanel.android.java_websocket.util;

import android.annotation.SuppressLint;
import androidx.core.view.MotionEventCompat;
import com.facebook.stetho.dumpapp.Framer;
import com.google.common.base.Ascii;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilterInputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamClass;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import okio.Utf8;

@SuppressLint({"Assert"})
/* loaded from: classes5.dex */
public class Base64 {
    public static final int DECODE = 0;
    public static final int DONT_GUNZIP = 4;
    public static final int DO_BREAK_LINES = 8;
    public static final int ENCODE = 1;
    public static final int GZIP = 2;
    public static final int NO_OPTIONS = 0;
    public static final int ORDERED = 32;
    public static final int URL_SAFE = 16;

    /* renamed from: a */
    public static final byte[] f58470a = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, Framer.EXIT_FRAME_PREFIX, 121, 122, 48, Framer.STDOUT_FRAME_PREFIX, Framer.STDERR_FRAME_PREFIX, 51, 52, 53, 54, 55, 56, 57, 43, 47};

    /* renamed from: b */
    public static final byte[] f58471b = {-9, -9, -9, -9, -9, -9, -9, -9, -9, -5, -5, -9, -9, -5, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -5, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, 62, -9, -9, -9, Utf8.REPLACEMENT_BYTE, 52, 53, 54, 55, 56, 57, 58, 59, 60, kotlin.p023io.encoding.Base64.padSymbol, -9, -9, -9, -1, -9, -9, -9, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, Ascii.DC4, Ascii.NAK, Ascii.SYN, Ascii.ETB, Ascii.CAN, Ascii.f52696EM, -9, -9, -9, -9, -9, -9, Ascii.SUB, Ascii.ESC, Ascii.f52698FS, Ascii.f52699GS, Ascii.f52703RS, Ascii.f52707US, 32, Framer.ENTER_FRAME_PREFIX, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, Framer.STDIN_FRAME_PREFIX, 46, 47, 48, Framer.STDOUT_FRAME_PREFIX, Framer.STDERR_FRAME_PREFIX, 51, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9};

    /* renamed from: c */
    public static final byte[] f58472c = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, Framer.EXIT_FRAME_PREFIX, 121, 122, 48, Framer.STDOUT_FRAME_PREFIX, Framer.STDERR_FRAME_PREFIX, 51, 52, 53, 54, 55, 56, 57, Framer.STDIN_FRAME_PREFIX, Framer.STDIN_REQUEST_FRAME_PREFIX};

    /* renamed from: d */
    public static final byte[] f58473d = {-9, -9, -9, -9, -9, -9, -9, -9, -9, -5, -5, -9, -9, -5, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -5, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, 62, -9, -9, 52, 53, 54, 55, 56, 57, 58, 59, 60, kotlin.p023io.encoding.Base64.padSymbol, -9, -9, -9, -1, -9, -9, -9, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, Ascii.DC4, Ascii.NAK, Ascii.SYN, Ascii.ETB, Ascii.CAN, Ascii.f52696EM, -9, -9, -9, -9, Utf8.REPLACEMENT_BYTE, -9, Ascii.SUB, Ascii.ESC, Ascii.f52698FS, Ascii.f52699GS, Ascii.f52703RS, Ascii.f52707US, 32, Framer.ENTER_FRAME_PREFIX, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, Framer.STDIN_FRAME_PREFIX, 46, 47, 48, Framer.STDOUT_FRAME_PREFIX, Framer.STDERR_FRAME_PREFIX, 51, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9};

    /* renamed from: e */
    public static final byte[] f58474e = {Framer.STDIN_FRAME_PREFIX, 48, Framer.STDOUT_FRAME_PREFIX, Framer.STDERR_FRAME_PREFIX, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, Framer.STDIN_REQUEST_FRAME_PREFIX, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, Framer.EXIT_FRAME_PREFIX, 121, 122};

    /* renamed from: f */
    public static final byte[] f58475f = {-9, -9, -9, -9, -9, -9, -9, -9, -9, -5, -5, -9, -9, -5, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -5, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, 0, -9, -9, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -9, -9, -9, -1, -9, -9, -9, 11, 12, 13, 14, 15, 16, 17, 18, 19, Ascii.DC4, Ascii.NAK, Ascii.SYN, Ascii.ETB, Ascii.CAN, Ascii.f52696EM, Ascii.SUB, Ascii.ESC, Ascii.f52698FS, Ascii.f52699GS, Ascii.f52703RS, Ascii.f52707US, 32, Framer.ENTER_FRAME_PREFIX, 34, 35, 36, -9, -9, -9, -9, 37, -9, 38, 39, 40, 41, 42, 43, 44, Framer.STDIN_FRAME_PREFIX, 46, 47, 48, Framer.STDOUT_FRAME_PREFIX, Framer.STDERR_FRAME_PREFIX, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, kotlin.p023io.encoding.Base64.padSymbol, 62, Utf8.REPLACEMENT_BYTE, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9};

    /* loaded from: classes5.dex */
    public static class InputStream extends FilterInputStream {

        /* renamed from: a */
        public boolean f58476a;

        /* renamed from: b */
        public int f58477b;

        /* renamed from: c */
        public byte[] f58478c;

        /* renamed from: d */
        public int f58479d;

        /* renamed from: e */
        public int f58480e;

        /* renamed from: f */
        public int f58481f;

        /* renamed from: g */
        public boolean f58482g;

        /* renamed from: h */
        public int f58483h;

        /* renamed from: i */
        public byte[] f58484i;

        public InputStream(java.io.InputStream inputStream) {
            this(inputStream, 0);
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read() throws IOException {
            int read;
            if (this.f58477b < 0) {
                if (this.f58476a) {
                    byte[] bArr = new byte[3];
                    int i = 0;
                    for (int i2 = 0; i2 < 3; i2++) {
                        int read2 = ((FilterInputStream) this).in.read();
                        if (read2 < 0) {
                            break;
                        }
                        bArr[i2] = (byte) read2;
                        i++;
                    }
                    if (i <= 0) {
                        return -1;
                    }
                    Base64.m33666f(bArr, 0, i, this.f58478c, 0, this.f58483h);
                    this.f58477b = 0;
                    this.f58480e = 4;
                } else {
                    byte[] bArr2 = new byte[4];
                    int i3 = 0;
                    while (i3 < 4) {
                        do {
                            read = ((FilterInputStream) this).in.read();
                            if (read < 0) {
                                break;
                            }
                        } while (this.f58484i[read & 127] <= -5);
                        if (read < 0) {
                            break;
                        }
                        bArr2[i3] = (byte) read;
                        i3++;
                    }
                    if (i3 != 4) {
                        if (i3 == 0) {
                            return -1;
                        }
                        throw new IOException("Improperly padded Base64 input.");
                    }
                    this.f58480e = Base64.m33667e(bArr2, 0, this.f58478c, 0, this.f58483h);
                    this.f58477b = 0;
                }
            }
            int i4 = this.f58477b;
            if (i4 >= 0) {
                if (i4 >= this.f58480e) {
                    return -1;
                }
                if (this.f58476a && this.f58482g && this.f58481f >= 76) {
                    this.f58481f = 0;
                    return 10;
                }
                this.f58481f++;
                byte[] bArr3 = this.f58478c;
                int i5 = i4 + 1;
                this.f58477b = i5;
                byte b = bArr3[i4];
                if (i5 >= this.f58479d) {
                    this.f58477b = -1;
                }
                return b & 255;
            }
            throw new IOException("Error in Base64 code reading stream.");
        }

        public InputStream(java.io.InputStream inputStream, int i) {
            super(inputStream);
            this.f58483h = i;
            this.f58482g = (i & 8) > 0;
            boolean z = (i & 1) > 0;
            this.f58476a = z;
            int i2 = z ? 4 : 3;
            this.f58479d = i2;
            this.f58478c = new byte[i2];
            this.f58477b = -1;
            this.f58481f = 0;
            this.f58484i = Base64.m33663i(i);
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read(byte[] bArr, int i, int i2) throws IOException {
            int i3 = 0;
            while (true) {
                if (i3 >= i2) {
                    break;
                }
                int read = read();
                if (read >= 0) {
                    bArr[i + i3] = (byte) read;
                    i3++;
                } else if (i3 == 0) {
                    return -1;
                }
            }
            return i3;
        }
    }

    /* loaded from: classes5.dex */
    public static class OutputStream extends FilterOutputStream {

        /* renamed from: a */
        public boolean f58485a;

        /* renamed from: b */
        public int f58486b;

        /* renamed from: c */
        public byte[] f58487c;

        /* renamed from: d */
        public int f58488d;

        /* renamed from: e */
        public int f58489e;

        /* renamed from: f */
        public boolean f58490f;

        /* renamed from: g */
        public byte[] f58491g;

        /* renamed from: h */
        public boolean f58492h;

        /* renamed from: i */
        public int f58493i;

        /* renamed from: j */
        public byte[] f58494j;

        public OutputStream(java.io.OutputStream outputStream) {
            this(outputStream, 1);
        }

        @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            flushBase64();
            super.close();
            this.f58487c = null;
            ((FilterOutputStream) this).out = null;
        }

        public void flushBase64() throws IOException {
            int i = this.f58486b;
            if (i > 0) {
                if (this.f58485a) {
                    ((FilterOutputStream) this).out.write(Base64.m33665g(this.f58491g, this.f58487c, i, this.f58493i));
                    this.f58486b = 0;
                    return;
                }
                throw new IOException("Base64 input not properly padded.");
            }
        }

        public void resumeEncoding() {
            this.f58492h = false;
        }

        public void suspendEncoding() throws IOException {
            flushBase64();
            this.f58492h = true;
        }

        @Override // java.io.FilterOutputStream, java.io.OutputStream
        public void write(int i) throws IOException {
            if (this.f58492h) {
                ((FilterOutputStream) this).out.write(i);
            } else if (this.f58485a) {
                byte[] bArr = this.f58487c;
                int i2 = this.f58486b;
                int i3 = i2 + 1;
                this.f58486b = i3;
                bArr[i2] = (byte) i;
                int i4 = this.f58488d;
                if (i3 >= i4) {
                    ((FilterOutputStream) this).out.write(Base64.m33665g(this.f58491g, bArr, i4, this.f58493i));
                    int i5 = this.f58489e + 4;
                    this.f58489e = i5;
                    if (this.f58490f && i5 >= 76) {
                        ((FilterOutputStream) this).out.write(10);
                        this.f58489e = 0;
                    }
                    this.f58486b = 0;
                }
            } else {
                byte b = this.f58494j[i & 127];
                if (b <= -5) {
                    if (b != -5) {
                        throw new IOException("Invalid character in Base64 data.");
                    }
                    return;
                }
                byte[] bArr2 = this.f58487c;
                int i6 = this.f58486b;
                int i7 = i6 + 1;
                this.f58486b = i7;
                bArr2[i6] = (byte) i;
                if (i7 >= this.f58488d) {
                    ((FilterOutputStream) this).out.write(this.f58491g, 0, Base64.m33667e(bArr2, 0, this.f58491g, 0, this.f58493i));
                    this.f58486b = 0;
                }
            }
        }

        public OutputStream(java.io.OutputStream outputStream, int i) {
            super(outputStream);
            this.f58490f = (i & 8) != 0;
            boolean z = (i & 1) != 0;
            this.f58485a = z;
            int i2 = z ? 3 : 4;
            this.f58488d = i2;
            this.f58487c = new byte[i2];
            this.f58486b = 0;
            this.f58489e = 0;
            this.f58492h = false;
            this.f58491g = new byte[4];
            this.f58493i = i;
            this.f58494j = Base64.m33663i(i);
        }

        @Override // java.io.FilterOutputStream, java.io.OutputStream
        public void write(byte[] bArr, int i, int i2) throws IOException {
            if (this.f58492h) {
                ((FilterOutputStream) this).out.write(bArr, i, i2);
                return;
            }
            for (int i3 = 0; i3 < i2; i3++) {
                write(bArr[i + i3]);
            }
        }
    }

    /* renamed from: com.mixpanel.android.java_websocket.util.Base64$a */
    /* loaded from: classes5.dex */
    public static class C9125a extends ObjectInputStream {

        /* renamed from: a */
        public final /* synthetic */ ClassLoader f58495a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9125a(java.io.InputStream inputStream, ClassLoader classLoader) {
            super(inputStream);
            this.f58495a = classLoader;
        }

        @Override // java.io.ObjectInputStream
        public Class resolveClass(ObjectStreamClass objectStreamClass) {
            Class<?> cls = Class.forName(objectStreamClass.getName(), false, this.f58495a);
            if (cls == null) {
                return super.resolveClass(objectStreamClass);
            }
            return cls;
        }
    }

    public static byte[] decode(byte[] bArr) throws IOException {
        return decode(bArr, 0, bArr.length, 0);
    }

    public static void decodeFileToFile(String str, String str2) throws IOException {
        byte[] decodeFromFile = decodeFromFile(str);
        BufferedOutputStream bufferedOutputStream = null;
        try {
            try {
                BufferedOutputStream bufferedOutputStream2 = new BufferedOutputStream(new FileOutputStream(str2));
                try {
                    bufferedOutputStream2.write(decodeFromFile);
                    try {
                        bufferedOutputStream2.close();
                    } catch (Exception unused) {
                    }
                } catch (IOException e) {
                } catch (Throwable th2) {
                    th = th2;
                    bufferedOutputStream = bufferedOutputStream2;
                    try {
                        bufferedOutputStream.close();
                    } catch (Exception unused2) {
                    }
                    throw th;
                }
            } catch (IOException e2) {
                throw e2;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public static byte[] decodeFromFile(String str) throws IOException {
        InputStream inputStream = null;
        try {
            try {
                File file = new File(str);
                if (file.length() <= 2147483647L) {
                    byte[] bArr = new byte[(int) file.length()];
                    InputStream inputStream2 = new InputStream(new BufferedInputStream(new FileInputStream(file)), 0);
                    int i = 0;
                    while (true) {
                        try {
                            int read = inputStream2.read(bArr, i, 4096);
                            if (read < 0) {
                                break;
                            }
                            i += read;
                        } catch (IOException e) {
                            throw e;
                        } catch (Throwable th2) {
                            th = th2;
                            inputStream = inputStream2;
                            try {
                                inputStream.close();
                            } catch (Exception unused) {
                            }
                            throw th;
                        }
                    }
                    byte[] bArr2 = new byte[i];
                    System.arraycopy(bArr, 0, bArr2, 0, i);
                    try {
                        inputStream2.close();
                    } catch (Exception unused2) {
                    }
                    return bArr2;
                }
                throw new IOException("File is too big for this convenience method (" + file.length() + " bytes).");
            } catch (IOException e2) {
                throw e2;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public static void decodeToFile(String str, String str2) throws IOException {
        OutputStream outputStream = null;
        try {
            try {
                OutputStream outputStream2 = new OutputStream(new FileOutputStream(str2), 0);
                try {
                    outputStream2.write(str.getBytes("US-ASCII"));
                    try {
                        outputStream2.close();
                    } catch (Exception unused) {
                    }
                } catch (IOException e) {
                } catch (Throwable th2) {
                    th = th2;
                    outputStream = outputStream2;
                    try {
                        outputStream.close();
                    } catch (Exception unused2) {
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (IOException e2) {
            throw e2;
        }
    }

    public static Object decodeToObject(String str) throws IOException, ClassNotFoundException {
        return decodeToObject(str, 0, null);
    }

    /* renamed from: e */
    public static int m33667e(byte[] bArr, int i, byte[] bArr2, int i2, int i3) {
        int i4;
        int i5;
        if (bArr != null) {
            if (bArr2 != null) {
                if (i >= 0 && (i4 = i + 3) < bArr.length) {
                    if (i2 >= 0 && (i5 = i2 + 2) < bArr2.length) {
                        byte[] m33663i = m33663i(i3);
                        byte b = bArr[i + 2];
                        if (b == 61) {
                            bArr2[i2] = (byte) ((((m33663i[bArr[i + 1]] & 255) << 12) | ((m33663i[bArr[i]] & 255) << 18)) >>> 16);
                            return 1;
                        }
                        byte b2 = bArr[i4];
                        if (b2 == 61) {
                            int i6 = ((m33663i[bArr[i + 1]] & 255) << 12) | ((m33663i[bArr[i]] & 255) << 18) | ((m33663i[b] & 255) << 6);
                            bArr2[i2] = (byte) (i6 >>> 16);
                            bArr2[i2 + 1] = (byte) (i6 >>> 8);
                            return 2;
                        }
                        int i7 = ((m33663i[bArr[i + 1]] & 255) << 12) | ((m33663i[bArr[i]] & 255) << 18) | ((m33663i[b] & 255) << 6) | (m33663i[b2] & 255);
                        bArr2[i2] = (byte) (i7 >> 16);
                        bArr2[i2 + 1] = (byte) (i7 >> 8);
                        bArr2[i5] = (byte) i7;
                        return 3;
                    }
                    throw new IllegalArgumentException(String.format("Destination array with length %d cannot have offset of %d and still store three bytes.", Integer.valueOf(bArr2.length), Integer.valueOf(i2)));
                }
                throw new IllegalArgumentException(String.format("Source array with length %d cannot have offset of %d and still process four bytes.", Integer.valueOf(bArr.length), Integer.valueOf(i)));
            }
            throw new NullPointerException("Destination array was null.");
        }
        throw new NullPointerException("Source array was null.");
    }

    public static void encode(ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
        byte[] bArr = new byte[3];
        byte[] bArr2 = new byte[4];
        while (byteBuffer.hasRemaining()) {
            int min = Math.min(3, byteBuffer.remaining());
            byteBuffer.get(bArr, 0, min);
            m33665g(bArr2, bArr, min, 0);
            byteBuffer2.put(bArr2);
        }
    }

    public static String encodeBytes(byte[] bArr) {
        try {
            return encodeBytes(bArr, 0, bArr.length, 0);
        } catch (IOException unused) {
            return null;
        }
    }

    public static byte[] encodeBytesToBytes(byte[] bArr) {
        try {
            return encodeBytesToBytes(bArr, 0, bArr.length, 0);
        } catch (IOException unused) {
            return null;
        }
    }

    public static void encodeFileToFile(String str, String str2) throws IOException {
        String encodeFromFile = encodeFromFile(str);
        BufferedOutputStream bufferedOutputStream = null;
        try {
            try {
                BufferedOutputStream bufferedOutputStream2 = new BufferedOutputStream(new FileOutputStream(str2));
                try {
                    bufferedOutputStream2.write(encodeFromFile.getBytes("US-ASCII"));
                    try {
                        bufferedOutputStream2.close();
                    } catch (Exception unused) {
                    }
                } catch (IOException e) {
                } catch (Throwable th2) {
                    th = th2;
                    bufferedOutputStream = bufferedOutputStream2;
                    try {
                        bufferedOutputStream.close();
                    } catch (Exception unused2) {
                    }
                    throw th;
                }
            } catch (IOException e2) {
                throw e2;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public static String encodeFromFile(String str) throws IOException {
        InputStream inputStream = null;
        try {
            try {
                File file = new File(str);
                byte[] bArr = new byte[Math.max((int) ((file.length() * 1.4d) + 1.0d), 40)];
                InputStream inputStream2 = new InputStream(new BufferedInputStream(new FileInputStream(file)), 1);
                int i = 0;
                while (true) {
                    try {
                        int read = inputStream2.read(bArr, i, 4096);
                        if (read < 0) {
                            break;
                        }
                        i += read;
                    } catch (IOException e) {
                        throw e;
                    } catch (Throwable th2) {
                        th = th2;
                        inputStream = inputStream2;
                        try {
                            inputStream.close();
                        } catch (Exception unused) {
                        }
                        throw th;
                    }
                }
                String str2 = new String(bArr, 0, i, "US-ASCII");
                try {
                    inputStream2.close();
                } catch (Exception unused2) {
                }
                return str2;
            } catch (IOException e2) {
                throw e2;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public static String encodeObject(Serializable serializable) throws IOException {
        return encodeObject(serializable, 0);
    }

    public static void encodeToFile(byte[] bArr, String str) throws IOException {
        if (bArr != null) {
            OutputStream outputStream = null;
            try {
                try {
                    OutputStream outputStream2 = new OutputStream(new FileOutputStream(str), 1);
                    try {
                        outputStream2.write(bArr);
                        try {
                            outputStream2.close();
                        } catch (Exception unused) {
                        }
                    } catch (IOException e) {
                    } catch (Throwable th2) {
                        th = th2;
                        outputStream = outputStream2;
                        try {
                            outputStream.close();
                        } catch (Exception unused2) {
                        }
                        throw th;
                    }
                } catch (IOException e2) {
                    throw e2;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } else {
            throw new NullPointerException("Data to encode was null.");
        }
    }

    /* renamed from: f */
    public static byte[] m33666f(byte[] bArr, int i, int i2, byte[] bArr2, int i3, int i4) {
        int i5;
        int i6;
        byte[] m33664h = m33664h(i4);
        int i7 = 0;
        if (i2 > 0) {
            i5 = (bArr[i] << Ascii.CAN) >>> 8;
        } else {
            i5 = 0;
        }
        if (i2 > 1) {
            i6 = (bArr[i + 1] << Ascii.CAN) >>> 16;
        } else {
            i6 = 0;
        }
        int i8 = i5 | i6;
        if (i2 > 2) {
            i7 = (bArr[i + 2] << Ascii.CAN) >>> 24;
        }
        int i9 = i8 | i7;
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    return bArr2;
                }
                bArr2[i3] = m33664h[i9 >>> 18];
                bArr2[i3 + 1] = m33664h[(i9 >>> 12) & 63];
                bArr2[i3 + 2] = m33664h[(i9 >>> 6) & 63];
                bArr2[i3 + 3] = m33664h[i9 & 63];
                return bArr2;
            }
            bArr2[i3] = m33664h[i9 >>> 18];
            bArr2[i3 + 1] = m33664h[(i9 >>> 12) & 63];
            bArr2[i3 + 2] = m33664h[(i9 >>> 6) & 63];
            bArr2[i3 + 3] = kotlin.p023io.encoding.Base64.padSymbol;
            return bArr2;
        }
        bArr2[i3] = m33664h[i9 >>> 18];
        bArr2[i3 + 1] = m33664h[(i9 >>> 12) & 63];
        bArr2[i3 + 2] = kotlin.p023io.encoding.Base64.padSymbol;
        bArr2[i3 + 3] = kotlin.p023io.encoding.Base64.padSymbol;
        return bArr2;
    }

    /* renamed from: g */
    public static byte[] m33665g(byte[] bArr, byte[] bArr2, int i, int i2) {
        m33666f(bArr2, 0, i, bArr, 0, i2);
        return bArr;
    }

    /* renamed from: h */
    public static final byte[] m33664h(int i) {
        if ((i & 16) == 16) {
            return f58472c;
        }
        if ((i & 32) == 32) {
            return f58474e;
        }
        return f58470a;
    }

    /* renamed from: i */
    public static final byte[] m33663i(int i) {
        if ((i & 16) == 16) {
            return f58473d;
        }
        if ((i & 32) == 32) {
            return f58475f;
        }
        return f58471b;
    }

    public static byte[] decode(byte[] bArr, int i, int i2, int i3) throws IOException {
        int i4;
        if (bArr != null) {
            if (i < 0 || (i4 = i + i2) > bArr.length) {
                throw new IllegalArgumentException(String.format("Source array with length %d cannot have offset of %d and process %d bytes.", Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i2)));
            }
            if (i2 == 0) {
                return new byte[0];
            }
            if (i2 >= 4) {
                byte[] m33663i = m33663i(i3);
                byte[] bArr2 = new byte[(i2 * 3) / 4];
                byte[] bArr3 = new byte[4];
                int i5 = 0;
                int i6 = 0;
                while (i < i4) {
                    byte b = bArr[i];
                    byte b2 = m33663i[b & 255];
                    if (b2 < -5) {
                        throw new IOException(String.format("Bad Base64 input character decimal %d in array position %d", Integer.valueOf(bArr[i] & 255), Integer.valueOf(i)));
                    }
                    if (b2 >= -1) {
                        int i7 = i5 + 1;
                        bArr3[i5] = b;
                        if (i7 > 3) {
                            i6 += m33667e(bArr3, 0, bArr2, i6, i3);
                            if (bArr[i] == 61) {
                                break;
                            }
                            i5 = 0;
                        } else {
                            i5 = i7;
                        }
                    }
                    i++;
                }
                byte[] bArr4 = new byte[i6];
                System.arraycopy(bArr2, 0, bArr4, 0, i6);
                return bArr4;
            }
            throw new IllegalArgumentException("Base64-encoded string must have at least four characters, but length specified was " + i2);
        }
        throw new NullPointerException("Cannot decode null source array.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v8 */
    public static Object decodeToObject(String str, int i, ClassLoader classLoader) throws IOException, ClassNotFoundException {
        ObjectInputStream objectInputStream;
        ObjectInputStream c9125a;
        byte[] decode = decode(str, i);
        ByteArrayInputStream byteArrayInputStream = null;
        r2 = null;
        r2 = null;
        ObjectInputStream objectInputStream2 = null;
        byteArrayInputStream = null;
        try {
            try {
                ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(decode);
                try {
                    if (classLoader == null) {
                        c9125a = new ObjectInputStream(byteArrayInputStream2);
                    } else {
                        c9125a = new C9125a(byteArrayInputStream2, classLoader);
                    }
                    objectInputStream2 = c9125a;
                    Object readObject = objectInputStream2.readObject();
                    try {
                        byteArrayInputStream2.close();
                    } catch (Exception unused) {
                    }
                    try {
                        objectInputStream2.close();
                    } catch (Exception unused2) {
                    }
                    return readObject;
                } catch (IOException e) {
                    e = e;
                    throw e;
                } catch (ClassNotFoundException e2) {
                    e = e2;
                    throw e;
                } catch (Throwable th2) {
                    th = th2;
                    objectInputStream = objectInputStream2;
                    byteArrayInputStream = byteArrayInputStream2;
                    try {
                        byteArrayInputStream.close();
                    } catch (Exception unused3) {
                    }
                    try {
                        objectInputStream.close();
                    } catch (Exception unused4) {
                    }
                    throw th;
                }
            } catch (IOException e3) {
                e = e3;
            } catch (ClassNotFoundException e4) {
                e = e4;
            } catch (Throwable th3) {
                th = th3;
                objectInputStream = null;
            }
        } catch (Throwable th4) {
            th = th4;
            objectInputStream = classLoader;
        }
    }

    public static String encodeBytes(byte[] bArr, int i) throws IOException {
        return encodeBytes(bArr, 0, bArr.length, i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13, types: [java.io.OutputStream, java.util.zip.GZIPOutputStream] */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    public static byte[] encodeBytesToBytes(byte[] bArr, int i, int i2, int i3) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream;
        OutputStream outputStream;
        ?? r4;
        if (bArr != null) {
            if (i < 0) {
                throw new IllegalArgumentException("Cannot have negative offset: " + i);
            } else if (i2 >= 0) {
                if (i + i2 <= bArr.length) {
                    if ((i3 & 2) != 0) {
                        ByteArrayOutputStream byteArrayOutputStream2 = null;
                        try {
                            byteArrayOutputStream = new ByteArrayOutputStream();
                            try {
                                outputStream = new OutputStream(byteArrayOutputStream, i3 | 1);
                            } catch (IOException e) {
                                e = e;
                                outputStream = null;
                                r4 = 0;
                            } catch (Throwable th2) {
                                th = th2;
                                outputStream = null;
                            }
                            try {
                                r4 = new GZIPOutputStream(outputStream);
                            } catch (IOException e2) {
                                e = e2;
                                r4 = 0;
                            } catch (Throwable th3) {
                                th = th3;
                                try {
                                    byteArrayOutputStream2.close();
                                } catch (Exception unused) {
                                }
                                try {
                                    outputStream.close();
                                } catch (Exception unused2) {
                                }
                                try {
                                    byteArrayOutputStream.close();
                                } catch (Exception unused3) {
                                }
                                throw th;
                            }
                        } catch (IOException e3) {
                            e = e3;
                            outputStream = null;
                            r4 = 0;
                        } catch (Throwable th4) {
                            th = th4;
                            byteArrayOutputStream = null;
                            outputStream = null;
                        }
                        try {
                            r4.write(bArr, i, i2);
                            r4.close();
                            try {
                                r4.close();
                            } catch (Exception unused4) {
                            }
                            try {
                                outputStream.close();
                            } catch (Exception unused5) {
                            }
                            try {
                                byteArrayOutputStream.close();
                            } catch (Exception unused6) {
                            }
                            return byteArrayOutputStream.toByteArray();
                        } catch (IOException e4) {
                            e = e4;
                            byteArrayOutputStream2 = byteArrayOutputStream;
                            r4 = r4;
                            try {
                                throw e;
                            } catch (Throwable th5) {
                                th = th5;
                                byteArrayOutputStream = byteArrayOutputStream2;
                                byteArrayOutputStream2 = r4;
                                byteArrayOutputStream2.close();
                                outputStream.close();
                                byteArrayOutputStream.close();
                                throw th;
                            }
                        } catch (Throwable th6) {
                            th = th6;
                            byteArrayOutputStream2 = r4;
                            byteArrayOutputStream2.close();
                            outputStream.close();
                            byteArrayOutputStream.close();
                            throw th;
                        }
                    }
                    boolean z = (i3 & 8) != 0;
                    int i4 = ((i2 / 3) * 4) + (i2 % 3 > 0 ? 4 : 0);
                    if (z) {
                        i4 += i4 / 76;
                    }
                    int i5 = i4;
                    byte[] bArr2 = new byte[i5];
                    int i6 = i2 - 2;
                    int i7 = 0;
                    int i8 = 0;
                    int i9 = 0;
                    while (i7 < i6) {
                        int i10 = i7;
                        int i11 = i6;
                        byte[] bArr3 = bArr2;
                        m33666f(bArr, i7 + i, 3, bArr2, i8, i3);
                        int i12 = i9 + 4;
                        if (!z || i12 < 76) {
                            i9 = i12;
                        } else {
                            bArr3[i8 + 4] = 10;
                            i8++;
                            i9 = 0;
                        }
                        i7 = i10 + 3;
                        i8 += 4;
                        bArr2 = bArr3;
                        i6 = i11;
                    }
                    int i13 = i7;
                    byte[] bArr4 = bArr2;
                    if (i13 < i2) {
                        m33666f(bArr, i13 + i, i2 - i13, bArr4, i8, i3);
                        i8 += 4;
                    }
                    int i14 = i8;
                    if (i14 <= i5 - 1) {
                        byte[] bArr5 = new byte[i14];
                        System.arraycopy(bArr4, 0, bArr5, 0, i14);
                        return bArr5;
                    }
                    return bArr4;
                }
                throw new IllegalArgumentException(String.format("Cannot have offset of %d and length of %d with array of length %d", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(bArr.length)));
            } else {
                throw new IllegalArgumentException("Cannot have length offset: " + i2);
            }
        }
        throw new NullPointerException("Cannot serialize a null array.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static String encodeObject(Serializable serializable, int i) throws IOException {
        java.io.OutputStream outputStream;
        ByteArrayOutputStream byteArrayOutputStream;
        OutputStream outputStream2;
        java.io.OutputStream outputStream3;
        if (serializable != null) {
            ObjectOutputStream objectOutputStream = null;
            try {
                byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    outputStream2 = new OutputStream(byteArrayOutputStream, i | 1);
                    try {
                        if ((i & 2) != 0) {
                            outputStream = new GZIPOutputStream(outputStream2);
                            try {
                                objectOutputStream = new ObjectOutputStream(outputStream);
                                outputStream = outputStream;
                            } catch (IOException e) {
                                e = e;
                                outputStream3 = objectOutputStream;
                                objectOutputStream = byteArrayOutputStream;
                                outputStream = outputStream;
                                try {
                                    throw e;
                                } catch (Throwable th2) {
                                    th = th2;
                                    java.io.OutputStream outputStream4 = outputStream3;
                                    byteArrayOutputStream = objectOutputStream;
                                    objectOutputStream = outputStream4;
                                    try {
                                        objectOutputStream.close();
                                    } catch (Exception unused) {
                                    }
                                    try {
                                        outputStream.close();
                                    } catch (Exception unused2) {
                                    }
                                    try {
                                        outputStream2.close();
                                    } catch (Exception unused3) {
                                    }
                                    try {
                                        byteArrayOutputStream.close();
                                    } catch (Exception unused4) {
                                    }
                                    throw th;
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                objectOutputStream.close();
                                outputStream.close();
                                outputStream2.close();
                                byteArrayOutputStream.close();
                                throw th;
                            }
                        } else {
                            objectOutputStream = new ObjectOutputStream(outputStream2);
                            outputStream = null;
                        }
                        objectOutputStream.writeObject(serializable);
                        try {
                            objectOutputStream.close();
                        } catch (Exception unused5) {
                        }
                        try {
                            outputStream.close();
                        } catch (Exception unused6) {
                        }
                        try {
                            outputStream2.close();
                        } catch (Exception unused7) {
                        }
                        try {
                            byteArrayOutputStream.close();
                        } catch (Exception unused8) {
                        }
                        try {
                            return new String(byteArrayOutputStream.toByteArray(), "US-ASCII");
                        } catch (UnsupportedEncodingException unused9) {
                            return new String(byteArrayOutputStream.toByteArray());
                        }
                    } catch (IOException e2) {
                        e = e2;
                        java.io.OutputStream outputStream5 = objectOutputStream;
                        objectOutputStream = byteArrayOutputStream;
                        outputStream3 = outputStream5;
                        outputStream = outputStream5;
                    } catch (Throwable th4) {
                        th = th4;
                        outputStream = objectOutputStream;
                    }
                } catch (IOException e3) {
                    e = e3;
                    outputStream = null;
                    outputStream2 = null;
                    objectOutputStream = byteArrayOutputStream;
                    outputStream3 = null;
                } catch (Throwable th5) {
                    th = th5;
                    outputStream = null;
                    outputStream2 = null;
                }
            } catch (IOException e4) {
                e = e4;
                outputStream = null;
                outputStream3 = null;
                outputStream2 = null;
            } catch (Throwable th6) {
                th = th6;
                outputStream = null;
                byteArrayOutputStream = 0;
                outputStream2 = null;
            }
        } else {
            throw new NullPointerException("Cannot serialize a null object.");
        }
    }

    public static String encodeBytes(byte[] bArr, int i, int i2) {
        try {
            return encodeBytes(bArr, i, i2, 0);
        } catch (IOException unused) {
            return null;
        }
    }

    public static String encodeBytes(byte[] bArr, int i, int i2, int i3) throws IOException {
        byte[] encodeBytesToBytes = encodeBytesToBytes(bArr, i, i2, i3);
        try {
            return new String(encodeBytesToBytes, "US-ASCII");
        } catch (UnsupportedEncodingException unused) {
            return new String(encodeBytesToBytes);
        }
    }

    public static void encode(ByteBuffer byteBuffer, CharBuffer charBuffer) {
        byte[] bArr = new byte[3];
        byte[] bArr2 = new byte[4];
        while (byteBuffer.hasRemaining()) {
            int min = Math.min(3, byteBuffer.remaining());
            byteBuffer.get(bArr, 0, min);
            m33665g(bArr2, bArr, min, 0);
            for (int i = 0; i < 4; i++) {
                charBuffer.put((char) (bArr2[i] & 255));
            }
        }
    }

    public static byte[] decode(String str) throws IOException {
        return decode(str, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [int] */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.io.ByteArrayInputStream] */
    /* JADX WARN: Type inference failed for: r3v7 */
    public static byte[] decode(String str, int i) throws IOException {
        byte[] bytes;
        ?? length;
        ByteArrayInputStream byteArrayInputStream;
        GZIPInputStream gZIPInputStream;
        if (str != null) {
            try {
                bytes = str.getBytes("US-ASCII");
            } catch (UnsupportedEncodingException unused) {
                bytes = str.getBytes();
            }
            byte[] decode = decode(bytes, 0, bytes.length, i);
            boolean z = (i & 4) != 0;
            if (decode != null && (length = decode.length) >= 4 && !z && 35615 == ((decode[0] & 255) | ((decode[1] << 8) & MotionEventCompat.ACTION_POINTER_INDEX_MASK))) {
                byte[] bArr = new byte[2048];
                ByteArrayOutputStream byteArrayOutputStream = null;
                try {
                    try {
                        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                        try {
                            byteArrayInputStream = new ByteArrayInputStream(decode);
                            try {
                                gZIPInputStream = new GZIPInputStream(byteArrayInputStream);
                                while (true) {
                                    try {
                                        int read = gZIPInputStream.read(bArr);
                                        if (read < 0) {
                                            break;
                                        }
                                        byteArrayOutputStream2.write(bArr, 0, read);
                                    } catch (IOException e) {
                                        e = e;
                                        byteArrayOutputStream = byteArrayOutputStream2;
                                        byteArrayInputStream = byteArrayInputStream;
                                        try {
                                            e.printStackTrace();
                                            byteArrayOutputStream.close();
                                            length = byteArrayInputStream;
                                            gZIPInputStream.close();
                                            length.close();
                                            return decode;
                                        } catch (Throwable th2) {
                                            th = th2;
                                            try {
                                                byteArrayOutputStream.close();
                                            } catch (Exception unused2) {
                                            }
                                            try {
                                                gZIPInputStream.close();
                                            } catch (Exception unused3) {
                                            }
                                            try {
                                                byteArrayInputStream.close();
                                            } catch (Exception unused4) {
                                            }
                                            throw th;
                                        }
                                    } catch (Throwable th3) {
                                        th = th3;
                                        byteArrayOutputStream = byteArrayOutputStream2;
                                        byteArrayOutputStream.close();
                                        gZIPInputStream.close();
                                        byteArrayInputStream.close();
                                        throw th;
                                    }
                                }
                                decode = byteArrayOutputStream2.toByteArray();
                                byteArrayOutputStream2.close();
                                length = byteArrayInputStream;
                            } catch (IOException e2) {
                                e = e2;
                                gZIPInputStream = null;
                            } catch (Throwable th4) {
                                th = th4;
                                gZIPInputStream = null;
                            }
                        } catch (IOException e3) {
                            e = e3;
                            byteArrayInputStream = null;
                            gZIPInputStream = null;
                        } catch (Throwable th5) {
                            th = th5;
                            byteArrayInputStream = null;
                            gZIPInputStream = null;
                        }
                    } catch (IOException e4) {
                        e = e4;
                        byteArrayInputStream = null;
                        gZIPInputStream = null;
                    } catch (Throwable th6) {
                        th = th6;
                        byteArrayInputStream = null;
                        gZIPInputStream = null;
                    }
                } catch (Exception unused5) {
                }
                try {
                    gZIPInputStream.close();
                } catch (Exception unused6) {
                }
                try {
                    length.close();
                } catch (Exception unused7) {
                }
            }
            return decode;
        }
        throw new NullPointerException("Input string was null.");
    }
}