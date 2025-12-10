package th.p047co.dtac.android.dtacone.view.compose.upPassDemo.model;

import androidx.compose.runtime.internal.StabilityInferred;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ&\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\bJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\bR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0015\u001a\u0004\b\u0018\u0010\b¨\u0006\u0019"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/compose/upPassDemo/model/LabelValue;", "", "", "label", "value", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lth/co/dtac/android/dtacone/view/compose/upPassDemo/model/LabelValue;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/lang/String;", "getLabel", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "getValue", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.view.compose.upPassDemo.model.LabelValue */
/* loaded from: classes10.dex */
public final class LabelValue {
    public static final int $stable = 0;

    /* renamed from: a */
    public final String f98638a;

    /* renamed from: b */
    public final String f98639b;

    public LabelValue(@NotNull String label, @Nullable String str) {
        Intrinsics.checkNotNullParameter(label, "label");
        this.f98638a = label;
        this.f98639b = str;
    }

    public static /* synthetic */ LabelValue copy$default(LabelValue labelValue, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = labelValue.f98638a;
        }
        if ((i & 2) != 0) {
            str2 = labelValue.f98639b;
        }
        return labelValue.copy(str, str2);
    }

    @NotNull
    public final String component1() {
        return this.f98638a;
    }

    @Nullable
    public final String component2() {
        return this.f98639b;
    }

    @NotNull
    public final LabelValue copy(@NotNull String label, @Nullable String str) {
        Intrinsics.checkNotNullParameter(label, "label");
        return new LabelValue(label, str);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LabelValue) {
            LabelValue labelValue = (LabelValue) obj;
            return Intrinsics.areEqual(this.f98638a, labelValue.f98638a) && Intrinsics.areEqual(this.f98639b, labelValue.f98639b);
        }
        return false;
    }

    @NotNull
    public final String getLabel() {
        return this.f98638a;
    }

    @Nullable
    public final String getValue() {
        return this.f98639b;
    }

    public int hashCode() {
        int hashCode = this.f98638a.hashCode() * 31;
        String str = this.f98639b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public String toString() {
        String str = this.f98638a;
        String str2 = this.f98639b;
        return "LabelValue(label=" + str + ", value=" + str2 + ")";
    }

    public /* synthetic */ LabelValue(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2);
    }
}