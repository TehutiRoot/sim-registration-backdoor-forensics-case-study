package com.google.android.datatransport;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* loaded from: classes3.dex */
public final class Encoding {

    /* renamed from: a */
    public final String f43868a;

    public Encoding(String str) {
        if (str != null) {
            this.f43868a = str;
            return;
        }
        throw new NullPointerException("name is null");
    }

    /* renamed from: of */
    public static Encoding m49169of(@NonNull String str) {
        return new Encoding(str);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Encoding)) {
            return false;
        }
        return this.f43868a.equals(((Encoding) obj).f43868a);
    }

    public String getName() {
        return this.f43868a;
    }

    public int hashCode() {
        return this.f43868a.hashCode() ^ 1000003;
    }

    @NonNull
    public String toString() {
        return "Encoding{name=\"" + this.f43868a + "\"}";
    }
}
