package com.google.android.material.color;

import android.app.Activity;
import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleRes;
import com.google.android.material.color.DynamicColors;
import com.google.android.material.color.utilities.QuantizerCelebi;
import com.google.android.material.color.utilities.Score;
import com.google.errorprone.annotations.CanIgnoreReturnValue;

/* loaded from: classes4.dex */
public class DynamicColorsOptions {

    /* renamed from: e */
    public static final DynamicColors.Precondition f49583e = new C6889a();

    /* renamed from: f */
    public static final DynamicColors.OnAppliedCallback f49584f = new C6890b();

    /* renamed from: a */
    public final int f49585a;

    /* renamed from: b */
    public final DynamicColors.Precondition f49586b;

    /* renamed from: c */
    public final DynamicColors.OnAppliedCallback f49587c;

    /* renamed from: d */
    public Integer f49588d;

    /* loaded from: classes4.dex */
    public static class Builder {

        /* renamed from: a */
        public int f49589a;

        /* renamed from: b */
        public DynamicColors.Precondition f49590b = DynamicColorsOptions.f49583e;

        /* renamed from: c */
        public DynamicColors.OnAppliedCallback f49591c = DynamicColorsOptions.f49584f;

        /* renamed from: d */
        public Bitmap f49592d;

        @NonNull
        public DynamicColorsOptions build() {
            return new DynamicColorsOptions(this, null);
        }

        @NonNull
        @CanIgnoreReturnValue
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public Builder setContentBasedSource(@NonNull Bitmap bitmap) {
            this.f49592d = bitmap;
            return this;
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder setOnAppliedCallback(@NonNull DynamicColors.OnAppliedCallback onAppliedCallback) {
            this.f49591c = onAppliedCallback;
            return this;
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder setPrecondition(@NonNull DynamicColors.Precondition precondition) {
            this.f49590b = precondition;
            return this;
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder setThemeOverlay(@StyleRes int i) {
            this.f49589a = i;
            return this;
        }
    }

    /* renamed from: com.google.android.material.color.DynamicColorsOptions$a */
    /* loaded from: classes4.dex */
    public class C6889a implements DynamicColors.Precondition {
        @Override // com.google.android.material.color.DynamicColors.Precondition
        public boolean shouldApplyDynamicColors(Activity activity, int i) {
            return true;
        }
    }

    /* renamed from: com.google.android.material.color.DynamicColorsOptions$b */
    /* loaded from: classes4.dex */
    public class C6890b implements DynamicColors.OnAppliedCallback {
        @Override // com.google.android.material.color.DynamicColors.OnAppliedCallback
        public void onApplied(Activity activity) {
        }
    }

    public /* synthetic */ DynamicColorsOptions(Builder builder, C6889a c6889a) {
        this(builder);
    }

    /* renamed from: c */
    public static int m45357c(Bitmap bitmap) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int[] iArr = new int[width * height];
        bitmap.getPixels(iArr, 0, width, 0, 0, width, height);
        return Score.score(QuantizerCelebi.quantize(iArr, 128)).get(0).intValue();
    }

    @Nullable
    public Integer getContentBasedSeedColor() {
        return this.f49588d;
    }

    @NonNull
    public DynamicColors.OnAppliedCallback getOnAppliedCallback() {
        return this.f49587c;
    }

    @NonNull
    public DynamicColors.Precondition getPrecondition() {
        return this.f49586b;
    }

    @StyleRes
    public int getThemeOverlay() {
        return this.f49585a;
    }

    public DynamicColorsOptions(Builder builder) {
        this.f49585a = builder.f49589a;
        this.f49586b = builder.f49590b;
        this.f49587c = builder.f49591c;
        if (builder.f49592d != null) {
            this.f49588d = Integer.valueOf(m45357c(builder.f49592d));
        }
    }
}
