package th.p047co.dtac.android.dtacone.model.inactive_user;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.view.fragment.mrtr_prepaid_registration.family_sim.InputPostpaidFamilySimSubscriberFragment;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000f\b\u0007\u0018\u0000 \u00182\u00020\u0001:\u0002\u0018\u0019BM\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\b\u0010\u0017\u001a\u00020\u0003H\u0016R\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000eR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000e¨\u0006\u001a"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/inactive_user/InactiveOwnerTransectionCollection;", "", "type", "", "displayType", InputPostpaidFamilySimSubscriberFragment.SUB_NUM, FirebaseAnalytics.Param.PRICE, "Lth/co/dtac/android/dtacone/model/inactive_user/InactiveOwnerTransectionCollection$InactiveTransactionPrice;", "displayDate", "displayTime", "recordType", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lth/co/dtac/android/dtacone/model/inactive_user/InactiveOwnerTransectionCollection$InactiveTransactionPrice;Ljava/lang/String;Ljava/lang/String;I)V", "getDisplayDate", "()Ljava/lang/String;", "getDisplayTime", "getDisplayType", "getPrice", "()Lth/co/dtac/android/dtacone/model/inactive_user/InactiveOwnerTransectionCollection$InactiveTransactionPrice;", "getRecordType", "()I", "getSubscriberNumber", "getType", "toString", "Companion", "InactiveTransactionPrice", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.inactive_user.InactiveOwnerTransectionCollection */
/* loaded from: classes8.dex */
public final class InactiveOwnerTransectionCollection {
    public static final int $stable = 0;
    @NotNull
    public static final Companion Companion = new Companion(null);
    public static final int HEADER = 0;
    public static final int TRANSACTION = 1;
    @SerializedName("displayDate")
    @NotNull
    private final String displayDate;
    @SerializedName("displayTime")
    @NotNull
    private final String displayTime;
    @SerializedName("displayType")
    @NotNull
    private final String displayType;
    @SerializedName(FirebaseAnalytics.Param.PRICE)
    @Nullable
    private final InactiveTransactionPrice price;
    private final int recordType;
    @SerializedName(InputPostpaidFamilySimSubscriberFragment.SUB_NUM)
    @NotNull
    private final String subscriberNumber;
    @SerializedName("type")
    @NotNull
    private final String type;

    @Metadata(m29143d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/inactive_user/InactiveOwnerTransectionCollection$Companion;", "", "()V", "HEADER", "", "TRANSACTION", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.model.inactive_user.InactiveOwnerTransectionCollection$Companion */
    /* loaded from: classes8.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(m29143d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/inactive_user/InactiveOwnerTransectionCollection$InactiveTransactionPrice;", "", "amount", "", "unit", "(Ljava/lang/String;Ljava/lang/String;)V", "getAmount", "()Ljava/lang/String;", "getUnit", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.model.inactive_user.InactiveOwnerTransectionCollection$InactiveTransactionPrice */
    /* loaded from: classes8.dex */
    public static final class InactiveTransactionPrice {
        public static final int $stable = 0;
        @SerializedName("amount")
        @NotNull
        private final String amount;
        @SerializedName("unit")
        @NotNull
        private final String unit;

        public InactiveTransactionPrice() {
            this(null, null, 3, null);
        }

        public static /* synthetic */ InactiveTransactionPrice copy$default(InactiveTransactionPrice inactiveTransactionPrice, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = inactiveTransactionPrice.amount;
            }
            if ((i & 2) != 0) {
                str2 = inactiveTransactionPrice.unit;
            }
            return inactiveTransactionPrice.copy(str, str2);
        }

        @NotNull
        public final String component1() {
            return this.amount;
        }

        @NotNull
        public final String component2() {
            return this.unit;
        }

        @NotNull
        public final InactiveTransactionPrice copy(@NotNull String amount, @NotNull String unit) {
            Intrinsics.checkNotNullParameter(amount, "amount");
            Intrinsics.checkNotNullParameter(unit, "unit");
            return new InactiveTransactionPrice(amount, unit);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof InactiveTransactionPrice) {
                InactiveTransactionPrice inactiveTransactionPrice = (InactiveTransactionPrice) obj;
                return Intrinsics.areEqual(this.amount, inactiveTransactionPrice.amount) && Intrinsics.areEqual(this.unit, inactiveTransactionPrice.unit);
            }
            return false;
        }

        @NotNull
        public final String getAmount() {
            return this.amount;
        }

        @NotNull
        public final String getUnit() {
            return this.unit;
        }

        public int hashCode() {
            return (this.amount.hashCode() * 31) + this.unit.hashCode();
        }

        @NotNull
        public String toString() {
            String str = this.amount;
            String str2 = this.unit;
            return "InactiveTransactionPrice(amount=" + str + ", unit=" + str2 + ")";
        }

        public InactiveTransactionPrice(@NotNull String amount, @NotNull String unit) {
            Intrinsics.checkNotNullParameter(amount, "amount");
            Intrinsics.checkNotNullParameter(unit, "unit");
            this.amount = amount;
            this.unit = unit;
        }

        public /* synthetic */ InactiveTransactionPrice(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2);
        }
    }

    public InactiveOwnerTransectionCollection() {
        this(null, null, null, null, null, null, 0, 127, null);
    }

    @NotNull
    public final String getDisplayDate() {
        return this.displayDate;
    }

    @NotNull
    public final String getDisplayTime() {
        return this.displayTime;
    }

    @NotNull
    public final String getDisplayType() {
        return this.displayType;
    }

    @Nullable
    public final InactiveTransactionPrice getPrice() {
        return this.price;
    }

    public final int getRecordType() {
        return this.recordType;
    }

    @NotNull
    public final String getSubscriberNumber() {
        return this.subscriberNumber;
    }

    @NotNull
    public final String getType() {
        return this.type;
    }

    @NotNull
    public String toString() {
        String str = this.type;
        String str2 = this.displayType;
        String str3 = this.subscriberNumber;
        InactiveTransactionPrice inactiveTransactionPrice = this.price;
        String str4 = this.displayDate;
        String str5 = this.displayTime;
        return "OwnerTransactionCollection(type='" + str + "', displayType='" + str2 + "', subscriberNumber=" + str3 + ", price=" + inactiveTransactionPrice + ", displayDate=" + str4 + ", displayTime=" + str5 + ")";
    }

    public InactiveOwnerTransectionCollection(@NotNull String type, @NotNull String displayType, @NotNull String subscriberNumber, @Nullable InactiveTransactionPrice inactiveTransactionPrice, @NotNull String displayDate, @NotNull String displayTime, int i) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(displayType, "displayType");
        Intrinsics.checkNotNullParameter(subscriberNumber, "subscriberNumber");
        Intrinsics.checkNotNullParameter(displayDate, "displayDate");
        Intrinsics.checkNotNullParameter(displayTime, "displayTime");
        this.type = type;
        this.displayType = displayType;
        this.subscriberNumber = subscriberNumber;
        this.price = inactiveTransactionPrice;
        this.displayDate = displayDate;
        this.displayTime = displayTime;
        this.recordType = i;
    }

    public /* synthetic */ InactiveOwnerTransectionCollection(String str, String str2, String str3, InactiveTransactionPrice inactiveTransactionPrice, String str4, String str5, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? "" : str3, (i2 & 8) != 0 ? null : inactiveTransactionPrice, (i2 & 16) != 0 ? "" : str4, (i2 & 32) == 0 ? str5 : "", (i2 & 64) != 0 ? 1 : i);
    }
}