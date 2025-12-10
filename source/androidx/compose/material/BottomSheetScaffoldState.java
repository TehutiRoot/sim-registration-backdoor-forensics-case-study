package androidx.compose.material;

import androidx.compose.runtime.Stable;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Stable
@Metadata(m28851d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, m28850d2 = {"Landroidx/compose/material/BottomSheetScaffoldState;", "", "Landroidx/compose/material/DrawerState;", "drawerState", "Landroidx/compose/material/BottomSheetState;", "bottomSheetState", "Landroidx/compose/material/SnackbarHostState;", "snackbarHostState", "<init>", "(Landroidx/compose/material/DrawerState;Landroidx/compose/material/BottomSheetState;Landroidx/compose/material/SnackbarHostState;)V", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroidx/compose/material/DrawerState;", "getDrawerState", "()Landroidx/compose/material/DrawerState;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Landroidx/compose/material/BottomSheetState;", "getBottomSheetState", "()Landroidx/compose/material/BottomSheetState;", OperatorName.CURVE_TO, "Landroidx/compose/material/SnackbarHostState;", "getSnackbarHostState", "()Landroidx/compose/material/SnackbarHostState;", "material_release"}, m28849k = 1, m28848mv = {1, 8, 0})
@ExperimentalMaterialApi
/* loaded from: classes.dex */
public final class BottomSheetScaffoldState {
    public static final int $stable = 0;

    /* renamed from: a */
    public final DrawerState f14388a;

    /* renamed from: b */
    public final BottomSheetState f14389b;

    /* renamed from: c */
    public final SnackbarHostState f14390c;

    public BottomSheetScaffoldState(@NotNull DrawerState drawerState, @NotNull BottomSheetState bottomSheetState, @NotNull SnackbarHostState snackbarHostState) {
        Intrinsics.checkNotNullParameter(drawerState, "drawerState");
        Intrinsics.checkNotNullParameter(bottomSheetState, "bottomSheetState");
        Intrinsics.checkNotNullParameter(snackbarHostState, "snackbarHostState");
        this.f14388a = drawerState;
        this.f14389b = bottomSheetState;
        this.f14390c = snackbarHostState;
    }

    @NotNull
    public final BottomSheetState getBottomSheetState() {
        return this.f14389b;
    }

    @NotNull
    public final DrawerState getDrawerState() {
        return this.f14388a;
    }

    @NotNull
    public final SnackbarHostState getSnackbarHostState() {
        return this.f14390c;
    }
}
