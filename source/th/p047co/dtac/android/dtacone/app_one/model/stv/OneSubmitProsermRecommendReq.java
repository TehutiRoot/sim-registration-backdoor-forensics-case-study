package th.p047co.dtac.android.dtacone.app_one.model.stv;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.android.parcel.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.manager.security.OneSecurePin;
import th.p047co.dtac.android.dtacone.model.customerenquiry.RequestKt;
import th.p047co.dtac.android.dtacone.view.fragment.mrtr_prepaid_registration.family_sim.InputPostpaidFamilySimSubscriberFragment;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\"\n\u0002\u0010\u000b\n\u0002\b'\b\u0087\b\u0018\u00002\u00020\u0001:\u0001UB\u008f\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0018J\u0010\u0010\u001b\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b#\u0010\u0018J\u0012\u0010$\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b$\u0010\u0018J\u0010\u0010%\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b%\u0010\u0018J\u0010\u0010&\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b&\u0010\u0018J\u0010\u0010'\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b'\u0010\u0018J\u0010\u0010(\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b(\u0010\u0018J\u0010\u0010)\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b)\u0010\u0018J¨\u0001\u0010*\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\u00022\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0010\u001a\u00020\u00022\b\b\u0002\u0010\u0011\u001a\u00020\u00022\b\b\u0002\u0010\u0012\u001a\u00020\u00022\b\b\u0002\u0010\u0013\u001a\u00020\u00022\b\b\u0002\u0010\u0014\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b,\u0010\u0018J\u0010\u0010-\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b-\u0010\"J\u001a\u00100\u001a\u00020/2\b\u0010.\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b0\u00101R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u0010\u0018R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b5\u00103\u001a\u0004\b6\u0010\u0018R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b7\u00103\u001a\u0004\b8\u0010\u0018R\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010\u001cR\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010\u001eR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\bA\u0010 R\u001a\u0010\r\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010\"R\"\u0010\u000e\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bE\u00103\u001a\u0004\bF\u0010\u0018\"\u0004\bG\u0010HR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\bI\u00103\u001a\u0004\bJ\u0010\u0018R\u001a\u0010\u0010\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\bK\u00103\u001a\u0004\bL\u0010\u0018R\u001a\u0010\u0011\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\bM\u00103\u001a\u0004\bN\u0010\u0018R\u001a\u0010\u0012\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\bO\u00103\u001a\u0004\bP\u0010\u0018R\u001a\u0010\u0013\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\bQ\u00103\u001a\u0004\bR\u0010\u0018R\u001a\u0010\u0014\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\bS\u00103\u001a\u0004\bT\u0010\u0018¨\u0006V"}, m28850d2 = {"Lth/co/dtac/android/dtacone/app_one/model/stv/OneSubmitProsermRecommendReq;", "", "", "packageCode", "ussdServiceCode", InputPostpaidFamilySimSubscriberFragment.SUB_NUM, "Lth/co/dtac/android/dtacone/manager/security/OneSecurePin;", "pin", "Lth/co/dtac/android/dtacone/app_one/model/stv/OneSubmitProsermRecommendReq$OneProsermRecommendInfo;", "proserm", "", "commissionValue", "", "seq", "confirmMultiTrans", "togglePrepaidEnable", "requesterChannel", "requesterApplication", "requesterZone", "requesterId", "userCode", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lth/co/dtac/android/dtacone/manager/security/OneSecurePin;Lth/co/dtac/android/dtacone/app_one/model/stv/OneSubmitProsermRecommendReq$OneProsermRecommendInfo;Ljava/lang/Float;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Lth/co/dtac/android/dtacone/manager/security/OneSecurePin;", "component5", "()Lth/co/dtac/android/dtacone/app_one/model/stv/OneSubmitProsermRecommendReq$OneProsermRecommendInfo;", "component6", "()Ljava/lang/Float;", "component7", "()I", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lth/co/dtac/android/dtacone/manager/security/OneSecurePin;Lth/co/dtac/android/dtacone/app_one/model/stv/OneSubmitProsermRecommendReq$OneProsermRecommendInfo;Ljava/lang/Float;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lth/co/dtac/android/dtacone/app_one/model/stv/OneSubmitProsermRecommendReq;", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/lang/String;", "getPackageCode", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "getUssdServiceCode", OperatorName.CURVE_TO, "getSubscriberNumber", "d", "Lth/co/dtac/android/dtacone/manager/security/OneSecurePin;", "getPin", "e", "Lth/co/dtac/android/dtacone/app_one/model/stv/OneSubmitProsermRecommendReq$OneProsermRecommendInfo;", "getProserm", OperatorName.FILL_NON_ZERO, "Ljava/lang/Float;", "getCommissionValue", OperatorName.NON_STROKING_GRAY, "I", "getSeq", OperatorName.CLOSE_PATH, "getConfirmMultiTrans", "setConfirmMultiTrans", "(Ljava/lang/String;)V", "i", "getTogglePrepaidEnable", OperatorName.SET_LINE_JOINSTYLE, "getRequesterChannel", OperatorName.NON_STROKING_CMYK, "getRequesterApplication", OperatorName.LINE_TO, "getRequesterZone", OperatorName.MOVE_TO, "getRequesterId", OperatorName.ENDPATH, "getUserCode", "OneProsermRecommendInfo", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.app_one.model.stv.OneSubmitProsermRecommendReq */
/* loaded from: classes7.dex */
public final class OneSubmitProsermRecommendReq {
    public static final int $stable = 8;
    @SerializedName("packageCode")
    @Nullable

    /* renamed from: a */
    private final String f82226a;
    @SerializedName("ussdServiceCode")
    @Nullable

    /* renamed from: b */
    private final String f82227b;
    @SerializedName(InputPostpaidFamilySimSubscriberFragment.SUB_NUM)
    @Nullable

    /* renamed from: c */
    private final String f82228c;
    @SerializedName("pin")
    @NotNull

    /* renamed from: d */
    private final OneSecurePin f82229d;
    @SerializedName("proserm")
    @Nullable

    /* renamed from: e */
    private final OneProsermRecommendInfo f82230e;
    @SerializedName("commissionValue")
    @Nullable

    /* renamed from: f */
    private final Float f82231f;
    @SerializedName("seq")

    /* renamed from: g */
    private final int f82232g;
    @SerializedName("confirmMultiTrans")
    @NotNull

    /* renamed from: h */
    private String f82233h;
    @SerializedName("togglePrepaidEnable")
    @Nullable

    /* renamed from: i */
    private final String f82234i;
    @SerializedName("requesterChannel")
    @NotNull

    /* renamed from: j */
    private final String f82235j;
    @SerializedName("requesterApplication")
    @NotNull

    /* renamed from: k */
    private final String f82236k;
    @SerializedName("requesterZone")
    @NotNull

    /* renamed from: l */
    private final String f82237l;
    @SerializedName("requesterId")
    @NotNull

    /* renamed from: m */
    private final String f82238m;
    @SerializedName("userCode")
    @NotNull

    /* renamed from: n */
    private final String f82239n;

    public OneSubmitProsermRecommendReq(@Nullable String str, @Nullable String str2, @Nullable String str3, @NotNull OneSecurePin pin, @Nullable OneProsermRecommendInfo oneProsermRecommendInfo, @Nullable Float f, int i, @NotNull String confirmMultiTrans, @Nullable String str4, @NotNull String requesterChannel, @NotNull String requesterApplication, @NotNull String requesterZone, @NotNull String requesterId, @NotNull String userCode) {
        Intrinsics.checkNotNullParameter(pin, "pin");
        Intrinsics.checkNotNullParameter(confirmMultiTrans, "confirmMultiTrans");
        Intrinsics.checkNotNullParameter(requesterChannel, "requesterChannel");
        Intrinsics.checkNotNullParameter(requesterApplication, "requesterApplication");
        Intrinsics.checkNotNullParameter(requesterZone, "requesterZone");
        Intrinsics.checkNotNullParameter(requesterId, "requesterId");
        Intrinsics.checkNotNullParameter(userCode, "userCode");
        this.f82226a = str;
        this.f82227b = str2;
        this.f82228c = str3;
        this.f82229d = pin;
        this.f82230e = oneProsermRecommendInfo;
        this.f82231f = f;
        this.f82232g = i;
        this.f82233h = confirmMultiTrans;
        this.f82234i = str4;
        this.f82235j = requesterChannel;
        this.f82236k = requesterApplication;
        this.f82237l = requesterZone;
        this.f82238m = requesterId;
        this.f82239n = userCode;
    }

    @Nullable
    public final String component1() {
        return this.f82226a;
    }

    @NotNull
    public final String component10() {
        return this.f82235j;
    }

    @NotNull
    public final String component11() {
        return this.f82236k;
    }

    @NotNull
    public final String component12() {
        return this.f82237l;
    }

    @NotNull
    public final String component13() {
        return this.f82238m;
    }

    @NotNull
    public final String component14() {
        return this.f82239n;
    }

    @Nullable
    public final String component2() {
        return this.f82227b;
    }

    @Nullable
    public final String component3() {
        return this.f82228c;
    }

    @NotNull
    public final OneSecurePin component4() {
        return this.f82229d;
    }

    @Nullable
    public final OneProsermRecommendInfo component5() {
        return this.f82230e;
    }

    @Nullable
    public final Float component6() {
        return this.f82231f;
    }

    public final int component7() {
        return this.f82232g;
    }

    @NotNull
    public final String component8() {
        return this.f82233h;
    }

    @Nullable
    public final String component9() {
        return this.f82234i;
    }

    @NotNull
    public final OneSubmitProsermRecommendReq copy(@Nullable String str, @Nullable String str2, @Nullable String str3, @NotNull OneSecurePin pin, @Nullable OneProsermRecommendInfo oneProsermRecommendInfo, @Nullable Float f, int i, @NotNull String confirmMultiTrans, @Nullable String str4, @NotNull String requesterChannel, @NotNull String requesterApplication, @NotNull String requesterZone, @NotNull String requesterId, @NotNull String userCode) {
        Intrinsics.checkNotNullParameter(pin, "pin");
        Intrinsics.checkNotNullParameter(confirmMultiTrans, "confirmMultiTrans");
        Intrinsics.checkNotNullParameter(requesterChannel, "requesterChannel");
        Intrinsics.checkNotNullParameter(requesterApplication, "requesterApplication");
        Intrinsics.checkNotNullParameter(requesterZone, "requesterZone");
        Intrinsics.checkNotNullParameter(requesterId, "requesterId");
        Intrinsics.checkNotNullParameter(userCode, "userCode");
        return new OneSubmitProsermRecommendReq(str, str2, str3, pin, oneProsermRecommendInfo, f, i, confirmMultiTrans, str4, requesterChannel, requesterApplication, requesterZone, requesterId, userCode);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OneSubmitProsermRecommendReq) {
            OneSubmitProsermRecommendReq oneSubmitProsermRecommendReq = (OneSubmitProsermRecommendReq) obj;
            return Intrinsics.areEqual(this.f82226a, oneSubmitProsermRecommendReq.f82226a) && Intrinsics.areEqual(this.f82227b, oneSubmitProsermRecommendReq.f82227b) && Intrinsics.areEqual(this.f82228c, oneSubmitProsermRecommendReq.f82228c) && Intrinsics.areEqual(this.f82229d, oneSubmitProsermRecommendReq.f82229d) && Intrinsics.areEqual(this.f82230e, oneSubmitProsermRecommendReq.f82230e) && Intrinsics.areEqual((Object) this.f82231f, (Object) oneSubmitProsermRecommendReq.f82231f) && this.f82232g == oneSubmitProsermRecommendReq.f82232g && Intrinsics.areEqual(this.f82233h, oneSubmitProsermRecommendReq.f82233h) && Intrinsics.areEqual(this.f82234i, oneSubmitProsermRecommendReq.f82234i) && Intrinsics.areEqual(this.f82235j, oneSubmitProsermRecommendReq.f82235j) && Intrinsics.areEqual(this.f82236k, oneSubmitProsermRecommendReq.f82236k) && Intrinsics.areEqual(this.f82237l, oneSubmitProsermRecommendReq.f82237l) && Intrinsics.areEqual(this.f82238m, oneSubmitProsermRecommendReq.f82238m) && Intrinsics.areEqual(this.f82239n, oneSubmitProsermRecommendReq.f82239n);
        }
        return false;
    }

    @Nullable
    public final Float getCommissionValue() {
        return this.f82231f;
    }

    @NotNull
    public final String getConfirmMultiTrans() {
        return this.f82233h;
    }

    @Nullable
    public final String getPackageCode() {
        return this.f82226a;
    }

    @NotNull
    public final OneSecurePin getPin() {
        return this.f82229d;
    }

    @Nullable
    public final OneProsermRecommendInfo getProserm() {
        return this.f82230e;
    }

    @NotNull
    public final String getRequesterApplication() {
        return this.f82236k;
    }

    @NotNull
    public final String getRequesterChannel() {
        return this.f82235j;
    }

    @NotNull
    public final String getRequesterId() {
        return this.f82238m;
    }

    @NotNull
    public final String getRequesterZone() {
        return this.f82237l;
    }

    public final int getSeq() {
        return this.f82232g;
    }

    @Nullable
    public final String getSubscriberNumber() {
        return this.f82228c;
    }

    @Nullable
    public final String getTogglePrepaidEnable() {
        return this.f82234i;
    }

    @NotNull
    public final String getUserCode() {
        return this.f82239n;
    }

    @Nullable
    public final String getUssdServiceCode() {
        return this.f82227b;
    }

    public int hashCode() {
        String str = this.f82226a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f82227b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f82228c;
        int hashCode3 = (((hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.f82229d.hashCode()) * 31;
        OneProsermRecommendInfo oneProsermRecommendInfo = this.f82230e;
        int hashCode4 = (hashCode3 + (oneProsermRecommendInfo == null ? 0 : oneProsermRecommendInfo.hashCode())) * 31;
        Float f = this.f82231f;
        int hashCode5 = (((((hashCode4 + (f == null ? 0 : f.hashCode())) * 31) + this.f82232g) * 31) + this.f82233h.hashCode()) * 31;
        String str4 = this.f82234i;
        return ((((((((((hashCode5 + (str4 != null ? str4.hashCode() : 0)) * 31) + this.f82235j.hashCode()) * 31) + this.f82236k.hashCode()) * 31) + this.f82237l.hashCode()) * 31) + this.f82238m.hashCode()) * 31) + this.f82239n.hashCode();
    }

    public final void setConfirmMultiTrans(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.f82233h = str;
    }

    @NotNull
    public String toString() {
        String str = this.f82226a;
        String str2 = this.f82227b;
        String str3 = this.f82228c;
        OneSecurePin oneSecurePin = this.f82229d;
        OneProsermRecommendInfo oneProsermRecommendInfo = this.f82230e;
        Float f = this.f82231f;
        int i = this.f82232g;
        String str4 = this.f82233h;
        String str5 = this.f82234i;
        String str6 = this.f82235j;
        String str7 = this.f82236k;
        String str8 = this.f82237l;
        String str9 = this.f82238m;
        String str10 = this.f82239n;
        return "OneSubmitProsermRecommendReq(packageCode=" + str + ", ussdServiceCode=" + str2 + ", subscriberNumber=" + str3 + ", pin=" + oneSecurePin + ", proserm=" + oneProsermRecommendInfo + ", commissionValue=" + f + ", seq=" + i + ", confirmMultiTrans=" + str4 + ", togglePrepaidEnable=" + str5 + ", requesterChannel=" + str6 + ", requesterApplication=" + str7 + ", requesterZone=" + str8 + ", requesterId=" + str9 + ", userCode=" + str10 + ")";
    }

    @StabilityInferred(parameters = 0)
    @Parcelize
    @Metadata(m28851d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\rJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\rJ\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\rJ\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\rJ\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\rJ^\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\rJ\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u0019J \u0010$\u001a\u00020#2\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b$\u0010%R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010\rR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b)\u0010'\u001a\u0004\b*\u0010\rR\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b+\u0010'\u001a\u0004\b,\u0010\rR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b-\u0010'\u001a\u0004\b.\u0010\rR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b/\u0010'\u001a\u0004\b0\u0010\rR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b1\u0010'\u001a\u0004\b2\u0010\rR\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b3\u0010'\u001a\u0004\b4\u0010\r¨\u00065"}, m28850d2 = {"Lth/co/dtac/android/dtacone/app_one/model/stv/OneSubmitProsermRecommendReq$OneProsermRecommendInfo;", "Landroid/os/Parcelable;", "", "transactionIdSift", "flowId", "type", "campaignID", "offerPOID", "requesterLocation", "ipkCode", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lth/co/dtac/android/dtacone/app_one/model/stv/OneSubmitProsermRecommendReq$OneProsermRecommendInfo;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/lang/String;", "getTransactionIdSift", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "getFlowId", OperatorName.CURVE_TO, "getType", "d", "getCampaignID", "e", "getOfferPOID", OperatorName.FILL_NON_ZERO, "getRequesterLocation", OperatorName.NON_STROKING_GRAY, "getIpkCode", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0})
    /* renamed from: th.co.dtac.android.dtacone.app_one.model.stv.OneSubmitProsermRecommendReq$OneProsermRecommendInfo */
    /* loaded from: classes7.dex */
    public static final class OneProsermRecommendInfo implements Parcelable {
        public static final int $stable = 0;
        @NotNull
        public static final Parcelable.Creator<OneProsermRecommendInfo> CREATOR = new Creator();
        @SerializedName("transactionIdSift")
        @NotNull

        /* renamed from: a */
        private final String f82240a;
        @SerializedName("flowId")
        @NotNull

        /* renamed from: b */
        private final String f82241b;
        @SerializedName("type")
        @NotNull

        /* renamed from: c */
        private final String f82242c;
        @SerializedName("campaignID")
        @Nullable

        /* renamed from: d */
        private final String f82243d;
        @SerializedName("offerPOID")
        @Nullable

        /* renamed from: e */
        private final String f82244e;
        @SerializedName("requesterLocation")
        @Nullable

        /* renamed from: f */
        private final String f82245f;
        @SerializedName("ipkCode")
        @Nullable

        /* renamed from: g */
        private final String f82246g;

        @Metadata(m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
        /* renamed from: th.co.dtac.android.dtacone.app_one.model.stv.OneSubmitProsermRecommendReq$OneProsermRecommendInfo$Creator */
        /* loaded from: classes7.dex */
        public static final class Creator implements Parcelable.Creator<OneProsermRecommendInfo> {
            @Override // android.os.Parcelable.Creator
            @NotNull
            public final OneProsermRecommendInfo createFromParcel(@NotNull Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new OneProsermRecommendInfo(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            @NotNull
            public final OneProsermRecommendInfo[] newArray(int i) {
                return new OneProsermRecommendInfo[i];
            }
        }

        public OneProsermRecommendInfo(@NotNull String transactionIdSift, @NotNull String flowId, @NotNull String type, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4) {
            Intrinsics.checkNotNullParameter(transactionIdSift, "transactionIdSift");
            Intrinsics.checkNotNullParameter(flowId, "flowId");
            Intrinsics.checkNotNullParameter(type, "type");
            this.f82240a = transactionIdSift;
            this.f82241b = flowId;
            this.f82242c = type;
            this.f82243d = str;
            this.f82244e = str2;
            this.f82245f = str3;
            this.f82246g = str4;
        }

        public static /* synthetic */ OneProsermRecommendInfo copy$default(OneProsermRecommendInfo oneProsermRecommendInfo, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, Object obj) {
            if ((i & 1) != 0) {
                str = oneProsermRecommendInfo.f82240a;
            }
            if ((i & 2) != 0) {
                str2 = oneProsermRecommendInfo.f82241b;
            }
            String str8 = str2;
            if ((i & 4) != 0) {
                str3 = oneProsermRecommendInfo.f82242c;
            }
            String str9 = str3;
            if ((i & 8) != 0) {
                str4 = oneProsermRecommendInfo.f82243d;
            }
            String str10 = str4;
            if ((i & 16) != 0) {
                str5 = oneProsermRecommendInfo.f82244e;
            }
            String str11 = str5;
            if ((i & 32) != 0) {
                str6 = oneProsermRecommendInfo.f82245f;
            }
            String str12 = str6;
            if ((i & 64) != 0) {
                str7 = oneProsermRecommendInfo.f82246g;
            }
            return oneProsermRecommendInfo.copy(str, str8, str9, str10, str11, str12, str7);
        }

        @NotNull
        public final String component1() {
            return this.f82240a;
        }

        @NotNull
        public final String component2() {
            return this.f82241b;
        }

        @NotNull
        public final String component3() {
            return this.f82242c;
        }

        @Nullable
        public final String component4() {
            return this.f82243d;
        }

        @Nullable
        public final String component5() {
            return this.f82244e;
        }

        @Nullable
        public final String component6() {
            return this.f82245f;
        }

        @Nullable
        public final String component7() {
            return this.f82246g;
        }

        @NotNull
        public final OneProsermRecommendInfo copy(@NotNull String transactionIdSift, @NotNull String flowId, @NotNull String type, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4) {
            Intrinsics.checkNotNullParameter(transactionIdSift, "transactionIdSift");
            Intrinsics.checkNotNullParameter(flowId, "flowId");
            Intrinsics.checkNotNullParameter(type, "type");
            return new OneProsermRecommendInfo(transactionIdSift, flowId, type, str, str2, str3, str4);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof OneProsermRecommendInfo) {
                OneProsermRecommendInfo oneProsermRecommendInfo = (OneProsermRecommendInfo) obj;
                return Intrinsics.areEqual(this.f82240a, oneProsermRecommendInfo.f82240a) && Intrinsics.areEqual(this.f82241b, oneProsermRecommendInfo.f82241b) && Intrinsics.areEqual(this.f82242c, oneProsermRecommendInfo.f82242c) && Intrinsics.areEqual(this.f82243d, oneProsermRecommendInfo.f82243d) && Intrinsics.areEqual(this.f82244e, oneProsermRecommendInfo.f82244e) && Intrinsics.areEqual(this.f82245f, oneProsermRecommendInfo.f82245f) && Intrinsics.areEqual(this.f82246g, oneProsermRecommendInfo.f82246g);
            }
            return false;
        }

        @Nullable
        public final String getCampaignID() {
            return this.f82243d;
        }

        @NotNull
        public final String getFlowId() {
            return this.f82241b;
        }

        @Nullable
        public final String getIpkCode() {
            return this.f82246g;
        }

        @Nullable
        public final String getOfferPOID() {
            return this.f82244e;
        }

        @Nullable
        public final String getRequesterLocation() {
            return this.f82245f;
        }

        @NotNull
        public final String getTransactionIdSift() {
            return this.f82240a;
        }

        @NotNull
        public final String getType() {
            return this.f82242c;
        }

        public int hashCode() {
            int hashCode = ((((this.f82240a.hashCode() * 31) + this.f82241b.hashCode()) * 31) + this.f82242c.hashCode()) * 31;
            String str = this.f82243d;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f82244e;
            int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f82245f;
            int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.f82246g;
            return hashCode4 + (str4 != null ? str4.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            String str = this.f82240a;
            String str2 = this.f82241b;
            String str3 = this.f82242c;
            String str4 = this.f82243d;
            String str5 = this.f82244e;
            String str6 = this.f82245f;
            String str7 = this.f82246g;
            return "OneProsermRecommendInfo(transactionIdSift=" + str + ", flowId=" + str2 + ", type=" + str3 + ", campaignID=" + str4 + ", offerPOID=" + str5 + ", requesterLocation=" + str6 + ", ipkCode=" + str7 + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@NotNull Parcel out, int i) {
            Intrinsics.checkNotNullParameter(out, "out");
            out.writeString(this.f82240a);
            out.writeString(this.f82241b);
            out.writeString(this.f82242c);
            out.writeString(this.f82243d);
            out.writeString(this.f82244e);
            out.writeString(this.f82245f);
            out.writeString(this.f82246g);
        }

        public /* synthetic */ OneProsermRecommendInfo(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? "" : str7);
        }
    }

    public /* synthetic */ OneSubmitProsermRecommendReq(String str, String str2, String str3, OneSecurePin oneSecurePin, OneProsermRecommendInfo oneProsermRecommendInfo, Float f, int i, String str4, String str5, String str6, String str7, String str8, String str9, String str10, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, oneSecurePin, oneProsermRecommendInfo, f, i, str4, (i2 & 256) != 0 ? null : str5, (i2 & 512) != 0 ? "" : str6, (i2 & 1024) != 0 ? RequestKt.REQUESTER_APPLICATION : str7, (i2 & 2048) != 0 ? "" : str8, (i2 & 4096) != 0 ? "" : str9, (i2 & 8192) != 0 ? "" : str10);
    }
}
