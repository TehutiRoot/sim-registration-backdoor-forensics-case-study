package th.p047co.dtac.android.dtacone.view.appOne.tol.screen;

import androidx.compose.animation.AnimatedContentScope;
import androidx.compose.p003ui.res.StringResources_androidKt;
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
import java.util.Calendar;
import java.util.Date;
import java.util.List;
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
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.app_one.widget.composable.OneDialogKt;
import th.p047co.dtac.android.dtacone.model.appOne.tol.installation.AppointmentData;
import th.p047co.dtac.android.dtacone.model.error.ValidatedRuleException;
import th.p047co.dtac.android.dtacone.model.p2post.validate.BirthDayCollection;
import th.p047co.dtac.android.dtacone.util.appOne.validate_mailing.OneAddressNoLengthRule;
import th.p047co.dtac.android.dtacone.util.appOne.validate_mailing.OneBirthDateRule;
import th.p047co.dtac.android.dtacone.util.appOne.validate_mailing.OneDistrictLengthRule;
import th.p047co.dtac.android.dtacone.util.appOne.validate_mailing.OneEmailLengthRule;
import th.p047co.dtac.android.dtacone.util.appOne.validate_mailing.OneFirstNameValidate;
import th.p047co.dtac.android.dtacone.util.appOne.validate_mailing.OneHouseNoLengthRule;
import th.p047co.dtac.android.dtacone.util.appOne.validate_mailing.OneLastNameValidate;
import th.p047co.dtac.android.dtacone.util.appOne.validate_mailing.OnePhoneNumberValidate;
import th.p047co.dtac.android.dtacone.util.appOne.validate_mailing.OnePostcodeLengthRule;
import th.p047co.dtac.android.dtacone.util.appOne.validate_mailing.OneProvinceLengthRule;
import th.p047co.dtac.android.dtacone.util.appOne.validate_mailing.OneSubDistrictLengthRule;
import th.p047co.dtac.android.dtacone.view.appOne.tol.model.CommonErrorResponse;
import th.p047co.dtac.android.dtacone.view.appOne.tol.model.OneTolScreen;
import th.p047co.dtac.android.dtacone.view.appOne.tol.model.customerInfo.CustomerInfoAddress;
import th.p047co.dtac.android.dtacone.view.appOne.tol.model.customerInfo.CustomerInfoInvoiceChannel;
import th.p047co.dtac.android.dtacone.view.appOne.tol.model.customerInfo.CustomerInformation;
import th.p047co.dtac.android.dtacone.view.appOne.tol.model.customerInfo.address.District;
import th.p047co.dtac.android.dtacone.view.appOne.tol.model.customerInfo.address.PostCode;
import th.p047co.dtac.android.dtacone.view.appOne.tol.model.customerInfo.address.Province;
import th.p047co.dtac.android.dtacone.view.appOne.tol.model.customerInfo.address.SubDistrict;
import th.p047co.dtac.android.dtacone.view.appOne.tol.screen.inputInfo.InputInfoScreenKt;
import th.p047co.dtac.android.dtacone.view.appOne.tol.viewmodel.OneRegisterTrueOnlineViewModel;
import th.p047co.dtac.android.dtacone.view.appOne.tol.viewmodel.state.InstallDateState;

@Metadata(m29143d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u000b¢\u0006\u0004\b\u0005\u0010\u0006"}, m29142d2 = {"<anonymous>", "", "Landroidx/compose/animation/AnimatedContentScope;", "it", "Landroidx/navigation/NavBackStackEntry;", "invoke", "(Landroidx/compose/animation/AnimatedContentScope;Landroidx/navigation/NavBackStackEntry;Landroidx/compose/runtime/Composer;I)V"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
@SourceDebugExtension({"SMAP\nOneTolNavGraph.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OneTolNavGraph.kt\nth/co/dtac/android/dtacone/view/appOne/tol/screen/OneTolNavGraphKt$oneTolNavGraph$1$13\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,1518:1\n25#2:1519\n25#2:1526\n25#2:1533\n36#2:1540\n25#2:1547\n36#2:1554\n36#2:1561\n1097#3,6:1520\n1097#3,6:1527\n1097#3,6:1534\n1097#3,6:1541\n1097#3,6:1548\n1097#3,6:1555\n1097#3,6:1562\n81#4:1568\n81#4:1569\n81#4:1570\n81#4:1571\n81#4:1572\n81#4:1573\n81#4:1574\n81#4:1575\n81#4:1576\n81#4:1577\n107#4,2:1578\n81#4:1580\n107#4,2:1581\n81#4:1583\n81#4:1584\n107#4,2:1585\n81#4:1587\n107#4,2:1588\n*S KotlinDebug\n*F\n+ 1 OneTolNavGraph.kt\nth/co/dtac/android/dtacone/view/appOne/tol/screen/OneTolNavGraphKt$oneTolNavGraph$1$13\n*L\n884#1:1519\n885#1:1526\n887#1:1533\n947#1:1540\n950#1:1547\n971#1:1554\n980#1:1561\n884#1:1520,6\n885#1:1527,6\n887#1:1534,6\n947#1:1541,6\n950#1:1548,6\n971#1:1555,6\n980#1:1562,6\n875#1:1568\n876#1:1569\n877#1:1570\n878#1:1571\n879#1:1572\n880#1:1573\n881#1:1574\n882#1:1575\n883#1:1576\n884#1:1577\n884#1:1578,2\n885#1:1580\n885#1:1581,2\n886#1:1583\n887#1:1584\n887#1:1585,2\n950#1:1587\n950#1:1588,2\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.screen.OneTolNavGraphKt$oneTolNavGraph$1$13 */
/* loaded from: classes10.dex */
public final class OneTolNavGraphKt$oneTolNavGraph$1$13 extends Lambda implements Function4<AnimatedContentScope, NavBackStackEntry, Composer, Integer, Unit> {
    final /* synthetic */ NavController $navController;
    final /* synthetic */ OneRegisterTrueOnlineViewModel $viewModel;

    @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.screen.OneTolNavGraphKt$oneTolNavGraph$1$13$1 */
    /* loaded from: classes10.dex */
    public /* synthetic */ class C152261 extends FunctionReferenceImpl implements Function1<CustomerInformation, Unit> {
        public C152261(Object obj) {
            super(1, obj, OneRegisterTrueOnlineViewModel.class, "onCustomerInfoChanged", "onCustomerInfoChanged(Lth/co/dtac/android/dtacone/view/appOne/tol/model/customerInfo/CustomerInformation;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(CustomerInformation customerInformation) {
            invoke2(customerInformation);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull CustomerInformation p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((OneRegisterTrueOnlineViewModel) this.receiver).onCustomerInfoChanged(p0);
        }
    }

    @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.screen.OneTolNavGraphKt$oneTolNavGraph$1$13$2 */
    /* loaded from: classes10.dex */
    public static final class C152272 extends Lambda implements Function0<Unit> {
        final /* synthetic */ State<CustomerInformation> $customerInfo$delegate;
        final /* synthetic */ MutableState<Integer> $dialogResId$delegate;
        final /* synthetic */ MutableState<Boolean> $isShowDialog$delegate;
        final /* synthetic */ MutableState<Boolean> $performNavigate$delegate;
        final /* synthetic */ OneRegisterTrueOnlineViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C152272(OneRegisterTrueOnlineViewModel oneRegisterTrueOnlineViewModel, State<CustomerInformation> state, MutableState<Boolean> mutableState, MutableState<Integer> mutableState2, MutableState<Boolean> mutableState3) {
            super(0);
            this.$viewModel = oneRegisterTrueOnlineViewModel;
            this.$customerInfo$delegate = state;
            this.$performNavigate$delegate = mutableState;
            this.$dialogResId$delegate = mutableState2;
            this.$isShowDialog$delegate = mutableState3;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            try {
                new OneFirstNameValidate().validate(OneTolNavGraphKt$oneTolNavGraph$1$13.invoke$lambda$0(this.$customerInfo$delegate).getFirstName());
                new OneLastNameValidate().validate(OneTolNavGraphKt$oneTolNavGraph$1$13.invoke$lambda$0(this.$customerInfo$delegate).getLastName());
                if (OneTolNavGraphKt$oneTolNavGraph$1$13.invoke$lambda$0(this.$customerInfo$delegate).getBirthDate() != null) {
                    Calendar calendar = Calendar.getInstance();
                    Date birthDate = OneTolNavGraphKt$oneTolNavGraph$1$13.invoke$lambda$0(this.$customerInfo$delegate).getBirthDate();
                    Intrinsics.checkNotNull(birthDate);
                    calendar.setTime(birthDate);
                    int i = calendar.get(1);
                    new OneBirthDateRule().validate(new BirthDayCollection(calendar.get(5), calendar.get(2) + 1, i));
                    CustomerInfoAddress customerInfoAddress = OneTolNavGraphKt$oneTolNavGraph$1$13.invoke$lambda$0(this.$customerInfo$delegate).getAddressList().get(OneTolNavGraphKt$oneTolNavGraph$1$13.invoke$lambda$0(this.$customerInfo$delegate).getAddressType().ordinal());
                    new OneHouseNoLengthRule().validate(customerInfoAddress.getHouseNo());
                    new OneAddressNoLengthRule().validate(customerInfoAddress.getStreet());
                    new OneProvinceLengthRule().validate(customerInfoAddress.getProvince());
                    new OneDistrictLengthRule().validate(customerInfoAddress.getDistrict());
                    new OneSubDistrictLengthRule().validate(customerInfoAddress.getSubDistrict());
                    new OnePostcodeLengthRule().validate(customerInfoAddress.getPostCode());
                    new OnePhoneNumberValidate().validate(OneTolNavGraphKt$oneTolNavGraph$1$13.invoke$lambda$0(this.$customerInfo$delegate).getInvoicePhone());
                    if (OneTolNavGraphKt$oneTolNavGraph$1$13.invoke$lambda$0(this.$customerInfo$delegate).getInvoiceChannel() == CustomerInfoInvoiceChannel.EMAIL) {
                        new OneEmailLengthRule().validate(OneTolNavGraphKt$oneTolNavGraph$1$13.invoke$lambda$0(this.$customerInfo$delegate).getInvoiceEmail());
                    }
                    if (!Intrinsics.areEqual(OneTolNavGraphKt$oneTolNavGraph$1$13.invoke$lambda$0(this.$customerInfo$delegate).getInvoicePhone(), OneTolNavGraphKt$oneTolNavGraph$1$13.invoke$lambda$0(this.$customerInfo$delegate).getOfficerPhone())) {
                        this.$viewModel.getInstallDate();
                        OneTolNavGraphKt$oneTolNavGraph$1$13.invoke$lambda$18(this.$performNavigate$delegate, true);
                        return;
                    }
                    throw new ValidatedRuleException(R.string.one_tol_form_info_phone_number_duplicate);
                }
                throw new ValidatedRuleException(R.string.one_please_enter_birth_date);
            } catch (ValidatedRuleException e) {
                OneTolNavGraphKt$oneTolNavGraph$1$13.invoke$lambda$14(this.$dialogResId$delegate, e.getResId());
                OneTolNavGraphKt$oneTolNavGraph$1$13.invoke$lambda$11(this.$isShowDialog$delegate, true);
            }
        }
    }

    @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    @DebugMetadata(m29093c = "th.co.dtac.android.dtacone.view.appOne.tol.screen.OneTolNavGraphKt$oneTolNavGraph$1$13$4", m29092f = "OneTolNavGraph.kt", m29091i = {}, m29090l = {}, m29089m = "invokeSuspend", m29088n = {}, m29087s = {})
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.screen.OneTolNavGraphKt$oneTolNavGraph$1$13$4 */
    /* loaded from: classes10.dex */
    public static final class C152284 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ AppointmentData $data;
        final /* synthetic */ NavController $navController;
        final /* synthetic */ MutableState<Boolean> $performNavigate$delegate;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C152284(AppointmentData appointmentData, NavController navController, MutableState<Boolean> mutableState, Continuation<? super C152284> continuation) {
            super(2, continuation);
            this.$data = appointmentData;
            this.$navController = navController;
            this.$performNavigate$delegate = mutableState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new C152284(this.$data, this.$navController, this.$performNavigate$delegate, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            AbstractC19782eg0.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                if (OneTolNavGraphKt$oneTolNavGraph$1$13.invoke$lambda$17(this.$performNavigate$delegate)) {
                    if (this.$data.getNeedTechnician()) {
                        NavController.navigate$default(this.$navController, OneTolScreen.Tol.Installation.ROUTE, null, null, 6, null);
                    } else {
                        NavController.navigate$default(this.$navController, OneTolScreen.Tol.Review.ROUTE, null, null, 6, null);
                    }
                }
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C152284) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneTolNavGraphKt$oneTolNavGraph$1$13(OneRegisterTrueOnlineViewModel oneRegisterTrueOnlineViewModel, NavController navController) {
        super(4);
        this.$viewModel = oneRegisterTrueOnlineViewModel;
        this.$navController = navController;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CustomerInformation invoke$lambda$0(State<CustomerInformation> state) {
        return state.getValue();
    }

    private static final List<Province> invoke$lambda$1(State<? extends List<Province>> state) {
        return state.getValue();
    }

    private static final boolean invoke$lambda$10(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$lambda$11(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final int invoke$lambda$13(MutableState<Integer> mutableState) {
        return mutableState.getValue().intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$lambda$14(MutableState<Integer> mutableState, int i) {
        mutableState.setValue(Integer.valueOf(i));
    }

    private static final InstallDateState invoke$lambda$15(State<? extends InstallDateState> state) {
        return state.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean invoke$lambda$17(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$lambda$18(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final List<District> invoke$lambda$2(State<? extends List<District>> state) {
        return state.getValue();
    }

    private static final boolean invoke$lambda$21(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$lambda$22(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final List<SubDistrict> invoke$lambda$3(State<? extends List<SubDistrict>> state) {
        return state.getValue();
    }

    private static final List<PostCode> invoke$lambda$4(State<? extends List<PostCode>> state) {
        return state.getValue();
    }

    private static final boolean invoke$lambda$5(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    private static final int invoke$lambda$6(State<Integer> state) {
        return state.getValue().intValue();
    }

    private static final int invoke$lambda$7(State<Integer> state) {
        return state.getValue().intValue();
    }

    private static final int invoke$lambda$8(State<Integer> state) {
        return state.getValue().intValue();
    }

    @Override // kotlin.jvm.functions.Function4
    public /* bridge */ /* synthetic */ Unit invoke(AnimatedContentScope animatedContentScope, NavBackStackEntry navBackStackEntry, Composer composer, Integer num) {
        invoke(animatedContentScope, navBackStackEntry, composer, num.intValue());
        return Unit.INSTANCE;
    }

    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14, types: [kotlin.coroutines.Continuation, th.co.dtac.android.dtacone.app_one.widget.composable.OneDialogLoadingAlignment, java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v26 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r8v9 */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void invoke(@NotNull AnimatedContentScope composable, @NotNull NavBackStackEntry it, @Nullable Composer composer, int i) {
        ?? r8;
        ?? r1;
        Intrinsics.checkNotNullParameter(composable, "$this$composable");
        Intrinsics.checkNotNullParameter(it, "it");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1891665364, i, -1, "th.co.dtac.android.dtacone.view.appOne.tol.screen.oneTolNavGraph.<anonymous>.<anonymous> (OneTolNavGraph.kt:873)");
        }
        State collectAsState = SnapshotStateKt.collectAsState(this.$viewModel.getCustomerInfoState(), null, composer, 8, 1);
        State collectAsState2 = SnapshotStateKt.collectAsState(this.$viewModel.getProvinceList(), null, composer, 8, 1);
        State collectAsState3 = SnapshotStateKt.collectAsState(this.$viewModel.getDistrictList(), null, composer, 8, 1);
        State collectAsState4 = SnapshotStateKt.collectAsState(this.$viewModel.getSubDistrictList(), null, composer, 8, 1);
        State collectAsState5 = SnapshotStateKt.collectAsState(this.$viewModel.getPostCodeList(), null, composer, 8, 1);
        State collectAsState6 = SnapshotStateKt.collectAsState(this.$viewModel.isSmartCard(), null, composer, 8, 1);
        State collectAsState7 = SnapshotStateKt.collectAsState(this.$viewModel.getProvinceId(), null, composer, 8, 1);
        State collectAsState8 = SnapshotStateKt.collectAsState(this.$viewModel.getDistrictId(), null, composer, 8, 1);
        State collectAsState9 = SnapshotStateKt.collectAsState(this.$viewModel.getSubDistrictId(), null, composer, 8, 1);
        composer.startReplaceableGroup(-492369756);
        Object rememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.Companion;
        if (rememberedValue == companion.getEmpty()) {
            rememberedValue = AbstractC19036aL1.m65148g(Boolean.FALSE, null, 2, null);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        MutableState mutableState = (MutableState) rememberedValue;
        composer.startReplaceableGroup(-492369756);
        Object rememberedValue2 = composer.rememberedValue();
        if (rememberedValue2 == companion.getEmpty()) {
            rememberedValue2 = AbstractC19036aL1.m65148g(0, null, 2, null);
            composer.updateRememberedValue(rememberedValue2);
        }
        composer.endReplaceableGroup();
        MutableState mutableState2 = (MutableState) rememberedValue2;
        State collectAsState10 = SnapshotStateKt.collectAsState(this.$viewModel.getInstallDateState(), null, composer, 8, 1);
        composer.startReplaceableGroup(-492369756);
        Object rememberedValue3 = composer.rememberedValue();
        if (rememberedValue3 == companion.getEmpty()) {
            rememberedValue3 = AbstractC19036aL1.m65148g(Boolean.FALSE, null, 2, null);
            composer.updateRememberedValue(rememberedValue3);
        }
        composer.endReplaceableGroup();
        MutableState mutableState3 = (MutableState) rememberedValue3;
        InputInfoScreenKt.InputInfoScreen(invoke$lambda$0(collectAsState), invoke$lambda$5(collectAsState6), invoke$lambda$6(collectAsState7), invoke$lambda$7(collectAsState8), invoke$lambda$8(collectAsState9), invoke$lambda$1(collectAsState2), invoke$lambda$2(collectAsState3), invoke$lambda$3(collectAsState4), invoke$lambda$4(collectAsState5), new C152261(this.$viewModel), new C152272(this.$viewModel, collectAsState, mutableState3, mutableState2, mutableState), composer, 153354248, 0);
        composer.startReplaceableGroup(1552561757);
        if (invoke$lambda$10(mutableState)) {
            r8 = 0;
            String stringResource = StringResources_androidKt.stringResource(invoke$lambda$13(mutableState2), composer, 0);
            composer.startReplaceableGroup(1157296644);
            boolean changed = composer.changed(mutableState);
            Object rememberedValue4 = composer.rememberedValue();
            if (changed || rememberedValue4 == companion.getEmpty()) {
                rememberedValue4 = new OneTolNavGraphKt$oneTolNavGraph$1$13$3$1(mutableState);
                composer.updateRememberedValue(rememberedValue4);
            }
            composer.endReplaceableGroup();
            OneDialogKt.OneDialogMessage(stringResource, (Function0) rememberedValue4, null, composer, 0, 4);
        } else {
            r8 = 0;
        }
        composer.endReplaceableGroup();
        composer.startReplaceableGroup(-492369756);
        Object rememberedValue5 = composer.rememberedValue();
        if (rememberedValue5 == companion.getEmpty()) {
            r1 = 0;
            rememberedValue5 = AbstractC19036aL1.m65148g(Boolean.FALSE, null, 2, null);
            composer.updateRememberedValue(rememberedValue5);
        } else {
            r1 = 0;
        }
        composer.endReplaceableGroup();
        MutableState mutableState4 = (MutableState) rememberedValue5;
        InstallDateState invoke$lambda$15 = invoke$lambda$15(collectAsState10);
        if (invoke$lambda$15 instanceof InstallDateState.Success) {
            composer.startReplaceableGroup(1552562108);
            InstallDateState invoke$lambda$152 = invoke$lambda$15(collectAsState10);
            Intrinsics.checkNotNull(invoke$lambda$152, "null cannot be cast to non-null type th.co.dtac.android.dtacone.view.appOne.tol.viewmodel.state.InstallDateState.Success");
            EffectsKt.LaunchedEffect(Unit.INSTANCE, new C152284(((InstallDateState.Success) invoke$lambda$152).getData(), this.$navController, mutableState3, r1), composer, 70);
            composer.endReplaceableGroup();
        } else if (invoke$lambda$15 instanceof InstallDateState.Error) {
            composer.startReplaceableGroup(1552562600);
            InstallDateState invoke$lambda$153 = invoke$lambda$15(collectAsState10);
            Intrinsics.checkNotNull(invoke$lambda$153, "null cannot be cast to non-null type th.co.dtac.android.dtacone.view.appOne.tol.viewmodel.state.InstallDateState.Error");
            CommonErrorResponse error = ((InstallDateState.Error) invoke$lambda$153).getError();
            if (!invoke$lambda$21(mutableState4)) {
                String desc = error.getDesc();
                String userId = error.getUserId();
                String code = error.getCode();
                String systemMessage = error.getSystemMessage();
                String responseDateTime = error.getResponseDateTime();
                composer.startReplaceableGroup(1157296644);
                boolean changed2 = composer.changed(mutableState4);
                Object rememberedValue6 = composer.rememberedValue();
                if (changed2 || rememberedValue6 == companion.getEmpty()) {
                    rememberedValue6 = new OneTolNavGraphKt$oneTolNavGraph$1$13$5$1(mutableState4);
                    composer.updateRememberedValue(rememberedValue6);
                }
                composer.endReplaceableGroup();
                OneDialogKt.OneDialogError(desc, userId, code, systemMessage, (Function0) rememberedValue6, responseDateTime, composer, 0, 0);
            }
            composer.endReplaceableGroup();
        } else if (invoke$lambda$15 instanceof InstallDateState.ErrorMessage) {
            composer.startReplaceableGroup(1552563226);
            InstallDateState invoke$lambda$154 = invoke$lambda$15(collectAsState10);
            Intrinsics.checkNotNull(invoke$lambda$154, "null cannot be cast to non-null type th.co.dtac.android.dtacone.view.appOne.tol.viewmodel.state.InstallDateState.ErrorMessage");
            String message = ((InstallDateState.ErrorMessage) invoke$lambda$154).getMessage();
            if (!invoke$lambda$21(mutableState4)) {
                composer.startReplaceableGroup(1157296644);
                boolean changed3 = composer.changed(mutableState4);
                Object rememberedValue7 = composer.rememberedValue();
                if (changed3 || rememberedValue7 == companion.getEmpty()) {
                    rememberedValue7 = new OneTolNavGraphKt$oneTolNavGraph$1$13$6$1(mutableState4);
                    composer.updateRememberedValue(rememberedValue7);
                }
                composer.endReplaceableGroup();
                OneDialogKt.OneDialogMessage(message, (Function0) rememberedValue7, null, composer, 0, 4);
            }
            composer.endReplaceableGroup();
        } else if (invoke$lambda$15 instanceof InstallDateState.Loading) {
            composer.startReplaceableGroup(1552563626);
            OneDialogKt.OneDialogLoading(r1, r1, composer, r8, 3);
            invoke$lambda$22(mutableState4, r8);
            composer.endReplaceableGroup();
        } else {
            composer.startReplaceableGroup(1552563750);
            composer.endReplaceableGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}