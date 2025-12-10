package androidx.datastore.preferences.protobuf;

/* renamed from: androidx.datastore.preferences.protobuf.y */
/* loaded from: classes2.dex */
public abstract class AbstractC4466y {
    /* renamed from: a */
    public abstract void mo54915a(Object obj, int i, int i2);

    /* renamed from: b */
    public abstract void mo54914b(Object obj, int i, long j);

    /* renamed from: c */
    public abstract void mo54913c(Object obj, int i, Object obj2);

    /* renamed from: d */
    public abstract void mo54912d(Object obj, int i, ByteString byteString);

    /* renamed from: e */
    public abstract void mo54911e(Object obj, int i, long j);

    /* renamed from: f */
    public abstract Object mo54910f(Object obj);

    /* renamed from: g */
    public abstract Object mo54909g(Object obj);

    /* renamed from: h */
    public abstract int mo54908h(Object obj);

    /* renamed from: i */
    public abstract int mo54907i(Object obj);

    /* renamed from: j */
    public abstract void mo54906j(Object obj);

    /* renamed from: k */
    public abstract Object mo54905k(Object obj, Object obj2);

    /* renamed from: l */
    public final void m54927l(Object obj, InterfaceC4453u interfaceC4453u) {
        while (interfaceC4453u.mo55036m() != Integer.MAX_VALUE && m54926m(obj, interfaceC4453u)) {
        }
    }

    /* renamed from: m */
    public final boolean m54926m(Object obj, InterfaceC4453u interfaceC4453u) {
        int tag = interfaceC4453u.getTag();
        int tagFieldNumber = WireFormat.getTagFieldNumber(tag);
        int tagWireType = WireFormat.getTagWireType(tag);
        if (tagWireType != 0) {
            if (tagWireType != 1) {
                if (tagWireType != 2) {
                    if (tagWireType != 3) {
                        if (tagWireType != 4) {
                            if (tagWireType == 5) {
                                mo54915a(obj, tagFieldNumber, interfaceC4453u.mo55059B());
                                return true;
                            }
                            throw InvalidProtocolBufferException.invalidWireType();
                        }
                        return false;
                    }
                    Object mo54904n = mo54904n();
                    int m55338a = WireFormat.m55338a(tagFieldNumber, 4);
                    m54927l(mo54904n, interfaceC4453u);
                    if (m55338a == interfaceC4453u.getTag()) {
                        mo54913c(obj, tagFieldNumber, mo54900r(mo54904n));
                        return true;
                    }
                    throw InvalidProtocolBufferException.invalidEndTag();
                }
                mo54912d(obj, tagFieldNumber, interfaceC4453u.mo55042g());
                return true;
            }
            mo54914b(obj, tagFieldNumber, interfaceC4453u.mo55030s());
            return true;
        }
        mo54911e(obj, tagFieldNumber, interfaceC4453u.readInt64());
        return true;
    }

    /* renamed from: n */
    public abstract Object mo54904n();

    /* renamed from: o */
    public abstract void mo54903o(Object obj, Object obj2);

    /* renamed from: p */
    public abstract void mo54902p(Object obj, Object obj2);

    /* renamed from: q */
    public abstract boolean mo54901q(InterfaceC4453u interfaceC4453u);

    /* renamed from: r */
    public abstract Object mo54900r(Object obj);

    /* renamed from: s */
    public abstract void mo54899s(Object obj, Writer writer);

    /* renamed from: t */
    public abstract void mo54898t(Object obj, Writer writer);
}
