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
import th.p047co.dtac.android.dtacone.app_one.util.theme.compose.CompanyThemes;
import th.p047co.dtac.android.dtacone.model.appOne.postpaid.forms.DataForm;
import th.p047co.dtac.android.dtacone.model.commonError.CommonErrorResponse;
import th.p047co.dtac.android.dtacone.view.appOne.common.composable.StringHelperKt;
import th.p047co.dtac.android.dtacone.view.appOne.eSign.model.DocumentType;
import th.p047co.dtac.android.dtacone.view.appOne.eSign.model.OneOrderInfoModel;
import th.p047co.dtac.android.dtacone.view.appOne.eSign.model.ValidateDocApproved;
import th.p047co.dtac.android.dtacone.view.appOne.eSign.state.OneGetFormsState;
import th.p047co.dtac.android.dtacone.view.appOne.eSign.viewModel.OneConsentAndESignViewModel;
import th.p047co.dtac.android.dtacone.view.appOne.tol.util.BitmapHelperKt;
import th.p047co.dtac.android.dtacone.widget.compose.common.OneDialogKt;
import th.p047co.dtac.android.dtacone.widget.compose.signature.SignaturePageScreenKt;

@Metadata(m29143d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u000b¢\u0006\u0004\b\u0005\u0010\u0006"}, m29142d2 = {"<anonymous>", "", "Landroidx/compose/animation/AnimatedContentScope;", "it", "Landroidx/navigation/NavBackStackEntry;", "invoke", "(Landroidx/compose/animation/AnimatedContentScope;Landroidx/navigation/NavBackStackEntry;Landroidx/compose/runtime/Composer;I)V"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
@SourceDebugExtension({"SMAP\nOneConsentAndESignNavGraph.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OneConsentAndESignNavGraph.kt\nth/co/dtac/android/dtacone/view/appOne/eSign/screen/OneConsentAndESignNavGraphKt$oneESignNavGraph$1$6\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,755:1\n81#2:756\n81#2:757\n81#2:758\n*S KotlinDebug\n*F\n+ 1 OneConsentAndESignNavGraph.kt\nth/co/dtac/android/dtacone/view/appOne/eSign/screen/OneConsentAndESignNavGraphKt$oneESignNavGraph$1$6\n*L\n271#1:756\n272#1:757\n273#1:758\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.view.appOne.eSign.screen.OneConsentAndESignNavGraphKt$oneESignNavGraph$1$6 */
/* loaded from: classes10.dex */
public final class OneConsentAndESignNavGraphKt$oneESignNavGraph$1$6 extends Lambda implements Function4<AnimatedContentScope, NavBackStackEntry, Composer, Integer, Unit> {
    final /* synthetic */ NavController $navController;
    final /* synthetic */ Function0<Unit> $onOptionTakeMorePhoto;
    final /* synthetic */ Function1<Boolean, Unit> $onSecureFragmentVisible;
    final /* synthetic */ MutableState<Boolean> $previewPdf;
    final /* synthetic */ CoroutineScope $scope;
    final /* synthetic */ ValidateDocApproved $validateDocApproved;
    final /* synthetic */ OneConsentAndESignViewModel $viewModel;

    @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    @DebugMetadata(m29093c = "th.co.dtac.android.dtacone.view.appOne.eSign.screen.OneConsentAndESignNavGraphKt$oneESignNavGraph$1$6$1", m29092f = "OneConsentAndESignNavGraph.kt", m29091i = {}, m29090l = {}, m29089m = "invokeSuspend", m29088n = {}, m29087s = {})
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.eSign.screen.OneConsentAndESignNavGraphKt$oneESignNavGraph$1$6$1 */
    /* loaded from: classes10.dex */
    public static final class C146841 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ State<CompanyThemes> $companyThemes$delegate;
        final /* synthetic */ State<OneGetFormsState> $getFormState$delegate;
        final /* synthetic */ Function1<Boolean, Unit> $onSecureFragmentVisible;
        final /* synthetic */ OneConsentAndESignViewModel $viewModel;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C146841(Function1<? super Boolean, Unit> function1, OneConsentAndESignViewModel oneConsentAndESignViewModel, State<? extends CompanyThemes> state, State<? extends OneGetFormsState> state2, Continuation<? super C146841> continuation) {
            super(2, continuation);
            this.$onSecureFragmentVisible = function1;
            this.$viewModel = oneConsentAndESignViewModel;
            this.$companyThemes$delegate = state;
            this.$getFormState$delegate = state2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new C146841(this.$onSecureFragmentVisible, this.$viewModel, this.$companyThemes$delegate, this.$getFormState$delegate, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            AbstractC19782eg0.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                if (OneConsentAndESignNavGraphKt$oneESignNavGraph$1$6.invoke$lambda$2(this.$companyThemes$delegate) == CompanyThemes.ONE_TRUE) {
                    if (OneConsentAndESignNavGraphKt$oneESignNavGraph$1$6.invoke$lambda$0(this.$getFormState$delegate) instanceof OneGetFormsState.Initial) {
                        this.$onSecureFragmentVisible.invoke(Boxing.boxBoolean(true));
                        this.$viewModel.getForms();
                    }
                } else {
                    this.$onSecureFragmentVisible.invoke(Boxing.boxBoolean(false));
                    this.$viewModel.m75166getOrderInfo();
                }
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C146841) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.eSign.screen.OneConsentAndESignNavGraphKt$oneESignNavGraph$1$6$10 */
    /* loaded from: classes10.dex */
    public static final class C1468510 extends Lambda implements Function0<Unit> {
        final /* synthetic */ NavController $navController;
        final /* synthetic */ Function1<Boolean, Unit> $onSecureFragmentVisible;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C1468510(Function1<? super Boolean, Unit> function1, NavController navController) {
            super(0);
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
            this.$onSecureFragmentVisible.invoke(Boolean.FALSE);
            this.$navController.navigateUp();
        }
    }

    @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.eSign.screen.OneConsentAndESignNavGraphKt$oneESignNavGraph$1$6$2 */
    /* loaded from: classes10.dex */
    public static final class C146862 extends Lambda implements Function1<ImageBitmap, Unit> {
        final /* synthetic */ NavController $navController;
        final /* synthetic */ Function0<Unit> $onOptionTakeMorePhoto;
        final /* synthetic */ Function1<Boolean, Unit> $onSecureFragmentVisible;
        final /* synthetic */ CoroutineScope $scope;
        final /* synthetic */ ValidateDocApproved $validateDocApproved;
        final /* synthetic */ OneConsentAndESignViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C146862(OneConsentAndESignViewModel oneConsentAndESignViewModel, Function1<? super Boolean, Unit> function1, ValidateDocApproved validateDocApproved, NavController navController, CoroutineScope coroutineScope, Function0<Unit> function0) {
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
                oneConsentAndESignViewModel.updateValidateDocApproved(DocumentType.E_SIGN.getDocType(), true);
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
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.eSign.screen.OneConsentAndESignNavGraphKt$oneESignNavGraph$1$6$3 */
    /* loaded from: classes10.dex */
    public static final class C146873 extends Lambda implements Function0<Unit> {
        final /* synthetic */ NavController $navController;
        final /* synthetic */ Function1<Boolean, Unit> $onSecureFragmentVisible;
        final /* synthetic */ MutableState<Boolean> $previewPdf;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C146873(MutableState<Boolean> mutableState, Function1<? super Boolean, Unit> function1, NavController navController) {
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
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.eSign.screen.OneConsentAndESignNavGraphKt$oneESignNavGraph$1$6$4 */
    /* loaded from: classes10.dex */
    public static final class C146884 extends Lambda implements Function0<Unit> {
        final /* synthetic */ OneConsentAndESignViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C146884(OneConsentAndESignViewModel oneConsentAndESignViewModel) {
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
            this.$viewModel.setClearFormsState();
        }
    }

    @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.eSign.screen.OneConsentAndESignNavGraphKt$oneESignNavGraph$1$6$5 */
    /* loaded from: classes10.dex */
    public static final class C146895 extends Lambda implements Function1<ImageBitmap, Unit> {
        public static final C146895 INSTANCE = new C146895();

        public C146895() {
            super(1);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(@Nullable ImageBitmap imageBitmap) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(ImageBitmap imageBitmap) {
            invoke2(imageBitmap);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.eSign.screen.OneConsentAndESignNavGraphKt$oneESignNavGraph$1$6$6 */
    /* loaded from: classes10.dex */
    public static final class C146906 extends Lambda implements Function0<Unit> {
        final /* synthetic */ NavController $navController;
        final /* synthetic */ Function1<Boolean, Unit> $onSecureFragmentVisible;
        final /* synthetic */ MutableState<Boolean> $previewPdf;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C146906(MutableState<Boolean> mutableState, Function1<? super Boolean, Unit> function1, NavController navController) {
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
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.eSign.screen.OneConsentAndESignNavGraphKt$oneESignNavGraph$1$6$7 */
    /* loaded from: classes10.dex */
    public static final class C146917 extends Lambda implements Function1<ImageBitmap, Unit> {
        public static final C146917 INSTANCE = new C146917();

        public C146917() {
            super(1);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(@Nullable ImageBitmap imageBitmap) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(ImageBitmap imageBitmap) {
            invoke2(imageBitmap);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.eSign.screen.OneConsentAndESignNavGraphKt$oneESignNavGraph$1$6$8 */
    /* loaded from: classes10.dex */
    public static final class C146928 extends Lambda implements Function0<Unit> {
        final /* synthetic */ NavController $navController;
        final /* synthetic */ Function1<Boolean, Unit> $onSecureFragmentVisible;
        final /* synthetic */ MutableState<Boolean> $previewPdf;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C146928(MutableState<Boolean> mutableState, Function1<? super Boolean, Unit> function1, NavController navController) {
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
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.eSign.screen.OneConsentAndESignNavGraphKt$oneESignNavGraph$1$6$9 */
    /* loaded from: classes10.dex */
    public static final class C146939 extends Lambda implements Function1<ImageBitmap, Unit> {
        final /* synthetic */ NavController $navController;
        final /* synthetic */ Function0<Unit> $onOptionTakeMorePhoto;
        final /* synthetic */ Function1<Boolean, Unit> $onSecureFragmentVisible;
        final /* synthetic */ CoroutineScope $scope;
        final /* synthetic */ ValidateDocApproved $validateDocApproved;
        final /* synthetic */ OneConsentAndESignViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C146939(OneConsentAndESignViewModel oneConsentAndESignViewModel, Function1<? super Boolean, Unit> function1, ValidateDocApproved validateDocApproved, NavController navController, CoroutineScope coroutineScope, Function0<Unit> function0) {
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
                oneConsentAndESignViewModel.updateValidateDocApproved(DocumentType.E_SIGN.getDocType(), true);
                function1.invoke(Boolean.FALSE);
                if (validateDocApproved.isAllDocumentApproved()) {
                    oneConsentAndESignViewModel.updateForms();
                } else {
                    OneConsentAndESignNavGraphKt.navigateNextDocumentToApprove(validateDocApproved, navController, coroutineScope, function0);
                }
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public OneConsentAndESignNavGraphKt$oneESignNavGraph$1$6(OneConsentAndESignViewModel oneConsentAndESignViewModel, MutableState<Boolean> mutableState, Function1<? super Boolean, Unit> function1, ValidateDocApproved validateDocApproved, NavController navController, CoroutineScope coroutineScope, Function0<Unit> function0) {
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
    public static final OneGetFormsState invoke$lambda$0(State<? extends OneGetFormsState> state) {
        return state.getValue();
    }

    private static final OneOrderInfoModel invoke$lambda$1(State<OneOrderInfoModel> state) {
        return state.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CompanyThemes invoke$lambda$2(State<? extends CompanyThemes> state) {
        return state.getValue();
    }

    @Override // kotlin.jvm.functions.Function4
    public /* bridge */ /* synthetic */ Unit invoke(AnimatedContentScope animatedContentScope, NavBackStackEntry navBackStackEntry, Composer composer, Integer num) {
        invoke(animatedContentScope, navBackStackEntry, composer, num.intValue());
        return Unit.INSTANCE;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void invoke(@NotNull AnimatedContentScope composable, @NotNull NavBackStackEntry it, @Nullable Composer composer, int i) {
        String pdfForm;
        Intrinsics.checkNotNullParameter(composable, "$this$composable");
        Intrinsics.checkNotNullParameter(it, "it");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(514121493, i, -1, "th.co.dtac.android.dtacone.view.appOne.eSign.screen.oneESignNavGraph.<anonymous>.<anonymous> (OneConsentAndESignNavGraph.kt:268)");
        }
        State collectAsState = SnapshotStateKt.collectAsState(this.$viewModel.getGetFormsState(), null, composer, 8, 1);
        State collectAsState2 = SnapshotStateKt.collectAsState(this.$viewModel.getOrderInfo(), null, composer, 8, 1);
        State collectAsState3 = SnapshotStateKt.collectAsState(this.$viewModel.getCompanyThemesState(), null, composer, 8, 1);
        EffectsKt.LaunchedEffect(Unit.INSTANCE, new C146841(this.$onSecureFragmentVisible, this.$viewModel, collectAsState3, collectAsState, null), composer, 70);
        if (invoke$lambda$2(collectAsState3) == CompanyThemes.ONE_TRUE) {
            composer.startReplaceableGroup(1033439176);
            OneGetFormsState invoke$lambda$0 = invoke$lambda$0(collectAsState);
            if (invoke$lambda$0 instanceof OneGetFormsState.Success) {
                composer.startReplaceableGroup(1033439267);
                OneGetFormsState invoke$lambda$02 = invoke$lambda$0(collectAsState);
                Intrinsics.checkNotNull(invoke$lambda$02, "null cannot be cast to non-null type th.co.dtac.android.dtacone.view.appOne.eSign.state.OneGetFormsState.Success");
                DataForm data = ((OneGetFormsState.Success) invoke$lambda$02).getData().getData();
                SignaturePageScreenKt.SignaturePageScreen((data == null || (pdfForm = data.getPdfForm()) == null || (r1 = StringHelperKt.substringPDFFormat(pdfForm)) == null) ? "" : "", new C146862(this.$viewModel, this.$onSecureFragmentVisible, this.$validateDocApproved, this.$navController, this.$scope, this.$onOptionTakeMorePhoto), new C146873(this.$previewPdf, this.$onSecureFragmentVisible, this.$navController), this.$previewPdf, invoke$lambda$2(collectAsState3), 0, 0, composer, 0, 96);
                composer.endReplaceableGroup();
            } else if (invoke$lambda$0 instanceof OneGetFormsState.Loading) {
                composer.startReplaceableGroup(1033441151);
                OneDialogKt.OneDialogLoading(null, null, null, composer, 0, 7);
                composer.endReplaceableGroup();
            } else if (invoke$lambda$0 instanceof OneGetFormsState.Error) {
                composer.startReplaceableGroup(1033441268);
                OneGetFormsState invoke$lambda$03 = invoke$lambda$0(collectAsState);
                Intrinsics.checkNotNull(invoke$lambda$03, "null cannot be cast to non-null type th.co.dtac.android.dtacone.view.appOne.eSign.state.OneGetFormsState.Error");
                CommonErrorResponse error = ((OneGetFormsState.Error) invoke$lambda$03).getError();
                OneDialogKt.OneDialogError(error.getDesc(), error.getUserId(), error.getCode(), error.getSystemMessage(), new C146884(this.$viewModel), error.getResponseDateTime(), 0, composer, 0, 64);
                SignaturePageScreenKt.SignaturePageScreen("", C146895.INSTANCE, new C146906(this.$previewPdf, this.$onSecureFragmentVisible, this.$navController), this.$previewPdf, invoke$lambda$2(collectAsState3), 0, 0, composer, 54, 96);
                composer.endReplaceableGroup();
            } else {
                composer.startReplaceableGroup(1033442300);
                SignaturePageScreenKt.SignaturePageScreen("", C146917.INSTANCE, new C146928(this.$previewPdf, this.$onSecureFragmentVisible, this.$navController), this.$previewPdf, invoke$lambda$2(collectAsState3), 0, 0, composer, 54, 96);
                composer.endReplaceableGroup();
            }
            composer.endReplaceableGroup();
        } else {
            composer.startReplaceableGroup(1033442838);
            SignaturePageScreenKt.SignaturePageScreen(invoke$lambda$1(collectAsState2), new C146939(this.$viewModel, this.$onSecureFragmentVisible, this.$validateDocApproved, this.$navController, this.$scope, this.$onOptionTakeMorePhoto), new C1468510(this.$onSecureFragmentVisible, this.$navController), invoke$lambda$2(collectAsState3), composer, 8, 0);
            composer.endReplaceableGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}