package androidx.compose.material3;

import androidx.compose.p003ui.semantics.ScrollAxisRange;
import androidx.compose.p003ui.semantics.SemanticsPropertiesKt;
import androidx.compose.p003ui.semantics.SemanticsPropertyReceiver;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
/* loaded from: classes2.dex */
public final class DatePickerKt$HorizontalMonthsList$1 extends Lambda implements Function1<SemanticsPropertyReceiver, Unit> {
    public static final DatePickerKt$HorizontalMonthsList$1 INSTANCE = new DatePickerKt$HorizontalMonthsList$1();

    @Metadata(m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* renamed from: androidx.compose.material3.DatePickerKt$HorizontalMonthsList$1$1 */
    /* loaded from: classes2.dex */
    public static final class C32591 extends Lambda implements Function0<Float> {
        public static final C32591 INSTANCE = new C32591();

        public C32591() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final Float invoke() {
            return Float.valueOf(0.0f);
        }
    }

    @Metadata(m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* renamed from: androidx.compose.material3.DatePickerKt$HorizontalMonthsList$1$2 */
    /* loaded from: classes2.dex */
    public static final class C32602 extends Lambda implements Function0<Float> {
        public static final C32602 INSTANCE = new C32602();

        public C32602() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final Float invoke() {
            return Float.valueOf(0.0f);
        }
    }

    public DatePickerKt$HorizontalMonthsList$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        invoke2(semanticsPropertyReceiver);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull SemanticsPropertyReceiver semantics) {
        Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
        SemanticsPropertiesKt.setHorizontalScrollAxisRange(semantics, new ScrollAxisRange(C32591.INSTANCE, C32602.INSTANCE, false, 4, null));
    }
}
