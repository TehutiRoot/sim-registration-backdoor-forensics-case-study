package p000;

import android.view.View;
import io.reactivex.Observable;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: yC1  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract /* synthetic */ class AbstractC23096yC1 {
    /* renamed from: a */
    public static final Observable m325a(View preDraws, Function0 proceedDrawingPass) {
        Intrinsics.checkParameterIsNotNull(preDraws, "$this$preDraws");
        Intrinsics.checkParameterIsNotNull(proceedDrawingPass, "proceedDrawingPass");
        return new C22038s32(preDraws, proceedDrawingPass);
    }
}
