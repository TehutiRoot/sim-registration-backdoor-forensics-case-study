package p000;

import android.widget.Adapter;
import com.jakewharton.rxbinding3.InitialValueObservable;
import com.jakewharton.rxbinding3.widget.AdapterDataChangeObservable;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: IB1 */
/* loaded from: classes5.dex */
public abstract /* synthetic */ class IB1 {
    /* renamed from: a */
    public static final InitialValueObservable m68054a(Adapter dataChanges) {
        Intrinsics.checkParameterIsNotNull(dataChanges, "$this$dataChanges");
        return new AdapterDataChangeObservable(dataChanges);
    }
}