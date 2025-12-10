package th.p047co.dtac.android.dtacone.model.appOne.topup.trueCompany;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.view.fragment.mrtr_prepaid_registration.family_sim.InputPostpaidFamilySimSubscriberFragment;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\tJ\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000bJ\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0003JJ\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0018J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001d\u001a\u00020\u0005HÖ\u0001R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000e¨\u0006\u001e"}, m28850d2 = {"Lth/co/dtac/android/dtacone/model/appOne/topup/trueCompany/Data;", "", "amount", "", "balance", "", InputPostpaidFamilySimSubscriberFragment.SUB_NUM, "balanceSubscriber", "refId", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAmount", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getBalance", "()Ljava/lang/String;", "getBalanceSubscriber", "getRefId", "getSubscriberNumber", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lth/co/dtac/android/dtacone/model/appOne/topup/trueCompany/Data;", "equals", "", "other", "hashCode", "toString", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.appOne.topup.trueCompany.Data */
/* loaded from: classes8.dex */
public final class Data {
    public static final int $stable = 0;
    @SerializedName("amount")
    @Nullable
    private final Integer amount;
    @SerializedName("balance")
    @Nullable
    private final String balance;
    @SerializedName("balanceSubscriber")
    @Nullable
    private final String balanceSubscriber;
    @SerializedName("refId")
    @Nullable
    private final String refId;
    @SerializedName(InputPostpaidFamilySimSubscriberFragment.SUB_NUM)
    @Nullable
    private final String subscriberNumber;

    public Data() {
        this(null, null, null, null, null, 31, null);
    }

    public static /* synthetic */ Data copy$default(Data data, Integer num, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            num = data.amount;
        }
        if ((i & 2) != 0) {
            str = data.balance;
        }
        String str5 = str;
        if ((i & 4) != 0) {
            str2 = data.subscriberNumber;
        }
        String str6 = str2;
        if ((i & 8) != 0) {
            str3 = data.balanceSubscriber;
        }
        String str7 = str3;
        if ((i & 16) != 0) {
            str4 = data.refId;
        }
        return data.copy(num, str5, str6, str7, str4);
    }

    @Nullable
    public final Integer component1() {
        return this.amount;
    }

    @Nullable
    public final String component2() {
        return this.balance;
    }

    @Nullable
    public final String component3() {
        return this.subscriberNumber;
    }

    @Nullable
    public final String component4() {
        return this.balanceSubscriber;
    }

    @Nullable
    public final String component5() {
        return this.refId;
    }

    @NotNull
    public final Data copy(@Nullable Integer num, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4) {
        return new Data(num, str, str2, str3, str4);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Data) {
            Data data = (Data) obj;
            return Intrinsics.areEqual(this.amount, data.amount) && Intrinsics.areEqual(this.balance, data.balance) && Intrinsics.areEqual(this.subscriberNumber, data.subscriberNumber) && Intrinsics.areEqual(this.balanceSubscriber, data.balanceSubscriber) && Intrinsics.areEqual(this.refId, data.refId);
        }
        return false;
    }

    @Nullable
    public final Integer getAmount() {
        return this.amount;
    }

    @Nullable
    public final String getBalance() {
        return this.balance;
    }

    @Nullable
    public final String getBalanceSubscriber() {
        return this.balanceSubscriber;
    }

    @Nullable
    public final String getRefId() {
        return this.refId;
    }

    @Nullable
    public final String getSubscriberNumber() {
        return this.subscriberNumber;
    }

    public int hashCode() {
        Integer num = this.amount;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.balance;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.subscriberNumber;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.balanceSubscriber;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.refId;
        return hashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        Integer num = this.amount;
        String str = this.balance;
        String str2 = this.subscriberNumber;
        String str3 = this.balanceSubscriber;
        String str4 = this.refId;
        return "Data(amount=" + num + ", balance=" + str + ", subscriberNumber=" + str2 + ", balanceSubscriber=" + str3 + ", refId=" + str4 + ")";
    }

    public Data(@Nullable Integer num, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4) {
        this.amount = num;
        this.balance = str;
        this.subscriberNumber = str2;
        this.balanceSubscriber = str3;
        this.refId = str4;
    }

    public /* synthetic */ Data(Integer num, String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4);
    }
}
