package co.omise.android.models;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.CoreConstants;
import co.omise.android.models.SourceType;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.android.parcel.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.joda.time.DateTime;

@Parcelize
@Metadata(m28851d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b2\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 M2\u00020\u0001:\u0001MB©\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u000f¢\u0006\u0002\u0010\u0014J\u000b\u00105\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u0012HÆ\u0003J\t\u00108\u001a\u00020\u000fHÆ\u0003J\u0011\u00109\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005HÆ\u0003J\u0011\u0010:\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005HÆ\u0003J\u0011\u0010;\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0005HÆ\u0003J\u0011\u0010<\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0005HÆ\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010?\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010@\u001a\u00020\u000fHÆ\u0003J\u00ad\u0001\u0010A\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00052\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00052\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00052\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u000fHÆ\u0001J\t\u0010B\u001a\u00020\bHÖ\u0001J\u0013\u0010C\u001a\u00020\u000f2\b\u0010D\u001a\u0004\u0018\u00010EHÖ\u0003J\t\u0010F\u001a\u00020\bHÖ\u0001J\t\u0010G\u001a\u00020\u0003HÖ\u0001J\u0019\u0010H\u001a\u00020I2\u0006\u0010J\u001a\u00020K2\u0006\u0010L\u001a\u00020\bHÖ\u0001R\"\u0010\t\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R&\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0016\"\u0004\b\u001a\u0010\u0018R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\"\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0016\"\u0004\b \u0010\u0018R\u001a\u0010\u0013\u001a\u00020\u000fX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u001c\u0010\r\u001a\u0004\u0018\u00010\u0003X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R&\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u0016\"\u0004\b*\u0010\u0018R\u001a\u0010\u000e\u001a\u00020\u000fX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\"\"\u0004\b,\u0010$R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0003X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010&\"\u0004\b.\u0010(R\u001c\u0010\f\u001a\u0004\u0018\u00010\u0003X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u0010&\"\u0004\b0\u0010(R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u0010&\"\u0004\b2\u0010(R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b3\u0010&\"\u0004\b4\u0010(¨\u0006N"}, m28850d2 = {"Lco/omise/android/models/PaymentMethod;", "Lco/omise/android/models/Model;", "name", "", "currencies", "", "cardBrands", "installmentTerms", "", "banks", "Lco/omise/android/models/Bank;", "provider", "modelObject", "id", "livemode", "", FirebaseAnalytics.Param.LOCATION, "created", "Lorg/joda/time/DateTime;", "deleted", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Lorg/joda/time/DateTime;Z)V", "getBanks", "()Ljava/util/List;", "setBanks", "(Ljava/util/List;)V", "getCardBrands", "setCardBrands", "getCreated", "()Lorg/joda/time/DateTime;", "setCreated", "(Lorg/joda/time/DateTime;)V", "getCurrencies", "setCurrencies", "getDeleted", "()Z", "setDeleted", "(Z)V", "getId", "()Ljava/lang/String;", "setId", "(Ljava/lang/String;)V", "getInstallmentTerms", "setInstallmentTerms", "getLivemode", "setLivemode", "getLocation", "setLocation", "getModelObject", "setModelObject", "getName", "setName", "getProvider", "setProvider", "component1", "component10", "component11", "component12", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "sdk_productionRelease"}, m28849k = 1, m28848mv = {1, 7, 1}, m28846xi = 48)
/* loaded from: classes3.dex */
public final class PaymentMethod implements Model {
    @Nullable
    private List<Bank> banks;
    @JsonProperty("card_brands")
    @Nullable
    private List<String> cardBrands;
    @Nullable
    private DateTime created;
    @Nullable
    private List<String> currencies;
    private boolean deleted;
    @Nullable

    /* renamed from: id */
    private String f40260id;
    @JsonProperty("installment_terms")
    @Nullable
    private List<Integer> installmentTerms;
    private boolean livemode;
    @Nullable
    private String location;
    @Nullable
    private String modelObject;
    @Nullable
    private String name;
    @Nullable
    private String provider;
    @NotNull
    public static final Companion Companion = new Companion(null);
    @NotNull
    public static final Parcelable.Creator<PaymentMethod> CREATOR = new Creator();

    @Metadata(m28851d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\nH\u0007¨\u0006\u000b"}, m28850d2 = {"Lco/omise/android/models/PaymentMethod$Companion;", "", "()V", "createCreditCardMethod", "Lco/omise/android/models/PaymentMethod;", "createSourceTypeMethod", "sourceType", "Lco/omise/android/models/SourceType;", "createTokenizationMethod", "tokenizationMethod", "Lco/omise/android/models/TokenizationMethod;", "sdk_productionRelease"}, m28849k = 1, m28848mv = {1, 7, 1}, m28846xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final PaymentMethod createCreditCardMethod() {
            return new PaymentMethod("card", null, null, null, null, null, null, null, false, null, null, false, 4094, null);
        }

        @JvmStatic
        @NotNull
        public final PaymentMethod createSourceTypeMethod(@NotNull SourceType sourceType) {
            List<Bank> list;
            String str;
            String provider;
            Intrinsics.checkNotNullParameter(sourceType, "sourceType");
            String name = sourceType.getName();
            List emptyList = CollectionsKt__CollectionsKt.emptyList();
            if (sourceType instanceof SourceType.Fpx) {
                list = ((SourceType.Fpx) sourceType).getBanks();
            } else {
                list = null;
            }
            if (sourceType instanceof SourceType.TouchNGo) {
                provider = ((SourceType.TouchNGo) sourceType).getProvider();
            } else if (sourceType instanceof SourceType.GrabPay) {
                provider = ((SourceType.GrabPay) sourceType).getProvider();
            } else {
                str = null;
                return new PaymentMethod(name, null, null, emptyList, list, str, null, null, false, null, null, false, 4038, null);
            }
            str = provider;
            return new PaymentMethod(name, null, null, emptyList, list, str, null, null, false, null, null, false, 4038, null);
        }

        @JvmStatic
        @NotNull
        public final PaymentMethod createTokenizationMethod(@NotNull TokenizationMethod tokenizationMethod) {
            Intrinsics.checkNotNullParameter(tokenizationMethod, "tokenizationMethod");
            return new PaymentMethod(tokenizationMethod.getName(), null, null, null, null, null, null, null, false, null, null, false, 4094, null);
        }

        private Companion() {
        }
    }

    @Metadata(m28849k = 3, m28848mv = {1, 7, 1}, m28846xi = 48)
    /* loaded from: classes3.dex */
    public static final class Creator implements Parcelable.Creator<PaymentMethod> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final PaymentMethod createFromParcel(@NotNull Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String readString = parcel.readString();
            ArrayList<String> createStringArrayList = parcel.createStringArrayList();
            ArrayList<String> createStringArrayList2 = parcel.createStringArrayList();
            ArrayList arrayList2 = null;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                for (int i = 0; i != readInt; i++) {
                    arrayList.add(Integer.valueOf(parcel.readInt()));
                }
            }
            if (parcel.readInt() != 0) {
                int readInt2 = parcel.readInt();
                arrayList2 = new ArrayList(readInt2);
                for (int i2 = 0; i2 != readInt2; i2++) {
                    arrayList2.add(Bank.CREATOR.createFromParcel(parcel));
                }
            }
            return new PaymentMethod(readString, createStringArrayList, createStringArrayList2, arrayList, arrayList2, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readString(), (DateTime) parcel.readSerializable(), parcel.readInt() != 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final PaymentMethod[] newArray(int i) {
            return new PaymentMethod[i];
        }
    }

    public PaymentMethod() {
        this(null, null, null, null, null, null, null, null, false, null, null, false, 4095, null);
    }

    @JvmStatic
    @NotNull
    public static final PaymentMethod createCreditCardMethod() {
        return Companion.createCreditCardMethod();
    }

    @JvmStatic
    @NotNull
    public static final PaymentMethod createSourceTypeMethod(@NotNull SourceType sourceType) {
        return Companion.createSourceTypeMethod(sourceType);
    }

    @JvmStatic
    @NotNull
    public static final PaymentMethod createTokenizationMethod(@NotNull TokenizationMethod tokenizationMethod) {
        return Companion.createTokenizationMethod(tokenizationMethod);
    }

    @Nullable
    public final String component1() {
        return this.name;
    }

    @Nullable
    public final String component10() {
        return getLocation();
    }

    @Nullable
    public final DateTime component11() {
        return getCreated();
    }

    public final boolean component12() {
        return getDeleted();
    }

    @Nullable
    public final List<String> component2() {
        return this.currencies;
    }

    @Nullable
    public final List<String> component3() {
        return this.cardBrands;
    }

    @Nullable
    public final List<Integer> component4() {
        return this.installmentTerms;
    }

    @Nullable
    public final List<Bank> component5() {
        return this.banks;
    }

    @Nullable
    public final String component6() {
        return this.provider;
    }

    @Nullable
    public final String component7() {
        return getModelObject();
    }

    @Nullable
    public final String component8() {
        return getId();
    }

    public final boolean component9() {
        return getLivemode();
    }

    @NotNull
    public final PaymentMethod copy(@Nullable String str, @Nullable List<String> list, @Nullable List<String> list2, @Nullable List<Integer> list3, @Nullable List<Bank> list4, @Nullable String str2, @Nullable String str3, @Nullable String str4, boolean z, @Nullable String str5, @Nullable DateTime dateTime, boolean z2) {
        return new PaymentMethod(str, list, list2, list3, list4, str2, str3, str4, z, str5, dateTime, z2);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PaymentMethod) {
            PaymentMethod paymentMethod = (PaymentMethod) obj;
            return Intrinsics.areEqual(this.name, paymentMethod.name) && Intrinsics.areEqual(this.currencies, paymentMethod.currencies) && Intrinsics.areEqual(this.cardBrands, paymentMethod.cardBrands) && Intrinsics.areEqual(this.installmentTerms, paymentMethod.installmentTerms) && Intrinsics.areEqual(this.banks, paymentMethod.banks) && Intrinsics.areEqual(this.provider, paymentMethod.provider) && Intrinsics.areEqual(getModelObject(), paymentMethod.getModelObject()) && Intrinsics.areEqual(getId(), paymentMethod.getId()) && getLivemode() == paymentMethod.getLivemode() && Intrinsics.areEqual(getLocation(), paymentMethod.getLocation()) && Intrinsics.areEqual(getCreated(), paymentMethod.getCreated()) && getDeleted() == paymentMethod.getDeleted();
        }
        return false;
    }

    @Nullable
    public final List<Bank> getBanks() {
        return this.banks;
    }

    @Nullable
    public final List<String> getCardBrands() {
        return this.cardBrands;
    }

    @Override // co.omise.android.models.Model
    @Nullable
    public DateTime getCreated() {
        return this.created;
    }

    @Nullable
    public final List<String> getCurrencies() {
        return this.currencies;
    }

    @Override // co.omise.android.models.Model
    public boolean getDeleted() {
        return this.deleted;
    }

    @Override // co.omise.android.models.Model
    @Nullable
    public String getId() {
        return this.f40260id;
    }

    @Nullable
    public final List<Integer> getInstallmentTerms() {
        return this.installmentTerms;
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
    public final String getProvider() {
        return this.provider;
    }

    public int hashCode() {
        String str = this.name;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<String> list = this.currencies;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<String> list2 = this.cardBrands;
        int hashCode3 = (hashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<Integer> list3 = this.installmentTerms;
        int hashCode4 = (hashCode3 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List<Bank> list4 = this.banks;
        int hashCode5 = (hashCode4 + (list4 == null ? 0 : list4.hashCode())) * 31;
        String str2 = this.provider;
        int hashCode6 = (((((hashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31) + (getModelObject() == null ? 0 : getModelObject().hashCode())) * 31) + (getId() == null ? 0 : getId().hashCode())) * 31;
        boolean livemode = getLivemode();
        int i = livemode;
        if (livemode) {
            i = 1;
        }
        int hashCode7 = (((((hashCode6 + i) * 31) + (getLocation() == null ? 0 : getLocation().hashCode())) * 31) + (getCreated() != null ? getCreated().hashCode() : 0)) * 31;
        boolean deleted = getDeleted();
        return hashCode7 + (deleted ? 1 : deleted);
    }

    public final void setBanks(@Nullable List<Bank> list) {
        this.banks = list;
    }

    public final void setCardBrands(@Nullable List<String> list) {
        this.cardBrands = list;
    }

    public void setCreated(@Nullable DateTime dateTime) {
        this.created = dateTime;
    }

    public final void setCurrencies(@Nullable List<String> list) {
        this.currencies = list;
    }

    public void setDeleted(boolean z) {
        this.deleted = z;
    }

    public void setId(@Nullable String str) {
        this.f40260id = str;
    }

    public final void setInstallmentTerms(@Nullable List<Integer> list) {
        this.installmentTerms = list;
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

    public final void setName(@Nullable String str) {
        this.name = str;
    }

    public final void setProvider(@Nullable String str) {
        this.provider = str;
    }

    @NotNull
    public String toString() {
        return "PaymentMethod(name=" + this.name + ", currencies=" + this.currencies + ", cardBrands=" + this.cardBrands + ", installmentTerms=" + this.installmentTerms + ", banks=" + this.banks + ", provider=" + this.provider + ", modelObject=" + getModelObject() + ", id=" + getId() + ", livemode=" + getLivemode() + ", location=" + getLocation() + ", created=" + getCreated() + ", deleted=" + getDeleted() + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(this.name);
        out.writeStringList(this.currencies);
        out.writeStringList(this.cardBrands);
        List<Integer> list = this.installmentTerms;
        if (list == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(list.size());
            for (Integer num : list) {
                out.writeInt(num.intValue());
            }
        }
        List<Bank> list2 = this.banks;
        if (list2 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(list2.size());
            for (Bank bank : list2) {
                bank.writeToParcel(out, i);
            }
        }
        out.writeString(this.provider);
        out.writeString(this.modelObject);
        out.writeString(this.f40260id);
        out.writeInt(this.livemode ? 1 : 0);
        out.writeString(this.location);
        out.writeSerializable(this.created);
        out.writeInt(this.deleted ? 1 : 0);
    }

    public PaymentMethod(@Nullable String str, @Nullable List<String> list, @Nullable List<String> list2, @Nullable List<Integer> list3, @Nullable List<Bank> list4, @Nullable String str2, @Nullable String str3, @Nullable String str4, boolean z, @Nullable String str5, @Nullable DateTime dateTime, boolean z2) {
        this.name = str;
        this.currencies = list;
        this.cardBrands = list2;
        this.installmentTerms = list3;
        this.banks = list4;
        this.provider = str2;
        this.modelObject = str3;
        this.f40260id = str4;
        this.livemode = z;
        this.location = str5;
        this.created = dateTime;
        this.deleted = z2;
    }

    public /* synthetic */ PaymentMethod(String str, List list, List list2, List list3, List list4, String str2, String str3, String str4, boolean z, String str5, DateTime dateTime, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : list, (i & 4) != 0 ? null : list2, (i & 8) != 0 ? null : list3, (i & 16) != 0 ? null : list4, (i & 32) != 0 ? null : str2, (i & 64) != 0 ? null : str3, (i & 128) != 0 ? null : str4, (i & 256) != 0 ? false : z, (i & 512) != 0 ? null : str5, (i & 1024) == 0 ? dateTime : null, (i & 2048) == 0 ? z2 : false);
    }
}
