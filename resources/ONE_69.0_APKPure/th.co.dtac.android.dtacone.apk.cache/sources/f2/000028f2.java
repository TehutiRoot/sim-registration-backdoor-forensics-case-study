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

@Metadata(m29143d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u001a&\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\"\u001a\u0010\u000b\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\f"}, m29142d2 = {"Lkotlin/Function1;", "Landroidx/compose/ui/input/key/KeyEvent;", "", "shortcutModifier", "Landroidx/compose/foundation/text/KeyMapping;", "commonKeyMapping", "(Lkotlin/jvm/functions/Function1;)Landroidx/compose/foundation/text/KeyMapping;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroidx/compose/foundation/text/KeyMapping;", "getDefaultKeyMapping", "()Landroidx/compose/foundation/text/KeyMapping;", "defaultKeyMapping", "foundation_release"}, m29141k = 2, m29140mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class KeyMappingKt {

    /* renamed from: a */
    public static final KeyMapping f14060a;

    static {
        final KeyMapping commonKeyMapping = commonKeyMapping(KeyMappingKt$defaultKeyMapping$1.INSTANCE);
        f14060a = new KeyMapping() { // from class: androidx.compose.foundation.text.KeyMappingKt$defaultKeyMapping$2$1
            @Override // androidx.compose.foundation.text.KeyMapping
            @Nullable
            /* renamed from: map-ZmokQxo */
            public KeyCommand mo69919mapZmokQxo(@NotNull KeyEvent event) {
                Intrinsics.checkNotNullParameter(event, "event");
                KeyCommand keyCommand = null;
                if (KeyEvent_androidKt.m72794isShiftPressedZmokQxo(event) && KeyEvent_androidKt.m72792isCtrlPressedZmokQxo(event)) {
                    long m72788getKeyZmokQxo = KeyEvent_androidKt.m72788getKeyZmokQxo(event);
                    MappedKeys mappedKeys = MappedKeys.INSTANCE;
                    if (Key.m72480equalsimpl0(m72788getKeyZmokQxo, mappedKeys.m69939getDirectionLeftEK5gGoQ())) {
                        keyCommand = KeyCommand.SELECT_LEFT_WORD;
                    } else if (Key.m72480equalsimpl0(m72788getKeyZmokQxo, mappedKeys.m69940getDirectionRightEK5gGoQ())) {
                        keyCommand = KeyCommand.SELECT_RIGHT_WORD;
                    } else if (Key.m72480equalsimpl0(m72788getKeyZmokQxo, mappedKeys.m69941getDirectionUpEK5gGoQ())) {
                        keyCommand = KeyCommand.SELECT_PREV_PARAGRAPH;
                    } else if (Key.m72480equalsimpl0(m72788getKeyZmokQxo, mappedKeys.m69938getDirectionDownEK5gGoQ())) {
                        keyCommand = KeyCommand.SELECT_NEXT_PARAGRAPH;
                    }
                } else if (KeyEvent_androidKt.m72792isCtrlPressedZmokQxo(event)) {
                    long m72788getKeyZmokQxo2 = KeyEvent_androidKt.m72788getKeyZmokQxo(event);
                    MappedKeys mappedKeys2 = MappedKeys.INSTANCE;
                    if (Key.m72480equalsimpl0(m72788getKeyZmokQxo2, mappedKeys2.m69939getDirectionLeftEK5gGoQ())) {
                        keyCommand = KeyCommand.LEFT_WORD;
                    } else if (Key.m72480equalsimpl0(m72788getKeyZmokQxo2, mappedKeys2.m69940getDirectionRightEK5gGoQ())) {
                        keyCommand = KeyCommand.RIGHT_WORD;
                    } else if (Key.m72480equalsimpl0(m72788getKeyZmokQxo2, mappedKeys2.m69941getDirectionUpEK5gGoQ())) {
                        keyCommand = KeyCommand.PREV_PARAGRAPH;
                    } else if (Key.m72480equalsimpl0(m72788getKeyZmokQxo2, mappedKeys2.m69938getDirectionDownEK5gGoQ())) {
                        keyCommand = KeyCommand.NEXT_PARAGRAPH;
                    } else if (Key.m72480equalsimpl0(m72788getKeyZmokQxo2, mappedKeys2.m69943getHEK5gGoQ())) {
                        keyCommand = KeyCommand.DELETE_PREV_CHAR;
                    } else if (Key.m72480equalsimpl0(m72788getKeyZmokQxo2, mappedKeys2.m69937getDeleteEK5gGoQ())) {
                        keyCommand = KeyCommand.DELETE_NEXT_WORD;
                    } else if (Key.m72480equalsimpl0(m72788getKeyZmokQxo2, mappedKeys2.m69933getBackspaceEK5gGoQ())) {
                        keyCommand = KeyCommand.DELETE_PREV_WORD;
                    } else if (Key.m72480equalsimpl0(m72788getKeyZmokQxo2, mappedKeys2.m69932getBackslashEK5gGoQ())) {
                        keyCommand = KeyCommand.DESELECT;
                    }
                } else if (KeyEvent_androidKt.m72794isShiftPressedZmokQxo(event)) {
                    long m72788getKeyZmokQxo3 = KeyEvent_androidKt.m72788getKeyZmokQxo(event);
                    MappedKeys mappedKeys3 = MappedKeys.INSTANCE;
                    if (Key.m72480equalsimpl0(m72788getKeyZmokQxo3, mappedKeys3.m69946getMoveHomeEK5gGoQ())) {
                        keyCommand = KeyCommand.SELECT_LINE_LEFT;
                    } else if (Key.m72480equalsimpl0(m72788getKeyZmokQxo3, mappedKeys3.m69945getMoveEndEK5gGoQ())) {
                        keyCommand = KeyCommand.SELECT_LINE_RIGHT;
                    }
                } else if (KeyEvent_androidKt.m72791isAltPressedZmokQxo(event)) {
                    long m72788getKeyZmokQxo4 = KeyEvent_androidKt.m72788getKeyZmokQxo(event);
                    MappedKeys mappedKeys4 = MappedKeys.INSTANCE;
                    if (Key.m72480equalsimpl0(m72788getKeyZmokQxo4, mappedKeys4.m69933getBackspaceEK5gGoQ())) {
                        keyCommand = KeyCommand.DELETE_FROM_LINE_START;
                    } else if (Key.m72480equalsimpl0(m72788getKeyZmokQxo4, mappedKeys4.m69937getDeleteEK5gGoQ())) {
                        keyCommand = KeyCommand.DELETE_TO_LINE_END;
                    }
                }
                if (keyCommand == null) {
                    return KeyMapping.this.mo69919mapZmokQxo(event);
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
            public KeyCommand mo69919mapZmokQxo(@NotNull KeyEvent event) {
                boolean m72480equalsimpl0;
                Intrinsics.checkNotNullParameter(event, "event");
                if (((Boolean) Function1.this.invoke(androidx.compose.p003ui.input.key.KeyEvent.m72771boximpl(event))).booleanValue() && KeyEvent_androidKt.m72794isShiftPressedZmokQxo(event)) {
                    if (!Key.m72480equalsimpl0(KeyEvent_androidKt.m72788getKeyZmokQxo(event), MappedKeys.INSTANCE.m69954getZEK5gGoQ())) {
                        return null;
                    }
                    return KeyCommand.REDO;
                } else if (((Boolean) Function1.this.invoke(androidx.compose.p003ui.input.key.KeyEvent.m72771boximpl(event))).booleanValue()) {
                    long m72788getKeyZmokQxo = KeyEvent_androidKt.m72788getKeyZmokQxo(event);
                    MappedKeys mappedKeys = MappedKeys.INSTANCE;
                    if (Key.m72480equalsimpl0(m72788getKeyZmokQxo, mappedKeys.m69934getCEK5gGoQ())) {
                        m72480equalsimpl0 = true;
                    } else {
                        m72480equalsimpl0 = Key.m72480equalsimpl0(m72788getKeyZmokQxo, mappedKeys.m69944getInsertEK5gGoQ());
                    }
                    if (m72480equalsimpl0) {
                        return KeyCommand.COPY;
                    }
                    if (Key.m72480equalsimpl0(m72788getKeyZmokQxo, mappedKeys.m69951getVEK5gGoQ())) {
                        return KeyCommand.PASTE;
                    }
                    if (Key.m72480equalsimpl0(m72788getKeyZmokQxo, mappedKeys.m69952getXEK5gGoQ())) {
                        return KeyCommand.CUT;
                    }
                    if (Key.m72480equalsimpl0(m72788getKeyZmokQxo, mappedKeys.m69931getAEK5gGoQ())) {
                        return KeyCommand.SELECT_ALL;
                    }
                    if (Key.m72480equalsimpl0(m72788getKeyZmokQxo, mappedKeys.m69953getYEK5gGoQ())) {
                        return KeyCommand.REDO;
                    }
                    if (!Key.m72480equalsimpl0(m72788getKeyZmokQxo, mappedKeys.m69954getZEK5gGoQ())) {
                        return null;
                    }
                    return KeyCommand.UNDO;
                } else if (KeyEvent_androidKt.m72792isCtrlPressedZmokQxo(event)) {
                    return null;
                } else {
                    if (KeyEvent_androidKt.m72794isShiftPressedZmokQxo(event)) {
                        long m72788getKeyZmokQxo2 = KeyEvent_androidKt.m72788getKeyZmokQxo(event);
                        MappedKeys mappedKeys2 = MappedKeys.INSTANCE;
                        if (Key.m72480equalsimpl0(m72788getKeyZmokQxo2, mappedKeys2.m69939getDirectionLeftEK5gGoQ())) {
                            return KeyCommand.SELECT_LEFT_CHAR;
                        }
                        if (Key.m72480equalsimpl0(m72788getKeyZmokQxo2, mappedKeys2.m69940getDirectionRightEK5gGoQ())) {
                            return KeyCommand.SELECT_RIGHT_CHAR;
                        }
                        if (Key.m72480equalsimpl0(m72788getKeyZmokQxo2, mappedKeys2.m69941getDirectionUpEK5gGoQ())) {
                            return KeyCommand.SELECT_UP;
                        }
                        if (Key.m72480equalsimpl0(m72788getKeyZmokQxo2, mappedKeys2.m69938getDirectionDownEK5gGoQ())) {
                            return KeyCommand.SELECT_DOWN;
                        }
                        if (Key.m72480equalsimpl0(m72788getKeyZmokQxo2, mappedKeys2.m69948getPageUpEK5gGoQ())) {
                            return KeyCommand.SELECT_PAGE_UP;
                        }
                        if (Key.m72480equalsimpl0(m72788getKeyZmokQxo2, mappedKeys2.m69947getPageDownEK5gGoQ())) {
                            return KeyCommand.SELECT_PAGE_DOWN;
                        }
                        if (Key.m72480equalsimpl0(m72788getKeyZmokQxo2, mappedKeys2.m69946getMoveHomeEK5gGoQ())) {
                            return KeyCommand.SELECT_LINE_START;
                        }
                        if (Key.m72480equalsimpl0(m72788getKeyZmokQxo2, mappedKeys2.m69945getMoveEndEK5gGoQ())) {
                            return KeyCommand.SELECT_LINE_END;
                        }
                        if (!Key.m72480equalsimpl0(m72788getKeyZmokQxo2, mappedKeys2.m69944getInsertEK5gGoQ())) {
                            return null;
                        }
                        return KeyCommand.PASTE;
                    }
                    long m72788getKeyZmokQxo3 = KeyEvent_androidKt.m72788getKeyZmokQxo(event);
                    MappedKeys mappedKeys3 = MappedKeys.INSTANCE;
                    if (Key.m72480equalsimpl0(m72788getKeyZmokQxo3, mappedKeys3.m69939getDirectionLeftEK5gGoQ())) {
                        return KeyCommand.LEFT_CHAR;
                    }
                    if (Key.m72480equalsimpl0(m72788getKeyZmokQxo3, mappedKeys3.m69940getDirectionRightEK5gGoQ())) {
                        return KeyCommand.RIGHT_CHAR;
                    }
                    if (Key.m72480equalsimpl0(m72788getKeyZmokQxo3, mappedKeys3.m69941getDirectionUpEK5gGoQ())) {
                        return KeyCommand.UP;
                    }
                    if (Key.m72480equalsimpl0(m72788getKeyZmokQxo3, mappedKeys3.m69938getDirectionDownEK5gGoQ())) {
                        return KeyCommand.DOWN;
                    }
                    if (Key.m72480equalsimpl0(m72788getKeyZmokQxo3, mappedKeys3.m69948getPageUpEK5gGoQ())) {
                        return KeyCommand.PAGE_UP;
                    }
                    if (Key.m72480equalsimpl0(m72788getKeyZmokQxo3, mappedKeys3.m69947getPageDownEK5gGoQ())) {
                        return KeyCommand.PAGE_DOWN;
                    }
                    if (Key.m72480equalsimpl0(m72788getKeyZmokQxo3, mappedKeys3.m69946getMoveHomeEK5gGoQ())) {
                        return KeyCommand.LINE_START;
                    }
                    if (Key.m72480equalsimpl0(m72788getKeyZmokQxo3, mappedKeys3.m69945getMoveEndEK5gGoQ())) {
                        return KeyCommand.LINE_END;
                    }
                    if (Key.m72480equalsimpl0(m72788getKeyZmokQxo3, mappedKeys3.m69942getEnterEK5gGoQ())) {
                        return KeyCommand.NEW_LINE;
                    }
                    if (Key.m72480equalsimpl0(m72788getKeyZmokQxo3, mappedKeys3.m69933getBackspaceEK5gGoQ())) {
                        return KeyCommand.DELETE_PREV_CHAR;
                    }
                    if (Key.m72480equalsimpl0(m72788getKeyZmokQxo3, mappedKeys3.m69937getDeleteEK5gGoQ())) {
                        return KeyCommand.DELETE_NEXT_CHAR;
                    }
                    if (Key.m72480equalsimpl0(m72788getKeyZmokQxo3, mappedKeys3.m69949getPasteEK5gGoQ())) {
                        return KeyCommand.PASTE;
                    }
                    if (Key.m72480equalsimpl0(m72788getKeyZmokQxo3, mappedKeys3.m69936getCutEK5gGoQ())) {
                        return KeyCommand.CUT;
                    }
                    if (Key.m72480equalsimpl0(m72788getKeyZmokQxo3, mappedKeys3.m69935getCopyEK5gGoQ())) {
                        return KeyCommand.COPY;
                    }
                    if (!Key.m72480equalsimpl0(m72788getKeyZmokQxo3, mappedKeys3.m69950getTabEK5gGoQ())) {
                        return null;
                    }
                    return KeyCommand.TAB;
                }
            }
        };
    }

    @NotNull
    public static final KeyMapping getDefaultKeyMapping() {
        return f14060a;
    }
}