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
public final class C1612Wc {

    /* renamed from: a */
    public static final C1612Wc f7307a = new C1612Wc();

    @JvmStatic
    @DoNotInline
    /* renamed from: a */
    public static final void m65738a(@NotNull Bundle bundle, @NotNull String key, @Nullable IBinder iBinder) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        Intrinsics.checkNotNullParameter(key, "key");
        bundle.putBinder(key, iBinder);
    }
}