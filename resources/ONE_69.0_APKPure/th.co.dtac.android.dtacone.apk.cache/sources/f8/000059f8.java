package androidx.compose.material3;

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
import kotlin.ranges.AbstractC11695c;
import org.jetbrains.annotations.NotNull;

@Metadata(m29143d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, m29142d2 = {"<anonymous>", "", "Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
@SourceDebugExtension({"SMAP\nOutlinedTextField.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OutlinedTextField.kt\nandroidx/compose/material3/OutlinedTextFieldKt$outlineCutout$1\n+ 2 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n*L\n1#1,1124:1\n221#2:1125\n261#2,11:1126\n*S KotlinDebug\n*F\n+ 1 OutlinedTextField.kt\nandroidx/compose/material3/OutlinedTextFieldKt$outlineCutout$1\n*L\n1108#1:1125\n1108#1:1126,11\n*E\n"})
/* loaded from: classes2.dex */
public final class OutlinedTextFieldKt$outlineCutout$1 extends Lambda implements Function1<ContentDrawScope, Unit> {
    final /* synthetic */ long $labelSize;
    final /* synthetic */ PaddingValues $paddingValues;

    @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* loaded from: classes2.dex */
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
        float m71755getWidthimpl = Size.m71755getWidthimpl(this.$labelSize);
        if (m71755getWidthimpl > 0.0f) {
            f = OutlinedTextFieldKt.f26025a;
            float mo69622toPx0680j_4 = drawWithContent.mo69622toPx0680j_4(f);
            float mo69622toPx0680j_42 = drawWithContent.mo69622toPx0680j_4(this.$paddingValues.mo69343calculateLeftPaddingu2uoSUM(drawWithContent.getLayoutDirection())) - mo69622toPx0680j_4;
            float f2 = 2;
            float f3 = m71755getWidthimpl + mo69622toPx0680j_42 + (mo69622toPx0680j_4 * f2);
            LayoutDirection layoutDirection = drawWithContent.getLayoutDirection();
            int[] iArr = WhenMappings.$EnumSwitchMapping$0;
            if (iArr[layoutDirection.ordinal()] == 1) {
                coerceAtLeast = Size.m71755getWidthimpl(drawWithContent.mo72328getSizeNHjbRc()) - f3;
            } else {
                coerceAtLeast = AbstractC11695c.coerceAtLeast(mo69622toPx0680j_42, 0.0f);
            }
            float f4 = coerceAtLeast;
            if (iArr[drawWithContent.getLayoutDirection().ordinal()] == 1) {
                f3 = Size.m71755getWidthimpl(drawWithContent.mo72328getSizeNHjbRc()) - AbstractC11695c.coerceAtLeast(mo69622toPx0680j_42, 0.0f);
            }
            float f5 = f3;
            float m71752getHeightimpl = Size.m71752getHeightimpl(this.$labelSize);
            float f6 = (-m71752getHeightimpl) / f2;
            float f7 = m71752getHeightimpl / f2;
            int m71907getDifferencertfAjoo = ClipOp.Companion.m71907getDifferencertfAjoo();
            DrawContext drawContext = drawWithContent.getDrawContext();
            long mo72334getSizeNHjbRc = drawContext.mo72334getSizeNHjbRc();
            drawContext.getCanvas().save();
            drawContext.getTransform().mo72337clipRectN_I0leg(f4, f6, f5, f7, m71907getDifferencertfAjoo);
            drawWithContent.drawContent();
            drawContext.getCanvas().restore();
            drawContext.mo72335setSizeuvyYCjk(mo72334getSizeNHjbRc);
            return;
        }
        drawWithContent.drawContent();
    }
}