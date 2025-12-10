package th.p047co.dtac.android.dtacone.view.appOne.eSign.request;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u0007J\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007¨\u0006\u0015"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/eSign/request/OneVerifyQrCodeRequest;", "", "", "qrCode", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lth/co/dtac/android/dtacone/view/appOne/eSign/request/OneVerifyQrCodeRequest;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/lang/String;", "getQrCode", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.view.appOne.eSign.request.OneVerifyQrCodeRequest */
/* loaded from: classes10.dex */
public final class OneVerifyQrCodeRequest {
    public static final int $stable = 0;
    @SerializedName("qr_code")
    @NotNull

    /* renamed from: a */
    private final String f90805a;

    public OneVerifyQrCodeRequest(@NotNull String qrCode) {
        Intrinsics.checkNotNullParameter(qrCode, "qrCode");
        this.f90805a = qrCode;
    }

    public static /* synthetic */ OneVerifyQrCodeRequest copy$default(OneVerifyQrCodeRequest oneVerifyQrCodeRequest, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = oneVerifyQrCodeRequest.f90805a;
        }
        return oneVerifyQrCodeRequest.copy(str);
    }

    @NotNull
    public final String component1() {
        return this.f90805a;
    }

    @NotNull
    public final OneVerifyQrCodeRequest copy(@NotNull String qrCode) {
        Intrinsics.checkNotNullParameter(qrCode, "qrCode");
        return new OneVerifyQrCodeRequest(qrCode);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof OneVerifyQrCodeRequest) && Intrinsics.areEqual(this.f90805a, ((OneVerifyQrCodeRequest) obj).f90805a);
    }

    @NotNull
    public final String getQrCode() {
        return this.f90805a;
    }

    public int hashCode() {
        return this.f90805a.hashCode();
    }

    @NotNull
    public String toString() {
        String str = this.f90805a;
        return "OneVerifyQrCodeRequest(qrCode=" + str + ")";
    }
}