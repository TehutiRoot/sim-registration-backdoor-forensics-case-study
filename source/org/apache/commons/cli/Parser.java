package org.apache.commons.cli;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.ListIterator;
import java.util.Properties;

@Deprecated
/* loaded from: classes6.dex */
public abstract class Parser implements CommandLineParser {

    /* renamed from: a */
    public Options f73002a;

    /* renamed from: b */
    public List f73003b;
    protected CommandLine cmd;

    /* renamed from: a */
    private void m25698a(Option option) {
        if (option.isRequired()) {
            getRequiredOptions().remove(option.getKey());
        }
        if (getOptions().getOptionGroup(option) != null) {
            OptionGroup optionGroup = getOptions().getOptionGroup(option);
            if (optionGroup.isRequired()) {
                getRequiredOptions().remove(optionGroup);
            }
            optionGroup.setSelected(option);
        }
    }

    public void checkRequiredOptions() throws MissingOptionException {
        if (getRequiredOptions().isEmpty()) {
            return;
        }
        throw new MissingOptionException(getRequiredOptions());
    }

    public abstract String[] flatten(Options options, String[] strArr, boolean z) throws ParseException;

    public Options getOptions() {
        return this.f73002a;
    }

    public List getRequiredOptions() {
        return this.f73003b;
    }

    @Override // org.apache.commons.cli.CommandLineParser
    public CommandLine parse(Options options, String[] strArr) throws ParseException {
        return parse(options, strArr, null, false);
    }

    public void processArgs(Option option, ListIterator<String> listIterator) throws ParseException {
        while (true) {
            if (!listIterator.hasNext()) {
                break;
            }
            String next = listIterator.next();
            if (getOptions().hasOption(next) && next.startsWith(HelpFormatter.DEFAULT_OPT_PREFIX)) {
                listIterator.previous();
                break;
            } else {
                try {
                    option.processValue(D02.m68706c(next));
                } catch (RuntimeException unused) {
                    listIterator.previous();
                }
            }
        }
        if (option.getValues() == null && !option.hasOptionalArg()) {
            throw new MissingArgumentException(option);
        }
    }

    public void processOption(String str, ListIterator<String> listIterator) throws ParseException {
        if (getOptions().hasOption(str)) {
            Option option = (Option) getOptions().getOption(str).clone();
            m25698a(option);
            if (option.hasArg()) {
                processArgs(option, listIterator);
            }
            this.cmd.addOption(option);
            return;
        }
        throw new UnrecognizedOptionException("Unrecognized option: " + str, str);
    }

    public void processProperties(Properties properties) throws ParseException {
        boolean z;
        if (properties == null) {
            return;
        }
        Enumeration<?> propertyNames = properties.propertyNames();
        while (propertyNames.hasMoreElements()) {
            String obj = propertyNames.nextElement().toString();
            Option option = this.f73002a.getOption(obj);
            if (option != null) {
                OptionGroup optionGroup = this.f73002a.getOptionGroup(option);
                if (optionGroup != null && optionGroup.isSelected()) {
                    z = true;
                } else {
                    z = false;
                }
                if (!this.cmd.hasOption(obj) && !z) {
                    String property = properties.getProperty(obj);
                    if (option.hasArg()) {
                        if (D02.m68707b(option.getValues())) {
                            try {
                                option.processValue(property);
                            } catch (RuntimeException unused) {
                            }
                        }
                    } else if (!"yes".equalsIgnoreCase(property) && !"true".equalsIgnoreCase(property) && !"1".equalsIgnoreCase(property)) {
                    }
                    this.cmd.addOption(option);
                    m25698a(option);
                }
            } else {
                throw new UnrecognizedOptionException("Default option wasn't defined", obj);
            }
        }
    }

    public void setOptions(Options options) {
        this.f73002a = options;
        this.f73003b = new ArrayList(options.getRequiredOptions());
    }

    @Override // org.apache.commons.cli.CommandLineParser
    public CommandLine parse(Options options, String[] strArr, boolean z) throws ParseException {
        return parse(options, strArr, null, z);
    }

    public CommandLine parse(Options options, String[] strArr, Properties properties) throws ParseException {
        return parse(options, strArr, properties, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x009e, code lost:
        if (r9 != false) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00a3 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0053 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public org.apache.commons.cli.CommandLine parse(org.apache.commons.cli.Options r6, java.lang.String[] r7, java.util.Properties r8, boolean r9) throws org.apache.commons.cli.ParseException {
        /*
            r5 = this;
            java.util.List r0 = r6.helpOptions()
            java.util.Iterator r0 = r0.iterator()
        L8:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L18
            java.lang.Object r1 = r0.next()
            org.apache.commons.cli.Option r1 = (org.apache.commons.cli.Option) r1
            r1.clearValues()
            goto L8
        L18:
            java.util.Collection r0 = r6.getOptionGroups()
            java.util.Iterator r0 = r0.iterator()
        L20:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L31
            java.lang.Object r1 = r0.next()
            org.apache.commons.cli.OptionGroup r1 = (org.apache.commons.cli.OptionGroup) r1
            r2 = 0
            r1.setSelected(r2)
            goto L20
        L31:
            r5.setOptions(r6)
            org.apache.commons.cli.CommandLine$Builder r6 = org.apache.commons.cli.CommandLine.builder()
            org.apache.commons.cli.CommandLine r6 = r6.build()
            r5.cmd = r6
            org.apache.commons.cli.Options r6 = r5.getOptions()
            r0 = 0
            if (r7 != 0) goto L47
            java.lang.String[] r7 = new java.lang.String[r0]
        L47:
            java.lang.String[] r6 = r5.flatten(r6, r7, r9)
            java.util.List r6 = java.util.Arrays.asList(r6)
            java.util.ListIterator r6 = r6.listIterator()
        L53:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto Lbb
            java.lang.Object r7 = r6.next()
            java.lang.String r7 = (java.lang.String) r7
            if (r7 == 0) goto L53
            java.lang.String r1 = "--"
            boolean r2 = r1.equals(r7)
            r3 = 1
            if (r2 == 0) goto L6c
        L6a:
            r0 = 1
            goto La1
        L6c:
            java.lang.String r2 = "-"
            boolean r4 = r2.equals(r7)
            if (r4 == 0) goto L7d
            if (r9 == 0) goto L77
            goto L6a
        L77:
            org.apache.commons.cli.CommandLine r2 = r5.cmd
            r2.addArg(r7)
            goto La1
        L7d:
            boolean r2 = r7.startsWith(r2)
            if (r2 == 0) goto L99
            if (r9 == 0) goto L95
            org.apache.commons.cli.Options r2 = r5.getOptions()
            boolean r2 = r2.hasOption(r7)
            if (r2 != 0) goto L95
            org.apache.commons.cli.CommandLine r0 = r5.cmd
            r0.addArg(r7)
            goto L6a
        L95:
            r5.processOption(r7, r6)
            goto La1
        L99:
            org.apache.commons.cli.CommandLine r2 = r5.cmd
            r2.addArg(r7)
            if (r9 == 0) goto La1
            goto L6a
        La1:
            if (r0 == 0) goto L53
        La3:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L53
            java.lang.Object r7 = r6.next()
            java.lang.String r7 = (java.lang.String) r7
            boolean r2 = r1.equals(r7)
            if (r2 != 0) goto La3
            org.apache.commons.cli.CommandLine r2 = r5.cmd
            r2.addArg(r7)
            goto La3
        Lbb:
            r5.processProperties(r8)
            r5.checkRequiredOptions()
            org.apache.commons.cli.CommandLine r6 = r5.cmd
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.cli.Parser.parse(org.apache.commons.cli.Options, java.lang.String[], java.util.Properties, boolean):org.apache.commons.cli.CommandLine");
    }
}
