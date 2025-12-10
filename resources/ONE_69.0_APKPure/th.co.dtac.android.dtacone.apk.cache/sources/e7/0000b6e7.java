package com.google.protobuf;

import com.google.common.base.Ascii;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.WireFormat;

/* renamed from: com.google.protobuf.b */
/* loaded from: classes4.dex */
public abstract class AbstractC8923b {

    /* renamed from: com.google.protobuf.b$a */
    /* loaded from: classes4.dex */
    public static /* synthetic */ class C8924a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f57463a;

        static {
            int[] iArr = new int[WireFormat.FieldType.values().length];
            f57463a = iArr;
            try {
                iArr[WireFormat.FieldType.DOUBLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f57463a[WireFormat.FieldType.FLOAT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f57463a[WireFormat.FieldType.INT64.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f57463a[WireFormat.FieldType.UINT64.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f57463a[WireFormat.FieldType.INT32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f57463a[WireFormat.FieldType.UINT32.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f57463a[WireFormat.FieldType.FIXED64.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f57463a[WireFormat.FieldType.SFIXED64.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f57463a[WireFormat.FieldType.FIXED32.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f57463a[WireFormat.FieldType.SFIXED32.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f57463a[WireFormat.FieldType.BOOL.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f57463a[WireFormat.FieldType.SINT32.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f57463a[WireFormat.FieldType.SINT64.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f57463a[WireFormat.FieldType.ENUM.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f57463a[WireFormat.FieldType.BYTES.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f57463a[WireFormat.FieldType.STRING.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f57463a[WireFormat.FieldType.GROUP.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f57463a[WireFormat.FieldType.MESSAGE.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
        }
    }

    /* renamed from: com.google.protobuf.b$b */
    /* loaded from: classes4.dex */
    public static final class C8925b {

        /* renamed from: a */
        public int f57464a;

        /* renamed from: b */
        public long f57465b;

        /* renamed from: c */
        public Object f57466c;

        /* renamed from: d */
        public final ExtensionRegistryLite f57467d;

        public C8925b(ExtensionRegistryLite extensionRegistryLite) {
            extensionRegistryLite.getClass();
            this.f57467d = extensionRegistryLite;
        }
    }

    /* renamed from: A */
    public static int m35414A(int i, byte[] bArr, int i2, int i3, Internal.ProtobufList protobufList, C8925b c8925b) {
        C8936j c8936j = (C8936j) protobufList;
        int m35406I = m35406I(bArr, i2, c8925b);
        c8936j.addInt(CodedInputStream.decodeZigZag32(c8925b.f57464a));
        while (m35406I < i3) {
            int m35406I2 = m35406I(bArr, m35406I, c8925b);
            if (i != c8925b.f57464a) {
                break;
            }
            m35406I = m35406I(bArr, m35406I2, c8925b);
            c8936j.addInt(CodedInputStream.decodeZigZag32(c8925b.f57464a));
        }
        return m35406I;
    }

    /* renamed from: B */
    public static int m35413B(int i, byte[] bArr, int i2, int i3, Internal.ProtobufList protobufList, C8925b c8925b) {
        C8941l c8941l = (C8941l) protobufList;
        int m35403L = m35403L(bArr, i2, c8925b);
        c8941l.addLong(CodedInputStream.decodeZigZag64(c8925b.f57465b));
        while (m35403L < i3) {
            int m35406I = m35406I(bArr, m35403L, c8925b);
            if (i != c8925b.f57464a) {
                break;
            }
            m35403L = m35403L(bArr, m35406I, c8925b);
            c8941l.addLong(CodedInputStream.decodeZigZag64(c8925b.f57465b));
        }
        return m35403L;
    }

    /* renamed from: C */
    public static int m35412C(byte[] bArr, int i, C8925b c8925b) {
        int m35406I = m35406I(bArr, i, c8925b);
        int i2 = c8925b.f57464a;
        if (i2 >= 0) {
            if (i2 == 0) {
                c8925b.f57466c = "";
                return m35406I;
            }
            c8925b.f57466c = new String(bArr, m35406I, i2, Internal.f57370b);
            return m35406I + i2;
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
    public static int m35411D(int r4, byte[] r5, int r6, int r7, com.google.protobuf.Internal.ProtobufList r8, com.google.protobuf.AbstractC8923b.C8925b r9) {
        /*
            int r6 = m35406I(r5, r6, r9)
            int r0 = r9.f57464a
            if (r0 < 0) goto L45
            java.lang.String r1 = ""
            if (r0 != 0) goto L10
            r8.add(r1)
            goto L1b
        L10:
            java.lang.String r2 = new java.lang.String
            java.nio.charset.Charset r3 = com.google.protobuf.Internal.f57370b
            r2.<init>(r5, r6, r0, r3)
            r8.add(r2)
        L1a:
            int r6 = r6 + r0
        L1b:
            if (r6 >= r7) goto L44
            int r0 = m35406I(r5, r6, r9)
            int r2 = r9.f57464a
            if (r4 == r2) goto L26
            goto L44
        L26:
            int r6 = m35406I(r5, r0, r9)
            int r0 = r9.f57464a
            if (r0 < 0) goto L3f
            if (r0 != 0) goto L34
            r8.add(r1)
            goto L1b
        L34:
            java.lang.String r2 = new java.lang.String
            java.nio.charset.Charset r3 = com.google.protobuf.Internal.f57370b
            r2.<init>(r5, r6, r0, r3)
            r8.add(r2)
            goto L1a
        L3f:
            com.google.protobuf.InvalidProtocolBufferException r4 = com.google.protobuf.InvalidProtocolBufferException.negativeSize()
            throw r4
        L44:
            return r6
        L45:
            com.google.protobuf.InvalidProtocolBufferException r4 = com.google.protobuf.InvalidProtocolBufferException.negativeSize()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.AbstractC8923b.m35411D(int, byte[], int, int, com.google.protobuf.Internal$ProtobufList, com.google.protobuf.b$b):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0025  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0023). Please submit an issue!!! */
    /* renamed from: E */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int m35410E(int r5, byte[] r6, int r7, int r8, com.google.protobuf.Internal.ProtobufList r9, com.google.protobuf.AbstractC8923b.C8925b r10) {
        /*
            int r7 = m35406I(r6, r7, r10)
            int r0 = r10.f57464a
            if (r0 < 0) goto L5f
            java.lang.String r1 = ""
            if (r0 != 0) goto L10
            r9.add(r1)
            goto L23
        L10:
            int r2 = r7 + r0
            boolean r3 = com.google.protobuf.Utf8.m35496u(r6, r7, r2)
            if (r3 == 0) goto L5a
            java.lang.String r3 = new java.lang.String
            java.nio.charset.Charset r4 = com.google.protobuf.Internal.f57370b
            r3.<init>(r6, r7, r0, r4)
            r9.add(r3)
        L22:
            r7 = r2
        L23:
            if (r7 >= r8) goto L59
            int r0 = m35406I(r6, r7, r10)
            int r2 = r10.f57464a
            if (r5 == r2) goto L2e
            goto L59
        L2e:
            int r7 = m35406I(r6, r0, r10)
            int r0 = r10.f57464a
            if (r0 < 0) goto L54
            if (r0 != 0) goto L3c
            r9.add(r1)
            goto L23
        L3c:
            int r2 = r7 + r0
            boolean r3 = com.google.protobuf.Utf8.m35496u(r6, r7, r2)
            if (r3 == 0) goto L4f
            java.lang.String r3 = new java.lang.String
            java.nio.charset.Charset r4 = com.google.protobuf.Internal.f57370b
            r3.<init>(r6, r7, r0, r4)
            r9.add(r3)
            goto L22
        L4f:
            com.google.protobuf.InvalidProtocolBufferException r5 = com.google.protobuf.InvalidProtocolBufferException.invalidUtf8()
            throw r5
        L54:
            com.google.protobuf.InvalidProtocolBufferException r5 = com.google.protobuf.InvalidProtocolBufferException.negativeSize()
            throw r5
        L59:
            return r7
        L5a:
            com.google.protobuf.InvalidProtocolBufferException r5 = com.google.protobuf.InvalidProtocolBufferException.invalidUtf8()
            throw r5
        L5f:
            com.google.protobuf.InvalidProtocolBufferException r5 = com.google.protobuf.InvalidProtocolBufferException.negativeSize()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.AbstractC8923b.m35410E(int, byte[], int, int, com.google.protobuf.Internal$ProtobufList, com.google.protobuf.b$b):int");
    }

    /* renamed from: F */
    public static int m35409F(byte[] bArr, int i, C8925b c8925b) {
        int m35406I = m35406I(bArr, i, c8925b);
        int i2 = c8925b.f57464a;
        if (i2 >= 0) {
            if (i2 == 0) {
                c8925b.f57466c = "";
                return m35406I;
            }
            c8925b.f57466c = Utf8.m35509h(bArr, m35406I, i2);
            return m35406I + i2;
        }
        throw InvalidProtocolBufferException.negativeSize();
    }

    /* renamed from: G */
    public static int m35408G(int i, byte[] bArr, int i2, int i3, UnknownFieldSetLite unknownFieldSetLite, C8925b c8925b) {
        if (WireFormat.getTagFieldNumber(i) != 0) {
            int tagWireType = WireFormat.getTagWireType(i);
            if (tagWireType != 0) {
                if (tagWireType != 1) {
                    if (tagWireType != 2) {
                        if (tagWireType != 3) {
                            if (tagWireType == 5) {
                                unknownFieldSetLite.m35526n(i, Integer.valueOf(m35391h(bArr, i2)));
                                return i2 + 4;
                            }
                            throw InvalidProtocolBufferException.invalidTag();
                        }
                        UnknownFieldSetLite m35529k = UnknownFieldSetLite.m35529k();
                        int i4 = (i & (-8)) | 4;
                        int i5 = 0;
                        while (true) {
                            if (i2 >= i3) {
                                break;
                            }
                            int m35406I = m35406I(bArr, i2, c8925b);
                            int i6 = c8925b.f57464a;
                            if (i6 == i4) {
                                i5 = i6;
                                i2 = m35406I;
                                break;
                            }
                            i5 = i6;
                            i2 = m35408G(i6, bArr, m35406I, i3, m35529k, c8925b);
                        }
                        if (i2 <= i3 && i5 == i4) {
                            unknownFieldSetLite.m35526n(i, m35529k);
                            return i2;
                        }
                        throw InvalidProtocolBufferException.parseFailure();
                    }
                    int m35406I2 = m35406I(bArr, i2, c8925b);
                    int i7 = c8925b.f57464a;
                    if (i7 >= 0) {
                        if (i7 <= bArr.length - m35406I2) {
                            if (i7 == 0) {
                                unknownFieldSetLite.m35526n(i, ByteString.EMPTY);
                            } else {
                                unknownFieldSetLite.m35526n(i, ByteString.copyFrom(bArr, m35406I2, i7));
                            }
                            return m35406I2 + i7;
                        }
                        throw InvalidProtocolBufferException.truncatedMessage();
                    }
                    throw InvalidProtocolBufferException.negativeSize();
                }
                unknownFieldSetLite.m35526n(i, Long.valueOf(m35389j(bArr, i2)));
                return i2 + 8;
            }
            int m35403L = m35403L(bArr, i2, c8925b);
            unknownFieldSetLite.m35526n(i, Long.valueOf(c8925b.f57465b));
            return m35403L;
        }
        throw InvalidProtocolBufferException.invalidTag();
    }

    /* renamed from: H */
    public static int m35407H(int i, byte[] bArr, int i2, C8925b c8925b) {
        int i3 = i & 127;
        int i4 = i2 + 1;
        byte b = bArr[i2];
        if (b >= 0) {
            c8925b.f57464a = i3 | (b << 7);
            return i4;
        }
        int i5 = i3 | ((b & Byte.MAX_VALUE) << 7);
        int i6 = i2 + 2;
        byte b2 = bArr[i4];
        if (b2 >= 0) {
            c8925b.f57464a = i5 | (b2 << 14);
            return i6;
        }
        int i7 = i5 | ((b2 & Byte.MAX_VALUE) << 14);
        int i8 = i2 + 3;
        byte b3 = bArr[i6];
        if (b3 >= 0) {
            c8925b.f57464a = i7 | (b3 << Ascii.NAK);
            return i8;
        }
        int i9 = i7 | ((b3 & Byte.MAX_VALUE) << 21);
        int i10 = i2 + 4;
        byte b4 = bArr[i8];
        if (b4 >= 0) {
            c8925b.f57464a = i9 | (b4 << Ascii.f52698FS);
            return i10;
        }
        int i11 = i9 | ((b4 & Byte.MAX_VALUE) << 28);
        while (true) {
            int i12 = i10 + 1;
            if (bArr[i10] < 0) {
                i10 = i12;
            } else {
                c8925b.f57464a = i11;
                return i12;
            }
        }
    }

    /* renamed from: I */
    public static int m35406I(byte[] bArr, int i, C8925b c8925b) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b >= 0) {
            c8925b.f57464a = b;
            return i2;
        }
        return m35407H(b, bArr, i2, c8925b);
    }

    /* renamed from: J */
    public static int m35405J(int i, byte[] bArr, int i2, int i3, Internal.ProtobufList protobufList, C8925b c8925b) {
        C8936j c8936j = (C8936j) protobufList;
        int m35406I = m35406I(bArr, i2, c8925b);
        c8936j.addInt(c8925b.f57464a);
        while (m35406I < i3) {
            int m35406I2 = m35406I(bArr, m35406I, c8925b);
            if (i != c8925b.f57464a) {
                break;
            }
            m35406I = m35406I(bArr, m35406I2, c8925b);
            c8936j.addInt(c8925b.f57464a);
        }
        return m35406I;
    }

    /* renamed from: K */
    public static int m35404K(long j, byte[] bArr, int i, C8925b c8925b) {
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
        c8925b.f57465b = j2;
        return i2;
    }

    /* renamed from: L */
    public static int m35403L(byte[] bArr, int i, C8925b c8925b) {
        int i2 = i + 1;
        long j = bArr[i];
        if (j >= 0) {
            c8925b.f57465b = j;
            return i2;
        }
        return m35404K(j, bArr, i2, c8925b);
    }

    /* renamed from: M */
    public static int m35402M(int i, byte[] bArr, int i2, int i3, Internal.ProtobufList protobufList, C8925b c8925b) {
        C8941l c8941l = (C8941l) protobufList;
        int m35403L = m35403L(bArr, i2, c8925b);
        c8941l.addLong(c8925b.f57465b);
        while (m35403L < i3) {
            int m35406I = m35406I(bArr, m35403L, c8925b);
            if (i != c8925b.f57464a) {
                break;
            }
            m35403L = m35403L(bArr, m35406I, c8925b);
            c8941l.addLong(c8925b.f57465b);
        }
        return m35403L;
    }

    /* renamed from: N */
    public static int m35401N(Object obj, InterfaceC8950t interfaceC8950t, byte[] bArr, int i, int i2, int i3, C8925b c8925b) {
        int m35198g0 = ((C8945p) interfaceC8950t).m35198g0(obj, bArr, i, i2, i3, c8925b);
        c8925b.f57466c = obj;
        return m35198g0;
    }

    /* renamed from: O */
    public static int m35400O(Object obj, InterfaceC8950t interfaceC8950t, byte[] bArr, int i, int i2, C8925b c8925b) {
        int i3 = i + 1;
        int i4 = bArr[i];
        if (i4 < 0) {
            i3 = m35407H(i4, bArr, i3, c8925b);
            i4 = c8925b.f57464a;
        }
        int i5 = i3;
        if (i4 >= 0 && i4 <= i2 - i5) {
            int i6 = i4 + i5;
            interfaceC8950t.mo35106h(obj, bArr, i5, i6, c8925b);
            c8925b.f57466c = obj;
            return i6;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    /* renamed from: P */
    public static int m35399P(int i, byte[] bArr, int i2, int i3, C8925b c8925b) {
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
                            i2 = m35406I(bArr, i2, c8925b);
                            i5 = c8925b.f57464a;
                            if (i5 == i4) {
                                break;
                            }
                            i2 = m35399P(i5, bArr, i2, i3, c8925b);
                        }
                        if (i2 <= i3 && i5 == i4) {
                            return i2;
                        }
                        throw InvalidProtocolBufferException.parseFailure();
                    }
                    return m35406I(bArr, i2, c8925b) + c8925b.f57464a;
                }
                return i2 + 8;
            }
            return m35403L(bArr, i2, c8925b);
        }
        throw InvalidProtocolBufferException.invalidTag();
    }

    /* renamed from: a */
    public static int m35398a(int i, byte[] bArr, int i2, int i3, Internal.ProtobufList protobufList, C8925b c8925b) {
        boolean z;
        boolean z2;
        C8926c c8926c = (C8926c) protobufList;
        int m35403L = m35403L(bArr, i2, c8925b);
        if (c8925b.f57465b != 0) {
            z = true;
        } else {
            z = false;
        }
        c8926c.addBoolean(z);
        while (m35403L < i3) {
            int m35406I = m35406I(bArr, m35403L, c8925b);
            if (i != c8925b.f57464a) {
                break;
            }
            m35403L = m35403L(bArr, m35406I, c8925b);
            if (c8925b.f57465b != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            c8926c.addBoolean(z2);
        }
        return m35403L;
    }

    /* renamed from: b */
    public static int m35397b(byte[] bArr, int i, C8925b c8925b) {
        int m35406I = m35406I(bArr, i, c8925b);
        int i2 = c8925b.f57464a;
        if (i2 >= 0) {
            if (i2 <= bArr.length - m35406I) {
                if (i2 == 0) {
                    c8925b.f57466c = ByteString.EMPTY;
                    return m35406I;
                }
                c8925b.f57466c = ByteString.copyFrom(bArr, m35406I, i2);
                return m35406I + i2;
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
    public static int m35396c(int r2, byte[] r3, int r4, int r5, com.google.protobuf.Internal.ProtobufList r6, com.google.protobuf.AbstractC8923b.C8925b r7) {
        /*
            int r4 = m35406I(r3, r4, r7)
            int r0 = r7.f57464a
            if (r0 < 0) goto L53
            int r1 = r3.length
            int r1 = r1 - r4
            if (r0 > r1) goto L4e
            if (r0 != 0) goto L14
            com.google.protobuf.ByteString r0 = com.google.protobuf.ByteString.EMPTY
            r6.add(r0)
            goto L1c
        L14:
            com.google.protobuf.ByteString r1 = com.google.protobuf.ByteString.copyFrom(r3, r4, r0)
            r6.add(r1)
        L1b:
            int r4 = r4 + r0
        L1c:
            if (r4 >= r5) goto L4d
            int r0 = m35406I(r3, r4, r7)
            int r1 = r7.f57464a
            if (r2 == r1) goto L27
            goto L4d
        L27:
            int r4 = m35406I(r3, r0, r7)
            int r0 = r7.f57464a
            if (r0 < 0) goto L48
            int r1 = r3.length
            int r1 = r1 - r4
            if (r0 > r1) goto L43
            if (r0 != 0) goto L3b
            com.google.protobuf.ByteString r0 = com.google.protobuf.ByteString.EMPTY
            r6.add(r0)
            goto L1c
        L3b:
            com.google.protobuf.ByteString r1 = com.google.protobuf.ByteString.copyFrom(r3, r4, r0)
            r6.add(r1)
            goto L1b
        L43:
            com.google.protobuf.InvalidProtocolBufferException r2 = com.google.protobuf.InvalidProtocolBufferException.truncatedMessage()
            throw r2
        L48:
            com.google.protobuf.InvalidProtocolBufferException r2 = com.google.protobuf.InvalidProtocolBufferException.negativeSize()
            throw r2
        L4d:
            return r4
        L4e:
            com.google.protobuf.InvalidProtocolBufferException r2 = com.google.protobuf.InvalidProtocolBufferException.truncatedMessage()
            throw r2
        L53:
            com.google.protobuf.InvalidProtocolBufferException r2 = com.google.protobuf.InvalidProtocolBufferException.negativeSize()
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.AbstractC8923b.m35396c(int, byte[], int, int, com.google.protobuf.Internal$ProtobufList, com.google.protobuf.b$b):int");
    }

    /* renamed from: d */
    public static double m35395d(byte[] bArr, int i) {
        return Double.longBitsToDouble(m35389j(bArr, i));
    }

    /* renamed from: e */
    public static int m35394e(int i, byte[] bArr, int i2, int i3, Internal.ProtobufList protobufList, C8925b c8925b) {
        C8931f c8931f = (C8931f) protobufList;
        c8931f.addDouble(m35395d(bArr, i2));
        int i4 = i2 + 8;
        while (i4 < i3) {
            int m35406I = m35406I(bArr, i4, c8925b);
            if (i != c8925b.f57464a) {
                break;
            }
            c8931f.addDouble(m35395d(bArr, m35406I));
            i4 = m35406I + 8;
        }
        return i4;
    }

    /* renamed from: f */
    public static int m35393f(int i, byte[] bArr, int i2, int i3, GeneratedMessageLite.ExtendableMessage extendableMessage, GeneratedMessageLite.GeneratedExtension generatedExtension, AbstractC8962w abstractC8962w, C8925b c8925b) {
        FieldSet fieldSet = extendableMessage.extensions;
        int i4 = i >>> 3;
        if (generatedExtension.f57360d.isRepeated() && generatedExtension.f57360d.isPacked()) {
            switch (C8924a.f57463a[generatedExtension.getLiteType().ordinal()]) {
                case 1:
                    C8931f c8931f = new C8931f();
                    int m35380s = m35380s(bArr, i2, c8931f, c8925b);
                    fieldSet.m35870D(generatedExtension.f57360d, c8931f);
                    return m35380s;
                case 2:
                    C8935i c8935i = new C8935i();
                    int m35377v = m35377v(bArr, i2, c8935i, c8925b);
                    fieldSet.m35870D(generatedExtension.f57360d, c8935i);
                    return m35377v;
                case 3:
                case 4:
                    C8941l c8941l = new C8941l();
                    int m35373z = m35373z(bArr, i2, c8941l, c8925b);
                    fieldSet.m35870D(generatedExtension.f57360d, c8941l);
                    return m35373z;
                case 5:
                case 6:
                    C8936j c8936j = new C8936j();
                    int m35374y = m35374y(bArr, i2, c8936j, c8925b);
                    fieldSet.m35870D(generatedExtension.f57360d, c8936j);
                    return m35374y;
                case 7:
                case 8:
                    C8941l c8941l2 = new C8941l();
                    int m35378u = m35378u(bArr, i2, c8941l2, c8925b);
                    fieldSet.m35870D(generatedExtension.f57360d, c8941l2);
                    return m35378u;
                case 9:
                case 10:
                    C8936j c8936j2 = new C8936j();
                    int m35379t = m35379t(bArr, i2, c8936j2, c8925b);
                    fieldSet.m35870D(generatedExtension.f57360d, c8936j2);
                    return m35379t;
                case 11:
                    C8926c c8926c = new C8926c();
                    int m35381r = m35381r(bArr, i2, c8926c, c8925b);
                    fieldSet.m35870D(generatedExtension.f57360d, c8926c);
                    return m35381r;
                case 12:
                    C8936j c8936j3 = new C8936j();
                    int m35376w = m35376w(bArr, i2, c8936j3, c8925b);
                    fieldSet.m35870D(generatedExtension.f57360d, c8936j3);
                    return m35376w;
                case 13:
                    C8941l c8941l3 = new C8941l();
                    int m35375x = m35375x(bArr, i2, c8941l3, c8925b);
                    fieldSet.m35870D(generatedExtension.f57360d, c8941l3);
                    return m35375x;
                case 14:
                    C8936j c8936j4 = new C8936j();
                    int m35374y2 = m35374y(bArr, i2, c8936j4, c8925b);
                    AbstractC8951u.m35048z(extendableMessage, i4, c8936j4, generatedExtension.f57360d.getEnumType(), null, abstractC8962w);
                    fieldSet.m35870D(generatedExtension.f57360d, c8936j4);
                    return m35374y2;
                default:
                    throw new IllegalStateException("Type cannot be packed: " + generatedExtension.f57360d.getLiteType());
            }
        }
        Object obj = null;
        if (generatedExtension.getLiteType() == WireFormat.FieldType.ENUM) {
            i2 = m35406I(bArr, i2, c8925b);
            if (generatedExtension.f57360d.getEnumType().findValueByNumber(c8925b.f57464a) == null) {
                AbstractC8951u.m35093L(extendableMessage, i4, c8925b.f57464a, null, abstractC8962w);
                return i2;
            }
            obj = Integer.valueOf(c8925b.f57464a);
        } else {
            switch (C8924a.f57463a[generatedExtension.getLiteType().ordinal()]) {
                case 1:
                    obj = Double.valueOf(m35395d(bArr, i2));
                    i2 += 8;
                    break;
                case 2:
                    obj = Float.valueOf(m35387l(bArr, i2));
                    i2 += 4;
                    break;
                case 3:
                case 4:
                    i2 = m35403L(bArr, i2, c8925b);
                    obj = Long.valueOf(c8925b.f57465b);
                    break;
                case 5:
                case 6:
                    i2 = m35406I(bArr, i2, c8925b);
                    obj = Integer.valueOf(c8925b.f57464a);
                    break;
                case 7:
                case 8:
                    obj = Long.valueOf(m35389j(bArr, i2));
                    i2 += 8;
                    break;
                case 9:
                case 10:
                    obj = Integer.valueOf(m35391h(bArr, i2));
                    i2 += 4;
                    break;
                case 11:
                    i2 = m35403L(bArr, i2, c8925b);
                    obj = Boolean.valueOf(c8925b.f57465b != 0);
                    break;
                case 12:
                    i2 = m35406I(bArr, i2, c8925b);
                    obj = Integer.valueOf(CodedInputStream.decodeZigZag32(c8925b.f57464a));
                    break;
                case 13:
                    i2 = m35403L(bArr, i2, c8925b);
                    obj = Long.valueOf(CodedInputStream.decodeZigZag64(c8925b.f57465b));
                    break;
                case 14:
                    throw new IllegalStateException("Shouldn't reach here.");
                case 15:
                    i2 = m35397b(bArr, i2, c8925b);
                    obj = c8925b.f57466c;
                    break;
                case 16:
                    i2 = m35412C(bArr, i2, c8925b);
                    obj = c8925b.f57466c;
                    break;
                case 17:
                    int i5 = (i4 << 3) | 4;
                    InterfaceC8950t m68201c = C17718Gp1.m68203a().m68201c(generatedExtension.getMessageDefaultInstance().getClass());
                    if (generatedExtension.isRepeated()) {
                        int m35385n = m35385n(m68201c, bArr, i2, i3, i5, c8925b);
                        fieldSet.m35864a(generatedExtension.f57360d, c8925b.f57466c);
                        return m35385n;
                    }
                    Object m35855j = fieldSet.m35855j(generatedExtension.f57360d);
                    if (m35855j == null) {
                        m35855j = m68201c.newInstance();
                        fieldSet.m35870D(generatedExtension.f57360d, m35855j);
                    }
                    return m35401N(m35855j, m68201c, bArr, i2, i3, i5, c8925b);
                case 18:
                    InterfaceC8950t m68201c2 = C17718Gp1.m68203a().m68201c(generatedExtension.getMessageDefaultInstance().getClass());
                    if (generatedExtension.isRepeated()) {
                        int m35383p = m35383p(m68201c2, bArr, i2, i3, c8925b);
                        fieldSet.m35864a(generatedExtension.f57360d, c8925b.f57466c);
                        return m35383p;
                    }
                    Object m35855j2 = fieldSet.m35855j(generatedExtension.f57360d);
                    if (m35855j2 == null) {
                        m35855j2 = m68201c2.newInstance();
                        fieldSet.m35870D(generatedExtension.f57360d, m35855j2);
                    }
                    return m35400O(m35855j2, m68201c2, bArr, i2, i3, c8925b);
            }
        }
        if (generatedExtension.isRepeated()) {
            fieldSet.m35864a(generatedExtension.f57360d, obj);
        } else {
            fieldSet.m35870D(generatedExtension.f57360d, obj);
        }
        return i2;
    }

    /* renamed from: g */
    public static int m35392g(int i, byte[] bArr, int i2, int i3, Object obj, MessageLite messageLite, AbstractC8962w abstractC8962w, C8925b c8925b) {
        GeneratedMessageLite.GeneratedExtension findLiteExtensionByNumber = c8925b.f57467d.findLiteExtensionByNumber(messageLite, i >>> 3);
        if (findLiteExtensionByNumber == null) {
            return m35408G(i, bArr, i2, i3, C8945p.m35169w(obj), c8925b);
        }
        GeneratedMessageLite.ExtendableMessage extendableMessage = (GeneratedMessageLite.ExtendableMessage) obj;
        extendableMessage.m35801C();
        return m35393f(i, bArr, i2, i3, extendableMessage, findLiteExtensionByNumber, abstractC8962w, c8925b);
    }

    /* renamed from: h */
    public static int m35391h(byte[] bArr, int i) {
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    /* renamed from: i */
    public static int m35390i(int i, byte[] bArr, int i2, int i3, Internal.ProtobufList protobufList, C8925b c8925b) {
        C8936j c8936j = (C8936j) protobufList;
        c8936j.addInt(m35391h(bArr, i2));
        int i4 = i2 + 4;
        while (i4 < i3) {
            int m35406I = m35406I(bArr, i4, c8925b);
            if (i != c8925b.f57464a) {
                break;
            }
            c8936j.addInt(m35391h(bArr, m35406I));
            i4 = m35406I + 4;
        }
        return i4;
    }

    /* renamed from: j */
    public static long m35389j(byte[] bArr, int i) {
        return ((bArr[i + 7] & 255) << 56) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48);
    }

    /* renamed from: k */
    public static int m35388k(int i, byte[] bArr, int i2, int i3, Internal.ProtobufList protobufList, C8925b c8925b) {
        C8941l c8941l = (C8941l) protobufList;
        c8941l.addLong(m35389j(bArr, i2));
        int i4 = i2 + 8;
        while (i4 < i3) {
            int m35406I = m35406I(bArr, i4, c8925b);
            if (i != c8925b.f57464a) {
                break;
            }
            c8941l.addLong(m35389j(bArr, m35406I));
            i4 = m35406I + 8;
        }
        return i4;
    }

    /* renamed from: l */
    public static float m35387l(byte[] bArr, int i) {
        return Float.intBitsToFloat(m35391h(bArr, i));
    }

    /* renamed from: m */
    public static int m35386m(int i, byte[] bArr, int i2, int i3, Internal.ProtobufList protobufList, C8925b c8925b) {
        C8935i c8935i = (C8935i) protobufList;
        c8935i.addFloat(m35387l(bArr, i2));
        int i4 = i2 + 4;
        while (i4 < i3) {
            int m35406I = m35406I(bArr, i4, c8925b);
            if (i != c8925b.f57464a) {
                break;
            }
            c8935i.addFloat(m35387l(bArr, m35406I));
            i4 = m35406I + 4;
        }
        return i4;
    }

    /* renamed from: n */
    public static int m35385n(InterfaceC8950t interfaceC8950t, byte[] bArr, int i, int i2, int i3, C8925b c8925b) {
        Object newInstance = interfaceC8950t.newInstance();
        int m35401N = m35401N(newInstance, interfaceC8950t, bArr, i, i2, i3, c8925b);
        interfaceC8950t.mo35109e(newInstance);
        c8925b.f57466c = newInstance;
        return m35401N;
    }

    /* renamed from: o */
    public static int m35384o(InterfaceC8950t interfaceC8950t, int i, byte[] bArr, int i2, int i3, Internal.ProtobufList protobufList, C8925b c8925b) {
        int i4 = (i & (-8)) | 4;
        int m35385n = m35385n(interfaceC8950t, bArr, i2, i3, i4, c8925b);
        protobufList.add(c8925b.f57466c);
        while (m35385n < i3) {
            int m35406I = m35406I(bArr, m35385n, c8925b);
            if (i != c8925b.f57464a) {
                break;
            }
            m35385n = m35385n(interfaceC8950t, bArr, m35406I, i3, i4, c8925b);
            protobufList.add(c8925b.f57466c);
        }
        return m35385n;
    }

    /* renamed from: p */
    public static int m35383p(InterfaceC8950t interfaceC8950t, byte[] bArr, int i, int i2, C8925b c8925b) {
        Object newInstance = interfaceC8950t.newInstance();
        int m35400O = m35400O(newInstance, interfaceC8950t, bArr, i, i2, c8925b);
        interfaceC8950t.mo35109e(newInstance);
        c8925b.f57466c = newInstance;
        return m35400O;
    }

    /* renamed from: q */
    public static int m35382q(InterfaceC8950t interfaceC8950t, int i, byte[] bArr, int i2, int i3, Internal.ProtobufList protobufList, C8925b c8925b) {
        int m35383p = m35383p(interfaceC8950t, bArr, i2, i3, c8925b);
        protobufList.add(c8925b.f57466c);
        while (m35383p < i3) {
            int m35406I = m35406I(bArr, m35383p, c8925b);
            if (i != c8925b.f57464a) {
                break;
            }
            m35383p = m35383p(interfaceC8950t, bArr, m35406I, i3, c8925b);
            protobufList.add(c8925b.f57466c);
        }
        return m35383p;
    }

    /* renamed from: r */
    public static int m35381r(byte[] bArr, int i, Internal.ProtobufList protobufList, C8925b c8925b) {
        boolean z;
        C8926c c8926c = (C8926c) protobufList;
        int m35406I = m35406I(bArr, i, c8925b);
        int i2 = c8925b.f57464a + m35406I;
        while (m35406I < i2) {
            m35406I = m35403L(bArr, m35406I, c8925b);
            if (c8925b.f57465b != 0) {
                z = true;
            } else {
                z = false;
            }
            c8926c.addBoolean(z);
        }
        if (m35406I == i2) {
            return m35406I;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    /* renamed from: s */
    public static int m35380s(byte[] bArr, int i, Internal.ProtobufList protobufList, C8925b c8925b) {
        C8931f c8931f = (C8931f) protobufList;
        int m35406I = m35406I(bArr, i, c8925b);
        int i2 = c8925b.f57464a + m35406I;
        while (m35406I < i2) {
            c8931f.addDouble(m35395d(bArr, m35406I));
            m35406I += 8;
        }
        if (m35406I == i2) {
            return m35406I;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    /* renamed from: t */
    public static int m35379t(byte[] bArr, int i, Internal.ProtobufList protobufList, C8925b c8925b) {
        C8936j c8936j = (C8936j) protobufList;
        int m35406I = m35406I(bArr, i, c8925b);
        int i2 = c8925b.f57464a + m35406I;
        while (m35406I < i2) {
            c8936j.addInt(m35391h(bArr, m35406I));
            m35406I += 4;
        }
        if (m35406I == i2) {
            return m35406I;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    /* renamed from: u */
    public static int m35378u(byte[] bArr, int i, Internal.ProtobufList protobufList, C8925b c8925b) {
        C8941l c8941l = (C8941l) protobufList;
        int m35406I = m35406I(bArr, i, c8925b);
        int i2 = c8925b.f57464a + m35406I;
        while (m35406I < i2) {
            c8941l.addLong(m35389j(bArr, m35406I));
            m35406I += 8;
        }
        if (m35406I == i2) {
            return m35406I;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    /* renamed from: v */
    public static int m35377v(byte[] bArr, int i, Internal.ProtobufList protobufList, C8925b c8925b) {
        C8935i c8935i = (C8935i) protobufList;
        int m35406I = m35406I(bArr, i, c8925b);
        int i2 = c8925b.f57464a + m35406I;
        while (m35406I < i2) {
            c8935i.addFloat(m35387l(bArr, m35406I));
            m35406I += 4;
        }
        if (m35406I == i2) {
            return m35406I;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    /* renamed from: w */
    public static int m35376w(byte[] bArr, int i, Internal.ProtobufList protobufList, C8925b c8925b) {
        C8936j c8936j = (C8936j) protobufList;
        int m35406I = m35406I(bArr, i, c8925b);
        int i2 = c8925b.f57464a + m35406I;
        while (m35406I < i2) {
            m35406I = m35406I(bArr, m35406I, c8925b);
            c8936j.addInt(CodedInputStream.decodeZigZag32(c8925b.f57464a));
        }
        if (m35406I == i2) {
            return m35406I;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    /* renamed from: x */
    public static int m35375x(byte[] bArr, int i, Internal.ProtobufList protobufList, C8925b c8925b) {
        C8941l c8941l = (C8941l) protobufList;
        int m35406I = m35406I(bArr, i, c8925b);
        int i2 = c8925b.f57464a + m35406I;
        while (m35406I < i2) {
            m35406I = m35403L(bArr, m35406I, c8925b);
            c8941l.addLong(CodedInputStream.decodeZigZag64(c8925b.f57465b));
        }
        if (m35406I == i2) {
            return m35406I;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    /* renamed from: y */
    public static int m35374y(byte[] bArr, int i, Internal.ProtobufList protobufList, C8925b c8925b) {
        C8936j c8936j = (C8936j) protobufList;
        int m35406I = m35406I(bArr, i, c8925b);
        int i2 = c8925b.f57464a + m35406I;
        while (m35406I < i2) {
            m35406I = m35406I(bArr, m35406I, c8925b);
            c8936j.addInt(c8925b.f57464a);
        }
        if (m35406I == i2) {
            return m35406I;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    /* renamed from: z */
    public static int m35373z(byte[] bArr, int i, Internal.ProtobufList protobufList, C8925b c8925b) {
        C8941l c8941l = (C8941l) protobufList;
        int m35406I = m35406I(bArr, i, c8925b);
        int i2 = c8925b.f57464a + m35406I;
        while (m35406I < i2) {
            m35406I = m35403L(bArr, m35406I, c8925b);
            c8941l.addLong(c8925b.f57465b);
        }
        if (m35406I == i2) {
            return m35406I;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }
}