package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.wallet.wobs.CommonWalletObject;
import com.google.android.gms.wallet.wobs.LabelValueRow;
import com.google.android.gms.wallet.wobs.TextModuleData;
import com.google.android.gms.wallet.wobs.TimeInterval;
import com.google.android.gms.wallet.wobs.UriData;
import com.google.android.gms.wallet.wobs.WalletObjectMessage;
import java.util.ArrayList;
import java.util.Collection;

@SafeParcelable.Class(creator = "OfferWalletObjectCreator")
/* loaded from: classes4.dex */
public final class OfferWalletObject extends AbstractSafeParcelable {
    @NonNull
    public static final Parcelable.Creator<OfferWalletObject> CREATOR = new zzv();

    /* renamed from: a */
    public final int f48812a;

    /* renamed from: b */
    public String f48813b;

    /* renamed from: c */
    public String f48814c;

    /* renamed from: d */
    public CommonWalletObject f48815d;

    /* loaded from: classes4.dex */
    public final class Builder {

        /* renamed from: a */
        public com.google.android.gms.wallet.wobs.zzb f48816a = CommonWalletObject.zzb();

        public /* synthetic */ Builder(zzu zzuVar) {
        }

        @NonNull
        public Builder addImageModuleDataMainImageUri(@NonNull UriData uriData) {
            this.f48816a.zza(uriData);
            return this;
        }

        @NonNull
        public Builder addImageModuleDataMainImageUris(@NonNull Collection<UriData> collection) {
            this.f48816a.zzb(collection);
            return this;
        }

        @NonNull
        public Builder addInfoModuleDataLabelValueRow(@NonNull LabelValueRow labelValueRow) {
            this.f48816a.zzc(labelValueRow);
            return this;
        }

        @NonNull
        public Builder addInfoModuleDataLabelValueRows(@NonNull Collection<LabelValueRow> collection) {
            this.f48816a.zzd(collection);
            return this;
        }

        @NonNull
        public Builder addLinksModuleDataUri(@NonNull UriData uriData) {
            this.f48816a.zze(uriData);
            return this;
        }

        @NonNull
        public Builder addLinksModuleDataUris(@NonNull Collection<UriData> collection) {
            this.f48816a.zzf(collection);
            return this;
        }

        @NonNull
        public Builder addLocation(@NonNull LatLng latLng) {
            this.f48816a.zzg(latLng);
            return this;
        }

        @NonNull
        public Builder addLocations(@NonNull Collection<LatLng> collection) {
            this.f48816a.zzh(collection);
            return this;
        }

        @NonNull
        public Builder addMessage(@NonNull WalletObjectMessage walletObjectMessage) {
            this.f48816a.zzi(walletObjectMessage);
            return this;
        }

        @NonNull
        public Builder addMessages(@NonNull Collection<WalletObjectMessage> collection) {
            this.f48816a.zzj(collection);
            return this;
        }

        @NonNull
        public Builder addTextModuleData(@NonNull TextModuleData textModuleData) {
            this.f48816a.zzk(textModuleData);
            return this;
        }

        @NonNull
        public Builder addTextModulesData(@NonNull Collection<TextModuleData> collection) {
            this.f48816a.zzl(collection);
            return this;
        }

        @NonNull
        public OfferWalletObject build() {
            OfferWalletObject.this.f48815d = this.f48816a.zzz();
            return OfferWalletObject.this;
        }

        @NonNull
        public Builder setBarcodeAlternateText(@NonNull String str) {
            this.f48816a.zzm(str);
            return this;
        }

        @NonNull
        @Deprecated
        public Builder setBarcodeLabel(@NonNull String str) {
            this.f48816a.zzn(str);
            return this;
        }

        @NonNull
        public Builder setBarcodeType(@NonNull String str) {
            this.f48816a.zzo(str);
            return this;
        }

        @NonNull
        public Builder setBarcodeValue(@NonNull String str) {
            this.f48816a.zzp(str);
            return this;
        }

        @NonNull
        public Builder setClassId(@NonNull String str) {
            this.f48816a.zzq(str);
            return this;
        }

        @NonNull
        public Builder setId(@NonNull String str) {
            this.f48816a.zzr(str);
            OfferWalletObject.this.f48813b = str;
            return this;
        }

        @NonNull
        @Deprecated
        public Builder setInfoModuleDataHexBackgroundColor(@NonNull String str) {
            this.f48816a.zzs(str);
            return this;
        }

        @NonNull
        @Deprecated
        public Builder setInfoModuleDataHexFontColor(@NonNull String str) {
            this.f48816a.zzt(str);
            return this;
        }

        @NonNull
        public Builder setInfoModuleDataShowLastUpdateTime(boolean z) {
            this.f48816a.zzu(z);
            return this;
        }

        @NonNull
        public Builder setIssuerName(@NonNull String str) {
            this.f48816a.zzv(str);
            return this;
        }

        @NonNull
        public Builder setRedemptionCode(@NonNull String str) {
            OfferWalletObject.this.f48814c = str;
            return this;
        }

        @NonNull
        public Builder setState(int i) {
            this.f48816a.zzx(i);
            return this;
        }

        @NonNull
        public Builder setTitle(@NonNull String str) {
            this.f48816a.zzw(str);
            return this;
        }

        @NonNull
        public Builder setValidTimeInterval(@NonNull TimeInterval timeInterval) {
            this.f48816a.zzy(timeInterval);
            return this;
        }
    }

    public OfferWalletObject() {
        this.f48812a = 3;
    }

    @NonNull
    public static Builder newBuilder() {
        return new Builder(null);
    }

    @NonNull
    public String getBarcodeAlternateText() {
        return this.f48815d.zzd();
    }

    @NonNull
    @Deprecated
    public String getBarcodeLabel() {
        return this.f48815d.zze();
    }

    @NonNull
    public String getBarcodeType() {
        return this.f48815d.zzf();
    }

    @NonNull
    public String getBarcodeValue() {
        return this.f48815d.zzg();
    }

    @NonNull
    public String getClassId() {
        return this.f48815d.zzh();
    }

    @NonNull
    public String getId() {
        return this.f48815d.zzi();
    }

    @NonNull
    public ArrayList<UriData> getImageModuleDataMainImageUris() {
        return this.f48815d.zzn();
    }

    @NonNull
    @Deprecated
    public String getInfoModuleDataHexBackgroundColor() {
        return this.f48815d.zzj();
    }

    @NonNull
    @Deprecated
    public String getInfoModuleDataHexFontColor() {
        return this.f48815d.zzk();
    }

    @NonNull
    public ArrayList<LabelValueRow> getInfoModuleDataLabelValueRows() {
        return this.f48815d.zzo();
    }

    public boolean getInfoModuleDataShowLastUpdateTime() {
        return this.f48815d.zzt();
    }

    @NonNull
    public String getIssuerName() {
        return this.f48815d.zzl();
    }

    @NonNull
    public ArrayList<UriData> getLinksModuleDataUris() {
        return this.f48815d.zzp();
    }

    @NonNull
    public ArrayList<LatLng> getLocations() {
        return this.f48815d.zzq();
    }

    @NonNull
    public ArrayList<WalletObjectMessage> getMessages() {
        return this.f48815d.zzr();
    }

    @NonNull
    public String getRedemptionCode() {
        return this.f48814c;
    }

    public int getState() {
        return this.f48815d.zza();
    }

    @NonNull
    public ArrayList<TextModuleData> getTextModulesData() {
        return this.f48815d.zzs();
    }

    @NonNull
    public String getTitle() {
        return this.f48815d.zzm();
    }

    @NonNull
    public TimeInterval getValidTimeInterval() {
        return this.f48815d.zzc();
    }

    public int getVersionCode() {
        return this.f48812a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, getVersionCode());
        SafeParcelWriter.writeString(parcel, 2, this.f48813b, false);
        SafeParcelWriter.writeString(parcel, 3, this.f48814c, false);
        SafeParcelWriter.writeParcelable(parcel, 4, this.f48815d, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public OfferWalletObject(int i, String str, String str2, CommonWalletObject commonWalletObject) {
        this.f48812a = i;
        this.f48814c = str2;
        if (i >= 3) {
            this.f48815d = commonWalletObject;
            return;
        }
        com.google.android.gms.wallet.wobs.zzb zzb = CommonWalletObject.zzb();
        zzb.zzr(str);
        this.f48815d = zzb.zzz();
    }
}