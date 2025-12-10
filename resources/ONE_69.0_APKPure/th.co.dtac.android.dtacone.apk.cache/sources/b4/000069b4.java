package androidx.core.content;

import android.annotation.SuppressLint;
import android.content.ClipData;
import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.textclassifier.TextLinks;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.core.content.IntentSanitizer;
import androidx.core.util.Consumer;
import androidx.core.util.Preconditions;
import androidx.core.util.Predicate;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes2.dex */
public class IntentSanitizer {

    /* renamed from: a */
    public int f33833a;

    /* renamed from: b */
    public Predicate f33834b;

    /* renamed from: c */
    public Predicate f33835c;

    /* renamed from: d */
    public Predicate f33836d;

    /* renamed from: e */
    public Predicate f33837e;

    /* renamed from: f */
    public Predicate f33838f;

    /* renamed from: g */
    public Predicate f33839g;

    /* renamed from: h */
    public boolean f33840h;

    /* renamed from: i */
    public Map f33841i;

    /* renamed from: j */
    public boolean f33842j;

    /* renamed from: k */
    public Predicate f33843k;

    /* renamed from: l */
    public Predicate f33844l;

    /* renamed from: m */
    public boolean f33845m;

    /* renamed from: n */
    public boolean f33846n;

    /* renamed from: o */
    public boolean f33847o;

    /* loaded from: classes2.dex */
    public static final class Builder {

        /* renamed from: a */
        public int f33848a;

        /* renamed from: h */
        public boolean f33855h;

        /* renamed from: i */
        public boolean f33856i;

        /* renamed from: n */
        public boolean f33861n;

        /* renamed from: o */
        public boolean f33862o;

        /* renamed from: p */
        public boolean f33863p;

        /* renamed from: b */
        public Predicate f33849b = new Predicate() { // from class: If0
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
                return IntentSanitizer.Builder.m57430p((String) obj);
            }
        };

        /* renamed from: c */
        public Predicate f33850c = new Predicate() { // from class: Jf0
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
                return IntentSanitizer.Builder.m57434l((Uri) obj);
            }
        };

        /* renamed from: d */
        public Predicate f33851d = new Predicate() { // from class: Kf0
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
                return IntentSanitizer.Builder.m57444b((String) obj);
            }
        };

        /* renamed from: e */
        public Predicate f33852e = new Predicate() { // from class: Lf0
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
                return IntentSanitizer.Builder.m57435k((String) obj);
            }
        };

        /* renamed from: f */
        public Predicate f33853f = new Predicate() { // from class: Mf0
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
                return IntentSanitizer.Builder.m57440f((String) obj);
            }
        };

        /* renamed from: g */
        public Predicate f33854g = new Predicate() { // from class: Nf0
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
                return IntentSanitizer.Builder.m57445a((ComponentName) obj);
            }
        };

        /* renamed from: j */
        public Map f33857j = new HashMap();

        /* renamed from: k */
        public boolean f33858k = false;

        /* renamed from: l */
        public Predicate f33859l = new Predicate() { // from class: Of0
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
                return IntentSanitizer.Builder.m57433m((Uri) obj);
            }
        };

        /* renamed from: m */
        public Predicate f33860m = new Predicate() { // from class: Pf0
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
                return IntentSanitizer.Builder.m57429q((ClipData) obj);
            }
        };

        /* renamed from: A */
        public static /* synthetic */ boolean m57453A(String str) {
            return false;
        }

        /* renamed from: B */
        public static /* synthetic */ boolean m57452B(Uri uri) {
            return false;
        }

        /* renamed from: C */
        public static /* synthetic */ boolean m57451C(String str) {
            return false;
        }

        /* renamed from: D */
        public static /* synthetic */ boolean m57450D(String str) {
            return false;
        }

        /* renamed from: E */
        public static /* synthetic */ boolean m57449E(String str) {
            return false;
        }

        /* renamed from: F */
        public static /* synthetic */ boolean m57448F(ComponentName componentName) {
            return false;
        }

        /* renamed from: G */
        public static /* synthetic */ boolean m57447G(Uri uri) {
            return false;
        }

        /* renamed from: H */
        public static /* synthetic */ boolean m57446H(ClipData clipData) {
            return false;
        }

        /* renamed from: a */
        public static /* synthetic */ boolean m57445a(ComponentName componentName) {
            return m57448F(componentName);
        }

        /* renamed from: b */
        public static /* synthetic */ boolean m57444b(String str) {
            return m57451C(str);
        }

        /* renamed from: c */
        public static /* synthetic */ boolean m57443c(String str, ComponentName componentName) {
            return m57426t(str, componentName);
        }

        /* renamed from: d */
        public static /* synthetic */ boolean m57442d(String str, Uri uri) {
            return m57427s(str, uri);
        }

        /* renamed from: e */
        public static /* synthetic */ boolean m57441e(Class cls, Predicate predicate, Object obj) {
            return m57423w(cls, predicate, obj);
        }

        /* renamed from: f */
        public static /* synthetic */ boolean m57440f(String str) {
            return m57449E(str);
        }

        /* renamed from: h */
        public static /* synthetic */ boolean m57438h(String str, Uri uri) {
            return m57420z(str, uri);
        }

        /* renamed from: i */
        public static /* synthetic */ boolean m57437i(Object obj) {
            return m57422x(obj);
        }

        /* renamed from: j */
        public static /* synthetic */ boolean m57436j(ComponentName componentName) {
            return m57428r(componentName);
        }

        /* renamed from: k */
        public static /* synthetic */ boolean m57435k(String str) {
            return m57450D(str);
        }

        /* renamed from: l */
        public static /* synthetic */ boolean m57434l(Uri uri) {
            return m57452B(uri);
        }

        /* renamed from: m */
        public static /* synthetic */ boolean m57433m(Uri uri) {
            return m57447G(uri);
        }

        /* renamed from: n */
        public static /* synthetic */ boolean m57432n(String str, Uri uri) {
            return m57425u(str, uri);
        }

        /* renamed from: o */
        public static /* synthetic */ boolean m57431o(Object obj) {
            return m57424v(obj);
        }

        /* renamed from: p */
        public static /* synthetic */ boolean m57430p(String str) {
            return m57453A(str);
        }

        /* renamed from: q */
        public static /* synthetic */ boolean m57429q(ClipData clipData) {
            return m57446H(clipData);
        }

        /* renamed from: r */
        public static /* synthetic */ boolean m57428r(ComponentName componentName) {
            return true;
        }

        /* renamed from: s */
        public static /* synthetic */ boolean m57427s(String str, Uri uri) {
            return str.equals(uri.getAuthority());
        }

        /* renamed from: t */
        public static /* synthetic */ boolean m57426t(String str, ComponentName componentName) {
            return str.equals(componentName.getPackageName());
        }

        /* renamed from: u */
        public static /* synthetic */ boolean m57425u(String str, Uri uri) {
            return str.equals(uri.getAuthority());
        }

        /* renamed from: v */
        public static /* synthetic */ boolean m57424v(Object obj) {
            return true;
        }

        /* renamed from: w */
        public static /* synthetic */ boolean m57423w(Class cls, Predicate predicate, Object obj) {
            if (cls.isInstance(obj) && predicate.test(cls.cast(obj))) {
                return true;
            }
            return false;
        }

        /* renamed from: x */
        public static /* synthetic */ boolean m57422x(Object obj) {
            return false;
        }

        /* renamed from: y */
        public static /* synthetic */ boolean m57421y(String str, Uri uri) {
            return str.equals(uri.getAuthority());
        }

        /* renamed from: z */
        public static /* synthetic */ boolean m57420z(String str, Uri uri) {
            return str.equals(uri.getAuthority());
        }

        @NonNull
        @SuppressLint({"BuilderSetStyle"})
        public Builder allowAction(@NonNull String str) {
            Preconditions.checkNotNull(str);
            Objects.requireNonNull(str);
            allowAction(new C23412zf0(str));
            return this;
        }

        @NonNull
        @SuppressLint({"BuilderSetStyle"})
        public Builder allowAnyComponent() {
            this.f33855h = true;
            this.f33854g = new Predicate() { // from class: Ef0
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
                    return IntentSanitizer.Builder.m57436j((ComponentName) obj);
                }
            };
            return this;
        }

        @NonNull
        @SuppressLint({"BuilderSetStyle"})
        public Builder allowCategory(@NonNull String str) {
            Preconditions.checkNotNull(str);
            Objects.requireNonNull(str);
            return allowCategory(new C23412zf0(str));
        }

        @NonNull
        @SuppressLint({"BuilderSetStyle"})
        public Builder allowClipData(@NonNull Predicate<ClipData> predicate) {
            Preconditions.checkNotNull(predicate);
            this.f33860m = this.f33860m.mo89or(predicate);
            return this;
        }

        @NonNull
        @SuppressLint({"BuilderSetStyle"})
        public Builder allowClipDataText() {
            this.f33858k = true;
            return this;
        }

        @NonNull
        @SuppressLint({"BuilderSetStyle"})
        public Builder allowClipDataUri(@NonNull Predicate<Uri> predicate) {
            Preconditions.checkNotNull(predicate);
            this.f33859l = this.f33859l.mo89or(predicate);
            return this;
        }

        @NonNull
        @SuppressLint({"BuilderSetStyle"})
        public Builder allowClipDataUriWithAuthority(@NonNull final String str) {
            Preconditions.checkNotNull(str);
            return allowClipDataUri(new Predicate() { // from class: Ff0
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
                    return IntentSanitizer.Builder.m57442d(str, (Uri) obj);
                }
            });
        }

        @NonNull
        @SuppressLint({"BuilderSetStyle"})
        public Builder allowComponent(@NonNull final ComponentName componentName) {
            Preconditions.checkNotNull(componentName);
            Objects.requireNonNull(componentName);
            return allowComponent(new Predicate() { // from class: Df0
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
                    return componentName.equals((ComponentName) obj);
                }
            });
        }

        @NonNull
        @SuppressLint({"BuilderSetStyle"})
        public Builder allowComponentWithPackage(@NonNull final String str) {
            Preconditions.checkNotNull(str);
            return allowComponent(new Predicate() { // from class: Af0
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
                    return IntentSanitizer.Builder.m57443c(str, (ComponentName) obj);
                }
            });
        }

        @NonNull
        @SuppressLint({"BuilderSetStyle"})
        public Builder allowData(@NonNull Predicate<Uri> predicate) {
            Preconditions.checkNotNull(predicate);
            this.f33850c = this.f33850c.mo89or(predicate);
            return this;
        }

        @NonNull
        @SuppressLint({"BuilderSetStyle"})
        public Builder allowDataWithAuthority(@NonNull final String str) {
            Preconditions.checkNotNull(str);
            allowData(new Predicate() { // from class: Bf0
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
                    return IntentSanitizer.Builder.m57432n(str, (Uri) obj);
                }
            });
            return this;
        }

        @NonNull
        @SuppressLint({"BuilderSetStyle"})
        public Builder allowExtra(@NonNull String str, @NonNull Class<?> cls) {
            return allowExtra(str, cls, new Predicate() { // from class: Qf0
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
                    return IntentSanitizer.Builder.m57431o(obj);
                }
            });
        }

        @NonNull
        @SuppressLint({"BuilderSetStyle"})
        public Builder allowExtraOutput(@NonNull final String str) {
            allowExtra("output", Uri.class, new Predicate() { // from class: yf0
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
                    boolean m57421y;
                    m57421y = IntentSanitizer.Builder.m57421y(str, (Uri) obj);
                    return m57421y;
                }
            });
            return this;
        }

        @NonNull
        @SuppressLint({"BuilderSetStyle"})
        public Builder allowExtraStream(@NonNull Predicate<Uri> predicate) {
            allowExtra("android.intent.extra.STREAM", Uri.class, predicate);
            return this;
        }

        @NonNull
        @SuppressLint({"BuilderSetStyle"})
        public Builder allowExtraStreamUriWithAuthority(@NonNull final String str) {
            Preconditions.checkNotNull(str);
            allowExtra("android.intent.extra.STREAM", Uri.class, new Predicate() { // from class: Hf0
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
                    return IntentSanitizer.Builder.m57438h(str, (Uri) obj);
                }
            });
            return this;
        }

        @NonNull
        @SuppressLint({"BuilderSetStyle"})
        public Builder allowFlags(int i) {
            this.f33848a = i | this.f33848a;
            return this;
        }

        @NonNull
        @SuppressLint({"BuilderSetStyle"})
        public Builder allowHistoryStackFlags() {
            this.f33848a |= 2112614400;
            return this;
        }

        @NonNull
        @SuppressLint({"BuilderSetStyle"})
        public Builder allowIdentifier() {
            this.f33861n = true;
            return this;
        }

        @NonNull
        @SuppressLint({"BuilderSetStyle"})
        public Builder allowPackage(@NonNull String str) {
            Preconditions.checkNotNull(str);
            Objects.requireNonNull(str);
            return allowPackage(new C23412zf0(str));
        }

        @NonNull
        @SuppressLint({"BuilderSetStyle"})
        public Builder allowReceiverFlags() {
            this.f33848a |= 2015363072;
            return this;
        }

        @NonNull
        @SuppressLint({"BuilderSetStyle"})
        public Builder allowSelector() {
            this.f33862o = true;
            return this;
        }

        @NonNull
        @SuppressLint({"BuilderSetStyle"})
        public Builder allowSourceBounds() {
            this.f33863p = true;
            return this;
        }

        @NonNull
        @SuppressLint({"BuilderSetStyle"})
        public Builder allowType(@NonNull String str) {
            Preconditions.checkNotNull(str);
            Objects.requireNonNull(str);
            return allowType(new C23412zf0(str));
        }

        @NonNull
        @SuppressLint({"SyntheticAccessor"})
        public IntentSanitizer build() {
            boolean z = this.f33855h;
            if ((z && this.f33856i) || (!z && !this.f33856i)) {
                throw new SecurityException("You must call either allowAnyComponent or one or more of the allowComponent methods; but not both.");
            }
            IntentSanitizer intentSanitizer = new IntentSanitizer();
            intentSanitizer.f33833a = this.f33848a;
            intentSanitizer.f33834b = this.f33849b;
            intentSanitizer.f33835c = this.f33850c;
            intentSanitizer.f33836d = this.f33851d;
            intentSanitizer.f33837e = this.f33852e;
            intentSanitizer.f33838f = this.f33853f;
            intentSanitizer.f33840h = this.f33855h;
            intentSanitizer.f33839g = this.f33854g;
            intentSanitizer.f33841i = this.f33857j;
            intentSanitizer.f33842j = this.f33858k;
            intentSanitizer.f33843k = this.f33859l;
            intentSanitizer.f33844l = this.f33860m;
            intentSanitizer.f33845m = this.f33861n;
            intentSanitizer.f33846n = this.f33862o;
            intentSanitizer.f33847o = this.f33863p;
            return intentSanitizer;
        }

        @NonNull
        @SuppressLint({"BuilderSetStyle"})
        public <T> Builder allowExtra(@NonNull String str, @NonNull final Class<T> cls, @NonNull final Predicate<T> predicate) {
            Preconditions.checkNotNull(str);
            Preconditions.checkNotNull(cls);
            Preconditions.checkNotNull(predicate);
            return allowExtra(str, new Predicate() { // from class: Cf0
                @Override // androidx.core.util.Predicate
                public /* synthetic */ Predicate and(Predicate predicate2) {
                    return AbstractC19977fn1.m31478a(this, predicate2);
                }

                @Override // androidx.core.util.Predicate
                public /* synthetic */ Predicate negate() {
                    return AbstractC19977fn1.m31477b(this);
                }

                @Override // androidx.core.util.Predicate
                /* renamed from: or */
                public /* synthetic */ Predicate mo89or(Predicate predicate2) {
                    return AbstractC19977fn1.m31476c(this, predicate2);
                }

                @Override // androidx.core.util.Predicate
                public final boolean test(Object obj) {
                    return IntentSanitizer.Builder.m57441e(cls, predicate, obj);
                }
            });
        }

        @NonNull
        @SuppressLint({"BuilderSetStyle"})
        public Builder allowExtraOutput(@NonNull Predicate<Uri> predicate) {
            allowExtra("output", Uri.class, predicate);
            return this;
        }

        @NonNull
        @SuppressLint({"BuilderSetStyle"})
        public Builder allowAction(@NonNull Predicate<String> predicate) {
            Preconditions.checkNotNull(predicate);
            this.f33849b = this.f33849b.mo89or(predicate);
            return this;
        }

        @NonNull
        @SuppressLint({"BuilderSetStyle"})
        public Builder allowCategory(@NonNull Predicate<String> predicate) {
            Preconditions.checkNotNull(predicate);
            this.f33852e = this.f33852e.mo89or(predicate);
            return this;
        }

        @NonNull
        @SuppressLint({"BuilderSetStyle"})
        public Builder allowComponent(@NonNull Predicate<ComponentName> predicate) {
            Preconditions.checkNotNull(predicate);
            this.f33856i = true;
            this.f33854g = this.f33854g.mo89or(predicate);
            return this;
        }

        @NonNull
        @SuppressLint({"BuilderSetStyle"})
        public Builder allowPackage(@NonNull Predicate<String> predicate) {
            Preconditions.checkNotNull(predicate);
            this.f33853f = this.f33853f.mo89or(predicate);
            return this;
        }

        @NonNull
        @SuppressLint({"BuilderSetStyle"})
        public Builder allowType(@NonNull Predicate<String> predicate) {
            Preconditions.checkNotNull(predicate);
            this.f33851d = this.f33851d.mo89or(predicate);
            return this;
        }

        @NonNull
        @SuppressLint({"BuilderSetStyle"})
        public Builder allowExtra(@NonNull String str, @NonNull Predicate<Object> predicate) {
            Preconditions.checkNotNull(str);
            Preconditions.checkNotNull(predicate);
            Predicate predicate2 = (Predicate) this.f33857j.get(str);
            if (predicate2 == null) {
                predicate2 = new Predicate() { // from class: Gf0
                    @Override // androidx.core.util.Predicate
                    public /* synthetic */ Predicate and(Predicate predicate3) {
                        return AbstractC19977fn1.m31478a(this, predicate3);
                    }

                    @Override // androidx.core.util.Predicate
                    public /* synthetic */ Predicate negate() {
                        return AbstractC19977fn1.m31477b(this);
                    }

                    @Override // androidx.core.util.Predicate
                    /* renamed from: or */
                    public /* synthetic */ Predicate mo89or(Predicate predicate3) {
                        return AbstractC19977fn1.m31476c(this, predicate3);
                    }

                    @Override // androidx.core.util.Predicate
                    public final boolean test(Object obj) {
                        return IntentSanitizer.Builder.m57437i(obj);
                    }
                };
            }
            this.f33857j.put(str, predicate2.mo89or(predicate));
            return this;
        }
    }

    /* renamed from: androidx.core.content.IntentSanitizer$b */
    /* loaded from: classes2.dex */
    public static class C3943b {
        @DoNotInline
        /* renamed from: a */
        public static Intent m57419a(Intent intent) {
            return intent.getSelector();
        }

        @DoNotInline
        /* renamed from: b */
        public static void m57418b(Intent intent, Intent intent2) {
            intent.setSelector(intent2);
        }
    }

    /* renamed from: androidx.core.content.IntentSanitizer$c */
    /* loaded from: classes2.dex */
    public static class C3944c {

        /* renamed from: androidx.core.content.IntentSanitizer$c$a */
        /* loaded from: classes2.dex */
        public static class C3945a {
            @DoNotInline
            /* renamed from: a */
            public static void m57415a(int i, ClipData.Item item, Consumer<String> consumer) {
                TextLinks textLinks;
                if (item.getHtmlText() == null && item.getIntent() == null) {
                    textLinks = item.getTextLinks();
                    if (textLinks == null) {
                        return;
                    }
                }
                consumer.accept("ClipData item at position " + i + " contains htmlText, textLinks or intent: " + item);
            }
        }

        /* renamed from: a */
        public static void m57417a(int i, ClipData.Item item, Consumer consumer) {
            if (item.getHtmlText() != null || item.getIntent() != null) {
                consumer.accept("ClipData item at position " + i + " contains htmlText, textLinks or intent: " + item);
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:88:0x00be  */
        /* JADX WARN: Removed duplicated region for block: B:89:0x00cd  */
        @androidx.annotation.DoNotInline
        /* renamed from: b */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static void m57416b(@androidx.annotation.NonNull android.content.Intent r7, android.content.Intent r8, androidx.core.util.Predicate<android.content.ClipData> r9, boolean r10, androidx.core.util.Predicate<android.net.Uri> r11, androidx.core.util.Consumer<java.lang.String> r12) {
            /*
                android.content.ClipData r7 = r7.getClipData()
                if (r7 != 0) goto L7
                return
            L7:
                if (r9 == 0) goto L14
                boolean r9 = r9.test(r7)
                if (r9 == 0) goto L14
                r8.setClipData(r7)
                goto Lde
            L14:
                r9 = 0
                r0 = 0
                r1 = r9
            L17:
                int r2 = r7.getItemCount()
                if (r0 >= r2) goto Ld9
                android.content.ClipData$Item r2 = r7.getItemAt(r0)
                int r3 = android.os.Build.VERSION.SDK_INT
                r4 = 31
                if (r3 < r4) goto L2b
                androidx.core.content.IntentSanitizer.C3944c.C3945a.m57415a(r0, r2, r12)
                goto L2e
            L2b:
                m57417a(r0, r2, r12)
            L2e:
                if (r10 == 0) goto L35
                java.lang.CharSequence r3 = r2.getText()
                goto L5c
            L35:
                java.lang.CharSequence r3 = r2.getText()
                if (r3 == 0) goto L5b
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r4 = "Item text cannot contain value. Item position: "
                r3.append(r4)
                r3.append(r0)
                java.lang.String r4 = ". Text: "
                r3.append(r4)
                java.lang.CharSequence r4 = r2.getText()
                r3.append(r4)
                java.lang.String r3 = r3.toString()
                r12.accept(r3)
            L5b:
                r3 = r9
            L5c:
                java.lang.String r4 = ". URI: "
                java.lang.String r5 = "Item URI is not allowed. Item position: "
                if (r11 != 0) goto L85
                android.net.Uri r6 = r2.getUri()
                if (r6 == 0) goto Lb2
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                r6.append(r5)
                r6.append(r0)
                r6.append(r4)
                android.net.Uri r2 = r2.getUri()
                r6.append(r2)
                java.lang.String r2 = r6.toString()
                r12.accept(r2)
                goto Lb2
            L85:
                android.net.Uri r6 = r2.getUri()
                if (r6 == 0) goto Lb4
                android.net.Uri r6 = r2.getUri()
                boolean r6 = r11.test(r6)
                if (r6 == 0) goto L96
                goto Lb4
            L96:
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                r6.append(r5)
                r6.append(r0)
                r6.append(r4)
                android.net.Uri r2 = r2.getUri()
                r6.append(r2)
                java.lang.String r2 = r6.toString()
                r12.accept(r2)
            Lb2:
                r2 = r9
                goto Lb8
            Lb4:
                android.net.Uri r2 = r2.getUri()
            Lb8:
                if (r3 != 0) goto Lbc
                if (r2 == 0) goto Ld5
            Lbc:
                if (r1 != 0) goto Lcd
                android.content.ClipData r1 = new android.content.ClipData
                android.content.ClipDescription r4 = r7.getDescription()
                android.content.ClipData$Item r5 = new android.content.ClipData$Item
                r5.<init>(r3, r9, r2)
                r1.<init>(r4, r5)
                goto Ld5
            Lcd:
                android.content.ClipData$Item r4 = new android.content.ClipData$Item
                r4.<init>(r3, r9, r2)
                r1.addItem(r4)
            Ld5:
                int r0 = r0 + 1
                goto L17
            Ld9:
                if (r1 == 0) goto Lde
                r8.setClipData(r1)
            Lde:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.core.content.IntentSanitizer.C3944c.m57416b(android.content.Intent, android.content.Intent, androidx.core.util.Predicate, boolean, androidx.core.util.Predicate, androidx.core.util.Consumer):void");
        }
    }

    /* renamed from: androidx.core.content.IntentSanitizer$d */
    /* loaded from: classes2.dex */
    public static class C3946d {
        @DoNotInline
        /* renamed from: a */
        public static String m57414a(Intent intent) {
            return intent.getIdentifier();
        }

        @DoNotInline
        /* renamed from: b */
        public static Intent m57413b(Intent intent, String str) {
            return intent.setIdentifier(str);
        }
    }

    /* renamed from: a */
    public static /* synthetic */ void m57473a(String str) {
        m57455s(str);
    }

    /* renamed from: b */
    public static /* synthetic */ void m57472b(String str) {
        m57456r(str);
    }

    /* renamed from: r */
    public static /* synthetic */ void m57456r(String str) {
    }

    /* renamed from: s */
    public static /* synthetic */ void m57455s(String str) {
        throw new SecurityException(str);
    }

    @NonNull
    public Intent sanitize(@NonNull Intent intent, @NonNull Consumer<String> consumer) {
        Intent intent2 = new Intent();
        ComponentName component = intent.getComponent();
        if ((this.f33840h && component == null) || this.f33839g.test(component)) {
            intent2.setComponent(component);
        } else {
            consumer.accept("Component is not allowed: " + component);
            intent2.setComponent(new ComponentName("android", "java.lang.Void"));
        }
        String str = intent.getPackage();
        if (str != null && !this.f33838f.test(str)) {
            consumer.accept("Package is not allowed: " + str);
        } else {
            intent2.setPackage(str);
        }
        int flags = this.f33833a | intent.getFlags();
        int i = this.f33833a;
        if (flags == i) {
            intent2.setFlags(intent.getFlags());
        } else {
            intent2.setFlags(intent.getFlags() & i);
            consumer.accept("The intent contains flags that are not allowed: 0x" + Integer.toHexString(intent.getFlags() & (~this.f33833a)));
        }
        String action = intent.getAction();
        if (action != null && !this.f33834b.test(action)) {
            consumer.accept("Action is not allowed: " + action);
        } else {
            intent2.setAction(action);
        }
        Uri data = intent.getData();
        if (data != null && !this.f33835c.test(data)) {
            consumer.accept("Data is not allowed: " + data);
        } else {
            intent2.setData(data);
        }
        String type = intent.getType();
        if (type != null && !this.f33836d.test(type)) {
            consumer.accept("Type is not allowed: " + type);
        } else {
            intent2.setDataAndType(intent2.getData(), type);
        }
        Set<String> categories = intent.getCategories();
        if (categories != null) {
            for (String str2 : categories) {
                if (this.f33837e.test(str2)) {
                    intent2.addCategory(str2);
                } else {
                    consumer.accept("Category is not allowed: " + str2);
                }
            }
        }
        Bundle extras = intent.getExtras();
        if (extras != null) {
            for (String str3 : extras.keySet()) {
                if (str3.equals("android.intent.extra.STREAM") && (this.f33833a & 1) == 0) {
                    consumer.accept("Allowing Extra Stream requires also allowing at least  FLAG_GRANT_READ_URI_PERMISSION Flag.");
                } else if (str3.equals("output") && ((~this.f33833a) & 3) != 0) {
                    consumer.accept("Allowing Extra Output requires also allowing FLAG_GRANT_READ_URI_PERMISSION and FLAG_GRANT_WRITE_URI_PERMISSION Flags.");
                } else {
                    Object obj = extras.get(str3);
                    Predicate predicate = (Predicate) this.f33841i.get(str3);
                    if (predicate != null && predicate.test(obj)) {
                        m57454t(intent2, str3, obj);
                    } else {
                        consumer.accept("Extra is not allowed. Key: " + str3 + ". Value: " + obj);
                    }
                }
            }
        }
        int i2 = Build.VERSION.SDK_INT;
        C3944c.m57416b(intent, intent2, this.f33844l, this.f33842j, this.f33843k, consumer);
        if (i2 >= 29) {
            if (this.f33845m) {
                C3946d.m57413b(intent2, C3946d.m57414a(intent));
            } else if (C3946d.m57414a(intent) != null) {
                consumer.accept("Identifier is not allowed: " + C3946d.m57414a(intent));
            }
        }
        if (this.f33846n) {
            C3943b.m57418b(intent2, C3943b.m57419a(intent));
        } else if (C3943b.m57419a(intent) != null) {
            consumer.accept("Selector is not allowed: " + C3943b.m57419a(intent));
        }
        if (this.f33847o) {
            intent2.setSourceBounds(intent.getSourceBounds());
        } else if (intent.getSourceBounds() != null) {
            consumer.accept("SourceBounds is not allowed: " + intent.getSourceBounds());
        }
        return intent2;
    }

    @NonNull
    public Intent sanitizeByFiltering(@NonNull Intent intent) {
        return sanitize(intent, new Consumer() { // from class: wf0
            @Override // androidx.core.util.Consumer
            public final void accept(Object obj) {
                IntentSanitizer.m57472b((String) obj);
            }
        });
    }

    @NonNull
    public Intent sanitizeByThrowing(@NonNull Intent intent) {
        return sanitize(intent, new Consumer() { // from class: vf0
            @Override // androidx.core.util.Consumer
            public final void accept(Object obj) {
                IntentSanitizer.m57473a((String) obj);
            }
        });
    }

    /* renamed from: t */
    public final void m57454t(Intent intent, String str, Object obj) {
        if (obj == null) {
            intent.getExtras().putString(str, null);
        } else if (obj instanceof Parcelable) {
            intent.putExtra(str, (Parcelable) obj);
        } else if (obj instanceof Parcelable[]) {
            intent.putExtra(str, (Parcelable[]) obj);
        } else if (obj instanceof Serializable) {
            intent.putExtra(str, (Serializable) obj);
        } else {
            throw new IllegalArgumentException("Unsupported type " + obj.getClass());
        }
    }

    public IntentSanitizer() {
    }
}