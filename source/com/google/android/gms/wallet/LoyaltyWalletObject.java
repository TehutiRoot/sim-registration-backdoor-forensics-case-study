package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.ArrayUtils;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.wallet.wobs.LabelValueRow;
import com.google.android.gms.wallet.wobs.LoyaltyPoints;
import com.google.android.gms.wallet.wobs.TextModuleData;
import com.google.android.gms.wallet.wobs.TimeInterval;
import com.google.android.gms.wallet.wobs.UriData;
import com.google.android.gms.wallet.wobs.WalletObjectMessage;
import java.util.ArrayList;
import java.util.Collection;

@SafeParcelable.Class(creator = "LoyaltyWalletObjectCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes4.dex */
public final class LoyaltyWalletObject extends AbstractSafeParcelable {
    @NonNull
    public static final Parcelable.Creator<LoyaltyWalletObject> CREATOR = new zzs();

    /* renamed from: a */
    public String f48766a;

    /* renamed from: b */
    public String f48767b;

    /* renamed from: c */
    public String f48768c;

    /* renamed from: d */
    public String f48769d;

    /* renamed from: e */
    public String f48770e;

    /* renamed from: f */
    public String f48771f;

    /* renamed from: g */
    public String f48772g;

    /* renamed from: h */
    public String f48773h;

    /* renamed from: i */
    public String f48774i;

    /* renamed from: j */
    public String f48775j;

    /* renamed from: k */
    public int f48776k;

    /* renamed from: l */
    public ArrayList f48777l;

    /* renamed from: m */
    public TimeInterval f48778m;

    /* renamed from: n */
    public ArrayList f48779n;

    /* renamed from: o */
    public String f48780o;

    /* renamed from: p */
    public String f48781p;

    /* renamed from: q */
    public ArrayList f48782q;

    /* renamed from: r */
    public boolean f48783r;

    /* renamed from: s */
    public ArrayList f48784s;

    /* renamed from: t */
    public ArrayList f48785t;

    /* renamed from: u */
    public ArrayList f48786u;

    /* renamed from: v */
    public LoyaltyPoints f48787v;

    /* loaded from: classes4.dex */
    public final class Builder {
        public /* synthetic */ Builder(zzr zzrVar) {
        }

        @NonNull
        public Builder addImageModuleDataMainImageUri(@NonNull UriData uriData) {
            LoyaltyWalletObject.this.f48784s.add(uriData);
            return this;
        }

        @NonNull
        public Builder addImageModuleDataMainImageUris(@NonNull Collection<UriData> collection) {
            LoyaltyWalletObject.this.f48784s.addAll(collection);
            return this;
        }

        @NonNull
        public Builder addInfoModuleDataLabeValueRow(@NonNull LabelValueRow labelValueRow) {
            LoyaltyWalletObject.this.f48782q.add(labelValueRow);
            return this;
        }

        @NonNull
        public Builder addInfoModuleDataLabelValueRows(@NonNull Collection<LabelValueRow> collection) {
            LoyaltyWalletObject.this.f48782q.addAll(collection);
            return this;
        }

        @NonNull
        public Builder addLinksModuleDataUri(@NonNull UriData uriData) {
            LoyaltyWalletObject.this.f48786u.add(uriData);
            return this;
        }

        @NonNull
        public Builder addLinksModuleDataUris(@NonNull Collection<UriData> collection) {
            LoyaltyWalletObject.this.f48786u.addAll(collection);
            return this;
        }

        @NonNull
        public Builder addLocation(@NonNull LatLng latLng) {
            LoyaltyWalletObject.this.f48779n.add(latLng);
            return this;
        }

        @NonNull
        public Builder addLocations(@NonNull Collection<LatLng> collection) {
            LoyaltyWalletObject.this.f48779n.addAll(collection);
            return this;
        }

        @NonNull
        public Builder addMessage(@NonNull WalletObjectMessage walletObjectMessage) {
            LoyaltyWalletObject.this.f48777l.add(walletObjectMessage);
            return this;
        }

        @NonNull
        public Builder addMessages(@NonNull Collection<WalletObjectMessage> collection) {
            LoyaltyWalletObject.this.f48777l.addAll(collection);
            return this;
        }

        @NonNull
        public Builder addTextModuleData(@NonNull TextModuleData textModuleData) {
            LoyaltyWalletObject.this.f48785t.add(textModuleData);
            return this;
        }

        @NonNull
        public Builder addTextModulesData(@NonNull Collection<TextModuleData> collection) {
            LoyaltyWalletObject.this.f48785t.addAll(collection);
            return this;
        }

        @NonNull
        public LoyaltyWalletObject build() {
            return LoyaltyWalletObject.this;
        }

        @NonNull
        public Builder setAccountId(@NonNull String str) {
            LoyaltyWalletObject.this.f48767b = str;
            return this;
        }

        @NonNull
        public Builder setAccountName(@NonNull String str) {
            LoyaltyWalletObject.this.f48770e = str;
            return this;
        }

        @NonNull
        public Builder setBarcodeAlternateText(@NonNull String str) {
            LoyaltyWalletObject.this.f48771f = str;
            return this;
        }

        @NonNull
        @Deprecated
        public Builder setBarcodeLabel(@NonNull String str) {
            LoyaltyWalletObject.this.f48774i = str;
            return this;
        }

        @NonNull
        public Builder setBarcodeType(@NonNull String str) {
            LoyaltyWalletObject.this.f48772g = str;
            return this;
        }

        @NonNull
        public Builder setBarcodeValue(@NonNull String str) {
            LoyaltyWalletObject.this.f48773h = str;
            return this;
        }

        @NonNull
        public Builder setClassId(@NonNull String str) {
            LoyaltyWalletObject.this.f48775j = str;
            return this;
        }

        @NonNull
        public Builder setId(@NonNull String str) {
            LoyaltyWalletObject.this.f48766a = str;
            return this;
        }

        @NonNull
        @Deprecated
        public Builder setInfoModuleDataHexBackgroundColor(@NonNull String str) {
            LoyaltyWalletObject.this.f48781p = str;
            return this;
        }

        @NonNull
        @Deprecated
        public Builder setInfoModuleDataHexFontColor(@NonNull String str) {
            LoyaltyWalletObject.this.f48780o = str;
            return this;
        }

        @NonNull
        public Builder setInfoModuleDataShowLastUpdateTime(boolean z) {
            LoyaltyWalletObject.this.f48783r = z;
            return this;
        }

        @NonNull
        public Builder setIssuerName(@NonNull String str) {
            LoyaltyWalletObject.this.f48768c = str;
            return this;
        }

        @NonNull
        public Builder setLoyaltyPoints(@NonNull LoyaltyPoints loyaltyPoints) {
            LoyaltyWalletObject.this.f48787v = loyaltyPoints;
            return this;
        }

        @NonNull
        public Builder setProgramName(@NonNull String str) {
            LoyaltyWalletObject.this.f48769d = str;
            return this;
        }

        @NonNull
        public Builder setState(int i) {
            LoyaltyWalletObject.this.f48776k = i;
            return this;
        }

        @NonNull
        public Builder setValidTimeInterval(@NonNull TimeInterval timeInterval) {
            LoyaltyWalletObject.this.f48778m = timeInterval;
            return this;
        }
    }

    public LoyaltyWalletObject() {
        this.f48777l = ArrayUtils.newArrayList();
        this.f48779n = ArrayUtils.newArrayList();
        this.f48782q = ArrayUtils.newArrayList();
        this.f48784s = ArrayUtils.newArrayList();
        this.f48785t = ArrayUtils.newArrayList();
        this.f48786u = ArrayUtils.newArrayList();
    }

    @NonNull
    public static Builder newBuilder() {
        return new Builder(null);
    }

    @NonNull
    public String getAccountId() {
        return this.f48767b;
    }

    @NonNull
    public String getAccountName() {
        return this.f48770e;
    }

    @NonNull
    public String getBarcodeAlternateText() {
        return this.f48771f;
    }

    @NonNull
    @Deprecated
    public String getBarcodeLabel() {
        return this.f48774i;
    }

    @NonNull
    public String getBarcodeType() {
        return this.f48772g;
    }

    @NonNull
    public String getBarcodeValue() {
        return this.f48773h;
    }

    @NonNull
    public String getClassId() {
        return this.f48775j;
    }

    @NonNull
    public String getId() {
        return this.f48766a;
    }

    @NonNull
    public ArrayList<UriData> getImageModuleDataMainImageUris() {
        return this.f48784s;
    }

    @NonNull
    @Deprecated
    public String getInfoModuleDataHexBackgroundColor() {
        return this.f48781p;
    }

    @NonNull
    @Deprecated
    public String getInfoModuleDataHexFontColor() {
        return this.f48780o;
    }

    @NonNull
    public ArrayList<LabelValueRow> getInfoModuleDataLabelValueRows() {
        return this.f48782q;
    }

    public boolean getInfoModuleDataShowLastUpdateTime() {
        return this.f48783r;
    }

    @NonNull
    public String getIssuerName() {
        return this.f48768c;
    }

    @NonNull
    public ArrayList<UriData> getLinksModuleDataUris() {
        return this.f48786u;
    }

    @NonNull
    public ArrayList<LatLng> getLocations() {
        return this.f48779n;
    }

    @NonNull
    public LoyaltyPoints getLoyaltyPoints() {
        return this.f48787v;
    }

    @NonNull
    public ArrayList<WalletObjectMessage> getMessages() {
        return this.f48777l;
    }

    @NonNull
    public String getProgramName() {
        return this.f48769d;
    }

    public int getState() {
        return this.f48776k;
    }

    @NonNull
    public ArrayList<TextModuleData> getTextModulesData() {
        return this.f48785t;
    }

    @NonNull
    public TimeInterval getValidTimeInterval() {
        return this.f48778m;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, this.f48766a, false);
        SafeParcelWriter.writeString(parcel, 3, this.f48767b, false);
        SafeParcelWriter.writeString(parcel, 4, this.f48768c, false);
        SafeParcelWriter.writeString(parcel, 5, this.f48769d, false);
        SafeParcelWriter.writeString(parcel, 6, this.f48770e, false);
        SafeParcelWriter.writeString(parcel, 7, this.f48771f, false);
        SafeParcelWriter.writeString(parcel, 8, this.f48772g, false);
        SafeParcelWriter.writeString(parcel, 9, this.f48773h, false);
        SafeParcelWriter.writeString(parcel, 10, this.f48774i, false);
        SafeParcelWriter.writeString(parcel, 11, this.f48775j, false);
        SafeParcelWriter.writeInt(parcel, 12, this.f48776k);
        SafeParcelWriter.writeTypedList(parcel, 13, this.f48777l, false);
        SafeParcelWriter.writeParcelable(parcel, 14, this.f48778m, i, false);
        SafeParcelWriter.writeTypedList(parcel, 15, this.f48779n, false);
        SafeParcelWriter.writeString(parcel, 16, this.f48780o, false);
        SafeParcelWriter.writeString(parcel, 17, this.f48781p, false);
        SafeParcelWriter.writeTypedList(parcel, 18, this.f48782q, false);
        SafeParcelWriter.writeBoolean(parcel, 19, this.f48783r);
        SafeParcelWriter.writeTypedList(parcel, 20, this.f48784s, false);
        SafeParcelWriter.writeTypedList(parcel, 21, this.f48785t, false);
        SafeParcelWriter.writeTypedList(parcel, 22, this.f48786u, false);
        SafeParcelWriter.writeParcelable(parcel, 23, this.f48787v, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public LoyaltyWalletObject(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, int i, ArrayList arrayList, TimeInterval timeInterval, ArrayList arrayList2, String str11, String str12, ArrayList arrayList3, boolean z, ArrayList arrayList4, ArrayList arrayList5, ArrayList arrayList6, LoyaltyPoints loyaltyPoints) {
        this.f48766a = str;
        this.f48767b = str2;
        this.f48768c = str3;
        this.f48769d = str4;
        this.f48770e = str5;
        this.f48771f = str6;
        this.f48772g = str7;
        this.f48773h = str8;
        this.f48774i = str9;
        this.f48775j = str10;
        this.f48776k = i;
        this.f48777l = arrayList;
        this.f48778m = timeInterval;
        this.f48779n = arrayList2;
        this.f48780o = str11;
        this.f48781p = str12;
        this.f48782q = arrayList3;
        this.f48783r = z;
        this.f48784s = arrayList4;
        this.f48785t = arrayList5;
        this.f48786u = arrayList6;
        this.f48787v = loyaltyPoints;
    }
}
