package com.google.protobuf;

import com.google.protobuf.Writer;
import java.io.IOException;
import java.util.Arrays;

/* loaded from: classes4.dex */
public final class UnknownFieldSetLite {

    /* renamed from: f */
    public static final UnknownFieldSetLite f57431f = new UnknownFieldSetLite(0, new int[0], new Object[0], false);

    /* renamed from: a */
    public int f57432a;

    /* renamed from: b */
    public int[] f57433b;

    /* renamed from: c */
    public Object[] f57434c;

    /* renamed from: d */
    public int f57435d;

    /* renamed from: e */
    public boolean f57436e;

    public UnknownFieldSetLite() {
        this(0, new int[8], new Object[8], true);
    }

    /* renamed from: c */
    public static int m35545c(int[] iArr, int i) {
        int i2 = 17;
        for (int i3 = 0; i3 < i; i3++) {
            i2 = (i2 * 31) + iArr[i3];
        }
        return i2;
    }

    /* renamed from: d */
    public static int m35544d(Object[] objArr, int i) {
        int i2 = 17;
        for (int i3 = 0; i3 < i; i3++) {
            i2 = (i2 * 31) + objArr[i3].hashCode();
        }
        return i2;
    }

    public static UnknownFieldSetLite getDefaultInstance() {
        return f57431f;
    }

    /* renamed from: j */
    public static UnknownFieldSetLite m35538j(UnknownFieldSetLite unknownFieldSetLite, UnknownFieldSetLite unknownFieldSetLite2) {
        int i = unknownFieldSetLite.f57432a + unknownFieldSetLite2.f57432a;
        int[] copyOf = Arrays.copyOf(unknownFieldSetLite.f57433b, i);
        System.arraycopy(unknownFieldSetLite2.f57433b, 0, copyOf, unknownFieldSetLite.f57432a, unknownFieldSetLite2.f57432a);
        Object[] copyOf2 = Arrays.copyOf(unknownFieldSetLite.f57434c, i);
        System.arraycopy(unknownFieldSetLite2.f57434c, 0, copyOf2, unknownFieldSetLite.f57432a, unknownFieldSetLite2.f57432a);
        return new UnknownFieldSetLite(i, copyOf, copyOf2, true);
    }

    /* renamed from: k */
    public static UnknownFieldSetLite m35537k() {
        return new UnknownFieldSetLite();
    }

    /* renamed from: l */
    public static boolean m35536l(Object[] objArr, Object[] objArr2, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            if (!objArr[i2].equals(objArr2[i2])) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: o */
    public static boolean m35533o(int[] iArr, int[] iArr2, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            if (iArr[i2] != iArr2[i2]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: q */
    public static void m35531q(int i, Object obj, Writer writer) {
        int tagFieldNumber = WireFormat.getTagFieldNumber(i);
        int tagWireType = WireFormat.getTagWireType(i);
        if (tagWireType != 0) {
            if (tagWireType != 1) {
                if (tagWireType != 2) {
                    if (tagWireType != 3) {
                        if (tagWireType == 5) {
                            writer.mo35337c(tagFieldNumber, ((Integer) obj).intValue());
                            return;
                        }
                        throw new RuntimeException(InvalidProtocolBufferException.invalidWireType());
                    } else if (writer.mo35360A() == Writer.FieldOrder.ASCENDING) {
                        writer.mo35325o(tagFieldNumber);
                        ((UnknownFieldSetLite) obj).writeTo(writer);
                        writer.mo35323q(tagFieldNumber);
                        return;
                    } else {
                        writer.mo35323q(tagFieldNumber);
                        ((UnknownFieldSetLite) obj).writeTo(writer);
                        writer.mo35325o(tagFieldNumber);
                        return;
                    }
                }
                writer.mo35352I(tagFieldNumber, (ByteString) obj);
                return;
            }
            writer.mo35328l(tagFieldNumber, ((Long) obj).longValue());
            return;
        }
        writer.mo35359B(tagFieldNumber, ((Long) obj).longValue());
    }

    /* renamed from: a */
    public void m35547a() {
        if (this.f57436e) {
            return;
        }
        throw new UnsupportedOperationException();
    }

    /* renamed from: b */
    public final void m35546b(int i) {
        int[] iArr = this.f57433b;
        if (i > iArr.length) {
            int i2 = this.f57432a;
            int i3 = i2 + (i2 / 2);
            if (i3 >= i) {
                i = i3;
            }
            if (i < 8) {
                i = 8;
            }
            this.f57433b = Arrays.copyOf(iArr, i);
            this.f57434c = Arrays.copyOf(this.f57434c, i);
        }
    }

    /* renamed from: e */
    public boolean m35543e(int i, CodedInputStream codedInputStream) {
        m35547a();
        int tagFieldNumber = WireFormat.getTagFieldNumber(i);
        int tagWireType = WireFormat.getTagWireType(i);
        if (tagWireType != 0) {
            if (tagWireType != 1) {
                if (tagWireType != 2) {
                    if (tagWireType != 3) {
                        if (tagWireType != 4) {
                            if (tagWireType == 5) {
                                m35534n(i, Integer.valueOf(codedInputStream.readFixed32()));
                                return true;
                            }
                            throw InvalidProtocolBufferException.invalidWireType();
                        }
                        return false;
                    }
                    UnknownFieldSetLite unknownFieldSetLite = new UnknownFieldSetLite();
                    unknownFieldSetLite.m35542f(codedInputStream);
                    codedInputStream.checkLastTagWas(WireFormat.m35424a(tagFieldNumber, 4));
                    m35534n(i, unknownFieldSetLite);
                    return true;
                }
                m35534n(i, codedInputStream.readBytes());
                return true;
            }
            m35534n(i, Long.valueOf(codedInputStream.readFixed64()));
            return true;
        }
        m35534n(i, Long.valueOf(codedInputStream.readInt64()));
        return true;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof UnknownFieldSetLite)) {
            return false;
        }
        UnknownFieldSetLite unknownFieldSetLite = (UnknownFieldSetLite) obj;
        int i = this.f57432a;
        if (i == unknownFieldSetLite.f57432a && m35533o(this.f57433b, unknownFieldSetLite.f57433b, i) && m35536l(this.f57434c, unknownFieldSetLite.f57434c, this.f57432a)) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public final UnknownFieldSetLite m35542f(CodedInputStream codedInputStream) {
        int readTag;
        do {
            readTag = codedInputStream.readTag();
            if (readTag == 0) {
                break;
            }
        } while (m35543e(readTag, codedInputStream));
        return this;
    }

    /* renamed from: g */
    public UnknownFieldSetLite m35541g(UnknownFieldSetLite unknownFieldSetLite) {
        if (unknownFieldSetLite.equals(getDefaultInstance())) {
            return this;
        }
        m35547a();
        int i = this.f57432a + unknownFieldSetLite.f57432a;
        m35546b(i);
        System.arraycopy(unknownFieldSetLite.f57433b, 0, this.f57433b, this.f57432a, unknownFieldSetLite.f57432a);
        System.arraycopy(unknownFieldSetLite.f57434c, 0, this.f57434c, this.f57432a, unknownFieldSetLite.f57432a);
        this.f57432a = i;
        return this;
    }

    public int getSerializedSize() {
        int computeUInt64Size;
        int i = this.f57435d;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.f57432a; i3++) {
            int i4 = this.f57433b[i3];
            int tagFieldNumber = WireFormat.getTagFieldNumber(i4);
            int tagWireType = WireFormat.getTagWireType(i4);
            if (tagWireType != 0) {
                if (tagWireType != 1) {
                    if (tagWireType != 2) {
                        if (tagWireType != 3) {
                            if (tagWireType == 5) {
                                computeUInt64Size = CodedOutputStream.computeFixed32Size(tagFieldNumber, ((Integer) this.f57434c[i3]).intValue());
                            } else {
                                throw new IllegalStateException(InvalidProtocolBufferException.invalidWireType());
                            }
                        } else {
                            computeUInt64Size = (CodedOutputStream.computeTagSize(tagFieldNumber) * 2) + ((UnknownFieldSetLite) this.f57434c[i3]).getSerializedSize();
                        }
                    } else {
                        computeUInt64Size = CodedOutputStream.computeBytesSize(tagFieldNumber, (ByteString) this.f57434c[i3]);
                    }
                } else {
                    computeUInt64Size = CodedOutputStream.computeFixed64Size(tagFieldNumber, ((Long) this.f57434c[i3]).longValue());
                }
            } else {
                computeUInt64Size = CodedOutputStream.computeUInt64Size(tagFieldNumber, ((Long) this.f57434c[i3]).longValue());
            }
            i2 += computeUInt64Size;
        }
        this.f57435d = i2;
        return i2;
    }

    public int getSerializedSizeAsMessageSet() {
        int i = this.f57435d;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.f57432a; i3++) {
            i2 += CodedOutputStream.computeRawMessageSetExtensionSize(WireFormat.getTagFieldNumber(this.f57433b[i3]), (ByteString) this.f57434c[i3]);
        }
        this.f57435d = i2;
        return i2;
    }

    /* renamed from: h */
    public UnknownFieldSetLite m35540h(int i, ByteString byteString) {
        m35547a();
        if (i != 0) {
            m35534n(WireFormat.m35424a(i, 2), byteString);
            return this;
        }
        throw new IllegalArgumentException("Zero is not a valid field number.");
    }

    public int hashCode() {
        int i = this.f57432a;
        return ((((527 + i) * 31) + m35545c(this.f57433b, i)) * 31) + m35544d(this.f57434c, this.f57432a);
    }

    /* renamed from: i */
    public UnknownFieldSetLite m35539i(int i, int i2) {
        m35547a();
        if (i != 0) {
            m35534n(WireFormat.m35424a(i, 0), Long.valueOf(i2));
            return this;
        }
        throw new IllegalArgumentException("Zero is not a valid field number.");
    }

    /* renamed from: m */
    public final void m35535m(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < this.f57432a; i2++) {
            AbstractC8955o.m35246d(sb, i, String.valueOf(WireFormat.getTagFieldNumber(this.f57433b[i2])), this.f57434c[i2]);
        }
    }

    public void makeImmutable() {
        this.f57436e = false;
    }

    /* renamed from: n */
    public void m35534n(int i, Object obj) {
        m35547a();
        m35546b(this.f57432a + 1);
        int[] iArr = this.f57433b;
        int i2 = this.f57432a;
        iArr[i2] = i;
        this.f57434c[i2] = obj;
        this.f57432a = i2 + 1;
    }

    /* renamed from: p */
    public void m35532p(Writer writer) {
        if (writer.mo35360A() == Writer.FieldOrder.DESCENDING) {
            for (int i = this.f57432a - 1; i >= 0; i--) {
                writer.mo35338b(WireFormat.getTagFieldNumber(this.f57433b[i]), this.f57434c[i]);
            }
            return;
        }
        for (int i2 = 0; i2 < this.f57432a; i2++) {
            writer.mo35338b(WireFormat.getTagFieldNumber(this.f57433b[i2]), this.f57434c[i2]);
        }
    }

    public void writeAsMessageSetTo(CodedOutputStream codedOutputStream) throws IOException {
        for (int i = 0; i < this.f57432a; i++) {
            codedOutputStream.writeRawMessageSetExtension(WireFormat.getTagFieldNumber(this.f57433b[i]), (ByteString) this.f57434c[i]);
        }
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        for (int i = 0; i < this.f57432a; i++) {
            int i2 = this.f57433b[i];
            int tagFieldNumber = WireFormat.getTagFieldNumber(i2);
            int tagWireType = WireFormat.getTagWireType(i2);
            if (tagWireType == 0) {
                codedOutputStream.writeUInt64(tagFieldNumber, ((Long) this.f57434c[i]).longValue());
            } else if (tagWireType == 1) {
                codedOutputStream.writeFixed64(tagFieldNumber, ((Long) this.f57434c[i]).longValue());
            } else if (tagWireType == 2) {
                codedOutputStream.writeBytes(tagFieldNumber, (ByteString) this.f57434c[i]);
            } else if (tagWireType == 3) {
                codedOutputStream.writeTag(tagFieldNumber, 3);
                ((UnknownFieldSetLite) this.f57434c[i]).writeTo(codedOutputStream);
                codedOutputStream.writeTag(tagFieldNumber, 4);
            } else if (tagWireType == 5) {
                codedOutputStream.writeFixed32(tagFieldNumber, ((Integer) this.f57434c[i]).intValue());
            } else {
                throw InvalidProtocolBufferException.invalidWireType();
            }
        }
    }

    public UnknownFieldSetLite(int i, int[] iArr, Object[] objArr, boolean z) {
        this.f57435d = -1;
        this.f57432a = i;
        this.f57433b = iArr;
        this.f57434c = objArr;
        this.f57436e = z;
    }

    public void writeTo(Writer writer) throws IOException {
        if (this.f57432a == 0) {
            return;
        }
        if (writer.mo35360A() == Writer.FieldOrder.ASCENDING) {
            for (int i = 0; i < this.f57432a; i++) {
                m35531q(this.f57433b[i], this.f57434c[i], writer);
            }
            return;
        }
        for (int i2 = this.f57432a - 1; i2 >= 0; i2--) {
            m35531q(this.f57433b[i2], this.f57434c[i2], writer);
        }
    }
}
