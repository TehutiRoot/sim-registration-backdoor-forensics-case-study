package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.AbstractC4423b;
import androidx.datastore.preferences.protobuf.ByteString;
import androidx.datastore.preferences.protobuf.Internal;
import androidx.datastore.preferences.protobuf.MapEntryLite;
import androidx.datastore.preferences.protobuf.WireFormat;
import androidx.datastore.preferences.protobuf.Writer;
import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.asn1.eac.EACTags;
import sun.misc.Unsafe;

/* renamed from: androidx.datastore.preferences.protobuf.q */
/* loaded from: classes2.dex */
public final class C4448q implements InterfaceC4454v {

    /* renamed from: r */
    public static final int[] f34949r = new int[0];

    /* renamed from: s */
    public static final Unsafe f34950s = AbstractC22978xY1.m492G();

    /* renamed from: a */
    public final int[] f34951a;

    /* renamed from: b */
    public final Object[] f34952b;

    /* renamed from: c */
    public final int f34953c;

    /* renamed from: d */
    public final int f34954d;

    /* renamed from: e */
    public final MessageLite f34955e;

    /* renamed from: f */
    public final boolean f34956f;

    /* renamed from: g */
    public final boolean f34957g;

    /* renamed from: h */
    public final boolean f34958h;

    /* renamed from: i */
    public final boolean f34959i;

    /* renamed from: j */
    public final int[] f34960j;

    /* renamed from: k */
    public final int f34961k;

    /* renamed from: l */
    public final int f34962l;

    /* renamed from: m */
    public final InterfaceC20014gH0 f34963m;

    /* renamed from: n */
    public final AbstractC4440l f34964n;

    /* renamed from: o */
    public final AbstractC4466y f34965o;

    /* renamed from: p */
    public final AbstractC4435h f34966p;

    /* renamed from: q */
    public final InterfaceC4445n f34967q;

    /* renamed from: androidx.datastore.preferences.protobuf.q$a */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class C4449a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f34968a;

        static {
            int[] iArr = new int[WireFormat.FieldType.values().length];
            f34968a = iArr;
            try {
                iArr[WireFormat.FieldType.BOOL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f34968a[WireFormat.FieldType.BYTES.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f34968a[WireFormat.FieldType.DOUBLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f34968a[WireFormat.FieldType.FIXED32.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f34968a[WireFormat.FieldType.SFIXED32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f34968a[WireFormat.FieldType.FIXED64.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f34968a[WireFormat.FieldType.SFIXED64.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f34968a[WireFormat.FieldType.FLOAT.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f34968a[WireFormat.FieldType.ENUM.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f34968a[WireFormat.FieldType.INT32.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f34968a[WireFormat.FieldType.UINT32.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f34968a[WireFormat.FieldType.INT64.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f34968a[WireFormat.FieldType.UINT64.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f34968a[WireFormat.FieldType.MESSAGE.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f34968a[WireFormat.FieldType.SINT32.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f34968a[WireFormat.FieldType.SINT64.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f34968a[WireFormat.FieldType.STRING.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
        }
    }

    public C4448q(int[] iArr, Object[] objArr, int i, int i2, MessageLite messageLite, boolean z, boolean z2, int[] iArr2, int i3, int i4, InterfaceC20014gH0 interfaceC20014gH0, AbstractC4440l abstractC4440l, AbstractC4466y abstractC4466y, AbstractC4435h abstractC4435h, InterfaceC4445n interfaceC4445n) {
        boolean z3;
        this.f34951a = iArr;
        this.f34952b = objArr;
        this.f34953c = i;
        this.f34954d = i2;
        this.f34957g = messageLite instanceof GeneratedMessageLite;
        this.f34958h = z;
        if (abstractC4435h != null && abstractC4435h.mo55194e(messageLite)) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.f34956f = z3;
        this.f34959i = z2;
        this.f34960j = iArr2;
        this.f34961k = i3;
        this.f34962l = i4;
        this.f34963m = interfaceC20014gH0;
        this.f34964n = abstractC4440l;
        this.f34965o = abstractC4466y;
        this.f34966p = abstractC4435h;
        this.f34955e = messageLite;
        this.f34967q = interfaceC4445n;
    }

    /* renamed from: A */
    public static boolean m55138A(int i) {
        return (i & PKIFailureInfo.duplicateCertReq) != 0;
    }

    /* renamed from: D */
    public static boolean m55135D(Object obj, int i, InterfaceC4454v interfaceC4454v) {
        return interfaceC4454v.mo55019d(AbstractC22978xY1.m493F(obj, m55118U(i)));
    }

    /* renamed from: I */
    public static boolean m55130I(int i) {
        return (i & 268435456) != 0;
    }

    /* renamed from: J */
    public static List m55129J(Object obj, long j) {
        return (List) AbstractC22978xY1.m493F(obj, j);
    }

    /* renamed from: K */
    public static long m55128K(Object obj, long j) {
        return AbstractC22978xY1.m495D(obj, j);
    }

    /* renamed from: Q */
    public static C4448q m55122Q(Class cls, InterfaceC20971ls0 interfaceC20971ls0, InterfaceC20014gH0 interfaceC20014gH0, AbstractC4440l abstractC4440l, AbstractC4466y abstractC4466y, AbstractC4435h abstractC4435h, InterfaceC4445n interfaceC4445n) {
        if (interfaceC20971ls0 instanceof C18588Ur1) {
            return m55120S((C18588Ur1) interfaceC20971ls0, interfaceC20014gH0, abstractC4440l, abstractC4466y, abstractC4435h, interfaceC4445n);
        }
        return m55121R((StructuralMessageInfo) interfaceC20971ls0, interfaceC20014gH0, abstractC4440l, abstractC4466y, abstractC4435h, interfaceC4445n);
    }

    /* renamed from: R */
    public static C4448q m55121R(StructuralMessageInfo structuralMessageInfo, InterfaceC20014gH0 interfaceC20014gH0, AbstractC4440l abstractC4440l, AbstractC4466y abstractC4466y, AbstractC4435h abstractC4435h, InterfaceC4445n interfaceC4445n) {
        boolean z;
        int m55833m;
        int m55833m2;
        int[] iArr;
        int i;
        if (structuralMessageInfo.getSyntax() == ProtoSyntax.PROTO3) {
            z = true;
        } else {
            z = false;
        }
        FieldInfo[] m55557d = structuralMessageInfo.m55557d();
        if (m55557d.length == 0) {
            m55833m = 0;
            m55833m2 = 0;
        } else {
            m55833m = m55557d[0].m55833m();
            m55833m2 = m55557d[m55557d.length - 1].m55833m();
        }
        int length = m55557d.length;
        int[] iArr2 = new int[length * 3];
        Object[] objArr = new Object[length * 2];
        int i2 = 0;
        int i3 = 0;
        for (FieldInfo fieldInfo : m55557d) {
            if (fieldInfo.m55827s() == FieldType.MAP) {
                i2++;
            } else if (fieldInfo.m55827s().m55777id() >= 18 && fieldInfo.m55827s().m55777id() <= 49) {
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
        int[] m55558c = structuralMessageInfo.m55558c();
        if (m55558c == null) {
            m55558c = f34949r;
        }
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        while (i4 < m55557d.length) {
            FieldInfo fieldInfo2 = m55557d[i4];
            int m55833m3 = fieldInfo2.m55833m();
            m55088q0(fieldInfo2, iArr2, i5, z, objArr);
            if (i6 < m55558c.length && m55558c[i6] == m55833m3) {
                m55558c[i6] = i5;
                i6++;
            }
            if (fieldInfo2.m55827s() == FieldType.MAP) {
                iArr[i7] = i5;
                i7++;
            } else if (fieldInfo2.m55827s().m55777id() >= 18 && fieldInfo2.m55827s().m55777id() <= 49) {
                i = i5;
                iArr3[i8] = (int) AbstractC22978xY1.m489J(fieldInfo2.m55834l());
                i8++;
                i4++;
                i5 = i + 3;
            }
            i = i5;
            i4++;
            i5 = i + 3;
        }
        if (iArr == null) {
            iArr = f34949r;
        }
        if (iArr3 == null) {
            iArr3 = f34949r;
        }
        int[] iArr4 = new int[m55558c.length + iArr.length + iArr3.length];
        System.arraycopy(m55558c, 0, iArr4, 0, m55558c.length);
        System.arraycopy(iArr, 0, iArr4, m55558c.length, iArr.length);
        System.arraycopy(iArr3, 0, iArr4, m55558c.length + iArr.length, iArr3.length);
        return new C4448q(iArr2, objArr, m55833m, m55833m2, structuralMessageInfo.mo26413b(), z, true, iArr4, m55558c.length, m55558c.length + iArr.length, interfaceC20014gH0, abstractC4440l, abstractC4466y, abstractC4435h, interfaceC4445n);
    }

    /* JADX WARN: Removed duplicated region for block: B:124:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0298  */
    /* renamed from: S */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static androidx.datastore.preferences.protobuf.C4448q m55120S(p000.C18588Ur1 r36, p000.InterfaceC20014gH0 r37, androidx.datastore.preferences.protobuf.AbstractC4440l r38, androidx.datastore.preferences.protobuf.AbstractC4466y r39, androidx.datastore.preferences.protobuf.AbstractC4435h r40, androidx.datastore.preferences.protobuf.InterfaceC4445n r41) {
        /*
            Method dump skipped, instructions count: 1040
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.C4448q.m55120S(Ur1, gH0, androidx.datastore.preferences.protobuf.l, androidx.datastore.preferences.protobuf.y, androidx.datastore.preferences.protobuf.h, androidx.datastore.preferences.protobuf.n):androidx.datastore.preferences.protobuf.q");
    }

    /* renamed from: U */
    public static long m55118U(int i) {
        return i & 1048575;
    }

    /* renamed from: V */
    public static boolean m55117V(Object obj, long j) {
        return ((Boolean) AbstractC22978xY1.m493F(obj, j)).booleanValue();
    }

    /* renamed from: W */
    public static double m55116W(Object obj, long j) {
        return ((Double) AbstractC22978xY1.m493F(obj, j)).doubleValue();
    }

    /* renamed from: X */
    public static float m55115X(Object obj, long j) {
        return ((Float) AbstractC22978xY1.m493F(obj, j)).floatValue();
    }

    /* renamed from: Y */
    public static int m55114Y(Object obj, long j) {
        return ((Integer) AbstractC22978xY1.m493F(obj, j)).intValue();
    }

    /* renamed from: Z */
    public static long m55113Z(Object obj, long j) {
        return ((Long) AbstractC22978xY1.m493F(obj, j)).longValue();
    }

    /* renamed from: k */
    public static boolean m55101k(Object obj, long j) {
        return AbstractC22978xY1.m456s(obj, j);
    }

    /* renamed from: m0 */
    public static java.lang.reflect.Field m55096m0(Class cls, String str) {
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

    /* renamed from: n */
    public static double m55095n(Object obj, long j) {
        return AbstractC22978xY1.m449z(obj, j);
    }

    /* renamed from: q0 */
    public static void m55088q0(FieldInfo fieldInfo, int[] iArr, int i, boolean z, Object[] objArr) {
        int m489J;
        int i2;
        int i3;
        fieldInfo.m55830p();
        FieldType m55827s = fieldInfo.m55827s();
        int m489J2 = (int) AbstractC22978xY1.m489J(fieldInfo.m55834l());
        int m55777id = m55827s.m55777id();
        int i4 = 0;
        if (!z && !m55827s.isList() && !m55827s.isMap()) {
            m489J = (int) AbstractC22978xY1.m489J(fieldInfo.m55829q());
            i2 = Integer.numberOfTrailingZeros(fieldInfo.m55828r());
        } else {
            if (fieldInfo.m55836j() == null) {
                m489J = 0;
            } else {
                m489J = (int) AbstractC22978xY1.m489J(fieldInfo.m55836j());
            }
            i2 = 0;
        }
        iArr[i] = fieldInfo.m55833m();
        int i5 = i + 1;
        if (fieldInfo.m55826t()) {
            i3 = PKIFailureInfo.duplicateCertReq;
        } else {
            i3 = 0;
        }
        if (fieldInfo.m55824v()) {
            i4 = 268435456;
        }
        iArr[i5] = (m55777id << 20) | i4 | i3 | m489J2;
        iArr[i + 2] = m489J | (i2 << 20);
        Class m55831o = fieldInfo.m55831o();
        if (fieldInfo.m55832n() != null) {
            int i6 = (i / 3) * 2;
            objArr[i6] = fieldInfo.m55832n();
            if (m55831o != null) {
                objArr[i6 + 1] = m55831o;
            } else if (fieldInfo.m55835k() != null) {
                objArr[i6 + 1] = fieldInfo.m55835k();
            }
        } else if (m55831o != null) {
            objArr[((i / 3) * 2) + 1] = m55831o;
        } else if (fieldInfo.m55835k() != null) {
            objArr[((i / 3) * 2) + 1] = fieldInfo.m55835k();
        }
    }

    /* renamed from: r */
    public static float m55087r(Object obj, long j) {
        return AbstractC22978xY1.m498A(obj, j);
    }

    /* renamed from: r0 */
    public static int m55086r0(int i) {
        return (i & 267386880) >>> 20;
    }

    /* renamed from: v */
    public static UnknownFieldSetLite m55079v(Object obj) {
        GeneratedMessageLite generatedMessageLite = (GeneratedMessageLite) obj;
        UnknownFieldSetLite unknownFieldSetLite = generatedMessageLite.unknownFields;
        if (unknownFieldSetLite == UnknownFieldSetLite.getDefaultInstance()) {
            UnknownFieldSetLite m55453l = UnknownFieldSetLite.m55453l();
            generatedMessageLite.unknownFields = m55453l;
            return m55453l;
        }
        return unknownFieldSetLite;
    }

    /* renamed from: z */
    public static int m55071z(Object obj, long j) {
        return AbstractC22978xY1.m497B(obj, j);
    }

    /* renamed from: B */
    public final boolean m55137B(Object obj, int i) {
        if (this.f34958h) {
            int m55084s0 = m55084s0(i);
            long m55118U = m55118U(m55084s0);
            switch (m55086r0(m55084s0)) {
                case 0:
                    if (AbstractC22978xY1.m449z(obj, m55118U) == 0.0d) {
                        return false;
                    }
                    return true;
                case 1:
                    if (AbstractC22978xY1.m498A(obj, m55118U) == 0.0f) {
                        return false;
                    }
                    return true;
                case 2:
                    if (AbstractC22978xY1.m495D(obj, m55118U) == 0) {
                        return false;
                    }
                    return true;
                case 3:
                    if (AbstractC22978xY1.m495D(obj, m55118U) == 0) {
                        return false;
                    }
                    return true;
                case 4:
                    if (AbstractC22978xY1.m497B(obj, m55118U) == 0) {
                        return false;
                    }
                    return true;
                case 5:
                    if (AbstractC22978xY1.m495D(obj, m55118U) == 0) {
                        return false;
                    }
                    return true;
                case 6:
                    if (AbstractC22978xY1.m497B(obj, m55118U) == 0) {
                        return false;
                    }
                    return true;
                case 7:
                    return AbstractC22978xY1.m456s(obj, m55118U);
                case 8:
                    Object m493F = AbstractC22978xY1.m493F(obj, m55118U);
                    if (m493F instanceof String) {
                        return !((String) m493F).isEmpty();
                    }
                    if (m493F instanceof ByteString) {
                        return !ByteString.EMPTY.equals(m493F);
                    }
                    throw new IllegalArgumentException();
                case 9:
                    if (AbstractC22978xY1.m493F(obj, m55118U) == null) {
                        return false;
                    }
                    return true;
                case 10:
                    return !ByteString.EMPTY.equals(AbstractC22978xY1.m493F(obj, m55118U));
                case 11:
                    if (AbstractC22978xY1.m497B(obj, m55118U) == 0) {
                        return false;
                    }
                    return true;
                case 12:
                    if (AbstractC22978xY1.m497B(obj, m55118U) == 0) {
                        return false;
                    }
                    return true;
                case 13:
                    if (AbstractC22978xY1.m497B(obj, m55118U) == 0) {
                        return false;
                    }
                    return true;
                case 14:
                    if (AbstractC22978xY1.m495D(obj, m55118U) == 0) {
                        return false;
                    }
                    return true;
                case 15:
                    if (AbstractC22978xY1.m497B(obj, m55118U) == 0) {
                        return false;
                    }
                    return true;
                case 16:
                    if (AbstractC22978xY1.m495D(obj, m55118U) == 0) {
                        return false;
                    }
                    return true;
                case 17:
                    if (AbstractC22978xY1.m493F(obj, m55118U) == null) {
                        return false;
                    }
                    return true;
                default:
                    throw new IllegalArgumentException();
            }
        }
        int m55105h0 = m55105h0(i);
        if ((AbstractC22978xY1.m497B(obj, m55105h0 & 1048575) & (1 << (m55105h0 >>> 20))) == 0) {
            return false;
        }
        return true;
    }

    /* renamed from: C */
    public final boolean m55136C(Object obj, int i, int i2, int i3) {
        if (this.f34958h) {
            return m55137B(obj, i);
        }
        if ((i2 & i3) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: E */
    public final boolean m55134E(Object obj, int i, int i2) {
        List list = (List) AbstractC22978xY1.m493F(obj, m55118U(i));
        if (list.isEmpty()) {
            return true;
        }
        InterfaceC4454v m55081u = m55081u(i2);
        for (int i3 = 0; i3 < list.size(); i3++) {
            if (!m55081u.mo55019d(list.get(i3))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: F */
    public final boolean m55133F(Object obj, int i, int i2) {
        Map mo55146h = this.f34967q.mo55146h(AbstractC22978xY1.m493F(obj, m55118U(i)));
        if (mo55146h.isEmpty()) {
            return true;
        }
        if (this.f34967q.mo55151c(m55083t(i2)).f34849c.getJavaType() != WireFormat.JavaType.MESSAGE) {
            return true;
        }
        InterfaceC4454v interfaceC4454v = null;
        for (Object obj2 : mo55146h.values()) {
            if (interfaceC4454v == null) {
                interfaceC4454v = C17942Ko1.m67586a().m67583d(obj2.getClass());
            }
            if (!interfaceC4454v.mo55019d(obj2)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: G */
    public final boolean m55132G(Object obj, Object obj2, int i) {
        long m55105h0 = m55105h0(i) & 1048575;
        if (AbstractC22978xY1.m497B(obj, m55105h0) == AbstractC22978xY1.m497B(obj2, m55105h0)) {
            return true;
        }
        return false;
    }

    /* renamed from: H */
    public final boolean m55131H(Object obj, int i, int i2) {
        if (AbstractC22978xY1.m497B(obj, m55105h0(i2) & 1048575) == i) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x007b, code lost:
        r0 = r16.f34961k;
     */
    /* JADX WARN: Code restructure failed: missing block: B:363:?, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x007f, code lost:
        if (r0 >= r16.f34962l) goto L326;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0081, code lost:
        r13 = m55091p(r19, r16.f34960j[r0], r13, r17);
        r0 = r0 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x008c, code lost:
        if (r13 == null) goto L330;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x008e, code lost:
        r17.mo54903o(r19, r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0091, code lost:
        return;
     */
    /* renamed from: L */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m55127L(androidx.datastore.preferences.protobuf.AbstractC4466y r17, androidx.datastore.preferences.protobuf.AbstractC4435h r18, java.lang.Object r19, androidx.datastore.preferences.protobuf.InterfaceC4453u r20, androidx.datastore.preferences.protobuf.ExtensionRegistryLite r21) {
        /*
            Method dump skipped, instructions count: 1720
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.C4448q.m55127L(androidx.datastore.preferences.protobuf.y, androidx.datastore.preferences.protobuf.h, java.lang.Object, androidx.datastore.preferences.protobuf.u, androidx.datastore.preferences.protobuf.ExtensionRegistryLite):void");
    }

    /* renamed from: M */
    public final void m55126M(Object obj, int i, Object obj2, ExtensionRegistryLite extensionRegistryLite, InterfaceC4453u interfaceC4453u) {
        long m55118U = m55118U(m55084s0(i));
        Object m493F = AbstractC22978xY1.m493F(obj, m55118U);
        if (m493F == null) {
            m493F = this.f34967q.mo55147g(obj2);
            AbstractC22978xY1.m477V(obj, m55118U, m493F);
        } else if (this.f34967q.mo55145i(m493F)) {
            Object mo55147g = this.f34967q.mo55147g(obj2);
            this.f34967q.mo55152b(mo55147g, m493F);
            AbstractC22978xY1.m477V(obj, m55118U, mo55147g);
            m493F = mo55147g;
        }
        interfaceC4453u.mo55050K(this.f34967q.mo55148f(m493F), this.f34967q.mo55151c(obj2), extensionRegistryLite);
    }

    /* renamed from: N */
    public final void m55125N(Object obj, Object obj2, int i) {
        long m55118U = m55118U(m55084s0(i));
        if (!m55137B(obj2, i)) {
            return;
        }
        Object m493F = AbstractC22978xY1.m493F(obj, m55118U);
        Object m493F2 = AbstractC22978xY1.m493F(obj2, m55118U);
        if (m493F != null && m493F2 != null) {
            AbstractC22978xY1.m477V(obj, m55118U, Internal.m55727d(m493F, m493F2));
            m55094n0(obj, i);
        } else if (m493F2 != null) {
            AbstractC22978xY1.m477V(obj, m55118U, m493F2);
            m55094n0(obj, i);
        }
    }

    /* renamed from: O */
    public final void m55124O(Object obj, Object obj2, int i) {
        int m55084s0 = m55084s0(i);
        int m55119T = m55119T(i);
        long m55118U = m55118U(m55084s0);
        if (!m55131H(obj2, m55119T, i)) {
            return;
        }
        Object m493F = AbstractC22978xY1.m493F(obj, m55118U);
        Object m493F2 = AbstractC22978xY1.m493F(obj2, m55118U);
        if (m493F != null && m493F2 != null) {
            AbstractC22978xY1.m477V(obj, m55118U, Internal.m55727d(m493F, m493F2));
            m55092o0(obj, m55119T, i);
        } else if (m493F2 != null) {
            AbstractC22978xY1.m477V(obj, m55118U, m493F2);
            m55092o0(obj, m55119T, i);
        }
    }

    /* renamed from: P */
    public final void m55123P(Object obj, Object obj2, int i) {
        int m55084s0 = m55084s0(i);
        long m55118U = m55118U(m55084s0);
        int m55119T = m55119T(i);
        switch (m55086r0(m55084s0)) {
            case 0:
                if (m55137B(obj2, i)) {
                    AbstractC22978xY1.m481R(obj, m55118U, AbstractC22978xY1.m449z(obj2, m55118U));
                    m55094n0(obj, i);
                    return;
                }
                return;
            case 1:
                if (m55137B(obj2, i)) {
                    AbstractC22978xY1.m480S(obj, m55118U, AbstractC22978xY1.m498A(obj2, m55118U));
                    m55094n0(obj, i);
                    return;
                }
                return;
            case 2:
                if (m55137B(obj2, i)) {
                    AbstractC22978xY1.m478U(obj, m55118U, AbstractC22978xY1.m495D(obj2, m55118U));
                    m55094n0(obj, i);
                    return;
                }
                return;
            case 3:
                if (m55137B(obj2, i)) {
                    AbstractC22978xY1.m478U(obj, m55118U, AbstractC22978xY1.m495D(obj2, m55118U));
                    m55094n0(obj, i);
                    return;
                }
                return;
            case 4:
                if (m55137B(obj2, i)) {
                    AbstractC22978xY1.m479T(obj, m55118U, AbstractC22978xY1.m497B(obj2, m55118U));
                    m55094n0(obj, i);
                    return;
                }
                return;
            case 5:
                if (m55137B(obj2, i)) {
                    AbstractC22978xY1.m478U(obj, m55118U, AbstractC22978xY1.m495D(obj2, m55118U));
                    m55094n0(obj, i);
                    return;
                }
                return;
            case 6:
                if (m55137B(obj2, i)) {
                    AbstractC22978xY1.m479T(obj, m55118U, AbstractC22978xY1.m497B(obj2, m55118U));
                    m55094n0(obj, i);
                    return;
                }
                return;
            case 7:
                if (m55137B(obj2, i)) {
                    AbstractC22978xY1.m488K(obj, m55118U, AbstractC22978xY1.m456s(obj2, m55118U));
                    m55094n0(obj, i);
                    return;
                }
                return;
            case 8:
                if (m55137B(obj2, i)) {
                    AbstractC22978xY1.m477V(obj, m55118U, AbstractC22978xY1.m493F(obj2, m55118U));
                    m55094n0(obj, i);
                    return;
                }
                return;
            case 9:
                m55125N(obj, obj2, i);
                return;
            case 10:
                if (m55137B(obj2, i)) {
                    AbstractC22978xY1.m477V(obj, m55118U, AbstractC22978xY1.m493F(obj2, m55118U));
                    m55094n0(obj, i);
                    return;
                }
                return;
            case 11:
                if (m55137B(obj2, i)) {
                    AbstractC22978xY1.m479T(obj, m55118U, AbstractC22978xY1.m497B(obj2, m55118U));
                    m55094n0(obj, i);
                    return;
                }
                return;
            case 12:
                if (m55137B(obj2, i)) {
                    AbstractC22978xY1.m479T(obj, m55118U, AbstractC22978xY1.m497B(obj2, m55118U));
                    m55094n0(obj, i);
                    return;
                }
                return;
            case 13:
                if (m55137B(obj2, i)) {
                    AbstractC22978xY1.m479T(obj, m55118U, AbstractC22978xY1.m497B(obj2, m55118U));
                    m55094n0(obj, i);
                    return;
                }
                return;
            case 14:
                if (m55137B(obj2, i)) {
                    AbstractC22978xY1.m478U(obj, m55118U, AbstractC22978xY1.m495D(obj2, m55118U));
                    m55094n0(obj, i);
                    return;
                }
                return;
            case 15:
                if (m55137B(obj2, i)) {
                    AbstractC22978xY1.m479T(obj, m55118U, AbstractC22978xY1.m497B(obj2, m55118U));
                    m55094n0(obj, i);
                    return;
                }
                return;
            case 16:
                if (m55137B(obj2, i)) {
                    AbstractC22978xY1.m478U(obj, m55118U, AbstractC22978xY1.m495D(obj2, m55118U));
                    m55094n0(obj, i);
                    return;
                }
                return;
            case 17:
                m55125N(obj, obj2, i);
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
                this.f34964n.mo55165d(obj, obj2, m55118U);
                return;
            case 50:
                AbstractC4455w.m55008F(this.f34967q, obj, obj2, m55118U);
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
                if (m55131H(obj2, m55119T, i)) {
                    AbstractC22978xY1.m477V(obj, m55118U, AbstractC22978xY1.m493F(obj2, m55118U));
                    m55092o0(obj, m55119T, i);
                    return;
                }
                return;
            case 60:
                m55124O(obj, obj2, i);
                return;
            case 61:
            case 62:
            case 63:
            case 64:
            case EACTags.ELEMENT_LIST /* 65 */:
            case EACTags.ADDRESS /* 66 */:
            case EACTags.CARDHOLDER_HANDWRITTEN_SIGNATURE /* 67 */:
                if (m55131H(obj2, m55119T, i)) {
                    AbstractC22978xY1.m477V(obj, m55118U, AbstractC22978xY1.m493F(obj2, m55118U));
                    m55092o0(obj, m55119T, i);
                    return;
                }
                return;
            case EACTags.APPLICATION_IMAGE /* 68 */:
                m55124O(obj, obj2, i);
                return;
            default:
                return;
        }
    }

    /* renamed from: T */
    public final int m55119T(int i) {
        return this.f34951a[i];
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC4454v
    /* renamed from: a */
    public boolean mo55022a(Object obj, Object obj2) {
        int length = this.f34951a.length;
        for (int i = 0; i < length; i += 3) {
            if (!m55093o(obj, obj2, i)) {
                return false;
            }
        }
        if (!this.f34965o.mo54909g(obj).equals(this.f34965o.mo54909g(obj2))) {
            return false;
        }
        if (this.f34956f) {
            return this.f34966p.mo55196c(obj).equals(this.f34966p.mo55196c(obj2));
        }
        return true;
    }

    /* renamed from: a0 */
    public final int m55112a0(Object obj, byte[] bArr, int i, int i2, int i3, long j, AbstractC4423b.C4425b c4425b) {
        Unsafe unsafe = f34950s;
        Object m55083t = m55083t(i3);
        Object object = unsafe.getObject(obj, j);
        if (this.f34967q.mo55145i(object)) {
            Object mo55147g = this.f34967q.mo55147g(m55083t);
            this.f34967q.mo55152b(mo55147g, object);
            unsafe.putObject(obj, j, mo55147g);
            object = mo55147g;
        }
        return m55099l(bArr, i, i2, this.f34967q.mo55151c(m55083t), this.f34967q.mo55148f(object), c4425b);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC4454v
    /* renamed from: b */
    public void mo55021b(Object obj, Object obj2) {
        obj2.getClass();
        for (int i = 0; i < this.f34951a.length; i += 3) {
            m55123P(obj, obj2, i);
        }
        if (!this.f34958h) {
            AbstractC4455w.m55007G(this.f34965o, obj, obj2);
            if (this.f34956f) {
                AbstractC4455w.m55009E(this.f34966p, obj, obj2);
            }
        }
    }

    /* renamed from: b0 */
    public final int m55111b0(Object obj, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, int i8, AbstractC4423b.C4425b c4425b) {
        boolean z;
        Object obj2;
        Object obj3;
        Unsafe unsafe = f34950s;
        long j2 = this.f34951a[i8 + 2] & 1048575;
        switch (i7) {
            case EACTags.TRANSACTION_DATE /* 51 */:
                if (i5 == 1) {
                    unsafe.putObject(obj, j, Double.valueOf(AbstractC4423b.m55319d(bArr, i)));
                    int i9 = i + 8;
                    unsafe.putInt(obj, j2, i4);
                    return i9;
                }
                break;
            case EACTags.CARD_SEQUENCE_NUMBER /* 52 */:
                if (i5 == 5) {
                    unsafe.putObject(obj, j, Float.valueOf(AbstractC4423b.m55311l(bArr, i)));
                    int i10 = i + 4;
                    unsafe.putInt(obj, j2, i4);
                    return i10;
                }
                break;
            case EACTags.SEX /* 53 */:
            case 54:
                if (i5 == 0) {
                    int m55325L = AbstractC4423b.m55325L(bArr, i, c4425b);
                    unsafe.putObject(obj, j, Long.valueOf(c4425b.f34912b));
                    unsafe.putInt(obj, j2, i4);
                    return m55325L;
                }
                break;
            case 55:
            case 62:
                if (i5 == 0) {
                    int m55328I = AbstractC4423b.m55328I(bArr, i, c4425b);
                    unsafe.putObject(obj, j, Integer.valueOf(c4425b.f34911a));
                    unsafe.putInt(obj, j2, i4);
                    return m55328I;
                }
                break;
            case 56:
            case EACTags.ELEMENT_LIST /* 65 */:
                if (i5 == 1) {
                    unsafe.putObject(obj, j, Long.valueOf(AbstractC4423b.m55313j(bArr, i)));
                    int i11 = i + 8;
                    unsafe.putInt(obj, j2, i4);
                    return i11;
                }
                break;
            case 57:
            case 64:
                if (i5 == 5) {
                    unsafe.putObject(obj, j, Integer.valueOf(AbstractC4423b.m55315h(bArr, i)));
                    int i12 = i + 4;
                    unsafe.putInt(obj, j2, i4);
                    return i12;
                }
                break;
            case EACTags.DYNAMIC_INTERNAL_AUTHENTIFICATION /* 58 */:
                if (i5 == 0) {
                    int m55325L2 = AbstractC4423b.m55325L(bArr, i, c4425b);
                    if (c4425b.f34912b != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    unsafe.putObject(obj, j, Boolean.valueOf(z));
                    unsafe.putInt(obj, j2, i4);
                    return m55325L2;
                }
                break;
            case EACTags.DYNAMIC_EXTERNAL_AUTHENTIFICATION /* 59 */:
                if (i5 == 2) {
                    int m55328I2 = AbstractC4423b.m55328I(bArr, i, c4425b);
                    int i13 = c4425b.f34911a;
                    if (i13 == 0) {
                        unsafe.putObject(obj, j, "");
                    } else if ((i6 & PKIFailureInfo.duplicateCertReq) != 0 && !Utf8.m55422u(bArr, m55328I2, m55328I2 + i13)) {
                        throw InvalidProtocolBufferException.invalidUtf8();
                    } else {
                        unsafe.putObject(obj, j, new String(bArr, m55328I2, i13, Internal.f34817a));
                        m55328I2 += i13;
                    }
                    unsafe.putInt(obj, j2, i4);
                    return m55328I2;
                }
                break;
            case 60:
                if (i5 == 2) {
                    int m55307p = AbstractC4423b.m55307p(m55081u(i8), bArr, i, i2, c4425b);
                    if (unsafe.getInt(obj, j2) == i4) {
                        obj2 = unsafe.getObject(obj, j);
                    } else {
                        obj2 = null;
                    }
                    if (obj2 == null) {
                        unsafe.putObject(obj, j, c4425b.f34913c);
                    } else {
                        unsafe.putObject(obj, j, Internal.m55727d(obj2, c4425b.f34913c));
                    }
                    unsafe.putInt(obj, j2, i4);
                    return m55307p;
                }
                break;
            case 61:
                if (i5 == 2) {
                    int m55321b = AbstractC4423b.m55321b(bArr, i, c4425b);
                    unsafe.putObject(obj, j, c4425b.f34913c);
                    unsafe.putInt(obj, j2, i4);
                    return m55321b;
                }
                break;
            case 63:
                if (i5 == 0) {
                    int m55328I3 = AbstractC4423b.m55328I(bArr, i, c4425b);
                    int i14 = c4425b.f34911a;
                    Internal.EnumVerifier m55085s = m55085s(i8);
                    if (m55085s != null && !m55085s.isInRange(i14)) {
                        m55079v(obj).m55451n(i3, Long.valueOf(i14));
                    } else {
                        unsafe.putObject(obj, j, Integer.valueOf(i14));
                        unsafe.putInt(obj, j2, i4);
                    }
                    return m55328I3;
                }
                break;
            case EACTags.ADDRESS /* 66 */:
                if (i5 == 0) {
                    int m55328I4 = AbstractC4423b.m55328I(bArr, i, c4425b);
                    unsafe.putObject(obj, j, Integer.valueOf(CodedInputStream.decodeZigZag32(c4425b.f34911a)));
                    unsafe.putInt(obj, j2, i4);
                    return m55328I4;
                }
                break;
            case EACTags.CARDHOLDER_HANDWRITTEN_SIGNATURE /* 67 */:
                if (i5 == 0) {
                    int m55325L3 = AbstractC4423b.m55325L(bArr, i, c4425b);
                    unsafe.putObject(obj, j, Long.valueOf(CodedInputStream.decodeZigZag64(c4425b.f34912b)));
                    unsafe.putInt(obj, j2, i4);
                    return m55325L3;
                }
                break;
            case EACTags.APPLICATION_IMAGE /* 68 */:
                if (i5 == 3) {
                    int m55309n = AbstractC4423b.m55309n(m55081u(i8), bArr, i, i2, (i3 & (-8)) | 4, c4425b);
                    if (unsafe.getInt(obj, j2) == i4) {
                        obj3 = unsafe.getObject(obj, j);
                    } else {
                        obj3 = null;
                    }
                    if (obj3 == null) {
                        unsafe.putObject(obj, j, c4425b.f34913c);
                    } else {
                        unsafe.putObject(obj, j, Internal.m55727d(obj3, c4425b.f34913c));
                    }
                    unsafe.putInt(obj, j2, i4);
                    return m55309n;
                }
                break;
        }
        return i;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC4454v
    /* renamed from: c */
    public int mo55020c(Object obj) {
        int i;
        int hashLong;
        int length = this.f34951a.length;
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3 += 3) {
            int m55084s0 = m55084s0(i3);
            int m55119T = m55119T(i3);
            long m55118U = m55118U(m55084s0);
            int i4 = 37;
            switch (m55086r0(m55084s0)) {
                case 0:
                    i = i2 * 53;
                    hashLong = Internal.hashLong(Double.doubleToLongBits(AbstractC22978xY1.m449z(obj, m55118U)));
                    i2 = i + hashLong;
                    break;
                case 1:
                    i = i2 * 53;
                    hashLong = Float.floatToIntBits(AbstractC22978xY1.m498A(obj, m55118U));
                    i2 = i + hashLong;
                    break;
                case 2:
                    i = i2 * 53;
                    hashLong = Internal.hashLong(AbstractC22978xY1.m495D(obj, m55118U));
                    i2 = i + hashLong;
                    break;
                case 3:
                    i = i2 * 53;
                    hashLong = Internal.hashLong(AbstractC22978xY1.m495D(obj, m55118U));
                    i2 = i + hashLong;
                    break;
                case 4:
                    i = i2 * 53;
                    hashLong = AbstractC22978xY1.m497B(obj, m55118U);
                    i2 = i + hashLong;
                    break;
                case 5:
                    i = i2 * 53;
                    hashLong = Internal.hashLong(AbstractC22978xY1.m495D(obj, m55118U));
                    i2 = i + hashLong;
                    break;
                case 6:
                    i = i2 * 53;
                    hashLong = AbstractC22978xY1.m497B(obj, m55118U);
                    i2 = i + hashLong;
                    break;
                case 7:
                    i = i2 * 53;
                    hashLong = Internal.hashBoolean(AbstractC22978xY1.m456s(obj, m55118U));
                    i2 = i + hashLong;
                    break;
                case 8:
                    i = i2 * 53;
                    hashLong = ((String) AbstractC22978xY1.m493F(obj, m55118U)).hashCode();
                    i2 = i + hashLong;
                    break;
                case 9:
                    Object m493F = AbstractC22978xY1.m493F(obj, m55118U);
                    if (m493F != null) {
                        i4 = m493F.hashCode();
                    }
                    i2 = (i2 * 53) + i4;
                    break;
                case 10:
                    i = i2 * 53;
                    hashLong = AbstractC22978xY1.m493F(obj, m55118U).hashCode();
                    i2 = i + hashLong;
                    break;
                case 11:
                    i = i2 * 53;
                    hashLong = AbstractC22978xY1.m497B(obj, m55118U);
                    i2 = i + hashLong;
                    break;
                case 12:
                    i = i2 * 53;
                    hashLong = AbstractC22978xY1.m497B(obj, m55118U);
                    i2 = i + hashLong;
                    break;
                case 13:
                    i = i2 * 53;
                    hashLong = AbstractC22978xY1.m497B(obj, m55118U);
                    i2 = i + hashLong;
                    break;
                case 14:
                    i = i2 * 53;
                    hashLong = Internal.hashLong(AbstractC22978xY1.m495D(obj, m55118U));
                    i2 = i + hashLong;
                    break;
                case 15:
                    i = i2 * 53;
                    hashLong = AbstractC22978xY1.m497B(obj, m55118U);
                    i2 = i + hashLong;
                    break;
                case 16:
                    i = i2 * 53;
                    hashLong = Internal.hashLong(AbstractC22978xY1.m495D(obj, m55118U));
                    i2 = i + hashLong;
                    break;
                case 17:
                    Object m493F2 = AbstractC22978xY1.m493F(obj, m55118U);
                    if (m493F2 != null) {
                        i4 = m493F2.hashCode();
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
                    hashLong = AbstractC22978xY1.m493F(obj, m55118U).hashCode();
                    i2 = i + hashLong;
                    break;
                case 50:
                    i = i2 * 53;
                    hashLong = AbstractC22978xY1.m493F(obj, m55118U).hashCode();
                    i2 = i + hashLong;
                    break;
                case EACTags.TRANSACTION_DATE /* 51 */:
                    if (m55131H(obj, m55119T, i3)) {
                        i = i2 * 53;
                        hashLong = Internal.hashLong(Double.doubleToLongBits(m55116W(obj, m55118U)));
                        i2 = i + hashLong;
                        break;
                    } else {
                        break;
                    }
                case EACTags.CARD_SEQUENCE_NUMBER /* 52 */:
                    if (m55131H(obj, m55119T, i3)) {
                        i = i2 * 53;
                        hashLong = Float.floatToIntBits(m55115X(obj, m55118U));
                        i2 = i + hashLong;
                        break;
                    } else {
                        break;
                    }
                case EACTags.SEX /* 53 */:
                    if (m55131H(obj, m55119T, i3)) {
                        i = i2 * 53;
                        hashLong = Internal.hashLong(m55113Z(obj, m55118U));
                        i2 = i + hashLong;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (m55131H(obj, m55119T, i3)) {
                        i = i2 * 53;
                        hashLong = Internal.hashLong(m55113Z(obj, m55118U));
                        i2 = i + hashLong;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (m55131H(obj, m55119T, i3)) {
                        i = i2 * 53;
                        hashLong = m55114Y(obj, m55118U);
                        i2 = i + hashLong;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (m55131H(obj, m55119T, i3)) {
                        i = i2 * 53;
                        hashLong = Internal.hashLong(m55113Z(obj, m55118U));
                        i2 = i + hashLong;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (m55131H(obj, m55119T, i3)) {
                        i = i2 * 53;
                        hashLong = m55114Y(obj, m55118U);
                        i2 = i + hashLong;
                        break;
                    } else {
                        break;
                    }
                case EACTags.DYNAMIC_INTERNAL_AUTHENTIFICATION /* 58 */:
                    if (m55131H(obj, m55119T, i3)) {
                        i = i2 * 53;
                        hashLong = Internal.hashBoolean(m55117V(obj, m55118U));
                        i2 = i + hashLong;
                        break;
                    } else {
                        break;
                    }
                case EACTags.DYNAMIC_EXTERNAL_AUTHENTIFICATION /* 59 */:
                    if (m55131H(obj, m55119T, i3)) {
                        i = i2 * 53;
                        hashLong = ((String) AbstractC22978xY1.m493F(obj, m55118U)).hashCode();
                        i2 = i + hashLong;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (m55131H(obj, m55119T, i3)) {
                        i = i2 * 53;
                        hashLong = AbstractC22978xY1.m493F(obj, m55118U).hashCode();
                        i2 = i + hashLong;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (m55131H(obj, m55119T, i3)) {
                        i = i2 * 53;
                        hashLong = AbstractC22978xY1.m493F(obj, m55118U).hashCode();
                        i2 = i + hashLong;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (m55131H(obj, m55119T, i3)) {
                        i = i2 * 53;
                        hashLong = m55114Y(obj, m55118U);
                        i2 = i + hashLong;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (m55131H(obj, m55119T, i3)) {
                        i = i2 * 53;
                        hashLong = m55114Y(obj, m55118U);
                        i2 = i + hashLong;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (m55131H(obj, m55119T, i3)) {
                        i = i2 * 53;
                        hashLong = m55114Y(obj, m55118U);
                        i2 = i + hashLong;
                        break;
                    } else {
                        break;
                    }
                case EACTags.ELEMENT_LIST /* 65 */:
                    if (m55131H(obj, m55119T, i3)) {
                        i = i2 * 53;
                        hashLong = Internal.hashLong(m55113Z(obj, m55118U));
                        i2 = i + hashLong;
                        break;
                    } else {
                        break;
                    }
                case EACTags.ADDRESS /* 66 */:
                    if (m55131H(obj, m55119T, i3)) {
                        i = i2 * 53;
                        hashLong = m55114Y(obj, m55118U);
                        i2 = i + hashLong;
                        break;
                    } else {
                        break;
                    }
                case EACTags.CARDHOLDER_HANDWRITTEN_SIGNATURE /* 67 */:
                    if (m55131H(obj, m55119T, i3)) {
                        i = i2 * 53;
                        hashLong = Internal.hashLong(m55113Z(obj, m55118U));
                        i2 = i + hashLong;
                        break;
                    } else {
                        break;
                    }
                case EACTags.APPLICATION_IMAGE /* 68 */:
                    if (m55131H(obj, m55119T, i3)) {
                        i = i2 * 53;
                        hashLong = AbstractC22978xY1.m493F(obj, m55118U).hashCode();
                        i2 = i + hashLong;
                        break;
                    } else {
                        break;
                    }
            }
        }
        int hashCode = (i2 * 53) + this.f34965o.mo54909g(obj).hashCode();
        if (this.f34956f) {
            return (hashCode * 53) + this.f34966p.mo55196c(obj).hashCode();
        }
        return hashCode;
    }

    /* JADX WARN: Code restructure failed: missing block: B:119:0x033d, code lost:
        if (r0 != r11) goto L202;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x033f, code lost:
        r15 = r28;
        r14 = r29;
        r12 = r30;
        r13 = r32;
        r11 = r33;
        r9 = r34;
        r1 = r17;
        r7 = r19;
        r2 = r20;
        r6 = r22;
        r3 = r25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x0359, code lost:
        r2 = r0;
        r8 = r25;
        r0 = r33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x038d, code lost:
        if (r0 != r15) goto L202;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x03b0, code lost:
        if (r0 != r15) goto L202;
     */
    /* renamed from: c0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int m55110c0(java.lang.Object r29, byte[] r30, int r31, int r32, int r33, androidx.datastore.preferences.protobuf.AbstractC4423b.C4425b r34) {
        /*
            Method dump skipped, instructions count: 1148
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.C4448q.m55110c0(java.lang.Object, byte[], int, int, int, androidx.datastore.preferences.protobuf.b$b):int");
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC4454v
    /* renamed from: d */
    public final boolean mo55019d(Object obj) {
        int i;
        int i2 = -1;
        int i3 = 0;
        for (int i4 = 0; i4 < this.f34961k; i4++) {
            int i5 = this.f34960j[i4];
            int m55119T = m55119T(i5);
            int m55084s0 = m55084s0(i5);
            if (!this.f34958h) {
                int i6 = this.f34951a[i5 + 2];
                int i7 = 1048575 & i6;
                i = 1 << (i6 >>> 20);
                if (i7 != i2) {
                    i3 = f34950s.getInt(obj, i7);
                    i2 = i7;
                }
            } else {
                i = 0;
            }
            if (m55130I(m55084s0) && !m55136C(obj, i5, i3, i)) {
                return false;
            }
            int m55086r0 = m55086r0(m55084s0);
            if (m55086r0 != 9 && m55086r0 != 17) {
                if (m55086r0 != 27) {
                    if (m55086r0 != 60 && m55086r0 != 68) {
                        if (m55086r0 != 49) {
                            if (m55086r0 == 50 && !m55133F(obj, m55084s0, i5)) {
                                return false;
                            }
                        }
                    } else if (m55131H(obj, m55119T, i5) && !m55135D(obj, m55084s0, m55081u(i5))) {
                        return false;
                    }
                }
                if (!m55134E(obj, m55084s0, i5)) {
                    return false;
                }
            } else if (m55136C(obj, i5, i3, i) && !m55135D(obj, m55084s0, m55081u(i5))) {
                return false;
            }
        }
        if (this.f34956f && !this.f34966p.mo55196c(obj).m55784t()) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x023a, code lost:
        if (r0 != r15) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01db, code lost:
        if (r0 != r15) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01ef, code lost:
        r2 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x021b, code lost:
        if (r0 != r15) goto L13;
     */
    /* renamed from: d0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int m55109d0(java.lang.Object r28, byte[] r29, int r30, int r31, androidx.datastore.preferences.protobuf.AbstractC4423b.C4425b r32) {
        /*
            Method dump skipped, instructions count: 638
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.C4448q.m55109d0(java.lang.Object, byte[], int, int, androidx.datastore.preferences.protobuf.b$b):int");
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC4454v
    /* renamed from: e */
    public void mo55018e(Object obj) {
        int i;
        int i2 = this.f34961k;
        while (true) {
            i = this.f34962l;
            if (i2 >= i) {
                break;
            }
            long m55118U = m55118U(m55084s0(this.f34960j[i2]));
            Object m493F = AbstractC22978xY1.m493F(obj, m55118U);
            if (m493F != null) {
                AbstractC22978xY1.m477V(obj, m55118U, this.f34967q.mo55150d(m493F));
            }
            i2++;
        }
        int length = this.f34960j.length;
        while (i < length) {
            this.f34964n.mo55166c(obj, this.f34960j[i]);
            i++;
        }
        this.f34965o.mo54906j(obj);
        if (this.f34956f) {
            this.f34966p.mo55193f(obj);
        }
    }

    /* renamed from: e0 */
    public final int m55108e0(Object obj, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, long j, int i7, long j2, AbstractC4423b.C4425b c4425b) {
        int m55327J;
        int i8;
        Unsafe unsafe = f34950s;
        Internal.ProtobufList protobufList = (Internal.ProtobufList) unsafe.getObject(obj, j2);
        if (!protobufList.isModifiable()) {
            int size = protobufList.size();
            if (size == 0) {
                i8 = 10;
            } else {
                i8 = size * 2;
            }
            protobufList = protobufList.mutableCopyWithCapacity(i8);
            unsafe.putObject(obj, j2, protobufList);
        }
        switch (i7) {
            case 18:
            case 35:
                if (i5 == 2) {
                    return AbstractC4423b.m55304s(bArr, i, protobufList, c4425b);
                }
                if (i5 == 1) {
                    return AbstractC4423b.m55318e(i3, bArr, i, i2, protobufList, c4425b);
                }
                break;
            case 19:
            case 36:
                if (i5 == 2) {
                    return AbstractC4423b.m55301v(bArr, i, protobufList, c4425b);
                }
                if (i5 == 5) {
                    return AbstractC4423b.m55310m(i3, bArr, i, i2, protobufList, c4425b);
                }
                break;
            case 20:
            case 21:
            case 37:
            case 38:
                if (i5 == 2) {
                    return AbstractC4423b.m55297z(bArr, i, protobufList, c4425b);
                }
                if (i5 == 0) {
                    return AbstractC4423b.m55324M(i3, bArr, i, i2, protobufList, c4425b);
                }
                break;
            case 22:
            case 29:
            case 39:
            case 43:
                if (i5 == 2) {
                    return AbstractC4423b.m55298y(bArr, i, protobufList, c4425b);
                }
                if (i5 == 0) {
                    return AbstractC4423b.m55327J(i3, bArr, i, i2, protobufList, c4425b);
                }
                break;
            case 23:
            case 32:
            case 40:
            case 46:
                if (i5 == 2) {
                    return AbstractC4423b.m55302u(bArr, i, protobufList, c4425b);
                }
                if (i5 == 1) {
                    return AbstractC4423b.m55312k(i3, bArr, i, i2, protobufList, c4425b);
                }
                break;
            case 24:
            case 31:
            case 41:
            case 45:
                if (i5 == 2) {
                    return AbstractC4423b.m55303t(bArr, i, protobufList, c4425b);
                }
                if (i5 == 5) {
                    return AbstractC4423b.m55314i(i3, bArr, i, i2, protobufList, c4425b);
                }
                break;
            case 25:
            case 42:
                if (i5 == 2) {
                    return AbstractC4423b.m55305r(bArr, i, protobufList, c4425b);
                }
                if (i5 == 0) {
                    return AbstractC4423b.m55322a(i3, bArr, i, i2, protobufList, c4425b);
                }
                break;
            case 26:
                if (i5 == 2) {
                    if ((j & 536870912) == 0) {
                        return AbstractC4423b.m55333D(i3, bArr, i, i2, protobufList, c4425b);
                    }
                    return AbstractC4423b.m55332E(i3, bArr, i, i2, protobufList, c4425b);
                }
                break;
            case 27:
                if (i5 == 2) {
                    return AbstractC4423b.m55306q(m55081u(i6), i3, bArr, i, i2, protobufList, c4425b);
                }
                break;
            case 28:
                if (i5 == 2) {
                    return AbstractC4423b.m55320c(i3, bArr, i, i2, protobufList, c4425b);
                }
                break;
            case 30:
            case 44:
                if (i5 == 2) {
                    m55327J = AbstractC4423b.m55298y(bArr, i, protobufList, c4425b);
                } else if (i5 == 0) {
                    m55327J = AbstractC4423b.m55327J(i3, bArr, i, i2, protobufList, c4425b);
                }
                GeneratedMessageLite generatedMessageLite = (GeneratedMessageLite) obj;
                UnknownFieldSetLite unknownFieldSetLite = generatedMessageLite.unknownFields;
                if (unknownFieldSetLite == UnknownFieldSetLite.getDefaultInstance()) {
                    unknownFieldSetLite = null;
                }
                UnknownFieldSetLite unknownFieldSetLite2 = (UnknownFieldSetLite) AbstractC4455w.m55013A(i4, protobufList, m55085s(i6), unknownFieldSetLite, this.f34965o);
                if (unknownFieldSetLite2 != null) {
                    generatedMessageLite.unknownFields = unknownFieldSetLite2;
                }
                return m55327J;
            case 33:
            case 47:
                if (i5 == 2) {
                    return AbstractC4423b.m55300w(bArr, i, protobufList, c4425b);
                }
                if (i5 == 0) {
                    return AbstractC4423b.m55336A(i3, bArr, i, i2, protobufList, c4425b);
                }
                break;
            case 34:
            case 48:
                if (i5 == 2) {
                    return AbstractC4423b.m55299x(bArr, i, protobufList, c4425b);
                }
                if (i5 == 0) {
                    return AbstractC4423b.m55335B(i3, bArr, i, i2, protobufList, c4425b);
                }
                break;
            case 49:
                if (i5 == 3) {
                    return AbstractC4423b.m55308o(m55081u(i6), i3, bArr, i, i2, protobufList, c4425b);
                }
                break;
        }
        return i;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC4454v
    /* renamed from: f */
    public int mo55017f(Object obj) {
        if (this.f34958h) {
            return m55075x(obj);
        }
        return m55077w(obj);
    }

    /* renamed from: f0 */
    public final int m55107f0(int i) {
        if (i >= this.f34953c && i <= this.f34954d) {
            return m55090p0(i, 0);
        }
        return -1;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC4454v
    /* renamed from: g */
    public void mo55016g(Object obj, Writer writer) {
        if (writer.mo55254A() == Writer.FieldOrder.DESCENDING) {
            m55078v0(obj, writer);
        } else if (this.f34958h) {
            m55080u0(obj, writer);
        } else {
            m55082t0(obj, writer);
        }
    }

    /* renamed from: g0 */
    public final int m55106g0(int i, int i2) {
        if (i >= this.f34953c && i <= this.f34954d) {
            return m55090p0(i, i2);
        }
        return -1;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC4454v
    /* renamed from: h */
    public void mo55015h(Object obj, InterfaceC4453u interfaceC4453u, ExtensionRegistryLite extensionRegistryLite) {
        extensionRegistryLite.getClass();
        m55127L(this.f34965o, this.f34966p, obj, interfaceC4453u, extensionRegistryLite);
    }

    /* renamed from: h0 */
    public final int m55105h0(int i) {
        return this.f34951a[i + 2];
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC4454v
    /* renamed from: i */
    public void mo55014i(Object obj, byte[] bArr, int i, int i2, AbstractC4423b.C4425b c4425b) {
        if (this.f34958h) {
            m55109d0(obj, bArr, i, i2, c4425b);
        } else {
            m55110c0(obj, bArr, i, i2, 0, c4425b);
        }
    }

    /* renamed from: i0 */
    public final void m55104i0(Object obj, long j, InterfaceC4453u interfaceC4453u, InterfaceC4454v interfaceC4454v, ExtensionRegistryLite extensionRegistryLite) {
        interfaceC4453u.mo55049L(this.f34964n.mo55164e(obj, j), interfaceC4454v, extensionRegistryLite);
    }

    /* renamed from: j */
    public final boolean m55103j(Object obj, Object obj2, int i) {
        if (m55137B(obj, i) == m55137B(obj2, i)) {
            return true;
        }
        return false;
    }

    /* renamed from: j0 */
    public final void m55102j0(Object obj, int i, InterfaceC4453u interfaceC4453u, InterfaceC4454v interfaceC4454v, ExtensionRegistryLite extensionRegistryLite) {
        interfaceC4453u.mo55052I(this.f34964n.mo55164e(obj, m55118U(i)), interfaceC4454v, extensionRegistryLite);
    }

    /* renamed from: k0 */
    public final void m55100k0(Object obj, int i, InterfaceC4453u interfaceC4453u) {
        if (m55138A(i)) {
            AbstractC22978xY1.m477V(obj, m55118U(i), interfaceC4453u.mo55056E());
        } else if (this.f34957g) {
            AbstractC22978xY1.m477V(obj, m55118U(i), interfaceC4453u.readString());
        } else {
            AbstractC22978xY1.m477V(obj, m55118U(i), interfaceC4453u.mo55042g());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10, types: [int] */
    /* renamed from: l */
    public final int m55099l(byte[] bArr, int i, int i2, MapEntryLite.C4386b c4386b, Map map, AbstractC4423b.C4425b c4425b) {
        int i3;
        int m55328I = AbstractC4423b.m55328I(bArr, i, c4425b);
        int i4 = c4425b.f34911a;
        if (i4 >= 0 && i4 <= i2 - m55328I) {
            int i5 = m55328I + i4;
            Object obj = c4386b.f34848b;
            Object obj2 = c4386b.f34850d;
            while (m55328I < i5) {
                int i6 = m55328I + 1;
                byte b = bArr[m55328I];
                if (b < 0) {
                    i3 = AbstractC4423b.m55329H(b, bArr, i6, c4425b);
                    b = c4425b.f34911a;
                } else {
                    i3 = i6;
                }
                int i7 = b >>> 3;
                int i8 = b & 7;
                if (i7 != 1) {
                    if (i7 == 2 && i8 == c4386b.f34849c.getWireType()) {
                        m55328I = m55097m(bArr, i3, i2, c4386b.f34849c, c4386b.f34850d.getClass(), c4425b);
                        obj2 = c4425b.f34913c;
                    }
                    m55328I = AbstractC4423b.m55323N(b, bArr, i3, i2, c4425b);
                } else if (i8 == c4386b.f34847a.getWireType()) {
                    m55328I = m55097m(bArr, i3, i2, c4386b.f34847a, null, c4425b);
                    obj = c4425b.f34913c;
                } else {
                    m55328I = AbstractC4423b.m55323N(b, bArr, i3, i2, c4425b);
                }
            }
            if (m55328I == i5) {
                map.put(obj, obj2);
                return i5;
            }
            throw InvalidProtocolBufferException.parseFailure();
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    /* renamed from: l0 */
    public final void m55098l0(Object obj, int i, InterfaceC4453u interfaceC4453u) {
        if (m55138A(i)) {
            interfaceC4453u.mo55024y(this.f34964n.mo55164e(obj, m55118U(i)));
        } else {
            interfaceC4453u.mo55035n(this.f34964n.mo55164e(obj, m55118U(i)));
        }
    }

    /* renamed from: m */
    public final int m55097m(byte[] bArr, int i, int i2, WireFormat.FieldType fieldType, Class cls, AbstractC4423b.C4425b c4425b) {
        boolean z;
        switch (C4449a.f34968a[fieldType.ordinal()]) {
            case 1:
                int m55325L = AbstractC4423b.m55325L(bArr, i, c4425b);
                if (c4425b.f34912b != 0) {
                    z = true;
                } else {
                    z = false;
                }
                c4425b.f34913c = Boolean.valueOf(z);
                return m55325L;
            case 2:
                return AbstractC4423b.m55321b(bArr, i, c4425b);
            case 3:
                c4425b.f34913c = Double.valueOf(AbstractC4423b.m55319d(bArr, i));
                return i + 8;
            case 4:
            case 5:
                c4425b.f34913c = Integer.valueOf(AbstractC4423b.m55315h(bArr, i));
                return i + 4;
            case 6:
            case 7:
                c4425b.f34913c = Long.valueOf(AbstractC4423b.m55313j(bArr, i));
                return i + 8;
            case 8:
                c4425b.f34913c = Float.valueOf(AbstractC4423b.m55311l(bArr, i));
                return i + 4;
            case 9:
            case 10:
            case 11:
                int m55328I = AbstractC4423b.m55328I(bArr, i, c4425b);
                c4425b.f34913c = Integer.valueOf(c4425b.f34911a);
                return m55328I;
            case 12:
            case 13:
                int m55325L2 = AbstractC4423b.m55325L(bArr, i, c4425b);
                c4425b.f34913c = Long.valueOf(c4425b.f34912b);
                return m55325L2;
            case 14:
                return AbstractC4423b.m55307p(C17942Ko1.m67586a().m67583d(cls), bArr, i, i2, c4425b);
            case 15:
                int m55328I2 = AbstractC4423b.m55328I(bArr, i, c4425b);
                c4425b.f34913c = Integer.valueOf(CodedInputStream.decodeZigZag32(c4425b.f34911a));
                return m55328I2;
            case 16:
                int m55325L3 = AbstractC4423b.m55325L(bArr, i, c4425b);
                c4425b.f34913c = Long.valueOf(CodedInputStream.decodeZigZag64(c4425b.f34912b));
                return m55325L3;
            case 17:
                return AbstractC4423b.m55331F(bArr, i, c4425b);
            default:
                throw new RuntimeException("unsupported field type.");
        }
    }

    /* renamed from: n0 */
    public final void m55094n0(Object obj, int i) {
        if (this.f34958h) {
            return;
        }
        int m55105h0 = m55105h0(i);
        long j = m55105h0 & 1048575;
        AbstractC22978xY1.m479T(obj, j, AbstractC22978xY1.m497B(obj, j) | (1 << (m55105h0 >>> 20)));
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC4454v
    public Object newInstance() {
        return this.f34963m.mo31158a(this.f34955e);
    }

    /* renamed from: o */
    public final boolean m55093o(Object obj, Object obj2, int i) {
        int m55084s0 = m55084s0(i);
        long m55118U = m55118U(m55084s0);
        switch (m55086r0(m55084s0)) {
            case 0:
                if (!m55103j(obj, obj2, i) || Double.doubleToLongBits(AbstractC22978xY1.m449z(obj, m55118U)) != Double.doubleToLongBits(AbstractC22978xY1.m449z(obj2, m55118U))) {
                    return false;
                }
                return true;
            case 1:
                if (!m55103j(obj, obj2, i) || Float.floatToIntBits(AbstractC22978xY1.m498A(obj, m55118U)) != Float.floatToIntBits(AbstractC22978xY1.m498A(obj2, m55118U))) {
                    return false;
                }
                return true;
            case 2:
                if (!m55103j(obj, obj2, i) || AbstractC22978xY1.m495D(obj, m55118U) != AbstractC22978xY1.m495D(obj2, m55118U)) {
                    return false;
                }
                return true;
            case 3:
                if (!m55103j(obj, obj2, i) || AbstractC22978xY1.m495D(obj, m55118U) != AbstractC22978xY1.m495D(obj2, m55118U)) {
                    return false;
                }
                return true;
            case 4:
                if (!m55103j(obj, obj2, i) || AbstractC22978xY1.m497B(obj, m55118U) != AbstractC22978xY1.m497B(obj2, m55118U)) {
                    return false;
                }
                return true;
            case 5:
                if (!m55103j(obj, obj2, i) || AbstractC22978xY1.m495D(obj, m55118U) != AbstractC22978xY1.m495D(obj2, m55118U)) {
                    return false;
                }
                return true;
            case 6:
                if (!m55103j(obj, obj2, i) || AbstractC22978xY1.m497B(obj, m55118U) != AbstractC22978xY1.m497B(obj2, m55118U)) {
                    return false;
                }
                return true;
            case 7:
                if (!m55103j(obj, obj2, i) || AbstractC22978xY1.m456s(obj, m55118U) != AbstractC22978xY1.m456s(obj2, m55118U)) {
                    return false;
                }
                return true;
            case 8:
                if (!m55103j(obj, obj2, i) || !AbstractC4455w.m55003K(AbstractC22978xY1.m493F(obj, m55118U), AbstractC22978xY1.m493F(obj2, m55118U))) {
                    return false;
                }
                return true;
            case 9:
                if (!m55103j(obj, obj2, i) || !AbstractC4455w.m55003K(AbstractC22978xY1.m493F(obj, m55118U), AbstractC22978xY1.m493F(obj2, m55118U))) {
                    return false;
                }
                return true;
            case 10:
                if (!m55103j(obj, obj2, i) || !AbstractC4455w.m55003K(AbstractC22978xY1.m493F(obj, m55118U), AbstractC22978xY1.m493F(obj2, m55118U))) {
                    return false;
                }
                return true;
            case 11:
                if (!m55103j(obj, obj2, i) || AbstractC22978xY1.m497B(obj, m55118U) != AbstractC22978xY1.m497B(obj2, m55118U)) {
                    return false;
                }
                return true;
            case 12:
                if (!m55103j(obj, obj2, i) || AbstractC22978xY1.m497B(obj, m55118U) != AbstractC22978xY1.m497B(obj2, m55118U)) {
                    return false;
                }
                return true;
            case 13:
                if (!m55103j(obj, obj2, i) || AbstractC22978xY1.m497B(obj, m55118U) != AbstractC22978xY1.m497B(obj2, m55118U)) {
                    return false;
                }
                return true;
            case 14:
                if (!m55103j(obj, obj2, i) || AbstractC22978xY1.m495D(obj, m55118U) != AbstractC22978xY1.m495D(obj2, m55118U)) {
                    return false;
                }
                return true;
            case 15:
                if (!m55103j(obj, obj2, i) || AbstractC22978xY1.m497B(obj, m55118U) != AbstractC22978xY1.m497B(obj2, m55118U)) {
                    return false;
                }
                return true;
            case 16:
                if (!m55103j(obj, obj2, i) || AbstractC22978xY1.m495D(obj, m55118U) != AbstractC22978xY1.m495D(obj2, m55118U)) {
                    return false;
                }
                return true;
            case 17:
                if (!m55103j(obj, obj2, i) || !AbstractC4455w.m55003K(AbstractC22978xY1.m493F(obj, m55118U), AbstractC22978xY1.m493F(obj2, m55118U))) {
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
                return AbstractC4455w.m55003K(AbstractC22978xY1.m493F(obj, m55118U), AbstractC22978xY1.m493F(obj2, m55118U));
            case 50:
                return AbstractC4455w.m55003K(AbstractC22978xY1.m493F(obj, m55118U), AbstractC22978xY1.m493F(obj2, m55118U));
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
                if (!m55132G(obj, obj2, i) || !AbstractC4455w.m55003K(AbstractC22978xY1.m493F(obj, m55118U), AbstractC22978xY1.m493F(obj2, m55118U))) {
                    return false;
                }
                return true;
            default:
                return true;
        }
    }

    /* renamed from: o0 */
    public final void m55092o0(Object obj, int i, int i2) {
        AbstractC22978xY1.m479T(obj, m55105h0(i2) & 1048575, i);
    }

    /* renamed from: p */
    public final Object m55091p(Object obj, int i, Object obj2, AbstractC4466y abstractC4466y) {
        int m55119T = m55119T(i);
        Object m493F = AbstractC22978xY1.m493F(obj, m55118U(m55084s0(i)));
        if (m493F == null) {
            return obj2;
        }
        Internal.EnumVerifier m55085s = m55085s(i);
        if (m55085s == null) {
            return obj2;
        }
        return m55089q(i, m55119T, this.f34967q.mo55148f(m493F), m55085s, obj2, abstractC4466y);
    }

    /* renamed from: p0 */
    public final int m55090p0(int i, int i2) {
        int length = (this.f34951a.length / 3) - 1;
        while (i2 <= length) {
            int i3 = (length + i2) >>> 1;
            int i4 = i3 * 3;
            int m55119T = m55119T(i4);
            if (i == m55119T) {
                return i4;
            }
            if (i < m55119T) {
                length = i3 - 1;
            } else {
                i2 = i3 + 1;
            }
        }
        return -1;
    }

    /* renamed from: q */
    public final Object m55089q(int i, int i2, Map map, Internal.EnumVerifier enumVerifier, Object obj, AbstractC4466y abstractC4466y) {
        MapEntryLite.C4386b mo55151c = this.f34967q.mo55151c(m55083t(i));
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (!enumVerifier.isInRange(((Integer) entry.getValue()).intValue())) {
                if (obj == null) {
                    obj = abstractC4466y.mo54904n();
                }
                ByteString.C4340f newCodedBuilder = ByteString.newCodedBuilder(MapEntryLite.m55676a(mo55151c, entry.getKey(), entry.getValue()));
                try {
                    MapEntryLite.m55672e(newCodedBuilder.m56099b(), mo55151c, entry.getKey(), entry.getValue());
                    abstractC4466y.mo54912d(obj, i2, newCodedBuilder.m56100a());
                    it.remove();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        return obj;
    }

    /* renamed from: s */
    public final Internal.EnumVerifier m55085s(int i) {
        return (Internal.EnumVerifier) this.f34952b[((i / 3) * 2) + 1];
    }

    /* renamed from: s0 */
    public final int m55084s0(int i) {
        return this.f34951a[i + 1];
    }

    /* renamed from: t */
    public final Object m55083t(int i) {
        return this.f34952b[(i / 3) * 2];
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x049e  */
    /* renamed from: t0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m55082t0(java.lang.Object r18, androidx.datastore.preferences.protobuf.Writer r19) {
        /*
            Method dump skipped, instructions count: 1352
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.C4448q.m55082t0(java.lang.Object, androidx.datastore.preferences.protobuf.Writer):void");
    }

    /* renamed from: u */
    public final InterfaceC4454v m55081u(int i) {
        int i2 = (i / 3) * 2;
        InterfaceC4454v interfaceC4454v = (InterfaceC4454v) this.f34952b[i2];
        if (interfaceC4454v != null) {
            return interfaceC4454v;
        }
        InterfaceC4454v m67583d = C17942Ko1.m67586a().m67583d((Class) this.f34952b[i2 + 1]);
        this.f34952b[i2] = m67583d;
        return m67583d;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0588  */
    /* renamed from: u0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m55080u0(java.lang.Object r13, androidx.datastore.preferences.protobuf.Writer r14) {
        /*
            Method dump skipped, instructions count: 1584
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.C4448q.m55080u0(java.lang.Object, androidx.datastore.preferences.protobuf.Writer):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x058e  */
    /* renamed from: v0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m55078v0(java.lang.Object r11, androidx.datastore.preferences.protobuf.Writer r12) {
        /*
            Method dump skipped, instructions count: 1586
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.C4448q.m55078v0(java.lang.Object, androidx.datastore.preferences.protobuf.Writer):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: w */
    public final int m55077w(Object obj) {
        int i;
        int i2;
        int computeDoubleSize;
        int computeBoolSize;
        int computeSFixed32Size;
        int m54974i;
        int computeTagSize;
        int computeUInt32SizeNoTag;
        Unsafe unsafe = f34950s;
        int i3 = -1;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        while (i4 < this.f34951a.length) {
            int m55084s0 = m55084s0(i4);
            int m55119T = m55119T(i4);
            int m55086r0 = m55086r0(m55084s0);
            if (m55086r0 <= 17) {
                i = this.f34951a[i4 + 2];
                int i7 = 1048575 & i;
                int i8 = 1 << (i >>> 20);
                if (i7 != i3) {
                    i6 = unsafe.getInt(obj, i7);
                    i3 = i7;
                }
                i2 = i8;
            } else {
                if (this.f34959i && m55086r0 >= FieldType.DOUBLE_LIST_PACKED.m55777id() && m55086r0 <= FieldType.SINT64_LIST_PACKED.m55777id()) {
                    i = this.f34951a[i4 + 2] & 1048575;
                } else {
                    i = 0;
                }
                i2 = 0;
            }
            long m55118U = m55118U(m55084s0);
            int i9 = i3;
            switch (m55086r0) {
                case 0:
                    if ((i6 & i2) == 0) {
                        break;
                    } else {
                        computeDoubleSize = CodedOutputStream.computeDoubleSize(m55119T, 0.0d);
                        i5 += computeDoubleSize;
                        break;
                    }
                case 1:
                    if ((i6 & i2) == 0) {
                        break;
                    } else {
                        computeDoubleSize = CodedOutputStream.computeFloatSize(m55119T, 0.0f);
                        i5 += computeDoubleSize;
                        break;
                    }
                case 2:
                    if ((i6 & i2) == 0) {
                        break;
                    } else {
                        computeDoubleSize = CodedOutputStream.computeInt64Size(m55119T, unsafe.getLong(obj, m55118U));
                        i5 += computeDoubleSize;
                        break;
                    }
                case 3:
                    if ((i6 & i2) == 0) {
                        break;
                    } else {
                        computeDoubleSize = CodedOutputStream.computeUInt64Size(m55119T, unsafe.getLong(obj, m55118U));
                        i5 += computeDoubleSize;
                        break;
                    }
                case 4:
                    if ((i6 & i2) == 0) {
                        break;
                    } else {
                        computeDoubleSize = CodedOutputStream.computeInt32Size(m55119T, unsafe.getInt(obj, m55118U));
                        i5 += computeDoubleSize;
                        break;
                    }
                case 5:
                    if ((i6 & i2) == 0) {
                        break;
                    } else {
                        computeDoubleSize = CodedOutputStream.computeFixed64Size(m55119T, 0L);
                        i5 += computeDoubleSize;
                        break;
                    }
                case 6:
                    if ((i6 & i2) != 0) {
                        computeDoubleSize = CodedOutputStream.computeFixed32Size(m55119T, 0);
                        i5 += computeDoubleSize;
                        break;
                    }
                    break;
                case 7:
                    if ((i6 & i2) != 0) {
                        computeBoolSize = CodedOutputStream.computeBoolSize(m55119T, true);
                        i5 += computeBoolSize;
                    }
                    break;
                case 8:
                    if ((i6 & i2) != 0) {
                        Object object = unsafe.getObject(obj, m55118U);
                        if (object instanceof ByteString) {
                            computeBoolSize = CodedOutputStream.computeBytesSize(m55119T, (ByteString) object);
                        } else {
                            computeBoolSize = CodedOutputStream.computeStringSize(m55119T, (String) object);
                        }
                        i5 += computeBoolSize;
                    }
                    break;
                case 9:
                    if ((i6 & i2) != 0) {
                        computeBoolSize = AbstractC4455w.m54968o(m55119T, unsafe.getObject(obj, m55118U), m55081u(i4));
                        i5 += computeBoolSize;
                    }
                    break;
                case 10:
                    if ((i6 & i2) != 0) {
                        computeBoolSize = CodedOutputStream.computeBytesSize(m55119T, (ByteString) unsafe.getObject(obj, m55118U));
                        i5 += computeBoolSize;
                    }
                    break;
                case 11:
                    if ((i6 & i2) != 0) {
                        computeBoolSize = CodedOutputStream.computeUInt32Size(m55119T, unsafe.getInt(obj, m55118U));
                        i5 += computeBoolSize;
                    }
                    break;
                case 12:
                    if ((i6 & i2) != 0) {
                        computeBoolSize = CodedOutputStream.computeEnumSize(m55119T, unsafe.getInt(obj, m55118U));
                        i5 += computeBoolSize;
                    }
                    break;
                case 13:
                    if ((i6 & i2) != 0) {
                        computeSFixed32Size = CodedOutputStream.computeSFixed32Size(m55119T, 0);
                        i5 += computeSFixed32Size;
                    }
                    break;
                case 14:
                    if ((i6 & i2) != 0) {
                        computeBoolSize = CodedOutputStream.computeSFixed64Size(m55119T, 0L);
                        i5 += computeBoolSize;
                    }
                    break;
                case 15:
                    if ((i6 & i2) != 0) {
                        computeBoolSize = CodedOutputStream.computeSInt32Size(m55119T, unsafe.getInt(obj, m55118U));
                        i5 += computeBoolSize;
                    }
                    break;
                case 16:
                    if ((i6 & i2) != 0) {
                        computeBoolSize = CodedOutputStream.computeSInt64Size(m55119T, unsafe.getLong(obj, m55118U));
                        i5 += computeBoolSize;
                    }
                    break;
                case 17:
                    if ((i6 & i2) != 0) {
                        computeBoolSize = CodedOutputStream.m56052b(m55119T, (MessageLite) unsafe.getObject(obj, m55118U), m55081u(i4));
                        i5 += computeBoolSize;
                    }
                    break;
                case 18:
                    computeBoolSize = AbstractC4455w.m54975h(m55119T, (List) unsafe.getObject(obj, m55118U), false);
                    i5 += computeBoolSize;
                    break;
                case 19:
                    computeBoolSize = AbstractC4455w.m54977f(m55119T, (List) unsafe.getObject(obj, m55118U), false);
                    i5 += computeBoolSize;
                    break;
                case 20:
                    computeBoolSize = AbstractC4455w.m54970m(m55119T, (List) unsafe.getObject(obj, m55118U), false);
                    i5 += computeBoolSize;
                    break;
                case 21:
                    computeBoolSize = AbstractC4455w.m54959x(m55119T, (List) unsafe.getObject(obj, m55118U), false);
                    i5 += computeBoolSize;
                    break;
                case 22:
                    computeBoolSize = AbstractC4455w.m54972k(m55119T, (List) unsafe.getObject(obj, m55118U), false);
                    i5 += computeBoolSize;
                    break;
                case 23:
                    computeBoolSize = AbstractC4455w.m54975h(m55119T, (List) unsafe.getObject(obj, m55118U), false);
                    i5 += computeBoolSize;
                    break;
                case 24:
                    computeBoolSize = AbstractC4455w.m54977f(m55119T, (List) unsafe.getObject(obj, m55118U), false);
                    i5 += computeBoolSize;
                    break;
                case 25:
                    computeBoolSize = AbstractC4455w.m54987a(m55119T, (List) unsafe.getObject(obj, m55118U), false);
                    i5 += computeBoolSize;
                    break;
                case 26:
                    computeBoolSize = AbstractC4455w.m54962u(m55119T, (List) unsafe.getObject(obj, m55118U));
                    i5 += computeBoolSize;
                    break;
                case 27:
                    computeBoolSize = AbstractC4455w.m54967p(m55119T, (List) unsafe.getObject(obj, m55118U), m55081u(i4));
                    i5 += computeBoolSize;
                    break;
                case 28:
                    computeBoolSize = AbstractC4455w.m54983c(m55119T, (List) unsafe.getObject(obj, m55118U));
                    i5 += computeBoolSize;
                    break;
                case 29:
                    computeBoolSize = AbstractC4455w.m54961v(m55119T, (List) unsafe.getObject(obj, m55118U), false);
                    i5 += computeBoolSize;
                    break;
                case 30:
                    computeBoolSize = AbstractC4455w.m54981d(m55119T, (List) unsafe.getObject(obj, m55118U), false);
                    i5 += computeBoolSize;
                    break;
                case 31:
                    computeBoolSize = AbstractC4455w.m54977f(m55119T, (List) unsafe.getObject(obj, m55118U), false);
                    i5 += computeBoolSize;
                    break;
                case 32:
                    computeBoolSize = AbstractC4455w.m54975h(m55119T, (List) unsafe.getObject(obj, m55118U), false);
                    i5 += computeBoolSize;
                    break;
                case 33:
                    computeBoolSize = AbstractC4455w.m54966q(m55119T, (List) unsafe.getObject(obj, m55118U), false);
                    i5 += computeBoolSize;
                    break;
                case 34:
                    computeBoolSize = AbstractC4455w.m54964s(m55119T, (List) unsafe.getObject(obj, m55118U), false);
                    i5 += computeBoolSize;
                    break;
                case 35:
                    m54974i = AbstractC4455w.m54974i((List) unsafe.getObject(obj, m55118U));
                    if (m54974i > 0) {
                        if (this.f34959i) {
                            unsafe.putInt(obj, i, m54974i);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(m55119T);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(m54974i);
                        computeSFixed32Size = computeTagSize + computeUInt32SizeNoTag + m54974i;
                        i5 += computeSFixed32Size;
                    }
                    break;
                case 36:
                    m54974i = AbstractC4455w.m54976g((List) unsafe.getObject(obj, m55118U));
                    if (m54974i > 0) {
                        if (this.f34959i) {
                            unsafe.putInt(obj, i, m54974i);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(m55119T);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(m54974i);
                        computeSFixed32Size = computeTagSize + computeUInt32SizeNoTag + m54974i;
                        i5 += computeSFixed32Size;
                    }
                    break;
                case 37:
                    m54974i = AbstractC4455w.m54969n((List) unsafe.getObject(obj, m55118U));
                    if (m54974i > 0) {
                        if (this.f34959i) {
                            unsafe.putInt(obj, i, m54974i);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(m55119T);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(m54974i);
                        computeSFixed32Size = computeTagSize + computeUInt32SizeNoTag + m54974i;
                        i5 += computeSFixed32Size;
                    }
                    break;
                case 38:
                    m54974i = AbstractC4455w.m54958y((List) unsafe.getObject(obj, m55118U));
                    if (m54974i > 0) {
                        if (this.f34959i) {
                            unsafe.putInt(obj, i, m54974i);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(m55119T);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(m54974i);
                        computeSFixed32Size = computeTagSize + computeUInt32SizeNoTag + m54974i;
                        i5 += computeSFixed32Size;
                    }
                    break;
                case 39:
                    m54974i = AbstractC4455w.m54971l((List) unsafe.getObject(obj, m55118U));
                    if (m54974i > 0) {
                        if (this.f34959i) {
                            unsafe.putInt(obj, i, m54974i);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(m55119T);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(m54974i);
                        computeSFixed32Size = computeTagSize + computeUInt32SizeNoTag + m54974i;
                        i5 += computeSFixed32Size;
                    }
                    break;
                case 40:
                    m54974i = AbstractC4455w.m54974i((List) unsafe.getObject(obj, m55118U));
                    if (m54974i > 0) {
                        if (this.f34959i) {
                            unsafe.putInt(obj, i, m54974i);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(m55119T);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(m54974i);
                        computeSFixed32Size = computeTagSize + computeUInt32SizeNoTag + m54974i;
                        i5 += computeSFixed32Size;
                    }
                    break;
                case 41:
                    m54974i = AbstractC4455w.m54976g((List) unsafe.getObject(obj, m55118U));
                    if (m54974i > 0) {
                        if (this.f34959i) {
                            unsafe.putInt(obj, i, m54974i);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(m55119T);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(m54974i);
                        computeSFixed32Size = computeTagSize + computeUInt32SizeNoTag + m54974i;
                        i5 += computeSFixed32Size;
                    }
                    break;
                case 42:
                    m54974i = AbstractC4455w.m54985b((List) unsafe.getObject(obj, m55118U));
                    if (m54974i > 0) {
                        if (this.f34959i) {
                            unsafe.putInt(obj, i, m54974i);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(m55119T);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(m54974i);
                        computeSFixed32Size = computeTagSize + computeUInt32SizeNoTag + m54974i;
                        i5 += computeSFixed32Size;
                    }
                    break;
                case 43:
                    m54974i = AbstractC4455w.m54960w((List) unsafe.getObject(obj, m55118U));
                    if (m54974i > 0) {
                        if (this.f34959i) {
                            unsafe.putInt(obj, i, m54974i);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(m55119T);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(m54974i);
                        computeSFixed32Size = computeTagSize + computeUInt32SizeNoTag + m54974i;
                        i5 += computeSFixed32Size;
                    }
                    break;
                case 44:
                    m54974i = AbstractC4455w.m54979e((List) unsafe.getObject(obj, m55118U));
                    if (m54974i > 0) {
                        if (this.f34959i) {
                            unsafe.putInt(obj, i, m54974i);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(m55119T);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(m54974i);
                        computeSFixed32Size = computeTagSize + computeUInt32SizeNoTag + m54974i;
                        i5 += computeSFixed32Size;
                    }
                    break;
                case 45:
                    m54974i = AbstractC4455w.m54976g((List) unsafe.getObject(obj, m55118U));
                    if (m54974i > 0) {
                        if (this.f34959i) {
                            unsafe.putInt(obj, i, m54974i);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(m55119T);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(m54974i);
                        computeSFixed32Size = computeTagSize + computeUInt32SizeNoTag + m54974i;
                        i5 += computeSFixed32Size;
                    }
                    break;
                case 46:
                    m54974i = AbstractC4455w.m54974i((List) unsafe.getObject(obj, m55118U));
                    if (m54974i > 0) {
                        if (this.f34959i) {
                            unsafe.putInt(obj, i, m54974i);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(m55119T);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(m54974i);
                        computeSFixed32Size = computeTagSize + computeUInt32SizeNoTag + m54974i;
                        i5 += computeSFixed32Size;
                    }
                    break;
                case 47:
                    m54974i = AbstractC4455w.m54965r((List) unsafe.getObject(obj, m55118U));
                    if (m54974i > 0) {
                        if (this.f34959i) {
                            unsafe.putInt(obj, i, m54974i);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(m55119T);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(m54974i);
                        computeSFixed32Size = computeTagSize + computeUInt32SizeNoTag + m54974i;
                        i5 += computeSFixed32Size;
                    }
                    break;
                case 48:
                    m54974i = AbstractC4455w.m54963t((List) unsafe.getObject(obj, m55118U));
                    if (m54974i > 0) {
                        if (this.f34959i) {
                            unsafe.putInt(obj, i, m54974i);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(m55119T);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(m54974i);
                        computeSFixed32Size = computeTagSize + computeUInt32SizeNoTag + m54974i;
                        i5 += computeSFixed32Size;
                    }
                    break;
                case 49:
                    computeBoolSize = AbstractC4455w.m54973j(m55119T, (List) unsafe.getObject(obj, m55118U), m55081u(i4));
                    i5 += computeBoolSize;
                    break;
                case 50:
                    computeBoolSize = this.f34967q.mo55149e(m55119T, unsafe.getObject(obj, m55118U), m55083t(i4));
                    i5 += computeBoolSize;
                    break;
                case EACTags.TRANSACTION_DATE /* 51 */:
                    if (m55131H(obj, m55119T, i4)) {
                        computeBoolSize = CodedOutputStream.computeDoubleSize(m55119T, 0.0d);
                        i5 += computeBoolSize;
                    }
                    break;
                case EACTags.CARD_SEQUENCE_NUMBER /* 52 */:
                    if (m55131H(obj, m55119T, i4)) {
                        computeBoolSize = CodedOutputStream.computeFloatSize(m55119T, 0.0f);
                        i5 += computeBoolSize;
                    }
                    break;
                case EACTags.SEX /* 53 */:
                    if (m55131H(obj, m55119T, i4)) {
                        computeBoolSize = CodedOutputStream.computeInt64Size(m55119T, m55113Z(obj, m55118U));
                        i5 += computeBoolSize;
                    }
                    break;
                case 54:
                    if (m55131H(obj, m55119T, i4)) {
                        computeBoolSize = CodedOutputStream.computeUInt64Size(m55119T, m55113Z(obj, m55118U));
                        i5 += computeBoolSize;
                    }
                    break;
                case 55:
                    if (m55131H(obj, m55119T, i4)) {
                        computeBoolSize = CodedOutputStream.computeInt32Size(m55119T, m55114Y(obj, m55118U));
                        i5 += computeBoolSize;
                    }
                    break;
                case 56:
                    if (m55131H(obj, m55119T, i4)) {
                        computeBoolSize = CodedOutputStream.computeFixed64Size(m55119T, 0L);
                        i5 += computeBoolSize;
                    }
                    break;
                case 57:
                    if (m55131H(obj, m55119T, i4)) {
                        computeSFixed32Size = CodedOutputStream.computeFixed32Size(m55119T, 0);
                        i5 += computeSFixed32Size;
                    }
                    break;
                case EACTags.DYNAMIC_INTERNAL_AUTHENTIFICATION /* 58 */:
                    if (m55131H(obj, m55119T, i4)) {
                        computeBoolSize = CodedOutputStream.computeBoolSize(m55119T, true);
                        i5 += computeBoolSize;
                    }
                    break;
                case EACTags.DYNAMIC_EXTERNAL_AUTHENTIFICATION /* 59 */:
                    if (m55131H(obj, m55119T, i4)) {
                        Object object2 = unsafe.getObject(obj, m55118U);
                        if (object2 instanceof ByteString) {
                            computeBoolSize = CodedOutputStream.computeBytesSize(m55119T, (ByteString) object2);
                        } else {
                            computeBoolSize = CodedOutputStream.computeStringSize(m55119T, (String) object2);
                        }
                        i5 += computeBoolSize;
                    }
                    break;
                case 60:
                    if (m55131H(obj, m55119T, i4)) {
                        computeBoolSize = AbstractC4455w.m54968o(m55119T, unsafe.getObject(obj, m55118U), m55081u(i4));
                        i5 += computeBoolSize;
                    }
                    break;
                case 61:
                    if (m55131H(obj, m55119T, i4)) {
                        computeBoolSize = CodedOutputStream.computeBytesSize(m55119T, (ByteString) unsafe.getObject(obj, m55118U));
                        i5 += computeBoolSize;
                    }
                    break;
                case 62:
                    if (m55131H(obj, m55119T, i4)) {
                        computeBoolSize = CodedOutputStream.computeUInt32Size(m55119T, m55114Y(obj, m55118U));
                        i5 += computeBoolSize;
                    }
                    break;
                case 63:
                    if (m55131H(obj, m55119T, i4)) {
                        computeBoolSize = CodedOutputStream.computeEnumSize(m55119T, m55114Y(obj, m55118U));
                        i5 += computeBoolSize;
                    }
                    break;
                case 64:
                    if (m55131H(obj, m55119T, i4)) {
                        computeSFixed32Size = CodedOutputStream.computeSFixed32Size(m55119T, 0);
                        i5 += computeSFixed32Size;
                    }
                    break;
                case EACTags.ELEMENT_LIST /* 65 */:
                    if (m55131H(obj, m55119T, i4)) {
                        computeBoolSize = CodedOutputStream.computeSFixed64Size(m55119T, 0L);
                        i5 += computeBoolSize;
                    }
                    break;
                case EACTags.ADDRESS /* 66 */:
                    if (m55131H(obj, m55119T, i4)) {
                        computeBoolSize = CodedOutputStream.computeSInt32Size(m55119T, m55114Y(obj, m55118U));
                        i5 += computeBoolSize;
                    }
                    break;
                case EACTags.CARDHOLDER_HANDWRITTEN_SIGNATURE /* 67 */:
                    if (m55131H(obj, m55119T, i4)) {
                        computeBoolSize = CodedOutputStream.computeSInt64Size(m55119T, m55113Z(obj, m55118U));
                        i5 += computeBoolSize;
                    }
                    break;
                case EACTags.APPLICATION_IMAGE /* 68 */:
                    if (m55131H(obj, m55119T, i4)) {
                        computeBoolSize = CodedOutputStream.m56052b(m55119T, (MessageLite) unsafe.getObject(obj, m55118U), m55081u(i4));
                        i5 += computeBoolSize;
                    }
                    break;
            }
            i4 += 3;
            i3 = i9;
        }
        int m55073y = i5 + m55073y(this.f34965o, obj);
        if (this.f34956f) {
            return m55073y + this.f34966p.mo55196c(obj).m55789o();
        }
        return m55073y;
    }

    /* renamed from: w0 */
    public final void m55076w0(Writer writer, int i, Object obj, int i2) {
        if (obj != null) {
            writer.mo55244K(i, this.f34967q.mo55151c(m55083t(i2)), this.f34967q.mo55146h(obj));
        }
    }

    /* renamed from: x */
    public final int m55075x(Object obj) {
        int i;
        int computeDoubleSize;
        int m54974i;
        int computeTagSize;
        int computeUInt32SizeNoTag;
        Unsafe unsafe = f34950s;
        int i2 = 0;
        for (int i3 = 0; i3 < this.f34951a.length; i3 += 3) {
            int m55084s0 = m55084s0(i3);
            int m55086r0 = m55086r0(m55084s0);
            int m55119T = m55119T(i3);
            long m55118U = m55118U(m55084s0);
            if (m55086r0 >= FieldType.DOUBLE_LIST_PACKED.m55777id() && m55086r0 <= FieldType.SINT64_LIST_PACKED.m55777id()) {
                i = this.f34951a[i3 + 2] & 1048575;
            } else {
                i = 0;
            }
            switch (m55086r0) {
                case 0:
                    if (m55137B(obj, i3)) {
                        computeDoubleSize = CodedOutputStream.computeDoubleSize(m55119T, 0.0d);
                        break;
                    } else {
                        continue;
                    }
                case 1:
                    if (m55137B(obj, i3)) {
                        computeDoubleSize = CodedOutputStream.computeFloatSize(m55119T, 0.0f);
                        break;
                    } else {
                        continue;
                    }
                case 2:
                    if (m55137B(obj, i3)) {
                        computeDoubleSize = CodedOutputStream.computeInt64Size(m55119T, AbstractC22978xY1.m495D(obj, m55118U));
                        break;
                    } else {
                        continue;
                    }
                case 3:
                    if (m55137B(obj, i3)) {
                        computeDoubleSize = CodedOutputStream.computeUInt64Size(m55119T, AbstractC22978xY1.m495D(obj, m55118U));
                        break;
                    } else {
                        continue;
                    }
                case 4:
                    if (m55137B(obj, i3)) {
                        computeDoubleSize = CodedOutputStream.computeInt32Size(m55119T, AbstractC22978xY1.m497B(obj, m55118U));
                        break;
                    } else {
                        continue;
                    }
                case 5:
                    if (m55137B(obj, i3)) {
                        computeDoubleSize = CodedOutputStream.computeFixed64Size(m55119T, 0L);
                        break;
                    } else {
                        continue;
                    }
                case 6:
                    if (m55137B(obj, i3)) {
                        computeDoubleSize = CodedOutputStream.computeFixed32Size(m55119T, 0);
                        break;
                    } else {
                        continue;
                    }
                case 7:
                    if (m55137B(obj, i3)) {
                        computeDoubleSize = CodedOutputStream.computeBoolSize(m55119T, true);
                        break;
                    } else {
                        continue;
                    }
                case 8:
                    if (m55137B(obj, i3)) {
                        Object m493F = AbstractC22978xY1.m493F(obj, m55118U);
                        if (m493F instanceof ByteString) {
                            computeDoubleSize = CodedOutputStream.computeBytesSize(m55119T, (ByteString) m493F);
                            break;
                        } else {
                            computeDoubleSize = CodedOutputStream.computeStringSize(m55119T, (String) m493F);
                            break;
                        }
                    } else {
                        continue;
                    }
                case 9:
                    if (m55137B(obj, i3)) {
                        computeDoubleSize = AbstractC4455w.m54968o(m55119T, AbstractC22978xY1.m493F(obj, m55118U), m55081u(i3));
                        break;
                    } else {
                        continue;
                    }
                case 10:
                    if (m55137B(obj, i3)) {
                        computeDoubleSize = CodedOutputStream.computeBytesSize(m55119T, (ByteString) AbstractC22978xY1.m493F(obj, m55118U));
                        break;
                    } else {
                        continue;
                    }
                case 11:
                    if (m55137B(obj, i3)) {
                        computeDoubleSize = CodedOutputStream.computeUInt32Size(m55119T, AbstractC22978xY1.m497B(obj, m55118U));
                        break;
                    } else {
                        continue;
                    }
                case 12:
                    if (m55137B(obj, i3)) {
                        computeDoubleSize = CodedOutputStream.computeEnumSize(m55119T, AbstractC22978xY1.m497B(obj, m55118U));
                        break;
                    } else {
                        continue;
                    }
                case 13:
                    if (m55137B(obj, i3)) {
                        computeDoubleSize = CodedOutputStream.computeSFixed32Size(m55119T, 0);
                        break;
                    } else {
                        continue;
                    }
                case 14:
                    if (m55137B(obj, i3)) {
                        computeDoubleSize = CodedOutputStream.computeSFixed64Size(m55119T, 0L);
                        break;
                    } else {
                        continue;
                    }
                case 15:
                    if (m55137B(obj, i3)) {
                        computeDoubleSize = CodedOutputStream.computeSInt32Size(m55119T, AbstractC22978xY1.m497B(obj, m55118U));
                        break;
                    } else {
                        continue;
                    }
                case 16:
                    if (m55137B(obj, i3)) {
                        computeDoubleSize = CodedOutputStream.computeSInt64Size(m55119T, AbstractC22978xY1.m495D(obj, m55118U));
                        break;
                    } else {
                        continue;
                    }
                case 17:
                    if (m55137B(obj, i3)) {
                        computeDoubleSize = CodedOutputStream.m56052b(m55119T, (MessageLite) AbstractC22978xY1.m493F(obj, m55118U), m55081u(i3));
                        break;
                    } else {
                        continue;
                    }
                case 18:
                    computeDoubleSize = AbstractC4455w.m54975h(m55119T, m55129J(obj, m55118U), false);
                    break;
                case 19:
                    computeDoubleSize = AbstractC4455w.m54977f(m55119T, m55129J(obj, m55118U), false);
                    break;
                case 20:
                    computeDoubleSize = AbstractC4455w.m54970m(m55119T, m55129J(obj, m55118U), false);
                    break;
                case 21:
                    computeDoubleSize = AbstractC4455w.m54959x(m55119T, m55129J(obj, m55118U), false);
                    break;
                case 22:
                    computeDoubleSize = AbstractC4455w.m54972k(m55119T, m55129J(obj, m55118U), false);
                    break;
                case 23:
                    computeDoubleSize = AbstractC4455w.m54975h(m55119T, m55129J(obj, m55118U), false);
                    break;
                case 24:
                    computeDoubleSize = AbstractC4455w.m54977f(m55119T, m55129J(obj, m55118U), false);
                    break;
                case 25:
                    computeDoubleSize = AbstractC4455w.m54987a(m55119T, m55129J(obj, m55118U), false);
                    break;
                case 26:
                    computeDoubleSize = AbstractC4455w.m54962u(m55119T, m55129J(obj, m55118U));
                    break;
                case 27:
                    computeDoubleSize = AbstractC4455w.m54967p(m55119T, m55129J(obj, m55118U), m55081u(i3));
                    break;
                case 28:
                    computeDoubleSize = AbstractC4455w.m54983c(m55119T, m55129J(obj, m55118U));
                    break;
                case 29:
                    computeDoubleSize = AbstractC4455w.m54961v(m55119T, m55129J(obj, m55118U), false);
                    break;
                case 30:
                    computeDoubleSize = AbstractC4455w.m54981d(m55119T, m55129J(obj, m55118U), false);
                    break;
                case 31:
                    computeDoubleSize = AbstractC4455w.m54977f(m55119T, m55129J(obj, m55118U), false);
                    break;
                case 32:
                    computeDoubleSize = AbstractC4455w.m54975h(m55119T, m55129J(obj, m55118U), false);
                    break;
                case 33:
                    computeDoubleSize = AbstractC4455w.m54966q(m55119T, m55129J(obj, m55118U), false);
                    break;
                case 34:
                    computeDoubleSize = AbstractC4455w.m54964s(m55119T, m55129J(obj, m55118U), false);
                    break;
                case 35:
                    m54974i = AbstractC4455w.m54974i((List) unsafe.getObject(obj, m55118U));
                    if (m54974i > 0) {
                        if (this.f34959i) {
                            unsafe.putInt(obj, i, m54974i);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(m55119T);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(m54974i);
                        computeDoubleSize = computeTagSize + computeUInt32SizeNoTag + m54974i;
                        break;
                    } else {
                        continue;
                    }
                case 36:
                    m54974i = AbstractC4455w.m54976g((List) unsafe.getObject(obj, m55118U));
                    if (m54974i > 0) {
                        if (this.f34959i) {
                            unsafe.putInt(obj, i, m54974i);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(m55119T);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(m54974i);
                        computeDoubleSize = computeTagSize + computeUInt32SizeNoTag + m54974i;
                        break;
                    } else {
                        continue;
                    }
                case 37:
                    m54974i = AbstractC4455w.m54969n((List) unsafe.getObject(obj, m55118U));
                    if (m54974i > 0) {
                        if (this.f34959i) {
                            unsafe.putInt(obj, i, m54974i);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(m55119T);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(m54974i);
                        computeDoubleSize = computeTagSize + computeUInt32SizeNoTag + m54974i;
                        break;
                    } else {
                        continue;
                    }
                case 38:
                    m54974i = AbstractC4455w.m54958y((List) unsafe.getObject(obj, m55118U));
                    if (m54974i > 0) {
                        if (this.f34959i) {
                            unsafe.putInt(obj, i, m54974i);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(m55119T);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(m54974i);
                        computeDoubleSize = computeTagSize + computeUInt32SizeNoTag + m54974i;
                        break;
                    } else {
                        continue;
                    }
                case 39:
                    m54974i = AbstractC4455w.m54971l((List) unsafe.getObject(obj, m55118U));
                    if (m54974i > 0) {
                        if (this.f34959i) {
                            unsafe.putInt(obj, i, m54974i);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(m55119T);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(m54974i);
                        computeDoubleSize = computeTagSize + computeUInt32SizeNoTag + m54974i;
                        break;
                    } else {
                        continue;
                    }
                case 40:
                    m54974i = AbstractC4455w.m54974i((List) unsafe.getObject(obj, m55118U));
                    if (m54974i > 0) {
                        if (this.f34959i) {
                            unsafe.putInt(obj, i, m54974i);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(m55119T);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(m54974i);
                        computeDoubleSize = computeTagSize + computeUInt32SizeNoTag + m54974i;
                        break;
                    } else {
                        continue;
                    }
                case 41:
                    m54974i = AbstractC4455w.m54976g((List) unsafe.getObject(obj, m55118U));
                    if (m54974i > 0) {
                        if (this.f34959i) {
                            unsafe.putInt(obj, i, m54974i);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(m55119T);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(m54974i);
                        computeDoubleSize = computeTagSize + computeUInt32SizeNoTag + m54974i;
                        break;
                    } else {
                        continue;
                    }
                case 42:
                    m54974i = AbstractC4455w.m54985b((List) unsafe.getObject(obj, m55118U));
                    if (m54974i > 0) {
                        if (this.f34959i) {
                            unsafe.putInt(obj, i, m54974i);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(m55119T);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(m54974i);
                        computeDoubleSize = computeTagSize + computeUInt32SizeNoTag + m54974i;
                        break;
                    } else {
                        continue;
                    }
                case 43:
                    m54974i = AbstractC4455w.m54960w((List) unsafe.getObject(obj, m55118U));
                    if (m54974i > 0) {
                        if (this.f34959i) {
                            unsafe.putInt(obj, i, m54974i);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(m55119T);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(m54974i);
                        computeDoubleSize = computeTagSize + computeUInt32SizeNoTag + m54974i;
                        break;
                    } else {
                        continue;
                    }
                case 44:
                    m54974i = AbstractC4455w.m54979e((List) unsafe.getObject(obj, m55118U));
                    if (m54974i > 0) {
                        if (this.f34959i) {
                            unsafe.putInt(obj, i, m54974i);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(m55119T);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(m54974i);
                        computeDoubleSize = computeTagSize + computeUInt32SizeNoTag + m54974i;
                        break;
                    } else {
                        continue;
                    }
                case 45:
                    m54974i = AbstractC4455w.m54976g((List) unsafe.getObject(obj, m55118U));
                    if (m54974i > 0) {
                        if (this.f34959i) {
                            unsafe.putInt(obj, i, m54974i);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(m55119T);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(m54974i);
                        computeDoubleSize = computeTagSize + computeUInt32SizeNoTag + m54974i;
                        break;
                    } else {
                        continue;
                    }
                case 46:
                    m54974i = AbstractC4455w.m54974i((List) unsafe.getObject(obj, m55118U));
                    if (m54974i > 0) {
                        if (this.f34959i) {
                            unsafe.putInt(obj, i, m54974i);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(m55119T);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(m54974i);
                        computeDoubleSize = computeTagSize + computeUInt32SizeNoTag + m54974i;
                        break;
                    } else {
                        continue;
                    }
                case 47:
                    m54974i = AbstractC4455w.m54965r((List) unsafe.getObject(obj, m55118U));
                    if (m54974i > 0) {
                        if (this.f34959i) {
                            unsafe.putInt(obj, i, m54974i);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(m55119T);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(m54974i);
                        computeDoubleSize = computeTagSize + computeUInt32SizeNoTag + m54974i;
                        break;
                    } else {
                        continue;
                    }
                case 48:
                    m54974i = AbstractC4455w.m54963t((List) unsafe.getObject(obj, m55118U));
                    if (m54974i > 0) {
                        if (this.f34959i) {
                            unsafe.putInt(obj, i, m54974i);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(m55119T);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(m54974i);
                        computeDoubleSize = computeTagSize + computeUInt32SizeNoTag + m54974i;
                        break;
                    } else {
                        continue;
                    }
                case 49:
                    computeDoubleSize = AbstractC4455w.m54973j(m55119T, m55129J(obj, m55118U), m55081u(i3));
                    break;
                case 50:
                    computeDoubleSize = this.f34967q.mo55149e(m55119T, AbstractC22978xY1.m493F(obj, m55118U), m55083t(i3));
                    break;
                case EACTags.TRANSACTION_DATE /* 51 */:
                    if (m55131H(obj, m55119T, i3)) {
                        computeDoubleSize = CodedOutputStream.computeDoubleSize(m55119T, 0.0d);
                        break;
                    } else {
                        continue;
                    }
                case EACTags.CARD_SEQUENCE_NUMBER /* 52 */:
                    if (m55131H(obj, m55119T, i3)) {
                        computeDoubleSize = CodedOutputStream.computeFloatSize(m55119T, 0.0f);
                        break;
                    } else {
                        continue;
                    }
                case EACTags.SEX /* 53 */:
                    if (m55131H(obj, m55119T, i3)) {
                        computeDoubleSize = CodedOutputStream.computeInt64Size(m55119T, m55113Z(obj, m55118U));
                        break;
                    } else {
                        continue;
                    }
                case 54:
                    if (m55131H(obj, m55119T, i3)) {
                        computeDoubleSize = CodedOutputStream.computeUInt64Size(m55119T, m55113Z(obj, m55118U));
                        break;
                    } else {
                        continue;
                    }
                case 55:
                    if (m55131H(obj, m55119T, i3)) {
                        computeDoubleSize = CodedOutputStream.computeInt32Size(m55119T, m55114Y(obj, m55118U));
                        break;
                    } else {
                        continue;
                    }
                case 56:
                    if (m55131H(obj, m55119T, i3)) {
                        computeDoubleSize = CodedOutputStream.computeFixed64Size(m55119T, 0L);
                        break;
                    } else {
                        continue;
                    }
                case 57:
                    if (m55131H(obj, m55119T, i3)) {
                        computeDoubleSize = CodedOutputStream.computeFixed32Size(m55119T, 0);
                        break;
                    } else {
                        continue;
                    }
                case EACTags.DYNAMIC_INTERNAL_AUTHENTIFICATION /* 58 */:
                    if (m55131H(obj, m55119T, i3)) {
                        computeDoubleSize = CodedOutputStream.computeBoolSize(m55119T, true);
                        break;
                    } else {
                        continue;
                    }
                case EACTags.DYNAMIC_EXTERNAL_AUTHENTIFICATION /* 59 */:
                    if (m55131H(obj, m55119T, i3)) {
                        Object m493F2 = AbstractC22978xY1.m493F(obj, m55118U);
                        if (m493F2 instanceof ByteString) {
                            computeDoubleSize = CodedOutputStream.computeBytesSize(m55119T, (ByteString) m493F2);
                            break;
                        } else {
                            computeDoubleSize = CodedOutputStream.computeStringSize(m55119T, (String) m493F2);
                            break;
                        }
                    } else {
                        continue;
                    }
                case 60:
                    if (m55131H(obj, m55119T, i3)) {
                        computeDoubleSize = AbstractC4455w.m54968o(m55119T, AbstractC22978xY1.m493F(obj, m55118U), m55081u(i3));
                        break;
                    } else {
                        continue;
                    }
                case 61:
                    if (m55131H(obj, m55119T, i3)) {
                        computeDoubleSize = CodedOutputStream.computeBytesSize(m55119T, (ByteString) AbstractC22978xY1.m493F(obj, m55118U));
                        break;
                    } else {
                        continue;
                    }
                case 62:
                    if (m55131H(obj, m55119T, i3)) {
                        computeDoubleSize = CodedOutputStream.computeUInt32Size(m55119T, m55114Y(obj, m55118U));
                        break;
                    } else {
                        continue;
                    }
                case 63:
                    if (m55131H(obj, m55119T, i3)) {
                        computeDoubleSize = CodedOutputStream.computeEnumSize(m55119T, m55114Y(obj, m55118U));
                        break;
                    } else {
                        continue;
                    }
                case 64:
                    if (m55131H(obj, m55119T, i3)) {
                        computeDoubleSize = CodedOutputStream.computeSFixed32Size(m55119T, 0);
                        break;
                    } else {
                        continue;
                    }
                case EACTags.ELEMENT_LIST /* 65 */:
                    if (m55131H(obj, m55119T, i3)) {
                        computeDoubleSize = CodedOutputStream.computeSFixed64Size(m55119T, 0L);
                        break;
                    } else {
                        continue;
                    }
                case EACTags.ADDRESS /* 66 */:
                    if (m55131H(obj, m55119T, i3)) {
                        computeDoubleSize = CodedOutputStream.computeSInt32Size(m55119T, m55114Y(obj, m55118U));
                        break;
                    } else {
                        continue;
                    }
                case EACTags.CARDHOLDER_HANDWRITTEN_SIGNATURE /* 67 */:
                    if (m55131H(obj, m55119T, i3)) {
                        computeDoubleSize = CodedOutputStream.computeSInt64Size(m55119T, m55113Z(obj, m55118U));
                        break;
                    } else {
                        continue;
                    }
                case EACTags.APPLICATION_IMAGE /* 68 */:
                    if (m55131H(obj, m55119T, i3)) {
                        computeDoubleSize = CodedOutputStream.m56052b(m55119T, (MessageLite) AbstractC22978xY1.m493F(obj, m55118U), m55081u(i3));
                        break;
                    } else {
                        continue;
                    }
                default:
            }
            i2 += computeDoubleSize;
        }
        return i2 + m55073y(this.f34965o, obj);
    }

    /* renamed from: x0 */
    public final void m55074x0(int i, Object obj, Writer writer) {
        if (obj instanceof String) {
            writer.mo55230d(i, (String) obj);
        } else {
            writer.mo55246I(i, (ByteString) obj);
        }
    }

    /* renamed from: y */
    public final int m55073y(AbstractC4466y abstractC4466y, Object obj) {
        return abstractC4466y.mo54908h(abstractC4466y.mo54909g(obj));
    }

    /* renamed from: y0 */
    public final void m55072y0(AbstractC4466y abstractC4466y, Object obj, Writer writer) {
        abstractC4466y.mo54898t(abstractC4466y.mo54909g(obj), writer);
    }
}
