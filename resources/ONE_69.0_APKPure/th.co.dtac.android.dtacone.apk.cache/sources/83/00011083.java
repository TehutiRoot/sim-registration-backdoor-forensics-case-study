package th.p047co.dtac.android.dtacone.app_one.model.prepaid_registration;

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
@Metadata(m29143d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ(\u0010\n\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\bJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0015\u001a\u0004\b\u0018\u0010\b¨\u0006\u0019"}, m29142d2 = {"Lth/co/dtac/android/dtacone/app_one/model/prepaid_registration/OnePrepaidRegisterTQueryCampaignRequest;", "", "", "itemId", "flow", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lth/co/dtac/android/dtacone/app_one/model/prepaid_registration/OnePrepaidRegisterTQueryCampaignRequest;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/lang/String;", "getItemId", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "getFlow", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.app_one.model.prepaid_registration.OnePrepaidRegisterTQueryCampaignRequest */
/* loaded from: classes7.dex */
public final class OnePrepaidRegisterTQueryCampaignRequest {
    public static final int $stable = 0;
    @SerializedName("itemId")
    @Nullable

    /* renamed from: a */
    private final String f82003a;
    @SerializedName("flow")
    @Nullable

    /* renamed from: b */
    private final String f82004b;

    public OnePrepaidRegisterTQueryCampaignRequest() {
        this(null, null, 3, null);
    }

    public static /* synthetic */ OnePrepaidRegisterTQueryCampaignRequest copy$default(OnePrepaidRegisterTQueryCampaignRequest onePrepaidRegisterTQueryCampaignRequest, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = onePrepaidRegisterTQueryCampaignRequest.f82003a;
        }
        if ((i & 2) != 0) {
            str2 = onePrepaidRegisterTQueryCampaignRequest.f82004b;
        }
        return onePrepaidRegisterTQueryCampaignRequest.copy(str, str2);
    }

    @Nullable
    public final String component1() {
        return this.f82003a;
    }

    @Nullable
    public final String component2() {
        return this.f82004b;
    }

    @NotNull
    public final OnePrepaidRegisterTQueryCampaignRequest copy(@Nullable String str, @Nullable String str2) {
        return new OnePrepaidRegisterTQueryCampaignRequest(str, str2);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OnePrepaidRegisterTQueryCampaignRequest) {
            OnePrepaidRegisterTQueryCampaignRequest onePrepaidRegisterTQueryCampaignRequest = (OnePrepaidRegisterTQueryCampaignRequest) obj;
            return Intrinsics.areEqual(this.f82003a, onePrepaidRegisterTQueryCampaignRequest.f82003a) && Intrinsics.areEqual(this.f82004b, onePrepaidRegisterTQueryCampaignRequest.f82004b);
        }
        return false;
    }

    @Nullable
    public final String getFlow() {
        return this.f82004b;
    }

    @Nullable
    public final String getItemId() {
        return this.f82003a;
    }

    public int hashCode() {
        String str = this.f82003a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f82004b;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.f82003a;
        String str2 = this.f82004b;
        return "OnePrepaidRegisterTQueryCampaignRequest(itemId=" + str + ", flow=" + str2 + ")";
    }

    public OnePrepaidRegisterTQueryCampaignRequest(@Nullable String str, @Nullable String str2) {
        this.f82003a = str;
        this.f82004b = str2;
    }

    public /* synthetic */ OnePrepaidRegisterTQueryCampaignRequest(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
    }
}