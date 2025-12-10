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
        public Account f44624a;

        /* renamed from: b */
        public boolean f44625b;

        /* renamed from: c */
        public ArrayList f44626c;

        /* renamed from: d */
        public ArrayList f44627d;

        /* renamed from: e */
        public boolean f44628e;

        /* renamed from: f */
        public String f44629f;

        /* renamed from: g */
        public Bundle f44630g;

        /* renamed from: h */
        public boolean f44631h;

        /* renamed from: i */
        public int f44632i;

        /* renamed from: j */
        public String f44633j;

        /* renamed from: k */
        public boolean f44634k;

        /* renamed from: l */
        public zza f44635l;

        /* renamed from: m */
        public String f44636m;

        /* renamed from: n */
        public boolean f44637n;

        /* renamed from: o */
        public boolean f44638o;

        /* loaded from: classes3.dex */
        public static class Builder {

            /* renamed from: a */
            public Account f44639a;

            /* renamed from: b */
            public ArrayList f44640b;

            /* renamed from: c */
            public ArrayList f44641c;

            /* renamed from: d */
            public boolean f44642d = false;

            /* renamed from: e */
            public String f44643e;

            /* renamed from: f */
            public Bundle f44644f;

            @NonNull
            public AccountChooserOptions build() {
                Preconditions.checkArgument(true, "We only support hostedDomain filter for account chip styled account picker");
                Preconditions.checkArgument(true, "Consent is only valid for account chip styled account picker");
                AccountChooserOptions accountChooserOptions = new AccountChooserOptions();
                accountChooserOptions.f44627d = this.f44641c;
                accountChooserOptions.f44626c = this.f44640b;
                accountChooserOptions.f44628e = this.f44642d;
                accountChooserOptions.f44635l = null;
                accountChooserOptions.f44633j = null;
                accountChooserOptions.f44630g = this.f44644f;
                accountChooserOptions.f44624a = this.f44639a;
                accountChooserOptions.f44625b = false;
                accountChooserOptions.f44631h = false;
                accountChooserOptions.f44636m = null;
                accountChooserOptions.f44632i = 0;
                accountChooserOptions.f44629f = this.f44643e;
                accountChooserOptions.f44634k = false;
                accountChooserOptions.f44637n = false;
                accountChooserOptions.f44638o = false;
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
                this.f44640b = arrayList;
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
                this.f44641c = arrayList;
                return this;
            }

            @NonNull
            @CanIgnoreReturnValue
            public Builder setAlwaysShowAccountPicker(boolean z) {
                this.f44642d = z;
                return this;
            }

            @NonNull
            @CanIgnoreReturnValue
            public Builder setOptionsForAddingAccount(@Nullable Bundle bundle) {
                this.f44644f = bundle;
                return this;
            }

            @NonNull
            @CanIgnoreReturnValue
            public Builder setSelectedAccount(@Nullable Account account) {
                this.f44639a = account;
                return this;
            }

            @NonNull
            @CanIgnoreReturnValue
            public Builder setTitleOverrideText(@Nullable String str) {
                this.f44643e = str;
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
        boolean unused = accountChooserOptions.f44634k;
        String unused2 = accountChooserOptions.f44633j;
        Preconditions.checkArgument(true, "We only support hostedDomain filter for account chip styled account picker");
        zza unused3 = accountChooserOptions.f44635l;
        Preconditions.checkArgument(true, "Consent is only valid for account chip styled account picker");
        boolean unused4 = accountChooserOptions.f44625b;
        Preconditions.checkArgument(true, "Making the selected account non-clickable is only supported for the THEME_DAY_NIGHT_GOOGLE_MATERIAL2, THEME_LIGHT_GOOGLE_MATERIAL3, THEME_DARK_GOOGLE_MATERIAL3 or THEME_DAY_NIGHT_GOOGLE_MATERIAL3 themes");
        boolean unused5 = accountChooserOptions.f44634k;
        intent.setAction("com.google.android.gms.common.account.CHOOSE_ACCOUNT");
        intent.setPackage("com.google.android.gms");
        intent.putExtra("allowableAccounts", accountChooserOptions.f44626c);
        if (accountChooserOptions.f44627d != null) {
            intent.putExtra("allowableAccountTypes", (String[]) accountChooserOptions.f44627d.toArray(new String[0]));
        }
        intent.putExtra("addAccountOptions", accountChooserOptions.f44630g);
        intent.putExtra("selectedAccount", accountChooserOptions.f44624a);
        boolean unused6 = accountChooserOptions.f44625b;
        intent.putExtra("selectedAccountIsNotClickable", false);
        intent.putExtra("alwaysPromptForAccount", accountChooserOptions.f44628e);
        intent.putExtra("descriptionTextOverride", accountChooserOptions.f44629f);
        boolean unused7 = accountChooserOptions.f44631h;
        intent.putExtra("setGmsCoreAccount", false);
        String unused8 = accountChooserOptions.f44636m;
        intent.putExtra("realClientPackage", (String) null);
        int unused9 = accountChooserOptions.f44632i;
        intent.putExtra("overrideTheme", 0);
        boolean unused10 = accountChooserOptions.f44634k;
        intent.putExtra("overrideCustomTheme", 0);
        String unused11 = accountChooserOptions.f44633j;
        intent.putExtra("hostedDomainFilter", (String) null);
        Bundle bundle = new Bundle();
        boolean unused12 = accountChooserOptions.f44634k;
        zza unused13 = accountChooserOptions.f44635l;
        boolean unused14 = accountChooserOptions.f44637n;
        boolean unused15 = accountChooserOptions.f44638o;
        if (!bundle.isEmpty()) {
            intent.putExtra("first_party_options_bundle", bundle);
        }
        return intent;
    }
}
