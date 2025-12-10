package androidx.compose.p003ui.text.font;

import android.content.Context;
import android.graphics.Typeface;
import androidx.compose.p003ui.text.font.AndroidFont;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: androidx.compose.ui.text.font.c */
/* loaded from: classes2.dex */
public final class C3618c implements AndroidFont.TypefaceLoader {

    /* renamed from: a */
    public static final C3618c f31352a = new C3618c();

    @Override // androidx.compose.p003ui.text.font.AndroidFont.TypefaceLoader
    public Object awaitLoad(Context context, AndroidFont androidFont, Continuation continuation) {
        throw new UnsupportedOperationException("All preloaded fonts are optional local.");
    }

    @Override // androidx.compose.p003ui.text.font.AndroidFont.TypefaceLoader
    public Typeface loadBlocking(Context context, AndroidFont font) {
        C3617b c3617b;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(font, "font");
        if (font instanceof C3617b) {
            c3617b = (C3617b) font;
        } else {
            c3617b = null;
        }
        if (c3617b == null) {
            return null;
        }
        return c3617b.m59044a(context);
    }
}
