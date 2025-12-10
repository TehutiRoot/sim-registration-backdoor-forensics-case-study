package androidx.core.util;

import android.util.SizeF;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

/* loaded from: classes2.dex */
public final class SizeFCompat {

    /* renamed from: a */
    public final float f34195a;

    /* renamed from: b */
    public final float f34196b;

    /* renamed from: androidx.core.util.SizeFCompat$a */
    /* loaded from: classes2.dex */
    public static final class C4075a {
        @NonNull
        @DoNotInline
        /* renamed from: a */
        public static SizeF m57007a(@NonNull SizeFCompat sizeFCompat) {
            Preconditions.checkNotNull(sizeFCompat);
            return new SizeF(sizeFCompat.getWidth(), sizeFCompat.getHeight());
        }

        @NonNull
        @DoNotInline
        /* renamed from: b */
        public static SizeFCompat m57006b(@NonNull SizeF sizeF) {
            Preconditions.checkNotNull(sizeF);
            return new SizeFCompat(sizeF.getWidth(), sizeF.getHeight());
        }
    }

    public SizeFCompat(float f, float f2) {
        this.f34195a = Preconditions.checkArgumentFinite(f, "width");
        this.f34196b = Preconditions.checkArgumentFinite(f2, "height");
    }

    @NonNull
    @RequiresApi(21)
    public static SizeFCompat toSizeFCompat(@NonNull SizeF sizeF) {
        return C4075a.m57006b(sizeF);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SizeFCompat)) {
            return false;
        }
        SizeFCompat sizeFCompat = (SizeFCompat) obj;
        if (sizeFCompat.f34195a == this.f34195a && sizeFCompat.f34196b == this.f34196b) {
            return true;
        }
        return false;
    }

    public float getHeight() {
        return this.f34196b;
    }

    public float getWidth() {
        return this.f34195a;
    }

    public int hashCode() {
        return Float.floatToIntBits(this.f34195a) ^ Float.floatToIntBits(this.f34196b);
    }

    @NonNull
    @RequiresApi(21)
    public SizeF toSizeF() {
        return C4075a.m57007a(this);
    }

    @NonNull
    public String toString() {
        return this.f34195a + "x" + this.f34196b;
    }
}