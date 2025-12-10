package th.p047co.dtac.android.dtacone.view.appOne.tol.model.campaign;

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
@Metadata(m29143d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ*\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\nJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\nR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\f¨\u0006\u001d"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/tol/model/campaign/Data;", "", "", NotificationCompat.CATEGORY_STATUS, "", "Lth/co/dtac/android/dtacone/view/appOne/tol/model/campaign/EntryFeeDiscount;", "entryFeeDiscount", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Ljava/util/List;)Lth/co/dtac/android/dtacone/view/appOne/tol/model/campaign/Data;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/lang/String;", "getStatus", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Ljava/util/List;", "getEntryFeeDiscount", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.model.campaign.Data */
/* loaded from: classes10.dex */
public final class Data {
    public static final int $stable = 8;

    /* renamed from: a */
    public final String f97949a;

    /* renamed from: b */
    public final List f97950b;

    public Data(@NotNull String status, @NotNull List<EntryFeeDiscount> entryFeeDiscount) {
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(entryFeeDiscount, "entryFeeDiscount");
        this.f97949a = status;
        this.f97950b = entryFeeDiscount;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Data copy$default(Data data, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = data.f97949a;
        }
        if ((i & 2) != 0) {
            list = data.f97950b;
        }
        return data.copy(str, list);
    }

    @NotNull
    public final String component1() {
        return this.f97949a;
    }

    @NotNull
    public final List<EntryFeeDiscount> component2() {
        return this.f97950b;
    }

    @NotNull
    public final Data copy(@NotNull String status, @NotNull List<EntryFeeDiscount> entryFeeDiscount) {
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(entryFeeDiscount, "entryFeeDiscount");
        return new Data(status, entryFeeDiscount);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Data) {
            Data data = (Data) obj;
            return Intrinsics.areEqual(this.f97949a, data.f97949a) && Intrinsics.areEqual(this.f97950b, data.f97950b);
        }
        return false;
    }

    @NotNull
    public final List<EntryFeeDiscount> getEntryFeeDiscount() {
        return this.f97950b;
    }

    @NotNull
    public final String getStatus() {
        return this.f97949a;
    }

    public int hashCode() {
        return (this.f97949a.hashCode() * 31) + this.f97950b.hashCode();
    }

    @NotNull
    public String toString() {
        String str = this.f97949a;
        List list = this.f97950b;
        return "Data(status=" + str + ", entryFeeDiscount=" + list + ")";
    }
}