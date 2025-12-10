package androidx.compose.material3;

import android.content.Context;
import androidx.annotation.RequiresApi;
import ch.qos.logback.core.CoreConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0007\u001a\u0010\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0007\u001a\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u0003H\u0001¨\u0006\u0007"}, m28850d2 = {"dynamicDarkColorScheme", "Landroidx/compose/material3/ColorScheme;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Context;", "dynamicLightColorScheme", "dynamicTonalPalette", "Landroidx/compose/material3/TonalPalette;", "material3_release"}, m28849k = 2, m28848mv = {1, 8, 0}, m28846xi = 48)
/* loaded from: classes2.dex */
public final class DynamicTonalPaletteKt {
    @RequiresApi(31)
    @NotNull
    public static final ColorScheme dynamicDarkColorScheme(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        TonalPalette dynamicTonalPalette = dynamicTonalPalette(context);
        return ColorSchemeKt.m70298darkColorSchemeG1PFcw$default(dynamicTonalPalette.m70774getPrimary800d7_KjU(), dynamicTonalPalette.m70768getPrimary200d7_KjU(), dynamicTonalPalette.m70769getPrimary300d7_KjU(), dynamicTonalPalette.m70775getPrimary900d7_KjU(), dynamicTonalPalette.m70770getPrimary400d7_KjU(), dynamicTonalPalette.m70787getSecondary800d7_KjU(), dynamicTonalPalette.m70781getSecondary200d7_KjU(), dynamicTonalPalette.m70782getSecondary300d7_KjU(), dynamicTonalPalette.m70788getSecondary900d7_KjU(), dynamicTonalPalette.m70800getTertiary800d7_KjU(), dynamicTonalPalette.m70794getTertiary200d7_KjU(), dynamicTonalPalette.m70795getTertiary300d7_KjU(), dynamicTonalPalette.m70801getTertiary900d7_KjU(), dynamicTonalPalette.m70740getNeutral100d7_KjU(), dynamicTonalPalette.m70749getNeutral900d7_KjU(), dynamicTonalPalette.m70740getNeutral100d7_KjU(), dynamicTonalPalette.m70749getNeutral900d7_KjU(), dynamicTonalPalette.m70756getNeutralVariant300d7_KjU(), dynamicTonalPalette.m70761getNeutralVariant800d7_KjU(), 0L, dynamicTonalPalette.m70749getNeutral900d7_KjU(), dynamicTonalPalette.m70742getNeutral200d7_KjU(), 0L, 0L, 0L, 0L, dynamicTonalPalette.m70759getNeutralVariant600d7_KjU(), 0L, 0L, 466092032, null);
    }

    @RequiresApi(31)
    @NotNull
    public static final ColorScheme dynamicLightColorScheme(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        TonalPalette dynamicTonalPalette = dynamicTonalPalette(context);
        return ColorSchemeKt.m70300lightColorSchemeG1PFcw$default(dynamicTonalPalette.m70770getPrimary400d7_KjU(), dynamicTonalPalette.m70767getPrimary1000d7_KjU(), dynamicTonalPalette.m70775getPrimary900d7_KjU(), dynamicTonalPalette.m70766getPrimary100d7_KjU(), dynamicTonalPalette.m70774getPrimary800d7_KjU(), dynamicTonalPalette.m70783getSecondary400d7_KjU(), dynamicTonalPalette.m70780getSecondary1000d7_KjU(), dynamicTonalPalette.m70788getSecondary900d7_KjU(), dynamicTonalPalette.m70779getSecondary100d7_KjU(), dynamicTonalPalette.m70796getTertiary400d7_KjU(), dynamicTonalPalette.m70793getTertiary1000d7_KjU(), dynamicTonalPalette.m70801getTertiary900d7_KjU(), dynamicTonalPalette.m70792getTertiary100d7_KjU(), dynamicTonalPalette.m70751getNeutral990d7_KjU(), dynamicTonalPalette.m70740getNeutral100d7_KjU(), dynamicTonalPalette.m70751getNeutral990d7_KjU(), dynamicTonalPalette.m70740getNeutral100d7_KjU(), dynamicTonalPalette.m70762getNeutralVariant900d7_KjU(), dynamicTonalPalette.m70756getNeutralVariant300d7_KjU(), 0L, dynamicTonalPalette.m70742getNeutral200d7_KjU(), dynamicTonalPalette.m70750getNeutral950d7_KjU(), 0L, 0L, 0L, 0L, dynamicTonalPalette.m70758getNeutralVariant500d7_KjU(), 0L, 0L, 466092032, null);
    }

    @RequiresApi(31)
    @NotNull
    public static final TonalPalette dynamicTonalPalette(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        C0485Gs c0485Gs = C0485Gs.f2033a;
        return new TonalPalette(c0485Gs.m68153a(context, 17170461), c0485Gs.m68153a(context, 17170462), c0485Gs.m68153a(context, 17170463), c0485Gs.m68153a(context, 17170464), c0485Gs.m68153a(context, 17170465), c0485Gs.m68153a(context, 17170466), c0485Gs.m68153a(context, 17170467), c0485Gs.m68153a(context, 17170468), c0485Gs.m68153a(context, 17170469), c0485Gs.m68153a(context, 17170470), c0485Gs.m68153a(context, 17170471), c0485Gs.m68153a(context, 17170472), c0485Gs.m68153a(context, 17170473), c0485Gs.m68153a(context, 17170474), c0485Gs.m68153a(context, 17170475), c0485Gs.m68153a(context, 17170476), c0485Gs.m68153a(context, 17170477), c0485Gs.m68153a(context, 17170478), c0485Gs.m68153a(context, 17170479), c0485Gs.m68153a(context, 17170480), c0485Gs.m68153a(context, 17170481), c0485Gs.m68153a(context, 17170482), c0485Gs.m68153a(context, 17170483), c0485Gs.m68153a(context, 17170484), c0485Gs.m68153a(context, 17170485), c0485Gs.m68153a(context, 17170486), c0485Gs.m68153a(context, 17170487), c0485Gs.m68153a(context, 17170488), c0485Gs.m68153a(context, 17170489), c0485Gs.m68153a(context, 17170490), c0485Gs.m68153a(context, 17170491), c0485Gs.m68153a(context, 17170492), c0485Gs.m68153a(context, 17170493), c0485Gs.m68153a(context, 17170494), c0485Gs.m68153a(context, 17170495), c0485Gs.m68153a(context, 17170496), c0485Gs.m68153a(context, 17170497), c0485Gs.m68153a(context, 17170498), c0485Gs.m68153a(context, 17170499), c0485Gs.m68153a(context, 17170500), c0485Gs.m68153a(context, 17170501), c0485Gs.m68153a(context, 17170502), c0485Gs.m68153a(context, 17170503), c0485Gs.m68153a(context, 17170504), c0485Gs.m68153a(context, 17170505), c0485Gs.m68153a(context, 17170506), c0485Gs.m68153a(context, 17170507), c0485Gs.m68153a(context, 17170508), c0485Gs.m68153a(context, 17170509), c0485Gs.m68153a(context, 17170510), c0485Gs.m68153a(context, 17170511), c0485Gs.m68153a(context, 17170512), c0485Gs.m68153a(context, 17170513), c0485Gs.m68153a(context, 17170514), c0485Gs.m68153a(context, 17170515), c0485Gs.m68153a(context, 17170516), c0485Gs.m68153a(context, 17170517), c0485Gs.m68153a(context, 17170518), c0485Gs.m68153a(context, 17170519), c0485Gs.m68153a(context, 17170520), c0485Gs.m68153a(context, 17170521), c0485Gs.m68153a(context, 17170522), c0485Gs.m68153a(context, 17170523), c0485Gs.m68153a(context, 17170524), c0485Gs.m68153a(context, 17170525), null);
    }
}
