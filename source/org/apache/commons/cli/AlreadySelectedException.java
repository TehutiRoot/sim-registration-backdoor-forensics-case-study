package org.apache.commons.cli;

/* loaded from: classes6.dex */
public class AlreadySelectedException extends ParseException {
    private static final long serialVersionUID = 3674381532418544760L;
    private final OptionGroup group;
    private final Option option;

    public AlreadySelectedException(OptionGroup optionGroup, Option option) {
        this(String.format("The option '%s' was specified but an option from this group has already been selected: '%s'", option.getKey(), optionGroup.getSelected()), optionGroup, option);
    }

    public Option getOption() {
        return this.option;
    }

    public OptionGroup getOptionGroup() {
        return this.group;
    }

    public AlreadySelectedException(String str) {
        this(str, null, null);
    }

    private AlreadySelectedException(String str, OptionGroup optionGroup, Option option) {
        super(str);
        this.group = optionGroup;
        this.option = option;
    }
}
