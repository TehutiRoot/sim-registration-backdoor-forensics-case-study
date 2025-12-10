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
    public int f33745a;

    /* renamed from: b */
    public Predicate f33746b;

    /* renamed from: c */
    public Predicate f33747c;

    /* renamed from: d */
    public Predicate f33748d;

    /* renamed from: e */
    public Predicate f33749e;

    /* renamed from: f */
    public Predicate f33750f;

    /* renamed from: g */
    public Predicate f33751g;

    /* renamed from: h */
    public boolean f33752h;

    /* renamed from: i */
    public Map f33753i;

    /* renamed from: j */
    public boolean f33754j;

    /* renamed from: k */
    public Predicate f33755k;

    /* renamed from: l */
    public Predicate f33756l;

    /* renamed from: m */
    public boolean f33757m;

    /* renamed from: n */
    public boolean f33758n;

    /* renamed from: o */
    public boolean f33759o;

    /* loaded from: classes2.dex */
    public static final class Builder {

        /* renamed from: a */
        public int f33760a;

        /* renamed from: h */
        public boolean f33767h;

        /* renamed from: i */
        public boolean f33768i;

        /* renamed from: n */
        public boolean f33773n;

        /* renamed from: o */
        public boolean f33774o;

        /* renamed from: p */
        public boolean f33775p;

        /* renamed from: b */
        public Predicate f33761b = new Predicate() { // from class: Cf0
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
                boolean m57503A;
                m57503A = IntentSanitizer.Builder.m57503A((String) obj);
                return m57503A;
            }
        };

        /* renamed from: c */
        public Predicate f33762c = new Predicate() { // from class: Df0
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
                boolean m57502B;
                m57502B = IntentSanitizer.Builder.m57502B((Uri) obj);
                return m57502B;
            }
        };

        /* renamed from: d */
        public Predicate f33763d = new Predicate() { // from class: Ef0
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
                boolean m57501C;
                m57501C = IntentSanitizer.Builder.m57501C((String) obj);
                return m57501C;
            }
        };

        /* renamed from: e */
        public Predicate f33764e = new Predicate() { // from class: Ff0
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
                boolean m57500D;
                m57500D = IntentSanitizer.Builder.m57500D((String) obj);
                return m57500D;
            }
        };

        /* renamed from: f */
        public Predicate f33765f = new Predicate() { // from class: Gf0
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
                boolean m57499E;
                m57499E = IntentSanitizer.Builder.m57499E((String) obj);
                return m57499E;
            }
        };

        /* renamed from: g */
        public Predicate f33766g = new Predicate() { // from class: Hf0
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
                boolean m57498F;
                m57498F = IntentSanitizer.Builder.m57498F((ComponentName) obj);
                return m57498F;
            }
        };

        /* renamed from: j */
        public Map f33769j = new HashMap();

        /* renamed from: k */
        public boolean f33770k = false;

        /* renamed from: l */
        public Predicate f33771l = new Predicate() { // from class: If0
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
                boolean m57497G;
                m57497G = IntentSanitizer.Builder.m57497G((Uri) obj);
                return m57497G;
            }
        };

        /* renamed from: m */
        public Predicate f33772m = new Predicate() { // from class: Jf0
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
                boolean m57496H;
                m57496H = IntentSanitizer.Builder.m57496H((ClipData) obj);
                return m57496H;
            }
        };

        /* renamed from: A */
        public static /* synthetic */ boolean m57503A(String str) {
            return false;
        }

        /* renamed from: B */
        public static /* synthetic */ boolean m57502B(Uri uri) {
            return false;
        }

        /* renamed from: C */
        public static /* synthetic */ boolean m57501C(String str) {
            return false;
        }

        /* renamed from: D */
        public static /* synthetic */ boolean m57500D(String str) {
            return false;
        }

        /* renamed from: E */
        public static /* synthetic */ boolean m57499E(String str) {
            return false;
        }

        /* renamed from: F */
        public static /* synthetic */ boolean m57498F(ComponentName componentName) {
            return false;
        }

        /* renamed from: G */
        public static /* synthetic */ boolean m57497G(Uri uri) {
            return false;
        }

        /* renamed from: H */
        public static /* synthetic */ boolean m57496H(ClipData clipData) {
            return false;
        }

        /* renamed from: r */
        public static /* synthetic */ boolean m57478r(ComponentName componentName) {
            return true;
        }

        /* renamed from: s */
        public static /* synthetic */ boolean m57477s(String str, Uri uri) {
            return str.equals(uri.getAuthority());
        }

        /* renamed from: t */
        public static /* synthetic */ boolean m57476t(String str, ComponentName componentName) {
            return str.equals(componentName.getPackageName());
        }

        /* renamed from: u */
        public static /* synthetic */ boolean m57475u(String str, Uri uri) {
            return str.equals(uri.getAuthority());
        }

        /* renamed from: v */
        public static /* synthetic */ boolean m57474v(Object obj) {
            return true;
        }

        /* renamed from: w */
        public static /* synthetic */ boolean m57473w(Class cls, Predicate predicate, Object obj) {
            if (cls.isInstance(obj) && predicate.test(cls.cast(obj))) {
                return true;
            }
            return false;
        }

        /* renamed from: x */
        public static /* synthetic */ boolean m57472x(Object obj) {
            return false;
        }

        /* renamed from: y */
        public static /* synthetic */ boolean m57471y(String str, Uri uri) {
            return str.equals(uri.getAuthority());
        }

        /* renamed from: z */
        public static /* synthetic */ boolean m57470z(String str, Uri uri) {
            return str.equals(uri.getAuthority());
        }

        @NonNull
        @SuppressLint({"BuilderSetStyle"})
        public Builder allowAction(@NonNull String str) {
            Preconditions.checkNotNull(str);
            Objects.requireNonNull(str);
            allowAction(new C22308tf0(str));
            return this;
        }

        @NonNull
        @SuppressLint({"BuilderSetStyle"})
        public Builder allowAnyComponent() {
            this.f33767h = true;
            this.f33766g = new Predicate() { // from class: yf0
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
                    boolean m57478r;
                    m57478r = IntentSanitizer.Builder.m57478r((ComponentName) obj);
                    return m57478r;
                }
            };
            return this;
        }

        @NonNull
        @SuppressLint({"BuilderSetStyle"})
        public Builder allowCategory(@NonNull String str) {
            Preconditions.checkNotNull(str);
            Objects.requireNonNull(str);
            return allowCategory(new C22308tf0(str));
        }

        @NonNull
        @SuppressLint({"BuilderSetStyle"})
        public Builder allowClipData(@NonNull Predicate<ClipData> predicate) {
            Preconditions.checkNotNull(predicate);
            this.f33772m = this.f33772m.mo62or(predicate);
            return this;
        }

        @NonNull
        @SuppressLint({"BuilderSetStyle"})
        public Builder allowClipDataText() {
            this.f33770k = true;
            return this;
        }

        @NonNull
        @SuppressLint({"BuilderSetStyle"})
        public Builder allowClipDataUri(@NonNull Predicate<Uri> predicate) {
            Preconditions.checkNotNull(predicate);
            this.f33771l = this.f33771l.mo62or(predicate);
            return this;
        }

        @NonNull
        @SuppressLint({"BuilderSetStyle"})
        public Builder allowClipDataUriWithAuthority(@NonNull final String str) {
            Preconditions.checkNotNull(str);
            return allowClipDataUri(new Predicate() { // from class: zf0
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
                    boolean m57477s;
                    m57477s = IntentSanitizer.Builder.m57477s(str, (Uri) obj);
                    return m57477s;
                }
            });
        }

        @NonNull
        @SuppressLint({"BuilderSetStyle"})
        public Builder allowComponent(@NonNull final ComponentName componentName) {
            Preconditions.checkNotNull(componentName);
            Objects.requireNonNull(componentName);
            return allowComponent(new Predicate() { // from class: xf0
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
                    return componentName.equals((ComponentName) obj);
                }
            });
        }

        @NonNull
        @SuppressLint({"BuilderSetStyle"})
        public Builder allowComponentWithPackage(@NonNull final String str) {
            Preconditions.checkNotNull(str);
            return allowComponent(new Predicate() { // from class: uf0
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
                    boolean m57476t;
                    m57476t = IntentSanitizer.Builder.m57476t(str, (ComponentName) obj);
                    return m57476t;
                }
            });
        }

        @NonNull
        @SuppressLint({"BuilderSetStyle"})
        public Builder allowData(@NonNull Predicate<Uri> predicate) {
            Preconditions.checkNotNull(predicate);
            this.f33762c = this.f33762c.mo62or(predicate);
            return this;
        }

        @NonNull
        @SuppressLint({"BuilderSetStyle"})
        public Builder allowDataWithAuthority(@NonNull final String str) {
            Preconditions.checkNotNull(str);
            allowData(new Predicate() { // from class: vf0
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
                    boolean m57475u;
                    m57475u = IntentSanitizer.Builder.m57475u(str, (Uri) obj);
                    return m57475u;
                }
            });
            return this;
        }

        @NonNull
        @SuppressLint({"BuilderSetStyle"})
        public Builder allowExtra(@NonNull String str, @NonNull Class<?> cls) {
            return allowExtra(str, cls, new Predicate() { // from class: Kf0
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
                    boolean m57474v;
                    m57474v = IntentSanitizer.Builder.m57474v(obj);
                    return m57474v;
                }
            });
        }

        @NonNull
        @SuppressLint({"BuilderSetStyle"})
        public Builder allowExtraOutput(@NonNull final String str) {
            allowExtra("output", Uri.class, new Predicate() { // from class: sf0
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
                    boolean m57471y;
                    m57471y = IntentSanitizer.Builder.m57471y(str, (Uri) obj);
                    return m57471y;
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
            allowExtra("android.intent.extra.STREAM", Uri.class, new Predicate() { // from class: Bf0
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
                    boolean m57470z;
                    m57470z = IntentSanitizer.Builder.m57470z(str, (Uri) obj);
                    return m57470z;
                }
            });
            return this;
        }

        @NonNull
        @SuppressLint({"BuilderSetStyle"})
        public Builder allowFlags(int i) {
            this.f33760a = i | this.f33760a;
            return this;
        }

        @NonNull
        @SuppressLint({"BuilderSetStyle"})
        public Builder allowHistoryStackFlags() {
            this.f33760a |= 2112614400;
            return this;
        }

        @NonNull
        @SuppressLint({"BuilderSetStyle"})
        public Builder allowIdentifier() {
            this.f33773n = true;
            return this;
        }

        @NonNull
        @SuppressLint({"BuilderSetStyle"})
        public Builder allowPackage(@NonNull String str) {
            Preconditions.checkNotNull(str);
            Objects.requireNonNull(str);
            return allowPackage(new C22308tf0(str));
        }

        @NonNull
        @SuppressLint({"BuilderSetStyle"})
        public Builder allowReceiverFlags() {
            this.f33760a |= 2015363072;
            return this;
        }

        @NonNull
        @SuppressLint({"BuilderSetStyle"})
        public Builder allowSelector() {
            this.f33774o = true;
            return this;
        }

        @NonNull
        @SuppressLint({"BuilderSetStyle"})
        public Builder allowSourceBounds() {
            this.f33775p = true;
            return this;
        }

        @NonNull
        @SuppressLint({"BuilderSetStyle"})
        public Builder allowType(@NonNull String str) {
            Preconditions.checkNotNull(str);
            Objects.requireNonNull(str);
            return allowType(new C22308tf0(str));
        }

        @NonNull
        @SuppressLint({"SyntheticAccessor"})
        public IntentSanitizer build() {
            boolean z = this.f33767h;
            if ((z && this.f33768i) || (!z && !this.f33768i)) {
                throw new SecurityException("You must call either allowAnyComponent or one or more of the allowComponent methods; but not both.");
            }
            IntentSanitizer intentSanitizer = new IntentSanitizer();
            intentSanitizer.f33745a = this.f33760a;
            intentSanitizer.f33746b = this.f33761b;
            intentSanitizer.f33747c = this.f33762c;
            intentSanitizer.f33748d = this.f33763d;
            intentSanitizer.f33749e = this.f33764e;
            intentSanitizer.f33750f = this.f33765f;
            intentSanitizer.f33752h = this.f33767h;
            intentSanitizer.f33751g = this.f33766g;
            intentSanitizer.f33753i = this.f33769j;
            intentSanitizer.f33754j = this.f33770k;
            intentSanitizer.f33755k = this.f33771l;
            intentSanitizer.f33756l = this.f33772m;
            intentSanitizer.f33757m = this.f33773n;
            intentSanitizer.f33758n = this.f33774o;
            intentSanitizer.f33759o = this.f33775p;
            return intentSanitizer;
        }

        @NonNull
        @SuppressLint({"BuilderSetStyle"})
        public <T> Builder allowExtra(@NonNull String str, @NonNull final Class<T> cls, @NonNull final Predicate<T> predicate) {
            Preconditions.checkNotNull(str);
            Preconditions.checkNotNull(cls);
            Preconditions.checkNotNull(predicate);
            return allowExtra(str, new Predicate() { // from class: wf0
                @Override // androidx.core.util.Predicate
                public /* synthetic */ Predicate and(Predicate predicate2) {
                    return AbstractC20438im1.m30576a(this, predicate2);
                }

                @Override // androidx.core.util.Predicate
                public /* synthetic */ Predicate negate() {
                    return AbstractC20438im1.m30575b(this);
                }

                @Override // androidx.core.util.Predicate
                /* renamed from: or */
                public /* synthetic */ Predicate mo62or(Predicate predicate2) {
                    return AbstractC20438im1.m30574c(this, predicate2);
                }

                @Override // androidx.core.util.Predicate
                public final boolean test(Object obj) {
                    boolean m57473w;
                    m57473w = IntentSanitizer.Builder.m57473w(cls, predicate, obj);
                    return m57473w;
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
            this.f33761b = this.f33761b.mo62or(predicate);
            return this;
        }

        @NonNull
        @SuppressLint({"BuilderSetStyle"})
        public Builder allowCategory(@NonNull Predicate<String> predicate) {
            Preconditions.checkNotNull(predicate);
            this.f33764e = this.f33764e.mo62or(predicate);
            return this;
        }

        @NonNull
        @SuppressLint({"BuilderSetStyle"})
        public Builder allowComponent(@NonNull Predicate<ComponentName> predicate) {
            Preconditions.checkNotNull(predicate);
            this.f33768i = true;
            this.f33766g = this.f33766g.mo62or(predicate);
            return this;
        }

        @NonNull
        @SuppressLint({"BuilderSetStyle"})
        public Builder allowPackage(@NonNull Predicate<String> predicate) {
            Preconditions.checkNotNull(predicate);
            this.f33765f = this.f33765f.mo62or(predicate);
            return this;
        }

        @NonNull
        @SuppressLint({"BuilderSetStyle"})
        public Builder allowType(@NonNull Predicate<String> predicate) {
            Preconditions.checkNotNull(predicate);
            this.f33763d = this.f33763d.mo62or(predicate);
            return this;
        }

        @NonNull
        @SuppressLint({"BuilderSetStyle"})
        public Builder allowExtra(@NonNull String str, @NonNull Predicate<Object> predicate) {
            Preconditions.checkNotNull(str);
            Preconditions.checkNotNull(predicate);
            Predicate predicate2 = (Predicate) this.f33769j.get(str);
            if (predicate2 == null) {
                predicate2 = new Predicate() { // from class: Af0
                    @Override // androidx.core.util.Predicate
                    public /* synthetic */ Predicate and(Predicate predicate3) {
                        return AbstractC20438im1.m30576a(this, predicate3);
                    }

                    @Override // androidx.core.util.Predicate
                    public /* synthetic */ Predicate negate() {
                        return AbstractC20438im1.m30575b(this);
                    }

                    @Override // androidx.core.util.Predicate
                    /* renamed from: or */
                    public /* synthetic */ Predicate mo62or(Predicate predicate3) {
                        return AbstractC20438im1.m30574c(this, predicate3);
                    }

                    @Override // androidx.core.util.Predicate
                    public final boolean test(Object obj) {
                        boolean m57472x;
                        m57472x = IntentSanitizer.Builder.m57472x(obj);
                        return m57472x;
                    }
                };
            }
            this.f33769j.put(str, predicate2.mo62or(predicate));
            return this;
        }
    }

    /* renamed from: androidx.core.content.IntentSanitizer$b */
    /* loaded from: classes2.dex */
    public static class C3961b {
        @DoNotInline
        /* renamed from: a */
        public static Intent m57469a(Intent intent) {
            return intent.getSelector();
        }

        @DoNotInline
        /* renamed from: b */
        public static void m57468b(Intent intent, Intent intent2) {
            intent.setSelector(intent2);
        }
    }

    /* renamed from: androidx.core.content.IntentSanitizer$c */
    /* loaded from: classes2.dex */
    public static class C3962c {

        /* renamed from: androidx.core.content.IntentSanitizer$c$a */
        /* loaded from: classes2.dex */
        public static class C3963a {
            @DoNotInline
            /* renamed from: a */
            public static void m57465a(int i, ClipData.Item item, Consumer<String> consumer) {
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
        public static void m57467a(int i, ClipData.Item item, Consumer consumer) {
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
        public static void m57466b(@androidx.annotation.NonNull android.content.Intent r7, android.content.Intent r8, androidx.core.util.Predicate<android.content.ClipData> r9, boolean r10, androidx.core.util.Predicate<android.net.Uri> r11, androidx.core.util.Consumer<java.lang.String> r12) {
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
                androidx.core.content.IntentSanitizer.C3962c.C3963a.m57465a(r0, r2, r12)
                goto L2e
            L2b:
                m57467a(r0, r2, r12)
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
            throw new UnsupportedOperationException("Method not decompiled: androidx.core.content.IntentSanitizer.C3962c.m57466b(android.content.Intent, android.content.Intent, androidx.core.util.Predicate, boolean, androidx.core.util.Predicate, androidx.core.util.Consumer):void");
        }
    }

    /* renamed from: androidx.core.content.IntentSanitizer$d */
    /* loaded from: classes2.dex */
    public static class C3964d {
        @DoNotInline
        /* renamed from: a */
        public static String m57464a(Intent intent) {
            return intent.getIdentifier();
        }

        @DoNotInline
        /* renamed from: b */
        public static Intent m57463b(Intent intent, String str) {
            return intent.setIdentifier(str);
        }
    }

    /* renamed from: a */
    public static /* synthetic */ void m57523a(String str) {
        m57505s(str);
    }

    /* renamed from: b */
    public static /* synthetic */ void m57522b(String str) {
        m57506r(str);
    }

    /* renamed from: r */
    public static /* synthetic */ void m57506r(String str) {
    }

    /* renamed from: s */
    public static /* synthetic */ void m57505s(String str) {
        throw new SecurityException(str);
    }

    @NonNull
    public Intent sanitize(@NonNull Intent intent, @NonNull Consumer<String> consumer) {
        Intent intent2 = new Intent();
        ComponentName component = intent.getComponent();
        if ((this.f33752h && component == null) || this.f33751g.test(component)) {
            intent2.setComponent(component);
        } else {
            consumer.accept("Component is not allowed: " + component);
            intent2.setComponent(new ComponentName("android", "java.lang.Void"));
        }
        String str = intent.getPackage();
        if (str != null && !this.f33750f.test(str)) {
            consumer.accept("Package is not allowed: " + str);
        } else {
            intent2.setPackage(str);
        }
        int flags = this.f33745a | intent.getFlags();
        int i = this.f33745a;
        if (flags == i) {
            intent2.setFlags(intent.getFlags());
        } else {
            intent2.setFlags(intent.getFlags() & i);
            consumer.accept("The intent contains flags that are not allowed: 0x" + Integer.toHexString(intent.getFlags() & (~this.f33745a)));
        }
        String action = intent.getAction();
        if (action != null && !this.f33746b.test(action)) {
            consumer.accept("Action is not allowed: " + action);
        } else {
            intent2.setAction(action);
        }
        Uri data = intent.getData();
        if (data != null && !this.f33747c.test(data)) {
            consumer.accept("Data is not allowed: " + data);
        } else {
            intent2.setData(data);
        }
        String type = intent.getType();
        if (type != null && !this.f33748d.test(type)) {
            consumer.accept("Type is not allowed: " + type);
        } else {
            intent2.setDataAndType(intent2.getData(), type);
        }
        Set<String> categories = intent.getCategories();
        if (categories != null) {
            for (String str2 : categories) {
                if (this.f33749e.test(str2)) {
                    intent2.addCategory(str2);
                } else {
                    consumer.accept("Category is not allowed: " + str2);
                }
            }
        }
        Bundle extras = intent.getExtras();
        if (extras != null) {
            for (String str3 : extras.keySet()) {
                if (str3.equals("android.intent.extra.STREAM") && (this.f33745a & 1) == 0) {
                    consumer.accept("Allowing Extra Stream requires also allowing at least  FLAG_GRANT_READ_URI_PERMISSION Flag.");
                } else if (str3.equals("output") && ((~this.f33745a) & 3) != 0) {
                    consumer.accept("Allowing Extra Output requires also allowing FLAG_GRANT_READ_URI_PERMISSION and FLAG_GRANT_WRITE_URI_PERMISSION Flags.");
                } else {
                    Object obj = extras.get(str3);
                    Predicate predicate = (Predicate) this.f33753i.get(str3);
                    if (predicate != null && predicate.test(obj)) {
                        m57504t(intent2, str3, obj);
                    } else {
                        consumer.accept("Extra is not allowed. Key: " + str3 + ". Value: " + obj);
                    }
                }
            }
        }
        int i2 = Build.VERSION.SDK_INT;
        C3962c.m57466b(intent, intent2, this.f33756l, this.f33754j, this.f33755k, consumer);
        if (i2 >= 29) {
            if (this.f33757m) {
                C3964d.m57463b(intent2, C3964d.m57464a(intent));
            } else if (C3964d.m57464a(intent) != null) {
                consumer.accept("Identifier is not allowed: " + C3964d.m57464a(intent));
            }
        }
        if (this.f33758n) {
            C3961b.m57468b(intent2, C3961b.m57469a(intent));
        } else if (C3961b.m57469a(intent) != null) {
            consumer.accept("Selector is not allowed: " + C3961b.m57469a(intent));
        }
        if (this.f33759o) {
            intent2.setSourceBounds(intent.getSourceBounds());
        } else if (intent.getSourceBounds() != null) {
            consumer.accept("SourceBounds is not allowed: " + intent.getSourceBounds());
        }
        return intent2;
    }

    @NonNull
    public Intent sanitizeByFiltering(@NonNull Intent intent) {
        return sanitize(intent, new Consumer() { // from class: qf0
            @Override // androidx.core.util.Consumer
            public final void accept(Object obj) {
                IntentSanitizer.m57522b((String) obj);
            }
        });
    }

    @NonNull
    public Intent sanitizeByThrowing(@NonNull Intent intent) {
        return sanitize(intent, new Consumer() { // from class: pf0
            @Override // androidx.core.util.Consumer
            public final void accept(Object obj) {
                IntentSanitizer.m57523a((String) obj);
            }
        });
    }

    /* renamed from: t */
    public final void m57504t(Intent intent, String str, Object obj) {
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
