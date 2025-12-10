package com.google.protobuf;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;
import java.util.Set;

/* loaded from: classes4.dex */
public final class Internal {
    public static final byte[] EMPTY_BYTE_ARRAY;
    public static final ByteBuffer EMPTY_BYTE_BUFFER;
    public static final CodedInputStream EMPTY_CODED_INPUT_STREAM;

    /* renamed from: a */
    public static final Charset f57357a = Charset.forName("US-ASCII");

    /* renamed from: b */
    public static final Charset f57358b = Charset.forName("UTF-8");

    /* renamed from: c */
    public static final Charset f57359c = Charset.forName("ISO-8859-1");

    /* loaded from: classes4.dex */
    public interface BooleanList extends ProtobufList<Boolean> {
        void addBoolean(boolean z);

        boolean getBoolean(int i);

        @Override // com.google.protobuf.Internal.ProtobufList
        ProtobufList<Boolean> mutableCopyWithCapacity(int i);

        boolean setBoolean(int i, boolean z);
    }

    /* loaded from: classes4.dex */
    public interface DoubleList extends ProtobufList<Double> {
        void addDouble(double d);

        double getDouble(int i);

        @Override // com.google.protobuf.Internal.ProtobufList
        ProtobufList<Double> mutableCopyWithCapacity(int i);

        double setDouble(int i, double d);
    }

    /* loaded from: classes4.dex */
    public interface EnumLite {
        int getNumber();
    }

    /* loaded from: classes4.dex */
    public interface EnumLiteMap<T extends EnumLite> {
        T findValueByNumber(int i);
    }

    /* loaded from: classes4.dex */
    public interface EnumVerifier {
        boolean isInRange(int i);
    }

    /* loaded from: classes4.dex */
    public interface FloatList extends ProtobufList<Float> {
        void addFloat(float f);

        float getFloat(int i);

        @Override // com.google.protobuf.Internal.ProtobufList
        ProtobufList<Float> mutableCopyWithCapacity(int i);

        float setFloat(int i, float f);
    }

    /* loaded from: classes4.dex */
    public interface IntList extends ProtobufList<Integer> {
        void addInt(int i);

        int getInt(int i);

        @Override // com.google.protobuf.Internal.ProtobufList
        ProtobufList<Integer> mutableCopyWithCapacity(int i);

        int setInt(int i, int i2);
    }

    /* loaded from: classes4.dex */
    public static class ListAdapter<F, T> extends AbstractList<T> {

        /* renamed from: a */
        public final List f57360a;

        /* renamed from: b */
        public final Converter f57361b;

        /* loaded from: classes4.dex */
        public interface Converter<F, T> {
            T convert(F f);
        }

        public ListAdapter(List<F> list, Converter<F, T> converter) {
            this.f57360a = list;
            this.f57361b = converter;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.AbstractList, java.util.List
        public T get(int i) {
            return (T) this.f57361b.convert(this.f57360a.get(i));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f57360a.size();
        }
    }

    /* loaded from: classes4.dex */
    public interface LongList extends ProtobufList<Long> {
        void addLong(long j);

        long getLong(int i);

        @Override // com.google.protobuf.Internal.ProtobufList
        ProtobufList<Long> mutableCopyWithCapacity(int i);

        long setLong(int i, long j);
    }

    /* loaded from: classes4.dex */
    public static class MapAdapter<K, V, RealValue> extends AbstractMap<K, V> {

        /* renamed from: a */
        public final Map f57362a;

        /* renamed from: b */
        public final Converter f57363b;

        /* loaded from: classes4.dex */
        public interface Converter<A, B> {
            A doBackward(B b);

            B doForward(A a);
        }

        /* renamed from: com.google.protobuf.Internal$MapAdapter$a */
        /* loaded from: classes4.dex */
        public class C8886a implements Converter {

            /* renamed from: a */
            public final /* synthetic */ EnumLiteMap f57364a;

            /* renamed from: b */
            public final /* synthetic */ EnumLite f57365b;

            public C8886a(EnumLiteMap enumLiteMap, EnumLite enumLite) {
                this.f57364a = enumLiteMap;
                this.f57365b = enumLite;
            }

            @Override // com.google.protobuf.Internal.MapAdapter.Converter
            /* renamed from: a */
            public Integer doBackward(EnumLite enumLite) {
                return Integer.valueOf(enumLite.getNumber());
            }

            @Override // com.google.protobuf.Internal.MapAdapter.Converter
            /* renamed from: b */
            public EnumLite doForward(Integer num) {
                EnumLite findValueByNumber = this.f57364a.findValueByNumber(num.intValue());
                if (findValueByNumber == null) {
                    return this.f57365b;
                }
                return findValueByNumber;
            }
        }

        /* renamed from: com.google.protobuf.Internal$MapAdapter$b */
        /* loaded from: classes4.dex */
        public class C8887b implements Map.Entry {

            /* renamed from: a */
            public final Map.Entry f57366a;

            public C8887b(Map.Entry entry) {
                this.f57366a = entry;
            }

            @Override // java.util.Map.Entry
            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if ((obj instanceof Map.Entry) && getKey().equals(((Map.Entry) obj).getKey()) && getValue().equals(getValue())) {
                    return true;
                }
                return false;
            }

            @Override // java.util.Map.Entry
            public Object getKey() {
                return this.f57366a.getKey();
            }

            @Override // java.util.Map.Entry
            public Object getValue() {
                return MapAdapter.this.f57363b.doForward(this.f57366a.getValue());
            }

            @Override // java.util.Map.Entry
            public int hashCode() {
                return this.f57366a.hashCode();
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Map.Entry
            public Object setValue(Object obj) {
                Object value = this.f57366a.setValue(MapAdapter.this.f57363b.doBackward(obj));
                if (value == null) {
                    return null;
                }
                return MapAdapter.this.f57363b.doForward(value);
            }
        }

        /* renamed from: com.google.protobuf.Internal$MapAdapter$c */
        /* loaded from: classes4.dex */
        public class C8888c implements Iterator {

            /* renamed from: a */
            public final Iterator f57368a;

            public C8888c(Iterator it) {
                this.f57368a = it;
            }

            @Override // java.util.Iterator
            /* renamed from: a */
            public Map.Entry next() {
                return new C8887b((Map.Entry) this.f57368a.next());
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.f57368a.hasNext();
            }

            @Override // java.util.Iterator
            public void remove() {
                this.f57368a.remove();
            }
        }

        /* renamed from: com.google.protobuf.Internal$MapAdapter$d */
        /* loaded from: classes4.dex */
        public class C8889d extends AbstractSet {

            /* renamed from: a */
            public final Set f57370a;

            public C8889d(Set set) {
                this.f57370a = set;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator iterator() {
                return new C8888c(this.f57370a.iterator());
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public int size() {
                return this.f57370a.size();
            }
        }

        public MapAdapter(Map<K, RealValue> map, Converter<RealValue, V> converter) {
            this.f57362a = map;
            this.f57363b = converter;
        }

        public static <T extends EnumLite> Converter<Integer, T> newEnumConverter(EnumLiteMap<T> enumLiteMap, T t) {
            return new C8886a(enumLiteMap, t);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Set<Map.Entry<K, V>> entrySet() {
            return new C8889d(this.f57362a.entrySet());
        }

        @Override // java.util.AbstractMap, java.util.Map
        public V get(Object obj) {
            Object obj2 = this.f57362a.get(obj);
            if (obj2 == null) {
                return null;
            }
            return (V) this.f57363b.doForward(obj2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.AbstractMap, java.util.Map
        public V put(K k, V v) {
            Object put = this.f57362a.put(k, this.f57363b.doBackward(v));
            if (put == null) {
                return null;
            }
            return (V) this.f57363b.doForward(put);
        }
    }

    /* loaded from: classes4.dex */
    public interface ProtobufList<E> extends List<E>, RandomAccess {
        boolean isModifiable();

        void makeImmutable();

        ProtobufList<E> mutableCopyWithCapacity(int i);
    }

    static {
        byte[] bArr = new byte[0];
        EMPTY_BYTE_ARRAY = bArr;
        EMPTY_BYTE_BUFFER = ByteBuffer.wrap(bArr);
        EMPTY_CODED_INPUT_STREAM = CodedInputStream.newInstance(bArr);
    }

    /* renamed from: a */
    public static Object m35786a(Object obj) {
        obj.getClass();
        return obj;
    }

    /* renamed from: b */
    public static Object m35785b(Object obj, String str) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(str);
    }

    public static byte[] byteArrayDefaultValue(String str) {
        return str.getBytes(f57359c);
    }

    public static ByteBuffer byteBufferDefaultValue(String str) {
        return ByteBuffer.wrap(byteArrayDefaultValue(str));
    }

    public static ByteString bytesDefaultValue(String str) {
        return ByteString.copyFrom(str.getBytes(f57359c));
    }

    /* renamed from: c */
    public static int m35784c(byte[] bArr, int i, int i2) {
        int m35782e = m35782e(i2, bArr, i, i2);
        if (m35782e == 0) {
            return 1;
        }
        return m35782e;
    }

    public static ByteBuffer copyByteBuffer(ByteBuffer byteBuffer) {
        ByteBuffer duplicate = byteBuffer.duplicate();
        duplicate.clear();
        ByteBuffer allocate = ByteBuffer.allocate(duplicate.capacity());
        allocate.put(duplicate);
        allocate.clear();
        return allocate;
    }

    /* renamed from: d */
    public static Object m35783d(Object obj, Object obj2) {
        return ((MessageLite) obj).toBuilder().mergeFrom((MessageLite) obj2).buildPartial();
    }

    /* renamed from: e */
    public static int m35782e(int i, byte[] bArr, int i2, int i3) {
        for (int i4 = i2; i4 < i2 + i3; i4++) {
            i = (i * 31) + bArr[i4];
        }
        return i;
    }

    public static boolean equals(List<byte[]> list, List<byte[]> list2) {
        if (list.size() != list2.size()) {
            return false;
        }
        for (int i = 0; i < list.size(); i++) {
            if (!Arrays.equals(list.get(i), list2.get(i))) {
                return false;
            }
        }
        return true;
    }

    public static boolean equalsByteBuffer(ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
        if (byteBuffer.capacity() != byteBuffer2.capacity()) {
            return false;
        }
        return ((ByteBuffer) byteBuffer.duplicate().clear()).equals((ByteBuffer) byteBuffer2.duplicate().clear());
    }

    public static <T extends MessageLite> T getDefaultInstance(Class<T> cls) {
        try {
            java.lang.reflect.Method method = cls.getMethod("getDefaultInstance", null);
            return (T) method.invoke(method, null);
        } catch (Exception e) {
            throw new RuntimeException("Failed to get default instance for " + cls, e);
        }
    }

    public static int hashBoolean(boolean z) {
        return z ? 1231 : 1237;
    }

    public static int hashCode(List<byte[]> list) {
        int i = 1;
        for (byte[] bArr : list) {
            i = (i * 31) + hashCode(bArr);
        }
        return i;
    }

    public static int hashCodeByteBuffer(List<ByteBuffer> list) {
        int i = 1;
        for (ByteBuffer byteBuffer : list) {
            i = (i * 31) + hashCodeByteBuffer(byteBuffer);
        }
        return i;
    }

    public static int hashEnum(EnumLite enumLite) {
        return enumLite.getNumber();
    }

    public static int hashEnumList(List<? extends EnumLite> list) {
        int i = 1;
        for (EnumLite enumLite : list) {
            i = (i * 31) + hashEnum(enumLite);
        }
        return i;
    }

    public static int hashLong(long j) {
        return (int) (j ^ (j >>> 32));
    }

    public static boolean isValidUtf8(ByteString byteString) {
        return byteString.isValidUtf8();
    }

    public static String stringDefaultValue(String str) {
        return new String(str.getBytes(f57359c), f57358b);
    }

    public static byte[] toByteArray(String str) {
        return str.getBytes(f57358b);
    }

    public static String toStringUtf8(byte[] bArr) {
        return new String(bArr, f57358b);
    }

    public static boolean isValidUtf8(byte[] bArr) {
        return Utf8.m35505t(bArr);
    }

    public static boolean equalsByteBuffer(List<ByteBuffer> list, List<ByteBuffer> list2) {
        if (list.size() != list2.size()) {
            return false;
        }
        for (int i = 0; i < list.size(); i++) {
            if (!equalsByteBuffer(list.get(i), list2.get(i))) {
                return false;
            }
        }
        return true;
    }

    public static int hashCode(byte[] bArr) {
        return m35784c(bArr, 0, bArr.length);
    }

    public static int hashCodeByteBuffer(ByteBuffer byteBuffer) {
        if (byteBuffer.hasArray()) {
            int m35782e = m35782e(byteBuffer.capacity(), byteBuffer.array(), byteBuffer.arrayOffset(), byteBuffer.capacity());
            if (m35782e == 0) {
                return 1;
            }
            return m35782e;
        }
        int capacity = byteBuffer.capacity() <= 4096 ? byteBuffer.capacity() : 4096;
        byte[] bArr = new byte[capacity];
        ByteBuffer duplicate = byteBuffer.duplicate();
        ByteBuffer byteBuffer2 = (ByteBuffer) duplicate.clear();
        int capacity2 = byteBuffer.capacity();
        while (duplicate.remaining() > 0) {
            int remaining = duplicate.remaining() <= capacity ? duplicate.remaining() : capacity;
            duplicate.get(bArr, 0, remaining);
            capacity2 = m35782e(capacity2, bArr, 0, remaining);
        }
        if (capacity2 == 0) {
            return 1;
        }
        return capacity2;
    }
}
