package th.p047co.dtac.android.dtacone.view.compose.upPass.screen;

import androidx.compose.animation.AnimatedContentScope;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p003ui.Modifier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.SharedFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.model.commonError.CommonErrorResponse;
import th.p047co.dtac.android.dtacone.model.mnp.IdCardInformationCollection;
import th.p047co.dtac.android.dtacone.view.compose.upPass.widget.WebViewController;
import th.p047co.dtac.android.dtacone.viewmodel.upPass.state.IdCardReaderState;
import th.p047co.dtac.android.dtacone.viewmodel.upPass.state.UpPassFormState;
import th.p047co.dtac.android.dtacone.widget.compose.smartCard.IdCardReaderInfoKt;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
@SourceDebugExtension({"SMAP\nUpPassFormScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UpPassFormScreen.kt\nth/co/dtac/android/dtacone/view/compose/upPass/screen/UpPassFormScreenKt$UpPassFormScreen$8$2$2\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,605:1\n50#2:606\n49#2:607\n50#2:614\n49#2:615\n36#2:622\n1097#3,6:608\n1097#3,6:616\n1097#3,6:623\n*S KotlinDebug\n*F\n+ 1 UpPassFormScreen.kt\nth/co/dtac/android/dtacone/view/compose/upPass/screen/UpPassFormScreenKt$UpPassFormScreen$8$2$2\n*L\n158#1:606\n158#1:607\n164#1:614\n164#1:615\n170#1:622\n158#1:608,6\n164#1:616,6\n170#1:623,6\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.view.compose.upPass.screen.UpPassFormScreenKt$UpPassFormScreen$8$2$2 */
/* loaded from: classes10.dex */
public final class UpPassFormScreenKt$UpPassFormScreen$8$2$2 extends Lambda implements Function4<AnimatedContentScope, Boolean, Composer, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$dirty;
    final /* synthetic */ int $$dirty1;
    final /* synthetic */ IdCardReaderState $cardReaderState;
    final /* synthetic */ MutableState<CommonErrorResponse> $error$delegate;
    final /* synthetic */ UpPassFormState $formState;
    final /* synthetic */ MutableState<Boolean> $isShowErrorResult$delegate;
    final /* synthetic */ MutableState<Boolean> $isShowErrorUrl$delegate;
    final /* synthetic */ Function1<IdCardInformationCollection, Unit> $onSaveIdCardInfo;
    final /* synthetic */ Function0<Unit> $onStartFetchingCardDataLoop;
    final /* synthetic */ Function0<Unit> $onStopFetchingCardDataLoop;
    final /* synthetic */ Function0<Unit> $onSuccess;
    final /* synthetic */ SharedFlow<IdCardInformationCollection> $onSuccessReadFinish;
    final /* synthetic */ Function0<Unit> $onWebViewFailed;
    final /* synthetic */ Function0<Unit> $onWebViewSuccess;
    final /* synthetic */ ColumnScope $this_Column;
    final /* synthetic */ WebViewController $webCtrl;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public UpPassFormScreenKt$UpPassFormScreen$8$2$2(IdCardReaderState idCardReaderState, Function0<Unit> function0, Function0<Unit> function02, SharedFlow<? extends IdCardInformationCollection> sharedFlow, Function1<? super IdCardInformationCollection, Unit> function1, Function0<Unit> function03, int i, int i2, ColumnScope columnScope, WebViewController webViewController, UpPassFormState upPassFormState, MutableState<Boolean> mutableState, MutableState<CommonErrorResponse> mutableState2, MutableState<Boolean> mutableState3, Function0<Unit> function04, Function0<Unit> function05, int i3) {
        super(4);
        this.$cardReaderState = idCardReaderState;
        this.$onStartFetchingCardDataLoop = function0;
        this.$onStopFetchingCardDataLoop = function02;
        this.$onSuccessReadFinish = sharedFlow;
        this.$onSaveIdCardInfo = function1;
        this.$onSuccess = function03;
        this.$$dirty = i;
        this.$$dirty1 = i2;
        this.$this_Column = columnScope;
        this.$webCtrl = webViewController;
        this.$formState = upPassFormState;
        this.$isShowErrorUrl$delegate = mutableState;
        this.$error$delegate = mutableState2;
        this.$isShowErrorResult$delegate = mutableState3;
        this.$onWebViewSuccess = function04;
        this.$onWebViewFailed = function05;
        this.$$changed = i3;
    }

    @Override // kotlin.jvm.functions.Function4
    public /* bridge */ /* synthetic */ Unit invoke(AnimatedContentScope animatedContentScope, Boolean bool, Composer composer, Integer num) {
        invoke(animatedContentScope, bool.booleanValue(), composer, num.intValue());
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* JADX WARN: Type inference failed for: r15v2 */
    /* JADX WARN: Type inference failed for: r20v0, types: [androidx.compose.runtime.Composer] */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void invoke(@NotNull AnimatedContentScope AnimatedContent, boolean z, @Nullable Composer composer, int i) {
        Intrinsics.checkNotNullParameter(AnimatedContent, "$this$AnimatedContent");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(426371908, i, -1, "th.co.dtac.android.dtacone.view.compose.upPass.screen.UpPassFormScreen.<anonymous>.<anonymous>.<anonymous> (UpPassFormScreen.kt:141)");
        }
        if (z) {
            composer.startReplaceableGroup(-1625867746);
            IdCardReaderState idCardReaderState = this.$cardReaderState;
            Function0<Unit> function0 = this.$onStartFetchingCardDataLoop;
            Function0<Unit> function02 = this.$onStopFetchingCardDataLoop;
            SharedFlow<IdCardInformationCollection> sharedFlow = this.$onSuccessReadFinish;
            Function1<IdCardInformationCollection, Unit> function1 = this.$onSaveIdCardInfo;
            Function0<Unit> function03 = this.$onSuccess;
            Modifier fillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, null);
            int i2 = this.$$dirty;
            int i3 = this.$$dirty1;
            IdCardReaderInfoKt.IdCardReaderInfo(idCardReaderState, function0, function02, sharedFlow, function1, function03, fillMaxSize$default, composer, ((i2 >> 24) & 112) | ((i2 >> 21) & 14) | 1576960 | ((i3 << 6) & 896) | ((i3 << 6) & 57344) | (458752 & (i3 << 3)), 0);
            composer.endReplaceableGroup();
        } else {
            composer.startReplaceableGroup(-1625867175);
            ColumnScope columnScope = this.$this_Column;
            WebViewController webViewController = this.$webCtrl;
            UpPassFormState upPassFormState = this.$formState;
            MutableState<Boolean> mutableState = this.$isShowErrorUrl$delegate;
            MutableState<CommonErrorResponse> mutableState2 = this.$error$delegate;
            composer.startReplaceableGroup(511388516);
            boolean changed = composer.changed(mutableState) | composer.changed(mutableState2);
            Object rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new UpPassFormScreenKt$UpPassFormScreen$8$2$2$1$1(mutableState, mutableState2);
                composer.updateRememberedValue(rememberedValue);
            }
            composer.endReplaceableGroup();
            Function1 function12 = rememberedValue;
            MutableState<Boolean> mutableState3 = this.$isShowErrorResult$delegate;
            MutableState<CommonErrorResponse> mutableState4 = this.$error$delegate;
            composer.startReplaceableGroup(511388516);
            boolean changed2 = composer.changed(mutableState3) | composer.changed(mutableState4);
            Object rememberedValue2 = composer.rememberedValue();
            if (changed2 || rememberedValue2 == Composer.Companion.getEmpty()) {
                rememberedValue2 = new UpPassFormScreenKt$UpPassFormScreen$8$2$2$2$1(mutableState3, mutableState4);
                composer.updateRememberedValue(rememberedValue2);
            }
            composer.endReplaceableGroup();
            Function1 function13 = rememberedValue2;
            Function0<Unit> function04 = this.$onWebViewSuccess;
            Function0<Unit> function05 = this.$onWebViewFailed;
            Function0<Unit> function06 = this.$onSuccess;
            composer.startReplaceableGroup(1157296644);
            boolean changed3 = composer.changed(function06);
            Object rememberedValue3 = composer.rememberedValue();
            if (changed3 || rememberedValue3 == Composer.Companion.getEmpty()) {
                rememberedValue3 = new UpPassFormScreenKt$UpPassFormScreen$8$2$2$3$1(function06);
                composer.updateRememberedValue(rememberedValue3);
            }
            composer.endReplaceableGroup();
            Modifier fillMaxSize$default2 = SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, null);
            int i4 = this.$$dirty;
            UpPassFormScreenKt.m9155D(columnScope, webViewController, upPassFormState, function12, function13, function04, function05, rememberedValue3, fillMaxSize$default2, composer, (458752 & (i4 << 6)) | (this.$$changed & 14) | 100663360 | ((i4 << 3) & 896) | (3670016 & (i4 << 6)), 0);
            composer.endReplaceableGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}