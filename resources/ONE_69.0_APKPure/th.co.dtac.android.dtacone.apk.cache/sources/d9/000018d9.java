package p000;

import android.graphics.Typeface;
import android.text.style.TypefaceSpan;
import androidx.annotation.DoNotInline;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: a5 */
/* loaded from: classes2.dex */
public final class C1847a5 {

    /* renamed from: a */
    public static final C1847a5 f8344a = new C1847a5();

    @DoNotInline
    @NotNull
    /* renamed from: a */
    public final TypefaceSpan m65178a(@NotNull Typeface typeface) {
        Intrinsics.checkNotNullParameter(typeface, "typeface");
        return new TypefaceSpan(typeface);
    }
}