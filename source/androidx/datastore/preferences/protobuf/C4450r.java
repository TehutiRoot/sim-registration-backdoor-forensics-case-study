package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.FieldSet;
import androidx.datastore.preferences.protobuf.LazyField;
import androidx.datastore.preferences.protobuf.WireFormat;
import java.util.Iterator;
import java.util.Map;

/* renamed from: androidx.datastore.preferences.protobuf.r */
/* loaded from: classes2.dex */
public final class C4450r implements InterfaceC4454v {

    /* renamed from: a */
    public final MessageLite f34969a;

    /* renamed from: b */
    public final AbstractC4466y f34970b;

    /* renamed from: c */
    public final boolean f34971c;

    /* renamed from: d */
    public final AbstractC4435h f34972d;

    public C4450r(AbstractC4466y abstractC4466y, AbstractC4435h abstractC4435h, MessageLite messageLite) {
        this.f34970b = abstractC4466y;
        this.f34971c = abstractC4435h.mo55194e(messageLite);
        this.f34972d = abstractC4435h;
        this.f34969a = messageLite;
    }

    /* renamed from: j */
    private int m55070j(AbstractC4466y abstractC4466y, Object obj) {
        return abstractC4466y.mo54907i(abstractC4466y.mo54909g(obj));
    }

    /* renamed from: k */
    private void m55069k(AbstractC4466y abstractC4466y, AbstractC4435h abstractC4435h, Object obj, InterfaceC4453u interfaceC4453u, ExtensionRegistryLite extensionRegistryLite) {
        Object mo54910f = abstractC4466y.mo54910f(obj);
        FieldSet mo55195d = abstractC4435h.mo55195d(obj);
        do {
            try {
                if (interfaceC4453u.mo55036m() == Integer.MAX_VALUE) {
                    return;
                }
            } finally {
                abstractC4466y.mo54903o(obj, mo54910f);
            }
        } while (m55067m(interfaceC4453u, extensionRegistryLite, abstractC4435h, mo55195d, abstractC4466y, mo54910f));
    }

    /* renamed from: l */
    public static C4450r m55068l(AbstractC4466y abstractC4466y, AbstractC4435h abstractC4435h, MessageLite messageLite) {
        return new C4450r(abstractC4466y, abstractC4435h, messageLite);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC4454v
    /* renamed from: a */
    public boolean mo55022a(Object obj, Object obj2) {
        if (!this.f34970b.mo54909g(obj).equals(this.f34970b.mo54909g(obj2))) {
            return false;
        }
        if (this.f34971c) {
            return this.f34972d.mo55196c(obj).equals(this.f34972d.mo55196c(obj2));
        }
        return true;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC4454v
    /* renamed from: b */
    public void mo55021b(Object obj, Object obj2) {
        AbstractC4455w.m55007G(this.f34970b, obj, obj2);
        if (this.f34971c) {
            AbstractC4455w.m55009E(this.f34972d, obj, obj2);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC4454v
    /* renamed from: c */
    public int mo55020c(Object obj) {
        int hashCode = this.f34970b.mo54909g(obj).hashCode();
        if (this.f34971c) {
            return (hashCode * 53) + this.f34972d.mo55196c(obj).hashCode();
        }
        return hashCode;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC4454v
    /* renamed from: d */
    public final boolean mo55019d(Object obj) {
        return this.f34972d.mo55196c(obj).m55784t();
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC4454v
    /* renamed from: e */
    public void mo55018e(Object obj) {
        this.f34970b.mo54906j(obj);
        this.f34972d.mo55193f(obj);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC4454v
    /* renamed from: f */
    public int mo55017f(Object obj) {
        int m55070j = m55070j(this.f34970b, obj);
        if (this.f34971c) {
            return m55070j + this.f34972d.mo55196c(obj).m55793k();
        }
        return m55070j;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC4454v
    /* renamed from: g */
    public void mo55016g(Object obj, Writer writer) {
        Iterator m55781w = this.f34972d.mo55196c(obj).m55781w();
        while (m55781w.hasNext()) {
            Map.Entry entry = (Map.Entry) m55781w.next();
            FieldSet.FieldDescriptorLite fieldDescriptorLite = (FieldSet.FieldDescriptorLite) entry.getKey();
            if (fieldDescriptorLite.getLiteJavaType() == WireFormat.JavaType.MESSAGE && !fieldDescriptorLite.isRepeated() && !fieldDescriptorLite.isPacked()) {
                if (entry instanceof LazyField.C4380b) {
                    writer.mo55232b(fieldDescriptorLite.getNumber(), ((LazyField.C4380b) entry).m55721a().toByteString());
                } else {
                    writer.mo55232b(fieldDescriptorLite.getNumber(), entry.getValue());
                }
            } else {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
        }
        m55066n(this.f34970b, obj, writer);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC4454v
    /* renamed from: h */
    public void mo55015h(Object obj, InterfaceC4453u interfaceC4453u, ExtensionRegistryLite extensionRegistryLite) {
        m55069k(this.f34970b, this.f34972d, obj, interfaceC4453u, extensionRegistryLite);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00cb A[EDGE_INSN: B:57:0x00cb->B:34:0x00cb ?: BREAK  , SYNTHETIC] */
    @Override // androidx.datastore.preferences.protobuf.InterfaceC4454v
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void mo55014i(java.lang.Object r11, byte[] r12, int r13, int r14, androidx.datastore.preferences.protobuf.AbstractC4423b.C4425b r15) {
        /*
            r10 = this;
            r0 = r11
            androidx.datastore.preferences.protobuf.GeneratedMessageLite r0 = (androidx.datastore.preferences.protobuf.GeneratedMessageLite) r0
            androidx.datastore.preferences.protobuf.UnknownFieldSetLite r1 = r0.unknownFields
            androidx.datastore.preferences.protobuf.UnknownFieldSetLite r2 = androidx.datastore.preferences.protobuf.UnknownFieldSetLite.getDefaultInstance()
            if (r1 != r2) goto L11
            androidx.datastore.preferences.protobuf.UnknownFieldSetLite r1 = androidx.datastore.preferences.protobuf.UnknownFieldSetLite.m55453l()
            r0.unknownFields = r1
        L11:
            androidx.datastore.preferences.protobuf.GeneratedMessageLite$ExtendableMessage r11 = (androidx.datastore.preferences.protobuf.GeneratedMessageLite.ExtendableMessage) r11
            androidx.datastore.preferences.protobuf.FieldSet r11 = r11.m55753r()
            r0 = 0
            r2 = r0
        L19:
            if (r13 >= r14) goto Ld7
            int r4 = androidx.datastore.preferences.protobuf.AbstractC4423b.m55328I(r12, r13, r15)
            int r13 = r15.f34911a
            int r3 = androidx.datastore.preferences.protobuf.WireFormat.f34904a
            r5 = 2
            if (r13 == r3) goto L6b
            int r3 = androidx.datastore.preferences.protobuf.WireFormat.getTagWireType(r13)
            if (r3 != r5) goto L66
            androidx.datastore.preferences.protobuf.h r2 = r10.f34972d
            androidx.datastore.preferences.protobuf.ExtensionRegistryLite r3 = r15.f34914d
            androidx.datastore.preferences.protobuf.MessageLite r5 = r10.f34969a
            int r6 = androidx.datastore.preferences.protobuf.WireFormat.getTagFieldNumber(r13)
            java.lang.Object r2 = r2.mo55197b(r3, r5, r6)
            r8 = r2
            androidx.datastore.preferences.protobuf.GeneratedMessageLite$GeneratedExtension r8 = (androidx.datastore.preferences.protobuf.GeneratedMessageLite.GeneratedExtension) r8
            if (r8 == 0) goto L5c
            Ko1 r13 = p000.C17942Ko1.m67586a()
            androidx.datastore.preferences.protobuf.MessageLite r2 = r8.getMessageDefaultInstance()
            java.lang.Class r2 = r2.getClass()
            androidx.datastore.preferences.protobuf.v r13 = r13.m67583d(r2)
            int r13 = androidx.datastore.preferences.protobuf.AbstractC4423b.m55307p(r13, r12, r4, r14, r15)
            androidx.datastore.preferences.protobuf.GeneratedMessageLite$b r2 = r8.f34808d
            java.lang.Object r3 = r15.f34913c
            r11.m55809C(r2, r3)
        L5a:
            r2 = r8
            goto L19
        L5c:
            r2 = r13
            r3 = r12
            r5 = r14
            r6 = r1
            r7 = r15
            int r13 = androidx.datastore.preferences.protobuf.AbstractC4423b.m55330G(r2, r3, r4, r5, r6, r7)
            goto L5a
        L66:
            int r13 = androidx.datastore.preferences.protobuf.AbstractC4423b.m55323N(r13, r12, r4, r14, r15)
            goto L19
        L6b:
            r13 = 0
            r3 = r0
        L6d:
            if (r4 >= r14) goto Lcb
            int r4 = androidx.datastore.preferences.protobuf.AbstractC4423b.m55328I(r12, r4, r15)
            int r6 = r15.f34911a
            int r7 = androidx.datastore.preferences.protobuf.WireFormat.getTagFieldNumber(r6)
            int r8 = androidx.datastore.preferences.protobuf.WireFormat.getTagWireType(r6)
            if (r7 == r5) goto Lac
            r9 = 3
            if (r7 == r9) goto L83
            goto Lc1
        L83:
            if (r2 == 0) goto La1
            Ko1 r6 = p000.C17942Ko1.m67586a()
            androidx.datastore.preferences.protobuf.MessageLite r7 = r2.getMessageDefaultInstance()
            java.lang.Class r7 = r7.getClass()
            androidx.datastore.preferences.protobuf.v r6 = r6.m67583d(r7)
            int r4 = androidx.datastore.preferences.protobuf.AbstractC4423b.m55307p(r6, r12, r4, r14, r15)
            androidx.datastore.preferences.protobuf.GeneratedMessageLite$b r6 = r2.f34808d
            java.lang.Object r7 = r15.f34913c
            r11.m55809C(r6, r7)
            goto L6d
        La1:
            if (r8 != r5) goto Lc1
            int r4 = androidx.datastore.preferences.protobuf.AbstractC4423b.m55321b(r12, r4, r15)
            java.lang.Object r3 = r15.f34913c
            androidx.datastore.preferences.protobuf.ByteString r3 = (androidx.datastore.preferences.protobuf.ByteString) r3
            goto L6d
        Lac:
            if (r8 != 0) goto Lc1
            int r4 = androidx.datastore.preferences.protobuf.AbstractC4423b.m55328I(r12, r4, r15)
            int r13 = r15.f34911a
            androidx.datastore.preferences.protobuf.h r2 = r10.f34972d
            androidx.datastore.preferences.protobuf.ExtensionRegistryLite r6 = r15.f34914d
            androidx.datastore.preferences.protobuf.MessageLite r7 = r10.f34969a
            java.lang.Object r2 = r2.mo55197b(r6, r7, r13)
            androidx.datastore.preferences.protobuf.GeneratedMessageLite$GeneratedExtension r2 = (androidx.datastore.preferences.protobuf.GeneratedMessageLite.GeneratedExtension) r2
            goto L6d
        Lc1:
            int r7 = androidx.datastore.preferences.protobuf.WireFormat.f34905b
            if (r6 != r7) goto Lc6
            goto Lcb
        Lc6:
            int r4 = androidx.datastore.preferences.protobuf.AbstractC4423b.m55323N(r6, r12, r4, r14, r15)
            goto L6d
        Lcb:
            if (r3 == 0) goto Ld4
            int r13 = androidx.datastore.preferences.protobuf.WireFormat.m55338a(r13, r5)
            r1.m55451n(r13, r3)
        Ld4:
            r13 = r4
            goto L19
        Ld7:
            if (r13 != r14) goto Lda
            return
        Lda:
            androidx.datastore.preferences.protobuf.InvalidProtocolBufferException r11 = androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.parseFailure()
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.C4450r.mo55014i(java.lang.Object, byte[], int, int, androidx.datastore.preferences.protobuf.b$b):void");
    }

    /* renamed from: m */
    public final boolean m55067m(InterfaceC4453u interfaceC4453u, ExtensionRegistryLite extensionRegistryLite, AbstractC4435h abstractC4435h, FieldSet fieldSet, AbstractC4466y abstractC4466y, Object obj) {
        int tag = interfaceC4453u.getTag();
        if (tag != WireFormat.f34904a) {
            if (WireFormat.getTagWireType(tag) == 2) {
                Object mo55197b = abstractC4435h.mo55197b(extensionRegistryLite, this.f34969a, WireFormat.getTagFieldNumber(tag));
                if (mo55197b != null) {
                    abstractC4435h.mo55191h(interfaceC4453u, mo55197b, extensionRegistryLite, fieldSet);
                    return true;
                }
                return abstractC4466y.m54926m(obj, interfaceC4453u);
            }
            return interfaceC4453u.mo55033p();
        }
        Object obj2 = null;
        ByteString byteString = null;
        int i = 0;
        while (interfaceC4453u.mo55036m() != Integer.MAX_VALUE) {
            int tag2 = interfaceC4453u.getTag();
            if (tag2 == WireFormat.f34906c) {
                i = interfaceC4453u.mo55046c();
                obj2 = abstractC4435h.mo55197b(extensionRegistryLite, this.f34969a, i);
            } else if (tag2 == WireFormat.f34907d) {
                if (obj2 != null) {
                    abstractC4435h.mo55191h(interfaceC4453u, obj2, extensionRegistryLite, fieldSet);
                } else {
                    byteString = interfaceC4453u.mo55042g();
                }
            } else if (!interfaceC4453u.mo55033p()) {
                break;
            }
        }
        if (interfaceC4453u.getTag() == WireFormat.f34905b) {
            if (byteString != null) {
                if (obj2 != null) {
                    abstractC4435h.mo55190i(byteString, obj2, extensionRegistryLite, fieldSet);
                } else {
                    abstractC4466y.mo54912d(obj, i, byteString);
                }
            }
            return true;
        }
        throw InvalidProtocolBufferException.invalidEndTag();
    }

    /* renamed from: n */
    public final void m55066n(AbstractC4466y abstractC4466y, Object obj, Writer writer) {
        abstractC4466y.mo54899s(abstractC4466y.mo54909g(obj), writer);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC4454v
    public Object newInstance() {
        return this.f34969a.newBuilderForType().buildPartial();
    }
}
