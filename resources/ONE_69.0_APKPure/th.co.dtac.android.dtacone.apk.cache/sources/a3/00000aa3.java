package p000;

import android.widget.RatingBar;
import com.jakewharton.rxbinding3.InitialValueObservable;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: LC1 */
/* loaded from: classes5.dex */
public abstract /* synthetic */ class LC1 {
    /* renamed from: a */
    public static final InitialValueObservable m67612a(RatingBar ratingChangeEvents) {
        Intrinsics.checkParameterIsNotNull(ratingChangeEvents, "$this$ratingChangeEvents");
        return new C18049Ls1(ratingChangeEvents);
    }
}