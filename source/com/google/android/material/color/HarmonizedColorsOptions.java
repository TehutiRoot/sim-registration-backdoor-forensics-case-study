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
    public final int[] f49597a;

    /* renamed from: b */
    public final HarmonizedColorAttributes f49598b;

    /* renamed from: c */
    public final int f49599c;

    /* loaded from: classes4.dex */
    public static class Builder {

        /* renamed from: b */
        public HarmonizedColorAttributes f49601b;

        /* renamed from: a */
        public int[] f49600a = new int[0];

        /* renamed from: c */
        public int f49602c = R.attr.colorPrimary;

        @NonNull
        public HarmonizedColorsOptions build() {
            return new HarmonizedColorsOptions(this);
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder setColorAttributeToHarmonizeWith(@AttrRes int i) {
            this.f49602c = i;
            return this;
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder setColorAttributes(@Nullable HarmonizedColorAttributes harmonizedColorAttributes) {
            this.f49601b = harmonizedColorAttributes;
            return this;
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder setColorResourceIds(@NonNull @ColorRes int[] iArr) {
            this.f49600a = iArr;
            return this;
        }
    }

    @NonNull
    public static HarmonizedColorsOptions createMaterialDefaults() {
        return new Builder().setColorAttributes(HarmonizedColorAttributes.createMaterialDefaults()).build();
    }

    /* renamed from: a */
    public int m45350a(int i) {
        HarmonizedColorAttributes harmonizedColorAttributes = this.f49598b;
        if (harmonizedColorAttributes != null && harmonizedColorAttributes.getThemeOverlay() != 0) {
            return this.f49598b.getThemeOverlay();
        }
        return i;
    }

    @AttrRes
    public int getColorAttributeToHarmonizeWith() {
        return this.f49599c;
    }

    @Nullable
    public HarmonizedColorAttributes getColorAttributes() {
        return this.f49598b;
    }

    @NonNull
    @ColorRes
    public int[] getColorResourceIds() {
        return this.f49597a;
    }

    public HarmonizedColorsOptions(Builder builder) {
        this.f49597a = builder.f49600a;
        this.f49598b = builder.f49601b;
        this.f49599c = builder.f49602c;
    }
}
