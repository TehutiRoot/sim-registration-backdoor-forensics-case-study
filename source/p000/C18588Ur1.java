package p000;

import androidx.datastore.preferences.protobuf.MessageLite;
import androidx.datastore.preferences.protobuf.ProtoSyntax;

/* renamed from: Ur1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C18588Ur1 implements InterfaceC20971ls0 {

    /* renamed from: a */
    public final MessageLite f6465a;

    /* renamed from: b */
    public final String f6466b;

    /* renamed from: c */
    public final Object[] f6467c;

    /* renamed from: d */
    public final int f6468d;

    public C18588Ur1(MessageLite messageLite, String str, Object[] objArr) {
        this.f6465a = messageLite;
        this.f6466b = str;
        this.f6467c = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.f6468d = charAt;
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
                this.f6468d = i | (charAt2 << i2);
                return;
            }
        }
    }

    @Override // p000.InterfaceC20971ls0
    /* renamed from: a */
    public boolean mo26414a() {
        if ((this.f6468d & 2) == 2) {
            return true;
        }
        return false;
    }

    @Override // p000.InterfaceC20971ls0
    /* renamed from: b */
    public MessageLite mo26413b() {
        return this.f6465a;
    }

    /* renamed from: c */
    public Object[] m65970c() {
        return this.f6467c;
    }

    /* renamed from: d */
    public String m65969d() {
        return this.f6466b;
    }

    @Override // p000.InterfaceC20971ls0
    public ProtoSyntax getSyntax() {
        if ((this.f6468d & 1) == 1) {
            return ProtoSyntax.PROTO2;
        }
        return ProtoSyntax.PROTO3;
    }
}
