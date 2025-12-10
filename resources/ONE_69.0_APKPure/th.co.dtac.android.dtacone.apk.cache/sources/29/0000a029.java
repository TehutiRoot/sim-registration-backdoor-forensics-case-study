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
    public CommonWalletObject f48758a;

    /* renamed from: b */
    public String f48759b;

    /* renamed from: c */
    public String f48760c;

    /* renamed from: d */
    public String f48761d;

    /* renamed from: e */
    public long f48762e;

    /* renamed from: f */
    public String f48763f;

    /* renamed from: g */
    public long f48764g;

    /* renamed from: h */
    public String f48765h;

    /* loaded from: classes4.dex */
    public final class Builder {

        /* renamed from: a */
        public com.google.android.gms.wallet.wobs.zzb f48766a = CommonWalletObject.zzb();

        public /* synthetic */ Builder(zzm zzmVar) {
        }

        @NonNull
        public Builder addImageModuleDataMainImageUri(@NonNull UriData uriData) {
            this.f48766a.zza(uriData);
            return this;
        }

        @NonNull
        public Builder addImageModuleDataMainImageUris(@NonNull Collection<UriData> collection) {
            this.f48766a.zzb(collection);
            return this;
        }

        @NonNull
        public Builder addInfoModuleDataLabelValueRow(@NonNull LabelValueRow labelValueRow) {
            this.f48766a.zzc(labelValueRow);
            return this;
        }

        @NonNull
        public Builder addInfoModuleDataLabelValueRows(@NonNull Collection<LabelValueRow> collection) {
            this.f48766a.zzd(collection);
            return this;
        }

        @NonNull
        public Builder addLinksModuleDataUri(@NonNull UriData uriData) {
            this.f48766a.zze(uriData);
            return this;
        }

        @NonNull
        public Builder addLinksModuleDataUris(@NonNull Collection<UriData> collection) {
            this.f48766a.zzf(collection);
            return this;
        }

        @NonNull
        public Builder addLocation(@NonNull LatLng latLng) {
            this.f48766a.zzg(latLng);
            return this;
        }

        @NonNull
        public Builder addLocations(@NonNull Collection<LatLng> collection) {
            this.f48766a.zzh(collection);
            return this;
        }

        @NonNull
        public Builder addMessage(@NonNull WalletObjectMessage walletObjectMessage) {
            this.f48766a.zzi(walletObjectMessage);
            return this;
        }

        @NonNull
        public Builder addMessages(@NonNull Collection<WalletObjectMessage> collection) {
            this.f48766a.zzj(collection);
            return this;
        }

        @NonNull
        public Builder addTextModuleData(@NonNull TextModuleData textModuleData) {
            this.f48766a.zzk(textModuleData);
            return this;
        }

        @NonNull
        public Builder addTextModulesData(@NonNull Collection<TextModuleData> collection) {
            this.f48766a.zzl(collection);
            return this;
        }

        @NonNull
        public GiftCardWalletObject build() {
            Preconditions.checkArgument(!TextUtils.isEmpty(GiftCardWalletObject.this.f48759b), "Card number is required.");
            GiftCardWalletObject.this.f48758a = this.f48766a.zzz();
            Preconditions.checkArgument(!TextUtils.isEmpty(GiftCardWalletObject.this.f48758a.zzm()), "Card name is required.");
            Preconditions.checkArgument(!TextUtils.isEmpty(GiftCardWalletObject.this.f48758a.zzl()), "Card issuer name is required.");
            return GiftCardWalletObject.this;
        }

        @NonNull
        public Builder setBalanceCurrencyCode(@NonNull String str) {
            GiftCardWalletObject.this.f48763f = str;
            return this;
        }

        @NonNull
        public Builder setBalanceMicros(long j) {
            GiftCardWalletObject.this.f48762e = j;
            return this;
        }

        @NonNull
        public Builder setBalanceUpdateTime(long j) {
            GiftCardWalletObject.this.f48764g = j;
            return this;
        }

        @NonNull
        public Builder setBarcodeAlternateText(@NonNull String str) {
            this.f48766a.zzm(str);
            return this;
        }

        @NonNull
        @Deprecated
        public Builder setBarcodeLabel(@NonNull String str) {
            this.f48766a.zzn(str);
            return this;
        }

        @NonNull
        public Builder setBarcodeType(@NonNull String str) {
            this.f48766a.zzo(str);
            return this;
        }

        @NonNull
        public Builder setBarcodeValue(@NonNull String str) {
            this.f48766a.zzp(str);
            return this;
        }

        @NonNull
        @Deprecated
        public Builder setCardIdentifier(@NonNull String str) {
            GiftCardWalletObject.this.f48761d = str;
            return this;
        }

        @NonNull
        public Builder setCardNumber(@NonNull String str) {
            GiftCardWalletObject.this.f48759b = str;
            return this;
        }

        @NonNull
        public Builder setClassId(@NonNull String str) {
            this.f48766a.zzq(str);
            return this;
        }

        @NonNull
        public Builder setEventNumber(@NonNull String str) {
            GiftCardWalletObject.this.f48765h = str;
            return this;
        }

        @NonNull
        public Builder setId(@NonNull String str) {
            this.f48766a.zzr(str);
            return this;
        }

        @NonNull
        @Deprecated
        public Builder setInfoModuleDataHexBackgroundColor(@NonNull String str) {
            this.f48766a.zzs(str);
            return this;
        }

        @NonNull
        @Deprecated
        public Builder setInfoModuleDataHexFontColor(@NonNull String str) {
            this.f48766a.zzt(str);
            return this;
        }

        @NonNull
        public Builder setInfoModuleDataShowLastUpdateTime(boolean z) {
            this.f48766a.zzu(z);
            return this;
        }

        @NonNull
        public Builder setIssuerName(@NonNull String str) {
            this.f48766a.zzv(str);
            return this;
        }

        @NonNull
        public Builder setPin(@NonNull String str) {
            GiftCardWalletObject.this.f48760c = str;
            return this;
        }

        @NonNull
        public Builder setState(int i) {
            this.f48766a.zzx(i);
            return this;
        }

        @NonNull
        public Builder setTitle(@NonNull String str) {
            this.f48766a.zzw(str);
            return this;
        }

        @NonNull
        public Builder setValidTimeInterval(@NonNull TimeInterval timeInterval) {
            this.f48766a.zzy(timeInterval);
            return this;
        }
    }

    public GiftCardWalletObject() {
        this.f48758a = CommonWalletObject.zzb().zzz();
    }

    @NonNull
    public static Builder newBuilder() {
        return new Builder(null);
    }

    @NonNull
    public String getBalanceCurrencyCode() {
        return this.f48763f;
    }

    public long getBalanceMicros() {
        return this.f48762e;
    }

    public long getBalanceUpdateTime() {
        return this.f48764g;
    }

    @NonNull
    public String getBarcodeAlternateText() {
        return this.f48758a.zzd();
    }

    @NonNull
    @Deprecated
    public String getBarcodeLabel() {
        return this.f48758a.zze();
    }

    @NonNull
    public String getBarcodeType() {
        return this.f48758a.zzf();
    }

    @NonNull
    public String getBarcodeValue() {
        return this.f48758a.zzg();
    }

    @NonNull
    @Deprecated
    public String getCardIdentifier() {
        return this.f48761d;
    }

    @NonNull
    public String getCardNumber() {
        return this.f48759b;
    }

    @NonNull
    public String getClassId() {
        return this.f48758a.zzh();
    }

    @NonNull
    public String getEventNumber() {
        return this.f48765h;
    }

    @NonNull
    public String getId() {
        return this.f48758a.zzi();
    }

    @NonNull
    public ArrayList<UriData> getImageModuleDataMainImageUris() {
        return this.f48758a.zzn();
    }

    @NonNull
    @Deprecated
    public String getInfoModuleDataHexBackgroundColor() {
        return this.f48758a.zzj();
    }

    @NonNull
    @Deprecated
    public String getInfoModuleDataHexFontColor() {
        return this.f48758a.zzk();
    }

    @NonNull
    public ArrayList<LabelValueRow> getInfoModuleDataLabelValueRows() {
        return this.f48758a.zzo();
    }

    public boolean getInfoModuleDataShowLastUpdateTime() {
        return this.f48758a.zzt();
    }

    @NonNull
    public String getIssuerName() {
        return this.f48758a.zzl();
    }

    @NonNull
    public ArrayList<UriData> getLinksModuleDataUris() {
        return this.f48758a.zzp();
    }

    @NonNull
    public ArrayList<LatLng> getLocations() {
        return this.f48758a.zzq();
    }

    @NonNull
    public ArrayList<WalletObjectMessage> getMessages() {
        return this.f48758a.zzr();
    }

    @NonNull
    public String getPin() {
        return this.f48760c;
    }

    public int getState() {
        return this.f48758a.zza();
    }

    @NonNull
    public ArrayList<TextModuleData> getTextModulesData() {
        return this.f48758a.zzs();
    }

    @NonNull
    public String getTitle() {
        return this.f48758a.zzm();
    }

    @NonNull
    public TimeInterval getValidTimeInterval() {
        return this.f48758a.zzc();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 2, this.f48758a, i, false);
        SafeParcelWriter.writeString(parcel, 3, this.f48759b, false);
        SafeParcelWriter.writeString(parcel, 4, this.f48760c, false);
        SafeParcelWriter.writeString(parcel, 5, this.f48761d, false);
        SafeParcelWriter.writeLong(parcel, 6, this.f48762e);
        SafeParcelWriter.writeString(parcel, 7, this.f48763f, false);
        SafeParcelWriter.writeLong(parcel, 8, this.f48764g);
        SafeParcelWriter.writeString(parcel, 9, this.f48765h, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public GiftCardWalletObject(CommonWalletObject commonWalletObject, String str, String str2, String str3, long j, String str4, long j2, String str5) {
        CommonWalletObject.zzb();
        this.f48758a = commonWalletObject;
        this.f48759b = str;
        this.f48760c = str2;
        this.f48762e = j;
        this.f48763f = str4;
        this.f48764g = j2;
        this.f48765h = str5;
        this.f48761d = str3;
    }
}