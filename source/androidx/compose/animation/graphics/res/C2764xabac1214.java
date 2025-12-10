package androidx.compose.animation.graphics.res;

import androidx.compose.p003ui.graphics.vector.VectorConfig;
import androidx.compose.p003ui.graphics.vector.VectorGroup;
import androidx.compose.p003ui.graphics.vector.VectorPainterKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\u000b¢\u0006\u0004\b\b\u0010\t"}, m28850d2 = {"<anonymous>", "", "group", "Landroidx/compose/ui/graphics/vector/VectorGroup;", "overrides", "", "", "Landroidx/compose/ui/graphics/vector/VectorConfig;", "invoke", "(Landroidx/compose/ui/graphics/vector/VectorGroup;Ljava/util/Map;Landroidx/compose/runtime/Composer;I)V"}, m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: androidx.compose.animation.graphics.res.ComposableSingletons$AnimatedVectorPainterResources_androidKt$lambda-1$1 */
/* loaded from: classes.dex */
public final class C2764xabac1214 extends Lambda implements Function4<VectorGroup, Map<String, ? extends VectorConfig>, Composer, Integer, Unit> {
    public static final C2764xabac1214 INSTANCE = new C2764xabac1214();

    public C2764xabac1214() {
        super(4);
    }

    @Override // kotlin.jvm.functions.Function4
    public /* bridge */ /* synthetic */ Unit invoke(VectorGroup vectorGroup, Map<String, ? extends VectorConfig> map, Composer composer, Integer num) {
        invoke(vectorGroup, map, composer, num.intValue());
        return Unit.INSTANCE;
    }

    @ComposableTarget(applier = "androidx.compose.ui.graphics.vector.VectorComposable")
    @Composable
    public final void invoke(@NotNull VectorGroup group, @NotNull Map<String, ? extends VectorConfig> overrides, @Nullable Composer composer, int i) {
        Intrinsics.checkNotNullParameter(group, "group");
        Intrinsics.checkNotNullParameter(overrides, "overrides");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-869223072, i, -1, "androidx.compose.animation.graphics.res.ComposableSingletons$AnimatedVectorPainterResources_androidKt.lambda-1.<anonymous> (AnimatedVectorPainterResources.android.kt:44)");
        }
        VectorPainterKt.RenderVectorGroup(group, overrides, composer, (i & 14) | 64, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
