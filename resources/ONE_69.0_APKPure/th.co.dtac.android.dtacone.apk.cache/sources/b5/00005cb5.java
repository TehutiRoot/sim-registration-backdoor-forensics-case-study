package androidx.compose.runtime;

import com.google.android.gms.analytics.ecommerce.ProductAction;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(m29143d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\u0005J\u0015\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0012\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, m29142d2 = {"Landroidx/compose/runtime/AtomicInt;", "", "", "value", "<init>", "(I)V", "get", "()I", "", "set", "amount", ProductAction.ACTION_ADD, "(I)I", "Ljava/util/concurrent/atomic/AtomicInteger;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/util/concurrent/atomic/AtomicInteger;", "getDelegate", "()Ljava/util/concurrent/atomic/AtomicInteger;", "delegate", "runtime_release"}, m29141k = 1, m29140mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class AtomicInt {

    /* renamed from: a */
    public final AtomicInteger f28279a;

    public AtomicInt(int i) {
        this.f28279a = new AtomicInteger(i);
    }

    public final int add(int i) {
        return this.f28279a.addAndGet(i);
    }

    public final int get() {
        return this.f28279a.get();
    }

    @NotNull
    public final AtomicInteger getDelegate() {
        return this.f28279a;
    }

    public final void set(int i) {
        this.f28279a.set(i);
    }
}