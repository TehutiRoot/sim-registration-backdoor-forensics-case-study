package co.omise.android.p009ui;

import kotlin.Metadata;
import org.bouncycastle.i18n.MessageBundle;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\t\bf\u0018\u00002\u00020\u0001R\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0016\u0010\n\u001a\u0004\u0018\u00010\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\tR\u0016\u0010\f\u001a\u0004\u0018\u00010\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0010\u001a\u0004\u0018\u00010\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\tR\u0016\u0010\u0012\u001a\u0004\u0018\u00010\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u000fR\u0016\u0010\u0014\u001a\u0004\u0018\u00010\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\t¨\u0006\u0016"}, m28850d2 = {"Lco/omise/android/ui/OmiseListItem;", "", "enabled", "", "getEnabled", "()Ljava/lang/Boolean;", "iconRes", "", "getIconRes", "()Ljava/lang/Integer;", "indicatorIconRes", "getIndicatorIconRes", "subtitle", "", "getSubtitle", "()Ljava/lang/String;", "subtitleRes", "getSubtitleRes", MessageBundle.TITLE_ENTRY, "getTitle", "titleRes", "getTitleRes", "sdk_productionRelease"}, m28849k = 1, m28848mv = {1, 7, 1}, m28846xi = 48)
/* renamed from: co.omise.android.ui.OmiseListItem */
/* loaded from: classes3.dex */
public interface OmiseListItem {

    @Metadata(m28849k = 3, m28848mv = {1, 7, 1}, m28846xi = 48)
    /* renamed from: co.omise.android.ui.OmiseListItem$DefaultImpls */
    /* loaded from: classes3.dex */
    public static final class DefaultImpls {
        @Nullable
        public static Boolean getEnabled(@NotNull OmiseListItem omiseListItem) {
            return Boolean.TRUE;
        }

        @Nullable
        public static Integer getIconRes(@NotNull OmiseListItem omiseListItem) {
            return null;
        }

        @Nullable
        public static Integer getIndicatorIconRes(@NotNull OmiseListItem omiseListItem) {
            return null;
        }

        @Nullable
        public static String getSubtitle(@NotNull OmiseListItem omiseListItem) {
            return null;
        }

        @Nullable
        public static Integer getSubtitleRes(@NotNull OmiseListItem omiseListItem) {
            return null;
        }

        @Nullable
        public static String getTitle(@NotNull OmiseListItem omiseListItem) {
            return null;
        }

        @Nullable
        public static Integer getTitleRes(@NotNull OmiseListItem omiseListItem) {
            return null;
        }
    }

    @Nullable
    Boolean getEnabled();

    @Nullable
    Integer getIconRes();

    @Nullable
    Integer getIndicatorIconRes();

    @Nullable
    String getSubtitle();

    @Nullable
    Integer getSubtitleRes();

    @Nullable
    String getTitle();

    @Nullable
    Integer getTitleRes();
}
