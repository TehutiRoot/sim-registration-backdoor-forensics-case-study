package co.omise.android.p009ui;

import androidx.annotation.DrawableRes;
import ch.qos.logback.core.CoreConstants;
import co.omise.android.C5511R;
import co.omise.android.p009ui.OmiseListItem;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.i18n.MessageBundle;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0080\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0003\u0010\u0007\u001a\u00020\u0003¢\u0006\u0002\u0010\bJ\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\nJ\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J8\u0010\u0015\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0003\u0010\u0007\u001a\u00020\u0003HÆ\u0001¢\u0006\u0002\u0010\u0016J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001c\u001a\u00020\u0005HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u0014\u0010\u0007\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001d"}, m28850d2 = {"Lco/omise/android/ui/InstallmentTermResource;", "Lco/omise/android/ui/OmiseListItem;", "iconRes", "", MessageBundle.TITLE_ENTRY, "", "installmentTerm", "indicatorIconRes", "(Ljava/lang/Integer;Ljava/lang/String;II)V", "getIconRes", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getIndicatorIconRes", "getInstallmentTerm", "()I", "getTitle", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/Integer;Ljava/lang/String;II)Lco/omise/android/ui/InstallmentTermResource;", "equals", "", "other", "", "hashCode", "toString", "sdk_productionRelease"}, m28849k = 1, m28848mv = {1, 7, 1}, m28846xi = 48)
/* renamed from: co.omise.android.ui.InstallmentTermResource */
/* loaded from: classes3.dex */
public final class InstallmentTermResource implements OmiseListItem {
    @Nullable
    private final Integer iconRes;
    private final int indicatorIconRes;
    private final int installmentTerm;
    @NotNull
    private final String title;

    public InstallmentTermResource(@DrawableRes @Nullable Integer num, @NotNull String title, int i, @DrawableRes int i2) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.iconRes = num;
        this.title = title;
        this.installmentTerm = i;
        this.indicatorIconRes = i2;
    }

    public static /* synthetic */ InstallmentTermResource copy$default(InstallmentTermResource installmentTermResource, Integer num, String str, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            num = installmentTermResource.getIconRes();
        }
        if ((i3 & 2) != 0) {
            str = installmentTermResource.getTitle();
        }
        if ((i3 & 4) != 0) {
            i = installmentTermResource.installmentTerm;
        }
        if ((i3 & 8) != 0) {
            i2 = installmentTermResource.getIndicatorIconRes().intValue();
        }
        return installmentTermResource.copy(num, str, i, i2);
    }

    @Nullable
    public final Integer component1() {
        return getIconRes();
    }

    @NotNull
    public final String component2() {
        return getTitle();
    }

    public final int component3() {
        return this.installmentTerm;
    }

    public final int component4() {
        return getIndicatorIconRes().intValue();
    }

    @NotNull
    public final InstallmentTermResource copy(@DrawableRes @Nullable Integer num, @NotNull String title, int i, @DrawableRes int i2) {
        Intrinsics.checkNotNullParameter(title, "title");
        return new InstallmentTermResource(num, title, i, i2);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof InstallmentTermResource) {
            InstallmentTermResource installmentTermResource = (InstallmentTermResource) obj;
            return Intrinsics.areEqual(getIconRes(), installmentTermResource.getIconRes()) && Intrinsics.areEqual(getTitle(), installmentTermResource.getTitle()) && this.installmentTerm == installmentTermResource.installmentTerm && getIndicatorIconRes().intValue() == installmentTermResource.getIndicatorIconRes().intValue();
        }
        return false;
    }

    @Override // co.omise.android.p009ui.OmiseListItem
    @Nullable
    public Boolean getEnabled() {
        return OmiseListItem.DefaultImpls.getEnabled(this);
    }

    @Override // co.omise.android.p009ui.OmiseListItem
    @Nullable
    public Integer getIconRes() {
        return this.iconRes;
    }

    @Override // co.omise.android.p009ui.OmiseListItem
    @NotNull
    public Integer getIndicatorIconRes() {
        return Integer.valueOf(this.indicatorIconRes);
    }

    public final int getInstallmentTerm() {
        return this.installmentTerm;
    }

    @Override // co.omise.android.p009ui.OmiseListItem
    @Nullable
    public String getSubtitle() {
        return OmiseListItem.DefaultImpls.getSubtitle(this);
    }

    @Override // co.omise.android.p009ui.OmiseListItem
    @Nullable
    public Integer getSubtitleRes() {
        return OmiseListItem.DefaultImpls.getSubtitleRes(this);
    }

    @Override // co.omise.android.p009ui.OmiseListItem
    @NotNull
    public String getTitle() {
        return this.title;
    }

    @Override // co.omise.android.p009ui.OmiseListItem
    @Nullable
    public Integer getTitleRes() {
        return OmiseListItem.DefaultImpls.getTitleRes(this);
    }

    public int hashCode() {
        return ((((((getIconRes() == null ? 0 : getIconRes().hashCode()) * 31) + getTitle().hashCode()) * 31) + this.installmentTerm) * 31) + getIndicatorIconRes().hashCode();
    }

    @NotNull
    public String toString() {
        return "InstallmentTermResource(iconRes=" + getIconRes() + ", title=" + getTitle() + ", installmentTerm=" + this.installmentTerm + ", indicatorIconRes=" + getIndicatorIconRes().intValue() + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public /* synthetic */ InstallmentTermResource(Integer num, String str, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? null : num, str, i, (i3 & 8) != 0 ? C5511R.C5513drawable.ic_redirect : i2);
    }
}
