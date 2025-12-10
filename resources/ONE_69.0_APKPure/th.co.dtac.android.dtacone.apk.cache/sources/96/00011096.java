package th.p047co.dtac.android.dtacone.app_one.model.rectify;

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

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0016\b\u0087\b\u0018\u00002\u00020\u0001Bg\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0014J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0014J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0014J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0014J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0014Jp\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0014J\u0010\u0010\u001d\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010\u0010R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010\u0012R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010\u0014R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b,\u0010*\u001a\u0004\b-\u0010\u0014R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b.\u0010*\u001a\u0004\b/\u0010\u0014R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b0\u0010*\u001a\u0004\b1\u0010\u0014R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b2\u0010*\u001a\u0004\b3\u0010\u0014R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b4\u0010*\u001a\u0004\b5\u0010\u0014¨\u00066"}, m29142d2 = {"Lth/co/dtac/android/dtacone/app_one/model/rectify/OneRectifyConfirmRequest;", "", "", "amount", "Lth/co/dtac/android/dtacone/manager/security/OneSecurePin;", "pin", "", "transactionRefId", "ussdServiceCode", "customerNumber", "type", "simR", "transactionId", "<init>", "(Ljava/lang/Integer;Lth/co/dtac/android/dtacone/manager/security/OneSecurePin;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/Integer;", "component2", "()Lth/co/dtac/android/dtacone/manager/security/OneSecurePin;", "component3", "()Ljava/lang/String;", "component4", "component5", "component6", "component7", "component8", "copy", "(Ljava/lang/Integer;Lth/co/dtac/android/dtacone/manager/security/OneSecurePin;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lth/co/dtac/android/dtacone/app_one/model/rectify/OneRectifyConfirmRequest;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/lang/Integer;", "getAmount", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Lth/co/dtac/android/dtacone/manager/security/OneSecurePin;", "getPin", OperatorName.CURVE_TO, "Ljava/lang/String;", "getTransactionRefId", "d", "getUssdServiceCode", "e", "getCustomerNumber", OperatorName.FILL_NON_ZERO, "getType", OperatorName.NON_STROKING_GRAY, "getSimR", OperatorName.CLOSE_PATH, "getTransactionId", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.app_one.model.rectify.OneRectifyConfirmRequest */
/* loaded from: classes7.dex */
public final class OneRectifyConfirmRequest {
    public static final int $stable = 8;
    @SerializedName("amount")
    @Nullable

    /* renamed from: a */
    private final Integer f82116a;
    @SerializedName("pin")
    @Nullable

    /* renamed from: b */
    private final OneSecurePin f82117b;
    @SerializedName("transactionRefId")
    @Nullable

    /* renamed from: c */
    private final String f82118c;
    @SerializedName("ussdServiceCode")
    @Nullable

    /* renamed from: d */
    private final String f82119d;
    @SerializedName("customerNumber")
    @Nullable

    /* renamed from: e */
    private final String f82120e;
    @SerializedName("type")
    @Nullable

    /* renamed from: f */
    private final String f82121f;
    @SerializedName("simR")
    @Nullable

    /* renamed from: g */
    private final String f82122g;
    @SerializedName("transactionID")
    @Nullable

    /* renamed from: h */
    private final String f82123h;

    public OneRectifyConfirmRequest() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }

    @Nullable
    public final Integer component1() {
        return this.f82116a;
    }

    @Nullable
    public final OneSecurePin component2() {
        return this.f82117b;
    }

    @Nullable
    public final String component3() {
        return this.f82118c;
    }

    @Nullable
    public final String component4() {
        return this.f82119d;
    }

    @Nullable
    public final String component5() {
        return this.f82120e;
    }

    @Nullable
    public final String component6() {
        return this.f82121f;
    }

    @Nullable
    public final String component7() {
        return this.f82122g;
    }

    @Nullable
    public final String component8() {
        return this.f82123h;
    }

    @NotNull
    public final OneRectifyConfirmRequest copy(@Nullable Integer num, @Nullable OneSecurePin oneSecurePin, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6) {
        return new OneRectifyConfirmRequest(num, oneSecurePin, str, str2, str3, str4, str5, str6);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OneRectifyConfirmRequest) {
            OneRectifyConfirmRequest oneRectifyConfirmRequest = (OneRectifyConfirmRequest) obj;
            return Intrinsics.areEqual(this.f82116a, oneRectifyConfirmRequest.f82116a) && Intrinsics.areEqual(this.f82117b, oneRectifyConfirmRequest.f82117b) && Intrinsics.areEqual(this.f82118c, oneRectifyConfirmRequest.f82118c) && Intrinsics.areEqual(this.f82119d, oneRectifyConfirmRequest.f82119d) && Intrinsics.areEqual(this.f82120e, oneRectifyConfirmRequest.f82120e) && Intrinsics.areEqual(this.f82121f, oneRectifyConfirmRequest.f82121f) && Intrinsics.areEqual(this.f82122g, oneRectifyConfirmRequest.f82122g) && Intrinsics.areEqual(this.f82123h, oneRectifyConfirmRequest.f82123h);
        }
        return false;
    }

    @Nullable
    public final Integer getAmount() {
        return this.f82116a;
    }

    @Nullable
    public final String getCustomerNumber() {
        return this.f82120e;
    }

    @Nullable
    public final OneSecurePin getPin() {
        return this.f82117b;
    }

    @Nullable
    public final String getSimR() {
        return this.f82122g;
    }

    @Nullable
    public final String getTransactionId() {
        return this.f82123h;
    }

    @Nullable
    public final String getTransactionRefId() {
        return this.f82118c;
    }

    @Nullable
    public final String getType() {
        return this.f82121f;
    }

    @Nullable
    public final String getUssdServiceCode() {
        return this.f82119d;
    }

    public int hashCode() {
        Integer num = this.f82116a;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        OneSecurePin oneSecurePin = this.f82117b;
        int hashCode2 = (hashCode + (oneSecurePin == null ? 0 : oneSecurePin.hashCode())) * 31;
        String str = this.f82118c;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f82119d;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f82120e;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f82121f;
        int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f82122g;
        int hashCode7 = (hashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f82123h;
        return hashCode7 + (str6 != null ? str6.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        Integer num = this.f82116a;
        OneSecurePin oneSecurePin = this.f82117b;
        String str = this.f82118c;
        String str2 = this.f82119d;
        String str3 = this.f82120e;
        String str4 = this.f82121f;
        String str5 = this.f82122g;
        String str6 = this.f82123h;
        return "OneRectifyConfirmRequest(amount=" + num + ", pin=" + oneSecurePin + ", transactionRefId=" + str + ", ussdServiceCode=" + str2 + ", customerNumber=" + str3 + ", type=" + str4 + ", simR=" + str5 + ", transactionId=" + str6 + ")";
    }

    public OneRectifyConfirmRequest(@Nullable Integer num, @Nullable OneSecurePin oneSecurePin, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6) {
        this.f82116a = num;
        this.f82117b = oneSecurePin;
        this.f82118c = str;
        this.f82119d = str2;
        this.f82120e = str3;
        this.f82121f = str4;
        this.f82122g = str5;
        this.f82123h = str6;
    }

    public /* synthetic */ OneRectifyConfirmRequest(Integer num, OneSecurePin oneSecurePin, String str, String str2, String str3, String str4, String str5, String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : oneSecurePin, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : str4, (i & 64) != 0 ? null : str5, (i & 128) == 0 ? str6 : null);
    }
}