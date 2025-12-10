package p000;

import kotlin.jvm.internal.Intrinsics;
import th.p047co.dtac.android.dtacone.model.upPass.UpPassFormType;

/* renamed from: D40 */
/* loaded from: classes9.dex */
public final class D40 {

    /* renamed from: a */
    public final String f914a;

    /* renamed from: b */
    public final UpPassFormType f915b;

    public D40(String title, UpPassFormType ocrType) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(ocrType, "ocrType");
        this.f914a = title;
        this.f915b = ocrType;
    }

    /* renamed from: a */
    public final String m68879a() {
        return this.f914a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof D40)) {
            return false;
        }
        D40 d40 = (D40) obj;
        if (Intrinsics.areEqual(this.f914a, d40.f914a) && Intrinsics.areEqual(this.f915b, d40.f915b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.f914a.hashCode() * 31) + this.f915b.hashCode();
    }

    public String toString() {
        String str = this.f914a;
        UpPassFormType upPassFormType = this.f915b;
        return "FormChoiceData(title=" + str + ", ocrType=" + upPassFormType + ")";
    }
}