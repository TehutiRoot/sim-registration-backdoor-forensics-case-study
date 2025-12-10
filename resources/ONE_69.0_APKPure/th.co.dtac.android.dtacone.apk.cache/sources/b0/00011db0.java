package th.p047co.dtac.android.dtacone.model.customerenquiry;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003¢\u0006\u0002\u0010\tJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J;\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\u0007HÖ\u0001J\t\u0010\"\u001a\u00020\u0003HÖ\u0001R\u001e\u0010\u0005\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001e\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000b\"\u0004\b\u000f\u0010\rR\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u000b\"\u0004\b\u0011\u0010\rR\u001e\u0010\b\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000b\"\u0004\b\u0013\u0010\rR\u001e\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006#"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/customerenquiry/FutureTransaction;", "", "transactionReason", "", "transactionLongDescription", "displayMessage", "transactionType", "", "transactionStartDate", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V", "getDisplayMessage", "()Ljava/lang/String;", "setDisplayMessage", "(Ljava/lang/String;)V", "getTransactionLongDescription", "setTransactionLongDescription", "getTransactionReason", "setTransactionReason", "getTransactionStartDate", "setTransactionStartDate", "getTransactionType", "()I", "setTransactionType", "(I)V", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.customerenquiry.FutureTransaction */
/* loaded from: classes8.dex */
public final class FutureTransaction {
    public static final int $stable = 8;
    @SerializedName("displayMessage")
    @NotNull
    private String displayMessage;
    @SerializedName("transactionLongDescription")
    @NotNull
    private String transactionLongDescription;
    @SerializedName("transactionReason")
    @NotNull
    private String transactionReason;
    @SerializedName("transactionStartDate")
    @NotNull
    private String transactionStartDate;
    @SerializedName("transactionType")
    private int transactionType;

    public FutureTransaction() {
        this(null, null, null, 0, null, 31, null);
    }

    public static /* synthetic */ FutureTransaction copy$default(FutureTransaction futureTransaction, String str, String str2, String str3, int i, String str4, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = futureTransaction.transactionReason;
        }
        if ((i2 & 2) != 0) {
            str2 = futureTransaction.transactionLongDescription;
        }
        String str5 = str2;
        if ((i2 & 4) != 0) {
            str3 = futureTransaction.displayMessage;
        }
        String str6 = str3;
        if ((i2 & 8) != 0) {
            i = futureTransaction.transactionType;
        }
        int i3 = i;
        if ((i2 & 16) != 0) {
            str4 = futureTransaction.transactionStartDate;
        }
        return futureTransaction.copy(str, str5, str6, i3, str4);
    }

    @NotNull
    public final String component1() {
        return this.transactionReason;
    }

    @NotNull
    public final String component2() {
        return this.transactionLongDescription;
    }

    @NotNull
    public final String component3() {
        return this.displayMessage;
    }

    public final int component4() {
        return this.transactionType;
    }

    @NotNull
    public final String component5() {
        return this.transactionStartDate;
    }

    @NotNull
    public final FutureTransaction copy(@NotNull String transactionReason, @NotNull String transactionLongDescription, @NotNull String displayMessage, int i, @NotNull String transactionStartDate) {
        Intrinsics.checkNotNullParameter(transactionReason, "transactionReason");
        Intrinsics.checkNotNullParameter(transactionLongDescription, "transactionLongDescription");
        Intrinsics.checkNotNullParameter(displayMessage, "displayMessage");
        Intrinsics.checkNotNullParameter(transactionStartDate, "transactionStartDate");
        return new FutureTransaction(transactionReason, transactionLongDescription, displayMessage, i, transactionStartDate);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof FutureTransaction) {
            FutureTransaction futureTransaction = (FutureTransaction) obj;
            return Intrinsics.areEqual(this.transactionReason, futureTransaction.transactionReason) && Intrinsics.areEqual(this.transactionLongDescription, futureTransaction.transactionLongDescription) && Intrinsics.areEqual(this.displayMessage, futureTransaction.displayMessage) && this.transactionType == futureTransaction.transactionType && Intrinsics.areEqual(this.transactionStartDate, futureTransaction.transactionStartDate);
        }
        return false;
    }

    @NotNull
    public final String getDisplayMessage() {
        return this.displayMessage;
    }

    @NotNull
    public final String getTransactionLongDescription() {
        return this.transactionLongDescription;
    }

    @NotNull
    public final String getTransactionReason() {
        return this.transactionReason;
    }

    @NotNull
    public final String getTransactionStartDate() {
        return this.transactionStartDate;
    }

    public final int getTransactionType() {
        return this.transactionType;
    }

    public int hashCode() {
        return (((((((this.transactionReason.hashCode() * 31) + this.transactionLongDescription.hashCode()) * 31) + this.displayMessage.hashCode()) * 31) + this.transactionType) * 31) + this.transactionStartDate.hashCode();
    }

    public final void setDisplayMessage(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.displayMessage = str;
    }

    public final void setTransactionLongDescription(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.transactionLongDescription = str;
    }

    public final void setTransactionReason(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.transactionReason = str;
    }

    public final void setTransactionStartDate(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.transactionStartDate = str;
    }

    public final void setTransactionType(int i) {
        this.transactionType = i;
    }

    @NotNull
    public String toString() {
        String str = this.transactionReason;
        String str2 = this.transactionLongDescription;
        String str3 = this.displayMessage;
        int i = this.transactionType;
        String str4 = this.transactionStartDate;
        return "FutureTransaction(transactionReason=" + str + ", transactionLongDescription=" + str2 + ", displayMessage=" + str3 + ", transactionType=" + i + ", transactionStartDate=" + str4 + ")";
    }

    public FutureTransaction(@NotNull String transactionReason, @NotNull String transactionLongDescription, @NotNull String displayMessage, int i, @NotNull String transactionStartDate) {
        Intrinsics.checkNotNullParameter(transactionReason, "transactionReason");
        Intrinsics.checkNotNullParameter(transactionLongDescription, "transactionLongDescription");
        Intrinsics.checkNotNullParameter(displayMessage, "displayMessage");
        Intrinsics.checkNotNullParameter(transactionStartDate, "transactionStartDate");
        this.transactionReason = transactionReason;
        this.transactionLongDescription = transactionLongDescription;
        this.displayMessage = displayMessage;
        this.transactionType = i;
        this.transactionStartDate = transactionStartDate;
    }

    public /* synthetic */ FutureTransaction(String str, String str2, String str3, int i, String str4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? "" : str3, (i2 & 8) != 0 ? 0 : i, (i2 & 16) != 0 ? "" : str4);
    }
}