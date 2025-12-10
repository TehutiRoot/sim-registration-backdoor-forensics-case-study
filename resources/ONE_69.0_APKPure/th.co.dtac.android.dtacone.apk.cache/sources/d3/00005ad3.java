package androidx.compose.material3;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.adapter.report.DetailProfitReportAdapter;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
@DebugMetadata(m29093c = "androidx.compose.material3.SnapFlingBehavior", m29092f = "SnapFlingBehavior.kt", m29091i = {0, 0}, m29090l = {135, DetailProfitReportAdapter.ViewHolder.hiddenSubProdHeight}, m29089m = "longSnap", m29088n = {"this", "$this$longSnap"}, m29087s = {"L$0", "L$1"})
/* loaded from: classes2.dex */
public final class SnapFlingBehavior$longSnap$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SnapFlingBehavior this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SnapFlingBehavior$longSnap$1(SnapFlingBehavior snapFlingBehavior, Continuation<? super SnapFlingBehavior$longSnap$1> continuation) {
        super(continuation);
        this.this$0 = snapFlingBehavior;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object m60467o;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        m60467o = this.this$0.m60467o(null, 0.0f, this);
        return m60467o;
    }
}