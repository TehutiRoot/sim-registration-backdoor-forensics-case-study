package p000;

import android.view.MenuItem;
import com.jakewharton.rxbinding3.internal.AlwaysTrue;
import com.jakewharton.rxbinding3.view.RxMenuItem;
import io.reactivex.Observable;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: EB1 */
/* loaded from: classes5.dex */
public abstract /* synthetic */ class EB1 {
    /* renamed from: a */
    public static final Observable m68527a(MenuItem clicks, Function1 handled) {
        Intrinsics.checkParameterIsNotNull(clicks, "$this$clicks");
        Intrinsics.checkParameterIsNotNull(handled, "handled");
        return new C19767es0(clicks, handled);
    }

    /* renamed from: b */
    public static /* synthetic */ Observable m68526b(MenuItem menuItem, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            function1 = AlwaysTrue.INSTANCE;
        }
        return RxMenuItem.clicks(menuItem, function1);
    }
}
