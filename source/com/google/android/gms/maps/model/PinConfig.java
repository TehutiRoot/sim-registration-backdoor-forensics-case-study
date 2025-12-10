package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.Objects;

@SafeParcelable.Class(creator = "PinConfigCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes3.dex */
public class PinConfig extends AbstractSafeParcelable {
    public static final int BITMAP_LENGTH_DP = 37;
    public static final int BITMAP_WIDTH_DP = 26;
    @NonNull
    public static final Parcelable.Creator<PinConfig> CREATOR = new zzr();
    public static final int DEFAULT_PIN_BACKGROUND_COLOR = -1424587;
    public static final int DEFAULT_PIN_BORDER_COLOR = -3857889;
    public static final int DEFAULT_PIN_GLYPH_COLOR = -5041134;

    /* renamed from: a */
    public final int f47977a;

    /* renamed from: b */
    public final int f47978b;

    /* renamed from: c */
    public final Glyph f47979c;

    /* loaded from: classes3.dex */
    public static class Builder {

        /* renamed from: a */
        public int f47980a = PinConfig.DEFAULT_PIN_BACKGROUND_COLOR;

        /* renamed from: b */
        public int f47981b = PinConfig.DEFAULT_PIN_BORDER_COLOR;

        /* renamed from: c */
        public Glyph f47982c = new Glyph((int) PinConfig.DEFAULT_PIN_GLYPH_COLOR);

        @NonNull
        public PinConfig build() {
            return new PinConfig(this.f47980a, this.f47981b, this.f47982c);
        }

        @NonNull
        public Builder setBackgroundColor(@ColorInt int i) {
            this.f47980a = i;
            return this;
        }

        @NonNull
        public Builder setBorderColor(@ColorInt int i) {
            this.f47981b = i;
            return this;
        }

        @NonNull
        public Builder setGlyph(@NonNull Glyph glyph) {
            this.f47982c = glyph;
            return this;
        }
    }

    @SafeParcelable.Class(creator = "GlyphCreator")
    @SafeParcelable.Reserved({1})
    /* loaded from: classes3.dex */
    public static class Glyph extends AbstractSafeParcelable {
        @NonNull
        public static final Parcelable.Creator<Glyph> CREATOR = new zzj();
        public static final float DEFAULT_CIRCLE_RADIUS_DP = 5.0f;
        public static final float X_COORDINATE_DP = 13.0f;
        public static final float Y_COORDINATE_DP = 13.0f;

        /* renamed from: a */
        public String f47983a;

        /* renamed from: b */
        public BitmapDescriptor f47984b;

        /* renamed from: c */
        public int f47985c;

        /* renamed from: d */
        public int f47986d;

        public Glyph(@ColorInt int i) {
            this.f47986d = -16777216;
            this.f47985c = i;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Glyph)) {
                return false;
            }
            Glyph glyph = (Glyph) obj;
            if (this.f47985c != glyph.f47985c || !Objects.equals(this.f47983a, glyph.f47983a) || this.f47986d != glyph.f47986d) {
                return false;
            }
            BitmapDescriptor bitmapDescriptor = this.f47984b;
            if ((bitmapDescriptor == null && glyph.f47984b != null) || (bitmapDescriptor != null && glyph.f47984b == null)) {
                return false;
            }
            BitmapDescriptor bitmapDescriptor2 = glyph.f47984b;
            if (bitmapDescriptor == null || bitmapDescriptor2 == null) {
                return true;
            }
            return Objects.equals(ObjectWrapper.unwrap(bitmapDescriptor.zza()), ObjectWrapper.unwrap(bitmapDescriptor2.zza()));
        }

        @Nullable
        public BitmapDescriptor getBitmapDescriptor() {
            return this.f47984b;
        }

        public int getGlyphColor() {
            return this.f47985c;
        }

        @Nullable
        public String getText() {
            return this.f47983a;
        }

        public int getTextColor() {
            return this.f47986d;
        }

        public int hashCode() {
            return Objects.hash(this.f47983a, this.f47984b, Integer.valueOf(this.f47985c));
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@NonNull Parcel parcel, int i) {
            IBinder asBinder;
            int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
            SafeParcelWriter.writeString(parcel, 2, getText(), false);
            BitmapDescriptor bitmapDescriptor = this.f47984b;
            if (bitmapDescriptor == null) {
                asBinder = null;
            } else {
                asBinder = bitmapDescriptor.zza().asBinder();
            }
            SafeParcelWriter.writeIBinder(parcel, 3, asBinder, false);
            SafeParcelWriter.writeInt(parcel, 4, getGlyphColor());
            SafeParcelWriter.writeInt(parcel, 5, getTextColor());
            SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
        }

        public Glyph(@Nullable BitmapDescriptor bitmapDescriptor) {
            this.f47985c = PinConfig.DEFAULT_PIN_GLYPH_COLOR;
            this.f47986d = -16777216;
            this.f47984b = bitmapDescriptor;
        }

        public Glyph(@NonNull String str) {
            this(str, -16777216);
        }

        public Glyph(@NonNull String str, @ColorInt int i) {
            this.f47985c = PinConfig.DEFAULT_PIN_GLYPH_COLOR;
            this.f47983a = str;
            this.f47986d = i;
        }

        public Glyph(String str, IBinder iBinder, int i, int i2) {
            this.f47985c = PinConfig.DEFAULT_PIN_GLYPH_COLOR;
            this.f47986d = -16777216;
            this.f47983a = str;
            this.f47984b = iBinder == null ? null : new BitmapDescriptor(IObjectWrapper.Stub.asInterface(iBinder));
            this.f47985c = i;
            this.f47986d = i2;
        }
    }

    public PinConfig(int i, int i2, Glyph glyph) {
        this.f47977a = i;
        this.f47978b = i2;
        this.f47979c = glyph;
    }

    @NonNull
    public static Builder builder() {
        return new Builder();
    }

    public int getBackgroundColor() {
        return this.f47977a;
    }

    public int getBorderColor() {
        return this.f47978b;
    }

    @NonNull
    public Glyph getGlyph() {
        return this.f47979c;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 2, getBackgroundColor());
        SafeParcelWriter.writeInt(parcel, 3, getBorderColor());
        SafeParcelWriter.writeParcelable(parcel, 4, getGlyph(), i, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
