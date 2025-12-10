package p000;

import android.os.Bundle;
import android.util.Size;
import android.util.SizeF;
import androidx.annotation.DoNotInline;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: Xc */
/* loaded from: classes2.dex */
public final class C1691Xc {

    /* renamed from: a */
    public static final C1691Xc f7524a = new C1691Xc();

    @JvmStatic
    @DoNotInline
    /* renamed from: a */
    public static final void m65476a(@NotNull Bundle bundle, @NotNull String key, @Nullable Size size) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        Intrinsics.checkNotNullParameter(key, "key");
        bundle.putSize(key, size);
    }

    @JvmStatic
    @DoNotInline
    /* renamed from: b */
    public static final void m65475b(@NotNull Bundle bundle, @NotNull String key, @Nullable SizeF sizeF) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        Intrinsics.checkNotNullParameter(key, "key");
        bundle.putSizeF(key, sizeF);
    }
}
