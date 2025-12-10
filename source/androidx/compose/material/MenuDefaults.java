package androidx.compose.material;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.p003ui.unit.C3641Dp;
import androidx.compose.runtime.internal.StabilityInferred;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, m28850d2 = {"Landroidx/compose/material/MenuDefaults;", "", "<init>", "()V", "Landroidx/compose/foundation/layout/PaddingValues;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroidx/compose/foundation/layout/PaddingValues;", "getDropdownMenuItemContentPadding", "()Landroidx/compose/foundation/layout/PaddingValues;", "DropdownMenuItemContentPadding", "material_release"}, m28849k = 1, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nMenu.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Menu.kt\nandroidx/compose/material/MenuDefaults\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,298:1\n154#2:299\n*S KotlinDebug\n*F\n+ 1 Menu.kt\nandroidx/compose/material/MenuDefaults\n*L\n182#1:299\n*E\n"})
/* loaded from: classes.dex */
public final class MenuDefaults {
    public static final int $stable = 0;
    @NotNull
    public static final MenuDefaults INSTANCE = new MenuDefaults();

    /* renamed from: a */
    public static final PaddingValues f14508a;

    static {
        float f;
        f = MenuKt.f14511c;
        f14508a = PaddingKt.m69523PaddingValuesYgX7TsA(f, C3641Dp.m73658constructorimpl(0));
    }

    @NotNull
    public final PaddingValues getDropdownMenuItemContentPadding() {
        return f14508a;
    }
}
