package th.p047co.dtac.android.dtacone.viewmodel.change_sim;

import androidx.compose.runtime.internal.StabilityInferred;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.viewmodel.BaseViewModel;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b \b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\"\u0010\u0007\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\"\u0010\u0012\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\"\u0010\u0016\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\r\u001a\u0004\b\u0014\u0010\u000f\"\u0004\b\u0015\u0010\u0011R\"\u0010\u001a\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\r\u001a\u0004\b\u0018\u0010\u000f\"\u0004\b\u0019\u0010\u0011R\"\u0010\u001e\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\r\u001a\u0004\b\u001c\u0010\u000f\"\u0004\b\u001d\u0010\u0011R\"\u0010\"\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010\r\u001a\u0004\b \u0010\u000f\"\u0004\b!\u0010\u0011R\"\u0010&\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010\r\u001a\u0004\b$\u0010\u000f\"\u0004\b%\u0010\u0011R\"\u0010*\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010\r\u001a\u0004\b(\u0010\u000f\"\u0004\b)\u0010\u0011¨\u0006+"}, m29142d2 = {"Lth/co/dtac/android/dtacone/viewmodel/change_sim/ChangeSimSaveViewModel;", "Lth/co/dtac/android/dtacone/viewmodel/BaseViewModel;", "<init>", "()V", "", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Z", "isSmartCard", "()Z", "setSmartCard", "(Z)V", "", OperatorName.CURVE_TO, "Ljava/lang/String;", "getCardType", "()Ljava/lang/String;", "setCardType", "(Ljava/lang/String;)V", "cardType", "d", "getTransactionId", "setTransactionId", "transactionId", "e", "getMrtrConsentId", "setMrtrConsentId", "mrtrConsentId", OperatorName.FILL_NON_ZERO, "getIdentityPhotoName", "setIdentityPhotoName", "identityPhotoName", OperatorName.NON_STROKING_GRAY, "getCustomerPhoto", "setCustomerPhoto", "customerPhoto", OperatorName.CLOSE_PATH, "getPostCode", "setPostCode", "postCode", "i", "getNewSimCardNumber", "setNewSimCardNumber", "newSimCardNumber", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.viewmodel.change_sim.ChangeSimSaveViewModel */
/* loaded from: classes9.dex */
public final class ChangeSimSaveViewModel extends BaseViewModel {
    public static final int $stable = 8;

    /* renamed from: b */
    public boolean f105192b;

    /* renamed from: c */
    public String f105193c = "";

    /* renamed from: d */
    public String f105194d = "";

    /* renamed from: e */
    public String f105195e = "";

    /* renamed from: f */
    public String f105196f = "";

    /* renamed from: g */
    public String f105197g = "";

    /* renamed from: h */
    public String f105198h = "";

    /* renamed from: i */
    public String f105199i = "";

    @NotNull
    public final String getCardType() {
        return this.f105193c;
    }

    @NotNull
    public final String getCustomerPhoto() {
        return this.f105197g;
    }

    @NotNull
    public final String getIdentityPhotoName() {
        return this.f105196f;
    }

    @NotNull
    public final String getMrtrConsentId() {
        return this.f105195e;
    }

    @NotNull
    public final String getNewSimCardNumber() {
        return this.f105199i;
    }

    @NotNull
    public final String getPostCode() {
        return this.f105198h;
    }

    @NotNull
    public final String getTransactionId() {
        return this.f105194d;
    }

    public final boolean isSmartCard() {
        return this.f105192b;
    }

    public final void setCardType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.f105193c = str;
    }

    public final void setCustomerPhoto(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.f105197g = str;
    }

    public final void setIdentityPhotoName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.f105196f = str;
    }

    public final void setMrtrConsentId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.f105195e = str;
    }

    public final void setNewSimCardNumber(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.f105199i = str;
    }

    public final void setPostCode(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.f105198h = str;
    }

    public final void setSmartCard(boolean z) {
        this.f105192b = z;
    }

    public final void setTransactionId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.f105194d = str;
    }
}