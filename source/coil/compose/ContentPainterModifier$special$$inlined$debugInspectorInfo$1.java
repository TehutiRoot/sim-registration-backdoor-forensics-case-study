package coil.compose;

import androidx.compose.p003ui.Alignment;
import androidx.compose.p003ui.graphics.ColorFilter;
import androidx.compose.p003ui.graphics.painter.Painter;
import androidx.compose.p003ui.layout.ContentScale;
import androidx.compose.p003ui.platform.InspectorInfo;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003¨\u0006\u0004"}, m28850d2 = {"<anonymous>", "", "Landroidx/compose/ui/platform/InspectorInfo;", "invoke", "androidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1"}, m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
@SourceDebugExtension({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 ContentPainterModifier.kt\ncoil/compose/ContentPainterModifier\n*L\n1#1,170:1\n39#2,7:171\n*E\n"})
/* loaded from: classes3.dex */
public final class ContentPainterModifier$special$$inlined$debugInspectorInfo$1 extends Lambda implements Function1<InspectorInfo, Unit> {
    final /* synthetic */ Alignment $alignment$inlined;
    final /* synthetic */ float $alpha$inlined;
    final /* synthetic */ ColorFilter $colorFilter$inlined;
    final /* synthetic */ ContentScale $contentScale$inlined;
    final /* synthetic */ Painter $painter$inlined;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContentPainterModifier$special$$inlined$debugInspectorInfo$1(Painter painter, Alignment alignment, ContentScale contentScale, float f, ColorFilter colorFilter) {
        super(1);
        this.$painter$inlined = painter;
        this.$alignment$inlined = alignment;
        this.$contentScale$inlined = contentScale;
        this.$alpha$inlined = f;
        this.$colorFilter$inlined = colorFilter;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
        invoke2(inspectorInfo);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull InspectorInfo inspectorInfo) {
        Intrinsics.checkNotNullParameter(inspectorInfo, "$this$null");
        inspectorInfo.setName("content");
        inspectorInfo.getProperties().set("painter", this.$painter$inlined);
        inspectorInfo.getProperties().set("alignment", this.$alignment$inlined);
        inspectorInfo.getProperties().set("contentScale", this.$contentScale$inlined);
        inspectorInfo.getProperties().set("alpha", Float.valueOf(this.$alpha$inlined));
        inspectorInfo.getProperties().set("colorFilter", this.$colorFilter$inlined);
    }
}
