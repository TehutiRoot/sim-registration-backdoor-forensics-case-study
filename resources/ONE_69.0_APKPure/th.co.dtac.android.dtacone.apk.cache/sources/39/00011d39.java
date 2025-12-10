package th.p047co.dtac.android.dtacone.model.change_pack;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.util.constant.customerenquiry.ConstsKt;
import th.p047co.dtac.android.dtacone.view.fragment.mrtr_prepaid_registration.family_sim.InputPostpaidFamilySimSubscriberFragment;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0003¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\bHÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003JE\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001a\u001a\u00020\b2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\f¨\u0006\u001f"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/change_pack/ConfirmPackageDialog;", "", InputPostpaidFamilySimSubscriberFragment.SUB_NUM, "", "startDate", "newPackageDescription", ConstsKt.TELEPHONE_TYPE, "haveFee", "", "amount", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V", "getAmount", "()Ljava/lang/String;", "getHaveFee", "()Z", "getNewPackageDescription", "getStartDate", "getSubscriberNumber", "getTelephoneType", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "", "toString", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.change_pack.ConfirmPackageDialog */
/* loaded from: classes8.dex */
public final class ConfirmPackageDialog {
    public static final int $stable = 0;
    @NotNull
    private final String amount;
    private final boolean haveFee;
    @NotNull
    private final String newPackageDescription;
    @NotNull
    private final String startDate;
    @NotNull
    private final String subscriberNumber;
    @NotNull
    private final String telephoneType;

    public ConfirmPackageDialog(@NotNull String subscriberNumber, @NotNull String startDate, @NotNull String newPackageDescription, @NotNull String telephoneType, boolean z, @NotNull String amount) {
        Intrinsics.checkNotNullParameter(subscriberNumber, "subscriberNumber");
        Intrinsics.checkNotNullParameter(startDate, "startDate");
        Intrinsics.checkNotNullParameter(newPackageDescription, "newPackageDescription");
        Intrinsics.checkNotNullParameter(telephoneType, "telephoneType");
        Intrinsics.checkNotNullParameter(amount, "amount");
        this.subscriberNumber = subscriberNumber;
        this.startDate = startDate;
        this.newPackageDescription = newPackageDescription;
        this.telephoneType = telephoneType;
        this.haveFee = z;
        this.amount = amount;
    }

    public static /* synthetic */ ConfirmPackageDialog copy$default(ConfirmPackageDialog confirmPackageDialog, String str, String str2, String str3, String str4, boolean z, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = confirmPackageDialog.subscriberNumber;
        }
        if ((i & 2) != 0) {
            str2 = confirmPackageDialog.startDate;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = confirmPackageDialog.newPackageDescription;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = confirmPackageDialog.telephoneType;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            z = confirmPackageDialog.haveFee;
        }
        boolean z2 = z;
        if ((i & 32) != 0) {
            str5 = confirmPackageDialog.amount;
        }
        return confirmPackageDialog.copy(str, str6, str7, str8, z2, str5);
    }

    @NotNull
    public final String component1() {
        return this.subscriberNumber;
    }

    @NotNull
    public final String component2() {
        return this.startDate;
    }

    @NotNull
    public final String component3() {
        return this.newPackageDescription;
    }

    @NotNull
    public final String component4() {
        return this.telephoneType;
    }

    public final boolean component5() {
        return this.haveFee;
    }

    @NotNull
    public final String component6() {
        return this.amount;
    }

    @NotNull
    public final ConfirmPackageDialog copy(@NotNull String subscriberNumber, @NotNull String startDate, @NotNull String newPackageDescription, @NotNull String telephoneType, boolean z, @NotNull String amount) {
        Intrinsics.checkNotNullParameter(subscriberNumber, "subscriberNumber");
        Intrinsics.checkNotNullParameter(startDate, "startDate");
        Intrinsics.checkNotNullParameter(newPackageDescription, "newPackageDescription");
        Intrinsics.checkNotNullParameter(telephoneType, "telephoneType");
        Intrinsics.checkNotNullParameter(amount, "amount");
        return new ConfirmPackageDialog(subscriberNumber, startDate, newPackageDescription, telephoneType, z, amount);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ConfirmPackageDialog) {
            ConfirmPackageDialog confirmPackageDialog = (ConfirmPackageDialog) obj;
            return Intrinsics.areEqual(this.subscriberNumber, confirmPackageDialog.subscriberNumber) && Intrinsics.areEqual(this.startDate, confirmPackageDialog.startDate) && Intrinsics.areEqual(this.newPackageDescription, confirmPackageDialog.newPackageDescription) && Intrinsics.areEqual(this.telephoneType, confirmPackageDialog.telephoneType) && this.haveFee == confirmPackageDialog.haveFee && Intrinsics.areEqual(this.amount, confirmPackageDialog.amount);
        }
        return false;
    }

    @NotNull
    public final String getAmount() {
        return this.amount;
    }

    public final boolean getHaveFee() {
        return this.haveFee;
    }

    @NotNull
    public final String getNewPackageDescription() {
        return this.newPackageDescription;
    }

    @NotNull
    public final String getStartDate() {
        return this.startDate;
    }

    @NotNull
    public final String getSubscriberNumber() {
        return this.subscriberNumber;
    }

    @NotNull
    public final String getTelephoneType() {
        return this.telephoneType;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((((this.subscriberNumber.hashCode() * 31) + this.startDate.hashCode()) * 31) + this.newPackageDescription.hashCode()) * 31) + this.telephoneType.hashCode()) * 31;
        boolean z = this.haveFee;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return ((hashCode + i) * 31) + this.amount.hashCode();
    }

    @NotNull
    public String toString() {
        String str = this.subscriberNumber;
        String str2 = this.startDate;
        String str3 = this.newPackageDescription;
        String str4 = this.telephoneType;
        boolean z = this.haveFee;
        String str5 = this.amount;
        return "ConfirmPackageDialog(subscriberNumber=" + str + ", startDate=" + str2 + ", newPackageDescription=" + str3 + ", telephoneType=" + str4 + ", haveFee=" + z + ", amount=" + str5 + ")";
    }
}