package com.google.protobuf;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes4.dex */
public class LazyStringArrayList extends AbstractC8933a implements LazyStringList, RandomAccess {
    public static final LazyStringList EMPTY;

    /* renamed from: c */
    public static final LazyStringArrayList f57379c;

    /* renamed from: b */
    public final List f57380b;

    /* renamed from: com.google.protobuf.LazyStringArrayList$a */
    /* loaded from: classes4.dex */
    public static class C8893a extends AbstractList implements RandomAccess {

        /* renamed from: a */
        public final LazyStringArrayList f57381a;

        public C8893a(LazyStringArrayList lazyStringArrayList) {
            this.f57381a = lazyStringArrayList;
        }

        @Override // java.util.AbstractList, java.util.List
        /* renamed from: a */
        public void add(int i, byte[] bArr) {
            this.f57381a.m35766h(i, bArr);
            ((AbstractList) this).modCount++;
        }

        @Override // java.util.AbstractList, java.util.List
        /* renamed from: b */
        public byte[] get(int i) {
            return this.f57381a.getByteArray(i);
        }

        @Override // java.util.AbstractList, java.util.List
        /* renamed from: c */
        public byte[] remove(int i) {
            String remove = this.f57381a.remove(i);
            ((AbstractList) this).modCount++;
            return LazyStringArrayList.m35765i(remove);
        }

        @Override // java.util.AbstractList, java.util.List
        /* renamed from: d */
        public byte[] set(int i, byte[] bArr) {
            Object m35761m = this.f57381a.m35761m(i, bArr);
            ((AbstractList) this).modCount++;
            return LazyStringArrayList.m35765i(m35761m);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f57381a.size();
        }
    }

    /* renamed from: com.google.protobuf.LazyStringArrayList$b */
    /* loaded from: classes4.dex */
    public static class C8894b extends AbstractList implements RandomAccess {

        /* renamed from: a */
        public final LazyStringArrayList f57382a;

        public C8894b(LazyStringArrayList lazyStringArrayList) {
            this.f57382a = lazyStringArrayList;
        }

        @Override // java.util.AbstractList, java.util.List
        /* renamed from: a */
        public void add(int i, ByteString byteString) {
            this.f57382a.m35767g(i, byteString);
            ((AbstractList) this).modCount++;
        }

        @Override // java.util.AbstractList, java.util.List
        /* renamed from: b */
        public ByteString get(int i) {
            return this.f57382a.getByteString(i);
        }

        @Override // java.util.AbstractList, java.util.List
        /* renamed from: c */
        public ByteString remove(int i) {
            String remove = this.f57382a.remove(i);
            ((AbstractList) this).modCount++;
            return LazyStringArrayList.m35764j(remove);
        }

        @Override // java.util.AbstractList, java.util.List
        /* renamed from: d */
        public ByteString set(int i, ByteString byteString) {
            Object m35762l = this.f57382a.m35762l(i, byteString);
            ((AbstractList) this).modCount++;
            return LazyStringArrayList.m35764j(m35762l);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f57382a.size();
        }
    }

    static {
        LazyStringArrayList lazyStringArrayList = new LazyStringArrayList();
        f57379c = lazyStringArrayList;
        lazyStringArrayList.makeImmutable();
        EMPTY = lazyStringArrayList;
    }

    public LazyStringArrayList() {
        this(10);
    }

    /* renamed from: i */
    public static byte[] m35765i(Object obj) {
        if (obj instanceof byte[]) {
            return (byte[]) obj;
        }
        if (obj instanceof String) {
            return Internal.toByteArray((String) obj);
        }
        return ((ByteString) obj).toByteArray();
    }

    /* renamed from: j */
    public static ByteString m35764j(Object obj) {
        if (obj instanceof ByteString) {
            return (ByteString) obj;
        }
        if (obj instanceof String) {
            return ByteString.copyFromUtf8((String) obj);
        }
        return ByteString.copyFrom((byte[]) obj);
    }

    /* renamed from: k */
    public static String m35763k(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof ByteString) {
            return ((ByteString) obj).toStringUtf8();
        }
        return Internal.toStringUtf8((byte[]) obj);
    }

    @Override // com.google.protobuf.AbstractC8933a, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends String> collection) {
        return addAll(size(), collection);
    }

    @Override // com.google.protobuf.LazyStringList
    public boolean addAllByteArray(Collection<byte[]> collection) {
        ensureIsMutable();
        boolean addAll = this.f57380b.addAll(collection);
        ((AbstractList) this).modCount++;
        return addAll;
    }

    @Override // com.google.protobuf.LazyStringList
    public boolean addAllByteString(Collection<? extends ByteString> collection) {
        ensureIsMutable();
        boolean addAll = this.f57380b.addAll(collection);
        ((AbstractList) this).modCount++;
        return addAll;
    }

    @Override // com.google.protobuf.LazyStringList
    public List<byte[]> asByteArrayList() {
        return new C8893a(this);
    }

    @Override // com.google.protobuf.ProtocolStringList
    public List<ByteString> asByteStringList() {
        return new C8894b(this);
    }

    @Override // com.google.protobuf.AbstractC8933a, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        ensureIsMutable();
        this.f57380b.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.protobuf.AbstractC8933a, java.util.AbstractList, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    /* renamed from: g */
    public final void m35767g(int i, ByteString byteString) {
        ensureIsMutable();
        this.f57380b.add(i, byteString);
        ((AbstractList) this).modCount++;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.protobuf.LazyStringList
    public byte[] getByteArray(int i) {
        Object obj = this.f57380b.get(i);
        byte[] m35765i = m35765i(obj);
        if (m35765i != obj) {
            this.f57380b.set(i, m35765i);
        }
        return m35765i;
    }

    @Override // com.google.protobuf.LazyStringList
    public ByteString getByteString(int i) {
        Object obj = this.f57380b.get(i);
        ByteString m35764j = m35764j(obj);
        if (m35764j != obj) {
            this.f57380b.set(i, m35764j);
        }
        return m35764j;
    }

    @Override // com.google.protobuf.LazyStringList
    public Object getRaw(int i) {
        return this.f57380b.get(i);
    }

    @Override // com.google.protobuf.LazyStringList
    public List<?> getUnderlyingElements() {
        return Collections.unmodifiableList(this.f57380b);
    }

    @Override // com.google.protobuf.LazyStringList
    public LazyStringList getUnmodifiableView() {
        if (isModifiable()) {
            return new UnmodifiableLazyStringList(this);
        }
        return this;
    }

    /* renamed from: h */
    public final void m35766h(int i, byte[] bArr) {
        ensureIsMutable();
        this.f57380b.add(i, bArr);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.protobuf.AbstractC8933a, java.util.AbstractList, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // com.google.protobuf.AbstractC8933a, com.google.protobuf.Internal.ProtobufList
    public /* bridge */ /* synthetic */ boolean isModifiable() {
        return super.isModifiable();
    }

    /* renamed from: l */
    public final Object m35762l(int i, ByteString byteString) {
        ensureIsMutable();
        return this.f57380b.set(i, byteString);
    }

    /* renamed from: m */
    public final Object m35761m(int i, byte[] bArr) {
        ensureIsMutable();
        return this.f57380b.set(i, bArr);
    }

    @Override // com.google.protobuf.LazyStringList
    public void mergeFrom(LazyStringList lazyStringList) {
        ensureIsMutable();
        for (Object obj : lazyStringList.getUnderlyingElements()) {
            if (obj instanceof byte[]) {
                byte[] bArr = (byte[]) obj;
                this.f57380b.add(Arrays.copyOf(bArr, bArr.length));
            } else {
                this.f57380b.add(obj);
            }
        }
    }

    @Override // com.google.protobuf.AbstractC8933a, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean removeAll(Collection collection) {
        return super.removeAll(collection);
    }

    @Override // com.google.protobuf.AbstractC8933a, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean retainAll(Collection collection) {
        return super.retainAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f57380b.size();
    }

    public LazyStringArrayList(int i) {
        this(new ArrayList(i));
    }

    @Override // com.google.protobuf.AbstractC8933a, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        return super.add(obj);
    }

    @Override // com.google.protobuf.AbstractC8933a, java.util.AbstractList, java.util.List
    public boolean addAll(int i, Collection<? extends String> collection) {
        ensureIsMutable();
        if (collection instanceof LazyStringList) {
            collection = ((LazyStringList) collection).getUnderlyingElements();
        }
        boolean addAll = this.f57380b.addAll(i, collection);
        ((AbstractList) this).modCount++;
        return addAll;
    }

    @Override // java.util.AbstractList, java.util.List
    public String get(int i) {
        Object obj = this.f57380b.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof ByteString) {
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.f57380b.set(i, stringUtf8);
            }
            return stringUtf8;
        }
        byte[] bArr = (byte[]) obj;
        String stringUtf82 = Internal.toStringUtf8(bArr);
        if (Internal.isValidUtf8(bArr)) {
            this.f57380b.set(i, stringUtf82);
        }
        return stringUtf82;
    }

    @Override // com.google.protobuf.Internal.ProtobufList
    public LazyStringArrayList mutableCopyWithCapacity(int i) {
        if (i >= size()) {
            ArrayList arrayList = new ArrayList(i);
            arrayList.addAll(this.f57380b);
            return new LazyStringArrayList(arrayList);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.protobuf.AbstractC8933a, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean remove(Object obj) {
        return super.remove(obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public String set(int i, String str) {
        ensureIsMutable();
        return m35763k(this.f57380b.set(i, str));
    }

    public LazyStringArrayList(LazyStringList lazyStringList) {
        this.f57380b = new ArrayList(lazyStringList.size());
        addAll(lazyStringList);
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i, String str) {
        ensureIsMutable();
        this.f57380b.add(i, str);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.protobuf.AbstractC8933a, java.util.AbstractList, java.util.List
    public String remove(int i) {
        ensureIsMutable();
        Object remove = this.f57380b.remove(i);
        ((AbstractList) this).modCount++;
        return m35763k(remove);
    }

    @Override // com.google.protobuf.LazyStringList
    public void set(int i, ByteString byteString) {
        m35762l(i, byteString);
    }

    public LazyStringArrayList(List<String> list) {
        this(new ArrayList(list));
    }

    @Override // com.google.protobuf.LazyStringList
    public void add(ByteString byteString) {
        ensureIsMutable();
        this.f57380b.add(byteString);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.protobuf.LazyStringList
    public void set(int i, byte[] bArr) {
        m35761m(i, bArr);
    }

    public LazyStringArrayList(ArrayList arrayList) {
        this.f57380b = arrayList;
    }

    @Override // com.google.protobuf.LazyStringList
    public void add(byte[] bArr) {
        ensureIsMutable();
        this.f57380b.add(bArr);
        ((AbstractList) this).modCount++;
    }
}
