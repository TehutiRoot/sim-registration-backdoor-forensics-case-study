package th.p047co.dtac.android.dtacone.view.compose.upPass;

import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.navigation.NavController;
import androidx.navigation.NavGraphBuilder;
import androidx.navigation.compose.NavGraphBuilderKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import okhttp3.internal.p026ws.WebSocketProtocol;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.model.upPass.UpPassFormResult;
import th.p047co.dtac.android.dtacone.model.upPass.UpPassFormType;
import th.p047co.dtac.android.dtacone.view.compose.upPass.model.UpPassScreen;
import th.p047co.dtac.android.dtacone.viewmodel.upPass.state.ExitCallbackState;

@Metadata(m29143d1 = {"\u0000<\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001at\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062$\b\u0002\u0010\u0007\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\b2\u0014\b\u0002\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\u000e2\u0014\b\u0002\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00010\u000eø\u0001\u0000¢\u0006\u0002\u0010\u0011\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0012"}, m29142d2 = {"idDocOcrFaceCompareLivenessNavGraph", "", "Landroidx/navigation/NavGraphBuilder;", "navController", "Landroidx/navigation/NavController;", "formType", "Lth/co/dtac/android/dtacone/model/upPass/UpPassFormType;", "onValidation", "Lkotlin/Function2;", "Lth/co/dtac/android/dtacone/model/upPass/UpPassFormResult;", "Lkotlin/coroutines/Continuation;", "", "", "onSuccess", "Lkotlin/Function1;", "onExit", "Lth/co/dtac/android/dtacone/viewmodel/upPass/state/ExitCallbackState;", "(Landroidx/navigation/NavGraphBuilder;Landroidx/navigation/NavController;Lth/co/dtac/android/dtacone/model/upPass/UpPassFormType;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "app_prodRelease"}, m29141k = 2, m29140mv = {1, 8, 0}, m29138xi = 48)
@SourceDebugExtension({"SMAP\nIdDocOcrFaceCompareLivenessNavGraph.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IdDocOcrFaceCompareLivenessNavGraph.kt\nth/co/dtac/android/dtacone/view/compose/upPass/IdDocOcrFaceCompareLivenessNavGraphKt\n+ 2 NavGraphBuilder.kt\nandroidx/navigation/NavGraphBuilderKt\n*L\n1#1,526:1\n96#2:527\n*S KotlinDebug\n*F\n+ 1 IdDocOcrFaceCompareLivenessNavGraph.kt\nth/co/dtac/android/dtacone/view/compose/upPass/IdDocOcrFaceCompareLivenessNavGraphKt\n*L\n63#1:527\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.view.compose.upPass.IdDocOcrFaceCompareLivenessNavGraphKt */
/* loaded from: classes10.dex */
public final class IdDocOcrFaceCompareLivenessNavGraphKt {
    public static final void idDocOcrFaceCompareLivenessNavGraph(@NotNull NavGraphBuilder navGraphBuilder, @NotNull NavController navController, @NotNull UpPassFormType formType, @NotNull Function2<? super UpPassFormResult, ? super Continuation<? super Boolean>, ? extends Object> onValidation, @NotNull Function1<? super UpPassFormResult, Unit> onSuccess, @NotNull Function1<? super ExitCallbackState, Unit> onExit) {
        Intrinsics.checkNotNullParameter(navGraphBuilder, "<this>");
        Intrinsics.checkNotNullParameter(navController, "navController");
        Intrinsics.checkNotNullParameter(formType, "formType");
        Intrinsics.checkNotNullParameter(onValidation, "onValidation");
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        Intrinsics.checkNotNullParameter(onExit, "onExit");
        NavGraphBuilder navGraphBuilder2 = new NavGraphBuilder(navGraphBuilder.getProvider(), UpPassScreen.UpPassForms.IdDocumentOcrFaceCompareLivenessFlow.IdDocumentOcr.ROUTE, UpPassScreen.UpPassForms.IdDocumentOcrFaceCompareLivenessFlow.ROUTE);
        NavGraphBuilderKt.composable$default(navGraphBuilder2, UpPassScreen.UpPassForms.IdDocumentOcrFaceCompareLivenessFlow.IdDocumentOcr.ROUTE, null, null, null, null, null, null, ComposableLambdaKt.composableLambdaInstance(327965780, true, new C15706x2aaa178c(formType, onExit, navController, onSuccess, onValidation)), WebSocketProtocol.PAYLOAD_SHORT, null);
        NavGraphBuilderKt.composable$default(navGraphBuilder2, UpPassScreen.UpPassForms.IdDocumentOcrFaceCompareLivenessFlow.IdCardReaderReview.ROUTE, null, null, null, null, null, null, ComposableLambdaKt.composableLambdaInstance(-2115095733, true, new C15726x2aaa178d(onSuccess, onValidation, onExit, formType, navController)), WebSocketProtocol.PAYLOAD_SHORT, null);
        NavGraphBuilderKt.composable$default(navGraphBuilder2, UpPassScreen.UpPassForms.IdDocumentOcrFaceCompareLivenessFlow.FaceCompareReview.ROUTE, null, null, null, null, null, null, ComposableLambdaKt.composableLambdaInstance(-1071307764, true, new C15736x2aaa178e(formType, onExit, onSuccess, navController)), WebSocketProtocol.PAYLOAD_SHORT, null);
        NavGraphBuilderKt.composable$default(navGraphBuilder2, UpPassScreen.UpPassForms.IdDocumentOcrFaceCompareLivenessFlow.FaceCompareKyc2ndLine.ROUTE, null, null, null, null, null, null, ComposableLambdaKt.composableLambdaInstance(-27519795, true, new C15753x2aaa178f(navController)), WebSocketProtocol.PAYLOAD_SHORT, null);
        NavGraphBuilderKt.composable$default(navGraphBuilder2, UpPassScreen.UpPassForms.IdDocumentOcrFaceCompareLivenessFlow.FaceCompareKyc2ndLineResult.ROUTE, null, null, null, null, null, null, ComposableLambdaKt.composableLambdaInstance(1016268174, true, new C15762x2aaa1790(onSuccess, onExit, navController)), WebSocketProtocol.PAYLOAD_SHORT, null);
        navGraphBuilder.destination(navGraphBuilder2);
    }

    public static /* synthetic */ void idDocOcrFaceCompareLivenessNavGraph$default(NavGraphBuilder navGraphBuilder, NavController navController, UpPassFormType upPassFormType, Function2 function2, Function1 function1, Function1 function12, int i, Object obj) {
        if ((i & 4) != 0) {
            function2 = new C15703x17c0c6bc(null);
        }
        Function2 function22 = function2;
        if ((i & 8) != 0) {
            function1 = C15704x17c0c6bd.INSTANCE;
        }
        Function1 function13 = function1;
        if ((i & 16) != 0) {
            function12 = C15705x17c0c6be.INSTANCE;
        }
        idDocOcrFaceCompareLivenessNavGraph(navGraphBuilder, navController, upPassFormType, function22, function13, function12);
    }
}