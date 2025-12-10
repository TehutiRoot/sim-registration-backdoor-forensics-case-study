package androidx.compose.material3;

import androidx.compose.p003ui.unit.Density;
import androidx.compose.runtime.internal.StabilityInferred;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 0)
@ExperimentalMaterial3Api
@Metadata(m28851d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R=\u0010\u000f\u001a(\u0012\u0004\u0012\u00020\u0005\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0002\b\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0010"}, m28850d2 = {"Landroidx/compose/material3/SwipeToDismissDefaults;", "", "<init>", "()V", "Lkotlin/Function2;", "Landroidx/compose/ui/unit/Density;", "", "Lkotlin/ParameterName;", "name", "totalDistance", "Lkotlin/ExtensionFunctionType;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Lkotlin/jvm/functions/Function2;", "getFixedPositionalThreshold", "()Lkotlin/jvm/functions/Function2;", "FixedPositionalThreshold", "material3_release"}, m28849k = 1, m28848mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class SwipeToDismissDefaults {
    public static final int $stable = 0;
    @NotNull
    public static final SwipeToDismissDefaults INSTANCE = new SwipeToDismissDefaults();

    /* renamed from: a */
    public static final Function2 f26211a = SwipeToDismissDefaults$FixedPositionalThreshold$1.INSTANCE;

    @NotNull
    public final Function2<Density, Float, Float> getFixedPositionalThreshold() {
        return f26211a;
    }
}
