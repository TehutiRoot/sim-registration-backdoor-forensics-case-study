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
    public String[] f59275a = null;

    /* renamed from: b */
    public ByteSource f59276b;

    /* renamed from: c */
    public String f59277c;

    /* loaded from: classes5.dex */
    public interface ByteSource {
        byte[] getBytes() throws IOException;
    }

    /* renamed from: com.tom_roush.fontbox.cff.CFFParser$b */
    /* loaded from: classes5.dex */
    public static abstract class AbstractC9838b extends CFFEncoding {

        /* renamed from: a */
        public int f59278a;

        /* renamed from: b */
        public C9839a[] f59279b;

        /* renamed from: com.tom_roush.fontbox.cff.CFFParser$b$a */
        /* loaded from: classes5.dex */
        public static class C9839a {

            /* renamed from: a */
            public int f59280a;

            /* renamed from: b */
            public int f59281b;

            /* renamed from: c */
            public String f59282c;

            public String toString() {
                return getClass().getName() + "[code=" + this.f59280a + ", sid=" + this.f59281b + "]";
            }
        }
    }

    /* renamed from: com.tom_roush.fontbox.cff.CFFParser$c */
    /* loaded from: classes5.dex */
    public static class C9840c {

        /* renamed from: a */
        public final Map f59283a;

        /* renamed from: com.tom_roush.fontbox.cff.CFFParser$c$a */
        /* loaded from: classes5.dex */
        public static class C9841a {

            /* renamed from: a */
            public List f59284a;

            /* renamed from: b */
            public CFFOperator f59285b;

            public C9841a() {
                this.f59284a = new ArrayList();
                this.f59285b = null;
            }

            /* renamed from: d */
            public List m33065d() {
                return this.f59284a;
            }

            /* renamed from: e */
            public Boolean m33064e(int i) {
                Number number = (Number) this.f59284a.get(i);
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
            public List m33063f() {
                ArrayList arrayList = new ArrayList(this.f59284a);
                for (int i = 1; i < arrayList.size(); i++) {
                    arrayList.set(i, Integer.valueOf(((Number) arrayList.get(i - 1)).intValue() + ((Number) arrayList.get(i)).intValue()));
                }
                return arrayList;
            }

            /* renamed from: g */
            public Number m33062g(int i) {
                return (Number) this.f59284a.get(i);
            }

            /* renamed from: h */
            public boolean m33061h() {
                return !this.f59284a.isEmpty();
            }

            /* renamed from: i */
            public int m33060i() {
                return this.f59284a.size();
            }

            public String toString() {
                return getClass().getName() + "[operands=" + this.f59284a + ", operator=" + this.f59285b + "]";
            }
        }

        public C9840c() {
            this.f59283a = new HashMap();
        }

        /* renamed from: a */
        public void m33074a(C9841a c9841a) {
            if (c9841a.f59285b != null) {
                this.f59283a.put(c9841a.f59285b.getName(), c9841a);
            }
        }

        /* renamed from: b */
        public List m33073b(String str, List list) {
            C9841a m33070e = m33070e(str);
            if (m33070e != null && !m33070e.m33065d().isEmpty()) {
                return m33070e.m33065d();
            }
            return list;
        }

        /* renamed from: c */
        public Boolean m33072c(String str, boolean z) {
            C9841a m33070e = m33070e(str);
            if (m33070e != null && !m33070e.m33065d().isEmpty()) {
                z = m33070e.m33064e(0).booleanValue();
            }
            return Boolean.valueOf(z);
        }

        /* renamed from: d */
        public List m33071d(String str, List list) {
            C9841a m33070e = m33070e(str);
            if (m33070e != null && !m33070e.m33065d().isEmpty()) {
                return m33070e.m33063f();
            }
            return list;
        }

        /* renamed from: e */
        public C9841a m33070e(String str) {
            return (C9841a) this.f59283a.get(str);
        }

        /* renamed from: f */
        public Number m33069f(String str, Number number) {
            C9841a m33070e = m33070e(str);
            if (m33070e != null && !m33070e.m33065d().isEmpty()) {
                return m33070e.m33062g(0);
            }
            return number;
        }

        public String toString() {
            return getClass().getName() + "[entries=" + this.f59283a + "]";
        }
    }

    /* renamed from: com.tom_roush.fontbox.cff.CFFParser$d */
    /* loaded from: classes5.dex */
    public static abstract class AbstractC9842d extends CFFCharset {
        public AbstractC9842d(boolean z) {
            super(z);
        }
    }

    /* renamed from: com.tom_roush.fontbox.cff.CFFParser$e */
    /* loaded from: classes5.dex */
    public static class C9843e extends AbstractC9842d {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9843e(int i) {
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
    public static class C9844f extends AbstractC9842d {

        /* renamed from: g */
        public int f59286g;

        public C9844f(boolean z) {
            super(z);
        }

        public String toString() {
            return getClass().getName() + "[format=" + this.f59286g + "]";
        }
    }

    /* renamed from: com.tom_roush.fontbox.cff.CFFParser$g */
    /* loaded from: classes5.dex */
    public static class C9845g extends AbstractC9838b {

        /* renamed from: c */
        public int f59287c;

        /* renamed from: d */
        public int f59288d;

        public C9845g() {
        }

        public String toString() {
            return getClass().getName() + "[format=" + this.f59287c + ", nCodes=" + this.f59288d + ", supplement=" + Arrays.toString(this.f59279b) + "]";
        }
    }

    /* renamed from: com.tom_roush.fontbox.cff.CFFParser$h */
    /* loaded from: classes5.dex */
    public static class C9846h extends FDSelect {

        /* renamed from: a */
        public int f59289a;

        /* renamed from: b */
        public int[] f59290b;

        @Override // com.tom_roush.fontbox.cff.FDSelect
        public int getFDIndex(int i) {
            int[] iArr = this.f59290b;
            if (i < iArr.length) {
                return iArr[i];
            }
            return 0;
        }

        public String toString() {
            return getClass().getName() + "[fds=" + Arrays.toString(this.f59290b) + "]";
        }

        public C9846h(CFFCIDFont cFFCIDFont) {
            super(cFFCIDFont);
        }
    }

    /* renamed from: com.tom_roush.fontbox.cff.CFFParser$i */
    /* loaded from: classes5.dex */
    public static class C9847i extends AbstractC9842d {

        /* renamed from: g */
        public int f59291g;

        /* renamed from: h */
        public List f59292h;

        public C9847i(boolean z) {
            super(z);
        }

        @Override // com.tom_roush.fontbox.cff.CFFCharset
        public int getCIDForGID(int i) {
            if (isCIDFont()) {
                for (C9853o c9853o : this.f59292h) {
                    if (c9853o.m33029a(i)) {
                        return c9853o.m33026d(i);
                    }
                }
            }
            return super.getCIDForGID(i);
        }

        @Override // com.tom_roush.fontbox.cff.CFFCharset
        public int getGIDForCID(int i) {
            if (isCIDFont()) {
                for (C9853o c9853o : this.f59292h) {
                    if (c9853o.m33028b(i)) {
                        return c9853o.m33027c(i);
                    }
                }
            }
            return super.getGIDForCID(i);
        }

        public String toString() {
            return getClass().getName() + "[format=" + this.f59291g + "]";
        }
    }

    /* renamed from: com.tom_roush.fontbox.cff.CFFParser$j */
    /* loaded from: classes5.dex */
    public static class C9848j extends AbstractC9838b {

        /* renamed from: c */
        public int f59293c;

        /* renamed from: d */
        public int f59294d;

        public C9848j() {
        }

        public String toString() {
            return getClass().getName() + "[format=" + this.f59293c + ", nRanges=" + this.f59294d + ", supplement=" + Arrays.toString(this.f59279b) + "]";
        }
    }

    /* renamed from: com.tom_roush.fontbox.cff.CFFParser$k */
    /* loaded from: classes5.dex */
    public static class C9849k extends AbstractC9842d {

        /* renamed from: g */
        public int f59295g;

        /* renamed from: h */
        public List f59296h;

        public C9849k(boolean z) {
            super(z);
        }

        @Override // com.tom_roush.fontbox.cff.CFFCharset
        public int getCIDForGID(int i) {
            for (C9853o c9853o : this.f59296h) {
                if (c9853o.m33029a(i)) {
                    return c9853o.m33026d(i);
                }
            }
            return super.getCIDForGID(i);
        }

        @Override // com.tom_roush.fontbox.cff.CFFCharset
        public int getGIDForCID(int i) {
            for (C9853o c9853o : this.f59296h) {
                if (c9853o.m33028b(i)) {
                    return c9853o.m33027c(i);
                }
            }
            return super.getGIDForCID(i);
        }

        public String toString() {
            return getClass().getName() + "[format=" + this.f59295g + "]";
        }
    }

    /* renamed from: com.tom_roush.fontbox.cff.CFFParser$l */
    /* loaded from: classes5.dex */
    public static final class C9850l extends FDSelect {

        /* renamed from: a */
        public int f59297a;

        /* renamed from: b */
        public int f59298b;

        /* renamed from: c */
        public C9852n[] f59299c;

        /* renamed from: d */
        public int f59300d;

        @Override // com.tom_roush.fontbox.cff.FDSelect
        public int getFDIndex(int i) {
            for (int i2 = 0; i2 < this.f59298b; i2++) {
                if (this.f59299c[i2].f59305a <= i) {
                    int i3 = i2 + 1;
                    if (i3 < this.f59298b) {
                        if (this.f59299c[i3].f59305a > i) {
                            return this.f59299c[i2].f59306b;
                        }
                    } else if (this.f59300d > i) {
                        return this.f59299c[i2].f59306b;
                    } else {
                        return -1;
                    }
                }
            }
            return 0;
        }

        public String toString() {
            return C9850l.class.getName() + "[format=" + this.f59297a + " nbRanges=" + this.f59298b + ", range3=" + Arrays.toString(this.f59299c) + " sentinel=" + this.f59300d + "]";
        }

        public C9850l(CFFCIDFont cFFCIDFont) {
            super(cFFCIDFont);
        }
    }

    /* renamed from: com.tom_roush.fontbox.cff.CFFParser$m */
    /* loaded from: classes5.dex */
    public static class C9851m {

        /* renamed from: a */
        public int f59301a;

        /* renamed from: b */
        public int f59302b;

        /* renamed from: c */
        public int f59303c;

        /* renamed from: d */
        public int f59304d;

        public C9851m() {
        }

        public String toString() {
            return getClass().getName() + "[major=" + this.f59301a + ", minor=" + this.f59302b + ", hdrSize=" + this.f59303c + ", offSize=" + this.f59304d + "]";
        }
    }

    /* renamed from: com.tom_roush.fontbox.cff.CFFParser$n */
    /* loaded from: classes5.dex */
    public static final class C9852n {

        /* renamed from: a */
        public int f59305a;

        /* renamed from: b */
        public int f59306b;

        public C9852n() {
        }

        public String toString() {
            return C9852n.class.getName() + "[first=" + this.f59305a + ", fd=" + this.f59306b + "]";
        }
    }

    /* renamed from: com.tom_roush.fontbox.cff.CFFParser$o */
    /* loaded from: classes5.dex */
    public static final class C9853o {

        /* renamed from: a */
        public final int f59307a;

        /* renamed from: b */
        public final int f59308b;

        /* renamed from: c */
        public final int f59309c;

        /* renamed from: d */
        public final int f59310d;

        /* renamed from: a */
        public boolean m33029a(int i) {
            if (i >= this.f59307a && i <= this.f59308b) {
                return true;
            }
            return false;
        }

        /* renamed from: b */
        public boolean m33028b(int i) {
            if (i >= this.f59309c && i <= this.f59310d) {
                return true;
            }
            return false;
        }

        /* renamed from: c */
        public int m33027c(int i) {
            if (m33028b(i)) {
                return this.f59307a + (i - this.f59309c);
            }
            return 0;
        }

        /* renamed from: d */
        public int m33026d(int i) {
            if (m33029a(i)) {
                return this.f59309c + (i - this.f59307a);
            }
            return 0;
        }

        public String toString() {
            return C9853o.class.getName() + "[start value=" + this.f59307a + ", end value=" + this.f59308b + ", start mapped-value=" + this.f59309c + ", end mapped-value=" + this.f59310d + "]";
        }

        public C9853o(int i, int i2, int i3) {
            this.f59307a = i;
            this.f59308b = i + i3;
            this.f59309c = i2;
            this.f59310d = i2 + i3;
        }
    }

    /* renamed from: B */
    public static Double m33114B(CFFDataInput cFFDataInput) {
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
    public static String[] m33112D(CFFDataInput cFFDataInput) {
        int[] m33088v = m33088v(cFFDataInput);
        if (m33088v == null) {
            return null;
        }
        int length = m33088v.length - 1;
        String[] strArr = new String[length];
        int i = 0;
        while (i < length) {
            int i2 = i + 1;
            int i3 = m33088v[i2] - m33088v[i];
            if (i3 >= 0) {
                strArr[i] = new String(cFFDataInput.readBytes(i3), Charsets.ISO_8859_1);
                i = i2;
            } else {
                throw new IOException("Negative index data length + " + i3 + " at " + i + ": offsets[" + i2 + "]=" + m33088v[i2] + ", offsets[" + i + "]=" + m33088v[i]);
            }
        }
        return strArr;
    }

    /* renamed from: F */
    public static String m33110F(CFFDataInput cFFDataInput) {
        return new String(cFFDataInput.readBytes(4), Charsets.ISO_8859_1);
    }

    /* renamed from: h */
    public static C9840c m33102h(CFFDataInput cFFDataInput) {
        C9840c c9840c = new C9840c();
        while (cFFDataInput.hasRemaining()) {
            c9840c.m33074a(m33099k(cFFDataInput));
        }
        return c9840c;
    }

    /* renamed from: i */
    public static C9840c m33101i(CFFDataInput cFFDataInput, int i) {
        C9840c c9840c = new C9840c();
        int position = cFFDataInput.getPosition() + i;
        while (cFFDataInput.getPosition() < position) {
            c9840c.m33074a(m33099k(cFFDataInput));
        }
        return c9840c;
    }

    /* renamed from: k */
    public static C9840c.C9841a m33099k(CFFDataInput cFFDataInput) {
        int readUnsignedByte;
        C9840c.C9841a c9841a = new C9840c.C9841a();
        while (true) {
            readUnsignedByte = cFFDataInput.readUnsignedByte();
            if (readUnsignedByte >= 0 && readUnsignedByte <= 21) {
                c9841a.f59285b = m33085y(cFFDataInput, readUnsignedByte);
                return c9841a;
            } else if (readUnsignedByte != 28 && readUnsignedByte != 29) {
                if (readUnsignedByte == 30) {
                    c9841a.f59284a.add(m33114B(cFFDataInput));
                } else if (readUnsignedByte < 32 || readUnsignedByte > 254) {
                    break;
                } else {
                    c9841a.f59284a.add(m33087w(cFFDataInput, readUnsignedByte));
                }
            } else {
                c9841a.f59284a.add(m33087w(cFFDataInput, readUnsignedByte));
            }
        }
        throw new IOException("invalid DICT data b0 byte: " + readUnsignedByte);
    }

    /* renamed from: l */
    public static FDSelect m33098l(CFFDataInput cFFDataInput, int i, CFFCIDFont cFFCIDFont) {
        int readCard8 = cFFDataInput.readCard8();
        if (readCard8 != 0) {
            if (readCard8 == 3) {
                return m33091s(cFFDataInput, readCard8, i, cFFCIDFont);
            }
            throw new IllegalArgumentException();
        }
        return m33095o(cFFDataInput, readCard8, i, cFFCIDFont);
    }

    /* renamed from: o */
    public static C9846h m33095o(CFFDataInput cFFDataInput, int i, int i2, CFFCIDFont cFFCIDFont) {
        C9846h c9846h = new C9846h(cFFCIDFont);
        c9846h.f59289a = i;
        c9846h.f59290b = new int[i2];
        for (int i3 = 0; i3 < c9846h.f59290b.length; i3++) {
            c9846h.f59290b[i3] = cFFDataInput.readCard8();
        }
        return c9846h;
    }

    /* renamed from: s */
    public static C9850l m33091s(CFFDataInput cFFDataInput, int i, int i2, CFFCIDFont cFFCIDFont) {
        C9850l c9850l = new C9850l(cFFCIDFont);
        c9850l.f59297a = i;
        c9850l.f59298b = cFFDataInput.readCard16();
        c9850l.f59299c = new C9852n[c9850l.f59298b];
        for (int i3 = 0; i3 < c9850l.f59298b; i3++) {
            C9852n c9852n = new C9852n();
            c9852n.f59305a = cFFDataInput.readCard16();
            c9852n.f59306b = cFFDataInput.readCard8();
            c9850l.f59299c[i3] = c9852n;
        }
        c9850l.f59300d = cFFDataInput.readCard16();
        return c9850l;
    }

    /* renamed from: t */
    public static C9851m m33090t(CFFDataInput cFFDataInput) {
        C9851m c9851m = new C9851m();
        c9851m.f59301a = cFFDataInput.readCard8();
        c9851m.f59302b = cFFDataInput.readCard8();
        c9851m.f59303c = cFFDataInput.readCard8();
        c9851m.f59304d = cFFDataInput.readOffSize();
        return c9851m;
    }

    /* renamed from: u */
    public static byte[][] m33089u(CFFDataInput cFFDataInput) {
        int[] m33088v = m33088v(cFFDataInput);
        if (m33088v == null) {
            return null;
        }
        int length = m33088v.length - 1;
        byte[][] bArr = new byte[length];
        int i = 0;
        while (i < length) {
            int i2 = i + 1;
            bArr[i] = cFFDataInput.readBytes(m33088v[i2] - m33088v[i]);
            i = i2;
        }
        return bArr;
    }

    /* renamed from: v */
    public static int[] m33088v(CFFDataInput cFFDataInput) {
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
    public static Integer m33087w(CFFDataInput cFFDataInput, int i) {
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
    public static long m33086x(CFFDataInput cFFDataInput) {
        return cFFDataInput.readCard16() | (cFFDataInput.readCard16() << 16);
    }

    /* renamed from: y */
    public static CFFOperator m33085y(CFFDataInput cFFDataInput, int i) {
        return CFFOperator.getOperator(m33084z(cFFDataInput, i));
    }

    /* renamed from: z */
    public static CFFOperator.Key m33084z(CFFDataInput cFFDataInput, int i) {
        if (i == 12) {
            return new CFFOperator.Key(i, cFFDataInput.readUnsignedByte());
        }
        return new CFFOperator.Key(i);
    }

    /* renamed from: A */
    public final Map m33115A(C9840c c9840c) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(17);
        linkedHashMap.put("BlueValues", c9840c.m33071d("BlueValues", null));
        linkedHashMap.put("OtherBlues", c9840c.m33071d("OtherBlues", null));
        linkedHashMap.put("FamilyBlues", c9840c.m33071d("FamilyBlues", null));
        linkedHashMap.put("FamilyOtherBlues", c9840c.m33071d("FamilyOtherBlues", null));
        linkedHashMap.put("BlueScale", c9840c.m33069f("BlueScale", Double.valueOf(0.039625d)));
        linkedHashMap.put("BlueShift", c9840c.m33069f("BlueShift", 7));
        linkedHashMap.put("BlueFuzz", c9840c.m33069f("BlueFuzz", 1));
        linkedHashMap.put(AFMParser.STD_HW, c9840c.m33069f(AFMParser.STD_HW, null));
        linkedHashMap.put(AFMParser.STD_VW, c9840c.m33069f(AFMParser.STD_VW, null));
        linkedHashMap.put("StemSnapH", c9840c.m33071d("StemSnapH", null));
        linkedHashMap.put("StemSnapV", c9840c.m33071d("StemSnapV", null));
        linkedHashMap.put("ForceBold", c9840c.m33072c("ForceBold", false));
        linkedHashMap.put("LanguageGroup", c9840c.m33069f("LanguageGroup", 0));
        linkedHashMap.put("ExpansionFactor", c9840c.m33069f("ExpansionFactor", Double.valueOf(0.06d)));
        linkedHashMap.put("initialRandomSeed", c9840c.m33069f("initialRandomSeed", 0));
        linkedHashMap.put("defaultWidthX", c9840c.m33069f("defaultWidthX", 0));
        linkedHashMap.put("nominalWidthX", c9840c.m33069f("nominalWidthX", 0));
        return linkedHashMap;
    }

    /* renamed from: C */
    public final String m33113C(int i) {
        if (i >= 0 && i <= 390) {
            return CFFStandardString.getName(i);
        }
        int i2 = i - 391;
        String[] strArr = this.f59275a;
        if (i2 < strArr.length) {
            return strArr[i2];
        }
        return "SID" + i;
    }

    /* renamed from: E */
    public final void m33111E(CFFDataInput cFFDataInput, AbstractC9838b abstractC9838b) {
        abstractC9838b.f59278a = cFFDataInput.readCard8();
        abstractC9838b.f59279b = new AbstractC9838b.C9839a[abstractC9838b.f59278a];
        for (int i = 0; i < abstractC9838b.f59279b.length; i++) {
            AbstractC9838b.C9839a c9839a = new AbstractC9838b.C9839a();
            c9839a.f59280a = cFFDataInput.readCard8();
            c9839a.f59281b = cFFDataInput.readSID();
            c9839a.f59282c = m33113C(c9839a.f59281b);
            abstractC9838b.f59279b[i] = c9839a;
            abstractC9838b.add(c9839a.f59280a, c9839a.f59281b, m33113C(c9839a.f59281b));
        }
    }

    /* renamed from: a */
    public final void m33109a(List list, List list2) {
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
    public final CFFDataInput m33108b(CFFDataInput cFFDataInput, byte[] bArr) {
        short readShort = cFFDataInput.readShort();
        cFFDataInput.readShort();
        cFFDataInput.readShort();
        cFFDataInput.readShort();
        for (int i = 0; i < readShort; i++) {
            String m33110F = m33110F(cFFDataInput);
            m33086x(cFFDataInput);
            long m33086x = m33086x(cFFDataInput);
            long m33086x2 = m33086x(cFFDataInput);
            if (CFFTable.TAG.equals(m33110F)) {
                return new CFFDataInput(Arrays.copyOfRange(bArr, (int) m33086x, (int) (m33086x + m33086x2)));
            }
        }
        throw new IOException("CFF tag not found in this OpenType font.");
    }

    /* renamed from: c */
    public final String m33107c(C9840c c9840c, String str) {
        C9840c.C9841a m33070e = c9840c.m33070e(str);
        if (m33070e != null && m33070e.m33061h()) {
            return m33113C(m33070e.m33062g(0).intValue());
        }
        return null;
    }

    /* renamed from: d */
    public final void m33106d(CFFDataInput cFFDataInput, C9840c c9840c, CFFCIDFont cFFCIDFont, int i) {
        C9840c.C9841a m33070e = c9840c.m33070e("FDArray");
        if (m33070e != null && m33070e.m33061h()) {
            cFFDataInput.setPosition(m33070e.m33062g(0).intValue());
            byte[][] m33089u = m33089u(cFFDataInput);
            if (m33089u != null) {
                LinkedList linkedList = new LinkedList();
                LinkedList linkedList2 = new LinkedList();
                for (byte[] bArr : m33089u) {
                    C9840c m33102h = m33102h(new CFFDataInput(bArr));
                    C9840c.C9841a m33070e2 = m33102h.m33070e(StandardStructureTypes.PRIVATE);
                    if (m33070e2 != null && m33070e2.m33060i() >= 2) {
                        LinkedHashMap linkedHashMap = new LinkedHashMap(4);
                        linkedHashMap.put(AFMParser.FONT_NAME, m33107c(m33102h, AFMParser.FONT_NAME));
                        linkedHashMap.put("FontType", m33102h.m33069f("FontType", 0));
                        linkedHashMap.put(AFMParser.FONT_BBOX, m33102h.m33073b(AFMParser.FONT_BBOX, null));
                        linkedHashMap.put("FontMatrix", m33102h.m33073b("FontMatrix", null));
                        linkedList2.add(linkedHashMap);
                        int intValue = m33070e2.m33062g(1).intValue();
                        cFFDataInput.setPosition(intValue);
                        C9840c m33101i = m33101i(cFFDataInput, m33070e2.m33062g(0).intValue());
                        Map m33115A = m33115A(m33101i);
                        linkedList.add(m33115A);
                        Number m33069f = m33101i.m33069f("Subrs", 0);
                        if (m33069f instanceof Integer) {
                            Integer num = (Integer) m33069f;
                            if (num.intValue() > 0) {
                                cFFDataInput.setPosition(intValue + num.intValue());
                                m33115A.put("Subrs", m33089u(cFFDataInput));
                            }
                        }
                    } else {
                        throw new IOException("Font DICT invalid without \"Private\" entry");
                    }
                }
                C9840c.C9841a m33070e3 = c9840c.m33070e("FDSelect");
                if (m33070e3 != null && m33070e3.m33061h()) {
                    cFFDataInput.setPosition(m33070e3.m33062g(0).intValue());
                    FDSelect m33098l = m33098l(cFFDataInput, i, cFFCIDFont);
                    cFFCIDFont.m33131j(linkedList2);
                    cFFCIDFont.m33129l(linkedList);
                    cFFCIDFont.m33132i(m33098l);
                    return;
                }
                throw new IOException("FDSelect is missing or empty");
            }
            throw new IOException("Font dict index is missing for a CIDKeyed Font");
        }
        throw new IOException("FDArray is missing for a CIDKeyed Font.");
    }

    /* renamed from: e */
    public final CFFFont m33105e(CFFDataInput cFFDataInput, String str, byte[] bArr) {
        boolean z;
        CFFCIDFont cFFCIDFont;
        CFFCharset cFFISOAdobeCharset;
        List list;
        List list2;
        C9840c m33102h = m33102h(new CFFDataInput(bArr));
        if (m33102h.m33070e("SyntheticBase") == null) {
            if (m33102h.m33070e("ROS") != null) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                CFFCIDFont cFFCIDFont2 = new CFFCIDFont();
                C9840c.C9841a m33070e = m33102h.m33070e("ROS");
                if (m33070e != null && m33070e.m33060i() >= 3) {
                    cFFCIDFont2.m33128m(m33113C(m33070e.m33062g(0).intValue()));
                    cFFCIDFont2.m33130k(m33113C(m33070e.m33062g(1).intValue()));
                    cFFCIDFont2.m33127n(m33070e.m33062g(2).intValue());
                    cFFCIDFont = cFFCIDFont2;
                } else {
                    throw new IOException("ROS entry must have 3 elements");
                }
            } else {
                cFFCIDFont = new CFFType1Font();
            }
            this.f59277c = str;
            cFFCIDFont.m33120d(str);
            cFFCIDFont.addValueToTopDict(ClientCookie.VERSION_ATTR, m33107c(m33102h, ClientCookie.VERSION_ATTR));
            cFFCIDFont.addValueToTopDict(AFMParser.NOTICE, m33107c(m33102h, AFMParser.NOTICE));
            cFFCIDFont.addValueToTopDict(ExifInterface.TAG_COPYRIGHT, m33107c(m33102h, ExifInterface.TAG_COPYRIGHT));
            cFFCIDFont.addValueToTopDict(AFMParser.FULL_NAME, m33107c(m33102h, AFMParser.FULL_NAME));
            cFFCIDFont.addValueToTopDict(AFMParser.FAMILY_NAME, m33107c(m33102h, AFMParser.FAMILY_NAME));
            cFFCIDFont.addValueToTopDict(AFMParser.WEIGHT, m33107c(m33102h, AFMParser.WEIGHT));
            cFFCIDFont.addValueToTopDict("isFixedPitch", m33102h.m33072c("isFixedPitch", false));
            cFFCIDFont.addValueToTopDict(AFMParser.ITALIC_ANGLE, m33102h.m33069f(AFMParser.ITALIC_ANGLE, 0));
            cFFCIDFont.addValueToTopDict(AFMParser.UNDERLINE_POSITION, m33102h.m33069f(AFMParser.UNDERLINE_POSITION, -100));
            cFFCIDFont.addValueToTopDict(AFMParser.UNDERLINE_THICKNESS, m33102h.m33069f(AFMParser.UNDERLINE_THICKNESS, 50));
            cFFCIDFont.addValueToTopDict("PaintType", m33102h.m33069f("PaintType", 0));
            cFFCIDFont.addValueToTopDict("CharstringType", m33102h.m33069f("CharstringType", 2));
            cFFCIDFont.addValueToTopDict("FontMatrix", m33102h.m33073b("FontMatrix", Arrays.asList(Double.valueOf(0.001d), Double.valueOf(0.0d), Double.valueOf(0.0d), Double.valueOf(0.001d), Double.valueOf(0.0d), Double.valueOf(0.0d))));
            cFFCIDFont.addValueToTopDict("UniqueID", m33102h.m33069f("UniqueID", null));
            cFFCIDFont.addValueToTopDict(AFMParser.FONT_BBOX, m33102h.m33073b(AFMParser.FONT_BBOX, Arrays.asList(0, 0, 0, 0)));
            cFFCIDFont.addValueToTopDict("StrokeWidth", m33102h.m33069f("StrokeWidth", 0));
            cFFCIDFont.addValueToTopDict("XUID", m33102h.m33073b("XUID", null));
            C9840c.C9841a m33070e2 = m33102h.m33070e("CharStrings");
            if (m33070e2 != null && m33070e2.m33061h()) {
                cFFDataInput.setPosition(m33070e2.m33062g(0).intValue());
                byte[][] m33089u = m33089u(cFFDataInput);
                C9840c.C9841a m33070e3 = m33102h.m33070e("charset");
                if (m33070e3 != null && m33070e3.m33061h()) {
                    int intValue = m33070e3.m33062g(0).intValue();
                    if (!z && intValue == 0) {
                        cFFISOAdobeCharset = CFFISOAdobeCharset.getInstance();
                    } else if (!z && intValue == 1) {
                        cFFISOAdobeCharset = CFFExpertCharset.getInstance();
                    } else if (!z && intValue == 2) {
                        cFFISOAdobeCharset = CFFExpertSubsetCharset.getInstance();
                    } else {
                        cFFDataInput.setPosition(intValue);
                        cFFISOAdobeCharset = m33103g(cFFDataInput, m33089u.length, z);
                    }
                } else if (z) {
                    cFFISOAdobeCharset = new C9843e(m33089u.length);
                } else {
                    cFFISOAdobeCharset = CFFISOAdobeCharset.getInstance();
                }
                cFFCIDFont.m33123a(cFFISOAdobeCharset);
                cFFCIDFont.charStrings = m33089u;
                if (z) {
                    CFFCIDFont cFFCIDFont3 = (CFFCIDFont) cFFCIDFont;
                    m33106d(cFFDataInput, m33102h, cFFCIDFont3, m33089u.length);
                    List<Map<String, Object>> fontDicts = cFFCIDFont3.getFontDicts();
                    if (!fontDicts.isEmpty() && fontDicts.get(0).containsKey("FontMatrix")) {
                        list2 = (List) fontDicts.get(0).get("FontMatrix");
                        list = null;
                    } else {
                        list = null;
                        list2 = null;
                    }
                    List m33073b = m33102h.m33073b("FontMatrix", list);
                    if (m33073b == null) {
                        if (list2 != null) {
                            cFFCIDFont.addValueToTopDict("FontMatrix", list2);
                        } else {
                            cFFCIDFont.addValueToTopDict("FontMatrix", m33102h.m33073b("FontMatrix", Arrays.asList(Double.valueOf(0.001d), Double.valueOf(0.0d), Double.valueOf(0.0d), Double.valueOf(0.001d), Double.valueOf(0.0d), Double.valueOf(0.0d))));
                        }
                    } else if (list2 != null) {
                        m33109a(m33073b, list2);
                    }
                } else {
                    m33104f(cFFDataInput, m33102h, cFFCIDFont, cFFISOAdobeCharset);
                }
                return cFFCIDFont;
            }
            throw new IOException("CharStrings is missing or empty");
        }
        throw new IOException("Synthetic Fonts are not supported");
    }

    /* renamed from: f */
    public final void m33104f(CFFDataInput cFFDataInput, C9840c c9840c, CFFType1Font cFFType1Font, CFFCharset cFFCharset) {
        int i;
        CFFEncoding cFFStandardEncoding;
        C9840c.C9841a m33070e = c9840c.m33070e("Encoding");
        if (m33070e != null && m33070e.m33061h()) {
            i = m33070e.m33062g(0).intValue();
        } else {
            i = 0;
        }
        if (i != 0) {
            if (i != 1) {
                cFFDataInput.setPosition(i);
                cFFStandardEncoding = m33100j(cFFDataInput, cFFCharset);
            } else {
                cFFStandardEncoding = CFFExpertEncoding.getInstance();
            }
        } else {
            cFFStandardEncoding = CFFStandardEncoding.getInstance();
        }
        cFFType1Font.m33019k(cFFStandardEncoding);
        C9840c.C9841a m33070e2 = c9840c.m33070e(StandardStructureTypes.PRIVATE);
        if (m33070e2 != null && m33070e2.m33060i() >= 2) {
            int intValue = m33070e2.m33062g(1).intValue();
            cFFDataInput.setPosition(intValue);
            C9840c m33101i = m33101i(cFFDataInput, m33070e2.m33062g(0).intValue());
            for (Map.Entry entry : m33115A(m33101i).entrySet()) {
                cFFType1Font.m33025e((String) entry.getKey(), entry.getValue());
            }
            Number m33069f = m33101i.m33069f("Subrs", 0);
            if (m33069f instanceof Integer) {
                Integer num = (Integer) m33069f;
                if (num.intValue() > 0) {
                    cFFDataInput.setPosition(intValue + num.intValue());
                    cFFType1Font.m33025e("Subrs", m33089u(cFFDataInput));
                    return;
                }
                return;
            }
            return;
        }
        throw new IOException("Private dictionary entry missing for font " + cFFType1Font.fontName);
    }

    /* renamed from: g */
    public final CFFCharset m33103g(CFFDataInput cFFDataInput, int i, boolean z) {
        int readCard8 = cFFDataInput.readCard8();
        if (readCard8 != 0) {
            if (readCard8 != 1) {
                if (readCard8 == 2) {
                    return m33092r(cFFDataInput, readCard8, i, z);
                }
                throw new IllegalArgumentException();
            }
            return m33094p(cFFDataInput, readCard8, i, z);
        }
        return m33097m(cFFDataInput, readCard8, i, z);
    }

    /* renamed from: j */
    public final CFFEncoding m33100j(CFFDataInput cFFDataInput, CFFCharset cFFCharset) {
        int readCard8 = cFFDataInput.readCard8();
        int i = readCard8 & 127;
        if (i != 0) {
            if (i == 1) {
                return m33093q(cFFDataInput, cFFCharset, readCard8);
            }
            throw new IllegalArgumentException();
        }
        return m33096n(cFFDataInput, cFFCharset, readCard8);
    }

    /* renamed from: m */
    public final C9844f m33097m(CFFDataInput cFFDataInput, int i, int i2, boolean z) {
        C9844f c9844f = new C9844f(z);
        c9844f.f59286g = i;
        if (z) {
            c9844f.addCID(0, 0);
        } else {
            c9844f.addSID(0, 0, ".notdef");
        }
        for (int i3 = 1; i3 < i2; i3++) {
            int readSID = cFFDataInput.readSID();
            if (z) {
                c9844f.addCID(i3, readSID);
            } else {
                c9844f.addSID(i3, readSID, m33113C(readSID));
            }
        }
        return c9844f;
    }

    /* renamed from: n */
    public final C9845g m33096n(CFFDataInput cFFDataInput, CFFCharset cFFCharset, int i) {
        C9845g c9845g = new C9845g();
        c9845g.f59287c = i;
        c9845g.f59288d = cFFDataInput.readCard8();
        c9845g.add(0, 0, ".notdef");
        for (int i2 = 1; i2 <= c9845g.f59288d; i2++) {
            int readCard8 = cFFDataInput.readCard8();
            int m33124c = cFFCharset.m33124c(i2);
            c9845g.add(readCard8, m33124c, m33113C(m33124c));
        }
        if ((i & 128) != 0) {
            m33111E(cFFDataInput, c9845g);
        }
        return c9845g;
    }

    /* renamed from: p */
    public final C9847i m33094p(CFFDataInput cFFDataInput, int i, int i2, boolean z) {
        C9847i c9847i = new C9847i(z);
        c9847i.f59291g = i;
        if (z) {
            c9847i.addCID(0, 0);
            c9847i.f59292h = new ArrayList();
        } else {
            c9847i.addSID(0, 0, ".notdef");
        }
        int i3 = 1;
        while (i3 < i2) {
            int readSID = cFFDataInput.readSID();
            int readCard8 = cFFDataInput.readCard8();
            if (!z) {
                for (int i4 = 0; i4 < readCard8 + 1; i4++) {
                    int i5 = readSID + i4;
                    c9847i.addSID(i3 + i4, i5, m33113C(i5));
                }
            } else {
                c9847i.f59292h.add(new C9853o(i3, readSID, readCard8));
            }
            i3 = i3 + readCard8 + 1;
        }
        return c9847i;
    }

    public List<CFFFont> parse(byte[] bArr, ByteSource byteSource) throws IOException {
        this.f59276b = byteSource;
        return parse(bArr);
    }

    /* renamed from: q */
    public final C9848j m33093q(CFFDataInput cFFDataInput, CFFCharset cFFCharset, int i) {
        C9848j c9848j = new C9848j();
        c9848j.f59293c = i;
        c9848j.f59294d = cFFDataInput.readCard8();
        c9848j.add(0, 0, ".notdef");
        int i2 = 1;
        for (int i3 = 0; i3 < c9848j.f59294d; i3++) {
            int readCard8 = cFFDataInput.readCard8();
            int readCard82 = cFFDataInput.readCard8();
            for (int i4 = 0; i4 <= readCard82; i4++) {
                int m33124c = cFFCharset.m33124c(i2);
                c9848j.add(readCard8 + i4, m33124c, m33113C(m33124c));
                i2++;
            }
        }
        if ((i & 128) != 0) {
            m33111E(cFFDataInput, c9848j);
        }
        return c9848j;
    }

    /* renamed from: r */
    public final C9849k m33092r(CFFDataInput cFFDataInput, int i, int i2, boolean z) {
        C9849k c9849k = new C9849k(z);
        c9849k.f59295g = i;
        if (z) {
            c9849k.addCID(0, 0);
            c9849k.f59296h = new ArrayList();
        } else {
            c9849k.addSID(0, 0, ".notdef");
        }
        int i3 = 1;
        while (i3 < i2) {
            int readSID = cFFDataInput.readSID();
            int readCard16 = cFFDataInput.readCard16();
            if (!z) {
                for (int i4 = 0; i4 < readCard16 + 1; i4++) {
                    int i5 = readSID + i4;
                    c9849k.addSID(i3 + i4, i5, m33113C(i5));
                }
            } else {
                c9849k.f59296h.add(new C9853o(i3, readSID, readCard16));
            }
            i3 = i3 + readCard16 + 1;
        }
        return c9849k;
    }

    public String toString() {
        return getClass().getSimpleName() + "[" + this.f59277c + "]";
    }

    public List<CFFFont> parse(byte[] bArr) throws IOException {
        CFFDataInput cFFDataInput = new CFFDataInput(bArr);
        String m33110F = m33110F(cFFDataInput);
        if ("OTTO".equals(m33110F)) {
            cFFDataInput = m33108b(cFFDataInput, bArr);
        } else if (!"ttcf".equals(m33110F)) {
            if (!"\u0000\u0001\u0000\u0000".equals(m33110F)) {
                cFFDataInput.setPosition(0);
            } else {
                throw new IOException("OpenType fonts containing a true type font are not supported.");
            }
        } else {
            throw new IOException("True Type Collection fonts are not supported.");
        }
        m33090t(cFFDataInput);
        String[] m33112D = m33112D(cFFDataInput);
        if (m33112D != null) {
            byte[][] m33089u = m33089u(cFFDataInput);
            this.f59275a = m33112D(cFFDataInput);
            byte[][] m33089u2 = m33089u(cFFDataInput);
            ArrayList arrayList = new ArrayList(m33112D.length);
            for (int i = 0; i < m33112D.length; i++) {
                CFFFont m33105e = m33105e(cFFDataInput, m33112D[i], m33089u[i]);
                m33105e.m33121c(m33089u2);
                m33105e.m33122b(this.f59276b);
                arrayList.add(m33105e);
            }
            return arrayList;
        }
        throw new IOException("Name index missing in CFF font");
    }
}