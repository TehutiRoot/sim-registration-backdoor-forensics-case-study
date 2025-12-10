package p000;

import android.view.MenuItem;
import com.jakewharton.rxbinding3.internal.AlwaysTrue;
import com.jakewharton.rxbinding3.view.RxMenuItem;
import io.reactivex.Observable;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: AC1 */
/* loaded from: classes5.dex */
public abstract /* synthetic */ class AC1 {
    /* renamed from: a */
    public static final Observable m69313a(MenuItem actionViewEvents, Function1 handled) {
        Intrinsics.checkParameterIsNotNull(actionViewEvents, "$this$actionViewEvents");
        Intrinsics.checkParameterIsNotNull(handled, "handled");
        return new C20683js0(actionViewEvents, handled);
    }

    /* renamed from: b */
    public static /* synthetic */ Observable m69312b(MenuItem menuItem, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            function1 = AlwaysTrue.INSTANCE;
        }
        return RxMenuItem.actionViewEvents(menuItem, function1);
    }
}