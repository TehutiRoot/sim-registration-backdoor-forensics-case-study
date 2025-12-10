package th.p047co.dtac.android.dtacone.view.appOne.eSign.screen;

import androidx.compose.animation.AnimatedContentScope;
import androidx.compose.p003ui.graphics.ImageBitmap;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavController;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.app_one.util.theme.compose.CompanyThemes;
import th.p047co.dtac.android.dtacone.model.commonError.CommonErrorResponse;
import th.p047co.dtac.android.dtacone.view.appOne.eSign.model.DocumentType;
import th.p047co.dtac.android.dtacone.view.appOne.eSign.model.ValidateDocApproved;
import th.p047co.dtac.android.dtacone.view.appOne.eSign.state.OneBlackListState;
import th.p047co.dtac.android.dtacone.view.appOne.eSign.viewModel.OneConsentAndESignViewModel;
import th.p047co.dtac.android.dtacone.view.appOne.tol.util.BitmapHelperKt;
import th.p047co.dtac.android.dtacone.widget.compose.common.OneDialogKt;
import th.p047co.dtac.android.dtacone.widget.compose.signature.SignaturePageScreenKt;

@Metadata(m29143d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u000b¢\u0006\u0004\b\u0005\u0010\u0006"}, m29142d2 = {"<anonymous>", "", "Landroidx/compose/animation/AnimatedContentScope;", "it", "Landroidx/navigation/NavBackStackEntry;", "invoke", "(Landroidx/compose/animation/AnimatedContentScope;Landroidx/navigation/NavBackStackEntry;Landroidx/compose/runtime/Composer;I)V"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
@SourceDebugExtension({"SMAP\nOneConsentAndESignNavGraph.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OneConsentAndESignNavGraph.kt\nth/co/dtac/android/dtacone/view/appOne/eSign/screen/OneConsentAndESignNavGraphKt$oneESignNavGraph$1$5\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,755:1\n36#2:756\n36#2:763\n1097#3,6:757\n1097#3,6:764\n81#4:770\n81#4:771\n*S KotlinDebug\n*F\n+ 1 OneConsentAndESignNavGraph.kt\nth/co/dtac/android/dtacone/view/appOne/eSign/screen/OneConsentAndESignNavGraphKt$oneESignNavGraph$1$5\n*L\n228#1:756\n249#1:763\n228#1:757,6\n249#1:764,6\n157#1:770\n158#1:771\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.view.appOne.eSign.screen.OneConsentAndESignNavGraphKt$oneESignNavGraph$1$5 */
/* loaded from: classes10.dex */
public final class OneConsentAndESignNavGraphKt$oneESignNavGraph$1$5 extends Lambda implements Function4<AnimatedContentScope, NavBackStackEntry, Composer, Integer, Unit> {
    final /* synthetic */ NavController $navController;
    final /* synthetic */ Function0<Unit> $onOptionTakeMorePhoto;
    final /* synthetic */ Function1<Boolean, Unit> $onSecureFragmentVisible;
    final /* synthetic */ MutableState<Boolean> $previewPdf;
    final /* synthetic */ CoroutineScope $scope;
    final /* synthetic */ ValidateDocApproved $validateDocApproved;
    final /* synthetic */ OneConsentAndESignViewModel $viewModel;

    @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    @DebugMetadata(m29093c = "th.co.dtac.android.dtacone.view.appOne.eSign.screen.OneConsentAndESignNavGraphKt$oneESignNavGraph$1$5$1", m29092f = "OneConsentAndESignNavGraph.kt", m29091i = {}, m29090l = {}, m29089m = "invokeSuspend", m29088n = {}, m29087s = {})
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.eSign.screen.OneConsentAndESignNavGraphKt$oneESignNavGraph$1$5$1 */
    /* loaded from: classes10.dex */
    public static final class C146781 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ State<OneBlackListState> $blackListTemplateState$delegate;
        final /* synthetic */ Function1<Boolean, Unit> $onSecureFragmentVisible;
        final /* synthetic */ OneConsentAndESignViewModel $viewModel;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C146781(OneConsentAndESignViewModel oneConsentAndESignViewModel, Function1<? super Boolean, Unit> function1, State<? extends OneBlackListState> state, Continuation<? super C146781> continuation) {
            super(2, continuation);
            this.$viewModel = oneConsentAndESignViewModel;
            this.$onSecureFragmentVisible = function1;
            this.$blackListTemplateState$delegate = state;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new C146781(this.$viewModel, this.$onSecureFragmentVisible, this.$blackListTemplateState$delegate, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            AbstractC19782eg0.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                if (OneConsentAndESignNavGraphKt$oneESignNavGraph$1$5.invoke$lambda$0(this.$blackListTemplateState$delegate) instanceof OneBlackListState.Initial) {
                    this.$viewModel.blackListConsent();
                    this.$onSecureFragmentVisible.invoke(Boxing.boxBoolean(true));
                }
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C146781) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.eSign.screen.OneConsentAndESignNavGraphKt$oneESignNavGraph$1$5$2 */
    /* loaded from: classes10.dex */
    public static final class C146792 extends Lambda implements Function1<ImageBitmap, Unit> {
        final /* synthetic */ NavController $navController;
        final /* synthetic */ Function0<Unit> $onOptionTakeMorePhoto;
        final /* synthetic */ Function1<Boolean, Unit> $onSecureFragmentVisible;
        final /* synthetic */ CoroutineScope $scope;
        final /* synthetic */ ValidateDocApproved $validateDocApproved;
        final /* synthetic */ OneConsentAndESignViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C146792(OneConsentAndESignViewModel oneConsentAndESignViewModel, Function1<? super Boolean, Unit> function1, ValidateDocApproved validateDocApproved, NavController navController, CoroutineScope coroutineScope, Function0<Unit> function0) {
            super(1);
            this.$viewModel = oneConsentAndESignViewModel;
            this.$onSecureFragmentVisible = function1;
            this.$validateDocApproved = validateDocApproved;
            this.$navController = navController;
            this.$scope = coroutineScope;
            this.$onOptionTakeMorePhoto = function0;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(ImageBitmap imageBitmap) {
            invoke2(imageBitmap);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(@Nullable ImageBitmap imageBitmap) {
            if (imageBitmap != null) {
                OneConsentAndESignViewModel oneConsentAndESignViewModel = this.$viewModel;
                Function1<Boolean, Unit> function1 = this.$onSecureFragmentVisible;
                ValidateDocApproved validateDocApproved = this.$validateDocApproved;
                NavController navController = this.$navController;
                CoroutineScope coroutineScope = this.$scope;
                Function0<Unit> function0 = this.$onOptionTakeMorePhoto;
                oneConsentAndESignViewModel.setSignature(BitmapHelperKt.toBase64(imageBitmap));
                oneConsentAndESignViewModel.updateValidateDocApproved(DocumentType.BLACKLIST.getDocType(), true);
                function1.invoke(Boolean.FALSE);
                if (validateDocApproved.isAllDocumentApproved()) {
                    oneConsentAndESignViewModel.updateForms();
                } else {
                    OneConsentAndESignNavGraphKt.navigateNextDocumentToApprove(validateDocApproved, navController, coroutineScope, function0);
                }
            }
        }
    }

    @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.eSign.screen.OneConsentAndESignNavGraphKt$oneESignNavGraph$1$5$3 */
    /* loaded from: classes10.dex */
    public static final class C146803 extends Lambda implements Function0<Unit> {
        final /* synthetic */ NavController $navController;
        final /* synthetic */ Function1<Boolean, Unit> $onSecureFragmentVisible;
        final /* synthetic */ MutableState<Boolean> $previewPdf;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C146803(MutableState<Boolean> mutableState, Function1<? super Boolean, Unit> function1, NavController navController) {
            super(0);
            this.$previewPdf = mutableState;
            this.$onSecureFragmentVisible = function1;
            this.$navController = navController;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            if (this.$previewPdf.getValue().booleanValue()) {
                this.$previewPdf.setValue(Boolean.FALSE);
                return;
            }
            this.$onSecureFragmentVisible.invoke(Boolean.FALSE);
            this.$navController.navigateUp();
        }
    }

    @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.eSign.screen.OneConsentAndESignNavGraphKt$oneESignNavGraph$1$5$4 */
    /* loaded from: classes10.dex */
    public static final class C146814 extends Lambda implements Function0<Unit> {
        final /* synthetic */ OneConsentAndESignViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C146814(OneConsentAndESignViewModel oneConsentAndESignViewModel) {
            super(0);
            this.$viewModel = oneConsentAndESignViewModel;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.$viewModel.setClearBlackListState();
        }
    }

    @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.eSign.screen.OneConsentAndESignNavGraphKt$oneESignNavGraph$1$5$6 */
    /* loaded from: classes10.dex */
    public static final class C146826 extends Lambda implements Function0<Unit> {
        final /* synthetic */ NavController $navController;
        final /* synthetic */ Function1<Boolean, Unit> $onSecureFragmentVisible;
        final /* synthetic */ MutableState<Boolean> $previewPdf;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C146826(Function1<? super Boolean, Unit> function1, MutableState<Boolean> mutableState, NavController navController) {
            super(0);
            this.$onSecureFragmentVisible = function1;
            this.$previewPdf = mutableState;
            this.$navController = navController;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            Function1<Boolean, Unit> function1 = this.$onSecureFragmentVisible;
            Boolean bool = Boolean.FALSE;
            function1.invoke(bool);
            if (this.$previewPdf.getValue().booleanValue()) {
                this.$previewPdf.setValue(bool);
            } else {
                this.$navController.navigateUp();
            }
        }
    }

    @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.eSign.screen.OneConsentAndESignNavGraphKt$oneESignNavGraph$1$5$8 */
    /* loaded from: classes10.dex */
    public static final class C146838 extends Lambda implements Function0<Unit> {
        final /* synthetic */ NavController $navController;
        final /* synthetic */ Function1<Boolean, Unit> $onSecureFragmentVisible;
        final /* synthetic */ MutableState<Boolean> $previewPdf;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C146838(MutableState<Boolean> mutableState, Function1<? super Boolean, Unit> function1, NavController navController) {
            super(0);
            this.$previewPdf = mutableState;
            this.$onSecureFragmentVisible = function1;
            this.$navController = navController;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            if (this.$previewPdf.getValue().booleanValue()) {
                this.$previewPdf.setValue(Boolean.FALSE);
                return;
            }
            this.$onSecureFragmentVisible.invoke(Boolean.FALSE);
            this.$navController.navigateUp();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public OneConsentAndESignNavGraphKt$oneESignNavGraph$1$5(OneConsentAndESignViewModel oneConsentAndESignViewModel, MutableState<Boolean> mutableState, Function1<? super Boolean, Unit> function1, ValidateDocApproved validateDocApproved, NavController navController, CoroutineScope coroutineScope, Function0<Unit> function0) {
        super(4);
        this.$viewModel = oneConsentAndESignViewModel;
        this.$previewPdf = mutableState;
        this.$onSecureFragmentVisible = function1;
        this.$validateDocApproved = validateDocApproved;
        this.$navController = navController;
        this.$scope = coroutineScope;
        this.$onOptionTakeMorePhoto = function0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OneBlackListState invoke$lambda$0(State<? extends OneBlackListState> state) {
        return state.getValue();
    }

    private static final CompanyThemes invoke$lambda$1(State<? extends CompanyThemes> state) {
        return state.getValue();
    }

    @Override // kotlin.jvm.functions.Function4
    public /* bridge */ /* synthetic */ Unit invoke(AnimatedContentScope animatedContentScope, NavBackStackEntry navBackStackEntry, Composer composer, Integer num) {
        invoke(animatedContentScope, navBackStackEntry, composer, num.intValue());
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r22v0, types: [androidx.compose.runtime.Composer] */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v6 */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void invoke(@NotNull AnimatedContentScope composable, @NotNull NavBackStackEntry it, @Nullable Composer composer, int i) {
        Intrinsics.checkNotNullParameter(composable, "$this$composable");
        Intrinsics.checkNotNullParameter(it, "it");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1057113290, i, -1, "th.co.dtac.android.dtacone.view.appOne.eSign.screen.oneESignNavGraph.<anonymous>.<anonymous> (OneConsentAndESignNavGraph.kt:154)");
        }
        State collectAsState = SnapshotStateKt.collectAsState(this.$viewModel.getBlackListTemplateState(), null, composer, 8, 1);
        State collectAsState2 = SnapshotStateKt.collectAsState(this.$viewModel.getCompanyThemesState(), null, composer, 8, 1);
        EffectsKt.LaunchedEffect(Unit.INSTANCE, new C146781(this.$viewModel, this.$onSecureFragmentVisible, collectAsState, null), (Composer) composer, 70);
        OneBlackListState invoke$lambda$0 = invoke$lambda$0(collectAsState);
        if (invoke$lambda$0 instanceof OneBlackListState.Success) {
            composer.startReplaceableGroup(1033434178);
            OneBlackListState invoke$lambda$02 = invoke$lambda$0(collectAsState);
            Intrinsics.checkNotNull(invoke$lambda$02, "null cannot be cast to non-null type th.co.dtac.android.dtacone.view.appOne.eSign.state.OneBlackListState.Success");
            String data = ((OneBlackListState.Success) invoke$lambda$02).getData();
            int i2 = R.string.one_signature_bl_error;
            SignaturePageScreenKt.SignaturePageScreen(data, new C146792(this.$viewModel, this.$onSecureFragmentVisible, this.$validateDocApproved, this.$navController, this.$scope, this.$onOptionTakeMorePhoto), new C146803(this.$previewPdf, this.$onSecureFragmentVisible, this.$navController), this.$previewPdf, invoke$lambda$1(collectAsState2), i2, i2, composer, 0, 0);
            composer.endReplaceableGroup();
        } else if (invoke$lambda$0 instanceof OneBlackListState.Loading) {
            composer.startReplaceableGroup(1033436074);
            OneDialogKt.OneDialogLoading(null, null, null, composer, 0, 7);
            composer.endReplaceableGroup();
        } else if (invoke$lambda$0 instanceof OneBlackListState.Error) {
            composer.startReplaceableGroup(1033436180);
            OneBlackListState invoke$lambda$03 = invoke$lambda$0(collectAsState);
            Intrinsics.checkNotNull(invoke$lambda$03, "null cannot be cast to non-null type th.co.dtac.android.dtacone.view.appOne.eSign.state.OneBlackListState.Error");
            CommonErrorResponse error = ((OneBlackListState.Error) invoke$lambda$03).getError();
            OneDialogKt.OneDialogError(error.getDesc(), error.getUserId(), error.getCode(), error.getSystemMessage(), new C146814(this.$viewModel), error.getResponseDateTime(), 0, composer, 0, 64);
            int i3 = R.string.one_signature_bl_error;
            CompanyThemes invoke$lambda$1 = invoke$lambda$1(collectAsState2);
            Function1<Boolean, Unit> function1 = this.$onSecureFragmentVisible;
            composer.startReplaceableGroup(1157296644);
            boolean changed = composer.changed(function1);
            Object rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new OneConsentAndESignNavGraphKt$oneESignNavGraph$1$5$5$1(function1);
                composer.updateRememberedValue(rememberedValue);
            }
            composer.endReplaceableGroup();
            SignaturePageScreenKt.SignaturePageScreen("", rememberedValue, new C146826(this.$onSecureFragmentVisible, this.$previewPdf, this.$navController), this.$previewPdf, invoke$lambda$1, i3, i3, composer, 6, 0);
            composer.endReplaceableGroup();
        } else {
            composer.startReplaceableGroup(1033437531);
            int i4 = R.string.one_signature_bl_error;
            CompanyThemes invoke$lambda$12 = invoke$lambda$1(collectAsState2);
            Function1<Boolean, Unit> function12 = this.$onSecureFragmentVisible;
            composer.startReplaceableGroup(1157296644);
            boolean changed2 = composer.changed(function12);
            Object rememberedValue2 = composer.rememberedValue();
            if (changed2 || rememberedValue2 == Composer.Companion.getEmpty()) {
                rememberedValue2 = new OneConsentAndESignNavGraphKt$oneESignNavGraph$1$5$7$1(function12);
                composer.updateRememberedValue(rememberedValue2);
            }
            composer.endReplaceableGroup();
            SignaturePageScreenKt.SignaturePageScreen("", rememberedValue2, new C146838(this.$previewPdf, this.$onSecureFragmentVisible, this.$navController), this.$previewPdf, invoke$lambda$12, i4, i4, composer, 6, 0);
            composer.endReplaceableGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}