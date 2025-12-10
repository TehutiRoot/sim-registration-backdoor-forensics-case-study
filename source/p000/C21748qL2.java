package p000;

/* renamed from: qL2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C21748qL2 implements InterfaceC22780wL2 {

    /* renamed from: a */
    public InterfaceC22780wL2[] f76958a;

    public C21748qL2(InterfaceC22780wL2... interfaceC22780wL2Arr) {
        this.f76958a = interfaceC22780wL2Arr;
    }

    @Override // p000.InterfaceC22780wL2
    /* renamed from: a */
    public final boolean mo862a(Class cls) {
        for (InterfaceC22780wL2 interfaceC22780wL2 : this.f76958a) {
            if (interfaceC22780wL2.mo862a(cls)) {
                return true;
            }
        }
        return false;
    }

    @Override // p000.InterfaceC22780wL2
    /* renamed from: b */
    public final InterfaceC22436uL2 mo861b(Class cls) {
        InterfaceC22780wL2[] interfaceC22780wL2Arr;
        String str;
        for (InterfaceC22780wL2 interfaceC22780wL2 : this.f76958a) {
            if (interfaceC22780wL2.mo862a(cls)) {
                return interfaceC22780wL2.mo861b(cls);
            }
        }
        String name = cls.getName();
        if (name.length() != 0) {
            str = "No factory is available for message type: ".concat(name);
        } else {
            str = new String("No factory is available for message type: ");
        }
        throw new UnsupportedOperationException(str);
    }
}
