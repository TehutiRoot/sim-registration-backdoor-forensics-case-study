package androidx.core.content;

import android.content.UriMatcher;
import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.core.content.UriMatcherCompat;
import androidx.core.util.Predicate;

/* loaded from: classes2.dex */
public class UriMatcherCompat {
    @NonNull
    public static Predicate<Uri> asPredicate(@NonNull final UriMatcher uriMatcher) {
        return new Predicate() { // from class: SZ1
            @Override // androidx.core.util.Predicate
            public /* synthetic */ Predicate and(Predicate predicate) {
                return AbstractC20438im1.m30576a(this, predicate);
            }

            @Override // androidx.core.util.Predicate
            public /* synthetic */ Predicate negate() {
                return AbstractC20438im1.m30575b(this);
            }

            @Override // androidx.core.util.Predicate
            /* renamed from: or */
            public /* synthetic */ Predicate mo62or(Predicate predicate) {
                return AbstractC20438im1.m30574c(this, predicate);
            }

            @Override // androidx.core.util.Predicate
            public final boolean test(Object obj) {
                boolean m57455b;
                m57455b = UriMatcherCompat.m57455b(uriMatcher, (Uri) obj);
                return m57455b;
            }
        };
    }

    /* renamed from: b */
    public static /* synthetic */ boolean m57455b(UriMatcher uriMatcher, Uri uri) {
        if (uriMatcher.match(uri) != -1) {
            return true;
        }
        return false;
    }
}
