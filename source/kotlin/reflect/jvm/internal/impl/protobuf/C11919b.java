package kotlin.reflect.jvm.internal.impl.protobuf;

import java.io.OutputStream;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.reflect.jvm.internal.impl.protobuf.ByteString;

/* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.b */
/* loaded from: classes6.dex */
public class C11919b extends ByteString {

    /* renamed from: a */
    public final byte[] f69769a;

    /* renamed from: b */
    public int f69770b = 0;

    /* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.b$b */
    /* loaded from: classes6.dex */
    public class C11921b implements ByteString.ByteIterator {

        /* renamed from: a */
        public int f69771a;

        /* renamed from: b */
        public final int f69772b;

        @Override // java.util.Iterator
        /* renamed from: a */
        public Byte next() {
            return Byte.valueOf(nextByte());
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f69771a < this.f69772b) {
                return true;
            }
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString.ByteIterator
        public byte nextByte() {
            try {
                byte[] bArr = C11919b.this.f69769a;
                int i = this.f69771a;
                this.f69771a = i + 1;
                return bArr[i];
            } catch (ArrayIndexOutOfBoundsException e) {
                throw new NoSuchElementException(e.getMessage());
            }
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }

        public C11921b() {
            C11919b.this = r2;
            this.f69771a = 0;
            this.f69772b = r2.size();
        }
    }

    public C11919b(byte[] bArr) {
        this.f69769a = bArr;
    }

    /* renamed from: g */
    public static int m27938g(int i, byte[] bArr, int i2, int i3) {
        for (int i4 = i2; i4 < i2 + i3; i4++) {
            i = (i * 31) + bArr[i4];
        }
        return i;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    /* renamed from: c */
    public void mo27936c(OutputStream outputStream, int i, int i2) {
        outputStream.write(this.f69769a, mo27939f() + i, i2);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    public void copyToInternal(byte[] bArr, int i, int i2, int i3) {
        System.arraycopy(this.f69769a, i, bArr, i2, i3);
    }

    /* renamed from: d */
    public byte mo27941d(int i) {
        return this.f69769a[i];
    }

    /* renamed from: e */
    public boolean m27940e(C11919b c11919b, int i, int i2) {
        if (i2 <= c11919b.size()) {
            if (i + i2 <= c11919b.size()) {
                byte[] bArr = this.f69769a;
                byte[] bArr2 = c11919b.f69769a;
                int mo27939f = mo27939f() + i2;
                int mo27939f2 = mo27939f();
                int mo27939f3 = c11919b.mo27939f() + i;
                while (mo27939f2 < mo27939f) {
                    if (bArr[mo27939f2] != bArr2[mo27939f3]) {
                        return false;
                    }
                    mo27939f2++;
                    mo27939f3++;
                }
                return true;
            }
            int size = c11919b.size();
            StringBuilder sb = new StringBuilder(59);
            sb.append("Ran off end of other: ");
            sb.append(i);
            sb.append(", ");
            sb.append(i2);
            sb.append(", ");
            sb.append(size);
            throw new IllegalArgumentException(sb.toString());
        }
        int size2 = size();
        StringBuilder sb2 = new StringBuilder(40);
        sb2.append("Length too large: ");
        sb2.append(i2);
        sb2.append(size2);
        throw new IllegalArgumentException(sb2.toString());
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ByteString) || size() != ((ByteString) obj).size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (obj instanceof C11919b) {
            return m27940e((C11919b) obj, 0, size());
        }
        if (obj instanceof C11922c) {
            return obj.equals(this);
        }
        String valueOf = String.valueOf(obj.getClass());
        StringBuilder sb = new StringBuilder(valueOf.length() + 49);
        sb.append("Has a new type of ByteString been created? Found ");
        sb.append(valueOf);
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: f */
    public int mo27939f() {
        return 0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    public int getTreeDepth() {
        return 0;
    }

    public int hashCode() {
        int i = this.f69770b;
        if (i == 0) {
            int size = size();
            i = partialHash(size, 0, size);
            if (i == 0) {
                i = 1;
            }
            this.f69770b = i;
        }
        return i;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    public boolean isBalanced() {
        return true;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    public boolean isValidUtf8() {
        int mo27939f = mo27939f();
        return AbstractC22717w02.m938f(this.f69769a, mo27939f, size() + mo27939f);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    public CodedInputStream newCodedInput() {
        return CodedInputStream.m27996b(this);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    public int partialHash(int i, int i2, int i3) {
        return m27938g(i, this.f69769a, mo27939f() + i2, i3);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    public int partialIsValidUtf8(int i, int i2, int i3) {
        int mo27939f = mo27939f() + i2;
        return AbstractC22717w02.m937g(i, this.f69769a, mo27939f, i3 + mo27939f);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    public int peekCachedHashCode() {
        return this.f69770b;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    public int size() {
        return this.f69769a.length;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    public String toString(String str) {
        return new String(this.f69769a, mo27939f(), size(), str);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString, java.lang.Iterable
    public Iterator<Byte> iterator() {
        return new C11921b();
    }
}
