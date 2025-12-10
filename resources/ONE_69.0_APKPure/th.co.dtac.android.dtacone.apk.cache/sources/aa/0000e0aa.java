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
public class C11898c extends ByteString {

    /* renamed from: g */
    public static final int[] f69808g;

    /* renamed from: a */
    public final int f69809a;

    /* renamed from: b */
    public final ByteString f69810b;

    /* renamed from: c */
    public final ByteString f69811c;

    /* renamed from: d */
    public final int f69812d;

    /* renamed from: e */
    public final int f69813e;

    /* renamed from: f */
    public int f69814f;

    /* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.c$b */
    /* loaded from: classes6.dex */
    public static class C11900b {

        /* renamed from: a */
        public final Stack f69815a;

        public C11900b() {
            this.f69815a = new Stack();
        }

        /* renamed from: b */
        public final ByteString m28220b(ByteString byteString, ByteString byteString2) {
            m28219c(byteString);
            m28219c(byteString2);
            ByteString byteString3 = (ByteString) this.f69815a.pop();
            while (!this.f69815a.isEmpty()) {
                byteString3 = new C11898c((ByteString) this.f69815a.pop(), byteString3);
            }
            return byteString3;
        }

        /* renamed from: c */
        public final void m28219c(ByteString byteString) {
            if (byteString.isBalanced()) {
                m28217e(byteString);
            } else if (byteString instanceof C11898c) {
                C11898c c11898c = (C11898c) byteString;
                m28219c(c11898c.f69810b);
                m28219c(c11898c.f69811c);
            } else {
                String valueOf = String.valueOf(byteString.getClass());
                StringBuilder sb = new StringBuilder(valueOf.length() + 49);
                sb.append("Has a new type of ByteString been created? Found ");
                sb.append(valueOf);
                throw new IllegalArgumentException(sb.toString());
            }
        }

        /* renamed from: d */
        public final int m28218d(int i) {
            int binarySearch = Arrays.binarySearch(C11898c.f69808g, i);
            if (binarySearch < 0) {
                return (-(binarySearch + 1)) - 1;
            }
            return binarySearch;
        }

        /* renamed from: e */
        public final void m28217e(ByteString byteString) {
            int m28218d = m28218d(byteString.size());
            int i = C11898c.f69808g[m28218d + 1];
            if (!this.f69815a.isEmpty() && ((ByteString) this.f69815a.peek()).size() < i) {
                int i2 = C11898c.f69808g[m28218d];
                ByteString byteString2 = (ByteString) this.f69815a.pop();
                while (!this.f69815a.isEmpty() && ((ByteString) this.f69815a.peek()).size() < i2) {
                    byteString2 = new C11898c((ByteString) this.f69815a.pop(), byteString2);
                }
                C11898c c11898c = new C11898c(byteString2, byteString);
                while (!this.f69815a.isEmpty()) {
                    if (((ByteString) this.f69815a.peek()).size() >= C11898c.f69808g[m28218d(c11898c.size()) + 1]) {
                        break;
                    }
                    c11898c = new C11898c((ByteString) this.f69815a.pop(), c11898c);
                }
                this.f69815a.push(c11898c);
                return;
            }
            this.f69815a.push(byteString);
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.c$c */
    /* loaded from: classes6.dex */
    public static class C11901c implements Iterator {

        /* renamed from: a */
        public final Stack f69816a;

        /* renamed from: b */
        public C11895b f69817b;

        /* renamed from: a */
        public final C11895b m28216a(ByteString byteString) {
            while (byteString instanceof C11898c) {
                C11898c c11898c = (C11898c) byteString;
                this.f69816a.push(c11898c);
                byteString = c11898c.f69810b;
            }
            return (C11895b) byteString;
        }

        /* renamed from: b */
        public final C11895b m28215b() {
            while (!this.f69816a.isEmpty()) {
                C11895b m28216a = m28216a(((C11898c) this.f69816a.pop()).f69811c);
                if (!m28216a.isEmpty()) {
                    return m28216a;
                }
            }
            return null;
        }

        @Override // java.util.Iterator
        /* renamed from: c */
        public C11895b next() {
            C11895b c11895b = this.f69817b;
            if (c11895b != null) {
                this.f69817b = m28215b();
                return c11895b;
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f69817b != null) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }

        public C11901c(ByteString byteString) {
            this.f69816a = new Stack();
            this.f69817b = m28216a(byteString);
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.c$d */
    /* loaded from: classes6.dex */
    public class C11902d implements ByteString.ByteIterator {

        /* renamed from: a */
        public final C11901c f69818a;

        /* renamed from: b */
        public ByteString.ByteIterator f69819b;

        /* renamed from: c */
        public int f69820c;

        @Override // java.util.Iterator
        /* renamed from: a */
        public Byte next() {
            return Byte.valueOf(nextByte());
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f69820c > 0) {
                return true;
            }
            return false;
        }

        /* JADX WARN: Type inference failed for: r0v8, types: [kotlin.reflect.jvm.internal.impl.protobuf.ByteString$ByteIterator] */
        @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString.ByteIterator
        public byte nextByte() {
            if (!this.f69819b.hasNext()) {
                this.f69819b = this.f69818a.next().iterator();
            }
            this.f69820c--;
            return this.f69819b.nextByte();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [kotlin.reflect.jvm.internal.impl.protobuf.ByteString$ByteIterator] */
        public C11902d() {
            C11901c c11901c = new C11901c(C11898c.this);
            this.f69818a = c11901c;
            this.f69819b = c11901c.next().iterator();
            this.f69820c = C11898c.this.size();
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
        f69808g = new int[arrayList.size()];
        int i4 = 0;
        while (true) {
            int[] iArr = f69808g;
            if (i4 < iArr.length) {
                iArr[i4] = ((Integer) arrayList.get(i4)).intValue();
                i4++;
            } else {
                return;
            }
        }
    }

    /* renamed from: g */
    public static ByteString m28224g(ByteString byteString, ByteString byteString2) {
        C11898c c11898c;
        if (byteString instanceof C11898c) {
            c11898c = (C11898c) byteString;
        } else {
            c11898c = null;
        }
        if (byteString2.size() != 0) {
            if (byteString.size() != 0) {
                int size = byteString.size() + byteString2.size();
                if (size < 128) {
                    return m28223h(byteString, byteString2);
                }
                if (c11898c != null && c11898c.f69811c.size() + byteString2.size() < 128) {
                    byteString2 = new C11898c(c11898c.f69810b, m28223h(c11898c.f69811c, byteString2));
                } else if (c11898c != null && c11898c.f69810b.getTreeDepth() > c11898c.f69811c.getTreeDepth() && c11898c.getTreeDepth() > byteString2.getTreeDepth()) {
                    byteString2 = new C11898c(c11898c.f69810b, new C11898c(c11898c.f69811c, byteString2));
                } else {
                    if (size < f69808g[Math.max(byteString.getTreeDepth(), byteString2.getTreeDepth()) + 1]) {
                        return new C11900b().m28220b(byteString, byteString2);
                    }
                    return new C11898c(byteString, byteString2);
                }
            }
            return byteString2;
        }
        return byteString;
    }

    /* renamed from: h */
    public static C11895b m28223h(ByteString byteString, ByteString byteString2) {
        int size = byteString.size();
        int size2 = byteString2.size();
        byte[] bArr = new byte[size + size2];
        byteString.copyTo(bArr, 0, 0, size);
        byteString2.copyTo(bArr, 0, size, size2);
        return new C11895b(bArr);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    /* renamed from: c */
    public void mo28228c(OutputStream outputStream, int i, int i2) {
        int i3 = i + i2;
        int i4 = this.f69812d;
        if (i3 <= i4) {
            this.f69810b.mo28228c(outputStream, i, i2);
        } else if (i >= i4) {
            this.f69811c.mo28228c(outputStream, i - i4, i2);
        } else {
            int i5 = i4 - i;
            this.f69810b.mo28228c(outputStream, i, i5);
            this.f69811c.mo28228c(outputStream, 0, i2 - i5);
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    public void copyToInternal(byte[] bArr, int i, int i2, int i3) {
        int i4 = i + i3;
        int i5 = this.f69812d;
        if (i4 <= i5) {
            this.f69810b.copyToInternal(bArr, i, i2, i3);
        } else if (i >= i5) {
            this.f69811c.copyToInternal(bArr, i - i5, i2, i3);
        } else {
            int i6 = i5 - i;
            this.f69810b.copyToInternal(bArr, i, i2, i6);
            this.f69811c.copyToInternal(bArr, 0, i2 + i6, i3 - i6);
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
        if (this.f69809a != byteString.size()) {
            return false;
        }
        if (this.f69809a == 0) {
            return true;
        }
        if (this.f69814f != 0 && (peekCachedHashCode = byteString.peekCachedHashCode()) != 0 && this.f69814f != peekCachedHashCode) {
            return false;
        }
        return m28222i(byteString);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    public int getTreeDepth() {
        return this.f69813e;
    }

    public int hashCode() {
        int i = this.f69814f;
        if (i == 0) {
            int i2 = this.f69809a;
            i = partialHash(i2, 0, i2);
            if (i == 0) {
                i = 1;
            }
            this.f69814f = i;
        }
        return i;
    }

    /* renamed from: i */
    public final boolean m28222i(ByteString byteString) {
        boolean m28232e;
        C11901c c11901c = new C11901c(this);
        C11895b c11895b = (C11895b) c11901c.next();
        C11901c c11901c2 = new C11901c(byteString);
        C11895b c11895b2 = (C11895b) c11901c2.next();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int size = c11895b.size() - i;
            int size2 = c11895b2.size() - i2;
            int min = Math.min(size, size2);
            if (i == 0) {
                m28232e = c11895b.m28232e(c11895b2, i2, min);
            } else {
                m28232e = c11895b2.m28232e(c11895b, i, min);
            }
            if (!m28232e) {
                return false;
            }
            i3 += min;
            int i4 = this.f69809a;
            if (i3 >= i4) {
                if (i3 == i4) {
                    return true;
                }
                throw new IllegalStateException();
            }
            if (min == size) {
                c11895b = (C11895b) c11901c.next();
                i = 0;
            } else {
                i += min;
            }
            if (min == size2) {
                c11895b2 = (C11895b) c11901c2.next();
                i2 = 0;
            } else {
                i2 += min;
            }
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    public boolean isBalanced() {
        if (this.f69809a >= f69808g[this.f69813e]) {
            return true;
        }
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    public boolean isValidUtf8() {
        int partialIsValidUtf8 = this.f69810b.partialIsValidUtf8(0, 0, this.f69812d);
        ByteString byteString = this.f69811c;
        if (byteString.partialIsValidUtf8(partialIsValidUtf8, 0, byteString.size()) != 0) {
            return false;
        }
        return true;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    public CodedInputStream newCodedInput() {
        return CodedInputStream.newInstance(new C11903e());
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    public int partialHash(int i, int i2, int i3) {
        int i4 = i2 + i3;
        int i5 = this.f69812d;
        if (i4 <= i5) {
            return this.f69810b.partialHash(i, i2, i3);
        }
        if (i2 >= i5) {
            return this.f69811c.partialHash(i, i2 - i5, i3);
        }
        int i6 = i5 - i2;
        return this.f69811c.partialHash(this.f69810b.partialHash(i, i2, i6), 0, i3 - i6);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    public int partialIsValidUtf8(int i, int i2, int i3) {
        int i4 = i2 + i3;
        int i5 = this.f69812d;
        if (i4 <= i5) {
            return this.f69810b.partialIsValidUtf8(i, i2, i3);
        }
        if (i2 >= i5) {
            return this.f69811c.partialIsValidUtf8(i, i2 - i5, i3);
        }
        int i6 = i5 - i2;
        return this.f69811c.partialIsValidUtf8(this.f69810b.partialIsValidUtf8(i, i2, i6), 0, i3 - i6);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    public int peekCachedHashCode() {
        return this.f69814f;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    public int size() {
        return this.f69809a;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    public String toString(String str) {
        return new String(toByteArray(), str);
    }

    public C11898c(ByteString byteString, ByteString byteString2) {
        this.f69814f = 0;
        this.f69810b = byteString;
        this.f69811c = byteString2;
        int size = byteString.size();
        this.f69812d = size;
        this.f69809a = size + byteString2.size();
        this.f69813e = Math.max(byteString.getTreeDepth(), byteString2.getTreeDepth()) + 1;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString, java.lang.Iterable
    public Iterator<Byte> iterator() {
        return new C11902d();
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.c$e */
    /* loaded from: classes6.dex */
    public class C11903e extends InputStream {

        /* renamed from: a */
        public C11901c f69822a;

        /* renamed from: b */
        public C11895b f69823b;

        /* renamed from: c */
        public int f69824c;

        /* renamed from: d */
        public int f69825d;

        /* renamed from: e */
        public int f69826e;

        /* renamed from: f */
        public int f69827f;

        public C11903e() {
            m28211d();
        }

        @Override // java.io.InputStream
        public int available() {
            return C11898c.this.size() - (this.f69826e + this.f69825d);
        }

        /* renamed from: b */
        public final void m28212b() {
            if (this.f69823b != null) {
                int i = this.f69825d;
                int i2 = this.f69824c;
                if (i == i2) {
                    this.f69826e += i2;
                    this.f69825d = 0;
                    if (this.f69822a.hasNext()) {
                        C11895b next = this.f69822a.next();
                        this.f69823b = next;
                        this.f69824c = next.size();
                        return;
                    }
                    this.f69823b = null;
                    this.f69824c = 0;
                }
            }
        }

        /* renamed from: d */
        public final void m28211d() {
            C11901c c11901c = new C11901c(C11898c.this);
            this.f69822a = c11901c;
            C11895b next = c11901c.next();
            this.f69823b = next;
            this.f69824c = next.size();
            this.f69825d = 0;
            this.f69826e = 0;
        }

        /* renamed from: g */
        public final int m28210g(byte[] bArr, int i, int i2) {
            int i3 = i2;
            while (true) {
                if (i3 <= 0) {
                    break;
                }
                m28212b();
                if (this.f69823b == null) {
                    if (i3 == i2) {
                        return -1;
                    }
                } else {
                    int min = Math.min(this.f69824c - this.f69825d, i3);
                    if (bArr != null) {
                        this.f69823b.copyTo(bArr, this.f69825d, i, min);
                        i += min;
                    }
                    this.f69825d += min;
                    i3 -= min;
                }
            }
            return i2 - i3;
        }

        @Override // java.io.InputStream
        public void mark(int i) {
            this.f69827f = this.f69826e + this.f69825d;
        }

        @Override // java.io.InputStream
        public boolean markSupported() {
            return true;
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i, int i2) {
            bArr.getClass();
            if (i >= 0 && i2 >= 0 && i2 <= bArr.length - i) {
                return m28210g(bArr, i, i2);
            }
            throw new IndexOutOfBoundsException();
        }

        @Override // java.io.InputStream
        public synchronized void reset() {
            m28211d();
            m28210g(null, 0, this.f69827f);
        }

        @Override // java.io.InputStream
        public long skip(long j) {
            if (j >= 0) {
                if (j > 2147483647L) {
                    j = 2147483647L;
                }
                return m28210g(null, 0, (int) j);
            }
            throw new IndexOutOfBoundsException();
        }

        @Override // java.io.InputStream
        public int read() {
            m28212b();
            C11895b c11895b = this.f69823b;
            if (c11895b == null) {
                return -1;
            }
            int i = this.f69825d;
            this.f69825d = i + 1;
            return c11895b.mo28233d(i) & 255;
        }
    }
}