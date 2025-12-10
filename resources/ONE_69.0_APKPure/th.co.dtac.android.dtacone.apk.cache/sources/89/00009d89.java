package com.google.android.gms.maps.model;

import androidx.annotation.NonNull;
import com.google.android.gms.maps.model.StampStyle;

/* loaded from: classes3.dex */
public class TextureStyle extends StampStyle {

    /* loaded from: classes3.dex */
    public static final class Builder extends StampStyle.AbstractC6665a {
        public /* synthetic */ Builder(zzaf zzafVar) {
        }

        @NonNull
        public TextureStyle build() {
            return new TextureStyle(this.f48025a, null);
        }

        @Override // com.google.android.gms.maps.model.StampStyle.AbstractC6665a
        @NonNull
        public final /* bridge */ /* synthetic */ StampStyle.AbstractC6665a self() {
            return this;
        }

        @Override // com.google.android.gms.maps.model.StampStyle.AbstractC6665a
        @NonNull
        public Builder self() {
            return this;
        }
    }

    public /* synthetic */ TextureStyle(BitmapDescriptor bitmapDescriptor, zzag zzagVar) {
        super(bitmapDescriptor);
    }

    @NonNull
    public static Builder newBuilder(@NonNull BitmapDescriptor bitmapDescriptor) {
        return (Builder) new Builder(null).stamp(bitmapDescriptor);
    }
}