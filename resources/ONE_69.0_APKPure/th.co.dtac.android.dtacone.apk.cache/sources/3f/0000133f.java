package p000;

import android.widget.TextView;
import com.jakewharton.rxbinding3.internal.AlwaysTrue;
import com.jakewharton.rxbinding3.widget.RxTextView;
import io.reactivex.Observable;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: UC1 */
/* loaded from: classes5.dex */
public abstract /* synthetic */ class UC1 {
    /* renamed from: a */
    public static final Observable m66228a(TextView editorActionEvents, Function1 handled) {
        Intrinsics.checkParameterIsNotNull(editorActionEvents, "$this$editorActionEvents");
        Intrinsics.checkParameterIsNotNull(handled, "handled");
        return new C22519uT1(editorActionEvents, handled);
    }

    /* renamed from: b */
    public static /* synthetic */ Observable m66227b(TextView textView, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            function1 = AlwaysTrue.INSTANCE;
        }
        return RxTextView.editorActionEvents(textView, function1);
    }
}