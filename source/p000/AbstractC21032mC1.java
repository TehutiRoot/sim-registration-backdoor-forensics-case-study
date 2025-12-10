package p000;

import android.view.View;
import com.jakewharton.rxbinding3.internal.AlwaysTrue;
import com.jakewharton.rxbinding3.view.RxView;
import io.reactivex.Observable;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: mC1  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract /* synthetic */ class AbstractC21032mC1 {
    /* renamed from: a */
    public static final Observable m26371a(View drags, Function1 handled) {
        Intrinsics.checkParameterIsNotNull(drags, "$this$drags");
        Intrinsics.checkParameterIsNotNull(handled, "handled");
        return new C22207t22(drags, handled);
    }

    /* renamed from: b */
    public static /* synthetic */ Observable m26370b(View view, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            function1 = AlwaysTrue.INSTANCE;
        }
        return RxView.drags(view, function1);
    }
}
