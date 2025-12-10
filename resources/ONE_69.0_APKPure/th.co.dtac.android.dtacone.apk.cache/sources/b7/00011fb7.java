package th.p047co.dtac.android.dtacone.model.p2post.submit.omr.request;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.android.parcel.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.model.p2post.MailingAddressCollection;
import th.p047co.dtac.android.dtacone.view.fragment.mrtr_prepaid_registration.family_sim.InputPostpaidFamilySimSubscriberFragment;

@StabilityInferred(parameters = 0)
@Parcelize
@Metadata(m29143d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b2\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0093\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\r¢\u0006\u0002\u0010\u0016J\u000b\u00104\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u0010\u00107\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0002\u0010/J\u000b\u00108\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u00109\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\"J\t\u0010:\u001a\u00020\tHÆ\u0003J\t\u0010;\u001a\u00020\u000bHÆ\u0003J\u0010\u0010<\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0002\u0010/J\u000b\u0010=\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\u0011\u0010?\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0012HÆ\u0003J \u0001\u0010@\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\rHÆ\u0001¢\u0006\u0002\u0010AJ\t\u0010B\u001a\u00020\u0007HÖ\u0001J\u0013\u0010C\u001a\u00020\r2\b\u0010D\u001a\u0004\u0018\u00010EHÖ\u0003J\t\u0010F\u001a\u00020\u0007HÖ\u0001J\t\u0010G\u001a\u00020\u000bHÖ\u0001J\u0019\u0010H\u001a\u00020I2\u0006\u0010J\u001a\u00020K2\u0006\u0010L\u001a\u00020\u0007HÖ\u0001R\u001e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R \u0010\u0014\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010%\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R \u0010\u0013\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u001a\"\u0004\b'\u0010\u001cR\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001aR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0016\u0010\n\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010\u001aR\"\u0010\u0015\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u00102\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\u001a\u0010\f\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u00102\u001a\u0004\b3\u0010/¨\u0006M"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/p2post/submit/omr/request/Pre2postRegistrationRequest;", "Landroid/os/Parcelable;", "packageItem", "Lth/co/dtac/android/dtacone/model/p2post/submit/omr/request/PackageItem;", "mailingAddress", "Lth/co/dtac/android/dtacone/model/p2post/MailingAddressCollection;", "mrtrConsentId", "", "registeredInformation", "Lth/co/dtac/android/dtacone/model/p2post/submit/omr/request/RegisteredInformation;", InputPostpaidFamilySimSubscriberFragment.SUB_NUM, "", "withDevice", "", "otp", "faceRecognition", "Lth/co/dtac/android/dtacone/model/p2post/submit/omr/request/FaceRecognition;", "attachmentNames", "", "nontelcoConsentType", "consentVersionLabel", "updateConsent", "(Lth/co/dtac/android/dtacone/model/p2post/submit/omr/request/PackageItem;Lth/co/dtac/android/dtacone/model/p2post/MailingAddressCollection;Ljava/lang/Integer;Lth/co/dtac/android/dtacone/model/p2post/submit/omr/request/RegisteredInformation;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Lth/co/dtac/android/dtacone/model/p2post/submit/omr/request/FaceRecognition;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V", "getAttachmentNames", "()Ljava/util/List;", "getConsentVersionLabel", "()Ljava/lang/String;", "setConsentVersionLabel", "(Ljava/lang/String;)V", "getFaceRecognition", "()Lth/co/dtac/android/dtacone/model/p2post/submit/omr/request/FaceRecognition;", "getMailingAddress", "()Lth/co/dtac/android/dtacone/model/p2post/MailingAddressCollection;", "getMrtrConsentId", "()Ljava/lang/Integer;", "setMrtrConsentId", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getNontelcoConsentType", "setNontelcoConsentType", "getOtp", "getPackageItem", "()Lth/co/dtac/android/dtacone/model/p2post/submit/omr/request/PackageItem;", "getRegisteredInformation", "()Lth/co/dtac/android/dtacone/model/p2post/submit/omr/request/RegisteredInformation;", "getSubscriberNumber", "getUpdateConsent", "()Ljava/lang/Boolean;", "setUpdateConsent", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getWithDevice", "component1", "component10", "component11", "component12", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Lth/co/dtac/android/dtacone/model/p2post/submit/omr/request/PackageItem;Lth/co/dtac/android/dtacone/model/p2post/MailingAddressCollection;Ljava/lang/Integer;Lth/co/dtac/android/dtacone/model/p2post/submit/omr/request/RegisteredInformation;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Lth/co/dtac/android/dtacone/model/p2post/submit/omr/request/FaceRecognition;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)Lth/co/dtac/android/dtacone/model/p2post/submit/omr/request/Pre2postRegistrationRequest;", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.p2post.submit.omr.request.Pre2postRegistrationRequest */
/* loaded from: classes8.dex */
public final class Pre2postRegistrationRequest implements Parcelable {
    public static final int $stable = 8;
    @NotNull
    public static final Parcelable.Creator<Pre2postRegistrationRequest> CREATOR = new Creator();
    @SerializedName("attachmentNames")
    @Nullable
    private final List<String> attachmentNames;
    @SerializedName("consentVersionLabel")
    @Nullable
    private String consentVersionLabel;
    @SerializedName("faceRecognition")
    @Nullable
    private final FaceRecognition faceRecognition;
    @SerializedName("mailingAddress")
    @Nullable
    private final MailingAddressCollection mailingAddress;
    @SerializedName("mrtrConsentId")
    @Nullable
    private Integer mrtrConsentId;
    @SerializedName("nontelcoConsentType")
    @Nullable
    private String nontelcoConsentType;
    @SerializedName("otp")
    @Nullable
    private final String otp;
    @SerializedName("package")
    @Nullable
    private final PackageItem packageItem;
    @SerializedName("registeredInformation")
    @NotNull
    private final RegisteredInformation registeredInformation;
    @SerializedName(InputPostpaidFamilySimSubscriberFragment.SUB_NUM)
    @NotNull
    private final String subscriberNumber;
    @SerializedName("updateConsent")
    @Nullable
    private Boolean updateConsent;
    @SerializedName("withDevice")
    @Nullable
    private final Boolean withDevice;

    @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.model.p2post.submit.omr.request.Pre2postRegistrationRequest$Creator */
    /* loaded from: classes8.dex */
    public static final class Creator implements Parcelable.Creator<Pre2postRegistrationRequest> {
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final Pre2postRegistrationRequest createFromParcel(@NotNull Parcel parcel) {
            Boolean valueOf;
            Boolean valueOf2;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            PackageItem createFromParcel = parcel.readInt() == 0 ? null : PackageItem.CREATOR.createFromParcel(parcel);
            MailingAddressCollection mailingAddressCollection = (MailingAddressCollection) parcel.readParcelable(Pre2postRegistrationRequest.class.getClassLoader());
            Integer valueOf3 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            RegisteredInformation createFromParcel2 = RegisteredInformation.CREATOR.createFromParcel(parcel);
            String readString = parcel.readString();
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            String readString2 = parcel.readString();
            FaceRecognition createFromParcel3 = parcel.readInt() == 0 ? null : FaceRecognition.CREATOR.createFromParcel(parcel);
            ArrayList<String> createStringArrayList = parcel.createStringArrayList();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            if (parcel.readInt() == 0) {
                valueOf2 = null;
            } else {
                valueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new Pre2postRegistrationRequest(createFromParcel, mailingAddressCollection, valueOf3, createFromParcel2, readString, valueOf, readString2, createFromParcel3, createStringArrayList, readString3, readString4, valueOf2);
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        public final Pre2postRegistrationRequest[] newArray(int i) {
            return new Pre2postRegistrationRequest[i];
        }
    }

    public Pre2postRegistrationRequest(@Nullable PackageItem packageItem, @Nullable MailingAddressCollection mailingAddressCollection, @Nullable Integer num, @NotNull RegisteredInformation registeredInformation, @NotNull String subscriberNumber, @Nullable Boolean bool, @Nullable String str, @Nullable FaceRecognition faceRecognition, @Nullable List<String> list, @Nullable String str2, @Nullable String str3, @Nullable Boolean bool2) {
        Intrinsics.checkNotNullParameter(registeredInformation, "registeredInformation");
        Intrinsics.checkNotNullParameter(subscriberNumber, "subscriberNumber");
        this.packageItem = packageItem;
        this.mailingAddress = mailingAddressCollection;
        this.mrtrConsentId = num;
        this.registeredInformation = registeredInformation;
        this.subscriberNumber = subscriberNumber;
        this.withDevice = bool;
        this.otp = str;
        this.faceRecognition = faceRecognition;
        this.attachmentNames = list;
        this.nontelcoConsentType = str2;
        this.consentVersionLabel = str3;
        this.updateConsent = bool2;
    }

    @Nullable
    public final PackageItem component1() {
        return this.packageItem;
    }

    @Nullable
    public final String component10() {
        return this.nontelcoConsentType;
    }

    @Nullable
    public final String component11() {
        return this.consentVersionLabel;
    }

    @Nullable
    public final Boolean component12() {
        return this.updateConsent;
    }

    @Nullable
    public final MailingAddressCollection component2() {
        return this.mailingAddress;
    }

    @Nullable
    public final Integer component3() {
        return this.mrtrConsentId;
    }

    @NotNull
    public final RegisteredInformation component4() {
        return this.registeredInformation;
    }

    @NotNull
    public final String component5() {
        return this.subscriberNumber;
    }

    @Nullable
    public final Boolean component6() {
        return this.withDevice;
    }

    @Nullable
    public final String component7() {
        return this.otp;
    }

    @Nullable
    public final FaceRecognition component8() {
        return this.faceRecognition;
    }

    @Nullable
    public final List<String> component9() {
        return this.attachmentNames;
    }

    @NotNull
    public final Pre2postRegistrationRequest copy(@Nullable PackageItem packageItem, @Nullable MailingAddressCollection mailingAddressCollection, @Nullable Integer num, @NotNull RegisteredInformation registeredInformation, @NotNull String subscriberNumber, @Nullable Boolean bool, @Nullable String str, @Nullable FaceRecognition faceRecognition, @Nullable List<String> list, @Nullable String str2, @Nullable String str3, @Nullable Boolean bool2) {
        Intrinsics.checkNotNullParameter(registeredInformation, "registeredInformation");
        Intrinsics.checkNotNullParameter(subscriberNumber, "subscriberNumber");
        return new Pre2postRegistrationRequest(packageItem, mailingAddressCollection, num, registeredInformation, subscriberNumber, bool, str, faceRecognition, list, str2, str3, bool2);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Pre2postRegistrationRequest) {
            Pre2postRegistrationRequest pre2postRegistrationRequest = (Pre2postRegistrationRequest) obj;
            return Intrinsics.areEqual(this.packageItem, pre2postRegistrationRequest.packageItem) && Intrinsics.areEqual(this.mailingAddress, pre2postRegistrationRequest.mailingAddress) && Intrinsics.areEqual(this.mrtrConsentId, pre2postRegistrationRequest.mrtrConsentId) && Intrinsics.areEqual(this.registeredInformation, pre2postRegistrationRequest.registeredInformation) && Intrinsics.areEqual(this.subscriberNumber, pre2postRegistrationRequest.subscriberNumber) && Intrinsics.areEqual(this.withDevice, pre2postRegistrationRequest.withDevice) && Intrinsics.areEqual(this.otp, pre2postRegistrationRequest.otp) && Intrinsics.areEqual(this.faceRecognition, pre2postRegistrationRequest.faceRecognition) && Intrinsics.areEqual(this.attachmentNames, pre2postRegistrationRequest.attachmentNames) && Intrinsics.areEqual(this.nontelcoConsentType, pre2postRegistrationRequest.nontelcoConsentType) && Intrinsics.areEqual(this.consentVersionLabel, pre2postRegistrationRequest.consentVersionLabel) && Intrinsics.areEqual(this.updateConsent, pre2postRegistrationRequest.updateConsent);
        }
        return false;
    }

    @Nullable
    public final List<String> getAttachmentNames() {
        return this.attachmentNames;
    }

    @Nullable
    public final String getConsentVersionLabel() {
        return this.consentVersionLabel;
    }

    @Nullable
    public final FaceRecognition getFaceRecognition() {
        return this.faceRecognition;
    }

    @Nullable
    public final MailingAddressCollection getMailingAddress() {
        return this.mailingAddress;
    }

    @Nullable
    public final Integer getMrtrConsentId() {
        return this.mrtrConsentId;
    }

    @Nullable
    public final String getNontelcoConsentType() {
        return this.nontelcoConsentType;
    }

    @Nullable
    public final String getOtp() {
        return this.otp;
    }

    @Nullable
    public final PackageItem getPackageItem() {
        return this.packageItem;
    }

    @NotNull
    public final RegisteredInformation getRegisteredInformation() {
        return this.registeredInformation;
    }

    @NotNull
    public final String getSubscriberNumber() {
        return this.subscriberNumber;
    }

    @Nullable
    public final Boolean getUpdateConsent() {
        return this.updateConsent;
    }

    @Nullable
    public final Boolean getWithDevice() {
        return this.withDevice;
    }

    public int hashCode() {
        PackageItem packageItem = this.packageItem;
        int hashCode = (packageItem == null ? 0 : packageItem.hashCode()) * 31;
        MailingAddressCollection mailingAddressCollection = this.mailingAddress;
        int hashCode2 = (hashCode + (mailingAddressCollection == null ? 0 : mailingAddressCollection.hashCode())) * 31;
        Integer num = this.mrtrConsentId;
        int hashCode3 = (((((hashCode2 + (num == null ? 0 : num.hashCode())) * 31) + this.registeredInformation.hashCode()) * 31) + this.subscriberNumber.hashCode()) * 31;
        Boolean bool = this.withDevice;
        int hashCode4 = (hashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.otp;
        int hashCode5 = (hashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        FaceRecognition faceRecognition = this.faceRecognition;
        int hashCode6 = (hashCode5 + (faceRecognition == null ? 0 : faceRecognition.hashCode())) * 31;
        List<String> list = this.attachmentNames;
        int hashCode7 = (hashCode6 + (list == null ? 0 : list.hashCode())) * 31;
        String str2 = this.nontelcoConsentType;
        int hashCode8 = (hashCode7 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.consentVersionLabel;
        int hashCode9 = (hashCode8 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool2 = this.updateConsent;
        return hashCode9 + (bool2 != null ? bool2.hashCode() : 0);
    }

    public final void setConsentVersionLabel(@Nullable String str) {
        this.consentVersionLabel = str;
    }

    public final void setMrtrConsentId(@Nullable Integer num) {
        this.mrtrConsentId = num;
    }

    public final void setNontelcoConsentType(@Nullable String str) {
        this.nontelcoConsentType = str;
    }

    public final void setUpdateConsent(@Nullable Boolean bool) {
        this.updateConsent = bool;
    }

    @NotNull
    public String toString() {
        PackageItem packageItem = this.packageItem;
        MailingAddressCollection mailingAddressCollection = this.mailingAddress;
        Integer num = this.mrtrConsentId;
        RegisteredInformation registeredInformation = this.registeredInformation;
        String str = this.subscriberNumber;
        Boolean bool = this.withDevice;
        String str2 = this.otp;
        FaceRecognition faceRecognition = this.faceRecognition;
        List<String> list = this.attachmentNames;
        String str3 = this.nontelcoConsentType;
        String str4 = this.consentVersionLabel;
        Boolean bool2 = this.updateConsent;
        return "Pre2postRegistrationRequest(packageItem=" + packageItem + ", mailingAddress=" + mailingAddressCollection + ", mrtrConsentId=" + num + ", registeredInformation=" + registeredInformation + ", subscriberNumber=" + str + ", withDevice=" + bool + ", otp=" + str2 + ", faceRecognition=" + faceRecognition + ", attachmentNames=" + list + ", nontelcoConsentType=" + str3 + ", consentVersionLabel=" + str4 + ", updateConsent=" + bool2 + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        PackageItem packageItem = this.packageItem;
        if (packageItem == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            packageItem.writeToParcel(out, i);
        }
        out.writeParcelable(this.mailingAddress, i);
        Integer num = this.mrtrConsentId;
        if (num == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(num.intValue());
        }
        this.registeredInformation.writeToParcel(out, i);
        out.writeString(this.subscriberNumber);
        Boolean bool = this.withDevice;
        if (bool == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(bool.booleanValue() ? 1 : 0);
        }
        out.writeString(this.otp);
        FaceRecognition faceRecognition = this.faceRecognition;
        if (faceRecognition == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            faceRecognition.writeToParcel(out, i);
        }
        out.writeStringList(this.attachmentNames);
        out.writeString(this.nontelcoConsentType);
        out.writeString(this.consentVersionLabel);
        Boolean bool2 = this.updateConsent;
        if (bool2 == null) {
            out.writeInt(0);
            return;
        }
        out.writeInt(1);
        out.writeInt(bool2.booleanValue() ? 1 : 0);
    }

    public /* synthetic */ Pre2postRegistrationRequest(PackageItem packageItem, MailingAddressCollection mailingAddressCollection, Integer num, RegisteredInformation registeredInformation, String str, Boolean bool, String str2, FaceRecognition faceRecognition, List list, String str3, String str4, Boolean bool2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : packageItem, (i & 2) != 0 ? null : mailingAddressCollection, (i & 4) != 0 ? null : num, registeredInformation, str, (i & 32) != 0 ? null : bool, (i & 64) != 0 ? null : str2, (i & 128) != 0 ? null : faceRecognition, (i & 256) != 0 ? null : list, (i & 512) != 0 ? null : str3, (i & 1024) != 0 ? null : str4, (i & 2048) != 0 ? Boolean.TRUE : bool2);
    }
}