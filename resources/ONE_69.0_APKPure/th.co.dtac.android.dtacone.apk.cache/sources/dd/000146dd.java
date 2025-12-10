package th.p047co.dtac.android.dtacone.view.compose.upPass;

import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.navigation.NavController;
import androidx.navigation.NavGraphBuilder;
import androidx.navigation.compose.NavGraphBuilderKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import okhttp3.internal.p026ws.WebSocketProtocol;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.model.upPass.UpPassFormResult;
import th.p047co.dtac.android.dtacone.model.upPass.UpPassFormType;
import th.p047co.dtac.android.dtacone.view.compose.upPass.model.UpPassScreen;
import th.p047co.dtac.android.dtacone.viewmodel.upPass.state.ExitCallbackState;

@Metadata(m29143d1 = {"\u0000(\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001aF\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\b2\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00010\b¨\u0006\f"}, m29142d2 = {"faceCompareNavGraph", "", "Landroidx/navigation/NavGraphBuilder;", "navController", "Landroidx/navigation/NavController;", "formType", "Lth/co/dtac/android/dtacone/model/upPass/UpPassFormType;", "onSuccess", "Lkotlin/Function1;", "Lth/co/dtac/android/dtacone/model/upPass/UpPassFormResult;", "onExit", "Lth/co/dtac/android/dtacone/viewmodel/upPass/state/ExitCallbackState;", "app_prodRelease"}, m29141k = 2, m29140mv = {1, 8, 0}, m29138xi = 48)
@SourceDebugExtension({"SMAP\nFaceCompareNavGraph.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FaceCompareNavGraph.kt\nth/co/dtac/android/dtacone/view/compose/upPass/FaceCompareNavGraphKt\n+ 2 NavGraphBuilder.kt\nandroidx/navigation/NavGraphBuilderKt\n*L\n1#1,387:1\n96#2:388\n*S KotlinDebug\n*F\n+ 1 FaceCompareNavGraph.kt\nth/co/dtac/android/dtacone/view/compose/upPass/FaceCompareNavGraphKt\n*L\n48#1:388\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.view.compose.upPass.FaceCompareNavGraphKt */
/* loaded from: classes10.dex */
public final class FaceCompareNavGraphKt {
    public static final void faceCompareNavGraph(@NotNull NavGraphBuilder navGraphBuilder, @NotNull NavController navController, @NotNull UpPassFormType formType, @NotNull Function1<? super UpPassFormResult, Unit> onSuccess, @NotNull Function1<? super ExitCallbackState, Unit> onExit) {
        Intrinsics.checkNotNullParameter(navGraphBuilder, "<this>");
        Intrinsics.checkNotNullParameter(navController, "navController");
        Intrinsics.checkNotNullParameter(formType, "formType");
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        Intrinsics.checkNotNullParameter(onExit, "onExit");
        NavGraphBuilder navGraphBuilder2 = new NavGraphBuilder(navGraphBuilder.getProvider(), UpPassScreen.UpPassForms.FaceCompareFlow.FaceCompare.ROUTE, UpPassScreen.UpPassForms.FaceCompareFlow.ROUTE);
        NavGraphBuilderKt.composable$default(navGraphBuilder2, UpPassScreen.UpPassForms.FaceCompareFlow.FaceCompare.ROUTE, null, null, null, null, null, null, ComposableLambdaKt.composableLambdaInstance(1326306627, true, new FaceCompareNavGraphKt$faceCompareNavGraph$3$1(onExit, formType, navController)), WebSocketProtocol.PAYLOAD_SHORT, null);
        NavGraphBuilderKt.composable$default(navGraphBuilder2, UpPassScreen.UpPassForms.FaceCompareFlow.FaceCompareReview.ROUTE, null, null, null, null, null, null, ComposableLambdaKt.composableLambdaInstance(-969402004, true, new FaceCompareNavGraphKt$faceCompareNavGraph$3$2(formType, onExit, navController, onSuccess)), WebSocketProtocol.PAYLOAD_SHORT, null);
        NavGraphBuilderKt.composable$default(navGraphBuilder2, UpPassScreen.UpPassForms.FaceCompareFlow.FaceCompareKyc2ndLine.ROUTE, null, null, null, null, null, null, ComposableLambdaKt.composableLambdaInstance(-17570165, true, new FaceCompareNavGraphKt$faceCompareNavGraph$3$3(navController)), WebSocketProtocol.PAYLOAD_SHORT, null);
        NavGraphBuilderKt.composable$default(navGraphBuilder2, UpPassScreen.UpPassForms.FaceCompareFlow.FaceCompareKyc2ndLineResult.ROUTE, null, null, null, null, null, null, ComposableLambdaKt.composableLambdaInstance(934261674, true, new FaceCompareNavGraphKt$faceCompareNavGraph$3$4(onSuccess, onExit, navController)), WebSocketProtocol.PAYLOAD_SHORT, null);
        navGraphBuilder.destination(navGraphBuilder2);
    }

    public static /* synthetic */ void faceCompareNavGraph$default(NavGraphBuilder navGraphBuilder, NavController navController, UpPassFormType upPassFormType, Function1 function1, Function1 function12, int i, Object obj) {
        if ((i & 4) != 0) {
            function1 = FaceCompareNavGraphKt$faceCompareNavGraph$1.INSTANCE;
        }
        if ((i & 8) != 0) {
            function12 = FaceCompareNavGraphKt$faceCompareNavGraph$2.INSTANCE;
        }
        faceCompareNavGraph(navGraphBuilder, navController, upPassFormType, function1, function12);
    }
}