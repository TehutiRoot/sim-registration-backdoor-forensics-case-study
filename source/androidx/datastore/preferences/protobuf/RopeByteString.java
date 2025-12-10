package androidx.datastore.preferences.protobuf;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.datastore.preferences.protobuf.ByteString;
import ch.qos.logback.core.net.SyslogConstants;
import java.io.IOException;
import java.io.InputStream;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class RopeByteString extends ByteString {
    static final int[] minLengthByDepth = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, SyslogConstants.LOG_LOCAL2, 233, 377, TypedValues.MotionType.TYPE_QUANTIZE_MOTIONSTEPS, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368, 75025, 121393, 196418, 317811, 514229, 832040, 1346269, 2178309, 3524578, 5702887, 9227465, 14930352, 24157817, 39088169, 63245986, 102334155, 165580141, 267914296, 433494437, 701408733, 1134903170, 1836311903, Integer.MAX_VALUE};
    private static final long serialVersionUID = 1;
    private final ByteString left;
    private final int leftLength;
    private final ByteString right;
    private final int totalLength;
    private final int treeDepth;

    /* renamed from: androidx.datastore.preferences.protobuf.RopeByteString$a */
    /* loaded from: classes2.dex */
    public class C4393a extends ByteString.AbstractC4337c {

        /* renamed from: a */
        public final C4395c f34857a;

        /* renamed from: b */
        public ByteString.ByteIterator f34858b = m55590b();

        public C4393a() {
            this.f34857a = new C4395c(RopeByteString.this, null);
        }

        /* JADX WARN: Type inference failed for: r0v5, types: [androidx.datastore.preferences.protobuf.ByteString$ByteIterator] */
        /* renamed from: b */
        public final ByteString.ByteIterator m55590b() {
            if (this.f34857a.hasNext()) {
                return this.f34857a.next().iterator2();
            }
            return null;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f34858b != null) {
                return true;
            }
            return false;
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString.ByteIterator
        public byte nextByte() {
            ByteString.ByteIterator byteIterator = this.f34858b;
            if (byteIterator != null) {
                byte nextByte = byteIterator.nextByte();
                if (!this.f34858b.hasNext()) {
                    this.f34858b = m55590b();
                }
                return nextByte;
            }
            throw new NoSuchElementException();
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.RopeByteString$c */
    /* loaded from: classes2.dex */
    public static final class C4395c implements Iterator {

        /* renamed from: a */
        public final ArrayDeque f34861a;

        /* renamed from: b */
        public ByteString.LeafByteString f34862b;

        public /* synthetic */ C4395c(ByteString byteString, C4393a c4393a) {
            this(byteString);
        }

        /* renamed from: a */
        public final ByteString.LeafByteString m55584a(ByteString byteString) {
            while (byteString instanceof RopeByteString) {
                RopeByteString ropeByteString = (RopeByteString) byteString;
                this.f34861a.push(ropeByteString);
                byteString = ropeByteString.left;
            }
            return (ByteString.LeafByteString) byteString;
        }

        /* renamed from: b */
        public final ByteString.LeafByteString m55583b() {
            ByteString.LeafByteString m55584a;
            do {
                ArrayDeque arrayDeque = this.f34861a;
                if (arrayDeque != null && !arrayDeque.isEmpty()) {
                    m55584a = m55584a(((RopeByteString) this.f34861a.pop()).right);
                } else {
                    return null;
                }
            } while (m55584a.isEmpty());
            return m55584a;
        }

        @Override // java.util.Iterator
        /* renamed from: c */
        public ByteString.LeafByteString next() {
            ByteString.LeafByteString leafByteString = this.f34862b;
            if (leafByteString != null) {
                this.f34862b = m55583b();
                return leafByteString;
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f34862b != null) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }

        public C4395c(ByteString byteString) {
            if (byteString instanceof RopeByteString) {
                RopeByteString ropeByteString = (RopeByteString) byteString;
                ArrayDeque arrayDeque = new ArrayDeque(ropeByteString.getTreeDepth());
                this.f34861a = arrayDeque;
                arrayDeque.push(ropeByteString);
                this.f34862b = m55584a(ropeByteString.left);
                return;
            }
            this.f34861a = null;
            this.f34862b = (ByteString.LeafByteString) byteString;
        }
    }

    public /* synthetic */ RopeByteString(ByteString byteString, ByteString byteString2, C4393a c4393a) {
        this(byteString, byteString2);
    }

    public static ByteString concatenate(ByteString byteString, ByteString byteString2) {
        if (byteString2.size() == 0) {
            return byteString;
        }
        if (byteString.size() == 0) {
            return byteString2;
        }
        int size = byteString.size() + byteString2.size();
        if (size < 128) {
            return concatenateBytes(byteString, byteString2);
        }
        if (byteString instanceof RopeByteString) {
            RopeByteString ropeByteString = (RopeByteString) byteString;
            if (ropeByteString.right.size() + byteString2.size() < 128) {
                return new RopeByteString(ropeByteString.left, concatenateBytes(ropeByteString.right, byteString2));
            } else if (ropeByteString.left.getTreeDepth() > ropeByteString.right.getTreeDepth() && ropeByteString.getTreeDepth() > byteString2.getTreeDepth()) {
                return new RopeByteString(ropeByteString.left, new RopeByteString(ropeByteString.right, byteString2));
            }
        }
        if (size < minLengthByDepth[Math.max(byteString.getTreeDepth(), byteString2.getTreeDepth()) + 1]) {
            return new C4394b(null).m55588b(byteString, byteString2);
        }
        return new RopeByteString(byteString, byteString2);
    }

    private static ByteString concatenateBytes(ByteString byteString, ByteString byteString2) {
        int size = byteString.size();
        int size2 = byteString2.size();
        byte[] bArr = new byte[size + size2];
        byteString.copyTo(bArr, 0, 0, size);
        byteString2.copyTo(bArr, 0, size, size2);
        return ByteString.wrap(bArr);
    }

    private boolean equalsFragments(ByteString byteString) {
        boolean equalsRange;
        C4395c c4395c = new C4395c(this, null);
        ByteString.LeafByteString leafByteString = (ByteString.LeafByteString) c4395c.next();
        C4395c c4395c2 = new C4395c(byteString, null);
        ByteString.LeafByteString leafByteString2 = (ByteString.LeafByteString) c4395c2.next();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int size = leafByteString.size() - i;
            int size2 = leafByteString2.size() - i2;
            int min = Math.min(size, size2);
            if (i == 0) {
                equalsRange = leafByteString.equalsRange(leafByteString2, i2, min);
            } else {
                equalsRange = leafByteString2.equalsRange(leafByteString, i, min);
            }
            if (!equalsRange) {
                return false;
            }
            i3 += min;
            int i4 = this.totalLength;
            if (i3 >= i4) {
                if (i3 == i4) {
                    return true;
                }
                throw new IllegalStateException();
            }
            if (min == size) {
                i = 0;
                leafByteString = (ByteString.LeafByteString) c4395c.next();
            } else {
                i += min;
                leafByteString = leafByteString;
            }
            if (min == size2) {
                leafByteString2 = (ByteString.LeafByteString) c4395c2.next();
                i2 = 0;
            } else {
                i2 += min;
            }
        }
    }

    public static RopeByteString newInstanceForTest(ByteString byteString, ByteString byteString2) {
        return new RopeByteString(byteString, byteString2);
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException {
        throw new InvalidObjectException("RopeByteStream instances are not to be serialized directly");
    }

    @Override // androidx.datastore.preferences.protobuf.ByteString
    public ByteBuffer asReadOnlyByteBuffer() {
        return ByteBuffer.wrap(toByteArray()).asReadOnlyBuffer();
    }

    @Override // androidx.datastore.preferences.protobuf.ByteString
    public List<ByteBuffer> asReadOnlyByteBufferList() {
        ArrayList arrayList = new ArrayList();
        C4395c c4395c = new C4395c(this, null);
        while (c4395c.hasNext()) {
            arrayList.add(c4395c.next().asReadOnlyByteBuffer());
        }
        return arrayList;
    }

    @Override // androidx.datastore.preferences.protobuf.ByteString
    public byte byteAt(int i) {
        ByteString.checkIndex(i, this.totalLength);
        return internalByteAt(i);
    }

    @Override // androidx.datastore.preferences.protobuf.ByteString
    public void copyTo(ByteBuffer byteBuffer) {
        this.left.copyTo(byteBuffer);
        this.right.copyTo(byteBuffer);
    }

    @Override // androidx.datastore.preferences.protobuf.ByteString
    public void copyToInternal(byte[] bArr, int i, int i2, int i3) {
        int i4 = i + i3;
        int i5 = this.leftLength;
        if (i4 <= i5) {
            this.left.copyToInternal(bArr, i, i2, i3);
        } else if (i >= i5) {
            this.right.copyToInternal(bArr, i - i5, i2, i3);
        } else {
            int i6 = i5 - i;
            this.left.copyToInternal(bArr, i, i2, i6);
            this.right.copyToInternal(bArr, 0, i2 + i6, i3 - i6);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.ByteString
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ByteString)) {
            return false;
        }
        ByteString byteString = (ByteString) obj;
        if (this.totalLength != byteString.size()) {
            return false;
        }
        if (this.totalLength == 0) {
            return true;
        }
        int peekCachedHashCode = peekCachedHashCode();
        int peekCachedHashCode2 = byteString.peekCachedHashCode();
        if (peekCachedHashCode != 0 && peekCachedHashCode2 != 0 && peekCachedHashCode != peekCachedHashCode2) {
            return false;
        }
        return equalsFragments(byteString);
    }

    @Override // androidx.datastore.preferences.protobuf.ByteString
    public int getTreeDepth() {
        return this.treeDepth;
    }

    @Override // androidx.datastore.preferences.protobuf.ByteString
    public byte internalByteAt(int i) {
        int i2 = this.leftLength;
        if (i < i2) {
            return this.left.internalByteAt(i);
        }
        return this.right.internalByteAt(i - i2);
    }

    @Override // androidx.datastore.preferences.protobuf.ByteString
    public boolean isBalanced() {
        if (this.totalLength >= minLengthByDepth[this.treeDepth]) {
            return true;
        }
        return false;
    }

    @Override // androidx.datastore.preferences.protobuf.ByteString
    public boolean isValidUtf8() {
        int partialIsValidUtf8 = this.left.partialIsValidUtf8(0, 0, this.leftLength);
        ByteString byteString = this.right;
        if (byteString.partialIsValidUtf8(partialIsValidUtf8, 0, byteString.size()) != 0) {
            return false;
        }
        return true;
    }

    @Override // androidx.datastore.preferences.protobuf.ByteString
    public CodedInputStream newCodedInput() {
        return CodedInputStream.newInstance(new C4396d());
    }

    @Override // androidx.datastore.preferences.protobuf.ByteString
    public InputStream newInput() {
        return new C4396d();
    }

    @Override // androidx.datastore.preferences.protobuf.ByteString
    public int partialHash(int i, int i2, int i3) {
        int i4 = i2 + i3;
        int i5 = this.leftLength;
        if (i4 <= i5) {
            return this.left.partialHash(i, i2, i3);
        }
        if (i2 >= i5) {
            return this.right.partialHash(i, i2 - i5, i3);
        }
        int i6 = i5 - i2;
        return this.right.partialHash(this.left.partialHash(i, i2, i6), 0, i3 - i6);
    }

    @Override // androidx.datastore.preferences.protobuf.ByteString
    public int partialIsValidUtf8(int i, int i2, int i3) {
        int i4 = i2 + i3;
        int i5 = this.leftLength;
        if (i4 <= i5) {
            return this.left.partialIsValidUtf8(i, i2, i3);
        }
        if (i2 >= i5) {
            return this.right.partialIsValidUtf8(i, i2 - i5, i3);
        }
        int i6 = i5 - i2;
        return this.right.partialIsValidUtf8(this.left.partialIsValidUtf8(i, i2, i6), 0, i3 - i6);
    }

    @Override // androidx.datastore.preferences.protobuf.ByteString
    public int size() {
        return this.totalLength;
    }

    @Override // androidx.datastore.preferences.protobuf.ByteString
    public ByteString substring(int i, int i2) {
        int checkRange = ByteString.checkRange(i, i2, this.totalLength);
        if (checkRange == 0) {
            return ByteString.EMPTY;
        }
        if (checkRange == this.totalLength) {
            return this;
        }
        int i3 = this.leftLength;
        if (i2 <= i3) {
            return this.left.substring(i, i2);
        }
        if (i >= i3) {
            return this.right.substring(i - i3, i2 - i3);
        }
        return new RopeByteString(this.left.substring(i), this.right.substring(0, i2 - this.leftLength));
    }

    @Override // androidx.datastore.preferences.protobuf.ByteString
    public String toStringInternal(Charset charset) {
        return new String(toByteArray(), charset);
    }

    public Object writeReplace() {
        return ByteString.wrap(toByteArray());
    }

    @Override // androidx.datastore.preferences.protobuf.ByteString
    public void writeTo(OutputStream outputStream) throws IOException {
        this.left.writeTo(outputStream);
        this.right.writeTo(outputStream);
    }

    @Override // androidx.datastore.preferences.protobuf.ByteString
    public void writeToInternal(OutputStream outputStream, int i, int i2) throws IOException {
        int i3 = i + i2;
        int i4 = this.leftLength;
        if (i3 <= i4) {
            this.left.writeToInternal(outputStream, i, i2);
        } else if (i >= i4) {
            this.right.writeToInternal(outputStream, i - i4, i2);
        } else {
            int i5 = i4 - i;
            this.left.writeToInternal(outputStream, i, i5);
            this.right.writeToInternal(outputStream, 0, i2 - i5);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.ByteString
    public void writeToReverse(ByteOutput byteOutput) throws IOException {
        this.right.writeToReverse(byteOutput);
        this.left.writeToReverse(byteOutput);
    }

    /* renamed from: androidx.datastore.preferences.protobuf.RopeByteString$b */
    /* loaded from: classes2.dex */
    public static class C4394b {

        /* renamed from: a */
        public final ArrayDeque f34860a;

        public C4394b() {
            this.f34860a = new ArrayDeque();
        }

        /* renamed from: b */
        public final ByteString m55588b(ByteString byteString, ByteString byteString2) {
            m55587c(byteString);
            m55587c(byteString2);
            ByteString byteString3 = (ByteString) this.f34860a.pop();
            while (!this.f34860a.isEmpty()) {
                byteString3 = new RopeByteString((ByteString) this.f34860a.pop(), byteString3, null);
            }
            return byteString3;
        }

        /* renamed from: c */
        public final void m55587c(ByteString byteString) {
            if (byteString.isBalanced()) {
                m55585e(byteString);
            } else if (byteString instanceof RopeByteString) {
                RopeByteString ropeByteString = (RopeByteString) byteString;
                m55587c(ropeByteString.left);
                m55587c(ropeByteString.right);
            } else {
                throw new IllegalArgumentException("Has a new type of ByteString been created? Found " + byteString.getClass());
            }
        }

        /* renamed from: d */
        public final int m55586d(int i) {
            int binarySearch = Arrays.binarySearch(RopeByteString.minLengthByDepth, i);
            if (binarySearch < 0) {
                return (-(binarySearch + 1)) - 1;
            }
            return binarySearch;
        }

        /* renamed from: e */
        public final void m55585e(ByteString byteString) {
            int m55586d = m55586d(byteString.size());
            int[] iArr = RopeByteString.minLengthByDepth;
            int i = iArr[m55586d + 1];
            if (!this.f34860a.isEmpty() && ((ByteString) this.f34860a.peek()).size() < i) {
                int i2 = iArr[m55586d];
                ByteString byteString2 = (ByteString) this.f34860a.pop();
                while (!this.f34860a.isEmpty() && ((ByteString) this.f34860a.peek()).size() < i2) {
                    byteString2 = new RopeByteString((ByteString) this.f34860a.pop(), byteString2, null);
                }
                RopeByteString ropeByteString = new RopeByteString(byteString2, byteString, null);
                while (!this.f34860a.isEmpty()) {
                    if (((ByteString) this.f34860a.peek()).size() >= RopeByteString.minLengthByDepth[m55586d(ropeByteString.size()) + 1]) {
                        break;
                    }
                    ropeByteString = new RopeByteString((ByteString) this.f34860a.pop(), ropeByteString, null);
                }
                this.f34860a.push(ropeByteString);
                return;
            }
            this.f34860a.push(byteString);
        }

        public /* synthetic */ C4394b(C4393a c4393a) {
            this();
        }
    }

    private RopeByteString(ByteString byteString, ByteString byteString2) {
        this.left = byteString;
        this.right = byteString2;
        int size = byteString.size();
        this.leftLength = size;
        this.totalLength = size + byteString2.size();
        this.treeDepth = Math.max(byteString.getTreeDepth(), byteString2.getTreeDepth()) + 1;
    }

    @Override // androidx.datastore.preferences.protobuf.ByteString, java.lang.Iterable
    /* renamed from: iterator */
    public Iterator<Byte> iterator2() {
        return new C4393a();
    }

    @Override // androidx.datastore.preferences.protobuf.ByteString
    public void writeTo(ByteOutput byteOutput) throws IOException {
        this.left.writeTo(byteOutput);
        this.right.writeTo(byteOutput);
    }

    /* renamed from: androidx.datastore.preferences.protobuf.RopeByteString$d */
    /* loaded from: classes2.dex */
    public class C4396d extends InputStream {

        /* renamed from: a */
        public C4395c f34863a;

        /* renamed from: b */
        public ByteString.LeafByteString f34864b;

        /* renamed from: c */
        public int f34865c;

        /* renamed from: d */
        public int f34866d;

        /* renamed from: e */
        public int f34867e;

        /* renamed from: f */
        public int f34868f;

        public C4396d() {
            m55580d();
        }

        @Override // java.io.InputStream
        public int available() {
            return RopeByteString.this.size() - (this.f34867e + this.f34866d);
        }

        /* renamed from: b */
        public final void m55581b() {
            if (this.f34864b != null) {
                int i = this.f34866d;
                int i2 = this.f34865c;
                if (i == i2) {
                    this.f34867e += i2;
                    this.f34866d = 0;
                    if (this.f34863a.hasNext()) {
                        ByteString.LeafByteString next = this.f34863a.next();
                        this.f34864b = next;
                        this.f34865c = next.size();
                        return;
                    }
                    this.f34864b = null;
                    this.f34865c = 0;
                }
            }
        }

        /* renamed from: d */
        public final void m55580d() {
            C4395c c4395c = new C4395c(RopeByteString.this, null);
            this.f34863a = c4395c;
            ByteString.LeafByteString next = c4395c.next();
            this.f34864b = next;
            this.f34865c = next.size();
            this.f34866d = 0;
            this.f34867e = 0;
        }

        /* renamed from: g */
        public final int m55579g(byte[] bArr, int i, int i2) {
            int i3 = i2;
            while (true) {
                if (i3 <= 0) {
                    break;
                }
                m55581b();
                if (this.f34864b == null) {
                    if (i3 == i2) {
                        return -1;
                    }
                } else {
                    int min = Math.min(this.f34865c - this.f34866d, i3);
                    if (bArr != null) {
                        this.f34864b.copyTo(bArr, this.f34866d, i, min);
                        i += min;
                    }
                    this.f34866d += min;
                    i3 -= min;
                }
            }
            return i2 - i3;
        }

        @Override // java.io.InputStream
        public void mark(int i) {
            this.f34868f = this.f34867e + this.f34866d;
        }

        @Override // java.io.InputStream
        public boolean markSupported() {
            return true;
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i, int i2) {
            bArr.getClass();
            if (i >= 0 && i2 >= 0 && i2 <= bArr.length - i) {
                return m55579g(bArr, i, i2);
            }
            throw new IndexOutOfBoundsException();
        }

        @Override // java.io.InputStream
        public synchronized void reset() {
            m55580d();
            m55579g(null, 0, this.f34868f);
        }

        @Override // java.io.InputStream
        public long skip(long j) {
            if (j >= 0) {
                if (j > 2147483647L) {
                    j = 2147483647L;
                }
                return m55579g(null, 0, (int) j);
            }
            throw new IndexOutOfBoundsException();
        }

        @Override // java.io.InputStream
        public int read() {
            m55581b();
            ByteString.LeafByteString leafByteString = this.f34864b;
            if (leafByteString == null) {
                return -1;
            }
            int i = this.f34866d;
            this.f34866d = i + 1;
            return leafByteString.byteAt(i) & 255;
        }
    }
}
