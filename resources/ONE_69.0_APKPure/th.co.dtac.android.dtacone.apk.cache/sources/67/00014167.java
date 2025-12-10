package th.p047co.dtac.android.dtacone.view.appOne.tol.screen;

import androidx.compose.animation.AnimatedContentScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavController;
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
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.app_one.util.validation.OneCommonIsExpired;
import th.p047co.dtac.android.dtacone.app_one.util.validation.OneCommonOtherCardLengthRule;
import th.p047co.dtac.android.dtacone.app_one.util.validation.OneCommonPersonIdCheckSumRule;
import th.p047co.dtac.android.dtacone.app_one.util.validation.OneCommonPersonIdLengthRule;
import th.p047co.dtac.android.dtacone.model.error.ValidatedRuleException;
import th.p047co.dtac.android.dtacone.model.mnp.IdCardInformationCollection;
import th.p047co.dtac.android.dtacone.util.constant.tol.IdDocumentType;
import th.p047co.dtac.android.dtacone.view.appOne.tol.model.OneTolScreen;
import th.p047co.dtac.android.dtacone.view.appOne.tol.model.ProductType;
import th.p047co.dtac.android.dtacone.view.appOne.tol.viewmodel.OneRegisterTrueOnlineIdCardReaderViewModel;
import th.p047co.dtac.android.dtacone.view.appOne.tol.viewmodel.OneRegisterTrueOnlineTakePhotoViewModel;
import th.p047co.dtac.android.dtacone.view.appOne.tol.viewmodel.OneRegisterTrueOnlineViewModel;
import th.p047co.dtac.android.dtacone.view.appOne.tol.viewmodel.state.IdCardReaderState;
import th.p047co.dtac.android.dtacone.view.appOne.tol.viewmodel.state.IdCardValidateState;

@Metadata(m29143d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u000b¢\u0006\u0004\b\u0005\u0010\u0006"}, m29142d2 = {"<anonymous>", "", "Landroidx/compose/animation/AnimatedContentScope;", "it", "Landroidx/navigation/NavBackStackEntry;", "invoke", "(Landroidx/compose/animation/AnimatedContentScope;Landroidx/navigation/NavBackStackEntry;Landroidx/compose/runtime/Composer;I)V"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
@SourceDebugExtension({"SMAP\nOneTolNavGraph.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OneTolNavGraph.kt\nth/co/dtac/android/dtacone/view/appOne/tol/screen/OneTolNavGraphKt$oneTolNavGraph$1$3\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,1518:1\n25#2:1519\n25#2:1526\n25#2:1533\n25#2:1540\n67#2,3:1547\n66#2:1550\n50#2:1557\n49#2:1558\n36#2:1565\n36#2:1572\n36#2:1579\n1097#3,6:1520\n1097#3,6:1527\n1097#3,6:1534\n1097#3,6:1541\n1097#3,6:1551\n1097#3,6:1559\n1097#3,6:1566\n1097#3,6:1573\n1097#3,6:1580\n81#4:1586\n81#4:1587\n81#4:1588\n81#4:1589\n81#4:1590\n81#4:1591\n81#4:1592\n107#4,2:1593\n81#4:1595\n107#4,2:1596\n81#4:1598\n107#4,2:1599\n81#4:1601\n81#4:1602\n107#4,2:1603\n*S KotlinDebug\n*F\n+ 1 OneTolNavGraph.kt\nth/co/dtac/android/dtacone/view/appOne/tol/screen/OneTolNavGraphKt$oneTolNavGraph$1$3\n*L\n247#1:1519\n249#1:1526\n250#1:1533\n252#1:1540\n256#1:1547,3\n256#1:1550\n267#1:1557\n267#1:1558\n271#1:1565\n283#1:1572\n381#1:1579\n247#1:1520,6\n249#1:1527,6\n250#1:1534,6\n252#1:1541,6\n256#1:1551,6\n267#1:1559,6\n271#1:1566,6\n283#1:1573,6\n381#1:1580,6\n240#1:1586\n241#1:1587\n242#1:1588\n243#1:1589\n245#1:1590\n246#1:1591\n247#1:1592\n247#1:1593,2\n249#1:1595\n249#1:1596,2\n250#1:1598\n250#1:1599,2\n251#1:1601\n252#1:1602\n252#1:1603,2\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.screen.OneTolNavGraphKt$oneTolNavGraph$1$3 */
/* loaded from: classes10.dex */
public final class OneTolNavGraphKt$oneTolNavGraph$1$3 extends Lambda implements Function4<AnimatedContentScope, NavBackStackEntry, Composer, Integer, Unit> {
    final /* synthetic */ OneRegisterTrueOnlineIdCardReaderViewModel $cardReaderViewModel;
    final /* synthetic */ NavController $navController;
    final /* synthetic */ OneRegisterTrueOnlineTakePhotoViewModel $takePhotoViewModel;
    final /* synthetic */ OneRegisterTrueOnlineViewModel $viewModel;

    @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    @DebugMetadata(m29093c = "th.co.dtac.android.dtacone.view.appOne.tol.screen.OneTolNavGraphKt$oneTolNavGraph$1$3$1", m29092f = "OneTolNavGraph.kt", m29091i = {}, m29090l = {}, m29089m = "invokeSuspend", m29088n = {}, m29087s = {})
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.screen.OneTolNavGraphKt$oneTolNavGraph$1$3$1 */
    /* loaded from: classes10.dex */
    public static final class C152741 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ MutableState<Boolean> $cardReaderMode$delegate;
        final /* synthetic */ OneRegisterTrueOnlineViewModel $viewModel;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C152741(OneRegisterTrueOnlineViewModel oneRegisterTrueOnlineViewModel, MutableState<Boolean> mutableState, Continuation<? super C152741> continuation) {
            super(2, continuation);
            this.$viewModel = oneRegisterTrueOnlineViewModel;
            this.$cardReaderMode$delegate = mutableState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new C152741(this.$viewModel, this.$cardReaderMode$delegate, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            AbstractC19782eg0.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                this.$viewModel.setSmartCardMode(OneTolNavGraphKt$oneTolNavGraph$1$3.invoke$lambda$7(this.$cardReaderMode$delegate));
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C152741) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.screen.OneTolNavGraphKt$oneTolNavGraph$1$3$10 */
    /* loaded from: classes10.dex */
    public /* synthetic */ class C1527510 extends FunctionReferenceImpl implements Function1<String, Unit> {
        public C1527510(Object obj) {
            super(1, obj, OneRegisterTrueOnlineViewModel.class, "onIdCardValueChanged", "onIdCardValueChanged(Ljava/lang/String;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
            invoke2(str);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull String p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((OneRegisterTrueOnlineViewModel) this.receiver).onIdCardValueChanged(p0);
        }
    }

    @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.screen.OneTolNavGraphKt$oneTolNavGraph$1$3$11 */
    /* loaded from: classes10.dex */
    public /* synthetic */ class C1527611 extends FunctionReferenceImpl implements Function1<Boolean, Unit> {
        public C1527611(Object obj) {
            super(1, obj, OneRegisterTrueOnlineViewModel.class, "onIsCheckedExpiredChange", "onIsCheckedExpiredChange(Z)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            invoke(bool.booleanValue());
            return Unit.INSTANCE;
        }

        public final void invoke(boolean z) {
            ((OneRegisterTrueOnlineViewModel) this.receiver).onIsCheckedExpiredChange(z);
        }
    }

    @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.screen.OneTolNavGraphKt$oneTolNavGraph$1$3$12 */
    /* loaded from: classes10.dex */
    public static final class C1527712 extends Lambda implements Function0<Unit> {
        final /* synthetic */ MutableState<Integer> $dialogResId$delegate;
        final /* synthetic */ State<List<String>> $idCardList$delegate;
        final /* synthetic */ State<String> $idCardType$delegate;
        final /* synthetic */ int $idCardTypeIndex;
        final /* synthetic */ State<List<Boolean>> $isCheckedExpiredList$delegate;
        final /* synthetic */ MutableState<Boolean> $isShowDialog$delegate;
        final /* synthetic */ OneRegisterTrueOnlineViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C1527712(int i, OneRegisterTrueOnlineViewModel oneRegisterTrueOnlineViewModel, State<? extends List<String>> state, State<String> state2, State<? extends List<Boolean>> state3, MutableState<Integer> mutableState, MutableState<Boolean> mutableState2) {
            super(0);
            this.$idCardTypeIndex = i;
            this.$viewModel = oneRegisterTrueOnlineViewModel;
            this.$idCardList$delegate = state;
            this.$idCardType$delegate = state2;
            this.$isCheckedExpiredList$delegate = state3;
            this.$dialogResId$delegate = mutableState;
            this.$isShowDialog$delegate = mutableState2;
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
                String obj = StringsKt__StringsKt.trim((String) OneTolNavGraphKt$oneTolNavGraph$1$3.invoke$lambda$2(this.$idCardList$delegate).get(this.$idCardTypeIndex)).toString();
                String invoke$lambda$1 = OneTolNavGraphKt$oneTolNavGraph$1$3.invoke$lambda$1(this.$idCardType$delegate);
                int hashCode = invoke$lambda$1.hashCode();
                if (hashCode != 1537) {
                    if (hashCode == 1541) {
                        if (!invoke$lambda$1.equals(IdDocumentType.PASSPORT_CARD)) {
                        }
                        new OneCommonOtherCardLengthRule().validate(obj);
                    } else if (hashCode == 1572) {
                        if (!invoke$lambda$1.equals("15")) {
                        }
                        new OneCommonOtherCardLengthRule().validate(obj);
                    }
                } else if (invoke$lambda$1.equals("01")) {
                    new OneCommonPersonIdLengthRule().validate(obj);
                    new OneCommonPersonIdCheckSumRule().validate(obj);
                }
                Boolean bool = (Boolean) OneTolNavGraphKt$oneTolNavGraph$1$3.invoke$lambda$3(this.$isCheckedExpiredList$delegate).get(this.$idCardTypeIndex);
                bool.booleanValue();
                new OneCommonIsExpired().validate(bool);
                this.$viewModel.validateIdCard();
            } catch (ValidatedRuleException e) {
                OneTolNavGraphKt$oneTolNavGraph$1$3.invoke$lambda$14(this.$dialogResId$delegate, e.getResId());
                OneTolNavGraphKt$oneTolNavGraph$1$3.invoke$lambda$11(this.$isShowDialog$delegate, true);
            }
        }
    }

    @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.screen.OneTolNavGraphKt$oneTolNavGraph$1$3$13 */
    /* loaded from: classes10.dex */
    public static final class C1527813 extends Lambda implements Function0<Unit> {
        final /* synthetic */ NavController $navController;
        final /* synthetic */ OneRegisterTrueOnlineTakePhotoViewModel $takePhotoViewModel;
        final /* synthetic */ OneRegisterTrueOnlineViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1527813(OneRegisterTrueOnlineTakePhotoViewModel oneRegisterTrueOnlineTakePhotoViewModel, OneRegisterTrueOnlineViewModel oneRegisterTrueOnlineViewModel, NavController navController) {
            super(0);
            this.$takePhotoViewModel = oneRegisterTrueOnlineTakePhotoViewModel;
            this.$viewModel = oneRegisterTrueOnlineViewModel;
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
            this.$takePhotoViewModel.setOptionalPhotoName(this.$viewModel.getNextOptionalPhotoName());
            this.$takePhotoViewModel.setOptionalPhotoStateTakePhoto();
            NavController.navigate$default(this.$navController, OneTolScreen.Tol.TakePhoto.Optional.ROUTE, null, null, 6, null);
        }
    }

    @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.screen.OneTolNavGraphKt$oneTolNavGraph$1$3$14 */
    /* loaded from: classes10.dex */
    public static final class C1527914 extends Lambda implements Function0<Unit> {
        final /* synthetic */ NavController $navController;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1527914(NavController navController) {
            super(0);
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
            NavController.navigate$default(this.$navController, OneTolScreen.Tol.TolPackage.ROUTE, null, null, 6, null);
        }
    }

    @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    @DebugMetadata(m29093c = "th.co.dtac.android.dtacone.view.appOne.tol.screen.OneTolNavGraphKt$oneTolNavGraph$1$3$15", m29092f = "OneTolNavGraph.kt", m29091i = {}, m29090l = {}, m29089m = "invokeSuspend", m29088n = {}, m29087s = {})
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.screen.OneTolNavGraphKt$oneTolNavGraph$1$3$15 */
    /* loaded from: classes10.dex */
    public static final class C1528015 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ NavController $navController;
        final /* synthetic */ State<ProductType> $productType$delegate;
        int label;

        @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
        /* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.screen.OneTolNavGraphKt$oneTolNavGraph$1$3$15$WhenMappings */
        /* loaded from: classes10.dex */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[ProductType.values().length];
                try {
                    iArr[ProductType.TWO_P.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[ProductType.FOUR_P_OTT.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[ProductType.THREE_P_OTT.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C1528015(NavController navController, State<? extends ProductType> state, Continuation<? super C1528015> continuation) {
            super(2, continuation);
            this.$navController = navController;
            this.$productType$delegate = state;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new C1528015(this.$navController, this.$productType$delegate, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            int i;
            AbstractC19782eg0.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                ProductType invoke$lambda$4 = OneTolNavGraphKt$oneTolNavGraph$1$3.invoke$lambda$4(this.$productType$delegate);
                if (invoke$lambda$4 == null) {
                    i = -1;
                } else {
                    i = WhenMappings.$EnumSwitchMapping$0[invoke$lambda$4.ordinal()];
                }
                if (i != 1 && i != 2) {
                    if (i != 3) {
                        NavController.navigate$default(this.$navController, OneTolScreen.Tol.TakePhoto.ROUTE, null, null, 6, null);
                    } else {
                        NavController.navigate$default(this.$navController, OneTolScreen.Tol.SelectNumber.TrueVisions.ROUTE, null, null, 6, null);
                    }
                } else {
                    NavController.navigate$default(this.$navController, OneTolScreen.Tol.SelectNumber.TrueMoveH.ROUTE, null, null, 6, null);
                }
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C1528015) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.screen.OneTolNavGraphKt$oneTolNavGraph$1$3$16 */
    /* loaded from: classes10.dex */
    public /* synthetic */ class C1528116 extends FunctionReferenceImpl implements Function0<Unit> {
        public C1528116(Object obj) {
            super(0, obj, OneRegisterTrueOnlineViewModel.class, "dismissIdCardValidateError", "dismissIdCardValidateError()V", 0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            ((OneRegisterTrueOnlineViewModel) this.receiver).dismissIdCardValidateError();
        }
    }

    @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.screen.OneTolNavGraphKt$oneTolNavGraph$1$3$17 */
    /* loaded from: classes10.dex */
    public /* synthetic */ class C1528217 extends FunctionReferenceImpl implements Function0<Unit> {
        public C1528217(Object obj) {
            super(0, obj, OneRegisterTrueOnlineViewModel.class, "dismissIdCardValidateError", "dismissIdCardValidateError()V", 0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            ((OneRegisterTrueOnlineViewModel) this.receiver).dismissIdCardValidateError();
        }
    }

    @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.screen.OneTolNavGraphKt$oneTolNavGraph$1$3$18 */
    /* loaded from: classes10.dex */
    public /* synthetic */ class C1528318 extends FunctionReferenceImpl implements Function0<Unit> {
        public C1528318(Object obj) {
            super(0, obj, OneRegisterTrueOnlineViewModel.class, "dismissIdCardValidateError", "dismissIdCardValidateError()V", 0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            ((OneRegisterTrueOnlineViewModel) this.receiver).dismissIdCardValidateError();
        }
    }

    @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.screen.OneTolNavGraphKt$oneTolNavGraph$1$3$6 */
    /* loaded from: classes10.dex */
    public /* synthetic */ class C152846 extends FunctionReferenceImpl implements Function0<Unit> {
        public C152846(Object obj) {
            super(0, obj, OneRegisterTrueOnlineIdCardReaderViewModel.class, "startFetchingCardDataLoop", "startFetchingCardDataLoop()V", 0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            ((OneRegisterTrueOnlineIdCardReaderViewModel) this.receiver).startFetchingCardDataLoop();
        }
    }

    @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.screen.OneTolNavGraphKt$oneTolNavGraph$1$3$7 */
    /* loaded from: classes10.dex */
    public /* synthetic */ class C152857 extends FunctionReferenceImpl implements Function0<Unit> {
        public C152857(Object obj) {
            super(0, obj, OneRegisterTrueOnlineIdCardReaderViewModel.class, "stopFetchingCardDataLoop", "stopFetchingCardDataLoop()V", 0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            ((OneRegisterTrueOnlineIdCardReaderViewModel) this.receiver).stopFetchingCardDataLoop();
        }
    }

    @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.screen.OneTolNavGraphKt$oneTolNavGraph$1$3$8 */
    /* loaded from: classes10.dex */
    public static final class C152868 extends Lambda implements Function1<IdCardInformationCollection, Unit> {
        final /* synthetic */ OneRegisterTrueOnlineViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C152868(OneRegisterTrueOnlineViewModel oneRegisterTrueOnlineViewModel) {
            super(1);
            this.$viewModel = oneRegisterTrueOnlineViewModel;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(IdCardInformationCollection idCardInformationCollection) {
            invoke2(idCardInformationCollection);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull IdCardInformationCollection it) {
            Intrinsics.checkNotNullParameter(it, "it");
            this.$viewModel.storeIdCardInformation(it);
        }
    }

    @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.screen.OneTolNavGraphKt$oneTolNavGraph$1$3$9 */
    /* loaded from: classes10.dex */
    public /* synthetic */ class C152879 extends FunctionReferenceImpl implements Function1<String, Unit> {
        public C152879(Object obj) {
            super(1, obj, OneRegisterTrueOnlineViewModel.class, "onIdCardTypeChange", "onIdCardTypeChange(Ljava/lang/String;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
            invoke2(str);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull String p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((OneRegisterTrueOnlineViewModel) this.receiver).onIdCardTypeChange(p0);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneTolNavGraphKt$oneTolNavGraph$1$3(OneRegisterTrueOnlineIdCardReaderViewModel oneRegisterTrueOnlineIdCardReaderViewModel, OneRegisterTrueOnlineViewModel oneRegisterTrueOnlineViewModel, OneRegisterTrueOnlineTakePhotoViewModel oneRegisterTrueOnlineTakePhotoViewModel, NavController navController) {
        super(4);
        this.$cardReaderViewModel = oneRegisterTrueOnlineIdCardReaderViewModel;
        this.$viewModel = oneRegisterTrueOnlineViewModel;
        this.$takePhotoViewModel = oneRegisterTrueOnlineTakePhotoViewModel;
        this.$navController = navController;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean invoke$lambda$0(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String invoke$lambda$1(State<String> state) {
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

    private static final IdCardValidateState invoke$lambda$15(State<? extends IdCardValidateState> state) {
        return state.getValue();
    }

    private static final boolean invoke$lambda$17(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$lambda$18(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<String> invoke$lambda$2(State<? extends List<String>> state) {
        return state.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<Boolean> invoke$lambda$3(State<? extends List<Boolean>> state) {
        return state.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ProductType invoke$lambda$4(State<? extends ProductType> state) {
        return state.getValue();
    }

    private static final IdCardReaderState invoke$lambda$5(State<? extends IdCardReaderState> state) {
        return state.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean invoke$lambda$7(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$lambda$8(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    @Override // kotlin.jvm.functions.Function4
    public /* bridge */ /* synthetic */ Unit invoke(AnimatedContentScope animatedContentScope, NavBackStackEntry navBackStackEntry, Composer composer, Integer num) {
        invoke(animatedContentScope, navBackStackEntry, composer, num.intValue());
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x0385  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x03c1  */
    /* JADX WARN: Removed duplicated region for block: B:73:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void invoke(@org.jetbrains.annotations.NotNull androidx.compose.animation.AnimatedContentScope r31, @org.jetbrains.annotations.NotNull androidx.navigation.NavBackStackEntry r32, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r33, int r34) {
        /*
            Method dump skipped, instructions count: 965
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: th.p047co.dtac.android.dtacone.view.appOne.tol.screen.OneTolNavGraphKt$oneTolNavGraph$1$3.invoke(androidx.compose.animation.AnimatedContentScope, androidx.navigation.NavBackStackEntry, androidx.compose.runtime.Composer, int):void");
    }
}