package th.p047co.dtac.android.dtacone.view.appOne.tol.viewmodel;

import android.graphics.Bitmap;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.util.bitmap.BitmapUtil;
import th.p047co.dtac.android.dtacone.view.appOne.tol.viewmodel.state.ReviewImageState;

@Metadata(m29143d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m29142d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
@DebugMetadata(m29093c = "th.co.dtac.android.dtacone.view.appOne.tol.viewmodel.OneRegisterTrueOnlineViewModel$refreshReviewImage$1", m29092f = "OneRegisterTrueOnlineViewModel.kt", m29091i = {}, m29090l = {}, m29089m = "invokeSuspend", m29088n = {}, m29087s = {})
@SourceDebugExtension({"SMAP\nOneRegisterTrueOnlineViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OneRegisterTrueOnlineViewModel.kt\nth/co/dtac/android/dtacone/view/appOne/tol/viewmodel/OneRegisterTrueOnlineViewModel$refreshReviewImage$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,2372:1\n1855#2,2:2373\n230#3,5:2375\n230#3,5:2380\n*S KotlinDebug\n*F\n+ 1 OneRegisterTrueOnlineViewModel.kt\nth/co/dtac/android/dtacone/view/appOne/tol/viewmodel/OneRegisterTrueOnlineViewModel$refreshReviewImage$1\n*L\n1744#1:2373,2\n1750#1:2375,5\n1757#1:2380,5\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.viewmodel.OneRegisterTrueOnlineViewModel$refreshReviewImage$1 */
/* loaded from: classes10.dex */
public final class OneRegisterTrueOnlineViewModel$refreshReviewImage$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ OneRegisterTrueOnlineViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneRegisterTrueOnlineViewModel$refreshReviewImage$1(OneRegisterTrueOnlineViewModel oneRegisterTrueOnlineViewModel, Continuation<? super OneRegisterTrueOnlineViewModel$refreshReviewImage$1> continuation) {
        super(2, continuation);
        this.this$0 = oneRegisterTrueOnlineViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new OneRegisterTrueOnlineViewModel$refreshReviewImage$1(this.this$0, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        MutableStateFlow mutableStateFlow;
        Object value;
        BitmapUtil bitmapUtil;
        MutableStateFlow mutableStateFlow2;
        Object value2;
        BitmapUtil bitmapUtil2;
        AbstractC19782eg0.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            try {
                List mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) CollectionsKt__CollectionsKt.emptyList());
                bitmapUtil = this.this$0.f98236h;
                Bitmap loadInternalBitmap = bitmapUtil.loadInternalBitmap(BitmapUtil.IMAGE_ID_CARD);
                Intrinsics.checkNotNullExpressionValue(loadInternalBitmap, "bitmapUtil.loadInternalB…BitmapUtil.IMAGE_ID_CARD)");
                mutableList.add(loadInternalBitmap);
                OneRegisterTrueOnlineViewModel oneRegisterTrueOnlineViewModel = this.this$0;
                for (String str : (Iterable) this.this$0.f98174F.getValue()) {
                    bitmapUtil2 = oneRegisterTrueOnlineViewModel.f98236h;
                    Bitmap loadInternalBitmap2 = bitmapUtil2.loadInternalBitmap(str);
                    Intrinsics.checkNotNullExpressionValue(loadInternalBitmap2, "bitmapUtil.loadInternalBitmap(it)");
                    mutableList.add(loadInternalBitmap2);
                }
                int size = mutableList.size();
                StringBuilder sb = new StringBuilder();
                sb.append("refreshReviewImage: ");
                sb.append(size);
                StringBuilder sb2 = new StringBuilder();
                sb2.append("refreshReviewImage: ");
                sb2.append(mutableList);
                mutableStateFlow2 = this.this$0.f98203T0;
                OneRegisterTrueOnlineViewModel oneRegisterTrueOnlineViewModel2 = this.this$0;
                do {
                    value2 = mutableStateFlow2.getValue();
                    ReviewImageState reviewImageState = (ReviewImageState) value2;
                } while (!mutableStateFlow2.compareAndSet(value2, new ReviewImageState.Success(mutableList, ((List) oneRegisterTrueOnlineViewModel2.f98174F.getValue()).size(), oneRegisterTrueOnlineViewModel2.getImageOptionalMax())));
            } catch (Exception e) {
                mutableStateFlow = this.this$0.f98203T0;
                do {
                    value = mutableStateFlow.getValue();
                    ReviewImageState reviewImageState2 = (ReviewImageState) value;
                } while (!mutableStateFlow.compareAndSet(value, new ReviewImageState.Error(String.valueOf(e.getMessage()))));
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((OneRegisterTrueOnlineViewModel$refreshReviewImage$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}