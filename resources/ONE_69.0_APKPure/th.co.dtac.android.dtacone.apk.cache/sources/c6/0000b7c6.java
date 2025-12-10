package com.google.zxing.aztec.decoder;

import androidx.exifinterface.media.ExifInterface;
import ch.qos.logback.classic.net.SyslogAppender;
import ch.qos.logback.classic.spi.CallerData;
import com.google.firebase.sessions.settings.RemoteSettings;
import com.google.zxing.FormatException;
import com.google.zxing.aztec.AztecDetectorResult;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.common.DecoderResult;
import com.google.zxing.common.reedsolomon.GenericGF;
import com.google.zxing.common.reedsolomon.ReedSolomonDecoder;
import com.google.zxing.common.reedsolomon.ReedSolomonException;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import com.tom_roush.pdfbox.pdmodel.interactive.annotation.PDAnnotationLink;
import com.tom_roush.pdfbox.pdmodel.interactive.annotation.PDBorderStyleDictionary;
import java.util.Arrays;
import org.apache.commons.cli.HelpFormatter;
import org.slf4j.Marker;
import th.p047co.dtac.android.dtacone.view.appOne.nadOutbound.fragment.OneNadOutboundSearchFragment;

/* loaded from: classes5.dex */
public final class Decoder {

    /* renamed from: b */
    public static final String[] f57617b = {"CTRL_PS", HelpFormatter.DEFAULT_LONG_OPT_SEPARATOR, "A", "B", "C", "D", ExifInterface.LONGITUDE_EAST, "F", OperatorName.STROKING_COLOR_GRAY, "H", "I", OperatorName.SET_LINE_CAPSTYLE, "K", "L", "M", "N", PDAnnotationLink.HIGHLIGHT_MODE_OUTLINE, "P", OperatorName.RESTORE, "R", "S", "T", PDBorderStyleDictionary.STYLE_UNDERLINE, ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "W", "X", "Y", "Z", "CTRL_LL", "CTRL_ML", "CTRL_DL", "CTRL_BS"};

    /* renamed from: c */
    public static final String[] f57618c = {"CTRL_PS", HelpFormatter.DEFAULT_LONG_OPT_SEPARATOR, PDPageLabelRange.STYLE_LETTERS_LOWER, OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, OperatorName.CURVE_TO, "d", "e", OperatorName.FILL_NON_ZERO, OperatorName.NON_STROKING_GRAY, OperatorName.CLOSE_PATH, "i", OperatorName.SET_LINE_JOINSTYLE, OperatorName.NON_STROKING_CMYK, OperatorName.LINE_TO, OperatorName.MOVE_TO, OperatorName.ENDPATH, "o", "p", OperatorName.SAVE, PDPageLabelRange.STYLE_ROMAN_LOWER, OperatorName.CLOSE_AND_STROKE, "t", "u", OperatorName.CURVE_TO_REPLICATE_INITIAL_POINT, OperatorName.SET_LINE_WIDTH, "x", OperatorName.CURVE_TO_REPLICATE_FINAL_POINT, "z", "CTRL_US", "CTRL_ML", "CTRL_DL", "CTRL_BS"};

    /* renamed from: d */
    public static final String[] f57619d = {"CTRL_PS", HelpFormatter.DEFAULT_LONG_OPT_SEPARATOR, "\u0001", "\u0002", "\u0003", "\u0004", "\u0005", "\u0006", "\u0007", "\b", SyslogAppender.DEFAULT_STACKTRACE_PATTERN, "\n", "\u000b", "\f", "\r", "\u001b", "\u001c", "\u001d", "\u001e", "\u001f", "@", "\\", "^", "_", "`", "|", "~", "\u007f", "CTRL_LL", "CTRL_UL", "CTRL_PL", "CTRL_BS"};

    /* renamed from: e */
    public static final String[] f57620e = {"", "\r", "\r\n", ". ", ", ", ": ", "!", OperatorName.SHOW_TEXT_LINE_AND_SPACE, "#", "$", "%", "&", OperatorName.SHOW_TEXT_LINE, "(", ")", Marker.ANY_MARKER, Marker.ANY_NON_NULL_MARKER, ",", HelpFormatter.DEFAULT_OPT_PREFIX, ".", RemoteSettings.FORWARD_SLASH_STRING, ":", ";", "<", "=", ">", CallerData.f39637NA, "[", "]", "{", "}", "CTRL_UL"};

    /* renamed from: f */
    public static final String[] f57621f = {"CTRL_PS", HelpFormatter.DEFAULT_LONG_OPT_SEPARATOR, "0", "1", "2", "3", OneNadOutboundSearchFragment.BILL_REMAINING_3_PLUS, "5", "6", "7", "8", "9", ",", ".", "CTRL_UL", "CTRL_US"};

    /* renamed from: a */
    public AztecDetectorResult f57622a;

    /* loaded from: classes5.dex */
    public enum Table {
        UPPER,
        LOWER,
        MIXED,
        DIGIT,
        PUNCT,
        BINARY
    }

    /* renamed from: com.google.zxing.aztec.decoder.Decoder$a */
    /* loaded from: classes5.dex */
    public static /* synthetic */ class C8999a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f57623a;

        static {
            int[] iArr = new int[Table.values().length];
            f57623a = iArr;
            try {
                iArr[Table.UPPER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f57623a[Table.LOWER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f57623a[Table.MIXED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f57623a[Table.PUNCT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f57623a[Table.DIGIT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* renamed from: a */
    public static byte[] m34241a(boolean[] zArr) {
        int length = (zArr.length + 7) / 8;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            bArr[i] = m34235g(zArr, i << 3);
        }
        return bArr;
    }

    /* renamed from: d */
    public static String m34238d(Table table, int i) {
        int i2 = C8999a.f57623a[table.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        if (i2 == 5) {
                            return f57621f[i];
                        }
                        throw new IllegalStateException("Bad table");
                    }
                    return f57620e[i];
                }
                return f57619d[i];
            }
            return f57618c[i];
        }
        return f57617b[i];
    }

    /* renamed from: e */
    public static String m34237e(boolean[] zArr) {
        int i;
        int length = zArr.length;
        Table table = Table.UPPER;
        StringBuilder sb = new StringBuilder(20);
        Table table2 = table;
        int i2 = 0;
        while (i2 < length) {
            if (table == Table.BINARY) {
                if (length - i2 < 5) {
                    break;
                }
                int m34234h = m34234h(zArr, i2, 5);
                int i3 = i2 + 5;
                if (m34234h == 0) {
                    if (length - i3 < 11) {
                        break;
                    }
                    m34234h = m34234h(zArr, i3, 11) + 31;
                    i3 = i2 + 16;
                }
                int i4 = 0;
                while (true) {
                    if (i4 < m34234h) {
                        if (length - i3 < 8) {
                            i2 = length;
                            break;
                        }
                        sb.append((char) m34234h(zArr, i3, 8));
                        i3 += 8;
                        i4++;
                    } else {
                        i2 = i3;
                        break;
                    }
                }
                table = table2;
            } else {
                if (table == Table.DIGIT) {
                    i = 4;
                } else {
                    i = 5;
                }
                if (length - i2 < i) {
                    break;
                }
                int m34234h2 = m34234h(zArr, i2, i);
                i2 += i;
                String m34238d = m34238d(table, m34234h2);
                if (m34238d.startsWith("CTRL_")) {
                    table2 = m34236f(m34238d.charAt(5));
                    if (m34238d.charAt(6) != 'L') {
                        table2 = table;
                        table = table2;
                    }
                } else {
                    sb.append(m34238d);
                }
                table = table2;
            }
        }
        return sb.toString();
    }

    /* renamed from: f */
    public static Table m34236f(char c) {
        if (c != 'B') {
            if (c != 'D') {
                if (c != 'P') {
                    if (c != 'L') {
                        if (c != 'M') {
                            return Table.UPPER;
                        }
                        return Table.MIXED;
                    }
                    return Table.LOWER;
                }
                return Table.PUNCT;
            }
            return Table.DIGIT;
        }
        return Table.BINARY;
    }

    /* renamed from: g */
    public static byte m34235g(boolean[] zArr, int i) {
        int m34234h;
        int length = zArr.length - i;
        if (length >= 8) {
            m34234h = m34234h(zArr, i, 8);
        } else {
            m34234h = m34234h(zArr, i, length) << (8 - length);
        }
        return (byte) m34234h;
    }

    /* renamed from: h */
    public static int m34234h(boolean[] zArr, int i, int i2) {
        int i3 = 0;
        for (int i4 = i; i4 < i + i2; i4++) {
            i3 <<= 1;
            if (zArr[i4]) {
                i3 |= 1;
            }
        }
        return i3;
    }

    public static String highLevelDecode(boolean[] zArr) {
        return m34237e(zArr);
    }

    /* renamed from: i */
    public static int m34233i(int i, boolean z) {
        return ((z ? 88 : 112) + (i << 4)) * i;
    }

    /* renamed from: b */
    public final boolean[] m34240b(boolean[] zArr) {
        int i;
        GenericGF genericGF;
        boolean z;
        boolean z2;
        if (this.f57622a.getNbLayers() <= 2) {
            genericGF = GenericGF.AZTEC_DATA_6;
            i = 6;
        } else {
            i = 8;
            if (this.f57622a.getNbLayers() <= 8) {
                genericGF = GenericGF.AZTEC_DATA_8;
            } else if (this.f57622a.getNbLayers() <= 22) {
                genericGF = GenericGF.AZTEC_DATA_10;
                i = 10;
            } else {
                genericGF = GenericGF.AZTEC_DATA_12;
                i = 12;
            }
        }
        int nbDatablocks = this.f57622a.getNbDatablocks();
        int length = zArr.length / i;
        if (length >= nbDatablocks) {
            int length2 = zArr.length % i;
            int[] iArr = new int[length];
            int i2 = 0;
            while (i2 < length) {
                iArr[i2] = m34234h(zArr, length2, i);
                i2++;
                length2 += i;
            }
            try {
                new ReedSolomonDecoder(genericGF).decode(iArr, length - nbDatablocks);
                int i3 = 1 << i;
                int i4 = i3 - 1;
                int i5 = 0;
                for (int i6 = 0; i6 < nbDatablocks; i6++) {
                    int i7 = iArr[i6];
                    if (i7 != 0 && i7 != i4) {
                        if (i7 == 1 || i7 == i3 - 2) {
                            i5++;
                        }
                    } else {
                        throw FormatException.getFormatInstance();
                    }
                }
                boolean[] zArr2 = new boolean[(nbDatablocks * i) - i5];
                int i8 = 0;
                for (int i9 = 0; i9 < nbDatablocks; i9++) {
                    int i10 = iArr[i9];
                    if (i10 != 1 && i10 != i3 - 2) {
                        int i11 = i - 1;
                        while (i11 >= 0) {
                            int i12 = i8 + 1;
                            if (((1 << i11) & i10) != 0) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            zArr2[i8] = z2;
                            i11--;
                            i8 = i12;
                        }
                    } else {
                        int i13 = (i8 + i) - 1;
                        if (i10 > 1) {
                            z = true;
                        } else {
                            z = false;
                        }
                        Arrays.fill(zArr2, i8, i13, z);
                        i8 += i - 1;
                    }
                }
                return zArr2;
            } catch (ReedSolomonException e) {
                throw FormatException.getFormatInstance(e);
            }
        }
        throw FormatException.getFormatInstance();
    }

    /* renamed from: c */
    public final boolean[] m34239c(BitMatrix bitMatrix) {
        int i;
        int i2;
        boolean isCompact = this.f57622a.isCompact();
        int nbLayers = this.f57622a.getNbLayers();
        if (isCompact) {
            i = 11;
        } else {
            i = 14;
        }
        int i3 = i + (nbLayers << 2);
        int[] iArr = new int[i3];
        boolean[] zArr = new boolean[m34233i(nbLayers, isCompact)];
        int i4 = 2;
        if (isCompact) {
            for (int i5 = 0; i5 < i3; i5++) {
                iArr[i5] = i5;
            }
        } else {
            int i6 = i3 / 2;
            int i7 = ((i3 + 1) + (((i6 - 1) / 15) * 2)) / 2;
            for (int i8 = 0; i8 < i6; i8++) {
                int i9 = (i8 / 15) + i8;
                iArr[(i6 - i8) - 1] = (i7 - i9) - 1;
                iArr[i6 + i8] = i9 + i7 + 1;
            }
        }
        int i10 = 0;
        int i11 = 0;
        while (i10 < nbLayers) {
            int i12 = (nbLayers - i10) << i4;
            if (isCompact) {
                i2 = 9;
            } else {
                i2 = 12;
            }
            int i13 = i12 + i2;
            int i14 = i10 << 1;
            int i15 = (i3 - 1) - i14;
            int i16 = 0;
            while (i16 < i13) {
                int i17 = i16 << 1;
                int i18 = 0;
                while (i18 < i4) {
                    int i19 = i14 + i18;
                    int i20 = i14 + i16;
                    zArr[i11 + i17 + i18] = bitMatrix.get(iArr[i19], iArr[i20]);
                    int i21 = iArr[i20];
                    int i22 = i15 - i18;
                    boolean z = isCompact;
                    zArr[(i13 * 2) + i11 + i17 + i18] = bitMatrix.get(i21, iArr[i22]);
                    int i23 = iArr[i22];
                    int i24 = i15 - i16;
                    zArr[(i13 * 4) + i11 + i17 + i18] = bitMatrix.get(i23, iArr[i24]);
                    zArr[(i13 * 6) + i11 + i17 + i18] = bitMatrix.get(iArr[i24], iArr[i19]);
                    i18++;
                    nbLayers = nbLayers;
                    isCompact = z;
                    i4 = 2;
                }
                i16++;
                i4 = 2;
            }
            i11 += i13 << 3;
            i10++;
            i4 = 2;
        }
        return zArr;
    }

    public DecoderResult decode(AztecDetectorResult aztecDetectorResult) throws FormatException {
        this.f57622a = aztecDetectorResult;
        boolean[] m34240b = m34240b(m34239c(aztecDetectorResult.getBits()));
        DecoderResult decoderResult = new DecoderResult(m34241a(m34240b), m34237e(m34240b), null, null);
        decoderResult.setNumBits(m34240b.length);
        return decoderResult;
    }
}