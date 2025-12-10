package co.omise.android;

import android.content.Intent;
import android.net.Uri;
import com.zxy.tiny.common.UriUtil;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u001d\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\u0002\u0010\u0006B\u000f\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u0006\u0010\u0015\u001a\u00020\u0013J\u000e\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0003J\u000e\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0003R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\f\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0012\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0014¨\u0006\u0019"}, m28850d2 = {"Lco/omise/android/AuthorizingPaymentURLVerifier;", "", "authorizedURL", "Landroid/net/Uri;", "expectedReturnURLPatterns", "", "(Landroid/net/Uri;Ljava/util/List;)V", "intent", "Landroid/content/Intent;", "(Landroid/content/Intent;)V", "getAuthorizedURL", "()Landroid/net/Uri;", "authorizedURLString", "", "getAuthorizedURLString", "()Ljava/lang/String;", "getExpectedReturnURLPatterns", "()Ljava/util/List;", "isReady", "", "()Z", "verifyExternalURL", "uri", "verifyURL", "Companion", "sdk_productionRelease"}, m28849k = 1, m28848mv = {1, 7, 1}, m28846xi = 48)
/* loaded from: classes2.dex */
public final class AuthorizingPaymentURLVerifier {
    @NotNull
    public static final Companion Companion = new Companion(null);
    @NotNull
    public static final String EXTRA_AUTHORIZED_URLSTRING = "AuthorizingPaymentURLVerifier.authorizedURL";
    @NotNull
    public static final String EXTRA_EXPECTED_RETURN_URLSTRING_PATTERNS = "AuthorizingPaymentURLVerifier.expectedReturnURLPatterns";
    @NotNull
    public static final String EXTRA_RETURNED_URLSTRING = "AuthorizingPaymentURLVerifier.returnedURL";
    public static final int REQUEST_EXTERNAL_CODE = 300;
    @NotNull
    private final Uri authorizedURL;
    @NotNull
    private final List<Uri> expectedReturnURLPatterns;

    @Metadata(m28851d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000¨\u0006\t"}, m28850d2 = {"Lco/omise/android/AuthorizingPaymentURLVerifier$Companion;", "", "()V", "EXTRA_AUTHORIZED_URLSTRING", "", "EXTRA_EXPECTED_RETURN_URLSTRING_PATTERNS", "EXTRA_RETURNED_URLSTRING", "REQUEST_EXTERNAL_CODE", "", "sdk_productionRelease"}, m28849k = 1, m28848mv = {1, 7, 1}, m28846xi = 48)
    /* loaded from: classes2.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AuthorizingPaymentURLVerifier(@NotNull Uri authorizedURL, @NotNull List<? extends Uri> expectedReturnURLPatterns) {
        Intrinsics.checkNotNullParameter(authorizedURL, "authorizedURL");
        Intrinsics.checkNotNullParameter(expectedReturnURLPatterns, "expectedReturnURLPatterns");
        this.authorizedURL = authorizedURL;
        this.expectedReturnURLPatterns = expectedReturnURLPatterns;
    }

    @NotNull
    public final Uri getAuthorizedURL() {
        return this.authorizedURL;
    }

    @NotNull
    public final String getAuthorizedURLString() {
        String uri = this.authorizedURL.toString();
        Intrinsics.checkNotNullExpressionValue(uri, "authorizedURL.toString()");
        return uri;
    }

    @NotNull
    public final List<Uri> getExpectedReturnURLPatterns() {
        return this.expectedReturnURLPatterns;
    }

    public final boolean isReady() {
        String uri = this.authorizedURL.toString();
        Intrinsics.checkNotNullExpressionValue(uri, "authorizedURL.toString()");
        if (uri.length() > 0 && (!this.expectedReturnURLPatterns.isEmpty())) {
            return true;
        }
        return false;
    }

    public final boolean verifyExternalURL(@NotNull Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        return (Intrinsics.areEqual(uri.getScheme(), "http") || Intrinsics.areEqual(uri.getScheme(), UriUtil.HTTPS_SCHEME) || Intrinsics.areEqual(uri.getScheme(), "about")) ? false : true;
    }

    public final boolean verifyURL(@NotNull Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        String path = uri.getPath();
        if (path == null) {
            return false;
        }
        for (Uri uri2 : this.expectedReturnURLPatterns) {
            String path2 = uri2.getPath();
            if (path2 != null && AbstractC20204hN1.equals(uri2.getScheme(), uri.getScheme(), true) && AbstractC20204hN1.equals(uri2.getHost(), uri.getHost(), true) && AbstractC20204hN1.startsWith$default(path, path2, false, 2, null)) {
                return true;
            }
        }
        return false;
    }

    public AuthorizingPaymentURLVerifier(@NotNull Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        String stringExtra = intent.getStringExtra(EXTRA_AUTHORIZED_URLSTRING);
        String[] stringArrayExtra = intent.getStringArrayExtra(EXTRA_EXPECTED_RETURN_URLSTRING_PATTERNS);
        if (stringExtra != null && stringExtra.length() != 0) {
            if (stringArrayExtra != null && stringArrayExtra.length != 0) {
                Uri parse = Uri.parse(stringExtra);
                Intrinsics.checkNotNullExpressionValue(parse, "parse(authorizedURLString)");
                this.authorizedURL = parse;
                ArrayList arrayList = new ArrayList(stringArrayExtra.length);
                for (String str : stringArrayExtra) {
                    arrayList.add(Uri.parse(str));
                }
                this.expectedReturnURLPatterns = arrayList;
                return;
            }
            throw new IllegalArgumentException("Couldn't find argument: EXTRA_EXPECTED_RETURN_URLSTRING_PATTERNS.");
        }
        throw new IllegalArgumentException("Couldn't find argument: EXTRA_AUTHORIZED_URLSTRING.");
    }

    public final boolean verifyExternalURL() {
        return verifyExternalURL(this.authorizedURL);
    }
}
