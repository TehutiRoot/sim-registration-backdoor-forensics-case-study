package p000;

import androidx.datastore.preferences.protobuf.MessageLite;
import androidx.datastore.preferences.protobuf.ProtoSyntax;

/* renamed from: Rs1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C18439Rs1 implements InterfaceC22067rs0 {

    /* renamed from: a */
    public final MessageLite f5659a;

    /* renamed from: b */
    public final String f5660b;

    /* renamed from: c */
    public final Object[] f5661c;

    /* renamed from: d */
    public final int f5662d;

    public C18439Rs1(MessageLite messageLite, String str, Object[] objArr) {
        this.f5659a = messageLite;
        this.f5660b = str;
        this.f5661c = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.f5662d = charAt;
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
                this.f5662d = i | (charAt2 << i2);
                return;
            }
        }
    }

    @Override // p000.InterfaceC22067rs0
    /* renamed from: a */
    public boolean mo23435a() {
        if ((this.f5662d & 2) == 2) {
            return true;
        }
        return false;
    }

    @Override // p000.InterfaceC22067rs0
    /* renamed from: b */
    public MessageLite mo23434b() {
        return this.f5659a;
    }

    /* renamed from: c */
    public Object[] m66583c() {
        return this.f5661c;
    }

    /* renamed from: d */
    public String m66582d() {
        return this.f5660b;
    }

    @Override // p000.InterfaceC22067rs0
    public ProtoSyntax getSyntax() {
        if ((this.f5662d & 1) == 1) {
            return ProtoSyntax.PROTO2;
        }
        return ProtoSyntax.PROTO3;
    }
}