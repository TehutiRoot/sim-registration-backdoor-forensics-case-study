package p000;

import android.widget.Toolbar;
import com.jakewharton.rxbinding3.widget.ToolbarNavigationClickObservable;
import io.reactivex.Observable;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: hC1  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract /* synthetic */ class AbstractC20172hC1 {
    /* renamed from: a */
    public static final Observable m30912a(Toolbar navigationClicks) {
        Intrinsics.checkParameterIsNotNull(navigationClicks, "$this$navigationClicks");
        return new ToolbarNavigationClickObservable(navigationClicks);
    }
}
