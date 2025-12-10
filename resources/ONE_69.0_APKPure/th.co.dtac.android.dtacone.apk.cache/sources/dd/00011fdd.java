package th.p047co.dtac.android.dtacone.model.postpaid;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.android.parcel.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.model.dtacAtHome.DtacAtHomeConfig;

@StabilityInferred(parameters = 0)
@Parcelize
@Metadata(m29143d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b(\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bq\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\t\u0012\b\b\u0002\u0010\u000f\u001a\u00020\t\u0012\b\b\u0002\u0010\u0010\u001a\u00020\t\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u000b¢\u0006\u0002\u0010\u0014J\t\u0010,\u001a\u00020\u0003HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0012HÆ\u0003J\t\u0010.\u001a\u00020\u000bHÆ\u0003J\t\u0010/\u001a\u00020\u0005HÆ\u0003J\t\u00100\u001a\u00020\u0007HÆ\u0003J\t\u00101\u001a\u00020\tHÆ\u0003J\t\u00102\u001a\u00020\u000bHÆ\u0003J\u000f\u00103\u001a\b\u0012\u0004\u0012\u00020\u000b0\rHÆ\u0003J\t\u00104\u001a\u00020\tHÆ\u0003J\t\u00105\u001a\u00020\tHÆ\u0003J\t\u00106\u001a\u00020\tHÆ\u0003J\u007f\u00107\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\r2\b\b\u0002\u0010\u000e\u001a\u00020\t2\b\b\u0002\u0010\u000f\u001a\u00020\t2\b\b\u0002\u0010\u0010\u001a\u00020\t2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u000bHÆ\u0001J\t\u00108\u001a\u00020\u0007HÖ\u0001J\u0013\u00109\u001a\u00020\t2\b\u0010:\u001a\u0004\u0018\u00010;HÖ\u0003J\t\u0010<\u001a\u00020\u0007HÖ\u0001J\t\u0010=\u001a\u00020\u000bHÖ\u0001J\u0019\u0010>\u001a\u00020?2\u0006\u0010@\u001a\u00020A2\u0006\u0010B\u001a\u00020\u0007HÖ\u0001R\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\r¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u001a\u0010\u0013\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u0016\u0010\n\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010$R\u001a\u0010\u000f\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0016\"\u0004\b(\u0010)R\u001a\u0010\u000e\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u0016\"\u0004\b*\u0010)R\u001a\u0010\u0010\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0016\"\u0004\b+\u0010)¨\u0006C"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/postpaid/PostpaidConfigResponse;", "Landroid/os/Parcelable;", "faceRecognition", "Lth/co/dtac/android/dtacone/model/postpaid/FaceRecognitionConfig;", "faceNotFoundCountBeforeManualAccept", "Lth/co/dtac/android/dtacone/model/postpaid/FaceDetectionConfig;", "imageOptionals", "", "KYCRequireVerifyJC", "", "invoiceAlertMethod", "", "imageOptionalsName", "", "isWithDevice", "isWithContract", "isWithDtacAtHome", "dtacAtHomeConfig", "Lth/co/dtac/android/dtacone/model/dtacAtHome/DtacAtHomeConfig;", "imie", "(Lth/co/dtac/android/dtacone/model/postpaid/FaceRecognitionConfig;Lth/co/dtac/android/dtacone/model/postpaid/FaceDetectionConfig;IZLjava/lang/String;Ljava/util/List;ZZZLth/co/dtac/android/dtacone/model/dtacAtHome/DtacAtHomeConfig;Ljava/lang/String;)V", "getKYCRequireVerifyJC", "()Z", "getDtacAtHomeConfig", "()Lth/co/dtac/android/dtacone/model/dtacAtHome/DtacAtHomeConfig;", "setDtacAtHomeConfig", "(Lth/co/dtac/android/dtacone/model/dtacAtHome/DtacAtHomeConfig;)V", "getFaceNotFoundCountBeforeManualAccept", "()Lth/co/dtac/android/dtacone/model/postpaid/FaceDetectionConfig;", "getFaceRecognition", "()Lth/co/dtac/android/dtacone/model/postpaid/FaceRecognitionConfig;", "getImageOptionals", "()I", "getImageOptionalsName", "()Ljava/util/List;", "getImie", "()Ljava/lang/String;", "setImie", "(Ljava/lang/String;)V", "getInvoiceAlertMethod", "setWithContract", "(Z)V", "setWithDevice", "setWithDtacAtHome", "component1", "component10", "component11", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.postpaid.PostpaidConfigResponse */
/* loaded from: classes8.dex */
public final class PostpaidConfigResponse implements Parcelable {
    public static final int $stable = 8;
    @NotNull
    public static final Parcelable.Creator<PostpaidConfigResponse> CREATOR = new Creator();
    @SerializedName("KYCRequireVerifyJC")
    private final boolean KYCRequireVerifyJC;
    @Nullable
    private transient DtacAtHomeConfig dtacAtHomeConfig;
    @SerializedName("faceNotFoundCountBeforeManualAccept")
    @NotNull
    private final FaceDetectionConfig faceNotFoundCountBeforeManualAccept;
    @SerializedName("faceRecognition")
    @NotNull
    private final FaceRecognitionConfig faceRecognition;
    @SerializedName("imageOptionals")
    private final int imageOptionals;
    @NotNull
    private final transient List<String> imageOptionalsName;
    @NotNull
    private transient String imie;
    @SerializedName("invoiceAlertMethod")
    @NotNull
    private final String invoiceAlertMethod;
    private transient boolean isWithContract;
    private transient boolean isWithDevice;
    private transient boolean isWithDtacAtHome;

    @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.model.postpaid.PostpaidConfigResponse$Creator */
    /* loaded from: classes8.dex */
    public static final class Creator implements Parcelable.Creator<PostpaidConfigResponse> {
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final PostpaidConfigResponse createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new PostpaidConfigResponse(FaceRecognitionConfig.CREATOR.createFromParcel(parcel), FaceDetectionConfig.CREATOR.createFromParcel(parcel), parcel.readInt(), parcel.readInt() != 0, parcel.readString(), parcel.createStringArrayList(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() == 0 ? null : DtacAtHomeConfig.CREATOR.createFromParcel(parcel), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        public final PostpaidConfigResponse[] newArray(int i) {
            return new PostpaidConfigResponse[i];
        }
    }

    public PostpaidConfigResponse(@NotNull FaceRecognitionConfig faceRecognition, @NotNull FaceDetectionConfig faceNotFoundCountBeforeManualAccept, int i, boolean z, @NotNull String invoiceAlertMethod, @NotNull List<String> imageOptionalsName, boolean z2, boolean z3, boolean z4, @Nullable DtacAtHomeConfig dtacAtHomeConfig, @NotNull String imie) {
        Intrinsics.checkNotNullParameter(faceRecognition, "faceRecognition");
        Intrinsics.checkNotNullParameter(faceNotFoundCountBeforeManualAccept, "faceNotFoundCountBeforeManualAccept");
        Intrinsics.checkNotNullParameter(invoiceAlertMethod, "invoiceAlertMethod");
        Intrinsics.checkNotNullParameter(imageOptionalsName, "imageOptionalsName");
        Intrinsics.checkNotNullParameter(imie, "imie");
        this.faceRecognition = faceRecognition;
        this.faceNotFoundCountBeforeManualAccept = faceNotFoundCountBeforeManualAccept;
        this.imageOptionals = i;
        this.KYCRequireVerifyJC = z;
        this.invoiceAlertMethod = invoiceAlertMethod;
        this.imageOptionalsName = imageOptionalsName;
        this.isWithDevice = z2;
        this.isWithContract = z3;
        this.isWithDtacAtHome = z4;
        this.dtacAtHomeConfig = dtacAtHomeConfig;
        this.imie = imie;
    }

    @NotNull
    public final FaceRecognitionConfig component1() {
        return this.faceRecognition;
    }

    @Nullable
    public final DtacAtHomeConfig component10() {
        return this.dtacAtHomeConfig;
    }

    @NotNull
    public final String component11() {
        return this.imie;
    }

    @NotNull
    public final FaceDetectionConfig component2() {
        return this.faceNotFoundCountBeforeManualAccept;
    }

    public final int component3() {
        return this.imageOptionals;
    }

    public final boolean component4() {
        return this.KYCRequireVerifyJC;
    }

    @NotNull
    public final String component5() {
        return this.invoiceAlertMethod;
    }

    @NotNull
    public final List<String> component6() {
        return this.imageOptionalsName;
    }

    public final boolean component7() {
        return this.isWithDevice;
    }

    public final boolean component8() {
        return this.isWithContract;
    }

    public final boolean component9() {
        return this.isWithDtacAtHome;
    }

    @NotNull
    public final PostpaidConfigResponse copy(@NotNull FaceRecognitionConfig faceRecognition, @NotNull FaceDetectionConfig faceNotFoundCountBeforeManualAccept, int i, boolean z, @NotNull String invoiceAlertMethod, @NotNull List<String> imageOptionalsName, boolean z2, boolean z3, boolean z4, @Nullable DtacAtHomeConfig dtacAtHomeConfig, @NotNull String imie) {
        Intrinsics.checkNotNullParameter(faceRecognition, "faceRecognition");
        Intrinsics.checkNotNullParameter(faceNotFoundCountBeforeManualAccept, "faceNotFoundCountBeforeManualAccept");
        Intrinsics.checkNotNullParameter(invoiceAlertMethod, "invoiceAlertMethod");
        Intrinsics.checkNotNullParameter(imageOptionalsName, "imageOptionalsName");
        Intrinsics.checkNotNullParameter(imie, "imie");
        return new PostpaidConfigResponse(faceRecognition, faceNotFoundCountBeforeManualAccept, i, z, invoiceAlertMethod, imageOptionalsName, z2, z3, z4, dtacAtHomeConfig, imie);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PostpaidConfigResponse) {
            PostpaidConfigResponse postpaidConfigResponse = (PostpaidConfigResponse) obj;
            return Intrinsics.areEqual(this.faceRecognition, postpaidConfigResponse.faceRecognition) && Intrinsics.areEqual(this.faceNotFoundCountBeforeManualAccept, postpaidConfigResponse.faceNotFoundCountBeforeManualAccept) && this.imageOptionals == postpaidConfigResponse.imageOptionals && this.KYCRequireVerifyJC == postpaidConfigResponse.KYCRequireVerifyJC && Intrinsics.areEqual(this.invoiceAlertMethod, postpaidConfigResponse.invoiceAlertMethod) && Intrinsics.areEqual(this.imageOptionalsName, postpaidConfigResponse.imageOptionalsName) && this.isWithDevice == postpaidConfigResponse.isWithDevice && this.isWithContract == postpaidConfigResponse.isWithContract && this.isWithDtacAtHome == postpaidConfigResponse.isWithDtacAtHome && Intrinsics.areEqual(this.dtacAtHomeConfig, postpaidConfigResponse.dtacAtHomeConfig) && Intrinsics.areEqual(this.imie, postpaidConfigResponse.imie);
        }
        return false;
    }

    @Nullable
    public final DtacAtHomeConfig getDtacAtHomeConfig() {
        return this.dtacAtHomeConfig;
    }

    @NotNull
    public final FaceDetectionConfig getFaceNotFoundCountBeforeManualAccept() {
        return this.faceNotFoundCountBeforeManualAccept;
    }

    @NotNull
    public final FaceRecognitionConfig getFaceRecognition() {
        return this.faceRecognition;
    }

    public final int getImageOptionals() {
        return this.imageOptionals;
    }

    @NotNull
    public final List<String> getImageOptionalsName() {
        return this.imageOptionalsName;
    }

    @NotNull
    public final String getImie() {
        return this.imie;
    }

    @NotNull
    public final String getInvoiceAlertMethod() {
        return this.invoiceAlertMethod;
    }

    public final boolean getKYCRequireVerifyJC() {
        return this.KYCRequireVerifyJC;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((this.faceRecognition.hashCode() * 31) + this.faceNotFoundCountBeforeManualAccept.hashCode()) * 31) + this.imageOptionals) * 31;
        boolean z = this.KYCRequireVerifyJC;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int hashCode2 = (((((hashCode + i) * 31) + this.invoiceAlertMethod.hashCode()) * 31) + this.imageOptionalsName.hashCode()) * 31;
        boolean z2 = this.isWithDevice;
        int i2 = z2;
        if (z2 != 0) {
            i2 = 1;
        }
        int i3 = (hashCode2 + i2) * 31;
        boolean z3 = this.isWithContract;
        int i4 = z3;
        if (z3 != 0) {
            i4 = 1;
        }
        int i5 = (i3 + i4) * 31;
        boolean z4 = this.isWithDtacAtHome;
        int i6 = (i5 + (z4 ? 1 : z4 ? 1 : 0)) * 31;
        DtacAtHomeConfig dtacAtHomeConfig = this.dtacAtHomeConfig;
        return ((i6 + (dtacAtHomeConfig == null ? 0 : dtacAtHomeConfig.hashCode())) * 31) + this.imie.hashCode();
    }

    public final boolean isWithContract() {
        return this.isWithContract;
    }

    public final boolean isWithDevice() {
        return this.isWithDevice;
    }

    public final boolean isWithDtacAtHome() {
        return this.isWithDtacAtHome;
    }

    public final void setDtacAtHomeConfig(@Nullable DtacAtHomeConfig dtacAtHomeConfig) {
        this.dtacAtHomeConfig = dtacAtHomeConfig;
    }

    public final void setImie(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.imie = str;
    }

    public final void setWithContract(boolean z) {
        this.isWithContract = z;
    }

    public final void setWithDevice(boolean z) {
        this.isWithDevice = z;
    }

    public final void setWithDtacAtHome(boolean z) {
        this.isWithDtacAtHome = z;
    }

    @NotNull
    public String toString() {
        FaceRecognitionConfig faceRecognitionConfig = this.faceRecognition;
        FaceDetectionConfig faceDetectionConfig = this.faceNotFoundCountBeforeManualAccept;
        int i = this.imageOptionals;
        boolean z = this.KYCRequireVerifyJC;
        String str = this.invoiceAlertMethod;
        List<String> list = this.imageOptionalsName;
        boolean z2 = this.isWithDevice;
        boolean z3 = this.isWithContract;
        boolean z4 = this.isWithDtacAtHome;
        DtacAtHomeConfig dtacAtHomeConfig = this.dtacAtHomeConfig;
        String str2 = this.imie;
        return "PostpaidConfigResponse(faceRecognition=" + faceRecognitionConfig + ", faceNotFoundCountBeforeManualAccept=" + faceDetectionConfig + ", imageOptionals=" + i + ", KYCRequireVerifyJC=" + z + ", invoiceAlertMethod=" + str + ", imageOptionalsName=" + list + ", isWithDevice=" + z2 + ", isWithContract=" + z3 + ", isWithDtacAtHome=" + z4 + ", dtacAtHomeConfig=" + dtacAtHomeConfig + ", imie=" + str2 + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        this.faceRecognition.writeToParcel(out, i);
        this.faceNotFoundCountBeforeManualAccept.writeToParcel(out, i);
        out.writeInt(this.imageOptionals);
        out.writeInt(this.KYCRequireVerifyJC ? 1 : 0);
        out.writeString(this.invoiceAlertMethod);
        out.writeStringList(this.imageOptionalsName);
        out.writeInt(this.isWithDevice ? 1 : 0);
        out.writeInt(this.isWithContract ? 1 : 0);
        out.writeInt(this.isWithDtacAtHome ? 1 : 0);
        DtacAtHomeConfig dtacAtHomeConfig = this.dtacAtHomeConfig;
        if (dtacAtHomeConfig == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            dtacAtHomeConfig.writeToParcel(out, i);
        }
        out.writeString(this.imie);
    }

    public /* synthetic */ PostpaidConfigResponse(FaceRecognitionConfig faceRecognitionConfig, FaceDetectionConfig faceDetectionConfig, int i, boolean z, String str, List list, boolean z2, boolean z3, boolean z4, DtacAtHomeConfig dtacAtHomeConfig, String str2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(faceRecognitionConfig, faceDetectionConfig, i, (i2 & 8) != 0 ? false : z, str, list, (i2 & 64) != 0 ? false : z2, (i2 & 128) != 0 ? false : z3, (i2 & 256) != 0 ? false : z4, (i2 & 512) != 0 ? null : dtacAtHomeConfig, (i2 & 1024) != 0 ? "" : str2);
    }
}