package com.google.protobuf;

import com.google.protobuf.FieldSet;
import com.google.protobuf.LazyField;
import com.google.protobuf.WireFormat;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.protobuf.q */
/* loaded from: classes4.dex */
public final class C8947q implements InterfaceC8950t {

    /* renamed from: a */
    public final MessageLite f57515a;

    /* renamed from: b */
    public final AbstractC8962w f57516b;

    /* renamed from: c */
    public final boolean f57517c;

    /* renamed from: d */
    public final AbstractC8932g f57518d;

    public C8947q(AbstractC8962w abstractC8962w, AbstractC8932g abstractC8932g, MessageLite messageLite) {
        this.f57516b = abstractC8962w;
        this.f57517c = abstractC8932g.mo35292e(messageLite);
        this.f57518d = abstractC8932g;
        this.f57515a = messageLite;
    }

    /* renamed from: j */
    private int m35161j(AbstractC8962w abstractC8962w, Object obj) {
        return abstractC8962w.mo34998i(abstractC8962w.mo35000g(obj));
    }

    /* renamed from: k */
    private void m35160k(AbstractC8962w abstractC8962w, AbstractC8932g abstractC8932g, Object obj, InterfaceC8949s interfaceC8949s, ExtensionRegistryLite extensionRegistryLite) {
        Object mo35001f = abstractC8962w.mo35001f(obj);
        FieldSet mo35293d = abstractC8932g.mo35293d(obj);
        do {
            try {
                if (interfaceC8949s.mo35127m() == Integer.MAX_VALUE) {
                    return;
                }
            } finally {
                abstractC8962w.mo34994o(obj, mo35001f);
            }
        } while (m35158m(interfaceC8949s, extensionRegistryLite, abstractC8932g, mo35293d, abstractC8962w, mo35001f));
    }

    /* renamed from: l */
    public static C8947q m35159l(AbstractC8962w abstractC8962w, AbstractC8932g abstractC8932g, MessageLite messageLite) {
        return new C8947q(abstractC8962w, abstractC8932g, messageLite);
    }

    @Override // com.google.protobuf.InterfaceC8950t
    /* renamed from: a */
    public boolean mo35113a(Object obj, Object obj2) {
        if (!this.f57516b.mo35000g(obj).equals(this.f57516b.mo35000g(obj2))) {
            return false;
        }
        if (this.f57517c) {
            return this.f57518d.mo35294c(obj).equals(this.f57518d.mo35294c(obj2));
        }
        return true;
    }

    @Override // com.google.protobuf.InterfaceC8950t
    /* renamed from: b */
    public void mo35112b(Object obj, Object obj2) {
        AbstractC8951u.m35098G(this.f57516b, obj, obj2);
        if (this.f57517c) {
            AbstractC8951u.m35100E(this.f57518d, obj, obj2);
        }
    }

    @Override // com.google.protobuf.InterfaceC8950t
    /* renamed from: c */
    public int mo35111c(Object obj) {
        int hashCode = this.f57516b.mo35000g(obj).hashCode();
        if (this.f57517c) {
            return (hashCode * 53) + this.f57518d.mo35294c(obj).hashCode();
        }
        return hashCode;
    }

    @Override // com.google.protobuf.InterfaceC8950t
    /* renamed from: d */
    public final boolean mo35110d(Object obj) {
        return this.f57518d.mo35294c(obj).m35845t();
    }

    @Override // com.google.protobuf.InterfaceC8950t
    /* renamed from: e */
    public void mo35109e(Object obj) {
        this.f57516b.mo34997j(obj);
        this.f57518d.mo35291f(obj);
    }

    @Override // com.google.protobuf.InterfaceC8950t
    /* renamed from: f */
    public int mo35108f(Object obj) {
        int m35161j = m35161j(this.f57516b, obj);
        if (this.f57517c) {
            return m35161j + this.f57518d.mo35294c(obj).m35854k();
        }
        return m35161j;
    }

    @Override // com.google.protobuf.InterfaceC8950t
    /* renamed from: g */
    public void mo35107g(Object obj, Writer writer) {
        Iterator m35841x = this.f57518d.mo35294c(obj).m35841x();
        while (m35841x.hasNext()) {
            Map.Entry entry = (Map.Entry) m35841x.next();
            FieldSet.FieldDescriptorLite fieldDescriptorLite = (FieldSet.FieldDescriptorLite) entry.getKey();
            if (fieldDescriptorLite.getLiteJavaType() == WireFormat.JavaType.MESSAGE && !fieldDescriptorLite.isRepeated() && !fieldDescriptorLite.isPacked()) {
                if (entry instanceof LazyField.C8880b) {
                    writer.mo35330b(fieldDescriptorLite.getNumber(), ((LazyField.C8880b) entry).m35769a().toByteString());
                } else {
                    writer.mo35330b(fieldDescriptorLite.getNumber(), entry.getValue());
                }
            } else {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
        }
        m35157n(this.f57516b, obj, writer);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00cb A[EDGE_INSN: B:57:0x00cb->B:34:0x00cb ?: BREAK  , SYNTHETIC] */
    @Override // com.google.protobuf.InterfaceC8950t
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void mo35106h(java.lang.Object r11, byte[] r12, int r13, int r14, com.google.protobuf.AbstractC8923b.C8925b r15) {
        /*
            r10 = this;
            r0 = r11
            com.google.protobuf.GeneratedMessageLite r0 = (com.google.protobuf.GeneratedMessageLite) r0
            com.google.protobuf.UnknownFieldSetLite r1 = r0.unknownFields
            com.google.protobuf.UnknownFieldSetLite r2 = com.google.protobuf.UnknownFieldSetLite.getDefaultInstance()
            if (r1 != r2) goto L11
            com.google.protobuf.UnknownFieldSetLite r1 = com.google.protobuf.UnknownFieldSetLite.m35529k()
            r0.unknownFields = r1
        L11:
            com.google.protobuf.GeneratedMessageLite$ExtendableMessage r11 = (com.google.protobuf.GeneratedMessageLite.ExtendableMessage) r11
            com.google.protobuf.FieldSet r11 = r11.m35801C()
            r0 = 0
            r2 = r0
        L19:
            if (r13 >= r14) goto Ld7
            int r4 = com.google.protobuf.AbstractC8923b.m35406I(r12, r13, r15)
            int r13 = r15.f57464a
            int r3 = com.google.protobuf.WireFormat.f57457a
            r5 = 2
            if (r13 == r3) goto L6b
            int r3 = com.google.protobuf.WireFormat.getTagWireType(r13)
            if (r3 != r5) goto L66
            com.google.protobuf.g r2 = r10.f57518d
            com.google.protobuf.ExtensionRegistryLite r3 = r15.f57467d
            com.google.protobuf.MessageLite r5 = r10.f57515a
            int r6 = com.google.protobuf.WireFormat.getTagFieldNumber(r13)
            java.lang.Object r2 = r2.mo35295b(r3, r5, r6)
            r8 = r2
            com.google.protobuf.GeneratedMessageLite$GeneratedExtension r8 = (com.google.protobuf.GeneratedMessageLite.GeneratedExtension) r8
            if (r8 == 0) goto L5c
            Gp1 r13 = p000.C17718Gp1.m68203a()
            com.google.protobuf.MessageLite r2 = r8.getMessageDefaultInstance()
            java.lang.Class r2 = r2.getClass()
            com.google.protobuf.t r13 = r13.m68201c(r2)
            int r13 = com.google.protobuf.AbstractC8923b.m35383p(r13, r12, r4, r14, r15)
            com.google.protobuf.GeneratedMessageLite$b r2 = r8.f57360d
            java.lang.Object r3 = r15.f57466c
            r11.m35870D(r2, r3)
        L5a:
            r2 = r8
            goto L19
        L5c:
            r2 = r13
            r3 = r12
            r5 = r14
            r6 = r1
            r7 = r15
            int r13 = com.google.protobuf.AbstractC8923b.m35408G(r2, r3, r4, r5, r6, r7)
            goto L5a
        L66:
            int r13 = com.google.protobuf.AbstractC8923b.m35399P(r13, r12, r4, r14, r15)
            goto L19
        L6b:
            r13 = 0
            r3 = r0
        L6d:
            if (r4 >= r14) goto Lcb
            int r4 = com.google.protobuf.AbstractC8923b.m35406I(r12, r4, r15)
            int r6 = r15.f57464a
            int r7 = com.google.protobuf.WireFormat.getTagFieldNumber(r6)
            int r8 = com.google.protobuf.WireFormat.getTagWireType(r6)
            if (r7 == r5) goto Lac
            r9 = 3
            if (r7 == r9) goto L83
            goto Lc1
        L83:
            if (r2 == 0) goto La1
            Gp1 r6 = p000.C17718Gp1.m68203a()
            com.google.protobuf.MessageLite r7 = r2.getMessageDefaultInstance()
            java.lang.Class r7 = r7.getClass()
            com.google.protobuf.t r6 = r6.m68201c(r7)
            int r4 = com.google.protobuf.AbstractC8923b.m35383p(r6, r12, r4, r14, r15)
            com.google.protobuf.GeneratedMessageLite$b r6 = r2.f57360d
            java.lang.Object r7 = r15.f57466c
            r11.m35870D(r6, r7)
            goto L6d
        La1:
            if (r8 != r5) goto Lc1
            int r4 = com.google.protobuf.AbstractC8923b.m35397b(r12, r4, r15)
            java.lang.Object r3 = r15.f57466c
            com.google.protobuf.ByteString r3 = (com.google.protobuf.ByteString) r3
            goto L6d
        Lac:
            if (r8 != 0) goto Lc1
            int r4 = com.google.protobuf.AbstractC8923b.m35406I(r12, r4, r15)
            int r13 = r15.f57464a
            com.google.protobuf.g r2 = r10.f57518d
            com.google.protobuf.ExtensionRegistryLite r6 = r15.f57467d
            com.google.protobuf.MessageLite r7 = r10.f57515a
            java.lang.Object r2 = r2.mo35295b(r6, r7, r13)
            com.google.protobuf.GeneratedMessageLite$GeneratedExtension r2 = (com.google.protobuf.GeneratedMessageLite.GeneratedExtension) r2
            goto L6d
        Lc1:
            int r7 = com.google.protobuf.WireFormat.f57458b
            if (r6 != r7) goto Lc6
            goto Lcb
        Lc6:
            int r4 = com.google.protobuf.AbstractC8923b.m35399P(r6, r12, r4, r14, r15)
            goto L6d
        Lcb:
            if (r3 == 0) goto Ld4
            int r13 = com.google.protobuf.WireFormat.m35416a(r13, r5)
            r1.m35526n(r13, r3)
        Ld4:
            r13 = r4
            goto L19
        Ld7:
            if (r13 != r14) goto Lda
            return
        Lda:
            com.google.protobuf.InvalidProtocolBufferException r11 = com.google.protobuf.InvalidProtocolBufferException.parseFailure()
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C8947q.mo35106h(java.lang.Object, byte[], int, int, com.google.protobuf.b$b):void");
    }

    @Override // com.google.protobuf.InterfaceC8950t
    /* renamed from: i */
    public void mo35105i(Object obj, InterfaceC8949s interfaceC8949s, ExtensionRegistryLite extensionRegistryLite) {
        m35160k(this.f57516b, this.f57518d, obj, interfaceC8949s, extensionRegistryLite);
    }

    /* renamed from: m */
    public final boolean m35158m(InterfaceC8949s interfaceC8949s, ExtensionRegistryLite extensionRegistryLite, AbstractC8932g abstractC8932g, FieldSet fieldSet, AbstractC8962w abstractC8962w, Object obj) {
        int tag = interfaceC8949s.getTag();
        if (tag != WireFormat.f57457a) {
            if (WireFormat.getTagWireType(tag) == 2) {
                Object mo35295b = abstractC8932g.mo35295b(extensionRegistryLite, this.f57515a, WireFormat.getTagFieldNumber(tag));
                if (mo35295b != null) {
                    abstractC8932g.mo35289h(interfaceC8949s, mo35295b, extensionRegistryLite, fieldSet);
                    return true;
                }
                return abstractC8962w.m35017m(obj, interfaceC8949s);
            }
            return interfaceC8949s.mo35124p();
        }
        Object obj2 = null;
        ByteString byteString = null;
        int i = 0;
        while (interfaceC8949s.mo35127m() != Integer.MAX_VALUE) {
            int tag2 = interfaceC8949s.getTag();
            if (tag2 == WireFormat.f57459c) {
                i = interfaceC8949s.mo35137c();
                obj2 = abstractC8932g.mo35295b(extensionRegistryLite, this.f57515a, i);
            } else if (tag2 == WireFormat.f57460d) {
                if (obj2 != null) {
                    abstractC8932g.mo35289h(interfaceC8949s, obj2, extensionRegistryLite, fieldSet);
                } else {
                    byteString = interfaceC8949s.mo35133g();
                }
            } else if (!interfaceC8949s.mo35124p()) {
                break;
            }
        }
        if (interfaceC8949s.getTag() == WireFormat.f57458b) {
            if (byteString != null) {
                if (obj2 != null) {
                    abstractC8932g.mo35288i(byteString, obj2, extensionRegistryLite, fieldSet);
                } else {
                    abstractC8962w.mo35003d(obj, i, byteString);
                }
            }
            return true;
        }
        throw InvalidProtocolBufferException.invalidEndTag();
    }

    /* renamed from: n */
    public final void m35157n(AbstractC8962w abstractC8962w, Object obj, Writer writer) {
        abstractC8962w.mo34990s(abstractC8962w.mo35000g(obj), writer);
    }

    @Override // com.google.protobuf.InterfaceC8950t
    public Object newInstance() {
        MessageLite messageLite = this.f57515a;
        if (messageLite instanceof GeneratedMessageLite) {
            return ((GeneratedMessageLite) messageLite).m35811v();
        }
        return messageLite.newBuilderForType().buildPartial();
    }
}