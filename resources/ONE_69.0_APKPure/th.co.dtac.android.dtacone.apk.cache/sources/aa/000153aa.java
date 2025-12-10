package th.p047co.dtac.android.dtacone.view.fragment.upPass.compose;

import androidx.compose.foundation.layout.FlowRowScope;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.TextKt;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.res.ColorResources_androidKt;
import androidx.compose.p003ui.text.TextLayoutResult;
import androidx.compose.p003ui.text.font.FontFamily;
import androidx.compose.p003ui.text.font.FontStyle;
import androidx.compose.p003ui.text.font.FontWeight;
import androidx.compose.p003ui.text.style.TextAlign;
import androidx.compose.p003ui.text.style.TextDecoration;
import androidx.compose.p003ui.unit.C3623Dp;
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
import th.p047co.dtac.android.dtacone.R;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
@SourceDebugExtension({"SMAP\nSelectOptionsScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SelectOptionsScreen.kt\nth/co/dtac/android/dtacone/view/fragment/upPass/compose/SelectOptionsScreenKt$SelectOcrSection$2\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,620:1\n154#2:621\n*S KotlinDebug\n*F\n+ 1 SelectOptionsScreen.kt\nth/co/dtac/android/dtacone/view/fragment/upPass/compose/SelectOptionsScreenKt$SelectOcrSection$2\n*L\n253#1:621\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.view.fragment.upPass.compose.SelectOptionsScreenKt$SelectOcrSection$2 */
/* loaded from: classes9.dex */
public final class SelectOptionsScreenKt$SelectOcrSection$2 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ List<String> $allowDocumentType;
    final /* synthetic */ int $ocrIndex;
    final /* synthetic */ Function1<List<String>, Unit> $onAllowDocumentTypeChange;
    final /* synthetic */ Function1<Integer, Unit> $onSelectOcr;

    @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    @SourceDebugExtension({"SMAP\nSelectOptionsScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SelectOptionsScreen.kt\nth/co/dtac/android/dtacone/view/fragment/upPass/compose/SelectOptionsScreenKt$SelectOcrSection$2$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,620:1\n1864#2,2:621\n1866#2:631\n50#3:623\n49#3:624\n1097#4,6:625\n*S KotlinDebug\n*F\n+ 1 SelectOptionsScreen.kt\nth/co/dtac/android/dtacone/view/fragment/upPass/compose/SelectOptionsScreenKt$SelectOcrSection$2$1\n*L\n235#1:621,2\n235#1:631\n238#1:623\n238#1:624\n238#1:625,6\n*E\n"})
    /* renamed from: th.co.dtac.android.dtacone.view.fragment.upPass.compose.SelectOptionsScreenKt$SelectOcrSection$2$1 */
    /* loaded from: classes9.dex */
    public static final class C164761 extends Lambda implements Function3<RowScope, Composer, Integer, Unit> {
        final /* synthetic */ int $$dirty;
        final /* synthetic */ int $ocrIndex;
        final /* synthetic */ Function1<Integer, Unit> $onSelectOcr;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C164761(int i, Function1<? super Integer, Unit> function1, int i2) {
            super(3);
            this.$ocrIndex = i;
            this.$onSelectOcr = function1;
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
                ComposerKt.traceEventStart(801428297, i2, -1, "th.co.dtac.android.dtacone.view.fragment.upPass.compose.SelectOcrSection.<anonymous>.<anonymous> (SelectOptionsScreen.kt:233)");
            }
            list = SelectOptionsScreenKt.f105077b;
            int i3 = this.$ocrIndex;
            Function1<Integer, Unit> function1 = this.$onSelectOcr;
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
                    rememberedValue = new SelectOptionsScreenKt$SelectOcrSection$2$1$1$1$1(function1, i4);
                    composer.updateRememberedValue(rememberedValue);
                }
                composer.endReplaceableGroup();
                SelectOptionsScreenKt.m3403m(SelectionButtonRow, z, rememberedValue, ComposableLambdaKt.composableLambda(composer, 134248034, true, new SelectOptionsScreenKt$SelectOcrSection$2$1$1$2(d40)), composer, (i2 & 14) | 3072);
                i4 = i5;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    @SourceDebugExtension({"SMAP\nSelectOptionsScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SelectOptionsScreen.kt\nth/co/dtac/android/dtacone/view/fragment/upPass/compose/SelectOptionsScreenKt$SelectOcrSection$2$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,620:1\n1864#2,3:621\n*S KotlinDebug\n*F\n+ 1 SelectOptionsScreen.kt\nth/co/dtac/android/dtacone/view/fragment/upPass/compose/SelectOptionsScreenKt$SelectOcrSection$2$2\n*L\n256#1:621,3\n*E\n"})
    /* renamed from: th.co.dtac.android.dtacone.view.fragment.upPass.compose.SelectOptionsScreenKt$SelectOcrSection$2$2 */
    /* loaded from: classes9.dex */
    public static final class C164772 extends Lambda implements Function3<FlowRowScope, Composer, Integer, Unit> {
        final /* synthetic */ List<String> $allowDocumentType;
        final /* synthetic */ Function1<List<String>, Unit> $onAllowDocumentTypeChange;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C164772(List<String> list, Function1<? super List<String>, Unit> function1) {
            super(3);
            this.$allowDocumentType = list;
            this.$onAllowDocumentTypeChange = function1;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(FlowRowScope flowRowScope, Composer composer, Integer num) {
            invoke(flowRowScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
        @Composable
        public final void invoke(@NotNull FlowRowScope OptionBooleanFlowRow, @Nullable Composer composer, int i) {
            List list;
            Intrinsics.checkNotNullParameter(OptionBooleanFlowRow, "$this$OptionBooleanFlowRow");
            if ((((i & 14) == 0 ? (composer.changed(OptionBooleanFlowRow) ? 4 : 2) | i : i) & 91) == 18 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1578334882, i, -1, "th.co.dtac.android.dtacone.view.fragment.upPass.compose.SelectOcrSection.<anonymous>.<anonymous> (SelectOptionsScreen.kt:254)");
            }
            list = SelectOptionsScreenKt.f105078c;
            List<String> list2 = this.$allowDocumentType;
            Function1<List<String>, Unit> function1 = this.$onAllowDocumentTypeChange;
            int i2 = 0;
            for (Object obj : list) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    CollectionsKt__CollectionsKt.throwIndexOverflow();
                }
                C17044xJ c17044xJ = (C17044xJ) obj;
                SelectOptionsScreenKt.m3414b(c17044xJ.m565b(), list2 != null && list2.contains(c17044xJ.m566a()), new SelectOptionsScreenKt$SelectOcrSection$2$2$1$1(list2, c17044xJ, function1), AbstractC17608Ez1.m68554a(OptionBooleanFlowRow, Modifier.Companion, 1.0f, false, 2, null), composer, 0, 0);
                list2 = list2;
                function1 = function1;
                i2 = i3;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SelectOptionsScreenKt$SelectOcrSection$2(int i, Function1<? super Integer, Unit> function1, int i2, List<String> list, Function1<? super List<String>, Unit> function12) {
        super(2);
        this.$ocrIndex = i;
        this.$onSelectOcr = function1;
        this.$$dirty = i2;
        this.$allowDocumentType = list;
        this.$onAllowDocumentTypeChange = function12;
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
            ComposerKt.traceEventStart(-53930182, i, -1, "th.co.dtac.android.dtacone.view.fragment.upPass.compose.SelectOcrSection.<anonymous> (SelectOptionsScreen.kt:232)");
        }
        SelectOptionsScreenKt.m3402n(ComposableLambdaKt.composableLambda(composer, 801428297, true, new C164761(this.$ocrIndex, this.$onSelectOcr, this.$$dirty)), composer, 6);
        TextKt.m70882Text4IGK_g("Allow Document Type", PaddingKt.m69713padding3ABfNKs(Modifier.Companion, C3623Dp.m73842constructorimpl(8)), ColorResources_androidKt.colorResource(R.color.greyishBrown, composer, 0), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getLabelLarge(), composer, 54, 0, 65528);
        SelectOptionsScreenKt.m3413c(ComposableLambdaKt.composableLambda(composer, -1578334882, true, new C164772(this.$allowDocumentType, this.$onAllowDocumentTypeChange)), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}