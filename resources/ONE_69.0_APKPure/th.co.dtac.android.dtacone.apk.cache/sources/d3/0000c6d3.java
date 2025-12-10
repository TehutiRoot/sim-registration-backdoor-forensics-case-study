package p000;

import android.content.res.TypedArray;
import android.graphics.Typeface;
import androidx.annotation.DoNotInline;
import androidx.annotation.StyleableRes;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: fX1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C19932fX1 {

    /* renamed from: a */
    public static final C19932fX1 f61874a = new C19932fX1();

    @JvmStatic
    @DoNotInline
    @NotNull
    /* renamed from: a */
    public static final Typeface m31515a(@NotNull TypedArray typedArray, @StyleableRes int i) {
        Intrinsics.checkNotNullParameter(typedArray, "typedArray");
        Typeface font = typedArray.getFont(i);
        Intrinsics.checkNotNull(font);
        return font;
    }
}