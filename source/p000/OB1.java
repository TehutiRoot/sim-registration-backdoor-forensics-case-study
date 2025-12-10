package p000;

import android.widget.RatingBar;
import com.jakewharton.rxbinding3.InitialValueObservable;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: OB1 */
/* loaded from: classes5.dex */
public abstract /* synthetic */ class OB1 {
    /* renamed from: a */
    public static final InitialValueObservable m67108a(RatingBar ratingChangeEvents) {
        Intrinsics.checkParameterIsNotNull(ratingChangeEvents, "$this$ratingChangeEvents");
        return new C18204Or1(ratingChangeEvents);
    }
}
