package com.google.protobuf;

/* renamed from: com.google.protobuf.x */
/* loaded from: classes4.dex */
public class C8963x extends AbstractC8962w {
    @Override // com.google.protobuf.AbstractC8962w
    /* renamed from: A */
    public UnknownFieldSetLite mo35000g(Object obj) {
        return ((GeneratedMessageLite) obj).unknownFields;
    }

    @Override // com.google.protobuf.AbstractC8962w
    /* renamed from: B */
    public int mo34999h(UnknownFieldSetLite unknownFieldSetLite) {
        return unknownFieldSetLite.getSerializedSize();
    }

    @Override // com.google.protobuf.AbstractC8962w
    /* renamed from: C */
    public int mo34998i(UnknownFieldSetLite unknownFieldSetLite) {
        return unknownFieldSetLite.getSerializedSizeAsMessageSet();
    }

    @Override // com.google.protobuf.AbstractC8962w
    /* renamed from: D */
    public UnknownFieldSetLite mo34996k(UnknownFieldSetLite unknownFieldSetLite, UnknownFieldSetLite unknownFieldSetLite2) {
        if (UnknownFieldSetLite.getDefaultInstance().equals(unknownFieldSetLite2)) {
            return unknownFieldSetLite;
        }
        if (UnknownFieldSetLite.getDefaultInstance().equals(unknownFieldSetLite)) {
            return UnknownFieldSetLite.m35530j(unknownFieldSetLite, unknownFieldSetLite2);
        }
        return unknownFieldSetLite.m35533g(unknownFieldSetLite2);
    }

    @Override // com.google.protobuf.AbstractC8962w
    /* renamed from: E */
    public UnknownFieldSetLite mo34995n() {
        return UnknownFieldSetLite.m35529k();
    }

    @Override // com.google.protobuf.AbstractC8962w
    /* renamed from: F */
    public void mo34994o(Object obj, UnknownFieldSetLite unknownFieldSetLite) {
        mo34993p(obj, unknownFieldSetLite);
    }

    @Override // com.google.protobuf.AbstractC8962w
    /* renamed from: G */
    public void mo34993p(Object obj, UnknownFieldSetLite unknownFieldSetLite) {
        ((GeneratedMessageLite) obj).unknownFields = unknownFieldSetLite;
    }

    @Override // com.google.protobuf.AbstractC8962w
    /* renamed from: H */
    public UnknownFieldSetLite mo34991r(UnknownFieldSetLite unknownFieldSetLite) {
        unknownFieldSetLite.makeImmutable();
        return unknownFieldSetLite;
    }

    @Override // com.google.protobuf.AbstractC8962w
    /* renamed from: I */
    public void mo34990s(UnknownFieldSetLite unknownFieldSetLite, Writer writer) {
        unknownFieldSetLite.m35524p(writer);
    }

    @Override // com.google.protobuf.AbstractC8962w
    /* renamed from: J */
    public void mo34989t(UnknownFieldSetLite unknownFieldSetLite, Writer writer) {
        unknownFieldSetLite.writeTo(writer);
    }

    @Override // com.google.protobuf.AbstractC8962w
    /* renamed from: j */
    public void mo34997j(Object obj) {
        mo35000g(obj).makeImmutable();
    }

    @Override // com.google.protobuf.AbstractC8962w
    /* renamed from: q */
    public boolean mo34992q(InterfaceC8949s interfaceC8949s) {
        return false;
    }

    @Override // com.google.protobuf.AbstractC8962w
    /* renamed from: u */
    public void mo35006a(UnknownFieldSetLite unknownFieldSetLite, int i, int i2) {
        unknownFieldSetLite.m35526n(WireFormat.m35416a(i, 5), Integer.valueOf(i2));
    }

    @Override // com.google.protobuf.AbstractC8962w
    /* renamed from: v */
    public void mo35005b(UnknownFieldSetLite unknownFieldSetLite, int i, long j) {
        unknownFieldSetLite.m35526n(WireFormat.m35416a(i, 1), Long.valueOf(j));
    }

    @Override // com.google.protobuf.AbstractC8962w
    /* renamed from: w */
    public void mo35004c(UnknownFieldSetLite unknownFieldSetLite, int i, UnknownFieldSetLite unknownFieldSetLite2) {
        unknownFieldSetLite.m35526n(WireFormat.m35416a(i, 3), unknownFieldSetLite2);
    }

    @Override // com.google.protobuf.AbstractC8962w
    /* renamed from: x */
    public void mo35003d(UnknownFieldSetLite unknownFieldSetLite, int i, ByteString byteString) {
        unknownFieldSetLite.m35526n(WireFormat.m35416a(i, 2), byteString);
    }

    @Override // com.google.protobuf.AbstractC8962w
    /* renamed from: y */
    public void mo35002e(UnknownFieldSetLite unknownFieldSetLite, int i, long j) {
        unknownFieldSetLite.m35526n(WireFormat.m35416a(i, 0), Long.valueOf(j));
    }

    @Override // com.google.protobuf.AbstractC8962w
    /* renamed from: z */
    public UnknownFieldSetLite mo35001f(Object obj) {
        UnknownFieldSetLite mo35000g = mo35000g(obj);
        if (mo35000g == UnknownFieldSetLite.getDefaultInstance()) {
            UnknownFieldSetLite m35529k = UnknownFieldSetLite.m35529k();
            mo34993p(obj, m35529k);
            return m35529k;
        }
        return mo35000g;
    }
}