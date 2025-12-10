package androidx.compose.p003ui.text;

import androidx.compose.p003ui.text.intl.PlatformLocale;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(m29143d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0018\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0018\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\nÀ\u0006\u0001"}, m29142d2 = {"Landroidx/compose/ui/text/PlatformStringDelegate;", "", "capitalize", "", TypedValues.Custom.S_STRING, "locale", "Landroidx/compose/ui/text/intl/PlatformLocale;", "decapitalize", "toLowerCase", "toUpperCase", "ui-text_release"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: androidx.compose.ui.text.PlatformStringDelegate */
/* loaded from: classes2.dex */
public interface PlatformStringDelegate {
    @NotNull
    String capitalize(@NotNull String str, @NotNull PlatformLocale platformLocale);

    @NotNull
    String decapitalize(@NotNull String str, @NotNull PlatformLocale platformLocale);

    @NotNull
    String toLowerCase(@NotNull String str, @NotNull PlatformLocale platformLocale);

    @NotNull
    String toUpperCase(@NotNull String str, @NotNull PlatformLocale platformLocale);
}