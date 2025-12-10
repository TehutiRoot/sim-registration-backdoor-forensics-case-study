package com.google.android.gms.common;

import android.accounts.Account;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public final class AccountPicker {

    /* loaded from: classes3.dex */
    public static class AccountChooserOptions {

        /* renamed from: a */
        public Account f44636a;

        /* renamed from: b */
        public boolean f44637b;

        /* renamed from: c */
        public ArrayList f44638c;

        /* renamed from: d */
        public ArrayList f44639d;

        /* renamed from: e */
        public boolean f44640e;

        /* renamed from: f */
        public String f44641f;

        /* renamed from: g */
        public Bundle f44642g;

        /* renamed from: h */
        public boolean f44643h;

        /* renamed from: i */
        public int f44644i;

        /* renamed from: j */
        public String f44645j;

        /* renamed from: k */
        public boolean f44646k;

        /* renamed from: l */
        public zza f44647l;

        /* renamed from: m */
        public String f44648m;

        /* renamed from: n */
        public boolean f44649n;

        /* renamed from: o */
        public boolean f44650o;

        /* loaded from: classes3.dex */
        public static class Builder {

            /* renamed from: a */
            public Account f44651a;

            /* renamed from: b */
            public ArrayList f44652b;

            /* renamed from: c */
            public ArrayList f44653c;

            /* renamed from: d */
            public boolean f44654d = false;

            /* renamed from: e */
            public String f44655e;

            /* renamed from: f */
            public Bundle f44656f;

            @NonNull
            public AccountChooserOptions build() {
                Preconditions.checkArgument(true, "We only support hostedDomain filter for account chip styled account picker");
                Preconditions.checkArgument(true, "Consent is only valid for account chip styled account picker");
                AccountChooserOptions accountChooserOptions = new AccountChooserOptions();
                accountChooserOptions.f44639d = this.f44653c;
                accountChooserOptions.f44638c = this.f44652b;
                accountChooserOptions.f44640e = this.f44654d;
                accountChooserOptions.f44647l = null;
                accountChooserOptions.f44645j = null;
                accountChooserOptions.f44642g = this.f44656f;
                accountChooserOptions.f44636a = this.f44651a;
                accountChooserOptions.f44637b = false;
                accountChooserOptions.f44643h = false;
                accountChooserOptions.f44648m = null;
                accountChooserOptions.f44644i = 0;
                accountChooserOptions.f44641f = this.f44655e;
                accountChooserOptions.f44646k = false;
                accountChooserOptions.f44649n = false;
                accountChooserOptions.f44650o = false;
                return accountChooserOptions;
            }

            @NonNull
            @CanIgnoreReturnValue
            public Builder setAllowableAccounts(@Nullable List<Account> list) {
                ArrayList arrayList;
                if (list == null) {
                    arrayList = null;
                } else {
                    arrayList = new ArrayList(list);
                }
                this.f44652b = arrayList;
                return this;
            }

            @NonNull
            @CanIgnoreReturnValue
            public Builder setAllowableAccountsTypes(@Nullable List<String> list) {
                ArrayList arrayList;
                if (list == null) {
                    arrayList = null;
                } else {
                    arrayList = new ArrayList(list);
                }
                this.f44653c = arrayList;
                return this;
            }

            @NonNull
            @CanIgnoreReturnValue
            public Builder setAlwaysShowAccountPicker(boolean z) {
                this.f44654d = z;
                return this;
            }

            @NonNull
            @CanIgnoreReturnValue
            public Builder setOptionsForAddingAccount(@Nullable Bundle bundle) {
                this.f44656f = bundle;
                return this;
            }

            @NonNull
            @CanIgnoreReturnValue
            public Builder setSelectedAccount(@Nullable Account account) {
                this.f44651a = account;
                return this;
            }

            @NonNull
            @CanIgnoreReturnValue
            public Builder setTitleOverrideText(@Nullable String str) {
                this.f44655e = str;
                return this;
            }
        }
    }

    @NonNull
    @ResultIgnorabilityUnspecified
    @Deprecated
    public static Intent newChooseAccountIntent(@Nullable Account account, @Nullable ArrayList<Account> arrayList, @Nullable String[] strArr, boolean z, @Nullable String str, @Nullable String str2, @Nullable String[] strArr2, @Nullable Bundle bundle) {
        Intent intent = new Intent();
        Preconditions.checkArgument(true, "We only support hostedDomain filter for account chip styled account picker");
        intent.setAction("com.google.android.gms.common.account.CHOOSE_ACCOUNT");
        intent.setPackage("com.google.android.gms");
        intent.putExtra("allowableAccounts", arrayList);
        intent.putExtra("allowableAccountTypes", strArr);
        intent.putExtra("addAccountOptions", bundle);
        intent.putExtra("selectedAccount", account);
        intent.putExtra("alwaysPromptForAccount", z);
        intent.putExtra("descriptionTextOverride", str);
        intent.putExtra("authTokenType", str2);
        intent.putExtra("addAccountRequiredFeatures", strArr2);
        intent.putExtra("setGmsCoreAccount", false);
        intent.putExtra("overrideTheme", 0);
        intent.putExtra("overrideCustomTheme", 0);
        intent.putExtra("hostedDomainFilter", (String) null);
        return intent;
    }

    @NonNull
    public static Intent newChooseAccountIntent(@NonNull AccountChooserOptions accountChooserOptions) {
        Intent intent = new Intent();
        boolean unused = accountChooserOptions.f44646k;
        String unused2 = accountChooserOptions.f44645j;
        Preconditions.checkArgument(true, "We only support hostedDomain filter for account chip styled account picker");
        zza unused3 = accountChooserOptions.f44647l;
        Preconditions.checkArgument(true, "Consent is only valid for account chip styled account picker");
        boolean unused4 = accountChooserOptions.f44637b;
        Preconditions.checkArgument(true, "Making the selected account non-clickable is only supported for the THEME_DAY_NIGHT_GOOGLE_MATERIAL2, THEME_LIGHT_GOOGLE_MATERIAL3, THEME_DARK_GOOGLE_MATERIAL3 or THEME_DAY_NIGHT_GOOGLE_MATERIAL3 themes");
        boolean unused5 = accountChooserOptions.f44646k;
        intent.setAction("com.google.android.gms.common.account.CHOOSE_ACCOUNT");
        intent.setPackage("com.google.android.gms");
        intent.putExtra("allowableAccounts", accountChooserOptions.f44638c);
        if (accountChooserOptions.f44639d != null) {
            intent.putExtra("allowableAccountTypes", (String[]) accountChooserOptions.f44639d.toArray(new String[0]));
        }
        intent.putExtra("addAccountOptions", accountChooserOptions.f44642g);
        intent.putExtra("selectedAccount", accountChooserOptions.f44636a);
        boolean unused6 = accountChooserOptions.f44637b;
        intent.putExtra("selectedAccountIsNotClickable", false);
        intent.putExtra("alwaysPromptForAccount", accountChooserOptions.f44640e);
        intent.putExtra("descriptionTextOverride", accountChooserOptions.f44641f);
        boolean unused7 = accountChooserOptions.f44643h;
        intent.putExtra("setGmsCoreAccount", false);
        String unused8 = accountChooserOptions.f44648m;
        intent.putExtra("realClientPackage", (String) null);
        int unused9 = accountChooserOptions.f44644i;
        intent.putExtra("overrideTheme", 0);
        boolean unused10 = accountChooserOptions.f44646k;
        intent.putExtra("overrideCustomTheme", 0);
        String unused11 = accountChooserOptions.f44645j;
        intent.putExtra("hostedDomainFilter", (String) null);
        Bundle bundle = new Bundle();
        boolean unused12 = accountChooserOptions.f44646k;
        zza unused13 = accountChooserOptions.f44647l;
        boolean unused14 = accountChooserOptions.f44649n;
        boolean unused15 = accountChooserOptions.f44650o;
        if (!bundle.isEmpty()) {
            intent.putExtra("first_party_options_bundle", bundle);
        }
        return intent;
    }
}