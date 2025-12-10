package com.google.protobuf;

import com.google.protobuf.Internal;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: com.google.protobuf.u */
/* loaded from: classes4.dex */
public abstract class AbstractC8962u {

    /* renamed from: a */
    public static final Class f57510a = m35111B();

    /* renamed from: b */
    public static final AbstractC8973w f57511b = m35110C(false);

    /* renamed from: c */
    public static final AbstractC8973w f57512c = m35110C(true);

    /* renamed from: d */
    public static final AbstractC8973w f57513d = new C8974x();

    /* renamed from: A */
    public static Object m35112A(Object obj, int i, List list, Internal.EnumVerifier enumVerifier, Object obj2, AbstractC8973w abstractC8973w) {
        if (enumVerifier == null) {
            return obj2;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                Integer num = (Integer) list.get(i3);
                int intValue = num.intValue();
                if (enumVerifier.isInRange(intValue)) {
                    if (i3 != i2) {
                        list.set(i2, num);
                    }
                    i2++;
                } else {
                    obj2 = m35101L(obj, i, intValue, obj2, abstractC8973w);
                }
            }
            if (i2 != size) {
                list.subList(i2, size).clear();
            }
        } else {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int intValue2 = ((Integer) it.next()).intValue();
                if (!enumVerifier.isInRange(intValue2)) {
                    obj2 = m35101L(obj, i, intValue2, obj2, abstractC8973w);
                    it.remove();
                }
            }
        }
        return obj2;
    }

    /* renamed from: B */
    public static Class m35111B() {
        try {
            return Class.forName("com.google.protobuf.GeneratedMessageV3");
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: C */
    public static AbstractC8973w m35110C(boolean z) {
        try {
            Class m35109D = m35109D();
            if (m35109D == null) {
                return null;
            }
            return (AbstractC8973w) m35109D.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z));
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: D */
    public static Class m35109D() {
        try {
            return Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: E */
    public static void m35108E(AbstractC8943g abstractC8943g, Object obj, Object obj2) {
        FieldSet mo35302c = abstractC8943g.mo35302c(obj2);
        if (!mo35302c.m35855r()) {
            abstractC8943g.mo35301d(obj).m35847z(mo35302c);
        }
    }

    /* renamed from: F */
    public static void m35107F(InterfaceC8953m interfaceC8953m, Object obj, Object obj2, long j) {
        AbstractC22806wY1.m803Y(obj, j, interfaceC8953m.mo35258b(AbstractC22806wY1.m820H(obj, j), AbstractC22806wY1.m820H(obj2, j)));
    }

    /* renamed from: G */
    public static void m35106G(AbstractC8973w abstractC8973w, Object obj, Object obj2) {
        abstractC8973w.mo35001p(obj, abstractC8973w.mo35004k(abstractC8973w.mo35008g(obj), abstractC8973w.mo35008g(obj2)));
    }

    /* renamed from: H */
    public static AbstractC8973w m35105H() {
        return f57511b;
    }

    /* renamed from: I */
    public static AbstractC8973w m35104I() {
        return f57512c;
    }

    /* renamed from: J */
    public static void m35103J(Class cls) {
        Class cls2;
        if (!GeneratedMessageLite.class.isAssignableFrom(cls) && (cls2 = f57510a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessageV3 or GeneratedMessageLite");
        }
    }

    /* renamed from: K */
    public static boolean m35102K(Object obj, Object obj2) {
        if (obj != obj2 && (obj == null || !obj.equals(obj2))) {
            return false;
        }
        return true;
    }

    /* renamed from: L */
    public static Object m35101L(Object obj, int i, int i2, Object obj2, AbstractC8973w abstractC8973w) {
        if (obj2 == null) {
            obj2 = abstractC8973w.mo35009f(obj);
        }
        abstractC8973w.mo35010e(obj2, i, i2);
        return obj2;
    }

    /* renamed from: M */
    public static AbstractC8973w m35100M() {
        return f57513d;
    }

    /* renamed from: N */
    public static void m35099N(int i, List list, Writer writer, boolean z) {
        if (list != null && !list.isEmpty()) {
            writer.mo35357D(i, list, z);
        }
    }

    /* renamed from: O */
    public static void m35098O(int i, List list, Writer writer) {
        if (list != null && !list.isEmpty()) {
            writer.mo35320t(i, list);
        }
    }

    /* renamed from: P */
    public static void m35097P(int i, List list, Writer writer, boolean z) {
        if (list != null && !list.isEmpty()) {
            writer.mo35321s(i, list, z);
        }
    }

    /* renamed from: Q */
    public static void m35096Q(int i, List list, Writer writer, boolean z) {
        if (list != null && !list.isEmpty()) {
            writer.mo35316x(i, list, z);
        }
    }

    /* renamed from: R */
    public static void m35095R(int i, List list, Writer writer, boolean z) {
        if (list != null && !list.isEmpty()) {
            writer.mo35333g(i, list, z);
        }
    }

    /* renamed from: S */
    public static void m35094S(int i, List list, Writer writer, boolean z) {
        if (list != null && !list.isEmpty()) {
            writer.mo35324p(i, list, z);
        }
    }

    /* renamed from: T */
    public static void m35093T(int i, List list, Writer writer, boolean z) {
        if (list != null && !list.isEmpty()) {
            writer.mo35339a(i, list, z);
        }
    }

    /* renamed from: U */
    public static void m35092U(int i, List list, Writer writer, InterfaceC8961t interfaceC8961t) {
        if (list != null && !list.isEmpty()) {
            writer.mo35348M(i, list, interfaceC8961t);
        }
    }

    /* renamed from: V */
    public static void m35091V(int i, List list, Writer writer, boolean z) {
        if (list != null && !list.isEmpty()) {
            writer.mo35334f(i, list, z);
        }
    }

    /* renamed from: W */
    public static void m35090W(int i, List list, Writer writer, boolean z) {
        if (list != null && !list.isEmpty()) {
            writer.mo35354G(i, list, z);
        }
    }

    /* renamed from: X */
    public static void m35089X(int i, List list, Writer writer, InterfaceC8961t interfaceC8961t) {
        if (list != null && !list.isEmpty()) {
            writer.mo35350K(i, list, interfaceC8961t);
        }
    }

    /* renamed from: Y */
    public static void m35088Y(int i, List list, Writer writer, boolean z) {
        if (list != null && !list.isEmpty()) {
            writer.mo35358C(i, list, z);
        }
    }

    /* renamed from: Z */
    public static void m35087Z(int i, List list, Writer writer, boolean z) {
        if (list != null && !list.isEmpty()) {
            writer.mo35314z(i, list, z);
        }
    }

    /* renamed from: a */
    public static int m35086a(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (z) {
            return CodedOutputStream.computeTagSize(i) + CodedOutputStream.m37007d(size);
        }
        return size * CodedOutputStream.computeBoolSize(i, true);
    }

    /* renamed from: a0 */
    public static void m35085a0(int i, List list, Writer writer, boolean z) {
        if (list != null && !list.isEmpty()) {
            writer.mo35322r(i, list, z);
        }
    }

    /* renamed from: b */
    public static int m35084b(List list) {
        return list.size();
    }

    /* renamed from: b0 */
    public static void m35083b0(int i, List list, Writer writer, boolean z) {
        if (list != null && !list.isEmpty()) {
            writer.mo35317w(i, list, z);
        }
    }

    /* renamed from: c */
    public static int m35082c(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int computeTagSize = size * CodedOutputStream.computeTagSize(i);
        for (int i2 = 0; i2 < list.size(); i2++) {
            computeTagSize += CodedOutputStream.computeBytesSizeNoTag((ByteString) list.get(i2));
        }
        return computeTagSize;
    }

    /* renamed from: c0 */
    public static void m35081c0(int i, List list, Writer writer) {
        if (list != null && !list.isEmpty()) {
            writer.mo35319u(i, list);
        }
    }

    /* renamed from: d */
    public static int m35080d(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int m35078e = m35078e(list);
        if (z) {
            return CodedOutputStream.computeTagSize(i) + CodedOutputStream.m37007d(m35078e);
        }
        return m35078e + (size * CodedOutputStream.computeTagSize(i));
    }

    /* renamed from: d0 */
    public static void m35079d0(int i, List list, Writer writer, boolean z) {
        if (list != null && !list.isEmpty()) {
            writer.mo35332h(i, list, z);
        }
    }

    /* renamed from: e */
    public static int m35078e(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C8947j) {
            C8947j c8947j = (C8947j) list;
            i = 0;
            while (i2 < size) {
                i += CodedOutputStream.computeEnumSizeNoTag(c8947j.getInt(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += CodedOutputStream.computeEnumSizeNoTag(((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: e0 */
    public static void m35077e0(int i, List list, Writer writer, boolean z) {
        if (list != null && !list.isEmpty()) {
            writer.mo35329k(i, list, z);
        }
    }

    /* renamed from: f */
    public static int m35076f(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (z) {
            return CodedOutputStream.computeTagSize(i) + CodedOutputStream.m37007d(size * 4);
        }
        return size * CodedOutputStream.computeFixed32Size(i, 0);
    }

    /* renamed from: g */
    public static int m35075g(List list) {
        return list.size() * 4;
    }

    /* renamed from: h */
    public static int m35074h(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (z) {
            return CodedOutputStream.computeTagSize(i) + CodedOutputStream.m37007d(size * 8);
        }
        return size * CodedOutputStream.computeFixed64Size(i, 0L);
    }

    /* renamed from: i */
    public static int m35073i(List list) {
        return list.size() * 8;
    }

    /* renamed from: j */
    public static int m35072j(int i, List list, InterfaceC8961t interfaceC8961t) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2 += CodedOutputStream.m37009b(i, (MessageLite) list.get(i3), interfaceC8961t);
        }
        return i2;
    }

    /* renamed from: k */
    public static int m35071k(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int m35070l = m35070l(list);
        if (z) {
            return CodedOutputStream.computeTagSize(i) + CodedOutputStream.m37007d(m35070l);
        }
        return m35070l + (size * CodedOutputStream.computeTagSize(i));
    }

    /* renamed from: l */
    public static int m35070l(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C8947j) {
            C8947j c8947j = (C8947j) list;
            i = 0;
            while (i2 < size) {
                i += CodedOutputStream.computeInt32SizeNoTag(c8947j.getInt(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += CodedOutputStream.computeInt32SizeNoTag(((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: m */
    public static int m35069m(int i, List list, boolean z) {
        if (list.size() == 0) {
            return 0;
        }
        int m35068n = m35068n(list);
        if (z) {
            return CodedOutputStream.computeTagSize(i) + CodedOutputStream.m37007d(m35068n);
        }
        return m35068n + (list.size() * CodedOutputStream.computeTagSize(i));
    }

    /* renamed from: n */
    public static int m35068n(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C8952l) {
            C8952l c8952l = (C8952l) list;
            i = 0;
            while (i2 < size) {
                i += CodedOutputStream.computeInt64SizeNoTag(c8952l.getLong(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += CodedOutputStream.computeInt64SizeNoTag(((Long) list.get(i2)).longValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: o */
    public static int m35067o(int i, Object obj, InterfaceC8961t interfaceC8961t) {
        if (obj instanceof LazyFieldLite) {
            return CodedOutputStream.computeLazyFieldSize(i, (LazyFieldLite) obj);
        }
        return CodedOutputStream.m37006e(i, (MessageLite) obj, interfaceC8961t);
    }

    /* renamed from: p */
    public static int m35066p(int i, List list, InterfaceC8961t interfaceC8961t) {
        int m37005f;
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int computeTagSize = CodedOutputStream.computeTagSize(i) * size;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = list.get(i2);
            if (obj instanceof LazyFieldLite) {
                m37005f = CodedOutputStream.computeLazyFieldSizeNoTag((LazyFieldLite) obj);
            } else {
                m37005f = CodedOutputStream.m37005f((MessageLite) obj, interfaceC8961t);
            }
            computeTagSize += m37005f;
        }
        return computeTagSize;
    }

    /* renamed from: q */
    public static int m35065q(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int m35064r = m35064r(list);
        if (z) {
            return CodedOutputStream.computeTagSize(i) + CodedOutputStream.m37007d(m35064r);
        }
        return m35064r + (size * CodedOutputStream.computeTagSize(i));
    }

    /* renamed from: r */
    public static int m35064r(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C8947j) {
            C8947j c8947j = (C8947j) list;
            i = 0;
            while (i2 < size) {
                i += CodedOutputStream.computeSInt32SizeNoTag(c8947j.getInt(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += CodedOutputStream.computeSInt32SizeNoTag(((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: s */
    public static int m35063s(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int m35062t = m35062t(list);
        if (z) {
            return CodedOutputStream.computeTagSize(i) + CodedOutputStream.m37007d(m35062t);
        }
        return m35062t + (size * CodedOutputStream.computeTagSize(i));
    }

    /* renamed from: t */
    public static int m35062t(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C8952l) {
            C8952l c8952l = (C8952l) list;
            i = 0;
            while (i2 < size) {
                i += CodedOutputStream.computeSInt64SizeNoTag(c8952l.getLong(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += CodedOutputStream.computeSInt64SizeNoTag(((Long) list.get(i2)).longValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: u */
    public static int m35061u(int i, List list) {
        int computeStringSizeNoTag;
        int computeStringSizeNoTag2;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        int computeTagSize = CodedOutputStream.computeTagSize(i) * size;
        if (list instanceof LazyStringList) {
            LazyStringList lazyStringList = (LazyStringList) list;
            while (i2 < size) {
                Object raw = lazyStringList.getRaw(i2);
                if (raw instanceof ByteString) {
                    computeStringSizeNoTag2 = CodedOutputStream.computeBytesSizeNoTag((ByteString) raw);
                } else {
                    computeStringSizeNoTag2 = CodedOutputStream.computeStringSizeNoTag((String) raw);
                }
                computeTagSize += computeStringSizeNoTag2;
                i2++;
            }
        } else {
            while (i2 < size) {
                Object obj = list.get(i2);
                if (obj instanceof ByteString) {
                    computeStringSizeNoTag = CodedOutputStream.computeBytesSizeNoTag((ByteString) obj);
                } else {
                    computeStringSizeNoTag = CodedOutputStream.computeStringSizeNoTag((String) obj);
                }
                computeTagSize += computeStringSizeNoTag;
                i2++;
            }
        }
        return computeTagSize;
    }

    /* renamed from: v */
    public static int m35060v(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int m35059w = m35059w(list);
        if (z) {
            return CodedOutputStream.computeTagSize(i) + CodedOutputStream.m37007d(m35059w);
        }
        return m35059w + (size * CodedOutputStream.computeTagSize(i));
    }

    /* renamed from: w */
    public static int m35059w(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C8947j) {
            C8947j c8947j = (C8947j) list;
            i = 0;
            while (i2 < size) {
                i += CodedOutputStream.computeUInt32SizeNoTag(c8947j.getInt(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += CodedOutputStream.computeUInt32SizeNoTag(((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: x */
    public static int m35058x(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int m35057y = m35057y(list);
        if (z) {
            return CodedOutputStream.computeTagSize(i) + CodedOutputStream.m37007d(m35057y);
        }
        return m35057y + (size * CodedOutputStream.computeTagSize(i));
    }

    /* renamed from: y */
    public static int m35057y(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C8952l) {
            C8952l c8952l = (C8952l) list;
            i = 0;
            while (i2 < size) {
                i += CodedOutputStream.computeUInt64SizeNoTag(c8952l.getLong(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += CodedOutputStream.computeUInt64SizeNoTag(((Long) list.get(i2)).longValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: z */
    public static Object m35056z(Object obj, int i, List list, Internal.EnumLiteMap enumLiteMap, Object obj2, AbstractC8973w abstractC8973w) {
        if (enumLiteMap == null) {
            return obj2;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                Integer num = (Integer) list.get(i3);
                int intValue = num.intValue();
                if (enumLiteMap.findValueByNumber(intValue) != null) {
                    if (i3 != i2) {
                        list.set(i2, num);
                    }
                    i2++;
                } else {
                    obj2 = m35101L(obj, i, intValue, obj2, abstractC8973w);
                }
            }
            if (i2 != size) {
                list.subList(i2, size).clear();
            }
        } else {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int intValue2 = ((Integer) it.next()).intValue();
                if (enumLiteMap.findValueByNumber(intValue2) == null) {
                    obj2 = m35101L(obj, i, intValue2, obj2, abstractC8973w);
                    it.remove();
                }
            }
        }
        return obj2;
    }
}
