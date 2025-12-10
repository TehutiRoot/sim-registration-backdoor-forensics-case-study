package p000;

import android.view.View;
import com.jakewharton.rxbinding3.internal.AlwaysTrue;
import com.jakewharton.rxbinding3.view.RxView;
import io.reactivex.Observable;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: vC1  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract /* synthetic */ class AbstractC22580vC1 {
    /* renamed from: a */
    public static final Observable m1095a(View touches, Function1 handled) {
        Intrinsics.checkParameterIsNotNull(touches, "$this$touches");
        Intrinsics.checkParameterIsNotNull(handled, "handled");
        return new C20834l32(touches, handled);
    }

    /* renamed from: b */
    public static /* synthetic */ Observable m1094b(View view, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            function1 = AlwaysTrue.INSTANCE;
        }
        return RxView.touches(view, function1);
    }
}
