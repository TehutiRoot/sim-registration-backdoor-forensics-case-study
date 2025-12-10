package th.p047co.dtac.android.dtacone.view.fragment.upPass.compose;

import androidx.compose.foundation.layout.RowScope;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.fragment.upPass.compose.SelectOptionsScreenKt$SelectThemeSection$1 */
/* loaded from: classes9.dex */
public final class SelectOptionsScreenKt$SelectThemeSection$1 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ Function1<Integer, Unit> $onSelectTheme;
    final /* synthetic */ int $themeIndex;

    @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    @SourceDebugExtension({"SMAP\nSelectOptionsScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SelectOptionsScreen.kt\nth/co/dtac/android/dtacone/view/fragment/upPass/compose/SelectOptionsScreenKt$SelectThemeSection$1$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,620:1\n1864#2,2:621\n1866#2:631\n50#3:623\n49#3:624\n1097#4,6:625\n*S KotlinDebug\n*F\n+ 1 SelectOptionsScreen.kt\nth/co/dtac/android/dtacone/view/fragment/upPass/compose/SelectOptionsScreenKt$SelectThemeSection$1$1\n*L\n172#1:621,2\n172#1:631\n177#1:623\n177#1:624\n177#1:625,6\n*E\n"})
    /* renamed from: th.co.dtac.android.dtacone.view.fragment.upPass.compose.SelectOptionsScreenKt$SelectThemeSection$1$1 */
    /* loaded from: classes9.dex */
    public static final class C164781 extends Lambda implements Function3<RowScope, Composer, Integer, Unit> {
        final /* synthetic */ int $$dirty;
        final /* synthetic */ Function1<Integer, Unit> $onSelectTheme;
        final /* synthetic */ int $themeIndex;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C164781(int i, Function1<? super Integer, Unit> function1, int i2) {
            super(3);
            this.$themeIndex = i;
            this.$onSelectTheme = function1;
            this.$$dirty = i2;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer, Integer num) {
            invoke(rowScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
        @Composable
        public final void invoke(@NotNull RowScope SelectionButtonRow, @Nullable Composer composer, int i) {
            List list;
            Intrinsics.checkNotNullParameter(SelectionButtonRow, "$this$SelectionButtonRow");
            int i2 = (i & 14) == 0 ? i | (composer.changed(SelectionButtonRow) ? 4 : 2) : i;
            if ((i2 & 91) == 18 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(258716997, i2, -1, "th.co.dtac.android.dtacone.view.fragment.upPass.compose.SelectThemeSection.<anonymous>.<anonymous> (SelectOptionsScreen.kt:170)");
            }
            list = SelectOptionsScreenKt.f105076a;
            int i3 = this.$themeIndex;
            Function1<Integer, Unit> function1 = this.$onSelectTheme;
            int i4 = 0;
            for (Object obj : list) {
                int i5 = i4 + 1;
                if (i4 < 0) {
                    CollectionsKt__CollectionsKt.throwIndexOverflow();
                }
                HT1 ht1 = (HT1) obj;
                String m68111b = ht1.m68111b();
                List m68112a = ht1.m68112a();
                boolean z = i4 == i3;
                Object valueOf = Integer.valueOf(i4);
                composer.startReplaceableGroup(511388516);
                boolean changed = composer.changed(valueOf) | composer.changed(function1);
                Object rememberedValue = composer.rememberedValue();
                if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                    rememberedValue = new SelectOptionsScreenKt$SelectThemeSection$1$1$1$1$1(function1, i4);
                    composer.updateRememberedValue(rememberedValue);
                }
                composer.endReplaceableGroup();
                SelectOptionsScreenKt.m3401o(SelectionButtonRow, m68111b, m68112a, z, (Function0) rememberedValue, composer, (i2 & 14) | 512);
                i4 = i5;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SelectOptionsScreenKt$SelectThemeSection$1(int i, Function1<? super Integer, Unit> function1, int i2) {
        super(2);
        this.$themeIndex = i;
        this.$onSelectTheme = function1;
        this.$$dirty = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void invoke(@Nullable Composer composer, int i) {
        if ((i & 11) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2087902644, i, -1, "th.co.dtac.android.dtacone.view.fragment.upPass.compose.SelectThemeSection.<anonymous> (SelectOptionsScreen.kt:169)");
        }
        SelectOptionsScreenKt.m3402n(ComposableLambdaKt.composableLambda(composer, 258716997, true, new C164781(this.$themeIndex, this.$onSelectTheme, this.$$dirty)), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}