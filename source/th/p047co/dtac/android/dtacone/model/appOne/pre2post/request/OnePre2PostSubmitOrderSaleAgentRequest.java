package th.p047co.dtac.android.dtacone.model.appOne.pre2post.request;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\u000b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, m28850d2 = {"Lth/co/dtac/android/dtacone/model/appOne/pre2post/request/OnePre2PostSubmitOrderSaleAgentRequest;", "", "dtrCode", "", "name", "(Ljava/lang/String;Ljava/lang/String;)V", "getDtrCode", "()Ljava/lang/String;", "getName", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.appOne.pre2post.request.OnePre2PostSubmitOrderSaleAgentRequest */
/* loaded from: classes8.dex */
public final class OnePre2PostSubmitOrderSaleAgentRequest {
    public static final int $stable = 0;
    @SerializedName("dtrCode")
    @Nullable
    private final String dtrCode;
    @SerializedName("name")
    @Nullable
    private final String name;

    public OnePre2PostSubmitOrderSaleAgentRequest() {
        this(null, null, 3, null);
    }

    public static /* synthetic */ OnePre2PostSubmitOrderSaleAgentRequest copy$default(OnePre2PostSubmitOrderSaleAgentRequest onePre2PostSubmitOrderSaleAgentRequest, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = onePre2PostSubmitOrderSaleAgentRequest.dtrCode;
        }
        if ((i & 2) != 0) {
            str2 = onePre2PostSubmitOrderSaleAgentRequest.name;
        }
        return onePre2PostSubmitOrderSaleAgentRequest.copy(str, str2);
    }

    @Nullable
    public final String component1() {
        return this.dtrCode;
    }

    @Nullable
    public final String component2() {
        return this.name;
    }

    @NotNull
    public final OnePre2PostSubmitOrderSaleAgentRequest copy(@Nullable String str, @Nullable String str2) {
        return new OnePre2PostSubmitOrderSaleAgentRequest(str, str2);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OnePre2PostSubmitOrderSaleAgentRequest) {
            OnePre2PostSubmitOrderSaleAgentRequest onePre2PostSubmitOrderSaleAgentRequest = (OnePre2PostSubmitOrderSaleAgentRequest) obj;
            return Intrinsics.areEqual(this.dtrCode, onePre2PostSubmitOrderSaleAgentRequest.dtrCode) && Intrinsics.areEqual(this.name, onePre2PostSubmitOrderSaleAgentRequest.name);
        }
        return false;
    }

    @Nullable
    public final String getDtrCode() {
        return this.dtrCode;
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        String str = this.dtrCode;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.name;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.dtrCode;
        String str2 = this.name;
        return "OnePre2PostSubmitOrderSaleAgentRequest(dtrCode=" + str + ", name=" + str2 + ")";
    }

    public OnePre2PostSubmitOrderSaleAgentRequest(@Nullable String str, @Nullable String str2) {
        this.dtrCode = str;
        this.name = str2;
    }

    public /* synthetic */ OnePre2PostSubmitOrderSaleAgentRequest(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
    }
}
