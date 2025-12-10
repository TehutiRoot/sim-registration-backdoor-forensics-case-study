package p000;

import android.view.View;
import com.jakewharton.rxbinding3.internal.AlwaysTrue;
import com.jakewharton.rxbinding3.view.RxView;
import io.reactivex.Observable;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: oC1  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract /* synthetic */ class AbstractC21376oC1 {
    /* renamed from: a */
    public static final Observable m25947a(View hovers, Function1 handled) {
        Intrinsics.checkParameterIsNotNull(hovers, "$this$hovers");
        Intrinsics.checkParameterIsNotNull(handled, "handled");
        return new F22(hovers, handled);
    }

    /* renamed from: b */
    public static /* synthetic */ Observable m25946b(View view, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            function1 = AlwaysTrue.INSTANCE;
        }
        return RxView.hovers(view, function1);
    }
}
