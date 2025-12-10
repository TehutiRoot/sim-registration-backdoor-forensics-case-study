package com.feitian.readerdk.Tool;

import org.apache.commons.cli.HelpFormatter;

/* renamed from: com.feitian.readerdk.Tool.Tool */
/* loaded from: classes3.dex */
public class C6151Tool {
    /* renamed from: a */
    public static byte m49354a(char c) {
        return (byte) "0123456789ABCDEF".indexOf(c);
    }

    public static String byte2HexStr(byte[] bArr, int i) {
        StringBuilder sb = new StringBuilder("");
        if (bArr != null && bArr.length > 0) {
            if (i > bArr.length) {
                i = bArr.length;
            }
            for (int i2 = 0; i2 < i; i2++) {
                String hexString = Integer.toHexString(bArr[i2] & 255);
                if (hexString.length() < 2) {
                    sb.append(0);
                }
                sb.append(hexString + HelpFormatter.DEFAULT_LONG_OPT_SEPARATOR);
            }
            return sb.toString();
        }
        return null;
    }

    public static String byte2HexStr2(byte[] bArr, int i) {
        StringBuilder sb = new StringBuilder("");
        if (bArr != null && bArr.length > 0) {
            if (i > bArr.length) {
                i = bArr.length;
            }
            for (int i2 = 0; i2 < i; i2++) {
                String hexString = Integer.toHexString(bArr[i2] & 255);
                if (hexString.length() < 2) {
                    sb.append(0);
                }
                sb.append(hexString);
            }
            return sb.toString();
        }
        return null;
    }

    public static int dw2i(byte[] bArr, int i) {
        return ((bArr[i + 1] & 255) << 8) + (bArr[i] & 255);
    }

    public static byte[] hexStringToBytes(String str) {
        if (str != null && !str.equals("")) {
            String upperCase = str.toUpperCase();
            int length = upperCase.length() / 2;
            char[] charArray = upperCase.toCharArray();
            byte[] bArr = new byte[length];
            for (int i = 0; i < length; i++) {
                int i2 = i * 2;
                bArr[i] = (byte) (m49354a(charArray[i2 + 1]) | (m49354a(charArray[i2]) << 4));
            }
            return bArr;
        }
        return null;
    }

    public static void i2dw(int i, byte[] bArr, int i2) {
        bArr[i2] = (byte) (i & 255);
        bArr[i2 + 1] = (byte) ((i >> 8) & 255);
        bArr[i2 + 2] = (byte) ((i >> 16) & 255);
        bArr[i2 + 3] = (byte) ((i >> 24) & 255);
    }
}
