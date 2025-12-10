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
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.fragment.upPass.compose.SelectOptionsScreenKt$SelectFaceCompareSection$1 */
/* loaded from: classes9.dex */
public final class SelectOptionsScreenKt$SelectFaceCompareSection$1 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ int $faceCompareIndex;
    final /* synthetic */ Function1<Integer, Unit> $onSelectFaceCompare;

    @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    @SourceDebugExtension({"SMAP\nSelectOptionsScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SelectOptionsScreen.kt\nth/co/dtac/android/dtacone/view/fragment/upPass/compose/SelectOptionsScreenKt$SelectFaceCompareSection$1$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,620:1\n1864#2,2:621\n1866#2:631\n50#3:623\n49#3:624\n1097#4,6:625\n*S KotlinDebug\n*F\n+ 1 SelectOptionsScreen.kt\nth/co/dtac/android/dtacone/view/fragment/upPass/compose/SelectOptionsScreenKt$SelectFaceCompareSection$1$1\n*L\n298#1:621,2\n298#1:631\n301#1:623\n301#1:624\n301#1:625,6\n*E\n"})
    /* renamed from: th.co.dtac.android.dtacone.view.fragment.upPass.compose.SelectOptionsScreenKt$SelectFaceCompareSection$1$1 */
    /* loaded from: classes9.dex */
    public static final class C164751 extends Lambda implements Function3<RowScope, Composer, Integer, Unit> {
        final /* synthetic */ int $$dirty;
        final /* synthetic */ int $faceCompareIndex;
        final /* synthetic */ Function1<Integer, Unit> $onSelectFaceCompare;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C164751(int i, Function1<? super Integer, Unit> function1, int i2) {
            super(3);
            this.$faceCompareIndex = i;
            this.$onSelectFaceCompare = function1;
            this.$$dirty = i2;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer, Integer num) {
            invoke(rowScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r18v0, types: [androidx.compose.runtime.Composer] */
        /* JADX WARN: Type inference failed for: r6v4 */
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
                ComposerKt.traceEventStart(-296706748, i2, -1, "th.co.dtac.android.dtacone.view.fragment.upPass.compose.SelectFaceCompareSection.<anonymous>.<anonymous> (SelectOptionsScreen.kt:296)");
            }
            list = SelectOptionsScreenKt.f105079d;
            int i3 = this.$faceCompareIndex;
            Function1<Integer, Unit> function1 = this.$onSelectFaceCompare;
            int i4 = 0;
            for (Object obj : list) {
                int i5 = i4 + 1;
                if (i4 < 0) {
                    CollectionsKt__CollectionsKt.throwIndexOverflow();
                }
                D40 d40 = (D40) obj;
                boolean z = i4 == i3;
                Integer valueOf = Integer.valueOf(i4);
                composer.startReplaceableGroup(511388516);
                boolean changed = composer.changed(valueOf) | composer.changed(function1);
                Object rememberedValue = composer.rememberedValue();
                if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                    rememberedValue = new SelectOptionsScreenKt$SelectFaceCompareSection$1$1$1$1$1(function1, i4);
                    composer.updateRememberedValue(rememberedValue);
                }
                composer.endReplaceableGroup();
                SelectOptionsScreenKt.m3403m(SelectionButtonRow, z, rememberedValue, ComposableLambdaKt.composableLambda(composer, 609309771, true, new SelectOptionsScreenKt$SelectFaceCompareSection$1$1$1$2(d40)), composer, (i2 & 14) | 3072);
                i4 = i5;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SelectOptionsScreenKt$SelectFaceCompareSection$1(int i, Function1<? super Integer, Unit> function1, int i2) {
        super(2);
        this.$faceCompareIndex = i;
        this.$onSelectFaceCompare = function1;
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
            ComposerKt.traceEventStart(590182003, i, -1, "th.co.dtac.android.dtacone.view.fragment.upPass.compose.SelectFaceCompareSection.<anonymous> (SelectOptionsScreen.kt:295)");
        }
        SelectOptionsScreenKt.m3402n(ComposableLambdaKt.composableLambda(composer, -296706748, true, new C164751(this.$faceCompareIndex, this.$onSelectFaceCompare, this.$$dirty)), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}