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
    public static final FieldSet f57329d = new FieldSet(true);

    /* renamed from: a */
    public final AbstractC8963v f57330a;

    /* renamed from: b */
    public boolean f57331b;

    /* renamed from: c */
    public boolean f57332c;

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
    public static /* synthetic */ class C8879a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f57333a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f57334b;

        static {
            int[] iArr = new int[WireFormat.FieldType.values().length];
            f57334b = iArr;
            try {
                iArr[WireFormat.FieldType.DOUBLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f57334b[WireFormat.FieldType.FLOAT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f57334b[WireFormat.FieldType.INT64.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f57334b[WireFormat.FieldType.UINT64.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f57334b[WireFormat.FieldType.INT32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f57334b[WireFormat.FieldType.FIXED64.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f57334b[WireFormat.FieldType.FIXED32.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f57334b[WireFormat.FieldType.BOOL.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f57334b[WireFormat.FieldType.GROUP.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f57334b[WireFormat.FieldType.MESSAGE.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f57334b[WireFormat.FieldType.STRING.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f57334b[WireFormat.FieldType.BYTES.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f57334b[WireFormat.FieldType.UINT32.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f57334b[WireFormat.FieldType.SFIXED32.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f57334b[WireFormat.FieldType.SFIXED64.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f57334b[WireFormat.FieldType.SINT32.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f57334b[WireFormat.FieldType.SINT64.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f57334b[WireFormat.FieldType.ENUM.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            int[] iArr2 = new int[WireFormat.JavaType.values().length];
            f57333a = iArr2;
            try {
                iArr2[WireFormat.JavaType.INT.ordinal()] = 1;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f57333a[WireFormat.JavaType.LONG.ordinal()] = 2;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f57333a[WireFormat.JavaType.FLOAT.ordinal()] = 3;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f57333a[WireFormat.JavaType.DOUBLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f57333a[WireFormat.JavaType.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                f57333a[WireFormat.JavaType.STRING.ordinal()] = 6;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                f57333a[WireFormat.JavaType.BYTE_STRING.ordinal()] = 7;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                f57333a[WireFormat.JavaType.ENUM.ordinal()] = 8;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                f57333a[WireFormat.JavaType.MESSAGE.ordinal()] = 9;
            } catch (NoSuchFieldError unused27) {
            }
        }
    }

    public FieldSet() {
        this.f57330a = AbstractC8963v.m35040r(16);
    }

    /* renamed from: B */
    public static FieldSet m35880B() {
        return new FieldSet();
    }

    /* renamed from: C */
    public static Object m35879C(CodedInputStream codedInputStream, WireFormat.FieldType fieldType, boolean z) {
        if (z) {
            return WireFormat.m35423b(codedInputStream, fieldType, WireFormat.Utf8Validation.STRICT);
        }
        return WireFormat.m35423b(codedInputStream, fieldType, WireFormat.Utf8Validation.LOOSE);
    }

    /* renamed from: G */
    public static void m35875G(CodedOutputStream codedOutputStream, WireFormat.FieldType fieldType, int i, Object obj) {
        if (fieldType == WireFormat.FieldType.GROUP) {
            codedOutputStream.writeGroup(i, (MessageLite) obj);
            return;
        }
        codedOutputStream.writeTag(i, m35857p(fieldType, false));
        m35874H(codedOutputStream, fieldType, obj);
    }

    /* renamed from: H */
    public static void m35874H(CodedOutputStream codedOutputStream, WireFormat.FieldType fieldType, Object obj) {
        switch (C8879a.f57334b[fieldType.ordinal()]) {
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
    public static void m35873I(FieldDescriptorLite fieldDescriptorLite, Object obj, CodedOutputStream codedOutputStream) {
        WireFormat.FieldType liteType = fieldDescriptorLite.getLiteType();
        int number = fieldDescriptorLite.getNumber();
        if (fieldDescriptorLite.isRepeated()) {
            List<Object> list = (List) obj;
            if (fieldDescriptorLite.isPacked()) {
                codedOutputStream.writeTag(number, 2);
                int i = 0;
                for (Object obj2 : list) {
                    i += m35867f(liteType, obj2);
                }
                codedOutputStream.writeUInt32NoTag(i);
                for (Object obj3 : list) {
                    m35874H(codedOutputStream, liteType, obj3);
                }
                return;
            }
            for (Object obj4 : list) {
                m35875G(codedOutputStream, liteType, number, obj4);
            }
        } else if (obj instanceof LazyField) {
            m35875G(codedOutputStream, liteType, number, ((LazyField) obj).getValue());
        } else {
            m35875G(codedOutputStream, liteType, number, obj);
        }
    }

    /* renamed from: d */
    public static Object m35869d(Object obj) {
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            byte[] bArr2 = new byte[bArr.length];
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            return bArr2;
        }
        return obj;
    }

    /* renamed from: e */
    public static int m35868e(WireFormat.FieldType fieldType, int i, Object obj) {
        int computeTagSize = CodedOutputStream.computeTagSize(i);
        if (fieldType == WireFormat.FieldType.GROUP) {
            computeTagSize *= 2;
        }
        return computeTagSize + m35867f(fieldType, obj);
    }

    /* renamed from: f */
    public static int m35867f(WireFormat.FieldType fieldType, Object obj) {
        switch (C8879a.f57334b[fieldType.ordinal()]) {
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
    public static int m35866g(FieldDescriptorLite fieldDescriptorLite, Object obj) {
        WireFormat.FieldType liteType = fieldDescriptorLite.getLiteType();
        int number = fieldDescriptorLite.getNumber();
        if (fieldDescriptorLite.isRepeated()) {
            int i = 0;
            if (fieldDescriptorLite.isPacked()) {
                for (Object obj2 : (List) obj) {
                    i += m35867f(liteType, obj2);
                }
                return CodedOutputStream.computeTagSize(number) + i + CodedOutputStream.computeUInt32SizeNoTag(i);
            }
            for (Object obj3 : (List) obj) {
                i += m35868e(liteType, number, obj3);
            }
            return i;
        }
        return m35868e(liteType, number, obj);
    }

    /* renamed from: i */
    public static FieldSet m35864i() {
        return f57329d;
    }

    /* renamed from: p */
    public static int m35857p(WireFormat.FieldType fieldType, boolean z) {
        if (z) {
            return 2;
        }
        return fieldType.getWireType();
    }

    /* renamed from: u */
    public static boolean m35852u(Map.Entry entry) {
        FieldDescriptorLite fieldDescriptorLite = (FieldDescriptorLite) entry.getKey();
        if (fieldDescriptorLite.getLiteJavaType() == WireFormat.JavaType.MESSAGE) {
            if (fieldDescriptorLite.isRepeated()) {
                for (Object obj : (List) entry.getValue()) {
                    if (!m35851v(obj)) {
                        return false;
                    }
                }
                return true;
            }
            return m35851v(entry.getValue());
        }
        return true;
    }

    /* renamed from: v */
    public static boolean m35851v(Object obj) {
        if (obj instanceof MessageLiteOrBuilder) {
            return ((MessageLiteOrBuilder) obj).isInitialized();
        }
        if (obj instanceof LazyField) {
            return true;
        }
        throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
    }

    /* renamed from: w */
    public static boolean m35850w(WireFormat.FieldType fieldType, Object obj) {
        Internal.m35786a(obj);
        switch (C8879a.f57333a[fieldType.getJavaType().ordinal()]) {
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
    public final void m35881A(Map.Entry entry) {
        FieldDescriptorLite fieldDescriptorLite = (FieldDescriptorLite) entry.getKey();
        Object value = entry.getValue();
        if (value instanceof LazyField) {
            value = ((LazyField) value).getValue();
        }
        if (fieldDescriptorLite.isRepeated()) {
            Object m35863j = m35863j(fieldDescriptorLite);
            if (m35863j == null) {
                m35863j = new ArrayList();
            }
            for (Object obj : (List) value) {
                ((List) m35863j).add(m35869d(obj));
            }
            this.f57330a.m35039s(fieldDescriptorLite, m35863j);
        } else if (fieldDescriptorLite.getLiteJavaType() == WireFormat.JavaType.MESSAGE) {
            Object m35863j2 = m35863j(fieldDescriptorLite);
            if (m35863j2 == null) {
                this.f57330a.m35039s(fieldDescriptorLite, m35869d(value));
                return;
            }
            this.f57330a.m35039s(fieldDescriptorLite, fieldDescriptorLite.internalMergeFrom(((MessageLite) m35863j2).toBuilder(), (MessageLite) value).build());
        } else {
            this.f57330a.m35039s(fieldDescriptorLite, m35869d(value));
        }
    }

    /* renamed from: D */
    public void m35878D(FieldDescriptorLite fieldDescriptorLite, Object obj) {
        if (fieldDescriptorLite.isRepeated()) {
            if (obj instanceof List) {
                ArrayList<Object> arrayList = new ArrayList();
                arrayList.addAll((List) obj);
                for (Object obj2 : arrayList) {
                    m35876F(fieldDescriptorLite, obj2);
                }
                obj = arrayList;
            } else {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
        } else {
            m35876F(fieldDescriptorLite, obj);
        }
        if (obj instanceof LazyField) {
            this.f57332c = true;
        }
        this.f57330a.m35039s(fieldDescriptorLite, obj);
    }

    /* renamed from: E */
    public void m35877E(FieldDescriptorLite fieldDescriptorLite, int i, Object obj) {
        if (fieldDescriptorLite.isRepeated()) {
            Object m35863j = m35863j(fieldDescriptorLite);
            if (m35863j != null) {
                m35876F(fieldDescriptorLite, obj);
                ((List) m35863j).set(i, obj);
                return;
            }
            throw new IndexOutOfBoundsException();
        }
        throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
    }

    /* renamed from: F */
    public final void m35876F(FieldDescriptorLite fieldDescriptorLite, Object obj) {
        if (m35850w(fieldDescriptorLite.getLiteType(), obj)) {
            return;
        }
        throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(fieldDescriptorLite.getNumber()), fieldDescriptorLite.getLiteType().getJavaType(), obj.getClass().getName()));
    }

    /* renamed from: a */
    public void m35872a(FieldDescriptorLite fieldDescriptorLite, Object obj) {
        List list;
        if (fieldDescriptorLite.isRepeated()) {
            m35876F(fieldDescriptorLite, obj);
            Object m35863j = m35863j(fieldDescriptorLite);
            if (m35863j == null) {
                list = new ArrayList();
                this.f57330a.m35039s(fieldDescriptorLite, list);
            } else {
                list = (List) m35863j;
            }
            list.add(obj);
            return;
        }
        throw new IllegalArgumentException("addRepeatedField() can only be called on repeated fields.");
    }

    /* renamed from: b */
    public void m35871b(FieldDescriptorLite fieldDescriptorLite) {
        this.f57330a.remove(fieldDescriptorLite);
        if (this.f57330a.isEmpty()) {
            this.f57332c = false;
        }
    }

    /* renamed from: c */
    public FieldSet clone() {
        FieldSet m35880B = m35880B();
        for (int i = 0; i < this.f57330a.m35045l(); i++) {
            Map.Entry m35046k = this.f57330a.m35046k(i);
            m35880B.m35878D((FieldDescriptorLite) m35046k.getKey(), m35046k.getValue());
        }
        for (Map.Entry entry : this.f57330a.m35043n()) {
            m35880B.m35878D((FieldDescriptorLite) entry.getKey(), entry.getValue());
        }
        m35880B.f57332c = this.f57332c;
        return m35880B;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FieldSet)) {
            return false;
        }
        return this.f57330a.equals(((FieldSet) obj).f57330a);
    }

    /* renamed from: h */
    public Iterator m35865h() {
        if (this.f57332c) {
            return new LazyField.C8892c(this.f57330a.m35048i().iterator());
        }
        return this.f57330a.m35048i().iterator();
    }

    public int hashCode() {
        return this.f57330a.hashCode();
    }

    /* renamed from: j */
    public Object m35863j(FieldDescriptorLite fieldDescriptorLite) {
        Object obj = this.f57330a.get(fieldDescriptorLite);
        if (obj instanceof LazyField) {
            return ((LazyField) obj).getValue();
        }
        return obj;
    }

    /* renamed from: k */
    public int m35862k() {
        int i = 0;
        for (int i2 = 0; i2 < this.f57330a.m35045l(); i2++) {
            i += m35861l(this.f57330a.m35046k(i2));
        }
        for (Map.Entry entry : this.f57330a.m35043n()) {
            i += m35861l(entry);
        }
        return i;
    }

    /* renamed from: l */
    public final int m35861l(Map.Entry entry) {
        FieldDescriptorLite fieldDescriptorLite = (FieldDescriptorLite) entry.getKey();
        Object value = entry.getValue();
        if (fieldDescriptorLite.getLiteJavaType() == WireFormat.JavaType.MESSAGE && !fieldDescriptorLite.isRepeated() && !fieldDescriptorLite.isPacked()) {
            if (value instanceof LazyField) {
                return CodedOutputStream.computeLazyFieldMessageSetExtensionSize(((FieldDescriptorLite) entry.getKey()).getNumber(), (LazyField) value);
            }
            return CodedOutputStream.computeMessageSetExtensionSize(((FieldDescriptorLite) entry.getKey()).getNumber(), (MessageLite) value);
        }
        return m35866g(fieldDescriptorLite, value);
    }

    /* renamed from: m */
    public Object m35860m(FieldDescriptorLite fieldDescriptorLite, int i) {
        if (fieldDescriptorLite.isRepeated()) {
            Object m35863j = m35863j(fieldDescriptorLite);
            if (m35863j != null) {
                return ((List) m35863j).get(i);
            }
            throw new IndexOutOfBoundsException();
        }
        throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
    }

    /* renamed from: n */
    public int m35859n(FieldDescriptorLite fieldDescriptorLite) {
        if (fieldDescriptorLite.isRepeated()) {
            Object m35863j = m35863j(fieldDescriptorLite);
            if (m35863j == null) {
                return 0;
            }
            return ((List) m35863j).size();
        }
        throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
    }

    /* renamed from: o */
    public int m35858o() {
        int i = 0;
        for (int i2 = 0; i2 < this.f57330a.m35045l(); i2++) {
            Map.Entry m35046k = this.f57330a.m35046k(i2);
            i += m35866g((FieldDescriptorLite) m35046k.getKey(), m35046k.getValue());
        }
        for (Map.Entry entry : this.f57330a.m35043n()) {
            i += m35866g((FieldDescriptorLite) entry.getKey(), entry.getValue());
        }
        return i;
    }

    /* renamed from: q */
    public boolean m35856q(FieldDescriptorLite fieldDescriptorLite) {
        if (!fieldDescriptorLite.isRepeated()) {
            if (this.f57330a.get(fieldDescriptorLite) != null) {
                return true;
            }
            return false;
        }
        throw new IllegalArgumentException("hasField() can only be called on non-repeated fields.");
    }

    /* renamed from: r */
    public boolean m35855r() {
        return this.f57330a.isEmpty();
    }

    /* renamed from: s */
    public boolean m35854s() {
        return this.f57331b;
    }

    /* renamed from: t */
    public boolean m35853t() {
        for (int i = 0; i < this.f57330a.m35045l(); i++) {
            if (!m35852u(this.f57330a.m35046k(i))) {
                return false;
            }
        }
        for (Map.Entry entry : this.f57330a.m35043n()) {
            if (!m35852u(entry)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: x */
    public Iterator m35849x() {
        if (this.f57332c) {
            return new LazyField.C8892c(this.f57330a.entrySet().iterator());
        }
        return this.f57330a.entrySet().iterator();
    }

    /* renamed from: y */
    public void m35848y() {
        if (this.f57331b) {
            return;
        }
        for (int i = 0; i < this.f57330a.m35045l(); i++) {
            Map.Entry m35046k = this.f57330a.m35046k(i);
            if (m35046k.getValue() instanceof GeneratedMessageLite) {
                ((GeneratedMessageLite) m35046k.getValue()).makeImmutable();
            }
        }
        this.f57330a.mo35037q();
        this.f57331b = true;
    }

    /* renamed from: z */
    public void m35847z(FieldSet fieldSet) {
        for (int i = 0; i < fieldSet.f57330a.m35045l(); i++) {
            m35881A(fieldSet.f57330a.m35046k(i));
        }
        for (Map.Entry entry : fieldSet.f57330a.m35043n()) {
            m35881A(entry);
        }
    }

    public FieldSet(boolean z) {
        this(AbstractC8963v.m35040r(0));
        m35848y();
    }

    public FieldSet(AbstractC8963v abstractC8963v) {
        this.f57330a = abstractC8963v;
        m35848y();
    }
}
