package com.google.protobuf;

import com.google.common.base.Ascii;
import com.google.protobuf.MessageLite;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
public abstract class CodedInputStream {

    /* renamed from: f */
    public static volatile int f57208f = 100;

    /* renamed from: a */
    public int f57209a;

    /* renamed from: b */
    public int f57210b;

    /* renamed from: c */
    public int f57211c;

    /* renamed from: d */
    public C8938d f57212d;

    /* renamed from: e */
    public boolean f57213e;

    /* renamed from: com.google.protobuf.CodedInputStream$b */
    /* loaded from: classes4.dex */
    public static final class C8841b extends CodedInputStream {

        /* renamed from: g */
        public final byte[] f57214g;

        /* renamed from: h */
        public final boolean f57215h;

        /* renamed from: i */
        public int f57216i;

        /* renamed from: j */
        public int f57217j;

        /* renamed from: k */
        public int f57218k;

        /* renamed from: l */
        public int f57219l;

        /* renamed from: m */
        public int f57220m;

        /* renamed from: n */
        public boolean f57221n;

        /* renamed from: o */
        public int f57222o;

        @Override // com.google.protobuf.CodedInputStream
        public void checkLastTagWas(int i) {
            if (this.f57220m == i) {
                return;
            }
            throw InvalidProtocolBufferException.invalidEndTag();
        }

        /* renamed from: d */
        public long m37048d() {
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
        public final void m37047e() {
            int i = this.f57216i + this.f57217j;
            this.f57216i = i;
            int i2 = i - this.f57219l;
            int i3 = this.f57222o;
            if (i2 > i3) {
                int i4 = i2 - i3;
                this.f57217j = i4;
                this.f57216i = i - i4;
                return;
            }
            this.f57217j = 0;
        }

        @Override // com.google.protobuf.CodedInputStream
        public void enableAliasing(boolean z) {
            this.f57221n = z;
        }

        /* renamed from: f */
        public final void m37046f() {
            if (this.f57216i - this.f57218k >= 10) {
                m37045g();
            } else {
                m37044h();
            }
        }

        /* renamed from: g */
        public final void m37045g() {
            for (int i = 0; i < 10; i++) {
                byte[] bArr = this.f57214g;
                int i2 = this.f57218k;
                this.f57218k = i2 + 1;
                if (bArr[i2] >= 0) {
                    return;
                }
            }
            throw InvalidProtocolBufferException.malformedVarint();
        }

        @Override // com.google.protobuf.CodedInputStream
        public int getBytesUntilLimit() {
            int i = this.f57222o;
            if (i == Integer.MAX_VALUE) {
                return -1;
            }
            return i - getTotalBytesRead();
        }

        @Override // com.google.protobuf.CodedInputStream
        public int getLastTag() {
            return this.f57220m;
        }

        @Override // com.google.protobuf.CodedInputStream
        public int getTotalBytesRead() {
            return this.f57218k - this.f57219l;
        }

        /* renamed from: h */
        public final void m37044h() {
            for (int i = 0; i < 10; i++) {
                if (readRawByte() >= 0) {
                    return;
                }
            }
            throw InvalidProtocolBufferException.malformedVarint();
        }

        @Override // com.google.protobuf.CodedInputStream
        public boolean isAtEnd() {
            if (this.f57218k == this.f57216i) {
                return true;
            }
            return false;
        }

        @Override // com.google.protobuf.CodedInputStream
        public void popLimit(int i) {
            this.f57222o = i;
            m37047e();
        }

        @Override // com.google.protobuf.CodedInputStream
        public int pushLimit(int i) {
            if (i >= 0) {
                int totalBytesRead = i + getTotalBytesRead();
                if (totalBytesRead >= 0) {
                    int i2 = this.f57222o;
                    if (totalBytesRead <= i2) {
                        this.f57222o = totalBytesRead;
                        m37047e();
                        return i2;
                    }
                    throw InvalidProtocolBufferException.truncatedMessage();
                }
                throw InvalidProtocolBufferException.parseFailure();
            }
            throw InvalidProtocolBufferException.negativeSize();
        }

        @Override // com.google.protobuf.CodedInputStream
        public boolean readBool() {
            if (readRawVarint64() != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.protobuf.CodedInputStream
        public byte[] readByteArray() {
            return readRawBytes(readRawVarint32());
        }

        @Override // com.google.protobuf.CodedInputStream
        public ByteBuffer readByteBuffer() {
            ByteBuffer wrap;
            int readRawVarint32 = readRawVarint32();
            if (readRawVarint32 > 0) {
                int i = this.f57216i;
                int i2 = this.f57218k;
                if (readRawVarint32 <= i - i2) {
                    if (!this.f57215h && this.f57221n) {
                        wrap = ByteBuffer.wrap(this.f57214g, i2, readRawVarint32).slice();
                    } else {
                        wrap = ByteBuffer.wrap(Arrays.copyOfRange(this.f57214g, i2, i2 + readRawVarint32));
                    }
                    this.f57218k += readRawVarint32;
                    return wrap;
                }
            }
            if (readRawVarint32 == 0) {
                return Internal.EMPTY_BYTE_BUFFER;
            }
            if (readRawVarint32 < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }

        @Override // com.google.protobuf.CodedInputStream
        public ByteString readBytes() {
            ByteString copyFrom;
            int readRawVarint32 = readRawVarint32();
            if (readRawVarint32 > 0) {
                int i = this.f57216i;
                int i2 = this.f57218k;
                if (readRawVarint32 <= i - i2) {
                    if (this.f57215h && this.f57221n) {
                        copyFrom = ByteString.wrap(this.f57214g, i2, readRawVarint32);
                    } else {
                        copyFrom = ByteString.copyFrom(this.f57214g, i2, readRawVarint32);
                    }
                    this.f57218k += readRawVarint32;
                    return copyFrom;
                }
            }
            if (readRawVarint32 == 0) {
                return ByteString.EMPTY;
            }
            return ByteString.wrap(readRawBytes(readRawVarint32));
        }

        @Override // com.google.protobuf.CodedInputStream
        public double readDouble() {
            return Double.longBitsToDouble(readRawLittleEndian64());
        }

        @Override // com.google.protobuf.CodedInputStream
        public int readEnum() {
            return readRawVarint32();
        }

        @Override // com.google.protobuf.CodedInputStream
        public int readFixed32() {
            return readRawLittleEndian32();
        }

        @Override // com.google.protobuf.CodedInputStream
        public long readFixed64() {
            return readRawLittleEndian64();
        }

        @Override // com.google.protobuf.CodedInputStream
        public float readFloat() {
            return Float.intBitsToFloat(readRawLittleEndian32());
        }

        @Override // com.google.protobuf.CodedInputStream
        public void readGroup(int i, MessageLite.Builder builder, ExtensionRegistryLite extensionRegistryLite) {
            checkRecursionLimit();
            this.f57209a++;
            builder.mergeFrom(this, extensionRegistryLite);
            checkLastTagWas(WireFormat.m35424a(i, 4));
            this.f57209a--;
        }

        @Override // com.google.protobuf.CodedInputStream
        public int readInt32() {
            return readRawVarint32();
        }

        @Override // com.google.protobuf.CodedInputStream
        public long readInt64() {
            return readRawVarint64();
        }

        @Override // com.google.protobuf.CodedInputStream
        public void readMessage(MessageLite.Builder builder, ExtensionRegistryLite extensionRegistryLite) {
            int readRawVarint32 = readRawVarint32();
            checkRecursionLimit();
            int pushLimit = pushLimit(readRawVarint32);
            this.f57209a++;
            builder.mergeFrom(this, extensionRegistryLite);
            checkLastTagWas(0);
            this.f57209a--;
            if (getBytesUntilLimit() == 0) {
                popLimit(pushLimit);
                return;
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }

        @Override // com.google.protobuf.CodedInputStream
        public byte readRawByte() {
            int i = this.f57218k;
            if (i != this.f57216i) {
                byte[] bArr = this.f57214g;
                this.f57218k = i + 1;
                return bArr[i];
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }

        @Override // com.google.protobuf.CodedInputStream
        public byte[] readRawBytes(int i) {
            if (i > 0) {
                int i2 = this.f57216i;
                int i3 = this.f57218k;
                if (i <= i2 - i3) {
                    int i4 = i + i3;
                    this.f57218k = i4;
                    return Arrays.copyOfRange(this.f57214g, i3, i4);
                }
            }
            if (i <= 0) {
                if (i == 0) {
                    return Internal.EMPTY_BYTE_ARRAY;
                }
                throw InvalidProtocolBufferException.negativeSize();
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }

        @Override // com.google.protobuf.CodedInputStream
        public int readRawLittleEndian32() {
            int i = this.f57218k;
            if (this.f57216i - i >= 4) {
                byte[] bArr = this.f57214g;
                this.f57218k = i + 4;
                return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }

        @Override // com.google.protobuf.CodedInputStream
        public long readRawLittleEndian64() {
            int i = this.f57218k;
            if (this.f57216i - i >= 8) {
                byte[] bArr = this.f57214g;
                this.f57218k = i + 8;
                return ((bArr[i + 7] & 255) << 56) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48);
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }

        @Override // com.google.protobuf.CodedInputStream
        public int readRawVarint32() {
            int i;
            int i2 = this.f57218k;
            int i3 = this.f57216i;
            if (i3 != i2) {
                byte[] bArr = this.f57214g;
                int i4 = i2 + 1;
                byte b = bArr[i2];
                if (b >= 0) {
                    this.f57218k = i4;
                    return b;
                } else if (i3 - i4 >= 9) {
                    int i5 = i2 + 2;
                    int i6 = (bArr[i4] << 7) ^ b;
                    if (i6 < 0) {
                        i = i6 ^ (-128);
                    } else {
                        int i7 = i2 + 3;
                        int i8 = (bArr[i5] << 14) ^ i6;
                        if (i8 >= 0) {
                            i = i8 ^ 16256;
                        } else {
                            int i9 = i2 + 4;
                            int i10 = i8 ^ (bArr[i7] << Ascii.NAK);
                            if (i10 < 0) {
                                i = (-2080896) ^ i10;
                            } else {
                                i7 = i2 + 5;
                                byte b2 = bArr[i9];
                                int i11 = (i10 ^ (b2 << Ascii.f52686FS)) ^ 266354560;
                                if (b2 < 0) {
                                    i9 = i2 + 6;
                                    if (bArr[i7] < 0) {
                                        i7 = i2 + 7;
                                        if (bArr[i9] < 0) {
                                            i9 = i2 + 8;
                                            if (bArr[i7] < 0) {
                                                i7 = i2 + 9;
                                                if (bArr[i9] < 0) {
                                                    int i12 = i2 + 10;
                                                    if (bArr[i7] >= 0) {
                                                        i5 = i12;
                                                        i = i11;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    i = i11;
                                }
                                i = i11;
                            }
                            i5 = i9;
                        }
                        i5 = i7;
                    }
                    this.f57218k = i5;
                    return i;
                }
            }
            return (int) m37048d();
        }

        @Override // com.google.protobuf.CodedInputStream
        public long readRawVarint64() {
            long j;
            long j2;
            long j3;
            int i = this.f57218k;
            int i2 = this.f57216i;
            if (i2 != i) {
                byte[] bArr = this.f57214g;
                int i3 = i + 1;
                byte b = bArr[i];
                if (b >= 0) {
                    this.f57218k = i3;
                    return b;
                } else if (i2 - i3 >= 9) {
                    int i4 = i + 2;
                    int i5 = (bArr[i3] << 7) ^ b;
                    if (i5 < 0) {
                        j = i5 ^ (-128);
                    } else {
                        int i6 = i + 3;
                        int i7 = (bArr[i4] << 14) ^ i5;
                        if (i7 >= 0) {
                            j = i7 ^ 16256;
                            i4 = i6;
                        } else {
                            int i8 = i + 4;
                            int i9 = i7 ^ (bArr[i6] << Ascii.NAK);
                            if (i9 < 0) {
                                i4 = i8;
                                j = (-2080896) ^ i9;
                            } else {
                                long j4 = i9;
                                i4 = i + 5;
                                long j5 = j4 ^ (bArr[i8] << 28);
                                if (j5 >= 0) {
                                    j3 = 266354560;
                                } else {
                                    int i10 = i + 6;
                                    long j6 = j5 ^ (bArr[i4] << 35);
                                    if (j6 < 0) {
                                        j2 = -34093383808L;
                                    } else {
                                        i4 = i + 7;
                                        j5 = j6 ^ (bArr[i10] << 42);
                                        if (j5 >= 0) {
                                            j3 = 4363953127296L;
                                        } else {
                                            i10 = i + 8;
                                            j6 = j5 ^ (bArr[i4] << 49);
                                            if (j6 < 0) {
                                                j2 = -558586000294016L;
                                            } else {
                                                i4 = i + 9;
                                                long j7 = (j6 ^ (bArr[i10] << 56)) ^ 71499008037633920L;
                                                if (j7 < 0) {
                                                    int i11 = i + 10;
                                                    if (bArr[i4] >= 0) {
                                                        i4 = i11;
                                                    }
                                                }
                                                j = j7;
                                            }
                                        }
                                    }
                                    j = j6 ^ j2;
                                    i4 = i10;
                                }
                                j = j5 ^ j3;
                            }
                        }
                    }
                    this.f57218k = i4;
                    return j;
                }
            }
            return m37048d();
        }

        @Override // com.google.protobuf.CodedInputStream
        public int readSFixed32() {
            return readRawLittleEndian32();
        }

        @Override // com.google.protobuf.CodedInputStream
        public long readSFixed64() {
            return readRawLittleEndian64();
        }

        @Override // com.google.protobuf.CodedInputStream
        public int readSInt32() {
            return CodedInputStream.decodeZigZag32(readRawVarint32());
        }

        @Override // com.google.protobuf.CodedInputStream
        public long readSInt64() {
            return CodedInputStream.decodeZigZag64(readRawVarint64());
        }

        @Override // com.google.protobuf.CodedInputStream
        public String readString() {
            int readRawVarint32 = readRawVarint32();
            if (readRawVarint32 > 0) {
                int i = this.f57216i;
                int i2 = this.f57218k;
                if (readRawVarint32 <= i - i2) {
                    String str = new String(this.f57214g, i2, readRawVarint32, Internal.f57358b);
                    this.f57218k += readRawVarint32;
                    return str;
                }
            }
            if (readRawVarint32 == 0) {
                return "";
            }
            if (readRawVarint32 < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }

        @Override // com.google.protobuf.CodedInputStream
        public String readStringRequireUtf8() {
            int readRawVarint32 = readRawVarint32();
            if (readRawVarint32 > 0) {
                int i = this.f57216i;
                int i2 = this.f57218k;
                if (readRawVarint32 <= i - i2) {
                    String m35517h = Utf8.m35517h(this.f57214g, i2, readRawVarint32);
                    this.f57218k += readRawVarint32;
                    return m35517h;
                }
            }
            if (readRawVarint32 == 0) {
                return "";
            }
            if (readRawVarint32 <= 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }

        @Override // com.google.protobuf.CodedInputStream
        public int readTag() {
            if (isAtEnd()) {
                this.f57220m = 0;
                return 0;
            }
            int readRawVarint32 = readRawVarint32();
            this.f57220m = readRawVarint32;
            if (WireFormat.getTagFieldNumber(readRawVarint32) != 0) {
                return this.f57220m;
            }
            throw InvalidProtocolBufferException.invalidTag();
        }

        @Override // com.google.protobuf.CodedInputStream
        public int readUInt32() {
            return readRawVarint32();
        }

        @Override // com.google.protobuf.CodedInputStream
        public long readUInt64() {
            return readRawVarint64();
        }

        @Override // com.google.protobuf.CodedInputStream
        public void readUnknownGroup(int i, MessageLite.Builder builder) {
            readGroup(i, builder, ExtensionRegistryLite.getEmptyRegistry());
        }

        @Override // com.google.protobuf.CodedInputStream
        public void resetSizeCounter() {
            this.f57219l = this.f57218k;
        }

        @Override // com.google.protobuf.CodedInputStream
        public boolean skipField(int i) {
            int tagWireType = WireFormat.getTagWireType(i);
            if (tagWireType == 0) {
                m37046f();
                return true;
            } else if (tagWireType == 1) {
                skipRawBytes(8);
                return true;
            } else if (tagWireType == 2) {
                skipRawBytes(readRawVarint32());
                return true;
            } else if (tagWireType == 3) {
                skipMessage();
                checkLastTagWas(WireFormat.m35424a(WireFormat.getTagFieldNumber(i), 4));
                return true;
            } else if (tagWireType != 4) {
                if (tagWireType == 5) {
                    skipRawBytes(4);
                    return true;
                }
                throw InvalidProtocolBufferException.invalidWireType();
            } else {
                return false;
            }
        }

        @Override // com.google.protobuf.CodedInputStream
        public void skipMessage() {
            int readTag;
            do {
                readTag = readTag();
                if (readTag == 0) {
                    return;
                }
            } while (skipField(readTag));
        }

        @Override // com.google.protobuf.CodedInputStream
        public void skipRawBytes(int i) {
            if (i >= 0) {
                int i2 = this.f57216i;
                int i3 = this.f57218k;
                if (i <= i2 - i3) {
                    this.f57218k = i3 + i;
                    return;
                }
            }
            if (i < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }

        public C8841b(byte[] bArr, int i, int i2, boolean z) {
            super();
            this.f57222o = Integer.MAX_VALUE;
            this.f57214g = bArr;
            this.f57216i = i2 + i;
            this.f57218k = i;
            this.f57219l = i;
            this.f57215h = z;
        }

        @Override // com.google.protobuf.CodedInputStream
        public void skipMessage(CodedOutputStream codedOutputStream) {
            int readTag;
            do {
                readTag = readTag();
                if (readTag == 0) {
                    return;
                }
            } while (skipField(readTag, codedOutputStream));
        }

        @Override // com.google.protobuf.CodedInputStream
        public MessageLite readGroup(int i, Parser parser, ExtensionRegistryLite extensionRegistryLite) {
            checkRecursionLimit();
            this.f57209a++;
            MessageLite messageLite = (MessageLite) parser.parsePartialFrom(this, extensionRegistryLite);
            checkLastTagWas(WireFormat.m35424a(i, 4));
            this.f57209a--;
            return messageLite;
        }

        @Override // com.google.protobuf.CodedInputStream
        public boolean skipField(int i, CodedOutputStream codedOutputStream) {
            int tagWireType = WireFormat.getTagWireType(i);
            if (tagWireType == 0) {
                long readInt64 = readInt64();
                codedOutputStream.writeUInt32NoTag(i);
                codedOutputStream.writeUInt64NoTag(readInt64);
                return true;
            } else if (tagWireType == 1) {
                long readRawLittleEndian64 = readRawLittleEndian64();
                codedOutputStream.writeUInt32NoTag(i);
                codedOutputStream.writeFixed64NoTag(readRawLittleEndian64);
                return true;
            } else if (tagWireType == 2) {
                ByteString readBytes = readBytes();
                codedOutputStream.writeUInt32NoTag(i);
                codedOutputStream.writeBytesNoTag(readBytes);
                return true;
            } else if (tagWireType == 3) {
                codedOutputStream.writeUInt32NoTag(i);
                skipMessage(codedOutputStream);
                int m35424a = WireFormat.m35424a(WireFormat.getTagFieldNumber(i), 4);
                checkLastTagWas(m35424a);
                codedOutputStream.writeUInt32NoTag(m35424a);
                return true;
            } else if (tagWireType != 4) {
                if (tagWireType == 5) {
                    int readRawLittleEndian32 = readRawLittleEndian32();
                    codedOutputStream.writeUInt32NoTag(i);
                    codedOutputStream.writeFixed32NoTag(readRawLittleEndian32);
                    return true;
                }
                throw InvalidProtocolBufferException.invalidWireType();
            } else {
                return false;
            }
        }

        @Override // com.google.protobuf.CodedInputStream
        public MessageLite readMessage(Parser parser, ExtensionRegistryLite extensionRegistryLite) {
            int readRawVarint32 = readRawVarint32();
            checkRecursionLimit();
            int pushLimit = pushLimit(readRawVarint32);
            this.f57209a++;
            MessageLite messageLite = (MessageLite) parser.parsePartialFrom(this, extensionRegistryLite);
            checkLastTagWas(0);
            this.f57209a--;
            if (getBytesUntilLimit() == 0) {
                popLimit(pushLimit);
                return messageLite;
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }
    }

    /* renamed from: com.google.protobuf.CodedInputStream$c */
    /* loaded from: classes4.dex */
    public static final class C8842c extends CodedInputStream {

        /* renamed from: g */
        public final Iterable f57223g;

        /* renamed from: h */
        public final Iterator f57224h;

        /* renamed from: i */
        public ByteBuffer f57225i;

        /* renamed from: j */
        public final boolean f57226j;

        /* renamed from: k */
        public boolean f57227k;

        /* renamed from: l */
        public int f57228l;

        /* renamed from: m */
        public int f57229m;

        /* renamed from: n */
        public int f57230n;

        /* renamed from: o */
        public int f57231o;

        /* renamed from: p */
        public int f57232p;

        /* renamed from: q */
        public int f57233q;

        /* renamed from: r */
        public long f57234r;

        /* renamed from: s */
        public long f57235s;

        /* renamed from: t */
        public long f57236t;

        /* renamed from: u */
        public long f57237u;

        /* renamed from: h */
        private void m37039h() {
            int i = this.f57228l + this.f57229m;
            this.f57228l = i;
            int i2 = i - this.f57233q;
            int i3 = this.f57230n;
            if (i2 > i3) {
                int i4 = i2 - i3;
                this.f57229m = i4;
                this.f57228l = i - i4;
                return;
            }
            this.f57229m = 0;
        }

        /* renamed from: j */
        private void m37037j() {
            for (int i = 0; i < 10; i++) {
                if (readRawByte() >= 0) {
                    return;
                }
            }
            throw InvalidProtocolBufferException.malformedVarint();
        }

        @Override // com.google.protobuf.CodedInputStream
        public void checkLastTagWas(int i) {
            if (this.f57231o == i) {
                return;
            }
            throw InvalidProtocolBufferException.invalidEndTag();
        }

        /* renamed from: d */
        public final long m37043d() {
            return this.f57237u - this.f57234r;
        }

        /* renamed from: e */
        public final void m37042e() {
            if (this.f57224h.hasNext()) {
                m37035l();
                return;
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }

        @Override // com.google.protobuf.CodedInputStream
        public void enableAliasing(boolean z) {
            this.f57227k = z;
        }

        /* renamed from: f */
        public final void m37041f(byte[] bArr, int i, int i2) {
            if (i2 >= 0 && i2 <= m37038i()) {
                int i3 = i2;
                while (i3 > 0) {
                    if (m37043d() == 0) {
                        m37042e();
                    }
                    int min = Math.min(i3, (int) m37043d());
                    long j = min;
                    AbstractC22806wY1.m785p(this.f57234r, bArr, (i2 - i3) + i, j);
                    i3 -= min;
                    this.f57234r += j;
                }
            } else if (i2 <= 0) {
                if (i2 == 0) {
                    return;
                }
                throw InvalidProtocolBufferException.negativeSize();
            } else {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
        }

        /* renamed from: g */
        public long m37040g() {
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

        @Override // com.google.protobuf.CodedInputStream
        public int getBytesUntilLimit() {
            int i = this.f57230n;
            if (i == Integer.MAX_VALUE) {
                return -1;
            }
            return i - getTotalBytesRead();
        }

        @Override // com.google.protobuf.CodedInputStream
        public int getLastTag() {
            return this.f57231o;
        }

        @Override // com.google.protobuf.CodedInputStream
        public int getTotalBytesRead() {
            return (int) (((this.f57232p - this.f57233q) + this.f57234r) - this.f57235s);
        }

        /* renamed from: i */
        public final int m37038i() {
            return (int) (((this.f57228l - this.f57232p) - this.f57234r) + this.f57235s);
        }

        @Override // com.google.protobuf.CodedInputStream
        public boolean isAtEnd() {
            if ((this.f57232p + this.f57234r) - this.f57235s == this.f57228l) {
                return true;
            }
            return false;
        }

        /* renamed from: k */
        public final ByteBuffer m37036k(int i, int i2) {
            int position = this.f57225i.position();
            int limit = this.f57225i.limit();
            ByteBuffer byteBuffer = this.f57225i;
            try {
                try {
                    byteBuffer.position(i);
                    byteBuffer.limit(i2);
                    return this.f57225i.slice();
                } catch (IllegalArgumentException unused) {
                    throw InvalidProtocolBufferException.truncatedMessage();
                }
            } finally {
                byteBuffer.position(position);
                byteBuffer.limit(limit);
            }
        }

        /* renamed from: l */
        public final void m37035l() {
            ByteBuffer byteBuffer = (ByteBuffer) this.f57224h.next();
            this.f57225i = byteBuffer;
            this.f57232p += (int) (this.f57234r - this.f57235s);
            long position = byteBuffer.position();
            this.f57234r = position;
            this.f57235s = position;
            this.f57237u = this.f57225i.limit();
            long m790k = AbstractC22806wY1.m790k(this.f57225i);
            this.f57236t = m790k;
            this.f57234r += m790k;
            this.f57235s += m790k;
            this.f57237u += m790k;
        }

        @Override // com.google.protobuf.CodedInputStream
        public void popLimit(int i) {
            this.f57230n = i;
            m37039h();
        }

        @Override // com.google.protobuf.CodedInputStream
        public int pushLimit(int i) {
            if (i >= 0) {
                int totalBytesRead = i + getTotalBytesRead();
                int i2 = this.f57230n;
                if (totalBytesRead <= i2) {
                    this.f57230n = totalBytesRead;
                    m37039h();
                    return i2;
                }
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            throw InvalidProtocolBufferException.negativeSize();
        }

        @Override // com.google.protobuf.CodedInputStream
        public boolean readBool() {
            if (readRawVarint64() != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.protobuf.CodedInputStream
        public byte[] readByteArray() {
            return readRawBytes(readRawVarint32());
        }

        @Override // com.google.protobuf.CodedInputStream
        public ByteBuffer readByteBuffer() {
            int readRawVarint32 = readRawVarint32();
            if (readRawVarint32 > 0) {
                long j = readRawVarint32;
                if (j <= m37043d()) {
                    if (!this.f57226j && this.f57227k) {
                        long j2 = this.f57234r + j;
                        this.f57234r = j2;
                        long j3 = this.f57236t;
                        return m37036k((int) ((j2 - j3) - j), (int) (j2 - j3));
                    }
                    byte[] bArr = new byte[readRawVarint32];
                    AbstractC22806wY1.m785p(this.f57234r, bArr, 0L, j);
                    this.f57234r += j;
                    return ByteBuffer.wrap(bArr);
                }
            }
            if (readRawVarint32 > 0 && readRawVarint32 <= m37038i()) {
                byte[] bArr2 = new byte[readRawVarint32];
                m37041f(bArr2, 0, readRawVarint32);
                return ByteBuffer.wrap(bArr2);
            } else if (readRawVarint32 == 0) {
                return Internal.EMPTY_BYTE_BUFFER;
            } else {
                if (readRawVarint32 < 0) {
                    throw InvalidProtocolBufferException.negativeSize();
                }
                throw InvalidProtocolBufferException.truncatedMessage();
            }
        }

        @Override // com.google.protobuf.CodedInputStream
        public ByteString readBytes() {
            int readRawVarint32 = readRawVarint32();
            if (readRawVarint32 > 0) {
                long j = readRawVarint32;
                long j2 = this.f57237u;
                long j3 = this.f57234r;
                if (j <= j2 - j3) {
                    if (this.f57226j && this.f57227k) {
                        int i = (int) (j3 - this.f57236t);
                        ByteString wrap = ByteString.wrap(m37036k(i, readRawVarint32 + i));
                        this.f57234r += j;
                        return wrap;
                    }
                    byte[] bArr = new byte[readRawVarint32];
                    AbstractC22806wY1.m785p(j3, bArr, 0L, j);
                    this.f57234r += j;
                    return ByteString.wrap(bArr);
                }
            }
            if (readRawVarint32 > 0 && readRawVarint32 <= m37038i()) {
                if (this.f57226j && this.f57227k) {
                    ArrayList arrayList = new ArrayList();
                    while (readRawVarint32 > 0) {
                        if (m37043d() == 0) {
                            m37042e();
                        }
                        int min = Math.min(readRawVarint32, (int) m37043d());
                        int i2 = (int) (this.f57234r - this.f57236t);
                        arrayList.add(ByteString.wrap(m37036k(i2, i2 + min)));
                        readRawVarint32 -= min;
                        this.f57234r += min;
                    }
                    return ByteString.copyFrom(arrayList);
                }
                byte[] bArr2 = new byte[readRawVarint32];
                m37041f(bArr2, 0, readRawVarint32);
                return ByteString.wrap(bArr2);
            } else if (readRawVarint32 == 0) {
                return ByteString.EMPTY;
            } else {
                if (readRawVarint32 < 0) {
                    throw InvalidProtocolBufferException.negativeSize();
                }
                throw InvalidProtocolBufferException.truncatedMessage();
            }
        }

        @Override // com.google.protobuf.CodedInputStream
        public double readDouble() {
            return Double.longBitsToDouble(readRawLittleEndian64());
        }

        @Override // com.google.protobuf.CodedInputStream
        public int readEnum() {
            return readRawVarint32();
        }

        @Override // com.google.protobuf.CodedInputStream
        public int readFixed32() {
            return readRawLittleEndian32();
        }

        @Override // com.google.protobuf.CodedInputStream
        public long readFixed64() {
            return readRawLittleEndian64();
        }

        @Override // com.google.protobuf.CodedInputStream
        public float readFloat() {
            return Float.intBitsToFloat(readRawLittleEndian32());
        }

        @Override // com.google.protobuf.CodedInputStream
        public void readGroup(int i, MessageLite.Builder builder, ExtensionRegistryLite extensionRegistryLite) {
            checkRecursionLimit();
            this.f57209a++;
            builder.mergeFrom(this, extensionRegistryLite);
            checkLastTagWas(WireFormat.m35424a(i, 4));
            this.f57209a--;
        }

        @Override // com.google.protobuf.CodedInputStream
        public int readInt32() {
            return readRawVarint32();
        }

        @Override // com.google.protobuf.CodedInputStream
        public long readInt64() {
            return readRawVarint64();
        }

        @Override // com.google.protobuf.CodedInputStream
        public void readMessage(MessageLite.Builder builder, ExtensionRegistryLite extensionRegistryLite) {
            int readRawVarint32 = readRawVarint32();
            checkRecursionLimit();
            int pushLimit = pushLimit(readRawVarint32);
            this.f57209a++;
            builder.mergeFrom(this, extensionRegistryLite);
            checkLastTagWas(0);
            this.f57209a--;
            if (getBytesUntilLimit() == 0) {
                popLimit(pushLimit);
                return;
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }

        @Override // com.google.protobuf.CodedInputStream
        public byte readRawByte() {
            if (m37043d() == 0) {
                m37042e();
            }
            long j = this.f57234r;
            this.f57234r = 1 + j;
            return AbstractC22806wY1.m777x(j);
        }

        @Override // com.google.protobuf.CodedInputStream
        public byte[] readRawBytes(int i) {
            if (i >= 0) {
                long j = i;
                if (j <= m37043d()) {
                    byte[] bArr = new byte[i];
                    AbstractC22806wY1.m785p(this.f57234r, bArr, 0L, j);
                    this.f57234r += j;
                    return bArr;
                }
            }
            if (i >= 0 && i <= m37038i()) {
                byte[] bArr2 = new byte[i];
                m37041f(bArr2, 0, i);
                return bArr2;
            } else if (i <= 0) {
                if (i == 0) {
                    return Internal.EMPTY_BYTE_ARRAY;
                }
                throw InvalidProtocolBufferException.negativeSize();
            } else {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
        }

        @Override // com.google.protobuf.CodedInputStream
        public int readRawLittleEndian32() {
            if (m37043d() >= 4) {
                long j = this.f57234r;
                this.f57234r = 4 + j;
                return ((AbstractC22806wY1.m777x(j + 3) & 255) << 24) | (AbstractC22806wY1.m777x(j) & 255) | ((AbstractC22806wY1.m777x(1 + j) & 255) << 8) | ((AbstractC22806wY1.m777x(2 + j) & 255) << 16);
            }
            return (readRawByte() & 255) | ((readRawByte() & 255) << 8) | ((readRawByte() & 255) << 16) | ((readRawByte() & 255) << 24);
        }

        @Override // com.google.protobuf.CodedInputStream
        public long readRawLittleEndian64() {
            if (m37043d() >= 8) {
                long j = this.f57234r;
                this.f57234r = 8 + j;
                long m777x = (AbstractC22806wY1.m777x(j) & 255) | ((AbstractC22806wY1.m777x(1 + j) & 255) << 8);
                return ((AbstractC22806wY1.m777x(j + 7) & 255) << 56) | ((AbstractC22806wY1.m777x(2 + j) & 255) << 16) | m777x | ((AbstractC22806wY1.m777x(3 + j) & 255) << 24) | ((AbstractC22806wY1.m777x(4 + j) & 255) << 32) | ((AbstractC22806wY1.m777x(5 + j) & 255) << 40) | ((AbstractC22806wY1.m777x(6 + j) & 255) << 48);
            }
            return (readRawByte() & 255) | ((readRawByte() & 255) << 8) | ((readRawByte() & 255) << 16) | ((readRawByte() & 255) << 24) | ((readRawByte() & 255) << 32) | ((readRawByte() & 255) << 40) | ((readRawByte() & 255) << 48) | ((readRawByte() & 255) << 56);
        }

        @Override // com.google.protobuf.CodedInputStream
        public int readRawVarint32() {
            int i;
            long j = this.f57234r;
            if (this.f57237u != j) {
                long j2 = j + 1;
                byte m777x = AbstractC22806wY1.m777x(j);
                if (m777x >= 0) {
                    this.f57234r++;
                    return m777x;
                } else if (this.f57237u - this.f57234r >= 10) {
                    long j3 = 2 + j;
                    int m777x2 = (AbstractC22806wY1.m777x(j2) << 7) ^ m777x;
                    if (m777x2 < 0) {
                        i = m777x2 ^ (-128);
                    } else {
                        long j4 = 3 + j;
                        int m777x3 = (AbstractC22806wY1.m777x(j3) << 14) ^ m777x2;
                        if (m777x3 >= 0) {
                            i = m777x3 ^ 16256;
                        } else {
                            long j5 = 4 + j;
                            int m777x4 = m777x3 ^ (AbstractC22806wY1.m777x(j4) << Ascii.NAK);
                            if (m777x4 < 0) {
                                i = (-2080896) ^ m777x4;
                            } else {
                                j4 = 5 + j;
                                byte m777x5 = AbstractC22806wY1.m777x(j5);
                                int i2 = (m777x4 ^ (m777x5 << Ascii.f52686FS)) ^ 266354560;
                                if (m777x5 < 0) {
                                    j5 = 6 + j;
                                    if (AbstractC22806wY1.m777x(j4) < 0) {
                                        j4 = 7 + j;
                                        if (AbstractC22806wY1.m777x(j5) < 0) {
                                            j5 = 8 + j;
                                            if (AbstractC22806wY1.m777x(j4) < 0) {
                                                j4 = 9 + j;
                                                if (AbstractC22806wY1.m777x(j5) < 0) {
                                                    long j6 = j + 10;
                                                    if (AbstractC22806wY1.m777x(j4) >= 0) {
                                                        i = i2;
                                                        j3 = j6;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    i = i2;
                                }
                                i = i2;
                            }
                            j3 = j5;
                        }
                        j3 = j4;
                    }
                    this.f57234r = j3;
                    return i;
                }
            }
            return (int) m37040g();
        }

        @Override // com.google.protobuf.CodedInputStream
        public long readRawVarint64() {
            long j;
            long j2;
            long j3;
            long j4 = this.f57234r;
            if (this.f57237u != j4) {
                long j5 = j4 + 1;
                byte m777x = AbstractC22806wY1.m777x(j4);
                if (m777x >= 0) {
                    this.f57234r++;
                    return m777x;
                } else if (this.f57237u - this.f57234r >= 10) {
                    long j6 = 2 + j4;
                    int m777x2 = (AbstractC22806wY1.m777x(j5) << 7) ^ m777x;
                    if (m777x2 < 0) {
                        j = m777x2 ^ (-128);
                    } else {
                        long j7 = 3 + j4;
                        int m777x3 = (AbstractC22806wY1.m777x(j6) << 14) ^ m777x2;
                        if (m777x3 >= 0) {
                            j = m777x3 ^ 16256;
                            j6 = j7;
                        } else {
                            long j8 = 4 + j4;
                            int m777x4 = m777x3 ^ (AbstractC22806wY1.m777x(j7) << Ascii.NAK);
                            if (m777x4 < 0) {
                                j = (-2080896) ^ m777x4;
                                j6 = j8;
                            } else {
                                long j9 = 5 + j4;
                                long m777x5 = (AbstractC22806wY1.m777x(j8) << 28) ^ m777x4;
                                if (m777x5 >= 0) {
                                    j3 = 266354560;
                                } else {
                                    long j10 = 6 + j4;
                                    long m777x6 = m777x5 ^ (AbstractC22806wY1.m777x(j9) << 35);
                                    if (m777x6 < 0) {
                                        j2 = -34093383808L;
                                    } else {
                                        j9 = 7 + j4;
                                        m777x5 = m777x6 ^ (AbstractC22806wY1.m777x(j10) << 42);
                                        if (m777x5 >= 0) {
                                            j3 = 4363953127296L;
                                        } else {
                                            j10 = 8 + j4;
                                            m777x6 = m777x5 ^ (AbstractC22806wY1.m777x(j9) << 49);
                                            if (m777x6 < 0) {
                                                j2 = -558586000294016L;
                                            } else {
                                                j9 = 9 + j4;
                                                long m777x7 = (m777x6 ^ (AbstractC22806wY1.m777x(j10) << 56)) ^ 71499008037633920L;
                                                if (m777x7 < 0) {
                                                    long j11 = j4 + 10;
                                                    if (AbstractC22806wY1.m777x(j9) >= 0) {
                                                        j = m777x7;
                                                        j6 = j11;
                                                    }
                                                } else {
                                                    j = m777x7;
                                                    j6 = j9;
                                                }
                                            }
                                        }
                                    }
                                    j = j2 ^ m777x6;
                                    j6 = j10;
                                }
                                j = j3 ^ m777x5;
                                j6 = j9;
                            }
                        }
                    }
                    this.f57234r = j6;
                    return j;
                }
            }
            return m37040g();
        }

        @Override // com.google.protobuf.CodedInputStream
        public int readSFixed32() {
            return readRawLittleEndian32();
        }

        @Override // com.google.protobuf.CodedInputStream
        public long readSFixed64() {
            return readRawLittleEndian64();
        }

        @Override // com.google.protobuf.CodedInputStream
        public int readSInt32() {
            return CodedInputStream.decodeZigZag32(readRawVarint32());
        }

        @Override // com.google.protobuf.CodedInputStream
        public long readSInt64() {
            return CodedInputStream.decodeZigZag64(readRawVarint64());
        }

        @Override // com.google.protobuf.CodedInputStream
        public String readString() {
            int readRawVarint32 = readRawVarint32();
            if (readRawVarint32 > 0) {
                long j = readRawVarint32;
                long j2 = this.f57237u;
                long j3 = this.f57234r;
                if (j <= j2 - j3) {
                    byte[] bArr = new byte[readRawVarint32];
                    AbstractC22806wY1.m785p(j3, bArr, 0L, j);
                    String str = new String(bArr, Internal.f57358b);
                    this.f57234r += j;
                    return str;
                }
            }
            if (readRawVarint32 > 0 && readRawVarint32 <= m37038i()) {
                byte[] bArr2 = new byte[readRawVarint32];
                m37041f(bArr2, 0, readRawVarint32);
                return new String(bArr2, Internal.f57358b);
            } else if (readRawVarint32 == 0) {
                return "";
            } else {
                if (readRawVarint32 < 0) {
                    throw InvalidProtocolBufferException.negativeSize();
                }
                throw InvalidProtocolBufferException.truncatedMessage();
            }
        }

        @Override // com.google.protobuf.CodedInputStream
        public String readStringRequireUtf8() {
            int readRawVarint32 = readRawVarint32();
            if (readRawVarint32 > 0) {
                long j = readRawVarint32;
                long j2 = this.f57237u;
                long j3 = this.f57234r;
                if (j <= j2 - j3) {
                    String m35518g = Utf8.m35518g(this.f57225i, (int) (j3 - this.f57235s), readRawVarint32);
                    this.f57234r += j;
                    return m35518g;
                }
            }
            if (readRawVarint32 >= 0 && readRawVarint32 <= m37038i()) {
                byte[] bArr = new byte[readRawVarint32];
                m37041f(bArr, 0, readRawVarint32);
                return Utf8.m35517h(bArr, 0, readRawVarint32);
            } else if (readRawVarint32 == 0) {
                return "";
            } else {
                if (readRawVarint32 <= 0) {
                    throw InvalidProtocolBufferException.negativeSize();
                }
                throw InvalidProtocolBufferException.truncatedMessage();
            }
        }

        @Override // com.google.protobuf.CodedInputStream
        public int readTag() {
            if (isAtEnd()) {
                this.f57231o = 0;
                return 0;
            }
            int readRawVarint32 = readRawVarint32();
            this.f57231o = readRawVarint32;
            if (WireFormat.getTagFieldNumber(readRawVarint32) != 0) {
                return this.f57231o;
            }
            throw InvalidProtocolBufferException.invalidTag();
        }

        @Override // com.google.protobuf.CodedInputStream
        public int readUInt32() {
            return readRawVarint32();
        }

        @Override // com.google.protobuf.CodedInputStream
        public long readUInt64() {
            return readRawVarint64();
        }

        @Override // com.google.protobuf.CodedInputStream
        public void readUnknownGroup(int i, MessageLite.Builder builder) {
            readGroup(i, builder, ExtensionRegistryLite.getEmptyRegistry());
        }

        @Override // com.google.protobuf.CodedInputStream
        public void resetSizeCounter() {
            this.f57233q = (int) ((this.f57232p + this.f57234r) - this.f57235s);
        }

        @Override // com.google.protobuf.CodedInputStream
        public boolean skipField(int i) {
            int tagWireType = WireFormat.getTagWireType(i);
            if (tagWireType == 0) {
                m37037j();
                return true;
            } else if (tagWireType == 1) {
                skipRawBytes(8);
                return true;
            } else if (tagWireType == 2) {
                skipRawBytes(readRawVarint32());
                return true;
            } else if (tagWireType == 3) {
                skipMessage();
                checkLastTagWas(WireFormat.m35424a(WireFormat.getTagFieldNumber(i), 4));
                return true;
            } else if (tagWireType != 4) {
                if (tagWireType == 5) {
                    skipRawBytes(4);
                    return true;
                }
                throw InvalidProtocolBufferException.invalidWireType();
            } else {
                return false;
            }
        }

        @Override // com.google.protobuf.CodedInputStream
        public void skipMessage() {
            int readTag;
            do {
                readTag = readTag();
                if (readTag == 0) {
                    return;
                }
            } while (skipField(readTag));
        }

        @Override // com.google.protobuf.CodedInputStream
        public void skipRawBytes(int i) {
            if (i >= 0 && i <= ((this.f57228l - this.f57232p) - this.f57234r) + this.f57235s) {
                while (i > 0) {
                    if (m37043d() == 0) {
                        m37042e();
                    }
                    int min = Math.min(i, (int) m37043d());
                    i -= min;
                    this.f57234r += min;
                }
            } else if (i < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            } else {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
        }

        public C8842c(Iterable iterable, int i, boolean z) {
            super();
            this.f57230n = Integer.MAX_VALUE;
            this.f57228l = i;
            this.f57223g = iterable;
            this.f57224h = iterable.iterator();
            this.f57226j = z;
            this.f57232p = 0;
            this.f57233q = 0;
            if (i == 0) {
                this.f57225i = Internal.EMPTY_BYTE_BUFFER;
                this.f57234r = 0L;
                this.f57235s = 0L;
                this.f57237u = 0L;
                this.f57236t = 0L;
                return;
            }
            m37035l();
        }

        @Override // com.google.protobuf.CodedInputStream
        public void skipMessage(CodedOutputStream codedOutputStream) {
            int readTag;
            do {
                readTag = readTag();
                if (readTag == 0) {
                    return;
                }
            } while (skipField(readTag, codedOutputStream));
        }

        @Override // com.google.protobuf.CodedInputStream
        public MessageLite readGroup(int i, Parser parser, ExtensionRegistryLite extensionRegistryLite) {
            checkRecursionLimit();
            this.f57209a++;
            MessageLite messageLite = (MessageLite) parser.parsePartialFrom(this, extensionRegistryLite);
            checkLastTagWas(WireFormat.m35424a(i, 4));
            this.f57209a--;
            return messageLite;
        }

        @Override // com.google.protobuf.CodedInputStream
        public boolean skipField(int i, CodedOutputStream codedOutputStream) {
            int tagWireType = WireFormat.getTagWireType(i);
            if (tagWireType == 0) {
                long readInt64 = readInt64();
                codedOutputStream.writeUInt32NoTag(i);
                codedOutputStream.writeUInt64NoTag(readInt64);
                return true;
            } else if (tagWireType == 1) {
                long readRawLittleEndian64 = readRawLittleEndian64();
                codedOutputStream.writeUInt32NoTag(i);
                codedOutputStream.writeFixed64NoTag(readRawLittleEndian64);
                return true;
            } else if (tagWireType == 2) {
                ByteString readBytes = readBytes();
                codedOutputStream.writeUInt32NoTag(i);
                codedOutputStream.writeBytesNoTag(readBytes);
                return true;
            } else if (tagWireType == 3) {
                codedOutputStream.writeUInt32NoTag(i);
                skipMessage(codedOutputStream);
                int m35424a = WireFormat.m35424a(WireFormat.getTagFieldNumber(i), 4);
                checkLastTagWas(m35424a);
                codedOutputStream.writeUInt32NoTag(m35424a);
                return true;
            } else if (tagWireType != 4) {
                if (tagWireType == 5) {
                    int readRawLittleEndian32 = readRawLittleEndian32();
                    codedOutputStream.writeUInt32NoTag(i);
                    codedOutputStream.writeFixed32NoTag(readRawLittleEndian32);
                    return true;
                }
                throw InvalidProtocolBufferException.invalidWireType();
            } else {
                return false;
            }
        }

        @Override // com.google.protobuf.CodedInputStream
        public MessageLite readMessage(Parser parser, ExtensionRegistryLite extensionRegistryLite) {
            int readRawVarint32 = readRawVarint32();
            checkRecursionLimit();
            int pushLimit = pushLimit(readRawVarint32);
            this.f57209a++;
            MessageLite messageLite = (MessageLite) parser.parsePartialFrom(this, extensionRegistryLite);
            checkLastTagWas(0);
            this.f57209a--;
            if (getBytesUntilLimit() == 0) {
                popLimit(pushLimit);
                return messageLite;
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }
    }

    /* renamed from: com.google.protobuf.CodedInputStream$d */
    /* loaded from: classes4.dex */
    public static final class C8843d extends CodedInputStream {

        /* renamed from: g */
        public final InputStream f57238g;

        /* renamed from: h */
        public final byte[] f57239h;

        /* renamed from: i */
        public int f57240i;

        /* renamed from: j */
        public int f57241j;

        /* renamed from: k */
        public int f57242k;

        /* renamed from: l */
        public int f57243l;

        /* renamed from: m */
        public int f57244m;

        /* renamed from: n */
        public int f57245n;

        /* renamed from: d */
        public static int m37034d(InputStream inputStream) {
            try {
                return inputStream.available();
            } catch (InvalidProtocolBufferException e) {
                e.setThrownFromInputStream();
                throw e;
            }
        }

        /* renamed from: e */
        public static int m37033e(InputStream inputStream, byte[] bArr, int i, int i2) {
            try {
                return inputStream.read(bArr, i, i2);
            } catch (InvalidProtocolBufferException e) {
                e.setThrownFromInputStream();
                throw e;
            }
        }

        /* renamed from: k */
        private void m37027k() {
            int i = this.f57240i + this.f57241j;
            this.f57240i = i;
            int i2 = this.f57244m + i;
            int i3 = this.f57245n;
            if (i2 > i3) {
                int i4 = i2 - i3;
                this.f57241j = i4;
                this.f57240i = i - i4;
                return;
            }
            this.f57241j = 0;
        }

        /* renamed from: m */
        public static long m37025m(InputStream inputStream, long j) {
            try {
                return inputStream.skip(j);
            } catch (InvalidProtocolBufferException e) {
                e.setThrownFromInputStream();
                throw e;
            }
        }

        /* renamed from: o */
        private void m37023o() {
            if (this.f57240i - this.f57242k >= 10) {
                m37022p();
            } else {
                m37021q();
            }
        }

        /* renamed from: p */
        private void m37022p() {
            for (int i = 0; i < 10; i++) {
                byte[] bArr = this.f57239h;
                int i2 = this.f57242k;
                this.f57242k = i2 + 1;
                if (bArr[i2] >= 0) {
                    return;
                }
            }
            throw InvalidProtocolBufferException.malformedVarint();
        }

        /* renamed from: q */
        private void m37021q() {
            for (int i = 0; i < 10; i++) {
                if (readRawByte() >= 0) {
                    return;
                }
            }
            throw InvalidProtocolBufferException.malformedVarint();
        }

        @Override // com.google.protobuf.CodedInputStream
        public void checkLastTagWas(int i) {
            if (this.f57243l == i) {
                return;
            }
            throw InvalidProtocolBufferException.invalidEndTag();
        }

        @Override // com.google.protobuf.CodedInputStream
        public void enableAliasing(boolean z) {
        }

        /* renamed from: f */
        public final ByteString m37032f(int i) {
            byte[] m37030h = m37030h(i);
            if (m37030h != null) {
                return ByteString.copyFrom(m37030h);
            }
            int i2 = this.f57242k;
            int i3 = this.f57240i;
            int i4 = i3 - i2;
            this.f57244m += i3;
            this.f57242k = 0;
            this.f57240i = 0;
            List<byte[]> m37029i = m37029i(i - i4);
            byte[] bArr = new byte[i];
            System.arraycopy(this.f57239h, i2, bArr, 0, i4);
            for (byte[] bArr2 : m37029i) {
                System.arraycopy(bArr2, 0, bArr, i4, bArr2.length);
                i4 += bArr2.length;
            }
            return ByteString.wrap(bArr);
        }

        /* renamed from: g */
        public final byte[] m37031g(int i, boolean z) {
            byte[] m37030h = m37030h(i);
            if (m37030h != null) {
                if (z) {
                    return (byte[]) m37030h.clone();
                }
                return m37030h;
            }
            int i2 = this.f57242k;
            int i3 = this.f57240i;
            int i4 = i3 - i2;
            this.f57244m += i3;
            this.f57242k = 0;
            this.f57240i = 0;
            List<byte[]> m37029i = m37029i(i - i4);
            byte[] bArr = new byte[i];
            System.arraycopy(this.f57239h, i2, bArr, 0, i4);
            for (byte[] bArr2 : m37029i) {
                System.arraycopy(bArr2, 0, bArr, i4, bArr2.length);
                i4 += bArr2.length;
            }
            return bArr;
        }

        @Override // com.google.protobuf.CodedInputStream
        public int getBytesUntilLimit() {
            int i = this.f57245n;
            if (i == Integer.MAX_VALUE) {
                return -1;
            }
            return i - (this.f57244m + this.f57242k);
        }

        @Override // com.google.protobuf.CodedInputStream
        public int getLastTag() {
            return this.f57243l;
        }

        @Override // com.google.protobuf.CodedInputStream
        public int getTotalBytesRead() {
            return this.f57244m + this.f57242k;
        }

        /* renamed from: h */
        public final byte[] m37030h(int i) {
            if (i == 0) {
                return Internal.EMPTY_BYTE_ARRAY;
            }
            if (i >= 0) {
                int i2 = this.f57244m;
                int i3 = this.f57242k;
                int i4 = i2 + i3 + i;
                if (i4 - this.f57211c <= 0) {
                    int i5 = this.f57245n;
                    if (i4 <= i5) {
                        int i6 = this.f57240i - i3;
                        int i7 = i - i6;
                        if (i7 >= 4096 && i7 > m37034d(this.f57238g)) {
                            return null;
                        }
                        byte[] bArr = new byte[i];
                        System.arraycopy(this.f57239h, this.f57242k, bArr, 0, i6);
                        this.f57244m += this.f57240i;
                        this.f57242k = 0;
                        this.f57240i = 0;
                        while (i6 < i) {
                            int m37033e = m37033e(this.f57238g, bArr, i6, i - i6);
                            if (m37033e != -1) {
                                this.f57244m += m37033e;
                                i6 += m37033e;
                            } else {
                                throw InvalidProtocolBufferException.truncatedMessage();
                            }
                        }
                        return bArr;
                    }
                    skipRawBytes((i5 - i2) - i3);
                    throw InvalidProtocolBufferException.truncatedMessage();
                }
                throw InvalidProtocolBufferException.sizeLimitExceeded();
            }
            throw InvalidProtocolBufferException.negativeSize();
        }

        /* renamed from: i */
        public final List m37029i(int i) {
            ArrayList arrayList = new ArrayList();
            while (i > 0) {
                int min = Math.min(i, 4096);
                byte[] bArr = new byte[min];
                int i2 = 0;
                while (i2 < min) {
                    int read = this.f57238g.read(bArr, i2, min - i2);
                    if (read != -1) {
                        this.f57244m += read;
                        i2 += read;
                    } else {
                        throw InvalidProtocolBufferException.truncatedMessage();
                    }
                }
                i -= min;
                arrayList.add(bArr);
            }
            return arrayList;
        }

        @Override // com.google.protobuf.CodedInputStream
        public boolean isAtEnd() {
            if (this.f57242k == this.f57240i && !m37020r(1)) {
                return true;
            }
            return false;
        }

        /* renamed from: j */
        public long m37028j() {
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

        /* renamed from: l */
        public final void m37026l(int i) {
            if (!m37020r(i)) {
                if (i > (this.f57211c - this.f57244m) - this.f57242k) {
                    throw InvalidProtocolBufferException.sizeLimitExceeded();
                }
                throw InvalidProtocolBufferException.truncatedMessage();
            }
        }

        /* renamed from: n */
        public final void m37024n(int i) {
            if (i >= 0) {
                int i2 = this.f57244m;
                int i3 = this.f57242k;
                int i4 = i2 + i3 + i;
                int i5 = this.f57245n;
                if (i4 <= i5) {
                    this.f57244m = i2 + i3;
                    int i6 = this.f57240i - i3;
                    this.f57240i = 0;
                    this.f57242k = 0;
                    while (i6 < i) {
                        try {
                            long j = i - i6;
                            long m37025m = m37025m(this.f57238g, j);
                            int i7 = (m37025m > 0L ? 1 : (m37025m == 0L ? 0 : -1));
                            if (i7 >= 0 && m37025m <= j) {
                                if (i7 == 0) {
                                    break;
                                }
                                i6 += (int) m37025m;
                            } else {
                                throw new IllegalStateException(this.f57238g.getClass() + "#skip returned invalid result: " + m37025m + "\nThe InputStream implementation is buggy.");
                            }
                        } finally {
                            this.f57244m += i6;
                            m37027k();
                        }
                    }
                    if (i6 < i) {
                        int i8 = this.f57240i;
                        int i9 = i8 - this.f57242k;
                        this.f57242k = i8;
                        m37026l(1);
                        while (true) {
                            int i10 = i - i9;
                            int i11 = this.f57240i;
                            if (i10 > i11) {
                                i9 += i11;
                                this.f57242k = i11;
                                m37026l(1);
                            } else {
                                this.f57242k = i10;
                                return;
                            }
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

        @Override // com.google.protobuf.CodedInputStream
        public void popLimit(int i) {
            this.f57245n = i;
            m37027k();
        }

        @Override // com.google.protobuf.CodedInputStream
        public int pushLimit(int i) {
            if (i >= 0) {
                int i2 = i + this.f57244m + this.f57242k;
                int i3 = this.f57245n;
                if (i2 <= i3) {
                    this.f57245n = i2;
                    m37027k();
                    return i3;
                }
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            throw InvalidProtocolBufferException.negativeSize();
        }

        /* renamed from: r */
        public final boolean m37020r(int i) {
            int i2 = this.f57242k;
            int i3 = i2 + i;
            int i4 = this.f57240i;
            if (i3 > i4) {
                int i5 = this.f57211c;
                int i6 = this.f57244m;
                if (i > (i5 - i6) - i2 || i6 + i2 + i > this.f57245n) {
                    return false;
                }
                if (i2 > 0) {
                    if (i4 > i2) {
                        byte[] bArr = this.f57239h;
                        System.arraycopy(bArr, i2, bArr, 0, i4 - i2);
                    }
                    this.f57244m += i2;
                    this.f57240i -= i2;
                    this.f57242k = 0;
                }
                InputStream inputStream = this.f57238g;
                byte[] bArr2 = this.f57239h;
                int i7 = this.f57240i;
                int m37033e = m37033e(inputStream, bArr2, i7, Math.min(bArr2.length - i7, (this.f57211c - this.f57244m) - i7));
                if (m37033e != 0 && m37033e >= -1 && m37033e <= this.f57239h.length) {
                    if (m37033e <= 0) {
                        return false;
                    }
                    this.f57240i += m37033e;
                    m37027k();
                    if (this.f57240i >= i) {
                        return true;
                    }
                    return m37020r(i);
                }
                throw new IllegalStateException(this.f57238g.getClass() + "#read(byte[]) returned invalid result: " + m37033e + "\nThe InputStream implementation is buggy.");
            }
            throw new IllegalStateException("refillBuffer() called when " + i + " bytes were already available in buffer");
        }

        @Override // com.google.protobuf.CodedInputStream
        public boolean readBool() {
            if (readRawVarint64() != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.protobuf.CodedInputStream
        public byte[] readByteArray() {
            int readRawVarint32 = readRawVarint32();
            int i = this.f57240i;
            int i2 = this.f57242k;
            if (readRawVarint32 <= i - i2 && readRawVarint32 > 0) {
                byte[] copyOfRange = Arrays.copyOfRange(this.f57239h, i2, i2 + readRawVarint32);
                this.f57242k += readRawVarint32;
                return copyOfRange;
            }
            return m37031g(readRawVarint32, false);
        }

        @Override // com.google.protobuf.CodedInputStream
        public ByteBuffer readByteBuffer() {
            int readRawVarint32 = readRawVarint32();
            int i = this.f57240i;
            int i2 = this.f57242k;
            if (readRawVarint32 <= i - i2 && readRawVarint32 > 0) {
                ByteBuffer wrap = ByteBuffer.wrap(Arrays.copyOfRange(this.f57239h, i2, i2 + readRawVarint32));
                this.f57242k += readRawVarint32;
                return wrap;
            } else if (readRawVarint32 == 0) {
                return Internal.EMPTY_BYTE_BUFFER;
            } else {
                return ByteBuffer.wrap(m37031g(readRawVarint32, true));
            }
        }

        @Override // com.google.protobuf.CodedInputStream
        public ByteString readBytes() {
            int readRawVarint32 = readRawVarint32();
            int i = this.f57240i;
            int i2 = this.f57242k;
            if (readRawVarint32 <= i - i2 && readRawVarint32 > 0) {
                ByteString copyFrom = ByteString.copyFrom(this.f57239h, i2, readRawVarint32);
                this.f57242k += readRawVarint32;
                return copyFrom;
            } else if (readRawVarint32 == 0) {
                return ByteString.EMPTY;
            } else {
                return m37032f(readRawVarint32);
            }
        }

        @Override // com.google.protobuf.CodedInputStream
        public double readDouble() {
            return Double.longBitsToDouble(readRawLittleEndian64());
        }

        @Override // com.google.protobuf.CodedInputStream
        public int readEnum() {
            return readRawVarint32();
        }

        @Override // com.google.protobuf.CodedInputStream
        public int readFixed32() {
            return readRawLittleEndian32();
        }

        @Override // com.google.protobuf.CodedInputStream
        public long readFixed64() {
            return readRawLittleEndian64();
        }

        @Override // com.google.protobuf.CodedInputStream
        public float readFloat() {
            return Float.intBitsToFloat(readRawLittleEndian32());
        }

        @Override // com.google.protobuf.CodedInputStream
        public void readGroup(int i, MessageLite.Builder builder, ExtensionRegistryLite extensionRegistryLite) {
            checkRecursionLimit();
            this.f57209a++;
            builder.mergeFrom(this, extensionRegistryLite);
            checkLastTagWas(WireFormat.m35424a(i, 4));
            this.f57209a--;
        }

        @Override // com.google.protobuf.CodedInputStream
        public int readInt32() {
            return readRawVarint32();
        }

        @Override // com.google.protobuf.CodedInputStream
        public long readInt64() {
            return readRawVarint64();
        }

        @Override // com.google.protobuf.CodedInputStream
        public void readMessage(MessageLite.Builder builder, ExtensionRegistryLite extensionRegistryLite) {
            int readRawVarint32 = readRawVarint32();
            checkRecursionLimit();
            int pushLimit = pushLimit(readRawVarint32);
            this.f57209a++;
            builder.mergeFrom(this, extensionRegistryLite);
            checkLastTagWas(0);
            this.f57209a--;
            if (getBytesUntilLimit() == 0) {
                popLimit(pushLimit);
                return;
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }

        @Override // com.google.protobuf.CodedInputStream
        public byte readRawByte() {
            if (this.f57242k == this.f57240i) {
                m37026l(1);
            }
            byte[] bArr = this.f57239h;
            int i = this.f57242k;
            this.f57242k = i + 1;
            return bArr[i];
        }

        @Override // com.google.protobuf.CodedInputStream
        public byte[] readRawBytes(int i) {
            int i2 = this.f57242k;
            if (i <= this.f57240i - i2 && i > 0) {
                int i3 = i + i2;
                this.f57242k = i3;
                return Arrays.copyOfRange(this.f57239h, i2, i3);
            }
            return m37031g(i, false);
        }

        @Override // com.google.protobuf.CodedInputStream
        public int readRawLittleEndian32() {
            int i = this.f57242k;
            if (this.f57240i - i < 4) {
                m37026l(4);
                i = this.f57242k;
            }
            byte[] bArr = this.f57239h;
            this.f57242k = i + 4;
            return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
        }

        @Override // com.google.protobuf.CodedInputStream
        public long readRawLittleEndian64() {
            int i = this.f57242k;
            if (this.f57240i - i < 8) {
                m37026l(8);
                i = this.f57242k;
            }
            byte[] bArr = this.f57239h;
            this.f57242k = i + 8;
            return ((bArr[i + 7] & 255) << 56) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48);
        }

        @Override // com.google.protobuf.CodedInputStream
        public int readRawVarint32() {
            int i;
            int i2 = this.f57242k;
            int i3 = this.f57240i;
            if (i3 != i2) {
                byte[] bArr = this.f57239h;
                int i4 = i2 + 1;
                byte b = bArr[i2];
                if (b >= 0) {
                    this.f57242k = i4;
                    return b;
                } else if (i3 - i4 >= 9) {
                    int i5 = i2 + 2;
                    int i6 = (bArr[i4] << 7) ^ b;
                    if (i6 < 0) {
                        i = i6 ^ (-128);
                    } else {
                        int i7 = i2 + 3;
                        int i8 = (bArr[i5] << 14) ^ i6;
                        if (i8 >= 0) {
                            i = i8 ^ 16256;
                        } else {
                            int i9 = i2 + 4;
                            int i10 = i8 ^ (bArr[i7] << Ascii.NAK);
                            if (i10 < 0) {
                                i = (-2080896) ^ i10;
                            } else {
                                i7 = i2 + 5;
                                byte b2 = bArr[i9];
                                int i11 = (i10 ^ (b2 << Ascii.f52686FS)) ^ 266354560;
                                if (b2 < 0) {
                                    i9 = i2 + 6;
                                    if (bArr[i7] < 0) {
                                        i7 = i2 + 7;
                                        if (bArr[i9] < 0) {
                                            i9 = i2 + 8;
                                            if (bArr[i7] < 0) {
                                                i7 = i2 + 9;
                                                if (bArr[i9] < 0) {
                                                    int i12 = i2 + 10;
                                                    if (bArr[i7] >= 0) {
                                                        i5 = i12;
                                                        i = i11;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    i = i11;
                                }
                                i = i11;
                            }
                            i5 = i9;
                        }
                        i5 = i7;
                    }
                    this.f57242k = i5;
                    return i;
                }
            }
            return (int) m37028j();
        }

        @Override // com.google.protobuf.CodedInputStream
        public long readRawVarint64() {
            long j;
            long j2;
            long j3;
            int i = this.f57242k;
            int i2 = this.f57240i;
            if (i2 != i) {
                byte[] bArr = this.f57239h;
                int i3 = i + 1;
                byte b = bArr[i];
                if (b >= 0) {
                    this.f57242k = i3;
                    return b;
                } else if (i2 - i3 >= 9) {
                    int i4 = i + 2;
                    int i5 = (bArr[i3] << 7) ^ b;
                    if (i5 < 0) {
                        j = i5 ^ (-128);
                    } else {
                        int i6 = i + 3;
                        int i7 = (bArr[i4] << 14) ^ i5;
                        if (i7 >= 0) {
                            j = i7 ^ 16256;
                            i4 = i6;
                        } else {
                            int i8 = i + 4;
                            int i9 = i7 ^ (bArr[i6] << Ascii.NAK);
                            if (i9 < 0) {
                                i4 = i8;
                                j = (-2080896) ^ i9;
                            } else {
                                long j4 = i9;
                                i4 = i + 5;
                                long j5 = j4 ^ (bArr[i8] << 28);
                                if (j5 >= 0) {
                                    j3 = 266354560;
                                } else {
                                    int i10 = i + 6;
                                    long j6 = j5 ^ (bArr[i4] << 35);
                                    if (j6 < 0) {
                                        j2 = -34093383808L;
                                    } else {
                                        i4 = i + 7;
                                        j5 = j6 ^ (bArr[i10] << 42);
                                        if (j5 >= 0) {
                                            j3 = 4363953127296L;
                                        } else {
                                            i10 = i + 8;
                                            j6 = j5 ^ (bArr[i4] << 49);
                                            if (j6 < 0) {
                                                j2 = -558586000294016L;
                                            } else {
                                                i4 = i + 9;
                                                long j7 = (j6 ^ (bArr[i10] << 56)) ^ 71499008037633920L;
                                                if (j7 < 0) {
                                                    int i11 = i + 10;
                                                    if (bArr[i4] >= 0) {
                                                        i4 = i11;
                                                    }
                                                }
                                                j = j7;
                                            }
                                        }
                                    }
                                    j = j6 ^ j2;
                                    i4 = i10;
                                }
                                j = j5 ^ j3;
                            }
                        }
                    }
                    this.f57242k = i4;
                    return j;
                }
            }
            return m37028j();
        }

        @Override // com.google.protobuf.CodedInputStream
        public int readSFixed32() {
            return readRawLittleEndian32();
        }

        @Override // com.google.protobuf.CodedInputStream
        public long readSFixed64() {
            return readRawLittleEndian64();
        }

        @Override // com.google.protobuf.CodedInputStream
        public int readSInt32() {
            return CodedInputStream.decodeZigZag32(readRawVarint32());
        }

        @Override // com.google.protobuf.CodedInputStream
        public long readSInt64() {
            return CodedInputStream.decodeZigZag64(readRawVarint64());
        }

        @Override // com.google.protobuf.CodedInputStream
        public String readString() {
            int readRawVarint32 = readRawVarint32();
            if (readRawVarint32 > 0) {
                int i = this.f57240i;
                int i2 = this.f57242k;
                if (readRawVarint32 <= i - i2) {
                    String str = new String(this.f57239h, i2, readRawVarint32, Internal.f57358b);
                    this.f57242k += readRawVarint32;
                    return str;
                }
            }
            if (readRawVarint32 == 0) {
                return "";
            }
            if (readRawVarint32 <= this.f57240i) {
                m37026l(readRawVarint32);
                String str2 = new String(this.f57239h, this.f57242k, readRawVarint32, Internal.f57358b);
                this.f57242k += readRawVarint32;
                return str2;
            }
            return new String(m37031g(readRawVarint32, false), Internal.f57358b);
        }

        @Override // com.google.protobuf.CodedInputStream
        public String readStringRequireUtf8() {
            byte[] m37031g;
            int readRawVarint32 = readRawVarint32();
            int i = this.f57242k;
            int i2 = this.f57240i;
            if (readRawVarint32 <= i2 - i && readRawVarint32 > 0) {
                m37031g = this.f57239h;
                this.f57242k = i + readRawVarint32;
            } else if (readRawVarint32 == 0) {
                return "";
            } else {
                i = 0;
                if (readRawVarint32 <= i2) {
                    m37026l(readRawVarint32);
                    m37031g = this.f57239h;
                    this.f57242k = readRawVarint32;
                } else {
                    m37031g = m37031g(readRawVarint32, false);
                }
            }
            return Utf8.m35517h(m37031g, i, readRawVarint32);
        }

        @Override // com.google.protobuf.CodedInputStream
        public int readTag() {
            if (isAtEnd()) {
                this.f57243l = 0;
                return 0;
            }
            int readRawVarint32 = readRawVarint32();
            this.f57243l = readRawVarint32;
            if (WireFormat.getTagFieldNumber(readRawVarint32) != 0) {
                return this.f57243l;
            }
            throw InvalidProtocolBufferException.invalidTag();
        }

        @Override // com.google.protobuf.CodedInputStream
        public int readUInt32() {
            return readRawVarint32();
        }

        @Override // com.google.protobuf.CodedInputStream
        public long readUInt64() {
            return readRawVarint64();
        }

        @Override // com.google.protobuf.CodedInputStream
        public void readUnknownGroup(int i, MessageLite.Builder builder) {
            readGroup(i, builder, ExtensionRegistryLite.getEmptyRegistry());
        }

        @Override // com.google.protobuf.CodedInputStream
        public void resetSizeCounter() {
            this.f57244m = -this.f57242k;
        }

        @Override // com.google.protobuf.CodedInputStream
        public boolean skipField(int i) {
            int tagWireType = WireFormat.getTagWireType(i);
            if (tagWireType == 0) {
                m37023o();
                return true;
            } else if (tagWireType == 1) {
                skipRawBytes(8);
                return true;
            } else if (tagWireType == 2) {
                skipRawBytes(readRawVarint32());
                return true;
            } else if (tagWireType == 3) {
                skipMessage();
                checkLastTagWas(WireFormat.m35424a(WireFormat.getTagFieldNumber(i), 4));
                return true;
            } else if (tagWireType != 4) {
                if (tagWireType == 5) {
                    skipRawBytes(4);
                    return true;
                }
                throw InvalidProtocolBufferException.invalidWireType();
            } else {
                return false;
            }
        }

        @Override // com.google.protobuf.CodedInputStream
        public void skipMessage() {
            int readTag;
            do {
                readTag = readTag();
                if (readTag == 0) {
                    return;
                }
            } while (skipField(readTag));
        }

        @Override // com.google.protobuf.CodedInputStream
        public void skipRawBytes(int i) {
            int i2 = this.f57240i;
            int i3 = this.f57242k;
            if (i <= i2 - i3 && i >= 0) {
                this.f57242k = i3 + i;
            } else {
                m37024n(i);
            }
        }

        public C8843d(InputStream inputStream, int i) {
            super();
            this.f57245n = Integer.MAX_VALUE;
            Internal.m35785b(inputStream, "input");
            this.f57238g = inputStream;
            this.f57239h = new byte[i];
            this.f57240i = 0;
            this.f57242k = 0;
            this.f57244m = 0;
        }

        @Override // com.google.protobuf.CodedInputStream
        public void skipMessage(CodedOutputStream codedOutputStream) {
            int readTag;
            do {
                readTag = readTag();
                if (readTag == 0) {
                    return;
                }
            } while (skipField(readTag, codedOutputStream));
        }

        @Override // com.google.protobuf.CodedInputStream
        public MessageLite readGroup(int i, Parser parser, ExtensionRegistryLite extensionRegistryLite) {
            checkRecursionLimit();
            this.f57209a++;
            MessageLite messageLite = (MessageLite) parser.parsePartialFrom(this, extensionRegistryLite);
            checkLastTagWas(WireFormat.m35424a(i, 4));
            this.f57209a--;
            return messageLite;
        }

        @Override // com.google.protobuf.CodedInputStream
        public boolean skipField(int i, CodedOutputStream codedOutputStream) {
            int tagWireType = WireFormat.getTagWireType(i);
            if (tagWireType == 0) {
                long readInt64 = readInt64();
                codedOutputStream.writeUInt32NoTag(i);
                codedOutputStream.writeUInt64NoTag(readInt64);
                return true;
            } else if (tagWireType == 1) {
                long readRawLittleEndian64 = readRawLittleEndian64();
                codedOutputStream.writeUInt32NoTag(i);
                codedOutputStream.writeFixed64NoTag(readRawLittleEndian64);
                return true;
            } else if (tagWireType == 2) {
                ByteString readBytes = readBytes();
                codedOutputStream.writeUInt32NoTag(i);
                codedOutputStream.writeBytesNoTag(readBytes);
                return true;
            } else if (tagWireType == 3) {
                codedOutputStream.writeUInt32NoTag(i);
                skipMessage(codedOutputStream);
                int m35424a = WireFormat.m35424a(WireFormat.getTagFieldNumber(i), 4);
                checkLastTagWas(m35424a);
                codedOutputStream.writeUInt32NoTag(m35424a);
                return true;
            } else if (tagWireType != 4) {
                if (tagWireType == 5) {
                    int readRawLittleEndian32 = readRawLittleEndian32();
                    codedOutputStream.writeUInt32NoTag(i);
                    codedOutputStream.writeFixed32NoTag(readRawLittleEndian32);
                    return true;
                }
                throw InvalidProtocolBufferException.invalidWireType();
            } else {
                return false;
            }
        }

        @Override // com.google.protobuf.CodedInputStream
        public MessageLite readMessage(Parser parser, ExtensionRegistryLite extensionRegistryLite) {
            int readRawVarint32 = readRawVarint32();
            checkRecursionLimit();
            int pushLimit = pushLimit(readRawVarint32);
            this.f57209a++;
            MessageLite messageLite = (MessageLite) parser.parsePartialFrom(this, extensionRegistryLite);
            checkLastTagWas(0);
            this.f57209a--;
            if (getBytesUntilLimit() == 0) {
                popLimit(pushLimit);
                return messageLite;
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }
    }

    /* renamed from: com.google.protobuf.CodedInputStream$e */
    /* loaded from: classes4.dex */
    public static final class C8844e extends CodedInputStream {

        /* renamed from: g */
        public final ByteBuffer f57246g;

        /* renamed from: h */
        public final boolean f57247h;

        /* renamed from: i */
        public final long f57248i;

        /* renamed from: j */
        public long f57249j;

        /* renamed from: k */
        public long f57250k;

        /* renamed from: l */
        public long f57251l;

        /* renamed from: m */
        public int f57252m;

        /* renamed from: n */
        public int f57253n;

        /* renamed from: o */
        public boolean f57254o;

        /* renamed from: p */
        public int f57255p;

        /* renamed from: e */
        public static boolean m37018e() {
            return AbstractC22806wY1.m817K();
        }

        /* renamed from: g */
        private void m37016g() {
            long j = this.f57249j + this.f57252m;
            this.f57249j = j;
            int i = (int) (j - this.f57251l);
            int i2 = this.f57255p;
            if (i > i2) {
                int i3 = i - i2;
                this.f57252m = i3;
                this.f57249j = j - i3;
                return;
            }
            this.f57252m = 0;
        }

        /* renamed from: h */
        private int m37015h() {
            return (int) (this.f57249j - this.f57250k);
        }

        /* renamed from: i */
        private void m37014i() {
            if (m37015h() >= 10) {
                m37013j();
            } else {
                m37012k();
            }
        }

        /* renamed from: j */
        private void m37013j() {
            for (int i = 0; i < 10; i++) {
                long j = this.f57250k;
                this.f57250k = 1 + j;
                if (AbstractC22806wY1.m777x(j) >= 0) {
                    return;
                }
            }
            throw InvalidProtocolBufferException.malformedVarint();
        }

        /* renamed from: k */
        private void m37012k() {
            for (int i = 0; i < 10; i++) {
                if (readRawByte() >= 0) {
                    return;
                }
            }
            throw InvalidProtocolBufferException.malformedVarint();
        }

        @Override // com.google.protobuf.CodedInputStream
        public void checkLastTagWas(int i) {
            if (this.f57253n == i) {
                return;
            }
            throw InvalidProtocolBufferException.invalidEndTag();
        }

        /* renamed from: d */
        public final int m37019d(long j) {
            return (int) (j - this.f57248i);
        }

        @Override // com.google.protobuf.CodedInputStream
        public void enableAliasing(boolean z) {
            this.f57254o = z;
        }

        /* renamed from: f */
        public long m37017f() {
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

        @Override // com.google.protobuf.CodedInputStream
        public int getBytesUntilLimit() {
            int i = this.f57255p;
            if (i == Integer.MAX_VALUE) {
                return -1;
            }
            return i - getTotalBytesRead();
        }

        @Override // com.google.protobuf.CodedInputStream
        public int getLastTag() {
            return this.f57253n;
        }

        @Override // com.google.protobuf.CodedInputStream
        public int getTotalBytesRead() {
            return (int) (this.f57250k - this.f57251l);
        }

        @Override // com.google.protobuf.CodedInputStream
        public boolean isAtEnd() {
            if (this.f57250k == this.f57249j) {
                return true;
            }
            return false;
        }

        /* renamed from: l */
        public final ByteBuffer m37011l(long j, long j2) {
            int position = this.f57246g.position();
            int limit = this.f57246g.limit();
            ByteBuffer byteBuffer = this.f57246g;
            try {
                try {
                    byteBuffer.position(m37019d(j));
                    byteBuffer.limit(m37019d(j2));
                    return this.f57246g.slice();
                } catch (IllegalArgumentException e) {
                    InvalidProtocolBufferException truncatedMessage = InvalidProtocolBufferException.truncatedMessage();
                    truncatedMessage.initCause(e);
                    throw truncatedMessage;
                }
            } finally {
                byteBuffer.position(position);
                byteBuffer.limit(limit);
            }
        }

        @Override // com.google.protobuf.CodedInputStream
        public void popLimit(int i) {
            this.f57255p = i;
            m37016g();
        }

        @Override // com.google.protobuf.CodedInputStream
        public int pushLimit(int i) {
            if (i >= 0) {
                int totalBytesRead = i + getTotalBytesRead();
                int i2 = this.f57255p;
                if (totalBytesRead <= i2) {
                    this.f57255p = totalBytesRead;
                    m37016g();
                    return i2;
                }
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            throw InvalidProtocolBufferException.negativeSize();
        }

        @Override // com.google.protobuf.CodedInputStream
        public boolean readBool() {
            if (readRawVarint64() != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.protobuf.CodedInputStream
        public byte[] readByteArray() {
            return readRawBytes(readRawVarint32());
        }

        @Override // com.google.protobuf.CodedInputStream
        public ByteBuffer readByteBuffer() {
            int readRawVarint32 = readRawVarint32();
            if (readRawVarint32 > 0 && readRawVarint32 <= m37015h()) {
                if (!this.f57247h && this.f57254o) {
                    long j = this.f57250k;
                    long j2 = readRawVarint32;
                    ByteBuffer m37011l = m37011l(j, j + j2);
                    this.f57250k += j2;
                    return m37011l;
                }
                byte[] bArr = new byte[readRawVarint32];
                long j3 = readRawVarint32;
                AbstractC22806wY1.m785p(this.f57250k, bArr, 0L, j3);
                this.f57250k += j3;
                return ByteBuffer.wrap(bArr);
            } else if (readRawVarint32 == 0) {
                return Internal.EMPTY_BYTE_BUFFER;
            } else {
                if (readRawVarint32 < 0) {
                    throw InvalidProtocolBufferException.negativeSize();
                }
                throw InvalidProtocolBufferException.truncatedMessage();
            }
        }

        @Override // com.google.protobuf.CodedInputStream
        public ByteString readBytes() {
            int readRawVarint32 = readRawVarint32();
            if (readRawVarint32 > 0 && readRawVarint32 <= m37015h()) {
                if (this.f57247h && this.f57254o) {
                    long j = this.f57250k;
                    long j2 = readRawVarint32;
                    ByteBuffer m37011l = m37011l(j, j + j2);
                    this.f57250k += j2;
                    return ByteString.wrap(m37011l);
                }
                byte[] bArr = new byte[readRawVarint32];
                long j3 = readRawVarint32;
                AbstractC22806wY1.m785p(this.f57250k, bArr, 0L, j3);
                this.f57250k += j3;
                return ByteString.wrap(bArr);
            } else if (readRawVarint32 == 0) {
                return ByteString.EMPTY;
            } else {
                if (readRawVarint32 < 0) {
                    throw InvalidProtocolBufferException.negativeSize();
                }
                throw InvalidProtocolBufferException.truncatedMessage();
            }
        }

        @Override // com.google.protobuf.CodedInputStream
        public double readDouble() {
            return Double.longBitsToDouble(readRawLittleEndian64());
        }

        @Override // com.google.protobuf.CodedInputStream
        public int readEnum() {
            return readRawVarint32();
        }

        @Override // com.google.protobuf.CodedInputStream
        public int readFixed32() {
            return readRawLittleEndian32();
        }

        @Override // com.google.protobuf.CodedInputStream
        public long readFixed64() {
            return readRawLittleEndian64();
        }

        @Override // com.google.protobuf.CodedInputStream
        public float readFloat() {
            return Float.intBitsToFloat(readRawLittleEndian32());
        }

        @Override // com.google.protobuf.CodedInputStream
        public void readGroup(int i, MessageLite.Builder builder, ExtensionRegistryLite extensionRegistryLite) {
            checkRecursionLimit();
            this.f57209a++;
            builder.mergeFrom(this, extensionRegistryLite);
            checkLastTagWas(WireFormat.m35424a(i, 4));
            this.f57209a--;
        }

        @Override // com.google.protobuf.CodedInputStream
        public int readInt32() {
            return readRawVarint32();
        }

        @Override // com.google.protobuf.CodedInputStream
        public long readInt64() {
            return readRawVarint64();
        }

        @Override // com.google.protobuf.CodedInputStream
        public void readMessage(MessageLite.Builder builder, ExtensionRegistryLite extensionRegistryLite) {
            int readRawVarint32 = readRawVarint32();
            checkRecursionLimit();
            int pushLimit = pushLimit(readRawVarint32);
            this.f57209a++;
            builder.mergeFrom(this, extensionRegistryLite);
            checkLastTagWas(0);
            this.f57209a--;
            if (getBytesUntilLimit() == 0) {
                popLimit(pushLimit);
                return;
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }

        @Override // com.google.protobuf.CodedInputStream
        public byte readRawByte() {
            long j = this.f57250k;
            if (j != this.f57249j) {
                this.f57250k = 1 + j;
                return AbstractC22806wY1.m777x(j);
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }

        @Override // com.google.protobuf.CodedInputStream
        public byte[] readRawBytes(int i) {
            if (i >= 0 && i <= m37015h()) {
                byte[] bArr = new byte[i];
                long j = this.f57250k;
                long j2 = i;
                m37011l(j, j + j2).get(bArr);
                this.f57250k += j2;
                return bArr;
            } else if (i <= 0) {
                if (i == 0) {
                    return Internal.EMPTY_BYTE_ARRAY;
                }
                throw InvalidProtocolBufferException.negativeSize();
            } else {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
        }

        @Override // com.google.protobuf.CodedInputStream
        public int readRawLittleEndian32() {
            long j = this.f57250k;
            if (this.f57249j - j >= 4) {
                this.f57250k = 4 + j;
                return ((AbstractC22806wY1.m777x(j + 3) & 255) << 24) | (AbstractC22806wY1.m777x(j) & 255) | ((AbstractC22806wY1.m777x(1 + j) & 255) << 8) | ((AbstractC22806wY1.m777x(2 + j) & 255) << 16);
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }

        @Override // com.google.protobuf.CodedInputStream
        public long readRawLittleEndian64() {
            long j = this.f57250k;
            if (this.f57249j - j >= 8) {
                this.f57250k = 8 + j;
                return ((AbstractC22806wY1.m777x(j + 7) & 255) << 56) | (AbstractC22806wY1.m777x(j) & 255) | ((AbstractC22806wY1.m777x(1 + j) & 255) << 8) | ((AbstractC22806wY1.m777x(2 + j) & 255) << 16) | ((AbstractC22806wY1.m777x(3 + j) & 255) << 24) | ((AbstractC22806wY1.m777x(4 + j) & 255) << 32) | ((AbstractC22806wY1.m777x(5 + j) & 255) << 40) | ((AbstractC22806wY1.m777x(6 + j) & 255) << 48);
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }

        /* JADX WARN: Code restructure failed: missing block: B:73:0x008c, code lost:
            if (p000.AbstractC22806wY1.m777x(r3) < 0) goto L36;
         */
        @Override // com.google.protobuf.CodedInputStream
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public int readRawVarint32() {
            /*
                r10 = this;
                long r0 = r10.f57250k
                long r2 = r10.f57249j
                int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
                if (r4 != 0) goto La
                goto L8e
            La:
                r2 = 1
                long r2 = r2 + r0
                byte r4 = p000.AbstractC22806wY1.m777x(r0)
                if (r4 < 0) goto L16
                r10.f57250k = r2
                return r4
            L16:
                long r5 = r10.f57249j
                long r5 = r5 - r2
                r7 = 9
                int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
                if (r9 >= 0) goto L21
                goto L8e
            L21:
                r5 = 2
                long r5 = r5 + r0
                byte r2 = p000.AbstractC22806wY1.m777x(r2)
                int r2 = r2 << 7
                r2 = r2 ^ r4
                if (r2 >= 0) goto L31
                r0 = r2 ^ (-128(0xffffffffffffff80, float:NaN))
                goto L98
            L31:
                r3 = 3
                long r3 = r3 + r0
                byte r5 = p000.AbstractC22806wY1.m777x(r5)
                int r5 = r5 << 14
                r2 = r2 ^ r5
                if (r2 < 0) goto L41
                r0 = r2 ^ 16256(0x3f80, float:2.278E-41)
            L3f:
                r5 = r3
                goto L98
            L41:
                r5 = 4
                long r5 = r5 + r0
                byte r3 = p000.AbstractC22806wY1.m777x(r3)
                int r3 = r3 << 21
                r2 = r2 ^ r3
                if (r2 >= 0) goto L52
                r0 = -2080896(0xffffffffffe03f80, float:NaN)
                r0 = r0 ^ r2
                goto L98
            L52:
                r3 = 5
                long r3 = r3 + r0
                byte r5 = p000.AbstractC22806wY1.m777x(r5)
                int r6 = r5 << 28
                r2 = r2 ^ r6
                r6 = 266354560(0xfe03f80, float:2.2112565E-29)
                r2 = r2 ^ r6
                if (r5 >= 0) goto L96
                r5 = 6
                long r5 = r5 + r0
                byte r3 = p000.AbstractC22806wY1.m777x(r3)
                if (r3 >= 0) goto L94
                r3 = 7
                long r3 = r3 + r0
                byte r5 = p000.AbstractC22806wY1.m777x(r5)
                if (r5 >= 0) goto L96
                r5 = 8
                long r5 = r5 + r0
                byte r3 = p000.AbstractC22806wY1.m777x(r3)
                if (r3 >= 0) goto L94
                long r3 = r0 + r7
                byte r5 = p000.AbstractC22806wY1.m777x(r5)
                if (r5 >= 0) goto L96
                r5 = 10
                long r5 = r5 + r0
                byte r0 = p000.AbstractC22806wY1.m777x(r3)
                if (r0 >= 0) goto L94
            L8e:
                long r0 = r10.m37017f()
                int r1 = (int) r0
                return r1
            L94:
                r0 = r2
                goto L98
            L96:
                r0 = r2
                goto L3f
            L98:
                r10.f57250k = r5
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.CodedInputStream.C8844e.readRawVarint32():int");
        }

        @Override // com.google.protobuf.CodedInputStream
        public long readRawVarint64() {
            long j;
            long j2;
            long j3;
            int i;
            long j4 = this.f57250k;
            if (this.f57249j != j4) {
                long j5 = 1 + j4;
                byte m777x = AbstractC22806wY1.m777x(j4);
                if (m777x >= 0) {
                    this.f57250k = j5;
                    return m777x;
                } else if (this.f57249j - j5 >= 9) {
                    long j6 = 2 + j4;
                    int m777x2 = (AbstractC22806wY1.m777x(j5) << 7) ^ m777x;
                    if (m777x2 < 0) {
                        i = m777x2 ^ (-128);
                    } else {
                        long j7 = 3 + j4;
                        int m777x3 = m777x2 ^ (AbstractC22806wY1.m777x(j6) << 14);
                        if (m777x3 >= 0) {
                            j = m777x3 ^ 16256;
                            j6 = j7;
                        } else {
                            j6 = 4 + j4;
                            int m777x4 = m777x3 ^ (AbstractC22806wY1.m777x(j7) << Ascii.NAK);
                            if (m777x4 < 0) {
                                i = (-2080896) ^ m777x4;
                            } else {
                                long j8 = 5 + j4;
                                long m777x5 = m777x4 ^ (AbstractC22806wY1.m777x(j6) << 28);
                                if (m777x5 >= 0) {
                                    j3 = 266354560;
                                } else {
                                    long j9 = 6 + j4;
                                    long m777x6 = m777x5 ^ (AbstractC22806wY1.m777x(j8) << 35);
                                    if (m777x6 < 0) {
                                        j2 = -34093383808L;
                                    } else {
                                        j8 = 7 + j4;
                                        m777x5 = m777x6 ^ (AbstractC22806wY1.m777x(j9) << 42);
                                        if (m777x5 >= 0) {
                                            j3 = 4363953127296L;
                                        } else {
                                            j9 = 8 + j4;
                                            m777x6 = m777x5 ^ (AbstractC22806wY1.m777x(j8) << 49);
                                            if (m777x6 < 0) {
                                                j2 = -558586000294016L;
                                            } else {
                                                long j10 = j4 + 9;
                                                long m777x7 = (m777x6 ^ (AbstractC22806wY1.m777x(j9) << 56)) ^ 71499008037633920L;
                                                if (m777x7 < 0) {
                                                    long j11 = j4 + 10;
                                                    if (AbstractC22806wY1.m777x(j10) >= 0) {
                                                        j6 = j11;
                                                        j = m777x7;
                                                    }
                                                } else {
                                                    j = m777x7;
                                                    j6 = j10;
                                                }
                                            }
                                        }
                                    }
                                    j = j2 ^ m777x6;
                                    j6 = j9;
                                }
                                j = j3 ^ m777x5;
                                j6 = j8;
                            }
                        }
                        this.f57250k = j6;
                        return j;
                    }
                    j = i;
                    this.f57250k = j6;
                    return j;
                }
            }
            return m37017f();
        }

        @Override // com.google.protobuf.CodedInputStream
        public int readSFixed32() {
            return readRawLittleEndian32();
        }

        @Override // com.google.protobuf.CodedInputStream
        public long readSFixed64() {
            return readRawLittleEndian64();
        }

        @Override // com.google.protobuf.CodedInputStream
        public int readSInt32() {
            return CodedInputStream.decodeZigZag32(readRawVarint32());
        }

        @Override // com.google.protobuf.CodedInputStream
        public long readSInt64() {
            return CodedInputStream.decodeZigZag64(readRawVarint64());
        }

        @Override // com.google.protobuf.CodedInputStream
        public String readString() {
            int readRawVarint32 = readRawVarint32();
            if (readRawVarint32 > 0 && readRawVarint32 <= m37015h()) {
                byte[] bArr = new byte[readRawVarint32];
                long j = readRawVarint32;
                AbstractC22806wY1.m785p(this.f57250k, bArr, 0L, j);
                String str = new String(bArr, Internal.f57358b);
                this.f57250k += j;
                return str;
            } else if (readRawVarint32 == 0) {
                return "";
            } else {
                if (readRawVarint32 < 0) {
                    throw InvalidProtocolBufferException.negativeSize();
                }
                throw InvalidProtocolBufferException.truncatedMessage();
            }
        }

        @Override // com.google.protobuf.CodedInputStream
        public String readStringRequireUtf8() {
            int readRawVarint32 = readRawVarint32();
            if (readRawVarint32 > 0 && readRawVarint32 <= m37015h()) {
                String m35518g = Utf8.m35518g(this.f57246g, m37019d(this.f57250k), readRawVarint32);
                this.f57250k += readRawVarint32;
                return m35518g;
            } else if (readRawVarint32 == 0) {
                return "";
            } else {
                if (readRawVarint32 <= 0) {
                    throw InvalidProtocolBufferException.negativeSize();
                }
                throw InvalidProtocolBufferException.truncatedMessage();
            }
        }

        @Override // com.google.protobuf.CodedInputStream
        public int readTag() {
            if (isAtEnd()) {
                this.f57253n = 0;
                return 0;
            }
            int readRawVarint32 = readRawVarint32();
            this.f57253n = readRawVarint32;
            if (WireFormat.getTagFieldNumber(readRawVarint32) != 0) {
                return this.f57253n;
            }
            throw InvalidProtocolBufferException.invalidTag();
        }

        @Override // com.google.protobuf.CodedInputStream
        public int readUInt32() {
            return readRawVarint32();
        }

        @Override // com.google.protobuf.CodedInputStream
        public long readUInt64() {
            return readRawVarint64();
        }

        @Override // com.google.protobuf.CodedInputStream
        public void readUnknownGroup(int i, MessageLite.Builder builder) {
            readGroup(i, builder, ExtensionRegistryLite.getEmptyRegistry());
        }

        @Override // com.google.protobuf.CodedInputStream
        public void resetSizeCounter() {
            this.f57251l = this.f57250k;
        }

        @Override // com.google.protobuf.CodedInputStream
        public boolean skipField(int i) {
            int tagWireType = WireFormat.getTagWireType(i);
            if (tagWireType == 0) {
                m37014i();
                return true;
            } else if (tagWireType == 1) {
                skipRawBytes(8);
                return true;
            } else if (tagWireType == 2) {
                skipRawBytes(readRawVarint32());
                return true;
            } else if (tagWireType == 3) {
                skipMessage();
                checkLastTagWas(WireFormat.m35424a(WireFormat.getTagFieldNumber(i), 4));
                return true;
            } else if (tagWireType != 4) {
                if (tagWireType == 5) {
                    skipRawBytes(4);
                    return true;
                }
                throw InvalidProtocolBufferException.invalidWireType();
            } else {
                return false;
            }
        }

        @Override // com.google.protobuf.CodedInputStream
        public void skipMessage() {
            int readTag;
            do {
                readTag = readTag();
                if (readTag == 0) {
                    return;
                }
            } while (skipField(readTag));
        }

        @Override // com.google.protobuf.CodedInputStream
        public void skipRawBytes(int i) {
            if (i >= 0 && i <= m37015h()) {
                this.f57250k += i;
            } else if (i < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            } else {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
        }

        public C8844e(ByteBuffer byteBuffer, boolean z) {
            super();
            this.f57255p = Integer.MAX_VALUE;
            this.f57246g = byteBuffer;
            long m790k = AbstractC22806wY1.m790k(byteBuffer);
            this.f57248i = m790k;
            this.f57249j = byteBuffer.limit() + m790k;
            long position = m790k + byteBuffer.position();
            this.f57250k = position;
            this.f57251l = position;
            this.f57247h = z;
        }

        @Override // com.google.protobuf.CodedInputStream
        public void skipMessage(CodedOutputStream codedOutputStream) {
            int readTag;
            do {
                readTag = readTag();
                if (readTag == 0) {
                    return;
                }
            } while (skipField(readTag, codedOutputStream));
        }

        @Override // com.google.protobuf.CodedInputStream
        public MessageLite readGroup(int i, Parser parser, ExtensionRegistryLite extensionRegistryLite) {
            checkRecursionLimit();
            this.f57209a++;
            MessageLite messageLite = (MessageLite) parser.parsePartialFrom(this, extensionRegistryLite);
            checkLastTagWas(WireFormat.m35424a(i, 4));
            this.f57209a--;
            return messageLite;
        }

        @Override // com.google.protobuf.CodedInputStream
        public boolean skipField(int i, CodedOutputStream codedOutputStream) {
            int tagWireType = WireFormat.getTagWireType(i);
            if (tagWireType == 0) {
                long readInt64 = readInt64();
                codedOutputStream.writeUInt32NoTag(i);
                codedOutputStream.writeUInt64NoTag(readInt64);
                return true;
            } else if (tagWireType == 1) {
                long readRawLittleEndian64 = readRawLittleEndian64();
                codedOutputStream.writeUInt32NoTag(i);
                codedOutputStream.writeFixed64NoTag(readRawLittleEndian64);
                return true;
            } else if (tagWireType == 2) {
                ByteString readBytes = readBytes();
                codedOutputStream.writeUInt32NoTag(i);
                codedOutputStream.writeBytesNoTag(readBytes);
                return true;
            } else if (tagWireType == 3) {
                codedOutputStream.writeUInt32NoTag(i);
                skipMessage(codedOutputStream);
                int m35424a = WireFormat.m35424a(WireFormat.getTagFieldNumber(i), 4);
                checkLastTagWas(m35424a);
                codedOutputStream.writeUInt32NoTag(m35424a);
                return true;
            } else if (tagWireType != 4) {
                if (tagWireType == 5) {
                    int readRawLittleEndian32 = readRawLittleEndian32();
                    codedOutputStream.writeUInt32NoTag(i);
                    codedOutputStream.writeFixed32NoTag(readRawLittleEndian32);
                    return true;
                }
                throw InvalidProtocolBufferException.invalidWireType();
            } else {
                return false;
            }
        }

        @Override // com.google.protobuf.CodedInputStream
        public MessageLite readMessage(Parser parser, ExtensionRegistryLite extensionRegistryLite) {
            int readRawVarint32 = readRawVarint32();
            checkRecursionLimit();
            int pushLimit = pushLimit(readRawVarint32);
            this.f57209a++;
            MessageLite messageLite = (MessageLite) parser.parsePartialFrom(this, extensionRegistryLite);
            checkLastTagWas(0);
            this.f57209a--;
            if (getBytesUntilLimit() == 0) {
                popLimit(pushLimit);
                return messageLite;
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }
    }

    /* renamed from: a */
    public static CodedInputStream m37051a(Iterable iterable, boolean z) {
        Iterator it = iterable.iterator();
        boolean z2 = false;
        int i = 0;
        while (it.hasNext()) {
            ByteBuffer byteBuffer = (ByteBuffer) it.next();
            i += byteBuffer.remaining();
            if (byteBuffer.hasArray()) {
                z2 |= true;
            } else if (byteBuffer.isDirect()) {
                z2 |= true;
            } else {
                z2 |= true;
            }
        }
        if (z2) {
            return new C8842c(iterable, i, z);
        }
        return newInstance(new C22827wg0(iterable));
    }

    /* renamed from: b */
    public static CodedInputStream m37050b(ByteBuffer byteBuffer, boolean z) {
        if (byteBuffer.hasArray()) {
            return m37049c(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining(), z);
        }
        if (byteBuffer.isDirect() && C8844e.m37018e()) {
            return new C8844e(byteBuffer, z);
        }
        int remaining = byteBuffer.remaining();
        byte[] bArr = new byte[remaining];
        byteBuffer.duplicate().get(bArr);
        return m37049c(bArr, 0, remaining, true);
    }

    /* renamed from: c */
    public static CodedInputStream m37049c(byte[] bArr, int i, int i2, boolean z) {
        C8841b c8841b = new C8841b(bArr, i, i2, z);
        try {
            c8841b.pushLimit(i2);
            return c8841b;
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
        return newInstance(inputStream, 4096);
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

    public abstract void checkLastTagWas(int i) throws InvalidProtocolBufferException;

    public void checkRecursionLimit() throws InvalidProtocolBufferException {
        if (this.f57209a < this.f57210b) {
            return;
        }
        throw InvalidProtocolBufferException.recursionLimitExceeded();
    }

    public abstract void enableAliasing(boolean z);

    public abstract int getBytesUntilLimit();

    public abstract int getLastTag();

    public abstract int getTotalBytesRead();

    public abstract boolean isAtEnd() throws IOException;

    public abstract void popLimit(int i);

    public abstract int pushLimit(int i) throws InvalidProtocolBufferException;

    public abstract boolean readBool() throws IOException;

    public abstract byte[] readByteArray() throws IOException;

    public abstract ByteBuffer readByteBuffer() throws IOException;

    public abstract ByteString readBytes() throws IOException;

    public abstract double readDouble() throws IOException;

    public abstract int readEnum() throws IOException;

    public abstract int readFixed32() throws IOException;

    public abstract long readFixed64() throws IOException;

    public abstract float readFloat() throws IOException;

    public abstract <T extends MessageLite> T readGroup(int i, Parser<T> parser, ExtensionRegistryLite extensionRegistryLite) throws IOException;

    public abstract void readGroup(int i, MessageLite.Builder builder, ExtensionRegistryLite extensionRegistryLite) throws IOException;

    public abstract int readInt32() throws IOException;

    public abstract long readInt64() throws IOException;

    public abstract <T extends MessageLite> T readMessage(Parser<T> parser, ExtensionRegistryLite extensionRegistryLite) throws IOException;

    public abstract void readMessage(MessageLite.Builder builder, ExtensionRegistryLite extensionRegistryLite) throws IOException;

    public abstract byte readRawByte() throws IOException;

    public abstract byte[] readRawBytes(int i) throws IOException;

    public abstract int readRawLittleEndian32() throws IOException;

    public abstract long readRawLittleEndian64() throws IOException;

    public abstract int readRawVarint32() throws IOException;

    public abstract long readRawVarint64() throws IOException;

    public abstract int readSFixed32() throws IOException;

    public abstract long readSFixed64() throws IOException;

    public abstract int readSInt32() throws IOException;

    public abstract long readSInt64() throws IOException;

    public abstract String readString() throws IOException;

    public abstract String readStringRequireUtf8() throws IOException;

    public abstract int readTag() throws IOException;

    public abstract int readUInt32() throws IOException;

    public abstract long readUInt64() throws IOException;

    @Deprecated
    public abstract void readUnknownGroup(int i, MessageLite.Builder builder) throws IOException;

    public abstract void resetSizeCounter();

    public final int setRecursionLimit(int i) {
        if (i >= 0) {
            int i2 = this.f57210b;
            this.f57210b = i;
            return i2;
        }
        throw new IllegalArgumentException("Recursion limit cannot be negative: " + i);
    }

    public final int setSizeLimit(int i) {
        if (i >= 0) {
            int i2 = this.f57211c;
            this.f57211c = i;
            return i2;
        }
        throw new IllegalArgumentException("Size limit cannot be negative: " + i);
    }

    public abstract boolean skipField(int i) throws IOException;

    @Deprecated
    public abstract boolean skipField(int i, CodedOutputStream codedOutputStream) throws IOException;

    public abstract void skipMessage() throws IOException;

    public abstract void skipMessage(CodedOutputStream codedOutputStream) throws IOException;

    public abstract void skipRawBytes(int i) throws IOException;

    public CodedInputStream() {
        this.f57210b = f57208f;
        this.f57211c = Integer.MAX_VALUE;
        this.f57213e = false;
    }

    public static CodedInputStream newInstance(InputStream inputStream, int i) {
        if (i > 0) {
            if (inputStream == null) {
                return newInstance(Internal.EMPTY_BYTE_ARRAY);
            }
            return new C8843d(inputStream, i);
        }
        throw new IllegalArgumentException("bufferSize must be > 0");
    }

    public static CodedInputStream newInstance(Iterable<ByteBuffer> iterable) {
        if (!C8844e.m37018e()) {
            return newInstance(new C22827wg0(iterable));
        }
        return m37051a(iterable, false);
    }

    public static CodedInputStream newInstance(byte[] bArr) {
        return newInstance(bArr, 0, bArr.length);
    }

    public static CodedInputStream newInstance(byte[] bArr, int i, int i2) {
        return m37049c(bArr, i, i2, false);
    }

    public static CodedInputStream newInstance(ByteBuffer byteBuffer) {
        return m37050b(byteBuffer, false);
    }
}
