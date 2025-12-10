package th.p047co.dtac.android.dtacone.app_one.model.stv;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.manager.security.OneSecurePin;
import th.p047co.dtac.android.dtacone.model.stv.StvOffer;
import th.p047co.dtac.android.dtacone.view.fragment.mrtr_prepaid_registration.family_sim.InputPostpaidFamilySimSubscriberFragment;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u001e\b\u0007\u0018\u00002\u00020\u0001BU\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0011\u001a\u0004\b\u0015\u0010\u0013R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0011\u001a\u0004\b\u0017\u0010\u0013R\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010\u0011\u001a\u0004\b%\u0010\u0013R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010\u0011\u001a\u0004\b'\u0010\u0013¨\u0006("}, m29142d2 = {"Lth/co/dtac/android/dtacone/app_one/model/stv/OneStvSubmitCollection;", "", "", "packageCode", "ussdServiceCode", InputPostpaidFamilySimSubscriberFragment.SUB_NUM, "Lth/co/dtac/android/dtacone/manager/security/OneSecurePin;", "securePin", "Lth/co/dtac/android/dtacone/model/stv/StvOffer;", "offer", "", "commissionValue", "confirmMultiTrans", "subscriberGroup", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lth/co/dtac/android/dtacone/manager/security/OneSecurePin;Lth/co/dtac/android/dtacone/model/stv/StvOffer;Ljava/lang/Float;Ljava/lang/String;Ljava/lang/String;)V", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/lang/String;", "getPackageCode", "()Ljava/lang/String;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "getUssdServiceCode", OperatorName.CURVE_TO, "getSubscriberNumber", "d", "Lth/co/dtac/android/dtacone/manager/security/OneSecurePin;", "getSecurePin", "()Lth/co/dtac/android/dtacone/manager/security/OneSecurePin;", "e", "Lth/co/dtac/android/dtacone/model/stv/StvOffer;", "getOffer", "()Lth/co/dtac/android/dtacone/model/stv/StvOffer;", OperatorName.FILL_NON_ZERO, "Ljava/lang/Float;", "getCommissionValue", "()Ljava/lang/Float;", OperatorName.NON_STROKING_GRAY, "getConfirmMultiTrans", OperatorName.CLOSE_PATH, "getSubscriberGroup", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.app_one.model.stv.OneStvSubmitCollection */
/* loaded from: classes7.dex */
public final class OneStvSubmitCollection {
    public static final int $stable = 8;
    @SerializedName("packageCode")
    @Nullable

    /* renamed from: a */
    private final String f82300a;
    @SerializedName("ussdServiceCode")
    @Nullable

    /* renamed from: b */
    private final String f82301b;
    @SerializedName(InputPostpaidFamilySimSubscriberFragment.SUB_NUM)
    @Nullable

    /* renamed from: c */
    private final String f82302c;
    @SerializedName("pin")
    @NotNull

    /* renamed from: d */
    private final OneSecurePin f82303d;
    @SerializedName("offer")
    @Nullable

    /* renamed from: e */
    private final StvOffer f82304e;
    @SerializedName("commissionValue")
    @Nullable

    /* renamed from: f */
    private final Float f82305f;
    @SerializedName("confirmMultiTrans")
    @Nullable

    /* renamed from: g */
    private final String f82306g;
    @SerializedName("subscriberGroup")
    @Nullable

    /* renamed from: h */
    private final String f82307h;

    public OneStvSubmitCollection(@Nullable String str, @Nullable String str2, @Nullable String str3, @NotNull OneSecurePin securePin, @Nullable StvOffer stvOffer, @Nullable Float f, @Nullable String str4, @Nullable String str5) {
        Intrinsics.checkNotNullParameter(securePin, "securePin");
        this.f82300a = str;
        this.f82301b = str2;
        this.f82302c = str3;
        this.f82303d = securePin;
        this.f82304e = stvOffer;
        this.f82305f = f;
        this.f82306g = str4;
        this.f82307h = str5;
    }

    @Nullable
    public final Float getCommissionValue() {
        return this.f82305f;
    }

    @Nullable
    public final String getConfirmMultiTrans() {
        return this.f82306g;
    }

    @Nullable
    public final StvOffer getOffer() {
        return this.f82304e;
    }

    @Nullable
    public final String getPackageCode() {
        return this.f82300a;
    }

    @NotNull
    public final OneSecurePin getSecurePin() {
        return this.f82303d;
    }

    @Nullable
    public final String getSubscriberGroup() {
        return this.f82307h;
    }

    @Nullable
    public final String getSubscriberNumber() {
        return this.f82302c;
    }

    @Nullable
    public final String getUssdServiceCode() {
        return this.f82301b;
    }
}