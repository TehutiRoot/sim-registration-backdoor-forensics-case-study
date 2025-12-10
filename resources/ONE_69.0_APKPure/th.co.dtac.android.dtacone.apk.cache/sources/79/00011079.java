package th.p047co.dtac.android.dtacone.app_one.model.prepaid_registration;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.android.parcel.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.util.Constant;

@StabilityInferred(parameters = 0)
@Parcelize
@Metadata(m29143d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0015\b\u0087\b\u0018\u00002\u00020\u0001:\u0001;Ba\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000fJ\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u000fJ\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u000fJ\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0018\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u000fJj\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u000fJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eHÖ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b#\u0010\u001dJ \u0010(\u001a\u00020'2\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b(\u0010)R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010\u000fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b-\u0010+\u001a\u0004\b.\u0010\u000fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b/\u0010+\u001a\u0004\b0\u0010\u000fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b1\u0010+\u001a\u0004\b2\u0010\u000fR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u0010\u0014R\"\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u0010\u0016R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b9\u0010+\u001a\u0004\b:\u0010\u000f¨\u0006<"}, m29142d2 = {"Lth/co/dtac/android/dtacone/app_one/model/prepaid_registration/OnePrepaidAuthorizationResponse;", "Landroid/os/Parcelable;", "", "systemMessage", "code", "codeType", "responseDateTime", "Lth/co/dtac/android/dtacone/app_one/model/prepaid_registration/OnePrepaidAuthorizationResponse$Data;", "data", "", "replaceMessage", "desc", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lth/co/dtac/android/dtacone/app_one/model/prepaid_registration/OnePrepaidAuthorizationResponse$Data;Ljava/util/List;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "()Lth/co/dtac/android/dtacone/app_one/model/prepaid_registration/OnePrepaidAuthorizationResponse$Data;", "component6", "()Ljava/util/List;", "component7", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lth/co/dtac/android/dtacone/app_one/model/prepaid_registration/OnePrepaidAuthorizationResponse$Data;Ljava/util/List;Ljava/lang/String;)Lth/co/dtac/android/dtacone/app_one/model/prepaid_registration/OnePrepaidAuthorizationResponse;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/lang/String;", "getSystemMessage", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "getCode", OperatorName.CURVE_TO, "getCodeType", "d", "getResponseDateTime", "e", "Lth/co/dtac/android/dtacone/app_one/model/prepaid_registration/OnePrepaidAuthorizationResponse$Data;", "getData", OperatorName.FILL_NON_ZERO, "Ljava/util/List;", "getReplaceMessage", OperatorName.NON_STROKING_GRAY, "getDesc", Constant.BenefitName.Data, "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.app_one.model.prepaid_registration.OnePrepaidAuthorizationResponse */
/* loaded from: classes7.dex */
public final class OnePrepaidAuthorizationResponse implements Parcelable {
    public static final int $stable = 8;
    @NotNull
    public static final Parcelable.Creator<OnePrepaidAuthorizationResponse> CREATOR = new Creator();
    @SerializedName("systemMessage")
    @Nullable

    /* renamed from: a */
    private final String f81957a;
    @SerializedName("code")
    @Nullable

    /* renamed from: b */
    private final String f81958b;
    @SerializedName("codeType")
    @Nullable

    /* renamed from: c */
    private final String f81959c;
    @SerializedName("responseDateTime")
    @Nullable

    /* renamed from: d */
    private final String f81960d;
    @SerializedName("data")
    @Nullable

    /* renamed from: e */
    private final Data f81961e;
    @SerializedName("replaceMessage")
    @Nullable

    /* renamed from: f */
    private final List<String> f81962f;
    @SerializedName("desc")
    @Nullable

    /* renamed from: g */
    private final String f81963g;

    @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.app_one.model.prepaid_registration.OnePrepaidAuthorizationResponse$Creator */
    /* loaded from: classes7.dex */
    public static final class Creator implements Parcelable.Creator<OnePrepaidAuthorizationResponse> {
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final OnePrepaidAuthorizationResponse createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new OnePrepaidAuthorizationResponse(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Data.CREATOR.createFromParcel(parcel), parcel.createStringArrayList(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        public final OnePrepaidAuthorizationResponse[] newArray(int i) {
            return new OnePrepaidAuthorizationResponse[i];
        }
    }

    @StabilityInferred(parameters = 0)
    @Parcelize
    @Metadata(m29143d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u001c\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0018\b\u0087\b\u0018\u00002\u00020\u0001B\u0097\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0013J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0013J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0017J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0017J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0017J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0017J\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0013J\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0013J\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u0013J\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u0013J \u0001\u0010 \u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\"\u0010\u0017J\u0010\u0010$\u001a\u00020#HÖ\u0001¢\u0006\u0004\b$\u0010%J\u001a\u0010(\u001a\u00020\u00022\b\u0010'\u001a\u0004\u0018\u00010&HÖ\u0003¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020#HÖ\u0001¢\u0006\u0004\b*\u0010%J \u0010/\u001a\u00020.2\u0006\u0010,\u001a\u00020+2\u0006\u0010-\u001a\u00020#HÖ\u0001¢\u0006\u0004\b/\u00100R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b\u0003\u0010\u0013R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b3\u00102\u001a\u0004\b4\u0010\u0013R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b5\u00102\u001a\u0004\b\u0005\u0010\u0013R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u0010\u0017R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b9\u00107\u001a\u0004\b:\u0010\u0017R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b;\u00107\u001a\u0004\b<\u0010\u0017R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b=\u00107\u001a\u0004\b>\u0010\u0017R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b?\u00107\u001a\u0004\b@\u0010\u0017R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\bA\u00102\u001a\u0004\bB\u0010\u0013R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\bC\u00102\u001a\u0004\b\r\u0010\u0013R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\bD\u00102\u001a\u0004\b\u000e\u0010\u0013R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\bE\u00102\u001a\u0004\b\u000f\u0010\u0013¨\u0006F"}, m29142d2 = {"Lth/co/dtac/android/dtacone/app_one/model/prepaid_registration/OnePrepaidAuthorizationResponse$Data;", "Landroid/os/Parcelable;", "", "isCheckSim", "requireFaceRecognition", "isOverruleXSim", "", "result", "resultDesc", "redZone", "autoAct", "dtrCode", "campaignFlag", "isAllowManualKYC", "isRequireLiveness", "isAllowKYC2ndLine", "<init>", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "component1", "()Ljava/lang/Boolean;", "component2", "component3", "component4", "()Ljava/lang/String;", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "copy", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lth/co/dtac/android/dtacone/app_one/model/prepaid_registration/OnePrepaidAuthorizationResponse$Data;", "toString", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/lang/Boolean;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "getRequireFaceRecognition", OperatorName.CURVE_TO, "d", "Ljava/lang/String;", "getResult", "e", "getResultDesc", OperatorName.FILL_NON_ZERO, "getRedZone", OperatorName.NON_STROKING_GRAY, "getAutoAct", OperatorName.CLOSE_PATH, "getDtrCode", "i", "getCampaignFlag", OperatorName.SET_LINE_JOINSTYLE, OperatorName.NON_STROKING_CMYK, OperatorName.LINE_TO, "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
    /* renamed from: th.co.dtac.android.dtacone.app_one.model.prepaid_registration.OnePrepaidAuthorizationResponse$Data */
    /* loaded from: classes7.dex */
    public static final class Data implements Parcelable {
        public static final int $stable = 0;
        @NotNull
        public static final Parcelable.Creator<Data> CREATOR = new Creator();
        @SerializedName("isCheckSim")
        @Nullable

        /* renamed from: a */
        private final Boolean f81964a;
        @SerializedName("requireFaceRecognition")
        @Nullable

        /* renamed from: b */
        private final Boolean f81965b;
        @SerializedName("isOverruleXSim")
        @Nullable

        /* renamed from: c */
        private final Boolean f81966c;
        @SerializedName("result")
        @Nullable

        /* renamed from: d */
        private final String f81967d;
        @SerializedName("resultDesc")
        @Nullable

        /* renamed from: e */
        private final String f81968e;
        @SerializedName("redZone")
        @Nullable

        /* renamed from: f */
        private final String f81969f;
        @SerializedName("autoAct")
        @Nullable

        /* renamed from: g */
        private final String f81970g;
        @SerializedName("dtrCode")
        @Nullable

        /* renamed from: h */
        private final String f81971h;
        @SerializedName("campaignFlag")
        @Nullable

        /* renamed from: i */
        private final Boolean f81972i;
        @SerializedName("isAllowManualKYC")
        @Nullable

        /* renamed from: j */
        private final Boolean f81973j;
        @SerializedName("isRequireLiveness")
        @Nullable

        /* renamed from: k */
        private final Boolean f81974k;
        @SerializedName("isAllowKYC2ndLine")
        @Nullable

        /* renamed from: l */
        private final Boolean f81975l;

        @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
        /* renamed from: th.co.dtac.android.dtacone.app_one.model.prepaid_registration.OnePrepaidAuthorizationResponse$Data$Creator */
        /* loaded from: classes7.dex */
        public static final class Creator implements Parcelable.Creator<Data> {
            @Override // android.os.Parcelable.Creator
            @NotNull
            public final Data createFromParcel(@NotNull Parcel parcel) {
                Boolean valueOf;
                Boolean valueOf2;
                Boolean valueOf3;
                Boolean valueOf4;
                Boolean valueOf5;
                Boolean valueOf6;
                Boolean valueOf7;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                if (parcel.readInt() == 0) {
                    valueOf = null;
                } else {
                    valueOf = Boolean.valueOf(parcel.readInt() != 0);
                }
                if (parcel.readInt() == 0) {
                    valueOf2 = null;
                } else {
                    valueOf2 = Boolean.valueOf(parcel.readInt() != 0);
                }
                if (parcel.readInt() == 0) {
                    valueOf3 = null;
                } else {
                    valueOf3 = Boolean.valueOf(parcel.readInt() != 0);
                }
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                String readString3 = parcel.readString();
                String readString4 = parcel.readString();
                String readString5 = parcel.readString();
                if (parcel.readInt() == 0) {
                    valueOf4 = null;
                } else {
                    valueOf4 = Boolean.valueOf(parcel.readInt() != 0);
                }
                if (parcel.readInt() == 0) {
                    valueOf5 = null;
                } else {
                    valueOf5 = Boolean.valueOf(parcel.readInt() != 0);
                }
                if (parcel.readInt() == 0) {
                    valueOf6 = null;
                } else {
                    valueOf6 = Boolean.valueOf(parcel.readInt() != 0);
                }
                if (parcel.readInt() == 0) {
                    valueOf7 = null;
                } else {
                    valueOf7 = Boolean.valueOf(parcel.readInt() != 0);
                }
                return new Data(valueOf, valueOf2, valueOf3, readString, readString2, readString3, readString4, readString5, valueOf4, valueOf5, valueOf6, valueOf7);
            }

            @Override // android.os.Parcelable.Creator
            @NotNull
            public final Data[] newArray(int i) {
                return new Data[i];
            }
        }

        public Data() {
            this(null, null, null, null, null, null, null, null, null, null, null, null, 4095, null);
        }

        @Nullable
        public final Boolean component1() {
            return this.f81964a;
        }

        @Nullable
        public final Boolean component10() {
            return this.f81973j;
        }

        @Nullable
        public final Boolean component11() {
            return this.f81974k;
        }

        @Nullable
        public final Boolean component12() {
            return this.f81975l;
        }

        @Nullable
        public final Boolean component2() {
            return this.f81965b;
        }

        @Nullable
        public final Boolean component3() {
            return this.f81966c;
        }

        @Nullable
        public final String component4() {
            return this.f81967d;
        }

        @Nullable
        public final String component5() {
            return this.f81968e;
        }

        @Nullable
        public final String component6() {
            return this.f81969f;
        }

        @Nullable
        public final String component7() {
            return this.f81970g;
        }

        @Nullable
        public final String component8() {
            return this.f81971h;
        }

        @Nullable
        public final Boolean component9() {
            return this.f81972i;
        }

        @NotNull
        public final Data copy(@Nullable Boolean bool, @Nullable Boolean bool2, @Nullable Boolean bool3, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable Boolean bool4, @Nullable Boolean bool5, @Nullable Boolean bool6, @Nullable Boolean bool7) {
            return new Data(bool, bool2, bool3, str, str2, str3, str4, str5, bool4, bool5, bool6, bool7);
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
                return Intrinsics.areEqual(this.f81964a, data.f81964a) && Intrinsics.areEqual(this.f81965b, data.f81965b) && Intrinsics.areEqual(this.f81966c, data.f81966c) && Intrinsics.areEqual(this.f81967d, data.f81967d) && Intrinsics.areEqual(this.f81968e, data.f81968e) && Intrinsics.areEqual(this.f81969f, data.f81969f) && Intrinsics.areEqual(this.f81970g, data.f81970g) && Intrinsics.areEqual(this.f81971h, data.f81971h) && Intrinsics.areEqual(this.f81972i, data.f81972i) && Intrinsics.areEqual(this.f81973j, data.f81973j) && Intrinsics.areEqual(this.f81974k, data.f81974k) && Intrinsics.areEqual(this.f81975l, data.f81975l);
            }
            return false;
        }

        @Nullable
        public final String getAutoAct() {
            return this.f81970g;
        }

        @Nullable
        public final Boolean getCampaignFlag() {
            return this.f81972i;
        }

        @Nullable
        public final String getDtrCode() {
            return this.f81971h;
        }

        @Nullable
        public final String getRedZone() {
            return this.f81969f;
        }

        @Nullable
        public final Boolean getRequireFaceRecognition() {
            return this.f81965b;
        }

        @Nullable
        public final String getResult() {
            return this.f81967d;
        }

        @Nullable
        public final String getResultDesc() {
            return this.f81968e;
        }

        public int hashCode() {
            Boolean bool = this.f81964a;
            int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
            Boolean bool2 = this.f81965b;
            int hashCode2 = (hashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
            Boolean bool3 = this.f81966c;
            int hashCode3 = (hashCode2 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
            String str = this.f81967d;
            int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f81968e;
            int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f81969f;
            int hashCode6 = (hashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.f81970g;
            int hashCode7 = (hashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.f81971h;
            int hashCode8 = (hashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
            Boolean bool4 = this.f81972i;
            int hashCode9 = (hashCode8 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
            Boolean bool5 = this.f81973j;
            int hashCode10 = (hashCode9 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
            Boolean bool6 = this.f81974k;
            int hashCode11 = (hashCode10 + (bool6 == null ? 0 : bool6.hashCode())) * 31;
            Boolean bool7 = this.f81975l;
            return hashCode11 + (bool7 != null ? bool7.hashCode() : 0);
        }

        @Nullable
        public final Boolean isAllowKYC2ndLine() {
            return this.f81975l;
        }

        @Nullable
        public final Boolean isAllowManualKYC() {
            return this.f81973j;
        }

        @Nullable
        public final Boolean isCheckSim() {
            return this.f81964a;
        }

        @Nullable
        public final Boolean isOverruleXSim() {
            return this.f81966c;
        }

        @Nullable
        public final Boolean isRequireLiveness() {
            return this.f81974k;
        }

        @NotNull
        public String toString() {
            Boolean bool = this.f81964a;
            Boolean bool2 = this.f81965b;
            Boolean bool3 = this.f81966c;
            String str = this.f81967d;
            String str2 = this.f81968e;
            String str3 = this.f81969f;
            String str4 = this.f81970g;
            String str5 = this.f81971h;
            Boolean bool4 = this.f81972i;
            Boolean bool5 = this.f81973j;
            Boolean bool6 = this.f81974k;
            Boolean bool7 = this.f81975l;
            return "Data(isCheckSim=" + bool + ", requireFaceRecognition=" + bool2 + ", isOverruleXSim=" + bool3 + ", result=" + str + ", resultDesc=" + str2 + ", redZone=" + str3 + ", autoAct=" + str4 + ", dtrCode=" + str5 + ", campaignFlag=" + bool4 + ", isAllowManualKYC=" + bool5 + ", isRequireLiveness=" + bool6 + ", isAllowKYC2ndLine=" + bool7 + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@NotNull Parcel out, int i) {
            Intrinsics.checkNotNullParameter(out, "out");
            Boolean bool = this.f81964a;
            if (bool == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                out.writeInt(bool.booleanValue() ? 1 : 0);
            }
            Boolean bool2 = this.f81965b;
            if (bool2 == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                out.writeInt(bool2.booleanValue() ? 1 : 0);
            }
            Boolean bool3 = this.f81966c;
            if (bool3 == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                out.writeInt(bool3.booleanValue() ? 1 : 0);
            }
            out.writeString(this.f81967d);
            out.writeString(this.f81968e);
            out.writeString(this.f81969f);
            out.writeString(this.f81970g);
            out.writeString(this.f81971h);
            Boolean bool4 = this.f81972i;
            if (bool4 == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                out.writeInt(bool4.booleanValue() ? 1 : 0);
            }
            Boolean bool5 = this.f81973j;
            if (bool5 == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                out.writeInt(bool5.booleanValue() ? 1 : 0);
            }
            Boolean bool6 = this.f81974k;
            if (bool6 == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                out.writeInt(bool6.booleanValue() ? 1 : 0);
            }
            Boolean bool7 = this.f81975l;
            if (bool7 == null) {
                out.writeInt(0);
                return;
            }
            out.writeInt(1);
            out.writeInt(bool7.booleanValue() ? 1 : 0);
        }

        public Data(@Nullable Boolean bool, @Nullable Boolean bool2, @Nullable Boolean bool3, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable Boolean bool4, @Nullable Boolean bool5, @Nullable Boolean bool6, @Nullable Boolean bool7) {
            this.f81964a = bool;
            this.f81965b = bool2;
            this.f81966c = bool3;
            this.f81967d = str;
            this.f81968e = str2;
            this.f81969f = str3;
            this.f81970g = str4;
            this.f81971h = str5;
            this.f81972i = bool4;
            this.f81973j = bool5;
            this.f81974k = bool6;
            this.f81975l = bool7;
        }

        public /* synthetic */ Data(Boolean bool, Boolean bool2, Boolean bool3, String str, String str2, String str3, String str4, String str5, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : bool2, (i & 4) != 0 ? null : bool3, (i & 8) != 0 ? null : str, (i & 16) != 0 ? null : str2, (i & 32) != 0 ? null : str3, (i & 64) != 0 ? null : str4, (i & 128) != 0 ? null : str5, (i & 256) != 0 ? null : bool4, (i & 512) != 0 ? null : bool5, (i & 1024) != 0 ? null : bool6, (i & 2048) == 0 ? bool7 : null);
        }
    }

    public OnePrepaidAuthorizationResponse() {
        this(null, null, null, null, null, null, null, 127, null);
    }

    public static /* synthetic */ OnePrepaidAuthorizationResponse copy$default(OnePrepaidAuthorizationResponse onePrepaidAuthorizationResponse, String str, String str2, String str3, String str4, Data data, List list, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = onePrepaidAuthorizationResponse.f81957a;
        }
        if ((i & 2) != 0) {
            str2 = onePrepaidAuthorizationResponse.f81958b;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = onePrepaidAuthorizationResponse.f81959c;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = onePrepaidAuthorizationResponse.f81960d;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            data = onePrepaidAuthorizationResponse.f81961e;
        }
        Data data2 = data;
        List<String> list2 = list;
        if ((i & 32) != 0) {
            list2 = onePrepaidAuthorizationResponse.f81962f;
        }
        List list3 = list2;
        if ((i & 64) != 0) {
            str5 = onePrepaidAuthorizationResponse.f81963g;
        }
        return onePrepaidAuthorizationResponse.copy(str, str6, str7, str8, data2, list3, str5);
    }

    @Nullable
    public final String component1() {
        return this.f81957a;
    }

    @Nullable
    public final String component2() {
        return this.f81958b;
    }

    @Nullable
    public final String component3() {
        return this.f81959c;
    }

    @Nullable
    public final String component4() {
        return this.f81960d;
    }

    @Nullable
    public final Data component5() {
        return this.f81961e;
    }

    @Nullable
    public final List<String> component6() {
        return this.f81962f;
    }

    @Nullable
    public final String component7() {
        return this.f81963g;
    }

    @NotNull
    public final OnePrepaidAuthorizationResponse copy(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable Data data, @Nullable List<String> list, @Nullable String str5) {
        return new OnePrepaidAuthorizationResponse(str, str2, str3, str4, data, list, str5);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OnePrepaidAuthorizationResponse) {
            OnePrepaidAuthorizationResponse onePrepaidAuthorizationResponse = (OnePrepaidAuthorizationResponse) obj;
            return Intrinsics.areEqual(this.f81957a, onePrepaidAuthorizationResponse.f81957a) && Intrinsics.areEqual(this.f81958b, onePrepaidAuthorizationResponse.f81958b) && Intrinsics.areEqual(this.f81959c, onePrepaidAuthorizationResponse.f81959c) && Intrinsics.areEqual(this.f81960d, onePrepaidAuthorizationResponse.f81960d) && Intrinsics.areEqual(this.f81961e, onePrepaidAuthorizationResponse.f81961e) && Intrinsics.areEqual(this.f81962f, onePrepaidAuthorizationResponse.f81962f) && Intrinsics.areEqual(this.f81963g, onePrepaidAuthorizationResponse.f81963g);
        }
        return false;
    }

    @Nullable
    public final String getCode() {
        return this.f81958b;
    }

    @Nullable
    public final String getCodeType() {
        return this.f81959c;
    }

    @Nullable
    public final Data getData() {
        return this.f81961e;
    }

    @Nullable
    public final String getDesc() {
        return this.f81963g;
    }

    @Nullable
    public final List<String> getReplaceMessage() {
        return this.f81962f;
    }

    @Nullable
    public final String getResponseDateTime() {
        return this.f81960d;
    }

    @Nullable
    public final String getSystemMessage() {
        return this.f81957a;
    }

    public int hashCode() {
        String str = this.f81957a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f81958b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f81959c;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f81960d;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Data data = this.f81961e;
        int hashCode5 = (hashCode4 + (data == null ? 0 : data.hashCode())) * 31;
        List<String> list = this.f81962f;
        int hashCode6 = (hashCode5 + (list == null ? 0 : list.hashCode())) * 31;
        String str5 = this.f81963g;
        return hashCode6 + (str5 != null ? str5.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.f81957a;
        String str2 = this.f81958b;
        String str3 = this.f81959c;
        String str4 = this.f81960d;
        Data data = this.f81961e;
        List<String> list = this.f81962f;
        String str5 = this.f81963g;
        return "OnePrepaidAuthorizationResponse(systemMessage=" + str + ", code=" + str2 + ", codeType=" + str3 + ", responseDateTime=" + str4 + ", data=" + data + ", replaceMessage=" + list + ", desc=" + str5 + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(this.f81957a);
        out.writeString(this.f81958b);
        out.writeString(this.f81959c);
        out.writeString(this.f81960d);
        Data data = this.f81961e;
        if (data == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            data.writeToParcel(out, i);
        }
        out.writeStringList(this.f81962f);
        out.writeString(this.f81963g);
    }

    public OnePrepaidAuthorizationResponse(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable Data data, @Nullable List<String> list, @Nullable String str5) {
        this.f81957a = str;
        this.f81958b = str2;
        this.f81959c = str3;
        this.f81960d = str4;
        this.f81961e = data;
        this.f81962f = list;
        this.f81963g = str5;
    }

    public /* synthetic */ OnePrepaidAuthorizationResponse(String str, String str2, String str3, String str4, Data data, List list, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : data, (i & 32) != 0 ? null : list, (i & 64) != 0 ? null : str5);
    }
}