package p000;

import android.os.PersistableBundle;
import androidx.annotation.DoNotInline;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: Xk1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C18810Xk1 {

    /* renamed from: a */
    public static final C18810Xk1 f7645a = new C18810Xk1();

    @JvmStatic
    @DoNotInline
    /* renamed from: a */
    public static final void m65573a(@NotNull PersistableBundle persistableBundle, @Nullable String str, boolean z) {
        Intrinsics.checkNotNullParameter(persistableBundle, "persistableBundle");
        persistableBundle.putBoolean(str, z);
    }

    @JvmStatic
    @DoNotInline
    /* renamed from: b */
    public static final void m65572b(@NotNull PersistableBundle persistableBundle, @Nullable String str, @NotNull boolean[] value) {
        Intrinsics.checkNotNullParameter(persistableBundle, "persistableBundle");
        Intrinsics.checkNotNullParameter(value, "value");
        persistableBundle.putBooleanArray(str, value);
    }
}