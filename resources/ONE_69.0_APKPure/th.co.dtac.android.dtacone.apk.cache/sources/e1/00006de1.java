package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.Internal;
import androidx.datastore.preferences.protobuf.LazyField;
import androidx.datastore.preferences.protobuf.MessageLite;
import androidx.datastore.preferences.protobuf.WireFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class FieldSet {

    /* renamed from: d */
    public static final FieldSet f34877d = new FieldSet(true);

    /* renamed from: a */
    public final AbstractC4438x f34878a;

    /* renamed from: b */
    public boolean f34879b;

    /* renamed from: c */
    public boolean f34880c;

    /* loaded from: classes2.dex */
    public interface FieldDescriptorLite<T extends FieldDescriptorLite<T>> extends Comparable<T> {
        Internal.EnumLiteMap<?> getEnumType();

        WireFormat.JavaType getLiteJavaType();

        WireFormat.FieldType getLiteType();

        int getNumber();

        MessageLite.Builder internalMergeFrom(MessageLite.Builder builder, MessageLite messageLite);

        boolean isPacked();

        boolean isRepeated();
    }

    /* renamed from: androidx.datastore.preferences.protobuf.FieldSet$a */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class C4350a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f34881a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f34882b;

        static {
            int[] iArr = new int[WireFormat.FieldType.values().length];
            f34882b = iArr;
            try {
                iArr[WireFormat.FieldType.DOUBLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f34882b[WireFormat.FieldType.FLOAT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f34882b[WireFormat.FieldType.INT64.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f34882b[WireFormat.FieldType.UINT64.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f34882b[WireFormat.FieldType.INT32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f34882b[WireFormat.FieldType.FIXED64.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f34882b[WireFormat.FieldType.FIXED32.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f34882b[WireFormat.FieldType.BOOL.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f34882b[WireFormat.FieldType.GROUP.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f34882b[WireFormat.FieldType.MESSAGE.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f34882b[WireFormat.FieldType.STRING.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f34882b[WireFormat.FieldType.BYTES.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f34882b[WireFormat.FieldType.UINT32.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f34882b[WireFormat.FieldType.SFIXED32.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f34882b[WireFormat.FieldType.SFIXED64.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f34882b[WireFormat.FieldType.SINT32.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f34882b[WireFormat.FieldType.SINT64.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f34882b[WireFormat.FieldType.ENUM.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            int[] iArr2 = new int[WireFormat.JavaType.values().length];
            f34881a = iArr2;
            try {
                iArr2[WireFormat.JavaType.INT.ordinal()] = 1;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f34881a[WireFormat.JavaType.LONG.ordinal()] = 2;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f34881a[WireFormat.JavaType.FLOAT.ordinal()] = 3;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f34881a[WireFormat.JavaType.DOUBLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f34881a[WireFormat.JavaType.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                f34881a[WireFormat.JavaType.STRING.ordinal()] = 6;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                f34881a[WireFormat.JavaType.BYTE_STRING.ordinal()] = 7;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                f34881a[WireFormat.JavaType.ENUM.ordinal()] = 8;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                f34881a[WireFormat.JavaType.MESSAGE.ordinal()] = 9;
            } catch (NoSuchFieldError unused27) {
            }
        }
    }

    public FieldSet() {
        this.f34878a = AbstractC4438x.m54891r(16);
    }

    /* renamed from: A */
    public static FieldSet m55761A() {
        return new FieldSet();
    }

    /* renamed from: B */
    public static Object m55760B(CodedInputStream codedInputStream, WireFormat.FieldType fieldType, boolean z) {
        if (z) {
            return WireFormat.m55287b(codedInputStream, fieldType, WireFormat.Utf8Validation.STRICT);
        }
        return WireFormat.m55287b(codedInputStream, fieldType, WireFormat.Utf8Validation.LOOSE);
    }

    /* renamed from: F */
    public static void m55756F(CodedOutputStream codedOutputStream, WireFormat.FieldType fieldType, int i, Object obj) {
        if (fieldType == WireFormat.FieldType.GROUP) {
            codedOutputStream.writeGroup(i, (MessageLite) obj);
            return;
        }
        codedOutputStream.writeTag(i, m55738p(fieldType, false));
        m55755G(codedOutputStream, fieldType, obj);
    }

    /* renamed from: G */
    public static void m55755G(CodedOutputStream codedOutputStream, WireFormat.FieldType fieldType, Object obj) {
        switch (C4350a.f34882b[fieldType.ordinal()]) {
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

    /* renamed from: H */
    public static void m55754H(FieldDescriptorLite fieldDescriptorLite, Object obj, CodedOutputStream codedOutputStream) {
        WireFormat.FieldType liteType = fieldDescriptorLite.getLiteType();
        int number = fieldDescriptorLite.getNumber();
        if (fieldDescriptorLite.isRepeated()) {
            List<Object> list = (List) obj;
            if (fieldDescriptorLite.isPacked()) {
                codedOutputStream.writeTag(number, 2);
                int i = 0;
                for (Object obj2 : list) {
                    i += m55748f(liteType, obj2);
                }
                codedOutputStream.writeRawVarint32(i);
                for (Object obj3 : list) {
                    m55755G(codedOutputStream, liteType, obj3);
                }
                return;
            }
            for (Object obj4 : list) {
                m55756F(codedOutputStream, liteType, number, obj4);
            }
        } else if (obj instanceof LazyField) {
            m55756F(codedOutputStream, liteType, number, ((LazyField) obj).getValue());
        } else {
            m55756F(codedOutputStream, liteType, number, obj);
        }
    }

    /* renamed from: d */
    public static Object m55750d(Object obj) {
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            byte[] bArr2 = new byte[bArr.length];
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            return bArr2;
        }
        return obj;
    }

    /* renamed from: e */
    public static int m55749e(WireFormat.FieldType fieldType, int i, Object obj) {
        int computeTagSize = CodedOutputStream.computeTagSize(i);
        if (fieldType == WireFormat.FieldType.GROUP) {
            computeTagSize *= 2;
        }
        return computeTagSize + m55748f(fieldType, obj);
    }

    /* renamed from: f */
    public static int m55748f(WireFormat.FieldType fieldType, Object obj) {
        switch (C4350a.f34882b[fieldType.ordinal()]) {
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
    public static int m55747g(FieldDescriptorLite fieldDescriptorLite, Object obj) {
        WireFormat.FieldType liteType = fieldDescriptorLite.getLiteType();
        int number = fieldDescriptorLite.getNumber();
        if (fieldDescriptorLite.isRepeated()) {
            int i = 0;
            if (fieldDescriptorLite.isPacked()) {
                for (Object obj2 : (List) obj) {
                    i += m55748f(liteType, obj2);
                }
                return CodedOutputStream.computeTagSize(number) + i + CodedOutputStream.computeRawVarint32Size(i);
            }
            for (Object obj3 : (List) obj) {
                i += m55749e(liteType, number, obj3);
            }
            return i;
        }
        return m55749e(liteType, number, obj);
    }

    /* renamed from: i */
    public static FieldSet m55745i() {
        return f34877d;
    }

    /* renamed from: p */
    public static int m55738p(WireFormat.FieldType fieldType, boolean z) {
        if (z) {
            return 2;
        }
        return fieldType.getWireType();
    }

    /* renamed from: u */
    public static boolean m55733u(Map.Entry entry) {
        FieldDescriptorLite fieldDescriptorLite = (FieldDescriptorLite) entry.getKey();
        if (fieldDescriptorLite.getLiteJavaType() == WireFormat.JavaType.MESSAGE) {
            if (fieldDescriptorLite.isRepeated()) {
                for (MessageLite messageLite : (List) entry.getValue()) {
                    if (!messageLite.isInitialized()) {
                        return false;
                    }
                }
            } else {
                Object value = entry.getValue();
                if (value instanceof MessageLite) {
                    if (!((MessageLite) value).isInitialized()) {
                        return false;
                    }
                } else if (value instanceof LazyField) {
                    return true;
                } else {
                    throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
                }
            }
        }
        return true;
    }

    /* renamed from: v */
    public static boolean m55732v(WireFormat.FieldType fieldType, Object obj) {
        Internal.m55680a(obj);
        switch (C4350a.f34881a[fieldType.getJavaType().ordinal()]) {
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

    /* renamed from: C */
    public void m55759C(FieldDescriptorLite fieldDescriptorLite, Object obj) {
        if (fieldDescriptorLite.isRepeated()) {
            if (obj instanceof List) {
                ArrayList<Object> arrayList = new ArrayList();
                arrayList.addAll((List) obj);
                for (Object obj2 : arrayList) {
                    m55757E(fieldDescriptorLite.getLiteType(), obj2);
                }
                obj = arrayList;
            } else {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
        } else {
            m55757E(fieldDescriptorLite.getLiteType(), obj);
        }
        if (obj instanceof LazyField) {
            this.f34880c = true;
        }
        this.f34878a.m54890s(fieldDescriptorLite, obj);
    }

    /* renamed from: D */
    public void m55758D(FieldDescriptorLite fieldDescriptorLite, int i, Object obj) {
        if (fieldDescriptorLite.isRepeated()) {
            Object m55744j = m55744j(fieldDescriptorLite);
            if (m55744j != null) {
                m55757E(fieldDescriptorLite.getLiteType(), obj);
                ((List) m55744j).set(i, obj);
                return;
            }
            throw new IndexOutOfBoundsException();
        }
        throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
    }

    /* renamed from: E */
    public final void m55757E(WireFormat.FieldType fieldType, Object obj) {
        if (m55732v(fieldType, obj)) {
            return;
        }
        throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
    }

    /* renamed from: a */
    public void m55753a(FieldDescriptorLite fieldDescriptorLite, Object obj) {
        List list;
        if (fieldDescriptorLite.isRepeated()) {
            m55757E(fieldDescriptorLite.getLiteType(), obj);
            Object m55744j = m55744j(fieldDescriptorLite);
            if (m55744j == null) {
                list = new ArrayList();
                this.f34878a.m54890s(fieldDescriptorLite, list);
            } else {
                list = (List) m55744j;
            }
            list.add(obj);
            return;
        }
        throw new IllegalArgumentException("addRepeatedField() can only be called on repeated fields.");
    }

    /* renamed from: b */
    public void m55752b(FieldDescriptorLite fieldDescriptorLite) {
        this.f34878a.remove(fieldDescriptorLite);
        if (this.f34878a.isEmpty()) {
            this.f34880c = false;
        }
    }

    /* renamed from: c */
    public FieldSet clone() {
        FieldSet m55761A = m55761A();
        for (int i = 0; i < this.f34878a.m54896l(); i++) {
            Map.Entry m54897k = this.f34878a.m54897k(i);
            m55761A.m55759C((FieldDescriptorLite) m54897k.getKey(), m54897k.getValue());
        }
        for (Map.Entry entry : this.f34878a.m54894n()) {
            m55761A.m55759C((FieldDescriptorLite) entry.getKey(), entry.getValue());
        }
        m55761A.f34880c = this.f34880c;
        return m55761A;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FieldSet)) {
            return false;
        }
        return this.f34878a.equals(((FieldSet) obj).f34878a);
    }

    /* renamed from: h */
    public Iterator m55746h() {
        if (this.f34880c) {
            return new LazyField.C4363c(this.f34878a.m54899i().iterator());
        }
        return this.f34878a.m54899i().iterator();
    }

    public int hashCode() {
        return this.f34878a.hashCode();
    }

    /* renamed from: j */
    public Object m55744j(FieldDescriptorLite fieldDescriptorLite) {
        Object obj = this.f34878a.get(fieldDescriptorLite);
        if (obj instanceof LazyField) {
            return ((LazyField) obj).getValue();
        }
        return obj;
    }

    /* renamed from: k */
    public int m55743k() {
        int i = 0;
        for (int i2 = 0; i2 < this.f34878a.m54896l(); i2++) {
            i += m55742l(this.f34878a.m54897k(i2));
        }
        for (Map.Entry entry : this.f34878a.m54894n()) {
            i += m55742l(entry);
        }
        return i;
    }

    /* renamed from: l */
    public final int m55742l(Map.Entry entry) {
        FieldDescriptorLite fieldDescriptorLite = (FieldDescriptorLite) entry.getKey();
        Object value = entry.getValue();
        if (fieldDescriptorLite.getLiteJavaType() == WireFormat.JavaType.MESSAGE && !fieldDescriptorLite.isRepeated() && !fieldDescriptorLite.isPacked()) {
            if (value instanceof LazyField) {
                return CodedOutputStream.computeLazyFieldMessageSetExtensionSize(((FieldDescriptorLite) entry.getKey()).getNumber(), (LazyField) value);
            }
            return CodedOutputStream.computeMessageSetExtensionSize(((FieldDescriptorLite) entry.getKey()).getNumber(), (MessageLite) value);
        }
        return m55747g(fieldDescriptorLite, value);
    }

    /* renamed from: m */
    public Object m55741m(FieldDescriptorLite fieldDescriptorLite, int i) {
        if (fieldDescriptorLite.isRepeated()) {
            Object m55744j = m55744j(fieldDescriptorLite);
            if (m55744j != null) {
                return ((List) m55744j).get(i);
            }
            throw new IndexOutOfBoundsException();
        }
        throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
    }

    /* renamed from: n */
    public int m55740n(FieldDescriptorLite fieldDescriptorLite) {
        if (fieldDescriptorLite.isRepeated()) {
            Object m55744j = m55744j(fieldDescriptorLite);
            if (m55744j == null) {
                return 0;
            }
            return ((List) m55744j).size();
        }
        throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
    }

    /* renamed from: o */
    public int m55739o() {
        int i = 0;
        for (int i2 = 0; i2 < this.f34878a.m54896l(); i2++) {
            Map.Entry m54897k = this.f34878a.m54897k(i2);
            i += m55747g((FieldDescriptorLite) m54897k.getKey(), m54897k.getValue());
        }
        for (Map.Entry entry : this.f34878a.m54894n()) {
            i += m55747g((FieldDescriptorLite) entry.getKey(), entry.getValue());
        }
        return i;
    }

    /* renamed from: q */
    public boolean m55737q(FieldDescriptorLite fieldDescriptorLite) {
        if (!fieldDescriptorLite.isRepeated()) {
            if (this.f34878a.get(fieldDescriptorLite) != null) {
                return true;
            }
            return false;
        }
        throw new IllegalArgumentException("hasField() can only be called on non-repeated fields.");
    }

    /* renamed from: r */
    public boolean m55736r() {
        return this.f34878a.isEmpty();
    }

    /* renamed from: s */
    public boolean m55735s() {
        return this.f34879b;
    }

    /* renamed from: t */
    public boolean m55734t() {
        for (int i = 0; i < this.f34878a.m54896l(); i++) {
            if (!m55733u(this.f34878a.m54897k(i))) {
                return false;
            }
        }
        for (Map.Entry entry : this.f34878a.m54894n()) {
            if (!m55733u(entry)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: w */
    public Iterator m55731w() {
        if (this.f34880c) {
            return new LazyField.C4363c(this.f34878a.entrySet().iterator());
        }
        return this.f34878a.entrySet().iterator();
    }

    /* renamed from: x */
    public void m55730x() {
        if (this.f34879b) {
            return;
        }
        this.f34878a.mo54888q();
        this.f34879b = true;
    }

    /* renamed from: y */
    public void m55729y(FieldSet fieldSet) {
        for (int i = 0; i < fieldSet.f34878a.m54896l(); i++) {
            m55728z(fieldSet.f34878a.m54897k(i));
        }
        for (Map.Entry entry : fieldSet.f34878a.m54894n()) {
            m55728z(entry);
        }
    }

    /* renamed from: z */
    public final void m55728z(Map.Entry entry) {
        FieldDescriptorLite fieldDescriptorLite = (FieldDescriptorLite) entry.getKey();
        Object value = entry.getValue();
        if (value instanceof LazyField) {
            value = ((LazyField) value).getValue();
        }
        if (fieldDescriptorLite.isRepeated()) {
            Object m55744j = m55744j(fieldDescriptorLite);
            if (m55744j == null) {
                m55744j = new ArrayList();
            }
            for (Object obj : (List) value) {
                ((List) m55744j).add(m55750d(obj));
            }
            this.f34878a.m54890s(fieldDescriptorLite, m55744j);
        } else if (fieldDescriptorLite.getLiteJavaType() == WireFormat.JavaType.MESSAGE) {
            Object m55744j2 = m55744j(fieldDescriptorLite);
            if (m55744j2 == null) {
                this.f34878a.m54890s(fieldDescriptorLite, m55750d(value));
                return;
            }
            this.f34878a.m54890s(fieldDescriptorLite, fieldDescriptorLite.internalMergeFrom(((MessageLite) m55744j2).toBuilder(), (MessageLite) value).build());
        } else {
            this.f34878a.m54890s(fieldDescriptorLite, m55750d(value));
        }
    }

    public FieldSet(boolean z) {
        this(AbstractC4438x.m54891r(0));
        m55730x();
    }

    public FieldSet(AbstractC4438x abstractC4438x) {
        this.f34878a = abstractC4438x;
        m55730x();
    }
}