package th.p047co.dtac.android.dtacone.view.activity.upPass.model;

import androidx.compose.runtime.internal.StabilityInferred;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.R;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\bJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\b\"\u0004\b\u0017\u0010\u0018R\"\u0010\u0004\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u0015\u001a\u0004\b\u001a\u0010\b\"\u0004\b\u001b\u0010\u0018¨\u0006\u001c"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/activity/upPass/model/ThemeColorModel;", "", "", "topBarBackground", "topBarTextColor", "<init>", "(II)V", "component1", "()I", "component2", "copy", "(II)Lth/co/dtac/android/dtacone/view/activity/upPass/model/ThemeColorModel;", "", "toString", "()Ljava/lang/String;", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", PDPageLabelRange.STYLE_LETTERS_LOWER, "I", "getTopBarBackground", "setTopBarBackground", "(I)V", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "getTopBarTextColor", "setTopBarTextColor", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.view.activity.upPass.model.ThemeColorModel */
/* loaded from: classes10.dex */
public final class ThemeColorModel {
    public static final int $stable = 8;

    /* renamed from: a */
    public int f88067a;

    /* renamed from: b */
    public int f88068b;

    public ThemeColorModel() {
        this(0, 0, 3, null);
    }

    public static /* synthetic */ ThemeColorModel copy$default(ThemeColorModel themeColorModel, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = themeColorModel.f88067a;
        }
        if ((i3 & 2) != 0) {
            i2 = themeColorModel.f88068b;
        }
        return themeColorModel.copy(i, i2);
    }

    public final int component1() {
        return this.f88067a;
    }

    public final int component2() {
        return this.f88068b;
    }

    @NotNull
    public final ThemeColorModel copy(int i, int i2) {
        return new ThemeColorModel(i, i2);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ThemeColorModel) {
            ThemeColorModel themeColorModel = (ThemeColorModel) obj;
            return this.f88067a == themeColorModel.f88067a && this.f88068b == themeColorModel.f88068b;
        }
        return false;
    }

    public final int getTopBarBackground() {
        return this.f88067a;
    }

    public final int getTopBarTextColor() {
        return this.f88068b;
    }

    public int hashCode() {
        return (this.f88067a * 31) + this.f88068b;
    }

    public final void setTopBarBackground(int i) {
        this.f88067a = i;
    }

    public final void setTopBarTextColor(int i) {
        this.f88068b = i;
    }

    @NotNull
    public String toString() {
        int i = this.f88067a;
        int i2 = this.f88068b;
        return "ThemeColorModel(topBarBackground=" + i + ", topBarTextColor=" + i2 + ")";
    }

    public ThemeColorModel(int i, int i2) {
        this.f88067a = i;
        this.f88068b = i2;
    }

    public /* synthetic */ ThemeColorModel(int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? R.color.colorAccent : i, (i3 & 2) != 0 ? R.color.white : i2);
    }
}