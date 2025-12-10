package androidx.camera.core;

import android.util.Rational;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.core.util.Preconditions;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@RequiresApi(21)
/* loaded from: classes.dex */
public final class ViewPort {
    public static final int FILL_CENTER = 1;
    public static final int FILL_END = 2;
    public static final int FILL_START = 0;
    public static final int FIT = 3;

    /* renamed from: a */
    public int f10940a;

    /* renamed from: b */
    public Rational f10941b;

    /* renamed from: c */
    public int f10942c;

    /* renamed from: d */
    public int f10943d;

    /* loaded from: classes.dex */
    public static final class Builder {

        /* renamed from: b */
        public final Rational f10945b;

        /* renamed from: c */
        public final int f10946c;

        /* renamed from: a */
        public int f10944a = 1;

        /* renamed from: d */
        public int f10947d = 0;

        public Builder(@NonNull Rational rational, int i) {
            this.f10945b = rational;
            this.f10946c = i;
        }

        @NonNull
        public ViewPort build() {
            Preconditions.checkNotNull(this.f10945b, "The crop aspect ratio must be set.");
            return new ViewPort(this.f10944a, this.f10945b, this.f10946c, this.f10947d);
        }

        @NonNull
        public Builder setLayoutDirection(int i) {
            this.f10947d = i;
            return this;
        }

        @NonNull
        public Builder setScaleType(int i) {
            this.f10944a = i;
            return this;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* loaded from: classes.dex */
    public @interface LayoutDirection {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* loaded from: classes.dex */
    public @interface ScaleType {
    }

    public ViewPort(int i, Rational rational, int i2, int i3) {
        this.f10940a = i;
        this.f10941b = rational;
        this.f10942c = i2;
        this.f10943d = i3;
    }

    @NonNull
    public Rational getAspectRatio() {
        return this.f10941b;
    }

    public int getLayoutDirection() {
        return this.f10943d;
    }

    public int getRotation() {
        return this.f10942c;
    }

    public int getScaleType() {
        return this.f10940a;
    }
}
