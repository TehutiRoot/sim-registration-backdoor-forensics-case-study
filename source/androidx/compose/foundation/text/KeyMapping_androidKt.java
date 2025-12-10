package androidx.compose.foundation.text;

import android.view.KeyEvent;
import androidx.compose.p003ui.input.key.Key;
import androidx.compose.p003ui.input.key.KeyEvent_androidKt;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0006\"\u001a\u0010\u0005\u001a\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, m28850d2 = {"Landroidx/compose/foundation/text/KeyMapping;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroidx/compose/foundation/text/KeyMapping;", "getPlatformDefaultKeyMapping", "()Landroidx/compose/foundation/text/KeyMapping;", "platformDefaultKeyMapping", "foundation_release"}, m28849k = 2, m28848mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class KeyMapping_androidKt {

    /* renamed from: a */
    public static final KeyMapping f13975a = new KeyMapping() { // from class: androidx.compose.foundation.text.KeyMapping_androidKt$platformDefaultKeyMapping$1
        @Override // androidx.compose.foundation.text.KeyMapping
        @Nullable
        /* renamed from: map-ZmokQxo */
        public KeyCommand mo69735mapZmokQxo(@NotNull KeyEvent event) {
            Intrinsics.checkNotNullParameter(event, "event");
            KeyCommand keyCommand = null;
            if (KeyEvent_androidKt.m72610isShiftPressedZmokQxo(event) && KeyEvent_androidKt.m72607isAltPressedZmokQxo(event)) {
                long m72604getKeyZmokQxo = KeyEvent_androidKt.m72604getKeyZmokQxo(event);
                MappedKeys mappedKeys = MappedKeys.INSTANCE;
                if (Key.m72296equalsimpl0(m72604getKeyZmokQxo, mappedKeys.m69755getDirectionLeftEK5gGoQ())) {
                    keyCommand = KeyCommand.SELECT_LINE_LEFT;
                } else if (Key.m72296equalsimpl0(m72604getKeyZmokQxo, mappedKeys.m69756getDirectionRightEK5gGoQ())) {
                    keyCommand = KeyCommand.SELECT_LINE_RIGHT;
                } else if (Key.m72296equalsimpl0(m72604getKeyZmokQxo, mappedKeys.m69757getDirectionUpEK5gGoQ())) {
                    keyCommand = KeyCommand.SELECT_HOME;
                } else if (Key.m72296equalsimpl0(m72604getKeyZmokQxo, mappedKeys.m69754getDirectionDownEK5gGoQ())) {
                    keyCommand = KeyCommand.SELECT_END;
                }
            } else if (KeyEvent_androidKt.m72607isAltPressedZmokQxo(event)) {
                long m72604getKeyZmokQxo2 = KeyEvent_androidKt.m72604getKeyZmokQxo(event);
                MappedKeys mappedKeys2 = MappedKeys.INSTANCE;
                if (Key.m72296equalsimpl0(m72604getKeyZmokQxo2, mappedKeys2.m69755getDirectionLeftEK5gGoQ())) {
                    keyCommand = KeyCommand.LINE_LEFT;
                } else if (Key.m72296equalsimpl0(m72604getKeyZmokQxo2, mappedKeys2.m69756getDirectionRightEK5gGoQ())) {
                    keyCommand = KeyCommand.LINE_RIGHT;
                } else if (Key.m72296equalsimpl0(m72604getKeyZmokQxo2, mappedKeys2.m69757getDirectionUpEK5gGoQ())) {
                    keyCommand = KeyCommand.HOME;
                } else if (Key.m72296equalsimpl0(m72604getKeyZmokQxo2, mappedKeys2.m69754getDirectionDownEK5gGoQ())) {
                    keyCommand = KeyCommand.END;
                }
            }
            if (keyCommand == null) {
                return KeyMappingKt.getDefaultKeyMapping().mo69735mapZmokQxo(event);
            }
            return keyCommand;
        }
    };

    @NotNull
    public static final KeyMapping getPlatformDefaultKeyMapping() {
        return f13975a;
    }
}
