package androidx.core.content.p004pm;

import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.LocusId;
import android.content.pm.PackageManager;
import android.content.pm.ShortcutInfo;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.os.UserHandle;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.core.app.Person;
import androidx.core.content.LocusIdCompat;
import androidx.core.graphics.drawable.IconCompat;
import androidx.core.net.UriCompat;
import androidx.core.util.Preconditions;
import com.google.firebase.sessions.settings.RemoteSettings;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: androidx.core.content.pm.ShortcutInfoCompat */
/* loaded from: classes2.dex */
public class ShortcutInfoCompat {
    public static final int SURFACE_LAUNCHER = 1;

    /* renamed from: A */
    public int f33783A;

    /* renamed from: B */
    public int f33784B;

    /* renamed from: a */
    public Context f33785a;

    /* renamed from: b */
    public String f33786b;

    /* renamed from: c */
    public String f33787c;

    /* renamed from: d */
    public Intent[] f33788d;

    /* renamed from: e */
    public ComponentName f33789e;

    /* renamed from: f */
    public CharSequence f33790f;

    /* renamed from: g */
    public CharSequence f33791g;

    /* renamed from: h */
    public CharSequence f33792h;

    /* renamed from: i */
    public IconCompat f33793i;

    /* renamed from: j */
    public boolean f33794j;

    /* renamed from: k */
    public Person[] f33795k;

    /* renamed from: l */
    public Set f33796l;

    /* renamed from: m */
    public LocusIdCompat f33797m;

    /* renamed from: n */
    public boolean f33798n;

    /* renamed from: o */
    public int f33799o;

    /* renamed from: p */
    public PersistableBundle f33800p;

    /* renamed from: q */
    public Bundle f33801q;

    /* renamed from: r */
    public long f33802r;

    /* renamed from: s */
    public UserHandle f33803s;

    /* renamed from: t */
    public boolean f33804t;

    /* renamed from: u */
    public boolean f33805u;

    /* renamed from: v */
    public boolean f33806v;

    /* renamed from: w */
    public boolean f33807w;

    /* renamed from: x */
    public boolean f33808x;

    /* renamed from: y */
    public boolean f33809y = true;

    /* renamed from: z */
    public boolean f33810z;

    /* renamed from: androidx.core.content.pm.ShortcutInfoCompat$Builder */
    /* loaded from: classes2.dex */
    public static class Builder {

        /* renamed from: a */
        public final ShortcutInfoCompat f33811a;

        /* renamed from: b */
        public boolean f33812b;

        /* renamed from: c */
        public Set f33813c;

        /* renamed from: d */
        public Map f33814d;

        /* renamed from: e */
        public Uri f33815e;

        public Builder(@NonNull Context context, @NonNull String str) {
            ShortcutInfoCompat shortcutInfoCompat = new ShortcutInfoCompat();
            this.f33811a = shortcutInfoCompat;
            shortcutInfoCompat.f33785a = context;
            shortcutInfoCompat.f33786b = str;
        }

        @NonNull
        @SuppressLint({"MissingGetterMatchingBuilder"})
        public Builder addCapabilityBinding(@NonNull String str) {
            if (this.f33813c == null) {
                this.f33813c = new HashSet();
            }
            this.f33813c.add(str);
            return this;
        }

        @NonNull
        public ShortcutInfoCompat build() {
            String[] strArr;
            if (!TextUtils.isEmpty(this.f33811a.f33790f)) {
                ShortcutInfoCompat shortcutInfoCompat = this.f33811a;
                Intent[] intentArr = shortcutInfoCompat.f33788d;
                if (intentArr != null && intentArr.length != 0) {
                    if (this.f33812b) {
                        if (shortcutInfoCompat.f33797m == null) {
                            shortcutInfoCompat.f33797m = new LocusIdCompat(shortcutInfoCompat.f33786b);
                        }
                        this.f33811a.f33798n = true;
                    }
                    if (this.f33813c != null) {
                        ShortcutInfoCompat shortcutInfoCompat2 = this.f33811a;
                        if (shortcutInfoCompat2.f33796l == null) {
                            shortcutInfoCompat2.f33796l = new HashSet();
                        }
                        this.f33811a.f33796l.addAll(this.f33813c);
                    }
                    if (this.f33814d != null) {
                        ShortcutInfoCompat shortcutInfoCompat3 = this.f33811a;
                        if (shortcutInfoCompat3.f33800p == null) {
                            shortcutInfoCompat3.f33800p = new PersistableBundle();
                        }
                        for (String str : this.f33814d.keySet()) {
                            Map map = (Map) this.f33814d.get(str);
                            this.f33811a.f33800p.putStringArray(str, (String[]) map.keySet().toArray(new String[0]));
                            for (String str2 : map.keySet()) {
                                List list = (List) map.get(str2);
                                PersistableBundle persistableBundle = this.f33811a.f33800p;
                                String str3 = str + RemoteSettings.FORWARD_SLASH_STRING + str2;
                                if (list == null) {
                                    strArr = new String[0];
                                } else {
                                    strArr = (String[]) list.toArray(new String[0]);
                                }
                                persistableBundle.putStringArray(str3, strArr);
                            }
                        }
                    }
                    if (this.f33815e != null) {
                        ShortcutInfoCompat shortcutInfoCompat4 = this.f33811a;
                        if (shortcutInfoCompat4.f33800p == null) {
                            shortcutInfoCompat4.f33800p = new PersistableBundle();
                        }
                        this.f33811a.f33800p.putString("extraSliceUri", UriCompat.toSafeString(this.f33815e));
                    }
                    return this.f33811a;
                }
                throw new IllegalArgumentException("Shortcut must have an intent");
            }
            throw new IllegalArgumentException("Shortcut must have a non-empty label");
        }

        @NonNull
        public Builder setActivity(@NonNull ComponentName componentName) {
            this.f33811a.f33789e = componentName;
            return this;
        }

        @NonNull
        public Builder setAlwaysBadged() {
            this.f33811a.f33794j = true;
            return this;
        }

        @NonNull
        public Builder setCategories(@NonNull Set<String> set) {
            this.f33811a.f33796l = set;
            return this;
        }

        @NonNull
        public Builder setDisabledMessage(@NonNull CharSequence charSequence) {
            this.f33811a.f33792h = charSequence;
            return this;
        }

        @NonNull
        public Builder setExcludedFromSurfaces(int i) {
            this.f33811a.f33784B = i;
            return this;
        }

        @NonNull
        public Builder setExtras(@NonNull PersistableBundle persistableBundle) {
            this.f33811a.f33800p = persistableBundle;
            return this;
        }

        @NonNull
        public Builder setIcon(IconCompat iconCompat) {
            this.f33811a.f33793i = iconCompat;
            return this;
        }

        @NonNull
        public Builder setIntent(@NonNull Intent intent) {
            return setIntents(new Intent[]{intent});
        }

        @NonNull
        public Builder setIntents(@NonNull Intent[] intentArr) {
            this.f33811a.f33788d = intentArr;
            return this;
        }

        @NonNull
        public Builder setIsConversation() {
            this.f33812b = true;
            return this;
        }

        @NonNull
        public Builder setLocusId(@Nullable LocusIdCompat locusIdCompat) {
            this.f33811a.f33797m = locusIdCompat;
            return this;
        }

        @NonNull
        public Builder setLongLabel(@NonNull CharSequence charSequence) {
            this.f33811a.f33791g = charSequence;
            return this;
        }

        @NonNull
        @Deprecated
        public Builder setLongLived() {
            this.f33811a.f33798n = true;
            return this;
        }

        @NonNull
        public Builder setPerson(@NonNull Person person) {
            return setPersons(new Person[]{person});
        }

        @NonNull
        public Builder setPersons(@NonNull Person[] personArr) {
            this.f33811a.f33795k = personArr;
            return this;
        }

        @NonNull
        public Builder setRank(int i) {
            this.f33811a.f33799o = i;
            return this;
        }

        @NonNull
        public Builder setShortLabel(@NonNull CharSequence charSequence) {
            this.f33811a.f33790f = charSequence;
            return this;
        }

        @NonNull
        @SuppressLint({"MissingGetterMatchingBuilder"})
        public Builder setSliceUri(@NonNull Uri uri) {
            this.f33815e = uri;
            return this;
        }

        @NonNull
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public Builder setTransientExtras(@NonNull Bundle bundle) {
            this.f33811a.f33801q = (Bundle) Preconditions.checkNotNull(bundle);
            return this;
        }

        @NonNull
        public Builder setLongLived(boolean z) {
            this.f33811a.f33798n = z;
            return this;
        }

        @NonNull
        @SuppressLint({"MissingGetterMatchingBuilder"})
        public Builder addCapabilityBinding(@NonNull String str, @NonNull String str2, @NonNull List<String> list) {
            addCapabilityBinding(str);
            if (!list.isEmpty()) {
                if (this.f33814d == null) {
                    this.f33814d = new HashMap();
                }
                if (this.f33814d.get(str) == null) {
                    this.f33814d.put(str, new HashMap());
                }
                ((Map) this.f33814d.get(str)).put(str2, list);
            }
            return this;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public Builder(@NonNull ShortcutInfoCompat shortcutInfoCompat) {
            ShortcutInfoCompat shortcutInfoCompat2 = new ShortcutInfoCompat();
            this.f33811a = shortcutInfoCompat2;
            shortcutInfoCompat2.f33785a = shortcutInfoCompat.f33785a;
            shortcutInfoCompat2.f33786b = shortcutInfoCompat.f33786b;
            shortcutInfoCompat2.f33787c = shortcutInfoCompat.f33787c;
            Intent[] intentArr = shortcutInfoCompat.f33788d;
            shortcutInfoCompat2.f33788d = (Intent[]) Arrays.copyOf(intentArr, intentArr.length);
            shortcutInfoCompat2.f33789e = shortcutInfoCompat.f33789e;
            shortcutInfoCompat2.f33790f = shortcutInfoCompat.f33790f;
            shortcutInfoCompat2.f33791g = shortcutInfoCompat.f33791g;
            shortcutInfoCompat2.f33792h = shortcutInfoCompat.f33792h;
            shortcutInfoCompat2.f33783A = shortcutInfoCompat.f33783A;
            shortcutInfoCompat2.f33793i = shortcutInfoCompat.f33793i;
            shortcutInfoCompat2.f33794j = shortcutInfoCompat.f33794j;
            shortcutInfoCompat2.f33803s = shortcutInfoCompat.f33803s;
            shortcutInfoCompat2.f33802r = shortcutInfoCompat.f33802r;
            shortcutInfoCompat2.f33804t = shortcutInfoCompat.f33804t;
            shortcutInfoCompat2.f33805u = shortcutInfoCompat.f33805u;
            shortcutInfoCompat2.f33806v = shortcutInfoCompat.f33806v;
            shortcutInfoCompat2.f33807w = shortcutInfoCompat.f33807w;
            shortcutInfoCompat2.f33808x = shortcutInfoCompat.f33808x;
            shortcutInfoCompat2.f33809y = shortcutInfoCompat.f33809y;
            shortcutInfoCompat2.f33797m = shortcutInfoCompat.f33797m;
            shortcutInfoCompat2.f33798n = shortcutInfoCompat.f33798n;
            shortcutInfoCompat2.f33810z = shortcutInfoCompat.f33810z;
            shortcutInfoCompat2.f33799o = shortcutInfoCompat.f33799o;
            Person[] personArr = shortcutInfoCompat.f33795k;
            if (personArr != null) {
                shortcutInfoCompat2.f33795k = (Person[]) Arrays.copyOf(personArr, personArr.length);
            }
            if (shortcutInfoCompat.f33796l != null) {
                shortcutInfoCompat2.f33796l = new HashSet(shortcutInfoCompat.f33796l);
            }
            PersistableBundle persistableBundle = shortcutInfoCompat.f33800p;
            if (persistableBundle != null) {
                shortcutInfoCompat2.f33800p = persistableBundle;
            }
            shortcutInfoCompat2.f33784B = shortcutInfoCompat.f33784B;
        }

        @RequiresApi(25)
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public Builder(@NonNull Context context, @NonNull ShortcutInfo shortcutInfo) {
            String id2;
            String str;
            Intent[] intents;
            ComponentName activity;
            CharSequence shortLabel;
            CharSequence longLabel;
            CharSequence disabledMessage;
            boolean isEnabled;
            Set categories;
            PersistableBundle extras;
            UserHandle userHandle;
            long lastChangedTimestamp;
            boolean isDynamic;
            boolean isPinned;
            boolean isDeclaredInManifest;
            boolean isImmutable;
            boolean isEnabled2;
            boolean hasKeyFieldsOnly;
            int rank;
            PersistableBundle extras2;
            boolean isCached;
            int disabledReason;
            ShortcutInfoCompat shortcutInfoCompat = new ShortcutInfoCompat();
            this.f33811a = shortcutInfoCompat;
            shortcutInfoCompat.f33785a = context;
            id2 = shortcutInfo.getId();
            shortcutInfoCompat.f33786b = id2;
            str = shortcutInfo.getPackage();
            shortcutInfoCompat.f33787c = str;
            intents = shortcutInfo.getIntents();
            shortcutInfoCompat.f33788d = (Intent[]) Arrays.copyOf(intents, intents.length);
            activity = shortcutInfo.getActivity();
            shortcutInfoCompat.f33789e = activity;
            shortLabel = shortcutInfo.getShortLabel();
            shortcutInfoCompat.f33790f = shortLabel;
            longLabel = shortcutInfo.getLongLabel();
            shortcutInfoCompat.f33791g = longLabel;
            disabledMessage = shortcutInfo.getDisabledMessage();
            shortcutInfoCompat.f33792h = disabledMessage;
            int i = Build.VERSION.SDK_INT;
            if (i >= 28) {
                disabledReason = shortcutInfo.getDisabledReason();
                shortcutInfoCompat.f33783A = disabledReason;
            } else {
                isEnabled = shortcutInfo.isEnabled();
                shortcutInfoCompat.f33783A = isEnabled ? 0 : 3;
            }
            categories = shortcutInfo.getCategories();
            shortcutInfoCompat.f33796l = categories;
            extras = shortcutInfo.getExtras();
            shortcutInfoCompat.f33795k = ShortcutInfoCompat.m57440f(extras);
            userHandle = shortcutInfo.getUserHandle();
            shortcutInfoCompat.f33803s = userHandle;
            lastChangedTimestamp = shortcutInfo.getLastChangedTimestamp();
            shortcutInfoCompat.f33802r = lastChangedTimestamp;
            if (i >= 30) {
                isCached = shortcutInfo.isCached();
                shortcutInfoCompat.f33804t = isCached;
            }
            isDynamic = shortcutInfo.isDynamic();
            shortcutInfoCompat.f33805u = isDynamic;
            isPinned = shortcutInfo.isPinned();
            shortcutInfoCompat.f33806v = isPinned;
            isDeclaredInManifest = shortcutInfo.isDeclaredInManifest();
            shortcutInfoCompat.f33807w = isDeclaredInManifest;
            isImmutable = shortcutInfo.isImmutable();
            shortcutInfoCompat.f33808x = isImmutable;
            isEnabled2 = shortcutInfo.isEnabled();
            shortcutInfoCompat.f33809y = isEnabled2;
            hasKeyFieldsOnly = shortcutInfo.hasKeyFieldsOnly();
            shortcutInfoCompat.f33810z = hasKeyFieldsOnly;
            shortcutInfoCompat.f33797m = ShortcutInfoCompat.m57442d(shortcutInfo);
            rank = shortcutInfo.getRank();
            shortcutInfoCompat.f33799o = rank;
            extras2 = shortcutInfo.getExtras();
            shortcutInfoCompat.f33800p = extras2;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* renamed from: androidx.core.content.pm.ShortcutInfoCompat$Surface */
    /* loaded from: classes2.dex */
    public @interface Surface {
    }

    /* renamed from: androidx.core.content.pm.ShortcutInfoCompat$a */
    /* loaded from: classes2.dex */
    public static class C3971a {
        /* renamed from: a */
        public static void m57439a(ShortcutInfo.Builder builder, int i) {
            builder.setExcludedFromSurfaces(i);
        }
    }

    /* renamed from: c */
    public static List m57443c(Context context, List list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (Object obj : list) {
            arrayList.add(new Builder(context, DH1.m68669a(obj)).build());
        }
        return arrayList;
    }

    /* renamed from: d */
    public static LocusIdCompat m57442d(ShortcutInfo shortcutInfo) {
        PersistableBundle extras;
        LocusId locusId;
        LocusId locusId2;
        if (Build.VERSION.SDK_INT >= 29) {
            locusId = shortcutInfo.getLocusId();
            if (locusId != null) {
                locusId2 = shortcutInfo.getLocusId();
                return LocusIdCompat.toLocusIdCompat(locusId2);
            }
            return null;
        }
        extras = shortcutInfo.getExtras();
        return m57441e(extras);
    }

    /* renamed from: e */
    public static LocusIdCompat m57441e(PersistableBundle persistableBundle) {
        String string;
        if (persistableBundle == null || (string = persistableBundle.getString("extraLocusId")) == null) {
            return null;
        }
        return new LocusIdCompat(string);
    }

    /* renamed from: f */
    public static Person[] m57440f(PersistableBundle persistableBundle) {
        if (persistableBundle != null && persistableBundle.containsKey("extraPersonCount")) {
            int i = persistableBundle.getInt("extraPersonCount");
            Person[] personArr = new Person[i];
            int i2 = 0;
            while (i2 < i) {
                StringBuilder sb = new StringBuilder();
                sb.append("extraPerson_");
                int i3 = i2 + 1;
                sb.append(i3);
                personArr[i2] = Person.fromPersistableBundle(persistableBundle.getPersistableBundle(sb.toString()));
                i2 = i3;
            }
            return personArr;
        }
        return null;
    }

    /* renamed from: a */
    public Intent m57445a(Intent intent) {
        Intent[] intentArr = this.f33788d;
        intent.putExtra("android.intent.extra.shortcut.INTENT", intentArr[intentArr.length - 1]).putExtra("android.intent.extra.shortcut.NAME", this.f33790f.toString());
        if (this.f33793i != null) {
            Drawable drawable = null;
            if (this.f33794j) {
                PackageManager packageManager = this.f33785a.getPackageManager();
                ComponentName componentName = this.f33789e;
                if (componentName != null) {
                    try {
                        drawable = packageManager.getActivityIcon(componentName);
                    } catch (PackageManager.NameNotFoundException unused) {
                    }
                }
                if (drawable == null) {
                    drawable = this.f33785a.getApplicationInfo().loadIcon(packageManager);
                }
            }
            this.f33793i.addToShortcutIntent(intent, drawable, this.f33785a);
        }
        return intent;
    }

    /* renamed from: b */
    public final PersistableBundle m57444b() {
        if (this.f33800p == null) {
            this.f33800p = new PersistableBundle();
        }
        Person[] personArr = this.f33795k;
        if (personArr != null && personArr.length > 0) {
            this.f33800p.putInt("extraPersonCount", personArr.length);
            int i = 0;
            while (i < this.f33795k.length) {
                PersistableBundle persistableBundle = this.f33800p;
                StringBuilder sb = new StringBuilder();
                sb.append("extraPerson_");
                int i2 = i + 1;
                sb.append(i2);
                persistableBundle.putPersistableBundle(sb.toString(), this.f33795k[i].toPersistableBundle());
                i = i2;
            }
        }
        LocusIdCompat locusIdCompat = this.f33797m;
        if (locusIdCompat != null) {
            this.f33800p.putString("extraLocusId", locusIdCompat.getId());
        }
        this.f33800p.putBoolean("extraLongLived", this.f33798n);
        return this.f33800p;
    }

    @Nullable
    public ComponentName getActivity() {
        return this.f33789e;
    }

    @Nullable
    public Set<String> getCategories() {
        return this.f33796l;
    }

    @Nullable
    public CharSequence getDisabledMessage() {
        return this.f33792h;
    }

    public int getDisabledReason() {
        return this.f33783A;
    }

    public int getExcludedFromSurfaces() {
        return this.f33784B;
    }

    @Nullable
    public PersistableBundle getExtras() {
        return this.f33800p;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public IconCompat getIcon() {
        return this.f33793i;
    }

    @NonNull
    public String getId() {
        return this.f33786b;
    }

    @NonNull
    public Intent getIntent() {
        Intent[] intentArr = this.f33788d;
        return intentArr[intentArr.length - 1];
    }

    @NonNull
    public Intent[] getIntents() {
        Intent[] intentArr = this.f33788d;
        return (Intent[]) Arrays.copyOf(intentArr, intentArr.length);
    }

    public long getLastChangedTimestamp() {
        return this.f33802r;
    }

    @Nullable
    public LocusIdCompat getLocusId() {
        return this.f33797m;
    }

    @Nullable
    public CharSequence getLongLabel() {
        return this.f33791g;
    }

    @NonNull
    public String getPackage() {
        return this.f33787c;
    }

    public int getRank() {
        return this.f33799o;
    }

    @NonNull
    public CharSequence getShortLabel() {
        return this.f33790f;
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public Bundle getTransientExtras() {
        return this.f33801q;
    }

    @Nullable
    public UserHandle getUserHandle() {
        return this.f33803s;
    }

    public boolean hasKeyFieldsOnly() {
        return this.f33810z;
    }

    public boolean isCached() {
        return this.f33804t;
    }

    public boolean isDeclaredInManifest() {
        return this.f33807w;
    }

    public boolean isDynamic() {
        return this.f33805u;
    }

    public boolean isEnabled() {
        return this.f33809y;
    }

    public boolean isExcludedFromSurfaces(int i) {
        if ((i & this.f33784B) != 0) {
            return true;
        }
        return false;
    }

    public boolean isImmutable() {
        return this.f33808x;
    }

    public boolean isPinned() {
        return this.f33806v;
    }

    @RequiresApi(25)
    public ShortcutInfo toShortcutInfo() {
        ShortcutInfo.Builder shortLabel;
        ShortcutInfo.Builder intents;
        ShortcutInfo build;
        IH1.m67930a();
        shortLabel = HH1.m68110a(this.f33785a, this.f33786b).setShortLabel(this.f33790f);
        intents = shortLabel.setIntents(this.f33788d);
        IconCompat iconCompat = this.f33793i;
        if (iconCompat != null) {
            intents.setIcon(iconCompat.toIcon(this.f33785a));
        }
        if (!TextUtils.isEmpty(this.f33791g)) {
            intents.setLongLabel(this.f33791g);
        }
        if (!TextUtils.isEmpty(this.f33792h)) {
            intents.setDisabledMessage(this.f33792h);
        }
        ComponentName componentName = this.f33789e;
        if (componentName != null) {
            intents.setActivity(componentName);
        }
        Set set = this.f33796l;
        if (set != null) {
            intents.setCategories(set);
        }
        intents.setRank(this.f33799o);
        PersistableBundle persistableBundle = this.f33800p;
        if (persistableBundle != null) {
            intents.setExtras(persistableBundle);
        }
        if (Build.VERSION.SDK_INT < 29) {
            intents.setExtras(m57444b());
        } else {
            Person[] personArr = this.f33795k;
            if (personArr != null && personArr.length > 0) {
                int length = personArr.length;
                android.app.Person[] personArr2 = new android.app.Person[length];
                for (int i = 0; i < length; i++) {
                    personArr2[i] = this.f33795k[i].toAndroidPerson();
                }
                intents.setPersons(personArr2);
            }
            LocusIdCompat locusIdCompat = this.f33797m;
            if (locusIdCompat != null) {
                intents.setLocusId(locusIdCompat.toLocusId());
            }
            intents.setLongLived(this.f33798n);
        }
        if (Build.VERSION.SDK_INT >= 33) {
            C3971a.m57439a(intents, this.f33784B);
        }
        build = intents.build();
        return build;
    }
}
