package androidx.compose.foundation.text;

import android.view.KeyEvent;
import androidx.compose.p003ui.input.key.Key;
import androidx.compose.p003ui.input.key.KeyEvent_androidKt;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u001a&\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\"\u001a\u0010\u000b\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\f"}, m28850d2 = {"Lkotlin/Function1;", "Landroidx/compose/ui/input/key/KeyEvent;", "", "shortcutModifier", "Landroidx/compose/foundation/text/KeyMapping;", "commonKeyMapping", "(Lkotlin/jvm/functions/Function1;)Landroidx/compose/foundation/text/KeyMapping;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroidx/compose/foundation/text/KeyMapping;", "getDefaultKeyMapping", "()Landroidx/compose/foundation/text/KeyMapping;", "defaultKeyMapping", "foundation_release"}, m28849k = 2, m28848mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class KeyMappingKt {

    /* renamed from: a */
    public static final KeyMapping f13972a;

    static {
        final KeyMapping commonKeyMapping = commonKeyMapping(KeyMappingKt$defaultKeyMapping$1.INSTANCE);
        f13972a = new KeyMapping() { // from class: androidx.compose.foundation.text.KeyMappingKt$defaultKeyMapping$2$1
            @Override // androidx.compose.foundation.text.KeyMapping
            @Nullable
            /* renamed from: map-ZmokQxo */
            public KeyCommand mo69735mapZmokQxo(@NotNull KeyEvent event) {
                Intrinsics.checkNotNullParameter(event, "event");
                KeyCommand keyCommand = null;
                if (KeyEvent_androidKt.m72610isShiftPressedZmokQxo(event) && KeyEvent_androidKt.m72608isCtrlPressedZmokQxo(event)) {
                    long m72604getKeyZmokQxo = KeyEvent_androidKt.m72604getKeyZmokQxo(event);
                    MappedKeys mappedKeys = MappedKeys.INSTANCE;
                    if (Key.m72296equalsimpl0(m72604getKeyZmokQxo, mappedKeys.m69755getDirectionLeftEK5gGoQ())) {
                        keyCommand = KeyCommand.SELECT_LEFT_WORD;
                    } else if (Key.m72296equalsimpl0(m72604getKeyZmokQxo, mappedKeys.m69756getDirectionRightEK5gGoQ())) {
                        keyCommand = KeyCommand.SELECT_RIGHT_WORD;
                    } else if (Key.m72296equalsimpl0(m72604getKeyZmokQxo, mappedKeys.m69757getDirectionUpEK5gGoQ())) {
                        keyCommand = KeyCommand.SELECT_PREV_PARAGRAPH;
                    } else if (Key.m72296equalsimpl0(m72604getKeyZmokQxo, mappedKeys.m69754getDirectionDownEK5gGoQ())) {
                        keyCommand = KeyCommand.SELECT_NEXT_PARAGRAPH;
                    }
                } else if (KeyEvent_androidKt.m72608isCtrlPressedZmokQxo(event)) {
                    long m72604getKeyZmokQxo2 = KeyEvent_androidKt.m72604getKeyZmokQxo(event);
                    MappedKeys mappedKeys2 = MappedKeys.INSTANCE;
                    if (Key.m72296equalsimpl0(m72604getKeyZmokQxo2, mappedKeys2.m69755getDirectionLeftEK5gGoQ())) {
                        keyCommand = KeyCommand.LEFT_WORD;
                    } else if (Key.m72296equalsimpl0(m72604getKeyZmokQxo2, mappedKeys2.m69756getDirectionRightEK5gGoQ())) {
                        keyCommand = KeyCommand.RIGHT_WORD;
                    } else if (Key.m72296equalsimpl0(m72604getKeyZmokQxo2, mappedKeys2.m69757getDirectionUpEK5gGoQ())) {
                        keyCommand = KeyCommand.PREV_PARAGRAPH;
                    } else if (Key.m72296equalsimpl0(m72604getKeyZmokQxo2, mappedKeys2.m69754getDirectionDownEK5gGoQ())) {
                        keyCommand = KeyCommand.NEXT_PARAGRAPH;
                    } else if (Key.m72296equalsimpl0(m72604getKeyZmokQxo2, mappedKeys2.m69759getHEK5gGoQ())) {
                        keyCommand = KeyCommand.DELETE_PREV_CHAR;
                    } else if (Key.m72296equalsimpl0(m72604getKeyZmokQxo2, mappedKeys2.m69753getDeleteEK5gGoQ())) {
                        keyCommand = KeyCommand.DELETE_NEXT_WORD;
                    } else if (Key.m72296equalsimpl0(m72604getKeyZmokQxo2, mappedKeys2.m69749getBackspaceEK5gGoQ())) {
                        keyCommand = KeyCommand.DELETE_PREV_WORD;
                    } else if (Key.m72296equalsimpl0(m72604getKeyZmokQxo2, mappedKeys2.m69748getBackslashEK5gGoQ())) {
                        keyCommand = KeyCommand.DESELECT;
                    }
                } else if (KeyEvent_androidKt.m72610isShiftPressedZmokQxo(event)) {
                    long m72604getKeyZmokQxo3 = KeyEvent_androidKt.m72604getKeyZmokQxo(event);
                    MappedKeys mappedKeys3 = MappedKeys.INSTANCE;
                    if (Key.m72296equalsimpl0(m72604getKeyZmokQxo3, mappedKeys3.m69762getMoveHomeEK5gGoQ())) {
                        keyCommand = KeyCommand.SELECT_LINE_LEFT;
                    } else if (Key.m72296equalsimpl0(m72604getKeyZmokQxo3, mappedKeys3.m69761getMoveEndEK5gGoQ())) {
                        keyCommand = KeyCommand.SELECT_LINE_RIGHT;
                    }
                } else if (KeyEvent_androidKt.m72607isAltPressedZmokQxo(event)) {
                    long m72604getKeyZmokQxo4 = KeyEvent_androidKt.m72604getKeyZmokQxo(event);
                    MappedKeys mappedKeys4 = MappedKeys.INSTANCE;
                    if (Key.m72296equalsimpl0(m72604getKeyZmokQxo4, mappedKeys4.m69749getBackspaceEK5gGoQ())) {
                        keyCommand = KeyCommand.DELETE_FROM_LINE_START;
                    } else if (Key.m72296equalsimpl0(m72604getKeyZmokQxo4, mappedKeys4.m69753getDeleteEK5gGoQ())) {
                        keyCommand = KeyCommand.DELETE_TO_LINE_END;
                    }
                }
                if (keyCommand == null) {
                    return KeyMapping.this.mo69735mapZmokQxo(event);
                }
                return keyCommand;
            }
        };
    }

    @NotNull
    public static final KeyMapping commonKeyMapping(@NotNull final Function1<? super androidx.compose.p003ui.input.key.KeyEvent, Boolean> shortcutModifier) {
        Intrinsics.checkNotNullParameter(shortcutModifier, "shortcutModifier");
        return new KeyMapping() { // from class: androidx.compose.foundation.text.KeyMappingKt$commonKeyMapping$1
            @Override // androidx.compose.foundation.text.KeyMapping
            @Nullable
            /* renamed from: map-ZmokQxo */
            public KeyCommand mo69735mapZmokQxo(@NotNull KeyEvent event) {
                boolean m72296equalsimpl0;
                Intrinsics.checkNotNullParameter(event, "event");
                if (((Boolean) Function1.this.invoke(androidx.compose.p003ui.input.key.KeyEvent.m72587boximpl(event))).booleanValue() && KeyEvent_androidKt.m72610isShiftPressedZmokQxo(event)) {
                    if (!Key.m72296equalsimpl0(KeyEvent_androidKt.m72604getKeyZmokQxo(event), MappedKeys.INSTANCE.m69770getZEK5gGoQ())) {
                        return null;
                    }
                    return KeyCommand.REDO;
                } else if (((Boolean) Function1.this.invoke(androidx.compose.p003ui.input.key.KeyEvent.m72587boximpl(event))).booleanValue()) {
                    long m72604getKeyZmokQxo = KeyEvent_androidKt.m72604getKeyZmokQxo(event);
                    MappedKeys mappedKeys = MappedKeys.INSTANCE;
                    if (Key.m72296equalsimpl0(m72604getKeyZmokQxo, mappedKeys.m69750getCEK5gGoQ())) {
                        m72296equalsimpl0 = true;
                    } else {
                        m72296equalsimpl0 = Key.m72296equalsimpl0(m72604getKeyZmokQxo, mappedKeys.m69760getInsertEK5gGoQ());
                    }
                    if (m72296equalsimpl0) {
                        return KeyCommand.COPY;
                    }
                    if (Key.m72296equalsimpl0(m72604getKeyZmokQxo, mappedKeys.m69767getVEK5gGoQ())) {
                        return KeyCommand.PASTE;
                    }
                    if (Key.m72296equalsimpl0(m72604getKeyZmokQxo, mappedKeys.m69768getXEK5gGoQ())) {
                        return KeyCommand.CUT;
                    }
                    if (Key.m72296equalsimpl0(m72604getKeyZmokQxo, mappedKeys.m69747getAEK5gGoQ())) {
                        return KeyCommand.SELECT_ALL;
                    }
                    if (Key.m72296equalsimpl0(m72604getKeyZmokQxo, mappedKeys.m69769getYEK5gGoQ())) {
                        return KeyCommand.REDO;
                    }
                    if (!Key.m72296equalsimpl0(m72604getKeyZmokQxo, mappedKeys.m69770getZEK5gGoQ())) {
                        return null;
                    }
                    return KeyCommand.UNDO;
                } else if (KeyEvent_androidKt.m72608isCtrlPressedZmokQxo(event)) {
                    return null;
                } else {
                    if (KeyEvent_androidKt.m72610isShiftPressedZmokQxo(event)) {
                        long m72604getKeyZmokQxo2 = KeyEvent_androidKt.m72604getKeyZmokQxo(event);
                        MappedKeys mappedKeys2 = MappedKeys.INSTANCE;
                        if (Key.m72296equalsimpl0(m72604getKeyZmokQxo2, mappedKeys2.m69755getDirectionLeftEK5gGoQ())) {
                            return KeyCommand.SELECT_LEFT_CHAR;
                        }
                        if (Key.m72296equalsimpl0(m72604getKeyZmokQxo2, mappedKeys2.m69756getDirectionRightEK5gGoQ())) {
                            return KeyCommand.SELECT_RIGHT_CHAR;
                        }
                        if (Key.m72296equalsimpl0(m72604getKeyZmokQxo2, mappedKeys2.m69757getDirectionUpEK5gGoQ())) {
                            return KeyCommand.SELECT_UP;
                        }
                        if (Key.m72296equalsimpl0(m72604getKeyZmokQxo2, mappedKeys2.m69754getDirectionDownEK5gGoQ())) {
                            return KeyCommand.SELECT_DOWN;
                        }
                        if (Key.m72296equalsimpl0(m72604getKeyZmokQxo2, mappedKeys2.m69764getPageUpEK5gGoQ())) {
                            return KeyCommand.SELECT_PAGE_UP;
                        }
                        if (Key.m72296equalsimpl0(m72604getKeyZmokQxo2, mappedKeys2.m69763getPageDownEK5gGoQ())) {
                            return KeyCommand.SELECT_PAGE_DOWN;
                        }
                        if (Key.m72296equalsimpl0(m72604getKeyZmokQxo2, mappedKeys2.m69762getMoveHomeEK5gGoQ())) {
                            return KeyCommand.SELECT_LINE_START;
                        }
                        if (Key.m72296equalsimpl0(m72604getKeyZmokQxo2, mappedKeys2.m69761getMoveEndEK5gGoQ())) {
                            return KeyCommand.SELECT_LINE_END;
                        }
                        if (!Key.m72296equalsimpl0(m72604getKeyZmokQxo2, mappedKeys2.m69760getInsertEK5gGoQ())) {
                            return null;
                        }
                        return KeyCommand.PASTE;
                    }
                    long m72604getKeyZmokQxo3 = KeyEvent_androidKt.m72604getKeyZmokQxo(event);
                    MappedKeys mappedKeys3 = MappedKeys.INSTANCE;
                    if (Key.m72296equalsimpl0(m72604getKeyZmokQxo3, mappedKeys3.m69755getDirectionLeftEK5gGoQ())) {
                        return KeyCommand.LEFT_CHAR;
                    }
                    if (Key.m72296equalsimpl0(m72604getKeyZmokQxo3, mappedKeys3.m69756getDirectionRightEK5gGoQ())) {
                        return KeyCommand.RIGHT_CHAR;
                    }
                    if (Key.m72296equalsimpl0(m72604getKeyZmokQxo3, mappedKeys3.m69757getDirectionUpEK5gGoQ())) {
                        return KeyCommand.UP;
                    }
                    if (Key.m72296equalsimpl0(m72604getKeyZmokQxo3, mappedKeys3.m69754getDirectionDownEK5gGoQ())) {
                        return KeyCommand.DOWN;
                    }
                    if (Key.m72296equalsimpl0(m72604getKeyZmokQxo3, mappedKeys3.m69764getPageUpEK5gGoQ())) {
                        return KeyCommand.PAGE_UP;
                    }
                    if (Key.m72296equalsimpl0(m72604getKeyZmokQxo3, mappedKeys3.m69763getPageDownEK5gGoQ())) {
                        return KeyCommand.PAGE_DOWN;
                    }
                    if (Key.m72296equalsimpl0(m72604getKeyZmokQxo3, mappedKeys3.m69762getMoveHomeEK5gGoQ())) {
                        return KeyCommand.LINE_START;
                    }
                    if (Key.m72296equalsimpl0(m72604getKeyZmokQxo3, mappedKeys3.m69761getMoveEndEK5gGoQ())) {
                        return KeyCommand.LINE_END;
                    }
                    if (Key.m72296equalsimpl0(m72604getKeyZmokQxo3, mappedKeys3.m69758getEnterEK5gGoQ())) {
                        return KeyCommand.NEW_LINE;
                    }
                    if (Key.m72296equalsimpl0(m72604getKeyZmokQxo3, mappedKeys3.m69749getBackspaceEK5gGoQ())) {
                        return KeyCommand.DELETE_PREV_CHAR;
                    }
                    if (Key.m72296equalsimpl0(m72604getKeyZmokQxo3, mappedKeys3.m69753getDeleteEK5gGoQ())) {
                        return KeyCommand.DELETE_NEXT_CHAR;
                    }
                    if (Key.m72296equalsimpl0(m72604getKeyZmokQxo3, mappedKeys3.m69765getPasteEK5gGoQ())) {
                        return KeyCommand.PASTE;
                    }
                    if (Key.m72296equalsimpl0(m72604getKeyZmokQxo3, mappedKeys3.m69752getCutEK5gGoQ())) {
                        return KeyCommand.CUT;
                    }
                    if (Key.m72296equalsimpl0(m72604getKeyZmokQxo3, mappedKeys3.m69751getCopyEK5gGoQ())) {
                        return KeyCommand.COPY;
                    }
                    if (!Key.m72296equalsimpl0(m72604getKeyZmokQxo3, mappedKeys3.m69766getTabEK5gGoQ())) {
                        return null;
                    }
                    return KeyCommand.TAB;
                }
            }
        };
    }

    @NotNull
    public static final KeyMapping getDefaultKeyMapping() {
        return f13972a;
    }
}
