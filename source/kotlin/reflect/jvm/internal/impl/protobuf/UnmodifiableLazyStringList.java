package kotlin.reflect.jvm.internal.impl.protobuf;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* loaded from: classes6.dex */
public class UnmodifiableLazyStringList extends AbstractList<String> implements RandomAccess, LazyStringList {

    /* renamed from: a */
    public final LazyStringList f69754a;

    /* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.UnmodifiableLazyStringList$a */
    /* loaded from: classes6.dex */
    public class C11909a implements ListIterator {

        /* renamed from: a */
        public ListIterator f69755a;

        /* renamed from: b */
        public final /* synthetic */ int f69756b;

        public C11909a(int i) {
            this.f69756b = i;
            this.f69755a = UnmodifiableLazyStringList.this.f69754a.listIterator(i);
        }

        @Override // java.util.ListIterator
        /* renamed from: a */
        public void add(String str) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        /* renamed from: b */
        public String next() {
            return (String) this.f69755a.next();
        }

        @Override // java.util.ListIterator
        /* renamed from: c */
        public String previous() {
            return (String) this.f69755a.previous();
        }

        @Override // java.util.ListIterator
        /* renamed from: d */
        public void set(String str) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.f69755a.hasNext();
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.f69755a.hasPrevious();
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.f69755a.nextIndex();
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.f69755a.previousIndex();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.UnmodifiableLazyStringList$b */
    /* loaded from: classes6.dex */
    public class C11910b implements Iterator {

        /* renamed from: a */
        public Iterator f69758a;

        public C11910b() {
            this.f69758a = UnmodifiableLazyStringList.this.f69754a.iterator();
        }

        @Override // java.util.Iterator
        /* renamed from: a */
        public String next() {
            return (String) this.f69758a.next();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f69758a.hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public UnmodifiableLazyStringList(LazyStringList lazyStringList) {
        this.f69754a = lazyStringList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.LazyStringList
    public void add(ByteString byteString) {
        throw new UnsupportedOperationException();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.LazyStringList
    public ByteString getByteString(int i) {
        return this.f69754a.getByteString(i);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.LazyStringList
    public List<?> getUnderlyingElements() {
        return this.f69754a.getUnderlyingElements();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.LazyStringList
    public LazyStringList getUnmodifiableView() {
        return this;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator<String> iterator() {
        return new C11910b();
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator<String> listIterator(int i) {
        return new C11909a(i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f69754a.size();
    }

    @Override // java.util.AbstractList, java.util.List
    public String get(int i) {
        return this.f69754a.get(i);
    }
}
