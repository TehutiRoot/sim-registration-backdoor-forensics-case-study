package org.bson;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.AbstractList;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import org.bson.assertions.Assertions;
import org.bson.p044io.ByteBufferBsonInput;

/* loaded from: classes6.dex */
public class RawBsonArray extends BsonArray implements Serializable {
    private static final String IMMUTABLE_MSG = "RawBsonArray instances are immutable";
    private static final long serialVersionUID = 2;
    private final transient C12908a delegate;

    /* loaded from: classes6.dex */
    public static class SerializationProxy implements Serializable {
        private static final long serialVersionUID = 1;
        private final byte[] bytes;

        public SerializationProxy(byte[] bArr, int i, int i2) {
            if (bArr.length == i2) {
                this.bytes = bArr;
                return;
            }
            byte[] bArr2 = new byte[i2];
            this.bytes = bArr2;
            System.arraycopy(bArr, i, bArr2, 0, i2);
        }

        private Object readResolve() {
            return new RawBsonArray(this.bytes);
        }
    }

    /* renamed from: org.bson.RawBsonArray$a */
    /* loaded from: classes6.dex */
    public static class C12908a extends AbstractList {

        /* renamed from: a */
        public Integer f75794a;

        /* renamed from: b */
        public final byte[] f75795b;

        /* renamed from: c */
        public final int f75796c;

        /* renamed from: d */
        public final int f75797d;

        /* renamed from: org.bson.RawBsonArray$a$a */
        /* loaded from: classes6.dex */
        public class C12909a implements Iterator {

            /* renamed from: a */
            public int f75798a;

            /* renamed from: b */
            public BsonBinaryReader f75799b;

            /* renamed from: c */
            public int f75800c;

            public C12909a(C12908a c12908a) {
                this(0);
            }

            /* renamed from: a */
            public int m24304a() {
                return this.f75798a;
            }

            @Override // java.util.Iterator
            /* renamed from: b */
            public BsonValue next() {
                while (this.f75798a > this.f75800c && this.f75799b.readBsonType() != BsonType.END_OF_DOCUMENT) {
                    this.f75799b.skipName();
                    this.f75799b.skipValue();
                    this.f75800c++;
                }
                if (this.f75799b.readBsonType() != BsonType.END_OF_DOCUMENT) {
                    this.f75799b.skipName();
                    int i = this.f75798a + 1;
                    this.f75798a = i;
                    this.f75800c = i;
                    return AbstractC18396Rr1.m66409a(C12908a.this.f75795b, this.f75799b);
                }
                this.f75799b.close();
                throw new NoSuchElementException();
            }

            /* renamed from: c */
            public void m24302c(int i) {
                this.f75798a = i;
                this.f75800c = 0;
                BsonBinaryReader bsonBinaryReader = this.f75799b;
                if (bsonBinaryReader != null) {
                    bsonBinaryReader.close();
                }
                BsonBinaryReader m24307e = C12908a.this.m24307e();
                this.f75799b = m24307e;
                m24307e.readStartDocument();
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                boolean z;
                if (this.f75798a != C12908a.this.size()) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    this.f75799b.close();
                }
                return z;
            }

            @Override // java.util.Iterator
            public void remove() {
                throw new UnsupportedOperationException(RawBsonArray.IMMUTABLE_MSG);
            }

            public C12909a(int i) {
                this.f75798a = 0;
                this.f75800c = 0;
                m24302c(i);
            }
        }

        /* renamed from: org.bson.RawBsonArray$a$b */
        /* loaded from: classes6.dex */
        public class C12910b extends C12909a implements ListIterator {
            public C12910b(int i) {
                super(i);
            }

            @Override // java.util.ListIterator
            /* renamed from: d */
            public void add(BsonValue bsonValue) {
                throw new UnsupportedOperationException(RawBsonArray.IMMUTABLE_MSG);
            }

            @Override // java.util.ListIterator
            /* renamed from: e */
            public BsonValue previous() {
                try {
                    BsonValue bsonValue = C12908a.this.get(previousIndex());
                    m24302c(previousIndex());
                    return bsonValue;
                } catch (IndexOutOfBoundsException unused) {
                    throw new NoSuchElementException();
                }
            }

            @Override // java.util.ListIterator
            /* renamed from: f */
            public void set(BsonValue bsonValue) {
                throw new UnsupportedOperationException(RawBsonArray.IMMUTABLE_MSG);
            }

            @Override // java.util.ListIterator
            public boolean hasPrevious() {
                if (m24304a() != 0) {
                    return true;
                }
                return false;
            }

            @Override // java.util.ListIterator
            public int nextIndex() {
                return m24304a();
            }

            @Override // java.util.ListIterator
            public int previousIndex() {
                return m24304a() - 1;
            }
        }

        public C12908a(byte[] bArr, int i, int i2) {
            boolean z;
            boolean z2;
            boolean z3;
            Assertions.notNull("bytes", bArr);
            if (i >= 0) {
                z = true;
            } else {
                z = false;
            }
            Assertions.isTrueArgument("offset >= 0", z);
            if (i < bArr.length) {
                z2 = true;
            } else {
                z2 = false;
            }
            Assertions.isTrueArgument("offset < bytes.length", z2);
            if (i2 <= bArr.length - i) {
                z3 = true;
            } else {
                z3 = false;
            }
            Assertions.isTrueArgument("length <= bytes.length - offset", z3);
            Assertions.isTrueArgument("length >= 5", i2 >= 5);
            this.f75795b = bArr;
            this.f75796c = i;
            this.f75797d = i2;
        }

        /* renamed from: e */
        public final BsonBinaryReader m24307e() {
            return new BsonBinaryReader(new ByteBufferBsonInput(m24305g()));
        }

        @Override // java.util.AbstractList, java.util.List
        /* renamed from: f */
        public BsonValue get(int i) {
            if (i >= 0) {
                BsonBinaryReader m24307e = m24307e();
                try {
                    m24307e.readStartDocument();
                    int i2 = 0;
                    while (m24307e.readBsonType() != BsonType.END_OF_DOCUMENT) {
                        m24307e.skipName();
                        if (i2 == i) {
                            return AbstractC18396Rr1.m66409a(this.f75795b, m24307e);
                        }
                        m24307e.skipValue();
                        i2++;
                    }
                    m24307e.readEndDocument();
                    m24307e.close();
                    throw new IndexOutOfBoundsException();
                } finally {
                    m24307e.close();
                }
            }
            throw new IndexOutOfBoundsException();
        }

        /* renamed from: g */
        public ByteBuf m24305g() {
            ByteBuffer wrap = ByteBuffer.wrap(this.f75795b, this.f75796c, this.f75797d);
            wrap.order(ByteOrder.LITTLE_ENDIAN);
            return new ByteBufNIO(wrap);
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
        public Iterator iterator() {
            return new C12909a(this);
        }

        @Override // java.util.AbstractList, java.util.List
        public ListIterator listIterator() {
            return new C12910b(0);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            Integer num = this.f75794a;
            if (num != null) {
                return num.intValue();
            }
            BsonBinaryReader m24307e = m24307e();
            try {
                m24307e.readStartDocument();
                int i = 0;
                while (m24307e.readBsonType() != BsonType.END_OF_DOCUMENT) {
                    i++;
                    m24307e.readName();
                    m24307e.skipValue();
                }
                m24307e.readEndDocument();
                m24307e.close();
                Integer valueOf = Integer.valueOf(i);
                this.f75794a = valueOf;
                return valueOf.intValue();
            } catch (Throwable th2) {
                m24307e.close();
                throw th2;
            }
        }

        @Override // java.util.AbstractList, java.util.List
        public ListIterator listIterator(int i) {
            return new C12910b(i);
        }
    }

    public RawBsonArray(byte[] bArr) {
        this((byte[]) Assertions.notNull("bytes", bArr), 0, bArr.length);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Proxy required");
    }

    private Object writeReplace() {
        return new SerializationProxy(this.delegate.f75795b, this.delegate.f75796c, this.delegate.f75797d);
    }

    @Override // org.bson.BsonArray, java.util.List, java.util.Collection
    public boolean addAll(Collection<? extends BsonValue> collection) {
        throw new UnsupportedOperationException(IMMUTABLE_MSG);
    }

    @Override // org.bson.BsonArray, java.util.List, java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException(IMMUTABLE_MSG);
    }

    @Override // org.bson.BsonArray, java.util.List, java.util.Collection
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public ByteBuf getByteBuffer() {
        return this.delegate.m24305g();
    }

    @Override // org.bson.BsonArray, java.util.List, java.util.Collection
    public int hashCode() {
        return super.hashCode();
    }

    @Override // org.bson.BsonArray, java.util.List, java.util.Collection
    public boolean removeAll(Collection<?> collection) {
        throw new UnsupportedOperationException(IMMUTABLE_MSG);
    }

    @Override // org.bson.BsonArray, java.util.List, java.util.Collection
    public boolean retainAll(Collection<?> collection) {
        throw new UnsupportedOperationException(IMMUTABLE_MSG);
    }

    public RawBsonArray(byte[] bArr, int i, int i2) {
        this(new C12908a(bArr, i, i2));
    }

    @Override // org.bson.BsonArray, java.util.List
    public boolean addAll(int i, Collection<? extends BsonValue> collection) {
        throw new UnsupportedOperationException(IMMUTABLE_MSG);
    }

    @Override // org.bson.BsonArray
    public BsonArray clone() {
        return new RawBsonArray((byte[]) this.delegate.f75795b.clone(), this.delegate.f75796c, this.delegate.f75797d);
    }

    @Override // org.bson.BsonArray, java.util.List, java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException(IMMUTABLE_MSG);
    }

    @Override // org.bson.BsonArray, java.util.List
    public BsonValue set(int i, BsonValue bsonValue) {
        throw new UnsupportedOperationException(IMMUTABLE_MSG);
    }

    private RawBsonArray(C12908a c12908a) {
        super(c12908a, false);
        this.delegate = c12908a;
    }

    @Override // org.bson.BsonArray, java.util.List, java.util.Collection
    public boolean add(BsonValue bsonValue) {
        throw new UnsupportedOperationException(IMMUTABLE_MSG);
    }

    @Override // org.bson.BsonArray, java.util.List
    public BsonValue remove(int i) {
        throw new UnsupportedOperationException(IMMUTABLE_MSG);
    }

    @Override // org.bson.BsonArray, java.util.List
    public void add(int i, BsonValue bsonValue) {
        throw new UnsupportedOperationException(IMMUTABLE_MSG);
    }
}
