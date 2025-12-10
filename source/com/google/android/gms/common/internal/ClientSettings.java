package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.content.Context;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.collection.ArraySet;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.signin.SignInOptions;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import javax.annotation.Nullable;

@KeepForSdk
/* loaded from: classes3.dex */
public final class ClientSettings {

    /* renamed from: a */
    public final Account f45051a;

    /* renamed from: b */
    public final Set f45052b;

    /* renamed from: c */
    public final Set f45053c;

    /* renamed from: d */
    public final Map f45054d;

    /* renamed from: e */
    public final int f45055e;

    /* renamed from: f */
    public final View f45056f;

    /* renamed from: g */
    public final String f45057g;

    /* renamed from: h */
    public final String f45058h;

    /* renamed from: i */
    public final SignInOptions f45059i;

    /* renamed from: j */
    public Integer f45060j;

    @KeepForSdk
    /* loaded from: classes3.dex */
    public static final class Builder {

        /* renamed from: a */
        public Account f45061a;

        /* renamed from: b */
        public ArraySet f45062b;

        /* renamed from: c */
        public String f45063c;

        /* renamed from: d */
        public String f45064d;

        /* renamed from: e */
        public final SignInOptions f45065e = SignInOptions.zaa;

        @NonNull
        @KeepForSdk
        public ClientSettings build() {
            return new ClientSettings(this.f45061a, this.f45062b, null, 0, null, this.f45063c, this.f45064d, this.f45065e, false);
        }

        @NonNull
        @CanIgnoreReturnValue
        @KeepForSdk
        public Builder setRealClientPackageName(@NonNull String str) {
            this.f45063c = str;
            return this;
        }

        @NonNull
        @CanIgnoreReturnValue
        public final Builder zaa(@NonNull Collection collection) {
            if (this.f45062b == null) {
                this.f45062b = new ArraySet();
            }
            this.f45062b.addAll(collection);
            return this;
        }

        @NonNull
        @CanIgnoreReturnValue
        public final Builder zab(@Nullable Account account) {
            this.f45061a = account;
            return this;
        }

        @NonNull
        @CanIgnoreReturnValue
        public final Builder zac(@NonNull String str) {
            this.f45064d = str;
            return this;
        }
    }

    @KeepForSdk
    public ClientSettings(@NonNull Account account, @NonNull Set<Scope> set, @NonNull Map<Api<?>, zab> map, int i, @Nullable View view, @NonNull String str, @NonNull String str2, @Nullable SignInOptions signInOptions) {
        this(account, set, map, i, view, str, str2, signInOptions, false);
    }

    @NonNull
    @KeepForSdk
    public static ClientSettings createDefault(@NonNull Context context) {
        return new GoogleApiClient.Builder(context).zaa();
    }

    @androidx.annotation.Nullable
    @KeepForSdk
    public Account getAccount() {
        return this.f45051a;
    }

    @androidx.annotation.Nullable
    @KeepForSdk
    @Deprecated
    public String getAccountName() {
        Account account = this.f45051a;
        if (account != null) {
            return account.name;
        }
        return null;
    }

    @NonNull
    @KeepForSdk
    public Account getAccountOrDefault() {
        Account account = this.f45051a;
        if (account != null) {
            return account;
        }
        return new Account("<<default account>>", "com.google");
    }

    @NonNull
    @KeepForSdk
    public Set<Scope> getAllRequestedScopes() {
        return this.f45053c;
    }

    @NonNull
    @KeepForSdk
    public Set<Scope> getApplicableScopes(@NonNull Api<?> api) {
        zab zabVar = (zab) this.f45054d.get(api);
        if (zabVar != null && !zabVar.zaa.isEmpty()) {
            HashSet hashSet = new HashSet(this.f45052b);
            hashSet.addAll(zabVar.zaa);
            return hashSet;
        }
        return this.f45052b;
    }

    @KeepForSdk
    public int getGravityForPopups() {
        return this.f45055e;
    }

    @NonNull
    @KeepForSdk
    public String getRealClientPackageName() {
        return this.f45057g;
    }

    @NonNull
    @KeepForSdk
    public Set<Scope> getRequiredScopes() {
        return this.f45052b;
    }

    @androidx.annotation.Nullable
    @KeepForSdk
    public View getViewForPopups() {
        return this.f45056f;
    }

    @NonNull
    public final SignInOptions zaa() {
        return this.f45059i;
    }

    @androidx.annotation.Nullable
    public final Integer zab() {
        return this.f45060j;
    }

    @androidx.annotation.Nullable
    public final String zac() {
        return this.f45058h;
    }

    @NonNull
    public final Map zad() {
        return this.f45054d;
    }

    public final void zae(@NonNull Integer num) {
        this.f45060j = num;
    }

    public ClientSettings(@Nullable Account account, @NonNull Set set, @NonNull Map map, int i, @Nullable View view, @NonNull String str, @NonNull String str2, @Nullable SignInOptions signInOptions, boolean z) {
        this.f45051a = account;
        Set emptySet = set == null ? Collections.emptySet() : Collections.unmodifiableSet(set);
        this.f45052b = emptySet;
        map = map == null ? Collections.emptyMap() : map;
        this.f45054d = map;
        this.f45056f = view;
        this.f45055e = i;
        this.f45057g = str;
        this.f45058h = str2;
        this.f45059i = signInOptions == null ? SignInOptions.zaa : signInOptions;
        HashSet hashSet = new HashSet(emptySet);
        for (zab zabVar : map.values()) {
            hashSet.addAll(zabVar.zaa);
        }
        this.f45053c = Collections.unmodifiableSet(hashSet);
    }
}
