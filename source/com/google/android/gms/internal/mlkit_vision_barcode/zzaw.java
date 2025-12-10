package com.google.android.gms.internal.mlkit_vision_barcode;

import java.util.Arrays;
import javax.annotation.CheckForNull;

/* loaded from: classes3.dex */
public final class zzaw {

    /* renamed from: a */
    public final String f46574a;

    /* renamed from: b */
    public final C17781Ic2 f46575b;

    /* renamed from: c */
    public C17781Ic2 f46576c;

    public /* synthetic */ zzaw(String str, zzav zzavVar) {
        C17781Ic2 c17781Ic2 = new C17781Ic2(null);
        this.f46575b = c17781Ic2;
        this.f46576c = c17781Ic2;
        str.getClass();
        this.f46574a = str;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(32);
        sb.append(this.f46574a);
        sb.append('{');
        C17781Ic2 c17781Ic2 = this.f46575b.f2559b;
        String str = "";
        while (c17781Ic2 != null) {
            Object obj = c17781Ic2.f2558a;
            sb.append(str);
            if (obj != null && obj.getClass().isArray()) {
                String deepToString = Arrays.deepToString(new Object[]{obj});
                sb.append((CharSequence) deepToString, 1, deepToString.length() - 1);
            } else {
                sb.append(obj);
            }
            c17781Ic2 = c17781Ic2.f2559b;
            str = ", ";
        }
        sb.append('}');
        return sb.toString();
    }

    public final zzaw zza(@CheckForNull Object obj) {
        C17781Ic2 c17781Ic2 = new C17781Ic2(null);
        this.f46576c.f2559b = c17781Ic2;
        this.f46576c = c17781Ic2;
        c17781Ic2.f2558a = obj;
        return this;
    }
}
