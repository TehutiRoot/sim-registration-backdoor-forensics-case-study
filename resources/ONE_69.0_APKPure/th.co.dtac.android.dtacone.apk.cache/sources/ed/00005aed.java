package androidx.compose.material3;

import androidx.compose.p003ui.unit.IntSize;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* loaded from: classes2.dex */
public final class SwipeToDismissKt$SwipeToDismiss$1 extends Lambda implements Function2<DismissValue, IntSize, Float> {
    final /* synthetic */ Set<DismissDirection> $directions;

    @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* loaded from: classes2.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DismissValue.values().length];
            try {
                iArr[DismissValue.DismissedToEnd.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DismissValue.DismissedToStart.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DismissValue.Default.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SwipeToDismissKt$SwipeToDismiss$1(Set<? extends DismissDirection> set) {
        super(2);
        this.$directions = set;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Float invoke(DismissValue dismissValue, IntSize intSize) {
        return m70819invokeO0kMr_c(dismissValue, intSize.m74006unboximpl());
    }

    @Nullable
    /* renamed from: invoke-O0kMr_c  reason: not valid java name */
    public final Float m70819invokeO0kMr_c(@NotNull DismissValue value, long j) {
        Intrinsics.checkNotNullParameter(value, "value");
        float m74002getWidthimpl = IntSize.m74002getWidthimpl(j);
        int i = WhenMappings.$EnumSwitchMapping$0[value.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return Float.valueOf(0.0f);
                }
                throw new NoWhenBranchMatchedException();
            } else if (!this.$directions.contains(DismissDirection.EndToStart)) {
                return null;
            } else {
                return Float.valueOf(-m74002getWidthimpl);
            }
        } else if (!this.$directions.contains(DismissDirection.StartToEnd)) {
            return null;
        } else {
            return Float.valueOf(m74002getWidthimpl);
        }
    }
}