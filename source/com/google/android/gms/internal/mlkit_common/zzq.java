package com.google.android.gms.internal.mlkit_common;

import java.util.Arrays;
import javax.annotation.CheckForNull;

/* loaded from: classes3.dex */
public final class zzq {

    /* renamed from: a */
    public final String f46465a;

    /* renamed from: b */
    public final C20879lI2 f46466b;

    /* renamed from: c */
    public C20879lI2 f46467c;

    public /* synthetic */ zzq(String str, zzp zzpVar) {
        C20879lI2 c20879lI2 = new C20879lI2();
        this.f46466b = c20879lI2;
        this.f46467c = c20879lI2;
        str.getClass();
        this.f46465a = str;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(32);
        sb.append(this.f46465a);
        sb.append('{');
        C20879lI2 c20879lI2 = this.f46466b.f71586c;
        String str = "";
        while (c20879lI2 != null) {
            Object obj = c20879lI2.f71585b;
            sb.append(str);
            String str2 = c20879lI2.f71584a;
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
            c20879lI2 = c20879lI2.f71586c;
            str = ", ";
        }
        sb.append('}');
        return sb.toString();
    }

    public final zzq zza(String str, @CheckForNull Object obj) {
        C20879lI2 c20879lI2 = new C20879lI2();
        this.f46467c.f71586c = c20879lI2;
        this.f46467c = c20879lI2;
        c20879lI2.f71585b = obj;
        c20879lI2.f71584a = str;
        return this;
    }

    public final zzq zzb(String str, boolean z) {
        String valueOf = String.valueOf(z);
        NH2 nh2 = new NH2(null);
        this.f46467c.f71586c = nh2;
        this.f46467c = nh2;
        nh2.f71585b = valueOf;
        nh2.f71584a = "isManifestFile";
        return this;
    }
}
