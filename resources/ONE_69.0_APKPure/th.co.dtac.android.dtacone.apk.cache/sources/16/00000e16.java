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
public abstract class AbstractC1035Os {

    /* renamed from: a */
    public static byte f4552a;

    /* renamed from: b */
    public static final C1039d f4553b = new C1039d(1, "android");

    /* renamed from: c */
    public static final Comparator f4554c = new C1036a();

    /* renamed from: Os$a */
    /* loaded from: classes4.dex */
    public class C1036a implements Comparator {
        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(C1037b c1037b, C1037b c1037b2) {
            return c1037b.f4557c - c1037b2.f4557c;
        }
    }

    /* renamed from: Os$b */
    /* loaded from: classes4.dex */
    public static class C1037b {

        /* renamed from: a */
        public final byte f4555a;

        /* renamed from: b */
        public final byte f4556b;

        /* renamed from: c */
        public final short f4557c;

        /* renamed from: d */
        public final String f4558d;

        /* renamed from: e */
        public final int f4559e;

        public C1037b(int i, String str, int i2) {
            this.f4558d = str;
            this.f4559e = i2;
            this.f4557c = (short) (65535 & i);
            this.f4556b = (byte) ((i >> 16) & 255);
            this.f4555a = (byte) ((i >> 24) & 255);
        }
    }

    /* renamed from: Os$c */
    /* loaded from: classes4.dex */
    public static class C1038c {

        /* renamed from: a */
        public final C1040e f4560a;

        /* renamed from: b */
        public final C1039d f4561b;

        /* renamed from: c */
        public final C1043h f4562c = new C1043h(false, "?1", "?2", "?3", "?4", "?5", TypedValues.Custom.S_COLOR);

        /* renamed from: d */
        public final C1043h f4563d;

        /* renamed from: e */
        public final C1046k f4564e;

        public C1038c(C1039d c1039d, List list) {
            this.f4561b = c1039d;
            String[] strArr = new String[list.size()];
            for (int i = 0; i < list.size(); i++) {
                strArr[i] = ((C1037b) list.get(i)).f4558d;
            }
            this.f4563d = new C1043h(true, strArr);
            this.f4564e = new C1046k(list);
            this.f4560a = new C1040e(OS2WindowsMetricsTable.FSTYPE_BITMAP_ONLY, (short) 288, m67055a());
        }

        /* renamed from: a */
        public int m67055a() {
            return this.f4562c.m67047a() + 288 + this.f4563d.m67047a() + this.f4564e.m67038b();
        }

        /* renamed from: b */
        public void m67054b(ByteArrayOutputStream byteArrayOutputStream) {
            this.f4560a.m67051a(byteArrayOutputStream);
            byteArrayOutputStream.write(AbstractC1035Os.m67065j(this.f4561b.f4565a));
            char[] charArray = this.f4561b.f4566b.toCharArray();
            for (int i = 0; i < 128; i++) {
                if (i < charArray.length) {
                    byteArrayOutputStream.write(AbstractC1035Os.m67067h(charArray[i]));
                } else {
                    byteArrayOutputStream.write(AbstractC1035Os.m67067h((char) 0));
                }
            }
            byteArrayOutputStream.write(AbstractC1035Os.m67065j(288));
            byteArrayOutputStream.write(AbstractC1035Os.m67065j(0));
            byteArrayOutputStream.write(AbstractC1035Os.m67065j(this.f4562c.m67047a() + 288));
            byteArrayOutputStream.write(AbstractC1035Os.m67065j(0));
            byteArrayOutputStream.write(AbstractC1035Os.m67065j(0));
            this.f4562c.m67045c(byteArrayOutputStream);
            this.f4563d.m67045c(byteArrayOutputStream);
            this.f4564e.m67037c(byteArrayOutputStream);
        }
    }

    /* renamed from: Os$d */
    /* loaded from: classes4.dex */
    public static class C1039d {

        /* renamed from: a */
        public final int f4565a;

        /* renamed from: b */
        public final String f4566b;

        public C1039d(int i, String str) {
            this.f4565a = i;
            this.f4566b = str;
        }
    }

    /* renamed from: Os$e */
    /* loaded from: classes4.dex */
    public static class C1040e {

        /* renamed from: a */
        public final short f4567a;

        /* renamed from: b */
        public final short f4568b;

        /* renamed from: c */
        public final int f4569c;

        public C1040e(short s, short s2, int i) {
            this.f4567a = s;
            this.f4568b = s2;
            this.f4569c = i;
        }

        /* renamed from: a */
        public void m67051a(ByteArrayOutputStream byteArrayOutputStream) {
            byteArrayOutputStream.write(AbstractC1035Os.m67064k(this.f4567a));
            byteArrayOutputStream.write(AbstractC1035Os.m67064k(this.f4568b));
            byteArrayOutputStream.write(AbstractC1035Os.m67065j(this.f4569c));
        }
    }

    /* renamed from: Os$f */
    /* loaded from: classes4.dex */
    public static class C1041f {

        /* renamed from: a */
        public final int f4570a;

        /* renamed from: b */
        public final int f4571b;

        public C1041f(int i, int i2) {
            this.f4570a = i;
            this.f4571b = i2;
        }

        /* renamed from: a */
        public void m67050a(ByteArrayOutputStream byteArrayOutputStream) {
            byteArrayOutputStream.write(AbstractC1035Os.m67064k((short) 8));
            byteArrayOutputStream.write(AbstractC1035Os.m67064k((short) 2));
            byteArrayOutputStream.write(AbstractC1035Os.m67065j(this.f4570a));
            byteArrayOutputStream.write(AbstractC1035Os.m67064k((short) 8));
            byteArrayOutputStream.write(new byte[]{0, Ascii.f52698FS});
            byteArrayOutputStream.write(AbstractC1035Os.m67065j(this.f4571b));
        }
    }

    /* renamed from: Os$g */
    /* loaded from: classes4.dex */
    public static class C1042g {

        /* renamed from: a */
        public final C1040e f4572a;

        /* renamed from: b */
        public final int f4573b;

        /* renamed from: d */
        public final List f4575d = new ArrayList();

        /* renamed from: c */
        public final C1043h f4574c = new C1043h(new String[0]);

        public C1042g(Map map) {
            this.f4573b = map.size();
            for (Map.Entry entry : map.entrySet()) {
                List list = (List) entry.getValue();
                Collections.sort(list, AbstractC1035Os.f4554c);
                this.f4575d.add(new C1038c((C1039d) entry.getKey(), list));
            }
            this.f4572a = new C1040e((short) 2, (short) 12, m67049a());
        }

        /* renamed from: a */
        public final int m67049a() {
            int i = 0;
            for (C1038c c1038c : this.f4575d) {
                i += c1038c.m67055a();
            }
            return this.f4574c.m67047a() + 12 + i;
        }

        /* renamed from: b */
        public void m67048b(ByteArrayOutputStream byteArrayOutputStream) {
            this.f4572a.m67051a(byteArrayOutputStream);
            byteArrayOutputStream.write(AbstractC1035Os.m67065j(this.f4573b));
            this.f4574c.m67045c(byteArrayOutputStream);
            for (C1038c c1038c : this.f4575d) {
                c1038c.m67054b(byteArrayOutputStream);
            }
        }
    }

    /* renamed from: Os$h */
    /* loaded from: classes4.dex */
    public static class C1043h {

        /* renamed from: a */
        public final C1040e f4576a;

        /* renamed from: b */
        public final int f4577b;

        /* renamed from: c */
        public final int f4578c;

        /* renamed from: d */
        public final int f4579d;

        /* renamed from: e */
        public final int f4580e;

        /* renamed from: f */
        public final List f4581f;

        /* renamed from: g */
        public final List f4582g;

        /* renamed from: h */
        public final List f4583h;

        /* renamed from: i */
        public final List f4584i;

        /* renamed from: j */
        public final boolean f4585j;

        /* renamed from: k */
        public final int f4586k;

        /* renamed from: l */
        public final int f4587l;

        public C1043h(String... strArr) {
            this(false, strArr);
        }

        /* renamed from: a */
        public int m67047a() {
            return this.f4587l;
        }

        /* renamed from: b */
        public final Pair m67046b(String str) {
            return new Pair(this.f4585j ? AbstractC1035Os.m67062m(str) : AbstractC1035Os.m67063l(str), Collections.emptyList());
        }

        /* renamed from: c */
        public void m67045c(ByteArrayOutputStream byteArrayOutputStream) {
            int i;
            this.f4576a.m67051a(byteArrayOutputStream);
            byteArrayOutputStream.write(AbstractC1035Os.m67065j(this.f4577b));
            byteArrayOutputStream.write(AbstractC1035Os.m67065j(this.f4578c));
            if (this.f4585j) {
                i = 256;
            } else {
                i = 0;
            }
            byteArrayOutputStream.write(AbstractC1035Os.m67065j(i));
            byteArrayOutputStream.write(AbstractC1035Os.m67065j(this.f4579d));
            byteArrayOutputStream.write(AbstractC1035Os.m67065j(this.f4580e));
            for (Integer num : this.f4581f) {
                byteArrayOutputStream.write(AbstractC1035Os.m67065j(num.intValue()));
            }
            for (Integer num2 : this.f4582g) {
                byteArrayOutputStream.write(AbstractC1035Os.m67065j(num2.intValue()));
            }
            for (byte[] bArr : this.f4583h) {
                byteArrayOutputStream.write(bArr);
            }
            int i2 = this.f4586k;
            if (i2 > 0) {
                byteArrayOutputStream.write(new byte[i2]);
            }
            for (List list : this.f4584i) {
                Iterator it = list.iterator();
                if (!it.hasNext()) {
                    byteArrayOutputStream.write(AbstractC1035Os.m67065j(-1));
                } else {
                    AbstractC22045rk2.m23445a(it.next());
                    throw null;
                }
            }
        }

        public C1043h(boolean z, String... strArr) {
            this.f4581f = new ArrayList();
            this.f4582g = new ArrayList();
            this.f4583h = new ArrayList();
            this.f4584i = new ArrayList();
            this.f4585j = z;
            int i = 0;
            for (String str : strArr) {
                Pair m67046b = m67046b(str);
                this.f4581f.add(Integer.valueOf(i));
                Object obj = m67046b.first;
                i += ((byte[]) obj).length;
                this.f4583h.add((byte[]) obj);
                this.f4584i.add((List) m67046b.second);
            }
            int i2 = 0;
            for (List<Object> list : this.f4584i) {
                for (Object obj2 : list) {
                    AbstractC22045rk2.m23445a(obj2);
                    this.f4581f.add(Integer.valueOf(i));
                    i += C1044i.m67044a(null).length;
                    this.f4583h.add(C1044i.m67044a(null));
                }
                this.f4582g.add(Integer.valueOf(i2));
                i2 += (list.size() * 12) + 4;
            }
            int i3 = i % 4;
            int i4 = i3 == 0 ? 0 : 4 - i3;
            this.f4586k = i4;
            int size = this.f4583h.size();
            this.f4577b = size;
            this.f4578c = this.f4583h.size() - strArr.length;
            boolean z2 = this.f4583h.size() - strArr.length > 0;
            if (!z2) {
                this.f4582g.clear();
                this.f4584i.clear();
            }
            int size2 = (size * 4) + 28 + (this.f4582g.size() * 4);
            this.f4579d = size2;
            int i5 = i + i4;
            this.f4580e = z2 ? size2 + i5 : 0;
            int i6 = size2 + i5 + (z2 ? i2 : 0);
            this.f4587l = i6;
            this.f4576a = new C1040e((short) 1, (short) 28, i6);
        }
    }

    /* renamed from: Os$i */
    /* loaded from: classes4.dex */
    public static class C1044i {
        /* renamed from: a */
        public static /* synthetic */ byte[] m67044a(C1044i c1044i) {
            throw null;
        }
    }

    /* renamed from: Os$j */
    /* loaded from: classes4.dex */
    public static class C1045j {

        /* renamed from: a */
        public final C1040e f4588a;

        /* renamed from: b */
        public final int f4589b;

        /* renamed from: c */
        public final byte[] f4590c;

        /* renamed from: d */
        public final int[] f4591d;

        /* renamed from: e */
        public final C1041f[] f4592e;

        public C1045j(List list, Set set, int i) {
            byte[] bArr = new byte[64];
            this.f4590c = bArr;
            this.f4589b = i;
            bArr[0] = SignedBytes.MAX_POWER_OF_TWO;
            this.f4592e = new C1041f[list.size()];
            for (int i2 = 0; i2 < list.size(); i2++) {
                this.f4592e[i2] = new C1041f(i2, ((C1037b) list.get(i2)).f4559e);
            }
            this.f4591d = new int[i];
            int i3 = 0;
            for (short s = 0; s < i; s = (short) (s + 1)) {
                if (set.contains(Short.valueOf(s))) {
                    this.f4591d[s] = i3;
                    i3 += 16;
                } else {
                    this.f4591d[s] = -1;
                }
            }
            this.f4588a = new C1040e((short) 513, (short) 84, m67043a());
        }

        /* renamed from: a */
        public int m67043a() {
            return m67042b() + (this.f4592e.length * 16);
        }

        /* renamed from: b */
        public final int m67042b() {
            return m67041c() + 84;
        }

        /* renamed from: c */
        public final int m67041c() {
            return this.f4591d.length * 4;
        }

        /* renamed from: d */
        public void m67040d(ByteArrayOutputStream byteArrayOutputStream) {
            this.f4588a.m67051a(byteArrayOutputStream);
            byteArrayOutputStream.write(new byte[]{AbstractC1035Os.f4552a, 0, 0, 0});
            byteArrayOutputStream.write(AbstractC1035Os.m67065j(this.f4589b));
            byteArrayOutputStream.write(AbstractC1035Os.m67065j(m67042b()));
            byteArrayOutputStream.write(this.f4590c);
            for (int i : this.f4591d) {
                byteArrayOutputStream.write(AbstractC1035Os.m67065j(i));
            }
            for (C1041f c1041f : this.f4592e) {
                c1041f.m67050a(byteArrayOutputStream);
            }
        }
    }

    /* renamed from: Os$k */
    /* loaded from: classes4.dex */
    public static class C1046k {

        /* renamed from: a */
        public final C1040e f4593a;

        /* renamed from: b */
        public final int f4594b;

        /* renamed from: c */
        public final int[] f4595c;

        /* renamed from: d */
        public final C1045j f4596d;

        public C1046k(List list) {
            this.f4594b = ((C1037b) list.get(list.size() - 1)).f4557c + 1;
            HashSet hashSet = new HashSet();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                hashSet.add(Short.valueOf(((C1037b) it.next()).f4557c));
            }
            this.f4595c = new int[this.f4594b];
            for (short s = 0; s < this.f4594b; s = (short) (s + 1)) {
                if (hashSet.contains(Short.valueOf(s))) {
                    this.f4595c[s] = 1073741824;
                }
            }
            this.f4593a = new C1040e((short) 514, (short) 16, m67039a());
            this.f4596d = new C1045j(list, hashSet, this.f4594b);
        }

        /* renamed from: a */
        public final int m67039a() {
            return (this.f4594b * 4) + 16;
        }

        /* renamed from: b */
        public int m67038b() {
            return m67039a() + this.f4596d.m67043a();
        }

        /* renamed from: c */
        public void m67037c(ByteArrayOutputStream byteArrayOutputStream) {
            this.f4593a.m67051a(byteArrayOutputStream);
            byteArrayOutputStream.write(new byte[]{AbstractC1035Os.f4552a, 0, 0, 0});
            byteArrayOutputStream.write(AbstractC1035Os.m67065j(this.f4594b));
            for (int i : this.f4595c) {
                byteArrayOutputStream.write(AbstractC1035Os.m67065j(i));
            }
            this.f4596d.m67040d(byteArrayOutputStream);
        }
    }

    /* renamed from: h */
    public static byte[] m67067h(char c) {
        return new byte[]{(byte) (c & 255), (byte) ((c >> '\b') & 255)};
    }

    /* renamed from: i */
    public static byte[] m67066i(Context context, Map map) {
        C1039d c1039d;
        if (!map.entrySet().isEmpty()) {
            C1039d c1039d2 = new C1039d(127, context.getPackageName());
            HashMap hashMap = new HashMap();
            C1037b c1037b = null;
            for (Map.Entry entry : map.entrySet()) {
                C1037b c1037b2 = new C1037b(((Integer) entry.getKey()).intValue(), context.getResources().getResourceName(((Integer) entry.getKey()).intValue()), ((Integer) entry.getValue()).intValue());
                if (context.getResources().getResourceTypeName(((Integer) entry.getKey()).intValue()).equals(TypedValues.Custom.S_COLOR)) {
                    if (c1037b2.f4555a == 1) {
                        c1039d = f4553b;
                    } else if (c1037b2.f4555a == Byte.MAX_VALUE) {
                        c1039d = c1039d2;
                    } else {
                        throw new IllegalArgumentException("Not supported with unknown package id: " + ((int) c1037b2.f4555a));
                    }
                    if (!hashMap.containsKey(c1039d)) {
                        hashMap.put(c1039d, new ArrayList());
                    }
                    ((List) hashMap.get(c1039d)).add(c1037b2);
                    c1037b = c1037b2;
                } else {
                    throw new IllegalArgumentException("Non color resource found: name=" + c1037b2.f4558d + ", typeId=" + Integer.toHexString(c1037b2.f4556b & 255));
                }
            }
            byte b = c1037b.f4556b;
            f4552a = b;
            if (b != 0) {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                new C1042g(hashMap).m67048b(byteArrayOutputStream);
                return byteArrayOutputStream.toByteArray();
            }
            throw new IllegalArgumentException("No color resources found for harmonization.");
        }
        throw new IllegalArgumentException("No color resources provided for harmonization.");
    }

    /* renamed from: j */
    public static byte[] m67065j(int i) {
        return new byte[]{(byte) (i & 255), (byte) ((i >> 8) & 255), (byte) ((i >> 16) & 255), (byte) ((i >> 24) & 255)};
    }

    /* renamed from: k */
    public static byte[] m67064k(short s) {
        return new byte[]{(byte) (s & 255), (byte) ((s >> 8) & 255)};
    }

    /* renamed from: l */
    public static byte[] m67063l(String str) {
        char[] charArray = str.toCharArray();
        int length = charArray.length * 2;
        byte[] bArr = new byte[length + 4];
        byte[] m67064k = m67064k((short) charArray.length);
        bArr[0] = m67064k[0];
        bArr[1] = m67064k[1];
        for (int i = 0; i < charArray.length; i++) {
            byte[] m67067h = m67067h(charArray[i]);
            int i2 = i * 2;
            bArr[i2 + 2] = m67067h[0];
            bArr[i2 + 3] = m67067h[1];
        }
        bArr[length + 2] = 0;
        bArr[length + 3] = 0;
        return bArr;
    }

    /* renamed from: m */
    public static byte[] m67062m(String str) {
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