package p000;

import android.os.Build;
import android.text.StaticLayout;
import androidx.annotation.DoNotInline;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: kM1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C20718kM1 implements InterfaceC22782wM1 {
    @Override // p000.InterfaceC22782wM1
    /* renamed from: a */
    public boolean mo860a(StaticLayout layout, boolean z) {
        Intrinsics.checkNotNullParameter(layout, "layout");
        int i = Build.VERSION.SDK_INT;
        if (i >= 33) {
            return C22610vM1.m1045a(layout);
        }
        if (i < 28) {
            return false;
        }
        return z;
    }

    @Override // p000.InterfaceC22782wM1
    @DoNotInline
    @NotNull
    /* renamed from: b */
    public StaticLayout mo859b(@NotNull C22954xM1 params) {
        StaticLayout.Builder obtain;
        StaticLayout build;
        Intrinsics.checkNotNullParameter(params, "params");
        obtain = StaticLayout.Builder.obtain(params.m516r(), params.m517q(), params.m529e(), params.m519o(), params.m513u());
        obtain.setTextDirection(params.m515s());
        obtain.setAlignment(params.m533a());
        obtain.setMaxLines(params.m520n());
        obtain.setEllipsize(params.m531c());
        obtain.setEllipsizedWidth(params.m530d());
        obtain.setLineSpacing(params.m522l(), params.m521m());
        obtain.setIncludePad(params.m527g());
        obtain.setBreakStrategy(params.m532b());
        obtain.setHyphenationFrequency(params.m528f());
        obtain.setIndents(params.m525i(), params.m518p());
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            Intrinsics.checkNotNullExpressionValue(obtain, "this");
            C21062mM1.m26260a(obtain, params.m526h());
        }
        if (i >= 28) {
            Intrinsics.checkNotNullExpressionValue(obtain, "this");
            C21406oM1.m25929a(obtain, params.m514t());
        }
        if (i >= 33) {
            Intrinsics.checkNotNullExpressionValue(obtain, "this");
            C22610vM1.m1044b(obtain, params.m524j(), params.m523k());
        }
        build = obtain.build();
        Intrinsics.checkNotNullExpressionValue(build, "obtain(params.text, para…  }\n            }.build()");
        return build;
    }
}
