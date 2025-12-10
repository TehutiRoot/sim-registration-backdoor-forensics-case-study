package p000;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: xJ */
/* loaded from: classes9.dex */
public final class C17044xJ {

    /* renamed from: a */
    public final String f108714a;

    /* renamed from: b */
    public final String f108715b;

    public C17044xJ(String title, String documentType) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(documentType, "documentType");
        this.f108714a = title;
        this.f108715b = documentType;
    }

    /* renamed from: a */
    public final String m566a() {
        return this.f108715b;
    }

    /* renamed from: b */
    public final String m565b() {
        return this.f108714a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17044xJ)) {
            return false;
        }
        C17044xJ c17044xJ = (C17044xJ) obj;
        if (Intrinsics.areEqual(this.f108714a, c17044xJ.f108714a) && Intrinsics.areEqual(this.f108715b, c17044xJ.f108715b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.f108714a.hashCode() * 31) + this.f108715b.hashCode();
    }

    public String toString() {
        String str = this.f108714a;
        String str2 = this.f108715b;
        return "DocumentTypeChoiceData(title=" + str + ", documentType=" + str2 + ")";
    }
}