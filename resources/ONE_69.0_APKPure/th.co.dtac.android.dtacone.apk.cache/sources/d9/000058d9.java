package androidx.compose.material3;

import android.content.Context;
import androidx.annotation.RequiresApi;
import ch.qos.logback.core.CoreConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(m29143d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0007\u001a\u0010\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0007\u001a\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u0003H\u0001¨\u0006\u0007"}, m29142d2 = {"dynamicDarkColorScheme", "Landroidx/compose/material3/ColorScheme;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Context;", "dynamicLightColorScheme", "dynamicTonalPalette", "Landroidx/compose/material3/TonalPalette;", "material3_release"}, m29141k = 2, m29140mv = {1, 8, 0}, m29138xi = 48)
/* loaded from: classes2.dex */
public final class DynamicTonalPaletteKt {
    @RequiresApi(31)
    @NotNull
    public static final ColorScheme dynamicDarkColorScheme(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        TonalPalette dynamicTonalPalette = dynamicTonalPalette(context);
        return ColorSchemeKt.m70482darkColorSchemeG1PFcw$default(dynamicTonalPalette.m70958getPrimary800d7_KjU(), dynamicTonalPalette.m70952getPrimary200d7_KjU(), dynamicTonalPalette.m70953getPrimary300d7_KjU(), dynamicTonalPalette.m70959getPrimary900d7_KjU(), dynamicTonalPalette.m70954getPrimary400d7_KjU(), dynamicTonalPalette.m70971getSecondary800d7_KjU(), dynamicTonalPalette.m70965getSecondary200d7_KjU(), dynamicTonalPalette.m70966getSecondary300d7_KjU(), dynamicTonalPalette.m70972getSecondary900d7_KjU(), dynamicTonalPalette.m70984getTertiary800d7_KjU(), dynamicTonalPalette.m70978getTertiary200d7_KjU(), dynamicTonalPalette.m70979getTertiary300d7_KjU(), dynamicTonalPalette.m70985getTertiary900d7_KjU(), dynamicTonalPalette.m70924getNeutral100d7_KjU(), dynamicTonalPalette.m70933getNeutral900d7_KjU(), dynamicTonalPalette.m70924getNeutral100d7_KjU(), dynamicTonalPalette.m70933getNeutral900d7_KjU(), dynamicTonalPalette.m70940getNeutralVariant300d7_KjU(), dynamicTonalPalette.m70945getNeutralVariant800d7_KjU(), 0L, dynamicTonalPalette.m70933getNeutral900d7_KjU(), dynamicTonalPalette.m70926getNeutral200d7_KjU(), 0L, 0L, 0L, 0L, dynamicTonalPalette.m70943getNeutralVariant600d7_KjU(), 0L, 0L, 466092032, null);
    }

    @RequiresApi(31)
    @NotNull
    public static final ColorScheme dynamicLightColorScheme(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        TonalPalette dynamicTonalPalette = dynamicTonalPalette(context);
        return ColorSchemeKt.m70484lightColorSchemeG1PFcw$default(dynamicTonalPalette.m70954getPrimary400d7_KjU(), dynamicTonalPalette.m70951getPrimary1000d7_KjU(), dynamicTonalPalette.m70959getPrimary900d7_KjU(), dynamicTonalPalette.m70950getPrimary100d7_KjU(), dynamicTonalPalette.m70958getPrimary800d7_KjU(), dynamicTonalPalette.m70967getSecondary400d7_KjU(), dynamicTonalPalette.m70964getSecondary1000d7_KjU(), dynamicTonalPalette.m70972getSecondary900d7_KjU(), dynamicTonalPalette.m70963getSecondary100d7_KjU(), dynamicTonalPalette.m70980getTertiary400d7_KjU(), dynamicTonalPalette.m70977getTertiary1000d7_KjU(), dynamicTonalPalette.m70985getTertiary900d7_KjU(), dynamicTonalPalette.m70976getTertiary100d7_KjU(), dynamicTonalPalette.m70935getNeutral990d7_KjU(), dynamicTonalPalette.m70924getNeutral100d7_KjU(), dynamicTonalPalette.m70935getNeutral990d7_KjU(), dynamicTonalPalette.m70924getNeutral100d7_KjU(), dynamicTonalPalette.m70946getNeutralVariant900d7_KjU(), dynamicTonalPalette.m70940getNeutralVariant300d7_KjU(), 0L, dynamicTonalPalette.m70926getNeutral200d7_KjU(), dynamicTonalPalette.m70934getNeutral950d7_KjU(), 0L, 0L, 0L, 0L, dynamicTonalPalette.m70942getNeutralVariant500d7_KjU(), 0L, 0L, 466092032, null);
    }

    @RequiresApi(31)
    @NotNull
    public static final TonalPalette dynamicTonalPalette(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        C0480Gs c0480Gs = C0480Gs.f2217a;
        return new TonalPalette(c0480Gs.m68198a(context, 17170461), c0480Gs.m68198a(context, 17170462), c0480Gs.m68198a(context, 17170463), c0480Gs.m68198a(context, 17170464), c0480Gs.m68198a(context, 17170465), c0480Gs.m68198a(context, 17170466), c0480Gs.m68198a(context, 17170467), c0480Gs.m68198a(context, 17170468), c0480Gs.m68198a(context, 17170469), c0480Gs.m68198a(context, 17170470), c0480Gs.m68198a(context, 17170471), c0480Gs.m68198a(context, 17170472), c0480Gs.m68198a(context, 17170473), c0480Gs.m68198a(context, 17170474), c0480Gs.m68198a(context, 17170475), c0480Gs.m68198a(context, 17170476), c0480Gs.m68198a(context, 17170477), c0480Gs.m68198a(context, 17170478), c0480Gs.m68198a(context, 17170479), c0480Gs.m68198a(context, 17170480), c0480Gs.m68198a(context, 17170481), c0480Gs.m68198a(context, 17170482), c0480Gs.m68198a(context, 17170483), c0480Gs.m68198a(context, 17170484), c0480Gs.m68198a(context, 17170485), c0480Gs.m68198a(context, 17170486), c0480Gs.m68198a(context, 17170487), c0480Gs.m68198a(context, 17170488), c0480Gs.m68198a(context, 17170489), c0480Gs.m68198a(context, 17170490), c0480Gs.m68198a(context, 17170491), c0480Gs.m68198a(context, 17170492), c0480Gs.m68198a(context, 17170493), c0480Gs.m68198a(context, 17170494), c0480Gs.m68198a(context, 17170495), c0480Gs.m68198a(context, 17170496), c0480Gs.m68198a(context, 17170497), c0480Gs.m68198a(context, 17170498), c0480Gs.m68198a(context, 17170499), c0480Gs.m68198a(context, 17170500), c0480Gs.m68198a(context, 17170501), c0480Gs.m68198a(context, 17170502), c0480Gs.m68198a(context, 17170503), c0480Gs.m68198a(context, 17170504), c0480Gs.m68198a(context, 17170505), c0480Gs.m68198a(context, 17170506), c0480Gs.m68198a(context, 17170507), c0480Gs.m68198a(context, 17170508), c0480Gs.m68198a(context, 17170509), c0480Gs.m68198a(context, 17170510), c0480Gs.m68198a(context, 17170511), c0480Gs.m68198a(context, 17170512), c0480Gs.m68198a(context, 17170513), c0480Gs.m68198a(context, 17170514), c0480Gs.m68198a(context, 17170515), c0480Gs.m68198a(context, 17170516), c0480Gs.m68198a(context, 17170517), c0480Gs.m68198a(context, 17170518), c0480Gs.m68198a(context, 17170519), c0480Gs.m68198a(context, 17170520), c0480Gs.m68198a(context, 17170521), c0480Gs.m68198a(context, 17170522), c0480Gs.m68198a(context, 17170523), c0480Gs.m68198a(context, 17170524), c0480Gs.m68198a(context, 17170525), null);
    }
}