package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.MapEntryLite;
import androidx.datastore.preferences.protobuf.WireFormat;
import androidx.datastore.preferences.protobuf.Writer;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* renamed from: androidx.datastore.preferences.protobuf.f */
/* loaded from: classes2.dex */
public final class C4414f implements Writer {

    /* renamed from: a */
    public final CodedOutputStream f35019a;

    /* renamed from: androidx.datastore.preferences.protobuf.f$a */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class C4415a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f35020a;

        static {
            int[] iArr = new int[WireFormat.FieldType.values().length];
            f35020a = iArr;
            try {
                iArr[WireFormat.FieldType.BOOL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f35020a[WireFormat.FieldType.FIXED32.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f35020a[WireFormat.FieldType.INT32.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f35020a[WireFormat.FieldType.SFIXED32.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f35020a[WireFormat.FieldType.SINT32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f35020a[WireFormat.FieldType.UINT32.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f35020a[WireFormat.FieldType.FIXED64.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f35020a[WireFormat.FieldType.INT64.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f35020a[WireFormat.FieldType.SFIXED64.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f35020a[WireFormat.FieldType.SINT64.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f35020a[WireFormat.FieldType.UINT64.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f35020a[WireFormat.FieldType.STRING.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    public C4414f(CodedOutputStream codedOutputStream) {
        CodedOutputStream codedOutputStream2 = (CodedOutputStream) Internal.m55679b(codedOutputStream, "output");
        this.f35019a = codedOutputStream2;
        codedOutputStream2.f34813a = this;
    }

    /* renamed from: O */
    public static C4414f m55190O(CodedOutputStream codedOutputStream) {
        C4414f c4414f = codedOutputStream.f34813a;
        if (c4414f != null) {
            return c4414f;
        }
        return new C4414f(codedOutputStream);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    /* renamed from: A */
    public Writer.FieldOrder mo55204A() {
        return Writer.FieldOrder.ASCENDING;
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    /* renamed from: B */
    public void mo55203B(int i, long j) {
        this.f35019a.writeInt64(i, j);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    /* renamed from: C */
    public void mo55202C(int i, List list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f35019a.writeTag(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += CodedOutputStream.computeSFixed32SizeNoTag(((Integer) list.get(i4)).intValue());
            }
            this.f35019a.writeUInt32NoTag(i3);
            while (i2 < list.size()) {
                this.f35019a.writeSFixed32NoTag(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f35019a.writeSFixed32(i, ((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    /* renamed from: D */
    public void mo55201D(int i, List list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f35019a.writeTag(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += CodedOutputStream.computeBoolSizeNoTag(((Boolean) list.get(i4)).booleanValue());
            }
            this.f35019a.writeUInt32NoTag(i3);
            while (i2 < list.size()) {
                this.f35019a.writeBoolNoTag(((Boolean) list.get(i2)).booleanValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f35019a.writeBool(i, ((Boolean) list.get(i2)).booleanValue());
            i2++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    /* renamed from: E */
    public void mo55200E(int i, float f) {
        this.f35019a.writeFloat(i, f);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    /* renamed from: F */
    public void mo55199F(int i, int i2) {
        this.f35019a.writeEnum(i, i2);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    /* renamed from: G */
    public void mo55198G(int i, List list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f35019a.writeTag(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += CodedOutputStream.computeInt64SizeNoTag(((Long) list.get(i4)).longValue());
            }
            this.f35019a.writeUInt32NoTag(i3);
            while (i2 < list.size()) {
                this.f35019a.writeInt64NoTag(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f35019a.writeInt64(i, ((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    /* renamed from: H */
    public void mo55197H(int i, int i2) {
        this.f35019a.writeSInt32(i, i2);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    /* renamed from: I */
    public void mo55196I(int i, ByteString byteString) {
        this.f35019a.writeBytes(i, byteString);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    /* renamed from: J */
    public void mo55195J(int i, Object obj, InterfaceC4436v interfaceC4436v) {
        this.f35019a.mo55977o(i, (MessageLite) obj, interfaceC4436v);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    /* renamed from: K */
    public void mo55194K(int i, MapEntryLite.C4368b c4368b, Map map) {
        if (this.f35019a.m55995i()) {
            m55186S(i, c4368b, map);
            return;
        }
        for (Map.Entry entry : map.entrySet()) {
            this.f35019a.writeTag(i, 2);
            this.f35019a.writeUInt32NoTag(MapEntryLite.m55626a(c4368b, entry.getKey(), entry.getValue()));
            MapEntryLite.m55622e(this.f35019a, c4368b, entry.getKey(), entry.getValue());
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    /* renamed from: L */
    public void mo55193L(int i, List list, InterfaceC4436v interfaceC4436v) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            mo55192M(i, list.get(i2), interfaceC4436v);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    /* renamed from: M */
    public void mo55192M(int i, Object obj, InterfaceC4436v interfaceC4436v) {
        this.f35019a.m55992m(i, (MessageLite) obj, interfaceC4436v);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    /* renamed from: N */
    public void mo55191N(int i, List list, InterfaceC4436v interfaceC4436v) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            mo55195J(i, list.get(i2), interfaceC4436v);
        }
    }

    /* renamed from: P */
    public final void m55189P(int i, boolean z, Object obj, MapEntryLite.C4368b c4368b) {
        this.f35019a.writeTag(i, 2);
        this.f35019a.writeUInt32NoTag(MapEntryLite.m55626a(c4368b, Boolean.valueOf(z), obj));
        MapEntryLite.m55622e(this.f35019a, c4368b, Boolean.valueOf(z), obj);
    }

    /* renamed from: Q */
    public final void m55188Q(int i, MapEntryLite.C4368b c4368b, Map map) {
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
            this.f35019a.writeTag(i, 2);
            this.f35019a.writeUInt32NoTag(MapEntryLite.m55626a(c4368b, Integer.valueOf(i4), obj));
            MapEntryLite.m55622e(this.f35019a, c4368b, Integer.valueOf(i4), obj);
        }
    }

    /* renamed from: R */
    public final void m55187R(int i, MapEntryLite.C4368b c4368b, Map map) {
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
            this.f35019a.writeTag(i, 2);
            this.f35019a.writeUInt32NoTag(MapEntryLite.m55626a(c4368b, Long.valueOf(j), obj));
            MapEntryLite.m55622e(this.f35019a, c4368b, Long.valueOf(j), obj);
        }
    }

    /* renamed from: S */
    public final void m55186S(int i, MapEntryLite.C4368b c4368b, Map map) {
        switch (C4415a.f35020a[c4368b.f34935a.ordinal()]) {
            case 1:
                Object obj = map.get(Boolean.FALSE);
                if (obj != null) {
                    m55189P(i, false, obj, c4368b);
                }
                Object obj2 = map.get(Boolean.TRUE);
                if (obj2 != null) {
                    m55189P(i, true, obj2, c4368b);
                    return;
                }
                return;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                m55188Q(i, c4368b, map);
                return;
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                m55187R(i, c4368b, map);
                return;
            case 12:
                m55185T(i, c4368b, map);
                return;
            default:
                throw new IllegalArgumentException("does not support key type: " + c4368b.f34935a);
        }
    }

    /* renamed from: T */
    public final void m55185T(int i, MapEntryLite.C4368b c4368b, Map map) {
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
            this.f35019a.writeTag(i, 2);
            this.f35019a.writeUInt32NoTag(MapEntryLite.m55626a(c4368b, str2, obj));
            MapEntryLite.m55622e(this.f35019a, c4368b, str2, obj);
        }
    }

    /* renamed from: U */
    public final void m55184U(int i, Object obj) {
        if (obj instanceof String) {
            this.f35019a.writeString(i, (String) obj);
        } else {
            this.f35019a.writeBytes(i, (ByteString) obj);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    /* renamed from: a */
    public void mo55183a(int i, List list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f35019a.writeTag(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += CodedOutputStream.computeFloatSizeNoTag(((Float) list.get(i4)).floatValue());
            }
            this.f35019a.writeUInt32NoTag(i3);
            while (i2 < list.size()) {
                this.f35019a.writeFloatNoTag(((Float) list.get(i2)).floatValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f35019a.writeFloat(i, ((Float) list.get(i2)).floatValue());
            i2++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    /* renamed from: b */
    public final void mo55182b(int i, Object obj) {
        if (obj instanceof ByteString) {
            this.f35019a.writeRawMessageSetExtension(i, (ByteString) obj);
        } else {
            this.f35019a.writeMessageSetExtension(i, (MessageLite) obj);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    /* renamed from: c */
    public void mo55181c(int i, int i2) {
        this.f35019a.writeFixed32(i, i2);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    /* renamed from: d */
    public void mo55180d(int i, String str) {
        this.f35019a.writeString(i, str);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    /* renamed from: e */
    public void mo55179e(int i, long j) {
        this.f35019a.writeUInt64(i, j);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    /* renamed from: f */
    public void mo55178f(int i, List list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f35019a.writeTag(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += CodedOutputStream.computeInt32SizeNoTag(((Integer) list.get(i4)).intValue());
            }
            this.f35019a.writeUInt32NoTag(i3);
            while (i2 < list.size()) {
                this.f35019a.writeInt32NoTag(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f35019a.writeInt32(i, ((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    /* renamed from: g */
    public void mo55177g(int i, List list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f35019a.writeTag(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += CodedOutputStream.computeFixed32SizeNoTag(((Integer) list.get(i4)).intValue());
            }
            this.f35019a.writeUInt32NoTag(i3);
            while (i2 < list.size()) {
                this.f35019a.writeFixed32NoTag(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f35019a.writeFixed32(i, ((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    /* renamed from: h */
    public void mo55176h(int i, List list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f35019a.writeTag(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += CodedOutputStream.computeUInt32SizeNoTag(((Integer) list.get(i4)).intValue());
            }
            this.f35019a.writeUInt32NoTag(i3);
            while (i2 < list.size()) {
                this.f35019a.writeUInt32NoTag(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f35019a.writeUInt32(i, ((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    /* renamed from: i */
    public void mo55175i(int i, long j) {
        this.f35019a.writeSInt64(i, j);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    /* renamed from: j */
    public void mo55174j(int i, int i2) {
        this.f35019a.writeUInt32(i, i2);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    /* renamed from: k */
    public void mo55173k(int i, List list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f35019a.writeTag(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += CodedOutputStream.computeUInt64SizeNoTag(((Long) list.get(i4)).longValue());
            }
            this.f35019a.writeUInt32NoTag(i3);
            while (i2 < list.size()) {
                this.f35019a.writeUInt64NoTag(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f35019a.writeUInt64(i, ((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    /* renamed from: l */
    public void mo55172l(int i, long j) {
        this.f35019a.writeFixed64(i, j);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    /* renamed from: m */
    public void mo55171m(int i, boolean z) {
        this.f35019a.writeBool(i, z);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    /* renamed from: n */
    public void mo55170n(int i, int i2) {
        this.f35019a.writeSFixed32(i, i2);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    /* renamed from: o */
    public void mo55169o(int i) {
        this.f35019a.writeTag(i, 3);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    /* renamed from: p */
    public void mo55168p(int i, List list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f35019a.writeTag(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += CodedOutputStream.computeFixed64SizeNoTag(((Long) list.get(i4)).longValue());
            }
            this.f35019a.writeUInt32NoTag(i3);
            while (i2 < list.size()) {
                this.f35019a.writeFixed64NoTag(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f35019a.writeFixed64(i, ((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    /* renamed from: q */
    public void mo55167q(int i) {
        this.f35019a.writeTag(i, 4);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    /* renamed from: r */
    public void mo55166r(int i, List list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f35019a.writeTag(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += CodedOutputStream.computeSInt32SizeNoTag(((Integer) list.get(i4)).intValue());
            }
            this.f35019a.writeUInt32NoTag(i3);
            while (i2 < list.size()) {
                this.f35019a.writeSInt32NoTag(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f35019a.writeSInt32(i, ((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    /* renamed from: s */
    public void mo55165s(int i, List list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f35019a.writeTag(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += CodedOutputStream.computeDoubleSizeNoTag(((Double) list.get(i4)).doubleValue());
            }
            this.f35019a.writeUInt32NoTag(i3);
            while (i2 < list.size()) {
                this.f35019a.writeDoubleNoTag(((Double) list.get(i2)).doubleValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f35019a.writeDouble(i, ((Double) list.get(i2)).doubleValue());
            i2++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    /* renamed from: t */
    public void mo55164t(int i, List list) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            this.f35019a.writeBytes(i, (ByteString) list.get(i2));
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    /* renamed from: u */
    public void mo55163u(int i, List list) {
        int i2 = 0;
        if (list instanceof LazyStringList) {
            LazyStringList lazyStringList = (LazyStringList) list;
            while (i2 < list.size()) {
                m55184U(i, lazyStringList.getRaw(i2));
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f35019a.writeString(i, (String) list.get(i2));
            i2++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    /* renamed from: v */
    public void mo55162v(int i, long j) {
        this.f35019a.writeSFixed64(i, j);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    /* renamed from: w */
    public void mo55161w(int i, List list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f35019a.writeTag(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += CodedOutputStream.computeSInt64SizeNoTag(((Long) list.get(i4)).longValue());
            }
            this.f35019a.writeUInt32NoTag(i3);
            while (i2 < list.size()) {
                this.f35019a.writeSInt64NoTag(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f35019a.writeSInt64(i, ((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void writeInt32(int i, int i2) {
        this.f35019a.writeInt32(i, i2);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    /* renamed from: x */
    public void mo55160x(int i, List list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f35019a.writeTag(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += CodedOutputStream.computeEnumSizeNoTag(((Integer) list.get(i4)).intValue());
            }
            this.f35019a.writeUInt32NoTag(i3);
            while (i2 < list.size()) {
                this.f35019a.writeEnumNoTag(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f35019a.writeEnum(i, ((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    /* renamed from: y */
    public void mo55159y(int i, double d) {
        this.f35019a.writeDouble(i, d);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    /* renamed from: z */
    public void mo55158z(int i, List list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f35019a.writeTag(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += CodedOutputStream.computeSFixed64SizeNoTag(((Long) list.get(i4)).longValue());
            }
            this.f35019a.writeUInt32NoTag(i3);
            while (i2 < list.size()) {
                this.f35019a.writeSFixed64NoTag(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f35019a.writeSFixed64(i, ((Long) list.get(i2)).longValue());
            i2++;
        }
    }
}