package th.p047co.dtac.android.dtacone.view.appOne.tol.screen.fixedLinePlus;

import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.p003ui.Modifier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.model.appOne.tol.fixedLinePlus.FlpOffer;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.screen.fixedLinePlus.OneRegisterTrueOnlineFlpMarketingCodeScreenKt$OneRegisterTrueOnlineFlpMarketingCodeScreen$2$1$3 */
/* loaded from: classes10.dex */
public final class C15384xdc925dcd extends Lambda implements Function3<ColumnScope, Composer, Integer, Unit> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ MutableState<String> $filterText$delegate;
    final /* synthetic */ List<FlpOffer> $filteredMarketingCodes;
    final /* synthetic */ Function1<String, Unit> $onSelect;

    @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    @SourceDebugExtension({"SMAP\nOneRegisterTrueOnlineFlpMarketingCodeScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OneRegisterTrueOnlineFlpMarketingCodeScreen.kt\nth/co/dtac/android/dtacone/view/appOne/tol/screen/fixedLinePlus/OneRegisterTrueOnlineFlpMarketingCodeScreenKt$OneRegisterTrueOnlineFlpMarketingCodeScreen$2$1$3$1\n+ 2 LazyDsl.kt\nandroidx/compose/foundation/lazy/LazyDslKt\n*L\n1#1,238:1\n171#2,12:239\n*S KotlinDebug\n*F\n+ 1 OneRegisterTrueOnlineFlpMarketingCodeScreen.kt\nth/co/dtac/android/dtacone/view/appOne/tol/screen/fixedLinePlus/OneRegisterTrueOnlineFlpMarketingCodeScreenKt$OneRegisterTrueOnlineFlpMarketingCodeScreen$2$1$3$1\n*L\n134#1:239,12\n*E\n"})
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.screen.fixedLinePlus.OneRegisterTrueOnlineFlpMarketingCodeScreenKt$OneRegisterTrueOnlineFlpMarketingCodeScreen$2$1$3$1 */
    /* loaded from: classes10.dex */
    public static final class C153851 extends Lambda implements Function1<LazyListScope, Unit> {
        final /* synthetic */ int $$dirty;
        final /* synthetic */ MutableState<String> $filterText$delegate;
        final /* synthetic */ List<FlpOffer> $filteredMarketingCodes;
        final /* synthetic */ Function1<String, Unit> $onSelect;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C153851(List<FlpOffer> list, Function1<? super String, Unit> function1, int i, MutableState<String> mutableState) {
            super(1);
            this.$filteredMarketingCodes = list;
            this.$onSelect = function1;
            this.$$dirty = i;
            this.$filterText$delegate = mutableState;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(LazyListScope lazyListScope) {
            invoke2(lazyListScope);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull LazyListScope LazyColumn) {
            Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
            List<FlpOffer> list = this.$filteredMarketingCodes;
            LazyColumn.items(list.size(), null, new C15379x6718dc57(list), ComposableLambdaKt.composableLambdaInstance(-1091073711, true, new C15380x6718dc58(list, this.$onSelect, this.$$dirty, list, this.$filterText$delegate)));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C15384xdc925dcd(List<FlpOffer> list, Function1<? super String, Unit> function1, int i, MutableState<String> mutableState) {
        super(3);
        this.$filteredMarketingCodes = list;
        this.$onSelect = function1;
        this.$$dirty = i;
        this.$filterText$delegate = mutableState;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(ColumnScope columnScope, Composer composer, Integer num) {
        invoke(columnScope, composer, num.intValue());
        return Unit.INSTANCE;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void invoke(@NotNull ColumnScope Card, @Nullable Composer composer, int i) {
        Intrinsics.checkNotNullParameter(Card, "$this$Card");
        if ((i & 81) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1773821099, i, -1, "th.co.dtac.android.dtacone.view.appOne.tol.screen.fixedLinePlus.OneRegisterTrueOnlineFlpMarketingCodeScreen.<anonymous>.<anonymous>.<anonymous> (OneRegisterTrueOnlineFlpMarketingCodeScreen.kt:128)");
        }
        LazyDslKt.LazyColumn(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), null, null, false, null, null, null, false, new C153851(this.$filteredMarketingCodes, this.$onSelect, this.$$dirty, this.$filterText$delegate), composer, 6, 254);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}