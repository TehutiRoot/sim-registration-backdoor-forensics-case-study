package com.google.android.gms.internal.mlkit_vision_face;

import java.util.Arrays;
import javax.annotation.CheckForNull;

/* loaded from: classes3.dex */
public final class zzv {

    /* renamed from: a */
    public final String f47272a;

    /* renamed from: b */
    public final UK2 f47273b;

    /* renamed from: c */
    public UK2 f47274c;

    public /* synthetic */ zzv(String str, AbstractC21634pK2 abstractC21634pK2) {
        UK2 uk2 = new UK2(null);
        this.f47273b = uk2;
        this.f47274c = uk2;
        this.f47272a = str;
    }

    /* renamed from: a */
    public final zzv m46717a(String str, Object obj) {
        FK2 fk2 = new FK2(null);
        this.f47274c.f6613c = fk2;
        this.f47274c = fk2;
        fk2.f6612b = obj;
        fk2.f6611a = str;
        return this;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(32);
        sb.append(this.f47272a);
        sb.append('{');
        UK2 uk2 = this.f47273b.f6613c;
        String str = "";
        while (uk2 != null) {
            Object obj = uk2.f6612b;
            sb.append(str);
            String str2 = uk2.f6611a;
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
            uk2 = uk2.f6613c;
            str = ", ";
        }
        sb.append('}');
        return sb.toString();
    }

    public final zzv zza(String str, float f) {
        m46717a(str, String.valueOf(f));
        return this;
    }

    public final zzv zzb(String str, int i) {
        m46717a(str, String.valueOf(i));
        return this;
    }

    public final zzv zzc(String str, @CheckForNull Object obj) {
        UK2 uk2 = new UK2(null);
        this.f47274c.f6613c = uk2;
        this.f47274c = uk2;
        uk2.f6612b = obj;
        uk2.f6611a = str;
        return this;
    }

    public final zzv zzd(String str, boolean z) {
        m46717a("trackingEnabled", String.valueOf(z));
        return this;
    }
}