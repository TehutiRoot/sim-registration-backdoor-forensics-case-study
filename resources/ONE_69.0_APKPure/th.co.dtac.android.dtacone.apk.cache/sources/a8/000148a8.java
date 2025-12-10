package th.p047co.dtac.android.dtacone.view.compose.upPassDemo.navGraph;

import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.navigation.NavGraphBuilder;
import androidx.navigation.NavHostController;
import androidx.navigation.compose.NavGraphBuilderKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import okhttp3.internal.p026ws.WebSocketProtocol;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.model.upPass.UpPassFormOwnerType;
import th.p047co.dtac.android.dtacone.model.upPass.UpPassFormResult;
import th.p047co.dtac.android.dtacone.model.upPass.UpPassFormType;
import th.p047co.dtac.android.dtacone.view.compose.upPass.FaceCompareNavGraphKt;
import th.p047co.dtac.android.dtacone.view.compose.upPass.model.UpPassScreen;
import th.p047co.dtac.android.dtacone.view.compose.upPassDemo.model.UpPassDemoScreen;
import th.p047co.dtac.android.dtacone.viewmodel.upPass.state.ExitCallbackState;

@Metadata(m29143d1 = {"\u0000D\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0092\u0001\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u000e2 \b\u0002\u0010\u000f\u001a\u001a\u0012\u0004\u0012\u00020\u0011\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0012\u0012\u0004\u0012\u00020\u00010\u00102\u0014\b\u0002\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00010\u00142\u000e\b\u0002\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00010\u0012¨\u0006\u0017"}, m29142d2 = {"attorneyFlowNavGraph", "", "Landroidx/navigation/NavGraphBuilder;", "allowCardReader", "", "allowDocumentType", "", "", "faceCompareSelectedIndex", "", "allowManualKYC", "maxAttempt", "allowManualKYC2ndLine", "navController", "Landroidx/navigation/NavHostController;", "onFaceCompareSuccess", "Lkotlin/Function2;", "Lth/co/dtac/android/dtacone/model/upPass/UpPassFormResult;", "Lkotlin/Function0;", "onExit", "Lkotlin/Function1;", "Lth/co/dtac/android/dtacone/viewmodel/upPass/state/ExitCallbackState;", "onEndFlow", "app_prodRelease"}, m29141k = 2, m29140mv = {1, 8, 0}, m29138xi = 48)
@SourceDebugExtension({"SMAP\nAttroneyFlowNavGraph.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AttroneyFlowNavGraph.kt\nth/co/dtac/android/dtacone/view/compose/upPassDemo/navGraph/AttroneyFlowNavGraphKt\n+ 2 NavGraphBuilder.kt\nandroidx/navigation/NavGraphBuilderKt\n*L\n1#1,142:1\n96#2:143\n96#2:144\n96#2:145\n*S KotlinDebug\n*F\n+ 1 AttroneyFlowNavGraph.kt\nth/co/dtac/android/dtacone/view/compose/upPassDemo/navGraph/AttroneyFlowNavGraphKt\n*L\n38#1:143\n79#1:144\n102#1:145\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.view.compose.upPassDemo.navGraph.AttroneyFlowNavGraphKt */
/* loaded from: classes10.dex */
public final class AttroneyFlowNavGraphKt {
    public static final void attorneyFlowNavGraph(@NotNull NavGraphBuilder navGraphBuilder, boolean z, @Nullable List<String> list, int i, boolean z2, int i2, boolean z3, @NotNull NavHostController navController, @NotNull Function2<? super UpPassFormResult, ? super Function0<Unit>, Unit> onFaceCompareSuccess, @NotNull Function1<? super ExitCallbackState, Unit> onExit, @NotNull Function0<Unit> onEndFlow) {
        Intrinsics.checkNotNullParameter(navGraphBuilder, "<this>");
        Intrinsics.checkNotNullParameter(navController, "navController");
        Intrinsics.checkNotNullParameter(onFaceCompareSuccess, "onFaceCompareSuccess");
        Intrinsics.checkNotNullParameter(onExit, "onExit");
        Intrinsics.checkNotNullParameter(onEndFlow, "onEndFlow");
        NavGraphBuilder navGraphBuilder2 = new NavGraphBuilder(navGraphBuilder.getProvider(), UpPassDemoScreen.UpPassDemo.AttorneyFlow.OcrAttorneyScreen.ROUTE, UpPassDemoScreen.UpPassDemo.AttorneyFlow.ROUTE);
        NavGraphBuilderKt.composable$default(navGraphBuilder2, UpPassDemoScreen.UpPassDemo.AttorneyFlow.OcrAttorneyScreen.ROUTE, null, null, null, null, null, null, ComposableLambdaKt.composableLambdaInstance(-1095364084, true, new AttroneyFlowNavGraphKt$attorneyFlowNavGraph$4$1(list, z, onExit, navController)), WebSocketProtocol.PAYLOAD_SHORT, null);
        NavGraphBuilderKt.composable$default(navGraphBuilder2, UpPassDemoScreen.UpPassDemo.AttorneyFlow.OcrAttorneyResultScreen.ROUTE, null, null, null, null, null, null, ComposableLambdaKt.composableLambdaInstance(469632835, true, new AttroneyFlowNavGraphKt$attorneyFlowNavGraph$4$2(i, navController, onExit)), WebSocketProtocol.PAYLOAD_SHORT, null);
        NavGraphBuilder navGraphBuilder3 = new NavGraphBuilder(navGraphBuilder2.getProvider(), UpPassScreen.UpPassForms.FaceCompareFlow.ROUTE, UpPassDemoScreen.UpPassDemo.AttorneyFlow.FaceCompareScreen.ROUTE);
        UpPassFormOwnerType upPassFormOwnerType = UpPassFormOwnerType.Attorney;
        FaceCompareNavGraphKt.faceCompareNavGraph(navGraphBuilder3, navController, new UpPassFormType.FaceCompare(upPassFormOwnerType, z2, i2, null, "PP Register", z3, "66987654321", "01234567890123456789", 8, null), new AttroneyFlowNavGraphKt$attorneyFlowNavGraph$4$3$1(onFaceCompareSuccess, navController), onExit);
        navGraphBuilder2.destination(navGraphBuilder3);
        NavGraphBuilder navGraphBuilder4 = new NavGraphBuilder(navGraphBuilder2.getProvider(), UpPassScreen.UpPassForms.FaceCompareFlow.ROUTE, UpPassDemoScreen.UpPassDemo.AttorneyFlow.FaceCompareLivenessScreen.ROUTE);
        FaceCompareNavGraphKt.faceCompareNavGraph(navGraphBuilder4, navController, new UpPassFormType.FaceCompareLiveness(upPassFormOwnerType, z2, i2, null, "PP Register", z3, "66987654321", "01234567890123456789", 8, null), new AttroneyFlowNavGraphKt$attorneyFlowNavGraph$4$4$1(onFaceCompareSuccess, navController), onExit);
        navGraphBuilder2.destination(navGraphBuilder4);
        NavGraphBuilderKt.composable$default(navGraphBuilder2, UpPassDemoScreen.UpPassDemo.AttorneyFlow.FaceCompareResultScreen.ROUTE, null, null, null, null, null, null, ComposableLambdaKt.composableLambdaInstance(-1472476220, true, new AttroneyFlowNavGraphKt$attorneyFlowNavGraph$4$5(z2, i2, z3, onEndFlow)), WebSocketProtocol.PAYLOAD_SHORT, null);
        navGraphBuilder.destination(navGraphBuilder2);
    }

    public static /* synthetic */ void attorneyFlowNavGraph$default(NavGraphBuilder navGraphBuilder, boolean z, List list, int i, boolean z2, int i2, boolean z3, NavHostController navHostController, Function2 function2, Function1 function1, Function0 function0, int i3, Object obj) {
        AttroneyFlowNavGraphKt$attorneyFlowNavGraph$1 attroneyFlowNavGraphKt$attorneyFlowNavGraph$1;
        AttroneyFlowNavGraphKt$attorneyFlowNavGraph$2 attroneyFlowNavGraphKt$attorneyFlowNavGraph$2;
        AttroneyFlowNavGraphKt$attorneyFlowNavGraph$3 attroneyFlowNavGraphKt$attorneyFlowNavGraph$3;
        if ((i3 & 128) != 0) {
            attroneyFlowNavGraphKt$attorneyFlowNavGraph$1 = AttroneyFlowNavGraphKt$attorneyFlowNavGraph$1.INSTANCE;
        } else {
            attroneyFlowNavGraphKt$attorneyFlowNavGraph$1 = function2;
        }
        if ((i3 & 256) != 0) {
            attroneyFlowNavGraphKt$attorneyFlowNavGraph$2 = AttroneyFlowNavGraphKt$attorneyFlowNavGraph$2.INSTANCE;
        } else {
            attroneyFlowNavGraphKt$attorneyFlowNavGraph$2 = function1;
        }
        if ((i3 & 512) != 0) {
            attroneyFlowNavGraphKt$attorneyFlowNavGraph$3 = AttroneyFlowNavGraphKt$attorneyFlowNavGraph$3.INSTANCE;
        } else {
            attroneyFlowNavGraphKt$attorneyFlowNavGraph$3 = function0;
        }
        attorneyFlowNavGraph(navGraphBuilder, z, list, i, z2, i2, z3, navHostController, attroneyFlowNavGraphKt$attorneyFlowNavGraph$1, attroneyFlowNavGraphKt$attorneyFlowNavGraph$2, attroneyFlowNavGraphKt$attorneyFlowNavGraph$3);
    }
}