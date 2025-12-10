package com.google.android.gms.maps.model;

import androidx.annotation.NonNull;
import com.google.android.gms.maps.model.StampStyle;

/* loaded from: classes3.dex */
public class SpriteStyle extends StampStyle {

    /* loaded from: classes3.dex */
    public static final class Builder extends StampStyle.AbstractC6676a {
        public /* synthetic */ Builder(zzv zzvVar) {
        }

        @NonNull
        public SpriteStyle build() {
            return new SpriteStyle(this.f48013a);
        }

        @Override // com.google.android.gms.maps.model.StampStyle.AbstractC6676a
        @NonNull
        public Builder self() {
            return this;
        }

        @Override // com.google.android.gms.maps.model.StampStyle.AbstractC6676a
        @NonNull
        public final /* bridge */ /* synthetic */ StampStyle.AbstractC6676a self() {
            return this;
        }
    }

    public SpriteStyle(@NonNull BitmapDescriptor bitmapDescriptor) {
        super(bitmapDescriptor);
    }

    @NonNull
    public static Builder newBuilder(@NonNull BitmapDescriptor bitmapDescriptor) {
        return (Builder) new Builder(null).stamp(bitmapDescriptor);
    }
}
