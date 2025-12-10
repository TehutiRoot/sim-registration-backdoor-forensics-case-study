package p000;

import android.text.StaticLayout;
import androidx.annotation.DoNotInline;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: lN1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C20950lN1 {

    /* renamed from: a */
    public static final C20950lN1 f71716a = new C20950lN1();

    @JvmStatic
    @DoNotInline
    /* renamed from: a */
    public static final void m26815a(@NotNull StaticLayout.Builder builder, boolean z) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        builder.setUseLineSpacingFromFallbacks(z);
    }
}