package androidx.compose.material;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.p003ui.unit.C3641Dp;
import androidx.compose.runtime.internal.StabilityInferred;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\t\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR \u0010\f\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u000b\u0010\bR\u0017\u0010\u0012\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0013"}, m28850d2 = {"Landroidx/compose/material/AppBarDefaults;", "", "<init>", "()V", "Landroidx/compose/ui/unit/Dp;", PDPageLabelRange.STYLE_LETTERS_LOWER, "F", "getTopAppBarElevation-D9Ej5fM", "()F", "TopAppBarElevation", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "getBottomAppBarElevation-D9Ej5fM", "BottomAppBarElevation", "Landroidx/compose/foundation/layout/PaddingValues;", OperatorName.CURVE_TO, "Landroidx/compose/foundation/layout/PaddingValues;", "getContentPadding", "()Landroidx/compose/foundation/layout/PaddingValues;", "ContentPadding", "material_release"}, m28849k = 1, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nAppBar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AppBar.kt\nandroidx/compose/material/AppBarDefaults\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,547:1\n154#2:548\n154#2:549\n*S KotlinDebug\n*F\n+ 1 AppBar.kt\nandroidx/compose/material/AppBarDefaults\n*L\n250#1:548\n255#1:549\n*E\n"})
/* loaded from: classes.dex */
public final class AppBarDefaults {
    public static final int $stable = 0;
    @NotNull
    public static final AppBarDefaults INSTANCE = new AppBarDefaults();

    /* renamed from: a */
    public static final float f14347a = C3641Dp.m73658constructorimpl(4);

    /* renamed from: b */
    public static final float f14348b = C3641Dp.m73658constructorimpl(8);

    /* renamed from: c */
    public static final PaddingValues f14349c;

    static {
        float f;
        float f2;
        f = AppBarKt.f14351b;
        f2 = AppBarKt.f14351b;
        f14349c = PaddingKt.m69526PaddingValuesa9UjIt4$default(f, 0.0f, f2, 0.0f, 10, null);
    }

    /* renamed from: getBottomAppBarElevation-D9Ej5fM  reason: not valid java name */
    public final float m69906getBottomAppBarElevationD9Ej5fM() {
        return f14348b;
    }

    @NotNull
    public final PaddingValues getContentPadding() {
        return f14349c;
    }

    /* renamed from: getTopAppBarElevation-D9Ej5fM  reason: not valid java name */
    public final float m69907getTopAppBarElevationD9Ej5fM() {
        return f14347a;
    }
}
