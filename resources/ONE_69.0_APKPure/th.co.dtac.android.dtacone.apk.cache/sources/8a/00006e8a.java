package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.InvalidProtocolBufferException;
import androidx.datastore.preferences.protobuf.MapEntryLite;
import androidx.datastore.preferences.protobuf.WireFormat;
import com.google.common.base.Ascii;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Map;

/* renamed from: androidx.datastore.preferences.protobuf.c */
/* loaded from: classes2.dex */
public abstract class AbstractC4408c implements InterfaceC4435u {

    /* renamed from: androidx.datastore.preferences.protobuf.c$a */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class C4409a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f35003a;

        static {
            int[] iArr = new int[WireFormat.FieldType.values().length];
            f35003a = iArr;
            try {
                iArr[WireFormat.FieldType.BOOL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f35003a[WireFormat.FieldType.BYTES.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f35003a[WireFormat.FieldType.DOUBLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f35003a[WireFormat.FieldType.ENUM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f35003a[WireFormat.FieldType.FIXED32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f35003a[WireFormat.FieldType.FIXED64.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f35003a[WireFormat.FieldType.FLOAT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f35003a[WireFormat.FieldType.INT32.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f35003a[WireFormat.FieldType.INT64.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f35003a[WireFormat.FieldType.MESSAGE.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f35003a[WireFormat.FieldType.SFIXED32.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f35003a[WireFormat.FieldType.SFIXED64.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f35003a[WireFormat.FieldType.SINT32.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f35003a[WireFormat.FieldType.SINT64.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f35003a[WireFormat.FieldType.STRING.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f35003a[WireFormat.FieldType.UINT32.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f35003a[WireFormat.FieldType.UINT64.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.c$b */
    /* loaded from: classes2.dex */
    public static final class C4410b extends AbstractC4408c {

        /* renamed from: a */
        public final boolean f35004a;

        /* renamed from: b */
        public final byte[] f35005b;

        /* renamed from: c */
        public int f35006c;

        /* renamed from: d */
        public final int f35007d;

        /* renamed from: e */
        public int f35008e;

        /* renamed from: f */
        public int f35009f;

        /* renamed from: g */
        public int f35010g;

        public C4410b(ByteBuffer byteBuffer, boolean z) {
            super(null);
            this.f35004a = z;
            this.f35005b = byteBuffer.array();
            int arrayOffset = byteBuffer.arrayOffset() + byteBuffer.position();
            this.f35006c = arrayOffset;
            this.f35007d = arrayOffset;
            this.f35008e = byteBuffer.arrayOffset() + byteBuffer.limit();
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC4435u
        /* renamed from: A */
        public void mo55010A(List list) {
            int i;
            int i2;
            if (list instanceof C4421k) {
                C4421k c4421k = (C4421k) list;
                int tagWireType = WireFormat.getTagWireType(this.f35009f);
                if (tagWireType != 0) {
                    if (tagWireType == 2) {
                        int m55234Y = this.f35006c + m55234Y();
                        while (this.f35006c < m55234Y) {
                            c4421k.addInt(m55234Y());
                        }
                        return;
                    }
                    throw InvalidProtocolBufferException.invalidWireType();
                }
                do {
                    c4421k.addInt(mo54996c());
                    if (m55245N()) {
                        return;
                    }
                    i2 = this.f35006c;
                } while (m55234Y() == this.f35009f);
                this.f35006c = i2;
                return;
            }
            int tagWireType2 = WireFormat.getTagWireType(this.f35009f);
            if (tagWireType2 != 0) {
                if (tagWireType2 == 2) {
                    int m55234Y2 = this.f35006c + m55234Y();
                    while (this.f35006c < m55234Y2) {
                        list.add(Integer.valueOf(m55234Y()));
                    }
                    return;
                }
                throw InvalidProtocolBufferException.invalidWireType();
            }
            do {
                list.add(Integer.valueOf(mo54996c()));
                if (m55245N()) {
                    return;
                }
                i = this.f35006c;
            } while (m55234Y() == this.f35009f);
            this.f35006c = i;
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC4435u
        /* renamed from: B */
        public int mo55009B() {
            m55229d0(5);
            return m55241R();
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC4435u
        /* renamed from: C */
        public long mo55008C() {
            m55229d0(0);
            return CodedInputStream.decodeZigZag64(m55233Z());
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC4435u
        /* renamed from: D */
        public int mo55007D() {
            m55229d0(5);
            return m55241R();
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC4435u
        /* renamed from: E */
        public String mo55006E() {
            return m55236W(true);
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC4435u
        /* renamed from: F */
        public Object mo55005F(InterfaceC4436v interfaceC4436v, ExtensionRegistryLite extensionRegistryLite) {
            m55229d0(3);
            return m55242Q(interfaceC4436v, extensionRegistryLite);
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC4435u
        /* renamed from: G */
        public Object mo55004G(Class cls, ExtensionRegistryLite extensionRegistryLite) {
            m55229d0(2);
            return m55237V(C17783Hp1.m68094a().m68091d(cls), extensionRegistryLite);
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC4435u
        /* renamed from: H */
        public Object mo55003H(InterfaceC4436v interfaceC4436v, ExtensionRegistryLite extensionRegistryLite) {
            m55229d0(2);
            return m55237V(interfaceC4436v, extensionRegistryLite);
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC4435u
        /* renamed from: I */
        public void mo55002I(List list, InterfaceC4436v interfaceC4436v, ExtensionRegistryLite extensionRegistryLite) {
            int i;
            if (WireFormat.getTagWireType(this.f35009f) == 2) {
                int i2 = this.f35009f;
                do {
                    list.add(m55237V(interfaceC4436v, extensionRegistryLite));
                    if (m55245N()) {
                        return;
                    }
                    i = this.f35006c;
                } while (m55234Y() == i2);
                this.f35006c = i;
                return;
            }
            throw InvalidProtocolBufferException.invalidWireType();
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC4435u
        /* renamed from: J */
        public Object mo55001J(Class cls, ExtensionRegistryLite extensionRegistryLite) {
            m55229d0(3);
            return m55242Q(C17783Hp1.m68094a().m68091d(cls), extensionRegistryLite);
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC4435u
        /* renamed from: K */
        public void mo55000K(Map map, MapEntryLite.C4368b c4368b, ExtensionRegistryLite extensionRegistryLite) {
            m55229d0(2);
            int m55234Y = m55234Y();
            m55231b0(m55234Y);
            int i = this.f35008e;
            this.f35008e = this.f35006c + m55234Y;
            try {
                Object obj = c4368b.f34936b;
                Object obj2 = c4368b.f34938d;
                while (true) {
                    int mo54986m = mo54986m();
                    if (mo54986m == Integer.MAX_VALUE) {
                        map.put(obj, obj2);
                        return;
                    } else if (mo54986m != 1) {
                        if (mo54986m != 2) {
                            try {
                                if (!mo54983p()) {
                                    throw new InvalidProtocolBufferException("Unable to parse map entry.");
                                    break;
                                }
                            } catch (InvalidProtocolBufferException.InvalidWireTypeException unused) {
                                if (!mo54983p()) {
                                    throw new InvalidProtocolBufferException("Unable to parse map entry.");
                                }
                            }
                        } else {
                            obj2 = m55243P(c4368b.f34937c, c4368b.f34938d.getClass(), extensionRegistryLite);
                        }
                    } else {
                        obj = m55243P(c4368b.f34935a, null, null);
                    }
                }
            } finally {
                this.f35008e = i;
            }
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC4435u
        /* renamed from: L */
        public void mo54999L(List list, InterfaceC4436v interfaceC4436v, ExtensionRegistryLite extensionRegistryLite) {
            int i;
            if (WireFormat.getTagWireType(this.f35009f) == 3) {
                int i2 = this.f35009f;
                do {
                    list.add(m55242Q(interfaceC4436v, extensionRegistryLite));
                    if (m55245N()) {
                        return;
                    }
                    i = this.f35006c;
                } while (m55234Y() == i2);
                this.f35006c = i;
                return;
            }
            throw InvalidProtocolBufferException.invalidWireType();
        }

        /* renamed from: N */
        public final boolean m55245N() {
            if (this.f35006c == this.f35008e) {
                return true;
            }
            return false;
        }

        /* renamed from: O */
        public final byte m55244O() {
            int i = this.f35006c;
            if (i != this.f35008e) {
                byte[] bArr = this.f35005b;
                this.f35006c = i + 1;
                return bArr[i];
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }

        /* renamed from: P */
        public final Object m55243P(WireFormat.FieldType fieldType, Class cls, ExtensionRegistryLite extensionRegistryLite) {
            switch (C4409a.f35003a[fieldType.ordinal()]) {
                case 1:
                    return Boolean.valueOf(mo54978u());
                case 2:
                    return mo54992g();
                case 3:
                    return Double.valueOf(readDouble());
                case 4:
                    return Integer.valueOf(mo54995d());
                case 5:
                    return Integer.valueOf(mo55009B());
                case 6:
                    return Long.valueOf(mo54980s());
                case 7:
                    return Float.valueOf(readFloat());
                case 8:
                    return Integer.valueOf(readInt32());
                case 9:
                    return Long.valueOf(readInt64());
                case 10:
                    return mo55004G(cls, extensionRegistryLite);
                case 11:
                    return Integer.valueOf(mo55007D());
                case 12:
                    return Long.valueOf(mo54997b());
                case 13:
                    return Integer.valueOf(mo54994e());
                case 14:
                    return Long.valueOf(mo55008C());
                case 15:
                    return mo55006E();
                case 16:
                    return Integer.valueOf(mo54996c());
                case 17:
                    return Long.valueOf(mo54990i());
                default:
                    throw new RuntimeException("unsupported field type.");
            }
        }

        /* renamed from: Q */
        public final Object m55242Q(InterfaceC4436v interfaceC4436v, ExtensionRegistryLite extensionRegistryLite) {
            int i = this.f35010g;
            this.f35010g = WireFormat.m55288a(WireFormat.getTagFieldNumber(this.f35009f), 4);
            try {
                Object newInstance = interfaceC4436v.newInstance();
                interfaceC4436v.mo54965h(newInstance, this, extensionRegistryLite);
                interfaceC4436v.mo54968e(newInstance);
                if (this.f35009f == this.f35010g) {
                    return newInstance;
                }
                throw InvalidProtocolBufferException.parseFailure();
            } finally {
                this.f35010g = i;
            }
        }

        /* renamed from: R */
        public final int m55241R() {
            m55231b0(4);
            return m55240S();
        }

        /* renamed from: S */
        public final int m55240S() {
            int i = this.f35006c;
            byte[] bArr = this.f35005b;
            this.f35006c = i + 4;
            return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
        }

        /* renamed from: T */
        public final long m55239T() {
            m55231b0(8);
            return m55238U();
        }

        /* renamed from: U */
        public final long m55238U() {
            int i = this.f35006c;
            byte[] bArr = this.f35005b;
            this.f35006c = i + 8;
            return ((bArr[i + 7] & 255) << 56) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48);
        }

        /* renamed from: V */
        public final Object m55237V(InterfaceC4436v interfaceC4436v, ExtensionRegistryLite extensionRegistryLite) {
            int m55234Y = m55234Y();
            m55231b0(m55234Y);
            int i = this.f35008e;
            int i2 = this.f35006c + m55234Y;
            this.f35008e = i2;
            try {
                Object newInstance = interfaceC4436v.newInstance();
                interfaceC4436v.mo54965h(newInstance, this, extensionRegistryLite);
                interfaceC4436v.mo54968e(newInstance);
                if (this.f35006c == i2) {
                    return newInstance;
                }
                throw InvalidProtocolBufferException.parseFailure();
            } finally {
                this.f35008e = i;
            }
        }

        /* renamed from: W */
        public String m55236W(boolean z) {
            m55229d0(2);
            int m55234Y = m55234Y();
            if (m55234Y == 0) {
                return "";
            }
            m55231b0(m55234Y);
            if (z) {
                byte[] bArr = this.f35005b;
                int i = this.f35006c;
                if (!Utf8.m55372u(bArr, i, i + m55234Y)) {
                    throw InvalidProtocolBufferException.invalidUtf8();
                }
            }
            String str = new String(this.f35005b, this.f35006c, m55234Y, Internal.f34905a);
            this.f35006c += m55234Y;
            return str;
        }

        /* renamed from: X */
        public void m55235X(List list, boolean z) {
            int i;
            int i2;
            if (WireFormat.getTagWireType(this.f35009f) == 2) {
                if ((list instanceof LazyStringList) && !z) {
                    LazyStringList lazyStringList = (LazyStringList) list;
                    do {
                        lazyStringList.add(mo54992g());
                        if (m55245N()) {
                            return;
                        }
                        i2 = this.f35006c;
                    } while (m55234Y() == this.f35009f);
                    this.f35006c = i2;
                    return;
                }
                do {
                    list.add(m55236W(z));
                    if (m55245N()) {
                        return;
                    }
                    i = this.f35006c;
                } while (m55234Y() == this.f35009f);
                this.f35006c = i;
                return;
            }
            throw InvalidProtocolBufferException.invalidWireType();
        }

        /* renamed from: Y */
        public final int m55234Y() {
            int i;
            int i2 = this.f35006c;
            int i3 = this.f35008e;
            if (i3 != i2) {
                byte[] bArr = this.f35005b;
                int i4 = i2 + 1;
                byte b = bArr[i2];
                if (b >= 0) {
                    this.f35006c = i4;
                    return b;
                } else if (i3 - i4 < 9) {
                    return (int) m55232a0();
                } else {
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
                                int i11 = (i10 ^ (b2 << Ascii.f52698FS)) ^ 266354560;
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
                                                    } else {
                                                        throw InvalidProtocolBufferException.malformedVarint();
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
                    this.f35006c = i5;
                    return i;
                }
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }

        /* renamed from: Z */
        public long m55233Z() {
            long j;
            long j2;
            long j3;
            int i = this.f35006c;
            int i2 = this.f35008e;
            if (i2 != i) {
                byte[] bArr = this.f35005b;
                int i3 = i + 1;
                byte b = bArr[i];
                if (b >= 0) {
                    this.f35006c = i3;
                    return b;
                } else if (i2 - i3 < 9) {
                    return m55232a0();
                } else {
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
                                                    } else {
                                                        throw InvalidProtocolBufferException.malformedVarint();
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
                    this.f35006c = i4;
                    return j;
                }
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC4435u
        /* renamed from: a */
        public void mo54998a(List list) {
            int i;
            int i2;
            if (list instanceof C4426m) {
                C4426m c4426m = (C4426m) list;
                int tagWireType = WireFormat.getTagWireType(this.f35009f);
                if (tagWireType != 0) {
                    if (tagWireType == 2) {
                        int m55234Y = this.f35006c + m55234Y();
                        while (this.f35006c < m55234Y) {
                            c4426m.addLong(CodedInputStream.decodeZigZag64(m55233Z()));
                        }
                        return;
                    }
                    throw InvalidProtocolBufferException.invalidWireType();
                }
                do {
                    c4426m.addLong(mo55008C());
                    if (m55245N()) {
                        return;
                    }
                    i2 = this.f35006c;
                } while (m55234Y() == this.f35009f);
                this.f35006c = i2;
                return;
            }
            int tagWireType2 = WireFormat.getTagWireType(this.f35009f);
            if (tagWireType2 != 0) {
                if (tagWireType2 == 2) {
                    int m55234Y2 = this.f35006c + m55234Y();
                    while (this.f35006c < m55234Y2) {
                        list.add(Long.valueOf(CodedInputStream.decodeZigZag64(m55233Z())));
                    }
                    return;
                }
                throw InvalidProtocolBufferException.invalidWireType();
            }
            do {
                list.add(Long.valueOf(mo55008C()));
                if (m55245N()) {
                    return;
                }
                i = this.f35006c;
            } while (m55234Y() == this.f35009f);
            this.f35006c = i;
        }

        /* renamed from: a0 */
        public final long m55232a0() {
            long j = 0;
            for (int i = 0; i < 64; i += 7) {
                byte m55244O = m55244O();
                j |= (m55244O & Byte.MAX_VALUE) << i;
                if ((m55244O & 128) == 0) {
                    return j;
                }
            }
            throw InvalidProtocolBufferException.malformedVarint();
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC4435u
        /* renamed from: b */
        public long mo54997b() {
            m55229d0(1);
            return m55239T();
        }

        /* renamed from: b0 */
        public final void m55231b0(int i) {
            if (i >= 0 && i <= this.f35008e - this.f35006c) {
                return;
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC4435u
        /* renamed from: c */
        public int mo54996c() {
            m55229d0(0);
            return m55234Y();
        }

        /* renamed from: c0 */
        public final void m55230c0(int i) {
            if (this.f35006c == i) {
                return;
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC4435u
        /* renamed from: d */
        public int mo54995d() {
            m55229d0(0);
            return m55234Y();
        }

        /* renamed from: d0 */
        public final void m55229d0(int i) {
            if (WireFormat.getTagWireType(this.f35009f) == i) {
                return;
            }
            throw InvalidProtocolBufferException.invalidWireType();
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC4435u
        /* renamed from: e */
        public int mo54994e() {
            m55229d0(0);
            return CodedInputStream.decodeZigZag32(m55234Y());
        }

        /* renamed from: e0 */
        public final void m55228e0(int i) {
            m55231b0(i);
            this.f35006c += i;
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC4435u
        /* renamed from: f */
        public void mo54993f(List list) {
            int i;
            boolean z;
            int i2;
            boolean z2;
            if (list instanceof C4411d) {
                C4411d c4411d = (C4411d) list;
                int tagWireType = WireFormat.getTagWireType(this.f35009f);
                if (tagWireType != 0) {
                    if (tagWireType == 2) {
                        int m55234Y = this.f35006c + m55234Y();
                        while (this.f35006c < m55234Y) {
                            if (m55234Y() != 0) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            c4411d.addBoolean(z2);
                        }
                        m55230c0(m55234Y);
                        return;
                    }
                    throw InvalidProtocolBufferException.invalidWireType();
                }
                do {
                    c4411d.addBoolean(mo54978u());
                    if (m55245N()) {
                        return;
                    }
                    i2 = this.f35006c;
                } while (m55234Y() == this.f35009f);
                this.f35006c = i2;
                return;
            }
            int tagWireType2 = WireFormat.getTagWireType(this.f35009f);
            if (tagWireType2 != 0) {
                if (tagWireType2 == 2) {
                    int m55234Y2 = this.f35006c + m55234Y();
                    while (this.f35006c < m55234Y2) {
                        if (m55234Y() != 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        list.add(Boolean.valueOf(z));
                    }
                    m55230c0(m55234Y2);
                    return;
                }
                throw InvalidProtocolBufferException.invalidWireType();
            }
            do {
                list.add(Boolean.valueOf(mo54978u()));
                if (m55245N()) {
                    return;
                }
                i = this.f35006c;
            } while (m55234Y() == this.f35009f);
            this.f35006c = i;
        }

        /* renamed from: f0 */
        public final void m55227f0() {
            int i = this.f35010g;
            this.f35010g = WireFormat.m55288a(WireFormat.getTagFieldNumber(this.f35009f), 4);
            while (mo54986m() != Integer.MAX_VALUE && mo54983p()) {
            }
            if (this.f35009f == this.f35010g) {
                this.f35010g = i;
                return;
            }
            throw InvalidProtocolBufferException.parseFailure();
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC4435u
        /* renamed from: g */
        public ByteString mo54992g() {
            ByteString copyFrom;
            m55229d0(2);
            int m55234Y = m55234Y();
            if (m55234Y == 0) {
                return ByteString.EMPTY;
            }
            m55231b0(m55234Y);
            if (this.f35004a) {
                copyFrom = ByteString.wrap(this.f35005b, this.f35006c, m55234Y);
            } else {
                copyFrom = ByteString.copyFrom(this.f35005b, this.f35006c, m55234Y);
            }
            this.f35006c += m55234Y;
            return copyFrom;
        }

        /* renamed from: g0 */
        public final void m55226g0() {
            int i = this.f35008e;
            int i2 = this.f35006c;
            if (i - i2 >= 10) {
                byte[] bArr = this.f35005b;
                int i3 = 0;
                while (i3 < 10) {
                    int i4 = i2 + 1;
                    if (bArr[i2] >= 0) {
                        this.f35006c = i4;
                        return;
                    } else {
                        i3++;
                        i2 = i4;
                    }
                }
            }
            m55225h0();
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC4435u
        public int getTag() {
            return this.f35009f;
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC4435u
        /* renamed from: h */
        public void mo54991h(List list) {
            int i;
            int i2;
            if (list instanceof C4421k) {
                C4421k c4421k = (C4421k) list;
                int tagWireType = WireFormat.getTagWireType(this.f35009f);
                if (tagWireType != 0) {
                    if (tagWireType == 2) {
                        int m55234Y = this.f35006c + m55234Y();
                        while (this.f35006c < m55234Y) {
                            c4421k.addInt(CodedInputStream.decodeZigZag32(m55234Y()));
                        }
                        return;
                    }
                    throw InvalidProtocolBufferException.invalidWireType();
                }
                do {
                    c4421k.addInt(mo54994e());
                    if (m55245N()) {
                        return;
                    }
                    i2 = this.f35006c;
                } while (m55234Y() == this.f35009f);
                this.f35006c = i2;
                return;
            }
            int tagWireType2 = WireFormat.getTagWireType(this.f35009f);
            if (tagWireType2 != 0) {
                if (tagWireType2 == 2) {
                    int m55234Y2 = this.f35006c + m55234Y();
                    while (this.f35006c < m55234Y2) {
                        list.add(Integer.valueOf(CodedInputStream.decodeZigZag32(m55234Y())));
                    }
                    return;
                }
                throw InvalidProtocolBufferException.invalidWireType();
            }
            do {
                list.add(Integer.valueOf(mo54994e()));
                if (m55245N()) {
                    return;
                }
                i = this.f35006c;
            } while (m55234Y() == this.f35009f);
            this.f35006c = i;
        }

        /* renamed from: h0 */
        public final void m55225h0() {
            for (int i = 0; i < 10; i++) {
                if (m55244O() >= 0) {
                    return;
                }
            }
            throw InvalidProtocolBufferException.malformedVarint();
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC4435u
        /* renamed from: i */
        public long mo54990i() {
            m55229d0(0);
            return m55233Z();
        }

        /* renamed from: i0 */
        public final void m55224i0(int i) {
            m55231b0(i);
            if ((i & 3) == 0) {
                return;
            }
            throw InvalidProtocolBufferException.parseFailure();
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC4435u
        /* renamed from: j */
        public void mo54989j(List list) {
            int i;
            int i2;
            if (list instanceof C4426m) {
                C4426m c4426m = (C4426m) list;
                int tagWireType = WireFormat.getTagWireType(this.f35009f);
                if (tagWireType != 1) {
                    if (tagWireType == 2) {
                        int m55234Y = m55234Y();
                        m55223j0(m55234Y);
                        int i3 = this.f35006c + m55234Y;
                        while (this.f35006c < i3) {
                            c4426m.addLong(m55238U());
                        }
                        return;
                    }
                    throw InvalidProtocolBufferException.invalidWireType();
                }
                do {
                    c4426m.addLong(mo54997b());
                    if (m55245N()) {
                        return;
                    }
                    i2 = this.f35006c;
                } while (m55234Y() == this.f35009f);
                this.f35006c = i2;
                return;
            }
            int tagWireType2 = WireFormat.getTagWireType(this.f35009f);
            if (tagWireType2 != 1) {
                if (tagWireType2 == 2) {
                    int m55234Y2 = m55234Y();
                    m55223j0(m55234Y2);
                    int i4 = this.f35006c + m55234Y2;
                    while (this.f35006c < i4) {
                        list.add(Long.valueOf(m55238U()));
                    }
                    return;
                }
                throw InvalidProtocolBufferException.invalidWireType();
            }
            do {
                list.add(Long.valueOf(mo54997b()));
                if (m55245N()) {
                    return;
                }
                i = this.f35006c;
            } while (m55234Y() == this.f35009f);
            this.f35006c = i;
        }

        /* renamed from: j0 */
        public final void m55223j0(int i) {
            m55231b0(i);
            if ((i & 7) == 0) {
                return;
            }
            throw InvalidProtocolBufferException.parseFailure();
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC4435u
        /* renamed from: k */
        public void mo54988k(List list) {
            int i;
            int i2;
            if (list instanceof C4421k) {
                C4421k c4421k = (C4421k) list;
                int tagWireType = WireFormat.getTagWireType(this.f35009f);
                if (tagWireType != 0) {
                    if (tagWireType == 2) {
                        int m55234Y = this.f35006c + m55234Y();
                        while (this.f35006c < m55234Y) {
                            c4421k.addInt(m55234Y());
                        }
                        m55230c0(m55234Y);
                        return;
                    }
                    throw InvalidProtocolBufferException.invalidWireType();
                }
                do {
                    c4421k.addInt(readInt32());
                    if (m55245N()) {
                        return;
                    }
                    i2 = this.f35006c;
                } while (m55234Y() == this.f35009f);
                this.f35006c = i2;
                return;
            }
            int tagWireType2 = WireFormat.getTagWireType(this.f35009f);
            if (tagWireType2 != 0) {
                if (tagWireType2 == 2) {
                    int m55234Y2 = this.f35006c + m55234Y();
                    while (this.f35006c < m55234Y2) {
                        list.add(Integer.valueOf(m55234Y()));
                    }
                    m55230c0(m55234Y2);
                    return;
                }
                throw InvalidProtocolBufferException.invalidWireType();
            }
            do {
                list.add(Integer.valueOf(readInt32()));
                if (m55245N()) {
                    return;
                }
                i = this.f35006c;
            } while (m55234Y() == this.f35009f);
            this.f35006c = i;
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC4435u
        /* renamed from: l */
        public void mo54987l(List list) {
            int i;
            int i2;
            if (list instanceof C4421k) {
                C4421k c4421k = (C4421k) list;
                int tagWireType = WireFormat.getTagWireType(this.f35009f);
                if (tagWireType != 2) {
                    if (tagWireType == 5) {
                        do {
                            c4421k.addInt(mo55009B());
                            if (m55245N()) {
                                return;
                            }
                            i2 = this.f35006c;
                        } while (m55234Y() == this.f35009f);
                        this.f35006c = i2;
                        return;
                    }
                    throw InvalidProtocolBufferException.invalidWireType();
                }
                int m55234Y = m55234Y();
                m55224i0(m55234Y);
                int i3 = this.f35006c + m55234Y;
                while (this.f35006c < i3) {
                    c4421k.addInt(m55240S());
                }
                return;
            }
            int tagWireType2 = WireFormat.getTagWireType(this.f35009f);
            if (tagWireType2 != 2) {
                if (tagWireType2 == 5) {
                    do {
                        list.add(Integer.valueOf(mo55009B()));
                        if (m55245N()) {
                            return;
                        }
                        i = this.f35006c;
                    } while (m55234Y() == this.f35009f);
                    this.f35006c = i;
                    return;
                }
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int m55234Y2 = m55234Y();
            m55224i0(m55234Y2);
            int i4 = this.f35006c + m55234Y2;
            while (this.f35006c < i4) {
                list.add(Integer.valueOf(m55240S()));
            }
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC4435u
        /* renamed from: m */
        public int mo54986m() {
            if (m55245N()) {
                return Integer.MAX_VALUE;
            }
            int m55234Y = m55234Y();
            this.f35009f = m55234Y;
            if (m55234Y == this.f35010g) {
                return Integer.MAX_VALUE;
            }
            return WireFormat.getTagFieldNumber(m55234Y);
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC4435u
        /* renamed from: n */
        public void mo54985n(List list) {
            m55235X(list, false);
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC4435u
        /* renamed from: o */
        public void mo54984o(List list) {
            int i;
            int i2;
            if (list instanceof C4420j) {
                C4420j c4420j = (C4420j) list;
                int tagWireType = WireFormat.getTagWireType(this.f35009f);
                if (tagWireType != 2) {
                    if (tagWireType == 5) {
                        do {
                            c4420j.addFloat(readFloat());
                            if (m55245N()) {
                                return;
                            }
                            i2 = this.f35006c;
                        } while (m55234Y() == this.f35009f);
                        this.f35006c = i2;
                        return;
                    }
                    throw InvalidProtocolBufferException.invalidWireType();
                }
                int m55234Y = m55234Y();
                m55224i0(m55234Y);
                int i3 = this.f35006c + m55234Y;
                while (this.f35006c < i3) {
                    c4420j.addFloat(Float.intBitsToFloat(m55240S()));
                }
                return;
            }
            int tagWireType2 = WireFormat.getTagWireType(this.f35009f);
            if (tagWireType2 != 2) {
                if (tagWireType2 == 5) {
                    do {
                        list.add(Float.valueOf(readFloat()));
                        if (m55245N()) {
                            return;
                        }
                        i = this.f35006c;
                    } while (m55234Y() == this.f35009f);
                    this.f35006c = i;
                    return;
                }
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int m55234Y2 = m55234Y();
            m55224i0(m55234Y2);
            int i4 = this.f35006c + m55234Y2;
            while (this.f35006c < i4) {
                list.add(Float.valueOf(Float.intBitsToFloat(m55240S())));
            }
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC4435u
        /* renamed from: p */
        public boolean mo54983p() {
            int i;
            if (!m55245N() && (i = this.f35009f) != this.f35010g) {
                int tagWireType = WireFormat.getTagWireType(i);
                if (tagWireType != 0) {
                    if (tagWireType != 1) {
                        if (tagWireType != 2) {
                            if (tagWireType != 3) {
                                if (tagWireType == 5) {
                                    m55228e0(4);
                                    return true;
                                }
                                throw InvalidProtocolBufferException.invalidWireType();
                            }
                            m55227f0();
                            return true;
                        }
                        m55228e0(m55234Y());
                        return true;
                    }
                    m55228e0(8);
                    return true;
                }
                m55226g0();
                return true;
            }
            return false;
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC4435u
        /* renamed from: q */
        public void mo54982q(List list) {
            int i;
            if (WireFormat.getTagWireType(this.f35009f) == 2) {
                do {
                    list.add(mo54992g());
                    if (m55245N()) {
                        return;
                    }
                    i = this.f35006c;
                } while (m55234Y() == this.f35009f);
                this.f35006c = i;
                return;
            }
            throw InvalidProtocolBufferException.invalidWireType();
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC4435u
        /* renamed from: r */
        public void mo54981r(List list) {
            int i;
            int i2;
            if (list instanceof C4416g) {
                C4416g c4416g = (C4416g) list;
                int tagWireType = WireFormat.getTagWireType(this.f35009f);
                if (tagWireType != 1) {
                    if (tagWireType == 2) {
                        int m55234Y = m55234Y();
                        m55223j0(m55234Y);
                        int i3 = this.f35006c + m55234Y;
                        while (this.f35006c < i3) {
                            c4416g.addDouble(Double.longBitsToDouble(m55238U()));
                        }
                        return;
                    }
                    throw InvalidProtocolBufferException.invalidWireType();
                }
                do {
                    c4416g.addDouble(readDouble());
                    if (m55245N()) {
                        return;
                    }
                    i2 = this.f35006c;
                } while (m55234Y() == this.f35009f);
                this.f35006c = i2;
                return;
            }
            int tagWireType2 = WireFormat.getTagWireType(this.f35009f);
            if (tagWireType2 != 1) {
                if (tagWireType2 == 2) {
                    int m55234Y2 = m55234Y();
                    m55223j0(m55234Y2);
                    int i4 = this.f35006c + m55234Y2;
                    while (this.f35006c < i4) {
                        list.add(Double.valueOf(Double.longBitsToDouble(m55238U())));
                    }
                    return;
                }
                throw InvalidProtocolBufferException.invalidWireType();
            }
            do {
                list.add(Double.valueOf(readDouble()));
                if (m55245N()) {
                    return;
                }
                i = this.f35006c;
            } while (m55234Y() == this.f35009f);
            this.f35006c = i;
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC4435u
        public double readDouble() {
            m55229d0(1);
            return Double.longBitsToDouble(m55239T());
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC4435u
        public float readFloat() {
            m55229d0(5);
            return Float.intBitsToFloat(m55241R());
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC4435u
        public int readInt32() {
            m55229d0(0);
            return m55234Y();
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC4435u
        public long readInt64() {
            m55229d0(0);
            return m55233Z();
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC4435u
        public String readString() {
            return m55236W(false);
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC4435u
        /* renamed from: s */
        public long mo54980s() {
            m55229d0(1);
            return m55239T();
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC4435u
        /* renamed from: t */
        public void mo54979t(List list) {
            int i;
            int i2;
            if (list instanceof C4421k) {
                C4421k c4421k = (C4421k) list;
                int tagWireType = WireFormat.getTagWireType(this.f35009f);
                if (tagWireType != 2) {
                    if (tagWireType == 5) {
                        do {
                            c4421k.addInt(mo55007D());
                            if (m55245N()) {
                                return;
                            }
                            i2 = this.f35006c;
                        } while (m55234Y() == this.f35009f);
                        this.f35006c = i2;
                        return;
                    }
                    throw InvalidProtocolBufferException.invalidWireType();
                }
                int m55234Y = m55234Y();
                m55224i0(m55234Y);
                int i3 = this.f35006c + m55234Y;
                while (this.f35006c < i3) {
                    c4421k.addInt(m55240S());
                }
                return;
            }
            int tagWireType2 = WireFormat.getTagWireType(this.f35009f);
            if (tagWireType2 != 2) {
                if (tagWireType2 == 5) {
                    do {
                        list.add(Integer.valueOf(mo55007D()));
                        if (m55245N()) {
                            return;
                        }
                        i = this.f35006c;
                    } while (m55234Y() == this.f35009f);
                    this.f35006c = i;
                    return;
                }
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int m55234Y2 = m55234Y();
            m55224i0(m55234Y2);
            int i4 = this.f35006c + m55234Y2;
            while (this.f35006c < i4) {
                list.add(Integer.valueOf(m55240S()));
            }
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC4435u
        /* renamed from: u */
        public boolean mo54978u() {
            m55229d0(0);
            if (m55234Y() == 0) {
                return false;
            }
            return true;
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC4435u
        /* renamed from: v */
        public void mo54977v(List list) {
            int i;
            int i2;
            if (list instanceof C4426m) {
                C4426m c4426m = (C4426m) list;
                int tagWireType = WireFormat.getTagWireType(this.f35009f);
                if (tagWireType != 0) {
                    if (tagWireType == 2) {
                        int m55234Y = this.f35006c + m55234Y();
                        while (this.f35006c < m55234Y) {
                            c4426m.addLong(m55233Z());
                        }
                        m55230c0(m55234Y);
                        return;
                    }
                    throw InvalidProtocolBufferException.invalidWireType();
                }
                do {
                    c4426m.addLong(mo54990i());
                    if (m55245N()) {
                        return;
                    }
                    i2 = this.f35006c;
                } while (m55234Y() == this.f35009f);
                this.f35006c = i2;
                return;
            }
            int tagWireType2 = WireFormat.getTagWireType(this.f35009f);
            if (tagWireType2 != 0) {
                if (tagWireType2 == 2) {
                    int m55234Y2 = this.f35006c + m55234Y();
                    while (this.f35006c < m55234Y2) {
                        list.add(Long.valueOf(m55233Z()));
                    }
                    m55230c0(m55234Y2);
                    return;
                }
                throw InvalidProtocolBufferException.invalidWireType();
            }
            do {
                list.add(Long.valueOf(mo54990i()));
                if (m55245N()) {
                    return;
                }
                i = this.f35006c;
            } while (m55234Y() == this.f35009f);
            this.f35006c = i;
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC4435u
        /* renamed from: w */
        public void mo54976w(List list) {
            int i;
            int i2;
            if (list instanceof C4426m) {
                C4426m c4426m = (C4426m) list;
                int tagWireType = WireFormat.getTagWireType(this.f35009f);
                if (tagWireType != 0) {
                    if (tagWireType == 2) {
                        int m55234Y = this.f35006c + m55234Y();
                        while (this.f35006c < m55234Y) {
                            c4426m.addLong(m55233Z());
                        }
                        m55230c0(m55234Y);
                        return;
                    }
                    throw InvalidProtocolBufferException.invalidWireType();
                }
                do {
                    c4426m.addLong(readInt64());
                    if (m55245N()) {
                        return;
                    }
                    i2 = this.f35006c;
                } while (m55234Y() == this.f35009f);
                this.f35006c = i2;
                return;
            }
            int tagWireType2 = WireFormat.getTagWireType(this.f35009f);
            if (tagWireType2 != 0) {
                if (tagWireType2 == 2) {
                    int m55234Y2 = this.f35006c + m55234Y();
                    while (this.f35006c < m55234Y2) {
                        list.add(Long.valueOf(m55233Z()));
                    }
                    m55230c0(m55234Y2);
                    return;
                }
                throw InvalidProtocolBufferException.invalidWireType();
            }
            do {
                list.add(Long.valueOf(readInt64()));
                if (m55245N()) {
                    return;
                }
                i = this.f35006c;
            } while (m55234Y() == this.f35009f);
            this.f35006c = i;
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC4435u
        /* renamed from: x */
        public void mo54975x(List list) {
            int i;
            int i2;
            if (list instanceof C4421k) {
                C4421k c4421k = (C4421k) list;
                int tagWireType = WireFormat.getTagWireType(this.f35009f);
                if (tagWireType != 0) {
                    if (tagWireType == 2) {
                        int m55234Y = this.f35006c + m55234Y();
                        while (this.f35006c < m55234Y) {
                            c4421k.addInt(m55234Y());
                        }
                        return;
                    }
                    throw InvalidProtocolBufferException.invalidWireType();
                }
                do {
                    c4421k.addInt(mo54995d());
                    if (m55245N()) {
                        return;
                    }
                    i2 = this.f35006c;
                } while (m55234Y() == this.f35009f);
                this.f35006c = i2;
                return;
            }
            int tagWireType2 = WireFormat.getTagWireType(this.f35009f);
            if (tagWireType2 != 0) {
                if (tagWireType2 == 2) {
                    int m55234Y2 = this.f35006c + m55234Y();
                    while (this.f35006c < m55234Y2) {
                        list.add(Integer.valueOf(m55234Y()));
                    }
                    return;
                }
                throw InvalidProtocolBufferException.invalidWireType();
            }
            do {
                list.add(Integer.valueOf(mo54995d()));
                if (m55245N()) {
                    return;
                }
                i = this.f35006c;
            } while (m55234Y() == this.f35009f);
            this.f35006c = i;
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC4435u
        /* renamed from: y */
        public void mo54974y(List list) {
            m55235X(list, true);
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC4435u
        /* renamed from: z */
        public void mo54973z(List list) {
            int i;
            int i2;
            if (list instanceof C4426m) {
                C4426m c4426m = (C4426m) list;
                int tagWireType = WireFormat.getTagWireType(this.f35009f);
                if (tagWireType != 1) {
                    if (tagWireType == 2) {
                        int m55234Y = m55234Y();
                        m55223j0(m55234Y);
                        int i3 = this.f35006c + m55234Y;
                        while (this.f35006c < i3) {
                            c4426m.addLong(m55238U());
                        }
                        return;
                    }
                    throw InvalidProtocolBufferException.invalidWireType();
                }
                do {
                    c4426m.addLong(mo54980s());
                    if (m55245N()) {
                        return;
                    }
                    i2 = this.f35006c;
                } while (m55234Y() == this.f35009f);
                this.f35006c = i2;
                return;
            }
            int tagWireType2 = WireFormat.getTagWireType(this.f35009f);
            if (tagWireType2 != 1) {
                if (tagWireType2 == 2) {
                    int m55234Y2 = m55234Y();
                    m55223j0(m55234Y2);
                    int i4 = this.f35006c + m55234Y2;
                    while (this.f35006c < i4) {
                        list.add(Long.valueOf(m55238U()));
                    }
                    return;
                }
                throw InvalidProtocolBufferException.invalidWireType();
            }
            do {
                list.add(Long.valueOf(mo54980s()));
                if (m55245N()) {
                    return;
                }
                i = this.f35006c;
            } while (m55234Y() == this.f35009f);
            this.f35006c = i;
        }
    }

    public /* synthetic */ AbstractC4408c(C4409a c4409a) {
        this();
    }

    /* renamed from: M */
    public static AbstractC4408c m55246M(ByteBuffer byteBuffer, boolean z) {
        if (byteBuffer.hasArray()) {
            return new C4410b(byteBuffer, z);
        }
        throw new IllegalArgumentException("Direct buffers not yet supported");
    }

    public AbstractC4408c() {
    }
}