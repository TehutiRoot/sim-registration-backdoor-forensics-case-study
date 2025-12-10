package com.google.android.material.color;

import androidx.annotation.AttrRes;
import androidx.annotation.ColorRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.material.R;
import com.google.errorprone.annotations.CanIgnoreReturnValue;

/* loaded from: classes4.dex */
public class HarmonizedColorsOptions {

    /* renamed from: a */
    public final int[] f49609a;

    /* renamed from: b */
    public final HarmonizedColorAttributes f49610b;

    /* renamed from: c */
    public final int f49611c;

    /* loaded from: classes4.dex */
    public static class Builder {

        /* renamed from: b */
        public HarmonizedColorAttributes f49613b;

        /* renamed from: a */
        public int[] f49612a = new int[0];

        /* renamed from: c */
        public int f49614c = R.attr.colorPrimary;

        @NonNull
        public HarmonizedColorsOptions build() {
            return new HarmonizedColorsOptions(this);
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder setColorAttributeToHarmonizeWith(@AttrRes int i) {
            this.f49614c = i;
            return this;
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder setColorAttributes(@Nullable HarmonizedColorAttributes harmonizedColorAttributes) {
            this.f49613b = harmonizedColorAttributes;
            return this;
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder setColorResourceIds(@NonNull @ColorRes int[] iArr) {
            this.f49612a = iArr;
            return this;
        }
    }

    @NonNull
    public static HarmonizedColorsOptions createMaterialDefaults() {
        return new Builder().setColorAttributes(HarmonizedColorAttributes.createMaterialDefaults()).build();
    }

    /* renamed from: a */
    public int m45326a(int i) {
        HarmonizedColorAttributes harmonizedColorAttributes = this.f49610b;
        if (harmonizedColorAttributes != null && harmonizedColorAttributes.getThemeOverlay() != 0) {
            return this.f49610b.getThemeOverlay();
        }
        return i;
    }

    @AttrRes
    public int getColorAttributeToHarmonizeWith() {
        return this.f49611c;
    }

    @Nullable
    public HarmonizedColorAttributes getColorAttributes() {
        return this.f49610b;
    }

    @NonNull
    @ColorRes
    public int[] getColorResourceIds() {
        return this.f49609a;
    }

    public HarmonizedColorsOptions(Builder builder) {
        this.f49609a = builder.f49612a;
        this.f49610b = builder.f49613b;
        this.f49611c = builder.f49614c;
    }
}