package androidx.core.app;

import android.app.Person;
import android.graphics.drawable.Icon;
import android.os.Bundle;
import android.os.PersistableBundle;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.core.graphics.drawable.IconCompat;
import ch.qos.logback.core.joran.action.Action;

/* loaded from: classes2.dex */
public class Person {

    /* renamed from: a */
    public CharSequence f33679a;

    /* renamed from: b */
    public IconCompat f33680b;

    /* renamed from: c */
    public String f33681c;

    /* renamed from: d */
    public String f33682d;

    /* renamed from: e */
    public boolean f33683e;

    /* renamed from: f */
    public boolean f33684f;

    /* loaded from: classes2.dex */
    public static class Builder {

        /* renamed from: a */
        public CharSequence f33685a;

        /* renamed from: b */
        public IconCompat f33686b;

        /* renamed from: c */
        public String f33687c;

        /* renamed from: d */
        public String f33688d;

        /* renamed from: e */
        public boolean f33689e;

        /* renamed from: f */
        public boolean f33690f;

        public Builder() {
        }

        @NonNull
        public Person build() {
            return new Person(this);
        }

        @NonNull
        public Builder setBot(boolean z) {
            this.f33689e = z;
            return this;
        }

        @NonNull
        public Builder setIcon(@Nullable IconCompat iconCompat) {
            this.f33686b = iconCompat;
            return this;
        }

        @NonNull
        public Builder setImportant(boolean z) {
            this.f33690f = z;
            return this;
        }

        @NonNull
        public Builder setKey(@Nullable String str) {
            this.f33688d = str;
            return this;
        }

        @NonNull
        public Builder setName(@Nullable CharSequence charSequence) {
            this.f33685a = charSequence;
            return this;
        }

        @NonNull
        public Builder setUri(@Nullable String str) {
            this.f33687c = str;
            return this;
        }

        public Builder(Person person) {
            this.f33685a = person.f33679a;
            this.f33686b = person.f33680b;
            this.f33687c = person.f33681c;
            this.f33688d = person.f33682d;
            this.f33689e = person.f33683e;
            this.f33690f = person.f33684f;
        }
    }

    /* renamed from: androidx.core.app.Person$a */
    /* loaded from: classes2.dex */
    public static class C3917a {
        @DoNotInline
        /* renamed from: a */
        public static Person m57660a(PersistableBundle persistableBundle) {
            return new Builder().setName(persistableBundle.getString("name")).setUri(persistableBundle.getString("uri")).setKey(persistableBundle.getString(Action.KEY_ATTRIBUTE)).setBot(persistableBundle.getBoolean("isBot")).setImportant(persistableBundle.getBoolean("isImportant")).build();
        }

        @DoNotInline
        /* renamed from: b */
        public static PersistableBundle m57659b(Person person) {
            String str;
            PersistableBundle persistableBundle = new PersistableBundle();
            CharSequence charSequence = person.f33679a;
            if (charSequence != null) {
                str = charSequence.toString();
            } else {
                str = null;
            }
            persistableBundle.putString("name", str);
            persistableBundle.putString("uri", person.f33681c);
            persistableBundle.putString(Action.KEY_ATTRIBUTE, person.f33682d);
            persistableBundle.putBoolean("isBot", person.f33683e);
            persistableBundle.putBoolean("isImportant", person.f33684f);
            return persistableBundle;
        }
    }

    /* renamed from: androidx.core.app.Person$b */
    /* loaded from: classes2.dex */
    public static class C3918b {
        @DoNotInline
        /* renamed from: a */
        public static Person m57658a(android.app.Person person) {
            IconCompat iconCompat;
            Builder name = new Builder().setName(person.getName());
            if (person.getIcon() != null) {
                iconCompat = IconCompat.createFromIcon(person.getIcon());
            } else {
                iconCompat = null;
            }
            return name.setIcon(iconCompat).setUri(person.getUri()).setKey(person.getKey()).setBot(person.isBot()).setImportant(person.isImportant()).build();
        }

        @DoNotInline
        /* renamed from: b */
        public static android.app.Person m57657b(Person person) {
            Icon icon;
            Person.Builder name = new Person.Builder().setName(person.getName());
            if (person.getIcon() != null) {
                icon = person.getIcon().toIcon();
            } else {
                icon = null;
            }
            return name.setIcon(icon).setUri(person.getUri()).setKey(person.getKey()).setBot(person.isBot()).setImportant(person.isImportant()).build();
        }
    }

    public Person(Builder builder) {
        this.f33679a = builder.f33685a;
        this.f33680b = builder.f33686b;
        this.f33681c = builder.f33687c;
        this.f33682d = builder.f33688d;
        this.f33683e = builder.f33689e;
        this.f33684f = builder.f33690f;
    }

    @NonNull
    @RequiresApi(28)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static Person fromAndroidPerson(@NonNull android.app.Person person) {
        return C3918b.m57658a(person);
    }

    @NonNull
    public static Person fromBundle(@NonNull Bundle bundle) {
        IconCompat iconCompat;
        Bundle bundle2 = bundle.getBundle("icon");
        Builder name = new Builder().setName(bundle.getCharSequence("name"));
        if (bundle2 != null) {
            iconCompat = IconCompat.createFromBundle(bundle2);
        } else {
            iconCompat = null;
        }
        return name.setIcon(iconCompat).setUri(bundle.getString("uri")).setKey(bundle.getString(Action.KEY_ATTRIBUTE)).setBot(bundle.getBoolean("isBot")).setImportant(bundle.getBoolean("isImportant")).build();
    }

    @NonNull
    @RequiresApi(22)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static Person fromPersistableBundle(@NonNull PersistableBundle persistableBundle) {
        return C3917a.m57660a(persistableBundle);
    }

    @Nullable
    public IconCompat getIcon() {
        return this.f33680b;
    }

    @Nullable
    public String getKey() {
        return this.f33682d;
    }

    @Nullable
    public CharSequence getName() {
        return this.f33679a;
    }

    @Nullable
    public String getUri() {
        return this.f33681c;
    }

    public boolean isBot() {
        return this.f33683e;
    }

    public boolean isImportant() {
        return this.f33684f;
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public String resolveToLegacyUri() {
        String str = this.f33681c;
        if (str != null) {
            return str;
        }
        if (this.f33679a != null) {
            return "name:" + ((Object) this.f33679a);
        }
        return "";
    }

    @NonNull
    @RequiresApi(28)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public android.app.Person toAndroidPerson() {
        return C3918b.m57657b(this);
    }

    @NonNull
    public Builder toBuilder() {
        return new Builder(this);
    }

    @NonNull
    public Bundle toBundle() {
        Bundle bundle;
        Bundle bundle2 = new Bundle();
        bundle2.putCharSequence("name", this.f33679a);
        IconCompat iconCompat = this.f33680b;
        if (iconCompat != null) {
            bundle = iconCompat.toBundle();
        } else {
            bundle = null;
        }
        bundle2.putBundle("icon", bundle);
        bundle2.putString("uri", this.f33681c);
        bundle2.putString(Action.KEY_ATTRIBUTE, this.f33682d);
        bundle2.putBoolean("isBot", this.f33683e);
        bundle2.putBoolean("isImportant", this.f33684f);
        return bundle2;
    }

    @NonNull
    @RequiresApi(22)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public PersistableBundle toPersistableBundle() {
        return C3917a.m57659b(this);
    }
}
