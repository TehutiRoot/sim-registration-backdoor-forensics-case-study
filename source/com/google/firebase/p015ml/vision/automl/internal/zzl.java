package com.google.firebase.p015ml.vision.automl.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "ImageLabelParcelCreator")
/* renamed from: com.google.firebase.ml.vision.automl.internal.zzl */
/* loaded from: classes4.dex */
public final class zzl extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzl> CREATOR = new zzk();
    @SafeParcelable.Field(m48389id = 2)
    public final String text;
    @SafeParcelable.Field(m48389id = 1)
    public final String zzbsn;
    @SafeParcelable.Field(m48389id = 3)
    public final float zzbso;

    @SafeParcelable.Constructor
    public zzl(@SafeParcelable.Param(m48388id = 1) String str, @SafeParcelable.Param(m48388id = 2) String str2, @SafeParcelable.Param(m48388id = 3) float f) {
        this.zzbsn = str;
        this.text = str2;
        this.zzbso = f;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzl)) {
            return false;
        }
        zzl zzlVar = (zzl) obj;
        if (Objects.equal(this.zzbsn, zzlVar.zzbsn) && Objects.equal(this.text, zzlVar.text) && Float.compare(this.zzbso, zzlVar.zzbso) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.zzbsn, this.text, Float.valueOf(this.zzbso));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.zzbsn, false);
        SafeParcelWriter.writeString(parcel, 2, this.text, false);
        SafeParcelWriter.writeFloat(parcel, 3, this.zzbso);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
