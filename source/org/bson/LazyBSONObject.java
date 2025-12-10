package org.bson;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.Channels;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;
import org.bson.codecs.DecoderContext;
import org.bson.codecs.UuidCodec;
import org.bson.p044io.ByteBufferBsonInput;
import org.bson.types.BSONTimestamp;
import org.bson.types.Binary;
import org.bson.types.Code;
import org.bson.types.CodeWScope;
import org.bson.types.MaxKey;
import org.bson.types.MinKey;
import org.bson.types.Symbol;

/* loaded from: classes6.dex */
public class LazyBSONObject implements BSONObject {

    /* renamed from: a */
    public final byte[] f75788a;

    /* renamed from: b */
    public final int f75789b;

    /* renamed from: c */
    public final LazyBSONCallback f75790c;

    /* renamed from: org.bson.LazyBSONObject$a */
    /* loaded from: classes6.dex */
    public class C12906a implements Set {

        /* renamed from: a */
        public final /* synthetic */ List f75791a;

        public C12906a(List list) {
            this.f75791a = list;
        }

        @Override // java.util.Set, java.util.Collection
        /* renamed from: a */
        public boolean add(Map.Entry entry) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean addAll(Collection collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public void clear() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean contains(Object obj) {
            return this.f75791a.contains(obj);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean containsAll(Collection collection) {
            return this.f75791a.containsAll(collection);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean isEmpty() {
            return this.f75791a.isEmpty();
        }

        @Override // java.util.Set, java.util.Collection, java.lang.Iterable
        public Iterator iterator() {
            return this.f75791a.iterator();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean remove(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean removeAll(Collection collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean retainAll(Collection collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public int size() {
            return this.f75791a.size();
        }

        @Override // java.util.Set, java.util.Collection
        public Object[] toArray() {
            return this.f75791a.toArray();
        }

        @Override // java.util.Set, java.util.Collection
        public Object[] toArray(Object[] objArr) {
            return this.f75791a.toArray(objArr);
        }
    }

    /* renamed from: org.bson.LazyBSONObject$b */
    /* loaded from: classes6.dex */
    public static /* synthetic */ class C12907b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f75793a;

        static {
            int[] iArr = new int[BsonType.values().length];
            f75793a = iArr;
            try {
                iArr[BsonType.DOCUMENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f75793a[BsonType.ARRAY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f75793a[BsonType.DOUBLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f75793a[BsonType.STRING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f75793a[BsonType.BINARY.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f75793a[BsonType.NULL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f75793a[BsonType.UNDEFINED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f75793a[BsonType.OBJECT_ID.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f75793a[BsonType.BOOLEAN.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f75793a[BsonType.DATE_TIME.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f75793a[BsonType.REGULAR_EXPRESSION.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f75793a[BsonType.DB_POINTER.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f75793a[BsonType.JAVASCRIPT.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f75793a[BsonType.SYMBOL.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f75793a[BsonType.JAVASCRIPT_WITH_SCOPE.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f75793a[BsonType.INT32.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f75793a[BsonType.TIMESTAMP.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f75793a[BsonType.INT64.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                f75793a[BsonType.DECIMAL128.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f75793a[BsonType.MIN_KEY.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f75793a[BsonType.MAX_KEY.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
        }
    }

    public LazyBSONObject(byte[] bArr, LazyBSONCallback lazyBSONCallback) {
        this(bArr, 0, lazyBSONCallback);
    }

    /* renamed from: a */
    public BsonBinaryReader m24318a() {
        return new BsonBinaryReader(new ByteBufferBsonInput(new ByteBufNIO(m24317b())));
    }

    /* renamed from: b */
    public final ByteBuffer m24317b() {
        byte[] bArr = this.f75788a;
        int i = this.f75789b;
        ByteBuffer slice = ByteBuffer.wrap(bArr, i, bArr.length - i).slice();
        slice.order(ByteOrder.LITTLE_ENDIAN);
        slice.limit(slice.getInt());
        slice.rewind();
        return slice;
    }

    /* renamed from: c */
    public final Object m24316c(BsonBinaryReader bsonBinaryReader) {
        int position = bsonBinaryReader.getBsonInput().getPosition();
        bsonBinaryReader.skipValue();
        return this.f75790c.createArray(this.f75788a, this.f75789b + position);
    }

    @Override // org.bson.BSONObject
    public boolean containsField(String str) {
        BsonBinaryReader m24318a = m24318a();
        try {
            m24318a.readStartDocument();
            while (m24318a.readBsonType() != BsonType.END_OF_DOCUMENT) {
                if (m24318a.readName().equals(str)) {
                    m24318a.close();
                    return true;
                }
                m24318a.skipValue();
            }
            m24318a.close();
            return false;
        } catch (Throwable th2) {
            m24318a.close();
            throw th2;
        }
    }

    @Override // org.bson.BSONObject
    @Deprecated
    public boolean containsKey(String str) {
        return containsField(str);
    }

    /* renamed from: d */
    public final Object m24315d(BsonBinaryReader bsonBinaryReader) {
        int position = bsonBinaryReader.getBsonInput().getPosition();
        bsonBinaryReader.skipValue();
        return this.f75790c.createObject(this.f75788a, this.f75789b + position);
    }

    /* renamed from: e */
    public final Object m24314e(BsonBinaryReader bsonBinaryReader) {
        int position = bsonBinaryReader.getBsonInput().getPosition();
        bsonBinaryReader.readStartDocument();
        while (bsonBinaryReader.readBsonType() != BsonType.END_OF_DOCUMENT) {
            bsonBinaryReader.skipName();
            bsonBinaryReader.skipValue();
        }
        bsonBinaryReader.readEndDocument();
        return this.f75790c.createObject(this.f75788a, this.f75789b + position);
    }

    public Set<Map.Entry<String, Object>> entrySet() {
        ArrayList arrayList = new ArrayList();
        BsonBinaryReader m24318a = m24318a();
        try {
            m24318a.readStartDocument();
            while (m24318a.readBsonType() != BsonType.END_OF_DOCUMENT) {
                arrayList.add(new AbstractMap.SimpleImmutableEntry(m24318a.readName(), m24313f(m24318a)));
            }
            m24318a.readEndDocument();
            m24318a.close();
            return new C12906a(arrayList);
        } catch (Throwable th2) {
            m24318a.close();
            throw th2;
        }
    }

    public boolean equals(Object obj) {
        byte b;
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            LazyBSONObject lazyBSONObject = (LazyBSONObject) obj;
            byte[] bArr = this.f75788a;
            byte[] bArr2 = lazyBSONObject.f75788a;
            if (bArr == bArr2 && this.f75789b == lazyBSONObject.f75789b) {
                return true;
            }
            if (bArr == null || bArr2 == null || bArr.length == 0 || bArr2.length == 0 || bArr2[lazyBSONObject.f75789b] != (b = bArr[this.f75789b])) {
                return false;
            }
            for (int i = 0; i < b; i++) {
                if (this.f75788a[this.f75789b + i] != lazyBSONObject.f75788a[lazyBSONObject.f75789b + i]) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public Object m24313f(BsonBinaryReader bsonBinaryReader) {
        switch (C12907b.f75793a[bsonBinaryReader.getCurrentBsonType().ordinal()]) {
            case 1:
                return m24315d(bsonBinaryReader);
            case 2:
                return m24316c(bsonBinaryReader);
            case 3:
                return Double.valueOf(bsonBinaryReader.readDouble());
            case 4:
                return bsonBinaryReader.readString();
            case 5:
                byte peekBinarySubType = bsonBinaryReader.peekBinarySubType();
                if (BsonBinarySubType.isUuid(peekBinarySubType) && bsonBinaryReader.peekBinarySize() == 16) {
                    return new UuidCodec(UuidRepresentation.JAVA_LEGACY).decode((BsonReader) bsonBinaryReader, DecoderContext.builder().build());
                }
                BsonBinary readBinaryData = bsonBinaryReader.readBinaryData();
                if (peekBinarySubType != BsonBinarySubType.BINARY.getValue() && peekBinarySubType != BsonBinarySubType.OLD_BINARY.getValue()) {
                    return new Binary(readBinaryData.getType(), readBinaryData.getData());
                }
                return readBinaryData.getData();
            case 6:
                bsonBinaryReader.readNull();
                return null;
            case 7:
                bsonBinaryReader.readUndefined();
                return null;
            case 8:
                return bsonBinaryReader.readObjectId();
            case 9:
                return Boolean.valueOf(bsonBinaryReader.readBoolean());
            case 10:
                return new Date(bsonBinaryReader.readDateTime());
            case 11:
                BsonRegularExpression readRegularExpression = bsonBinaryReader.readRegularExpression();
                return Pattern.compile(readRegularExpression.getPattern(), BSON.regexFlags(readRegularExpression.getOptions()));
            case 12:
                BsonDbPointer readDBPointer = bsonBinaryReader.readDBPointer();
                return this.f75790c.createDBRef(readDBPointer.getNamespace(), readDBPointer.getId());
            case 13:
                return new Code(bsonBinaryReader.readJavaScript());
            case 14:
                return new Symbol(bsonBinaryReader.readSymbol());
            case 15:
                return new CodeWScope(bsonBinaryReader.readJavaScriptWithScope(), (BSONObject) m24314e(bsonBinaryReader));
            case 16:
                return Integer.valueOf(bsonBinaryReader.readInt32());
            case 17:
                BsonTimestamp readTimestamp = bsonBinaryReader.readTimestamp();
                return new BSONTimestamp(readTimestamp.getTime(), readTimestamp.getInc());
            case 18:
                return Long.valueOf(bsonBinaryReader.readInt64());
            case 19:
                return bsonBinaryReader.readDecimal128();
            case 20:
                bsonBinaryReader.readMinKey();
                return new MinKey();
            case 21:
                bsonBinaryReader.readMaxKey();
                return new MaxKey();
            default:
                throw new IllegalArgumentException("unhandled BSON type: " + bsonBinaryReader.getCurrentBsonType());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0019, code lost:
        r4 = m24313f(r0);
     */
    @Override // org.bson.BSONObject
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object get(java.lang.String r4) {
        /*
            r3 = this;
            org.bson.BsonBinaryReader r0 = r3.m24318a()
            r0.readStartDocument()     // Catch: java.lang.Throwable -> L1e
        L7:
            org.bson.BsonType r1 = r0.readBsonType()     // Catch: java.lang.Throwable -> L1e
            org.bson.BsonType r2 = org.bson.BsonType.END_OF_DOCUMENT     // Catch: java.lang.Throwable -> L1e
            if (r1 == r2) goto L24
            java.lang.String r1 = r0.readName()     // Catch: java.lang.Throwable -> L1e
            boolean r1 = r4.equals(r1)     // Catch: java.lang.Throwable -> L1e
            if (r1 == 0) goto L20
            java.lang.Object r4 = r3.m24313f(r0)     // Catch: java.lang.Throwable -> L1e
            goto L25
        L1e:
            r4 = move-exception
            goto L29
        L20:
            r0.skipValue()     // Catch: java.lang.Throwable -> L1e
            goto L7
        L24:
            r4 = 0
        L25:
            r0.close()
            return r4
        L29:
            r0.close()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bson.LazyBSONObject.get(java.lang.String):java.lang.Object");
    }

    public int getBSONSize() {
        return m24317b().getInt();
    }

    public byte[] getBytes() {
        return this.f75788a;
    }

    public int getOffset() {
        return this.f75789b;
    }

    public int hashCode() {
        int bSONSize = getBSONSize();
        int i = 1;
        for (int i2 = this.f75789b; i2 < this.f75789b + bSONSize; i2++) {
            i = (i * 31) + this.f75788a[i2];
        }
        return i;
    }

    public boolean isEmpty() {
        if (keySet().size() == 0) {
            return true;
        }
        return false;
    }

    @Override // org.bson.BSONObject
    public Set<String> keySet() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        BsonBinaryReader m24318a = m24318a();
        try {
            m24318a.readStartDocument();
            while (m24318a.readBsonType() != BsonType.END_OF_DOCUMENT) {
                linkedHashSet.add(m24318a.readName());
                m24318a.skipValue();
            }
            m24318a.readEndDocument();
            m24318a.close();
            return Collections.unmodifiableSet(linkedHashSet);
        } catch (Throwable th2) {
            m24318a.close();
            throw th2;
        }
    }

    public int pipe(OutputStream outputStream) throws IOException {
        return Channels.newChannel(outputStream).write(m24317b());
    }

    @Override // org.bson.BSONObject
    public Object put(String str, Object obj) {
        throw new UnsupportedOperationException("Object is read only");
    }

    @Override // org.bson.BSONObject
    public void putAll(BSONObject bSONObject) {
        throw new UnsupportedOperationException("Object is read only");
    }

    @Override // org.bson.BSONObject
    public Object removeField(String str) {
        throw new UnsupportedOperationException("Object is read only");
    }

    @Override // org.bson.BSONObject
    public Map toMap() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, Object> entry : entrySet()) {
            linkedHashMap.put(entry.getKey(), entry.getValue());
        }
        return Collections.unmodifiableMap(linkedHashMap);
    }

    public LazyBSONObject(byte[] bArr, int i, LazyBSONCallback lazyBSONCallback) {
        this.f75788a = bArr;
        this.f75790c = lazyBSONCallback;
        this.f75789b = i;
    }

    @Override // org.bson.BSONObject, java.util.AbstractMap, java.util.Map
    public void putAll(Map map) {
        throw new UnsupportedOperationException("Object is read only");
    }
}
