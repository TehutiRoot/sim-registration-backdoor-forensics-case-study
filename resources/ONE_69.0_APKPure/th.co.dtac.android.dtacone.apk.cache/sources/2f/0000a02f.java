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
    public String f48778a;

    /* renamed from: b */
    public String f48779b;

    /* renamed from: c */
    public String f48780c;

    /* renamed from: d */
    public String f48781d;

    /* renamed from: e */
    public String f48782e;

    /* renamed from: f */
    public String f48783f;

    /* renamed from: g */
    public String f48784g;

    /* renamed from: h */
    public String f48785h;

    /* renamed from: i */
    public String f48786i;

    /* renamed from: j */
    public String f48787j;

    /* renamed from: k */
    public int f48788k;

    /* renamed from: l */
    public ArrayList f48789l;

    /* renamed from: m */
    public TimeInterval f48790m;

    /* renamed from: n */
    public ArrayList f48791n;

    /* renamed from: o */
    public String f48792o;

    /* renamed from: p */
    public String f48793p;

    /* renamed from: q */
    public ArrayList f48794q;

    /* renamed from: r */
    public boolean f48795r;

    /* renamed from: s */
    public ArrayList f48796s;

    /* renamed from: t */
    public ArrayList f48797t;

    /* renamed from: u */
    public ArrayList f48798u;

    /* renamed from: v */
    public LoyaltyPoints f48799v;

    /* loaded from: classes4.dex */
    public final class Builder {
        public /* synthetic */ Builder(zzr zzrVar) {
        }

        @NonNull
        public Builder addImageModuleDataMainImageUri(@NonNull UriData uriData) {
            LoyaltyWalletObject.this.f48796s.add(uriData);
            return this;
        }

        @NonNull
        public Builder addImageModuleDataMainImageUris(@NonNull Collection<UriData> collection) {
            LoyaltyWalletObject.this.f48796s.addAll(collection);
            return this;
        }

        @NonNull
        public Builder addInfoModuleDataLabeValueRow(@NonNull LabelValueRow labelValueRow) {
            LoyaltyWalletObject.this.f48794q.add(labelValueRow);
            return this;
        }

        @NonNull
        public Builder addInfoModuleDataLabelValueRows(@NonNull Collection<LabelValueRow> collection) {
            LoyaltyWalletObject.this.f48794q.addAll(collection);
            return this;
        }

        @NonNull
        public Builder addLinksModuleDataUri(@NonNull UriData uriData) {
            LoyaltyWalletObject.this.f48798u.add(uriData);
            return this;
        }

        @NonNull
        public Builder addLinksModuleDataUris(@NonNull Collection<UriData> collection) {
            LoyaltyWalletObject.this.f48798u.addAll(collection);
            return this;
        }

        @NonNull
        public Builder addLocation(@NonNull LatLng latLng) {
            LoyaltyWalletObject.this.f48791n.add(latLng);
            return this;
        }

        @NonNull
        public Builder addLocations(@NonNull Collection<LatLng> collection) {
            LoyaltyWalletObject.this.f48791n.addAll(collection);
            return this;
        }

        @NonNull
        public Builder addMessage(@NonNull WalletObjectMessage walletObjectMessage) {
            LoyaltyWalletObject.this.f48789l.add(walletObjectMessage);
            return this;
        }

        @NonNull
        public Builder addMessages(@NonNull Collection<WalletObjectMessage> collection) {
            LoyaltyWalletObject.this.f48789l.addAll(collection);
            return this;
        }

        @NonNull
        public Builder addTextModuleData(@NonNull TextModuleData textModuleData) {
            LoyaltyWalletObject.this.f48797t.add(textModuleData);
            return this;
        }

        @NonNull
        public Builder addTextModulesData(@NonNull Collection<TextModuleData> collection) {
            LoyaltyWalletObject.this.f48797t.addAll(collection);
            return this;
        }

        @NonNull
        public LoyaltyWalletObject build() {
            return LoyaltyWalletObject.this;
        }

        @NonNull
        public Builder setAccountId(@NonNull String str) {
            LoyaltyWalletObject.this.f48779b = str;
            return this;
        }

        @NonNull
        public Builder setAccountName(@NonNull String str) {
            LoyaltyWalletObject.this.f48782e = str;
            return this;
        }

        @NonNull
        public Builder setBarcodeAlternateText(@NonNull String str) {
            LoyaltyWalletObject.this.f48783f = str;
            return this;
        }

        @NonNull
        @Deprecated
        public Builder setBarcodeLabel(@NonNull String str) {
            LoyaltyWalletObject.this.f48786i = str;
            return this;
        }

        @NonNull
        public Builder setBarcodeType(@NonNull String str) {
            LoyaltyWalletObject.this.f48784g = str;
            return this;
        }

        @NonNull
        public Builder setBarcodeValue(@NonNull String str) {
            LoyaltyWalletObject.this.f48785h = str;
            return this;
        }

        @NonNull
        public Builder setClassId(@NonNull String str) {
            LoyaltyWalletObject.this.f48787j = str;
            return this;
        }

        @NonNull
        public Builder setId(@NonNull String str) {
            LoyaltyWalletObject.this.f48778a = str;
            return this;
        }

        @NonNull
        @Deprecated
        public Builder setInfoModuleDataHexBackgroundColor(@NonNull String str) {
            LoyaltyWalletObject.this.f48793p = str;
            return this;
        }

        @NonNull
        @Deprecated
        public Builder setInfoModuleDataHexFontColor(@NonNull String str) {
            LoyaltyWalletObject.this.f48792o = str;
            return this;
        }

        @NonNull
        public Builder setInfoModuleDataShowLastUpdateTime(boolean z) {
            LoyaltyWalletObject.this.f48795r = z;
            return this;
        }

        @NonNull
        public Builder setIssuerName(@NonNull String str) {
            LoyaltyWalletObject.this.f48780c = str;
            return this;
        }

        @NonNull
        public Builder setLoyaltyPoints(@NonNull LoyaltyPoints loyaltyPoints) {
            LoyaltyWalletObject.this.f48799v = loyaltyPoints;
            return this;
        }

        @NonNull
        public Builder setProgramName(@NonNull String str) {
            LoyaltyWalletObject.this.f48781d = str;
            return this;
        }

        @NonNull
        public Builder setState(int i) {
            LoyaltyWalletObject.this.f48788k = i;
            return this;
        }

        @NonNull
        public Builder setValidTimeInterval(@NonNull TimeInterval timeInterval) {
            LoyaltyWalletObject.this.f48790m = timeInterval;
            return this;
        }
    }

    public LoyaltyWalletObject() {
        this.f48789l = ArrayUtils.newArrayList();
        this.f48791n = ArrayUtils.newArrayList();
        this.f48794q = ArrayUtils.newArrayList();
        this.f48796s = ArrayUtils.newArrayList();
        this.f48797t = ArrayUtils.newArrayList();
        this.f48798u = ArrayUtils.newArrayList();
    }

    @NonNull
    public static Builder newBuilder() {
        return new Builder(null);
    }

    @NonNull
    public String getAccountId() {
        return this.f48779b;
    }

    @NonNull
    public String getAccountName() {
        return this.f48782e;
    }

    @NonNull
    public String getBarcodeAlternateText() {
        return this.f48783f;
    }

    @NonNull
    @Deprecated
    public String getBarcodeLabel() {
        return this.f48786i;
    }

    @NonNull
    public String getBarcodeType() {
        return this.f48784g;
    }

    @NonNull
    public String getBarcodeValue() {
        return this.f48785h;
    }

    @NonNull
    public String getClassId() {
        return this.f48787j;
    }

    @NonNull
    public String getId() {
        return this.f48778a;
    }

    @NonNull
    public ArrayList<UriData> getImageModuleDataMainImageUris() {
        return this.f48796s;
    }

    @NonNull
    @Deprecated
    public String getInfoModuleDataHexBackgroundColor() {
        return this.f48793p;
    }

    @NonNull
    @Deprecated
    public String getInfoModuleDataHexFontColor() {
        return this.f48792o;
    }

    @NonNull
    public ArrayList<LabelValueRow> getInfoModuleDataLabelValueRows() {
        return this.f48794q;
    }

    public boolean getInfoModuleDataShowLastUpdateTime() {
        return this.f48795r;
    }

    @NonNull
    public String getIssuerName() {
        return this.f48780c;
    }

    @NonNull
    public ArrayList<UriData> getLinksModuleDataUris() {
        return this.f48798u;
    }

    @NonNull
    public ArrayList<LatLng> getLocations() {
        return this.f48791n;
    }

    @NonNull
    public LoyaltyPoints getLoyaltyPoints() {
        return this.f48799v;
    }

    @NonNull
    public ArrayList<WalletObjectMessage> getMessages() {
        return this.f48789l;
    }

    @NonNull
    public String getProgramName() {
        return this.f48781d;
    }

    public int getState() {
        return this.f48788k;
    }

    @NonNull
    public ArrayList<TextModuleData> getTextModulesData() {
        return this.f48797t;
    }

    @NonNull
    public TimeInterval getValidTimeInterval() {
        return this.f48790m;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, this.f48778a, false);
        SafeParcelWriter.writeString(parcel, 3, this.f48779b, false);
        SafeParcelWriter.writeString(parcel, 4, this.f48780c, false);
        SafeParcelWriter.writeString(parcel, 5, this.f48781d, false);
        SafeParcelWriter.writeString(parcel, 6, this.f48782e, false);
        SafeParcelWriter.writeString(parcel, 7, this.f48783f, false);
        SafeParcelWriter.writeString(parcel, 8, this.f48784g, false);
        SafeParcelWriter.writeString(parcel, 9, this.f48785h, false);
        SafeParcelWriter.writeString(parcel, 10, this.f48786i, false);
        SafeParcelWriter.writeString(parcel, 11, this.f48787j, false);
        SafeParcelWriter.writeInt(parcel, 12, this.f48788k);
        SafeParcelWriter.writeTypedList(parcel, 13, this.f48789l, false);
        SafeParcelWriter.writeParcelable(parcel, 14, this.f48790m, i, false);
        SafeParcelWriter.writeTypedList(parcel, 15, this.f48791n, false);
        SafeParcelWriter.writeString(parcel, 16, this.f48792o, false);
        SafeParcelWriter.writeString(parcel, 17, this.f48793p, false);
        SafeParcelWriter.writeTypedList(parcel, 18, this.f48794q, false);
        SafeParcelWriter.writeBoolean(parcel, 19, this.f48795r);
        SafeParcelWriter.writeTypedList(parcel, 20, this.f48796s, false);
        SafeParcelWriter.writeTypedList(parcel, 21, this.f48797t, false);
        SafeParcelWriter.writeTypedList(parcel, 22, this.f48798u, false);
        SafeParcelWriter.writeParcelable(parcel, 23, this.f48799v, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public LoyaltyWalletObject(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, int i, ArrayList arrayList, TimeInterval timeInterval, ArrayList arrayList2, String str11, String str12, ArrayList arrayList3, boolean z, ArrayList arrayList4, ArrayList arrayList5, ArrayList arrayList6, LoyaltyPoints loyaltyPoints) {
        this.f48778a = str;
        this.f48779b = str2;
        this.f48780c = str3;
        this.f48781d = str4;
        this.f48782e = str5;
        this.f48783f = str6;
        this.f48784g = str7;
        this.f48785h = str8;
        this.f48786i = str9;
        this.f48787j = str10;
        this.f48788k = i;
        this.f48789l = arrayList;
        this.f48790m = timeInterval;
        this.f48791n = arrayList2;
        this.f48792o = str11;
        this.f48793p = str12;
        this.f48794q = arrayList3;
        this.f48795r = z;
        this.f48796s = arrayList4;
        this.f48797t = arrayList5;
        this.f48798u = arrayList6;
        this.f48799v = loyaltyPoints;
    }
}