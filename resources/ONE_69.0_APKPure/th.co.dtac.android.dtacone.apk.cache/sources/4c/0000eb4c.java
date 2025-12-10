package p000;

/* renamed from: nM2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C21294nM2 implements InterfaceC22332tM2 {

    /* renamed from: a */
    public InterfaceC22332tM2[] f72332a;

    public C21294nM2(InterfaceC22332tM2... interfaceC22332tM2Arr) {
        this.f72332a = interfaceC22332tM2Arr;
    }

    @Override // p000.InterfaceC22332tM2
    /* renamed from: a */
    public final boolean mo22697a(Class cls) {
        for (InterfaceC22332tM2 interfaceC22332tM2 : this.f72332a) {
            if (interfaceC22332tM2.mo22697a(cls)) {
                return true;
            }
        }
        return false;
    }

    @Override // p000.InterfaceC22332tM2
    /* renamed from: b */
    public final InterfaceC21986rM2 mo22696b(Class cls) {
        InterfaceC22332tM2[] interfaceC22332tM2Arr;
        String str;
        for (InterfaceC22332tM2 interfaceC22332tM2 : this.f72332a) {
            if (interfaceC22332tM2.mo22697a(cls)) {
                return interfaceC22332tM2.mo22696b(cls);
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