package androidx.datastore.preferences.protobuf;

/* renamed from: androidx.datastore.preferences.protobuf.z */
/* loaded from: classes2.dex */
public class C4467z extends AbstractC4466y {
    @Override // androidx.datastore.preferences.protobuf.AbstractC4466y
    /* renamed from: A */
    public UnknownFieldSetLite mo54909g(Object obj) {
        return ((GeneratedMessageLite) obj).unknownFields;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC4466y
    /* renamed from: B */
    public int mo54908h(UnknownFieldSetLite unknownFieldSetLite) {
        return unknownFieldSetLite.getSerializedSize();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC4466y
    /* renamed from: C */
    public int mo54907i(UnknownFieldSetLite unknownFieldSetLite) {
        return unknownFieldSetLite.getSerializedSizeAsMessageSet();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC4466y
    /* renamed from: D */
    public UnknownFieldSetLite mo54905k(UnknownFieldSetLite unknownFieldSetLite, UnknownFieldSetLite unknownFieldSetLite2) {
        if (!unknownFieldSetLite2.equals(UnknownFieldSetLite.getDefaultInstance())) {
            return UnknownFieldSetLite.m55454k(unknownFieldSetLite, unknownFieldSetLite2);
        }
        return unknownFieldSetLite;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC4466y
    /* renamed from: E */
    public UnknownFieldSetLite mo54904n() {
        return UnknownFieldSetLite.m55453l();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC4466y
    /* renamed from: F */
    public void mo54903o(Object obj, UnknownFieldSetLite unknownFieldSetLite) {
        mo54902p(obj, unknownFieldSetLite);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC4466y
    /* renamed from: G */
    public void mo54902p(Object obj, UnknownFieldSetLite unknownFieldSetLite) {
        ((GeneratedMessageLite) obj).unknownFields = unknownFieldSetLite;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC4466y
    /* renamed from: H */
    public UnknownFieldSetLite mo54900r(UnknownFieldSetLite unknownFieldSetLite) {
        unknownFieldSetLite.makeImmutable();
        return unknownFieldSetLite;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC4466y
    /* renamed from: I */
    public void mo54899s(UnknownFieldSetLite unknownFieldSetLite, Writer writer) {
        unknownFieldSetLite.m55450o(writer);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC4466y
    /* renamed from: J */
    public void mo54898t(UnknownFieldSetLite unknownFieldSetLite, Writer writer) {
        unknownFieldSetLite.writeTo(writer);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC4466y
    /* renamed from: j */
    public void mo54906j(Object obj) {
        mo54909g(obj).makeImmutable();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC4466y
    /* renamed from: q */
    public boolean mo54901q(InterfaceC4453u interfaceC4453u) {
        return false;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC4466y
    /* renamed from: u */
    public void mo54915a(UnknownFieldSetLite unknownFieldSetLite, int i, int i2) {
        unknownFieldSetLite.m55451n(WireFormat.m55338a(i, 5), Integer.valueOf(i2));
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC4466y
    /* renamed from: v */
    public void mo54914b(UnknownFieldSetLite unknownFieldSetLite, int i, long j) {
        unknownFieldSetLite.m55451n(WireFormat.m55338a(i, 1), Long.valueOf(j));
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC4466y
    /* renamed from: w */
    public void mo54913c(UnknownFieldSetLite unknownFieldSetLite, int i, UnknownFieldSetLite unknownFieldSetLite2) {
        unknownFieldSetLite.m55451n(WireFormat.m55338a(i, 3), unknownFieldSetLite2);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC4466y
    /* renamed from: x */
    public void mo54912d(UnknownFieldSetLite unknownFieldSetLite, int i, ByteString byteString) {
        unknownFieldSetLite.m55451n(WireFormat.m55338a(i, 2), byteString);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC4466y
    /* renamed from: y */
    public void mo54911e(UnknownFieldSetLite unknownFieldSetLite, int i, long j) {
        unknownFieldSetLite.m55451n(WireFormat.m55338a(i, 0), Long.valueOf(j));
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC4466y
    /* renamed from: z */
    public UnknownFieldSetLite mo54910f(Object obj) {
        UnknownFieldSetLite mo54909g = mo54909g(obj);
        if (mo54909g == UnknownFieldSetLite.getDefaultInstance()) {
            UnknownFieldSetLite m55453l = UnknownFieldSetLite.m55453l();
            mo54902p(obj, m55453l);
            return m55453l;
        }
        return mo54909g;
    }
}
