package kotlin.reflect.jvm.internal.impl.protobuf;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Stack;
import kotlin.reflect.jvm.internal.impl.protobuf.ByteString;

/* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.c */
/* loaded from: classes6.dex */
public class C11922c extends ByteString {

    /* renamed from: g */
    public static final int[] f69774g;

    /* renamed from: a */
    public final int f69775a;

    /* renamed from: b */
    public final ByteString f69776b;

    /* renamed from: c */
    public final ByteString f69777c;

    /* renamed from: d */
    public final int f69778d;

    /* renamed from: e */
    public final int f69779e;

    /* renamed from: f */
    public int f69780f;

    /* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.c$b */
    /* loaded from: classes6.dex */
    public static class C11924b {

        /* renamed from: a */
        public final Stack f69781a;

        public C11924b() {
            this.f69781a = new Stack();
        }

        /* renamed from: b */
        public final ByteString m27928b(ByteString byteString, ByteString byteString2) {
            m27927c(byteString);
            m27927c(byteString2);
            ByteString byteString3 = (ByteString) this.f69781a.pop();
            while (!this.f69781a.isEmpty()) {
                byteString3 = new C11922c((ByteString) this.f69781a.pop(), byteString3);
            }
            return byteString3;
        }

        /* renamed from: c */
        public final void m27927c(ByteString byteString) {
            if (byteString.isBalanced()) {
                m27925e(byteString);
            } else if (byteString instanceof C11922c) {
                C11922c c11922c = (C11922c) byteString;
                m27927c(c11922c.f69776b);
                m27927c(c11922c.f69777c);
            } else {
                String valueOf = String.valueOf(byteString.getClass());
                StringBuilder sb = new StringBuilder(valueOf.length() + 49);
                sb.append("Has a new type of ByteString been created? Found ");
                sb.append(valueOf);
                throw new IllegalArgumentException(sb.toString());
            }
        }

        /* renamed from: d */
        public final int m27926d(int i) {
            int binarySearch = Arrays.binarySearch(C11922c.f69774g, i);
            if (binarySearch < 0) {
                return (-(binarySearch + 1)) - 1;
            }
            return binarySearch;
        }

        /* renamed from: e */
        public final void m27925e(ByteString byteString) {
            int m27926d = m27926d(byteString.size());
            int i = C11922c.f69774g[m27926d + 1];
            if (!this.f69781a.isEmpty() && ((ByteString) this.f69781a.peek()).size() < i) {
                int i2 = C11922c.f69774g[m27926d];
                ByteString byteString2 = (ByteString) this.f69781a.pop();
                while (!this.f69781a.isEmpty() && ((ByteString) this.f69781a.peek()).size() < i2) {
                    byteString2 = new C11922c((ByteString) this.f69781a.pop(), byteString2);
                }
                C11922c c11922c = new C11922c(byteString2, byteString);
                while (!this.f69781a.isEmpty()) {
                    if (((ByteString) this.f69781a.peek()).size() >= C11922c.f69774g[m27926d(c11922c.size()) + 1]) {
                        break;
                    }
                    c11922c = new C11922c((ByteString) this.f69781a.pop(), c11922c);
                }
                this.f69781a.push(c11922c);
                return;
            }
            this.f69781a.push(byteString);
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.c$c */
    /* loaded from: classes6.dex */
    public static class C11925c implements Iterator {

        /* renamed from: a */
        public final Stack f69782a;

        /* renamed from: b */
        public C11919b f69783b;

        /* renamed from: a */
        public final C11919b m27924a(ByteString byteString) {
            while (byteString instanceof C11922c) {
                C11922c c11922c = (C11922c) byteString;
                this.f69782a.push(c11922c);
                byteString = c11922c.f69776b;
            }
            return (C11919b) byteString;
        }

        /* renamed from: b */
        public final C11919b m27923b() {
            while (!this.f69782a.isEmpty()) {
                C11919b m27924a = m27924a(((C11922c) this.f69782a.pop()).f69777c);
                if (!m27924a.isEmpty()) {
                    return m27924a;
                }
            }
            return null;
        }

        @Override // java.util.Iterator
        /* renamed from: c */
        public C11919b next() {
            C11919b c11919b = this.f69783b;
            if (c11919b != null) {
                this.f69783b = m27923b();
                return c11919b;
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f69783b != null) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }

        public C11925c(ByteString byteString) {
            this.f69782a = new Stack();
            this.f69783b = m27924a(byteString);
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.c$d */
    /* loaded from: classes6.dex */
    public class C11926d implements ByteString.ByteIterator {

        /* renamed from: a */
        public final C11925c f69784a;

        /* renamed from: b */
        public ByteString.ByteIterator f69785b;

        /* renamed from: c */
        public int f69786c;

        @Override // java.util.Iterator
        /* renamed from: a */
        public Byte next() {
            return Byte.valueOf(nextByte());
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f69786c > 0) {
                return true;
            }
            return false;
        }

        /* JADX WARN: Type inference failed for: r0v8, types: [kotlin.reflect.jvm.internal.impl.protobuf.ByteString$ByteIterator] */
        @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString.ByteIterator
        public byte nextByte() {
            if (!this.f69785b.hasNext()) {
                this.f69785b = this.f69784a.next().iterator();
            }
            this.f69786c--;
            return this.f69785b.nextByte();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [kotlin.reflect.jvm.internal.impl.protobuf.ByteString$ByteIterator] */
        public C11926d() {
            C11922c.this = r3;
            C11925c c11925c = new C11925c(r3);
            this.f69784a = c11925c;
            this.f69785b = c11925c.next().iterator();
            this.f69786c = r3.size();
        }
    }

    static {
        ArrayList arrayList = new ArrayList();
        int i = 1;
        int i2 = 1;
        while (i > 0) {
            arrayList.add(Integer.valueOf(i));
            int i3 = i2 + i;
            i2 = i;
            i = i3;
        }
        arrayList.add(Integer.MAX_VALUE);
        f69774g = new int[arrayList.size()];
        int i4 = 0;
        while (true) {
            int[] iArr = f69774g;
            if (i4 < iArr.length) {
                iArr[i4] = ((Integer) arrayList.get(i4)).intValue();
                i4++;
            } else {
                return;
            }
        }
    }

    /* renamed from: g */
    public static ByteString m27932g(ByteString byteString, ByteString byteString2) {
        C11922c c11922c;
        if (byteString instanceof C11922c) {
            c11922c = (C11922c) byteString;
        } else {
            c11922c = null;
        }
        if (byteString2.size() != 0) {
            if (byteString.size() != 0) {
                int size = byteString.size() + byteString2.size();
                if (size < 128) {
                    return m27931h(byteString, byteString2);
                }
                if (c11922c != null && c11922c.f69777c.size() + byteString2.size() < 128) {
                    byteString2 = new C11922c(c11922c.f69776b, m27931h(c11922c.f69777c, byteString2));
                } else if (c11922c != null && c11922c.f69776b.getTreeDepth() > c11922c.f69777c.getTreeDepth() && c11922c.getTreeDepth() > byteString2.getTreeDepth()) {
                    byteString2 = new C11922c(c11922c.f69776b, new C11922c(c11922c.f69777c, byteString2));
                } else {
                    if (size < f69774g[Math.max(byteString.getTreeDepth(), byteString2.getTreeDepth()) + 1]) {
                        return new C11924b().m27928b(byteString, byteString2);
                    }
                    return new C11922c(byteString, byteString2);
                }
            }
            return byteString2;
        }
        return byteString;
    }

    /* renamed from: h */
    public static C11919b m27931h(ByteString byteString, ByteString byteString2) {
        int size = byteString.size();
        int size2 = byteString2.size();
        byte[] bArr = new byte[size + size2];
        byteString.copyTo(bArr, 0, 0, size);
        byteString2.copyTo(bArr, 0, size, size2);
        return new C11919b(bArr);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    /* renamed from: c */
    public void mo27936c(OutputStream outputStream, int i, int i2) {
        int i3 = i + i2;
        int i4 = this.f69778d;
        if (i3 <= i4) {
            this.f69776b.mo27936c(outputStream, i, i2);
        } else if (i >= i4) {
            this.f69777c.mo27936c(outputStream, i - i4, i2);
        } else {
            int i5 = i4 - i;
            this.f69776b.mo27936c(outputStream, i, i5);
            this.f69777c.mo27936c(outputStream, 0, i2 - i5);
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    public void copyToInternal(byte[] bArr, int i, int i2, int i3) {
        int i4 = i + i3;
        int i5 = this.f69778d;
        if (i4 <= i5) {
            this.f69776b.copyToInternal(bArr, i, i2, i3);
        } else if (i >= i5) {
            this.f69777c.copyToInternal(bArr, i - i5, i2, i3);
        } else {
            int i6 = i5 - i;
            this.f69776b.copyToInternal(bArr, i, i2, i6);
            this.f69777c.copyToInternal(bArr, 0, i2 + i6, i3 - i6);
        }
    }

    public boolean equals(Object obj) {
        int peekCachedHashCode;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ByteString)) {
            return false;
        }
        ByteString byteString = (ByteString) obj;
        if (this.f69775a != byteString.size()) {
            return false;
        }
        if (this.f69775a == 0) {
            return true;
        }
        if (this.f69780f != 0 && (peekCachedHashCode = byteString.peekCachedHashCode()) != 0 && this.f69780f != peekCachedHashCode) {
            return false;
        }
        return m27930i(byteString);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    public int getTreeDepth() {
        return this.f69779e;
    }

    public int hashCode() {
        int i = this.f69780f;
        if (i == 0) {
            int i2 = this.f69775a;
            i = partialHash(i2, 0, i2);
            if (i == 0) {
                i = 1;
            }
            this.f69780f = i;
        }
        return i;
    }

    /* renamed from: i */
    public final boolean m27930i(ByteString byteString) {
        boolean m27940e;
        C11925c c11925c = new C11925c(this);
        C11919b c11919b = (C11919b) c11925c.next();
        C11925c c11925c2 = new C11925c(byteString);
        C11919b c11919b2 = (C11919b) c11925c2.next();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int size = c11919b.size() - i;
            int size2 = c11919b2.size() - i2;
            int min = Math.min(size, size2);
            if (i == 0) {
                m27940e = c11919b.m27940e(c11919b2, i2, min);
            } else {
                m27940e = c11919b2.m27940e(c11919b, i, min);
            }
            if (!m27940e) {
                return false;
            }
            i3 += min;
            int i4 = this.f69775a;
            if (i3 >= i4) {
                if (i3 == i4) {
                    return true;
                }
                throw new IllegalStateException();
            }
            if (min == size) {
                c11919b = (C11919b) c11925c.next();
                i = 0;
            } else {
                i += min;
            }
            if (min == size2) {
                c11919b2 = (C11919b) c11925c2.next();
                i2 = 0;
            } else {
                i2 += min;
            }
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    public boolean isBalanced() {
        if (this.f69775a >= f69774g[this.f69779e]) {
            return true;
        }
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    public boolean isValidUtf8() {
        int partialIsValidUtf8 = this.f69776b.partialIsValidUtf8(0, 0, this.f69778d);
        ByteString byteString = this.f69777c;
        if (byteString.partialIsValidUtf8(partialIsValidUtf8, 0, byteString.size()) != 0) {
            return false;
        }
        return true;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    public CodedInputStream newCodedInput() {
        return CodedInputStream.newInstance(new C11927e());
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    public int partialHash(int i, int i2, int i3) {
        int i4 = i2 + i3;
        int i5 = this.f69778d;
        if (i4 <= i5) {
            return this.f69776b.partialHash(i, i2, i3);
        }
        if (i2 >= i5) {
            return this.f69777c.partialHash(i, i2 - i5, i3);
        }
        int i6 = i5 - i2;
        return this.f69777c.partialHash(this.f69776b.partialHash(i, i2, i6), 0, i3 - i6);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    public int partialIsValidUtf8(int i, int i2, int i3) {
        int i4 = i2 + i3;
        int i5 = this.f69778d;
        if (i4 <= i5) {
            return this.f69776b.partialIsValidUtf8(i, i2, i3);
        }
        if (i2 >= i5) {
            return this.f69777c.partialIsValidUtf8(i, i2 - i5, i3);
        }
        int i6 = i5 - i2;
        return this.f69777c.partialIsValidUtf8(this.f69776b.partialIsValidUtf8(i, i2, i6), 0, i3 - i6);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    public int peekCachedHashCode() {
        return this.f69780f;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    public int size() {
        return this.f69775a;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    public String toString(String str) {
        return new String(toByteArray(), str);
    }

    public C11922c(ByteString byteString, ByteString byteString2) {
        this.f69780f = 0;
        this.f69776b = byteString;
        this.f69777c = byteString2;
        int size = byteString.size();
        this.f69778d = size;
        this.f69775a = size + byteString2.size();
        this.f69779e = Math.max(byteString.getTreeDepth(), byteString2.getTreeDepth()) + 1;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString, java.lang.Iterable
    public Iterator<Byte> iterator() {
        return new C11926d();
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.c$e */
    /* loaded from: classes6.dex */
    public class C11927e extends InputStream {

        /* renamed from: a */
        public C11925c f69788a;

        /* renamed from: b */
        public C11919b f69789b;

        /* renamed from: c */
        public int f69790c;

        /* renamed from: d */
        public int f69791d;

        /* renamed from: e */
        public int f69792e;

        /* renamed from: f */
        public int f69793f;

        public C11927e() {
            C11922c.this = r1;
            m27919d();
        }

        @Override // java.io.InputStream
        public int available() {
            return C11922c.this.size() - (this.f69792e + this.f69791d);
        }

        /* renamed from: b */
        public final void m27920b() {
            if (this.f69789b != null) {
                int i = this.f69791d;
                int i2 = this.f69790c;
                if (i == i2) {
                    this.f69792e += i2;
                    this.f69791d = 0;
                    if (this.f69788a.hasNext()) {
                        C11919b next = this.f69788a.next();
                        this.f69789b = next;
                        this.f69790c = next.size();
                        return;
                    }
                    this.f69789b = null;
                    this.f69790c = 0;
                }
            }
        }

        /* renamed from: d */
        public final void m27919d() {
            C11925c c11925c = new C11925c(C11922c.this);
            this.f69788a = c11925c;
            C11919b next = c11925c.next();
            this.f69789b = next;
            this.f69790c = next.size();
            this.f69791d = 0;
            this.f69792e = 0;
        }

        /* renamed from: g */
        public final int m27918g(byte[] bArr, int i, int i2) {
            int i3 = i2;
            while (true) {
                if (i3 <= 0) {
                    break;
                }
                m27920b();
                if (this.f69789b == null) {
                    if (i3 == i2) {
                        return -1;
                    }
                } else {
                    int min = Math.min(this.f69790c - this.f69791d, i3);
                    if (bArr != null) {
                        this.f69789b.copyTo(bArr, this.f69791d, i, min);
                        i += min;
                    }
                    this.f69791d += min;
                    i3 -= min;
                }
            }
            return i2 - i3;
        }

        @Override // java.io.InputStream
        public void mark(int i) {
            this.f69793f = this.f69792e + this.f69791d;
        }

        @Override // java.io.InputStream
        public boolean markSupported() {
            return true;
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i, int i2) {
            bArr.getClass();
            if (i >= 0 && i2 >= 0 && i2 <= bArr.length - i) {
                return m27918g(bArr, i, i2);
            }
            throw new IndexOutOfBoundsException();
        }

        @Override // java.io.InputStream
        public synchronized void reset() {
            m27919d();
            m27918g(null, 0, this.f69793f);
        }

        @Override // java.io.InputStream
        public long skip(long j) {
            if (j >= 0) {
                if (j > 2147483647L) {
                    j = 2147483647L;
                }
                return m27918g(null, 0, (int) j);
            }
            throw new IndexOutOfBoundsException();
        }

        @Override // java.io.InputStream
        public int read() {
            m27920b();
            C11919b c11919b = this.f69789b;
            if (c11919b == null) {
                return -1;
            }
            int i = this.f69791d;
            this.f69791d = i + 1;
            return c11919b.mo27941d(i) & 255;
        }
    }
}
