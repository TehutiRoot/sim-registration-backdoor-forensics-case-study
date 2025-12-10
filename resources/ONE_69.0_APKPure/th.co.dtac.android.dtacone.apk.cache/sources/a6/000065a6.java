package androidx.compose.p003ui.text.platform;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import androidx.emoji2.text.EmojiCompat;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* renamed from: androidx.compose.ui.text.platform.DefaultImpl */
/* loaded from: classes2.dex */
public final class DefaultImpl implements EmojiCompatStatusDelegate {

    /* renamed from: a */
    public State f31590a;

    public DefaultImpl() {
        State state;
        if (EmojiCompat.isConfigured()) {
            state = m58946b();
        } else {
            state = null;
        }
        this.f31590a = state;
    }

    /* renamed from: b */
    public final State m58946b() {
        final MutableState m65148g;
        EmojiCompat emojiCompat = EmojiCompat.get();
        Intrinsics.checkNotNullExpressionValue(emojiCompat, "get()");
        if (emojiCompat.getLoadState() != 1) {
            m65148g = AbstractC19036aL1.m65148g(Boolean.FALSE, null, 2, null);
            emojiCompat.registerInitCallback(new EmojiCompat.InitCallback() { // from class: androidx.compose.ui.text.platform.DefaultImpl$getFontLoadState$initCallback$1
                @Override // androidx.emoji2.text.EmojiCompat.InitCallback
                public void onFailed(@Nullable Throwable th2) {
                    C17358Bd0 c17358Bd0;
                    DefaultImpl defaultImpl = this;
                    c17358Bd0 = EmojiCompatStatusKt.f31594a;
                    defaultImpl.f31590a = c17358Bd0;
                }

                @Override // androidx.emoji2.text.EmojiCompat.InitCallback
                public void onInitialized() {
                    MutableState.this.setValue(Boolean.TRUE);
                    this.f31590a = new C17358Bd0(true);
                }
            });
            return m65148g;
        }
        return new C17358Bd0(true);
    }

    @Override // androidx.compose.p003ui.text.platform.EmojiCompatStatusDelegate
    public State getFontLoaded() {
        C17358Bd0 c17358Bd0;
        State state = this.f31590a;
        if (state != null) {
            Intrinsics.checkNotNull(state);
            return state;
        } else if (!EmojiCompat.isConfigured()) {
            c17358Bd0 = EmojiCompatStatusKt.f31594a;
            return c17358Bd0;
        } else {
            State m58946b = m58946b();
            this.f31590a = m58946b;
            Intrinsics.checkNotNull(m58946b);
            return m58946b;
        }
    }
}