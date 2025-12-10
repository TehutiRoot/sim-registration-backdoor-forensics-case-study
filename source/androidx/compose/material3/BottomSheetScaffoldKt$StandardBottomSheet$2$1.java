package androidx.compose.material3;

import androidx.compose.p003ui.unit.IntSize;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
/* loaded from: classes2.dex */
public final class BottomSheetScaffoldKt$StandardBottomSheet$2$1 extends Lambda implements Function2<SheetValue, IntSize, Float> {
    final /* synthetic */ float $layoutHeight;
    final /* synthetic */ float $peekHeightPx;
    final /* synthetic */ SheetState $state;

    @Metadata(m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* loaded from: classes2.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SheetValue.values().length];
            try {
                iArr[SheetValue.PartiallyExpanded.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SheetValue.Expanded.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SheetValue.Hidden.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BottomSheetScaffoldKt$StandardBottomSheet$2$1(SheetState sheetState, float f, float f2) {
        super(2);
        this.$state = sheetState;
        this.$layoutHeight = f;
        this.$peekHeightPx = f2;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Float invoke(SheetValue sheetValue, IntSize intSize) {
        return m70209invokeO0kMr_c(sheetValue, intSize.m73822unboximpl());
    }

    @Nullable
    /* renamed from: invoke-O0kMr_c  reason: not valid java name */
    public final Float m70209invokeO0kMr_c(@NotNull SheetValue value, long j) {
        Intrinsics.checkNotNullParameter(value, "value");
        int i = WhenMappings.$EnumSwitchMapping$0[value.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    if (this.$state.getSkipHiddenState$material3_release()) {
                        return null;
                    }
                    return Float.valueOf(this.$layoutHeight);
                }
                throw new NoWhenBranchMatchedException();
            } else if (IntSize.m73817getHeightimpl(j) == AbstractC21140mr0.roundToInt(this.$peekHeightPx)) {
                return null;
            } else {
                return Float.valueOf(Math.max(0.0f, this.$layoutHeight - IntSize.m73817getHeightimpl(j)));
            }
        } else if (this.$state.getSkipPartiallyExpanded$material3_release()) {
            return null;
        } else {
            return Float.valueOf(this.$layoutHeight - this.$peekHeightPx);
        }
    }
}
