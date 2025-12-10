package p000;

import android.view.View;
import com.jakewharton.rxbinding3.internal.AlwaysTrue;
import com.jakewharton.rxbinding3.view.RxView;
import io.reactivex.Observable;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: pC1  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract /* synthetic */ class AbstractC21548pC1 {
    /* renamed from: a */
    public static final Observable m23722a(View keys, Function1 handled) {
        Intrinsics.checkParameterIsNotNull(keys, "$this$keys");
        Intrinsics.checkParameterIsNotNull(handled, "handled");
        return new H22(keys, handled);
    }

    /* renamed from: b */
    public static /* synthetic */ Observable m23721b(View view, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            function1 = AlwaysTrue.INSTANCE;
        }
        return RxView.keys(view, function1);
    }
}
