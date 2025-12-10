package th.p047co.dtac.android.dtacone.app_one.model.stv;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.manager.security.OneSecurePin;
import th.p047co.dtac.android.dtacone.view.fragment.mrtr_prepaid_registration.family_sim.InputPostpaidFamilySimSubscriberFragment;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001a\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0019\b\u0087\b\u0018\u00002\u00020\u0001B\u007f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0013J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0013J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0013J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0013J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0013J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0013J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0013J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0013J\u0088\u0001\u0010\u001c\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0013J\u0010\u0010 \u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b$\u0010%R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010\u0011R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010\u0013R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b,\u0010*\u001a\u0004\b-\u0010\u0013R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b.\u0010*\u001a\u0004\b/\u0010\u0013R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b0\u0010*\u001a\u0004\b1\u0010\u0013R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b2\u0010*\u001a\u0004\b3\u0010\u0013R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b4\u0010*\u001a\u0004\b5\u0010\u0013R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b6\u0010*\u001a\u0004\b7\u0010\u0013R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b8\u0010*\u001a\u0004\b9\u0010\u0013R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b:\u0010*\u001a\u0004\b;\u0010\u0013¨\u0006<"}, m28850d2 = {"Lth/co/dtac/android/dtacone/app_one/model/stv/OneStvSubmitTrueRequest;", "", "Lth/co/dtac/android/dtacone/manager/security/OneSecurePin;", "pin", "", "removePackage", "ussdCode", "packageCode", InputPostpaidFamilySimSubscriberFragment.SUB_NUM, "confirmMultiTrans", "categoryId", "poqItemId", "poqItemProductOfferingId", "transactionRefId", "<init>", "(Lth/co/dtac/android/dtacone/manager/security/OneSecurePin;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Lth/co/dtac/android/dtacone/manager/security/OneSecurePin;", "component2", "()Ljava/lang/String;", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "(Lth/co/dtac/android/dtacone/manager/security/OneSecurePin;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lth/co/dtac/android/dtacone/app_one/model/stv/OneStvSubmitTrueRequest;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", PDPageLabelRange.STYLE_LETTERS_LOWER, "Lth/co/dtac/android/dtacone/manager/security/OneSecurePin;", "getPin", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Ljava/lang/String;", "getRemovePackage", OperatorName.CURVE_TO, "getUssdCode", "d", "getPackageCode", "e", "getSubscriberNumber", OperatorName.FILL_NON_ZERO, "getConfirmMultiTrans", OperatorName.NON_STROKING_GRAY, "getCategoryId", OperatorName.CLOSE_PATH, "getPoqItemId", "i", "getPoqItemProductOfferingId", OperatorName.SET_LINE_JOINSTYLE, "getTransactionRefId", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.app_one.model.stv.OneStvSubmitTrueRequest */
/* loaded from: classes7.dex */
public final class OneStvSubmitTrueRequest {
    public static final int $stable = 8;
    @SerializedName("pin")
    @Nullable

    /* renamed from: a */
    private final OneSecurePin f82216a;
    @SerializedName("removePackage")
    @Nullable

    /* renamed from: b */
    private final String f82217b;
    @SerializedName("ussdCode")
    @Nullable

    /* renamed from: c */
    private final String f82218c;
    @SerializedName("packageCode")
    @Nullable

    /* renamed from: d */
    private final String f82219d;
    @SerializedName(InputPostpaidFamilySimSubscriberFragment.SUB_NUM)
    @Nullable

    /* renamed from: e */
    private final String f82220e;
    @SerializedName("confirmMultiTrans")
    @Nullable

    /* renamed from: f */
    private final String f82221f;
    @SerializedName("categoryId")
    @Nullable

    /* renamed from: g */
    private final String f82222g;
    @SerializedName("poqItemId")
    @Nullable

    /* renamed from: h */
    private final String f82223h;
    @SerializedName("poqItemProductOfferingId")
    @Nullable

    /* renamed from: i */
    private final String f82224i;
    @SerializedName("transactionRefId")
    @Nullable

    /* renamed from: j */
    private final String f82225j;

    public OneStvSubmitTrueRequest() {
        this(null, null, null, null, null, null, null, null, null, null, 1023, null);
    }

    @Nullable
    public final OneSecurePin component1() {
        return this.f82216a;
    }

    @Nullable
    public final String component10() {
        return this.f82225j;
    }

    @Nullable
    public final String component2() {
        return this.f82217b;
    }

    @Nullable
    public final String component3() {
        return this.f82218c;
    }

    @Nullable
    public final String component4() {
        return this.f82219d;
    }

    @Nullable
    public final String component5() {
        return this.f82220e;
    }

    @Nullable
    public final String component6() {
        return this.f82221f;
    }

    @Nullable
    public final String component7() {
        return this.f82222g;
    }

    @Nullable
    public final String component8() {
        return this.f82223h;
    }

    @Nullable
    public final String component9() {
        return this.f82224i;
    }

    @NotNull
    public final OneStvSubmitTrueRequest copy(@Nullable OneSecurePin oneSecurePin, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9) {
        return new OneStvSubmitTrueRequest(oneSecurePin, str, str2, str3, str4, str5, str6, str7, str8, str9);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OneStvSubmitTrueRequest) {
            OneStvSubmitTrueRequest oneStvSubmitTrueRequest = (OneStvSubmitTrueRequest) obj;
            return Intrinsics.areEqual(this.f82216a, oneStvSubmitTrueRequest.f82216a) && Intrinsics.areEqual(this.f82217b, oneStvSubmitTrueRequest.f82217b) && Intrinsics.areEqual(this.f82218c, oneStvSubmitTrueRequest.f82218c) && Intrinsics.areEqual(this.f82219d, oneStvSubmitTrueRequest.f82219d) && Intrinsics.areEqual(this.f82220e, oneStvSubmitTrueRequest.f82220e) && Intrinsics.areEqual(this.f82221f, oneStvSubmitTrueRequest.f82221f) && Intrinsics.areEqual(this.f82222g, oneStvSubmitTrueRequest.f82222g) && Intrinsics.areEqual(this.f82223h, oneStvSubmitTrueRequest.f82223h) && Intrinsics.areEqual(this.f82224i, oneStvSubmitTrueRequest.f82224i) && Intrinsics.areEqual(this.f82225j, oneStvSubmitTrueRequest.f82225j);
        }
        return false;
    }

    @Nullable
    public final String getCategoryId() {
        return this.f82222g;
    }

    @Nullable
    public final String getConfirmMultiTrans() {
        return this.f82221f;
    }

    @Nullable
    public final String getPackageCode() {
        return this.f82219d;
    }

    @Nullable
    public final OneSecurePin getPin() {
        return this.f82216a;
    }

    @Nullable
    public final String getPoqItemId() {
        return this.f82223h;
    }

    @Nullable
    public final String getPoqItemProductOfferingId() {
        return this.f82224i;
    }

    @Nullable
    public final String getRemovePackage() {
        return this.f82217b;
    }

    @Nullable
    public final String getSubscriberNumber() {
        return this.f82220e;
    }

    @Nullable
    public final String getTransactionRefId() {
        return this.f82225j;
    }

    @Nullable
    public final String getUssdCode() {
        return this.f82218c;
    }

    public int hashCode() {
        OneSecurePin oneSecurePin = this.f82216a;
        int hashCode = (oneSecurePin == null ? 0 : oneSecurePin.hashCode()) * 31;
        String str = this.f82217b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f82218c;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f82219d;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f82220e;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f82221f;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f82222g;
        int hashCode7 = (hashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f82223h;
        int hashCode8 = (hashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.f82224i;
        int hashCode9 = (hashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.f82225j;
        return hashCode9 + (str9 != null ? str9.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        OneSecurePin oneSecurePin = this.f82216a;
        String str = this.f82217b;
        String str2 = this.f82218c;
        String str3 = this.f82219d;
        String str4 = this.f82220e;
        String str5 = this.f82221f;
        String str6 = this.f82222g;
        String str7 = this.f82223h;
        String str8 = this.f82224i;
        String str9 = this.f82225j;
        return "OneStvSubmitTrueRequest(pin=" + oneSecurePin + ", removePackage=" + str + ", ussdCode=" + str2 + ", packageCode=" + str3 + ", subscriberNumber=" + str4 + ", confirmMultiTrans=" + str5 + ", categoryId=" + str6 + ", poqItemId=" + str7 + ", poqItemProductOfferingId=" + str8 + ", transactionRefId=" + str9 + ")";
    }

    public OneStvSubmitTrueRequest(@Nullable OneSecurePin oneSecurePin, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9) {
        this.f82216a = oneSecurePin;
        this.f82217b = str;
        this.f82218c = str2;
        this.f82219d = str3;
        this.f82220e = str4;
        this.f82221f = str5;
        this.f82222g = str6;
        this.f82223h = str7;
        this.f82224i = str8;
        this.f82225j = str9;
    }

    public /* synthetic */ OneStvSubmitTrueRequest(OneSecurePin oneSecurePin, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : oneSecurePin, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : str5, (i & 64) != 0 ? null : str6, (i & 128) != 0 ? null : str7, (i & 256) != 0 ? null : str8, (i & 512) == 0 ? str9 : null);
    }
}
