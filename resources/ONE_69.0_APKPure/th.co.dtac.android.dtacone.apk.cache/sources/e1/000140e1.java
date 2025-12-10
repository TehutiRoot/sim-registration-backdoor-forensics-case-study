package th.p047co.dtac.android.dtacone.view.appOne.tol.model.fixedLinePlus;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.app.NotificationCompat;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ*\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\tJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u000b¨\u0006\u001c"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/tol/model/fixedLinePlus/PhoneNumberData;", "", "", NotificationCompat.CATEGORY_STATUS, "", "phoneNumberList", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Ljava/util/List;)Lth/co/dtac/android/dtacone/view/appOne/tol/model/fixedLinePlus/PhoneNumberData;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/lang/String;", "getStatus", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Ljava/util/List;", "getPhoneNumberList", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.model.fixedLinePlus.PhoneNumberData */
/* loaded from: classes10.dex */
public final class PhoneNumberData {
    public static final int $stable = 8;

    /* renamed from: a */
    public final String f98032a;

    /* renamed from: b */
    public final List f98033b;

    public PhoneNumberData(@NotNull String status, @NotNull List<String> phoneNumberList) {
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(phoneNumberList, "phoneNumberList");
        this.f98032a = status;
        this.f98033b = phoneNumberList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PhoneNumberData copy$default(PhoneNumberData phoneNumberData, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = phoneNumberData.f98032a;
        }
        if ((i & 2) != 0) {
            list = phoneNumberData.f98033b;
        }
        return phoneNumberData.copy(str, list);
    }

    @NotNull
    public final String component1() {
        return this.f98032a;
    }

    @NotNull
    public final List<String> component2() {
        return this.f98033b;
    }

    @NotNull
    public final PhoneNumberData copy(@NotNull String status, @NotNull List<String> phoneNumberList) {
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(phoneNumberList, "phoneNumberList");
        return new PhoneNumberData(status, phoneNumberList);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PhoneNumberData) {
            PhoneNumberData phoneNumberData = (PhoneNumberData) obj;
            return Intrinsics.areEqual(this.f98032a, phoneNumberData.f98032a) && Intrinsics.areEqual(this.f98033b, phoneNumberData.f98033b);
        }
        return false;
    }

    @NotNull
    public final List<String> getPhoneNumberList() {
        return this.f98033b;
    }

    @NotNull
    public final String getStatus() {
        return this.f98032a;
    }

    public int hashCode() {
        return (this.f98032a.hashCode() * 31) + this.f98033b.hashCode();
    }

    @NotNull
    public String toString() {
        String str = this.f98032a;
        List list = this.f98033b;
        return "PhoneNumberData(status=" + str + ", phoneNumberList=" + list + ")";
    }
}