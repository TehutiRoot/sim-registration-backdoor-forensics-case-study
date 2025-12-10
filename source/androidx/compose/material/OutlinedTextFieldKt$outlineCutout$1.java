package androidx.compose.material;

import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.p003ui.geometry.Size;
import androidx.compose.p003ui.graphics.ClipOp;
import androidx.compose.p003ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.p003ui.graphics.drawscope.DrawContext;
import androidx.compose.p003ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.AbstractC11719c;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, m28850d2 = {"<anonymous>", "", "Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;", "invoke"}, m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
@SourceDebugExtension({"SMAP\nOutlinedTextField.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OutlinedTextField.kt\nandroidx/compose/material/OutlinedTextFieldKt$outlineCutout$1\n+ 2 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n*L\n1#1,973:1\n221#2:974\n261#2,11:975\n*S KotlinDebug\n*F\n+ 1 OutlinedTextField.kt\nandroidx/compose/material/OutlinedTextFieldKt$outlineCutout$1\n*L\n955#1:974\n955#1:975,11\n*E\n"})
/* loaded from: classes.dex */
public final class OutlinedTextFieldKt$outlineCutout$1 extends Lambda implements Function1<ContentDrawScope, Unit> {
    final /* synthetic */ long $labelSize;
    final /* synthetic */ PaddingValues $paddingValues;

    @Metadata(m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* loaded from: classes.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LayoutDirection.values().length];
            try {
                iArr[LayoutDirection.Rtl.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OutlinedTextFieldKt$outlineCutout$1(long j, PaddingValues paddingValues) {
        super(1);
        this.$labelSize = j;
        this.$paddingValues = paddingValues;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(ContentDrawScope contentDrawScope) {
        invoke2(contentDrawScope);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull ContentDrawScope drawWithContent) {
        float f;
        float coerceAtLeast;
        Intrinsics.checkNotNullParameter(drawWithContent, "$this$drawWithContent");
        float m71571getWidthimpl = Size.m71571getWidthimpl(this.$labelSize);
        if (m71571getWidthimpl > 0.0f) {
            f = OutlinedTextFieldKt.f14548a;
            float mo69438toPx0680j_4 = drawWithContent.mo69438toPx0680j_4(f);
            float mo69438toPx0680j_42 = drawWithContent.mo69438toPx0680j_4(this.$paddingValues.mo69157calculateLeftPaddingu2uoSUM(drawWithContent.getLayoutDirection())) - mo69438toPx0680j_4;
            float f2 = 2;
            float f3 = m71571getWidthimpl + mo69438toPx0680j_42 + (mo69438toPx0680j_4 * f2);
            LayoutDirection layoutDirection = drawWithContent.getLayoutDirection();
            int[] iArr = WhenMappings.$EnumSwitchMapping$0;
            if (iArr[layoutDirection.ordinal()] == 1) {
                coerceAtLeast = Size.m71571getWidthimpl(drawWithContent.mo72144getSizeNHjbRc()) - f3;
            } else {
                coerceAtLeast = AbstractC11719c.coerceAtLeast(mo69438toPx0680j_42, 0.0f);
            }
            float f4 = coerceAtLeast;
            if (iArr[drawWithContent.getLayoutDirection().ordinal()] == 1) {
                f3 = Size.m71571getWidthimpl(drawWithContent.mo72144getSizeNHjbRc()) - AbstractC11719c.coerceAtLeast(mo69438toPx0680j_42, 0.0f);
            }
            float f5 = f3;
            float m71568getHeightimpl = Size.m71568getHeightimpl(this.$labelSize);
            float f6 = (-m71568getHeightimpl) / f2;
            float f7 = m71568getHeightimpl / f2;
            int m71723getDifferencertfAjoo = ClipOp.Companion.m71723getDifferencertfAjoo();
            DrawContext drawContext = drawWithContent.getDrawContext();
            long mo72150getSizeNHjbRc = drawContext.mo72150getSizeNHjbRc();
            drawContext.getCanvas().save();
            drawContext.getTransform().mo72153clipRectN_I0leg(f4, f6, f5, f7, m71723getDifferencertfAjoo);
            drawWithContent.drawContent();
            drawContext.getCanvas().restore();
            drawContext.mo72151setSizeuvyYCjk(mo72150getSizeNHjbRc);
            return;
        }
        drawWithContent.drawContent();
    }
}
