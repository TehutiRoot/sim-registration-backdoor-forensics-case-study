package p000;

import android.widget.AdapterView;
import com.jakewharton.rxbinding3.internal.AlwaysTrue;
import com.jakewharton.rxbinding3.widget.RxAdapterView;
import io.reactivex.Observable;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: HA1 */
/* loaded from: classes5.dex */
public abstract /* synthetic */ class HA1 {
    /* renamed from: a */
    public static final Observable m68121a(AdapterView itemLongClickEvents, Function1 handled) {
        Intrinsics.checkParameterIsNotNull(itemLongClickEvents, "$this$itemLongClickEvents");
        Intrinsics.checkParameterIsNotNull(handled, "handled");
        return new C10267g2(itemLongClickEvents, handled);
    }

    /* renamed from: b */
    public static /* synthetic */ Observable m68120b(AdapterView adapterView, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            function1 = AlwaysTrue.INSTANCE;
        }
        return RxAdapterView.itemLongClickEvents(adapterView, function1);
    }
}
