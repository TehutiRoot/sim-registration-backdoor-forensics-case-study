package androidx.compose.p003ui.viewinterop;

import androidx.compose.p003ui.node.LayoutNode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003*\u00020\u00042\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u00010\u0006H\n¢\u0006\u0002\b\u0007"}, m28850d2 = {"<anonymous>", "", "T", "Landroid/view/View;", "Landroidx/compose/ui/node/LayoutNode;", "it", "Lkotlin/Function1;", "invoke"}, m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$2$3 */
/* loaded from: classes2.dex */
public final class AndroidView_androidKt$AndroidView$2$3 extends Lambda implements Function2<LayoutNode, Function1<? super T, ? extends Unit>, Unit> {
    public static final AndroidView_androidKt$AndroidView$2$3 INSTANCE = new AndroidView_androidKt$AndroidView$2$3();

    public AndroidView_androidKt$AndroidView$2$3() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(LayoutNode layoutNode, Object obj) {
        invoke(layoutNode, (Function1) obj);
        return Unit.INSTANCE;
    }

    public final void invoke(@NotNull LayoutNode set, @NotNull Function1<? super T, Unit> it) {
        ViewFactoryHolder m58857b;
        Intrinsics.checkNotNullParameter(set, "$this$set");
        Intrinsics.checkNotNullParameter(it, "it");
        m58857b = AndroidView_androidKt.m58857b(set);
        m58857b.setReleaseBlock(it);
    }
}
