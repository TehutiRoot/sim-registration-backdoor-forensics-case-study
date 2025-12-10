package com.google.android.gms.internal.firebase_ml;

import android.graphics.Matrix;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "ImageMetadataParcelCreator")
/* loaded from: classes3.dex */
public final class zzsj extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzsj> CREATOR = new zzsm();

    /* renamed from: a */
    public final int f46038a;
    @SafeParcelable.Field(m48386id = 2)
    public final int height;
    @SafeParcelable.Field(m48386id = 5)
    public final int rotation;
    @SafeParcelable.Field(m48386id = 1)
    public final int width;
    @SafeParcelable.Field(m48386id = 4)
    public final long zzbuz;

    @SafeParcelable.Constructor
    public zzsj(@SafeParcelable.Param(m48385id = 1) int i, @SafeParcelable.Param(m48385id = 2) int i2, @SafeParcelable.Param(m48385id = 3) int i3, @SafeParcelable.Param(m48385id = 4) long j, @SafeParcelable.Param(m48385id = 5) int i4) {
        this.width = i;
        this.height = i2;
        this.f46038a = i3;
        this.zzbuz = j;
        this.rotation = i4;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.width);
        SafeParcelWriter.writeInt(parcel, 2, this.height);
        SafeParcelWriter.writeInt(parcel, 3, this.f46038a);
        SafeParcelWriter.writeLong(parcel, 4, this.zzbuz);
        SafeParcelWriter.writeInt(parcel, 5, this.rotation);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @Nullable
    public final Matrix zzqz() {
        boolean z;
        int i;
        int i2;
        if (this.rotation == 0) {
            return null;
        }
        Matrix matrix = new Matrix();
        matrix.postTranslate((-this.width) / 2.0f, (-this.height) / 2.0f);
        matrix.postRotate(this.rotation * 90);
        if (this.rotation % 2 != 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            i = this.height;
        } else {
            i = this.width;
        }
        if (z) {
            i2 = this.width;
        } else {
            i2 = this.height;
        }
        matrix.postTranslate(i / 2.0f, i2 / 2.0f);
        return matrix;
    }
}