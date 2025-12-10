package th.p047co.dtac.android.dtacone.view.appOne.tol.model.campaign;

import androidx.compose.runtime.internal.StabilityInferred;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.i18n.MessageBundle;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\bJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0015\u001a\u0004\b\u0018\u0010\b¨\u0006\u0019"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/tol/model/campaign/EntryFeeDiscount;", "", "", "code", MessageBundle.TITLE_ENTRY, "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lth/co/dtac/android/dtacone/view/appOne/tol/model/campaign/EntryFeeDiscount;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/lang/String;", "getCode", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "getTitle", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.model.campaign.EntryFeeDiscount */
/* loaded from: classes10.dex */
public final class EntryFeeDiscount {
    public static final int $stable = 0;

    /* renamed from: a */
    public final String f97955a;

    /* renamed from: b */
    public final String f97956b;

    public EntryFeeDiscount(@NotNull String code, @NotNull String title) {
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(title, "title");
        this.f97955a = code;
        this.f97956b = title;
    }

    public static /* synthetic */ EntryFeeDiscount copy$default(EntryFeeDiscount entryFeeDiscount, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = entryFeeDiscount.f97955a;
        }
        if ((i & 2) != 0) {
            str2 = entryFeeDiscount.f97956b;
        }
        return entryFeeDiscount.copy(str, str2);
    }

    @NotNull
    public final String component1() {
        return this.f97955a;
    }

    @NotNull
    public final String component2() {
        return this.f97956b;
    }

    @NotNull
    public final EntryFeeDiscount copy(@NotNull String code, @NotNull String title) {
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(title, "title");
        return new EntryFeeDiscount(code, title);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof EntryFeeDiscount) {
            EntryFeeDiscount entryFeeDiscount = (EntryFeeDiscount) obj;
            return Intrinsics.areEqual(this.f97955a, entryFeeDiscount.f97955a) && Intrinsics.areEqual(this.f97956b, entryFeeDiscount.f97956b);
        }
        return false;
    }

    @NotNull
    public final String getCode() {
        return this.f97955a;
    }

    @NotNull
    public final String getTitle() {
        return this.f97956b;
    }

    public int hashCode() {
        return (this.f97955a.hashCode() * 31) + this.f97956b.hashCode();
    }

    @NotNull
    public String toString() {
        String str = this.f97955a;
        String str2 = this.f97956b;
        return "EntryFeeDiscount(code=" + str + ", title=" + str2 + ")";
    }
}