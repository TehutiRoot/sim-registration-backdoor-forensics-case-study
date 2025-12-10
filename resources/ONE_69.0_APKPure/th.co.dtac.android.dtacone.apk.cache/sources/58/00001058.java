package p000;

import android.widget.SeekBar;
import com.jakewharton.rxbinding3.InitialValueObservable;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: RC1 */
/* loaded from: classes5.dex */
public abstract /* synthetic */ class RC1 {
    /* renamed from: a */
    public static final InitialValueObservable m66687a(SeekBar changes) {
        Intrinsics.checkParameterIsNotNull(changes, "$this$changes");
        return new C21448oG1(changes, null);
    }

    /* renamed from: b */
    public static final InitialValueObservable m66686b(SeekBar systemChanges) {
        Intrinsics.checkParameterIsNotNull(systemChanges, "$this$systemChanges");
        return new C21448oG1(systemChanges, Boolean.FALSE);
    }

    /* renamed from: c */
    public static final InitialValueObservable m66685c(SeekBar userChanges) {
        Intrinsics.checkParameterIsNotNull(userChanges, "$this$userChanges");
        return new C21448oG1(userChanges, Boolean.TRUE);
    }
}