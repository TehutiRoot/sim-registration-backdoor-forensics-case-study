package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.Writer;
import java.io.IOException;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class UnknownFieldSetLite {

    /* renamed from: f */
    public static final UnknownFieldSetLite f34890f = new UnknownFieldSetLite(0, new int[0], new Object[0], false);

    /* renamed from: a */
    public int f34891a;

    /* renamed from: b */
    public int[] f34892b;

    /* renamed from: c */
    public Object[] f34893c;

    /* renamed from: d */
    public int f34894d;

    /* renamed from: e */
    public boolean f34895e;

    public UnknownFieldSetLite() {
        this(0, new int[8], new Object[8], true);
    }

    /* renamed from: c */
    public static boolean m55462c(int[] iArr, int[] iArr2, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            if (iArr[i2] != iArr2[i2]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: d */
    public static boolean m55461d(Object[] objArr, Object[] objArr2, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            if (!objArr[i2].equals(objArr2[i2])) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: e */
    public static int m55460e(int[] iArr, int i) {
        int i2 = 17;
        for (int i3 = 0; i3 < i; i3++) {
            i2 = (i2 * 31) + iArr[i3];
        }
        return i2;
    }

    /* renamed from: f */
    public static int m55459f(Object[] objArr, int i) {
        int i2 = 17;
        for (int i3 = 0; i3 < i; i3++) {
            i2 = (i2 * 31) + objArr[i3].hashCode();
        }
        return i2;
    }

    public static UnknownFieldSetLite getDefaultInstance() {
        return f34890f;
    }

    /* renamed from: k */
    public static UnknownFieldSetLite m55454k(UnknownFieldSetLite unknownFieldSetLite, UnknownFieldSetLite unknownFieldSetLite2) {
        int i = unknownFieldSetLite.f34891a + unknownFieldSetLite2.f34891a;
        int[] copyOf = Arrays.copyOf(unknownFieldSetLite.f34892b, i);
        System.arraycopy(unknownFieldSetLite2.f34892b, 0, copyOf, unknownFieldSetLite.f34891a, unknownFieldSetLite2.f34891a);
        Object[] copyOf2 = Arrays.copyOf(unknownFieldSetLite.f34893c, i);
        System.arraycopy(unknownFieldSetLite2.f34893c, 0, copyOf2, unknownFieldSetLite.f34891a, unknownFieldSetLite2.f34891a);
        return new UnknownFieldSetLite(i, copyOf, copyOf2, true);
    }

    /* renamed from: l */
    public static UnknownFieldSetLite m55453l() {
        return new UnknownFieldSetLite();
    }

    /* renamed from: p */
    public static void m55449p(int i, Object obj, Writer writer) {
        int tagFieldNumber = WireFormat.getTagFieldNumber(i);
        int tagWireType = WireFormat.getTagWireType(i);
        if (tagWireType != 0) {
            if (tagWireType != 1) {
                if (tagWireType != 2) {
                    if (tagWireType != 3) {
                        if (tagWireType == 5) {
                            writer.mo55231c(tagFieldNumber, ((Integer) obj).intValue());
                            return;
                        }
                        throw new RuntimeException(InvalidProtocolBufferException.invalidWireType());
                    } else if (writer.mo55254A() == Writer.FieldOrder.ASCENDING) {
                        writer.mo55219o(tagFieldNumber);
                        ((UnknownFieldSetLite) obj).writeTo(writer);
                        writer.mo55217q(tagFieldNumber);
                        return;
                    } else {
                        writer.mo55217q(tagFieldNumber);
                        ((UnknownFieldSetLite) obj).writeTo(writer);
                        writer.mo55219o(tagFieldNumber);
                        return;
                    }
                }
                writer.mo55246I(tagFieldNumber, (ByteString) obj);
                return;
            }
            writer.mo55222l(tagFieldNumber, ((Long) obj).longValue());
            return;
        }
        writer.mo55253B(tagFieldNumber, ((Long) obj).longValue());
    }

    /* renamed from: a */
    public void m55464a() {
        if (this.f34895e) {
            return;
        }
        throw new UnsupportedOperationException();
    }

    /* renamed from: b */
    public final void m55463b() {
        int i;
        int i2 = this.f34891a;
        int[] iArr = this.f34892b;
        if (i2 == iArr.length) {
            if (i2 < 4) {
                i = 8;
            } else {
                i = i2 >> 1;
            }
            int i3 = i2 + i;
            this.f34892b = Arrays.copyOf(iArr, i3);
            this.f34893c = Arrays.copyOf(this.f34893c, i3);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof UnknownFieldSetLite)) {
            return false;
        }
        UnknownFieldSetLite unknownFieldSetLite = (UnknownFieldSetLite) obj;
        int i = this.f34891a;
        if (i == unknownFieldSetLite.f34891a && m55462c(this.f34892b, unknownFieldSetLite.f34892b, i) && m55461d(this.f34893c, unknownFieldSetLite.f34893c, this.f34891a)) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public boolean m55458g(int i, CodedInputStream codedInputStream) {
        m55464a();
        int tagFieldNumber = WireFormat.getTagFieldNumber(i);
        int tagWireType = WireFormat.getTagWireType(i);
        if (tagWireType != 0) {
            if (tagWireType != 1) {
                if (tagWireType != 2) {
                    if (tagWireType != 3) {
                        if (tagWireType != 4) {
                            if (tagWireType == 5) {
                                m55451n(i, Integer.valueOf(codedInputStream.readFixed32()));
                                return true;
                            }
                            throw InvalidProtocolBufferException.invalidWireType();
                        }
                        return false;
                    }
                    UnknownFieldSetLite unknownFieldSetLite = new UnknownFieldSetLite();
                    unknownFieldSetLite.m55457h(codedInputStream);
                    codedInputStream.checkLastTagWas(WireFormat.m55338a(tagFieldNumber, 4));
                    m55451n(i, unknownFieldSetLite);
                    return true;
                }
                m55451n(i, codedInputStream.readBytes());
                return true;
            }
            m55451n(i, Long.valueOf(codedInputStream.readFixed64()));
            return true;
        }
        m55451n(i, Long.valueOf(codedInputStream.readInt64()));
        return true;
    }

    public int getSerializedSize() {
        int computeUInt64Size;
        int i = this.f34894d;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.f34891a; i3++) {
            int i4 = this.f34892b[i3];
            int tagFieldNumber = WireFormat.getTagFieldNumber(i4);
            int tagWireType = WireFormat.getTagWireType(i4);
            if (tagWireType != 0) {
                if (tagWireType != 1) {
                    if (tagWireType != 2) {
                        if (tagWireType != 3) {
                            if (tagWireType == 5) {
                                computeUInt64Size = CodedOutputStream.computeFixed32Size(tagFieldNumber, ((Integer) this.f34893c[i3]).intValue());
                            } else {
                                throw new IllegalStateException(InvalidProtocolBufferException.invalidWireType());
                            }
                        } else {
                            computeUInt64Size = (CodedOutputStream.computeTagSize(tagFieldNumber) * 2) + ((UnknownFieldSetLite) this.f34893c[i3]).getSerializedSize();
                        }
                    } else {
                        computeUInt64Size = CodedOutputStream.computeBytesSize(tagFieldNumber, (ByteString) this.f34893c[i3]);
                    }
                } else {
                    computeUInt64Size = CodedOutputStream.computeFixed64Size(tagFieldNumber, ((Long) this.f34893c[i3]).longValue());
                }
            } else {
                computeUInt64Size = CodedOutputStream.computeUInt64Size(tagFieldNumber, ((Long) this.f34893c[i3]).longValue());
            }
            i2 += computeUInt64Size;
        }
        this.f34894d = i2;
        return i2;
    }

    public int getSerializedSizeAsMessageSet() {
        int i = this.f34894d;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.f34891a; i3++) {
            i2 += CodedOutputStream.computeRawMessageSetExtensionSize(WireFormat.getTagFieldNumber(this.f34892b[i3]), (ByteString) this.f34893c[i3]);
        }
        this.f34894d = i2;
        return i2;
    }

    /* renamed from: h */
    public final UnknownFieldSetLite m55457h(CodedInputStream codedInputStream) {
        int readTag;
        do {
            readTag = codedInputStream.readTag();
            if (readTag == 0) {
                break;
            }
        } while (m55458g(readTag, codedInputStream));
        return this;
    }

    public int hashCode() {
        int i = this.f34891a;
        return ((((527 + i) * 31) + m55460e(this.f34892b, i)) * 31) + m55459f(this.f34893c, this.f34891a);
    }

    /* renamed from: i */
    public UnknownFieldSetLite m55456i(int i, ByteString byteString) {
        m55464a();
        if (i != 0) {
            m55451n(WireFormat.m55338a(i, 2), byteString);
            return this;
        }
        throw new IllegalArgumentException("Zero is not a valid field number.");
    }

    /* renamed from: j */
    public UnknownFieldSetLite m55455j(int i, int i2) {
        m55464a();
        if (i != 0) {
            m55451n(WireFormat.m55338a(i, 0), Long.valueOf(i2));
            return this;
        }
        throw new IllegalArgumentException("Zero is not a valid field number.");
    }

    /* renamed from: m */
    public final void m55452m(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < this.f34891a; i2++) {
            AbstractC4447p.m55141c(sb, i, String.valueOf(WireFormat.getTagFieldNumber(this.f34892b[i2])), this.f34893c[i2]);
        }
    }

    public void makeImmutable() {
        this.f34895e = false;
    }

    /* renamed from: n */
    public void m55451n(int i, Object obj) {
        m55464a();
        m55463b();
        int[] iArr = this.f34892b;
        int i2 = this.f34891a;
        iArr[i2] = i;
        this.f34893c[i2] = obj;
        this.f34891a = i2 + 1;
    }

    /* renamed from: o */
    public void m55450o(Writer writer) {
        if (writer.mo55254A() == Writer.FieldOrder.DESCENDING) {
            for (int i = this.f34891a - 1; i >= 0; i--) {
                writer.mo55232b(WireFormat.getTagFieldNumber(this.f34892b[i]), this.f34893c[i]);
            }
            return;
        }
        for (int i2 = 0; i2 < this.f34891a; i2++) {
            writer.mo55232b(WireFormat.getTagFieldNumber(this.f34892b[i2]), this.f34893c[i2]);
        }
    }

    public void writeAsMessageSetTo(CodedOutputStream codedOutputStream) throws IOException {
        for (int i = 0; i < this.f34891a; i++) {
            codedOutputStream.writeRawMessageSetExtension(WireFormat.getTagFieldNumber(this.f34892b[i]), (ByteString) this.f34893c[i]);
        }
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        for (int i = 0; i < this.f34891a; i++) {
            int i2 = this.f34892b[i];
            int tagFieldNumber = WireFormat.getTagFieldNumber(i2);
            int tagWireType = WireFormat.getTagWireType(i2);
            if (tagWireType == 0) {
                codedOutputStream.writeUInt64(tagFieldNumber, ((Long) this.f34893c[i]).longValue());
            } else if (tagWireType == 1) {
                codedOutputStream.writeFixed64(tagFieldNumber, ((Long) this.f34893c[i]).longValue());
            } else if (tagWireType == 2) {
                codedOutputStream.writeBytes(tagFieldNumber, (ByteString) this.f34893c[i]);
            } else if (tagWireType == 3) {
                codedOutputStream.writeTag(tagFieldNumber, 3);
                ((UnknownFieldSetLite) this.f34893c[i]).writeTo(codedOutputStream);
                codedOutputStream.writeTag(tagFieldNumber, 4);
            } else if (tagWireType == 5) {
                codedOutputStream.writeFixed32(tagFieldNumber, ((Integer) this.f34893c[i]).intValue());
            } else {
                throw InvalidProtocolBufferException.invalidWireType();
            }
        }
    }

    public UnknownFieldSetLite(int i, int[] iArr, Object[] objArr, boolean z) {
        this.f34894d = -1;
        this.f34891a = i;
        this.f34892b = iArr;
        this.f34893c = objArr;
        this.f34895e = z;
    }

    public void writeTo(Writer writer) throws IOException {
        if (this.f34891a == 0) {
            return;
        }
        if (writer.mo55254A() == Writer.FieldOrder.ASCENDING) {
            for (int i = 0; i < this.f34891a; i++) {
                m55449p(this.f34892b[i], this.f34893c[i], writer);
            }
            return;
        }
        for (int i2 = this.f34891a - 1; i2 >= 0; i2--) {
            m55449p(this.f34892b[i2], this.f34893c[i2], writer);
        }
    }
}
