package p000;

import android.widget.Adapter;
import com.jakewharton.rxbinding3.InitialValueObservable;
import com.jakewharton.rxbinding3.widget.AdapterDataChangeObservable;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: LA1 */
/* loaded from: classes5.dex */
public abstract /* synthetic */ class LA1 {
    /* renamed from: a */
    public static final InitialValueObservable m67540a(Adapter dataChanges) {
        Intrinsics.checkParameterIsNotNull(dataChanges, "$this$dataChanges");
        return new AdapterDataChangeObservable(dataChanges);
    }
}
