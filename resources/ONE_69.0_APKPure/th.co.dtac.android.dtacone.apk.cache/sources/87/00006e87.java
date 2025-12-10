package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.GeneratedMessageLite;
import androidx.datastore.preferences.protobuf.Internal;
import androidx.datastore.preferences.protobuf.WireFormat;
import com.google.common.base.Ascii;

/* renamed from: androidx.datastore.preferences.protobuf.b */
/* loaded from: classes2.dex */
public abstract class AbstractC4405b {

    /* renamed from: androidx.datastore.preferences.protobuf.b$a */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class C4406a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f34998a;

        static {
            int[] iArr = new int[WireFormat.FieldType.values().length];
            f34998a = iArr;
            try {
                iArr[WireFormat.FieldType.DOUBLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f34998a[WireFormat.FieldType.FLOAT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f34998a[WireFormat.FieldType.INT64.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f34998a[WireFormat.FieldType.UINT64.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f34998a[WireFormat.FieldType.INT32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f34998a[WireFormat.FieldType.UINT32.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f34998a[WireFormat.FieldType.FIXED64.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f34998a[WireFormat.FieldType.SFIXED64.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f34998a[WireFormat.FieldType.FIXED32.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f34998a[WireFormat.FieldType.SFIXED32.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f34998a[WireFormat.FieldType.BOOL.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f34998a[WireFormat.FieldType.SINT32.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f34998a[WireFormat.FieldType.SINT64.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f34998a[WireFormat.FieldType.ENUM.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f34998a[WireFormat.FieldType.BYTES.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f34998a[WireFormat.FieldType.STRING.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f34998a[WireFormat.FieldType.GROUP.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f34998a[WireFormat.FieldType.MESSAGE.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.b$b */
    /* loaded from: classes2.dex */
    public static final class C4407b {

        /* renamed from: a */
        public int f34999a;

        /* renamed from: b */
        public long f35000b;

        /* renamed from: c */
        public Object f35001c;

        /* renamed from: d */
        public final ExtensionRegistryLite f35002d;

        public C4407b(ExtensionRegistryLite extensionRegistryLite) {
            extensionRegistryLite.getClass();
            this.f35002d = extensionRegistryLite;
        }
    }

    /* renamed from: A */
    public static int m55286A(int i, byte[] bArr, int i2, int i3, Internal.ProtobufList protobufList, C4407b c4407b) {
        C4421k c4421k = (C4421k) protobufList;
        int m55278I = m55278I(bArr, i2, c4407b);
        c4421k.addInt(CodedInputStream.decodeZigZag32(c4407b.f34999a));
        while (m55278I < i3) {
            int m55278I2 = m55278I(bArr, m55278I, c4407b);
            if (i != c4407b.f34999a) {
                break;
            }
            m55278I = m55278I(bArr, m55278I2, c4407b);
            c4421k.addInt(CodedInputStream.decodeZigZag32(c4407b.f34999a));
        }
        return m55278I;
    }

    /* renamed from: B */
    public static int m55285B(int i, byte[] bArr, int i2, int i3, Internal.ProtobufList protobufList, C4407b c4407b) {
        C4426m c4426m = (C4426m) protobufList;
        int m55275L = m55275L(bArr, i2, c4407b);
        c4426m.addLong(CodedInputStream.decodeZigZag64(c4407b.f35000b));
        while (m55275L < i3) {
            int m55278I = m55278I(bArr, m55275L, c4407b);
            if (i != c4407b.f34999a) {
                break;
            }
            m55275L = m55275L(bArr, m55278I, c4407b);
            c4426m.addLong(CodedInputStream.decodeZigZag64(c4407b.f35000b));
        }
        return m55275L;
    }

    /* renamed from: C */
    public static int m55284C(byte[] bArr, int i, C4407b c4407b) {
        int m55278I = m55278I(bArr, i, c4407b);
        int i2 = c4407b.f34999a;
        if (i2 >= 0) {
            if (i2 == 0) {
                c4407b.f35001c = "";
                return m55278I;
            }
            c4407b.f35001c = new String(bArr, m55278I, i2, Internal.f34905a);
            return m55278I + i2;
        }
        throw InvalidProtocolBufferException.negativeSize();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:8:0x001a -> B:9:0x001b). Please submit an issue!!! */
    /* renamed from: D */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int m55283D(int r4, byte[] r5, int r6, int r7, androidx.datastore.preferences.protobuf.Internal.ProtobufList r8, androidx.datastore.preferences.protobuf.AbstractC4405b.C4407b r9) {
        /*
            int r6 = m55278I(r5, r6, r9)
            int r0 = r9.f34999a
            if (r0 < 0) goto L45
            java.lang.String r1 = ""
            if (r0 != 0) goto L10
            r8.add(r1)
            goto L1b
        L10:
            java.lang.String r2 = new java.lang.String
            java.nio.charset.Charset r3 = androidx.datastore.preferences.protobuf.Internal.f34905a
            r2.<init>(r5, r6, r0, r3)
            r8.add(r2)
        L1a:
            int r6 = r6 + r0
        L1b:
            if (r6 >= r7) goto L44
            int r0 = m55278I(r5, r6, r9)
            int r2 = r9.f34999a
            if (r4 == r2) goto L26
            goto L44
        L26:
            int r6 = m55278I(r5, r0, r9)
            int r0 = r9.f34999a
            if (r0 < 0) goto L3f
            if (r0 != 0) goto L34
            r8.add(r1)
            goto L1b
        L34:
            java.lang.String r2 = new java.lang.String
            java.nio.charset.Charset r3 = androidx.datastore.preferences.protobuf.Internal.f34905a
            r2.<init>(r5, r6, r0, r3)
            r8.add(r2)
            goto L1a
        L3f:
            androidx.datastore.preferences.protobuf.InvalidProtocolBufferException r4 = androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.negativeSize()
            throw r4
        L44:
            return r6
        L45:
            androidx.datastore.preferences.protobuf.InvalidProtocolBufferException r4 = androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.negativeSize()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.AbstractC4405b.m55283D(int, byte[], int, int, androidx.datastore.preferences.protobuf.Internal$ProtobufList, androidx.datastore.preferences.protobuf.b$b):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0025  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0023). Please submit an issue!!! */
    /* renamed from: E */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int m55282E(int r5, byte[] r6, int r7, int r8, androidx.datastore.preferences.protobuf.Internal.ProtobufList r9, androidx.datastore.preferences.protobuf.AbstractC4405b.C4407b r10) {
        /*
            int r7 = m55278I(r6, r7, r10)
            int r0 = r10.f34999a
            if (r0 < 0) goto L5f
            java.lang.String r1 = ""
            if (r0 != 0) goto L10
            r9.add(r1)
            goto L23
        L10:
            int r2 = r7 + r0
            boolean r3 = androidx.datastore.preferences.protobuf.Utf8.m55372u(r6, r7, r2)
            if (r3 == 0) goto L5a
            java.lang.String r3 = new java.lang.String
            java.nio.charset.Charset r4 = androidx.datastore.preferences.protobuf.Internal.f34905a
            r3.<init>(r6, r7, r0, r4)
            r9.add(r3)
        L22:
            r7 = r2
        L23:
            if (r7 >= r8) goto L59
            int r0 = m55278I(r6, r7, r10)
            int r2 = r10.f34999a
            if (r5 == r2) goto L2e
            goto L59
        L2e:
            int r7 = m55278I(r6, r0, r10)
            int r0 = r10.f34999a
            if (r0 < 0) goto L54
            if (r0 != 0) goto L3c
            r9.add(r1)
            goto L23
        L3c:
            int r2 = r7 + r0
            boolean r3 = androidx.datastore.preferences.protobuf.Utf8.m55372u(r6, r7, r2)
            if (r3 == 0) goto L4f
            java.lang.String r3 = new java.lang.String
            java.nio.charset.Charset r4 = androidx.datastore.preferences.protobuf.Internal.f34905a
            r3.<init>(r6, r7, r0, r4)
            r9.add(r3)
            goto L22
        L4f:
            androidx.datastore.preferences.protobuf.InvalidProtocolBufferException r5 = androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.invalidUtf8()
            throw r5
        L54:
            androidx.datastore.preferences.protobuf.InvalidProtocolBufferException r5 = androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.negativeSize()
            throw r5
        L59:
            return r7
        L5a:
            androidx.datastore.preferences.protobuf.InvalidProtocolBufferException r5 = androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.invalidUtf8()
            throw r5
        L5f:
            androidx.datastore.preferences.protobuf.InvalidProtocolBufferException r5 = androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.negativeSize()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.AbstractC4405b.m55282E(int, byte[], int, int, androidx.datastore.preferences.protobuf.Internal$ProtobufList, androidx.datastore.preferences.protobuf.b$b):int");
    }

    /* renamed from: F */
    public static int m55281F(byte[] bArr, int i, C4407b c4407b) {
        int m55278I = m55278I(bArr, i, c4407b);
        int i2 = c4407b.f34999a;
        if (i2 >= 0) {
            if (i2 == 0) {
                c4407b.f35001c = "";
                return m55278I;
            }
            c4407b.f35001c = Utf8.m55385h(bArr, m55278I, i2);
            return m55278I + i2;
        }
        throw InvalidProtocolBufferException.negativeSize();
    }

    /* renamed from: G */
    public static int m55280G(int i, byte[] bArr, int i2, int i3, UnknownFieldSetLite unknownFieldSetLite, C4407b c4407b) {
        if (WireFormat.getTagFieldNumber(i) != 0) {
            int tagWireType = WireFormat.getTagWireType(i);
            if (tagWireType != 0) {
                if (tagWireType != 1) {
                    if (tagWireType != 2) {
                        if (tagWireType != 3) {
                            if (tagWireType == 5) {
                                unknownFieldSetLite.m55401n(i, Integer.valueOf(m55265h(bArr, i2)));
                                return i2 + 4;
                            }
                            throw InvalidProtocolBufferException.invalidTag();
                        }
                        UnknownFieldSetLite m55403l = UnknownFieldSetLite.m55403l();
                        int i4 = (i & (-8)) | 4;
                        int i5 = 0;
                        while (true) {
                            if (i2 >= i3) {
                                break;
                            }
                            int m55278I = m55278I(bArr, i2, c4407b);
                            int i6 = c4407b.f34999a;
                            if (i6 == i4) {
                                i5 = i6;
                                i2 = m55278I;
                                break;
                            }
                            i5 = i6;
                            i2 = m55280G(i6, bArr, m55278I, i3, m55403l, c4407b);
                        }
                        if (i2 <= i3 && i5 == i4) {
                            unknownFieldSetLite.m55401n(i, m55403l);
                            return i2;
                        }
                        throw InvalidProtocolBufferException.parseFailure();
                    }
                    int m55278I2 = m55278I(bArr, i2, c4407b);
                    int i7 = c4407b.f34999a;
                    if (i7 >= 0) {
                        if (i7 <= bArr.length - m55278I2) {
                            if (i7 == 0) {
                                unknownFieldSetLite.m55401n(i, ByteString.EMPTY);
                            } else {
                                unknownFieldSetLite.m55401n(i, ByteString.copyFrom(bArr, m55278I2, i7));
                            }
                            return m55278I2 + i7;
                        }
                        throw InvalidProtocolBufferException.truncatedMessage();
                    }
                    throw InvalidProtocolBufferException.negativeSize();
                }
                unknownFieldSetLite.m55401n(i, Long.valueOf(m55263j(bArr, i2)));
                return i2 + 8;
            }
            int m55275L = m55275L(bArr, i2, c4407b);
            unknownFieldSetLite.m55401n(i, Long.valueOf(c4407b.f35000b));
            return m55275L;
        }
        throw InvalidProtocolBufferException.invalidTag();
    }

    /* renamed from: H */
    public static int m55279H(int i, byte[] bArr, int i2, C4407b c4407b) {
        int i3 = i & 127;
        int i4 = i2 + 1;
        byte b = bArr[i2];
        if (b >= 0) {
            c4407b.f34999a = i3 | (b << 7);
            return i4;
        }
        int i5 = i3 | ((b & Byte.MAX_VALUE) << 7);
        int i6 = i2 + 2;
        byte b2 = bArr[i4];
        if (b2 >= 0) {
            c4407b.f34999a = i5 | (b2 << 14);
            return i6;
        }
        int i7 = i5 | ((b2 & Byte.MAX_VALUE) << 14);
        int i8 = i2 + 3;
        byte b3 = bArr[i6];
        if (b3 >= 0) {
            c4407b.f34999a = i7 | (b3 << Ascii.NAK);
            return i8;
        }
        int i9 = i7 | ((b3 & Byte.MAX_VALUE) << 21);
        int i10 = i2 + 4;
        byte b4 = bArr[i8];
        if (b4 >= 0) {
            c4407b.f34999a = i9 | (b4 << Ascii.f52698FS);
            return i10;
        }
        int i11 = i9 | ((b4 & Byte.MAX_VALUE) << 28);
        while (true) {
            int i12 = i10 + 1;
            if (bArr[i10] < 0) {
                i10 = i12;
            } else {
                c4407b.f34999a = i11;
                return i12;
            }
        }
    }

    /* renamed from: I */
    public static int m55278I(byte[] bArr, int i, C4407b c4407b) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b >= 0) {
            c4407b.f34999a = b;
            return i2;
        }
        return m55279H(b, bArr, i2, c4407b);
    }

    /* renamed from: J */
    public static int m55277J(int i, byte[] bArr, int i2, int i3, Internal.ProtobufList protobufList, C4407b c4407b) {
        C4421k c4421k = (C4421k) protobufList;
        int m55278I = m55278I(bArr, i2, c4407b);
        c4421k.addInt(c4407b.f34999a);
        while (m55278I < i3) {
            int m55278I2 = m55278I(bArr, m55278I, c4407b);
            if (i != c4407b.f34999a) {
                break;
            }
            m55278I = m55278I(bArr, m55278I2, c4407b);
            c4421k.addInt(c4407b.f34999a);
        }
        return m55278I;
    }

    /* renamed from: K */
    public static int m55276K(long j, byte[] bArr, int i, C4407b c4407b) {
        int i2 = i + 1;
        byte b = bArr[i];
        long j2 = (j & 127) | ((b & Byte.MAX_VALUE) << 7);
        int i3 = 7;
        while (b < 0) {
            int i4 = i2 + 1;
            byte b2 = bArr[i2];
            i3 += 7;
            j2 |= (b2 & Byte.MAX_VALUE) << i3;
            i2 = i4;
            b = b2;
        }
        c4407b.f35000b = j2;
        return i2;
    }

    /* renamed from: L */
    public static int m55275L(byte[] bArr, int i, C4407b c4407b) {
        int i2 = i + 1;
        long j = bArr[i];
        if (j >= 0) {
            c4407b.f35000b = j;
            return i2;
        }
        return m55276K(j, bArr, i2, c4407b);
    }

    /* renamed from: M */
    public static int m55274M(int i, byte[] bArr, int i2, int i3, Internal.ProtobufList protobufList, C4407b c4407b) {
        C4426m c4426m = (C4426m) protobufList;
        int m55275L = m55275L(bArr, i2, c4407b);
        c4426m.addLong(c4407b.f35000b);
        while (m55275L < i3) {
            int m55278I = m55278I(bArr, m55275L, c4407b);
            if (i != c4407b.f34999a) {
                break;
            }
            m55275L = m55275L(bArr, m55278I, c4407b);
            c4426m.addLong(c4407b.f35000b);
        }
        return m55275L;
    }

    /* renamed from: N */
    public static int m55273N(int i, byte[] bArr, int i2, int i3, C4407b c4407b) {
        if (WireFormat.getTagFieldNumber(i) != 0) {
            int tagWireType = WireFormat.getTagWireType(i);
            if (tagWireType != 0) {
                if (tagWireType != 1) {
                    if (tagWireType != 2) {
                        if (tagWireType != 3) {
                            if (tagWireType == 5) {
                                return i2 + 4;
                            }
                            throw InvalidProtocolBufferException.invalidTag();
                        }
                        int i4 = (i & (-8)) | 4;
                        int i5 = 0;
                        while (i2 < i3) {
                            i2 = m55278I(bArr, i2, c4407b);
                            i5 = c4407b.f34999a;
                            if (i5 == i4) {
                                break;
                            }
                            i2 = m55273N(i5, bArr, i2, i3, c4407b);
                        }
                        if (i2 <= i3 && i5 == i4) {
                            return i2;
                        }
                        throw InvalidProtocolBufferException.parseFailure();
                    }
                    return m55278I(bArr, i2, c4407b) + c4407b.f34999a;
                }
                return i2 + 8;
            }
            return m55275L(bArr, i2, c4407b);
        }
        throw InvalidProtocolBufferException.invalidTag();
    }

    /* renamed from: a */
    public static int m55272a(int i, byte[] bArr, int i2, int i3, Internal.ProtobufList protobufList, C4407b c4407b) {
        boolean z;
        boolean z2;
        C4411d c4411d = (C4411d) protobufList;
        int m55275L = m55275L(bArr, i2, c4407b);
        if (c4407b.f35000b != 0) {
            z = true;
        } else {
            z = false;
        }
        c4411d.addBoolean(z);
        while (m55275L < i3) {
            int m55278I = m55278I(bArr, m55275L, c4407b);
            if (i != c4407b.f34999a) {
                break;
            }
            m55275L = m55275L(bArr, m55278I, c4407b);
            if (c4407b.f35000b != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            c4411d.addBoolean(z2);
        }
        return m55275L;
    }

    /* renamed from: b */
    public static int m55271b(byte[] bArr, int i, C4407b c4407b) {
        int m55278I = m55278I(bArr, i, c4407b);
        int i2 = c4407b.f34999a;
        if (i2 >= 0) {
            if (i2 <= bArr.length - m55278I) {
                if (i2 == 0) {
                    c4407b.f35001c = ByteString.EMPTY;
                    return m55278I;
                }
                c4407b.f35001c = ByteString.copyFrom(bArr, m55278I, i2);
                return m55278I + i2;
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        throw InvalidProtocolBufferException.negativeSize();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:9:0x001b -> B:10:0x001c). Please submit an issue!!! */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int m55270c(int r2, byte[] r3, int r4, int r5, androidx.datastore.preferences.protobuf.Internal.ProtobufList r6, androidx.datastore.preferences.protobuf.AbstractC4405b.C4407b r7) {
        /*
            int r4 = m55278I(r3, r4, r7)
            int r0 = r7.f34999a
            if (r0 < 0) goto L53
            int r1 = r3.length
            int r1 = r1 - r4
            if (r0 > r1) goto L4e
            if (r0 != 0) goto L14
            androidx.datastore.preferences.protobuf.ByteString r0 = androidx.datastore.preferences.protobuf.ByteString.EMPTY
            r6.add(r0)
            goto L1c
        L14:
            androidx.datastore.preferences.protobuf.ByteString r1 = androidx.datastore.preferences.protobuf.ByteString.copyFrom(r3, r4, r0)
            r6.add(r1)
        L1b:
            int r4 = r4 + r0
        L1c:
            if (r4 >= r5) goto L4d
            int r0 = m55278I(r3, r4, r7)
            int r1 = r7.f34999a
            if (r2 == r1) goto L27
            goto L4d
        L27:
            int r4 = m55278I(r3, r0, r7)
            int r0 = r7.f34999a
            if (r0 < 0) goto L48
            int r1 = r3.length
            int r1 = r1 - r4
            if (r0 > r1) goto L43
            if (r0 != 0) goto L3b
            androidx.datastore.preferences.protobuf.ByteString r0 = androidx.datastore.preferences.protobuf.ByteString.EMPTY
            r6.add(r0)
            goto L1c
        L3b:
            androidx.datastore.preferences.protobuf.ByteString r1 = androidx.datastore.preferences.protobuf.ByteString.copyFrom(r3, r4, r0)
            r6.add(r1)
            goto L1b
        L43:
            androidx.datastore.preferences.protobuf.InvalidProtocolBufferException r2 = androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.truncatedMessage()
            throw r2
        L48:
            androidx.datastore.preferences.protobuf.InvalidProtocolBufferException r2 = androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.negativeSize()
            throw r2
        L4d:
            return r4
        L4e:
            androidx.datastore.preferences.protobuf.InvalidProtocolBufferException r2 = androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.truncatedMessage()
            throw r2
        L53:
            androidx.datastore.preferences.protobuf.InvalidProtocolBufferException r2 = androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.negativeSize()
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.AbstractC4405b.m55270c(int, byte[], int, int, androidx.datastore.preferences.protobuf.Internal$ProtobufList, androidx.datastore.preferences.protobuf.b$b):int");
    }

    /* renamed from: d */
    public static double m55269d(byte[] bArr, int i) {
        return Double.longBitsToDouble(m55263j(bArr, i));
    }

    /* renamed from: e */
    public static int m55268e(int i, byte[] bArr, int i2, int i3, Internal.ProtobufList protobufList, C4407b c4407b) {
        C4416g c4416g = (C4416g) protobufList;
        c4416g.addDouble(m55269d(bArr, i2));
        int i4 = i2 + 8;
        while (i4 < i3) {
            int m55278I = m55278I(bArr, i4, c4407b);
            if (i != c4407b.f34999a) {
                break;
            }
            c4416g.addDouble(m55269d(bArr, m55278I));
            i4 = m55278I + 8;
        }
        return i4;
    }

    /* renamed from: f */
    public static int m55267f(int i, byte[] bArr, int i2, int i3, GeneratedMessageLite.ExtendableMessage extendableMessage, GeneratedMessageLite.GeneratedExtension generatedExtension, AbstractC4448y abstractC4448y, C4407b c4407b) {
        boolean z;
        Object m55744j;
        FieldSet fieldSet = extendableMessage.extensions;
        int i4 = i >>> 3;
        Object obj = null;
        if (generatedExtension.f34896d.isRepeated() && generatedExtension.f34896d.isPacked()) {
            switch (C4406a.f34998a[generatedExtension.getLiteType().ordinal()]) {
                case 1:
                    C4416g c4416g = new C4416g();
                    int m55254s = m55254s(bArr, i2, c4416g, c4407b);
                    fieldSet.m55759C(generatedExtension.f34896d, c4416g);
                    return m55254s;
                case 2:
                    C4420j c4420j = new C4420j();
                    int m55251v = m55251v(bArr, i2, c4420j, c4407b);
                    fieldSet.m55759C(generatedExtension.f34896d, c4420j);
                    return m55251v;
                case 3:
                case 4:
                    C4426m c4426m = new C4426m();
                    int m55247z = m55247z(bArr, i2, c4426m, c4407b);
                    fieldSet.m55759C(generatedExtension.f34896d, c4426m);
                    return m55247z;
                case 5:
                case 6:
                    C4421k c4421k = new C4421k();
                    int m55248y = m55248y(bArr, i2, c4421k, c4407b);
                    fieldSet.m55759C(generatedExtension.f34896d, c4421k);
                    return m55248y;
                case 7:
                case 8:
                    C4426m c4426m2 = new C4426m();
                    int m55252u = m55252u(bArr, i2, c4426m2, c4407b);
                    fieldSet.m55759C(generatedExtension.f34896d, c4426m2);
                    return m55252u;
                case 9:
                case 10:
                    C4421k c4421k2 = new C4421k();
                    int m55253t = m55253t(bArr, i2, c4421k2, c4407b);
                    fieldSet.m55759C(generatedExtension.f34896d, c4421k2);
                    return m55253t;
                case 11:
                    C4411d c4411d = new C4411d();
                    int m55255r = m55255r(bArr, i2, c4411d, c4407b);
                    fieldSet.m55759C(generatedExtension.f34896d, c4411d);
                    return m55255r;
                case 12:
                    C4421k c4421k3 = new C4421k();
                    int m55250w = m55250w(bArr, i2, c4421k3, c4407b);
                    fieldSet.m55759C(generatedExtension.f34896d, c4421k3);
                    return m55250w;
                case 13:
                    C4426m c4426m3 = new C4426m();
                    int m55249x = m55249x(bArr, i2, c4426m3, c4407b);
                    fieldSet.m55759C(generatedExtension.f34896d, c4426m3);
                    return m55249x;
                case 14:
                    C4421k c4421k4 = new C4421k();
                    int m55248y2 = m55248y(bArr, i2, c4421k4, c4407b);
                    UnknownFieldSetLite unknownFieldSetLite = extendableMessage.unknownFields;
                    if (unknownFieldSetLite != UnknownFieldSetLite.getDefaultInstance()) {
                        obj = unknownFieldSetLite;
                    }
                    UnknownFieldSetLite unknownFieldSetLite2 = (UnknownFieldSetLite) AbstractC4437w.m54907z(i4, c4421k4, generatedExtension.f34896d.getEnumType(), obj, abstractC4448y);
                    if (unknownFieldSetLite2 != null) {
                        extendableMessage.unknownFields = unknownFieldSetLite2;
                    }
                    fieldSet.m55759C(generatedExtension.f34896d, c4421k4);
                    return m55248y2;
                default:
                    throw new IllegalStateException("Type cannot be packed: " + generatedExtension.f34896d.getLiteType());
            }
        }
        if (generatedExtension.getLiteType() == WireFormat.FieldType.ENUM) {
            i2 = m55278I(bArr, i2, c4407b);
            if (generatedExtension.f34896d.getEnumType().findValueByNumber(c4407b.f34999a) == null) {
                UnknownFieldSetLite unknownFieldSetLite3 = extendableMessage.unknownFields;
                if (unknownFieldSetLite3 == UnknownFieldSetLite.getDefaultInstance()) {
                    unknownFieldSetLite3 = UnknownFieldSetLite.m55403l();
                    extendableMessage.unknownFields = unknownFieldSetLite3;
                }
                AbstractC4437w.m54952L(i4, c4407b.f34999a, unknownFieldSetLite3, abstractC4448y);
                return i2;
            }
            obj = Integer.valueOf(c4407b.f34999a);
        } else {
            switch (C4406a.f34998a[generatedExtension.getLiteType().ordinal()]) {
                case 1:
                    obj = Double.valueOf(m55269d(bArr, i2));
                    i2 += 8;
                    break;
                case 2:
                    obj = Float.valueOf(m55261l(bArr, i2));
                    i2 += 4;
                    break;
                case 3:
                case 4:
                    i2 = m55275L(bArr, i2, c4407b);
                    obj = Long.valueOf(c4407b.f35000b);
                    break;
                case 5:
                case 6:
                    i2 = m55278I(bArr, i2, c4407b);
                    obj = Integer.valueOf(c4407b.f34999a);
                    break;
                case 7:
                case 8:
                    obj = Long.valueOf(m55263j(bArr, i2));
                    i2 += 8;
                    break;
                case 9:
                case 10:
                    obj = Integer.valueOf(m55265h(bArr, i2));
                    i2 += 4;
                    break;
                case 11:
                    i2 = m55275L(bArr, i2, c4407b);
                    if (c4407b.f35000b != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    obj = Boolean.valueOf(z);
                    break;
                case 12:
                    i2 = m55278I(bArr, i2, c4407b);
                    obj = Integer.valueOf(CodedInputStream.decodeZigZag32(c4407b.f34999a));
                    break;
                case 13:
                    i2 = m55275L(bArr, i2, c4407b);
                    obj = Long.valueOf(CodedInputStream.decodeZigZag64(c4407b.f35000b));
                    break;
                case 14:
                    throw new IllegalStateException("Shouldn't reach here.");
                case 15:
                    i2 = m55271b(bArr, i2, c4407b);
                    obj = c4407b.f35001c;
                    break;
                case 16:
                    i2 = m55284C(bArr, i2, c4407b);
                    obj = c4407b.f35001c;
                    break;
                case 17:
                    i2 = m55259n(C17783Hp1.m68094a().m68091d(generatedExtension.getMessageDefaultInstance().getClass()), bArr, i2, i3, (i4 << 3) | 4, c4407b);
                    obj = c4407b.f35001c;
                    break;
                case 18:
                    i2 = m55257p(C17783Hp1.m68094a().m68091d(generatedExtension.getMessageDefaultInstance().getClass()), bArr, i2, i3, c4407b);
                    obj = c4407b.f35001c;
                    break;
            }
        }
        if (generatedExtension.isRepeated()) {
            fieldSet.m55753a(generatedExtension.f34896d, obj);
        } else {
            int i5 = C4406a.f34998a[generatedExtension.getLiteType().ordinal()];
            if ((i5 == 17 || i5 == 18) && (m55744j = fieldSet.m55744j(generatedExtension.f34896d)) != null) {
                obj = Internal.m55677d(m55744j, obj);
            }
            fieldSet.m55759C(generatedExtension.f34896d, obj);
        }
        return i2;
    }

    /* renamed from: g */
    public static int m55266g(int i, byte[] bArr, int i2, int i3, Object obj, MessageLite messageLite, AbstractC4448y abstractC4448y, C4407b c4407b) {
        GeneratedMessageLite.GeneratedExtension findLiteExtensionByNumber = c4407b.f35002d.findLiteExtensionByNumber(messageLite, i >>> 3);
        if (findLiteExtensionByNumber == null) {
            return m55280G(i, bArr, i2, i3, C4430q.m55029v(obj), c4407b);
        }
        GeneratedMessageLite.ExtendableMessage extendableMessage = (GeneratedMessageLite.ExtendableMessage) obj;
        extendableMessage.m55703r();
        return m55267f(i, bArr, i2, i3, extendableMessage, findLiteExtensionByNumber, abstractC4448y, c4407b);
    }

    /* renamed from: h */
    public static int m55265h(byte[] bArr, int i) {
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    /* renamed from: i */
    public static int m55264i(int i, byte[] bArr, int i2, int i3, Internal.ProtobufList protobufList, C4407b c4407b) {
        C4421k c4421k = (C4421k) protobufList;
        c4421k.addInt(m55265h(bArr, i2));
        int i4 = i2 + 4;
        while (i4 < i3) {
            int m55278I = m55278I(bArr, i4, c4407b);
            if (i != c4407b.f34999a) {
                break;
            }
            c4421k.addInt(m55265h(bArr, m55278I));
            i4 = m55278I + 4;
        }
        return i4;
    }

    /* renamed from: j */
    public static long m55263j(byte[] bArr, int i) {
        return ((bArr[i + 7] & 255) << 56) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48);
    }

    /* renamed from: k */
    public static int m55262k(int i, byte[] bArr, int i2, int i3, Internal.ProtobufList protobufList, C4407b c4407b) {
        C4426m c4426m = (C4426m) protobufList;
        c4426m.addLong(m55263j(bArr, i2));
        int i4 = i2 + 8;
        while (i4 < i3) {
            int m55278I = m55278I(bArr, i4, c4407b);
            if (i != c4407b.f34999a) {
                break;
            }
            c4426m.addLong(m55263j(bArr, m55278I));
            i4 = m55278I + 8;
        }
        return i4;
    }

    /* renamed from: l */
    public static float m55261l(byte[] bArr, int i) {
        return Float.intBitsToFloat(m55265h(bArr, i));
    }

    /* renamed from: m */
    public static int m55260m(int i, byte[] bArr, int i2, int i3, Internal.ProtobufList protobufList, C4407b c4407b) {
        C4420j c4420j = (C4420j) protobufList;
        c4420j.addFloat(m55261l(bArr, i2));
        int i4 = i2 + 4;
        while (i4 < i3) {
            int m55278I = m55278I(bArr, i4, c4407b);
            if (i != c4407b.f34999a) {
                break;
            }
            c4420j.addFloat(m55261l(bArr, m55278I));
            i4 = m55278I + 4;
        }
        return i4;
    }

    /* renamed from: n */
    public static int m55259n(InterfaceC4436v interfaceC4436v, byte[] bArr, int i, int i2, int i3, C4407b c4407b) {
        C4430q c4430q = (C4430q) interfaceC4436v;
        Object newInstance = c4430q.newInstance();
        int m55060c0 = c4430q.m55060c0(newInstance, bArr, i, i2, i3, c4407b);
        c4430q.mo54968e(newInstance);
        c4407b.f35001c = newInstance;
        return m55060c0;
    }

    /* renamed from: o */
    public static int m55258o(InterfaceC4436v interfaceC4436v, int i, byte[] bArr, int i2, int i3, Internal.ProtobufList protobufList, C4407b c4407b) {
        int i4 = (i & (-8)) | 4;
        int m55259n = m55259n(interfaceC4436v, bArr, i2, i3, i4, c4407b);
        protobufList.add(c4407b.f35001c);
        while (m55259n < i3) {
            int m55278I = m55278I(bArr, m55259n, c4407b);
            if (i != c4407b.f34999a) {
                break;
            }
            m55259n = m55259n(interfaceC4436v, bArr, m55278I, i3, i4, c4407b);
            protobufList.add(c4407b.f35001c);
        }
        return m55259n;
    }

    /* renamed from: p */
    public static int m55257p(InterfaceC4436v interfaceC4436v, byte[] bArr, int i, int i2, C4407b c4407b) {
        int i3 = i + 1;
        int i4 = bArr[i];
        if (i4 < 0) {
            i3 = m55279H(i4, bArr, i3, c4407b);
            i4 = c4407b.f34999a;
        }
        int i5 = i3;
        if (i4 >= 0 && i4 <= i2 - i5) {
            Object newInstance = interfaceC4436v.newInstance();
            int i6 = i4 + i5;
            interfaceC4436v.mo54964i(newInstance, bArr, i5, i6, c4407b);
            interfaceC4436v.mo54968e(newInstance);
            c4407b.f35001c = newInstance;
            return i6;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    /* renamed from: q */
    public static int m55256q(InterfaceC4436v interfaceC4436v, int i, byte[] bArr, int i2, int i3, Internal.ProtobufList protobufList, C4407b c4407b) {
        int m55257p = m55257p(interfaceC4436v, bArr, i2, i3, c4407b);
        protobufList.add(c4407b.f35001c);
        while (m55257p < i3) {
            int m55278I = m55278I(bArr, m55257p, c4407b);
            if (i != c4407b.f34999a) {
                break;
            }
            m55257p = m55257p(interfaceC4436v, bArr, m55278I, i3, c4407b);
            protobufList.add(c4407b.f35001c);
        }
        return m55257p;
    }

    /* renamed from: r */
    public static int m55255r(byte[] bArr, int i, Internal.ProtobufList protobufList, C4407b c4407b) {
        boolean z;
        C4411d c4411d = (C4411d) protobufList;
        int m55278I = m55278I(bArr, i, c4407b);
        int i2 = c4407b.f34999a + m55278I;
        while (m55278I < i2) {
            m55278I = m55275L(bArr, m55278I, c4407b);
            if (c4407b.f35000b != 0) {
                z = true;
            } else {
                z = false;
            }
            c4411d.addBoolean(z);
        }
        if (m55278I == i2) {
            return m55278I;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    /* renamed from: s */
    public static int m55254s(byte[] bArr, int i, Internal.ProtobufList protobufList, C4407b c4407b) {
        C4416g c4416g = (C4416g) protobufList;
        int m55278I = m55278I(bArr, i, c4407b);
        int i2 = c4407b.f34999a + m55278I;
        while (m55278I < i2) {
            c4416g.addDouble(m55269d(bArr, m55278I));
            m55278I += 8;
        }
        if (m55278I == i2) {
            return m55278I;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    /* renamed from: t */
    public static int m55253t(byte[] bArr, int i, Internal.ProtobufList protobufList, C4407b c4407b) {
        C4421k c4421k = (C4421k) protobufList;
        int m55278I = m55278I(bArr, i, c4407b);
        int i2 = c4407b.f34999a + m55278I;
        while (m55278I < i2) {
            c4421k.addInt(m55265h(bArr, m55278I));
            m55278I += 4;
        }
        if (m55278I == i2) {
            return m55278I;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    /* renamed from: u */
    public static int m55252u(byte[] bArr, int i, Internal.ProtobufList protobufList, C4407b c4407b) {
        C4426m c4426m = (C4426m) protobufList;
        int m55278I = m55278I(bArr, i, c4407b);
        int i2 = c4407b.f34999a + m55278I;
        while (m55278I < i2) {
            c4426m.addLong(m55263j(bArr, m55278I));
            m55278I += 8;
        }
        if (m55278I == i2) {
            return m55278I;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    /* renamed from: v */
    public static int m55251v(byte[] bArr, int i, Internal.ProtobufList protobufList, C4407b c4407b) {
        C4420j c4420j = (C4420j) protobufList;
        int m55278I = m55278I(bArr, i, c4407b);
        int i2 = c4407b.f34999a + m55278I;
        while (m55278I < i2) {
            c4420j.addFloat(m55261l(bArr, m55278I));
            m55278I += 4;
        }
        if (m55278I == i2) {
            return m55278I;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    /* renamed from: w */
    public static int m55250w(byte[] bArr, int i, Internal.ProtobufList protobufList, C4407b c4407b) {
        C4421k c4421k = (C4421k) protobufList;
        int m55278I = m55278I(bArr, i, c4407b);
        int i2 = c4407b.f34999a + m55278I;
        while (m55278I < i2) {
            m55278I = m55278I(bArr, m55278I, c4407b);
            c4421k.addInt(CodedInputStream.decodeZigZag32(c4407b.f34999a));
        }
        if (m55278I == i2) {
            return m55278I;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    /* renamed from: x */
    public static int m55249x(byte[] bArr, int i, Internal.ProtobufList protobufList, C4407b c4407b) {
        C4426m c4426m = (C4426m) protobufList;
        int m55278I = m55278I(bArr, i, c4407b);
        int i2 = c4407b.f34999a + m55278I;
        while (m55278I < i2) {
            m55278I = m55275L(bArr, m55278I, c4407b);
            c4426m.addLong(CodedInputStream.decodeZigZag64(c4407b.f35000b));
        }
        if (m55278I == i2) {
            return m55278I;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    /* renamed from: y */
    public static int m55248y(byte[] bArr, int i, Internal.ProtobufList protobufList, C4407b c4407b) {
        C4421k c4421k = (C4421k) protobufList;
        int m55278I = m55278I(bArr, i, c4407b);
        int i2 = c4407b.f34999a + m55278I;
        while (m55278I < i2) {
            m55278I = m55278I(bArr, m55278I, c4407b);
            c4421k.addInt(c4407b.f34999a);
        }
        if (m55278I == i2) {
            return m55278I;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    /* renamed from: z */
    public static int m55247z(byte[] bArr, int i, Internal.ProtobufList protobufList, C4407b c4407b) {
        C4426m c4426m = (C4426m) protobufList;
        int m55278I = m55278I(bArr, i, c4407b);
        int i2 = c4407b.f34999a + m55278I;
        while (m55278I < i2) {
            m55278I = m55275L(bArr, m55278I, c4407b);
            c4426m.addLong(c4407b.f35000b);
        }
        if (m55278I == i2) {
            return m55278I;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }
}