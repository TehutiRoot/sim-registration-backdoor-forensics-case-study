package androidx.compose.material3;

import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
@DebugMetadata(m29093c = "androidx.compose.material3.TimePickerState", m29092f = "TimePicker.kt", m29091i = {0, 0, 0, 0, 0, 1, 1}, m29090l = {621, 629, 630, 633}, m29089m = "onTap$material3_release", m29088n = {"this", "x", OperatorName.CURVE_TO_REPLICATE_FINAL_POINT, "maxDist", "autoSwitchToMinute", "this", "targetValue"}, m29087s = {"L$0", "F$0", "F$1", "F$2", "Z$0", "L$0", "L$1"})
/* loaded from: classes2.dex */
public final class TimePickerState$onTap$1 extends ContinuationImpl {
    float F$0;
    float F$1;
    float F$2;
    Object L$0;
    Object L$1;
    boolean Z$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ TimePickerState this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TimePickerState$onTap$1(TimePickerState timePickerState, Continuation<? super TimePickerState$onTap$1> continuation) {
        super(continuation);
        this.this$0 = timePickerState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.onTap$material3_release(0.0f, 0.0f, 0.0f, false, this);
    }
}