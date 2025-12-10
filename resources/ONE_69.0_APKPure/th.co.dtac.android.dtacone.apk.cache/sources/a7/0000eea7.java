package org.apache.commons.cli;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Serializable;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Stream;
import org.apache.commons.cli.HelpFormatter;
import org.apache.commons.cli.Option;
import org.apache.http.message.TokenParser;

/* loaded from: classes6.dex */
public class HelpFormatter {
    public static final String DEFAULT_ARG_NAME = "arg";
    public static final int DEFAULT_DESC_PAD = 3;
    public static final int DEFAULT_LEFT_PAD = 1;
    public static final String DEFAULT_LONG_OPT_PREFIX = "--";
    public static final String DEFAULT_LONG_OPT_SEPARATOR = " ";
    public static final String DEFAULT_OPT_PREFIX = "-";
    public static final String DEFAULT_SYNTAX_PREFIX = "usage: ";
    public static final int DEFAULT_WIDTH = 74;

    /* renamed from: a */
    public final Function f73056a;

    /* renamed from: b */
    public final PrintWriter f73057b;

    /* renamed from: c */
    public final boolean f73058c;

    /* renamed from: d */
    public String f73059d;
    @Deprecated
    public String defaultArgName;
    @Deprecated
    public int defaultDescPad;
    @Deprecated
    public int defaultLeftPad;
    @Deprecated
    public String defaultLongOptPrefix;
    @Deprecated
    public String defaultNewLine;
    @Deprecated
    public String defaultOptPrefix;
    @Deprecated
    public String defaultSyntaxPrefix;
    @Deprecated
    public int defaultWidth;
    protected Comparator<Option> optionComparator;

    /* loaded from: classes6.dex */
    public static class Builder implements Supplier<HelpFormatter> {

        /* renamed from: d */
        public static final Function f73060d = new Function() { // from class: R70
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return HelpFormatter.Builder.m25905a((Option) obj);
            }
        };

        /* renamed from: a */
        public Function f73061a = f73060d;

        /* renamed from: b */
        public PrintWriter f73062b = HelpFormatter.m25909g();

        /* renamed from: c */
        public boolean f73063c;

        /* renamed from: a */
        public static /* synthetic */ String m25905a(Option option) {
            return m25904b(option);
        }

        /* renamed from: b */
        public static /* synthetic */ String m25904b(Option option) {
            return "[Deprecated] " + HelpFormatter.getDescription(option);
        }

        public Builder setPrintWriter(PrintWriter printWriter) {
            Objects.requireNonNull(printWriter, "printWriter");
            this.f73062b = printWriter;
            return this;
        }

        public Builder setShowDeprecated(boolean z) {
            return setShowDeprecated(z ? f73060d : null);
        }

        public Builder setShowSince(boolean z) {
            this.f73063c = z;
            return this;
        }

        @Override // java.util.function.Supplier
        public HelpFormatter get() {
            return new HelpFormatter(this.f73061a, this.f73062b, this.f73063c);
        }

        public Builder setShowDeprecated(Function<Option, String> function) {
            this.f73061a = function;
            return this;
        }
    }

    /* loaded from: classes6.dex */
    public static final class OptionComparator implements Comparator<Option>, Serializable {
        private static final long serialVersionUID = 5305467873966684014L;

        private OptionComparator() {
        }

        @Override // java.util.Comparator
        public int compare(Option option, Option option2) {
            return option.getKey().compareToIgnoreCase(option2.getKey());
        }
    }

    /* renamed from: a */
    public static /* synthetic */ Integer m25915a(int i, Option option) {
        return m25907i(i, option);
    }

    public static Builder builder() {
        return new Builder();
    }

    /* renamed from: g */
    public static PrintWriter m25909g() {
        return new PrintWriter(System.out);
    }

    public static String getDescription(Option option) {
        String description = option.getDescription();
        if (description == null) {
            return "";
        }
        return description;
    }

    /* renamed from: i */
    public static /* synthetic */ Integer m25907i(int i, Option option) {
        if (option.getSince() != null) {
            i = option.getSince().length();
        }
        return Integer.valueOf(i);
    }

    /* renamed from: c */
    public final void m25913c(StringBuilder sb, Option option, boolean z) {
        String str;
        String argName;
        if (!z) {
            sb.append("[");
        }
        if (option.getOpt() != null) {
            sb.append(DEFAULT_OPT_PREFIX);
            sb.append(option.getOpt());
        } else {
            sb.append(DEFAULT_LONG_OPT_PREFIX);
            sb.append(option.getLongOpt());
        }
        if (option.hasArg() && (option.getArgName() == null || !option.getArgName().isEmpty())) {
            if (option.getOpt() == null) {
                str = this.f73059d;
            } else {
                str = DEFAULT_LONG_OPT_SEPARATOR;
            }
            sb.append(str);
            sb.append("<");
            if (option.getArgName() != null) {
                argName = option.getArgName();
            } else {
                argName = getArgName();
            }
            sb.append(argName);
            sb.append(">");
        }
        if (!z) {
            sb.append("]");
        }
    }

    public String createPadding(int i) {
        char[] cArr = new char[i];
        Arrays.fill(cArr, (char) TokenParser.f74644SP);
        return new String(cArr);
    }

    /* renamed from: d */
    public final void m25912d(StringBuilder sb, OptionGroup optionGroup) {
        if (!optionGroup.isRequired()) {
            sb.append("[");
        }
        ArrayList arrayList = new ArrayList(optionGroup.getOptions());
        if (getOptionComparator() != null) {
            Collections.sort(arrayList, getOptionComparator());
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            m25913c(sb, (Option) it.next(), true);
            if (it.hasNext()) {
                sb.append(" | ");
            }
        }
        if (!optionGroup.isRequired()) {
            sb.append("]");
        }
    }

    /* renamed from: e */
    public Appendable m25911e(Appendable appendable, int i, Options options, int i2, int i3) {
        int i4;
        Object apply;
        String since;
        String str;
        String argName;
        String createPadding = createPadding(i2);
        String createPadding2 = createPadding(i3);
        if (this.f73058c) {
            i4 = m25908h(options) + i2;
        } else {
            i4 = 0;
        }
        ArrayList arrayList = new ArrayList();
        List<Option> helpOptions = options.helpOptions();
        if (getOptionComparator() != null) {
            Collections.sort(helpOptions, getOptionComparator());
        }
        int i5 = 0;
        for (Option option : helpOptions) {
            StringBuilder sb = new StringBuilder();
            if (option.getOpt() == null) {
                sb.append(createPadding);
                sb.append("   ");
                sb.append(getLongOptPrefix());
                sb.append(option.getLongOpt());
            } else {
                sb.append(createPadding);
                sb.append(getOptPrefix());
                sb.append(option.getOpt());
                if (option.hasLongOpt()) {
                    sb.append(',');
                    sb.append(getLongOptPrefix());
                    sb.append(option.getLongOpt());
                }
            }
            if (option.hasArg()) {
                String argName2 = option.getArgName();
                if (argName2 != null && argName2.isEmpty()) {
                    sb.append(TokenParser.f74644SP);
                } else {
                    if (option.hasLongOpt()) {
                        str = this.f73059d;
                    } else {
                        str = DEFAULT_LONG_OPT_SEPARATOR;
                    }
                    sb.append(str);
                    sb.append("<");
                    if (argName2 != null) {
                        argName = option.getArgName();
                    } else {
                        argName = getArgName();
                    }
                    sb.append(argName);
                    sb.append(">");
                }
            }
            arrayList.add(sb);
            i5 = Math.max(sb.length() + i4, i5);
        }
        int i6 = i3 + i5;
        if (this.f73058c) {
            StringBuilder sb2 = new StringBuilder("Options");
            sb2.append(createPadding(((i5 - i4) - 7) + i2));
            sb2.append("Since");
            sb2.append(createPadding(i5 - sb2.length()));
            sb2.append(createPadding);
            sb2.append("Description");
            m25910f(appendable, i, i6, sb2.toString());
            appendable.append(getNewLine());
        }
        Iterator<Option> it = helpOptions.iterator();
        int i7 = 0;
        while (it.hasNext()) {
            Option next = it.next();
            int i8 = i7 + 1;
            StringBuilder sb3 = new StringBuilder(((StringBuilder) arrayList.get(i7)).toString());
            if (sb3.length() < i5) {
                sb3.append(createPadding((i5 - i4) - sb3.length()));
                if (this.f73058c) {
                    sb3.append(createPadding);
                    if (next.getSince() == null) {
                        since = DEFAULT_OPT_PREFIX;
                    } else {
                        since = next.getSince();
                    }
                    sb3.append(since);
                }
                sb3.append(createPadding(i5 - sb3.length()));
            }
            sb3.append(createPadding2);
            if (this.f73056a != null && next.isDeprecated()) {
                apply = this.f73056a.apply(next);
                sb3.append(((String) apply).trim());
            } else if (next.getDescription() != null) {
                sb3.append(next.getDescription());
            }
            m25910f(appendable, i, i6, sb3.toString());
            if (it.hasNext()) {
                appendable.append(getNewLine());
            }
            i7 = i8;
        }
        return appendable;
    }

    /* renamed from: f */
    public Appendable m25910f(Appendable appendable, int i, int i2, String str) {
        int findWrapPos = findWrapPos(str, i, 0);
        if (findWrapPos == -1) {
            appendable.append(rtrim(str));
            return appendable;
        }
        appendable.append(rtrim(str.substring(0, findWrapPos))).append(getNewLine());
        if (i2 >= i) {
            i2 = 1;
        }
        String createPadding = createPadding(i2);
        while (true) {
            str = createPadding + str.substring(findWrapPos).trim();
            findWrapPos = findWrapPos(str, i, 0);
            if (findWrapPos == -1) {
                appendable.append(str);
                return appendable;
            }
            if (str.length() > i && findWrapPos == i2 - 1) {
                findWrapPos = i;
            }
            appendable.append(rtrim(str.substring(0, findWrapPos))).append(getNewLine());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x003a, code lost:
        return r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int findWrapPos(java.lang.String r6, int r7, int r8) {
        /*
            r5 = this;
            r0 = 10
            int r1 = r6.indexOf(r0, r8)
            r2 = -1
            if (r1 == r2) goto Le
            if (r1 > r7) goto Le
            int r1 = r1 + 1
            return r1
        Le:
            r1 = 9
            int r1 = r6.indexOf(r1, r8)
            if (r1 == r2) goto L1b
            if (r1 > r7) goto L1b
            int r1 = r1 + 1
            return r1
        L1b:
            int r7 = r7 + r8
            int r1 = r6.length()
            if (r7 < r1) goto L23
            return r2
        L23:
            r1 = r7
        L24:
            if (r1 < r8) goto L38
            char r3 = r6.charAt(r1)
            r4 = 32
            if (r3 == r4) goto L38
            if (r3 == r0) goto L38
            r4 = 13
            if (r3 != r4) goto L35
            goto L38
        L35:
            int r1 = r1 + (-1)
            goto L24
        L38:
            if (r1 <= r8) goto L3b
            return r1
        L3b:
            int r6 = r6.length()
            if (r7 != r6) goto L42
            goto L43
        L42:
            r2 = r7
        L43:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.cli.HelpFormatter.findWrapPos(java.lang.String, int, int):int");
    }

    public String getArgName() {
        return this.defaultArgName;
    }

    public int getDescPadding() {
        return this.defaultDescPad;
    }

    public int getLeftPadding() {
        return this.defaultLeftPad;
    }

    public String getLongOptPrefix() {
        return this.defaultLongOptPrefix;
    }

    public String getLongOptSeparator() {
        return this.f73059d;
    }

    public String getNewLine() {
        return this.defaultNewLine;
    }

    public String getOptPrefix() {
        return this.defaultOptPrefix;
    }

    public Comparator<Option> getOptionComparator() {
        return this.optionComparator;
    }

    public String getSyntaxPrefix() {
        return this.defaultSyntaxPrefix;
    }

    public int getWidth() {
        return this.defaultWidth;
    }

    /* renamed from: h */
    public final int m25908h(Options options) {
        Stream stream;
        Stream map;
        Optional max;
        Object orElse;
        stream = options.getOptions().stream();
        map = stream.map(new Function() { // from class: P70
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return HelpFormatter.m25915a(r1, (Option) obj);
            }
        });
        max = map.max(new Comparator() { // from class: Q70
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return ((Integer) obj).compareTo((Integer) obj2);
            }
        });
        orElse = max.orElse(5);
        int intValue = ((Integer) orElse).intValue();
        if (intValue < 5) {
            return 5;
        }
        return intValue;
    }

    /* renamed from: j */
    public final Appendable m25906j(Appendable appendable, int i, int i2, String str) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new StringReader(str));
            boolean z = true;
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                if (!z) {
                    appendable.append(getNewLine());
                } else {
                    z = false;
                }
                m25910f(appendable, i, i2, readLine);
            }
        } catch (IOException unused) {
        }
        return appendable;
    }

    public void printHelp(int i, String str, String str2, Options options, String str3) {
        printHelp(i, str, str2, options, str3, false);
    }

    public void printOptions(PrintWriter printWriter, int i, Options options, int i2, int i3) {
        try {
            printWriter.println(m25911e(new StringBuilder(), i, options, i2, i3));
        } catch (IOException e) {
            throw O70.m67146a(e);
        }
    }

    public void printUsage(PrintWriter printWriter, int i, String str) {
        int length = getSyntaxPrefix().length() + str.indexOf(32) + 1;
        printWrapped(printWriter, i, length, getSyntaxPrefix() + str);
    }

    public void printWrapped(PrintWriter printWriter, int i, int i2, String str) {
        printWriter.println(m25906j(new StringBuilder(str.length()), i, i2, str));
    }

    public StringBuffer renderOptions(StringBuffer stringBuffer, int i, Options options, int i2, int i3) {
        try {
            return (StringBuffer) m25911e(stringBuffer, i, options, i2, i3);
        } catch (IOException e) {
            throw O70.m67146a(e);
        }
    }

    public StringBuffer renderWrappedText(StringBuffer stringBuffer, int i, int i2, String str) {
        try {
            return (StringBuffer) m25910f(stringBuffer, i, i2, str);
        } catch (IOException e) {
            throw O70.m67146a(e);
        }
    }

    public String rtrim(String str) {
        if (A12.m69336a(str)) {
            return str;
        }
        int length = str.length();
        while (length > 0 && Character.isWhitespace(str.charAt(length - 1))) {
            length--;
        }
        return str.substring(0, length);
    }

    public void setArgName(String str) {
        this.defaultArgName = str;
    }

    public void setDescPadding(int i) {
        this.defaultDescPad = i;
    }

    public void setLeftPadding(int i) {
        this.defaultLeftPad = i;
    }

    public void setLongOptPrefix(String str) {
        this.defaultLongOptPrefix = str;
    }

    public void setLongOptSeparator(String str) {
        this.f73059d = str;
    }

    public void setNewLine(String str) {
        this.defaultNewLine = str;
    }

    public void setOptPrefix(String str) {
        this.defaultOptPrefix = str;
    }

    public void setOptionComparator(Comparator<Option> comparator) {
        this.optionComparator = comparator;
    }

    public void setSyntaxPrefix(String str) {
        this.defaultSyntaxPrefix = str;
    }

    public void setWidth(int i) {
        this.defaultWidth = i;
    }

    public HelpFormatter() {
        this(null, m25909g(), false);
    }

    public void printHelp(int i, String str, String str2, Options options, String str3, boolean z) {
        PrintWriter printWriter = new PrintWriter(this.f73057b);
        printHelp(printWriter, i, str, str2, options, getLeftPadding(), getDescPadding(), str3, z);
        printWriter.flush();
    }

    public void printWrapped(PrintWriter printWriter, int i, String str) {
        printWrapped(printWriter, i, 0, str);
    }

    public HelpFormatter(Function function, PrintWriter printWriter, boolean z) {
        this.defaultWidth = 74;
        this.defaultLeftPad = 1;
        this.defaultDescPad = 3;
        this.defaultSyntaxPrefix = DEFAULT_SYNTAX_PREFIX;
        this.defaultNewLine = System.lineSeparator();
        this.defaultOptPrefix = DEFAULT_OPT_PREFIX;
        this.defaultLongOptPrefix = DEFAULT_LONG_OPT_PREFIX;
        this.defaultArgName = DEFAULT_ARG_NAME;
        this.optionComparator = new OptionComparator();
        this.f73059d = DEFAULT_LONG_OPT_SEPARATOR;
        this.f73056a = function;
        this.f73057b = printWriter;
        this.f73058c = z;
    }

    public void printUsage(PrintWriter printWriter, int i, String str, Options options) {
        StringBuilder sb = new StringBuilder(getSyntaxPrefix());
        sb.append(str);
        sb.append(TokenParser.f74644SP);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList(options.getOptions());
        if (getOptionComparator() != null) {
            Collections.sort(arrayList2, getOptionComparator());
        }
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            Option option = (Option) it.next();
            OptionGroup optionGroup = options.getOptionGroup(option);
            if (optionGroup != null) {
                if (!arrayList.contains(optionGroup)) {
                    arrayList.add(optionGroup);
                    m25912d(sb, optionGroup);
                }
            } else {
                m25913c(sb, option, option.isRequired());
            }
            if (it.hasNext()) {
                sb.append(TokenParser.f74644SP);
            }
        }
        printWrapped(printWriter, i, sb.toString().indexOf(32) + 1, sb.toString());
    }

    public void printHelp(PrintWriter printWriter, int i, String str, String str2, Options options, int i2, int i3, String str3) {
        printHelp(printWriter, i, str, str2, options, i2, i3, str3, false);
    }

    public void printHelp(PrintWriter printWriter, int i, String str, String str2, Options options, int i2, int i3, String str3, boolean z) {
        if (!A12.m69336a(str)) {
            if (z) {
                printUsage(printWriter, i, str, options);
            } else {
                printUsage(printWriter, i, str);
            }
            if (str2 != null && !str2.isEmpty()) {
                printWrapped(printWriter, i, str2);
            }
            printOptions(printWriter, i, options, i2, i3);
            if (str3 == null || str3.isEmpty()) {
                return;
            }
            printWrapped(printWriter, i, str3);
            return;
        }
        throw new IllegalArgumentException("cmdLineSyntax not provided");
    }

    public void printHelp(String str, Options options) {
        printHelp(getWidth(), str, null, options, null, false);
    }

    public void printHelp(String str, Options options, boolean z) {
        printHelp(getWidth(), str, null, options, null, z);
    }

    public void printHelp(String str, String str2, Options options, String str3) {
        printHelp(str, str2, options, str3, false);
    }

    public void printHelp(String str, String str2, Options options, String str3, boolean z) {
        printHelp(getWidth(), str, str2, options, str3, z);
    }
}