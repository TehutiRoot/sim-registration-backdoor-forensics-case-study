package com.fasterxml.jackson.core;

import ch.qos.logback.classic.spi.CallerData;
import com.fasterxml.jackson.core.p011io.CharTypes;
import com.google.firebase.sessions.settings.RemoteSettings;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.slf4j.Logger;

/* loaded from: classes3.dex */
public abstract class JsonStreamContext {
    protected static final int TYPE_ARRAY = 1;
    protected static final int TYPE_OBJECT = 2;
    protected static final int TYPE_ROOT = 0;
    protected int _index;
    protected int _type;

    public JsonStreamContext() {
    }

    public final int getCurrentIndex() {
        int i = this._index;
        if (i < 0) {
            return 0;
        }
        return i;
    }

    public abstract String getCurrentName();

    public Object getCurrentValue() {
        return null;
    }

    public final int getEntryCount() {
        return this._index + 1;
    }

    public abstract JsonStreamContext getParent();

    public JsonLocation getStartLocation(Object obj) {
        return JsonLocation.f43100NA;
    }

    @Deprecated
    public final String getTypeDesc() {
        int i = this._type;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return CallerData.f39639NA;
                }
                return "OBJECT";
            }
            return "ARRAY";
        }
        return Logger.ROOT_LOGGER_NAME;
    }

    public boolean hasCurrentIndex() {
        if (this._index >= 0) {
            return true;
        }
        return false;
    }

    public boolean hasCurrentName() {
        if (getCurrentName() != null) {
            return true;
        }
        return false;
    }

    public boolean hasPathSegment() {
        int i = this._type;
        if (i == 2) {
            return hasCurrentName();
        }
        if (i == 1) {
            return hasCurrentIndex();
        }
        return false;
    }

    public final boolean inArray() {
        if (this._type == 1) {
            return true;
        }
        return false;
    }

    public final boolean inObject() {
        if (this._type == 2) {
            return true;
        }
        return false;
    }

    public final boolean inRoot() {
        if (this._type == 0) {
            return true;
        }
        return false;
    }

    public JsonPointer pathAsPointer() {
        return JsonPointer.forPath(this, false);
    }

    public void setCurrentValue(Object obj) {
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(64);
        int i = this._type;
        if (i != 0) {
            if (i != 1) {
                sb.append('{');
                String currentName = getCurrentName();
                if (currentName != null) {
                    sb.append('\"');
                    CharTypes.appendQuoted(sb, currentName);
                    sb.append('\"');
                } else {
                    sb.append('?');
                }
                sb.append('}');
            } else {
                sb.append(AbstractJsonLexerKt.BEGIN_LIST);
                sb.append(getCurrentIndex());
                sb.append(AbstractJsonLexerKt.END_LIST);
            }
        } else {
            sb.append(RemoteSettings.FORWARD_SLASH_STRING);
        }
        return sb.toString();
    }

    public String typeDesc() {
        int i = this._type;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return CallerData.f39639NA;
                }
                return "Object";
            }
            return "Array";
        }
        return "root";
    }

    public JsonStreamContext(JsonStreamContext jsonStreamContext) {
        this._type = jsonStreamContext._type;
        this._index = jsonStreamContext._index;
    }

    public JsonPointer pathAsPointer(boolean z) {
        return JsonPointer.forPath(this, z);
    }

    public JsonStreamContext(int i, int i2) {
        this._type = i;
        this._index = i2;
    }
}
