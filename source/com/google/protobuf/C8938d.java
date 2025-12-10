package com.google.protobuf;

import com.google.protobuf.WireFormat;
import java.util.List;

/* renamed from: com.google.protobuf.d */
/* loaded from: classes4.dex */
public final class C8938d implements InterfaceC8960s {

    /* renamed from: a */
    public final CodedInputStream f57459a;

    /* renamed from: b */
    public int f57460b;

    /* renamed from: c */
    public int f57461c;

    /* renamed from: d */
    public int f57462d = 0;

    /* renamed from: com.google.protobuf.d$a */
    /* loaded from: classes4.dex */
    public static /* synthetic */ class C8939a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f57463a;

        static {
            int[] iArr = new int[WireFormat.FieldType.values().length];
            f57463a = iArr;
            try {
                iArr[WireFormat.FieldType.BOOL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f57463a[WireFormat.FieldType.BYTES.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f57463a[WireFormat.FieldType.DOUBLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f57463a[WireFormat.FieldType.ENUM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f57463a[WireFormat.FieldType.FIXED32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f57463a[WireFormat.FieldType.FIXED64.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f57463a[WireFormat.FieldType.FLOAT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f57463a[WireFormat.FieldType.INT32.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f57463a[WireFormat.FieldType.INT64.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f57463a[WireFormat.FieldType.MESSAGE.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f57463a[WireFormat.FieldType.SFIXED32.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f57463a[WireFormat.FieldType.SFIXED64.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f57463a[WireFormat.FieldType.SINT32.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f57463a[WireFormat.FieldType.SINT64.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f57463a[WireFormat.FieldType.STRING.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f57463a[WireFormat.FieldType.UINT32.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f57463a[WireFormat.FieldType.UINT64.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
        }
    }

    public C8938d(CodedInputStream codedInputStream) {
        CodedInputStream codedInputStream2 = (CodedInputStream) Internal.m35785b(codedInputStream, "input");
        this.f57459a = codedInputStream2;
        codedInputStream2.f57212d = this;
    }

    /* renamed from: M */
    public static C8938d m35371M(CodedInputStream codedInputStream) {
        C8938d c8938d = codedInputStream.f57212d;
        if (c8938d != null) {
            return c8938d;
        }
        return new C8938d(codedInputStream);
    }

    @Override // com.google.protobuf.InterfaceC8960s
    /* renamed from: A */
    public void mo35159A(List list) {
        int readTag;
        int readTag2;
        if (list instanceof C8947j) {
            C8947j c8947j = (C8947j) list;
            int tagWireType = WireFormat.getTagWireType(this.f57460b);
            if (tagWireType != 0) {
                if (tagWireType == 2) {
                    int totalBytesRead = this.f57459a.getTotalBytesRead() + this.f57459a.readUInt32();
                    do {
                        c8947j.addInt(this.f57459a.readUInt32());
                    } while (this.f57459a.getTotalBytesRead() < totalBytesRead);
                    m35364T(totalBytesRead);
                    return;
                }
                throw InvalidProtocolBufferException.invalidWireType();
            }
            do {
                c8947j.addInt(this.f57459a.readUInt32());
                if (this.f57459a.isAtEnd()) {
                    return;
                }
                readTag2 = this.f57459a.readTag();
            } while (readTag2 == this.f57460b);
            this.f57462d = readTag2;
            return;
        }
        int tagWireType2 = WireFormat.getTagWireType(this.f57460b);
        if (tagWireType2 != 0) {
            if (tagWireType2 == 2) {
                int totalBytesRead2 = this.f57459a.getTotalBytesRead() + this.f57459a.readUInt32();
                do {
                    list.add(Integer.valueOf(this.f57459a.readUInt32()));
                } while (this.f57459a.getTotalBytesRead() < totalBytesRead2);
                m35364T(totalBytesRead2);
                return;
            }
            throw InvalidProtocolBufferException.invalidWireType();
        }
        do {
            list.add(Integer.valueOf(this.f57459a.readUInt32()));
            if (this.f57459a.isAtEnd()) {
                return;
            }
            readTag = this.f57459a.readTag();
        } while (readTag == this.f57460b);
        this.f57462d = readTag;
    }

    @Override // com.google.protobuf.InterfaceC8960s
    /* renamed from: B */
    public int mo35158B() {
        m35363U(5);
        return this.f57459a.readFixed32();
    }

    @Override // com.google.protobuf.InterfaceC8960s
    /* renamed from: C */
    public long mo35157C() {
        m35363U(0);
        return this.f57459a.readSInt64();
    }

    @Override // com.google.protobuf.InterfaceC8960s
    /* renamed from: D */
    public int mo35156D() {
        m35363U(5);
        return this.f57459a.readSFixed32();
    }

    @Override // com.google.protobuf.InterfaceC8960s
    /* renamed from: E */
    public String mo35155E() {
        m35363U(2);
        return this.f57459a.readStringRequireUtf8();
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x005e, code lost:
        r8.put(r2, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0061, code lost:
        r7.f57459a.popLimit(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0066, code lost:
        return;
     */
    @Override // com.google.protobuf.InterfaceC8960s
    /* renamed from: F */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void mo35154F(java.util.Map r8, com.google.protobuf.MapEntryLite.C8897b r9, com.google.protobuf.ExtensionRegistryLite r10) {
        /*
            r7 = this;
            r0 = 2
            r7.m35363U(r0)
            com.google.protobuf.CodedInputStream r1 = r7.f57459a
            int r1 = r1.readUInt32()
            com.google.protobuf.CodedInputStream r2 = r7.f57459a
            int r1 = r2.pushLimit(r1)
            java.lang.Object r2 = r9.f57389b
            java.lang.Object r3 = r9.f57391d
        L14:
            int r4 = r7.mo35135m()     // Catch: java.lang.Throwable -> L3a
            r5 = 2147483647(0x7fffffff, float:NaN)
            if (r4 == r5) goto L5e
            com.google.protobuf.CodedInputStream r5 = r7.f57459a     // Catch: java.lang.Throwable -> L3a
            boolean r5 = r5.isAtEnd()     // Catch: java.lang.Throwable -> L3a
            if (r5 == 0) goto L26
            goto L5e
        L26:
            r5 = 1
            java.lang.String r6 = "Unable to parse map entry."
            if (r4 == r5) goto L49
            if (r4 == r0) goto L3c
            boolean r4 = r7.mo35132p()     // Catch: java.lang.Throwable -> L3a com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L51
            if (r4 == 0) goto L34
            goto L14
        L34:
            com.google.protobuf.InvalidProtocolBufferException r4 = new com.google.protobuf.InvalidProtocolBufferException     // Catch: java.lang.Throwable -> L3a com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L51
            r4.<init>(r6)     // Catch: java.lang.Throwable -> L3a com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L51
            throw r4     // Catch: java.lang.Throwable -> L3a com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L51
        L3a:
            r8 = move-exception
            goto L67
        L3c:
            com.google.protobuf.WireFormat$FieldType r4 = r9.f57390c     // Catch: java.lang.Throwable -> L3a com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L51
            java.lang.Object r5 = r9.f57391d     // Catch: java.lang.Throwable -> L3a com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L51
            java.lang.Class r5 = r5.getClass()     // Catch: java.lang.Throwable -> L3a com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L51
            java.lang.Object r3 = r7.m35368P(r4, r5, r10)     // Catch: java.lang.Throwable -> L3a com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L51
            goto L14
        L49:
            com.google.protobuf.WireFormat$FieldType r4 = r9.f57388a     // Catch: java.lang.Throwable -> L3a com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L51
            r5 = 0
            java.lang.Object r2 = r7.m35368P(r4, r5, r5)     // Catch: java.lang.Throwable -> L3a com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L51
            goto L14
        L51:
            boolean r4 = r7.mo35132p()     // Catch: java.lang.Throwable -> L3a
            if (r4 == 0) goto L58
            goto L14
        L58:
            com.google.protobuf.InvalidProtocolBufferException r8 = new com.google.protobuf.InvalidProtocolBufferException     // Catch: java.lang.Throwable -> L3a
            r8.<init>(r6)     // Catch: java.lang.Throwable -> L3a
            throw r8     // Catch: java.lang.Throwable -> L3a
        L5e:
            r8.put(r2, r3)     // Catch: java.lang.Throwable -> L3a
            com.google.protobuf.CodedInputStream r8 = r7.f57459a
            r8.popLimit(r1)
            return
        L67:
            com.google.protobuf.CodedInputStream r9 = r7.f57459a
            r9.popLimit(r1)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C8938d.mo35154F(java.util.Map, com.google.protobuf.MapEntryLite$b, com.google.protobuf.ExtensionRegistryLite):void");
    }

    @Override // com.google.protobuf.InterfaceC8960s
    /* renamed from: G */
    public void mo35153G(Object obj, InterfaceC8961t interfaceC8961t, ExtensionRegistryLite extensionRegistryLite) {
        m35363U(3);
        m35370N(obj, interfaceC8961t, extensionRegistryLite);
    }

    @Override // com.google.protobuf.InterfaceC8960s
    /* renamed from: H */
    public void mo35152H(Object obj, InterfaceC8961t interfaceC8961t, ExtensionRegistryLite extensionRegistryLite) {
        m35363U(2);
        m35369O(obj, interfaceC8961t, extensionRegistryLite);
    }

    @Override // com.google.protobuf.InterfaceC8960s
    /* renamed from: I */
    public void mo35151I(List list, InterfaceC8961t interfaceC8961t, ExtensionRegistryLite extensionRegistryLite) {
        int readTag;
        if (WireFormat.getTagWireType(this.f57460b) == 3) {
            int i = this.f57460b;
            do {
                list.add(m35367Q(interfaceC8961t, extensionRegistryLite));
                if (!this.f57459a.isAtEnd() && this.f57462d == 0) {
                    readTag = this.f57459a.readTag();
                } else {
                    return;
                }
            } while (readTag == i);
            this.f57462d = readTag;
            return;
        }
        throw InvalidProtocolBufferException.invalidWireType();
    }

    @Override // com.google.protobuf.InterfaceC8960s
    /* renamed from: J */
    public void mo35150J(List list, InterfaceC8961t interfaceC8961t, ExtensionRegistryLite extensionRegistryLite) {
        int readTag;
        if (WireFormat.getTagWireType(this.f57460b) == 2) {
            int i = this.f57460b;
            do {
                list.add(m35366R(interfaceC8961t, extensionRegistryLite));
                if (!this.f57459a.isAtEnd() && this.f57462d == 0) {
                    readTag = this.f57459a.readTag();
                } else {
                    return;
                }
            } while (readTag == i);
            this.f57462d = readTag;
            return;
        }
        throw InvalidProtocolBufferException.invalidWireType();
    }

    @Override // com.google.protobuf.InterfaceC8960s
    /* renamed from: K */
    public Object mo35149K(Class cls, ExtensionRegistryLite extensionRegistryLite) {
        m35363U(3);
        return m35367Q(C17878Jo1.m67679a().m67677c(cls), extensionRegistryLite);
    }

    @Override // com.google.protobuf.InterfaceC8960s
    /* renamed from: L */
    public Object mo35148L(Class cls, ExtensionRegistryLite extensionRegistryLite) {
        m35363U(2);
        return m35366R(C17878Jo1.m67679a().m67677c(cls), extensionRegistryLite);
    }

    /* renamed from: N */
    public final void m35370N(Object obj, InterfaceC8961t interfaceC8961t, ExtensionRegistryLite extensionRegistryLite) {
        int i = this.f57461c;
        this.f57461c = WireFormat.m35424a(WireFormat.getTagFieldNumber(this.f57460b), 4);
        try {
            interfaceC8961t.mo35113i(obj, this, extensionRegistryLite);
            if (this.f57460b == this.f57461c) {
                return;
            }
            throw InvalidProtocolBufferException.parseFailure();
        } finally {
            this.f57461c = i;
        }
    }

    /* renamed from: O */
    public final void m35369O(Object obj, InterfaceC8961t interfaceC8961t, ExtensionRegistryLite extensionRegistryLite) {
        CodedInputStream codedInputStream;
        int readUInt32 = this.f57459a.readUInt32();
        CodedInputStream codedInputStream2 = this.f57459a;
        if (codedInputStream2.f57209a < codedInputStream2.f57210b) {
            int pushLimit = codedInputStream2.pushLimit(readUInt32);
            this.f57459a.f57209a++;
            interfaceC8961t.mo35113i(obj, this, extensionRegistryLite);
            this.f57459a.checkLastTagWas(0);
            codedInputStream.f57209a--;
            this.f57459a.popLimit(pushLimit);
            return;
        }
        throw InvalidProtocolBufferException.recursionLimitExceeded();
    }

    /* renamed from: P */
    public final Object m35368P(WireFormat.FieldType fieldType, Class cls, ExtensionRegistryLite extensionRegistryLite) {
        switch (C8939a.f57463a[fieldType.ordinal()]) {
            case 1:
                return Boolean.valueOf(mo35127u());
            case 2:
                return mo35141g();
            case 3:
                return Double.valueOf(readDouble());
            case 4:
                return Integer.valueOf(mo35144d());
            case 5:
                return Integer.valueOf(mo35158B());
            case 6:
                return Long.valueOf(mo35129s());
            case 7:
                return Float.valueOf(readFloat());
            case 8:
                return Integer.valueOf(readInt32());
            case 9:
                return Long.valueOf(readInt64());
            case 10:
                return mo35148L(cls, extensionRegistryLite);
            case 11:
                return Integer.valueOf(mo35156D());
            case 12:
                return Long.valueOf(mo35146b());
            case 13:
                return Integer.valueOf(mo35143e());
            case 14:
                return Long.valueOf(mo35157C());
            case 15:
                return mo35155E();
            case 16:
                return Integer.valueOf(mo35145c());
            case 17:
                return Long.valueOf(mo35139i());
            default:
                throw new IllegalArgumentException("unsupported field type.");
        }
    }

    /* renamed from: Q */
    public final Object m35367Q(InterfaceC8961t interfaceC8961t, ExtensionRegistryLite extensionRegistryLite) {
        Object newInstance = interfaceC8961t.newInstance();
        m35370N(newInstance, interfaceC8961t, extensionRegistryLite);
        interfaceC8961t.mo35117e(newInstance);
        return newInstance;
    }

    /* renamed from: R */
    public final Object m35366R(InterfaceC8961t interfaceC8961t, ExtensionRegistryLite extensionRegistryLite) {
        Object newInstance = interfaceC8961t.newInstance();
        m35369O(newInstance, interfaceC8961t, extensionRegistryLite);
        interfaceC8961t.mo35117e(newInstance);
        return newInstance;
    }

    /* renamed from: S */
    public void m35365S(List list, boolean z) {
        String readString;
        int readTag;
        int readTag2;
        if (WireFormat.getTagWireType(this.f57460b) == 2) {
            if ((list instanceof LazyStringList) && !z) {
                LazyStringList lazyStringList = (LazyStringList) list;
                do {
                    lazyStringList.add(mo35141g());
                    if (this.f57459a.isAtEnd()) {
                        return;
                    }
                    readTag2 = this.f57459a.readTag();
                } while (readTag2 == this.f57460b);
                this.f57462d = readTag2;
                return;
            }
            do {
                if (z) {
                    readString = mo35155E();
                } else {
                    readString = readString();
                }
                list.add(readString);
                if (this.f57459a.isAtEnd()) {
                    return;
                }
                readTag = this.f57459a.readTag();
            } while (readTag == this.f57460b);
            this.f57462d = readTag;
            return;
        }
        throw InvalidProtocolBufferException.invalidWireType();
    }

    /* renamed from: T */
    public final void m35364T(int i) {
        if (this.f57459a.getTotalBytesRead() == i) {
            return;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    /* renamed from: U */
    public final void m35363U(int i) {
        if (WireFormat.getTagWireType(this.f57460b) == i) {
            return;
        }
        throw InvalidProtocolBufferException.invalidWireType();
    }

    /* renamed from: V */
    public final void m35362V(int i) {
        if ((i & 3) == 0) {
            return;
        }
        throw InvalidProtocolBufferException.parseFailure();
    }

    /* renamed from: W */
    public final void m35361W(int i) {
        if ((i & 7) == 0) {
            return;
        }
        throw InvalidProtocolBufferException.parseFailure();
    }

    @Override // com.google.protobuf.InterfaceC8960s
    /* renamed from: a */
    public void mo35147a(List list) {
        int readTag;
        int readTag2;
        if (list instanceof C8952l) {
            C8952l c8952l = (C8952l) list;
            int tagWireType = WireFormat.getTagWireType(this.f57460b);
            if (tagWireType != 0) {
                if (tagWireType == 2) {
                    int totalBytesRead = this.f57459a.getTotalBytesRead() + this.f57459a.readUInt32();
                    do {
                        c8952l.addLong(this.f57459a.readSInt64());
                    } while (this.f57459a.getTotalBytesRead() < totalBytesRead);
                    m35364T(totalBytesRead);
                    return;
                }
                throw InvalidProtocolBufferException.invalidWireType();
            }
            do {
                c8952l.addLong(this.f57459a.readSInt64());
                if (this.f57459a.isAtEnd()) {
                    return;
                }
                readTag2 = this.f57459a.readTag();
            } while (readTag2 == this.f57460b);
            this.f57462d = readTag2;
            return;
        }
        int tagWireType2 = WireFormat.getTagWireType(this.f57460b);
        if (tagWireType2 != 0) {
            if (tagWireType2 == 2) {
                int totalBytesRead2 = this.f57459a.getTotalBytesRead() + this.f57459a.readUInt32();
                do {
                    list.add(Long.valueOf(this.f57459a.readSInt64()));
                } while (this.f57459a.getTotalBytesRead() < totalBytesRead2);
                m35364T(totalBytesRead2);
                return;
            }
            throw InvalidProtocolBufferException.invalidWireType();
        }
        do {
            list.add(Long.valueOf(this.f57459a.readSInt64()));
            if (this.f57459a.isAtEnd()) {
                return;
            }
            readTag = this.f57459a.readTag();
        } while (readTag == this.f57460b);
        this.f57462d = readTag;
    }

    @Override // com.google.protobuf.InterfaceC8960s
    /* renamed from: b */
    public long mo35146b() {
        m35363U(1);
        return this.f57459a.readSFixed64();
    }

    @Override // com.google.protobuf.InterfaceC8960s
    /* renamed from: c */
    public int mo35145c() {
        m35363U(0);
        return this.f57459a.readUInt32();
    }

    @Override // com.google.protobuf.InterfaceC8960s
    /* renamed from: d */
    public int mo35144d() {
        m35363U(0);
        return this.f57459a.readEnum();
    }

    @Override // com.google.protobuf.InterfaceC8960s
    /* renamed from: e */
    public int mo35143e() {
        m35363U(0);
        return this.f57459a.readSInt32();
    }

    @Override // com.google.protobuf.InterfaceC8960s
    /* renamed from: f */
    public void mo35142f(List list) {
        int readTag;
        int readTag2;
        if (list instanceof C8937c) {
            C8937c c8937c = (C8937c) list;
            int tagWireType = WireFormat.getTagWireType(this.f57460b);
            if (tagWireType != 0) {
                if (tagWireType == 2) {
                    int totalBytesRead = this.f57459a.getTotalBytesRead() + this.f57459a.readUInt32();
                    do {
                        c8937c.addBoolean(this.f57459a.readBool());
                    } while (this.f57459a.getTotalBytesRead() < totalBytesRead);
                    m35364T(totalBytesRead);
                    return;
                }
                throw InvalidProtocolBufferException.invalidWireType();
            }
            do {
                c8937c.addBoolean(this.f57459a.readBool());
                if (this.f57459a.isAtEnd()) {
                    return;
                }
                readTag2 = this.f57459a.readTag();
            } while (readTag2 == this.f57460b);
            this.f57462d = readTag2;
            return;
        }
        int tagWireType2 = WireFormat.getTagWireType(this.f57460b);
        if (tagWireType2 != 0) {
            if (tagWireType2 == 2) {
                int totalBytesRead2 = this.f57459a.getTotalBytesRead() + this.f57459a.readUInt32();
                do {
                    list.add(Boolean.valueOf(this.f57459a.readBool()));
                } while (this.f57459a.getTotalBytesRead() < totalBytesRead2);
                m35364T(totalBytesRead2);
                return;
            }
            throw InvalidProtocolBufferException.invalidWireType();
        }
        do {
            list.add(Boolean.valueOf(this.f57459a.readBool()));
            if (this.f57459a.isAtEnd()) {
                return;
            }
            readTag = this.f57459a.readTag();
        } while (readTag == this.f57460b);
        this.f57462d = readTag;
    }

    @Override // com.google.protobuf.InterfaceC8960s
    /* renamed from: g */
    public ByteString mo35141g() {
        m35363U(2);
        return this.f57459a.readBytes();
    }

    @Override // com.google.protobuf.InterfaceC8960s
    public int getTag() {
        return this.f57460b;
    }

    @Override // com.google.protobuf.InterfaceC8960s
    /* renamed from: h */
    public void mo35140h(List list) {
        int readTag;
        int readTag2;
        if (list instanceof C8947j) {
            C8947j c8947j = (C8947j) list;
            int tagWireType = WireFormat.getTagWireType(this.f57460b);
            if (tagWireType != 0) {
                if (tagWireType == 2) {
                    int totalBytesRead = this.f57459a.getTotalBytesRead() + this.f57459a.readUInt32();
                    do {
                        c8947j.addInt(this.f57459a.readSInt32());
                    } while (this.f57459a.getTotalBytesRead() < totalBytesRead);
                    m35364T(totalBytesRead);
                    return;
                }
                throw InvalidProtocolBufferException.invalidWireType();
            }
            do {
                c8947j.addInt(this.f57459a.readSInt32());
                if (this.f57459a.isAtEnd()) {
                    return;
                }
                readTag2 = this.f57459a.readTag();
            } while (readTag2 == this.f57460b);
            this.f57462d = readTag2;
            return;
        }
        int tagWireType2 = WireFormat.getTagWireType(this.f57460b);
        if (tagWireType2 != 0) {
            if (tagWireType2 == 2) {
                int totalBytesRead2 = this.f57459a.getTotalBytesRead() + this.f57459a.readUInt32();
                do {
                    list.add(Integer.valueOf(this.f57459a.readSInt32()));
                } while (this.f57459a.getTotalBytesRead() < totalBytesRead2);
                m35364T(totalBytesRead2);
                return;
            }
            throw InvalidProtocolBufferException.invalidWireType();
        }
        do {
            list.add(Integer.valueOf(this.f57459a.readSInt32()));
            if (this.f57459a.isAtEnd()) {
                return;
            }
            readTag = this.f57459a.readTag();
        } while (readTag == this.f57460b);
        this.f57462d = readTag;
    }

    @Override // com.google.protobuf.InterfaceC8960s
    /* renamed from: i */
    public long mo35139i() {
        m35363U(0);
        return this.f57459a.readUInt64();
    }

    @Override // com.google.protobuf.InterfaceC8960s
    /* renamed from: j */
    public void mo35138j(List list) {
        int readTag;
        int readTag2;
        if (list instanceof C8952l) {
            C8952l c8952l = (C8952l) list;
            int tagWireType = WireFormat.getTagWireType(this.f57460b);
            if (tagWireType != 1) {
                if (tagWireType == 2) {
                    int readUInt32 = this.f57459a.readUInt32();
                    m35361W(readUInt32);
                    int totalBytesRead = this.f57459a.getTotalBytesRead() + readUInt32;
                    do {
                        c8952l.addLong(this.f57459a.readSFixed64());
                    } while (this.f57459a.getTotalBytesRead() < totalBytesRead);
                    return;
                }
                throw InvalidProtocolBufferException.invalidWireType();
            }
            do {
                c8952l.addLong(this.f57459a.readSFixed64());
                if (this.f57459a.isAtEnd()) {
                    return;
                }
                readTag2 = this.f57459a.readTag();
            } while (readTag2 == this.f57460b);
            this.f57462d = readTag2;
            return;
        }
        int tagWireType2 = WireFormat.getTagWireType(this.f57460b);
        if (tagWireType2 != 1) {
            if (tagWireType2 == 2) {
                int readUInt322 = this.f57459a.readUInt32();
                m35361W(readUInt322);
                int totalBytesRead2 = this.f57459a.getTotalBytesRead() + readUInt322;
                do {
                    list.add(Long.valueOf(this.f57459a.readSFixed64()));
                } while (this.f57459a.getTotalBytesRead() < totalBytesRead2);
                return;
            }
            throw InvalidProtocolBufferException.invalidWireType();
        }
        do {
            list.add(Long.valueOf(this.f57459a.readSFixed64()));
            if (this.f57459a.isAtEnd()) {
                return;
            }
            readTag = this.f57459a.readTag();
        } while (readTag == this.f57460b);
        this.f57462d = readTag;
    }

    @Override // com.google.protobuf.InterfaceC8960s
    /* renamed from: k */
    public void mo35137k(List list) {
        int readTag;
        int readTag2;
        if (list instanceof C8947j) {
            C8947j c8947j = (C8947j) list;
            int tagWireType = WireFormat.getTagWireType(this.f57460b);
            if (tagWireType != 0) {
                if (tagWireType == 2) {
                    int totalBytesRead = this.f57459a.getTotalBytesRead() + this.f57459a.readUInt32();
                    do {
                        c8947j.addInt(this.f57459a.readInt32());
                    } while (this.f57459a.getTotalBytesRead() < totalBytesRead);
                    m35364T(totalBytesRead);
                    return;
                }
                throw InvalidProtocolBufferException.invalidWireType();
            }
            do {
                c8947j.addInt(this.f57459a.readInt32());
                if (this.f57459a.isAtEnd()) {
                    return;
                }
                readTag2 = this.f57459a.readTag();
            } while (readTag2 == this.f57460b);
            this.f57462d = readTag2;
            return;
        }
        int tagWireType2 = WireFormat.getTagWireType(this.f57460b);
        if (tagWireType2 != 0) {
            if (tagWireType2 == 2) {
                int totalBytesRead2 = this.f57459a.getTotalBytesRead() + this.f57459a.readUInt32();
                do {
                    list.add(Integer.valueOf(this.f57459a.readInt32()));
                } while (this.f57459a.getTotalBytesRead() < totalBytesRead2);
                m35364T(totalBytesRead2);
                return;
            }
            throw InvalidProtocolBufferException.invalidWireType();
        }
        do {
            list.add(Integer.valueOf(this.f57459a.readInt32()));
            if (this.f57459a.isAtEnd()) {
                return;
            }
            readTag = this.f57459a.readTag();
        } while (readTag == this.f57460b);
        this.f57462d = readTag;
    }

    @Override // com.google.protobuf.InterfaceC8960s
    /* renamed from: l */
    public void mo35136l(List list) {
        int readTag;
        int readTag2;
        if (list instanceof C8947j) {
            C8947j c8947j = (C8947j) list;
            int tagWireType = WireFormat.getTagWireType(this.f57460b);
            if (tagWireType != 2) {
                if (tagWireType == 5) {
                    do {
                        c8947j.addInt(this.f57459a.readFixed32());
                        if (this.f57459a.isAtEnd()) {
                            return;
                        }
                        readTag2 = this.f57459a.readTag();
                    } while (readTag2 == this.f57460b);
                    this.f57462d = readTag2;
                    return;
                }
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int readUInt32 = this.f57459a.readUInt32();
            m35362V(readUInt32);
            int totalBytesRead = this.f57459a.getTotalBytesRead() + readUInt32;
            do {
                c8947j.addInt(this.f57459a.readFixed32());
            } while (this.f57459a.getTotalBytesRead() < totalBytesRead);
            return;
        }
        int tagWireType2 = WireFormat.getTagWireType(this.f57460b);
        if (tagWireType2 != 2) {
            if (tagWireType2 == 5) {
                do {
                    list.add(Integer.valueOf(this.f57459a.readFixed32()));
                    if (this.f57459a.isAtEnd()) {
                        return;
                    }
                    readTag = this.f57459a.readTag();
                } while (readTag == this.f57460b);
                this.f57462d = readTag;
                return;
            }
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int readUInt322 = this.f57459a.readUInt32();
        m35362V(readUInt322);
        int totalBytesRead2 = this.f57459a.getTotalBytesRead() + readUInt322;
        do {
            list.add(Integer.valueOf(this.f57459a.readFixed32()));
        } while (this.f57459a.getTotalBytesRead() < totalBytesRead2);
    }

    @Override // com.google.protobuf.InterfaceC8960s
    /* renamed from: m */
    public int mo35135m() {
        int i = this.f57462d;
        if (i != 0) {
            this.f57460b = i;
            this.f57462d = 0;
        } else {
            this.f57460b = this.f57459a.readTag();
        }
        int i2 = this.f57460b;
        if (i2 != 0 && i2 != this.f57461c) {
            return WireFormat.getTagFieldNumber(i2);
        }
        return Integer.MAX_VALUE;
    }

    @Override // com.google.protobuf.InterfaceC8960s
    /* renamed from: n */
    public void mo35134n(List list) {
        m35365S(list, false);
    }

    @Override // com.google.protobuf.InterfaceC8960s
    /* renamed from: o */
    public void mo35133o(List list) {
        int readTag;
        int readTag2;
        if (list instanceof C8946i) {
            C8946i c8946i = (C8946i) list;
            int tagWireType = WireFormat.getTagWireType(this.f57460b);
            if (tagWireType != 2) {
                if (tagWireType == 5) {
                    do {
                        c8946i.addFloat(this.f57459a.readFloat());
                        if (this.f57459a.isAtEnd()) {
                            return;
                        }
                        readTag2 = this.f57459a.readTag();
                    } while (readTag2 == this.f57460b);
                    this.f57462d = readTag2;
                    return;
                }
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int readUInt32 = this.f57459a.readUInt32();
            m35362V(readUInt32);
            int totalBytesRead = this.f57459a.getTotalBytesRead() + readUInt32;
            do {
                c8946i.addFloat(this.f57459a.readFloat());
            } while (this.f57459a.getTotalBytesRead() < totalBytesRead);
            return;
        }
        int tagWireType2 = WireFormat.getTagWireType(this.f57460b);
        if (tagWireType2 != 2) {
            if (tagWireType2 == 5) {
                do {
                    list.add(Float.valueOf(this.f57459a.readFloat()));
                    if (this.f57459a.isAtEnd()) {
                        return;
                    }
                    readTag = this.f57459a.readTag();
                } while (readTag == this.f57460b);
                this.f57462d = readTag;
                return;
            }
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int readUInt322 = this.f57459a.readUInt32();
        m35362V(readUInt322);
        int totalBytesRead2 = this.f57459a.getTotalBytesRead() + readUInt322;
        do {
            list.add(Float.valueOf(this.f57459a.readFloat()));
        } while (this.f57459a.getTotalBytesRead() < totalBytesRead2);
    }

    @Override // com.google.protobuf.InterfaceC8960s
    /* renamed from: p */
    public boolean mo35132p() {
        int i;
        if (!this.f57459a.isAtEnd() && (i = this.f57460b) != this.f57461c) {
            return this.f57459a.skipField(i);
        }
        return false;
    }

    @Override // com.google.protobuf.InterfaceC8960s
    /* renamed from: q */
    public void mo35131q(List list) {
        int readTag;
        if (WireFormat.getTagWireType(this.f57460b) == 2) {
            do {
                list.add(mo35141g());
                if (this.f57459a.isAtEnd()) {
                    return;
                }
                readTag = this.f57459a.readTag();
            } while (readTag == this.f57460b);
            this.f57462d = readTag;
            return;
        }
        throw InvalidProtocolBufferException.invalidWireType();
    }

    @Override // com.google.protobuf.InterfaceC8960s
    /* renamed from: r */
    public void mo35130r(List list) {
        int readTag;
        int readTag2;
        if (list instanceof C8942f) {
            C8942f c8942f = (C8942f) list;
            int tagWireType = WireFormat.getTagWireType(this.f57460b);
            if (tagWireType != 1) {
                if (tagWireType == 2) {
                    int readUInt32 = this.f57459a.readUInt32();
                    m35361W(readUInt32);
                    int totalBytesRead = this.f57459a.getTotalBytesRead() + readUInt32;
                    do {
                        c8942f.addDouble(this.f57459a.readDouble());
                    } while (this.f57459a.getTotalBytesRead() < totalBytesRead);
                    return;
                }
                throw InvalidProtocolBufferException.invalidWireType();
            }
            do {
                c8942f.addDouble(this.f57459a.readDouble());
                if (this.f57459a.isAtEnd()) {
                    return;
                }
                readTag2 = this.f57459a.readTag();
            } while (readTag2 == this.f57460b);
            this.f57462d = readTag2;
            return;
        }
        int tagWireType2 = WireFormat.getTagWireType(this.f57460b);
        if (tagWireType2 != 1) {
            if (tagWireType2 == 2) {
                int readUInt322 = this.f57459a.readUInt32();
                m35361W(readUInt322);
                int totalBytesRead2 = this.f57459a.getTotalBytesRead() + readUInt322;
                do {
                    list.add(Double.valueOf(this.f57459a.readDouble()));
                } while (this.f57459a.getTotalBytesRead() < totalBytesRead2);
                return;
            }
            throw InvalidProtocolBufferException.invalidWireType();
        }
        do {
            list.add(Double.valueOf(this.f57459a.readDouble()));
            if (this.f57459a.isAtEnd()) {
                return;
            }
            readTag = this.f57459a.readTag();
        } while (readTag == this.f57460b);
        this.f57462d = readTag;
    }

    @Override // com.google.protobuf.InterfaceC8960s
    public double readDouble() {
        m35363U(1);
        return this.f57459a.readDouble();
    }

    @Override // com.google.protobuf.InterfaceC8960s
    public float readFloat() {
        m35363U(5);
        return this.f57459a.readFloat();
    }

    @Override // com.google.protobuf.InterfaceC8960s
    public int readInt32() {
        m35363U(0);
        return this.f57459a.readInt32();
    }

    @Override // com.google.protobuf.InterfaceC8960s
    public long readInt64() {
        m35363U(0);
        return this.f57459a.readInt64();
    }

    @Override // com.google.protobuf.InterfaceC8960s
    public String readString() {
        m35363U(2);
        return this.f57459a.readString();
    }

    @Override // com.google.protobuf.InterfaceC8960s
    /* renamed from: s */
    public long mo35129s() {
        m35363U(1);
        return this.f57459a.readFixed64();
    }

    @Override // com.google.protobuf.InterfaceC8960s
    /* renamed from: t */
    public void mo35128t(List list) {
        int readTag;
        int readTag2;
        if (list instanceof C8947j) {
            C8947j c8947j = (C8947j) list;
            int tagWireType = WireFormat.getTagWireType(this.f57460b);
            if (tagWireType != 2) {
                if (tagWireType == 5) {
                    do {
                        c8947j.addInt(this.f57459a.readSFixed32());
                        if (this.f57459a.isAtEnd()) {
                            return;
                        }
                        readTag2 = this.f57459a.readTag();
                    } while (readTag2 == this.f57460b);
                    this.f57462d = readTag2;
                    return;
                }
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int readUInt32 = this.f57459a.readUInt32();
            m35362V(readUInt32);
            int totalBytesRead = this.f57459a.getTotalBytesRead() + readUInt32;
            do {
                c8947j.addInt(this.f57459a.readSFixed32());
            } while (this.f57459a.getTotalBytesRead() < totalBytesRead);
            return;
        }
        int tagWireType2 = WireFormat.getTagWireType(this.f57460b);
        if (tagWireType2 != 2) {
            if (tagWireType2 == 5) {
                do {
                    list.add(Integer.valueOf(this.f57459a.readSFixed32()));
                    if (this.f57459a.isAtEnd()) {
                        return;
                    }
                    readTag = this.f57459a.readTag();
                } while (readTag == this.f57460b);
                this.f57462d = readTag;
                return;
            }
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int readUInt322 = this.f57459a.readUInt32();
        m35362V(readUInt322);
        int totalBytesRead2 = this.f57459a.getTotalBytesRead() + readUInt322;
        do {
            list.add(Integer.valueOf(this.f57459a.readSFixed32()));
        } while (this.f57459a.getTotalBytesRead() < totalBytesRead2);
    }

    @Override // com.google.protobuf.InterfaceC8960s
    /* renamed from: u */
    public boolean mo35127u() {
        m35363U(0);
        return this.f57459a.readBool();
    }

    @Override // com.google.protobuf.InterfaceC8960s
    /* renamed from: v */
    public void mo35126v(List list) {
        int readTag;
        int readTag2;
        if (list instanceof C8952l) {
            C8952l c8952l = (C8952l) list;
            int tagWireType = WireFormat.getTagWireType(this.f57460b);
            if (tagWireType != 0) {
                if (tagWireType == 2) {
                    int totalBytesRead = this.f57459a.getTotalBytesRead() + this.f57459a.readUInt32();
                    do {
                        c8952l.addLong(this.f57459a.readUInt64());
                    } while (this.f57459a.getTotalBytesRead() < totalBytesRead);
                    m35364T(totalBytesRead);
                    return;
                }
                throw InvalidProtocolBufferException.invalidWireType();
            }
            do {
                c8952l.addLong(this.f57459a.readUInt64());
                if (this.f57459a.isAtEnd()) {
                    return;
                }
                readTag2 = this.f57459a.readTag();
            } while (readTag2 == this.f57460b);
            this.f57462d = readTag2;
            return;
        }
        int tagWireType2 = WireFormat.getTagWireType(this.f57460b);
        if (tagWireType2 != 0) {
            if (tagWireType2 == 2) {
                int totalBytesRead2 = this.f57459a.getTotalBytesRead() + this.f57459a.readUInt32();
                do {
                    list.add(Long.valueOf(this.f57459a.readUInt64()));
                } while (this.f57459a.getTotalBytesRead() < totalBytesRead2);
                m35364T(totalBytesRead2);
                return;
            }
            throw InvalidProtocolBufferException.invalidWireType();
        }
        do {
            list.add(Long.valueOf(this.f57459a.readUInt64()));
            if (this.f57459a.isAtEnd()) {
                return;
            }
            readTag = this.f57459a.readTag();
        } while (readTag == this.f57460b);
        this.f57462d = readTag;
    }

    @Override // com.google.protobuf.InterfaceC8960s
    /* renamed from: w */
    public void mo35125w(List list) {
        int readTag;
        int readTag2;
        if (list instanceof C8952l) {
            C8952l c8952l = (C8952l) list;
            int tagWireType = WireFormat.getTagWireType(this.f57460b);
            if (tagWireType != 0) {
                if (tagWireType == 2) {
                    int totalBytesRead = this.f57459a.getTotalBytesRead() + this.f57459a.readUInt32();
                    do {
                        c8952l.addLong(this.f57459a.readInt64());
                    } while (this.f57459a.getTotalBytesRead() < totalBytesRead);
                    m35364T(totalBytesRead);
                    return;
                }
                throw InvalidProtocolBufferException.invalidWireType();
            }
            do {
                c8952l.addLong(this.f57459a.readInt64());
                if (this.f57459a.isAtEnd()) {
                    return;
                }
                readTag2 = this.f57459a.readTag();
            } while (readTag2 == this.f57460b);
            this.f57462d = readTag2;
            return;
        }
        int tagWireType2 = WireFormat.getTagWireType(this.f57460b);
        if (tagWireType2 != 0) {
            if (tagWireType2 == 2) {
                int totalBytesRead2 = this.f57459a.getTotalBytesRead() + this.f57459a.readUInt32();
                do {
                    list.add(Long.valueOf(this.f57459a.readInt64()));
                } while (this.f57459a.getTotalBytesRead() < totalBytesRead2);
                m35364T(totalBytesRead2);
                return;
            }
            throw InvalidProtocolBufferException.invalidWireType();
        }
        do {
            list.add(Long.valueOf(this.f57459a.readInt64()));
            if (this.f57459a.isAtEnd()) {
                return;
            }
            readTag = this.f57459a.readTag();
        } while (readTag == this.f57460b);
        this.f57462d = readTag;
    }

    @Override // com.google.protobuf.InterfaceC8960s
    /* renamed from: x */
    public void mo35124x(List list) {
        int readTag;
        int readTag2;
        if (list instanceof C8947j) {
            C8947j c8947j = (C8947j) list;
            int tagWireType = WireFormat.getTagWireType(this.f57460b);
            if (tagWireType != 0) {
                if (tagWireType == 2) {
                    int totalBytesRead = this.f57459a.getTotalBytesRead() + this.f57459a.readUInt32();
                    do {
                        c8947j.addInt(this.f57459a.readEnum());
                    } while (this.f57459a.getTotalBytesRead() < totalBytesRead);
                    m35364T(totalBytesRead);
                    return;
                }
                throw InvalidProtocolBufferException.invalidWireType();
            }
            do {
                c8947j.addInt(this.f57459a.readEnum());
                if (this.f57459a.isAtEnd()) {
                    return;
                }
                readTag2 = this.f57459a.readTag();
            } while (readTag2 == this.f57460b);
            this.f57462d = readTag2;
            return;
        }
        int tagWireType2 = WireFormat.getTagWireType(this.f57460b);
        if (tagWireType2 != 0) {
            if (tagWireType2 == 2) {
                int totalBytesRead2 = this.f57459a.getTotalBytesRead() + this.f57459a.readUInt32();
                do {
                    list.add(Integer.valueOf(this.f57459a.readEnum()));
                } while (this.f57459a.getTotalBytesRead() < totalBytesRead2);
                m35364T(totalBytesRead2);
                return;
            }
            throw InvalidProtocolBufferException.invalidWireType();
        }
        do {
            list.add(Integer.valueOf(this.f57459a.readEnum()));
            if (this.f57459a.isAtEnd()) {
                return;
            }
            readTag = this.f57459a.readTag();
        } while (readTag == this.f57460b);
        this.f57462d = readTag;
    }

    @Override // com.google.protobuf.InterfaceC8960s
    /* renamed from: y */
    public void mo35123y(List list) {
        m35365S(list, true);
    }

    @Override // com.google.protobuf.InterfaceC8960s
    /* renamed from: z */
    public void mo35122z(List list) {
        int readTag;
        int readTag2;
        if (list instanceof C8952l) {
            C8952l c8952l = (C8952l) list;
            int tagWireType = WireFormat.getTagWireType(this.f57460b);
            if (tagWireType != 1) {
                if (tagWireType == 2) {
                    int readUInt32 = this.f57459a.readUInt32();
                    m35361W(readUInt32);
                    int totalBytesRead = this.f57459a.getTotalBytesRead() + readUInt32;
                    do {
                        c8952l.addLong(this.f57459a.readFixed64());
                    } while (this.f57459a.getTotalBytesRead() < totalBytesRead);
                    return;
                }
                throw InvalidProtocolBufferException.invalidWireType();
            }
            do {
                c8952l.addLong(this.f57459a.readFixed64());
                if (this.f57459a.isAtEnd()) {
                    return;
                }
                readTag2 = this.f57459a.readTag();
            } while (readTag2 == this.f57460b);
            this.f57462d = readTag2;
            return;
        }
        int tagWireType2 = WireFormat.getTagWireType(this.f57460b);
        if (tagWireType2 != 1) {
            if (tagWireType2 == 2) {
                int readUInt322 = this.f57459a.readUInt32();
                m35361W(readUInt322);
                int totalBytesRead2 = this.f57459a.getTotalBytesRead() + readUInt322;
                do {
                    list.add(Long.valueOf(this.f57459a.readFixed64()));
                } while (this.f57459a.getTotalBytesRead() < totalBytesRead2);
                return;
            }
            throw InvalidProtocolBufferException.invalidWireType();
        }
        do {
            list.add(Long.valueOf(this.f57459a.readFixed64()));
            if (this.f57459a.isAtEnd()) {
                return;
            }
            readTag = this.f57459a.readTag();
        } while (readTag == this.f57460b);
        this.f57462d = readTag;
    }
}
