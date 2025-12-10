package th.p047co.dtac.android.dtacone.view.compose.upPassDemo;

import android.content.Context;
import androidx.activity.compose.ActivityResultRegistryKt;
import androidx.activity.compose.ManagedActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.compose.animation.AnimatedContentScope;
import androidx.compose.p003ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.core.content.PermissionChecker;
import androidx.navigation.NavBackStackEntry;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.view.fragment.upPass.compose.SelectOptionsScreenKt;
import th.p047co.dtac.android.dtacone.widget.compose.common.OneDialogKt;

@Metadata(m29143d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u000b¢\u0006\u0004\b\u0005\u0010\u0006"}, m29142d2 = {"<anonymous>", "", "Landroidx/compose/animation/AnimatedContentScope;", "it", "Landroidx/navigation/NavBackStackEntry;", "invoke", "(Landroidx/compose/animation/AnimatedContentScope;Landroidx/navigation/NavBackStackEntry;Landroidx/compose/runtime/Composer;I)V"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
@SourceDebugExtension({"SMAP\nUpPassDemoNavGraph.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UpPassDemoNavGraph.kt\nth/co/dtac/android/dtacone/view/compose/upPassDemo/UpPassDemoNavGraphKt$upPassDemoNavGraph$12$1\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,140:1\n76#2:141\n25#3:142\n50#3:149\n49#3:150\n50#3:157\n49#3:158\n36#3:165\n1097#4,6:143\n1097#4,6:151\n1097#4,6:159\n1097#4,6:166\n81#5:172\n107#5,2:173\n*S KotlinDebug\n*F\n+ 1 UpPassDemoNavGraph.kt\nth/co/dtac/android/dtacone/view/compose/upPassDemo/UpPassDemoNavGraphKt$upPassDemoNavGraph$12$1\n*L\n53#1:141\n54#1:142\n59#1:149\n59#1:150\n95#1:157\n95#1:158\n94#1:165\n54#1:143,6\n59#1:151,6\n95#1:159,6\n94#1:166,6\n54#1:172\n54#1:173,2\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.view.compose.upPassDemo.UpPassDemoNavGraphKt$upPassDemoNavGraph$12$1 */
/* loaded from: classes10.dex */
public final class UpPassDemoNavGraphKt$upPassDemoNavGraph$12$1 extends Lambda implements Function4<AnimatedContentScope, NavBackStackEntry, Composer, Integer, Unit> {
    final /* synthetic */ List<String> $allowDocumentType;
    final /* synthetic */ boolean $allowManualKYC;
    final /* synthetic */ boolean $allowManualKYC2ndLine;
    final /* synthetic */ int $faceCompareSelectedIndex;
    final /* synthetic */ int $maxAttempt;
    final /* synthetic */ int $ocrSelectedIndex;
    final /* synthetic */ Function1<List<String>, Unit> $onAllowDocumentTypeChange;
    final /* synthetic */ Function1<Boolean, Unit> $onAllowManualKYC2ndLineChange;
    final /* synthetic */ Function1<Boolean, Unit> $onAllowManualKYCChange;
    final /* synthetic */ Function1<Integer, Unit> $onFaceCompareTypeChange;
    final /* synthetic */ Function1<Integer, Unit> $onMaxAttemptChange;
    final /* synthetic */ Function1<Integer, Unit> $onOcrTypeChange;
    final /* synthetic */ Function0<Unit> $onSelectOptionsNextClick;
    final /* synthetic */ Function1<Integer, Unit> $onThemeChange;
    final /* synthetic */ int $themeSelectedIndex;

    @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.view.compose.upPassDemo.UpPassDemoNavGraphKt$upPassDemoNavGraph$12$1$1 */
    /* loaded from: classes10.dex */
    public static final class C158751 extends Lambda implements Function0<Unit> {
        final /* synthetic */ String $cameraPermission;
        final /* synthetic */ Context $context;
        final /* synthetic */ Function0<Unit> $onSelectOptionsNextClick;
        final /* synthetic */ ManagedActivityResultLauncher<String, Boolean> $requestPermissionLauncher;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C158751(Context context, String str, Function0<Unit> function0, ManagedActivityResultLauncher<String, Boolean> managedActivityResultLauncher) {
            super(0);
            this.$context = context;
            this.$cameraPermission = str;
            this.$onSelectOptionsNextClick = function0;
            this.$requestPermissionLauncher = managedActivityResultLauncher;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            if (PermissionChecker.checkSelfPermission(this.$context, this.$cameraPermission) == 0) {
                this.$onSelectOptionsNextClick.invoke();
            } else {
                this.$requestPermissionLauncher.launch(this.$cameraPermission);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public UpPassDemoNavGraphKt$upPassDemoNavGraph$12$1(Function0<Unit> function0, int i, int i2, List<String> list, int i3, boolean z, int i4, boolean z2, Function1<? super Integer, Unit> function1, Function1<? super Integer, Unit> function12, Function1<? super List<String>, Unit> function13, Function1<? super Integer, Unit> function14, Function1<? super Boolean, Unit> function15, Function1<? super Integer, Unit> function16, Function1<? super Boolean, Unit> function17) {
        super(4);
        this.$onSelectOptionsNextClick = function0;
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
    }

    private static final boolean invoke$lambda$1(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$lambda$2(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
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
            ComposerKt.traceEventStart(518634100, i, -1, "th.co.dtac.android.dtacone.view.compose.upPassDemo.upPassDemoNavGraph.<anonymous>.<anonymous> (UpPassDemoNavGraph.kt:51)");
        }
        Context context = (Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext());
        composer.startReplaceableGroup(-492369756);
        Object rememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.Companion;
        if (rememberedValue == companion.getEmpty()) {
            rememberedValue = AbstractC19036aL1.m65148g(Boolean.FALSE, null, 2, null);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        MutableState mutableState = (MutableState) rememberedValue;
        ActivityResultContracts.RequestPermission requestPermission = new ActivityResultContracts.RequestPermission();
        Function0<Unit> function0 = this.$onSelectOptionsNextClick;
        composer.startReplaceableGroup(511388516);
        boolean changed = composer.changed(function0) | composer.changed(mutableState);
        Object rememberedValue2 = composer.rememberedValue();
        if (changed || rememberedValue2 == companion.getEmpty()) {
            rememberedValue2 = new C15876xae528cb(function0, mutableState);
            composer.updateRememberedValue(rememberedValue2);
        }
        composer.endReplaceableGroup();
        SelectOptionsScreenKt.SelectOptionsScreen(this.$themeSelectedIndex, this.$ocrSelectedIndex, this.$allowDocumentType, this.$faceCompareSelectedIndex, this.$allowManualKYC, this.$maxAttempt, this.$allowManualKYC2ndLine, this.$onThemeChange, this.$onOcrTypeChange, this.$onAllowDocumentTypeChange, this.$onFaceCompareTypeChange, this.$onAllowManualKYCChange, this.$onMaxAttemptChange, this.$onAllowManualKYC2ndLineChange, new C158751(context, "android.permission.CAMERA", this.$onSelectOptionsNextClick, ActivityResultRegistryKt.rememberLauncherForActivityResult(requestPermission, (Function1) rememberedValue2, composer, 8)), composer, 512, 0, 0);
        if (invoke$lambda$1(mutableState)) {
            Function0<Unit> function02 = this.$onSelectOptionsNextClick;
            composer.startReplaceableGroup(511388516);
            boolean changed2 = composer.changed(mutableState) | composer.changed(function02);
            Object rememberedValue3 = composer.rememberedValue();
            if (changed2 || rememberedValue3 == companion.getEmpty()) {
                rememberedValue3 = new UpPassDemoNavGraphKt$upPassDemoNavGraph$12$1$2$1(function02, mutableState);
                composer.updateRememberedValue(rememberedValue3);
            }
            composer.endReplaceableGroup();
            Function0 function03 = (Function0) rememberedValue3;
            composer.startReplaceableGroup(1157296644);
            boolean changed3 = composer.changed(mutableState);
            Object rememberedValue4 = composer.rememberedValue();
            if (changed3 || rememberedValue4 == companion.getEmpty()) {
                rememberedValue4 = new UpPassDemoNavGraphKt$upPassDemoNavGraph$12$1$3$1(mutableState);
                composer.updateRememberedValue(rememberedValue4);
            }
            composer.endReplaceableGroup();
            OneDialogKt.OneDialogConfirm("ต้องการใช้สิทธิ์กล้อง\nแต่ไม่ได้รับสิทธิ์ใช้กล้อง\nต้องการไปต่อหรือไม่?", null, null, null, function03, (Function0) rememberedValue4, composer, 6, 14);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}