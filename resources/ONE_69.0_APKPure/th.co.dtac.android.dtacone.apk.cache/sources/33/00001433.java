package p000;

import android.widget.TextView;
import com.jakewharton.rxbinding3.internal.AlwaysTrue;
import com.jakewharton.rxbinding3.widget.RxTextView;
import io.reactivex.Observable;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: VC1 */
/* loaded from: classes5.dex */
public abstract /* synthetic */ class VC1 {
    /* renamed from: a */
    public static final Observable m66024a(TextView editorActions, Function1 handled) {
        Intrinsics.checkParameterIsNotNull(editorActions, "$this$editorActions");
        Intrinsics.checkParameterIsNotNull(handled, "handled");
        return new C22865wT1(editorActions, handled);
    }

    /* renamed from: b */
    public static /* synthetic */ Observable m66023b(TextView textView, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            function1 = AlwaysTrue.INSTANCE;
        }
        return RxTextView.editorActions(textView, function1);
    }
}