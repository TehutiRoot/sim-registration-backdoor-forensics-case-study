package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.MagnifierKt;
import androidx.compose.foundation.MagnifierStyle;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.geometry.Offset;
import androidx.compose.p003ui.unit.Density;
import androidx.compose.p003ui.unit.DpSize;
import androidx.compose.p003ui.unit.IntSize;
import androidx.compose.p003ui.unit.IntSizeKt;
import androidx.compose.runtime.MutableState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.util.Constant;

@Metadata(m28851d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, m28850d2 = {"<anonymous>", "Landroidx/compose/ui/Modifier;", Constant.VIEW_CENTER, "Lkotlin/Function0;", "Landroidx/compose/ui/geometry/Offset;", "invoke"}, m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
/* loaded from: classes.dex */
public final class TextFieldSelectionManager_androidKt$textFieldMagnifier$1$2$1 extends Lambda implements Function1<Function0<? extends Offset>, Modifier> {
    final /* synthetic */ Density $density;
    final /* synthetic */ MutableState<IntSize> $magnifierSize$delegate;

    @Metadata(m28851d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28850d2 = {"<anonymous>", "Landroidx/compose/ui/geometry/Offset;", "Landroidx/compose/ui/unit/Density;", "invoke-tuRUvjQ", "(Landroidx/compose/ui/unit/Density;)J"}, m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* renamed from: androidx.compose.foundation.text.selection.TextFieldSelectionManager_androidKt$textFieldMagnifier$1$2$1$1 */
    /* loaded from: classes.dex */
    public static final class C30481 extends Lambda implements Function1<Density, Offset> {
        final /* synthetic */ Function0<Offset> $center;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C30481(Function0<Offset> function0) {
            super(1);
            this.$center = function0;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Offset invoke(Density density) {
            return Offset.m71491boximpl(m69896invoketuRUvjQ(density));
        }

        /* renamed from: invoke-tuRUvjQ  reason: not valid java name */
        public final long m69896invoketuRUvjQ(@NotNull Density magnifier) {
            Intrinsics.checkNotNullParameter(magnifier, "$this$magnifier");
            return this.$center.invoke().m71512unboximpl();
        }
    }

    @Metadata(m28851d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28850d2 = {"<anonymous>", "", "size", "Landroidx/compose/ui/unit/DpSize;", "invoke-EaSLcWc", "(J)V"}, m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* renamed from: androidx.compose.foundation.text.selection.TextFieldSelectionManager_androidKt$textFieldMagnifier$1$2$1$2 */
    /* loaded from: classes.dex */
    public static final class C30492 extends Lambda implements Function1<DpSize, Unit> {
        final /* synthetic */ Density $density;
        final /* synthetic */ MutableState<IntSize> $magnifierSize$delegate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C30492(Density density, MutableState<IntSize> mutableState) {
            super(1);
            this.$density = density;
            this.$magnifierSize$delegate = mutableState;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(DpSize dpSize) {
            m69897invokeEaSLcWc(dpSize.m73764unboximpl());
            return Unit.INSTANCE;
        }

        /* renamed from: invoke-EaSLcWc  reason: not valid java name */
        public final void m69897invokeEaSLcWc(long j) {
            MutableState<IntSize> mutableState = this.$magnifierSize$delegate;
            Density density = this.$density;
            TextFieldSelectionManager_androidKt$textFieldMagnifier$1.invoke$lambda$2(mutableState, IntSizeKt.IntSize(density.mo69432roundToPx0680j_4(DpSize.m73756getWidthD9Ej5fM(j)), density.mo69432roundToPx0680j_4(DpSize.m73754getHeightD9Ej5fM(j))));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldSelectionManager_androidKt$textFieldMagnifier$1$2$1(Density density, MutableState<IntSize> mutableState) {
        super(1);
        this.$density = density;
        this.$magnifierSize$delegate = mutableState;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Modifier invoke(Function0<? extends Offset> function0) {
        return invoke2((Function0<Offset>) function0);
    }

    @NotNull
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final Modifier invoke2(@NotNull Function0<Offset> center) {
        Intrinsics.checkNotNullParameter(center, "center");
        return MagnifierKt.magnifier$default(Modifier.Companion, new C30481(center), null, 0.0f, MagnifierStyle.Companion.getTextDefault(), new C30492(this.$density, this.$magnifierSize$delegate), 6, null);
    }
}
