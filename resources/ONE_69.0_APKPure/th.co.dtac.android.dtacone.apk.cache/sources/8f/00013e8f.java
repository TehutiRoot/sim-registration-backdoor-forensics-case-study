package th.p047co.dtac.android.dtacone.view.appOne.retailerProfileUpdate.model.request;

import androidx.autofill.HintConstants;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u001a\b\u0007\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u0012\u0006\u0010\f\u001a\u00020\u0007¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0003\u0010\u0011R\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0010\u001a\u0004\b\u0004\u0010\u0011R\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0010\u001a\u0004\b\u0005\u0010\u0011R\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0010\u001a\u0004\b\u0006\u0010\u0011R\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\t\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u001a\u0010\u0018R\u001a\u0010\n\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0016\u001a\u0004\b\u001c\u0010\u0018R\u001a\u0010\u000b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u0016\u001a\u0004\b\u001e\u0010\u0018R\u001a\u0010\f\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u0016\u001a\u0004\b \u0010\u0018¨\u0006!"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/retailerProfileUpdate/model/request/OneRetailerProfileUpdateOwnerRequest;", "", "", "isFirstNameEditable", "isLastNameEditable", "isIdCardNumberEditable", "isPhoneNumberEditable", "", "firstName", "lastName", HintConstants.AUTOFILL_HINT_PHONE_NUMBER, "idCardNumber", "idCardImage", "<init>", "(ZZZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", PDPageLabelRange.STYLE_LETTERS_LOWER, "Z", "()Z", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, OperatorName.CURVE_TO, "d", "e", "Ljava/lang/String;", "getFirstName", "()Ljava/lang/String;", OperatorName.FILL_NON_ZERO, "getLastName", OperatorName.NON_STROKING_GRAY, "getPhoneNumber", OperatorName.CLOSE_PATH, "getIdCardNumber", "i", "getIdCardImage", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.view.appOne.retailerProfileUpdate.model.request.OneRetailerProfileUpdateOwnerRequest */
/* loaded from: classes10.dex */
public final class OneRetailerProfileUpdateOwnerRequest {
    public static final int $stable = 0;
    @SerializedName("isFirstNameEditable")

    /* renamed from: a */
    private final boolean f96949a;
    @SerializedName("isLastNameEditable")

    /* renamed from: b */
    private final boolean f96950b;
    @SerializedName("isIdCardNumberEditable")

    /* renamed from: c */
    private final boolean f96951c;
    @SerializedName("isPhoneNumberEditable")

    /* renamed from: d */
    private final boolean f96952d;
    @SerializedName("firstName")
    @NotNull

    /* renamed from: e */
    private final String f96953e;
    @SerializedName("lastName")
    @NotNull

    /* renamed from: f */
    private final String f96954f;
    @SerializedName(HintConstants.AUTOFILL_HINT_PHONE_NUMBER)
    @NotNull

    /* renamed from: g */
    private final String f96955g;
    @SerializedName("idCardNumber")
    @NotNull

    /* renamed from: h */
    private final String f96956h;
    @SerializedName("idCardImage")
    @NotNull

    /* renamed from: i */
    private final String f96957i;

    public OneRetailerProfileUpdateOwnerRequest(boolean z, boolean z2, boolean z3, boolean z4, @NotNull String firstName, @NotNull String lastName, @NotNull String phoneNumber, @NotNull String idCardNumber, @NotNull String idCardImage) {
        Intrinsics.checkNotNullParameter(firstName, "firstName");
        Intrinsics.checkNotNullParameter(lastName, "lastName");
        Intrinsics.checkNotNullParameter(phoneNumber, "phoneNumber");
        Intrinsics.checkNotNullParameter(idCardNumber, "idCardNumber");
        Intrinsics.checkNotNullParameter(idCardImage, "idCardImage");
        this.f96949a = z;
        this.f96950b = z2;
        this.f96951c = z3;
        this.f96952d = z4;
        this.f96953e = firstName;
        this.f96954f = lastName;
        this.f96955g = phoneNumber;
        this.f96956h = idCardNumber;
        this.f96957i = idCardImage;
    }

    @NotNull
    public final String getFirstName() {
        return this.f96953e;
    }

    @NotNull
    public final String getIdCardImage() {
        return this.f96957i;
    }

    @NotNull
    public final String getIdCardNumber() {
        return this.f96956h;
    }

    @NotNull
    public final String getLastName() {
        return this.f96954f;
    }

    @NotNull
    public final String getPhoneNumber() {
        return this.f96955g;
    }

    public final boolean isFirstNameEditable() {
        return this.f96949a;
    }

    public final boolean isIdCardNumberEditable() {
        return this.f96951c;
    }

    public final boolean isLastNameEditable() {
        return this.f96950b;
    }

    public final boolean isPhoneNumberEditable() {
        return this.f96952d;
    }
}