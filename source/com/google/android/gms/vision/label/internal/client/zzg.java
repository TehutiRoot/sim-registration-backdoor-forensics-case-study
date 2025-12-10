package com.google.android.gms.vision.label.internal.client;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes4.dex */
public final class zzg implements Parcelable.Creator<ImageLabelerOptions> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ ImageLabelerOptions createFromParcel(Parcel parcel) {
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        float f = 0.0f;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = SafeParcelReader.readHeader(parcel);
            int fieldId = SafeParcelReader.getFieldId(readHeader);
            if (fieldId != 2) {
                if (fieldId != 3) {
                    if (fieldId != 4) {
                        if (fieldId != 5) {
                            SafeParcelReader.skipUnknownField(parcel, readHeader);
                        } else {
                            i3 = SafeParcelReader.readInt(parcel, readHeader);
                        }
                    } else {
                        f = SafeParcelReader.readFloat(parcel, readHeader);
                    }
                } else {
                    i2 = SafeParcelReader.readInt(parcel, readHeader);
                }
            } else {
                i = SafeParcelReader.readInt(parcel, readHeader);
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
        return new ImageLabelerOptions(i, i2, f, i3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ ImageLabelerOptions[] newArray(int i) {
        return new ImageLabelerOptions[i];
    }
}
