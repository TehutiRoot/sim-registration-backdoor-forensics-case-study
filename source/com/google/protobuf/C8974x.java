package com.google.protobuf;

/* renamed from: com.google.protobuf.x */
/* loaded from: classes4.dex */
public class C8974x extends AbstractC8973w {
    @Override // com.google.protobuf.AbstractC8973w
    /* renamed from: A */
    public UnknownFieldSetLite mo35008g(Object obj) {
        return ((GeneratedMessageLite) obj).unknownFields;
    }

    @Override // com.google.protobuf.AbstractC8973w
    /* renamed from: B */
    public int mo35007h(UnknownFieldSetLite unknownFieldSetLite) {
        return unknownFieldSetLite.getSerializedSize();
    }

    @Override // com.google.protobuf.AbstractC8973w
    /* renamed from: C */
    public int mo35006i(UnknownFieldSetLite unknownFieldSetLite) {
        return unknownFieldSetLite.getSerializedSizeAsMessageSet();
    }

    @Override // com.google.protobuf.AbstractC8973w
    /* renamed from: D */
    public UnknownFieldSetLite mo35004k(UnknownFieldSetLite unknownFieldSetLite, UnknownFieldSetLite unknownFieldSetLite2) {
        if (UnknownFieldSetLite.getDefaultInstance().equals(unknownFieldSetLite2)) {
            return unknownFieldSetLite;
        }
        if (UnknownFieldSetLite.getDefaultInstance().equals(unknownFieldSetLite)) {
            return UnknownFieldSetLite.m35538j(unknownFieldSetLite, unknownFieldSetLite2);
        }
        return unknownFieldSetLite.m35541g(unknownFieldSetLite2);
    }

    @Override // com.google.protobuf.AbstractC8973w
    /* renamed from: E */
    public UnknownFieldSetLite mo35003n() {
        return UnknownFieldSetLite.m35537k();
    }

    @Override // com.google.protobuf.AbstractC8973w
    /* renamed from: F */
    public void mo35002o(Object obj, UnknownFieldSetLite unknownFieldSetLite) {
        mo35001p(obj, unknownFieldSetLite);
    }

    @Override // com.google.protobuf.AbstractC8973w
    /* renamed from: G */
    public void mo35001p(Object obj, UnknownFieldSetLite unknownFieldSetLite) {
        ((GeneratedMessageLite) obj).unknownFields = unknownFieldSetLite;
    }

    @Override // com.google.protobuf.AbstractC8973w
    /* renamed from: H */
    public UnknownFieldSetLite mo34999r(UnknownFieldSetLite unknownFieldSetLite) {
        unknownFieldSetLite.makeImmutable();
        return unknownFieldSetLite;
    }

    @Override // com.google.protobuf.AbstractC8973w
    /* renamed from: I */
    public void mo34998s(UnknownFieldSetLite unknownFieldSetLite, Writer writer) {
        unknownFieldSetLite.m35532p(writer);
    }

    @Override // com.google.protobuf.AbstractC8973w
    /* renamed from: J */
    public void mo34997t(UnknownFieldSetLite unknownFieldSetLite, Writer writer) {
        unknownFieldSetLite.writeTo(writer);
    }

    @Override // com.google.protobuf.AbstractC8973w
    /* renamed from: j */
    public void mo35005j(Object obj) {
        mo35008g(obj).makeImmutable();
    }

    @Override // com.google.protobuf.AbstractC8973w
    /* renamed from: q */
    public boolean mo35000q(InterfaceC8960s interfaceC8960s) {
        return false;
    }

    @Override // com.google.protobuf.AbstractC8973w
    /* renamed from: u */
    public void mo35014a(UnknownFieldSetLite unknownFieldSetLite, int i, int i2) {
        unknownFieldSetLite.m35534n(WireFormat.m35424a(i, 5), Integer.valueOf(i2));
    }

    @Override // com.google.protobuf.AbstractC8973w
    /* renamed from: v */
    public void mo35013b(UnknownFieldSetLite unknownFieldSetLite, int i, long j) {
        unknownFieldSetLite.m35534n(WireFormat.m35424a(i, 1), Long.valueOf(j));
    }

    @Override // com.google.protobuf.AbstractC8973w
    /* renamed from: w */
    public void mo35012c(UnknownFieldSetLite unknownFieldSetLite, int i, UnknownFieldSetLite unknownFieldSetLite2) {
        unknownFieldSetLite.m35534n(WireFormat.m35424a(i, 3), unknownFieldSetLite2);
    }

    @Override // com.google.protobuf.AbstractC8973w
    /* renamed from: x */
    public void mo35011d(UnknownFieldSetLite unknownFieldSetLite, int i, ByteString byteString) {
        unknownFieldSetLite.m35534n(WireFormat.m35424a(i, 2), byteString);
    }

    @Override // com.google.protobuf.AbstractC8973w
    /* renamed from: y */
    public void mo35010e(UnknownFieldSetLite unknownFieldSetLite, int i, long j) {
        unknownFieldSetLite.m35534n(WireFormat.m35424a(i, 0), Long.valueOf(j));
    }

    @Override // com.google.protobuf.AbstractC8973w
    /* renamed from: z */
    public UnknownFieldSetLite mo35009f(Object obj) {
        UnknownFieldSetLite mo35008g = mo35008g(obj);
        if (mo35008g == UnknownFieldSetLite.getDefaultInstance()) {
            UnknownFieldSetLite m35537k = UnknownFieldSetLite.m35537k();
            mo35001p(obj, m35537k);
            return m35537k;
        }
        return mo35008g;
    }
}
