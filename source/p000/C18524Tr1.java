package p000;

import com.google.protobuf.MessageLite;
import com.google.protobuf.ProtoSyntax;

/* renamed from: Tr1  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C18524Tr1 implements InterfaceC20799ks0 {

    /* renamed from: a */
    public final MessageLite f6130a;

    /* renamed from: b */
    public final String f6131b;

    /* renamed from: c */
    public final Object[] f6132c;

    /* renamed from: d */
    public final int f6133d;

    public C18524Tr1(MessageLite messageLite, String str, Object[] objArr) {
        this.f6130a = messageLite;
        this.f6131b = str;
        this.f6132c = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.f6133d = charAt;
            return;
        }
        int i = charAt & 8191;
        int i2 = 13;
        int i3 = 1;
        while (true) {
            int i4 = i3 + 1;
            char charAt2 = str.charAt(i3);
            if (charAt2 >= 55296) {
                i |= (charAt2 & 8191) << i2;
                i2 += 13;
                i3 = i4;
            } else {
                this.f6133d = i | (charAt2 << i2);
                return;
            }
        }
    }

    @Override // p000.InterfaceC20799ks0
    /* renamed from: a */
    public boolean mo26594a() {
        if ((this.f6133d & 2) == 2) {
            return true;
        }
        return false;
    }

    @Override // p000.InterfaceC20799ks0
    /* renamed from: b */
    public MessageLite mo26593b() {
        return this.f6130a;
    }

    /* renamed from: c */
    public Object[] m66166c() {
        return this.f6132c;
    }

    /* renamed from: d */
    public String m66165d() {
        return this.f6131b;
    }

    @Override // p000.InterfaceC20799ks0
    public ProtoSyntax getSyntax() {
        if ((this.f6133d & 1) == 1) {
            return ProtoSyntax.PROTO2;
        }
        return ProtoSyntax.PROTO3;
    }
}
