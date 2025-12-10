package p000;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: wJ */
/* loaded from: classes9.dex */
public final class C16959wJ {

    /* renamed from: a */
    public final String f107974a;

    /* renamed from: b */
    public final String f107975b;

    public C16959wJ(String title, String documentType) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(documentType, "documentType");
        this.f107974a = title;
        this.f107975b = documentType;
    }

    /* renamed from: a */
    public final String m873a() {
        return this.f107975b;
    }

    /* renamed from: b */
    public final String m872b() {
        return this.f107974a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C16959wJ)) {
            return false;
        }
        C16959wJ c16959wJ = (C16959wJ) obj;
        if (Intrinsics.areEqual(this.f107974a, c16959wJ.f107974a) && Intrinsics.areEqual(this.f107975b, c16959wJ.f107975b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.f107974a.hashCode() * 31) + this.f107975b.hashCode();
    }

    public String toString() {
        String str = this.f107974a;
        String str2 = this.f107975b;
        return "DocumentTypeChoiceData(title=" + str + ", documentType=" + str2 + ")";
    }
}
