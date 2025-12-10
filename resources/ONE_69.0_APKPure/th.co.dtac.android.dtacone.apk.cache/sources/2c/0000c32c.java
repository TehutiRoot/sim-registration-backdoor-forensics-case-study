package com.tom_roush.pdfbox.util;

import com.facebook.stetho.dumpapp.Framer;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes5.dex */
public final class Hex {

    /* renamed from: a */
    public static final byte[] f60865a = {48, Framer.STDOUT_FRAME_PREFIX, Framer.STDERR_FRAME_PREFIX, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70};

    /* renamed from: b */
    public static final char[] f60866b = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: a */
    public static int m32076a(byte b) {
        return (b & 240) >> 4;
    }

    /* renamed from: b */
    public static int m32075b(byte b) {
        return b & 15;
    }

    public static byte[] decodeBase64(String str) {
        try {
            Class<?> cls = Class.forName("java.util.Base64");
            Object invoke = cls.getMethod("getDecoder", null).invoke(cls, null);
            return (byte[]) invoke.getClass().getMethod("decode", String.class).invoke(invoke, str.replaceAll("\\s", ""));
        } catch (ClassNotFoundException e) {
            e.getMessage();
            try {
                return (byte[]) Class.forName("javax.xml.bind.DatatypeConverter").getMethod("parseBase64Binary", String.class).invoke(null, str);
            } catch (ClassNotFoundException e2) {
                e2.getMessage();
                return new byte[0];
            } catch (IllegalAccessException e3) {
                e3.getMessage();
                return new byte[0];
            } catch (IllegalArgumentException e4) {
                e4.getMessage();
                return new byte[0];
            } catch (NoSuchMethodException e5) {
                e5.getMessage();
                return new byte[0];
            } catch (SecurityException e6) {
                e6.getMessage();
                return new byte[0];
            } catch (InvocationTargetException e7) {
                e7.getMessage();
                return new byte[0];
            }
        } catch (IllegalAccessException e8) {
            e8.getMessage();
            return (byte[]) Class.forName("javax.xml.bind.DatatypeConverter").getMethod("parseBase64Binary", String.class).invoke(null, str);
        } catch (IllegalArgumentException e9) {
            e9.getMessage();
            return (byte[]) Class.forName("javax.xml.bind.DatatypeConverter").getMethod("parseBase64Binary", String.class).invoke(null, str);
        } catch (NoSuchMethodException e10) {
            e10.getMessage();
            return (byte[]) Class.forName("javax.xml.bind.DatatypeConverter").getMethod("parseBase64Binary", String.class).invoke(null, str);
        } catch (SecurityException e11) {
            e11.getMessage();
            return (byte[]) Class.forName("javax.xml.bind.DatatypeConverter").getMethod("parseBase64Binary", String.class).invoke(null, str);
        } catch (InvocationTargetException e12) {
            e12.getMessage();
            return (byte[]) Class.forName("javax.xml.bind.DatatypeConverter").getMethod("parseBase64Binary", String.class).invoke(null, str);
        }
    }

    public static byte[] decodeHex(String str) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i = 0;
        while (i < str.length() - 1) {
            if (str.charAt(i) != '\n' && str.charAt(i) != '\r') {
                int i2 = i + 2;
                String substring = str.substring(i, i2);
                try {
                    byteArrayOutputStream.write(Integer.parseInt(substring, 16));
                    i = i2;
                } catch (NumberFormatException unused) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Can't parse ");
                    sb.append(substring);
                    sb.append(", aborting decode");
                }
            } else {
                i++;
            }
        }
        return byteArrayOutputStream.toByteArray();
    }

    public static byte[] getBytes(byte b) {
        byte[] bArr = f60865a;
        return new byte[]{bArr[m32076a(b)], bArr[m32075b(b)]};
    }

    public static char[] getChars(short s) {
        char[] cArr = f60866b;
        return new char[]{cArr[(s >> 12) & 15], cArr[(s >> 8) & 15], cArr[(s >> 4) & 15], cArr[s & 15]};
    }

    public static char[] getCharsUTF16BE(String str) {
        char[] cArr = new char[str.length() * 4];
        int i = 0;
        for (int i2 = 0; i2 < str.length(); i2++) {
            char charAt = str.charAt(i2);
            char[] cArr2 = f60866b;
            cArr[i] = cArr2[(charAt >> '\f') & 15];
            cArr[i + 1] = cArr2[(charAt >> '\b') & 15];
            int i3 = i + 3;
            cArr[i + 2] = cArr2[(charAt >> 4) & 15];
            i += 4;
            cArr[i3] = cArr2[charAt & 15];
        }
        return cArr;
    }

    public static String getString(byte b) {
        char[] cArr = f60866b;
        return new String(new char[]{cArr[m32076a(b)], cArr[m32075b(b)]});
    }

    public static void writeHexByte(byte b, OutputStream outputStream) throws IOException {
        byte[] bArr = f60865a;
        outputStream.write(bArr[m32076a(b)]);
        outputStream.write(bArr[m32075b(b)]);
    }

    public static void writeHexBytes(byte[] bArr, OutputStream outputStream) throws IOException {
        for (byte b : bArr) {
            writeHexByte(b, outputStream);
        }
    }

    public static byte[] getBytes(byte[] bArr) {
        byte[] bArr2 = new byte[bArr.length * 2];
        for (int i = 0; i < bArr.length; i++) {
            int i2 = i * 2;
            byte[] bArr3 = f60865a;
            bArr2[i2] = bArr3[m32076a(bArr[i])];
            bArr2[i2 + 1] = bArr3[m32075b(bArr[i])];
        }
        return bArr2;
    }

    public static String getString(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (byte b : bArr) {
            char[] cArr = f60866b;
            sb.append(cArr[m32076a(b)]);
            sb.append(cArr[m32075b(b)]);
        }
        return sb.toString();
    }
}