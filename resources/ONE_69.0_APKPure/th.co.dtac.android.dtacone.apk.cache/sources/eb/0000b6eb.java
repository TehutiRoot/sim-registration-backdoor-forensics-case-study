package com.google.protobuf;

import com.google.protobuf.WireFormat;
import java.util.List;

/* renamed from: com.google.protobuf.d */
/* loaded from: classes4.dex */
public final class C8927d implements InterfaceC8949s {

    /* renamed from: a */
    public final CodedInputStream f57471a;

    /* renamed from: b */
    public int f57472b;

    /* renamed from: c */
    public int f57473c;

    /* renamed from: d */
    public int f57474d = 0;

    /* renamed from: com.google.protobuf.d$a */
    /* loaded from: classes4.dex */
    public static /* synthetic */ class C8928a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f57475a;

        static {
            int[] iArr = new int[WireFormat.FieldType.values().length];
            f57475a = iArr;
            try {
                iArr[WireFormat.FieldType.BOOL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f57475a[WireFormat.FieldType.BYTES.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f57475a[WireFormat.FieldType.DOUBLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f57475a[WireFormat.FieldType.ENUM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f57475a[WireFormat.FieldType.FIXED32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f57475a[WireFormat.FieldType.FIXED64.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f57475a[WireFormat.FieldType.FLOAT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f57475a[WireFormat.FieldType.INT32.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f57475a[WireFormat.FieldType.INT64.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f57475a[WireFormat.FieldType.MESSAGE.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f57475a[WireFormat.FieldType.SFIXED32.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f57475a[WireFormat.FieldType.SFIXED64.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f57475a[WireFormat.FieldType.SINT32.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f57475a[WireFormat.FieldType.SINT64.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f57475a[WireFormat.FieldType.STRING.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f57475a[WireFormat.FieldType.UINT32.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f57475a[WireFormat.FieldType.UINT64.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
        }
    }

    public C8927d(CodedInputStream codedInputStream) {
        CodedInputStream codedInputStream2 = (CodedInputStream) Internal.m35777b(codedInputStream, "input");
        this.f57471a = codedInputStream2;
        codedInputStream2.f57224d = this;
    }

    /* renamed from: M */
    public static C8927d m35363M(CodedInputStream codedInputStream) {
        C8927d c8927d = codedInputStream.f57224d;
        if (c8927d != null) {
            return c8927d;
        }
        return new C8927d(codedInputStream);
    }

    @Override // com.google.protobuf.InterfaceC8949s
    /* renamed from: A */
    public void mo35151A(List list) {
        int readTag;
        int readTag2;
        if (list instanceof C8936j) {
            C8936j c8936j = (C8936j) list;
            int tagWireType = WireFormat.getTagWireType(this.f57472b);
            if (tagWireType != 0) {
                if (tagWireType == 2) {
                    int totalBytesRead = this.f57471a.getTotalBytesRead() + this.f57471a.readUInt32();
                    do {
                        c8936j.addInt(this.f57471a.readUInt32());
                    } while (this.f57471a.getTotalBytesRead() < totalBytesRead);
                    m35356T(totalBytesRead);
                    return;
                }
                throw InvalidProtocolBufferException.invalidWireType();
            }
            do {
                c8936j.addInt(this.f57471a.readUInt32());
                if (this.f57471a.isAtEnd()) {
                    return;
                }
                readTag2 = this.f57471a.readTag();
            } while (readTag2 == this.f57472b);
            this.f57474d = readTag2;
            return;
        }
        int tagWireType2 = WireFormat.getTagWireType(this.f57472b);
        if (tagWireType2 != 0) {
            if (tagWireType2 == 2) {
                int totalBytesRead2 = this.f57471a.getTotalBytesRead() + this.f57471a.readUInt32();
                do {
                    list.add(Integer.valueOf(this.f57471a.readUInt32()));
                } while (this.f57471a.getTotalBytesRead() < totalBytesRead2);
                m35356T(totalBytesRead2);
                return;
            }
            throw InvalidProtocolBufferException.invalidWireType();
        }
        do {
            list.add(Integer.valueOf(this.f57471a.readUInt32()));
            if (this.f57471a.isAtEnd()) {
                return;
            }
            readTag = this.f57471a.readTag();
        } while (readTag == this.f57472b);
        this.f57474d = readTag;
    }

    @Override // com.google.protobuf.InterfaceC8949s
    /* renamed from: B */
    public int mo35150B() {
        m35355U(5);
        return this.f57471a.readFixed32();
    }

    @Override // com.google.protobuf.InterfaceC8949s
    /* renamed from: C */
    public long mo35149C() {
        m35355U(0);
        return this.f57471a.readSInt64();
    }

    @Override // com.google.protobuf.InterfaceC8949s
    /* renamed from: D */
    public int mo35148D() {
        m35355U(5);
        return this.f57471a.readSFixed32();
    }

    @Override // com.google.protobuf.InterfaceC8949s
    /* renamed from: E */
    public String mo35147E() {
        m35355U(2);
        return this.f57471a.readStringRequireUtf8();
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x005e, code lost:
        r8.put(r2, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0061, code lost:
        r7.f57471a.popLimit(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0066, code lost:
        return;
     */
    @Override // com.google.protobuf.InterfaceC8949s
    /* renamed from: F */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void mo35146F(java.util.Map r8, com.google.protobuf.MapEntryLite.C8886b r9, com.google.protobuf.ExtensionRegistryLite r10) {
        /*
            r7 = this;
            r0 = 2
            r7.m35355U(r0)
            com.google.protobuf.CodedInputStream r1 = r7.f57471a
            int r1 = r1.readUInt32()
            com.google.protobuf.CodedInputStream r2 = r7.f57471a
            int r1 = r2.pushLimit(r1)
            java.lang.Object r2 = r9.f57401b
            java.lang.Object r3 = r9.f57403d
        L14:
            int r4 = r7.mo35127m()     // Catch: java.lang.Throwable -> L3a
            r5 = 2147483647(0x7fffffff, float:NaN)
            if (r4 == r5) goto L5e
            com.google.protobuf.CodedInputStream r5 = r7.f57471a     // Catch: java.lang.Throwable -> L3a
            boolean r5 = r5.isAtEnd()     // Catch: java.lang.Throwable -> L3a
            if (r5 == 0) goto L26
            goto L5e
        L26:
            r5 = 1
            java.lang.String r6 = "Unable to parse map entry."
            if (r4 == r5) goto L49
            if (r4 == r0) goto L3c
            boolean r4 = r7.mo35124p()     // Catch: java.lang.Throwable -> L3a com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L51
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
            com.google.protobuf.WireFormat$FieldType r4 = r9.f57402c     // Catch: java.lang.Throwable -> L3a com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L51
            java.lang.Object r5 = r9.f57403d     // Catch: java.lang.Throwable -> L3a com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L51
            java.lang.Class r5 = r5.getClass()     // Catch: java.lang.Throwable -> L3a com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L51
            java.lang.Object r3 = r7.m35360P(r4, r5, r10)     // Catch: java.lang.Throwable -> L3a com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L51
            goto L14
        L49:
            com.google.protobuf.WireFormat$FieldType r4 = r9.f57400a     // Catch: java.lang.Throwable -> L3a com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L51
            r5 = 0
            java.lang.Object r2 = r7.m35360P(r4, r5, r5)     // Catch: java.lang.Throwable -> L3a com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L51
            goto L14
        L51:
            boolean r4 = r7.mo35124p()     // Catch: java.lang.Throwable -> L3a
            if (r4 == 0) goto L58
            goto L14
        L58:
            com.google.protobuf.InvalidProtocolBufferException r8 = new com.google.protobuf.InvalidProtocolBufferException     // Catch: java.lang.Throwable -> L3a
            r8.<init>(r6)     // Catch: java.lang.Throwable -> L3a
            throw r8     // Catch: java.lang.Throwable -> L3a
        L5e:
            r8.put(r2, r3)     // Catch: java.lang.Throwable -> L3a
            com.google.protobuf.CodedInputStream r8 = r7.f57471a
            r8.popLimit(r1)
            return
        L67:
            com.google.protobuf.CodedInputStream r9 = r7.f57471a
            r9.popLimit(r1)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C8927d.mo35146F(java.util.Map, com.google.protobuf.MapEntryLite$b, com.google.protobuf.ExtensionRegistryLite):void");
    }

    @Override // com.google.protobuf.InterfaceC8949s
    /* renamed from: G */
    public void mo35145G(Object obj, InterfaceC8950t interfaceC8950t, ExtensionRegistryLite extensionRegistryLite) {
        m35355U(3);
        m35362N(obj, interfaceC8950t, extensionRegistryLite);
    }

    @Override // com.google.protobuf.InterfaceC8949s
    /* renamed from: H */
    public void mo35144H(Object obj, InterfaceC8950t interfaceC8950t, ExtensionRegistryLite extensionRegistryLite) {
        m35355U(2);
        m35361O(obj, interfaceC8950t, extensionRegistryLite);
    }

    @Override // com.google.protobuf.InterfaceC8949s
    /* renamed from: I */
    public void mo35143I(List list, InterfaceC8950t interfaceC8950t, ExtensionRegistryLite extensionRegistryLite) {
        int readTag;
        if (WireFormat.getTagWireType(this.f57472b) == 3) {
            int i = this.f57472b;
            do {
                list.add(m35359Q(interfaceC8950t, extensionRegistryLite));
                if (!this.f57471a.isAtEnd() && this.f57474d == 0) {
                    readTag = this.f57471a.readTag();
                } else {
                    return;
                }
            } while (readTag == i);
            this.f57474d = readTag;
            return;
        }
        throw InvalidProtocolBufferException.invalidWireType();
    }

    @Override // com.google.protobuf.InterfaceC8949s
    /* renamed from: J */
    public void mo35142J(List list, InterfaceC8950t interfaceC8950t, ExtensionRegistryLite extensionRegistryLite) {
        int readTag;
        if (WireFormat.getTagWireType(this.f57472b) == 2) {
            int i = this.f57472b;
            do {
                list.add(m35358R(interfaceC8950t, extensionRegistryLite));
                if (!this.f57471a.isAtEnd() && this.f57474d == 0) {
                    readTag = this.f57471a.readTag();
                } else {
                    return;
                }
            } while (readTag == i);
            this.f57474d = readTag;
            return;
        }
        throw InvalidProtocolBufferException.invalidWireType();
    }

    @Override // com.google.protobuf.InterfaceC8949s
    /* renamed from: K */
    public Object mo35141K(Class cls, ExtensionRegistryLite extensionRegistryLite) {
        m35355U(3);
        return m35359Q(C17718Gp1.m68203a().m68201c(cls), extensionRegistryLite);
    }

    @Override // com.google.protobuf.InterfaceC8949s
    /* renamed from: L */
    public Object mo35140L(Class cls, ExtensionRegistryLite extensionRegistryLite) {
        m35355U(2);
        return m35358R(C17718Gp1.m68203a().m68201c(cls), extensionRegistryLite);
    }

    /* renamed from: N */
    public final void m35362N(Object obj, InterfaceC8950t interfaceC8950t, ExtensionRegistryLite extensionRegistryLite) {
        int i = this.f57473c;
        this.f57473c = WireFormat.m35416a(WireFormat.getTagFieldNumber(this.f57472b), 4);
        try {
            interfaceC8950t.mo35105i(obj, this, extensionRegistryLite);
            if (this.f57472b == this.f57473c) {
                return;
            }
            throw InvalidProtocolBufferException.parseFailure();
        } finally {
            this.f57473c = i;
        }
    }

    /* renamed from: O */
    public final void m35361O(Object obj, InterfaceC8950t interfaceC8950t, ExtensionRegistryLite extensionRegistryLite) {
        CodedInputStream codedInputStream;
        int readUInt32 = this.f57471a.readUInt32();
        CodedInputStream codedInputStream2 = this.f57471a;
        if (codedInputStream2.f57221a < codedInputStream2.f57222b) {
            int pushLimit = codedInputStream2.pushLimit(readUInt32);
            this.f57471a.f57221a++;
            interfaceC8950t.mo35105i(obj, this, extensionRegistryLite);
            this.f57471a.checkLastTagWas(0);
            codedInputStream.f57221a--;
            this.f57471a.popLimit(pushLimit);
            return;
        }
        throw InvalidProtocolBufferException.recursionLimitExceeded();
    }

    /* renamed from: P */
    public final Object m35360P(WireFormat.FieldType fieldType, Class cls, ExtensionRegistryLite extensionRegistryLite) {
        switch (C8928a.f57475a[fieldType.ordinal()]) {
            case 1:
                return Boolean.valueOf(mo35119u());
            case 2:
                return mo35133g();
            case 3:
                return Double.valueOf(readDouble());
            case 4:
                return Integer.valueOf(mo35136d());
            case 5:
                return Integer.valueOf(mo35150B());
            case 6:
                return Long.valueOf(mo35121s());
            case 7:
                return Float.valueOf(readFloat());
            case 8:
                return Integer.valueOf(readInt32());
            case 9:
                return Long.valueOf(readInt64());
            case 10:
                return mo35140L(cls, extensionRegistryLite);
            case 11:
                return Integer.valueOf(mo35148D());
            case 12:
                return Long.valueOf(mo35138b());
            case 13:
                return Integer.valueOf(mo35135e());
            case 14:
                return Long.valueOf(mo35149C());
            case 15:
                return mo35147E();
            case 16:
                return Integer.valueOf(mo35137c());
            case 17:
                return Long.valueOf(mo35131i());
            default:
                throw new IllegalArgumentException("unsupported field type.");
        }
    }

    /* renamed from: Q */
    public final Object m35359Q(InterfaceC8950t interfaceC8950t, ExtensionRegistryLite extensionRegistryLite) {
        Object newInstance = interfaceC8950t.newInstance();
        m35362N(newInstance, interfaceC8950t, extensionRegistryLite);
        interfaceC8950t.mo35109e(newInstance);
        return newInstance;
    }

    /* renamed from: R */
    public final Object m35358R(InterfaceC8950t interfaceC8950t, ExtensionRegistryLite extensionRegistryLite) {
        Object newInstance = interfaceC8950t.newInstance();
        m35361O(newInstance, interfaceC8950t, extensionRegistryLite);
        interfaceC8950t.mo35109e(newInstance);
        return newInstance;
    }

    /* renamed from: S */
    public void m35357S(List list, boolean z) {
        String readString;
        int readTag;
        int readTag2;
        if (WireFormat.getTagWireType(this.f57472b) == 2) {
            if ((list instanceof LazyStringList) && !z) {
                LazyStringList lazyStringList = (LazyStringList) list;
                do {
                    lazyStringList.add(mo35133g());
                    if (this.f57471a.isAtEnd()) {
                        return;
                    }
                    readTag2 = this.f57471a.readTag();
                } while (readTag2 == this.f57472b);
                this.f57474d = readTag2;
                return;
            }
            do {
                if (z) {
                    readString = mo35147E();
                } else {
                    readString = readString();
                }
                list.add(readString);
                if (this.f57471a.isAtEnd()) {
                    return;
                }
                readTag = this.f57471a.readTag();
            } while (readTag == this.f57472b);
            this.f57474d = readTag;
            return;
        }
        throw InvalidProtocolBufferException.invalidWireType();
    }

    /* renamed from: T */
    public final void m35356T(int i) {
        if (this.f57471a.getTotalBytesRead() == i) {
            return;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    /* renamed from: U */
    public final void m35355U(int i) {
        if (WireFormat.getTagWireType(this.f57472b) == i) {
            return;
        }
        throw InvalidProtocolBufferException.invalidWireType();
    }

    /* renamed from: V */
    public final void m35354V(int i) {
        if ((i & 3) == 0) {
            return;
        }
        throw InvalidProtocolBufferException.parseFailure();
    }

    /* renamed from: W */
    public final void m35353W(int i) {
        if ((i & 7) == 0) {
            return;
        }
        throw InvalidProtocolBufferException.parseFailure();
    }

    @Override // com.google.protobuf.InterfaceC8949s
    /* renamed from: a */
    public void mo35139a(List list) {
        int readTag;
        int readTag2;
        if (list instanceof C8941l) {
            C8941l c8941l = (C8941l) list;
            int tagWireType = WireFormat.getTagWireType(this.f57472b);
            if (tagWireType != 0) {
                if (tagWireType == 2) {
                    int totalBytesRead = this.f57471a.getTotalBytesRead() + this.f57471a.readUInt32();
                    do {
                        c8941l.addLong(this.f57471a.readSInt64());
                    } while (this.f57471a.getTotalBytesRead() < totalBytesRead);
                    m35356T(totalBytesRead);
                    return;
                }
                throw InvalidProtocolBufferException.invalidWireType();
            }
            do {
                c8941l.addLong(this.f57471a.readSInt64());
                if (this.f57471a.isAtEnd()) {
                    return;
                }
                readTag2 = this.f57471a.readTag();
            } while (readTag2 == this.f57472b);
            this.f57474d = readTag2;
            return;
        }
        int tagWireType2 = WireFormat.getTagWireType(this.f57472b);
        if (tagWireType2 != 0) {
            if (tagWireType2 == 2) {
                int totalBytesRead2 = this.f57471a.getTotalBytesRead() + this.f57471a.readUInt32();
                do {
                    list.add(Long.valueOf(this.f57471a.readSInt64()));
                } while (this.f57471a.getTotalBytesRead() < totalBytesRead2);
                m35356T(totalBytesRead2);
                return;
            }
            throw InvalidProtocolBufferException.invalidWireType();
        }
        do {
            list.add(Long.valueOf(this.f57471a.readSInt64()));
            if (this.f57471a.isAtEnd()) {
                return;
            }
            readTag = this.f57471a.readTag();
        } while (readTag == this.f57472b);
        this.f57474d = readTag;
    }

    @Override // com.google.protobuf.InterfaceC8949s
    /* renamed from: b */
    public long mo35138b() {
        m35355U(1);
        return this.f57471a.readSFixed64();
    }

    @Override // com.google.protobuf.InterfaceC8949s
    /* renamed from: c */
    public int mo35137c() {
        m35355U(0);
        return this.f57471a.readUInt32();
    }

    @Override // com.google.protobuf.InterfaceC8949s
    /* renamed from: d */
    public int mo35136d() {
        m35355U(0);
        return this.f57471a.readEnum();
    }

    @Override // com.google.protobuf.InterfaceC8949s
    /* renamed from: e */
    public int mo35135e() {
        m35355U(0);
        return this.f57471a.readSInt32();
    }

    @Override // com.google.protobuf.InterfaceC8949s
    /* renamed from: f */
    public void mo35134f(List list) {
        int readTag;
        int readTag2;
        if (list instanceof C8926c) {
            C8926c c8926c = (C8926c) list;
            int tagWireType = WireFormat.getTagWireType(this.f57472b);
            if (tagWireType != 0) {
                if (tagWireType == 2) {
                    int totalBytesRead = this.f57471a.getTotalBytesRead() + this.f57471a.readUInt32();
                    do {
                        c8926c.addBoolean(this.f57471a.readBool());
                    } while (this.f57471a.getTotalBytesRead() < totalBytesRead);
                    m35356T(totalBytesRead);
                    return;
                }
                throw InvalidProtocolBufferException.invalidWireType();
            }
            do {
                c8926c.addBoolean(this.f57471a.readBool());
                if (this.f57471a.isAtEnd()) {
                    return;
                }
                readTag2 = this.f57471a.readTag();
            } while (readTag2 == this.f57472b);
            this.f57474d = readTag2;
            return;
        }
        int tagWireType2 = WireFormat.getTagWireType(this.f57472b);
        if (tagWireType2 != 0) {
            if (tagWireType2 == 2) {
                int totalBytesRead2 = this.f57471a.getTotalBytesRead() + this.f57471a.readUInt32();
                do {
                    list.add(Boolean.valueOf(this.f57471a.readBool()));
                } while (this.f57471a.getTotalBytesRead() < totalBytesRead2);
                m35356T(totalBytesRead2);
                return;
            }
            throw InvalidProtocolBufferException.invalidWireType();
        }
        do {
            list.add(Boolean.valueOf(this.f57471a.readBool()));
            if (this.f57471a.isAtEnd()) {
                return;
            }
            readTag = this.f57471a.readTag();
        } while (readTag == this.f57472b);
        this.f57474d = readTag;
    }

    @Override // com.google.protobuf.InterfaceC8949s
    /* renamed from: g */
    public ByteString mo35133g() {
        m35355U(2);
        return this.f57471a.readBytes();
    }

    @Override // com.google.protobuf.InterfaceC8949s
    public int getTag() {
        return this.f57472b;
    }

    @Override // com.google.protobuf.InterfaceC8949s
    /* renamed from: h */
    public void mo35132h(List list) {
        int readTag;
        int readTag2;
        if (list instanceof C8936j) {
            C8936j c8936j = (C8936j) list;
            int tagWireType = WireFormat.getTagWireType(this.f57472b);
            if (tagWireType != 0) {
                if (tagWireType == 2) {
                    int totalBytesRead = this.f57471a.getTotalBytesRead() + this.f57471a.readUInt32();
                    do {
                        c8936j.addInt(this.f57471a.readSInt32());
                    } while (this.f57471a.getTotalBytesRead() < totalBytesRead);
                    m35356T(totalBytesRead);
                    return;
                }
                throw InvalidProtocolBufferException.invalidWireType();
            }
            do {
                c8936j.addInt(this.f57471a.readSInt32());
                if (this.f57471a.isAtEnd()) {
                    return;
                }
                readTag2 = this.f57471a.readTag();
            } while (readTag2 == this.f57472b);
            this.f57474d = readTag2;
            return;
        }
        int tagWireType2 = WireFormat.getTagWireType(this.f57472b);
        if (tagWireType2 != 0) {
            if (tagWireType2 == 2) {
                int totalBytesRead2 = this.f57471a.getTotalBytesRead() + this.f57471a.readUInt32();
                do {
                    list.add(Integer.valueOf(this.f57471a.readSInt32()));
                } while (this.f57471a.getTotalBytesRead() < totalBytesRead2);
                m35356T(totalBytesRead2);
                return;
            }
            throw InvalidProtocolBufferException.invalidWireType();
        }
        do {
            list.add(Integer.valueOf(this.f57471a.readSInt32()));
            if (this.f57471a.isAtEnd()) {
                return;
            }
            readTag = this.f57471a.readTag();
        } while (readTag == this.f57472b);
        this.f57474d = readTag;
    }

    @Override // com.google.protobuf.InterfaceC8949s
    /* renamed from: i */
    public long mo35131i() {
        m35355U(0);
        return this.f57471a.readUInt64();
    }

    @Override // com.google.protobuf.InterfaceC8949s
    /* renamed from: j */
    public void mo35130j(List list) {
        int readTag;
        int readTag2;
        if (list instanceof C8941l) {
            C8941l c8941l = (C8941l) list;
            int tagWireType = WireFormat.getTagWireType(this.f57472b);
            if (tagWireType != 1) {
                if (tagWireType == 2) {
                    int readUInt32 = this.f57471a.readUInt32();
                    m35353W(readUInt32);
                    int totalBytesRead = this.f57471a.getTotalBytesRead() + readUInt32;
                    do {
                        c8941l.addLong(this.f57471a.readSFixed64());
                    } while (this.f57471a.getTotalBytesRead() < totalBytesRead);
                    return;
                }
                throw InvalidProtocolBufferException.invalidWireType();
            }
            do {
                c8941l.addLong(this.f57471a.readSFixed64());
                if (this.f57471a.isAtEnd()) {
                    return;
                }
                readTag2 = this.f57471a.readTag();
            } while (readTag2 == this.f57472b);
            this.f57474d = readTag2;
            return;
        }
        int tagWireType2 = WireFormat.getTagWireType(this.f57472b);
        if (tagWireType2 != 1) {
            if (tagWireType2 == 2) {
                int readUInt322 = this.f57471a.readUInt32();
                m35353W(readUInt322);
                int totalBytesRead2 = this.f57471a.getTotalBytesRead() + readUInt322;
                do {
                    list.add(Long.valueOf(this.f57471a.readSFixed64()));
                } while (this.f57471a.getTotalBytesRead() < totalBytesRead2);
                return;
            }
            throw InvalidProtocolBufferException.invalidWireType();
        }
        do {
            list.add(Long.valueOf(this.f57471a.readSFixed64()));
            if (this.f57471a.isAtEnd()) {
                return;
            }
            readTag = this.f57471a.readTag();
        } while (readTag == this.f57472b);
        this.f57474d = readTag;
    }

    @Override // com.google.protobuf.InterfaceC8949s
    /* renamed from: k */
    public void mo35129k(List list) {
        int readTag;
        int readTag2;
        if (list instanceof C8936j) {
            C8936j c8936j = (C8936j) list;
            int tagWireType = WireFormat.getTagWireType(this.f57472b);
            if (tagWireType != 0) {
                if (tagWireType == 2) {
                    int totalBytesRead = this.f57471a.getTotalBytesRead() + this.f57471a.readUInt32();
                    do {
                        c8936j.addInt(this.f57471a.readInt32());
                    } while (this.f57471a.getTotalBytesRead() < totalBytesRead);
                    m35356T(totalBytesRead);
                    return;
                }
                throw InvalidProtocolBufferException.invalidWireType();
            }
            do {
                c8936j.addInt(this.f57471a.readInt32());
                if (this.f57471a.isAtEnd()) {
                    return;
                }
                readTag2 = this.f57471a.readTag();
            } while (readTag2 == this.f57472b);
            this.f57474d = readTag2;
            return;
        }
        int tagWireType2 = WireFormat.getTagWireType(this.f57472b);
        if (tagWireType2 != 0) {
            if (tagWireType2 == 2) {
                int totalBytesRead2 = this.f57471a.getTotalBytesRead() + this.f57471a.readUInt32();
                do {
                    list.add(Integer.valueOf(this.f57471a.readInt32()));
                } while (this.f57471a.getTotalBytesRead() < totalBytesRead2);
                m35356T(totalBytesRead2);
                return;
            }
            throw InvalidProtocolBufferException.invalidWireType();
        }
        do {
            list.add(Integer.valueOf(this.f57471a.readInt32()));
            if (this.f57471a.isAtEnd()) {
                return;
            }
            readTag = this.f57471a.readTag();
        } while (readTag == this.f57472b);
        this.f57474d = readTag;
    }

    @Override // com.google.protobuf.InterfaceC8949s
    /* renamed from: l */
    public void mo35128l(List list) {
        int readTag;
        int readTag2;
        if (list instanceof C8936j) {
            C8936j c8936j = (C8936j) list;
            int tagWireType = WireFormat.getTagWireType(this.f57472b);
            if (tagWireType != 2) {
                if (tagWireType == 5) {
                    do {
                        c8936j.addInt(this.f57471a.readFixed32());
                        if (this.f57471a.isAtEnd()) {
                            return;
                        }
                        readTag2 = this.f57471a.readTag();
                    } while (readTag2 == this.f57472b);
                    this.f57474d = readTag2;
                    return;
                }
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int readUInt32 = this.f57471a.readUInt32();
            m35354V(readUInt32);
            int totalBytesRead = this.f57471a.getTotalBytesRead() + readUInt32;
            do {
                c8936j.addInt(this.f57471a.readFixed32());
            } while (this.f57471a.getTotalBytesRead() < totalBytesRead);
            return;
        }
        int tagWireType2 = WireFormat.getTagWireType(this.f57472b);
        if (tagWireType2 != 2) {
            if (tagWireType2 == 5) {
                do {
                    list.add(Integer.valueOf(this.f57471a.readFixed32()));
                    if (this.f57471a.isAtEnd()) {
                        return;
                    }
                    readTag = this.f57471a.readTag();
                } while (readTag == this.f57472b);
                this.f57474d = readTag;
                return;
            }
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int readUInt322 = this.f57471a.readUInt32();
        m35354V(readUInt322);
        int totalBytesRead2 = this.f57471a.getTotalBytesRead() + readUInt322;
        do {
            list.add(Integer.valueOf(this.f57471a.readFixed32()));
        } while (this.f57471a.getTotalBytesRead() < totalBytesRead2);
    }

    @Override // com.google.protobuf.InterfaceC8949s
    /* renamed from: m */
    public int mo35127m() {
        int i = this.f57474d;
        if (i != 0) {
            this.f57472b = i;
            this.f57474d = 0;
        } else {
            this.f57472b = this.f57471a.readTag();
        }
        int i2 = this.f57472b;
        if (i2 != 0 && i2 != this.f57473c) {
            return WireFormat.getTagFieldNumber(i2);
        }
        return Integer.MAX_VALUE;
    }

    @Override // com.google.protobuf.InterfaceC8949s
    /* renamed from: n */
    public void mo35126n(List list) {
        m35357S(list, false);
    }

    @Override // com.google.protobuf.InterfaceC8949s
    /* renamed from: o */
    public void mo35125o(List list) {
        int readTag;
        int readTag2;
        if (list instanceof C8935i) {
            C8935i c8935i = (C8935i) list;
            int tagWireType = WireFormat.getTagWireType(this.f57472b);
            if (tagWireType != 2) {
                if (tagWireType == 5) {
                    do {
                        c8935i.addFloat(this.f57471a.readFloat());
                        if (this.f57471a.isAtEnd()) {
                            return;
                        }
                        readTag2 = this.f57471a.readTag();
                    } while (readTag2 == this.f57472b);
                    this.f57474d = readTag2;
                    return;
                }
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int readUInt32 = this.f57471a.readUInt32();
            m35354V(readUInt32);
            int totalBytesRead = this.f57471a.getTotalBytesRead() + readUInt32;
            do {
                c8935i.addFloat(this.f57471a.readFloat());
            } while (this.f57471a.getTotalBytesRead() < totalBytesRead);
            return;
        }
        int tagWireType2 = WireFormat.getTagWireType(this.f57472b);
        if (tagWireType2 != 2) {
            if (tagWireType2 == 5) {
                do {
                    list.add(Float.valueOf(this.f57471a.readFloat()));
                    if (this.f57471a.isAtEnd()) {
                        return;
                    }
                    readTag = this.f57471a.readTag();
                } while (readTag == this.f57472b);
                this.f57474d = readTag;
                return;
            }
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int readUInt322 = this.f57471a.readUInt32();
        m35354V(readUInt322);
        int totalBytesRead2 = this.f57471a.getTotalBytesRead() + readUInt322;
        do {
            list.add(Float.valueOf(this.f57471a.readFloat()));
        } while (this.f57471a.getTotalBytesRead() < totalBytesRead2);
    }

    @Override // com.google.protobuf.InterfaceC8949s
    /* renamed from: p */
    public boolean mo35124p() {
        int i;
        if (!this.f57471a.isAtEnd() && (i = this.f57472b) != this.f57473c) {
            return this.f57471a.skipField(i);
        }
        return false;
    }

    @Override // com.google.protobuf.InterfaceC8949s
    /* renamed from: q */
    public void mo35123q(List list) {
        int readTag;
        if (WireFormat.getTagWireType(this.f57472b) == 2) {
            do {
                list.add(mo35133g());
                if (this.f57471a.isAtEnd()) {
                    return;
                }
                readTag = this.f57471a.readTag();
            } while (readTag == this.f57472b);
            this.f57474d = readTag;
            return;
        }
        throw InvalidProtocolBufferException.invalidWireType();
    }

    @Override // com.google.protobuf.InterfaceC8949s
    /* renamed from: r */
    public void mo35122r(List list) {
        int readTag;
        int readTag2;
        if (list instanceof C8931f) {
            C8931f c8931f = (C8931f) list;
            int tagWireType = WireFormat.getTagWireType(this.f57472b);
            if (tagWireType != 1) {
                if (tagWireType == 2) {
                    int readUInt32 = this.f57471a.readUInt32();
                    m35353W(readUInt32);
                    int totalBytesRead = this.f57471a.getTotalBytesRead() + readUInt32;
                    do {
                        c8931f.addDouble(this.f57471a.readDouble());
                    } while (this.f57471a.getTotalBytesRead() < totalBytesRead);
                    return;
                }
                throw InvalidProtocolBufferException.invalidWireType();
            }
            do {
                c8931f.addDouble(this.f57471a.readDouble());
                if (this.f57471a.isAtEnd()) {
                    return;
                }
                readTag2 = this.f57471a.readTag();
            } while (readTag2 == this.f57472b);
            this.f57474d = readTag2;
            return;
        }
        int tagWireType2 = WireFormat.getTagWireType(this.f57472b);
        if (tagWireType2 != 1) {
            if (tagWireType2 == 2) {
                int readUInt322 = this.f57471a.readUInt32();
                m35353W(readUInt322);
                int totalBytesRead2 = this.f57471a.getTotalBytesRead() + readUInt322;
                do {
                    list.add(Double.valueOf(this.f57471a.readDouble()));
                } while (this.f57471a.getTotalBytesRead() < totalBytesRead2);
                return;
            }
            throw InvalidProtocolBufferException.invalidWireType();
        }
        do {
            list.add(Double.valueOf(this.f57471a.readDouble()));
            if (this.f57471a.isAtEnd()) {
                return;
            }
            readTag = this.f57471a.readTag();
        } while (readTag == this.f57472b);
        this.f57474d = readTag;
    }

    @Override // com.google.protobuf.InterfaceC8949s
    public double readDouble() {
        m35355U(1);
        return this.f57471a.readDouble();
    }

    @Override // com.google.protobuf.InterfaceC8949s
    public float readFloat() {
        m35355U(5);
        return this.f57471a.readFloat();
    }

    @Override // com.google.protobuf.InterfaceC8949s
    public int readInt32() {
        m35355U(0);
        return this.f57471a.readInt32();
    }

    @Override // com.google.protobuf.InterfaceC8949s
    public long readInt64() {
        m35355U(0);
        return this.f57471a.readInt64();
    }

    @Override // com.google.protobuf.InterfaceC8949s
    public String readString() {
        m35355U(2);
        return this.f57471a.readString();
    }

    @Override // com.google.protobuf.InterfaceC8949s
    /* renamed from: s */
    public long mo35121s() {
        m35355U(1);
        return this.f57471a.readFixed64();
    }

    @Override // com.google.protobuf.InterfaceC8949s
    /* renamed from: t */
    public void mo35120t(List list) {
        int readTag;
        int readTag2;
        if (list instanceof C8936j) {
            C8936j c8936j = (C8936j) list;
            int tagWireType = WireFormat.getTagWireType(this.f57472b);
            if (tagWireType != 2) {
                if (tagWireType == 5) {
                    do {
                        c8936j.addInt(this.f57471a.readSFixed32());
                        if (this.f57471a.isAtEnd()) {
                            return;
                        }
                        readTag2 = this.f57471a.readTag();
                    } while (readTag2 == this.f57472b);
                    this.f57474d = readTag2;
                    return;
                }
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int readUInt32 = this.f57471a.readUInt32();
            m35354V(readUInt32);
            int totalBytesRead = this.f57471a.getTotalBytesRead() + readUInt32;
            do {
                c8936j.addInt(this.f57471a.readSFixed32());
            } while (this.f57471a.getTotalBytesRead() < totalBytesRead);
            return;
        }
        int tagWireType2 = WireFormat.getTagWireType(this.f57472b);
        if (tagWireType2 != 2) {
            if (tagWireType2 == 5) {
                do {
                    list.add(Integer.valueOf(this.f57471a.readSFixed32()));
                    if (this.f57471a.isAtEnd()) {
                        return;
                    }
                    readTag = this.f57471a.readTag();
                } while (readTag == this.f57472b);
                this.f57474d = readTag;
                return;
            }
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int readUInt322 = this.f57471a.readUInt32();
        m35354V(readUInt322);
        int totalBytesRead2 = this.f57471a.getTotalBytesRead() + readUInt322;
        do {
            list.add(Integer.valueOf(this.f57471a.readSFixed32()));
        } while (this.f57471a.getTotalBytesRead() < totalBytesRead2);
    }

    @Override // com.google.protobuf.InterfaceC8949s
    /* renamed from: u */
    public boolean mo35119u() {
        m35355U(0);
        return this.f57471a.readBool();
    }

    @Override // com.google.protobuf.InterfaceC8949s
    /* renamed from: v */
    public void mo35118v(List list) {
        int readTag;
        int readTag2;
        if (list instanceof C8941l) {
            C8941l c8941l = (C8941l) list;
            int tagWireType = WireFormat.getTagWireType(this.f57472b);
            if (tagWireType != 0) {
                if (tagWireType == 2) {
                    int totalBytesRead = this.f57471a.getTotalBytesRead() + this.f57471a.readUInt32();
                    do {
                        c8941l.addLong(this.f57471a.readUInt64());
                    } while (this.f57471a.getTotalBytesRead() < totalBytesRead);
                    m35356T(totalBytesRead);
                    return;
                }
                throw InvalidProtocolBufferException.invalidWireType();
            }
            do {
                c8941l.addLong(this.f57471a.readUInt64());
                if (this.f57471a.isAtEnd()) {
                    return;
                }
                readTag2 = this.f57471a.readTag();
            } while (readTag2 == this.f57472b);
            this.f57474d = readTag2;
            return;
        }
        int tagWireType2 = WireFormat.getTagWireType(this.f57472b);
        if (tagWireType2 != 0) {
            if (tagWireType2 == 2) {
                int totalBytesRead2 = this.f57471a.getTotalBytesRead() + this.f57471a.readUInt32();
                do {
                    list.add(Long.valueOf(this.f57471a.readUInt64()));
                } while (this.f57471a.getTotalBytesRead() < totalBytesRead2);
                m35356T(totalBytesRead2);
                return;
            }
            throw InvalidProtocolBufferException.invalidWireType();
        }
        do {
            list.add(Long.valueOf(this.f57471a.readUInt64()));
            if (this.f57471a.isAtEnd()) {
                return;
            }
            readTag = this.f57471a.readTag();
        } while (readTag == this.f57472b);
        this.f57474d = readTag;
    }

    @Override // com.google.protobuf.InterfaceC8949s
    /* renamed from: w */
    public void mo35117w(List list) {
        int readTag;
        int readTag2;
        if (list instanceof C8941l) {
            C8941l c8941l = (C8941l) list;
            int tagWireType = WireFormat.getTagWireType(this.f57472b);
            if (tagWireType != 0) {
                if (tagWireType == 2) {
                    int totalBytesRead = this.f57471a.getTotalBytesRead() + this.f57471a.readUInt32();
                    do {
                        c8941l.addLong(this.f57471a.readInt64());
                    } while (this.f57471a.getTotalBytesRead() < totalBytesRead);
                    m35356T(totalBytesRead);
                    return;
                }
                throw InvalidProtocolBufferException.invalidWireType();
            }
            do {
                c8941l.addLong(this.f57471a.readInt64());
                if (this.f57471a.isAtEnd()) {
                    return;
                }
                readTag2 = this.f57471a.readTag();
            } while (readTag2 == this.f57472b);
            this.f57474d = readTag2;
            return;
        }
        int tagWireType2 = WireFormat.getTagWireType(this.f57472b);
        if (tagWireType2 != 0) {
            if (tagWireType2 == 2) {
                int totalBytesRead2 = this.f57471a.getTotalBytesRead() + this.f57471a.readUInt32();
                do {
                    list.add(Long.valueOf(this.f57471a.readInt64()));
                } while (this.f57471a.getTotalBytesRead() < totalBytesRead2);
                m35356T(totalBytesRead2);
                return;
            }
            throw InvalidProtocolBufferException.invalidWireType();
        }
        do {
            list.add(Long.valueOf(this.f57471a.readInt64()));
            if (this.f57471a.isAtEnd()) {
                return;
            }
            readTag = this.f57471a.readTag();
        } while (readTag == this.f57472b);
        this.f57474d = readTag;
    }

    @Override // com.google.protobuf.InterfaceC8949s
    /* renamed from: x */
    public void mo35116x(List list) {
        int readTag;
        int readTag2;
        if (list instanceof C8936j) {
            C8936j c8936j = (C8936j) list;
            int tagWireType = WireFormat.getTagWireType(this.f57472b);
            if (tagWireType != 0) {
                if (tagWireType == 2) {
                    int totalBytesRead = this.f57471a.getTotalBytesRead() + this.f57471a.readUInt32();
                    do {
                        c8936j.addInt(this.f57471a.readEnum());
                    } while (this.f57471a.getTotalBytesRead() < totalBytesRead);
                    m35356T(totalBytesRead);
                    return;
                }
                throw InvalidProtocolBufferException.invalidWireType();
            }
            do {
                c8936j.addInt(this.f57471a.readEnum());
                if (this.f57471a.isAtEnd()) {
                    return;
                }
                readTag2 = this.f57471a.readTag();
            } while (readTag2 == this.f57472b);
            this.f57474d = readTag2;
            return;
        }
        int tagWireType2 = WireFormat.getTagWireType(this.f57472b);
        if (tagWireType2 != 0) {
            if (tagWireType2 == 2) {
                int totalBytesRead2 = this.f57471a.getTotalBytesRead() + this.f57471a.readUInt32();
                do {
                    list.add(Integer.valueOf(this.f57471a.readEnum()));
                } while (this.f57471a.getTotalBytesRead() < totalBytesRead2);
                m35356T(totalBytesRead2);
                return;
            }
            throw InvalidProtocolBufferException.invalidWireType();
        }
        do {
            list.add(Integer.valueOf(this.f57471a.readEnum()));
            if (this.f57471a.isAtEnd()) {
                return;
            }
            readTag = this.f57471a.readTag();
        } while (readTag == this.f57472b);
        this.f57474d = readTag;
    }

    @Override // com.google.protobuf.InterfaceC8949s
    /* renamed from: y */
    public void mo35115y(List list) {
        m35357S(list, true);
    }

    @Override // com.google.protobuf.InterfaceC8949s
    /* renamed from: z */
    public void mo35114z(List list) {
        int readTag;
        int readTag2;
        if (list instanceof C8941l) {
            C8941l c8941l = (C8941l) list;
            int tagWireType = WireFormat.getTagWireType(this.f57472b);
            if (tagWireType != 1) {
                if (tagWireType == 2) {
                    int readUInt32 = this.f57471a.readUInt32();
                    m35353W(readUInt32);
                    int totalBytesRead = this.f57471a.getTotalBytesRead() + readUInt32;
                    do {
                        c8941l.addLong(this.f57471a.readFixed64());
                    } while (this.f57471a.getTotalBytesRead() < totalBytesRead);
                    return;
                }
                throw InvalidProtocolBufferException.invalidWireType();
            }
            do {
                c8941l.addLong(this.f57471a.readFixed64());
                if (this.f57471a.isAtEnd()) {
                    return;
                }
                readTag2 = this.f57471a.readTag();
            } while (readTag2 == this.f57472b);
            this.f57474d = readTag2;
            return;
        }
        int tagWireType2 = WireFormat.getTagWireType(this.f57472b);
        if (tagWireType2 != 1) {
            if (tagWireType2 == 2) {
                int readUInt322 = this.f57471a.readUInt32();
                m35353W(readUInt322);
                int totalBytesRead2 = this.f57471a.getTotalBytesRead() + readUInt322;
                do {
                    list.add(Long.valueOf(this.f57471a.readFixed64()));
                } while (this.f57471a.getTotalBytesRead() < totalBytesRead2);
                return;
            }
            throw InvalidProtocolBufferException.invalidWireType();
        }
        do {
            list.add(Long.valueOf(this.f57471a.readFixed64()));
            if (this.f57471a.isAtEnd()) {
                return;
            }
            readTag = this.f57471a.readTag();
        } while (readTag == this.f57472b);
        this.f57474d = readTag;
    }
}