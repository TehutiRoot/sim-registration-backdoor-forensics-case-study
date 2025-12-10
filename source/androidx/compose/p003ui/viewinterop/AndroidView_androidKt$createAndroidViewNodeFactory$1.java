package androidx.compose.p003ui.viewinterop;

import android.content.Context;
import android.view.View;
import androidx.compose.p003ui.node.LayoutNode;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.saveable.SaveableStateRegistry;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m28850d2 = {"<anonymous>", "Landroidx/compose/ui/node/LayoutNode;", "T", "Landroid/view/View;", "invoke"}, m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: androidx.compose.ui.viewinterop.AndroidView_androidKt$createAndroidViewNodeFactory$1 */
/* loaded from: classes2.dex */
public final class AndroidView_androidKt$createAndroidViewNodeFactory$1 extends Lambda implements Function0<LayoutNode> {
    final /* synthetic */ int $compositeKeyHash;
    final /* synthetic */ Context $context;
    final /* synthetic */ Function1<Context, View> $factory;
    final /* synthetic */ CompositionContext $parentReference;
    final /* synthetic */ SaveableStateRegistry $stateRegistry;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AndroidView_androidKt$createAndroidViewNodeFactory$1(Context context, Function1<? super Context, View> function1, CompositionContext compositionContext, SaveableStateRegistry saveableStateRegistry, int i) {
        super(0);
        this.$context = context;
        this.$factory = function1;
        this.$parentReference = compositionContext;
        this.$stateRegistry = saveableStateRegistry;
        this.$compositeKeyHash = i;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    @NotNull
    public final LayoutNode invoke() {
        return new ViewFactoryHolder(this.$context, this.$factory, this.$parentReference, this.$stateRegistry, this.$compositeKeyHash).getLayoutNode();
    }
}
