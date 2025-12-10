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
    public static final Logger f57268c = Logger.getLogger(CodedOutputStream.class.getName());

    /* renamed from: d */
    public static final boolean f57269d = AbstractC22358tZ1.m22658J();

    /* renamed from: a */
    public C8929e f57270a;

    /* renamed from: b */
    public boolean f57271b;

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
    public static abstract class AbstractC8835b extends CodedOutputStream {

        /* renamed from: e */
        public final byte[] f57272e;

        /* renamed from: f */
        public final int f57273f;

        /* renamed from: g */
        public int f57274g;

        /* renamed from: h */
        public int f57275h;

        public AbstractC8835b(int i) {
            super();
            if (i >= 0) {
                byte[] bArr = new byte[Math.max(i, 20)];
                this.f57272e = bArr;
                this.f57273f = bArr.length;
                return;
            }
            throw new IllegalArgumentException("bufferSize must be >= 0");
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final int getTotalBytesWritten() {
            return this.f57275h;
        }

        /* renamed from: p */
        public final void m36989p(byte b) {
            byte[] bArr = this.f57272e;
            int i = this.f57274g;
            this.f57274g = i + 1;
            bArr[i] = b;
            this.f57275h++;
        }

        /* renamed from: q */
        public final void m36988q(int i) {
            byte[] bArr = this.f57272e;
            int i2 = this.f57274g;
            int i3 = i2 + 1;
            this.f57274g = i3;
            bArr[i2] = (byte) (i & 255);
            int i4 = i2 + 2;
            this.f57274g = i4;
            bArr[i3] = (byte) ((i >> 8) & 255);
            int i5 = i2 + 3;
            this.f57274g = i5;
            bArr[i4] = (byte) ((i >> 16) & 255);
            this.f57274g = i2 + 4;
            bArr[i5] = (byte) ((i >> 24) & 255);
            this.f57275h += 4;
        }

        /* renamed from: r */
        public final void m36987r(long j) {
            byte[] bArr = this.f57272e;
            int i = this.f57274g;
            int i2 = i + 1;
            this.f57274g = i2;
            bArr[i] = (byte) (j & 255);
            int i3 = i + 2;
            this.f57274g = i3;
            bArr[i2] = (byte) ((j >> 8) & 255);
            int i4 = i + 3;
            this.f57274g = i4;
            bArr[i3] = (byte) ((j >> 16) & 255);
            int i5 = i + 4;
            this.f57274g = i5;
            bArr[i4] = (byte) (255 & (j >> 24));
            int i6 = i + 5;
            this.f57274g = i6;
            bArr[i5] = (byte) (((int) (j >> 32)) & 255);
            int i7 = i + 6;
            this.f57274g = i7;
            bArr[i6] = (byte) (((int) (j >> 40)) & 255);
            int i8 = i + 7;
            this.f57274g = i8;
            bArr[i7] = (byte) (((int) (j >> 48)) & 255);
            this.f57274g = i + 8;
            bArr[i8] = (byte) (((int) (j >> 56)) & 255);
            this.f57275h += 8;
        }

        /* renamed from: s */
        public final void m36986s(int i) {
            if (i >= 0) {
                m36984u(i);
            } else {
                m36983v(i);
            }
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final int spaceLeft() {
            throw new UnsupportedOperationException("spaceLeft() can only be called on CodedOutputStreams that are writing to a flat array or ByteBuffer.");
        }

        /* renamed from: t */
        public final void m36985t(int i, int i2) {
            m36984u(WireFormat.m35416a(i, i2));
        }

        /* renamed from: u */
        public final void m36984u(int i) {
            if (CodedOutputStream.f57269d) {
                long j = this.f57274g;
                while ((i & (-128)) != 0) {
                    byte[] bArr = this.f57272e;
                    int i2 = this.f57274g;
                    this.f57274g = i2 + 1;
                    AbstractC22358tZ1.m22650R(bArr, i2, (byte) ((i & 127) | 128));
                    i >>>= 7;
                }
                byte[] bArr2 = this.f57272e;
                int i3 = this.f57274g;
                this.f57274g = i3 + 1;
                AbstractC22358tZ1.m22650R(bArr2, i3, (byte) i);
                this.f57275h += (int) (this.f57274g - j);
                return;
            }
            while ((i & (-128)) != 0) {
                byte[] bArr3 = this.f57272e;
                int i4 = this.f57274g;
                this.f57274g = i4 + 1;
                bArr3[i4] = (byte) ((i & 127) | 128);
                this.f57275h++;
                i >>>= 7;
            }
            byte[] bArr4 = this.f57272e;
            int i5 = this.f57274g;
            this.f57274g = i5 + 1;
            bArr4[i5] = (byte) i;
            this.f57275h++;
        }

        /* renamed from: v */
        public final void m36983v(long j) {
            if (CodedOutputStream.f57269d) {
                long j2 = this.f57274g;
                while ((j & (-128)) != 0) {
                    byte[] bArr = this.f57272e;
                    int i = this.f57274g;
                    this.f57274g = i + 1;
                    AbstractC22358tZ1.m22650R(bArr, i, (byte) ((((int) j) & 127) | 128));
                    j >>>= 7;
                }
                byte[] bArr2 = this.f57272e;
                int i2 = this.f57274g;
                this.f57274g = i2 + 1;
                AbstractC22358tZ1.m22650R(bArr2, i2, (byte) j);
                this.f57275h += (int) (this.f57274g - j2);
                return;
            }
            while ((j & (-128)) != 0) {
                byte[] bArr3 = this.f57272e;
                int i3 = this.f57274g;
                this.f57274g = i3 + 1;
                bArr3[i3] = (byte) ((((int) j) & 127) | 128);
                this.f57275h++;
                j >>>= 7;
            }
            byte[] bArr4 = this.f57272e;
            int i4 = this.f57274g;
            this.f57274g = i4 + 1;
            bArr4[i4] = (byte) j;
            this.f57275h++;
        }
    }

    /* renamed from: com.google.protobuf.CodedOutputStream$c */
    /* loaded from: classes4.dex */
    public static class C8836c extends CodedOutputStream {

        /* renamed from: e */
        public final byte[] f57276e;

        /* renamed from: f */
        public final int f57277f;

        /* renamed from: g */
        public final int f57278g;

        /* renamed from: h */
        public int f57279h;

        public C8836c(byte[] bArr, int i, int i2) {
            super();
            if (bArr != null) {
                int i3 = i + i2;
                if ((i | i2 | (bArr.length - i3)) >= 0) {
                    this.f57276e = bArr;
                    this.f57277f = i;
                    this.f57279h = i;
                    this.f57278g = i3;
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
            return this.f57279h - this.f57277f;
        }

        @Override // com.google.protobuf.CodedOutputStream
        /* renamed from: l */
        public final void mo36977l(byte[] bArr, int i, int i2) {
            writeUInt32NoTag(i2);
            write(bArr, i, i2);
        }

        @Override // com.google.protobuf.CodedOutputStream
        /* renamed from: o */
        public final void mo36976o(int i, MessageLite messageLite, InterfaceC8950t interfaceC8950t) {
            writeTag(i, 2);
            writeUInt32NoTag(((AbstractMessageLite) messageLite).mo35829b(interfaceC8950t));
            interfaceC8950t.mo35107g(messageLite, this.f57270a);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final int spaceLeft() {
            return this.f57278g - this.f57279h;
        }

        @Override // com.google.protobuf.CodedOutputStream, com.google.protobuf.ByteOutput
        public final void write(byte b) {
            try {
                byte[] bArr = this.f57276e;
                int i = this.f57279h;
                this.f57279h = i + 1;
                bArr[i] = b;
            } catch (IndexOutOfBoundsException e) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f57279h), Integer.valueOf(this.f57278g), 1), e);
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
                byte[] bArr = this.f57276e;
                int i2 = this.f57279h;
                int i3 = i2 + 1;
                this.f57279h = i3;
                bArr[i2] = (byte) (i & 255);
                int i4 = i2 + 2;
                this.f57279h = i4;
                bArr[i3] = (byte) ((i >> 8) & 255);
                int i5 = i2 + 3;
                this.f57279h = i5;
                bArr[i4] = (byte) ((i >> 16) & 255);
                this.f57279h = i2 + 4;
                bArr[i5] = (byte) ((i >> 24) & 255);
            } catch (IndexOutOfBoundsException e) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f57279h), Integer.valueOf(this.f57278g), 1), e);
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
                byte[] bArr = this.f57276e;
                int i = this.f57279h;
                int i2 = i + 1;
                this.f57279h = i2;
                bArr[i] = (byte) (((int) j) & 255);
                int i3 = i + 2;
                this.f57279h = i3;
                bArr[i2] = (byte) (((int) (j >> 8)) & 255);
                int i4 = i + 3;
                this.f57279h = i4;
                bArr[i3] = (byte) (((int) (j >> 16)) & 255);
                int i5 = i + 4;
                this.f57279h = i5;
                bArr[i4] = (byte) (((int) (j >> 24)) & 255);
                int i6 = i + 5;
                this.f57279h = i6;
                bArr[i5] = (byte) (((int) (j >> 32)) & 255);
                int i7 = i + 6;
                this.f57279h = i7;
                bArr[i6] = (byte) (((int) (j >> 40)) & 255);
                int i8 = i + 7;
                this.f57279h = i8;
                bArr[i7] = (byte) (((int) (j >> 48)) & 255);
                this.f57279h = i + 8;
                bArr[i8] = (byte) (((int) (j >> 56)) & 255);
            } catch (IndexOutOfBoundsException e) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f57279h), Integer.valueOf(this.f57278g), 1), e);
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
            int i = this.f57279h;
            try {
                int computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(str.length() * 3);
                int computeUInt32SizeNoTag2 = CodedOutputStream.computeUInt32SizeNoTag(str.length());
                if (computeUInt32SizeNoTag2 == computeUInt32SizeNoTag) {
                    int i2 = i + computeUInt32SizeNoTag2;
                    this.f57279h = i2;
                    int m35508i = Utf8.m35508i(str, this.f57276e, i2, spaceLeft());
                    this.f57279h = i;
                    writeUInt32NoTag((m35508i - i) - computeUInt32SizeNoTag2);
                    this.f57279h = m35508i;
                } else {
                    writeUInt32NoTag(Utf8.m35506k(str));
                    this.f57279h = Utf8.m35508i(str, this.f57276e, this.f57279h, spaceLeft());
                }
            } catch (Utf8.UnpairedSurrogateException e) {
                this.f57279h = i;
                m36995h(str, e);
            } catch (IndexOutOfBoundsException e2) {
                throw new OutOfSpaceException(e2);
            }
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void writeTag(int i, int i2) {
            writeUInt32NoTag(WireFormat.m35416a(i, i2));
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
                    byte[] bArr = this.f57276e;
                    int i2 = this.f57279h;
                    this.f57279h = i2 + 1;
                    bArr[i2] = (byte) ((i & 127) | 128);
                    i >>>= 7;
                } catch (IndexOutOfBoundsException e) {
                    throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f57279h), Integer.valueOf(this.f57278g), 1), e);
                }
            }
            byte[] bArr2 = this.f57276e;
            int i3 = this.f57279h;
            this.f57279h = i3 + 1;
            bArr2[i3] = (byte) i;
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void writeUInt64(int i, long j) {
            writeTag(i, 0);
            writeUInt64NoTag(j);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void writeUInt64NoTag(long j) {
            if (CodedOutputStream.f57269d && spaceLeft() >= 10) {
                while ((j & (-128)) != 0) {
                    byte[] bArr = this.f57276e;
                    int i = this.f57279h;
                    this.f57279h = i + 1;
                    AbstractC22358tZ1.m22650R(bArr, i, (byte) ((((int) j) & 127) | 128));
                    j >>>= 7;
                }
                byte[] bArr2 = this.f57276e;
                int i2 = this.f57279h;
                this.f57279h = 1 + i2;
                AbstractC22358tZ1.m22650R(bArr2, i2, (byte) j);
                return;
            }
            while ((j & (-128)) != 0) {
                try {
                    byte[] bArr3 = this.f57276e;
                    int i3 = this.f57279h;
                    this.f57279h = i3 + 1;
                    bArr3[i3] = (byte) ((((int) j) & 127) | 128);
                    j >>>= 7;
                } catch (IndexOutOfBoundsException e) {
                    throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f57279h), Integer.valueOf(this.f57278g), 1), e);
                }
            }
            byte[] bArr4 = this.f57276e;
            int i4 = this.f57279h;
            this.f57279h = i4 + 1;
            bArr4[i4] = (byte) j;
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void writeByteArray(int i, byte[] bArr, int i2, int i3) {
            writeTag(i, 2);
            mo36977l(bArr, i2, i3);
        }

        @Override // com.google.protobuf.CodedOutputStream, com.google.protobuf.ByteOutput
        public final void writeLazy(ByteBuffer byteBuffer) {
            write(byteBuffer);
        }

        @Override // com.google.protobuf.CodedOutputStream, com.google.protobuf.ByteOutput
        public final void write(byte[] bArr, int i, int i2) {
            try {
                System.arraycopy(bArr, i, this.f57276e, this.f57279h, i2);
                this.f57279h += i2;
            } catch (IndexOutOfBoundsException e) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f57279h), Integer.valueOf(this.f57278g), Integer.valueOf(i2)), e);
            }
        }

        @Override // com.google.protobuf.CodedOutputStream, com.google.protobuf.ByteOutput
        public final void write(ByteBuffer byteBuffer) {
            int remaining = byteBuffer.remaining();
            try {
                byteBuffer.get(this.f57276e, this.f57279h, remaining);
                this.f57279h += remaining;
            } catch (IndexOutOfBoundsException e) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f57279h), Integer.valueOf(this.f57278g), Integer.valueOf(remaining)), e);
            }
        }
    }

    /* renamed from: com.google.protobuf.CodedOutputStream$d */
    /* loaded from: classes4.dex */
    public static final class C8837d extends C8836c {

        /* renamed from: i */
        public final ByteBuffer f57280i;

        /* renamed from: j */
        public int f57281j;

        public C8837d(ByteBuffer byteBuffer) {
            super(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining());
            this.f57280i = byteBuffer;
            this.f57281j = byteBuffer.position();
        }

        @Override // com.google.protobuf.CodedOutputStream.C8836c, com.google.protobuf.CodedOutputStream
        public void flush() {
            ByteBuffer byteBuffer = (ByteBuffer) this.f57280i.position(this.f57281j + getTotalBytesWritten());
        }
    }

    /* renamed from: com.google.protobuf.CodedOutputStream$e */
    /* loaded from: classes4.dex */
    public static final class C8838e extends AbstractC8835b {

        /* renamed from: i */
        public final OutputStream f57282i;

        public C8838e(OutputStream outputStream, int i) {
            super(i);
            if (outputStream != null) {
                this.f57282i = outputStream;
                return;
            }
            throw new NullPointerException("out");
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void flush() {
            if (this.f57274g > 0) {
                m36982w();
            }
        }

        @Override // com.google.protobuf.CodedOutputStream
        /* renamed from: l */
        public void mo36977l(byte[] bArr, int i, int i2) {
            writeUInt32NoTag(i2);
            write(bArr, i, i2);
        }

        @Override // com.google.protobuf.CodedOutputStream
        /* renamed from: o */
        public void mo36976o(int i, MessageLite messageLite, InterfaceC8950t interfaceC8950t) {
            writeTag(i, 2);
            m36980y(messageLite, interfaceC8950t);
        }

        /* renamed from: w */
        public final void m36982w() {
            this.f57282i.write(this.f57272e, 0, this.f57274g);
            this.f57274g = 0;
        }

        @Override // com.google.protobuf.CodedOutputStream, com.google.protobuf.ByteOutput
        public void write(byte b) {
            if (this.f57274g == this.f57273f) {
                m36982w();
            }
            m36989p(b);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeBool(int i, boolean z) {
            m36981x(11);
            m36985t(i, 0);
            m36989p(z ? (byte) 1 : (byte) 0);
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
            m36981x(14);
            m36985t(i, 5);
            m36988q(i2);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeFixed32NoTag(int i) {
            m36981x(4);
            m36988q(i);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeFixed64(int i, long j) {
            m36981x(18);
            m36985t(i, 1);
            m36987r(j);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeFixed64NoTag(long j) {
            m36981x(8);
            m36987r(j);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeInt32(int i, int i2) {
            m36981x(20);
            m36985t(i, 0);
            m36986s(i2);
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
            int m35506k;
            try {
                int length = str.length() * 3;
                int computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(length);
                int i = computeUInt32SizeNoTag + length;
                int i2 = this.f57273f;
                if (i > i2) {
                    byte[] bArr = new byte[length];
                    int m35508i = Utf8.m35508i(str, bArr, 0, length);
                    writeUInt32NoTag(m35508i);
                    writeLazy(bArr, 0, m35508i);
                    return;
                }
                if (i > i2 - this.f57274g) {
                    m36982w();
                }
                int computeUInt32SizeNoTag2 = CodedOutputStream.computeUInt32SizeNoTag(str.length());
                int i3 = this.f57274g;
                try {
                    if (computeUInt32SizeNoTag2 == computeUInt32SizeNoTag) {
                        int i4 = i3 + computeUInt32SizeNoTag2;
                        this.f57274g = i4;
                        int m35508i2 = Utf8.m35508i(str, this.f57272e, i4, this.f57273f - i4);
                        this.f57274g = i3;
                        m35506k = (m35508i2 - i3) - computeUInt32SizeNoTag2;
                        m36984u(m35506k);
                        this.f57274g = m35508i2;
                    } else {
                        m35506k = Utf8.m35506k(str);
                        m36984u(m35506k);
                        this.f57274g = Utf8.m35508i(str, this.f57272e, this.f57274g, m35506k);
                    }
                    this.f57275h += m35506k;
                } catch (Utf8.UnpairedSurrogateException e) {
                    this.f57275h -= this.f57274g - i3;
                    this.f57274g = i3;
                    throw e;
                } catch (ArrayIndexOutOfBoundsException e2) {
                    throw new OutOfSpaceException(e2);
                }
            } catch (Utf8.UnpairedSurrogateException e3) {
                m36995h(str, e3);
            }
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeTag(int i, int i2) {
            writeUInt32NoTag(WireFormat.m35416a(i, i2));
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeUInt32(int i, int i2) {
            m36981x(20);
            m36985t(i, 0);
            m36984u(i2);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeUInt32NoTag(int i) {
            m36981x(5);
            m36984u(i);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeUInt64(int i, long j) {
            m36981x(20);
            m36985t(i, 0);
            m36983v(j);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeUInt64NoTag(long j) {
            m36981x(10);
            m36983v(j);
        }

        /* renamed from: x */
        public final void m36981x(int i) {
            if (this.f57273f - this.f57274g < i) {
                m36982w();
            }
        }

        /* renamed from: y */
        public void m36980y(MessageLite messageLite, InterfaceC8950t interfaceC8950t) {
            writeUInt32NoTag(((AbstractMessageLite) messageLite).mo35829b(interfaceC8950t));
            interfaceC8950t.mo35107g(messageLite, this.f57270a);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeByteArray(int i, byte[] bArr, int i2, int i3) {
            writeTag(i, 2);
            mo36977l(bArr, i2, i3);
        }

        @Override // com.google.protobuf.CodedOutputStream, com.google.protobuf.ByteOutput
        public void writeLazy(ByteBuffer byteBuffer) {
            write(byteBuffer);
        }

        @Override // com.google.protobuf.CodedOutputStream, com.google.protobuf.ByteOutput
        public void write(byte[] bArr, int i, int i2) {
            int i3 = this.f57273f;
            int i4 = this.f57274g;
            if (i3 - i4 >= i2) {
                System.arraycopy(bArr, i, this.f57272e, i4, i2);
                this.f57274g += i2;
                this.f57275h += i2;
                return;
            }
            int i5 = i3 - i4;
            System.arraycopy(bArr, i, this.f57272e, i4, i5);
            int i6 = i + i5;
            int i7 = i2 - i5;
            this.f57274g = this.f57273f;
            this.f57275h += i5;
            m36982w();
            if (i7 <= this.f57273f) {
                System.arraycopy(bArr, i6, this.f57272e, 0, i7);
                this.f57274g = i7;
            } else {
                this.f57282i.write(bArr, i6, i7);
            }
            this.f57275h += i7;
        }

        @Override // com.google.protobuf.CodedOutputStream, com.google.protobuf.ByteOutput
        public void write(ByteBuffer byteBuffer) {
            int remaining = byteBuffer.remaining();
            int i = this.f57273f;
            int i2 = this.f57274g;
            if (i - i2 >= remaining) {
                byteBuffer.get(this.f57272e, i2, remaining);
                this.f57274g += remaining;
                this.f57275h += remaining;
                return;
            }
            int i3 = i - i2;
            byteBuffer.get(this.f57272e, i2, i3);
            int i4 = remaining - i3;
            this.f57274g = this.f57273f;
            this.f57275h += i3;
            m36982w();
            while (true) {
                int i5 = this.f57273f;
                if (i4 > i5) {
                    byteBuffer.get(this.f57272e, 0, i5);
                    this.f57282i.write(this.f57272e, 0, this.f57273f);
                    int i6 = this.f57273f;
                    i4 -= i6;
                    this.f57275h += i6;
                } else {
                    byteBuffer.get(this.f57272e, 0, i4);
                    this.f57274g = i4;
                    this.f57275h += i4;
                    return;
                }
            }
        }
    }

    /* renamed from: com.google.protobuf.CodedOutputStream$f */
    /* loaded from: classes4.dex */
    public static final class C8839f extends CodedOutputStream {

        /* renamed from: e */
        public final ByteBuffer f57283e;

        /* renamed from: f */
        public final ByteBuffer f57284f;

        /* renamed from: g */
        public final int f57285g;

        public C8839f(ByteBuffer byteBuffer) {
            super();
            this.f57283e = byteBuffer;
            this.f57284f = byteBuffer.duplicate().order(ByteOrder.LITTLE_ENDIAN);
            this.f57285g = byteBuffer.position();
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void flush() {
            ByteBuffer byteBuffer = (ByteBuffer) this.f57283e.position(this.f57284f.position());
        }

        @Override // com.google.protobuf.CodedOutputStream
        public int getTotalBytesWritten() {
            return this.f57284f.position() - this.f57285g;
        }

        @Override // com.google.protobuf.CodedOutputStream
        /* renamed from: l */
        public void mo36977l(byte[] bArr, int i, int i2) {
            writeUInt32NoTag(i2);
            write(bArr, i, i2);
        }

        @Override // com.google.protobuf.CodedOutputStream
        /* renamed from: o */
        public void mo36976o(int i, MessageLite messageLite, InterfaceC8950t interfaceC8950t) {
            writeTag(i, 2);
            m36978q(messageLite, interfaceC8950t);
        }

        /* renamed from: p */
        public final void m36979p(String str) {
            try {
                Utf8.m35507j(str, this.f57284f);
            } catch (IndexOutOfBoundsException e) {
                throw new OutOfSpaceException(e);
            }
        }

        /* renamed from: q */
        public void m36978q(MessageLite messageLite, InterfaceC8950t interfaceC8950t) {
            writeUInt32NoTag(((AbstractMessageLite) messageLite).mo35829b(interfaceC8950t));
            interfaceC8950t.mo35107g(messageLite, this.f57270a);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public int spaceLeft() {
            return this.f57284f.remaining();
        }

        @Override // com.google.protobuf.CodedOutputStream, com.google.protobuf.ByteOutput
        public void write(byte b) {
            try {
                this.f57284f.put(b);
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
                this.f57284f.putInt(i);
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
                this.f57284f.putLong(j);
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
            int position = this.f57284f.position();
            try {
                int computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(str.length() * 3);
                int computeUInt32SizeNoTag2 = CodedOutputStream.computeUInt32SizeNoTag(str.length());
                if (computeUInt32SizeNoTag2 == computeUInt32SizeNoTag) {
                    int position2 = this.f57284f.position() + computeUInt32SizeNoTag2;
                    ByteBuffer byteBuffer = (ByteBuffer) this.f57284f.position(position2);
                    m36979p(str);
                    int position3 = this.f57284f.position();
                    ByteBuffer byteBuffer2 = (ByteBuffer) this.f57284f.position(position);
                    writeUInt32NoTag(position3 - position2);
                    ByteBuffer byteBuffer3 = (ByteBuffer) this.f57284f.position(position3);
                } else {
                    writeUInt32NoTag(Utf8.m35506k(str));
                    m36979p(str);
                }
            } catch (Utf8.UnpairedSurrogateException e) {
                ByteBuffer byteBuffer4 = (ByteBuffer) this.f57284f.position(position);
                m36995h(str, e);
            } catch (IllegalArgumentException e2) {
                throw new OutOfSpaceException(e2);
            }
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeTag(int i, int i2) {
            writeUInt32NoTag(WireFormat.m35416a(i, i2));
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
                    this.f57284f.put((byte) ((i & 127) | 128));
                    i >>>= 7;
                } catch (BufferOverflowException e) {
                    throw new OutOfSpaceException(e);
                }
            }
            this.f57284f.put((byte) i);
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
                    this.f57284f.put((byte) ((((int) j) & 127) | 128));
                    j >>>= 7;
                } catch (BufferOverflowException e) {
                    throw new OutOfSpaceException(e);
                }
            }
            this.f57284f.put((byte) j);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeByteArray(int i, byte[] bArr, int i2, int i3) {
            writeTag(i, 2);
            mo36977l(bArr, i2, i3);
        }

        @Override // com.google.protobuf.CodedOutputStream, com.google.protobuf.ByteOutput
        public void writeLazy(ByteBuffer byteBuffer) {
            write(byteBuffer);
        }

        @Override // com.google.protobuf.CodedOutputStream, com.google.protobuf.ByteOutput
        public void write(byte[] bArr, int i, int i2) {
            try {
                this.f57284f.put(bArr, i, i2);
            } catch (IndexOutOfBoundsException e) {
                throw new OutOfSpaceException(e);
            } catch (BufferOverflowException e2) {
                throw new OutOfSpaceException(e2);
            }
        }

        @Override // com.google.protobuf.CodedOutputStream, com.google.protobuf.ByteOutput
        public void write(ByteBuffer byteBuffer) {
            try {
                this.f57284f.put(byteBuffer);
            } catch (BufferOverflowException e) {
                throw new OutOfSpaceException(e);
            }
        }
    }

    /* renamed from: com.google.protobuf.CodedOutputStream$g */
    /* loaded from: classes4.dex */
    public static final class C8840g extends CodedOutputStream {

        /* renamed from: e */
        public final ByteBuffer f57286e;

        /* renamed from: f */
        public final ByteBuffer f57287f;

        /* renamed from: g */
        public final long f57288g;

        /* renamed from: h */
        public final long f57289h;

        /* renamed from: i */
        public final long f57290i;

        /* renamed from: j */
        public final long f57291j;

        /* renamed from: k */
        public long f57292k;

        public C8840g(ByteBuffer byteBuffer) {
            super();
            this.f57286e = byteBuffer;
            this.f57287f = byteBuffer.duplicate().order(ByteOrder.LITTLE_ENDIAN);
            long m22630k = AbstractC22358tZ1.m22630k(byteBuffer);
            this.f57288g = m22630k;
            long position = byteBuffer.position() + m22630k;
            this.f57289h = position;
            long limit = m22630k + byteBuffer.limit();
            this.f57290i = limit;
            this.f57291j = limit - 10;
            this.f57292k = position;
        }

        /* renamed from: q */
        public static boolean m36974q() {
            return AbstractC22358tZ1.m22657K();
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void flush() {
            ByteBuffer byteBuffer = (ByteBuffer) this.f57286e.position(m36975p(this.f57292k));
        }

        @Override // com.google.protobuf.CodedOutputStream
        public int getTotalBytesWritten() {
            return (int) (this.f57292k - this.f57289h);
        }

        @Override // com.google.protobuf.CodedOutputStream
        /* renamed from: l */
        public void mo36977l(byte[] bArr, int i, int i2) {
            writeUInt32NoTag(i2);
            write(bArr, i, i2);
        }

        @Override // com.google.protobuf.CodedOutputStream
        /* renamed from: o */
        public void mo36976o(int i, MessageLite messageLite, InterfaceC8950t interfaceC8950t) {
            writeTag(i, 2);
            m36972s(messageLite, interfaceC8950t);
        }

        /* renamed from: p */
        public final int m36975p(long j) {
            return (int) (j - this.f57288g);
        }

        /* renamed from: r */
        public final void m36973r(long j) {
            ByteBuffer byteBuffer = (ByteBuffer) this.f57287f.position(m36975p(j));
        }

        /* renamed from: s */
        public void m36972s(MessageLite messageLite, InterfaceC8950t interfaceC8950t) {
            writeUInt32NoTag(((AbstractMessageLite) messageLite).mo35829b(interfaceC8950t));
            interfaceC8950t.mo35107g(messageLite, this.f57270a);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public int spaceLeft() {
            return (int) (this.f57290i - this.f57292k);
        }

        @Override // com.google.protobuf.CodedOutputStream, com.google.protobuf.ByteOutput
        public void write(byte b) {
            long j = this.f57292k;
            if (j < this.f57290i) {
                this.f57292k = 1 + j;
                AbstractC22358tZ1.m22651Q(j, b);
                return;
            }
            throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Long.valueOf(this.f57292k), Long.valueOf(this.f57290i), 1));
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
            this.f57287f.putInt(m36975p(this.f57292k), i);
            this.f57292k += 4;
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeFixed64(int i, long j) {
            writeTag(i, 1);
            writeFixed64NoTag(j);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeFixed64NoTag(long j) {
            this.f57287f.putLong(m36975p(this.f57292k), j);
            this.f57292k += 8;
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
            long j = this.f57292k;
            try {
                int computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(str.length() * 3);
                int computeUInt32SizeNoTag2 = CodedOutputStream.computeUInt32SizeNoTag(str.length());
                if (computeUInt32SizeNoTag2 == computeUInt32SizeNoTag) {
                    int m36975p = m36975p(this.f57292k) + computeUInt32SizeNoTag2;
                    ByteBuffer byteBuffer = (ByteBuffer) this.f57287f.position(m36975p);
                    Utf8.m35507j(str, this.f57287f);
                    int position = this.f57287f.position() - m36975p;
                    writeUInt32NoTag(position);
                    this.f57292k += position;
                } else {
                    int m35506k = Utf8.m35506k(str);
                    writeUInt32NoTag(m35506k);
                    m36973r(this.f57292k);
                    Utf8.m35507j(str, this.f57287f);
                    this.f57292k += m35506k;
                }
            } catch (Utf8.UnpairedSurrogateException e) {
                this.f57292k = j;
                m36973r(j);
                m36995h(str, e);
            } catch (IllegalArgumentException e2) {
                throw new OutOfSpaceException(e2);
            } catch (IndexOutOfBoundsException e3) {
                throw new OutOfSpaceException(e3);
            }
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeTag(int i, int i2) {
            writeUInt32NoTag(WireFormat.m35416a(i, i2));
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeUInt32(int i, int i2) {
            writeTag(i, 0);
            writeUInt32NoTag(i2);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeUInt32NoTag(int i) {
            if (this.f57292k <= this.f57291j) {
                while ((i & (-128)) != 0) {
                    long j = this.f57292k;
                    this.f57292k = j + 1;
                    AbstractC22358tZ1.m22651Q(j, (byte) ((i & 127) | 128));
                    i >>>= 7;
                }
                long j2 = this.f57292k;
                this.f57292k = 1 + j2;
                AbstractC22358tZ1.m22651Q(j2, (byte) i);
                return;
            }
            while (true) {
                long j3 = this.f57292k;
                if (j3 < this.f57290i) {
                    if ((i & (-128)) == 0) {
                        this.f57292k = 1 + j3;
                        AbstractC22358tZ1.m22651Q(j3, (byte) i);
                        return;
                    }
                    this.f57292k = j3 + 1;
                    AbstractC22358tZ1.m22651Q(j3, (byte) ((i & 127) | 128));
                    i >>>= 7;
                } else {
                    throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Long.valueOf(this.f57292k), Long.valueOf(this.f57290i), 1));
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
            if (this.f57292k <= this.f57291j) {
                while ((j & (-128)) != 0) {
                    long j2 = this.f57292k;
                    this.f57292k = j2 + 1;
                    AbstractC22358tZ1.m22651Q(j2, (byte) ((((int) j) & 127) | 128));
                    j >>>= 7;
                }
                long j3 = this.f57292k;
                this.f57292k = 1 + j3;
                AbstractC22358tZ1.m22651Q(j3, (byte) j);
                return;
            }
            while (true) {
                long j4 = this.f57292k;
                if (j4 < this.f57290i) {
                    if ((j & (-128)) == 0) {
                        this.f57292k = 1 + j4;
                        AbstractC22358tZ1.m22651Q(j4, (byte) j);
                        return;
                    }
                    this.f57292k = j4 + 1;
                    AbstractC22358tZ1.m22651Q(j4, (byte) ((((int) j) & 127) | 128));
                    j >>>= 7;
                } else {
                    throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Long.valueOf(this.f57292k), Long.valueOf(this.f57290i), 1));
                }
            }
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeByteArray(int i, byte[] bArr, int i2, int i3) {
            writeTag(i, 2);
            mo36977l(bArr, i2, i3);
        }

        @Override // com.google.protobuf.CodedOutputStream, com.google.protobuf.ByteOutput
        public void writeLazy(ByteBuffer byteBuffer) {
            write(byteBuffer);
        }

        @Override // com.google.protobuf.CodedOutputStream, com.google.protobuf.ByteOutput
        public void write(byte[] bArr, int i, int i2) {
            if (bArr != null && i >= 0 && i2 >= 0 && bArr.length - i2 >= i) {
                long j = i2;
                long j2 = this.f57292k;
                if (this.f57290i - j >= j2) {
                    AbstractC22358tZ1.m22624q(bArr, i, j2, j);
                    this.f57292k += j;
                    return;
                }
            }
            if (bArr == null) {
                throw new NullPointerException("value");
            }
            throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Long.valueOf(this.f57292k), Long.valueOf(this.f57290i), Integer.valueOf(i2)));
        }

        @Override // com.google.protobuf.CodedOutputStream, com.google.protobuf.ByteOutput
        public void write(ByteBuffer byteBuffer) {
            try {
                int remaining = byteBuffer.remaining();
                m36973r(this.f57292k);
                this.f57287f.put(byteBuffer);
                this.f57292k += remaining;
            } catch (BufferOverflowException e) {
                throw new OutOfSpaceException(e);
            }
        }
    }

    /* renamed from: b */
    public static int m37001b(int i, MessageLite messageLite, InterfaceC8950t interfaceC8950t) {
        return (computeTagSize(i) * 2) + m37000c(messageLite, interfaceC8950t);
    }

    /* renamed from: c */
    public static int m37000c(MessageLite messageLite, InterfaceC8950t interfaceC8950t) {
        return ((AbstractMessageLite) messageLite).mo35829b(interfaceC8950t);
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
        return m36999d(bArr.length);
    }

    public static int computeByteBufferSize(int i, ByteBuffer byteBuffer) {
        return computeTagSize(i) + computeByteBufferSizeNoTag(byteBuffer);
    }

    public static int computeByteBufferSizeNoTag(ByteBuffer byteBuffer) {
        return m36999d(byteBuffer.capacity());
    }

    public static int computeBytesSize(int i, ByteString byteString) {
        return computeTagSize(i) + computeBytesSizeNoTag(byteString);
    }

    public static int computeBytesSizeNoTag(ByteString byteString) {
        return m36999d(byteString.size());
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
        return m36999d(lazyFieldLite.getSerializedSize());
    }

    public static int computeMessageSetExtensionSize(int i, MessageLite messageLite) {
        return (computeTagSize(1) * 2) + computeUInt32Size(2, i) + computeMessageSize(3, messageLite);
    }

    public static int computeMessageSize(int i, MessageLite messageLite) {
        return computeTagSize(i) + computeMessageSizeNoTag(messageLite);
    }

    public static int computeMessageSizeNoTag(MessageLite messageLite) {
        return m36999d(messageLite.getSerializedSize());
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
            length = Utf8.m35506k(str);
        } catch (Utf8.UnpairedSurrogateException unused) {
            length = str.getBytes(Internal.f57370b).length;
        }
        return m36999d(length);
    }

    public static int computeTagSize(int i) {
        return computeUInt32SizeNoTag(WireFormat.m35416a(i, 0));
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
    public static int m36999d(int i) {
        return computeUInt32SizeNoTag(i) + i;
    }

    /* renamed from: e */
    public static int m36998e(int i, MessageLite messageLite, InterfaceC8950t interfaceC8950t) {
        return computeTagSize(i) + m36997f(messageLite, interfaceC8950t);
    }

    public static int encodeZigZag32(int i) {
        return (i >> 31) ^ (i << 1);
    }

    public static long encodeZigZag64(long j) {
        return (j >> 63) ^ (j << 1);
    }

    /* renamed from: f */
    public static int m36997f(MessageLite messageLite, InterfaceC8950t interfaceC8950t) {
        return m36999d(((AbstractMessageLite) messageLite).mo35829b(interfaceC8950t));
    }

    /* renamed from: g */
    public static int m36996g(int i) {
        if (i > 4096) {
            return 4096;
        }
        return i;
    }

    /* renamed from: j */
    public static CodedOutputStream m36993j(ByteBuffer byteBuffer) {
        return new C8839f(byteBuffer);
    }

    /* renamed from: k */
    public static CodedOutputStream m36992k(ByteBuffer byteBuffer) {
        return new C8840g(byteBuffer);
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
    public final void m36995h(String str, Utf8.UnpairedSurrogateException unpairedSurrogateException) {
        f57268c.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) unpairedSurrogateException);
        byte[] bytes = str.getBytes(Internal.f57370b);
        try {
            writeUInt32NoTag(bytes.length);
            writeLazy(bytes, 0, bytes.length);
        } catch (IndexOutOfBoundsException e) {
            throw new OutOfSpaceException(e);
        }
    }

    /* renamed from: i */
    public boolean m36994i() {
        return this.f57271b;
    }

    /* renamed from: l */
    public abstract void mo36977l(byte[] bArr, int i, int i2);

    /* renamed from: m */
    public final void m36991m(int i, MessageLite messageLite, InterfaceC8950t interfaceC8950t) {
        writeTag(i, 3);
        m36990n(messageLite, interfaceC8950t);
        writeTag(i, 4);
    }

    /* renamed from: n */
    public final void m36990n(MessageLite messageLite, InterfaceC8950t interfaceC8950t) {
        interfaceC8950t.mo35107g(messageLite, this.f57270a);
    }

    /* renamed from: o */
    public abstract void mo36976o(int i, MessageLite messageLite, InterfaceC8950t interfaceC8950t);

    public abstract int spaceLeft();

    public void useDeterministicSerialization() {
        this.f57271b = true;
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
        mo36977l(bArr, 0, bArr.length);
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
        return new C8838e(outputStream, i);
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
        return new C8836c(bArr, i, i2);
    }

    public static CodedOutputStream newInstance(ByteBuffer byteBuffer) {
        if (byteBuffer.hasArray()) {
            return new C8837d(byteBuffer);
        }
        if (byteBuffer.isDirect() && !byteBuffer.isReadOnly()) {
            if (C8840g.m36974q()) {
                return m36992k(byteBuffer);
            }
            return m36993j(byteBuffer);
        }
        throw new IllegalArgumentException("ByteBuffer is read-only");
    }

    @Deprecated
    public static CodedOutputStream newInstance(ByteBuffer byteBuffer, int i) {
        return newInstance(byteBuffer);
    }
}