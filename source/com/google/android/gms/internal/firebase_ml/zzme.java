package com.google.android.gms.internal.firebase_ml;

import java.util.Arrays;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* loaded from: classes3.dex */
public final class zzme {

    /* renamed from: a */
    public final String f45945a;

    /* renamed from: b */
    public final C22421uG2 f45946b;

    /* renamed from: c */
    public C22421uG2 f45947c;

    /* renamed from: d */
    public boolean f45948d;

    public zzme(String str) {
        C22421uG2 c22421uG2 = new C22421uG2();
        this.f45946b = c22421uG2;
        this.f45947c = c22421uG2;
        this.f45948d = false;
        this.f45945a = (String) zzml.checkNotNull(str);
    }

    /* renamed from: a */
    public final zzme m47881a(String str, Object obj) {
        C22421uG2 c22421uG2 = new C22421uG2();
        this.f45947c.f107326c = c22421uG2;
        this.f45947c = c22421uG2;
        c22421uG2.f107325b = obj;
        c22421uG2.f107324a = (String) zzml.checkNotNull(str);
        return this;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(32);
        sb.append(this.f45945a);
        sb.append('{');
        C22421uG2 c22421uG2 = this.f45946b.f107326c;
        String str = "";
        while (c22421uG2 != null) {
            Object obj = c22421uG2.f107325b;
            sb.append(str);
            String str2 = c22421uG2.f107324a;
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
            c22421uG2 = c22421uG2.f107326c;
            str = ", ";
        }
        sb.append('}');
        return sb.toString();
    }

    public final zzme zza(String str, boolean z) {
        return m47881a(str, String.valueOf(z));
    }

    public final zzme zzb(String str, int i) {
        return m47881a(str, String.valueOf(i));
    }

    public final zzme zzh(String str, @NullableDecl Object obj) {
        return m47881a(str, obj);
    }

    public final zzme zza(String str, float f) {
        return m47881a(str, String.valueOf(f));
    }
}
