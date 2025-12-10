package com.google.android.gms.vision.label.internal.client;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Locale;

@SafeParcelable.Class(creator = "ImageLabelerOptionsCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes4.dex */
public class ImageLabelerOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ImageLabelerOptions> CREATOR = new zzg();

    /* renamed from: a */
    public int f48699a;
    @SafeParcelable.Field(m48389id = 3)
    public int zzeb;
    @SafeParcelable.Field(m48389id = 4)
    public float zzec;
    @SafeParcelable.Field(m48389id = 5)
    public int zzed;

    @SafeParcelable.Constructor
    public ImageLabelerOptions(@SafeParcelable.Param(m48388id = 2) int i, @SafeParcelable.Param(m48388id = 3) int i2, @SafeParcelable.Param(m48388id = 4) float f, @SafeParcelable.Param(m48388id = 5) int i3) {
        if (i == 1) {
            this.f48699a = i;
            this.zzeb = i2;
            this.zzec = f;
            this.zzed = i3;
            return;
        }
        throw new IllegalArgumentException("Unknown language.");
    }

    public static int zza(String str) {
        str.equals(Locale.ENGLISH.getLanguage());
        return 1;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 2, this.f48699a);
        SafeParcelWriter.writeInt(parcel, 3, this.zzeb);
        SafeParcelWriter.writeFloat(parcel, 4, this.zzec);
        SafeParcelWriter.writeInt(parcel, 5, this.zzed);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
