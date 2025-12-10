package p000;

import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.SerializerProvider;
import java.util.Locale;
import java.util.TimeZone;

/* renamed from: Jg0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC17887Jg0 {
    protected static final Locale DEFAULT_LOCALE = Locale.getDefault();
    protected final boolean _explicitLocale;
    protected final Locale _locale;
    protected final Boolean _useTimestamp;

    public AbstractC17887Jg0() {
        this._useTimestamp = null;
        this._locale = DEFAULT_LOCALE;
        this._explicitLocale = false;
    }

    public boolean useTimestamp(SerializerProvider serializerProvider, SerializationFeature serializationFeature) {
        Boolean bool = this._useTimestamp;
        if (bool != null) {
            return bool.booleanValue();
        }
        return serializerProvider.isEnabled(serializationFeature);
    }

    public AbstractC17887Jg0(AbstractC17887Jg0 abstractC17887Jg0) {
        this._useTimestamp = abstractC17887Jg0._useTimestamp;
        this._locale = abstractC17887Jg0._locale;
        this._explicitLocale = abstractC17887Jg0._explicitLocale;
    }

    public AbstractC17887Jg0(AbstractC17887Jg0 abstractC17887Jg0, Boolean bool) {
        this._useTimestamp = bool;
        this._locale = abstractC17887Jg0._locale;
        this._explicitLocale = abstractC17887Jg0._explicitLocale;
    }

    public AbstractC17887Jg0(AbstractC17887Jg0 abstractC17887Jg0, TimeZone timeZone) {
        this._useTimestamp = abstractC17887Jg0._useTimestamp;
        this._locale = abstractC17887Jg0._locale;
        this._explicitLocale = abstractC17887Jg0._explicitLocale;
    }

    public AbstractC17887Jg0(AbstractC17887Jg0 abstractC17887Jg0, Locale locale) {
        this._useTimestamp = abstractC17887Jg0._useTimestamp;
        if (locale == null) {
            this._locale = DEFAULT_LOCALE;
            this._explicitLocale = false;
            return;
        }
        this._locale = locale;
        this._explicitLocale = true;
    }
}