package com.google.protobuf;

import com.google.protobuf.Writer;
import java.io.IOException;
import java.util.Arrays;

/* loaded from: classes4.dex */
public final class UnknownFieldSetLite {

    /* renamed from: f */
    public static final UnknownFieldSetLite f57443f = new UnknownFieldSetLite(0, new int[0], new Object[0], false);

    /* renamed from: a */
    public int f57444a;

    /* renamed from: b */
    public int[] f57445b;

    /* renamed from: c */
    public Object[] f57446c;

    /* renamed from: d */
    public int f57447d;

    /* renamed from: e */
    public boolean f57448e;

    public UnknownFieldSetLite() {
        this(0, new int[8], new Object[8], true);
    }

    /* renamed from: c */
    public static int m35537c(int[] iArr, int i) {
        int i2 = 17;
        for (int i3 = 0; i3 < i; i3++) {
            i2 = (i2 * 31) + iArr[i3];
        }
        return i2;
    }

    /* renamed from: d */
    public static int m35536d(Object[] objArr, int i) {
        int i2 = 17;
        for (int i3 = 0; i3 < i; i3++) {
            i2 = (i2 * 31) + objArr[i3].hashCode();
        }
        return i2;
    }

    public static UnknownFieldSetLite getDefaultInstance() {
        return f57443f;
    }

    /* renamed from: j */
    public static UnknownFieldSetLite m35530j(UnknownFieldSetLite unknownFieldSetLite, UnknownFieldSetLite unknownFieldSetLite2) {
        int i = unknownFieldSetLite.f57444a + unknownFieldSetLite2.f57444a;
        int[] copyOf = Arrays.copyOf(unknownFieldSetLite.f57445b, i);
        System.arraycopy(unknownFieldSetLite2.f57445b, 0, copyOf, unknownFieldSetLite.f57444a, unknownFieldSetLite2.f57444a);
        Object[] copyOf2 = Arrays.copyOf(unknownFieldSetLite.f57446c, i);
        System.arraycopy(unknownFieldSetLite2.f57446c, 0, copyOf2, unknownFieldSetLite.f57444a, unknownFieldSetLite2.f57444a);
        return new UnknownFieldSetLite(i, copyOf, copyOf2, true);
    }

    /* renamed from: k */
    public static UnknownFieldSetLite m35529k() {
        return new UnknownFieldSetLite();
    }

    /* renamed from: l */
    public static boolean m35528l(Object[] objArr, Object[] objArr2, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            if (!objArr[i2].equals(objArr2[i2])) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: o */
    public static boolean m35525o(int[] iArr, int[] iArr2, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            if (iArr[i2] != iArr2[i2]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: q */
    public static void m35523q(int i, Object obj, Writer writer) {
        int tagFieldNumber = WireFormat.getTagFieldNumber(i);
        int tagWireType = WireFormat.getTagWireType(i);
        if (tagWireType != 0) {
            if (tagWireType != 1) {
                if (tagWireType != 2) {
                    if (tagWireType != 3) {
                        if (tagWireType == 5) {
                            writer.mo35329c(tagFieldNumber, ((Integer) obj).intValue());
                            return;
                        }
                        throw new RuntimeException(InvalidProtocolBufferException.invalidWireType());
                    } else if (writer.mo35352A() == Writer.FieldOrder.ASCENDING) {
                        writer.mo35317o(tagFieldNumber);
                        ((UnknownFieldSetLite) obj).writeTo(writer);
                        writer.mo35315q(tagFieldNumber);
                        return;
                    } else {
                        writer.mo35315q(tagFieldNumber);
                        ((UnknownFieldSetLite) obj).writeTo(writer);
                        writer.mo35317o(tagFieldNumber);
                        return;
                    }
                }
                writer.mo35344I(tagFieldNumber, (ByteString) obj);
                return;
            }
            writer.mo35320l(tagFieldNumber, ((Long) obj).longValue());
            return;
        }
        writer.mo35351B(tagFieldNumber, ((Long) obj).longValue());
    }

    /* renamed from: a */
    public void m35539a() {
        if (this.f57448e) {
            return;
        }
        throw new UnsupportedOperationException();
    }

    /* renamed from: b */
    public final void m35538b(int i) {
        int[] iArr = this.f57445b;
        if (i > iArr.length) {
            int i2 = this.f57444a;
            int i3 = i2 + (i2 / 2);
            if (i3 >= i) {
                i = i3;
            }
            if (i < 8) {
                i = 8;
            }
            this.f57445b = Arrays.copyOf(iArr, i);
            this.f57446c = Arrays.copyOf(this.f57446c, i);
        }
    }

    /* renamed from: e */
    public boolean m35535e(int i, CodedInputStream codedInputStream) {
        m35539a();
        int tagFieldNumber = WireFormat.getTagFieldNumber(i);
        int tagWireType = WireFormat.getTagWireType(i);
        if (tagWireType != 0) {
            if (tagWireType != 1) {
                if (tagWireType != 2) {
                    if (tagWireType != 3) {
                        if (tagWireType != 4) {
                            if (tagWireType == 5) {
                                m35526n(i, Integer.valueOf(codedInputStream.readFixed32()));
                                return true;
                            }
                            throw InvalidProtocolBufferException.invalidWireType();
                        }
                        return false;
                    }
                    UnknownFieldSetLite unknownFieldSetLite = new UnknownFieldSetLite();
                    unknownFieldSetLite.m35534f(codedInputStream);
                    codedInputStream.checkLastTagWas(WireFormat.m35416a(tagFieldNumber, 4));
                    m35526n(i, unknownFieldSetLite);
                    return true;
                }
                m35526n(i, codedInputStream.readBytes());
                return true;
            }
            m35526n(i, Long.valueOf(codedInputStream.readFixed64()));
            return true;
        }
        m35526n(i, Long.valueOf(codedInputStream.readInt64()));
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
        int i = this.f57444a;
        if (i == unknownFieldSetLite.f57444a && m35525o(this.f57445b, unknownFieldSetLite.f57445b, i) && m35528l(this.f57446c, unknownFieldSetLite.f57446c, this.f57444a)) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public final UnknownFieldSetLite m35534f(CodedInputStream codedInputStream) {
        int readTag;
        do {
            readTag = codedInputStream.readTag();
            if (readTag == 0) {
                break;
            }
        } while (m35535e(readTag, codedInputStream));
        return this;
    }

    /* renamed from: g */
    public UnknownFieldSetLite m35533g(UnknownFieldSetLite unknownFieldSetLite) {
        if (unknownFieldSetLite.equals(getDefaultInstance())) {
            return this;
        }
        m35539a();
        int i = this.f57444a + unknownFieldSetLite.f57444a;
        m35538b(i);
        System.arraycopy(unknownFieldSetLite.f57445b, 0, this.f57445b, this.f57444a, unknownFieldSetLite.f57444a);
        System.arraycopy(unknownFieldSetLite.f57446c, 0, this.f57446c, this.f57444a, unknownFieldSetLite.f57444a);
        this.f57444a = i;
        return this;
    }

    public int getSerializedSize() {
        int computeUInt64Size;
        int i = this.f57447d;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.f57444a; i3++) {
            int i4 = this.f57445b[i3];
            int tagFieldNumber = WireFormat.getTagFieldNumber(i4);
            int tagWireType = WireFormat.getTagWireType(i4);
            if (tagWireType != 0) {
                if (tagWireType != 1) {
                    if (tagWireType != 2) {
                        if (tagWireType != 3) {
                            if (tagWireType == 5) {
                                computeUInt64Size = CodedOutputStream.computeFixed32Size(tagFieldNumber, ((Integer) this.f57446c[i3]).intValue());
                            } else {
                                throw new IllegalStateException(InvalidProtocolBufferException.invalidWireType());
                            }
                        } else {
                            computeUInt64Size = (CodedOutputStream.computeTagSize(tagFieldNumber) * 2) + ((UnknownFieldSetLite) this.f57446c[i3]).getSerializedSize();
                        }
                    } else {
                        computeUInt64Size = CodedOutputStream.computeBytesSize(tagFieldNumber, (ByteString) this.f57446c[i3]);
                    }
                } else {
                    computeUInt64Size = CodedOutputStream.computeFixed64Size(tagFieldNumber, ((Long) this.f57446c[i3]).longValue());
                }
            } else {
                computeUInt64Size = CodedOutputStream.computeUInt64Size(tagFieldNumber, ((Long) this.f57446c[i3]).longValue());
            }
            i2 += computeUInt64Size;
        }
        this.f57447d = i2;
        return i2;
    }

    public int getSerializedSizeAsMessageSet() {
        int i = this.f57447d;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.f57444a; i3++) {
            i2 += CodedOutputStream.computeRawMessageSetExtensionSize(WireFormat.getTagFieldNumber(this.f57445b[i3]), (ByteString) this.f57446c[i3]);
        }
        this.f57447d = i2;
        return i2;
    }

    /* renamed from: h */
    public UnknownFieldSetLite m35532h(int i, ByteString byteString) {
        m35539a();
        if (i != 0) {
            m35526n(WireFormat.m35416a(i, 2), byteString);
            return this;
        }
        throw new IllegalArgumentException("Zero is not a valid field number.");
    }

    public int hashCode() {
        int i = this.f57444a;
        return ((((527 + i) * 31) + m35537c(this.f57445b, i)) * 31) + m35536d(this.f57446c, this.f57444a);
    }

    /* renamed from: i */
    public UnknownFieldSetLite m35531i(int i, int i2) {
        m35539a();
        if (i != 0) {
            m35526n(WireFormat.m35416a(i, 0), Long.valueOf(i2));
            return this;
        }
        throw new IllegalArgumentException("Zero is not a valid field number.");
    }

    /* renamed from: m */
    public final void m35527m(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < this.f57444a; i2++) {
            AbstractC8944o.m35238d(sb, i, String.valueOf(WireFormat.getTagFieldNumber(this.f57445b[i2])), this.f57446c[i2]);
        }
    }

    public void makeImmutable() {
        this.f57448e = false;
    }

    /* renamed from: n */
    public void m35526n(int i, Object obj) {
        m35539a();
        m35538b(this.f57444a + 1);
        int[] iArr = this.f57445b;
        int i2 = this.f57444a;
        iArr[i2] = i;
        this.f57446c[i2] = obj;
        this.f57444a = i2 + 1;
    }

    /* renamed from: p */
    public void m35524p(Writer writer) {
        if (writer.mo35352A() == Writer.FieldOrder.DESCENDING) {
            for (int i = this.f57444a - 1; i >= 0; i--) {
                writer.mo35330b(WireFormat.getTagFieldNumber(this.f57445b[i]), this.f57446c[i]);
            }
            return;
        }
        for (int i2 = 0; i2 < this.f57444a; i2++) {
            writer.mo35330b(WireFormat.getTagFieldNumber(this.f57445b[i2]), this.f57446c[i2]);
        }
    }

    public void writeAsMessageSetTo(CodedOutputStream codedOutputStream) throws IOException {
        for (int i = 0; i < this.f57444a; i++) {
            codedOutputStream.writeRawMessageSetExtension(WireFormat.getTagFieldNumber(this.f57445b[i]), (ByteString) this.f57446c[i]);
        }
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        for (int i = 0; i < this.f57444a; i++) {
            int i2 = this.f57445b[i];
            int tagFieldNumber = WireFormat.getTagFieldNumber(i2);
            int tagWireType = WireFormat.getTagWireType(i2);
            if (tagWireType == 0) {
                codedOutputStream.writeUInt64(tagFieldNumber, ((Long) this.f57446c[i]).longValue());
            } else if (tagWireType == 1) {
                codedOutputStream.writeFixed64(tagFieldNumber, ((Long) this.f57446c[i]).longValue());
            } else if (tagWireType == 2) {
                codedOutputStream.writeBytes(tagFieldNumber, (ByteString) this.f57446c[i]);
            } else if (tagWireType == 3) {
                codedOutputStream.writeTag(tagFieldNumber, 3);
                ((UnknownFieldSetLite) this.f57446c[i]).writeTo(codedOutputStream);
                codedOutputStream.writeTag(tagFieldNumber, 4);
            } else if (tagWireType == 5) {
                codedOutputStream.writeFixed32(tagFieldNumber, ((Integer) this.f57446c[i]).intValue());
            } else {
                throw InvalidProtocolBufferException.invalidWireType();
            }
        }
    }

    public UnknownFieldSetLite(int i, int[] iArr, Object[] objArr, boolean z) {
        this.f57447d = -1;
        this.f57444a = i;
        this.f57445b = iArr;
        this.f57446c = objArr;
        this.f57448e = z;
    }

    public void writeTo(Writer writer) throws IOException {
        if (this.f57444a == 0) {
            return;
        }
        if (writer.mo35352A() == Writer.FieldOrder.ASCENDING) {
            for (int i = 0; i < this.f57444a; i++) {
                m35523q(this.f57445b[i], this.f57446c[i], writer);
            }
            return;
        }
        for (int i2 = this.f57444a - 1; i2 >= 0; i2--) {
            m35523q(this.f57445b[i2], this.f57446c[i2], writer);
        }
    }
}