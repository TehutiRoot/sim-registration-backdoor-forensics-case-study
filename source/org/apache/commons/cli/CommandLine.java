package org.apache.commons.cli;

import java.io.PrintStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.Properties;
import java.util.function.Consumer;
import java.util.function.Supplier;
import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.Option;

/* loaded from: classes6.dex */
public class CommandLine implements Serializable {
    private static final long serialVersionUID = 1;
    private final List<String> args;
    private final transient Consumer<Option> deprecatedHandler;
    private final List<Option> options;

    /* loaded from: classes6.dex */
    public static final class Builder {

        /* renamed from: d */
        public static final Consumer f72955d = new Consumer() { // from class: du
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                CommandLine.Builder.m25748b((Option) obj);
            }
        };

        /* renamed from: a */
        public final List f72956a = new LinkedList();

        /* renamed from: b */
        public final List f72957b = new ArrayList();

        /* renamed from: c */
        public Consumer f72958c = f72955d;

        /* renamed from: b */
        public static /* synthetic */ void m25748b(Option option) {
            System.out.println(option.toDeprecatedString());
        }

        public Builder addArg(String str) {
            if (str != null) {
                this.f72956a.add(str);
            }
            return this;
        }

        public Builder addOption(Option option) {
            if (option != null) {
                this.f72957b.add(option);
            }
            return this;
        }

        public CommandLine build() {
            return new CommandLine(this.f72956a, this.f72957b, this.f72958c);
        }

        public Builder setDeprecatedHandler(Consumer<Option> consumer) {
            this.f72958c = consumer;
            return this;
        }
    }

    public static Builder builder() {
        return new Builder();
    }

    private <T> T get(Supplier<T> supplier) {
        Object obj;
        if (supplier != null) {
            obj = supplier.get();
            return (T) obj;
        }
        return null;
    }

    private void handleDeprecated(Option option) {
        Consumer<Option> consumer = this.deprecatedHandler;
        if (consumer != null) {
            consumer.accept(option);
        }
    }

    public static /* synthetic */ String lambda$getOptionValue$0(String str) {
        return str;
    }

    public static /* synthetic */ String lambda$getOptionValue$1(String str) {
        return str;
    }

    public static /* synthetic */ String lambda$getOptionValue$2(String str) {
        return str;
    }

    public static /* synthetic */ String lambda$getOptionValue$3(String str) {
        return str;
    }

    public static /* synthetic */ Object lambda$getParsedOptionValue$4() {
        return null;
    }

    public static /* synthetic */ Object lambda$getParsedOptionValue$5(Object obj) {
        return obj;
    }

    public static /* synthetic */ Object lambda$getParsedOptionValue$6() {
        return null;
    }

    public static /* synthetic */ Object lambda$getParsedOptionValue$7(Object obj) {
        return obj;
    }

    private void processPropertiesFromValues(Properties properties, List<String> list) {
        for (int i = 0; i < list.size(); i += 2) {
            int i2 = i + 1;
            if (i2 < list.size()) {
                properties.put(list.get(i), list.get(i2));
            } else {
                properties.put(list.get(i), "true");
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0012  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private org.apache.commons.cli.Option resolveOption(java.lang.String r4) {
        /*
            r3 = this;
            java.lang.String r4 = p000.D02.m68705d(r4)
            if (r4 == 0) goto L2d
            java.util.List<org.apache.commons.cli.Option> r0 = r3.options
            java.util.Iterator r0 = r0.iterator()
        Lc:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L2d
            java.lang.Object r1 = r0.next()
            org.apache.commons.cli.Option r1 = (org.apache.commons.cli.Option) r1
            java.lang.String r2 = r1.getOpt()
            boolean r2 = r4.equals(r2)
            if (r2 != 0) goto L2c
            java.lang.String r2 = r1.getLongOpt()
            boolean r2 = r4.equals(r2)
            if (r2 == 0) goto Lc
        L2c:
            return r1
        L2d:
            r4 = 0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.cli.CommandLine.resolveOption(java.lang.String):org.apache.commons.cli.Option");
    }

    public void addArg(String str) {
        if (str != null) {
            this.args.add(str);
        }
    }

    public void addOption(Option option) {
        if (option != null) {
            this.options.add(option);
        }
    }

    public List<String> getArgList() {
        return this.args;
    }

    public String[] getArgs() {
        return (String[]) this.args.toArray(D02.f886a);
    }

    @Deprecated
    public Object getOptionObject(char c) {
        return getOptionObject(String.valueOf(c));
    }

    public Properties getOptionProperties(Option option) {
        Properties properties = new Properties();
        for (Option option2 : this.options) {
            if (option2.equals(option)) {
                processPropertiesFromValues(properties, option2.getValuesList());
            }
        }
        return properties;
    }

    public String getOptionValue(char c) {
        return getOptionValue(String.valueOf(c));
    }

    public String[] getOptionValues(char c) {
        return getOptionValues(String.valueOf(c));
    }

    public Option[] getOptions() {
        return (Option[]) this.options.toArray(Option.EMPTY_ARRAY);
    }

    public <T> T getParsedOptionValue(char c) throws ParseException {
        return (T) getParsedOptionValue(String.valueOf(c));
    }

    public boolean hasOption(char c) {
        return hasOption(String.valueOf(c));
    }

    public Iterator<Option> iterator() {
        return this.options.iterator();
    }

    public CommandLine() {
        this(new LinkedList(), new ArrayList(), Builder.f72955d);
    }

    @Deprecated
    public Object getOptionObject(String str) {
        try {
            return getParsedOptionValue(str);
        } catch (ParseException e) {
            PrintStream printStream = System.err;
            printStream.println("Exception found converting " + str + " to desired type: " + e.getMessage());
            return null;
        }
    }

    public String getOptionValue(char c, final String str) {
        return getOptionValue(String.valueOf(c), new Supplier() { // from class: Xt
            @Override // java.util.function.Supplier
            public final Object get() {
                String lambda$getOptionValue$0;
                lambda$getOptionValue$0 = CommandLine.lambda$getOptionValue$0(str);
                return lambda$getOptionValue$0;
            }
        });
    }

    public String[] getOptionValues(Option option) {
        if (option == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Option option2 : this.options) {
            if (option2.equals(option)) {
                if (option.isDeprecated()) {
                    handleDeprecated(option);
                }
                arrayList.addAll(option2.getValuesList());
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return (String[]) arrayList.toArray(D02.f886a);
    }

    public <T> T getParsedOptionValue(char c, Supplier<T> supplier) throws ParseException {
        return (T) getParsedOptionValue(String.valueOf(c), (Supplier<Object>) supplier);
    }

    public boolean hasOption(Option option) {
        boolean contains = this.options.contains(option);
        if (contains && option.isDeprecated()) {
            handleDeprecated(option);
        }
        return contains;
    }

    private CommandLine(List<String> list, List<Option> list2, Consumer<Option> consumer) {
        Objects.requireNonNull(list, "args");
        this.args = list;
        Objects.requireNonNull(list2, "options");
        this.options = list2;
        this.deprecatedHandler = consumer;
    }

    public String getOptionValue(char c, Supplier<String> supplier) {
        return getOptionValue(String.valueOf(c), supplier);
    }

    public <T> T getParsedOptionValue(char c, T t) throws ParseException {
        return (T) getParsedOptionValue(String.valueOf(c), (String) t);
    }

    public String getOptionValue(Option option) {
        String[] optionValues = getOptionValues(option);
        if (optionValues == null) {
            return null;
        }
        return optionValues[0];
    }

    public <T> T getParsedOptionValue(Option option) throws ParseException {
        return (T) getParsedOptionValue(option, (Supplier<Object>) new Supplier() { // from class: au
            @Override // java.util.function.Supplier
            public final Object get() {
                Object lambda$getParsedOptionValue$4;
                lambda$getParsedOptionValue$4 = CommandLine.lambda$getParsedOptionValue$4();
                return lambda$getParsedOptionValue$4;
            }
        });
    }

    public Properties getOptionProperties(String str) {
        Properties properties = new Properties();
        for (Option option : this.options) {
            if (str.equals(option.getOpt()) || str.equals(option.getLongOpt())) {
                processPropertiesFromValues(properties, option.getValuesList());
            }
        }
        return properties;
    }

    public <T> T getParsedOptionValue(Option option, Supplier<T> supplier) throws ParseException {
        if (option == null) {
            return (T) get(supplier);
        }
        String optionValue = getOptionValue(option);
        try {
            if (optionValue == null) {
                return (T) get(supplier);
            }
            return (T) option.getConverter().apply(optionValue);
        } catch (Throwable th2) {
            throw ParseException.wrap(th2);
        }
    }

    public boolean hasOption(OptionGroup optionGroup) {
        if (optionGroup == null || !optionGroup.isSelected()) {
            return false;
        }
        return hasOption(optionGroup.getSelected());
    }

    public String getOptionValue(Option option, final String str) {
        return getOptionValue(option, new Supplier() { // from class: Vt
            @Override // java.util.function.Supplier
            public final Object get() {
                String lambda$getOptionValue$1;
                lambda$getOptionValue$1 = CommandLine.lambda$getOptionValue$1(str);
                return lambda$getOptionValue$1;
            }
        });
    }

    public String getOptionValue(Option option, Supplier<String> supplier) {
        String optionValue = getOptionValue(option);
        return optionValue != null ? optionValue : (String) get(supplier);
    }

    public boolean hasOption(String str) {
        return hasOption(resolveOption(str));
    }

    public String getOptionValue(OptionGroup optionGroup) {
        String[] optionValues = getOptionValues(optionGroup);
        if (optionValues == null) {
            return null;
        }
        return optionValues[0];
    }

    public String[] getOptionValues(OptionGroup optionGroup) {
        if (optionGroup == null || !optionGroup.isSelected()) {
            return null;
        }
        return getOptionValues(optionGroup.getSelected());
    }

    public <T> T getParsedOptionValue(Option option, final T t) throws ParseException {
        return (T) getParsedOptionValue(option, (Supplier<Object>) new Supplier() { // from class: bu
            @Override // java.util.function.Supplier
            public final Object get() {
                Object lambda$getParsedOptionValue$5;
                lambda$getParsedOptionValue$5 = CommandLine.lambda$getParsedOptionValue$5(t);
                return lambda$getParsedOptionValue$5;
            }
        });
    }

    public String getOptionValue(OptionGroup optionGroup, final String str) {
        return getOptionValue(optionGroup, new Supplier() { // from class: Yt
            @Override // java.util.function.Supplier
            public final Object get() {
                String lambda$getOptionValue$2;
                lambda$getOptionValue$2 = CommandLine.lambda$getOptionValue$2(str);
                return lambda$getOptionValue$2;
            }
        });
    }

    public String[] getOptionValues(String str) {
        return getOptionValues(resolveOption(str));
    }

    public <T> T getParsedOptionValue(OptionGroup optionGroup) throws ParseException {
        return (T) getParsedOptionValue(optionGroup, (Supplier<Object>) new Supplier() { // from class: Wt
            @Override // java.util.function.Supplier
            public final Object get() {
                Object lambda$getParsedOptionValue$6;
                lambda$getParsedOptionValue$6 = CommandLine.lambda$getParsedOptionValue$6();
                return lambda$getParsedOptionValue$6;
            }
        });
    }

    public String getOptionValue(OptionGroup optionGroup, Supplier<String> supplier) {
        String optionValue = getOptionValue(optionGroup);
        return optionValue != null ? optionValue : (String) get(supplier);
    }

    public <T> T getParsedOptionValue(OptionGroup optionGroup, Supplier<T> supplier) throws ParseException {
        if (optionGroup != null && optionGroup.isSelected()) {
            return (T) getParsedOptionValue(optionGroup.getSelected(), (Supplier<Object>) supplier);
        }
        return (T) get(supplier);
    }

    public String getOptionValue(String str) {
        return getOptionValue(resolveOption(str));
    }

    public String getOptionValue(String str, final String str2) {
        return getOptionValue(resolveOption(str), new Supplier() { // from class: Zt
            @Override // java.util.function.Supplier
            public final Object get() {
                String lambda$getOptionValue$3;
                lambda$getOptionValue$3 = CommandLine.lambda$getOptionValue$3(str2);
                return lambda$getOptionValue$3;
            }
        });
    }

    public <T> T getParsedOptionValue(OptionGroup optionGroup, final T t) throws ParseException {
        return (T) getParsedOptionValue(optionGroup, (Supplier<Object>) new Supplier() { // from class: cu
            @Override // java.util.function.Supplier
            public final Object get() {
                Object lambda$getParsedOptionValue$7;
                lambda$getParsedOptionValue$7 = CommandLine.lambda$getParsedOptionValue$7(t);
                return lambda$getParsedOptionValue$7;
            }
        });
    }

    public String getOptionValue(String str, Supplier<String> supplier) {
        return getOptionValue(resolveOption(str), supplier);
    }

    public <T> T getParsedOptionValue(String str) throws ParseException {
        return (T) getParsedOptionValue(resolveOption(str));
    }

    public <T> T getParsedOptionValue(String str, Supplier<T> supplier) throws ParseException {
        return (T) getParsedOptionValue(resolveOption(str), (Supplier<Object>) supplier);
    }

    public <T> T getParsedOptionValue(String str, T t) throws ParseException {
        return (T) getParsedOptionValue(resolveOption(str), (Option) t);
    }
}
