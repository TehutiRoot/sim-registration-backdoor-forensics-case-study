package com.google.firebase.p015ml.vision.automl.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: com.google.firebase.ml.vision.automl.internal.zzm */
/* loaded from: classes4.dex */
public final class zzm implements Parcelable.Creator<OnDeviceAutoMLImageLabelerOptionsParcel> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ OnDeviceAutoMLImageLabelerOptionsParcel createFromParcel(Parcel parcel) {
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        float f = 0.0f;
        String str = null;
        String str2 = null;
        String str3 = null;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = SafeParcelReader.readHeader(parcel);
            int fieldId = SafeParcelReader.getFieldId(readHeader);
            if (fieldId != 1) {
                if (fieldId != 2) {
                    if (fieldId != 3) {
                        if (fieldId != 4) {
                            SafeParcelReader.skipUnknownField(parcel, readHeader);
                        } else {
                            str3 = SafeParcelReader.createString(parcel, readHeader);
                        }
                    } else {
                        str2 = SafeParcelReader.createString(parcel, readHeader);
                    }
                } else {
                    str = SafeParcelReader.createString(parcel, readHeader);
                }
            } else {
                f = SafeParcelReader.readFloat(parcel, readHeader);
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
        return new OnDeviceAutoMLImageLabelerOptionsParcel(f, str, str2, str3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ OnDeviceAutoMLImageLabelerOptionsParcel[] newArray(int i) {
        return new OnDeviceAutoMLImageLabelerOptionsParcel[i];
    }
}