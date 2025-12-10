package co.omise.android.models;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.CoreConstants;
import com.google.zxing.client.result.ExpandedProductParsedResult;
import com.tom_roush.fontbox.afm.AFMParser;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.StandardStructureTypes;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.android.parcel.Parcelize;
import org.apache.commons.codec.language.p027bm.Rule;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.view.appOne.pre2post.repository.OnePre2PostRepository;

@Parcelize
@Metadata(m29143d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\t\u0010\f\u001a\u00020\rHÖ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\rHÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\rHÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u001a"}, m29142d2 = {"Lco/omise/android/models/CountryInfo;", "Landroid/os/Parcelable;", "name", "", "code", "(Ljava/lang/String;Ljava/lang/String;)V", "getCode", "()Ljava/lang/String;", "getName", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "sdk_productionRelease"}, m29141k = 1, m29140mv = {1, 7, 1}, m29138xi = 48)
/* loaded from: classes3.dex */
public final class CountryInfo implements Parcelable {
    @NotNull
    private final String code;
    @NotNull
    private final String name;
    @NotNull
    public static final Companion Companion = new Companion(null);
    @NotNull
    public static final Parcelable.Creator<CountryInfo> CREATOR = new Creator();
    @NotNull
    private static final List<CountryInfo> ALL = CollectionsKt__CollectionsKt.listOf((Object[]) new CountryInfo[]{new CountryInfo("Afghanistan", "AF"), new CountryInfo("Åland Islands", "AX"), new CountryInfo("Albania", OnePre2PostRepository.PRE2POST_COMPANY_CODE), new CountryInfo("Algeria", "DZ"), new CountryInfo("American Samoa", "AS"), new CountryInfo("Andorra", "AD"), new CountryInfo("Angola", "AO"), new CountryInfo("Anguilla", "AI"), new CountryInfo("Antarctica", "AQ"), new CountryInfo("Angola", "AO"), new CountryInfo("Antigua and Barbuda", "AG"), new CountryInfo("Argentina", "AR"), new CountryInfo("Armenia", "AM"), new CountryInfo("Aruba", "AW"), new CountryInfo("Australia", "AU"), new CountryInfo("Austria", "AT"), new CountryInfo("Azerbaijan", "AZ"), new CountryInfo("Bahamas", "BS"), new CountryInfo("Bahrain", "BH"), new CountryInfo("Bangladesh", "BD"), new CountryInfo("Barbados", "BB"), new CountryInfo("Belarus", "BY"), new CountryInfo("Belgium", "BE"), new CountryInfo("Belize", "BZ"), new CountryInfo("Benin", "BJ"), new CountryInfo("Bermuda", "BM"), new CountryInfo("Bhutan", OperatorName.BEGIN_TEXT), new CountryInfo("Bolivia (Plurinational State of)", "BO"), new CountryInfo("Bonaire Sint Eustatius Saba", "BQ"), new CountryInfo("Bosnia and Herzegovina", "BA"), new CountryInfo("Botswana", "BW"), new CountryInfo("Bouvet Island", "BV"), new CountryInfo("Brazil", "BR"), new CountryInfo("British Indian Ocean Territory", "IO"), new CountryInfo("Brunei Darussalam", "BN"), new CountryInfo("Bulgaria", "BG"), new CountryInfo("Burkina Faso", "BF"), new CountryInfo("Burundi", OperatorName.BEGIN_INLINE_IMAGE), new CountryInfo("Cabo Verde", "CV"), new CountryInfo("Cambodia", "KH"), new CountryInfo("Cameroon", "CM"), new CountryInfo("Canada", "CA"), new CountryInfo("Cayman Islands", "KY"), new CountryInfo("Central African Republic", "CF"), new CountryInfo("Chad", "TD"), new CountryInfo("Chile", "CL"), new CountryInfo("China", "CN"), new CountryInfo("Christmas Island", "CX"), new CountryInfo("Cocos (Keeling) Islands", AFMParser.f59178CC), new CountryInfo("Colombia", "CO"), new CountryInfo("Comoros", "KM"), new CountryInfo("Congo", "CG"), new CountryInfo("Congo, Democratic Republic of the", "CD"), new CountryInfo("Cook Islands", "CK"), new CountryInfo("Costa Rica", "CR"), new CountryInfo("Côte d\"Ivoire", "CI"), new CountryInfo("Croatia", "HR"), new CountryInfo("Cuba", "CU"), new CountryInfo("Curaçao", "CW"), new CountryInfo("Cyprus", "CY"), new CountryInfo("Czechia", "CZ"), new CountryInfo("Denmark", "DK"), new CountryInfo("Djibouti", "DJ"), new CountryInfo("Dominica", "DM"), new CountryInfo("Dominican Republic", "DO"), new CountryInfo("Ecuador", "EC"), new CountryInfo("Egypt", "EG"), new CountryInfo("El Salvador", "SV"), new CountryInfo("Equatorial Guinea", "GQ"), new CountryInfo("Eritrea", "ER"), new CountryInfo("Estonia", "EE"), new CountryInfo("Eswatini", "SZ"), new CountryInfo("Ethiopia", OperatorName.END_TEXT), new CountryInfo("Falkland Islands", "FK"), new CountryInfo("Faroe Islands", "FO"), new CountryInfo("Fiji", "FJ"), new CountryInfo("Finland", "FI"), new CountryInfo("France", "FR"), new CountryInfo("French Guiana", "GF"), new CountryInfo("French Polynesia", "PF"), new CountryInfo("French Southern Territories", "TF"), new CountryInfo("Gabon", "GA"), new CountryInfo("Gambia", "GM"), new CountryInfo("Georgia", "GE"), new CountryInfo("Germany", "DE"), new CountryInfo("Ghana", "GH"), new CountryInfo("Gibraltar", "GI"), new CountryInfo("Greece", "GR"), new CountryInfo("Greenland", "GL"), new CountryInfo("Grenada", "GD"), new CountryInfo("Guadeloupe", "GP"), new CountryInfo("Guam", "GU"), new CountryInfo("Guatemala", "GT"), new CountryInfo("Guernsey", "GG"), new CountryInfo("Guinea", "GN"), new CountryInfo("Guinea-Bissau", "GW"), new CountryInfo("Guyana", "GY"), new CountryInfo("Haiti", "HT"), new CountryInfo("Heard Island and McDonald Islands", "HM"), new CountryInfo("Holy See", "VA"), new CountryInfo("Honduras", "HN"), new CountryInfo("Hong Kong", "HK"), new CountryInfo("Hungary", "HU"), new CountryInfo("Iceland", "IS"), new CountryInfo("India", "IN"), new CountryInfo("Indonesia", OperatorName.BEGIN_INLINE_IMAGE_DATA), new CountryInfo("Iraq", "IQ"), new CountryInfo("Ireland", "IE"), new CountryInfo("Isle of Man", "IM"), new CountryInfo("Israel", "IL"), new CountryInfo("Italy", "IT"), new CountryInfo("Jamaica", "JM"), new CountryInfo("Japan", "JP"), new CountryInfo("Jersey", "JE"), new CountryInfo("Jordan", "JO"), new CountryInfo("Kazakhstan", "KZ"), new CountryInfo("Kenya", "KE"), new CountryInfo("Kiribati", "KI"), new CountryInfo("Korea, Republic of", "KR"), new CountryInfo("Kuwait", "KW"), new CountryInfo("Kyrgyzstan", ExpandedProductParsedResult.KILOGRAM), new CountryInfo("Lao People\"s Democratic Republic", "LA"), new CountryInfo("Latvia", "LV"), new CountryInfo("Lebanon", ExpandedProductParsedResult.POUND), new CountryInfo("Lesotho", "LS"), new CountryInfo("Liberia", "LR"), new CountryInfo("Libya", "LY"), new CountryInfo("Liechtenstein", StandardStructureTypes.f60301LI), new CountryInfo("Lithuania", "LT"), new CountryInfo("Luxembourg", "LU"), new CountryInfo("Macao", "MO"), new CountryInfo("Madagascar", "MG"), new CountryInfo("Malawi", "MW"), new CountryInfo("Malaysia", "MY"), new CountryInfo("Maldives", "MV"), new CountryInfo("Mali", "ML"), new CountryInfo("Malta", "MT"), new CountryInfo("Marshall Islands", "MH"), new CountryInfo("Martinique", "MQ"), new CountryInfo("Mauritania", "MR"), new CountryInfo("Mauritius", "MU"), new CountryInfo("Mayotte", "YT"), new CountryInfo("Mexico", "MX"), new CountryInfo("Micronesia (Federated States of)", "FM"), new CountryInfo("Moldova, Republic of", "MD"), new CountryInfo("Monaco", "MC"), new CountryInfo("Mongolia", "MN"), new CountryInfo("Montenegro", "ME"), new CountryInfo("Montserrat", "MS"), new CountryInfo("Morocco", "MA"), new CountryInfo("Mozambique", "MZ"), new CountryInfo("Myanmar", "MM"), new CountryInfo("Namibia", "NA"), new CountryInfo("Nauru", "NR"), new CountryInfo("Nepal", "NP"), new CountryInfo("Netherlands", "NL"), new CountryInfo("New Caledonia", "NC"), new CountryInfo("New Zealand", "NZ"), new CountryInfo("Nicaragua", "NI"), new CountryInfo("Niger", "NE"), new CountryInfo("Nigeria", "NG"), new CountryInfo("Niue", "NU"), new CountryInfo("Norfolk Island", "NF"), new CountryInfo("Northern Mariana Islands", OperatorName.MARKED_CONTENT_POINT), new CountryInfo("North Macedonia", "MK"), new CountryInfo("Norway", "NO"), new CountryInfo("Oman", "OM"), new CountryInfo("Pakistan", "PK"), new CountryInfo("Palau", "PW"), new CountryInfo("Palestine, State of", "PS"), new CountryInfo("Panama", "PA"), new CountryInfo("Papua New Guinea", "PG"), new CountryInfo("Paraguay", "PY"), new CountryInfo("Peru", "PE"), new CountryInfo("Philippines", "PH"), new CountryInfo("Pitcairn", "PN"), new CountryInfo("Poland", "PL"), new CountryInfo("Portugal", "PT"), new CountryInfo("Puerto Rico", "PR"), new CountryInfo("Qatar", "QA"), new CountryInfo("Réunion", "RE"), new CountryInfo("Romania", "RO"), new CountryInfo("Russian Federation", "RU"), new CountryInfo("Rwanda", "RW"), new CountryInfo("Saint Barthélemy", "BL"), new CountryInfo("Saint Helena Ascension Island Tristan da Cunha", "SH"), new CountryInfo("Saint Kitts and Nevis", "KN"), new CountryInfo("Saint Lucia", "LC"), new CountryInfo("Saint Martin (French part)", "MF"), new CountryInfo("Saint Pierre and Miquelon", "PM"), new CountryInfo("Saint Vincent and the Grenadines", "VC"), new CountryInfo("Samoa", "WS"), new CountryInfo("San Marino", "SM"), new CountryInfo("Sao Tome and Principe", "ST"), new CountryInfo("Saudi Arabia", "SA"), new CountryInfo("Senegal", "SN"), new CountryInfo("Serbia", "RS"), new CountryInfo("Seychelles", OperatorName.STROKING_COLOR), new CountryInfo("Sierra Leone", "SL"), new CountryInfo("Singapore", "SG"), new CountryInfo("Sint Maarten", "SX"), new CountryInfo("Slovakia", "SK"), new CountryInfo("Slovenia", "SI"), new CountryInfo("Solomon Islands", "SB"), new CountryInfo("Somalia", "SO"), new CountryInfo("South Africa", "ZA"), new CountryInfo("South Georgia and the South Sandwich Islands", "GS"), new CountryInfo("South Sudan", "SS"), new CountryInfo("Spain", "ES"), new CountryInfo("Sri Lanka", "LK"), new CountryInfo("Sudan", "SD"), new CountryInfo("Suriname", "SR"), new CountryInfo("Svalbard Jan Mayen", "SJ"), new CountryInfo("Sweden", "SE"), new CountryInfo("Switzerland", AFMParser.CHARMETRICS_CH), new CountryInfo("Syrian Arab Republic", "SY"), new CountryInfo("Taiwan", "TW"), new CountryInfo("Tajikistan", OperatorName.SHOW_TEXT_ADJUSTED), new CountryInfo("Tanzania, United Republic of", "TZ"), new CountryInfo("Thailand", StandardStructureTypes.f60307TH), new CountryInfo("Timor-Leste", OperatorName.SET_TEXT_LEADING), new CountryInfo("Togo", "TG"), new CountryInfo("Tokelau", "TK"), new CountryInfo("Tonga", "TO"), new CountryInfo("Trinidad and Tobago", "TT"), new CountryInfo("Tunisia", "TN"), new CountryInfo("Turkey", StandardStructureTypes.f60308TR), new CountryInfo("Turkmenistan", "TM"), new CountryInfo("Turks and Caicos Islands", "TC"), new CountryInfo("Tuvalu", "TV"), new CountryInfo("Uganda", "UG"), new CountryInfo("Ukraine", "UA"), new CountryInfo("United Arab Emirates", "AE"), new CountryInfo("United Kingdom of Great Britain and Northern Ireland", "GB"), new CountryInfo("United States Minor Outlying Islands", "UM"), new CountryInfo("United States of America", "US"), new CountryInfo("Uruguay", "UY"), new CountryInfo("Uzbekistan", "UZ"), new CountryInfo("Vanuatu", "VU"), new CountryInfo("Venezuela (Bolivarian Republic of)", "VE"), new CountryInfo("Vietnam", "VN"), new CountryInfo("Virgin Islands (British)", "VG"), new CountryInfo("Virgin Islands", "VI"), new CountryInfo("Wallis and Futuna", "WF"), new CountryInfo("Western Sahara", "EH"), new CountryInfo("Yemen", "YE"), new CountryInfo("Zambia", "ZM"), new CountryInfo("Zimbabwe", "ZW")});

    @Metadata(m29143d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m29142d2 = {"Lco/omise/android/models/CountryInfo$Companion;", "", "()V", Rule.ALL, "", "Lco/omise/android/models/CountryInfo;", "getALL", "()Ljava/util/List;", "sdk_productionRelease"}, m29141k = 1, m29140mv = {1, 7, 1}, m29138xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final List<CountryInfo> getALL() {
            return CountryInfo.ALL;
        }

        private Companion() {
        }
    }

    @Metadata(m29141k = 3, m29140mv = {1, 7, 1}, m29138xi = 48)
    /* loaded from: classes3.dex */
    public static final class Creator implements Parcelable.Creator<CountryInfo> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final CountryInfo createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CountryInfo(parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final CountryInfo[] newArray(int i) {
            return new CountryInfo[i];
        }
    }

    public CountryInfo(@NotNull String name, @NotNull String code) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(code, "code");
        this.name = name;
        this.code = code;
    }

    public static /* synthetic */ CountryInfo copy$default(CountryInfo countryInfo, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = countryInfo.name;
        }
        if ((i & 2) != 0) {
            str2 = countryInfo.code;
        }
        return countryInfo.copy(str, str2);
    }

    @NotNull
    public final String component1() {
        return this.name;
    }

    @NotNull
    public final String component2() {
        return this.code;
    }

    @NotNull
    public final CountryInfo copy(@NotNull String name, @NotNull String code) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(code, "code");
        return new CountryInfo(name, code);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CountryInfo) {
            CountryInfo countryInfo = (CountryInfo) obj;
            return Intrinsics.areEqual(this.name, countryInfo.name) && Intrinsics.areEqual(this.code, countryInfo.code);
        }
        return false;
    }

    @NotNull
    public final String getCode() {
        return this.code;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        return (this.name.hashCode() * 31) + this.code.hashCode();
    }

    @NotNull
    public String toString() {
        return "CountryInfo(name=" + this.name + ", code=" + this.code + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(this.name);
        out.writeString(this.code);
    }
}