package th.p047co.dtac.android.dtacone.model.appOne.postpaid.true_company;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.app.NotificationCompat;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0007J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\bJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J2\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u0011J\u0013\u0010\u0012\u001a\u00020\u00052\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0004\u0010\bR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u0017"}, m28850d2 = {"Lth/co/dtac/android/dtacone/model/appOne/postpaid/true_company/ValidateExistingCustomerScoreData;", "", "jsonMember4DCustomerGrade", "", "isPass", "", NotificationCompat.CATEGORY_STATUS, "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;)V", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getJsonMember4DCustomerGrade", "()Ljava/lang/String;", "getStatus", "component1", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;)Lth/co/dtac/android/dtacone/model/appOne/postpaid/true_company/ValidateExistingCustomerScoreData;", "equals", "other", "hashCode", "", "toString", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.appOne.postpaid.true_company.ValidateExistingCustomerScoreData */
/* loaded from: classes8.dex */
public final class ValidateExistingCustomerScoreData {
    public static final int $stable = 0;
    @SerializedName("isPass")
    @Nullable
    private final Boolean isPass;
    @SerializedName("customerGrade")
    @Nullable
    private final String jsonMember4DCustomerGrade;
    @SerializedName(NotificationCompat.CATEGORY_STATUS)
    @Nullable
    private final String status;

    public ValidateExistingCustomerScoreData() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ ValidateExistingCustomerScoreData copy$default(ValidateExistingCustomerScoreData validateExistingCustomerScoreData, String str, Boolean bool, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = validateExistingCustomerScoreData.jsonMember4DCustomerGrade;
        }
        if ((i & 2) != 0) {
            bool = validateExistingCustomerScoreData.isPass;
        }
        if ((i & 4) != 0) {
            str2 = validateExistingCustomerScoreData.status;
        }
        return validateExistingCustomerScoreData.copy(str, bool, str2);
    }

    @Nullable
    public final String component1() {
        return this.jsonMember4DCustomerGrade;
    }

    @Nullable
    public final Boolean component2() {
        return this.isPass;
    }

    @Nullable
    public final String component3() {
        return this.status;
    }

    @NotNull
    public final ValidateExistingCustomerScoreData copy(@Nullable String str, @Nullable Boolean bool, @Nullable String str2) {
        return new ValidateExistingCustomerScoreData(str, bool, str2);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ValidateExistingCustomerScoreData) {
            ValidateExistingCustomerScoreData validateExistingCustomerScoreData = (ValidateExistingCustomerScoreData) obj;
            return Intrinsics.areEqual(this.jsonMember4DCustomerGrade, validateExistingCustomerScoreData.jsonMember4DCustomerGrade) && Intrinsics.areEqual(this.isPass, validateExistingCustomerScoreData.isPass) && Intrinsics.areEqual(this.status, validateExistingCustomerScoreData.status);
        }
        return false;
    }

    @Nullable
    public final String getJsonMember4DCustomerGrade() {
        return this.jsonMember4DCustomerGrade;
    }

    @Nullable
    public final String getStatus() {
        return this.status;
    }

    public int hashCode() {
        String str = this.jsonMember4DCustomerGrade;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Boolean bool = this.isPass;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        String str2 = this.status;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @Nullable
    public final Boolean isPass() {
        return this.isPass;
    }

    @NotNull
    public String toString() {
        String str = this.jsonMember4DCustomerGrade;
        Boolean bool = this.isPass;
        String str2 = this.status;
        return "ValidateExistingCustomerScoreData(jsonMember4DCustomerGrade=" + str + ", isPass=" + bool + ", status=" + str2 + ")";
    }

    public ValidateExistingCustomerScoreData(@Nullable String str, @Nullable Boolean bool, @Nullable String str2) {
        this.jsonMember4DCustomerGrade = str;
        this.isPass = bool;
        this.status = str2;
    }

    public /* synthetic */ ValidateExistingCustomerScoreData(String str, Boolean bool, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : bool, (i & 4) != 0 ? null : str2);
    }
}
