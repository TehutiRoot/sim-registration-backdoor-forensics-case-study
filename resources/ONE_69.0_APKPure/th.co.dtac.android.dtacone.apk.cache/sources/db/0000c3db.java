package commons.validator.routines;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes5.dex */
public class InetAddressValidator implements Serializable {
    private static final String IPV4_REGEX = "^(\\d{1,3})\\.(\\d{1,3})\\.(\\d{1,3})\\.(\\d{1,3})$";
    private static final InetAddressValidator VALIDATOR = new InetAddressValidator();
    private static final long serialVersionUID = -919201640201914789L;
    private final RegexValidator ipv4Validator = new RegexValidator(IPV4_REGEX);

    public static InetAddressValidator getInstance() {
        return VALIDATOR;
    }

    public boolean isValid(String str) {
        if (!isValidInet4Address(str) && !isValidInet6Address(str)) {
            return false;
        }
        return true;
    }

    public boolean isValidInet4Address(String str) {
        String[] match = this.ipv4Validator.match(str);
        if (match == null) {
            return false;
        }
        for (int i = 0; i <= 3; i++) {
            String str2 = match[i];
            if (str2 != null && str2.length() != 0) {
                try {
                    if (Integer.parseInt(str2) > 255) {
                        return false;
                    }
                    if (str2.length() > 1 && str2.startsWith("0")) {
                        return false;
                    }
                } catch (NumberFormatException unused) {
                }
            }
            return false;
        }
        return true;
    }

    public boolean isValidInet6Address(String str) {
        boolean z;
        if (str.indexOf("::") > -1) {
            z = true;
        } else {
            z = false;
        }
        if (z && str.indexOf("::") != str.lastIndexOf("::")) {
            return false;
        }
        if ((str.startsWith(":") && !str.startsWith("::")) || (str.endsWith(":") && !str.endsWith("::"))) {
            return false;
        }
        Object[] split = str.split(":");
        if (z) {
            ArrayList arrayList = new ArrayList(Arrays.asList(split));
            if (str.endsWith("::")) {
                arrayList.add("");
            } else if (str.startsWith("::") && !arrayList.isEmpty()) {
                arrayList.remove(0);
            }
            split = arrayList.toArray();
        }
        if (split.length > 8) {
            return false;
        }
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < split.length; i3++) {
            String str2 = (String) split[i3];
            if (str2.length() == 0) {
                if (i2 + 1 > 1) {
                    return false;
                }
            } else if (str2.indexOf(".") > -1) {
                if (!str.endsWith(str2) || i3 > split.length - 1 || i3 > 6 || !isValidInet4Address(str2)) {
                    return false;
                }
                i += 2;
                i2 = 0;
            } else if (str2.length() > 4) {
                return false;
            } else {
                try {
                    int intValue = Integer.valueOf(str2, 16).intValue();
                    i2 = (intValue >= 0 && intValue <= 65535) ? 0 : 0;
                } catch (NumberFormatException unused) {
                }
                return false;
            }
            i++;
        }
        if (i >= 8 || z) {
            return true;
        }
        return false;
    }
}