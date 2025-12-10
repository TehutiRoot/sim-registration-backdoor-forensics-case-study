package androidx.datastore.preferences.protobuf;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes2.dex */
public class LazyStringArrayList extends AbstractC4422a implements LazyStringList, RandomAccess {
    public static final LazyStringList EMPTY;

    /* renamed from: c */
    public static final LazyStringArrayList f34838c;

    /* renamed from: b */
    public final List f34839b;

    /* renamed from: androidx.datastore.preferences.protobuf.LazyStringArrayList$a */
    /* loaded from: classes2.dex */
    public static class C4382a extends AbstractList implements RandomAccess {

        /* renamed from: a */
        public final LazyStringArrayList f34840a;

        public C4382a(LazyStringArrayList lazyStringArrayList) {
            this.f34840a = lazyStringArrayList;
        }

        @Override // java.util.AbstractList, java.util.List
        /* renamed from: a */
        public void add(int i, byte[] bArr) {
            this.f34840a.m55710h(i, bArr);
            ((AbstractList) this).modCount++;
        }

        @Override // java.util.AbstractList, java.util.List
        /* renamed from: b */
        public byte[] get(int i) {
            return this.f34840a.getByteArray(i);
        }

        @Override // java.util.AbstractList, java.util.List
        /* renamed from: c */
        public byte[] remove(int i) {
            String remove = this.f34840a.remove(i);
            ((AbstractList) this).modCount++;
            return LazyStringArrayList.m55709i(remove);
        }

        @Override // java.util.AbstractList, java.util.List
        /* renamed from: d */
        public byte[] set(int i, byte[] bArr) {
            Object m55705m = this.f34840a.m55705m(i, bArr);
            ((AbstractList) this).modCount++;
            return LazyStringArrayList.m55709i(m55705m);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f34840a.size();
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.LazyStringArrayList$b */
    /* loaded from: classes2.dex */
    public static class C4383b extends AbstractList implements RandomAccess {

        /* renamed from: a */
        public final LazyStringArrayList f34841a;

        public C4383b(LazyStringArrayList lazyStringArrayList) {
            this.f34841a = lazyStringArrayList;
        }

        @Override // java.util.AbstractList, java.util.List
        /* renamed from: a */
        public void add(int i, ByteString byteString) {
            this.f34841a.m55711g(i, byteString);
            ((AbstractList) this).modCount++;
        }

        @Override // java.util.AbstractList, java.util.List
        /* renamed from: b */
        public ByteString get(int i) {
            return this.f34841a.getByteString(i);
        }

        @Override // java.util.AbstractList, java.util.List
        /* renamed from: c */
        public ByteString remove(int i) {
            String remove = this.f34841a.remove(i);
            ((AbstractList) this).modCount++;
            return LazyStringArrayList.m55708j(remove);
        }

        @Override // java.util.AbstractList, java.util.List
        /* renamed from: d */
        public ByteString set(int i, ByteString byteString) {
            Object m55706l = this.f34841a.m55706l(i, byteString);
            ((AbstractList) this).modCount++;
            return LazyStringArrayList.m55708j(m55706l);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f34841a.size();
        }
    }

    static {
        LazyStringArrayList lazyStringArrayList = new LazyStringArrayList();
        f34838c = lazyStringArrayList;
        lazyStringArrayList.makeImmutable();
        EMPTY = lazyStringArrayList;
    }

    public LazyStringArrayList() {
        this(10);
    }

    /* renamed from: i */
    public static byte[] m55709i(Object obj) {
        if (obj instanceof byte[]) {
            return (byte[]) obj;
        }
        if (obj instanceof String) {
            return Internal.toByteArray((String) obj);
        }
        return ((ByteString) obj).toByteArray();
    }

    /* renamed from: j */
    public static ByteString m55708j(Object obj) {
        if (obj instanceof ByteString) {
            return (ByteString) obj;
        }
        if (obj instanceof String) {
            return ByteString.copyFromUtf8((String) obj);
        }
        return ByteString.copyFrom((byte[]) obj);
    }

    /* renamed from: k */
    public static String m55707k(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof ByteString) {
            return ((ByteString) obj).toStringUtf8();
        }
        return Internal.toStringUtf8((byte[]) obj);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC4422a, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends String> collection) {
        return addAll(size(), collection);
    }

    @Override // androidx.datastore.preferences.protobuf.LazyStringList
    public boolean addAllByteArray(Collection<byte[]> collection) {
        ensureIsMutable();
        boolean addAll = this.f34839b.addAll(collection);
        ((AbstractList) this).modCount++;
        return addAll;
    }

    @Override // androidx.datastore.preferences.protobuf.LazyStringList
    public boolean addAllByteString(Collection<? extends ByteString> collection) {
        ensureIsMutable();
        boolean addAll = this.f34839b.addAll(collection);
        ((AbstractList) this).modCount++;
        return addAll;
    }

    @Override // androidx.datastore.preferences.protobuf.LazyStringList
    public List<byte[]> asByteArrayList() {
        return new C4382a(this);
    }

    @Override // androidx.datastore.preferences.protobuf.ProtocolStringList
    public List<ByteString> asByteStringList() {
        return new C4383b(this);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC4422a, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        ensureIsMutable();
        this.f34839b.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC4422a, java.util.AbstractList, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    /* renamed from: g */
    public final void m55711g(int i, ByteString byteString) {
        ensureIsMutable();
        this.f34839b.add(i, byteString);
        ((AbstractList) this).modCount++;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.datastore.preferences.protobuf.LazyStringList
    public byte[] getByteArray(int i) {
        Object obj = this.f34839b.get(i);
        byte[] m55709i = m55709i(obj);
        if (m55709i != obj) {
            this.f34839b.set(i, m55709i);
        }
        return m55709i;
    }

    @Override // androidx.datastore.preferences.protobuf.LazyStringList
    public ByteString getByteString(int i) {
        Object obj = this.f34839b.get(i);
        ByteString m55708j = m55708j(obj);
        if (m55708j != obj) {
            this.f34839b.set(i, m55708j);
        }
        return m55708j;
    }

    @Override // androidx.datastore.preferences.protobuf.LazyStringList
    public Object getRaw(int i) {
        return this.f34839b.get(i);
    }

    @Override // androidx.datastore.preferences.protobuf.LazyStringList
    public List<?> getUnderlyingElements() {
        return Collections.unmodifiableList(this.f34839b);
    }

    @Override // androidx.datastore.preferences.protobuf.LazyStringList
    public LazyStringList getUnmodifiableView() {
        if (isModifiable()) {
            return new UnmodifiableLazyStringList(this);
        }
        return this;
    }

    /* renamed from: h */
    public final void m55710h(int i, byte[] bArr) {
        ensureIsMutable();
        this.f34839b.add(i, bArr);
        ((AbstractList) this).modCount++;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC4422a, java.util.AbstractList, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC4422a, androidx.datastore.preferences.protobuf.Internal.ProtobufList
    public /* bridge */ /* synthetic */ boolean isModifiable() {
        return super.isModifiable();
    }

    /* renamed from: l */
    public final Object m55706l(int i, ByteString byteString) {
        ensureIsMutable();
        return this.f34839b.set(i, byteString);
    }

    /* renamed from: m */
    public final Object m55705m(int i, byte[] bArr) {
        ensureIsMutable();
        return this.f34839b.set(i, bArr);
    }

    @Override // androidx.datastore.preferences.protobuf.LazyStringList
    public void mergeFrom(LazyStringList lazyStringList) {
        ensureIsMutable();
        for (Object obj : lazyStringList.getUnderlyingElements()) {
            if (obj instanceof byte[]) {
                byte[] bArr = (byte[]) obj;
                this.f34839b.add(Arrays.copyOf(bArr, bArr.length));
            } else {
                this.f34839b.add(obj);
            }
        }
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC4422a, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean removeAll(Collection collection) {
        return super.removeAll(collection);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC4422a, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean retainAll(Collection collection) {
        return super.retainAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f34839b.size();
    }

    public LazyStringArrayList(int i) {
        this(new ArrayList(i));
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i, String str) {
        ensureIsMutable();
        this.f34839b.add(i, str);
        ((AbstractList) this).modCount++;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC4422a, java.util.AbstractList, java.util.List
    public boolean addAll(int i, Collection<? extends String> collection) {
        ensureIsMutable();
        if (collection instanceof LazyStringList) {
            collection = ((LazyStringList) collection).getUnderlyingElements();
        }
        boolean addAll = this.f34839b.addAll(i, collection);
        ((AbstractList) this).modCount++;
        return addAll;
    }

    @Override // java.util.AbstractList, java.util.List
    public String get(int i) {
        Object obj = this.f34839b.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof ByteString) {
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.f34839b.set(i, stringUtf8);
            }
            return stringUtf8;
        }
        byte[] bArr = (byte[]) obj;
        String stringUtf82 = Internal.toStringUtf8(bArr);
        if (Internal.isValidUtf8(bArr)) {
            this.f34839b.set(i, stringUtf82);
        }
        return stringUtf82;
    }

    @Override // androidx.datastore.preferences.protobuf.Internal.ProtobufList
    public LazyStringArrayList mutableCopyWithCapacity(int i) {
        if (i >= size()) {
            ArrayList arrayList = new ArrayList(i);
            arrayList.addAll(this.f34839b);
            return new LazyStringArrayList(arrayList);
        }
        throw new IllegalArgumentException();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC4422a, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean remove(Object obj) {
        return super.remove(obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public String set(int i, String str) {
        ensureIsMutable();
        return m55707k(this.f34839b.set(i, str));
    }

    public LazyStringArrayList(LazyStringList lazyStringList) {
        this.f34839b = new ArrayList(lazyStringList.size());
        addAll(lazyStringList);
    }

    @Override // java.util.AbstractList, java.util.List
    public String remove(int i) {
        ensureIsMutable();
        Object remove = this.f34839b.remove(i);
        ((AbstractList) this).modCount++;
        return m55707k(remove);
    }

    @Override // androidx.datastore.preferences.protobuf.LazyStringList
    public void add(ByteString byteString) {
        ensureIsMutable();
        this.f34839b.add(byteString);
        ((AbstractList) this).modCount++;
    }

    @Override // androidx.datastore.preferences.protobuf.LazyStringList
    public void set(int i, ByteString byteString) {
        m55706l(i, byteString);
    }

    public LazyStringArrayList(List<String> list) {
        this(new ArrayList(list));
    }

    @Override // androidx.datastore.preferences.protobuf.LazyStringList
    public void set(int i, byte[] bArr) {
        m55705m(i, bArr);
    }

    public LazyStringArrayList(ArrayList arrayList) {
        this.f34839b = arrayList;
    }

    @Override // androidx.datastore.preferences.protobuf.LazyStringList
    public void add(byte[] bArr) {
        ensureIsMutable();
        this.f34839b.add(bArr);
        ((AbstractList) this).modCount++;
    }
}
