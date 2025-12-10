package androidx.compose.material3;

import androidx.compose.p003ui.unit.IntSize;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28850d2 = {"<anonymous>", "", "value", "Landroidx/compose/material3/SheetValue;", "sheetSize", "Landroidx/compose/ui/unit/IntSize;", "invoke-O0kMr_c", "(Landroidx/compose/material3/SheetValue;J)Ljava/lang/Float;"}, m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
/* loaded from: classes2.dex */
public final class ModalBottomSheet_androidKt$modalBottomSheetSwipeable$2 extends Lambda implements Function2<SheetValue, IntSize, Float> {
    final /* synthetic */ float $screenHeight;
    final /* synthetic */ SheetState $sheetState;

    @Metadata(m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* loaded from: classes2.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SheetValue.values().length];
            try {
                iArr[SheetValue.Hidden.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SheetValue.PartiallyExpanded.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SheetValue.Expanded.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ModalBottomSheet_androidKt$modalBottomSheetSwipeable$2(float f, SheetState sheetState) {
        super(2);
        this.$screenHeight = f;
        this.$sheetState = sheetState;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Float invoke(SheetValue sheetValue, IntSize intSize) {
        return m70461invokeO0kMr_c(sheetValue, intSize.m73822unboximpl());
    }

    @Nullable
    /* renamed from: invoke-O0kMr_c  reason: not valid java name */
    public final Float m70461invokeO0kMr_c(@NotNull SheetValue value, long j) {
        Intrinsics.checkNotNullParameter(value, "value");
        int i = WhenMappings.$EnumSwitchMapping$0[value.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    if (IntSize.m73817getHeightimpl(j) == 0) {
                        return null;
                    }
                    return Float.valueOf(Math.max(0.0f, this.$screenHeight - IntSize.m73817getHeightimpl(j)));
                }
                throw new NoWhenBranchMatchedException();
            } else if (IntSize.m73817getHeightimpl(j) < this.$screenHeight / 2 || this.$sheetState.getSkipPartiallyExpanded$material3_release()) {
                return null;
            } else {
                return Float.valueOf(this.$screenHeight / 2.0f);
            }
        }
        return Float.valueOf(this.$screenHeight);
    }
}
