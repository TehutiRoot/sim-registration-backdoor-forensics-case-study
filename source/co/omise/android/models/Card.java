package co.omise.android.models;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.autofill.HintConstants;
import ch.qos.logback.core.CoreConstants;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.android.parcel.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.joda.time.DateTime;

@Parcelize
@Metadata(m28851d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b9\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bß\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0017\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u000f¢\u0006\u0002\u0010\u0019J\u000b\u0010:\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010<\u001a\u00020\u000fHÆ\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010?\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010@\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010A\u001a\u00020\u000fHÆ\u0003J\u000b\u0010B\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010C\u001a\u0004\u0018\u00010\u0017HÆ\u0003J\t\u0010D\u001a\u00020\u000fHÆ\u0003J\u000b\u0010E\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010F\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010G\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010H\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010I\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010J\u001a\u00020\nHÆ\u0003J\t\u0010K\u001a\u00020\nHÆ\u0003J\u000b\u0010L\u001a\u0004\u0018\u00010\u0003HÆ\u0003Jã\u0001\u0010M\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0014\u001a\u00020\u000f2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u000fHÆ\u0001J\t\u0010N\u001a\u00020\nHÖ\u0001J\u0013\u0010O\u001a\u00020\u000f2\b\u0010P\u001a\u0004\u0018\u00010QHÖ\u0003J\t\u0010R\u001a\u00020\nHÖ\u0001J\t\u0010S\u001a\u00020\u0003HÖ\u0001J\u0019\u0010T\u001a\u00020U2\u0006\u0010V\u001a\u00020W2\u0006\u0010X\u001a\u00020\nHÖ\u0001R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001bR\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001a\u0010\u0018\u001a\u00020\u000fX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0016\u0010\u000b\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010(R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u001bR\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u001bR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0003X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010\u001b\"\u0004\b-\u0010.R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b/\u0010\u001bR\u001a\u0010\u0014\u001a\u00020\u000fX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u0010$\"\u0004\b1\u0010&R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u0003X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b2\u0010\u001b\"\u0004\b3\u0010.R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0003X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u0010\u001b\"\u0004\b5\u0010.R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b6\u0010\u001bR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b7\u0010\u001bR\u0016\u0010\u000e\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b8\u0010$R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b9\u0010\u001b¨\u0006Y"}, m28850d2 = {"Lco/omise/android/models/Card;", "Lco/omise/android/models/Model;", "country", "", "city", HintConstants.AUTOFILL_HINT_POSTAL_CODE, "financing", "lastDigits", "brand", "expirationMonth", "", "expirationYear", "fingerprint", "name", "securityCodeCheck", "", "bank", "tokenizationMethod", "modelObject", "id", "livemode", FirebaseAnalytics.Param.LOCATION, "created", "Lorg/joda/time/DateTime;", "deleted", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Lorg/joda/time/DateTime;Z)V", "getBank", "()Ljava/lang/String;", "getBrand", "getCity", "getCountry", "getCreated", "()Lorg/joda/time/DateTime;", "setCreated", "(Lorg/joda/time/DateTime;)V", "getDeleted", "()Z", "setDeleted", "(Z)V", "getExpirationMonth", "()I", "getExpirationYear", "getFinancing", "getFingerprint", "getId", "setId", "(Ljava/lang/String;)V", "getLastDigits", "getLivemode", "setLivemode", "getLocation", "setLocation", "getModelObject", "setModelObject", "getName", "getPostalCode", "getSecurityCodeCheck", "getTokenizationMethod", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "sdk_productionRelease"}, m28849k = 1, m28848mv = {1, 7, 1}, m28846xi = 48)
/* loaded from: classes3.dex */
public final class Card implements Model {
    @NotNull
    public static final Parcelable.Creator<Card> CREATOR = new Creator();
    @Nullable
    private final String bank;
    @Nullable
    private final String brand;
    @Nullable
    private final String city;
    @Nullable
    private final String country;
    @Nullable
    private DateTime created;
    private boolean deleted;
    @JsonProperty("expiration_month")
    private final int expirationMonth;
    @JsonProperty("expiration_year")
    private final int expirationYear;
    @Nullable
    private final String financing;
    @Nullable
    private final String fingerprint;
    @Nullable

    /* renamed from: id */
    private String f40257id;
    @JsonProperty("last_digits")
    @Nullable
    private final String lastDigits;
    private boolean livemode;
    @Nullable
    private String location;
    @Nullable
    private String modelObject;
    @Nullable
    private final String name;
    @JsonProperty("postal_code")
    @Nullable
    private final String postalCode;
    @JsonProperty("security_code_check")
    private final boolean securityCodeCheck;
    @JsonProperty("tokenization_method")
    @Nullable
    private final String tokenizationMethod;

    @Metadata(m28849k = 3, m28848mv = {1, 7, 1}, m28846xi = 48)
    /* loaded from: classes3.dex */
    public static final class Creator implements Parcelable.Creator<Card> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final Card createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new Card(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readString(), (DateTime) parcel.readSerializable(), parcel.readInt() != 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final Card[] newArray(int i) {
            return new Card[i];
        }
    }

    public Card() {
        this(null, null, null, null, null, null, 0, 0, null, null, false, null, null, null, null, false, null, null, false, 524287, null);
    }

    @Nullable
    public final String component1() {
        return this.country;
    }

    @Nullable
    public final String component10() {
        return this.name;
    }

    public final boolean component11() {
        return this.securityCodeCheck;
    }

    @Nullable
    public final String component12() {
        return this.bank;
    }

    @Nullable
    public final String component13() {
        return this.tokenizationMethod;
    }

    @Nullable
    public final String component14() {
        return getModelObject();
    }

    @Nullable
    public final String component15() {
        return getId();
    }

    public final boolean component16() {
        return getLivemode();
    }

    @Nullable
    public final String component17() {
        return getLocation();
    }

    @Nullable
    public final DateTime component18() {
        return getCreated();
    }

    public final boolean component19() {
        return getDeleted();
    }

    @Nullable
    public final String component2() {
        return this.city;
    }

    @Nullable
    public final String component3() {
        return this.postalCode;
    }

    @Nullable
    public final String component4() {
        return this.financing;
    }

    @Nullable
    public final String component5() {
        return this.lastDigits;
    }

    @Nullable
    public final String component6() {
        return this.brand;
    }

    public final int component7() {
        return this.expirationMonth;
    }

    public final int component8() {
        return this.expirationYear;
    }

    @Nullable
    public final String component9() {
        return this.fingerprint;
    }

    @NotNull
    public final Card copy(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, int i, int i2, @Nullable String str7, @Nullable String str8, boolean z, @Nullable String str9, @Nullable String str10, @Nullable String str11, @Nullable String str12, boolean z2, @Nullable String str13, @Nullable DateTime dateTime, boolean z3) {
        return new Card(str, str2, str3, str4, str5, str6, i, i2, str7, str8, z, str9, str10, str11, str12, z2, str13, dateTime, z3);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Card) {
            Card card = (Card) obj;
            return Intrinsics.areEqual(this.country, card.country) && Intrinsics.areEqual(this.city, card.city) && Intrinsics.areEqual(this.postalCode, card.postalCode) && Intrinsics.areEqual(this.financing, card.financing) && Intrinsics.areEqual(this.lastDigits, card.lastDigits) && Intrinsics.areEqual(this.brand, card.brand) && this.expirationMonth == card.expirationMonth && this.expirationYear == card.expirationYear && Intrinsics.areEqual(this.fingerprint, card.fingerprint) && Intrinsics.areEqual(this.name, card.name) && this.securityCodeCheck == card.securityCodeCheck && Intrinsics.areEqual(this.bank, card.bank) && Intrinsics.areEqual(this.tokenizationMethod, card.tokenizationMethod) && Intrinsics.areEqual(getModelObject(), card.getModelObject()) && Intrinsics.areEqual(getId(), card.getId()) && getLivemode() == card.getLivemode() && Intrinsics.areEqual(getLocation(), card.getLocation()) && Intrinsics.areEqual(getCreated(), card.getCreated()) && getDeleted() == card.getDeleted();
        }
        return false;
    }

    @Nullable
    public final String getBank() {
        return this.bank;
    }

    @Nullable
    public final String getBrand() {
        return this.brand;
    }

    @Nullable
    public final String getCity() {
        return this.city;
    }

    @Nullable
    public final String getCountry() {
        return this.country;
    }

    @Override // co.omise.android.models.Model
    @Nullable
    public DateTime getCreated() {
        return this.created;
    }

    @Override // co.omise.android.models.Model
    public boolean getDeleted() {
        return this.deleted;
    }

    public final int getExpirationMonth() {
        return this.expirationMonth;
    }

    public final int getExpirationYear() {
        return this.expirationYear;
    }

    @Nullable
    public final String getFinancing() {
        return this.financing;
    }

    @Nullable
    public final String getFingerprint() {
        return this.fingerprint;
    }

    @Override // co.omise.android.models.Model
    @Nullable
    public String getId() {
        return this.f40257id;
    }

    @Nullable
    public final String getLastDigits() {
        return this.lastDigits;
    }

    @Override // co.omise.android.models.Model
    public boolean getLivemode() {
        return this.livemode;
    }

    @Override // co.omise.android.models.Model
    @Nullable
    public String getLocation() {
        return this.location;
    }

    @Override // co.omise.android.models.Model
    @Nullable
    public String getModelObject() {
        return this.modelObject;
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    @Nullable
    public final String getPostalCode() {
        return this.postalCode;
    }

    public final boolean getSecurityCodeCheck() {
        return this.securityCodeCheck;
    }

    @Nullable
    public final String getTokenizationMethod() {
        return this.tokenizationMethod;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        String str = this.country;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.city;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.postalCode;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.financing;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.lastDigits;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.brand;
        int hashCode6 = (((((hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31) + this.expirationMonth) * 31) + this.expirationYear) * 31;
        String str7 = this.fingerprint;
        int hashCode7 = (hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.name;
        int hashCode8 = (hashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        boolean z = this.securityCodeCheck;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode8 + i) * 31;
        String str9 = this.bank;
        int hashCode9 = (i2 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.tokenizationMethod;
        int hashCode10 = (((((hashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31) + (getModelObject() == null ? 0 : getModelObject().hashCode())) * 31) + (getId() == null ? 0 : getId().hashCode())) * 31;
        boolean livemode = getLivemode();
        int i3 = livemode;
        if (livemode) {
            i3 = 1;
        }
        int hashCode11 = (((((hashCode10 + i3) * 31) + (getLocation() == null ? 0 : getLocation().hashCode())) * 31) + (getCreated() != null ? getCreated().hashCode() : 0)) * 31;
        boolean deleted = getDeleted();
        return hashCode11 + (deleted ? 1 : deleted);
    }

    public void setCreated(@Nullable DateTime dateTime) {
        this.created = dateTime;
    }

    public void setDeleted(boolean z) {
        this.deleted = z;
    }

    public void setId(@Nullable String str) {
        this.f40257id = str;
    }

    public void setLivemode(boolean z) {
        this.livemode = z;
    }

    public void setLocation(@Nullable String str) {
        this.location = str;
    }

    public void setModelObject(@Nullable String str) {
        this.modelObject = str;
    }

    @NotNull
    public String toString() {
        return "Card(country=" + this.country + ", city=" + this.city + ", postalCode=" + this.postalCode + ", financing=" + this.financing + ", lastDigits=" + this.lastDigits + ", brand=" + this.brand + ", expirationMonth=" + this.expirationMonth + ", expirationYear=" + this.expirationYear + ", fingerprint=" + this.fingerprint + ", name=" + this.name + ", securityCodeCheck=" + this.securityCodeCheck + ", bank=" + this.bank + ", tokenizationMethod=" + this.tokenizationMethod + ", modelObject=" + getModelObject() + ", id=" + getId() + ", livemode=" + getLivemode() + ", location=" + getLocation() + ", created=" + getCreated() + ", deleted=" + getDeleted() + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(this.country);
        out.writeString(this.city);
        out.writeString(this.postalCode);
        out.writeString(this.financing);
        out.writeString(this.lastDigits);
        out.writeString(this.brand);
        out.writeInt(this.expirationMonth);
        out.writeInt(this.expirationYear);
        out.writeString(this.fingerprint);
        out.writeString(this.name);
        out.writeInt(this.securityCodeCheck ? 1 : 0);
        out.writeString(this.bank);
        out.writeString(this.tokenizationMethod);
        out.writeString(this.modelObject);
        out.writeString(this.f40257id);
        out.writeInt(this.livemode ? 1 : 0);
        out.writeString(this.location);
        out.writeSerializable(this.created);
        out.writeInt(this.deleted ? 1 : 0);
    }

    public Card(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, int i, int i2, @Nullable String str7, @Nullable String str8, boolean z, @Nullable String str9, @Nullable String str10, @Nullable String str11, @Nullable String str12, boolean z2, @Nullable String str13, @Nullable DateTime dateTime, boolean z3) {
        this.country = str;
        this.city = str2;
        this.postalCode = str3;
        this.financing = str4;
        this.lastDigits = str5;
        this.brand = str6;
        this.expirationMonth = i;
        this.expirationYear = i2;
        this.fingerprint = str7;
        this.name = str8;
        this.securityCodeCheck = z;
        this.bank = str9;
        this.tokenizationMethod = str10;
        this.modelObject = str11;
        this.f40257id = str12;
        this.livemode = z2;
        this.location = str13;
        this.created = dateTime;
        this.deleted = z3;
    }

    public /* synthetic */ Card(String str, String str2, String str3, String str4, String str5, String str6, int i, int i2, String str7, String str8, boolean z, String str9, String str10, String str11, String str12, boolean z2, String str13, DateTime dateTime, boolean z3, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? null : str, (i3 & 2) != 0 ? null : str2, (i3 & 4) != 0 ? null : str3, (i3 & 8) != 0 ? null : str4, (i3 & 16) != 0 ? null : str5, (i3 & 32) != 0 ? null : str6, (i3 & 64) != 0 ? 0 : i, (i3 & 128) != 0 ? 0 : i2, (i3 & 256) != 0 ? null : str7, (i3 & 512) != 0 ? null : str8, (i3 & 1024) != 0 ? false : z, (i3 & 2048) != 0 ? null : str9, (i3 & 4096) != 0 ? null : str10, (i3 & 8192) != 0 ? null : str11, (i3 & 16384) != 0 ? null : str12, (i3 & 32768) != 0 ? false : z2, (i3 & 65536) != 0 ? null : str13, (i3 & 131072) != 0 ? null : dateTime, (i3 & 262144) != 0 ? false : z3);
    }
}
