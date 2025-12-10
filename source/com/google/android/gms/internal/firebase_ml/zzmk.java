package com.google.android.gms.internal.firebase_ml;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* loaded from: classes3.dex */
final class zzmk<T> extends zzmf<T> {
    private final T zzald;

    public zzmk(T t) {
        this.zzald = t;
    }

    public final boolean equals(@NullableDecl Object obj) {
        if (obj instanceof zzmk) {
            return this.zzald.equals(((zzmk) obj).zzald);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzmf
    public final T get() {
        return this.zzald;
    }

    public final int hashCode() {
        return this.zzald.hashCode() + 1502476572;
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzmf
    public final boolean isPresent() {
        return true;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.zzald);
        StringBuilder sb = new StringBuilder(valueOf.length() + 13);
        sb.append("Optional.of(");
        sb.append(valueOf);
        sb.append(")");
        return sb.toString();
    }
}
