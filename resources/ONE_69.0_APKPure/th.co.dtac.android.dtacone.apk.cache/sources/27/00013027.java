package th.p047co.dtac.android.dtacone.view.appOne.eSign.response;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007¨\u0006\u0017"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/eSign/response/ContactMedium;", "", "Lth/co/dtac/android/dtacone/view/appOne/eSign/response/Medium;", "medium", "<init>", "(Lth/co/dtac/android/dtacone/view/appOne/eSign/response/Medium;)V", "component1", "()Lth/co/dtac/android/dtacone/view/appOne/eSign/response/Medium;", "copy", "(Lth/co/dtac/android/dtacone/view/appOne/eSign/response/Medium;)Lth/co/dtac/android/dtacone/view/appOne/eSign/response/ContactMedium;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", PDPageLabelRange.STYLE_LETTERS_LOWER, "Lth/co/dtac/android/dtacone/view/appOne/eSign/response/Medium;", "getMedium", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.view.appOne.eSign.response.ContactMedium */
/* loaded from: classes10.dex */
public final class ContactMedium {
    public static final int $stable = 0;
    @SerializedName("medium")
    @NotNull

    /* renamed from: a */
    private final Medium f90818a;

    public ContactMedium() {
        this(null, 1, null);
    }

    public static /* synthetic */ ContactMedium copy$default(ContactMedium contactMedium, Medium medium, int i, Object obj) {
        if ((i & 1) != 0) {
            medium = contactMedium.f90818a;
        }
        return contactMedium.copy(medium);
    }

    @NotNull
    public final Medium component1() {
        return this.f90818a;
    }

    @NotNull
    public final ContactMedium copy(@NotNull Medium medium) {
        Intrinsics.checkNotNullParameter(medium, "medium");
        return new ContactMedium(medium);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ContactMedium) && Intrinsics.areEqual(this.f90818a, ((ContactMedium) obj).f90818a);
    }

    @NotNull
    public final Medium getMedium() {
        return this.f90818a;
    }

    public int hashCode() {
        return this.f90818a.hashCode();
    }

    @NotNull
    public String toString() {
        Medium medium = this.f90818a;
        return "ContactMedium(medium=" + medium + ")";
    }

    public ContactMedium(@NotNull Medium medium) {
        Intrinsics.checkNotNullParameter(medium, "medium");
        this.f90818a = medium;
    }

    public /* synthetic */ ContactMedium(Medium medium, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new Medium(null, null, null, null, null, null, null, 127, null) : medium);
    }
}