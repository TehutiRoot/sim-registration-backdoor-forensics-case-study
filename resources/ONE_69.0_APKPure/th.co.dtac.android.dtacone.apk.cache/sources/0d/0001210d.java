package th.p047co.dtac.android.dtacone.model.upload_image.request;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.view.fragment.mrtr_prepaid_registration.family_sim.InputPostpaidFamilySimSubscriberFragment;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003¢\u0006\u0002\u0010\bJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003JC\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006\u001b"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/upload_image/request/UploadImageRequest;", "", "simcardNumber", "", "imageBase64", "featureCode", InputPostpaidFamilySimSubscriberFragment.SUB_NUM, "imageType", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getFeatureCode", "()Ljava/lang/String;", "getImageBase64", "getImageType", "getSimcardNumber", "getSubscriberNumber", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.upload_image.request.UploadImageRequest */
/* loaded from: classes8.dex */
public final class UploadImageRequest {
    public static final int $stable = 0;
    @SerializedName("featureCode")
    @Nullable
    private final String featureCode;
    @SerializedName("imageBase64")
    @Nullable
    private final String imageBase64;
    @SerializedName("imageType")
    @NotNull
    private final String imageType;
    @SerializedName("simcardNumber")
    @Nullable
    private final String simcardNumber;
    @SerializedName(InputPostpaidFamilySimSubscriberFragment.SUB_NUM)
    @Nullable
    private final String subscriberNumber;

    public UploadImageRequest() {
        this(null, null, null, null, null, 31, null);
    }

    public static /* synthetic */ UploadImageRequest copy$default(UploadImageRequest uploadImageRequest, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = uploadImageRequest.simcardNumber;
        }
        if ((i & 2) != 0) {
            str2 = uploadImageRequest.imageBase64;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = uploadImageRequest.featureCode;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = uploadImageRequest.subscriberNumber;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            str5 = uploadImageRequest.imageType;
        }
        return uploadImageRequest.copy(str, str6, str7, str8, str5);
    }

    @Nullable
    public final String component1() {
        return this.simcardNumber;
    }

    @Nullable
    public final String component2() {
        return this.imageBase64;
    }

    @Nullable
    public final String component3() {
        return this.featureCode;
    }

    @Nullable
    public final String component4() {
        return this.subscriberNumber;
    }

    @NotNull
    public final String component5() {
        return this.imageType;
    }

    @NotNull
    public final UploadImageRequest copy(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @NotNull String imageType) {
        Intrinsics.checkNotNullParameter(imageType, "imageType");
        return new UploadImageRequest(str, str2, str3, str4, imageType);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof UploadImageRequest) {
            UploadImageRequest uploadImageRequest = (UploadImageRequest) obj;
            return Intrinsics.areEqual(this.simcardNumber, uploadImageRequest.simcardNumber) && Intrinsics.areEqual(this.imageBase64, uploadImageRequest.imageBase64) && Intrinsics.areEqual(this.featureCode, uploadImageRequest.featureCode) && Intrinsics.areEqual(this.subscriberNumber, uploadImageRequest.subscriberNumber) && Intrinsics.areEqual(this.imageType, uploadImageRequest.imageType);
        }
        return false;
    }

    @Nullable
    public final String getFeatureCode() {
        return this.featureCode;
    }

    @Nullable
    public final String getImageBase64() {
        return this.imageBase64;
    }

    @NotNull
    public final String getImageType() {
        return this.imageType;
    }

    @Nullable
    public final String getSimcardNumber() {
        return this.simcardNumber;
    }

    @Nullable
    public final String getSubscriberNumber() {
        return this.subscriberNumber;
    }

    public int hashCode() {
        String str = this.simcardNumber;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.imageBase64;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.featureCode;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.subscriberNumber;
        return ((hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31) + this.imageType.hashCode();
    }

    @NotNull
    public String toString() {
        String str = this.simcardNumber;
        String str2 = this.imageBase64;
        String str3 = this.featureCode;
        String str4 = this.subscriberNumber;
        String str5 = this.imageType;
        return "UploadImageRequest(simcardNumber=" + str + ", imageBase64=" + str2 + ", featureCode=" + str3 + ", subscriberNumber=" + str4 + ", imageType=" + str5 + ")";
    }

    public UploadImageRequest(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @NotNull String imageType) {
        Intrinsics.checkNotNullParameter(imageType, "imageType");
        this.simcardNumber = str;
        this.imageBase64 = str2;
        this.featureCode = str3;
        this.subscriberNumber = str4;
        this.imageType = imageType;
    }

    public /* synthetic */ UploadImageRequest(String str, String str2, String str3, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) == 0 ? str4 : null, (i & 16) != 0 ? "" : str5);
    }
}