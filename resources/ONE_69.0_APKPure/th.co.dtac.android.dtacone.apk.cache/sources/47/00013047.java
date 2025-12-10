package th.p047co.dtac.android.dtacone.view.appOne.eSign.screen;

import android.os.Bundle;
import androidx.compose.animation.AnimatedContentScope;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavController;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
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
import th.p047co.dtac.android.dtacone.model.consent.ConsentNonTelco;
import th.p047co.dtac.android.dtacone.view.appOne.eSign.model.DocumentType;
import th.p047co.dtac.android.dtacone.view.appOne.eSign.model.ValidateDocApproved;
import th.p047co.dtac.android.dtacone.view.appOne.eSign.viewModel.OneConsentAndESignViewModel;
import th.p047co.dtac.android.dtacone.viewmodel.state.ConsentState;
import th.p047co.dtac.android.dtacone.widget.compose.consent.ConsentScreenKt;
import th.p047co.dtac.android.dtacone.widget.compose.consent.ConsentType;

@Metadata(m29143d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u000b¢\u0006\u0004\b\u0005\u0010\u0006"}, m29142d2 = {"<anonymous>", "", "Landroidx/compose/animation/AnimatedContentScope;", "it", "Landroidx/navigation/NavBackStackEntry;", "invoke", "(Landroidx/compose/animation/AnimatedContentScope;Landroidx/navigation/NavBackStackEntry;Landroidx/compose/runtime/Composer;I)V"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
@SourceDebugExtension({"SMAP\nOneConsentAndESignNavGraph.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OneConsentAndESignNavGraph.kt\nth/co/dtac/android/dtacone/view/appOne/eSign/screen/OneConsentAndESignNavGraphKt$oneESignNavGraph$1$3\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,755:1\n81#2:756\n81#2:757\n*S KotlinDebug\n*F\n+ 1 OneConsentAndESignNavGraph.kt\nth/co/dtac/android/dtacone/view/appOne/eSign/screen/OneConsentAndESignNavGraphKt$oneESignNavGraph$1$3\n*L\n81#1:756\n82#1:757\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.view.appOne.eSign.screen.OneConsentAndESignNavGraphKt$oneESignNavGraph$1$3 */
/* loaded from: classes10.dex */
public final class OneConsentAndESignNavGraphKt$oneESignNavGraph$1$3 extends Lambda implements Function4<AnimatedContentScope, NavBackStackEntry, Composer, Integer, Unit> {
    final /* synthetic */ NavController $navController;
    final /* synthetic */ Function0<Unit> $onOptionTakeMorePhoto;
    final /* synthetic */ CoroutineScope $scope;
    final /* synthetic */ ValidateDocApproved $validateDocApproved;
    final /* synthetic */ OneConsentAndESignViewModel $viewModel;

    @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    @DebugMetadata(m29093c = "th.co.dtac.android.dtacone.view.appOne.eSign.screen.OneConsentAndESignNavGraphKt$oneESignNavGraph$1$3$1", m29092f = "OneConsentAndESignNavGraph.kt", m29091i = {}, m29090l = {}, m29089m = "invokeSuspend", m29088n = {}, m29087s = {})
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.eSign.screen.OneConsentAndESignNavGraphKt$oneESignNavGraph$1$3$1 */
    /* loaded from: classes10.dex */
    public static final class C146711 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ State<ConsentState> $consentState$delegate;
        final /* synthetic */ String $documentType;
        final /* synthetic */ OneConsentAndESignViewModel $viewModel;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C146711(String str, OneConsentAndESignViewModel oneConsentAndESignViewModel, State<? extends ConsentState> state, Continuation<? super C146711> continuation) {
            super(2, continuation);
            this.$documentType = str;
            this.$viewModel = oneConsentAndESignViewModel;
            this.$consentState$delegate = state;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new C146711(this.$documentType, this.$viewModel, this.$consentState$delegate, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            String str;
            AbstractC19782eg0.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                if (OneConsentAndESignNavGraphKt$oneESignNavGraph$1$3.invoke$lambda$0(this.$consentState$delegate) instanceof ConsentState.Initial) {
                    if (Intrinsics.areEqual(this.$documentType, DocumentType.TELCO.getDocType())) {
                        str = this.$viewModel.getFeatureType().getConsentDomain();
                    } else {
                        str = this.$documentType;
                        if (str == null) {
                            str = "";
                        }
                    }
                    this.$viewModel.getConsent(str);
                }
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C146711) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.eSign.screen.OneConsentAndESignNavGraphKt$oneESignNavGraph$1$3$2 */
    /* loaded from: classes10.dex */
    public static final class C146722 extends Lambda implements Function1<ConsentNonTelco, Unit> {
        final /* synthetic */ String $documentType;
        final /* synthetic */ NavController $navController;
        final /* synthetic */ Function0<Unit> $onOptionTakeMorePhoto;
        final /* synthetic */ CoroutineScope $scope;
        final /* synthetic */ ValidateDocApproved $validateDocApproved;
        final /* synthetic */ OneConsentAndESignViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C146722(String str, OneConsentAndESignViewModel oneConsentAndESignViewModel, ValidateDocApproved validateDocApproved, NavController navController, CoroutineScope coroutineScope, Function0<Unit> function0) {
            super(1);
            this.$documentType = str;
            this.$viewModel = oneConsentAndESignViewModel;
            this.$validateDocApproved = validateDocApproved;
            this.$navController = navController;
            this.$scope = coroutineScope;
            this.$onOptionTakeMorePhoto = function0;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(ConsentNonTelco consentNonTelco) {
            invoke2(consentNonTelco);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull ConsentNonTelco it) {
            Intrinsics.checkNotNullParameter(it, "it");
            String str = this.$documentType;
            DocumentType documentType = DocumentType.TELCO;
            if (!Intrinsics.areEqual(str, documentType.getDocType())) {
                documentType = DocumentType.PDPA;
            }
            this.$viewModel.setConsentNonTelcoAgree(true, documentType);
            if (this.$validateDocApproved.isAllDocumentApproved()) {
                this.$viewModel.updateForms();
            } else {
                OneConsentAndESignNavGraphKt.navigateNextDocumentToApprove(this.$validateDocApproved, this.$navController, this.$scope, this.$onOptionTakeMorePhoto);
            }
        }
    }

    @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.eSign.screen.OneConsentAndESignNavGraphKt$oneESignNavGraph$1$3$3 */
    /* loaded from: classes10.dex */
    public static final class C146733 extends Lambda implements Function1<ConsentNonTelco, Unit> {
        final /* synthetic */ String $documentType;
        final /* synthetic */ NavController $navController;
        final /* synthetic */ Function0<Unit> $onOptionTakeMorePhoto;
        final /* synthetic */ CoroutineScope $scope;
        final /* synthetic */ ValidateDocApproved $validateDocApproved;
        final /* synthetic */ OneConsentAndESignViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C146733(String str, OneConsentAndESignViewModel oneConsentAndESignViewModel, ValidateDocApproved validateDocApproved, NavController navController, CoroutineScope coroutineScope, Function0<Unit> function0) {
            super(1);
            this.$documentType = str;
            this.$viewModel = oneConsentAndESignViewModel;
            this.$validateDocApproved = validateDocApproved;
            this.$navController = navController;
            this.$scope = coroutineScope;
            this.$onOptionTakeMorePhoto = function0;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(ConsentNonTelco consentNonTelco) {
            invoke2(consentNonTelco);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull ConsentNonTelco it) {
            Intrinsics.checkNotNullParameter(it, "it");
            String str = this.$documentType;
            DocumentType documentType = DocumentType.TELCO;
            if (!Intrinsics.areEqual(str, documentType.getDocType())) {
                documentType = DocumentType.PDPA;
            }
            this.$viewModel.setConsentNonTelcoAgree(false, documentType);
            if (this.$validateDocApproved.isAllDocumentApproved()) {
                this.$viewModel.updateForms();
            } else {
                OneConsentAndESignNavGraphKt.navigateNextDocumentToApprove(this.$validateDocApproved, this.$navController, this.$scope, this.$onOptionTakeMorePhoto);
            }
        }
    }

    @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.eSign.screen.OneConsentAndESignNavGraphKt$oneESignNavGraph$1$3$4 */
    /* loaded from: classes10.dex */
    public static final class C146744 extends Lambda implements Function0<Unit> {
        final /* synthetic */ OneConsentAndESignViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C146744(OneConsentAndESignViewModel oneConsentAndESignViewModel) {
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
            this.$viewModel.clearConsentState();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneConsentAndESignNavGraphKt$oneESignNavGraph$1$3(OneConsentAndESignViewModel oneConsentAndESignViewModel, ValidateDocApproved validateDocApproved, NavController navController, CoroutineScope coroutineScope, Function0<Unit> function0) {
        super(4);
        this.$viewModel = oneConsentAndESignViewModel;
        this.$validateDocApproved = validateDocApproved;
        this.$navController = navController;
        this.$scope = coroutineScope;
        this.$onOptionTakeMorePhoto = function0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ConsentState invoke$lambda$0(State<? extends ConsentState> state) {
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

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void invoke(@NotNull AnimatedContentScope composable, @NotNull NavBackStackEntry it, @Nullable Composer composer, int i) {
        Intrinsics.checkNotNullParameter(composable, "$this$composable");
        Intrinsics.checkNotNullParameter(it, "it");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(95384440, i, -1, "th.co.dtac.android.dtacone.view.appOne.eSign.screen.oneESignNavGraph.<anonymous>.<anonymous> (OneConsentAndESignNavGraph.kt:78)");
        }
        Bundle arguments = it.getArguments();
        String string = arguments != null ? arguments.getString("documentType") : null;
        State collectAsState = SnapshotStateKt.collectAsState(this.$viewModel.getConsentNonTelcoState(), null, composer, 8, 1);
        State collectAsState2 = SnapshotStateKt.collectAsState(this.$viewModel.getCompanyThemesState(), null, composer, 8, 1);
        ConsentType consentType = ConsentType.TELCO;
        if (!Intrinsics.areEqual(string, consentType.getType())) {
            consentType = ConsentType.PDPA;
        }
        ConsentType consentType2 = consentType;
        EffectsKt.LaunchedEffect(Unit.INSTANCE, new C146711(string, this.$viewModel, collectAsState, null), composer, 70);
        String str = string;
        ConsentScreenKt.ConsentScreen(invoke$lambda$1(collectAsState2), consentType2, invoke$lambda$0(collectAsState), new C146722(str, this.$viewModel, this.$validateDocApproved, this.$navController, this.$scope, this.$onOptionTakeMorePhoto), new C146733(str, this.$viewModel, this.$validateDocApproved, this.$navController, this.$scope, this.$onOptionTakeMorePhoto), new C146744(this.$viewModel), composer, 0, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}