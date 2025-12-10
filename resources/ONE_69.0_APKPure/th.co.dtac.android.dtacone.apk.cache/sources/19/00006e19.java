package androidx.datastore.preferences.protobuf;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes2.dex */
public class LazyStringArrayList extends AbstractC4404a implements LazyStringList, RandomAccess {
    public static final LazyStringList EMPTY;

    /* renamed from: c */
    public static final LazyStringArrayList f34926c;

    /* renamed from: b */
    public final List f34927b;

    /* renamed from: androidx.datastore.preferences.protobuf.LazyStringArrayList$a */
    /* loaded from: classes2.dex */
    public static class C4364a extends AbstractList implements RandomAccess {

        /* renamed from: a */
        public final LazyStringArrayList f34928a;

        public C4364a(LazyStringArrayList lazyStringArrayList) {
            this.f34928a = lazyStringArrayList;
        }

        @Override // java.util.AbstractList, java.util.List
        /* renamed from: a */
        public void add(int i, byte[] bArr) {
            this.f34928a.m55660h(i, bArr);
            ((AbstractList) this).modCount++;
        }

        @Override // java.util.AbstractList, java.util.List
        /* renamed from: b */
        public byte[] get(int i) {
            return this.f34928a.getByteArray(i);
        }

        @Override // java.util.AbstractList, java.util.List
        /* renamed from: c */
        public byte[] remove(int i) {
            String remove = this.f34928a.remove(i);
            ((AbstractList) this).modCount++;
            return LazyStringArrayList.m55659i(remove);
        }

        @Override // java.util.AbstractList, java.util.List
        /* renamed from: d */
        public byte[] set(int i, byte[] bArr) {
            Object m55655m = this.f34928a.m55655m(i, bArr);
            ((AbstractList) this).modCount++;
            return LazyStringArrayList.m55659i(m55655m);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f34928a.size();
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.LazyStringArrayList$b */
    /* loaded from: classes2.dex */
    public static class C4365b extends AbstractList implements RandomAccess {

        /* renamed from: a */
        public final LazyStringArrayList f34929a;

        public C4365b(LazyStringArrayList lazyStringArrayList) {
            this.f34929a = lazyStringArrayList;
        }

        @Override // java.util.AbstractList, java.util.List
        /* renamed from: a */
        public void add(int i, ByteString byteString) {
            this.f34929a.m55661g(i, byteString);
            ((AbstractList) this).modCount++;
        }

        @Override // java.util.AbstractList, java.util.List
        /* renamed from: b */
        public ByteString get(int i) {
            return this.f34929a.getByteString(i);
        }

        @Override // java.util.AbstractList, java.util.List
        /* renamed from: c */
        public ByteString remove(int i) {
            String remove = this.f34929a.remove(i);
            ((AbstractList) this).modCount++;
            return LazyStringArrayList.m55658j(remove);
        }

        @Override // java.util.AbstractList, java.util.List
        /* renamed from: d */
        public ByteString set(int i, ByteString byteString) {
            Object m55656l = this.f34929a.m55656l(i, byteString);
            ((AbstractList) this).modCount++;
            return LazyStringArrayList.m55658j(m55656l);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f34929a.size();
        }
    }

    static {
        LazyStringArrayList lazyStringArrayList = new LazyStringArrayList();
        f34926c = lazyStringArrayList;
        lazyStringArrayList.makeImmutable();
        EMPTY = lazyStringArrayList;
    }

    public LazyStringArrayList() {
        this(10);
    }

    /* renamed from: i */
    public static byte[] m55659i(Object obj) {
        if (obj instanceof byte[]) {
            return (byte[]) obj;
        }
        if (obj instanceof String) {
            return Internal.toByteArray((String) obj);
        }
        return ((ByteString) obj).toByteArray();
    }

    /* renamed from: j */
    public static ByteString m55658j(Object obj) {
        if (obj instanceof ByteString) {
            return (ByteString) obj;
        }
        if (obj instanceof String) {
            return ByteString.copyFromUtf8((String) obj);
        }
        return ByteString.copyFrom((byte[]) obj);
    }

    /* renamed from: k */
    public static String m55657k(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof ByteString) {
            return ((ByteString) obj).toStringUtf8();
        }
        return Internal.toStringUtf8((byte[]) obj);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC4404a, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends String> collection) {
        return addAll(size(), collection);
    }

    @Override // androidx.datastore.preferences.protobuf.LazyStringList
    public boolean addAllByteArray(Collection<byte[]> collection) {
        ensureIsMutable();
        boolean addAll = this.f34927b.addAll(collection);
        ((AbstractList) this).modCount++;
        return addAll;
    }

    @Override // androidx.datastore.preferences.protobuf.LazyStringList
    public boolean addAllByteString(Collection<? extends ByteString> collection) {
        ensureIsMutable();
        boolean addAll = this.f34927b.addAll(collection);
        ((AbstractList) this).modCount++;
        return addAll;
    }

    @Override // androidx.datastore.preferences.protobuf.LazyStringList
    public List<byte[]> asByteArrayList() {
        return new C4364a(this);
    }

    @Override // androidx.datastore.preferences.protobuf.ProtocolStringList
    public List<ByteString> asByteStringList() {
        return new C4365b(this);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC4404a, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        ensureIsMutable();
        this.f34927b.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC4404a, java.util.AbstractList, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    /* renamed from: g */
    public final void m55661g(int i, ByteString byteString) {
        ensureIsMutable();
        this.f34927b.add(i, byteString);
        ((AbstractList) this).modCount++;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.datastore.preferences.protobuf.LazyStringList
    public byte[] getByteArray(int i) {
        Object obj = this.f34927b.get(i);
        byte[] m55659i = m55659i(obj);
        if (m55659i != obj) {
            this.f34927b.set(i, m55659i);
        }
        return m55659i;
    }

    @Override // androidx.datastore.preferences.protobuf.LazyStringList
    public ByteString getByteString(int i) {
        Object obj = this.f34927b.get(i);
        ByteString m55658j = m55658j(obj);
        if (m55658j != obj) {
            this.f34927b.set(i, m55658j);
        }
        return m55658j;
    }

    @Override // androidx.datastore.preferences.protobuf.LazyStringList
    public Object getRaw(int i) {
        return this.f34927b.get(i);
    }

    @Override // androidx.datastore.preferences.protobuf.LazyStringList
    public List<?> getUnderlyingElements() {
        return Collections.unmodifiableList(this.f34927b);
    }

    @Override // androidx.datastore.preferences.protobuf.LazyStringList
    public LazyStringList getUnmodifiableView() {
        if (isModifiable()) {
            return new UnmodifiableLazyStringList(this);
        }
        return this;
    }

    /* renamed from: h */
    public final void m55660h(int i, byte[] bArr) {
        ensureIsMutable();
        this.f34927b.add(i, bArr);
        ((AbstractList) this).modCount++;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC4404a, java.util.AbstractList, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC4404a, androidx.datastore.preferences.protobuf.Internal.ProtobufList
    public /* bridge */ /* synthetic */ boolean isModifiable() {
        return super.isModifiable();
    }

    /* renamed from: l */
    public final Object m55656l(int i, ByteString byteString) {
        ensureIsMutable();
        return this.f34927b.set(i, byteString);
    }

    /* renamed from: m */
    public final Object m55655m(int i, byte[] bArr) {
        ensureIsMutable();
        return this.f34927b.set(i, bArr);
    }

    @Override // androidx.datastore.preferences.protobuf.LazyStringList
    public void mergeFrom(LazyStringList lazyStringList) {
        ensureIsMutable();
        for (Object obj : lazyStringList.getUnderlyingElements()) {
            if (obj instanceof byte[]) {
                byte[] bArr = (byte[]) obj;
                this.f34927b.add(Arrays.copyOf(bArr, bArr.length));
            } else {
                this.f34927b.add(obj);
            }
        }
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC4404a, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean removeAll(Collection collection) {
        return super.removeAll(collection);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC4404a, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean retainAll(Collection collection) {
        return super.retainAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f34927b.size();
    }

    public LazyStringArrayList(int i) {
        this(new ArrayList(i));
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i, String str) {
        ensureIsMutable();
        this.f34927b.add(i, str);
        ((AbstractList) this).modCount++;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC4404a, java.util.AbstractList, java.util.List
    public boolean addAll(int i, Collection<? extends String> collection) {
        ensureIsMutable();
        if (collection instanceof LazyStringList) {
            collection = ((LazyStringList) collection).getUnderlyingElements();
        }
        boolean addAll = this.f34927b.addAll(i, collection);
        ((AbstractList) this).modCount++;
        return addAll;
    }

    @Override // java.util.AbstractList, java.util.List
    public String get(int i) {
        Object obj = this.f34927b.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof ByteString) {
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.f34927b.set(i, stringUtf8);
            }
            return stringUtf8;
        }
        byte[] bArr = (byte[]) obj;
        String stringUtf82 = Internal.toStringUtf8(bArr);
        if (Internal.isValidUtf8(bArr)) {
            this.f34927b.set(i, stringUtf82);
        }
        return stringUtf82;
    }

    @Override // androidx.datastore.preferences.protobuf.Internal.ProtobufList
    public LazyStringArrayList mutableCopyWithCapacity(int i) {
        if (i >= size()) {
            ArrayList arrayList = new ArrayList(i);
            arrayList.addAll(this.f34927b);
            return new LazyStringArrayList(arrayList);
        }
        throw new IllegalArgumentException();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC4404a, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean remove(Object obj) {
        return super.remove(obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public String set(int i, String str) {
        ensureIsMutable();
        return m55657k(this.f34927b.set(i, str));
    }

    public LazyStringArrayList(LazyStringList lazyStringList) {
        this.f34927b = new ArrayList(lazyStringList.size());
        addAll(lazyStringList);
    }

    @Override // java.util.AbstractList, java.util.List
    public String remove(int i) {
        ensureIsMutable();
        Object remove = this.f34927b.remove(i);
        ((AbstractList) this).modCount++;
        return m55657k(remove);
    }

    @Override // androidx.datastore.preferences.protobuf.LazyStringList
    public void add(ByteString byteString) {
        ensureIsMutable();
        this.f34927b.add(byteString);
        ((AbstractList) this).modCount++;
    }

    @Override // androidx.datastore.preferences.protobuf.LazyStringList
    public void set(int i, ByteString byteString) {
        m55656l(i, byteString);
    }

    public LazyStringArrayList(List<String> list) {
        this(new ArrayList(list));
    }

    @Override // androidx.datastore.preferences.protobuf.LazyStringList
    public void set(int i, byte[] bArr) {
        m55655m(i, bArr);
    }

    public LazyStringArrayList(ArrayList arrayList) {
        this.f34927b = arrayList;
    }

    @Override // androidx.datastore.preferences.protobuf.LazyStringList
    public void add(byte[] bArr) {
        ensureIsMutable();
        this.f34927b.add(bArr);
        ((AbstractList) this).modCount++;
    }
}