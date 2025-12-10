package th.p047co.dtac.android.dtacone.view.appOne.notification.model;

import androidx.compose.runtime.internal.StabilityInferred;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.R;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u0007J\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007\"\u0004\b\u0015\u0010\u0005¨\u0006\u0016"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/notification/model/ThemeColorModelNews;", "", "", "topBarBackground", "<init>", "(I)V", "component1", "()I", "copy", "(I)Lth/co/dtac/android/dtacone/view/appOne/notification/model/ThemeColorModelNews;", "", "toString", "()Ljava/lang/String;", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", PDPageLabelRange.STYLE_LETTERS_LOWER, "I", "getTopBarBackground", "setTopBarBackground", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.view.appOne.notification.model.ThemeColorModelNews */
/* loaded from: classes10.dex */
public final class ThemeColorModelNews {
    public static final int $stable = 8;

    /* renamed from: a */
    public int f92466a;

    public ThemeColorModelNews() {
        this(0, 1, null);
    }

    public static /* synthetic */ ThemeColorModelNews copy$default(ThemeColorModelNews themeColorModelNews, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = themeColorModelNews.f92466a;
        }
        return themeColorModelNews.copy(i);
    }

    public final int component1() {
        return this.f92466a;
    }

    @NotNull
    public final ThemeColorModelNews copy(int i) {
        return new ThemeColorModelNews(i);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ThemeColorModelNews) && this.f92466a == ((ThemeColorModelNews) obj).f92466a;
    }

    public final int getTopBarBackground() {
        return this.f92466a;
    }

    public int hashCode() {
        return this.f92466a;
    }

    public final void setTopBarBackground(int i) {
        this.f92466a = i;
    }

    @NotNull
    public String toString() {
        int i = this.f92466a;
        return "ThemeColorModelNews(topBarBackground=" + i + ")";
    }

    public ThemeColorModelNews(int i) {
        this.f92466a = i;
    }

    public /* synthetic */ ThemeColorModelNews(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? R.color.colorAccent : i);
    }
}