package kotlin.reflect.jvm.internal.impl.protobuf;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.reflect.jvm.internal.impl.protobuf.ByteString;
import org.slf4j.Marker;

/* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.a */
/* loaded from: classes6.dex */
public class C11916a extends C11919b {

    /* renamed from: c */
    public final int f69764c;

    /* renamed from: d */
    public final int f69765d;

    /* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.a$b */
    /* loaded from: classes6.dex */
    public class C11918b implements ByteString.ByteIterator {

        /* renamed from: a */
        public int f69766a;

        /* renamed from: b */
        public final int f69767b;

        @Override // java.util.Iterator
        /* renamed from: a */
        public Byte next() {
            return Byte.valueOf(nextByte());
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f69766a < this.f69767b) {
                return true;
            }
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString.ByteIterator
        public byte nextByte() {
            int i = this.f69766a;
            if (i < this.f69767b) {
                byte[] bArr = C11916a.this.f69769a;
                this.f69766a = i + 1;
                return bArr[i];
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }

        public C11918b() {
            int mo27939f = C11916a.this.mo27939f();
            this.f69766a = mo27939f;
            this.f69767b = mo27939f + C11916a.this.size();
        }
    }

    public C11916a(byte[] bArr, int i, int i2) {
        super(bArr);
        if (i >= 0) {
            if (i2 >= 0) {
                if (i + i2 <= bArr.length) {
                    this.f69764c = i;
                    this.f69765d = i2;
                    return;
                }
                StringBuilder sb = new StringBuilder(48);
                sb.append("Offset+Length too large: ");
                sb.append(i);
                sb.append(Marker.ANY_NON_NULL_MARKER);
                sb.append(i2);
                throw new IllegalArgumentException(sb.toString());
            }
            StringBuilder sb2 = new StringBuilder(29);
            sb2.append("Length too small: ");
            sb2.append(i);
            throw new IllegalArgumentException(sb2.toString());
        }
        StringBuilder sb3 = new StringBuilder(29);
        sb3.append("Offset too small: ");
        sb3.append(i);
        throw new IllegalArgumentException(sb3.toString());
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.C11919b, kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    public void copyToInternal(byte[] bArr, int i, int i2, int i3) {
        System.arraycopy(this.f69769a, mo27939f() + i, bArr, i2, i3);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.C11919b
    /* renamed from: d */
    public byte mo27941d(int i) {
        if (i >= 0) {
            if (i < size()) {
                return this.f69769a[this.f69764c + i];
            }
            int size = size();
            StringBuilder sb = new StringBuilder(41);
            sb.append("Index too large: ");
            sb.append(i);
            sb.append(", ");
            sb.append(size);
            throw new ArrayIndexOutOfBoundsException(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder(28);
        sb2.append("Index too small: ");
        sb2.append(i);
        throw new ArrayIndexOutOfBoundsException(sb2.toString());
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.C11919b
    /* renamed from: f */
    public int mo27939f() {
        return this.f69764c;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.C11919b, kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    public int size() {
        return this.f69765d;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.C11919b, kotlin.reflect.jvm.internal.impl.protobuf.ByteString, java.lang.Iterable
    public Iterator<Byte> iterator() {
        return new C11918b();
    }
}
