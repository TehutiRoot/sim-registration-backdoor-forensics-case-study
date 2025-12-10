package p000;

import android.content.res.TypedArray;
import android.graphics.Typeface;
import androidx.annotation.DoNotInline;
import androidx.annotation.StyleableRes;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: iW1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C20394iW1 {

    /* renamed from: a */
    public static final C20394iW1 f62813a = new C20394iW1();

    @JvmStatic
    @DoNotInline
    @NotNull
    /* renamed from: a */
    public static final Typeface m30632a(@NotNull TypedArray typedArray, @StyleableRes int i) {
        Intrinsics.checkNotNullParameter(typedArray, "typedArray");
        Typeface font = typedArray.getFont(i);
        Intrinsics.checkNotNull(font);
        return font;
    }
}
