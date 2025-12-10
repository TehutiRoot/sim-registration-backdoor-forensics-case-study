package com.google.protobuf;

/* renamed from: com.google.protobuf.w */
/* loaded from: classes4.dex */
public abstract class AbstractC8973w {
    /* renamed from: a */
    public abstract void mo35014a(Object obj, int i, int i2);

    /* renamed from: b */
    public abstract void mo35013b(Object obj, int i, long j);

    /* renamed from: c */
    public abstract void mo35012c(Object obj, int i, Object obj2);

    /* renamed from: d */
    public abstract void mo35011d(Object obj, int i, ByteString byteString);

    /* renamed from: e */
    public abstract void mo35010e(Object obj, int i, long j);

    /* renamed from: f */
    public abstract Object mo35009f(Object obj);

    /* renamed from: g */
    public abstract Object mo35008g(Object obj);

    /* renamed from: h */
    public abstract int mo35007h(Object obj);

    /* renamed from: i */
    public abstract int mo35006i(Object obj);

    /* renamed from: j */
    public abstract void mo35005j(Object obj);

    /* renamed from: k */
    public abstract Object mo35004k(Object obj, Object obj2);

    /* renamed from: l */
    public final void m35026l(Object obj, InterfaceC8960s interfaceC8960s) {
        while (interfaceC8960s.mo35135m() != Integer.MAX_VALUE && m35025m(obj, interfaceC8960s)) {
        }
    }

    /* renamed from: m */
    public final boolean m35025m(Object obj, InterfaceC8960s interfaceC8960s) {
        int tag = interfaceC8960s.getTag();
        int tagFieldNumber = WireFormat.getTagFieldNumber(tag);
        int tagWireType = WireFormat.getTagWireType(tag);
        if (tagWireType != 0) {
            if (tagWireType != 1) {
                if (tagWireType != 2) {
                    if (tagWireType != 3) {
                        if (tagWireType != 4) {
                            if (tagWireType == 5) {
                                mo35014a(obj, tagFieldNumber, interfaceC8960s.mo35158B());
                                return true;
                            }
                            throw InvalidProtocolBufferException.invalidWireType();
                        }
                        return false;
                    }
                    Object mo35003n = mo35003n();
                    int m35424a = WireFormat.m35424a(tagFieldNumber, 4);
                    m35026l(mo35003n, interfaceC8960s);
                    if (m35424a == interfaceC8960s.getTag()) {
                        mo35012c(obj, tagFieldNumber, mo34999r(mo35003n));
                        return true;
                    }
                    throw InvalidProtocolBufferException.invalidEndTag();
                }
                mo35011d(obj, tagFieldNumber, interfaceC8960s.mo35141g());
                return true;
            }
            mo35013b(obj, tagFieldNumber, interfaceC8960s.mo35129s());
            return true;
        }
        mo35010e(obj, tagFieldNumber, interfaceC8960s.readInt64());
        return true;
    }

    /* renamed from: n */
    public abstract Object mo35003n();

    /* renamed from: o */
    public abstract void mo35002o(Object obj, Object obj2);

    /* renamed from: p */
    public abstract void mo35001p(Object obj, Object obj2);

    /* renamed from: q */
    public abstract boolean mo35000q(InterfaceC8960s interfaceC8960s);

    /* renamed from: r */
    public abstract Object mo34999r(Object obj);

    /* renamed from: s */
    public abstract void mo34998s(Object obj, Writer writer);

    /* renamed from: t */
    public abstract void mo34997t(Object obj, Writer writer);
}
