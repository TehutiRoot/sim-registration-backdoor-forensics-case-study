package androidx.emoji2.text.flatbuffer;

import java.io.InputStream;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

/* loaded from: classes2.dex */
public class FlatBufferBuilder {

    /* renamed from: a */
    public ByteBuffer f35306a;

    /* renamed from: b */
    public int f35307b;

    /* renamed from: c */
    public int f35308c;

    /* renamed from: d */
    public int[] f35309d;

    /* renamed from: e */
    public int f35310e;

    /* renamed from: f */
    public boolean f35311f;

    /* renamed from: g */
    public boolean f35312g;

    /* renamed from: h */
    public int f35313h;

    /* renamed from: i */
    public int[] f35314i;

    /* renamed from: j */
    public int f35315j;

    /* renamed from: k */
    public int f35316k;

    /* renamed from: l */
    public boolean f35317l;

    /* renamed from: m */
    public ByteBufferFactory f35318m;

    /* renamed from: n */
    public final Utf8 f35319n;

    /* loaded from: classes2.dex */
    public static abstract class ByteBufferFactory {
        public abstract ByteBuffer newByteBuffer(int i);

        public void releaseByteBuffer(ByteBuffer byteBuffer) {
        }
    }

    /* loaded from: classes2.dex */
    public static final class HeapByteBufferFactory extends ByteBufferFactory {
        public static final HeapByteBufferFactory INSTANCE = new HeapByteBufferFactory();

        @Override // androidx.emoji2.text.flatbuffer.FlatBufferBuilder.ByteBufferFactory
        public ByteBuffer newByteBuffer(int i) {
            return ByteBuffer.allocate(i).order(ByteOrder.LITTLE_ENDIAN);
        }
    }

    /* renamed from: androidx.emoji2.text.flatbuffer.FlatBufferBuilder$a */
    /* loaded from: classes2.dex */
    public static class C4518a extends InputStream {

        /* renamed from: a */
        public ByteBuffer f35320a;

        public C4518a(ByteBuffer byteBuffer) {
            this.f35320a = byteBuffer;
        }

        @Override // java.io.InputStream
        public int read() {
            try {
                return this.f35320a.get() & 255;
            } catch (BufferUnderflowException unused) {
                return -1;
            }
        }
    }

    public FlatBufferBuilder(int i, ByteBufferFactory byteBufferFactory) {
        this(i, byteBufferFactory, null, Utf8.getDefault());
    }

    /* renamed from: a */
    public static ByteBuffer m54660a(ByteBuffer byteBuffer, ByteBufferFactory byteBufferFactory) {
        int i;
        int capacity = byteBuffer.capacity();
        if (((-1073741824) & capacity) == 0) {
            if (capacity == 0) {
                i = 1;
            } else {
                i = capacity << 1;
            }
            byteBuffer.position(0);
            ByteBuffer newByteBuffer = byteBufferFactory.newByteBuffer(i);
            newByteBuffer.position(newByteBuffer.clear().capacity() - capacity);
            newByteBuffer.put(byteBuffer);
            return newByteBuffer;
        }
        throw new AssertionError("FlatBuffers: cannot grow buffer beyond 2 gigabytes.");
    }

    public static boolean isFieldPresent(Table table, int i) {
        if (table.__offset(i) != 0) {
            return true;
        }
        return false;
    }

    public void Nested(int i) {
        if (i == offset()) {
            return;
        }
        throw new AssertionError("FlatBuffers: struct must be serialized inline.");
    }

    public void addBoolean(boolean z) {
        prep(1, 0);
        putBoolean(z);
    }

    public void addByte(byte b) {
        prep(1, 0);
        putByte(b);
    }

    public void addDouble(double d) {
        prep(8, 0);
        putDouble(d);
    }

    public void addFloat(float f) {
        prep(4, 0);
        putFloat(f);
    }

    public void addInt(int i) {
        prep(4, 0);
        putInt(i);
    }

    public void addLong(long j) {
        prep(8, 0);
        putLong(j);
    }

    public void addOffset(int i) {
        prep(4, 0);
        putInt((offset() - i) + 4);
    }

    public void addShort(short s) {
        prep(2, 0);
        putShort(s);
    }

    public void addStruct(int i, int i2, int i3) {
        if (i2 != i3) {
            Nested(i2);
            slot(i);
        }
    }

    public void clear() {
        this.f35307b = this.f35306a.capacity();
        this.f35306a.clear();
        this.f35308c = 1;
        while (true) {
            int i = this.f35310e;
            if (i > 0) {
                int[] iArr = this.f35309d;
                int i2 = i - 1;
                this.f35310e = i2;
                iArr[i2] = 0;
            } else {
                this.f35310e = 0;
                this.f35311f = false;
                this.f35312g = false;
                this.f35313h = 0;
                this.f35315j = 0;
                this.f35316k = 0;
                return;
            }
        }
    }

    public int createByteVector(byte[] bArr) {
        int length = bArr.length;
        startVector(1, length, 1);
        ByteBuffer byteBuffer = this.f35306a;
        int i = this.f35307b - length;
        this.f35307b = i;
        byteBuffer.position(i);
        this.f35306a.put(bArr);
        return endVector();
    }

    public <T extends Table> int createSortedVectorOfTables(T t, int[] iArr) {
        t.sortTables(iArr, this.f35306a);
        return createVectorOfTables(iArr);
    }

    public int createString(CharSequence charSequence) {
        int encodedLength = this.f35319n.encodedLength(charSequence);
        addByte((byte) 0);
        startVector(1, encodedLength, 1);
        ByteBuffer byteBuffer = this.f35306a;
        int i = this.f35307b - encodedLength;
        this.f35307b = i;
        byteBuffer.position(i);
        this.f35319n.encodeUtf8(charSequence, this.f35306a);
        return endVector();
    }

    public ByteBuffer createUnintializedVector(int i, int i2, int i3) {
        int i4 = i * i2;
        startVector(i, i2, i3);
        ByteBuffer byteBuffer = this.f35306a;
        int i5 = this.f35307b - i4;
        this.f35307b = i5;
        byteBuffer.position(i5);
        ByteBuffer order = this.f35306a.slice().order(ByteOrder.LITTLE_ENDIAN);
        order.limit(i4);
        return order;
    }

    public int createVectorOfTables(int[] iArr) {
        notNested();
        startVector(4, iArr.length, 4);
        for (int length = iArr.length - 1; length >= 0; length--) {
            addOffset(iArr[length]);
        }
        return endVector();
    }

    public ByteBuffer dataBuffer() {
        finished();
        return this.f35306a;
    }

    public int endTable() {
        int i;
        int i2;
        if (this.f35309d != null && this.f35311f) {
            addInt(0);
            int offset = offset();
            int i3 = this.f35310e - 1;
            while (i3 >= 0 && this.f35309d[i3] == 0) {
                i3--;
            }
            for (int i4 = i3; i4 >= 0; i4--) {
                int i5 = this.f35309d[i4];
                if (i5 != 0) {
                    i2 = offset - i5;
                } else {
                    i2 = 0;
                }
                addShort((short) i2);
            }
            addShort((short) (offset - this.f35313h));
            addShort((short) ((i3 + 3) * 2));
            int i6 = 0;
            loop2: while (true) {
                if (i6 < this.f35315j) {
                    int capacity = this.f35306a.capacity() - this.f35314i[i6];
                    int i7 = this.f35307b;
                    short s = this.f35306a.getShort(capacity);
                    if (s == this.f35306a.getShort(i7)) {
                        for (int i8 = 2; i8 < s; i8 += 2) {
                            if (this.f35306a.getShort(capacity + i8) != this.f35306a.getShort(i7 + i8)) {
                                break;
                            }
                        }
                        i = this.f35314i[i6];
                        break loop2;
                    }
                    i6++;
                } else {
                    i = 0;
                    break;
                }
            }
            if (i != 0) {
                int capacity2 = this.f35306a.capacity() - offset;
                this.f35307b = capacity2;
                this.f35306a.putInt(capacity2, i - offset);
            } else {
                int i9 = this.f35315j;
                int[] iArr = this.f35314i;
                if (i9 == iArr.length) {
                    this.f35314i = Arrays.copyOf(iArr, i9 * 2);
                }
                int[] iArr2 = this.f35314i;
                int i10 = this.f35315j;
                this.f35315j = i10 + 1;
                iArr2[i10] = offset();
                ByteBuffer byteBuffer = this.f35306a;
                byteBuffer.putInt(byteBuffer.capacity() - offset, offset() - offset);
            }
            this.f35311f = false;
            return offset;
        }
        throw new AssertionError("FlatBuffers: endTable called without startTable");
    }

    public int endVector() {
        if (this.f35311f) {
            this.f35311f = false;
            putInt(this.f35316k);
            return offset();
        }
        throw new AssertionError("FlatBuffers: endVector called without startVector");
    }

    public void finish(int i, boolean z) {
        prep(this.f35308c, (z ? 4 : 0) + 4);
        addOffset(i);
        if (z) {
            addInt(this.f35306a.capacity() - this.f35307b);
        }
        this.f35306a.position(this.f35307b);
        this.f35312g = true;
    }

    public void finishSizePrefixed(int i) {
        finish(i, true);
    }

    public void finished() {
        if (this.f35312g) {
            return;
        }
        throw new AssertionError("FlatBuffers: you can only access the serialized buffer after it has been finished by FlatBufferBuilder.finish().");
    }

    public FlatBufferBuilder forceDefaults(boolean z) {
        this.f35317l = z;
        return this;
    }

    public FlatBufferBuilder init(ByteBuffer byteBuffer, ByteBufferFactory byteBufferFactory) {
        this.f35318m = byteBufferFactory;
        this.f35306a = byteBuffer;
        byteBuffer.clear();
        this.f35306a.order(ByteOrder.LITTLE_ENDIAN);
        this.f35308c = 1;
        this.f35307b = this.f35306a.capacity();
        this.f35310e = 0;
        this.f35311f = false;
        this.f35312g = false;
        this.f35313h = 0;
        this.f35315j = 0;
        this.f35316k = 0;
        return this;
    }

    public void notNested() {
        if (!this.f35311f) {
            return;
        }
        throw new AssertionError("FlatBuffers: object serialization must not be nested.");
    }

    public int offset() {
        return this.f35306a.capacity() - this.f35307b;
    }

    public void pad(int i) {
        for (int i2 = 0; i2 < i; i2++) {
            ByteBuffer byteBuffer = this.f35306a;
            int i3 = this.f35307b - 1;
            this.f35307b = i3;
            byteBuffer.put(i3, (byte) 0);
        }
    }

    public void prep(int i, int i2) {
        if (i > this.f35308c) {
            this.f35308c = i;
        }
        int i3 = ((~((this.f35306a.capacity() - this.f35307b) + i2)) + 1) & (i - 1);
        while (this.f35307b < i3 + i + i2) {
            int capacity = this.f35306a.capacity();
            ByteBuffer byteBuffer = this.f35306a;
            ByteBuffer m54660a = m54660a(byteBuffer, this.f35318m);
            this.f35306a = m54660a;
            if (byteBuffer != m54660a) {
                this.f35318m.releaseByteBuffer(byteBuffer);
            }
            this.f35307b += this.f35306a.capacity() - capacity;
        }
        pad(i3);
    }

    public void putBoolean(boolean z) {
        ByteBuffer byteBuffer = this.f35306a;
        int i = this.f35307b - 1;
        this.f35307b = i;
        byteBuffer.put(i, z ? (byte) 1 : (byte) 0);
    }

    public void putByte(byte b) {
        ByteBuffer byteBuffer = this.f35306a;
        int i = this.f35307b - 1;
        this.f35307b = i;
        byteBuffer.put(i, b);
    }

    public void putDouble(double d) {
        ByteBuffer byteBuffer = this.f35306a;
        int i = this.f35307b - 8;
        this.f35307b = i;
        byteBuffer.putDouble(i, d);
    }

    public void putFloat(float f) {
        ByteBuffer byteBuffer = this.f35306a;
        int i = this.f35307b - 4;
        this.f35307b = i;
        byteBuffer.putFloat(i, f);
    }

    public void putInt(int i) {
        ByteBuffer byteBuffer = this.f35306a;
        int i2 = this.f35307b - 4;
        this.f35307b = i2;
        byteBuffer.putInt(i2, i);
    }

    public void putLong(long j) {
        ByteBuffer byteBuffer = this.f35306a;
        int i = this.f35307b - 8;
        this.f35307b = i;
        byteBuffer.putLong(i, j);
    }

    public void putShort(short s) {
        ByteBuffer byteBuffer = this.f35306a;
        int i = this.f35307b - 2;
        this.f35307b = i;
        byteBuffer.putShort(i, s);
    }

    public void required(int i, int i2) {
        int capacity = this.f35306a.capacity() - i;
        if (this.f35306a.getShort((capacity - this.f35306a.getInt(capacity)) + i2) != 0) {
            return;
        }
        throw new AssertionError("FlatBuffers: field " + i2 + " must be set");
    }

    public byte[] sizedByteArray(int i, int i2) {
        finished();
        byte[] bArr = new byte[i2];
        this.f35306a.position(i);
        this.f35306a.get(bArr);
        return bArr;
    }

    public InputStream sizedInputStream() {
        finished();
        ByteBuffer duplicate = this.f35306a.duplicate();
        duplicate.position(this.f35307b);
        duplicate.limit(this.f35306a.capacity());
        return new C4518a(duplicate);
    }

    public void slot(int i) {
        this.f35309d[i] = offset();
    }

    public void startTable(int i) {
        notNested();
        int[] iArr = this.f35309d;
        if (iArr == null || iArr.length < i) {
            this.f35309d = new int[i];
        }
        this.f35310e = i;
        Arrays.fill(this.f35309d, 0, i, 0);
        this.f35311f = true;
        this.f35313h = offset();
    }

    public void startVector(int i, int i2, int i3) {
        notNested();
        this.f35316k = i2;
        int i4 = i * i2;
        prep(4, i4);
        prep(i3, i4);
        this.f35311f = true;
    }

    public FlatBufferBuilder(int i, ByteBufferFactory byteBufferFactory, ByteBuffer byteBuffer, Utf8 utf8) {
        this.f35308c = 1;
        this.f35309d = null;
        this.f35310e = 0;
        this.f35311f = false;
        this.f35312g = false;
        this.f35314i = new int[16];
        this.f35315j = 0;
        this.f35316k = 0;
        this.f35317l = false;
        i = i <= 0 ? 1 : i;
        this.f35318m = byteBufferFactory;
        if (byteBuffer != null) {
            this.f35306a = byteBuffer;
            byteBuffer.clear();
            this.f35306a.order(ByteOrder.LITTLE_ENDIAN);
        } else {
            this.f35306a = byteBufferFactory.newByteBuffer(i);
        }
        this.f35319n = utf8;
        this.f35307b = this.f35306a.capacity();
    }

    public void addBoolean(int i, boolean z, boolean z2) {
        if (this.f35317l || z != z2) {
            addBoolean(z);
            slot(i);
        }
    }

    public void addByte(int i, byte b, int i2) {
        if (this.f35317l || b != i2) {
            addByte(b);
            slot(i);
        }
    }

    public void addDouble(int i, double d, double d2) {
        if (this.f35317l || d != d2) {
            addDouble(d);
            slot(i);
        }
    }

    public void addFloat(int i, float f, double d) {
        if (this.f35317l || f != d) {
            addFloat(f);
            slot(i);
        }
    }

    public void addInt(int i, int i2, int i3) {
        if (this.f35317l || i2 != i3) {
            addInt(i2);
            slot(i);
        }
    }

    public void addLong(int i, long j, long j2) {
        if (this.f35317l || j != j2) {
            addLong(j);
            slot(i);
        }
    }

    public void addShort(int i, short s, int i2) {
        if (this.f35317l || s != i2) {
            addShort(s);
            slot(i);
        }
    }

    public void finishSizePrefixed(int i, String str) {
        finish(i, str, true);
    }

    public void addOffset(int i, int i2, int i3) {
        if (this.f35317l || i2 != i3) {
            addOffset(i2);
            slot(i);
        }
    }

    public byte[] sizedByteArray() {
        return sizedByteArray(this.f35307b, this.f35306a.capacity() - this.f35307b);
    }

    public int createByteVector(byte[] bArr, int i, int i2) {
        startVector(1, i2, 1);
        ByteBuffer byteBuffer = this.f35306a;
        int i3 = this.f35307b - i2;
        this.f35307b = i3;
        byteBuffer.position(i3);
        this.f35306a.put(bArr, i, i2);
        return endVector();
    }

    public void finish(int i) {
        finish(i, false);
    }

    public int createString(ByteBuffer byteBuffer) {
        int remaining = byteBuffer.remaining();
        addByte((byte) 0);
        startVector(1, remaining, 1);
        ByteBuffer byteBuffer2 = this.f35306a;
        int i = this.f35307b - remaining;
        this.f35307b = i;
        byteBuffer2.position(i);
        this.f35306a.put(byteBuffer);
        return endVector();
    }

    public void finish(int i, String str, boolean z) {
        prep(this.f35308c, (z ? 4 : 0) + 8);
        if (str.length() == 4) {
            for (int i2 = 3; i2 >= 0; i2--) {
                addByte((byte) str.charAt(i2));
            }
            finish(i, z);
            return;
        }
        throw new AssertionError("FlatBuffers: file identifier must be length 4");
    }

    public int createByteVector(ByteBuffer byteBuffer) {
        int remaining = byteBuffer.remaining();
        startVector(1, remaining, 1);
        ByteBuffer byteBuffer2 = this.f35306a;
        int i = this.f35307b - remaining;
        this.f35307b = i;
        byteBuffer2.position(i);
        this.f35306a.put(byteBuffer);
        return endVector();
    }

    public void finish(int i, String str) {
        finish(i, str, false);
    }

    public FlatBufferBuilder(int i) {
        this(i, HeapByteBufferFactory.INSTANCE, null, Utf8.getDefault());
    }

    public FlatBufferBuilder() {
        this(1024);
    }

    public FlatBufferBuilder(ByteBuffer byteBuffer, ByteBufferFactory byteBufferFactory) {
        this(byteBuffer.capacity(), byteBufferFactory, byteBuffer, Utf8.getDefault());
    }

    public FlatBufferBuilder(ByteBuffer byteBuffer) {
        this(byteBuffer, new HeapByteBufferFactory());
    }
}