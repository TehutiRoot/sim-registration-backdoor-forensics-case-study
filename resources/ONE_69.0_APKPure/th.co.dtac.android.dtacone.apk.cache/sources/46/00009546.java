package com.google.android.gms.internal.mlkit_common;

import java.util.Arrays;
import javax.annotation.CheckForNull;

/* loaded from: classes3.dex */
public final class zzq {

    /* renamed from: a */
    public final String f46477a;

    /* renamed from: b */
    public final C20420iJ2 f46478b;

    /* renamed from: c */
    public C20420iJ2 f46479c;

    public /* synthetic */ zzq(String str, zzp zzpVar) {
        C20420iJ2 c20420iJ2 = new C20420iJ2();
        this.f46478b = c20420iJ2;
        this.f46479c = c20420iJ2;
        str.getClass();
        this.f46477a = str;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(32);
        sb.append(this.f46477a);
        sb.append('{');
        C20420iJ2 c20420iJ2 = this.f46478b.f62816c;
        String str = "";
        while (c20420iJ2 != null) {
            Object obj = c20420iJ2.f62815b;
            sb.append(str);
            String str2 = c20420iJ2.f62814a;
            if (str2 != null) {
                sb.append(str2);
                sb.append('=');
            }
            if (obj != null && obj.getClass().isArray()) {
                String deepToString = Arrays.deepToString(new Object[]{obj});
                sb.append((CharSequence) deepToString, 1, deepToString.length() - 1);
            } else {
                sb.append(obj);
            }
            c20420iJ2 = c20420iJ2.f62816c;
            str = ", ";
        }
        sb.append('}');
        return sb.toString();
    }

    public final zzq zza(String str, @CheckForNull Object obj) {
        C20420iJ2 c20420iJ2 = new C20420iJ2();
        this.f46479c.f62816c = c20420iJ2;
        this.f46479c = c20420iJ2;
        c20420iJ2.f62815b = obj;
        c20420iJ2.f62814a = str;
        return this;
    }

    public final zzq zzb(String str, boolean z) {
        String valueOf = String.valueOf(z);
        KI2 ki2 = new KI2(null);
        this.f46479c.f62816c = ki2;
        this.f46479c = ki2;
        ki2.f62815b = valueOf;
        ki2.f62814a = "isManifestFile";
        return this;
    }
}