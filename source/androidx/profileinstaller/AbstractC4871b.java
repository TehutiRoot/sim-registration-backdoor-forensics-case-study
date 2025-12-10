package androidx.profileinstaller;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Map;
import java.util.TreeMap;

/* renamed from: androidx.profileinstaller.b */
/* loaded from: classes2.dex */
public abstract class AbstractC4871b {

    /* renamed from: a */
    public static final byte[] f36546a = {112, 114, 111, 0};

    /* renamed from: b */
    public static final byte[] f36547b = {112, 114, 109, 0};

    /* renamed from: A */
    public static void m53710A(InputStream inputStream) {
        AbstractC13924sS.m22610h(inputStream);
        int m22608j = AbstractC13924sS.m22608j(inputStream);
        if (m22608j == 6 || m22608j == 7) {
            return;
        }
        while (m22608j > 0) {
            AbstractC13924sS.m22608j(inputStream);
            for (int m22608j2 = AbstractC13924sS.m22608j(inputStream); m22608j2 > 0; m22608j2--) {
                AbstractC13924sS.m22610h(inputStream);
            }
            m22608j--;
        }
    }

    /* renamed from: B */
    public static boolean m53709B(OutputStream outputStream, byte[] bArr, C1089PI[] c1089piArr) {
        if (Arrays.equals(bArr, ProfileVersion.f36539a)) {
            m53697N(outputStream, c1089piArr);
            return true;
        } else if (Arrays.equals(bArr, ProfileVersion.f36540b)) {
            m53698M(outputStream, c1089piArr);
            return true;
        } else if (Arrays.equals(bArr, ProfileVersion.f36542d)) {
            m53700K(outputStream, c1089piArr);
            return true;
        } else if (Arrays.equals(bArr, ProfileVersion.f36541c)) {
            m53699L(outputStream, c1089piArr);
            return true;
        } else if (Arrays.equals(bArr, ProfileVersion.f36543e)) {
            m53701J(outputStream, c1089piArr);
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: C */
    public static void m53708C(OutputStream outputStream, C1089PI c1089pi) {
        int[] iArr = c1089pi.f4710h;
        int length = iArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int i3 = iArr[i];
            AbstractC13924sS.m22602p(outputStream, i3 - i2);
            i++;
            i2 = i3;
        }
    }

    /* renamed from: D */
    public static C4872c m53707D(C1089PI[] c1089piArr) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            AbstractC13924sS.m22602p(byteArrayOutputStream, c1089piArr.length);
            int i = 2;
            for (C1089PI c1089pi : c1089piArr) {
                AbstractC13924sS.m22601q(byteArrayOutputStream, c1089pi.f4705c);
                AbstractC13924sS.m22601q(byteArrayOutputStream, c1089pi.f4706d);
                AbstractC13924sS.m22601q(byteArrayOutputStream, c1089pi.f4709g);
                String m53686j = m53686j(c1089pi.f4703a, c1089pi.f4704b, ProfileVersion.f36539a);
                int m22607k = AbstractC13924sS.m22607k(m53686j);
                AbstractC13924sS.m22602p(byteArrayOutputStream, m22607k);
                i = i + 14 + m22607k;
                AbstractC13924sS.m22604n(byteArrayOutputStream, m53686j);
            }
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            if (i == byteArray.length) {
                C4872c c4872c = new C4872c(FileSectionType.DEX_FILES, i, byteArray, false);
                byteArrayOutputStream.close();
                return c4872c;
            }
            throw AbstractC13924sS.m22615c("Expected size " + i + ", does not match actual size " + byteArray.length);
        } catch (Throwable th2) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    /* renamed from: E */
    public static void m53706E(OutputStream outputStream, byte[] bArr) {
        outputStream.write(f36546a);
        outputStream.write(bArr);
    }

    /* renamed from: F */
    public static void m53705F(OutputStream outputStream, C1089PI c1089pi) {
        m53702I(outputStream, c1089pi);
        m53708C(outputStream, c1089pi);
        m53703H(outputStream, c1089pi);
    }

    /* renamed from: G */
    public static void m53704G(OutputStream outputStream, C1089PI c1089pi, String str) {
        AbstractC13924sS.m22602p(outputStream, AbstractC13924sS.m22607k(str));
        AbstractC13924sS.m22602p(outputStream, c1089pi.f4707e);
        AbstractC13924sS.m22601q(outputStream, c1089pi.f4708f);
        AbstractC13924sS.m22601q(outputStream, c1089pi.f4705c);
        AbstractC13924sS.m22601q(outputStream, c1089pi.f4709g);
        AbstractC13924sS.m22604n(outputStream, str);
    }

    /* renamed from: H */
    public static void m53703H(OutputStream outputStream, C1089PI c1089pi) {
        byte[] bArr = new byte[m53685k(c1089pi.f4709g)];
        for (Map.Entry entry : c1089pi.f4711i.entrySet()) {
            int intValue = ((Integer) entry.getKey()).intValue();
            int intValue2 = ((Integer) entry.getValue()).intValue();
            if ((intValue2 & 2) != 0) {
                m53670z(bArr, 2, intValue, c1089pi);
            }
            if ((intValue2 & 4) != 0) {
                m53670z(bArr, 4, intValue, c1089pi);
            }
        }
        outputStream.write(bArr);
    }

    /* renamed from: I */
    public static void m53702I(OutputStream outputStream, C1089PI c1089pi) {
        int i = 0;
        for (Map.Entry entry : c1089pi.f4711i.entrySet()) {
            int intValue = ((Integer) entry.getKey()).intValue();
            if ((((Integer) entry.getValue()).intValue() & 1) != 0) {
                AbstractC13924sS.m22602p(outputStream, intValue - i);
                AbstractC13924sS.m22602p(outputStream, 0);
                i = intValue;
            }
        }
    }

    /* renamed from: J */
    public static void m53701J(OutputStream outputStream, C1089PI[] c1089piArr) {
        AbstractC13924sS.m22602p(outputStream, c1089piArr.length);
        for (C1089PI c1089pi : c1089piArr) {
            String m53686j = m53686j(c1089pi.f4703a, c1089pi.f4704b, ProfileVersion.f36543e);
            AbstractC13924sS.m22602p(outputStream, AbstractC13924sS.m22607k(m53686j));
            AbstractC13924sS.m22602p(outputStream, c1089pi.f4711i.size());
            AbstractC13924sS.m22602p(outputStream, c1089pi.f4710h.length);
            AbstractC13924sS.m22601q(outputStream, c1089pi.f4705c);
            AbstractC13924sS.m22604n(outputStream, m53686j);
            for (Integer num : c1089pi.f4711i.keySet()) {
                AbstractC13924sS.m22602p(outputStream, num.intValue());
            }
            for (int i : c1089pi.f4710h) {
                AbstractC13924sS.m22602p(outputStream, i);
            }
        }
    }

    /* renamed from: K */
    public static void m53700K(OutputStream outputStream, C1089PI[] c1089piArr) {
        AbstractC13924sS.m22600r(outputStream, c1089piArr.length);
        for (C1089PI c1089pi : c1089piArr) {
            String m53686j = m53686j(c1089pi.f4703a, c1089pi.f4704b, ProfileVersion.f36542d);
            AbstractC13924sS.m22602p(outputStream, AbstractC13924sS.m22607k(m53686j));
            AbstractC13924sS.m22602p(outputStream, c1089pi.f4710h.length);
            AbstractC13924sS.m22601q(outputStream, c1089pi.f4711i.size() * 4);
            AbstractC13924sS.m22601q(outputStream, c1089pi.f4705c);
            AbstractC13924sS.m22604n(outputStream, m53686j);
            for (Integer num : c1089pi.f4711i.keySet()) {
                AbstractC13924sS.m22602p(outputStream, num.intValue());
                AbstractC13924sS.m22602p(outputStream, 0);
            }
            for (int i : c1089pi.f4710h) {
                AbstractC13924sS.m22602p(outputStream, i);
            }
        }
    }

    /* renamed from: L */
    public static void m53699L(OutputStream outputStream, C1089PI[] c1089piArr) {
        byte[] m53694b = m53694b(c1089piArr, ProfileVersion.f36541c);
        AbstractC13924sS.m22600r(outputStream, c1089piArr.length);
        AbstractC13924sS.m22605m(outputStream, m53694b);
    }

    /* renamed from: M */
    public static void m53698M(OutputStream outputStream, C1089PI[] c1089piArr) {
        byte[] m53694b = m53694b(c1089piArr, ProfileVersion.f36540b);
        AbstractC13924sS.m22600r(outputStream, c1089piArr.length);
        AbstractC13924sS.m22605m(outputStream, m53694b);
    }

    /* renamed from: N */
    public static void m53697N(OutputStream outputStream, C1089PI[] c1089piArr) {
        m53696O(outputStream, c1089piArr);
    }

    /* renamed from: O */
    public static void m53696O(OutputStream outputStream, C1089PI[] c1089piArr) {
        int length;
        ArrayList arrayList = new ArrayList(3);
        ArrayList arrayList2 = new ArrayList(3);
        arrayList.add(m53707D(c1089piArr));
        arrayList.add(m53693c(c1089piArr));
        arrayList.add(m53692d(c1089piArr));
        long length2 = ProfileVersion.f36539a.length + f36546a.length + 4 + (arrayList.size() * 16);
        AbstractC13924sS.m22601q(outputStream, arrayList.size());
        for (int i = 0; i < arrayList.size(); i++) {
            C4872c c4872c = (C4872c) arrayList.get(i);
            AbstractC13924sS.m22601q(outputStream, c4872c.f36548a.getValue());
            AbstractC13924sS.m22601q(outputStream, length2);
            if (c4872c.f36551d) {
                byte[] bArr = c4872c.f36550c;
                byte[] m22616b = AbstractC13924sS.m22616b(bArr);
                arrayList2.add(m22616b);
                AbstractC13924sS.m22601q(outputStream, m22616b.length);
                AbstractC13924sS.m22601q(outputStream, bArr.length);
                length = m22616b.length;
            } else {
                arrayList2.add(c4872c.f36550c);
                AbstractC13924sS.m22601q(outputStream, c4872c.f36550c.length);
                AbstractC13924sS.m22601q(outputStream, 0L);
                length = c4872c.f36550c.length;
            }
            length2 += length;
        }
        for (int i2 = 0; i2 < arrayList2.size(); i2++) {
            outputStream.write((byte[]) arrayList2.get(i2));
        }
    }

    /* renamed from: a */
    public static int m53695a(C1089PI c1089pi) {
        int i = 0;
        for (Map.Entry entry : c1089pi.f4711i.entrySet()) {
            i |= ((Integer) entry.getValue()).intValue();
        }
        return i;
    }

    /* renamed from: b */
    public static byte[] m53694b(C1089PI[] c1089piArr, byte[] bArr) {
        int i = 0;
        int i2 = 0;
        for (C1089PI c1089pi : c1089piArr) {
            i2 += AbstractC13924sS.m22607k(m53686j(c1089pi.f4703a, c1089pi.f4704b, bArr)) + 16 + (c1089pi.f4707e * 2) + c1089pi.f4708f + m53685k(c1089pi.f4709g);
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(i2);
        if (Arrays.equals(bArr, ProfileVersion.f36541c)) {
            int length = c1089piArr.length;
            while (i < length) {
                C1089PI c1089pi2 = c1089piArr[i];
                m53704G(byteArrayOutputStream, c1089pi2, m53686j(c1089pi2.f4703a, c1089pi2.f4704b, bArr));
                m53705F(byteArrayOutputStream, c1089pi2);
                i++;
            }
        } else {
            for (C1089PI c1089pi3 : c1089piArr) {
                m53704G(byteArrayOutputStream, c1089pi3, m53686j(c1089pi3.f4703a, c1089pi3.f4704b, bArr));
            }
            int length2 = c1089piArr.length;
            while (i < length2) {
                m53705F(byteArrayOutputStream, c1089piArr[i]);
                i++;
            }
        }
        if (byteArrayOutputStream.size() == i2) {
            return byteArrayOutputStream.toByteArray();
        }
        throw AbstractC13924sS.m22615c("The bytes saved do not match expectation. actual=" + byteArrayOutputStream.size() + " expected=" + i2);
    }

    /* renamed from: c */
    public static C4872c m53693c(C1089PI[] c1089piArr) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i = 0;
        for (int i2 = 0; i2 < c1089piArr.length; i2++) {
            try {
                C1089PI c1089pi = c1089piArr[i2];
                AbstractC13924sS.m22602p(byteArrayOutputStream, i2);
                AbstractC13924sS.m22602p(byteArrayOutputStream, c1089pi.f4707e);
                i = i + 4 + (c1089pi.f4707e * 2);
                m53708C(byteArrayOutputStream, c1089pi);
            } catch (Throwable th2) {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        if (i == byteArray.length) {
            C4872c c4872c = new C4872c(FileSectionType.CLASSES, i, byteArray, true);
            byteArrayOutputStream.close();
            return c4872c;
        }
        throw AbstractC13924sS.m22615c("Expected size " + i + ", does not match actual size " + byteArray.length);
    }

    /* renamed from: d */
    public static C4872c m53692d(C1089PI[] c1089piArr) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i = 0;
        for (int i2 = 0; i2 < c1089piArr.length; i2++) {
            try {
                C1089PI c1089pi = c1089piArr[i2];
                int m53695a = m53695a(c1089pi);
                byte[] m53691e = m53691e(c1089pi);
                byte[] m53690f = m53690f(c1089pi);
                AbstractC13924sS.m22602p(byteArrayOutputStream, i2);
                int length = m53691e.length + 2 + m53690f.length;
                AbstractC13924sS.m22601q(byteArrayOutputStream, length);
                AbstractC13924sS.m22602p(byteArrayOutputStream, m53695a);
                byteArrayOutputStream.write(m53691e);
                byteArrayOutputStream.write(m53690f);
                i = i + 6 + length;
            } catch (Throwable th2) {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        if (i == byteArray.length) {
            C4872c c4872c = new C4872c(FileSectionType.METHODS, i, byteArray, true);
            byteArrayOutputStream.close();
            return c4872c;
        }
        throw AbstractC13924sS.m22615c("Expected size " + i + ", does not match actual size " + byteArray.length);
    }

    /* renamed from: e */
    public static byte[] m53691e(C1089PI c1089pi) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            m53703H(byteArrayOutputStream, c1089pi);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            return byteArray;
        } catch (Throwable th2) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    /* renamed from: f */
    public static byte[] m53690f(C1089PI c1089pi) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            m53702I(byteArrayOutputStream, c1089pi);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            return byteArray;
        } catch (Throwable th2) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    /* renamed from: g */
    public static String m53689g(String str, String str2) {
        if ("!".equals(str2)) {
            return str.replace(":", "!");
        }
        if (":".equals(str2)) {
            return str.replace("!", ":");
        }
        return str;
    }

    /* renamed from: h */
    public static String m53688h(String str) {
        int indexOf = str.indexOf("!");
        if (indexOf < 0) {
            indexOf = str.indexOf(":");
        }
        if (indexOf > 0) {
            return str.substring(indexOf + 1);
        }
        return str;
    }

    /* renamed from: i */
    public static C1089PI m53687i(C1089PI[] c1089piArr, String str) {
        if (c1089piArr.length <= 0) {
            return null;
        }
        String m53688h = m53688h(str);
        for (int i = 0; i < c1089piArr.length; i++) {
            if (c1089piArr[i].f4704b.equals(m53688h)) {
                return c1089piArr[i];
            }
        }
        return null;
    }

    /* renamed from: j */
    public static String m53686j(String str, String str2, byte[] bArr) {
        String m53715a = ProfileVersion.m53715a(bArr);
        if (str.length() <= 0) {
            return m53689g(str2, m53715a);
        }
        if (str2.equals("classes.dex")) {
            return str;
        }
        if (!str2.contains("!") && !str2.contains(":")) {
            if (str2.endsWith(".apk")) {
                return str2;
            }
            return str + ProfileVersion.m53715a(bArr) + str2;
        }
        return m53689g(str2, m53715a);
    }

    /* renamed from: k */
    public static int m53685k(int i) {
        return m53671y(i * 2) / 8;
    }

    /* renamed from: l */
    public static int m53684l(int i, int i2, int i3) {
        if (i != 1) {
            if (i != 2) {
                if (i == 4) {
                    return i2 + i3;
                }
                throw AbstractC13924sS.m22615c("Unexpected flag: " + i);
            }
            return i2;
        }
        throw AbstractC13924sS.m22615c("HOT methods are not stored in the bitmap");
    }

    /* renamed from: m */
    public static int[] m53683m(InputStream inputStream, int i) {
        int[] iArr = new int[i];
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += AbstractC13924sS.m22610h(inputStream);
            iArr[i3] = i2;
        }
        return iArr;
    }

    /* renamed from: n */
    public static int m53682n(BitSet bitSet, int i, int i2) {
        int i3 = 2;
        if (!bitSet.get(m53684l(2, i, i2))) {
            i3 = 0;
        }
        if (bitSet.get(m53684l(4, i, i2))) {
            return i3 | 4;
        }
        return i3;
    }

    /* renamed from: o */
    public static byte[] m53681o(InputStream inputStream, byte[] bArr) {
        if (Arrays.equals(bArr, AbstractC13924sS.m22614d(inputStream, bArr.length))) {
            return AbstractC13924sS.m22614d(inputStream, ProfileVersion.f36540b.length);
        }
        throw AbstractC13924sS.m22615c("Invalid magic");
    }

    /* renamed from: p */
    public static void m53680p(InputStream inputStream, C1089PI c1089pi) {
        int available = inputStream.available() - c1089pi.f4708f;
        int i = 0;
        while (inputStream.available() > available) {
            i += AbstractC13924sS.m22610h(inputStream);
            c1089pi.f4711i.put(Integer.valueOf(i), 1);
            for (int m22610h = AbstractC13924sS.m22610h(inputStream); m22610h > 0; m22610h--) {
                m53710A(inputStream);
            }
        }
        if (inputStream.available() == available) {
            return;
        }
        throw AbstractC13924sS.m22615c("Read too much data during profile line parse");
    }

    /* renamed from: q */
    public static C1089PI[] m53679q(InputStream inputStream, byte[] bArr, byte[] bArr2, C1089PI[] c1089piArr) {
        if (Arrays.equals(bArr, ProfileVersion.f36544f)) {
            if (!Arrays.equals(ProfileVersion.f36539a, bArr2)) {
                return m53678r(inputStream, bArr, c1089piArr);
            }
            throw AbstractC13924sS.m22615c("Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher");
        } else if (Arrays.equals(bArr, ProfileVersion.f36545g)) {
            return m53676t(inputStream, bArr2, c1089piArr);
        } else {
            throw AbstractC13924sS.m22615c("Unsupported meta version");
        }
    }

    /* renamed from: r */
    public static C1089PI[] m53678r(InputStream inputStream, byte[] bArr, C1089PI[] c1089piArr) {
        if (Arrays.equals(bArr, ProfileVersion.f36544f)) {
            int m22608j = AbstractC13924sS.m22608j(inputStream);
            byte[] m22613e = AbstractC13924sS.m22613e(inputStream, (int) AbstractC13924sS.m22609i(inputStream), (int) AbstractC13924sS.m22609i(inputStream));
            if (inputStream.read() <= 0) {
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(m22613e);
                try {
                    C1089PI[] m53677s = m53677s(byteArrayInputStream, m22608j, c1089piArr);
                    byteArrayInputStream.close();
                    return m53677s;
                } catch (Throwable th2) {
                    try {
                        byteArrayInputStream.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            }
            throw AbstractC13924sS.m22615c("Content found after the end of file");
        }
        throw AbstractC13924sS.m22615c("Unsupported meta version");
    }

    /* renamed from: s */
    public static C1089PI[] m53677s(InputStream inputStream, int i, C1089PI[] c1089piArr) {
        if (inputStream.available() == 0) {
            return new C1089PI[0];
        }
        if (i == c1089piArr.length) {
            String[] strArr = new String[i];
            int[] iArr = new int[i];
            for (int i2 = 0; i2 < i; i2++) {
                int m22610h = AbstractC13924sS.m22610h(inputStream);
                iArr[i2] = AbstractC13924sS.m22610h(inputStream);
                strArr[i2] = AbstractC13924sS.m22612f(inputStream, m22610h);
            }
            for (int i3 = 0; i3 < i; i3++) {
                C1089PI c1089pi = c1089piArr[i3];
                if (c1089pi.f4704b.equals(strArr[i3])) {
                    int i4 = iArr[i3];
                    c1089pi.f4707e = i4;
                    c1089pi.f4710h = m53683m(inputStream, i4);
                } else {
                    throw AbstractC13924sS.m22615c("Order of dexfiles in metadata did not match baseline");
                }
            }
            return c1089piArr;
        }
        throw AbstractC13924sS.m22615c("Mismatched number of dex files found in metadata");
    }

    /* renamed from: t */
    public static C1089PI[] m53676t(InputStream inputStream, byte[] bArr, C1089PI[] c1089piArr) {
        int m22610h = AbstractC13924sS.m22610h(inputStream);
        byte[] m22613e = AbstractC13924sS.m22613e(inputStream, (int) AbstractC13924sS.m22609i(inputStream), (int) AbstractC13924sS.m22609i(inputStream));
        if (inputStream.read() <= 0) {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(m22613e);
            try {
                C1089PI[] m53675u = m53675u(byteArrayInputStream, bArr, m22610h, c1089piArr);
                byteArrayInputStream.close();
                return m53675u;
            } catch (Throwable th2) {
                try {
                    byteArrayInputStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        }
        throw AbstractC13924sS.m22615c("Content found after the end of file");
    }

    /* renamed from: u */
    public static C1089PI[] m53675u(InputStream inputStream, byte[] bArr, int i, C1089PI[] c1089piArr) {
        if (inputStream.available() == 0) {
            return new C1089PI[0];
        }
        if (i == c1089piArr.length) {
            for (int i2 = 0; i2 < i; i2++) {
                AbstractC13924sS.m22610h(inputStream);
                String m22612f = AbstractC13924sS.m22612f(inputStream, AbstractC13924sS.m22610h(inputStream));
                long m22609i = AbstractC13924sS.m22609i(inputStream);
                int m22610h = AbstractC13924sS.m22610h(inputStream);
                C1089PI m53687i = m53687i(c1089piArr, m22612f);
                if (m53687i != null) {
                    m53687i.f4706d = m22609i;
                    int[] m53683m = m53683m(inputStream, m22610h);
                    if (Arrays.equals(bArr, ProfileVersion.f36543e)) {
                        m53687i.f4707e = m22610h;
                        m53687i.f4710h = m53683m;
                    }
                } else {
                    throw AbstractC13924sS.m22615c("Missing profile key: " + m22612f);
                }
            }
            return c1089piArr;
        }
        throw AbstractC13924sS.m22615c("Mismatched number of dex files found in metadata");
    }

    /* renamed from: v */
    public static void m53674v(InputStream inputStream, C1089PI c1089pi) {
        BitSet valueOf = BitSet.valueOf(AbstractC13924sS.m22614d(inputStream, AbstractC13924sS.m22617a(c1089pi.f4709g * 2)));
        int i = 0;
        while (true) {
            int i2 = c1089pi.f4709g;
            if (i < i2) {
                int m53682n = m53682n(valueOf, i, i2);
                if (m53682n != 0) {
                    Integer num = (Integer) c1089pi.f4711i.get(Integer.valueOf(i));
                    if (num == null) {
                        num = 0;
                    }
                    c1089pi.f4711i.put(Integer.valueOf(i), Integer.valueOf(m53682n | num.intValue()));
                }
                i++;
            } else {
                return;
            }
        }
    }

    /* renamed from: w */
    public static C1089PI[] m53673w(InputStream inputStream, byte[] bArr, String str) {
        if (Arrays.equals(bArr, ProfileVersion.f36540b)) {
            int m22608j = AbstractC13924sS.m22608j(inputStream);
            byte[] m22613e = AbstractC13924sS.m22613e(inputStream, (int) AbstractC13924sS.m22609i(inputStream), (int) AbstractC13924sS.m22609i(inputStream));
            if (inputStream.read() <= 0) {
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(m22613e);
                try {
                    C1089PI[] m53672x = m53672x(byteArrayInputStream, str, m22608j);
                    byteArrayInputStream.close();
                    return m53672x;
                } catch (Throwable th2) {
                    try {
                        byteArrayInputStream.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            }
            throw AbstractC13924sS.m22615c("Content found after the end of file");
        }
        throw AbstractC13924sS.m22615c("Unsupported version");
    }

    /* renamed from: x */
    public static C1089PI[] m53672x(InputStream inputStream, String str, int i) {
        if (inputStream.available() == 0) {
            return new C1089PI[0];
        }
        C1089PI[] c1089piArr = new C1089PI[i];
        for (int i2 = 0; i2 < i; i2++) {
            int m22610h = AbstractC13924sS.m22610h(inputStream);
            int m22610h2 = AbstractC13924sS.m22610h(inputStream);
            long m22609i = AbstractC13924sS.m22609i(inputStream);
            c1089piArr[i2] = new C1089PI(str, AbstractC13924sS.m22612f(inputStream, m22610h), AbstractC13924sS.m22609i(inputStream), 0L, m22610h2, (int) m22609i, (int) AbstractC13924sS.m22609i(inputStream), new int[m22610h2], new TreeMap());
        }
        for (int i3 = 0; i3 < i; i3++) {
            C1089PI c1089pi = c1089piArr[i3];
            m53680p(inputStream, c1089pi);
            c1089pi.f4710h = m53683m(inputStream, c1089pi.f4707e);
            m53674v(inputStream, c1089pi);
        }
        return c1089piArr;
    }

    /* renamed from: y */
    public static int m53671y(int i) {
        return (i + 7) & (-8);
    }

    /* renamed from: z */
    public static void m53670z(byte[] bArr, int i, int i2, C1089PI c1089pi) {
        int m53684l = m53684l(i, i2, c1089pi.f4709g);
        int i3 = m53684l / 8;
        bArr[i3] = (byte) ((1 << (m53684l % 8)) | bArr[i3]);
    }
}
