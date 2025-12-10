package ch.qos.logback.core.rolling.helper;

import ch.qos.logback.core.Context;
import ch.qos.logback.core.pattern.Converter;
import ch.qos.logback.core.pattern.ConverterUtil;
import ch.qos.logback.core.pattern.LiteralConverter;
import ch.qos.logback.core.pattern.parser.Parser;
import ch.qos.logback.core.pattern.util.AlmostAsIsEscapeUtil;
import ch.qos.logback.core.spi.ContextAwareBase;
import ch.qos.logback.core.spi.ScanException;
import com.google.firebase.sessions.settings.RemoteSettings;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class FileNamePattern extends ContextAwareBase {

    /* renamed from: e */
    public static final Map f40076e;

    /* renamed from: c */
    public String f40077c;

    /* renamed from: d */
    public Converter f40078d;

    static {
        HashMap hashMap = new HashMap();
        f40076e = hashMap;
        hashMap.put("i", IntegerTokenConverter.class.getName());
        hashMap.put("d", DateTokenConverter.class.getName());
    }

    public FileNamePattern(String str, Context context) {
        setPattern(FileFilterUtil.slashify(str));
        setContext(context);
        m51385d();
        ConverterUtil.startConverters(this.f40078d);
    }

    /* renamed from: b */
    public String m51386b(String str) {
        return this.f40077c.replace(")", "\\)");
    }

    public String convert(Object obj) {
        StringBuilder sb = new StringBuilder();
        for (Converter converter = this.f40078d; converter != null; converter = converter.getNext()) {
            sb.append(converter.convert(obj));
        }
        return sb.toString();
    }

    public String convertInt(int i) {
        return convert(Integer.valueOf(i));
    }

    public String convertMultipleArguments(Object... objArr) {
        StringBuilder sb = new StringBuilder();
        for (Converter converter = this.f40078d; converter != null; converter = converter.getNext()) {
            if (converter instanceof MonoTypedConverter) {
                MonoTypedConverter monoTypedConverter = (MonoTypedConverter) converter;
                for (Object obj : objArr) {
                    if (monoTypedConverter.isApplicable(obj)) {
                        sb.append(converter.convert(obj));
                    }
                }
            } else {
                sb.append(converter.convert(objArr));
            }
        }
        return sb.toString();
    }

    /* renamed from: d */
    public void m51385d() {
        try {
            Parser parser = new Parser(m51386b(this.f40077c), new AlmostAsIsEscapeUtil());
            parser.setContext(this.context);
            this.f40078d = parser.compile(parser.parse(), f40076e);
        } catch (ScanException e) {
            addError("Failed to parse pattern \"" + this.f40077c + "\".", e);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            String str = this.f40077c;
            String str2 = ((FileNamePattern) obj).f40077c;
            if (str == null) {
                if (str2 != null) {
                    return false;
                }
            } else if (!str.equals(str2)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public IntegerTokenConverter getIntegerTokenConverter() {
        for (Converter converter = this.f40078d; converter != null; converter = converter.getNext()) {
            if (converter instanceof IntegerTokenConverter) {
                return (IntegerTokenConverter) converter;
            }
        }
        return null;
    }

    public String getPattern() {
        return this.f40077c;
    }

    public DateTokenConverter<Object> getPrimaryDateTokenConverter() {
        for (Converter converter = this.f40078d; converter != null; converter = converter.getNext()) {
            if (converter instanceof DateTokenConverter) {
                DateTokenConverter<Object> dateTokenConverter = (DateTokenConverter) converter;
                if (dateTokenConverter.isPrimary()) {
                    return dateTokenConverter;
                }
            }
        }
        return null;
    }

    public boolean hasIntegerTokenCOnverter() {
        return getIntegerTokenConverter() != null;
    }

    public int hashCode() {
        String str = this.f40077c;
        return 31 + (str == null ? 0 : str.hashCode());
    }

    public void setPattern(String str) {
        if (str != null) {
            this.f40077c = str.trim().replace("//", RemoteSettings.FORWARD_SLASH_STRING);
        }
    }

    public String toRegex() {
        return toRegex(false, false);
    }

    public String toRegexForFixedDate(Date date) {
        String regex;
        String convert;
        StringBuilder sb = new StringBuilder();
        for (Converter converter = this.f40078d; converter != null; converter = converter.getNext()) {
            if (converter instanceof LiteralConverter) {
                convert = converter.convert(null);
            } else {
                if (converter instanceof IntegerTokenConverter) {
                    regex = "(\\d+)";
                } else if (converter instanceof DateTokenConverter) {
                    DateTokenConverter dateTokenConverter = (DateTokenConverter) converter;
                    if (dateTokenConverter.isPrimary()) {
                        convert = converter.convert(date);
                    } else {
                        regex = dateTokenConverter.toRegex();
                    }
                }
                convert = C10309gX.m31101e(regex);
            }
            sb.append(convert);
        }
        return sb.toString();
    }

    public String toString() {
        return this.f40077c;
    }

    public String toRegex(boolean z, boolean z2) {
        String regex;
        String m31101e;
        StringBuilder sb = new StringBuilder();
        for (Converter converter = this.f40078d; converter != null; converter = converter.getNext()) {
            if (converter instanceof LiteralConverter) {
                m31101e = converter.convert(null);
            } else {
                if (converter instanceof IntegerTokenConverter) {
                    regex = z2 ? "(\\d+)" : "\\d+";
                } else if (converter instanceof DateTokenConverter) {
                    DateTokenConverter dateTokenConverter = (DateTokenConverter) converter;
                    regex = (z && dateTokenConverter.isPrimary()) ? "(" + dateTokenConverter.toRegex() + ")" : dateTokenConverter.toRegex();
                }
                m31101e = C10309gX.m31101e(regex);
            }
            sb.append(m31101e);
        }
        return sb.toString();
    }
}
