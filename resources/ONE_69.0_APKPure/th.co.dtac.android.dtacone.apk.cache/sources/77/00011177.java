package th.p047co.dtac.android.dtacone.app_one.viewmodel.preference;

import androidx.compose.runtime.internal.StabilityInferred;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.apache.commons.codec.language.p027bm.Rule;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.data.cache.preference.PreferencesRepository;
import th.p047co.dtac.android.dtacone.util.Constant;

@StabilityInferred(parameters = 0)
@Singleton
@Metadata(m29143d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\f\u001a\n \u000b*\u0004\u0018\u00010\u00060\u0006¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0013\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0010R\u0011\u0010\u0015\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\r¨\u0006\u0016"}, m29142d2 = {"Lth/co/dtac/android/dtacone/app_one/viewmodel/preference/PreferencesViewModel;", "", "Lth/co/dtac/android/dtacone/data/cache/preference/PreferencesRepository;", "pfRepository", "<init>", "(Lth/co/dtac/android/dtacone/data/cache/preference/PreferencesRepository;)V", "", "company", "", "setCompany", "(Ljava/lang/String;)V", "kotlin.jvm.PlatformType", "getCompany", "()Ljava/lang/String;", "", "isCompanyAll", "()Z", PDPageLabelRange.STYLE_LETTERS_LOWER, "Lth/co/dtac/android/dtacone/data/cache/preference/PreferencesRepository;", "isCompanyTrue", "getSuffixApi", "suffixApi", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.app_one.viewmodel.preference.PreferencesViewModel */
/* loaded from: classes7.dex */
public final class PreferencesViewModel {
    public static final int $stable = 8;

    /* renamed from: a */
    public final PreferencesRepository f82708a;

    @Inject
    public PreferencesViewModel(@NotNull PreferencesRepository pfRepository) {
        Intrinsics.checkNotNullParameter(pfRepository, "pfRepository");
        this.f82708a = pfRepository;
    }

    public final String getCompany() {
        return this.f82708a.getString(Constant.X_COMPANY, Rule.ALL);
    }

    @NotNull
    public final String getSuffixApi() {
        if (Intrinsics.areEqual(this.f82708a.getString(Constant.X_COMPANY, Rule.ALL), "TRUE")) {
            return "T";
        }
        return "";
    }

    public final boolean isCompanyAll() {
        return Intrinsics.areEqual(this.f82708a.getString(Constant.X_COMPANY, Rule.ALL), Rule.ALL);
    }

    public final boolean isCompanyTrue() {
        return Intrinsics.areEqual(this.f82708a.getString(Constant.X_COMPANY, Rule.ALL), "TRUE");
    }

    public final void setCompany(@NotNull String company) {
        Intrinsics.checkNotNullParameter(company, "company");
        this.f82708a.setString(Constant.X_COMPANY, company);
    }
}