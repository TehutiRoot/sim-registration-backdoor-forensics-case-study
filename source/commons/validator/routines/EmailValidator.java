package commons.validator.routines;

import java.io.Serializable;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes5.dex */
public class EmailValidator implements Serializable {
    private static final String QUOTED_USER = "(\"[^\"]*\")";
    private static final String SPECIAL_CHARS = "\\p{Cntrl}\\(\\)<>@,;:'\\\\\\\"\\.\\[\\]";
    private static final String VALID_CHARS = "[^\\s\\p{Cntrl}\\(\\)<>@,;:'\\\\\\\"\\.\\[\\]]";
    private static final String WORD = "(([^\\s\\p{Cntrl}\\(\\)<>@,;:'\\\\\\\"\\.\\[\\]]|')+|(\"[^\"]*\"))";
    private static final long serialVersionUID = 1705927040799295880L;
    private final boolean allowLocal;
    private static final String EMAIL_REGEX = "^\\s*?(.+)@(.+?)\\s*$";
    private static final Pattern EMAIL_PATTERN = Pattern.compile(EMAIL_REGEX);
    private static final String IP_DOMAIN_REGEX = "^\\[(.*)\\]$";
    private static final Pattern IP_DOMAIN_PATTERN = Pattern.compile(IP_DOMAIN_REGEX);
    private static final String USER_REGEX = "^\\s*(([^\\s\\p{Cntrl}\\(\\)<>@,;:'\\\\\\\"\\.\\[\\]]|')+|(\"[^\"]*\"))(\\.(([^\\s\\p{Cntrl}\\(\\)<>@,;:'\\\\\\\"\\.\\[\\]]|')+|(\"[^\"]*\")))*$";
    private static final Pattern USER_PATTERN = Pattern.compile(USER_REGEX);
    private static final EmailValidator EMAIL_VALIDATOR = new EmailValidator(false);
    private static final EmailValidator EMAIL_VALIDATOR_WITH_LOCAL = new EmailValidator(true);

    public EmailValidator(boolean z) {
        this.allowLocal = z;
    }

    public static EmailValidator getInstance() {
        return EMAIL_VALIDATOR;
    }

    public boolean isValid(String str) {
        if (str == null || str.endsWith(".")) {
            return false;
        }
        Matcher matcher = EMAIL_PATTERN.matcher(str);
        if (!matcher.matches() || !isValidUser(matcher.group(1)) || !isValidDomain(matcher.group(2))) {
            return false;
        }
        return true;
    }

    public boolean isValidDomain(String str) {
        Matcher matcher = IP_DOMAIN_PATTERN.matcher(str);
        if (matcher.matches()) {
            return InetAddressValidator.getInstance().isValid(matcher.group(1));
        }
        DomainValidator domainValidator = DomainValidator.getInstance(this.allowLocal);
        if (domainValidator.isValid(str) || domainValidator.isValidTld(str)) {
            return true;
        }
        return false;
    }

    public boolean isValidUser(String str) {
        return USER_PATTERN.matcher(str).matches();
    }

    public static EmailValidator getInstance(boolean z) {
        if (z) {
            return EMAIL_VALIDATOR_WITH_LOCAL;
        }
        return EMAIL_VALIDATOR;
    }
}
