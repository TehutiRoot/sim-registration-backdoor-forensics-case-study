package org.apache.commons.codec.language;

import androidx.exifinterface.media.ExifInterface;
import ch.qos.logback.core.net.SyslogConstants;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.tom_roush.fontbox.afm.AFMParser;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.StandardStructureTypes;
import com.tom_roush.pdfbox.pdmodel.interactive.annotation.PDAnnotationLink;
import com.tom_roush.pdfbox.pdmodel.interactive.annotation.PDBorderStyleDictionary;
import java.util.Locale;
import org.apache.commons.cli.HelpFormatter;
import org.apache.commons.codec.EncoderException;
import org.apache.commons.codec.StringEncoder;
import org.apache.commons.codec.binary.StringUtils;
import org.apache.http.message.TokenParser;
import org.bouncycastle.asn1.eac.EACTags;
import org.bouncycastle.pqc.math.linearalgebra.Matrix;
import th.p047co.dtac.android.dtacone.view.fragment.customerenquiry.CustomerEnquiry700MhzFragment;

/* loaded from: classes6.dex */
public class DoubleMetaphone implements StringEncoder {

    /* renamed from: b */
    public static final String[] f73140b = {"GN", "KN", "PN", "WR", "PS"};

    /* renamed from: c */
    public static final String[] f73141c = {"L", "R", "N", "M", "B", "H", "F", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "W", HelpFormatter.DEFAULT_LONG_OPT_SEPARATOR};

    /* renamed from: d */
    public static final String[] f73142d = {"ES", "EP", "EB", "EL", "EY", "IB", "IL", "IN", "IE", OperatorName.END_INLINE_IMAGE, "ER"};

    /* renamed from: e */
    public static final String[] f73143e = {"L", "T", "K", "S", "N", "M", "B", "Z"};

    /* renamed from: a */
    public int f73144a = 4;

    public static boolean contains(String str, int i, int i2, String... strArr) {
        int i3;
        if (i < 0 || (i3 = i2 + i) > str.length()) {
            return false;
        }
        String substring = str.substring(i, i3);
        for (String str2 : strArr) {
            if (substring.equals(str2)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: A */
    public final boolean m25553A(char c) {
        if ("AEIOUY".indexOf(c) != -1) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final String m25552a(String str) {
        if (str == null) {
            return null;
        }
        String trim = str.trim();
        if (trim.isEmpty()) {
            return null;
        }
        return trim.toUpperCase(Locale.ENGLISH);
    }

    /* renamed from: b */
    public final boolean m25551b(String str, int i) {
        if (contains(str, i, 4, "CHIA")) {
            return true;
        }
        if (i <= 1) {
            return false;
        }
        int i2 = i - 2;
        if (m25553A(charAt(str, i2)) || !contains(str, i - 1, 3, "ACH")) {
            return false;
        }
        char charAt = charAt(str, i + 2);
        if ((charAt != 'I' && charAt != 'E') || contains(str, i2, 6, "BACHER", "MACHER")) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public final boolean m25550c(String str, int i) {
        if (i != 0) {
            return false;
        }
        int i2 = i + 1;
        if (!contains(str, i2, 5, "HARAC", "HARIS") && !contains(str, i2, 3, "HOR", "HYM", "HIA", "HEM")) {
            return false;
        }
        return !contains(str, 0, 5, "CHORE");
    }

    public char charAt(String str, int i) {
        if (i >= 0 && i < str.length()) {
            return str.charAt(i);
        }
        return (char) 0;
    }

    /* renamed from: d */
    public final boolean m25549d(String str, int i) {
        if (!contains(str, 0, 4, "VAN ", "VON ") && !contains(str, 0, 3, "SCH") && !contains(str, i - 2, 6, "ORCHES", "ARCHIT", "ORCHID")) {
            int i2 = i + 2;
            if (!contains(str, i2, 1, "T", "S")) {
                if (!contains(str, i - 1, 1, "A", PDAnnotationLink.HIGHLIGHT_MODE_OUTLINE, PDBorderStyleDictionary.STYLE_UNDERLINE, ExifInterface.LONGITUDE_EAST) && i != 0) {
                    return false;
                }
                if (!contains(str, i2, 1, f73141c) && i + 1 != str.length() - 1) {
                    return false;
                }
            }
        }
        return true;
    }

    public String doubleMetaphone(String str) {
        return doubleMetaphone(str, false);
    }

    /* renamed from: e */
    public final boolean m25548e(String str, int i) {
        if (i == str.length() - 3 && contains(str, i - 1, 4, "ILLO", "ILLA", "ALLE")) {
            return true;
        }
        if ((contains(str, str.length() - 2, 2, "AS", "OS") || contains(str, str.length() - 1, 1, "A", PDAnnotationLink.HIGHLIGHT_MODE_OUTLINE)) && contains(str, i - 1, 4, "ALLE")) {
            return true;
        }
        return false;
    }

    @Override // org.apache.commons.codec.Encoder
    public Object encode(Object obj) throws EncoderException {
        if (obj instanceof String) {
            return doubleMetaphone((String) obj);
        }
        throw new EncoderException("DoubleMetaphone encode parameter is not of type String");
    }

    /* renamed from: f */
    public final boolean m25547f(String str, int i) {
        int i2 = i + 1;
        if (charAt(str, i2) == 'M') {
            return true;
        }
        if (contains(str, i - 1, 3, "UMB") && (i2 == str.length() - 1 || contains(str, i + 2, 2, "ER"))) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public final int m25546g(DoubleMetaphoneResult doubleMetaphoneResult, int i) {
        if (i == 0) {
            doubleMetaphoneResult.append('A');
        }
        return i + 1;
    }

    public int getMaxCodeLen() {
        return this.f73144a;
    }

    /* renamed from: h */
    public final int m25545h(String str, DoubleMetaphoneResult doubleMetaphoneResult, int i) {
        if (m25551b(str, i)) {
            doubleMetaphoneResult.append('K');
        } else if (i == 0 && contains(str, i, 6, "CAESAR")) {
            doubleMetaphoneResult.append('S');
        } else if (contains(str, i, 2, AFMParser.CHARMETRICS_CH)) {
            return m25543j(str, doubleMetaphoneResult, i);
        } else {
            if (contains(str, i, 2, "CZ") && !contains(str, i - 2, 4, "WICZ")) {
                doubleMetaphoneResult.append('S', 'X');
            } else {
                int i2 = i + 1;
                if (contains(str, i2, 3, "CIA")) {
                    doubleMetaphoneResult.append('X');
                } else if (contains(str, i, 2, AFMParser.f59166CC) && (i != 1 || charAt(str, 0) != 'M')) {
                    return m25544i(str, doubleMetaphoneResult, i);
                } else {
                    if (contains(str, i, 2, "CK", "CG", "CQ")) {
                        doubleMetaphoneResult.append('K');
                    } else if (contains(str, i, 2, "CI", "CE", "CY")) {
                        if (contains(str, i, 3, "CIO", "CIE", "CIA")) {
                            doubleMetaphoneResult.append('S', 'X');
                        } else {
                            doubleMetaphoneResult.append('S');
                        }
                    } else {
                        doubleMetaphoneResult.append('K');
                        if (!contains(str, i2, 2, " C", " Q", " G")) {
                            if (!contains(str, i2, 1, "C", "K", OperatorName.RESTORE) || contains(str, i2, 2, "CE", "CI")) {
                                return i2;
                            }
                        }
                    }
                }
                return i + 3;
            }
        }
        return i + 2;
    }

    /* renamed from: i */
    public final int m25544i(String str, DoubleMetaphoneResult doubleMetaphoneResult, int i) {
        int i2 = i + 2;
        if (contains(str, i2, 1, "I", ExifInterface.LONGITUDE_EAST, "H") && !contains(str, i2, 2, "HU")) {
            if ((i == 1 && charAt(str, i - 1) == 'A') || contains(str, i - 1, 5, "UCCEE", "UCCES")) {
                doubleMetaphoneResult.append("KS");
            } else {
                doubleMetaphoneResult.append('X');
            }
            return i + 3;
        }
        doubleMetaphoneResult.append('K');
        return i2;
    }

    public boolean isDoubleMetaphoneEqual(String str, String str2) {
        return isDoubleMetaphoneEqual(str, str2, false);
    }

    /* renamed from: j */
    public final int m25543j(String str, DoubleMetaphoneResult doubleMetaphoneResult, int i) {
        if (i > 0 && contains(str, i, 4, "CHAE")) {
            doubleMetaphoneResult.append('K', 'X');
        } else if (m25550c(str, i)) {
            doubleMetaphoneResult.append('K');
        } else if (m25549d(str, i)) {
            doubleMetaphoneResult.append('K');
        } else {
            if (i > 0) {
                if (contains(str, 0, 2, "MC")) {
                    doubleMetaphoneResult.append('K');
                } else {
                    doubleMetaphoneResult.append('X', 'K');
                }
            } else {
                doubleMetaphoneResult.append('X');
            }
            return i + 2;
        }
        return i + 2;
    }

    /* renamed from: k */
    public final int m25542k(String str, DoubleMetaphoneResult doubleMetaphoneResult, int i) {
        if (contains(str, i, 2, "DG")) {
            int i2 = i + 2;
            if (contains(str, i2, 1, "I", ExifInterface.LONGITUDE_EAST, "Y")) {
                doubleMetaphoneResult.append('J');
                return i + 3;
            }
            doubleMetaphoneResult.append("TK");
            return i2;
        } else if (contains(str, i, 2, "DT", "DD")) {
            doubleMetaphoneResult.append('T');
            return i + 2;
        } else {
            doubleMetaphoneResult.append('T');
            return i + 1;
        }
    }

    /* renamed from: l */
    public final int m25541l(String str, DoubleMetaphoneResult doubleMetaphoneResult, int i, boolean z) {
        int i2 = i + 1;
        if (charAt(str, i2) == 'H') {
            return m25540m(str, doubleMetaphoneResult, i);
        }
        if (charAt(str, i2) == 'N') {
            if (i == 1 && m25553A(charAt(str, 0)) && !z) {
                doubleMetaphoneResult.append("KN", "N");
            } else if (!contains(str, i + 2, 2, "EY") && charAt(str, i2) != 'Y' && !z) {
                doubleMetaphoneResult.append("N", "KN");
            } else {
                doubleMetaphoneResult.append("KN");
            }
        } else if (contains(str, i2, 2, StandardStructureTypes.f60289LI) && !z) {
            doubleMetaphoneResult.append("KL", "L");
        } else if (i == 0 && (charAt(str, i2) == 'Y' || contains(str, i2, 2, f73142d))) {
            doubleMetaphoneResult.append('K', 'J');
        } else {
            if ((contains(str, i2, 2, "ER") || charAt(str, i2) == 'Y') && !contains(str, 0, 6, "DANGER", "RANGER", "MANGER")) {
                int i3 = i - 1;
                if (!contains(str, i3, 1, ExifInterface.LONGITUDE_EAST, "I") && !contains(str, i3, 3, "RGY", "OGY")) {
                    doubleMetaphoneResult.append('K', 'J');
                }
            }
            if (!contains(str, i2, 1, ExifInterface.LONGITUDE_EAST, "I", "Y") && !contains(str, i - 1, 4, "AGGI", "OGGI")) {
                if (charAt(str, i2) == 'G') {
                    i2 = i + 2;
                }
                doubleMetaphoneResult.append('K');
                return i2;
            } else if (!contains(str, 0, 4, "VAN ", "VON ") && !contains(str, 0, 3, "SCH") && !contains(str, i2, 2, OperatorName.END_TEXT)) {
                if (contains(str, i2, 3, "IER")) {
                    doubleMetaphoneResult.append('J');
                } else {
                    doubleMetaphoneResult.append('J', 'K');
                }
            } else {
                doubleMetaphoneResult.append('K');
            }
        }
        return i + 2;
    }

    /* renamed from: m */
    public final int m25540m(String str, DoubleMetaphoneResult doubleMetaphoneResult, int i) {
        if (i > 0 && !m25553A(charAt(str, i - 1))) {
            doubleMetaphoneResult.append('K');
        } else if (i == 0) {
            int i2 = i + 2;
            if (charAt(str, i2) == 'I') {
                doubleMetaphoneResult.append('J');
                return i2;
            }
            doubleMetaphoneResult.append('K');
            return i2;
        } else if ((i <= 1 || !contains(str, i - 2, 1, "B", "H", "D")) && ((i <= 2 || !contains(str, i - 3, 1, "B", "H", "D")) && (i <= 3 || !contains(str, i - 4, 1, "B", "H")))) {
            if (i > 2 && charAt(str, i - 1) == 'U' && contains(str, i - 3, 1, "C", OperatorName.STROKING_COLOR_GRAY, "L", "R", "T")) {
                doubleMetaphoneResult.append('F');
            } else if (i > 0 && charAt(str, i - 1) != 'I') {
                doubleMetaphoneResult.append('K');
            }
        }
        return i + 2;
    }

    /* renamed from: n */
    public final int m25539n(String str, DoubleMetaphoneResult doubleMetaphoneResult, int i) {
        if ((i == 0 || m25553A(charAt(str, i - 1))) && m25553A(charAt(str, i + 1))) {
            doubleMetaphoneResult.append('H');
            return i + 2;
        }
        return i + 1;
    }

    /* renamed from: o */
    public final int m25538o(String str, DoubleMetaphoneResult doubleMetaphoneResult, int i, boolean z) {
        if (!contains(str, i, 4, "JOSE") && !contains(str, 0, 4, "SAN ")) {
            if (i == 0 && !contains(str, i, 4, "JOSE")) {
                doubleMetaphoneResult.append('J', 'A');
            } else {
                int i2 = i - 1;
                if (m25553A(charAt(str, i2)) && !z) {
                    int i3 = i + 1;
                    if (charAt(str, i3) == 'A' || charAt(str, i3) == 'O') {
                        doubleMetaphoneResult.append('J', 'H');
                    }
                }
                if (i == str.length() - 1) {
                    doubleMetaphoneResult.append('J', TokenParser.f74560SP);
                } else if (!contains(str, i + 1, 1, f73143e) && !contains(str, i2, 1, "S", "K", "L")) {
                    doubleMetaphoneResult.append('J');
                }
            }
            int i4 = i + 1;
            if (charAt(str, i4) == 'J') {
                return i + 2;
            }
            return i4;
        }
        if ((i != 0 || charAt(str, i + 4) != ' ') && str.length() != 4 && !contains(str, 0, 4, "SAN ")) {
            doubleMetaphoneResult.append('J', 'H');
        } else {
            doubleMetaphoneResult.append('H');
        }
        return i + 1;
    }

    /* renamed from: p */
    public final int m25537p(String str, DoubleMetaphoneResult doubleMetaphoneResult, int i) {
        int i2 = i + 1;
        if (charAt(str, i2) == 'L') {
            if (m25548e(str, i)) {
                doubleMetaphoneResult.appendPrimary(Matrix.MATRIX_TYPE_RANDOM_LT);
            } else {
                doubleMetaphoneResult.append(Matrix.MATRIX_TYPE_RANDOM_LT);
            }
            return i + 2;
        }
        doubleMetaphoneResult.append(Matrix.MATRIX_TYPE_RANDOM_LT);
        return i2;
    }

    /* renamed from: q */
    public final int m25536q(String str, DoubleMetaphoneResult doubleMetaphoneResult, int i) {
        int i2 = i + 1;
        if (charAt(str, i2) == 'H') {
            doubleMetaphoneResult.append('F');
            return i + 2;
        }
        doubleMetaphoneResult.append('P');
        if (contains(str, i2, 1, "P", "B")) {
            i2 = i + 2;
        }
        return i2;
    }

    /* renamed from: r */
    public final int m25535r(String str, DoubleMetaphoneResult doubleMetaphoneResult, int i, boolean z) {
        if (i == str.length() - 1 && !z && contains(str, i - 2, 2, "IE") && !contains(str, i - 4, 2, "ME", "MA")) {
            doubleMetaphoneResult.appendAlternate(Matrix.MATRIX_TYPE_RANDOM_REGULAR);
        } else {
            doubleMetaphoneResult.append(Matrix.MATRIX_TYPE_RANDOM_REGULAR);
        }
        int i2 = i + 1;
        if (charAt(str, i2) == 'R') {
            return i + 2;
        }
        return i2;
    }

    /* renamed from: s */
    public final int m25534s(String str, DoubleMetaphoneResult doubleMetaphoneResult, int i, boolean z) {
        if (!contains(str, i - 1, 3, "ISL", "YSL")) {
            if (i == 0 && contains(str, i, 5, "SUGAR")) {
                doubleMetaphoneResult.append('X', 'S');
            } else {
                if (contains(str, i, 2, "SH")) {
                    if (contains(str, i + 1, 4, "HEIM", "HOEK", "HOLM", "HOLZ")) {
                        doubleMetaphoneResult.append('S');
                    } else {
                        doubleMetaphoneResult.append('X');
                    }
                } else if (!contains(str, i, 3, "SIO", "SIA") && !contains(str, i, 4, "SIAN")) {
                    if (i != 0 || !contains(str, i + 1, 1, "M", "N", "L", "W")) {
                        int i2 = i + 1;
                        if (!contains(str, i2, 1, "Z")) {
                            if (contains(str, i, 2, OperatorName.STROKING_COLOR)) {
                                return m25533t(str, doubleMetaphoneResult, i);
                            }
                            if (i == str.length() - 1 && contains(str, i - 2, 2, "AI", "OI")) {
                                doubleMetaphoneResult.appendAlternate('S');
                            } else {
                                doubleMetaphoneResult.append('S');
                            }
                            if (!contains(str, i2, 1, "S", "Z")) {
                                return i2;
                            }
                        }
                    }
                    doubleMetaphoneResult.append('S', 'X');
                    int i3 = i + 1;
                    if (!contains(str, i3, 1, "Z")) {
                        return i3;
                    }
                } else {
                    if (z) {
                        doubleMetaphoneResult.append('S');
                    } else {
                        doubleMetaphoneResult.append('S', 'X');
                    }
                    return i + 3;
                }
                return i + 2;
            }
        }
        return i + 1;
    }

    public void setMaxCodeLen(int i) {
        this.f73144a = i;
    }

    /* renamed from: t */
    public final int m25533t(String str, DoubleMetaphoneResult doubleMetaphoneResult, int i) {
        int i2 = i + 2;
        if (charAt(str, i2) == 'H') {
            int i3 = i + 3;
            if (contains(str, i3, 2, "OO", "ER", "EN", "UY", "ED", "EM")) {
                if (contains(str, i3, 2, "ER", "EN")) {
                    doubleMetaphoneResult.append("X", "SK");
                } else {
                    doubleMetaphoneResult.append("SK");
                }
            } else if (i == 0 && !m25553A(charAt(str, 3)) && charAt(str, 3) != 'W') {
                doubleMetaphoneResult.append('X', 'S');
            } else {
                doubleMetaphoneResult.append('X');
            }
        } else if (contains(str, i2, 1, "I", ExifInterface.LONGITUDE_EAST, "Y")) {
            doubleMetaphoneResult.append('S');
        } else {
            doubleMetaphoneResult.append("SK");
        }
        return i + 3;
    }

    /* renamed from: u */
    public final int m25532u(String str, DoubleMetaphoneResult doubleMetaphoneResult, int i) {
        if (!contains(str, i, 4, "TION") && !contains(str, i, 3, "TIA", "TCH")) {
            if (!contains(str, i, 2, StandardStructureTypes.f60295TH) && !contains(str, i, 3, "TTH")) {
                doubleMetaphoneResult.append('T');
                int i2 = i + 1;
                if (contains(str, i2, 1, "T", "D")) {
                    return i + 2;
                }
                return i2;
            }
            int i3 = i + 2;
            if (!contains(str, i3, 2, "OM", "AM") && !contains(str, 0, 4, "VAN ", "VON ") && !contains(str, 0, 3, "SCH")) {
                doubleMetaphoneResult.append('0', 'T');
            } else {
                doubleMetaphoneResult.append('T');
            }
            return i3;
        }
        doubleMetaphoneResult.append('X');
        return i + 3;
    }

    /* renamed from: v */
    public final int m25531v(String str, DoubleMetaphoneResult doubleMetaphoneResult, int i) {
        int i2 = 2;
        if (contains(str, i, 2, "WR")) {
            doubleMetaphoneResult.append(Matrix.MATRIX_TYPE_RANDOM_REGULAR);
        } else {
            if (i == 0) {
                int i3 = i + 1;
                if (m25553A(charAt(str, i3)) || contains(str, i, 2, "WH")) {
                    if (m25553A(charAt(str, i3))) {
                        doubleMetaphoneResult.append('A', 'F');
                    } else {
                        doubleMetaphoneResult.append('A');
                    }
                    return i3;
                }
            }
            if ((i != str.length() - 1 || !m25553A(charAt(str, i - 1))) && !contains(str, i - 1, 5, "EWSKI", "EWSKY", "OWSKI", "OWSKY") && !contains(str, 0, 3, "SCH")) {
                i2 = 4;
                if (contains(str, i, 4, "WICZ", "WITZ")) {
                    doubleMetaphoneResult.append("TS", "FX");
                }
            } else {
                doubleMetaphoneResult.appendAlternate('F');
            }
            return i + 1;
        }
        return i + i2;
    }

    /* renamed from: w */
    public final int m25530w(String str, DoubleMetaphoneResult doubleMetaphoneResult, int i) {
        if (i == 0) {
            doubleMetaphoneResult.append('S');
            return i + 1;
        }
        if (i != str.length() - 1 || (!contains(str, i - 3, 3, "IAU", "EAU") && !contains(str, i - 2, 2, "AU", "OU"))) {
            doubleMetaphoneResult.append("KS");
        }
        int i2 = i + 1;
        if (contains(str, i2, 1, "C", "X")) {
            return i + 2;
        }
        return i2;
    }

    /* renamed from: x */
    public final int m25529x(String str, DoubleMetaphoneResult doubleMetaphoneResult, int i, boolean z) {
        int i2 = i + 1;
        if (charAt(str, i2) == 'H') {
            doubleMetaphoneResult.append('J');
            return i + 2;
        }
        if (!contains(str, i2, 2, "ZO", "ZI", "ZA") && (!z || i <= 0 || charAt(str, i - 1) == 'T')) {
            doubleMetaphoneResult.append('S');
        } else {
            doubleMetaphoneResult.append("S", "TS");
        }
        if (charAt(str, i2) == 'Z') {
            i2 = i + 2;
        }
        return i2;
    }

    /* renamed from: y */
    public final boolean m25528y(String str) {
        for (String str2 : f73140b) {
            if (str.startsWith(str2)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: z */
    public final boolean m25527z(String str) {
        if (str.indexOf(87) <= -1 && str.indexOf(75) <= -1 && !str.contains("CZ") && !str.contains("WITZ")) {
            return false;
        }
        return true;
    }

    /* loaded from: classes6.dex */
    public class DoubleMetaphoneResult {

        /* renamed from: a */
        public final StringBuilder f73145a;

        /* renamed from: b */
        public final StringBuilder f73146b;

        /* renamed from: c */
        public final int f73147c;

        public DoubleMetaphoneResult(int i) {
            this.f73145a = new StringBuilder(DoubleMetaphone.this.getMaxCodeLen());
            this.f73146b = new StringBuilder(DoubleMetaphone.this.getMaxCodeLen());
            this.f73147c = i;
        }

        public void append(char c) {
            appendPrimary(c);
            appendAlternate(c);
        }

        public void appendAlternate(char c) {
            if (this.f73146b.length() < this.f73147c) {
                this.f73146b.append(c);
            }
        }

        public void appendPrimary(char c) {
            if (this.f73145a.length() < this.f73147c) {
                this.f73145a.append(c);
            }
        }

        public String getAlternate() {
            return this.f73146b.toString();
        }

        public String getPrimary() {
            return this.f73145a.toString();
        }

        public boolean isComplete() {
            if (this.f73145a.length() >= this.f73147c && this.f73146b.length() >= this.f73147c) {
                return true;
            }
            return false;
        }

        public void append(char c, char c2) {
            appendPrimary(c);
            appendAlternate(c2);
        }

        public void appendAlternate(String str) {
            int length = this.f73147c - this.f73146b.length();
            if (str.length() <= length) {
                this.f73146b.append(str);
            } else {
                this.f73146b.append((CharSequence) str, 0, length);
            }
        }

        public void appendPrimary(String str) {
            int length = this.f73147c - this.f73145a.length();
            if (str.length() <= length) {
                this.f73145a.append(str);
            } else {
                this.f73145a.append((CharSequence) str, 0, length);
            }
        }

        public void append(String str) {
            appendPrimary(str);
            appendAlternate(str);
        }

        public void append(String str, String str2) {
            appendPrimary(str);
            appendAlternate(str2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v10, types: [int] */
    /* JADX WARN: Type inference failed for: r1v11, types: [int] */
    /* JADX WARN: Type inference failed for: r1v12, types: [int] */
    /* JADX WARN: Type inference failed for: r1v13, types: [int] */
    /* JADX WARN: Type inference failed for: r1v14, types: [int] */
    /* JADX WARN: Type inference failed for: r1v15, types: [int] */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17, types: [int] */
    /* JADX WARN: Type inference failed for: r1v18, types: [int] */
    /* JADX WARN: Type inference failed for: r1v19, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2, types: [int] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [int] */
    /* JADX WARN: Type inference failed for: r1v5, types: [int] */
    /* JADX WARN: Type inference failed for: r1v6, types: [int] */
    /* JADX WARN: Type inference failed for: r1v7, types: [int] */
    /* JADX WARN: Type inference failed for: r1v8, types: [int] */
    /* JADX WARN: Type inference failed for: r1v9, types: [int] */
    /* JADX WARN: Type inference failed for: r7v0, types: [org.apache.commons.codec.language.DoubleMetaphone] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.String] */
    public String doubleMetaphone(String str, boolean z) {
        int i;
        ?? m25552a = m25552a(str);
        if (m25552a == 0) {
            return null;
        }
        boolean m25527z = m25527z(m25552a);
        ?? m25528y = m25528y(m25552a);
        DoubleMetaphoneResult doubleMetaphoneResult = new DoubleMetaphoneResult(getMaxCodeLen());
        while (!doubleMetaphoneResult.isComplete() && m25528y <= m25552a.length() - 1) {
            char charAt = m25552a.charAt(m25528y);
            if (charAt == 199) {
                doubleMetaphoneResult.append('S');
            } else if (charAt != 209) {
                switch (charAt) {
                    case EACTags.ELEMENT_LIST /* 65 */:
                    case EACTags.DISPLAY_IMAGE /* 69 */:
                    case 'I':
                    case 'O':
                    case CustomerEnquiry700MhzFragment.hiddenSubProdHeight /* 85 */:
                    case 'Y':
                        m25528y = m25546g(doubleMetaphoneResult, m25528y);
                        break;
                    case EACTags.ADDRESS /* 66 */:
                        doubleMetaphoneResult.append('P');
                        i = m25528y + 1;
                        if (charAt(m25552a, i) != 'B') {
                            m25528y = i;
                            break;
                        } else {
                            m25528y += 2;
                            break;
                        }
                    case EACTags.CARDHOLDER_HANDWRITTEN_SIGNATURE /* 67 */:
                        m25528y = m25545h(m25552a, doubleMetaphoneResult, m25528y);
                        break;
                    case EACTags.APPLICATION_IMAGE /* 68 */:
                        m25528y = m25542k(m25552a, doubleMetaphoneResult, m25528y);
                        break;
                    case 'F':
                        doubleMetaphoneResult.append('F');
                        i = m25528y + 1;
                        if (charAt(m25552a, i) != 'F') {
                            m25528y = i;
                            break;
                        } else {
                            m25528y += 2;
                            break;
                        }
                    case EACTags.MESSAGE_REFERENCE /* 71 */:
                        m25528y = m25541l(m25552a, doubleMetaphoneResult, m25528y, m25527z);
                        break;
                    case 'H':
                        m25528y = m25539n(m25552a, doubleMetaphoneResult, m25528y);
                        break;
                    case 'J':
                        m25528y = m25538o(m25552a, doubleMetaphoneResult, m25528y, m25527z);
                        break;
                    case 'K':
                        doubleMetaphoneResult.append('K');
                        i = m25528y + 1;
                        if (charAt(m25552a, i) != 'K') {
                            m25528y = i;
                            break;
                        } else {
                            m25528y += 2;
                            break;
                        }
                    case 'L':
                        m25528y = m25537p(m25552a, doubleMetaphoneResult, m25528y);
                        break;
                    case EACTags.INTEGRATED_CIRCUIT_MANUFACTURER_ID /* 77 */:
                        doubleMetaphoneResult.append('M');
                        if (!m25547f(m25552a, m25528y)) {
                            break;
                        } else {
                            m25528y += 2;
                            break;
                        }
                    case 'N':
                        doubleMetaphoneResult.append('N');
                        i = m25528y + 1;
                        if (charAt(m25552a, i) != 'N') {
                            m25528y = i;
                            break;
                        } else {
                            m25528y += 2;
                            break;
                        }
                    case 'P':
                        m25528y = m25536q(m25552a, doubleMetaphoneResult, m25528y);
                        break;
                    case EACTags.ANSWER_TO_RESET /* 81 */:
                        doubleMetaphoneResult.append('K');
                        i = m25528y + 1;
                        if (charAt(m25552a, i) != 'Q') {
                            m25528y = i;
                            break;
                        } else {
                            m25528y += 2;
                            break;
                        }
                    case EACTags.HISTORICAL_BYTES /* 82 */:
                        m25528y = m25535r(m25552a, doubleMetaphoneResult, m25528y, m25527z);
                        break;
                    case ModuleDescriptor.MODULE_VERSION /* 83 */:
                        m25528y = m25534s(m25552a, doubleMetaphoneResult, m25528y, m25527z);
                        break;
                    case 'T':
                        m25528y = m25532u(m25552a, doubleMetaphoneResult, m25528y);
                        break;
                    case 'V':
                        doubleMetaphoneResult.append('F');
                        i = m25528y + 1;
                        if (charAt(m25552a, i) != 'V') {
                            m25528y = i;
                            break;
                        } else {
                            m25528y += 2;
                            break;
                        }
                    case 'W':
                        m25528y = m25531v(m25552a, doubleMetaphoneResult, m25528y);
                        break;
                    case SyslogConstants.LOG_FTP /* 88 */:
                        m25528y = m25530w(m25552a, doubleMetaphoneResult, m25528y);
                        break;
                    case 'Z':
                        m25528y = m25529x(m25552a, doubleMetaphoneResult, m25528y, m25527z);
                        break;
                }
            } else {
                doubleMetaphoneResult.append('N');
            }
            m25528y++;
        }
        return z ? doubleMetaphoneResult.getAlternate() : doubleMetaphoneResult.getPrimary();
    }

    public boolean isDoubleMetaphoneEqual(String str, String str2, boolean z) {
        return StringUtils.equals(doubleMetaphone(str, z), doubleMetaphone(str2, z));
    }

    @Override // org.apache.commons.codec.StringEncoder
    public String encode(String str) {
        return doubleMetaphone(str);
    }
}
