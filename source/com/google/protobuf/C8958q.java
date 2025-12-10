package com.google.protobuf;

import com.google.protobuf.FieldSet;
import com.google.protobuf.LazyField;
import com.google.protobuf.WireFormat;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.protobuf.q */
/* loaded from: classes4.dex */
public final class C8958q implements InterfaceC8961t {

    /* renamed from: a */
    public final MessageLite f57503a;

    /* renamed from: b */
    public final AbstractC8973w f57504b;

    /* renamed from: c */
    public final boolean f57505c;

    /* renamed from: d */
    public final AbstractC8943g f57506d;

    public C8958q(AbstractC8973w abstractC8973w, AbstractC8943g abstractC8943g, MessageLite messageLite) {
        this.f57504b = abstractC8973w;
        this.f57505c = abstractC8943g.mo35300e(messageLite);
        this.f57506d = abstractC8943g;
        this.f57503a = messageLite;
    }

    /* renamed from: j */
    private int m35169j(AbstractC8973w abstractC8973w, Object obj) {
        return abstractC8973w.mo35006i(abstractC8973w.mo35008g(obj));
    }

    /* renamed from: k */
    private void m35168k(AbstractC8973w abstractC8973w, AbstractC8943g abstractC8943g, Object obj, InterfaceC8960s interfaceC8960s, ExtensionRegistryLite extensionRegistryLite) {
        Object mo35009f = abstractC8973w.mo35009f(obj);
        FieldSet mo35301d = abstractC8943g.mo35301d(obj);
        do {
            try {
                if (interfaceC8960s.mo35135m() == Integer.MAX_VALUE) {
                    return;
                }
            } finally {
                abstractC8973w.mo35002o(obj, mo35009f);
            }
        } while (m35166m(interfaceC8960s, extensionRegistryLite, abstractC8943g, mo35301d, abstractC8973w, mo35009f));
    }

    /* renamed from: l */
    public static C8958q m35167l(AbstractC8973w abstractC8973w, AbstractC8943g abstractC8943g, MessageLite messageLite) {
        return new C8958q(abstractC8973w, abstractC8943g, messageLite);
    }

    @Override // com.google.protobuf.InterfaceC8961t
    /* renamed from: a */
    public boolean mo35121a(Object obj, Object obj2) {
        if (!this.f57504b.mo35008g(obj).equals(this.f57504b.mo35008g(obj2))) {
            return false;
        }
        if (this.f57505c) {
            return this.f57506d.mo35302c(obj).equals(this.f57506d.mo35302c(obj2));
        }
        return true;
    }

    @Override // com.google.protobuf.InterfaceC8961t
    /* renamed from: b */
    public void mo35120b(Object obj, Object obj2) {
        AbstractC8962u.m35106G(this.f57504b, obj, obj2);
        if (this.f57505c) {
            AbstractC8962u.m35108E(this.f57506d, obj, obj2);
        }
    }

    @Override // com.google.protobuf.InterfaceC8961t
    /* renamed from: c */
    public int mo35119c(Object obj) {
        int hashCode = this.f57504b.mo35008g(obj).hashCode();
        if (this.f57505c) {
            return (hashCode * 53) + this.f57506d.mo35302c(obj).hashCode();
        }
        return hashCode;
    }

    @Override // com.google.protobuf.InterfaceC8961t
    /* renamed from: d */
    public final boolean mo35118d(Object obj) {
        return this.f57506d.mo35302c(obj).m35853t();
    }

    @Override // com.google.protobuf.InterfaceC8961t
    /* renamed from: e */
    public void mo35117e(Object obj) {
        this.f57504b.mo35005j(obj);
        this.f57506d.mo35299f(obj);
    }

    @Override // com.google.protobuf.InterfaceC8961t
    /* renamed from: f */
    public int mo35116f(Object obj) {
        int m35169j = m35169j(this.f57504b, obj);
        if (this.f57505c) {
            return m35169j + this.f57506d.mo35302c(obj).m35862k();
        }
        return m35169j;
    }

    @Override // com.google.protobuf.InterfaceC8961t
    /* renamed from: g */
    public void mo35115g(Object obj, Writer writer) {
        Iterator m35849x = this.f57506d.mo35302c(obj).m35849x();
        while (m35849x.hasNext()) {
            Map.Entry entry = (Map.Entry) m35849x.next();
            FieldSet.FieldDescriptorLite fieldDescriptorLite = (FieldSet.FieldDescriptorLite) entry.getKey();
            if (fieldDescriptorLite.getLiteJavaType() == WireFormat.JavaType.MESSAGE && !fieldDescriptorLite.isRepeated() && !fieldDescriptorLite.isPacked()) {
                if (entry instanceof LazyField.C8891b) {
                    writer.mo35338b(fieldDescriptorLite.getNumber(), ((LazyField.C8891b) entry).m35777a().toByteString());
                } else {
                    writer.mo35338b(fieldDescriptorLite.getNumber(), entry.getValue());
                }
            } else {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
        }
        m35165n(this.f57504b, obj, writer);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00cb A[EDGE_INSN: B:57:0x00cb->B:34:0x00cb ?: BREAK  , SYNTHETIC] */
    @Override // com.google.protobuf.InterfaceC8961t
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void mo35114h(java.lang.Object r11, byte[] r12, int r13, int r14, com.google.protobuf.AbstractC8934b.C8936b r15) {
        /*
            r10 = this;
            r0 = r11
            com.google.protobuf.GeneratedMessageLite r0 = (com.google.protobuf.GeneratedMessageLite) r0
            com.google.protobuf.UnknownFieldSetLite r1 = r0.unknownFields
            com.google.protobuf.UnknownFieldSetLite r2 = com.google.protobuf.UnknownFieldSetLite.getDefaultInstance()
            if (r1 != r2) goto L11
            com.google.protobuf.UnknownFieldSetLite r1 = com.google.protobuf.UnknownFieldSetLite.m35537k()
            r0.unknownFields = r1
        L11:
            com.google.protobuf.GeneratedMessageLite$ExtendableMessage r11 = (com.google.protobuf.GeneratedMessageLite.ExtendableMessage) r11
            com.google.protobuf.FieldSet r11 = r11.m35809C()
            r0 = 0
            r2 = r0
        L19:
            if (r13 >= r14) goto Ld7
            int r4 = com.google.protobuf.AbstractC8934b.m35414I(r12, r13, r15)
            int r13 = r15.f57452a
            int r3 = com.google.protobuf.WireFormat.f57445a
            r5 = 2
            if (r13 == r3) goto L6b
            int r3 = com.google.protobuf.WireFormat.getTagWireType(r13)
            if (r3 != r5) goto L66
            com.google.protobuf.g r2 = r10.f57506d
            com.google.protobuf.ExtensionRegistryLite r3 = r15.f57455d
            com.google.protobuf.MessageLite r5 = r10.f57503a
            int r6 = com.google.protobuf.WireFormat.getTagFieldNumber(r13)
            java.lang.Object r2 = r2.mo35303b(r3, r5, r6)
            r8 = r2
            com.google.protobuf.GeneratedMessageLite$GeneratedExtension r8 = (com.google.protobuf.GeneratedMessageLite.GeneratedExtension) r8
            if (r8 == 0) goto L5c
            Jo1 r13 = p000.C17878Jo1.m67679a()
            com.google.protobuf.MessageLite r2 = r8.getMessageDefaultInstance()
            java.lang.Class r2 = r2.getClass()
            com.google.protobuf.t r13 = r13.m67677c(r2)
            int r13 = com.google.protobuf.AbstractC8934b.m35391p(r13, r12, r4, r14, r15)
            com.google.protobuf.GeneratedMessageLite$b r2 = r8.f57348d
            java.lang.Object r3 = r15.f57454c
            r11.m35878D(r2, r3)
        L5a:
            r2 = r8
            goto L19
        L5c:
            r2 = r13
            r3 = r12
            r5 = r14
            r6 = r1
            r7 = r15
            int r13 = com.google.protobuf.AbstractC8934b.m35416G(r2, r3, r4, r5, r6, r7)
            goto L5a
        L66:
            int r13 = com.google.protobuf.AbstractC8934b.m35407P(r13, r12, r4, r14, r15)
            goto L19
        L6b:
            r13 = 0
            r3 = r0
        L6d:
            if (r4 >= r14) goto Lcb
            int r4 = com.google.protobuf.AbstractC8934b.m35414I(r12, r4, r15)
            int r6 = r15.f57452a
            int r7 = com.google.protobuf.WireFormat.getTagFieldNumber(r6)
            int r8 = com.google.protobuf.WireFormat.getTagWireType(r6)
            if (r7 == r5) goto Lac
            r9 = 3
            if (r7 == r9) goto L83
            goto Lc1
        L83:
            if (r2 == 0) goto La1
            Jo1 r6 = p000.C17878Jo1.m67679a()
            com.google.protobuf.MessageLite r7 = r2.getMessageDefaultInstance()
            java.lang.Class r7 = r7.getClass()
            com.google.protobuf.t r6 = r6.m67677c(r7)
            int r4 = com.google.protobuf.AbstractC8934b.m35391p(r6, r12, r4, r14, r15)
            com.google.protobuf.GeneratedMessageLite$b r6 = r2.f57348d
            java.lang.Object r7 = r15.f57454c
            r11.m35878D(r6, r7)
            goto L6d
        La1:
            if (r8 != r5) goto Lc1
            int r4 = com.google.protobuf.AbstractC8934b.m35405b(r12, r4, r15)
            java.lang.Object r3 = r15.f57454c
            com.google.protobuf.ByteString r3 = (com.google.protobuf.ByteString) r3
            goto L6d
        Lac:
            if (r8 != 0) goto Lc1
            int r4 = com.google.protobuf.AbstractC8934b.m35414I(r12, r4, r15)
            int r13 = r15.f57452a
            com.google.protobuf.g r2 = r10.f57506d
            com.google.protobuf.ExtensionRegistryLite r6 = r15.f57455d
            com.google.protobuf.MessageLite r7 = r10.f57503a
            java.lang.Object r2 = r2.mo35303b(r6, r7, r13)
            com.google.protobuf.GeneratedMessageLite$GeneratedExtension r2 = (com.google.protobuf.GeneratedMessageLite.GeneratedExtension) r2
            goto L6d
        Lc1:
            int r7 = com.google.protobuf.WireFormat.f57446b
            if (r6 != r7) goto Lc6
            goto Lcb
        Lc6:
            int r4 = com.google.protobuf.AbstractC8934b.m35407P(r6, r12, r4, r14, r15)
            goto L6d
        Lcb:
            if (r3 == 0) goto Ld4
            int r13 = com.google.protobuf.WireFormat.m35424a(r13, r5)
            r1.m35534n(r13, r3)
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C8958q.mo35114h(java.lang.Object, byte[], int, int, com.google.protobuf.b$b):void");
    }

    @Override // com.google.protobuf.InterfaceC8961t
    /* renamed from: i */
    public void mo35113i(Object obj, InterfaceC8960s interfaceC8960s, ExtensionRegistryLite extensionRegistryLite) {
        m35168k(this.f57504b, this.f57506d, obj, interfaceC8960s, extensionRegistryLite);
    }

    /* renamed from: m */
    public final boolean m35166m(InterfaceC8960s interfaceC8960s, ExtensionRegistryLite extensionRegistryLite, AbstractC8943g abstractC8943g, FieldSet fieldSet, AbstractC8973w abstractC8973w, Object obj) {
        int tag = interfaceC8960s.getTag();
        if (tag != WireFormat.f57445a) {
            if (WireFormat.getTagWireType(tag) == 2) {
                Object mo35303b = abstractC8943g.mo35303b(extensionRegistryLite, this.f57503a, WireFormat.getTagFieldNumber(tag));
                if (mo35303b != null) {
                    abstractC8943g.mo35297h(interfaceC8960s, mo35303b, extensionRegistryLite, fieldSet);
                    return true;
                }
                return abstractC8973w.m35025m(obj, interfaceC8960s);
            }
            return interfaceC8960s.mo35132p();
        }
        Object obj2 = null;
        ByteString byteString = null;
        int i = 0;
        while (interfaceC8960s.mo35135m() != Integer.MAX_VALUE) {
            int tag2 = interfaceC8960s.getTag();
            if (tag2 == WireFormat.f57447c) {
                i = interfaceC8960s.mo35145c();
                obj2 = abstractC8943g.mo35303b(extensionRegistryLite, this.f57503a, i);
            } else if (tag2 == WireFormat.f57448d) {
                if (obj2 != null) {
                    abstractC8943g.mo35297h(interfaceC8960s, obj2, extensionRegistryLite, fieldSet);
                } else {
                    byteString = interfaceC8960s.mo35141g();
                }
            } else if (!interfaceC8960s.mo35132p()) {
                break;
            }
        }
        if (interfaceC8960s.getTag() == WireFormat.f57446b) {
            if (byteString != null) {
                if (obj2 != null) {
                    abstractC8943g.mo35296i(byteString, obj2, extensionRegistryLite, fieldSet);
                } else {
                    abstractC8973w.mo35011d(obj, i, byteString);
                }
            }
            return true;
        }
        throw InvalidProtocolBufferException.invalidEndTag();
    }

    /* renamed from: n */
    public final void m35165n(AbstractC8973w abstractC8973w, Object obj, Writer writer) {
        abstractC8973w.mo34998s(abstractC8973w.mo35008g(obj), writer);
    }

    @Override // com.google.protobuf.InterfaceC8961t
    public Object newInstance() {
        MessageLite messageLite = this.f57503a;
        if (messageLite instanceof GeneratedMessageLite) {
            return ((GeneratedMessageLite) messageLite).m35819v();
        }
        return messageLite.newBuilderForType().buildPartial();
    }
}
