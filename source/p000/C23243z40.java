package p000;

import kotlin.jvm.internal.Intrinsics;
import th.p047co.dtac.android.dtacone.model.upPass.UpPassFormType;

/* renamed from: z40  reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C23243z40 {

    /* renamed from: a */
    public final String f108969a;

    /* renamed from: b */
    public final UpPassFormType f108970b;

    public C23243z40(String title, UpPassFormType ocrType) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(ocrType, "ocrType");
        this.f108969a = title;
        this.f108970b = ocrType;
    }

    /* renamed from: a */
    public final String m136a() {
        return this.f108969a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C23243z40)) {
            return false;
        }
        C23243z40 c23243z40 = (C23243z40) obj;
        if (Intrinsics.areEqual(this.f108969a, c23243z40.f108969a) && Intrinsics.areEqual(this.f108970b, c23243z40.f108970b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.f108969a.hashCode() * 31) + this.f108970b.hashCode();
    }

    public String toString() {
        String str = this.f108969a;
        UpPassFormType upPassFormType = this.f108970b;
        return "FormChoiceData(title=" + str + ", ocrType=" + upPassFormType + ")";
    }
}
