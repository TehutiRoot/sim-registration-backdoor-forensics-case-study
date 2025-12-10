package th.p047co.dtac.android.dtacone.view.appOne.ownerManagement.model.response;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ*\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\nJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\nR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\f¨\u0006\u001d"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/ownerManagement/model/response/OneOwnerTransactionDataResponse;", "", "", "date", "", "Lth/co/dtac/android/dtacone/view/appOne/ownerManagement/model/response/OneOwnerLastTransaction;", "lastTransactions", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Ljava/util/List;)Lth/co/dtac/android/dtacone/view/appOne/ownerManagement/model/response/OneOwnerTransactionDataResponse;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/lang/String;", "getDate", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Ljava/util/List;", "getLastTransactions", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.view.appOne.ownerManagement.model.response.OneOwnerTransactionDataResponse */
/* loaded from: classes10.dex */
public final class OneOwnerTransactionDataResponse {
    public static final int $stable = 8;
    @SerializedName("date")
    @NotNull

    /* renamed from: a */
    private final String f93140a;
    @SerializedName("lastTransactions")
    @NotNull

    /* renamed from: b */
    private final List<OneOwnerLastTransaction> f93141b;

    public OneOwnerTransactionDataResponse(@NotNull String date, @NotNull List<OneOwnerLastTransaction> lastTransactions) {
        Intrinsics.checkNotNullParameter(date, "date");
        Intrinsics.checkNotNullParameter(lastTransactions, "lastTransactions");
        this.f93140a = date;
        this.f93141b = lastTransactions;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ OneOwnerTransactionDataResponse copy$default(OneOwnerTransactionDataResponse oneOwnerTransactionDataResponse, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = oneOwnerTransactionDataResponse.f93140a;
        }
        if ((i & 2) != 0) {
            list = oneOwnerTransactionDataResponse.f93141b;
        }
        return oneOwnerTransactionDataResponse.copy(str, list);
    }

    @NotNull
    public final String component1() {
        return this.f93140a;
    }

    @NotNull
    public final List<OneOwnerLastTransaction> component2() {
        return this.f93141b;
    }

    @NotNull
    public final OneOwnerTransactionDataResponse copy(@NotNull String date, @NotNull List<OneOwnerLastTransaction> lastTransactions) {
        Intrinsics.checkNotNullParameter(date, "date");
        Intrinsics.checkNotNullParameter(lastTransactions, "lastTransactions");
        return new OneOwnerTransactionDataResponse(date, lastTransactions);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OneOwnerTransactionDataResponse) {
            OneOwnerTransactionDataResponse oneOwnerTransactionDataResponse = (OneOwnerTransactionDataResponse) obj;
            return Intrinsics.areEqual(this.f93140a, oneOwnerTransactionDataResponse.f93140a) && Intrinsics.areEqual(this.f93141b, oneOwnerTransactionDataResponse.f93141b);
        }
        return false;
    }

    @NotNull
    public final String getDate() {
        return this.f93140a;
    }

    @NotNull
    public final List<OneOwnerLastTransaction> getLastTransactions() {
        return this.f93141b;
    }

    public int hashCode() {
        return (this.f93140a.hashCode() * 31) + this.f93141b.hashCode();
    }

    @NotNull
    public String toString() {
        String str = this.f93140a;
        List<OneOwnerLastTransaction> list = this.f93141b;
        return "OneOwnerTransactionDataResponse(date=" + str + ", lastTransactions=" + list + ")";
    }
}