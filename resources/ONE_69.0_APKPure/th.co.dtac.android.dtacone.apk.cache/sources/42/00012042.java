package th.p047co.dtac.android.dtacone.model.rtr_performance;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b \n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 +2\u00020\u0001:\u0001+B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0085\u0001\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\u0006\u0010\u000b\u001a\u00020\u0006\u0012\u0006\u0010\f\u001a\u00020\u0006\u0012\u0006\u0010\r\u001a\u00020\u0006\u0012\u0006\u0010\u000e\u001a\u00020\u0006\u0012\u0006\u0010\u000f\u001a\u00020\u0006\u0012\u0006\u0010\u0010\u001a\u00020\u0006\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0014\u001a\u00020\u0006¢\u0006\u0002\u0010\u0015J\b\u0010&\u001a\u00020'H\u0016J\u0018\u0010(\u001a\u00020)2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010*\u001a\u00020'H\u0016R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0017R\u0016\u0010\u0010\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0017R\u0016\u0010\t\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0017R\u0016\u0010\b\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0017R\u0016\u0010\u000e\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0017R\u0016\u0010\u000f\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0017R\u0016\u0010\u0014\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0017R\u0016\u0010\n\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0017R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0017R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0017R\u0016\u0010\f\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0017R\u0016\u0010\r\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0017R\u0016\u0010\u000b\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0017¨\u0006,"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/rtr_performance/CommissionHistoryCollection;", "Landroid/os/Parcelable;", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "paidStatus", "", "paidErrorMessage", "commissionPeriod", "commissionDate", "paidDate", "totalCommission", "paidTypeLabel", "paidTypeValue", "dtacOnlinePaidTypeLabel", "dtacOnlinePaidTypeValue", "cashPaidTypeLabel", "cashPaidTypeBankName", "cashPaidTypeBankAccountName", "cashPaidTypeBankAccountNumber", "flagGeneratedPdf", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCashPaidTypeBankAccountName", "()Ljava/lang/String;", "getCashPaidTypeBankAccountNumber", "getCashPaidTypeBankName", "getCashPaidTypeLabel", "getCommissionDate", "getCommissionPeriod", "getDtacOnlinePaidTypeLabel", "getDtacOnlinePaidTypeValue", "getFlagGeneratedPdf", "getPaidDate", "getPaidErrorMessage", "getPaidStatus", "getPaidTypeLabel", "getPaidTypeValue", "getTotalCommission", "describeContents", "", "writeToParcel", "", "flags", "CREATOR", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.rtr_performance.CommissionHistoryCollection */
/* loaded from: classes8.dex */
public final class CommissionHistoryCollection implements Parcelable {
    public static final int $stable = 0;
    @NotNull
    public static final CREATOR CREATOR = new CREATOR(null);
    @NotNull
    public static final String PAY_TYPE_CASH = "เงินสด";
    @NotNull
    public static final String PAY_TYPE_DTAC_ONLINE = "ดีแทคออนไลน์";
    @NotNull
    public static final String STATUS_BANK_REJECT = "Bank Reject";
    @NotNull
    public static final String STATUS_CALCULATION = "CALCULATION";
    @NotNull
    public static final String STATUS_INVALID_PROFILE = "Invalid Profile";
    @NotNull
    public static final String STATUS_IN_PROGRESS = "In-Progress";
    @NotNull
    public static final String STATUS_PAID = "Paid";
    @NotNull
    public static final String STATUS_PAY_FAIL = "Pay Fail";
    @SerializedName("cashPaidTypeBankAccountName")
    @Nullable
    private final String cashPaidTypeBankAccountName;
    @SerializedName("cashPaidTypeBankAccountNumber")
    @Nullable
    private final String cashPaidTypeBankAccountNumber;
    @SerializedName("cashPaidTypeBankName")
    @Nullable
    private final String cashPaidTypeBankName;
    @SerializedName("cashPaidTypeLabel")
    @NotNull
    private final String cashPaidTypeLabel;
    @SerializedName("commissionDate")
    @NotNull
    private final String commissionDate;
    @SerializedName("commissionPeriod")
    @NotNull
    private final String commissionPeriod;
    @SerializedName("dtacOnlinePaidTypeLabel")
    @NotNull
    private final String dtacOnlinePaidTypeLabel;
    @SerializedName("dtacOnlinePaidTypeValue")
    @NotNull
    private final String dtacOnlinePaidTypeValue;
    @SerializedName("flagGeneratedPdf")
    @NotNull
    private final String flagGeneratedPdf;
    @SerializedName("paidDate")
    @NotNull
    private final String paidDate;
    @SerializedName("paidErrorMessage")
    @Nullable
    private final String paidErrorMessage;
    @SerializedName("paidStatus")
    @NotNull
    private final String paidStatus;
    @SerializedName("paidTypeLabel")
    @NotNull
    private final String paidTypeLabel;
    @SerializedName("paidTypeValue")
    @NotNull
    private final String paidTypeValue;
    @SerializedName("totalCommission")
    @NotNull
    private final String totalCommission;

    @Metadata(m29143d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0010\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u001d\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016¢\u0006\u0002\u0010\u0014R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0015"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/rtr_performance/CommissionHistoryCollection$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lth/co/dtac/android/dtacone/model/rtr_performance/CommissionHistoryCollection;", "()V", "PAY_TYPE_CASH", "", "PAY_TYPE_DTAC_ONLINE", "STATUS_BANK_REJECT", "STATUS_CALCULATION", "STATUS_INVALID_PROFILE", "STATUS_IN_PROGRESS", "STATUS_PAID", "STATUS_PAY_FAIL", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", "size", "", "(I)[Lth/co/dtac/android/dtacone/model/rtr_performance/CommissionHistoryCollection;", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.model.rtr_performance.CommissionHistoryCollection$CREATOR */
    /* loaded from: classes8.dex */
    public static final class CREATOR implements Parcelable.Creator<CommissionHistoryCollection> {
        public /* synthetic */ CREATOR(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private CREATOR() {
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        public CommissionHistoryCollection createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CommissionHistoryCollection(parcel);
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        public CommissionHistoryCollection[] newArray(int i) {
            return new CommissionHistoryCollection[i];
        }
    }

    public CommissionHistoryCollection(@NotNull String paidStatus, @Nullable String str, @NotNull String commissionPeriod, @NotNull String commissionDate, @NotNull String paidDate, @NotNull String totalCommission, @NotNull String paidTypeLabel, @NotNull String paidTypeValue, @NotNull String dtacOnlinePaidTypeLabel, @NotNull String dtacOnlinePaidTypeValue, @NotNull String cashPaidTypeLabel, @Nullable String str2, @Nullable String str3, @Nullable String str4, @NotNull String flagGeneratedPdf) {
        Intrinsics.checkNotNullParameter(paidStatus, "paidStatus");
        Intrinsics.checkNotNullParameter(commissionPeriod, "commissionPeriod");
        Intrinsics.checkNotNullParameter(commissionDate, "commissionDate");
        Intrinsics.checkNotNullParameter(paidDate, "paidDate");
        Intrinsics.checkNotNullParameter(totalCommission, "totalCommission");
        Intrinsics.checkNotNullParameter(paidTypeLabel, "paidTypeLabel");
        Intrinsics.checkNotNullParameter(paidTypeValue, "paidTypeValue");
        Intrinsics.checkNotNullParameter(dtacOnlinePaidTypeLabel, "dtacOnlinePaidTypeLabel");
        Intrinsics.checkNotNullParameter(dtacOnlinePaidTypeValue, "dtacOnlinePaidTypeValue");
        Intrinsics.checkNotNullParameter(cashPaidTypeLabel, "cashPaidTypeLabel");
        Intrinsics.checkNotNullParameter(flagGeneratedPdf, "flagGeneratedPdf");
        this.paidStatus = paidStatus;
        this.paidErrorMessage = str;
        this.commissionPeriod = commissionPeriod;
        this.commissionDate = commissionDate;
        this.paidDate = paidDate;
        this.totalCommission = totalCommission;
        this.paidTypeLabel = paidTypeLabel;
        this.paidTypeValue = paidTypeValue;
        this.dtacOnlinePaidTypeLabel = dtacOnlinePaidTypeLabel;
        this.dtacOnlinePaidTypeValue = dtacOnlinePaidTypeValue;
        this.cashPaidTypeLabel = cashPaidTypeLabel;
        this.cashPaidTypeBankName = str2;
        this.cashPaidTypeBankAccountName = str3;
        this.cashPaidTypeBankAccountNumber = str4;
        this.flagGeneratedPdf = flagGeneratedPdf;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Nullable
    public final String getCashPaidTypeBankAccountName() {
        return this.cashPaidTypeBankAccountName;
    }

    @Nullable
    public final String getCashPaidTypeBankAccountNumber() {
        return this.cashPaidTypeBankAccountNumber;
    }

    @Nullable
    public final String getCashPaidTypeBankName() {
        return this.cashPaidTypeBankName;
    }

    @NotNull
    public final String getCashPaidTypeLabel() {
        return this.cashPaidTypeLabel;
    }

    @NotNull
    public final String getCommissionDate() {
        return this.commissionDate;
    }

    @NotNull
    public final String getCommissionPeriod() {
        return this.commissionPeriod;
    }

    @NotNull
    public final String getDtacOnlinePaidTypeLabel() {
        return this.dtacOnlinePaidTypeLabel;
    }

    @NotNull
    public final String getDtacOnlinePaidTypeValue() {
        return this.dtacOnlinePaidTypeValue;
    }

    @NotNull
    public final String getFlagGeneratedPdf() {
        return this.flagGeneratedPdf;
    }

    @NotNull
    public final String getPaidDate() {
        return this.paidDate;
    }

    @Nullable
    public final String getPaidErrorMessage() {
        return this.paidErrorMessage;
    }

    @NotNull
    public final String getPaidStatus() {
        return this.paidStatus;
    }

    @NotNull
    public final String getPaidTypeLabel() {
        return this.paidTypeLabel;
    }

    @NotNull
    public final String getPaidTypeValue() {
        return this.paidTypeValue;
    }

    @NotNull
    public final String getTotalCommission() {
        return this.totalCommission;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.writeString(this.paidStatus);
        parcel.writeString(this.paidErrorMessage);
        parcel.writeString(this.commissionPeriod);
        parcel.writeString(this.commissionDate);
        parcel.writeString(this.paidDate);
        parcel.writeString(this.totalCommission);
        parcel.writeString(this.paidTypeLabel);
        parcel.writeString(this.paidTypeValue);
        parcel.writeString(this.dtacOnlinePaidTypeLabel);
        parcel.writeString(this.dtacOnlinePaidTypeValue);
        parcel.writeString(this.cashPaidTypeLabel);
        parcel.writeString(this.cashPaidTypeBankName);
        parcel.writeString(this.cashPaidTypeBankAccountName);
        parcel.writeString(this.cashPaidTypeBankAccountNumber);
        parcel.writeString(this.flagGeneratedPdf);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public CommissionHistoryCollection(@org.jetbrains.annotations.NotNull android.os.Parcel r20) {
        /*
            r19 = this;
            java.lang.String r0 = "parcel"
            r1 = r20
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = r20.readString()
            java.lang.String r2 = ""
            if (r0 != 0) goto L11
            r4 = r2
            goto L12
        L11:
            r4 = r0
        L12:
            java.lang.String r0 = r20.readString()
            if (r0 != 0) goto L1a
            r5 = r2
            goto L1b
        L1a:
            r5 = r0
        L1b:
            java.lang.String r0 = r20.readString()
            if (r0 != 0) goto L23
            r6 = r2
            goto L24
        L23:
            r6 = r0
        L24:
            java.lang.String r0 = r20.readString()
            if (r0 != 0) goto L2c
            r7 = r2
            goto L2d
        L2c:
            r7 = r0
        L2d:
            java.lang.String r0 = r20.readString()
            if (r0 != 0) goto L35
            r8 = r2
            goto L36
        L35:
            r8 = r0
        L36:
            java.lang.String r0 = r20.readString()
            if (r0 != 0) goto L3e
            r9 = r2
            goto L3f
        L3e:
            r9 = r0
        L3f:
            java.lang.String r0 = r20.readString()
            if (r0 != 0) goto L47
            r10 = r2
            goto L48
        L47:
            r10 = r0
        L48:
            java.lang.String r0 = r20.readString()
            if (r0 != 0) goto L50
            r11 = r2
            goto L51
        L50:
            r11 = r0
        L51:
            java.lang.String r0 = r20.readString()
            if (r0 != 0) goto L59
            r12 = r2
            goto L5a
        L59:
            r12 = r0
        L5a:
            java.lang.String r0 = r20.readString()
            if (r0 != 0) goto L62
            r13 = r2
            goto L63
        L62:
            r13 = r0
        L63:
            java.lang.String r0 = r20.readString()
            if (r0 != 0) goto L6b
            r14 = r2
            goto L6c
        L6b:
            r14 = r0
        L6c:
            java.lang.String r0 = r20.readString()
            if (r0 != 0) goto L74
            r15 = r2
            goto L75
        L74:
            r15 = r0
        L75:
            java.lang.String r0 = r20.readString()
            if (r0 != 0) goto L7e
            r16 = r2
            goto L80
        L7e:
            r16 = r0
        L80:
            java.lang.String r0 = r20.readString()
            if (r0 != 0) goto L89
            r17 = r2
            goto L8b
        L89:
            r17 = r0
        L8b:
            java.lang.String r0 = r20.readString()
            if (r0 != 0) goto L94
            r18 = r2
            goto L96
        L94:
            r18 = r0
        L96:
            r3 = r19
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: th.p047co.dtac.android.dtacone.model.rtr_performance.CommissionHistoryCollection.<init>(android.os.Parcel):void");
    }
}