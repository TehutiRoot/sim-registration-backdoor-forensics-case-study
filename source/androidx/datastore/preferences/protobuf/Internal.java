package androidx.datastore.preferences.protobuf;

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

/* loaded from: classes2.dex */
public final class Internal {
    public static final byte[] EMPTY_BYTE_ARRAY;
    public static final ByteBuffer EMPTY_BYTE_BUFFER;
    public static final CodedInputStream EMPTY_CODED_INPUT_STREAM;

    /* renamed from: a */
    public static final Charset f34817a = Charset.forName("UTF-8");

    /* renamed from: b */
    public static final Charset f34818b = Charset.forName("ISO-8859-1");

    /* loaded from: classes2.dex */
    public interface BooleanList extends ProtobufList<Boolean> {
        void addBoolean(boolean z);

        boolean getBoolean(int i);

        @Override // androidx.datastore.preferences.protobuf.Internal.ProtobufList
        ProtobufList<Boolean> mutableCopyWithCapacity(int i);

        boolean setBoolean(int i, boolean z);
    }

    /* loaded from: classes2.dex */
    public interface DoubleList extends ProtobufList<Double> {
        void addDouble(double d);

        double getDouble(int i);

        @Override // androidx.datastore.preferences.protobuf.Internal.ProtobufList
        ProtobufList<Double> mutableCopyWithCapacity(int i);

        double setDouble(int i, double d);
    }

    /* loaded from: classes2.dex */
    public interface EnumLite {
        int getNumber();
    }

    /* loaded from: classes2.dex */
    public interface EnumLiteMap<T extends EnumLite> {
        T findValueByNumber(int i);
    }

    /* loaded from: classes2.dex */
    public interface EnumVerifier {
        boolean isInRange(int i);
    }

    /* loaded from: classes2.dex */
    public interface FloatList extends ProtobufList<Float> {
        void addFloat(float f);

        float getFloat(int i);

        @Override // androidx.datastore.preferences.protobuf.Internal.ProtobufList
        ProtobufList<Float> mutableCopyWithCapacity(int i);

        float setFloat(int i, float f);
    }

    /* loaded from: classes2.dex */
    public interface IntList extends ProtobufList<Integer> {
        void addInt(int i);

        int getInt(int i);

        @Override // androidx.datastore.preferences.protobuf.Internal.ProtobufList
        ProtobufList<Integer> mutableCopyWithCapacity(int i);

        int setInt(int i, int i2);
    }

    /* loaded from: classes2.dex */
    public static class ListAdapter<F, T> extends AbstractList<T> {

        /* renamed from: a */
        public final List f34819a;

        /* renamed from: b */
        public final Converter f34820b;

        /* loaded from: classes2.dex */
        public interface Converter<F, T> {
            T convert(F f);
        }

        public ListAdapter(List<F> list, Converter<F, T> converter) {
            this.f34819a = list;
            this.f34820b = converter;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.AbstractList, java.util.List
        public T get(int i) {
            return (T) this.f34820b.convert(this.f34819a.get(i));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f34819a.size();
        }
    }

    /* loaded from: classes2.dex */
    public interface LongList extends ProtobufList<Long> {
        void addLong(long j);

        long getLong(int i);

        @Override // androidx.datastore.preferences.protobuf.Internal.ProtobufList
        ProtobufList<Long> mutableCopyWithCapacity(int i);

        long setLong(int i, long j);
    }

    /* loaded from: classes2.dex */
    public static class MapAdapter<K, V, RealValue> extends AbstractMap<K, V> {

        /* renamed from: a */
        public final Map f34821a;

        /* renamed from: b */
        public final Converter f34822b;

        /* loaded from: classes2.dex */
        public interface Converter<A, B> {
            A doBackward(B b);

            B doForward(A a);
        }

        /* renamed from: androidx.datastore.preferences.protobuf.Internal$MapAdapter$a */
        /* loaded from: classes2.dex */
        public static class C4375a implements Converter {

            /* renamed from: a */
            public final /* synthetic */ EnumLiteMap f34823a;

            /* renamed from: b */
            public final /* synthetic */ EnumLite f34824b;

            public C4375a(EnumLiteMap enumLiteMap, EnumLite enumLite) {
                this.f34823a = enumLiteMap;
                this.f34824b = enumLite;
            }

            @Override // androidx.datastore.preferences.protobuf.Internal.MapAdapter.Converter
            /* renamed from: a */
            public Integer doBackward(EnumLite enumLite) {
                return Integer.valueOf(enumLite.getNumber());
            }

            @Override // androidx.datastore.preferences.protobuf.Internal.MapAdapter.Converter
            /* renamed from: b */
            public EnumLite doForward(Integer num) {
                EnumLite findValueByNumber = this.f34823a.findValueByNumber(num.intValue());
                if (findValueByNumber == null) {
                    return this.f34824b;
                }
                return findValueByNumber;
            }
        }

        /* renamed from: androidx.datastore.preferences.protobuf.Internal$MapAdapter$b */
        /* loaded from: classes2.dex */
        public class C4376b implements Map.Entry {

            /* renamed from: a */
            public final Map.Entry f34825a;

            public C4376b(Map.Entry entry) {
                this.f34825a = entry;
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
                return this.f34825a.getKey();
            }

            @Override // java.util.Map.Entry
            public Object getValue() {
                return MapAdapter.this.f34822b.doForward(this.f34825a.getValue());
            }

            @Override // java.util.Map.Entry
            public int hashCode() {
                return this.f34825a.hashCode();
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Map.Entry
            public Object setValue(Object obj) {
                Object value = this.f34825a.setValue(MapAdapter.this.f34822b.doBackward(obj));
                if (value == null) {
                    return null;
                }
                return MapAdapter.this.f34822b.doForward(value);
            }
        }

        /* renamed from: androidx.datastore.preferences.protobuf.Internal$MapAdapter$c */
        /* loaded from: classes2.dex */
        public class C4377c implements Iterator {

            /* renamed from: a */
            public final Iterator f34827a;

            public C4377c(Iterator it) {
                this.f34827a = it;
            }

            @Override // java.util.Iterator
            /* renamed from: a */
            public Map.Entry next() {
                return new C4376b((Map.Entry) this.f34827a.next());
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.f34827a.hasNext();
            }

            @Override // java.util.Iterator
            public void remove() {
                this.f34827a.remove();
            }
        }

        /* renamed from: androidx.datastore.preferences.protobuf.Internal$MapAdapter$d */
        /* loaded from: classes2.dex */
        public class C4378d extends AbstractSet {

            /* renamed from: a */
            public final Set f34829a;

            public C4378d(Set set) {
                this.f34829a = set;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator iterator() {
                return new C4377c(this.f34829a.iterator());
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public int size() {
                return this.f34829a.size();
            }
        }

        public MapAdapter(Map<K, RealValue> map, Converter<RealValue, V> converter) {
            this.f34821a = map;
            this.f34822b = converter;
        }

        public static <T extends EnumLite> Converter<Integer, T> newEnumConverter(EnumLiteMap<T> enumLiteMap, T t) {
            return new C4375a(enumLiteMap, t);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Set<Map.Entry<K, V>> entrySet() {
            return new C4378d(this.f34821a.entrySet());
        }

        @Override // java.util.AbstractMap, java.util.Map
        public V get(Object obj) {
            Object obj2 = this.f34821a.get(obj);
            if (obj2 == null) {
                return null;
            }
            return (V) this.f34822b.doForward(obj2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.AbstractMap, java.util.Map
        public V put(K k, V v) {
            Object put = this.f34821a.put(k, this.f34822b.doBackward(v));
            if (put == null) {
                return null;
            }
            return (V) this.f34822b.doForward(put);
        }
    }

    /* loaded from: classes2.dex */
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
    public static Object m55730a(Object obj) {
        obj.getClass();
        return obj;
    }

    /* renamed from: b */
    public static Object m55729b(Object obj, String str) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(str);
    }

    public static byte[] byteArrayDefaultValue(String str) {
        return str.getBytes(f34818b);
    }

    public static ByteBuffer byteBufferDefaultValue(String str) {
        return ByteBuffer.wrap(byteArrayDefaultValue(str));
    }

    public static ByteString bytesDefaultValue(String str) {
        return ByteString.copyFrom(str.getBytes(f34818b));
    }

    /* renamed from: c */
    public static int m55728c(byte[] bArr, int i, int i2) {
        int m55726e = m55726e(i2, bArr, i, i2);
        if (m55726e == 0) {
            return 1;
        }
        return m55726e;
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
    public static Object m55727d(Object obj, Object obj2) {
        return ((MessageLite) obj).toBuilder().mergeFrom((MessageLite) obj2).buildPartial();
    }

    /* renamed from: e */
    public static int m55726e(int i, byte[] bArr, int i2, int i3) {
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
        return byteBuffer.duplicate().clear().equals(byteBuffer2.duplicate().clear());
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
        return new String(str.getBytes(f34818b), f34817a);
    }

    public static byte[] toByteArray(String str) {
        return str.getBytes(f34817a);
    }

    public static String toStringUtf8(byte[] bArr) {
        return new String(bArr, f34817a);
    }

    public static boolean isValidUtf8(byte[] bArr) {
        return Utf8.m55423t(bArr);
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
        return m55728c(bArr, 0, bArr.length);
    }

    public static int hashCodeByteBuffer(ByteBuffer byteBuffer) {
        if (byteBuffer.hasArray()) {
            int m55726e = m55726e(byteBuffer.capacity(), byteBuffer.array(), byteBuffer.arrayOffset(), byteBuffer.capacity());
            if (m55726e == 0) {
                return 1;
            }
            return m55726e;
        }
        int capacity = byteBuffer.capacity() <= 4096 ? byteBuffer.capacity() : 4096;
        byte[] bArr = new byte[capacity];
        ByteBuffer duplicate = byteBuffer.duplicate();
        duplicate.clear();
        int capacity2 = byteBuffer.capacity();
        while (duplicate.remaining() > 0) {
            int remaining = duplicate.remaining() <= capacity ? duplicate.remaining() : capacity;
            duplicate.get(bArr, 0, remaining);
            capacity2 = m55726e(capacity2, bArr, 0, remaining);
        }
        if (capacity2 == 0) {
            return 1;
        }
        return capacity2;
    }
}
