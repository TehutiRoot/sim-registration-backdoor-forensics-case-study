package com.tom_roush.fontbox.cff;

import android.util.Log;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.exifinterface.media.ExifInterface;
import com.tom_roush.fontbox.afm.AFMParser;
import com.tom_roush.fontbox.cff.CFFOperator;
import com.tom_roush.fontbox.ttf.CFFTable;
import com.tom_roush.fontbox.util.Charsets;
import com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.StandardStructureTypes;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import org.apache.commons.cli.HelpFormatter;
import org.apache.http.cookie.ClientCookie;

/* loaded from: classes5.dex */
public class CFFParser {

    /* renamed from: a */
    public String[] f59263a = null;

    /* renamed from: b */
    public ByteSource f59264b;

    /* renamed from: c */
    public String f59265c;

    /* loaded from: classes5.dex */
    public interface ByteSource {
        byte[] getBytes() throws IOException;
    }

    /* renamed from: com.tom_roush.fontbox.cff.CFFParser$b */
    /* loaded from: classes5.dex */
    public static abstract class AbstractC9849b extends CFFEncoding {

        /* renamed from: a */
        public int f59266a;

        /* renamed from: b */
        public C9850a[] f59267b;

        /* renamed from: com.tom_roush.fontbox.cff.CFFParser$b$a */
        /* loaded from: classes5.dex */
        public static class C9850a {

            /* renamed from: a */
            public int f59268a;

            /* renamed from: b */
            public int f59269b;

            /* renamed from: c */
            public String f59270c;

            public String toString() {
                return getClass().getName() + "[code=" + this.f59268a + ", sid=" + this.f59269b + "]";
            }
        }
    }

    /* renamed from: com.tom_roush.fontbox.cff.CFFParser$c */
    /* loaded from: classes5.dex */
    public static class C9851c {

        /* renamed from: a */
        public final Map f59271a;

        /* renamed from: com.tom_roush.fontbox.cff.CFFParser$c$a */
        /* loaded from: classes5.dex */
        public static class C9852a {

            /* renamed from: a */
            public List f59272a;

            /* renamed from: b */
            public CFFOperator f59273b;

            public C9852a() {
                this.f59272a = new ArrayList();
                this.f59273b = null;
            }

            /* renamed from: d */
            public List m33073d() {
                return this.f59272a;
            }

            /* renamed from: e */
            public Boolean m33072e(int i) {
                Number number = (Number) this.f59272a.get(i);
                if (number instanceof Integer) {
                    int intValue = number.intValue();
                    if (intValue != 0) {
                        if (intValue == 1) {
                            return Boolean.TRUE;
                        }
                    } else {
                        return Boolean.FALSE;
                    }
                }
                throw new IllegalArgumentException();
            }

            /* renamed from: f */
            public List m33071f() {
                ArrayList arrayList = new ArrayList(this.f59272a);
                for (int i = 1; i < arrayList.size(); i++) {
                    arrayList.set(i, Integer.valueOf(((Number) arrayList.get(i - 1)).intValue() + ((Number) arrayList.get(i)).intValue()));
                }
                return arrayList;
            }

            /* renamed from: g */
            public Number m33070g(int i) {
                return (Number) this.f59272a.get(i);
            }

            /* renamed from: h */
            public boolean m33069h() {
                return !this.f59272a.isEmpty();
            }

            /* renamed from: i */
            public int m33068i() {
                return this.f59272a.size();
            }

            public String toString() {
                return getClass().getName() + "[operands=" + this.f59272a + ", operator=" + this.f59273b + "]";
            }
        }

        public C9851c() {
            this.f59271a = new HashMap();
        }

        /* renamed from: a */
        public void m33082a(C9852a c9852a) {
            if (c9852a.f59273b != null) {
                this.f59271a.put(c9852a.f59273b.getName(), c9852a);
            }
        }

        /* renamed from: b */
        public List m33081b(String str, List list) {
            C9852a m33078e = m33078e(str);
            if (m33078e != null && !m33078e.m33073d().isEmpty()) {
                return m33078e.m33073d();
            }
            return list;
        }

        /* renamed from: c */
        public Boolean m33080c(String str, boolean z) {
            C9852a m33078e = m33078e(str);
            if (m33078e != null && !m33078e.m33073d().isEmpty()) {
                z = m33078e.m33072e(0).booleanValue();
            }
            return Boolean.valueOf(z);
        }

        /* renamed from: d */
        public List m33079d(String str, List list) {
            C9852a m33078e = m33078e(str);
            if (m33078e != null && !m33078e.m33073d().isEmpty()) {
                return m33078e.m33071f();
            }
            return list;
        }

        /* renamed from: e */
        public C9852a m33078e(String str) {
            return (C9852a) this.f59271a.get(str);
        }

        /* renamed from: f */
        public Number m33077f(String str, Number number) {
            C9852a m33078e = m33078e(str);
            if (m33078e != null && !m33078e.m33073d().isEmpty()) {
                return m33078e.m33070g(0);
            }
            return number;
        }

        public String toString() {
            return getClass().getName() + "[entries=" + this.f59271a + "]";
        }
    }

    /* renamed from: com.tom_roush.fontbox.cff.CFFParser$d */
    /* loaded from: classes5.dex */
    public static abstract class AbstractC9853d extends CFFCharset {
        public AbstractC9853d(boolean z) {
            super(z);
        }
    }

    /* renamed from: com.tom_roush.fontbox.cff.CFFParser$e */
    /* loaded from: classes5.dex */
    public static class C9854e extends AbstractC9853d {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9854e(int i) {
            super(true);
            addCID(0, 0);
            for (int i2 = 1; i2 <= i; i2++) {
                addCID(i2, i2);
            }
        }

        public String toString() {
            return getClass().getName();
        }
    }

    /* renamed from: com.tom_roush.fontbox.cff.CFFParser$f */
    /* loaded from: classes5.dex */
    public static class C9855f extends AbstractC9853d {

        /* renamed from: g */
        public int f59274g;

        public C9855f(boolean z) {
            super(z);
        }

        public String toString() {
            return getClass().getName() + "[format=" + this.f59274g + "]";
        }
    }

    /* renamed from: com.tom_roush.fontbox.cff.CFFParser$g */
    /* loaded from: classes5.dex */
    public static class C9856g extends AbstractC9849b {

        /* renamed from: c */
        public int f59275c;

        /* renamed from: d */
        public int f59276d;

        public C9856g() {
        }

        public String toString() {
            return getClass().getName() + "[format=" + this.f59275c + ", nCodes=" + this.f59276d + ", supplement=" + Arrays.toString(this.f59267b) + "]";
        }
    }

    /* renamed from: com.tom_roush.fontbox.cff.CFFParser$h */
    /* loaded from: classes5.dex */
    public static class C9857h extends FDSelect {

        /* renamed from: a */
        public int f59277a;

        /* renamed from: b */
        public int[] f59278b;

        @Override // com.tom_roush.fontbox.cff.FDSelect
        public int getFDIndex(int i) {
            int[] iArr = this.f59278b;
            if (i < iArr.length) {
                return iArr[i];
            }
            return 0;
        }

        public String toString() {
            return getClass().getName() + "[fds=" + Arrays.toString(this.f59278b) + "]";
        }

        public C9857h(CFFCIDFont cFFCIDFont) {
            super(cFFCIDFont);
        }
    }

    /* renamed from: com.tom_roush.fontbox.cff.CFFParser$i */
    /* loaded from: classes5.dex */
    public static class C9858i extends AbstractC9853d {

        /* renamed from: g */
        public int f59279g;

        /* renamed from: h */
        public List f59280h;

        public C9858i(boolean z) {
            super(z);
        }

        @Override // com.tom_roush.fontbox.cff.CFFCharset
        public int getCIDForGID(int i) {
            if (isCIDFont()) {
                for (C9864o c9864o : this.f59280h) {
                    if (c9864o.m33037a(i)) {
                        return c9864o.m33034d(i);
                    }
                }
            }
            return super.getCIDForGID(i);
        }

        @Override // com.tom_roush.fontbox.cff.CFFCharset
        public int getGIDForCID(int i) {
            if (isCIDFont()) {
                for (C9864o c9864o : this.f59280h) {
                    if (c9864o.m33036b(i)) {
                        return c9864o.m33035c(i);
                    }
                }
            }
            return super.getGIDForCID(i);
        }

        public String toString() {
            return getClass().getName() + "[format=" + this.f59279g + "]";
        }
    }

    /* renamed from: com.tom_roush.fontbox.cff.CFFParser$j */
    /* loaded from: classes5.dex */
    public static class C9859j extends AbstractC9849b {

        /* renamed from: c */
        public int f59281c;

        /* renamed from: d */
        public int f59282d;

        public C9859j() {
        }

        public String toString() {
            return getClass().getName() + "[format=" + this.f59281c + ", nRanges=" + this.f59282d + ", supplement=" + Arrays.toString(this.f59267b) + "]";
        }
    }

    /* renamed from: com.tom_roush.fontbox.cff.CFFParser$k */
    /* loaded from: classes5.dex */
    public static class C9860k extends AbstractC9853d {

        /* renamed from: g */
        public int f59283g;

        /* renamed from: h */
        public List f59284h;

        public C9860k(boolean z) {
            super(z);
        }

        @Override // com.tom_roush.fontbox.cff.CFFCharset
        public int getCIDForGID(int i) {
            for (C9864o c9864o : this.f59284h) {
                if (c9864o.m33037a(i)) {
                    return c9864o.m33034d(i);
                }
            }
            return super.getCIDForGID(i);
        }

        @Override // com.tom_roush.fontbox.cff.CFFCharset
        public int getGIDForCID(int i) {
            for (C9864o c9864o : this.f59284h) {
                if (c9864o.m33036b(i)) {
                    return c9864o.m33035c(i);
                }
            }
            return super.getGIDForCID(i);
        }

        public String toString() {
            return getClass().getName() + "[format=" + this.f59283g + "]";
        }
    }

    /* renamed from: com.tom_roush.fontbox.cff.CFFParser$l */
    /* loaded from: classes5.dex */
    public static final class C9861l extends FDSelect {

        /* renamed from: a */
        public int f59285a;

        /* renamed from: b */
        public int f59286b;

        /* renamed from: c */
        public C9863n[] f59287c;

        /* renamed from: d */
        public int f59288d;

        @Override // com.tom_roush.fontbox.cff.FDSelect
        public int getFDIndex(int i) {
            for (int i2 = 0; i2 < this.f59286b; i2++) {
                if (this.f59287c[i2].f59293a <= i) {
                    int i3 = i2 + 1;
                    if (i3 < this.f59286b) {
                        if (this.f59287c[i3].f59293a > i) {
                            return this.f59287c[i2].f59294b;
                        }
                    } else if (this.f59288d > i) {
                        return this.f59287c[i2].f59294b;
                    } else {
                        return -1;
                    }
                }
            }
            return 0;
        }

        public String toString() {
            return C9861l.class.getName() + "[format=" + this.f59285a + " nbRanges=" + this.f59286b + ", range3=" + Arrays.toString(this.f59287c) + " sentinel=" + this.f59288d + "]";
        }

        public C9861l(CFFCIDFont cFFCIDFont) {
            super(cFFCIDFont);
        }
    }

    /* renamed from: com.tom_roush.fontbox.cff.CFFParser$m */
    /* loaded from: classes5.dex */
    public static class C9862m {

        /* renamed from: a */
        public int f59289a;

        /* renamed from: b */
        public int f59290b;

        /* renamed from: c */
        public int f59291c;

        /* renamed from: d */
        public int f59292d;

        public C9862m() {
        }

        public String toString() {
            return getClass().getName() + "[major=" + this.f59289a + ", minor=" + this.f59290b + ", hdrSize=" + this.f59291c + ", offSize=" + this.f59292d + "]";
        }
    }

    /* renamed from: com.tom_roush.fontbox.cff.CFFParser$n */
    /* loaded from: classes5.dex */
    public static final class C9863n {

        /* renamed from: a */
        public int f59293a;

        /* renamed from: b */
        public int f59294b;

        public C9863n() {
        }

        public String toString() {
            return C9863n.class.getName() + "[first=" + this.f59293a + ", fd=" + this.f59294b + "]";
        }
    }

    /* renamed from: com.tom_roush.fontbox.cff.CFFParser$o */
    /* loaded from: classes5.dex */
    public static final class C9864o {

        /* renamed from: a */
        public final int f59295a;

        /* renamed from: b */
        public final int f59296b;

        /* renamed from: c */
        public final int f59297c;

        /* renamed from: d */
        public final int f59298d;

        /* renamed from: a */
        public boolean m33037a(int i) {
            if (i >= this.f59295a && i <= this.f59296b) {
                return true;
            }
            return false;
        }

        /* renamed from: b */
        public boolean m33036b(int i) {
            if (i >= this.f59297c && i <= this.f59298d) {
                return true;
            }
            return false;
        }

        /* renamed from: c */
        public int m33035c(int i) {
            if (m33036b(i)) {
                return this.f59295a + (i - this.f59297c);
            }
            return 0;
        }

        /* renamed from: d */
        public int m33034d(int i) {
            if (m33037a(i)) {
                return this.f59297c + (i - this.f59295a);
            }
            return 0;
        }

        public String toString() {
            return C9864o.class.getName() + "[start value=" + this.f59295a + ", end value=" + this.f59296b + ", start mapped-value=" + this.f59297c + ", end mapped-value=" + this.f59298d + "]";
        }

        public C9864o(int i, int i2, int i3) {
            this.f59295a = i;
            this.f59296b = i + i3;
            this.f59297c = i2;
            this.f59298d = i2 + i3;
        }
    }

    /* renamed from: B */
    public static Double m33122B(CFFDataInput cFFDataInput) {
        StringBuilder sb = new StringBuilder();
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        while (!z) {
            int readUnsignedByte = cFFDataInput.readUnsignedByte();
            int[] iArr = {readUnsignedByte / 16, readUnsignedByte % 16};
            for (int i = 0; i < 2; i++) {
                int i2 = iArr[i];
                switch (i2) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                        sb.append(i2);
                        z2 = false;
                        break;
                    case 10:
                        sb.append(".");
                        break;
                    case 11:
                        if (z3) {
                            Log.w("PdfBox-Android", "duplicate 'E' ignored after " + ((Object) sb));
                            break;
                        } else {
                            sb.append(ExifInterface.LONGITUDE_EAST);
                            z2 = true;
                            z3 = true;
                            break;
                        }
                    case 12:
                        if (z3) {
                            Log.w("PdfBox-Android", "duplicate 'E-' ignored after " + ((Object) sb));
                            break;
                        } else {
                            sb.append("E-");
                            z2 = true;
                            z3 = true;
                            break;
                        }
                    case 13:
                        break;
                    case 14:
                        sb.append(HelpFormatter.DEFAULT_OPT_PREFIX);
                        break;
                    case 15:
                        z = true;
                        break;
                    default:
                        throw new IllegalArgumentException("illegal nibble " + i2);
                }
            }
        }
        if (z2) {
            sb.append("0");
        }
        if (sb.length() == 0) {
            return Double.valueOf(0.0d);
        }
        try {
            return Double.valueOf(sb.toString());
        } catch (NumberFormatException e) {
            throw new IOException(e);
        }
    }

    /* renamed from: D */
    public static String[] m33120D(CFFDataInput cFFDataInput) {
        int[] m33096v = m33096v(cFFDataInput);
        if (m33096v == null) {
            return null;
        }
        int length = m33096v.length - 1;
        String[] strArr = new String[length];
        int i = 0;
        while (i < length) {
            int i2 = i + 1;
            int i3 = m33096v[i2] - m33096v[i];
            if (i3 >= 0) {
                strArr[i] = new String(cFFDataInput.readBytes(i3), Charsets.ISO_8859_1);
                i = i2;
            } else {
                throw new IOException("Negative index data length + " + i3 + " at " + i + ": offsets[" + i2 + "]=" + m33096v[i2] + ", offsets[" + i + "]=" + m33096v[i]);
            }
        }
        return strArr;
    }

    /* renamed from: F */
    public static String m33118F(CFFDataInput cFFDataInput) {
        return new String(cFFDataInput.readBytes(4), Charsets.ISO_8859_1);
    }

    /* renamed from: h */
    public static C9851c m33110h(CFFDataInput cFFDataInput) {
        C9851c c9851c = new C9851c();
        while (cFFDataInput.hasRemaining()) {
            c9851c.m33082a(m33107k(cFFDataInput));
        }
        return c9851c;
    }

    /* renamed from: i */
    public static C9851c m33109i(CFFDataInput cFFDataInput, int i) {
        C9851c c9851c = new C9851c();
        int position = cFFDataInput.getPosition() + i;
        while (cFFDataInput.getPosition() < position) {
            c9851c.m33082a(m33107k(cFFDataInput));
        }
        return c9851c;
    }

    /* renamed from: k */
    public static C9851c.C9852a m33107k(CFFDataInput cFFDataInput) {
        int readUnsignedByte;
        C9851c.C9852a c9852a = new C9851c.C9852a();
        while (true) {
            readUnsignedByte = cFFDataInput.readUnsignedByte();
            if (readUnsignedByte >= 0 && readUnsignedByte <= 21) {
                c9852a.f59273b = m33093y(cFFDataInput, readUnsignedByte);
                return c9852a;
            } else if (readUnsignedByte != 28 && readUnsignedByte != 29) {
                if (readUnsignedByte == 30) {
                    c9852a.f59272a.add(m33122B(cFFDataInput));
                } else if (readUnsignedByte < 32 || readUnsignedByte > 254) {
                    break;
                } else {
                    c9852a.f59272a.add(m33095w(cFFDataInput, readUnsignedByte));
                }
            } else {
                c9852a.f59272a.add(m33095w(cFFDataInput, readUnsignedByte));
            }
        }
        throw new IOException("invalid DICT data b0 byte: " + readUnsignedByte);
    }

    /* renamed from: l */
    public static FDSelect m33106l(CFFDataInput cFFDataInput, int i, CFFCIDFont cFFCIDFont) {
        int readCard8 = cFFDataInput.readCard8();
        if (readCard8 != 0) {
            if (readCard8 == 3) {
                return m33099s(cFFDataInput, readCard8, i, cFFCIDFont);
            }
            throw new IllegalArgumentException();
        }
        return m33103o(cFFDataInput, readCard8, i, cFFCIDFont);
    }

    /* renamed from: o */
    public static C9857h m33103o(CFFDataInput cFFDataInput, int i, int i2, CFFCIDFont cFFCIDFont) {
        C9857h c9857h = new C9857h(cFFCIDFont);
        c9857h.f59277a = i;
        c9857h.f59278b = new int[i2];
        for (int i3 = 0; i3 < c9857h.f59278b.length; i3++) {
            c9857h.f59278b[i3] = cFFDataInput.readCard8();
        }
        return c9857h;
    }

    /* renamed from: s */
    public static C9861l m33099s(CFFDataInput cFFDataInput, int i, int i2, CFFCIDFont cFFCIDFont) {
        C9861l c9861l = new C9861l(cFFCIDFont);
        c9861l.f59285a = i;
        c9861l.f59286b = cFFDataInput.readCard16();
        c9861l.f59287c = new C9863n[c9861l.f59286b];
        for (int i3 = 0; i3 < c9861l.f59286b; i3++) {
            C9863n c9863n = new C9863n();
            c9863n.f59293a = cFFDataInput.readCard16();
            c9863n.f59294b = cFFDataInput.readCard8();
            c9861l.f59287c[i3] = c9863n;
        }
        c9861l.f59288d = cFFDataInput.readCard16();
        return c9861l;
    }

    /* renamed from: t */
    public static C9862m m33098t(CFFDataInput cFFDataInput) {
        C9862m c9862m = new C9862m();
        c9862m.f59289a = cFFDataInput.readCard8();
        c9862m.f59290b = cFFDataInput.readCard8();
        c9862m.f59291c = cFFDataInput.readCard8();
        c9862m.f59292d = cFFDataInput.readOffSize();
        return c9862m;
    }

    /* renamed from: u */
    public static byte[][] m33097u(CFFDataInput cFFDataInput) {
        int[] m33096v = m33096v(cFFDataInput);
        if (m33096v == null) {
            return null;
        }
        int length = m33096v.length - 1;
        byte[][] bArr = new byte[length];
        int i = 0;
        while (i < length) {
            int i2 = i + 1;
            bArr[i] = cFFDataInput.readBytes(m33096v[i2] - m33096v[i]);
            i = i2;
        }
        return bArr;
    }

    /* renamed from: v */
    public static int[] m33096v(CFFDataInput cFFDataInput) {
        int readCard16 = cFFDataInput.readCard16();
        if (readCard16 == 0) {
            return null;
        }
        int readOffSize = cFFDataInput.readOffSize();
        int[] iArr = new int[readCard16 + 1];
        for (int i = 0; i <= readCard16; i++) {
            int readOffset = cFFDataInput.readOffset(readOffSize);
            if (readOffset <= cFFDataInput.length()) {
                iArr[i] = readOffset;
            } else {
                throw new IOException("illegal offset value " + readOffset + " in CFF font");
            }
        }
        return iArr;
    }

    /* renamed from: w */
    public static Integer m33095w(CFFDataInput cFFDataInput, int i) {
        if (i == 28) {
            return Integer.valueOf(cFFDataInput.readShort());
        }
        if (i == 29) {
            return Integer.valueOf(cFFDataInput.readInt());
        }
        if (i >= 32 && i <= 246) {
            return Integer.valueOf(i - 139);
        }
        if (i >= 247 && i <= 250) {
            return Integer.valueOf(((i - 247) * 256) + cFFDataInput.readUnsignedByte() + AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR);
        } else if (i >= 251 && i <= 254) {
            return Integer.valueOf((((-(i - 251)) * 256) - cFFDataInput.readUnsignedByte()) - 108);
        } else {
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: x */
    public static long m33094x(CFFDataInput cFFDataInput) {
        return cFFDataInput.readCard16() | (cFFDataInput.readCard16() << 16);
    }

    /* renamed from: y */
    public static CFFOperator m33093y(CFFDataInput cFFDataInput, int i) {
        return CFFOperator.getOperator(m33092z(cFFDataInput, i));
    }

    /* renamed from: z */
    public static CFFOperator.Key m33092z(CFFDataInput cFFDataInput, int i) {
        if (i == 12) {
            return new CFFOperator.Key(i, cFFDataInput.readUnsignedByte());
        }
        return new CFFOperator.Key(i);
    }

    /* renamed from: A */
    public final Map m33123A(C9851c c9851c) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(17);
        linkedHashMap.put("BlueValues", c9851c.m33079d("BlueValues", null));
        linkedHashMap.put("OtherBlues", c9851c.m33079d("OtherBlues", null));
        linkedHashMap.put("FamilyBlues", c9851c.m33079d("FamilyBlues", null));
        linkedHashMap.put("FamilyOtherBlues", c9851c.m33079d("FamilyOtherBlues", null));
        linkedHashMap.put("BlueScale", c9851c.m33077f("BlueScale", Double.valueOf(0.039625d)));
        linkedHashMap.put("BlueShift", c9851c.m33077f("BlueShift", 7));
        linkedHashMap.put("BlueFuzz", c9851c.m33077f("BlueFuzz", 1));
        linkedHashMap.put(AFMParser.STD_HW, c9851c.m33077f(AFMParser.STD_HW, null));
        linkedHashMap.put(AFMParser.STD_VW, c9851c.m33077f(AFMParser.STD_VW, null));
        linkedHashMap.put("StemSnapH", c9851c.m33079d("StemSnapH", null));
        linkedHashMap.put("StemSnapV", c9851c.m33079d("StemSnapV", null));
        linkedHashMap.put("ForceBold", c9851c.m33080c("ForceBold", false));
        linkedHashMap.put("LanguageGroup", c9851c.m33077f("LanguageGroup", 0));
        linkedHashMap.put("ExpansionFactor", c9851c.m33077f("ExpansionFactor", Double.valueOf(0.06d)));
        linkedHashMap.put("initialRandomSeed", c9851c.m33077f("initialRandomSeed", 0));
        linkedHashMap.put("defaultWidthX", c9851c.m33077f("defaultWidthX", 0));
        linkedHashMap.put("nominalWidthX", c9851c.m33077f("nominalWidthX", 0));
        return linkedHashMap;
    }

    /* renamed from: C */
    public final String m33121C(int i) {
        if (i >= 0 && i <= 390) {
            return CFFStandardString.getName(i);
        }
        int i2 = i - 391;
        String[] strArr = this.f59263a;
        if (i2 < strArr.length) {
            return strArr[i2];
        }
        return "SID" + i;
    }

    /* renamed from: E */
    public final void m33119E(CFFDataInput cFFDataInput, AbstractC9849b abstractC9849b) {
        abstractC9849b.f59266a = cFFDataInput.readCard8();
        abstractC9849b.f59267b = new AbstractC9849b.C9850a[abstractC9849b.f59266a];
        for (int i = 0; i < abstractC9849b.f59267b.length; i++) {
            AbstractC9849b.C9850a c9850a = new AbstractC9849b.C9850a();
            c9850a.f59268a = cFFDataInput.readCard8();
            c9850a.f59269b = cFFDataInput.readSID();
            c9850a.f59270c = m33121C(c9850a.f59269b);
            abstractC9849b.f59267b[i] = c9850a;
            abstractC9849b.add(c9850a.f59268a, c9850a.f59269b, m33121C(c9850a.f59269b));
        }
    }

    /* renamed from: a */
    public final void m33117a(List list, List list2) {
        double doubleValue = ((Number) list.get(0)).doubleValue();
        double doubleValue2 = ((Number) list.get(1)).doubleValue();
        double doubleValue3 = ((Number) list.get(2)).doubleValue();
        double doubleValue4 = ((Number) list.get(3)).doubleValue();
        double doubleValue5 = ((Number) list.get(4)).doubleValue();
        double doubleValue6 = ((Number) list.get(5)).doubleValue();
        double doubleValue7 = ((Number) list2.get(0)).doubleValue();
        double doubleValue8 = ((Number) list2.get(1)).doubleValue();
        double doubleValue9 = ((Number) list2.get(2)).doubleValue();
        double doubleValue10 = ((Number) list2.get(3)).doubleValue();
        double doubleValue11 = ((Number) list2.get(4)).doubleValue();
        double doubleValue12 = ((Number) list2.get(5)).doubleValue();
        list.set(0, Double.valueOf((doubleValue * doubleValue7) + (doubleValue2 * doubleValue9)));
        list.set(1, Double.valueOf((doubleValue * doubleValue8) + (doubleValue2 * doubleValue4)));
        list.set(2, Double.valueOf((doubleValue3 * doubleValue7) + (doubleValue4 * doubleValue9)));
        list.set(3, Double.valueOf((doubleValue3 * doubleValue8) + (doubleValue4 * doubleValue10)));
        list.set(4, Double.valueOf((doubleValue7 * doubleValue5) + (doubleValue9 * doubleValue6) + doubleValue11));
        list.set(5, Double.valueOf((doubleValue5 * doubleValue8) + (doubleValue6 * doubleValue10) + doubleValue12));
    }

    /* renamed from: b */
    public final CFFDataInput m33116b(CFFDataInput cFFDataInput, byte[] bArr) {
        short readShort = cFFDataInput.readShort();
        cFFDataInput.readShort();
        cFFDataInput.readShort();
        cFFDataInput.readShort();
        for (int i = 0; i < readShort; i++) {
            String m33118F = m33118F(cFFDataInput);
            m33094x(cFFDataInput);
            long m33094x = m33094x(cFFDataInput);
            long m33094x2 = m33094x(cFFDataInput);
            if (CFFTable.TAG.equals(m33118F)) {
                return new CFFDataInput(Arrays.copyOfRange(bArr, (int) m33094x, (int) (m33094x + m33094x2)));
            }
        }
        throw new IOException("CFF tag not found in this OpenType font.");
    }

    /* renamed from: c */
    public final String m33115c(C9851c c9851c, String str) {
        C9851c.C9852a m33078e = c9851c.m33078e(str);
        if (m33078e != null && m33078e.m33069h()) {
            return m33121C(m33078e.m33070g(0).intValue());
        }
        return null;
    }

    /* renamed from: d */
    public final void m33114d(CFFDataInput cFFDataInput, C9851c c9851c, CFFCIDFont cFFCIDFont, int i) {
        C9851c.C9852a m33078e = c9851c.m33078e("FDArray");
        if (m33078e != null && m33078e.m33069h()) {
            cFFDataInput.setPosition(m33078e.m33070g(0).intValue());
            byte[][] m33097u = m33097u(cFFDataInput);
            if (m33097u != null) {
                LinkedList linkedList = new LinkedList();
                LinkedList linkedList2 = new LinkedList();
                for (byte[] bArr : m33097u) {
                    C9851c m33110h = m33110h(new CFFDataInput(bArr));
                    C9851c.C9852a m33078e2 = m33110h.m33078e(StandardStructureTypes.PRIVATE);
                    if (m33078e2 != null && m33078e2.m33068i() >= 2) {
                        LinkedHashMap linkedHashMap = new LinkedHashMap(4);
                        linkedHashMap.put(AFMParser.FONT_NAME, m33115c(m33110h, AFMParser.FONT_NAME));
                        linkedHashMap.put("FontType", m33110h.m33077f("FontType", 0));
                        linkedHashMap.put(AFMParser.FONT_BBOX, m33110h.m33081b(AFMParser.FONT_BBOX, null));
                        linkedHashMap.put("FontMatrix", m33110h.m33081b("FontMatrix", null));
                        linkedList2.add(linkedHashMap);
                        int intValue = m33078e2.m33070g(1).intValue();
                        cFFDataInput.setPosition(intValue);
                        C9851c m33109i = m33109i(cFFDataInput, m33078e2.m33070g(0).intValue());
                        Map m33123A = m33123A(m33109i);
                        linkedList.add(m33123A);
                        Number m33077f = m33109i.m33077f("Subrs", 0);
                        if (m33077f instanceof Integer) {
                            Integer num = (Integer) m33077f;
                            if (num.intValue() > 0) {
                                cFFDataInput.setPosition(intValue + num.intValue());
                                m33123A.put("Subrs", m33097u(cFFDataInput));
                            }
                        }
                    } else {
                        throw new IOException("Font DICT invalid without \"Private\" entry");
                    }
                }
                C9851c.C9852a m33078e3 = c9851c.m33078e("FDSelect");
                if (m33078e3 != null && m33078e3.m33069h()) {
                    cFFDataInput.setPosition(m33078e3.m33070g(0).intValue());
                    FDSelect m33106l = m33106l(cFFDataInput, i, cFFCIDFont);
                    cFFCIDFont.m33139j(linkedList2);
                    cFFCIDFont.m33137l(linkedList);
                    cFFCIDFont.m33140i(m33106l);
                    return;
                }
                throw new IOException("FDSelect is missing or empty");
            }
            throw new IOException("Font dict index is missing for a CIDKeyed Font");
        }
        throw new IOException("FDArray is missing for a CIDKeyed Font.");
    }

    /* renamed from: e */
    public final CFFFont m33113e(CFFDataInput cFFDataInput, String str, byte[] bArr) {
        boolean z;
        CFFCIDFont cFFCIDFont;
        CFFCharset cFFISOAdobeCharset;
        List list;
        List list2;
        C9851c m33110h = m33110h(new CFFDataInput(bArr));
        if (m33110h.m33078e("SyntheticBase") == null) {
            if (m33110h.m33078e("ROS") != null) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                CFFCIDFont cFFCIDFont2 = new CFFCIDFont();
                C9851c.C9852a m33078e = m33110h.m33078e("ROS");
                if (m33078e != null && m33078e.m33068i() >= 3) {
                    cFFCIDFont2.m33136m(m33121C(m33078e.m33070g(0).intValue()));
                    cFFCIDFont2.m33138k(m33121C(m33078e.m33070g(1).intValue()));
                    cFFCIDFont2.m33135n(m33078e.m33070g(2).intValue());
                    cFFCIDFont = cFFCIDFont2;
                } else {
                    throw new IOException("ROS entry must have 3 elements");
                }
            } else {
                cFFCIDFont = new CFFType1Font();
            }
            this.f59265c = str;
            cFFCIDFont.m33128d(str);
            cFFCIDFont.addValueToTopDict(ClientCookie.VERSION_ATTR, m33115c(m33110h, ClientCookie.VERSION_ATTR));
            cFFCIDFont.addValueToTopDict(AFMParser.NOTICE, m33115c(m33110h, AFMParser.NOTICE));
            cFFCIDFont.addValueToTopDict(ExifInterface.TAG_COPYRIGHT, m33115c(m33110h, ExifInterface.TAG_COPYRIGHT));
            cFFCIDFont.addValueToTopDict(AFMParser.FULL_NAME, m33115c(m33110h, AFMParser.FULL_NAME));
            cFFCIDFont.addValueToTopDict(AFMParser.FAMILY_NAME, m33115c(m33110h, AFMParser.FAMILY_NAME));
            cFFCIDFont.addValueToTopDict(AFMParser.WEIGHT, m33115c(m33110h, AFMParser.WEIGHT));
            cFFCIDFont.addValueToTopDict("isFixedPitch", m33110h.m33080c("isFixedPitch", false));
            cFFCIDFont.addValueToTopDict(AFMParser.ITALIC_ANGLE, m33110h.m33077f(AFMParser.ITALIC_ANGLE, 0));
            cFFCIDFont.addValueToTopDict(AFMParser.UNDERLINE_POSITION, m33110h.m33077f(AFMParser.UNDERLINE_POSITION, -100));
            cFFCIDFont.addValueToTopDict(AFMParser.UNDERLINE_THICKNESS, m33110h.m33077f(AFMParser.UNDERLINE_THICKNESS, 50));
            cFFCIDFont.addValueToTopDict("PaintType", m33110h.m33077f("PaintType", 0));
            cFFCIDFont.addValueToTopDict("CharstringType", m33110h.m33077f("CharstringType", 2));
            cFFCIDFont.addValueToTopDict("FontMatrix", m33110h.m33081b("FontMatrix", Arrays.asList(Double.valueOf(0.001d), Double.valueOf(0.0d), Double.valueOf(0.0d), Double.valueOf(0.001d), Double.valueOf(0.0d), Double.valueOf(0.0d))));
            cFFCIDFont.addValueToTopDict("UniqueID", m33110h.m33077f("UniqueID", null));
            cFFCIDFont.addValueToTopDict(AFMParser.FONT_BBOX, m33110h.m33081b(AFMParser.FONT_BBOX, Arrays.asList(0, 0, 0, 0)));
            cFFCIDFont.addValueToTopDict("StrokeWidth", m33110h.m33077f("StrokeWidth", 0));
            cFFCIDFont.addValueToTopDict("XUID", m33110h.m33081b("XUID", null));
            C9851c.C9852a m33078e2 = m33110h.m33078e("CharStrings");
            if (m33078e2 != null && m33078e2.m33069h()) {
                cFFDataInput.setPosition(m33078e2.m33070g(0).intValue());
                byte[][] m33097u = m33097u(cFFDataInput);
                C9851c.C9852a m33078e3 = m33110h.m33078e("charset");
                if (m33078e3 != null && m33078e3.m33069h()) {
                    int intValue = m33078e3.m33070g(0).intValue();
                    if (!z && intValue == 0) {
                        cFFISOAdobeCharset = CFFISOAdobeCharset.getInstance();
                    } else if (!z && intValue == 1) {
                        cFFISOAdobeCharset = CFFExpertCharset.getInstance();
                    } else if (!z && intValue == 2) {
                        cFFISOAdobeCharset = CFFExpertSubsetCharset.getInstance();
                    } else {
                        cFFDataInput.setPosition(intValue);
                        cFFISOAdobeCharset = m33111g(cFFDataInput, m33097u.length, z);
                    }
                } else if (z) {
                    cFFISOAdobeCharset = new C9854e(m33097u.length);
                } else {
                    cFFISOAdobeCharset = CFFISOAdobeCharset.getInstance();
                }
                cFFCIDFont.m33131a(cFFISOAdobeCharset);
                cFFCIDFont.charStrings = m33097u;
                if (z) {
                    CFFCIDFont cFFCIDFont3 = (CFFCIDFont) cFFCIDFont;
                    m33114d(cFFDataInput, m33110h, cFFCIDFont3, m33097u.length);
                    List<Map<String, Object>> fontDicts = cFFCIDFont3.getFontDicts();
                    if (!fontDicts.isEmpty() && fontDicts.get(0).containsKey("FontMatrix")) {
                        list2 = (List) fontDicts.get(0).get("FontMatrix");
                        list = null;
                    } else {
                        list = null;
                        list2 = null;
                    }
                    List m33081b = m33110h.m33081b("FontMatrix", list);
                    if (m33081b == null) {
                        if (list2 != null) {
                            cFFCIDFont.addValueToTopDict("FontMatrix", list2);
                        } else {
                            cFFCIDFont.addValueToTopDict("FontMatrix", m33110h.m33081b("FontMatrix", Arrays.asList(Double.valueOf(0.001d), Double.valueOf(0.0d), Double.valueOf(0.0d), Double.valueOf(0.001d), Double.valueOf(0.0d), Double.valueOf(0.0d))));
                        }
                    } else if (list2 != null) {
                        m33117a(m33081b, list2);
                    }
                } else {
                    m33112f(cFFDataInput, m33110h, cFFCIDFont, cFFISOAdobeCharset);
                }
                return cFFCIDFont;
            }
            throw new IOException("CharStrings is missing or empty");
        }
        throw new IOException("Synthetic Fonts are not supported");
    }

    /* renamed from: f */
    public final void m33112f(CFFDataInput cFFDataInput, C9851c c9851c, CFFType1Font cFFType1Font, CFFCharset cFFCharset) {
        int i;
        CFFEncoding cFFStandardEncoding;
        C9851c.C9852a m33078e = c9851c.m33078e("Encoding");
        if (m33078e != null && m33078e.m33069h()) {
            i = m33078e.m33070g(0).intValue();
        } else {
            i = 0;
        }
        if (i != 0) {
            if (i != 1) {
                cFFDataInput.setPosition(i);
                cFFStandardEncoding = m33108j(cFFDataInput, cFFCharset);
            } else {
                cFFStandardEncoding = CFFExpertEncoding.getInstance();
            }
        } else {
            cFFStandardEncoding = CFFStandardEncoding.getInstance();
        }
        cFFType1Font.m33027k(cFFStandardEncoding);
        C9851c.C9852a m33078e2 = c9851c.m33078e(StandardStructureTypes.PRIVATE);
        if (m33078e2 != null && m33078e2.m33068i() >= 2) {
            int intValue = m33078e2.m33070g(1).intValue();
            cFFDataInput.setPosition(intValue);
            C9851c m33109i = m33109i(cFFDataInput, m33078e2.m33070g(0).intValue());
            for (Map.Entry entry : m33123A(m33109i).entrySet()) {
                cFFType1Font.m33033e((String) entry.getKey(), entry.getValue());
            }
            Number m33077f = m33109i.m33077f("Subrs", 0);
            if (m33077f instanceof Integer) {
                Integer num = (Integer) m33077f;
                if (num.intValue() > 0) {
                    cFFDataInput.setPosition(intValue + num.intValue());
                    cFFType1Font.m33033e("Subrs", m33097u(cFFDataInput));
                    return;
                }
                return;
            }
            return;
        }
        throw new IOException("Private dictionary entry missing for font " + cFFType1Font.fontName);
    }

    /* renamed from: g */
    public final CFFCharset m33111g(CFFDataInput cFFDataInput, int i, boolean z) {
        int readCard8 = cFFDataInput.readCard8();
        if (readCard8 != 0) {
            if (readCard8 != 1) {
                if (readCard8 == 2) {
                    return m33100r(cFFDataInput, readCard8, i, z);
                }
                throw new IllegalArgumentException();
            }
            return m33102p(cFFDataInput, readCard8, i, z);
        }
        return m33105m(cFFDataInput, readCard8, i, z);
    }

    /* renamed from: j */
    public final CFFEncoding m33108j(CFFDataInput cFFDataInput, CFFCharset cFFCharset) {
        int readCard8 = cFFDataInput.readCard8();
        int i = readCard8 & 127;
        if (i != 0) {
            if (i == 1) {
                return m33101q(cFFDataInput, cFFCharset, readCard8);
            }
            throw new IllegalArgumentException();
        }
        return m33104n(cFFDataInput, cFFCharset, readCard8);
    }

    /* renamed from: m */
    public final C9855f m33105m(CFFDataInput cFFDataInput, int i, int i2, boolean z) {
        C9855f c9855f = new C9855f(z);
        c9855f.f59274g = i;
        if (z) {
            c9855f.addCID(0, 0);
        } else {
            c9855f.addSID(0, 0, ".notdef");
        }
        for (int i3 = 1; i3 < i2; i3++) {
            int readSID = cFFDataInput.readSID();
            if (z) {
                c9855f.addCID(i3, readSID);
            } else {
                c9855f.addSID(i3, readSID, m33121C(readSID));
            }
        }
        return c9855f;
    }

    /* renamed from: n */
    public final C9856g m33104n(CFFDataInput cFFDataInput, CFFCharset cFFCharset, int i) {
        C9856g c9856g = new C9856g();
        c9856g.f59275c = i;
        c9856g.f59276d = cFFDataInput.readCard8();
        c9856g.add(0, 0, ".notdef");
        for (int i2 = 1; i2 <= c9856g.f59276d; i2++) {
            int readCard8 = cFFDataInput.readCard8();
            int m33132c = cFFCharset.m33132c(i2);
            c9856g.add(readCard8, m33132c, m33121C(m33132c));
        }
        if ((i & 128) != 0) {
            m33119E(cFFDataInput, c9856g);
        }
        return c9856g;
    }

    /* renamed from: p */
    public final C9858i m33102p(CFFDataInput cFFDataInput, int i, int i2, boolean z) {
        C9858i c9858i = new C9858i(z);
        c9858i.f59279g = i;
        if (z) {
            c9858i.addCID(0, 0);
            c9858i.f59280h = new ArrayList();
        } else {
            c9858i.addSID(0, 0, ".notdef");
        }
        int i3 = 1;
        while (i3 < i2) {
            int readSID = cFFDataInput.readSID();
            int readCard8 = cFFDataInput.readCard8();
            if (!z) {
                for (int i4 = 0; i4 < readCard8 + 1; i4++) {
                    int i5 = readSID + i4;
                    c9858i.addSID(i3 + i4, i5, m33121C(i5));
                }
            } else {
                c9858i.f59280h.add(new C9864o(i3, readSID, readCard8));
            }
            i3 = i3 + readCard8 + 1;
        }
        return c9858i;
    }

    public List<CFFFont> parse(byte[] bArr, ByteSource byteSource) throws IOException {
        this.f59264b = byteSource;
        return parse(bArr);
    }

    /* renamed from: q */
    public final C9859j m33101q(CFFDataInput cFFDataInput, CFFCharset cFFCharset, int i) {
        C9859j c9859j = new C9859j();
        c9859j.f59281c = i;
        c9859j.f59282d = cFFDataInput.readCard8();
        c9859j.add(0, 0, ".notdef");
        int i2 = 1;
        for (int i3 = 0; i3 < c9859j.f59282d; i3++) {
            int readCard8 = cFFDataInput.readCard8();
            int readCard82 = cFFDataInput.readCard8();
            for (int i4 = 0; i4 <= readCard82; i4++) {
                int m33132c = cFFCharset.m33132c(i2);
                c9859j.add(readCard8 + i4, m33132c, m33121C(m33132c));
                i2++;
            }
        }
        if ((i & 128) != 0) {
            m33119E(cFFDataInput, c9859j);
        }
        return c9859j;
    }

    /* renamed from: r */
    public final C9860k m33100r(CFFDataInput cFFDataInput, int i, int i2, boolean z) {
        C9860k c9860k = new C9860k(z);
        c9860k.f59283g = i;
        if (z) {
            c9860k.addCID(0, 0);
            c9860k.f59284h = new ArrayList();
        } else {
            c9860k.addSID(0, 0, ".notdef");
        }
        int i3 = 1;
        while (i3 < i2) {
            int readSID = cFFDataInput.readSID();
            int readCard16 = cFFDataInput.readCard16();
            if (!z) {
                for (int i4 = 0; i4 < readCard16 + 1; i4++) {
                    int i5 = readSID + i4;
                    c9860k.addSID(i3 + i4, i5, m33121C(i5));
                }
            } else {
                c9860k.f59284h.add(new C9864o(i3, readSID, readCard16));
            }
            i3 = i3 + readCard16 + 1;
        }
        return c9860k;
    }

    public String toString() {
        return getClass().getSimpleName() + "[" + this.f59265c + "]";
    }

    public List<CFFFont> parse(byte[] bArr) throws IOException {
        CFFDataInput cFFDataInput = new CFFDataInput(bArr);
        String m33118F = m33118F(cFFDataInput);
        if ("OTTO".equals(m33118F)) {
            cFFDataInput = m33116b(cFFDataInput, bArr);
        } else if (!"ttcf".equals(m33118F)) {
            if (!"\u0000\u0001\u0000\u0000".equals(m33118F)) {
                cFFDataInput.setPosition(0);
            } else {
                throw new IOException("OpenType fonts containing a true type font are not supported.");
            }
        } else {
            throw new IOException("True Type Collection fonts are not supported.");
        }
        m33098t(cFFDataInput);
        String[] m33120D = m33120D(cFFDataInput);
        if (m33120D != null) {
            byte[][] m33097u = m33097u(cFFDataInput);
            this.f59263a = m33120D(cFFDataInput);
            byte[][] m33097u2 = m33097u(cFFDataInput);
            ArrayList arrayList = new ArrayList(m33120D.length);
            for (int i = 0; i < m33120D.length; i++) {
                CFFFont m33113e = m33113e(cFFDataInput, m33120D[i], m33097u[i]);
                m33113e.m33129c(m33097u2);
                m33113e.m33130b(this.f59264b);
                arrayList.add(m33113e);
            }
            return arrayList;
        }
        throw new IOException("Name index missing in CFF font");
    }
}
