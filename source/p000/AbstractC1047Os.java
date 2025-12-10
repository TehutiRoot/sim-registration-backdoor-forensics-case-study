package p000;

import android.content.Context;
import android.util.Pair;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import com.tom_roush.fontbox.ttf.OS2WindowsMetricsTable;
import java.io.ByteArrayOutputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: Os */
/* loaded from: classes4.dex */
public abstract class AbstractC1047Os {

    /* renamed from: a */
    public static byte f4534a;

    /* renamed from: b */
    public static final C1051d f4535b = new C1051d(1, "android");

    /* renamed from: c */
    public static final Comparator f4536c = new C1048a();

    /* renamed from: Os$a */
    /* loaded from: classes4.dex */
    public class C1048a implements Comparator {
        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(C1049b c1049b, C1049b c1049b2) {
            return c1049b.f4539c - c1049b2.f4539c;
        }
    }

    /* renamed from: Os$b */
    /* loaded from: classes4.dex */
    public static class C1049b {

        /* renamed from: a */
        public final byte f4537a;

        /* renamed from: b */
        public final byte f4538b;

        /* renamed from: c */
        public final short f4539c;

        /* renamed from: d */
        public final String f4540d;

        /* renamed from: e */
        public final int f4541e;

        public C1049b(int i, String str, int i2) {
            this.f4540d = str;
            this.f4541e = i2;
            this.f4539c = (short) (65535 & i);
            this.f4538b = (byte) ((i >> 16) & 255);
            this.f4537a = (byte) ((i >> 24) & 255);
        }
    }

    /* renamed from: Os$c */
    /* loaded from: classes4.dex */
    public static class C1050c {

        /* renamed from: a */
        public final C1052e f4542a;

        /* renamed from: b */
        public final C1051d f4543b;

        /* renamed from: c */
        public final C1055h f4544c = new C1055h(false, "?1", "?2", "?3", "?4", "?5", TypedValues.Custom.S_COLOR);

        /* renamed from: d */
        public final C1055h f4545d;

        /* renamed from: e */
        public final C1058k f4546e;

        public C1050c(C1051d c1051d, List list) {
            this.f4543b = c1051d;
            String[] strArr = new String[list.size()];
            for (int i = 0; i < list.size(); i++) {
                strArr[i] = ((C1049b) list.get(i)).f4540d;
            }
            this.f4545d = new C1055h(true, strArr);
            this.f4546e = new C1058k(list);
            this.f4542a = new C1052e(OS2WindowsMetricsTable.FSTYPE_BITMAP_ONLY, (short) 288, m66960a());
        }

        /* renamed from: a */
        public int m66960a() {
            return this.f4544c.m66952a() + 288 + this.f4545d.m66952a() + this.f4546e.m66943b();
        }

        /* renamed from: b */
        public void m66959b(ByteArrayOutputStream byteArrayOutputStream) {
            this.f4542a.m66956a(byteArrayOutputStream);
            byteArrayOutputStream.write(AbstractC1047Os.m66970j(this.f4543b.f4547a));
            char[] charArray = this.f4543b.f4548b.toCharArray();
            for (int i = 0; i < 128; i++) {
                if (i < charArray.length) {
                    byteArrayOutputStream.write(AbstractC1047Os.m66972h(charArray[i]));
                } else {
                    byteArrayOutputStream.write(AbstractC1047Os.m66972h((char) 0));
                }
            }
            byteArrayOutputStream.write(AbstractC1047Os.m66970j(288));
            byteArrayOutputStream.write(AbstractC1047Os.m66970j(0));
            byteArrayOutputStream.write(AbstractC1047Os.m66970j(this.f4544c.m66952a() + 288));
            byteArrayOutputStream.write(AbstractC1047Os.m66970j(0));
            byteArrayOutputStream.write(AbstractC1047Os.m66970j(0));
            this.f4544c.m66950c(byteArrayOutputStream);
            this.f4545d.m66950c(byteArrayOutputStream);
            this.f4546e.m66942c(byteArrayOutputStream);
        }
    }

    /* renamed from: Os$d */
    /* loaded from: classes4.dex */
    public static class C1051d {

        /* renamed from: a */
        public final int f4547a;

        /* renamed from: b */
        public final String f4548b;

        public C1051d(int i, String str) {
            this.f4547a = i;
            this.f4548b = str;
        }
    }

    /* renamed from: Os$e */
    /* loaded from: classes4.dex */
    public static class C1052e {

        /* renamed from: a */
        public final short f4549a;

        /* renamed from: b */
        public final short f4550b;

        /* renamed from: c */
        public final int f4551c;

        public C1052e(short s, short s2, int i) {
            this.f4549a = s;
            this.f4550b = s2;
            this.f4551c = i;
        }

        /* renamed from: a */
        public void m66956a(ByteArrayOutputStream byteArrayOutputStream) {
            byteArrayOutputStream.write(AbstractC1047Os.m66969k(this.f4549a));
            byteArrayOutputStream.write(AbstractC1047Os.m66969k(this.f4550b));
            byteArrayOutputStream.write(AbstractC1047Os.m66970j(this.f4551c));
        }
    }

    /* renamed from: Os$f */
    /* loaded from: classes4.dex */
    public static class C1053f {

        /* renamed from: a */
        public final int f4552a;

        /* renamed from: b */
        public final int f4553b;

        public C1053f(int i, int i2) {
            this.f4552a = i;
            this.f4553b = i2;
        }

        /* renamed from: a */
        public void m66955a(ByteArrayOutputStream byteArrayOutputStream) {
            byteArrayOutputStream.write(AbstractC1047Os.m66969k((short) 8));
            byteArrayOutputStream.write(AbstractC1047Os.m66969k((short) 2));
            byteArrayOutputStream.write(AbstractC1047Os.m66970j(this.f4552a));
            byteArrayOutputStream.write(AbstractC1047Os.m66969k((short) 8));
            byteArrayOutputStream.write(new byte[]{0, Ascii.f52686FS});
            byteArrayOutputStream.write(AbstractC1047Os.m66970j(this.f4553b));
        }
    }

    /* renamed from: Os$g */
    /* loaded from: classes4.dex */
    public static class C1054g {

        /* renamed from: a */
        public final C1052e f4554a;

        /* renamed from: b */
        public final int f4555b;

        /* renamed from: d */
        public final List f4557d = new ArrayList();

        /* renamed from: c */
        public final C1055h f4556c = new C1055h(new String[0]);

        public C1054g(Map map) {
            this.f4555b = map.size();
            for (Map.Entry entry : map.entrySet()) {
                List list = (List) entry.getValue();
                Collections.sort(list, AbstractC1047Os.f4536c);
                this.f4557d.add(new C1050c((C1051d) entry.getKey(), list));
            }
            this.f4554a = new C1052e((short) 2, (short) 12, m66954a());
        }

        /* renamed from: a */
        public final int m66954a() {
            int i = 0;
            for (C1050c c1050c : this.f4557d) {
                i += c1050c.m66960a();
            }
            return this.f4556c.m66952a() + 12 + i;
        }

        /* renamed from: b */
        public void m66953b(ByteArrayOutputStream byteArrayOutputStream) {
            this.f4554a.m66956a(byteArrayOutputStream);
            byteArrayOutputStream.write(AbstractC1047Os.m66970j(this.f4555b));
            this.f4556c.m66950c(byteArrayOutputStream);
            for (C1050c c1050c : this.f4557d) {
                c1050c.m66959b(byteArrayOutputStream);
            }
        }
    }

    /* renamed from: Os$h */
    /* loaded from: classes4.dex */
    public static class C1055h {

        /* renamed from: a */
        public final C1052e f4558a;

        /* renamed from: b */
        public final int f4559b;

        /* renamed from: c */
        public final int f4560c;

        /* renamed from: d */
        public final int f4561d;

        /* renamed from: e */
        public final int f4562e;

        /* renamed from: f */
        public final List f4563f;

        /* renamed from: g */
        public final List f4564g;

        /* renamed from: h */
        public final List f4565h;

        /* renamed from: i */
        public final List f4566i;

        /* renamed from: j */
        public final boolean f4567j;

        /* renamed from: k */
        public final int f4568k;

        /* renamed from: l */
        public final int f4569l;

        public C1055h(String... strArr) {
            this(false, strArr);
        }

        /* renamed from: a */
        public int m66952a() {
            return this.f4569l;
        }

        /* renamed from: b */
        public final Pair m66951b(String str) {
            return new Pair(this.f4567j ? AbstractC1047Os.m66967m(str) : AbstractC1047Os.m66968l(str), Collections.emptyList());
        }

        /* renamed from: c */
        public void m66950c(ByteArrayOutputStream byteArrayOutputStream) {
            int i;
            this.f4558a.m66956a(byteArrayOutputStream);
            byteArrayOutputStream.write(AbstractC1047Os.m66970j(this.f4559b));
            byteArrayOutputStream.write(AbstractC1047Os.m66970j(this.f4560c));
            if (this.f4567j) {
                i = 256;
            } else {
                i = 0;
            }
            byteArrayOutputStream.write(AbstractC1047Os.m66970j(i));
            byteArrayOutputStream.write(AbstractC1047Os.m66970j(this.f4561d));
            byteArrayOutputStream.write(AbstractC1047Os.m66970j(this.f4562e));
            for (Integer num : this.f4563f) {
                byteArrayOutputStream.write(AbstractC1047Os.m66970j(num.intValue()));
            }
            for (Integer num2 : this.f4564g) {
                byteArrayOutputStream.write(AbstractC1047Os.m66970j(num2.intValue()));
            }
            for (byte[] bArr : this.f4565h) {
                byteArrayOutputStream.write(bArr);
            }
            int i2 = this.f4568k;
            if (i2 > 0) {
                byteArrayOutputStream.write(new byte[i2]);
            }
            for (List list : this.f4566i) {
                Iterator it = list.iterator();
                if (!it.hasNext()) {
                    byteArrayOutputStream.write(AbstractC1047Os.m66970j(-1));
                } else {
                    AbstractC22494uj2.m1214a(it.next());
                    throw null;
                }
            }
        }

        public C1055h(boolean z, String... strArr) {
            this.f4563f = new ArrayList();
            this.f4564g = new ArrayList();
            this.f4565h = new ArrayList();
            this.f4566i = new ArrayList();
            this.f4567j = z;
            int i = 0;
            for (String str : strArr) {
                Pair m66951b = m66951b(str);
                this.f4563f.add(Integer.valueOf(i));
                Object obj = m66951b.first;
                i += ((byte[]) obj).length;
                this.f4565h.add((byte[]) obj);
                this.f4566i.add((List) m66951b.second);
            }
            int i2 = 0;
            for (List<Object> list : this.f4566i) {
                for (Object obj2 : list) {
                    AbstractC22494uj2.m1214a(obj2);
                    this.f4563f.add(Integer.valueOf(i));
                    i += C1056i.m66949a(null).length;
                    this.f4565h.add(C1056i.m66949a(null));
                }
                this.f4564g.add(Integer.valueOf(i2));
                i2 += (list.size() * 12) + 4;
            }
            int i3 = i % 4;
            int i4 = i3 == 0 ? 0 : 4 - i3;
            this.f4568k = i4;
            int size = this.f4565h.size();
            this.f4559b = size;
            this.f4560c = this.f4565h.size() - strArr.length;
            boolean z2 = this.f4565h.size() - strArr.length > 0;
            if (!z2) {
                this.f4564g.clear();
                this.f4566i.clear();
            }
            int size2 = (size * 4) + 28 + (this.f4564g.size() * 4);
            this.f4561d = size2;
            int i5 = i + i4;
            this.f4562e = z2 ? size2 + i5 : 0;
            int i6 = size2 + i5 + (z2 ? i2 : 0);
            this.f4569l = i6;
            this.f4558a = new C1052e((short) 1, (short) 28, i6);
        }
    }

    /* renamed from: Os$i */
    /* loaded from: classes4.dex */
    public static class C1056i {
        /* renamed from: a */
        public static /* synthetic */ byte[] m66949a(C1056i c1056i) {
            throw null;
        }
    }

    /* renamed from: Os$j */
    /* loaded from: classes4.dex */
    public static class C1057j {

        /* renamed from: a */
        public final C1052e f4570a;

        /* renamed from: b */
        public final int f4571b;

        /* renamed from: c */
        public final byte[] f4572c;

        /* renamed from: d */
        public final int[] f4573d;

        /* renamed from: e */
        public final C1053f[] f4574e;

        public C1057j(List list, Set set, int i) {
            byte[] bArr = new byte[64];
            this.f4572c = bArr;
            this.f4571b = i;
            bArr[0] = SignedBytes.MAX_POWER_OF_TWO;
            this.f4574e = new C1053f[list.size()];
            for (int i2 = 0; i2 < list.size(); i2++) {
                this.f4574e[i2] = new C1053f(i2, ((C1049b) list.get(i2)).f4541e);
            }
            this.f4573d = new int[i];
            int i3 = 0;
            for (short s = 0; s < i; s = (short) (s + 1)) {
                if (set.contains(Short.valueOf(s))) {
                    this.f4573d[s] = i3;
                    i3 += 16;
                } else {
                    this.f4573d[s] = -1;
                }
            }
            this.f4570a = new C1052e((short) 513, (short) 84, m66948a());
        }

        /* renamed from: a */
        public int m66948a() {
            return m66947b() + (this.f4574e.length * 16);
        }

        /* renamed from: b */
        public final int m66947b() {
            return m66946c() + 84;
        }

        /* renamed from: c */
        public final int m66946c() {
            return this.f4573d.length * 4;
        }

        /* renamed from: d */
        public void m66945d(ByteArrayOutputStream byteArrayOutputStream) {
            this.f4570a.m66956a(byteArrayOutputStream);
            byteArrayOutputStream.write(new byte[]{AbstractC1047Os.f4534a, 0, 0, 0});
            byteArrayOutputStream.write(AbstractC1047Os.m66970j(this.f4571b));
            byteArrayOutputStream.write(AbstractC1047Os.m66970j(m66947b()));
            byteArrayOutputStream.write(this.f4572c);
            for (int i : this.f4573d) {
                byteArrayOutputStream.write(AbstractC1047Os.m66970j(i));
            }
            for (C1053f c1053f : this.f4574e) {
                c1053f.m66955a(byteArrayOutputStream);
            }
        }
    }

    /* renamed from: Os$k */
    /* loaded from: classes4.dex */
    public static class C1058k {

        /* renamed from: a */
        public final C1052e f4575a;

        /* renamed from: b */
        public final int f4576b;

        /* renamed from: c */
        public final int[] f4577c;

        /* renamed from: d */
        public final C1057j f4578d;

        public C1058k(List list) {
            this.f4576b = ((C1049b) list.get(list.size() - 1)).f4539c + 1;
            HashSet hashSet = new HashSet();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                hashSet.add(Short.valueOf(((C1049b) it.next()).f4539c));
            }
            this.f4577c = new int[this.f4576b];
            for (short s = 0; s < this.f4576b; s = (short) (s + 1)) {
                if (hashSet.contains(Short.valueOf(s))) {
                    this.f4577c[s] = 1073741824;
                }
            }
            this.f4575a = new C1052e((short) 514, (short) 16, m66944a());
            this.f4578d = new C1057j(list, hashSet, this.f4576b);
        }

        /* renamed from: a */
        public final int m66944a() {
            return (this.f4576b * 4) + 16;
        }

        /* renamed from: b */
        public int m66943b() {
            return m66944a() + this.f4578d.m66948a();
        }

        /* renamed from: c */
        public void m66942c(ByteArrayOutputStream byteArrayOutputStream) {
            this.f4575a.m66956a(byteArrayOutputStream);
            byteArrayOutputStream.write(new byte[]{AbstractC1047Os.f4534a, 0, 0, 0});
            byteArrayOutputStream.write(AbstractC1047Os.m66970j(this.f4576b));
            for (int i : this.f4577c) {
                byteArrayOutputStream.write(AbstractC1047Os.m66970j(i));
            }
            this.f4578d.m66945d(byteArrayOutputStream);
        }
    }

    /* renamed from: h */
    public static byte[] m66972h(char c) {
        return new byte[]{(byte) (c & 255), (byte) ((c >> '\b') & 255)};
    }

    /* renamed from: i */
    public static byte[] m66971i(Context context, Map map) {
        C1051d c1051d;
        if (!map.entrySet().isEmpty()) {
            C1051d c1051d2 = new C1051d(127, context.getPackageName());
            HashMap hashMap = new HashMap();
            C1049b c1049b = null;
            for (Map.Entry entry : map.entrySet()) {
                C1049b c1049b2 = new C1049b(((Integer) entry.getKey()).intValue(), context.getResources().getResourceName(((Integer) entry.getKey()).intValue()), ((Integer) entry.getValue()).intValue());
                if (context.getResources().getResourceTypeName(((Integer) entry.getKey()).intValue()).equals(TypedValues.Custom.S_COLOR)) {
                    if (c1049b2.f4537a == 1) {
                        c1051d = f4535b;
                    } else if (c1049b2.f4537a == Byte.MAX_VALUE) {
                        c1051d = c1051d2;
                    } else {
                        throw new IllegalArgumentException("Not supported with unknown package id: " + ((int) c1049b2.f4537a));
                    }
                    if (!hashMap.containsKey(c1051d)) {
                        hashMap.put(c1051d, new ArrayList());
                    }
                    ((List) hashMap.get(c1051d)).add(c1049b2);
                    c1049b = c1049b2;
                } else {
                    throw new IllegalArgumentException("Non color resource found: name=" + c1049b2.f4540d + ", typeId=" + Integer.toHexString(c1049b2.f4538b & 255));
                }
            }
            byte b = c1049b.f4538b;
            f4534a = b;
            if (b != 0) {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                new C1054g(hashMap).m66953b(byteArrayOutputStream);
                return byteArrayOutputStream.toByteArray();
            }
            throw new IllegalArgumentException("No color resources found for harmonization.");
        }
        throw new IllegalArgumentException("No color resources provided for harmonization.");
    }

    /* renamed from: j */
    public static byte[] m66970j(int i) {
        return new byte[]{(byte) (i & 255), (byte) ((i >> 8) & 255), (byte) ((i >> 16) & 255), (byte) ((i >> 24) & 255)};
    }

    /* renamed from: k */
    public static byte[] m66969k(short s) {
        return new byte[]{(byte) (s & 255), (byte) ((s >> 8) & 255)};
    }

    /* renamed from: l */
    public static byte[] m66968l(String str) {
        char[] charArray = str.toCharArray();
        int length = charArray.length * 2;
        byte[] bArr = new byte[length + 4];
        byte[] m66969k = m66969k((short) charArray.length);
        bArr[0] = m66969k[0];
        bArr[1] = m66969k[1];
        for (int i = 0; i < charArray.length; i++) {
            byte[] m66972h = m66972h(charArray[i]);
            int i2 = i * 2;
            bArr[i2 + 2] = m66972h[0];
            bArr[i2 + 3] = m66972h[1];
        }
        bArr[length + 2] = 0;
        bArr[length + 3] = 0;
        return bArr;
    }

    /* renamed from: m */
    public static byte[] m66967m(String str) {
        byte[] bytes = str.getBytes(Charset.forName("UTF-8"));
        byte length = (byte) bytes.length;
        int length2 = bytes.length;
        byte[] bArr = new byte[length2 + 3];
        System.arraycopy(bytes, 0, bArr, 2, length);
        bArr[1] = length;
        bArr[0] = length;
        bArr[length2 + 2] = 0;
        return bArr;
    }
}
