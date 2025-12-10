package kotlin.reflect.jvm.internal.impl.protobuf;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.reflect.jvm.internal.impl.protobuf.ByteString;
import org.slf4j.Marker;

/* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.a */
/* loaded from: classes6.dex */
public class C11892a extends C11895b {

    /* renamed from: c */
    public final int f69798c;

    /* renamed from: d */
    public final int f69799d;

    /* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.a$b */
    /* loaded from: classes6.dex */
    public class C11894b implements ByteString.ByteIterator {

        /* renamed from: a */
        public int f69800a;

        /* renamed from: b */
        public final int f69801b;

        @Override // java.util.Iterator
        /* renamed from: a */
        public Byte next() {
            return Byte.valueOf(nextByte());
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f69800a < this.f69801b) {
                return true;
            }
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString.ByteIterator
        public byte nextByte() {
            int i = this.f69800a;
            if (i < this.f69801b) {
                byte[] bArr = C11892a.this.f69803a;
                this.f69800a = i + 1;
                return bArr[i];
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }

        public C11894b() {
            int mo28231f = C11892a.this.mo28231f();
            this.f69800a = mo28231f;
            this.f69801b = mo28231f + C11892a.this.size();
        }
    }

    public C11892a(byte[] bArr, int i, int i2) {
        super(bArr);
        if (i >= 0) {
            if (i2 >= 0) {
                if (i + i2 <= bArr.length) {
                    this.f69798c = i;
                    this.f69799d = i2;
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

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.C11895b, kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    public void copyToInternal(byte[] bArr, int i, int i2, int i3) {
        System.arraycopy(this.f69803a, mo28231f() + i, bArr, i2, i3);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.C11895b
    /* renamed from: d */
    public byte mo28233d(int i) {
        if (i >= 0) {
            if (i < size()) {
                return this.f69803a[this.f69798c + i];
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

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.C11895b
    /* renamed from: f */
    public int mo28231f() {
        return this.f69798c;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.C11895b, kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    public int size() {
        return this.f69799d;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.C11895b, kotlin.reflect.jvm.internal.impl.protobuf.ByteString, java.lang.Iterable
    public Iterator<Byte> iterator() {
        return new C11894b();
    }
}