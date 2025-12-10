package androidx.compose.p003ui.text.font;

import android.content.Context;
import android.graphics.Typeface;
import androidx.compose.p003ui.text.font.AndroidFont;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: androidx.compose.ui.text.font.a */
/* loaded from: classes2.dex */
public final class C3598a implements AndroidFont.TypefaceLoader {

    /* renamed from: a */
    public static final C3598a f31436a = new C3598a();

    @Override // androidx.compose.p003ui.text.font.AndroidFont.TypefaceLoader
    public Object awaitLoad(Context context, AndroidFont androidFont, Continuation continuation) {
        throw new UnsupportedOperationException("All preloaded fonts are blocking.");
    }

    @Override // androidx.compose.p003ui.text.font.AndroidFont.TypefaceLoader
    public Typeface loadBlocking(Context context, AndroidFont font) {
        AndroidPreloadedFont androidPreloadedFont;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(font, "font");
        if (font instanceof AndroidPreloadedFont) {
            androidPreloadedFont = (AndroidPreloadedFont) font;
        } else {
            androidPreloadedFont = null;
        }
        if (androidPreloadedFont == null) {
            return null;
        }
        return androidPreloadedFont.loadCached$ui_text_release(context);
    }
}