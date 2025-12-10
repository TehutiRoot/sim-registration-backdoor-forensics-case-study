package androidx.datastore.preferences.protobuf;

/* renamed from: androidx.datastore.preferences.protobuf.z */
/* loaded from: classes2.dex */
public class C4449z extends AbstractC4448y {
    @Override // androidx.datastore.preferences.protobuf.AbstractC4448y
    /* renamed from: A */
    public UnknownFieldSetLite mo54859g(Object obj) {
        return ((GeneratedMessageLite) obj).unknownFields;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC4448y
    /* renamed from: B */
    public int mo54858h(UnknownFieldSetLite unknownFieldSetLite) {
        return unknownFieldSetLite.getSerializedSize();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC4448y
    /* renamed from: C */
    public int mo54857i(UnknownFieldSetLite unknownFieldSetLite) {
        return unknownFieldSetLite.getSerializedSizeAsMessageSet();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC4448y
    /* renamed from: D */
    public UnknownFieldSetLite mo54855k(UnknownFieldSetLite unknownFieldSetLite, UnknownFieldSetLite unknownFieldSetLite2) {
        if (!unknownFieldSetLite2.equals(UnknownFieldSetLite.getDefaultInstance())) {
            return UnknownFieldSetLite.m55404k(unknownFieldSetLite, unknownFieldSetLite2);
        }
        return unknownFieldSetLite;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC4448y
    /* renamed from: E */
    public UnknownFieldSetLite mo54854n() {
        return UnknownFieldSetLite.m55403l();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC4448y
    /* renamed from: F */
    public void mo54853o(Object obj, UnknownFieldSetLite unknownFieldSetLite) {
        mo54852p(obj, unknownFieldSetLite);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC4448y
    /* renamed from: G */
    public void mo54852p(Object obj, UnknownFieldSetLite unknownFieldSetLite) {
        ((GeneratedMessageLite) obj).unknownFields = unknownFieldSetLite;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC4448y
    /* renamed from: H */
    public UnknownFieldSetLite mo54850r(UnknownFieldSetLite unknownFieldSetLite) {
        unknownFieldSetLite.makeImmutable();
        return unknownFieldSetLite;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC4448y
    /* renamed from: I */
    public void mo54849s(UnknownFieldSetLite unknownFieldSetLite, Writer writer) {
        unknownFieldSetLite.m55400o(writer);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC4448y
    /* renamed from: J */
    public void mo54848t(UnknownFieldSetLite unknownFieldSetLite, Writer writer) {
        unknownFieldSetLite.writeTo(writer);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC4448y
    /* renamed from: j */
    public void mo54856j(Object obj) {
        mo54859g(obj).makeImmutable();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC4448y
    /* renamed from: q */
    public boolean mo54851q(InterfaceC4435u interfaceC4435u) {
        return false;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC4448y
    /* renamed from: u */
    public void mo54865a(UnknownFieldSetLite unknownFieldSetLite, int i, int i2) {
        unknownFieldSetLite.m55401n(WireFormat.m55288a(i, 5), Integer.valueOf(i2));
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC4448y
    /* renamed from: v */
    public void mo54864b(UnknownFieldSetLite unknownFieldSetLite, int i, long j) {
        unknownFieldSetLite.m55401n(WireFormat.m55288a(i, 1), Long.valueOf(j));
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC4448y
    /* renamed from: w */
    public void mo54863c(UnknownFieldSetLite unknownFieldSetLite, int i, UnknownFieldSetLite unknownFieldSetLite2) {
        unknownFieldSetLite.m55401n(WireFormat.m55288a(i, 3), unknownFieldSetLite2);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC4448y
    /* renamed from: x */
    public void mo54862d(UnknownFieldSetLite unknownFieldSetLite, int i, ByteString byteString) {
        unknownFieldSetLite.m55401n(WireFormat.m55288a(i, 2), byteString);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC4448y
    /* renamed from: y */
    public void mo54861e(UnknownFieldSetLite unknownFieldSetLite, int i, long j) {
        unknownFieldSetLite.m55401n(WireFormat.m55288a(i, 0), Long.valueOf(j));
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC4448y
    /* renamed from: z */
    public UnknownFieldSetLite mo54860f(Object obj) {
        UnknownFieldSetLite mo54859g = mo54859g(obj);
        if (mo54859g == UnknownFieldSetLite.getDefaultInstance()) {
            UnknownFieldSetLite m55403l = UnknownFieldSetLite.m55403l();
            mo54852p(obj, m55403l);
            return m55403l;
        }
        return mo54859g;
    }
}