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
        return new Predicate() { // from class: P02
            @Override // androidx.core.util.Predicate
            public /* synthetic */ Predicate and(Predicate predicate) {
                return AbstractC19977fn1.m31478a(this, predicate);
            }

            @Override // androidx.core.util.Predicate
            public /* synthetic */ Predicate negate() {
                return AbstractC19977fn1.m31477b(this);
            }

            @Override // androidx.core.util.Predicate
            /* renamed from: or */
            public /* synthetic */ Predicate mo89or(Predicate predicate) {
                return AbstractC19977fn1.m31476c(this, predicate);
            }

            @Override // androidx.core.util.Predicate
            public final boolean test(Object obj) {
                boolean m57405b;
                m57405b = UriMatcherCompat.m57405b(uriMatcher, (Uri) obj);
                return m57405b;
            }
        };
    }

    /* renamed from: b */
    public static /* synthetic */ boolean m57405b(UriMatcher uriMatcher, Uri uri) {
        if (uriMatcher.match(uri) != -1) {
            return true;
        }
        return false;
    }
}