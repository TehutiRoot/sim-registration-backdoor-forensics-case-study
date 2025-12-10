package com.google.android.gms.internal.mlkit_vision_barcode;

import java.util.Arrays;
import javax.annotation.CheckForNull;

/* loaded from: classes3.dex */
public final class zzaw {

    /* renamed from: a */
    public final String f46586a;

    /* renamed from: b */
    public final C17620Fd2 f46587b;

    /* renamed from: c */
    public C17620Fd2 f46588c;

    public /* synthetic */ zzaw(String str, zzav zzavVar) {
        C17620Fd2 c17620Fd2 = new C17620Fd2(null);
        this.f46587b = c17620Fd2;
        this.f46588c = c17620Fd2;
        str.getClass();
        this.f46586a = str;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(32);
        sb.append(this.f46586a);
        sb.append('{');
        C17620Fd2 c17620Fd2 = this.f46587b.f1735b;
        String str = "";
        while (c17620Fd2 != null) {
            Object obj = c17620Fd2.f1734a;
            sb.append(str);
            if (obj != null && obj.getClass().isArray()) {
                String deepToString = Arrays.deepToString(new Object[]{obj});
                sb.append((CharSequence) deepToString, 1, deepToString.length() - 1);
            } else {
                sb.append(obj);
            }
            c17620Fd2 = c17620Fd2.f1735b;
            str = ", ";
        }
        sb.append('}');
        return sb.toString();
    }

    public final zzaw zza(@CheckForNull Object obj) {
        C17620Fd2 c17620Fd2 = new C17620Fd2(null);
        this.f46588c.f1735b = c17620Fd2;
        this.f46588c = c17620Fd2;
        c17620Fd2.f1734a = obj;
        return this;
    }
}