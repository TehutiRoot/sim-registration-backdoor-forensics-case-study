package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.WireFormat;
import java.util.List;

/* renamed from: androidx.datastore.preferences.protobuf.e */
/* loaded from: classes2.dex */
public final class C4430e implements InterfaceC4453u {

    /* renamed from: a */
    public final CodedInputStream f34926a;

    /* renamed from: b */
    public int f34927b;

    /* renamed from: c */
    public int f34928c;

    /* renamed from: d */
    public int f34929d = 0;

    /* renamed from: androidx.datastore.preferences.protobuf.e$a */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class C4431a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f34930a;

        static {
            int[] iArr = new int[WireFormat.FieldType.values().length];
            f34930a = iArr;
            try {
                iArr[WireFormat.FieldType.BOOL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f34930a[WireFormat.FieldType.BYTES.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f34930a[WireFormat.FieldType.DOUBLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f34930a[WireFormat.FieldType.ENUM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f34930a[WireFormat.FieldType.FIXED32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f34930a[WireFormat.FieldType.FIXED64.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f34930a[WireFormat.FieldType.FLOAT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f34930a[WireFormat.FieldType.INT32.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f34930a[WireFormat.FieldType.INT64.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f34930a[WireFormat.FieldType.MESSAGE.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f34930a[WireFormat.FieldType.SFIXED32.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f34930a[WireFormat.FieldType.SFIXED64.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f34930a[WireFormat.FieldType.SINT32.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f34930a[WireFormat.FieldType.SINT64.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f34930a[WireFormat.FieldType.STRING.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f34930a[WireFormat.FieldType.UINT32.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f34930a[WireFormat.FieldType.UINT64.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
        }
    }

    public C4430e(CodedInputStream codedInputStream) {
        CodedInputStream codedInputStream2 = (CodedInputStream) Internal.m55729b(codedInputStream, "input");
        this.f34926a = codedInputStream2;
        codedInputStream2.f34679d = this;
    }

    /* renamed from: M */
    public static C4430e m55263M(CodedInputStream codedInputStream) {
        C4430e c4430e = codedInputStream.f34679d;
        if (c4430e != null) {
            return c4430e;
        }
        return new C4430e(codedInputStream);
    }

    /* renamed from: N */
    private Object m55262N(WireFormat.FieldType fieldType, Class cls, ExtensionRegistryLite extensionRegistryLite) {
        switch (C4431a.f34930a[fieldType.ordinal()]) {
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

    /* renamed from: O */
    private Object m55261O(InterfaceC4454v interfaceC4454v, ExtensionRegistryLite extensionRegistryLite) {
        int i = this.f34928c;
        this.f34928c = WireFormat.m55338a(WireFormat.getTagFieldNumber(this.f34927b), 4);
        try {
            Object newInstance = interfaceC4454v.newInstance();
            interfaceC4454v.mo55015h(newInstance, this, extensionRegistryLite);
            interfaceC4454v.mo55018e(newInstance);
            if (this.f34927b == this.f34928c) {
                return newInstance;
            }
            throw InvalidProtocolBufferException.parseFailure();
        } finally {
            this.f34928c = i;
        }
    }

    /* renamed from: P */
    private Object m55260P(InterfaceC4454v interfaceC4454v, ExtensionRegistryLite extensionRegistryLite) {
        CodedInputStream codedInputStream;
        int readUInt32 = this.f34926a.readUInt32();
        CodedInputStream codedInputStream2 = this.f34926a;
        if (codedInputStream2.f34676a < codedInputStream2.f34677b) {
            int pushLimit = codedInputStream2.pushLimit(readUInt32);
            Object newInstance = interfaceC4454v.newInstance();
            this.f34926a.f34676a++;
            interfaceC4454v.mo55015h(newInstance, this, extensionRegistryLite);
            interfaceC4454v.mo55018e(newInstance);
            this.f34926a.checkLastTagWas(0);
            codedInputStream.f34676a--;
            this.f34926a.popLimit(pushLimit);
            return newInstance;
        }
        throw InvalidProtocolBufferException.recursionLimitExceeded();
    }

    /* renamed from: R */
    private void m55258R(int i) {
        if (this.f34926a.getTotalBytesRead() == i) {
            return;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    /* renamed from: S */
    private void m55257S(int i) {
        if (WireFormat.getTagWireType(this.f34927b) == i) {
            return;
        }
        throw InvalidProtocolBufferException.invalidWireType();
    }

    /* renamed from: T */
    private void m55256T(int i) {
        if ((i & 3) == 0) {
            return;
        }
        throw InvalidProtocolBufferException.parseFailure();
    }

    /* renamed from: U */
    private void m55255U(int i) {
        if ((i & 7) == 0) {
            return;
        }
        throw InvalidProtocolBufferException.parseFailure();
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC4453u
    /* renamed from: A */
    public void mo55060A(List list) {
        int readTag;
        int readTag2;
        if (list instanceof C4439k) {
            C4439k c4439k = (C4439k) list;
            int tagWireType = WireFormat.getTagWireType(this.f34927b);
            if (tagWireType != 0) {
                if (tagWireType == 2) {
                    int totalBytesRead = this.f34926a.getTotalBytesRead() + this.f34926a.readUInt32();
                    do {
                        c4439k.addInt(this.f34926a.readUInt32());
                    } while (this.f34926a.getTotalBytesRead() < totalBytesRead);
                    m55258R(totalBytesRead);
                    return;
                }
                throw InvalidProtocolBufferException.invalidWireType();
            }
            do {
                c4439k.addInt(this.f34926a.readUInt32());
                if (this.f34926a.isAtEnd()) {
                    return;
                }
                readTag2 = this.f34926a.readTag();
            } while (readTag2 == this.f34927b);
            this.f34929d = readTag2;
            return;
        }
        int tagWireType2 = WireFormat.getTagWireType(this.f34927b);
        if (tagWireType2 != 0) {
            if (tagWireType2 == 2) {
                int totalBytesRead2 = this.f34926a.getTotalBytesRead() + this.f34926a.readUInt32();
                do {
                    list.add(Integer.valueOf(this.f34926a.readUInt32()));
                } while (this.f34926a.getTotalBytesRead() < totalBytesRead2);
                m55258R(totalBytesRead2);
                return;
            }
            throw InvalidProtocolBufferException.invalidWireType();
        }
        do {
            list.add(Integer.valueOf(this.f34926a.readUInt32()));
            if (this.f34926a.isAtEnd()) {
                return;
            }
            readTag = this.f34926a.readTag();
        } while (readTag == this.f34927b);
        this.f34929d = readTag;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC4453u
    /* renamed from: B */
    public int mo55059B() {
        m55257S(5);
        return this.f34926a.readFixed32();
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC4453u
    /* renamed from: C */
    public long mo55058C() {
        m55257S(0);
        return this.f34926a.readSInt64();
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC4453u
    /* renamed from: D */
    public int mo55057D() {
        m55257S(5);
        return this.f34926a.readSFixed32();
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC4453u
    /* renamed from: E */
    public String mo55056E() {
        m55257S(2);
        return this.f34926a.readStringRequireUtf8();
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC4453u
    /* renamed from: F */
    public Object mo55055F(InterfaceC4454v interfaceC4454v, ExtensionRegistryLite extensionRegistryLite) {
        m55257S(3);
        return m55261O(interfaceC4454v, extensionRegistryLite);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC4453u
    /* renamed from: G */
    public Object mo55054G(Class cls, ExtensionRegistryLite extensionRegistryLite) {
        m55257S(2);
        return m55260P(C17942Ko1.m67586a().m67583d(cls), extensionRegistryLite);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC4453u
    /* renamed from: H */
    public Object mo55053H(InterfaceC4454v interfaceC4454v, ExtensionRegistryLite extensionRegistryLite) {
        m55257S(2);
        return m55260P(interfaceC4454v, extensionRegistryLite);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC4453u
    /* renamed from: I */
    public void mo55052I(List list, InterfaceC4454v interfaceC4454v, ExtensionRegistryLite extensionRegistryLite) {
        int readTag;
        if (WireFormat.getTagWireType(this.f34927b) == 2) {
            int i = this.f34927b;
            do {
                list.add(m55260P(interfaceC4454v, extensionRegistryLite));
                if (!this.f34926a.isAtEnd() && this.f34929d == 0) {
                    readTag = this.f34926a.readTag();
                } else {
                    return;
                }
            } while (readTag == i);
            this.f34929d = readTag;
            return;
        }
        throw InvalidProtocolBufferException.invalidWireType();
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC4453u
    /* renamed from: J */
    public Object mo55051J(Class cls, ExtensionRegistryLite extensionRegistryLite) {
        m55257S(3);
        return m55261O(C17942Ko1.m67586a().m67583d(cls), extensionRegistryLite);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x005e, code lost:
        r8.put(r2, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0061, code lost:
        r7.f34926a.popLimit(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0066, code lost:
        return;
     */
    @Override // androidx.datastore.preferences.protobuf.InterfaceC4453u
    /* renamed from: K */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void mo55050K(java.util.Map r8, androidx.datastore.preferences.protobuf.MapEntryLite.C4386b r9, androidx.datastore.preferences.protobuf.ExtensionRegistryLite r10) {
        /*
            r7 = this;
            r0 = 2
            r7.m55257S(r0)
            androidx.datastore.preferences.protobuf.CodedInputStream r1 = r7.f34926a
            int r1 = r1.readUInt32()
            androidx.datastore.preferences.protobuf.CodedInputStream r2 = r7.f34926a
            int r1 = r2.pushLimit(r1)
            java.lang.Object r2 = r9.f34848b
            java.lang.Object r3 = r9.f34850d
        L14:
            int r4 = r7.mo55036m()     // Catch: java.lang.Throwable -> L3a
            r5 = 2147483647(0x7fffffff, float:NaN)
            if (r4 == r5) goto L5e
            androidx.datastore.preferences.protobuf.CodedInputStream r5 = r7.f34926a     // Catch: java.lang.Throwable -> L3a
            boolean r5 = r5.isAtEnd()     // Catch: java.lang.Throwable -> L3a
            if (r5 == 0) goto L26
            goto L5e
        L26:
            r5 = 1
            java.lang.String r6 = "Unable to parse map entry."
            if (r4 == r5) goto L49
            if (r4 == r0) goto L3c
            boolean r4 = r7.mo55033p()     // Catch: java.lang.Throwable -> L3a androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L51
            if (r4 == 0) goto L34
            goto L14
        L34:
            androidx.datastore.preferences.protobuf.InvalidProtocolBufferException r4 = new androidx.datastore.preferences.protobuf.InvalidProtocolBufferException     // Catch: java.lang.Throwable -> L3a androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L51
            r4.<init>(r6)     // Catch: java.lang.Throwable -> L3a androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L51
            throw r4     // Catch: java.lang.Throwable -> L3a androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L51
        L3a:
            r8 = move-exception
            goto L67
        L3c:
            androidx.datastore.preferences.protobuf.WireFormat$FieldType r4 = r9.f34849c     // Catch: java.lang.Throwable -> L3a androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L51
            java.lang.Object r5 = r9.f34850d     // Catch: java.lang.Throwable -> L3a androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L51
            java.lang.Class r5 = r5.getClass()     // Catch: java.lang.Throwable -> L3a androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L51
            java.lang.Object r3 = r7.m55262N(r4, r5, r10)     // Catch: java.lang.Throwable -> L3a androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L51
            goto L14
        L49:
            androidx.datastore.preferences.protobuf.WireFormat$FieldType r4 = r9.f34847a     // Catch: java.lang.Throwable -> L3a androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L51
            r5 = 0
            java.lang.Object r2 = r7.m55262N(r4, r5, r5)     // Catch: java.lang.Throwable -> L3a androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L51
            goto L14
        L51:
            boolean r4 = r7.mo55033p()     // Catch: java.lang.Throwable -> L3a
            if (r4 == 0) goto L58
            goto L14
        L58:
            androidx.datastore.preferences.protobuf.InvalidProtocolBufferException r8 = new androidx.datastore.preferences.protobuf.InvalidProtocolBufferException     // Catch: java.lang.Throwable -> L3a
            r8.<init>(r6)     // Catch: java.lang.Throwable -> L3a
            throw r8     // Catch: java.lang.Throwable -> L3a
        L5e:
            r8.put(r2, r3)     // Catch: java.lang.Throwable -> L3a
            androidx.datastore.preferences.protobuf.CodedInputStream r8 = r7.f34926a
            r8.popLimit(r1)
            return
        L67:
            androidx.datastore.preferences.protobuf.CodedInputStream r9 = r7.f34926a
            r9.popLimit(r1)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.C4430e.mo55050K(java.util.Map, androidx.datastore.preferences.protobuf.MapEntryLite$b, androidx.datastore.preferences.protobuf.ExtensionRegistryLite):void");
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC4453u
    /* renamed from: L */
    public void mo55049L(List list, InterfaceC4454v interfaceC4454v, ExtensionRegistryLite extensionRegistryLite) {
        int readTag;
        if (WireFormat.getTagWireType(this.f34927b) == 3) {
            int i = this.f34927b;
            do {
                list.add(m55261O(interfaceC4454v, extensionRegistryLite));
                if (!this.f34926a.isAtEnd() && this.f34929d == 0) {
                    readTag = this.f34926a.readTag();
                } else {
                    return;
                }
            } while (readTag == i);
            this.f34929d = readTag;
            return;
        }
        throw InvalidProtocolBufferException.invalidWireType();
    }

    /* renamed from: Q */
    public void m55259Q(List list, boolean z) {
        String readString;
        int readTag;
        int readTag2;
        if (WireFormat.getTagWireType(this.f34927b) == 2) {
            if ((list instanceof LazyStringList) && !z) {
                LazyStringList lazyStringList = (LazyStringList) list;
                do {
                    lazyStringList.add(mo55042g());
                    if (this.f34926a.isAtEnd()) {
                        return;
                    }
                    readTag2 = this.f34926a.readTag();
                } while (readTag2 == this.f34927b);
                this.f34929d = readTag2;
                return;
            }
            do {
                if (z) {
                    readString = mo55056E();
                } else {
                    readString = readString();
                }
                list.add(readString);
                if (this.f34926a.isAtEnd()) {
                    return;
                }
                readTag = this.f34926a.readTag();
            } while (readTag == this.f34927b);
            this.f34929d = readTag;
            return;
        }
        throw InvalidProtocolBufferException.invalidWireType();
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC4453u
    /* renamed from: a */
    public void mo55048a(List list) {
        int readTag;
        int readTag2;
        if (list instanceof C4444m) {
            C4444m c4444m = (C4444m) list;
            int tagWireType = WireFormat.getTagWireType(this.f34927b);
            if (tagWireType != 0) {
                if (tagWireType == 2) {
                    int totalBytesRead = this.f34926a.getTotalBytesRead() + this.f34926a.readUInt32();
                    do {
                        c4444m.addLong(this.f34926a.readSInt64());
                    } while (this.f34926a.getTotalBytesRead() < totalBytesRead);
                    m55258R(totalBytesRead);
                    return;
                }
                throw InvalidProtocolBufferException.invalidWireType();
            }
            do {
                c4444m.addLong(this.f34926a.readSInt64());
                if (this.f34926a.isAtEnd()) {
                    return;
                }
                readTag2 = this.f34926a.readTag();
            } while (readTag2 == this.f34927b);
            this.f34929d = readTag2;
            return;
        }
        int tagWireType2 = WireFormat.getTagWireType(this.f34927b);
        if (tagWireType2 != 0) {
            if (tagWireType2 == 2) {
                int totalBytesRead2 = this.f34926a.getTotalBytesRead() + this.f34926a.readUInt32();
                do {
                    list.add(Long.valueOf(this.f34926a.readSInt64()));
                } while (this.f34926a.getTotalBytesRead() < totalBytesRead2);
                m55258R(totalBytesRead2);
                return;
            }
            throw InvalidProtocolBufferException.invalidWireType();
        }
        do {
            list.add(Long.valueOf(this.f34926a.readSInt64()));
            if (this.f34926a.isAtEnd()) {
                return;
            }
            readTag = this.f34926a.readTag();
        } while (readTag == this.f34927b);
        this.f34929d = readTag;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC4453u
    /* renamed from: b */
    public long mo55047b() {
        m55257S(1);
        return this.f34926a.readSFixed64();
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC4453u
    /* renamed from: c */
    public int mo55046c() {
        m55257S(0);
        return this.f34926a.readUInt32();
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC4453u
    /* renamed from: d */
    public int mo55045d() {
        m55257S(0);
        return this.f34926a.readEnum();
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC4453u
    /* renamed from: e */
    public int mo55044e() {
        m55257S(0);
        return this.f34926a.readSInt32();
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC4453u
    /* renamed from: f */
    public void mo55043f(List list) {
        int readTag;
        int readTag2;
        if (list instanceof C4429d) {
            C4429d c4429d = (C4429d) list;
            int tagWireType = WireFormat.getTagWireType(this.f34927b);
            if (tagWireType != 0) {
                if (tagWireType == 2) {
                    int totalBytesRead = this.f34926a.getTotalBytesRead() + this.f34926a.readUInt32();
                    do {
                        c4429d.addBoolean(this.f34926a.readBool());
                    } while (this.f34926a.getTotalBytesRead() < totalBytesRead);
                    m55258R(totalBytesRead);
                    return;
                }
                throw InvalidProtocolBufferException.invalidWireType();
            }
            do {
                c4429d.addBoolean(this.f34926a.readBool());
                if (this.f34926a.isAtEnd()) {
                    return;
                }
                readTag2 = this.f34926a.readTag();
            } while (readTag2 == this.f34927b);
            this.f34929d = readTag2;
            return;
        }
        int tagWireType2 = WireFormat.getTagWireType(this.f34927b);
        if (tagWireType2 != 0) {
            if (tagWireType2 == 2) {
                int totalBytesRead2 = this.f34926a.getTotalBytesRead() + this.f34926a.readUInt32();
                do {
                    list.add(Boolean.valueOf(this.f34926a.readBool()));
                } while (this.f34926a.getTotalBytesRead() < totalBytesRead2);
                m55258R(totalBytesRead2);
                return;
            }
            throw InvalidProtocolBufferException.invalidWireType();
        }
        do {
            list.add(Boolean.valueOf(this.f34926a.readBool()));
            if (this.f34926a.isAtEnd()) {
                return;
            }
            readTag = this.f34926a.readTag();
        } while (readTag == this.f34927b);
        this.f34929d = readTag;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC4453u
    /* renamed from: g */
    public ByteString mo55042g() {
        m55257S(2);
        return this.f34926a.readBytes();
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC4453u
    public int getTag() {
        return this.f34927b;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC4453u
    /* renamed from: h */
    public void mo55041h(List list) {
        int readTag;
        int readTag2;
        if (list instanceof C4439k) {
            C4439k c4439k = (C4439k) list;
            int tagWireType = WireFormat.getTagWireType(this.f34927b);
            if (tagWireType != 0) {
                if (tagWireType == 2) {
                    int totalBytesRead = this.f34926a.getTotalBytesRead() + this.f34926a.readUInt32();
                    do {
                        c4439k.addInt(this.f34926a.readSInt32());
                    } while (this.f34926a.getTotalBytesRead() < totalBytesRead);
                    m55258R(totalBytesRead);
                    return;
                }
                throw InvalidProtocolBufferException.invalidWireType();
            }
            do {
                c4439k.addInt(this.f34926a.readSInt32());
                if (this.f34926a.isAtEnd()) {
                    return;
                }
                readTag2 = this.f34926a.readTag();
            } while (readTag2 == this.f34927b);
            this.f34929d = readTag2;
            return;
        }
        int tagWireType2 = WireFormat.getTagWireType(this.f34927b);
        if (tagWireType2 != 0) {
            if (tagWireType2 == 2) {
                int totalBytesRead2 = this.f34926a.getTotalBytesRead() + this.f34926a.readUInt32();
                do {
                    list.add(Integer.valueOf(this.f34926a.readSInt32()));
                } while (this.f34926a.getTotalBytesRead() < totalBytesRead2);
                m55258R(totalBytesRead2);
                return;
            }
            throw InvalidProtocolBufferException.invalidWireType();
        }
        do {
            list.add(Integer.valueOf(this.f34926a.readSInt32()));
            if (this.f34926a.isAtEnd()) {
                return;
            }
            readTag = this.f34926a.readTag();
        } while (readTag == this.f34927b);
        this.f34929d = readTag;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC4453u
    /* renamed from: i */
    public long mo55040i() {
        m55257S(0);
        return this.f34926a.readUInt64();
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC4453u
    /* renamed from: j */
    public void mo55039j(List list) {
        int readTag;
        int readTag2;
        if (list instanceof C4444m) {
            C4444m c4444m = (C4444m) list;
            int tagWireType = WireFormat.getTagWireType(this.f34927b);
            if (tagWireType != 1) {
                if (tagWireType == 2) {
                    int readUInt32 = this.f34926a.readUInt32();
                    m55255U(readUInt32);
                    int totalBytesRead = this.f34926a.getTotalBytesRead() + readUInt32;
                    do {
                        c4444m.addLong(this.f34926a.readSFixed64());
                    } while (this.f34926a.getTotalBytesRead() < totalBytesRead);
                    return;
                }
                throw InvalidProtocolBufferException.invalidWireType();
            }
            do {
                c4444m.addLong(this.f34926a.readSFixed64());
                if (this.f34926a.isAtEnd()) {
                    return;
                }
                readTag2 = this.f34926a.readTag();
            } while (readTag2 == this.f34927b);
            this.f34929d = readTag2;
            return;
        }
        int tagWireType2 = WireFormat.getTagWireType(this.f34927b);
        if (tagWireType2 != 1) {
            if (tagWireType2 == 2) {
                int readUInt322 = this.f34926a.readUInt32();
                m55255U(readUInt322);
                int totalBytesRead2 = this.f34926a.getTotalBytesRead() + readUInt322;
                do {
                    list.add(Long.valueOf(this.f34926a.readSFixed64()));
                } while (this.f34926a.getTotalBytesRead() < totalBytesRead2);
                return;
            }
            throw InvalidProtocolBufferException.invalidWireType();
        }
        do {
            list.add(Long.valueOf(this.f34926a.readSFixed64()));
            if (this.f34926a.isAtEnd()) {
                return;
            }
            readTag = this.f34926a.readTag();
        } while (readTag == this.f34927b);
        this.f34929d = readTag;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC4453u
    /* renamed from: k */
    public void mo55038k(List list) {
        int readTag;
        int readTag2;
        if (list instanceof C4439k) {
            C4439k c4439k = (C4439k) list;
            int tagWireType = WireFormat.getTagWireType(this.f34927b);
            if (tagWireType != 0) {
                if (tagWireType == 2) {
                    int totalBytesRead = this.f34926a.getTotalBytesRead() + this.f34926a.readUInt32();
                    do {
                        c4439k.addInt(this.f34926a.readInt32());
                    } while (this.f34926a.getTotalBytesRead() < totalBytesRead);
                    m55258R(totalBytesRead);
                    return;
                }
                throw InvalidProtocolBufferException.invalidWireType();
            }
            do {
                c4439k.addInt(this.f34926a.readInt32());
                if (this.f34926a.isAtEnd()) {
                    return;
                }
                readTag2 = this.f34926a.readTag();
            } while (readTag2 == this.f34927b);
            this.f34929d = readTag2;
            return;
        }
        int tagWireType2 = WireFormat.getTagWireType(this.f34927b);
        if (tagWireType2 != 0) {
            if (tagWireType2 == 2) {
                int totalBytesRead2 = this.f34926a.getTotalBytesRead() + this.f34926a.readUInt32();
                do {
                    list.add(Integer.valueOf(this.f34926a.readInt32()));
                } while (this.f34926a.getTotalBytesRead() < totalBytesRead2);
                m55258R(totalBytesRead2);
                return;
            }
            throw InvalidProtocolBufferException.invalidWireType();
        }
        do {
            list.add(Integer.valueOf(this.f34926a.readInt32()));
            if (this.f34926a.isAtEnd()) {
                return;
            }
            readTag = this.f34926a.readTag();
        } while (readTag == this.f34927b);
        this.f34929d = readTag;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC4453u
    /* renamed from: l */
    public void mo55037l(List list) {
        int readTag;
        int readTag2;
        if (list instanceof C4439k) {
            C4439k c4439k = (C4439k) list;
            int tagWireType = WireFormat.getTagWireType(this.f34927b);
            if (tagWireType != 2) {
                if (tagWireType == 5) {
                    do {
                        c4439k.addInt(this.f34926a.readFixed32());
                        if (this.f34926a.isAtEnd()) {
                            return;
                        }
                        readTag2 = this.f34926a.readTag();
                    } while (readTag2 == this.f34927b);
                    this.f34929d = readTag2;
                    return;
                }
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int readUInt32 = this.f34926a.readUInt32();
            m55256T(readUInt32);
            int totalBytesRead = this.f34926a.getTotalBytesRead() + readUInt32;
            do {
                c4439k.addInt(this.f34926a.readFixed32());
            } while (this.f34926a.getTotalBytesRead() < totalBytesRead);
            return;
        }
        int tagWireType2 = WireFormat.getTagWireType(this.f34927b);
        if (tagWireType2 != 2) {
            if (tagWireType2 == 5) {
                do {
                    list.add(Integer.valueOf(this.f34926a.readFixed32()));
                    if (this.f34926a.isAtEnd()) {
                        return;
                    }
                    readTag = this.f34926a.readTag();
                } while (readTag == this.f34927b);
                this.f34929d = readTag;
                return;
            }
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int readUInt322 = this.f34926a.readUInt32();
        m55256T(readUInt322);
        int totalBytesRead2 = this.f34926a.getTotalBytesRead() + readUInt322;
        do {
            list.add(Integer.valueOf(this.f34926a.readFixed32()));
        } while (this.f34926a.getTotalBytesRead() < totalBytesRead2);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC4453u
    /* renamed from: m */
    public int mo55036m() {
        int i = this.f34929d;
        if (i != 0) {
            this.f34927b = i;
            this.f34929d = 0;
        } else {
            this.f34927b = this.f34926a.readTag();
        }
        int i2 = this.f34927b;
        if (i2 != 0 && i2 != this.f34928c) {
            return WireFormat.getTagFieldNumber(i2);
        }
        return Integer.MAX_VALUE;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC4453u
    /* renamed from: n */
    public void mo55035n(List list) {
        m55259Q(list, false);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC4453u
    /* renamed from: o */
    public void mo55034o(List list) {
        int readTag;
        int readTag2;
        if (list instanceof C4438j) {
            C4438j c4438j = (C4438j) list;
            int tagWireType = WireFormat.getTagWireType(this.f34927b);
            if (tagWireType != 2) {
                if (tagWireType == 5) {
                    do {
                        c4438j.addFloat(this.f34926a.readFloat());
                        if (this.f34926a.isAtEnd()) {
                            return;
                        }
                        readTag2 = this.f34926a.readTag();
                    } while (readTag2 == this.f34927b);
                    this.f34929d = readTag2;
                    return;
                }
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int readUInt32 = this.f34926a.readUInt32();
            m55256T(readUInt32);
            int totalBytesRead = this.f34926a.getTotalBytesRead() + readUInt32;
            do {
                c4438j.addFloat(this.f34926a.readFloat());
            } while (this.f34926a.getTotalBytesRead() < totalBytesRead);
            return;
        }
        int tagWireType2 = WireFormat.getTagWireType(this.f34927b);
        if (tagWireType2 != 2) {
            if (tagWireType2 == 5) {
                do {
                    list.add(Float.valueOf(this.f34926a.readFloat()));
                    if (this.f34926a.isAtEnd()) {
                        return;
                    }
                    readTag = this.f34926a.readTag();
                } while (readTag == this.f34927b);
                this.f34929d = readTag;
                return;
            }
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int readUInt322 = this.f34926a.readUInt32();
        m55256T(readUInt322);
        int totalBytesRead2 = this.f34926a.getTotalBytesRead() + readUInt322;
        do {
            list.add(Float.valueOf(this.f34926a.readFloat()));
        } while (this.f34926a.getTotalBytesRead() < totalBytesRead2);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC4453u
    /* renamed from: p */
    public boolean mo55033p() {
        int i;
        if (!this.f34926a.isAtEnd() && (i = this.f34927b) != this.f34928c) {
            return this.f34926a.skipField(i);
        }
        return false;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC4453u
    /* renamed from: q */
    public void mo55032q(List list) {
        int readTag;
        if (WireFormat.getTagWireType(this.f34927b) == 2) {
            do {
                list.add(mo55042g());
                if (this.f34926a.isAtEnd()) {
                    return;
                }
                readTag = this.f34926a.readTag();
            } while (readTag == this.f34927b);
            this.f34929d = readTag;
            return;
        }
        throw InvalidProtocolBufferException.invalidWireType();
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC4453u
    /* renamed from: r */
    public void mo55031r(List list) {
        int readTag;
        int readTag2;
        if (list instanceof C4434g) {
            C4434g c4434g = (C4434g) list;
            int tagWireType = WireFormat.getTagWireType(this.f34927b);
            if (tagWireType != 1) {
                if (tagWireType == 2) {
                    int readUInt32 = this.f34926a.readUInt32();
                    m55255U(readUInt32);
                    int totalBytesRead = this.f34926a.getTotalBytesRead() + readUInt32;
                    do {
                        c4434g.addDouble(this.f34926a.readDouble());
                    } while (this.f34926a.getTotalBytesRead() < totalBytesRead);
                    return;
                }
                throw InvalidProtocolBufferException.invalidWireType();
            }
            do {
                c4434g.addDouble(this.f34926a.readDouble());
                if (this.f34926a.isAtEnd()) {
                    return;
                }
                readTag2 = this.f34926a.readTag();
            } while (readTag2 == this.f34927b);
            this.f34929d = readTag2;
            return;
        }
        int tagWireType2 = WireFormat.getTagWireType(this.f34927b);
        if (tagWireType2 != 1) {
            if (tagWireType2 == 2) {
                int readUInt322 = this.f34926a.readUInt32();
                m55255U(readUInt322);
                int totalBytesRead2 = this.f34926a.getTotalBytesRead() + readUInt322;
                do {
                    list.add(Double.valueOf(this.f34926a.readDouble()));
                } while (this.f34926a.getTotalBytesRead() < totalBytesRead2);
                return;
            }
            throw InvalidProtocolBufferException.invalidWireType();
        }
        do {
            list.add(Double.valueOf(this.f34926a.readDouble()));
            if (this.f34926a.isAtEnd()) {
                return;
            }
            readTag = this.f34926a.readTag();
        } while (readTag == this.f34927b);
        this.f34929d = readTag;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC4453u
    public double readDouble() {
        m55257S(1);
        return this.f34926a.readDouble();
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC4453u
    public float readFloat() {
        m55257S(5);
        return this.f34926a.readFloat();
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC4453u
    public int readInt32() {
        m55257S(0);
        return this.f34926a.readInt32();
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC4453u
    public long readInt64() {
        m55257S(0);
        return this.f34926a.readInt64();
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC4453u
    public String readString() {
        m55257S(2);
        return this.f34926a.readString();
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC4453u
    /* renamed from: s */
    public long mo55030s() {
        m55257S(1);
        return this.f34926a.readFixed64();
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC4453u
    /* renamed from: t */
    public void mo55029t(List list) {
        int readTag;
        int readTag2;
        if (list instanceof C4439k) {
            C4439k c4439k = (C4439k) list;
            int tagWireType = WireFormat.getTagWireType(this.f34927b);
            if (tagWireType != 2) {
                if (tagWireType == 5) {
                    do {
                        c4439k.addInt(this.f34926a.readSFixed32());
                        if (this.f34926a.isAtEnd()) {
                            return;
                        }
                        readTag2 = this.f34926a.readTag();
                    } while (readTag2 == this.f34927b);
                    this.f34929d = readTag2;
                    return;
                }
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int readUInt32 = this.f34926a.readUInt32();
            m55256T(readUInt32);
            int totalBytesRead = this.f34926a.getTotalBytesRead() + readUInt32;
            do {
                c4439k.addInt(this.f34926a.readSFixed32());
            } while (this.f34926a.getTotalBytesRead() < totalBytesRead);
            return;
        }
        int tagWireType2 = WireFormat.getTagWireType(this.f34927b);
        if (tagWireType2 != 2) {
            if (tagWireType2 == 5) {
                do {
                    list.add(Integer.valueOf(this.f34926a.readSFixed32()));
                    if (this.f34926a.isAtEnd()) {
                        return;
                    }
                    readTag = this.f34926a.readTag();
                } while (readTag == this.f34927b);
                this.f34929d = readTag;
                return;
            }
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int readUInt322 = this.f34926a.readUInt32();
        m55256T(readUInt322);
        int totalBytesRead2 = this.f34926a.getTotalBytesRead() + readUInt322;
        do {
            list.add(Integer.valueOf(this.f34926a.readSFixed32()));
        } while (this.f34926a.getTotalBytesRead() < totalBytesRead2);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC4453u
    /* renamed from: u */
    public boolean mo55028u() {
        m55257S(0);
        return this.f34926a.readBool();
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC4453u
    /* renamed from: v */
    public void mo55027v(List list) {
        int readTag;
        int readTag2;
        if (list instanceof C4444m) {
            C4444m c4444m = (C4444m) list;
            int tagWireType = WireFormat.getTagWireType(this.f34927b);
            if (tagWireType != 0) {
                if (tagWireType == 2) {
                    int totalBytesRead = this.f34926a.getTotalBytesRead() + this.f34926a.readUInt32();
                    do {
                        c4444m.addLong(this.f34926a.readUInt64());
                    } while (this.f34926a.getTotalBytesRead() < totalBytesRead);
                    m55258R(totalBytesRead);
                    return;
                }
                throw InvalidProtocolBufferException.invalidWireType();
            }
            do {
                c4444m.addLong(this.f34926a.readUInt64());
                if (this.f34926a.isAtEnd()) {
                    return;
                }
                readTag2 = this.f34926a.readTag();
            } while (readTag2 == this.f34927b);
            this.f34929d = readTag2;
            return;
        }
        int tagWireType2 = WireFormat.getTagWireType(this.f34927b);
        if (tagWireType2 != 0) {
            if (tagWireType2 == 2) {
                int totalBytesRead2 = this.f34926a.getTotalBytesRead() + this.f34926a.readUInt32();
                do {
                    list.add(Long.valueOf(this.f34926a.readUInt64()));
                } while (this.f34926a.getTotalBytesRead() < totalBytesRead2);
                m55258R(totalBytesRead2);
                return;
            }
            throw InvalidProtocolBufferException.invalidWireType();
        }
        do {
            list.add(Long.valueOf(this.f34926a.readUInt64()));
            if (this.f34926a.isAtEnd()) {
                return;
            }
            readTag = this.f34926a.readTag();
        } while (readTag == this.f34927b);
        this.f34929d = readTag;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC4453u
    /* renamed from: w */
    public void mo55026w(List list) {
        int readTag;
        int readTag2;
        if (list instanceof C4444m) {
            C4444m c4444m = (C4444m) list;
            int tagWireType = WireFormat.getTagWireType(this.f34927b);
            if (tagWireType != 0) {
                if (tagWireType == 2) {
                    int totalBytesRead = this.f34926a.getTotalBytesRead() + this.f34926a.readUInt32();
                    do {
                        c4444m.addLong(this.f34926a.readInt64());
                    } while (this.f34926a.getTotalBytesRead() < totalBytesRead);
                    m55258R(totalBytesRead);
                    return;
                }
                throw InvalidProtocolBufferException.invalidWireType();
            }
            do {
                c4444m.addLong(this.f34926a.readInt64());
                if (this.f34926a.isAtEnd()) {
                    return;
                }
                readTag2 = this.f34926a.readTag();
            } while (readTag2 == this.f34927b);
            this.f34929d = readTag2;
            return;
        }
        int tagWireType2 = WireFormat.getTagWireType(this.f34927b);
        if (tagWireType2 != 0) {
            if (tagWireType2 == 2) {
                int totalBytesRead2 = this.f34926a.getTotalBytesRead() + this.f34926a.readUInt32();
                do {
                    list.add(Long.valueOf(this.f34926a.readInt64()));
                } while (this.f34926a.getTotalBytesRead() < totalBytesRead2);
                m55258R(totalBytesRead2);
                return;
            }
            throw InvalidProtocolBufferException.invalidWireType();
        }
        do {
            list.add(Long.valueOf(this.f34926a.readInt64()));
            if (this.f34926a.isAtEnd()) {
                return;
            }
            readTag = this.f34926a.readTag();
        } while (readTag == this.f34927b);
        this.f34929d = readTag;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC4453u
    /* renamed from: x */
    public void mo55025x(List list) {
        int readTag;
        int readTag2;
        if (list instanceof C4439k) {
            C4439k c4439k = (C4439k) list;
            int tagWireType = WireFormat.getTagWireType(this.f34927b);
            if (tagWireType != 0) {
                if (tagWireType == 2) {
                    int totalBytesRead = this.f34926a.getTotalBytesRead() + this.f34926a.readUInt32();
                    do {
                        c4439k.addInt(this.f34926a.readEnum());
                    } while (this.f34926a.getTotalBytesRead() < totalBytesRead);
                    m55258R(totalBytesRead);
                    return;
                }
                throw InvalidProtocolBufferException.invalidWireType();
            }
            do {
                c4439k.addInt(this.f34926a.readEnum());
                if (this.f34926a.isAtEnd()) {
                    return;
                }
                readTag2 = this.f34926a.readTag();
            } while (readTag2 == this.f34927b);
            this.f34929d = readTag2;
            return;
        }
        int tagWireType2 = WireFormat.getTagWireType(this.f34927b);
        if (tagWireType2 != 0) {
            if (tagWireType2 == 2) {
                int totalBytesRead2 = this.f34926a.getTotalBytesRead() + this.f34926a.readUInt32();
                do {
                    list.add(Integer.valueOf(this.f34926a.readEnum()));
                } while (this.f34926a.getTotalBytesRead() < totalBytesRead2);
                m55258R(totalBytesRead2);
                return;
            }
            throw InvalidProtocolBufferException.invalidWireType();
        }
        do {
            list.add(Integer.valueOf(this.f34926a.readEnum()));
            if (this.f34926a.isAtEnd()) {
                return;
            }
            readTag = this.f34926a.readTag();
        } while (readTag == this.f34927b);
        this.f34929d = readTag;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC4453u
    /* renamed from: y */
    public void mo55024y(List list) {
        m55259Q(list, true);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC4453u
    /* renamed from: z */
    public void mo55023z(List list) {
        int readTag;
        int readTag2;
        if (list instanceof C4444m) {
            C4444m c4444m = (C4444m) list;
            int tagWireType = WireFormat.getTagWireType(this.f34927b);
            if (tagWireType != 1) {
                if (tagWireType == 2) {
                    int readUInt32 = this.f34926a.readUInt32();
                    m55255U(readUInt32);
                    int totalBytesRead = this.f34926a.getTotalBytesRead() + readUInt32;
                    do {
                        c4444m.addLong(this.f34926a.readFixed64());
                    } while (this.f34926a.getTotalBytesRead() < totalBytesRead);
                    return;
                }
                throw InvalidProtocolBufferException.invalidWireType();
            }
            do {
                c4444m.addLong(this.f34926a.readFixed64());
                if (this.f34926a.isAtEnd()) {
                    return;
                }
                readTag2 = this.f34926a.readTag();
            } while (readTag2 == this.f34927b);
            this.f34929d = readTag2;
            return;
        }
        int tagWireType2 = WireFormat.getTagWireType(this.f34927b);
        if (tagWireType2 != 1) {
            if (tagWireType2 == 2) {
                int readUInt322 = this.f34926a.readUInt32();
                m55255U(readUInt322);
                int totalBytesRead2 = this.f34926a.getTotalBytesRead() + readUInt322;
                do {
                    list.add(Long.valueOf(this.f34926a.readFixed64()));
                } while (this.f34926a.getTotalBytesRead() < totalBytesRead2);
                return;
            }
            throw InvalidProtocolBufferException.invalidWireType();
        }
        do {
            list.add(Long.valueOf(this.f34926a.readFixed64()));
            if (this.f34926a.isAtEnd()) {
                return;
            }
            readTag = this.f34926a.readTag();
        } while (readTag == this.f34927b);
        this.f34929d = readTag;
    }
}
