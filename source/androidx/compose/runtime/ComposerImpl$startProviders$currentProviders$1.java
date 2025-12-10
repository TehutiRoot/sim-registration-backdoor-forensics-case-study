package androidx.compose.runtime;

import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, m28850d2 = {"<anonymous>", "Landroidx/compose/runtime/PersistentCompositionLocalMap;", "invoke", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/PersistentCompositionLocalMap;"}, m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
/* loaded from: classes2.dex */
public final class ComposerImpl$startProviders$currentProviders$1 extends Lambda implements Function2<Composer, Integer, PersistentCompositionLocalMap> {
    final /* synthetic */ PersistentCompositionLocalMap $parentScope;
    final /* synthetic */ ProvidedValue<?>[] $values;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComposerImpl$startProviders$currentProviders$1(ProvidedValue<?>[] providedValueArr, PersistentCompositionLocalMap persistentCompositionLocalMap) {
        super(2);
        this.$values = providedValueArr;
        this.$parentScope = persistentCompositionLocalMap;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ PersistentCompositionLocalMap invoke(Composer composer, Integer num) {
        return invoke(composer, num.intValue());
    }

    @Composable
    @NotNull
    public final PersistentCompositionLocalMap invoke(@Nullable Composer composer, int i) {
        composer.startReplaceableGroup(-948105361);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-948105361, i, -1, "androidx.compose.runtime.ComposerImpl.startProviders.<anonymous> (Composer.kt:1994)");
        }
        PersistentCompositionLocalMap compositionLocalMapOf = CompositionLocalMapKt.compositionLocalMapOf(this.$values, this.$parentScope, composer, 8);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return compositionLocalMapOf;
    }
}
