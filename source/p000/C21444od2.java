package p000;

import com.google.android.odml.image.ImageProperties;

/* renamed from: od2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C21444od2 extends AbstractC19600dt2 {

    /* renamed from: a */
    public Integer f72745a;

    /* renamed from: b */
    public Integer f72746b;

    @Override // p000.AbstractC19600dt2
    /* renamed from: a */
    public final AbstractC19600dt2 mo25896a(int i) {
        this.f72745a = Integer.valueOf(i);
        return this;
    }

    @Override // p000.AbstractC19600dt2
    /* renamed from: b */
    public final AbstractC19600dt2 mo25895b(int i) {
        this.f72746b = Integer.valueOf(i);
        return this;
    }

    @Override // p000.AbstractC19600dt2
    /* renamed from: c */
    public final ImageProperties mo25894c() {
        Integer num = this.f72745a;
        if (num != null && this.f72746b != null) {
            return new C22826wf2(num.intValue(), this.f72746b.intValue(), null);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f72745a == null) {
            sb.append(" imageFormat");
        }
        if (this.f72746b == null) {
            sb.append(" storageType");
        }
        String valueOf = String.valueOf(sb);
        StringBuilder sb2 = new StringBuilder(valueOf.length() + 28);
        sb2.append("Missing required properties:");
        sb2.append(valueOf);
        throw new IllegalStateException(sb2.toString());
    }
}
