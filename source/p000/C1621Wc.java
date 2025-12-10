package p000;

import android.os.Bundle;
import android.os.IBinder;
import androidx.annotation.DoNotInline;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: Wc */
/* loaded from: classes2.dex */
public final class C1621Wc {

    /* renamed from: a */
    public static final C1621Wc f7240a = new C1621Wc();

    @JvmStatic
    @DoNotInline
    /* renamed from: a */
    public static final void m65596a(@NotNull Bundle bundle, @NotNull String key, @Nullable IBinder iBinder) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        Intrinsics.checkNotNullParameter(key, "key");
        bundle.putBinder(key, iBinder);
    }
}
