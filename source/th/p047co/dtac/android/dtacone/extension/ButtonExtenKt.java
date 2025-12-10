package th.p047co.dtac.android.dtacone.extension;

import android.annotation.SuppressLint;
import android.widget.Button;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.jakewharton.rxbinding2.view.RxView;
import io.reactivex.Observable;
import io.reactivex.functions.Consumer;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.extension.ButtonExtenKt;

@Metadata(m28851d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a$\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u0006H\u0007¨\u0006\u0007"}, m28850d2 = {"throttleClick", "", "Landroid/widget/Button;", TypedValues.TransitionType.S_DURATION, "", "action", "Lkotlin/Function0;", "app_prodRelease"}, m28849k = 2, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: th.co.dtac.android.dtacone.extension.ButtonExtenKt */
/* loaded from: classes7.dex */
public final class ButtonExtenKt {
    /* renamed from: a */
    public static /* synthetic */ void m19508a(Function0 function0, Object obj) {
        m19507b(function0, obj);
    }

    /* renamed from: b */
    public static final void m19507b(Function0 action, Object obj) {
        Intrinsics.checkNotNullParameter(action, "$action");
        action.invoke();
    }

    @SuppressLint({"CheckResult", "RxLeakedSubscription"})
    public static final void throttleClick(@NotNull Button button, long j, @NotNull final Function0<Unit> action) {
        Intrinsics.checkNotNullParameter(button, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        RxView.clicks(button).throttleFirst(j, TimeUnit.MILLISECONDS).onErrorResumeNext(Observable.never()).subscribe(new Consumer() { // from class: dd
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                ButtonExtenKt.m19508a(action, obj);
            }
        });
    }

    public static /* synthetic */ void throttleClick$default(Button button, long j, Function0 function0, int i, Object obj) {
        if ((i & 1) != 0) {
            j = 500;
        }
        throttleClick(button, j, function0);
    }
}
