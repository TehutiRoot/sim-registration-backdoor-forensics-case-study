package th.p047co.dtac.android.dtacone.model.sim_activation.check;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.autofill.HintConstants;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.i18n.MessageBundle;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.view.fragment.mrtr_prepaid_registration.family_sim.InputPostpaidFamilySimSubscriberFragment;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b/\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 I2\u00020\u0001:\u0001IB\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004BÑ\u0001\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0018J\u000b\u0010,\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\u000fHÆ\u0003JÕ\u0001\u0010=\u001a\u00020\u00002\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\b\u0010>\u001a\u00020?H\u0016J\u0013\u0010@\u001a\u00020A2\b\u0010B\u001a\u0004\u0018\u00010CHÖ\u0003J\t\u0010D\u001a\u00020?HÖ\u0001J\t\u0010E\u001a\u00020\u0006HÖ\u0001J\u0018\u0010F\u001a\u00020G2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010H\u001a\u00020?H\u0016R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0018\u0010\f\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001aR\u0018\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001aR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001aR\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001aR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001aR\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001aR\u0018\u0010\r\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001aR\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001aR\u0018\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001aR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001aR\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u001aR\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001aR\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u001aR\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u001aR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u001a¨\u0006J"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/sim_activation/check/CheckSimActivationResponse;", "Landroid/os/Parcelable;", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "companyCode", "", "lastName", HintConstants.AUTOFILL_HINT_GENDER, "lastChangeDatetime", "channel", MessageBundle.TITLE_ENTRY, "birthDate", "identityNumberShow", "legalAddress", "Lth/co/dtac/android/dtacone/model/sim_activation/check/LegalAddress;", "simcardNumber", "simType", "firstName", "identityType", "identityNumber", "billingProductCode", "subscriberNumberShow", InputPostpaidFamilySimSubscriberFragment.SUB_NUM, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lth/co/dtac/android/dtacone/model/sim_activation/check/LegalAddress;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getBillingProductCode", "()Ljava/lang/String;", "getBirthDate", "getChannel", "getCompanyCode", "getFirstName", "getGender", "getIdentityNumber", "getIdentityNumberShow", "getIdentityType", "getLastChangeDatetime", "getLastName", "getLegalAddress", "()Lth/co/dtac/android/dtacone/model/sim_activation/check/LegalAddress;", "getSimType", "getSimcardNumber", "getSubscriberNumber", "getSubscriberNumberShow", "getTitle", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "flags", "CREATOR", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.sim_activation.check.CheckSimActivationResponse */
/* loaded from: classes8.dex */
public final class CheckSimActivationResponse implements Parcelable {
    public static final int $stable = 0;
    @NotNull
    public static final CREATOR CREATOR = new CREATOR(null);
    @SerializedName("billingProductCode")
    @Nullable
    private final String billingProductCode;
    @SerializedName("birthDate")
    @Nullable
    private final String birthDate;
    @SerializedName("channel")
    @Nullable
    private final String channel;
    @SerializedName("companyCode")
    @Nullable
    private final String companyCode;
    @SerializedName("firstName")
    @Nullable
    private final String firstName;
    @SerializedName(HintConstants.AUTOFILL_HINT_GENDER)
    @Nullable
    private final String gender;
    @SerializedName("identityNumber")
    @Nullable
    private final String identityNumber;
    @SerializedName("identityNumberShow")
    @Nullable
    private final String identityNumberShow;
    @SerializedName("identityType")
    @Nullable
    private final String identityType;
    @SerializedName("lastChangeDatetime")
    @Nullable
    private final String lastChangeDatetime;
    @SerializedName("lastName")
    @Nullable
    private final String lastName;
    @SerializedName("legalAddress")
    @Nullable
    private final LegalAddress legalAddress;
    @SerializedName("simType")
    @Nullable
    private final String simType;
    @SerializedName("simcardNumber")
    @Nullable
    private final String simcardNumber;
    @SerializedName(InputPostpaidFamilySimSubscriberFragment.SUB_NUM)
    @Nullable
    private final String subscriberNumber;
    @SerializedName("subscriberNumberShow")
    @Nullable
    private final String subscriberNumberShow;
    @SerializedName(MessageBundle.TITLE_ENTRY)
    @Nullable
    private final String title;

    @Metadata(m29143d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u001d\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016¢\u0006\u0002\u0010\u000b¨\u0006\f"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/sim_activation/check/CheckSimActivationResponse$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lth/co/dtac/android/dtacone/model/sim_activation/check/CheckSimActivationResponse;", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", "size", "", "(I)[Lth/co/dtac/android/dtacone/model/sim_activation/check/CheckSimActivationResponse;", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.model.sim_activation.check.CheckSimActivationResponse$CREATOR */
    /* loaded from: classes8.dex */
    public static final class CREATOR implements Parcelable.Creator<CheckSimActivationResponse> {
        public /* synthetic */ CREATOR(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private CREATOR() {
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        public CheckSimActivationResponse createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CheckSimActivationResponse(parcel);
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        public CheckSimActivationResponse[] newArray(int i) {
            return new CheckSimActivationResponse[i];
        }
    }

    public CheckSimActivationResponse() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 131071, null);
    }

    @Nullable
    public final String component1() {
        return this.companyCode;
    }

    @Nullable
    public final String component10() {
        return this.simcardNumber;
    }

    @Nullable
    public final String component11() {
        return this.simType;
    }

    @Nullable
    public final String component12() {
        return this.firstName;
    }

    @Nullable
    public final String component13() {
        return this.identityType;
    }

    @Nullable
    public final String component14() {
        return this.identityNumber;
    }

    @Nullable
    public final String component15() {
        return this.billingProductCode;
    }

    @Nullable
    public final String component16() {
        return this.subscriberNumberShow;
    }

    @Nullable
    public final String component17() {
        return this.subscriberNumber;
    }

    @Nullable
    public final String component2() {
        return this.lastName;
    }

    @Nullable
    public final String component3() {
        return this.gender;
    }

    @Nullable
    public final String component4() {
        return this.lastChangeDatetime;
    }

    @Nullable
    public final String component5() {
        return this.channel;
    }

    @Nullable
    public final String component6() {
        return this.title;
    }

    @Nullable
    public final String component7() {
        return this.birthDate;
    }

    @Nullable
    public final String component8() {
        return this.identityNumberShow;
    }

    @Nullable
    public final LegalAddress component9() {
        return this.legalAddress;
    }

    @NotNull
    public final CheckSimActivationResponse copy(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable LegalAddress legalAddress, @Nullable String str9, @Nullable String str10, @Nullable String str11, @Nullable String str12, @Nullable String str13, @Nullable String str14, @Nullable String str15, @Nullable String str16) {
        return new CheckSimActivationResponse(str, str2, str3, str4, str5, str6, str7, str8, legalAddress, str9, str10, str11, str12, str13, str14, str15, str16);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CheckSimActivationResponse) {
            CheckSimActivationResponse checkSimActivationResponse = (CheckSimActivationResponse) obj;
            return Intrinsics.areEqual(this.companyCode, checkSimActivationResponse.companyCode) && Intrinsics.areEqual(this.lastName, checkSimActivationResponse.lastName) && Intrinsics.areEqual(this.gender, checkSimActivationResponse.gender) && Intrinsics.areEqual(this.lastChangeDatetime, checkSimActivationResponse.lastChangeDatetime) && Intrinsics.areEqual(this.channel, checkSimActivationResponse.channel) && Intrinsics.areEqual(this.title, checkSimActivationResponse.title) && Intrinsics.areEqual(this.birthDate, checkSimActivationResponse.birthDate) && Intrinsics.areEqual(this.identityNumberShow, checkSimActivationResponse.identityNumberShow) && Intrinsics.areEqual(this.legalAddress, checkSimActivationResponse.legalAddress) && Intrinsics.areEqual(this.simcardNumber, checkSimActivationResponse.simcardNumber) && Intrinsics.areEqual(this.simType, checkSimActivationResponse.simType) && Intrinsics.areEqual(this.firstName, checkSimActivationResponse.firstName) && Intrinsics.areEqual(this.identityType, checkSimActivationResponse.identityType) && Intrinsics.areEqual(this.identityNumber, checkSimActivationResponse.identityNumber) && Intrinsics.areEqual(this.billingProductCode, checkSimActivationResponse.billingProductCode) && Intrinsics.areEqual(this.subscriberNumberShow, checkSimActivationResponse.subscriberNumberShow) && Intrinsics.areEqual(this.subscriberNumber, checkSimActivationResponse.subscriberNumber);
        }
        return false;
    }

    @Nullable
    public final String getBillingProductCode() {
        return this.billingProductCode;
    }

    @Nullable
    public final String getBirthDate() {
        return this.birthDate;
    }

    @Nullable
    public final String getChannel() {
        return this.channel;
    }

    @Nullable
    public final String getCompanyCode() {
        return this.companyCode;
    }

    @Nullable
    public final String getFirstName() {
        return this.firstName;
    }

    @Nullable
    public final String getGender() {
        return this.gender;
    }

    @Nullable
    public final String getIdentityNumber() {
        return this.identityNumber;
    }

    @Nullable
    public final String getIdentityNumberShow() {
        return this.identityNumberShow;
    }

    @Nullable
    public final String getIdentityType() {
        return this.identityType;
    }

    @Nullable
    public final String getLastChangeDatetime() {
        return this.lastChangeDatetime;
    }

    @Nullable
    public final String getLastName() {
        return this.lastName;
    }

    @Nullable
    public final LegalAddress getLegalAddress() {
        return this.legalAddress;
    }

    @Nullable
    public final String getSimType() {
        return this.simType;
    }

    @Nullable
    public final String getSimcardNumber() {
        return this.simcardNumber;
    }

    @Nullable
    public final String getSubscriberNumber() {
        return this.subscriberNumber;
    }

    @Nullable
    public final String getSubscriberNumberShow() {
        return this.subscriberNumberShow;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        String str = this.companyCode;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.lastName;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.gender;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.lastChangeDatetime;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.channel;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.title;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.birthDate;
        int hashCode7 = (hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.identityNumberShow;
        int hashCode8 = (hashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        LegalAddress legalAddress = this.legalAddress;
        int hashCode9 = (hashCode8 + (legalAddress == null ? 0 : legalAddress.hashCode())) * 31;
        String str9 = this.simcardNumber;
        int hashCode10 = (hashCode9 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.simType;
        int hashCode11 = (hashCode10 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.firstName;
        int hashCode12 = (hashCode11 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.identityType;
        int hashCode13 = (hashCode12 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.identityNumber;
        int hashCode14 = (hashCode13 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.billingProductCode;
        int hashCode15 = (hashCode14 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.subscriberNumberShow;
        int hashCode16 = (hashCode15 + (str15 == null ? 0 : str15.hashCode())) * 31;
        String str16 = this.subscriberNumber;
        return hashCode16 + (str16 != null ? str16.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.companyCode;
        String str2 = this.lastName;
        String str3 = this.gender;
        String str4 = this.lastChangeDatetime;
        String str5 = this.channel;
        String str6 = this.title;
        String str7 = this.birthDate;
        String str8 = this.identityNumberShow;
        LegalAddress legalAddress = this.legalAddress;
        String str9 = this.simcardNumber;
        String str10 = this.simType;
        String str11 = this.firstName;
        String str12 = this.identityType;
        String str13 = this.identityNumber;
        String str14 = this.billingProductCode;
        String str15 = this.subscriberNumberShow;
        String str16 = this.subscriberNumber;
        return "CheckSimActivationResponse(companyCode=" + str + ", lastName=" + str2 + ", gender=" + str3 + ", lastChangeDatetime=" + str4 + ", channel=" + str5 + ", title=" + str6 + ", birthDate=" + str7 + ", identityNumberShow=" + str8 + ", legalAddress=" + legalAddress + ", simcardNumber=" + str9 + ", simType=" + str10 + ", firstName=" + str11 + ", identityType=" + str12 + ", identityNumber=" + str13 + ", billingProductCode=" + str14 + ", subscriberNumberShow=" + str15 + ", subscriberNumber=" + str16 + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.writeString(this.companyCode);
        parcel.writeString(this.lastName);
        parcel.writeString(this.gender);
        parcel.writeString(this.lastChangeDatetime);
        parcel.writeString(this.channel);
        parcel.writeString(this.title);
        parcel.writeString(this.birthDate);
        parcel.writeString(this.identityNumberShow);
        parcel.writeParcelable(this.legalAddress, i);
        parcel.writeString(this.simcardNumber);
        parcel.writeString(this.simType);
        parcel.writeString(this.firstName);
        parcel.writeString(this.identityType);
        parcel.writeString(this.identityNumber);
        parcel.writeString(this.billingProductCode);
        parcel.writeString(this.subscriberNumberShow);
        parcel.writeString(this.subscriberNumber);
    }

    public CheckSimActivationResponse(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable LegalAddress legalAddress, @Nullable String str9, @Nullable String str10, @Nullable String str11, @Nullable String str12, @Nullable String str13, @Nullable String str14, @Nullable String str15, @Nullable String str16) {
        this.companyCode = str;
        this.lastName = str2;
        this.gender = str3;
        this.lastChangeDatetime = str4;
        this.channel = str5;
        this.title = str6;
        this.birthDate = str7;
        this.identityNumberShow = str8;
        this.legalAddress = legalAddress;
        this.simcardNumber = str9;
        this.simType = str10;
        this.firstName = str11;
        this.identityType = str12;
        this.identityNumber = str13;
        this.billingProductCode = str14;
        this.subscriberNumberShow = str15;
        this.subscriberNumber = str16;
    }

    public /* synthetic */ CheckSimActivationResponse(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, LegalAddress legalAddress, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7, (i & 128) != 0 ? null : str8, (i & 256) != 0 ? null : legalAddress, (i & 512) != 0 ? null : str9, (i & 1024) != 0 ? null : str10, (i & 2048) != 0 ? null : str11, (i & 4096) != 0 ? null : str12, (i & 8192) != 0 ? null : str13, (i & 16384) != 0 ? null : str14, (i & 32768) != 0 ? null : str15, (i & 65536) != 0 ? null : str16);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CheckSimActivationResponse(@NotNull Parcel parcel) {
        this(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), (LegalAddress) parcel.readParcelable(LegalAddress.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        Intrinsics.checkNotNullParameter(parcel, "parcel");
    }
}