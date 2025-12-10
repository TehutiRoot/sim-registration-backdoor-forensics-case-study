package th.p047co.dtac.android.dtacone.app_one.util.theme.compose;

import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\"\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00008\u0006¢\u0006\f\n\u0004\b\u0002\u0010\u0003\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, m28850d2 = {"Landroidx/compose/runtime/ProvidableCompositionLocal;", "Lth/co/dtac/android/dtacone/app_one/util/theme/compose/CompanyThemes;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroidx/compose/runtime/ProvidableCompositionLocal;", "getLocalAppTheme", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "LocalAppTheme", "app_prodRelease"}, m28849k = 2, m28848mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.app_one.util.theme.compose.LocalAppThemeKt */
/* loaded from: classes7.dex */
public final class LocalAppThemeKt {

    /* renamed from: a */
    public static final ProvidableCompositionLocal f82569a = CompositionLocalKt.compositionLocalOf$default(null, LocalAppThemeKt$LocalAppTheme$1.INSTANCE, 1, null);

    @NotNull
    public static final ProvidableCompositionLocal<CompanyThemes> getLocalAppTheme() {
        return f82569a;
    }
}
