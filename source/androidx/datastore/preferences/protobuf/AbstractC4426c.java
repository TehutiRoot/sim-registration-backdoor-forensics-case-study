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
public abstract class AbstractC4426c implements InterfaceC4453u {

    /* renamed from: androidx.datastore.preferences.protobuf.c$a */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class C4427a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f34915a;

        static {
            int[] iArr = new int[WireFormat.FieldType.values().length];
            f34915a = iArr;
            try {
                iArr[WireFormat.FieldType.BOOL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f34915a[WireFormat.FieldType.BYTES.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f34915a[WireFormat.FieldType.DOUBLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f34915a[WireFormat.FieldType.ENUM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f34915a[WireFormat.FieldType.FIXED32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f34915a[WireFormat.FieldType.FIXED64.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f34915a[WireFormat.FieldType.FLOAT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f34915a[WireFormat.FieldType.INT32.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f34915a[WireFormat.FieldType.INT64.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f34915a[WireFormat.FieldType.MESSAGE.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f34915a[WireFormat.FieldType.SFIXED32.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f34915a[WireFormat.FieldType.SFIXED64.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f34915a[WireFormat.FieldType.SINT32.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f34915a[WireFormat.FieldType.SINT64.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f34915a[WireFormat.FieldType.STRING.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f34915a[WireFormat.FieldType.UINT32.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f34915a[WireFormat.FieldType.UINT64.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.c$b */
    /* loaded from: classes2.dex */
    public static final class C4428b extends AbstractC4426c {

        /* renamed from: a */
        public final boolean f34916a;

        /* renamed from: b */
        public final byte[] f34917b;

        /* renamed from: c */
        public int f34918c;

        /* renamed from: d */
        public final int f34919d;

        /* renamed from: e */
        public int f34920e;

        /* renamed from: f */
        public int f34921f;

        /* renamed from: g */
        public int f34922g;

        public C4428b(ByteBuffer byteBuffer, boolean z) {
            super(null);
            this.f34916a = z;
            this.f34917b = byteBuffer.array();
            int arrayOffset = byteBuffer.arrayOffset() + byteBuffer.position();
            this.f34918c = arrayOffset;
            this.f34919d = arrayOffset;
            this.f34920e = byteBuffer.arrayOffset() + byteBuffer.limit();
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC4453u
        /* renamed from: A */
        public void mo55060A(List list) {
            int i;
            int i2;
            if (list instanceof C4439k) {
                C4439k c4439k = (C4439k) list;
                int tagWireType = WireFormat.getTagWireType(this.f34921f);
                if (tagWireType != 0) {
                    if (tagWireType == 2) {
                        int m55284Y = this.f34918c + m55284Y();
                        while (this.f34918c < m55284Y) {
                            c4439k.addInt(m55284Y());
                        }
                        return;
                    }
                    throw InvalidProtocolBufferException.invalidWireType();
                }
                do {
                    c4439k.addInt(mo55046c());
                    if (m55295N()) {
                        return;
                    }
                    i2 = this.f34918c;
                } while (m55284Y() == this.f34921f);
                this.f34918c = i2;
                return;
            }
            int tagWireType2 = WireFormat.getTagWireType(this.f34921f);
            if (tagWireType2 != 0) {
                if (tagWireType2 == 2) {
                    int m55284Y2 = this.f34918c + m55284Y();
                    while (this.f34918c < m55284Y2) {
                        list.add(Integer.valueOf(m55284Y()));
                    }
                    return;
                }
                throw InvalidProtocolBufferException.invalidWireType();
            }
            do {
                list.add(Integer.valueOf(mo55046c()));
                if (m55295N()) {
                    return;
                }
                i = this.f34918c;
            } while (m55284Y() == this.f34921f);
            this.f34918c = i;
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC4453u
        /* renamed from: B */
        public int mo55059B() {
            m55279d0(5);
            return m55291R();
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC4453u
        /* renamed from: C */
        public long mo55058C() {
            m55279d0(0);
            return CodedInputStream.decodeZigZag64(m55283Z());
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC4453u
        /* renamed from: D */
        public int mo55057D() {
            m55279d0(5);
            return m55291R();
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC4453u
        /* renamed from: E */
        public String mo55056E() {
            return m55286W(true);
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC4453u
        /* renamed from: F */
        public Object mo55055F(InterfaceC4454v interfaceC4454v, ExtensionRegistryLite extensionRegistryLite) {
            m55279d0(3);
            return m55292Q(interfaceC4454v, extensionRegistryLite);
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC4453u
        /* renamed from: G */
        public Object mo55054G(Class cls, ExtensionRegistryLite extensionRegistryLite) {
            m55279d0(2);
            return m55287V(C17942Ko1.m67586a().m67583d(cls), extensionRegistryLite);
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC4453u
        /* renamed from: H */
        public Object mo55053H(InterfaceC4454v interfaceC4454v, ExtensionRegistryLite extensionRegistryLite) {
            m55279d0(2);
            return m55287V(interfaceC4454v, extensionRegistryLite);
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC4453u
        /* renamed from: I */
        public void mo55052I(List list, InterfaceC4454v interfaceC4454v, ExtensionRegistryLite extensionRegistryLite) {
            int i;
            if (WireFormat.getTagWireType(this.f34921f) == 2) {
                int i2 = this.f34921f;
                do {
                    list.add(m55287V(interfaceC4454v, extensionRegistryLite));
                    if (m55295N()) {
                        return;
                    }
                    i = this.f34918c;
                } while (m55284Y() == i2);
                this.f34918c = i;
                return;
            }
            throw InvalidProtocolBufferException.invalidWireType();
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC4453u
        /* renamed from: J */
        public Object mo55051J(Class cls, ExtensionRegistryLite extensionRegistryLite) {
            m55279d0(3);
            return m55292Q(C17942Ko1.m67586a().m67583d(cls), extensionRegistryLite);
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC4453u
        /* renamed from: K */
        public void mo55050K(Map map, MapEntryLite.C4386b c4386b, ExtensionRegistryLite extensionRegistryLite) {
            m55279d0(2);
            int m55284Y = m55284Y();
            m55281b0(m55284Y);
            int i = this.f34920e;
            this.f34920e = this.f34918c + m55284Y;
            try {
                Object obj = c4386b.f34848b;
                Object obj2 = c4386b.f34850d;
                while (true) {
                    int mo55036m = mo55036m();
                    if (mo55036m == Integer.MAX_VALUE) {
                        map.put(obj, obj2);
                        return;
                    } else if (mo55036m != 1) {
                        if (mo55036m != 2) {
                            try {
                                if (!mo55033p()) {
                                    throw new InvalidProtocolBufferException("Unable to parse map entry.");
                                    break;
                                }
                            } catch (InvalidProtocolBufferException.InvalidWireTypeException unused) {
                                if (!mo55033p()) {
                                    throw new InvalidProtocolBufferException("Unable to parse map entry.");
                                }
                            }
                        } else {
                            obj2 = m55293P(c4386b.f34849c, c4386b.f34850d.getClass(), extensionRegistryLite);
                        }
                    } else {
                        obj = m55293P(c4386b.f34847a, null, null);
                    }
                }
            } finally {
                this.f34920e = i;
            }
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC4453u
        /* renamed from: L */
        public void mo55049L(List list, InterfaceC4454v interfaceC4454v, ExtensionRegistryLite extensionRegistryLite) {
            int i;
            if (WireFormat.getTagWireType(this.f34921f) == 3) {
                int i2 = this.f34921f;
                do {
                    list.add(m55292Q(interfaceC4454v, extensionRegistryLite));
                    if (m55295N()) {
                        return;
                    }
                    i = this.f34918c;
                } while (m55284Y() == i2);
                this.f34918c = i;
                return;
            }
            throw InvalidProtocolBufferException.invalidWireType();
        }

        /* renamed from: N */
        public final boolean m55295N() {
            if (this.f34918c == this.f34920e) {
                return true;
            }
            return false;
        }

        /* renamed from: O */
        public final byte m55294O() {
            int i = this.f34918c;
            if (i != this.f34920e) {
                byte[] bArr = this.f34917b;
                this.f34918c = i + 1;
                return bArr[i];
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }

        /* renamed from: P */
        public final Object m55293P(WireFormat.FieldType fieldType, Class cls, ExtensionRegistryLite extensionRegistryLite) {
            switch (C4427a.f34915a[fieldType.ordinal()]) {
                case 1:
                    return Boolean.valueOf(mo55028u());
                case 2:
                    return mo55042g();
                case 3:
                    return Double.valueOf(readDouble());
                case 4:
                    return Integer.valueOf(mo55045d());
                case 5:
                    return Integer.valueOf(mo55059B());
                case 6:
                    return Long.valueOf(mo55030s());
                case 7:
                    return Float.valueOf(readFloat());
                case 8:
                    return Integer.valueOf(readInt32());
                case 9:
                    return Long.valueOf(readInt64());
                case 10:
                    return mo55054G(cls, extensionRegistryLite);
                case 11:
                    return Integer.valueOf(mo55057D());
                case 12:
                    return Long.valueOf(mo55047b());
                case 13:
                    return Integer.valueOf(mo55044e());
                case 14:
                    return Long.valueOf(mo55058C());
                case 15:
                    return mo55056E();
                case 16:
                    return Integer.valueOf(mo55046c());
                case 17:
                    return Long.valueOf(mo55040i());
                default:
                    throw new RuntimeException("unsupported field type.");
            }
        }

        /* renamed from: Q */
        public final Object m55292Q(InterfaceC4454v interfaceC4454v, ExtensionRegistryLite extensionRegistryLite) {
            int i = this.f34922g;
            this.f34922g = WireFormat.m55338a(WireFormat.getTagFieldNumber(this.f34921f), 4);
            try {
                Object newInstance = interfaceC4454v.newInstance();
                interfaceC4454v.mo55015h(newInstance, this, extensionRegistryLite);
                interfaceC4454v.mo55018e(newInstance);
                if (this.f34921f == this.f34922g) {
                    return newInstance;
                }
                throw InvalidProtocolBufferException.parseFailure();
            } finally {
                this.f34922g = i;
            }
        }

        /* renamed from: R */
        public final int m55291R() {
            m55281b0(4);
            return m55290S();
        }

        /* renamed from: S */
        public final int m55290S() {
            int i = this.f34918c;
            byte[] bArr = this.f34917b;
            this.f34918c = i + 4;
            return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
        }

        /* renamed from: T */
        public final long m55289T() {
            m55281b0(8);
            return m55288U();
        }

        /* renamed from: U */
        public final long m55288U() {
            int i = this.f34918c;
            byte[] bArr = this.f34917b;
            this.f34918c = i + 8;
            return ((bArr[i + 7] & 255) << 56) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48);
        }

        /* renamed from: V */
        public final Object m55287V(InterfaceC4454v interfaceC4454v, ExtensionRegistryLite extensionRegistryLite) {
            int m55284Y = m55284Y();
            m55281b0(m55284Y);
            int i = this.f34920e;
            int i2 = this.f34918c + m55284Y;
            this.f34920e = i2;
            try {
                Object newInstance = interfaceC4454v.newInstance();
                interfaceC4454v.mo55015h(newInstance, this, extensionRegistryLite);
                interfaceC4454v.mo55018e(newInstance);
                if (this.f34918c == i2) {
                    return newInstance;
                }
                throw InvalidProtocolBufferException.parseFailure();
            } finally {
                this.f34920e = i;
            }
        }

        /* renamed from: W */
        public String m55286W(boolean z) {
            m55279d0(2);
            int m55284Y = m55284Y();
            if (m55284Y == 0) {
                return "";
            }
            m55281b0(m55284Y);
            if (z) {
                byte[] bArr = this.f34917b;
                int i = this.f34918c;
                if (!Utf8.m55422u(bArr, i, i + m55284Y)) {
                    throw InvalidProtocolBufferException.invalidUtf8();
                }
            }
            String str = new String(this.f34917b, this.f34918c, m55284Y, Internal.f34817a);
            this.f34918c += m55284Y;
            return str;
        }

        /* renamed from: X */
        public void m55285X(List list, boolean z) {
            int i;
            int i2;
            if (WireFormat.getTagWireType(this.f34921f) == 2) {
                if ((list instanceof LazyStringList) && !z) {
                    LazyStringList lazyStringList = (LazyStringList) list;
                    do {
                        lazyStringList.add(mo55042g());
                        if (m55295N()) {
                            return;
                        }
                        i2 = this.f34918c;
                    } while (m55284Y() == this.f34921f);
                    this.f34918c = i2;
                    return;
                }
                do {
                    list.add(m55286W(z));
                    if (m55295N()) {
                        return;
                    }
                    i = this.f34918c;
                } while (m55284Y() == this.f34921f);
                this.f34918c = i;
                return;
            }
            throw InvalidProtocolBufferException.invalidWireType();
        }

        /* renamed from: Y */
        public final int m55284Y() {
            int i;
            int i2 = this.f34918c;
            int i3 = this.f34920e;
            if (i3 != i2) {
                byte[] bArr = this.f34917b;
                int i4 = i2 + 1;
                byte b = bArr[i2];
                if (b >= 0) {
                    this.f34918c = i4;
                    return b;
                } else if (i3 - i4 < 9) {
                    return (int) m55282a0();
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
                    this.f34918c = i5;
                    return i;
                }
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }

        /* renamed from: Z */
        public long m55283Z() {
            long j;
            long j2;
            long j3;
            int i = this.f34918c;
            int i2 = this.f34920e;
            if (i2 != i) {
                byte[] bArr = this.f34917b;
                int i3 = i + 1;
                byte b = bArr[i];
                if (b >= 0) {
                    this.f34918c = i3;
                    return b;
                } else if (i2 - i3 < 9) {
                    return m55282a0();
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
                    this.f34918c = i4;
                    return j;
                }
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC4453u
        /* renamed from: a */
        public void mo55048a(List list) {
            int i;
            int i2;
            if (list instanceof C4444m) {
                C4444m c4444m = (C4444m) list;
                int tagWireType = WireFormat.getTagWireType(this.f34921f);
                if (tagWireType != 0) {
                    if (tagWireType == 2) {
                        int m55284Y = this.f34918c + m55284Y();
                        while (this.f34918c < m55284Y) {
                            c4444m.addLong(CodedInputStream.decodeZigZag64(m55283Z()));
                        }
                        return;
                    }
                    throw InvalidProtocolBufferException.invalidWireType();
                }
                do {
                    c4444m.addLong(mo55058C());
                    if (m55295N()) {
                        return;
                    }
                    i2 = this.f34918c;
                } while (m55284Y() == this.f34921f);
                this.f34918c = i2;
                return;
            }
            int tagWireType2 = WireFormat.getTagWireType(this.f34921f);
            if (tagWireType2 != 0) {
                if (tagWireType2 == 2) {
                    int m55284Y2 = this.f34918c + m55284Y();
                    while (this.f34918c < m55284Y2) {
                        list.add(Long.valueOf(CodedInputStream.decodeZigZag64(m55283Z())));
                    }
                    return;
                }
                throw InvalidProtocolBufferException.invalidWireType();
            }
            do {
                list.add(Long.valueOf(mo55058C()));
                if (m55295N()) {
                    return;
                }
                i = this.f34918c;
            } while (m55284Y() == this.f34921f);
            this.f34918c = i;
        }

        /* renamed from: a0 */
        public final long m55282a0() {
            long j = 0;
            for (int i = 0; i < 64; i += 7) {
                byte m55294O = m55294O();
                j |= (m55294O & Byte.MAX_VALUE) << i;
                if ((m55294O & 128) == 0) {
                    return j;
                }
            }
            throw InvalidProtocolBufferException.malformedVarint();
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC4453u
        /* renamed from: b */
        public long mo55047b() {
            m55279d0(1);
            return m55289T();
        }

        /* renamed from: b0 */
        public final void m55281b0(int i) {
            if (i >= 0 && i <= this.f34920e - this.f34918c) {
                return;
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC4453u
        /* renamed from: c */
        public int mo55046c() {
            m55279d0(0);
            return m55284Y();
        }

        /* renamed from: c0 */
        public final void m55280c0(int i) {
            if (this.f34918c == i) {
                return;
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC4453u
        /* renamed from: d */
        public int mo55045d() {
            m55279d0(0);
            return m55284Y();
        }

        /* renamed from: d0 */
        public final void m55279d0(int i) {
            if (WireFormat.getTagWireType(this.f34921f) == i) {
                return;
            }
            throw InvalidProtocolBufferException.invalidWireType();
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC4453u
        /* renamed from: e */
        public int mo55044e() {
            m55279d0(0);
            return CodedInputStream.decodeZigZag32(m55284Y());
        }

        /* renamed from: e0 */
        public final void m55278e0(int i) {
            m55281b0(i);
            this.f34918c += i;
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC4453u
        /* renamed from: f */
        public void mo55043f(List list) {
            int i;
            boolean z;
            int i2;
            boolean z2;
            if (list instanceof C4429d) {
                C4429d c4429d = (C4429d) list;
                int tagWireType = WireFormat.getTagWireType(this.f34921f);
                if (tagWireType != 0) {
                    if (tagWireType == 2) {
                        int m55284Y = this.f34918c + m55284Y();
                        while (this.f34918c < m55284Y) {
                            if (m55284Y() != 0) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            c4429d.addBoolean(z2);
                        }
                        m55280c0(m55284Y);
                        return;
                    }
                    throw InvalidProtocolBufferException.invalidWireType();
                }
                do {
                    c4429d.addBoolean(mo55028u());
                    if (m55295N()) {
                        return;
                    }
                    i2 = this.f34918c;
                } while (m55284Y() == this.f34921f);
                this.f34918c = i2;
                return;
            }
            int tagWireType2 = WireFormat.getTagWireType(this.f34921f);
            if (tagWireType2 != 0) {
                if (tagWireType2 == 2) {
                    int m55284Y2 = this.f34918c + m55284Y();
                    while (this.f34918c < m55284Y2) {
                        if (m55284Y() != 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        list.add(Boolean.valueOf(z));
                    }
                    m55280c0(m55284Y2);
                    return;
                }
                throw InvalidProtocolBufferException.invalidWireType();
            }
            do {
                list.add(Boolean.valueOf(mo55028u()));
                if (m55295N()) {
                    return;
                }
                i = this.f34918c;
            } while (m55284Y() == this.f34921f);
            this.f34918c = i;
        }

        /* renamed from: f0 */
        public final void m55277f0() {
            int i = this.f34922g;
            this.f34922g = WireFormat.m55338a(WireFormat.getTagFieldNumber(this.f34921f), 4);
            while (mo55036m() != Integer.MAX_VALUE && mo55033p()) {
            }
            if (this.f34921f == this.f34922g) {
                this.f34922g = i;
                return;
            }
            throw InvalidProtocolBufferException.parseFailure();
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC4453u
        /* renamed from: g */
        public ByteString mo55042g() {
            ByteString copyFrom;
            m55279d0(2);
            int m55284Y = m55284Y();
            if (m55284Y == 0) {
                return ByteString.EMPTY;
            }
            m55281b0(m55284Y);
            if (this.f34916a) {
                copyFrom = ByteString.wrap(this.f34917b, this.f34918c, m55284Y);
            } else {
                copyFrom = ByteString.copyFrom(this.f34917b, this.f34918c, m55284Y);
            }
            this.f34918c += m55284Y;
            return copyFrom;
        }

        /* renamed from: g0 */
        public final void m55276g0() {
            int i = this.f34920e;
            int i2 = this.f34918c;
            if (i - i2 >= 10) {
                byte[] bArr = this.f34917b;
                int i3 = 0;
                while (i3 < 10) {
                    int i4 = i2 + 1;
                    if (bArr[i2] >= 0) {
                        this.f34918c = i4;
                        return;
                    } else {
                        i3++;
                        i2 = i4;
                    }
                }
            }
            m55275h0();
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC4453u
        public int getTag() {
            return this.f34921f;
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC4453u
        /* renamed from: h */
        public void mo55041h(List list) {
            int i;
            int i2;
            if (list instanceof C4439k) {
                C4439k c4439k = (C4439k) list;
                int tagWireType = WireFormat.getTagWireType(this.f34921f);
                if (tagWireType != 0) {
                    if (tagWireType == 2) {
                        int m55284Y = this.f34918c + m55284Y();
                        while (this.f34918c < m55284Y) {
                            c4439k.addInt(CodedInputStream.decodeZigZag32(m55284Y()));
                        }
                        return;
                    }
                    throw InvalidProtocolBufferException.invalidWireType();
                }
                do {
                    c4439k.addInt(mo55044e());
                    if (m55295N()) {
                        return;
                    }
                    i2 = this.f34918c;
                } while (m55284Y() == this.f34921f);
                this.f34918c = i2;
                return;
            }
            int tagWireType2 = WireFormat.getTagWireType(this.f34921f);
            if (tagWireType2 != 0) {
                if (tagWireType2 == 2) {
                    int m55284Y2 = this.f34918c + m55284Y();
                    while (this.f34918c < m55284Y2) {
                        list.add(Integer.valueOf(CodedInputStream.decodeZigZag32(m55284Y())));
                    }
                    return;
                }
                throw InvalidProtocolBufferException.invalidWireType();
            }
            do {
                list.add(Integer.valueOf(mo55044e()));
                if (m55295N()) {
                    return;
                }
                i = this.f34918c;
            } while (m55284Y() == this.f34921f);
            this.f34918c = i;
        }

        /* renamed from: h0 */
        public final void m55275h0() {
            for (int i = 0; i < 10; i++) {
                if (m55294O() >= 0) {
                    return;
                }
            }
            throw InvalidProtocolBufferException.malformedVarint();
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC4453u
        /* renamed from: i */
        public long mo55040i() {
            m55279d0(0);
            return m55283Z();
        }

        /* renamed from: i0 */
        public final void m55274i0(int i) {
            m55281b0(i);
            if ((i & 3) == 0) {
                return;
            }
            throw InvalidProtocolBufferException.parseFailure();
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC4453u
        /* renamed from: j */
        public void mo55039j(List list) {
            int i;
            int i2;
            if (list instanceof C4444m) {
                C4444m c4444m = (C4444m) list;
                int tagWireType = WireFormat.getTagWireType(this.f34921f);
                if (tagWireType != 1) {
                    if (tagWireType == 2) {
                        int m55284Y = m55284Y();
                        m55273j0(m55284Y);
                        int i3 = this.f34918c + m55284Y;
                        while (this.f34918c < i3) {
                            c4444m.addLong(m55288U());
                        }
                        return;
                    }
                    throw InvalidProtocolBufferException.invalidWireType();
                }
                do {
                    c4444m.addLong(mo55047b());
                    if (m55295N()) {
                        return;
                    }
                    i2 = this.f34918c;
                } while (m55284Y() == this.f34921f);
                this.f34918c = i2;
                return;
            }
            int tagWireType2 = WireFormat.getTagWireType(this.f34921f);
            if (tagWireType2 != 1) {
                if (tagWireType2 == 2) {
                    int m55284Y2 = m55284Y();
                    m55273j0(m55284Y2);
                    int i4 = this.f34918c + m55284Y2;
                    while (this.f34918c < i4) {
                        list.add(Long.valueOf(m55288U()));
                    }
                    return;
                }
                throw InvalidProtocolBufferException.invalidWireType();
            }
            do {
                list.add(Long.valueOf(mo55047b()));
                if (m55295N()) {
                    return;
                }
                i = this.f34918c;
            } while (m55284Y() == this.f34921f);
            this.f34918c = i;
        }

        /* renamed from: j0 */
        public final void m55273j0(int i) {
            m55281b0(i);
            if ((i & 7) == 0) {
                return;
            }
            throw InvalidProtocolBufferException.parseFailure();
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC4453u
        /* renamed from: k */
        public void mo55038k(List list) {
            int i;
            int i2;
            if (list instanceof C4439k) {
                C4439k c4439k = (C4439k) list;
                int tagWireType = WireFormat.getTagWireType(this.f34921f);
                if (tagWireType != 0) {
                    if (tagWireType == 2) {
                        int m55284Y = this.f34918c + m55284Y();
                        while (this.f34918c < m55284Y) {
                            c4439k.addInt(m55284Y());
                        }
                        m55280c0(m55284Y);
                        return;
                    }
                    throw InvalidProtocolBufferException.invalidWireType();
                }
                do {
                    c4439k.addInt(readInt32());
                    if (m55295N()) {
                        return;
                    }
                    i2 = this.f34918c;
                } while (m55284Y() == this.f34921f);
                this.f34918c = i2;
                return;
            }
            int tagWireType2 = WireFormat.getTagWireType(this.f34921f);
            if (tagWireType2 != 0) {
                if (tagWireType2 == 2) {
                    int m55284Y2 = this.f34918c + m55284Y();
                    while (this.f34918c < m55284Y2) {
                        list.add(Integer.valueOf(m55284Y()));
                    }
                    m55280c0(m55284Y2);
                    return;
                }
                throw InvalidProtocolBufferException.invalidWireType();
            }
            do {
                list.add(Integer.valueOf(readInt32()));
                if (m55295N()) {
                    return;
                }
                i = this.f34918c;
            } while (m55284Y() == this.f34921f);
            this.f34918c = i;
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC4453u
        /* renamed from: l */
        public void mo55037l(List list) {
            int i;
            int i2;
            if (list instanceof C4439k) {
                C4439k c4439k = (C4439k) list;
                int tagWireType = WireFormat.getTagWireType(this.f34921f);
                if (tagWireType != 2) {
                    if (tagWireType == 5) {
                        do {
                            c4439k.addInt(mo55059B());
                            if (m55295N()) {
                                return;
                            }
                            i2 = this.f34918c;
                        } while (m55284Y() == this.f34921f);
                        this.f34918c = i2;
                        return;
                    }
                    throw InvalidProtocolBufferException.invalidWireType();
                }
                int m55284Y = m55284Y();
                m55274i0(m55284Y);
                int i3 = this.f34918c + m55284Y;
                while (this.f34918c < i3) {
                    c4439k.addInt(m55290S());
                }
                return;
            }
            int tagWireType2 = WireFormat.getTagWireType(this.f34921f);
            if (tagWireType2 != 2) {
                if (tagWireType2 == 5) {
                    do {
                        list.add(Integer.valueOf(mo55059B()));
                        if (m55295N()) {
                            return;
                        }
                        i = this.f34918c;
                    } while (m55284Y() == this.f34921f);
                    this.f34918c = i;
                    return;
                }
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int m55284Y2 = m55284Y();
            m55274i0(m55284Y2);
            int i4 = this.f34918c + m55284Y2;
            while (this.f34918c < i4) {
                list.add(Integer.valueOf(m55290S()));
            }
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC4453u
        /* renamed from: m */
        public int mo55036m() {
            if (m55295N()) {
                return Integer.MAX_VALUE;
            }
            int m55284Y = m55284Y();
            this.f34921f = m55284Y;
            if (m55284Y == this.f34922g) {
                return Integer.MAX_VALUE;
            }
            return WireFormat.getTagFieldNumber(m55284Y);
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC4453u
        /* renamed from: n */
        public void mo55035n(List list) {
            m55285X(list, false);
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC4453u
        /* renamed from: o */
        public void mo55034o(List list) {
            int i;
            int i2;
            if (list instanceof C4438j) {
                C4438j c4438j = (C4438j) list;
                int tagWireType = WireFormat.getTagWireType(this.f34921f);
                if (tagWireType != 2) {
                    if (tagWireType == 5) {
                        do {
                            c4438j.addFloat(readFloat());
                            if (m55295N()) {
                                return;
                            }
                            i2 = this.f34918c;
                        } while (m55284Y() == this.f34921f);
                        this.f34918c = i2;
                        return;
                    }
                    throw InvalidProtocolBufferException.invalidWireType();
                }
                int m55284Y = m55284Y();
                m55274i0(m55284Y);
                int i3 = this.f34918c + m55284Y;
                while (this.f34918c < i3) {
                    c4438j.addFloat(Float.intBitsToFloat(m55290S()));
                }
                return;
            }
            int tagWireType2 = WireFormat.getTagWireType(this.f34921f);
            if (tagWireType2 != 2) {
                if (tagWireType2 == 5) {
                    do {
                        list.add(Float.valueOf(readFloat()));
                        if (m55295N()) {
                            return;
                        }
                        i = this.f34918c;
                    } while (m55284Y() == this.f34921f);
                    this.f34918c = i;
                    return;
                }
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int m55284Y2 = m55284Y();
            m55274i0(m55284Y2);
            int i4 = this.f34918c + m55284Y2;
            while (this.f34918c < i4) {
                list.add(Float.valueOf(Float.intBitsToFloat(m55290S())));
            }
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC4453u
        /* renamed from: p */
        public boolean mo55033p() {
            int i;
            if (!m55295N() && (i = this.f34921f) != this.f34922g) {
                int tagWireType = WireFormat.getTagWireType(i);
                if (tagWireType != 0) {
                    if (tagWireType != 1) {
                        if (tagWireType != 2) {
                            if (tagWireType != 3) {
                                if (tagWireType == 5) {
                                    m55278e0(4);
                                    return true;
                                }
                                throw InvalidProtocolBufferException.invalidWireType();
                            }
                            m55277f0();
                            return true;
                        }
                        m55278e0(m55284Y());
                        return true;
                    }
                    m55278e0(8);
                    return true;
                }
                m55276g0();
                return true;
            }
            return false;
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC4453u
        /* renamed from: q */
        public void mo55032q(List list) {
            int i;
            if (WireFormat.getTagWireType(this.f34921f) == 2) {
                do {
                    list.add(mo55042g());
                    if (m55295N()) {
                        return;
                    }
                    i = this.f34918c;
                } while (m55284Y() == this.f34921f);
                this.f34918c = i;
                return;
            }
            throw InvalidProtocolBufferException.invalidWireType();
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC4453u
        /* renamed from: r */
        public void mo55031r(List list) {
            int i;
            int i2;
            if (list instanceof C4434g) {
                C4434g c4434g = (C4434g) list;
                int tagWireType = WireFormat.getTagWireType(this.f34921f);
                if (tagWireType != 1) {
                    if (tagWireType == 2) {
                        int m55284Y = m55284Y();
                        m55273j0(m55284Y);
                        int i3 = this.f34918c + m55284Y;
                        while (this.f34918c < i3) {
                            c4434g.addDouble(Double.longBitsToDouble(m55288U()));
                        }
                        return;
                    }
                    throw InvalidProtocolBufferException.invalidWireType();
                }
                do {
                    c4434g.addDouble(readDouble());
                    if (m55295N()) {
                        return;
                    }
                    i2 = this.f34918c;
                } while (m55284Y() == this.f34921f);
                this.f34918c = i2;
                return;
            }
            int tagWireType2 = WireFormat.getTagWireType(this.f34921f);
            if (tagWireType2 != 1) {
                if (tagWireType2 == 2) {
                    int m55284Y2 = m55284Y();
                    m55273j0(m55284Y2);
                    int i4 = this.f34918c + m55284Y2;
                    while (this.f34918c < i4) {
                        list.add(Double.valueOf(Double.longBitsToDouble(m55288U())));
                    }
                    return;
                }
                throw InvalidProtocolBufferException.invalidWireType();
            }
            do {
                list.add(Double.valueOf(readDouble()));
                if (m55295N()) {
                    return;
                }
                i = this.f34918c;
            } while (m55284Y() == this.f34921f);
            this.f34918c = i;
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC4453u
        public double readDouble() {
            m55279d0(1);
            return Double.longBitsToDouble(m55289T());
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC4453u
        public float readFloat() {
            m55279d0(5);
            return Float.intBitsToFloat(m55291R());
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC4453u
        public int readInt32() {
            m55279d0(0);
            return m55284Y();
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC4453u
        public long readInt64() {
            m55279d0(0);
            return m55283Z();
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC4453u
        public String readString() {
            return m55286W(false);
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC4453u
        /* renamed from: s */
        public long mo55030s() {
            m55279d0(1);
            return m55289T();
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC4453u
        /* renamed from: t */
        public void mo55029t(List list) {
            int i;
            int i2;
            if (list instanceof C4439k) {
                C4439k c4439k = (C4439k) list;
                int tagWireType = WireFormat.getTagWireType(this.f34921f);
                if (tagWireType != 2) {
                    if (tagWireType == 5) {
                        do {
                            c4439k.addInt(mo55057D());
                            if (m55295N()) {
                                return;
                            }
                            i2 = this.f34918c;
                        } while (m55284Y() == this.f34921f);
                        this.f34918c = i2;
                        return;
                    }
                    throw InvalidProtocolBufferException.invalidWireType();
                }
                int m55284Y = m55284Y();
                m55274i0(m55284Y);
                int i3 = this.f34918c + m55284Y;
                while (this.f34918c < i3) {
                    c4439k.addInt(m55290S());
                }
                return;
            }
            int tagWireType2 = WireFormat.getTagWireType(this.f34921f);
            if (tagWireType2 != 2) {
                if (tagWireType2 == 5) {
                    do {
                        list.add(Integer.valueOf(mo55057D()));
                        if (m55295N()) {
                            return;
                        }
                        i = this.f34918c;
                    } while (m55284Y() == this.f34921f);
                    this.f34918c = i;
                    return;
                }
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int m55284Y2 = m55284Y();
            m55274i0(m55284Y2);
            int i4 = this.f34918c + m55284Y2;
            while (this.f34918c < i4) {
                list.add(Integer.valueOf(m55290S()));
            }
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC4453u
        /* renamed from: u */
        public boolean mo55028u() {
            m55279d0(0);
            if (m55284Y() == 0) {
                return false;
            }
            return true;
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC4453u
        /* renamed from: v */
        public void mo55027v(List list) {
            int i;
            int i2;
            if (list instanceof C4444m) {
                C4444m c4444m = (C4444m) list;
                int tagWireType = WireFormat.getTagWireType(this.f34921f);
                if (tagWireType != 0) {
                    if (tagWireType == 2) {
                        int m55284Y = this.f34918c + m55284Y();
                        while (this.f34918c < m55284Y) {
                            c4444m.addLong(m55283Z());
                        }
                        m55280c0(m55284Y);
                        return;
                    }
                    throw InvalidProtocolBufferException.invalidWireType();
                }
                do {
                    c4444m.addLong(mo55040i());
                    if (m55295N()) {
                        return;
                    }
                    i2 = this.f34918c;
                } while (m55284Y() == this.f34921f);
                this.f34918c = i2;
                return;
            }
            int tagWireType2 = WireFormat.getTagWireType(this.f34921f);
            if (tagWireType2 != 0) {
                if (tagWireType2 == 2) {
                    int m55284Y2 = this.f34918c + m55284Y();
                    while (this.f34918c < m55284Y2) {
                        list.add(Long.valueOf(m55283Z()));
                    }
                    m55280c0(m55284Y2);
                    return;
                }
                throw InvalidProtocolBufferException.invalidWireType();
            }
            do {
                list.add(Long.valueOf(mo55040i()));
                if (m55295N()) {
                    return;
                }
                i = this.f34918c;
            } while (m55284Y() == this.f34921f);
            this.f34918c = i;
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC4453u
        /* renamed from: w */
        public void mo55026w(List list) {
            int i;
            int i2;
            if (list instanceof C4444m) {
                C4444m c4444m = (C4444m) list;
                int tagWireType = WireFormat.getTagWireType(this.f34921f);
                if (tagWireType != 0) {
                    if (tagWireType == 2) {
                        int m55284Y = this.f34918c + m55284Y();
                        while (this.f34918c < m55284Y) {
                            c4444m.addLong(m55283Z());
                        }
                        m55280c0(m55284Y);
                        return;
                    }
                    throw InvalidProtocolBufferException.invalidWireType();
                }
                do {
                    c4444m.addLong(readInt64());
                    if (m55295N()) {
                        return;
                    }
                    i2 = this.f34918c;
                } while (m55284Y() == this.f34921f);
                this.f34918c = i2;
                return;
            }
            int tagWireType2 = WireFormat.getTagWireType(this.f34921f);
            if (tagWireType2 != 0) {
                if (tagWireType2 == 2) {
                    int m55284Y2 = this.f34918c + m55284Y();
                    while (this.f34918c < m55284Y2) {
                        list.add(Long.valueOf(m55283Z()));
                    }
                    m55280c0(m55284Y2);
                    return;
                }
                throw InvalidProtocolBufferException.invalidWireType();
            }
            do {
                list.add(Long.valueOf(readInt64()));
                if (m55295N()) {
                    return;
                }
                i = this.f34918c;
            } while (m55284Y() == this.f34921f);
            this.f34918c = i;
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC4453u
        /* renamed from: x */
        public void mo55025x(List list) {
            int i;
            int i2;
            if (list instanceof C4439k) {
                C4439k c4439k = (C4439k) list;
                int tagWireType = WireFormat.getTagWireType(this.f34921f);
                if (tagWireType != 0) {
                    if (tagWireType == 2) {
                        int m55284Y = this.f34918c + m55284Y();
                        while (this.f34918c < m55284Y) {
                            c4439k.addInt(m55284Y());
                        }
                        return;
                    }
                    throw InvalidProtocolBufferException.invalidWireType();
                }
                do {
                    c4439k.addInt(mo55045d());
                    if (m55295N()) {
                        return;
                    }
                    i2 = this.f34918c;
                } while (m55284Y() == this.f34921f);
                this.f34918c = i2;
                return;
            }
            int tagWireType2 = WireFormat.getTagWireType(this.f34921f);
            if (tagWireType2 != 0) {
                if (tagWireType2 == 2) {
                    int m55284Y2 = this.f34918c + m55284Y();
                    while (this.f34918c < m55284Y2) {
                        list.add(Integer.valueOf(m55284Y()));
                    }
                    return;
                }
                throw InvalidProtocolBufferException.invalidWireType();
            }
            do {
                list.add(Integer.valueOf(mo55045d()));
                if (m55295N()) {
                    return;
                }
                i = this.f34918c;
            } while (m55284Y() == this.f34921f);
            this.f34918c = i;
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC4453u
        /* renamed from: y */
        public void mo55024y(List list) {
            m55285X(list, true);
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC4453u
        /* renamed from: z */
        public void mo55023z(List list) {
            int i;
            int i2;
            if (list instanceof C4444m) {
                C4444m c4444m = (C4444m) list;
                int tagWireType = WireFormat.getTagWireType(this.f34921f);
                if (tagWireType != 1) {
                    if (tagWireType == 2) {
                        int m55284Y = m55284Y();
                        m55273j0(m55284Y);
                        int i3 = this.f34918c + m55284Y;
                        while (this.f34918c < i3) {
                            c4444m.addLong(m55288U());
                        }
                        return;
                    }
                    throw InvalidProtocolBufferException.invalidWireType();
                }
                do {
                    c4444m.addLong(mo55030s());
                    if (m55295N()) {
                        return;
                    }
                    i2 = this.f34918c;
                } while (m55284Y() == this.f34921f);
                this.f34918c = i2;
                return;
            }
            int tagWireType2 = WireFormat.getTagWireType(this.f34921f);
            if (tagWireType2 != 1) {
                if (tagWireType2 == 2) {
                    int m55284Y2 = m55284Y();
                    m55273j0(m55284Y2);
                    int i4 = this.f34918c + m55284Y2;
                    while (this.f34918c < i4) {
                        list.add(Long.valueOf(m55288U()));
                    }
                    return;
                }
                throw InvalidProtocolBufferException.invalidWireType();
            }
            do {
                list.add(Long.valueOf(mo55030s()));
                if (m55295N()) {
                    return;
                }
                i = this.f34918c;
            } while (m55284Y() == this.f34921f);
            this.f34918c = i;
        }
    }

    public /* synthetic */ AbstractC4426c(C4427a c4427a) {
        this();
    }

    /* renamed from: M */
    public static AbstractC4426c m55296M(ByteBuffer byteBuffer, boolean z) {
        if (byteBuffer.hasArray()) {
            return new C4428b(byteBuffer, z);
        }
        throw new IllegalArgumentException("Direct buffers not yet supported");
    }

    public AbstractC4426c() {
    }
}
