package androidx.core.content;

import android.content.LocusId;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.core.util.Preconditions;

/* loaded from: classes2.dex */
public final class LocusIdCompat {

    /* renamed from: a */
    public final String f33864a;

    /* renamed from: b */
    public final LocusId f33865b;

    /* renamed from: androidx.core.content.LocusIdCompat$a */
    /* loaded from: classes2.dex */
    public static class C3947a {
        /* renamed from: a */
        public static LocusId m57411a(String str) {
            return new LocusId(str);
        }

        /* renamed from: b */
        public static String m57410b(LocusId locusId) {
            return locusId.getId();
        }
    }

    public LocusIdCompat(@NonNull String str) {
        this.f33864a = (String) Preconditions.checkStringNotEmpty(str, "id cannot be empty");
        if (Build.VERSION.SDK_INT >= 29) {
            this.f33865b = C3947a.m57411a(str);
        } else {
            this.f33865b = null;
        }
    }

    @NonNull
    @RequiresApi(29)
    public static LocusIdCompat toLocusIdCompat(@NonNull LocusId locusId) {
        Preconditions.checkNotNull(locusId, "locusId cannot be null");
        return new LocusIdCompat((String) Preconditions.checkStringNotEmpty(C3947a.m57410b(locusId), "id cannot be empty"));
    }

    /* renamed from: a */
    public final String m57412a() {
        int length = this.f33864a.length();
        return length + "_chars";
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || LocusIdCompat.class != obj.getClass()) {
            return false;
        }
        LocusIdCompat locusIdCompat = (LocusIdCompat) obj;
        String str = this.f33864a;
        if (str == null) {
            if (locusIdCompat.f33864a == null) {
                return true;
            }
            return false;
        }
        return str.equals(locusIdCompat.f33864a);
    }

    @NonNull
    public String getId() {
        return this.f33864a;
    }

    public int hashCode() {
        int hashCode;
        String str = this.f33864a;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return 31 + hashCode;
    }

    @NonNull
    @RequiresApi(29)
    public LocusId toLocusId() {
        return this.f33865b;
    }

    @NonNull
    public String toString() {
        return "LocusIdCompat[" + m57412a() + "]";
    }
}