package com.fasterxml.jackson.core.p011io;

import com.feitian.readerdk.Tool.C6139DK;
import java.util.Arrays;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* renamed from: com.fasterxml.jackson.core.io.CharTypes */
/* loaded from: classes3.dex */
public final class CharTypes {

    /* renamed from: a */
    public static final char[] f43113a;

    /* renamed from: b */
    public static final byte[] f43114b;

    /* renamed from: c */
    public static final int[] f43115c;

    /* renamed from: d */
    public static final int[] f43116d;

    /* renamed from: e */
    public static final int[] f43117e;

    /* renamed from: f */
    public static final int[] f43118f;

    /* renamed from: g */
    public static final int[] f43119g;

    /* renamed from: h */
    public static final int[] f43120h;

    /* renamed from: i */
    public static final int[] f43121i;

    /* renamed from: j */
    public static final int[] f43122j;

    /* renamed from: com.fasterxml.jackson.core.io.CharTypes$a */
    /* loaded from: classes3.dex */
    public static class C6066a {

        /* renamed from: b */
        public static final C6066a f43123b = new C6066a();

        /* renamed from: a */
        public int[][] f43124a = new int[128];

        /* renamed from: a */
        public int[] m49769a(int i) {
            int[] iArr = this.f43124a[i];
            if (iArr == null) {
                iArr = Arrays.copyOf(CharTypes.f43121i, 128);
                if (iArr[i] == 0) {
                    iArr[i] = -1;
                }
                this.f43124a[i] = iArr;
            }
            return iArr;
        }
    }

    static {
        int i;
        char[] charArray = "0123456789ABCDEF".toCharArray();
        f43113a = charArray;
        int length = charArray.length;
        f43114b = new byte[length];
        for (int i2 = 0; i2 < length; i2++) {
            f43114b[i2] = (byte) f43113a[i2];
        }
        int[] iArr = new int[256];
        for (int i3 = 0; i3 < 32; i3++) {
            iArr[i3] = -1;
        }
        iArr[34] = 1;
        iArr[92] = 1;
        f43115c = iArr;
        int length2 = iArr.length;
        int[] iArr2 = new int[length2];
        System.arraycopy(iArr, 0, iArr2, 0, length2);
        for (int i4 = 128; i4 < 256; i4++) {
            if ((i4 & 224) == 192) {
                i = 2;
            } else if ((i4 & C6139DK.ERROR_RECEIVE_LRC) == 224) {
                i = 3;
            } else if ((i4 & 248) == 240) {
                i = 4;
            } else {
                i = -1;
            }
            iArr2[i4] = i;
        }
        f43116d = iArr2;
        int[] iArr3 = new int[256];
        Arrays.fill(iArr3, -1);
        for (int i5 = 33; i5 < 256; i5++) {
            if (Character.isJavaIdentifierPart((char) i5)) {
                iArr3[i5] = 0;
            }
        }
        iArr3[64] = 0;
        iArr3[35] = 0;
        iArr3[42] = 0;
        iArr3[45] = 0;
        iArr3[43] = 0;
        f43117e = iArr3;
        int[] iArr4 = new int[256];
        System.arraycopy(iArr3, 0, iArr4, 0, 256);
        Arrays.fill(iArr4, 128, 128, 0);
        f43118f = iArr4;
        int[] iArr5 = new int[256];
        int[] iArr6 = f43116d;
        System.arraycopy(iArr6, 128, iArr5, 128, 128);
        Arrays.fill(iArr5, 0, 32, -1);
        iArr5[9] = 0;
        iArr5[10] = 10;
        iArr5[13] = 13;
        iArr5[42] = 42;
        f43119g = iArr5;
        int[] iArr7 = new int[256];
        System.arraycopy(iArr6, 128, iArr7, 128, 128);
        Arrays.fill(iArr7, 0, 32, -1);
        iArr7[32] = 1;
        iArr7[9] = 1;
        iArr7[10] = 10;
        iArr7[13] = 13;
        iArr7[47] = 47;
        iArr7[35] = 35;
        f43120h = iArr7;
        int[] iArr8 = new int[128];
        for (int i6 = 0; i6 < 32; i6++) {
            iArr8[i6] = -1;
        }
        iArr8[34] = 34;
        iArr8[92] = 92;
        iArr8[8] = 98;
        iArr8[9] = 116;
        iArr8[12] = 102;
        iArr8[10] = 110;
        iArr8[13] = 114;
        f43121i = iArr8;
        int[] iArr9 = new int[256];
        f43122j = iArr9;
        Arrays.fill(iArr9, -1);
        for (int i7 = 0; i7 < 10; i7++) {
            f43122j[i7 + 48] = i7;
        }
        for (int i8 = 0; i8 < 6; i8++) {
            int[] iArr10 = f43122j;
            int i9 = i8 + 10;
            iArr10[i8 + 97] = i9;
            iArr10[i8 + 65] = i9;
        }
    }

    public static void appendQuoted(StringBuilder sb, String str) {
        int[] iArr = f43121i;
        int length = iArr.length;
        int length2 = str.length();
        for (int i = 0; i < length2; i++) {
            char charAt = str.charAt(i);
            if (charAt < length && iArr[charAt] != 0) {
                sb.append('\\');
                int i2 = iArr[charAt];
                if (i2 < 0) {
                    sb.append(AbstractJsonLexerKt.UNICODE_ESC);
                    sb.append('0');
                    sb.append('0');
                    char[] cArr = f43113a;
                    sb.append(cArr[charAt >> 4]);
                    sb.append(cArr[charAt & 15]);
                } else {
                    sb.append((char) i2);
                }
            } else {
                sb.append(charAt);
            }
        }
    }

    public static int charToHex(int i) {
        return f43122j[i & 255];
    }

    public static byte[] copyHexBytes() {
        return (byte[]) f43114b.clone();
    }

    public static char[] copyHexChars() {
        return (char[]) f43113a.clone();
    }

    public static int[] get7BitOutputEscapes() {
        return f43121i;
    }

    public static int[] getInputCodeComment() {
        return f43119g;
    }

    public static int[] getInputCodeLatin1() {
        return f43115c;
    }

    public static int[] getInputCodeLatin1JsNames() {
        return f43117e;
    }

    public static int[] getInputCodeUtf8() {
        return f43116d;
    }

    public static int[] getInputCodeUtf8JsNames() {
        return f43118f;
    }

    public static int[] getInputCodeWS() {
        return f43120h;
    }

    public static int[] get7BitOutputEscapes(int i) {
        if (i == 34) {
            return f43121i;
        }
        return C6066a.f43123b.m49769a(i);
    }
}