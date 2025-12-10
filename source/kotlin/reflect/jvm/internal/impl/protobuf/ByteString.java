package kotlin.reflect.jvm.internal.impl.protobuf;

import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import org.slf4j.Marker;

/* loaded from: classes6.dex */
public abstract class ByteString implements Iterable<Byte> {
    public static final ByteString EMPTY = new C11919b(new byte[0]);

    /* loaded from: classes6.dex */
    public interface ByteIterator extends Iterator<Byte> {
        byte nextByte();
    }

    /* renamed from: a */
    public static ByteString m28002a(Iterator it, int i) {
        if (i == 1) {
            return (ByteString) it.next();
        }
        int i2 = i >>> 1;
        return m28002a(it, i2).concat(m28002a(it, i - i2));
    }

    public static ByteString copyFrom(byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return new C11919b(bArr2);
    }

    public static ByteString copyFromUtf8(String str) {
        try {
            return new C11919b(str.getBytes("UTF-8"));
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException("UTF-8 not supported?", e);
        }
    }

    public static Output newOutput() {
        return new Output(128);
    }

    /* renamed from: b */
    public void m28001b(OutputStream outputStream, int i, int i2) {
        if (i >= 0) {
            if (i2 >= 0) {
                int i3 = i + i2;
                if (i3 <= size()) {
                    if (i2 > 0) {
                        mo27936c(outputStream, i, i2);
                        return;
                    }
                    return;
                }
                StringBuilder sb = new StringBuilder(39);
                sb.append("Source end offset exceeded: ");
                sb.append(i3);
                throw new IndexOutOfBoundsException(sb.toString());
            }
            StringBuilder sb2 = new StringBuilder(23);
            sb2.append("Length < 0: ");
            sb2.append(i2);
            throw new IndexOutOfBoundsException(sb2.toString());
        }
        StringBuilder sb3 = new StringBuilder(30);
        sb3.append("Source offset < 0: ");
        sb3.append(i);
        throw new IndexOutOfBoundsException(sb3.toString());
    }

    /* renamed from: c */
    public abstract void mo27936c(OutputStream outputStream, int i, int i2);

    public ByteString concat(ByteString byteString) {
        int size = size();
        int size2 = byteString.size();
        if (size + size2 < 2147483647L) {
            return C11922c.m27932g(this, byteString);
        }
        StringBuilder sb = new StringBuilder(53);
        sb.append("ByteString would be too long: ");
        sb.append(size);
        sb.append(Marker.ANY_NON_NULL_MARKER);
        sb.append(size2);
        throw new IllegalArgumentException(sb.toString());
    }

    public void copyTo(byte[] bArr, int i, int i2, int i3) {
        if (i >= 0) {
            if (i2 >= 0) {
                if (i3 >= 0) {
                    int i4 = i + i3;
                    if (i4 <= size()) {
                        int i5 = i2 + i3;
                        if (i5 <= bArr.length) {
                            if (i3 > 0) {
                                copyToInternal(bArr, i, i2, i3);
                                return;
                            }
                            return;
                        }
                        StringBuilder sb = new StringBuilder(34);
                        sb.append("Target end offset < 0: ");
                        sb.append(i5);
                        throw new IndexOutOfBoundsException(sb.toString());
                    }
                    StringBuilder sb2 = new StringBuilder(34);
                    sb2.append("Source end offset < 0: ");
                    sb2.append(i4);
                    throw new IndexOutOfBoundsException(sb2.toString());
                }
                StringBuilder sb3 = new StringBuilder(23);
                sb3.append("Length < 0: ");
                sb3.append(i3);
                throw new IndexOutOfBoundsException(sb3.toString());
            }
            StringBuilder sb4 = new StringBuilder(30);
            sb4.append("Target offset < 0: ");
            sb4.append(i2);
            throw new IndexOutOfBoundsException(sb4.toString());
        }
        StringBuilder sb5 = new StringBuilder(30);
        sb5.append("Source offset < 0: ");
        sb5.append(i);
        throw new IndexOutOfBoundsException(sb5.toString());
    }

    public abstract void copyToInternal(byte[] bArr, int i, int i2, int i3);

    public abstract int getTreeDepth();

    public abstract boolean isBalanced();

    public boolean isEmpty() {
        if (size() == 0) {
            return true;
        }
        return false;
    }

    public abstract boolean isValidUtf8();

    @Override // java.lang.Iterable
    public abstract Iterator<Byte> iterator();

    public abstract CodedInputStream newCodedInput();

    public abstract int partialHash(int i, int i2, int i3);

    public abstract int partialIsValidUtf8(int i, int i2, int i3);

    public abstract int peekCachedHashCode();

    public abstract int size();

    public byte[] toByteArray() {
        int size = size();
        if (size == 0) {
            return Internal.EMPTY_BYTE_ARRAY;
        }
        byte[] bArr = new byte[size];
        copyToInternal(bArr, 0, 0, size);
        return bArr;
    }

    public String toString() {
        return String.format("<ByteString@%s size=%d>", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()));
    }

    public abstract String toString(String str) throws UnsupportedEncodingException;

    public String toStringUtf8() {
        try {
            return toString("UTF-8");
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException("UTF-8 not supported?", e);
        }
    }

    /* loaded from: classes6.dex */
    public static final class Output extends OutputStream {

        /* renamed from: f */
        public static final byte[] f69694f = new byte[0];

        /* renamed from: a */
        public final int f69695a;

        /* renamed from: b */
        public final ArrayList f69696b;

        /* renamed from: c */
        public int f69697c;

        /* renamed from: d */
        public byte[] f69698d;

        /* renamed from: e */
        public int f69699e;

        public Output(int i) {
            if (i >= 0) {
                this.f69695a = i;
                this.f69696b = new ArrayList();
                this.f69698d = new byte[i];
                return;
            }
            throw new IllegalArgumentException("Buffer size < 0");
        }

        /* renamed from: b */
        public final byte[] m28000b(byte[] bArr, int i) {
            byte[] bArr2 = new byte[i];
            System.arraycopy(bArr, 0, bArr2, 0, Math.min(bArr.length, i));
            return bArr2;
        }

        /* renamed from: d */
        public final void m27999d(int i) {
            this.f69696b.add(new C11919b(this.f69698d));
            int length = this.f69697c + this.f69698d.length;
            this.f69697c = length;
            this.f69698d = new byte[Math.max(this.f69695a, Math.max(i, length >>> 1))];
            this.f69699e = 0;
        }

        /* renamed from: g */
        public final void m27998g() {
            int i = this.f69699e;
            byte[] bArr = this.f69698d;
            if (i < bArr.length) {
                if (i > 0) {
                    this.f69696b.add(new C11919b(m28000b(bArr, i)));
                }
            } else {
                this.f69696b.add(new C11919b(this.f69698d));
                this.f69698d = f69694f;
            }
            this.f69697c += this.f69699e;
            this.f69699e = 0;
        }

        public synchronized int size() {
            return this.f69697c + this.f69699e;
        }

        public synchronized ByteString toByteString() {
            m27998g();
            return ByteString.copyFrom(this.f69696b);
        }

        public String toString() {
            return String.format("<ByteString.Output@%s size=%d>", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()));
        }

        @Override // java.io.OutputStream
        public synchronized void write(int i) {
            try {
                if (this.f69699e == this.f69698d.length) {
                    m27999d(1);
                }
                byte[] bArr = this.f69698d;
                int i2 = this.f69699e;
                this.f69699e = i2 + 1;
                bArr[i2] = (byte) i;
            } catch (Throwable th2) {
                throw th2;
            }
        }

        @Override // java.io.OutputStream
        public synchronized void write(byte[] bArr, int i, int i2) {
            try {
                byte[] bArr2 = this.f69698d;
                int length = bArr2.length;
                int i3 = this.f69699e;
                if (i2 <= length - i3) {
                    System.arraycopy(bArr, i, bArr2, i3, i2);
                    this.f69699e += i2;
                } else {
                    int length2 = bArr2.length - i3;
                    System.arraycopy(bArr, i, bArr2, i3, length2);
                    int i4 = i2 - length2;
                    m27999d(i4);
                    System.arraycopy(bArr, i + length2, this.f69698d, 0, i4);
                    this.f69699e = i4;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static ByteString copyFrom(byte[] bArr) {
        return copyFrom(bArr, 0, bArr.length);
    }

    public static ByteString copyFrom(Iterable<ByteString> iterable) {
        Collection collection;
        if (!(iterable instanceof Collection)) {
            collection = new ArrayList();
            for (ByteString byteString : iterable) {
                collection.add(byteString);
            }
        } else {
            collection = (Collection) iterable;
        }
        if (collection.isEmpty()) {
            return EMPTY;
        }
        return m28002a(collection.iterator(), collection.size());
    }
}
