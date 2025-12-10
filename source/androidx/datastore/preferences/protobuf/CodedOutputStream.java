package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.Utf8;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes2.dex */
public abstract class CodedOutputStream extends ByteOutput {
    public static final int DEFAULT_BUFFER_SIZE = 4096;
    @Deprecated
    public static final int LITTLE_ENDIAN_32_SIZE = 4;

    /* renamed from: c */
    public static final Logger f34723c = Logger.getLogger(CodedOutputStream.class.getName());

    /* renamed from: d */
    public static final boolean f34724d = AbstractC22978xY1.m491H();

    /* renamed from: a */
    public C4432f f34725a;

    /* renamed from: b */
    public boolean f34726b;

    /* loaded from: classes2.dex */
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

    /* renamed from: androidx.datastore.preferences.protobuf.CodedOutputStream$b */
    /* loaded from: classes2.dex */
    public static abstract class AbstractC4349b extends CodedOutputStream {

        /* renamed from: e */
        public final byte[] f34727e;

        /* renamed from: f */
        public final int f34728f;

        /* renamed from: g */
        public int f34729g;

        /* renamed from: h */
        public int f34730h;

        public AbstractC4349b(int i) {
            super();
            if (i >= 0) {
                byte[] bArr = new byte[Math.max(i, 20)];
                this.f34727e = bArr;
                this.f34728f = bArr.length;
                return;
            }
            throw new IllegalArgumentException("bufferSize must be >= 0");
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final int getTotalBytesWritten() {
            return this.f34730h;
        }

        /* renamed from: p */
        public final void m56040p(byte b) {
            byte[] bArr = this.f34727e;
            int i = this.f34729g;
            this.f34729g = i + 1;
            bArr[i] = b;
            this.f34730h++;
        }

        /* renamed from: q */
        public final void m56039q(int i) {
            byte[] bArr = this.f34727e;
            int i2 = this.f34729g;
            int i3 = i2 + 1;
            this.f34729g = i3;
            bArr[i2] = (byte) (i & 255);
            int i4 = i2 + 2;
            this.f34729g = i4;
            bArr[i3] = (byte) ((i >> 8) & 255);
            int i5 = i2 + 3;
            this.f34729g = i5;
            bArr[i4] = (byte) ((i >> 16) & 255);
            this.f34729g = i2 + 4;
            bArr[i5] = (byte) ((i >> 24) & 255);
            this.f34730h += 4;
        }

        /* renamed from: r */
        public final void m56038r(long j) {
            byte[] bArr = this.f34727e;
            int i = this.f34729g;
            int i2 = i + 1;
            this.f34729g = i2;
            bArr[i] = (byte) (j & 255);
            int i3 = i + 2;
            this.f34729g = i3;
            bArr[i2] = (byte) ((j >> 8) & 255);
            int i4 = i + 3;
            this.f34729g = i4;
            bArr[i3] = (byte) ((j >> 16) & 255);
            int i5 = i + 4;
            this.f34729g = i5;
            bArr[i4] = (byte) (255 & (j >> 24));
            int i6 = i + 5;
            this.f34729g = i6;
            bArr[i5] = (byte) (((int) (j >> 32)) & 255);
            int i7 = i + 6;
            this.f34729g = i7;
            bArr[i6] = (byte) (((int) (j >> 40)) & 255);
            int i8 = i + 7;
            this.f34729g = i8;
            bArr[i7] = (byte) (((int) (j >> 48)) & 255);
            this.f34729g = i + 8;
            bArr[i8] = (byte) (((int) (j >> 56)) & 255);
            this.f34730h += 8;
        }

        /* renamed from: s */
        public final void m56037s(int i) {
            if (i >= 0) {
                m56035u(i);
            } else {
                m56034v(i);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final int spaceLeft() {
            throw new UnsupportedOperationException("spaceLeft() can only be called on CodedOutputStreams that are writing to a flat array or ByteBuffer.");
        }

        /* renamed from: t */
        public final void m56036t(int i, int i2) {
            m56035u(WireFormat.m55338a(i, i2));
        }

        /* renamed from: u */
        public final void m56035u(int i) {
            if (CodedOutputStream.f34724d) {
                long j = this.f34729g;
                while ((i & (-128)) != 0) {
                    byte[] bArr = this.f34727e;
                    int i2 = this.f34729g;
                    this.f34729g = i2 + 1;
                    AbstractC22978xY1.m484O(bArr, i2, (byte) ((i & 127) | 128));
                    i >>>= 7;
                }
                byte[] bArr2 = this.f34727e;
                int i3 = this.f34729g;
                this.f34729g = i3 + 1;
                AbstractC22978xY1.m484O(bArr2, i3, (byte) i);
                this.f34730h += (int) (this.f34729g - j);
                return;
            }
            while ((i & (-128)) != 0) {
                byte[] bArr3 = this.f34727e;
                int i4 = this.f34729g;
                this.f34729g = i4 + 1;
                bArr3[i4] = (byte) ((i & 127) | 128);
                this.f34730h++;
                i >>>= 7;
            }
            byte[] bArr4 = this.f34727e;
            int i5 = this.f34729g;
            this.f34729g = i5 + 1;
            bArr4[i5] = (byte) i;
            this.f34730h++;
        }

        /* renamed from: v */
        public final void m56034v(long j) {
            if (CodedOutputStream.f34724d) {
                long j2 = this.f34729g;
                while ((j & (-128)) != 0) {
                    byte[] bArr = this.f34727e;
                    int i = this.f34729g;
                    this.f34729g = i + 1;
                    AbstractC22978xY1.m484O(bArr, i, (byte) ((((int) j) & 127) | 128));
                    j >>>= 7;
                }
                byte[] bArr2 = this.f34727e;
                int i2 = this.f34729g;
                this.f34729g = i2 + 1;
                AbstractC22978xY1.m484O(bArr2, i2, (byte) j);
                this.f34730h += (int) (this.f34729g - j2);
                return;
            }
            while ((j & (-128)) != 0) {
                byte[] bArr3 = this.f34727e;
                int i3 = this.f34729g;
                this.f34729g = i3 + 1;
                bArr3[i3] = (byte) ((((int) j) & 127) | 128);
                this.f34730h++;
                j >>>= 7;
            }
            byte[] bArr4 = this.f34727e;
            int i4 = this.f34729g;
            this.f34729g = i4 + 1;
            bArr4[i4] = (byte) j;
            this.f34730h++;
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.CodedOutputStream$c */
    /* loaded from: classes2.dex */
    public static class C4350c extends CodedOutputStream {

        /* renamed from: e */
        public final byte[] f34731e;

        /* renamed from: f */
        public final int f34732f;

        /* renamed from: g */
        public final int f34733g;

        /* renamed from: h */
        public int f34734h;

        public C4350c(byte[] bArr, int i, int i2) {
            super();
            if (bArr != null) {
                int i3 = i + i2;
                if ((i | i2 | (bArr.length - i3)) >= 0) {
                    this.f34731e = bArr;
                    this.f34732f = i;
                    this.f34734h = i;
                    this.f34733g = i3;
                    return;
                }
                throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i2)));
            }
            throw new NullPointerException("buffer");
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void flush() {
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final int getTotalBytesWritten() {
            return this.f34734h - this.f34732f;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        /* renamed from: l */
        public final void mo56028l(byte[] bArr, int i, int i2) {
            writeUInt32NoTag(i2);
            write(bArr, i, i2);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        /* renamed from: o */
        public final void mo56027o(int i, MessageLite messageLite, InterfaceC4454v interfaceC4454v) {
            writeTag(i, 2);
            writeUInt32NoTag(((AbstractMessageLite) messageLite).m56213b(interfaceC4454v));
            interfaceC4454v.mo55016g(messageLite, this.f34725a);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final int spaceLeft() {
            return this.f34733g - this.f34734h;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream, androidx.datastore.preferences.protobuf.ByteOutput
        public final void write(byte b) {
            try {
                byte[] bArr = this.f34731e;
                int i = this.f34734h;
                this.f34734h = i + 1;
                bArr[i] = b;
            } catch (IndexOutOfBoundsException e) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f34734h), Integer.valueOf(this.f34733g), 1), e);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeBool(int i, boolean z) {
            writeTag(i, 0);
            write(z ? (byte) 1 : (byte) 0);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeByteArray(int i, byte[] bArr) {
            writeByteArray(i, bArr, 0, bArr.length);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeByteBuffer(int i, ByteBuffer byteBuffer) {
            writeTag(i, 2);
            writeUInt32NoTag(byteBuffer.capacity());
            writeRawBytes(byteBuffer);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeBytes(int i, ByteString byteString) {
            writeTag(i, 2);
            writeBytesNoTag(byteString);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeBytesNoTag(ByteString byteString) {
            writeUInt32NoTag(byteString.size());
            byteString.writeTo(this);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeFixed32(int i, int i2) {
            writeTag(i, 5);
            writeFixed32NoTag(i2);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeFixed32NoTag(int i) {
            try {
                byte[] bArr = this.f34731e;
                int i2 = this.f34734h;
                int i3 = i2 + 1;
                this.f34734h = i3;
                bArr[i2] = (byte) (i & 255);
                int i4 = i2 + 2;
                this.f34734h = i4;
                bArr[i3] = (byte) ((i >> 8) & 255);
                int i5 = i2 + 3;
                this.f34734h = i5;
                bArr[i4] = (byte) ((i >> 16) & 255);
                this.f34734h = i2 + 4;
                bArr[i5] = (byte) ((i >> 24) & 255);
            } catch (IndexOutOfBoundsException e) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f34734h), Integer.valueOf(this.f34733g), 1), e);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeFixed64(int i, long j) {
            writeTag(i, 1);
            writeFixed64NoTag(j);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeFixed64NoTag(long j) {
            try {
                byte[] bArr = this.f34731e;
                int i = this.f34734h;
                int i2 = i + 1;
                this.f34734h = i2;
                bArr[i] = (byte) (((int) j) & 255);
                int i3 = i + 2;
                this.f34734h = i3;
                bArr[i2] = (byte) (((int) (j >> 8)) & 255);
                int i4 = i + 3;
                this.f34734h = i4;
                bArr[i3] = (byte) (((int) (j >> 16)) & 255);
                int i5 = i + 4;
                this.f34734h = i5;
                bArr[i4] = (byte) (((int) (j >> 24)) & 255);
                int i6 = i + 5;
                this.f34734h = i6;
                bArr[i5] = (byte) (((int) (j >> 32)) & 255);
                int i7 = i + 6;
                this.f34734h = i7;
                bArr[i6] = (byte) (((int) (j >> 40)) & 255);
                int i8 = i + 7;
                this.f34734h = i8;
                bArr[i7] = (byte) (((int) (j >> 48)) & 255);
                this.f34734h = i + 8;
                bArr[i8] = (byte) (((int) (j >> 56)) & 255);
            } catch (IndexOutOfBoundsException e) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f34734h), Integer.valueOf(this.f34733g), 1), e);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeInt32(int i, int i2) {
            writeTag(i, 0);
            writeInt32NoTag(i2);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeInt32NoTag(int i) {
            if (i >= 0) {
                writeUInt32NoTag(i);
            } else {
                writeUInt64NoTag(i);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream, androidx.datastore.preferences.protobuf.ByteOutput
        public final void writeLazy(byte[] bArr, int i, int i2) {
            write(bArr, i, i2);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeMessage(int i, MessageLite messageLite) {
            writeTag(i, 2);
            writeMessageNoTag(messageLite);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeMessageNoTag(MessageLite messageLite) {
            writeUInt32NoTag(messageLite.getSerializedSize());
            messageLite.writeTo(this);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeMessageSetExtension(int i, MessageLite messageLite) {
            writeTag(1, 3);
            writeUInt32(2, i);
            writeMessage(3, messageLite);
            writeTag(1, 4);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeRawBytes(ByteBuffer byteBuffer) {
            if (byteBuffer.hasArray()) {
                write(byteBuffer.array(), byteBuffer.arrayOffset(), byteBuffer.capacity());
                return;
            }
            ByteBuffer duplicate = byteBuffer.duplicate();
            duplicate.clear();
            write(duplicate);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeRawMessageSetExtension(int i, ByteString byteString) {
            writeTag(1, 3);
            writeUInt32(2, i);
            writeBytes(3, byteString);
            writeTag(1, 4);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeString(int i, String str) {
            writeTag(i, 2);
            writeStringNoTag(str);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeStringNoTag(String str) {
            int i = this.f34734h;
            try {
                int computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(str.length() * 3);
                int computeUInt32SizeNoTag2 = CodedOutputStream.computeUInt32SizeNoTag(str.length());
                if (computeUInt32SizeNoTag2 == computeUInt32SizeNoTag) {
                    int i2 = i + computeUInt32SizeNoTag2;
                    this.f34734h = i2;
                    int m55434i = Utf8.m55434i(str, this.f34731e, i2, spaceLeft());
                    this.f34734h = i;
                    writeUInt32NoTag((m55434i - i) - computeUInt32SizeNoTag2);
                    this.f34734h = m55434i;
                } else {
                    writeUInt32NoTag(Utf8.m55432k(str));
                    this.f34734h = Utf8.m55434i(str, this.f34731e, this.f34734h, spaceLeft());
                }
            } catch (Utf8.UnpairedSurrogateException e) {
                this.f34734h = i;
                m56046h(str, e);
            } catch (IndexOutOfBoundsException e2) {
                throw new OutOfSpaceException(e2);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeTag(int i, int i2) {
            writeUInt32NoTag(WireFormat.m55338a(i, i2));
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeUInt32(int i, int i2) {
            writeTag(i, 0);
            writeUInt32NoTag(i2);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeUInt32NoTag(int i) {
            if (CodedOutputStream.f34724d && !AbstractC1582W2.m65705c() && spaceLeft() >= 5) {
                if ((i & (-128)) == 0) {
                    byte[] bArr = this.f34731e;
                    int i2 = this.f34734h;
                    this.f34734h = 1 + i2;
                    AbstractC22978xY1.m484O(bArr, i2, (byte) i);
                    return;
                }
                byte[] bArr2 = this.f34731e;
                int i3 = this.f34734h;
                this.f34734h = i3 + 1;
                AbstractC22978xY1.m484O(bArr2, i3, (byte) (i | 128));
                int i4 = i >>> 7;
                if ((i4 & (-128)) == 0) {
                    byte[] bArr3 = this.f34731e;
                    int i5 = this.f34734h;
                    this.f34734h = 1 + i5;
                    AbstractC22978xY1.m484O(bArr3, i5, (byte) i4);
                    return;
                }
                byte[] bArr4 = this.f34731e;
                int i6 = this.f34734h;
                this.f34734h = i6 + 1;
                AbstractC22978xY1.m484O(bArr4, i6, (byte) (i4 | 128));
                int i7 = i >>> 14;
                if ((i7 & (-128)) == 0) {
                    byte[] bArr5 = this.f34731e;
                    int i8 = this.f34734h;
                    this.f34734h = 1 + i8;
                    AbstractC22978xY1.m484O(bArr5, i8, (byte) i7);
                    return;
                }
                byte[] bArr6 = this.f34731e;
                int i9 = this.f34734h;
                this.f34734h = i9 + 1;
                AbstractC22978xY1.m484O(bArr6, i9, (byte) (i7 | 128));
                int i10 = i >>> 21;
                if ((i10 & (-128)) == 0) {
                    byte[] bArr7 = this.f34731e;
                    int i11 = this.f34734h;
                    this.f34734h = 1 + i11;
                    AbstractC22978xY1.m484O(bArr7, i11, (byte) i10);
                    return;
                }
                byte[] bArr8 = this.f34731e;
                int i12 = this.f34734h;
                this.f34734h = i12 + 1;
                AbstractC22978xY1.m484O(bArr8, i12, (byte) (i10 | 128));
                byte[] bArr9 = this.f34731e;
                int i13 = this.f34734h;
                this.f34734h = 1 + i13;
                AbstractC22978xY1.m484O(bArr9, i13, (byte) (i >>> 28));
                return;
            }
            while ((i & (-128)) != 0) {
                try {
                    byte[] bArr10 = this.f34731e;
                    int i14 = this.f34734h;
                    this.f34734h = i14 + 1;
                    bArr10[i14] = (byte) ((i & 127) | 128);
                    i >>>= 7;
                } catch (IndexOutOfBoundsException e) {
                    throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f34734h), Integer.valueOf(this.f34733g), 1), e);
                }
            }
            byte[] bArr11 = this.f34731e;
            int i15 = this.f34734h;
            this.f34734h = i15 + 1;
            bArr11[i15] = (byte) i;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeUInt64(int i, long j) {
            writeTag(i, 0);
            writeUInt64NoTag(j);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeUInt64NoTag(long j) {
            if (CodedOutputStream.f34724d && spaceLeft() >= 10) {
                while ((j & (-128)) != 0) {
                    byte[] bArr = this.f34731e;
                    int i = this.f34734h;
                    this.f34734h = i + 1;
                    AbstractC22978xY1.m484O(bArr, i, (byte) ((((int) j) & 127) | 128));
                    j >>>= 7;
                }
                byte[] bArr2 = this.f34731e;
                int i2 = this.f34734h;
                this.f34734h = 1 + i2;
                AbstractC22978xY1.m484O(bArr2, i2, (byte) j);
                return;
            }
            while ((j & (-128)) != 0) {
                try {
                    byte[] bArr3 = this.f34731e;
                    int i3 = this.f34734h;
                    this.f34734h = i3 + 1;
                    bArr3[i3] = (byte) ((((int) j) & 127) | 128);
                    j >>>= 7;
                } catch (IndexOutOfBoundsException e) {
                    throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f34734h), Integer.valueOf(this.f34733g), 1), e);
                }
            }
            byte[] bArr4 = this.f34731e;
            int i4 = this.f34734h;
            this.f34734h = i4 + 1;
            bArr4[i4] = (byte) j;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeByteArray(int i, byte[] bArr, int i2, int i3) {
            writeTag(i, 2);
            mo56028l(bArr, i2, i3);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream, androidx.datastore.preferences.protobuf.ByteOutput
        public final void writeLazy(ByteBuffer byteBuffer) {
            write(byteBuffer);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream, androidx.datastore.preferences.protobuf.ByteOutput
        public final void write(byte[] bArr, int i, int i2) {
            try {
                System.arraycopy(bArr, i, this.f34731e, this.f34734h, i2);
                this.f34734h += i2;
            } catch (IndexOutOfBoundsException e) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f34734h), Integer.valueOf(this.f34733g), Integer.valueOf(i2)), e);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream, androidx.datastore.preferences.protobuf.ByteOutput
        public final void write(ByteBuffer byteBuffer) {
            int remaining = byteBuffer.remaining();
            try {
                byteBuffer.get(this.f34731e, this.f34734h, remaining);
                this.f34734h += remaining;
            } catch (IndexOutOfBoundsException e) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f34734h), Integer.valueOf(this.f34733g), Integer.valueOf(remaining)), e);
            }
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.CodedOutputStream$d */
    /* loaded from: classes2.dex */
    public static final class C4351d extends C4350c {

        /* renamed from: i */
        public final ByteBuffer f34735i;

        /* renamed from: j */
        public int f34736j;

        public C4351d(ByteBuffer byteBuffer) {
            super(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining());
            this.f34735i = byteBuffer;
            this.f34736j = byteBuffer.position();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream.C4350c, androidx.datastore.preferences.protobuf.CodedOutputStream
        public void flush() {
            this.f34735i.position(this.f34736j + getTotalBytesWritten());
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.CodedOutputStream$e */
    /* loaded from: classes2.dex */
    public static final class C4352e extends AbstractC4349b {

        /* renamed from: i */
        public final OutputStream f34737i;

        public C4352e(OutputStream outputStream, int i) {
            super(i);
            if (outputStream != null) {
                this.f34737i = outputStream;
                return;
            }
            throw new NullPointerException("out");
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void flush() {
            if (this.f34729g > 0) {
                m56033w();
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        /* renamed from: l */
        public void mo56028l(byte[] bArr, int i, int i2) {
            writeUInt32NoTag(i2);
            write(bArr, i, i2);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        /* renamed from: o */
        public void mo56027o(int i, MessageLite messageLite, InterfaceC4454v interfaceC4454v) {
            writeTag(i, 2);
            m56031y(messageLite, interfaceC4454v);
        }

        /* renamed from: w */
        public final void m56033w() {
            this.f34737i.write(this.f34727e, 0, this.f34729g);
            this.f34729g = 0;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream, androidx.datastore.preferences.protobuf.ByteOutput
        public void write(byte b) {
            if (this.f34729g == this.f34728f) {
                m56033w();
            }
            m56040p(b);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeBool(int i, boolean z) {
            m56032x(11);
            m56036t(i, 0);
            m56040p(z ? (byte) 1 : (byte) 0);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeByteArray(int i, byte[] bArr) {
            writeByteArray(i, bArr, 0, bArr.length);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeByteBuffer(int i, ByteBuffer byteBuffer) {
            writeTag(i, 2);
            writeUInt32NoTag(byteBuffer.capacity());
            writeRawBytes(byteBuffer);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeBytes(int i, ByteString byteString) {
            writeTag(i, 2);
            writeBytesNoTag(byteString);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeBytesNoTag(ByteString byteString) {
            writeUInt32NoTag(byteString.size());
            byteString.writeTo(this);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeFixed32(int i, int i2) {
            m56032x(14);
            m56036t(i, 5);
            m56039q(i2);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeFixed32NoTag(int i) {
            m56032x(4);
            m56039q(i);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeFixed64(int i, long j) {
            m56032x(18);
            m56036t(i, 1);
            m56038r(j);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeFixed64NoTag(long j) {
            m56032x(8);
            m56038r(j);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeInt32(int i, int i2) {
            m56032x(20);
            m56036t(i, 0);
            m56037s(i2);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeInt32NoTag(int i) {
            if (i >= 0) {
                writeUInt32NoTag(i);
            } else {
                writeUInt64NoTag(i);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream, androidx.datastore.preferences.protobuf.ByteOutput
        public void writeLazy(byte[] bArr, int i, int i2) {
            write(bArr, i, i2);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeMessage(int i, MessageLite messageLite) {
            writeTag(i, 2);
            writeMessageNoTag(messageLite);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeMessageNoTag(MessageLite messageLite) {
            writeUInt32NoTag(messageLite.getSerializedSize());
            messageLite.writeTo(this);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeMessageSetExtension(int i, MessageLite messageLite) {
            writeTag(1, 3);
            writeUInt32(2, i);
            writeMessage(3, messageLite);
            writeTag(1, 4);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeRawBytes(ByteBuffer byteBuffer) {
            if (byteBuffer.hasArray()) {
                write(byteBuffer.array(), byteBuffer.arrayOffset(), byteBuffer.capacity());
                return;
            }
            ByteBuffer duplicate = byteBuffer.duplicate();
            duplicate.clear();
            write(duplicate);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeRawMessageSetExtension(int i, ByteString byteString) {
            writeTag(1, 3);
            writeUInt32(2, i);
            writeBytes(3, byteString);
            writeTag(1, 4);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeString(int i, String str) {
            writeTag(i, 2);
            writeStringNoTag(str);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeStringNoTag(String str) {
            int m55432k;
            try {
                int length = str.length() * 3;
                int computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(length);
                int i = computeUInt32SizeNoTag + length;
                int i2 = this.f34728f;
                if (i > i2) {
                    byte[] bArr = new byte[length];
                    int m55434i = Utf8.m55434i(str, bArr, 0, length);
                    writeUInt32NoTag(m55434i);
                    writeLazy(bArr, 0, m55434i);
                    return;
                }
                if (i > i2 - this.f34729g) {
                    m56033w();
                }
                int computeUInt32SizeNoTag2 = CodedOutputStream.computeUInt32SizeNoTag(str.length());
                int i3 = this.f34729g;
                try {
                    if (computeUInt32SizeNoTag2 == computeUInt32SizeNoTag) {
                        int i4 = i3 + computeUInt32SizeNoTag2;
                        this.f34729g = i4;
                        int m55434i2 = Utf8.m55434i(str, this.f34727e, i4, this.f34728f - i4);
                        this.f34729g = i3;
                        m55432k = (m55434i2 - i3) - computeUInt32SizeNoTag2;
                        m56035u(m55432k);
                        this.f34729g = m55434i2;
                    } else {
                        m55432k = Utf8.m55432k(str);
                        m56035u(m55432k);
                        this.f34729g = Utf8.m55434i(str, this.f34727e, this.f34729g, m55432k);
                    }
                    this.f34730h += m55432k;
                } catch (Utf8.UnpairedSurrogateException e) {
                    this.f34730h -= this.f34729g - i3;
                    this.f34729g = i3;
                    throw e;
                } catch (ArrayIndexOutOfBoundsException e2) {
                    throw new OutOfSpaceException(e2);
                }
            } catch (Utf8.UnpairedSurrogateException e3) {
                m56046h(str, e3);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeTag(int i, int i2) {
            writeUInt32NoTag(WireFormat.m55338a(i, i2));
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeUInt32(int i, int i2) {
            m56032x(20);
            m56036t(i, 0);
            m56035u(i2);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeUInt32NoTag(int i) {
            m56032x(5);
            m56035u(i);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeUInt64(int i, long j) {
            m56032x(20);
            m56036t(i, 0);
            m56034v(j);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeUInt64NoTag(long j) {
            m56032x(10);
            m56034v(j);
        }

        /* renamed from: x */
        public final void m56032x(int i) {
            if (this.f34728f - this.f34729g < i) {
                m56033w();
            }
        }

        /* renamed from: y */
        public void m56031y(MessageLite messageLite, InterfaceC4454v interfaceC4454v) {
            writeUInt32NoTag(((AbstractMessageLite) messageLite).m56213b(interfaceC4454v));
            interfaceC4454v.mo55016g(messageLite, this.f34725a);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeByteArray(int i, byte[] bArr, int i2, int i3) {
            writeTag(i, 2);
            mo56028l(bArr, i2, i3);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream, androidx.datastore.preferences.protobuf.ByteOutput
        public void writeLazy(ByteBuffer byteBuffer) {
            write(byteBuffer);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream, androidx.datastore.preferences.protobuf.ByteOutput
        public void write(byte[] bArr, int i, int i2) {
            int i3 = this.f34728f;
            int i4 = this.f34729g;
            if (i3 - i4 >= i2) {
                System.arraycopy(bArr, i, this.f34727e, i4, i2);
                this.f34729g += i2;
                this.f34730h += i2;
                return;
            }
            int i5 = i3 - i4;
            System.arraycopy(bArr, i, this.f34727e, i4, i5);
            int i6 = i + i5;
            int i7 = i2 - i5;
            this.f34729g = this.f34728f;
            this.f34730h += i5;
            m56033w();
            if (i7 <= this.f34728f) {
                System.arraycopy(bArr, i6, this.f34727e, 0, i7);
                this.f34729g = i7;
            } else {
                this.f34737i.write(bArr, i6, i7);
            }
            this.f34730h += i7;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream, androidx.datastore.preferences.protobuf.ByteOutput
        public void write(ByteBuffer byteBuffer) {
            int remaining = byteBuffer.remaining();
            int i = this.f34728f;
            int i2 = this.f34729g;
            if (i - i2 >= remaining) {
                byteBuffer.get(this.f34727e, i2, remaining);
                this.f34729g += remaining;
                this.f34730h += remaining;
                return;
            }
            int i3 = i - i2;
            byteBuffer.get(this.f34727e, i2, i3);
            int i4 = remaining - i3;
            this.f34729g = this.f34728f;
            this.f34730h += i3;
            m56033w();
            while (true) {
                int i5 = this.f34728f;
                if (i4 > i5) {
                    byteBuffer.get(this.f34727e, 0, i5);
                    this.f34737i.write(this.f34727e, 0, this.f34728f);
                    int i6 = this.f34728f;
                    i4 -= i6;
                    this.f34730h += i6;
                } else {
                    byteBuffer.get(this.f34727e, 0, i4);
                    this.f34729g = i4;
                    this.f34730h += i4;
                    return;
                }
            }
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.CodedOutputStream$f */
    /* loaded from: classes2.dex */
    public static final class C4353f extends CodedOutputStream {

        /* renamed from: e */
        public final ByteBuffer f34738e;

        /* renamed from: f */
        public final ByteBuffer f34739f;

        /* renamed from: g */
        public final int f34740g;

        public C4353f(ByteBuffer byteBuffer) {
            super();
            this.f34738e = byteBuffer;
            this.f34739f = byteBuffer.duplicate().order(ByteOrder.LITTLE_ENDIAN);
            this.f34740g = byteBuffer.position();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void flush() {
            this.f34738e.position(this.f34739f.position());
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public int getTotalBytesWritten() {
            return this.f34739f.position() - this.f34740g;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        /* renamed from: l */
        public void mo56028l(byte[] bArr, int i, int i2) {
            writeUInt32NoTag(i2);
            write(bArr, i, i2);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        /* renamed from: o */
        public void mo56027o(int i, MessageLite messageLite, InterfaceC4454v interfaceC4454v) {
            writeTag(i, 2);
            m56029q(messageLite, interfaceC4454v);
        }

        /* renamed from: p */
        public final void m56030p(String str) {
            try {
                Utf8.m55433j(str, this.f34739f);
            } catch (IndexOutOfBoundsException e) {
                throw new OutOfSpaceException(e);
            }
        }

        /* renamed from: q */
        public void m56029q(MessageLite messageLite, InterfaceC4454v interfaceC4454v) {
            writeUInt32NoTag(((AbstractMessageLite) messageLite).m56213b(interfaceC4454v));
            interfaceC4454v.mo55016g(messageLite, this.f34725a);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public int spaceLeft() {
            return this.f34739f.remaining();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream, androidx.datastore.preferences.protobuf.ByteOutput
        public void write(byte b) {
            try {
                this.f34739f.put(b);
            } catch (BufferOverflowException e) {
                throw new OutOfSpaceException(e);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeBool(int i, boolean z) {
            writeTag(i, 0);
            write(z ? (byte) 1 : (byte) 0);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeByteArray(int i, byte[] bArr) {
            writeByteArray(i, bArr, 0, bArr.length);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeByteBuffer(int i, ByteBuffer byteBuffer) {
            writeTag(i, 2);
            writeUInt32NoTag(byteBuffer.capacity());
            writeRawBytes(byteBuffer);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeBytes(int i, ByteString byteString) {
            writeTag(i, 2);
            writeBytesNoTag(byteString);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeBytesNoTag(ByteString byteString) {
            writeUInt32NoTag(byteString.size());
            byteString.writeTo(this);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeFixed32(int i, int i2) {
            writeTag(i, 5);
            writeFixed32NoTag(i2);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeFixed32NoTag(int i) {
            try {
                this.f34739f.putInt(i);
            } catch (BufferOverflowException e) {
                throw new OutOfSpaceException(e);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeFixed64(int i, long j) {
            writeTag(i, 1);
            writeFixed64NoTag(j);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeFixed64NoTag(long j) {
            try {
                this.f34739f.putLong(j);
            } catch (BufferOverflowException e) {
                throw new OutOfSpaceException(e);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeInt32(int i, int i2) {
            writeTag(i, 0);
            writeInt32NoTag(i2);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeInt32NoTag(int i) {
            if (i >= 0) {
                writeUInt32NoTag(i);
            } else {
                writeUInt64NoTag(i);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream, androidx.datastore.preferences.protobuf.ByteOutput
        public void writeLazy(byte[] bArr, int i, int i2) {
            write(bArr, i, i2);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeMessage(int i, MessageLite messageLite) {
            writeTag(i, 2);
            writeMessageNoTag(messageLite);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeMessageNoTag(MessageLite messageLite) {
            writeUInt32NoTag(messageLite.getSerializedSize());
            messageLite.writeTo(this);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeMessageSetExtension(int i, MessageLite messageLite) {
            writeTag(1, 3);
            writeUInt32(2, i);
            writeMessage(3, messageLite);
            writeTag(1, 4);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeRawBytes(ByteBuffer byteBuffer) {
            if (byteBuffer.hasArray()) {
                write(byteBuffer.array(), byteBuffer.arrayOffset(), byteBuffer.capacity());
                return;
            }
            ByteBuffer duplicate = byteBuffer.duplicate();
            duplicate.clear();
            write(duplicate);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeRawMessageSetExtension(int i, ByteString byteString) {
            writeTag(1, 3);
            writeUInt32(2, i);
            writeBytes(3, byteString);
            writeTag(1, 4);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeString(int i, String str) {
            writeTag(i, 2);
            writeStringNoTag(str);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeStringNoTag(String str) {
            int position = this.f34739f.position();
            try {
                int computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(str.length() * 3);
                int computeUInt32SizeNoTag2 = CodedOutputStream.computeUInt32SizeNoTag(str.length());
                if (computeUInt32SizeNoTag2 == computeUInt32SizeNoTag) {
                    int position2 = this.f34739f.position() + computeUInt32SizeNoTag2;
                    this.f34739f.position(position2);
                    m56030p(str);
                    int position3 = this.f34739f.position();
                    this.f34739f.position(position);
                    writeUInt32NoTag(position3 - position2);
                    this.f34739f.position(position3);
                } else {
                    writeUInt32NoTag(Utf8.m55432k(str));
                    m56030p(str);
                }
            } catch (Utf8.UnpairedSurrogateException e) {
                this.f34739f.position(position);
                m56046h(str, e);
            } catch (IllegalArgumentException e2) {
                throw new OutOfSpaceException(e2);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeTag(int i, int i2) {
            writeUInt32NoTag(WireFormat.m55338a(i, i2));
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeUInt32(int i, int i2) {
            writeTag(i, 0);
            writeUInt32NoTag(i2);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeUInt32NoTag(int i) {
            while ((i & (-128)) != 0) {
                try {
                    this.f34739f.put((byte) ((i & 127) | 128));
                    i >>>= 7;
                } catch (BufferOverflowException e) {
                    throw new OutOfSpaceException(e);
                }
            }
            this.f34739f.put((byte) i);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeUInt64(int i, long j) {
            writeTag(i, 0);
            writeUInt64NoTag(j);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeUInt64NoTag(long j) {
            while (((-128) & j) != 0) {
                try {
                    this.f34739f.put((byte) ((((int) j) & 127) | 128));
                    j >>>= 7;
                } catch (BufferOverflowException e) {
                    throw new OutOfSpaceException(e);
                }
            }
            this.f34739f.put((byte) j);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeByteArray(int i, byte[] bArr, int i2, int i3) {
            writeTag(i, 2);
            mo56028l(bArr, i2, i3);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream, androidx.datastore.preferences.protobuf.ByteOutput
        public void writeLazy(ByteBuffer byteBuffer) {
            write(byteBuffer);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream, androidx.datastore.preferences.protobuf.ByteOutput
        public void write(byte[] bArr, int i, int i2) {
            try {
                this.f34739f.put(bArr, i, i2);
            } catch (IndexOutOfBoundsException e) {
                throw new OutOfSpaceException(e);
            } catch (BufferOverflowException e2) {
                throw new OutOfSpaceException(e2);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream, androidx.datastore.preferences.protobuf.ByteOutput
        public void write(ByteBuffer byteBuffer) {
            try {
                this.f34739f.put(byteBuffer);
            } catch (BufferOverflowException e) {
                throw new OutOfSpaceException(e);
            }
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.CodedOutputStream$g */
    /* loaded from: classes2.dex */
    public static final class C4354g extends CodedOutputStream {

        /* renamed from: e */
        public final ByteBuffer f34741e;

        /* renamed from: f */
        public final ByteBuffer f34742f;

        /* renamed from: g */
        public final long f34743g;

        /* renamed from: h */
        public final long f34744h;

        /* renamed from: i */
        public final long f34745i;

        /* renamed from: j */
        public final long f34746j;

        /* renamed from: k */
        public long f34747k;

        public C4354g(ByteBuffer byteBuffer) {
            super();
            this.f34741e = byteBuffer;
            this.f34742f = byteBuffer.duplicate().order(ByteOrder.LITTLE_ENDIAN);
            long m466i = AbstractC22978xY1.m466i(byteBuffer);
            this.f34743g = m466i;
            long position = byteBuffer.position() + m466i;
            this.f34744h = position;
            long limit = m466i + byteBuffer.limit();
            this.f34745i = limit;
            this.f34746j = limit - 10;
            this.f34747k = position;
        }

        /* renamed from: q */
        public static boolean m56025q() {
            return AbstractC22978xY1.m490I();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void flush() {
            this.f34741e.position(m56026p(this.f34747k));
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public int getTotalBytesWritten() {
            return (int) (this.f34747k - this.f34744h);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        /* renamed from: l */
        public void mo56028l(byte[] bArr, int i, int i2) {
            writeUInt32NoTag(i2);
            write(bArr, i, i2);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        /* renamed from: o */
        public void mo56027o(int i, MessageLite messageLite, InterfaceC4454v interfaceC4454v) {
            writeTag(i, 2);
            m56023s(messageLite, interfaceC4454v);
        }

        /* renamed from: p */
        public final int m56026p(long j) {
            return (int) (j - this.f34743g);
        }

        /* renamed from: r */
        public final void m56024r(long j) {
            this.f34742f.position(m56026p(j));
        }

        /* renamed from: s */
        public void m56023s(MessageLite messageLite, InterfaceC4454v interfaceC4454v) {
            writeUInt32NoTag(((AbstractMessageLite) messageLite).m56213b(interfaceC4454v));
            interfaceC4454v.mo55016g(messageLite, this.f34725a);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public int spaceLeft() {
            return (int) (this.f34745i - this.f34747k);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream, androidx.datastore.preferences.protobuf.ByteOutput
        public void write(byte b) {
            long j = this.f34747k;
            if (j < this.f34745i) {
                this.f34747k = 1 + j;
                AbstractC22978xY1.m485N(j, b);
                return;
            }
            throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Long.valueOf(this.f34747k), Long.valueOf(this.f34745i), 1));
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeBool(int i, boolean z) {
            writeTag(i, 0);
            write(z ? (byte) 1 : (byte) 0);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeByteArray(int i, byte[] bArr) {
            writeByteArray(i, bArr, 0, bArr.length);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeByteBuffer(int i, ByteBuffer byteBuffer) {
            writeTag(i, 2);
            writeUInt32NoTag(byteBuffer.capacity());
            writeRawBytes(byteBuffer);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeBytes(int i, ByteString byteString) {
            writeTag(i, 2);
            writeBytesNoTag(byteString);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeBytesNoTag(ByteString byteString) {
            writeUInt32NoTag(byteString.size());
            byteString.writeTo(this);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeFixed32(int i, int i2) {
            writeTag(i, 5);
            writeFixed32NoTag(i2);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeFixed32NoTag(int i) {
            this.f34742f.putInt(m56026p(this.f34747k), i);
            this.f34747k += 4;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeFixed64(int i, long j) {
            writeTag(i, 1);
            writeFixed64NoTag(j);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeFixed64NoTag(long j) {
            this.f34742f.putLong(m56026p(this.f34747k), j);
            this.f34747k += 8;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeInt32(int i, int i2) {
            writeTag(i, 0);
            writeInt32NoTag(i2);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeInt32NoTag(int i) {
            if (i >= 0) {
                writeUInt32NoTag(i);
            } else {
                writeUInt64NoTag(i);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream, androidx.datastore.preferences.protobuf.ByteOutput
        public void writeLazy(byte[] bArr, int i, int i2) {
            write(bArr, i, i2);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeMessage(int i, MessageLite messageLite) {
            writeTag(i, 2);
            writeMessageNoTag(messageLite);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeMessageNoTag(MessageLite messageLite) {
            writeUInt32NoTag(messageLite.getSerializedSize());
            messageLite.writeTo(this);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeMessageSetExtension(int i, MessageLite messageLite) {
            writeTag(1, 3);
            writeUInt32(2, i);
            writeMessage(3, messageLite);
            writeTag(1, 4);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeRawBytes(ByteBuffer byteBuffer) {
            if (byteBuffer.hasArray()) {
                write(byteBuffer.array(), byteBuffer.arrayOffset(), byteBuffer.capacity());
                return;
            }
            ByteBuffer duplicate = byteBuffer.duplicate();
            duplicate.clear();
            write(duplicate);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeRawMessageSetExtension(int i, ByteString byteString) {
            writeTag(1, 3);
            writeUInt32(2, i);
            writeBytes(3, byteString);
            writeTag(1, 4);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeString(int i, String str) {
            writeTag(i, 2);
            writeStringNoTag(str);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeStringNoTag(String str) {
            long j = this.f34747k;
            try {
                int computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(str.length() * 3);
                int computeUInt32SizeNoTag2 = CodedOutputStream.computeUInt32SizeNoTag(str.length());
                if (computeUInt32SizeNoTag2 == computeUInt32SizeNoTag) {
                    int m56026p = m56026p(this.f34747k) + computeUInt32SizeNoTag2;
                    this.f34742f.position(m56026p);
                    Utf8.m55433j(str, this.f34742f);
                    int position = this.f34742f.position() - m56026p;
                    writeUInt32NoTag(position);
                    this.f34747k += position;
                } else {
                    int m55432k = Utf8.m55432k(str);
                    writeUInt32NoTag(m55432k);
                    m56024r(this.f34747k);
                    Utf8.m55433j(str, this.f34742f);
                    this.f34747k += m55432k;
                }
            } catch (Utf8.UnpairedSurrogateException e) {
                this.f34747k = j;
                m56024r(j);
                m56046h(str, e);
            } catch (IllegalArgumentException e2) {
                throw new OutOfSpaceException(e2);
            } catch (IndexOutOfBoundsException e3) {
                throw new OutOfSpaceException(e3);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeTag(int i, int i2) {
            writeUInt32NoTag(WireFormat.m55338a(i, i2));
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeUInt32(int i, int i2) {
            writeTag(i, 0);
            writeUInt32NoTag(i2);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeUInt32NoTag(int i) {
            if (this.f34747k <= this.f34746j) {
                while ((i & (-128)) != 0) {
                    long j = this.f34747k;
                    this.f34747k = j + 1;
                    AbstractC22978xY1.m485N(j, (byte) ((i & 127) | 128));
                    i >>>= 7;
                }
                long j2 = this.f34747k;
                this.f34747k = 1 + j2;
                AbstractC22978xY1.m485N(j2, (byte) i);
                return;
            }
            while (true) {
                long j3 = this.f34747k;
                if (j3 < this.f34745i) {
                    if ((i & (-128)) == 0) {
                        this.f34747k = 1 + j3;
                        AbstractC22978xY1.m485N(j3, (byte) i);
                        return;
                    }
                    this.f34747k = j3 + 1;
                    AbstractC22978xY1.m485N(j3, (byte) ((i & 127) | 128));
                    i >>>= 7;
                } else {
                    throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Long.valueOf(this.f34747k), Long.valueOf(this.f34745i), 1));
                }
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeUInt64(int i, long j) {
            writeTag(i, 0);
            writeUInt64NoTag(j);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeUInt64NoTag(long j) {
            if (this.f34747k <= this.f34746j) {
                while ((j & (-128)) != 0) {
                    long j2 = this.f34747k;
                    this.f34747k = j2 + 1;
                    AbstractC22978xY1.m485N(j2, (byte) ((((int) j) & 127) | 128));
                    j >>>= 7;
                }
                long j3 = this.f34747k;
                this.f34747k = 1 + j3;
                AbstractC22978xY1.m485N(j3, (byte) j);
                return;
            }
            while (true) {
                long j4 = this.f34747k;
                if (j4 < this.f34745i) {
                    if ((j & (-128)) == 0) {
                        this.f34747k = 1 + j4;
                        AbstractC22978xY1.m485N(j4, (byte) j);
                        return;
                    }
                    this.f34747k = j4 + 1;
                    AbstractC22978xY1.m485N(j4, (byte) ((((int) j) & 127) | 128));
                    j >>>= 7;
                } else {
                    throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Long.valueOf(this.f34747k), Long.valueOf(this.f34745i), 1));
                }
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeByteArray(int i, byte[] bArr, int i2, int i3) {
            writeTag(i, 2);
            mo56028l(bArr, i2, i3);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream, androidx.datastore.preferences.protobuf.ByteOutput
        public void writeLazy(ByteBuffer byteBuffer) {
            write(byteBuffer);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream, androidx.datastore.preferences.protobuf.ByteOutput
        public void write(byte[] bArr, int i, int i2) {
            if (bArr != null && i >= 0 && i2 >= 0 && bArr.length - i2 >= i) {
                long j = i2;
                long j2 = this.f34747k;
                if (this.f34745i - j >= j2) {
                    AbstractC22978xY1.m460o(bArr, i, j2, j);
                    this.f34747k += j;
                    return;
                }
            }
            if (bArr == null) {
                throw new NullPointerException("value");
            }
            throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Long.valueOf(this.f34747k), Long.valueOf(this.f34745i), Integer.valueOf(i2)));
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream, androidx.datastore.preferences.protobuf.ByteOutput
        public void write(ByteBuffer byteBuffer) {
            try {
                int remaining = byteBuffer.remaining();
                m56024r(this.f34747k);
                this.f34742f.put(byteBuffer);
                this.f34747k += remaining;
            } catch (BufferOverflowException e) {
                throw new OutOfSpaceException(e);
            }
        }
    }

    /* renamed from: b */
    public static int m56052b(int i, MessageLite messageLite, InterfaceC4454v interfaceC4454v) {
        return (computeTagSize(i) * 2) + m56051c(messageLite, interfaceC4454v);
    }

    /* renamed from: c */
    public static int m56051c(MessageLite messageLite, InterfaceC4454v interfaceC4454v) {
        return ((AbstractMessageLite) messageLite).m56213b(interfaceC4454v);
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
        return m56050d(bArr.length);
    }

    public static int computeByteBufferSize(int i, ByteBuffer byteBuffer) {
        return computeTagSize(i) + computeByteBufferSizeNoTag(byteBuffer);
    }

    public static int computeByteBufferSizeNoTag(ByteBuffer byteBuffer) {
        return m56050d(byteBuffer.capacity());
    }

    public static int computeBytesSize(int i, ByteString byteString) {
        return computeTagSize(i) + computeBytesSizeNoTag(byteString);
    }

    public static int computeBytesSizeNoTag(ByteString byteString) {
        return m56050d(byteString.size());
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
        return (computeTagSize(i) * 2) + computeGroupSizeNoTag(messageLite);
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
        return m56050d(lazyFieldLite.getSerializedSize());
    }

    public static int computeMessageSetExtensionSize(int i, MessageLite messageLite) {
        return (computeTagSize(1) * 2) + computeUInt32Size(2, i) + computeMessageSize(3, messageLite);
    }

    public static int computeMessageSize(int i, MessageLite messageLite) {
        return computeTagSize(i) + computeMessageSizeNoTag(messageLite);
    }

    public static int computeMessageSizeNoTag(MessageLite messageLite) {
        return m56050d(messageLite.getSerializedSize());
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
            length = Utf8.m55432k(str);
        } catch (Utf8.UnpairedSurrogateException unused) {
            length = str.getBytes(Internal.f34817a).length;
        }
        return m56050d(length);
    }

    public static int computeTagSize(int i) {
        return computeUInt32SizeNoTag(WireFormat.m55338a(i, 0));
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
    public static int m56050d(int i) {
        return computeUInt32SizeNoTag(i) + i;
    }

    /* renamed from: e */
    public static int m56049e(int i, MessageLite messageLite, InterfaceC4454v interfaceC4454v) {
        return computeTagSize(i) + m56048f(messageLite, interfaceC4454v);
    }

    public static int encodeZigZag32(int i) {
        return (i >> 31) ^ (i << 1);
    }

    public static long encodeZigZag64(long j) {
        return (j >> 63) ^ (j << 1);
    }

    /* renamed from: f */
    public static int m56048f(MessageLite messageLite, InterfaceC4454v interfaceC4454v) {
        return m56050d(((AbstractMessageLite) messageLite).m56213b(interfaceC4454v));
    }

    /* renamed from: g */
    public static int m56047g(int i) {
        if (i > 4096) {
            return 4096;
        }
        return i;
    }

    /* renamed from: j */
    public static CodedOutputStream m56044j(ByteBuffer byteBuffer) {
        return new C4353f(byteBuffer);
    }

    /* renamed from: k */
    public static CodedOutputStream m56043k(ByteBuffer byteBuffer) {
        return new C4354g(byteBuffer);
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
    public final void m56046h(String str, Utf8.UnpairedSurrogateException unpairedSurrogateException) {
        f34723c.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) unpairedSurrogateException);
        byte[] bytes = str.getBytes(Internal.f34817a);
        try {
            writeUInt32NoTag(bytes.length);
            writeLazy(bytes, 0, bytes.length);
        } catch (OutOfSpaceException e) {
            throw e;
        } catch (IndexOutOfBoundsException e2) {
            throw new OutOfSpaceException(e2);
        }
    }

    /* renamed from: i */
    public boolean m56045i() {
        return this.f34726b;
    }

    /* renamed from: l */
    public abstract void mo56028l(byte[] bArr, int i, int i2);

    /* renamed from: m */
    public final void m56042m(int i, MessageLite messageLite, InterfaceC4454v interfaceC4454v) {
        writeTag(i, 3);
        m56041n(messageLite, interfaceC4454v);
        writeTag(i, 4);
    }

    /* renamed from: n */
    public final void m56041n(MessageLite messageLite, InterfaceC4454v interfaceC4454v) {
        interfaceC4454v.mo55016g(messageLite, this.f34725a);
    }

    /* renamed from: o */
    public abstract void mo56027o(int i, MessageLite messageLite, InterfaceC4454v interfaceC4454v);

    public abstract int spaceLeft();

    public void useDeterministicSerialization() {
        this.f34726b = true;
    }

    @Override // androidx.datastore.preferences.protobuf.ByteOutput
    public abstract void write(byte b) throws IOException;

    @Override // androidx.datastore.preferences.protobuf.ByteOutput
    public abstract void write(ByteBuffer byteBuffer) throws IOException;

    @Override // androidx.datastore.preferences.protobuf.ByteOutput
    public abstract void write(byte[] bArr, int i, int i2) throws IOException;

    public abstract void writeBool(int i, boolean z) throws IOException;

    public final void writeBoolNoTag(boolean z) throws IOException {
        write(z ? (byte) 1 : (byte) 0);
    }

    public abstract void writeByteArray(int i, byte[] bArr) throws IOException;

    public abstract void writeByteArray(int i, byte[] bArr, int i2, int i3) throws IOException;

    public final void writeByteArrayNoTag(byte[] bArr) throws IOException {
        mo56028l(bArr, 0, bArr.length);
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

    @Override // androidx.datastore.preferences.protobuf.ByteOutput
    public abstract void writeLazy(ByteBuffer byteBuffer) throws IOException;

    @Override // androidx.datastore.preferences.protobuf.ByteOutput
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
        return new C4352e(outputStream, i);
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
        return new C4350c(bArr, i, i2);
    }

    public static CodedOutputStream newInstance(ByteBuffer byteBuffer) {
        if (byteBuffer.hasArray()) {
            return new C4351d(byteBuffer);
        }
        if (byteBuffer.isDirect() && !byteBuffer.isReadOnly()) {
            if (C4354g.m56025q()) {
                return m56043k(byteBuffer);
            }
            return m56044j(byteBuffer);
        }
        throw new IllegalArgumentException("ByteBuffer is read-only");
    }

    @Deprecated
    public static CodedOutputStream newInstance(ByteBuffer byteBuffer, int i) {
        return newInstance(byteBuffer);
    }
}
