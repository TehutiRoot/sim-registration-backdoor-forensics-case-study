package p000;

import com.google.protobuf.MessageLite;
import com.google.protobuf.ProtoSyntax;

/* renamed from: Qs1  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C18374Qs1 implements InterfaceC21894qs0 {

    /* renamed from: a */
    public final MessageLite f5338a;

    /* renamed from: b */
    public final String f5339b;

    /* renamed from: c */
    public final Object[] f5340c;

    /* renamed from: d */
    public final int f5341d;

    public C18374Qs1(MessageLite messageLite, String str, Object[] objArr) {
        this.f5338a = messageLite;
        this.f5339b = str;
        this.f5340c = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.f5341d = charAt;
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
                this.f5341d = i | (charAt2 << i2);
                return;
            }
        }
    }

    @Override // p000.InterfaceC21894qs0
    /* renamed from: a */
    public boolean mo23570a() {
        if ((this.f5341d & 2) == 2) {
            return true;
        }
        return false;
    }

    @Override // p000.InterfaceC21894qs0
    /* renamed from: b */
    public MessageLite mo23569b() {
        return this.f5338a;
    }

    /* renamed from: c */
    public Object[] m66724c() {
        return this.f5340c;
    }

    /* renamed from: d */
    public String m66723d() {
        return this.f5339b;
    }

    @Override // p000.InterfaceC21894qs0
    public ProtoSyntax getSyntax() {
        if ((this.f5341d & 1) == 1) {
            return ProtoSyntax.PROTO2;
        }
        return ProtoSyntax.PROTO3;
    }
}