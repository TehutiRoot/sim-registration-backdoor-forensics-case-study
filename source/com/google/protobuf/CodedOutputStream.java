package com.google.protobuf;

import com.google.protobuf.Utf8;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes4.dex */
public abstract class CodedOutputStream extends ByteOutput {
    public static final int DEFAULT_BUFFER_SIZE = 4096;
    @Deprecated
    public static final int LITTLE_ENDIAN_32_SIZE = 4;

    /* renamed from: c */
    public static final Logger f57256c = Logger.getLogger(CodedOutputStream.class.getName());

    /* renamed from: d */
    public static final boolean f57257d = AbstractC22806wY1.m818J();

    /* renamed from: a */
    public C8940e f57258a;

    /* renamed from: b */
    public boolean f57259b;

    /* loaded from: classes4.dex */
    public static class OutOfSpaceException extends IOException {
        private static final String MESSAGE = "CodedOutputStream was writing to a flat byte array and ran out of space.";
        private static final long serialVersionUID = -6947486886997889499L;

        public OutOfSpaceException() {
            super(MESSAGE);
        }

        public OutOfSpaceException(String str) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.: " + str);
        }

        public OutOfSpaceException(Throwable th2) {
            super(MESSAGE, th2);
        }

        public OutOfSpaceException(String str, Throwable th2) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.: " + str, th2);
        }
    }

    /* renamed from: com.google.protobuf.CodedOutputStream$b */
    /* loaded from: classes4.dex */
    public static abstract class AbstractC8846b extends CodedOutputStream {

        /* renamed from: e */
        public final byte[] f57260e;

        /* renamed from: f */
        public final int f57261f;

        /* renamed from: g */
        public int f57262g;

        /* renamed from: h */
        public int f57263h;

        public AbstractC8846b(int i) {
            super();
            if (i >= 0) {
                byte[] bArr = new byte[Math.max(i, 20)];
                this.f57260e = bArr;
                this.f57261f = bArr.length;
                return;
            }
            throw new IllegalArgumentException("bufferSize must be >= 0");
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final int getTotalBytesWritten() {
            return this.f57263h;
        }

        /* renamed from: p */
        public final void m36997p(byte b) {
            byte[] bArr = this.f57260e;
            int i = this.f57262g;
            this.f57262g = i + 1;
            bArr[i] = b;
            this.f57263h++;
        }

        /* renamed from: q */
        public final void m36996q(int i) {
            byte[] bArr = this.f57260e;
            int i2 = this.f57262g;
            int i3 = i2 + 1;
            this.f57262g = i3;
            bArr[i2] = (byte) (i & 255);
            int i4 = i2 + 2;
            this.f57262g = i4;
            bArr[i3] = (byte) ((i >> 8) & 255);
            int i5 = i2 + 3;
            this.f57262g = i5;
            bArr[i4] = (byte) ((i >> 16) & 255);
            this.f57262g = i2 + 4;
            bArr[i5] = (byte) ((i >> 24) & 255);
            this.f57263h += 4;
        }

        /* renamed from: r */
        public final void m36995r(long j) {
            byte[] bArr = this.f57260e;
            int i = this.f57262g;
            int i2 = i + 1;
            this.f57262g = i2;
            bArr[i] = (byte) (j & 255);
            int i3 = i + 2;
            this.f57262g = i3;
            bArr[i2] = (byte) ((j >> 8) & 255);
            int i4 = i + 3;
            this.f57262g = i4;
            bArr[i3] = (byte) ((j >> 16) & 255);
            int i5 = i + 4;
            this.f57262g = i5;
            bArr[i4] = (byte) (255 & (j >> 24));
            int i6 = i + 5;
            this.f57262g = i6;
            bArr[i5] = (byte) (((int) (j >> 32)) & 255);
            int i7 = i + 6;
            this.f57262g = i7;
            bArr[i6] = (byte) (((int) (j >> 40)) & 255);
            int i8 = i + 7;
            this.f57262g = i8;
            bArr[i7] = (byte) (((int) (j >> 48)) & 255);
            this.f57262g = i + 8;
            bArr[i8] = (byte) (((int) (j >> 56)) & 255);
            this.f57263h += 8;
        }

        /* renamed from: s */
        public final void m36994s(int i) {
            if (i >= 0) {
                m36992u(i);
            } else {
                m36991v(i);
            }
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final int spaceLeft() {
            throw new UnsupportedOperationException("spaceLeft() can only be called on CodedOutputStreams that are writing to a flat array or ByteBuffer.");
        }

        /* renamed from: t */
        public final void m36993t(int i, int i2) {
            m36992u(WireFormat.m35424a(i, i2));
        }

        /* renamed from: u */
        public final void m36992u(int i) {
            if (CodedOutputStream.f57257d) {
                long j = this.f57262g;
                while ((i & (-128)) != 0) {
                    byte[] bArr = this.f57260e;
                    int i2 = this.f57262g;
                    this.f57262g = i2 + 1;
                    AbstractC22806wY1.m810R(bArr, i2, (byte) ((i & 127) | 128));
                    i >>>= 7;
                }
                byte[] bArr2 = this.f57260e;
                int i3 = this.f57262g;
                this.f57262g = i3 + 1;
                AbstractC22806wY1.m810R(bArr2, i3, (byte) i);
                this.f57263h += (int) (this.f57262g - j);
                return;
            }
            while ((i & (-128)) != 0) {
                byte[] bArr3 = this.f57260e;
                int i4 = this.f57262g;
                this.f57262g = i4 + 1;
                bArr3[i4] = (byte) ((i & 127) | 128);
                this.f57263h++;
                i >>>= 7;
            }
            byte[] bArr4 = this.f57260e;
            int i5 = this.f57262g;
            this.f57262g = i5 + 1;
            bArr4[i5] = (byte) i;
            this.f57263h++;
        }

        /* renamed from: v */
        public final void m36991v(long j) {
            if (CodedOutputStream.f57257d) {
                long j2 = this.f57262g;
                while ((j & (-128)) != 0) {
                    byte[] bArr = this.f57260e;
                    int i = this.f57262g;
                    this.f57262g = i + 1;
                    AbstractC22806wY1.m810R(bArr, i, (byte) ((((int) j) & 127) | 128));
                    j >>>= 7;
                }
                byte[] bArr2 = this.f57260e;
                int i2 = this.f57262g;
                this.f57262g = i2 + 1;
                AbstractC22806wY1.m810R(bArr2, i2, (byte) j);
                this.f57263h += (int) (this.f57262g - j2);
                return;
            }
            while ((j & (-128)) != 0) {
                byte[] bArr3 = this.f57260e;
                int i3 = this.f57262g;
                this.f57262g = i3 + 1;
                bArr3[i3] = (byte) ((((int) j) & 127) | 128);
                this.f57263h++;
                j >>>= 7;
            }
            byte[] bArr4 = this.f57260e;
            int i4 = this.f57262g;
            this.f57262g = i4 + 1;
            bArr4[i4] = (byte) j;
            this.f57263h++;
        }
    }

    /* renamed from: com.google.protobuf.CodedOutputStream$c */
    /* loaded from: classes4.dex */
    public static class C8847c extends CodedOutputStream {

        /* renamed from: e */
        public final byte[] f57264e;

        /* renamed from: f */
        public final int f57265f;

        /* renamed from: g */
        public final int f57266g;

        /* renamed from: h */
        public int f57267h;

        public C8847c(byte[] bArr, int i, int i2) {
            super();
            if (bArr != null) {
                int i3 = i + i2;
                if ((i | i2 | (bArr.length - i3)) >= 0) {
                    this.f57264e = bArr;
                    this.f57265f = i;
                    this.f57267h = i;
                    this.f57266g = i3;
                    return;
                }
                throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i2)));
            }
            throw new NullPointerException("buffer");
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void flush() {
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final int getTotalBytesWritten() {
            return this.f57267h - this.f57265f;
        }

        @Override // com.google.protobuf.CodedOutputStream
        /* renamed from: l */
        public final void mo36985l(byte[] bArr, int i, int i2) {
            writeUInt32NoTag(i2);
            write(bArr, i, i2);
        }

        @Override // com.google.protobuf.CodedOutputStream
        /* renamed from: o */
        public final void mo36984o(int i, MessageLite messageLite, InterfaceC8961t interfaceC8961t) {
            writeTag(i, 2);
            writeUInt32NoTag(((AbstractMessageLite) messageLite).mo35837b(interfaceC8961t));
            interfaceC8961t.mo35115g(messageLite, this.f57258a);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final int spaceLeft() {
            return this.f57266g - this.f57267h;
        }

        @Override // com.google.protobuf.CodedOutputStream, com.google.protobuf.ByteOutput
        public final void write(byte b) {
            try {
                byte[] bArr = this.f57264e;
                int i = this.f57267h;
                this.f57267h = i + 1;
                bArr[i] = b;
            } catch (IndexOutOfBoundsException e) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f57267h), Integer.valueOf(this.f57266g), 1), e);
            }
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void writeBool(int i, boolean z) {
            writeTag(i, 0);
            write(z ? (byte) 1 : (byte) 0);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void writeByteArray(int i, byte[] bArr) {
            writeByteArray(i, bArr, 0, bArr.length);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void writeByteBuffer(int i, ByteBuffer byteBuffer) {
            writeTag(i, 2);
            writeUInt32NoTag(byteBuffer.capacity());
            writeRawBytes(byteBuffer);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void writeBytes(int i, ByteString byteString) {
            writeTag(i, 2);
            writeBytesNoTag(byteString);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void writeBytesNoTag(ByteString byteString) {
            writeUInt32NoTag(byteString.size());
            byteString.writeTo(this);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void writeFixed32(int i, int i2) {
            writeTag(i, 5);
            writeFixed32NoTag(i2);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void writeFixed32NoTag(int i) {
            try {
                byte[] bArr = this.f57264e;
                int i2 = this.f57267h;
                int i3 = i2 + 1;
                this.f57267h = i3;
                bArr[i2] = (byte) (i & 255);
                int i4 = i2 + 2;
                this.f57267h = i4;
                bArr[i3] = (byte) ((i >> 8) & 255);
                int i5 = i2 + 3;
                this.f57267h = i5;
                bArr[i4] = (byte) ((i >> 16) & 255);
                this.f57267h = i2 + 4;
                bArr[i5] = (byte) ((i >> 24) & 255);
            } catch (IndexOutOfBoundsException e) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f57267h), Integer.valueOf(this.f57266g), 1), e);
            }
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void writeFixed64(int i, long j) {
            writeTag(i, 1);
            writeFixed64NoTag(j);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void writeFixed64NoTag(long j) {
            try {
                byte[] bArr = this.f57264e;
                int i = this.f57267h;
                int i2 = i + 1;
                this.f57267h = i2;
                bArr[i] = (byte) (((int) j) & 255);
                int i3 = i + 2;
                this.f57267h = i3;
                bArr[i2] = (byte) (((int) (j >> 8)) & 255);
                int i4 = i + 3;
                this.f57267h = i4;
                bArr[i3] = (byte) (((int) (j >> 16)) & 255);
                int i5 = i + 4;
                this.f57267h = i5;
                bArr[i4] = (byte) (((int) (j >> 24)) & 255);
                int i6 = i + 5;
                this.f57267h = i6;
                bArr[i5] = (byte) (((int) (j >> 32)) & 255);
                int i7 = i + 6;
                this.f57267h = i7;
                bArr[i6] = (byte) (((int) (j >> 40)) & 255);
                int i8 = i + 7;
                this.f57267h = i8;
                bArr[i7] = (byte) (((int) (j >> 48)) & 255);
                this.f57267h = i + 8;
                bArr[i8] = (byte) (((int) (j >> 56)) & 255);
            } catch (IndexOutOfBoundsException e) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f57267h), Integer.valueOf(this.f57266g), 1), e);
            }
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void writeInt32(int i, int i2) {
            writeTag(i, 0);
            writeInt32NoTag(i2);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void writeInt32NoTag(int i) {
            if (i >= 0) {
                writeUInt32NoTag(i);
            } else {
                writeUInt64NoTag(i);
            }
        }

        @Override // com.google.protobuf.CodedOutputStream, com.google.protobuf.ByteOutput
        public final void writeLazy(byte[] bArr, int i, int i2) {
            write(bArr, i, i2);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void writeMessage(int i, MessageLite messageLite) {
            writeTag(i, 2);
            writeMessageNoTag(messageLite);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void writeMessageNoTag(MessageLite messageLite) {
            writeUInt32NoTag(messageLite.getSerializedSize());
            messageLite.writeTo(this);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void writeMessageSetExtension(int i, MessageLite messageLite) {
            writeTag(1, 3);
            writeUInt32(2, i);
            writeMessage(3, messageLite);
            writeTag(1, 4);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void writeRawBytes(ByteBuffer byteBuffer) {
            if (byteBuffer.hasArray()) {
                write(byteBuffer.array(), byteBuffer.arrayOffset(), byteBuffer.capacity());
                return;
            }
            ByteBuffer duplicate = byteBuffer.duplicate();
            ByteBuffer byteBuffer2 = (ByteBuffer) duplicate.clear();
            write(duplicate);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void writeRawMessageSetExtension(int i, ByteString byteString) {
            writeTag(1, 3);
            writeUInt32(2, i);
            writeBytes(3, byteString);
            writeTag(1, 4);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void writeString(int i, String str) {
            writeTag(i, 2);
            writeStringNoTag(str);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void writeStringNoTag(String str) {
            int i = this.f57267h;
            try {
                int computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(str.length() * 3);
                int computeUInt32SizeNoTag2 = CodedOutputStream.computeUInt32SizeNoTag(str.length());
                if (computeUInt32SizeNoTag2 == computeUInt32SizeNoTag) {
                    int i2 = i + computeUInt32SizeNoTag2;
                    this.f57267h = i2;
                    int m35516i = Utf8.m35516i(str, this.f57264e, i2, spaceLeft());
                    this.f57267h = i;
                    writeUInt32NoTag((m35516i - i) - computeUInt32SizeNoTag2);
                    this.f57267h = m35516i;
                } else {
                    writeUInt32NoTag(Utf8.m35514k(str));
                    this.f57267h = Utf8.m35516i(str, this.f57264e, this.f57267h, spaceLeft());
                }
            } catch (Utf8.UnpairedSurrogateException e) {
                this.f57267h = i;
                m37003h(str, e);
            } catch (IndexOutOfBoundsException e2) {
                throw new OutOfSpaceException(e2);
            }
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void writeTag(int i, int i2) {
            writeUInt32NoTag(WireFormat.m35424a(i, i2));
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void writeUInt32(int i, int i2) {
            writeTag(i, 0);
            writeUInt32NoTag(i2);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void writeUInt32NoTag(int i) {
            while ((i & (-128)) != 0) {
                try {
                    byte[] bArr = this.f57264e;
                    int i2 = this.f57267h;
                    this.f57267h = i2 + 1;
                    bArr[i2] = (byte) ((i & 127) | 128);
                    i >>>= 7;
                } catch (IndexOutOfBoundsException e) {
                    throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f57267h), Integer.valueOf(this.f57266g), 1), e);
                }
            }
            byte[] bArr2 = this.f57264e;
            int i3 = this.f57267h;
            this.f57267h = i3 + 1;
            bArr2[i3] = (byte) i;
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void writeUInt64(int i, long j) {
            writeTag(i, 0);
            writeUInt64NoTag(j);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void writeUInt64NoTag(long j) {
            if (CodedOutputStream.f57257d && spaceLeft() >= 10) {
                while ((j & (-128)) != 0) {
                    byte[] bArr = this.f57264e;
                    int i = this.f57267h;
                    this.f57267h = i + 1;
                    AbstractC22806wY1.m810R(bArr, i, (byte) ((((int) j) & 127) | 128));
                    j >>>= 7;
                }
                byte[] bArr2 = this.f57264e;
                int i2 = this.f57267h;
                this.f57267h = 1 + i2;
                AbstractC22806wY1.m810R(bArr2, i2, (byte) j);
                return;
            }
            while ((j & (-128)) != 0) {
                try {
                    byte[] bArr3 = this.f57264e;
                    int i3 = this.f57267h;
                    this.f57267h = i3 + 1;
                    bArr3[i3] = (byte) ((((int) j) & 127) | 128);
                    j >>>= 7;
                } catch (IndexOutOfBoundsException e) {
                    throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f57267h), Integer.valueOf(this.f57266g), 1), e);
                }
            }
            byte[] bArr4 = this.f57264e;
            int i4 = this.f57267h;
            this.f57267h = i4 + 1;
            bArr4[i4] = (byte) j;
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void writeByteArray(int i, byte[] bArr, int i2, int i3) {
            writeTag(i, 2);
            mo36985l(bArr, i2, i3);
        }

        @Override // com.google.protobuf.CodedOutputStream, com.google.protobuf.ByteOutput
        public final void writeLazy(ByteBuffer byteBuffer) {
            write(byteBuffer);
        }

        @Override // com.google.protobuf.CodedOutputStream, com.google.protobuf.ByteOutput
        public final void write(byte[] bArr, int i, int i2) {
            try {
                System.arraycopy(bArr, i, this.f57264e, this.f57267h, i2);
                this.f57267h += i2;
            } catch (IndexOutOfBoundsException e) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f57267h), Integer.valueOf(this.f57266g), Integer.valueOf(i2)), e);
            }
        }

        @Override // com.google.protobuf.CodedOutputStream, com.google.protobuf.ByteOutput
        public final void write(ByteBuffer byteBuffer) {
            int remaining = byteBuffer.remaining();
            try {
                byteBuffer.get(this.f57264e, this.f57267h, remaining);
                this.f57267h += remaining;
            } catch (IndexOutOfBoundsException e) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f57267h), Integer.valueOf(this.f57266g), Integer.valueOf(remaining)), e);
            }
        }
    }

    /* renamed from: com.google.protobuf.CodedOutputStream$d */
    /* loaded from: classes4.dex */
    public static final class C8848d extends C8847c {

        /* renamed from: i */
        public final ByteBuffer f57268i;

        /* renamed from: j */
        public int f57269j;

        public C8848d(ByteBuffer byteBuffer) {
            super(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining());
            this.f57268i = byteBuffer;
            this.f57269j = byteBuffer.position();
        }

        @Override // com.google.protobuf.CodedOutputStream.C8847c, com.google.protobuf.CodedOutputStream
        public void flush() {
            ByteBuffer byteBuffer = (ByteBuffer) this.f57268i.position(this.f57269j + getTotalBytesWritten());
        }
    }

    /* renamed from: com.google.protobuf.CodedOutputStream$e */
    /* loaded from: classes4.dex */
    public static final class C8849e extends AbstractC8846b {

        /* renamed from: i */
        public final OutputStream f57270i;

        public C8849e(OutputStream outputStream, int i) {
            super(i);
            if (outputStream != null) {
                this.f57270i = outputStream;
                return;
            }
            throw new NullPointerException("out");
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void flush() {
            if (this.f57262g > 0) {
                m36990w();
            }
        }

        @Override // com.google.protobuf.CodedOutputStream
        /* renamed from: l */
        public void mo36985l(byte[] bArr, int i, int i2) {
            writeUInt32NoTag(i2);
            write(bArr, i, i2);
        }

        @Override // com.google.protobuf.CodedOutputStream
        /* renamed from: o */
        public void mo36984o(int i, MessageLite messageLite, InterfaceC8961t interfaceC8961t) {
            writeTag(i, 2);
            m36988y(messageLite, interfaceC8961t);
        }

        /* renamed from: w */
        public final void m36990w() {
            this.f57270i.write(this.f57260e, 0, this.f57262g);
            this.f57262g = 0;
        }

        @Override // com.google.protobuf.CodedOutputStream, com.google.protobuf.ByteOutput
        public void write(byte b) {
            if (this.f57262g == this.f57261f) {
                m36990w();
            }
            m36997p(b);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeBool(int i, boolean z) {
            m36989x(11);
            m36993t(i, 0);
            m36997p(z ? (byte) 1 : (byte) 0);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeByteArray(int i, byte[] bArr) {
            writeByteArray(i, bArr, 0, bArr.length);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeByteBuffer(int i, ByteBuffer byteBuffer) {
            writeTag(i, 2);
            writeUInt32NoTag(byteBuffer.capacity());
            writeRawBytes(byteBuffer);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeBytes(int i, ByteString byteString) {
            writeTag(i, 2);
            writeBytesNoTag(byteString);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeBytesNoTag(ByteString byteString) {
            writeUInt32NoTag(byteString.size());
            byteString.writeTo(this);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeFixed32(int i, int i2) {
            m36989x(14);
            m36993t(i, 5);
            m36996q(i2);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeFixed32NoTag(int i) {
            m36989x(4);
            m36996q(i);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeFixed64(int i, long j) {
            m36989x(18);
            m36993t(i, 1);
            m36995r(j);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeFixed64NoTag(long j) {
            m36989x(8);
            m36995r(j);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeInt32(int i, int i2) {
            m36989x(20);
            m36993t(i, 0);
            m36994s(i2);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeInt32NoTag(int i) {
            if (i >= 0) {
                writeUInt32NoTag(i);
            } else {
                writeUInt64NoTag(i);
            }
        }

        @Override // com.google.protobuf.CodedOutputStream, com.google.protobuf.ByteOutput
        public void writeLazy(byte[] bArr, int i, int i2) {
            write(bArr, i, i2);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeMessage(int i, MessageLite messageLite) {
            writeTag(i, 2);
            writeMessageNoTag(messageLite);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeMessageNoTag(MessageLite messageLite) {
            writeUInt32NoTag(messageLite.getSerializedSize());
            messageLite.writeTo(this);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeMessageSetExtension(int i, MessageLite messageLite) {
            writeTag(1, 3);
            writeUInt32(2, i);
            writeMessage(3, messageLite);
            writeTag(1, 4);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeRawBytes(ByteBuffer byteBuffer) {
            if (byteBuffer.hasArray()) {
                write(byteBuffer.array(), byteBuffer.arrayOffset(), byteBuffer.capacity());
                return;
            }
            ByteBuffer duplicate = byteBuffer.duplicate();
            ByteBuffer byteBuffer2 = (ByteBuffer) duplicate.clear();
            write(duplicate);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeRawMessageSetExtension(int i, ByteString byteString) {
            writeTag(1, 3);
            writeUInt32(2, i);
            writeBytes(3, byteString);
            writeTag(1, 4);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeString(int i, String str) {
            writeTag(i, 2);
            writeStringNoTag(str);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeStringNoTag(String str) {
            int m35514k;
            try {
                int length = str.length() * 3;
                int computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(length);
                int i = computeUInt32SizeNoTag + length;
                int i2 = this.f57261f;
                if (i > i2) {
                    byte[] bArr = new byte[length];
                    int m35516i = Utf8.m35516i(str, bArr, 0, length);
                    writeUInt32NoTag(m35516i);
                    writeLazy(bArr, 0, m35516i);
                    return;
                }
                if (i > i2 - this.f57262g) {
                    m36990w();
                }
                int computeUInt32SizeNoTag2 = CodedOutputStream.computeUInt32SizeNoTag(str.length());
                int i3 = this.f57262g;
                try {
                    if (computeUInt32SizeNoTag2 == computeUInt32SizeNoTag) {
                        int i4 = i3 + computeUInt32SizeNoTag2;
                        this.f57262g = i4;
                        int m35516i2 = Utf8.m35516i(str, this.f57260e, i4, this.f57261f - i4);
                        this.f57262g = i3;
                        m35514k = (m35516i2 - i3) - computeUInt32SizeNoTag2;
                        m36992u(m35514k);
                        this.f57262g = m35516i2;
                    } else {
                        m35514k = Utf8.m35514k(str);
                        m36992u(m35514k);
                        this.f57262g = Utf8.m35516i(str, this.f57260e, this.f57262g, m35514k);
                    }
                    this.f57263h += m35514k;
                } catch (Utf8.UnpairedSurrogateException e) {
                    this.f57263h -= this.f57262g - i3;
                    this.f57262g = i3;
                    throw e;
                } catch (ArrayIndexOutOfBoundsException e2) {
                    throw new OutOfSpaceException(e2);
                }
            } catch (Utf8.UnpairedSurrogateException e3) {
                m37003h(str, e3);
            }
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeTag(int i, int i2) {
            writeUInt32NoTag(WireFormat.m35424a(i, i2));
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeUInt32(int i, int i2) {
            m36989x(20);
            m36993t(i, 0);
            m36992u(i2);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeUInt32NoTag(int i) {
            m36989x(5);
            m36992u(i);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeUInt64(int i, long j) {
            m36989x(20);
            m36993t(i, 0);
            m36991v(j);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeUInt64NoTag(long j) {
            m36989x(10);
            m36991v(j);
        }

        /* renamed from: x */
        public final void m36989x(int i) {
            if (this.f57261f - this.f57262g < i) {
                m36990w();
            }
        }

        /* renamed from: y */
        public void m36988y(MessageLite messageLite, InterfaceC8961t interfaceC8961t) {
            writeUInt32NoTag(((AbstractMessageLite) messageLite).mo35837b(interfaceC8961t));
            interfaceC8961t.mo35115g(messageLite, this.f57258a);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeByteArray(int i, byte[] bArr, int i2, int i3) {
            writeTag(i, 2);
            mo36985l(bArr, i2, i3);
        }

        @Override // com.google.protobuf.CodedOutputStream, com.google.protobuf.ByteOutput
        public void writeLazy(ByteBuffer byteBuffer) {
            write(byteBuffer);
        }

        @Override // com.google.protobuf.CodedOutputStream, com.google.protobuf.ByteOutput
        public void write(byte[] bArr, int i, int i2) {
            int i3 = this.f57261f;
            int i4 = this.f57262g;
            if (i3 - i4 >= i2) {
                System.arraycopy(bArr, i, this.f57260e, i4, i2);
                this.f57262g += i2;
                this.f57263h += i2;
                return;
            }
            int i5 = i3 - i4;
            System.arraycopy(bArr, i, this.f57260e, i4, i5);
            int i6 = i + i5;
            int i7 = i2 - i5;
            this.f57262g = this.f57261f;
            this.f57263h += i5;
            m36990w();
            if (i7 <= this.f57261f) {
                System.arraycopy(bArr, i6, this.f57260e, 0, i7);
                this.f57262g = i7;
            } else {
                this.f57270i.write(bArr, i6, i7);
            }
            this.f57263h += i7;
        }

        @Override // com.google.protobuf.CodedOutputStream, com.google.protobuf.ByteOutput
        public void write(ByteBuffer byteBuffer) {
            int remaining = byteBuffer.remaining();
            int i = this.f57261f;
            int i2 = this.f57262g;
            if (i - i2 >= remaining) {
                byteBuffer.get(this.f57260e, i2, remaining);
                this.f57262g += remaining;
                this.f57263h += remaining;
                return;
            }
            int i3 = i - i2;
            byteBuffer.get(this.f57260e, i2, i3);
            int i4 = remaining - i3;
            this.f57262g = this.f57261f;
            this.f57263h += i3;
            m36990w();
            while (true) {
                int i5 = this.f57261f;
                if (i4 > i5) {
                    byteBuffer.get(this.f57260e, 0, i5);
                    this.f57270i.write(this.f57260e, 0, this.f57261f);
                    int i6 = this.f57261f;
                    i4 -= i6;
                    this.f57263h += i6;
                } else {
                    byteBuffer.get(this.f57260e, 0, i4);
                    this.f57262g = i4;
                    this.f57263h += i4;
                    return;
                }
            }
        }
    }

    /* renamed from: com.google.protobuf.CodedOutputStream$f */
    /* loaded from: classes4.dex */
    public static final class C8850f extends CodedOutputStream {

        /* renamed from: e */
        public final ByteBuffer f57271e;

        /* renamed from: f */
        public final ByteBuffer f57272f;

        /* renamed from: g */
        public final int f57273g;

        public C8850f(ByteBuffer byteBuffer) {
            super();
            this.f57271e = byteBuffer;
            this.f57272f = byteBuffer.duplicate().order(ByteOrder.LITTLE_ENDIAN);
            this.f57273g = byteBuffer.position();
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void flush() {
            ByteBuffer byteBuffer = (ByteBuffer) this.f57271e.position(this.f57272f.position());
        }

        @Override // com.google.protobuf.CodedOutputStream
        public int getTotalBytesWritten() {
            return this.f57272f.position() - this.f57273g;
        }

        @Override // com.google.protobuf.CodedOutputStream
        /* renamed from: l */
        public void mo36985l(byte[] bArr, int i, int i2) {
            writeUInt32NoTag(i2);
            write(bArr, i, i2);
        }

        @Override // com.google.protobuf.CodedOutputStream
        /* renamed from: o */
        public void mo36984o(int i, MessageLite messageLite, InterfaceC8961t interfaceC8961t) {
            writeTag(i, 2);
            m36986q(messageLite, interfaceC8961t);
        }

        /* renamed from: p */
        public final void m36987p(String str) {
            try {
                Utf8.m35515j(str, this.f57272f);
            } catch (IndexOutOfBoundsException e) {
                throw new OutOfSpaceException(e);
            }
        }

        /* renamed from: q */
        public void m36986q(MessageLite messageLite, InterfaceC8961t interfaceC8961t) {
            writeUInt32NoTag(((AbstractMessageLite) messageLite).mo35837b(interfaceC8961t));
            interfaceC8961t.mo35115g(messageLite, this.f57258a);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public int spaceLeft() {
            return this.f57272f.remaining();
        }

        @Override // com.google.protobuf.CodedOutputStream, com.google.protobuf.ByteOutput
        public void write(byte b) {
            try {
                this.f57272f.put(b);
            } catch (BufferOverflowException e) {
                throw new OutOfSpaceException(e);
            }
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeBool(int i, boolean z) {
            writeTag(i, 0);
            write(z ? (byte) 1 : (byte) 0);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeByteArray(int i, byte[] bArr) {
            writeByteArray(i, bArr, 0, bArr.length);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeByteBuffer(int i, ByteBuffer byteBuffer) {
            writeTag(i, 2);
            writeUInt32NoTag(byteBuffer.capacity());
            writeRawBytes(byteBuffer);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeBytes(int i, ByteString byteString) {
            writeTag(i, 2);
            writeBytesNoTag(byteString);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeBytesNoTag(ByteString byteString) {
            writeUInt32NoTag(byteString.size());
            byteString.writeTo(this);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeFixed32(int i, int i2) {
            writeTag(i, 5);
            writeFixed32NoTag(i2);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeFixed32NoTag(int i) {
            try {
                this.f57272f.putInt(i);
            } catch (BufferOverflowException e) {
                throw new OutOfSpaceException(e);
            }
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeFixed64(int i, long j) {
            writeTag(i, 1);
            writeFixed64NoTag(j);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeFixed64NoTag(long j) {
            try {
                this.f57272f.putLong(j);
            } catch (BufferOverflowException e) {
                throw new OutOfSpaceException(e);
            }
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeInt32(int i, int i2) {
            writeTag(i, 0);
            writeInt32NoTag(i2);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeInt32NoTag(int i) {
            if (i >= 0) {
                writeUInt32NoTag(i);
            } else {
                writeUInt64NoTag(i);
            }
        }

        @Override // com.google.protobuf.CodedOutputStream, com.google.protobuf.ByteOutput
        public void writeLazy(byte[] bArr, int i, int i2) {
            write(bArr, i, i2);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeMessage(int i, MessageLite messageLite) {
            writeTag(i, 2);
            writeMessageNoTag(messageLite);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeMessageNoTag(MessageLite messageLite) {
            writeUInt32NoTag(messageLite.getSerializedSize());
            messageLite.writeTo(this);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeMessageSetExtension(int i, MessageLite messageLite) {
            writeTag(1, 3);
            writeUInt32(2, i);
            writeMessage(3, messageLite);
            writeTag(1, 4);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeRawBytes(ByteBuffer byteBuffer) {
            if (byteBuffer.hasArray()) {
                write(byteBuffer.array(), byteBuffer.arrayOffset(), byteBuffer.capacity());
                return;
            }
            ByteBuffer duplicate = byteBuffer.duplicate();
            ByteBuffer byteBuffer2 = (ByteBuffer) duplicate.clear();
            write(duplicate);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeRawMessageSetExtension(int i, ByteString byteString) {
            writeTag(1, 3);
            writeUInt32(2, i);
            writeBytes(3, byteString);
            writeTag(1, 4);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeString(int i, String str) {
            writeTag(i, 2);
            writeStringNoTag(str);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeStringNoTag(String str) {
            int position = this.f57272f.position();
            try {
                int computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(str.length() * 3);
                int computeUInt32SizeNoTag2 = CodedOutputStream.computeUInt32SizeNoTag(str.length());
                if (computeUInt32SizeNoTag2 == computeUInt32SizeNoTag) {
                    int position2 = this.f57272f.position() + computeUInt32SizeNoTag2;
                    ByteBuffer byteBuffer = (ByteBuffer) this.f57272f.position(position2);
                    m36987p(str);
                    int position3 = this.f57272f.position();
                    ByteBuffer byteBuffer2 = (ByteBuffer) this.f57272f.position(position);
                    writeUInt32NoTag(position3 - position2);
                    ByteBuffer byteBuffer3 = (ByteBuffer) this.f57272f.position(position3);
                } else {
                    writeUInt32NoTag(Utf8.m35514k(str));
                    m36987p(str);
                }
            } catch (Utf8.UnpairedSurrogateException e) {
                ByteBuffer byteBuffer4 = (ByteBuffer) this.f57272f.position(position);
                m37003h(str, e);
            } catch (IllegalArgumentException e2) {
                throw new OutOfSpaceException(e2);
            }
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeTag(int i, int i2) {
            writeUInt32NoTag(WireFormat.m35424a(i, i2));
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeUInt32(int i, int i2) {
            writeTag(i, 0);
            writeUInt32NoTag(i2);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeUInt32NoTag(int i) {
            while ((i & (-128)) != 0) {
                try {
                    this.f57272f.put((byte) ((i & 127) | 128));
                    i >>>= 7;
                } catch (BufferOverflowException e) {
                    throw new OutOfSpaceException(e);
                }
            }
            this.f57272f.put((byte) i);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeUInt64(int i, long j) {
            writeTag(i, 0);
            writeUInt64NoTag(j);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeUInt64NoTag(long j) {
            while (((-128) & j) != 0) {
                try {
                    this.f57272f.put((byte) ((((int) j) & 127) | 128));
                    j >>>= 7;
                } catch (BufferOverflowException e) {
                    throw new OutOfSpaceException(e);
                }
            }
            this.f57272f.put((byte) j);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeByteArray(int i, byte[] bArr, int i2, int i3) {
            writeTag(i, 2);
            mo36985l(bArr, i2, i3);
        }

        @Override // com.google.protobuf.CodedOutputStream, com.google.protobuf.ByteOutput
        public void writeLazy(ByteBuffer byteBuffer) {
            write(byteBuffer);
        }

        @Override // com.google.protobuf.CodedOutputStream, com.google.protobuf.ByteOutput
        public void write(byte[] bArr, int i, int i2) {
            try {
                this.f57272f.put(bArr, i, i2);
            } catch (IndexOutOfBoundsException e) {
                throw new OutOfSpaceException(e);
            } catch (BufferOverflowException e2) {
                throw new OutOfSpaceException(e2);
            }
        }

        @Override // com.google.protobuf.CodedOutputStream, com.google.protobuf.ByteOutput
        public void write(ByteBuffer byteBuffer) {
            try {
                this.f57272f.put(byteBuffer);
            } catch (BufferOverflowException e) {
                throw new OutOfSpaceException(e);
            }
        }
    }

    /* renamed from: com.google.protobuf.CodedOutputStream$g */
    /* loaded from: classes4.dex */
    public static final class C8851g extends CodedOutputStream {

        /* renamed from: e */
        public final ByteBuffer f57274e;

        /* renamed from: f */
        public final ByteBuffer f57275f;

        /* renamed from: g */
        public final long f57276g;

        /* renamed from: h */
        public final long f57277h;

        /* renamed from: i */
        public final long f57278i;

        /* renamed from: j */
        public final long f57279j;

        /* renamed from: k */
        public long f57280k;

        public C8851g(ByteBuffer byteBuffer) {
            super();
            this.f57274e = byteBuffer;
            this.f57275f = byteBuffer.duplicate().order(ByteOrder.LITTLE_ENDIAN);
            long m790k = AbstractC22806wY1.m790k(byteBuffer);
            this.f57276g = m790k;
            long position = byteBuffer.position() + m790k;
            this.f57277h = position;
            long limit = m790k + byteBuffer.limit();
            this.f57278i = limit;
            this.f57279j = limit - 10;
            this.f57280k = position;
        }

        /* renamed from: q */
        public static boolean m36982q() {
            return AbstractC22806wY1.m817K();
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void flush() {
            ByteBuffer byteBuffer = (ByteBuffer) this.f57274e.position(m36983p(this.f57280k));
        }

        @Override // com.google.protobuf.CodedOutputStream
        public int getTotalBytesWritten() {
            return (int) (this.f57280k - this.f57277h);
        }

        @Override // com.google.protobuf.CodedOutputStream
        /* renamed from: l */
        public void mo36985l(byte[] bArr, int i, int i2) {
            writeUInt32NoTag(i2);
            write(bArr, i, i2);
        }

        @Override // com.google.protobuf.CodedOutputStream
        /* renamed from: o */
        public void mo36984o(int i, MessageLite messageLite, InterfaceC8961t interfaceC8961t) {
            writeTag(i, 2);
            m36980s(messageLite, interfaceC8961t);
        }

        /* renamed from: p */
        public final int m36983p(long j) {
            return (int) (j - this.f57276g);
        }

        /* renamed from: r */
        public final void m36981r(long j) {
            ByteBuffer byteBuffer = (ByteBuffer) this.f57275f.position(m36983p(j));
        }

        /* renamed from: s */
        public void m36980s(MessageLite messageLite, InterfaceC8961t interfaceC8961t) {
            writeUInt32NoTag(((AbstractMessageLite) messageLite).mo35837b(interfaceC8961t));
            interfaceC8961t.mo35115g(messageLite, this.f57258a);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public int spaceLeft() {
            return (int) (this.f57278i - this.f57280k);
        }

        @Override // com.google.protobuf.CodedOutputStream, com.google.protobuf.ByteOutput
        public void write(byte b) {
            long j = this.f57280k;
            if (j < this.f57278i) {
                this.f57280k = 1 + j;
                AbstractC22806wY1.m811Q(j, b);
                return;
            }
            throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Long.valueOf(this.f57280k), Long.valueOf(this.f57278i), 1));
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeBool(int i, boolean z) {
            writeTag(i, 0);
            write(z ? (byte) 1 : (byte) 0);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeByteArray(int i, byte[] bArr) {
            writeByteArray(i, bArr, 0, bArr.length);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeByteBuffer(int i, ByteBuffer byteBuffer) {
            writeTag(i, 2);
            writeUInt32NoTag(byteBuffer.capacity());
            writeRawBytes(byteBuffer);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeBytes(int i, ByteString byteString) {
            writeTag(i, 2);
            writeBytesNoTag(byteString);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeBytesNoTag(ByteString byteString) {
            writeUInt32NoTag(byteString.size());
            byteString.writeTo(this);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeFixed32(int i, int i2) {
            writeTag(i, 5);
            writeFixed32NoTag(i2);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeFixed32NoTag(int i) {
            this.f57275f.putInt(m36983p(this.f57280k), i);
            this.f57280k += 4;
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeFixed64(int i, long j) {
            writeTag(i, 1);
            writeFixed64NoTag(j);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeFixed64NoTag(long j) {
            this.f57275f.putLong(m36983p(this.f57280k), j);
            this.f57280k += 8;
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeInt32(int i, int i2) {
            writeTag(i, 0);
            writeInt32NoTag(i2);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeInt32NoTag(int i) {
            if (i >= 0) {
                writeUInt32NoTag(i);
            } else {
                writeUInt64NoTag(i);
            }
        }

        @Override // com.google.protobuf.CodedOutputStream, com.google.protobuf.ByteOutput
        public void writeLazy(byte[] bArr, int i, int i2) {
            write(bArr, i, i2);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeMessage(int i, MessageLite messageLite) {
            writeTag(i, 2);
            writeMessageNoTag(messageLite);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeMessageNoTag(MessageLite messageLite) {
            writeUInt32NoTag(messageLite.getSerializedSize());
            messageLite.writeTo(this);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeMessageSetExtension(int i, MessageLite messageLite) {
            writeTag(1, 3);
            writeUInt32(2, i);
            writeMessage(3, messageLite);
            writeTag(1, 4);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeRawBytes(ByteBuffer byteBuffer) {
            if (byteBuffer.hasArray()) {
                write(byteBuffer.array(), byteBuffer.arrayOffset(), byteBuffer.capacity());
                return;
            }
            ByteBuffer duplicate = byteBuffer.duplicate();
            ByteBuffer byteBuffer2 = (ByteBuffer) duplicate.clear();
            write(duplicate);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeRawMessageSetExtension(int i, ByteString byteString) {
            writeTag(1, 3);
            writeUInt32(2, i);
            writeBytes(3, byteString);
            writeTag(1, 4);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeString(int i, String str) {
            writeTag(i, 2);
            writeStringNoTag(str);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeStringNoTag(String str) {
            long j = this.f57280k;
            try {
                int computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(str.length() * 3);
                int computeUInt32SizeNoTag2 = CodedOutputStream.computeUInt32SizeNoTag(str.length());
                if (computeUInt32SizeNoTag2 == computeUInt32SizeNoTag) {
                    int m36983p = m36983p(this.f57280k) + computeUInt32SizeNoTag2;
                    ByteBuffer byteBuffer = (ByteBuffer) this.f57275f.position(m36983p);
                    Utf8.m35515j(str, this.f57275f);
                    int position = this.f57275f.position() - m36983p;
                    writeUInt32NoTag(position);
                    this.f57280k += position;
                } else {
                    int m35514k = Utf8.m35514k(str);
                    writeUInt32NoTag(m35514k);
                    m36981r(this.f57280k);
                    Utf8.m35515j(str, this.f57275f);
                    this.f57280k += m35514k;
                }
            } catch (Utf8.UnpairedSurrogateException e) {
                this.f57280k = j;
                m36981r(j);
                m37003h(str, e);
            } catch (IllegalArgumentException e2) {
                throw new OutOfSpaceException(e2);
            } catch (IndexOutOfBoundsException e3) {
                throw new OutOfSpaceException(e3);
            }
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeTag(int i, int i2) {
            writeUInt32NoTag(WireFormat.m35424a(i, i2));
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeUInt32(int i, int i2) {
            writeTag(i, 0);
            writeUInt32NoTag(i2);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeUInt32NoTag(int i) {
            if (this.f57280k <= this.f57279j) {
                while ((i & (-128)) != 0) {
                    long j = this.f57280k;
                    this.f57280k = j + 1;
                    AbstractC22806wY1.m811Q(j, (byte) ((i & 127) | 128));
                    i >>>= 7;
                }
                long j2 = this.f57280k;
                this.f57280k = 1 + j2;
                AbstractC22806wY1.m811Q(j2, (byte) i);
                return;
            }
            while (true) {
                long j3 = this.f57280k;
                if (j3 < this.f57278i) {
                    if ((i & (-128)) == 0) {
                        this.f57280k = 1 + j3;
                        AbstractC22806wY1.m811Q(j3, (byte) i);
                        return;
                    }
                    this.f57280k = j3 + 1;
                    AbstractC22806wY1.m811Q(j3, (byte) ((i & 127) | 128));
                    i >>>= 7;
                } else {
                    throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Long.valueOf(this.f57280k), Long.valueOf(this.f57278i), 1));
                }
            }
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeUInt64(int i, long j) {
            writeTag(i, 0);
            writeUInt64NoTag(j);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeUInt64NoTag(long j) {
            if (this.f57280k <= this.f57279j) {
                while ((j & (-128)) != 0) {
                    long j2 = this.f57280k;
                    this.f57280k = j2 + 1;
                    AbstractC22806wY1.m811Q(j2, (byte) ((((int) j) & 127) | 128));
                    j >>>= 7;
                }
                long j3 = this.f57280k;
                this.f57280k = 1 + j3;
                AbstractC22806wY1.m811Q(j3, (byte) j);
                return;
            }
            while (true) {
                long j4 = this.f57280k;
                if (j4 < this.f57278i) {
                    if ((j & (-128)) == 0) {
                        this.f57280k = 1 + j4;
                        AbstractC22806wY1.m811Q(j4, (byte) j);
                        return;
                    }
                    this.f57280k = j4 + 1;
                    AbstractC22806wY1.m811Q(j4, (byte) ((((int) j) & 127) | 128));
                    j >>>= 7;
                } else {
                    throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Long.valueOf(this.f57280k), Long.valueOf(this.f57278i), 1));
                }
            }
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeByteArray(int i, byte[] bArr, int i2, int i3) {
            writeTag(i, 2);
            mo36985l(bArr, i2, i3);
        }

        @Override // com.google.protobuf.CodedOutputStream, com.google.protobuf.ByteOutput
        public void writeLazy(ByteBuffer byteBuffer) {
            write(byteBuffer);
        }

        @Override // com.google.protobuf.CodedOutputStream, com.google.protobuf.ByteOutput
        public void write(byte[] bArr, int i, int i2) {
            if (bArr != null && i >= 0 && i2 >= 0 && bArr.length - i2 >= i) {
                long j = i2;
                long j2 = this.f57280k;
                if (this.f57278i - j >= j2) {
                    AbstractC22806wY1.m784q(bArr, i, j2, j);
                    this.f57280k += j;
                    return;
                }
            }
            if (bArr == null) {
                throw new NullPointerException("value");
            }
            throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Long.valueOf(this.f57280k), Long.valueOf(this.f57278i), Integer.valueOf(i2)));
        }

        @Override // com.google.protobuf.CodedOutputStream, com.google.protobuf.ByteOutput
        public void write(ByteBuffer byteBuffer) {
            try {
                int remaining = byteBuffer.remaining();
                m36981r(this.f57280k);
                this.f57275f.put(byteBuffer);
                this.f57280k += remaining;
            } catch (BufferOverflowException e) {
                throw new OutOfSpaceException(e);
            }
        }
    }

    /* renamed from: b */
    public static int m37009b(int i, MessageLite messageLite, InterfaceC8961t interfaceC8961t) {
        return (computeTagSize(i) * 2) + m37008c(messageLite, interfaceC8961t);
    }

    /* renamed from: c */
    public static int m37008c(MessageLite messageLite, InterfaceC8961t interfaceC8961t) {
        return ((AbstractMessageLite) messageLite).mo35837b(interfaceC8961t);
    }

    public static int computeBoolSize(int i, boolean z) {
        return computeTagSize(i) + computeBoolSizeNoTag(z);
    }

    public static int computeBoolSizeNoTag(boolean z) {
        return 1;
    }

    public static int computeByteArraySize(int i, byte[] bArr) {
        return computeTagSize(i) + computeByteArraySizeNoTag(bArr);
    }

    public static int computeByteArraySizeNoTag(byte[] bArr) {
        return m37007d(bArr.length);
    }

    public static int computeByteBufferSize(int i, ByteBuffer byteBuffer) {
        return computeTagSize(i) + computeByteBufferSizeNoTag(byteBuffer);
    }

    public static int computeByteBufferSizeNoTag(ByteBuffer byteBuffer) {
        return m37007d(byteBuffer.capacity());
    }

    public static int computeBytesSize(int i, ByteString byteString) {
        return computeTagSize(i) + computeBytesSizeNoTag(byteString);
    }

    public static int computeBytesSizeNoTag(ByteString byteString) {
        return m37007d(byteString.size());
    }

    public static int computeDoubleSize(int i, double d) {
        return computeTagSize(i) + computeDoubleSizeNoTag(d);
    }

    public static int computeDoubleSizeNoTag(double d) {
        return 8;
    }

    public static int computeEnumSize(int i, int i2) {
        return computeTagSize(i) + computeEnumSizeNoTag(i2);
    }

    public static int computeEnumSizeNoTag(int i) {
        return computeInt32SizeNoTag(i);
    }

    public static int computeFixed32Size(int i, int i2) {
        return computeTagSize(i) + computeFixed32SizeNoTag(i2);
    }

    public static int computeFixed32SizeNoTag(int i) {
        return 4;
    }

    public static int computeFixed64Size(int i, long j) {
        return computeTagSize(i) + computeFixed64SizeNoTag(j);
    }

    public static int computeFixed64SizeNoTag(long j) {
        return 8;
    }

    public static int computeFloatSize(int i, float f) {
        return computeTagSize(i) + computeFloatSizeNoTag(f);
    }

    public static int computeFloatSizeNoTag(float f) {
        return 4;
    }

    @Deprecated
    public static int computeGroupSize(int i, MessageLite messageLite) {
        return (computeTagSize(i) * 2) + messageLite.getSerializedSize();
    }

    @Deprecated
    public static int computeGroupSizeNoTag(MessageLite messageLite) {
        return messageLite.getSerializedSize();
    }

    public static int computeInt32Size(int i, int i2) {
        return computeTagSize(i) + computeInt32SizeNoTag(i2);
    }

    public static int computeInt32SizeNoTag(int i) {
        if (i >= 0) {
            return computeUInt32SizeNoTag(i);
        }
        return 10;
    }

    public static int computeInt64Size(int i, long j) {
        return computeTagSize(i) + computeInt64SizeNoTag(j);
    }

    public static int computeInt64SizeNoTag(long j) {
        return computeUInt64SizeNoTag(j);
    }

    public static int computeLazyFieldMessageSetExtensionSize(int i, LazyFieldLite lazyFieldLite) {
        return (computeTagSize(1) * 2) + computeUInt32Size(2, i) + computeLazyFieldSize(3, lazyFieldLite);
    }

    public static int computeLazyFieldSize(int i, LazyFieldLite lazyFieldLite) {
        return computeTagSize(i) + computeLazyFieldSizeNoTag(lazyFieldLite);
    }

    public static int computeLazyFieldSizeNoTag(LazyFieldLite lazyFieldLite) {
        return m37007d(lazyFieldLite.getSerializedSize());
    }

    public static int computeMessageSetExtensionSize(int i, MessageLite messageLite) {
        return (computeTagSize(1) * 2) + computeUInt32Size(2, i) + computeMessageSize(3, messageLite);
    }

    public static int computeMessageSize(int i, MessageLite messageLite) {
        return computeTagSize(i) + computeMessageSizeNoTag(messageLite);
    }

    public static int computeMessageSizeNoTag(MessageLite messageLite) {
        return m37007d(messageLite.getSerializedSize());
    }

    public static int computeRawMessageSetExtensionSize(int i, ByteString byteString) {
        return (computeTagSize(1) * 2) + computeUInt32Size(2, i) + computeBytesSize(3, byteString);
    }

    @Deprecated
    public static int computeRawVarint32Size(int i) {
        return computeUInt32SizeNoTag(i);
    }

    @Deprecated
    public static int computeRawVarint64Size(long j) {
        return computeUInt64SizeNoTag(j);
    }

    public static int computeSFixed32Size(int i, int i2) {
        return computeTagSize(i) + computeSFixed32SizeNoTag(i2);
    }

    public static int computeSFixed32SizeNoTag(int i) {
        return 4;
    }

    public static int computeSFixed64Size(int i, long j) {
        return computeTagSize(i) + computeSFixed64SizeNoTag(j);
    }

    public static int computeSFixed64SizeNoTag(long j) {
        return 8;
    }

    public static int computeSInt32Size(int i, int i2) {
        return computeTagSize(i) + computeSInt32SizeNoTag(i2);
    }

    public static int computeSInt32SizeNoTag(int i) {
        return computeUInt32SizeNoTag(encodeZigZag32(i));
    }

    public static int computeSInt64Size(int i, long j) {
        return computeTagSize(i) + computeSInt64SizeNoTag(j);
    }

    public static int computeSInt64SizeNoTag(long j) {
        return computeUInt64SizeNoTag(encodeZigZag64(j));
    }

    public static int computeStringSize(int i, String str) {
        return computeTagSize(i) + computeStringSizeNoTag(str);
    }

    public static int computeStringSizeNoTag(String str) {
        int length;
        try {
            length = Utf8.m35514k(str);
        } catch (Utf8.UnpairedSurrogateException unused) {
            length = str.getBytes(Internal.f57358b).length;
        }
        return m37007d(length);
    }

    public static int computeTagSize(int i) {
        return computeUInt32SizeNoTag(WireFormat.m35424a(i, 0));
    }

    public static int computeUInt32Size(int i, int i2) {
        return computeTagSize(i) + computeUInt32SizeNoTag(i2);
    }

    public static int computeUInt32SizeNoTag(int i) {
        if ((i & (-128)) == 0) {
            return 1;
        }
        if ((i & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i) == 0) {
            return 3;
        }
        return (i & (-268435456)) == 0 ? 4 : 5;
    }

    public static int computeUInt64Size(int i, long j) {
        return computeTagSize(i) + computeUInt64SizeNoTag(j);
    }

    public static int computeUInt64SizeNoTag(long j) {
        int i;
        if (((-128) & j) == 0) {
            return 1;
        }
        if (j < 0) {
            return 10;
        }
        if (((-34359738368L) & j) != 0) {
            j >>>= 28;
            i = 6;
        } else {
            i = 2;
        }
        if (((-2097152) & j) != 0) {
            i += 2;
            j >>>= 14;
        }
        return (j & (-16384)) != 0 ? i + 1 : i;
    }

    /* renamed from: d */
    public static int m37007d(int i) {
        return computeUInt32SizeNoTag(i) + i;
    }

    /* renamed from: e */
    public static int m37006e(int i, MessageLite messageLite, InterfaceC8961t interfaceC8961t) {
        return computeTagSize(i) + m37005f(messageLite, interfaceC8961t);
    }

    public static int encodeZigZag32(int i) {
        return (i >> 31) ^ (i << 1);
    }

    public static long encodeZigZag64(long j) {
        return (j >> 63) ^ (j << 1);
    }

    /* renamed from: f */
    public static int m37005f(MessageLite messageLite, InterfaceC8961t interfaceC8961t) {
        return m37007d(((AbstractMessageLite) messageLite).mo35837b(interfaceC8961t));
    }

    /* renamed from: g */
    public static int m37004g(int i) {
        if (i > 4096) {
            return 4096;
        }
        return i;
    }

    /* renamed from: j */
    public static CodedOutputStream m37001j(ByteBuffer byteBuffer) {
        return new C8850f(byteBuffer);
    }

    /* renamed from: k */
    public static CodedOutputStream m37000k(ByteBuffer byteBuffer) {
        return new C8851g(byteBuffer);
    }

    public static CodedOutputStream newInstance(OutputStream outputStream) {
        return newInstance(outputStream, 4096);
    }

    public final void checkNoSpaceLeft() {
        if (spaceLeft() == 0) {
            return;
        }
        throw new IllegalStateException("Did not write as much data as expected.");
    }

    public abstract void flush() throws IOException;

    public abstract int getTotalBytesWritten();

    /* renamed from: h */
    public final void m37003h(String str, Utf8.UnpairedSurrogateException unpairedSurrogateException) {
        f57256c.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) unpairedSurrogateException);
        byte[] bytes = str.getBytes(Internal.f57358b);
        try {
            writeUInt32NoTag(bytes.length);
            writeLazy(bytes, 0, bytes.length);
        } catch (IndexOutOfBoundsException e) {
            throw new OutOfSpaceException(e);
        }
    }

    /* renamed from: i */
    public boolean m37002i() {
        return this.f57259b;
    }

    /* renamed from: l */
    public abstract void mo36985l(byte[] bArr, int i, int i2);

    /* renamed from: m */
    public final void m36999m(int i, MessageLite messageLite, InterfaceC8961t interfaceC8961t) {
        writeTag(i, 3);
        m36998n(messageLite, interfaceC8961t);
        writeTag(i, 4);
    }

    /* renamed from: n */
    public final void m36998n(MessageLite messageLite, InterfaceC8961t interfaceC8961t) {
        interfaceC8961t.mo35115g(messageLite, this.f57258a);
    }

    /* renamed from: o */
    public abstract void mo36984o(int i, MessageLite messageLite, InterfaceC8961t interfaceC8961t);

    public abstract int spaceLeft();

    public void useDeterministicSerialization() {
        this.f57259b = true;
    }

    @Override // com.google.protobuf.ByteOutput
    public abstract void write(byte b) throws IOException;

    @Override // com.google.protobuf.ByteOutput
    public abstract void write(ByteBuffer byteBuffer) throws IOException;

    @Override // com.google.protobuf.ByteOutput
    public abstract void write(byte[] bArr, int i, int i2) throws IOException;

    public abstract void writeBool(int i, boolean z) throws IOException;

    public final void writeBoolNoTag(boolean z) throws IOException {
        write(z ? (byte) 1 : (byte) 0);
    }

    public abstract void writeByteArray(int i, byte[] bArr) throws IOException;

    public abstract void writeByteArray(int i, byte[] bArr, int i2, int i3) throws IOException;

    public final void writeByteArrayNoTag(byte[] bArr) throws IOException {
        mo36985l(bArr, 0, bArr.length);
    }

    public abstract void writeByteBuffer(int i, ByteBuffer byteBuffer) throws IOException;

    public abstract void writeBytes(int i, ByteString byteString) throws IOException;

    public abstract void writeBytesNoTag(ByteString byteString) throws IOException;

    public final void writeDouble(int i, double d) throws IOException {
        writeFixed64(i, Double.doubleToRawLongBits(d));
    }

    public final void writeDoubleNoTag(double d) throws IOException {
        writeFixed64NoTag(Double.doubleToRawLongBits(d));
    }

    public final void writeEnum(int i, int i2) throws IOException {
        writeInt32(i, i2);
    }

    public final void writeEnumNoTag(int i) throws IOException {
        writeInt32NoTag(i);
    }

    public abstract void writeFixed32(int i, int i2) throws IOException;

    public abstract void writeFixed32NoTag(int i) throws IOException;

    public abstract void writeFixed64(int i, long j) throws IOException;

    public abstract void writeFixed64NoTag(long j) throws IOException;

    public final void writeFloat(int i, float f) throws IOException {
        writeFixed32(i, Float.floatToRawIntBits(f));
    }

    public final void writeFloatNoTag(float f) throws IOException {
        writeFixed32NoTag(Float.floatToRawIntBits(f));
    }

    @Deprecated
    public final void writeGroup(int i, MessageLite messageLite) throws IOException {
        writeTag(i, 3);
        writeGroupNoTag(messageLite);
        writeTag(i, 4);
    }

    @Deprecated
    public final void writeGroupNoTag(MessageLite messageLite) throws IOException {
        messageLite.writeTo(this);
    }

    public abstract void writeInt32(int i, int i2) throws IOException;

    public abstract void writeInt32NoTag(int i) throws IOException;

    public final void writeInt64(int i, long j) throws IOException {
        writeUInt64(i, j);
    }

    public final void writeInt64NoTag(long j) throws IOException {
        writeUInt64NoTag(j);
    }

    @Override // com.google.protobuf.ByteOutput
    public abstract void writeLazy(ByteBuffer byteBuffer) throws IOException;

    @Override // com.google.protobuf.ByteOutput
    public abstract void writeLazy(byte[] bArr, int i, int i2) throws IOException;

    public abstract void writeMessage(int i, MessageLite messageLite) throws IOException;

    public abstract void writeMessageNoTag(MessageLite messageLite) throws IOException;

    public abstract void writeMessageSetExtension(int i, MessageLite messageLite) throws IOException;

    public final void writeRawByte(byte b) throws IOException {
        write(b);
    }

    public abstract void writeRawBytes(ByteBuffer byteBuffer) throws IOException;

    public final void writeRawBytes(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    @Deprecated
    public final void writeRawLittleEndian32(int i) throws IOException {
        writeFixed32NoTag(i);
    }

    @Deprecated
    public final void writeRawLittleEndian64(long j) throws IOException {
        writeFixed64NoTag(j);
    }

    public abstract void writeRawMessageSetExtension(int i, ByteString byteString) throws IOException;

    @Deprecated
    public final void writeRawVarint32(int i) throws IOException {
        writeUInt32NoTag(i);
    }

    @Deprecated
    public final void writeRawVarint64(long j) throws IOException {
        writeUInt64NoTag(j);
    }

    public final void writeSFixed32(int i, int i2) throws IOException {
        writeFixed32(i, i2);
    }

    public final void writeSFixed32NoTag(int i) throws IOException {
        writeFixed32NoTag(i);
    }

    public final void writeSFixed64(int i, long j) throws IOException {
        writeFixed64(i, j);
    }

    public final void writeSFixed64NoTag(long j) throws IOException {
        writeFixed64NoTag(j);
    }

    public final void writeSInt32(int i, int i2) throws IOException {
        writeUInt32(i, encodeZigZag32(i2));
    }

    public final void writeSInt32NoTag(int i) throws IOException {
        writeUInt32NoTag(encodeZigZag32(i));
    }

    public final void writeSInt64(int i, long j) throws IOException {
        writeUInt64(i, encodeZigZag64(j));
    }

    public final void writeSInt64NoTag(long j) throws IOException {
        writeUInt64NoTag(encodeZigZag64(j));
    }

    public abstract void writeString(int i, String str) throws IOException;

    public abstract void writeStringNoTag(String str) throws IOException;

    public abstract void writeTag(int i, int i2) throws IOException;

    public abstract void writeUInt32(int i, int i2) throws IOException;

    public abstract void writeUInt32NoTag(int i) throws IOException;

    public abstract void writeUInt64(int i, long j) throws IOException;

    public abstract void writeUInt64NoTag(long j) throws IOException;

    public CodedOutputStream() {
    }

    public static CodedOutputStream newInstance(OutputStream outputStream, int i) {
        return new C8849e(outputStream, i);
    }

    public final void writeRawByte(int i) throws IOException {
        write((byte) i);
    }

    public final void writeRawBytes(byte[] bArr, int i, int i2) throws IOException {
        write(bArr, i, i2);
    }

    public static CodedOutputStream newInstance(byte[] bArr) {
        return newInstance(bArr, 0, bArr.length);
    }

    public final void writeRawBytes(ByteString byteString) throws IOException {
        byteString.writeTo(this);
    }

    public static CodedOutputStream newInstance(byte[] bArr, int i, int i2) {
        return new C8847c(bArr, i, i2);
    }

    public static CodedOutputStream newInstance(ByteBuffer byteBuffer) {
        if (byteBuffer.hasArray()) {
            return new C8848d(byteBuffer);
        }
        if (byteBuffer.isDirect() && !byteBuffer.isReadOnly()) {
            if (C8851g.m36982q()) {
                return m37000k(byteBuffer);
            }
            return m37001j(byteBuffer);
        }
        throw new IllegalArgumentException("ByteBuffer is read-only");
    }

    @Deprecated
    public static CodedOutputStream newInstance(ByteBuffer byteBuffer, int i) {
        return newInstance(byteBuffer);
    }
}
