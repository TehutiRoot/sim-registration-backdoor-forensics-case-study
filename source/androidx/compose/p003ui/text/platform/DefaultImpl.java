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
    public State f31502a;

    public DefaultImpl() {
        State state;
        if (EmojiCompat.isConfigured()) {
            state = m58996b();
        } else {
            state = null;
        }
        this.f31502a = state;
    }

    /* renamed from: b */
    public final State m58996b() {
        final MutableState m31891g;
        EmojiCompat emojiCompat = EmojiCompat.get();
        Intrinsics.checkNotNullExpressionValue(emojiCompat, "get()");
        if (emojiCompat.getLoadState() != 1) {
            m31891g = AbstractC19508dK1.m31891g(Boolean.FALSE, null, 2, null);
            emojiCompat.registerInitCallback(new EmojiCompat.InitCallback() { // from class: androidx.compose.ui.text.platform.DefaultImpl$getFontLoadState$initCallback$1
                @Override // androidx.emoji2.text.EmojiCompat.InitCallback
                public void onFailed(@Nullable Throwable th2) {
                    C22646vd0 c22646vd0;
                    DefaultImpl defaultImpl = this;
                    c22646vd0 = EmojiCompatStatusKt.f31506a;
                    defaultImpl.f31502a = c22646vd0;
                }

                @Override // androidx.emoji2.text.EmojiCompat.InitCallback
                public void onInitialized() {
                    MutableState.this.setValue(Boolean.TRUE);
                    this.f31502a = new C22646vd0(true);
                }
            });
            return m31891g;
        }
        return new C22646vd0(true);
    }

    @Override // androidx.compose.p003ui.text.platform.EmojiCompatStatusDelegate
    public State getFontLoaded() {
        C22646vd0 c22646vd0;
        State state = this.f31502a;
        if (state != null) {
            Intrinsics.checkNotNull(state);
            return state;
        } else if (!EmojiCompat.isConfigured()) {
            c22646vd0 = EmojiCompatStatusKt.f31506a;
            return c22646vd0;
        } else {
            State m58996b = m58996b();
            this.f31502a = m58996b;
            Intrinsics.checkNotNull(m58996b);
            return m58996b;
        }
    }
}
