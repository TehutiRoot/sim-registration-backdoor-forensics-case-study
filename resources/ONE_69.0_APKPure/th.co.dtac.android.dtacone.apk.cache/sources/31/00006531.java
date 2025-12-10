package androidx.compose.p003ui.text.font;

import android.content.Context;
import android.graphics.Typeface;
import androidx.compose.p003ui.text.font.AndroidFont;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: androidx.compose.ui.text.font.c */
/* loaded from: classes2.dex */
public final class C3600c implements AndroidFont.TypefaceLoader {

    /* renamed from: a */
    public static final C3600c f31440a = new C3600c();

    @Override // androidx.compose.p003ui.text.font.AndroidFont.TypefaceLoader
    public Object awaitLoad(Context context, AndroidFont androidFont, Continuation continuation) {
        throw new UnsupportedOperationException("All preloaded fonts are optional local.");
    }

    @Override // androidx.compose.p003ui.text.font.AndroidFont.TypefaceLoader
    public Typeface loadBlocking(Context context, AndroidFont font) {
        C3599b c3599b;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(font, "font");
        if (font instanceof C3599b) {
            c3599b = (C3599b) font;
        } else {
            c3599b = null;
        }
        if (c3599b == null) {
            return null;
        }
        return c3599b.m58994a(context);
    }
}