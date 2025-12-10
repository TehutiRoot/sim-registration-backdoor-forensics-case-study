package androidx.compose.p003ui.tooling;

import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(m29143d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\u0003R\u0018\u0010\f\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\u000f\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0010"}, m29142d2 = {"Landroidx/compose/ui/tooling/ThreadSafeException;", "", "<init>", "()V", "", "throwable", "", "set", "(Ljava/lang/Throwable;)V", "throwIfPresent", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/lang/Throwable;", "exception", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Ljava/lang/Object;", "lock", "ui-tooling_release"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: androidx.compose.ui.tooling.ThreadSafeException */
/* loaded from: classes2.dex */
public final class ThreadSafeException {

    /* renamed from: a */
    public Throwable f31710a;

    /* renamed from: b */
    public final Object f31711b = new Object();

    public final void set(@NotNull Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        synchronized (this.f31711b) {
            this.f31710a = throwable;
            Unit unit = Unit.INSTANCE;
        }
    }

    public final void throwIfPresent() {
        synchronized (this.f31711b) {
            Throwable th2 = this.f31710a;
            if (th2 != null) {
                this.f31710a = null;
                throw th2;
            }
        }
    }
}