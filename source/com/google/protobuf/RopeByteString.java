package com.google.protobuf;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import ch.qos.logback.core.net.SyslogConstants;
import com.google.protobuf.ByteString;
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
/* loaded from: classes4.dex */
public final class RopeByteString extends ByteString {
    static final int[] minLengthByDepth = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, SyslogConstants.LOG_LOCAL2, 233, 377, TypedValues.MotionType.TYPE_QUANTIZE_MOTIONSTEPS, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368, 75025, 121393, 196418, 317811, 514229, 832040, 1346269, 2178309, 3524578, 5702887, 9227465, 14930352, 24157817, 39088169, 63245986, 102334155, 165580141, 267914296, 433494437, 701408733, 1134903170, 1836311903, Integer.MAX_VALUE};
    private static final long serialVersionUID = 1;
    private final ByteString left;
    private final int leftLength;
    private final ByteString right;
    private final int totalLength;
    private final int treeDepth;

    /* renamed from: com.google.protobuf.RopeByteString$a */
    /* loaded from: classes4.dex */
    public class C8904a extends ByteString.AbstractC8834c {

        /* renamed from: a */
        public final C8906c f57398a;

        /* renamed from: b */
        public ByteString.ByteIterator f57399b = m35660b();

        public C8904a() {
            this.f57398a = new C8906c(RopeByteString.this, null);
        }

        /* JADX WARN: Type inference failed for: r0v5, types: [com.google.protobuf.ByteString$ByteIterator] */
        /* renamed from: b */
        public final ByteString.ByteIterator m35660b() {
            if (this.f57398a.hasNext()) {
                return this.f57398a.next().iterator2();
            }
            return null;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f57399b != null) {
                return true;
            }
            return false;
        }

        @Override // com.google.protobuf.ByteString.ByteIterator
        public byte nextByte() {
            ByteString.ByteIterator byteIterator = this.f57399b;
            if (byteIterator != null) {
                byte nextByte = byteIterator.nextByte();
                if (!this.f57399b.hasNext()) {
                    this.f57399b = m35660b();
                }
                return nextByte;
            }
            throw new NoSuchElementException();
        }
    }

    /* renamed from: com.google.protobuf.RopeByteString$c */
    /* loaded from: classes4.dex */
    public static final class C8906c implements Iterator {

        /* renamed from: a */
        public final ArrayDeque f57402a;

        /* renamed from: b */
        public ByteString.LeafByteString f57403b;

        public /* synthetic */ C8906c(ByteString byteString, C8904a c8904a) {
            this(byteString);
        }

        /* renamed from: a */
        public final ByteString.LeafByteString m35654a(ByteString byteString) {
            while (byteString instanceof RopeByteString) {
                RopeByteString ropeByteString = (RopeByteString) byteString;
                this.f57402a.push(ropeByteString);
                byteString = ropeByteString.left;
            }
            return (ByteString.LeafByteString) byteString;
        }

        /* renamed from: b */
        public final ByteString.LeafByteString m35653b() {
            ByteString.LeafByteString m35654a;
            do {
                ArrayDeque arrayDeque = this.f57402a;
                if (arrayDeque != null && !arrayDeque.isEmpty()) {
                    m35654a = m35654a(((RopeByteString) this.f57402a.pop()).right);
                } else {
                    return null;
                }
            } while (m35654a.isEmpty());
            return m35654a;
        }

        @Override // java.util.Iterator
        /* renamed from: c */
        public ByteString.LeafByteString next() {
            ByteString.LeafByteString leafByteString = this.f57403b;
            if (leafByteString != null) {
                this.f57403b = m35653b();
                return leafByteString;
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f57403b != null) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }

        public C8906c(ByteString byteString) {
            if (byteString instanceof RopeByteString) {
                RopeByteString ropeByteString = (RopeByteString) byteString;
                ArrayDeque arrayDeque = new ArrayDeque(ropeByteString.getTreeDepth());
                this.f57402a = arrayDeque;
                arrayDeque.push(ropeByteString);
                this.f57403b = m35654a(ropeByteString.left);
                return;
            }
            this.f57402a = null;
            this.f57403b = (ByteString.LeafByteString) byteString;
        }
    }

    public /* synthetic */ RopeByteString(ByteString byteString, ByteString byteString2, C8904a c8904a) {
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
        if (size < minLength(Math.max(byteString.getTreeDepth(), byteString2.getTreeDepth()) + 1)) {
            return new C8905b(null).m35658b(byteString, byteString2);
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
        C8906c c8906c = new C8906c(this, null);
        ByteString.LeafByteString leafByteString = (ByteString.LeafByteString) c8906c.next();
        C8906c c8906c2 = new C8906c(byteString, null);
        ByteString.LeafByteString leafByteString2 = (ByteString.LeafByteString) c8906c2.next();
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
                leafByteString = (ByteString.LeafByteString) c8906c.next();
            } else {
                i += min;
                leafByteString = leafByteString;
            }
            if (min == size2) {
                leafByteString2 = (ByteString.LeafByteString) c8906c2.next();
                i2 = 0;
            } else {
                i2 += min;
            }
        }
    }

    public static int minLength(int i) {
        int[] iArr = minLengthByDepth;
        if (i >= iArr.length) {
            return Integer.MAX_VALUE;
        }
        return iArr[i];
    }

    public static RopeByteString newInstanceForTest(ByteString byteString, ByteString byteString2) {
        return new RopeByteString(byteString, byteString2);
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException {
        throw new InvalidObjectException("RopeByteStream instances are not to be serialized directly");
    }

    @Override // com.google.protobuf.ByteString
    public ByteBuffer asReadOnlyByteBuffer() {
        return ByteBuffer.wrap(toByteArray()).asReadOnlyBuffer();
    }

    @Override // com.google.protobuf.ByteString
    public List<ByteBuffer> asReadOnlyByteBufferList() {
        ArrayList arrayList = new ArrayList();
        C8906c c8906c = new C8906c(this, null);
        while (c8906c.hasNext()) {
            arrayList.add(c8906c.next().asReadOnlyByteBuffer());
        }
        return arrayList;
    }

    @Override // com.google.protobuf.ByteString
    public byte byteAt(int i) {
        ByteString.checkIndex(i, this.totalLength);
        return internalByteAt(i);
    }

    @Override // com.google.protobuf.ByteString
    public void copyTo(ByteBuffer byteBuffer) {
        this.left.copyTo(byteBuffer);
        this.right.copyTo(byteBuffer);
    }

    @Override // com.google.protobuf.ByteString
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

    @Override // com.google.protobuf.ByteString
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

    @Override // com.google.protobuf.ByteString
    public int getTreeDepth() {
        return this.treeDepth;
    }

    @Override // com.google.protobuf.ByteString
    public byte internalByteAt(int i) {
        int i2 = this.leftLength;
        if (i < i2) {
            return this.left.internalByteAt(i);
        }
        return this.right.internalByteAt(i - i2);
    }

    @Override // com.google.protobuf.ByteString
    public boolean isBalanced() {
        if (this.totalLength >= minLength(this.treeDepth)) {
            return true;
        }
        return false;
    }

    @Override // com.google.protobuf.ByteString
    public boolean isValidUtf8() {
        int partialIsValidUtf8 = this.left.partialIsValidUtf8(0, 0, this.leftLength);
        ByteString byteString = this.right;
        if (byteString.partialIsValidUtf8(partialIsValidUtf8, 0, byteString.size()) != 0) {
            return false;
        }
        return true;
    }

    @Override // com.google.protobuf.ByteString
    public CodedInputStream newCodedInput() {
        return CodedInputStream.m37051a(asReadOnlyByteBufferList(), true);
    }

    @Override // com.google.protobuf.ByteString
    public InputStream newInput() {
        return new C8907d();
    }

    @Override // com.google.protobuf.ByteString
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

    @Override // com.google.protobuf.ByteString
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

    @Override // com.google.protobuf.ByteString
    public int size() {
        return this.totalLength;
    }

    @Override // com.google.protobuf.ByteString
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

    @Override // com.google.protobuf.ByteString
    public String toStringInternal(Charset charset) {
        return new String(toByteArray(), charset);
    }

    public Object writeReplace() {
        return ByteString.wrap(toByteArray());
    }

    @Override // com.google.protobuf.ByteString
    public void writeTo(OutputStream outputStream) throws IOException {
        this.left.writeTo(outputStream);
        this.right.writeTo(outputStream);
    }

    @Override // com.google.protobuf.ByteString
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

    @Override // com.google.protobuf.ByteString
    public void writeToReverse(ByteOutput byteOutput) throws IOException {
        this.right.writeToReverse(byteOutput);
        this.left.writeToReverse(byteOutput);
    }

    /* renamed from: com.google.protobuf.RopeByteString$b */
    /* loaded from: classes4.dex */
    public static class C8905b {

        /* renamed from: a */
        public final ArrayDeque f57401a;

        public C8905b() {
            this.f57401a = new ArrayDeque();
        }

        /* renamed from: b */
        public final ByteString m35658b(ByteString byteString, ByteString byteString2) {
            m35657c(byteString);
            m35657c(byteString2);
            ByteString byteString3 = (ByteString) this.f57401a.pop();
            while (!this.f57401a.isEmpty()) {
                byteString3 = new RopeByteString((ByteString) this.f57401a.pop(), byteString3, null);
            }
            return byteString3;
        }

        /* renamed from: c */
        public final void m35657c(ByteString byteString) {
            if (byteString.isBalanced()) {
                m35655e(byteString);
            } else if (byteString instanceof RopeByteString) {
                RopeByteString ropeByteString = (RopeByteString) byteString;
                m35657c(ropeByteString.left);
                m35657c(ropeByteString.right);
            } else {
                throw new IllegalArgumentException("Has a new type of ByteString been created? Found " + byteString.getClass());
            }
        }

        /* renamed from: d */
        public final int m35656d(int i) {
            int binarySearch = Arrays.binarySearch(RopeByteString.minLengthByDepth, i);
            if (binarySearch < 0) {
                return (-(binarySearch + 1)) - 1;
            }
            return binarySearch;
        }

        /* renamed from: e */
        public final void m35655e(ByteString byteString) {
            int m35656d = m35656d(byteString.size());
            int minLength = RopeByteString.minLength(m35656d + 1);
            if (!this.f57401a.isEmpty() && ((ByteString) this.f57401a.peek()).size() < minLength) {
                int minLength2 = RopeByteString.minLength(m35656d);
                ByteString byteString2 = (ByteString) this.f57401a.pop();
                while (!this.f57401a.isEmpty() && ((ByteString) this.f57401a.peek()).size() < minLength2) {
                    byteString2 = new RopeByteString((ByteString) this.f57401a.pop(), byteString2, null);
                }
                RopeByteString ropeByteString = new RopeByteString(byteString2, byteString, null);
                while (!this.f57401a.isEmpty()) {
                    if (((ByteString) this.f57401a.peek()).size() >= RopeByteString.minLength(m35656d(ropeByteString.size()) + 1)) {
                        break;
                    }
                    ropeByteString = new RopeByteString((ByteString) this.f57401a.pop(), ropeByteString, null);
                }
                this.f57401a.push(ropeByteString);
                return;
            }
            this.f57401a.push(byteString);
        }

        public /* synthetic */ C8905b(C8904a c8904a) {
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

    @Override // com.google.protobuf.ByteString, java.lang.Iterable
    /* renamed from: iterator */
    public Iterator<Byte> iterator2() {
        return new C8904a();
    }

    @Override // com.google.protobuf.ByteString
    public void writeTo(ByteOutput byteOutput) throws IOException {
        this.left.writeTo(byteOutput);
        this.right.writeTo(byteOutput);
    }

    /* renamed from: com.google.protobuf.RopeByteString$d */
    /* loaded from: classes4.dex */
    public class C8907d extends InputStream {

        /* renamed from: a */
        public C8906c f57404a;

        /* renamed from: b */
        public ByteString.LeafByteString f57405b;

        /* renamed from: c */
        public int f57406c;

        /* renamed from: d */
        public int f57407d;

        /* renamed from: e */
        public int f57408e;

        /* renamed from: f */
        public int f57409f;

        public C8907d() {
            m35649g();
        }

        @Override // java.io.InputStream
        public int available() {
            return m35650d();
        }

        /* renamed from: b */
        public final void m35651b() {
            if (this.f57405b != null) {
                int i = this.f57407d;
                int i2 = this.f57406c;
                if (i == i2) {
                    this.f57408e += i2;
                    this.f57407d = 0;
                    if (this.f57404a.hasNext()) {
                        ByteString.LeafByteString next = this.f57404a.next();
                        this.f57405b = next;
                        this.f57406c = next.size();
                        return;
                    }
                    this.f57405b = null;
                    this.f57406c = 0;
                }
            }
        }

        /* renamed from: d */
        public final int m35650d() {
            return RopeByteString.this.size() - (this.f57408e + this.f57407d);
        }

        /* renamed from: g */
        public final void m35649g() {
            C8906c c8906c = new C8906c(RopeByteString.this, null);
            this.f57404a = c8906c;
            ByteString.LeafByteString next = c8906c.next();
            this.f57405b = next;
            this.f57406c = next.size();
            this.f57407d = 0;
            this.f57408e = 0;
        }

        /* renamed from: i */
        public final int m35648i(byte[] bArr, int i, int i2) {
            int i3 = i2;
            while (i3 > 0) {
                m35651b();
                if (this.f57405b == null) {
                    break;
                }
                int min = Math.min(this.f57406c - this.f57407d, i3);
                if (bArr != null) {
                    this.f57405b.copyTo(bArr, this.f57407d, i, min);
                    i += min;
                }
                this.f57407d += min;
                i3 -= min;
            }
            return i2 - i3;
        }

        @Override // java.io.InputStream
        public void mark(int i) {
            this.f57409f = this.f57408e + this.f57407d;
        }

        @Override // java.io.InputStream
        public boolean markSupported() {
            return true;
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i, int i2) {
            bArr.getClass();
            if (i >= 0 && i2 >= 0 && i2 <= bArr.length - i) {
                int m35648i = m35648i(bArr, i, i2);
                if (m35648i == 0) {
                    if (i2 > 0 || m35650d() == 0) {
                        return -1;
                    }
                    return m35648i;
                }
                return m35648i;
            }
            throw new IndexOutOfBoundsException();
        }

        @Override // java.io.InputStream
        public synchronized void reset() {
            m35649g();
            m35648i(null, 0, this.f57409f);
        }

        @Override // java.io.InputStream
        public long skip(long j) {
            if (j >= 0) {
                if (j > 2147483647L) {
                    j = 2147483647L;
                }
                return m35648i(null, 0, (int) j);
            }
            throw new IndexOutOfBoundsException();
        }

        @Override // java.io.InputStream
        public int read() {
            m35651b();
            ByteString.LeafByteString leafByteString = this.f57405b;
            if (leafByteString == null) {
                return -1;
            }
            int i = this.f57407d;
            this.f57407d = i + 1;
            return leafByteString.byteAt(i) & 255;
        }
    }
}
