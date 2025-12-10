package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.Internal;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: androidx.datastore.preferences.protobuf.w */
/* loaded from: classes2.dex */
public abstract class AbstractC4455w {

    /* renamed from: a */
    public static final Class f34976a = m55012B();

    /* renamed from: b */
    public static final AbstractC4466y f34977b = m55011C(false);

    /* renamed from: c */
    public static final AbstractC4466y f34978c = m55011C(true);

    /* renamed from: d */
    public static final AbstractC4466y f34979d = new C4467z();

    /* renamed from: A */
    public static Object m55013A(int i, List list, Internal.EnumVerifier enumVerifier, Object obj, AbstractC4466y abstractC4466y) {
        if (enumVerifier == null) {
            return obj;
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
                    obj = m55002L(i, intValue, obj, abstractC4466y);
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
                    obj = m55002L(i, intValue2, obj, abstractC4466y);
                    it.remove();
                }
            }
        }
        return obj;
    }

    /* renamed from: B */
    public static Class m55012B() {
        try {
            return Class.forName("androidx.datastore.preferences.protobuf.GeneratedMessageV3");
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: C */
    public static AbstractC4466y m55011C(boolean z) {
        try {
            Class m55010D = m55010D();
            if (m55010D == null) {
                return null;
            }
            return (AbstractC4466y) m55010D.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z));
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: D */
    public static Class m55010D() {
        try {
            return Class.forName("androidx.datastore.preferences.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: E */
    public static void m55009E(AbstractC4435h abstractC4435h, Object obj, Object obj2) {
        FieldSet mo55196c = abstractC4435h.mo55196c(obj2);
        if (!mo55196c.m55786r()) {
            abstractC4435h.mo55195d(obj).m55779y(mo55196c);
        }
    }

    /* renamed from: F */
    public static void m55008F(InterfaceC4445n interfaceC4445n, Object obj, Object obj2, long j) {
        AbstractC22978xY1.m477V(obj, j, interfaceC4445n.mo55152b(AbstractC22978xY1.m493F(obj, j), AbstractC22978xY1.m493F(obj2, j)));
    }

    /* renamed from: G */
    public static void m55007G(AbstractC4466y abstractC4466y, Object obj, Object obj2) {
        abstractC4466y.mo54902p(obj, abstractC4466y.mo54905k(abstractC4466y.mo54909g(obj), abstractC4466y.mo54909g(obj2)));
    }

    /* renamed from: H */
    public static AbstractC4466y m55006H() {
        return f34977b;
    }

    /* renamed from: I */
    public static AbstractC4466y m55005I() {
        return f34978c;
    }

    /* renamed from: J */
    public static void m55004J(Class cls) {
        Class cls2;
        if (!GeneratedMessageLite.class.isAssignableFrom(cls) && (cls2 = f34976a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    /* renamed from: K */
    public static boolean m55003K(Object obj, Object obj2) {
        if (obj != obj2 && (obj == null || !obj.equals(obj2))) {
            return false;
        }
        return true;
    }

    /* renamed from: L */
    public static Object m55002L(int i, int i2, Object obj, AbstractC4466y abstractC4466y) {
        if (obj == null) {
            obj = abstractC4466y.mo54904n();
        }
        abstractC4466y.mo54911e(obj, i, i2);
        return obj;
    }

    /* renamed from: M */
    public static AbstractC4466y m55001M() {
        return f34979d;
    }

    /* renamed from: N */
    public static void m55000N(int i, List list, Writer writer, boolean z) {
        if (list != null && !list.isEmpty()) {
            writer.mo55251D(i, list, z);
        }
    }

    /* renamed from: O */
    public static void m54999O(int i, List list, Writer writer) {
        if (list != null && !list.isEmpty()) {
            writer.mo55214t(i, list);
        }
    }

    /* renamed from: P */
    public static void m54998P(int i, List list, Writer writer, boolean z) {
        if (list != null && !list.isEmpty()) {
            writer.mo55215s(i, list, z);
        }
    }

    /* renamed from: Q */
    public static void m54997Q(int i, List list, Writer writer, boolean z) {
        if (list != null && !list.isEmpty()) {
            writer.mo55210x(i, list, z);
        }
    }

    /* renamed from: R */
    public static void m54996R(int i, List list, Writer writer, boolean z) {
        if (list != null && !list.isEmpty()) {
            writer.mo55227g(i, list, z);
        }
    }

    /* renamed from: S */
    public static void m54995S(int i, List list, Writer writer, boolean z) {
        if (list != null && !list.isEmpty()) {
            writer.mo55218p(i, list, z);
        }
    }

    /* renamed from: T */
    public static void m54994T(int i, List list, Writer writer, boolean z) {
        if (list != null && !list.isEmpty()) {
            writer.mo55233a(i, list, z);
        }
    }

    /* renamed from: U */
    public static void m54993U(int i, List list, Writer writer, InterfaceC4454v interfaceC4454v) {
        if (list != null && !list.isEmpty()) {
            writer.mo55243L(i, list, interfaceC4454v);
        }
    }

    /* renamed from: V */
    public static void m54992V(int i, List list, Writer writer, boolean z) {
        if (list != null && !list.isEmpty()) {
            writer.mo55228f(i, list, z);
        }
    }

    /* renamed from: W */
    public static void m54991W(int i, List list, Writer writer, boolean z) {
        if (list != null && !list.isEmpty()) {
            writer.mo55248G(i, list, z);
        }
    }

    /* renamed from: X */
    public static void m54990X(int i, List list, Writer writer, InterfaceC4454v interfaceC4454v) {
        if (list != null && !list.isEmpty()) {
            writer.mo55241N(i, list, interfaceC4454v);
        }
    }

    /* renamed from: Y */
    public static void m54989Y(int i, List list, Writer writer, boolean z) {
        if (list != null && !list.isEmpty()) {
            writer.mo55252C(i, list, z);
        }
    }

    /* renamed from: Z */
    public static void m54988Z(int i, List list, Writer writer, boolean z) {
        if (list != null && !list.isEmpty()) {
            writer.mo55208z(i, list, z);
        }
    }

    /* renamed from: a */
    public static int m54987a(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (z) {
            return CodedOutputStream.computeTagSize(i) + CodedOutputStream.m56050d(size);
        }
        return size * CodedOutputStream.computeBoolSize(i, true);
    }

    /* renamed from: a0 */
    public static void m54986a0(int i, List list, Writer writer, boolean z) {
        if (list != null && !list.isEmpty()) {
            writer.mo55216r(i, list, z);
        }
    }

    /* renamed from: b */
    public static int m54985b(List list) {
        return list.size();
    }

    /* renamed from: b0 */
    public static void m54984b0(int i, List list, Writer writer, boolean z) {
        if (list != null && !list.isEmpty()) {
            writer.mo55211w(i, list, z);
        }
    }

    /* renamed from: c */
    public static int m54983c(int i, List list) {
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
    public static void m54982c0(int i, List list, Writer writer) {
        if (list != null && !list.isEmpty()) {
            writer.mo55213u(i, list);
        }
    }

    /* renamed from: d */
    public static int m54981d(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int m54979e = m54979e(list);
        if (z) {
            return CodedOutputStream.computeTagSize(i) + CodedOutputStream.m56050d(m54979e);
        }
        return m54979e + (size * CodedOutputStream.computeTagSize(i));
    }

    /* renamed from: d0 */
    public static void m54980d0(int i, List list, Writer writer, boolean z) {
        if (list != null && !list.isEmpty()) {
            writer.mo55226h(i, list, z);
        }
    }

    /* renamed from: e */
    public static int m54979e(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C4439k) {
            C4439k c4439k = (C4439k) list;
            i = 0;
            while (i2 < size) {
                i += CodedOutputStream.computeEnumSizeNoTag(c4439k.getInt(i2));
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
    public static void m54978e0(int i, List list, Writer writer, boolean z) {
        if (list != null && !list.isEmpty()) {
            writer.mo55223k(i, list, z);
        }
    }

    /* renamed from: f */
    public static int m54977f(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (z) {
            return CodedOutputStream.computeTagSize(i) + CodedOutputStream.m56050d(size * 4);
        }
        return size * CodedOutputStream.computeFixed32Size(i, 0);
    }

    /* renamed from: g */
    public static int m54976g(List list) {
        return list.size() * 4;
    }

    /* renamed from: h */
    public static int m54975h(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (z) {
            return CodedOutputStream.computeTagSize(i) + CodedOutputStream.m56050d(size * 8);
        }
        return size * CodedOutputStream.computeFixed64Size(i, 0L);
    }

    /* renamed from: i */
    public static int m54974i(List list) {
        return list.size() * 8;
    }

    /* renamed from: j */
    public static int m54973j(int i, List list, InterfaceC4454v interfaceC4454v) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2 += CodedOutputStream.m56052b(i, (MessageLite) list.get(i3), interfaceC4454v);
        }
        return i2;
    }

    /* renamed from: k */
    public static int m54972k(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int m54971l = m54971l(list);
        if (z) {
            return CodedOutputStream.computeTagSize(i) + CodedOutputStream.m56050d(m54971l);
        }
        return m54971l + (size * CodedOutputStream.computeTagSize(i));
    }

    /* renamed from: l */
    public static int m54971l(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C4439k) {
            C4439k c4439k = (C4439k) list;
            i = 0;
            while (i2 < size) {
                i += CodedOutputStream.computeInt32SizeNoTag(c4439k.getInt(i2));
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
    public static int m54970m(int i, List list, boolean z) {
        if (list.size() == 0) {
            return 0;
        }
        int m54969n = m54969n(list);
        if (z) {
            return CodedOutputStream.computeTagSize(i) + CodedOutputStream.m56050d(m54969n);
        }
        return m54969n + (list.size() * CodedOutputStream.computeTagSize(i));
    }

    /* renamed from: n */
    public static int m54969n(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C4444m) {
            C4444m c4444m = (C4444m) list;
            i = 0;
            while (i2 < size) {
                i += CodedOutputStream.computeInt64SizeNoTag(c4444m.getLong(i2));
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
    public static int m54968o(int i, Object obj, InterfaceC4454v interfaceC4454v) {
        if (obj instanceof LazyFieldLite) {
            return CodedOutputStream.computeLazyFieldSize(i, (LazyFieldLite) obj);
        }
        return CodedOutputStream.m56049e(i, (MessageLite) obj, interfaceC4454v);
    }

    /* renamed from: p */
    public static int m54967p(int i, List list, InterfaceC4454v interfaceC4454v) {
        int m56048f;
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int computeTagSize = CodedOutputStream.computeTagSize(i) * size;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = list.get(i2);
            if (obj instanceof LazyFieldLite) {
                m56048f = CodedOutputStream.computeLazyFieldSizeNoTag((LazyFieldLite) obj);
            } else {
                m56048f = CodedOutputStream.m56048f((MessageLite) obj, interfaceC4454v);
            }
            computeTagSize += m56048f;
        }
        return computeTagSize;
    }

    /* renamed from: q */
    public static int m54966q(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int m54965r = m54965r(list);
        if (z) {
            return CodedOutputStream.computeTagSize(i) + CodedOutputStream.m56050d(m54965r);
        }
        return m54965r + (size * CodedOutputStream.computeTagSize(i));
    }

    /* renamed from: r */
    public static int m54965r(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C4439k) {
            C4439k c4439k = (C4439k) list;
            i = 0;
            while (i2 < size) {
                i += CodedOutputStream.computeSInt32SizeNoTag(c4439k.getInt(i2));
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
    public static int m54964s(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int m54963t = m54963t(list);
        if (z) {
            return CodedOutputStream.computeTagSize(i) + CodedOutputStream.m56050d(m54963t);
        }
        return m54963t + (size * CodedOutputStream.computeTagSize(i));
    }

    /* renamed from: t */
    public static int m54963t(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C4444m) {
            C4444m c4444m = (C4444m) list;
            i = 0;
            while (i2 < size) {
                i += CodedOutputStream.computeSInt64SizeNoTag(c4444m.getLong(i2));
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
    public static int m54962u(int i, List list) {
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
    public static int m54961v(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int m54960w = m54960w(list);
        if (z) {
            return CodedOutputStream.computeTagSize(i) + CodedOutputStream.m56050d(m54960w);
        }
        return m54960w + (size * CodedOutputStream.computeTagSize(i));
    }

    /* renamed from: w */
    public static int m54960w(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C4439k) {
            C4439k c4439k = (C4439k) list;
            i = 0;
            while (i2 < size) {
                i += CodedOutputStream.computeUInt32SizeNoTag(c4439k.getInt(i2));
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
    public static int m54959x(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int m54958y = m54958y(list);
        if (z) {
            return CodedOutputStream.computeTagSize(i) + CodedOutputStream.m56050d(m54958y);
        }
        return m54958y + (size * CodedOutputStream.computeTagSize(i));
    }

    /* renamed from: y */
    public static int m54958y(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C4444m) {
            C4444m c4444m = (C4444m) list;
            i = 0;
            while (i2 < size) {
                i += CodedOutputStream.computeUInt64SizeNoTag(c4444m.getLong(i2));
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
    public static Object m54957z(int i, List list, Internal.EnumLiteMap enumLiteMap, Object obj, AbstractC4466y abstractC4466y) {
        if (enumLiteMap == null) {
            return obj;
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
                    obj = m55002L(i, intValue, obj, abstractC4466y);
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
                    obj = m55002L(i, intValue2, obj, abstractC4466y);
                    it.remove();
                }
            }
        }
        return obj;
    }
}
