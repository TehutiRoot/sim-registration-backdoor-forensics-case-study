package p000;

import android.view.View;
import com.jakewharton.rxbinding3.internal.AlwaysTrue;
import com.jakewharton.rxbinding3.view.RxView;
import io.reactivex.Observable;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: sC1  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract /* synthetic */ class AbstractC22064sC1 {
    /* renamed from: a */
    public static final Observable m22656a(View longClicks, Function0 handled) {
        Intrinsics.checkParameterIsNotNull(longClicks, "$this$longClicks");
        Intrinsics.checkParameterIsNotNull(handled, "handled");
        return new T22(longClicks, handled);
    }

    /* renamed from: b */
    public static /* synthetic */ Observable m22655b(View view, Function0 function0, int i, Object obj) {
        if ((i & 1) != 0) {
            function0 = AlwaysTrue.INSTANCE;
        }
        return RxView.longClicks(view, function0);
    }
}
