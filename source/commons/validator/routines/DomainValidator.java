package commons.validator.routines;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.app.NotificationCompat;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tom_roush.fontbox.ttf.PostScriptTable;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.PDPrintFieldAttributeObject;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Locale;
import th.p047co.dtac.android.dtacone.configuration.ThreadingModule;
import th.p047co.dtac.android.dtacone.util.Constant;
import th.p047co.dtac.android.dtacone.util.constant.LanguageSupport;

/* loaded from: classes5.dex */
public class DomainValidator implements Serializable {
    private static final String DOMAIN_LABEL_REGEX = "\\p{Alnum}(?>[\\p{Alnum}-]{0,61}\\p{Alnum})?";
    private static final String DOMAIN_NAME_REGEX = "^(?:\\p{Alnum}(?>[\\p{Alnum}-]{0,61}\\p{Alnum})?\\.)+(\\p{Alpha}(?>[\\p{Alnum}-]{0,61}\\p{Alnum})?)\\.?$";
    private static final String TOP_LABEL_REGEX = "\\p{Alpha}(?>[\\p{Alnum}-]{0,61}\\p{Alnum})?";
    private static final long serialVersionUID = -4407125112880174009L;
    private final boolean allowLocal;
    private final RegexValidator domainRegex = new RegexValidator(DOMAIN_NAME_REGEX);
    private final RegexValidator hostnameRegex = new RegexValidator(DOMAIN_LABEL_REGEX);
    private static final DomainValidator DOMAIN_VALIDATOR = new DomainValidator(false);
    private static final DomainValidator DOMAIN_VALIDATOR_WITH_LOCAL = new DomainValidator(true);
    private static final String[] INFRASTRUCTURE_TLDS = {"arpa"};
    private static final String[] GENERIC_TLDS = {"abogado", "academy", "accountants", AppMeasurementSdk.ConditionalUserProperty.ACTIVE, "actor", "adult", "aero", "agency", "airforce", "allfinanz", "alsace", "amsterdam", "android", "aquarelle", "archi", "army", "arpa", "asia", "associates", "attorney", "auction", "audio", "autos", "axa", "band", "bar", "bargains", "bayern", "beer", "berlin", "best", "bid", "bike", "bio", "biz", "black", "blackfriday", "bloomberg", "blue", "bmw", "bnpparibas", "boo", "boutique", "brussels", "budapest", JsonPOJOBuilder.DEFAULT_BUILD_METHOD, "builders", "business", "buzz", "bzh", "cab", "cal", "camera", "camp", "cancerresearch", "capetown", "capital", "caravan", "cards", "care", "career", "careers", "cartier", "casa", "cash", "cat", "catering", Constant.VIEW_CENTER, "ceo", "cern", "channel", "cheap", "christmas", "chrome", "church", "citic", "city", "claims", "cleaning", "click", "clinic", "clothing", "club", "coach", "codes", "coffee", "college", "cologne", "com", "community", "company", "computer", "condos", "construction", "consulting", "contractors", "cooking", "cool", "coop", "country", "credit", "creditcard", "cricket", "crs", "cruises", "cuisinella", "cymru", "dad", "dance", "dating", "day", "deals", "degree", "delivery", "democrat", "dental", "dentist", "desi", Constant.FLAVOR_DEVELOPMENT, "diamonds", "diet", "digital", "direct", "directory", FirebaseAnalytics.Param.DISCOUNT, "dnp", "docs", "domains", "doosan", "durban", "dvag", "eat", "edu", "education", "email", "emerck", "energy", "engineer", "engineering", "enterprises", "equipment", "esq", "estate", "eurovision", "eus", "events", "everbank", "exchange", "expert", "exposed", "fail", "farm", "fashion", "feedback", "finance", "financial", "firmdale", "fish", "fishing", "fitness", "flights", "florist", "flowers", "flsmidth", "fly", "foo", "forsale", "foundation", "frl", "frogans", "fund", "furniture", "futbol", "gal", "gallery", "garden", "gbiz", "gent", "ggee", "gift", "gifts", "gives", "glass", "gle", "global", "globo", "gmail", "gmo", "gmx", "google", "gop", "gov", "graphics", "gratis", "green", "gripe", "guide", "guitars", "guru", "hamburg", "haus", "healthcare", "help", "here", "hiphop", "hiv", "holdings", "holiday", "homes", "horse", "host", "hosting", "house", "how", "ibm", "immo", "immobilien", "industries", "info", "ing", "ink", "institute", "insure", "int", "international", "investments", "irish", "iwc", "jetzt", "jobs", "joburg", "juegos", "kaufen", "kim", "kitchen", "kiwi", "koeln", "krd", "kred", "lacaixa", "land", "latrobe", "lawyer", "lds", "lease", "legal", "lgbt", "lidl", "life", "lighting", "limited", "limo", "link", "loans", "london", "lotto", "ltda", "luxe", "luxury", "madrid", "maison", "management", "mango", "market", "marketing", "media", "meet", "melbourne", "meme", "memorial", "menu", "miami", "mil", "mini", "mobi", "moda", "moe", "monash", "money", "mormon", "mortgage", "moscow", "motorcycles", "mov", "museum", "nagoya", "name", "navy", "net", "network", "neustar", "new", "nexus", "ngo", "nhk", "ninja", "nra", "nrw", "nyc", "okinawa", "ong", "onl", "ooo", "org", "organic", "osaka", "otsuka", "ovh", "paris", "partners", "parts", "party", "pharmacy", "photo", "photography", "photos", "physio", "pics", "pictures", "pink", "pizza", "place", "plumbing", "pohl", "poker", "porn", PostScriptTable.TAG, "praxi", "press", "pro", "prod", "productions", "prof", "properties", "property", "pub", "qpon", "quebec", "realtor", "recipes", "red", "rehab", "reise", "reisen", "reit", "ren", "rentals", "repair", "report", "republican", "rest", "restaurant", "reviews", "rich", "rio", "rip", "rocks", "rodeo", "rsvp", "ruhr", "ryukyu", "saarland", "sale", "samsung", "sarl", "sca", "scb", "schmidt", "schule", "schwarz", "science", "scot", "services", "sew", "sexy", "shiksha", "shoes", "shriram", "singles", "sky", NotificationCompat.CATEGORY_SOCIAL, "software", "sohu", "solar", "solutions", "soy", "space", "spiegel", "supplies", "supply", "support", "surf", "surgery", "suzuki", "sydney", "systems", "taipei", "tatar", "tattoo", FirebaseAnalytics.Param.TAX, "technology", "tel", "tienda", "tips", "tires", "tirol", "today", "tokyo", "tools", "top", "town", "toys", "trade", "training", "travel", "trust", "tui", "university", "uno", "uol", "vacations", "vegas", "ventures", "versicherung", "vet", "viajes", "video", "villas", "vision", "vlaanderen", "vodka", "vote", "voting", "voto", "voyage", "wales", "wang", "watch", "webcam", "website", "wed", "wedding", "whoswho", "wien", "wiki", "williamhill", "wme", "work", "works", "world", "wtc", "wtf", "xn--1qqw23a", "xn--3bst00m", "xn--3ds443g", "xn--45q11c", "xn--4gbrim", "xn--55qw42g", "xn--55qx5d", "xn--6frz82g", "xn--6qq986b3xl", "xn--80adxhks", "xn--80asehdb", "xn--80aswg", "xn--c1avg", "xn--cg4bki", "xn--czr694b", "xn--czrs0t", "xn--czru2d", "xn--d1acj3b", "xn--fiq228c5hs", "xn--fiq64b", "xn--flw351e", "xn--hxt814e", "xn--i1b6b1a6a2e", "xn--io0a7i", "xn--kput3i", "xn--mgbab2bd", "xn--ngbc5azd", "xn--nqv7f", "xn--nqv7fs00ema", "xn--p1acf", "xn--q9jyb4c", "xn--qcka1pmc", "xn--rhqv96g", "xn--ses554g", "xn--unup4y", "xn--vermgensberater-ctb", "xn--vermgensberatung-pwb", "xn--vhquv", "xn--xhq521b", "xn--zfr164b", "xxx", "xyz", "yachts", "yandex", "yoga", "yokohama", "youtube", "zip", "zone", "zuerich"};
    private static final String[] COUNTRY_CODE_TLDS = {"ac", "ad", "ae", "af", "ag", "ai", "al", "am", "an", "ao", "aq", "ar", "as", "at", "au", "aw", "ax", "az", "ba", "bb", "bd", "be", "bf", "bg", "bh", "bi", "bj", "bm", "bn", "bo", "br", "bs", "bt", "bv", "bw", "by", "bz", "ca", "cc", "cd", "cf", "cg", "ch", "ci", "ck", "cl", OperatorName.CONCAT, "cn", "co", "cr", "cu", "cv", "cw", "cx", "cy", "cz", "de", "dj", "dk", "dm", "do", "dz", "ec", "ee", "eg", "er", "es", "et", "eu", "fi", "fj", "fk", "fm", "fo", "fr", "ga", "gb", "gd", "ge", "gf", "gg", "gh", "gi", "gl", "gm", "gn", "gp", "gq", "gr", OperatorName.SET_GRAPHICS_STATE_PARAMS, "gt", "gu", "gw", "gy", "hk", "hm", "hn", "hr", "ht", "hu", "id", "ie", "il", "im", "in", ThreadingModule.IO_THREAD, "iq", "ir", "is", "it", "je", "jm", "jo", "jp", "ke", "kg", "kh", "ki", "km", "kn", "kp", "kr", "kw", "ky", "kz", "la", "lb", "lc", "li", "lk", "lr", "ls", "lt", "lu", "lv", "ly", "ma", "mc", "md", "me", "mg", "mh", "mk", "ml", "mm", "mn", "mo", "mp", "mq", "mr", "ms", "mt", "mu", "mv", "mw", "mx", "my", "mz", "na", "nc", "ne", "nf", "ng", "ni", "nl", "no", "np", "nr", "nu", "nz", "om", "pa", "pe", "pf", "pg", "ph", "pk", "pl", "pm", "pn", "pr", "ps", "pt", "pw", "py", "qa", OperatorName.APPEND_RECT, "ro", "rs", "ru", "rw", "sa", "sb", OperatorName.NON_STROKING_COLOR, "sd", "se", "sg", OperatorName.SHADING_FILL, "si", "sj", "sk", "sl", "sm", "sn", "so", "sr", "st", "su", "sv", "sx", "sy", "sz", "tc", "td", "tf", "tg", LanguageSupport.LANG_TH, "tj", "tk", "tl", "tm", "tn", TypedValues.TransitionType.S_TO, "tp", "tr", "tt", PDPrintFieldAttributeObject.ROLE_TV, "tw", "tz", "ua", "ug", "uk", "us", "uy", "uz", "va", "vc", "ve", "vg", "vi", "vn", "vu", "wf", "ws", "xn--3e0b707e", "xn--45brj9c", "xn--80ao21a", "xn--90a3ac", "xn--clchc0ea0b2g2a9gcd", "xn--d1alf", "xn--fiqs8s", "xn--fiqz9s", "xn--fpcrj9c3d", "xn--fzc2c9e2c", "xn--gecrj9c", "xn--h2brj9c", "xn--j1amh", "xn--j6w193g", "xn--kprw13d", "xn--kpry57d", "xn--l1acc", "xn--lgbbat1ad8j", "xn--mgb9awbf", "xn--mgba3a4f16a", "xn--mgbaam7a8h", "xn--mgbayh7gpa", "xn--mgbbh1a71e", "xn--mgbc0a9azcg", "xn--mgberp4a5d4ar", "xn--mgbx4cd0ab", "xn--node", "xn--o3cw4h", "xn--ogbpf8fl", "xn--p1ai", "xn--pgbs0dh", "xn--s9brj9c", "xn--wgbh1c", "xn--wgbl6a", "xn--xkc2al3hye2a", "xn--xkc2dl3a5ee0h", "xn--yfro4i67o", "xn--ygbi2ammx", "ye", "yt", "za", "zm", "zw"};
    private static final String[] LOCAL_TLDS = {"localdomain", "localhost"};

    /* renamed from: commons.validator.routines.DomainValidator$a */
    /* loaded from: classes5.dex */
    public static class C10025a {

        /* renamed from: a */
        public static final Method f60978a = m31965b();

        /* renamed from: b */
        public static Method m31965b() {
            try {
                return Class.forName("java.net.IDN", false, DomainValidator.class.getClassLoader()).getDeclaredMethod("toASCII", String.class);
            } catch (Exception unused) {
                return null;
            }
        }
    }

    private DomainValidator(boolean z) {
        this.allowLocal = z;
    }

    private String chompLeadingDot(String str) {
        if (str.startsWith(".")) {
            return str.substring(1);
        }
        return str;
    }

    public static DomainValidator getInstance() {
        return DOMAIN_VALIDATOR;
    }

    private static boolean isOnlyASCII(String str) {
        if (str == null) {
            return true;
        }
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) > 127) {
                return false;
            }
        }
        return true;
    }

    private static final String toASCII(String str) throws IllegalArgumentException {
        if (!isOnlyASCII(str)) {
            Method method = C10025a.f60978a;
            if (method == null) {
                return str;
            }
            try {
                return (String) method.invoke(null, str.toLowerCase(Locale.ENGLISH));
            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            } catch (InvocationTargetException e2) {
                Throwable cause = e2.getCause();
                if (cause instanceof IllegalArgumentException) {
                    throw ((IllegalArgumentException) cause);
                }
                throw new RuntimeException(e2);
            }
        }
        return str;
    }

    public static String unicodeToASCII(String str) {
        try {
            return toASCII(str);
        } catch (IllegalArgumentException unused) {
            return str;
        }
    }

    public boolean isValid(String str) {
        if (str == null) {
            return false;
        }
        String unicodeToASCII = unicodeToASCII(str);
        if (unicodeToASCII.length() > 253) {
            return false;
        }
        String[] match = this.domainRegex.match(unicodeToASCII);
        if (match != null && match.length > 0) {
            return isValidTld(match[0]);
        }
        if (!this.allowLocal || !this.hostnameRegex.isValid(unicodeToASCII)) {
            return false;
        }
        return true;
    }

    public boolean isValidCountryCodeTld(String str) {
        if (Arrays.binarySearch(COUNTRY_CODE_TLDS, chompLeadingDot(unicodeToASCII(str).toLowerCase(Locale.ENGLISH))) >= 0) {
            return true;
        }
        return false;
    }

    public final boolean isValidDomainSyntax(String str) {
        if (str == null) {
            return false;
        }
        String unicodeToASCII = unicodeToASCII(str);
        if (unicodeToASCII.length() > 253) {
            return false;
        }
        String[] match = this.domainRegex.match(unicodeToASCII);
        if ((match == null || match.length <= 0) && !this.hostnameRegex.isValid(unicodeToASCII)) {
            return false;
        }
        return true;
    }

    public boolean isValidGenericTld(String str) {
        if (Arrays.binarySearch(GENERIC_TLDS, chompLeadingDot(unicodeToASCII(str).toLowerCase(Locale.ENGLISH))) >= 0) {
            return true;
        }
        return false;
    }

    public boolean isValidInfrastructureTld(String str) {
        if (Arrays.binarySearch(INFRASTRUCTURE_TLDS, chompLeadingDot(unicodeToASCII(str).toLowerCase(Locale.ENGLISH))) >= 0) {
            return true;
        }
        return false;
    }

    public boolean isValidLocalTld(String str) {
        if (Arrays.binarySearch(LOCAL_TLDS, chompLeadingDot(unicodeToASCII(str).toLowerCase(Locale.ENGLISH))) >= 0) {
            return true;
        }
        return false;
    }

    public boolean isValidTld(String str) {
        String unicodeToASCII = unicodeToASCII(str);
        if ((this.allowLocal && isValidLocalTld(unicodeToASCII)) || isValidInfrastructureTld(unicodeToASCII) || isValidGenericTld(unicodeToASCII) || isValidCountryCodeTld(unicodeToASCII)) {
            return true;
        }
        return false;
    }

    public static DomainValidator getInstance(boolean z) {
        if (z) {
            return DOMAIN_VALIDATOR_WITH_LOCAL;
        }
        return DOMAIN_VALIDATOR;
    }
}
