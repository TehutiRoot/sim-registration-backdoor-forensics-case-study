package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.FieldSet;
import androidx.datastore.preferences.protobuf.LazyField;
import androidx.datastore.preferences.protobuf.WireFormat;
import java.util.Iterator;
import java.util.Map;

/* renamed from: androidx.datastore.preferences.protobuf.r */
/* loaded from: classes2.dex */
public final class C4432r implements InterfaceC4436v {

    /* renamed from: a */
    public final MessageLite f35057a;

    /* renamed from: b */
    public final AbstractC4448y f35058b;

    /* renamed from: c */
    public final boolean f35059c;

    /* renamed from: d */
    public final AbstractC4417h f35060d;

    public C4432r(AbstractC4448y abstractC4448y, AbstractC4417h abstractC4417h, MessageLite messageLite) {
        this.f35058b = abstractC4448y;
        this.f35059c = abstractC4417h.mo55144e(messageLite);
        this.f35060d = abstractC4417h;
        this.f35057a = messageLite;
    }

    /* renamed from: j */
    private int m55020j(AbstractC4448y abstractC4448y, Object obj) {
        return abstractC4448y.mo54857i(abstractC4448y.mo54859g(obj));
    }

    /* renamed from: k */
    private void m55019k(AbstractC4448y abstractC4448y, AbstractC4417h abstractC4417h, Object obj, InterfaceC4435u interfaceC4435u, ExtensionRegistryLite extensionRegistryLite) {
        Object mo54860f = abstractC4448y.mo54860f(obj);
        FieldSet mo55145d = abstractC4417h.mo55145d(obj);
        do {
            try {
                if (interfaceC4435u.mo54986m() == Integer.MAX_VALUE) {
                    return;
                }
            } finally {
                abstractC4448y.mo54853o(obj, mo54860f);
            }
        } while (m55017m(interfaceC4435u, extensionRegistryLite, abstractC4417h, mo55145d, abstractC4448y, mo54860f));
    }

    /* renamed from: l */
    public static C4432r m55018l(AbstractC4448y abstractC4448y, AbstractC4417h abstractC4417h, MessageLite messageLite) {
        return new C4432r(abstractC4448y, abstractC4417h, messageLite);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC4436v
    /* renamed from: a */
    public boolean mo54972a(Object obj, Object obj2) {
        if (!this.f35058b.mo54859g(obj).equals(this.f35058b.mo54859g(obj2))) {
            return false;
        }
        if (this.f35059c) {
            return this.f35060d.mo55146c(obj).equals(this.f35060d.mo55146c(obj2));
        }
        return true;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC4436v
    /* renamed from: b */
    public void mo54971b(Object obj, Object obj2) {
        AbstractC4437w.m54957G(this.f35058b, obj, obj2);
        if (this.f35059c) {
            AbstractC4437w.m54959E(this.f35060d, obj, obj2);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC4436v
    /* renamed from: c */
    public int mo54970c(Object obj) {
        int hashCode = this.f35058b.mo54859g(obj).hashCode();
        if (this.f35059c) {
            return (hashCode * 53) + this.f35060d.mo55146c(obj).hashCode();
        }
        return hashCode;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC4436v
    /* renamed from: d */
    public final boolean mo54969d(Object obj) {
        return this.f35060d.mo55146c(obj).m55734t();
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC4436v
    /* renamed from: e */
    public void mo54968e(Object obj) {
        this.f35058b.mo54856j(obj);
        this.f35060d.mo55143f(obj);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC4436v
    /* renamed from: f */
    public int mo54967f(Object obj) {
        int m55020j = m55020j(this.f35058b, obj);
        if (this.f35059c) {
            return m55020j + this.f35060d.mo55146c(obj).m55743k();
        }
        return m55020j;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC4436v
    /* renamed from: g */
    public void mo54966g(Object obj, Writer writer) {
        Iterator m55731w = this.f35060d.mo55146c(obj).m55731w();
        while (m55731w.hasNext()) {
            Map.Entry entry = (Map.Entry) m55731w.next();
            FieldSet.FieldDescriptorLite fieldDescriptorLite = (FieldSet.FieldDescriptorLite) entry.getKey();
            if (fieldDescriptorLite.getLiteJavaType() == WireFormat.JavaType.MESSAGE && !fieldDescriptorLite.isRepeated() && !fieldDescriptorLite.isPacked()) {
                if (entry instanceof LazyField.C4362b) {
                    writer.mo55182b(fieldDescriptorLite.getNumber(), ((LazyField.C4362b) entry).m55671a().toByteString());
                } else {
                    writer.mo55182b(fieldDescriptorLite.getNumber(), entry.getValue());
                }
            } else {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
        }
        m55016n(this.f35058b, obj, writer);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC4436v
    /* renamed from: h */
    public void mo54965h(Object obj, InterfaceC4435u interfaceC4435u, ExtensionRegistryLite extensionRegistryLite) {
        m55019k(this.f35058b, this.f35060d, obj, interfaceC4435u, extensionRegistryLite);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00cb A[EDGE_INSN: B:57:0x00cb->B:34:0x00cb ?: BREAK  , SYNTHETIC] */
    @Override // androidx.datastore.preferences.protobuf.InterfaceC4436v
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void mo54964i(java.lang.Object r11, byte[] r12, int r13, int r14, androidx.datastore.preferences.protobuf.AbstractC4405b.C4407b r15) {
        /*
            r10 = this;
            r0 = r11
            androidx.datastore.preferences.protobuf.GeneratedMessageLite r0 = (androidx.datastore.preferences.protobuf.GeneratedMessageLite) r0
            androidx.datastore.preferences.protobuf.UnknownFieldSetLite r1 = r0.unknownFields
            androidx.datastore.preferences.protobuf.UnknownFieldSetLite r2 = androidx.datastore.preferences.protobuf.UnknownFieldSetLite.getDefaultInstance()
            if (r1 != r2) goto L11
            androidx.datastore.preferences.protobuf.UnknownFieldSetLite r1 = androidx.datastore.preferences.protobuf.UnknownFieldSetLite.m55403l()
            r0.unknownFields = r1
        L11:
            androidx.datastore.preferences.protobuf.GeneratedMessageLite$ExtendableMessage r11 = (androidx.datastore.preferences.protobuf.GeneratedMessageLite.ExtendableMessage) r11
            androidx.datastore.preferences.protobuf.FieldSet r11 = r11.m55703r()
            r0 = 0
            r2 = r0
        L19:
            if (r13 >= r14) goto Ld7
            int r4 = androidx.datastore.preferences.protobuf.AbstractC4405b.m55278I(r12, r13, r15)
            int r13 = r15.f34999a
            int r3 = androidx.datastore.preferences.protobuf.WireFormat.f34992a
            r5 = 2
            if (r13 == r3) goto L6b
            int r3 = androidx.datastore.preferences.protobuf.WireFormat.getTagWireType(r13)
            if (r3 != r5) goto L66
            androidx.datastore.preferences.protobuf.h r2 = r10.f35060d
            androidx.datastore.preferences.protobuf.ExtensionRegistryLite r3 = r15.f35002d
            androidx.datastore.preferences.protobuf.MessageLite r5 = r10.f35057a
            int r6 = androidx.datastore.preferences.protobuf.WireFormat.getTagFieldNumber(r13)
            java.lang.Object r2 = r2.mo55147b(r3, r5, r6)
            r8 = r2
            androidx.datastore.preferences.protobuf.GeneratedMessageLite$GeneratedExtension r8 = (androidx.datastore.preferences.protobuf.GeneratedMessageLite.GeneratedExtension) r8
            if (r8 == 0) goto L5c
            Hp1 r13 = p000.C17783Hp1.m68094a()
            androidx.datastore.preferences.protobuf.MessageLite r2 = r8.getMessageDefaultInstance()
            java.lang.Class r2 = r2.getClass()
            androidx.datastore.preferences.protobuf.v r13 = r13.m68091d(r2)
            int r13 = androidx.datastore.preferences.protobuf.AbstractC4405b.m55257p(r13, r12, r4, r14, r15)
            androidx.datastore.preferences.protobuf.GeneratedMessageLite$b r2 = r8.f34896d
            java.lang.Object r3 = r15.f35001c
            r11.m55759C(r2, r3)
        L5a:
            r2 = r8
            goto L19
        L5c:
            r2 = r13
            r3 = r12
            r5 = r14
            r6 = r1
            r7 = r15
            int r13 = androidx.datastore.preferences.protobuf.AbstractC4405b.m55280G(r2, r3, r4, r5, r6, r7)
            goto L5a
        L66:
            int r13 = androidx.datastore.preferences.protobuf.AbstractC4405b.m55273N(r13, r12, r4, r14, r15)
            goto L19
        L6b:
            r13 = 0
            r3 = r0
        L6d:
            if (r4 >= r14) goto Lcb
            int r4 = androidx.datastore.preferences.protobuf.AbstractC4405b.m55278I(r12, r4, r15)
            int r6 = r15.f34999a
            int r7 = androidx.datastore.preferences.protobuf.WireFormat.getTagFieldNumber(r6)
            int r8 = androidx.datastore.preferences.protobuf.WireFormat.getTagWireType(r6)
            if (r7 == r5) goto Lac
            r9 = 3
            if (r7 == r9) goto L83
            goto Lc1
        L83:
            if (r2 == 0) goto La1
            Hp1 r6 = p000.C17783Hp1.m68094a()
            androidx.datastore.preferences.protobuf.MessageLite r7 = r2.getMessageDefaultInstance()
            java.lang.Class r7 = r7.getClass()
            androidx.datastore.preferences.protobuf.v r6 = r6.m68091d(r7)
            int r4 = androidx.datastore.preferences.protobuf.AbstractC4405b.m55257p(r6, r12, r4, r14, r15)
            androidx.datastore.preferences.protobuf.GeneratedMessageLite$b r6 = r2.f34896d
            java.lang.Object r7 = r15.f35001c
            r11.m55759C(r6, r7)
            goto L6d
        La1:
            if (r8 != r5) goto Lc1
            int r4 = androidx.datastore.preferences.protobuf.AbstractC4405b.m55271b(r12, r4, r15)
            java.lang.Object r3 = r15.f35001c
            androidx.datastore.preferences.protobuf.ByteString r3 = (androidx.datastore.preferences.protobuf.ByteString) r3
            goto L6d
        Lac:
            if (r8 != 0) goto Lc1
            int r4 = androidx.datastore.preferences.protobuf.AbstractC4405b.m55278I(r12, r4, r15)
            int r13 = r15.f34999a
            androidx.datastore.preferences.protobuf.h r2 = r10.f35060d
            androidx.datastore.preferences.protobuf.ExtensionRegistryLite r6 = r15.f35002d
            androidx.datastore.preferences.protobuf.MessageLite r7 = r10.f35057a
            java.lang.Object r2 = r2.mo55147b(r6, r7, r13)
            androidx.datastore.preferences.protobuf.GeneratedMessageLite$GeneratedExtension r2 = (androidx.datastore.preferences.protobuf.GeneratedMessageLite.GeneratedExtension) r2
            goto L6d
        Lc1:
            int r7 = androidx.datastore.preferences.protobuf.WireFormat.f34993b
            if (r6 != r7) goto Lc6
            goto Lcb
        Lc6:
            int r4 = androidx.datastore.preferences.protobuf.AbstractC4405b.m55273N(r6, r12, r4, r14, r15)
            goto L6d
        Lcb:
            if (r3 == 0) goto Ld4
            int r13 = androidx.datastore.preferences.protobuf.WireFormat.m55288a(r13, r5)
            r1.m55401n(r13, r3)
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
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.C4432r.mo54964i(java.lang.Object, byte[], int, int, androidx.datastore.preferences.protobuf.b$b):void");
    }

    /* renamed from: m */
    public final boolean m55017m(InterfaceC4435u interfaceC4435u, ExtensionRegistryLite extensionRegistryLite, AbstractC4417h abstractC4417h, FieldSet fieldSet, AbstractC4448y abstractC4448y, Object obj) {
        int tag = interfaceC4435u.getTag();
        if (tag != WireFormat.f34992a) {
            if (WireFormat.getTagWireType(tag) == 2) {
                Object mo55147b = abstractC4417h.mo55147b(extensionRegistryLite, this.f35057a, WireFormat.getTagFieldNumber(tag));
                if (mo55147b != null) {
                    abstractC4417h.mo55141h(interfaceC4435u, mo55147b, extensionRegistryLite, fieldSet);
                    return true;
                }
                return abstractC4448y.m54876m(obj, interfaceC4435u);
            }
            return interfaceC4435u.mo54983p();
        }
        Object obj2 = null;
        ByteString byteString = null;
        int i = 0;
        while (interfaceC4435u.mo54986m() != Integer.MAX_VALUE) {
            int tag2 = interfaceC4435u.getTag();
            if (tag2 == WireFormat.f34994c) {
                i = interfaceC4435u.mo54996c();
                obj2 = abstractC4417h.mo55147b(extensionRegistryLite, this.f35057a, i);
            } else if (tag2 == WireFormat.f34995d) {
                if (obj2 != null) {
                    abstractC4417h.mo55141h(interfaceC4435u, obj2, extensionRegistryLite, fieldSet);
                } else {
                    byteString = interfaceC4435u.mo54992g();
                }
            } else if (!interfaceC4435u.mo54983p()) {
                break;
            }
        }
        if (interfaceC4435u.getTag() == WireFormat.f34993b) {
            if (byteString != null) {
                if (obj2 != null) {
                    abstractC4417h.mo55140i(byteString, obj2, extensionRegistryLite, fieldSet);
                } else {
                    abstractC4448y.mo54862d(obj, i, byteString);
                }
            }
            return true;
        }
        throw InvalidProtocolBufferException.invalidEndTag();
    }

    /* renamed from: n */
    public final void m55016n(AbstractC4448y abstractC4448y, Object obj, Writer writer) {
        abstractC4448y.mo54849s(abstractC4448y.mo54859g(obj), writer);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC4436v
    public Object newInstance() {
        return this.f35057a.newBuilderForType().buildPartial();
    }
}