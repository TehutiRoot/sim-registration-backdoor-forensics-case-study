package androidx.compose.material3;

import androidx.compose.runtime.Stable;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Stable
@ExperimentalMaterial3Api
@Metadata(m28851d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m28850d2 = {"Landroidx/compose/material3/BottomSheetScaffoldState;", "", "Landroidx/compose/material3/SheetState;", "bottomSheetState", "Landroidx/compose/material3/SnackbarHostState;", "snackbarHostState", "<init>", "(Landroidx/compose/material3/SheetState;Landroidx/compose/material3/SnackbarHostState;)V", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroidx/compose/material3/SheetState;", "getBottomSheetState", "()Landroidx/compose/material3/SheetState;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Landroidx/compose/material3/SnackbarHostState;", "getSnackbarHostState", "()Landroidx/compose/material3/SnackbarHostState;", "material3_release"}, m28849k = 1, m28848mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class BottomSheetScaffoldState {
    public static final int $stable = 0;

    /* renamed from: a */
    public final SheetState f25563a;

    /* renamed from: b */
    public final SnackbarHostState f25564b;

    public BottomSheetScaffoldState(@NotNull SheetState bottomSheetState, @NotNull SnackbarHostState snackbarHostState) {
        Intrinsics.checkNotNullParameter(bottomSheetState, "bottomSheetState");
        Intrinsics.checkNotNullParameter(snackbarHostState, "snackbarHostState");
        this.f25563a = bottomSheetState;
        this.f25564b = snackbarHostState;
    }

    @NotNull
    public final SheetState getBottomSheetState() {
        return this.f25563a;
    }

    @NotNull
    public final SnackbarHostState getSnackbarHostState() {
        return this.f25564b;
    }
}
