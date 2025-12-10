package com.google.protobuf;

import com.google.protobuf.AbstractC8934b;
import com.google.protobuf.ByteString;
import com.google.protobuf.Internal;
import com.google.protobuf.MapEntryLite;
import com.google.protobuf.WireFormat;
import com.google.protobuf.Writer;
import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.asn1.eac.EACTags;
import sun.misc.Unsafe;

/* renamed from: com.google.protobuf.p */
/* loaded from: classes4.dex */
public final class C8956p implements InterfaceC8961t {

    /* renamed from: r */
    public static final int[] f57483r = new int[0];

    /* renamed from: s */
    public static final Unsafe f57484s = AbstractC22806wY1.m819I();

    /* renamed from: a */
    public final int[] f57485a;

    /* renamed from: b */
    public final Object[] f57486b;

    /* renamed from: c */
    public final int f57487c;

    /* renamed from: d */
    public final int f57488d;

    /* renamed from: e */
    public final MessageLite f57489e;

    /* renamed from: f */
    public final boolean f57490f;

    /* renamed from: g */
    public final boolean f57491g;

    /* renamed from: h */
    public final boolean f57492h;

    /* renamed from: i */
    public final boolean f57493i;

    /* renamed from: j */
    public final int[] f57494j;

    /* renamed from: k */
    public final int f57495k;

    /* renamed from: l */
    public final int f57496l;

    /* renamed from: m */
    public final InterfaceC19842fH0 f57497m;

    /* renamed from: n */
    public final AbstractC8948k f57498n;

    /* renamed from: o */
    public final AbstractC8973w f57499o;

    /* renamed from: p */
    public final AbstractC8943g f57500p;

    /* renamed from: q */
    public final InterfaceC8953m f57501q;

    /* renamed from: com.google.protobuf.p$a */
    /* loaded from: classes4.dex */
    public static /* synthetic */ class C8957a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f57502a;

        static {
            int[] iArr = new int[WireFormat.FieldType.values().length];
            f57502a = iArr;
            try {
                iArr[WireFormat.FieldType.BOOL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f57502a[WireFormat.FieldType.BYTES.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f57502a[WireFormat.FieldType.DOUBLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f57502a[WireFormat.FieldType.FIXED32.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f57502a[WireFormat.FieldType.SFIXED32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f57502a[WireFormat.FieldType.FIXED64.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f57502a[WireFormat.FieldType.SFIXED64.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f57502a[WireFormat.FieldType.FLOAT.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f57502a[WireFormat.FieldType.ENUM.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f57502a[WireFormat.FieldType.INT32.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f57502a[WireFormat.FieldType.UINT32.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f57502a[WireFormat.FieldType.INT64.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f57502a[WireFormat.FieldType.UINT64.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f57502a[WireFormat.FieldType.MESSAGE.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f57502a[WireFormat.FieldType.SINT32.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f57502a[WireFormat.FieldType.SINT64.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f57502a[WireFormat.FieldType.STRING.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
        }
    }

    public C8956p(int[] iArr, Object[] objArr, int i, int i2, MessageLite messageLite, boolean z, boolean z2, int[] iArr2, int i3, int i4, InterfaceC19842fH0 interfaceC19842fH0, AbstractC8948k abstractC8948k, AbstractC8973w abstractC8973w, AbstractC8943g abstractC8943g, InterfaceC8953m interfaceC8953m) {
        boolean z3;
        this.f57485a = iArr;
        this.f57486b = objArr;
        this.f57487c = i;
        this.f57488d = i2;
        this.f57491g = messageLite instanceof GeneratedMessageLite;
        this.f57492h = z;
        if (abstractC8943g != null && abstractC8943g.mo35300e(messageLite)) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.f57490f = z3;
        this.f57493i = z2;
        this.f57494j = iArr2;
        this.f57495k = i3;
        this.f57496l = i4;
        this.f57497m = interfaceC19842fH0;
        this.f57498n = abstractC8948k;
        this.f57499o = abstractC8973w;
        this.f57500p = abstractC8943g;
        this.f57489e = messageLite;
        this.f57501q = interfaceC8953m;
    }

    /* renamed from: A */
    public static int m35243A(Object obj, long j) {
        return AbstractC22806wY1.m824D(obj, j);
    }

    /* renamed from: B */
    public static boolean m35241B(int i) {
        return (i & PKIFailureInfo.duplicateCertReq) != 0;
    }

    /* renamed from: E */
    public static boolean m35235E(Object obj, int i, InterfaceC8961t interfaceC8961t) {
        return interfaceC8961t.mo35118d(AbstractC22806wY1.m820H(obj, m35214Y(i)));
    }

    /* renamed from: H */
    public static boolean m35231H(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof GeneratedMessageLite) {
            return ((GeneratedMessageLite) obj).m35821t();
        }
        return true;
    }

    /* renamed from: K */
    public static boolean m35228K(int i) {
        return (i & 268435456) != 0;
    }

    /* renamed from: L */
    public static List m35227L(Object obj, long j) {
        return (List) AbstractC22806wY1.m820H(obj, j);
    }

    /* renamed from: M */
    public static long m35226M(Object obj, long j) {
        return AbstractC22806wY1.m822F(obj, j);
    }

    /* renamed from: U */
    public static C8956p m35218U(Class cls, InterfaceC20799ks0 interfaceC20799ks0, InterfaceC19842fH0 interfaceC19842fH0, AbstractC8948k abstractC8948k, AbstractC8973w abstractC8973w, AbstractC8943g abstractC8943g, InterfaceC8953m interfaceC8953m) {
        if (interfaceC20799ks0 instanceof C18524Tr1) {
            return m35216W((C18524Tr1) interfaceC20799ks0, interfaceC19842fH0, abstractC8948k, abstractC8973w, abstractC8943g, interfaceC8953m);
        }
        return m35217V((StructuralMessageInfo) interfaceC20799ks0, interfaceC19842fH0, abstractC8948k, abstractC8973w, abstractC8943g, interfaceC8953m);
    }

    /* renamed from: V */
    public static C8956p m35217V(StructuralMessageInfo structuralMessageInfo, InterfaceC19842fH0 interfaceC19842fH0, AbstractC8948k abstractC8948k, AbstractC8973w abstractC8973w, AbstractC8943g abstractC8943g, InterfaceC8953m interfaceC8953m) {
        boolean z;
        int m35903m;
        int m35903m2;
        int[] iArr;
        int i;
        if (structuralMessageInfo.getSyntax() == ProtoSyntax.PROTO3) {
            z = true;
        } else {
            z = false;
        }
        FieldInfo[] m35626d = structuralMessageInfo.m35626d();
        if (m35626d.length == 0) {
            m35903m = 0;
            m35903m2 = 0;
        } else {
            m35903m = m35626d[0].m35903m();
            m35903m2 = m35626d[m35626d.length - 1].m35903m();
        }
        int length = m35626d.length;
        int[] iArr2 = new int[length * 3];
        Object[] objArr = new Object[length * 2];
        int i2 = 0;
        int i3 = 0;
        for (FieldInfo fieldInfo : m35626d) {
            if (fieldInfo.m35897s() == FieldType.MAP) {
                i2++;
            } else if (fieldInfo.m35897s().m35846id() >= 18 && fieldInfo.m35897s().m35846id() <= 49) {
                i3++;
            }
        }
        int[] iArr3 = null;
        if (i2 > 0) {
            iArr = new int[i2];
        } else {
            iArr = null;
        }
        if (i3 > 0) {
            iArr3 = new int[i3];
        }
        int[] m35627c = structuralMessageInfo.m35627c();
        if (m35627c == null) {
            m35627c = f57483r;
        }
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        while (i4 < m35626d.length) {
            FieldInfo fieldInfo2 = m35626d[i4];
            int m35903m3 = fieldInfo2.m35903m();
            m35180u0(fieldInfo2, iArr2, i5, objArr);
            if (i6 < m35627c.length && m35627c[i6] == m35903m3) {
                m35627c[i6] = i5;
                i6++;
            }
            if (fieldInfo2.m35897s() == FieldType.MAP) {
                iArr[i7] = i5;
                i7++;
            } else if (fieldInfo2.m35897s().m35846id() >= 18 && fieldInfo2.m35897s().m35846id() <= 49) {
                i = i5;
                iArr3[i8] = (int) AbstractC22806wY1.m815M(fieldInfo2.m35904l());
                i8++;
                i4++;
                i5 = i + 3;
            }
            i = i5;
            i4++;
            i5 = i + 3;
        }
        if (iArr == null) {
            iArr = f57483r;
        }
        if (iArr3 == null) {
            iArr3 = f57483r;
        }
        int[] iArr4 = new int[m35627c.length + iArr.length + iArr3.length];
        System.arraycopy(m35627c, 0, iArr4, 0, m35627c.length);
        System.arraycopy(iArr, 0, iArr4, m35627c.length, iArr.length);
        System.arraycopy(iArr3, 0, iArr4, m35627c.length + iArr.length, iArr3.length);
        return new C8956p(iArr2, objArr, m35903m, m35903m2, structuralMessageInfo.mo26593b(), z, true, iArr4, m35627c.length, m35627c.length + iArr.length, interfaceC19842fH0, abstractC8948k, abstractC8973w, abstractC8943g, interfaceC8953m);
    }

    /* JADX WARN: Removed duplicated region for block: B:122:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x031f  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x037d  */
    /* renamed from: W */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.protobuf.C8956p m35216W(p000.C18524Tr1 r33, p000.InterfaceC19842fH0 r34, com.google.protobuf.AbstractC8948k r35, com.google.protobuf.AbstractC8973w r36, com.google.protobuf.AbstractC8943g r37, com.google.protobuf.InterfaceC8953m r38) {
        /*
            Method dump skipped, instructions count: 998
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C8956p.m35216W(Tr1, fH0, com.google.protobuf.k, com.google.protobuf.w, com.google.protobuf.g, com.google.protobuf.m):com.google.protobuf.p");
    }

    /* renamed from: Y */
    public static long m35214Y(int i) {
        return i & 1048575;
    }

    /* renamed from: Z */
    public static boolean m35213Z(Object obj, long j) {
        return ((Boolean) AbstractC22806wY1.m820H(obj, j)).booleanValue();
    }

    /* renamed from: a0 */
    public static double m35212a0(Object obj, long j) {
        return ((Double) AbstractC22806wY1.m820H(obj, j)).doubleValue();
    }

    /* renamed from: b0 */
    public static float m35211b0(Object obj, long j) {
        return ((Float) AbstractC22806wY1.m820H(obj, j)).floatValue();
    }

    /* renamed from: c0 */
    public static int m35210c0(Object obj, long j) {
        return ((Integer) AbstractC22806wY1.m820H(obj, j)).intValue();
    }

    /* renamed from: d0 */
    public static long m35209d0(Object obj, long j) {
        return ((Long) AbstractC22806wY1.m820H(obj, j)).longValue();
    }

    /* renamed from: k */
    public static boolean m35201k(Object obj, long j) {
        return AbstractC22806wY1.m780u(obj, j);
    }

    /* renamed from: l */
    public static void m35199l(Object obj) {
        if (m35231H(obj)) {
            return;
        }
        throw new IllegalArgumentException("Mutating immutable message: " + obj);
    }

    /* renamed from: o */
    public static double m35193o(Object obj, long j) {
        return AbstractC22806wY1.m826B(obj, j);
    }

    /* renamed from: q0 */
    public static java.lang.reflect.Field m35188q0(Class cls, String str) {
        java.lang.reflect.Field[] declaredFields;
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            for (java.lang.reflect.Field field : cls.getDeclaredFields()) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            throw new RuntimeException("Field " + str + " for " + cls.getName() + " not found. Known fields are " + Arrays.toString(declaredFields));
        }
    }

    /* renamed from: s */
    public static float m35185s(Object obj, long j) {
        return AbstractC22806wY1.m825C(obj, j);
    }

    /* renamed from: u0 */
    public static void m35180u0(FieldInfo fieldInfo, int[] iArr, int i, Object[] objArr) {
        int m815M;
        int i2;
        int i3;
        fieldInfo.m35900p();
        FieldType m35897s = fieldInfo.m35897s();
        int m815M2 = (int) AbstractC22806wY1.m815M(fieldInfo.m35904l());
        int m35846id = m35897s.m35846id();
        int i4 = 0;
        if (!m35897s.isList() && !m35897s.isMap()) {
            java.lang.reflect.Field m35899q = fieldInfo.m35899q();
            if (m35899q == null) {
                m815M = 1048575;
            } else {
                m815M = (int) AbstractC22806wY1.m815M(m35899q);
            }
            i2 = Integer.numberOfTrailingZeros(fieldInfo.m35898r());
        } else {
            if (fieldInfo.m35906j() == null) {
                m815M = 0;
            } else {
                m815M = (int) AbstractC22806wY1.m815M(fieldInfo.m35906j());
            }
            i2 = 0;
        }
        iArr[i] = fieldInfo.m35903m();
        int i5 = i + 1;
        if (fieldInfo.m35896t()) {
            i3 = PKIFailureInfo.duplicateCertReq;
        } else {
            i3 = 0;
        }
        if (fieldInfo.m35894v()) {
            i4 = 268435456;
        }
        iArr[i5] = (m35846id << 20) | i4 | i3 | m815M2;
        iArr[i + 2] = m815M | (i2 << 20);
        Class m35901o = fieldInfo.m35901o();
        if (fieldInfo.m35902n() != null) {
            int i6 = (i / 3) * 2;
            objArr[i6] = fieldInfo.m35902n();
            if (m35901o != null) {
                objArr[i6 + 1] = m35901o;
            } else if (fieldInfo.m35905k() != null) {
                objArr[i6 + 1] = fieldInfo.m35905k();
            }
        } else if (m35901o != null) {
            objArr[((i / 3) * 2) + 1] = m35901o;
        } else if (fieldInfo.m35905k() != null) {
            objArr[((i / 3) * 2) + 1] = fieldInfo.m35905k();
        }
    }

    /* renamed from: w */
    public static UnknownFieldSetLite m35177w(Object obj) {
        GeneratedMessageLite generatedMessageLite = (GeneratedMessageLite) obj;
        UnknownFieldSetLite unknownFieldSetLite = generatedMessageLite.unknownFields;
        if (unknownFieldSetLite == UnknownFieldSetLite.getDefaultInstance()) {
            UnknownFieldSetLite m35537k = UnknownFieldSetLite.m35537k();
            generatedMessageLite.unknownFields = m35537k;
            return m35537k;
        }
        return unknownFieldSetLite;
    }

    /* renamed from: x0 */
    public static int m35174x0(int i) {
        return (i & 267386880) >>> 20;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0588  */
    /* renamed from: A0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m35242A0(java.lang.Object r13, com.google.protobuf.Writer r14) {
        /*
            Method dump skipped, instructions count: 1584
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C8956p.m35242A0(java.lang.Object, com.google.protobuf.Writer):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x058e  */
    /* renamed from: B0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m35240B0(java.lang.Object r11, com.google.protobuf.Writer r12) {
        /*
            Method dump skipped, instructions count: 1586
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C8956p.m35240B0(java.lang.Object, com.google.protobuf.Writer):void");
    }

    /* renamed from: C */
    public final boolean m35239C(Object obj, int i) {
        int m35198l0 = m35198l0(i);
        long j = 1048575 & m35198l0;
        if (j == 1048575) {
            int m35172y0 = m35172y0(i);
            long m35214Y = m35214Y(m35172y0);
            switch (m35174x0(m35172y0)) {
                case 0:
                    if (Double.doubleToRawLongBits(AbstractC22806wY1.m826B(obj, m35214Y)) == 0) {
                        return false;
                    }
                    return true;
                case 1:
                    if (Float.floatToRawIntBits(AbstractC22806wY1.m825C(obj, m35214Y)) == 0) {
                        return false;
                    }
                    return true;
                case 2:
                    if (AbstractC22806wY1.m822F(obj, m35214Y) == 0) {
                        return false;
                    }
                    return true;
                case 3:
                    if (AbstractC22806wY1.m822F(obj, m35214Y) == 0) {
                        return false;
                    }
                    return true;
                case 4:
                    if (AbstractC22806wY1.m824D(obj, m35214Y) == 0) {
                        return false;
                    }
                    return true;
                case 5:
                    if (AbstractC22806wY1.m822F(obj, m35214Y) == 0) {
                        return false;
                    }
                    return true;
                case 6:
                    if (AbstractC22806wY1.m824D(obj, m35214Y) == 0) {
                        return false;
                    }
                    return true;
                case 7:
                    return AbstractC22806wY1.m780u(obj, m35214Y);
                case 8:
                    Object m820H = AbstractC22806wY1.m820H(obj, m35214Y);
                    if (m820H instanceof String) {
                        return !((String) m820H).isEmpty();
                    }
                    if (m820H instanceof ByteString) {
                        return !ByteString.EMPTY.equals(m820H);
                    }
                    throw new IllegalArgumentException();
                case 9:
                    if (AbstractC22806wY1.m820H(obj, m35214Y) == null) {
                        return false;
                    }
                    return true;
                case 10:
                    return !ByteString.EMPTY.equals(AbstractC22806wY1.m820H(obj, m35214Y));
                case 11:
                    if (AbstractC22806wY1.m824D(obj, m35214Y) == 0) {
                        return false;
                    }
                    return true;
                case 12:
                    if (AbstractC22806wY1.m824D(obj, m35214Y) == 0) {
                        return false;
                    }
                    return true;
                case 13:
                    if (AbstractC22806wY1.m824D(obj, m35214Y) == 0) {
                        return false;
                    }
                    return true;
                case 14:
                    if (AbstractC22806wY1.m822F(obj, m35214Y) == 0) {
                        return false;
                    }
                    return true;
                case 15:
                    if (AbstractC22806wY1.m824D(obj, m35214Y) == 0) {
                        return false;
                    }
                    return true;
                case 16:
                    if (AbstractC22806wY1.m822F(obj, m35214Y) == 0) {
                        return false;
                    }
                    return true;
                case 17:
                    if (AbstractC22806wY1.m820H(obj, m35214Y) == null) {
                        return false;
                    }
                    return true;
                default:
                    throw new IllegalArgumentException();
            }
        }
        if ((AbstractC22806wY1.m824D(obj, j) & (1 << (m35198l0 >>> 20))) == 0) {
            return false;
        }
        return true;
    }

    /* renamed from: C0 */
    public final void m35238C0(Writer writer, int i, Object obj, int i2) {
        if (obj != null) {
            writer.mo35351J(i, this.f57501q.mo35257c(m35181u(i2)), this.f57501q.mo35252h(obj));
        }
    }

    /* renamed from: D */
    public final boolean m35237D(Object obj, int i, int i2, int i3, int i4) {
        if (i2 == 1048575) {
            return m35239C(obj, i);
        }
        if ((i3 & i4) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: D0 */
    public final void m35236D0(int i, Object obj, Writer writer) {
        if (obj instanceof String) {
            writer.mo35336d(i, (String) obj);
        } else {
            writer.mo35352I(i, (ByteString) obj);
        }
    }

    /* renamed from: E0 */
    public final void m35234E0(AbstractC8973w abstractC8973w, Object obj, Writer writer) {
        abstractC8973w.mo34997t(abstractC8973w.mo35008g(obj), writer);
    }

    /* renamed from: F */
    public final boolean m35233F(Object obj, int i, int i2) {
        List list = (List) AbstractC22806wY1.m820H(obj, m35214Y(i));
        if (list.isEmpty()) {
            return true;
        }
        InterfaceC8961t m35179v = m35179v(i2);
        for (int i3 = 0; i3 < list.size(); i3++) {
            if (!m35179v.mo35118d(list.get(i3))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: G */
    public final boolean m35232G(Object obj, int i, int i2) {
        Map mo35252h = this.f57501q.mo35252h(AbstractC22806wY1.m820H(obj, m35214Y(i)));
        if (mo35252h.isEmpty()) {
            return true;
        }
        if (this.f57501q.mo35257c(m35181u(i2)).f57390c.getJavaType() != WireFormat.JavaType.MESSAGE) {
            return true;
        }
        InterfaceC8961t interfaceC8961t = null;
        for (Object obj2 : mo35252h.values()) {
            if (interfaceC8961t == null) {
                interfaceC8961t = C17878Jo1.m67679a().m67677c(obj2.getClass());
            }
            if (!interfaceC8961t.mo35118d(obj2)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: I */
    public final boolean m35230I(Object obj, Object obj2, int i) {
        long m35198l0 = m35198l0(i) & 1048575;
        if (AbstractC22806wY1.m824D(obj, m35198l0) == AbstractC22806wY1.m824D(obj2, m35198l0)) {
            return true;
        }
        return false;
    }

    /* renamed from: J */
    public final boolean m35229J(Object obj, int i, int i2) {
        if (AbstractC22806wY1.m824D(obj, m35198l0(i2) & 1048575) == i) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:244:?, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0094, code lost:
        r0 = r18.f57495k;
        r4 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0099, code lost:
        if (r0 >= r18.f57496l) goto L215;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x009b, code lost:
        r4 = m35189q(r21, r18.f57494j[r0], r4, r19, r21);
        r0 = r0 + 1;
        r3 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00b1, code lost:
        r10 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00b2, code lost:
        if (r4 == null) goto L220;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00b4, code lost:
        r7.mo35002o(r10, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00b7, code lost:
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:172:0x064f A[Catch: all -> 0x0675, TRY_LEAVE, TryCatch #6 {all -> 0x0675, blocks: (B:170:0x0649, B:172:0x064f, B:184:0x0679, B:185:0x067e), top: B:214:0x0649 }] */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0677  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x06b5 A[LOOP:4: B:198:0x06b1->B:200:0x06b5, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:202:0x06ca  */
    /* renamed from: N */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m35225N(com.google.protobuf.AbstractC8973w r19, com.google.protobuf.AbstractC8943g r20, java.lang.Object r21, com.google.protobuf.InterfaceC8960s r22, com.google.protobuf.ExtensionRegistryLite r23) {
        /*
            Method dump skipped, instructions count: 1884
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C8956p.m35225N(com.google.protobuf.w, com.google.protobuf.g, java.lang.Object, com.google.protobuf.s, com.google.protobuf.ExtensionRegistryLite):void");
    }

    /* renamed from: O */
    public final void m35224O(Object obj, int i, Object obj2, ExtensionRegistryLite extensionRegistryLite, InterfaceC8960s interfaceC8960s) {
        long m35214Y = m35214Y(m35172y0(i));
        Object m820H = AbstractC22806wY1.m820H(obj, m35214Y);
        if (m820H == null) {
            m820H = this.f57501q.mo35253g(obj2);
            AbstractC22806wY1.m803Y(obj, m35214Y, m820H);
        } else if (this.f57501q.mo35251i(m820H)) {
            Object mo35253g = this.f57501q.mo35253g(obj2);
            this.f57501q.mo35258b(mo35253g, m820H);
            AbstractC22806wY1.m803Y(obj, m35214Y, mo35253g);
            m820H = mo35253g;
        }
        interfaceC8960s.mo35154F(this.f57501q.mo35254f(m820H), this.f57501q.mo35257c(obj2), extensionRegistryLite);
    }

    /* renamed from: P */
    public final void m35223P(Object obj, Object obj2, int i) {
        if (!m35239C(obj2, i)) {
            return;
        }
        long m35214Y = m35214Y(m35172y0(i));
        Unsafe unsafe = f57484s;
        Object object = unsafe.getObject(obj2, m35214Y);
        if (object != null) {
            InterfaceC8961t m35179v = m35179v(i);
            if (!m35239C(obj, i)) {
                if (!m35231H(object)) {
                    unsafe.putObject(obj, m35214Y, object);
                } else {
                    Object newInstance = m35179v.newInstance();
                    m35179v.mo35120b(newInstance, object);
                    unsafe.putObject(obj, m35214Y, newInstance);
                }
                m35186r0(obj, i);
                return;
            }
            Object object2 = unsafe.getObject(obj, m35214Y);
            if (!m35231H(object2)) {
                Object newInstance2 = m35179v.newInstance();
                m35179v.mo35120b(newInstance2, object2);
                unsafe.putObject(obj, m35214Y, newInstance2);
                object2 = newInstance2;
            }
            m35179v.mo35120b(object2, object);
            return;
        }
        throw new IllegalStateException("Source subfield " + m35215X(i) + " is present but null: " + obj2);
    }

    /* renamed from: Q */
    public final void m35222Q(Object obj, Object obj2, int i) {
        int m35215X = m35215X(i);
        if (!m35229J(obj2, m35215X, i)) {
            return;
        }
        long m35214Y = m35214Y(m35172y0(i));
        Unsafe unsafe = f57484s;
        Object object = unsafe.getObject(obj2, m35214Y);
        if (object != null) {
            InterfaceC8961t m35179v = m35179v(i);
            if (!m35229J(obj, m35215X, i)) {
                if (!m35231H(object)) {
                    unsafe.putObject(obj, m35214Y, object);
                } else {
                    Object newInstance = m35179v.newInstance();
                    m35179v.mo35120b(newInstance, object);
                    unsafe.putObject(obj, m35214Y, newInstance);
                }
                m35184s0(obj, m35215X, i);
                return;
            }
            Object object2 = unsafe.getObject(obj, m35214Y);
            if (!m35231H(object2)) {
                Object newInstance2 = m35179v.newInstance();
                m35179v.mo35120b(newInstance2, object2);
                unsafe.putObject(obj, m35214Y, newInstance2);
                object2 = newInstance2;
            }
            m35179v.mo35120b(object2, object);
            return;
        }
        throw new IllegalStateException("Source subfield " + m35215X(i) + " is present but null: " + obj2);
    }

    /* renamed from: R */
    public final void m35221R(Object obj, Object obj2, int i) {
        int m35172y0 = m35172y0(i);
        long m35214Y = m35214Y(m35172y0);
        int m35215X = m35215X(i);
        switch (m35174x0(m35172y0)) {
            case 0:
                if (m35239C(obj2, i)) {
                    AbstractC22806wY1.m807U(obj, m35214Y, AbstractC22806wY1.m826B(obj2, m35214Y));
                    m35186r0(obj, i);
                    return;
                }
                return;
            case 1:
                if (m35239C(obj2, i)) {
                    AbstractC22806wY1.m806V(obj, m35214Y, AbstractC22806wY1.m825C(obj2, m35214Y));
                    m35186r0(obj, i);
                    return;
                }
                return;
            case 2:
                if (m35239C(obj2, i)) {
                    AbstractC22806wY1.m804X(obj, m35214Y, AbstractC22806wY1.m822F(obj2, m35214Y));
                    m35186r0(obj, i);
                    return;
                }
                return;
            case 3:
                if (m35239C(obj2, i)) {
                    AbstractC22806wY1.m804X(obj, m35214Y, AbstractC22806wY1.m822F(obj2, m35214Y));
                    m35186r0(obj, i);
                    return;
                }
                return;
            case 4:
                if (m35239C(obj2, i)) {
                    AbstractC22806wY1.m805W(obj, m35214Y, AbstractC22806wY1.m824D(obj2, m35214Y));
                    m35186r0(obj, i);
                    return;
                }
                return;
            case 5:
                if (m35239C(obj2, i)) {
                    AbstractC22806wY1.m804X(obj, m35214Y, AbstractC22806wY1.m822F(obj2, m35214Y));
                    m35186r0(obj, i);
                    return;
                }
                return;
            case 6:
                if (m35239C(obj2, i)) {
                    AbstractC22806wY1.m805W(obj, m35214Y, AbstractC22806wY1.m824D(obj2, m35214Y));
                    m35186r0(obj, i);
                    return;
                }
                return;
            case 7:
                if (m35239C(obj2, i)) {
                    AbstractC22806wY1.m814N(obj, m35214Y, AbstractC22806wY1.m780u(obj2, m35214Y));
                    m35186r0(obj, i);
                    return;
                }
                return;
            case 8:
                if (m35239C(obj2, i)) {
                    AbstractC22806wY1.m803Y(obj, m35214Y, AbstractC22806wY1.m820H(obj2, m35214Y));
                    m35186r0(obj, i);
                    return;
                }
                return;
            case 9:
                m35223P(obj, obj2, i);
                return;
            case 10:
                if (m35239C(obj2, i)) {
                    AbstractC22806wY1.m803Y(obj, m35214Y, AbstractC22806wY1.m820H(obj2, m35214Y));
                    m35186r0(obj, i);
                    return;
                }
                return;
            case 11:
                if (m35239C(obj2, i)) {
                    AbstractC22806wY1.m805W(obj, m35214Y, AbstractC22806wY1.m824D(obj2, m35214Y));
                    m35186r0(obj, i);
                    return;
                }
                return;
            case 12:
                if (m35239C(obj2, i)) {
                    AbstractC22806wY1.m805W(obj, m35214Y, AbstractC22806wY1.m824D(obj2, m35214Y));
                    m35186r0(obj, i);
                    return;
                }
                return;
            case 13:
                if (m35239C(obj2, i)) {
                    AbstractC22806wY1.m805W(obj, m35214Y, AbstractC22806wY1.m824D(obj2, m35214Y));
                    m35186r0(obj, i);
                    return;
                }
                return;
            case 14:
                if (m35239C(obj2, i)) {
                    AbstractC22806wY1.m804X(obj, m35214Y, AbstractC22806wY1.m822F(obj2, m35214Y));
                    m35186r0(obj, i);
                    return;
                }
                return;
            case 15:
                if (m35239C(obj2, i)) {
                    AbstractC22806wY1.m805W(obj, m35214Y, AbstractC22806wY1.m824D(obj2, m35214Y));
                    m35186r0(obj, i);
                    return;
                }
                return;
            case 16:
                if (m35239C(obj2, i)) {
                    AbstractC22806wY1.m804X(obj, m35214Y, AbstractC22806wY1.m822F(obj2, m35214Y));
                    m35186r0(obj, i);
                    return;
                }
                return;
            case 17:
                m35223P(obj, obj2, i);
                return;
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 47:
            case 48:
            case 49:
                this.f57498n.mo35271d(obj, obj2, m35214Y);
                return;
            case 50:
                AbstractC8962u.m35107F(this.f57501q, obj, obj2, m35214Y);
                return;
            case EACTags.TRANSACTION_DATE /* 51 */:
            case EACTags.CARD_SEQUENCE_NUMBER /* 52 */:
            case EACTags.SEX /* 53 */:
            case 54:
            case 55:
            case 56:
            case 57:
            case EACTags.DYNAMIC_INTERNAL_AUTHENTIFICATION /* 58 */:
            case EACTags.DYNAMIC_EXTERNAL_AUTHENTIFICATION /* 59 */:
                if (m35229J(obj2, m35215X, i)) {
                    AbstractC22806wY1.m803Y(obj, m35214Y, AbstractC22806wY1.m820H(obj2, m35214Y));
                    m35184s0(obj, m35215X, i);
                    return;
                }
                return;
            case 60:
                m35222Q(obj, obj2, i);
                return;
            case 61:
            case 62:
            case 63:
            case 64:
            case EACTags.ELEMENT_LIST /* 65 */:
            case EACTags.ADDRESS /* 66 */:
            case EACTags.CARDHOLDER_HANDWRITTEN_SIGNATURE /* 67 */:
                if (m35229J(obj2, m35215X, i)) {
                    AbstractC22806wY1.m803Y(obj, m35214Y, AbstractC22806wY1.m820H(obj2, m35214Y));
                    m35184s0(obj, m35215X, i);
                    return;
                }
                return;
            case EACTags.APPLICATION_IMAGE /* 68 */:
                m35222Q(obj, obj2, i);
                return;
            default:
                return;
        }
    }

    /* renamed from: S */
    public final Object m35220S(Object obj, int i) {
        InterfaceC8961t m35179v = m35179v(i);
        long m35214Y = m35214Y(m35172y0(i));
        if (!m35239C(obj, i)) {
            return m35179v.newInstance();
        }
        Object object = f57484s.getObject(obj, m35214Y);
        if (m35231H(object)) {
            return object;
        }
        Object newInstance = m35179v.newInstance();
        if (object != null) {
            m35179v.mo35120b(newInstance, object);
        }
        return newInstance;
    }

    /* renamed from: T */
    public final Object m35219T(Object obj, int i, int i2) {
        InterfaceC8961t m35179v = m35179v(i2);
        if (!m35229J(obj, i, i2)) {
            return m35179v.newInstance();
        }
        Object object = f57484s.getObject(obj, m35214Y(m35172y0(i2)));
        if (m35231H(object)) {
            return object;
        }
        Object newInstance = m35179v.newInstance();
        if (object != null) {
            m35179v.mo35120b(newInstance, object);
        }
        return newInstance;
    }

    /* renamed from: X */
    public final int m35215X(int i) {
        return this.f57485a[i];
    }

    @Override // com.google.protobuf.InterfaceC8961t
    /* renamed from: a */
    public boolean mo35121a(Object obj, Object obj2) {
        int length = this.f57485a.length;
        for (int i = 0; i < length; i += 3) {
            if (!m35191p(obj, obj2, i)) {
                return false;
            }
        }
        if (!this.f57499o.mo35008g(obj).equals(this.f57499o.mo35008g(obj2))) {
            return false;
        }
        if (this.f57490f) {
            return this.f57500p.mo35302c(obj).equals(this.f57500p.mo35302c(obj2));
        }
        return true;
    }

    @Override // com.google.protobuf.InterfaceC8961t
    /* renamed from: b */
    public void mo35120b(Object obj, Object obj2) {
        m35199l(obj);
        obj2.getClass();
        for (int i = 0; i < this.f57485a.length; i += 3) {
            m35221R(obj, obj2, i);
        }
        AbstractC8962u.m35106G(this.f57499o, obj, obj2);
        if (this.f57490f) {
            AbstractC8962u.m35108E(this.f57500p, obj, obj2);
        }
    }

    @Override // com.google.protobuf.InterfaceC8961t
    /* renamed from: c */
    public int mo35119c(Object obj) {
        int i;
        int hashLong;
        int length = this.f57485a.length;
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3 += 3) {
            int m35172y0 = m35172y0(i3);
            int m35215X = m35215X(i3);
            long m35214Y = m35214Y(m35172y0);
            int i4 = 37;
            switch (m35174x0(m35172y0)) {
                case 0:
                    i = i2 * 53;
                    hashLong = Internal.hashLong(Double.doubleToLongBits(AbstractC22806wY1.m826B(obj, m35214Y)));
                    i2 = i + hashLong;
                    break;
                case 1:
                    i = i2 * 53;
                    hashLong = Float.floatToIntBits(AbstractC22806wY1.m825C(obj, m35214Y));
                    i2 = i + hashLong;
                    break;
                case 2:
                    i = i2 * 53;
                    hashLong = Internal.hashLong(AbstractC22806wY1.m822F(obj, m35214Y));
                    i2 = i + hashLong;
                    break;
                case 3:
                    i = i2 * 53;
                    hashLong = Internal.hashLong(AbstractC22806wY1.m822F(obj, m35214Y));
                    i2 = i + hashLong;
                    break;
                case 4:
                    i = i2 * 53;
                    hashLong = AbstractC22806wY1.m824D(obj, m35214Y);
                    i2 = i + hashLong;
                    break;
                case 5:
                    i = i2 * 53;
                    hashLong = Internal.hashLong(AbstractC22806wY1.m822F(obj, m35214Y));
                    i2 = i + hashLong;
                    break;
                case 6:
                    i = i2 * 53;
                    hashLong = AbstractC22806wY1.m824D(obj, m35214Y);
                    i2 = i + hashLong;
                    break;
                case 7:
                    i = i2 * 53;
                    hashLong = Internal.hashBoolean(AbstractC22806wY1.m780u(obj, m35214Y));
                    i2 = i + hashLong;
                    break;
                case 8:
                    i = i2 * 53;
                    hashLong = ((String) AbstractC22806wY1.m820H(obj, m35214Y)).hashCode();
                    i2 = i + hashLong;
                    break;
                case 9:
                    Object m820H = AbstractC22806wY1.m820H(obj, m35214Y);
                    if (m820H != null) {
                        i4 = m820H.hashCode();
                    }
                    i2 = (i2 * 53) + i4;
                    break;
                case 10:
                    i = i2 * 53;
                    hashLong = AbstractC22806wY1.m820H(obj, m35214Y).hashCode();
                    i2 = i + hashLong;
                    break;
                case 11:
                    i = i2 * 53;
                    hashLong = AbstractC22806wY1.m824D(obj, m35214Y);
                    i2 = i + hashLong;
                    break;
                case 12:
                    i = i2 * 53;
                    hashLong = AbstractC22806wY1.m824D(obj, m35214Y);
                    i2 = i + hashLong;
                    break;
                case 13:
                    i = i2 * 53;
                    hashLong = AbstractC22806wY1.m824D(obj, m35214Y);
                    i2 = i + hashLong;
                    break;
                case 14:
                    i = i2 * 53;
                    hashLong = Internal.hashLong(AbstractC22806wY1.m822F(obj, m35214Y));
                    i2 = i + hashLong;
                    break;
                case 15:
                    i = i2 * 53;
                    hashLong = AbstractC22806wY1.m824D(obj, m35214Y);
                    i2 = i + hashLong;
                    break;
                case 16:
                    i = i2 * 53;
                    hashLong = Internal.hashLong(AbstractC22806wY1.m822F(obj, m35214Y));
                    i2 = i + hashLong;
                    break;
                case 17:
                    Object m820H2 = AbstractC22806wY1.m820H(obj, m35214Y);
                    if (m820H2 != null) {
                        i4 = m820H2.hashCode();
                    }
                    i2 = (i2 * 53) + i4;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    i = i2 * 53;
                    hashLong = AbstractC22806wY1.m820H(obj, m35214Y).hashCode();
                    i2 = i + hashLong;
                    break;
                case 50:
                    i = i2 * 53;
                    hashLong = AbstractC22806wY1.m820H(obj, m35214Y).hashCode();
                    i2 = i + hashLong;
                    break;
                case EACTags.TRANSACTION_DATE /* 51 */:
                    if (m35229J(obj, m35215X, i3)) {
                        i = i2 * 53;
                        hashLong = Internal.hashLong(Double.doubleToLongBits(m35212a0(obj, m35214Y)));
                        i2 = i + hashLong;
                        break;
                    } else {
                        break;
                    }
                case EACTags.CARD_SEQUENCE_NUMBER /* 52 */:
                    if (m35229J(obj, m35215X, i3)) {
                        i = i2 * 53;
                        hashLong = Float.floatToIntBits(m35211b0(obj, m35214Y));
                        i2 = i + hashLong;
                        break;
                    } else {
                        break;
                    }
                case EACTags.SEX /* 53 */:
                    if (m35229J(obj, m35215X, i3)) {
                        i = i2 * 53;
                        hashLong = Internal.hashLong(m35209d0(obj, m35214Y));
                        i2 = i + hashLong;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (m35229J(obj, m35215X, i3)) {
                        i = i2 * 53;
                        hashLong = Internal.hashLong(m35209d0(obj, m35214Y));
                        i2 = i + hashLong;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (m35229J(obj, m35215X, i3)) {
                        i = i2 * 53;
                        hashLong = m35210c0(obj, m35214Y);
                        i2 = i + hashLong;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (m35229J(obj, m35215X, i3)) {
                        i = i2 * 53;
                        hashLong = Internal.hashLong(m35209d0(obj, m35214Y));
                        i2 = i + hashLong;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (m35229J(obj, m35215X, i3)) {
                        i = i2 * 53;
                        hashLong = m35210c0(obj, m35214Y);
                        i2 = i + hashLong;
                        break;
                    } else {
                        break;
                    }
                case EACTags.DYNAMIC_INTERNAL_AUTHENTIFICATION /* 58 */:
                    if (m35229J(obj, m35215X, i3)) {
                        i = i2 * 53;
                        hashLong = Internal.hashBoolean(m35213Z(obj, m35214Y));
                        i2 = i + hashLong;
                        break;
                    } else {
                        break;
                    }
                case EACTags.DYNAMIC_EXTERNAL_AUTHENTIFICATION /* 59 */:
                    if (m35229J(obj, m35215X, i3)) {
                        i = i2 * 53;
                        hashLong = ((String) AbstractC22806wY1.m820H(obj, m35214Y)).hashCode();
                        i2 = i + hashLong;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (m35229J(obj, m35215X, i3)) {
                        i = i2 * 53;
                        hashLong = AbstractC22806wY1.m820H(obj, m35214Y).hashCode();
                        i2 = i + hashLong;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (m35229J(obj, m35215X, i3)) {
                        i = i2 * 53;
                        hashLong = AbstractC22806wY1.m820H(obj, m35214Y).hashCode();
                        i2 = i + hashLong;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (m35229J(obj, m35215X, i3)) {
                        i = i2 * 53;
                        hashLong = m35210c0(obj, m35214Y);
                        i2 = i + hashLong;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (m35229J(obj, m35215X, i3)) {
                        i = i2 * 53;
                        hashLong = m35210c0(obj, m35214Y);
                        i2 = i + hashLong;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (m35229J(obj, m35215X, i3)) {
                        i = i2 * 53;
                        hashLong = m35210c0(obj, m35214Y);
                        i2 = i + hashLong;
                        break;
                    } else {
                        break;
                    }
                case EACTags.ELEMENT_LIST /* 65 */:
                    if (m35229J(obj, m35215X, i3)) {
                        i = i2 * 53;
                        hashLong = Internal.hashLong(m35209d0(obj, m35214Y));
                        i2 = i + hashLong;
                        break;
                    } else {
                        break;
                    }
                case EACTags.ADDRESS /* 66 */:
                    if (m35229J(obj, m35215X, i3)) {
                        i = i2 * 53;
                        hashLong = m35210c0(obj, m35214Y);
                        i2 = i + hashLong;
                        break;
                    } else {
                        break;
                    }
                case EACTags.CARDHOLDER_HANDWRITTEN_SIGNATURE /* 67 */:
                    if (m35229J(obj, m35215X, i3)) {
                        i = i2 * 53;
                        hashLong = Internal.hashLong(m35209d0(obj, m35214Y));
                        i2 = i + hashLong;
                        break;
                    } else {
                        break;
                    }
                case EACTags.APPLICATION_IMAGE /* 68 */:
                    if (m35229J(obj, m35215X, i3)) {
                        i = i2 * 53;
                        hashLong = AbstractC22806wY1.m820H(obj, m35214Y).hashCode();
                        i2 = i + hashLong;
                        break;
                    } else {
                        break;
                    }
            }
        }
        int hashCode = (i2 * 53) + this.f57499o.mo35008g(obj).hashCode();
        return this.f57490f ? (hashCode * 53) + this.f57500p.mo35302c(obj).hashCode() : hashCode;
    }

    @Override // com.google.protobuf.InterfaceC8961t
    /* renamed from: d */
    public final boolean mo35118d(Object obj) {
        int i;
        int i2;
        int i3 = 1048575;
        int i4 = 0;
        int i5 = 0;
        while (i5 < this.f57495k) {
            int i6 = this.f57494j[i5];
            int m35215X = m35215X(i6);
            int m35172y0 = m35172y0(i6);
            int i7 = this.f57485a[i6 + 2];
            int i8 = i7 & 1048575;
            int i9 = 1 << (i7 >>> 20);
            if (i8 != i3) {
                if (i8 != 1048575) {
                    i4 = f57484s.getInt(obj, i8);
                }
                i2 = i4;
                i = i8;
            } else {
                i = i3;
                i2 = i4;
            }
            if (m35228K(m35172y0) && !m35237D(obj, i6, i, i2, i9)) {
                return false;
            }
            int m35174x0 = m35174x0(m35172y0);
            if (m35174x0 != 9 && m35174x0 != 17) {
                if (m35174x0 != 27) {
                    if (m35174x0 != 60 && m35174x0 != 68) {
                        if (m35174x0 != 49) {
                            if (m35174x0 == 50 && !m35232G(obj, m35172y0, i6)) {
                                return false;
                            }
                        }
                    } else if (m35229J(obj, m35215X, i6) && !m35235E(obj, m35172y0, m35179v(i6))) {
                        return false;
                    }
                }
                if (!m35233F(obj, m35172y0, i6)) {
                    return false;
                }
            } else if (m35237D(obj, i6, i, i2, i9) && !m35235E(obj, m35172y0, m35179v(i6))) {
                return false;
            }
            i5++;
            i3 = i;
            i4 = i2;
        }
        if (this.f57490f && !this.f57500p.mo35302c(obj).m35853t()) {
            return false;
        }
        return true;
    }

    @Override // com.google.protobuf.InterfaceC8961t
    /* renamed from: e */
    public void mo35117e(Object obj) {
        if (!m35231H(obj)) {
            return;
        }
        if (obj instanceof GeneratedMessageLite) {
            GeneratedMessageLite generatedMessageLite = (GeneratedMessageLite) obj;
            generatedMessageLite.m35829l();
            generatedMessageLite.m35830k();
            generatedMessageLite.m35820u();
        }
        int length = this.f57485a.length;
        for (int i = 0; i < length; i += 3) {
            int m35172y0 = m35172y0(i);
            long m35214Y = m35214Y(m35172y0);
            int m35174x0 = m35174x0(m35172y0);
            if (m35174x0 != 9) {
                switch (m35174x0) {
                    case 17:
                        break;
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                    case 33:
                    case 34:
                    case 35:
                    case 36:
                    case 37:
                    case 38:
                    case 39:
                    case 40:
                    case 41:
                    case 42:
                    case 43:
                    case 44:
                    case 45:
                    case 46:
                    case 47:
                    case 48:
                    case 49:
                        this.f57498n.mo35272c(obj, m35214Y);
                        continue;
                    case 50:
                        Unsafe unsafe = f57484s;
                        Object object = unsafe.getObject(obj, m35214Y);
                        if (object != null) {
                            unsafe.putObject(obj, m35214Y, this.f57501q.mo35256d(object));
                        } else {
                            continue;
                        }
                    default:
                }
            }
            if (m35239C(obj, i)) {
                m35179v(i).mo35117e(f57484s.getObject(obj, m35214Y));
            }
        }
        this.f57499o.mo35005j(obj);
        if (this.f57490f) {
            this.f57500p.mo35299f(obj);
        }
    }

    /* renamed from: e0 */
    public final int m35208e0(Object obj, byte[] bArr, int i, int i2, int i3, long j, AbstractC8934b.C8936b c8936b) {
        Unsafe unsafe = f57484s;
        Object m35181u = m35181u(i3);
        Object object = unsafe.getObject(obj, j);
        if (this.f57501q.mo35251i(object)) {
            Object mo35253g = this.f57501q.mo35253g(m35181u);
            this.f57501q.mo35258b(mo35253g, object);
            unsafe.putObject(obj, j, mo35253g);
            object = mo35253g;
        }
        return m35197m(bArr, i, i2, this.f57501q.mo35257c(m35181u), this.f57501q.mo35254f(object), c8936b);
    }

    @Override // com.google.protobuf.InterfaceC8961t
    /* renamed from: f */
    public int mo35116f(Object obj) {
        if (this.f57492h) {
            return m35173y(obj);
        }
        return m35175x(obj);
    }

    /* renamed from: f0 */
    public final int m35207f0(Object obj, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, int i8, AbstractC8934b.C8936b c8936b) {
        Unsafe unsafe = f57484s;
        long j2 = this.f57485a[i8 + 2] & 1048575;
        switch (i7) {
            case EACTags.TRANSACTION_DATE /* 51 */:
                if (i5 == 1) {
                    unsafe.putObject(obj, j, Double.valueOf(AbstractC8934b.m35403d(bArr, i)));
                    int i9 = i + 8;
                    unsafe.putInt(obj, j2, i4);
                    return i9;
                }
                break;
            case EACTags.CARD_SEQUENCE_NUMBER /* 52 */:
                if (i5 == 5) {
                    unsafe.putObject(obj, j, Float.valueOf(AbstractC8934b.m35395l(bArr, i)));
                    int i10 = i + 4;
                    unsafe.putInt(obj, j2, i4);
                    return i10;
                }
                break;
            case EACTags.SEX /* 53 */:
            case 54:
                if (i5 == 0) {
                    int m35411L = AbstractC8934b.m35411L(bArr, i, c8936b);
                    unsafe.putObject(obj, j, Long.valueOf(c8936b.f57453b));
                    unsafe.putInt(obj, j2, i4);
                    return m35411L;
                }
                break;
            case 55:
            case 62:
                if (i5 == 0) {
                    int m35414I = AbstractC8934b.m35414I(bArr, i, c8936b);
                    unsafe.putObject(obj, j, Integer.valueOf(c8936b.f57452a));
                    unsafe.putInt(obj, j2, i4);
                    return m35414I;
                }
                break;
            case 56:
            case EACTags.ELEMENT_LIST /* 65 */:
                if (i5 == 1) {
                    unsafe.putObject(obj, j, Long.valueOf(AbstractC8934b.m35397j(bArr, i)));
                    int i11 = i + 8;
                    unsafe.putInt(obj, j2, i4);
                    return i11;
                }
                break;
            case 57:
            case 64:
                if (i5 == 5) {
                    unsafe.putObject(obj, j, Integer.valueOf(AbstractC8934b.m35399h(bArr, i)));
                    int i12 = i + 4;
                    unsafe.putInt(obj, j2, i4);
                    return i12;
                }
                break;
            case EACTags.DYNAMIC_INTERNAL_AUTHENTIFICATION /* 58 */:
                if (i5 == 0) {
                    int m35411L2 = AbstractC8934b.m35411L(bArr, i, c8936b);
                    unsafe.putObject(obj, j, Boolean.valueOf(c8936b.f57453b != 0));
                    unsafe.putInt(obj, j2, i4);
                    return m35411L2;
                }
                break;
            case EACTags.DYNAMIC_EXTERNAL_AUTHENTIFICATION /* 59 */:
                if (i5 == 2) {
                    int m35414I2 = AbstractC8934b.m35414I(bArr, i, c8936b);
                    int i13 = c8936b.f57452a;
                    if (i13 == 0) {
                        unsafe.putObject(obj, j, "");
                    } else if ((i6 & PKIFailureInfo.duplicateCertReq) != 0 && !Utf8.m35504u(bArr, m35414I2, m35414I2 + i13)) {
                        throw InvalidProtocolBufferException.invalidUtf8();
                    } else {
                        unsafe.putObject(obj, j, new String(bArr, m35414I2, i13, Internal.f57358b));
                        m35414I2 += i13;
                    }
                    unsafe.putInt(obj, j2, i4);
                    return m35414I2;
                }
                break;
            case 60:
                if (i5 == 2) {
                    Object m35219T = m35219T(obj, i4, i8);
                    int m35408O = AbstractC8934b.m35408O(m35219T, m35179v(i8), bArr, i, i2, c8936b);
                    m35176w0(obj, i4, i8, m35219T);
                    return m35408O;
                }
                break;
            case 61:
                if (i5 == 2) {
                    int m35405b = AbstractC8934b.m35405b(bArr, i, c8936b);
                    unsafe.putObject(obj, j, c8936b.f57454c);
                    unsafe.putInt(obj, j2, i4);
                    return m35405b;
                }
                break;
            case 63:
                if (i5 == 0) {
                    int m35414I3 = AbstractC8934b.m35414I(bArr, i, c8936b);
                    int i14 = c8936b.f57452a;
                    Internal.EnumVerifier m35183t = m35183t(i8);
                    if (m35183t != null && !m35183t.isInRange(i14)) {
                        m35177w(obj).m35534n(i3, Long.valueOf(i14));
                    } else {
                        unsafe.putObject(obj, j, Integer.valueOf(i14));
                        unsafe.putInt(obj, j2, i4);
                    }
                    return m35414I3;
                }
                break;
            case EACTags.ADDRESS /* 66 */:
                if (i5 == 0) {
                    int m35414I4 = AbstractC8934b.m35414I(bArr, i, c8936b);
                    unsafe.putObject(obj, j, Integer.valueOf(CodedInputStream.decodeZigZag32(c8936b.f57452a)));
                    unsafe.putInt(obj, j2, i4);
                    return m35414I4;
                }
                break;
            case EACTags.CARDHOLDER_HANDWRITTEN_SIGNATURE /* 67 */:
                if (i5 == 0) {
                    int m35411L3 = AbstractC8934b.m35411L(bArr, i, c8936b);
                    unsafe.putObject(obj, j, Long.valueOf(CodedInputStream.decodeZigZag64(c8936b.f57453b)));
                    unsafe.putInt(obj, j2, i4);
                    return m35411L3;
                }
                break;
            case EACTags.APPLICATION_IMAGE /* 68 */:
                if (i5 == 3) {
                    Object m35219T2 = m35219T(obj, i4, i8);
                    int m35409N = AbstractC8934b.m35409N(m35219T2, m35179v(i8), bArr, i, i2, (i3 & (-8)) | 4, c8936b);
                    m35176w0(obj, i4, i8, m35219T2);
                    return m35409N;
                }
                break;
        }
        return i;
    }

    @Override // com.google.protobuf.InterfaceC8961t
    /* renamed from: g */
    public void mo35115g(Object obj, Writer writer) {
        if (writer.mo35360A() == Writer.FieldOrder.DESCENDING) {
            m35240B0(obj, writer);
        } else if (this.f57492h) {
            m35242A0(obj, writer);
        } else {
            m35170z0(obj, writer);
        }
    }

    /* renamed from: g0 */
    public int m35206g0(Object obj, byte[] bArr, int i, int i2, int i3, AbstractC8934b.C8936b c8936b) {
        Unsafe unsafe;
        int i4;
        C8956p c8956p;
        int i5;
        int i6;
        int i7;
        int i8;
        Object obj2;
        byte b;
        int m35202j0;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        byte[] bArr2;
        int m35411L;
        boolean z;
        int i19;
        int i20;
        int i21;
        C8956p c8956p2 = this;
        Object obj3 = obj;
        byte[] bArr3 = bArr;
        int i22 = i2;
        int i23 = i3;
        AbstractC8934b.C8936b c8936b2 = c8936b;
        m35199l(obj);
        Unsafe unsafe2 = f57484s;
        int i24 = i;
        int i25 = -1;
        int i26 = 0;
        int i27 = 0;
        int i28 = 0;
        int i29 = 1048575;
        while (true) {
            if (i24 < i22) {
                int i30 = i24 + 1;
                byte b2 = bArr3[i24];
                if (b2 < 0) {
                    int m35415H = AbstractC8934b.m35415H(b2, bArr3, i30, c8936b2);
                    b = c8936b2.f57452a;
                    i30 = m35415H;
                } else {
                    b = b2;
                }
                int i31 = b >>> 3;
                int i32 = b & 7;
                if (i31 > i25) {
                    m35202j0 = c8956p2.m35200k0(i31, i26 / 3);
                } else {
                    m35202j0 = c8956p2.m35202j0(i31);
                }
                int i33 = m35202j0;
                if (i33 == -1) {
                    i9 = i31;
                    i10 = i30;
                    i6 = b;
                    i11 = i28;
                    i12 = i29;
                    unsafe = unsafe2;
                    i4 = i23;
                    i13 = 0;
                } else {
                    int i34 = c8956p2.f57485a[i33 + 1];
                    int m35174x0 = m35174x0(i34);
                    long m35214Y = m35214Y(i34);
                    int i35 = b;
                    if (m35174x0 <= 17) {
                        int i36 = c8956p2.f57485a[i33 + 2];
                        int i37 = 1 << (i36 >>> 20);
                        int i38 = i36 & 1048575;
                        if (i38 != i29) {
                            if (i29 != 1048575) {
                                unsafe2.putInt(obj3, i29, i28);
                            }
                            i15 = i38;
                            i14 = unsafe2.getInt(obj3, i38);
                        } else {
                            i14 = i28;
                            i15 = i29;
                        }
                        switch (m35174x0) {
                            case 0:
                                bArr2 = bArr;
                                i9 = i31;
                                i18 = i33;
                                i16 = i15;
                                i17 = i35;
                                if (i32 == 1) {
                                    AbstractC22806wY1.m807U(obj3, m35214Y, AbstractC8934b.m35403d(bArr2, i30));
                                    i24 = i30 + 8;
                                    i28 = i14 | i37;
                                    i23 = i3;
                                    i26 = i18;
                                    i27 = i17;
                                    i25 = i9;
                                    i29 = i16;
                                    bArr3 = bArr2;
                                    break;
                                } else {
                                    i12 = i16;
                                    i4 = i3;
                                    i10 = i30;
                                    i13 = i18;
                                    unsafe = unsafe2;
                                    i11 = i14;
                                    i6 = i17;
                                    break;
                                }
                            case 1:
                                bArr2 = bArr;
                                i9 = i31;
                                i18 = i33;
                                i16 = i15;
                                i17 = i35;
                                if (i32 == 5) {
                                    AbstractC22806wY1.m806V(obj3, m35214Y, AbstractC8934b.m35395l(bArr2, i30));
                                    i24 = i30 + 4;
                                    i28 = i14 | i37;
                                    i23 = i3;
                                    i26 = i18;
                                    i27 = i17;
                                    i25 = i9;
                                    i29 = i16;
                                    bArr3 = bArr2;
                                    break;
                                } else {
                                    i12 = i16;
                                    i4 = i3;
                                    i10 = i30;
                                    i13 = i18;
                                    unsafe = unsafe2;
                                    i11 = i14;
                                    i6 = i17;
                                    break;
                                }
                            case 2:
                            case 3:
                                bArr2 = bArr;
                                i9 = i31;
                                i18 = i33;
                                i16 = i15;
                                i17 = i35;
                                if (i32 == 0) {
                                    m35411L = AbstractC8934b.m35411L(bArr2, i30, c8936b2);
                                    unsafe2.putLong(obj, m35214Y, c8936b2.f57453b);
                                    i28 = i14 | i37;
                                    i23 = i3;
                                    i26 = i18;
                                    i24 = m35411L;
                                    i27 = i17;
                                    i25 = i9;
                                    i29 = i16;
                                    bArr3 = bArr2;
                                    break;
                                } else {
                                    i12 = i16;
                                    i4 = i3;
                                    i10 = i30;
                                    i13 = i18;
                                    unsafe = unsafe2;
                                    i11 = i14;
                                    i6 = i17;
                                    break;
                                }
                            case 4:
                            case 11:
                                bArr2 = bArr;
                                i9 = i31;
                                i18 = i33;
                                i16 = i15;
                                i17 = i35;
                                if (i32 == 0) {
                                    i24 = AbstractC8934b.m35414I(bArr2, i30, c8936b2);
                                    unsafe2.putInt(obj3, m35214Y, c8936b2.f57452a);
                                    i28 = i14 | i37;
                                    i23 = i3;
                                    i26 = i18;
                                    i27 = i17;
                                    i25 = i9;
                                    i29 = i16;
                                    bArr3 = bArr2;
                                    break;
                                } else {
                                    i12 = i16;
                                    i4 = i3;
                                    i10 = i30;
                                    i13 = i18;
                                    unsafe = unsafe2;
                                    i11 = i14;
                                    i6 = i17;
                                    break;
                                }
                            case 5:
                            case 14:
                                bArr2 = bArr;
                                i9 = i31;
                                i18 = i33;
                                i16 = i15;
                                i17 = i35;
                                if (i32 == 1) {
                                    unsafe2.putLong(obj, m35214Y, AbstractC8934b.m35397j(bArr2, i30));
                                    i24 = i30 + 8;
                                    i28 = i14 | i37;
                                    i23 = i3;
                                    i26 = i18;
                                    i27 = i17;
                                    i25 = i9;
                                    i29 = i16;
                                    bArr3 = bArr2;
                                    break;
                                } else {
                                    i12 = i16;
                                    i4 = i3;
                                    i10 = i30;
                                    i13 = i18;
                                    unsafe = unsafe2;
                                    i11 = i14;
                                    i6 = i17;
                                    break;
                                }
                            case 6:
                            case 13:
                                bArr2 = bArr;
                                i9 = i31;
                                i18 = i33;
                                i16 = i15;
                                i17 = i35;
                                if (i32 == 5) {
                                    unsafe2.putInt(obj3, m35214Y, AbstractC8934b.m35399h(bArr2, i30));
                                    i24 = i30 + 4;
                                    i28 = i14 | i37;
                                    i23 = i3;
                                    i26 = i18;
                                    i27 = i17;
                                    i25 = i9;
                                    i29 = i16;
                                    bArr3 = bArr2;
                                    break;
                                } else {
                                    i12 = i16;
                                    i4 = i3;
                                    i10 = i30;
                                    i13 = i18;
                                    unsafe = unsafe2;
                                    i11 = i14;
                                    i6 = i17;
                                    break;
                                }
                            case 7:
                                bArr2 = bArr;
                                i9 = i31;
                                i18 = i33;
                                i16 = i15;
                                i17 = i35;
                                if (i32 == 0) {
                                    i24 = AbstractC8934b.m35411L(bArr2, i30, c8936b2);
                                    if (c8936b2.f57453b != 0) {
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                    AbstractC22806wY1.m814N(obj3, m35214Y, z);
                                    i28 = i14 | i37;
                                    i23 = i3;
                                    i26 = i18;
                                    i27 = i17;
                                    i25 = i9;
                                    i29 = i16;
                                    bArr3 = bArr2;
                                    break;
                                } else {
                                    i12 = i16;
                                    i4 = i3;
                                    i10 = i30;
                                    i13 = i18;
                                    unsafe = unsafe2;
                                    i11 = i14;
                                    i6 = i17;
                                    break;
                                }
                            case 8:
                                bArr2 = bArr;
                                i9 = i31;
                                i18 = i33;
                                i16 = i15;
                                i17 = i35;
                                if (i32 == 2) {
                                    if ((536870912 & i34) == 0) {
                                        i24 = AbstractC8934b.m35420C(bArr2, i30, c8936b2);
                                    } else {
                                        i24 = AbstractC8934b.m35417F(bArr2, i30, c8936b2);
                                    }
                                    unsafe2.putObject(obj3, m35214Y, c8936b2.f57454c);
                                    i28 = i14 | i37;
                                    i23 = i3;
                                    i26 = i18;
                                    i27 = i17;
                                    i25 = i9;
                                    i29 = i16;
                                    bArr3 = bArr2;
                                    break;
                                } else {
                                    i12 = i16;
                                    i4 = i3;
                                    i10 = i30;
                                    i13 = i18;
                                    unsafe = unsafe2;
                                    i11 = i14;
                                    i6 = i17;
                                    break;
                                }
                            case 9:
                                bArr2 = bArr;
                                i9 = i31;
                                i18 = i33;
                                i16 = i15;
                                i17 = i35;
                                if (i32 == 2) {
                                    Object m35220S = c8956p2.m35220S(obj3, i18);
                                    i24 = AbstractC8934b.m35408O(m35220S, c8956p2.m35179v(i18), bArr, i30, i2, c8936b);
                                    c8956p2.m35178v0(obj3, i18, m35220S);
                                    i28 = i14 | i37;
                                    i23 = i3;
                                    i26 = i18;
                                    i27 = i17;
                                    i25 = i9;
                                    i29 = i16;
                                    bArr3 = bArr2;
                                    break;
                                } else {
                                    i12 = i16;
                                    i4 = i3;
                                    i10 = i30;
                                    i13 = i18;
                                    unsafe = unsafe2;
                                    i11 = i14;
                                    i6 = i17;
                                    break;
                                }
                            case 10:
                                bArr2 = bArr;
                                i9 = i31;
                                i18 = i33;
                                i16 = i15;
                                i17 = i35;
                                if (i32 == 2) {
                                    i24 = AbstractC8934b.m35405b(bArr2, i30, c8936b2);
                                    unsafe2.putObject(obj3, m35214Y, c8936b2.f57454c);
                                    i28 = i14 | i37;
                                    i23 = i3;
                                    i26 = i18;
                                    i27 = i17;
                                    i25 = i9;
                                    i29 = i16;
                                    bArr3 = bArr2;
                                    break;
                                } else {
                                    i12 = i16;
                                    i4 = i3;
                                    i10 = i30;
                                    i13 = i18;
                                    unsafe = unsafe2;
                                    i11 = i14;
                                    i6 = i17;
                                    break;
                                }
                            case 12:
                                bArr2 = bArr;
                                i9 = i31;
                                i18 = i33;
                                i16 = i15;
                                i17 = i35;
                                if (i32 == 0) {
                                    i24 = AbstractC8934b.m35414I(bArr2, i30, c8936b2);
                                    int i39 = c8936b2.f57452a;
                                    Internal.EnumVerifier m35183t = c8956p2.m35183t(i18);
                                    if (m35183t != null && !m35183t.isInRange(i39)) {
                                        m35177w(obj).m35534n(i17, Long.valueOf(i39));
                                        i26 = i18;
                                        i28 = i14;
                                        i27 = i17;
                                        i25 = i9;
                                        i29 = i16;
                                        i23 = i3;
                                        bArr3 = bArr2;
                                    } else {
                                        unsafe2.putInt(obj3, m35214Y, i39);
                                        i28 = i14 | i37;
                                        i23 = i3;
                                        i26 = i18;
                                        i27 = i17;
                                        i25 = i9;
                                        i29 = i16;
                                        bArr3 = bArr2;
                                        break;
                                    }
                                } else {
                                    i12 = i16;
                                    i4 = i3;
                                    i10 = i30;
                                    i13 = i18;
                                    unsafe = unsafe2;
                                    i11 = i14;
                                    i6 = i17;
                                    break;
                                }
                                break;
                            case 15:
                                bArr2 = bArr;
                                i9 = i31;
                                i18 = i33;
                                i16 = i15;
                                i17 = i35;
                                if (i32 == 0) {
                                    i24 = AbstractC8934b.m35414I(bArr2, i30, c8936b2);
                                    unsafe2.putInt(obj3, m35214Y, CodedInputStream.decodeZigZag32(c8936b2.f57452a));
                                    i28 = i14 | i37;
                                    i23 = i3;
                                    i26 = i18;
                                    i27 = i17;
                                    i25 = i9;
                                    i29 = i16;
                                    bArr3 = bArr2;
                                    break;
                                } else {
                                    i12 = i16;
                                    i4 = i3;
                                    i10 = i30;
                                    i13 = i18;
                                    unsafe = unsafe2;
                                    i11 = i14;
                                    i6 = i17;
                                    break;
                                }
                            case 16:
                                i9 = i31;
                                i18 = i33;
                                i16 = i15;
                                i17 = i35;
                                bArr2 = bArr;
                                if (i32 == 0) {
                                    m35411L = AbstractC8934b.m35411L(bArr2, i30, c8936b2);
                                    unsafe2.putLong(obj, m35214Y, CodedInputStream.decodeZigZag64(c8936b2.f57453b));
                                    i28 = i14 | i37;
                                    i23 = i3;
                                    i26 = i18;
                                    i24 = m35411L;
                                    i27 = i17;
                                    i25 = i9;
                                    i29 = i16;
                                    bArr3 = bArr2;
                                    break;
                                } else {
                                    i12 = i16;
                                    i4 = i3;
                                    i10 = i30;
                                    i13 = i18;
                                    unsafe = unsafe2;
                                    i11 = i14;
                                    i6 = i17;
                                    break;
                                }
                            case 17:
                                if (i32 == 3) {
                                    Object m35220S2 = c8956p2.m35220S(obj3, i33);
                                    i24 = AbstractC8934b.m35409N(m35220S2, c8956p2.m35179v(i33), bArr, i30, i2, (i31 << 3) | 4, c8936b);
                                    c8956p2.m35178v0(obj3, i33, m35220S2);
                                    i28 = i14 | i37;
                                    i29 = i15;
                                    i23 = i3;
                                    i26 = i33;
                                    i27 = i35;
                                    i25 = i31;
                                    bArr3 = bArr;
                                    break;
                                } else {
                                    i9 = i31;
                                    i16 = i15;
                                    i17 = i35;
                                    i18 = i33;
                                    i12 = i16;
                                    i4 = i3;
                                    i10 = i30;
                                    i13 = i18;
                                    unsafe = unsafe2;
                                    i11 = i14;
                                    i6 = i17;
                                    break;
                                }
                            default:
                                i9 = i31;
                                i18 = i33;
                                i16 = i15;
                                i17 = i35;
                                i12 = i16;
                                i4 = i3;
                                i10 = i30;
                                i13 = i18;
                                unsafe = unsafe2;
                                i11 = i14;
                                i6 = i17;
                                break;
                        }
                    } else {
                        i9 = i31;
                        i12 = i29;
                        i11 = i28;
                        if (m35174x0 == 27) {
                            if (i32 == 2) {
                                Internal.ProtobufList protobufList = (Internal.ProtobufList) unsafe2.getObject(obj3, m35214Y);
                                if (!protobufList.isModifiable()) {
                                    int size = protobufList.size();
                                    if (size == 0) {
                                        i21 = 10;
                                    } else {
                                        i21 = size * 2;
                                    }
                                    protobufList = protobufList.mutableCopyWithCapacity(i21);
                                    unsafe2.putObject(obj3, m35214Y, protobufList);
                                }
                                i24 = AbstractC8934b.m35390q(c8956p2.m35179v(i33), i35, bArr, i30, i2, protobufList, c8936b);
                                i26 = i33;
                                i27 = i35;
                                i29 = i12;
                                i28 = i11;
                                i25 = i9;
                                bArr3 = bArr;
                                i23 = i3;
                            } else {
                                i19 = i30;
                                unsafe = unsafe2;
                                i13 = i33;
                                i20 = i35;
                                i4 = i3;
                                i10 = i19;
                            }
                        } else if (m35174x0 <= 49) {
                            int i40 = i30;
                            unsafe = unsafe2;
                            i13 = i33;
                            i20 = i35;
                            i24 = m35204i0(obj, bArr, i30, i2, i35, i9, i32, i33, i34, m35174x0, m35214Y, c8936b);
                            if (i24 != i40) {
                                c8956p2 = this;
                                obj3 = obj;
                                bArr3 = bArr;
                                i22 = i2;
                                i23 = i3;
                                c8936b2 = c8936b;
                                i29 = i12;
                                i28 = i11;
                                i26 = i13;
                                i27 = i20;
                                i25 = i9;
                                unsafe2 = unsafe;
                            } else {
                                i4 = i3;
                                i10 = i24;
                            }
                        } else {
                            i19 = i30;
                            unsafe = unsafe2;
                            i13 = i33;
                            i20 = i35;
                            if (m35174x0 == 50) {
                                if (i32 == 2) {
                                    i24 = m35208e0(obj, bArr, i19, i2, i13, m35214Y, c8936b);
                                    if (i24 != i19) {
                                        c8956p2 = this;
                                        obj3 = obj;
                                        bArr3 = bArr;
                                        i22 = i2;
                                        i23 = i3;
                                        c8936b2 = c8936b;
                                        i29 = i12;
                                        i28 = i11;
                                        i26 = i13;
                                        i27 = i20;
                                        i25 = i9;
                                        unsafe2 = unsafe;
                                    } else {
                                        i4 = i3;
                                        i10 = i24;
                                    }
                                } else {
                                    i4 = i3;
                                    i10 = i19;
                                }
                            } else {
                                i24 = m35207f0(obj, bArr, i19, i2, i20, i9, i32, i34, m35174x0, m35214Y, i13, c8936b);
                                if (i24 != i19) {
                                    c8956p2 = this;
                                    obj3 = obj;
                                    bArr3 = bArr;
                                    i22 = i2;
                                    i23 = i3;
                                    c8936b2 = c8936b;
                                    i29 = i12;
                                    i28 = i11;
                                    i26 = i13;
                                    i27 = i20;
                                    i25 = i9;
                                    unsafe2 = unsafe;
                                } else {
                                    i4 = i3;
                                    i10 = i24;
                                }
                            }
                        }
                        i6 = i20;
                    }
                }
                if (i6 == i4 && i4 != 0) {
                    i8 = 1048575;
                    c8956p = this;
                    i5 = i10;
                    i7 = i12;
                    i28 = i11;
                } else {
                    if (this.f57490f && c8936b.f57455d != ExtensionRegistryLite.getEmptyRegistry()) {
                        i24 = AbstractC8934b.m35400g(i6, bArr, i10, i2, obj, this.f57489e, this.f57499o, c8936b);
                    } else {
                        i24 = AbstractC8934b.m35416G(i6, bArr, i10, i2, m35177w(obj), c8936b);
                    }
                    obj3 = obj;
                    bArr3 = bArr;
                    i22 = i2;
                    i27 = i6;
                    c8956p2 = this;
                    c8936b2 = c8936b;
                    i29 = i12;
                    i28 = i11;
                    i26 = i13;
                    i25 = i9;
                    unsafe2 = unsafe;
                    i23 = i4;
                }
            } else {
                int i41 = i29;
                unsafe = unsafe2;
                i4 = i23;
                c8956p = c8956p2;
                i5 = i24;
                i6 = i27;
                i7 = i41;
                i8 = 1048575;
            }
        }
        if (i7 != i8) {
            obj2 = obj;
            unsafe.putInt(obj2, i7, i28);
        } else {
            obj2 = obj;
        }
        UnknownFieldSetLite unknownFieldSetLite = null;
        for (int i42 = c8956p.f57495k; i42 < c8956p.f57496l; i42++) {
            unknownFieldSetLite = (UnknownFieldSetLite) m35189q(obj, c8956p.f57494j[i42], unknownFieldSetLite, c8956p.f57499o, obj);
        }
        if (unknownFieldSetLite != null) {
            c8956p.f57499o.mo35002o(obj2, unknownFieldSetLite);
        }
        if (i4 == 0) {
            if (i5 != i2) {
                throw InvalidProtocolBufferException.parseFailure();
            }
        } else if (i5 > i2 || i6 != i4) {
            throw InvalidProtocolBufferException.parseFailure();
        }
        return i5;
    }

    @Override // com.google.protobuf.InterfaceC8961t
    /* renamed from: h */
    public void mo35114h(Object obj, byte[] bArr, int i, int i2, AbstractC8934b.C8936b c8936b) {
        if (this.f57492h) {
            m35205h0(obj, bArr, i, i2, c8936b);
        } else {
            m35206g0(obj, bArr, i, i2, 0, c8936b);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0298, code lost:
        r15 = r29;
        r14 = r30;
        r12 = r31;
        r13 = r33;
        r11 = r34;
        r1 = r18;
        r7 = r22;
        r6 = r26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x02ae, code lost:
        r2 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x02e4, code lost:
        if (r0 != r15) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0303, code lost:
        if (r0 != r15) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0296, code lost:
        if (r0 != r10) goto L102;
     */
    /* renamed from: h0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int m35205h0(java.lang.Object r30, byte[] r31, int r32, int r33, com.google.protobuf.AbstractC8934b.C8936b r34) {
        /*
            Method dump skipped, instructions count: 870
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C8956p.m35205h0(java.lang.Object, byte[], int, int, com.google.protobuf.b$b):int");
    }

    @Override // com.google.protobuf.InterfaceC8961t
    /* renamed from: i */
    public void mo35113i(Object obj, InterfaceC8960s interfaceC8960s, ExtensionRegistryLite extensionRegistryLite) {
        extensionRegistryLite.getClass();
        m35199l(obj);
        m35225N(this.f57499o, this.f57500p, obj, interfaceC8960s, extensionRegistryLite);
    }

    /* renamed from: i0 */
    public final int m35204i0(Object obj, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, long j, int i7, long j2, AbstractC8934b.C8936b c8936b) {
        int m35413J;
        Unsafe unsafe = f57484s;
        Internal.ProtobufList protobufList = (Internal.ProtobufList) unsafe.getObject(obj, j2);
        if (!protobufList.isModifiable()) {
            int size = protobufList.size();
            protobufList = protobufList.mutableCopyWithCapacity(size == 0 ? 10 : size * 2);
            unsafe.putObject(obj, j2, protobufList);
        }
        switch (i7) {
            case 18:
            case 35:
                if (i5 == 2) {
                    return AbstractC8934b.m35388s(bArr, i, protobufList, c8936b);
                }
                if (i5 == 1) {
                    return AbstractC8934b.m35402e(i3, bArr, i, i2, protobufList, c8936b);
                }
                break;
            case 19:
            case 36:
                if (i5 == 2) {
                    return AbstractC8934b.m35385v(bArr, i, protobufList, c8936b);
                }
                if (i5 == 5) {
                    return AbstractC8934b.m35394m(i3, bArr, i, i2, protobufList, c8936b);
                }
                break;
            case 20:
            case 21:
            case 37:
            case 38:
                if (i5 == 2) {
                    return AbstractC8934b.m35381z(bArr, i, protobufList, c8936b);
                }
                if (i5 == 0) {
                    return AbstractC8934b.m35410M(i3, bArr, i, i2, protobufList, c8936b);
                }
                break;
            case 22:
            case 29:
            case 39:
            case 43:
                if (i5 == 2) {
                    return AbstractC8934b.m35382y(bArr, i, protobufList, c8936b);
                }
                if (i5 == 0) {
                    return AbstractC8934b.m35413J(i3, bArr, i, i2, protobufList, c8936b);
                }
                break;
            case 23:
            case 32:
            case 40:
            case 46:
                if (i5 == 2) {
                    return AbstractC8934b.m35386u(bArr, i, protobufList, c8936b);
                }
                if (i5 == 1) {
                    return AbstractC8934b.m35396k(i3, bArr, i, i2, protobufList, c8936b);
                }
                break;
            case 24:
            case 31:
            case 41:
            case 45:
                if (i5 == 2) {
                    return AbstractC8934b.m35387t(bArr, i, protobufList, c8936b);
                }
                if (i5 == 5) {
                    return AbstractC8934b.m35398i(i3, bArr, i, i2, protobufList, c8936b);
                }
                break;
            case 25:
            case 42:
                if (i5 == 2) {
                    return AbstractC8934b.m35389r(bArr, i, protobufList, c8936b);
                }
                if (i5 == 0) {
                    return AbstractC8934b.m35406a(i3, bArr, i, i2, protobufList, c8936b);
                }
                break;
            case 26:
                if (i5 == 2) {
                    if ((j & 536870912) == 0) {
                        return AbstractC8934b.m35419D(i3, bArr, i, i2, protobufList, c8936b);
                    }
                    return AbstractC8934b.m35418E(i3, bArr, i, i2, protobufList, c8936b);
                }
                break;
            case 27:
                if (i5 == 2) {
                    return AbstractC8934b.m35390q(m35179v(i6), i3, bArr, i, i2, protobufList, c8936b);
                }
                break;
            case 28:
                if (i5 == 2) {
                    return AbstractC8934b.m35404c(i3, bArr, i, i2, protobufList, c8936b);
                }
                break;
            case 30:
            case 44:
                if (i5 == 2) {
                    m35413J = AbstractC8934b.m35382y(bArr, i, protobufList, c8936b);
                } else if (i5 == 0) {
                    m35413J = AbstractC8934b.m35413J(i3, bArr, i, i2, protobufList, c8936b);
                }
                AbstractC8962u.m35112A(obj, i4, protobufList, m35183t(i6), null, this.f57499o);
                return m35413J;
            case 33:
            case 47:
                if (i5 == 2) {
                    return AbstractC8934b.m35384w(bArr, i, protobufList, c8936b);
                }
                if (i5 == 0) {
                    return AbstractC8934b.m35422A(i3, bArr, i, i2, protobufList, c8936b);
                }
                break;
            case 34:
            case 48:
                if (i5 == 2) {
                    return AbstractC8934b.m35383x(bArr, i, protobufList, c8936b);
                }
                if (i5 == 0) {
                    return AbstractC8934b.m35421B(i3, bArr, i, i2, protobufList, c8936b);
                }
                break;
            case 49:
                if (i5 == 3) {
                    return AbstractC8934b.m35392o(m35179v(i6), i3, bArr, i, i2, protobufList, c8936b);
                }
                break;
        }
        return i;
    }

    /* renamed from: j */
    public final boolean m35203j(Object obj, Object obj2, int i) {
        if (m35239C(obj, i) == m35239C(obj2, i)) {
            return true;
        }
        return false;
    }

    /* renamed from: j0 */
    public final int m35202j0(int i) {
        if (i >= this.f57487c && i <= this.f57488d) {
            return m35182t0(i, 0);
        }
        return -1;
    }

    /* renamed from: k0 */
    public final int m35200k0(int i, int i2) {
        if (i >= this.f57487c && i <= this.f57488d) {
            return m35182t0(i, i2);
        }
        return -1;
    }

    /* renamed from: l0 */
    public final int m35198l0(int i) {
        return this.f57485a[i + 2];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10, types: [int] */
    /* renamed from: m */
    public final int m35197m(byte[] bArr, int i, int i2, MapEntryLite.C8897b c8897b, Map map, AbstractC8934b.C8936b c8936b) {
        int i3;
        int m35414I = AbstractC8934b.m35414I(bArr, i, c8936b);
        int i4 = c8936b.f57452a;
        if (i4 >= 0 && i4 <= i2 - m35414I) {
            int i5 = m35414I + i4;
            Object obj = c8897b.f57389b;
            Object obj2 = c8897b.f57391d;
            while (m35414I < i5) {
                int i6 = m35414I + 1;
                byte b = bArr[m35414I];
                if (b < 0) {
                    i3 = AbstractC8934b.m35415H(b, bArr, i6, c8936b);
                    b = c8936b.f57452a;
                } else {
                    i3 = i6;
                }
                int i7 = b >>> 3;
                int i8 = b & 7;
                if (i7 != 1) {
                    if (i7 == 2 && i8 == c8897b.f57390c.getWireType()) {
                        m35414I = m35195n(bArr, i3, i2, c8897b.f57390c, c8897b.f57391d.getClass(), c8936b);
                        obj2 = c8936b.f57454c;
                    }
                    m35414I = AbstractC8934b.m35407P(b, bArr, i3, i2, c8936b);
                } else if (i8 == c8897b.f57388a.getWireType()) {
                    m35414I = m35195n(bArr, i3, i2, c8897b.f57388a, null, c8936b);
                    obj = c8936b.f57454c;
                } else {
                    m35414I = AbstractC8934b.m35407P(b, bArr, i3, i2, c8936b);
                }
            }
            if (m35414I == i5) {
                map.put(obj, obj2);
                return i5;
            }
            throw InvalidProtocolBufferException.parseFailure();
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    /* renamed from: m0 */
    public final void m35196m0(Object obj, long j, InterfaceC8960s interfaceC8960s, InterfaceC8961t interfaceC8961t, ExtensionRegistryLite extensionRegistryLite) {
        interfaceC8960s.mo35151I(this.f57498n.mo35270e(obj, j), interfaceC8961t, extensionRegistryLite);
    }

    /* renamed from: n */
    public final int m35195n(byte[] bArr, int i, int i2, WireFormat.FieldType fieldType, Class cls, AbstractC8934b.C8936b c8936b) {
        boolean z;
        switch (C8957a.f57502a[fieldType.ordinal()]) {
            case 1:
                int m35411L = AbstractC8934b.m35411L(bArr, i, c8936b);
                if (c8936b.f57453b != 0) {
                    z = true;
                } else {
                    z = false;
                }
                c8936b.f57454c = Boolean.valueOf(z);
                return m35411L;
            case 2:
                return AbstractC8934b.m35405b(bArr, i, c8936b);
            case 3:
                c8936b.f57454c = Double.valueOf(AbstractC8934b.m35403d(bArr, i));
                return i + 8;
            case 4:
            case 5:
                c8936b.f57454c = Integer.valueOf(AbstractC8934b.m35399h(bArr, i));
                return i + 4;
            case 6:
            case 7:
                c8936b.f57454c = Long.valueOf(AbstractC8934b.m35397j(bArr, i));
                return i + 8;
            case 8:
                c8936b.f57454c = Float.valueOf(AbstractC8934b.m35395l(bArr, i));
                return i + 4;
            case 9:
            case 10:
            case 11:
                int m35414I = AbstractC8934b.m35414I(bArr, i, c8936b);
                c8936b.f57454c = Integer.valueOf(c8936b.f57452a);
                return m35414I;
            case 12:
            case 13:
                int m35411L2 = AbstractC8934b.m35411L(bArr, i, c8936b);
                c8936b.f57454c = Long.valueOf(c8936b.f57453b);
                return m35411L2;
            case 14:
                return AbstractC8934b.m35391p(C17878Jo1.m67679a().m67677c(cls), bArr, i, i2, c8936b);
            case 15:
                int m35414I2 = AbstractC8934b.m35414I(bArr, i, c8936b);
                c8936b.f57454c = Integer.valueOf(CodedInputStream.decodeZigZag32(c8936b.f57452a));
                return m35414I2;
            case 16:
                int m35411L3 = AbstractC8934b.m35411L(bArr, i, c8936b);
                c8936b.f57454c = Long.valueOf(CodedInputStream.decodeZigZag64(c8936b.f57453b));
                return m35411L3;
            case 17:
                return AbstractC8934b.m35417F(bArr, i, c8936b);
            default:
                throw new RuntimeException("unsupported field type.");
        }
    }

    /* renamed from: n0 */
    public final void m35194n0(Object obj, int i, InterfaceC8960s interfaceC8960s, InterfaceC8961t interfaceC8961t, ExtensionRegistryLite extensionRegistryLite) {
        interfaceC8960s.mo35150J(this.f57498n.mo35270e(obj, m35214Y(i)), interfaceC8961t, extensionRegistryLite);
    }

    @Override // com.google.protobuf.InterfaceC8961t
    public Object newInstance() {
        return this.f57497m.mo30902a(this.f57489e);
    }

    /* renamed from: o0 */
    public final void m35192o0(Object obj, int i, InterfaceC8960s interfaceC8960s) {
        if (m35241B(i)) {
            AbstractC22806wY1.m803Y(obj, m35214Y(i), interfaceC8960s.mo35155E());
        } else if (this.f57491g) {
            AbstractC22806wY1.m803Y(obj, m35214Y(i), interfaceC8960s.readString());
        } else {
            AbstractC22806wY1.m803Y(obj, m35214Y(i), interfaceC8960s.mo35141g());
        }
    }

    /* renamed from: p */
    public final boolean m35191p(Object obj, Object obj2, int i) {
        int m35172y0 = m35172y0(i);
        long m35214Y = m35214Y(m35172y0);
        switch (m35174x0(m35172y0)) {
            case 0:
                if (!m35203j(obj, obj2, i) || Double.doubleToLongBits(AbstractC22806wY1.m826B(obj, m35214Y)) != Double.doubleToLongBits(AbstractC22806wY1.m826B(obj2, m35214Y))) {
                    return false;
                }
                return true;
            case 1:
                if (!m35203j(obj, obj2, i) || Float.floatToIntBits(AbstractC22806wY1.m825C(obj, m35214Y)) != Float.floatToIntBits(AbstractC22806wY1.m825C(obj2, m35214Y))) {
                    return false;
                }
                return true;
            case 2:
                if (!m35203j(obj, obj2, i) || AbstractC22806wY1.m822F(obj, m35214Y) != AbstractC22806wY1.m822F(obj2, m35214Y)) {
                    return false;
                }
                return true;
            case 3:
                if (!m35203j(obj, obj2, i) || AbstractC22806wY1.m822F(obj, m35214Y) != AbstractC22806wY1.m822F(obj2, m35214Y)) {
                    return false;
                }
                return true;
            case 4:
                if (!m35203j(obj, obj2, i) || AbstractC22806wY1.m824D(obj, m35214Y) != AbstractC22806wY1.m824D(obj2, m35214Y)) {
                    return false;
                }
                return true;
            case 5:
                if (!m35203j(obj, obj2, i) || AbstractC22806wY1.m822F(obj, m35214Y) != AbstractC22806wY1.m822F(obj2, m35214Y)) {
                    return false;
                }
                return true;
            case 6:
                if (!m35203j(obj, obj2, i) || AbstractC22806wY1.m824D(obj, m35214Y) != AbstractC22806wY1.m824D(obj2, m35214Y)) {
                    return false;
                }
                return true;
            case 7:
                if (!m35203j(obj, obj2, i) || AbstractC22806wY1.m780u(obj, m35214Y) != AbstractC22806wY1.m780u(obj2, m35214Y)) {
                    return false;
                }
                return true;
            case 8:
                if (!m35203j(obj, obj2, i) || !AbstractC8962u.m35102K(AbstractC22806wY1.m820H(obj, m35214Y), AbstractC22806wY1.m820H(obj2, m35214Y))) {
                    return false;
                }
                return true;
            case 9:
                if (!m35203j(obj, obj2, i) || !AbstractC8962u.m35102K(AbstractC22806wY1.m820H(obj, m35214Y), AbstractC22806wY1.m820H(obj2, m35214Y))) {
                    return false;
                }
                return true;
            case 10:
                if (!m35203j(obj, obj2, i) || !AbstractC8962u.m35102K(AbstractC22806wY1.m820H(obj, m35214Y), AbstractC22806wY1.m820H(obj2, m35214Y))) {
                    return false;
                }
                return true;
            case 11:
                if (!m35203j(obj, obj2, i) || AbstractC22806wY1.m824D(obj, m35214Y) != AbstractC22806wY1.m824D(obj2, m35214Y)) {
                    return false;
                }
                return true;
            case 12:
                if (!m35203j(obj, obj2, i) || AbstractC22806wY1.m824D(obj, m35214Y) != AbstractC22806wY1.m824D(obj2, m35214Y)) {
                    return false;
                }
                return true;
            case 13:
                if (!m35203j(obj, obj2, i) || AbstractC22806wY1.m824D(obj, m35214Y) != AbstractC22806wY1.m824D(obj2, m35214Y)) {
                    return false;
                }
                return true;
            case 14:
                if (!m35203j(obj, obj2, i) || AbstractC22806wY1.m822F(obj, m35214Y) != AbstractC22806wY1.m822F(obj2, m35214Y)) {
                    return false;
                }
                return true;
            case 15:
                if (!m35203j(obj, obj2, i) || AbstractC22806wY1.m824D(obj, m35214Y) != AbstractC22806wY1.m824D(obj2, m35214Y)) {
                    return false;
                }
                return true;
            case 16:
                if (!m35203j(obj, obj2, i) || AbstractC22806wY1.m822F(obj, m35214Y) != AbstractC22806wY1.m822F(obj2, m35214Y)) {
                    return false;
                }
                return true;
            case 17:
                if (!m35203j(obj, obj2, i) || !AbstractC8962u.m35102K(AbstractC22806wY1.m820H(obj, m35214Y), AbstractC22806wY1.m820H(obj2, m35214Y))) {
                    return false;
                }
                return true;
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 47:
            case 48:
            case 49:
                return AbstractC8962u.m35102K(AbstractC22806wY1.m820H(obj, m35214Y), AbstractC22806wY1.m820H(obj2, m35214Y));
            case 50:
                return AbstractC8962u.m35102K(AbstractC22806wY1.m820H(obj, m35214Y), AbstractC22806wY1.m820H(obj2, m35214Y));
            case EACTags.TRANSACTION_DATE /* 51 */:
            case EACTags.CARD_SEQUENCE_NUMBER /* 52 */:
            case EACTags.SEX /* 53 */:
            case 54:
            case 55:
            case 56:
            case 57:
            case EACTags.DYNAMIC_INTERNAL_AUTHENTIFICATION /* 58 */:
            case EACTags.DYNAMIC_EXTERNAL_AUTHENTIFICATION /* 59 */:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case EACTags.ELEMENT_LIST /* 65 */:
            case EACTags.ADDRESS /* 66 */:
            case EACTags.CARDHOLDER_HANDWRITTEN_SIGNATURE /* 67 */:
            case EACTags.APPLICATION_IMAGE /* 68 */:
                if (!m35230I(obj, obj2, i) || !AbstractC8962u.m35102K(AbstractC22806wY1.m820H(obj, m35214Y), AbstractC22806wY1.m820H(obj2, m35214Y))) {
                    return false;
                }
                return true;
            default:
                return true;
        }
    }

    /* renamed from: p0 */
    public final void m35190p0(Object obj, int i, InterfaceC8960s interfaceC8960s) {
        if (m35241B(i)) {
            interfaceC8960s.mo35123y(this.f57498n.mo35270e(obj, m35214Y(i)));
        } else {
            interfaceC8960s.mo35134n(this.f57498n.mo35270e(obj, m35214Y(i)));
        }
    }

    /* renamed from: q */
    public final Object m35189q(Object obj, int i, Object obj2, AbstractC8973w abstractC8973w, Object obj3) {
        int m35215X = m35215X(i);
        Object m820H = AbstractC22806wY1.m820H(obj, m35214Y(m35172y0(i)));
        if (m820H == null) {
            return obj2;
        }
        Internal.EnumVerifier m35183t = m35183t(i);
        if (m35183t == null) {
            return obj2;
        }
        return m35187r(i, m35215X, this.f57501q.mo35254f(m820H), m35183t, obj2, abstractC8973w, obj3);
    }

    /* renamed from: r */
    public final Object m35187r(int i, int i2, Map map, Internal.EnumVerifier enumVerifier, Object obj, AbstractC8973w abstractC8973w, Object obj2) {
        MapEntryLite.C8897b mo35257c = this.f57501q.mo35257c(m35181u(i));
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (!enumVerifier.isInRange(((Integer) entry.getValue()).intValue())) {
                if (obj == null) {
                    obj = abstractC8973w.mo35009f(obj2);
                }
                ByteString.C8837f newCodedBuilder = ByteString.newCodedBuilder(MapEntryLite.m35738a(mo35257c, entry.getKey(), entry.getValue()));
                try {
                    MapEntryLite.m35734e(newCodedBuilder.m37059b(), mo35257c, entry.getKey(), entry.getValue());
                    abstractC8973w.mo35011d(obj, i2, newCodedBuilder.m37060a());
                    it.remove();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        return obj;
    }

    /* renamed from: r0 */
    public final void m35186r0(Object obj, int i) {
        int m35198l0 = m35198l0(i);
        long j = 1048575 & m35198l0;
        if (j == 1048575) {
            return;
        }
        AbstractC22806wY1.m805W(obj, j, (1 << (m35198l0 >>> 20)) | AbstractC22806wY1.m824D(obj, j));
    }

    /* renamed from: s0 */
    public final void m35184s0(Object obj, int i, int i2) {
        AbstractC22806wY1.m805W(obj, m35198l0(i2) & 1048575, i);
    }

    /* renamed from: t */
    public final Internal.EnumVerifier m35183t(int i) {
        return (Internal.EnumVerifier) this.f57486b[((i / 3) * 2) + 1];
    }

    /* renamed from: t0 */
    public final int m35182t0(int i, int i2) {
        int length = (this.f57485a.length / 3) - 1;
        while (i2 <= length) {
            int i3 = (length + i2) >>> 1;
            int i4 = i3 * 3;
            int m35215X = m35215X(i4);
            if (i == m35215X) {
                return i4;
            }
            if (i < m35215X) {
                length = i3 - 1;
            } else {
                i2 = i3 + 1;
            }
        }
        return -1;
    }

    /* renamed from: u */
    public final Object m35181u(int i) {
        return this.f57486b[(i / 3) * 2];
    }

    /* renamed from: v */
    public final InterfaceC8961t m35179v(int i) {
        int i2 = (i / 3) * 2;
        InterfaceC8961t interfaceC8961t = (InterfaceC8961t) this.f57486b[i2];
        if (interfaceC8961t != null) {
            return interfaceC8961t;
        }
        InterfaceC8961t m67677c = C17878Jo1.m67679a().m67677c((Class) this.f57486b[i2 + 1]);
        this.f57486b[i2] = m67677c;
        return m67677c;
    }

    /* renamed from: v0 */
    public final void m35178v0(Object obj, int i, Object obj2) {
        f57484s.putObject(obj, m35214Y(m35172y0(i)), obj2);
        m35186r0(obj, i);
    }

    /* renamed from: w0 */
    public final void m35176w0(Object obj, int i, int i2, Object obj2) {
        f57484s.putObject(obj, m35214Y(m35172y0(i2)), obj2);
        m35184s0(obj, i, i2);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: x */
    public final int m35175x(Object obj) {
        int i;
        int i2;
        int computeDoubleSize;
        int computeBoolSize;
        int computeSFixed32Size;
        int m35073i;
        int computeTagSize;
        int computeUInt32SizeNoTag;
        Unsafe unsafe = f57484s;
        int i3 = 1048575;
        int i4 = 0;
        int i5 = 0;
        int i6 = 1048575;
        int i7 = 0;
        while (i4 < this.f57485a.length) {
            int m35172y0 = m35172y0(i4);
            int m35215X = m35215X(i4);
            int m35174x0 = m35174x0(m35172y0);
            if (m35174x0 <= 17) {
                i = this.f57485a[i4 + 2];
                int i8 = i & i3;
                i2 = 1 << (i >>> 20);
                if (i8 != i6) {
                    i7 = unsafe.getInt(obj, i8);
                    i6 = i8;
                }
            } else {
                i = (!this.f57493i || m35174x0 < FieldType.DOUBLE_LIST_PACKED.m35846id() || m35174x0 > FieldType.SINT64_LIST_PACKED.m35846id()) ? 0 : this.f57485a[i4 + 2] & i3;
                i2 = 0;
            }
            long m35214Y = m35214Y(m35172y0);
            switch (m35174x0) {
                case 0:
                    if ((i7 & i2) == 0) {
                        break;
                    } else {
                        computeDoubleSize = CodedOutputStream.computeDoubleSize(m35215X, 0.0d);
                        i5 += computeDoubleSize;
                        break;
                    }
                case 1:
                    if ((i7 & i2) == 0) {
                        break;
                    } else {
                        computeDoubleSize = CodedOutputStream.computeFloatSize(m35215X, 0.0f);
                        i5 += computeDoubleSize;
                        break;
                    }
                case 2:
                    if ((i7 & i2) == 0) {
                        break;
                    } else {
                        computeDoubleSize = CodedOutputStream.computeInt64Size(m35215X, unsafe.getLong(obj, m35214Y));
                        i5 += computeDoubleSize;
                        break;
                    }
                case 3:
                    if ((i7 & i2) == 0) {
                        break;
                    } else {
                        computeDoubleSize = CodedOutputStream.computeUInt64Size(m35215X, unsafe.getLong(obj, m35214Y));
                        i5 += computeDoubleSize;
                        break;
                    }
                case 4:
                    if ((i7 & i2) == 0) {
                        break;
                    } else {
                        computeDoubleSize = CodedOutputStream.computeInt32Size(m35215X, unsafe.getInt(obj, m35214Y));
                        i5 += computeDoubleSize;
                        break;
                    }
                case 5:
                    if ((i7 & i2) == 0) {
                        break;
                    } else {
                        computeDoubleSize = CodedOutputStream.computeFixed64Size(m35215X, 0L);
                        i5 += computeDoubleSize;
                        break;
                    }
                case 6:
                    if ((i7 & i2) != 0) {
                        computeDoubleSize = CodedOutputStream.computeFixed32Size(m35215X, 0);
                        i5 += computeDoubleSize;
                        break;
                    }
                    break;
                case 7:
                    if ((i7 & i2) != 0) {
                        computeBoolSize = CodedOutputStream.computeBoolSize(m35215X, true);
                        i5 += computeBoolSize;
                    }
                    break;
                case 8:
                    if ((i7 & i2) != 0) {
                        Object object = unsafe.getObject(obj, m35214Y);
                        if (object instanceof ByteString) {
                            computeBoolSize = CodedOutputStream.computeBytesSize(m35215X, (ByteString) object);
                        } else {
                            computeBoolSize = CodedOutputStream.computeStringSize(m35215X, (String) object);
                        }
                        i5 += computeBoolSize;
                    }
                    break;
                case 9:
                    if ((i7 & i2) != 0) {
                        computeBoolSize = AbstractC8962u.m35067o(m35215X, unsafe.getObject(obj, m35214Y), m35179v(i4));
                        i5 += computeBoolSize;
                    }
                    break;
                case 10:
                    if ((i7 & i2) != 0) {
                        computeBoolSize = CodedOutputStream.computeBytesSize(m35215X, (ByteString) unsafe.getObject(obj, m35214Y));
                        i5 += computeBoolSize;
                    }
                    break;
                case 11:
                    if ((i7 & i2) != 0) {
                        computeBoolSize = CodedOutputStream.computeUInt32Size(m35215X, unsafe.getInt(obj, m35214Y));
                        i5 += computeBoolSize;
                    }
                    break;
                case 12:
                    if ((i7 & i2) != 0) {
                        computeBoolSize = CodedOutputStream.computeEnumSize(m35215X, unsafe.getInt(obj, m35214Y));
                        i5 += computeBoolSize;
                    }
                    break;
                case 13:
                    if ((i7 & i2) != 0) {
                        computeSFixed32Size = CodedOutputStream.computeSFixed32Size(m35215X, 0);
                        i5 += computeSFixed32Size;
                    }
                    break;
                case 14:
                    if ((i7 & i2) != 0) {
                        computeBoolSize = CodedOutputStream.computeSFixed64Size(m35215X, 0L);
                        i5 += computeBoolSize;
                    }
                    break;
                case 15:
                    if ((i7 & i2) != 0) {
                        computeBoolSize = CodedOutputStream.computeSInt32Size(m35215X, unsafe.getInt(obj, m35214Y));
                        i5 += computeBoolSize;
                    }
                    break;
                case 16:
                    if ((i7 & i2) != 0) {
                        computeBoolSize = CodedOutputStream.computeSInt64Size(m35215X, unsafe.getLong(obj, m35214Y));
                        i5 += computeBoolSize;
                    }
                    break;
                case 17:
                    if ((i7 & i2) != 0) {
                        computeBoolSize = CodedOutputStream.m37009b(m35215X, (MessageLite) unsafe.getObject(obj, m35214Y), m35179v(i4));
                        i5 += computeBoolSize;
                    }
                    break;
                case 18:
                    computeBoolSize = AbstractC8962u.m35074h(m35215X, (List) unsafe.getObject(obj, m35214Y), false);
                    i5 += computeBoolSize;
                    break;
                case 19:
                    computeBoolSize = AbstractC8962u.m35076f(m35215X, (List) unsafe.getObject(obj, m35214Y), false);
                    i5 += computeBoolSize;
                    break;
                case 20:
                    computeBoolSize = AbstractC8962u.m35069m(m35215X, (List) unsafe.getObject(obj, m35214Y), false);
                    i5 += computeBoolSize;
                    break;
                case 21:
                    computeBoolSize = AbstractC8962u.m35058x(m35215X, (List) unsafe.getObject(obj, m35214Y), false);
                    i5 += computeBoolSize;
                    break;
                case 22:
                    computeBoolSize = AbstractC8962u.m35071k(m35215X, (List) unsafe.getObject(obj, m35214Y), false);
                    i5 += computeBoolSize;
                    break;
                case 23:
                    computeBoolSize = AbstractC8962u.m35074h(m35215X, (List) unsafe.getObject(obj, m35214Y), false);
                    i5 += computeBoolSize;
                    break;
                case 24:
                    computeBoolSize = AbstractC8962u.m35076f(m35215X, (List) unsafe.getObject(obj, m35214Y), false);
                    i5 += computeBoolSize;
                    break;
                case 25:
                    computeBoolSize = AbstractC8962u.m35086a(m35215X, (List) unsafe.getObject(obj, m35214Y), false);
                    i5 += computeBoolSize;
                    break;
                case 26:
                    computeBoolSize = AbstractC8962u.m35061u(m35215X, (List) unsafe.getObject(obj, m35214Y));
                    i5 += computeBoolSize;
                    break;
                case 27:
                    computeBoolSize = AbstractC8962u.m35066p(m35215X, (List) unsafe.getObject(obj, m35214Y), m35179v(i4));
                    i5 += computeBoolSize;
                    break;
                case 28:
                    computeBoolSize = AbstractC8962u.m35082c(m35215X, (List) unsafe.getObject(obj, m35214Y));
                    i5 += computeBoolSize;
                    break;
                case 29:
                    computeBoolSize = AbstractC8962u.m35060v(m35215X, (List) unsafe.getObject(obj, m35214Y), false);
                    i5 += computeBoolSize;
                    break;
                case 30:
                    computeBoolSize = AbstractC8962u.m35080d(m35215X, (List) unsafe.getObject(obj, m35214Y), false);
                    i5 += computeBoolSize;
                    break;
                case 31:
                    computeBoolSize = AbstractC8962u.m35076f(m35215X, (List) unsafe.getObject(obj, m35214Y), false);
                    i5 += computeBoolSize;
                    break;
                case 32:
                    computeBoolSize = AbstractC8962u.m35074h(m35215X, (List) unsafe.getObject(obj, m35214Y), false);
                    i5 += computeBoolSize;
                    break;
                case 33:
                    computeBoolSize = AbstractC8962u.m35065q(m35215X, (List) unsafe.getObject(obj, m35214Y), false);
                    i5 += computeBoolSize;
                    break;
                case 34:
                    computeBoolSize = AbstractC8962u.m35063s(m35215X, (List) unsafe.getObject(obj, m35214Y), false);
                    i5 += computeBoolSize;
                    break;
                case 35:
                    m35073i = AbstractC8962u.m35073i((List) unsafe.getObject(obj, m35214Y));
                    if (m35073i > 0) {
                        if (this.f57493i) {
                            unsafe.putInt(obj, i, m35073i);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(m35215X);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(m35073i);
                        computeSFixed32Size = computeTagSize + computeUInt32SizeNoTag + m35073i;
                        i5 += computeSFixed32Size;
                    }
                    break;
                case 36:
                    m35073i = AbstractC8962u.m35075g((List) unsafe.getObject(obj, m35214Y));
                    if (m35073i > 0) {
                        if (this.f57493i) {
                            unsafe.putInt(obj, i, m35073i);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(m35215X);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(m35073i);
                        computeSFixed32Size = computeTagSize + computeUInt32SizeNoTag + m35073i;
                        i5 += computeSFixed32Size;
                    }
                    break;
                case 37:
                    m35073i = AbstractC8962u.m35068n((List) unsafe.getObject(obj, m35214Y));
                    if (m35073i > 0) {
                        if (this.f57493i) {
                            unsafe.putInt(obj, i, m35073i);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(m35215X);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(m35073i);
                        computeSFixed32Size = computeTagSize + computeUInt32SizeNoTag + m35073i;
                        i5 += computeSFixed32Size;
                    }
                    break;
                case 38:
                    m35073i = AbstractC8962u.m35057y((List) unsafe.getObject(obj, m35214Y));
                    if (m35073i > 0) {
                        if (this.f57493i) {
                            unsafe.putInt(obj, i, m35073i);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(m35215X);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(m35073i);
                        computeSFixed32Size = computeTagSize + computeUInt32SizeNoTag + m35073i;
                        i5 += computeSFixed32Size;
                    }
                    break;
                case 39:
                    m35073i = AbstractC8962u.m35070l((List) unsafe.getObject(obj, m35214Y));
                    if (m35073i > 0) {
                        if (this.f57493i) {
                            unsafe.putInt(obj, i, m35073i);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(m35215X);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(m35073i);
                        computeSFixed32Size = computeTagSize + computeUInt32SizeNoTag + m35073i;
                        i5 += computeSFixed32Size;
                    }
                    break;
                case 40:
                    m35073i = AbstractC8962u.m35073i((List) unsafe.getObject(obj, m35214Y));
                    if (m35073i > 0) {
                        if (this.f57493i) {
                            unsafe.putInt(obj, i, m35073i);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(m35215X);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(m35073i);
                        computeSFixed32Size = computeTagSize + computeUInt32SizeNoTag + m35073i;
                        i5 += computeSFixed32Size;
                    }
                    break;
                case 41:
                    m35073i = AbstractC8962u.m35075g((List) unsafe.getObject(obj, m35214Y));
                    if (m35073i > 0) {
                        if (this.f57493i) {
                            unsafe.putInt(obj, i, m35073i);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(m35215X);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(m35073i);
                        computeSFixed32Size = computeTagSize + computeUInt32SizeNoTag + m35073i;
                        i5 += computeSFixed32Size;
                    }
                    break;
                case 42:
                    m35073i = AbstractC8962u.m35084b((List) unsafe.getObject(obj, m35214Y));
                    if (m35073i > 0) {
                        if (this.f57493i) {
                            unsafe.putInt(obj, i, m35073i);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(m35215X);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(m35073i);
                        computeSFixed32Size = computeTagSize + computeUInt32SizeNoTag + m35073i;
                        i5 += computeSFixed32Size;
                    }
                    break;
                case 43:
                    m35073i = AbstractC8962u.m35059w((List) unsafe.getObject(obj, m35214Y));
                    if (m35073i > 0) {
                        if (this.f57493i) {
                            unsafe.putInt(obj, i, m35073i);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(m35215X);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(m35073i);
                        computeSFixed32Size = computeTagSize + computeUInt32SizeNoTag + m35073i;
                        i5 += computeSFixed32Size;
                    }
                    break;
                case 44:
                    m35073i = AbstractC8962u.m35078e((List) unsafe.getObject(obj, m35214Y));
                    if (m35073i > 0) {
                        if (this.f57493i) {
                            unsafe.putInt(obj, i, m35073i);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(m35215X);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(m35073i);
                        computeSFixed32Size = computeTagSize + computeUInt32SizeNoTag + m35073i;
                        i5 += computeSFixed32Size;
                    }
                    break;
                case 45:
                    m35073i = AbstractC8962u.m35075g((List) unsafe.getObject(obj, m35214Y));
                    if (m35073i > 0) {
                        if (this.f57493i) {
                            unsafe.putInt(obj, i, m35073i);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(m35215X);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(m35073i);
                        computeSFixed32Size = computeTagSize + computeUInt32SizeNoTag + m35073i;
                        i5 += computeSFixed32Size;
                    }
                    break;
                case 46:
                    m35073i = AbstractC8962u.m35073i((List) unsafe.getObject(obj, m35214Y));
                    if (m35073i > 0) {
                        if (this.f57493i) {
                            unsafe.putInt(obj, i, m35073i);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(m35215X);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(m35073i);
                        computeSFixed32Size = computeTagSize + computeUInt32SizeNoTag + m35073i;
                        i5 += computeSFixed32Size;
                    }
                    break;
                case 47:
                    m35073i = AbstractC8962u.m35064r((List) unsafe.getObject(obj, m35214Y));
                    if (m35073i > 0) {
                        if (this.f57493i) {
                            unsafe.putInt(obj, i, m35073i);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(m35215X);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(m35073i);
                        computeSFixed32Size = computeTagSize + computeUInt32SizeNoTag + m35073i;
                        i5 += computeSFixed32Size;
                    }
                    break;
                case 48:
                    m35073i = AbstractC8962u.m35062t((List) unsafe.getObject(obj, m35214Y));
                    if (m35073i > 0) {
                        if (this.f57493i) {
                            unsafe.putInt(obj, i, m35073i);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(m35215X);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(m35073i);
                        computeSFixed32Size = computeTagSize + computeUInt32SizeNoTag + m35073i;
                        i5 += computeSFixed32Size;
                    }
                    break;
                case 49:
                    computeBoolSize = AbstractC8962u.m35072j(m35215X, (List) unsafe.getObject(obj, m35214Y), m35179v(i4));
                    i5 += computeBoolSize;
                    break;
                case 50:
                    computeBoolSize = this.f57501q.mo35255e(m35215X, unsafe.getObject(obj, m35214Y), m35181u(i4));
                    i5 += computeBoolSize;
                    break;
                case EACTags.TRANSACTION_DATE /* 51 */:
                    if (m35229J(obj, m35215X, i4)) {
                        computeBoolSize = CodedOutputStream.computeDoubleSize(m35215X, 0.0d);
                        i5 += computeBoolSize;
                    }
                    break;
                case EACTags.CARD_SEQUENCE_NUMBER /* 52 */:
                    if (m35229J(obj, m35215X, i4)) {
                        computeBoolSize = CodedOutputStream.computeFloatSize(m35215X, 0.0f);
                        i5 += computeBoolSize;
                    }
                    break;
                case EACTags.SEX /* 53 */:
                    if (m35229J(obj, m35215X, i4)) {
                        computeBoolSize = CodedOutputStream.computeInt64Size(m35215X, m35209d0(obj, m35214Y));
                        i5 += computeBoolSize;
                    }
                    break;
                case 54:
                    if (m35229J(obj, m35215X, i4)) {
                        computeBoolSize = CodedOutputStream.computeUInt64Size(m35215X, m35209d0(obj, m35214Y));
                        i5 += computeBoolSize;
                    }
                    break;
                case 55:
                    if (m35229J(obj, m35215X, i4)) {
                        computeBoolSize = CodedOutputStream.computeInt32Size(m35215X, m35210c0(obj, m35214Y));
                        i5 += computeBoolSize;
                    }
                    break;
                case 56:
                    if (m35229J(obj, m35215X, i4)) {
                        computeBoolSize = CodedOutputStream.computeFixed64Size(m35215X, 0L);
                        i5 += computeBoolSize;
                    }
                    break;
                case 57:
                    if (m35229J(obj, m35215X, i4)) {
                        computeSFixed32Size = CodedOutputStream.computeFixed32Size(m35215X, 0);
                        i5 += computeSFixed32Size;
                    }
                    break;
                case EACTags.DYNAMIC_INTERNAL_AUTHENTIFICATION /* 58 */:
                    if (m35229J(obj, m35215X, i4)) {
                        computeBoolSize = CodedOutputStream.computeBoolSize(m35215X, true);
                        i5 += computeBoolSize;
                    }
                    break;
                case EACTags.DYNAMIC_EXTERNAL_AUTHENTIFICATION /* 59 */:
                    if (m35229J(obj, m35215X, i4)) {
                        Object object2 = unsafe.getObject(obj, m35214Y);
                        if (object2 instanceof ByteString) {
                            computeBoolSize = CodedOutputStream.computeBytesSize(m35215X, (ByteString) object2);
                        } else {
                            computeBoolSize = CodedOutputStream.computeStringSize(m35215X, (String) object2);
                        }
                        i5 += computeBoolSize;
                    }
                    break;
                case 60:
                    if (m35229J(obj, m35215X, i4)) {
                        computeBoolSize = AbstractC8962u.m35067o(m35215X, unsafe.getObject(obj, m35214Y), m35179v(i4));
                        i5 += computeBoolSize;
                    }
                    break;
                case 61:
                    if (m35229J(obj, m35215X, i4)) {
                        computeBoolSize = CodedOutputStream.computeBytesSize(m35215X, (ByteString) unsafe.getObject(obj, m35214Y));
                        i5 += computeBoolSize;
                    }
                    break;
                case 62:
                    if (m35229J(obj, m35215X, i4)) {
                        computeBoolSize = CodedOutputStream.computeUInt32Size(m35215X, m35210c0(obj, m35214Y));
                        i5 += computeBoolSize;
                    }
                    break;
                case 63:
                    if (m35229J(obj, m35215X, i4)) {
                        computeBoolSize = CodedOutputStream.computeEnumSize(m35215X, m35210c0(obj, m35214Y));
                        i5 += computeBoolSize;
                    }
                    break;
                case 64:
                    if (m35229J(obj, m35215X, i4)) {
                        computeSFixed32Size = CodedOutputStream.computeSFixed32Size(m35215X, 0);
                        i5 += computeSFixed32Size;
                    }
                    break;
                case EACTags.ELEMENT_LIST /* 65 */:
                    if (m35229J(obj, m35215X, i4)) {
                        computeBoolSize = CodedOutputStream.computeSFixed64Size(m35215X, 0L);
                        i5 += computeBoolSize;
                    }
                    break;
                case EACTags.ADDRESS /* 66 */:
                    if (m35229J(obj, m35215X, i4)) {
                        computeBoolSize = CodedOutputStream.computeSInt32Size(m35215X, m35210c0(obj, m35214Y));
                        i5 += computeBoolSize;
                    }
                    break;
                case EACTags.CARDHOLDER_HANDWRITTEN_SIGNATURE /* 67 */:
                    if (m35229J(obj, m35215X, i4)) {
                        computeBoolSize = CodedOutputStream.computeSInt64Size(m35215X, m35209d0(obj, m35214Y));
                        i5 += computeBoolSize;
                    }
                    break;
                case EACTags.APPLICATION_IMAGE /* 68 */:
                    if (m35229J(obj, m35215X, i4)) {
                        computeBoolSize = CodedOutputStream.m37009b(m35215X, (MessageLite) unsafe.getObject(obj, m35214Y), m35179v(i4));
                        i5 += computeBoolSize;
                    }
                    break;
            }
            i4 += 3;
            i3 = 1048575;
        }
        int m35171z = i5 + m35171z(this.f57499o, obj);
        return this.f57490f ? m35171z + this.f57500p.mo35302c(obj).m35858o() : m35171z;
    }

    /* renamed from: y */
    public final int m35173y(Object obj) {
        int computeDoubleSize;
        int m35073i;
        int computeTagSize;
        int computeUInt32SizeNoTag;
        Unsafe unsafe = f57484s;
        int i = 0;
        for (int i2 = 0; i2 < this.f57485a.length; i2 += 3) {
            int m35172y0 = m35172y0(i2);
            int m35174x0 = m35174x0(m35172y0);
            int m35215X = m35215X(i2);
            long m35214Y = m35214Y(m35172y0);
            int i3 = (m35174x0 < FieldType.DOUBLE_LIST_PACKED.m35846id() || m35174x0 > FieldType.SINT64_LIST_PACKED.m35846id()) ? 0 : this.f57485a[i2 + 2] & 1048575;
            switch (m35174x0) {
                case 0:
                    if (m35239C(obj, i2)) {
                        computeDoubleSize = CodedOutputStream.computeDoubleSize(m35215X, 0.0d);
                        break;
                    } else {
                        continue;
                    }
                case 1:
                    if (m35239C(obj, i2)) {
                        computeDoubleSize = CodedOutputStream.computeFloatSize(m35215X, 0.0f);
                        break;
                    } else {
                        continue;
                    }
                case 2:
                    if (m35239C(obj, i2)) {
                        computeDoubleSize = CodedOutputStream.computeInt64Size(m35215X, AbstractC22806wY1.m822F(obj, m35214Y));
                        break;
                    } else {
                        continue;
                    }
                case 3:
                    if (m35239C(obj, i2)) {
                        computeDoubleSize = CodedOutputStream.computeUInt64Size(m35215X, AbstractC22806wY1.m822F(obj, m35214Y));
                        break;
                    } else {
                        continue;
                    }
                case 4:
                    if (m35239C(obj, i2)) {
                        computeDoubleSize = CodedOutputStream.computeInt32Size(m35215X, AbstractC22806wY1.m824D(obj, m35214Y));
                        break;
                    } else {
                        continue;
                    }
                case 5:
                    if (m35239C(obj, i2)) {
                        computeDoubleSize = CodedOutputStream.computeFixed64Size(m35215X, 0L);
                        break;
                    } else {
                        continue;
                    }
                case 6:
                    if (m35239C(obj, i2)) {
                        computeDoubleSize = CodedOutputStream.computeFixed32Size(m35215X, 0);
                        break;
                    } else {
                        continue;
                    }
                case 7:
                    if (m35239C(obj, i2)) {
                        computeDoubleSize = CodedOutputStream.computeBoolSize(m35215X, true);
                        break;
                    } else {
                        continue;
                    }
                case 8:
                    if (m35239C(obj, i2)) {
                        Object m820H = AbstractC22806wY1.m820H(obj, m35214Y);
                        if (m820H instanceof ByteString) {
                            computeDoubleSize = CodedOutputStream.computeBytesSize(m35215X, (ByteString) m820H);
                            break;
                        } else {
                            computeDoubleSize = CodedOutputStream.computeStringSize(m35215X, (String) m820H);
                            break;
                        }
                    } else {
                        continue;
                    }
                case 9:
                    if (m35239C(obj, i2)) {
                        computeDoubleSize = AbstractC8962u.m35067o(m35215X, AbstractC22806wY1.m820H(obj, m35214Y), m35179v(i2));
                        break;
                    } else {
                        continue;
                    }
                case 10:
                    if (m35239C(obj, i2)) {
                        computeDoubleSize = CodedOutputStream.computeBytesSize(m35215X, (ByteString) AbstractC22806wY1.m820H(obj, m35214Y));
                        break;
                    } else {
                        continue;
                    }
                case 11:
                    if (m35239C(obj, i2)) {
                        computeDoubleSize = CodedOutputStream.computeUInt32Size(m35215X, AbstractC22806wY1.m824D(obj, m35214Y));
                        break;
                    } else {
                        continue;
                    }
                case 12:
                    if (m35239C(obj, i2)) {
                        computeDoubleSize = CodedOutputStream.computeEnumSize(m35215X, AbstractC22806wY1.m824D(obj, m35214Y));
                        break;
                    } else {
                        continue;
                    }
                case 13:
                    if (m35239C(obj, i2)) {
                        computeDoubleSize = CodedOutputStream.computeSFixed32Size(m35215X, 0);
                        break;
                    } else {
                        continue;
                    }
                case 14:
                    if (m35239C(obj, i2)) {
                        computeDoubleSize = CodedOutputStream.computeSFixed64Size(m35215X, 0L);
                        break;
                    } else {
                        continue;
                    }
                case 15:
                    if (m35239C(obj, i2)) {
                        computeDoubleSize = CodedOutputStream.computeSInt32Size(m35215X, AbstractC22806wY1.m824D(obj, m35214Y));
                        break;
                    } else {
                        continue;
                    }
                case 16:
                    if (m35239C(obj, i2)) {
                        computeDoubleSize = CodedOutputStream.computeSInt64Size(m35215X, AbstractC22806wY1.m822F(obj, m35214Y));
                        break;
                    } else {
                        continue;
                    }
                case 17:
                    if (m35239C(obj, i2)) {
                        computeDoubleSize = CodedOutputStream.m37009b(m35215X, (MessageLite) AbstractC22806wY1.m820H(obj, m35214Y), m35179v(i2));
                        break;
                    } else {
                        continue;
                    }
                case 18:
                    computeDoubleSize = AbstractC8962u.m35074h(m35215X, m35227L(obj, m35214Y), false);
                    break;
                case 19:
                    computeDoubleSize = AbstractC8962u.m35076f(m35215X, m35227L(obj, m35214Y), false);
                    break;
                case 20:
                    computeDoubleSize = AbstractC8962u.m35069m(m35215X, m35227L(obj, m35214Y), false);
                    break;
                case 21:
                    computeDoubleSize = AbstractC8962u.m35058x(m35215X, m35227L(obj, m35214Y), false);
                    break;
                case 22:
                    computeDoubleSize = AbstractC8962u.m35071k(m35215X, m35227L(obj, m35214Y), false);
                    break;
                case 23:
                    computeDoubleSize = AbstractC8962u.m35074h(m35215X, m35227L(obj, m35214Y), false);
                    break;
                case 24:
                    computeDoubleSize = AbstractC8962u.m35076f(m35215X, m35227L(obj, m35214Y), false);
                    break;
                case 25:
                    computeDoubleSize = AbstractC8962u.m35086a(m35215X, m35227L(obj, m35214Y), false);
                    break;
                case 26:
                    computeDoubleSize = AbstractC8962u.m35061u(m35215X, m35227L(obj, m35214Y));
                    break;
                case 27:
                    computeDoubleSize = AbstractC8962u.m35066p(m35215X, m35227L(obj, m35214Y), m35179v(i2));
                    break;
                case 28:
                    computeDoubleSize = AbstractC8962u.m35082c(m35215X, m35227L(obj, m35214Y));
                    break;
                case 29:
                    computeDoubleSize = AbstractC8962u.m35060v(m35215X, m35227L(obj, m35214Y), false);
                    break;
                case 30:
                    computeDoubleSize = AbstractC8962u.m35080d(m35215X, m35227L(obj, m35214Y), false);
                    break;
                case 31:
                    computeDoubleSize = AbstractC8962u.m35076f(m35215X, m35227L(obj, m35214Y), false);
                    break;
                case 32:
                    computeDoubleSize = AbstractC8962u.m35074h(m35215X, m35227L(obj, m35214Y), false);
                    break;
                case 33:
                    computeDoubleSize = AbstractC8962u.m35065q(m35215X, m35227L(obj, m35214Y), false);
                    break;
                case 34:
                    computeDoubleSize = AbstractC8962u.m35063s(m35215X, m35227L(obj, m35214Y), false);
                    break;
                case 35:
                    m35073i = AbstractC8962u.m35073i((List) unsafe.getObject(obj, m35214Y));
                    if (m35073i > 0) {
                        if (this.f57493i) {
                            unsafe.putInt(obj, i3, m35073i);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(m35215X);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(m35073i);
                        computeDoubleSize = computeTagSize + computeUInt32SizeNoTag + m35073i;
                        break;
                    } else {
                        continue;
                    }
                case 36:
                    m35073i = AbstractC8962u.m35075g((List) unsafe.getObject(obj, m35214Y));
                    if (m35073i > 0) {
                        if (this.f57493i) {
                            unsafe.putInt(obj, i3, m35073i);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(m35215X);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(m35073i);
                        computeDoubleSize = computeTagSize + computeUInt32SizeNoTag + m35073i;
                        break;
                    } else {
                        continue;
                    }
                case 37:
                    m35073i = AbstractC8962u.m35068n((List) unsafe.getObject(obj, m35214Y));
                    if (m35073i > 0) {
                        if (this.f57493i) {
                            unsafe.putInt(obj, i3, m35073i);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(m35215X);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(m35073i);
                        computeDoubleSize = computeTagSize + computeUInt32SizeNoTag + m35073i;
                        break;
                    } else {
                        continue;
                    }
                case 38:
                    m35073i = AbstractC8962u.m35057y((List) unsafe.getObject(obj, m35214Y));
                    if (m35073i > 0) {
                        if (this.f57493i) {
                            unsafe.putInt(obj, i3, m35073i);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(m35215X);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(m35073i);
                        computeDoubleSize = computeTagSize + computeUInt32SizeNoTag + m35073i;
                        break;
                    } else {
                        continue;
                    }
                case 39:
                    m35073i = AbstractC8962u.m35070l((List) unsafe.getObject(obj, m35214Y));
                    if (m35073i > 0) {
                        if (this.f57493i) {
                            unsafe.putInt(obj, i3, m35073i);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(m35215X);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(m35073i);
                        computeDoubleSize = computeTagSize + computeUInt32SizeNoTag + m35073i;
                        break;
                    } else {
                        continue;
                    }
                case 40:
                    m35073i = AbstractC8962u.m35073i((List) unsafe.getObject(obj, m35214Y));
                    if (m35073i > 0) {
                        if (this.f57493i) {
                            unsafe.putInt(obj, i3, m35073i);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(m35215X);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(m35073i);
                        computeDoubleSize = computeTagSize + computeUInt32SizeNoTag + m35073i;
                        break;
                    } else {
                        continue;
                    }
                case 41:
                    m35073i = AbstractC8962u.m35075g((List) unsafe.getObject(obj, m35214Y));
                    if (m35073i > 0) {
                        if (this.f57493i) {
                            unsafe.putInt(obj, i3, m35073i);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(m35215X);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(m35073i);
                        computeDoubleSize = computeTagSize + computeUInt32SizeNoTag + m35073i;
                        break;
                    } else {
                        continue;
                    }
                case 42:
                    m35073i = AbstractC8962u.m35084b((List) unsafe.getObject(obj, m35214Y));
                    if (m35073i > 0) {
                        if (this.f57493i) {
                            unsafe.putInt(obj, i3, m35073i);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(m35215X);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(m35073i);
                        computeDoubleSize = computeTagSize + computeUInt32SizeNoTag + m35073i;
                        break;
                    } else {
                        continue;
                    }
                case 43:
                    m35073i = AbstractC8962u.m35059w((List) unsafe.getObject(obj, m35214Y));
                    if (m35073i > 0) {
                        if (this.f57493i) {
                            unsafe.putInt(obj, i3, m35073i);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(m35215X);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(m35073i);
                        computeDoubleSize = computeTagSize + computeUInt32SizeNoTag + m35073i;
                        break;
                    } else {
                        continue;
                    }
                case 44:
                    m35073i = AbstractC8962u.m35078e((List) unsafe.getObject(obj, m35214Y));
                    if (m35073i > 0) {
                        if (this.f57493i) {
                            unsafe.putInt(obj, i3, m35073i);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(m35215X);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(m35073i);
                        computeDoubleSize = computeTagSize + computeUInt32SizeNoTag + m35073i;
                        break;
                    } else {
                        continue;
                    }
                case 45:
                    m35073i = AbstractC8962u.m35075g((List) unsafe.getObject(obj, m35214Y));
                    if (m35073i > 0) {
                        if (this.f57493i) {
                            unsafe.putInt(obj, i3, m35073i);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(m35215X);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(m35073i);
                        computeDoubleSize = computeTagSize + computeUInt32SizeNoTag + m35073i;
                        break;
                    } else {
                        continue;
                    }
                case 46:
                    m35073i = AbstractC8962u.m35073i((List) unsafe.getObject(obj, m35214Y));
                    if (m35073i > 0) {
                        if (this.f57493i) {
                            unsafe.putInt(obj, i3, m35073i);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(m35215X);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(m35073i);
                        computeDoubleSize = computeTagSize + computeUInt32SizeNoTag + m35073i;
                        break;
                    } else {
                        continue;
                    }
                case 47:
                    m35073i = AbstractC8962u.m35064r((List) unsafe.getObject(obj, m35214Y));
                    if (m35073i > 0) {
                        if (this.f57493i) {
                            unsafe.putInt(obj, i3, m35073i);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(m35215X);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(m35073i);
                        computeDoubleSize = computeTagSize + computeUInt32SizeNoTag + m35073i;
                        break;
                    } else {
                        continue;
                    }
                case 48:
                    m35073i = AbstractC8962u.m35062t((List) unsafe.getObject(obj, m35214Y));
                    if (m35073i > 0) {
                        if (this.f57493i) {
                            unsafe.putInt(obj, i3, m35073i);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(m35215X);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(m35073i);
                        computeDoubleSize = computeTagSize + computeUInt32SizeNoTag + m35073i;
                        break;
                    } else {
                        continue;
                    }
                case 49:
                    computeDoubleSize = AbstractC8962u.m35072j(m35215X, m35227L(obj, m35214Y), m35179v(i2));
                    break;
                case 50:
                    computeDoubleSize = this.f57501q.mo35255e(m35215X, AbstractC22806wY1.m820H(obj, m35214Y), m35181u(i2));
                    break;
                case EACTags.TRANSACTION_DATE /* 51 */:
                    if (m35229J(obj, m35215X, i2)) {
                        computeDoubleSize = CodedOutputStream.computeDoubleSize(m35215X, 0.0d);
                        break;
                    } else {
                        continue;
                    }
                case EACTags.CARD_SEQUENCE_NUMBER /* 52 */:
                    if (m35229J(obj, m35215X, i2)) {
                        computeDoubleSize = CodedOutputStream.computeFloatSize(m35215X, 0.0f);
                        break;
                    } else {
                        continue;
                    }
                case EACTags.SEX /* 53 */:
                    if (m35229J(obj, m35215X, i2)) {
                        computeDoubleSize = CodedOutputStream.computeInt64Size(m35215X, m35209d0(obj, m35214Y));
                        break;
                    } else {
                        continue;
                    }
                case 54:
                    if (m35229J(obj, m35215X, i2)) {
                        computeDoubleSize = CodedOutputStream.computeUInt64Size(m35215X, m35209d0(obj, m35214Y));
                        break;
                    } else {
                        continue;
                    }
                case 55:
                    if (m35229J(obj, m35215X, i2)) {
                        computeDoubleSize = CodedOutputStream.computeInt32Size(m35215X, m35210c0(obj, m35214Y));
                        break;
                    } else {
                        continue;
                    }
                case 56:
                    if (m35229J(obj, m35215X, i2)) {
                        computeDoubleSize = CodedOutputStream.computeFixed64Size(m35215X, 0L);
                        break;
                    } else {
                        continue;
                    }
                case 57:
                    if (m35229J(obj, m35215X, i2)) {
                        computeDoubleSize = CodedOutputStream.computeFixed32Size(m35215X, 0);
                        break;
                    } else {
                        continue;
                    }
                case EACTags.DYNAMIC_INTERNAL_AUTHENTIFICATION /* 58 */:
                    if (m35229J(obj, m35215X, i2)) {
                        computeDoubleSize = CodedOutputStream.computeBoolSize(m35215X, true);
                        break;
                    } else {
                        continue;
                    }
                case EACTags.DYNAMIC_EXTERNAL_AUTHENTIFICATION /* 59 */:
                    if (m35229J(obj, m35215X, i2)) {
                        Object m820H2 = AbstractC22806wY1.m820H(obj, m35214Y);
                        if (m820H2 instanceof ByteString) {
                            computeDoubleSize = CodedOutputStream.computeBytesSize(m35215X, (ByteString) m820H2);
                            break;
                        } else {
                            computeDoubleSize = CodedOutputStream.computeStringSize(m35215X, (String) m820H2);
                            break;
                        }
                    } else {
                        continue;
                    }
                case 60:
                    if (m35229J(obj, m35215X, i2)) {
                        computeDoubleSize = AbstractC8962u.m35067o(m35215X, AbstractC22806wY1.m820H(obj, m35214Y), m35179v(i2));
                        break;
                    } else {
                        continue;
                    }
                case 61:
                    if (m35229J(obj, m35215X, i2)) {
                        computeDoubleSize = CodedOutputStream.computeBytesSize(m35215X, (ByteString) AbstractC22806wY1.m820H(obj, m35214Y));
                        break;
                    } else {
                        continue;
                    }
                case 62:
                    if (m35229J(obj, m35215X, i2)) {
                        computeDoubleSize = CodedOutputStream.computeUInt32Size(m35215X, m35210c0(obj, m35214Y));
                        break;
                    } else {
                        continue;
                    }
                case 63:
                    if (m35229J(obj, m35215X, i2)) {
                        computeDoubleSize = CodedOutputStream.computeEnumSize(m35215X, m35210c0(obj, m35214Y));
                        break;
                    } else {
                        continue;
                    }
                case 64:
                    if (m35229J(obj, m35215X, i2)) {
                        computeDoubleSize = CodedOutputStream.computeSFixed32Size(m35215X, 0);
                        break;
                    } else {
                        continue;
                    }
                case EACTags.ELEMENT_LIST /* 65 */:
                    if (m35229J(obj, m35215X, i2)) {
                        computeDoubleSize = CodedOutputStream.computeSFixed64Size(m35215X, 0L);
                        break;
                    } else {
                        continue;
                    }
                case EACTags.ADDRESS /* 66 */:
                    if (m35229J(obj, m35215X, i2)) {
                        computeDoubleSize = CodedOutputStream.computeSInt32Size(m35215X, m35210c0(obj, m35214Y));
                        break;
                    } else {
                        continue;
                    }
                case EACTags.CARDHOLDER_HANDWRITTEN_SIGNATURE /* 67 */:
                    if (m35229J(obj, m35215X, i2)) {
                        computeDoubleSize = CodedOutputStream.computeSInt64Size(m35215X, m35209d0(obj, m35214Y));
                        break;
                    } else {
                        continue;
                    }
                case EACTags.APPLICATION_IMAGE /* 68 */:
                    if (m35229J(obj, m35215X, i2)) {
                        computeDoubleSize = CodedOutputStream.m37009b(m35215X, (MessageLite) AbstractC22806wY1.m820H(obj, m35214Y), m35179v(i2));
                        break;
                    } else {
                        continue;
                    }
                default:
            }
            i += computeDoubleSize;
        }
        return i + m35171z(this.f57499o, obj);
    }

    /* renamed from: y0 */
    public final int m35172y0(int i) {
        return this.f57485a[i + 1];
    }

    /* renamed from: z */
    public final int m35171z(AbstractC8973w abstractC8973w, Object obj) {
        return abstractC8973w.mo35007h(abstractC8973w.mo35008g(obj));
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0491  */
    /* renamed from: z0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m35170z0(java.lang.Object r18, com.google.protobuf.Writer r19) {
        /*
            Method dump skipped, instructions count: 1338
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C8956p.m35170z0(java.lang.Object, com.google.protobuf.Writer):void");
    }
}
