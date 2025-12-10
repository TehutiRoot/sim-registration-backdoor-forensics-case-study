package p000;

import android.widget.TextView;
import com.jakewharton.rxbinding3.InitialValueObservable;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: ZB1 */
/* loaded from: classes5.dex */
public abstract /* synthetic */ class ZB1 {
    /* renamed from: a */
    public static final InitialValueObservable m65260a(TextView textChangeEvents) {
        Intrinsics.checkParameterIsNotNull(textChangeEvents, "$this$textChangeEvents");
        return new BS1(textChangeEvents);
    }
}
