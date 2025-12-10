package th.p047co.dtac.android.dtacone.model.postpaid.save_postpaid;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b \b\u0007\u0018\u00002\u00020\u0001Bq\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0012¢\u0006\u0002\u0010\u0016R\u001c\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R \u0010\u0014\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u0018\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0016\u0010\r\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R \u0010\u0013\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u001a\"\u0004\b$\u0010\u001cR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0016\u0010\u000b\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0016\u0010\u000f\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\"\u0010\u0015\u001a\u0004\u0018\u00010\u00128\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010/\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u0016\u0010\u0011\u001a\u00020\u00128\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b0\u00101¨\u00062"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/postpaid/save_postpaid/SavePostpaidRequest;", "", "mrtrConsentId", "", "packageSet", "Lth/co/dtac/android/dtacone/model/postpaid/save_postpaid/SavePackageRequest;", "attachmentNames", "", "", "faceRecognition", "Lth/co/dtac/android/dtacone/model/postpaid/save_postpaid/SaveFaceRecognition;", "registeredInformation", "Lth/co/dtac/android/dtacone/model/postpaid/save_postpaid/SaveRegistrationInformation;", "mailingAddress", "Lth/co/dtac/android/dtacone/model/postpaid/save_postpaid/SaveMailingAddress;", "simCard", "Lth/co/dtac/android/dtacone/model/postpaid/save_postpaid/SaveSimCard;", "withDevice", "", "nontelcoConsentType", "consentVersionLabel", "updateConsent", "(JLth/co/dtac/android/dtacone/model/postpaid/save_postpaid/SavePackageRequest;Ljava/util/List;Lth/co/dtac/android/dtacone/model/postpaid/save_postpaid/SaveFaceRecognition;Lth/co/dtac/android/dtacone/model/postpaid/save_postpaid/SaveRegistrationInformation;Lth/co/dtac/android/dtacone/model/postpaid/save_postpaid/SaveMailingAddress;Lth/co/dtac/android/dtacone/model/postpaid/save_postpaid/SaveSimCard;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V", "getAttachmentNames", "()Ljava/util/List;", "getConsentVersionLabel", "()Ljava/lang/String;", "setConsentVersionLabel", "(Ljava/lang/String;)V", "getFaceRecognition", "()Lth/co/dtac/android/dtacone/model/postpaid/save_postpaid/SaveFaceRecognition;", "getMailingAddress", "()Lth/co/dtac/android/dtacone/model/postpaid/save_postpaid/SaveMailingAddress;", "getMrtrConsentId", "()J", "getNontelcoConsentType", "setNontelcoConsentType", "getPackageSet", "()Lth/co/dtac/android/dtacone/model/postpaid/save_postpaid/SavePackageRequest;", "getRegisteredInformation", "()Lth/co/dtac/android/dtacone/model/postpaid/save_postpaid/SaveRegistrationInformation;", "getSimCard", "()Lth/co/dtac/android/dtacone/model/postpaid/save_postpaid/SaveSimCard;", "getUpdateConsent", "()Ljava/lang/Boolean;", "setUpdateConsent", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getWithDevice", "()Z", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.postpaid.save_postpaid.SavePostpaidRequest */
/* loaded from: classes8.dex */
public final class SavePostpaidRequest {
    public static final int $stable = 8;
    @SerializedName("attachmentNames")
    @NotNull
    private final List<String> attachmentNames;
    @SerializedName("consentVersionLabel")
    @Nullable
    private String consentVersionLabel;
    @SerializedName("faceRecognition")
    @Nullable
    private final SaveFaceRecognition faceRecognition;
    @SerializedName("mailingAddress")
    @NotNull
    private final SaveMailingAddress mailingAddress;
    @SerializedName("mrtrConsentId")
    private final long mrtrConsentId;
    @SerializedName("nontelcoConsentType")
    @Nullable
    private String nontelcoConsentType;
    @SerializedName("package")
    @NotNull
    private final SavePackageRequest packageSet;
    @SerializedName("registeredInformation")
    @NotNull
    private final SaveRegistrationInformation registeredInformation;
    @SerializedName("simCard")
    @NotNull
    private final SaveSimCard simCard;
    @SerializedName("updateConsent")
    @Nullable
    private Boolean updateConsent;
    @SerializedName("withDevice")
    private final boolean withDevice;

    public SavePostpaidRequest(long j, @NotNull SavePackageRequest packageSet, @NotNull List<String> attachmentNames, @Nullable SaveFaceRecognition saveFaceRecognition, @NotNull SaveRegistrationInformation registeredInformation, @NotNull SaveMailingAddress mailingAddress, @NotNull SaveSimCard simCard, boolean z, @Nullable String str, @Nullable String str2, @Nullable Boolean bool) {
        Intrinsics.checkNotNullParameter(packageSet, "packageSet");
        Intrinsics.checkNotNullParameter(attachmentNames, "attachmentNames");
        Intrinsics.checkNotNullParameter(registeredInformation, "registeredInformation");
        Intrinsics.checkNotNullParameter(mailingAddress, "mailingAddress");
        Intrinsics.checkNotNullParameter(simCard, "simCard");
        this.mrtrConsentId = j;
        this.packageSet = packageSet;
        this.attachmentNames = attachmentNames;
        this.faceRecognition = saveFaceRecognition;
        this.registeredInformation = registeredInformation;
        this.mailingAddress = mailingAddress;
        this.simCard = simCard;
        this.withDevice = z;
        this.nontelcoConsentType = str;
        this.consentVersionLabel = str2;
        this.updateConsent = bool;
    }

    @NotNull
    public final List<String> getAttachmentNames() {
        return this.attachmentNames;
    }

    @Nullable
    public final String getConsentVersionLabel() {
        return this.consentVersionLabel;
    }

    @Nullable
    public final SaveFaceRecognition getFaceRecognition() {
        return this.faceRecognition;
    }

    @NotNull
    public final SaveMailingAddress getMailingAddress() {
        return this.mailingAddress;
    }

    public final long getMrtrConsentId() {
        return this.mrtrConsentId;
    }

    @Nullable
    public final String getNontelcoConsentType() {
        return this.nontelcoConsentType;
    }

    @NotNull
    public final SavePackageRequest getPackageSet() {
        return this.packageSet;
    }

    @NotNull
    public final SaveRegistrationInformation getRegisteredInformation() {
        return this.registeredInformation;
    }

    @NotNull
    public final SaveSimCard getSimCard() {
        return this.simCard;
    }

    @Nullable
    public final Boolean getUpdateConsent() {
        return this.updateConsent;
    }

    public final boolean getWithDevice() {
        return this.withDevice;
    }

    public final void setConsentVersionLabel(@Nullable String str) {
        this.consentVersionLabel = str;
    }

    public final void setNontelcoConsentType(@Nullable String str) {
        this.nontelcoConsentType = str;
    }

    public final void setUpdateConsent(@Nullable Boolean bool) {
        this.updateConsent = bool;
    }

    public /* synthetic */ SavePostpaidRequest(long j, SavePackageRequest savePackageRequest, List list, SaveFaceRecognition saveFaceRecognition, SaveRegistrationInformation saveRegistrationInformation, SaveMailingAddress saveMailingAddress, SaveSimCard saveSimCard, boolean z, String str, String str2, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, savePackageRequest, list, saveFaceRecognition, saveRegistrationInformation, saveMailingAddress, saveSimCard, z, (i & 256) != 0 ? null : str, (i & 512) != 0 ? null : str2, (i & 1024) != 0 ? Boolean.TRUE : bool);
    }
}