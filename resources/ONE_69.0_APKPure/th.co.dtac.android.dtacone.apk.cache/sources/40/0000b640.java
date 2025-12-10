package com.google.protobuf;

import com.google.protobuf.Internal;
import com.google.protobuf.LazyField;
import com.google.protobuf.MessageLite;
import com.google.protobuf.WireFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
public final class FieldSet {

    /* renamed from: d */
    public static final FieldSet f57341d = new FieldSet(true);

    /* renamed from: a */
    public final AbstractC8952v f57342a;

    /* renamed from: b */
    public boolean f57343b;

    /* renamed from: c */
    public boolean f57344c;

    /* loaded from: classes4.dex */
    public interface FieldDescriptorLite<T extends FieldDescriptorLite<T>> extends Comparable<T> {
        Internal.EnumLiteMap<?> getEnumType();

        WireFormat.JavaType getLiteJavaType();

        WireFormat.FieldType getLiteType();

        int getNumber();

        MessageLite.Builder internalMergeFrom(MessageLite.Builder builder, MessageLite messageLite);

        boolean isPacked();

        boolean isRepeated();
    }

    /* renamed from: com.google.protobuf.FieldSet$a */
    /* loaded from: classes4.dex */
    public static /* synthetic */ class C8868a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f57345a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f57346b;

        static {
            int[] iArr = new int[WireFormat.FieldType.values().length];
            f57346b = iArr;
            try {
                iArr[WireFormat.FieldType.DOUBLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f57346b[WireFormat.FieldType.FLOAT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f57346b[WireFormat.FieldType.INT64.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f57346b[WireFormat.FieldType.UINT64.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f57346b[WireFormat.FieldType.INT32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f57346b[WireFormat.FieldType.FIXED64.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f57346b[WireFormat.FieldType.FIXED32.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f57346b[WireFormat.FieldType.BOOL.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f57346b[WireFormat.FieldType.GROUP.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f57346b[WireFormat.FieldType.MESSAGE.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f57346b[WireFormat.FieldType.STRING.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f57346b[WireFormat.FieldType.BYTES.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f57346b[WireFormat.FieldType.UINT32.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f57346b[WireFormat.FieldType.SFIXED32.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f57346b[WireFormat.FieldType.SFIXED64.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f57346b[WireFormat.FieldType.SINT32.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f57346b[WireFormat.FieldType.SINT64.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f57346b[WireFormat.FieldType.ENUM.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            int[] iArr2 = new int[WireFormat.JavaType.values().length];
            f57345a = iArr2;
            try {
                iArr2[WireFormat.JavaType.INT.ordinal()] = 1;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f57345a[WireFormat.JavaType.LONG.ordinal()] = 2;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f57345a[WireFormat.JavaType.FLOAT.ordinal()] = 3;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f57345a[WireFormat.JavaType.DOUBLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f57345a[WireFormat.JavaType.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                f57345a[WireFormat.JavaType.STRING.ordinal()] = 6;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                f57345a[WireFormat.JavaType.BYTE_STRING.ordinal()] = 7;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                f57345a[WireFormat.JavaType.ENUM.ordinal()] = 8;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                f57345a[WireFormat.JavaType.MESSAGE.ordinal()] = 9;
            } catch (NoSuchFieldError unused27) {
            }
        }
    }

    public FieldSet() {
        this.f57342a = AbstractC8952v.m35032r(16);
    }

    /* renamed from: B */
    public static FieldSet m35872B() {
        return new FieldSet();
    }

    /* renamed from: C */
    public static Object m35871C(CodedInputStream codedInputStream, WireFormat.FieldType fieldType, boolean z) {
        if (z) {
            return WireFormat.m35415b(codedInputStream, fieldType, WireFormat.Utf8Validation.STRICT);
        }
        return WireFormat.m35415b(codedInputStream, fieldType, WireFormat.Utf8Validation.LOOSE);
    }

    /* renamed from: G */
    public static void m35867G(CodedOutputStream codedOutputStream, WireFormat.FieldType fieldType, int i, Object obj) {
        if (fieldType == WireFormat.FieldType.GROUP) {
            codedOutputStream.writeGroup(i, (MessageLite) obj);
            return;
        }
        codedOutputStream.writeTag(i, m35849p(fieldType, false));
        m35866H(codedOutputStream, fieldType, obj);
    }

    /* renamed from: H */
    public static void m35866H(CodedOutputStream codedOutputStream, WireFormat.FieldType fieldType, Object obj) {
        switch (C8868a.f57346b[fieldType.ordinal()]) {
            case 1:
                codedOutputStream.writeDoubleNoTag(((Double) obj).doubleValue());
                return;
            case 2:
                codedOutputStream.writeFloatNoTag(((Float) obj).floatValue());
                return;
            case 3:
                codedOutputStream.writeInt64NoTag(((Long) obj).longValue());
                return;
            case 4:
                codedOutputStream.writeUInt64NoTag(((Long) obj).longValue());
                return;
            case 5:
                codedOutputStream.writeInt32NoTag(((Integer) obj).intValue());
                return;
            case 6:
                codedOutputStream.writeFixed64NoTag(((Long) obj).longValue());
                return;
            case 7:
                codedOutputStream.writeFixed32NoTag(((Integer) obj).intValue());
                return;
            case 8:
                codedOutputStream.writeBoolNoTag(((Boolean) obj).booleanValue());
                return;
            case 9:
                codedOutputStream.writeGroupNoTag((MessageLite) obj);
                return;
            case 10:
                codedOutputStream.writeMessageNoTag((MessageLite) obj);
                return;
            case 11:
                if (obj instanceof ByteString) {
                    codedOutputStream.writeBytesNoTag((ByteString) obj);
                    return;
                } else {
                    codedOutputStream.writeStringNoTag((String) obj);
                    return;
                }
            case 12:
                if (obj instanceof ByteString) {
                    codedOutputStream.writeBytesNoTag((ByteString) obj);
                    return;
                } else {
                    codedOutputStream.writeByteArrayNoTag((byte[]) obj);
                    return;
                }
            case 13:
                codedOutputStream.writeUInt32NoTag(((Integer) obj).intValue());
                return;
            case 14:
                codedOutputStream.writeSFixed32NoTag(((Integer) obj).intValue());
                return;
            case 15:
                codedOutputStream.writeSFixed64NoTag(((Long) obj).longValue());
                return;
            case 16:
                codedOutputStream.writeSInt32NoTag(((Integer) obj).intValue());
                return;
            case 17:
                codedOutputStream.writeSInt64NoTag(((Long) obj).longValue());
                return;
            case 18:
                if (obj instanceof Internal.EnumLite) {
                    codedOutputStream.writeEnumNoTag(((Internal.EnumLite) obj).getNumber());
                    return;
                } else {
                    codedOutputStream.writeEnumNoTag(((Integer) obj).intValue());
                    return;
                }
            default:
                return;
        }
    }

    /* renamed from: I */
    public static void m35865I(FieldDescriptorLite fieldDescriptorLite, Object obj, CodedOutputStream codedOutputStream) {
        WireFormat.FieldType liteType = fieldDescriptorLite.getLiteType();
        int number = fieldDescriptorLite.getNumber();
        if (fieldDescriptorLite.isRepeated()) {
            List<Object> list = (List) obj;
            if (fieldDescriptorLite.isPacked()) {
                codedOutputStream.writeTag(number, 2);
                int i = 0;
                for (Object obj2 : list) {
                    i += m35859f(liteType, obj2);
                }
                codedOutputStream.writeUInt32NoTag(i);
                for (Object obj3 : list) {
                    m35866H(codedOutputStream, liteType, obj3);
                }
                return;
            }
            for (Object obj4 : list) {
                m35867G(codedOutputStream, liteType, number, obj4);
            }
        } else if (obj instanceof LazyField) {
            m35867G(codedOutputStream, liteType, number, ((LazyField) obj).getValue());
        } else {
            m35867G(codedOutputStream, liteType, number, obj);
        }
    }

    /* renamed from: d */
    public static Object m35861d(Object obj) {
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            byte[] bArr2 = new byte[bArr.length];
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            return bArr2;
        }
        return obj;
    }

    /* renamed from: e */
    public static int m35860e(WireFormat.FieldType fieldType, int i, Object obj) {
        int computeTagSize = CodedOutputStream.computeTagSize(i);
        if (fieldType == WireFormat.FieldType.GROUP) {
            computeTagSize *= 2;
        }
        return computeTagSize + m35859f(fieldType, obj);
    }

    /* renamed from: f */
    public static int m35859f(WireFormat.FieldType fieldType, Object obj) {
        switch (C8868a.f57346b[fieldType.ordinal()]) {
            case 1:
                return CodedOutputStream.computeDoubleSizeNoTag(((Double) obj).doubleValue());
            case 2:
                return CodedOutputStream.computeFloatSizeNoTag(((Float) obj).floatValue());
            case 3:
                return CodedOutputStream.computeInt64SizeNoTag(((Long) obj).longValue());
            case 4:
                return CodedOutputStream.computeUInt64SizeNoTag(((Long) obj).longValue());
            case 5:
                return CodedOutputStream.computeInt32SizeNoTag(((Integer) obj).intValue());
            case 6:
                return CodedOutputStream.computeFixed64SizeNoTag(((Long) obj).longValue());
            case 7:
                return CodedOutputStream.computeFixed32SizeNoTag(((Integer) obj).intValue());
            case 8:
                return CodedOutputStream.computeBoolSizeNoTag(((Boolean) obj).booleanValue());
            case 9:
                return CodedOutputStream.computeGroupSizeNoTag((MessageLite) obj);
            case 10:
                if (obj instanceof LazyField) {
                    return CodedOutputStream.computeLazyFieldSizeNoTag((LazyField) obj);
                }
                return CodedOutputStream.computeMessageSizeNoTag((MessageLite) obj);
            case 11:
                if (obj instanceof ByteString) {
                    return CodedOutputStream.computeBytesSizeNoTag((ByteString) obj);
                }
                return CodedOutputStream.computeStringSizeNoTag((String) obj);
            case 12:
                if (obj instanceof ByteString) {
                    return CodedOutputStream.computeBytesSizeNoTag((ByteString) obj);
                }
                return CodedOutputStream.computeByteArraySizeNoTag((byte[]) obj);
            case 13:
                return CodedOutputStream.computeUInt32SizeNoTag(((Integer) obj).intValue());
            case 14:
                return CodedOutputStream.computeSFixed32SizeNoTag(((Integer) obj).intValue());
            case 15:
                return CodedOutputStream.computeSFixed64SizeNoTag(((Long) obj).longValue());
            case 16:
                return CodedOutputStream.computeSInt32SizeNoTag(((Integer) obj).intValue());
            case 17:
                return CodedOutputStream.computeSInt64SizeNoTag(((Long) obj).longValue());
            case 18:
                if (obj instanceof Internal.EnumLite) {
                    return CodedOutputStream.computeEnumSizeNoTag(((Internal.EnumLite) obj).getNumber());
                }
                return CodedOutputStream.computeEnumSizeNoTag(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    /* renamed from: g */
    public static int m35858g(FieldDescriptorLite fieldDescriptorLite, Object obj) {
        WireFormat.FieldType liteType = fieldDescriptorLite.getLiteType();
        int number = fieldDescriptorLite.getNumber();
        if (fieldDescriptorLite.isRepeated()) {
            int i = 0;
            if (fieldDescriptorLite.isPacked()) {
                for (Object obj2 : (List) obj) {
                    i += m35859f(liteType, obj2);
                }
                return CodedOutputStream.computeTagSize(number) + i + CodedOutputStream.computeUInt32SizeNoTag(i);
            }
            for (Object obj3 : (List) obj) {
                i += m35860e(liteType, number, obj3);
            }
            return i;
        }
        return m35860e(liteType, number, obj);
    }

    /* renamed from: i */
    public static FieldSet m35856i() {
        return f57341d;
    }

    /* renamed from: p */
    public static int m35849p(WireFormat.FieldType fieldType, boolean z) {
        if (z) {
            return 2;
        }
        return fieldType.getWireType();
    }

    /* renamed from: u */
    public static boolean m35844u(Map.Entry entry) {
        FieldDescriptorLite fieldDescriptorLite = (FieldDescriptorLite) entry.getKey();
        if (fieldDescriptorLite.getLiteJavaType() == WireFormat.JavaType.MESSAGE) {
            if (fieldDescriptorLite.isRepeated()) {
                for (Object obj : (List) entry.getValue()) {
                    if (!m35843v(obj)) {
                        return false;
                    }
                }
                return true;
            }
            return m35843v(entry.getValue());
        }
        return true;
    }

    /* renamed from: v */
    public static boolean m35843v(Object obj) {
        if (obj instanceof MessageLiteOrBuilder) {
            return ((MessageLiteOrBuilder) obj).isInitialized();
        }
        if (obj instanceof LazyField) {
            return true;
        }
        throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
    }

    /* renamed from: w */
    public static boolean m35842w(WireFormat.FieldType fieldType, Object obj) {
        Internal.m35778a(obj);
        switch (C8868a.f57345a[fieldType.getJavaType().ordinal()]) {
            case 1:
                return obj instanceof Integer;
            case 2:
                return obj instanceof Long;
            case 3:
                return obj instanceof Float;
            case 4:
                return obj instanceof Double;
            case 5:
                return obj instanceof Boolean;
            case 6:
                return obj instanceof String;
            case 7:
                if ((obj instanceof ByteString) || (obj instanceof byte[])) {
                    return true;
                }
                return false;
            case 8:
                if ((obj instanceof Integer) || (obj instanceof Internal.EnumLite)) {
                    return true;
                }
                return false;
            case 9:
                if ((obj instanceof MessageLite) || (obj instanceof LazyField)) {
                    return true;
                }
                return false;
            default:
                return false;
        }
    }

    /* renamed from: A */
    public final void m35873A(Map.Entry entry) {
        FieldDescriptorLite fieldDescriptorLite = (FieldDescriptorLite) entry.getKey();
        Object value = entry.getValue();
        if (value instanceof LazyField) {
            value = ((LazyField) value).getValue();
        }
        if (fieldDescriptorLite.isRepeated()) {
            Object m35855j = m35855j(fieldDescriptorLite);
            if (m35855j == null) {
                m35855j = new ArrayList();
            }
            for (Object obj : (List) value) {
                ((List) m35855j).add(m35861d(obj));
            }
            this.f57342a.m35031s(fieldDescriptorLite, m35855j);
        } else if (fieldDescriptorLite.getLiteJavaType() == WireFormat.JavaType.MESSAGE) {
            Object m35855j2 = m35855j(fieldDescriptorLite);
            if (m35855j2 == null) {
                this.f57342a.m35031s(fieldDescriptorLite, m35861d(value));
                return;
            }
            this.f57342a.m35031s(fieldDescriptorLite, fieldDescriptorLite.internalMergeFrom(((MessageLite) m35855j2).toBuilder(), (MessageLite) value).build());
        } else {
            this.f57342a.m35031s(fieldDescriptorLite, m35861d(value));
        }
    }

    /* renamed from: D */
    public void m35870D(FieldDescriptorLite fieldDescriptorLite, Object obj) {
        if (fieldDescriptorLite.isRepeated()) {
            if (obj instanceof List) {
                ArrayList<Object> arrayList = new ArrayList();
                arrayList.addAll((List) obj);
                for (Object obj2 : arrayList) {
                    m35868F(fieldDescriptorLite, obj2);
                }
                obj = arrayList;
            } else {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
        } else {
            m35868F(fieldDescriptorLite, obj);
        }
        if (obj instanceof LazyField) {
            this.f57344c = true;
        }
        this.f57342a.m35031s(fieldDescriptorLite, obj);
    }

    /* renamed from: E */
    public void m35869E(FieldDescriptorLite fieldDescriptorLite, int i, Object obj) {
        if (fieldDescriptorLite.isRepeated()) {
            Object m35855j = m35855j(fieldDescriptorLite);
            if (m35855j != null) {
                m35868F(fieldDescriptorLite, obj);
                ((List) m35855j).set(i, obj);
                return;
            }
            throw new IndexOutOfBoundsException();
        }
        throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
    }

    /* renamed from: F */
    public final void m35868F(FieldDescriptorLite fieldDescriptorLite, Object obj) {
        if (m35842w(fieldDescriptorLite.getLiteType(), obj)) {
            return;
        }
        throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(fieldDescriptorLite.getNumber()), fieldDescriptorLite.getLiteType().getJavaType(), obj.getClass().getName()));
    }

    /* renamed from: a */
    public void m35864a(FieldDescriptorLite fieldDescriptorLite, Object obj) {
        List list;
        if (fieldDescriptorLite.isRepeated()) {
            m35868F(fieldDescriptorLite, obj);
            Object m35855j = m35855j(fieldDescriptorLite);
            if (m35855j == null) {
                list = new ArrayList();
                this.f57342a.m35031s(fieldDescriptorLite, list);
            } else {
                list = (List) m35855j;
            }
            list.add(obj);
            return;
        }
        throw new IllegalArgumentException("addRepeatedField() can only be called on repeated fields.");
    }

    /* renamed from: b */
    public void m35863b(FieldDescriptorLite fieldDescriptorLite) {
        this.f57342a.remove(fieldDescriptorLite);
        if (this.f57342a.isEmpty()) {
            this.f57344c = false;
        }
    }

    /* renamed from: c */
    public FieldSet clone() {
        FieldSet m35872B = m35872B();
        for (int i = 0; i < this.f57342a.m35037l(); i++) {
            Map.Entry m35038k = this.f57342a.m35038k(i);
            m35872B.m35870D((FieldDescriptorLite) m35038k.getKey(), m35038k.getValue());
        }
        for (Map.Entry entry : this.f57342a.m35035n()) {
            m35872B.m35870D((FieldDescriptorLite) entry.getKey(), entry.getValue());
        }
        m35872B.f57344c = this.f57344c;
        return m35872B;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FieldSet)) {
            return false;
        }
        return this.f57342a.equals(((FieldSet) obj).f57342a);
    }

    /* renamed from: h */
    public Iterator m35857h() {
        if (this.f57344c) {
            return new LazyField.C8881c(this.f57342a.m35040i().iterator());
        }
        return this.f57342a.m35040i().iterator();
    }

    public int hashCode() {
        return this.f57342a.hashCode();
    }

    /* renamed from: j */
    public Object m35855j(FieldDescriptorLite fieldDescriptorLite) {
        Object obj = this.f57342a.get(fieldDescriptorLite);
        if (obj instanceof LazyField) {
            return ((LazyField) obj).getValue();
        }
        return obj;
    }

    /* renamed from: k */
    public int m35854k() {
        int i = 0;
        for (int i2 = 0; i2 < this.f57342a.m35037l(); i2++) {
            i += m35853l(this.f57342a.m35038k(i2));
        }
        for (Map.Entry entry : this.f57342a.m35035n()) {
            i += m35853l(entry);
        }
        return i;
    }

    /* renamed from: l */
    public final int m35853l(Map.Entry entry) {
        FieldDescriptorLite fieldDescriptorLite = (FieldDescriptorLite) entry.getKey();
        Object value = entry.getValue();
        if (fieldDescriptorLite.getLiteJavaType() == WireFormat.JavaType.MESSAGE && !fieldDescriptorLite.isRepeated() && !fieldDescriptorLite.isPacked()) {
            if (value instanceof LazyField) {
                return CodedOutputStream.computeLazyFieldMessageSetExtensionSize(((FieldDescriptorLite) entry.getKey()).getNumber(), (LazyField) value);
            }
            return CodedOutputStream.computeMessageSetExtensionSize(((FieldDescriptorLite) entry.getKey()).getNumber(), (MessageLite) value);
        }
        return m35858g(fieldDescriptorLite, value);
    }

    /* renamed from: m */
    public Object m35852m(FieldDescriptorLite fieldDescriptorLite, int i) {
        if (fieldDescriptorLite.isRepeated()) {
            Object m35855j = m35855j(fieldDescriptorLite);
            if (m35855j != null) {
                return ((List) m35855j).get(i);
            }
            throw new IndexOutOfBoundsException();
        }
        throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
    }

    /* renamed from: n */
    public int m35851n(FieldDescriptorLite fieldDescriptorLite) {
        if (fieldDescriptorLite.isRepeated()) {
            Object m35855j = m35855j(fieldDescriptorLite);
            if (m35855j == null) {
                return 0;
            }
            return ((List) m35855j).size();
        }
        throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
    }

    /* renamed from: o */
    public int m35850o() {
        int i = 0;
        for (int i2 = 0; i2 < this.f57342a.m35037l(); i2++) {
            Map.Entry m35038k = this.f57342a.m35038k(i2);
            i += m35858g((FieldDescriptorLite) m35038k.getKey(), m35038k.getValue());
        }
        for (Map.Entry entry : this.f57342a.m35035n()) {
            i += m35858g((FieldDescriptorLite) entry.getKey(), entry.getValue());
        }
        return i;
    }

    /* renamed from: q */
    public boolean m35848q(FieldDescriptorLite fieldDescriptorLite) {
        if (!fieldDescriptorLite.isRepeated()) {
            if (this.f57342a.get(fieldDescriptorLite) != null) {
                return true;
            }
            return false;
        }
        throw new IllegalArgumentException("hasField() can only be called on non-repeated fields.");
    }

    /* renamed from: r */
    public boolean m35847r() {
        return this.f57342a.isEmpty();
    }

    /* renamed from: s */
    public boolean m35846s() {
        return this.f57343b;
    }

    /* renamed from: t */
    public boolean m35845t() {
        for (int i = 0; i < this.f57342a.m35037l(); i++) {
            if (!m35844u(this.f57342a.m35038k(i))) {
                return false;
            }
        }
        for (Map.Entry entry : this.f57342a.m35035n()) {
            if (!m35844u(entry)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: x */
    public Iterator m35841x() {
        if (this.f57344c) {
            return new LazyField.C8881c(this.f57342a.entrySet().iterator());
        }
        return this.f57342a.entrySet().iterator();
    }

    /* renamed from: y */
    public void m35840y() {
        if (this.f57343b) {
            return;
        }
        for (int i = 0; i < this.f57342a.m35037l(); i++) {
            Map.Entry m35038k = this.f57342a.m35038k(i);
            if (m35038k.getValue() instanceof GeneratedMessageLite) {
                ((GeneratedMessageLite) m35038k.getValue()).makeImmutable();
            }
        }
        this.f57342a.mo35029q();
        this.f57343b = true;
    }

    /* renamed from: z */
    public void m35839z(FieldSet fieldSet) {
        for (int i = 0; i < fieldSet.f57342a.m35037l(); i++) {
            m35873A(fieldSet.f57342a.m35038k(i));
        }
        for (Map.Entry entry : fieldSet.f57342a.m35035n()) {
            m35873A(entry);
        }
    }

    public FieldSet(boolean z) {
        this(AbstractC8952v.m35032r(0));
        m35840y();
    }

    public FieldSet(AbstractC8952v abstractC8952v) {
        this.f57342a = abstractC8952v;
        m35840y();
    }
}