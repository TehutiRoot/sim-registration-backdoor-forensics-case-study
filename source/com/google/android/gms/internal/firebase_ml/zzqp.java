package com.google.android.gms.internal.firebase_ml;

import com.google.android.gms.common.internal.Objects;

/* loaded from: classes3.dex */
public final class zzqp<T> {

    /* renamed from: a */
    public final String f45989a;

    /* renamed from: b */
    public final Object f45990b;

    public zzqp(String str, Object obj) {
        if (str != null) {
            this.f45989a = str;
            if (obj != null) {
                this.f45990b = obj;
                return;
            }
            throw new NullPointerException("Null options");
        }
        throw new NullPointerException("Null firebasePersistentKey");
    }

    public static <T> zzqp<T> zzj(String str, T t) {
        return new zzqp<>(str, t);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzqp) {
            zzqp zzqpVar = (zzqp) obj;
            if (this.f45989a.equals(zzqpVar.f45989a) && this.f45990b.equals(zzqpVar.f45990b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.f45989a, this.f45990b);
    }

    public final String toString() {
        String str = this.f45989a;
        String valueOf = String.valueOf(this.f45990b);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 58 + valueOf.length());
        sb.append("MlModelDriverInstanceKey{firebasePersistentKey=");
        sb.append(str);
        sb.append(", options=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
