package p000;

import android.widget.AdapterView;
import com.jakewharton.rxbinding3.internal.AlwaysTrue;
import com.jakewharton.rxbinding3.widget.RxAdapterView;
import io.reactivex.Observable;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: FB1 */
/* loaded from: classes5.dex */
public abstract /* synthetic */ class FB1 {
    /* renamed from: a */
    public static final Observable m68505a(AdapterView itemLongClicks, Function0 handled) {
        Intrinsics.checkParameterIsNotNull(itemLongClicks, "$this$itemLongClicks");
        Intrinsics.checkParameterIsNotNull(handled, "handled");
        return new C10422i2(itemLongClicks, handled);
    }

    /* renamed from: b */
    public static /* synthetic */ Observable m68504b(AdapterView adapterView, Function0 function0, int i, Object obj) {
        if ((i & 1) != 0) {
            function0 = AlwaysTrue.INSTANCE;
        }
        return RxAdapterView.itemLongClicks(adapterView, function0);
    }
}