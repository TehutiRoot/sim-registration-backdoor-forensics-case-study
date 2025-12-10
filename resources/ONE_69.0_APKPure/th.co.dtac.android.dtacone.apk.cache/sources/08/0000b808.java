package com.google.zxing.datamatrix.decoder;

import androidx.recyclerview.widget.ItemTouchHelper;
import ch.qos.logback.core.CoreConstants;
import com.google.common.base.Ascii;
import com.google.zxing.FormatException;
import com.google.zxing.common.BitSource;
import com.google.zxing.common.DecoderResult;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collection;
import kotlin.text.Typography;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.apache.http.message.TokenParser;
import org.bouncycastle.pqc.math.linearalgebra.Matrix;

/* loaded from: classes5.dex */
public abstract class DecodedBitStreamParser {

    /* renamed from: a */
    public static final char[] f57806a = {'*', '*', '*', TokenParser.f74644SP, '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', Matrix.MATRIX_TYPE_RANDOM_LT, 'M', 'N', 'O', 'P', 'Q', Matrix.MATRIX_TYPE_RANDOM_REGULAR, 'S', 'T', Matrix.MATRIX_TYPE_RANDOM_UT, 'V', 'W', 'X', 'Y', Matrix.MATRIX_TYPE_ZERO};

    /* renamed from: b */
    public static final char[] f57807b;

    /* renamed from: c */
    public static final char[] f57808c;

    /* renamed from: d */
    public static final char[] f57809d;

    /* renamed from: e */
    public static final char[] f57810e;

    /* loaded from: classes5.dex */
    public enum Mode {
        PAD_ENCODE,
        ASCII_ENCODE,
        C40_ENCODE,
        TEXT_ENCODE,
        ANSIX12_ENCODE,
        EDIFACT_ENCODE,
        BASE256_ENCODE
    }

    /* renamed from: com.google.zxing.datamatrix.decoder.DecodedBitStreamParser$a */
    /* loaded from: classes5.dex */
    public static /* synthetic */ class C9002a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f57811a;

        static {
            int[] iArr = new int[Mode.values().length];
            f57811a = iArr;
            try {
                iArr[Mode.C40_ENCODE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f57811a[Mode.TEXT_ENCODE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f57811a[Mode.ANSIX12_ENCODE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f57811a[Mode.EDIFACT_ENCODE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f57811a[Mode.BASE256_ENCODE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    static {
        char[] cArr = {'!', '\"', '#', '$', CoreConstants.PERCENT_CHAR, Typography.amp, CoreConstants.SINGLE_QUOTE_CHAR, CoreConstants.LEFT_PARENTHESIS_CHAR, CoreConstants.RIGHT_PARENTHESIS_CHAR, '*', '+', ',', '-', '.', '/', ':', ';', Typography.less, '=', Typography.greater, '?', '@', AbstractJsonLexerKt.BEGIN_LIST, '\\', AbstractJsonLexerKt.END_LIST, '^', '_'};
        f57807b = cArr;
        f57808c = new char[]{'*', '*', '*', TokenParser.f74644SP, '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', AbstractJsonLexerKt.UNICODE_ESC, 'v', 'w', 'x', 'y', 'z'};
        f57809d = cArr;
        f57810e = new char[]{'`', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', Matrix.MATRIX_TYPE_RANDOM_LT, 'M', 'N', 'O', 'P', 'Q', Matrix.MATRIX_TYPE_RANDOM_REGULAR, 'S', 'T', Matrix.MATRIX_TYPE_RANDOM_UT, 'V', 'W', 'X', 'Y', Matrix.MATRIX_TYPE_ZERO, '{', '|', '}', '~', Ascii.MAX};
    }

    /* renamed from: a */
    public static DecoderResult m34123a(byte[] bArr) {
        BitSource bitSource = new BitSource(bArr);
        StringBuilder sb = new StringBuilder(100);
        StringBuilder sb2 = new StringBuilder(0);
        ArrayList arrayList = new ArrayList(1);
        Mode mode = Mode.ASCII_ENCODE;
        do {
            Mode mode2 = Mode.ASCII_ENCODE;
            if (mode == mode2) {
                mode = m34121c(bitSource, sb, sb2);
            } else {
                int i = C9002a.f57811a[mode.ordinal()];
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            if (i != 4) {
                                if (i == 5) {
                                    m34120d(bitSource, sb, arrayList);
                                } else {
                                    throw FormatException.getFormatInstance();
                                }
                            } else {
                                m34118f(bitSource, sb);
                            }
                        } else {
                            m34122b(bitSource, sb);
                        }
                    } else {
                        m34117g(bitSource, sb);
                    }
                } else {
                    m34119e(bitSource, sb);
                }
                mode = mode2;
            }
            if (mode == Mode.PAD_ENCODE) {
                break;
            }
        } while (bitSource.available() > 0);
        if (sb2.length() > 0) {
            sb.append((CharSequence) sb2);
        }
        String sb3 = sb.toString();
        if (arrayList.isEmpty()) {
            arrayList = null;
        }
        return new DecoderResult(bArr, sb3, arrayList, null);
    }

    /* renamed from: b */
    public static void m34122b(BitSource bitSource, StringBuilder sb) {
        int readBits;
        int[] iArr = new int[3];
        while (bitSource.available() != 8 && (readBits = bitSource.readBits(8)) != 254) {
            m34116h(readBits, bitSource.readBits(8), iArr);
            for (int i = 0; i < 3; i++) {
                int i2 = iArr[i];
                if (i2 == 0) {
                    sb.append(TokenParser.f74641CR);
                } else if (i2 == 1) {
                    sb.append('*');
                } else if (i2 == 2) {
                    sb.append(Typography.greater);
                } else if (i2 == 3) {
                    sb.append(TokenParser.f74644SP);
                } else if (i2 < 14) {
                    sb.append((char) (i2 + 44));
                } else if (i2 < 40) {
                    sb.append((char) (i2 + 51));
                } else {
                    throw FormatException.getFormatInstance();
                }
            }
            if (bitSource.available() <= 0) {
                return;
            }
        }
    }

    /* renamed from: c */
    public static Mode m34121c(BitSource bitSource, StringBuilder sb, StringBuilder sb2) {
        boolean z = false;
        do {
            int readBits = bitSource.readBits(8);
            if (readBits != 0) {
                if (readBits <= 128) {
                    if (z) {
                        readBits += 128;
                    }
                    sb.append((char) (readBits - 1));
                    return Mode.ASCII_ENCODE;
                } else if (readBits == 129) {
                    return Mode.PAD_ENCODE;
                } else {
                    if (readBits <= 229) {
                        int i = readBits - 130;
                        if (i < 10) {
                            sb.append('0');
                        }
                        sb.append(i);
                    } else if (readBits == 230) {
                        return Mode.C40_ENCODE;
                    } else {
                        if (readBits == 231) {
                            return Mode.BASE256_ENCODE;
                        }
                        if (readBits == 232) {
                            sb.append((char) 29);
                        } else if (readBits != 233 && readBits != 234) {
                            if (readBits == 235) {
                                z = true;
                            } else if (readBits == 236) {
                                sb.append("[)>\u001e05\u001d");
                                sb2.insert(0, "\u001e\u0004");
                            } else if (readBits == 237) {
                                sb.append("[)>\u001e06\u001d");
                                sb2.insert(0, "\u001e\u0004");
                            } else if (readBits == 238) {
                                return Mode.ANSIX12_ENCODE;
                            } else {
                                if (readBits == 239) {
                                    return Mode.TEXT_ENCODE;
                                }
                                if (readBits == 240) {
                                    return Mode.EDIFACT_ENCODE;
                                }
                                if (readBits != 241 && readBits >= 242 && (readBits != 254 || bitSource.available() != 0)) {
                                    throw FormatException.getFormatInstance();
                                }
                            }
                        }
                    }
                }
            } else {
                throw FormatException.getFormatInstance();
            }
        } while (bitSource.available() > 0);
        return Mode.ASCII_ENCODE;
    }

    /* renamed from: d */
    public static void m34120d(BitSource bitSource, StringBuilder sb, Collection collection) {
        int byteOffset = bitSource.getByteOffset();
        int i = byteOffset + 2;
        int m34115i = m34115i(bitSource.readBits(8), byteOffset + 1);
        if (m34115i == 0) {
            m34115i = bitSource.available() / 8;
        } else if (m34115i >= 250) {
            m34115i = ((m34115i - 249) * ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION) + m34115i(bitSource.readBits(8), i);
            i = byteOffset + 3;
        }
        if (m34115i >= 0) {
            byte[] bArr = new byte[m34115i];
            int i2 = 0;
            while (i2 < m34115i) {
                if (bitSource.available() >= 8) {
                    bArr[i2] = (byte) m34115i(bitSource.readBits(8), i);
                    i2++;
                    i++;
                } else {
                    throw FormatException.getFormatInstance();
                }
            }
            collection.add(bArr);
            try {
                sb.append(new String(bArr, "ISO8859_1"));
                return;
            } catch (UnsupportedEncodingException e) {
                throw new IllegalStateException("Platform does not support required encoding: " + e);
            }
        }
        throw FormatException.getFormatInstance();
    }

    /* renamed from: e */
    public static void m34119e(BitSource bitSource, StringBuilder sb) {
        int readBits;
        int[] iArr = new int[3];
        boolean z = false;
        int i = 0;
        while (bitSource.available() != 8 && (readBits = bitSource.readBits(8)) != 254) {
            m34116h(readBits, bitSource.readBits(8), iArr);
            for (int i2 = 0; i2 < 3; i2++) {
                int i3 = iArr[i2];
                if (i != 0) {
                    if (i != 1) {
                        if (i != 2) {
                            if (i == 3) {
                                if (z) {
                                    sb.append((char) (i3 + 224));
                                    z = false;
                                    i = 0;
                                } else {
                                    sb.append((char) (i3 + 96));
                                    i = 0;
                                }
                            } else {
                                throw FormatException.getFormatInstance();
                            }
                        } else {
                            char[] cArr = f57807b;
                            if (i3 < cArr.length) {
                                char c = cArr[i3];
                                if (z) {
                                    sb.append((char) (c + 128));
                                    z = false;
                                } else {
                                    sb.append(c);
                                }
                            } else if (i3 == 27) {
                                sb.append((char) 29);
                            } else if (i3 == 30) {
                                z = true;
                            } else {
                                throw FormatException.getFormatInstance();
                            }
                            i = 0;
                        }
                    } else if (z) {
                        sb.append((char) (i3 + 128));
                        z = false;
                        i = 0;
                    } else {
                        sb.append((char) i3);
                        i = 0;
                    }
                } else if (i3 < 3) {
                    i = i3 + 1;
                } else {
                    char[] cArr2 = f57806a;
                    if (i3 < cArr2.length) {
                        char c2 = cArr2[i3];
                        if (z) {
                            sb.append((char) (c2 + 128));
                            z = false;
                        } else {
                            sb.append(c2);
                        }
                    } else {
                        throw FormatException.getFormatInstance();
                    }
                }
            }
            if (bitSource.available() <= 0) {
                return;
            }
        }
    }

    /* renamed from: f */
    public static void m34118f(BitSource bitSource, StringBuilder sb) {
        while (bitSource.available() > 16) {
            for (int i = 0; i < 4; i++) {
                int readBits = bitSource.readBits(6);
                if (readBits == 31) {
                    int bitOffset = 8 - bitSource.getBitOffset();
                    if (bitOffset != 8) {
                        bitSource.readBits(bitOffset);
                        return;
                    }
                    return;
                }
                if ((readBits & 32) == 0) {
                    readBits |= 64;
                }
                sb.append((char) readBits);
            }
            if (bitSource.available() <= 0) {
                return;
            }
        }
    }

    /* renamed from: g */
    public static void m34117g(BitSource bitSource, StringBuilder sb) {
        int readBits;
        int[] iArr = new int[3];
        boolean z = false;
        int i = 0;
        while (bitSource.available() != 8 && (readBits = bitSource.readBits(8)) != 254) {
            m34116h(readBits, bitSource.readBits(8), iArr);
            for (int i2 = 0; i2 < 3; i2++) {
                int i3 = iArr[i2];
                if (i != 0) {
                    if (i != 1) {
                        if (i != 2) {
                            if (i == 3) {
                                char[] cArr = f57810e;
                                if (i3 < cArr.length) {
                                    char c = cArr[i3];
                                    if (z) {
                                        sb.append((char) (c + 128));
                                        z = false;
                                        i = 0;
                                    } else {
                                        sb.append(c);
                                        i = 0;
                                    }
                                } else {
                                    throw FormatException.getFormatInstance();
                                }
                            } else {
                                throw FormatException.getFormatInstance();
                            }
                        } else {
                            char[] cArr2 = f57809d;
                            if (i3 < cArr2.length) {
                                char c2 = cArr2[i3];
                                if (z) {
                                    sb.append((char) (c2 + 128));
                                    z = false;
                                } else {
                                    sb.append(c2);
                                }
                            } else if (i3 == 27) {
                                sb.append((char) 29);
                            } else if (i3 == 30) {
                                z = true;
                            } else {
                                throw FormatException.getFormatInstance();
                            }
                            i = 0;
                        }
                    } else if (z) {
                        sb.append((char) (i3 + 128));
                        z = false;
                        i = 0;
                    } else {
                        sb.append((char) i3);
                        i = 0;
                    }
                } else if (i3 < 3) {
                    i = i3 + 1;
                } else {
                    char[] cArr3 = f57808c;
                    if (i3 < cArr3.length) {
                        char c3 = cArr3[i3];
                        if (z) {
                            sb.append((char) (c3 + 128));
                            z = false;
                        } else {
                            sb.append(c3);
                        }
                    } else {
                        throw FormatException.getFormatInstance();
                    }
                }
            }
            if (bitSource.available() <= 0) {
                return;
            }
        }
    }

    /* renamed from: h */
    public static void m34116h(int i, int i2, int[] iArr) {
        int i3 = ((i << 8) + i2) - 1;
        int i4 = i3 / 1600;
        iArr[0] = i4;
        int i5 = i3 - (i4 * 1600);
        int i6 = i5 / 40;
        iArr[1] = i6;
        iArr[2] = i5 - (i6 * 40);
    }

    /* renamed from: i */
    public static int m34115i(int i, int i2) {
        int i3 = i - (((i2 * 149) % 255) + 1);
        if (i3 >= 0) {
            return i3;
        }
        return i3 + 256;
    }
}