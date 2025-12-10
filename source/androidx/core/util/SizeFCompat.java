package androidx.core.util;

import android.util.SizeF;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

/* loaded from: classes2.dex */
public final class SizeFCompat {

    /* renamed from: a */
    public final float f34107a;

    /* renamed from: b */
    public final float f34108b;

    /* renamed from: androidx.core.util.SizeFCompat$a */
    /* loaded from: classes2.dex */
    public static final class C4093a {
        @NonNull
        @DoNotInline
        /* renamed from: a */
        public static SizeF m57057a(@NonNull SizeFCompat sizeFCompat) {
            Preconditions.checkNotNull(sizeFCompat);
            return new SizeF(sizeFCompat.getWidth(), sizeFCompat.getHeight());
        }

        @NonNull
        @DoNotInline
        /* renamed from: b */
        public static SizeFCompat m57056b(@NonNull SizeF sizeF) {
            Preconditions.checkNotNull(sizeF);
            return new SizeFCompat(sizeF.getWidth(), sizeF.getHeight());
        }
    }

    public SizeFCompat(float f, float f2) {
        this.f34107a = Preconditions.checkArgumentFinite(f, "width");
        this.f34108b = Preconditions.checkArgumentFinite(f2, "height");
    }

    @NonNull
    @RequiresApi(21)
    public static SizeFCompat toSizeFCompat(@NonNull SizeF sizeF) {
        return C4093a.m57056b(sizeF);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SizeFCompat)) {
            return false;
        }
        SizeFCompat sizeFCompat = (SizeFCompat) obj;
        if (sizeFCompat.f34107a == this.f34107a && sizeFCompat.f34108b == this.f34108b) {
            return true;
        }
        return false;
    }

    public float getHeight() {
        return this.f34108b;
    }

    public float getWidth() {
        return this.f34107a;
    }

    public int hashCode() {
        return Float.floatToIntBits(this.f34107a) ^ Float.floatToIntBits(this.f34108b);
    }

    @NonNull
    @RequiresApi(21)
    public SizeF toSizeF() {
        return C4093a.m57057a(this);
    }

    @NonNull
    public String toString() {
        return this.f34107a + "x" + this.f34108b;
    }
}
