package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Preconditions;
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

@SafeParcelable.Class(creator = "GiftCardWalletObjectCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes4.dex */
public final class GiftCardWalletObject extends AbstractSafeParcelable {
    @NonNull
    public static final Parcelable.Creator<GiftCardWalletObject> CREATOR = new zzn();

    /* renamed from: a */
    public CommonWalletObject f48746a;

    /* renamed from: b */
    public String f48747b;

    /* renamed from: c */
    public String f48748c;

    /* renamed from: d */
    public String f48749d;

    /* renamed from: e */
    public long f48750e;

    /* renamed from: f */
    public String f48751f;

    /* renamed from: g */
    public long f48752g;

    /* renamed from: h */
    public String f48753h;

    /* loaded from: classes4.dex */
    public final class Builder {

        /* renamed from: a */
        public com.google.android.gms.wallet.wobs.zzb f48754a = CommonWalletObject.zzb();

        public /* synthetic */ Builder(zzm zzmVar) {
        }

        @NonNull
        public Builder addImageModuleDataMainImageUri(@NonNull UriData uriData) {
            this.f48754a.zza(uriData);
            return this;
        }

        @NonNull
        public Builder addImageModuleDataMainImageUris(@NonNull Collection<UriData> collection) {
            this.f48754a.zzb(collection);
            return this;
        }

        @NonNull
        public Builder addInfoModuleDataLabelValueRow(@NonNull LabelValueRow labelValueRow) {
            this.f48754a.zzc(labelValueRow);
            return this;
        }

        @NonNull
        public Builder addInfoModuleDataLabelValueRows(@NonNull Collection<LabelValueRow> collection) {
            this.f48754a.zzd(collection);
            return this;
        }

        @NonNull
        public Builder addLinksModuleDataUri(@NonNull UriData uriData) {
            this.f48754a.zze(uriData);
            return this;
        }

        @NonNull
        public Builder addLinksModuleDataUris(@NonNull Collection<UriData> collection) {
            this.f48754a.zzf(collection);
            return this;
        }

        @NonNull
        public Builder addLocation(@NonNull LatLng latLng) {
            this.f48754a.zzg(latLng);
            return this;
        }

        @NonNull
        public Builder addLocations(@NonNull Collection<LatLng> collection) {
            this.f48754a.zzh(collection);
            return this;
        }

        @NonNull
        public Builder addMessage(@NonNull WalletObjectMessage walletObjectMessage) {
            this.f48754a.zzi(walletObjectMessage);
            return this;
        }

        @NonNull
        public Builder addMessages(@NonNull Collection<WalletObjectMessage> collection) {
            this.f48754a.zzj(collection);
            return this;
        }

        @NonNull
        public Builder addTextModuleData(@NonNull TextModuleData textModuleData) {
            this.f48754a.zzk(textModuleData);
            return this;
        }

        @NonNull
        public Builder addTextModulesData(@NonNull Collection<TextModuleData> collection) {
            this.f48754a.zzl(collection);
            return this;
        }

        @NonNull
        public GiftCardWalletObject build() {
            Preconditions.checkArgument(!TextUtils.isEmpty(GiftCardWalletObject.this.f48747b), "Card number is required.");
            GiftCardWalletObject.this.f48746a = this.f48754a.zzz();
            Preconditions.checkArgument(!TextUtils.isEmpty(GiftCardWalletObject.this.f48746a.zzm()), "Card name is required.");
            Preconditions.checkArgument(!TextUtils.isEmpty(GiftCardWalletObject.this.f48746a.zzl()), "Card issuer name is required.");
            return GiftCardWalletObject.this;
        }

        @NonNull
        public Builder setBalanceCurrencyCode(@NonNull String str) {
            GiftCardWalletObject.this.f48751f = str;
            return this;
        }

        @NonNull
        public Builder setBalanceMicros(long j) {
            GiftCardWalletObject.this.f48750e = j;
            return this;
        }

        @NonNull
        public Builder setBalanceUpdateTime(long j) {
            GiftCardWalletObject.this.f48752g = j;
            return this;
        }

        @NonNull
        public Builder setBarcodeAlternateText(@NonNull String str) {
            this.f48754a.zzm(str);
            return this;
        }

        @NonNull
        @Deprecated
        public Builder setBarcodeLabel(@NonNull String str) {
            this.f48754a.zzn(str);
            return this;
        }

        @NonNull
        public Builder setBarcodeType(@NonNull String str) {
            this.f48754a.zzo(str);
            return this;
        }

        @NonNull
        public Builder setBarcodeValue(@NonNull String str) {
            this.f48754a.zzp(str);
            return this;
        }

        @NonNull
        @Deprecated
        public Builder setCardIdentifier(@NonNull String str) {
            GiftCardWalletObject.this.f48749d = str;
            return this;
        }

        @NonNull
        public Builder setCardNumber(@NonNull String str) {
            GiftCardWalletObject.this.f48747b = str;
            return this;
        }

        @NonNull
        public Builder setClassId(@NonNull String str) {
            this.f48754a.zzq(str);
            return this;
        }

        @NonNull
        public Builder setEventNumber(@NonNull String str) {
            GiftCardWalletObject.this.f48753h = str;
            return this;
        }

        @NonNull
        public Builder setId(@NonNull String str) {
            this.f48754a.zzr(str);
            return this;
        }

        @NonNull
        @Deprecated
        public Builder setInfoModuleDataHexBackgroundColor(@NonNull String str) {
            this.f48754a.zzs(str);
            return this;
        }

        @NonNull
        @Deprecated
        public Builder setInfoModuleDataHexFontColor(@NonNull String str) {
            this.f48754a.zzt(str);
            return this;
        }

        @NonNull
        public Builder setInfoModuleDataShowLastUpdateTime(boolean z) {
            this.f48754a.zzu(z);
            return this;
        }

        @NonNull
        public Builder setIssuerName(@NonNull String str) {
            this.f48754a.zzv(str);
            return this;
        }

        @NonNull
        public Builder setPin(@NonNull String str) {
            GiftCardWalletObject.this.f48748c = str;
            return this;
        }

        @NonNull
        public Builder setState(int i) {
            this.f48754a.zzx(i);
            return this;
        }

        @NonNull
        public Builder setTitle(@NonNull String str) {
            this.f48754a.zzw(str);
            return this;
        }

        @NonNull
        public Builder setValidTimeInterval(@NonNull TimeInterval timeInterval) {
            this.f48754a.zzy(timeInterval);
            return this;
        }
    }

    public GiftCardWalletObject() {
        this.f48746a = CommonWalletObject.zzb().zzz();
    }

    @NonNull
    public static Builder newBuilder() {
        return new Builder(null);
    }

    @NonNull
    public String getBalanceCurrencyCode() {
        return this.f48751f;
    }

    public long getBalanceMicros() {
        return this.f48750e;
    }

    public long getBalanceUpdateTime() {
        return this.f48752g;
    }

    @NonNull
    public String getBarcodeAlternateText() {
        return this.f48746a.zzd();
    }

    @NonNull
    @Deprecated
    public String getBarcodeLabel() {
        return this.f48746a.zze();
    }

    @NonNull
    public String getBarcodeType() {
        return this.f48746a.zzf();
    }

    @NonNull
    public String getBarcodeValue() {
        return this.f48746a.zzg();
    }

    @NonNull
    @Deprecated
    public String getCardIdentifier() {
        return this.f48749d;
    }

    @NonNull
    public String getCardNumber() {
        return this.f48747b;
    }

    @NonNull
    public String getClassId() {
        return this.f48746a.zzh();
    }

    @NonNull
    public String getEventNumber() {
        return this.f48753h;
    }

    @NonNull
    public String getId() {
        return this.f48746a.zzi();
    }

    @NonNull
    public ArrayList<UriData> getImageModuleDataMainImageUris() {
        return this.f48746a.zzn();
    }

    @NonNull
    @Deprecated
    public String getInfoModuleDataHexBackgroundColor() {
        return this.f48746a.zzj();
    }

    @NonNull
    @Deprecated
    public String getInfoModuleDataHexFontColor() {
        return this.f48746a.zzk();
    }

    @NonNull
    public ArrayList<LabelValueRow> getInfoModuleDataLabelValueRows() {
        return this.f48746a.zzo();
    }

    public boolean getInfoModuleDataShowLastUpdateTime() {
        return this.f48746a.zzt();
    }

    @NonNull
    public String getIssuerName() {
        return this.f48746a.zzl();
    }

    @NonNull
    public ArrayList<UriData> getLinksModuleDataUris() {
        return this.f48746a.zzp();
    }

    @NonNull
    public ArrayList<LatLng> getLocations() {
        return this.f48746a.zzq();
    }

    @NonNull
    public ArrayList<WalletObjectMessage> getMessages() {
        return this.f48746a.zzr();
    }

    @NonNull
    public String getPin() {
        return this.f48748c;
    }

    public int getState() {
        return this.f48746a.zza();
    }

    @NonNull
    public ArrayList<TextModuleData> getTextModulesData() {
        return this.f48746a.zzs();
    }

    @NonNull
    public String getTitle() {
        return this.f48746a.zzm();
    }

    @NonNull
    public TimeInterval getValidTimeInterval() {
        return this.f48746a.zzc();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 2, this.f48746a, i, false);
        SafeParcelWriter.writeString(parcel, 3, this.f48747b, false);
        SafeParcelWriter.writeString(parcel, 4, this.f48748c, false);
        SafeParcelWriter.writeString(parcel, 5, this.f48749d, false);
        SafeParcelWriter.writeLong(parcel, 6, this.f48750e);
        SafeParcelWriter.writeString(parcel, 7, this.f48751f, false);
        SafeParcelWriter.writeLong(parcel, 8, this.f48752g);
        SafeParcelWriter.writeString(parcel, 9, this.f48753h, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public GiftCardWalletObject(CommonWalletObject commonWalletObject, String str, String str2, String str3, long j, String str4, long j2, String str5) {
        CommonWalletObject.zzb();
        this.f48746a = commonWalletObject;
        this.f48747b = str;
        this.f48748c = str2;
        this.f48750e = j;
        this.f48751f = str4;
        this.f48752g = j2;
        this.f48753h = str5;
        this.f48749d = str3;
    }
}
