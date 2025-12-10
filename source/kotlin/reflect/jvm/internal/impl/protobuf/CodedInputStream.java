package kotlin.reflect.jvm.internal.impl.protobuf;

import com.google.common.base.Ascii;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import kotlin.reflect.jvm.internal.impl.protobuf.MessageLite;

/* loaded from: classes6.dex */
public final class CodedInputStream {

    /* renamed from: a */
    public final byte[] f69700a;

    /* renamed from: b */
    public final boolean f69701b;

    /* renamed from: c */
    public int f69702c;

    /* renamed from: d */
    public int f69703d;

    /* renamed from: e */
    public int f69704e;

    /* renamed from: f */
    public final InputStream f69705f;

    /* renamed from: g */
    public int f69706g;

    /* renamed from: h */
    public boolean f69707h;

    /* renamed from: i */
    public int f69708i;

    /* renamed from: j */
    public int f69709j;

    /* renamed from: k */
    public int f69710k;

    /* renamed from: l */
    public int f69711l;

    /* renamed from: m */
    public int f69712m;

    public CodedInputStream(InputStream inputStream) {
        this.f69707h = false;
        this.f69709j = Integer.MAX_VALUE;
        this.f69711l = 64;
        this.f69712m = 67108864;
        this.f69700a = new byte[4096];
        this.f69702c = 0;
        this.f69704e = 0;
        this.f69708i = 0;
        this.f69705f = inputStream;
        this.f69701b = false;
    }

    /* renamed from: b */
    public static CodedInputStream m27996b(C11919b c11919b) {
        CodedInputStream codedInputStream = new CodedInputStream(c11919b);
        try {
            codedInputStream.pushLimit(c11919b.size());
            return codedInputStream;
        } catch (InvalidProtocolBufferException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public static int decodeZigZag32(int i) {
        return (-(i & 1)) ^ (i >>> 1);
    }

    public static long decodeZigZag64(long j) {
        return (-(j & 1)) ^ (j >>> 1);
    }

    public static CodedInputStream newInstance(InputStream inputStream) {
        return new CodedInputStream(inputStream);
    }

    /* renamed from: a */
    public final void m27997a(int i) {
        if (this.f69702c - this.f69704e < i) {
            m27992f(i);
        }
    }

    /* renamed from: c */
    public final byte[] m27995c(int i) {
        int read;
        if (i <= 0) {
            if (i == 0) {
                return Internal.EMPTY_BYTE_ARRAY;
            }
            throw InvalidProtocolBufferException.negativeSize();
        }
        int i2 = this.f69708i;
        int i3 = this.f69704e;
        int i4 = i2 + i3 + i;
        int i5 = this.f69709j;
        if (i4 <= i5) {
            if (i < 4096) {
                byte[] bArr = new byte[i];
                int i6 = this.f69702c - i3;
                System.arraycopy(this.f69700a, i3, bArr, 0, i6);
                this.f69704e = this.f69702c;
                int i7 = i - i6;
                m27997a(i7);
                System.arraycopy(this.f69700a, 0, bArr, i6, i7);
                this.f69704e = i7;
                return bArr;
            }
            int i8 = this.f69702c;
            this.f69708i = i2 + i8;
            this.f69704e = 0;
            this.f69702c = 0;
            int i9 = i8 - i3;
            int i10 = i - i9;
            ArrayList<byte[]> arrayList = new ArrayList();
            while (i10 > 0) {
                int min = Math.min(i10, 4096);
                byte[] bArr2 = new byte[min];
                int i11 = 0;
                while (i11 < min) {
                    InputStream inputStream = this.f69705f;
                    if (inputStream == null) {
                        read = -1;
                    } else {
                        read = inputStream.read(bArr2, i11, min - i11);
                    }
                    if (read != -1) {
                        this.f69708i += read;
                        i11 += read;
                    } else {
                        throw InvalidProtocolBufferException.truncatedMessage();
                    }
                }
                i10 -= min;
                arrayList.add(bArr2);
            }
            byte[] bArr3 = new byte[i];
            System.arraycopy(this.f69700a, i3, bArr3, 0, i9);
            for (byte[] bArr4 : arrayList) {
                System.arraycopy(bArr4, 0, bArr3, i9, bArr4.length);
                i9 += bArr4.length;
            }
            return bArr3;
        }
        skipRawBytes((i5 - i2) - i3);
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    public void checkLastTagWas(int i) throws InvalidProtocolBufferException {
        if (this.f69706g == i) {
            return;
        }
        throw InvalidProtocolBufferException.invalidEndTag();
    }

    /* renamed from: d */
    public long m27994d() {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            byte readRawByte = readRawByte();
            j |= (readRawByte & Byte.MAX_VALUE) << i;
            if ((readRawByte & 128) == 0) {
                return j;
            }
        }
        throw InvalidProtocolBufferException.malformedVarint();
    }

    /* renamed from: e */
    public final void m27993e() {
        int i = this.f69702c + this.f69703d;
        this.f69702c = i;
        int i2 = this.f69708i + i;
        int i3 = this.f69709j;
        if (i2 > i3) {
            int i4 = i2 - i3;
            this.f69703d = i4;
            this.f69702c = i - i4;
            return;
        }
        this.f69703d = 0;
    }

    /* renamed from: f */
    public final void m27992f(int i) {
        if (m27990h(i)) {
            return;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    /* renamed from: g */
    public final void m27991g(int i) {
        if (i >= 0) {
            int i2 = this.f69708i;
            int i3 = this.f69704e;
            int i4 = i2 + i3 + i;
            int i5 = this.f69709j;
            if (i4 <= i5) {
                int i6 = this.f69702c;
                int i7 = i6 - i3;
                this.f69704e = i6;
                m27992f(1);
                while (true) {
                    int i8 = i - i7;
                    int i9 = this.f69702c;
                    if (i8 > i9) {
                        i7 += i9;
                        this.f69704e = i9;
                        m27992f(1);
                    } else {
                        this.f69704e = i8;
                        return;
                    }
                }
            } else {
                skipRawBytes((i5 - i2) - i3);
                throw InvalidProtocolBufferException.truncatedMessage();
            }
        } else {
            throw InvalidProtocolBufferException.negativeSize();
        }
    }

    public int getBytesUntilLimit() {
        int i = this.f69709j;
        if (i == Integer.MAX_VALUE) {
            return -1;
        }
        return i - (this.f69708i + this.f69704e);
    }

    /* renamed from: h */
    public final boolean m27990h(int i) {
        int i2 = this.f69704e;
        int i3 = i2 + i;
        int i4 = this.f69702c;
        if (i3 > i4) {
            if (this.f69708i + i2 + i <= this.f69709j && this.f69705f != null) {
                if (i2 > 0) {
                    if (i4 > i2) {
                        byte[] bArr = this.f69700a;
                        System.arraycopy(bArr, i2, bArr, 0, i4 - i2);
                    }
                    this.f69708i += i2;
                    this.f69702c -= i2;
                    this.f69704e = 0;
                }
                InputStream inputStream = this.f69705f;
                byte[] bArr2 = this.f69700a;
                int i5 = this.f69702c;
                int read = inputStream.read(bArr2, i5, bArr2.length - i5);
                if (read != 0 && read >= -1 && read <= this.f69700a.length) {
                    if (read > 0) {
                        this.f69702c += read;
                        if ((this.f69708i + i) - this.f69712m <= 0) {
                            m27993e();
                            if (this.f69702c >= i) {
                                return true;
                            }
                            return m27990h(i);
                        }
                        throw InvalidProtocolBufferException.sizeLimitExceeded();
                    }
                } else {
                    StringBuilder sb = new StringBuilder(102);
                    sb.append("InputStream#read(byte[]) returned invalid result: ");
                    sb.append(read);
                    sb.append("\nThe InputStream implementation is buggy.");
                    throw new IllegalStateException(sb.toString());
                }
            }
            return false;
        }
        StringBuilder sb2 = new StringBuilder(77);
        sb2.append("refillBuffer() called when ");
        sb2.append(i);
        sb2.append(" bytes were already available in buffer");
        throw new IllegalStateException(sb2.toString());
    }

    public boolean isAtEnd() throws IOException {
        if (this.f69704e == this.f69702c && !m27990h(1)) {
            return true;
        }
        return false;
    }

    public void popLimit(int i) {
        this.f69709j = i;
        m27993e();
    }

    public int pushLimit(int i) throws InvalidProtocolBufferException {
        if (i >= 0) {
            int i2 = i + this.f69708i + this.f69704e;
            int i3 = this.f69709j;
            if (i2 <= i3) {
                this.f69709j = i2;
                m27993e();
                return i3;
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        throw InvalidProtocolBufferException.negativeSize();
    }

    public boolean readBool() throws IOException {
        if (readRawVarint64() != 0) {
            return true;
        }
        return false;
    }

    public ByteString readBytes() throws IOException {
        ByteString copyFrom;
        int readRawVarint32 = readRawVarint32();
        int i = this.f69702c;
        int i2 = this.f69704e;
        if (readRawVarint32 <= i - i2 && readRawVarint32 > 0) {
            if (this.f69701b && this.f69707h) {
                copyFrom = new C11916a(this.f69700a, this.f69704e, readRawVarint32);
            } else {
                copyFrom = ByteString.copyFrom(this.f69700a, i2, readRawVarint32);
            }
            this.f69704e += readRawVarint32;
            return copyFrom;
        } else if (readRawVarint32 == 0) {
            return ByteString.EMPTY;
        } else {
            return new C11919b(m27995c(readRawVarint32));
        }
    }

    public double readDouble() throws IOException {
        return Double.longBitsToDouble(readRawLittleEndian64());
    }

    public int readEnum() throws IOException {
        return readRawVarint32();
    }

    public int readFixed32() throws IOException {
        return readRawLittleEndian32();
    }

    public long readFixed64() throws IOException {
        return readRawLittleEndian64();
    }

    public float readFloat() throws IOException {
        return Float.intBitsToFloat(readRawLittleEndian32());
    }

    public void readGroup(int i, MessageLite.Builder builder, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        int i2 = this.f69710k;
        if (i2 < this.f69711l) {
            this.f69710k = i2 + 1;
            builder.mergeFrom(this, extensionRegistryLite);
            checkLastTagWas(WireFormat.m27943b(i, 4));
            this.f69710k--;
            return;
        }
        throw InvalidProtocolBufferException.recursionLimitExceeded();
    }

    public int readInt32() throws IOException {
        return readRawVarint32();
    }

    public long readInt64() throws IOException {
        return readRawVarint64();
    }

    public void readMessage(MessageLite.Builder builder, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        int readRawVarint32 = readRawVarint32();
        if (this.f69710k < this.f69711l) {
            int pushLimit = pushLimit(readRawVarint32);
            this.f69710k++;
            builder.mergeFrom(this, extensionRegistryLite);
            checkLastTagWas(0);
            this.f69710k--;
            popLimit(pushLimit);
            return;
        }
        throw InvalidProtocolBufferException.recursionLimitExceeded();
    }

    public byte readRawByte() throws IOException {
        if (this.f69704e == this.f69702c) {
            m27992f(1);
        }
        byte[] bArr = this.f69700a;
        int i = this.f69704e;
        this.f69704e = i + 1;
        return bArr[i];
    }

    public int readRawLittleEndian32() throws IOException {
        int i = this.f69704e;
        if (this.f69702c - i < 4) {
            m27992f(4);
            i = this.f69704e;
        }
        byte[] bArr = this.f69700a;
        this.f69704e = i + 4;
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    public long readRawLittleEndian64() throws IOException {
        int i = this.f69704e;
        if (this.f69702c - i < 8) {
            m27992f(8);
            i = this.f69704e;
        }
        byte[] bArr = this.f69700a;
        this.f69704e = i + 8;
        return ((bArr[i + 7] & 255) << 56) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48);
    }

    public int readRawVarint32() throws IOException {
        int i;
        byte b;
        int i2;
        int i3 = this.f69704e;
        int i4 = this.f69702c;
        if (i4 != i3) {
            byte[] bArr = this.f69700a;
            int i5 = i3 + 1;
            byte b2 = bArr[i3];
            if (b2 >= 0) {
                this.f69704e = i5;
                return b2;
            } else if (i4 - i5 >= 9) {
                int i6 = i3 + 2;
                int i7 = (bArr[i5] << 7) ^ b2;
                long j = i7;
                if (j < 0) {
                    i2 = (int) ((-128) ^ j);
                } else {
                    int i8 = i3 + 3;
                    int i9 = (bArr[i6] << 14) ^ i7;
                    long j2 = i9;
                    if (j2 >= 0) {
                        i2 = (int) (16256 ^ j2);
                    } else {
                        int i10 = i3 + 4;
                        long j3 = i9 ^ (bArr[i8] << Ascii.NAK);
                        if (j3 < 0) {
                            i2 = (int) ((-2080896) ^ j3);
                        } else {
                            i8 = i3 + 5;
                            int i11 = (int) ((i ^ (b << Ascii.f52686FS)) ^ 266354560);
                            if (bArr[i10] < 0) {
                                i10 = i3 + 6;
                                if (bArr[i8] < 0) {
                                    i8 = i3 + 7;
                                    if (bArr[i10] < 0) {
                                        i10 = i3 + 8;
                                        if (bArr[i8] < 0) {
                                            i8 = i3 + 9;
                                            if (bArr[i10] < 0) {
                                                int i12 = i3 + 10;
                                                if (bArr[i8] >= 0) {
                                                    i6 = i12;
                                                    i2 = i11;
                                                }
                                            }
                                        }
                                    }
                                }
                                i2 = i11;
                            }
                            i2 = i11;
                        }
                        i6 = i10;
                    }
                    i6 = i8;
                }
                this.f69704e = i6;
                return i2;
            }
        }
        return (int) m27994d();
    }

    public long readRawVarint64() throws IOException {
        long j;
        long j2;
        long j3;
        int i = this.f69704e;
        int i2 = this.f69702c;
        if (i2 != i) {
            byte[] bArr = this.f69700a;
            int i3 = i + 1;
            byte b = bArr[i];
            if (b >= 0) {
                this.f69704e = i3;
                return b;
            } else if (i2 - i3 >= 9) {
                int i4 = i + 2;
                long j4 = (bArr[i3] << 7) ^ b;
                if (j4 < 0) {
                    j2 = -128;
                } else {
                    int i5 = i + 3;
                    long j5 = j4 ^ (bArr[i4] << 14);
                    if (j5 >= 0) {
                        j3 = 16256;
                    } else {
                        i4 = i + 4;
                        j4 = j5 ^ (bArr[i5] << Ascii.NAK);
                        if (j4 < 0) {
                            j2 = -2080896;
                        } else {
                            i5 = i + 5;
                            j5 = j4 ^ (bArr[i4] << 28);
                            if (j5 >= 0) {
                                j3 = 266354560;
                            } else {
                                i4 = i + 6;
                                j4 = j5 ^ (bArr[i5] << 35);
                                if (j4 < 0) {
                                    j2 = -34093383808L;
                                } else {
                                    i5 = i + 7;
                                    j5 = j4 ^ (bArr[i4] << 42);
                                    if (j5 >= 0) {
                                        j3 = 4363953127296L;
                                    } else {
                                        i4 = i + 8;
                                        j4 = j5 ^ (bArr[i5] << 49);
                                        if (j4 < 0) {
                                            j2 = -558586000294016L;
                                        } else {
                                            i5 = i + 9;
                                            long j6 = (j4 ^ (bArr[i4] << 56)) ^ 71499008037633920L;
                                            if (j6 < 0) {
                                                i4 = i + 10;
                                                if (bArr[i5] >= 0) {
                                                    j = j6;
                                                    this.f69704e = i4;
                                                    return j;
                                                }
                                            } else {
                                                j = j6;
                                                i4 = i5;
                                                this.f69704e = i4;
                                                return j;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    j = j5 ^ j3;
                    i4 = i5;
                    this.f69704e = i4;
                    return j;
                }
                j = j4 ^ j2;
                this.f69704e = i4;
                return j;
            }
        }
        return m27994d();
    }

    public int readSFixed32() throws IOException {
        return readRawLittleEndian32();
    }

    public long readSFixed64() throws IOException {
        return readRawLittleEndian64();
    }

    public int readSInt32() throws IOException {
        return decodeZigZag32(readRawVarint32());
    }

    public long readSInt64() throws IOException {
        return decodeZigZag64(readRawVarint64());
    }

    public String readString() throws IOException {
        int readRawVarint32 = readRawVarint32();
        int i = this.f69702c;
        int i2 = this.f69704e;
        if (readRawVarint32 <= i - i2 && readRawVarint32 > 0) {
            String str = new String(this.f69700a, i2, readRawVarint32, "UTF-8");
            this.f69704e += readRawVarint32;
            return str;
        } else if (readRawVarint32 == 0) {
            return "";
        } else {
            return new String(m27995c(readRawVarint32), "UTF-8");
        }
    }

    public String readStringRequireUtf8() throws IOException {
        byte[] m27995c;
        int readRawVarint32 = readRawVarint32();
        int i = this.f69704e;
        if (readRawVarint32 <= this.f69702c - i && readRawVarint32 > 0) {
            m27995c = this.f69700a;
            this.f69704e = i + readRawVarint32;
        } else if (readRawVarint32 == 0) {
            return "";
        } else {
            m27995c = m27995c(readRawVarint32);
            i = 0;
        }
        if (AbstractC22717w02.m938f(m27995c, i, i + readRawVarint32)) {
            return new String(m27995c, i, readRawVarint32, "UTF-8");
        }
        throw InvalidProtocolBufferException.invalidUtf8();
    }

    public int readTag() throws IOException {
        if (isAtEnd()) {
            this.f69706g = 0;
            return 0;
        }
        int readRawVarint32 = readRawVarint32();
        this.f69706g = readRawVarint32;
        if (WireFormat.getTagFieldNumber(readRawVarint32) != 0) {
            return this.f69706g;
        }
        throw InvalidProtocolBufferException.invalidTag();
    }

    public int readUInt32() throws IOException {
        return readRawVarint32();
    }

    public long readUInt64() throws IOException {
        return readRawVarint64();
    }

    public boolean skipField(int i, CodedOutputStream codedOutputStream) throws IOException {
        int m27944a = WireFormat.m27944a(i);
        if (m27944a != 0) {
            if (m27944a != 1) {
                if (m27944a != 2) {
                    if (m27944a != 3) {
                        if (m27944a != 4) {
                            if (m27944a == 5) {
                                int readRawLittleEndian32 = readRawLittleEndian32();
                                codedOutputStream.writeRawVarint32(i);
                                codedOutputStream.writeFixed32NoTag(readRawLittleEndian32);
                                return true;
                            }
                            throw InvalidProtocolBufferException.invalidWireType();
                        }
                        return false;
                    }
                    codedOutputStream.writeRawVarint32(i);
                    skipMessage(codedOutputStream);
                    int m27943b = WireFormat.m27943b(WireFormat.getTagFieldNumber(i), 4);
                    checkLastTagWas(m27943b);
                    codedOutputStream.writeRawVarint32(m27943b);
                    return true;
                }
                ByteString readBytes = readBytes();
                codedOutputStream.writeRawVarint32(i);
                codedOutputStream.writeBytesNoTag(readBytes);
                return true;
            }
            long readRawLittleEndian64 = readRawLittleEndian64();
            codedOutputStream.writeRawVarint32(i);
            codedOutputStream.writeFixed64NoTag(readRawLittleEndian64);
            return true;
        }
        long readInt64 = readInt64();
        codedOutputStream.writeRawVarint32(i);
        codedOutputStream.writeUInt64NoTag(readInt64);
        return true;
    }

    public void skipMessage(CodedOutputStream codedOutputStream) throws IOException {
        int readTag;
        do {
            readTag = readTag();
            if (readTag == 0) {
                return;
            }
        } while (skipField(readTag, codedOutputStream));
    }

    public void skipRawBytes(int i) throws IOException {
        int i2 = this.f69702c;
        int i3 = this.f69704e;
        if (i <= i2 - i3 && i >= 0) {
            this.f69704e = i3 + i;
        } else {
            m27991g(i);
        }
    }

    public <T extends MessageLite> T readMessage(Parser<T> parser, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        int readRawVarint32 = readRawVarint32();
        if (this.f69710k < this.f69711l) {
            int pushLimit = pushLimit(readRawVarint32);
            this.f69710k++;
            T parsePartialFrom = parser.parsePartialFrom(this, extensionRegistryLite);
            checkLastTagWas(0);
            this.f69710k--;
            popLimit(pushLimit);
            return parsePartialFrom;
        }
        throw InvalidProtocolBufferException.recursionLimitExceeded();
    }

    public CodedInputStream(C11919b c11919b) {
        this.f69707h = false;
        this.f69709j = Integer.MAX_VALUE;
        this.f69711l = 64;
        this.f69712m = 67108864;
        this.f69700a = c11919b.f69769a;
        int mo27939f = c11919b.mo27939f();
        this.f69704e = mo27939f;
        this.f69702c = mo27939f + c11919b.size();
        this.f69708i = -this.f69704e;
        this.f69705f = null;
        this.f69701b = true;
    }

    public static int readRawVarint32(int i, InputStream inputStream) throws IOException {
        if ((i & 128) == 0) {
            return i;
        }
        int i2 = i & 127;
        int i3 = 7;
        while (i3 < 32) {
            int read = inputStream.read();
            if (read == -1) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            i2 |= (read & 127) << i3;
            if ((read & 128) == 0) {
                return i2;
            }
            i3 += 7;
        }
        while (i3 < 64) {
            int read2 = inputStream.read();
            if (read2 == -1) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            if ((read2 & 128) == 0) {
                return i2;
            }
            i3 += 7;
        }
        throw InvalidProtocolBufferException.malformedVarint();
    }
}
