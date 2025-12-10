package org.apache.commons.cli;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import org.apache.commons.cli.OptionGroup;
import org.apache.commons.cli.Options;

/* loaded from: classes6.dex */
public class Options implements Serializable {
    private static final long serialVersionUID = 1;
    private final Map<String, Option> shortOpts = new LinkedHashMap();
    private final Map<String, Option> longOpts = new LinkedHashMap();
    private final List<Object> requiredOpts = new ArrayList();
    private final Map<String, OptionGroup> optionGroups = new LinkedHashMap();

    public Options addOption(Option option) {
        String key = option.getKey();
        if (option.hasLongOpt()) {
            this.longOpts.put(option.getLongOpt(), option);
        }
        if (option.isRequired()) {
            if (this.requiredOpts.contains(key)) {
                List<Object> list = this.requiredOpts;
                list.remove(list.indexOf(key));
            }
            this.requiredOpts.add(key);
        }
        this.shortOpts.put(key, option);
        return this;
    }

    public Options addOptionGroup(OptionGroup optionGroup) {
        if (optionGroup.isRequired()) {
            this.requiredOpts.add(optionGroup);
        }
        for (Option option : optionGroup.getOptions()) {
            option.setRequired(false);
            addOption(option);
            this.optionGroups.put(option.getKey(), optionGroup);
        }
        return this;
    }

    public Options addOptions(Options options) {
        for (Option option : options.getOptions()) {
            if (!hasOption(option.getKey())) {
                addOption(option);
            } else {
                throw new IllegalArgumentException("Duplicate key: " + option.getKey());
            }
        }
        options.getOptionGroups().forEach(new Consumer() { // from class: ig1
            {
                Options.this = this;
            }

            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                Options.this.addOptionGroup((OptionGroup) obj);
            }
        });
        return this;
    }

    public Options addRequiredOption(String str, String str2, boolean z, String str3) {
        Option option = new Option(str, str2, z, str3);
        option.setRequired(true);
        addOption(option);
        return this;
    }

    public List<String> getMatchingOptions(String str) {
        String m68705d = D02.m68705d(str);
        ArrayList arrayList = new ArrayList();
        if (this.longOpts.containsKey(m68705d)) {
            return Collections.singletonList(m68705d);
        }
        for (String str2 : this.longOpts.keySet()) {
            if (str2.startsWith(m68705d)) {
                arrayList.add(str2);
            }
        }
        return arrayList;
    }

    public Option getOption(String str) {
        String m68705d = D02.m68705d(str);
        Option option = this.shortOpts.get(m68705d);
        if (option == null) {
            return this.longOpts.get(m68705d);
        }
        return option;
    }

    public OptionGroup getOptionGroup(Option option) {
        return this.optionGroups.get(option.getKey());
    }

    public Collection<OptionGroup> getOptionGroups() {
        return new HashSet(this.optionGroups.values());
    }

    public Collection<Option> getOptions() {
        return Collections.unmodifiableCollection(helpOptions());
    }

    public List<?> getRequiredOptions() {
        return Collections.unmodifiableList(this.requiredOpts);
    }

    public boolean hasLongOption(String str) {
        return this.longOpts.containsKey(D02.m68705d(str));
    }

    public boolean hasOption(String str) {
        String m68705d = D02.m68705d(str);
        if (!this.shortOpts.containsKey(m68705d) && !this.longOpts.containsKey(m68705d)) {
            return false;
        }
        return true;
    }

    public boolean hasShortOption(String str) {
        return this.shortOpts.containsKey(D02.m68705d(str));
    }

    public List<Option> helpOptions() {
        return new ArrayList(this.shortOpts.values());
    }

    public String toString() {
        return "[ Options: [ short " + this.shortOpts.toString() + " ] [ long " + this.longOpts + " ]";
    }

    public Options addOption(String str, boolean z, String str2) {
        addOption(str, null, z, str2);
        return this;
    }

    public Options addOption(String str, String str2) {
        addOption(str, null, false, str2);
        return this;
    }

    public Options addOption(String str, String str2, boolean z, String str3) {
        addOption(new Option(str, str2, z, str3));
        return this;
    }
}
