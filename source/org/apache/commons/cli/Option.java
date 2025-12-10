package org.apache.commons.cli;

import ch.qos.logback.core.CoreConstants;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.apache.http.message.TokenParser;

/* loaded from: classes6.dex */
public class Option implements Cloneable, Serializable {
    static final Option[] EMPTY_ARRAY = new Option[0];
    public static final int UNINITIALIZED = -1;
    public static final int UNLIMITED_VALUES = -2;
    private static final long serialVersionUID = 1;
    private int argCount;
    private String argName;
    private transient Converter<?, ?> converter;
    private final transient DeprecatedAttributes deprecated;
    private String description;
    private String longOption;
    private final String option;
    private boolean optionalArg;
    private boolean required;
    private String since;
    private Class<?> type;
    private char valueSeparator;
    private List<String> values;

    /* loaded from: classes6.dex */
    public static final class Builder {

        /* renamed from: m */
        public static final Class f72980m = String.class;

        /* renamed from: a */
        public int f72981a;

        /* renamed from: b */
        public String f72982b;

        /* renamed from: c */
        public Converter f72983c;

        /* renamed from: d */
        public DeprecatedAttributes f72984d;

        /* renamed from: e */
        public String f72985e;

        /* renamed from: f */
        public String f72986f;

        /* renamed from: g */
        public String f72987g;

        /* renamed from: h */
        public boolean f72988h;

        /* renamed from: i */
        public boolean f72989i;

        /* renamed from: j */
        public String f72990j;

        /* renamed from: k */
        public Class f72991k;

        /* renamed from: l */
        public char f72992l;

        /* renamed from: n */
        public static Class m25700n(Class cls) {
            if (cls == null) {
                return f72980m;
            }
            return cls;
        }

        public Builder argName(String str) {
            this.f72982b = str;
            return this;
        }

        public Option build() {
            if (this.f72987g == null && this.f72986f == null) {
                throw new IllegalArgumentException("Either opt or longOpt must be specified");
            }
            return new Option(this);
        }

        public Builder converter(Converter<?, ?> converter) {
            this.f72983c = converter;
            return this;
        }

        public Builder deprecated() {
            return deprecated(DeprecatedAttributes.f72965d);
        }

        public Builder desc(String str) {
            this.f72985e = str;
            return this;
        }

        public Builder hasArg() {
            return hasArg(true);
        }

        public Builder hasArgs() {
            this.f72981a = -2;
            return this;
        }

        public Builder longOpt(String str) {
            this.f72986f = str;
            return this;
        }

        public Builder numberOfArgs(int i) {
            this.f72981a = i;
            return this;
        }

        public Builder option(String str) throws IllegalArgumentException {
            this.f72987g = AbstractC18877Zf1.m65158d(str);
            return this;
        }

        public Builder optionalArg(boolean z) {
            if (z && this.f72981a == -1) {
                this.f72981a = 1;
            }
            this.f72988h = z;
            return this;
        }

        public Builder required() {
            return required(true);
        }

        public Builder since(String str) {
            this.f72990j = str;
            return this;
        }

        public Builder type(Class<?> cls) {
            this.f72991k = m25700n(cls);
            return this;
        }

        public Builder valueSeparator() {
            return valueSeparator('=');
        }

        public Builder(String str) {
            this.f72981a = -1;
            this.f72991k = f72980m;
            option(str);
        }

        public Builder deprecated(DeprecatedAttributes deprecatedAttributes) {
            this.f72984d = deprecatedAttributes;
            return this;
        }

        public Builder hasArg(boolean z) {
            this.f72981a = z ? 1 : -1;
            return this;
        }

        public Builder required(boolean z) {
            this.f72989i = z;
            return this;
        }

        public Builder valueSeparator(char c) {
            this.f72992l = c;
            return this;
        }
    }

    private void add(String str) {
        if (acceptsArg()) {
            this.values.add(str);
            return;
        }
        throw new IllegalArgumentException("Cannot add value, list full.");
    }

    public static Builder builder() {
        return builder(null);
    }

    private boolean hasNoValues() {
        return this.values.isEmpty();
    }

    public boolean acceptsArg() {
        if ((!hasArg() && !hasArgs() && !hasOptionalArg()) || (this.argCount > 0 && this.values.size() >= this.argCount)) {
            return false;
        }
        return true;
    }

    @Deprecated
    public boolean addValue(String str) {
        throw new UnsupportedOperationException("The addValue method is not intended for client use. Subclasses should use the processValue method instead.");
    }

    public void clearValues() {
        this.values.clear();
    }

    public Object clone() {
        try {
            Option option = (Option) super.clone();
            option.values = new ArrayList(this.values);
            return option;
        } catch (CloneNotSupportedException e) {
            throw new UnsupportedOperationException(e.getMessage(), e);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Option)) {
            return false;
        }
        Option option = (Option) obj;
        if (Objects.equals(this.longOption, option.longOption) && Objects.equals(this.option, option.option)) {
            return true;
        }
        return false;
    }

    public String getArgName() {
        return this.argName;
    }

    public int getArgs() {
        return this.argCount;
    }

    public Converter<?, ?> getConverter() {
        Converter<?, ?> converter = this.converter;
        if (converter == null) {
            return TypeHandler.getDefault().getConverter(this.type);
        }
        return converter;
    }

    public DeprecatedAttributes getDeprecated() {
        return this.deprecated;
    }

    public String getDescription() {
        return this.description;
    }

    public int getId() {
        return getKey().charAt(0);
    }

    public String getKey() {
        String str = this.option;
        if (str == null) {
            return this.longOption;
        }
        return str;
    }

    public String getLongOpt() {
        return this.longOption;
    }

    public String getOpt() {
        return this.option;
    }

    public String getSince() {
        return this.since;
    }

    public Object getType() {
        return this.type;
    }

    public String getValue() {
        if (hasNoValues()) {
            return null;
        }
        return this.values.get(0);
    }

    public char getValueSeparator() {
        return this.valueSeparator;
    }

    public String[] getValues() {
        if (hasNoValues()) {
            return null;
        }
        return (String[]) this.values.toArray(D02.f886a);
    }

    public List<String> getValuesList() {
        return this.values;
    }

    public boolean hasArg() {
        int i = this.argCount;
        if (i <= 0 && i != -2) {
            return false;
        }
        return true;
    }

    public boolean hasArgName() {
        String str = this.argName;
        if (str != null && !str.isEmpty()) {
            return true;
        }
        return false;
    }

    public boolean hasArgs() {
        int i = this.argCount;
        if (i > 1 || i == -2) {
            return true;
        }
        return false;
    }

    public boolean hasLongOpt() {
        if (this.longOption != null) {
            return true;
        }
        return false;
    }

    public boolean hasOptionalArg() {
        return this.optionalArg;
    }

    public boolean hasValueSeparator() {
        if (this.valueSeparator > 0) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Objects.hash(this.longOption, this.option);
    }

    public boolean isDeprecated() {
        if (this.deprecated != null) {
            return true;
        }
        return false;
    }

    public boolean isRequired() {
        return this.required;
    }

    public void processValue(String str) {
        if (this.argCount != -1) {
            if (hasValueSeparator()) {
                char valueSeparator = getValueSeparator();
                int indexOf = str.indexOf(valueSeparator);
                while (indexOf != -1 && this.values.size() != this.argCount - 1) {
                    add(str.substring(0, indexOf));
                    str = str.substring(indexOf + 1);
                    indexOf = str.indexOf(valueSeparator);
                }
            }
            add(str);
            return;
        }
        throw new IllegalArgumentException("NO_ARGS_ALLOWED");
    }

    public boolean requiresArg() {
        if (this.optionalArg) {
            return false;
        }
        if (this.argCount == -2) {
            return this.values.isEmpty();
        }
        return acceptsArg();
    }

    public void setArgName(String str) {
        this.argName = str;
    }

    public void setArgs(int i) {
        this.argCount = i;
    }

    public void setConverter(Converter<?, ?> converter) {
        this.converter = converter;
    }

    public void setDescription(String str) {
        this.description = str;
    }

    public void setLongOpt(String str) {
        this.longOption = str;
    }

    public void setOptionalArg(boolean z) {
        this.optionalArg = z;
    }

    public void setRequired(boolean z) {
        this.required = z;
    }

    public void setType(Class<?> cls) {
        this.type = Builder.m25700n(cls);
    }

    public void setValueSeparator(char c) {
        this.valueSeparator = c;
    }

    public String toDeprecatedString() {
        if (!isDeprecated()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Option '");
        sb.append(this.option);
        sb.append(CoreConstants.SINGLE_QUOTE_CHAR);
        if (this.longOption != null) {
            sb.append(CoreConstants.SINGLE_QUOTE_CHAR);
            sb.append(this.longOption);
            sb.append(CoreConstants.SINGLE_QUOTE_CHAR);
        }
        sb.append(": ");
        sb.append(this.deprecated);
        return sb.toString();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[ ");
        sb.append("Option ");
        sb.append(this.option);
        if (this.longOption != null) {
            sb.append(TokenParser.f74560SP);
            sb.append(this.longOption);
        }
        if (isDeprecated()) {
            sb.append(TokenParser.f74560SP);
            sb.append(this.deprecated.toString());
        }
        if (hasArgs()) {
            sb.append("[ARG...]");
        } else if (hasArg()) {
            sb.append(" [ARG]");
        }
        sb.append(" :: ");
        sb.append(this.description);
        sb.append(" :: ");
        sb.append(this.type);
        sb.append(" ]");
        return sb.toString();
    }

    private Option(Builder builder) {
        this.argCount = -1;
        this.type = String.class;
        this.values = new ArrayList();
        this.argName = builder.f72982b;
        this.description = builder.f72985e;
        this.longOption = builder.f72986f;
        this.argCount = builder.f72981a;
        this.option = builder.f72987g;
        this.optionalArg = builder.f72988h;
        this.deprecated = builder.f72984d;
        this.required = builder.f72989i;
        this.since = builder.f72990j;
        this.type = builder.f72991k;
        this.valueSeparator = builder.f72992l;
        this.converter = builder.f72983c;
    }

    public static Builder builder(String str) {
        return new Builder(str);
    }

    public String getValue(int i) throws IndexOutOfBoundsException {
        if (hasNoValues()) {
            return null;
        }
        return this.values.get(i);
    }

    @Deprecated
    public void setType(Object obj) {
        setType((Class) obj);
    }

    public String getValue(String str) {
        String value = getValue();
        return value != null ? value : str;
    }

    public Option(String str, boolean z, String str2) throws IllegalArgumentException {
        this(str, null, z, str2);
    }

    public Option(String str, String str2) throws IllegalArgumentException {
        this(str, null, false, str2);
    }

    public Option(String str, String str2, boolean z, String str3) throws IllegalArgumentException {
        this.argCount = -1;
        this.type = String.class;
        this.values = new ArrayList();
        this.deprecated = null;
        this.option = AbstractC18877Zf1.m65158d(str);
        this.longOption = str2;
        if (z) {
            this.argCount = 1;
        }
        this.description = str3;
    }
}
