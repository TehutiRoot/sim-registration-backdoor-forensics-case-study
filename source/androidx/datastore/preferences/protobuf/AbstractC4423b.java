package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.GeneratedMessageLite;
import androidx.datastore.preferences.protobuf.Internal;
import androidx.datastore.preferences.protobuf.WireFormat;
import com.google.common.base.Ascii;

/* renamed from: androidx.datastore.preferences.protobuf.b */
/* loaded from: classes2.dex */
public abstract class AbstractC4423b {

    /* renamed from: androidx.datastore.preferences.protobuf.b$a */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class C4424a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f34910a;

        static {
            int[] iArr = new int[WireFormat.FieldType.values().length];
            f34910a = iArr;
            try {
                iArr[WireFormat.FieldType.DOUBLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f34910a[WireFormat.FieldType.FLOAT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f34910a[WireFormat.FieldType.INT64.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f34910a[WireFormat.FieldType.UINT64.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f34910a[WireFormat.FieldType.INT32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f34910a[WireFormat.FieldType.UINT32.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f34910a[WireFormat.FieldType.FIXED64.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f34910a[WireFormat.FieldType.SFIXED64.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f34910a[WireFormat.FieldType.FIXED32.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f34910a[WireFormat.FieldType.SFIXED32.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f34910a[WireFormat.FieldType.BOOL.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f34910a[WireFormat.FieldType.SINT32.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f34910a[WireFormat.FieldType.SINT64.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f34910a[WireFormat.FieldType.ENUM.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f34910a[WireFormat.FieldType.BYTES.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f34910a[WireFormat.FieldType.STRING.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f34910a[WireFormat.FieldType.GROUP.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f34910a[WireFormat.FieldType.MESSAGE.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.b$b */
    /* loaded from: classes2.dex */
    public static final class C4425b {

        /* renamed from: a */
        public int f34911a;

        /* renamed from: b */
        public long f34912b;

        /* renamed from: c */
        public Object f34913c;

        /* renamed from: d */
        public final ExtensionRegistryLite f34914d;

        public C4425b(ExtensionRegistryLite extensionRegistryLite) {
            extensionRegistryLite.getClass();
            this.f34914d = extensionRegistryLite;
        }
    }

    /* renamed from: A */
    public static int m55336A(int i, byte[] bArr, int i2, int i3, Internal.ProtobufList protobufList, C4425b c4425b) {
        C4439k c4439k = (C4439k) protobufList;
        int m55328I = m55328I(bArr, i2, c4425b);
        c4439k.addInt(CodedInputStream.decodeZigZag32(c4425b.f34911a));
        while (m55328I < i3) {
            int m55328I2 = m55328I(bArr, m55328I, c4425b);
            if (i != c4425b.f34911a) {
                break;
            }
            m55328I = m55328I(bArr, m55328I2, c4425b);
            c4439k.addInt(CodedInputStream.decodeZigZag32(c4425b.f34911a));
        }
        return m55328I;
    }

    /* renamed from: B */
    public static int m55335B(int i, byte[] bArr, int i2, int i3, Internal.ProtobufList protobufList, C4425b c4425b) {
        C4444m c4444m = (C4444m) protobufList;
        int m55325L = m55325L(bArr, i2, c4425b);
        c4444m.addLong(CodedInputStream.decodeZigZag64(c4425b.f34912b));
        while (m55325L < i3) {
            int m55328I = m55328I(bArr, m55325L, c4425b);
            if (i != c4425b.f34911a) {
                break;
            }
            m55325L = m55325L(bArr, m55328I, c4425b);
            c4444m.addLong(CodedInputStream.decodeZigZag64(c4425b.f34912b));
        }
        return m55325L;
    }

    /* renamed from: C */
    public static int m55334C(byte[] bArr, int i, C4425b c4425b) {
        int m55328I = m55328I(bArr, i, c4425b);
        int i2 = c4425b.f34911a;
        if (i2 >= 0) {
            if (i2 == 0) {
                c4425b.f34913c = "";
                return m55328I;
            }
            c4425b.f34913c = new String(bArr, m55328I, i2, Internal.f34817a);
            return m55328I + i2;
        }
        throw InvalidProtocolBufferException.negativeSize();
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x001a -> B:37:0x001b). Please submit an issue!!! */
    /* renamed from: D */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int m55333D(int r4, byte[] r5, int r6, int r7, androidx.datastore.preferences.protobuf.Internal.ProtobufList r8, androidx.datastore.preferences.protobuf.AbstractC4423b.C4425b r9) {
        /*
            int r6 = m55328I(r5, r6, r9)
            int r0 = r9.f34911a
            if (r0 < 0) goto L45
            java.lang.String r1 = ""
            if (r0 != 0) goto L10
            r8.add(r1)
            goto L1b
        L10:
            java.lang.String r2 = new java.lang.String
            java.nio.charset.Charset r3 = androidx.datastore.preferences.protobuf.Internal.f34817a
            r2.<init>(r5, r6, r0, r3)
            r8.add(r2)
        L1a:
            int r6 = r6 + r0
        L1b:
            if (r6 >= r7) goto L44
            int r0 = m55328I(r5, r6, r9)
            int r2 = r9.f34911a
            if (r4 == r2) goto L26
            goto L44
        L26:
            int r6 = m55328I(r5, r0, r9)
            int r0 = r9.f34911a
            if (r0 < 0) goto L3f
            if (r0 != 0) goto L34
            r8.add(r1)
            goto L1b
        L34:
            java.lang.String r2 = new java.lang.String
            java.nio.charset.Charset r3 = androidx.datastore.preferences.protobuf.Internal.f34817a
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
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.AbstractC4423b.m55333D(int, byte[], int, int, androidx.datastore.preferences.protobuf.Internal$ProtobufList, androidx.datastore.preferences.protobuf.b$b):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x0025  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x0022 -> B:47:0x0023). Please submit an issue!!! */
    /* renamed from: E */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int m55332E(int r5, byte[] r6, int r7, int r8, androidx.datastore.preferences.protobuf.Internal.ProtobufList r9, androidx.datastore.preferences.protobuf.AbstractC4423b.C4425b r10) {
        /*
            int r7 = m55328I(r6, r7, r10)
            int r0 = r10.f34911a
            if (r0 < 0) goto L5f
            java.lang.String r1 = ""
            if (r0 != 0) goto L10
            r9.add(r1)
            goto L23
        L10:
            int r2 = r7 + r0
            boolean r3 = androidx.datastore.preferences.protobuf.Utf8.m55422u(r6, r7, r2)
            if (r3 == 0) goto L5a
            java.lang.String r3 = new java.lang.String
            java.nio.charset.Charset r4 = androidx.datastore.preferences.protobuf.Internal.f34817a
            r3.<init>(r6, r7, r0, r4)
            r9.add(r3)
        L22:
            r7 = r2
        L23:
            if (r7 >= r8) goto L59
            int r0 = m55328I(r6, r7, r10)
            int r2 = r10.f34911a
            if (r5 == r2) goto L2e
            goto L59
        L2e:
            int r7 = m55328I(r6, r0, r10)
            int r0 = r10.f34911a
            if (r0 < 0) goto L54
            if (r0 != 0) goto L3c
            r9.add(r1)
            goto L23
        L3c:
            int r2 = r7 + r0
            boolean r3 = androidx.datastore.preferences.protobuf.Utf8.m55422u(r6, r7, r2)
            if (r3 == 0) goto L4f
            java.lang.String r3 = new java.lang.String
            java.nio.charset.Charset r4 = androidx.datastore.preferences.protobuf.Internal.f34817a
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
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.AbstractC4423b.m55332E(int, byte[], int, int, androidx.datastore.preferences.protobuf.Internal$ProtobufList, androidx.datastore.preferences.protobuf.b$b):int");
    }

    /* renamed from: F */
    public static int m55331F(byte[] bArr, int i, C4425b c4425b) {
        int m55328I = m55328I(bArr, i, c4425b);
        int i2 = c4425b.f34911a;
        if (i2 >= 0) {
            if (i2 == 0) {
                c4425b.f34913c = "";
                return m55328I;
            }
            c4425b.f34913c = Utf8.m55435h(bArr, m55328I, i2);
            return m55328I + i2;
        }
        throw InvalidProtocolBufferException.negativeSize();
    }

    /* renamed from: G */
    public static int m55330G(int i, byte[] bArr, int i2, int i3, UnknownFieldSetLite unknownFieldSetLite, C4425b c4425b) {
        if (WireFormat.getTagFieldNumber(i) != 0) {
            int tagWireType = WireFormat.getTagWireType(i);
            if (tagWireType != 0) {
                if (tagWireType != 1) {
                    if (tagWireType != 2) {
                        if (tagWireType != 3) {
                            if (tagWireType == 5) {
                                unknownFieldSetLite.m55451n(i, Integer.valueOf(m55315h(bArr, i2)));
                                return i2 + 4;
                            }
                            throw InvalidProtocolBufferException.invalidTag();
                        }
                        UnknownFieldSetLite m55453l = UnknownFieldSetLite.m55453l();
                        int i4 = (i & (-8)) | 4;
                        int i5 = 0;
                        while (true) {
                            if (i2 >= i3) {
                                break;
                            }
                            int m55328I = m55328I(bArr, i2, c4425b);
                            int i6 = c4425b.f34911a;
                            if (i6 == i4) {
                                i5 = i6;
                                i2 = m55328I;
                                break;
                            }
                            i5 = i6;
                            i2 = m55330G(i6, bArr, m55328I, i3, m55453l, c4425b);
                        }
                        if (i2 <= i3 && i5 == i4) {
                            unknownFieldSetLite.m55451n(i, m55453l);
                            return i2;
                        }
                        throw InvalidProtocolBufferException.parseFailure();
                    }
                    int m55328I2 = m55328I(bArr, i2, c4425b);
                    int i7 = c4425b.f34911a;
                    if (i7 >= 0) {
                        if (i7 <= bArr.length - m55328I2) {
                            if (i7 == 0) {
                                unknownFieldSetLite.m55451n(i, ByteString.EMPTY);
                            } else {
                                unknownFieldSetLite.m55451n(i, ByteString.copyFrom(bArr, m55328I2, i7));
                            }
                            return m55328I2 + i7;
                        }
                        throw InvalidProtocolBufferException.truncatedMessage();
                    }
                    throw InvalidProtocolBufferException.negativeSize();
                }
                unknownFieldSetLite.m55451n(i, Long.valueOf(m55313j(bArr, i2)));
                return i2 + 8;
            }
            int m55325L = m55325L(bArr, i2, c4425b);
            unknownFieldSetLite.m55451n(i, Long.valueOf(c4425b.f34912b));
            return m55325L;
        }
        throw InvalidProtocolBufferException.invalidTag();
    }

    /* renamed from: H */
    public static int m55329H(int i, byte[] bArr, int i2, C4425b c4425b) {
        int i3 = i & 127;
        int i4 = i2 + 1;
        byte b = bArr[i2];
        if (b >= 0) {
            c4425b.f34911a = i3 | (b << 7);
            return i4;
        }
        int i5 = i3 | ((b & Byte.MAX_VALUE) << 7);
        int i6 = i2 + 2;
        byte b2 = bArr[i4];
        if (b2 >= 0) {
            c4425b.f34911a = i5 | (b2 << 14);
            return i6;
        }
        int i7 = i5 | ((b2 & Byte.MAX_VALUE) << 14);
        int i8 = i2 + 3;
        byte b3 = bArr[i6];
        if (b3 >= 0) {
            c4425b.f34911a = i7 | (b3 << Ascii.NAK);
            return i8;
        }
        int i9 = i7 | ((b3 & Byte.MAX_VALUE) << 21);
        int i10 = i2 + 4;
        byte b4 = bArr[i8];
        if (b4 >= 0) {
            c4425b.f34911a = i9 | (b4 << Ascii.f52686FS);
            return i10;
        }
        int i11 = i9 | ((b4 & Byte.MAX_VALUE) << 28);
        while (true) {
            int i12 = i10 + 1;
            if (bArr[i10] < 0) {
                i10 = i12;
            } else {
                c4425b.f34911a = i11;
                return i12;
            }
        }
    }

    /* renamed from: I */
    public static int m55328I(byte[] bArr, int i, C4425b c4425b) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b >= 0) {
            c4425b.f34911a = b;
            return i2;
        }
        return m55329H(b, bArr, i2, c4425b);
    }

    /* renamed from: J */
    public static int m55327J(int i, byte[] bArr, int i2, int i3, Internal.ProtobufList protobufList, C4425b c4425b) {
        C4439k c4439k = (C4439k) protobufList;
        int m55328I = m55328I(bArr, i2, c4425b);
        c4439k.addInt(c4425b.f34911a);
        while (m55328I < i3) {
            int m55328I2 = m55328I(bArr, m55328I, c4425b);
            if (i != c4425b.f34911a) {
                break;
            }
            m55328I = m55328I(bArr, m55328I2, c4425b);
            c4439k.addInt(c4425b.f34911a);
        }
        return m55328I;
    }

    /* renamed from: K */
    public static int m55326K(long j, byte[] bArr, int i, C4425b c4425b) {
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
        c4425b.f34912b = j2;
        return i2;
    }

    /* renamed from: L */
    public static int m55325L(byte[] bArr, int i, C4425b c4425b) {
        int i2 = i + 1;
        long j = bArr[i];
        if (j >= 0) {
            c4425b.f34912b = j;
            return i2;
        }
        return m55326K(j, bArr, i2, c4425b);
    }

    /* renamed from: M */
    public static int m55324M(int i, byte[] bArr, int i2, int i3, Internal.ProtobufList protobufList, C4425b c4425b) {
        C4444m c4444m = (C4444m) protobufList;
        int m55325L = m55325L(bArr, i2, c4425b);
        c4444m.addLong(c4425b.f34912b);
        while (m55325L < i3) {
            int m55328I = m55328I(bArr, m55325L, c4425b);
            if (i != c4425b.f34911a) {
                break;
            }
            m55325L = m55325L(bArr, m55328I, c4425b);
            c4444m.addLong(c4425b.f34912b);
        }
        return m55325L;
    }

    /* renamed from: N */
    public static int m55323N(int i, byte[] bArr, int i2, int i3, C4425b c4425b) {
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
                            i2 = m55328I(bArr, i2, c4425b);
                            i5 = c4425b.f34911a;
                            if (i5 == i4) {
                                break;
                            }
                            i2 = m55323N(i5, bArr, i2, i3, c4425b);
                        }
                        if (i2 <= i3 && i5 == i4) {
                            return i2;
                        }
                        throw InvalidProtocolBufferException.parseFailure();
                    }
                    return m55328I(bArr, i2, c4425b) + c4425b.f34911a;
                }
                return i2 + 8;
            }
            return m55325L(bArr, i2, c4425b);
        }
        throw InvalidProtocolBufferException.invalidTag();
    }

    /* renamed from: a */
    public static int m55322a(int i, byte[] bArr, int i2, int i3, Internal.ProtobufList protobufList, C4425b c4425b) {
        boolean z;
        boolean z2;
        C4429d c4429d = (C4429d) protobufList;
        int m55325L = m55325L(bArr, i2, c4425b);
        if (c4425b.f34912b != 0) {
            z = true;
        } else {
            z = false;
        }
        c4429d.addBoolean(z);
        while (m55325L < i3) {
            int m55328I = m55328I(bArr, m55325L, c4425b);
            if (i != c4425b.f34911a) {
                break;
            }
            m55325L = m55325L(bArr, m55328I, c4425b);
            if (c4425b.f34912b != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            c4429d.addBoolean(z2);
        }
        return m55325L;
    }

    /* renamed from: b */
    public static int m55321b(byte[] bArr, int i, C4425b c4425b) {
        int m55328I = m55328I(bArr, i, c4425b);
        int i2 = c4425b.f34911a;
        if (i2 >= 0) {
            if (i2 <= bArr.length - m55328I) {
                if (i2 == 0) {
                    c4425b.f34913c = ByteString.EMPTY;
                    return m55328I;
                }
                c4425b.f34913c = ByteString.copyFrom(bArr, m55328I, i2);
                return m55328I + i2;
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        throw InvalidProtocolBufferException.negativeSize();
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x001b -> B:46:0x001c). Please submit an issue!!! */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int m55320c(int r2, byte[] r3, int r4, int r5, androidx.datastore.preferences.protobuf.Internal.ProtobufList r6, androidx.datastore.preferences.protobuf.AbstractC4423b.C4425b r7) {
        /*
            int r4 = m55328I(r3, r4, r7)
            int r0 = r7.f34911a
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
            int r0 = m55328I(r3, r4, r7)
            int r1 = r7.f34911a
            if (r2 == r1) goto L27
            goto L4d
        L27:
            int r4 = m55328I(r3, r0, r7)
            int r0 = r7.f34911a
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
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.AbstractC4423b.m55320c(int, byte[], int, int, androidx.datastore.preferences.protobuf.Internal$ProtobufList, androidx.datastore.preferences.protobuf.b$b):int");
    }

    /* renamed from: d */
    public static double m55319d(byte[] bArr, int i) {
        return Double.longBitsToDouble(m55313j(bArr, i));
    }

    /* renamed from: e */
    public static int m55318e(int i, byte[] bArr, int i2, int i3, Internal.ProtobufList protobufList, C4425b c4425b) {
        C4434g c4434g = (C4434g) protobufList;
        c4434g.addDouble(m55319d(bArr, i2));
        int i4 = i2 + 8;
        while (i4 < i3) {
            int m55328I = m55328I(bArr, i4, c4425b);
            if (i != c4425b.f34911a) {
                break;
            }
            c4434g.addDouble(m55319d(bArr, m55328I));
            i4 = m55328I + 8;
        }
        return i4;
    }

    /* renamed from: f */
    public static int m55317f(int i, byte[] bArr, int i2, int i3, GeneratedMessageLite.ExtendableMessage extendableMessage, GeneratedMessageLite.GeneratedExtension generatedExtension, AbstractC4466y abstractC4466y, C4425b c4425b) {
        boolean z;
        Object m55794j;
        FieldSet fieldSet = extendableMessage.extensions;
        int i4 = i >>> 3;
        Object obj = null;
        if (generatedExtension.f34808d.isRepeated() && generatedExtension.f34808d.isPacked()) {
            switch (C4424a.f34910a[generatedExtension.getLiteType().ordinal()]) {
                case 1:
                    C4434g c4434g = new C4434g();
                    int m55304s = m55304s(bArr, i2, c4434g, c4425b);
                    fieldSet.m55809C(generatedExtension.f34808d, c4434g);
                    return m55304s;
                case 2:
                    C4438j c4438j = new C4438j();
                    int m55301v = m55301v(bArr, i2, c4438j, c4425b);
                    fieldSet.m55809C(generatedExtension.f34808d, c4438j);
                    return m55301v;
                case 3:
                case 4:
                    C4444m c4444m = new C4444m();
                    int m55297z = m55297z(bArr, i2, c4444m, c4425b);
                    fieldSet.m55809C(generatedExtension.f34808d, c4444m);
                    return m55297z;
                case 5:
                case 6:
                    C4439k c4439k = new C4439k();
                    int m55298y = m55298y(bArr, i2, c4439k, c4425b);
                    fieldSet.m55809C(generatedExtension.f34808d, c4439k);
                    return m55298y;
                case 7:
                case 8:
                    C4444m c4444m2 = new C4444m();
                    int m55302u = m55302u(bArr, i2, c4444m2, c4425b);
                    fieldSet.m55809C(generatedExtension.f34808d, c4444m2);
                    return m55302u;
                case 9:
                case 10:
                    C4439k c4439k2 = new C4439k();
                    int m55303t = m55303t(bArr, i2, c4439k2, c4425b);
                    fieldSet.m55809C(generatedExtension.f34808d, c4439k2);
                    return m55303t;
                case 11:
                    C4429d c4429d = new C4429d();
                    int m55305r = m55305r(bArr, i2, c4429d, c4425b);
                    fieldSet.m55809C(generatedExtension.f34808d, c4429d);
                    return m55305r;
                case 12:
                    C4439k c4439k3 = new C4439k();
                    int m55300w = m55300w(bArr, i2, c4439k3, c4425b);
                    fieldSet.m55809C(generatedExtension.f34808d, c4439k3);
                    return m55300w;
                case 13:
                    C4444m c4444m3 = new C4444m();
                    int m55299x = m55299x(bArr, i2, c4444m3, c4425b);
                    fieldSet.m55809C(generatedExtension.f34808d, c4444m3);
                    return m55299x;
                case 14:
                    C4439k c4439k4 = new C4439k();
                    int m55298y2 = m55298y(bArr, i2, c4439k4, c4425b);
                    UnknownFieldSetLite unknownFieldSetLite = extendableMessage.unknownFields;
                    if (unknownFieldSetLite != UnknownFieldSetLite.getDefaultInstance()) {
                        obj = unknownFieldSetLite;
                    }
                    UnknownFieldSetLite unknownFieldSetLite2 = (UnknownFieldSetLite) AbstractC4455w.m54957z(i4, c4439k4, generatedExtension.f34808d.getEnumType(), obj, abstractC4466y);
                    if (unknownFieldSetLite2 != null) {
                        extendableMessage.unknownFields = unknownFieldSetLite2;
                    }
                    fieldSet.m55809C(generatedExtension.f34808d, c4439k4);
                    return m55298y2;
                default:
                    throw new IllegalStateException("Type cannot be packed: " + generatedExtension.f34808d.getLiteType());
            }
        }
        if (generatedExtension.getLiteType() == WireFormat.FieldType.ENUM) {
            i2 = m55328I(bArr, i2, c4425b);
            if (generatedExtension.f34808d.getEnumType().findValueByNumber(c4425b.f34911a) == null) {
                UnknownFieldSetLite unknownFieldSetLite3 = extendableMessage.unknownFields;
                if (unknownFieldSetLite3 == UnknownFieldSetLite.getDefaultInstance()) {
                    unknownFieldSetLite3 = UnknownFieldSetLite.m55453l();
                    extendableMessage.unknownFields = unknownFieldSetLite3;
                }
                AbstractC4455w.m55002L(i4, c4425b.f34911a, unknownFieldSetLite3, abstractC4466y);
                return i2;
            }
            obj = Integer.valueOf(c4425b.f34911a);
        } else {
            switch (C4424a.f34910a[generatedExtension.getLiteType().ordinal()]) {
                case 1:
                    obj = Double.valueOf(m55319d(bArr, i2));
                    i2 += 8;
                    break;
                case 2:
                    obj = Float.valueOf(m55311l(bArr, i2));
                    i2 += 4;
                    break;
                case 3:
                case 4:
                    i2 = m55325L(bArr, i2, c4425b);
                    obj = Long.valueOf(c4425b.f34912b);
                    break;
                case 5:
                case 6:
                    i2 = m55328I(bArr, i2, c4425b);
                    obj = Integer.valueOf(c4425b.f34911a);
                    break;
                case 7:
                case 8:
                    obj = Long.valueOf(m55313j(bArr, i2));
                    i2 += 8;
                    break;
                case 9:
                case 10:
                    obj = Integer.valueOf(m55315h(bArr, i2));
                    i2 += 4;
                    break;
                case 11:
                    i2 = m55325L(bArr, i2, c4425b);
                    if (c4425b.f34912b != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    obj = Boolean.valueOf(z);
                    break;
                case 12:
                    i2 = m55328I(bArr, i2, c4425b);
                    obj = Integer.valueOf(CodedInputStream.decodeZigZag32(c4425b.f34911a));
                    break;
                case 13:
                    i2 = m55325L(bArr, i2, c4425b);
                    obj = Long.valueOf(CodedInputStream.decodeZigZag64(c4425b.f34912b));
                    break;
                case 14:
                    throw new IllegalStateException("Shouldn't reach here.");
                case 15:
                    i2 = m55321b(bArr, i2, c4425b);
                    obj = c4425b.f34913c;
                    break;
                case 16:
                    i2 = m55334C(bArr, i2, c4425b);
                    obj = c4425b.f34913c;
                    break;
                case 17:
                    i2 = m55309n(C17942Ko1.m67586a().m67583d(generatedExtension.getMessageDefaultInstance().getClass()), bArr, i2, i3, (i4 << 3) | 4, c4425b);
                    obj = c4425b.f34913c;
                    break;
                case 18:
                    i2 = m55307p(C17942Ko1.m67586a().m67583d(generatedExtension.getMessageDefaultInstance().getClass()), bArr, i2, i3, c4425b);
                    obj = c4425b.f34913c;
                    break;
            }
        }
        if (generatedExtension.isRepeated()) {
            fieldSet.m55803a(generatedExtension.f34808d, obj);
        } else {
            int i5 = C4424a.f34910a[generatedExtension.getLiteType().ordinal()];
            if ((i5 == 17 || i5 == 18) && (m55794j = fieldSet.m55794j(generatedExtension.f34808d)) != null) {
                obj = Internal.m55727d(m55794j, obj);
            }
            fieldSet.m55809C(generatedExtension.f34808d, obj);
        }
        return i2;
    }

    /* renamed from: g */
    public static int m55316g(int i, byte[] bArr, int i2, int i3, Object obj, MessageLite messageLite, AbstractC4466y abstractC4466y, C4425b c4425b) {
        GeneratedMessageLite.GeneratedExtension findLiteExtensionByNumber = c4425b.f34914d.findLiteExtensionByNumber(messageLite, i >>> 3);
        if (findLiteExtensionByNumber == null) {
            return m55330G(i, bArr, i2, i3, C4448q.m55079v(obj), c4425b);
        }
        GeneratedMessageLite.ExtendableMessage extendableMessage = (GeneratedMessageLite.ExtendableMessage) obj;
        extendableMessage.m55753r();
        return m55317f(i, bArr, i2, i3, extendableMessage, findLiteExtensionByNumber, abstractC4466y, c4425b);
    }

    /* renamed from: h */
    public static int m55315h(byte[] bArr, int i) {
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    /* renamed from: i */
    public static int m55314i(int i, byte[] bArr, int i2, int i3, Internal.ProtobufList protobufList, C4425b c4425b) {
        C4439k c4439k = (C4439k) protobufList;
        c4439k.addInt(m55315h(bArr, i2));
        int i4 = i2 + 4;
        while (i4 < i3) {
            int m55328I = m55328I(bArr, i4, c4425b);
            if (i != c4425b.f34911a) {
                break;
            }
            c4439k.addInt(m55315h(bArr, m55328I));
            i4 = m55328I + 4;
        }
        return i4;
    }

    /* renamed from: j */
    public static long m55313j(byte[] bArr, int i) {
        return ((bArr[i + 7] & 255) << 56) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48);
    }

    /* renamed from: k */
    public static int m55312k(int i, byte[] bArr, int i2, int i3, Internal.ProtobufList protobufList, C4425b c4425b) {
        C4444m c4444m = (C4444m) protobufList;
        c4444m.addLong(m55313j(bArr, i2));
        int i4 = i2 + 8;
        while (i4 < i3) {
            int m55328I = m55328I(bArr, i4, c4425b);
            if (i != c4425b.f34911a) {
                break;
            }
            c4444m.addLong(m55313j(bArr, m55328I));
            i4 = m55328I + 8;
        }
        return i4;
    }

    /* renamed from: l */
    public static float m55311l(byte[] bArr, int i) {
        return Float.intBitsToFloat(m55315h(bArr, i));
    }

    /* renamed from: m */
    public static int m55310m(int i, byte[] bArr, int i2, int i3, Internal.ProtobufList protobufList, C4425b c4425b) {
        C4438j c4438j = (C4438j) protobufList;
        c4438j.addFloat(m55311l(bArr, i2));
        int i4 = i2 + 4;
        while (i4 < i3) {
            int m55328I = m55328I(bArr, i4, c4425b);
            if (i != c4425b.f34911a) {
                break;
            }
            c4438j.addFloat(m55311l(bArr, m55328I));
            i4 = m55328I + 4;
        }
        return i4;
    }

    /* renamed from: n */
    public static int m55309n(InterfaceC4454v interfaceC4454v, byte[] bArr, int i, int i2, int i3, C4425b c4425b) {
        C4448q c4448q = (C4448q) interfaceC4454v;
        Object newInstance = c4448q.newInstance();
        int m55110c0 = c4448q.m55110c0(newInstance, bArr, i, i2, i3, c4425b);
        c4448q.mo55018e(newInstance);
        c4425b.f34913c = newInstance;
        return m55110c0;
    }

    /* renamed from: o */
    public static int m55308o(InterfaceC4454v interfaceC4454v, int i, byte[] bArr, int i2, int i3, Internal.ProtobufList protobufList, C4425b c4425b) {
        int i4 = (i & (-8)) | 4;
        int m55309n = m55309n(interfaceC4454v, bArr, i2, i3, i4, c4425b);
        protobufList.add(c4425b.f34913c);
        while (m55309n < i3) {
            int m55328I = m55328I(bArr, m55309n, c4425b);
            if (i != c4425b.f34911a) {
                break;
            }
            m55309n = m55309n(interfaceC4454v, bArr, m55328I, i3, i4, c4425b);
            protobufList.add(c4425b.f34913c);
        }
        return m55309n;
    }

    /* renamed from: p */
    public static int m55307p(InterfaceC4454v interfaceC4454v, byte[] bArr, int i, int i2, C4425b c4425b) {
        int i3 = i + 1;
        int i4 = bArr[i];
        if (i4 < 0) {
            i3 = m55329H(i4, bArr, i3, c4425b);
            i4 = c4425b.f34911a;
        }
        int i5 = i3;
        if (i4 >= 0 && i4 <= i2 - i5) {
            Object newInstance = interfaceC4454v.newInstance();
            int i6 = i4 + i5;
            interfaceC4454v.mo55014i(newInstance, bArr, i5, i6, c4425b);
            interfaceC4454v.mo55018e(newInstance);
            c4425b.f34913c = newInstance;
            return i6;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    /* renamed from: q */
    public static int m55306q(InterfaceC4454v interfaceC4454v, int i, byte[] bArr, int i2, int i3, Internal.ProtobufList protobufList, C4425b c4425b) {
        int m55307p = m55307p(interfaceC4454v, bArr, i2, i3, c4425b);
        protobufList.add(c4425b.f34913c);
        while (m55307p < i3) {
            int m55328I = m55328I(bArr, m55307p, c4425b);
            if (i != c4425b.f34911a) {
                break;
            }
            m55307p = m55307p(interfaceC4454v, bArr, m55328I, i3, c4425b);
            protobufList.add(c4425b.f34913c);
        }
        return m55307p;
    }

    /* renamed from: r */
    public static int m55305r(byte[] bArr, int i, Internal.ProtobufList protobufList, C4425b c4425b) {
        boolean z;
        C4429d c4429d = (C4429d) protobufList;
        int m55328I = m55328I(bArr, i, c4425b);
        int i2 = c4425b.f34911a + m55328I;
        while (m55328I < i2) {
            m55328I = m55325L(bArr, m55328I, c4425b);
            if (c4425b.f34912b != 0) {
                z = true;
            } else {
                z = false;
            }
            c4429d.addBoolean(z);
        }
        if (m55328I == i2) {
            return m55328I;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    /* renamed from: s */
    public static int m55304s(byte[] bArr, int i, Internal.ProtobufList protobufList, C4425b c4425b) {
        C4434g c4434g = (C4434g) protobufList;
        int m55328I = m55328I(bArr, i, c4425b);
        int i2 = c4425b.f34911a + m55328I;
        while (m55328I < i2) {
            c4434g.addDouble(m55319d(bArr, m55328I));
            m55328I += 8;
        }
        if (m55328I == i2) {
            return m55328I;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    /* renamed from: t */
    public static int m55303t(byte[] bArr, int i, Internal.ProtobufList protobufList, C4425b c4425b) {
        C4439k c4439k = (C4439k) protobufList;
        int m55328I = m55328I(bArr, i, c4425b);
        int i2 = c4425b.f34911a + m55328I;
        while (m55328I < i2) {
            c4439k.addInt(m55315h(bArr, m55328I));
            m55328I += 4;
        }
        if (m55328I == i2) {
            return m55328I;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    /* renamed from: u */
    public static int m55302u(byte[] bArr, int i, Internal.ProtobufList protobufList, C4425b c4425b) {
        C4444m c4444m = (C4444m) protobufList;
        int m55328I = m55328I(bArr, i, c4425b);
        int i2 = c4425b.f34911a + m55328I;
        while (m55328I < i2) {
            c4444m.addLong(m55313j(bArr, m55328I));
            m55328I += 8;
        }
        if (m55328I == i2) {
            return m55328I;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    /* renamed from: v */
    public static int m55301v(byte[] bArr, int i, Internal.ProtobufList protobufList, C4425b c4425b) {
        C4438j c4438j = (C4438j) protobufList;
        int m55328I = m55328I(bArr, i, c4425b);
        int i2 = c4425b.f34911a + m55328I;
        while (m55328I < i2) {
            c4438j.addFloat(m55311l(bArr, m55328I));
            m55328I += 4;
        }
        if (m55328I == i2) {
            return m55328I;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    /* renamed from: w */
    public static int m55300w(byte[] bArr, int i, Internal.ProtobufList protobufList, C4425b c4425b) {
        C4439k c4439k = (C4439k) protobufList;
        int m55328I = m55328I(bArr, i, c4425b);
        int i2 = c4425b.f34911a + m55328I;
        while (m55328I < i2) {
            m55328I = m55328I(bArr, m55328I, c4425b);
            c4439k.addInt(CodedInputStream.decodeZigZag32(c4425b.f34911a));
        }
        if (m55328I == i2) {
            return m55328I;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    /* renamed from: x */
    public static int m55299x(byte[] bArr, int i, Internal.ProtobufList protobufList, C4425b c4425b) {
        C4444m c4444m = (C4444m) protobufList;
        int m55328I = m55328I(bArr, i, c4425b);
        int i2 = c4425b.f34911a + m55328I;
        while (m55328I < i2) {
            m55328I = m55325L(bArr, m55328I, c4425b);
            c4444m.addLong(CodedInputStream.decodeZigZag64(c4425b.f34912b));
        }
        if (m55328I == i2) {
            return m55328I;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    /* renamed from: y */
    public static int m55298y(byte[] bArr, int i, Internal.ProtobufList protobufList, C4425b c4425b) {
        C4439k c4439k = (C4439k) protobufList;
        int m55328I = m55328I(bArr, i, c4425b);
        int i2 = c4425b.f34911a + m55328I;
        while (m55328I < i2) {
            m55328I = m55328I(bArr, m55328I, c4425b);
            c4439k.addInt(c4425b.f34911a);
        }
        if (m55328I == i2) {
            return m55328I;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    /* renamed from: z */
    public static int m55297z(byte[] bArr, int i, Internal.ProtobufList protobufList, C4425b c4425b) {
        C4444m c4444m = (C4444m) protobufList;
        int m55328I = m55328I(bArr, i, c4425b);
        int i2 = c4425b.f34911a + m55328I;
        while (m55328I < i2) {
            m55328I = m55325L(bArr, m55328I, c4425b);
            c4444m.addLong(c4425b.f34912b);
        }
        if (m55328I == i2) {
            return m55328I;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }
}
