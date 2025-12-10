package th.p047co.dtac.android.dtacone.view.activity.upPass.compose;

import androidx.compose.animation.AnimatedContentTransitionScope;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.ExitTransition;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavGraphBuilder;
import androidx.navigation.NavHostController;
import androidx.navigation.compose.NavHostKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import okhttp3.internal.p026ws.WebSocketProtocol;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.model.upPass.UpPassFormResult;
import th.p047co.dtac.android.dtacone.view.compose.upPassDemo.UpPassDemoNavGraphKt;
import th.p047co.dtac.android.dtacone.view.compose.upPassDemo.model.UpPassDemoScreen;
import th.p047co.dtac.android.dtacone.viewmodel.upPass.state.ExitCallbackState;
import th.p047co.dtac.android.dtacone.widget.compose.common.OneDialogKt;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
@SourceDebugExtension({"SMAP\nUpPassDemoScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UpPassDemoScreen.kt\nth/co/dtac/android/dtacone/view/activity/upPass/compose/UpPassDemoScreenKt$UpPassDemoScreen$7\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,147:1\n25#2:148\n1097#3,6:149\n81#4:155\n107#4,2:156\n*S KotlinDebug\n*F\n+ 1 UpPassDemoScreen.kt\nth/co/dtac/android/dtacone/view/activity/upPass/compose/UpPassDemoScreenKt$UpPassDemoScreen$7\n*L\n75#1:148\n75#1:149,6\n75#1:155\n75#1:156,2\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.view.activity.upPass.compose.UpPassDemoScreenKt$UpPassDemoScreen$7 */
/* loaded from: classes10.dex */
public final class UpPassDemoScreenKt$UpPassDemoScreen$7 extends Lambda implements Function3<PaddingValues, Composer, Integer, Unit> {
    final /* synthetic */ List<String> $allowDocumentType;
    final /* synthetic */ boolean $allowManualKYC;
    final /* synthetic */ boolean $allowManualKYC2ndLine;
    final /* synthetic */ int $faceCompareSelectedIndex;
    final /* synthetic */ int $maxAttempt;
    final /* synthetic */ NavHostController $navController;
    final /* synthetic */ int $ocrSelectedIndex;
    final /* synthetic */ Function1<List<String>, Unit> $onAllowDocumentTypeChange;
    final /* synthetic */ Function1<Boolean, Unit> $onAllowManualKYC2ndLineChange;
    final /* synthetic */ Function1<Boolean, Unit> $onAllowManualKYCChange;
    final /* synthetic */ Function0<Unit> $onEndFlow;
    final /* synthetic */ Function1<ExitCallbackState, Unit> $onExit;
    final /* synthetic */ Function1<Integer, Unit> $onFaceCompareTypeChange;
    final /* synthetic */ Function1<Integer, Unit> $onMaxAttemptChange;
    final /* synthetic */ Function1<Integer, Unit> $onOcrTypeChange;
    final /* synthetic */ Function0<Unit> $onSelectOptionsNextClick;
    final /* synthetic */ Function1<Integer, Unit> $onThemeChange;
    final /* synthetic */ int $themeSelectedIndex;

    @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    @SourceDebugExtension({"SMAP\nUpPassDemoScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UpPassDemoScreen.kt\nth/co/dtac/android/dtacone/view/activity/upPass/compose/UpPassDemoScreenKt$UpPassDemoScreen$7$1\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,147:1\n25#2:148\n1097#3,6:149\n81#4:155\n107#4,2:156\n*S KotlinDebug\n*F\n+ 1 UpPassDemoScreen.kt\nth/co/dtac/android/dtacone/view/activity/upPass/compose/UpPassDemoScreenKt$UpPassDemoScreen$7$1\n*L\n79#1:148\n79#1:149,6\n79#1:155\n79#1:156,2\n*E\n"})
    /* renamed from: th.co.dtac.android.dtacone.view.activity.upPass.compose.UpPassDemoScreenKt$UpPassDemoScreen$7$1 */
    /* loaded from: classes10.dex */
    public static final class C144581 extends Lambda implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ List<String> $allowDocumentType;
        final /* synthetic */ boolean $allowManualKYC;
        final /* synthetic */ boolean $allowManualKYC2ndLine;
        final /* synthetic */ int $faceCompareSelectedIndex;
        final /* synthetic */ int $maxAttempt;
        final /* synthetic */ NavHostController $navController;
        final /* synthetic */ int $ocrSelectedIndex;
        final /* synthetic */ Function1<List<String>, Unit> $onAllowDocumentTypeChange;
        final /* synthetic */ Function1<Boolean, Unit> $onAllowManualKYC2ndLineChange;
        final /* synthetic */ Function1<Boolean, Unit> $onAllowManualKYCChange;
        final /* synthetic */ Ref.ObjectRef<Function0<Unit>> $onDismiss;
        final /* synthetic */ Function0<Unit> $onEndFlow;
        final /* synthetic */ Function1<ExitCallbackState, Unit> $onExit;
        final /* synthetic */ Function1<Integer, Unit> $onFaceCompareTypeChange;
        final /* synthetic */ Function1<Integer, Unit> $onMaxAttemptChange;
        final /* synthetic */ Function1<Integer, Unit> $onOcrTypeChange;
        final /* synthetic */ Function0<Unit> $onSelectOptionsNextClick;
        final /* synthetic */ Function1<Integer, Unit> $onThemeChange;
        final /* synthetic */ PaddingValues $paddingValues;
        final /* synthetic */ MutableState<Boolean> $showTakeMorePhotoDialog$delegate;
        final /* synthetic */ int $themeSelectedIndex;

        @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
        /* renamed from: th.co.dtac.android.dtacone.view.activity.upPass.compose.UpPassDemoScreenKt$UpPassDemoScreen$7$1$1 */
        /* loaded from: classes10.dex */
        public static final class C144591 extends Lambda implements Function1<AnimatedContentTransitionScope<NavBackStackEntry>, EnterTransition> {
            public static final C144591 INSTANCE = new C144591();

            @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
            /* renamed from: th.co.dtac.android.dtacone.view.activity.upPass.compose.UpPassDemoScreenKt$UpPassDemoScreen$7$1$1$1 */
            /* loaded from: classes10.dex */
            public static final class C144601 extends Lambda implements Function1<Integer, Integer> {
                public static final C144601 INSTANCE = new C144601();

                public C144601() {
                    super(1);
                }

                @NotNull
                public final Integer invoke(int i) {
                    return Integer.valueOf(i);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
                    return invoke(num.intValue());
                }
            }

            public C144591() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final EnterTransition invoke(@NotNull AnimatedContentTransitionScope<NavBackStackEntry> NavHost) {
                Intrinsics.checkNotNullParameter(NavHost, "$this$NavHost");
                return EnterExitTransitionKt.slideInHorizontally$default(null, C144601.INSTANCE, 1, null).plus(EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null));
            }
        }

        @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
        /* renamed from: th.co.dtac.android.dtacone.view.activity.upPass.compose.UpPassDemoScreenKt$UpPassDemoScreen$7$1$2 */
        /* loaded from: classes10.dex */
        public static final class C144612 extends Lambda implements Function1<AnimatedContentTransitionScope<NavBackStackEntry>, ExitTransition> {
            public static final C144612 INSTANCE = new C144612();

            @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
            /* renamed from: th.co.dtac.android.dtacone.view.activity.upPass.compose.UpPassDemoScreenKt$UpPassDemoScreen$7$1$2$1 */
            /* loaded from: classes10.dex */
            public static final class C144621 extends Lambda implements Function1<Integer, Integer> {
                public static final C144621 INSTANCE = new C144621();

                public C144621() {
                    super(1);
                }

                @NotNull
                public final Integer invoke(int i) {
                    return Integer.valueOf(-i);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
                    return invoke(num.intValue());
                }
            }

            public C144612() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final ExitTransition invoke(@NotNull AnimatedContentTransitionScope<NavBackStackEntry> NavHost) {
                Intrinsics.checkNotNullParameter(NavHost, "$this$NavHost");
                return EnterExitTransitionKt.slideOutHorizontally$default(null, C144621.INSTANCE, 1, null).plus(EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null));
            }
        }

        @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
        /* renamed from: th.co.dtac.android.dtacone.view.activity.upPass.compose.UpPassDemoScreenKt$UpPassDemoScreen$7$1$3 */
        /* loaded from: classes10.dex */
        public static final class C144633 extends Lambda implements Function1<AnimatedContentTransitionScope<NavBackStackEntry>, EnterTransition> {
            public static final C144633 INSTANCE = new C144633();

            @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
            /* renamed from: th.co.dtac.android.dtacone.view.activity.upPass.compose.UpPassDemoScreenKt$UpPassDemoScreen$7$1$3$1 */
            /* loaded from: classes10.dex */
            public static final class C144641 extends Lambda implements Function1<Integer, Integer> {
                public static final C144641 INSTANCE = new C144641();

                public C144641() {
                    super(1);
                }

                @NotNull
                public final Integer invoke(int i) {
                    return Integer.valueOf(-i);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
                    return invoke(num.intValue());
                }
            }

            public C144633() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final EnterTransition invoke(@NotNull AnimatedContentTransitionScope<NavBackStackEntry> NavHost) {
                Intrinsics.checkNotNullParameter(NavHost, "$this$NavHost");
                return EnterExitTransitionKt.slideInHorizontally$default(null, C144641.INSTANCE, 1, null).plus(EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null));
            }
        }

        @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
        /* renamed from: th.co.dtac.android.dtacone.view.activity.upPass.compose.UpPassDemoScreenKt$UpPassDemoScreen$7$1$4 */
        /* loaded from: classes10.dex */
        public static final class C144654 extends Lambda implements Function1<AnimatedContentTransitionScope<NavBackStackEntry>, ExitTransition> {
            public static final C144654 INSTANCE = new C144654();

            @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
            /* renamed from: th.co.dtac.android.dtacone.view.activity.upPass.compose.UpPassDemoScreenKt$UpPassDemoScreen$7$1$4$1 */
            /* loaded from: classes10.dex */
            public static final class C144661 extends Lambda implements Function1<Integer, Integer> {
                public static final C144661 INSTANCE = new C144661();

                public C144661() {
                    super(1);
                }

                @NotNull
                public final Integer invoke(int i) {
                    return Integer.valueOf(i);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
                    return invoke(num.intValue());
                }
            }

            public C144654() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final ExitTransition invoke(@NotNull AnimatedContentTransitionScope<NavBackStackEntry> NavHost) {
                Intrinsics.checkNotNullParameter(NavHost, "$this$NavHost");
                return EnterExitTransitionKt.slideOutHorizontally$default(null, C144661.INSTANCE, 1, null).plus(EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null));
            }
        }

        @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
        /* renamed from: th.co.dtac.android.dtacone.view.activity.upPass.compose.UpPassDemoScreenKt$UpPassDemoScreen$7$1$5 */
        /* loaded from: classes10.dex */
        public static final class C144675 extends Lambda implements Function1<NavGraphBuilder, Unit> {
            final /* synthetic */ List<String> $allowDocumentType;
            final /* synthetic */ boolean $allowManualKYC;
            final /* synthetic */ boolean $allowManualKYC2ndLine;
            final /* synthetic */ String $defaultTakeMorePhotoMessage;
            final /* synthetic */ int $faceCompareSelectedIndex;
            final /* synthetic */ int $maxAttempt;
            final /* synthetic */ NavHostController $navController;
            final /* synthetic */ int $ocrSelectedIndex;
            final /* synthetic */ Function1<List<String>, Unit> $onAllowDocumentTypeChange;
            final /* synthetic */ Function1<Boolean, Unit> $onAllowManualKYC2ndLineChange;
            final /* synthetic */ Function1<Boolean, Unit> $onAllowManualKYCChange;
            final /* synthetic */ Ref.ObjectRef<Function0<Unit>> $onDismiss;
            final /* synthetic */ Function0<Unit> $onEndFlow;
            final /* synthetic */ Function1<ExitCallbackState, Unit> $onExit;
            final /* synthetic */ Function1<Integer, Unit> $onFaceCompareTypeChange;
            final /* synthetic */ Function1<Integer, Unit> $onMaxAttemptChange;
            final /* synthetic */ Function1<Integer, Unit> $onOcrTypeChange;
            final /* synthetic */ Function0<Unit> $onSelectOptionsNextClick;
            final /* synthetic */ Function1<Integer, Unit> $onThemeChange;
            final /* synthetic */ MutableState<Boolean> $showTakeMorePhotoDialog$delegate;
            final /* synthetic */ MutableState<String> $takeMorePhotoMessage$delegate;
            final /* synthetic */ int $themeSelectedIndex;

            @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
            /* renamed from: th.co.dtac.android.dtacone.view.activity.upPass.compose.UpPassDemoScreenKt$UpPassDemoScreen$7$1$5$1 */
            /* loaded from: classes10.dex */
            public static final class C144681 extends Lambda implements Function2<UpPassFormResult, Function0<? extends Unit>, Unit> {
                final /* synthetic */ String $defaultTakeMorePhotoMessage;
                final /* synthetic */ Ref.ObjectRef<Function0<Unit>> $onDismiss;
                final /* synthetic */ MutableState<Boolean> $showTakeMorePhotoDialog$delegate;
                final /* synthetic */ MutableState<String> $takeMorePhotoMessage$delegate;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C144681(String str, Ref.ObjectRef<Function0<Unit>> objectRef, MutableState<String> mutableState, MutableState<Boolean> mutableState2) {
                    super(2);
                    this.$defaultTakeMorePhotoMessage = str;
                    this.$onDismiss = objectRef;
                    this.$takeMorePhotoMessage$delegate = mutableState;
                    this.$showTakeMorePhotoDialog$delegate = mutableState2;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(UpPassFormResult upPassFormResult, Function0<? extends Unit> function0) {
                    invoke2(upPassFormResult, (Function0<Unit>) function0);
                    return Unit.INSTANCE;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull UpPassFormResult faceCompareResult, @NotNull Function0<Unit> callBack) {
                    String str;
                    Intrinsics.checkNotNullParameter(faceCompareResult, "faceCompareResult");
                    Intrinsics.checkNotNullParameter(callBack, "callBack");
                    MutableState<String> mutableState = this.$takeMorePhotoMessage$delegate;
                    if (faceCompareResult.getFaceCompare() != null && faceCompareResult.getFaceCompare().getManualKYC2ndLine() && faceCompareResult.getFaceCompare().getManualKYC2ndLineSuccess() && faceCompareResult.getFaceCompare().getManualKYC2ndLineApproved()) {
                        str = "ทีมหลังบ้านตรวจสอบเรียบร้อย\nข้อมูลยืนยันตัวตนถูกต้อง\n\n" + this.$defaultTakeMorePhotoMessage;
                    } else {
                        str = this.$defaultTakeMorePhotoMessage;
                    }
                    C144581.invoke$lambda$2(mutableState, str);
                    UpPassDemoScreenKt$UpPassDemoScreen$7.invoke$lambda$2(this.$showTakeMorePhotoDialog$delegate, true);
                    this.$onDismiss.element = callBack;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C144675(int i, int i2, List<String> list, int i3, boolean z, int i4, boolean z2, NavHostController navHostController, Function1<? super Integer, Unit> function1, Function1<? super Integer, Unit> function12, Function1<? super List<String>, Unit> function13, Function1<? super Integer, Unit> function14, Function1<? super Boolean, Unit> function15, Function1<? super Integer, Unit> function16, Function1<? super Boolean, Unit> function17, Function0<Unit> function0, Function1<? super ExitCallbackState, Unit> function18, Function0<Unit> function02, String str, Ref.ObjectRef<Function0<Unit>> objectRef, MutableState<String> mutableState, MutableState<Boolean> mutableState2) {
                super(1);
                this.$themeSelectedIndex = i;
                this.$ocrSelectedIndex = i2;
                this.$allowDocumentType = list;
                this.$faceCompareSelectedIndex = i3;
                this.$allowManualKYC = z;
                this.$maxAttempt = i4;
                this.$allowManualKYC2ndLine = z2;
                this.$navController = navHostController;
                this.$onThemeChange = function1;
                this.$onOcrTypeChange = function12;
                this.$onAllowDocumentTypeChange = function13;
                this.$onFaceCompareTypeChange = function14;
                this.$onAllowManualKYCChange = function15;
                this.$onMaxAttemptChange = function16;
                this.$onAllowManualKYC2ndLineChange = function17;
                this.$onSelectOptionsNextClick = function0;
                this.$onExit = function18;
                this.$onEndFlow = function02;
                this.$defaultTakeMorePhotoMessage = str;
                this.$onDismiss = objectRef;
                this.$takeMorePhotoMessage$delegate = mutableState;
                this.$showTakeMorePhotoDialog$delegate = mutableState2;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(NavGraphBuilder navGraphBuilder) {
                invoke2(navGraphBuilder);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull NavGraphBuilder NavHost) {
                Intrinsics.checkNotNullParameter(NavHost, "$this$NavHost");
                UpPassDemoNavGraphKt.upPassDemoNavGraph(NavHost, this.$themeSelectedIndex, this.$ocrSelectedIndex, this.$allowDocumentType, this.$faceCompareSelectedIndex, this.$allowManualKYC, this.$maxAttempt, this.$allowManualKYC2ndLine, this.$navController, this.$onThemeChange, this.$onOcrTypeChange, this.$onAllowDocumentTypeChange, this.$onFaceCompareTypeChange, this.$onAllowManualKYCChange, this.$onMaxAttemptChange, this.$onAllowManualKYC2ndLineChange, this.$onSelectOptionsNextClick, new C144681(this.$defaultTakeMorePhotoMessage, this.$onDismiss, this.$takeMorePhotoMessage$delegate, this.$showTakeMorePhotoDialog$delegate), this.$onExit, this.$onEndFlow);
            }
        }

        @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
        /* renamed from: th.co.dtac.android.dtacone.view.activity.upPass.compose.UpPassDemoScreenKt$UpPassDemoScreen$7$1$6 */
        /* loaded from: classes10.dex */
        public static final class C144696 extends Lambda implements Function0<Unit> {
            final /* synthetic */ Ref.ObjectRef<Function0<Unit>> $onDismiss;
            final /* synthetic */ MutableState<Boolean> $showTakeMorePhotoDialog$delegate;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C144696(Ref.ObjectRef<Function0<Unit>> objectRef, MutableState<Boolean> mutableState) {
                super(0);
                this.$onDismiss = objectRef;
                this.$showTakeMorePhotoDialog$delegate = mutableState;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2() {
                UpPassDemoScreenKt$UpPassDemoScreen$7.invoke$lambda$2(this.$showTakeMorePhotoDialog$delegate, false);
                this.$onDismiss.element.invoke();
            }
        }

        @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
        /* renamed from: th.co.dtac.android.dtacone.view.activity.upPass.compose.UpPassDemoScreenKt$UpPassDemoScreen$7$1$7 */
        /* loaded from: classes10.dex */
        public static final class C144707 extends Lambda implements Function0<Unit> {
            final /* synthetic */ Ref.ObjectRef<Function0<Unit>> $onDismiss;
            final /* synthetic */ MutableState<Boolean> $showTakeMorePhotoDialog$delegate;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C144707(Ref.ObjectRef<Function0<Unit>> objectRef, MutableState<Boolean> mutableState) {
                super(0);
                this.$onDismiss = objectRef;
                this.$showTakeMorePhotoDialog$delegate = mutableState;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2() {
                UpPassDemoScreenKt$UpPassDemoScreen$7.invoke$lambda$2(this.$showTakeMorePhotoDialog$delegate, false);
                this.$onDismiss.element.invoke();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C144581(NavHostController navHostController, PaddingValues paddingValues, int i, int i2, List<String> list, int i3, boolean z, int i4, boolean z2, Function1<? super Integer, Unit> function1, Function1<? super Integer, Unit> function12, Function1<? super List<String>, Unit> function13, Function1<? super Integer, Unit> function14, Function1<? super Boolean, Unit> function15, Function1<? super Integer, Unit> function16, Function1<? super Boolean, Unit> function17, Function0<Unit> function0, Function1<? super ExitCallbackState, Unit> function18, Function0<Unit> function02, Ref.ObjectRef<Function0<Unit>> objectRef, MutableState<Boolean> mutableState) {
            super(2);
            this.$navController = navHostController;
            this.$paddingValues = paddingValues;
            this.$themeSelectedIndex = i;
            this.$ocrSelectedIndex = i2;
            this.$allowDocumentType = list;
            this.$faceCompareSelectedIndex = i3;
            this.$allowManualKYC = z;
            this.$maxAttempt = i4;
            this.$allowManualKYC2ndLine = z2;
            this.$onThemeChange = function1;
            this.$onOcrTypeChange = function12;
            this.$onAllowDocumentTypeChange = function13;
            this.$onFaceCompareTypeChange = function14;
            this.$onAllowManualKYCChange = function15;
            this.$onMaxAttemptChange = function16;
            this.$onAllowManualKYC2ndLineChange = function17;
            this.$onSelectOptionsNextClick = function0;
            this.$onExit = function18;
            this.$onEndFlow = function02;
            this.$onDismiss = objectRef;
            this.$showTakeMorePhotoDialog$delegate = mutableState;
        }

        private static final String invoke$lambda$1(MutableState<String> mutableState) {
            return mutableState.getValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invoke$lambda$2(MutableState<String> mutableState, String str) {
            mutableState.setValue(str);
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
                ComposerKt.traceEventStart(-1113001830, i, -1, "th.co.dtac.android.dtacone.view.activity.upPass.compose.UpPassDemoScreen.<anonymous>.<anonymous> (UpPassDemoScreen.kt:76)");
            }
            String stringResource = StringResources_androidKt.stringResource(R.string.up_pass_take_more_photo_message, composer, 0);
            composer.startReplaceableGroup(-492369756);
            Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = AbstractC19036aL1.m65148g(stringResource, null, 2, null);
                composer.updateRememberedValue(rememberedValue);
            }
            composer.endReplaceableGroup();
            MutableState mutableState = (MutableState) rememberedValue;
            NavHostKt.NavHost(this.$navController, UpPassDemoScreen.UpPassDemo.ROUTE, PaddingKt.padding(Modifier.Companion, this.$paddingValues), null, null, C144591.INSTANCE, C144612.INSTANCE, C144633.INSTANCE, C144654.INSTANCE, new C144675(this.$themeSelectedIndex, this.$ocrSelectedIndex, this.$allowDocumentType, this.$faceCompareSelectedIndex, this.$allowManualKYC, this.$maxAttempt, this.$allowManualKYC2ndLine, this.$navController, this.$onThemeChange, this.$onOcrTypeChange, this.$onAllowDocumentTypeChange, this.$onFaceCompareTypeChange, this.$onAllowManualKYCChange, this.$onMaxAttemptChange, this.$onAllowManualKYC2ndLineChange, this.$onSelectOptionsNextClick, this.$onExit, this.$onEndFlow, stringResource, this.$onDismiss, mutableState, this.$showTakeMorePhotoDialog$delegate), composer, 115015736, 24);
            if (UpPassDemoScreenKt$UpPassDemoScreen$7.invoke$lambda$1(this.$showTakeMorePhotoDialog$delegate)) {
                OneDialogKt.OneDialogChooser(invoke$lambda$1(mutableState), StringResources_androidKt.stringResource(R.string.nextStep, composer, 0), StringResources_androidKt.stringResource(R.string.takeMorePhoto, composer, 0), new C144696(this.$onDismiss, this.$showTakeMorePhotoDialog$delegate), new C144707(this.$onDismiss, this.$showTakeMorePhotoDialog$delegate), composer, 0, 0);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public UpPassDemoScreenKt$UpPassDemoScreen$7(NavHostController navHostController, int i, int i2, List<String> list, int i3, boolean z, int i4, boolean z2, Function1<? super Integer, Unit> function1, Function1<? super Integer, Unit> function12, Function1<? super List<String>, Unit> function13, Function1<? super Integer, Unit> function14, Function1<? super Boolean, Unit> function15, Function1<? super Integer, Unit> function16, Function1<? super Boolean, Unit> function17, Function0<Unit> function0, Function1<? super ExitCallbackState, Unit> function18, Function0<Unit> function02) {
        super(3);
        this.$navController = navHostController;
        this.$themeSelectedIndex = i;
        this.$ocrSelectedIndex = i2;
        this.$allowDocumentType = list;
        this.$faceCompareSelectedIndex = i3;
        this.$allowManualKYC = z;
        this.$maxAttempt = i4;
        this.$allowManualKYC2ndLine = z2;
        this.$onThemeChange = function1;
        this.$onOcrTypeChange = function12;
        this.$onAllowDocumentTypeChange = function13;
        this.$onFaceCompareTypeChange = function14;
        this.$onAllowManualKYCChange = function15;
        this.$onMaxAttemptChange = function16;
        this.$onAllowManualKYC2ndLineChange = function17;
        this.$onSelectOptionsNextClick = function0;
        this.$onExit = function18;
        this.$onEndFlow = function02;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean invoke$lambda$1(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$lambda$2(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer, Integer num) {
        invoke(paddingValues, composer, num.intValue());
        return Unit.INSTANCE;
    }

    /* JADX WARN: Type inference failed for: r2v8, types: [th.co.dtac.android.dtacone.view.activity.upPass.compose.UpPassDemoScreenKt$UpPassDemoScreen$7$onDismiss$1, T] */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void invoke(@NotNull PaddingValues paddingValues, @Nullable Composer composer, int i) {
        int i2;
        Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
        if ((i & 14) == 0) {
            i2 = (composer.changed(paddingValues) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 91) == 18 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1734669227, i, -1, "th.co.dtac.android.dtacone.view.activity.upPass.compose.UpPassDemoScreen.<anonymous> (UpPassDemoScreen.kt:73)");
        }
        composer.startReplaceableGroup(-492369756);
        Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = AbstractC19036aL1.m65148g(Boolean.FALSE, null, 2, null);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = UpPassDemoScreenKt$UpPassDemoScreen$7$onDismiss$1.INSTANCE;
        SurfaceKt.m70812SurfaceT9BRK9s(SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, null), null, 0L, 0L, 0.0f, 0.0f, null, ComposableLambdaKt.composableLambda(composer, -1113001830, true, new C144581(this.$navController, paddingValues, this.$themeSelectedIndex, this.$ocrSelectedIndex, this.$allowDocumentType, this.$faceCompareSelectedIndex, this.$allowManualKYC, this.$maxAttempt, this.$allowManualKYC2ndLine, this.$onThemeChange, this.$onOcrTypeChange, this.$onAllowDocumentTypeChange, this.$onFaceCompareTypeChange, this.$onAllowManualKYCChange, this.$onMaxAttemptChange, this.$onAllowManualKYC2ndLineChange, this.$onSelectOptionsNextClick, this.$onExit, this.$onEndFlow, objectRef, (MutableState) rememberedValue)), composer, 12582918, WebSocketProtocol.PAYLOAD_SHORT);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}