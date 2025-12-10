package th.p047co.dtac.android.dtacone.model.appOne.prepaid;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, m28850d2 = {"Lth/co/dtac/android/dtacone/model/appOne/prepaid/ContactMedium;", "", "medium", "Lth/co/dtac/android/dtacone/model/appOne/prepaid/Medium;", "(Lth/co/dtac/android/dtacone/model/appOne/prepaid/Medium;)V", "getMedium", "()Lth/co/dtac/android/dtacone/model/appOne/prepaid/Medium;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.appOne.prepaid.ContactMedium */
/* loaded from: classes8.dex */
public final class ContactMedium {
    public static final int $stable = 0;
    @SerializedName("medium")
    @Nullable
    private final Medium medium;

    public ContactMedium() {
        this(null, 1, null);
    }

    public static /* synthetic */ ContactMedium copy$default(ContactMedium contactMedium, Medium medium, int i, Object obj) {
        if ((i & 1) != 0) {
            medium = contactMedium.medium;
        }
        return contactMedium.copy(medium);
    }

    @Nullable
    public final Medium component1() {
        return this.medium;
    }

    @NotNull
    public final ContactMedium copy(@Nullable Medium medium) {
        return new ContactMedium(medium);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ContactMedium) && Intrinsics.areEqual(this.medium, ((ContactMedium) obj).medium);
    }

    @Nullable
    public final Medium getMedium() {
        return this.medium;
    }

    public int hashCode() {
        Medium medium = this.medium;
        if (medium == null) {
            return 0;
        }
        return medium.hashCode();
    }

    @NotNull
    public String toString() {
        Medium medium = this.medium;
        return "ContactMedium(medium=" + medium + ")";
    }

    public ContactMedium(@Nullable Medium medium) {
        this.medium = medium;
    }

    public /* synthetic */ ContactMedium(Medium medium, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : medium);
    }
}
