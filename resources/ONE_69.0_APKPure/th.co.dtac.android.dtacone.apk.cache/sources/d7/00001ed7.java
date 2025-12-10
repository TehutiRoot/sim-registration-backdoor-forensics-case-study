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
    public int f11028a;

    /* renamed from: b */
    public Rational f11029b;

    /* renamed from: c */
    public int f11030c;

    /* renamed from: d */
    public int f11031d;

    /* loaded from: classes.dex */
    public static final class Builder {

        /* renamed from: b */
        public final Rational f11033b;

        /* renamed from: c */
        public final int f11034c;

        /* renamed from: a */
        public int f11032a = 1;

        /* renamed from: d */
        public int f11035d = 0;

        public Builder(@NonNull Rational rational, int i) {
            this.f11033b = rational;
            this.f11034c = i;
        }

        @NonNull
        public ViewPort build() {
            Preconditions.checkNotNull(this.f11033b, "The crop aspect ratio must be set.");
            return new ViewPort(this.f11032a, this.f11033b, this.f11034c, this.f11035d);
        }

        @NonNull
        public Builder setLayoutDirection(int i) {
            this.f11035d = i;
            return this;
        }

        @NonNull
        public Builder setScaleType(int i) {
            this.f11032a = i;
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
        this.f11028a = i;
        this.f11029b = rational;
        this.f11030c = i2;
        this.f11031d = i3;
    }

    @NonNull
    public Rational getAspectRatio() {
        return this.f11029b;
    }

    public int getLayoutDirection() {
        return this.f11031d;
    }

    public int getRotation() {
        return this.f11030c;
    }

    public int getScaleType() {
        return this.f11028a;
    }
}