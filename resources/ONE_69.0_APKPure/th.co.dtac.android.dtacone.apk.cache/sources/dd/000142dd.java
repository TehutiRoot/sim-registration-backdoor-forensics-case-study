package th.p047co.dtac.android.dtacone.view.appOne.tol.screen.inputIdCard;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.pager.PagerScope;
import androidx.compose.p003ui.Alignment;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.focus.FocusRequester;
import androidx.compose.p003ui.focus.FocusRequesterModifierKt;
import androidx.compose.p003ui.graphics.Shadow;
import androidx.compose.p003ui.graphics.drawscope.DrawStyle;
import androidx.compose.p003ui.layout.LayoutKt;
import androidx.compose.p003ui.layout.MeasurePolicy;
import androidx.compose.p003ui.node.ComposeUiNode;
import androidx.compose.p003ui.res.ColorResources_androidKt;
import androidx.compose.p003ui.res.StringResources_androidKt;
import androidx.compose.p003ui.text.PlatformTextStyle;
import androidx.compose.p003ui.text.TextStyle;
import androidx.compose.p003ui.text.font.FontFamily;
import androidx.compose.p003ui.text.font.FontStyle;
import androidx.compose.p003ui.text.font.FontSynthesis;
import androidx.compose.p003ui.text.font.FontWeight;
import androidx.compose.p003ui.text.intl.LocaleList;
import androidx.compose.p003ui.text.style.BaselineShift;
import androidx.compose.p003ui.text.style.Hyphens;
import androidx.compose.p003ui.text.style.LineBreak;
import androidx.compose.p003ui.text.style.LineHeightStyle;
import androidx.compose.p003ui.text.style.TextAlign;
import androidx.compose.p003ui.text.style.TextDecoration;
import androidx.compose.p003ui.text.style.TextDirection;
import androidx.compose.p003ui.text.style.TextGeometricTransform;
import androidx.compose.p003ui.text.style.TextIndent;
import androidx.compose.p003ui.text.style.TextMotion;
import androidx.compose.p003ui.unit.TextUnitKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.app_one.util.theme.compose.TypeKt;
import th.p047co.dtac.android.dtacone.app_one.widget.composable.OneRoundedCornerCheckBoxKt;
import th.p047co.dtac.android.dtacone.view.appOne.tol.model.IdCardDataItem;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
@SourceDebugExtension({"SMAP\nInputIdCardScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InputIdCardScreen.kt\nth/co/dtac/android/dtacone/view/appOne/tol/screen/inputIdCard/InputIdCardScreenKt$InputIdForms$2$4\n+ 2 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,360:1\n71#2,7:361\n78#2:396\n82#2:401\n78#3,11:368\n91#3:400\n456#4,8:379\n464#4,3:393\n467#4,3:397\n4144#5,6:387\n*S KotlinDebug\n*F\n+ 1 InputIdCardScreen.kt\nth/co/dtac/android/dtacone/view/appOne/tol/screen/inputIdCard/InputIdCardScreenKt$InputIdForms$2$4\n*L\n218#1:361,7\n218#1:396\n218#1:401\n218#1:368,11\n218#1:400\n218#1:379,8\n218#1:393,3\n218#1:397,3\n218#1:387,6\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.screen.inputIdCard.InputIdCardScreenKt$InputIdForms$2$4 */
/* loaded from: classes10.dex */
public final class InputIdCardScreenKt$InputIdForms$2$4 extends Lambda implements Function4<PagerScope, Integer, Composer, Integer, Unit> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ List<IdCardDataItem> $displayIdCardTypeList;
    final /* synthetic */ List<FocusRequester> $focusRequesterList;
    final /* synthetic */ List<String> $idCardList;
    final /* synthetic */ List<Boolean> $isCheckedExpireList;
    final /* synthetic */ Function1<Boolean, Unit> $onCheckedExpiredChange;
    final /* synthetic */ Function1<String, Unit> $onIdValueChange;
    final /* synthetic */ Function0<Unit> $onValidateInput;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public InputIdCardScreenKt$InputIdForms$2$4(List<String> list, List<IdCardDataItem> list2, List<Boolean> list3, List<FocusRequester> list4, Function1<? super String, Unit> function1, Function0<Unit> function0, int i, Function1<? super Boolean, Unit> function12) {
        super(4);
        this.$idCardList = list;
        this.$displayIdCardTypeList = list2;
        this.$isCheckedExpireList = list3;
        this.$focusRequesterList = list4;
        this.$onIdValueChange = function1;
        this.$onValidateInput = function0;
        this.$$dirty = i;
        this.$onCheckedExpiredChange = function12;
    }

    @Override // kotlin.jvm.functions.Function4
    public /* bridge */ /* synthetic */ Unit invoke(PagerScope pagerScope, Integer num, Composer composer, Integer num2) {
        invoke(pagerScope, num.intValue(), composer, num2.intValue());
        return Unit.INSTANCE;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void invoke(@NotNull PagerScope HorizontalPager, int i, @Nullable Composer composer, int i2) {
        Intrinsics.checkNotNullParameter(HorizontalPager, "$this$HorizontalPager");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1424610431, i2, -1, "th.co.dtac.android.dtacone.view.appOne.tol.screen.inputIdCard.InputIdForms.<anonymous>.<anonymous> (InputIdCardScreen.kt:216)");
        }
        List<String> list = this.$idCardList;
        List<IdCardDataItem> list2 = this.$displayIdCardTypeList;
        List<Boolean> list3 = this.$isCheckedExpireList;
        List<FocusRequester> list4 = this.$focusRequesterList;
        Function1<String, Unit> function1 = this.$onIdValueChange;
        Function0<Unit> function0 = this.$onValidateInput;
        int i3 = this.$$dirty;
        Function1<Boolean, Unit> function12 = this.$onCheckedExpiredChange;
        composer.startReplaceableGroup(-483455358);
        Modifier.Companion companion = Modifier.Companion;
        MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composer, 0);
        composer.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
        Function0<ComposeUiNode> constructor = companion2.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(companion);
        if (!(composer.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composer.startReusableNode();
        if (composer.getInserting()) {
            composer.createNode(constructor);
        } else {
            composer.useNode();
        }
        Composer m71577constructorimpl = Updater.m71577constructorimpl(composer);
        Updater.m71584setimpl(m71577constructorimpl, columnMeasurePolicy, companion2.getSetMeasurePolicy());
        Updater.m71584setimpl(m71577constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
        if (m71577constructorimpl.getInserting() || !Intrinsics.areEqual(m71577constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            m71577constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m71577constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        modifierMaterializerOf.invoke(SkippableUpdater.m71568boximpl(SkippableUpdater.m71569constructorimpl(composer)), composer, 0);
        composer.startReplaceableGroup(2058660585);
        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
        String str = list.get(i);
        boolean booleanValue = list3.get(i).booleanValue();
        Modifier focusRequester = FocusRequesterModifierKt.focusRequester(companion, list4.get(i));
        if (list2.get(i).isNumber()) {
            composer.startReplaceableGroup(-1113401141);
            InputIdCardScreenKt.m9532d(str, function1, function0, focusRequester, composer, ((i3 >> 12) & 112) | ((i3 >> 15) & 896), 0);
            composer.endReplaceableGroup();
        } else {
            composer.startReplaceableGroup(-1113401018);
            InputIdCardScreenKt.m9531e(str, function1, function0, focusRequester, composer, ((i3 >> 12) & 112) | ((i3 >> 15) & 896), 0);
            composer.endReplaceableGroup();
        }
        String stringResource = StringResources_androidKt.stringResource(R.string.postpaid_registration_manual_id_card_checkbox, composer, 0);
        long colorResource = ColorResources_androidKt.colorResource(R.color.red5, composer, 0);
        long colorResource2 = ColorResources_androidKt.colorResource(R.color.warmGray, composer, 0);
        long sp = TextUnitKt.getSp(14);
        long sp2 = TextUnitKt.getSp(22);
        FontFamily betterTogetherFont = TypeKt.getBetterTogetherFont();
        OneRoundedCornerCheckBoxKt.m75132OneRoundedCornerCheckBox7gqYH70(stringResource, booleanValue, function12, null, 0.0f, 0.0f, colorResource, 0.0f, 0L, colorResource2, new TextStyle(ColorResources_androidKt.colorResource(R.color.jet_back, composer, 0), sp, FontWeight.Companion.getNormal(), (FontStyle) null, (FontSynthesis) null, betterTogetherFont, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, (TextAlign) null, (TextDirection) null, sp2, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, (TextMotion) null, 16646104, (DefaultConstructorMarker) null), 0.0f, composer, (i3 >> 12) & 896, 0, 2488);
        composer.endReplaceableGroup();
        composer.endNode();
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}