package th.p047co.dtac.android.dtacone.app_one.util;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.net.Uri;
import androidx.browser.customtabs.CustomTabColorSchemeParams;
import androidx.browser.customtabs.CustomTabsIntent;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.ContextCompat;
import com.google.android.gms.common.internal.ImagesContract;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.R;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\b\b\u0017\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J'\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0007¢\u0006\u0004\b\f\u0010\rJ9\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u000e2\u0006\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, m28850d2 = {"Lth/co/dtac/android/dtacone/app_one/util/OneCustomTabsUtil;", "", "Landroidx/browser/customtabs/CustomTabsIntent$Builder;", "builder", "<init>", "(Landroidx/browser/customtabs/CustomTabsIntent$Builder;)V", "Landroid/app/Activity;", "activity", "", ImagesContract.URL, "company", "", "openContentWebView", "(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;)V", "", "extraQueryParameter", "openContentWebViewGetParam", "(Landroid/app/Activity;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;)V", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroidx/browser/customtabs/CustomTabsIntent$Builder;", "getBuilder", "()Landroidx/browser/customtabs/CustomTabsIntent$Builder;", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nOneCustomTabsUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OneCustomTabsUtil.kt\nth/co/dtac/android/dtacone/app_one/util/OneCustomTabsUtil\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,76:1\n215#2,2:77\n*S KotlinDebug\n*F\n+ 1 OneCustomTabsUtil.kt\nth/co/dtac/android/dtacone/app_one/util/OneCustomTabsUtil\n*L\n63#1:77,2\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.app_one.util.OneCustomTabsUtil */
/* loaded from: classes7.dex */
public class OneCustomTabsUtil {
    public static final int $stable = 8;

    /* renamed from: a */
    public final CustomTabsIntent.Builder f82384a;

    @Inject
    public OneCustomTabsUtil(@NotNull CustomTabsIntent.Builder builder) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        this.f82384a = builder;
    }

    @NotNull
    public final CustomTabsIntent.Builder getBuilder() {
        return this.f82384a;
    }

    @SuppressLint({"ResourceAsColor"})
    public final void openContentWebView(@NotNull Activity activity, @NotNull String url, @NotNull String company) {
        int i;
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(company, "company");
        if (Intrinsics.areEqual(company, "TRUE")) {
            i = R.color.red2;
        } else {
            i = R.color.darkBlue;
        }
        CustomTabsIntent.Builder builder = this.f82384a;
        builder.setToolbarColor(ContextCompat.getColor(activity, i));
        builder.setShowTitle(true);
        builder.setStartAnimations(activity, R.anim.slide_in, R.anim.slide_out);
        builder.enableUrlBarHiding();
        this.f82384a.build().launchUrl(activity, Uri.parse(url));
    }

    public final void openContentWebViewGetParam(@NotNull Activity activity, @NotNull String url, @NotNull Map<String, String> extraQueryParameter, @NotNull String company) {
        int i;
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(extraQueryParameter, "extraQueryParameter");
        Intrinsics.checkNotNullParameter(company, "company");
        if (Intrinsics.areEqual(company, "TRUE")) {
            i = R.color.red2;
        } else {
            i = R.color.darkBlue;
        }
        CustomTabColorSchemeParams.Builder builder = new CustomTabColorSchemeParams.Builder();
        builder.setToolbarColor(ContextCompat.getColor(activity, i));
        this.f82384a.setDefaultColorSchemeParams(builder.build());
        this.f82384a.setShowTitle(true);
        this.f82384a.setInstantAppsEnabled(true);
        this.f82384a.setUrlBarHidingEnabled(true);
        this.f82384a.setShareState(2);
        Uri.Builder buildUpon = Uri.parse(url).buildUpon();
        for (Map.Entry<String, String> entry : extraQueryParameter.entrySet()) {
            buildUpon.appendQueryParameter(entry.getKey(), entry.getValue());
        }
        String uri = buildUpon.build().toString();
        Intrinsics.checkNotNullExpressionValue(uri, "uriBuilder.build().toString()");
        CustomTabsIntent build = this.f82384a.build();
        Intrinsics.checkNotNullExpressionValue(build, "builder.build()");
        build.intent.putExtra(CustomTabsIntent.EXTRA_DISABLE_DOWNLOAD_BUTTON, true);
        build.intent.putExtra(CustomTabsIntent.EXTRA_DISABLE_BOOKMARKS_BUTTON, true);
        build.launchUrl(activity, Uri.parse(uri));
    }
}
