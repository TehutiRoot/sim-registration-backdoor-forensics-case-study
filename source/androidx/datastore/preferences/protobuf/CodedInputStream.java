package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.MessageLite;
import com.google.common.base.Ascii;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class CodedInputStream {

    /* renamed from: a */
    public int f34676a;

    /* renamed from: b */
    public int f34677b;

    /* renamed from: c */
    public int f34678c;

    /* renamed from: d */
    public C4430e f34679d;

    /* renamed from: e */
    public boolean f34680e;

    /* renamed from: androidx.datastore.preferences.protobuf.CodedInputStream$b */
    /* loaded from: classes2.dex */
    public static final class C4344b extends CodedInputStream {

        /* renamed from: f */
        public final byte[] f34681f;

        /* renamed from: g */
        public final boolean f34682g;

        /* renamed from: h */
        public int f34683h;

        /* renamed from: i */
        public int f34684i;

        /* renamed from: j */
        public int f34685j;

        /* renamed from: k */
        public int f34686k;

        /* renamed from: l */
        public int f34687l;

        /* renamed from: m */
        public boolean f34688m;

        /* renamed from: n */
        public int f34689n;

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public void checkLastTagWas(int i) {
            if (this.f34687l == i) {
                return;
            }
            throw InvalidProtocolBufferException.invalidEndTag();
        }

        /* renamed from: d */
        public long m56088d() {
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
        public final void m56087e() {
            int i = this.f34683h + this.f34684i;
            this.f34683h = i;
            int i2 = i - this.f34686k;
            int i3 = this.f34689n;
            if (i2 > i3) {
                int i4 = i2 - i3;
                this.f34684i = i4;
                this.f34683h = i - i4;
                return;
            }
            this.f34684i = 0;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public void enableAliasing(boolean z) {
            this.f34688m = z;
        }

        /* renamed from: f */
        public final void m56086f() {
            if (this.f34683h - this.f34685j >= 10) {
                m56085g();
            } else {
                m56084h();
            }
        }

        /* renamed from: g */
        public final void m56085g() {
            for (int i = 0; i < 10; i++) {
                byte[] bArr = this.f34681f;
                int i2 = this.f34685j;
                this.f34685j = i2 + 1;
                if (bArr[i2] >= 0) {
                    return;
                }
            }
            throw InvalidProtocolBufferException.malformedVarint();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public int getBytesUntilLimit() {
            int i = this.f34689n;
            if (i == Integer.MAX_VALUE) {
                return -1;
            }
            return i - getTotalBytesRead();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public int getLastTag() {
            return this.f34687l;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public int getTotalBytesRead() {
            return this.f34685j - this.f34686k;
        }

        /* renamed from: h */
        public final void m56084h() {
            for (int i = 0; i < 10; i++) {
                if (readRawByte() >= 0) {
                    return;
                }
            }
            throw InvalidProtocolBufferException.malformedVarint();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public boolean isAtEnd() {
            if (this.f34685j == this.f34683h) {
                return true;
            }
            return false;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public void popLimit(int i) {
            this.f34689n = i;
            m56087e();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public int pushLimit(int i) {
            if (i >= 0) {
                int totalBytesRead = i + getTotalBytesRead();
                int i2 = this.f34689n;
                if (totalBytesRead <= i2) {
                    this.f34689n = totalBytesRead;
                    m56087e();
                    return i2;
                }
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            throw InvalidProtocolBufferException.negativeSize();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public boolean readBool() {
            if (readRawVarint64() != 0) {
                return true;
            }
            return false;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public byte[] readByteArray() {
            return readRawBytes(readRawVarint32());
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public ByteBuffer readByteBuffer() {
            ByteBuffer wrap;
            int readRawVarint32 = readRawVarint32();
            if (readRawVarint32 > 0) {
                int i = this.f34683h;
                int i2 = this.f34685j;
                if (readRawVarint32 <= i - i2) {
                    if (!this.f34682g && this.f34688m) {
                        wrap = ByteBuffer.wrap(this.f34681f, i2, readRawVarint32).slice();
                    } else {
                        wrap = ByteBuffer.wrap(Arrays.copyOfRange(this.f34681f, i2, i2 + readRawVarint32));
                    }
                    this.f34685j += readRawVarint32;
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

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public ByteString readBytes() {
            ByteString copyFrom;
            int readRawVarint32 = readRawVarint32();
            if (readRawVarint32 > 0) {
                int i = this.f34683h;
                int i2 = this.f34685j;
                if (readRawVarint32 <= i - i2) {
                    if (this.f34682g && this.f34688m) {
                        copyFrom = ByteString.wrap(this.f34681f, i2, readRawVarint32);
                    } else {
                        copyFrom = ByteString.copyFrom(this.f34681f, i2, readRawVarint32);
                    }
                    this.f34685j += readRawVarint32;
                    return copyFrom;
                }
            }
            if (readRawVarint32 == 0) {
                return ByteString.EMPTY;
            }
            return ByteString.wrap(readRawBytes(readRawVarint32));
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public double readDouble() {
            return Double.longBitsToDouble(readRawLittleEndian64());
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public int readEnum() {
            return readRawVarint32();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public int readFixed32() {
            return readRawLittleEndian32();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public long readFixed64() {
            return readRawLittleEndian64();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public float readFloat() {
            return Float.intBitsToFloat(readRawLittleEndian32());
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public void readGroup(int i, MessageLite.Builder builder, ExtensionRegistryLite extensionRegistryLite) {
            int i2 = this.f34676a;
            if (i2 < this.f34677b) {
                this.f34676a = i2 + 1;
                builder.mergeFrom(this, extensionRegistryLite);
                checkLastTagWas(WireFormat.m55338a(i, 4));
                this.f34676a--;
                return;
            }
            throw InvalidProtocolBufferException.recursionLimitExceeded();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public int readInt32() {
            return readRawVarint32();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public long readInt64() {
            return readRawVarint64();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public void readMessage(MessageLite.Builder builder, ExtensionRegistryLite extensionRegistryLite) {
            int readRawVarint32 = readRawVarint32();
            if (this.f34676a < this.f34677b) {
                int pushLimit = pushLimit(readRawVarint32);
                this.f34676a++;
                builder.mergeFrom(this, extensionRegistryLite);
                checkLastTagWas(0);
                this.f34676a--;
                popLimit(pushLimit);
                return;
            }
            throw InvalidProtocolBufferException.recursionLimitExceeded();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public byte readRawByte() {
            int i = this.f34685j;
            if (i != this.f34683h) {
                byte[] bArr = this.f34681f;
                this.f34685j = i + 1;
                return bArr[i];
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public byte[] readRawBytes(int i) {
            if (i > 0) {
                int i2 = this.f34683h;
                int i3 = this.f34685j;
                if (i <= i2 - i3) {
                    int i4 = i + i3;
                    this.f34685j = i4;
                    return Arrays.copyOfRange(this.f34681f, i3, i4);
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

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public int readRawLittleEndian32() {
            int i = this.f34685j;
            if (this.f34683h - i >= 4) {
                byte[] bArr = this.f34681f;
                this.f34685j = i + 4;
                return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public long readRawLittleEndian64() {
            int i = this.f34685j;
            if (this.f34683h - i >= 8) {
                byte[] bArr = this.f34681f;
                this.f34685j = i + 8;
                return ((bArr[i + 7] & 255) << 56) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48);
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public int readRawVarint32() {
            int i;
            int i2 = this.f34685j;
            int i3 = this.f34683h;
            if (i3 != i2) {
                byte[] bArr = this.f34681f;
                int i4 = i2 + 1;
                byte b = bArr[i2];
                if (b >= 0) {
                    this.f34685j = i4;
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
                    this.f34685j = i5;
                    return i;
                }
            }
            return (int) m56088d();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public long readRawVarint64() {
            long j;
            long j2;
            long j3;
            int i = this.f34685j;
            int i2 = this.f34683h;
            if (i2 != i) {
                byte[] bArr = this.f34681f;
                int i3 = i + 1;
                byte b = bArr[i];
                if (b >= 0) {
                    this.f34685j = i3;
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
                    this.f34685j = i4;
                    return j;
                }
            }
            return m56088d();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public int readSFixed32() {
            return readRawLittleEndian32();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public long readSFixed64() {
            return readRawLittleEndian64();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public int readSInt32() {
            return CodedInputStream.decodeZigZag32(readRawVarint32());
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public long readSInt64() {
            return CodedInputStream.decodeZigZag64(readRawVarint64());
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public String readString() {
            int readRawVarint32 = readRawVarint32();
            if (readRawVarint32 > 0) {
                int i = this.f34683h;
                int i2 = this.f34685j;
                if (readRawVarint32 <= i - i2) {
                    String str = new String(this.f34681f, i2, readRawVarint32, Internal.f34817a);
                    this.f34685j += readRawVarint32;
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

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public String readStringRequireUtf8() {
            int readRawVarint32 = readRawVarint32();
            if (readRawVarint32 > 0) {
                int i = this.f34683h;
                int i2 = this.f34685j;
                if (readRawVarint32 <= i - i2) {
                    String m55435h = Utf8.m55435h(this.f34681f, i2, readRawVarint32);
                    this.f34685j += readRawVarint32;
                    return m55435h;
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

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public int readTag() {
            if (isAtEnd()) {
                this.f34687l = 0;
                return 0;
            }
            int readRawVarint32 = readRawVarint32();
            this.f34687l = readRawVarint32;
            if (WireFormat.getTagFieldNumber(readRawVarint32) != 0) {
                return this.f34687l;
            }
            throw InvalidProtocolBufferException.invalidTag();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public int readUInt32() {
            return readRawVarint32();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public long readUInt64() {
            return readRawVarint64();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public void readUnknownGroup(int i, MessageLite.Builder builder) {
            readGroup(i, builder, ExtensionRegistryLite.getEmptyRegistry());
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public void resetSizeCounter() {
            this.f34686k = this.f34685j;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public boolean skipField(int i) {
            int tagWireType = WireFormat.getTagWireType(i);
            if (tagWireType == 0) {
                m56086f();
                return true;
            } else if (tagWireType == 1) {
                skipRawBytes(8);
                return true;
            } else if (tagWireType == 2) {
                skipRawBytes(readRawVarint32());
                return true;
            } else if (tagWireType == 3) {
                skipMessage();
                checkLastTagWas(WireFormat.m55338a(WireFormat.getTagFieldNumber(i), 4));
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

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public void skipMessage() {
            int readTag;
            do {
                readTag = readTag();
                if (readTag == 0) {
                    return;
                }
            } while (skipField(readTag));
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public void skipRawBytes(int i) {
            if (i >= 0) {
                int i2 = this.f34683h;
                int i3 = this.f34685j;
                if (i <= i2 - i3) {
                    this.f34685j = i3 + i;
                    return;
                }
            }
            if (i < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }

        public C4344b(byte[] bArr, int i, int i2, boolean z) {
            super();
            this.f34689n = Integer.MAX_VALUE;
            this.f34681f = bArr;
            this.f34683h = i2 + i;
            this.f34685j = i;
            this.f34686k = i;
            this.f34682g = z;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public void skipMessage(CodedOutputStream codedOutputStream) {
            int readTag;
            do {
                readTag = readTag();
                if (readTag == 0) {
                    return;
                }
            } while (skipField(readTag, codedOutputStream));
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public MessageLite readGroup(int i, Parser parser, ExtensionRegistryLite extensionRegistryLite) {
            int i2 = this.f34676a;
            if (i2 < this.f34677b) {
                this.f34676a = i2 + 1;
                MessageLite messageLite = (MessageLite) parser.parsePartialFrom(this, extensionRegistryLite);
                checkLastTagWas(WireFormat.m55338a(i, 4));
                this.f34676a--;
                return messageLite;
            }
            throw InvalidProtocolBufferException.recursionLimitExceeded();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public MessageLite readMessage(Parser parser, ExtensionRegistryLite extensionRegistryLite) {
            int readRawVarint32 = readRawVarint32();
            if (this.f34676a < this.f34677b) {
                int pushLimit = pushLimit(readRawVarint32);
                this.f34676a++;
                MessageLite messageLite = (MessageLite) parser.parsePartialFrom(this, extensionRegistryLite);
                checkLastTagWas(0);
                this.f34676a--;
                popLimit(pushLimit);
                return messageLite;
            }
            throw InvalidProtocolBufferException.recursionLimitExceeded();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public boolean skipField(int i, CodedOutputStream codedOutputStream) {
            int tagWireType = WireFormat.getTagWireType(i);
            if (tagWireType == 0) {
                long readInt64 = readInt64();
                codedOutputStream.writeRawVarint32(i);
                codedOutputStream.writeUInt64NoTag(readInt64);
                return true;
            } else if (tagWireType == 1) {
                long readRawLittleEndian64 = readRawLittleEndian64();
                codedOutputStream.writeRawVarint32(i);
                codedOutputStream.writeFixed64NoTag(readRawLittleEndian64);
                return true;
            } else if (tagWireType == 2) {
                ByteString readBytes = readBytes();
                codedOutputStream.writeRawVarint32(i);
                codedOutputStream.writeBytesNoTag(readBytes);
                return true;
            } else if (tagWireType == 3) {
                codedOutputStream.writeRawVarint32(i);
                skipMessage(codedOutputStream);
                int m55338a = WireFormat.m55338a(WireFormat.getTagFieldNumber(i), 4);
                checkLastTagWas(m55338a);
                codedOutputStream.writeRawVarint32(m55338a);
                return true;
            } else if (tagWireType != 4) {
                if (tagWireType == 5) {
                    int readRawLittleEndian32 = readRawLittleEndian32();
                    codedOutputStream.writeRawVarint32(i);
                    codedOutputStream.writeFixed32NoTag(readRawLittleEndian32);
                    return true;
                }
                throw InvalidProtocolBufferException.invalidWireType();
            } else {
                return false;
            }
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.CodedInputStream$c */
    /* loaded from: classes2.dex */
    public static final class C4345c extends CodedInputStream {

        /* renamed from: f */
        public Iterable f34690f;

        /* renamed from: g */
        public Iterator f34691g;

        /* renamed from: h */
        public ByteBuffer f34692h;

        /* renamed from: i */
        public boolean f34693i;

        /* renamed from: j */
        public boolean f34694j;

        /* renamed from: k */
        public int f34695k;

        /* renamed from: l */
        public int f34696l;

        /* renamed from: m */
        public int f34697m;

        /* renamed from: n */
        public int f34698n;

        /* renamed from: o */
        public int f34699o;

        /* renamed from: p */
        public int f34700p;

        /* renamed from: q */
        public long f34701q;

        /* renamed from: r */
        public long f34702r;

        /* renamed from: s */
        public long f34703s;

        /* renamed from: t */
        public long f34704t;

        /* renamed from: h */
        private void m56079h() {
            int i = this.f34695k + this.f34696l;
            this.f34695k = i;
            int i2 = i - this.f34700p;
            int i3 = this.f34697m;
            if (i2 > i3) {
                int i4 = i2 - i3;
                this.f34696l = i4;
                this.f34695k = i - i4;
                return;
            }
            this.f34696l = 0;
        }

        /* renamed from: j */
        private void m56077j() {
            for (int i = 0; i < 10; i++) {
                if (readRawByte() >= 0) {
                    return;
                }
            }
            throw InvalidProtocolBufferException.malformedVarint();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public void checkLastTagWas(int i) {
            if (this.f34698n == i) {
                return;
            }
            throw InvalidProtocolBufferException.invalidEndTag();
        }

        /* renamed from: d */
        public final long m56083d() {
            return this.f34704t - this.f34701q;
        }

        /* renamed from: e */
        public final void m56082e() {
            if (this.f34691g.hasNext()) {
                m56075l();
                return;
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public void enableAliasing(boolean z) {
            this.f34694j = z;
        }

        /* renamed from: f */
        public final void m56081f(byte[] bArr, int i, int i2) {
            if (i2 >= 0 && i2 <= m56078i()) {
                int i3 = i2;
                while (i3 > 0) {
                    if (m56083d() == 0) {
                        m56082e();
                    }
                    int min = Math.min(i3, (int) m56083d());
                    long j = min;
                    AbstractC22978xY1.m461n(this.f34701q, bArr, (i2 - i3) + i, j);
                    i3 -= min;
                    this.f34701q += j;
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
        public long m56080g() {
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

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public int getBytesUntilLimit() {
            int i = this.f34697m;
            if (i == Integer.MAX_VALUE) {
                return -1;
            }
            return i - getTotalBytesRead();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public int getLastTag() {
            return this.f34698n;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public int getTotalBytesRead() {
            return (int) (((this.f34699o - this.f34700p) + this.f34701q) - this.f34702r);
        }

        /* renamed from: i */
        public final int m56078i() {
            return (int) (((this.f34695k - this.f34699o) - this.f34701q) + this.f34702r);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public boolean isAtEnd() {
            if ((this.f34699o + this.f34701q) - this.f34702r == this.f34695k) {
                return true;
            }
            return false;
        }

        /* renamed from: k */
        public final ByteBuffer m56076k(int i, int i2) {
            int position = this.f34692h.position();
            int limit = this.f34692h.limit();
            try {
                try {
                    this.f34692h.position(i);
                    this.f34692h.limit(i2);
                    return this.f34692h.slice();
                } catch (IllegalArgumentException unused) {
                    throw InvalidProtocolBufferException.truncatedMessage();
                }
            } finally {
                this.f34692h.position(position);
                this.f34692h.limit(limit);
            }
        }

        /* renamed from: l */
        public final void m56075l() {
            ByteBuffer byteBuffer = (ByteBuffer) this.f34691g.next();
            this.f34692h = byteBuffer;
            this.f34699o += (int) (this.f34701q - this.f34702r);
            long position = byteBuffer.position();
            this.f34701q = position;
            this.f34702r = position;
            this.f34704t = this.f34692h.limit();
            long m466i = AbstractC22978xY1.m466i(this.f34692h);
            this.f34703s = m466i;
            this.f34701q += m466i;
            this.f34702r += m466i;
            this.f34704t += m466i;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public void popLimit(int i) {
            this.f34697m = i;
            m56079h();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public int pushLimit(int i) {
            if (i >= 0) {
                int totalBytesRead = i + getTotalBytesRead();
                int i2 = this.f34697m;
                if (totalBytesRead <= i2) {
                    this.f34697m = totalBytesRead;
                    m56079h();
                    return i2;
                }
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            throw InvalidProtocolBufferException.negativeSize();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public boolean readBool() {
            if (readRawVarint64() != 0) {
                return true;
            }
            return false;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public byte[] readByteArray() {
            return readRawBytes(readRawVarint32());
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public ByteBuffer readByteBuffer() {
            int readRawVarint32 = readRawVarint32();
            if (readRawVarint32 > 0) {
                long j = readRawVarint32;
                if (j <= m56083d()) {
                    if (!this.f34693i && this.f34694j) {
                        long j2 = this.f34701q + j;
                        this.f34701q = j2;
                        long j3 = this.f34703s;
                        return m56076k((int) ((j2 - j3) - j), (int) (j2 - j3));
                    }
                    byte[] bArr = new byte[readRawVarint32];
                    AbstractC22978xY1.m461n(this.f34701q, bArr, 0L, j);
                    this.f34701q += j;
                    return ByteBuffer.wrap(bArr);
                }
            }
            if (readRawVarint32 > 0 && readRawVarint32 <= m56078i()) {
                byte[] bArr2 = new byte[readRawVarint32];
                m56081f(bArr2, 0, readRawVarint32);
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

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public ByteString readBytes() {
            int readRawVarint32 = readRawVarint32();
            if (readRawVarint32 > 0) {
                long j = readRawVarint32;
                long j2 = this.f34704t;
                long j3 = this.f34701q;
                if (j <= j2 - j3) {
                    if (this.f34693i && this.f34694j) {
                        int i = (int) (j3 - this.f34703s);
                        ByteString wrap = ByteString.wrap(m56076k(i, readRawVarint32 + i));
                        this.f34701q += j;
                        return wrap;
                    }
                    byte[] bArr = new byte[readRawVarint32];
                    AbstractC22978xY1.m461n(j3, bArr, 0L, j);
                    this.f34701q += j;
                    return ByteString.wrap(bArr);
                }
            }
            if (readRawVarint32 > 0 && readRawVarint32 <= m56078i()) {
                byte[] bArr2 = new byte[readRawVarint32];
                m56081f(bArr2, 0, readRawVarint32);
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

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public double readDouble() {
            return Double.longBitsToDouble(readRawLittleEndian64());
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public int readEnum() {
            return readRawVarint32();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public int readFixed32() {
            return readRawLittleEndian32();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public long readFixed64() {
            return readRawLittleEndian64();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public float readFloat() {
            return Float.intBitsToFloat(readRawLittleEndian32());
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public void readGroup(int i, MessageLite.Builder builder, ExtensionRegistryLite extensionRegistryLite) {
            int i2 = this.f34676a;
            if (i2 < this.f34677b) {
                this.f34676a = i2 + 1;
                builder.mergeFrom(this, extensionRegistryLite);
                checkLastTagWas(WireFormat.m55338a(i, 4));
                this.f34676a--;
                return;
            }
            throw InvalidProtocolBufferException.recursionLimitExceeded();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public int readInt32() {
            return readRawVarint32();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public long readInt64() {
            return readRawVarint64();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public void readMessage(MessageLite.Builder builder, ExtensionRegistryLite extensionRegistryLite) {
            int readRawVarint32 = readRawVarint32();
            if (this.f34676a < this.f34677b) {
                int pushLimit = pushLimit(readRawVarint32);
                this.f34676a++;
                builder.mergeFrom(this, extensionRegistryLite);
                checkLastTagWas(0);
                this.f34676a--;
                popLimit(pushLimit);
                return;
            }
            throw InvalidProtocolBufferException.recursionLimitExceeded();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public byte readRawByte() {
            if (m56083d() == 0) {
                m56082e();
            }
            long j = this.f34701q;
            this.f34701q = 1 + j;
            return AbstractC22978xY1.m453v(j);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public byte[] readRawBytes(int i) {
            if (i >= 0) {
                long j = i;
                if (j <= m56083d()) {
                    byte[] bArr = new byte[i];
                    AbstractC22978xY1.m461n(this.f34701q, bArr, 0L, j);
                    this.f34701q += j;
                    return bArr;
                }
            }
            if (i >= 0 && i <= m56078i()) {
                byte[] bArr2 = new byte[i];
                m56081f(bArr2, 0, i);
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

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public int readRawLittleEndian32() {
            if (m56083d() >= 4) {
                long j = this.f34701q;
                this.f34701q = 4 + j;
                return ((AbstractC22978xY1.m453v(j + 3) & 255) << 24) | (AbstractC22978xY1.m453v(j) & 255) | ((AbstractC22978xY1.m453v(1 + j) & 255) << 8) | ((AbstractC22978xY1.m453v(2 + j) & 255) << 16);
            }
            return (readRawByte() & 255) | ((readRawByte() & 255) << 8) | ((readRawByte() & 255) << 16) | ((readRawByte() & 255) << 24);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public long readRawLittleEndian64() {
            if (m56083d() >= 8) {
                long j = this.f34701q;
                this.f34701q = 8 + j;
                long m453v = (AbstractC22978xY1.m453v(j) & 255) | ((AbstractC22978xY1.m453v(1 + j) & 255) << 8);
                return ((AbstractC22978xY1.m453v(j + 7) & 255) << 56) | ((AbstractC22978xY1.m453v(2 + j) & 255) << 16) | m453v | ((AbstractC22978xY1.m453v(3 + j) & 255) << 24) | ((AbstractC22978xY1.m453v(4 + j) & 255) << 32) | ((AbstractC22978xY1.m453v(5 + j) & 255) << 40) | ((AbstractC22978xY1.m453v(6 + j) & 255) << 48);
            }
            return (readRawByte() & 255) | ((readRawByte() & 255) << 8) | ((readRawByte() & 255) << 16) | ((readRawByte() & 255) << 24) | ((readRawByte() & 255) << 32) | ((readRawByte() & 255) << 40) | ((readRawByte() & 255) << 48) | ((readRawByte() & 255) << 56);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public int readRawVarint32() {
            int i;
            long j = this.f34701q;
            if (this.f34704t != j) {
                long j2 = j + 1;
                byte m453v = AbstractC22978xY1.m453v(j);
                if (m453v >= 0) {
                    this.f34701q++;
                    return m453v;
                } else if (this.f34704t - this.f34701q >= 10) {
                    long j3 = 2 + j;
                    int m453v2 = (AbstractC22978xY1.m453v(j2) << 7) ^ m453v;
                    if (m453v2 < 0) {
                        i = m453v2 ^ (-128);
                    } else {
                        long j4 = 3 + j;
                        int m453v3 = (AbstractC22978xY1.m453v(j3) << 14) ^ m453v2;
                        if (m453v3 >= 0) {
                            i = m453v3 ^ 16256;
                        } else {
                            long j5 = 4 + j;
                            int m453v4 = m453v3 ^ (AbstractC22978xY1.m453v(j4) << Ascii.NAK);
                            if (m453v4 < 0) {
                                i = (-2080896) ^ m453v4;
                            } else {
                                j4 = 5 + j;
                                byte m453v5 = AbstractC22978xY1.m453v(j5);
                                int i2 = (m453v4 ^ (m453v5 << Ascii.f52686FS)) ^ 266354560;
                                if (m453v5 < 0) {
                                    j5 = 6 + j;
                                    if (AbstractC22978xY1.m453v(j4) < 0) {
                                        j4 = 7 + j;
                                        if (AbstractC22978xY1.m453v(j5) < 0) {
                                            j5 = 8 + j;
                                            if (AbstractC22978xY1.m453v(j4) < 0) {
                                                j4 = 9 + j;
                                                if (AbstractC22978xY1.m453v(j5) < 0) {
                                                    long j6 = j + 10;
                                                    if (AbstractC22978xY1.m453v(j4) >= 0) {
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
                    this.f34701q = j3;
                    return i;
                }
            }
            return (int) m56080g();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public long readRawVarint64() {
            long j;
            long j2;
            long j3;
            long j4 = this.f34701q;
            if (this.f34704t != j4) {
                long j5 = j4 + 1;
                byte m453v = AbstractC22978xY1.m453v(j4);
                if (m453v >= 0) {
                    this.f34701q++;
                    return m453v;
                } else if (this.f34704t - this.f34701q >= 10) {
                    long j6 = 2 + j4;
                    int m453v2 = (AbstractC22978xY1.m453v(j5) << 7) ^ m453v;
                    if (m453v2 < 0) {
                        j = m453v2 ^ (-128);
                    } else {
                        long j7 = 3 + j4;
                        int m453v3 = (AbstractC22978xY1.m453v(j6) << 14) ^ m453v2;
                        if (m453v3 >= 0) {
                            j = m453v3 ^ 16256;
                            j6 = j7;
                        } else {
                            long j8 = 4 + j4;
                            int m453v4 = m453v3 ^ (AbstractC22978xY1.m453v(j7) << Ascii.NAK);
                            if (m453v4 < 0) {
                                j = (-2080896) ^ m453v4;
                                j6 = j8;
                            } else {
                                long j9 = 5 + j4;
                                long m453v5 = (AbstractC22978xY1.m453v(j8) << 28) ^ m453v4;
                                if (m453v5 >= 0) {
                                    j3 = 266354560;
                                } else {
                                    long j10 = 6 + j4;
                                    long m453v6 = m453v5 ^ (AbstractC22978xY1.m453v(j9) << 35);
                                    if (m453v6 < 0) {
                                        j2 = -34093383808L;
                                    } else {
                                        j9 = 7 + j4;
                                        m453v5 = m453v6 ^ (AbstractC22978xY1.m453v(j10) << 42);
                                        if (m453v5 >= 0) {
                                            j3 = 4363953127296L;
                                        } else {
                                            j10 = 8 + j4;
                                            m453v6 = m453v5 ^ (AbstractC22978xY1.m453v(j9) << 49);
                                            if (m453v6 < 0) {
                                                j2 = -558586000294016L;
                                            } else {
                                                j9 = 9 + j4;
                                                long m453v7 = (m453v6 ^ (AbstractC22978xY1.m453v(j10) << 56)) ^ 71499008037633920L;
                                                if (m453v7 < 0) {
                                                    long j11 = j4 + 10;
                                                    if (AbstractC22978xY1.m453v(j9) >= 0) {
                                                        j = m453v7;
                                                        j6 = j11;
                                                    }
                                                } else {
                                                    j = m453v7;
                                                    j6 = j9;
                                                }
                                            }
                                        }
                                    }
                                    j = j2 ^ m453v6;
                                    j6 = j10;
                                }
                                j = j3 ^ m453v5;
                                j6 = j9;
                            }
                        }
                    }
                    this.f34701q = j6;
                    return j;
                }
            }
            return m56080g();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public int readSFixed32() {
            return readRawLittleEndian32();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public long readSFixed64() {
            return readRawLittleEndian64();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public int readSInt32() {
            return CodedInputStream.decodeZigZag32(readRawVarint32());
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public long readSInt64() {
            return CodedInputStream.decodeZigZag64(readRawVarint64());
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public String readString() {
            int readRawVarint32 = readRawVarint32();
            if (readRawVarint32 > 0) {
                long j = readRawVarint32;
                long j2 = this.f34704t;
                long j3 = this.f34701q;
                if (j <= j2 - j3) {
                    byte[] bArr = new byte[readRawVarint32];
                    AbstractC22978xY1.m461n(j3, bArr, 0L, j);
                    String str = new String(bArr, Internal.f34817a);
                    this.f34701q += j;
                    return str;
                }
            }
            if (readRawVarint32 > 0 && readRawVarint32 <= m56078i()) {
                byte[] bArr2 = new byte[readRawVarint32];
                m56081f(bArr2, 0, readRawVarint32);
                return new String(bArr2, Internal.f34817a);
            } else if (readRawVarint32 == 0) {
                return "";
            } else {
                if (readRawVarint32 < 0) {
                    throw InvalidProtocolBufferException.negativeSize();
                }
                throw InvalidProtocolBufferException.truncatedMessage();
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public String readStringRequireUtf8() {
            int readRawVarint32 = readRawVarint32();
            if (readRawVarint32 > 0) {
                long j = readRawVarint32;
                long j2 = this.f34704t;
                long j3 = this.f34701q;
                if (j <= j2 - j3) {
                    String m55436g = Utf8.m55436g(this.f34692h, (int) (j3 - this.f34702r), readRawVarint32);
                    this.f34701q += j;
                    return m55436g;
                }
            }
            if (readRawVarint32 >= 0 && readRawVarint32 <= m56078i()) {
                byte[] bArr = new byte[readRawVarint32];
                m56081f(bArr, 0, readRawVarint32);
                return Utf8.m55435h(bArr, 0, readRawVarint32);
            } else if (readRawVarint32 == 0) {
                return "";
            } else {
                if (readRawVarint32 <= 0) {
                    throw InvalidProtocolBufferException.negativeSize();
                }
                throw InvalidProtocolBufferException.truncatedMessage();
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public int readTag() {
            if (isAtEnd()) {
                this.f34698n = 0;
                return 0;
            }
            int readRawVarint32 = readRawVarint32();
            this.f34698n = readRawVarint32;
            if (WireFormat.getTagFieldNumber(readRawVarint32) != 0) {
                return this.f34698n;
            }
            throw InvalidProtocolBufferException.invalidTag();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public int readUInt32() {
            return readRawVarint32();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public long readUInt64() {
            return readRawVarint64();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public void readUnknownGroup(int i, MessageLite.Builder builder) {
            readGroup(i, builder, ExtensionRegistryLite.getEmptyRegistry());
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public void resetSizeCounter() {
            this.f34700p = (int) ((this.f34699o + this.f34701q) - this.f34702r);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public boolean skipField(int i) {
            int tagWireType = WireFormat.getTagWireType(i);
            if (tagWireType == 0) {
                m56077j();
                return true;
            } else if (tagWireType == 1) {
                skipRawBytes(8);
                return true;
            } else if (tagWireType == 2) {
                skipRawBytes(readRawVarint32());
                return true;
            } else if (tagWireType == 3) {
                skipMessage();
                checkLastTagWas(WireFormat.m55338a(WireFormat.getTagFieldNumber(i), 4));
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

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public void skipMessage() {
            int readTag;
            do {
                readTag = readTag();
                if (readTag == 0) {
                    return;
                }
            } while (skipField(readTag));
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public void skipRawBytes(int i) {
            if (i >= 0 && i <= ((this.f34695k - this.f34699o) - this.f34701q) + this.f34702r) {
                while (i > 0) {
                    if (m56083d() == 0) {
                        m56082e();
                    }
                    int min = Math.min(i, (int) m56083d());
                    i -= min;
                    this.f34701q += min;
                }
            } else if (i < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            } else {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
        }

        public C4345c(Iterable iterable, int i, boolean z) {
            super();
            this.f34697m = Integer.MAX_VALUE;
            this.f34695k = i;
            this.f34690f = iterable;
            this.f34691g = iterable.iterator();
            this.f34693i = z;
            this.f34699o = 0;
            this.f34700p = 0;
            if (i == 0) {
                this.f34692h = Internal.EMPTY_BYTE_BUFFER;
                this.f34701q = 0L;
                this.f34702r = 0L;
                this.f34704t = 0L;
                this.f34703s = 0L;
                return;
            }
            m56075l();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public void skipMessage(CodedOutputStream codedOutputStream) {
            int readTag;
            do {
                readTag = readTag();
                if (readTag == 0) {
                    return;
                }
            } while (skipField(readTag, codedOutputStream));
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public MessageLite readGroup(int i, Parser parser, ExtensionRegistryLite extensionRegistryLite) {
            int i2 = this.f34676a;
            if (i2 < this.f34677b) {
                this.f34676a = i2 + 1;
                MessageLite messageLite = (MessageLite) parser.parsePartialFrom(this, extensionRegistryLite);
                checkLastTagWas(WireFormat.m55338a(i, 4));
                this.f34676a--;
                return messageLite;
            }
            throw InvalidProtocolBufferException.recursionLimitExceeded();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public MessageLite readMessage(Parser parser, ExtensionRegistryLite extensionRegistryLite) {
            int readRawVarint32 = readRawVarint32();
            if (this.f34676a < this.f34677b) {
                int pushLimit = pushLimit(readRawVarint32);
                this.f34676a++;
                MessageLite messageLite = (MessageLite) parser.parsePartialFrom(this, extensionRegistryLite);
                checkLastTagWas(0);
                this.f34676a--;
                popLimit(pushLimit);
                return messageLite;
            }
            throw InvalidProtocolBufferException.recursionLimitExceeded();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public boolean skipField(int i, CodedOutputStream codedOutputStream) {
            int tagWireType = WireFormat.getTagWireType(i);
            if (tagWireType == 0) {
                long readInt64 = readInt64();
                codedOutputStream.writeRawVarint32(i);
                codedOutputStream.writeUInt64NoTag(readInt64);
                return true;
            } else if (tagWireType == 1) {
                long readRawLittleEndian64 = readRawLittleEndian64();
                codedOutputStream.writeRawVarint32(i);
                codedOutputStream.writeFixed64NoTag(readRawLittleEndian64);
                return true;
            } else if (tagWireType == 2) {
                ByteString readBytes = readBytes();
                codedOutputStream.writeRawVarint32(i);
                codedOutputStream.writeBytesNoTag(readBytes);
                return true;
            } else if (tagWireType == 3) {
                codedOutputStream.writeRawVarint32(i);
                skipMessage(codedOutputStream);
                int m55338a = WireFormat.m55338a(WireFormat.getTagFieldNumber(i), 4);
                checkLastTagWas(m55338a);
                codedOutputStream.writeRawVarint32(m55338a);
                return true;
            } else if (tagWireType != 4) {
                if (tagWireType == 5) {
                    int readRawLittleEndian32 = readRawLittleEndian32();
                    codedOutputStream.writeRawVarint32(i);
                    codedOutputStream.writeFixed32NoTag(readRawLittleEndian32);
                    return true;
                }
                throw InvalidProtocolBufferException.invalidWireType();
            } else {
                return false;
            }
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.CodedInputStream$d */
    /* loaded from: classes2.dex */
    public static final class C4346d extends CodedInputStream {

        /* renamed from: f */
        public final InputStream f34705f;

        /* renamed from: g */
        public final byte[] f34706g;

        /* renamed from: h */
        public int f34707h;

        /* renamed from: i */
        public int f34708i;

        /* renamed from: j */
        public int f34709j;

        /* renamed from: k */
        public int f34710k;

        /* renamed from: l */
        public int f34711l;

        /* renamed from: m */
        public int f34712m;

        /* renamed from: i */
        private void m56069i() {
            int i = this.f34707h + this.f34708i;
            this.f34707h = i;
            int i2 = this.f34711l + i;
            int i3 = this.f34712m;
            if (i2 > i3) {
                int i4 = i2 - i3;
                this.f34708i = i4;
                this.f34707h = i - i4;
                return;
            }
            this.f34708i = 0;
        }

        /* renamed from: l */
        private void m56066l() {
            if (this.f34707h - this.f34709j >= 10) {
                m56065m();
            } else {
                m56064n();
            }
        }

        /* renamed from: m */
        private void m56065m() {
            for (int i = 0; i < 10; i++) {
                byte[] bArr = this.f34706g;
                int i2 = this.f34709j;
                this.f34709j = i2 + 1;
                if (bArr[i2] >= 0) {
                    return;
                }
            }
            throw InvalidProtocolBufferException.malformedVarint();
        }

        /* renamed from: n */
        private void m56064n() {
            for (int i = 0; i < 10; i++) {
                if (readRawByte() >= 0) {
                    return;
                }
            }
            throw InvalidProtocolBufferException.malformedVarint();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public void checkLastTagWas(int i) {
            if (this.f34710k == i) {
                return;
            }
            throw InvalidProtocolBufferException.invalidEndTag();
        }

        /* renamed from: d */
        public final ByteString m56074d(int i) {
            byte[] m56072f = m56072f(i);
            if (m56072f != null) {
                return ByteString.copyFrom(m56072f);
            }
            int i2 = this.f34709j;
            int i3 = this.f34707h;
            int i4 = i3 - i2;
            this.f34711l += i3;
            this.f34709j = 0;
            this.f34707h = 0;
            List<byte[]> m56071g = m56071g(i - i4);
            byte[] bArr = new byte[i];
            System.arraycopy(this.f34706g, i2, bArr, 0, i4);
            for (byte[] bArr2 : m56071g) {
                System.arraycopy(bArr2, 0, bArr, i4, bArr2.length);
                i4 += bArr2.length;
            }
            return ByteString.wrap(bArr);
        }

        /* renamed from: e */
        public final byte[] m56073e(int i, boolean z) {
            byte[] m56072f = m56072f(i);
            if (m56072f != null) {
                if (z) {
                    return (byte[]) m56072f.clone();
                }
                return m56072f;
            }
            int i2 = this.f34709j;
            int i3 = this.f34707h;
            int i4 = i3 - i2;
            this.f34711l += i3;
            this.f34709j = 0;
            this.f34707h = 0;
            List<byte[]> m56071g = m56071g(i - i4);
            byte[] bArr = new byte[i];
            System.arraycopy(this.f34706g, i2, bArr, 0, i4);
            for (byte[] bArr2 : m56071g) {
                System.arraycopy(bArr2, 0, bArr, i4, bArr2.length);
                i4 += bArr2.length;
            }
            return bArr;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public void enableAliasing(boolean z) {
        }

        /* renamed from: f */
        public final byte[] m56072f(int i) {
            if (i == 0) {
                return Internal.EMPTY_BYTE_ARRAY;
            }
            if (i >= 0) {
                int i2 = this.f34711l;
                int i3 = this.f34709j;
                int i4 = i2 + i3 + i;
                if (i4 - this.f34678c <= 0) {
                    int i5 = this.f34712m;
                    if (i4 <= i5) {
                        int i6 = this.f34707h - i3;
                        int i7 = i - i6;
                        if (i7 >= 4096 && i7 > this.f34705f.available()) {
                            return null;
                        }
                        byte[] bArr = new byte[i];
                        System.arraycopy(this.f34706g, this.f34709j, bArr, 0, i6);
                        this.f34711l += this.f34707h;
                        this.f34709j = 0;
                        this.f34707h = 0;
                        while (i6 < i) {
                            int read = this.f34705f.read(bArr, i6, i - i6);
                            if (read != -1) {
                                this.f34711l += read;
                                i6 += read;
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

        /* renamed from: g */
        public final List m56071g(int i) {
            ArrayList arrayList = new ArrayList();
            while (i > 0) {
                int min = Math.min(i, 4096);
                byte[] bArr = new byte[min];
                int i2 = 0;
                while (i2 < min) {
                    int read = this.f34705f.read(bArr, i2, min - i2);
                    if (read != -1) {
                        this.f34711l += read;
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

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public int getBytesUntilLimit() {
            int i = this.f34712m;
            if (i == Integer.MAX_VALUE) {
                return -1;
            }
            return i - (this.f34711l + this.f34709j);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public int getLastTag() {
            return this.f34710k;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public int getTotalBytesRead() {
            return this.f34711l + this.f34709j;
        }

        /* renamed from: h */
        public long m56070h() {
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

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public boolean isAtEnd() {
            if (this.f34709j == this.f34707h && !m56063o(1)) {
                return true;
            }
            return false;
        }

        /* renamed from: j */
        public final void m56068j(int i) {
            if (!m56063o(i)) {
                if (i > (this.f34678c - this.f34711l) - this.f34709j) {
                    throw InvalidProtocolBufferException.sizeLimitExceeded();
                }
                throw InvalidProtocolBufferException.truncatedMessage();
            }
        }

        /* renamed from: k */
        public final void m56067k(int i) {
            if (i >= 0) {
                int i2 = this.f34711l;
                int i3 = this.f34709j;
                int i4 = i2 + i3 + i;
                int i5 = this.f34712m;
                if (i4 <= i5) {
                    this.f34711l = i2 + i3;
                    int i6 = this.f34707h - i3;
                    this.f34707h = 0;
                    this.f34709j = 0;
                    while (i6 < i) {
                        try {
                            long j = i - i6;
                            long skip = this.f34705f.skip(j);
                            int i7 = (skip > 0L ? 1 : (skip == 0L ? 0 : -1));
                            if (i7 >= 0 && skip <= j) {
                                if (i7 == 0) {
                                    break;
                                }
                                i6 += (int) skip;
                            } else {
                                throw new IllegalStateException(this.f34705f.getClass() + "#skip returned invalid result: " + skip + "\nThe InputStream implementation is buggy.");
                            }
                        } finally {
                            this.f34711l += i6;
                            m56069i();
                        }
                    }
                    if (i6 < i) {
                        int i8 = this.f34707h;
                        int i9 = i8 - this.f34709j;
                        this.f34709j = i8;
                        m56068j(1);
                        while (true) {
                            int i10 = i - i9;
                            int i11 = this.f34707h;
                            if (i10 > i11) {
                                i9 += i11;
                                this.f34709j = i11;
                                m56068j(1);
                            } else {
                                this.f34709j = i10;
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

        /* renamed from: o */
        public final boolean m56063o(int i) {
            int i2 = this.f34709j;
            int i3 = i2 + i;
            int i4 = this.f34707h;
            if (i3 > i4) {
                int i5 = this.f34678c;
                int i6 = this.f34711l;
                if (i > (i5 - i6) - i2 || i6 + i2 + i > this.f34712m) {
                    return false;
                }
                if (i2 > 0) {
                    if (i4 > i2) {
                        byte[] bArr = this.f34706g;
                        System.arraycopy(bArr, i2, bArr, 0, i4 - i2);
                    }
                    this.f34711l += i2;
                    this.f34707h -= i2;
                    this.f34709j = 0;
                }
                InputStream inputStream = this.f34705f;
                byte[] bArr2 = this.f34706g;
                int i7 = this.f34707h;
                int read = inputStream.read(bArr2, i7, Math.min(bArr2.length - i7, (this.f34678c - this.f34711l) - i7));
                if (read != 0 && read >= -1 && read <= this.f34706g.length) {
                    if (read <= 0) {
                        return false;
                    }
                    this.f34707h += read;
                    m56069i();
                    if (this.f34707h >= i) {
                        return true;
                    }
                    return m56063o(i);
                }
                throw new IllegalStateException(this.f34705f.getClass() + "#read(byte[]) returned invalid result: " + read + "\nThe InputStream implementation is buggy.");
            }
            throw new IllegalStateException("refillBuffer() called when " + i + " bytes were already available in buffer");
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public void popLimit(int i) {
            this.f34712m = i;
            m56069i();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public int pushLimit(int i) {
            if (i >= 0) {
                int i2 = i + this.f34711l + this.f34709j;
                int i3 = this.f34712m;
                if (i2 <= i3) {
                    this.f34712m = i2;
                    m56069i();
                    return i3;
                }
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            throw InvalidProtocolBufferException.negativeSize();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public boolean readBool() {
            if (readRawVarint64() != 0) {
                return true;
            }
            return false;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public byte[] readByteArray() {
            int readRawVarint32 = readRawVarint32();
            int i = this.f34707h;
            int i2 = this.f34709j;
            if (readRawVarint32 <= i - i2 && readRawVarint32 > 0) {
                byte[] copyOfRange = Arrays.copyOfRange(this.f34706g, i2, i2 + readRawVarint32);
                this.f34709j += readRawVarint32;
                return copyOfRange;
            }
            return m56073e(readRawVarint32, false);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public ByteBuffer readByteBuffer() {
            int readRawVarint32 = readRawVarint32();
            int i = this.f34707h;
            int i2 = this.f34709j;
            if (readRawVarint32 <= i - i2 && readRawVarint32 > 0) {
                ByteBuffer wrap = ByteBuffer.wrap(Arrays.copyOfRange(this.f34706g, i2, i2 + readRawVarint32));
                this.f34709j += readRawVarint32;
                return wrap;
            } else if (readRawVarint32 == 0) {
                return Internal.EMPTY_BYTE_BUFFER;
            } else {
                return ByteBuffer.wrap(m56073e(readRawVarint32, true));
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public ByteString readBytes() {
            int readRawVarint32 = readRawVarint32();
            int i = this.f34707h;
            int i2 = this.f34709j;
            if (readRawVarint32 <= i - i2 && readRawVarint32 > 0) {
                ByteString copyFrom = ByteString.copyFrom(this.f34706g, i2, readRawVarint32);
                this.f34709j += readRawVarint32;
                return copyFrom;
            } else if (readRawVarint32 == 0) {
                return ByteString.EMPTY;
            } else {
                return m56074d(readRawVarint32);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public double readDouble() {
            return Double.longBitsToDouble(readRawLittleEndian64());
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public int readEnum() {
            return readRawVarint32();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public int readFixed32() {
            return readRawLittleEndian32();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public long readFixed64() {
            return readRawLittleEndian64();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public float readFloat() {
            return Float.intBitsToFloat(readRawLittleEndian32());
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public void readGroup(int i, MessageLite.Builder builder, ExtensionRegistryLite extensionRegistryLite) {
            int i2 = this.f34676a;
            if (i2 < this.f34677b) {
                this.f34676a = i2 + 1;
                builder.mergeFrom(this, extensionRegistryLite);
                checkLastTagWas(WireFormat.m55338a(i, 4));
                this.f34676a--;
                return;
            }
            throw InvalidProtocolBufferException.recursionLimitExceeded();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public int readInt32() {
            return readRawVarint32();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public long readInt64() {
            return readRawVarint64();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public void readMessage(MessageLite.Builder builder, ExtensionRegistryLite extensionRegistryLite) {
            int readRawVarint32 = readRawVarint32();
            if (this.f34676a < this.f34677b) {
                int pushLimit = pushLimit(readRawVarint32);
                this.f34676a++;
                builder.mergeFrom(this, extensionRegistryLite);
                checkLastTagWas(0);
                this.f34676a--;
                popLimit(pushLimit);
                return;
            }
            throw InvalidProtocolBufferException.recursionLimitExceeded();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public byte readRawByte() {
            if (this.f34709j == this.f34707h) {
                m56068j(1);
            }
            byte[] bArr = this.f34706g;
            int i = this.f34709j;
            this.f34709j = i + 1;
            return bArr[i];
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public byte[] readRawBytes(int i) {
            int i2 = this.f34709j;
            if (i <= this.f34707h - i2 && i > 0) {
                int i3 = i + i2;
                this.f34709j = i3;
                return Arrays.copyOfRange(this.f34706g, i2, i3);
            }
            return m56073e(i, false);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public int readRawLittleEndian32() {
            int i = this.f34709j;
            if (this.f34707h - i < 4) {
                m56068j(4);
                i = this.f34709j;
            }
            byte[] bArr = this.f34706g;
            this.f34709j = i + 4;
            return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public long readRawLittleEndian64() {
            int i = this.f34709j;
            if (this.f34707h - i < 8) {
                m56068j(8);
                i = this.f34709j;
            }
            byte[] bArr = this.f34706g;
            this.f34709j = i + 8;
            return ((bArr[i + 7] & 255) << 56) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public int readRawVarint32() {
            int i;
            int i2 = this.f34709j;
            int i3 = this.f34707h;
            if (i3 != i2) {
                byte[] bArr = this.f34706g;
                int i4 = i2 + 1;
                byte b = bArr[i2];
                if (b >= 0) {
                    this.f34709j = i4;
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
                    this.f34709j = i5;
                    return i;
                }
            }
            return (int) m56070h();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public long readRawVarint64() {
            long j;
            long j2;
            long j3;
            int i = this.f34709j;
            int i2 = this.f34707h;
            if (i2 != i) {
                byte[] bArr = this.f34706g;
                int i3 = i + 1;
                byte b = bArr[i];
                if (b >= 0) {
                    this.f34709j = i3;
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
                    this.f34709j = i4;
                    return j;
                }
            }
            return m56070h();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public int readSFixed32() {
            return readRawLittleEndian32();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public long readSFixed64() {
            return readRawLittleEndian64();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public int readSInt32() {
            return CodedInputStream.decodeZigZag32(readRawVarint32());
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public long readSInt64() {
            return CodedInputStream.decodeZigZag64(readRawVarint64());
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public String readString() {
            int readRawVarint32 = readRawVarint32();
            if (readRawVarint32 > 0) {
                int i = this.f34707h;
                int i2 = this.f34709j;
                if (readRawVarint32 <= i - i2) {
                    String str = new String(this.f34706g, i2, readRawVarint32, Internal.f34817a);
                    this.f34709j += readRawVarint32;
                    return str;
                }
            }
            if (readRawVarint32 == 0) {
                return "";
            }
            if (readRawVarint32 <= this.f34707h) {
                m56068j(readRawVarint32);
                String str2 = new String(this.f34706g, this.f34709j, readRawVarint32, Internal.f34817a);
                this.f34709j += readRawVarint32;
                return str2;
            }
            return new String(m56073e(readRawVarint32, false), Internal.f34817a);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public String readStringRequireUtf8() {
            byte[] m56073e;
            int readRawVarint32 = readRawVarint32();
            int i = this.f34709j;
            int i2 = this.f34707h;
            if (readRawVarint32 <= i2 - i && readRawVarint32 > 0) {
                m56073e = this.f34706g;
                this.f34709j = i + readRawVarint32;
            } else if (readRawVarint32 == 0) {
                return "";
            } else {
                i = 0;
                if (readRawVarint32 <= i2) {
                    m56068j(readRawVarint32);
                    m56073e = this.f34706g;
                    this.f34709j = readRawVarint32;
                } else {
                    m56073e = m56073e(readRawVarint32, false);
                }
            }
            return Utf8.m55435h(m56073e, i, readRawVarint32);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public int readTag() {
            if (isAtEnd()) {
                this.f34710k = 0;
                return 0;
            }
            int readRawVarint32 = readRawVarint32();
            this.f34710k = readRawVarint32;
            if (WireFormat.getTagFieldNumber(readRawVarint32) != 0) {
                return this.f34710k;
            }
            throw InvalidProtocolBufferException.invalidTag();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public int readUInt32() {
            return readRawVarint32();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public long readUInt64() {
            return readRawVarint64();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public void readUnknownGroup(int i, MessageLite.Builder builder) {
            readGroup(i, builder, ExtensionRegistryLite.getEmptyRegistry());
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public void resetSizeCounter() {
            this.f34711l = -this.f34709j;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public boolean skipField(int i) {
            int tagWireType = WireFormat.getTagWireType(i);
            if (tagWireType == 0) {
                m56066l();
                return true;
            } else if (tagWireType == 1) {
                skipRawBytes(8);
                return true;
            } else if (tagWireType == 2) {
                skipRawBytes(readRawVarint32());
                return true;
            } else if (tagWireType == 3) {
                skipMessage();
                checkLastTagWas(WireFormat.m55338a(WireFormat.getTagFieldNumber(i), 4));
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

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public void skipMessage() {
            int readTag;
            do {
                readTag = readTag();
                if (readTag == 0) {
                    return;
                }
            } while (skipField(readTag));
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public void skipRawBytes(int i) {
            int i2 = this.f34707h;
            int i3 = this.f34709j;
            if (i <= i2 - i3 && i >= 0) {
                this.f34709j = i3 + i;
            } else {
                m56067k(i);
            }
        }

        public C4346d(InputStream inputStream, int i) {
            super();
            this.f34712m = Integer.MAX_VALUE;
            Internal.m55729b(inputStream, "input");
            this.f34705f = inputStream;
            this.f34706g = new byte[i];
            this.f34707h = 0;
            this.f34709j = 0;
            this.f34711l = 0;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public void skipMessage(CodedOutputStream codedOutputStream) {
            int readTag;
            do {
                readTag = readTag();
                if (readTag == 0) {
                    return;
                }
            } while (skipField(readTag, codedOutputStream));
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public MessageLite readGroup(int i, Parser parser, ExtensionRegistryLite extensionRegistryLite) {
            int i2 = this.f34676a;
            if (i2 < this.f34677b) {
                this.f34676a = i2 + 1;
                MessageLite messageLite = (MessageLite) parser.parsePartialFrom(this, extensionRegistryLite);
                checkLastTagWas(WireFormat.m55338a(i, 4));
                this.f34676a--;
                return messageLite;
            }
            throw InvalidProtocolBufferException.recursionLimitExceeded();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public MessageLite readMessage(Parser parser, ExtensionRegistryLite extensionRegistryLite) {
            int readRawVarint32 = readRawVarint32();
            if (this.f34676a < this.f34677b) {
                int pushLimit = pushLimit(readRawVarint32);
                this.f34676a++;
                MessageLite messageLite = (MessageLite) parser.parsePartialFrom(this, extensionRegistryLite);
                checkLastTagWas(0);
                this.f34676a--;
                popLimit(pushLimit);
                return messageLite;
            }
            throw InvalidProtocolBufferException.recursionLimitExceeded();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public boolean skipField(int i, CodedOutputStream codedOutputStream) {
            int tagWireType = WireFormat.getTagWireType(i);
            if (tagWireType == 0) {
                long readInt64 = readInt64();
                codedOutputStream.writeRawVarint32(i);
                codedOutputStream.writeUInt64NoTag(readInt64);
                return true;
            } else if (tagWireType == 1) {
                long readRawLittleEndian64 = readRawLittleEndian64();
                codedOutputStream.writeRawVarint32(i);
                codedOutputStream.writeFixed64NoTag(readRawLittleEndian64);
                return true;
            } else if (tagWireType == 2) {
                ByteString readBytes = readBytes();
                codedOutputStream.writeRawVarint32(i);
                codedOutputStream.writeBytesNoTag(readBytes);
                return true;
            } else if (tagWireType == 3) {
                codedOutputStream.writeRawVarint32(i);
                skipMessage(codedOutputStream);
                int m55338a = WireFormat.m55338a(WireFormat.getTagFieldNumber(i), 4);
                checkLastTagWas(m55338a);
                codedOutputStream.writeRawVarint32(m55338a);
                return true;
            } else if (tagWireType != 4) {
                if (tagWireType == 5) {
                    int readRawLittleEndian32 = readRawLittleEndian32();
                    codedOutputStream.writeRawVarint32(i);
                    codedOutputStream.writeFixed32NoTag(readRawLittleEndian32);
                    return true;
                }
                throw InvalidProtocolBufferException.invalidWireType();
            } else {
                return false;
            }
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.CodedInputStream$e */
    /* loaded from: classes2.dex */
    public static final class C4347e extends CodedInputStream {

        /* renamed from: f */
        public final ByteBuffer f34713f;

        /* renamed from: g */
        public final boolean f34714g;

        /* renamed from: h */
        public final long f34715h;

        /* renamed from: i */
        public long f34716i;

        /* renamed from: j */
        public long f34717j;

        /* renamed from: k */
        public long f34718k;

        /* renamed from: l */
        public int f34719l;

        /* renamed from: m */
        public int f34720m;

        /* renamed from: n */
        public boolean f34721n;

        /* renamed from: o */
        public int f34722o;

        /* renamed from: e */
        public static boolean m56061e() {
            return AbstractC22978xY1.m490I();
        }

        /* renamed from: g */
        private void m56059g() {
            long j = this.f34716i + this.f34719l;
            this.f34716i = j;
            int i = (int) (j - this.f34718k);
            int i2 = this.f34722o;
            if (i > i2) {
                int i3 = i - i2;
                this.f34719l = i3;
                this.f34716i = j - i3;
                return;
            }
            this.f34719l = 0;
        }

        /* renamed from: h */
        private int m56058h() {
            return (int) (this.f34716i - this.f34717j);
        }

        /* renamed from: i */
        private void m56057i() {
            if (m56058h() >= 10) {
                m56056j();
            } else {
                m56055k();
            }
        }

        /* renamed from: j */
        private void m56056j() {
            for (int i = 0; i < 10; i++) {
                long j = this.f34717j;
                this.f34717j = 1 + j;
                if (AbstractC22978xY1.m453v(j) >= 0) {
                    return;
                }
            }
            throw InvalidProtocolBufferException.malformedVarint();
        }

        /* renamed from: k */
        private void m56055k() {
            for (int i = 0; i < 10; i++) {
                if (readRawByte() >= 0) {
                    return;
                }
            }
            throw InvalidProtocolBufferException.malformedVarint();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public void checkLastTagWas(int i) {
            if (this.f34720m == i) {
                return;
            }
            throw InvalidProtocolBufferException.invalidEndTag();
        }

        /* renamed from: d */
        public final int m56062d(long j) {
            return (int) (j - this.f34715h);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public void enableAliasing(boolean z) {
            this.f34721n = z;
        }

        /* renamed from: f */
        public long m56060f() {
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

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public int getBytesUntilLimit() {
            int i = this.f34722o;
            if (i == Integer.MAX_VALUE) {
                return -1;
            }
            return i - getTotalBytesRead();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public int getLastTag() {
            return this.f34720m;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public int getTotalBytesRead() {
            return (int) (this.f34717j - this.f34718k);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public boolean isAtEnd() {
            if (this.f34717j == this.f34716i) {
                return true;
            }
            return false;
        }

        /* renamed from: l */
        public final ByteBuffer m56054l(long j, long j2) {
            int position = this.f34713f.position();
            int limit = this.f34713f.limit();
            try {
                try {
                    this.f34713f.position(m56062d(j));
                    this.f34713f.limit(m56062d(j2));
                    return this.f34713f.slice();
                } catch (IllegalArgumentException unused) {
                    throw InvalidProtocolBufferException.truncatedMessage();
                }
            } finally {
                this.f34713f.position(position);
                this.f34713f.limit(limit);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public void popLimit(int i) {
            this.f34722o = i;
            m56059g();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public int pushLimit(int i) {
            if (i >= 0) {
                int totalBytesRead = i + getTotalBytesRead();
                int i2 = this.f34722o;
                if (totalBytesRead <= i2) {
                    this.f34722o = totalBytesRead;
                    m56059g();
                    return i2;
                }
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            throw InvalidProtocolBufferException.negativeSize();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public boolean readBool() {
            if (readRawVarint64() != 0) {
                return true;
            }
            return false;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public byte[] readByteArray() {
            return readRawBytes(readRawVarint32());
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public ByteBuffer readByteBuffer() {
            int readRawVarint32 = readRawVarint32();
            if (readRawVarint32 > 0 && readRawVarint32 <= m56058h()) {
                if (!this.f34714g && this.f34721n) {
                    long j = this.f34717j;
                    long j2 = readRawVarint32;
                    ByteBuffer m56054l = m56054l(j, j + j2);
                    this.f34717j += j2;
                    return m56054l;
                }
                byte[] bArr = new byte[readRawVarint32];
                long j3 = readRawVarint32;
                AbstractC22978xY1.m461n(this.f34717j, bArr, 0L, j3);
                this.f34717j += j3;
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

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public ByteString readBytes() {
            int readRawVarint32 = readRawVarint32();
            if (readRawVarint32 > 0 && readRawVarint32 <= m56058h()) {
                if (this.f34714g && this.f34721n) {
                    long j = this.f34717j;
                    long j2 = readRawVarint32;
                    ByteBuffer m56054l = m56054l(j, j + j2);
                    this.f34717j += j2;
                    return ByteString.wrap(m56054l);
                }
                byte[] bArr = new byte[readRawVarint32];
                long j3 = readRawVarint32;
                AbstractC22978xY1.m461n(this.f34717j, bArr, 0L, j3);
                this.f34717j += j3;
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

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public double readDouble() {
            return Double.longBitsToDouble(readRawLittleEndian64());
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public int readEnum() {
            return readRawVarint32();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public int readFixed32() {
            return readRawLittleEndian32();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public long readFixed64() {
            return readRawLittleEndian64();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public float readFloat() {
            return Float.intBitsToFloat(readRawLittleEndian32());
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public void readGroup(int i, MessageLite.Builder builder, ExtensionRegistryLite extensionRegistryLite) {
            int i2 = this.f34676a;
            if (i2 < this.f34677b) {
                this.f34676a = i2 + 1;
                builder.mergeFrom(this, extensionRegistryLite);
                checkLastTagWas(WireFormat.m55338a(i, 4));
                this.f34676a--;
                return;
            }
            throw InvalidProtocolBufferException.recursionLimitExceeded();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public int readInt32() {
            return readRawVarint32();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public long readInt64() {
            return readRawVarint64();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public void readMessage(MessageLite.Builder builder, ExtensionRegistryLite extensionRegistryLite) {
            int readRawVarint32 = readRawVarint32();
            if (this.f34676a < this.f34677b) {
                int pushLimit = pushLimit(readRawVarint32);
                this.f34676a++;
                builder.mergeFrom(this, extensionRegistryLite);
                checkLastTagWas(0);
                this.f34676a--;
                popLimit(pushLimit);
                return;
            }
            throw InvalidProtocolBufferException.recursionLimitExceeded();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public byte readRawByte() {
            long j = this.f34717j;
            if (j != this.f34716i) {
                this.f34717j = 1 + j;
                return AbstractC22978xY1.m453v(j);
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public byte[] readRawBytes(int i) {
            if (i >= 0 && i <= m56058h()) {
                byte[] bArr = new byte[i];
                long j = this.f34717j;
                long j2 = i;
                m56054l(j, j + j2).get(bArr);
                this.f34717j += j2;
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

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public int readRawLittleEndian32() {
            long j = this.f34717j;
            if (this.f34716i - j >= 4) {
                this.f34717j = 4 + j;
                return ((AbstractC22978xY1.m453v(j + 3) & 255) << 24) | (AbstractC22978xY1.m453v(j) & 255) | ((AbstractC22978xY1.m453v(1 + j) & 255) << 8) | ((AbstractC22978xY1.m453v(2 + j) & 255) << 16);
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public long readRawLittleEndian64() {
            long j = this.f34717j;
            if (this.f34716i - j >= 8) {
                this.f34717j = 8 + j;
                return ((AbstractC22978xY1.m453v(j + 7) & 255) << 56) | (AbstractC22978xY1.m453v(j) & 255) | ((AbstractC22978xY1.m453v(1 + j) & 255) << 8) | ((AbstractC22978xY1.m453v(2 + j) & 255) << 16) | ((AbstractC22978xY1.m453v(3 + j) & 255) << 24) | ((AbstractC22978xY1.m453v(4 + j) & 255) << 32) | ((AbstractC22978xY1.m453v(5 + j) & 255) << 40) | ((AbstractC22978xY1.m453v(6 + j) & 255) << 48);
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }

        /* JADX WARN: Code restructure failed: missing block: B:73:0x008c, code lost:
            if (p000.AbstractC22978xY1.m453v(r3) < 0) goto L36;
         */
        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public int readRawVarint32() {
            /*
                r10 = this;
                long r0 = r10.f34717j
                long r2 = r10.f34716i
                int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
                if (r4 != 0) goto La
                goto L8e
            La:
                r2 = 1
                long r2 = r2 + r0
                byte r4 = p000.AbstractC22978xY1.m453v(r0)
                if (r4 < 0) goto L16
                r10.f34717j = r2
                return r4
            L16:
                long r5 = r10.f34716i
                long r5 = r5 - r2
                r7 = 9
                int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
                if (r9 >= 0) goto L21
                goto L8e
            L21:
                r5 = 2
                long r5 = r5 + r0
                byte r2 = p000.AbstractC22978xY1.m453v(r2)
                int r2 = r2 << 7
                r2 = r2 ^ r4
                if (r2 >= 0) goto L31
                r0 = r2 ^ (-128(0xffffffffffffff80, float:NaN))
                goto L98
            L31:
                r3 = 3
                long r3 = r3 + r0
                byte r5 = p000.AbstractC22978xY1.m453v(r5)
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
                byte r3 = p000.AbstractC22978xY1.m453v(r3)
                int r3 = r3 << 21
                r2 = r2 ^ r3
                if (r2 >= 0) goto L52
                r0 = -2080896(0xffffffffffe03f80, float:NaN)
                r0 = r0 ^ r2
                goto L98
            L52:
                r3 = 5
                long r3 = r3 + r0
                byte r5 = p000.AbstractC22978xY1.m453v(r5)
                int r6 = r5 << 28
                r2 = r2 ^ r6
                r6 = 266354560(0xfe03f80, float:2.2112565E-29)
                r2 = r2 ^ r6
                if (r5 >= 0) goto L96
                r5 = 6
                long r5 = r5 + r0
                byte r3 = p000.AbstractC22978xY1.m453v(r3)
                if (r3 >= 0) goto L94
                r3 = 7
                long r3 = r3 + r0
                byte r5 = p000.AbstractC22978xY1.m453v(r5)
                if (r5 >= 0) goto L96
                r5 = 8
                long r5 = r5 + r0
                byte r3 = p000.AbstractC22978xY1.m453v(r3)
                if (r3 >= 0) goto L94
                long r3 = r0 + r7
                byte r5 = p000.AbstractC22978xY1.m453v(r5)
                if (r5 >= 0) goto L96
                r5 = 10
                long r5 = r5 + r0
                byte r0 = p000.AbstractC22978xY1.m453v(r3)
                if (r0 >= 0) goto L94
            L8e:
                long r0 = r10.m56060f()
                int r1 = (int) r0
                return r1
            L94:
                r0 = r2
                goto L98
            L96:
                r0 = r2
                goto L3f
            L98:
                r10.f34717j = r5
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.CodedInputStream.C4347e.readRawVarint32():int");
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public long readRawVarint64() {
            long j;
            long j2;
            long j3;
            int i;
            long j4 = this.f34717j;
            if (this.f34716i != j4) {
                long j5 = 1 + j4;
                byte m453v = AbstractC22978xY1.m453v(j4);
                if (m453v >= 0) {
                    this.f34717j = j5;
                    return m453v;
                } else if (this.f34716i - j5 >= 9) {
                    long j6 = 2 + j4;
                    int m453v2 = (AbstractC22978xY1.m453v(j5) << 7) ^ m453v;
                    if (m453v2 < 0) {
                        i = m453v2 ^ (-128);
                    } else {
                        long j7 = 3 + j4;
                        int m453v3 = m453v2 ^ (AbstractC22978xY1.m453v(j6) << 14);
                        if (m453v3 >= 0) {
                            j = m453v3 ^ 16256;
                            j6 = j7;
                        } else {
                            j6 = 4 + j4;
                            int m453v4 = m453v3 ^ (AbstractC22978xY1.m453v(j7) << Ascii.NAK);
                            if (m453v4 < 0) {
                                i = (-2080896) ^ m453v4;
                            } else {
                                long j8 = 5 + j4;
                                long m453v5 = m453v4 ^ (AbstractC22978xY1.m453v(j6) << 28);
                                if (m453v5 >= 0) {
                                    j3 = 266354560;
                                } else {
                                    long j9 = 6 + j4;
                                    long m453v6 = m453v5 ^ (AbstractC22978xY1.m453v(j8) << 35);
                                    if (m453v6 < 0) {
                                        j2 = -34093383808L;
                                    } else {
                                        j8 = 7 + j4;
                                        m453v5 = m453v6 ^ (AbstractC22978xY1.m453v(j9) << 42);
                                        if (m453v5 >= 0) {
                                            j3 = 4363953127296L;
                                        } else {
                                            j9 = 8 + j4;
                                            m453v6 = m453v5 ^ (AbstractC22978xY1.m453v(j8) << 49);
                                            if (m453v6 < 0) {
                                                j2 = -558586000294016L;
                                            } else {
                                                long j10 = j4 + 9;
                                                long m453v7 = (m453v6 ^ (AbstractC22978xY1.m453v(j9) << 56)) ^ 71499008037633920L;
                                                if (m453v7 < 0) {
                                                    long j11 = j4 + 10;
                                                    if (AbstractC22978xY1.m453v(j10) >= 0) {
                                                        j6 = j11;
                                                        j = m453v7;
                                                    }
                                                } else {
                                                    j = m453v7;
                                                    j6 = j10;
                                                }
                                            }
                                        }
                                    }
                                    j = j2 ^ m453v6;
                                    j6 = j9;
                                }
                                j = j3 ^ m453v5;
                                j6 = j8;
                            }
                        }
                        this.f34717j = j6;
                        return j;
                    }
                    j = i;
                    this.f34717j = j6;
                    return j;
                }
            }
            return m56060f();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public int readSFixed32() {
            return readRawLittleEndian32();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public long readSFixed64() {
            return readRawLittleEndian64();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public int readSInt32() {
            return CodedInputStream.decodeZigZag32(readRawVarint32());
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public long readSInt64() {
            return CodedInputStream.decodeZigZag64(readRawVarint64());
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public String readString() {
            int readRawVarint32 = readRawVarint32();
            if (readRawVarint32 > 0 && readRawVarint32 <= m56058h()) {
                byte[] bArr = new byte[readRawVarint32];
                long j = readRawVarint32;
                AbstractC22978xY1.m461n(this.f34717j, bArr, 0L, j);
                String str = new String(bArr, Internal.f34817a);
                this.f34717j += j;
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

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public String readStringRequireUtf8() {
            int readRawVarint32 = readRawVarint32();
            if (readRawVarint32 > 0 && readRawVarint32 <= m56058h()) {
                String m55436g = Utf8.m55436g(this.f34713f, m56062d(this.f34717j), readRawVarint32);
                this.f34717j += readRawVarint32;
                return m55436g;
            } else if (readRawVarint32 == 0) {
                return "";
            } else {
                if (readRawVarint32 <= 0) {
                    throw InvalidProtocolBufferException.negativeSize();
                }
                throw InvalidProtocolBufferException.truncatedMessage();
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public int readTag() {
            if (isAtEnd()) {
                this.f34720m = 0;
                return 0;
            }
            int readRawVarint32 = readRawVarint32();
            this.f34720m = readRawVarint32;
            if (WireFormat.getTagFieldNumber(readRawVarint32) != 0) {
                return this.f34720m;
            }
            throw InvalidProtocolBufferException.invalidTag();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public int readUInt32() {
            return readRawVarint32();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public long readUInt64() {
            return readRawVarint64();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public void readUnknownGroup(int i, MessageLite.Builder builder) {
            readGroup(i, builder, ExtensionRegistryLite.getEmptyRegistry());
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public void resetSizeCounter() {
            this.f34718k = this.f34717j;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public boolean skipField(int i) {
            int tagWireType = WireFormat.getTagWireType(i);
            if (tagWireType == 0) {
                m56057i();
                return true;
            } else if (tagWireType == 1) {
                skipRawBytes(8);
                return true;
            } else if (tagWireType == 2) {
                skipRawBytes(readRawVarint32());
                return true;
            } else if (tagWireType == 3) {
                skipMessage();
                checkLastTagWas(WireFormat.m55338a(WireFormat.getTagFieldNumber(i), 4));
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

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public void skipMessage() {
            int readTag;
            do {
                readTag = readTag();
                if (readTag == 0) {
                    return;
                }
            } while (skipField(readTag));
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public void skipRawBytes(int i) {
            if (i >= 0 && i <= m56058h()) {
                this.f34717j += i;
            } else if (i < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            } else {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
        }

        public C4347e(ByteBuffer byteBuffer, boolean z) {
            super();
            this.f34722o = Integer.MAX_VALUE;
            this.f34713f = byteBuffer;
            long m466i = AbstractC22978xY1.m466i(byteBuffer);
            this.f34715h = m466i;
            this.f34716i = byteBuffer.limit() + m466i;
            long position = m466i + byteBuffer.position();
            this.f34717j = position;
            this.f34718k = position;
            this.f34714g = z;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public void skipMessage(CodedOutputStream codedOutputStream) {
            int readTag;
            do {
                readTag = readTag();
                if (readTag == 0) {
                    return;
                }
            } while (skipField(readTag, codedOutputStream));
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public MessageLite readGroup(int i, Parser parser, ExtensionRegistryLite extensionRegistryLite) {
            int i2 = this.f34676a;
            if (i2 < this.f34677b) {
                this.f34676a = i2 + 1;
                MessageLite messageLite = (MessageLite) parser.parsePartialFrom(this, extensionRegistryLite);
                checkLastTagWas(WireFormat.m55338a(i, 4));
                this.f34676a--;
                return messageLite;
            }
            throw InvalidProtocolBufferException.recursionLimitExceeded();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public MessageLite readMessage(Parser parser, ExtensionRegistryLite extensionRegistryLite) {
            int readRawVarint32 = readRawVarint32();
            if (this.f34676a < this.f34677b) {
                int pushLimit = pushLimit(readRawVarint32);
                this.f34676a++;
                MessageLite messageLite = (MessageLite) parser.parsePartialFrom(this, extensionRegistryLite);
                checkLastTagWas(0);
                this.f34676a--;
                popLimit(pushLimit);
                return messageLite;
            }
            throw InvalidProtocolBufferException.recursionLimitExceeded();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public boolean skipField(int i, CodedOutputStream codedOutputStream) {
            int tagWireType = WireFormat.getTagWireType(i);
            if (tagWireType == 0) {
                long readInt64 = readInt64();
                codedOutputStream.writeRawVarint32(i);
                codedOutputStream.writeUInt64NoTag(readInt64);
                return true;
            } else if (tagWireType == 1) {
                long readRawLittleEndian64 = readRawLittleEndian64();
                codedOutputStream.writeRawVarint32(i);
                codedOutputStream.writeFixed64NoTag(readRawLittleEndian64);
                return true;
            } else if (tagWireType == 2) {
                ByteString readBytes = readBytes();
                codedOutputStream.writeRawVarint32(i);
                codedOutputStream.writeBytesNoTag(readBytes);
                return true;
            } else if (tagWireType == 3) {
                codedOutputStream.writeRawVarint32(i);
                skipMessage(codedOutputStream);
                int m55338a = WireFormat.m55338a(WireFormat.getTagFieldNumber(i), 4);
                checkLastTagWas(m55338a);
                codedOutputStream.writeRawVarint32(m55338a);
                return true;
            } else if (tagWireType != 4) {
                if (tagWireType == 5) {
                    int readRawLittleEndian32 = readRawLittleEndian32();
                    codedOutputStream.writeRawVarint32(i);
                    codedOutputStream.writeFixed32NoTag(readRawLittleEndian32);
                    return true;
                }
                throw InvalidProtocolBufferException.invalidWireType();
            } else {
                return false;
            }
        }
    }

    /* renamed from: a */
    public static CodedInputStream m56091a(Iterable iterable, boolean z) {
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
            return new C4345c(iterable, i, z);
        }
        return newInstance(new C22999xg0(iterable));
    }

    /* renamed from: b */
    public static CodedInputStream m56090b(ByteBuffer byteBuffer, boolean z) {
        if (byteBuffer.hasArray()) {
            return m56089c(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining(), z);
        }
        if (byteBuffer.isDirect() && C4347e.m56061e()) {
            return new C4347e(byteBuffer, z);
        }
        int remaining = byteBuffer.remaining();
        byte[] bArr = new byte[remaining];
        byteBuffer.duplicate().get(bArr);
        return m56089c(bArr, 0, remaining, true);
    }

    /* renamed from: c */
    public static CodedInputStream m56089c(byte[] bArr, int i, int i2, boolean z) {
        C4344b c4344b = new C4344b(bArr, i, i2, z);
        try {
            c4344b.pushLimit(i2);
            return c4344b;
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
            int i2 = this.f34677b;
            this.f34677b = i;
            return i2;
        }
        throw new IllegalArgumentException("Recursion limit cannot be negative: " + i);
    }

    public final int setSizeLimit(int i) {
        if (i >= 0) {
            int i2 = this.f34678c;
            this.f34678c = i;
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
        this.f34677b = 100;
        this.f34678c = Integer.MAX_VALUE;
        this.f34680e = false;
    }

    public static CodedInputStream newInstance(InputStream inputStream, int i) {
        if (i > 0) {
            if (inputStream == null) {
                return newInstance(Internal.EMPTY_BYTE_ARRAY);
            }
            return new C4346d(inputStream, i);
        }
        throw new IllegalArgumentException("bufferSize must be > 0");
    }

    public static CodedInputStream newInstance(Iterable<ByteBuffer> iterable) {
        if (!C4347e.m56061e()) {
            return newInstance(new C22999xg0(iterable));
        }
        return m56091a(iterable, false);
    }

    public static CodedInputStream newInstance(byte[] bArr) {
        return newInstance(bArr, 0, bArr.length);
    }

    public static CodedInputStream newInstance(byte[] bArr, int i, int i2) {
        return m56089c(bArr, i, i2, false);
    }

    public static CodedInputStream newInstance(ByteBuffer byteBuffer) {
        return m56090b(byteBuffer, false);
    }
}
