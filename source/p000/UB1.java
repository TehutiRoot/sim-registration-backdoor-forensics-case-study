package p000;

import android.widget.SeekBar;
import com.jakewharton.rxbinding3.InitialValueObservable;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: UB1 */
/* loaded from: classes5.dex */
public abstract /* synthetic */ class UB1 {
    /* renamed from: a */
    public static final InitialValueObservable m66084a(SeekBar changes) {
        Intrinsics.checkParameterIsNotNull(changes, "$this$changes");
        return new C21901rF1(changes, null);
    }

    /* renamed from: b */
    public static final InitialValueObservable m66083b(SeekBar systemChanges) {
        Intrinsics.checkParameterIsNotNull(systemChanges, "$this$systemChanges");
        return new C21901rF1(systemChanges, Boolean.FALSE);
    }

    /* renamed from: c */
    public static final InitialValueObservable m66082c(SeekBar userChanges) {
        Intrinsics.checkParameterIsNotNull(userChanges, "$this$userChanges");
        return new C21901rF1(userChanges, Boolean.TRUE);
    }
}
