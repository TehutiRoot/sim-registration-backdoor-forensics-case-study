package th.p047co.dtac.android.dtacone.view.appOne.ownerManagement.model.request;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\"\u0010\u0004\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\b\u001a\u0004\b\f\u0010\n\"\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/ownerManagement/model/request/OneOwnerListRequest;", "", "", "rtrCode", "companyCode", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/lang/String;", "getRtrCode", "()Ljava/lang/String;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "getCompanyCode", "setCompanyCode", "(Ljava/lang/String;)V", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.view.appOne.ownerManagement.model.request.OneOwnerListRequest */
/* loaded from: classes10.dex */
public final class OneOwnerListRequest {
    public static final int $stable = 8;
    @SerializedName("rtrCode")
    @Nullable

    /* renamed from: a */
    private final String f93116a;
    @SerializedName("companyCode")
    @NotNull

    /* renamed from: b */
    private String f93117b;

    public OneOwnerListRequest(@Nullable String str, @NotNull String companyCode) {
        Intrinsics.checkNotNullParameter(companyCode, "companyCode");
        this.f93116a = str;
        this.f93117b = companyCode;
    }

    @NotNull
    public final String getCompanyCode() {
        return this.f93117b;
    }

    @Nullable
    public final String getRtrCode() {
        return this.f93116a;
    }

    public final void setCompanyCode(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.f93117b = str;
    }

    public /* synthetic */ OneOwnerListRequest(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, str2);
    }
}