package th.p047co.dtac.android.dtacone.model.inactive_user;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.i18n.ErrorBundle;
import org.bouncycastle.i18n.MessageBundle;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.view.fragment.mrtr_prepaid_registration.family_sim.InputPostpaidFamilySimSubscriberFragment;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u0000 #2\u00020\u0001:\u0004#$%&BI\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0018\b\u0002\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\n0\tj\b\u0012\u0004\u0012\u00020\n`\u000b¢\u0006\u0002\u0010\fJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0019\u0010\u001b\u001a\u0012\u0012\u0004\u0012\u00020\n0\tj\b\u0012\u0004\u0012\u00020\n`\u000bHÆ\u0003JM\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0018\b\u0002\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\n0\tj\b\u0012\u0004\u0012\u00020\n`\u000bHÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020\u0003HÖ\u0001J\b\u0010!\u001a\u00020\"H\u0016R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR&\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\n0\tj\b\u0012\u0004\u0012\u00020\n`\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u001e\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000e\"\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006'"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/inactive_user/OwnerTransactionCollection;", "", "date", "", "page", "maxPage", ErrorBundle.SUMMARY_ENTRY, "Lth/co/dtac/android/dtacone/model/inactive_user/OwnerTransactionCollection$Summary;", "lastTransactions", "Ljava/util/ArrayList;", "Lth/co/dtac/android/dtacone/model/inactive_user/OwnerTransactionCollection$LastTransaction;", "Lkotlin/collections/ArrayList;", "(IIILth/co/dtac/android/dtacone/model/inactive_user/OwnerTransactionCollection$Summary;Ljava/util/ArrayList;)V", "getDate", "()I", "getLastTransactions", "()Ljava/util/ArrayList;", "getMaxPage", "getPage", "setPage", "(I)V", "getSummary", "()Lth/co/dtac/android/dtacone/model/inactive_user/OwnerTransactionCollection$Summary;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "", "Companion", "LastTransaction", "Summary", "TransactionPrice", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.inactive_user.OwnerTransactionCollection */
/* loaded from: classes8.dex */
public final class OwnerTransactionCollection {
    public static final int HEADER = 0;
    public static final int TRANSACTION = 1;
    @SerializedName("date")
    private final int date;
    @SerializedName("lastTransactions")
    @NotNull
    private final ArrayList<LastTransaction> lastTransactions;
    @SerializedName("maxPage")
    private final int maxPage;
    @SerializedName("page")
    private int page;
    @SerializedName(ErrorBundle.SUMMARY_ENTRY)
    @Nullable
    private final Summary summary;
    @NotNull
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m29143d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/inactive_user/OwnerTransactionCollection$Companion;", "", "()V", "HEADER", "", "TRANSACTION", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.model.inactive_user.OwnerTransactionCollection$Companion */
    /* loaded from: classes8.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(m29143d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b-\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B¹\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0013J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0003HÆ\u0003J½\u0001\u00104\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u00105\u001a\u0002062\b\u00107\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00108\u001a\u000209HÖ\u0001J\t\u0010:\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0015R\u0018\u0010\r\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0015R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0015R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0015R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0015R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0015R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0015R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0015R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0015R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0015R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0015R\u0018\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0015¨\u0006;"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/inactive_user/OwnerTransactionCollection$LastTransaction;", "", "featureCode", "", "type", "displayType", InputPostpaidFamilySimSubscriberFragment.SUB_NUM, FirebaseAnalytics.Param.PRICE, "Lth/co/dtac/android/dtacone/model/inactive_user/OwnerTransactionCollection$TransactionPrice;", "displayDate", RemoteConfigConstants.RequestFieldKey.PACKAGE_NAME, "titleCreateBy", "valueCreateBy", "displayTime", "expireOption", "displayExpireDate", "displayExpireOption", "familyDetail", "familyNumber", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lth/co/dtac/android/dtacone/model/inactive_user/OwnerTransactionCollection$TransactionPrice;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDisplayDate", "()Ljava/lang/String;", "getDisplayExpireDate", "getDisplayExpireOption", "getDisplayTime", "getDisplayType", "getExpireOption", "getFamilyDetail", "getFamilyNumber", "getFeatureCode", "getPackageName", "getPrice", "()Lth/co/dtac/android/dtacone/model/inactive_user/OwnerTransactionCollection$TransactionPrice;", "getSubscriberNumber", "getTitleCreateBy", "getType", "getValueCreateBy", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.model.inactive_user.OwnerTransactionCollection$LastTransaction */
    /* loaded from: classes8.dex */
    public static final class LastTransaction {
        public static final int $stable = 0;
        @SerializedName("displayDate")
        @Nullable
        private final String displayDate;
        @SerializedName("displayExpireDate")
        @Nullable
        private final String displayExpireDate;
        @SerializedName("displayExpireOption")
        @Nullable
        private final String displayExpireOption;
        @SerializedName("displayTime")
        @Nullable
        private final String displayTime;
        @SerializedName("displayType")
        @Nullable
        private final String displayType;
        @SerializedName("expireOption")
        @Nullable
        private final String expireOption;
        @SerializedName("familiyDetail")
        @Nullable
        private final String familyDetail;
        @SerializedName("familiyNumber")
        @Nullable
        private final String familyNumber;
        @SerializedName("featureCode")
        @Nullable
        private final String featureCode;
        @SerializedName(RemoteConfigConstants.RequestFieldKey.PACKAGE_NAME)
        @Nullable
        private final String packageName;
        @SerializedName(FirebaseAnalytics.Param.PRICE)
        @Nullable
        private final TransactionPrice price;
        @SerializedName(InputPostpaidFamilySimSubscriberFragment.SUB_NUM)
        @Nullable
        private final String subscriberNumber;
        @SerializedName("titleCreateBy")
        @Nullable
        private final String titleCreateBy;
        @SerializedName("type")
        @Nullable
        private final String type;
        @SerializedName("valueCreateBy")
        @Nullable
        private final String valueCreateBy;

        public LastTransaction() {
            this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 32767, null);
        }

        @Nullable
        public final String component1() {
            return this.featureCode;
        }

        @Nullable
        public final String component10() {
            return this.displayTime;
        }

        @Nullable
        public final String component11() {
            return this.expireOption;
        }

        @Nullable
        public final String component12() {
            return this.displayExpireDate;
        }

        @Nullable
        public final String component13() {
            return this.displayExpireOption;
        }

        @Nullable
        public final String component14() {
            return this.familyDetail;
        }

        @Nullable
        public final String component15() {
            return this.familyNumber;
        }

        @Nullable
        public final String component2() {
            return this.type;
        }

        @Nullable
        public final String component3() {
            return this.displayType;
        }

        @Nullable
        public final String component4() {
            return this.subscriberNumber;
        }

        @Nullable
        public final TransactionPrice component5() {
            return this.price;
        }

        @Nullable
        public final String component6() {
            return this.displayDate;
        }

        @Nullable
        public final String component7() {
            return this.packageName;
        }

        @Nullable
        public final String component8() {
            return this.titleCreateBy;
        }

        @Nullable
        public final String component9() {
            return this.valueCreateBy;
        }

        @NotNull
        public final LastTransaction copy(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable TransactionPrice transactionPrice, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable String str10, @Nullable String str11, @Nullable String str12, @Nullable String str13, @Nullable String str14) {
            return new LastTransaction(str, str2, str3, str4, transactionPrice, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof LastTransaction) {
                LastTransaction lastTransaction = (LastTransaction) obj;
                return Intrinsics.areEqual(this.featureCode, lastTransaction.featureCode) && Intrinsics.areEqual(this.type, lastTransaction.type) && Intrinsics.areEqual(this.displayType, lastTransaction.displayType) && Intrinsics.areEqual(this.subscriberNumber, lastTransaction.subscriberNumber) && Intrinsics.areEqual(this.price, lastTransaction.price) && Intrinsics.areEqual(this.displayDate, lastTransaction.displayDate) && Intrinsics.areEqual(this.packageName, lastTransaction.packageName) && Intrinsics.areEqual(this.titleCreateBy, lastTransaction.titleCreateBy) && Intrinsics.areEqual(this.valueCreateBy, lastTransaction.valueCreateBy) && Intrinsics.areEqual(this.displayTime, lastTransaction.displayTime) && Intrinsics.areEqual(this.expireOption, lastTransaction.expireOption) && Intrinsics.areEqual(this.displayExpireDate, lastTransaction.displayExpireDate) && Intrinsics.areEqual(this.displayExpireOption, lastTransaction.displayExpireOption) && Intrinsics.areEqual(this.familyDetail, lastTransaction.familyDetail) && Intrinsics.areEqual(this.familyNumber, lastTransaction.familyNumber);
            }
            return false;
        }

        @Nullable
        public final String getDisplayDate() {
            return this.displayDate;
        }

        @Nullable
        public final String getDisplayExpireDate() {
            return this.displayExpireDate;
        }

        @Nullable
        public final String getDisplayExpireOption() {
            return this.displayExpireOption;
        }

        @Nullable
        public final String getDisplayTime() {
            return this.displayTime;
        }

        @Nullable
        public final String getDisplayType() {
            return this.displayType;
        }

        @Nullable
        public final String getExpireOption() {
            return this.expireOption;
        }

        @Nullable
        public final String getFamilyDetail() {
            return this.familyDetail;
        }

        @Nullable
        public final String getFamilyNumber() {
            return this.familyNumber;
        }

        @Nullable
        public final String getFeatureCode() {
            return this.featureCode;
        }

        @Nullable
        public final String getPackageName() {
            return this.packageName;
        }

        @Nullable
        public final TransactionPrice getPrice() {
            return this.price;
        }

        @Nullable
        public final String getSubscriberNumber() {
            return this.subscriberNumber;
        }

        @Nullable
        public final String getTitleCreateBy() {
            return this.titleCreateBy;
        }

        @Nullable
        public final String getType() {
            return this.type;
        }

        @Nullable
        public final String getValueCreateBy() {
            return this.valueCreateBy;
        }

        public int hashCode() {
            String str = this.featureCode;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.type;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.displayType;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.subscriberNumber;
            int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            TransactionPrice transactionPrice = this.price;
            int hashCode5 = (hashCode4 + (transactionPrice == null ? 0 : transactionPrice.hashCode())) * 31;
            String str5 = this.displayDate;
            int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.packageName;
            int hashCode7 = (hashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
            String str7 = this.titleCreateBy;
            int hashCode8 = (hashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
            String str8 = this.valueCreateBy;
            int hashCode9 = (hashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31;
            String str9 = this.displayTime;
            int hashCode10 = (hashCode9 + (str9 == null ? 0 : str9.hashCode())) * 31;
            String str10 = this.expireOption;
            int hashCode11 = (hashCode10 + (str10 == null ? 0 : str10.hashCode())) * 31;
            String str11 = this.displayExpireDate;
            int hashCode12 = (hashCode11 + (str11 == null ? 0 : str11.hashCode())) * 31;
            String str12 = this.displayExpireOption;
            int hashCode13 = (hashCode12 + (str12 == null ? 0 : str12.hashCode())) * 31;
            String str13 = this.familyDetail;
            int hashCode14 = (hashCode13 + (str13 == null ? 0 : str13.hashCode())) * 31;
            String str14 = this.familyNumber;
            return hashCode14 + (str14 != null ? str14.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            String str = this.featureCode;
            String str2 = this.type;
            String str3 = this.displayType;
            String str4 = this.subscriberNumber;
            TransactionPrice transactionPrice = this.price;
            String str5 = this.displayDate;
            String str6 = this.packageName;
            String str7 = this.titleCreateBy;
            String str8 = this.valueCreateBy;
            String str9 = this.displayTime;
            String str10 = this.expireOption;
            String str11 = this.displayExpireDate;
            String str12 = this.displayExpireOption;
            String str13 = this.familyDetail;
            String str14 = this.familyNumber;
            return "LastTransaction(featureCode=" + str + ", type=" + str2 + ", displayType=" + str3 + ", subscriberNumber=" + str4 + ", price=" + transactionPrice + ", displayDate=" + str5 + ", packageName=" + str6 + ", titleCreateBy=" + str7 + ", valueCreateBy=" + str8 + ", displayTime=" + str9 + ", expireOption=" + str10 + ", displayExpireDate=" + str11 + ", displayExpireOption=" + str12 + ", familyDetail=" + str13 + ", familyNumber=" + str14 + ")";
        }

        public LastTransaction(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable TransactionPrice transactionPrice, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable String str10, @Nullable String str11, @Nullable String str12, @Nullable String str13, @Nullable String str14) {
            this.featureCode = str;
            this.type = str2;
            this.displayType = str3;
            this.subscriberNumber = str4;
            this.price = transactionPrice;
            this.displayDate = str5;
            this.packageName = str6;
            this.titleCreateBy = str7;
            this.valueCreateBy = str8;
            this.displayTime = str9;
            this.expireOption = str10;
            this.displayExpireDate = str11;
            this.displayExpireOption = str12;
            this.familyDetail = str13;
            this.familyNumber = str14;
        }

        public /* synthetic */ LastTransaction(String str, String str2, String str3, String str4, TransactionPrice transactionPrice, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? null : transactionPrice, (i & 32) != 0 ? "" : str5, (i & 64) != 0 ? "" : str6, (i & 128) != 0 ? "" : str7, (i & 256) != 0 ? "" : str8, (i & 512) != 0 ? "" : str9, (i & 1024) != 0 ? "" : str10, (i & 2048) != 0 ? "" : str11, (i & 4096) != 0 ? "" : str12, (i & 8192) != 0 ? "" : str13, (i & 16384) == 0 ? str14 : "");
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(m29143d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J;\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006\u001b"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/inactive_user/OwnerTransactionCollection$Summary;", "", "listTitle", "", "listValue", MessageBundle.TITLE_ENTRY, "totalTitle", "totalValue", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getListTitle", "()Ljava/lang/String;", "getListValue", "getTitle", "getTotalTitle", "getTotalValue", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.model.inactive_user.OwnerTransactionCollection$Summary */
    /* loaded from: classes8.dex */
    public static final class Summary {
        public static final int $stable = 0;
        @SerializedName("listTitle")
        @NotNull
        private final String listTitle;
        @SerializedName("listValue")
        @NotNull
        private final String listValue;
        @SerializedName(MessageBundle.TITLE_ENTRY)
        @NotNull
        private final String title;
        @SerializedName("totalTitle")
        @NotNull
        private final String totalTitle;
        @SerializedName("totalValue")
        @NotNull
        private final String totalValue;

        public Summary() {
            this(null, null, null, null, null, 31, null);
        }

        public static /* synthetic */ Summary copy$default(Summary summary, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
            if ((i & 1) != 0) {
                str = summary.listTitle;
            }
            if ((i & 2) != 0) {
                str2 = summary.listValue;
            }
            String str6 = str2;
            if ((i & 4) != 0) {
                str3 = summary.title;
            }
            String str7 = str3;
            if ((i & 8) != 0) {
                str4 = summary.totalTitle;
            }
            String str8 = str4;
            if ((i & 16) != 0) {
                str5 = summary.totalValue;
            }
            return summary.copy(str, str6, str7, str8, str5);
        }

        @NotNull
        public final String component1() {
            return this.listTitle;
        }

        @NotNull
        public final String component2() {
            return this.listValue;
        }

        @NotNull
        public final String component3() {
            return this.title;
        }

        @NotNull
        public final String component4() {
            return this.totalTitle;
        }

        @NotNull
        public final String component5() {
            return this.totalValue;
        }

        @NotNull
        public final Summary copy(@NotNull String listTitle, @NotNull String listValue, @NotNull String title, @NotNull String totalTitle, @NotNull String totalValue) {
            Intrinsics.checkNotNullParameter(listTitle, "listTitle");
            Intrinsics.checkNotNullParameter(listValue, "listValue");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(totalTitle, "totalTitle");
            Intrinsics.checkNotNullParameter(totalValue, "totalValue");
            return new Summary(listTitle, listValue, title, totalTitle, totalValue);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Summary) {
                Summary summary = (Summary) obj;
                return Intrinsics.areEqual(this.listTitle, summary.listTitle) && Intrinsics.areEqual(this.listValue, summary.listValue) && Intrinsics.areEqual(this.title, summary.title) && Intrinsics.areEqual(this.totalTitle, summary.totalTitle) && Intrinsics.areEqual(this.totalValue, summary.totalValue);
            }
            return false;
        }

        @NotNull
        public final String getListTitle() {
            return this.listTitle;
        }

        @NotNull
        public final String getListValue() {
            return this.listValue;
        }

        @NotNull
        public final String getTitle() {
            return this.title;
        }

        @NotNull
        public final String getTotalTitle() {
            return this.totalTitle;
        }

        @NotNull
        public final String getTotalValue() {
            return this.totalValue;
        }

        public int hashCode() {
            return (((((((this.listTitle.hashCode() * 31) + this.listValue.hashCode()) * 31) + this.title.hashCode()) * 31) + this.totalTitle.hashCode()) * 31) + this.totalValue.hashCode();
        }

        @NotNull
        public String toString() {
            String str = this.listTitle;
            String str2 = this.listValue;
            String str3 = this.title;
            String str4 = this.totalTitle;
            String str5 = this.totalValue;
            return "Summary(listTitle=" + str + ", listValue=" + str2 + ", title=" + str3 + ", totalTitle=" + str4 + ", totalValue=" + str5 + ")";
        }

        public Summary(@NotNull String listTitle, @NotNull String listValue, @NotNull String title, @NotNull String totalTitle, @NotNull String totalValue) {
            Intrinsics.checkNotNullParameter(listTitle, "listTitle");
            Intrinsics.checkNotNullParameter(listValue, "listValue");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(totalTitle, "totalTitle");
            Intrinsics.checkNotNullParameter(totalValue, "totalValue");
            this.listTitle = listTitle;
            this.listValue = listValue;
            this.title = title;
            this.totalTitle = totalTitle;
            this.totalValue = totalValue;
        }

        public /* synthetic */ Summary(String str, String str2, String str3, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5);
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(m29143d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/inactive_user/OwnerTransactionCollection$TransactionPrice;", "", "amount", "", "unit", "(Ljava/lang/String;Ljava/lang/String;)V", "getAmount", "()Ljava/lang/String;", "getUnit", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.model.inactive_user.OwnerTransactionCollection$TransactionPrice */
    /* loaded from: classes8.dex */
    public static final class TransactionPrice {
        public static final int $stable = 0;
        @SerializedName("amount")
        @NotNull
        private final String amount;
        @SerializedName("unit")
        @NotNull
        private final String unit;

        public TransactionPrice() {
            this(null, null, 3, null);
        }

        public static /* synthetic */ TransactionPrice copy$default(TransactionPrice transactionPrice, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = transactionPrice.amount;
            }
            if ((i & 2) != 0) {
                str2 = transactionPrice.unit;
            }
            return transactionPrice.copy(str, str2);
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
        public final TransactionPrice copy(@NotNull String amount, @NotNull String unit) {
            Intrinsics.checkNotNullParameter(amount, "amount");
            Intrinsics.checkNotNullParameter(unit, "unit");
            return new TransactionPrice(amount, unit);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof TransactionPrice) {
                TransactionPrice transactionPrice = (TransactionPrice) obj;
                return Intrinsics.areEqual(this.amount, transactionPrice.amount) && Intrinsics.areEqual(this.unit, transactionPrice.unit);
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
            return "TransactionPrice(amount=" + str + ", unit=" + str2 + ")";
        }

        public TransactionPrice(@NotNull String amount, @NotNull String unit) {
            Intrinsics.checkNotNullParameter(amount, "amount");
            Intrinsics.checkNotNullParameter(unit, "unit");
            this.amount = amount;
            this.unit = unit;
        }

        public /* synthetic */ TransactionPrice(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2);
        }
    }

    public OwnerTransactionCollection() {
        this(0, 0, 0, null, null, 31, null);
    }

    public static /* synthetic */ OwnerTransactionCollection copy$default(OwnerTransactionCollection ownerTransactionCollection, int i, int i2, int i3, Summary summary, ArrayList arrayList, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = ownerTransactionCollection.date;
        }
        if ((i4 & 2) != 0) {
            i2 = ownerTransactionCollection.page;
        }
        int i5 = i2;
        if ((i4 & 4) != 0) {
            i3 = ownerTransactionCollection.maxPage;
        }
        int i6 = i3;
        if ((i4 & 8) != 0) {
            summary = ownerTransactionCollection.summary;
        }
        Summary summary2 = summary;
        ArrayList<LastTransaction> arrayList2 = arrayList;
        if ((i4 & 16) != 0) {
            arrayList2 = ownerTransactionCollection.lastTransactions;
        }
        return ownerTransactionCollection.copy(i, i5, i6, summary2, arrayList2);
    }

    public final int component1() {
        return this.date;
    }

    public final int component2() {
        return this.page;
    }

    public final int component3() {
        return this.maxPage;
    }

    @Nullable
    public final Summary component4() {
        return this.summary;
    }

    @NotNull
    public final ArrayList<LastTransaction> component5() {
        return this.lastTransactions;
    }

    @NotNull
    public final OwnerTransactionCollection copy(int i, int i2, int i3, @Nullable Summary summary, @NotNull ArrayList<LastTransaction> lastTransactions) {
        Intrinsics.checkNotNullParameter(lastTransactions, "lastTransactions");
        return new OwnerTransactionCollection(i, i2, i3, summary, lastTransactions);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OwnerTransactionCollection) {
            OwnerTransactionCollection ownerTransactionCollection = (OwnerTransactionCollection) obj;
            return this.date == ownerTransactionCollection.date && this.page == ownerTransactionCollection.page && this.maxPage == ownerTransactionCollection.maxPage && Intrinsics.areEqual(this.summary, ownerTransactionCollection.summary) && Intrinsics.areEqual(this.lastTransactions, ownerTransactionCollection.lastTransactions);
        }
        return false;
    }

    public final int getDate() {
        return this.date;
    }

    @NotNull
    public final ArrayList<LastTransaction> getLastTransactions() {
        return this.lastTransactions;
    }

    public final int getMaxPage() {
        return this.maxPage;
    }

    public final int getPage() {
        return this.page;
    }

    @Nullable
    public final Summary getSummary() {
        return this.summary;
    }

    public int hashCode() {
        int i = ((((this.date * 31) + this.page) * 31) + this.maxPage) * 31;
        Summary summary = this.summary;
        return ((i + (summary == null ? 0 : summary.hashCode())) * 31) + this.lastTransactions.hashCode();
    }

    public final void setPage(int i) {
        this.page = i;
    }

    @NotNull
    public String toString() {
        int i = this.date;
        return "OwnerTransactionCollection(date='" + i + "')";
    }

    public OwnerTransactionCollection(int i, int i2, int i3, @Nullable Summary summary, @NotNull ArrayList<LastTransaction> lastTransactions) {
        Intrinsics.checkNotNullParameter(lastTransactions, "lastTransactions");
        this.date = i;
        this.page = i2;
        this.maxPage = i3;
        this.summary = summary;
        this.lastTransactions = lastTransactions;
    }

    public /* synthetic */ OwnerTransactionCollection(int i, int i2, int i3, Summary summary, ArrayList arrayList, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? 0 : i, (i4 & 2) != 0 ? 0 : i2, (i4 & 4) == 0 ? i3 : 0, (i4 & 8) != 0 ? null : summary, (i4 & 16) != 0 ? new ArrayList() : arrayList);
    }
}