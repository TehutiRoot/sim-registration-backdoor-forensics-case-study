package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.MapEntryLite;
import androidx.datastore.preferences.protobuf.WireFormat;
import androidx.datastore.preferences.protobuf.Writer;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* renamed from: androidx.datastore.preferences.protobuf.f */
/* loaded from: classes2.dex */
public final class C4432f implements Writer {

    /* renamed from: a */
    public final CodedOutputStream f34931a;

    /* renamed from: androidx.datastore.preferences.protobuf.f$a */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class C4433a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f34932a;

        static {
            int[] iArr = new int[WireFormat.FieldType.values().length];
            f34932a = iArr;
            try {
                iArr[WireFormat.FieldType.BOOL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f34932a[WireFormat.FieldType.FIXED32.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f34932a[WireFormat.FieldType.INT32.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f34932a[WireFormat.FieldType.SFIXED32.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f34932a[WireFormat.FieldType.SINT32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f34932a[WireFormat.FieldType.UINT32.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f34932a[WireFormat.FieldType.FIXED64.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f34932a[WireFormat.FieldType.INT64.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f34932a[WireFormat.FieldType.SFIXED64.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f34932a[WireFormat.FieldType.SINT64.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f34932a[WireFormat.FieldType.UINT64.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f34932a[WireFormat.FieldType.STRING.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    public C4432f(CodedOutputStream codedOutputStream) {
        CodedOutputStream codedOutputStream2 = (CodedOutputStream) Internal.m55729b(codedOutputStream, "output");
        this.f34931a = codedOutputStream2;
        codedOutputStream2.f34725a = this;
    }

    /* renamed from: O */
    public static C4432f m55240O(CodedOutputStream codedOutputStream) {
        C4432f c4432f = codedOutputStream.f34725a;
        if (c4432f != null) {
            return c4432f;
        }
        return new C4432f(codedOutputStream);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    /* renamed from: A */
    public Writer.FieldOrder mo55254A() {
        return Writer.FieldOrder.ASCENDING;
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    /* renamed from: B */
    public void mo55253B(int i, long j) {
        this.f34931a.writeInt64(i, j);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    /* renamed from: C */
    public void mo55252C(int i, List list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f34931a.writeTag(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += CodedOutputStream.computeSFixed32SizeNoTag(((Integer) list.get(i4)).intValue());
            }
            this.f34931a.writeUInt32NoTag(i3);
            while (i2 < list.size()) {
                this.f34931a.writeSFixed32NoTag(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f34931a.writeSFixed32(i, ((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    /* renamed from: D */
    public void mo55251D(int i, List list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f34931a.writeTag(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += CodedOutputStream.computeBoolSizeNoTag(((Boolean) list.get(i4)).booleanValue());
            }
            this.f34931a.writeUInt32NoTag(i3);
            while (i2 < list.size()) {
                this.f34931a.writeBoolNoTag(((Boolean) list.get(i2)).booleanValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f34931a.writeBool(i, ((Boolean) list.get(i2)).booleanValue());
            i2++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    /* renamed from: E */
    public void mo55250E(int i, float f) {
        this.f34931a.writeFloat(i, f);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    /* renamed from: F */
    public void mo55249F(int i, int i2) {
        this.f34931a.writeEnum(i, i2);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    /* renamed from: G */
    public void mo55248G(int i, List list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f34931a.writeTag(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += CodedOutputStream.computeInt64SizeNoTag(((Long) list.get(i4)).longValue());
            }
            this.f34931a.writeUInt32NoTag(i3);
            while (i2 < list.size()) {
                this.f34931a.writeInt64NoTag(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f34931a.writeInt64(i, ((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    /* renamed from: H */
    public void mo55247H(int i, int i2) {
        this.f34931a.writeSInt32(i, i2);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    /* renamed from: I */
    public void mo55246I(int i, ByteString byteString) {
        this.f34931a.writeBytes(i, byteString);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    /* renamed from: J */
    public void mo55245J(int i, Object obj, InterfaceC4454v interfaceC4454v) {
        this.f34931a.mo56027o(i, (MessageLite) obj, interfaceC4454v);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    /* renamed from: K */
    public void mo55244K(int i, MapEntryLite.C4386b c4386b, Map map) {
        if (this.f34931a.m56045i()) {
            m55236S(i, c4386b, map);
            return;
        }
        for (Map.Entry entry : map.entrySet()) {
            this.f34931a.writeTag(i, 2);
            this.f34931a.writeUInt32NoTag(MapEntryLite.m55676a(c4386b, entry.getKey(), entry.getValue()));
            MapEntryLite.m55672e(this.f34931a, c4386b, entry.getKey(), entry.getValue());
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    /* renamed from: L */
    public void mo55243L(int i, List list, InterfaceC4454v interfaceC4454v) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            mo55242M(i, list.get(i2), interfaceC4454v);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    /* renamed from: M */
    public void mo55242M(int i, Object obj, InterfaceC4454v interfaceC4454v) {
        this.f34931a.m56042m(i, (MessageLite) obj, interfaceC4454v);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    /* renamed from: N */
    public void mo55241N(int i, List list, InterfaceC4454v interfaceC4454v) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            mo55245J(i, list.get(i2), interfaceC4454v);
        }
    }

    /* renamed from: P */
    public final void m55239P(int i, boolean z, Object obj, MapEntryLite.C4386b c4386b) {
        this.f34931a.writeTag(i, 2);
        this.f34931a.writeUInt32NoTag(MapEntryLite.m55676a(c4386b, Boolean.valueOf(z), obj));
        MapEntryLite.m55672e(this.f34931a, c4386b, Boolean.valueOf(z), obj);
    }

    /* renamed from: Q */
    public final void m55238Q(int i, MapEntryLite.C4386b c4386b, Map map) {
        int size = map.size();
        int[] iArr = new int[size];
        int i2 = 0;
        for (Integer num : map.keySet()) {
            iArr[i2] = num.intValue();
            i2++;
        }
        Arrays.sort(iArr);
        for (int i3 = 0; i3 < size; i3++) {
            int i4 = iArr[i3];
            Object obj = map.get(Integer.valueOf(i4));
            this.f34931a.writeTag(i, 2);
            this.f34931a.writeUInt32NoTag(MapEntryLite.m55676a(c4386b, Integer.valueOf(i4), obj));
            MapEntryLite.m55672e(this.f34931a, c4386b, Integer.valueOf(i4), obj);
        }
    }

    /* renamed from: R */
    public final void m55237R(int i, MapEntryLite.C4386b c4386b, Map map) {
        int size = map.size();
        long[] jArr = new long[size];
        int i2 = 0;
        for (Long l : map.keySet()) {
            jArr[i2] = l.longValue();
            i2++;
        }
        Arrays.sort(jArr);
        for (int i3 = 0; i3 < size; i3++) {
            long j = jArr[i3];
            Object obj = map.get(Long.valueOf(j));
            this.f34931a.writeTag(i, 2);
            this.f34931a.writeUInt32NoTag(MapEntryLite.m55676a(c4386b, Long.valueOf(j), obj));
            MapEntryLite.m55672e(this.f34931a, c4386b, Long.valueOf(j), obj);
        }
    }

    /* renamed from: S */
    public final void m55236S(int i, MapEntryLite.C4386b c4386b, Map map) {
        switch (C4433a.f34932a[c4386b.f34847a.ordinal()]) {
            case 1:
                Object obj = map.get(Boolean.FALSE);
                if (obj != null) {
                    m55239P(i, false, obj, c4386b);
                }
                Object obj2 = map.get(Boolean.TRUE);
                if (obj2 != null) {
                    m55239P(i, true, obj2, c4386b);
                    return;
                }
                return;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                m55238Q(i, c4386b, map);
                return;
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                m55237R(i, c4386b, map);
                return;
            case 12:
                m55235T(i, c4386b, map);
                return;
            default:
                throw new IllegalArgumentException("does not support key type: " + c4386b.f34847a);
        }
    }

    /* renamed from: T */
    public final void m55235T(int i, MapEntryLite.C4386b c4386b, Map map) {
        int size = map.size();
        String[] strArr = new String[size];
        int i2 = 0;
        for (String str : map.keySet()) {
            strArr[i2] = str;
            i2++;
        }
        Arrays.sort(strArr);
        for (int i3 = 0; i3 < size; i3++) {
            String str2 = strArr[i3];
            Object obj = map.get(str2);
            this.f34931a.writeTag(i, 2);
            this.f34931a.writeUInt32NoTag(MapEntryLite.m55676a(c4386b, str2, obj));
            MapEntryLite.m55672e(this.f34931a, c4386b, str2, obj);
        }
    }

    /* renamed from: U */
    public final void m55234U(int i, Object obj) {
        if (obj instanceof String) {
            this.f34931a.writeString(i, (String) obj);
        } else {
            this.f34931a.writeBytes(i, (ByteString) obj);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    /* renamed from: a */
    public void mo55233a(int i, List list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f34931a.writeTag(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += CodedOutputStream.computeFloatSizeNoTag(((Float) list.get(i4)).floatValue());
            }
            this.f34931a.writeUInt32NoTag(i3);
            while (i2 < list.size()) {
                this.f34931a.writeFloatNoTag(((Float) list.get(i2)).floatValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f34931a.writeFloat(i, ((Float) list.get(i2)).floatValue());
            i2++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    /* renamed from: b */
    public final void mo55232b(int i, Object obj) {
        if (obj instanceof ByteString) {
            this.f34931a.writeRawMessageSetExtension(i, (ByteString) obj);
        } else {
            this.f34931a.writeMessageSetExtension(i, (MessageLite) obj);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    /* renamed from: c */
    public void mo55231c(int i, int i2) {
        this.f34931a.writeFixed32(i, i2);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    /* renamed from: d */
    public void mo55230d(int i, String str) {
        this.f34931a.writeString(i, str);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    /* renamed from: e */
    public void mo55229e(int i, long j) {
        this.f34931a.writeUInt64(i, j);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    /* renamed from: f */
    public void mo55228f(int i, List list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f34931a.writeTag(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += CodedOutputStream.computeInt32SizeNoTag(((Integer) list.get(i4)).intValue());
            }
            this.f34931a.writeUInt32NoTag(i3);
            while (i2 < list.size()) {
                this.f34931a.writeInt32NoTag(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f34931a.writeInt32(i, ((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    /* renamed from: g */
    public void mo55227g(int i, List list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f34931a.writeTag(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += CodedOutputStream.computeFixed32SizeNoTag(((Integer) list.get(i4)).intValue());
            }
            this.f34931a.writeUInt32NoTag(i3);
            while (i2 < list.size()) {
                this.f34931a.writeFixed32NoTag(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f34931a.writeFixed32(i, ((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    /* renamed from: h */
    public void mo55226h(int i, List list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f34931a.writeTag(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += CodedOutputStream.computeUInt32SizeNoTag(((Integer) list.get(i4)).intValue());
            }
            this.f34931a.writeUInt32NoTag(i3);
            while (i2 < list.size()) {
                this.f34931a.writeUInt32NoTag(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f34931a.writeUInt32(i, ((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    /* renamed from: i */
    public void mo55225i(int i, long j) {
        this.f34931a.writeSInt64(i, j);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    /* renamed from: j */
    public void mo55224j(int i, int i2) {
        this.f34931a.writeUInt32(i, i2);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    /* renamed from: k */
    public void mo55223k(int i, List list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f34931a.writeTag(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += CodedOutputStream.computeUInt64SizeNoTag(((Long) list.get(i4)).longValue());
            }
            this.f34931a.writeUInt32NoTag(i3);
            while (i2 < list.size()) {
                this.f34931a.writeUInt64NoTag(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f34931a.writeUInt64(i, ((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    /* renamed from: l */
    public void mo55222l(int i, long j) {
        this.f34931a.writeFixed64(i, j);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    /* renamed from: m */
    public void mo55221m(int i, boolean z) {
        this.f34931a.writeBool(i, z);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    /* renamed from: n */
    public void mo55220n(int i, int i2) {
        this.f34931a.writeSFixed32(i, i2);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    /* renamed from: o */
    public void mo55219o(int i) {
        this.f34931a.writeTag(i, 3);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    /* renamed from: p */
    public void mo55218p(int i, List list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f34931a.writeTag(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += CodedOutputStream.computeFixed64SizeNoTag(((Long) list.get(i4)).longValue());
            }
            this.f34931a.writeUInt32NoTag(i3);
            while (i2 < list.size()) {
                this.f34931a.writeFixed64NoTag(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f34931a.writeFixed64(i, ((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    /* renamed from: q */
    public void mo55217q(int i) {
        this.f34931a.writeTag(i, 4);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    /* renamed from: r */
    public void mo55216r(int i, List list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f34931a.writeTag(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += CodedOutputStream.computeSInt32SizeNoTag(((Integer) list.get(i4)).intValue());
            }
            this.f34931a.writeUInt32NoTag(i3);
            while (i2 < list.size()) {
                this.f34931a.writeSInt32NoTag(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f34931a.writeSInt32(i, ((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    /* renamed from: s */
    public void mo55215s(int i, List list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f34931a.writeTag(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += CodedOutputStream.computeDoubleSizeNoTag(((Double) list.get(i4)).doubleValue());
            }
            this.f34931a.writeUInt32NoTag(i3);
            while (i2 < list.size()) {
                this.f34931a.writeDoubleNoTag(((Double) list.get(i2)).doubleValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f34931a.writeDouble(i, ((Double) list.get(i2)).doubleValue());
            i2++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    /* renamed from: t */
    public void mo55214t(int i, List list) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            this.f34931a.writeBytes(i, (ByteString) list.get(i2));
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    /* renamed from: u */
    public void mo55213u(int i, List list) {
        int i2 = 0;
        if (list instanceof LazyStringList) {
            LazyStringList lazyStringList = (LazyStringList) list;
            while (i2 < list.size()) {
                m55234U(i, lazyStringList.getRaw(i2));
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f34931a.writeString(i, (String) list.get(i2));
            i2++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    /* renamed from: v */
    public void mo55212v(int i, long j) {
        this.f34931a.writeSFixed64(i, j);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    /* renamed from: w */
    public void mo55211w(int i, List list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f34931a.writeTag(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += CodedOutputStream.computeSInt64SizeNoTag(((Long) list.get(i4)).longValue());
            }
            this.f34931a.writeUInt32NoTag(i3);
            while (i2 < list.size()) {
                this.f34931a.writeSInt64NoTag(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f34931a.writeSInt64(i, ((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void writeInt32(int i, int i2) {
        this.f34931a.writeInt32(i, i2);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    /* renamed from: x */
    public void mo55210x(int i, List list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f34931a.writeTag(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += CodedOutputStream.computeEnumSizeNoTag(((Integer) list.get(i4)).intValue());
            }
            this.f34931a.writeUInt32NoTag(i3);
            while (i2 < list.size()) {
                this.f34931a.writeEnumNoTag(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f34931a.writeEnum(i, ((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    /* renamed from: y */
    public void mo55209y(int i, double d) {
        this.f34931a.writeDouble(i, d);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    /* renamed from: z */
    public void mo55208z(int i, List list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f34931a.writeTag(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += CodedOutputStream.computeSFixed64SizeNoTag(((Long) list.get(i4)).longValue());
            }
            this.f34931a.writeUInt32NoTag(i3);
            while (i2 < list.size()) {
                this.f34931a.writeSFixed64NoTag(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f34931a.writeSFixed64(i, ((Long) list.get(i2)).longValue());
            i2++;
        }
    }
}
