package androidx.activity;

import android.app.Activity;
import android.graphics.Rect;
import android.view.View;
import androidx.annotation.RequiresApi;
import com.google.android.gms.analytics.ecommerce.Promotion;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001d\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0087@ø\u0001\u0000¢\u0006\u0002\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006"}, m28850d2 = {"trackPipAnimationHintView", "", "Landroid/app/Activity;", Promotion.ACTION_VIEW, "Landroid/view/View;", "(Landroid/app/Activity;Landroid/view/View;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "activity-ktx_release"}, m28849k = 2, m28848mv = {1, 8, 0}, m28846xi = 48)
/* loaded from: classes.dex */
public final class PipHintTrackerKt {

    /* renamed from: androidx.activity.PipHintTrackerKt$a */
    /* loaded from: classes.dex */
    public static final class C2030a implements FlowCollector {

        /* renamed from: a */
        public final /* synthetic */ Activity f8694a;

        public C2030a(Activity activity) {
            this.f8694a = activity;
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        /* renamed from: a */
        public final Object emit(Rect rect, Continuation continuation) {
            Api26Impl.INSTANCE.setPipParamsSourceRectHint(this.f8694a, rect);
            return Unit.INSTANCE;
        }
    }

    /* renamed from: a */
    public static final Rect m64773a(View view) {
        Rect rect = new Rect();
        view.getGlobalVisibleRect(rect);
        return rect;
    }

    @RequiresApi(26)
    @Nullable
    public static final Object trackPipAnimationHintView(@NotNull Activity activity, @NotNull View view, @NotNull Continuation<? super Unit> continuation) {
        Object collect = FlowKt.callbackFlow(new PipHintTrackerKt$trackPipAnimationHintView$flow$1(view, null)).collect(new C2030a(activity), continuation);
        if (collect == AbstractC18812Yf0.getCOROUTINE_SUSPENDED()) {
            return collect;
        }
        return Unit.INSTANCE;
    }
}
