package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@SafeParcelable.Class(creator = "InstrumentInfoCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes4.dex */
public final class InstrumentInfo extends AbstractSafeParcelable {
    public static final int CARD_CLASS_CREDIT = 1;
    public static final int CARD_CLASS_DEBIT = 2;
    public static final int CARD_CLASS_PREPAID = 3;
    public static final int CARD_CLASS_UNKNOWN = 0;
    @NonNull
    public static final Parcelable.Creator<InstrumentInfo> CREATOR = new zzo();

    /* renamed from: a */
    public String f48756a;

    /* renamed from: b */
    public String f48757b;

    /* renamed from: c */
    public int f48758c;

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes4.dex */
    public @interface CardClass {
    }

    @SafeParcelable.Constructor
    public InstrumentInfo(@NonNull @SafeParcelable.Param(m48388id = 2) String str, @NonNull @SafeParcelable.Param(m48388id = 3) String str2, @SafeParcelable.Param(m48388id = 4) int i) {
        this.f48756a = str;
        this.f48757b = str2;
        this.f48758c = i;
    }

    public int getCardClass() {
        int i = this.f48758c;
        if (i == 1 || i == 2 || i == 3) {
            return i;
        }
        return 0;
    }

    @NonNull
    public String getInstrumentDetails() {
        return this.f48757b;
    }

    @NonNull
    public String getInstrumentType() {
        return this.f48756a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, getInstrumentType(), false);
        SafeParcelWriter.writeString(parcel, 3, getInstrumentDetails(), false);
        SafeParcelWriter.writeInt(parcel, 4, getCardClass());
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
