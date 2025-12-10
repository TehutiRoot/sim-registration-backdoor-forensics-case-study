package th.p047co.dtac.android.dtacone.util;

import android.util.Log;
import androidx.annotation.MainThread;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.app.NotificationCompat;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J'\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u000e\u0010\b\u001a\n\u0012\u0006\b\u0000\u0012\u00028\u00000\u0007H\u0017¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\r\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00018\u0000H\u0017¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000f\u0010\u0004R\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, m29142d2 = {"Lth/co/dtac/android/dtacone/util/SingleLiveData;", "T", "Landroidx/lifecycle/MutableLiveData;", "<init>", "()V", "Landroidx/lifecycle/LifecycleOwner;", Constant.REGISTER_LEVEL_OWNER, "Landroidx/lifecycle/Observer;", "observer", "", "observe", "(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Observer;)V", "t", "setValue", "(Ljava/lang/Object;)V", NotificationCompat.CATEGORY_CALL, "Ljava/util/concurrent/atomic/AtomicBoolean;", OperatorName.LINE_TO, "Ljava/util/concurrent/atomic/AtomicBoolean;", "mPending", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.util.SingleLiveData */
/* loaded from: classes8.dex */
public final class SingleLiveData<T> extends MutableLiveData<T> {
    public static final int $stable = 8;

    /* renamed from: l */
    public final AtomicBoolean f87081l = new AtomicBoolean(false);

    /* renamed from: th.co.dtac.android.dtacone.util.SingleLiveData$a */
    /* loaded from: classes8.dex */
    public static final class C14420a implements Observer {

        /* renamed from: b */
        public final /* synthetic */ Observer f87083b;

        public C14420a(Observer observer) {
            this.f87083b = observer;
        }

        @Override // androidx.lifecycle.Observer
        public final void onChanged(Object obj) {
            if (SingleLiveData.this.f87081l.compareAndSet(true, false)) {
                this.f87083b.onChanged(obj);
            }
        }
    }

    @MainThread
    public final void call() {
        setValue(null);
    }

    @Override // androidx.lifecycle.LiveData
    @MainThread
    public void observe(@NotNull LifecycleOwner owner, @NotNull Observer<? super T> observer) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        Intrinsics.checkNotNullParameter(observer, "observer");
        if (hasActiveObservers()) {
            Log.w(SingleLiveData.class.getSimpleName(), "Multiple observers registered but only one will be notified of changes.");
        }
        super.observe(owner, new C14420a(observer));
    }

    @Override // androidx.lifecycle.MutableLiveData, androidx.lifecycle.LiveData
    @MainThread
    public void setValue(@Nullable T t) {
        this.f87081l.set(true);
        super.setValue(t);
    }
}