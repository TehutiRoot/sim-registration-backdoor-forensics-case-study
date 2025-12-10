package p000;

import android.view.View;
import io.reactivex.Observable;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: kC1  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract /* synthetic */ class AbstractC20688kC1 {
    /* renamed from: a */
    public static final Observable m28985a(View attaches) {
        Intrinsics.checkParameterIsNotNull(attaches, "$this$attaches");
        return new C20315i22(attaches, true);
    }

    /* renamed from: b */
    public static final Observable m28984b(View detaches) {
        Intrinsics.checkParameterIsNotNull(detaches, "$this$detaches");
        return new C20315i22(detaches, false);
    }
}
