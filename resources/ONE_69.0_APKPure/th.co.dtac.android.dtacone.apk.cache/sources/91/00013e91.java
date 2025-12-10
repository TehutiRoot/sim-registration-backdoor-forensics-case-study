package th.p047co.dtac.android.dtacone.view.appOne.retailerProfileUpdate.model.response;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/retailerProfileUpdate/model/response/OneRetailerProfileUpdateAddressResponse;", "", "", "rtrName", "<init>", "(Ljava/lang/String;)V", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/lang/String;", "getRtrName", "()Ljava/lang/String;", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.view.appOne.retailerProfileUpdate.model.response.OneRetailerProfileUpdateAddressResponse */
/* loaded from: classes10.dex */
public final class OneRetailerProfileUpdateAddressResponse {
    public static final int $stable = 0;
    @SerializedName("rtrName")
    @NotNull

    /* renamed from: a */
    private final String f96959a;

    public OneRetailerProfileUpdateAddressResponse(@NotNull String rtrName) {
        Intrinsics.checkNotNullParameter(rtrName, "rtrName");
        this.f96959a = rtrName;
    }

    @NotNull
    public final String getRtrName() {
        return this.f96959a;
    }
}