package com.google.protobuf;

import com.google.common.base.Ascii;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.WireFormat;

/* renamed from: com.google.protobuf.b */
/* loaded from: classes4.dex */
public abstract class AbstractC8934b {

    /* renamed from: com.google.protobuf.b$a */
    /* loaded from: classes4.dex */
    public static /* synthetic */ class C8935a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f57451a;

        static {
            int[] iArr = new int[WireFormat.FieldType.values().length];
            f57451a = iArr;
            try {
                iArr[WireFormat.FieldType.DOUBLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f57451a[WireFormat.FieldType.FLOAT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f57451a[WireFormat.FieldType.INT64.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f57451a[WireFormat.FieldType.UINT64.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f57451a[WireFormat.FieldType.INT32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f57451a[WireFormat.FieldType.UINT32.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f57451a[WireFormat.FieldType.FIXED64.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f57451a[WireFormat.FieldType.SFIXED64.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f57451a[WireFormat.FieldType.FIXED32.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f57451a[WireFormat.FieldType.SFIXED32.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f57451a[WireFormat.FieldType.BOOL.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f57451a[WireFormat.FieldType.SINT32.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f57451a[WireFormat.FieldType.SINT64.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f57451a[WireFormat.FieldType.ENUM.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f57451a[WireFormat.FieldType.BYTES.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f57451a[WireFormat.FieldType.STRING.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f57451a[WireFormat.FieldType.GROUP.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f57451a[WireFormat.FieldType.MESSAGE.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
        }
    }

    /* renamed from: com.google.protobuf.b$b */
    /* loaded from: classes4.dex */
    public static final class C8936b {

        /* renamed from: a */
        public int f57452a;

        /* renamed from: b */
        public long f57453b;

        /* renamed from: c */
        public Object f57454c;

        /* renamed from: d */
        public final ExtensionRegistryLite f57455d;

        public C8936b(ExtensionRegistryLite extensionRegistryLite) {
            extensionRegistryLite.getClass();
            this.f57455d = extensionRegistryLite;
        }
    }

    /* renamed from: A */
    public static int m35422A(int i, byte[] bArr, int i2, int i3, Internal.ProtobufList protobufList, C8936b c8936b) {
        C8947j c8947j = (C8947j) protobufList;
        int m35414I = m35414I(bArr, i2, c8936b);
        c8947j.addInt(CodedInputStream.decodeZigZag32(c8936b.f57452a));
        while (m35414I < i3) {
            int m35414I2 = m35414I(bArr, m35414I, c8936b);
            if (i != c8936b.f57452a) {
                break;
            }
            m35414I = m35414I(bArr, m35414I2, c8936b);
            c8947j.addInt(CodedInputStream.decodeZigZag32(c8936b.f57452a));
        }
        return m35414I;
    }

    /* renamed from: B */
    public static int m35421B(int i, byte[] bArr, int i2, int i3, Internal.ProtobufList protobufList, C8936b c8936b) {
        C8952l c8952l = (C8952l) protobufList;
        int m35411L = m35411L(bArr, i2, c8936b);
        c8952l.addLong(CodedInputStream.decodeZigZag64(c8936b.f57453b));
        while (m35411L < i3) {
            int m35414I = m35414I(bArr, m35411L, c8936b);
            if (i != c8936b.f57452a) {
                break;
            }
            m35411L = m35411L(bArr, m35414I, c8936b);
            c8952l.addLong(CodedInputStream.decodeZigZag64(c8936b.f57453b));
        }
        return m35411L;
    }

    /* renamed from: C */
    public static int m35420C(byte[] bArr, int i, C8936b c8936b) {
        int m35414I = m35414I(bArr, i, c8936b);
        int i2 = c8936b.f57452a;
        if (i2 >= 0) {
            if (i2 == 0) {
                c8936b.f57454c = "";
                return m35414I;
            }
            c8936b.f57454c = new String(bArr, m35414I, i2, Internal.f57358b);
            return m35414I + i2;
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
    public static int m35419D(int r4, byte[] r5, int r6, int r7, com.google.protobuf.Internal.ProtobufList r8, com.google.protobuf.AbstractC8934b.C8936b r9) {
        /*
            int r6 = m35414I(r5, r6, r9)
            int r0 = r9.f57452a
            if (r0 < 0) goto L45
            java.lang.String r1 = ""
            if (r0 != 0) goto L10
            r8.add(r1)
            goto L1b
        L10:
            java.lang.String r2 = new java.lang.String
            java.nio.charset.Charset r3 = com.google.protobuf.Internal.f57358b
            r2.<init>(r5, r6, r0, r3)
            r8.add(r2)
        L1a:
            int r6 = r6 + r0
        L1b:
            if (r6 >= r7) goto L44
            int r0 = m35414I(r5, r6, r9)
            int r2 = r9.f57452a
            if (r4 == r2) goto L26
            goto L44
        L26:
            int r6 = m35414I(r5, r0, r9)
            int r0 = r9.f57452a
            if (r0 < 0) goto L3f
            if (r0 != 0) goto L34
            r8.add(r1)
            goto L1b
        L34:
            java.lang.String r2 = new java.lang.String
            java.nio.charset.Charset r3 = com.google.protobuf.Internal.f57358b
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.AbstractC8934b.m35419D(int, byte[], int, int, com.google.protobuf.Internal$ProtobufList, com.google.protobuf.b$b):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x0025  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x0022 -> B:47:0x0023). Please submit an issue!!! */
    /* renamed from: E */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int m35418E(int r5, byte[] r6, int r7, int r8, com.google.protobuf.Internal.ProtobufList r9, com.google.protobuf.AbstractC8934b.C8936b r10) {
        /*
            int r7 = m35414I(r6, r7, r10)
            int r0 = r10.f57452a
            if (r0 < 0) goto L5f
            java.lang.String r1 = ""
            if (r0 != 0) goto L10
            r9.add(r1)
            goto L23
        L10:
            int r2 = r7 + r0
            boolean r3 = com.google.protobuf.Utf8.m35504u(r6, r7, r2)
            if (r3 == 0) goto L5a
            java.lang.String r3 = new java.lang.String
            java.nio.charset.Charset r4 = com.google.protobuf.Internal.f57358b
            r3.<init>(r6, r7, r0, r4)
            r9.add(r3)
        L22:
            r7 = r2
        L23:
            if (r7 >= r8) goto L59
            int r0 = m35414I(r6, r7, r10)
            int r2 = r10.f57452a
            if (r5 == r2) goto L2e
            goto L59
        L2e:
            int r7 = m35414I(r6, r0, r10)
            int r0 = r10.f57452a
            if (r0 < 0) goto L54
            if (r0 != 0) goto L3c
            r9.add(r1)
            goto L23
        L3c:
            int r2 = r7 + r0
            boolean r3 = com.google.protobuf.Utf8.m35504u(r6, r7, r2)
            if (r3 == 0) goto L4f
            java.lang.String r3 = new java.lang.String
            java.nio.charset.Charset r4 = com.google.protobuf.Internal.f57358b
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.AbstractC8934b.m35418E(int, byte[], int, int, com.google.protobuf.Internal$ProtobufList, com.google.protobuf.b$b):int");
    }

    /* renamed from: F */
    public static int m35417F(byte[] bArr, int i, C8936b c8936b) {
        int m35414I = m35414I(bArr, i, c8936b);
        int i2 = c8936b.f57452a;
        if (i2 >= 0) {
            if (i2 == 0) {
                c8936b.f57454c = "";
                return m35414I;
            }
            c8936b.f57454c = Utf8.m35517h(bArr, m35414I, i2);
            return m35414I + i2;
        }
        throw InvalidProtocolBufferException.negativeSize();
    }

    /* renamed from: G */
    public static int m35416G(int i, byte[] bArr, int i2, int i3, UnknownFieldSetLite unknownFieldSetLite, C8936b c8936b) {
        if (WireFormat.getTagFieldNumber(i) != 0) {
            int tagWireType = WireFormat.getTagWireType(i);
            if (tagWireType != 0) {
                if (tagWireType != 1) {
                    if (tagWireType != 2) {
                        if (tagWireType != 3) {
                            if (tagWireType == 5) {
                                unknownFieldSetLite.m35534n(i, Integer.valueOf(m35399h(bArr, i2)));
                                return i2 + 4;
                            }
                            throw InvalidProtocolBufferException.invalidTag();
                        }
                        UnknownFieldSetLite m35537k = UnknownFieldSetLite.m35537k();
                        int i4 = (i & (-8)) | 4;
                        int i5 = 0;
                        while (true) {
                            if (i2 >= i3) {
                                break;
                            }
                            int m35414I = m35414I(bArr, i2, c8936b);
                            int i6 = c8936b.f57452a;
                            if (i6 == i4) {
                                i5 = i6;
                                i2 = m35414I;
                                break;
                            }
                            i5 = i6;
                            i2 = m35416G(i6, bArr, m35414I, i3, m35537k, c8936b);
                        }
                        if (i2 <= i3 && i5 == i4) {
                            unknownFieldSetLite.m35534n(i, m35537k);
                            return i2;
                        }
                        throw InvalidProtocolBufferException.parseFailure();
                    }
                    int m35414I2 = m35414I(bArr, i2, c8936b);
                    int i7 = c8936b.f57452a;
                    if (i7 >= 0) {
                        if (i7 <= bArr.length - m35414I2) {
                            if (i7 == 0) {
                                unknownFieldSetLite.m35534n(i, ByteString.EMPTY);
                            } else {
                                unknownFieldSetLite.m35534n(i, ByteString.copyFrom(bArr, m35414I2, i7));
                            }
                            return m35414I2 + i7;
                        }
                        throw InvalidProtocolBufferException.truncatedMessage();
                    }
                    throw InvalidProtocolBufferException.negativeSize();
                }
                unknownFieldSetLite.m35534n(i, Long.valueOf(m35397j(bArr, i2)));
                return i2 + 8;
            }
            int m35411L = m35411L(bArr, i2, c8936b);
            unknownFieldSetLite.m35534n(i, Long.valueOf(c8936b.f57453b));
            return m35411L;
        }
        throw InvalidProtocolBufferException.invalidTag();
    }

    /* renamed from: H */
    public static int m35415H(int i, byte[] bArr, int i2, C8936b c8936b) {
        int i3 = i & 127;
        int i4 = i2 + 1;
        byte b = bArr[i2];
        if (b >= 0) {
            c8936b.f57452a = i3 | (b << 7);
            return i4;
        }
        int i5 = i3 | ((b & Byte.MAX_VALUE) << 7);
        int i6 = i2 + 2;
        byte b2 = bArr[i4];
        if (b2 >= 0) {
            c8936b.f57452a = i5 | (b2 << 14);
            return i6;
        }
        int i7 = i5 | ((b2 & Byte.MAX_VALUE) << 14);
        int i8 = i2 + 3;
        byte b3 = bArr[i6];
        if (b3 >= 0) {
            c8936b.f57452a = i7 | (b3 << Ascii.NAK);
            return i8;
        }
        int i9 = i7 | ((b3 & Byte.MAX_VALUE) << 21);
        int i10 = i2 + 4;
        byte b4 = bArr[i8];
        if (b4 >= 0) {
            c8936b.f57452a = i9 | (b4 << Ascii.f52686FS);
            return i10;
        }
        int i11 = i9 | ((b4 & Byte.MAX_VALUE) << 28);
        while (true) {
            int i12 = i10 + 1;
            if (bArr[i10] < 0) {
                i10 = i12;
            } else {
                c8936b.f57452a = i11;
                return i12;
            }
        }
    }

    /* renamed from: I */
    public static int m35414I(byte[] bArr, int i, C8936b c8936b) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b >= 0) {
            c8936b.f57452a = b;
            return i2;
        }
        return m35415H(b, bArr, i2, c8936b);
    }

    /* renamed from: J */
    public static int m35413J(int i, byte[] bArr, int i2, int i3, Internal.ProtobufList protobufList, C8936b c8936b) {
        C8947j c8947j = (C8947j) protobufList;
        int m35414I = m35414I(bArr, i2, c8936b);
        c8947j.addInt(c8936b.f57452a);
        while (m35414I < i3) {
            int m35414I2 = m35414I(bArr, m35414I, c8936b);
            if (i != c8936b.f57452a) {
                break;
            }
            m35414I = m35414I(bArr, m35414I2, c8936b);
            c8947j.addInt(c8936b.f57452a);
        }
        return m35414I;
    }

    /* renamed from: K */
    public static int m35412K(long j, byte[] bArr, int i, C8936b c8936b) {
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
        c8936b.f57453b = j2;
        return i2;
    }

    /* renamed from: L */
    public static int m35411L(byte[] bArr, int i, C8936b c8936b) {
        int i2 = i + 1;
        long j = bArr[i];
        if (j >= 0) {
            c8936b.f57453b = j;
            return i2;
        }
        return m35412K(j, bArr, i2, c8936b);
    }

    /* renamed from: M */
    public static int m35410M(int i, byte[] bArr, int i2, int i3, Internal.ProtobufList protobufList, C8936b c8936b) {
        C8952l c8952l = (C8952l) protobufList;
        int m35411L = m35411L(bArr, i2, c8936b);
        c8952l.addLong(c8936b.f57453b);
        while (m35411L < i3) {
            int m35414I = m35414I(bArr, m35411L, c8936b);
            if (i != c8936b.f57452a) {
                break;
            }
            m35411L = m35411L(bArr, m35414I, c8936b);
            c8952l.addLong(c8936b.f57453b);
        }
        return m35411L;
    }

    /* renamed from: N */
    public static int m35409N(Object obj, InterfaceC8961t interfaceC8961t, byte[] bArr, int i, int i2, int i3, C8936b c8936b) {
        int m35206g0 = ((C8956p) interfaceC8961t).m35206g0(obj, bArr, i, i2, i3, c8936b);
        c8936b.f57454c = obj;
        return m35206g0;
    }

    /* renamed from: O */
    public static int m35408O(Object obj, InterfaceC8961t interfaceC8961t, byte[] bArr, int i, int i2, C8936b c8936b) {
        int i3 = i + 1;
        int i4 = bArr[i];
        if (i4 < 0) {
            i3 = m35415H(i4, bArr, i3, c8936b);
            i4 = c8936b.f57452a;
        }
        int i5 = i3;
        if (i4 >= 0 && i4 <= i2 - i5) {
            int i6 = i4 + i5;
            interfaceC8961t.mo35114h(obj, bArr, i5, i6, c8936b);
            c8936b.f57454c = obj;
            return i6;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    /* renamed from: P */
    public static int m35407P(int i, byte[] bArr, int i2, int i3, C8936b c8936b) {
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
                            i2 = m35414I(bArr, i2, c8936b);
                            i5 = c8936b.f57452a;
                            if (i5 == i4) {
                                break;
                            }
                            i2 = m35407P(i5, bArr, i2, i3, c8936b);
                        }
                        if (i2 <= i3 && i5 == i4) {
                            return i2;
                        }
                        throw InvalidProtocolBufferException.parseFailure();
                    }
                    return m35414I(bArr, i2, c8936b) + c8936b.f57452a;
                }
                return i2 + 8;
            }
            return m35411L(bArr, i2, c8936b);
        }
        throw InvalidProtocolBufferException.invalidTag();
    }

    /* renamed from: a */
    public static int m35406a(int i, byte[] bArr, int i2, int i3, Internal.ProtobufList protobufList, C8936b c8936b) {
        boolean z;
        boolean z2;
        C8937c c8937c = (C8937c) protobufList;
        int m35411L = m35411L(bArr, i2, c8936b);
        if (c8936b.f57453b != 0) {
            z = true;
        } else {
            z = false;
        }
        c8937c.addBoolean(z);
        while (m35411L < i3) {
            int m35414I = m35414I(bArr, m35411L, c8936b);
            if (i != c8936b.f57452a) {
                break;
            }
            m35411L = m35411L(bArr, m35414I, c8936b);
            if (c8936b.f57453b != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            c8937c.addBoolean(z2);
        }
        return m35411L;
    }

    /* renamed from: b */
    public static int m35405b(byte[] bArr, int i, C8936b c8936b) {
        int m35414I = m35414I(bArr, i, c8936b);
        int i2 = c8936b.f57452a;
        if (i2 >= 0) {
            if (i2 <= bArr.length - m35414I) {
                if (i2 == 0) {
                    c8936b.f57454c = ByteString.EMPTY;
                    return m35414I;
                }
                c8936b.f57454c = ByteString.copyFrom(bArr, m35414I, i2);
                return m35414I + i2;
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
    public static int m35404c(int r2, byte[] r3, int r4, int r5, com.google.protobuf.Internal.ProtobufList r6, com.google.protobuf.AbstractC8934b.C8936b r7) {
        /*
            int r4 = m35414I(r3, r4, r7)
            int r0 = r7.f57452a
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
            int r0 = m35414I(r3, r4, r7)
            int r1 = r7.f57452a
            if (r2 == r1) goto L27
            goto L4d
        L27:
            int r4 = m35414I(r3, r0, r7)
            int r0 = r7.f57452a
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.AbstractC8934b.m35404c(int, byte[], int, int, com.google.protobuf.Internal$ProtobufList, com.google.protobuf.b$b):int");
    }

    /* renamed from: d */
    public static double m35403d(byte[] bArr, int i) {
        return Double.longBitsToDouble(m35397j(bArr, i));
    }

    /* renamed from: e */
    public static int m35402e(int i, byte[] bArr, int i2, int i3, Internal.ProtobufList protobufList, C8936b c8936b) {
        C8942f c8942f = (C8942f) protobufList;
        c8942f.addDouble(m35403d(bArr, i2));
        int i4 = i2 + 8;
        while (i4 < i3) {
            int m35414I = m35414I(bArr, i4, c8936b);
            if (i != c8936b.f57452a) {
                break;
            }
            c8942f.addDouble(m35403d(bArr, m35414I));
            i4 = m35414I + 8;
        }
        return i4;
    }

    /* renamed from: f */
    public static int m35401f(int i, byte[] bArr, int i2, int i3, GeneratedMessageLite.ExtendableMessage extendableMessage, GeneratedMessageLite.GeneratedExtension generatedExtension, AbstractC8973w abstractC8973w, C8936b c8936b) {
        FieldSet fieldSet = extendableMessage.extensions;
        int i4 = i >>> 3;
        if (generatedExtension.f57348d.isRepeated() && generatedExtension.f57348d.isPacked()) {
            switch (C8935a.f57451a[generatedExtension.getLiteType().ordinal()]) {
                case 1:
                    C8942f c8942f = new C8942f();
                    int m35388s = m35388s(bArr, i2, c8942f, c8936b);
                    fieldSet.m35878D(generatedExtension.f57348d, c8942f);
                    return m35388s;
                case 2:
                    C8946i c8946i = new C8946i();
                    int m35385v = m35385v(bArr, i2, c8946i, c8936b);
                    fieldSet.m35878D(generatedExtension.f57348d, c8946i);
                    return m35385v;
                case 3:
                case 4:
                    C8952l c8952l = new C8952l();
                    int m35381z = m35381z(bArr, i2, c8952l, c8936b);
                    fieldSet.m35878D(generatedExtension.f57348d, c8952l);
                    return m35381z;
                case 5:
                case 6:
                    C8947j c8947j = new C8947j();
                    int m35382y = m35382y(bArr, i2, c8947j, c8936b);
                    fieldSet.m35878D(generatedExtension.f57348d, c8947j);
                    return m35382y;
                case 7:
                case 8:
                    C8952l c8952l2 = new C8952l();
                    int m35386u = m35386u(bArr, i2, c8952l2, c8936b);
                    fieldSet.m35878D(generatedExtension.f57348d, c8952l2);
                    return m35386u;
                case 9:
                case 10:
                    C8947j c8947j2 = new C8947j();
                    int m35387t = m35387t(bArr, i2, c8947j2, c8936b);
                    fieldSet.m35878D(generatedExtension.f57348d, c8947j2);
                    return m35387t;
                case 11:
                    C8937c c8937c = new C8937c();
                    int m35389r = m35389r(bArr, i2, c8937c, c8936b);
                    fieldSet.m35878D(generatedExtension.f57348d, c8937c);
                    return m35389r;
                case 12:
                    C8947j c8947j3 = new C8947j();
                    int m35384w = m35384w(bArr, i2, c8947j3, c8936b);
                    fieldSet.m35878D(generatedExtension.f57348d, c8947j3);
                    return m35384w;
                case 13:
                    C8952l c8952l3 = new C8952l();
                    int m35383x = m35383x(bArr, i2, c8952l3, c8936b);
                    fieldSet.m35878D(generatedExtension.f57348d, c8952l3);
                    return m35383x;
                case 14:
                    C8947j c8947j4 = new C8947j();
                    int m35382y2 = m35382y(bArr, i2, c8947j4, c8936b);
                    AbstractC8962u.m35056z(extendableMessage, i4, c8947j4, generatedExtension.f57348d.getEnumType(), null, abstractC8973w);
                    fieldSet.m35878D(generatedExtension.f57348d, c8947j4);
                    return m35382y2;
                default:
                    throw new IllegalStateException("Type cannot be packed: " + generatedExtension.f57348d.getLiteType());
            }
        }
        Object obj = null;
        if (generatedExtension.getLiteType() == WireFormat.FieldType.ENUM) {
            i2 = m35414I(bArr, i2, c8936b);
            if (generatedExtension.f57348d.getEnumType().findValueByNumber(c8936b.f57452a) == null) {
                AbstractC8962u.m35101L(extendableMessage, i4, c8936b.f57452a, null, abstractC8973w);
                return i2;
            }
            obj = Integer.valueOf(c8936b.f57452a);
        } else {
            switch (C8935a.f57451a[generatedExtension.getLiteType().ordinal()]) {
                case 1:
                    obj = Double.valueOf(m35403d(bArr, i2));
                    i2 += 8;
                    break;
                case 2:
                    obj = Float.valueOf(m35395l(bArr, i2));
                    i2 += 4;
                    break;
                case 3:
                case 4:
                    i2 = m35411L(bArr, i2, c8936b);
                    obj = Long.valueOf(c8936b.f57453b);
                    break;
                case 5:
                case 6:
                    i2 = m35414I(bArr, i2, c8936b);
                    obj = Integer.valueOf(c8936b.f57452a);
                    break;
                case 7:
                case 8:
                    obj = Long.valueOf(m35397j(bArr, i2));
                    i2 += 8;
                    break;
                case 9:
                case 10:
                    obj = Integer.valueOf(m35399h(bArr, i2));
                    i2 += 4;
                    break;
                case 11:
                    i2 = m35411L(bArr, i2, c8936b);
                    obj = Boolean.valueOf(c8936b.f57453b != 0);
                    break;
                case 12:
                    i2 = m35414I(bArr, i2, c8936b);
                    obj = Integer.valueOf(CodedInputStream.decodeZigZag32(c8936b.f57452a));
                    break;
                case 13:
                    i2 = m35411L(bArr, i2, c8936b);
                    obj = Long.valueOf(CodedInputStream.decodeZigZag64(c8936b.f57453b));
                    break;
                case 14:
                    throw new IllegalStateException("Shouldn't reach here.");
                case 15:
                    i2 = m35405b(bArr, i2, c8936b);
                    obj = c8936b.f57454c;
                    break;
                case 16:
                    i2 = m35420C(bArr, i2, c8936b);
                    obj = c8936b.f57454c;
                    break;
                case 17:
                    int i5 = (i4 << 3) | 4;
                    InterfaceC8961t m67677c = C17878Jo1.m67679a().m67677c(generatedExtension.getMessageDefaultInstance().getClass());
                    if (generatedExtension.isRepeated()) {
                        int m35393n = m35393n(m67677c, bArr, i2, i3, i5, c8936b);
                        fieldSet.m35872a(generatedExtension.f57348d, c8936b.f57454c);
                        return m35393n;
                    }
                    Object m35863j = fieldSet.m35863j(generatedExtension.f57348d);
                    if (m35863j == null) {
                        m35863j = m67677c.newInstance();
                        fieldSet.m35878D(generatedExtension.f57348d, m35863j);
                    }
                    return m35409N(m35863j, m67677c, bArr, i2, i3, i5, c8936b);
                case 18:
                    InterfaceC8961t m67677c2 = C17878Jo1.m67679a().m67677c(generatedExtension.getMessageDefaultInstance().getClass());
                    if (generatedExtension.isRepeated()) {
                        int m35391p = m35391p(m67677c2, bArr, i2, i3, c8936b);
                        fieldSet.m35872a(generatedExtension.f57348d, c8936b.f57454c);
                        return m35391p;
                    }
                    Object m35863j2 = fieldSet.m35863j(generatedExtension.f57348d);
                    if (m35863j2 == null) {
                        m35863j2 = m67677c2.newInstance();
                        fieldSet.m35878D(generatedExtension.f57348d, m35863j2);
                    }
                    return m35408O(m35863j2, m67677c2, bArr, i2, i3, c8936b);
            }
        }
        if (generatedExtension.isRepeated()) {
            fieldSet.m35872a(generatedExtension.f57348d, obj);
        } else {
            fieldSet.m35878D(generatedExtension.f57348d, obj);
        }
        return i2;
    }

    /* renamed from: g */
    public static int m35400g(int i, byte[] bArr, int i2, int i3, Object obj, MessageLite messageLite, AbstractC8973w abstractC8973w, C8936b c8936b) {
        GeneratedMessageLite.GeneratedExtension findLiteExtensionByNumber = c8936b.f57455d.findLiteExtensionByNumber(messageLite, i >>> 3);
        if (findLiteExtensionByNumber == null) {
            return m35416G(i, bArr, i2, i3, C8956p.m35177w(obj), c8936b);
        }
        GeneratedMessageLite.ExtendableMessage extendableMessage = (GeneratedMessageLite.ExtendableMessage) obj;
        extendableMessage.m35809C();
        return m35401f(i, bArr, i2, i3, extendableMessage, findLiteExtensionByNumber, abstractC8973w, c8936b);
    }

    /* renamed from: h */
    public static int m35399h(byte[] bArr, int i) {
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    /* renamed from: i */
    public static int m35398i(int i, byte[] bArr, int i2, int i3, Internal.ProtobufList protobufList, C8936b c8936b) {
        C8947j c8947j = (C8947j) protobufList;
        c8947j.addInt(m35399h(bArr, i2));
        int i4 = i2 + 4;
        while (i4 < i3) {
            int m35414I = m35414I(bArr, i4, c8936b);
            if (i != c8936b.f57452a) {
                break;
            }
            c8947j.addInt(m35399h(bArr, m35414I));
            i4 = m35414I + 4;
        }
        return i4;
    }

    /* renamed from: j */
    public static long m35397j(byte[] bArr, int i) {
        return ((bArr[i + 7] & 255) << 56) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48);
    }

    /* renamed from: k */
    public static int m35396k(int i, byte[] bArr, int i2, int i3, Internal.ProtobufList protobufList, C8936b c8936b) {
        C8952l c8952l = (C8952l) protobufList;
        c8952l.addLong(m35397j(bArr, i2));
        int i4 = i2 + 8;
        while (i4 < i3) {
            int m35414I = m35414I(bArr, i4, c8936b);
            if (i != c8936b.f57452a) {
                break;
            }
            c8952l.addLong(m35397j(bArr, m35414I));
            i4 = m35414I + 8;
        }
        return i4;
    }

    /* renamed from: l */
    public static float m35395l(byte[] bArr, int i) {
        return Float.intBitsToFloat(m35399h(bArr, i));
    }

    /* renamed from: m */
    public static int m35394m(int i, byte[] bArr, int i2, int i3, Internal.ProtobufList protobufList, C8936b c8936b) {
        C8946i c8946i = (C8946i) protobufList;
        c8946i.addFloat(m35395l(bArr, i2));
        int i4 = i2 + 4;
        while (i4 < i3) {
            int m35414I = m35414I(bArr, i4, c8936b);
            if (i != c8936b.f57452a) {
                break;
            }
            c8946i.addFloat(m35395l(bArr, m35414I));
            i4 = m35414I + 4;
        }
        return i4;
    }

    /* renamed from: n */
    public static int m35393n(InterfaceC8961t interfaceC8961t, byte[] bArr, int i, int i2, int i3, C8936b c8936b) {
        Object newInstance = interfaceC8961t.newInstance();
        int m35409N = m35409N(newInstance, interfaceC8961t, bArr, i, i2, i3, c8936b);
        interfaceC8961t.mo35117e(newInstance);
        c8936b.f57454c = newInstance;
        return m35409N;
    }

    /* renamed from: o */
    public static int m35392o(InterfaceC8961t interfaceC8961t, int i, byte[] bArr, int i2, int i3, Internal.ProtobufList protobufList, C8936b c8936b) {
        int i4 = (i & (-8)) | 4;
        int m35393n = m35393n(interfaceC8961t, bArr, i2, i3, i4, c8936b);
        protobufList.add(c8936b.f57454c);
        while (m35393n < i3) {
            int m35414I = m35414I(bArr, m35393n, c8936b);
            if (i != c8936b.f57452a) {
                break;
            }
            m35393n = m35393n(interfaceC8961t, bArr, m35414I, i3, i4, c8936b);
            protobufList.add(c8936b.f57454c);
        }
        return m35393n;
    }

    /* renamed from: p */
    public static int m35391p(InterfaceC8961t interfaceC8961t, byte[] bArr, int i, int i2, C8936b c8936b) {
        Object newInstance = interfaceC8961t.newInstance();
        int m35408O = m35408O(newInstance, interfaceC8961t, bArr, i, i2, c8936b);
        interfaceC8961t.mo35117e(newInstance);
        c8936b.f57454c = newInstance;
        return m35408O;
    }

    /* renamed from: q */
    public static int m35390q(InterfaceC8961t interfaceC8961t, int i, byte[] bArr, int i2, int i3, Internal.ProtobufList protobufList, C8936b c8936b) {
        int m35391p = m35391p(interfaceC8961t, bArr, i2, i3, c8936b);
        protobufList.add(c8936b.f57454c);
        while (m35391p < i3) {
            int m35414I = m35414I(bArr, m35391p, c8936b);
            if (i != c8936b.f57452a) {
                break;
            }
            m35391p = m35391p(interfaceC8961t, bArr, m35414I, i3, c8936b);
            protobufList.add(c8936b.f57454c);
        }
        return m35391p;
    }

    /* renamed from: r */
    public static int m35389r(byte[] bArr, int i, Internal.ProtobufList protobufList, C8936b c8936b) {
        boolean z;
        C8937c c8937c = (C8937c) protobufList;
        int m35414I = m35414I(bArr, i, c8936b);
        int i2 = c8936b.f57452a + m35414I;
        while (m35414I < i2) {
            m35414I = m35411L(bArr, m35414I, c8936b);
            if (c8936b.f57453b != 0) {
                z = true;
            } else {
                z = false;
            }
            c8937c.addBoolean(z);
        }
        if (m35414I == i2) {
            return m35414I;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    /* renamed from: s */
    public static int m35388s(byte[] bArr, int i, Internal.ProtobufList protobufList, C8936b c8936b) {
        C8942f c8942f = (C8942f) protobufList;
        int m35414I = m35414I(bArr, i, c8936b);
        int i2 = c8936b.f57452a + m35414I;
        while (m35414I < i2) {
            c8942f.addDouble(m35403d(bArr, m35414I));
            m35414I += 8;
        }
        if (m35414I == i2) {
            return m35414I;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    /* renamed from: t */
    public static int m35387t(byte[] bArr, int i, Internal.ProtobufList protobufList, C8936b c8936b) {
        C8947j c8947j = (C8947j) protobufList;
        int m35414I = m35414I(bArr, i, c8936b);
        int i2 = c8936b.f57452a + m35414I;
        while (m35414I < i2) {
            c8947j.addInt(m35399h(bArr, m35414I));
            m35414I += 4;
        }
        if (m35414I == i2) {
            return m35414I;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    /* renamed from: u */
    public static int m35386u(byte[] bArr, int i, Internal.ProtobufList protobufList, C8936b c8936b) {
        C8952l c8952l = (C8952l) protobufList;
        int m35414I = m35414I(bArr, i, c8936b);
        int i2 = c8936b.f57452a + m35414I;
        while (m35414I < i2) {
            c8952l.addLong(m35397j(bArr, m35414I));
            m35414I += 8;
        }
        if (m35414I == i2) {
            return m35414I;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    /* renamed from: v */
    public static int m35385v(byte[] bArr, int i, Internal.ProtobufList protobufList, C8936b c8936b) {
        C8946i c8946i = (C8946i) protobufList;
        int m35414I = m35414I(bArr, i, c8936b);
        int i2 = c8936b.f57452a + m35414I;
        while (m35414I < i2) {
            c8946i.addFloat(m35395l(bArr, m35414I));
            m35414I += 4;
        }
        if (m35414I == i2) {
            return m35414I;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    /* renamed from: w */
    public static int m35384w(byte[] bArr, int i, Internal.ProtobufList protobufList, C8936b c8936b) {
        C8947j c8947j = (C8947j) protobufList;
        int m35414I = m35414I(bArr, i, c8936b);
        int i2 = c8936b.f57452a + m35414I;
        while (m35414I < i2) {
            m35414I = m35414I(bArr, m35414I, c8936b);
            c8947j.addInt(CodedInputStream.decodeZigZag32(c8936b.f57452a));
        }
        if (m35414I == i2) {
            return m35414I;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    /* renamed from: x */
    public static int m35383x(byte[] bArr, int i, Internal.ProtobufList protobufList, C8936b c8936b) {
        C8952l c8952l = (C8952l) protobufList;
        int m35414I = m35414I(bArr, i, c8936b);
        int i2 = c8936b.f57452a + m35414I;
        while (m35414I < i2) {
            m35414I = m35411L(bArr, m35414I, c8936b);
            c8952l.addLong(CodedInputStream.decodeZigZag64(c8936b.f57453b));
        }
        if (m35414I == i2) {
            return m35414I;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    /* renamed from: y */
    public static int m35382y(byte[] bArr, int i, Internal.ProtobufList protobufList, C8936b c8936b) {
        C8947j c8947j = (C8947j) protobufList;
        int m35414I = m35414I(bArr, i, c8936b);
        int i2 = c8936b.f57452a + m35414I;
        while (m35414I < i2) {
            m35414I = m35414I(bArr, m35414I, c8936b);
            c8947j.addInt(c8936b.f57452a);
        }
        if (m35414I == i2) {
            return m35414I;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    /* renamed from: z */
    public static int m35381z(byte[] bArr, int i, Internal.ProtobufList protobufList, C8936b c8936b) {
        C8952l c8952l = (C8952l) protobufList;
        int m35414I = m35414I(bArr, i, c8936b);
        int i2 = c8936b.f57452a + m35414I;
        while (m35414I < i2) {
            m35414I = m35411L(bArr, m35414I, c8936b);
            c8952l.addLong(c8936b.f57453b);
        }
        if (m35414I == i2) {
            return m35414I;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }
}
