package th.p047co.dtac.android.dtacone.model.esim;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R \u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0007¨\u0006\u0014"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/esim/TelephoneNumberListItem;", "", "telephoneNumber", "", "displayTelephoneNumber", "(Ljava/lang/String;Ljava/lang/String;)V", "getDisplayTelephoneNumber", "()Ljava/lang/String;", "setDisplayTelephoneNumber", "(Ljava/lang/String;)V", "getTelephoneNumber", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.esim.TelephoneNumberListItem */
/* loaded from: classes8.dex */
public final class TelephoneNumberListItem {
    public static final int $stable = 8;
    @SerializedName("displayTelephoneNumber")
    @Nullable
    private String displayTelephoneNumber;
    @SerializedName("telephoneNumber")
    @Nullable
    private final String telephoneNumber;

    public TelephoneNumberListItem() {
        this(null, null, 3, null);
    }

    public static /* synthetic */ TelephoneNumberListItem copy$default(TelephoneNumberListItem telephoneNumberListItem, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = telephoneNumberListItem.telephoneNumber;
        }
        if ((i & 2) != 0) {
            str2 = telephoneNumberListItem.displayTelephoneNumber;
        }
        return telephoneNumberListItem.copy(str, str2);
    }

    @Nullable
    public final String component1() {
        return this.telephoneNumber;
    }

    @Nullable
    public final String component2() {
        return this.displayTelephoneNumber;
    }

    @NotNull
    public final TelephoneNumberListItem copy(@Nullable String str, @Nullable String str2) {
        return new TelephoneNumberListItem(str, str2);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof TelephoneNumberListItem) {
            TelephoneNumberListItem telephoneNumberListItem = (TelephoneNumberListItem) obj;
            return Intrinsics.areEqual(this.telephoneNumber, telephoneNumberListItem.telephoneNumber) && Intrinsics.areEqual(this.displayTelephoneNumber, telephoneNumberListItem.displayTelephoneNumber);
        }
        return false;
    }

    @Nullable
    public final String getDisplayTelephoneNumber() {
        return this.displayTelephoneNumber;
    }

    @Nullable
    public final String getTelephoneNumber() {
        return this.telephoneNumber;
    }

    public int hashCode() {
        String str = this.telephoneNumber;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.displayTelephoneNumber;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final void setDisplayTelephoneNumber(@Nullable String str) {
        this.displayTelephoneNumber = str;
    }

    @NotNull
    public String toString() {
        String str = this.telephoneNumber;
        String str2 = this.displayTelephoneNumber;
        return "TelephoneNumberListItem(telephoneNumber=" + str + ", displayTelephoneNumber=" + str2 + ")";
    }

    public TelephoneNumberListItem(@Nullable String str, @Nullable String str2) {
        this.telephoneNumber = str;
        this.displayTelephoneNumber = str2;
    }

    public /* synthetic */ TelephoneNumberListItem(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
    }
}