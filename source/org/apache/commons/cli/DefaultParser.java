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
    public final boolean f72959a;

    /* renamed from: b */
    public final Boolean f72960b;

    /* renamed from: c */
    public final Consumer f72961c;
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
        public boolean f72962a;

        /* renamed from: b */
        public Consumer f72963b;

        /* renamed from: c */
        public Boolean f72964c;

        public DefaultParser build() {
            return new DefaultParser(this.f72962a, this.f72964c, this.f72963b);
        }

        public Builder setAllowPartialMatching(boolean z) {
            this.f72962a = z;
            return this;
        }

        public Builder setDeprecatedHandler(Consumer<Option> consumer) {
            this.f72963b = consumer;
            return this;
        }

        public Builder setStripLeadingAndTrailingQuotes(Boolean bool) {
            this.f72964c = bool;
            return this;
        }

        public Builder() {
            this.f72962a = true;
            this.f72963b = CommandLine.Builder.f72955d;
        }
    }

    public static Builder builder() {
        return new Builder();
    }

    /* renamed from: l */
    public static int m25736l(String str) {
        return str.indexOf(61);
    }

    /* renamed from: a */
    public final void m25747a() {
        Option option = this.currentOption;
        if (option != null && option.requiresArg()) {
            if (m25734n(this.currentOption.getKey()) && this.currentOption.getValuesList().size() == 1) {
                return;
            }
            throw new MissingArgumentException(this.currentOption);
        }
    }

    /* renamed from: b */
    public final String m25746b(String str) {
        String m68705d = D02.m68705d(str);
        for (int length = m68705d.length() - 2; length > 1; length--) {
            String substring = m68705d.substring(0, length);
            if (this.options.hasLongOption(substring)) {
                return substring;
            }
        }
        return null;
    }

    /* renamed from: c */
    public final List m25745c(String str) {
        if (this.f72959a) {
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
    public final void m25744d(String str) {
        if (m25736l(str) == -1) {
            m25742f(str);
        } else {
            m25743e(str);
        }
    }

    /* renamed from: e */
    public final void m25743e(String str) {
        int m25736l = m25736l(str);
        String substring = str.substring(m25736l + 1);
        String substring2 = str.substring(0, m25736l);
        List m25745c = m25745c(substring2);
        if (m25745c.isEmpty()) {
            m25737k(this.currentToken);
        } else if (m25745c.size() > 1 && !this.options.hasLongOption(substring2)) {
            throw new AmbiguousOptionException(substring2, m25745c);
        } else {
            if (!this.options.hasLongOption(substring2)) {
                substring2 = (String) m25745c.get(0);
            }
            Option option = this.options.getOption(substring2);
            if (option.acceptsArg()) {
                m25741g(option);
                this.currentOption.processValue(m25729s(substring));
                this.currentOption = null;
                return;
            }
            m25737k(this.currentToken);
        }
    }

    /* renamed from: f */
    public final void m25742f(String str) {
        List m25745c = m25745c(str);
        if (m25745c.isEmpty()) {
            m25737k(this.currentToken);
        } else if (m25745c.size() > 1 && !this.options.hasLongOption(str)) {
            throw new AmbiguousOptionException(str, m25745c);
        } else {
            if (!this.options.hasLongOption(str)) {
                str = (String) m25745c.get(0);
            }
            m25741g(this.options.getOption(str));
        }
    }

    /* renamed from: g */
    public final void m25741g(Option option) {
        m25747a();
        Option option2 = (Option) option.clone();
        m25727u(option2);
        this.cmd.addOption(option2);
        if (!option2.hasArg()) {
            option2 = null;
        }
        this.currentOption = option2;
    }

    /* renamed from: h */
    public final void m25740h(Properties properties) {
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
                        if (D02.m68707b(option.getValues())) {
                            option.processValue(m25729s(property));
                        }
                    } else if (!"yes".equalsIgnoreCase(property) && !"true".equalsIgnoreCase(property) && !"1".equalsIgnoreCase(property)) {
                    }
                    m25741g(option);
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
                m25737k(str);
                return;
            }
            m25741g(this.options.getOption(valueOf));
            if (this.currentOption != null && str.length() != (i = i2 + 1)) {
                this.currentOption.processValue(m25729s(str.substring(i)));
                return;
            }
        }
    }

    /* renamed from: i */
    public final void m25739i(String str) {
        String m68705d = D02.m68705d(str);
        int m25736l = m25736l(m68705d);
        if (m68705d.length() == 1) {
            if (this.options.hasShortOption(m68705d)) {
                m25741g(this.options.getOption(m68705d));
            } else {
                m25737k(str);
            }
        } else if (m25736l == -1) {
            if (this.options.hasShortOption(m68705d)) {
                m25741g(this.options.getOption(m68705d));
            } else if (!m25745c(m68705d).isEmpty()) {
                m25742f(str);
            } else {
                String m25746b = m25746b(m68705d);
                if (m25746b != null && this.options.getOption(m25746b).acceptsArg()) {
                    m25741g(this.options.getOption(m25746b));
                    this.currentOption.processValue(m25729s(m68705d.substring(m25746b.length())));
                    this.currentOption = null;
                } else if (m25734n(m68705d)) {
                    m25741g(this.options.getOption(m68705d.substring(0, 1)));
                    this.currentOption.processValue(m25729s(m68705d.substring(1)));
                    this.currentOption = null;
                } else {
                    handleConcatenatedOptions(str);
                }
            }
        } else {
            String substring = m68705d.substring(0, m25736l);
            String substring2 = m68705d.substring(m25736l + 1);
            if (substring.length() == 1) {
                Option option = this.options.getOption(substring);
                if (option != null && option.acceptsArg()) {
                    m25741g(option);
                    this.currentOption.processValue(substring2);
                    this.currentOption = null;
                    return;
                }
                m25737k(str);
            } else if (m25734n(substring)) {
                m25741g(this.options.getOption(substring.substring(0, 1)));
                this.currentOption.processValue(substring.substring(1));
                this.currentOption.processValue(substring2);
                this.currentOption = null;
            } else {
                m25743e(str);
            }
        }
    }

    /* renamed from: j */
    public final void m25738j(String str) {
        if (str != null) {
            this.currentToken = str;
            if (this.skipParsing) {
                this.cmd.addArg(str);
            } else if (HelpFormatter.DEFAULT_LONG_OPT_PREFIX.equals(str)) {
                this.skipParsing = true;
            } else {
                Option option = this.currentOption;
                if (option != null && option.acceptsArg() && m25735m(str)) {
                    this.currentOption.processValue(m25728t(str));
                } else if (str.startsWith(HelpFormatter.DEFAULT_LONG_OPT_PREFIX)) {
                    m25744d(str);
                } else if (str.startsWith(HelpFormatter.DEFAULT_OPT_PREFIX) && !HelpFormatter.DEFAULT_OPT_PREFIX.equals(str)) {
                    m25739i(str);
                } else {
                    m25737k(str);
                }
            }
            Option option2 = this.currentOption;
            if (option2 != null && !option2.acceptsArg()) {
                this.currentOption = null;
            }
        }
    }

    /* renamed from: k */
    public final void m25737k(String str) {
        if (str.startsWith(HelpFormatter.DEFAULT_OPT_PREFIX) && str.length() > 1 && !this.stopAtNonOption) {
            throw new UnrecognizedOptionException("Unrecognized option: " + str, str);
        }
        this.cmd.addArg(str);
        if (this.stopAtNonOption) {
            this.skipParsing = true;
        }
    }

    /* renamed from: m */
    public final boolean m25735m(String str) {
        if (m25731q(str) && !m25732p(str)) {
            return false;
        }
        return true;
    }

    /* renamed from: n */
    public final boolean m25734n(String str) {
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
    public final boolean m25733o(String str) {
        String substring;
        if (str != null && str.startsWith(HelpFormatter.DEFAULT_OPT_PREFIX) && str.length() != 1) {
            int m25736l = m25736l(str);
            if (m25736l == -1) {
                substring = str;
            } else {
                substring = str.substring(0, m25736l);
            }
            if (!m25745c(substring).isEmpty()) {
                return true;
            }
            if (m25746b(str) != null && !str.startsWith(HelpFormatter.DEFAULT_LONG_OPT_PREFIX)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: p */
    public final boolean m25732p(String str) {
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
    public final boolean m25731q(String str) {
        if (!m25733o(str) && !m25730r(str)) {
            return false;
        }
        return true;
    }

    /* renamed from: r */
    public final boolean m25730r(String str) {
        String substring;
        if (str == null || !str.startsWith(HelpFormatter.DEFAULT_OPT_PREFIX) || str.length() == 1) {
            return false;
        }
        int m25736l = m25736l(str);
        if (m25736l == -1) {
            substring = str.substring(1);
        } else {
            substring = str.substring(1, m25736l);
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
    public final String m25729s(String str) {
        Boolean bool = this.f72960b;
        if (bool != null && bool.booleanValue()) {
            return D02.m68706c(str);
        }
        return str;
    }

    /* renamed from: t */
    public final String m25728t(String str) {
        Boolean bool = this.f72960b;
        if (bool != null && !bool.booleanValue()) {
            return str;
        }
        return D02.m68706c(str);
    }

    /* renamed from: u */
    public final void m25727u(Option option) {
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
        this.f72959a = true;
        this.f72960b = null;
        this.f72961c = CommandLine.Builder.f72955d;
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
        this.cmd = CommandLine.builder().setDeprecatedHandler(this.f72961c).build();
        if (strArr != null) {
            for (String str : strArr) {
                m25738j(str);
            }
        }
        m25747a();
        m25740h(properties);
        checkRequiredOptions();
        return this.cmd;
    }

    public DefaultParser(boolean z) {
        this.f72959a = z;
        this.f72960b = null;
        this.f72961c = CommandLine.Builder.f72955d;
    }

    public DefaultParser(boolean z, Boolean bool, Consumer consumer) {
        this.f72959a = z;
        this.f72960b = bool;
        this.f72961c = consumer;
    }
}
