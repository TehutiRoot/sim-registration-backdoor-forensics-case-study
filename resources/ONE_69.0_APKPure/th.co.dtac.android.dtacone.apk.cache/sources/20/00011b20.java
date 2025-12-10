package th.p047co.dtac.android.dtacone.model.appOne.postpaid;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.util.Constant;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0015\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 -2\u00020\u0001:\u0002-.B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B_\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u000fJ\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u0011\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\rHÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0006HÆ\u0003Jc\u0010!\u001a\u00020\u00002\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\b\u0010\"\u001a\u00020#H\u0016J\u0013\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010'HÖ\u0003J\t\u0010(\u001a\u00020#HÖ\u0001J\t\u0010)\u001a\u00020\u0006HÖ\u0001J\u0018\u0010*\u001a\u00020+2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010,\u001a\u00020#H\u0016R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0018\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011R\u001e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0011R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0011¨\u0006/"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/appOne/postpaid/OnePostpaidRegisterAuthorizationResponse;", "Landroid/os/Parcelable;", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "systemMessage", "", "code", "codeType", "responseDateTime", "data", "Lth/co/dtac/android/dtacone/model/appOne/postpaid/OnePostpaidRegisterAuthorizationResponse$Data;", "replaceMessage", "", "desc", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lth/co/dtac/android/dtacone/model/appOne/postpaid/OnePostpaidRegisterAuthorizationResponse$Data;Ljava/util/List;Ljava/lang/String;)V", "getCode", "()Ljava/lang/String;", "getCodeType", "getData", "()Lth/co/dtac/android/dtacone/model/appOne/postpaid/OnePostpaidRegisterAuthorizationResponse$Data;", "getDesc", "getReplaceMessage", "()Ljava/util/List;", "getResponseDateTime", "getSystemMessage", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "flags", "CREATOR", Constant.BenefitName.Data, "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.appOne.postpaid.OnePostpaidRegisterAuthorizationResponse */
/* loaded from: classes8.dex */
public final class OnePostpaidRegisterAuthorizationResponse implements Parcelable {
    @SerializedName("code")
    @Nullable
    private final String code;
    @SerializedName("codeType")
    @Nullable
    private final String codeType;
    @SerializedName("data")
    @Nullable
    private final Data data;
    @SerializedName("desc")
    @Nullable
    private final String desc;
    @SerializedName("replaceMessage")
    @Nullable
    private final List<String> replaceMessage;
    @SerializedName("responseDateTime")
    @Nullable
    private final String responseDateTime;
    @SerializedName("systemMessage")
    @Nullable
    private final String systemMessage;
    @NotNull
    public static final CREATOR CREATOR = new CREATOR(null);
    public static final int $stable = 8;

    @Metadata(m29143d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u001d\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016¢\u0006\u0002\u0010\u000b¨\u0006\f"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/appOne/postpaid/OnePostpaidRegisterAuthorizationResponse$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lth/co/dtac/android/dtacone/model/appOne/postpaid/OnePostpaidRegisterAuthorizationResponse;", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", "size", "", "(I)[Lth/co/dtac/android/dtacone/model/appOne/postpaid/OnePostpaidRegisterAuthorizationResponse;", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.model.appOne.postpaid.OnePostpaidRegisterAuthorizationResponse$CREATOR */
    /* loaded from: classes8.dex */
    public static final class CREATOR implements Parcelable.Creator<OnePostpaidRegisterAuthorizationResponse> {
        public /* synthetic */ CREATOR(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private CREATOR() {
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        public OnePostpaidRegisterAuthorizationResponse createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new OnePostpaidRegisterAuthorizationResponse(parcel);
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        public OnePostpaidRegisterAuthorizationResponse[] newArray(int i) {
            return new OnePostpaidRegisterAuthorizationResponse[i];
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(m29143d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b3\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 G2\u00020\u0001:\u0001GB\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004BÝ\u0001\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0019J\u0010\u0010)\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u001eJ\u000b\u0010*\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\nHÆ\u0003J\u0010\u00100\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u001eJ\u0010\u00101\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u001eJ\u0010\u00102\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u001eJ\u0010\u00103\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u001eJ\u0010\u00104\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u001eJ\u000b\u00105\u001a\u0004\u0018\u00010\nHÆ\u0003J\u0010\u00106\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u001eJ\u000b\u00107\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\nHÆ\u0003Jæ\u0001\u0010;\u001a\u00020\u00002\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u0010<J\b\u0010=\u001a\u00020>H\u0016J\u0013\u0010?\u001a\u00020\u00062\b\u0010@\u001a\u0004\u0018\u00010AHÖ\u0003J\t\u0010B\u001a\u00020>HÖ\u0001J\t\u0010C\u001a\u00020\nHÖ\u0001J\u0018\u0010D\u001a\u00020E2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010F\u001a\u00020>H\u0016R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0018\u0010\u0014\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001bR\u001a\u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u001f\u001a\u0004\b\u001d\u0010\u001eR\u0018\u0010\r\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001bR\u0018\u0010\f\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001bR\u0018\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001bR\u001a\u0010\u0016\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u001f\u001a\u0004\b\u0016\u0010\u001eR\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u001f\u001a\u0004\b\u0005\u0010\u001eR\u001a\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u001f\u001a\u0004\b\u0007\u0010\u001eR\u001a\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u001f\u001a\u0004\b\b\u0010\u001eR\u001a\u0010\u0018\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u001f\u001a\u0004\b\u0018\u0010\u001eR\u001a\u0010\u0017\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u001f\u001a\u0004\b\u0017\u0010\u001eR\u0018\u0010\u0012\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001bR\u0018\u0010\u0011\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001bR\u0018\u0010\u000e\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001bR\u0018\u0010\u0013\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001bR\u0018\u0010\u0015\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u001bR\u0018\u0010\u0010\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001b¨\u0006H"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/appOne/postpaid/OnePostpaidRegisterAuthorizationResponse$Data;", "Landroid/os/Parcelable;", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "isAllowMergeFlow", "", "isCheckSim", "isFaceRecog", "invoiceAlertMethod", "", "defaultPaymentFreeSim", "dtrName", "dtrCode", "resultDesc", "channelSubTypeId", "rtrType", "result", "redZone", "rtrName", "channelTypeId", "rtrSubType", "isAllowManualKYC", "isRequireLiveness", "isOverruleXSIM", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "getChannelSubTypeId", "()Ljava/lang/String;", "getChannelTypeId", "getDefaultPaymentFreeSim", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getDtrCode", "getDtrName", "getInvoiceAlertMethod", "getRedZone", "getResult", "getResultDesc", "getRtrName", "getRtrSubType", "getRtrType", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lth/co/dtac/android/dtacone/model/appOne/postpaid/OnePostpaidRegisterAuthorizationResponse$Data;", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "flags", "CREATOR", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.model.appOne.postpaid.OnePostpaidRegisterAuthorizationResponse$Data */
    /* loaded from: classes8.dex */
    public static final class Data implements Parcelable {
        public static final int $stable = 0;
        @NotNull
        public static final CREATOR CREATOR = new CREATOR(null);
        @SerializedName("channelSubTypeId")
        @Nullable
        private final String channelSubTypeId;
        @SerializedName("channelTypeId")
        @Nullable
        private final String channelTypeId;
        @SerializedName("defaultPaymentFreeSim")
        @Nullable
        private final Boolean defaultPaymentFreeSim;
        @SerializedName("dtrCode")
        @Nullable
        private final String dtrCode;
        @SerializedName("dtrName")
        @Nullable
        private final String dtrName;
        @SerializedName("invoiceAlertMethod")
        @Nullable
        private final String invoiceAlertMethod;
        @SerializedName("isAllowManualKYC")
        @Nullable
        private final Boolean isAllowManualKYC;
        @SerializedName("isAllowMergeFlow")
        @Nullable
        private final Boolean isAllowMergeFlow;
        @SerializedName("isCheckSim")
        @Nullable
        private final Boolean isCheckSim;
        @SerializedName("requireFaceRecognition")
        @Nullable
        private final Boolean isFaceRecog;
        @SerializedName("isOverruleXSim")
        @Nullable
        private final Boolean isOverruleXSIM;
        @SerializedName("isRequireLiveness")
        @Nullable
        private final Boolean isRequireLiveness;
        @SerializedName("redZone")
        @Nullable
        private final String redZone;
        @SerializedName("result")
        @Nullable
        private final String result;
        @SerializedName("resultDesc")
        @Nullable
        private final String resultDesc;
        @SerializedName("rtrName")
        @Nullable
        private final String rtrName;
        @SerializedName("rtrSubType")
        @Nullable
        private final String rtrSubType;
        @SerializedName("rtrType")
        @Nullable
        private final String rtrType;

        @Metadata(m29143d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u001d\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016¢\u0006\u0002\u0010\u000b¨\u0006\f"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/appOne/postpaid/OnePostpaidRegisterAuthorizationResponse$Data$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lth/co/dtac/android/dtacone/model/appOne/postpaid/OnePostpaidRegisterAuthorizationResponse$Data;", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", "size", "", "(I)[Lth/co/dtac/android/dtacone/model/appOne/postpaid/OnePostpaidRegisterAuthorizationResponse$Data;", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
        /* renamed from: th.co.dtac.android.dtacone.model.appOne.postpaid.OnePostpaidRegisterAuthorizationResponse$Data$CREATOR */
        /* loaded from: classes8.dex */
        public static final class CREATOR implements Parcelable.Creator<Data> {
            public /* synthetic */ CREATOR(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private CREATOR() {
            }

            @Override // android.os.Parcelable.Creator
            @NotNull
            public Data createFromParcel(@NotNull Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Data(parcel);
            }

            @Override // android.os.Parcelable.Creator
            @NotNull
            public Data[] newArray(int i) {
                return new Data[i];
            }
        }

        public Data() {
            this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 262143, null);
        }

        @Nullable
        public final Boolean component1() {
            return this.isAllowMergeFlow;
        }

        @Nullable
        public final String component10() {
            return this.rtrType;
        }

        @Nullable
        public final String component11() {
            return this.result;
        }

        @Nullable
        public final String component12() {
            return this.redZone;
        }

        @Nullable
        public final String component13() {
            return this.rtrName;
        }

        @Nullable
        public final String component14() {
            return this.channelTypeId;
        }

        @Nullable
        public final String component15() {
            return this.rtrSubType;
        }

        @Nullable
        public final Boolean component16() {
            return this.isAllowManualKYC;
        }

        @Nullable
        public final Boolean component17() {
            return this.isRequireLiveness;
        }

        @Nullable
        public final Boolean component18() {
            return this.isOverruleXSIM;
        }

        @Nullable
        public final Boolean component2() {
            return this.isCheckSim;
        }

        @Nullable
        public final Boolean component3() {
            return this.isFaceRecog;
        }

        @Nullable
        public final String component4() {
            return this.invoiceAlertMethod;
        }

        @Nullable
        public final Boolean component5() {
            return this.defaultPaymentFreeSim;
        }

        @Nullable
        public final String component6() {
            return this.dtrName;
        }

        @Nullable
        public final String component7() {
            return this.dtrCode;
        }

        @Nullable
        public final String component8() {
            return this.resultDesc;
        }

        @Nullable
        public final String component9() {
            return this.channelSubTypeId;
        }

        @NotNull
        public final Data copy(@Nullable Boolean bool, @Nullable Boolean bool2, @Nullable Boolean bool3, @Nullable String str, @Nullable Boolean bool4, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable String str10, @Nullable String str11, @Nullable Boolean bool5, @Nullable Boolean bool6, @Nullable Boolean bool7) {
            return new Data(bool, bool2, bool3, str, bool4, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, bool5, bool6, bool7);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Data) {
                Data data = (Data) obj;
                return Intrinsics.areEqual(this.isAllowMergeFlow, data.isAllowMergeFlow) && Intrinsics.areEqual(this.isCheckSim, data.isCheckSim) && Intrinsics.areEqual(this.isFaceRecog, data.isFaceRecog) && Intrinsics.areEqual(this.invoiceAlertMethod, data.invoiceAlertMethod) && Intrinsics.areEqual(this.defaultPaymentFreeSim, data.defaultPaymentFreeSim) && Intrinsics.areEqual(this.dtrName, data.dtrName) && Intrinsics.areEqual(this.dtrCode, data.dtrCode) && Intrinsics.areEqual(this.resultDesc, data.resultDesc) && Intrinsics.areEqual(this.channelSubTypeId, data.channelSubTypeId) && Intrinsics.areEqual(this.rtrType, data.rtrType) && Intrinsics.areEqual(this.result, data.result) && Intrinsics.areEqual(this.redZone, data.redZone) && Intrinsics.areEqual(this.rtrName, data.rtrName) && Intrinsics.areEqual(this.channelTypeId, data.channelTypeId) && Intrinsics.areEqual(this.rtrSubType, data.rtrSubType) && Intrinsics.areEqual(this.isAllowManualKYC, data.isAllowManualKYC) && Intrinsics.areEqual(this.isRequireLiveness, data.isRequireLiveness) && Intrinsics.areEqual(this.isOverruleXSIM, data.isOverruleXSIM);
            }
            return false;
        }

        @Nullable
        public final String getChannelSubTypeId() {
            return this.channelSubTypeId;
        }

        @Nullable
        public final String getChannelTypeId() {
            return this.channelTypeId;
        }

        @Nullable
        public final Boolean getDefaultPaymentFreeSim() {
            return this.defaultPaymentFreeSim;
        }

        @Nullable
        public final String getDtrCode() {
            return this.dtrCode;
        }

        @Nullable
        public final String getDtrName() {
            return this.dtrName;
        }

        @Nullable
        public final String getInvoiceAlertMethod() {
            return this.invoiceAlertMethod;
        }

        @Nullable
        public final String getRedZone() {
            return this.redZone;
        }

        @Nullable
        public final String getResult() {
            return this.result;
        }

        @Nullable
        public final String getResultDesc() {
            return this.resultDesc;
        }

        @Nullable
        public final String getRtrName() {
            return this.rtrName;
        }

        @Nullable
        public final String getRtrSubType() {
            return this.rtrSubType;
        }

        @Nullable
        public final String getRtrType() {
            return this.rtrType;
        }

        public int hashCode() {
            Boolean bool = this.isAllowMergeFlow;
            int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
            Boolean bool2 = this.isCheckSim;
            int hashCode2 = (hashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
            Boolean bool3 = this.isFaceRecog;
            int hashCode3 = (hashCode2 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
            String str = this.invoiceAlertMethod;
            int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
            Boolean bool4 = this.defaultPaymentFreeSim;
            int hashCode5 = (hashCode4 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
            String str2 = this.dtrName;
            int hashCode6 = (hashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.dtrCode;
            int hashCode7 = (hashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.resultDesc;
            int hashCode8 = (hashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.channelSubTypeId;
            int hashCode9 = (hashCode8 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.rtrType;
            int hashCode10 = (hashCode9 + (str6 == null ? 0 : str6.hashCode())) * 31;
            String str7 = this.result;
            int hashCode11 = (hashCode10 + (str7 == null ? 0 : str7.hashCode())) * 31;
            String str8 = this.redZone;
            int hashCode12 = (hashCode11 + (str8 == null ? 0 : str8.hashCode())) * 31;
            String str9 = this.rtrName;
            int hashCode13 = (hashCode12 + (str9 == null ? 0 : str9.hashCode())) * 31;
            String str10 = this.channelTypeId;
            int hashCode14 = (hashCode13 + (str10 == null ? 0 : str10.hashCode())) * 31;
            String str11 = this.rtrSubType;
            int hashCode15 = (hashCode14 + (str11 == null ? 0 : str11.hashCode())) * 31;
            Boolean bool5 = this.isAllowManualKYC;
            int hashCode16 = (hashCode15 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
            Boolean bool6 = this.isRequireLiveness;
            int hashCode17 = (hashCode16 + (bool6 == null ? 0 : bool6.hashCode())) * 31;
            Boolean bool7 = this.isOverruleXSIM;
            return hashCode17 + (bool7 != null ? bool7.hashCode() : 0);
        }

        @Nullable
        public final Boolean isAllowManualKYC() {
            return this.isAllowManualKYC;
        }

        @Nullable
        public final Boolean isAllowMergeFlow() {
            return this.isAllowMergeFlow;
        }

        @Nullable
        public final Boolean isCheckSim() {
            return this.isCheckSim;
        }

        @Nullable
        public final Boolean isFaceRecog() {
            return this.isFaceRecog;
        }

        @Nullable
        public final Boolean isOverruleXSIM() {
            return this.isOverruleXSIM;
        }

        @Nullable
        public final Boolean isRequireLiveness() {
            return this.isRequireLiveness;
        }

        @NotNull
        public String toString() {
            Boolean bool = this.isAllowMergeFlow;
            Boolean bool2 = this.isCheckSim;
            Boolean bool3 = this.isFaceRecog;
            String str = this.invoiceAlertMethod;
            Boolean bool4 = this.defaultPaymentFreeSim;
            String str2 = this.dtrName;
            String str3 = this.dtrCode;
            String str4 = this.resultDesc;
            String str5 = this.channelSubTypeId;
            String str6 = this.rtrType;
            String str7 = this.result;
            String str8 = this.redZone;
            String str9 = this.rtrName;
            String str10 = this.channelTypeId;
            String str11 = this.rtrSubType;
            Boolean bool5 = this.isAllowManualKYC;
            Boolean bool6 = this.isRequireLiveness;
            Boolean bool7 = this.isOverruleXSIM;
            return "Data(isAllowMergeFlow=" + bool + ", isCheckSim=" + bool2 + ", isFaceRecog=" + bool3 + ", invoiceAlertMethod=" + str + ", defaultPaymentFreeSim=" + bool4 + ", dtrName=" + str2 + ", dtrCode=" + str3 + ", resultDesc=" + str4 + ", channelSubTypeId=" + str5 + ", rtrType=" + str6 + ", result=" + str7 + ", redZone=" + str8 + ", rtrName=" + str9 + ", channelTypeId=" + str10 + ", rtrSubType=" + str11 + ", isAllowManualKYC=" + bool5 + ", isRequireLiveness=" + bool6 + ", isOverruleXSIM=" + bool7 + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            parcel.writeValue(this.isAllowMergeFlow);
            parcel.writeValue(this.isCheckSim);
            parcel.writeValue(this.isFaceRecog);
            parcel.writeString(this.invoiceAlertMethod);
            parcel.writeValue(this.defaultPaymentFreeSim);
            parcel.writeString(this.dtrName);
            parcel.writeString(this.dtrCode);
            parcel.writeString(this.resultDesc);
            parcel.writeString(this.channelSubTypeId);
            parcel.writeString(this.rtrType);
            parcel.writeString(this.result);
            parcel.writeString(this.redZone);
            parcel.writeString(this.rtrName);
            parcel.writeString(this.channelTypeId);
            parcel.writeString(this.rtrSubType);
            parcel.writeValue(this.isAllowManualKYC);
            parcel.writeValue(this.isRequireLiveness);
            parcel.writeValue(this.isOverruleXSIM);
        }

        public Data(@Nullable Boolean bool, @Nullable Boolean bool2, @Nullable Boolean bool3, @Nullable String str, @Nullable Boolean bool4, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable String str10, @Nullable String str11, @Nullable Boolean bool5, @Nullable Boolean bool6, @Nullable Boolean bool7) {
            this.isAllowMergeFlow = bool;
            this.isCheckSim = bool2;
            this.isFaceRecog = bool3;
            this.invoiceAlertMethod = str;
            this.defaultPaymentFreeSim = bool4;
            this.dtrName = str2;
            this.dtrCode = str3;
            this.resultDesc = str4;
            this.channelSubTypeId = str5;
            this.rtrType = str6;
            this.result = str7;
            this.redZone = str8;
            this.rtrName = str9;
            this.channelTypeId = str10;
            this.rtrSubType = str11;
            this.isAllowManualKYC = bool5;
            this.isRequireLiveness = bool6;
            this.isOverruleXSIM = bool7;
        }

        public /* synthetic */ Data(Boolean bool, Boolean bool2, Boolean bool3, String str, Boolean bool4, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, Boolean bool5, Boolean bool6, Boolean bool7, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : bool2, (i & 4) != 0 ? null : bool3, (i & 8) != 0 ? null : str, (i & 16) != 0 ? null : bool4, (i & 32) != 0 ? null : str2, (i & 64) != 0 ? null : str3, (i & 128) != 0 ? null : str4, (i & 256) != 0 ? null : str5, (i & 512) != 0 ? null : str6, (i & 1024) != 0 ? null : str7, (i & 2048) != 0 ? null : str8, (i & 4096) != 0 ? null : str9, (i & 8192) != 0 ? null : str10, (i & 16384) != 0 ? null : str11, (i & 32768) != 0 ? null : bool5, (i & 65536) != 0 ? null : bool6, (i & 131072) != 0 ? null : bool7);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public Data(@org.jetbrains.annotations.NotNull android.os.Parcel r25) {
            /*
                r24 = this;
                r0 = r25
                java.lang.String r1 = "parcel"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
                java.lang.Class r1 = java.lang.Boolean.TYPE
                java.lang.ClassLoader r2 = r1.getClassLoader()
                java.lang.Object r2 = r0.readValue(r2)
                boolean r3 = r2 instanceof java.lang.Boolean
                r4 = 0
                if (r3 == 0) goto L1a
                java.lang.Boolean r2 = (java.lang.Boolean) r2
                r6 = r2
                goto L1b
            L1a:
                r6 = r4
            L1b:
                java.lang.ClassLoader r2 = r1.getClassLoader()
                java.lang.Object r2 = r0.readValue(r2)
                boolean r3 = r2 instanceof java.lang.Boolean
                if (r3 == 0) goto L2b
                java.lang.Boolean r2 = (java.lang.Boolean) r2
                r7 = r2
                goto L2c
            L2b:
                r7 = r4
            L2c:
                java.lang.ClassLoader r2 = r1.getClassLoader()
                java.lang.Object r2 = r0.readValue(r2)
                boolean r3 = r2 instanceof java.lang.Boolean
                if (r3 == 0) goto L3c
                java.lang.Boolean r2 = (java.lang.Boolean) r2
                r8 = r2
                goto L3d
            L3c:
                r8 = r4
            L3d:
                java.lang.String r9 = r25.readString()
                java.lang.ClassLoader r2 = r1.getClassLoader()
                java.lang.Object r2 = r0.readValue(r2)
                boolean r3 = r2 instanceof java.lang.Boolean
                if (r3 == 0) goto L51
                java.lang.Boolean r2 = (java.lang.Boolean) r2
                r10 = r2
                goto L52
            L51:
                r10 = r4
            L52:
                java.lang.String r11 = r25.readString()
                java.lang.String r12 = r25.readString()
                java.lang.String r13 = r25.readString()
                java.lang.String r14 = r25.readString()
                java.lang.String r15 = r25.readString()
                java.lang.String r16 = r25.readString()
                java.lang.String r17 = r25.readString()
                java.lang.String r18 = r25.readString()
                java.lang.String r19 = r25.readString()
                java.lang.String r20 = r25.readString()
                java.lang.ClassLoader r2 = r1.getClassLoader()
                java.lang.Object r2 = r0.readValue(r2)
                boolean r3 = r2 instanceof java.lang.Boolean
                if (r3 == 0) goto L8b
                java.lang.Boolean r2 = (java.lang.Boolean) r2
                r21 = r2
                goto L8d
            L8b:
                r21 = r4
            L8d:
                java.lang.ClassLoader r2 = r1.getClassLoader()
                java.lang.Object r2 = r0.readValue(r2)
                boolean r3 = r2 instanceof java.lang.Boolean
                if (r3 == 0) goto L9e
                java.lang.Boolean r2 = (java.lang.Boolean) r2
                r22 = r2
                goto La0
            L9e:
                r22 = r4
            La0:
                java.lang.ClassLoader r1 = r1.getClassLoader()
                java.lang.Object r0 = r0.readValue(r1)
                boolean r1 = r0 instanceof java.lang.Boolean
                if (r1 == 0) goto Laf
                r4 = r0
                java.lang.Boolean r4 = (java.lang.Boolean) r4
            Laf:
                r23 = r4
                r5 = r24
                r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: th.p047co.dtac.android.dtacone.model.appOne.postpaid.OnePostpaidRegisterAuthorizationResponse.Data.<init>(android.os.Parcel):void");
        }
    }

    public OnePostpaidRegisterAuthorizationResponse() {
        this(null, null, null, null, null, null, null, 127, null);
    }

    public static /* synthetic */ OnePostpaidRegisterAuthorizationResponse copy$default(OnePostpaidRegisterAuthorizationResponse onePostpaidRegisterAuthorizationResponse, String str, String str2, String str3, String str4, Data data, List list, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = onePostpaidRegisterAuthorizationResponse.systemMessage;
        }
        if ((i & 2) != 0) {
            str2 = onePostpaidRegisterAuthorizationResponse.code;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = onePostpaidRegisterAuthorizationResponse.codeType;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = onePostpaidRegisterAuthorizationResponse.responseDateTime;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            data = onePostpaidRegisterAuthorizationResponse.data;
        }
        Data data2 = data;
        List<String> list2 = list;
        if ((i & 32) != 0) {
            list2 = onePostpaidRegisterAuthorizationResponse.replaceMessage;
        }
        List list3 = list2;
        if ((i & 64) != 0) {
            str5 = onePostpaidRegisterAuthorizationResponse.desc;
        }
        return onePostpaidRegisterAuthorizationResponse.copy(str, str6, str7, str8, data2, list3, str5);
    }

    @Nullable
    public final String component1() {
        return this.systemMessage;
    }

    @Nullable
    public final String component2() {
        return this.code;
    }

    @Nullable
    public final String component3() {
        return this.codeType;
    }

    @Nullable
    public final String component4() {
        return this.responseDateTime;
    }

    @Nullable
    public final Data component5() {
        return this.data;
    }

    @Nullable
    public final List<String> component6() {
        return this.replaceMessage;
    }

    @Nullable
    public final String component7() {
        return this.desc;
    }

    @NotNull
    public final OnePostpaidRegisterAuthorizationResponse copy(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable Data data, @Nullable List<String> list, @Nullable String str5) {
        return new OnePostpaidRegisterAuthorizationResponse(str, str2, str3, str4, data, list, str5);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OnePostpaidRegisterAuthorizationResponse) {
            OnePostpaidRegisterAuthorizationResponse onePostpaidRegisterAuthorizationResponse = (OnePostpaidRegisterAuthorizationResponse) obj;
            return Intrinsics.areEqual(this.systemMessage, onePostpaidRegisterAuthorizationResponse.systemMessage) && Intrinsics.areEqual(this.code, onePostpaidRegisterAuthorizationResponse.code) && Intrinsics.areEqual(this.codeType, onePostpaidRegisterAuthorizationResponse.codeType) && Intrinsics.areEqual(this.responseDateTime, onePostpaidRegisterAuthorizationResponse.responseDateTime) && Intrinsics.areEqual(this.data, onePostpaidRegisterAuthorizationResponse.data) && Intrinsics.areEqual(this.replaceMessage, onePostpaidRegisterAuthorizationResponse.replaceMessage) && Intrinsics.areEqual(this.desc, onePostpaidRegisterAuthorizationResponse.desc);
        }
        return false;
    }

    @Nullable
    public final String getCode() {
        return this.code;
    }

    @Nullable
    public final String getCodeType() {
        return this.codeType;
    }

    @Nullable
    public final Data getData() {
        return this.data;
    }

    @Nullable
    public final String getDesc() {
        return this.desc;
    }

    @Nullable
    public final List<String> getReplaceMessage() {
        return this.replaceMessage;
    }

    @Nullable
    public final String getResponseDateTime() {
        return this.responseDateTime;
    }

    @Nullable
    public final String getSystemMessage() {
        return this.systemMessage;
    }

    public int hashCode() {
        String str = this.systemMessage;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.code;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.codeType;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.responseDateTime;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Data data = this.data;
        int hashCode5 = (hashCode4 + (data == null ? 0 : data.hashCode())) * 31;
        List<String> list = this.replaceMessage;
        int hashCode6 = (hashCode5 + (list == null ? 0 : list.hashCode())) * 31;
        String str5 = this.desc;
        return hashCode6 + (str5 != null ? str5.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.systemMessage;
        String str2 = this.code;
        String str3 = this.codeType;
        String str4 = this.responseDateTime;
        Data data = this.data;
        List<String> list = this.replaceMessage;
        String str5 = this.desc;
        return "OnePostpaidRegisterAuthorizationResponse(systemMessage=" + str + ", code=" + str2 + ", codeType=" + str3 + ", responseDateTime=" + str4 + ", data=" + data + ", replaceMessage=" + list + ", desc=" + str5 + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.writeString(this.systemMessage);
        parcel.writeString(this.code);
        parcel.writeString(this.codeType);
        parcel.writeString(this.responseDateTime);
        parcel.writeParcelable(this.data, i);
        parcel.writeStringList(this.replaceMessage);
        parcel.writeString(this.desc);
    }

    public OnePostpaidRegisterAuthorizationResponse(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable Data data, @Nullable List<String> list, @Nullable String str5) {
        this.systemMessage = str;
        this.code = str2;
        this.codeType = str3;
        this.responseDateTime = str4;
        this.data = data;
        this.replaceMessage = list;
        this.desc = str5;
    }

    public /* synthetic */ OnePostpaidRegisterAuthorizationResponse(String str, String str2, String str3, String str4, Data data, List list, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : data, (i & 32) != 0 ? null : list, (i & 64) != 0 ? null : str5);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public OnePostpaidRegisterAuthorizationResponse(@NotNull Parcel parcel) {
        this(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), (Data) parcel.readParcelable(Data.class.getClassLoader()), parcel.createStringArrayList(), parcel.readString());
        Intrinsics.checkNotNullParameter(parcel, "parcel");
    }
}