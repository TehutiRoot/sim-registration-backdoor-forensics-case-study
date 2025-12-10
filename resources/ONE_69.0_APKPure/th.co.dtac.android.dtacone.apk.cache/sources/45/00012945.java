package th.p047co.dtac.android.dtacone.view.activity.upPass.compose;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.navigation.NavHostController;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.viewmodel.upPass.state.ExitCallbackState;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.activity.upPass.compose.UpPassDemoScreenKt$UpPassDemoScreen$8 */
/* loaded from: classes10.dex */
public final class UpPassDemoScreenKt$UpPassDemoScreen$8 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$changed1;
    final /* synthetic */ int $$default;
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
    final /* synthetic */ Function0<Unit> $onBack;
    final /* synthetic */ Function0<Unit> $onEndFlow;
    final /* synthetic */ Function1<ExitCallbackState, Unit> $onExit;
    final /* synthetic */ Function1<Integer, Unit> $onFaceCompareTypeChange;
    final /* synthetic */ Function1<Integer, Unit> $onMaxAttemptChange;
    final /* synthetic */ Function1<Integer, Unit> $onOcrTypeChange;
    final /* synthetic */ Function0<Unit> $onSelectOptionsNextClick;
    final /* synthetic */ Function1<Integer, Unit> $onThemeChange;
    final /* synthetic */ int $themeSelectedIndex;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public UpPassDemoScreenKt$UpPassDemoScreen$8(int i, int i2, List<String> list, int i3, boolean z, int i4, boolean z2, NavHostController navHostController, Function1<? super Integer, Unit> function1, Function1<? super Integer, Unit> function12, Function1<? super List<String>, Unit> function13, Function1<? super Integer, Unit> function14, Function1<? super Boolean, Unit> function15, Function1<? super Integer, Unit> function16, Function1<? super Boolean, Unit> function17, Function0<Unit> function0, Function0<Unit> function02, Function1<? super ExitCallbackState, Unit> function18, Function0<Unit> function03, int i5, int i6, int i7) {
        super(2);
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
        this.$onBack = function02;
        this.$onExit = function18;
        this.$onEndFlow = function03;
        this.$$changed = i5;
        this.$$changed1 = i6;
        this.$$default = i7;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(@Nullable Composer composer, int i) {
        UpPassDemoScreenKt.UpPassDemoScreen(this.$themeSelectedIndex, this.$ocrSelectedIndex, this.$allowDocumentType, this.$faceCompareSelectedIndex, this.$allowManualKYC, this.$maxAttempt, this.$allowManualKYC2ndLine, this.$navController, this.$onThemeChange, this.$onOcrTypeChange, this.$onAllowDocumentTypeChange, this.$onFaceCompareTypeChange, this.$onAllowManualKYCChange, this.$onMaxAttemptChange, this.$onAllowManualKYC2ndLineChange, this.$onSelectOptionsNextClick, this.$onBack, this.$onExit, this.$onEndFlow, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), RecomposeScopeImplKt.updateChangedFlags(this.$$changed1), this.$$default);
    }
}