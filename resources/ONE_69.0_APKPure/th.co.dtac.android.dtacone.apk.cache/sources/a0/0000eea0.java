package org.apache.commons.cli;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.Properties;
import java.util.function.Consumer;
import org.apache.commons.cli.CommandLine;

/* loaded from: classes6.dex */
public class DefaultParser implements CommandLineParser {

    /* renamed from: a */
    public final boolean f73043a;

    /* renamed from: b */
    public final Boolean f73044b;

    /* renamed from: c */
    public final Consumer f73045c;
    protected CommandLine cmd;
    protected Option currentOption;
    protected String currentToken;
    protected List expectedOpts;
    protected Options options;
    protected boolean skipParsing;
    protected boolean stopAtNonOption;

    /* loaded from: classes6.dex */
    public static final class Builder {

        /* renamed from: a */
        public boolean f73046a;

        /* renamed from: b */
        public Consumer f73047b;

        /* renamed from: c */
        public Boolean f73048c;

        public DefaultParser build() {
            return new DefaultParser(this.f73046a, this.f73048c, this.f73047b);
        }

        public Builder setAllowPartialMatching(boolean z) {
            this.f73046a = z;
            return this;
        }

        public Builder setDeprecatedHandler(Consumer<Option> consumer) {
            this.f73047b = consumer;
            return this;
        }

        public Builder setStripLeadingAndTrailingQuotes(Boolean bool) {
            this.f73048c = bool;
            return this;
        }

        public Builder() {
            this.f73046a = true;
            this.f73047b = CommandLine.Builder.f73039d;
        }
    }

    public static Builder builder() {
        return new Builder();
    }

    /* renamed from: l */
    public static int m25926l(String str) {
        return str.indexOf(61);
    }

    /* renamed from: a */
    public final void m25937a() {
        Option option = this.currentOption;
        if (option != null && option.requiresArg()) {
            if (m25924n(this.currentOption.getKey()) && this.currentOption.getValuesList().size() == 1) {
                return;
            }
            throw new MissingArgumentException(this.currentOption);
        }
    }

    /* renamed from: b */
    public final String m25936b(String str) {
        String m69333d = A12.m69333d(str);
        for (int length = m69333d.length() - 2; length > 1; length--) {
            String substring = m69333d.substring(0, length);
            if (this.options.hasLongOption(substring)) {
                return substring;
            }
        }
        return null;
    }

    /* renamed from: c */
    public final List m25935c(String str) {
        if (this.f73043a) {
            return this.options.getMatchingOptions(str);
        }
        ArrayList arrayList = new ArrayList(1);
        if (this.options.hasLongOption(str)) {
            arrayList.add(this.options.getOption(str).getLongOpt());
        }
        return arrayList;
    }

    public void checkRequiredOptions() throws MissingOptionException {
        if (this.expectedOpts.isEmpty()) {
            return;
        }
        throw new MissingOptionException(this.expectedOpts);
    }

    /* renamed from: d */
    public final void m25934d(String str) {
        if (m25926l(str) == -1) {
            m25932f(str);
        } else {
            m25933e(str);
        }
    }

    /* renamed from: e */
    public final void m25933e(String str) {
        int m25926l = m25926l(str);
        String substring = str.substring(m25926l + 1);
        String substring2 = str.substring(0, m25926l);
        List m25935c = m25935c(substring2);
        if (m25935c.isEmpty()) {
            m25927k(this.currentToken);
        } else if (m25935c.size() > 1 && !this.options.hasLongOption(substring2)) {
            throw new AmbiguousOptionException(substring2, m25935c);
        } else {
            if (!this.options.hasLongOption(substring2)) {
                substring2 = (String) m25935c.get(0);
            }
            Option option = this.options.getOption(substring2);
            if (option.acceptsArg()) {
                m25931g(option);
                this.currentOption.processValue(m25919s(substring));
                this.currentOption = null;
                return;
            }
            m25927k(this.currentToken);
        }
    }

    /* renamed from: f */
    public final void m25932f(String str) {
        List m25935c = m25935c(str);
        if (m25935c.isEmpty()) {
            m25927k(this.currentToken);
        } else if (m25935c.size() > 1 && !this.options.hasLongOption(str)) {
            throw new AmbiguousOptionException(str, m25935c);
        } else {
            if (!this.options.hasLongOption(str)) {
                str = (String) m25935c.get(0);
            }
            m25931g(this.options.getOption(str));
        }
    }

    /* renamed from: g */
    public final void m25931g(Option option) {
        m25937a();
        Option option2 = (Option) option.clone();
        m25917u(option2);
        this.cmd.addOption(option2);
        if (!option2.hasArg()) {
            option2 = null;
        }
        this.currentOption = option2;
    }

    /* renamed from: h */
    public final void m25930h(Properties properties) {
        boolean z;
        if (properties == null) {
            return;
        }
        Enumeration<?> propertyNames = properties.propertyNames();
        while (propertyNames.hasMoreElements()) {
            String obj = propertyNames.nextElement().toString();
            Option option = this.options.getOption(obj);
            if (option != null) {
                OptionGroup optionGroup = this.options.getOptionGroup(option);
                if (optionGroup != null && optionGroup.isSelected()) {
                    z = true;
                } else {
                    z = false;
                }
                if (!this.cmd.hasOption(obj) && !z) {
                    String property = properties.getProperty(obj);
                    if (option.hasArg()) {
                        if (A12.m69335b(option.getValues())) {
                            option.processValue(m25919s(property));
                        }
                    } else if (!"yes".equalsIgnoreCase(property) && !"true".equalsIgnoreCase(property) && !"1".equalsIgnoreCase(property)) {
                    }
                    m25931g(option);
                    this.currentOption = null;
                }
            } else {
                throw new UnrecognizedOptionException("Default option wasn't defined", obj);
            }
        }
    }

    public void handleConcatenatedOptions(String str) throws ParseException {
        int i;
        for (int i2 = 1; i2 < str.length(); i2++) {
            String valueOf = String.valueOf(str.charAt(i2));
            if (!this.options.hasOption(valueOf)) {
                if (this.stopAtNonOption && i2 > 1) {
                    str = str.substring(i2);
                }
                m25927k(str);
                return;
            }
            m25931g(this.options.getOption(valueOf));
            if (this.currentOption != null && str.length() != (i = i2 + 1)) {
                this.currentOption.processValue(m25919s(str.substring(i)));
                return;
            }
        }
    }

    /* renamed from: i */
    public final void m25929i(String str) {
        String m69333d = A12.m69333d(str);
        int m25926l = m25926l(m69333d);
        if (m69333d.length() == 1) {
            if (this.options.hasShortOption(m69333d)) {
                m25931g(this.options.getOption(m69333d));
            } else {
                m25927k(str);
            }
        } else if (m25926l == -1) {
            if (this.options.hasShortOption(m69333d)) {
                m25931g(this.options.getOption(m69333d));
            } else if (!m25935c(m69333d).isEmpty()) {
                m25932f(str);
            } else {
                String m25936b = m25936b(m69333d);
                if (m25936b != null && this.options.getOption(m25936b).acceptsArg()) {
                    m25931g(this.options.getOption(m25936b));
                    this.currentOption.processValue(m25919s(m69333d.substring(m25936b.length())));
                    this.currentOption = null;
                } else if (m25924n(m69333d)) {
                    m25931g(this.options.getOption(m69333d.substring(0, 1)));
                    this.currentOption.processValue(m25919s(m69333d.substring(1)));
                    this.currentOption = null;
                } else {
                    handleConcatenatedOptions(str);
                }
            }
        } else {
            String substring = m69333d.substring(0, m25926l);
            String substring2 = m69333d.substring(m25926l + 1);
            if (substring.length() == 1) {
                Option option = this.options.getOption(substring);
                if (option != null && option.acceptsArg()) {
                    m25931g(option);
                    this.currentOption.processValue(substring2);
                    this.currentOption = null;
                    return;
                }
                m25927k(str);
            } else if (m25924n(substring)) {
                m25931g(this.options.getOption(substring.substring(0, 1)));
                this.currentOption.processValue(substring.substring(1));
                this.currentOption.processValue(substring2);
                this.currentOption = null;
            } else {
                m25933e(str);
            }
        }
    }

    /* renamed from: j */
    public final void m25928j(String str) {
        if (str != null) {
            this.currentToken = str;
            if (this.skipParsing) {
                this.cmd.addArg(str);
            } else if (HelpFormatter.DEFAULT_LONG_OPT_PREFIX.equals(str)) {
                this.skipParsing = true;
            } else {
                Option option = this.currentOption;
                if (option != null && option.acceptsArg() && m25925m(str)) {
                    this.currentOption.processValue(m25918t(str));
                } else if (str.startsWith(HelpFormatter.DEFAULT_LONG_OPT_PREFIX)) {
                    m25934d(str);
                } else if (str.startsWith(HelpFormatter.DEFAULT_OPT_PREFIX) && !HelpFormatter.DEFAULT_OPT_PREFIX.equals(str)) {
                    m25929i(str);
                } else {
                    m25927k(str);
                }
            }
            Option option2 = this.currentOption;
            if (option2 != null && !option2.acceptsArg()) {
                this.currentOption = null;
            }
        }
    }

    /* renamed from: k */
    public final void m25927k(String str) {
        if (str.startsWith(HelpFormatter.DEFAULT_OPT_PREFIX) && str.length() > 1 && !this.stopAtNonOption) {
            throw new UnrecognizedOptionException("Unrecognized option: " + str, str);
        }
        this.cmd.addArg(str);
        if (this.stopAtNonOption) {
            this.skipParsing = true;
        }
    }

    /* renamed from: m */
    public final boolean m25925m(String str) {
        if (m25921q(str) && !m25922p(str)) {
            return false;
        }
        return true;
    }

    /* renamed from: n */
    public final boolean m25924n(String str) {
        String substring;
        if (str.isEmpty()) {
            substring = null;
        } else {
            substring = str.substring(0, 1);
        }
        Option option = this.options.getOption(substring);
        if (option != null && (option.getArgs() >= 2 || option.getArgs() == -2)) {
            return true;
        }
        return false;
    }

    /* renamed from: o */
    public final boolean m25923o(String str) {
        String substring;
        if (str != null && str.startsWith(HelpFormatter.DEFAULT_OPT_PREFIX) && str.length() != 1) {
            int m25926l = m25926l(str);
            if (m25926l == -1) {
                substring = str;
            } else {
                substring = str.substring(0, m25926l);
            }
            if (!m25935c(substring).isEmpty()) {
                return true;
            }
            if (m25936b(str) != null && !str.startsWith(HelpFormatter.DEFAULT_LONG_OPT_PREFIX)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: p */
    public final boolean m25922p(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    @Override // org.apache.commons.cli.CommandLineParser
    public CommandLine parse(Options options, String[] strArr) throws ParseException {
        return parse(options, strArr, (Properties) null);
    }

    /* renamed from: q */
    public final boolean m25921q(String str) {
        if (!m25923o(str) && !m25920r(str)) {
            return false;
        }
        return true;
    }

    /* renamed from: r */
    public final boolean m25920r(String str) {
        String substring;
        if (str == null || !str.startsWith(HelpFormatter.DEFAULT_OPT_PREFIX) || str.length() == 1) {
            return false;
        }
        int m25926l = m25926l(str);
        if (m25926l == -1) {
            substring = str.substring(1);
        } else {
            substring = str.substring(1, m25926l);
        }
        if (this.options.hasShortOption(substring)) {
            return true;
        }
        if (substring.isEmpty() || !this.options.hasShortOption(String.valueOf(substring.charAt(0)))) {
            return false;
        }
        return true;
    }

    /* renamed from: s */
    public final String m25919s(String str) {
        Boolean bool = this.f73044b;
        if (bool != null && bool.booleanValue()) {
            return A12.m69334c(str);
        }
        return str;
    }

    /* renamed from: t */
    public final String m25918t(String str) {
        Boolean bool = this.f73044b;
        if (bool != null && !bool.booleanValue()) {
            return str;
        }
        return A12.m69334c(str);
    }

    /* renamed from: u */
    public final void m25917u(Option option) {
        if (option.isRequired()) {
            this.expectedOpts.remove(option.getKey());
        }
        if (this.options.getOptionGroup(option) != null) {
            OptionGroup optionGroup = this.options.getOptionGroup(option);
            if (optionGroup.isRequired()) {
                this.expectedOpts.remove(optionGroup);
            }
            optionGroup.setSelected(option);
        }
    }

    public DefaultParser() {
        this.f73043a = true;
        this.f73044b = null;
        this.f73045c = CommandLine.Builder.f73039d;
    }

    @Override // org.apache.commons.cli.CommandLineParser
    public CommandLine parse(Options options, String[] strArr, boolean z) throws ParseException {
        return parse(options, strArr, null, z);
    }

    public CommandLine parse(Options options, String[] strArr, Properties properties) throws ParseException {
        return parse(options, strArr, properties, false);
    }

    public CommandLine parse(Options options, String[] strArr, Properties properties, boolean z) throws ParseException {
        this.options = options;
        this.stopAtNonOption = z;
        this.skipParsing = false;
        this.currentOption = null;
        this.expectedOpts = new ArrayList(options.getRequiredOptions());
        for (OptionGroup optionGroup : options.getOptionGroups()) {
            optionGroup.setSelected(null);
        }
        this.cmd = CommandLine.builder().setDeprecatedHandler(this.f73045c).build();
        if (strArr != null) {
            for (String str : strArr) {
                m25928j(str);
            }
        }
        m25937a();
        m25930h(properties);
        checkRequiredOptions();
        return this.cmd;
    }

    public DefaultParser(boolean z) {
        this.f73043a = z;
        this.f73044b = null;
        this.f73045c = CommandLine.Builder.f73039d;
    }

    public DefaultParser(boolean z, Boolean bool, Consumer consumer) {
        this.f73043a = z;
        this.f73044b = bool;
        this.f73045c = consumer;
    }
}