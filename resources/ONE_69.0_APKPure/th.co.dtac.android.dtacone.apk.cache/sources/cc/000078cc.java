package p000;

import android.os.Bundle;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* renamed from: c5 */
/* loaded from: classes.dex */
public abstract class AbstractC5402c5 {
    @DoNotInline
    /* renamed from: a */
    public static <T> T m51758a(@NonNull Bundle bundle, @Nullable String str, @NonNull Class<T> cls) {
        return (T) bundle.getParcelable(str, cls);
    }
}