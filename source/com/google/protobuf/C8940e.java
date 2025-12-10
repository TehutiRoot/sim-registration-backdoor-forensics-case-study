package com.google.protobuf;

import com.google.protobuf.MapEntryLite;
import com.google.protobuf.WireFormat;
import com.google.protobuf.Writer;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.protobuf.e */
/* loaded from: classes4.dex */
public final class C8940e implements Writer {

    /* renamed from: a */
    public final CodedOutputStream f57464a;

    /* renamed from: com.google.protobuf.e$a */
    /* loaded from: classes4.dex */
    public static /* synthetic */ class C8941a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f57465a;

        static {
            int[] iArr = new int[WireFormat.FieldType.values().length];
            f57465a = iArr;
            try {
                iArr[WireFormat.FieldType.BOOL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f57465a[WireFormat.FieldType.FIXED32.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f57465a[WireFormat.FieldType.INT32.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f57465a[WireFormat.FieldType.SFIXED32.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f57465a[WireFormat.FieldType.SINT32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f57465a[WireFormat.FieldType.UINT32.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f57465a[WireFormat.FieldType.FIXED64.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f57465a[WireFormat.FieldType.INT64.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f57465a[WireFormat.FieldType.SFIXED64.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f57465a[WireFormat.FieldType.SINT64.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f57465a[WireFormat.FieldType.UINT64.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f57465a[WireFormat.FieldType.STRING.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    public C8940e(CodedOutputStream codedOutputStream) {
        CodedOutputStream codedOutputStream2 = (CodedOutputStream) Internal.m35785b(codedOutputStream, "output");
        this.f57464a = codedOutputStream2;
        codedOutputStream2.f57258a = this;
    }

    /* renamed from: O */
    public static C8940e m35346O(CodedOutputStream codedOutputStream) {
        C8940e c8940e = codedOutputStream.f57258a;
        if (c8940e != null) {
            return c8940e;
        }
        return new C8940e(codedOutputStream);
    }

    @Override // com.google.protobuf.Writer
    /* renamed from: A */
    public Writer.FieldOrder mo35360A() {
        return Writer.FieldOrder.ASCENDING;
    }

    @Override // com.google.protobuf.Writer
    /* renamed from: B */
    public void mo35359B(int i, long j) {
        this.f57464a.writeInt64(i, j);
    }

    @Override // com.google.protobuf.Writer
    /* renamed from: C */
    public void mo35358C(int i, List list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f57464a.writeTag(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += CodedOutputStream.computeSFixed32SizeNoTag(((Integer) list.get(i4)).intValue());
            }
            this.f57464a.writeUInt32NoTag(i3);
            while (i2 < list.size()) {
                this.f57464a.writeSFixed32NoTag(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f57464a.writeSFixed32(i, ((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    @Override // com.google.protobuf.Writer
    /* renamed from: D */
    public void mo35357D(int i, List list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f57464a.writeTag(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += CodedOutputStream.computeBoolSizeNoTag(((Boolean) list.get(i4)).booleanValue());
            }
            this.f57464a.writeUInt32NoTag(i3);
            while (i2 < list.size()) {
                this.f57464a.writeBoolNoTag(((Boolean) list.get(i2)).booleanValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f57464a.writeBool(i, ((Boolean) list.get(i2)).booleanValue());
            i2++;
        }
    }

    @Override // com.google.protobuf.Writer
    /* renamed from: E */
    public void mo35356E(int i, float f) {
        this.f57464a.writeFloat(i, f);
    }

    @Override // com.google.protobuf.Writer
    /* renamed from: F */
    public void mo35355F(int i, int i2) {
        this.f57464a.writeEnum(i, i2);
    }

    @Override // com.google.protobuf.Writer
    /* renamed from: G */
    public void mo35354G(int i, List list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f57464a.writeTag(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += CodedOutputStream.computeInt64SizeNoTag(((Long) list.get(i4)).longValue());
            }
            this.f57464a.writeUInt32NoTag(i3);
            while (i2 < list.size()) {
                this.f57464a.writeInt64NoTag(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f57464a.writeInt64(i, ((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    @Override // com.google.protobuf.Writer
    /* renamed from: H */
    public void mo35353H(int i, int i2) {
        this.f57464a.writeSInt32(i, i2);
    }

    @Override // com.google.protobuf.Writer
    /* renamed from: I */
    public void mo35352I(int i, ByteString byteString) {
        this.f57464a.writeBytes(i, byteString);
    }

    @Override // com.google.protobuf.Writer
    /* renamed from: J */
    public void mo35351J(int i, MapEntryLite.C8897b c8897b, Map map) {
        if (this.f57464a.m37002i()) {
            m35342S(i, c8897b, map);
            return;
        }
        for (Map.Entry entry : map.entrySet()) {
            this.f57464a.writeTag(i, 2);
            this.f57464a.writeUInt32NoTag(MapEntryLite.m35738a(c8897b, entry.getKey(), entry.getValue()));
            MapEntryLite.m35734e(this.f57464a, c8897b, entry.getKey(), entry.getValue());
        }
    }

    @Override // com.google.protobuf.Writer
    /* renamed from: K */
    public void mo35350K(int i, List list, InterfaceC8961t interfaceC8961t) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            mo35347N(i, list.get(i2), interfaceC8961t);
        }
    }

    @Override // com.google.protobuf.Writer
    /* renamed from: L */
    public void mo35349L(int i, Object obj, InterfaceC8961t interfaceC8961t) {
        this.f57464a.m36999m(i, (MessageLite) obj, interfaceC8961t);
    }

    @Override // com.google.protobuf.Writer
    /* renamed from: M */
    public void mo35348M(int i, List list, InterfaceC8961t interfaceC8961t) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            mo35349L(i, list.get(i2), interfaceC8961t);
        }
    }

    @Override // com.google.protobuf.Writer
    /* renamed from: N */
    public void mo35347N(int i, Object obj, InterfaceC8961t interfaceC8961t) {
        this.f57464a.mo36984o(i, (MessageLite) obj, interfaceC8961t);
    }

    /* renamed from: P */
    public final void m35345P(int i, boolean z, Object obj, MapEntryLite.C8897b c8897b) {
        this.f57464a.writeTag(i, 2);
        this.f57464a.writeUInt32NoTag(MapEntryLite.m35738a(c8897b, Boolean.valueOf(z), obj));
        MapEntryLite.m35734e(this.f57464a, c8897b, Boolean.valueOf(z), obj);
    }

    /* renamed from: Q */
    public final void m35344Q(int i, MapEntryLite.C8897b c8897b, Map map) {
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
            this.f57464a.writeTag(i, 2);
            this.f57464a.writeUInt32NoTag(MapEntryLite.m35738a(c8897b, Integer.valueOf(i4), obj));
            MapEntryLite.m35734e(this.f57464a, c8897b, Integer.valueOf(i4), obj);
        }
    }

    /* renamed from: R */
    public final void m35343R(int i, MapEntryLite.C8897b c8897b, Map map) {
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
            this.f57464a.writeTag(i, 2);
            this.f57464a.writeUInt32NoTag(MapEntryLite.m35738a(c8897b, Long.valueOf(j), obj));
            MapEntryLite.m35734e(this.f57464a, c8897b, Long.valueOf(j), obj);
        }
    }

    /* renamed from: S */
    public final void m35342S(int i, MapEntryLite.C8897b c8897b, Map map) {
        switch (C8941a.f57465a[c8897b.f57388a.ordinal()]) {
            case 1:
                Object obj = map.get(Boolean.FALSE);
                if (obj != null) {
                    m35345P(i, false, obj, c8897b);
                }
                Object obj2 = map.get(Boolean.TRUE);
                if (obj2 != null) {
                    m35345P(i, true, obj2, c8897b);
                    return;
                }
                return;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                m35344Q(i, c8897b, map);
                return;
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                m35343R(i, c8897b, map);
                return;
            case 12:
                m35341T(i, c8897b, map);
                return;
            default:
                throw new IllegalArgumentException("does not support key type: " + c8897b.f57388a);
        }
    }

    /* renamed from: T */
    public final void m35341T(int i, MapEntryLite.C8897b c8897b, Map map) {
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
            this.f57464a.writeTag(i, 2);
            this.f57464a.writeUInt32NoTag(MapEntryLite.m35738a(c8897b, str2, obj));
            MapEntryLite.m35734e(this.f57464a, c8897b, str2, obj);
        }
    }

    /* renamed from: U */
    public final void m35340U(int i, Object obj) {
        if (obj instanceof String) {
            this.f57464a.writeString(i, (String) obj);
        } else {
            this.f57464a.writeBytes(i, (ByteString) obj);
        }
    }

    @Override // com.google.protobuf.Writer
    /* renamed from: a */
    public void mo35339a(int i, List list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f57464a.writeTag(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += CodedOutputStream.computeFloatSizeNoTag(((Float) list.get(i4)).floatValue());
            }
            this.f57464a.writeUInt32NoTag(i3);
            while (i2 < list.size()) {
                this.f57464a.writeFloatNoTag(((Float) list.get(i2)).floatValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f57464a.writeFloat(i, ((Float) list.get(i2)).floatValue());
            i2++;
        }
    }

    @Override // com.google.protobuf.Writer
    /* renamed from: b */
    public final void mo35338b(int i, Object obj) {
        if (obj instanceof ByteString) {
            this.f57464a.writeRawMessageSetExtension(i, (ByteString) obj);
        } else {
            this.f57464a.writeMessageSetExtension(i, (MessageLite) obj);
        }
    }

    @Override // com.google.protobuf.Writer
    /* renamed from: c */
    public void mo35337c(int i, int i2) {
        this.f57464a.writeFixed32(i, i2);
    }

    @Override // com.google.protobuf.Writer
    /* renamed from: d */
    public void mo35336d(int i, String str) {
        this.f57464a.writeString(i, str);
    }

    @Override // com.google.protobuf.Writer
    /* renamed from: e */
    public void mo35335e(int i, long j) {
        this.f57464a.writeUInt64(i, j);
    }

    @Override // com.google.protobuf.Writer
    /* renamed from: f */
    public void mo35334f(int i, List list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f57464a.writeTag(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += CodedOutputStream.computeInt32SizeNoTag(((Integer) list.get(i4)).intValue());
            }
            this.f57464a.writeUInt32NoTag(i3);
            while (i2 < list.size()) {
                this.f57464a.writeInt32NoTag(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f57464a.writeInt32(i, ((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    @Override // com.google.protobuf.Writer
    /* renamed from: g */
    public void mo35333g(int i, List list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f57464a.writeTag(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += CodedOutputStream.computeFixed32SizeNoTag(((Integer) list.get(i4)).intValue());
            }
            this.f57464a.writeUInt32NoTag(i3);
            while (i2 < list.size()) {
                this.f57464a.writeFixed32NoTag(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f57464a.writeFixed32(i, ((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    @Override // com.google.protobuf.Writer
    /* renamed from: h */
    public void mo35332h(int i, List list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f57464a.writeTag(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += CodedOutputStream.computeUInt32SizeNoTag(((Integer) list.get(i4)).intValue());
            }
            this.f57464a.writeUInt32NoTag(i3);
            while (i2 < list.size()) {
                this.f57464a.writeUInt32NoTag(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f57464a.writeUInt32(i, ((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    @Override // com.google.protobuf.Writer
    /* renamed from: i */
    public void mo35331i(int i, long j) {
        this.f57464a.writeSInt64(i, j);
    }

    @Override // com.google.protobuf.Writer
    /* renamed from: j */
    public void mo35330j(int i, int i2) {
        this.f57464a.writeUInt32(i, i2);
    }

    @Override // com.google.protobuf.Writer
    /* renamed from: k */
    public void mo35329k(int i, List list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f57464a.writeTag(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += CodedOutputStream.computeUInt64SizeNoTag(((Long) list.get(i4)).longValue());
            }
            this.f57464a.writeUInt32NoTag(i3);
            while (i2 < list.size()) {
                this.f57464a.writeUInt64NoTag(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f57464a.writeUInt64(i, ((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    @Override // com.google.protobuf.Writer
    /* renamed from: l */
    public void mo35328l(int i, long j) {
        this.f57464a.writeFixed64(i, j);
    }

    @Override // com.google.protobuf.Writer
    /* renamed from: m */
    public void mo35327m(int i, boolean z) {
        this.f57464a.writeBool(i, z);
    }

    @Override // com.google.protobuf.Writer
    /* renamed from: n */
    public void mo35326n(int i, int i2) {
        this.f57464a.writeSFixed32(i, i2);
    }

    @Override // com.google.protobuf.Writer
    /* renamed from: o */
    public void mo35325o(int i) {
        this.f57464a.writeTag(i, 3);
    }

    @Override // com.google.protobuf.Writer
    /* renamed from: p */
    public void mo35324p(int i, List list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f57464a.writeTag(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += CodedOutputStream.computeFixed64SizeNoTag(((Long) list.get(i4)).longValue());
            }
            this.f57464a.writeUInt32NoTag(i3);
            while (i2 < list.size()) {
                this.f57464a.writeFixed64NoTag(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f57464a.writeFixed64(i, ((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    @Override // com.google.protobuf.Writer
    /* renamed from: q */
    public void mo35323q(int i) {
        this.f57464a.writeTag(i, 4);
    }

    @Override // com.google.protobuf.Writer
    /* renamed from: r */
    public void mo35322r(int i, List list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f57464a.writeTag(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += CodedOutputStream.computeSInt32SizeNoTag(((Integer) list.get(i4)).intValue());
            }
            this.f57464a.writeUInt32NoTag(i3);
            while (i2 < list.size()) {
                this.f57464a.writeSInt32NoTag(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f57464a.writeSInt32(i, ((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    @Override // com.google.protobuf.Writer
    /* renamed from: s */
    public void mo35321s(int i, List list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f57464a.writeTag(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += CodedOutputStream.computeDoubleSizeNoTag(((Double) list.get(i4)).doubleValue());
            }
            this.f57464a.writeUInt32NoTag(i3);
            while (i2 < list.size()) {
                this.f57464a.writeDoubleNoTag(((Double) list.get(i2)).doubleValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f57464a.writeDouble(i, ((Double) list.get(i2)).doubleValue());
            i2++;
        }
    }

    @Override // com.google.protobuf.Writer
    /* renamed from: t */
    public void mo35320t(int i, List list) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            this.f57464a.writeBytes(i, (ByteString) list.get(i2));
        }
    }

    @Override // com.google.protobuf.Writer
    /* renamed from: u */
    public void mo35319u(int i, List list) {
        int i2 = 0;
        if (list instanceof LazyStringList) {
            LazyStringList lazyStringList = (LazyStringList) list;
            while (i2 < list.size()) {
                m35340U(i, lazyStringList.getRaw(i2));
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f57464a.writeString(i, (String) list.get(i2));
            i2++;
        }
    }

    @Override // com.google.protobuf.Writer
    /* renamed from: v */
    public void mo35318v(int i, long j) {
        this.f57464a.writeSFixed64(i, j);
    }

    @Override // com.google.protobuf.Writer
    /* renamed from: w */
    public void mo35317w(int i, List list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f57464a.writeTag(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += CodedOutputStream.computeSInt64SizeNoTag(((Long) list.get(i4)).longValue());
            }
            this.f57464a.writeUInt32NoTag(i3);
            while (i2 < list.size()) {
                this.f57464a.writeSInt64NoTag(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f57464a.writeSInt64(i, ((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    @Override // com.google.protobuf.Writer
    public void writeInt32(int i, int i2) {
        this.f57464a.writeInt32(i, i2);
    }

    @Override // com.google.protobuf.Writer
    /* renamed from: x */
    public void mo35316x(int i, List list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f57464a.writeTag(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += CodedOutputStream.computeEnumSizeNoTag(((Integer) list.get(i4)).intValue());
            }
            this.f57464a.writeUInt32NoTag(i3);
            while (i2 < list.size()) {
                this.f57464a.writeEnumNoTag(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f57464a.writeEnum(i, ((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    @Override // com.google.protobuf.Writer
    /* renamed from: y */
    public void mo35315y(int i, double d) {
        this.f57464a.writeDouble(i, d);
    }

    @Override // com.google.protobuf.Writer
    /* renamed from: z */
    public void mo35314z(int i, List list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f57464a.writeTag(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += CodedOutputStream.computeSFixed64SizeNoTag(((Long) list.get(i4)).longValue());
            }
            this.f57464a.writeUInt32NoTag(i3);
            while (i2 < list.size()) {
                this.f57464a.writeSFixed64NoTag(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f57464a.writeSFixed64(i, ((Long) list.get(i2)).longValue());
            i2++;
        }
    }
}
