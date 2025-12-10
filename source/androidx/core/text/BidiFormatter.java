package androidx.core.text;

import android.text.SpannableStringBuilder;
import java.util.Locale;
import kotlin.text.Typography;

/* loaded from: classes2.dex */
public final class BidiFormatter {

    /* renamed from: d */
    public static final TextDirectionHeuristicCompat f34029d;

    /* renamed from: e */
    public static final String f34030e;

    /* renamed from: f */
    public static final String f34031f;

    /* renamed from: g */
    public static final BidiFormatter f34032g;

    /* renamed from: h */
    public static final BidiFormatter f34033h;

    /* renamed from: a */
    public final boolean f34034a;

    /* renamed from: b */
    public final int f34035b;

    /* renamed from: c */
    public final TextDirectionHeuristicCompat f34036c;

    /* renamed from: androidx.core.text.BidiFormatter$a */
    /* loaded from: classes2.dex */
    public static class C4077a {

        /* renamed from: f */
        public static final byte[] f34040f = new byte[1792];

        /* renamed from: a */
        public final CharSequence f34041a;

        /* renamed from: b */
        public final boolean f34042b;

        /* renamed from: c */
        public final int f34043c;

        /* renamed from: d */
        public int f34044d;

        /* renamed from: e */
        public char f34045e;

        static {
            for (int i = 0; i < 1792; i++) {
                f34040f[i] = Character.getDirectionality(i);
            }
        }

        public C4077a(CharSequence charSequence, boolean z) {
            this.f34041a = charSequence;
            this.f34042b = z;
            this.f34043c = charSequence.length();
        }

        /* renamed from: c */
        public static byte m57096c(char c) {
            if (c < 1792) {
                return f34040f[c];
            }
            return Character.getDirectionality(c);
        }

        /* renamed from: a */
        public byte m57098a() {
            char charAt = this.f34041a.charAt(this.f34044d - 1);
            this.f34045e = charAt;
            if (Character.isLowSurrogate(charAt)) {
                int codePointBefore = Character.codePointBefore(this.f34041a, this.f34044d);
                this.f34044d -= Character.charCount(codePointBefore);
                return Character.getDirectionality(codePointBefore);
            }
            this.f34044d--;
            byte m57096c = m57096c(this.f34045e);
            if (this.f34042b) {
                char c = this.f34045e;
                if (c == '>') {
                    return m57091h();
                }
                if (c == ';') {
                    return m57093f();
                }
                return m57096c;
            }
            return m57096c;
        }

        /* renamed from: b */
        public byte m57097b() {
            char charAt = this.f34041a.charAt(this.f34044d);
            this.f34045e = charAt;
            if (Character.isHighSurrogate(charAt)) {
                int codePointAt = Character.codePointAt(this.f34041a, this.f34044d);
                this.f34044d += Character.charCount(codePointAt);
                return Character.getDirectionality(codePointAt);
            }
            this.f34044d++;
            byte m57096c = m57096c(this.f34045e);
            if (this.f34042b) {
                char c = this.f34045e;
                if (c == '<') {
                    return m57090i();
                }
                if (c == '&') {
                    return m57092g();
                }
                return m57096c;
            }
            return m57096c;
        }

        /* renamed from: d */
        public int m57095d() {
            this.f34044d = 0;
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            while (this.f34044d < this.f34043c && i == 0) {
                byte m57097b = m57097b();
                if (m57097b != 0) {
                    if (m57097b != 1 && m57097b != 2) {
                        if (m57097b != 9) {
                            switch (m57097b) {
                                case 14:
                                case 15:
                                    i3++;
                                    i2 = -1;
                                    break;
                                case 16:
                                case 17:
                                    i3++;
                                    i2 = 1;
                                    break;
                                case 18:
                                    i3--;
                                    i2 = 0;
                                    break;
                            }
                        }
                    } else if (i3 == 0) {
                        return 1;
                    }
                } else if (i3 == 0) {
                    return -1;
                }
                i = i3;
            }
            if (i == 0) {
                return 0;
            }
            if (i2 != 0) {
                return i2;
            }
            while (this.f34044d > 0) {
                switch (m57098a()) {
                    case 14:
                    case 15:
                        if (i == i3) {
                            return -1;
                        }
                        break;
                    case 16:
                    case 17:
                        if (i == i3) {
                            return 1;
                        }
                        break;
                    case 18:
                        i3++;
                        continue;
                }
                i3--;
            }
            return 0;
        }

        /* renamed from: e */
        public int m57094e() {
            this.f34044d = this.f34043c;
            int i = 0;
            int i2 = 0;
            while (this.f34044d > 0) {
                byte m57098a = m57098a();
                if (m57098a != 0) {
                    if (m57098a != 1 && m57098a != 2) {
                        if (m57098a != 9) {
                            switch (m57098a) {
                                case 14:
                                case 15:
                                    if (i2 == i) {
                                        return -1;
                                    }
                                    i--;
                                    break;
                                case 16:
                                case 17:
                                    if (i2 == i) {
                                        return 1;
                                    }
                                    i--;
                                    break;
                                case 18:
                                    i++;
                                    break;
                                default:
                                    if (i2 != 0) {
                                        break;
                                    } else {
                                        i2 = i;
                                        break;
                                    }
                            }
                        } else {
                            continue;
                        }
                    } else if (i == 0) {
                        return 1;
                    } else {
                        if (i2 == 0) {
                            i2 = i;
                        }
                    }
                } else if (i == 0) {
                    return -1;
                } else {
                    if (i2 == 0) {
                        i2 = i;
                    }
                }
            }
            return 0;
        }

        /* renamed from: f */
        public final byte m57093f() {
            char charAt;
            int i = this.f34044d;
            do {
                int i2 = this.f34044d;
                if (i2 <= 0) {
                    break;
                }
                CharSequence charSequence = this.f34041a;
                int i3 = i2 - 1;
                this.f34044d = i3;
                charAt = charSequence.charAt(i3);
                this.f34045e = charAt;
                if (charAt == '&') {
                    return (byte) 12;
                }
            } while (charAt != ';');
            this.f34044d = i;
            this.f34045e = ';';
            return (byte) 13;
        }

        /* renamed from: g */
        public final byte m57092g() {
            char charAt;
            do {
                int i = this.f34044d;
                if (i < this.f34043c) {
                    CharSequence charSequence = this.f34041a;
                    this.f34044d = i + 1;
                    charAt = charSequence.charAt(i);
                    this.f34045e = charAt;
                } else {
                    return (byte) 12;
                }
            } while (charAt != ';');
            return (byte) 12;
        }

        /* renamed from: h */
        public final byte m57091h() {
            char charAt;
            int i = this.f34044d;
            while (true) {
                int i2 = this.f34044d;
                if (i2 <= 0) {
                    break;
                }
                CharSequence charSequence = this.f34041a;
                int i3 = i2 - 1;
                this.f34044d = i3;
                char charAt2 = charSequence.charAt(i3);
                this.f34045e = charAt2;
                if (charAt2 == '<') {
                    return (byte) 12;
                }
                if (charAt2 == '>') {
                    break;
                } else if (charAt2 == '\"' || charAt2 == '\'') {
                    do {
                        int i4 = this.f34044d;
                        if (i4 > 0) {
                            CharSequence charSequence2 = this.f34041a;
                            int i5 = i4 - 1;
                            this.f34044d = i5;
                            charAt = charSequence2.charAt(i5);
                            this.f34045e = charAt;
                        }
                    } while (charAt != charAt2);
                }
            }
            this.f34044d = i;
            this.f34045e = Typography.greater;
            return (byte) 13;
        }

        /* renamed from: i */
        public final byte m57090i() {
            char charAt;
            int i = this.f34044d;
            while (true) {
                int i2 = this.f34044d;
                if (i2 < this.f34043c) {
                    CharSequence charSequence = this.f34041a;
                    this.f34044d = i2 + 1;
                    char charAt2 = charSequence.charAt(i2);
                    this.f34045e = charAt2;
                    if (charAt2 == '>') {
                        return (byte) 12;
                    }
                    if (charAt2 == '\"' || charAt2 == '\'') {
                        do {
                            int i3 = this.f34044d;
                            if (i3 < this.f34043c) {
                                CharSequence charSequence2 = this.f34041a;
                                this.f34044d = i3 + 1;
                                charAt = charSequence2.charAt(i3);
                                this.f34045e = charAt;
                            }
                        } while (charAt != charAt2);
                    }
                } else {
                    this.f34044d = i;
                    this.f34045e = Typography.less;
                    return (byte) 13;
                }
            }
        }
    }

    static {
        TextDirectionHeuristicCompat textDirectionHeuristicCompat = TextDirectionHeuristicsCompat.FIRSTSTRONG_LTR;
        f34029d = textDirectionHeuristicCompat;
        f34030e = Character.toString((char) 8206);
        f34031f = Character.toString((char) 8207);
        f34032g = new BidiFormatter(false, 2, textDirectionHeuristicCompat);
        f34033h = new BidiFormatter(true, 2, textDirectionHeuristicCompat);
    }

    public BidiFormatter(boolean z, int i, TextDirectionHeuristicCompat textDirectionHeuristicCompat) {
        this.f34034a = z;
        this.f34035b = i;
        this.f34036c = textDirectionHeuristicCompat;
    }

    /* renamed from: a */
    public static int m57105a(CharSequence charSequence) {
        return new C4077a(charSequence, false).m57095d();
    }

    /* renamed from: b */
    public static int m57104b(CharSequence charSequence) {
        return new C4077a(charSequence, false).m57094e();
    }

    /* renamed from: c */
    public static boolean m57103c(Locale locale) {
        if (TextUtilsCompat.getLayoutDirectionFromLocale(locale) == 1) {
            return true;
        }
        return false;
    }

    public static BidiFormatter getInstance() {
        return new Builder().build();
    }

    /* renamed from: d */
    public final String m57102d(CharSequence charSequence, TextDirectionHeuristicCompat textDirectionHeuristicCompat) {
        boolean isRtl = textDirectionHeuristicCompat.isRtl(charSequence, 0, charSequence.length());
        if (!this.f34034a && (isRtl || m57104b(charSequence) == 1)) {
            return f34030e;
        }
        if (this.f34034a) {
            if (!isRtl || m57104b(charSequence) == -1) {
                return f34031f;
            }
            return "";
        }
        return "";
    }

    /* renamed from: e */
    public final String m57101e(CharSequence charSequence, TextDirectionHeuristicCompat textDirectionHeuristicCompat) {
        boolean isRtl = textDirectionHeuristicCompat.isRtl(charSequence, 0, charSequence.length());
        if (!this.f34034a && (isRtl || m57105a(charSequence) == 1)) {
            return f34030e;
        }
        if (this.f34034a) {
            if (!isRtl || m57105a(charSequence) == -1) {
                return f34031f;
            }
            return "";
        }
        return "";
    }

    public boolean getStereoReset() {
        if ((this.f34035b & 2) != 0) {
            return true;
        }
        return false;
    }

    public boolean isRtl(String str) {
        return isRtl((CharSequence) str);
    }

    public boolean isRtlContext() {
        return this.f34034a;
    }

    public String unicodeWrap(String str, TextDirectionHeuristicCompat textDirectionHeuristicCompat, boolean z) {
        if (str == null) {
            return null;
        }
        return unicodeWrap((CharSequence) str, textDirectionHeuristicCompat, z).toString();
    }

    /* loaded from: classes2.dex */
    public static final class Builder {

        /* renamed from: a */
        public boolean f34037a;

        /* renamed from: b */
        public int f34038b;

        /* renamed from: c */
        public TextDirectionHeuristicCompat f34039c;

        public Builder() {
            m57099b(BidiFormatter.m57103c(Locale.getDefault()));
        }

        /* renamed from: a */
        public static BidiFormatter m57100a(boolean z) {
            if (z) {
                return BidiFormatter.f34033h;
            }
            return BidiFormatter.f34032g;
        }

        /* renamed from: b */
        public final void m57099b(boolean z) {
            this.f34037a = z;
            this.f34039c = BidiFormatter.f34029d;
            this.f34038b = 2;
        }

        public BidiFormatter build() {
            if (this.f34038b == 2 && this.f34039c == BidiFormatter.f34029d) {
                return m57100a(this.f34037a);
            }
            return new BidiFormatter(this.f34037a, this.f34038b, this.f34039c);
        }

        public Builder setTextDirectionHeuristic(TextDirectionHeuristicCompat textDirectionHeuristicCompat) {
            this.f34039c = textDirectionHeuristicCompat;
            return this;
        }

        public Builder stereoReset(boolean z) {
            if (z) {
                this.f34038b |= 2;
            } else {
                this.f34038b &= -3;
            }
            return this;
        }

        public Builder(boolean z) {
            m57099b(z);
        }

        public Builder(Locale locale) {
            m57099b(BidiFormatter.m57103c(locale));
        }
    }

    public static BidiFormatter getInstance(boolean z) {
        return new Builder(z).build();
    }

    public boolean isRtl(CharSequence charSequence) {
        return this.f34036c.isRtl(charSequence, 0, charSequence.length());
    }

    public CharSequence unicodeWrap(CharSequence charSequence, TextDirectionHeuristicCompat textDirectionHeuristicCompat, boolean z) {
        if (charSequence == null) {
            return null;
        }
        boolean isRtl = textDirectionHeuristicCompat.isRtl(charSequence, 0, charSequence.length());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (getStereoReset() && z) {
            spannableStringBuilder.append((CharSequence) m57101e(charSequence, isRtl ? TextDirectionHeuristicsCompat.RTL : TextDirectionHeuristicsCompat.LTR));
        }
        if (isRtl != this.f34034a) {
            spannableStringBuilder.append(isRtl ? (char) 8235 : (char) 8234);
            spannableStringBuilder.append(charSequence);
            spannableStringBuilder.append((char) 8236);
        } else {
            spannableStringBuilder.append(charSequence);
        }
        if (z) {
            spannableStringBuilder.append((CharSequence) m57102d(charSequence, isRtl ? TextDirectionHeuristicsCompat.RTL : TextDirectionHeuristicsCompat.LTR));
        }
        return spannableStringBuilder;
    }

    public static BidiFormatter getInstance(Locale locale) {
        return new Builder(locale).build();
    }

    public String unicodeWrap(String str, TextDirectionHeuristicCompat textDirectionHeuristicCompat) {
        return unicodeWrap(str, textDirectionHeuristicCompat, true);
    }

    public CharSequence unicodeWrap(CharSequence charSequence, TextDirectionHeuristicCompat textDirectionHeuristicCompat) {
        return unicodeWrap(charSequence, textDirectionHeuristicCompat, true);
    }

    public String unicodeWrap(String str, boolean z) {
        return unicodeWrap(str, this.f34036c, z);
    }

    public CharSequence unicodeWrap(CharSequence charSequence, boolean z) {
        return unicodeWrap(charSequence, this.f34036c, z);
    }

    public String unicodeWrap(String str) {
        return unicodeWrap(str, this.f34036c, true);
    }

    public CharSequence unicodeWrap(CharSequence charSequence) {
        return unicodeWrap(charSequence, this.f34036c, true);
    }
}
