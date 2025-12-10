package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.WireFormat;
import java.util.List;

/* renamed from: androidx.datastore.preferences.protobuf.e */
/* loaded from: classes2.dex */
public final class C4412e implements InterfaceC4435u {

    /* renamed from: a */
    public final CodedInputStream f35014a;

    /* renamed from: b */
    public int f35015b;

    /* renamed from: c */
    public int f35016c;

    /* renamed from: d */
    public int f35017d = 0;

    /* renamed from: androidx.datastore.preferences.protobuf.e$a */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class C4413a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f35018a;

        static {
            int[] iArr = new int[WireFormat.FieldType.values().length];
            f35018a = iArr;
            try {
                iArr[WireFormat.FieldType.BOOL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f35018a[WireFormat.FieldType.BYTES.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f35018a[WireFormat.FieldType.DOUBLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f35018a[WireFormat.FieldType.ENUM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f35018a[WireFormat.FieldType.FIXED32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f35018a[WireFormat.FieldType.FIXED64.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f35018a[WireFormat.FieldType.FLOAT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f35018a[WireFormat.FieldType.INT32.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f35018a[WireFormat.FieldType.INT64.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f35018a[WireFormat.FieldType.MESSAGE.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f35018a[WireFormat.FieldType.SFIXED32.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f35018a[WireFormat.FieldType.SFIXED64.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f35018a[WireFormat.FieldType.SINT32.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f35018a[WireFormat.FieldType.SINT64.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f35018a[WireFormat.FieldType.STRING.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f35018a[WireFormat.FieldType.UINT32.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f35018a[WireFormat.FieldType.UINT64.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
        }
    }

    public C4412e(CodedInputStream codedInputStream) {
        CodedInputStream codedInputStream2 = (CodedInputStream) Internal.m55679b(codedInputStream, "input");
        this.f35014a = codedInputStream2;
        codedInputStream2.f34767d = this;
    }

    /* renamed from: M */
    public static C4412e m55213M(CodedInputStream codedInputStream) {
        C4412e c4412e = codedInputStream.f34767d;
        if (c4412e != null) {
            return c4412e;
        }
        return new C4412e(codedInputStream);
    }

    /* renamed from: N */
    private Object m55212N(WireFormat.FieldType fieldType, Class cls, ExtensionRegistryLite extensionRegistryLite) {
        switch (C4413a.f35018a[fieldType.ordinal()]) {
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

    /* renamed from: O */
    private Object m55211O(InterfaceC4436v interfaceC4436v, ExtensionRegistryLite extensionRegistryLite) {
        int i = this.f35016c;
        this.f35016c = WireFormat.m55288a(WireFormat.getTagFieldNumber(this.f35015b), 4);
        try {
            Object newInstance = interfaceC4436v.newInstance();
            interfaceC4436v.mo54965h(newInstance, this, extensionRegistryLite);
            interfaceC4436v.mo54968e(newInstance);
            if (this.f35015b == this.f35016c) {
                return newInstance;
            }
            throw InvalidProtocolBufferException.parseFailure();
        } finally {
            this.f35016c = i;
        }
    }

    /* renamed from: P */
    private Object m55210P(InterfaceC4436v interfaceC4436v, ExtensionRegistryLite extensionRegistryLite) {
        CodedInputStream codedInputStream;
        int readUInt32 = this.f35014a.readUInt32();
        CodedInputStream codedInputStream2 = this.f35014a;
        if (codedInputStream2.f34764a < codedInputStream2.f34765b) {
            int pushLimit = codedInputStream2.pushLimit(readUInt32);
            Object newInstance = interfaceC4436v.newInstance();
            this.f35014a.f34764a++;
            interfaceC4436v.mo54965h(newInstance, this, extensionRegistryLite);
            interfaceC4436v.mo54968e(newInstance);
            this.f35014a.checkLastTagWas(0);
            codedInputStream.f34764a--;
            this.f35014a.popLimit(pushLimit);
            return newInstance;
        }
        throw InvalidProtocolBufferException.recursionLimitExceeded();
    }

    /* renamed from: R */
    private void m55208R(int i) {
        if (this.f35014a.getTotalBytesRead() == i) {
            return;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    /* renamed from: S */
    private void m55207S(int i) {
        if (WireFormat.getTagWireType(this.f35015b) == i) {
            return;
        }
        throw InvalidProtocolBufferException.invalidWireType();
    }

    /* renamed from: T */
    private void m55206T(int i) {
        if ((i & 3) == 0) {
            return;
        }
        throw InvalidProtocolBufferException.parseFailure();
    }

    /* renamed from: U */
    private void m55205U(int i) {
        if ((i & 7) == 0) {
            return;
        }
        throw InvalidProtocolBufferException.parseFailure();
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC4435u
    /* renamed from: A */
    public void mo55010A(List list) {
        int readTag;
        int readTag2;
        if (list instanceof C4421k) {
            C4421k c4421k = (C4421k) list;
            int tagWireType = WireFormat.getTagWireType(this.f35015b);
            if (tagWireType != 0) {
                if (tagWireType == 2) {
                    int totalBytesRead = this.f35014a.getTotalBytesRead() + this.f35014a.readUInt32();
                    do {
                        c4421k.addInt(this.f35014a.readUInt32());
                    } while (this.f35014a.getTotalBytesRead() < totalBytesRead);
                    m55208R(totalBytesRead);
                    return;
                }
                throw InvalidProtocolBufferException.invalidWireType();
            }
            do {
                c4421k.addInt(this.f35014a.readUInt32());
                if (this.f35014a.isAtEnd()) {
                    return;
                }
                readTag2 = this.f35014a.readTag();
            } while (readTag2 == this.f35015b);
            this.f35017d = readTag2;
            return;
        }
        int tagWireType2 = WireFormat.getTagWireType(this.f35015b);
        if (tagWireType2 != 0) {
            if (tagWireType2 == 2) {
                int totalBytesRead2 = this.f35014a.getTotalBytesRead() + this.f35014a.readUInt32();
                do {
                    list.add(Integer.valueOf(this.f35014a.readUInt32()));
                } while (this.f35014a.getTotalBytesRead() < totalBytesRead2);
                m55208R(totalBytesRead2);
                return;
            }
            throw InvalidProtocolBufferException.invalidWireType();
        }
        do {
            list.add(Integer.valueOf(this.f35014a.readUInt32()));
            if (this.f35014a.isAtEnd()) {
                return;
            }
            readTag = this.f35014a.readTag();
        } while (readTag == this.f35015b);
        this.f35017d = readTag;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC4435u
    /* renamed from: B */
    public int mo55009B() {
        m55207S(5);
        return this.f35014a.readFixed32();
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC4435u
    /* renamed from: C */
    public long mo55008C() {
        m55207S(0);
        return this.f35014a.readSInt64();
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC4435u
    /* renamed from: D */
    public int mo55007D() {
        m55207S(5);
        return this.f35014a.readSFixed32();
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC4435u
    /* renamed from: E */
    public String mo55006E() {
        m55207S(2);
        return this.f35014a.readStringRequireUtf8();
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC4435u
    /* renamed from: F */
    public Object mo55005F(InterfaceC4436v interfaceC4436v, ExtensionRegistryLite extensionRegistryLite) {
        m55207S(3);
        return m55211O(interfaceC4436v, extensionRegistryLite);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC4435u
    /* renamed from: G */
    public Object mo55004G(Class cls, ExtensionRegistryLite extensionRegistryLite) {
        m55207S(2);
        return m55210P(C17783Hp1.m68094a().m68091d(cls), extensionRegistryLite);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC4435u
    /* renamed from: H */
    public Object mo55003H(InterfaceC4436v interfaceC4436v, ExtensionRegistryLite extensionRegistryLite) {
        m55207S(2);
        return m55210P(interfaceC4436v, extensionRegistryLite);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC4435u
    /* renamed from: I */
    public void mo55002I(List list, InterfaceC4436v interfaceC4436v, ExtensionRegistryLite extensionRegistryLite) {
        int readTag;
        if (WireFormat.getTagWireType(this.f35015b) == 2) {
            int i = this.f35015b;
            do {
                list.add(m55210P(interfaceC4436v, extensionRegistryLite));
                if (!this.f35014a.isAtEnd() && this.f35017d == 0) {
                    readTag = this.f35014a.readTag();
                } else {
                    return;
                }
            } while (readTag == i);
            this.f35017d = readTag;
            return;
        }
        throw InvalidProtocolBufferException.invalidWireType();
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC4435u
    /* renamed from: J */
    public Object mo55001J(Class cls, ExtensionRegistryLite extensionRegistryLite) {
        m55207S(3);
        return m55211O(C17783Hp1.m68094a().m68091d(cls), extensionRegistryLite);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x005e, code lost:
        r8.put(r2, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0061, code lost:
        r7.f35014a.popLimit(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0066, code lost:
        return;
     */
    @Override // androidx.datastore.preferences.protobuf.InterfaceC4435u
    /* renamed from: K */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void mo55000K(java.util.Map r8, androidx.datastore.preferences.protobuf.MapEntryLite.C4368b r9, androidx.datastore.preferences.protobuf.ExtensionRegistryLite r10) {
        /*
            r7 = this;
            r0 = 2
            r7.m55207S(r0)
            androidx.datastore.preferences.protobuf.CodedInputStream r1 = r7.f35014a
            int r1 = r1.readUInt32()
            androidx.datastore.preferences.protobuf.CodedInputStream r2 = r7.f35014a
            int r1 = r2.pushLimit(r1)
            java.lang.Object r2 = r9.f34936b
            java.lang.Object r3 = r9.f34938d
        L14:
            int r4 = r7.mo54986m()     // Catch: java.lang.Throwable -> L3a
            r5 = 2147483647(0x7fffffff, float:NaN)
            if (r4 == r5) goto L5e
            androidx.datastore.preferences.protobuf.CodedInputStream r5 = r7.f35014a     // Catch: java.lang.Throwable -> L3a
            boolean r5 = r5.isAtEnd()     // Catch: java.lang.Throwable -> L3a
            if (r5 == 0) goto L26
            goto L5e
        L26:
            r5 = 1
            java.lang.String r6 = "Unable to parse map entry."
            if (r4 == r5) goto L49
            if (r4 == r0) goto L3c
            boolean r4 = r7.mo54983p()     // Catch: java.lang.Throwable -> L3a androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L51
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
            androidx.datastore.preferences.protobuf.WireFormat$FieldType r4 = r9.f34937c     // Catch: java.lang.Throwable -> L3a androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L51
            java.lang.Object r5 = r9.f34938d     // Catch: java.lang.Throwable -> L3a androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L51
            java.lang.Class r5 = r5.getClass()     // Catch: java.lang.Throwable -> L3a androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L51
            java.lang.Object r3 = r7.m55212N(r4, r5, r10)     // Catch: java.lang.Throwable -> L3a androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L51
            goto L14
        L49:
            androidx.datastore.preferences.protobuf.WireFormat$FieldType r4 = r9.f34935a     // Catch: java.lang.Throwable -> L3a androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L51
            r5 = 0
            java.lang.Object r2 = r7.m55212N(r4, r5, r5)     // Catch: java.lang.Throwable -> L3a androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L51
            goto L14
        L51:
            boolean r4 = r7.mo54983p()     // Catch: java.lang.Throwable -> L3a
            if (r4 == 0) goto L58
            goto L14
        L58:
            androidx.datastore.preferences.protobuf.InvalidProtocolBufferException r8 = new androidx.datastore.preferences.protobuf.InvalidProtocolBufferException     // Catch: java.lang.Throwable -> L3a
            r8.<init>(r6)     // Catch: java.lang.Throwable -> L3a
            throw r8     // Catch: java.lang.Throwable -> L3a
        L5e:
            r8.put(r2, r3)     // Catch: java.lang.Throwable -> L3a
            androidx.datastore.preferences.protobuf.CodedInputStream r8 = r7.f35014a
            r8.popLimit(r1)
            return
        L67:
            androidx.datastore.preferences.protobuf.CodedInputStream r9 = r7.f35014a
            r9.popLimit(r1)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.C4412e.mo55000K(java.util.Map, androidx.datastore.preferences.protobuf.MapEntryLite$b, androidx.datastore.preferences.protobuf.ExtensionRegistryLite):void");
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC4435u
    /* renamed from: L */
    public void mo54999L(List list, InterfaceC4436v interfaceC4436v, ExtensionRegistryLite extensionRegistryLite) {
        int readTag;
        if (WireFormat.getTagWireType(this.f35015b) == 3) {
            int i = this.f35015b;
            do {
                list.add(m55211O(interfaceC4436v, extensionRegistryLite));
                if (!this.f35014a.isAtEnd() && this.f35017d == 0) {
                    readTag = this.f35014a.readTag();
                } else {
                    return;
                }
            } while (readTag == i);
            this.f35017d = readTag;
            return;
        }
        throw InvalidProtocolBufferException.invalidWireType();
    }

    /* renamed from: Q */
    public void m55209Q(List list, boolean z) {
        String readString;
        int readTag;
        int readTag2;
        if (WireFormat.getTagWireType(this.f35015b) == 2) {
            if ((list instanceof LazyStringList) && !z) {
                LazyStringList lazyStringList = (LazyStringList) list;
                do {
                    lazyStringList.add(mo54992g());
                    if (this.f35014a.isAtEnd()) {
                        return;
                    }
                    readTag2 = this.f35014a.readTag();
                } while (readTag2 == this.f35015b);
                this.f35017d = readTag2;
                return;
            }
            do {
                if (z) {
                    readString = mo55006E();
                } else {
                    readString = readString();
                }
                list.add(readString);
                if (this.f35014a.isAtEnd()) {
                    return;
                }
                readTag = this.f35014a.readTag();
            } while (readTag == this.f35015b);
            this.f35017d = readTag;
            return;
        }
        throw InvalidProtocolBufferException.invalidWireType();
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC4435u
    /* renamed from: a */
    public void mo54998a(List list) {
        int readTag;
        int readTag2;
        if (list instanceof C4426m) {
            C4426m c4426m = (C4426m) list;
            int tagWireType = WireFormat.getTagWireType(this.f35015b);
            if (tagWireType != 0) {
                if (tagWireType == 2) {
                    int totalBytesRead = this.f35014a.getTotalBytesRead() + this.f35014a.readUInt32();
                    do {
                        c4426m.addLong(this.f35014a.readSInt64());
                    } while (this.f35014a.getTotalBytesRead() < totalBytesRead);
                    m55208R(totalBytesRead);
                    return;
                }
                throw InvalidProtocolBufferException.invalidWireType();
            }
            do {
                c4426m.addLong(this.f35014a.readSInt64());
                if (this.f35014a.isAtEnd()) {
                    return;
                }
                readTag2 = this.f35014a.readTag();
            } while (readTag2 == this.f35015b);
            this.f35017d = readTag2;
            return;
        }
        int tagWireType2 = WireFormat.getTagWireType(this.f35015b);
        if (tagWireType2 != 0) {
            if (tagWireType2 == 2) {
                int totalBytesRead2 = this.f35014a.getTotalBytesRead() + this.f35014a.readUInt32();
                do {
                    list.add(Long.valueOf(this.f35014a.readSInt64()));
                } while (this.f35014a.getTotalBytesRead() < totalBytesRead2);
                m55208R(totalBytesRead2);
                return;
            }
            throw InvalidProtocolBufferException.invalidWireType();
        }
        do {
            list.add(Long.valueOf(this.f35014a.readSInt64()));
            if (this.f35014a.isAtEnd()) {
                return;
            }
            readTag = this.f35014a.readTag();
        } while (readTag == this.f35015b);
        this.f35017d = readTag;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC4435u
    /* renamed from: b */
    public long mo54997b() {
        m55207S(1);
        return this.f35014a.readSFixed64();
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC4435u
    /* renamed from: c */
    public int mo54996c() {
        m55207S(0);
        return this.f35014a.readUInt32();
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC4435u
    /* renamed from: d */
    public int mo54995d() {
        m55207S(0);
        return this.f35014a.readEnum();
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC4435u
    /* renamed from: e */
    public int mo54994e() {
        m55207S(0);
        return this.f35014a.readSInt32();
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC4435u
    /* renamed from: f */
    public void mo54993f(List list) {
        int readTag;
        int readTag2;
        if (list instanceof C4411d) {
            C4411d c4411d = (C4411d) list;
            int tagWireType = WireFormat.getTagWireType(this.f35015b);
            if (tagWireType != 0) {
                if (tagWireType == 2) {
                    int totalBytesRead = this.f35014a.getTotalBytesRead() + this.f35014a.readUInt32();
                    do {
                        c4411d.addBoolean(this.f35014a.readBool());
                    } while (this.f35014a.getTotalBytesRead() < totalBytesRead);
                    m55208R(totalBytesRead);
                    return;
                }
                throw InvalidProtocolBufferException.invalidWireType();
            }
            do {
                c4411d.addBoolean(this.f35014a.readBool());
                if (this.f35014a.isAtEnd()) {
                    return;
                }
                readTag2 = this.f35014a.readTag();
            } while (readTag2 == this.f35015b);
            this.f35017d = readTag2;
            return;
        }
        int tagWireType2 = WireFormat.getTagWireType(this.f35015b);
        if (tagWireType2 != 0) {
            if (tagWireType2 == 2) {
                int totalBytesRead2 = this.f35014a.getTotalBytesRead() + this.f35014a.readUInt32();
                do {
                    list.add(Boolean.valueOf(this.f35014a.readBool()));
                } while (this.f35014a.getTotalBytesRead() < totalBytesRead2);
                m55208R(totalBytesRead2);
                return;
            }
            throw InvalidProtocolBufferException.invalidWireType();
        }
        do {
            list.add(Boolean.valueOf(this.f35014a.readBool()));
            if (this.f35014a.isAtEnd()) {
                return;
            }
            readTag = this.f35014a.readTag();
        } while (readTag == this.f35015b);
        this.f35017d = readTag;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC4435u
    /* renamed from: g */
    public ByteString mo54992g() {
        m55207S(2);
        return this.f35014a.readBytes();
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC4435u
    public int getTag() {
        return this.f35015b;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC4435u
    /* renamed from: h */
    public void mo54991h(List list) {
        int readTag;
        int readTag2;
        if (list instanceof C4421k) {
            C4421k c4421k = (C4421k) list;
            int tagWireType = WireFormat.getTagWireType(this.f35015b);
            if (tagWireType != 0) {
                if (tagWireType == 2) {
                    int totalBytesRead = this.f35014a.getTotalBytesRead() + this.f35014a.readUInt32();
                    do {
                        c4421k.addInt(this.f35014a.readSInt32());
                    } while (this.f35014a.getTotalBytesRead() < totalBytesRead);
                    m55208R(totalBytesRead);
                    return;
                }
                throw InvalidProtocolBufferException.invalidWireType();
            }
            do {
                c4421k.addInt(this.f35014a.readSInt32());
                if (this.f35014a.isAtEnd()) {
                    return;
                }
                readTag2 = this.f35014a.readTag();
            } while (readTag2 == this.f35015b);
            this.f35017d = readTag2;
            return;
        }
        int tagWireType2 = WireFormat.getTagWireType(this.f35015b);
        if (tagWireType2 != 0) {
            if (tagWireType2 == 2) {
                int totalBytesRead2 = this.f35014a.getTotalBytesRead() + this.f35014a.readUInt32();
                do {
                    list.add(Integer.valueOf(this.f35014a.readSInt32()));
                } while (this.f35014a.getTotalBytesRead() < totalBytesRead2);
                m55208R(totalBytesRead2);
                return;
            }
            throw InvalidProtocolBufferException.invalidWireType();
        }
        do {
            list.add(Integer.valueOf(this.f35014a.readSInt32()));
            if (this.f35014a.isAtEnd()) {
                return;
            }
            readTag = this.f35014a.readTag();
        } while (readTag == this.f35015b);
        this.f35017d = readTag;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC4435u
    /* renamed from: i */
    public long mo54990i() {
        m55207S(0);
        return this.f35014a.readUInt64();
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC4435u
    /* renamed from: j */
    public void mo54989j(List list) {
        int readTag;
        int readTag2;
        if (list instanceof C4426m) {
            C4426m c4426m = (C4426m) list;
            int tagWireType = WireFormat.getTagWireType(this.f35015b);
            if (tagWireType != 1) {
                if (tagWireType == 2) {
                    int readUInt32 = this.f35014a.readUInt32();
                    m55205U(readUInt32);
                    int totalBytesRead = this.f35014a.getTotalBytesRead() + readUInt32;
                    do {
                        c4426m.addLong(this.f35014a.readSFixed64());
                    } while (this.f35014a.getTotalBytesRead() < totalBytesRead);
                    return;
                }
                throw InvalidProtocolBufferException.invalidWireType();
            }
            do {
                c4426m.addLong(this.f35014a.readSFixed64());
                if (this.f35014a.isAtEnd()) {
                    return;
                }
                readTag2 = this.f35014a.readTag();
            } while (readTag2 == this.f35015b);
            this.f35017d = readTag2;
            return;
        }
        int tagWireType2 = WireFormat.getTagWireType(this.f35015b);
        if (tagWireType2 != 1) {
            if (tagWireType2 == 2) {
                int readUInt322 = this.f35014a.readUInt32();
                m55205U(readUInt322);
                int totalBytesRead2 = this.f35014a.getTotalBytesRead() + readUInt322;
                do {
                    list.add(Long.valueOf(this.f35014a.readSFixed64()));
                } while (this.f35014a.getTotalBytesRead() < totalBytesRead2);
                return;
            }
            throw InvalidProtocolBufferException.invalidWireType();
        }
        do {
            list.add(Long.valueOf(this.f35014a.readSFixed64()));
            if (this.f35014a.isAtEnd()) {
                return;
            }
            readTag = this.f35014a.readTag();
        } while (readTag == this.f35015b);
        this.f35017d = readTag;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC4435u
    /* renamed from: k */
    public void mo54988k(List list) {
        int readTag;
        int readTag2;
        if (list instanceof C4421k) {
            C4421k c4421k = (C4421k) list;
            int tagWireType = WireFormat.getTagWireType(this.f35015b);
            if (tagWireType != 0) {
                if (tagWireType == 2) {
                    int totalBytesRead = this.f35014a.getTotalBytesRead() + this.f35014a.readUInt32();
                    do {
                        c4421k.addInt(this.f35014a.readInt32());
                    } while (this.f35014a.getTotalBytesRead() < totalBytesRead);
                    m55208R(totalBytesRead);
                    return;
                }
                throw InvalidProtocolBufferException.invalidWireType();
            }
            do {
                c4421k.addInt(this.f35014a.readInt32());
                if (this.f35014a.isAtEnd()) {
                    return;
                }
                readTag2 = this.f35014a.readTag();
            } while (readTag2 == this.f35015b);
            this.f35017d = readTag2;
            return;
        }
        int tagWireType2 = WireFormat.getTagWireType(this.f35015b);
        if (tagWireType2 != 0) {
            if (tagWireType2 == 2) {
                int totalBytesRead2 = this.f35014a.getTotalBytesRead() + this.f35014a.readUInt32();
                do {
                    list.add(Integer.valueOf(this.f35014a.readInt32()));
                } while (this.f35014a.getTotalBytesRead() < totalBytesRead2);
                m55208R(totalBytesRead2);
                return;
            }
            throw InvalidProtocolBufferException.invalidWireType();
        }
        do {
            list.add(Integer.valueOf(this.f35014a.readInt32()));
            if (this.f35014a.isAtEnd()) {
                return;
            }
            readTag = this.f35014a.readTag();
        } while (readTag == this.f35015b);
        this.f35017d = readTag;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC4435u
    /* renamed from: l */
    public void mo54987l(List list) {
        int readTag;
        int readTag2;
        if (list instanceof C4421k) {
            C4421k c4421k = (C4421k) list;
            int tagWireType = WireFormat.getTagWireType(this.f35015b);
            if (tagWireType != 2) {
                if (tagWireType == 5) {
                    do {
                        c4421k.addInt(this.f35014a.readFixed32());
                        if (this.f35014a.isAtEnd()) {
                            return;
                        }
                        readTag2 = this.f35014a.readTag();
                    } while (readTag2 == this.f35015b);
                    this.f35017d = readTag2;
                    return;
                }
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int readUInt32 = this.f35014a.readUInt32();
            m55206T(readUInt32);
            int totalBytesRead = this.f35014a.getTotalBytesRead() + readUInt32;
            do {
                c4421k.addInt(this.f35014a.readFixed32());
            } while (this.f35014a.getTotalBytesRead() < totalBytesRead);
            return;
        }
        int tagWireType2 = WireFormat.getTagWireType(this.f35015b);
        if (tagWireType2 != 2) {
            if (tagWireType2 == 5) {
                do {
                    list.add(Integer.valueOf(this.f35014a.readFixed32()));
                    if (this.f35014a.isAtEnd()) {
                        return;
                    }
                    readTag = this.f35014a.readTag();
                } while (readTag == this.f35015b);
                this.f35017d = readTag;
                return;
            }
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int readUInt322 = this.f35014a.readUInt32();
        m55206T(readUInt322);
        int totalBytesRead2 = this.f35014a.getTotalBytesRead() + readUInt322;
        do {
            list.add(Integer.valueOf(this.f35014a.readFixed32()));
        } while (this.f35014a.getTotalBytesRead() < totalBytesRead2);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC4435u
    /* renamed from: m */
    public int mo54986m() {
        int i = this.f35017d;
        if (i != 0) {
            this.f35015b = i;
            this.f35017d = 0;
        } else {
            this.f35015b = this.f35014a.readTag();
        }
        int i2 = this.f35015b;
        if (i2 != 0 && i2 != this.f35016c) {
            return WireFormat.getTagFieldNumber(i2);
        }
        return Integer.MAX_VALUE;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC4435u
    /* renamed from: n */
    public void mo54985n(List list) {
        m55209Q(list, false);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC4435u
    /* renamed from: o */
    public void mo54984o(List list) {
        int readTag;
        int readTag2;
        if (list instanceof C4420j) {
            C4420j c4420j = (C4420j) list;
            int tagWireType = WireFormat.getTagWireType(this.f35015b);
            if (tagWireType != 2) {
                if (tagWireType == 5) {
                    do {
                        c4420j.addFloat(this.f35014a.readFloat());
                        if (this.f35014a.isAtEnd()) {
                            return;
                        }
                        readTag2 = this.f35014a.readTag();
                    } while (readTag2 == this.f35015b);
                    this.f35017d = readTag2;
                    return;
                }
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int readUInt32 = this.f35014a.readUInt32();
            m55206T(readUInt32);
            int totalBytesRead = this.f35014a.getTotalBytesRead() + readUInt32;
            do {
                c4420j.addFloat(this.f35014a.readFloat());
            } while (this.f35014a.getTotalBytesRead() < totalBytesRead);
            return;
        }
        int tagWireType2 = WireFormat.getTagWireType(this.f35015b);
        if (tagWireType2 != 2) {
            if (tagWireType2 == 5) {
                do {
                    list.add(Float.valueOf(this.f35014a.readFloat()));
                    if (this.f35014a.isAtEnd()) {
                        return;
                    }
                    readTag = this.f35014a.readTag();
                } while (readTag == this.f35015b);
                this.f35017d = readTag;
                return;
            }
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int readUInt322 = this.f35014a.readUInt32();
        m55206T(readUInt322);
        int totalBytesRead2 = this.f35014a.getTotalBytesRead() + readUInt322;
        do {
            list.add(Float.valueOf(this.f35014a.readFloat()));
        } while (this.f35014a.getTotalBytesRead() < totalBytesRead2);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC4435u
    /* renamed from: p */
    public boolean mo54983p() {
        int i;
        if (!this.f35014a.isAtEnd() && (i = this.f35015b) != this.f35016c) {
            return this.f35014a.skipField(i);
        }
        return false;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC4435u
    /* renamed from: q */
    public void mo54982q(List list) {
        int readTag;
        if (WireFormat.getTagWireType(this.f35015b) == 2) {
            do {
                list.add(mo54992g());
                if (this.f35014a.isAtEnd()) {
                    return;
                }
                readTag = this.f35014a.readTag();
            } while (readTag == this.f35015b);
            this.f35017d = readTag;
            return;
        }
        throw InvalidProtocolBufferException.invalidWireType();
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC4435u
    /* renamed from: r */
    public void mo54981r(List list) {
        int readTag;
        int readTag2;
        if (list instanceof C4416g) {
            C4416g c4416g = (C4416g) list;
            int tagWireType = WireFormat.getTagWireType(this.f35015b);
            if (tagWireType != 1) {
                if (tagWireType == 2) {
                    int readUInt32 = this.f35014a.readUInt32();
                    m55205U(readUInt32);
                    int totalBytesRead = this.f35014a.getTotalBytesRead() + readUInt32;
                    do {
                        c4416g.addDouble(this.f35014a.readDouble());
                    } while (this.f35014a.getTotalBytesRead() < totalBytesRead);
                    return;
                }
                throw InvalidProtocolBufferException.invalidWireType();
            }
            do {
                c4416g.addDouble(this.f35014a.readDouble());
                if (this.f35014a.isAtEnd()) {
                    return;
                }
                readTag2 = this.f35014a.readTag();
            } while (readTag2 == this.f35015b);
            this.f35017d = readTag2;
            return;
        }
        int tagWireType2 = WireFormat.getTagWireType(this.f35015b);
        if (tagWireType2 != 1) {
            if (tagWireType2 == 2) {
                int readUInt322 = this.f35014a.readUInt32();
                m55205U(readUInt322);
                int totalBytesRead2 = this.f35014a.getTotalBytesRead() + readUInt322;
                do {
                    list.add(Double.valueOf(this.f35014a.readDouble()));
                } while (this.f35014a.getTotalBytesRead() < totalBytesRead2);
                return;
            }
            throw InvalidProtocolBufferException.invalidWireType();
        }
        do {
            list.add(Double.valueOf(this.f35014a.readDouble()));
            if (this.f35014a.isAtEnd()) {
                return;
            }
            readTag = this.f35014a.readTag();
        } while (readTag == this.f35015b);
        this.f35017d = readTag;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC4435u
    public double readDouble() {
        m55207S(1);
        return this.f35014a.readDouble();
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC4435u
    public float readFloat() {
        m55207S(5);
        return this.f35014a.readFloat();
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC4435u
    public int readInt32() {
        m55207S(0);
        return this.f35014a.readInt32();
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC4435u
    public long readInt64() {
        m55207S(0);
        return this.f35014a.readInt64();
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC4435u
    public String readString() {
        m55207S(2);
        return this.f35014a.readString();
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC4435u
    /* renamed from: s */
    public long mo54980s() {
        m55207S(1);
        return this.f35014a.readFixed64();
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC4435u
    /* renamed from: t */
    public void mo54979t(List list) {
        int readTag;
        int readTag2;
        if (list instanceof C4421k) {
            C4421k c4421k = (C4421k) list;
            int tagWireType = WireFormat.getTagWireType(this.f35015b);
            if (tagWireType != 2) {
                if (tagWireType == 5) {
                    do {
                        c4421k.addInt(this.f35014a.readSFixed32());
                        if (this.f35014a.isAtEnd()) {
                            return;
                        }
                        readTag2 = this.f35014a.readTag();
                    } while (readTag2 == this.f35015b);
                    this.f35017d = readTag2;
                    return;
                }
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int readUInt32 = this.f35014a.readUInt32();
            m55206T(readUInt32);
            int totalBytesRead = this.f35014a.getTotalBytesRead() + readUInt32;
            do {
                c4421k.addInt(this.f35014a.readSFixed32());
            } while (this.f35014a.getTotalBytesRead() < totalBytesRead);
            return;
        }
        int tagWireType2 = WireFormat.getTagWireType(this.f35015b);
        if (tagWireType2 != 2) {
            if (tagWireType2 == 5) {
                do {
                    list.add(Integer.valueOf(this.f35014a.readSFixed32()));
                    if (this.f35014a.isAtEnd()) {
                        return;
                    }
                    readTag = this.f35014a.readTag();
                } while (readTag == this.f35015b);
                this.f35017d = readTag;
                return;
            }
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int readUInt322 = this.f35014a.readUInt32();
        m55206T(readUInt322);
        int totalBytesRead2 = this.f35014a.getTotalBytesRead() + readUInt322;
        do {
            list.add(Integer.valueOf(this.f35014a.readSFixed32()));
        } while (this.f35014a.getTotalBytesRead() < totalBytesRead2);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC4435u
    /* renamed from: u */
    public boolean mo54978u() {
        m55207S(0);
        return this.f35014a.readBool();
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC4435u
    /* renamed from: v */
    public void mo54977v(List list) {
        int readTag;
        int readTag2;
        if (list instanceof C4426m) {
            C4426m c4426m = (C4426m) list;
            int tagWireType = WireFormat.getTagWireType(this.f35015b);
            if (tagWireType != 0) {
                if (tagWireType == 2) {
                    int totalBytesRead = this.f35014a.getTotalBytesRead() + this.f35014a.readUInt32();
                    do {
                        c4426m.addLong(this.f35014a.readUInt64());
                    } while (this.f35014a.getTotalBytesRead() < totalBytesRead);
                    m55208R(totalBytesRead);
                    return;
                }
                throw InvalidProtocolBufferException.invalidWireType();
            }
            do {
                c4426m.addLong(this.f35014a.readUInt64());
                if (this.f35014a.isAtEnd()) {
                    return;
                }
                readTag2 = this.f35014a.readTag();
            } while (readTag2 == this.f35015b);
            this.f35017d = readTag2;
            return;
        }
        int tagWireType2 = WireFormat.getTagWireType(this.f35015b);
        if (tagWireType2 != 0) {
            if (tagWireType2 == 2) {
                int totalBytesRead2 = this.f35014a.getTotalBytesRead() + this.f35014a.readUInt32();
                do {
                    list.add(Long.valueOf(this.f35014a.readUInt64()));
                } while (this.f35014a.getTotalBytesRead() < totalBytesRead2);
                m55208R(totalBytesRead2);
                return;
            }
            throw InvalidProtocolBufferException.invalidWireType();
        }
        do {
            list.add(Long.valueOf(this.f35014a.readUInt64()));
            if (this.f35014a.isAtEnd()) {
                return;
            }
            readTag = this.f35014a.readTag();
        } while (readTag == this.f35015b);
        this.f35017d = readTag;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC4435u
    /* renamed from: w */
    public void mo54976w(List list) {
        int readTag;
        int readTag2;
        if (list instanceof C4426m) {
            C4426m c4426m = (C4426m) list;
            int tagWireType = WireFormat.getTagWireType(this.f35015b);
            if (tagWireType != 0) {
                if (tagWireType == 2) {
                    int totalBytesRead = this.f35014a.getTotalBytesRead() + this.f35014a.readUInt32();
                    do {
                        c4426m.addLong(this.f35014a.readInt64());
                    } while (this.f35014a.getTotalBytesRead() < totalBytesRead);
                    m55208R(totalBytesRead);
                    return;
                }
                throw InvalidProtocolBufferException.invalidWireType();
            }
            do {
                c4426m.addLong(this.f35014a.readInt64());
                if (this.f35014a.isAtEnd()) {
                    return;
                }
                readTag2 = this.f35014a.readTag();
            } while (readTag2 == this.f35015b);
            this.f35017d = readTag2;
            return;
        }
        int tagWireType2 = WireFormat.getTagWireType(this.f35015b);
        if (tagWireType2 != 0) {
            if (tagWireType2 == 2) {
                int totalBytesRead2 = this.f35014a.getTotalBytesRead() + this.f35014a.readUInt32();
                do {
                    list.add(Long.valueOf(this.f35014a.readInt64()));
                } while (this.f35014a.getTotalBytesRead() < totalBytesRead2);
                m55208R(totalBytesRead2);
                return;
            }
            throw InvalidProtocolBufferException.invalidWireType();
        }
        do {
            list.add(Long.valueOf(this.f35014a.readInt64()));
            if (this.f35014a.isAtEnd()) {
                return;
            }
            readTag = this.f35014a.readTag();
        } while (readTag == this.f35015b);
        this.f35017d = readTag;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC4435u
    /* renamed from: x */
    public void mo54975x(List list) {
        int readTag;
        int readTag2;
        if (list instanceof C4421k) {
            C4421k c4421k = (C4421k) list;
            int tagWireType = WireFormat.getTagWireType(this.f35015b);
            if (tagWireType != 0) {
                if (tagWireType == 2) {
                    int totalBytesRead = this.f35014a.getTotalBytesRead() + this.f35014a.readUInt32();
                    do {
                        c4421k.addInt(this.f35014a.readEnum());
                    } while (this.f35014a.getTotalBytesRead() < totalBytesRead);
                    m55208R(totalBytesRead);
                    return;
                }
                throw InvalidProtocolBufferException.invalidWireType();
            }
            do {
                c4421k.addInt(this.f35014a.readEnum());
                if (this.f35014a.isAtEnd()) {
                    return;
                }
                readTag2 = this.f35014a.readTag();
            } while (readTag2 == this.f35015b);
            this.f35017d = readTag2;
            return;
        }
        int tagWireType2 = WireFormat.getTagWireType(this.f35015b);
        if (tagWireType2 != 0) {
            if (tagWireType2 == 2) {
                int totalBytesRead2 = this.f35014a.getTotalBytesRead() + this.f35014a.readUInt32();
                do {
                    list.add(Integer.valueOf(this.f35014a.readEnum()));
                } while (this.f35014a.getTotalBytesRead() < totalBytesRead2);
                m55208R(totalBytesRead2);
                return;
            }
            throw InvalidProtocolBufferException.invalidWireType();
        }
        do {
            list.add(Integer.valueOf(this.f35014a.readEnum()));
            if (this.f35014a.isAtEnd()) {
                return;
            }
            readTag = this.f35014a.readTag();
        } while (readTag == this.f35015b);
        this.f35017d = readTag;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC4435u
    /* renamed from: y */
    public void mo54974y(List list) {
        m55209Q(list, true);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC4435u
    /* renamed from: z */
    public void mo54973z(List list) {
        int readTag;
        int readTag2;
        if (list instanceof C4426m) {
            C4426m c4426m = (C4426m) list;
            int tagWireType = WireFormat.getTagWireType(this.f35015b);
            if (tagWireType != 1) {
                if (tagWireType == 2) {
                    int readUInt32 = this.f35014a.readUInt32();
                    m55205U(readUInt32);
                    int totalBytesRead = this.f35014a.getTotalBytesRead() + readUInt32;
                    do {
                        c4426m.addLong(this.f35014a.readFixed64());
                    } while (this.f35014a.getTotalBytesRead() < totalBytesRead);
                    return;
                }
                throw InvalidProtocolBufferException.invalidWireType();
            }
            do {
                c4426m.addLong(this.f35014a.readFixed64());
                if (this.f35014a.isAtEnd()) {
                    return;
                }
                readTag2 = this.f35014a.readTag();
            } while (readTag2 == this.f35015b);
            this.f35017d = readTag2;
            return;
        }
        int tagWireType2 = WireFormat.getTagWireType(this.f35015b);
        if (tagWireType2 != 1) {
            if (tagWireType2 == 2) {
                int readUInt322 = this.f35014a.readUInt32();
                m55205U(readUInt322);
                int totalBytesRead2 = this.f35014a.getTotalBytesRead() + readUInt322;
                do {
                    list.add(Long.valueOf(this.f35014a.readFixed64()));
                } while (this.f35014a.getTotalBytesRead() < totalBytesRead2);
                return;
            }
            throw InvalidProtocolBufferException.invalidWireType();
        }
        do {
            list.add(Long.valueOf(this.f35014a.readFixed64()));
            if (this.f35014a.isAtEnd()) {
                return;
            }
            readTag = this.f35014a.readTag();
        } while (readTag == this.f35015b);
        this.f35017d = readTag;
    }
}