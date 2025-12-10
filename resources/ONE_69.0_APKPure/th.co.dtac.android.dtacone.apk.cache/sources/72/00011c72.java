package th.p047co.dtac.android.dtacone.model.appOne.tol.saveOrder;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J1\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0018"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/appOne/tol/saveOrder/SaveOrderContactInfo;", "", "firstName", "", "lastName", "mobileNumber", "language", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getFirstName", "()Ljava/lang/String;", "getLanguage", "getLastName", "getMobileNumber", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.appOne.tol.saveOrder.SaveOrderContactInfo */
/* loaded from: classes8.dex */
public final class SaveOrderContactInfo {
    public static final int $stable = 0;
    @SerializedName("firstName")
    @NotNull
    private final String firstName;
    @SerializedName("language")
    @NotNull
    private final String language;
    @SerializedName("lastName")
    @NotNull
    private final String lastName;
    @SerializedName("mobileNumber")
    @NotNull
    private final String mobileNumber;

    public SaveOrderContactInfo(@NotNull String firstName, @NotNull String lastName, @NotNull String mobileNumber, @NotNull String language) {
        Intrinsics.checkNotNullParameter(firstName, "firstName");
        Intrinsics.checkNotNullParameter(lastName, "lastName");
        Intrinsics.checkNotNullParameter(mobileNumber, "mobileNumber");
        Intrinsics.checkNotNullParameter(language, "language");
        this.firstName = firstName;
        this.lastName = lastName;
        this.mobileNumber = mobileNumber;
        this.language = language;
    }

    public static /* synthetic */ SaveOrderContactInfo copy$default(SaveOrderContactInfo saveOrderContactInfo, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = saveOrderContactInfo.firstName;
        }
        if ((i & 2) != 0) {
            str2 = saveOrderContactInfo.lastName;
        }
        if ((i & 4) != 0) {
            str3 = saveOrderContactInfo.mobileNumber;
        }
        if ((i & 8) != 0) {
            str4 = saveOrderContactInfo.language;
        }
        return saveOrderContactInfo.copy(str, str2, str3, str4);
    }

    @NotNull
    public final String component1() {
        return this.firstName;
    }

    @NotNull
    public final String component2() {
        return this.lastName;
    }

    @NotNull
    public final String component3() {
        return this.mobileNumber;
    }

    @NotNull
    public final String component4() {
        return this.language;
    }

    @NotNull
    public final SaveOrderContactInfo copy(@NotNull String firstName, @NotNull String lastName, @NotNull String mobileNumber, @NotNull String language) {
        Intrinsics.checkNotNullParameter(firstName, "firstName");
        Intrinsics.checkNotNullParameter(lastName, "lastName");
        Intrinsics.checkNotNullParameter(mobileNumber, "mobileNumber");
        Intrinsics.checkNotNullParameter(language, "language");
        return new SaveOrderContactInfo(firstName, lastName, mobileNumber, language);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SaveOrderContactInfo) {
            SaveOrderContactInfo saveOrderContactInfo = (SaveOrderContactInfo) obj;
            return Intrinsics.areEqual(this.firstName, saveOrderContactInfo.firstName) && Intrinsics.areEqual(this.lastName, saveOrderContactInfo.lastName) && Intrinsics.areEqual(this.mobileNumber, saveOrderContactInfo.mobileNumber) && Intrinsics.areEqual(this.language, saveOrderContactInfo.language);
        }
        return false;
    }

    @NotNull
    public final String getFirstName() {
        return this.firstName;
    }

    @NotNull
    public final String getLanguage() {
        return this.language;
    }

    @NotNull
    public final String getLastName() {
        return this.lastName;
    }

    @NotNull
    public final String getMobileNumber() {
        return this.mobileNumber;
    }

    public int hashCode() {
        return (((((this.firstName.hashCode() * 31) + this.lastName.hashCode()) * 31) + this.mobileNumber.hashCode()) * 31) + this.language.hashCode();
    }

    @NotNull
    public String toString() {
        String str = this.firstName;
        String str2 = this.lastName;
        String str3 = this.mobileNumber;
        String str4 = this.language;
        return "SaveOrderContactInfo(firstName=" + str + ", lastName=" + str2 + ", mobileNumber=" + str3 + ", language=" + str4 + ")";
    }
}